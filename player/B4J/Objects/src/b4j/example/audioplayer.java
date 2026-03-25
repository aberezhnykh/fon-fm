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
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Public Sub PlayWithFade(fadeTimeMs As Int)";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="If playerState <> STATE_READY Then";
if (__ref._playerstate /*int*/ !=__ref._state_ready /*int*/ ) { 
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="TraceInternalError(\"play_with_fade_not_ready sta";
__ref._traceinternalerror /*String*/ (null,"play_with_fade_not_ready state="+BA.NumberToString(__ref._playerstate /*int*/ ));
RDebugUtils.currentLine=30539779;
 //BA.debugLineNum = 30539779;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=30539781;
 //BA.debugLineNum = 30539781;BA.debugLine="playerState = STATE_PLAYING";
__ref._playerstate /*int*/  = __ref._state_playing /*int*/ ;
RDebugUtils.currentLine=30539782;
 //BA.debugLineNum = 30539782;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=30539783;
 //BA.debugLineNum = 30539783;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=30539784;
 //BA.debugLineNum = 30539784;BA.debugLine="checkTimer.Enabled = True";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=30539785;
 //BA.debugLineNum = 30539785;BA.debugLine="timeUpdateTimer.Enabled = True";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=30539786;
 //BA.debugLineNum = 30539786;BA.debugLine="If fadeTimeMs > 0 Then";
if (_fadetimems>0) { 
RDebugUtils.currentLine=30539787;
 //BA.debugLineNum = 30539787;BA.debugLine="SetPlayerVolume(0)";
__ref._setplayervolume /*String*/ (null,0);
 }else {
RDebugUtils.currentLine=30539789;
 //BA.debugLineNum = 30539789;BA.debugLine="SetPlayerVolume(maxVolume)";
__ref._setplayervolume /*String*/ (null,__ref._maxvolume /*double*/ );
 };
RDebugUtils.currentLine=30539791;
 //BA.debugLineNum = 30539791;BA.debugLine="player.Play";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Play();
RDebugUtils.currentLine=30539792;
 //BA.debugLineNum = 30539792;BA.debugLine="TraceAudio(\"PlayWithFade. fadeTimeMs=\" & fadeTime";
__ref._traceaudio /*String*/ (null,"PlayWithFade. fadeTimeMs="+BA.NumberToString(_fadetimems)+", maxVolume="+__c.NumberFormat2(__ref._maxvolume /*double*/ ,(int) (1),(int) (3),(int) (3),__c.False));
RDebugUtils.currentLine=30539793;
 //BA.debugLineNum = 30539793;BA.debugLine="If fadeTimeMs > 0 Then";
if (_fadetimems>0) { 
RDebugUtils.currentLine=30539794;
 //BA.debugLineNum = 30539794;BA.debugLine="StartFade(FADE_IN, maxVolume, fadeTimeMs)";
__ref._startfade /*String*/ (null,__ref._fade_in /*int*/ ,__ref._maxvolume /*double*/ ,_fadetimems);
 };
RDebugUtils.currentLine=30539796;
 //BA.debugLineNum = 30539796;BA.debugLine="End Sub";
return "";
}
public long  _position(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "position", false))
	 {return ((Long) Debug.delegate(ba, "position", null));}
RDebugUtils.currentLine=30998528;
 //BA.debugLineNum = 30998528;BA.debugLine="Public Sub Position As Long";
RDebugUtils.currentLine=30998529;
 //BA.debugLineNum = 30998529;BA.debugLine="If player.IsInitialized = False Then Return 0";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=30998530;
 //BA.debugLineNum = 30998530;BA.debugLine="Try";
