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
public String _connectivity_check_url = "";
public String _app_version = "";
public String _icon_play = "";
public String _icon_stop = "";
public String _icon_more = "";
public String _icon_close = "";
public int _prefetch_seconds = 0;
public int _stop_fade_ms = 0;
public int _orbit_fade_ms = 0;
public int _track_overlap_ms = 0;
public int _ad_tail_overlap_ms = 0;
public int _history_log_delay_ms = 0;
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
public anywheresoftware.b4a.objects.collections.Map _storage = null;
public anywheresoftware.b4a.objects.collections.List _playqueue = null;
public anywheresoftware.b4a.objects.collections.Map _messages = null;
public anywheresoftware.b4a.objects.collections.List _tracelogs = null;
public int _traceloglimit = 0;
public anywheresoftware.b4a.objects.collections.List _serversnapshots = null;
public int _serversnapshotlimit = 0;
public anywheresoftware.b4a.objects.Timer _retrytimer = null;
public anywheresoftware.b4a.objects.Timer _breaktimer = null;
public anywheresoftware.b4a.objects.Timer _historytimer = null;
public anywheresoftware.b4a.objects.Timer _orbittimer = null;
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
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _activateloadeditem(b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _fadeinms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "activateloadeditem", false))
	 {return ((String) Debug.delegate(ba, "activateloadeditem", new Object[] {_audiokey,_item,_fadeinms}));}
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Private Sub ActivateLoadedItem(audioKey As String,";
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="activeAudioKey = audioKey";
__ref._activeaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="activeItem = CloneMap(item)";
__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item);
RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="currentTrackUrl = MediaUrl(item)";
__ref._currenttrackurl /*String*/  = __ref._mediaurl /*String*/ (null,_item);
RDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="currentMediaType = item.GetDefault(\"type\", \"\")";
__ref._currentmediatype /*String*/  = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=23134213;
 //BA.debugLineNum = 23134213;BA.debugLine="isCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = __c.False;
RDebugUtils.currentLine=23134214;
 //BA.debugLineNum = 23134214;BA.debugLine="If preparedAudioKey = audioKey Then";
if ((__ref._preparedaudiokey /*String*/ ).equals(_audiokey)) { 
RDebugUtils.currentLine=23134215;
 //BA.debugLineNum = 23134215;BA.debugLine="preparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=23134216;
 //BA.debugLineNum = 23134216;BA.debugLine="preparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=23134218;
 //BA.debugLineNum = 23134218;BA.debugLine="UpdatePlaybackMeta(item)";
__ref._updateplaybackmeta /*String*/ (null,_item);
RDebugUtils.currentLine=23134219;
 //BA.debugLineNum = 23134219;BA.debugLine="TraceLog(\"ActivateLoadedItem. audio=\" & audioKey";
__ref._tracelog /*String*/ (null,"ActivateLoadedItem. audio="+_audiokey+", item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject()))+", fadeInMs="+BA.NumberToString(_fadeinms));
RDebugUtils.currentLine=23134220;
 //BA.debugLineNum = 23134220;BA.debugLine="GetAudioByKey(audioKey).PlayWithFade(fadeInMs)";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_audiokey)._playwithfade /*String*/ (null,_fadeinms);
RDebugUtils.currentLine=23134221;
 //BA.debugLineNum = 23134221;BA.debugLine="ScheduleHistoryLog(item)";
__ref._schedulehistorylog /*String*/ (null,_item);
RDebugUtils.currentLine=23134222;
 //BA.debugLineNum = 23134222;BA.debugLine="ResetRetryDelay";
__ref._resetretrydelay /*String*/ (null);
RDebugUtils.currentLine=23134223;
 //BA.debugLineNum = 23134223;BA.debugLine="prefetchDone = False";
__ref._prefetchdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=23134224;
 //BA.debugLineNum = 23134224;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=24248321;
 //BA.debugLineNum = 24248321;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
RDebugUtils.currentLine=24248324;
 //BA.debugLineNum = 24248324;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=24248325;
 //BA.debugLineNum = 24248325;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=24248327;
 //BA.debugLineNum = 24248327;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
RDebugUtils.currentLine=24248328;
 //BA.debugLineNum = 24248328;BA.debugLine="End Sub";
return null;
}
public String  _mediaurl(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "mediaurl", false))
	 {return ((String) Debug.delegate(ba, "mediaurl", new Object[] {_item}));}
String _id = "";
String _first = "";
String _folder = "";
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub MediaUrl(item As Map) As String";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Dim id As String = item.GetDefault(\"id\", \"\")";
_id = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="If id = \"\" Then Return \"\"";
if ((_id).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="Dim first As String = id.SubString2(0, 1)";
_first = _id.substring((int) (0),(int) (1));
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="Dim folder As String";
_folder = "";
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"ad\" Then";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="folder = \"ads\"";
_folder = "ads";
 }else {
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="folder = \"tracks\"";
_folder = "tracks";
 };
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="Return \"https://cdn.fon.fm/media/\" & folder & \"/\"";
if (true) return "https://cdn.fon.fm/media/"+_folder+"/"+_first+"/"+_id+".mp3";
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="End Sub";
return "";
}
public String  _updateplaybackmeta(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updateplaybackmeta", false))
	 {return ((String) Debug.delegate(ba, "updateplaybackmeta", new Object[] {_item}));}
String _itemtype = "";
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Private Sub UpdatePlaybackMeta(item As Map)";
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="ShowAdMeta(item)";
__ref._showadmeta /*String*/ (null,_item);
RDebugUtils.currentLine=23068676;
 //BA.debugLineNum = 23068676;BA.debugLine="ShowStream(MessageValue(\"ad_label\"))";
__ref._showstream /*String*/ (null,__ref._messagevalue /*String*/ (null,"ad_label"));
 }else {
RDebugUtils.currentLine=23068678;
 //BA.debugLineNum = 23068678;BA.debugLine="ShowTrackMeta(item)";
__ref._showtrackmeta /*String*/ (null,_item);
RDebugUtils.currentLine=23068679;
 //BA.debugLineNum = 23068679;BA.debugLine="ShowStream(item.GetDefault(\"stream\", \"\"))";
__ref._showstream /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("stream"),(Object)(""))));
RDebugUtils.currentLine=23068680;
 //BA.debugLineNum = 23068680;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
 };
RDebugUtils.currentLine=23068682;
 //BA.debugLineNum = 23068682;BA.debugLine="End Sub";
return "";
}
public String  _tracelog(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tracelog", false))
	 {return ((String) Debug.delegate(ba, "tracelog", new Object[] {_message}));}
String _entry = "";
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Public Sub TraceLog(message As String)";
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="If traceLogs.IsInitialized = False Then traceLogs";
if (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="Dim entry As String = DateTime.Date(DateTime.Now)";
_entry = __c.DateTime.Date(__c.DateTime.getNow())+" "+__c.DateTime.Time(__c.DateTime.getNow())+" | "+_message;
RDebugUtils.currentLine=25821187;
 //BA.debugLineNum = 25821187;BA.debugLine="traceLogs.Add(entry)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry));
RDebugUtils.currentLine=25821188;
 //BA.debugLineNum = 25821188;BA.debugLine="Do While traceLogs.Size > traceLogLimit";
while (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._traceloglimit /*int*/ ) {
RDebugUtils.currentLine=25821189;
 //BA.debugLineNum = 25821189;BA.debugLine="traceLogs.RemoveAt(0)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=25821191;
 //BA.debugLineNum = 25821191;BA.debugLine="Log(entry)";
__c.LogImpl("825821191",_entry,0);
RDebugUtils.currentLine=25821192;
 //BA.debugLineNum = 25821192;BA.debugLine="End Sub";
return "";
}
public String  _describeitem(b4j.example.b4xmainpage __ref,Object _itemobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "describeitem", false))
	 {return ((String) Debug.delegate(ba, "describeitem", new Object[] {_itemobj}));}
anywheresoftware.b4a.objects.collections.Map _item = null;
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Private Sub DescribeItem(itemObj As Object) As Str";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="If itemObj Is Map Then";
if (_itemobj instanceof java.util.Map) { 
 }else {
RDebugUtils.currentLine=26017795;
 //BA.debugLineNum = 26017795;BA.debugLine="Return \"<empty>\"";
if (true) return "<empty>";
 };
RDebugUtils.currentLine=26017797;
 //BA.debugLineNum = 26017797;BA.debugLine="Dim item As Map = itemObj";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobj));
RDebugUtils.currentLine=26017798;
 //BA.debugLineNum = 26017798;BA.debugLine="If item.IsInitialized = False Then Return \"<empty";
if (_item.IsInitialized()==__c.False) { 
if (true) return "<empty>";};
RDebugUtils.currentLine=26017799;
 //BA.debugLineNum = 26017799;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=26017800;
 //BA.debugLineNum = 26017800;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=26017801;
 //BA.debugLineNum = 26017801;BA.debugLine="parts.Add(\"тип=\" & item.GetDefault(\"type\", \"\"))";
_parts.Add((Object)("тип="+BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")))));
RDebugUtils.currentLine=26017802;
 //BA.debugLineNum = 26017802;BA.debugLine="If item.GetDefault(\"id\", \"\") <> \"\" Then parts.Add";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("id="+BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")))));};
RDebugUtils.currentLine=26017803;
 //BA.debugLineNum = 26017803;BA.debugLine="If item.GetDefault(\"title\", \"\") <> \"\" Then parts.";
if ((_item.GetDefault((Object)("title"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("название="+BA.ObjectToString(_item.GetDefault((Object)("title"),(Object)("")))));};
RDebugUtils.currentLine=26017804;
 //BA.debugLineNum = 26017804;BA.debugLine="If item.GetDefault(\"stream\", \"\") <> \"\" Then parts";
if ((_item.GetDefault((Object)("stream"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("поток="+BA.ObjectToString(_item.GetDefault((Object)("stream"),(Object)("")))));};
RDebugUtils.currentLine=26017805;
 //BA.debugLineNum = 26017805;BA.debugLine="If item.GetDefault(\"set\", \"\") <> \"\" Then parts.Ad";
if ((_item.GetDefault((Object)("set"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("сет="+BA.ObjectToString(_item.GetDefault((Object)("set"),(Object)("")))));};
RDebugUtils.currentLine=26017806;
 //BA.debugLineNum = 26017806;BA.debugLine="If item.GetDefault(\"code\", \"\") <> \"\" Then parts.A";
if ((_item.GetDefault((Object)("code"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("код="+BA.ObjectToString(_item.GetDefault((Object)("code"),(Object)("")))));};
RDebugUtils.currentLine=26017807;
 //BA.debugLineNum = 26017807;BA.debugLine="Return JoinList(parts, \", \")";
if (true) return __ref._joinlist /*String*/ (null,_parts,", ");
RDebugUtils.currentLine=26017808;
 //BA.debugLineNum = 26017808;BA.debugLine="End Sub";
return "";
}
public b4j.example.audioplayer  _getaudiobykey(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getaudiobykey", false))
	 {return ((b4j.example.audioplayer) Debug.delegate(ba, "getaudiobykey", new Object[] {_audiokey}));}
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Private Sub GetAudioByKey(audioKey As String) As A";
RDebugUtils.currentLine=22675457;
 //BA.debugLineNum = 22675457;BA.debugLine="If audioKey = \"secondary\" Then Return audioSecond";
if ((_audiokey).equals("secondary")) { 
if (true) return __ref._audiosecondary /*b4j.example.audioplayer*/ ;};
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="Return audioPrimary";
if (true) return __ref._audioprimary /*b4j.example.audioplayer*/ ;
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="End Sub";
return null;
}
public String  _schedulehistorylog(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "schedulehistorylog", false))
	 {return ((String) Debug.delegate(ba, "schedulehistorylog", new Object[] {_item}));}
String _itemtype = "";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Private Sub ScheduleHistoryLog(item As Map)";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="If itemType <> \"track\" And itemType <> \"ad\" Then";
if ((_itemtype).equals("track") == false && (_itemtype).equals("ad") == false) { 
if (true) return "";};
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="TraceLog(\"ScheduleHistoryLog. item=\" & DescribeIt";
__ref._tracelog /*String*/ (null,"ScheduleHistoryLog. item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject()))+", delayMs="+BA.NumberToString(__ref._history_log_delay_ms /*int*/ ));
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="historyItem = item";
__ref._historyitem /*anywheresoftware.b4a.objects.collections.Map*/  = _item;
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="historyTimer.Interval = HISTORY_LOG_DELAY_MS";
__ref._historytimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._history_log_delay_ms /*int*/ ));
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="historyTimer.Enabled = True";
__ref._historytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="End Sub";
return "";
}
public String  _resetretrydelay(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resetretrydelay", false))
	 {return ((String) Debug.delegate(ba, "resetretrydelay", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub ResetRetryDelay";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="offlineRetryDelay = OFFLINE_RETRY_DELAY_INITIAL";
__ref._offlineretrydelay /*int*/  = __ref._offline_retry_delay_initial /*int*/ ;
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="serverRetryDelay = SERVER_RETRY_DELAY_INITIAL";
__ref._serverretrydelay /*int*/  = __ref._server_retry_delay_initial /*int*/ ;
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return "";
}
public String  _applymaterialiconfont(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,float _fontsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "applymaterialiconfont", false))
	 {return ((String) Debug.delegate(ba, "applymaterialiconfont", new Object[] {_view,_fontsize}));}
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Private Sub ApplyMaterialIconFont(view As B4XView,";
RDebugUtils.currentLine=24969217;
 //BA.debugLineNum = 24969217;BA.debugLine="view.Font = xui.CreateMaterialIcons(fontSize)";
_view.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(_fontsize));
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Private Sub ApplyOrbitFrame(stepIndex As Int)";
RDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="Dim opacity As Double";
_opacity = 0;
RDebugUtils.currentLine=25231362;
 //BA.debugLineNum = 25231362;BA.debugLine="If orbitFadeValue <= 0 Then";
if (__ref._orbitfadevalue /*double*/ <=0) { 
RDebugUtils.currentLine=25231363;
 //BA.debugLineNum = 25231363;BA.debugLine="opacity = 0";
_opacity = 0;
 }else {
RDebugUtils.currentLine=25231365;
 //BA.debugLineNum = 25231365;BA.debugLine="Dim basePhase As Double = stepIndex / 24";
_basephase = _stepindex/(double)24;
RDebugUtils.currentLine=25231366;
 //BA.debugLineNum = 25231366;BA.debugLine="Dim wave As Double = (Sin(basePhase * cPI * 2) +";
_wave = (__c.Sin(_basephase*__c.cPI*2)+1)/(double)2;
RDebugUtils.currentLine=25231367;
 //BA.debugLineNum = 25231367;BA.debugLine="opacity = (0.38 + wave * 0.28) * orbitFadeValue";
_opacity = (0.38+_wave*0.28)*__ref._orbitfadevalue /*double*/ ;
 };
RDebugUtils.currentLine=25231369;
 //BA.debugLineNum = 25231369;BA.debugLine="ApplyOrbitState(opacity)";
__ref._applyorbitstate /*String*/ (null,_opacity);
RDebugUtils.currentLine=25231370;
 //BA.debugLineNum = 25231370;BA.debugLine="End Sub";
return "";
}
public String  _applyorbitstate(b4j.example.b4xmainpage __ref,double _opacity) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "applyorbitstate", false))
	 {return ((String) Debug.delegate(ba, "applyorbitstate", new Object[] {_opacity}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Private Sub ApplyOrbitState(opacity As Double)";
RDebugUtils.currentLine=25559041;
 //BA.debugLineNum = 25559041;BA.debugLine="Dim jo As JavaObject = orbitPane";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="jo.RunMethod(\"setOpacity\", Array As Object(opacit";
_jo.RunMethod("setOpacity",new Object[]{(Object)(_opacity)});
RDebugUtils.currentLine=25559043;
 //BA.debugLineNum = 25559043;BA.debugLine="End Sub";
return "";
}
public String  _applystoppedstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "applystoppedstate", false))
	 {return ((String) Debug.delegate(ba, "applystoppedstate", null));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Private Sub ApplyStoppedState";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="ShowStream(MessageValue(\"idle_stream\"))";
__ref._showstream /*String*/ (null,__ref._messagevalue /*String*/ (null,"idle_stream"));
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="End Sub";
return "";
}
public String  _showstream(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showstream", false))
	 {return ((String) Debug.delegate(ba, "showstream", new Object[] {_text}));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Private Sub ShowStream(text As String)";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="SetStreamText(text)";
__ref._setstreamtext /*String*/ (null,_text);
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return "";
}
public String  _messagevalue(b4j.example.b4xmainpage __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "messagevalue", false))
	 {return ((String) Debug.delegate(ba, "messagevalue", new Object[] {_key}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub MessageValue(key As String) As String";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Return messages.GetDefault(key, \"\")";
if (true) return BA.ObjectToString(__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_key),(Object)("")));
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="End Sub";
return "";
}
public String  _setstatustext(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setstatustext", false))
	 {return ((String) Debug.delegate(ba, "setstatustext", new Object[] {_text}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Private Sub SetStatusText(text As String)";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="lblInfo.Text = text";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_complete(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioprimary_complete", false))
	 {return ((String) Debug.delegate(ba, "audioprimary_complete", null));}
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Private Sub AudioPrimary_Complete";
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="HandleAudioComplete(\"primary\")";
__ref._handleaudiocomplete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"primary");
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="If isStoppedByUser Then Return False";
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
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="If audioKey <> activeAudioKey Then Return False";
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
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="TraceLog(\"Аудио завершилось. audio=\" & audioKey &";
__ref._tracelog /*String*/ (null,"Аудио завершилось. audio="+_audiokey+", элемент="+__ref._describeitem /*String*/ (null,(Object)(__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())));
RDebugUtils.currentLine=24117252;
 //BA.debugLineNum = 24117252;BA.debugLine="If PromotePreparedPlayer(0, 0) Then Return True";
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
RDebugUtils.currentLine=24117253;
 //BA.debugLineNum = 24117253;BA.debugLine="Wait For (PlayPreparedOrLoadNext) Complete (unuse";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudiocomplete"), __ref._playpreparedorloadnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 19;
return;
case 19:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=24117254;
 //BA.debugLineNum = 24117254;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=24117255;
 //BA.debugLineNum = 24117255;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Private Sub AudioPrimary_Error(message As String)";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="HandleAudioError(\"primary\", message)";
__ref._handleaudioerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"primary",_message);
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="TraceLog(\"Ошибка аудио. audio=\" & audioKey & \", m";
__ref._tracelog /*String*/ (null,"Ошибка аудио. audio="+_audiokey+", message="+_message);
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="If pendingPlayAudioKey = audioKey Then";
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
RDebugUtils.currentLine=24051715;
 //BA.debugLineNum = 24051715;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=24051716;
 //BA.debugLineNum = 24051716;BA.debugLine="CallSubDelayed2(Me, \"PlaybackStartDone\", CreateM";
parent.__c.CallSubDelayed2(ba,parent,"PlaybackStartDone",(Object)(parent.__c.createMap(new Object[] {(Object)("Success"),(Object)(parent.__c.False),(Object)("Message"),(Object)(_message)})));
RDebugUtils.currentLine=24051717;
 //BA.debugLineNum = 24051717;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=24051719;
 //BA.debugLineNum = 24051719;BA.debugLine="If pendingPrepareAudioKey = audioKey Then";

case 4:
//if
this.state = 7;
if ((__ref._pendingprepareaudiokey /*String*/ ).equals(_audiokey)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=24051720;
 //BA.debugLineNum = 24051720;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=24051721;
 //BA.debugLineNum = 24051721;BA.debugLine="CallSubDelayed2(Me, \"PreloadDone\", CreateMap(\"Su";
parent.__c.CallSubDelayed2(ba,parent,"PreloadDone",(Object)(parent.__c.createMap(new Object[] {(Object)("Success"),(Object)(parent.__c.False),(Object)("Message"),(Object)(_message)})));
RDebugUtils.currentLine=24051722;
 //BA.debugLineNum = 24051722;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=24051724;
 //BA.debugLineNum = 24051724;BA.debugLine="If audioKey <> activeAudioKey Then Return False";

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
RDebugUtils.currentLine=24051725;
 //BA.debugLineNum = 24051725;BA.debugLine="If isStoppedByUser Or isStopping Then Return Fals";
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
RDebugUtils.currentLine=24051726;
 //BA.debugLineNum = 24051726;BA.debugLine="Wait For (HandleMediaError) Complete (unused As B";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudioerror"), __ref._handlemediaerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 19;
return;
case 19:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=24051727;
 //BA.debugLineNum = 24051727;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=24051728;
 //BA.debugLineNum = 24051728;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Private Sub AudioPrimary_Ready";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="HandleAudioReady(\"primary\")";
__ref._handleaudioready /*String*/ (null,"primary");
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="End Sub";
return "";
}
public String  _handleaudioready(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleaudioready", false))
	 {return ((String) Debug.delegate(ba, "handleaudioready", new Object[] {_audiokey}));}
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Private Sub HandleAudioReady(audioKey As String)";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="TraceLog(\"Аудио готово. audio=\" & audioKey)";
__ref._tracelog /*String*/ (null,"Аудио готово. audio="+_audiokey);
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="If pendingPlayAudioKey = audioKey Then";
if ((__ref._pendingplayaudiokey /*String*/ ).equals(_audiokey)) { 
RDebugUtils.currentLine=23986179;
 //BA.debugLineNum = 23986179;BA.debugLine="ActivateLoadedItem(audioKey, pendingPlayItem, pe";
__ref._activateloadeditem /*String*/ (null,_audiokey,__ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._pendingplayfadeinms /*int*/ );
RDebugUtils.currentLine=23986180;
 //BA.debugLineNum = 23986180;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=23986181;
 //BA.debugLineNum = 23986181;BA.debugLine="CallSubDelayed2(Me, \"PlaybackStartDone\", CreateM";
__c.CallSubDelayed2(ba,this,"PlaybackStartDone",(Object)(__c.createMap(new Object[] {(Object)("Success"),(Object)(__c.True)})));
RDebugUtils.currentLine=23986182;
 //BA.debugLineNum = 23986182;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=23986184;
 //BA.debugLineNum = 23986184;BA.debugLine="If pendingPrepareAudioKey = audioKey Then";
if ((__ref._pendingprepareaudiokey /*String*/ ).equals(_audiokey)) { 
RDebugUtils.currentLine=23986185;
 //BA.debugLineNum = 23986185;BA.debugLine="preparedAudioKey = audioKey";
__ref._preparedaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=23986186;
 //BA.debugLineNum = 23986186;BA.debugLine="preparedItem = CloneMap(pendingPrepareItem)";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=23986187;
 //BA.debugLineNum = 23986187;BA.debugLine="pendingPrepareAudioKey = \"\"";
__ref._pendingprepareaudiokey /*String*/  = "";
RDebugUtils.currentLine=23986188;
 //BA.debugLineNum = 23986188;BA.debugLine="pendingPrepareItem.Initialize";
__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=23986189;
 //BA.debugLineNum = 23986189;BA.debugLine="CallSubDelayed2(Me, \"PreloadDone\", CreateMap(\"Su";
__c.CallSubDelayed2(ba,this,"PreloadDone",(Object)(__c.createMap(new Object[] {(Object)("Success"),(Object)(__c.True)})));
 };
RDebugUtils.currentLine=23986191;
 //BA.debugLineNum = 23986191;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_timeupdate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioprimary_timeupdate", false))
	 {return ((String) Debug.delegate(ba, "audioprimary_timeupdate", null));}
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Private Sub AudioPrimary_Timeupdate";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="HandleAudioTimeupdate(\"primary\")";
__ref._handleaudiotimeupdate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"primary");
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="If audioKey <> activeAudioKey Then Return False";
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
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
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
RDebugUtils.currentLine=24182787;
 //BA.debugLineNum = 24182787;BA.debugLine="If ShouldTriggerBreakNow Then";
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
RDebugUtils.currentLine=24182788;
 //BA.debugLineNum = 24182788;BA.debugLine="TraceLog(\"Достигнута точка exact-break.\")";
__ref._tracelog /*String*/ (null,"Достигнута точка exact-break.");
RDebugUtils.currentLine=24182789;
 //BA.debugLineNum = 24182789;BA.debugLine="Wait For (FadeOutAndContinue) Complete (unused A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudiotimeupdate"), __ref._fadeoutandcontinue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 39;
return;
case 39:
//C
this.state = 16;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=24182790;
 //BA.debugLineNum = 24182790;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=24182792;
 //BA.debugLineNum = 24182792;BA.debugLine="Dim remain As Long = EffectiveTrackRemainMs";
_remain = __ref._effectivetrackremainms /*long*/ (null);
RDebugUtils.currentLine=24182793;
 //BA.debugLineNum = 24182793;BA.debugLine="If CanCrossfadePreparedItem And remain > 0 And re";
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
RDebugUtils.currentLine=24182794;
 //BA.debugLineNum = 24182794;BA.debugLine="isCrossfadeTriggered = True";
__ref._iscrossfadetriggered /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=24182795;
 //BA.debugLineNum = 24182795;BA.debugLine="TraceLog(\"Запуск overlap треков. remainMs=\" & re";
__ref._tracelog /*String*/ (null,"Запуск overlap треков. remainMs="+BA.NumberToString(_remain)+", next="+__ref._describeitem /*String*/ (null,(Object)(__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())));
RDebugUtils.currentLine=24182796;
 //BA.debugLineNum = 24182796;BA.debugLine="PromotePreparedPlayer(PreparedFadeInMs, Prepared";
__ref._promotepreparedplayer /*boolean*/ (null,__ref._preparedfadeinms /*int*/ (null),__ref._preparedfadeoutms /*int*/ (null));
RDebugUtils.currentLine=24182797;
 //BA.debugLineNum = 24182797;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=24182799;
 //BA.debugLineNum = 24182799;BA.debugLine="If CanStartPreparedOnTrackTail And remain > 0 And";

case 20:
//if
this.state = 23;
if (__ref._canstartpreparedontracktail /*boolean*/ (null) && _remain>0 && _remain<=__ref._ad_tail_overlap_ms /*int*/ ) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=24182800;
 //BA.debugLineNum = 24182800;BA.debugLine="isCrossfadeTriggered = True";
__ref._iscrossfadetriggered /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=24182801;
 //BA.debugLineNum = 24182801;BA.debugLine="TraceLog(\"Запуск ролика на хвосте трека. remainM";
__ref._tracelog /*String*/ (null,"Запуск ролика на хвосте трека. remainMs="+BA.NumberToString(_remain)+", next="+__ref._describeitem /*String*/ (null,(Object)(__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())));
RDebugUtils.currentLine=24182802;
 //BA.debugLineNum = 24182802;BA.debugLine="PromotePreparedPlayer(PreparedFadeInMs, Prepared";
__ref._promotepreparedplayer /*boolean*/ (null,__ref._preparedfadeinms /*int*/ (null),__ref._preparedfadeoutms /*int*/ (null));
RDebugUtils.currentLine=24182803;
 //BA.debugLineNum = 24182803;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=24182805;
 //BA.debugLineNum = 24182805;BA.debugLine="If prefetchDone Then Return False";

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
RDebugUtils.currentLine=24182806;
 //BA.debugLineNum = 24182806;BA.debugLine="If remain <= 0 Then Return False";
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
RDebugUtils.currentLine=24182807;
 //BA.debugLineNum = 24182807;BA.debugLine="If remain <= PREFETCH_SECONDS * 1000 Then";
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
RDebugUtils.currentLine=24182808;
 //BA.debugLineNum = 24182808;BA.debugLine="prefetchDone = True";
__ref._prefetchdone /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=24182809;
 //BA.debugLineNum = 24182809;BA.debugLine="TraceLog(\"Запуск предзагрузки следующего элемент";
__ref._tracelog /*String*/ (null,"Запуск предзагрузки следующего элемента. remainMs="+BA.NumberToString(_remain));
RDebugUtils.currentLine=24182810;
 //BA.debugLineNum = 24182810;BA.debugLine="Wait For (PrefetchNext) Complete (unused2 As Boo";
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
RDebugUtils.currentLine=24182812;
 //BA.debugLineNum = 24182812;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=24182813;
 //BA.debugLineNum = 24182813;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Private Sub AudioSecondary_Complete";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="HandleAudioComplete(\"secondary\")";
__ref._handleaudiocomplete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"secondary");
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_error(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_error", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_error", new Object[] {_message}));}
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Private Sub AudioSecondary_Error(message As String";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="HandleAudioError(\"secondary\", message)";
__ref._handleaudioerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"secondary",_message);
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_ready(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_ready", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_ready", null));}
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Private Sub AudioSecondary_Ready";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="HandleAudioReady(\"secondary\")";
__ref._handleaudioready /*String*/ (null,"secondary");
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_timeupdate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_timeupdate", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_timeupdate", null));}
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Private Sub AudioSecondary_Timeupdate";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="HandleAudioTimeupdate(\"secondary\")";
__ref._handleaudiotimeupdate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"secondary");
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 327682;BA.debugLine="rootView.Color = 0xFF0E0F11";
__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff0e0f11));
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="InitSettings";
__ref._initsettings /*String*/ (null);
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="InitState";
__ref._initstate /*String*/ (null);
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="BuildUi";
__ref._buildui /*String*/ (null);
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="audioPrimary.Initialize(\"AudioPrimary\", Me)";
__ref._audioprimary /*b4j.example.audioplayer*/ ._initialize /*String*/ (null,ba,"AudioPrimary",this);
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="audioSecondary.Initialize(\"AudioSecondary\", Me)";
__ref._audiosecondary /*b4j.example.audioplayer*/ ._initialize /*String*/ (null,ba,"AudioSecondary",this);
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="TraceLog(\"Приложение запущено. Версия=\" & APP_VER";
__ref._tracelog /*String*/ (null,"Приложение запущено. Версия="+__ref._app_version /*String*/ +", код плеера="+__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ )+", deviceId="+__ref._deviceid /*String*/ );
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="ShowInitialScreen";
__ref._showinitialscreen /*String*/ (null);
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458756;BA.debugLine="messages.Put(\"offline\", \"Требуется интернет\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("offline"),(Object)("Требуется интернет"));
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="messages.Put(\"server_wait\", \"Временная остановка\"";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("server_wait"),(Object)("Временная остановка"));
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="messages.Put(\"idle\", \"Перерыв...\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idle"),(Object)("Перерыв..."));
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="messages.Put(\"idle_until\", \"Перерыв до {time}\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idle_until"),(Object)("Перерыв до {time}"));
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="messages.Put(\"blocked\", \"Плеер заблокирован\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blocked"),(Object)("Плеер заблокирован"));
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="messages.Put(\"idle_stream\", \"Запусти поток\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idle_stream"),(Object)("Запусти поток"));
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="messages.Put(\"player_required\", \"Не указан плеер\"";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("player_required"),(Object)("Не указан плеер"));
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="messages.Put(\"device_required\", \"Не указано устро";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_required"),(Object)("Не указано устройство"));
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="messages.Put(\"device_busy\", \"Плеер играет на друг";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_busy"),(Object)("Плеер играет на другом устройстве. Играть здесь?"));
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="messages.Put(\"device_confirm_yes\", \"Да\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_confirm_yes"),(Object)("Да"));
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="messages.Put(\"device_confirm_no\", \"Нет\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_confirm_no"),(Object)("Нет"));
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="messages.Put(\"not_found\", \"Плеер не найден\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("not_found"),(Object)("Плеер не найден"));
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="messages.Put(\"player_updated\", \"Плеер обновлен\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("player_updated"),(Object)("Плеер обновлен"));
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="messages.Put(\"player_reloading\", \"Обновление…\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("player_reloading"),(Object)("Обновление…"));
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="messages.Put(\"ad_label\", \"Реклама\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ad_label"),(Object)("Реклама"));
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="messages.Put(\"setup_title\", \"Введите код плеера\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_title"),(Object)("Введите код плеера"));
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="messages.Put(\"setup_placeholder\", \"abc12\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_placeholder"),(Object)("abc12"));
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="messages.Put(\"setup_submit\", \"Войти\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_submit"),(Object)("Войти"));
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="messages.Put(\"setup_invalid\", \"Введите код из 5 с";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_invalid"),(Object)("Введите код из 5 символов"));
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="messages.Put(\"logout\", \"Выйти\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("logout"),(Object)("Выйти"));
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="messages.Put(\"settings_open\", \"Настройки\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("settings_open"),(Object)("Настройки"));
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="messages.Put(\"settings_close\", \"Закрыть\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("settings_close"),(Object)("Закрыть"));
RDebugUtils.currentLine=458778;
 //BA.debugLineNum = 458778;BA.debugLine="messages.Put(\"settings_thanks\", \"Спасибо!\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("settings_thanks"),(Object)("Спасибо!"));
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 524291;BA.debugLine="storage = LoadStorage";
__ref._storage /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._loadstorage /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="deviceId = GetOrCreateDeviceId";
__ref._deviceid /*String*/  = __ref._getorcreatedeviceid /*String*/ (null);
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="playerCode = NormalizePlayerCode(storage.GetDefau";
__ref._playercode /*String*/  = __ref._normalizeplayercode /*String*/ (null,BA.ObjectToString(__ref._storage /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("player_code"),(Object)(""))));
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="traceLogs.Initialize";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="serverSnapshots.Initialize";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="playQueue.Initialize";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="retryTimer.Initialize(\"RetryTimer\", SERVER_RETRY_";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"RetryTimer",(long) (__ref._server_retry_delay_initial /*int*/ ));
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="breakTimer.Initialize(\"BreakTimer\", 1000)";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"BreakTimer",(long) (1000));
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="historyTimer.Initialize(\"HistoryTimer\", HISTORY_L";
__ref._historytimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"HistoryTimer",(long) (__ref._history_log_delay_ms /*int*/ ));
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="orbitTimer.Initialize(\"OrbitTimer\", 70)";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"OrbitTimer",(long) (70));
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="historyItem.Initialize";
__ref._historyitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="activeItem.Initialize";
__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="preparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="activeAudioKey = \"\"";
__ref._activeaudiokey /*String*/  = "";
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="preparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="pendingPlayAudioKey = \"\"";
__ref._pendingplayaudiokey /*String*/  = "";
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="pendingPrepareAudioKey = \"\"";
__ref._pendingprepareaudiokey /*String*/  = "";
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="TraceLog(\"Состояние инициализировано. Папка=\" & s";
__ref._tracelog /*String*/ (null,"Состояние инициализировано. Папка="+__ref._storagedir /*String*/ +", сохраненный код="+__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ));
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 589860;BA.debugLine="lblFooter = CreateLabel(\"FON.FM APP \" & APP_VERSI";
__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"FON.FM APP "+__ref._app_version /*String*/ ,(float) (12),((int)0xff747b86),__c.False,__c.True);
RDebugUtils.currentLine=589861;
 //BA.debugLineNum = 589861;BA.debugLine="lblSetupMessage = CreateLabel(\"\", 17, 0xFFBCC3CD,";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"",(float) (17),((int)0xffbcc3cd),__c.False,__c.True);
