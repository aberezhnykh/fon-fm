package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class audioplayer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.audioplayer", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.audioplayer.class).invoke(this, new Object[] {null});
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
public int _state_stopped = 0;
public int _state_loading = 0;
public int _state_ready = 0;
public int _state_playing = 0;
public int _fade_none = 0;
public int _fade_in = 0;
public int _fade_out = 0;
public int _check_timer_interval_ms = 0;
public int _silence_stall_threshold = 0;
public anywheresoftware.b4j.objects.MediaPlayerWrapper _player = null;
public anywheresoftware.b4j.object.JavaObject _jo = null;
public String _eventname = "";
public b4j.example.b4xmainpage _targetpage = null;
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
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _playwithfade(b4j.example.audioplayer __ref,int _fadetimems) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "playwithfade", false))
	 {return ((String) Debug.delegate(ba, "playwithfade", new Object[] {_fadetimems}));}
RDebugUtils.currentLine=37486592;
 //BA.debugLineNum = 37486592;BA.debugLine="Public Sub PlayWithFade(fadeTimeMs As Int)";
RDebugUtils.currentLine=37486593;
 //BA.debugLineNum = 37486593;BA.debugLine="If playerState <> STATE_READY Then";
if (__ref._playerstate /*int*/ !=__ref._state_ready /*int*/ ) { 
RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="TraceInternalError(\"play_with_fade_not_ready sta";
__ref._traceinternalerror /*String*/ (null,"play_with_fade_not_ready state="+BA.NumberToString(__ref._playerstate /*int*/ ));
RDebugUtils.currentLine=37486595;
 //BA.debugLineNum = 37486595;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=37486597;
 //BA.debugLineNum = 37486597;BA.debugLine="playerState = STATE_PLAYING";
__ref._playerstate /*int*/  = __ref._state_playing /*int*/ ;
RDebugUtils.currentLine=37486598;
 //BA.debugLineNum = 37486598;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=37486599;
 //BA.debugLineNum = 37486599;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=37486600;
 //BA.debugLineNum = 37486600;BA.debugLine="checkTimer.Enabled = True";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=37486601;
 //BA.debugLineNum = 37486601;BA.debugLine="timeUpdateTimer.Enabled = True";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=37486602;
 //BA.debugLineNum = 37486602;BA.debugLine="If fadeTimeMs > 0 Then";
if (_fadetimems>0) { 
RDebugUtils.currentLine=37486603;
 //BA.debugLineNum = 37486603;BA.debugLine="SetPlayerVolume(0)";
__ref._setplayervolume /*String*/ (null,0);
 }else {
RDebugUtils.currentLine=37486605;
 //BA.debugLineNum = 37486605;BA.debugLine="SetPlayerVolume(maxVolume)";
__ref._setplayervolume /*String*/ (null,__ref._maxvolume /*double*/ );
 };
RDebugUtils.currentLine=37486607;
 //BA.debugLineNum = 37486607;BA.debugLine="player.Play";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Play();
RDebugUtils.currentLine=37486608;
 //BA.debugLineNum = 37486608;BA.debugLine="TraceAudio(\"PlayWithFade. fadeTimeMs=\" & fadeTime";
__ref._traceaudio /*String*/ (null,"PlayWithFade. fadeTimeMs="+BA.NumberToString(_fadetimems)+", maxVolume="+__c.NumberFormat2(__ref._maxvolume /*double*/ ,(int) (1),(int) (3),(int) (3),__c.False));
RDebugUtils.currentLine=37486609;
 //BA.debugLineNum = 37486609;BA.debugLine="If fadeTimeMs > 0 Then";
if (_fadetimems>0) { 
RDebugUtils.currentLine=37486610;
 //BA.debugLineNum = 37486610;BA.debugLine="StartFade(FADE_IN, maxVolume, fadeTimeMs)";
__ref._startfade /*String*/ (null,__ref._fade_in /*int*/ ,__ref._maxvolume /*double*/ ,_fadetimems);
 };
RDebugUtils.currentLine=37486612;
 //BA.debugLineNum = 37486612;BA.debugLine="End Sub";
return "";
}
public long  _position(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "position", false))
	 {return ((Long) Debug.delegate(ba, "position", null));}
RDebugUtils.currentLine=37945344;
 //BA.debugLineNum = 37945344;BA.debugLine="Public Sub Position As Long";
RDebugUtils.currentLine=37945345;
 //BA.debugLineNum = 37945345;BA.debugLine="If player.IsInitialized = False Then Return 0";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="Try";