try {RDebugUtils.currentLine=30998531;
 //BA.debugLineNum = 30998531;BA.debugLine="Return player.Position";
if (true) return (long) (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getPosition());
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=30998533;
 //BA.debugLineNum = 30998533;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=30998535;
 //BA.debugLineNum = 30998535;BA.debugLine="End Sub";
return 0L;
}
public String  _initialize(b4j.example.audioplayer __ref,anywheresoftware.b4a.BA _ba,String _eventnamevalue,b4j.example.b4xmainpage _targetpagevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_eventnamevalue,_targetpagevalue}));}
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Public Sub Initialize (eventNameValue As String, t";
RDebugUtils.currentLine=30343169;
 //BA.debugLineNum = 30343169;BA.debugLine="eventName = eventNameValue";
__ref._eventname /*String*/  = _eventnamevalue;
RDebugUtils.currentLine=30343170;
 //BA.debugLineNum = 30343170;BA.debugLine="targetPage = targetPageValue";
__ref._targetpage /*b4j.example.b4xmainpage*/  = _targetpagevalue;
RDebugUtils.currentLine=30343171;
 //BA.debugLineNum = 30343171;BA.debugLine="audioKey = ResolveAudioKey(eventName)";
__ref._audiokey /*String*/  = __ref._resolveaudiokey /*String*/ (null,__ref._eventname /*String*/ );
RDebugUtils.currentLine=30343172;
 //BA.debugLineNum = 30343172;BA.debugLine="loadTimer.Initialize(\"LoadTimer\", 10 * DateTime.T";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"LoadTimer",(long) (10*__c.DateTime.TicksPerSecond));
RDebugUtils.currentLine=30343173;
 //BA.debugLineNum = 30343173;BA.debugLine="checkTimer.Initialize(\"CheckTimer\", CHECK_TIMER_I";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"CheckTimer",(long) (__ref._check_timer_interval_ms /*int*/ ));
RDebugUtils.currentLine=30343174;
 //BA.debugLineNum = 30343174;BA.debugLine="timeUpdateTimer.Initialize(\"TimeUpdateTimer\", 250";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"TimeUpdateTimer",(long) (250));
RDebugUtils.currentLine=30343175;
 //BA.debugLineNum = 30343175;BA.debugLine="fadeTimer.Initialize(\"FadeTimer\", 40)";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"FadeTimer",(long) (40));
RDebugUtils.currentLine=30343176;
 //BA.debugLineNum = 30343176;BA.debugLine="TraceAudio(\"Initialize\")";
__ref._traceaudio /*String*/ (null,"Initialize");
RDebugUtils.currentLine=30343177;
 //BA.debugLineNum = 30343177;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=30670849;
 //BA.debugLineNum = 30670849;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30670851;
 //BA.debugLineNum = 30670851;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30670852;
 //BA.debugLineNum = 30670852;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30670853;
 //BA.debugLineNum = 30670853;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=30670854;
 //BA.debugLineNum = 30670854;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=30670855;
 //BA.debugLineNum = 30670855;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=30670856;
 //BA.debugLineNum = 30670856;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=30670857;
 //BA.debugLineNum = 30670857;BA.debugLine="activeEventLoadToken = 0";
__ref._activeeventloadtoken /*long*/  = (long) (0);
RDebugUtils.currentLine=30670858;
 //BA.debugLineNum = 30670858;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=30670859;
 //BA.debugLineNum = 30670859;BA.debugLine="If player.IsInitialized Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=30670860;
 //BA.debugLineNum = 30670860;BA.debugLine="Try";
try {RDebugUtils.currentLine=30670861;
 //BA.debugLineNum = 30670861;BA.debugLine="player.Volume = 0";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(0);
RDebugUtils.currentLine=30670862;
 //BA.debugLineNum = 30670862;BA.debugLine="player.Stop";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Stop();
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=30670864;
 //BA.debugLineNum = 30670864;BA.debugLine="TraceInternalError(\"reset_stop\")";
__ref._traceinternalerror /*String*/ (null,"reset_stop");
 };
RDebugUtils.currentLine=30670866;
 //BA.debugLineNum = 30670866;BA.debugLine="If jo.IsInitialized Then";
if (__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .IsInitialized()) { 
RDebugUtils.currentLine=30670867;
 //BA.debugLineNum = 30670867;BA.debugLine="Try";
try {RDebugUtils.currentLine=30670868;
 //BA.debugLineNum = 30670868;BA.debugLine="jo.RunMethod(\"dispose\", Null)";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("dispose",(Object[])(__c.Null));
 } 
       catch (Exception e22) {
			ba.setLastException(e22);RDebugUtils.currentLine=30670870;
 //BA.debugLineNum = 30670870;BA.debugLine="TraceInternalError(\"reset_dispose\")";
__ref._traceinternalerror /*String*/ (null,"reset_dispose");
 };
 };
 };
RDebugUtils.currentLine=30670874;
 //BA.debugLineNum = 30670874;BA.debugLine="End Sub";
return "";
}
public long  _duration(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "duration", false))
	 {return ((Long) Debug.delegate(ba, "duration", null));}
RDebugUtils.currentLine=31064064;
 //BA.debugLineNum = 31064064;BA.debugLine="Public Sub Duration As Long";
RDebugUtils.currentLine=31064065;
 //BA.debugLineNum = 31064065;BA.debugLine="If player.IsInitialized = False Then Return 0";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=31064066;
 //BA.debugLineNum = 31064066;BA.debugLine="Try";
try {RDebugUtils.currentLine=31064067;
 //BA.debugLineNum = 31064067;BA.debugLine="Return player.Duration";
if (true) return (long) (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getDuration());
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=31064069;
 //BA.debugLineNum = 31064069;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=31064071;
 //BA.debugLineNum = 31064071;BA.debugLine="End Sub";
return 0L;
}
public String  _stop(b4j.example.audioplayer __ref,int _fadetimems) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "stop", false))
	 {return ((String) Debug.delegate(ba, "stop", new Object[] {_fadetimems}));}
RDebugUtils.currentLine=30605312;
 //BA.debugLineNum = 30605312;BA.debugLine="Public Sub Stop(fadeTimeMs As Int)";
RDebugUtils.currentLine=30605313;
 //BA.debugLineNum = 30605313;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30605314;
 //BA.debugLineNum = 30605314;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30605315;
 //BA.debugLineNum = 30605315;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30605316;
 //BA.debugLineNum = 30605316;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=30605317;
 //BA.debugLineNum = 30605317;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=30605318;
 //BA.debugLineNum = 30605318;BA.debugLine="If player.IsInitialized = False Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=30605319;
 //BA.debugLineNum = 30605319;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=30605320;
 //BA.debugLineNum = 30605320;BA.debugLine="TraceAudio(\"Stop ignored. player not initialized";
__ref._traceaudio /*String*/ (null,"Stop ignored. player not initialized.");
RDebugUtils.currentLine=30605321;
 //BA.debugLineNum = 30605321;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=30605323;
 //BA.debugLineNum = 30605323;BA.debugLine="TraceAudio(\"Stop. fadeTimeMs=\" & fadeTimeMs & \",";
__ref._traceaudio /*String*/ (null,"Stop. fadeTimeMs="+BA.NumberToString(_fadetimems)+", currentVolume="+__c.NumberFormat2(__ref._currentvolume /*double*/ ,(int) (1),(int) (3),(int) (3),__c.False));
RDebugUtils.currentLine=30605324;
 //BA.debugLineNum = 30605324;BA.debugLine="If fadeTimeMs > 0 And currentVolume > 0 Then";