RDebugUtils.currentLine=589863;
 //BA.debugLineNum = 589863;BA.debugLine="txtPlayerCode.Initialize(\"txtPlayerCode\")";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .Initialize(ba,"txtPlayerCode");
RDebugUtils.currentLine=589864;
 //BA.debugLineNum = 589864;BA.debugLine="txtPlayerCodeView = txtPlayerCode";
__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=589865;
 //BA.debugLineNum = 589865;BA.debugLine="btnSetupSubmit = CreateTextButton(MessageValue(\"s";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._messagevalue /*String*/ (null,"setup_submit"),"BtnSetupSubmit");
RDebugUtils.currentLine=589866;
 //BA.debugLineNum = 589866;BA.debugLine="btnConfirmYes = CreateTextButton(MessageValue(\"de";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._messagevalue /*String*/ (null,"device_confirm_yes"),"BtnConfirmYes");
RDebugUtils.currentLine=589867;
 //BA.debugLineNum = 589867;BA.debugLine="btnConfirmNo = CreateTextButton(MessageValue(\"dev";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._messagevalue /*String*/ (null,"device_confirm_no"),"BtnConfirmNo");
RDebugUtils.currentLine=589869;
 //BA.debugLineNum = 589869;BA.debugLine="rootView.AddView(card, 0, 0, 0, 0)";
__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589870;
 //BA.debugLineNum = 589870;BA.debugLine="card.AddView(headerPane, 0, 0, 0, 0)";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589871;
 //BA.debugLineNum = 589871;BA.debugLine="card.AddView(contentPane, 0, 0, 0, 0)";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589872;
 //BA.debugLineNum = 589872;BA.debugLine="card.AddView(footerPane, 0, 0, 0, 0)";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589873;
 //BA.debugLineNum = 589873;BA.debugLine="headerPane.AddView(lblHeader, 0, 0, 0, 0)";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589874;
 //BA.debugLineNum = 589874;BA.debugLine="headerPane.AddView(headerActionPane, 0, 0, 0, 0)";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589875;
 //BA.debugLineNum = 589875;BA.debugLine="headerActionPane.AddView(lblHeaderAction, 0, 0, 0";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589876;
 //BA.debugLineNum = 589876;BA.debugLine="contentPane.AddView(setupPane, 0, 0, 0, 0)";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589877;
 //BA.debugLineNum = 589877;BA.debugLine="contentPane.AddView(playerPane, 0, 0, 0, 0)";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589878;
 //BA.debugLineNum = 589878;BA.debugLine="footerPane.AddView(lblFooter, 0, 0, 0, 0)";
__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589880;
 //BA.debugLineNum = 589880;BA.debugLine="setupPane.AddView(setupHeroPane, 0, 0, 0, 0)";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589881;
 //BA.debugLineNum = 589881;BA.debugLine="setupPane.AddView(setupDetailPane, 0, 0, 0, 0)";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589882;
 //BA.debugLineNum = 589882;BA.debugLine="setupHeroPane.AddView(accessCorePane, 0, 0, 0, 0)";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589883;
 //BA.debugLineNum = 589883;BA.debugLine="setupHeroPane.AddView(accessCirclePane, 0, 0, 0,";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589884;
 //BA.debugLineNum = 589884;BA.debugLine="accessCirclePane.AddView(accessInputPane, 0, 0, 0";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589885;
 //BA.debugLineNum = 589885;BA.debugLine="accessInputPane.AddView(txtPlayerCodeView, 0, 0,";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589886;
 //BA.debugLineNum = 589886;BA.debugLine="setupDetailPane.AddView(setupPrimaryPane, 0, 0, 0";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589887;
 //BA.debugLineNum = 589887;BA.debugLine="setupDetailPane.AddView(setupStatusPane, 0, 0, 0,";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589888;
 //BA.debugLineNum = 589888;BA.debugLine="setupPrimaryPane.AddView(btnSetupSubmit, 0, 0, 0,";
__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589889;
 //BA.debugLineNum = 589889;BA.debugLine="setupStatusPane.AddView(lblSetupMessage, 0, 0, 0,";
__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589891;
 //BA.debugLineNum = 589891;BA.debugLine="playerPane.AddView(playerHeroPane, 0, 0, 0, 0)";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589892;
 //BA.debugLineNum = 589892;BA.debugLine="playerPane.AddView(playerDetailPane, 0, 0, 0, 0)";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589893;
 //BA.debugLineNum = 589893;BA.debugLine="playerHeroPane.AddView(orbitPane, 0, 0, 0, 0)";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589894;
 //BA.debugLineNum = 589894;BA.debugLine="playerHeroPane.AddView(playButtonPane, 0, 0, 0, 0";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589895;
 //BA.debugLineNum = 589895;BA.debugLine="playButtonPane.AddView(lblPlayIcon, 0, 0, 0, 0)";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589896;
 //BA.debugLineNum = 589896;BA.debugLine="playerDetailPane.AddView(playerPrimaryPane, 0, 0,";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589897;
 //BA.debugLineNum = 589897;BA.debugLine="playerDetailPane.AddView(playerStatusPane, 0, 0,";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589898;
 //BA.debugLineNum = 589898;BA.debugLine="playerPrimaryPane.AddView(lblStream, 0, 0, 0, 0)";
__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589899;
 //BA.debugLineNum = 589899;BA.debugLine="playerStatusPane.AddView(lblInfo, 0, 0, 0, 0)";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589900;
 //BA.debugLineNum = 589900;BA.debugLine="playerStatusPane.AddView(confirmPane, 0, 0, 0, 0)";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589901;
 //BA.debugLineNum = 589901;BA.debugLine="confirmPane.AddView(btnConfirmYes, 0, 0, 0, 0)";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589902;
 //BA.debugLineNum = 589902;BA.debugLine="confirmPane.AddView(btnConfirmNo, 0, 0, 0, 0)";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589904;
 //BA.debugLineNum = 589904;BA.debugLine="SetPaneStyle(card, \"-fx-background-radius: 24; -f";
