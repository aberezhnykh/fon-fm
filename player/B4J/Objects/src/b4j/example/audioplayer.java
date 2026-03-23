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
public anywheresoftware.b4j.objects.MediaPlayerWrapper _player = null;
public anywheresoftware.b4j.object.JavaObject _jo = null;
public String _eventname = "";
public Object _targetmodule = null;
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
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Public Sub PlayWithFade(fadeTimeMs As Int)";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="If playerState <> STATE_READY Then";
if (__ref._playerstate /*int*/ !=__ref._state_ready /*int*/ ) { 
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="TraceInternalError(\"play_with_fade_not_ready sta";
__ref._traceinternalerror /*String*/ (null,"play_with_fade_not_ready state="+BA.NumberToString(__ref._playerstate /*int*/ ));
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20250629;
 //BA.debugLineNum = 20250629;BA.debugLine="playerState = STATE_PLAYING";
__ref._playerstate /*int*/  = __ref._state_playing /*int*/ ;
RDebugUtils.currentLine=20250630;
 //BA.debugLineNum = 20250630;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=20250631;
 //BA.debugLineNum = 20250631;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=20250632;
 //BA.debugLineNum = 20250632;BA.debugLine="checkTimer.Enabled = True";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=20250633;
 //BA.debugLineNum = 20250633;BA.debugLine="timeUpdateTimer.Enabled = True";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=20250634;
 //BA.debugLineNum = 20250634;BA.debugLine="player.Play";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Play();
RDebugUtils.currentLine=20250635;
 //BA.debugLineNum = 20250635;BA.debugLine="TraceAudio(\"PlayWithFade. fadeTimeMs=\" & fadeTime";
__ref._traceaudio /*String*/ (null,"PlayWithFade. fadeTimeMs="+BA.NumberToString(_fadetimems)+", maxVolume="+__c.NumberFormat2(__ref._maxvolume /*double*/ ,(int) (1),(int) (3),(int) (3),__c.False));
RDebugUtils.currentLine=20250636;
 //BA.debugLineNum = 20250636;BA.debugLine="If fadeTimeMs > 0 Then";
if (_fadetimems>0) { 
RDebugUtils.currentLine=20250637;
 //BA.debugLineNum = 20250637;BA.debugLine="SetPlayerVolume(0)";
__ref._setplayervolume /*String*/ (null,0);
RDebugUtils.currentLine=20250638;
 //BA.debugLineNum = 20250638;BA.debugLine="StartFade(FADE_IN, maxVolume, fadeTimeMs)";
__ref._startfade /*String*/ (null,__ref._fade_in /*int*/ ,__ref._maxvolume /*double*/ ,_fadetimems);
 }else {
RDebugUtils.currentLine=20250640;
 //BA.debugLineNum = 20250640;BA.debugLine="SetPlayerVolume(maxVolume)";
__ref._setplayervolume /*String*/ (null,__ref._maxvolume /*double*/ );
 };
RDebugUtils.currentLine=20250642;
 //BA.debugLineNum = 20250642;BA.debugLine="End Sub";
return "";
}
public long  _position(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "position", false))
	 {return ((Long) Debug.delegate(ba, "position", null));}
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Public Sub Position As Long";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="If player.IsInitialized = False Then Return 0";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="Try";
try {RDebugUtils.currentLine=20709379;
 //BA.debugLineNum = 20709379;BA.debugLine="Return player.Position";
if (true) return (long) (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getPosition());
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=20709381;
 //BA.debugLineNum = 20709381;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=20709383;
 //BA.debugLineNum = 20709383;BA.debugLine="End Sub";
return 0L;
}
public String  _initialize(b4j.example.audioplayer __ref,anywheresoftware.b4a.BA _ba,String _eventnamevalue,Object _targetmodulevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_eventnamevalue,_targetmodulevalue}));}
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Public Sub Initialize (eventNameValue As String, t";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="eventName = eventNameValue";
__ref._eventname /*String*/  = _eventnamevalue;
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="loadTimer.Initialize(\"LoadTimer\", 10 * DateTime.T";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"LoadTimer",(long) (10*__c.DateTime.TicksPerSecond));
RDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="checkTimer.Initialize(\"CheckTimer\", 10 * DateTime";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"CheckTimer",(long) (10*__c.DateTime.TicksPerSecond));
RDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="timeUpdateTimer.Initialize(\"TimeUpdateTimer\", 250";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"TimeUpdateTimer",(long) (250));
RDebugUtils.currentLine=20054022;
 //BA.debugLineNum = 20054022;BA.debugLine="fadeTimer.Initialize(\"FadeTimer\", 40)";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"FadeTimer",(long) (40));