if (_fadetimems>0 && __ref._currentvolume /*double*/ >0) { 
RDebugUtils.currentLine=30605325;
 //BA.debugLineNum = 30605325;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=30605326;
 //BA.debugLineNum = 30605326;BA.debugLine="StartFade(FADE_OUT, 0, fadeTimeMs)";
__ref._startfade /*String*/ (null,__ref._fade_out /*int*/ ,0,_fadetimems);
 }else {
RDebugUtils.currentLine=30605328;
 //BA.debugLineNum = 30605328;BA.debugLine="StopImmediately";
__ref._stopimmediately /*String*/ (null);
 };
RDebugUtils.currentLine=30605330;
 //BA.debugLineNum = 30605330;BA.debugLine="End Sub";
return "";
}
public boolean  _isplaying(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isplaying", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaying", null));}
RDebugUtils.currentLine=30932992;
 //BA.debugLineNum = 30932992;BA.debugLine="Public Sub IsPlaying As Boolean";
RDebugUtils.currentLine=30932993;
 //BA.debugLineNum = 30932993;BA.debugLine="Return playerState = STATE_PLAYING";
if (true) return __ref._playerstate /*int*/ ==__ref._state_playing /*int*/ ;
RDebugUtils.currentLine=30932994;
 //BA.debugLineNum = 30932994;BA.debugLine="End Sub";
return false;
}
public String  _loadurl(b4j.example.audioplayer __ref,String _url,double _volume) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "loadurl", false))
	 {return ((String) Debug.delegate(ba, "loadurl", new Object[] {_url,_volume}));}
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="Public Sub LoadUrl(url As String, volume As Double";
RDebugUtils.currentLine=30408705;
 //BA.debugLineNum = 30408705;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=30408706;
 //BA.debugLineNum = 30408706;BA.debugLine="currentLoadToken = currentLoadToken + 1";
__ref._currentloadtoken /*long*/  = (long) (__ref._currentloadtoken /*long*/ +1);
RDebugUtils.currentLine=30408707;
 //BA.debugLineNum = 30408707;BA.debugLine="activeEventLoadToken = currentLoadToken";
__ref._activeeventloadtoken /*long*/  = __ref._currentloadtoken /*long*/ ;
RDebugUtils.currentLine=30408708;
 //BA.debugLineNum = 30408708;BA.debugLine="loadTimer.Interval = 10 * DateTime.TicksPerSecond";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (10*__c.DateTime.TicksPerSecond));
RDebugUtils.currentLine=30408709;
 //BA.debugLineNum = 30408709;BA.debugLine="loadTimer.Enabled = True";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=30408710;
 //BA.debugLineNum = 30408710;BA.debugLine="playerState = STATE_LOADING";
__ref._playerstate /*int*/  = __ref._state_loading /*int*/ ;
RDebugUtils.currentLine=30408711;
 //BA.debugLineNum = 30408711;BA.debugLine="maxVolume = Max(0, Min(1, volume))";
__ref._maxvolume /*double*/  = __c.Max(0,__c.Min(1,_volume));
RDebugUtils.currentLine=30408712;
 //BA.debugLineNum = 30408712;BA.debugLine="TraceAudio(\"LoadUrl. volume=\" & NumberFormat2(max";
__ref._traceaudio /*String*/ (null,"LoadUrl. volume="+__c.NumberFormat2(__ref._maxvolume /*double*/ ,(int) (1),(int) (3),(int) (3),__c.False)+", url="+_url);
RDebugUtils.currentLine=30408713;
 //BA.debugLineNum = 30408713;BA.debugLine="Try";
