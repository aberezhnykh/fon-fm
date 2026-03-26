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
public b4j.example.platformbridge _platformbridge = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _checktimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "checktimer_tick", false))
	 {return ((String) Debug.delegate(ba, "checktimer_tick", null));}
long _positionnow = 0L;
long _durationnow = 0L;
long _remainms = 0L;
RDebugUtils.currentLine=30605312;
 //BA.debugLineNum = 30605312;BA.debugLine="Private Sub CheckTimer_Tick";
RDebugUtils.currentLine=30605313;
 //BA.debugLineNum = 30605313;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
if (__ref._playerstate /*int*/ !=__ref._state_playing /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=30605314;
 //BA.debugLineNum = 30605314;BA.debugLine="Dim positionNow As Long = Position";
_positionnow = __ref._position /*long*/ (null);
RDebugUtils.currentLine=30605315;
 //BA.debugLineNum = 30605315;BA.debugLine="If positionNow > lastPosition Then";
if (_positionnow>__ref._lastposition /*long*/ ) { 
RDebugUtils.currentLine=30605316;
 //BA.debugLineNum = 30605316;BA.debugLine="lastPosition = positionNow";
__ref._lastposition /*long*/  = _positionnow;
RDebugUtils.currentLine=30605317;
 //BA.debugLineNum = 30605317;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=30605318;
 //BA.debugLineNum = 30605318;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=30605320;
 //BA.debugLineNum = 30605320;BA.debugLine="Dim durationNow As Long = Duration";
_durationnow = __ref._duration /*long*/ (null);
RDebugUtils.currentLine=30605321;
 //BA.debugLineNum = 30605321;BA.debugLine="Dim remainMs As Long = -1";
_remainms = (long) (-1);
RDebugUtils.currentLine=30605322;
 //BA.debugLineNum = 30605322;BA.debugLine="If durationNow > 0 Then remainMs = Max(0, duratio";
if (_durationnow>0) { 
_remainms = (long) (__c.Max(0,_durationnow-_positionnow));};
RDebugUtils.currentLine=30605323;
 //BA.debugLineNum = 30605323;BA.debugLine="If durationNow > 0 And positionNow >= Max(0, dura";
if (_durationnow>0 && _positionnow>=__c.Max(0,_durationnow-2000)) { 
RDebugUtils.currentLine=30605324;
 //BA.debugLineNum = 30605324;BA.debugLine="TraceDiagnostic(\"хвост audio=\" & eventName & \" p";
__ref._tracediagnostic /*String*/ (null,"хвост audio="+__ref._eventname /*String*/ +" positionMs="+BA.NumberToString(_positionnow)+" durationMs="+BA.NumberToString(_durationnow)+" remainMs="+BA.NumberToString(_remainms)+" stalled="+BA.NumberToString(__ref._stalledcheckcount /*int*/ ));
RDebugUtils.currentLine=30605325;
 //BA.debugLineNum = 30605325;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=30605327;
 //BA.debugLineNum = 30605327;BA.debugLine="stalledCheckCount = stalledCheckCount + 1";
__ref._stalledcheckcount /*int*/  = (int) (__ref._stalledcheckcount /*int*/ +1);
RDebugUtils.currentLine=30605328;
 //BA.debugLineNum = 30605328;BA.debugLine="If stalledCheckCount = 1 Or stalledCheckCount = 3";
if (__ref._stalledcheckcount /*int*/ ==1 || __ref._stalledcheckcount /*int*/ ==3) { 
RDebugUtils.currentLine=30605329;
 //BA.debugLineNum = 30605329;BA.debugLine="TraceDiagnostic(\"задержка audio=\" & eventName &";
__ref._tracediagnostic /*String*/ (null,"задержка audio="+__ref._eventname /*String*/ +" positionMs="+BA.NumberToString(_positionnow)+" durationMs="+BA.NumberToString(_durationnow)+" remainMs="+BA.NumberToString(_remainms)+" stalled="+BA.NumberToString(__ref._stalledcheckcount /*int*/ ));
 };
RDebugUtils.currentLine=30605331;
 //BA.debugLineNum = 30605331;BA.debugLine="If stalledCheckCount < SILENCE_STALL_THRESHOLD Th";
if (__ref._stalledcheckcount /*int*/ <__ref._silence_stall_threshold /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=30605332;
 //BA.debugLineNum = 30605332;BA.debugLine="NotifyError(\"Silence detected \" & SILENCE_STALL_T";
__ref._notifyerror /*String*/ (null,"Silence detected "+BA.NumberToString(__ref._silence_stall_threshold /*int*/ ));
RDebugUtils.currentLine=30605333;
 //BA.debugLineNum = 30605333;BA.debugLine="End Sub";
return "";
}
public long  _position(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "position", false))
	 {return ((Long) Debug.delegate(ba, "position", null));}
RDebugUtils.currentLine=30146560;
 //BA.debugLineNum = 30146560;BA.debugLine="Public Sub Position As Long";
RDebugUtils.currentLine=30146561;
 //BA.debugLineNum = 30146561;BA.debugLine="If player.IsInitialized = False Then Return 0";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=30146562;
 //BA.debugLineNum = 30146562;BA.debugLine="Try";
try {RDebugUtils.currentLine=30146563;
 //BA.debugLineNum = 30146563;BA.debugLine="Return player.Position";
if (true) return (long) (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getPosition());
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=30146565;
 //BA.debugLineNum = 30146565;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=30146567;
 //BA.debugLineNum = 30146567;BA.debugLine="End Sub";
return 0L;
}
public long  _duration(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "duration", false))
	 {return ((Long) Debug.delegate(ba, "duration", null));}
RDebugUtils.currentLine=30212096;
 //BA.debugLineNum = 30212096;BA.debugLine="Public Sub Duration As Long";
RDebugUtils.currentLine=30212097;
 //BA.debugLineNum = 30212097;BA.debugLine="If player.IsInitialized = False Then Return 0";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=30212098;
 //BA.debugLineNum = 30212098;BA.debugLine="Try";
try {RDebugUtils.currentLine=30212099;
 //BA.debugLineNum = 30212099;BA.debugLine="Return player.Duration";
if (true) return (long) (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getDuration());
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=30212101;
 //BA.debugLineNum = 30212101;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=30212103;
 //BA.debugLineNum = 30212103;BA.debugLine="End Sub";
return 0L;
}
public String  _tracediagnostic(b4j.example.audioplayer __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "tracediagnostic", false))
	 {return ((String) Debug.delegate(ba, "tracediagnostic", new Object[] {_message}));}