__ref._setpanestyle /*String*/ (null,__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 24; -fx-border-radius: 24;");
RDebugUtils.currentLine=589905;
 //BA.debugLineNum = 589905;BA.debugLine="SetPaneStyle(headerActionPane, \"-fx-cursor: hand;";
__ref._setpanestyle /*String*/ (null,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.05); -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=589906;
 //BA.debugLineNum = 589906;BA.debugLine="SetPaneStyle(playButtonPane, \"-fx-cursor: hand; -";
__ref._setpanestyle /*String*/ (null,__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.07); -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=589907;
 //BA.debugLineNum = 589907;BA.debugLine="SetPaneStyle(accessCirclePane, \"-fx-background-ra";
__ref._setpanestyle /*String*/ (null,__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=589908;
 //BA.debugLineNum = 589908;BA.debugLine="SetPaneStyle(accessCorePane, \"-fx-background-radi";
__ref._setpanestyle /*String*/ (null,__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=589909;
 //BA.debugLineNum = 589909;BA.debugLine="SetPaneStyle(accessInputPane, \"-fx-background-col";
__ref._setpanestyle /*String*/ (null,__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;");
RDebugUtils.currentLine=589910;
 //BA.debugLineNum = 589910;BA.debugLine="SetPaneStyle(txtPlayerCodeView, \"-fx-background-c";
__ref._setpanestyle /*String*/ (null,__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xffddf1ff))+"; -fx-prompt-text-fill: "+__ref._colortocss /*String*/ (null,((int)0x7affffff))+"; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-padding: 0 0 2 0;");
RDebugUtils.currentLine=589911;
 //BA.debugLineNum = 589911;BA.debugLine="accessCorePane.Visible = True";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=589912;
 //BA.debugLineNum = 589912;BA.debugLine="accessCirclePane.Visible = True";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=589913;
 //BA.debugLineNum = 589913;BA.debugLine="accessInputPane.Visible = True";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=589914;
 //BA.debugLineNum = 589914;BA.debugLine="SetPickOnBounds(headerActionPane, True)";
__ref._setpickonbounds /*String*/ (null,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=589915;
 //BA.debugLineNum = 589915;BA.debugLine="SetPickOnBounds(playButtonPane, True)";
__ref._setpickonbounds /*String*/ (null,__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=589916;
 //BA.debugLineNum = 589916;BA.debugLine="txtPlayerCode.PromptText = MessageValue(\"setup_pl";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setPromptText(__ref._messagevalue /*String*/ (null,"setup_placeholder").toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
RDebugUtils.currentLine=589917;
 //BA.debugLineNum = 589917;BA.debugLine="txtPlayerCode.Visible = True";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=589918;
 //BA.debugLineNum = 589918;BA.debugLine="UpdateHeaderActionAppearance(False)";
__ref._updateheaderactionappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=589919;
 //BA.debugLineNum = 589919;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=589920;
 //BA.debugLineNum = 589920;BA.debugLine="UpdateCodeInputAppearance(False)";
__ref._updatecodeinputappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=589921;
 //BA.debugLineNum = 589921;BA.debugLine="BringToFront(accessCorePane)";
__ref._bringtofront /*String*/ (null,__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=589922;
 //BA.debugLineNum = 589922;BA.debugLine="BringToFront(accessCirclePane)";
__ref._bringtofront /*String*/ (null,__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=589923;
 //BA.debugLineNum = 589923;BA.debugLine="BringToFront(accessInputPane)";
__ref._bringtofront /*String*/ (null,__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=589924;
 //BA.debugLineNum = 589924;BA.debugLine="BringToFront(txtPlayerCodeView)";
__ref._bringtofront /*String*/ (null,__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=589926;
 //BA.debugLineNum = 589926;BA.debugLine="confirmPane.Visible = False";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=589927;
 //BA.debugLineNum = 589927;BA.debugLine="LayoutUi(rootView.Width, rootView.Height)";
__ref._layoutui /*String*/ (null,(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=589928;
 //BA.debugLineNum = 589928;BA.debugLine="End Sub";
return "";
}
public String  _formatplayercodefordisplay(b4j.example.b4xmainpage __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "formatplayercodefordisplay", false))
	 {return ((String) Debug.delegate(ba, "formatplayercodefordisplay", new Object[] {_value}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Private Sub FormatPlayerCodeForDisplay(value As St";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Return value.Trim.ToUpperCase";
if (true) return _value.trim().toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
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
__ref._showplayerscreen /*void*/ (null,__c.True);
 };
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="card.SetLayoutAnimated(0, cardLeft, cardTop, card";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_cardleft,_cardtop,_cardwidth,_cardheight);
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="headerPane.SetLayoutAnimated(0, 0, 0, cardWidth,";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_cardwidth,_headerheight);
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="contentPane.SetLayoutAnimated(0, 0, headerHeight";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,_headerheight+_sectiongap/(double)2,_cardwidth,_cardheight-_headerheight-_footerheight-_sectiongap);
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="footerPane.SetLayoutAnimated(0, 0, cardHeight - f";
__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,_cardheight-_footerheight,_cardwidth,_footerheight);
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="Dim headerActionSize As Int = ScaleValue(safeWidt";
_headeractionsize = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (36)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (42)));
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="headerActionPane.SetLayoutAnimated(0, cardWidth -";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_cardwidth-_horizontalpad-_headeractionsize,(_headerheight-_headeractionsize)/(double)2,_headeractionsize,_headeractionsize);
RDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="lblHeaderAction.SetLayoutAnimated(0, 0, 0, header";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=655383;
 //BA.debugLineNum = 655383;BA.debugLine="lblHeader.SetLayoutAnimated(0, horizontalPad + he";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad+_headeractionsize+_contentgap,0,_cardwidth-(_horizontalpad+_headeractionsize+_contentgap)*2,_headerheight);
RDebugUtils.currentLine=655385;
 //BA.debugLineNum = 655385;BA.debugLine="setupPane.SetLayoutAnimated(0, 0, 0, contentPane.";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="playerPane.SetLayoutAnimated(0, 0, 0, contentPane";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=655388;
 //BA.debugLineNum = 655388;BA.debugLine="Dim contentHeight As Int = contentPane.Height";
_contentheight = (int) (__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=655389;
 //BA.debugLineNum = 655389;BA.debugLine="Dim heroHeight As Int = Max(160dip, (contentHeigh";
_heroheight = (int) (__c.Max(__c.DipToCurrent((int) (160)),(_contentheight-_sectiongap)/(double)2));
RDebugUtils.currentLine=655390;
 //BA.debugLineNum = 655390;BA.debugLine="Dim detailHeight As Int = Max(120dip, contentHeig";
_detailheight = (int) (__c.Max(__c.DipToCurrent((int) (120)),_contentheight-_heroheight-_sectiongap));
RDebugUtils.currentLine=655391;
 //BA.debugLineNum = 655391;BA.debugLine="Dim contentWidth As Int = cardWidth - horizontalP";
_contentwidth = (int) (_cardwidth-_horizontalpad*2);
RDebugUtils.currentLine=655393;
 //BA.debugLineNum = 655393;BA.debugLine="setupHeroPane.SetLayoutAnimated(0, horizontalPad,";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,0,_contentwidth,_heroheight);
RDebugUtils.currentLine=655394;
 //BA.debugLineNum = 655394;BA.debugLine="setupDetailPane.SetLayoutAnimated(0, horizontalPa";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,_heroheight+_sectiongap,_contentwidth,_detailheight);
RDebugUtils.currentLine=655395;
 //BA.debugLineNum = 655395;BA.debugLine="playerHeroPane.SetLayoutAnimated(0, horizontalPad";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,0,_contentwidth,_heroheight);
RDebugUtils.currentLine=655396;
 //BA.debugLineNum = 655396;BA.debugLine="playerDetailPane.SetLayoutAnimated(0, horizontalP";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,_heroheight+_sectiongap,_contentwidth,_detailheight);
RDebugUtils.currentLine=655398;
 //BA.debugLineNum = 655398;BA.debugLine="Dim controlSize As Int = ScaleValue(safeWidth, 15";
_controlsize = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (156)),__c.DipToCurrent((int) (172)),__c.DipToCurrent((int) (182)));
RDebugUtils.currentLine=655399;
 //BA.debugLineNum = 655399;BA.debugLine="Dim inputLeft As Int = (setupHeroPane.Width - con";
_inputleft = (int) ((__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_controlsize)/(double)2);
RDebugUtils.currentLine=655400;
 //BA.debugLineNum = 655400;BA.debugLine="Dim inputTop As Int = Max(0, (setupHeroPane.Heigh";
_inputtop = (int) (__c.Max(0,(__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_controlsize)/(double)2));
RDebugUtils.currentLine=655401;
 //BA.debugLineNum = 655401;BA.debugLine="Dim accessOrbitSize As Int = controlSize + 20dip";
_accessorbitsize = (int) (_controlsize+__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=655402;
 //BA.debugLineNum = 655402;BA.debugLine="accessCorePane.SetLayoutAnimated(0, inputLeft - 1";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_inputleft-__c.DipToCurrent((int) (10)),_inputtop-__c.DipToCurrent((int) (10)),_accessorbitsize,_accessorbitsize);
RDebugUtils.currentLine=655403;
 //BA.debugLineNum = 655403;BA.debugLine="accessCirclePane.SetLayoutAnimated(0, inputLeft,";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_inputleft,_inputtop,_controlsize,_controlsize);
RDebugUtils.currentLine=655404;
 //BA.debugLineNum = 655404;BA.debugLine="Dim inputPaneWidth As Int = controlSize - 34dip";
_inputpanewidth = (int) (_controlsize-__c.DipToCurrent((int) (34)));
RDebugUtils.currentLine=655405;
 //BA.debugLineNum = 655405;BA.debugLine="Dim inputPaneHeight As Int = Min(72dip, controlSi";
_inputpaneheight = (int) (__c.Min(__c.DipToCurrent((int) (72)),_controlsize-__c.DipToCurrent((int) (62))));
RDebugUtils.currentLine=655406;
 //BA.debugLineNum = 655406;BA.debugLine="Dim inputPaneLeft As Int = (controlSize - inputPa";
_inputpaneleft = (int) ((_controlsize-_inputpanewidth)/(double)2);
RDebugUtils.currentLine=655407;
 //BA.debugLineNum = 655407;BA.debugLine="Dim inputPaneTop As Int = (controlSize - inputPan";
_inputpanetop = (int) ((_controlsize-_inputpaneheight)/(double)2);
RDebugUtils.currentLine=655408;
 //BA.debugLineNum = 655408;BA.debugLine="accessInputPane.SetLayoutAnimated(0, inputPaneLef";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_inputpaneleft,_inputpanetop,_inputpanewidth,_inputpaneheight);
RDebugUtils.currentLine=655409;
 //BA.debugLineNum = 655409;BA.debugLine="Dim codeFieldHeight As Int = inputPaneHeight";
_codefieldheight = _inputpaneheight;
RDebugUtils.currentLine=655410;
 //BA.debugLineNum = 655410;BA.debugLine="txtPlayerCodeView.SetLayoutAnimated(0, 0, 0, inpu";
__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_inputpanewidth,_codefieldheight);
RDebugUtils.currentLine=655412;
 //BA.debugLineNum = 655412;BA.debugLine="Dim orbitSize As Int = controlSize + 20dip";
_orbitsize = (int) (_controlsize+__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=655413;
 //BA.debugLineNum = 655413;BA.debugLine="Dim orbitLeft As Int = (playerHeroPane.Width - or";
_orbitleft = (int) ((__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_orbitsize)/(double)2);
RDebugUtils.currentLine=655414;
 //BA.debugLineNum = 655414;BA.debugLine="Dim controlLeft As Int = (playerHeroPane.Width -";
_controlleft = (int) ((__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_controlsize)/(double)2);
RDebugUtils.currentLine=655415;
 //BA.debugLineNum = 655415;BA.debugLine="Dim controlTop As Int = Max(0, (playerHeroPane.He";
_controltop = (int) (__c.Max(0,(__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_controlsize)/(double)2));
RDebugUtils.currentLine=655416;
 //BA.debugLineNum = 655416;BA.debugLine="orbitPane.SetLayoutAnimated(0, orbitLeft, control";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_orbitleft,_controltop-__c.DipToCurrent((int) (10)),_orbitsize,_orbitsize);
RDebugUtils.currentLine=655417;
 //BA.debugLineNum = 655417;BA.debugLine="playButtonPane.SetLayoutAnimated(0, controlLeft,";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_controlleft,_controltop,_controlsize,_controlsize);
RDebugUtils.currentLine=655418;
 //BA.debugLineNum = 655418;BA.debugLine="lblPlayIcon.SetLayoutAnimated(0, 0, 1dip, control";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__c.DipToCurrent((int) (1)),_controlsize,_controlsize);
RDebugUtils.currentLine=655420;
 //BA.debugLineNum = 655420;BA.debugLine="setupPrimaryPane.SetLayoutAnimated(0, 0, 0, setup";
__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.Max(__c.DipToCurrent((int) (56)),__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.38));
RDebugUtils.currentLine=655421;
 //BA.debugLineNum = 655421;BA.debugLine="setupStatusPane.SetLayoutAnimated(0, 0, setupPrim";
__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+_contentgap,__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_contentgap);
RDebugUtils.currentLine=655422;
 //BA.debugLineNum = 655422;BA.debugLine="btnSetupSubmit.SetLayoutAnimated(0, Max(0, (setup";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Max(0,(__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (132)))/(double)2),__c.Max(0,(__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (44)))/(double)2),__c.DipToCurrent((int) (132)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=655423;
 //BA.debugLineNum = 655423;BA.debugLine="lblSetupMessage.SetLayoutAnimated(0, 0, 0, setupS";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=655425;
 //BA.debugLineNum = 655425;BA.debugLine="playerPrimaryPane.SetLayoutAnimated(0, 0, 0, play";
__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.Max(__c.DipToCurrent((int) (56)),__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.4));
RDebugUtils.currentLine=655426;
 //BA.debugLineNum = 655426;BA.debugLine="playerStatusPane.SetLayoutAnimated(0, 0, playerPr";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+_contentgap,__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_contentgap);
RDebugUtils.currentLine=655427;
 //BA.debugLineNum = 655427;BA.debugLine="lblStream.SetLayoutAnimated(0, 0, 0, playerPrimar";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=655428;
 //BA.debugLineNum = 655428;BA.debugLine="Dim infoHeight As Int = Max(54dip, playerStatusPa";
_infoheight = (int) (__c.Max(__c.DipToCurrent((int) (54)),__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._confirmreservedheight /*int*/ (null)));
RDebugUtils.currentLine=655429;
 //BA.debugLineNum = 655429;BA.debugLine="lblInfo.SetLayoutAnimated(0, 0, 0, playerStatusPa";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_infoheight);
RDebugUtils.currentLine=655430;
 //BA.debugLineNum = 655430;BA.debugLine="If confirmPane.Visible Then";
if (__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible()) { 
RDebugUtils.currentLine=655431;
 //BA.debugLineNum = 655431;BA.debugLine="confirmPane.SetLayoutAnimated(0, 0, playerStatus";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (72)),__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.DipToCurrent((int) (72)));
 }else {
RDebugUtils.currentLine=655433;
 //BA.debugLineNum = 655433;BA.debugLine="confirmPane.SetLayoutAnimated(0, 0, playerStatus";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),0);
 };
RDebugUtils.currentLine=655435;
 //BA.debugLineNum = 655435;BA.debugLine="btnConfirmYes.SetLayoutAnimated(0, Max(0, (confir";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Max(0,(__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (236)))/(double)2),__c.DipToCurrent((int) (14)),__c.DipToCurrent((int) (112)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=655436;
 //BA.debugLineNum = 655436;BA.debugLine="btnConfirmNo.SetLayoutAnimated(0, btnConfirmYes.L";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__c.DipToCurrent((int) (124)),__c.DipToCurrent((int) (14)),__c.DipToCurrent((int) (112)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=655438;
 //BA.debugLineNum = 655438;BA.debugLine="lblFooter.SetLayoutAnimated(0, horizontalPad, 0,";
__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,0,_cardwidth-_horizontalpad*2,_footerheight);
RDebugUtils.currentLine=655439;
 //BA.debugLineNum = 655439;BA.debugLine="UpdateResponsiveStyles(safeWidth)";
__ref._updateresponsivestyles /*String*/ (null,_safewidth);
RDebugUtils.currentLine=655440;
 //BA.debugLineNum = 655440;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=655441;
 //BA.debugLineNum = 655441;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="breakTimer.Enabled = False";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
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
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="If ShouldTriggerBreakNow = False Then Return";
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
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="TraceLog(\"Сработал таймер exact-break.\")";
__ref._tracelog /*String*/ (null,"Сработал таймер exact-break.");
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="Wait For (FadeOutAndContinue) Complete (unused As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "breaktimer_tick"), __ref._fadeoutandcontinue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub ShouldTriggerBreakNow As Boolean";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="If scheduledBreakAt <= 0 Then Return False";
if (__ref._scheduledbreakat /*long*/ <=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Return LocalNowTimestamp >= scheduledBreakAt";
if (true) return __ref._localnowtimestamp /*long*/ (null)>=__ref._scheduledbreakat /*long*/ ;
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If isQueueTransitioning Then Return False";
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
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="isQueueTransitioning = True";
__ref._isqueuetransitioning /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Dim fadeMs As Int";
_fadems = 0;
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="If currentMediaType = \"track\" Then";
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
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="fadeMs = STOP_FADE_MS";
_fadems = __ref._stop_fade_ms /*int*/ ;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="fadeMs = 0";
_fadems = (int) (0);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="TraceLog(\"Переход через fade-out. currentType=\" &";
__ref._tracelog /*String*/ (null,"Переход через fade-out. currentType="+__ref._currentmediatype /*String*/ +", fadeMs="+BA.NumberToString(_fadems));
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="If activeAudioKey <> \"\" Then GetAudioByKey(active";
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
RDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="Wait For (PlayPreparedOrLoadNext) Complete (unuse";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "fadeoutandcontinue"), __ref._playpreparedorloadnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 19;
return;
case 19:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="isQueueTransitioning = False";
__ref._isqueuetransitioning /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=3866640;
 //BA.debugLineNum = 3866640;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Private Sub BringToFront(view As B4XView)";
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="jo.RunMethod(\"toFront\", Null)";
_jo.RunMethod("toFront",(Object[])(__c.Null));
RDebugUtils.currentLine=24838147;
 //BA.debugLineNum = 24838147;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmno_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmno_click", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmno_click", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub BtnConfirmNo_Click";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="ApplyStoppedState";