RDebugUtils.currentLine=20054023;
 //BA.debugLineNum = 20054023;BA.debugLine="TraceAudio(\"Initialize\")";
__ref._traceaudio /*String*/ (null,"Initialize");
RDebugUtils.currentLine=20054024;
 //BA.debugLineNum = 20054024;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20381699;
 //BA.debugLineNum = 20381699;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20381701;
 //BA.debugLineNum = 20381701;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=20381702;
 //BA.debugLineNum = 20381702;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=20381703;
 //BA.debugLineNum = 20381703;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=20381704;
 //BA.debugLineNum = 20381704;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=20381705;
 //BA.debugLineNum = 20381705;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=20381706;
 //BA.debugLineNum = 20381706;BA.debugLine="If player.IsInitialized Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=20381707;
 //BA.debugLineNum = 20381707;BA.debugLine="Try";
try {RDebugUtils.currentLine=20381708;
 //BA.debugLineNum = 20381708;BA.debugLine="player.Volume = 0";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(0);
RDebugUtils.currentLine=20381709;
 //BA.debugLineNum = 20381709;BA.debugLine="player.Stop";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Stop();
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=20381711;
 //BA.debugLineNum = 20381711;BA.debugLine="TraceInternalError(\"reset_stop\")";
__ref._traceinternalerror /*String*/ (null,"reset_stop");
 };
RDebugUtils.currentLine=20381713;
 //BA.debugLineNum = 20381713;BA.debugLine="If jo.IsInitialized Then";
if (__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .IsInitialized()) { 
RDebugUtils.currentLine=20381714;
 //BA.debugLineNum = 20381714;BA.debugLine="Try";
try {RDebugUtils.currentLine=20381715;
 //BA.debugLineNum = 20381715;BA.debugLine="jo.RunMethod(\"dispose\", Null)";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("dispose",(Object[])(__c.Null));
 } 
       catch (Exception e21) {
			ba.setLastException(e21);RDebugUtils.currentLine=20381717;
 //BA.debugLineNum = 20381717;BA.debugLine="TraceInternalError(\"reset_dispose\")";
__ref._traceinternalerror /*String*/ (null,"reset_dispose");
 };
 };
 };
RDebugUtils.currentLine=20381721;
 //BA.debugLineNum = 20381721;BA.debugLine="End Sub";
return "";
}
public long  _duration(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "duration", false))
	 {return ((Long) Debug.delegate(ba, "duration", null));}
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Public Sub Duration As Long";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="If player.IsInitialized = False Then Return 0";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="Try";
try {RDebugUtils.currentLine=20774915;
 //BA.debugLineNum = 20774915;BA.debugLine="Return player.Duration";
if (true) return (long) (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getDuration());
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=20774917;
 //BA.debugLineNum = 20774917;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=20774919;
 //BA.debugLineNum = 20774919;BA.debugLine="End Sub";
return 0L;
}
public String  _stop(b4j.example.audioplayer __ref,int _fadetimems) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "stop", false))
	 {return ((String) Debug.delegate(ba, "stop", new Object[] {_fadetimems}));}
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Public Sub Stop(fadeTimeMs As Int)";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=20316165;
 //BA.debugLineNum = 20316165;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=20316166;
 //BA.debugLineNum = 20316166;BA.debugLine="If player.IsInitialized = False Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=20316167;
 //BA.debugLineNum = 20316167;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=20316168;
 //BA.debugLineNum = 20316168;BA.debugLine="TraceAudio(\"Stop ignored. player not initialized";
__ref._traceaudio /*String*/ (null,"Stop ignored. player not initialized.");
RDebugUtils.currentLine=20316169;
 //BA.debugLineNum = 20316169;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20316171;
 //BA.debugLineNum = 20316171;BA.debugLine="TraceAudio(\"Stop. fadeTimeMs=\" & fadeTimeMs & \",";
__ref._traceaudio /*String*/ (null,"Stop. fadeTimeMs="+BA.NumberToString(_fadetimems)+", currentVolume="+__c.NumberFormat2(__ref._currentvolume /*double*/ ,(int) (1),(int) (3),(int) (3),__c.False));
RDebugUtils.currentLine=20316172;
 //BA.debugLineNum = 20316172;BA.debugLine="If fadeTimeMs > 0 And currentVolume > 0 Then";