RDebugUtils.currentLine=31129600;
 //BA.debugLineNum = 31129600;BA.debugLine="Private Sub TraceDiagnostic(message As String)";
RDebugUtils.currentLine=31129601;
 //BA.debugLineNum = 31129601;BA.debugLine="targetPage.TraceLog(message)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._tracelog /*String*/ (null,_message);
RDebugUtils.currentLine=31129602;
 //BA.debugLineNum = 31129602;BA.debugLine="End Sub";
return "";
}
public String  _notifyerror(b4j.example.audioplayer __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "notifyerror", false))
	 {return ((String) Debug.delegate(ba, "notifyerror", new Object[] {_message}));}
RDebugUtils.currentLine=30474240;
 //BA.debugLineNum = 30474240;BA.debugLine="Private Sub NotifyError(message As String)";
RDebugUtils.currentLine=30474241;
 //BA.debugLineNum = 30474241;BA.debugLine="TraceAudio(\"NotifyError. message=\" & message)";
__ref._traceaudio /*String*/ (null,"NotifyError. message="+_message);
RDebugUtils.currentLine=30474242;
 //BA.debugLineNum = 30474242;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=30474243;
 //BA.debugLineNum = 30474243;BA.debugLine="targetPage.AudioPlayer_Error(audioKey, message)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._audioplayer_error /*String*/ (null,__ref._audiokey /*String*/ ,_message);
RDebugUtils.currentLine=30474244;
 //BA.debugLineNum = 30474244;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
RDebugUtils.currentLine=29425664;
 //BA.debugLineNum = 29425664;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=29425665;
 //BA.debugLineNum = 29425665;BA.debugLine="Private Const STATE_STOPPED = 0, STATE_LOADING =";
_state_stopped = (int) (0);
_state_loading = (int) (1);
_state_ready = (int) (2);
_state_playing = (int) (3);
RDebugUtils.currentLine=29425666;
 //BA.debugLineNum = 29425666;BA.debugLine="Private Const FADE_NONE = 0, FADE_IN = 1, FADE_OU";
_fade_none = (int) (0);
_fade_in = (int) (1);
_fade_out = (int) (2);
RDebugUtils.currentLine=29425667;
 //BA.debugLineNum = 29425667;BA.debugLine="Private Const CHECK_TIMER_INTERVAL_MS As Int = 20";
_check_timer_interval_ms = (int) (2000);
RDebugUtils.currentLine=29425668;
 //BA.debugLineNum = 29425668;BA.debugLine="Private Const SILENCE_STALL_THRESHOLD As Int = 3";
_silence_stall_threshold = (int) (3);
RDebugUtils.currentLine=29425670;
 //BA.debugLineNum = 29425670;BA.debugLine="Private player As MediaPlayer";
_player = new anywheresoftware.b4j.objects.MediaPlayerWrapper();
RDebugUtils.currentLine=29425671;
 //BA.debugLineNum = 29425671;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=29425672;
 //BA.debugLineNum = 29425672;BA.debugLine="Private eventName As String";
_eventname = "";
RDebugUtils.currentLine=29425673;
 //BA.debugLineNum = 29425673;BA.debugLine="Private targetPage As B4XMainPage";
_targetpage = new b4j.example.b4xmainpage();
RDebugUtils.currentLine=29425674;
 //BA.debugLineNum = 29425674;BA.debugLine="Private timeUpdateTimer As Timer";
_timeupdatetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=29425675;
 //BA.debugLineNum = 29425675;BA.debugLine="Private lastPosition As Long";
_lastposition = 0L;
RDebugUtils.currentLine=29425676;
 //BA.debugLineNum = 29425676;BA.debugLine="Private checkTimer As Timer";
_checktimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=29425677;
 //BA.debugLineNum = 29425677;BA.debugLine="Private loadTimer As Timer";
_loadtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=29425678;
 //BA.debugLineNum = 29425678;BA.debugLine="Private fadeTimer As Timer";
_fadetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=29425679;
 //BA.debugLineNum = 29425679;BA.debugLine="Private playerState As Int";
_playerstate = 0;
RDebugUtils.currentLine=29425680;
 //BA.debugLineNum = 29425680;BA.debugLine="Private maxVolume As Double";
_maxvolume = 0;
RDebugUtils.currentLine=29425681;
 //BA.debugLineNum = 29425681;BA.debugLine="Private fadeMode As Int";
_fademode = 0;
RDebugUtils.currentLine=29425682;
 //BA.debugLineNum = 29425682;BA.debugLine="Private fadeTargetVolume As Double";
_fadetargetvolume = 0;
RDebugUtils.currentLine=29425683;
 //BA.debugLineNum = 29425683;BA.debugLine="Private fadeStepVolume As Double";
_fadestepvolume = 0;
RDebugUtils.currentLine=29425684;
 //BA.debugLineNum = 29425684;BA.debugLine="Private currentVolume As Double";
_currentvolume = 0;
RDebugUtils.currentLine=29425685;
 //BA.debugLineNum = 29425685;BA.debugLine="Private stalledCheckCount As Int";
_stalledcheckcount = 0;
RDebugUtils.currentLine=29425686;
 //BA.debugLineNum = 29425686;BA.debugLine="Private currentLoadToken As Long";
_currentloadtoken = 0L;
RDebugUtils.currentLine=29425687;
 //BA.debugLineNum = 29425687;BA.debugLine="Private activeEventLoadToken As Long";
_activeeventloadtoken = 0L;
RDebugUtils.currentLine=29425688;
 //BA.debugLineNum = 29425688;BA.debugLine="Private audioKey As String";
_audiokey = "";
RDebugUtils.currentLine=29425689;
 //BA.debugLineNum = 29425689;BA.debugLine="End Sub";
return "";
}
public String  _error_event(b4j.example.audioplayer __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "error_event", false))
	 {return ((String) Debug.delegate(ba, "error_event", new Object[] {_methodname,_args}));}