__ref._applystoppedstate /*String*/ (null);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="End Sub";
return "";
}
public String  _hidepin(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hidepin", false))
	 {return ((String) Debug.delegate(ba, "hidepin", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub HidePin";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="confirmPane.Visible = False";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Wait For (SubmitClaim) Complete (unused As Boolea";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "btnconfirmyes_click"), __ref._submitclaim /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="btnConfirmYes.Enabled = False";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="btnConfirmNo.Enabled = False";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="TraceLog(\"SubmitClaim. playerCode=\" & FormatPlaye";
__ref._tracelog /*String*/ (null,"SubmitClaim. playerCode="+__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ )+", deviceId="+__ref._deviceid /*String*/ );
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Wait For (FetchJsonWithTimeout(CLAIM_BASE_URL & \"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "submitclaim"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._claim_base_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,__ref._createclaimparams /*anywheresoftware.b4a.objects.collections.Map*/ (null)),__ref._fetch_timeout_ms /*int*/ ));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
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
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="If resultData Is Map Then";
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
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="If data.GetDefault(\"ok\", False) = True Then";
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
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="isStarted = True";
__ref._isstarted /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="isStoppedByUser = False";
__ref._isstoppedbyuser /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="TraceLog(\"Claim OK. starting playback.\")";
__ref._tracelog /*String*/ (null,"Claim OK. starting playback.");
RDebugUtils.currentLine=2359311;
 //BA.debugLineNum = 2359311;BA.debugLine="Wait For (StartFirstTrack(\"manual\")) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "submitclaim"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"manual"));
this.state = 14;
return;
case 14:
//C
this.state = 10;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=2359313;
 //BA.debugLineNum = 2359313;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="Return True";
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
RDebugUtils.currentLine=2359318;
 //BA.debugLineNum = 2359318;BA.debugLine="TraceLog(\"Claim rejected. message=\" & ResolveErro";
__ref._tracelog /*String*/ (null,"Claim rejected. message="+__ref._resolveerrormessage /*String*/ (null,_result,__ref._messagevalue /*String*/ (null,"device_busy")));
RDebugUtils.currentLine=2359319;
 //BA.debugLineNum = 2359319;BA.debugLine="ShowClaimPrompt(ResolveErrorMessage(result, Messa";
__ref._showclaimprompt /*String*/ (null,__ref._resolveerrormessage /*String*/ (null,_result,__ref._messagevalue /*String*/ (null,"device_busy")));
RDebugUtils.currentLine=2359320;
 //BA.debugLineNum = 2359320;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=2359321;
 //BA.debugLineNum = 2359321;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=2359322;
 //BA.debugLineNum = 2359322;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=2359323;
 //BA.debugLineNum = 2359323;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="If appScreenMode = \"settings\" Then";
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
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Wait For (LogoutPlayer) Complete (unused As Bool";
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
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Wait For (SubmitPlayerCode) Complete (unused2 As";
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
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="SaveValue(\"player_code\", \"\")";
__ref._savevalue /*String*/ (null,"player_code",(Object)(""));
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="playerCode = \"\"";
__ref._playercode /*String*/  = "";
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Wait For (StopPlayer) Complete (unused As Boolean";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "logoutplayer"), __ref._stopplayer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="ShowSetupScreen(\"\")";
__ref._showsetupscreen /*String*/ (null,"");
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Dim nextPlayer As String = NormalizePlayerCode(tx";
_nextplayer = __ref._normalizeplayercode /*String*/ (null,__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="If nextPlayer = \"\" Then";
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
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="ShowSetupScreen(MessageValue(\"setup_invalid\"))";
__ref._showsetupscreen /*String*/ (null,__ref._messagevalue /*String*/ (null,"setup_invalid"));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="txtPlayerCode.RequestFocus";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .RequestFocus();
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="playerCode = nextPlayer";
__ref._playercode /*String*/  = _nextplayer;
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="SaveValue(\"player_code\", playerCode)";
__ref._savevalue /*String*/ (null,"player_code",(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="txtPlayerCode.Text = FormatPlayerCodeForDisplay(p";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ));
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="ShowPlayerScreen(True)";
__ref._showplayerscreen /*void*/ (null,parent.__c.True);
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _buildparams(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "buildparams", false))
	 {return ((String) Debug.delegate(ba, "buildparams", new Object[] {_params}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _key = "";
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Private Sub BuildParams(params As Map) As String";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="For Each key As String In params.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _params.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="If sb.Length > 0 Then sb.Append(\"&\")";
if (_sb.getLength()>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="sb.Append(UrlEncode(key)).Append(\"=\").Append(Url";
_sb.Append(__ref._urlencode /*String*/ (null,(Object)(_key))).Append("=").Append(__ref._urlencode /*String*/ (null,_params.Get((Object)(_key))));
 }
};
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="End Sub";
return "";
}
public String  _urlencode(b4j.example.b4xmainpage __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "urlencode", false))
	 {return ((String) Debug.delegate(ba, "urlencode", new Object[] {_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub UrlEncode(value As Object) As String";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="jo.InitializeStatic(\"java.net.URLEncoder\")";
_jo.InitializeStatic("java.net.URLEncoder");
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Return jo.RunMethod(\"encode\", Array As Object(\"\"";
if (true) return BA.ObjectToString(_jo.RunMethod("encode",new Object[]{(Object)(""+BA.ObjectToString(_value)),(Object)("UTF-8")}));
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4j.example.b4xmainpage __ref,String _text,float _fontsize,int _textcolor,boolean _bold,boolean _wraptext) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_text,_fontsize,_textcolor,_bold,_wraptext}));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub CreateLabel(text As String, fontSize A";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="lbl.Text = text";
_lbl.setText(_text);
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="lbl.WrapText = wrapText";
_lbl.setWrapText(_wraptext);
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="If bold Then";
if (_bold) { 
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(fontSize)";
_xlbl.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont(_fontsize));
 }else {
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="xlbl.Font = xui.CreateDefaultFont(fontSize)";
_xlbl.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont(_fontsize));
 };
RDebugUtils.currentLine=6881291;
 //BA.debugLineNum = 6881291;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=6881292;
 //BA.debugLineNum = 6881292;BA.debugLine="SetLabelStyle(xlbl, \"-fx-alignment: center; -fx-t";
__ref._setlabelstyle /*String*/ (null,_xlbl,"-fx-alignment: center; -fx-text-fill: "+__ref._colortocss /*String*/ (null,_textcolor)+";");
RDebugUtils.currentLine=6881293;
 //BA.debugLineNum = 6881293;BA.debugLine="SetMouseTransparent(xlbl, True)";
__ref._setmousetransparent /*String*/ (null,_xlbl,__c.True);
RDebugUtils.currentLine=6881294;
 //BA.debugLineNum = 6881294;BA.debugLine="Return xlbl";
if (true) return _xlbl;
RDebugUtils.currentLine=6881295;
 //BA.debugLineNum = 6881295;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextbutton(b4j.example.b4xmainpage __ref,String _text,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createtextbutton", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createtextbutton", new Object[] {_text,_eventname}));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbtn = null;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub CreateTextButton(text As String, event";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="btn.Initialize(eventName)";
_btn.Initialize(ba,_eventname);
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="Dim xbtn As B4XView = btn";
_xbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()));
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="xbtn.Text = text";
_xbtn.setText(_text);
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="xbtn.Font = xui.CreateDefaultFont(12)";
_xbtn.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="SetPaneStyle(xbtn, \"-fx-background-color: transpa";
__ref._setpanestyle /*String*/ (null,_xbtn,"-fx-background-color: transparent; -fx-border-color: rgba(255,255,255,0.12); -fx-border-radius: 12; -fx-background-radius: 12; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xffe0e4ea))+";");
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="Return xbtn";
if (true) return _xbtn;
RDebugUtils.currentLine=6946824;
 //BA.debugLineNum = 6946824;BA.debugLine="End Sub";
return null;
}
public String  _setpanestyle(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setpanestyle", false))
	 {return ((String) Debug.delegate(ba, "setpanestyle", new Object[] {_view,_style}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub SetPaneStyle(view As B4XView, style As";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="jo.RunMethod(\"setStyle\", Array(MergeNodeStyle(jo.";
_jo.RunMethod("setStyle",new Object[]{(Object)(__ref._mergenodestyle /*String*/ (null,BA.ObjectToString(_jo.RunMethod("getStyle",(Object[])(__c.Null))),_style))});
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="End Sub";
return "";
}
public String  _colortocss(b4j.example.b4xmainpage __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "colortocss", false))
	 {return ((String) Debug.delegate(ba, "colortocss", new Object[] {_color}));}
long _unsignedcolor = 0L;
int _rgb = 0;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Private Sub ColorToCss(color As Int) As String";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Dim unsignedColor As Long = Bit.And(0xFFFFFFFF, c";
_unsignedcolor = (long) (__c.Bit.And(((int)0xffffffff),_color));
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Dim rgb As Int = Bit.And(unsignedColor, 0xFFFFFF)";
_rgb = __c.Bit.And((int) (_unsignedcolor),((int)0xffffff));
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Return \"#\" & Bit.ToHexString(rgb)";
if (true) return "#"+__c.Bit.ToHexString(_rgb);
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="End Sub";
return "";
}
public String  _setpickonbounds(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setpickonbounds", false))
	 {return ((String) Debug.delegate(ba, "setpickonbounds", new Object[] {_view,_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Private Sub SetPickOnBounds(view As B4XView, value";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="jo.RunMethod(\"setPickOnBounds\", Array(value))";
_jo.RunMethod("setPickOnBounds",new Object[]{(Object)(_value)});
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Private Sub UpdateHeaderActionAppearance(isHovered";
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=24707075;
 //BA.debugLineNum = 24707075;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=24707076;
 //BA.debugLineNum = 24707076;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=24707077;
 //BA.debugLineNum = 24707077;BA.debugLine="fillColor = 0x14FFFFFF";
_fillcolor = ((int)0x14ffffff);
RDebugUtils.currentLine=24707078;
 //BA.debugLineNum = 24707078;BA.debugLine="borderColor = 0x30FFFFFF";
_bordercolor = ((int)0x30ffffff);
RDebugUtils.currentLine=24707079;
 //BA.debugLineNum = 24707079;BA.debugLine="textColor = 0xFFDDE6EF";
_textcolor = ((int)0xffdde6ef);
 }else {
RDebugUtils.currentLine=24707081;
 //BA.debugLineNum = 24707081;BA.debugLine="fillColor = 0x08FFFFFF";
_fillcolor = ((int)0x08ffffff);
RDebugUtils.currentLine=24707082;
 //BA.debugLineNum = 24707082;BA.debugLine="borderColor = 0x18FFFFFF";
_bordercolor = ((int)0x18ffffff);
RDebugUtils.currentLine=24707083;
 //BA.debugLineNum = 24707083;BA.debugLine="textColor = 0xFFB9C0C9";
_textcolor = ((int)0xffb9c0c9);
 };
RDebugUtils.currentLine=24707085;
 //BA.debugLineNum = 24707085;BA.debugLine="headerActionPane.SetColorAndBorder(fillColor, 1di";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=24707086;
 //BA.debugLineNum = 24707086;BA.debugLine="SetPaneStyle(headerActionPane, \"-fx-cursor: hand;";
__ref._setpanestyle /*String*/ (null,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=24707087;
 //BA.debugLineNum = 24707087;BA.debugLine="SetLabelStyle(lblHeaderAction, \"-fx-alignment: ce";
__ref._setlabelstyle /*String*/ (null,__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+__ref._colortocss /*String*/ (null,_textcolor)+";");
RDebugUtils.currentLine=24707088;
 //BA.debugLineNum = 24707088;BA.debugLine="ApplyMaterialIconFont(lblHeaderAction, headerActi";
__ref._applymaterialiconfont /*String*/ (null,__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._headeractionfontsize /*float*/ );
RDebugUtils.currentLine=24707089;
 //BA.debugLineNum = 24707089;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Private Sub UpdatePlayButtonAppearance(isHovered A";
RDebugUtils.currentLine=24641537;
 //BA.debugLineNum = 24641537;BA.debugLine="Dim backgroundColor As Int";
_backgroundcolor = 0;
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
RDebugUtils.currentLine=24641540;
 //BA.debugLineNum = 24641540;BA.debugLine="If isStarted Then";
if (__ref._isstarted /*boolean*/ ) { 
RDebugUtils.currentLine=24641541;
 //BA.debugLineNum = 24641541;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=24641542;
 //BA.debugLineNum = 24641542;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=24641543;
 //BA.debugLineNum = 24641543;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
 }else {
RDebugUtils.currentLine=24641545;
 //BA.debugLineNum = 24641545;BA.debugLine="backgroundColor = 0x08FFFFFF";
_backgroundcolor = ((int)0x08ffffff);
RDebugUtils.currentLine=24641546;
 //BA.debugLineNum = 24641546;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
 };
 }else {
RDebugUtils.currentLine=24641549;
 //BA.debugLineNum = 24641549;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=24641550;
 //BA.debugLineNum = 24641550;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=24641551;
 //BA.debugLineNum = 24641551;BA.debugLine="borderColor = 0x55D0FF71";
_bordercolor = ((int)0x55d0ff71);
 }else {
RDebugUtils.currentLine=24641553;
 //BA.debugLineNum = 24641553;BA.debugLine="backgroundColor = 0x07FFFFFF";
_backgroundcolor = ((int)0x07ffffff);
RDebugUtils.currentLine=24641554;
 //BA.debugLineNum = 24641554;BA.debugLine="borderColor = 0x40FFFFFF";
_bordercolor = ((int)0x40ffffff);
 };
 };
RDebugUtils.currentLine=24641557;
 //BA.debugLineNum = 24641557;BA.debugLine="If isStarted Or isHovered Then";
if (__ref._isstarted /*boolean*/  || _ishovered) { 
RDebugUtils.currentLine=24641558;
 //BA.debugLineNum = 24641558;BA.debugLine="orbitBorderColor = 0x66D0FF71";
_orbitbordercolor = ((int)0x66d0ff71);
 }else {
RDebugUtils.currentLine=24641560;
 //BA.debugLineNum = 24641560;BA.debugLine="orbitBorderColor = 0x22D0FF71";
_orbitbordercolor = ((int)0x22d0ff71);
 };
RDebugUtils.currentLine=24641562;
 //BA.debugLineNum = 24641562;BA.debugLine="playButtonPane.SetColorAndBorder(backgroundColor,";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_backgroundcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=24641563;
 //BA.debugLineNum = 24641563;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=24641564;
 //BA.debugLineNum = 24641564;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Private Sub UpdateCodeInputAppearance(isFocused As";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=24772611;
 //BA.debugLineNum = 24772611;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
RDebugUtils.currentLine=24772612;
 //BA.debugLineNum = 24772612;BA.debugLine="If isFocused Then";
if (_isfocused) { 
RDebugUtils.currentLine=24772613;
 //BA.debugLineNum = 24772613;BA.debugLine="fillColor = 0x10FFFFFF";
_fillcolor = ((int)0x10ffffff);
RDebugUtils.currentLine=24772614;
 //BA.debugLineNum = 24772614;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
RDebugUtils.currentLine=24772615;
 //BA.debugLineNum = 24772615;BA.debugLine="orbitBorderColor = 0x88FFFFFF";
_orbitbordercolor = ((int)0x88ffffff);
 }else {
RDebugUtils.currentLine=24772617;
 //BA.debugLineNum = 24772617;BA.debugLine="fillColor = 0x07FFFFFF";
_fillcolor = ((int)0x07ffffff);
RDebugUtils.currentLine=24772618;
 //BA.debugLineNum = 24772618;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
RDebugUtils.currentLine=24772619;
 //BA.debugLineNum = 24772619;BA.debugLine="orbitBorderColor = 0x66FFFFFF";
_orbitbordercolor = ((int)0x66ffffff);
 };
RDebugUtils.currentLine=24772621;
 //BA.debugLineNum = 24772621;BA.debugLine="accessCirclePane.SetColorAndBorder(fillColor, 4di";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=24772622;
 //BA.debugLineNum = 24772622;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=24772623;
 //BA.debugLineNum = 24772623;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0);
RDebugUtils.currentLine=24772624;
 //BA.debugLineNum = 24772624;BA.debugLine="SetPaneStyle(accessCirclePane, \"-fx-background-ra";
__ref._setpanestyle /*String*/ (null,__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=24772625;
 //BA.debugLineNum = 24772625;BA.debugLine="SetPaneStyle(accessCorePane, \"-fx-background-radi";
__ref._setpanestyle /*String*/ (null,__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=24772626;
 //BA.debugLineNum = 24772626;BA.debugLine="SetPaneStyle(accessInputPane, \"-fx-background-col";
__ref._setpanestyle /*String*/ (null,__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;");
RDebugUtils.currentLine=24772627;
 //BA.debugLineNum = 24772627;BA.debugLine="SetPaneStyle(txtPlayerCodeView, \"-fx-background-c";
__ref._setpanestyle /*String*/ (null,__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xfff2f7fb))+"; -fx-prompt-text-fill: "+__ref._colortocss /*String*/ (null,((int)0x66ffffff))+"; -fx-highlight-fill: transparent; -fx-highlight-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xfff2f7fb))+"; -fx-display-caret: true; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-font-size: "+BA.NumberToString(__ref._codefontsize /*float*/ )+"px; -fx-font-weight: bold; -fx-padding: 0 0 2 0;");
RDebugUtils.currentLine=24772628;
 //BA.debugLineNum = 24772628;BA.debugLine="End Sub";
return "";
}
public boolean  _cancrossfadeprepareditem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cancrossfadeprepareditem", false))
	 {return ((Boolean) Debug.delegate(ba, "cancrossfadeprepareditem", null));}
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Private Sub CanCrossfadePreparedItem As Boolean";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="If isQueueTransitioning Or isCrossfadeTriggered T";
if (__ref._isqueuetransitioning /*boolean*/  || __ref._iscrossfadetriggered /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="If currentMediaType <> \"track\" Then Return False";
if ((__ref._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="If preparedAudioKey = \"\" Or preparedItem.IsInitia";
if ((__ref._preparedaudiokey /*String*/ ).equals("") || __ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="If preparedItem.GetDefault(\"type\", \"\") <> \"track\"";
if ((__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="End Sub";
return false;
}
public boolean  _canstartpreparedontracktail(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canstartpreparedontracktail", false))
	 {return ((Boolean) Debug.delegate(ba, "canstartpreparedontracktail", null));}
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Private Sub CanStartPreparedOnTrackTail As Boolean";
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="If isQueueTransitioning Or isCrossfadeTriggered T";
if (__ref._isqueuetransitioning /*boolean*/  || __ref._iscrossfadetriggered /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="If currentMediaType <> \"track\" Then Return False";
if ((__ref._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=25624579;
 //BA.debugLineNum = 25624579;BA.debugLine="If preparedAudioKey = \"\" Or preparedItem.IsInitia";
if ((__ref._preparedaudiokey /*String*/ ).equals("") || __ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=25624580;
 //BA.debugLineNum = 25624580;BA.debugLine="Return preparedItem.GetDefault(\"type\", \"\") = \"ad\"";
if (true) return (__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"));
RDebugUtils.currentLine=25624581;
 //BA.debugLineNum = 25624581;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="j.Download(CONNECTIVITY_CHECK_URL & \"?t=\" & DateT";
_j._download /*String*/ (null,__ref._connectivity_check_url /*String*/ +"?t="+BA.NumberToString(parent.__c.DateTime.getNow()));
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="j.GetRequest.Timeout = CONNECTIVITY_CHECK_TIMEOUT";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._connectivity_check_timeout_ms /*int*/ );
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "checkexternalconnectivity"), (Object)(_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Dim ok As Boolean = j.Success";
_ok = _j._success /*boolean*/ ;
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Return ok";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ok));return;};
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Private Const PLAYER_BASE_URL As String = \"https:";
_player_base_url = "https://play.fon.fm/meta";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Private Const NEXT_BASE_URL As String = \"https://";
_next_base_url = "https://play.fon.fm/next";
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Private Const CLAIM_BASE_URL As String = \"https:/";
_claim_base_url = "https://play.fon.fm/claim";
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Private Const HISTORY_BASE_URL As String = \"https";
_history_base_url = "https://play.fon.fm/history";
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Private Const CONNECTIVITY_CHECK_URL As String =";
_connectivity_check_url = "https://radiosparx.ru/img/logo-dark.svg";
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="Private Const APP_VERSION As String = \"1.0.1\"";
_app_version = "1.0.1";
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="Private Const ICON_PLAY As String = Chr(0xE037)";
_icon_play = BA.ObjectToString(__c.Chr(((int)0xe037)));
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="Private Const ICON_STOP As String = Chr(0xE047)";
_icon_stop = BA.ObjectToString(__c.Chr(((int)0xe047)));
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="Private Const ICON_MORE As String = Chr(0xE5D3)";
_icon_more = BA.ObjectToString(__c.Chr(((int)0xe5d3)));
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="Private Const ICON_CLOSE As String = Chr(0xE5CD)";
_icon_close = BA.ObjectToString(__c.Chr(((int)0xe5cd)));
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="Private Const PREFETCH_SECONDS As Int = 10";
_prefetch_seconds = (int) (10);
RDebugUtils.currentLine=196620;
 //BA.debugLineNum = 196620;BA.debugLine="Private Const STOP_FADE_MS As Int = 3000";
_stop_fade_ms = (int) (3000);
RDebugUtils.currentLine=196621;
 //BA.debugLineNum = 196621;BA.debugLine="Private Const ORBIT_FADE_MS As Int = 3000";
_orbit_fade_ms = (int) (3000);
RDebugUtils.currentLine=196622;
 //BA.debugLineNum = 196622;BA.debugLine="Private Const TRACK_OVERLAP_MS As Int = 1800";
_track_overlap_ms = (int) (1800);
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="Private Const AD_TAIL_OVERLAP_MS As Int = 350";
_ad_tail_overlap_ms = (int) (350);
RDebugUtils.currentLine=196624;
 //BA.debugLineNum = 196624;BA.debugLine="Private Const HISTORY_LOG_DELAY_MS As Int = 15000";
_history_log_delay_ms = (int) (15000);
RDebugUtils.currentLine=196625;
 //BA.debugLineNum = 196625;BA.debugLine="Private Const FETCH_TIMEOUT_MS As Int = 8000";
_fetch_timeout_ms = (int) (8000);
RDebugUtils.currentLine=196626;
 //BA.debugLineNum = 196626;BA.debugLine="Private Const CONNECTIVITY_CHECK_TIMEOUT_MS As In";
_connectivity_check_timeout_ms = (int) (5000);
RDebugUtils.currentLine=196627;
 //BA.debugLineNum = 196627;BA.debugLine="Private Const PAUSE_RETRY_DELAY As Int = 300000";
_pause_retry_delay = (int) (300000);
RDebugUtils.currentLine=196628;
 //BA.debugLineNum = 196628;BA.debugLine="Private Const OFFLINE_RETRY_DELAY_INITIAL As Int";
_offline_retry_delay_initial = (int) (5000);
RDebugUtils.currentLine=196629;
 //BA.debugLineNum = 196629;BA.debugLine="Private Const OFFLINE_RETRY_DELAY_MAX As Int = 30";
_offline_retry_delay_max = (int) (30000);
RDebugUtils.currentLine=196630;
 //BA.debugLineNum = 196630;BA.debugLine="Private Const SERVER_RETRY_DELAY_INITIAL As Int =";
_server_retry_delay_initial = (int) (10000);
RDebugUtils.currentLine=196631;
 //BA.debugLineNum = 196631;BA.debugLine="Private Const SERVER_RETRY_DELAY_MAX As Int = 600";
_server_retry_delay_max = (int) (60000);
RDebugUtils.currentLine=196632;
 //BA.debugLineNum = 196632;BA.debugLine="Private Const BLOCKED_RETRY_DELAY As Int = 60000";
_blocked_retry_delay = (int) (60000);
RDebugUtils.currentLine=196633;
 //BA.debugLineNum = 196633;BA.debugLine="Private rootView As B4XView";
_rootview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196634;
 //BA.debugLineNum = 196634;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=196635;
 //BA.debugLineNum = 196635;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=196636;
 //BA.debugLineNum = 196636;BA.debugLine="Private storageFile As String = \"player_state.jso";
_storagefile = "player_state.json";
RDebugUtils.currentLine=196637;
 //BA.debugLineNum = 196637;BA.debugLine="Private debugResponsesDir As String";
_debugresponsesdir = "";
RDebugUtils.currentLine=196639;
 //BA.debugLineNum = 196639;BA.debugLine="Private card As B4XView";
_card = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196640;
 //BA.debugLineNum = 196640;BA.debugLine="Private headerPane As B4XView";
_headerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196641;
 //BA.debugLineNum = 196641;BA.debugLine="Private headerActionPane As B4XView";
_headeractionpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196642;
 //BA.debugLineNum = 196642;BA.debugLine="Private headerActionPane As B4XView";
_headeractionpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196643;
 //BA.debugLineNum = 196643;BA.debugLine="Private contentPane As B4XView";
_contentpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196644;
 //BA.debugLineNum = 196644;BA.debugLine="Private footerPane As B4XView";
_footerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196645;
 //BA.debugLineNum = 196645;BA.debugLine="Private setupPane As B4XView";
_setuppane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196646;
 //BA.debugLineNum = 196646;BA.debugLine="Private playerPane As B4XView";
_playerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196647;
 //BA.debugLineNum = 196647;BA.debugLine="Private setupHeroPane As B4XView";
_setupheropane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196648;
 //BA.debugLineNum = 196648;BA.debugLine="Private setupDetailPane As B4XView";
_setupdetailpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196649;
 //BA.debugLineNum = 196649;BA.debugLine="Private setupPrimaryPane As B4XView";
_setupprimarypane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196650;
 //BA.debugLineNum = 196650;BA.debugLine="Private setupStatusPane As B4XView";
_setupstatuspane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196651;
 //BA.debugLineNum = 196651;BA.debugLine="Private playerHeroPane As B4XView";
_playerheropane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196652;
 //BA.debugLineNum = 196652;BA.debugLine="Private playerDetailPane As B4XView";
_playerdetailpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196653;
 //BA.debugLineNum = 196653;BA.debugLine="Private playerPrimaryPane As B4XView";
_playerprimarypane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196654;
 //BA.debugLineNum = 196654;BA.debugLine="Private playerStatusPane As B4XView";
_playerstatuspane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196655;
 //BA.debugLineNum = 196655;BA.debugLine="Private orbitPane As B4XView";
_orbitpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196656;
 //BA.debugLineNum = 196656;BA.debugLine="Private playButtonPane As B4XView";
_playbuttonpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196657;
 //BA.debugLineNum = 196657;BA.debugLine="Private confirmPane As B4XView";
_confirmpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196658;
 //BA.debugLineNum = 196658;BA.debugLine="Private accessCirclePane As B4XView";
_accesscirclepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196659;
 //BA.debugLineNum = 196659;BA.debugLine="Private accessCorePane As B4XView";
_accesscorepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196660;
 //BA.debugLineNum = 196660;BA.debugLine="Private accessInputPane As B4XView";
_accessinputpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196662;
 //BA.debugLineNum = 196662;BA.debugLine="Private lblHeader As B4XView";
_lblheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196663;
 //BA.debugLineNum = 196663;BA.debugLine="Private lblHeaderAction As B4XView";
_lblheaderaction = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196664;
 //BA.debugLineNum = 196664;BA.debugLine="Private lblPlayIcon As B4XView";
_lblplayicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196665;
 //BA.debugLineNum = 196665;BA.debugLine="Private lblStream As B4XView";
_lblstream = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196666;
 //BA.debugLineNum = 196666;BA.debugLine="Private lblInfo As B4XView";
_lblinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196667;
 //BA.debugLineNum = 196667;BA.debugLine="Private lblFooter As B4XView";
_lblfooter = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196668;
 //BA.debugLineNum = 196668;BA.debugLine="Private lblSetupMessage As B4XView";
_lblsetupmessage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196670;
 //BA.debugLineNum = 196670;BA.debugLine="Private txtPlayerCode As TextField";
_txtplayercode = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=196671;
 //BA.debugLineNum = 196671;BA.debugLine="Private txtPlayerCodeView As B4XView";
_txtplayercodeview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196672;
 //BA.debugLineNum = 196672;BA.debugLine="Private btnSetupSubmit As B4XView";
_btnsetupsubmit = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196673;
 //BA.debugLineNum = 196673;BA.debugLine="Private btnConfirmYes As B4XView";
_btnconfirmyes = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196674;
 //BA.debugLineNum = 196674;BA.debugLine="Private btnConfirmNo As B4XView";
_btnconfirmno = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196675;
 //BA.debugLineNum = 196675;BA.debugLine="Private playIconBaseSize As Float";
_playiconbasesize = 0f;
RDebugUtils.currentLine=196676;
 //BA.debugLineNum = 196676;BA.debugLine="Private stopIconBaseSize As Float";
_stopiconbasesize = 0f;
RDebugUtils.currentLine=196677;
 //BA.debugLineNum = 196677;BA.debugLine="Private headerActionFontSize As Float";
_headeractionfontsize = 0f;
RDebugUtils.currentLine=196678;
 //BA.debugLineNum = 196678;BA.debugLine="Private codeFontSize As Float";
_codefontsize = 0f;
RDebugUtils.currentLine=196679;
 //BA.debugLineNum = 196679;BA.debugLine="Private isCodeInputFocused As Boolean";
_iscodeinputfocused = false;
RDebugUtils.currentLine=196681;
 //BA.debugLineNum = 196681;BA.debugLine="Private audioPrimary As AudioPlayer";
_audioprimary = new b4j.example.audioplayer();
RDebugUtils.currentLine=196682;
 //BA.debugLineNum = 196682;BA.debugLine="Private audioSecondary As AudioPlayer";
_audiosecondary = new b4j.example.audioplayer();
RDebugUtils.currentLine=196683;
 //BA.debugLineNum = 196683;BA.debugLine="Private storage As Map";
_storage = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196684;
 //BA.debugLineNum = 196684;BA.debugLine="Private playQueue As List";
_playqueue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=196685;
 //BA.debugLineNum = 196685;BA.debugLine="Private messages As Map";
_messages = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196686;
 //BA.debugLineNum = 196686;BA.debugLine="Private traceLogs As List";
_tracelogs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=196687;
 //BA.debugLineNum = 196687;BA.debugLine="Private traceLogLimit As Int = 1000";
_traceloglimit = (int) (1000);
RDebugUtils.currentLine=196688;
 //BA.debugLineNum = 196688;BA.debugLine="Private serverSnapshots As List";
_serversnapshots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=196689;
 //BA.debugLineNum = 196689;BA.debugLine="Private serverSnapshotLimit As Int = 30";
_serversnapshotlimit = (int) (30);
RDebugUtils.currentLine=196691;
 //BA.debugLineNum = 196691;BA.debugLine="Private retryTimer As Timer";
_retrytimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196692;
 //BA.debugLineNum = 196692;BA.debugLine="Private breakTimer As Timer";
_breaktimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196693;
 //BA.debugLineNum = 196693;BA.debugLine="Private historyTimer As Timer";
_historytimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196694;
 //BA.debugLineNum = 196694;BA.debugLine="Private orbitTimer As Timer";
_orbittimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196696;
 //BA.debugLineNum = 196696;BA.debugLine="Private playerCode As String";
_playercode = "";
RDebugUtils.currentLine=196697;
 //BA.debugLineNum = 196697;BA.debugLine="Private deviceId As String";
_deviceid = "";
RDebugUtils.currentLine=196698;
 //BA.debugLineNum = 196698;BA.debugLine="Private appScreenMode As String";
_appscreenmode = "";
RDebugUtils.currentLine=196699;
 //BA.debugLineNum = 196699;BA.debugLine="Private nextStartMode As String";
_nextstartmode = "";
RDebugUtils.currentLine=196700;
 //BA.debugLineNum = 196700;BA.debugLine="Private currentTrackUrl As String";
_currenttrackurl = "";
RDebugUtils.currentLine=196701;
 //BA.debugLineNum = 196701;BA.debugLine="Private currentMediaType As String";
_currentmediatype = "";
RDebugUtils.currentLine=196702;
 //BA.debugLineNum = 196702;BA.debugLine="Private activeAudioKey As String";
_activeaudiokey = "";
RDebugUtils.currentLine=196703;
 //BA.debugLineNum = 196703;BA.debugLine="Private preparedAudioKey As String";
_preparedaudiokey = "";
RDebugUtils.currentLine=196704;
 //BA.debugLineNum = 196704;BA.debugLine="Private historyItem As Map";
_historyitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196705;
 //BA.debugLineNum = 196705;BA.debugLine="Private activeItem As Map";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196706;
 //BA.debugLineNum = 196706;BA.debugLine="Private preparedItem As Map";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196707;
 //BA.debugLineNum = 196707;BA.debugLine="Private pendingPlayAudioKey As String";
_pendingplayaudiokey = "";
RDebugUtils.currentLine=196708;
 //BA.debugLineNum = 196708;BA.debugLine="Private pendingPrepareAudioKey As String";
_pendingprepareaudiokey = "";
RDebugUtils.currentLine=196709;
 //BA.debugLineNum = 196709;BA.debugLine="Private pendingPlayItem As Map";
_pendingplayitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196710;
 //BA.debugLineNum = 196710;BA.debugLine="Private pendingPrepareItem As Map";
_pendingprepareitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196711;
 //BA.debugLineNum = 196711;BA.debugLine="Private pendingPlayFadeInMs As Int";
_pendingplayfadeinms = 0;
RDebugUtils.currentLine=196713;
 //BA.debugLineNum = 196713;BA.debugLine="Private isStarted As Boolean";
_isstarted = false;
RDebugUtils.currentLine=196714;
 //BA.debugLineNum = 196714;BA.debugLine="Private isStoppedByUser As Boolean = True";
_isstoppedbyuser = __c.True;
RDebugUtils.currentLine=196715;
 //BA.debugLineNum = 196715;BA.debugLine="Private isStopping As Boolean";
_isstopping = false;
RDebugUtils.currentLine=196716;
 //BA.debugLineNum = 196716;BA.debugLine="Private isQueueTransitioning As Boolean";
_isqueuetransitioning = false;
RDebugUtils.currentLine=196717;
 //BA.debugLineNum = 196717;BA.debugLine="Private prefetchDone As Boolean";
_prefetchdone = false;
RDebugUtils.currentLine=196718;
 //BA.debugLineNum = 196718;BA.debugLine="Private isCrossfadeTriggered As Boolean";
_iscrossfadetriggered = false;
RDebugUtils.currentLine=196720;
 //BA.debugLineNum = 196720;BA.debugLine="Private offlineRetryDelay As Int = OFFLINE_RETRY_";
_offlineretrydelay = __ref._offline_retry_delay_initial /*int*/ ;
RDebugUtils.currentLine=196721;
 //BA.debugLineNum = 196721;BA.debugLine="Private serverRetryDelay As Int = SERVER_RETRY_DE";
_serverretrydelay = __ref._server_retry_delay_initial /*int*/ ;
RDebugUtils.currentLine=196722;
 //BA.debugLineNum = 196722;BA.debugLine="Private playlistIndex As Int = -1";
_playlistindex = (int) (-1);
RDebugUtils.currentLine=196723;
 //BA.debugLineNum = 196723;BA.debugLine="Private scheduledBreakAt As Long = -1";
_scheduledbreakat = (long) (-1);
RDebugUtils.currentLine=196724;
 //BA.debugLineNum = 196724;BA.debugLine="Private orbitPulseStep As Int";
_orbitpulsestep = 0;
RDebugUtils.currentLine=196725;
 //BA.debugLineNum = 196725;BA.debugLine="Private orbitFadeValue As Double";
_orbitfadevalue = 0;
RDebugUtils.currentLine=196726;
 //BA.debugLineNum = 196726;BA.debugLine="Private orbitFadeTarget As Double";
_orbitfadetarget = 0;
RDebugUtils.currentLine=196727;
 //BA.debugLineNum = 196727;BA.debugLine="End Sub";
return "";
}
public String  _cleanupserversnapshotfiles(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cleanupserversnapshotfiles", false))
	 {return ((String) Debug.delegate(ba, "cleanupserversnapshotfiles", null));}
anywheresoftware.b4a.objects.collections.List _files = null;
String _filename = "";
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Private Sub CleanupServerSnapshotFiles";
RDebugUtils.currentLine=26542081;
 //BA.debugLineNum = 26542081;BA.debugLine="Try";
try {RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="If File.Exists(debugResponsesDir, \"\") = False Th";
if (__c.File.Exists(__ref._debugresponsesdir /*String*/ ,"")==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=26542083;
 //BA.debugLineNum = 26542083;BA.debugLine="Dim files As List = File.ListFiles(debugResponse";
_files = new anywheresoftware.b4a.objects.collections.List();
_files = __c.File.ListFiles(__ref._debugresponsesdir /*String*/ );
RDebugUtils.currentLine=26542084;
 //BA.debugLineNum = 26542084;BA.debugLine="If files.IsInitialized = False Or files.Size <=";
if (_files.IsInitialized()==__c.False || _files.getSize()<=__ref._serversnapshotlimit /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=26542085;
 //BA.debugLineNum = 26542085;BA.debugLine="files.Sort(True)";
_files.Sort(__c.True);
RDebugUtils.currentLine=26542086;
 //BA.debugLineNum = 26542086;BA.debugLine="Do While files.Size > serverSnapshotLimit";
while (_files.getSize()>__ref._serversnapshotlimit /*int*/ ) {
RDebugUtils.currentLine=26542087;
 //BA.debugLineNum = 26542087;BA.debugLine="Dim fileName As String = files.Get(0)";
_filename = BA.ObjectToString(_files.Get((int) (0)));
RDebugUtils.currentLine=26542088;
 //BA.debugLineNum = 26542088;BA.debugLine="File.Delete(debugResponsesDir, fileName)";
__c.File.Delete(__ref._debugresponsesdir /*String*/ ,_filename);
RDebugUtils.currentLine=26542089;
 //BA.debugLineNum = 26542089;BA.debugLine="files.RemoveAt(0)";
_files.RemoveAt((int) (0));
 }
;
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=26542092;
 //BA.debugLineNum = 26542092;BA.debugLine="TraceLog(\"Не удалось очистить старые snapshots с";
__ref._tracelog /*String*/ (null,"Не удалось очистить старые snapshots сервера. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=26542094;
 //BA.debugLineNum = 26542094;BA.debugLine="End Sub";
return "";
}
public String  _clearexactbreakstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearexactbreakstate", false))
	 {return ((String) Debug.delegate(ba, "clearexactbreakstate", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub ClearExactBreakState";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="scheduledBreakAt = -1";
__ref._scheduledbreakat /*long*/  = (long) (-1);
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="breakTimer.Enabled = False";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="End Sub";
return "";
}
public String  _clearhistorylogtimer(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearhistorylogtimer", false))
	 {return ((String) Debug.delegate(ba, "clearhistorylogtimer", null));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub ClearHistoryLogTimer";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="historyTimer.Enabled = False";
__ref._historytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="historyItem.Initialize";
__ref._historyitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="End Sub";
return "";
}
public String  _clearpendingplaystate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearpendingplaystate", false))
	 {return ((String) Debug.delegate(ba, "clearpendingplaystate", null));}
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Private Sub ClearPendingPlayState";
RDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="pendingPlayAudioKey = \"\"";
__ref._pendingplayaudiokey /*String*/  = "";
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="pendingPlayItem.Initialize";
__ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=22872067;
 //BA.debugLineNum = 22872067;BA.debugLine="pendingPlayFadeInMs = 0";
__ref._pendingplayfadeinms /*int*/  = (int) (0);
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="End Sub";
return "";
}
public String  _clearplaybackstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearplaybackstate", false))
	 {return ((String) Debug.delegate(ba, "clearplaybackstate", null));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub ClearPlaybackState";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="TraceLog(\"ClearPlaybackState\")";
__ref._tracelog /*String*/ (null,"ClearPlaybackState");
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="audioPrimary.Reset";
__ref._audioprimary /*b4j.example.audioplayer*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="audioSecondary.Reset";
__ref._audiosecondary /*b4j.example.audioplayer*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="currentTrackUrl = \"\"";
__ref._currenttrackurl /*String*/  = "";
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="currentMediaType = \"\"";
__ref._currentmediatype /*String*/  = "";
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="activeAudioKey = \"\"";
__ref._activeaudiokey /*String*/  = "";
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="preparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="activeItem.Initialize";
__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="preparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=4259851;
 //BA.debugLineNum = 4259851;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,__c.False);
RDebugUtils.currentLine=4259852;
 //BA.debugLineNum = 4259852;BA.debugLine="playQueue.Clear";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="prefetchDone = False";
__ref._prefetchdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=4259854;
 //BA.debugLineNum = 4259854;BA.debugLine="isCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = __c.False;
RDebugUtils.currentLine=4259855;
 //BA.debugLineNum = 4259855;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=4259856;
 //BA.debugLineNum = 4259856;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=4259857;
 //BA.debugLineNum = 4259857;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=4259858;
 //BA.debugLineNum = 4259858;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=4259859;
 //BA.debugLineNum = 4259859;BA.debugLine="End Sub";
return "";
}
public String  _clearpreparedstate(b4j.example.b4xmainpage __ref,boolean _resetplayer) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearpreparedstate", false))
	 {return ((String) Debug.delegate(ba, "clearpreparedstate", new Object[] {_resetplayer}));}
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Private Sub ClearPreparedState(resetPlayer As Bool";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="If preparedAudioKey <> \"\" And resetPlayer Then";
if ((__ref._preparedaudiokey /*String*/ ).equals("") == false && _resetplayer) { 
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="GetAudioByKey(preparedAudioKey).Reset";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._preparedaudiokey /*String*/ )._reset /*String*/ (null);
 };
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="preparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=22806533;
 //BA.debugLineNum = 22806533;BA.debugLine="preparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=22806534;
 //BA.debugLineNum = 22806534;BA.debugLine="pendingPrepareAudioKey = \"\"";
__ref._pendingprepareaudiokey /*String*/  = "";
RDebugUtils.currentLine=22806535;
 //BA.debugLineNum = 22806535;BA.debugLine="pendingPrepareItem.Initialize";
__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=22806536;
 //BA.debugLineNum = 22806536;BA.debugLine="End Sub";
return "";
}
public String  _clearretrytimer(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearretrytimer", false))
	 {return ((String) Debug.delegate(ba, "clearretrytimer", null));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub ClearRetryTimer";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="retryTimer.Enabled = False";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
return "";
}
public String  _configureplayerheader(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "configureplayerheader", false))
	 {return ((String) Debug.delegate(ba, "configureplayerheader", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub ConfigurePlayerHeader";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="headerActionPane.Visible = True";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="lblHeaderAction.Text = ICON_MORE";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_more /*String*/ );
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="End Sub";
return "";
}
public String  _configuresetupscreen(b4j.example.b4xmainpage __ref,String _mode,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "configuresetupscreen", false))
	 {return ((String) Debug.delegate(ba, "configuresetupscreen", new Object[] {_mode,_text}));}
boolean _issettingsmode = false;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub ConfigureSetupScreen(mode As String, t";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim isSettingsMode As Boolean = mode = \"settings\"";
_issettingsmode = (_mode).equals("settings");
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="headerActionPane.Visible = mode <> \"setup\"";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible((_mode).equals("setup") == false);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="lblHeaderAction.Text = ICON_CLOSE";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_close /*String*/ );
 }else {
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="lblHeaderAction.Text = ICON_MORE";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_more /*String*/ );
 };
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="txtPlayerCode.Editable = False";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(__c.False);
 }else {
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="txtPlayerCode.Editable = True";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(__c.True);
 };
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="txtPlayerCode.Text = FormatPlayerCodeForDisplay(p";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ));
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="btnSetupSubmit.Text = MessageValue(\"logout\").ToU";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._messagevalue /*String*/ (null,"logout").toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 }else {
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="btnSetupSubmit.Text = MessageValue(\"setup_submit";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._messagevalue /*String*/ (null,"setup_submit").toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 };
RDebugUtils.currentLine=1114131;
 //BA.debugLineNum = 1114131;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=1114132;
 //BA.debugLineNum = 1114132;BA.debugLine="lblSetupMessage.Text = text";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
 }else 
{RDebugUtils.currentLine=1114133;
 //BA.debugLineNum = 1114133;BA.debugLine="Else If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="lblSetupMessage.Text = MessageValue(\"settings_th";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._messagevalue /*String*/ (null,"settings_thanks"));
 }else {
RDebugUtils.currentLine=1114136;
 //BA.debugLineNum = 1114136;BA.debugLine="lblSetupMessage.Text = MessageValue(\"setup_title";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._messagevalue /*String*/ (null,"setup_title"));
 }}
;
RDebugUtils.currentLine=1114138;
 //BA.debugLineNum = 1114138;BA.debugLine="If playerCode = \"\" Then lblHeader.Text = \"\"";
if ((__ref._playercode /*String*/ ).equals("")) { 
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");};
RDebugUtils.currentLine=1114139;
 //BA.debugLineNum = 1114139;BA.debugLine="End Sub";
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
public String  _consumepreparedqueueitem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "consumepreparedqueueitem", false))
	 {return ((String) Debug.delegate(ba, "consumepreparedqueueitem", null));}
anywheresoftware.b4a.objects.collections.Map _firstqueueditem = null;
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Private Sub ConsumePreparedQueueItem";
RDebugUtils.currentLine=23003137;
 //BA.debugLineNum = 23003137;BA.debugLine="If playQueue.Size = 0 Or preparedItem.IsInitializ";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 || __ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="If playQueue.Get(0) Is Map Then";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)) instanceof java.util.Map) { 
RDebugUtils.currentLine=23003139;
 //BA.debugLineNum = 23003139;BA.debugLine="Dim firstQueuedItem As Map = playQueue.Get(0)";
_firstqueueditem = new anywheresoftware.b4a.objects.collections.Map();
_firstqueueditem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=23003140;
 //BA.debugLineNum = 23003140;BA.debugLine="If ItemsMatch(firstQueuedItem, preparedItem) The";
if (__ref._itemsmatch /*boolean*/ (null,_firstqueueditem,__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ )) { 
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));};
 };
RDebugUtils.currentLine=23003142;
 //BA.debugLineNum = 23003142;BA.debugLine="End Sub";
return "";
}
public boolean  _itemsmatch(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _firstitem,anywheresoftware.b4a.objects.collections.Map _seconditem) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "itemsmatch", false))
	 {return ((Boolean) Debug.delegate(ba, "itemsmatch", new Object[] {_firstitem,_seconditem}));}
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Private Sub ItemsMatch(firstItem As Map, secondIte";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="If firstItem.IsInitialized = False Or secondItem.";
if (_firstitem.IsInitialized()==__c.False || _seconditem.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="If firstItem.GetDefault(\"type\", \"\") <> secondItem";
if ((_firstitem.GetDefault((Object)("type"),(Object)(""))).equals(_seconditem.GetDefault((Object)("type"),(Object)(""))) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=22937603;
 //BA.debugLineNum = 22937603;BA.debugLine="If firstItem.GetDefault(\"id\", \"\") <> \"\" And first";
if ((_firstitem.GetDefault((Object)("id"),(Object)(""))).equals((Object)("")) == false && (_firstitem.GetDefault((Object)("id"),(Object)(""))).equals(_seconditem.GetDefault((Object)("id"),(Object)("")))) { 
if (true) return __c.True;};
RDebugUtils.currentLine=22937604;
 //BA.debugLineNum = 22937604;BA.debugLine="Return MediaUrl(firstItem) = MediaUrl(secondItem)";
if (true) return (__ref._mediaurl /*String*/ (null,_firstitem)).equals(__ref._mediaurl /*String*/ (null,_seconditem));
RDebugUtils.currentLine=22937605;
 //BA.debugLineNum = 22937605;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _createclaimparams(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createclaimparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createclaimparams", null));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub CreateClaimParams As Map";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="params.Put(\"tz\", TimezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(__ref._timezoneoffsetminutes /*int*/ (null)));
RDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Private Sub TimezoneOffsetMinutes As Int";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="jo.InitializeStatic(\"java.time.OffsetDateTime\")";
_jo.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Dim nowOffset As JavaObject = jo.RunMethod(\"now\",";
_nowoffset = new anywheresoftware.b4j.object.JavaObject();
_nowoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("now",(Object[])(__c.Null))));
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Dim zoneOffset As JavaObject = nowOffset.RunMetho";
_zoneoffset = new anywheresoftware.b4j.object.JavaObject();
_zoneoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nowoffset.RunMethod("getOffset",(Object[])(__c.Null))));
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="Dim totalSeconds As Int = zoneOffset.RunMethod(\"g";
_totalseconds = (int)(BA.ObjectToNumber(_zoneoffset.RunMethod("getTotalSeconds",(Object[])(__c.Null))));
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="Return -Round(totalSeconds / 60)";
if (true) return (int) (-__c.Round(_totalseconds/(double)60));
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="End Sub";
return 0;
}
public String  _setlabelstyle(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setlabelstyle", false))
	 {return ((String) Debug.delegate(ba, "setlabelstyle", new Object[] {_view,_style}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Private Sub SetLabelStyle(view As B4XView, style A";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="jo.RunMethod(\"setStyle\", Array(MergeNodeStyle(jo.";
_jo.RunMethod("setStyle",new Object[]{(Object)(__ref._mergenodestyle /*String*/ (null,BA.ObjectToString(_jo.RunMethod("getStyle",(Object[])(__c.Null))),_style))});
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="End Sub";
return "";
}
public String  _setmousetransparent(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setmousetransparent", false))
	 {return ((String) Debug.delegate(ba, "setmousetransparent", new Object[] {_view,_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Private Sub SetMouseTransparent(view As B4XView, v";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(value))";
_jo.RunMethod("setMouseTransparent",new Object[]{(Object)(_value)});
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _createmetaparams(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createmetaparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createmetaparams", null));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub CreateMetaParams As Map";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="params.Put(\"tz\", TimezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(__ref._timezoneoffsetminutes /*int*/ (null)));
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createnextparams(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createnextparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createnextparams", null));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub CreateNextParams As Map";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="params.Put(\"tz\", TimezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(__ref._timezoneoffsetminutes /*int*/ (null)));
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="params.Put(\"version\", APP_VERSION)";
_params.Put((Object)("version"),(Object)(__ref._app_version /*String*/ ));
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="If nextStartMode = \"manual\" Or nextStartMode = \"a";
if ((__ref._nextstartmode /*String*/ ).equals("manual") || (__ref._nextstartmode /*String*/ ).equals("auto")) { 
_params.Put((Object)("start"),(Object)(__ref._nextstartmode /*String*/ ));};
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="If playlistIndex >= 0 Then params.Put(\"playlist\",";
if (__ref._playlistindex /*int*/ >=0) { 
_params.Put((Object)("playlist"),(Object)(__ref._playlistindex /*int*/ ));};
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=5898250;
 //BA.debugLineNum = 5898250;BA.debugLine="End Sub";
return null;
}
public double  _currentvolume(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "currentvolume", false))
	 {return ((Double) Debug.delegate(ba, "currentvolume", new Object[] {_item}));}
double _volume = 0;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Private Sub CurrentVolume(item As Map) As Double";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim volume As Double = 0.7";
_volume = 0.7;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="If item.ContainsKey(\"volume\") Then volume = item.";
if (_item.ContainsKey((Object)("volume"))) { 
_volume = (double)(BA.ObjectToNumber(_item.Get((Object)("volume"))));};
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="If volume < 0 Then volume = 0";
if (_volume<0) { 
_volume = 0;};
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="If volume > 1 Then volume = 1";
if (_volume>1) { 
_volume = 1;};
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="Return volume";
if (true) return _volume;
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="End Sub";
return 0;
}
public String  _joinlist(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="End Sub";
return "";
}
public long  _effectivetrackremainms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "effectivetrackremainms", false))
	 {return ((Long) Debug.delegate(ba, "effectivetrackremainms", null));}
long _trackremain = 0L;
b4j.example.audioplayer _activeaudio = null;
long _breakremain = 0L;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub EffectiveTrackRemainMs As Long";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim trackRemain As Long = 0";
_trackremain = (long) (0);
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="If activeAudioKey <> \"\" Then";
if ((__ref._activeaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Dim activeAudio As AudioPlayer = GetAudioByKey(a";
_activeaudio = __ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._activeaudiokey /*String*/ );
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="If activeAudio.Duration > 0 Then trackRemain = a";
if (_activeaudio._duration /*long*/ (null)>0) { 
_trackremain = (long) (_activeaudio._duration /*long*/ (null)-_activeaudio._position /*long*/ (null));};
 };
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="If scheduledBreakAt <= 0 Then Return trackRemain";
if (__ref._scheduledbreakat /*long*/ <=0) { 
if (true) return _trackremain;};
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="Dim breakRemain As Long = (scheduledBreakAt - Loc";
_breakremain = (long) ((__ref._scheduledbreakat /*long*/ -__ref._localnowtimestamp /*long*/ (null))*1000);
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="If trackRemain <= 0 Then Return breakRemain";
if (_trackremain<=0) { 
if (true) return _breakremain;};
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="Return Min(trackRemain, breakRemain)";
if (true) return (long) (__c.Min(_trackremain,_breakremain));
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="End Sub";
return 0L;
}
public long  _localnowtimestamp(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "localnowtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "localnowtimestamp", null));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub LocalNowTimestamp As Long";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Return Floor(DateTime.Now / 1000) - (TimezoneOffs";
if (true) return (long) (__c.Floor(__c.DateTime.getNow()/(double)1000)-(__ref._timezoneoffsetminutes /*int*/ (null)*60));
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="End Sub";
return 0L;
}
public String  _ensuredirectory(b4j.example.b4xmainpage __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=26476547;
 //BA.debugLineNum = 26476547;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=26476548;
 //BA.debugLineNum = 26476548;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="If playQueue.Size > 0 Then";
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
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Wait For (PlayQueueItem(ShiftQueueItem, 0)) Comp";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playpreparedorloadnext"), __ref._playqueueitem /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._shiftqueueitem /*Object*/ (null),(int) (0)));
this.state = 5;
return;
case 5:
//C
this.state = 4;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused2 As B";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playpreparedorloadnext"), __ref._loadnextandplay /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 6;
return;
case 6:
//C
this.state = -1;
_unused2 = (boolean) result[1];
;
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="result.Put(\"Success\", False)";
_result.Put((Object)("Success"),(Object)(parent.__c.False));
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="result.Put(\"Data\", Null)";
_result.Put((Object)("Data"),parent.__c.Null);
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="result.Put(\"ErrorMessage\", \"\")";
_result.Put((Object)("ErrorMessage"),(Object)(""));
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="TraceLog(\"HTTP GET. timeoutMs=\" & timeoutMs & \",";
__ref._tracelog /*String*/ (null,"HTTP GET. timeoutMs="+BA.NumberToString(_timeoutms)+", url="+_url);
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(_timeoutms);
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "fetchjsonwithtimeout"), (Object)(_j));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="Try";
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
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="Dim responseText As String = j.GetString";
_responsetext = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="SaveServerSnapshot(\"GET\", url, True, responseTe";
__ref._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.True,_responsetext,"");
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="parser.Initialize(responseText)";
_parser.Initialize(_responsetext);
RDebugUtils.currentLine=2293779;
 //BA.debugLineNum = 2293779;BA.debugLine="result.Put(\"Data\", parser.NextObject)";
_result.Put((Object)("Data"),(Object)(_parser.NextObject().getObject()));
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="result.Put(\"Success\", True)";
_result.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=2293781;
 //BA.debugLineNum = 2293781;BA.debugLine="result.Put(\"Kind\", \"\")";
_result.Put((Object)("Kind"),(Object)(""));
RDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="TraceLog(\"HTTP OK. url=\" & url)";
__ref._tracelog /*String*/ (null,"HTTP OK. url="+_url);
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=2293784;
 //BA.debugLineNum = 2293784;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
RDebugUtils.currentLine=2293785;
 //BA.debugLineNum = 2293785;BA.debugLine="result.Put(\"ErrorMessage\", \"bad_json\")";
_result.Put((Object)("ErrorMessage"),(Object)("bad_json"));
RDebugUtils.currentLine=2293786;
 //BA.debugLineNum = 2293786;BA.debugLine="SaveServerSnapshot(\"GET\", url, False, \"\", \"bad_";
__ref._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.False,"","bad_json");
RDebugUtils.currentLine=2293787;
 //BA.debugLineNum = 2293787;BA.debugLine="TraceLog(\"HTTP parse error. url=\" & url & \", me";
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
RDebugUtils.currentLine=2293790;
 //BA.debugLineNum = 2293790;BA.debugLine="Dim errorMessage As String = j.ErrorMessage";
_errormessage = _j._errormessage /*String*/ ;
RDebugUtils.currentLine=2293791;
 //BA.debugLineNum = 2293791;BA.debugLine="result.Put(\"ErrorMessage\", errorMessage)";
_result.Put((Object)("ErrorMessage"),(Object)(_errormessage));
RDebugUtils.currentLine=2293792;
 //BA.debugLineNum = 2293792;BA.debugLine="If errorMessage.ToLowerCase.Contains(\"timed out\"";
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
RDebugUtils.currentLine=2293793;
 //BA.debugLineNum = 2293793;BA.debugLine="result.Put(\"Kind\", \"offline\")";
_result.Put((Object)("Kind"),(Object)("offline"));
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=2293795;
 //BA.debugLineNum = 2293795;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=2293797;
 //BA.debugLineNum = 2293797;BA.debugLine="SaveServerSnapshot(\"GET\", url, False, \"\", errorM";
__ref._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.False,"",_errormessage);
RDebugUtils.currentLine=2293798;
 //BA.debugLineNum = 2293798;BA.debugLine="TraceLog(\"HTTP failed. kind=\" & result.GetDefaul";
__ref._tracelog /*String*/ (null,"HTTP failed. kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+", url="+_url+", message="+_errormessage);
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=2293800;
 //BA.debugLineNum = 2293800;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=2293801;
 //BA.debugLineNum = 2293801;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=2293802;
 //BA.debugLineNum = 2293802;BA.debugLine="End Sub";
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
public String  _saveserversnapshot(b4j.example.b4xmainpage __ref,String _method,String _url,boolean _success,String _body,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "saveserversnapshot", false))
	 {return ((String) Debug.delegate(ba, "saveserversnapshot", new Object[] {_method,_url,_success,_body,_errormessage}));}
String _timestamp = "";
String _header = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Private Sub SaveServerSnapshot(method As String, u";
RDebugUtils.currentLine=26345473;
 //BA.debugLineNum = 26345473;BA.debugLine="If serverSnapshots.IsInitialized = False Then ser";
if (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="Dim timestamp As String = DateTime.Date(DateTime.";
_timestamp = __c.DateTime.Date(__c.DateTime.getNow())+" "+__c.DateTime.Time(__c.DateTime.getNow());
RDebugUtils.currentLine=26345475;
 //BA.debugLineNum = 26345475;BA.debugLine="Dim header As String = timestamp & \" | \" & method";
_header = _timestamp+" | "+_method+" | success="+BA.ObjectToString(_success)+" | "+_url;
RDebugUtils.currentLine=26345476;
 //BA.debugLineNum = 26345476;BA.debugLine="If errorMessage <> \"\" Then header = header & \" |";
if ((_errormessage).equals("") == false) { 
_header = _header+" | error="+_errormessage;};
RDebugUtils.currentLine=26345477;
 //BA.debugLineNum = 26345477;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=26345478;
 //BA.debugLineNum = 26345478;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=26345479;
 //BA.debugLineNum = 26345479;BA.debugLine="entry.Put(\"Timestamp\", timestamp)";
_entry.Put((Object)("Timestamp"),(Object)(_timestamp));
RDebugUtils.currentLine=26345480;
 //BA.debugLineNum = 26345480;BA.debugLine="entry.Put(\"Method\", method)";
_entry.Put((Object)("Method"),(Object)(_method));
RDebugUtils.currentLine=26345481;
 //BA.debugLineNum = 26345481;BA.debugLine="entry.Put(\"Url\", url)";
_entry.Put((Object)("Url"),(Object)(_url));
RDebugUtils.currentLine=26345482;
 //BA.debugLineNum = 26345482;BA.debugLine="entry.Put(\"Success\", success)";
_entry.Put((Object)("Success"),(Object)(_success));
RDebugUtils.currentLine=26345483;
 //BA.debugLineNum = 26345483;BA.debugLine="entry.Put(\"Error\", errorMessage)";
_entry.Put((Object)("Error"),(Object)(_errormessage));
RDebugUtils.currentLine=26345484;
 //BA.debugLineNum = 26345484;BA.debugLine="entry.Put(\"Body\", body)";
_entry.Put((Object)("Body"),(Object)(_body));
RDebugUtils.currentLine=26345485;
 //BA.debugLineNum = 26345485;BA.debugLine="entry.Put(\"Header\", header)";
_entry.Put((Object)("Header"),(Object)(_header));
RDebugUtils.currentLine=26345486;
 //BA.debugLineNum = 26345486;BA.debugLine="serverSnapshots.Add(entry)";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry.getObject()));
RDebugUtils.currentLine=26345487;
 //BA.debugLineNum = 26345487;BA.debugLine="Do While serverSnapshots.Size > serverSnapshotLim";
while (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._serversnapshotlimit /*int*/ ) {
RDebugUtils.currentLine=26345488;
 //BA.debugLineNum = 26345488;BA.debugLine="serverSnapshots.RemoveAt(0)";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=26345490;
 //BA.debugLineNum = 26345490;BA.debugLine="WriteServerSnapshotFile(entry)";
__ref._writeserversnapshotfile /*String*/ (null,_entry);
RDebugUtils.currentLine=26345491;
 //BA.debugLineNum = 26345491;BA.debugLine="CleanupServerSnapshotFiles";
__ref._cleanupserversnapshotfiles /*String*/ (null);
RDebugUtils.currentLine=26345492;
 //BA.debugLineNum = 26345492;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Wait For (FetchJsonWithTimeout(NEXT_BASE_URL & \"?";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "fetchnext"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._next_base_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,__ref._createnextparams /*anywheresoftware.b4a.objects.collections.Map*/ (null)),__ref._fetch_timeout_ms /*int*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="nextStartMode = \"\"";
__ref._nextstartmode /*String*/  = "";
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub FilterPlayerCode(value As String) As S";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Dim filtered As String = Regex.Replace(\"[^A-Za-z0";
_filtered = __c.Regex.Replace("[^A-Za-z0-9]",_value,"");
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="If filtered.Length > 5 Then filtered = filtered.S";
if (_filtered.length()>5) { 
_filtered = _filtered.substring((int) (0),(int) (5));};
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Return filtered.ToUpperCase";
if (true) return _filtered.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="End Sub";
return "";
}
public String  _getinactiveaudiokey(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getinactiveaudiokey", false))
	 {return ((String) Debug.delegate(ba, "getinactiveaudiokey", null));}
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Private Sub GetInactiveAudioKey As String";
RDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="If activeAudioKey = \"primary\" Then Return \"second";
if ((__ref._activeaudiokey /*String*/ ).equals("primary")) { 
if (true) return "secondary";};
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="Return \"primary\"";
if (true) return "primary";
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="End Sub";
return "";
}
public String  _getorcreatedeviceid(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getorcreatedeviceid", false))
	 {return ((String) Debug.delegate(ba, "getorcreatedeviceid", null));}
String _id = "";
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _uuid = null;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub GetOrCreateDeviceId As String";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Dim id As String = storage.GetDefault(\"device_id\"";
_id = BA.ObjectToString(__ref._storage /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("device_id"),(Object)("")));
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="If id <> \"\" Then Return id";
if ((_id).equals("") == false) { 
if (true) return _id;};
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="jo.InitializeStatic(\"java.util.UUID\")";
_jo.InitializeStatic("java.util.UUID");
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="Dim uuid As JavaObject = jo.RunMethod(\"randomUUID";
_uuid = new anywheresoftware.b4j.object.JavaObject();
_uuid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("randomUUID",(Object[])(__c.Null))));
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="id = uuid.RunMethod(\"toString\", Null)";
_id = BA.ObjectToString(_uuid.RunMethod("toString",(Object[])(__c.Null)));
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="SaveValue(\"device_id\", id)";
__ref._savevalue /*String*/ (null,"device_id",(Object)(_id));
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="Return id";
if (true) return _id;
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="End Sub";
return "";
}
public String  _savevalue(b4j.example.b4xmainpage __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "savevalue", false))
	 {return ((String) Debug.delegate(ba, "savevalue", new Object[] {_key,_value}));}
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _gen = null;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Private Sub SaveValue(key As String, value As Obje";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="storage.Put(key, value)";
__ref._storage /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),_value);
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Dim gen As JSONGenerator";
_gen = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="gen.Initialize(storage)";
_gen.Initialize(__ref._storage /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="File.WriteString(storageDir, storageFile, gen.ToS";
__c.File.WriteString(__ref._storagedir /*String*/ ,__ref._storagefile /*String*/ ,_gen.ToString());
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getservertracelist(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getservertracelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getservertracelist", null));}
anywheresoftware.b4a.objects.collections.List _copy = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Public Sub GetServerTraceList As List";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=26279939;
 //BA.debugLineNum = 26279939;BA.debugLine="If serverSnapshots.IsInitialized = False Then Ret";
if (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=26279940;
 //BA.debugLineNum = 26279940;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
RDebugUtils.currentLine=26279941;
 //BA.debugLineNum = 26279941;BA.debugLine="copy.Add(CloneMap(entry))";
_copy.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_entry).getObject()));
 }
};
RDebugUtils.currentLine=26279943;
 //BA.debugLineNum = 26279943;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=26279944;
 //BA.debugLineNum = 26279944;BA.debugLine="End Sub";
return null;
}
public String  _getservertracetext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getservertracetext", false))
	 {return ((String) Debug.delegate(ba, "getservertracetext", null));}
anywheresoftware.b4a.objects.collections.List _lines = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Public Sub GetServerTraceText As String";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="If serverSnapshots.IsInitialized = False Or serve";
if (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="Dim lines As List";
_lines = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=26214403;
 //BA.debugLineNum = 26214403;BA.debugLine="lines.Initialize";
_lines.Initialize();
RDebugUtils.currentLine=26214404;
 //BA.debugLineNum = 26214404;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
RDebugUtils.currentLine=26214405;
 //BA.debugLineNum = 26214405;BA.debugLine="lines.Add(entry.GetDefault(\"Header\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Header"),(Object)("")));
RDebugUtils.currentLine=26214406;
 //BA.debugLineNum = 26214406;BA.debugLine="lines.Add(entry.GetDefault(\"Body\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Body"),(Object)("")));
RDebugUtils.currentLine=26214407;
 //BA.debugLineNum = 26214407;BA.debugLine="lines.Add(\"\")";
_lines.Add((Object)(""));
 }
};
RDebugUtils.currentLine=26214409;
 //BA.debugLineNum = 26214409;BA.debugLine="Return JoinList(lines, CRLF)";
if (true) return __ref._joinlist /*String*/ (null,_lines,__c.CRLF);
RDebugUtils.currentLine=26214410;
 //BA.debugLineNum = 26214410;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _gettraceloglist(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "gettraceloglist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettraceloglist", null));}
anywheresoftware.b4a.objects.collections.List _copy = null;
String _entry = "";
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Public Sub GetTraceLogList As List";
RDebugUtils.currentLine=25952257;
 //BA.debugLineNum = 25952257;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=25952259;
 //BA.debugLineNum = 25952259;BA.debugLine="If traceLogs.IsInitialized = False Then Return co";
if (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=25952260;
 //BA.debugLineNum = 25952260;BA.debugLine="For Each entry As String In traceLogs";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=25952261;
 //BA.debugLineNum = 25952261;BA.debugLine="copy.Add(entry)";
_copy.Add((Object)(_entry));
 }
};
RDebugUtils.currentLine=25952263;
 //BA.debugLineNum = 25952263;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=25952264;
 //BA.debugLineNum = 25952264;BA.debugLine="End Sub";
return null;
}
public String  _gettracelogtext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "gettracelogtext", false))
	 {return ((String) Debug.delegate(ba, "gettracelogtext", null));}
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Public Sub GetTraceLogText As String";
RDebugUtils.currentLine=25886721;
 //BA.debugLineNum = 25886721;BA.debugLine="If traceLogs.IsInitialized = False Or traceLogs.S";
if (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="Return JoinList(traceLogs, CRLF)";
if (true) return __ref._joinlist /*String*/ (null,__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ ,__c.CRLF);
RDebugUtils.currentLine=25886723;
 //BA.debugLineNum = 25886723;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Private Sub PromotePreparedPlayer(fadeInMs As Int,";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="If preparedAudioKey = \"\" Or preparedItem.IsInitia";
if ((__ref._preparedaudiokey /*String*/ ).equals("") || __ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="Dim previousAudioKey As String = activeAudioKey";
_previousaudiokey = __ref._activeaudiokey /*String*/ ;
RDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="Dim nextAudioKey As String = preparedAudioKey";
_nextaudiokey = __ref._preparedaudiokey /*String*/ ;
RDebugUtils.currentLine=23396356;
 //BA.debugLineNum = 23396356;BA.debugLine="Dim promotedItem As Map = CloneMap(preparedItem)";
_promoteditem = new anywheresoftware.b4a.objects.collections.Map();
_promoteditem = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=23396357;
 //BA.debugLineNum = 23396357;BA.debugLine="TraceLog(\"PromotePreparedPlayer. fromAudio=\" & pr";
__ref._tracelog /*String*/ (null,"PromotePreparedPlayer. fromAudio="+_previousaudiokey+", toAudio="+_nextaudiokey+", item="+__ref._describeitem /*String*/ (null,(Object)(_promoteditem.getObject()))+", fadeOutMs="+BA.NumberToString(_fadeoutms));
RDebugUtils.currentLine=23396358;
 //BA.debugLineNum = 23396358;BA.debugLine="ConsumePreparedQueueItem";
__ref._consumepreparedqueueitem /*String*/ (null);
RDebugUtils.currentLine=23396359;
 //BA.debugLineNum = 23396359;BA.debugLine="If previousAudioKey <> \"\" And previousAudioKey <>";
if ((_previousaudiokey).equals("") == false && (_previousaudiokey).equals(_nextaudiokey) == false) { 
RDebugUtils.currentLine=23396360;
 //BA.debugLineNum = 23396360;BA.debugLine="GetAudioByKey(previousAudioKey).Stop(fadeOutMs)";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_previousaudiokey)._stop /*String*/ (null,_fadeoutms);
 };
RDebugUtils.currentLine=23396362;
 //BA.debugLineNum = 23396362;BA.debugLine="activeAudioKey = nextAudioKey";
__ref._activeaudiokey /*String*/  = _nextaudiokey;
RDebugUtils.currentLine=23396363;
 //BA.debugLineNum = 23396363;BA.debugLine="ActivateLoadedItem(activeAudioKey, promotedItem,";
__ref._activateloadeditem /*String*/ (null,__ref._activeaudiokey /*String*/ ,_promoteditem,_fadeinms);
RDebugUtils.currentLine=23396364;
 //BA.debugLineNum = 23396364;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,__c.False);
RDebugUtils.currentLine=23396365;
 //BA.debugLineNum = 23396365;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=23396366;
 //BA.debugLineNum = 23396366;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Wait For (CheckExternalConnectivity) Complete (ha";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handlemediaerror"), __ref._checkexternalconnectivity /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_hasinternet = (boolean) result[1];
;
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="If hasInternet Then";
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
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="HandleTemporaryState(\"offline\", \"\")";
__ref._handletemporarystate /*String*/ (null,"offline","");
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Private Sub PreparedFadeInMs As Int";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="End Sub";
return 0;
}
public int  _preparedfadeoutms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "preparedfadeoutms", false))
	 {return ((Integer) Debug.delegate(ba, "preparedfadeoutms", null));}
String _nexttype = "";
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Private Sub PreparedFadeOutMs As Int";
RDebugUtils.currentLine=25755649;
 //BA.debugLineNum = 25755649;BA.debugLine="If currentMediaType <> \"track\" Then Return 0";
if ((__ref._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="If preparedItem.IsInitialized = False Then Return";
if (__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=25755651;
 //BA.debugLineNum = 25755651;BA.debugLine="Dim nextType As String = preparedItem.GetDefault(";
_nexttype = BA.ObjectToString(__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=25755652;
 //BA.debugLineNum = 25755652;BA.debugLine="If nextType = \"track\" Then Return TRACK_OVERLAP_M";
if ((_nexttype).equals("track")) { 
if (true) return __ref._track_overlap_ms /*int*/ ;};
RDebugUtils.currentLine=25755653;
 //BA.debugLineNum = 25755653;BA.debugLine="If nextType = \"ad\" Then Return AD_TAIL_OVERLAP_MS";
if ((_nexttype).equals("ad")) { 
if (true) return __ref._ad_tail_overlap_ms /*int*/ ;};
RDebugUtils.currentLine=25755654;
 //BA.debugLineNum = 25755654;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=25755655;
 //BA.debugLineNum = 25755655;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="If playQueue.Size > 0 Then";
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
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepare";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_preparedok = (boolean) result[1];
;
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Return preparedOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedok));return;};
 if (true) break;
;
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="If HasPendingExactBreak Then Return False";

case 4:
//if
this.state = 9;
if (__ref._haspendingexactbreak /*boolean*/ (null)) { 
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
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Wait For (FetchNext) Complete (result As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._fetchnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="If result.GetDefault(\"Success\", False) = False Or";
if (true) break;

case 10:
//if
this.state = 15;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False)) || __ref._isstarted /*boolean*/ ==parent.__c.False || __ref._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="Dim queue As List = NormalizeQueueResponse(result";
_queue = new anywheresoftware.b4a.objects.collections.List();
_queue = __ref._normalizequeueresponse /*anywheresoftware.b4a.objects.collections.List*/ (null,_result.Get((Object)("Data")));
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="If queue.IsInitialized = False Or queue.Size = 0";
if (true) break;

case 16:
//if
this.state = 21;
if (_queue.IsInitialized()==parent.__c.False || _queue.getSize()==0) { 
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
this.state = -1;
;
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="playQueue = queue";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/  = _queue;
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepared";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 24;
return;
case 24:
//C
this.state = -1;
_preparedok = (boolean) result[1];
;
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="Return preparedOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedok));return;};
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub HandleBlockedState";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="TraceLog(\"Плеер заблокирован.\")";
__ref._tracelog /*String*/ (null,"Плеер заблокирован.");
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="ShowMessage(MessageValue(\"blocked\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"blocked"));
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="ScheduleRetry(\"blocked\", 0)";
__ref._scheduleretry /*String*/ (null,"blocked",(int) (0));
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="End Sub";
return "";
}
public String  _showmessage(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showmessage", false))
	 {return ((String) Debug.delegate(ba, "showmessage", new Object[] {_text}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub ShowMessage(text As String)";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="SetStatusText(text)";
__ref._setstatustext /*String*/ (null,_text);
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="End Sub";
return "";
}
public String  _scheduleretry(b4j.example.b4xmainpage __ref,String _mode,int _delayms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "scheduleretry", false))
	 {return ((String) Debug.delegate(ba, "scheduleretry", new Object[] {_mode,_delayms}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub ScheduleRetry(mode As String, delayMs";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="retryTimer.Interval = ResolveRetryDelay(mode, del";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._resolveretrydelay /*int*/ (null,_mode,_delayms)));
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="TraceLog(\"ScheduleRetry. mode=\" & mode & \", delay";
__ref._tracelog /*String*/ (null,"ScheduleRetry. mode="+_mode+", delayMs="+BA.NumberToString(__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .getInterval()));
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="retryTimer.Enabled = True";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="TraceLog(\"Ошибка загрузки данных. kind=\" & result";
__ref._tracelog /*String*/ (null,"Ошибка загрузки данных. kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+", message="+BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)(""))));
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="If result.GetDefault(\"Kind\", \"\") = \"offline\" Then";
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
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="HandleTemporaryState(\"offline\", \"\")";
__ref._handletemporarystate /*String*/ (null,"offline","");
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Wait For (CheckExternalConnectivity) Complete (ha";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handlefetchfailure"), __ref._checkexternalconnectivity /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_hasinternet = (boolean) result[1];
;
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="If hasInternet Then";
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
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="HandleTemporaryState(\"offline\", \"\")";
__ref._handletemporarystate /*String*/ (null,"offline","");
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub HandleTemporaryState(mode As String, t";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="TraceLog(\"Временное состояние. mode=\" & mode & \",";
__ref._tracelog /*String*/ (null,"Временное состояние. mode="+_mode+", text="+_text);
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="ShowMessage(text)";
__ref._showmessage /*String*/ (null,_text);
 }else 
{RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Else If mode = \"offline\" Then";
if ((_mode).equals("offline")) { 
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="ShowMessage(MessageValue(\"offline\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"offline"));
 }else {
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="ShowMessage(MessageValue(\"server_wait\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"server_wait"));
 }}
;
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="ScheduleRetry(mode, 0)";
__ref._scheduleretry /*String*/ (null,_mode,(int) (0));
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="End Sub";
return "";
}
public String  _handlemessageitem(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handlemessageitem", false))
	 {return ((String) Debug.delegate(ba, "handlemessageitem", new Object[] {_item}));}
String _action = "";
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub HandleMessageItem(item As Map)";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim action As String = item.GetDefault(\"action\",";
_action = BA.ObjectToString(_item.GetDefault((Object)("action"),(Object)("")));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="TraceLog(\"HandleMessageItem. action=\" & action &";
__ref._tracelog /*String*/ (null,"HandleMessageItem. action="+_action+", message="+BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(""))));
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="If action = \"claim\" Then";
if ((_action).equals("claim")) { 
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="isStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="isStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = __c.True;
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="ShowClaimPrompt(item.GetDefault(\"message\", Messa";
__ref._showclaimprompt /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"device_busy")))));
 }else 
{RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="Else If action = \"blocked\" Then";
if ((_action).equals("blocked")) { 
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="HandleBlockedState";
__ref._handleblockedstate /*String*/ (null);
 }else 
{RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="Else If action = \"not_found\" Then";
if ((_action).equals("not_found")) { 
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="StopForMissingData(item.GetDefault(\"message\", Me";
__ref._stopformissingdata /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"not_found")))));
 }else {
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="HandleTemporaryState(\"server\", item.GetDefault(\"";
__ref._handletemporarystate /*String*/ (null,"server",BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"server_wait")))));
 }}}
;
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="End Sub";
return "";
}
public String  _setplayicon(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setplayicon", false))
	 {return ((String) Debug.delegate(ba, "setplayicon", null));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Private Sub SetPlayIcon";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="SetLabelStyle(lblPlayIcon, \"-fx-alignment: center";
__ref._setlabelstyle /*String*/ (null,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xffd0ff71))+"; -fx-padding: 0;");
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="lblPlayIcon.Text = ICON_PLAY";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_play /*String*/ );
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="ApplyMaterialIconFont(lblPlayIcon, playIconBaseSi";
__ref._applymaterialiconfont /*String*/ (null,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._playiconbasesize /*float*/ );
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x00d0ff71),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="StopOrbitAnimation";
__ref._stoporbitanimation /*String*/ (null);
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="End Sub";
return "";
}
public String  _showclaimprompt(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showclaimprompt", false))
	 {return ((String) Debug.delegate(ba, "showclaimprompt", new Object[] {_text}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub ShowClaimPrompt(text As String)";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="isStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="isStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = __c.True;
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="SetStatusText(text)";
__ref._setstatustext /*String*/ (null,_text);
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="confirmPane.Visible = True";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="LayoutUi(rootView.Width, rootView.Height)";
__ref._layoutui /*String*/ (null,(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="End Sub";
return "";
}
public String  _stopformissingdata(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "stopformissingdata", false))
	 {return ((String) Debug.delegate(ba, "stopformissingdata", new Object[] {_text}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub StopForMissingData(text As String)";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="TraceLog(\"Остановка из-за отсутствующих данных. t";
__ref._tracelog /*String*/ (null,"Остановка из-за отсутствующих данных. text="+_text);
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="isStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="isStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = __c.True;
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="ShowMessage(text)";
__ref._showmessage /*String*/ (null,_text);
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="End Sub";
return "";
}
public boolean  _haspendingexactbreak(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "haspendingexactbreak", false))
	 {return ((Boolean) Debug.delegate(ba, "haspendingexactbreak", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Private Sub HasPendingExactBreak As Boolean";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Return scheduledBreakAt > LocalNowTimestamp";
if (true) return __ref._scheduledbreakat /*long*/ >__ref._localnowtimestamp /*long*/ (null);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return false;
}
public String  _headeractionpane_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_click", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_click", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub HeaderActionPane_Click";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If appScreenMode = \"player\" Then";
if ((__ref._appscreenmode /*String*/ ).equals("player")) { 
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="ShowSettingsScreen";
__ref._showsettingsscreen /*String*/ (null);
 }else 
{RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Else If appScreenMode = \"settings\" Then";
if ((__ref._appscreenmode /*String*/ ).equals("settings")) { 
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="ShowPlayerScreen(False)";
__ref._showplayerscreen /*void*/ (null,__c.False);
 }}
;
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="End Sub";
return "";
}
public String  _showsettingsscreen(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showsettingsscreen", false))
	 {return ((String) Debug.delegate(ba, "showsettingsscreen", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub ShowSettingsScreen";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="If playerCode = \"\" Then";
if ((__ref._playercode /*String*/ ).equals("")) { 
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="ShowSetupScreen(\"\")";
__ref._showsetupscreen /*String*/ (null,"");
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="appScreenMode = \"settings\"";
__ref._appscreenmode /*String*/  = "settings";
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="ConfigureSetupScreen(\"settings\", \"\")";
__ref._configuresetupscreen /*String*/ (null,"settings","");
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="appScreenMode = \"player\"";
__ref._appscreenmode /*String*/  = "player";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="ConfigurePlayerHeader";
__ref._configureplayerheader /*String*/ (null);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="If isStarted = False Then ApplyStoppedState";
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
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="If refreshInfo = False Then Return";
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
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="RenderPlayerHead(playerCode, \"\")";
__ref._renderplayerhead /*String*/ (null,__ref._playercode /*String*/ ,"");
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Wait For (InitPlayerInfo) Complete (unused As Boo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "showplayerscreen"), __ref._initplayerinfo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Private Sub HeaderActionPane_MouseClicked (eventDa";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="HeaderActionPane_Click";
__ref._headeractionpane_click /*String*/ (null);
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="End Sub";
return "";
}
public String  _headeractionpane_mouseentered(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Private Sub HeaderActionPane_MouseEntered (eventDa";
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="UpdateHeaderActionAppearance(True)";
__ref._updateheaderactionappearance /*String*/ (null,__c.True);
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="End Sub";
return "";
}
public String  _headeractionpane_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Private Sub HeaderActionPane_MouseExited (eventDat";
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="UpdateHeaderActionAppearance(False)";
__ref._updateheaderactionappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="End Sub";
return "";
}
public String  _hidecontentblocks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hidecontentblocks", false))
	 {return ((String) Debug.delegate(ba, "hidecontentblocks", null));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Private Sub HideContentBlocks";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="SetStreamText(\"\")";
__ref._setstreamtext /*String*/ (null,"");
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="End Sub";
return "";
}
public String  _setstreamtext(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setstreamtext", false))
	 {return ((String) Debug.delegate(ba, "setstreamtext", new Object[] {_text}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Private Sub SetStreamText(text As String)";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="lblStream.Text = text";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="historyTimer.Enabled = False";
__ref._historytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
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
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="If historyItem.IsInitialized = False Then Return";
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
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="If currentMediaType <> historyItem.GetDefault(\"ty";
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
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="If currentTrackUrl = \"\" Then Return";
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
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="Wait For (SendHistory(historyItem)) Complete (unu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "historytimer_tick"), __ref._sendhistory /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._historyitem /*anywheresoftware.b4a.objects.collections.Map*/ ));
this.state = 25;
return;
case 25:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="TraceLog(\"SendHistory. item=\" & DescribeItem(item";
__ref._tracelog /*String*/ (null,"SendHistory. item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject())));
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="params.Put(\"type\", item.GetDefault(\"type\", \"\"))";
_params.Put((Object)("type"),_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="params.Put(\"id\", item.GetDefault(\"id\", \"\"))";
_params.Put((Object)("id"),_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="params.Put(\"date\", DateTime.Date(DateTime.Now))";
_params.Put((Object)("date"),(Object)(parent.__c.DateTime.Date(parent.__c.DateTime.getNow())));
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="params.Put(\"time\", DateTime.Time(DateTime.Now))";
_params.Put((Object)("time"),(Object)(parent.__c.DateTime.Time(parent.__c.DateTime.getNow())));
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="j.PostString(HISTORY_BASE_URL, BuildParams(params";
_j._poststring /*String*/ (null,__ref._history_base_url /*String*/ ,__ref._buildparams /*String*/ (null,_params));
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="j.GetRequest.Timeout = 5000";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (5000));
RDebugUtils.currentLine=4063246;
 //BA.debugLineNum = 4063246;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-fo";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/x-www-form-urlencoded;charset=UTF-8");
RDebugUtils.currentLine=4063247;
 //BA.debugLineNum = 4063247;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "sendhistory"), (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=4063249;
 //BA.debugLineNum = 4063249;BA.debugLine="SaveServerSnapshot(\"POST\", HISTORY_BASE_URL, Tru";
__ref._saveserversnapshot /*String*/ (null,"POST",__ref._history_base_url /*String*/ ,parent.__c.True,_j._getstring /*String*/ (null),"");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=4063251;
 //BA.debugLineNum = 4063251;BA.debugLine="SaveServerSnapshot(\"POST\", HISTORY_BASE_URL, Fal";
__ref._saveserversnapshot /*String*/ (null,"POST",__ref._history_base_url /*String*/ ,parent.__c.False,"",_j._errormessage /*String*/ );
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=4063253;
 //BA.debugLineNum = 4063253;BA.debugLine="TraceLog(\"SendHistory complete. success=\" & j.Suc";
__ref._tracelog /*String*/ (null,"SendHistory complete. success="+BA.ObjectToString(_j._success /*boolean*/ ));
RDebugUtils.currentLine=4063254;
 //BA.debugLineNum = 4063254;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=4063255;
 //BA.debugLineNum = 4063255;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=4063256;
 //BA.debugLineNum = 4063256;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="If playerCode = \"\" Then Return False";
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
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Wait For (FetchJsonWithTimeout(PLAYER_BASE_URL &";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "initplayerinfo"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._player_base_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,__ref._createmetaparams /*anywheresoftware.b4a.objects.collections.Map*/ (null)),__ref._fetch_timeout_ms /*int*/ ));
this.state = 19;
return;
case 19:
//C
this.state = 7;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
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
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="RenderPlayerHead(playerCode, \"\")";
__ref._renderplayerhead /*String*/ (null,__ref._playercode /*String*/ ,"");
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="If resultData Is Map Then";
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
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="If data.GetDefault(\"ok\", False) <> True Then";
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
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="RenderPlayerHead(playerCode, \"\")";
__ref._renderplayerhead /*String*/ (null,__ref._playercode /*String*/ ,"");
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="RenderPlayerHead(data.GetDefault(\"code\", playerC";
__ref._renderplayerhead /*String*/ (null,BA.ObjectToString(_data.GetDefault((Object)("code"),(Object)(__ref._playercode /*String*/ ))),BA.ObjectToString(_data.GetDefault((Object)("title"),(Object)(""))));
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="RenderPlayerHead(playerCode, \"\")";
__ref._renderplayerhead /*String*/ (null,__ref._playercode /*String*/ ,"");
RDebugUtils.currentLine=1900562;
 //BA.debugLineNum = 1900562;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=1900563;
 //BA.debugLineNum = 1900563;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Private Sub RenderPlayerHead(code As String, title";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Dim safeCode As String = FormatPlayerCodeForDispl";
_safecode = __ref._formatplayercodefordisplay /*String*/ (null,_code);
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="If title <> \"\" Then";
if ((_title).equals("") == false) { 
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="lblHeader.Text = safeCode & \" • \" & title.ToUppe";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_safecode+" • "+_title.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 }else {
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="lblHeader.Text = safeCode";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_safecode);
 };
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadstorage(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "loadstorage", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadstorage", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub LoadStorage As Map";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="If File.Exists(storageDir, storageFile) = False T";
if (__c.File.Exists(__ref._storagedir /*String*/ ,__ref._storagefile /*String*/ )==__c.False) { 
if (true) return _m;};
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Try";
try {RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="parser.Initialize(File.ReadString(storageDir, st";
_parser.Initialize(__c.File.ReadString(__ref._storagedir /*String*/ ,__ref._storagefile /*String*/ ));
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="m = parser.NextObject";
_m = _parser.NextObject();
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="m.Initialize";
_m.Initialize();
 };
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="End Sub";
return null;
}
public String  _normalizeplayercode(b4j.example.b4xmainpage __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizeplayercode", false))
	 {return ((String) Debug.delegate(ba, "normalizeplayercode", new Object[] {_value}));}
String _code = "";
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub NormalizePlayerCode(value As String) A";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Dim code As String = value.Trim.ToLowerCase";
_code = _value.trim().toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="If Regex.IsMatch(\"^[a-z0-9]{5}$\", code) Then Retu";
if (__c.Regex.IsMatch("^[a-z0-9]{5}$",_code)) { 
if (true) return _code;};
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="End Sub";
return "";
}
public int  _scalevalue(b4j.example.b4xmainpage __ref,int _availablewidth,int _smallvalue,int _mediumvalue,int _largevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "scalevalue", false))
	 {return ((Integer) Debug.delegate(ba, "scalevalue", new Object[] {_availablewidth,_smallvalue,_mediumvalue,_largevalue}));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Private Sub ScaleValue(availableWidth As Int, smal";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="If availableWidth <= 420dip Then Return smallValu";
if (_availablewidth<=__c.DipToCurrent((int) (420))) { 
if (true) return _smallvalue;};
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="If availableWidth <= 720dip Then Return mediumVal";
if (_availablewidth<=__c.DipToCurrent((int) (720))) { 
if (true) return _mediumvalue;};
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="Return largeValue";
if (true) return _largevalue;
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 786477;BA.debugLine="card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFF";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0xff1a1b1e),__c.DipToCurrent((int) (1)),((int)0x14ffffff),_cardradius);
RDebugUtils.currentLine=786478;
 //BA.debugLineNum = 786478;BA.debugLine="UpdateHeaderActionAppearance(False)";
__ref._updateheaderactionappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=786479;
 //BA.debugLineNum = 786479;BA.debugLine="UpdateCodeInputAppearance(isCodeInputFocused)";
__ref._updatecodeinputappearance /*String*/ (null,__ref._iscodeinputfocused /*boolean*/ );
RDebugUtils.currentLine=786480;
 //BA.debugLineNum = 786480;BA.debugLine="If isStarted Then";
if (__ref._isstarted /*boolean*/ ) { 
RDebugUtils.currentLine=786481;
 //BA.debugLineNum = 786481;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
 }else {
RDebugUtils.currentLine=786483;
 //BA.debugLineNum = 786483;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
 };
RDebugUtils.currentLine=786485;
 //BA.debugLineNum = 786485;BA.debugLine="End Sub";
return "";
}
public String  _updatevisiblemode(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updatevisiblemode", false))
	 {return ((String) Debug.delegate(ba, "updatevisiblemode", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub UpdateVisibleMode";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="setupPane.Visible = appScreenMode <> \"player\"";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible((__ref._appscreenmode /*String*/ ).equals("player") == false);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="If appScreenMode = \"player\" Then";
if ((__ref._appscreenmode /*String*/ ).equals("player")) { 
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="playerPane.Visible = True";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="playerPane.Visible = False";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="If appScreenMode = \"setup\" Then headerActionPane.";
if ((__ref._appscreenmode /*String*/ ).equals("setup")) { 
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);};
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="TraceLog(\"Запрос очереди и запуск. Режим старта=\"";
__ref._tracelog /*String*/ (null,"Запрос очереди и запуск. Режим старта="+__ref._nextstartmode /*String*/ +", размер очереди до запроса="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Wait For (FetchNext) Complete (result As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "loadnextandplay"), __ref._fetchnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
if (true) break;

case 1:
//if
this.state = 4;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Wait For (HandleFetchFailure(result)) Complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "loadnextandplay"), __ref._handlefetchfailure /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_result));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";

case 4:
//if
this.state = 9;
if (__ref._isstarted /*boolean*/ ==parent.__c.False || __ref._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="ResetRetryDelay";
__ref._resetretrydelay /*String*/ (null);
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="Dim queue As List = NormalizeQueueResponse(result";
_queue = new anywheresoftware.b4a.objects.collections.List();
_queue = __ref._normalizequeueresponse /*anywheresoftware.b4a.objects.collections.List*/ (null,_result.Get((Object)("Data")));
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="If queue.IsInitialized = False Or queue.Size = 0";
if (true) break;

case 10:
//if
this.state = 13;
if (_queue.IsInitialized()==parent.__c.False || _queue.getSize()==0) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="playQueue = queue";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/  = _queue;
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="Dim retryAfter As Int = NormalizeRetryAfter(resul";
_retryafter = __ref._normalizeretryafter /*int*/ (null,_result.Get((Object)("Data")));
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="TraceLog(\"Очередь загружена. Элементов=\" & playQu";
__ref._tracelog /*String*/ (null,"Очередь загружена. Элементов="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+", retryAfter="+BA.NumberToString(_retryafter));
RDebugUtils.currentLine=2031635;
 //BA.debugLineNum = 2031635;BA.debugLine="Wait For (PlayQueueItem(ShiftQueueItem, retryAfte";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "loadnextandplay"), __ref._playqueueitem /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._shiftqueueitem /*Object*/ (null),_retryafter));
this.state = 16;
return;
case 16:
//C
this.state = -1;
_unused2 = (boolean) result[1];
;
RDebugUtils.currentLine=2031636;
 //BA.debugLineNum = 2031636;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=2031637;
 //BA.debugLineNum = 2031637;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub NormalizeQueueResponse(data As Object)";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="If data Is Map Then";
if (_data instanceof java.util.Map) { 
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Dim m As Map = data";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data));
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="Dim items As List = m.GetDefault(\"queue\", Null)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.GetDefault((Object)("queue"),__c.Null)));
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="If items.IsInitialized = False Then Return Null";
if (_items.IsInitialized()==__c.False) { 
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));};
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="Dim normalized As List";
_normalized = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="normalized.Initialize";
_normalized.Initialize();
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="For Each item As Object In items";
{
final anywheresoftware.b4a.BA.IterableList group7 = _items;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_item = group7.Get(index7);
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="If item Is Map Then normalized.Add(item)";
if (_item instanceof java.util.Map) { 
_normalized.Add(_item);};
 }
};
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="Return normalized";
if (true) return _normalized;
 };
RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="End Sub";
return null;
}
public String  _syncexactbreakstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "syncexactbreakstate", false))
	 {return ((String) Debug.delegate(ba, "syncexactbreakstate", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub SyncExactBreakState";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="ResolveScheduledBreakAt";
__ref._resolvescheduledbreakat /*String*/ (null);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="ScheduleBreakWatch";
__ref._schedulebreakwatch /*String*/ (null);
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="End Sub";
return "";
}
public int  _normalizeretryafter(b4j.example.b4xmainpage __ref,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizeretryafter", false))
	 {return ((Integer) Debug.delegate(ba, "normalizeretryafter", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
int _value = 0;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub NormalizeRetryAfter(data As Object) As";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="If data Is Map Then";
if (_data instanceof java.util.Map) { 
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim m As Map = data";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data));
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="If m.ContainsKey(\"retry_after\") = False Then Ret";
if (_m.ContainsKey((Object)("retry_after"))==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="Dim value As Int = m.Get(\"retry_after\")";
_value = (int)(BA.ObjectToNumber(_m.Get((Object)("retry_after"))));
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="If value <= 0 Then Return 0";
if (_value<=0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="Return value";
if (true) return _value;
 };
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="End Sub";
return 0;
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
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="isCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="If current Is Map Then";
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
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Dim item As Map = current";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_current));
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="TraceLog(\"PlayQueueItem. type=\" & itemType & \",";
__ref._tracelog /*String*/ (null,"PlayQueueItem. type="+_itemtype+", retryAfter="+BA.NumberToString(_retryafter)+", item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject())));
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="If itemType = \"message\" Then";
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
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="HandleMessageItem(item)";
__ref._handlemessageitem /*String*/ (null,_item);
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="If itemType = \"update\" Then";

case 7:
//if
this.state = 10;
if ((_itemtype).equals("update")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="isStarted = False";
__ref._isstarted /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="isStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="ShowMessage(item.GetDefault(\"message\", MessageV";
__ref._showmessage /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"player_reloading")))));
RDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=2424854;
 //BA.debugLineNum = 2424854;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=2424855;
 //BA.debugLineNum = 2424855;BA.debugLine="If itemType = \"idle\" Then";
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
RDebugUtils.currentLine=2424856;
 //BA.debugLineNum = 2424856;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=2424857;
 //BA.debugLineNum = 2424857;BA.debugLine="ShowMessage(item.GetDefault(\"message\", MessageV";
__ref._showmessage /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"idle")))));
RDebugUtils.currentLine=2424858;
 //BA.debugLineNum = 2424858;BA.debugLine="If retryAfter > 0 Then";
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
RDebugUtils.currentLine=2424859;
 //BA.debugLineNum = 2424859;BA.debugLine="ScheduleRetry(\"server\", retryAfter * 1000)";
__ref._scheduleretry /*String*/ (null,"server",(int) (_retryafter*1000));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=2424861;
 //BA.debugLineNum = 2424861;BA.debugLine="ScheduleRetry(\"server\", PAUSE_RETRY_DELAY)";
__ref._scheduleretry /*String*/ (null,"server",__ref._pause_retry_delay /*int*/ );
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=2424863;
 //BA.debugLineNum = 2424863;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=2424866;
 //BA.debugLineNum = 2424866;BA.debugLine="If itemType = \"break\" Then";

case 20:
//if
this.state = 23;
if ((_itemtype).equals("break")) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=2424867;
 //BA.debugLineNum = 2424867;BA.debugLine="MergeBreakItems(item)";
__ref._mergebreakitems /*String*/ (null,_item);
RDebugUtils.currentLine=2424868;
 //BA.debugLineNum = 2424868;BA.debugLine="Wait For (PlayPreparedOrLoadNext) Complete (unu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playqueueitem"), __ref._playpreparedorloadnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 51;
return;
case 51:
//C
this.state = 23;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=2424869;
 //BA.debugLineNum = 2424869;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=2424872;
 //BA.debugLineNum = 2424872;BA.debugLine="If itemType <> \"track\" And itemType <> \"ad\" Then";

case 23:
//if
this.state = 26;
if ((_itemtype).equals("track") == false && (_itemtype).equals("ad") == false) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=2424873;
 //BA.debugLineNum = 2424873;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=2424874;
 //BA.debugLineNum = 2424874;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=2424877;
 //BA.debugLineNum = 2424877;BA.debugLine="Dim url As String = MediaUrl(item)";
_url = __ref._mediaurl /*String*/ (null,_item);
RDebugUtils.currentLine=2424878;
 //BA.debugLineNum = 2424878;BA.debugLine="If url = \"\" Then";
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
RDebugUtils.currentLine=2424879;
 //BA.debugLineNum = 2424879;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=2424880;
 //BA.debugLineNum = 2424880;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=2424883;
 //BA.debugLineNum = 2424883;BA.debugLine="If item.ContainsKey(\"playlist\") Then playlistInd";

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
RDebugUtils.currentLine=2424884;
 //BA.debugLineNum = 2424884;BA.debugLine="prefetchDone = False";
__ref._prefetchdone /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=2424885;
 //BA.debugLineNum = 2424885;BA.debugLine="Dim fadeInMs As Int = 0";
_fadeinms = (int) (0);
RDebugUtils.currentLine=2424886;
 //BA.debugLineNum = 2424886;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioK";
_targetaudiokey = __ref._getinactiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=2424887;
 //BA.debugLineNum = 2424887;BA.debugLine="If activeAudioKey = \"\" Then targetAudioKey = \"pr";
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
RDebugUtils.currentLine=2424888;
 //BA.debugLineNum = 2424888;BA.debugLine="Wait For (StartPlaybackWithAudioKey(targetAudioK";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playqueueitem"), __ref._startplaybackwithaudiokey /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_targetaudiokey,_item,_fadeinms));
this.state = 52;
return;
case 52:
//C
this.state = 42;
_playbackstarted = (boolean) result[1];
;
RDebugUtils.currentLine=2424889;
 //BA.debugLineNum = 2424889;BA.debugLine="If playbackStarted = False Or isStarted = False";
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
RDebugUtils.currentLine=2424890;
 //BA.debugLineNum = 2424890;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=2424892;
 //BA.debugLineNum = 2424892;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=2424893;
 //BA.debugLineNum = 2424893;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 50:
//C
this.state = -1;
;
RDebugUtils.currentLine=2424895;
 //BA.debugLineNum = 2424895;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub ShiftQueueItem As Object";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="If playQueue.Size = 0 Then Return Null";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Dim item As Object = playQueue.Get(0)";
_item = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0));
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="playQueue.RemoveAt(0)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="Return item";
if (true) return _item;
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="End Sub";
return null;
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
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="If isStopping Then Return False";
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
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="isStopping = True";
__ref._isstopping /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="TraceLog(\"StopPlayer requested. currentType=\" & c";
__ref._tracelog /*String*/ (null,"StopPlayer requested. currentType="+__ref._currentmediatype /*String*/ +", activeAudio="+__ref._activeaudiokey /*String*/ +", preparedAudio="+__ref._preparedaudiokey /*String*/ );
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="isStarted = False";
__ref._isstarted /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="isStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="ResetRetryDelay";
__ref._resetretrydelay /*String*/ (null);
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="If activeAudioKey <> \"\" Then";
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
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="If currentMediaType = \"track\" Then";
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
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="GetAudioByKey(activeAudioKey).Stop(STOP_FADE_MS";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._activeaudiokey /*String*/ )._stop /*String*/ (null,__ref._stop_fade_ms /*int*/ );
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="GetAudioByKey(activeAudioKey).Stop(0)";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._activeaudiokey /*String*/ )._stop /*String*/ (null,(int) (0));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
RDebugUtils.currentLine=4194321;
 //BA.debugLineNum = 4194321;BA.debugLine="If preparedAudioKey <> \"\" Then GetAudioByKey(prep";

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
RDebugUtils.currentLine=4194322;
 //BA.debugLineNum = 4194322;BA.debugLine="currentTrackUrl = \"\"";
__ref._currenttrackurl /*String*/  = "";
RDebugUtils.currentLine=4194323;
 //BA.debugLineNum = 4194323;BA.debugLine="currentMediaType = \"\"";
__ref._currentmediatype /*String*/  = "";
RDebugUtils.currentLine=4194324;
 //BA.debugLineNum = 4194324;BA.debugLine="activeAudioKey = \"\"";
__ref._activeaudiokey /*String*/  = "";
RDebugUtils.currentLine=4194325;
 //BA.debugLineNum = 4194325;BA.debugLine="preparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=4194326;
 //BA.debugLineNum = 4194326;BA.debugLine="activeItem.Initialize";
__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=4194327;
 //BA.debugLineNum = 4194327;BA.debugLine="preparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=4194328;
 //BA.debugLineNum = 4194328;BA.debugLine="playlistIndex = -1";
__ref._playlistindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=4194329;
 //BA.debugLineNum = 4194329;BA.debugLine="playQueue.Clear";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=4194330;
 //BA.debugLineNum = 4194330;BA.debugLine="prefetchDone = False";
__ref._prefetchdone /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=4194331;
 //BA.debugLineNum = 4194331;BA.debugLine="isCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=4194332;
 //BA.debugLineNum = 4194332;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=4194333;
 //BA.debugLineNum = 4194333;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=4194334;
 //BA.debugLineNum = 4194334;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=4194335;
 //BA.debugLineNum = 4194335;BA.debugLine="ApplyStoppedState";
__ref._applystoppedstate /*String*/ (null);
RDebugUtils.currentLine=4194336;
 //BA.debugLineNum = 4194336;BA.debugLine="isStopping = False";
__ref._isstopping /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=4194337;
 //BA.debugLineNum = 4194337;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=4194338;
 //BA.debugLineNum = 4194338;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub ShowSetupScreen(text As String)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="appScreenMode = \"setup\"";
__ref._appscreenmode /*String*/  = "setup";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="isStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="isStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = __c.True;
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="lblHeader.Text = \"\"";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="ConfigureSetupScreen(\"setup\", text)";
__ref._configuresetupscreen /*String*/ (null,"setup",_text);
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="If txtPlayerCode.IsInitialized Then txtPlayerCode";
if (__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .IsInitialized()) { 
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .RequestFocus();};
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub MergeBreakItems(item As Map)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim items As List = item.GetDefault(\"items\", Null";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.GetDefault((Object)("items"),__c.Null)));
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="If items.IsInitialized = False Or items.Size = 0";
if (_items.IsInitialized()==__c.False || _items.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Dim merged As List";
_merged = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="merged.Initialize";
_merged.Initialize();
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="For Each breakItem As Object In items";
{
final anywheresoftware.b4a.BA.IterableList group5 = _items;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_breakitem = group5.Get(index5);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="merged.Add(breakItem)";
_merged.Add(_breakitem);
 }
};
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="For Each existing As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_existing = group8.Get(index8);
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="merged.Add(existing)";
_merged.Add(_existing);
 }
};
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="playQueue = merged";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/  = _merged;
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="TraceLog(\"В очередь добавлен break. Размер очеред";
__ref._tracelog /*String*/ (null,"В очередь добавлен break. Размер очереди="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+", scheduledBreakAt="+BA.NumberToString(__ref._scheduledbreakat /*long*/ ));
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="End Sub";
return "";
}
public String  _mergenodestyle(b4j.example.b4xmainpage __ref,String _currentstyle,String _extrastyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "mergenodestyle", false))
	 {return ((String) Debug.delegate(ba, "mergenodestyle", new Object[] {_currentstyle,_extrastyle}));}
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Private Sub MergeNodeStyle(currentStyle As String,";
RDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="If currentStyle = Null Or currentStyle.Trim = \"\"";
if (_currentstyle== null || (_currentstyle.trim()).equals("")) { 
if (true) return _extrastyle;};
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="If extraStyle = Null Or extraStyle.Trim = \"\" Then";
if (_extrastyle== null || (_extrastyle.trim()).equals("")) { 
if (true) return _currentstyle;};
RDebugUtils.currentLine=24903683;
 //BA.debugLineNum = 24903683;BA.debugLine="If currentStyle.EndsWith(\";\") Then";
if (_currentstyle.endsWith(";")) { 
RDebugUtils.currentLine=24903684;
 //BA.debugLineNum = 24903684;BA.debugLine="Return currentStyle & \" \" & extraStyle";
if (true) return _currentstyle+" "+_extrastyle;
 }else {
RDebugUtils.currentLine=24903686;
 //BA.debugLineNum = 24903686;BA.debugLine="Return currentStyle & \"; \" & extraStyle";
if (true) return _currentstyle+"; "+_extrastyle;
 };
RDebugUtils.currentLine=24903688;
 //BA.debugLineNum = 24903688;BA.debugLine="End Sub";
return "";
}
public String  _orbittimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "orbittimer_tick", false))
	 {return ((String) Debug.delegate(ba, "orbittimer_tick", null));}
double _fadestep = 0;
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Private Sub OrbitTimer_Tick";
RDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="orbitPulseStep = (orbitPulseStep + 1) Mod 24";
__ref._orbitpulsestep /*int*/  = (int) ((__ref._orbitpulsestep /*int*/ +1)%24);
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="Dim fadeStep As Double = orbitTimer.Interval / OR";
_fadestep = __ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .getInterval()/(double)__ref._orbit_fade_ms /*int*/ ;
RDebugUtils.currentLine=25165827;
 //BA.debugLineNum = 25165827;BA.debugLine="If orbitFadeValue < orbitFadeTarget Then";
if (__ref._orbitfadevalue /*double*/ <__ref._orbitfadetarget /*double*/ ) { 
RDebugUtils.currentLine=25165828;
 //BA.debugLineNum = 25165828;BA.debugLine="orbitFadeValue = Min(orbitFadeTarget, orbitFadeV";
__ref._orbitfadevalue /*double*/  = __c.Min(__ref._orbitfadetarget /*double*/ ,__ref._orbitfadevalue /*double*/ +_fadestep);
 }else 
{RDebugUtils.currentLine=25165829;
 //BA.debugLineNum = 25165829;BA.debugLine="Else If orbitFadeValue > orbitFadeTarget Then";
if (__ref._orbitfadevalue /*double*/ >__ref._orbitfadetarget /*double*/ ) { 
RDebugUtils.currentLine=25165830;
 //BA.debugLineNum = 25165830;BA.debugLine="orbitFadeValue = Max(orbitFadeTarget, orbitFadeV";
__ref._orbitfadevalue /*double*/  = __c.Max(__ref._orbitfadetarget /*double*/ ,__ref._orbitfadevalue /*double*/ -_fadestep);
 }}
;
RDebugUtils.currentLine=25165832;
 //BA.debugLineNum = 25165832;BA.debugLine="ApplyOrbitFrame(orbitPulseStep)";
__ref._applyorbitframe /*String*/ (null,__ref._orbitpulsestep /*int*/ );
RDebugUtils.currentLine=25165833;
 //BA.debugLineNum = 25165833;BA.debugLine="If orbitFadeValue = 0 And orbitFadeTarget = 0 The";
if (__ref._orbitfadevalue /*double*/ ==0 && __ref._orbitfadetarget /*double*/ ==0) { 
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);};
RDebugUtils.currentLine=25165834;
 //BA.debugLineNum = 25165834;BA.debugLine="End Sub";
return "";
}
public String  _playbackstartdone(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _unusedresult) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbackstartdone", false))
	 {return ((String) Debug.delegate(ba, "playbackstartdone", new Object[] {_unusedresult}));}
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Private Sub PlaybackStartDone(unusedResult As Map)";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="If unusedResult.IsInitialized Then";
if (_unusedresult.IsInitialized()) { 
 };
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If playerCode = \"\" Then";
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
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="ShowSetupScreen(MessageValue(\"player_required\"))";
__ref._showsetupscreen /*String*/ (null,__ref._messagevalue /*String*/ (null,"player_required"));
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="If isStarted = False Then";

case 4:
//if
this.state = 13;
if (__ref._isstarted /*boolean*/ ==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="If isStopping Then Return";
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
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="isStarted = True";
__ref._isstarted /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="isStoppedByUser = False";
__ref._isstoppedbyuser /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="Wait For (StartFirstTrack(\"manual\")) Complete (u";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playbuttonpane_click"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"manual"));
this.state = 19;
return;
case 19:
//C
this.state = 13;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="If isStopping Then Return";

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
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="Wait For (StopPlayer) Complete (unused2 As Boolea";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playbuttonpane_click"), __ref._stopplayer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 20;
return;
case 20:
//C
this.state = -1;
_unused2 = (boolean) result[1];
;
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setstopicon(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setstopicon", false))
	 {return ((String) Debug.delegate(ba, "setstopicon", null));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Private Sub SetStopIcon";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="SetLabelStyle(lblPlayIcon, \"-fx-alignment: center";
__ref._setlabelstyle /*String*/ (null,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xffd0ff71))+"; -fx-padding: 0;");
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="lblPlayIcon.Text = ICON_STOP";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_stop /*String*/ );
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="ApplyMaterialIconFont(lblPlayIcon, stopIconBaseSi";
__ref._applymaterialiconfont /*String*/ (null,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._stopiconbasesize /*float*/ );
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x66d0ff71),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="StartOrbitAnimation";
__ref._startorbitanimation /*String*/ (null);
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="nextStartMode = mode";
__ref._nextstartmode /*String*/  = _mode;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="playQueue.Clear";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="prefetchDone = False";
__ref._prefetchdone /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="isCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="TraceLog(\"Запуск первого трека. Режим=\" & mode)";
__ref._tracelog /*String*/ (null,"Запуск первого трека. Режим="+_mode);
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused As Bo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "startfirsttrack"), __ref._loadnextandplay /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Private Sub PlayButtonPane_MouseClicked (eventData";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="PlayButtonPane_Click";
__ref._playbuttonpane_click /*void*/ (null);
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="End Sub";
return "";
}
public String  _playbuttonpane_mouseentered(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbuttonpane_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "playbuttonpane_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Private Sub PlayButtonPane_MouseEntered (eventData";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="UpdatePlayButtonAppearance(True)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.True);
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="End Sub";
return "";
}
public String  _playbuttonpane_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbuttonpane_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "playbuttonpane_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Private Sub PlayButtonPane_MouseExited (eventData";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="pendingPlayAudioKey = audioKey";
__ref._pendingplayaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=23199747;
 //BA.debugLineNum = 23199747;BA.debugLine="pendingPlayItem = item";
__ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/  = _item;
RDebugUtils.currentLine=23199748;
 //BA.debugLineNum = 23199748;BA.debugLine="pendingPlayFadeInMs = fadeInMs";
__ref._pendingplayfadeinms /*int*/  = _fadeinms;
RDebugUtils.currentLine=23199749;
 //BA.debugLineNum = 23199749;BA.debugLine="TraceLog(\"StartPlaybackWithAudioKey. audio=\" & au";
__ref._tracelog /*String*/ (null,"StartPlaybackWithAudioKey. audio="+_audiokey+", item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject()))+", volume="+parent.__c.NumberFormat2(__ref._currentvolume /*double*/ (null,_item),(int) (1),(int) (3),(int) (3),parent.__c.False)+", fadeInMs="+BA.NumberToString(_fadeinms));
RDebugUtils.currentLine=23199750;
 //BA.debugLineNum = 23199750;BA.debugLine="GetAudioByKey(audioKey).LoadUrl(MediaUrl(item), C";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_audiokey)._loadurl /*String*/ (null,__ref._mediaurl /*String*/ (null,_item),__ref._currentvolume /*double*/ (null,_item));
RDebugUtils.currentLine=23199751;
 //BA.debugLineNum = 23199751;BA.debugLine="Wait For PlaybackStartDone(result As Map)";
parent.__c.WaitFor("playbackstartdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "startplaybackwithaudiokey"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=23199752;
 //BA.debugLineNum = 23199752;BA.debugLine="TraceLog(\"PlaybackStartDone. audio=\" & audioKey &";
__ref._tracelog /*String*/ (null,"PlaybackStartDone. audio="+_audiokey+", success="+BA.ObjectToString(_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)))+", message="+BA.ObjectToString(_result.GetDefault((Object)("Message"),(Object)(""))));
RDebugUtils.currentLine=23199753;
 //BA.debugLineNum = 23199753;BA.debugLine="Return result.GetDefault(\"Success\", False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)));return;};
RDebugUtils.currentLine=23199754;
 //BA.debugLineNum = 23199754;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
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
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="If playQueue.Size = 0 Then Return False";
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
RDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="Dim nextObject As Object = playQueue.Get(0)";
_nextobject = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0));
RDebugUtils.currentLine=23265284;
 //BA.debugLineNum = 23265284;BA.debugLine="If nextObject Is Map Then";
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
RDebugUtils.currentLine=23265286;
 //BA.debugLineNum = 23265286;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=23265288;
 //BA.debugLineNum = 23265288;BA.debugLine="Dim nextItem As Map = nextObject";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_nextobject));
RDebugUtils.currentLine=23265289;
 //BA.debugLineNum = 23265289;BA.debugLine="Dim nextType As String = nextItem.GetDefault(\"typ";
_nexttype = BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=23265290;
 //BA.debugLineNum = 23265290;BA.debugLine="If nextType <> \"track\" And nextType <> \"ad\" Then";
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
RDebugUtils.currentLine=23265291;
 //BA.debugLineNum = 23265291;BA.debugLine="If preparedItem.IsInitialized And preparedAudioKe";
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
RDebugUtils.currentLine=23265292;
 //BA.debugLineNum = 23265292;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
_targetaudiokey = __ref._getinactiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=23265293;
 //BA.debugLineNum = 23265293;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=23265294;
 //BA.debugLineNum = 23265294;BA.debugLine="pendingPrepareAudioKey = targetAudioKey";
__ref._pendingprepareaudiokey /*String*/  = _targetaudiokey;
RDebugUtils.currentLine=23265295;
 //BA.debugLineNum = 23265295;BA.debugLine="pendingPrepareItem = CloneMap(nextItem)";
__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_nextitem);
RDebugUtils.currentLine=23265296;
 //BA.debugLineNum = 23265296;BA.debugLine="TraceLog(\"PrepareNextPlayable. targetAudio=\" & ta";
__ref._tracelog /*String*/ (null,"PrepareNextPlayable. targetAudio="+_targetaudiokey+", item="+__ref._describeitem /*String*/ (null,(Object)(_nextitem.getObject()))+", volume="+parent.__c.NumberFormat2(__ref._currentvolume /*double*/ (null,_nextitem),(int) (1),(int) (3),(int) (3),parent.__c.False));
RDebugUtils.currentLine=23265297;
 //BA.debugLineNum = 23265297;BA.debugLine="GetAudioByKey(targetAudioKey).LoadUrl(MediaUrl(ne";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_targetaudiokey)._loadurl /*String*/ (null,__ref._mediaurl /*String*/ (null,_nextitem),__ref._currentvolume /*double*/ (null,_nextitem));
RDebugUtils.currentLine=23265298;
 //BA.debugLineNum = 23265298;BA.debugLine="Wait For PreloadDone(result As Map)";
parent.__c.WaitFor("preloaddone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "preparenextplayable"), null);
this.state = 31;
return;
case 31:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=23265299;
 //BA.debugLineNum = 23265299;BA.debugLine="TraceLog(\"PreloadDone. audio=\" & targetAudioKey &";
__ref._tracelog /*String*/ (null,"PreloadDone. audio="+_targetaudiokey+", success="+BA.ObjectToString(_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)))+", message="+BA.ObjectToString(_result.GetDefault((Object)("Message"),(Object)(""))));
RDebugUtils.currentLine=23265300;
 //BA.debugLineNum = 23265300;BA.debugLine="Return result.GetDefault(\"Success\", False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)));return;};
RDebugUtils.currentLine=23265301;
 //BA.debugLineNum = 23265301;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Private Sub PreloadDone(unusedResult As Map)";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="If unusedResult.IsInitialized Then";
if (_unusedresult.IsInitialized()) { 
 };
RDebugUtils.currentLine=22609923;
 //BA.debugLineNum = 22609923;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub ResolveErrorMessage(result As Map, fal";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
if (BA.ObjectToBoolean(_result.GetDefault((Object)("Success"),(Object)(__c.False)))) { 
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="If resultData Is Map Then";
if (_resultdata instanceof java.util.Map) { 
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="Dim m As Map = resultData";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="If m.GetDefault(\"message\", \"\") <> \"\" Then Retur";
if ((_m.GetDefault((Object)("message"),(Object)(""))).equals((Object)("")) == false) { 
if (true) return BA.ObjectToString(_m.Get((Object)("message")));};
 };
 };
RDebugUtils.currentLine=5767176;
 //BA.debugLineNum = 5767176;BA.debugLine="Dim errorMessage As String = result.GetDefault(\"E";
_errormessage = BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)("")));
RDebugUtils.currentLine=5767177;
 //BA.debugLineNum = 5767177;BA.debugLine="If errorMessage <> \"\" Then Return errorMessage";