if (_fadetimems>0 && __ref._currentvolume /*double*/ >0) { 
RDebugUtils.currentLine=20316173;
 //BA.debugLineNum = 20316173;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=20316174;
 //BA.debugLineNum = 20316174;BA.debugLine="StartFade(FADE_OUT, 0, fadeTimeMs)";
__ref._startfade /*String*/ (null,__ref._fade_out /*int*/ ,0,_fadetimems);
 }else {
RDebugUtils.currentLine=20316176;
 //BA.debugLineNum = 20316176;BA.debugLine="StopImmediately";
__ref._stopimmediately /*String*/ (null);
 };
RDebugUtils.currentLine=20316178;
 //BA.debugLineNum = 20316178;BA.debugLine="End Sub";
return "";
}
public String  _loadurl(b4j.example.audioplayer __ref,String _url,double _volume) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "loadurl", false))
	 {return ((String) Debug.delegate(ba, "loadurl", new Object[] {_url,_volume}));}
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Public Sub LoadUrl(url As String, volume As Double";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="loadTimer.Interval = 10 * DateTime.TicksPerSecond";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (10*__c.DateTime.TicksPerSecond));
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="loadTimer.Enabled = True";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="playerState = STATE_LOADING";
__ref._playerstate /*int*/  = __ref._state_loading /*int*/ ;
RDebugUtils.currentLine=20119557;
 //BA.debugLineNum = 20119557;BA.debugLine="maxVolume = Max(0, Min(1, volume))";
__ref._maxvolume /*double*/  = __c.Max(0,__c.Min(1,_volume));
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="TraceAudio(\"LoadUrl. volume=\" & NumberFormat2(max";
__ref._traceaudio /*String*/ (null,"LoadUrl. volume="+__c.NumberFormat2(__ref._maxvolume /*double*/ ,(int) (1),(int) (3),(int) (3),__c.False)+", url="+_url);
RDebugUtils.currentLine=20119559;
 //BA.debugLineNum = 20119559;BA.debugLine="Try";
try {RDebugUtils.currentLine=20119560;
 //BA.debugLineNum = 20119560;BA.debugLine="player.Initialize(\"Player\", url)";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Initialize(ba,"Player",_url);
RDebugUtils.currentLine=20119561;
 //BA.debugLineNum = 20119561;BA.debugLine="jo = player";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getObject()));
RDebugUtils.currentLine=20119562;
 //BA.debugLineNum = 20119562;BA.debugLine="jo.RunMethod(\"setOnError\", Array As Object(jo.Cr";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOnError",new Object[]{__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .CreateEventFromUI(ba,"java.lang.Runnable","Error",(Object)(__c.False))});
RDebugUtils.currentLine=20119563;
 //BA.debugLineNum = 20119563;BA.debugLine="jo.RunMethod(\"setOnReady\", Array As Object(jo.Cr";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOnReady",new Object[]{__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .CreateEventFromUI(ba,"java.lang.Runnable","Ready",(Object)(__c.False))});
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=20119565;
 //BA.debugLineNum = 20119565;BA.debugLine="NotifyError(LastException.Message)";
__ref._notifyerror /*String*/ (null,__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=20119567;
 //BA.debugLineNum = 20119567;BA.debugLine="End Sub";
return "";
}
public String  _callifexists(b4j.example.audioplayer __ref,String _subname) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "callifexists", false))
	 {return ((String) Debug.delegate(ba, "callifexists", new Object[] {_subname}));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Private Sub CallIfExists(subName As String)";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="If SubExists(targetModule, subName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,_subname)) { 
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="CallSubDelayed(targetModule, subName)";
__c.CallSubDelayed(ba,__ref._targetmodule /*Object*/ ,_subname);
 };
RDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Private Sub CheckTimer_Tick";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
if (__ref._playerstate /*int*/ !=__ref._state_playing /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="Dim positionNow As Long = Position";
_positionnow = __ref._position /*long*/ (null);
RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="If positionNow > lastPosition Then";
if (_positionnow>__ref._lastposition /*long*/ ) { 
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="lastPosition = positionNow";
__ref._lastposition /*long*/  = _positionnow;
RDebugUtils.currentLine=21233669;
 //BA.debugLineNum = 21233669;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=21233670;
 //BA.debugLineNum = 21233670;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21233672;
 //BA.debugLineNum = 21233672;BA.debugLine="Dim durationNow As Long = Duration";
_durationnow = __ref._duration /*long*/ (null);
RDebugUtils.currentLine=21233673;
 //BA.debugLineNum = 21233673;BA.debugLine="Dim remainMs As Long = -1";
_remainms = (long) (-1);
RDebugUtils.currentLine=21233674;
 //BA.debugLineNum = 21233674;BA.debugLine="If durationNow > 0 Then remainMs = Max(0, duratio";
if (_durationnow>0) { 
_remainms = (long) (__c.Max(0,_durationnow-_positionnow));};
RDebugUtils.currentLine=21233675;
 //BA.debugLineNum = 21233675;BA.debugLine="If durationNow > 0 And positionNow >= Max(0, dura";
if (_durationnow>0 && _positionnow>=__c.Max(0,_durationnow-2000)) { 
RDebugUtils.currentLine=21233676;
 //BA.debugLineNum = 21233676;BA.debugLine="TraceDiagnostic(\"хвост audio=\" & eventName & \" p";
__ref._tracediagnostic /*String*/ (null,"хвост audio="+__ref._eventname /*String*/ +" positionMs="+BA.NumberToString(_positionnow)+" durationMs="+BA.NumberToString(_durationnow)+" remainMs="+BA.NumberToString(_remainms)+" stalled="+BA.NumberToString(__ref._stalledcheckcount /*int*/ ));
RDebugUtils.currentLine=21233677;
 //BA.debugLineNum = 21233677;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21233679;
 //BA.debugLineNum = 21233679;BA.debugLine="stalledCheckCount = stalledCheckCount + 1";
__ref._stalledcheckcount /*int*/  = (int) (__ref._stalledcheckcount /*int*/ +1);
RDebugUtils.currentLine=21233680;
 //BA.debugLineNum = 21233680;BA.debugLine="If stalledCheckCount = 1 Or stalledCheckCount = 3";
if (__ref._stalledcheckcount /*int*/ ==1 || __ref._stalledcheckcount /*int*/ ==3) { 
RDebugUtils.currentLine=21233681;
 //BA.debugLineNum = 21233681;BA.debugLine="TraceDiagnostic(\"задержка audio=\" & eventName &";
__ref._tracediagnostic /*String*/ (null,"задержка audio="+__ref._eventname /*String*/ +" positionMs="+BA.NumberToString(_positionnow)+" durationMs="+BA.NumberToString(_durationnow)+" remainMs="+BA.NumberToString(_remainms)+" stalled="+BA.NumberToString(__ref._stalledcheckcount /*int*/ ));
 };
RDebugUtils.currentLine=21233683;
 //BA.debugLineNum = 21233683;BA.debugLine="If stalledCheckCount < 3 Then Return";
if (__ref._stalledcheckcount /*int*/ <3) { 
if (true) return "";};
RDebugUtils.currentLine=21233684;
 //BA.debugLineNum = 21233684;BA.debugLine="NotifyError(\"Silence detected 3\")";
__ref._notifyerror /*String*/ (null,"Silence detected 3");
RDebugUtils.currentLine=21233685;
 //BA.debugLineNum = 21233685;BA.debugLine="End Sub";
return "";
}
public String  _tracediagnostic(b4j.example.audioplayer __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "tracediagnostic", false))
	 {return ((String) Debug.delegate(ba, "tracediagnostic", new Object[] {_message}));}
String _subname = "";
RDebugUtils.currentLine=59637760;
 //BA.debugLineNum = 59637760;BA.debugLine="Private Sub TraceDiagnostic(message As String)";
RDebugUtils.currentLine=59637761;
 //BA.debugLineNum = 59637761;BA.debugLine="Dim subName As String = \"TraceLog\"";
_subname = "TraceLog";
RDebugUtils.currentLine=59637762;
 //BA.debugLineNum = 59637762;BA.debugLine="If SubExists(targetModule, subName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,_subname)) { 
RDebugUtils.currentLine=59637763;
 //BA.debugLineNum = 59637763;BA.debugLine="CallSubDelayed2(targetModule, subName, message)";
__c.CallSubDelayed2(ba,__ref._targetmodule /*Object*/ ,_subname,(Object)(_message));
 };
RDebugUtils.currentLine=59637765;
 //BA.debugLineNum = 59637765;BA.debugLine="End Sub";
return "";
}
public String  _notifyerror(b4j.example.audioplayer __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "notifyerror", false))
	 {return ((String) Debug.delegate(ba, "notifyerror", new Object[] {_message}));}