String _msg = "";
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Private Sub Error_Event(methodName As String, args";
RDebugUtils.currentLine=30343169;
 //BA.debugLineNum = 30343169;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (__ref._activeeventloadtoken /*long*/ !=__ref._currentloadtoken /*long*/ ) { 
RDebugUtils.currentLine=30343170;
 //BA.debugLineNum = 30343170;BA.debugLine="TraceAudio(\"Error ignored. stale_token=\" & activ";
__ref._traceaudio /*String*/ (null,"Error ignored. stale_token="+BA.NumberToString(__ref._activeeventloadtoken /*long*/ )+" current="+BA.NumberToString(__ref._currentloadtoken /*long*/ ));
RDebugUtils.currentLine=30343171;
 //BA.debugLineNum = 30343171;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=30343173;
 //BA.debugLineNum = 30343173;BA.debugLine="Dim msg As String = \"\"";
_msg = "";
RDebugUtils.currentLine=30343174;
 //BA.debugLineNum = 30343174;BA.debugLine="Try";
try {RDebugUtils.currentLine=30343175;
 //BA.debugLineNum = 30343175;BA.debugLine="msg = jo.RunMethod(\"getError\", Null)";
_msg = BA.ObjectToString(__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getError",(Object[])(__c.Null)));
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=30343177;
 //BA.debugLineNum = 30343177;BA.debugLine="msg = LastException.Message";
_msg = __c.LastException(ba).getMessage();
 };
RDebugUtils.currentLine=30343179;
 //BA.debugLineNum = 30343179;BA.debugLine="TraceAudio(\"Error_Event. message=\" & msg)";
__ref._traceaudio /*String*/ (null,"Error_Event. message="+_msg);
RDebugUtils.currentLine=30343180;
 //BA.debugLineNum = 30343180;BA.debugLine="NotifyError(msg)";
__ref._notifyerror /*String*/ (null,_msg);
RDebugUtils.currentLine=30343181;
 //BA.debugLineNum = 30343181;BA.debugLine="End Sub";
return "";
}
public String  _traceaudio(b4j.example.audioplayer __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "traceaudio", false))
	 {return ((String) Debug.delegate(ba, "traceaudio", new Object[] {_message}));}
RDebugUtils.currentLine=31195136;
 //BA.debugLineNum = 31195136;BA.debugLine="Private Sub TraceAudio(message As String)";
RDebugUtils.currentLine=31195137;
 //BA.debugLineNum = 31195137;BA.debugLine="targetPage.TraceLog(\"[\" & eventName & \"] \" & mess";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._tracelog /*String*/ (null,"["+__ref._eventname /*String*/ +"] "+_message);
RDebugUtils.currentLine=31195138;
 //BA.debugLineNum = 31195138;BA.debugLine="End Sub";
return "";
}
public String  _fadetimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "fadetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "fadetimer_tick", null));}
double _nextvolume = 0;
RDebugUtils.currentLine=30736384;
 //BA.debugLineNum = 30736384;BA.debugLine="Private Sub FadeTimer_Tick";
RDebugUtils.currentLine=30736385;
 //BA.debugLineNum = 30736385;BA.debugLine="If player.IsInitialized = False Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=30736386;
 //BA.debugLineNum = 30736386;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30736387;
 //BA.debugLineNum = 30736387;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=30736388;
 //BA.debugLineNum = 30736388;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=30736390;
 //BA.debugLineNum = 30736390;BA.debugLine="Dim nextVolume As Double = currentVolume + fadeSt";
_nextvolume = __ref._currentvolume /*double*/ +__ref._fadestepvolume /*double*/ ;
RDebugUtils.currentLine=30736391;
 //BA.debugLineNum = 30736391;BA.debugLine="If fadeMode = FADE_IN Then";
if (__ref._fademode /*int*/ ==__ref._fade_in /*int*/ ) { 
RDebugUtils.currentLine=30736392;
 //BA.debugLineNum = 30736392;BA.debugLine="If nextVolume >= fadeTargetVolume Then";
if (_nextvolume>=__ref._fadetargetvolume /*double*/ ) { 
RDebugUtils.currentLine=30736393;
 //BA.debugLineNum = 30736393;BA.debugLine="nextVolume = fadeTargetVolume";
_nextvolume = __ref._fadetargetvolume /*double*/ ;
RDebugUtils.currentLine=30736394;
 //BA.debugLineNum = 30736394;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30736395;
 //BA.debugLineNum = 30736395;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
 };
 }else 
{RDebugUtils.currentLine=30736397;
 //BA.debugLineNum = 30736397;BA.debugLine="Else If fadeMode = FADE_OUT Then";
if (__ref._fademode /*int*/ ==__ref._fade_out /*int*/ ) { 
RDebugUtils.currentLine=30736398;
 //BA.debugLineNum = 30736398;BA.debugLine="If nextVolume <= fadeTargetVolume Then";
if (_nextvolume<=__ref._fadetargetvolume /*double*/ ) { 
RDebugUtils.currentLine=30736399;
 //BA.debugLineNum = 30736399;BA.debugLine="nextVolume = fadeTargetVolume";
_nextvolume = __ref._fadetargetvolume /*double*/ ;
RDebugUtils.currentLine=30736400;
 //BA.debugLineNum = 30736400;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30736401;
 //BA.debugLineNum = 30736401;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
 };
 }}
;
RDebugUtils.currentLine=30736404;
 //BA.debugLineNum = 30736404;BA.debugLine="SetPlayerVolume(nextVolume)";
__ref._setplayervolume /*String*/ (null,_nextvolume);
RDebugUtils.currentLine=30736405;
 //BA.debugLineNum = 30736405;BA.debugLine="If fadeMode = FADE_NONE And nextVolume <= 0 Then";
if (__ref._fademode /*int*/ ==__ref._fade_none /*int*/  && _nextvolume<=0) { 
RDebugUtils.currentLine=30736406;
 //BA.debugLineNum = 30736406;BA.debugLine="StopImmediately";
__ref._stopimmediately /*String*/ (null);
 };
RDebugUtils.currentLine=30736408;
 //BA.debugLineNum = 30736408;BA.debugLine="End Sub";