try {RDebugUtils.currentLine=30408714;
 //BA.debugLineNum = 30408714;BA.debugLine="player.Initialize(\"Player\", url)";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Initialize(ba,"Player",_url);
RDebugUtils.currentLine=30408715;
 //BA.debugLineNum = 30408715;BA.debugLine="jo = player";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getObject()));
RDebugUtils.currentLine=30408716;
 //BA.debugLineNum = 30408716;BA.debugLine="jo.RunMethod(\"setOnError\", Array As Object(jo.Cr";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOnError",new Object[]{__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .CreateEventFromUI(ba,"java.lang.Runnable","Error",(Object)(__c.False))});
RDebugUtils.currentLine=30408717;
 //BA.debugLineNum = 30408717;BA.debugLine="jo.RunMethod(\"setOnReady\", Array As Object(jo.Cr";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOnReady",new Object[]{__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .CreateEventFromUI(ba,"java.lang.Runnable","Ready",(Object)(__c.False))});
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=30408719;
 //BA.debugLineNum = 30408719;BA.debugLine="NotifyError(LastException.Message)";
__ref._notifyerror /*String*/ (null,__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=30408721;
 //BA.debugLineNum = 30408721;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31457280;
 //BA.debugLineNum = 31457280;BA.debugLine="Private Sub CheckTimer_Tick";
RDebugUtils.currentLine=31457281;
 //BA.debugLineNum = 31457281;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
if (__ref._playerstate /*int*/ !=__ref._state_playing /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=31457282;
 //BA.debugLineNum = 31457282;BA.debugLine="Dim positionNow As Long = Position";
_positionnow = __ref._position /*long*/ (null);
RDebugUtils.currentLine=31457283;
 //BA.debugLineNum = 31457283;BA.debugLine="If positionNow > lastPosition Then";
if (_positionnow>__ref._lastposition /*long*/ ) { 
RDebugUtils.currentLine=31457284;
 //BA.debugLineNum = 31457284;BA.debugLine="lastPosition = positionNow";
__ref._lastposition /*long*/  = _positionnow;
RDebugUtils.currentLine=31457285;
 //BA.debugLineNum = 31457285;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=31457286;
 //BA.debugLineNum = 31457286;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=31457288;
 //BA.debugLineNum = 31457288;BA.debugLine="Dim durationNow As Long = Duration";
_durationnow = __ref._duration /*long*/ (null);
RDebugUtils.currentLine=31457289;
 //BA.debugLineNum = 31457289;BA.debugLine="Dim remainMs As Long = -1";
_remainms = (long) (-1);
RDebugUtils.currentLine=31457290;
 //BA.debugLineNum = 31457290;BA.debugLine="If durationNow > 0 Then remainMs = Max(0, duratio";
if (_durationnow>0) { 
_remainms = (long) (__c.Max(0,_durationnow-_positionnow));};
RDebugUtils.currentLine=31457291;
 //BA.debugLineNum = 31457291;BA.debugLine="If durationNow > 0 And positionNow >= Max(0, dura";
if (_durationnow>0 && _positionnow>=__c.Max(0,_durationnow-2000)) { 
RDebugUtils.currentLine=31457292;
 //BA.debugLineNum = 31457292;BA.debugLine="TraceDiagnostic(\"хвост audio=\" & eventName & \" p";
__ref._tracediagnostic /*String*/ (null,"хвост audio="+__ref._eventname /*String*/ +" positionMs="+BA.NumberToString(_positionnow)+" durationMs="+BA.NumberToString(_durationnow)+" remainMs="+BA.NumberToString(_remainms)+" stalled="+BA.NumberToString(__ref._stalledcheckcount /*int*/ ));
RDebugUtils.currentLine=31457293;
 //BA.debugLineNum = 31457293;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=31457295;
 //BA.debugLineNum = 31457295;BA.debugLine="stalledCheckCount = stalledCheckCount + 1";
__ref._stalledcheckcount /*int*/  = (int) (__ref._stalledcheckcount /*int*/ +1);
RDebugUtils.currentLine=31457296;
 //BA.debugLineNum = 31457296;BA.debugLine="If stalledCheckCount = 1 Or stalledCheckCount = 3";
if (__ref._stalledcheckcount /*int*/ ==1 || __ref._stalledcheckcount /*int*/ ==3) { 
RDebugUtils.currentLine=31457297;
 //BA.debugLineNum = 31457297;BA.debugLine="TraceDiagnostic(\"задержка audio=\" & eventName &";
__ref._tracediagnostic /*String*/ (null,"задержка audio="+__ref._eventname /*String*/ +" positionMs="+BA.NumberToString(_positionnow)+" durationMs="+BA.NumberToString(_durationnow)+" remainMs="+BA.NumberToString(_remainms)+" stalled="+BA.NumberToString(__ref._stalledcheckcount /*int*/ ));
 };
RDebugUtils.currentLine=31457299;
 //BA.debugLineNum = 31457299;BA.debugLine="If stalledCheckCount < SILENCE_STALL_THRESHOLD Th";
if (__ref._stalledcheckcount /*int*/ <__ref._silence_stall_threshold /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=31457300;
 //BA.debugLineNum = 31457300;BA.debugLine="NotifyError(\"Silence detected \" & SILENCE_STALL_T";
__ref._notifyerror /*String*/ (null,"Silence detected "+BA.NumberToString(__ref._silence_stall_threshold /*int*/ ));
RDebugUtils.currentLine=31457301;
 //BA.debugLineNum = 31457301;BA.debugLine="End Sub";
return "";
}
public String  _tracediagnostic(b4j.example.audioplayer __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "tracediagnostic", false))
	 {return ((String) Debug.delegate(ba, "tracediagnostic", new Object[] {_message}));}
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Private Sub TraceDiagnostic(message As String)";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="targetPage.TraceLog(message)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._tracelog /*String*/ (null,_message);
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="End Sub";
return "";
}
public String  _notifyerror(b4j.example.audioplayer __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "notifyerror", false))
	 {return ((String) Debug.delegate(ba, "notifyerror", new Object[] {_message}));}
RDebugUtils.currentLine=31326208;
 //BA.debugLineNum = 31326208;BA.debugLine="Private Sub NotifyError(message As String)";
RDebugUtils.currentLine=31326209;
 //BA.debugLineNum = 31326209;BA.debugLine="TraceAudio(\"NotifyError. message=\" & message)";
__ref._traceaudio /*String*/ (null,"NotifyError. message="+_message);
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=31326211;
 //BA.debugLineNum = 31326211;BA.debugLine="targetPage.AudioPlayer_Error(audioKey, message)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._audioplayer_error /*String*/ (null,__ref._audiokey /*String*/ ,_message);
RDebugUtils.currentLine=31326212;
 //BA.debugLineNum = 31326212;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
RDebugUtils.currentLine=30277632;
 //BA.debugLineNum = 30277632;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=30277633;
 //BA.debugLineNum = 30277633;BA.debugLine="Private Const STATE_STOPPED = 0, STATE_LOADING =";
_state_stopped = (int) (0);
_state_loading = (int) (1);
_state_ready = (int) (2);
_state_playing = (int) (3);
RDebugUtils.currentLine=30277634;
 //BA.debugLineNum = 30277634;BA.debugLine="Private Const FADE_NONE = 0, FADE_IN = 1, FADE_OU";
_fade_none = (int) (0);
_fade_in = (int) (1);
_fade_out = (int) (2);
RDebugUtils.currentLine=30277635;
 //BA.debugLineNum = 30277635;BA.debugLine="Private Const CHECK_TIMER_INTERVAL_MS As Int = 20";
_check_timer_interval_ms = (int) (2000);
RDebugUtils.currentLine=30277636;
 //BA.debugLineNum = 30277636;BA.debugLine="Private Const SILENCE_STALL_THRESHOLD As Int = 3";
_silence_stall_threshold = (int) (3);
RDebugUtils.currentLine=30277638;
 //BA.debugLineNum = 30277638;BA.debugLine="Private player As MediaPlayer";
_player = new anywheresoftware.b4j.objects.MediaPlayerWrapper();
RDebugUtils.currentLine=30277639;
 //BA.debugLineNum = 30277639;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=30277640;
 //BA.debugLineNum = 30277640;BA.debugLine="Private eventName As String";
_eventname = "";
RDebugUtils.currentLine=30277641;
 //BA.debugLineNum = 30277641;BA.debugLine="Private targetPage As B4XMainPage";
_targetpage = new b4j.example.b4xmainpage();
RDebugUtils.currentLine=30277642;
 //BA.debugLineNum = 30277642;BA.debugLine="Private timeUpdateTimer As Timer";
_timeupdatetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=30277643;
 //BA.debugLineNum = 30277643;BA.debugLine="Private lastPosition As Long";
_lastposition = 0L;
RDebugUtils.currentLine=30277644;
 //BA.debugLineNum = 30277644;BA.debugLine="Private checkTimer As Timer";
_checktimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=30277645;
 //BA.debugLineNum = 30277645;BA.debugLine="Private loadTimer As Timer";
_loadtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=30277646;
 //BA.debugLineNum = 30277646;BA.debugLine="Private fadeTimer As Timer";
_fadetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=30277647;
 //BA.debugLineNum = 30277647;BA.debugLine="Private playerState As Int";
_playerstate = 0;
RDebugUtils.currentLine=30277648;
 //BA.debugLineNum = 30277648;BA.debugLine="Private maxVolume As Double";
_maxvolume = 0;
RDebugUtils.currentLine=30277649;
 //BA.debugLineNum = 30277649;BA.debugLine="Private fadeMode As Int";
_fademode = 0;
RDebugUtils.currentLine=30277650;
 //BA.debugLineNum = 30277650;BA.debugLine="Private fadeTargetVolume As Double";
_fadetargetvolume = 0;
RDebugUtils.currentLine=30277651;
 //BA.debugLineNum = 30277651;BA.debugLine="Private fadeStepVolume As Double";
_fadestepvolume = 0;
RDebugUtils.currentLine=30277652;
 //BA.debugLineNum = 30277652;BA.debugLine="Private currentVolume As Double";
_currentvolume = 0;
RDebugUtils.currentLine=30277653;
 //BA.debugLineNum = 30277653;BA.debugLine="Private stalledCheckCount As Int";
_stalledcheckcount = 0;
RDebugUtils.currentLine=30277654;
 //BA.debugLineNum = 30277654;BA.debugLine="Private currentLoadToken As Long";
_currentloadtoken = 0L;
RDebugUtils.currentLine=30277655;
 //BA.debugLineNum = 30277655;BA.debugLine="Private activeEventLoadToken As Long";
_activeeventloadtoken = 0L;
RDebugUtils.currentLine=30277656;
 //BA.debugLineNum = 30277656;BA.debugLine="Private audioKey As String";
_audiokey = "";
RDebugUtils.currentLine=30277657;
 //BA.debugLineNum = 30277657;BA.debugLine="End Sub";
return "";
}
public String  _error_event(b4j.example.audioplayer __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "error_event", false))
	 {return ((String) Debug.delegate(ba, "error_event", new Object[] {_methodname,_args}));}