try {RDebugUtils.currentLine=37945347;
 //BA.debugLineNum = 37945347;BA.debugLine="Return player.Position";
if (true) return (long) (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getPosition());
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=37945349;
 //BA.debugLineNum = 37945349;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=37945351;
 //BA.debugLineNum = 37945351;BA.debugLine="End Sub";
return 0L;
}
public String  _initialize(b4j.example.audioplayer __ref,anywheresoftware.b4a.BA _ba,String _eventnamevalue,b4j.example.b4xmainpage _targetpagevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_eventnamevalue,_targetpagevalue}));}
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Public Sub Initialize (eventNameValue As String, t";
RDebugUtils.currentLine=37289985;
 //BA.debugLineNum = 37289985;BA.debugLine="eventName = eventNameValue";
__ref._eventname /*String*/  = _eventnamevalue;
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="targetPage = targetPageValue";
__ref._targetpage /*b4j.example.b4xmainpage*/  = _targetpagevalue;
RDebugUtils.currentLine=37289987;
 //BA.debugLineNum = 37289987;BA.debugLine="audioKey = ResolveAudioKey(eventName)";
__ref._audiokey /*String*/  = __ref._resolveaudiokey /*String*/ (null,__ref._eventname /*String*/ );
RDebugUtils.currentLine=37289988;
 //BA.debugLineNum = 37289988;BA.debugLine="loadTimer.Initialize(\"LoadTimer\", 10 * DateTime.T";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"LoadTimer",(long) (10*__c.DateTime.TicksPerSecond));
RDebugUtils.currentLine=37289989;
 //BA.debugLineNum = 37289989;BA.debugLine="checkTimer.Initialize(\"CheckTimer\", CHECK_TIMER_I";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"CheckTimer",(long) (__ref._check_timer_interval_ms /*int*/ ));
RDebugUtils.currentLine=37289990;
 //BA.debugLineNum = 37289990;BA.debugLine="timeUpdateTimer.Initialize(\"TimeUpdateTimer\", 250";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"TimeUpdateTimer",(long) (250));
RDebugUtils.currentLine=37289991;
 //BA.debugLineNum = 37289991;BA.debugLine="fadeTimer.Initialize(\"FadeTimer\", 40)";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"FadeTimer",(long) (40));
RDebugUtils.currentLine=37289992;
 //BA.debugLineNum = 37289992;BA.debugLine="TraceAudio(\"Initialize\")";
__ref._traceaudio /*String*/ (null,"Initialize");
RDebugUtils.currentLine=37289993;
 //BA.debugLineNum = 37289993;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
long _startedat = 0L;
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = __c.DateTime.getNow();
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=37617667;
 //BA.debugLineNum = 37617667;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=37617668;
 //BA.debugLineNum = 37617668;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=37617669;
 //BA.debugLineNum = 37617669;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=37617670;
 //BA.debugLineNum = 37617670;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=37617671;
 //BA.debugLineNum = 37617671;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=37617672;
 //BA.debugLineNum = 37617672;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=37617673;
 //BA.debugLineNum = 37617673;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=37617674;
 //BA.debugLineNum = 37617674;BA.debugLine="activeEventLoadToken = 0";
__ref._activeeventloadtoken /*long*/  = (long) (0);
RDebugUtils.currentLine=37617675;
 //BA.debugLineNum = 37617675;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=37617676;
 //BA.debugLineNum = 37617676;BA.debugLine="If player.IsInitialized Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=37617677;
 //BA.debugLineNum = 37617677;BA.debugLine="Try";
try {RDebugUtils.currentLine=37617678;
 //BA.debugLineNum = 37617678;BA.debugLine="player.Volume = 0";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(0);
RDebugUtils.currentLine=37617679;
 //BA.debugLineNum = 37617679;BA.debugLine="player.Stop";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Stop();
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=37617681;
 //BA.debugLineNum = 37617681;BA.debugLine="TraceInternalError(\"reset_stop\")";
__ref._traceinternalerror /*String*/ (null,"reset_stop");
 };
RDebugUtils.currentLine=37617683;
 //BA.debugLineNum = 37617683;BA.debugLine="If jo.IsInitialized Then";
if (__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .IsInitialized()) { 
RDebugUtils.currentLine=37617684;
 //BA.debugLineNum = 37617684;BA.debugLine="Try";
try {RDebugUtils.currentLine=37617685;
 //BA.debugLineNum = 37617685;BA.debugLine="jo.RunMethod(\"dispose\", Null)";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("dispose",(Object[])(__c.Null));
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=37617687;
 //BA.debugLineNum = 37617687;BA.debugLine="TraceInternalError(\"reset_dispose\")";
__ref._traceinternalerror /*String*/ (null,"reset_dispose");
 };
 };
 };
RDebugUtils.currentLine=37617691;
 //BA.debugLineNum = 37617691;BA.debugLine="LogSlowOperation(\"Reset\", startedAt)";
__ref._logslowoperation /*String*/ (null,"Reset",_startedat);
RDebugUtils.currentLine=37617692;
 //BA.debugLineNum = 37617692;BA.debugLine="End Sub";
return "";
}
public long  _duration(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "duration", false))
	 {return ((Long) Debug.delegate(ba, "duration", null));}
RDebugUtils.currentLine=38010880;
 //BA.debugLineNum = 38010880;BA.debugLine="Public Sub Duration As Long";
RDebugUtils.currentLine=38010881;
 //BA.debugLineNum = 38010881;BA.debugLine="If player.IsInitialized = False Then Return 0";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="Try";
try {RDebugUtils.currentLine=38010883;
 //BA.debugLineNum = 38010883;BA.debugLine="Return player.Duration";
if (true) return (long) (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getDuration());
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=38010885;
 //BA.debugLineNum = 38010885;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=38010887;
 //BA.debugLineNum = 38010887;BA.debugLine="End Sub";
return 0L;
}
public String  _stop(b4j.example.audioplayer __ref,int _fadetimems) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "stop", false))
	 {return ((String) Debug.delegate(ba, "stop", new Object[] {_fadetimems}));}
long _startedat = 0L;
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Public Sub Stop(fadeTimeMs As Int)";
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = __c.DateTime.getNow();
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=37552131;
 //BA.debugLineNum = 37552131;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=37552132;
 //BA.debugLineNum = 37552132;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=37552133;
 //BA.debugLineNum = 37552133;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=37552134;
 //BA.debugLineNum = 37552134;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=37552135;
 //BA.debugLineNum = 37552135;BA.debugLine="If player.IsInitialized = False Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=37552136;
 //BA.debugLineNum = 37552136;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=37552137;
 //BA.debugLineNum = 37552137;BA.debugLine="TraceAudio(\"Stop ignored. player not initialized";
__ref._traceaudio /*String*/ (null,"Stop ignored. player not initialized.");
RDebugUtils.currentLine=37552138;
 //BA.debugLineNum = 37552138;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=37552140;
 //BA.debugLineNum = 37552140;BA.debugLine="TraceAudio(\"Stop. fadeTimeMs=\" & fadeTimeMs & \",";
__ref._traceaudio /*String*/ (null,"Stop. fadeTimeMs="+BA.NumberToString(_fadetimems)+", currentVolume="+__c.NumberFormat2(__ref._currentvolume /*double*/ ,(int) (1),(int) (3),(int) (3),__c.False));
RDebugUtils.currentLine=37552141;
 //BA.debugLineNum = 37552141;BA.debugLine="If fadeTimeMs > 0 And currentVolume > 0 Then";