if ((_errormessage).equals("") == false) { 
if (true) return _errormessage;};
RDebugUtils.currentLine=5767178;
 //BA.debugLineNum = 5767178;BA.debugLine="Return fallback";
if (true) return _fallback;
RDebugUtils.currentLine=5767179;
 //BA.debugLineNum = 5767179;BA.debugLine="End Sub";
return "";
}
public int  _resolveretrydelay(b4j.example.b4xmainpage __ref,String _mode,int _delayms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveretrydelay", false))
	 {return ((Integer) Debug.delegate(ba, "resolveretrydelay", new Object[] {_mode,_delayms}));}
int _delay = 0;
int _serverdelay = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub ResolveRetryDelay(mode As String, dela";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="If delayMs > 0 Then Return delayMs";
if (_delayms>0) { 
if (true) return _delayms;};
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="If mode = \"offline\" Then";
if ((_mode).equals("offline")) { 
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Dim delay As Int = offlineRetryDelay";
_delay = __ref._offlineretrydelay /*int*/ ;
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="offlineRetryDelay = Min(offlineRetryDelay * 2, O";
__ref._offlineretrydelay /*int*/  = (int) (__c.Min(__ref._offlineretrydelay /*int*/ *2,__ref._offline_retry_delay_max /*int*/ ));
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Return delay";
if (true) return _delay;
 };
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="If mode = \"blocked\" Then Return BLOCKED_RETRY_DEL";
if ((_mode).equals("blocked")) { 
if (true) return __ref._blocked_retry_delay /*int*/ ;};
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Dim serverDelay As Int = serverRetryDelay";
_serverdelay = __ref._serverretrydelay /*int*/ ;
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="serverRetryDelay = Min(serverRetryDelay * 2, SERV";
__ref._serverretrydelay /*int*/  = (int) (__c.Min(__ref._serverretrydelay /*int*/ *2,__ref._server_retry_delay_max /*int*/ ));
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="Return serverDelay";
if (true) return _serverdelay;
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="End Sub";
return 0;
}
public String  _resolvescheduledbreakat(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvescheduledbreakat", false))
	 {return ((String) Debug.delegate(ba, "resolvescheduledbreakat", null));}
Object _itemobj = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub ResolveScheduledBreakAt";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="scheduledBreakAt = -1";
__ref._scheduledbreakat /*long*/  = (long) (-1);
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="For Each itemObj As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_itemobj = group2.Get(index2);
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="If itemObj Is Map Then";
if (_itemobj instanceof java.util.Map) { 
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Dim item As Map = itemObj";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobj));
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"break\" And it";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break")) && (_item.GetDefault((Object)("exactly"),(Object)(__c.False))).equals((Object)(__c.True)) && _item.ContainsKey((Object)("at"))) { 
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="scheduledBreakAt = ToLongDefault(item.Get(\"at\"";
__ref._scheduledbreakat /*long*/  = __ref._tolongdefault /*long*/ (null,_item.Get((Object)("at")),(long) (-1));
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="TraceLog(\"Определена точка exact-break. value=\" &";
__ref._tracelog /*String*/ (null,"Определена точка exact-break. value="+BA.NumberToString(__ref._scheduledbreakat /*long*/ )+", queueSize="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=3342348;
 //BA.debugLineNum = 3342348;BA.debugLine="End Sub";
return "";
}
public long  _tolongdefault(b4j.example.b4xmainpage __ref,Object _value,long _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tolongdefault", false))
	 {return ((Long) Debug.delegate(ba, "tolongdefault", new Object[] {_value,_defaultvalue}));}
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
RDebugUtils.currentLine=26148865;
 //BA.debugLineNum = 26148865;BA.debugLine="Try";
try {RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="If value = Null Then Return defaultValue";
if (_value== null) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=26148867;
 //BA.debugLineNum = 26148867;BA.debugLine="Return value";
if (true) return BA.ObjectToLongNumber(_value);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=26148869;
 //BA.debugLineNum = 26148869;BA.debugLine="Try";
try {RDebugUtils.currentLine=26148870;
 //BA.debugLineNum = 26148870;BA.debugLine="Return Floor((\"\" & value).Trim)";
if (true) return (long) (__c.Floor((double)(Double.parseDouble((""+BA.ObjectToString(_value)).trim()))));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=26148872;
 //BA.debugLineNum = 26148872;BA.debugLine="Return defaultValue";
if (true) return _defaultvalue;
 };
 };
RDebugUtils.currentLine=26148875;
 //BA.debugLineNum = 26148875;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="retryTimer.Enabled = False";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
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
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="TraceLog(\"RetryTimer_Tick. reloading next queue c";
__ref._tracelog /*String*/ (null,"RetryTimer_Tick. reloading next queue chunk.");
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused As Bo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "retrytimer_tick"), __ref._loadnextandplay /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _writeserversnapshotfile(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _entry) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "writeserversnapshotfile", false))
	 {return ((String) Debug.delegate(ba, "writeserversnapshotfile", new Object[] {_entry}));}
String _stamp = "";
String _name = "";
String _text = "";
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Private Sub WriteServerSnapshotFile(entry As Map)";
RDebugUtils.currentLine=26411009;
 //BA.debugLineNum = 26411009;BA.debugLine="Try";
try {RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="EnsureDirectory(storageDir)";
__ref._ensuredirectory /*String*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=26411011;
 //BA.debugLineNum = 26411011;BA.debugLine="EnsureDirectory(debugResponsesDir)";
__ref._ensuredirectory /*String*/ (null,__ref._debugresponsesdir /*String*/ );
RDebugUtils.currentLine=26411012;
 //BA.debugLineNum = 26411012;BA.debugLine="Dim stamp As String = Regex.Replace(\"[^0-9]\", en";
_stamp = __c.Regex.Replace("[^0-9]",BA.ObjectToString(_entry.GetDefault((Object)("Timestamp"),(Object)(""))),"");
RDebugUtils.currentLine=26411013;
 //BA.debugLineNum = 26411013;BA.debugLine="If stamp = \"\" Then stamp = \"\" & DateTime.Now";
if ((_stamp).equals("")) { 
_stamp = ""+BA.NumberToString(__c.DateTime.getNow());};
RDebugUtils.currentLine=26411014;
 //BA.debugLineNum = 26411014;BA.debugLine="Dim name As String = stamp & \"_\" & entry.GetDefa";
_name = _stamp+"_"+BA.ObjectToString(_entry.GetDefault((Object)("Method"),(Object)("REQ")))+".txt";
RDebugUtils.currentLine=26411015;
 //BA.debugLineNum = 26411015;BA.debugLine="Dim text As String = entry.GetDefault(\"Header\",";
_text = BA.ObjectToString(_entry.GetDefault((Object)("Header"),(Object)("")))+__c.CRLF+__c.CRLF+BA.ObjectToString(_entry.GetDefault((Object)("Body"),(Object)("")));
RDebugUtils.currentLine=26411016;
 //BA.debugLineNum = 26411016;BA.debugLine="File.WriteString(debugResponsesDir, name, text)";
__c.File.WriteString(__ref._debugresponsesdir /*String*/ ,_name,_text);
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=26411018;
 //BA.debugLineNum = 26411018;BA.debugLine="TraceLog(\"Не удалось записать snapshot сервера.";
__ref._tracelog /*String*/ (null,"Не удалось записать snapshot сервера. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=26411020;
 //BA.debugLineNum = 26411020;BA.debugLine="End Sub";
return "";
}
public String  _schedulebreakwatch(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "schedulebreakwatch", false))
	 {return ((String) Debug.delegate(ba, "schedulebreakwatch", null));}
long _delay = 0L;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub ScheduleBreakWatch";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="breakTimer.Enabled = False";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="If HasPendingExactBreak = False Then Return";
if (__ref._haspendingexactbreak /*boolean*/ (null)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Dim delay As Long = Max(1, ((scheduledBreakAt - L";
_delay = (long) (__c.Max(1,((__ref._scheduledbreakat /*long*/ -__ref._localnowtimestamp /*long*/ (null))*1000)-250));
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="breakTimer.Interval = delay";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval(_delay);
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="breakTimer.Enabled = True";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="End Sub";
return "";
}
public String  _stoporbitanimation(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "stoporbitanimation", false))
	 {return ((String) Debug.delegate(ba, "stoporbitanimation", null));}
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Private Sub StopOrbitAnimation";
RDebugUtils.currentLine=25100289;
 //BA.debugLineNum = 25100289;BA.debugLine="orbitFadeTarget = 0";
__ref._orbitfadetarget /*double*/  = 0;
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="If orbitFadeValue > 0 Then";
if (__ref._orbitfadevalue /*double*/ >0) { 
RDebugUtils.currentLine=25100291;
 //BA.debugLineNum = 25100291;BA.debugLine="orbitTimer.Enabled = True";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=25100293;
 //BA.debugLineNum = 25100293;BA.debugLine="orbitTimer.Enabled = False";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=25100294;
 //BA.debugLineNum = 25100294;BA.debugLine="ApplyOrbitFrame(0)";
__ref._applyorbitframe /*String*/ (null,(int) (0));
 };
RDebugUtils.currentLine=25100296;
 //BA.debugLineNum = 25100296;BA.debugLine="End Sub";
return "";
}
public String  _startorbitanimation(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "startorbitanimation", false))
	 {return ((String) Debug.delegate(ba, "startorbitanimation", null));}
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Private Sub StartOrbitAnimation";
RDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="orbitPulseStep = 0";
__ref._orbitpulsestep /*int*/  = (int) (0);
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="orbitFadeTarget = 1";
__ref._orbitfadetarget /*double*/  = 1;
RDebugUtils.currentLine=25034755;
 //BA.debugLineNum = 25034755;BA.debugLine="orbitTimer.Enabled = True";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=25034756;
 //BA.debugLineNum = 25034756;BA.debugLine="End Sub";
return "";
}
public String  _showadmeta(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showadmeta", false))
	 {return ((String) Debug.delegate(ba, "showadmeta", new Object[] {_item}));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Private Sub ShowAdMeta(item As Map)";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="SetStatusText(item.GetDefault(\"title\", \"\"))";
__ref._setstatustext /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("title"),(Object)(""))));
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return "";
}
public String  _showtrackmeta(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showtrackmeta", false))
	 {return ((String) Debug.delegate(ba, "showtrackmeta", new Object[] {_item}));}
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub ShowTrackMeta(item As Map)";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="If item.GetDefault(\"set\", \"\") <> \"\" Then parts.Ad";
if ((_item.GetDefault((Object)("set"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add(_item.Get((Object)("set")));};
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="If item.GetDefault(\"code\", \"\") <> \"\" Then parts.A";
if ((_item.GetDefault((Object)("code"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add(_item.Get((Object)("code")));};
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="SetStatusText(JoinList(parts, \" • \"))";
__ref._setstatustext /*String*/ (null,__ref._joinlist /*String*/ (null,_parts," • "));
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="End Sub";
return "";
}
public String  _txtplayercode_action(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "txtplayercode_action", false))
	 {return ((String) Debug.delegate(ba, "txtplayercode_action", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub txtPlayerCode_Action";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="If appScreenMode = \"settings\" Then Return";
if ((__ref._appscreenmode /*String*/ ).equals("settings")) { 
if (true) return "";};
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="BtnSetupSubmit_Click";
__ref._btnsetupsubmit_click /*void*/ (null);
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="End Sub";
return "";
}
public String  _txtplayercode_focuschanged(b4j.example.b4xmainpage __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "txtplayercode_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "txtplayercode_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Private Sub txtPlayerCode_FocusChanged (hasFocus A";
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="isCodeInputFocused = hasFocus";
__ref._iscodeinputfocused /*boolean*/  = _hasfocus;
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="UpdateCodeInputAppearance(hasFocus)";
__ref._updatecodeinputappearance /*String*/ (null,_hasfocus);
RDebugUtils.currentLine=24576003;
 //BA.debugLineNum = 24576003;BA.debugLine="End Sub";
return "";
}
public String  _txtplayercode_textchanged(b4j.example.b4xmainpage __ref,String _oldvalue,String _newvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "txtplayercode_textchanged", false))
	 {return ((String) Debug.delegate(ba, "txtplayercode_textchanged", new Object[] {_oldvalue,_newvalue}));}
String _filtered = "";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub txtPlayerCode_TextChanged (oldValue As";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="If appScreenMode = \"settings\" Then Return";
if ((__ref._appscreenmode /*String*/ ).equals("settings")) { 
if (true) return "";};
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim filtered As String = FilterPlayerCode(newValu";
_filtered = __ref._filterplayercode /*String*/ (null,_newvalue);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="If filtered <> newValue Then";
if ((_filtered).equals(_newvalue) == false) { 
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="txtPlayerCode.Text = filtered";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_filtered);
 };
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="End Sub";
return "";
}
}