String _subname = "";
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Private Sub NotifyError(message As String)";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="TraceAudio(\"NotifyError. message=\" & message)";
__ref._traceaudio /*String*/ (null,"NotifyError. message="+_message);
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=21037059;
 //BA.debugLineNum = 21037059;BA.debugLine="Dim subName As String = eventName & \"_Error\"";
_subname = __ref._eventname /*String*/ +"_Error";
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="If SubExists(targetModule, subName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,_subname)) { 
RDebugUtils.currentLine=21037061;
 //BA.debugLineNum = 21037061;BA.debugLine="CallSubDelayed2(targetModule, subName, message)";
__c.CallSubDelayed2(ba,__ref._targetmodule /*Object*/ ,_subname,(Object)(_message));
 };
RDebugUtils.currentLine=21037063;
 //BA.debugLineNum = 21037063;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="Private Const STATE_STOPPED = 0, STATE_LOADING =";
_state_stopped = (int) (0);
_state_loading = (int) (1);
_state_ready = (int) (2);
_state_playing = (int) (3);
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="Private Const FADE_NONE = 0, FADE_IN = 1, FADE_OU";
_fade_none = (int) (0);
_fade_in = (int) (1);
_fade_out = (int) (2);
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="Private player As MediaPlayer";
_player = new anywheresoftware.b4j.objects.MediaPlayerWrapper();
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="Private eventName As String";
_eventname = "";
RDebugUtils.currentLine=19988487;
 //BA.debugLineNum = 19988487;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=19988488;
 //BA.debugLineNum = 19988488;BA.debugLine="Private timeUpdateTimer As Timer";
_timeupdatetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=19988489;
 //BA.debugLineNum = 19988489;BA.debugLine="Private lastPosition As Long";
_lastposition = 0L;
RDebugUtils.currentLine=19988490;
 //BA.debugLineNum = 19988490;BA.debugLine="Private checkTimer As Timer";
_checktimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=19988491;
 //BA.debugLineNum = 19988491;BA.debugLine="Private loadTimer As Timer";
_loadtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=19988492;
 //BA.debugLineNum = 19988492;BA.debugLine="Private fadeTimer As Timer";
_fadetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=19988493;
 //BA.debugLineNum = 19988493;BA.debugLine="Private playerState As Int";
_playerstate = 0;
RDebugUtils.currentLine=19988494;
 //BA.debugLineNum = 19988494;BA.debugLine="Private maxVolume As Double";
_maxvolume = 0;
RDebugUtils.currentLine=19988495;
 //BA.debugLineNum = 19988495;BA.debugLine="Private fadeMode As Int";
_fademode = 0;
RDebugUtils.currentLine=19988496;
 //BA.debugLineNum = 19988496;BA.debugLine="Private fadeTargetVolume As Double";
_fadetargetvolume = 0;
RDebugUtils.currentLine=19988497;
 //BA.debugLineNum = 19988497;BA.debugLine="Private fadeStepVolume As Double";
_fadestepvolume = 0;
RDebugUtils.currentLine=19988498;
 //BA.debugLineNum = 19988498;BA.debugLine="Private currentVolume As Double";
_currentvolume = 0;
RDebugUtils.currentLine=19988499;
 //BA.debugLineNum = 19988499;BA.debugLine="Private stalledCheckCount As Int";
_stalledcheckcount = 0;
RDebugUtils.currentLine=19988500;
 //BA.debugLineNum = 19988500;BA.debugLine="End Sub";
return "";
}
public String  _error_event(b4j.example.audioplayer __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "error_event", false))
	 {return ((String) Debug.delegate(ba, "error_event", new Object[] {_methodname,_args}));}
String _msg = "";
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Private Sub Error_Event(methodName As String, args";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="Dim msg As String = \"\"";
_msg = "";
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="Try";
try {RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="msg = jo.RunMethod(\"getError\", Null)";
_msg = BA.ObjectToString(__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getError",(Object[])(__c.Null)));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=20905989;
 //BA.debugLineNum = 20905989;BA.debugLine="msg = LastException.Message";
_msg = __c.LastException(ba).getMessage();
 };
RDebugUtils.currentLine=20905991;
 //BA.debugLineNum = 20905991;BA.debugLine="TraceAudio(\"Error_Event. message=\" & msg)";
__ref._traceaudio /*String*/ (null,"Error_Event. message="+_msg);
RDebugUtils.currentLine=20905992;
 //BA.debugLineNum = 20905992;BA.debugLine="NotifyError(msg)";
__ref._notifyerror /*String*/ (null,_msg);
RDebugUtils.currentLine=20905993;
 //BA.debugLineNum = 20905993;BA.debugLine="End Sub";
return "";
}
public String  _traceaudio(b4j.example.audioplayer __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "traceaudio", false))
	 {return ((String) Debug.delegate(ba, "traceaudio", new Object[] {_message}));}