if (_fadetimems>0 && __ref._currentvolume /*double*/ >0) { 
RDebugUtils.currentLine=37552142;
 //BA.debugLineNum = 37552142;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=37552143;
 //BA.debugLineNum = 37552143;BA.debugLine="StartFade(FADE_OUT, 0, fadeTimeMs)";
__ref._startfade /*String*/ (null,__ref._fade_out /*int*/ ,0,_fadetimems);
 }else {
RDebugUtils.currentLine=37552145;
 //BA.debugLineNum = 37552145;BA.debugLine="StopImmediately";
__ref._stopimmediately /*String*/ (null);
 };
RDebugUtils.currentLine=37552147;
 //BA.debugLineNum = 37552147;BA.debugLine="LogSlowOperation(\"Stop\", startedAt)";
__ref._logslowoperation /*String*/ (null,"Stop",_startedat);
RDebugUtils.currentLine=37552148;
 //BA.debugLineNum = 37552148;BA.debugLine="End Sub";
return "";
}
public boolean  _isplaying(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isplaying", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaying", null));}
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Public Sub IsPlaying As Boolean";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="Return playerState = STATE_PLAYING";
if (true) return __ref._playerstate /*int*/ ==__ref._state_playing /*int*/ ;
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="End Sub";
return false;
}
public String  _loadurl(b4j.example.audioplayer __ref,String _url,double _volume) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "loadurl", false))
	 {return ((String) Debug.delegate(ba, "loadurl", new Object[] {_url,_volume}));}
long _startedat = 0L;
RDebugUtils.currentLine=37355520;
 //BA.debugLineNum = 37355520;BA.debugLine="Public Sub LoadUrl(url As String, volume As Double";
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = __c.DateTime.getNow();
RDebugUtils.currentLine=37355522;
 //BA.debugLineNum = 37355522;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=37355523;
 //BA.debugLineNum = 37355523;BA.debugLine="currentLoadToken = currentLoadToken + 1";
__ref._currentloadtoken /*long*/  = (long) (__ref._currentloadtoken /*long*/ +1);
RDebugUtils.currentLine=37355524;
 //BA.debugLineNum = 37355524;BA.debugLine="activeEventLoadToken = currentLoadToken";
__ref._activeeventloadtoken /*long*/  = __ref._currentloadtoken /*long*/ ;
RDebugUtils.currentLine=37355525;
 //BA.debugLineNum = 37355525;BA.debugLine="loadTimer.Interval = 10 * DateTime.TicksPerSecond";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (10*__c.DateTime.TicksPerSecond));
RDebugUtils.currentLine=37355526;
 //BA.debugLineNum = 37355526;BA.debugLine="loadTimer.Enabled = True";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=37355527;
 //BA.debugLineNum = 37355527;BA.debugLine="playerState = STATE_LOADING";
__ref._playerstate /*int*/  = __ref._state_loading /*int*/ ;
RDebugUtils.currentLine=37355528;
 //BA.debugLineNum = 37355528;BA.debugLine="maxVolume = Max(0, Min(1, volume))";
__ref._maxvolume /*double*/  = __c.Max(0,__c.Min(1,_volume));
RDebugUtils.currentLine=37355529;
 //BA.debugLineNum = 37355529;BA.debugLine="TraceAudio(\"LoadUrl. volume=\" & NumberFormat2(max";
__ref._traceaudio /*String*/ (null,"LoadUrl. volume="+__c.NumberFormat2(__ref._maxvolume /*double*/ ,(int) (1),(int) (3),(int) (3),__c.False)+", url="+_url);
RDebugUtils.currentLine=37355530;
 //BA.debugLineNum = 37355530;BA.debugLine="Try";
try {RDebugUtils.currentLine=37355531;
 //BA.debugLineNum = 37355531;BA.debugLine="player.Initialize(\"Player\", url)";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Initialize(ba,"Player",_url);
RDebugUtils.currentLine=37355532;
 //BA.debugLineNum = 37355532;BA.debugLine="jo = player";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getObject()));
RDebugUtils.currentLine=37355533;
 //BA.debugLineNum = 37355533;BA.debugLine="jo.RunMethod(\"setOnError\", Array As Object(jo.Cr";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOnError",new Object[]{__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .CreateEventFromUI(ba,"java.lang.Runnable","Error",(Object)(__c.False))});
RDebugUtils.currentLine=37355534;
 //BA.debugLineNum = 37355534;BA.debugLine="jo.RunMethod(\"setOnReady\", Array As Object(jo.Cr";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOnReady",new Object[]{__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .CreateEventFromUI(ba,"java.lang.Runnable","Ready",(Object)(__c.False))});
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=37355536;
 //BA.debugLineNum = 37355536;BA.debugLine="NotifyError(LastException.Message)";
__ref._notifyerror /*String*/ (null,__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=37355538;
 //BA.debugLineNum = 37355538;BA.debugLine="LogSlowOperation(\"LoadUrl\", startedAt)";
__ref._logslowoperation /*String*/ (null,"LoadUrl",_startedat);
RDebugUtils.currentLine=37355539;
 //BA.debugLineNum = 37355539;BA.debugLine="End Sub";
return "";
}
public String  _checktimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "checktimer_tick", false))
	 {return ((String) Debug.delegate(ba, "checktimer_tick", null));}