return "";
}
public String  _setplayervolume(b4j.example.audioplayer __ref,double _volumevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "setplayervolume", false))
	 {return ((String) Debug.delegate(ba, "setplayervolume", new Object[] {_volumevalue}));}
RDebugUtils.currentLine=30867456;
 //BA.debugLineNum = 30867456;BA.debugLine="Private Sub SetPlayerVolume(volumeValue As Double)";
RDebugUtils.currentLine=30867457;
 //BA.debugLineNum = 30867457;BA.debugLine="currentVolume = Max(0, Min(1, volumeValue))";
__ref._currentvolume /*double*/  = __c.Max(0,__c.Min(1,_volumevalue));
RDebugUtils.currentLine=30867458;
 //BA.debugLineNum = 30867458;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=30867459;
 //BA.debugLineNum = 30867459;BA.debugLine="Try";
try {RDebugUtils.currentLine=30867460;
 //BA.debugLineNum = 30867460;BA.debugLine="player.Volume = currentVolume";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(__ref._currentvolume /*double*/ );
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=30867462;
 //BA.debugLineNum = 30867462;BA.debugLine="TraceInternalError(\"set_volume\")";
__ref._traceinternalerror /*String*/ (null,"set_volume");
 };
RDebugUtils.currentLine=30867464;
 //BA.debugLineNum = 30867464;BA.debugLine="End Sub";
return "";
}
public String  _stopimmediately(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "stopimmediately", false))
	 {return ((String) Debug.delegate(ba, "stopimmediately", null));}
long _startedat = 0L;
RDebugUtils.currentLine=30932992;
 //BA.debugLineNum = 30932992;BA.debugLine="Private Sub StopImmediately";
RDebugUtils.currentLine=30932993;
 //BA.debugLineNum = 30932993;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = __c.DateTime.getNow();
RDebugUtils.currentLine=30932994;
 //BA.debugLineNum = 30932994;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30932995;
 //BA.debugLineNum = 30932995;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=30932996;
 //BA.debugLineNum = 30932996;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=30932997;
 //BA.debugLineNum = 30932997;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=30932998;
 //BA.debugLineNum = 30932998;BA.debugLine="TraceAudio(\"StopImmediately\")";
__ref._traceaudio /*String*/ (null,"StopImmediately");
RDebugUtils.currentLine=30932999;
 //BA.debugLineNum = 30932999;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=30933000;
 //BA.debugLineNum = 30933000;BA.debugLine="Try";
try {RDebugUtils.currentLine=30933001;
 //BA.debugLineNum = 30933001;BA.debugLine="player.Volume = 0";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(0);
RDebugUtils.currentLine=30933002;
 //BA.debugLineNum = 30933002;BA.debugLine="player.Stop";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Stop();
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=30933004;
 //BA.debugLineNum = 30933004;BA.debugLine="TraceInternalError(\"stop_immediately\")";
__ref._traceinternalerror /*String*/ (null,"stop_immediately");
 };
RDebugUtils.currentLine=30933006;
 //BA.debugLineNum = 30933006;BA.debugLine="LogSlowOperation(\"StopImmediately\", startedAt)";
__ref._logslowoperation /*String*/ (null,"StopImmediately",_startedat);
RDebugUtils.currentLine=30933007;
 //BA.debugLineNum = 30933007;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.audioplayer __ref,anywheresoftware.b4a.BA _ba,String _eventnamevalue,b4j.example.b4xmainpage _targetpagevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_eventnamevalue,_targetpagevalue}));}
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Public Sub Initialize (eventNameValue As String, t";
RDebugUtils.currentLine=29491201;
 //BA.debugLineNum = 29491201;BA.debugLine="eventName = eventNameValue";
__ref._eventname /*String*/  = _eventnamevalue;
RDebugUtils.currentLine=29491202;
 //BA.debugLineNum = 29491202;BA.debugLine="targetPage = targetPageValue";
__ref._targetpage /*b4j.example.b4xmainpage*/  = _targetpagevalue;
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="audioKey = ResolveAudioKey(eventName)";
__ref._audiokey /*String*/  = __ref._resolveaudiokey /*String*/ (null,__ref._eventname /*String*/ );
RDebugUtils.currentLine=29491204;
 //BA.debugLineNum = 29491204;BA.debugLine="loadTimer.Initialize(\"LoadTimer\", 10 * DateTime.T";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"LoadTimer",(long) (10*__c.DateTime.TicksPerSecond));
RDebugUtils.currentLine=29491205;
 //BA.debugLineNum = 29491205;BA.debugLine="checkTimer.Initialize(\"CheckTimer\", CHECK_TIMER_I";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"CheckTimer",(long) (__ref._check_timer_interval_ms /*int*/ ));
RDebugUtils.currentLine=29491206;
 //BA.debugLineNum = 29491206;BA.debugLine="timeUpdateTimer.Initialize(\"TimeUpdateTimer\", 250";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"TimeUpdateTimer",(long) (250));
RDebugUtils.currentLine=29491207;
 //BA.debugLineNum = 29491207;BA.debugLine="fadeTimer.Initialize(\"FadeTimer\", 40)";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"FadeTimer",(long) (40));
RDebugUtils.currentLine=29491208;
 //BA.debugLineNum = 29491208;BA.debugLine="TraceAudio(\"Initialize\")";
__ref._traceaudio /*String*/ (null,"Initialize");
RDebugUtils.currentLine=29491209;
 //BA.debugLineNum = 29491209;BA.debugLine="End Sub";
return "";
}
public String  _resolveaudiokey(b4j.example.audioplayer __ref,String _namevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "resolveaudiokey", false))
	 {return ((String) Debug.delegate(ba, "resolveaudiokey", new Object[] {_namevalue}));}
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Private Sub ResolveAudioKey(nameValue As String) A";
RDebugUtils.currentLine=31260673;
 //BA.debugLineNum = 31260673;BA.debugLine="If nameValue.ToLowerCase.Contains(\"secondary\") Th";
if (_namevalue.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).contains("secondary")) { 
if (true) return "secondary";};
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="Return \"primary\"";
if (true) return "primary";
RDebugUtils.currentLine=31260675;
 //BA.debugLineNum = 31260675;BA.debugLine="End Sub";