String _msg = "";
RDebugUtils.currentLine=31195136;
 //BA.debugLineNum = 31195136;BA.debugLine="Private Sub Error_Event(methodName As String, args";
RDebugUtils.currentLine=31195137;
 //BA.debugLineNum = 31195137;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (__ref._activeeventloadtoken /*long*/ !=__ref._currentloadtoken /*long*/ ) { 
RDebugUtils.currentLine=31195138;
 //BA.debugLineNum = 31195138;BA.debugLine="TraceAudio(\"Error ignored. stale_token=\" & activ";
__ref._traceaudio /*String*/ (null,"Error ignored. stale_token="+BA.NumberToString(__ref._activeeventloadtoken /*long*/ )+" current="+BA.NumberToString(__ref._currentloadtoken /*long*/ ));
RDebugUtils.currentLine=31195139;
 //BA.debugLineNum = 31195139;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=31195141;
 //BA.debugLineNum = 31195141;BA.debugLine="Dim msg As String = \"\"";
_msg = "";
RDebugUtils.currentLine=31195142;
 //BA.debugLineNum = 31195142;BA.debugLine="Try";
try {RDebugUtils.currentLine=31195143;
 //BA.debugLineNum = 31195143;BA.debugLine="msg = jo.RunMethod(\"getError\", Null)";
_msg = BA.ObjectToString(__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getError",(Object[])(__c.Null)));
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=31195145;
 //BA.debugLineNum = 31195145;BA.debugLine="msg = LastException.Message";
_msg = __c.LastException(ba).getMessage();
 };
RDebugUtils.currentLine=31195147;
 //BA.debugLineNum = 31195147;BA.debugLine="TraceAudio(\"Error_Event. message=\" & msg)";
__ref._traceaudio /*String*/ (null,"Error_Event. message="+_msg);
RDebugUtils.currentLine=31195148;
 //BA.debugLineNum = 31195148;BA.debugLine="NotifyError(msg)";
__ref._notifyerror /*String*/ (null,_msg);
RDebugUtils.currentLine=31195149;
 //BA.debugLineNum = 31195149;BA.debugLine="End Sub";
return "";
}
public String  _traceaudio(b4j.example.audioplayer __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "traceaudio", false))
	 {return ((String) Debug.delegate(ba, "traceaudio", new Object[] {_message}));}
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Private Sub TraceAudio(message As String)";
RDebugUtils.currentLine=31981569;
 //BA.debugLineNum = 31981569;BA.debugLine="targetPage.TraceLog(\"[\" & eventName & \"] \" & mess";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._tracelog /*String*/ (null,"["+__ref._eventname /*String*/ +"] "+_message);
RDebugUtils.currentLine=31981570;
 //BA.debugLineNum = 31981570;BA.debugLine="End Sub";