String _subname = "";
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Private Sub TraceAudio(message As String)";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Dim subName As String = \"TraceLog\"";
_subname = "TraceLog";
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="If SubExists(targetModule, subName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,_subname)) { 
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="CallSubDelayed2(targetModule, subName, \"[\" & eve";
__c.CallSubDelayed2(ba,__ref._targetmodule /*Object*/ ,_subname,(Object)("["+__ref._eventname /*String*/ +"] "+_message));
 };
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="End Sub";
return "";
}
public String  _fadetimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "fadetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "fadetimer_tick", null));}
double _nextvolume = 0;
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Private Sub FadeTimer_Tick";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="If player.IsInitialized = False Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21364742;
 //BA.debugLineNum = 21364742;BA.debugLine="Dim nextVolume As Double = currentVolume + fadeSt";
_nextvolume = __ref._currentvolume /*double*/ +__ref._fadestepvolume /*double*/ ;
RDebugUtils.currentLine=21364743;
 //BA.debugLineNum = 21364743;BA.debugLine="If fadeMode = FADE_IN Then";
if (__ref._fademode /*int*/ ==__ref._fade_in /*int*/ ) { 
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="If nextVolume >= fadeTargetVolume Then";
if (_nextvolume>=__ref._fadetargetvolume /*double*/ ) { 
RDebugUtils.currentLine=21364745;
 //BA.debugLineNum = 21364745;BA.debugLine="nextVolume = fadeTargetVolume";
_nextvolume = __ref._fadetargetvolume /*double*/ ;
RDebugUtils.currentLine=21364746;
 //BA.debugLineNum = 21364746;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=21364747;
 //BA.debugLineNum = 21364747;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
 };
 }else 
{RDebugUtils.currentLine=21364749;
 //BA.debugLineNum = 21364749;BA.debugLine="Else If fadeMode = FADE_OUT Then";
if (__ref._fademode /*int*/ ==__ref._fade_out /*int*/ ) { 
RDebugUtils.currentLine=21364750;
 //BA.debugLineNum = 21364750;BA.debugLine="If nextVolume <= fadeTargetVolume Then";
if (_nextvolume<=__ref._fadetargetvolume /*double*/ ) { 
RDebugUtils.currentLine=21364751;
 //BA.debugLineNum = 21364751;BA.debugLine="nextVolume = fadeTargetVolume";
_nextvolume = __ref._fadetargetvolume /*double*/ ;
RDebugUtils.currentLine=21364752;
 //BA.debugLineNum = 21364752;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=21364753;
 //BA.debugLineNum = 21364753;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
 };
 }}
;
RDebugUtils.currentLine=21364756;
 //BA.debugLineNum = 21364756;BA.debugLine="SetPlayerVolume(nextVolume)";
__ref._setplayervolume /*String*/ (null,_nextvolume);
RDebugUtils.currentLine=21364757;
 //BA.debugLineNum = 21364757;BA.debugLine="If fadeMode = FADE_NONE And nextVolume <= 0 Then";
if (__ref._fademode /*int*/ ==__ref._fade_none /*int*/  && _nextvolume<=0) { 
RDebugUtils.currentLine=21364758;
 //BA.debugLineNum = 21364758;BA.debugLine="StopImmediately";
__ref._stopimmediately /*String*/ (null);
 };
RDebugUtils.currentLine=21364760;
 //BA.debugLineNum = 21364760;BA.debugLine="End Sub";