return "";
}
public boolean  _isloading(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isloading", false))
	 {return ((Boolean) Debug.delegate(ba, "isloading", null));}
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Public Sub IsLoading As Boolean";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="Return playerState = STATE_LOADING";
if (true) return __ref._playerstate /*int*/ ==__ref._state_loading /*int*/ ;
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaying(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isplaying", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaying", null));}
RDebugUtils.currentLine=30081024;
 //BA.debugLineNum = 30081024;BA.debugLine="Public Sub IsPlaying As Boolean";
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="Return playerState = STATE_PLAYING";
if (true) return __ref._playerstate /*int*/ ==__ref._state_playing /*int*/ ;
RDebugUtils.currentLine=30081026;
 //BA.debugLineNum = 30081026;BA.debugLine="End Sub";
return false;
}
public boolean  _isready(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isready", false))
	 {return ((Boolean) Debug.delegate(ba, "isready", null));}
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Public Sub IsReady As Boolean";
RDebugUtils.currentLine=30015489;
 //BA.debugLineNum = 30015489;BA.debugLine="Return playerState = STATE_READY";
if (true) return __ref._playerstate /*int*/ ==__ref._state_ready /*int*/ ;
RDebugUtils.currentLine=30015490;
 //BA.debugLineNum = 30015490;BA.debugLine="End Sub";
return false;
}
public boolean  _isstopped(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isstopped", false))
	 {return ((Boolean) Debug.delegate(ba, "isstopped", null));}
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Public Sub IsStopped As Boolean";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="Return playerState = STATE_STOPPED";
if (true) return __ref._playerstate /*int*/ ==__ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=29884418;
 //BA.debugLineNum = 29884418;BA.debugLine="End Sub";
return false;
}
public String  _loadtimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "loadtimer_tick", false))
	 {return ((String) Debug.delegate(ba, "loadtimer_tick", null));}
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Private Sub LoadTimer_Tick";
RDebugUtils.currentLine=30670849;
 //BA.debugLineNum = 30670849;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="TraceAudio(\"Load timeout\")";
__ref._traceaudio /*String*/ (null,"Load timeout");
RDebugUtils.currentLine=30670851;
 //BA.debugLineNum = 30670851;BA.debugLine="NotifyError(\"Track loading timeout expired\")";
__ref._notifyerror /*String*/ (null,"Track loading timeout expired");
RDebugUtils.currentLine=30670852;
 //BA.debugLineNum = 30670852;BA.debugLine="End Sub";
return "";
}
public String  _loadurl(b4j.example.audioplayer __ref,String _url,double _volume) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "loadurl", false))
	 {return ((String) Debug.delegate(ba, "loadurl", new Object[] {_url,_volume}));}
long _startedat = 0L;
RDebugUtils.currentLine=29556736;
 //BA.debugLineNum = 29556736;BA.debugLine="Public Sub LoadUrl(url As String, volume As Double";
RDebugUtils.currentLine=29556737;
 //BA.debugLineNum = 29556737;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = __c.DateTime.getNow();
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=29556739;
 //BA.debugLineNum = 29556739;BA.debugLine="currentLoadToken = currentLoadToken + 1";
__ref._currentloadtoken /*long*/  = (long) (__ref._currentloadtoken /*long*/ +1);
RDebugUtils.currentLine=29556740;
 //BA.debugLineNum = 29556740;BA.debugLine="activeEventLoadToken = currentLoadToken";
__ref._activeeventloadtoken /*long*/  = __ref._currentloadtoken /*long*/ ;
RDebugUtils.currentLine=29556741;
 //BA.debugLineNum = 29556741;BA.debugLine="loadTimer.Interval = 10 * DateTime.TicksPerSecond";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (10*__c.DateTime.TicksPerSecond));
RDebugUtils.currentLine=29556742;
 //BA.debugLineNum = 29556742;BA.debugLine="loadTimer.Enabled = True";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=29556743;
 //BA.debugLineNum = 29556743;BA.debugLine="playerState = STATE_LOADING";
__ref._playerstate /*int*/  = __ref._state_loading /*int*/ ;
RDebugUtils.currentLine=29556744;
 //BA.debugLineNum = 29556744;BA.debugLine="maxVolume = Max(0, Min(1, volume))";
__ref._maxvolume /*double*/  = __c.Max(0,__c.Min(1,_volume));
RDebugUtils.currentLine=29556745;
 //BA.debugLineNum = 29556745;BA.debugLine="TraceAudio(\"LoadUrl. volume=\" & NumberFormat2(max";
__ref._traceaudio /*String*/ (null,"LoadUrl. volume="+__c.NumberFormat2(__ref._maxvolume /*double*/ ,(int) (1),(int) (3),(int) (3),__c.False)+", url="+_url);
RDebugUtils.currentLine=29556746;
 //BA.debugLineNum = 29556746;BA.debugLine="Try";