long _positionnow = 0L;
long _durationnow = 0L;
long _remainms = 0L;
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Private Sub CheckTimer_Tick";
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
if (__ref._playerstate /*int*/ !=__ref._state_playing /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="Dim positionNow As Long = Position";
_positionnow = __ref._position /*long*/ (null);
RDebugUtils.currentLine=38404099;
 //BA.debugLineNum = 38404099;BA.debugLine="If positionNow > lastPosition Then";
if (_positionnow>__ref._lastposition /*long*/ ) { 
RDebugUtils.currentLine=38404100;
 //BA.debugLineNum = 38404100;BA.debugLine="lastPosition = positionNow";
__ref._lastposition /*long*/  = _positionnow;
RDebugUtils.currentLine=38404101;
 //BA.debugLineNum = 38404101;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=38404102;
 //BA.debugLineNum = 38404102;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=38404104;
 //BA.debugLineNum = 38404104;BA.debugLine="Dim durationNow As Long = Duration";
_durationnow = __ref._duration /*long*/ (null);
RDebugUtils.currentLine=38404105;
 //BA.debugLineNum = 38404105;BA.debugLine="Dim remainMs As Long = -1";
_remainms = (long) (-1);
RDebugUtils.currentLine=38404106;
 //BA.debugLineNum = 38404106;BA.debugLine="If durationNow > 0 Then remainMs = Max(0, duratio";
if (_durationnow>0) { 
_remainms = (long) (__c.Max(0,_durationnow-_positionnow));};
RDebugUtils.currentLine=38404107;
 //BA.debugLineNum = 38404107;BA.debugLine="If durationNow > 0 And positionNow >= Max(0, dura";
if (_durationnow>0 && _positionnow>=__c.Max(0,_durationnow-2000)) { 
RDebugUtils.currentLine=38404108;
 //BA.debugLineNum = 38404108;BA.debugLine="TraceDiagnostic(\"хвост audio=\" & eventName & \" p";
__ref._tracediagnostic /*String*/ (null,"хвост audio="+__ref._eventname /*String*/ +" positionMs="+BA.NumberToString(_positionnow)+" durationMs="+BA.NumberToString(_durationnow)+" remainMs="+BA.NumberToString(_remainms)+" stalled="+BA.NumberToString(__ref._stalledcheckcount /*int*/ ));
RDebugUtils.currentLine=38404109;
 //BA.debugLineNum = 38404109;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=38404111;
 //BA.debugLineNum = 38404111;BA.debugLine="stalledCheckCount = stalledCheckCount + 1";
__ref._stalledcheckcount /*int*/  = (int) (__ref._stalledcheckcount /*int*/ +1);
RDebugUtils.currentLine=38404112;
 //BA.debugLineNum = 38404112;BA.debugLine="If stalledCheckCount = 1 Or stalledCheckCount = 3";
if (__ref._stalledcheckcount /*int*/ ==1 || __ref._stalledcheckcount /*int*/ ==3) { 
RDebugUtils.currentLine=38404113;
 //BA.debugLineNum = 38404113;BA.debugLine="TraceDiagnostic(\"задержка audio=\" & eventName &";
__ref._tracediagnostic /*String*/ (null,"задержка audio="+__ref._eventname /*String*/ +" positionMs="+BA.NumberToString(_positionnow)+" durationMs="+BA.NumberToString(_durationnow)+" remainMs="+BA.NumberToString(_remainms)+" stalled="+BA.NumberToString(__ref._stalledcheckcount /*int*/ ));
 };
RDebugUtils.currentLine=38404115;
 //BA.debugLineNum = 38404115;BA.debugLine="If stalledCheckCount < SILENCE_STALL_THRESHOLD Th";
if (__ref._stalledcheckcount /*int*/ <__ref._silence_stall_threshold /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=38404116;
 //BA.debugLineNum = 38404116;BA.debugLine="NotifyError(\"Silence detected \" & SILENCE_STALL_T";
__ref._notifyerror /*String*/ (null,"Silence detected "+BA.NumberToString(__ref._silence_stall_threshold /*int*/ ));
RDebugUtils.currentLine=38404117;
 //BA.debugLineNum = 38404117;BA.debugLine="End Sub";
return "";
}
public String  _tracediagnostic(b4j.example.audioplayer __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "tracediagnostic", false))
	 {return ((String) Debug.delegate(ba, "tracediagnostic", new Object[] {_message}));}
RDebugUtils.currentLine=38862848;
 //BA.debugLineNum = 38862848;BA.debugLine="Private Sub TraceDiagnostic(message As String)";
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="targetPage.TraceLog(message)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._tracelog /*String*/ (null,_message);
RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="End Sub";
return "";
}
public String  _notifyerror(b4j.example.audioplayer __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "notifyerror", false))
	 {return ((String) Debug.delegate(ba, "notifyerror", new Object[] {_message}));}
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Private Sub NotifyError(message As String)";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="TraceAudio(\"NotifyError. message=\" & message)";
__ref._traceaudio /*String*/ (null,"NotifyError. message="+_message);
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="targetPage.AudioPlayer_Error(audioKey, message)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._audioplayer_error /*String*/ (null,__ref._audiokey /*String*/ ,_message);
RDebugUtils.currentLine=38273028;
 //BA.debugLineNum = 38273028;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
RDebugUtils.currentLine=37224448;
 //BA.debugLineNum = 37224448;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=37224449;
 //BA.debugLineNum = 37224449;BA.debugLine="Private Const STATE_STOPPED = 0, STATE_LOADING =";
_state_stopped = (int) (0);
_state_loading = (int) (1);
_state_ready = (int) (2);
_state_playing = (int) (3);
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="Private Const FADE_NONE = 0, FADE_IN = 1, FADE_OU";
_fade_none = (int) (0);
_fade_in = (int) (1);
_fade_out = (int) (2);
RDebugUtils.currentLine=37224451;
 //BA.debugLineNum = 37224451;BA.debugLine="Private Const CHECK_TIMER_INTERVAL_MS As Int = 20";
_check_timer_interval_ms = (int) (2000);
RDebugUtils.currentLine=37224452;
 //BA.debugLineNum = 37224452;BA.debugLine="Private Const SILENCE_STALL_THRESHOLD As Int = 3";
_silence_stall_threshold = (int) (3);
RDebugUtils.currentLine=37224454;
 //BA.debugLineNum = 37224454;BA.debugLine="Private player As MediaPlayer";
_player = new anywheresoftware.b4j.objects.MediaPlayerWrapper();
RDebugUtils.currentLine=37224455;
 //BA.debugLineNum = 37224455;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=37224456;
 //BA.debugLineNum = 37224456;BA.debugLine="Private eventName As String";
_eventname = "";
RDebugUtils.currentLine=37224457;
 //BA.debugLineNum = 37224457;BA.debugLine="Private targetPage As B4XMainPage";
_targetpage = new b4j.example.b4xmainpage();
RDebugUtils.currentLine=37224458;
 //BA.debugLineNum = 37224458;BA.debugLine="Private timeUpdateTimer As Timer";
_timeupdatetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=37224459;
 //BA.debugLineNum = 37224459;BA.debugLine="Private lastPosition As Long";
_lastposition = 0L;
RDebugUtils.currentLine=37224460;
 //BA.debugLineNum = 37224460;BA.debugLine="Private checkTimer As Timer";
_checktimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=37224461;
 //BA.debugLineNum = 37224461;BA.debugLine="Private loadTimer As Timer";
_loadtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=37224462;
 //BA.debugLineNum = 37224462;BA.debugLine="Private fadeTimer As Timer";
_fadetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=37224463;
 //BA.debugLineNum = 37224463;BA.debugLine="Private playerState As Int";
_playerstate = 0;
RDebugUtils.currentLine=37224464;
 //BA.debugLineNum = 37224464;BA.debugLine="Private maxVolume As Double";
_maxvolume = 0;
RDebugUtils.currentLine=37224465;
 //BA.debugLineNum = 37224465;BA.debugLine="Private fadeMode As Int";
_fademode = 0;
RDebugUtils.currentLine=37224466;
 //BA.debugLineNum = 37224466;BA.debugLine="Private fadeTargetVolume As Double";
_fadetargetvolume = 0;
RDebugUtils.currentLine=37224467;
 //BA.debugLineNum = 37224467;BA.debugLine="Private fadeStepVolume As Double";
_fadestepvolume = 0;
RDebugUtils.currentLine=37224468;
 //BA.debugLineNum = 37224468;BA.debugLine="Private currentVolume As Double";
_currentvolume = 0;
RDebugUtils.currentLine=37224469;
 //BA.debugLineNum = 37224469;BA.debugLine="Private stalledCheckCount As Int";
_stalledcheckcount = 0;
RDebugUtils.currentLine=37224470;
 //BA.debugLineNum = 37224470;BA.debugLine="Private currentLoadToken As Long";
_currentloadtoken = 0L;
RDebugUtils.currentLine=37224471;
 //BA.debugLineNum = 37224471;BA.debugLine="Private activeEventLoadToken As Long";
_activeeventloadtoken = 0L;
RDebugUtils.currentLine=37224472;
 //BA.debugLineNum = 37224472;BA.debugLine="Private audioKey As String";
_audiokey = "";
RDebugUtils.currentLine=37224473;
 //BA.debugLineNum = 37224473;BA.debugLine="End Sub";
return "";
}
public String  _error_event(b4j.example.audioplayer __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "error_event", false))
	 {return ((String) Debug.delegate(ba, "error_event", new Object[] {_methodname,_args}));}