return "";
}
public String  _fadetimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "fadetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "fadetimer_tick", null));}
double _nextvolume = 0;
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Private Sub FadeTimer_Tick";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="If player.IsInitialized = False Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=31588355;
 //BA.debugLineNum = 31588355;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=31588356;
 //BA.debugLineNum = 31588356;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=31588358;
 //BA.debugLineNum = 31588358;BA.debugLine="Dim nextVolume As Double = currentVolume + fadeSt";
_nextvolume = __ref._currentvolume /*double*/ +__ref._fadestepvolume /*double*/ ;
RDebugUtils.currentLine=31588359;
 //BA.debugLineNum = 31588359;BA.debugLine="If fadeMode = FADE_IN Then";
if (__ref._fademode /*int*/ ==__ref._fade_in /*int*/ ) { 
RDebugUtils.currentLine=31588360;
 //BA.debugLineNum = 31588360;BA.debugLine="If nextVolume >= fadeTargetVolume Then";
if (_nextvolume>=__ref._fadetargetvolume /*double*/ ) { 
RDebugUtils.currentLine=31588361;
 //BA.debugLineNum = 31588361;BA.debugLine="nextVolume = fadeTargetVolume";
_nextvolume = __ref._fadetargetvolume /*double*/ ;
RDebugUtils.currentLine=31588362;
 //BA.debugLineNum = 31588362;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=31588363;
 //BA.debugLineNum = 31588363;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
 };
 }else 
{RDebugUtils.currentLine=31588365;
 //BA.debugLineNum = 31588365;BA.debugLine="Else If fadeMode = FADE_OUT Then";
if (__ref._fademode /*int*/ ==__ref._fade_out /*int*/ ) { 
RDebugUtils.currentLine=31588366;
 //BA.debugLineNum = 31588366;BA.debugLine="If nextVolume <= fadeTargetVolume Then";
if (_nextvolume<=__ref._fadetargetvolume /*double*/ ) { 
RDebugUtils.currentLine=31588367;
 //BA.debugLineNum = 31588367;BA.debugLine="nextVolume = fadeTargetVolume";
_nextvolume = __ref._fadetargetvolume /*double*/ ;
RDebugUtils.currentLine=31588368;
 //BA.debugLineNum = 31588368;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=31588369;
 //BA.debugLineNum = 31588369;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
 };
 }}
;
RDebugUtils.currentLine=31588372;
 //BA.debugLineNum = 31588372;BA.debugLine="SetPlayerVolume(nextVolume)";
__ref._setplayervolume /*String*/ (null,_nextvolume);
RDebugUtils.currentLine=31588373;
 //BA.debugLineNum = 31588373;BA.debugLine="If fadeMode = FADE_NONE And nextVolume <= 0 Then";
if (__ref._fademode /*int*/ ==__ref._fade_none /*int*/  && _nextvolume<=0) { 
RDebugUtils.currentLine=31588374;
 //BA.debugLineNum = 31588374;BA.debugLine="StopImmediately";
__ref._stopimmediately /*String*/ (null);
 };
RDebugUtils.currentLine=31588376;
 //BA.debugLineNum = 31588376;BA.debugLine="End Sub";
return "";
}
public String  _setplayervolume(b4j.example.audioplayer __ref,double _volumevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "setplayervolume", false))
	 {return ((String) Debug.delegate(ba, "setplayervolume", new Object[] {_volumevalue}));}
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Private Sub SetPlayerVolume(volumeValue As Double)";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="currentVolume = Max(0, Min(1, volumeValue))";
__ref._currentvolume /*double*/  = __c.Max(0,__c.Min(1,_volumevalue));
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=31719427;
 //BA.debugLineNum = 31719427;BA.debugLine="Try";
try {RDebugUtils.currentLine=31719428;
 //BA.debugLineNum = 31719428;BA.debugLine="player.Volume = currentVolume";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(__ref._currentvolume /*double*/ );
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=31719430;
 //BA.debugLineNum = 31719430;BA.debugLine="TraceInternalError(\"set_volume\")";
__ref._traceinternalerror /*String*/ (null,"set_volume");
 };
RDebugUtils.currentLine=31719432;
 //BA.debugLineNum = 31719432;BA.debugLine="End Sub";
return "";
}
public String  _stopimmediately(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "stopimmediately", false))
	 {return ((String) Debug.delegate(ba, "stopimmediately", null));}
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Private Sub StopImmediately";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=31784963;
 //BA.debugLineNum = 31784963;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=31784964;
 //BA.debugLineNum = 31784964;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=31784965;
 //BA.debugLineNum = 31784965;BA.debugLine="TraceAudio(\"StopImmediately\")";
__ref._traceaudio /*String*/ (null,"StopImmediately");
RDebugUtils.currentLine=31784966;
 //BA.debugLineNum = 31784966;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=31784967;
 //BA.debugLineNum = 31784967;BA.debugLine="Try";
try {RDebugUtils.currentLine=31784968;
 //BA.debugLineNum = 31784968;BA.debugLine="player.Volume = 0";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(0);
RDebugUtils.currentLine=31784969;
 //BA.debugLineNum = 31784969;BA.debugLine="player.Stop";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Stop();
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=31784971;
 //BA.debugLineNum = 31784971;BA.debugLine="TraceInternalError(\"stop_immediately\")";
__ref._traceinternalerror /*String*/ (null,"stop_immediately");
 };
RDebugUtils.currentLine=31784973;
 //BA.debugLineNum = 31784973;BA.debugLine="End Sub";