try {RDebugUtils.currentLine=29556747;
 //BA.debugLineNum = 29556747;BA.debugLine="player.Initialize(\"Player\", url)";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Initialize(ba,"Player",_url);
RDebugUtils.currentLine=29556748;
 //BA.debugLineNum = 29556748;BA.debugLine="jo = player";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getObject()));
RDebugUtils.currentLine=29556749;
 //BA.debugLineNum = 29556749;BA.debugLine="jo.RunMethod(\"setOnError\", Array As Object(jo.Cr";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOnError",new Object[]{__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .CreateEventFromUI(ba,"java.lang.Runnable","Error",(Object)(__c.False))});
RDebugUtils.currentLine=29556750;
 //BA.debugLineNum = 29556750;BA.debugLine="jo.RunMethod(\"setOnReady\", Array As Object(jo.Cr";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOnReady",new Object[]{__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .CreateEventFromUI(ba,"java.lang.Runnable","Ready",(Object)(__c.False))});
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=29556752;
 //BA.debugLineNum = 29556752;BA.debugLine="NotifyError(LastException.Message)";
__ref._notifyerror /*String*/ (null,__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=29556754;
 //BA.debugLineNum = 29556754;BA.debugLine="LogSlowOperation(\"LoadUrl\", startedAt)";
__ref._logslowoperation /*String*/ (null,"LoadUrl",_startedat);
RDebugUtils.currentLine=29556755;
 //BA.debugLineNum = 29556755;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
long _startedat = 0L;
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = __c.DateTime.getNow();
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=29818883;
 //BA.debugLineNum = 29818883;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=29818884;
 //BA.debugLineNum = 29818884;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=29818885;
 //BA.debugLineNum = 29818885;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=29818886;
 //BA.debugLineNum = 29818886;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=29818887;
 //BA.debugLineNum = 29818887;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=29818888;
 //BA.debugLineNum = 29818888;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=29818889;
 //BA.debugLineNum = 29818889;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=29818890;
 //BA.debugLineNum = 29818890;BA.debugLine="activeEventLoadToken = 0";
__ref._activeeventloadtoken /*long*/  = (long) (0);
RDebugUtils.currentLine=29818891;
 //BA.debugLineNum = 29818891;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=29818892;
 //BA.debugLineNum = 29818892;BA.debugLine="If player.IsInitialized Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=29818893;
 //BA.debugLineNum = 29818893;BA.debugLine="Try";
try {RDebugUtils.currentLine=29818894;
 //BA.debugLineNum = 29818894;BA.debugLine="player.Volume = 0";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(0);
RDebugUtils.currentLine=29818895;
 //BA.debugLineNum = 29818895;BA.debugLine="player.Stop";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Stop();
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=29818897;
 //BA.debugLineNum = 29818897;BA.debugLine="TraceInternalError(\"reset_stop\")";
__ref._traceinternalerror /*String*/ (null,"reset_stop");
 };
RDebugUtils.currentLine=29818899;
 //BA.debugLineNum = 29818899;BA.debugLine="If jo.IsInitialized Then";
if (__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .IsInitialized()) { 
RDebugUtils.currentLine=29818900;
 //BA.debugLineNum = 29818900;BA.debugLine="Try";
try {RDebugUtils.currentLine=29818901;
 //BA.debugLineNum = 29818901;BA.debugLine="jo.RunMethod(\"dispose\", Null)";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("dispose",(Object[])(__c.Null));
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=29818903;
 //BA.debugLineNum = 29818903;BA.debugLine="TraceInternalError(\"reset_dispose\")";
__ref._traceinternalerror /*String*/ (null,"reset_dispose");
 };
 };
 };
RDebugUtils.currentLine=29818907;
 //BA.debugLineNum = 29818907;BA.debugLine="LogSlowOperation(\"Reset\", startedAt)";
__ref._logslowoperation /*String*/ (null,"Reset",_startedat);
RDebugUtils.currentLine=29818908;
 //BA.debugLineNum = 29818908;BA.debugLine="End Sub";
return "";
}
public String  _logslowoperation(b4j.example.audioplayer __ref,String _operationname,long _startedat) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "logslowoperation", false))
	 {return ((String) Debug.delegate(ba, "logslowoperation", new Object[] {_operationname,_startedat}));}
long _elapsed = 0L;
RDebugUtils.currentLine=30998528;
 //BA.debugLineNum = 30998528;BA.debugLine="Private Sub LogSlowOperation(operationName As Stri";
RDebugUtils.currentLine=30998529;
 //BA.debugLineNum = 30998529;BA.debugLine="Dim elapsed As Long = DateTime.Now - startedAt";
_elapsed = (long) (__c.DateTime.getNow()-_startedat);
RDebugUtils.currentLine=30998530;
 //BA.debugLineNum = 30998530;BA.debugLine="If elapsed < 50 Then Return";
if (_elapsed<50) { 
if (true) return "";};
RDebugUtils.currentLine=30998531;
 //BA.debugLineNum = 30998531;BA.debugLine="TraceDiagnostic(\"audio slow op=\" & eventName & \".";
__ref._tracediagnostic /*String*/ (null,"audio slow op="+__ref._eventname /*String*/ +"."+_operationname+" elapsedMs="+BA.NumberToString(_elapsed)+" state="+BA.NumberToString(__ref._playerstate /*int*/ ));
RDebugUtils.currentLine=30998532;
 //BA.debugLineNum = 30998532;BA.debugLine="End Sub";
return "";
}
public String  _play(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "play", false))
	 {return ((String) Debug.delegate(ba, "play", null));}
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Public Sub Play";
RDebugUtils.currentLine=29622273;
 //BA.debugLineNum = 29622273;BA.debugLine="PlayWithFade(0)";
__ref._playwithfade /*String*/ (null,(int) (0));
RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="End Sub";
return "";
}
public String  _playwithfade(b4j.example.audioplayer __ref,int _fadetimems) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "playwithfade", false))
	 {return ((String) Debug.delegate(ba, "playwithfade", new Object[] {_fadetimems}));}
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Public Sub PlayWithFade(fadeTimeMs As Int)";
RDebugUtils.currentLine=29687809;
 //BA.debugLineNum = 29687809;BA.debugLine="If playerState <> STATE_READY Then";
