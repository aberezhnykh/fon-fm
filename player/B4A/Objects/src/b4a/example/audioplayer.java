package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class audioplayer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.audioplayer");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.audioplayer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public int _state_stopped = 0;
public int _state_loading = 0;
public int _state_ready = 0;
public int _state_playing = 0;
public int _fade_none = 0;
public int _fade_in = 0;
public int _fade_out = 0;
public int _check_timer_interval_ms = 0;
public int _silence_stall_threshold = 0;
public anywheresoftware.b4j.object.JavaObject _player = null;
public String _eventname = "";
public Object _targetpage = null;
public anywheresoftware.b4a.objects.Timer _timeupdatetimer = null;
public long _lastposition = 0L;
public anywheresoftware.b4a.objects.Timer _checktimer = null;
public anywheresoftware.b4a.objects.Timer _loadtimer = null;
public anywheresoftware.b4a.objects.Timer _fadetimer = null;
public int _playerstate = 0;
public double _maxvolume = 0;
public int _fademode = 0;
public double _fadetargetvolume = 0;
public double _fadestepvolume = 0;
public double _currentvolume = 0;
public int _stalledcheckcount = 0;
public long _currentloadtoken = 0L;
public long _activeeventloadtoken = 0L;
public String _audiokey = "";
public long _durationvalue = 0L;
public long _playstartedatus = 0L;
public boolean _firstprogresslogged = false;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _bindplayerlisteners() throws Exception{
Object _preparedlistener = null;
Object _completionlistener = null;
Object _errorlistener = null;
 //BA.debugLineNum = 341;BA.debugLine="Private Sub BindPlayerListeners";
 //BA.debugLineNum = 342;BA.debugLine="Dim preparedListener As Object = player.CreateEve";
_preparedlistener = _player.CreateEventFromUI(ba,"android.media.MediaPlayer$OnPreparedListener","NativePrepared",__c.Null);
 //BA.debugLineNum = 343;BA.debugLine="Dim completionListener As Object = player.CreateE";
_completionlistener = _player.CreateEventFromUI(ba,"android.media.MediaPlayer$OnCompletionListener","NativeComplete",__c.Null);
 //BA.debugLineNum = 344;BA.debugLine="Dim errorListener As Object = player.CreateEventF";
_errorlistener = _player.CreateEventFromUI(ba,"android.media.MediaPlayer$OnErrorListener","NativeError",(Object)(__c.True));
 //BA.debugLineNum = 345;BA.debugLine="player.RunMethod(\"setOnPreparedListener\", Array A";
_player.RunMethod("setOnPreparedListener",new Object[]{_preparedlistener});
 //BA.debugLineNum = 346;BA.debugLine="player.RunMethod(\"setOnCompletionListener\", Array";
_player.RunMethod("setOnCompletionListener",new Object[]{_completionlistener});
 //BA.debugLineNum = 347;BA.debugLine="player.RunMethod(\"setOnErrorListener\", Array As O";
_player.RunMethod("setOnErrorListener",new Object[]{_errorlistener});
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return "";
}
public String  _checktimer_tick() throws Exception{
long _positionnow = 0L;
long _durationnow = 0L;
 //BA.debugLineNum = 236;BA.debugLine="Private Sub CheckTimer_Tick";
 //BA.debugLineNum = 237;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
if (_playerstate!=_state_playing) { 
if (true) return "";};
 //BA.debugLineNum = 238;BA.debugLine="Dim positionNow As Long = Position";
_positionnow = _position();
 //BA.debugLineNum = 239;BA.debugLine="If positionNow > lastPosition Then";
if (_positionnow>_lastposition) { 
 //BA.debugLineNum = 240;BA.debugLine="lastPosition = positionNow";
_lastposition = _positionnow;
 //BA.debugLineNum = 241;BA.debugLine="stalledCheckCount = 0";
_stalledcheckcount = (int) (0);
 //BA.debugLineNum = 242;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 244;BA.debugLine="Dim durationNow As Long = Duration";
_durationnow = _duration();
 //BA.debugLineNum = 245;BA.debugLine="If durationNow > 0 And positionNow >= Max(0, dura";
if (_durationnow>0 && _positionnow>=__c.Max(0,_durationnow-2000)) { 
if (true) return "";};
 //BA.debugLineNum = 246;BA.debugLine="stalledCheckCount = stalledCheckCount + 1";
_stalledcheckcount = (int) (_stalledcheckcount+1);
 //BA.debugLineNum = 247;BA.debugLine="If stalledCheckCount < SILENCE_STALL_THRESHOLD Th";
if (_stalledcheckcount<_silence_stall_threshold) { 
if (true) return "";};
 //BA.debugLineNum = 248;BA.debugLine="NotifyError(\"Silence detected \" & SILENCE_STALL_T";
_notifyerror("Silence detected "+BA.NumberToString(_silence_stall_threshold));
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private Const STATE_STOPPED As Int = 0";
_state_stopped = (int) (0);
 //BA.debugLineNum = 6;BA.debugLine="Private Const STATE_LOADING As Int = 1";
_state_loading = (int) (1);
 //BA.debugLineNum = 7;BA.debugLine="Private Const STATE_READY As Int = 2";
_state_ready = (int) (2);
 //BA.debugLineNum = 8;BA.debugLine="Private Const STATE_PLAYING As Int = 3";
_state_playing = (int) (3);
 //BA.debugLineNum = 9;BA.debugLine="Private Const FADE_NONE As Int = 0";
_fade_none = (int) (0);
 //BA.debugLineNum = 10;BA.debugLine="Private Const FADE_IN As Int = 1";
_fade_in = (int) (1);
 //BA.debugLineNum = 11;BA.debugLine="Private Const FADE_OUT As Int = 2";
_fade_out = (int) (2);
 //BA.debugLineNum = 12;BA.debugLine="Private Const CHECK_TIMER_INTERVAL_MS As Int = 20";
_check_timer_interval_ms = (int) (2000);
 //BA.debugLineNum = 13;BA.debugLine="Private Const SILENCE_STALL_THRESHOLD As Int = 3";
_silence_stall_threshold = (int) (3);
 //BA.debugLineNum = 15;BA.debugLine="Private player As JavaObject";
_player = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 16;BA.debugLine="Private eventName As String";
_eventname = "";
 //BA.debugLineNum = 17;BA.debugLine="Private targetPage As Object";
_targetpage = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Private timeUpdateTimer As Timer";
_timeupdatetimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 19;BA.debugLine="Private lastPosition As Long";
_lastposition = 0L;
 //BA.debugLineNum = 20;BA.debugLine="Private checkTimer As Timer";
_checktimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 21;BA.debugLine="Private loadTimer As Timer";
_loadtimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 22;BA.debugLine="Private fadeTimer As Timer";
_fadetimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 23;BA.debugLine="Private playerState As Int";
_playerstate = 0;
 //BA.debugLineNum = 24;BA.debugLine="Private maxVolume As Double";
_maxvolume = 0;
 //BA.debugLineNum = 25;BA.debugLine="Private fadeMode As Int";
_fademode = 0;
 //BA.debugLineNum = 26;BA.debugLine="Private fadeTargetVolume As Double";
_fadetargetvolume = 0;
 //BA.debugLineNum = 27;BA.debugLine="Private fadeStepVolume As Double";
_fadestepvolume = 0;
 //BA.debugLineNum = 28;BA.debugLine="Private currentVolume As Double";
_currentvolume = 0;
 //BA.debugLineNum = 29;BA.debugLine="Private stalledCheckCount As Int";
_stalledcheckcount = 0;
 //BA.debugLineNum = 30;BA.debugLine="Private currentLoadToken As Long";
_currentloadtoken = 0L;
 //BA.debugLineNum = 31;BA.debugLine="Private activeEventLoadToken As Long";
_activeeventloadtoken = 0L;
 //BA.debugLineNum = 32;BA.debugLine="Private audioKey As String";
_audiokey = "";
 //BA.debugLineNum = 33;BA.debugLine="Private durationValue As Long";
_durationvalue = 0L;
 //BA.debugLineNum = 34;BA.debugLine="Private playStartedAtUs As Long";
_playstartedatus = 0L;
 //BA.debugLineNum = 35;BA.debugLine="Private firstProgressLogged As Boolean";
_firstprogresslogged = false;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _createplayerinstance() throws Exception{
anywheresoftware.b4j.object.JavaObject _attrsbuilder = null;
 //BA.debugLineNum = 328;BA.debugLine="Private Sub CreatePlayerInstance";
 //BA.debugLineNum = 329;BA.debugLine="player.InitializeNewInstance(\"android.media.Media";
_player.InitializeNewInstance("android.media.MediaPlayer",(Object[])(__c.Null));
 //BA.debugLineNum = 330;BA.debugLine="Try";
try { //BA.debugLineNum = 331;BA.debugLine="Dim attrsBuilder As JavaObject";
_attrsbuilder = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 332;BA.debugLine="attrsBuilder.InitializeNewInstance(\"android.medi";
_attrsbuilder.InitializeNewInstance("android.media.AudioAttributes$Builder",(Object[])(__c.Null));
 //BA.debugLineNum = 333;BA.debugLine="attrsBuilder.RunMethod(\"setUsage\", Array As Obje";
_attrsbuilder.RunMethod("setUsage",new Object[]{(Object)(1)});
 //BA.debugLineNum = 334;BA.debugLine="attrsBuilder.RunMethod(\"setContentType\", Array A";
_attrsbuilder.RunMethod("setContentType",new Object[]{(Object)(2)});
 //BA.debugLineNum = 335;BA.debugLine="player.RunMethod(\"setAudioAttributes\", Array As";
_player.RunMethod("setAudioAttributes",new Object[]{_attrsbuilder.RunMethod("build",(Object[])(__c.Null))});
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 337;BA.debugLine="TraceInternalError(\"set_audio_attributes\")";
_traceinternalerror("set_audio_attributes");
 };
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return "";
}
public long  _duration() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Public Sub Duration As Long";
 //BA.debugLineNum = 163;BA.debugLine="If player.IsInitialized = False Then Return durat";
if (_player.IsInitialized()==__c.False) { 
if (true) return _durationvalue;};
 //BA.debugLineNum = 164;BA.debugLine="Try";
try { //BA.debugLineNum = 165;BA.debugLine="durationValue = player.RunMethod(\"getDuration\",";
_durationvalue = BA.ObjectToLongNumber(_player.RunMethod("getDuration",(Object[])(__c.Null)));
 //BA.debugLineNum = 166;BA.debugLine="Return durationValue";
if (true) return _durationvalue;
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 168;BA.debugLine="Return durationValue";
if (true) return _durationvalue;
 };
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return 0L;
}
public String  _fadetimer_tick() throws Exception{
double _nextvolume = 0;
 //BA.debugLineNum = 257;BA.debugLine="Private Sub FadeTimer_Tick";
 //BA.debugLineNum = 258;BA.debugLine="If player.IsInitialized = False Then";
if (_player.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 259;BA.debugLine="fadeTimer.Enabled = False";
_fadetimer.setEnabled(__c.False);
 //BA.debugLineNum = 260;BA.debugLine="fadeMode = FADE_NONE";
_fademode = _fade_none;
 //BA.debugLineNum = 261;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 263;BA.debugLine="Dim nextVolume As Double = currentVolume + fadeSt";
_nextvolume = _currentvolume+_fadestepvolume;
 //BA.debugLineNum = 264;BA.debugLine="If fadeMode = FADE_IN Then";
if (_fademode==_fade_in) { 
 //BA.debugLineNum = 265;BA.debugLine="If nextVolume >= fadeTargetVolume Then";
if (_nextvolume>=_fadetargetvolume) { 
 //BA.debugLineNum = 266;BA.debugLine="nextVolume = fadeTargetVolume";
_nextvolume = _fadetargetvolume;
 //BA.debugLineNum = 267;BA.debugLine="fadeTimer.Enabled = False";
_fadetimer.setEnabled(__c.False);
 //BA.debugLineNum = 268;BA.debugLine="fadeMode = FADE_NONE";
_fademode = _fade_none;
 };
 }else if(_fademode==_fade_out) { 
 //BA.debugLineNum = 271;BA.debugLine="If nextVolume <= fadeTargetVolume Then";
if (_nextvolume<=_fadetargetvolume) { 
 //BA.debugLineNum = 272;BA.debugLine="nextVolume = fadeTargetVolume";
_nextvolume = _fadetargetvolume;
 //BA.debugLineNum = 273;BA.debugLine="fadeTimer.Enabled = False";
_fadetimer.setEnabled(__c.False);
 //BA.debugLineNum = 274;BA.debugLine="fadeMode = FADE_NONE";
_fademode = _fade_none;
 };
 };
 //BA.debugLineNum = 277;BA.debugLine="SetPlayerVolume(nextVolume)";
_setplayervolume(_nextvolume);
 //BA.debugLineNum = 278;BA.debugLine="If fadeMode = FADE_NONE And nextVolume <= 0 Then";
if (_fademode==_fade_none && _nextvolume<=0) { 
_stopimmediately();};
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _eventnamevalue,Object _targetpagevalue) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 38;BA.debugLine="Public Sub Initialize(eventNameValue As String, ta";
 //BA.debugLineNum = 39;BA.debugLine="eventName = eventNameValue";
_eventname = _eventnamevalue;
 //BA.debugLineNum = 40;BA.debugLine="targetPage = targetPageValue";
_targetpage = _targetpagevalue;
 //BA.debugLineNum = 41;BA.debugLine="audioKey = ResolveAudioKey(eventName)";
_audiokey = _resolveaudiokey(_eventname);
 //BA.debugLineNum = 42;BA.debugLine="loadTimer.Initialize(\"LoadTimer\", 10 * DateTime.T";
_loadtimer.Initialize(ba,"LoadTimer",(long) (10*__c.DateTime.TicksPerSecond));
 //BA.debugLineNum = 43;BA.debugLine="checkTimer.Initialize(\"CheckTimer\", CHECK_TIMER_I";
_checktimer.Initialize(ba,"CheckTimer",(long) (_check_timer_interval_ms));
 //BA.debugLineNum = 44;BA.debugLine="timeUpdateTimer.Initialize(\"TimeUpdateTimer\", 250";
_timeupdatetimer.Initialize(ba,"TimeUpdateTimer",(long) (250));
 //BA.debugLineNum = 45;BA.debugLine="fadeTimer.Initialize(\"FadeTimer\", 40)";
_fadetimer.Initialize(ba,"FadeTimer",(long) (40));
 //BA.debugLineNum = 46;BA.debugLine="TraceAudio(\"Initialize\")";
_traceaudio("Initialize");
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public boolean  _isloading() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Public Sub IsLoading As Boolean";
 //BA.debugLineNum = 142;BA.debugLine="Return playerState = STATE_LOADING";
if (true) return _playerstate==_state_loading;
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaying() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Public Sub IsPlaying As Boolean";
 //BA.debugLineNum = 150;BA.debugLine="Return playerState = STATE_PLAYING";
if (true) return _playerstate==_state_playing;
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return false;
}
public boolean  _isready() throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Public Sub IsReady As Boolean";
 //BA.debugLineNum = 146;BA.debugLine="Return playerState = STATE_READY";
if (true) return _playerstate==_state_ready;
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return false;
}
public boolean  _isstopped() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Public Sub IsStopped As Boolean";
 //BA.debugLineNum = 138;BA.debugLine="Return playerState = STATE_STOPPED";