return "";
}
public String  _setplayervolume(b4j.example.audioplayer __ref,double _volumevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "setplayervolume", false))
	 {return ((String) Debug.delegate(ba, "setplayervolume", new Object[] {_volumevalue}));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Private Sub SetPlayerVolume(volumeValue As Double)";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="currentVolume = Max(0, Min(1, volumeValue))";
__ref._currentvolume /*double*/  = __c.Max(0,__c.Min(1,_volumevalue));
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="Try";
try {RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="player.Volume = currentVolume";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(__ref._currentvolume /*double*/ );
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=21495814;
 //BA.debugLineNum = 21495814;BA.debugLine="TraceInternalError(\"set_volume\")";
__ref._traceinternalerror /*String*/ (null,"set_volume");
 };
RDebugUtils.currentLine=21495816;
 //BA.debugLineNum = 21495816;BA.debugLine="End Sub";
return "";
}
public String  _stopimmediately(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "stopimmediately", false))
	 {return ((String) Debug.delegate(ba, "stopimmediately", null));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Private Sub StopImmediately";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="TraceAudio(\"StopImmediately\")";
__ref._traceaudio /*String*/ (null,"StopImmediately");
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=21561351;
 //BA.debugLineNum = 21561351;BA.debugLine="Try";
try {RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="player.Volume = 0";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(0);
RDebugUtils.currentLine=21561353;
 //BA.debugLineNum = 21561353;BA.debugLine="player.Stop";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Stop();
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=21561355;
 //BA.debugLineNum = 21561355;BA.debugLine="TraceInternalError(\"stop_immediately\")";
__ref._traceinternalerror /*String*/ (null,"stop_immediately");
 };
RDebugUtils.currentLine=21561357;
 //BA.debugLineNum = 21561357;BA.debugLine="End Sub";
return "";
}
public boolean  _isloading(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isloading", false))
	 {return ((Boolean) Debug.delegate(ba, "isloading", null));}
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Public Sub IsLoading As Boolean";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="Return playerState = STATE_LOADING";
if (true) return __ref._playerstate /*int*/ ==__ref._state_loading /*int*/ ;
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaying(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isplaying", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaying", null));}
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Public Sub IsPlaying As Boolean";
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="Return playerState = STATE_PLAYING";
if (true) return __ref._playerstate /*int*/ ==__ref._state_playing /*int*/ ;
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="End Sub";
return false;
}
public boolean  _isready(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isready", false))
	 {return ((Boolean) Debug.delegate(ba, "isready", null));}
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Public Sub IsReady As Boolean";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="Return playerState = STATE_READY";
if (true) return __ref._playerstate /*int*/ ==__ref._state_ready /*int*/ ;
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="End Sub";
return false;
}
public boolean  _isstopped(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isstopped", false))
	 {return ((Boolean) Debug.delegate(ba, "isstopped", null));}
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Public Sub IsStopped As Boolean";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="Return playerState = STATE_STOPPED";
if (true) return __ref._playerstate /*int*/ ==__ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="End Sub";
return false;
}
public String  _loadtimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "loadtimer_tick", false))
	 {return ((String) Debug.delegate(ba, "loadtimer_tick", null));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Private Sub LoadTimer_Tick";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="TraceAudio(\"Load timeout\")";
__ref._traceaudio /*String*/ (null,"Load timeout");
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="NotifyError(\"Track loading timeout expired\")";
__ref._notifyerror /*String*/ (null,"Track loading timeout expired");
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="End Sub";
return "";
}
public String  _play(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "play", false))
	 {return ((String) Debug.delegate(ba, "play", null));}
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Public Sub Play";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="PlayWithFade(0)";
__ref._playwithfade /*String*/ (null,(int) (0));
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="End Sub";
return "";
}
public String  _player_complete(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "player_complete", false))
	 {return ((String) Debug.delegate(ba, "player_complete", null));}
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Private Sub Player_Complete";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="If playerState = STATE_STOPPED Then Return";
if (__ref._playerstate /*int*/ ==__ref._state_stopped /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20971523;
 //BA.debugLineNum = 20971523;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20971524;
 //BA.debugLineNum = 20971524;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20971525;
 //BA.debugLineNum = 20971525;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20971526;
 //BA.debugLineNum = 20971526;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=20971527;
 //BA.debugLineNum = 20971527;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=20971528;
 //BA.debugLineNum = 20971528;BA.debugLine="stalledCheckCount = 0";
__ref._stalledcheckcount /*int*/  = (int) (0);
RDebugUtils.currentLine=20971529;
 //BA.debugLineNum = 20971529;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=20971530;
 //BA.debugLineNum = 20971530;BA.debugLine="TraceAudio(\"Complete\")";
__ref._traceaudio /*String*/ (null,"Complete");
RDebugUtils.currentLine=20971531;
 //BA.debugLineNum = 20971531;BA.debugLine="CallIfExists(eventName & \"_Complete\")";
__ref._callifexists /*String*/ (null,__ref._eventname /*String*/ +"_Complete");
RDebugUtils.currentLine=20971532;
 //BA.debugLineNum = 20971532;BA.debugLine="End Sub";
return "";
}
public String  _traceinternalerror(b4j.example.audioplayer __ref,String _context) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "traceinternalerror", false))
	 {return ((String) Debug.delegate(ba, "traceinternalerror", new Object[] {_context}));}
String _subname = "";
RDebugUtils.currentLine=59572224;
 //BA.debugLineNum = 59572224;BA.debugLine="Private Sub TraceInternalError(context As String)";