String _msg = "";
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Private Sub Error_Event(methodName As String, args";
RDebugUtils.currentLine=38141953;
 //BA.debugLineNum = 38141953;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (__ref._activeeventloadtoken /*long*/ !=__ref._currentloadtoken /*long*/ ) { 
RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="TraceAudio(\"Error ignored. stale_token=\" & activ";
__ref._traceaudio /*String*/ (null,"Error ignored. stale_token="+BA.NumberToString(__ref._activeeventloadtoken /*long*/ )+" current="+BA.NumberToString(__ref._currentloadtoken /*long*/ ));
RDebugUtils.currentLine=38141955;
 //BA.debugLineNum = 38141955;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=38141957;
 //BA.debugLineNum = 38141957;BA.debugLine="Dim msg As String = \"\"";
_msg = "";
RDebugUtils.currentLine=38141958;
 //BA.debugLineNum = 38141958;BA.debugLine="Try";
try {RDebugUtils.currentLine=38141959;
 //BA.debugLineNum = 38141959;BA.debugLine="msg = jo.RunMethod(\"getError\", Null)";
_msg = BA.ObjectToString(__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getError",(Object[])(__c.Null)));
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=38141961;
 //BA.debugLineNum = 38141961;BA.debugLine="msg = LastException.Message";
_msg = __c.LastException(ba).getMessage();
 };
RDebugUtils.currentLine=38141963;
 //BA.debugLineNum = 38141963;BA.debugLine="TraceAudio(\"Error_Event. message=\" & msg)";
__ref._traceaudio /*String*/ (null,"Error_Event. message="+_msg);
RDebugUtils.currentLine=38141964;
 //BA.debugLineNum = 38141964;BA.debugLine="NotifyError(msg)";
__ref._notifyerror /*String*/ (null,_msg);
RDebugUtils.currentLine=38141965;
 //BA.debugLineNum = 38141965;BA.debugLine="End Sub";
return "";
}
public String  _traceaudio(b4j.example.audioplayer __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "traceaudio", false))
	 {return ((String) Debug.delegate(ba, "traceaudio", new Object[] {_message}));}
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Private Sub TraceAudio(message As String)";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="targetPage.TraceLog(\"[\" & eventName & \"] \" & mess";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._tracelog /*String*/ (null,"["+__ref._eventname /*String*/ +"] "+_message);
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="End Sub";
return "";
}
public String  _fadetimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "fadetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "fadetimer_tick", null));}
double _nextvolume = 0;
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Private Sub FadeTimer_Tick";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="If player.IsInitialized = False Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38535171;
 //BA.debugLineNum = 38535171;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=38535172;
 //BA.debugLineNum = 38535172;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=38535174;
 //BA.debugLineNum = 38535174;BA.debugLine="Dim nextVolume As Double = currentVolume + fadeSt";