if (__ref._playerstate /*int*/ !=__ref._state_ready /*int*/ ) { 
RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="TraceInternalError(\"play_with_fade_not_ready sta";
__ref._traceinternalerror /*String*/ (null,"play_with_fade_not_ready state="+BA.NumberToString(__ref._playerstate /*int*/ ));
RDebugUtils.currentLine=29687811;
 //BA.debugLineNum = 29687811;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=29687813;
 //BA.debugLineNum = 29687813;BA.debugLine="playerState = STATE_PLAYING";
__ref._playerstate /*int*/  = __ref._state_playing /*int*/ ;
RDebugUtils.currentLine=29687814;
 //BA.debugLineNum = 29687814;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=29687815;
 //BA.debugLineNum = 29687815;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=29687816;
 //BA.debugLineNum = 29687816;BA.debugLine="checkTimer.Enabled = True";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=29687817;
 //BA.debugLineNum = 29687817;BA.debugLine="timeUpdateTimer.Enabled = True";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=29687818;
 //BA.debugLineNum = 29687818;BA.debugLine="If fadeTimeMs > 0 Then";
if (_fadetimems>0) { 
RDebugUtils.currentLine=29687819;
 //BA.debugLineNum = 29687819;BA.debugLine="SetPlayerVolume(0)";
__ref._setplayervolume /*String*/ (null,0);
 }else {
RDebugUtils.currentLine=29687821;
 //BA.debugLineNum = 29687821;BA.debugLine="SetPlayerVolume(maxVolume)";
__ref._setplayervolume /*String*/ (null,__ref._maxvolume /*double*/ );
 };
RDebugUtils.currentLine=29687823;
 //BA.debugLineNum = 29687823;BA.debugLine="player.Play";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Play();
RDebugUtils.currentLine=29687824;
 //BA.debugLineNum = 29687824;BA.debugLine="TraceAudio(\"PlayWithFade. fadeTimeMs=\" & fadeTime";
__ref._traceaudio /*String*/ (null,"PlayWithFade. fadeTimeMs="+BA.NumberToString(_fadetimems)+", maxVolume="+__c.NumberFormat2(__ref._maxvolume /*double*/ ,(int) (1),(int) (3),(int) (3),__c.False));
RDebugUtils.currentLine=29687825;
 //BA.debugLineNum = 29687825;BA.debugLine="If fadeTimeMs > 0 Then";
if (_fadetimems>0) { 
RDebugUtils.currentLine=29687826;
 //BA.debugLineNum = 29687826;BA.debugLine="StartFade(FADE_IN, maxVolume, fadeTimeMs)";
__ref._startfade /*String*/ (null,__ref._fade_in /*int*/ ,__ref._maxvolume /*double*/ ,_fadetimems);
 };
RDebugUtils.currentLine=29687828;
 //BA.debugLineNum = 29687828;BA.debugLine="End Sub";
return "";
}
public String  _player_complete(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "player_complete", false))
	 {return ((String) Debug.delegate(ba, "player_complete", null));}
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="Private Sub Player_Complete";
RDebugUtils.currentLine=30408705;
 //BA.debugLineNum = 30408705;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (__ref._activeeventloadtoken /*long*/ !=__ref._currentloadtoken /*long*/ ) { 
RDebugUtils.currentLine=30408706;
 //BA.debugLineNum = 30408706;BA.debugLine="TraceAudio(\"Complete ignored. stale_token=\" & ac";
__ref._traceaudio /*String*/ (null,"Complete ignored. stale_token="+BA.NumberToString(__ref._activeeventloadtoken /*long*/ )+" current="+BA.NumberToString(__ref._currentloadtoken /*long*/ ));
RDebugUtils.currentLine=30408707;
 //BA.debugLineNum = 30408707;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=30408709;
 //BA.debugLineNum = 30408709;BA.debugLine="If playerState = STATE_STOPPED Then Return";
if (__ref._playerstate /*int*/ ==__ref._state_stopped /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=30408710;
 //BA.debugLineNum = 30408710;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30408711;
 //BA.debugLineNum = 30408711;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30408712;
 //BA.debugLineNum = 30408712;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30408713;
 //BA.debugLineNum = 30408713;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30408714;
 //BA.debugLineNum = 30408714;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=30408715;
 //BA.debugLineNum = 30408715;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=30408716;
 //BA.debugLineNum = 30408716;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=30408717;
 //BA.debugLineNum = 30408717;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=30408718;
 //BA.debugLineNum = 30408718;BA.debugLine="TraceAudio(\"Complete\")";
__ref._traceaudio /*String*/ (null,"Complete");
RDebugUtils.currentLine=30408719;
 //BA.debugLineNum = 30408719;BA.debugLine="targetPage.AudioPlayer_Complete(audioKey)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._audioplayer_complete /*String*/ (null,__ref._audiokey /*String*/ );
RDebugUtils.currentLine=30408720;
 //BA.debugLineNum = 30408720;BA.debugLine="End Sub";
return "";
}
public String  _traceinternalerror(b4j.example.audioplayer __ref,String _context) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "traceinternalerror", false))
	 {return ((String) Debug.delegate(ba, "traceinternalerror", new Object[] {_context}));}
RDebugUtils.currentLine=31064064;
 //BA.debugLineNum = 31064064;BA.debugLine="Private Sub TraceInternalError(context As String)";
RDebugUtils.currentLine=31064065;
 //BA.debugLineNum = 31064065;BA.debugLine="targetPage.TraceLog(\"ошибка аудио internal contex";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._tracelog /*String*/ (null,"ошибка аудио internal context="+_context+" message="+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=31064066;
 //BA.debugLineNum = 31064066;BA.debugLine="End Sub";
return "";
}
public String  _startfade(b4j.example.audioplayer __ref,int _mode,double _targetvolume,int _fadetimems) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "startfade", false))
	 {return ((String) Debug.delegate(ba, "startfade", new Object[] {_mode,_targetvolume,_fadetimems}));}
int _intervalms = 0;
int _steps = 0;
RDebugUtils.currentLine=30801920;
 //BA.debugLineNum = 30801920;BA.debugLine="Private Sub StartFade(mode As Int, targetVolume As";
RDebugUtils.currentLine=30801921;
 //BA.debugLineNum = 30801921;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30801922;
 //BA.debugLineNum = 30801922;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=30801923;
 //BA.debugLineNum = 30801923;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=30801924;
 //BA.debugLineNum = 30801924;BA.debugLine="If fadeTimeMs <= 0 Then";
if (_fadetimems<=0) { 
RDebugUtils.currentLine=30801925;
 //BA.debugLineNum = 30801925;BA.debugLine="SetPlayerVolume(targetVolume)";
__ref._setplayervolume /*String*/ (null,_targetvolume);
RDebugUtils.currentLine=30801926;
 //BA.debugLineNum = 30801926;BA.debugLine="If targetVolume <= 0 Then StopImmediately";
if (_targetvolume<=0) { 
__ref._stopimmediately /*String*/ (null);};
RDebugUtils.currentLine=30801927;
 //BA.debugLineNum = 30801927;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=30801929;
 //BA.debugLineNum = 30801929;BA.debugLine="Dim intervalMs As Int = Max(20, fadeTimer.Interva";
_intervalms = (int) (__c.Max(20,__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .getInterval()));
RDebugUtils.currentLine=30801930;
 //BA.debugLineNum = 30801930;BA.debugLine="Dim steps As Int = Max(1, Ceil(fadeTimeMs / inter";
_steps = (int) (__c.Max(1,__c.Ceil(_fadetimems/(double)_intervalms)));
RDebugUtils.currentLine=30801931;
 //BA.debugLineNum = 30801931;BA.debugLine="fadeMode = mode";
__ref._fademode /*int*/  = _mode;
RDebugUtils.currentLine=30801932;
 //BA.debugLineNum = 30801932;BA.debugLine="fadeTargetVolume = targetVolume";
__ref._fadetargetvolume /*double*/  = _targetvolume;
RDebugUtils.currentLine=30801933;
 //BA.debugLineNum = 30801933;BA.debugLine="fadeStepVolume = (targetVolume - currentVolume) /";
__ref._fadestepvolume /*double*/  = (_targetvolume-__ref._currentvolume /*double*/ )/(double)_steps;
RDebugUtils.currentLine=30801934;
 //BA.debugLineNum = 30801934;BA.debugLine="fadeTimer.Enabled = True";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=30801935;
 //BA.debugLineNum = 30801935;BA.debugLine="End Sub";
return "";
}
public String  _ready_event(b4j.example.audioplayer __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "ready_event", false))
	 {return ((String) Debug.delegate(ba, "ready_event", new Object[] {_methodname,_args}));}