RDebugUtils.currentLine=59572225;
 //BA.debugLineNum = 59572225;BA.debugLine="Dim subName As String = \"TraceLog\"";
_subname = "TraceLog";
RDebugUtils.currentLine=59572226;
 //BA.debugLineNum = 59572226;BA.debugLine="If SubExists(targetModule, subName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,_subname)) { 
RDebugUtils.currentLine=59572227;
 //BA.debugLineNum = 59572227;BA.debugLine="CallSubDelayed2(targetModule, subName, \"ошибка а";
__c.CallSubDelayed2(ba,__ref._targetmodule /*Object*/ ,_subname,(Object)("ошибка аудио internal context="+_context+" message="+__c.LastException(ba).getMessage()));
 };
RDebugUtils.currentLine=59572229;
 //BA.debugLineNum = 59572229;BA.debugLine="End Sub";
return "";
}
public String  _startfade(b4j.example.audioplayer __ref,int _mode,double _targetvolume,int _fadetimems) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "startfade", false))
	 {return ((String) Debug.delegate(ba, "startfade", new Object[] {_mode,_targetvolume,_fadetimems}));}
int _intervalms = 0;
int _steps = 0;
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Private Sub StartFade(mode As Int, targetVolume As";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="If fadeTimeMs <= 0 Then";
if (_fadetimems<=0) { 
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="SetPlayerVolume(targetVolume)";
__ref._setplayervolume /*String*/ (null,_targetvolume);
RDebugUtils.currentLine=21430278;
 //BA.debugLineNum = 21430278;BA.debugLine="If targetVolume <= 0 Then StopImmediately";
if (_targetvolume<=0) { 
__ref._stopimmediately /*String*/ (null);};
RDebugUtils.currentLine=21430279;
 //BA.debugLineNum = 21430279;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21430281;
 //BA.debugLineNum = 21430281;BA.debugLine="Dim intervalMs As Int = Max(20, fadeTimer.Interva";
_intervalms = (int) (__c.Max(20,__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .getInterval()));
RDebugUtils.currentLine=21430282;
 //BA.debugLineNum = 21430282;BA.debugLine="Dim steps As Int = Max(1, Ceil(fadeTimeMs / inter";
_steps = (int) (__c.Max(1,__c.Ceil(_fadetimems/(double)_intervalms)));
RDebugUtils.currentLine=21430283;
 //BA.debugLineNum = 21430283;BA.debugLine="fadeMode = mode";
__ref._fademode /*int*/  = _mode;
RDebugUtils.currentLine=21430284;
 //BA.debugLineNum = 21430284;BA.debugLine="fadeTargetVolume = targetVolume";
__ref._fadetargetvolume /*double*/  = _targetvolume;
RDebugUtils.currentLine=21430285;
 //BA.debugLineNum = 21430285;BA.debugLine="fadeStepVolume = (targetVolume - currentVolume) /";
__ref._fadestepvolume /*double*/  = (_targetvolume-__ref._currentvolume /*double*/ )/(double)_steps;
RDebugUtils.currentLine=21430286;
 //BA.debugLineNum = 21430286;BA.debugLine="fadeTimer.Enabled = True";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=21430287;
 //BA.debugLineNum = 21430287;BA.debugLine="End Sub";
return "";
}
public String  _ready_event(b4j.example.audioplayer __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "ready_event", false))
	 {return ((String) Debug.delegate(ba, "ready_event", new Object[] {_methodname,_args}));}
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Private Sub Ready_Event(methodName As String, args";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="playerState = STATE_READY";
__ref._playerstate /*int*/  = __ref._state_ready /*int*/ ;
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="TraceAudio(\"Ready\")";
__ref._traceaudio /*String*/ (null,"Ready");
RDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="CallIfExists(eventName & \"_Ready\")";
__ref._callifexists /*String*/ (null,__ref._eventname /*String*/ +"_Ready");
RDebugUtils.currentLine=20840453;
 //BA.debugLineNum = 20840453;BA.debugLine="End Sub";
return "";
}
public String  _timeupdatetimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "timeupdatetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "timeupdatetimer_tick", null));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Private Sub TimeUpdateTimer_Tick";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
if (__ref._playerstate /*int*/ !=__ref._state_playing /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="CallIfExists(eventName & \"_Timeupdate\")";
__ref._callifexists /*String*/ (null,__ref._eventname /*String*/ +"_Timeupdate");
RDebugUtils.currentLine=21168131;
 //BA.debugLineNum = 21168131;BA.debugLine="End Sub";
return "";
}
}