_nextvolume = __ref._currentvolume /*double*/ +__ref._fadestepvolume /*double*/ ;
RDebugUtils.currentLine=38535175;
 //BA.debugLineNum = 38535175;BA.debugLine="If fadeMode = FADE_IN Then";
if (__ref._fademode /*int*/ ==__ref._fade_in /*int*/ ) { 
RDebugUtils.currentLine=38535176;
 //BA.debugLineNum = 38535176;BA.debugLine="If nextVolume >= fadeTargetVolume Then";
if (_nextvolume>=__ref._fadetargetvolume /*double*/ ) { 
RDebugUtils.currentLine=38535177;
 //BA.debugLineNum = 38535177;BA.debugLine="nextVolume = fadeTargetVolume";
_nextvolume = __ref._fadetargetvolume /*double*/ ;
RDebugUtils.currentLine=38535178;
 //BA.debugLineNum = 38535178;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38535179;
 //BA.debugLineNum = 38535179;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
 };
 }else 
{RDebugUtils.currentLine=38535181;
 //BA.debugLineNum = 38535181;BA.debugLine="Else If fadeMode = FADE_OUT Then";
if (__ref._fademode /*int*/ ==__ref._fade_out /*int*/ ) { 
RDebugUtils.currentLine=38535182;
 //BA.debugLineNum = 38535182;BA.debugLine="If nextVolume <= fadeTargetVolume Then";
if (_nextvolume<=__ref._fadetargetvolume /*double*/ ) { 
RDebugUtils.currentLine=38535183;
 //BA.debugLineNum = 38535183;BA.debugLine="nextVolume = fadeTargetVolume";
_nextvolume = __ref._fadetargetvolume /*double*/ ;
RDebugUtils.currentLine=38535184;
 //BA.debugLineNum = 38535184;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38535185;
 //BA.debugLineNum = 38535185;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
 };
 }}
;
RDebugUtils.currentLine=38535188;
 //BA.debugLineNum = 38535188;BA.debugLine="SetPlayerVolume(nextVolume)";
__ref._setplayervolume /*String*/ (null,_nextvolume);
RDebugUtils.currentLine=38535189;
 //BA.debugLineNum = 38535189;BA.debugLine="If fadeMode = FADE_NONE And nextVolume <= 0 Then";
if (__ref._fademode /*int*/ ==__ref._fade_none /*int*/  && _nextvolume<=0) { 
RDebugUtils.currentLine=38535190;
 //BA.debugLineNum = 38535190;BA.debugLine="StopImmediately";
__ref._stopimmediately /*String*/ (null);
 };
RDebugUtils.currentLine=38535192;
 //BA.debugLineNum = 38535192;BA.debugLine="End Sub";
return "";
}
public String  _setplayervolume(b4j.example.audioplayer __ref,double _volumevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "setplayervolume", false))
	 {return ((String) Debug.delegate(ba, "setplayervolume", new Object[] {_volumevalue}));}
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Private Sub SetPlayerVolume(volumeValue As Double)";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="currentVolume = Max(0, Min(1, volumeValue))";
__ref._currentvolume /*double*/  = __c.Max(0,__c.Min(1,_volumevalue));
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38666243;
 //BA.debugLineNum = 38666243;BA.debugLine="Try";
try {RDebugUtils.currentLine=38666244;
 //BA.debugLineNum = 38666244;BA.debugLine="player.Volume = currentVolume";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(__ref._currentvolume /*double*/ );
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=38666246;
 //BA.debugLineNum = 38666246;BA.debugLine="TraceInternalError(\"set_volume\")";
__ref._traceinternalerror /*String*/ (null,"set_volume");
 };
RDebugUtils.currentLine=38666248;
 //BA.debugLineNum = 38666248;BA.debugLine="End Sub";
return "";
}
public String  _stopimmediately(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "stopimmediately", false))
	 {return ((String) Debug.delegate(ba, "stopimmediately", null));}
long _startedat = 0L;
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Private Sub StopImmediately";
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = __c.DateTime.getNow();
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38731779;
 //BA.debugLineNum = 38731779;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=38731780;
 //BA.debugLineNum = 38731780;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=38731781;
 //BA.debugLineNum = 38731781;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=38731782;
 //BA.debugLineNum = 38731782;BA.debugLine="TraceAudio(\"StopImmediately\")";
__ref._traceaudio /*String*/ (null,"StopImmediately");
RDebugUtils.currentLine=38731783;
 //BA.debugLineNum = 38731783;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38731784;
 //BA.debugLineNum = 38731784;BA.debugLine="Try";
try {RDebugUtils.currentLine=38731785;
 //BA.debugLineNum = 38731785;BA.debugLine="player.Volume = 0";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(0);
RDebugUtils.currentLine=38731786;
 //BA.debugLineNum = 38731786;BA.debugLine="player.Stop";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Stop();
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=38731788;
 //BA.debugLineNum = 38731788;BA.debugLine="TraceInternalError(\"stop_immediately\")";
__ref._traceinternalerror /*String*/ (null,"stop_immediately");
 };
RDebugUtils.currentLine=38731790;
 //BA.debugLineNum = 38731790;BA.debugLine="LogSlowOperation(\"StopImmediately\", startedAt)";
__ref._logslowoperation /*String*/ (null,"StopImmediately",_startedat);
RDebugUtils.currentLine=38731791;
 //BA.debugLineNum = 38731791;BA.debugLine="End Sub";
return "";
}
public String  _resolveaudiokey(b4j.example.audioplayer __ref,String _namevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "resolveaudiokey", false))
	 {return ((String) Debug.delegate(ba, "resolveaudiokey", new Object[] {_namevalue}));}
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Private Sub ResolveAudioKey(nameValue As String) A";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="If nameValue.ToLowerCase.Contains(\"secondary\") Th";
if (_namevalue.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).contains("secondary")) { 
if (true) return "secondary";};
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="Return \"primary\"";
if (true) return "primary";
RDebugUtils.currentLine=38993923;
 //BA.debugLineNum = 38993923;BA.debugLine="End Sub";