return "";
}
public String  _resolveaudiokey(b4j.example.audioplayer __ref,String _namevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "resolveaudiokey", false))
	 {return ((String) Debug.delegate(ba, "resolveaudiokey", new Object[] {_namevalue}));}
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Private Sub ResolveAudioKey(nameValue As String) A";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="If nameValue.ToLowerCase.Contains(\"secondary\") Th";
if (_namevalue.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).contains("secondary")) { 
if (true) return "secondary";};
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="Return \"primary\"";
if (true) return "primary";
RDebugUtils.currentLine=32047107;
 //BA.debugLineNum = 32047107;BA.debugLine="End Sub";
return "";
}
public boolean  _isloading(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isloading", false))
	 {return ((Boolean) Debug.delegate(ba, "isloading", null));}
RDebugUtils.currentLine=30801920;
 //BA.debugLineNum = 30801920;BA.debugLine="Public Sub IsLoading As Boolean";
RDebugUtils.currentLine=30801921;
 //BA.debugLineNum = 30801921;BA.debugLine="Return playerState = STATE_LOADING";
if (true) return __ref._playerstate /*int*/ ==__ref._state_loading /*int*/ ;
RDebugUtils.currentLine=30801922;
 //BA.debugLineNum = 30801922;BA.debugLine="End Sub";
return false;
}
public boolean  _isready(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isready", false))
	 {return ((Boolean) Debug.delegate(ba, "isready", null));}
RDebugUtils.currentLine=30867456;
 //BA.debugLineNum = 30867456;BA.debugLine="Public Sub IsReady As Boolean";
RDebugUtils.currentLine=30867457;
 //BA.debugLineNum = 30867457;BA.debugLine="Return playerState = STATE_READY";
if (true) return __ref._playerstate /*int*/ ==__ref._state_ready /*int*/ ;
RDebugUtils.currentLine=30867458;
 //BA.debugLineNum = 30867458;BA.debugLine="End Sub";
return false;
}
public boolean  _isstopped(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isstopped", false))
	 {return ((Boolean) Debug.delegate(ba, "isstopped", null));}
RDebugUtils.currentLine=30736384;
 //BA.debugLineNum = 30736384;BA.debugLine="Public Sub IsStopped As Boolean";
RDebugUtils.currentLine=30736385;
 //BA.debugLineNum = 30736385;BA.debugLine="Return playerState = STATE_STOPPED";
if (true) return __ref._playerstate /*int*/ ==__ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=30736386;
 //BA.debugLineNum = 30736386;BA.debugLine="End Sub";
return false;
}
public String  _loadtimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "loadtimer_tick", false))
	 {return ((String) Debug.delegate(ba, "loadtimer_tick", null));}
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Private Sub LoadTimer_Tick";
RDebugUtils.currentLine=31522817;
 //BA.debugLineNum = 31522817;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="TraceAudio(\"Load timeout\")";
__ref._traceaudio /*String*/ (null,"Load timeout");
RDebugUtils.currentLine=31522819;
 //BA.debugLineNum = 31522819;BA.debugLine="NotifyError(\"Track loading timeout expired\")";
__ref._notifyerror /*String*/ (null,"Track loading timeout expired");
RDebugUtils.currentLine=31522820;
 //BA.debugLineNum = 31522820;BA.debugLine="End Sub";
return "";
}
public String  _play(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "play", false))
	 {return ((String) Debug.delegate(ba, "play", null));}
RDebugUtils.currentLine=30474240;
 //BA.debugLineNum = 30474240;BA.debugLine="Public Sub Play";
RDebugUtils.currentLine=30474241;
 //BA.debugLineNum = 30474241;BA.debugLine="PlayWithFade(0)";
__ref._playwithfade /*String*/ (null,(int) (0));
RDebugUtils.currentLine=30474242;
 //BA.debugLineNum = 30474242;BA.debugLine="End Sub";
return "";
}
public String  _player_complete(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "player_complete", false))
	 {return ((String) Debug.delegate(ba, "player_complete", null));}
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Private Sub Player_Complete";
RDebugUtils.currentLine=31260673;
 //BA.debugLineNum = 31260673;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (__ref._activeeventloadtoken /*long*/ !=__ref._currentloadtoken /*long*/ ) { 
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="TraceAudio(\"Complete ignored. stale_token=\" & ac";
__ref._traceaudio /*String*/ (null,"Complete ignored. stale_token="+BA.NumberToString(__ref._activeeventloadtoken /*long*/ )+" current="+BA.NumberToString(__ref._currentloadtoken /*long*/ ));
RDebugUtils.currentLine=31260675;
 //BA.debugLineNum = 31260675;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=31260677;
 //BA.debugLineNum = 31260677;BA.debugLine="If playerState = STATE_STOPPED Then Return";
if (__ref._playerstate /*int*/ ==__ref._state_stopped /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=31260678;
 //BA.debugLineNum = 31260678;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=31260679;
 //BA.debugLineNum = 31260679;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=31260680;
 //BA.debugLineNum = 31260680;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=31260681;
 //BA.debugLineNum = 31260681;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=31260682;
 //BA.debugLineNum = 31260682;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=31260683;
 //BA.debugLineNum = 31260683;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=31260684;
 //BA.debugLineNum = 31260684;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=31260685;
 //BA.debugLineNum = 31260685;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=31260686;
 //BA.debugLineNum = 31260686;BA.debugLine="TraceAudio(\"Complete\")";
__ref._traceaudio /*String*/ (null,"Complete");
RDebugUtils.currentLine=31260687;
 //BA.debugLineNum = 31260687;BA.debugLine="targetPage.AudioPlayer_Complete(audioKey)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._audioplayer_complete /*String*/ (null,__ref._audiokey /*String*/ );
RDebugUtils.currentLine=31260688;
 //BA.debugLineNum = 31260688;BA.debugLine="End Sub";
return "";
}
public String  _traceinternalerror(b4j.example.audioplayer __ref,String _context) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "traceinternalerror", false))
	 {return ((String) Debug.delegate(ba, "traceinternalerror", new Object[] {_context}));}
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Private Sub TraceInternalError(context As String)";
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="targetPage.TraceLog(\"ошибка аудио internal contex";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._tracelog /*String*/ (null,"ошибка аудио internal context="+_context+" message="+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="End Sub";
return "";
}
public String  _startfade(b4j.example.audioplayer __ref,int _mode,double _targetvolume,int _fadetimems) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "startfade", false))
	 {return ((String) Debug.delegate(ba, "startfade", new Object[] {_mode,_targetvolume,_fadetimems}));}