if (true) return _playerstate==_state_stopped;
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return false;
}
public String  _loadtimer_tick() throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Private Sub LoadTimer_Tick";
 //BA.debugLineNum = 252;BA.debugLine="loadTimer.Enabled = False";
_loadtimer.setEnabled(__c.False);
 //BA.debugLineNum = 253;BA.debugLine="TraceAudio(\"Load timeout\")";
_traceaudio("Load timeout");
 //BA.debugLineNum = 254;BA.debugLine="NotifyError(\"Track loading timeout expired\")";
_notifyerror("Track loading timeout expired");
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public String  _loadurl(String _url,double _volume) throws Exception{
long _startedat = 0L;
 //BA.debugLineNum = 49;BA.debugLine="Public Sub LoadUrl(url As String, volume As Double";
 //BA.debugLineNum = 50;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = __c.DateTime.getNow();
 //BA.debugLineNum = 51;BA.debugLine="Reset";
_reset();
 //BA.debugLineNum = 52;BA.debugLine="currentLoadToken = currentLoadToken + 1";
_currentloadtoken = (long) (_currentloadtoken+1);
 //BA.debugLineNum = 53;BA.debugLine="activeEventLoadToken = currentLoadToken";
_activeeventloadtoken = _currentloadtoken;
 //BA.debugLineNum = 54;BA.debugLine="loadTimer.Interval = 10 * DateTime.TicksPerSecond";
_loadtimer.setInterval((long) (10*__c.DateTime.TicksPerSecond));
 //BA.debugLineNum = 55;BA.debugLine="loadTimer.Enabled = True";
_loadtimer.setEnabled(__c.True);
 //BA.debugLineNum = 56;BA.debugLine="playerState = STATE_LOADING";
_playerstate = _state_loading;
 //BA.debugLineNum = 57;BA.debugLine="maxVolume = Max(0, Min(1, volume))";
_maxvolume = __c.Max(0,__c.Min(1,_volume));
 //BA.debugLineNum = 58;BA.debugLine="TraceAudio(\"LoadUrl. volume=\" & NumberFormat2(max";
_traceaudio("LoadUrl. volume="+__c.NumberFormat2(_maxvolume,(int) (1),(int) (3),(int) (3),__c.False)+", url="+_url);
 //BA.debugLineNum = 59;BA.debugLine="Try";
try { //BA.debugLineNum = 60;BA.debugLine="CreatePlayerInstance";
_createplayerinstance();
 //BA.debugLineNum = 61;BA.debugLine="BindPlayerListeners";
_bindplayerlisteners();
 //BA.debugLineNum = 62;BA.debugLine="SetPlayerDataSource(url)";
_setplayerdatasource(_url);
 //BA.debugLineNum = 63;BA.debugLine="player.RunMethod(\"prepareAsync\", Null)";
_player.RunMethod("prepareAsync",(Object[])(__c.Null));
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 65;BA.debugLine="NotifyError(LastException.Message)";
_notifyerror(__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 67;BA.debugLine="LogSlowOperation(\"LoadUrl\", startedAt)";
_logslowoperation("LoadUrl",_startedat);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _logslowoperation(String _operationname,long _startedat) throws Exception{
long _elapsed = 0L;
 //BA.debugLineNum = 393;BA.debugLine="Private Sub LogSlowOperation(operationName As Stri";
 //BA.debugLineNum = 394;BA.debugLine="Dim elapsed As Long = DateTime.Now - startedAt";
_elapsed = (long) (__c.DateTime.getNow()-_startedat);
 //BA.debugLineNum = 395;BA.debugLine="If elapsed < 50 Then Return";
if (_elapsed<50) { 
if (true) return "";};
 //BA.debugLineNum = 396;BA.debugLine="TraceDiagnostic(\"audio slow op=\" & eventName & \".";
_tracediagnostic("audio slow op="+_eventname+"."+_operationname+" elapsedMs="+BA.NumberToString(_elapsed)+" state="+BA.NumberToString(_playerstate));
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return "";
}
public long  _monotonicmicros() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 416;BA.debugLine="Private Sub MonotonicMicros As Long";
 //BA.debugLineNum = 417;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 418;BA.debugLine="jo.InitializeStatic(\"java.lang.System\")";
_jo.InitializeStatic("java.lang.System");
 //BA.debugLineNum = 419;BA.debugLine="Return jo.RunMethod(\"nanoTime\", Null) / 1000";
if (true) return (long) ((double)(BA.ObjectToNumber(_jo.RunMethod("nanoTime",(Object[])(__c.Null))))/(double)1000);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return 0L;
}
public Object  _nativecomplete_event(String _methodname,Object[] _args) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Private Sub NativeComplete_Event(MethodName As Str";
 //BA.debugLineNum = 186;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (_activeeventloadtoken!=_currentloadtoken) { 
 //BA.debugLineNum = 187;BA.debugLine="TraceAudio(\"Complete ignored. stale_token=\" & ac";
_traceaudio("Complete ignored. stale_token="+BA.NumberToString(_activeeventloadtoken)+" current="+BA.NumberToString(_currentloadtoken));
 //BA.debugLineNum = 188;BA.debugLine="Return Null";
if (true) return __c.Null;
 };
 //BA.debugLineNum = 190;BA.debugLine="If playerState = STATE_STOPPED Then Return Null";
if (_playerstate==_state_stopped) { 
if (true) return __c.Null;};
 //BA.debugLineNum = 191;BA.debugLine="loadTimer.Enabled = False";
_loadtimer.setEnabled(__c.False);
 //BA.debugLineNum = 192;BA.debugLine="checkTimer.Enabled = False";
_checktimer.setEnabled(__c.False);
 //BA.debugLineNum = 193;BA.debugLine="timeUpdateTimer.Enabled = False";
_timeupdatetimer.setEnabled(__c.False);
 //BA.debugLineNum = 194;BA.debugLine="fadeTimer.Enabled = False";
_fadetimer.setEnabled(__c.False);
 //BA.debugLineNum = 195;BA.debugLine="fadeMode = FADE_NONE";
_fademode = _fade_none;
 //BA.debugLineNum = 196;BA.debugLine="currentVolume = 0";
_currentvolume = 0;
 //BA.debugLineNum = 197;BA.debugLine="stalledCheckCount = 0";
_stalledcheckcount = (int) (0);
 //BA.debugLineNum = 198;BA.debugLine="playerState = STATE_STOPPED";
_playerstate = _state_stopped;
 //BA.debugLineNum = 199;BA.debugLine="TraceAudio(\"Complete\")";
_traceaudio("Complete");
 //BA.debugLineNum = 200;BA.debugLine="CallSub2(targetPage, \"AudioPlayer_Complete\", audi";
__c.CallSubNew2(ba,_targetpage,"AudioPlayer_Complete",(Object)(_audiokey));
 //BA.debugLineNum = 201;BA.debugLine="Return Null";
if (true) return __c.Null;
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public Object  _nativeerror_event(String _methodname,Object[] _args) throws Exception{
int _whatcode = 0;
int _extracode = 0;
 //BA.debugLineNum = 204;BA.debugLine="Private Sub NativeError_Event(MethodName As String";
 //BA.debugLineNum = 205;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (_activeeventloadtoken!=_currentloadtoken) { 
 //BA.debugLineNum = 206;BA.debugLine="TraceAudio(\"Error ignored. stale_token=\" & activ";
_traceaudio("Error ignored. stale_token="+BA.NumberToString(_activeeventloadtoken)+" current="+BA.NumberToString(_currentloadtoken));
 //BA.debugLineNum = 207;BA.debugLine="Return True";
if (true) return (Object)(__c.True);
 };
 //BA.debugLineNum = 209;BA.debugLine="Dim whatCode As Int = 0";
_whatcode = (int) (0);
 //BA.debugLineNum = 210;BA.debugLine="Dim extraCode As Int = 0";
_extracode = (int) (0);
 //BA.debugLineNum = 211;BA.debugLine="Try";
try { //BA.debugLineNum = 212;BA.debugLine="whatCode = Args(1)";
_whatcode = (int)(BA.ObjectToNumber(_args[(int) (1)]));
 //BA.debugLineNum = 213;BA.debugLine="extraCode = Args(2)";
_extracode = (int)(BA.ObjectToNumber(_args[(int) (2)]));
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 215;BA.debugLine="TraceAudio(\"NativeError_Event args parse failed:";
_traceaudio("NativeError_Event args parse failed: "+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 217;BA.debugLine="NotifyError(\"MediaPlayer error what=\" & whatCode";
_notifyerror("MediaPlayer error what="+BA.NumberToString(_whatcode)+" extra="+BA.NumberToString(_extracode));
 //BA.debugLineNum = 218;BA.debugLine="Return True";
if (true) return (Object)(__c.True);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public Object  _nativeprepared_event(String _methodname,Object[] _args) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Private Sub NativePrepared_Event(MethodName As Str";
 //BA.debugLineNum = 173;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (_activeeventloadtoken!=_currentloadtoken) { 
 //BA.debugLineNum = 174;BA.debugLine="TraceAudio(\"Prepared ignored. stale_token=\" & ac";
_traceaudio("Prepared ignored. stale_token="+BA.NumberToString(_activeeventloadtoken)+" current="+BA.NumberToString(_currentloadtoken));
 //BA.debugLineNum = 175;BA.debugLine="Return Null";
if (true) return __c.Null;
 };
 //BA.debugLineNum = 177;BA.debugLine="playerState = STATE_READY";
_playerstate = _state_ready;
 //BA.debugLineNum = 178;BA.debugLine="loadTimer.Enabled = False";
_loadtimer.setEnabled(__c.False);
 //BA.debugLineNum = 179;BA.debugLine="durationValue = Duration";
_durationvalue = _duration();
 //BA.debugLineNum = 180;BA.debugLine="TraceAudio(\"Ready\")";
_traceaudio("Ready");
 //BA.debugLineNum = 181;BA.debugLine="CallSub2(targetPage, \"AudioPlayer_Ready\", audioKe";
__c.CallSubNew2(ba,_targetpage,"AudioPlayer_Ready",(Object)(_audiokey));
 //BA.debugLineNum = 182;BA.debugLine="Return Null";
if (true) return __c.Null;
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public String  _notifyerror(String _message) throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Private Sub NotifyError(message As String)";
 //BA.debugLineNum = 388;BA.debugLine="TraceAudio(\"NotifyError. message=\" & message)";
_traceaudio("NotifyError. message="+_message);
 //BA.debugLineNum = 389;BA.debugLine="Reset";
_reset();
 //BA.debugLineNum = 390;BA.debugLine="CallSub3(targetPage, \"AudioPlayer_Error\", audioKe";
__c.CallSubNew3(ba,_targetpage,"AudioPlayer_Error",(Object)(_audiokey),(Object)(_message));
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return "";
}
public String  _play() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub Play";
 //BA.debugLineNum = 71;BA.debugLine="PlayWithFade(0)";
_playwithfade((int) (0));
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _playwithfade(int _fadetimems) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub PlayWithFade(fadeTimeMs As Int)";
 //BA.debugLineNum = 75;BA.debugLine="If playerState <> STATE_READY Then";
if (_playerstate!=_state_ready) { 
 //BA.debugLineNum = 76;BA.debugLine="TraceInternalError(\"play_with_fade_not_ready sta";
_traceinternalerror("play_with_fade_not_ready state="+BA.NumberToString(_playerstate));
 //BA.debugLineNum = 77;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 79;BA.debugLine="playerState = STATE_PLAYING";
_playerstate = _state_playing;
 //BA.debugLineNum = 80;BA.debugLine="lastPosition = 0";
_lastposition = (long) (0);
 //BA.debugLineNum = 81;BA.debugLine="stalledCheckCount = 0";
_stalledcheckcount = (int) (0);
 //BA.debugLineNum = 82;BA.debugLine="checkTimer.Enabled = True";
_checktimer.setEnabled(__c.True);
 //BA.debugLineNum = 83;BA.debugLine="timeUpdateTimer.Enabled = True";
_timeupdatetimer.setEnabled(__c.True);
 //BA.debugLineNum = 84;BA.debugLine="playStartedAtUs = MonotonicMicros";
_playstartedatus = _monotonicmicros();
 //BA.debugLineNum = 85;BA.debugLine="firstProgressLogged = False";
_firstprogresslogged = __c.False;
 //BA.debugLineNum = 86;BA.debugLine="If fadeTimeMs > 0 Then";
if (_fadetimems>0) { 
 //BA.debugLineNum = 87;BA.debugLine="SetPlayerVolume(0)";
_setplayervolume(0);
 }else {
 //BA.debugLineNum = 89;BA.debugLine="SetPlayerVolume(maxVolume)";
_setplayervolume(_maxvolume);
 };
 //BA.debugLineNum = 91;BA.debugLine="player.RunMethod(\"start\", Null)";
_player.RunMethod("start",(Object[])(__c.Null));
 //BA.debugLineNum = 92;BA.debugLine="TraceAudio(\"PlayWithFade. fadeTimeMs=\" & fadeTime";
_traceaudio("PlayWithFade. fadeTimeMs="+BA.NumberToString(_fadetimems)+", maxVolume="+__c.NumberFormat2(_maxvolume,(int) (1),(int) (3),(int) (3),__c.False));
 //BA.debugLineNum = 93;BA.debugLine="If fadeTimeMs > 0 Then StartFade(FADE_IN, maxVolu";
if (_fadetimems>0) { 
_startfade(_fade_in,_maxvolume,_fadetimems);};
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public long  _position() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Public Sub Position As Long";
 //BA.debugLineNum = 154;BA.debugLine="If player.IsInitialized = False Then Return 0";
if (_player.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
 //BA.debugLineNum = 155;BA.debugLine="Try";
try { //BA.debugLineNum = 156;BA.debugLine="Return player.RunMethod(\"getCurrentPosition\", Nu";
if (true) return BA.ObjectToLongNumber(_player.RunMethod("getCurrentPosition",(Object[])(__c.Null)));
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 158;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return 0L;
}
public String  _releaseplayerinstance() throws Exception{
anywheresoftware.b4j.object.JavaObject _emptyplayer = null;
 //BA.debugLineNum = 370;BA.debugLine="Private Sub ReleasePlayerInstance";
 //BA.debugLineNum = 371;BA.debugLine="If player.IsInitialized = False Then Return";
if (_player.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 372;BA.debugLine="Try";
try { //BA.debugLineNum = 373;BA.debugLine="player.RunMethod(\"reset\", Null)";
_player.RunMethod("reset",(Object[])(__c.Null));
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 375;BA.debugLine="TraceInternalError(\"release_reset\")";
_traceinternalerror("release_reset");
 };
 //BA.debugLineNum = 377;BA.debugLine="Try";
try { //BA.debugLineNum = 378;BA.debugLine="player.RunMethod(\"release\", Null)";
_player.RunMethod("release",(Object[])(__c.Null));
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 380;BA.debugLine="TraceInternalError(\"release_release\")";
_traceinternalerror("release_release");
 };
 //BA.debugLineNum = 382;BA.debugLine="Dim emptyPlayer As JavaObject";
_emptyplayer = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 383;BA.debugLine="player = emptyPlayer";
_player = _emptyplayer;
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return "";
}
public String  _reset() throws Exception{
long _startedat = 0L;
 //BA.debugLineNum = 118;BA.debugLine="Public Sub Reset";
 //BA.debugLineNum = 119;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = __c.DateTime.getNow();
 //BA.debugLineNum = 120;BA.debugLine="loadTimer.Enabled = False";
_loadtimer.setEnabled(__c.False);
 //BA.debugLineNum = 121;BA.debugLine="checkTimer.Enabled = False";
_checktimer.setEnabled(__c.False);
 //BA.debugLineNum = 122;BA.debugLine="timeUpdateTimer.Enabled = False";
_timeupdatetimer.setEnabled(__c.False);
 //BA.debugLineNum = 123;BA.debugLine="fadeTimer.Enabled = False";
_fadetimer.setEnabled(__c.False);
 //BA.debugLineNum = 124;BA.debugLine="fadeMode = FADE_NONE";
_fademode = _fade_none;
 //BA.debugLineNum = 125;BA.debugLine="lastPosition = 0";
_lastposition = (long) (0);
 //BA.debugLineNum = 126;BA.debugLine="stalledCheckCount = 0";
_stalledcheckcount = (int) (0);
 //BA.debugLineNum = 127;BA.debugLine="currentVolume = 0";
_currentvolume = 0;
 //BA.debugLineNum = 128;BA.debugLine="durationValue = 0";
_durationvalue = (long) (0);
 //BA.debugLineNum = 129;BA.debugLine="activeEventLoadToken = 0";
_activeeventloadtoken = (long) (0);
 //BA.debugLineNum = 130;BA.debugLine="playStartedAtUs = 0";
_playstartedatus = (long) (0);
 //BA.debugLineNum = 131;BA.debugLine="firstProgressLogged = False";
_firstprogresslogged = __c.False;
 //BA.debugLineNum = 132;BA.debugLine="playerState = STATE_STOPPED";
_playerstate = _state_stopped;
 //BA.debugLineNum = 133;BA.debugLine="ReleasePlayerInstance";
_releaseplayerinstance();
 //BA.debugLineNum = 134;BA.debugLine="LogSlowOperation(\"Reset\", startedAt)";
_logslowoperation("Reset",_startedat);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _resolveaudiokey(String _namevalue) throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Private Sub ResolveAudioKey(nameValue As String) A";
 //BA.debugLineNum = 412;BA.debugLine="If nameValue.ToLowerCase.Contains(\"secondary\") Th";
if (_namevalue.toLowerCase().contains("secondary")) { 
if (true) return "secondary";};
 //BA.debugLineNum = 413;BA.debugLine="Return \"primary\"";
if (true) return "primary";
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return "";
}
public String  _setplayerdatasource(String _url) throws Exception{
String _normalizedurl = "";
anywheresoftware.b4j.object.JavaObject _uri = null;
anywheresoftware.b4j.object.JavaObject _parsed = null;
anywheresoftware.b4j.object.JavaObject _context = null;
anywheresoftware.b4j.object.JavaObject _uricontent = null;
anywheresoftware.b4j.object.JavaObject _parsedcontent = null;
 //BA.debugLineNum = 350;BA.debugLine="Private Sub SetPlayerDataSource(url As String)";
 //BA.debugLineNum = 351;BA.debugLine="Dim normalizedUrl As String = url";
_normalizedurl = _url;
 //BA.debugLineNum = 352;BA.debugLine="If normalizedUrl.StartsWith(\"file:\") Then";
if (_normalizedurl.startsWith("file:")) { 
 //BA.debugLineNum = 353;BA.debugLine="Dim uri As JavaObject";
_uri = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 354;BA.debugLine="uri.InitializeStatic(\"android.net.Uri\")";
_uri.InitializeStatic("android.net.Uri");
 //BA.debugLineNum = 355;BA.debugLine="Dim parsed As JavaObject = uri.RunMethod(\"parse\"";
_parsed = new anywheresoftware.b4j.object.JavaObject();
_parsed = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_uri.RunMethod("parse",new Object[]{(Object)(_normalizedurl)})));
 //BA.debugLineNum = 356;BA.debugLine="normalizedUrl = parsed.RunMethod(\"getPath\", Null";
_normalizedurl = BA.ObjectToString(_parsed.RunMethod("getPath",(Object[])(__c.Null)));
 };
 //BA.debugLineNum = 358;BA.debugLine="If normalizedUrl.StartsWith(\"content:\") Then";
if (_normalizedurl.startsWith("content:")) { 
 //BA.debugLineNum = 359;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 360;BA.debugLine="context.InitializeContext";
_context.InitializeContext(ba);
 //BA.debugLineNum = 361;BA.debugLine="Dim uriContent As JavaObject";
_uricontent = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 362;BA.debugLine="uriContent.InitializeStatic(\"android.net.Uri\")";
_uricontent.InitializeStatic("android.net.Uri");
 //BA.debugLineNum = 363;BA.debugLine="Dim parsedContent As JavaObject = uriContent.Run";
_parsedcontent = new anywheresoftware.b4j.object.JavaObject();
_parsedcontent = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_uricontent.RunMethod("parse",new Object[]{(Object)(_normalizedurl)})));
 //BA.debugLineNum = 364;BA.debugLine="player.RunMethod(\"setDataSource\", Array As Objec";
_player.RunMethod("setDataSource",new Object[]{(Object)(_context.getObject()),(Object)(_parsedcontent.getObject())});
 }else {
 //BA.debugLineNum = 366;BA.debugLine="player.RunMethod(\"setDataSource\", Array As Objec";
_player.RunMethod("setDataSource",new Object[]{(Object)(_normalizedurl)});
 };
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return "";
}
public String  _setplayervolume(double _volumevalue) throws Exception{
float _leftvolume = 0f;
float _rightvolume = 0f;
 //BA.debugLineNum = 298;BA.debugLine="Private Sub SetPlayerVolume(volumeValue As Double)";
 //BA.debugLineNum = 299;BA.debugLine="currentVolume = Max(0, Min(1, volumeValue))";
_currentvolume = __c.Max(0,__c.Min(1,_volumevalue));
 //BA.debugLineNum = 300;BA.debugLine="If player.IsInitialized = False Then Return";
if (_player.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 301;BA.debugLine="Try";
try { //BA.debugLineNum = 302;BA.debugLine="Dim leftVolume As Float = currentVolume";
_leftvolume = (float) (_currentvolume);
 //BA.debugLineNum = 303;BA.debugLine="Dim rightVolume As Float = currentVolume";
_rightvolume = (float) (_currentvolume);
 //BA.debugLineNum = 304;BA.debugLine="player.RunMethod(\"setVolume\", Array As Object(le";
_player.RunMethod("setVolume",new Object[]{(Object)(_leftvolume),(Object)(_rightvolume)});
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 306;BA.debugLine="TraceInternalError(\"set_volume\")";
_traceinternalerror("set_volume");
 };
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return "";
}
public String  _startfade(int _modevalue,double _targetvolume,int _fadetimems) throws Exception{
int _intervalms = 0;
int _steps = 0;
 //BA.debugLineNum = 281;BA.debugLine="Private Sub StartFade(modeValue As Int, targetVolu";
 //BA.debugLineNum = 282;BA.debugLine="fadeTimer.Enabled = False";
_fadetimer.setEnabled(__c.False);
 //BA.debugLineNum = 283;BA.debugLine="fadeMode = FADE_NONE";
_fademode = _fade_none;
 //BA.debugLineNum = 284;BA.debugLine="If player.IsInitialized = False Then Return";
if (_player.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 285;BA.debugLine="If fadeTimeMs <= 0 Then";
if (_fadetimems<=0) { 
 //BA.debugLineNum = 286;BA.debugLine="SetPlayerVolume(targetVolume)";
_setplayervolume(_targetvolume);
 //BA.debugLineNum = 287;BA.debugLine="If targetVolume <= 0 Then StopImmediately";
if (_targetvolume<=0) { 
_stopimmediately();};
 //BA.debugLineNum = 288;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 290;BA.debugLine="Dim intervalMs As Int = Max(20, fadeTimer.Interva";
_intervalms = (int) (__c.Max(20,_fadetimer.getInterval()));
 //BA.debugLineNum = 291;BA.debugLine="Dim steps As Int = Max(1, Ceil(fadeTimeMs / inter";
_steps = (int) (__c.Max(1,__c.Ceil(_fadetimems/(double)_intervalms)));
 //BA.debugLineNum = 292;BA.debugLine="fadeMode = modeValue";
_fademode = _modevalue;
 //BA.debugLineNum = 293;BA.debugLine="fadeTargetVolume = targetVolume";
_fadetargetvolume = _targetvolume;
 //BA.debugLineNum = 294;BA.debugLine="fadeStepVolume = (targetVolume - currentVolume) /";
_fadestepvolume = (_targetvolume-_currentvolume)/(double)_steps;
 //BA.debugLineNum = 295;BA.debugLine="fadeTimer.Enabled = True";
_fadetimer.setEnabled(__c.True);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return "";
}
public String  _stop(int _fadetimems) throws Exception{
long _startedat = 0L;
 //BA.debugLineNum = 96;BA.debugLine="Public Sub Stop(fadeTimeMs As Int)";
 //BA.debugLineNum = 97;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = __c.DateTime.getNow();
 //BA.debugLineNum = 98;BA.debugLine="loadTimer.Enabled = False";
_loadtimer.setEnabled(__c.False);
 //BA.debugLineNum = 99;BA.debugLine="checkTimer.Enabled = False";
_checktimer.setEnabled(__c.False);
 //BA.debugLineNum = 100;BA.debugLine="timeUpdateTimer.Enabled = False";
_timeupdatetimer.setEnabled(__c.False);
 //BA.debugLineNum = 101;BA.debugLine="lastPosition = 0";
_lastposition = (long) (0);
 //BA.debugLineNum = 102;BA.debugLine="stalledCheckCount = 0";
_stalledcheckcount = (int) (0);
 //BA.debugLineNum = 103;BA.debugLine="If player.IsInitialized = False Then";
if (_player.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 104;BA.debugLine="playerState = STATE_STOPPED";
_playerstate = _state_stopped;
 //BA.debugLineNum = 105;BA.debugLine="TraceAudio(\"Stop ignored. player not initialized";
_traceaudio("Stop ignored. player not initialized.");
 //BA.debugLineNum = 106;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 108;BA.debugLine="TraceAudio(\"Stop. fadeTimeMs=\" & fadeTimeMs & \",";
_traceaudio("Stop. fadeTimeMs="+BA.NumberToString(_fadetimems)+", currentVolume="+__c.NumberFormat2(_currentvolume,(int) (1),(int) (3),(int) (3),__c.False));
 //BA.debugLineNum = 109;BA.debugLine="If fadeTimeMs > 0 And currentVolume > 0 Then";
if (_fadetimems>0 && _currentvolume>0) { 
 //BA.debugLineNum = 110;BA.debugLine="playerState = STATE_STOPPED";
_playerstate = _state_stopped;
 //BA.debugLineNum = 111;BA.debugLine="StartFade(FADE_OUT, 0, fadeTimeMs)";
_startfade(_fade_out,0,_fadetimems);
 }else {
 //BA.debugLineNum = 113;BA.debugLine="StopImmediately";
_stopimmediately();
 };
 //BA.debugLineNum = 115;BA.debugLine="LogSlowOperation(\"Stop\", startedAt)";
_logslowoperation("Stop",_startedat);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _stopimmediately() throws Exception{
long _startedat = 0L;
 //BA.debugLineNum = 310;BA.debugLine="Private Sub StopImmediately";
 //BA.debugLineNum = 311;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = __c.DateTime.getNow();
 //BA.debugLineNum = 312;BA.debugLine="fadeTimer.Enabled = False";
_fadetimer.setEnabled(__c.False);
 //BA.debugLineNum = 313;BA.debugLine="fadeMode = FADE_NONE";
_fademode = _fade_none;
 //BA.debugLineNum = 314;BA.debugLine="playerState = STATE_STOPPED";
_playerstate = _state_stopped;
 //BA.debugLineNum = 315;BA.debugLine="currentVolume = 0";
_currentvolume = 0;
 //BA.debugLineNum = 316;BA.debugLine="TraceAudio(\"StopImmediately\")";
_traceaudio("StopImmediately");
 //BA.debugLineNum = 317;BA.debugLine="If player.IsInitialized Then";
if (_player.IsInitialized()) { 
 //BA.debugLineNum = 318;BA.debugLine="Try";
try { //BA.debugLineNum = 319;BA.debugLine="player.RunMethod(\"stop\", Null)";
_player.RunMethod("stop",(Object[])(__c.Null));
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 321;BA.debugLine="TraceInternalError(\"stop_immediately\")";
_traceinternalerror("stop_immediately");
 };
 };
 //BA.debugLineNum = 324;BA.debugLine="ReleasePlayerInstance";
_releaseplayerinstance();
 //BA.debugLineNum = 325;BA.debugLine="LogSlowOperation(\"StopImmediately\", startedAt)";
_logslowoperation("StopImmediately",_startedat);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return "";
}
public String  _timeupdatetimer_tick() throws Exception{
long _positionnow = 0L;
long _deltaus = 0L;
 //BA.debugLineNum = 221;BA.debugLine="Private Sub TimeUpdateTimer_Tick";
 //BA.debugLineNum = 222;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
if (_playerstate!=_state_playing) { 
if (true) return "";};
 //BA.debugLineNum = 223;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (_activeeventloadtoken!=_currentloadtoken) { 
if (true) return "";};
 //BA.debugLineNum = 224;BA.debugLine="If firstProgressLogged = False Then";
if (_firstprogresslogged==__c.False) { 
 //BA.debugLineNum = 225;BA.debugLine="Dim positionNow As Long = Position";
_positionnow = _position();
 //BA.debugLineNum = 226;BA.debugLine="If positionNow > 0 Then";
if (_positionnow>0) { 
 //BA.debugLineNum = 227;BA.debugLine="firstProgressLogged = True";
_firstprogresslogged = __c.True;
 //BA.debugLineNum = 228;BA.debugLine="Dim deltaUs As Long = 0";
_deltaus = (long) (0);
 //BA.debugLineNum = 229;BA.debugLine="If playStartedAtUs > 0 Then deltaUs = Monotonic";
if (_playstartedatus>0) { 
_deltaus = (long) (_monotonicmicros()-_playstartedatus);};
 //BA.debugLineNum = 230;BA.debugLine="TraceAudio(\"FirstProgress. positionMs=\" & posit";
_traceaudio("FirstProgress. positionMs="+BA.NumberToString(_positionnow)+", deltaUs="+BA.NumberToString(_deltaus)+", deltaMs="+BA.NumberToString(__c.Round(_deltaus/(double)1000)));
 };
 };
 //BA.debugLineNum = 233;BA.debugLine="CallSub2(targetPage, \"AudioPlayer_Timeupdate\", au";
__c.CallSubNew2(ba,_targetpage,"AudioPlayer_Timeupdate",(Object)(_audiokey));
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return "";
}
public String  _traceaudio(String _message) throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Private Sub TraceAudio(message As String)";
 //BA.debugLineNum = 408;BA.debugLine="If SubExists(targetPage, \"TraceLog\") Then CallSub";
if (__c.SubExists(ba,_targetpage,"TraceLog")) { 
__c.CallSubNew2(ba,_targetpage,"TraceLog",(Object)("["+_eventname+"] "+_message));};
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return "";
}
public String  _tracediagnostic(String _message) throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Private Sub TraceDiagnostic(message As String)";
 //BA.debugLineNum = 404;BA.debugLine="If SubExists(targetPage, \"TraceLog\") Then CallSub";
if (__c.SubExists(ba,_targetpage,"TraceLog")) { 
__c.CallSubNew2(ba,_targetpage,"TraceLog",(Object)(_message));};
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return "";
}
public String  _traceinternalerror(String _context) throws Exception{
 //BA.debugLineNum = 399;BA.debugLine="Private Sub TraceInternalError(context As String)";
 //BA.debugLineNum = 400;BA.debugLine="If SubExists(targetPage, \"TraceLog\") Then CallSub";
if (__c.SubExists(ba,_targetpage,"TraceLog")) { 
__c.CallSubNew2(ba,_targetpage,"TraceLog",(Object)("ошибка аудио internal context="+_context+" message="+__c.LastException(getActivityBA()).getMessage()));};
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