return "";
}
public boolean  _isloading(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isloading", false))
	 {return ((Boolean) Debug.delegate(ba, "isloading", null));}
RDebugUtils.currentLine=37748736;
 //BA.debugLineNum = 37748736;BA.debugLine="Public Sub IsLoading As Boolean";
RDebugUtils.currentLine=37748737;
 //BA.debugLineNum = 37748737;BA.debugLine="Return playerState = STATE_LOADING";
if (true) return __ref._playerstate /*int*/ ==__ref._state_loading /*int*/ ;
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="End Sub";
return false;
}
public boolean  _isready(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isready", false))
	 {return ((Boolean) Debug.delegate(ba, "isready", null));}
RDebugUtils.currentLine=37814272;
 //BA.debugLineNum = 37814272;BA.debugLine="Public Sub IsReady As Boolean";
RDebugUtils.currentLine=37814273;
 //BA.debugLineNum = 37814273;BA.debugLine="Return playerState = STATE_READY";
if (true) return __ref._playerstate /*int*/ ==__ref._state_ready /*int*/ ;
RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="End Sub";
return false;
}
public boolean  _isstopped(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isstopped", false))
	 {return ((Boolean) Debug.delegate(ba, "isstopped", null));}
RDebugUtils.currentLine=37683200;
 //BA.debugLineNum = 37683200;BA.debugLine="Public Sub IsStopped As Boolean";
RDebugUtils.currentLine=37683201;
 //BA.debugLineNum = 37683201;BA.debugLine="Return playerState = STATE_STOPPED";
if (true) return __ref._playerstate /*int*/ ==__ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="End Sub";
return false;
}
public String  _loadtimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "loadtimer_tick", false))
	 {return ((String) Debug.delegate(ba, "loadtimer_tick", null));}
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Private Sub LoadTimer_Tick";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="TraceAudio(\"Load timeout\")";
__ref._traceaudio /*String*/ (null,"Load timeout");
RDebugUtils.currentLine=38469635;
 //BA.debugLineNum = 38469635;BA.debugLine="NotifyError(\"Track loading timeout expired\")";
__ref._notifyerror /*String*/ (null,"Track loading timeout expired");
RDebugUtils.currentLine=38469636;
 //BA.debugLineNum = 38469636;BA.debugLine="End Sub";
return "";
}
public String  _logslowoperation(b4j.example.audioplayer __ref,String _operationname,long _startedat) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "logslowoperation", false))
	 {return ((String) Debug.delegate(ba, "logslowoperation", new Object[] {_operationname,_startedat}));}
long _elapsed = 0L;
RDebugUtils.currentLine=85983232;
 //BA.debugLineNum = 85983232;BA.debugLine="Private Sub LogSlowOperation(operationName As Stri";
RDebugUtils.currentLine=85983233;
 //BA.debugLineNum = 85983233;BA.debugLine="Dim elapsed As Long = DateTime.Now - startedAt";
_elapsed = (long) (__c.DateTime.getNow()-_startedat);
RDebugUtils.currentLine=85983234;
 //BA.debugLineNum = 85983234;BA.debugLine="If elapsed < 50 Then Return";
if (_elapsed<50) { 
if (true) return "";};
RDebugUtils.currentLine=85983235;
 //BA.debugLineNum = 85983235;BA.debugLine="TraceDiagnostic(\"audio slow op=\" & eventName & \".";
__ref._tracediagnostic /*String*/ (null,"audio slow op="+__ref._eventname /*String*/ +"."+_operationname+" elapsedMs="+BA.NumberToString(_elapsed)+" state="+BA.NumberToString(__ref._playerstate /*int*/ ));
RDebugUtils.currentLine=85983236;
 //BA.debugLineNum = 85983236;BA.debugLine="End Sub";
return "";
}
public String  _play(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "play", false))
	 {return ((String) Debug.delegate(ba, "play", null));}
RDebugUtils.currentLine=37421056;
 //BA.debugLineNum = 37421056;BA.debugLine="Public Sub Play";
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="PlayWithFade(0)";
__ref._playwithfade /*String*/ (null,(int) (0));
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="End Sub";
return "";
}
public String  _player_complete(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "player_complete", false))
	 {return ((String) Debug.delegate(ba, "player_complete", null));}
RDebugUtils.currentLine=38207488;
 //BA.debugLineNum = 38207488;BA.debugLine="Private Sub Player_Complete";
RDebugUtils.currentLine=38207489;
 //BA.debugLineNum = 38207489;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (__ref._activeeventloadtoken /*long*/ !=__ref._currentloadtoken /*long*/ ) { 
RDebugUtils.currentLine=38207490;
 //BA.debugLineNum = 38207490;BA.debugLine="TraceAudio(\"Complete ignored. stale_token=\" & ac";
__ref._traceaudio /*String*/ (null,"Complete ignored. stale_token="+BA.NumberToString(__ref._activeeventloadtoken /*long*/ )+" current="+BA.NumberToString(__ref._currentloadtoken /*long*/ ));
RDebugUtils.currentLine=38207491;
 //BA.debugLineNum = 38207491;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=38207493;
 //BA.debugLineNum = 38207493;BA.debugLine="If playerState = STATE_STOPPED Then Return";