int _intervalms = 0;
int _steps = 0;
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Private Sub StartFade(mode As Int, targetVolume As";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=31653891;
 //BA.debugLineNum = 31653891;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=31653892;
 //BA.debugLineNum = 31653892;BA.debugLine="If fadeTimeMs <= 0 Then";
if (_fadetimems<=0) { 
RDebugUtils.currentLine=31653893;
 //BA.debugLineNum = 31653893;BA.debugLine="SetPlayerVolume(targetVolume)";
__ref._setplayervolume /*String*/ (null,_targetvolume);
RDebugUtils.currentLine=31653894;
 //BA.debugLineNum = 31653894;BA.debugLine="If targetVolume <= 0 Then StopImmediately";
if (_targetvolume<=0) { 
__ref._stopimmediately /*String*/ (null);};
RDebugUtils.currentLine=31653895;
 //BA.debugLineNum = 31653895;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=31653897;
 //BA.debugLineNum = 31653897;BA.debugLine="Dim intervalMs As Int = Max(20, fadeTimer.Interva";
_intervalms = (int) (__c.Max(20,__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .getInterval()));
RDebugUtils.currentLine=31653898;
 //BA.debugLineNum = 31653898;BA.debugLine="Dim steps As Int = Max(1, Ceil(fadeTimeMs / inter";
_steps = (int) (__c.Max(1,__c.Ceil(_fadetimems/(double)_intervalms)));
RDebugUtils.currentLine=31653899;
 //BA.debugLineNum = 31653899;BA.debugLine="fadeMode = mode";
__ref._fademode /*int*/  = _mode;
RDebugUtils.currentLine=31653900;
 //BA.debugLineNum = 31653900;BA.debugLine="fadeTargetVolume = targetVolume";
__ref._fadetargetvolume /*double*/  = _targetvolume;
RDebugUtils.currentLine=31653901;
 //BA.debugLineNum = 31653901;BA.debugLine="fadeStepVolume = (targetVolume - currentVolume) /";
__ref._fadestepvolume /*double*/  = (_targetvolume-__ref._currentvolume /*double*/ )/(double)_steps;
RDebugUtils.currentLine=31653902;
 //BA.debugLineNum = 31653902;BA.debugLine="fadeTimer.Enabled = True";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=31653903;
 //BA.debugLineNum = 31653903;BA.debugLine="End Sub";
return "";
}
public String  _ready_event(b4j.example.audioplayer __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "ready_event", false))
	 {return ((String) Debug.delegate(ba, "ready_event", new Object[] {_methodname,_args}));}
RDebugUtils.currentLine=31129600;
 //BA.debugLineNum = 31129600;BA.debugLine="Private Sub Ready_Event(methodName As String, args";
RDebugUtils.currentLine=31129601;
 //BA.debugLineNum = 31129601;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (__ref._activeeventloadtoken /*long*/ !=__ref._currentloadtoken /*long*/ ) { 
RDebugUtils.currentLine=31129602;
 //BA.debugLineNum = 31129602;BA.debugLine="TraceAudio(\"Ready ignored. stale_token=\" & activ";
__ref._traceaudio /*String*/ (null,"Ready ignored. stale_token="+BA.NumberToString(__ref._activeeventloadtoken /*long*/ )+" current="+BA.NumberToString(__ref._currentloadtoken /*long*/ ));
RDebugUtils.currentLine=31129603;
 //BA.debugLineNum = 31129603;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=31129605;
 //BA.debugLineNum = 31129605;BA.debugLine="playerState = STATE_READY";
__ref._playerstate /*int*/  = __ref._state_ready /*int*/ ;
RDebugUtils.currentLine=31129606;
 //BA.debugLineNum = 31129606;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=31129607;
 //BA.debugLineNum = 31129607;BA.debugLine="TraceAudio(\"Ready\")";
__ref._traceaudio /*String*/ (null,"Ready");
RDebugUtils.currentLine=31129608;
 //BA.debugLineNum = 31129608;BA.debugLine="targetPage.AudioPlayer_Ready(audioKey)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._audioplayer_ready /*String*/ (null,__ref._audiokey /*String*/ );
RDebugUtils.currentLine=31129609;
 //BA.debugLineNum = 31129609;BA.debugLine="End Sub";
return "";
}
public String  _timeupdatetimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "timeupdatetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "timeupdatetimer_tick", null));}
RDebugUtils.currentLine=31391744;
 //BA.debugLineNum = 31391744;BA.debugLine="Private Sub TimeUpdateTimer_Tick";
RDebugUtils.currentLine=31391745;
 //BA.debugLineNum = 31391745;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
if (__ref._playerstate /*int*/ !=__ref._state_playing /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (__ref._activeeventloadtoken /*long*/ !=__ref._currentloadtoken /*long*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=31391747;
 //BA.debugLineNum = 31391747;BA.debugLine="targetPage.AudioPlayer_Timeupdate(audioKey)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._audioplayer_timeupdate /*String*/ (null,__ref._audiokey /*String*/ );
RDebugUtils.currentLine=31391748;
 //BA.debugLineNum = 31391748;BA.debugLine="End Sub";
return "";
}
}