RDebugUtils.currentLine=30277632;
 //BA.debugLineNum = 30277632;BA.debugLine="Private Sub Ready_Event(methodName As String, args";
RDebugUtils.currentLine=30277633;
 //BA.debugLineNum = 30277633;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (__ref._activeeventloadtoken /*long*/ !=__ref._currentloadtoken /*long*/ ) { 
RDebugUtils.currentLine=30277634;
 //BA.debugLineNum = 30277634;BA.debugLine="TraceAudio(\"Ready ignored. stale_token=\" & activ";
__ref._traceaudio /*String*/ (null,"Ready ignored. stale_token="+BA.NumberToString(__ref._activeeventloadtoken /*long*/ )+" current="+BA.NumberToString(__ref._currentloadtoken /*long*/ ));
RDebugUtils.currentLine=30277635;
 //BA.debugLineNum = 30277635;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=30277637;
 //BA.debugLineNum = 30277637;BA.debugLine="playerState = STATE_READY";
__ref._playerstate /*int*/  = __ref._state_ready /*int*/ ;
RDebugUtils.currentLine=30277638;
 //BA.debugLineNum = 30277638;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30277639;
 //BA.debugLineNum = 30277639;BA.debugLine="TraceAudio(\"Ready\")";
__ref._traceaudio /*String*/ (null,"Ready");
RDebugUtils.currentLine=30277640;
 //BA.debugLineNum = 30277640;BA.debugLine="targetPage.AudioPlayer_Ready(audioKey)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._audioplayer_ready /*String*/ (null,__ref._audiokey /*String*/ );
RDebugUtils.currentLine=30277641;
 //BA.debugLineNum = 30277641;BA.debugLine="End Sub";
return "";
}
public String  _stop(b4j.example.audioplayer __ref,int _fadetimems) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "stop", false))
	 {return ((String) Debug.delegate(ba, "stop", new Object[] {_fadetimems}));}
long _startedat = 0L;
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Public Sub Stop(fadeTimeMs As Int)";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = __c.DateTime.getNow();
RDebugUtils.currentLine=29753346;
 //BA.debugLineNum = 29753346;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=29753347;
 //BA.debugLineNum = 29753347;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=29753348;
 //BA.debugLineNum = 29753348;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=29753349;
 //BA.debugLineNum = 29753349;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=29753350;
 //BA.debugLineNum = 29753350;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=29753351;
 //BA.debugLineNum = 29753351;BA.debugLine="If player.IsInitialized = False Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=29753352;
 //BA.debugLineNum = 29753352;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=29753353;
 //BA.debugLineNum = 29753353;BA.debugLine="TraceAudio(\"Stop ignored. player not initialized";
__ref._traceaudio /*String*/ (null,"Stop ignored. player not initialized.");
RDebugUtils.currentLine=29753354;
 //BA.debugLineNum = 29753354;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=29753356;
 //BA.debugLineNum = 29753356;BA.debugLine="TraceAudio(\"Stop. fadeTimeMs=\" & fadeTimeMs & \",";
__ref._traceaudio /*String*/ (null,"Stop. fadeTimeMs="+BA.NumberToString(_fadetimems)+", currentVolume="+__c.NumberFormat2(__ref._currentvolume /*double*/ ,(int) (1),(int) (3),(int) (3),__c.False));
RDebugUtils.currentLine=29753357;
 //BA.debugLineNum = 29753357;BA.debugLine="If fadeTimeMs > 0 And currentVolume > 0 Then";
if (_fadetimems>0 && __ref._currentvolume /*double*/ >0) { 
RDebugUtils.currentLine=29753358;
 //BA.debugLineNum = 29753358;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=29753359;
 //BA.debugLineNum = 29753359;BA.debugLine="StartFade(FADE_OUT, 0, fadeTimeMs)";
__ref._startfade /*String*/ (null,__ref._fade_out /*int*/ ,0,_fadetimems);
 }else {
RDebugUtils.currentLine=29753361;
 //BA.debugLineNum = 29753361;BA.debugLine="StopImmediately";
__ref._stopimmediately /*String*/ (null);
 };
RDebugUtils.currentLine=29753363;
 //BA.debugLineNum = 29753363;BA.debugLine="LogSlowOperation(\"Stop\", startedAt)";
__ref._logslowoperation /*String*/ (null,"Stop",_startedat);
RDebugUtils.currentLine=29753364;
 //BA.debugLineNum = 29753364;BA.debugLine="End Sub";
return "";
}
public String  _timeupdatetimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "timeupdatetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "timeupdatetimer_tick", null));}
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Private Sub TimeUpdateTimer_Tick";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
if (__ref._playerstate /*int*/ !=__ref._state_playing /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
if (__ref._activeeventloadtoken /*long*/ !=__ref._currentloadtoken /*long*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=30539779;
 //BA.debugLineNum = 30539779;BA.debugLine="targetPage.AudioPlayer_Timeupdate(audioKey)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._audioplayer_timeupdate /*String*/ (null,__ref._audiokey /*String*/ );
RDebugUtils.currentLine=30539780;
 //BA.debugLineNum = 30539780;BA.debugLine="End Sub";
return "";
}
}