if (__ref._playerstate /*int*/ ==__ref._state_stopped /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=38207494;
 //BA.debugLineNum = 38207494;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38207495;
 //BA.debugLineNum = 38207495;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38207496;
 //BA.debugLineNum = 38207496;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38207497;
 //BA.debugLineNum = 38207497;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38207498;
 //BA.debugLineNum = 38207498;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=38207499;
 //BA.debugLineNum = 38207499;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=38207500;
 //BA.debugLineNum = 38207500;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=38207501;
 //BA.debugLineNum = 38207501;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=38207502;
 //BA.debugLineNum = 38207502;BA.debugLine="TraceAudio(\"Complete\")";
__ref._traceaudio /*String*/ (null,"Complete");
RDebugUtils.currentLine=38207503;
 //BA.debugLineNum = 38207503;BA.debugLine="targetPage.AudioPlayer_Complete(audioKey)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._audioplayer_complete /*String*/ (null,__ref._audiokey /*String*/ );
RDebugUtils.currentLine=38207504;
 //BA.debugLineNum = 38207504;BA.debugLine="End Sub";
return "";
}
public String  _traceinternalerror(b4j.example.audioplayer __ref,String _context) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "traceinternalerror", false))
	 {return ((String) Debug.delegate(ba, "traceinternalerror", new Object[] {_context}));}
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Private Sub TraceInternalError(context As String)";
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="targetPage.TraceLog(\"ошибка аудио internal contex";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._tracelog /*String*/ (null,"ошибка аудио internal context="+_context+" message="+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="End Sub";
return "";
}
public String  _startfade(b4j.example.audioplayer __ref,int _mode,double _targetvolume,int _fadetimems) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "startfade", false))
	 {return ((String) Debug.delegate(ba, "startfade", new Object[] {_mode,_targetvolume,_fadetimems}));}
int _intervalms = 0;
int _steps = 0;
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Private Sub StartFade(mode As Int, targetVolume As";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=38600707;
 //BA.debugLineNum = 38600707;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38600708;
 //BA.debugLineNum = 38600708;BA.debugLine="If fadeTimeMs <= 0 Then";
if (_fadetimems<=0) { 
RDebugUtils.currentLine=38600709;
 //BA.debugLineNum = 38600709;BA.debugLine="SetPlayerVolume(targetVolume)";
__ref._setplayervolume /*String*/ (null,_targetvolume);
RDebugUtils.currentLine=38600710;
 //BA.debugLineNum = 38600710;BA.debugLine="If targetVolume <= 0 Then StopImmediately";
if (_targetvolume<=0) { 
__ref._stopimmediately /*String*/ (null);};
RDebugUtils.currentLine=38600711;
 //BA.debugLineNum = 38600711;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=38600713;
 //BA.debugLineNum = 38600713;BA.debugLine="Dim intervalMs As Int = Max(20, fadeTimer.Interva";
_intervalms = (int) (__c.Max(20,__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .getInterval()));
RDebugUtils.currentLine=38600714;
 //BA.debugLineNum = 38600714;BA.debugLine="Dim steps As Int = Max(1, Ceil(fadeTimeMs / inter";
_steps = (int) (__c.Max(1,__c.Ceil(_fadetimems/(double)_intervalms)));
RDebugUtils.currentLine=38600715;
 //BA.debugLineNum = 38600715;BA.debugLine="fadeMode = mode";
__ref._fademode /*int*/  = _mode;
RDebugUtils.currentLine=38600716;
 //BA.debugLineNum = 38600716;BA.debugLine="fadeTargetVolume = targetVolume";
__ref._fadetargetvolume /*double*/  = _targetvolume;
RDebugUtils.currentLine=38600717;
 //BA.debugLineNum = 38600717;BA.debugLine="fadeStepVolume = (targetVolume - currentVolume) /";
__ref._fadestepvolume /*double*/  = (_targetvolume-__ref._currentvolume /*double*/ )/(double)_steps;
RDebugUtils.currentLine=38600718;
 //BA.debugLineNum = 38600718;BA.debugLine="fadeTimer.Enabled = True";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=38600719;
 //BA.debugLineNum = 38600719;BA.debugLine="End Sub";
return "";
}
public String  _ready_event(b4j.example.audioplayer __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "ready_event", false))
	 {return ((String) Debug.delegate(ba, "ready_event", new Object[] {_methodname,_args}));}
RDebugUtils.currentLine=38076416;
 //BA.debugLineNum = 38076416;BA.debugLine="Private Sub Ready_Event(methodName As String, args";
RDebugUtils.currentLine=38076417;
 //BA.debugLineNum = 38076417;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (__ref._activeeventloadtoken /*long*/ !=__ref._currentloadtoken /*long*/ ) { 
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="TraceAudio(\"Ready ignored. stale_token=\" & activ";
__ref._traceaudio /*String*/ (null,"Ready ignored. stale_token="+BA.NumberToString(__ref._activeeventloadtoken /*long*/ )+" current="+BA.NumberToString(__ref._currentloadtoken /*long*/ ));
RDebugUtils.currentLine=38076419;
 //BA.debugLineNum = 38076419;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=38076421;
 //BA.debugLineNum = 38076421;BA.debugLine="playerState = STATE_READY";
__ref._playerstate /*int*/  = __ref._state_ready /*int*/ ;
RDebugUtils.currentLine=38076422;
 //BA.debugLineNum = 38076422;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38076423;
 //BA.debugLineNum = 38076423;BA.debugLine="TraceAudio(\"Ready\")";
__ref._traceaudio /*String*/ (null,"Ready");
RDebugUtils.currentLine=38076424;
 //BA.debugLineNum = 38076424;BA.debugLine="targetPage.AudioPlayer_Ready(audioKey)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._audioplayer_ready /*String*/ (null,__ref._audiokey /*String*/ );
RDebugUtils.currentLine=38076425;
 //BA.debugLineNum = 38076425;BA.debugLine="End Sub";
return "";
}
public String  _timeupdatetimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "timeupdatetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "timeupdatetimer_tick", null));}
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Private Sub TimeUpdateTimer_Tick";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
if (__ref._playerstate /*int*/ !=__ref._state_playing /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (__ref._activeeventloadtoken /*long*/ !=__ref._currentloadtoken /*long*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=38338563;
 //BA.debugLineNum = 38338563;BA.debugLine="targetPage.AudioPlayer_Timeupdate(audioKey)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._audioplayer_timeupdate /*String*/ (null,__ref._audiokey /*String*/ );
RDebugUtils.currentLine=38338564;
 //BA.debugLineNum = 38338564;BA.debugLine="End Sub";
return "";
}
}