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
public int _maxvolume = 0;
public int _fademode = 0;
public double _fadetargetvolume = 0;
public double _fadestepvolume = 0;
public double _currentvolume = 0;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _playwithfade(b4j.example.audioplayer __ref,int _fadetimems) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "playwithfade", false))
	 {return ((String) Debug.delegate(ba, "playwithfade", new Object[] {_fadetimems}));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Public Sub PlayWithFade(fadeTimeMs As Int)";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="If playerState <> STATE_READY Then Return";
if (__ref._playerstate /*int*/ !=__ref._state_ready /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="playerState = STATE_PLAYING";
__ref._playerstate /*int*/  = __ref._state_playing /*int*/ ;
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=22151172;
 //BA.debugLineNum = 22151172;BA.debugLine="checkTimer.Enabled = True";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=22151173;
 //BA.debugLineNum = 22151173;BA.debugLine="timeUpdateTimer.Enabled = True";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=22151174;
 //BA.debugLineNum = 22151174;BA.debugLine="player.Play";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Play();
RDebugUtils.currentLine=22151175;
 //BA.debugLineNum = 22151175;BA.debugLine="If fadeTimeMs > 0 Then";
if (_fadetimems>0) { 
RDebugUtils.currentLine=22151176;
 //BA.debugLineNum = 22151176;BA.debugLine="SetPlayerVolume(0)";
__ref._setplayervolume /*String*/ (null,0);
RDebugUtils.currentLine=22151177;
 //BA.debugLineNum = 22151177;BA.debugLine="StartFade(FADE_IN, maxVolume / 100, fadeTimeMs)";
__ref._startfade /*String*/ (null,__ref._fade_in /*int*/ ,__ref._maxvolume /*int*/ /(double)100,_fadetimems);
 }else {
RDebugUtils.currentLine=22151179;
 //BA.debugLineNum = 22151179;BA.debugLine="SetPlayerVolume(maxVolume / 100)";
__ref._setplayervolume /*String*/ (null,__ref._maxvolume /*int*/ /(double)100);
 };
RDebugUtils.currentLine=22151181;
 //BA.debugLineNum = 22151181;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.audioplayer __ref,anywheresoftware.b4a.BA _ba,String _eventnamevalue,Object _targetmodulevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_eventnamevalue,_targetmodulevalue}));}
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Public Sub Initialize (eventNameValue As String, t";
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="eventName = eventNameValue";
__ref._eventname /*String*/  = _eventnamevalue;
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=20643843;
 //BA.debugLineNum = 20643843;BA.debugLine="loadTimer.Initialize(\"LoadTimer\", 10 * DateTime.T";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"LoadTimer",(long) (10*__c.DateTime.TicksPerSecond));
RDebugUtils.currentLine=20643844;
 //BA.debugLineNum = 20643844;BA.debugLine="checkTimer.Initialize(\"CheckTimer\", 10 * DateTime";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"CheckTimer",(long) (10*__c.DateTime.TicksPerSecond));
RDebugUtils.currentLine=20643845;
 //BA.debugLineNum = 20643845;BA.debugLine="timeUpdateTimer.Initialize(\"TimeUpdateTimer\", 250";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"TimeUpdateTimer",(long) (250));
RDebugUtils.currentLine=20643846;
 //BA.debugLineNum = 20643846;BA.debugLine="fadeTimer.Initialize(\"FadeTimer\", 40)";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"FadeTimer",(long) (40));
RDebugUtils.currentLine=20643847;
 //BA.debugLineNum = 20643847;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20905988;
 //BA.debugLineNum = 20905988;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20905989;
 //BA.debugLineNum = 20905989;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=20905990;
 //BA.debugLineNum = 20905990;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=20905991;
 //BA.debugLineNum = 20905991;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=20905992;
 //BA.debugLineNum = 20905992;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=20905993;
 //BA.debugLineNum = 20905993;BA.debugLine="If player.IsInitialized Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=20905994;
 //BA.debugLineNum = 20905994;BA.debugLine="Try";
try {RDebugUtils.currentLine=20905995;
 //BA.debugLineNum = 20905995;BA.debugLine="player.Volume = 0";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(0);
RDebugUtils.currentLine=20905996;
 //BA.debugLineNum = 20905996;BA.debugLine="player.Stop";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Stop();
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=20905998;
 //BA.debugLineNum = 20905998;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("820905998",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=20906000;
 //BA.debugLineNum = 20906000;BA.debugLine="If jo.IsInitialized Then";
if (__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .IsInitialized()) { 
RDebugUtils.currentLine=20906001;
 //BA.debugLineNum = 20906001;BA.debugLine="Try";
try {RDebugUtils.currentLine=20906002;
 //BA.debugLineNum = 20906002;BA.debugLine="jo.RunMethod(\"dispose\", Null)";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("dispose",(Object[])(__c.Null));
 } 
       catch (Exception e20) {
			ba.setLastException(e20);RDebugUtils.currentLine=20906004;
 //BA.debugLineNum = 20906004;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("820906004",__c.LastException(ba).getMessage(),0);
 };
 };
 };
RDebugUtils.currentLine=20906008;
 //BA.debugLineNum = 20906008;BA.debugLine="End Sub";
return "";
}
public long  _duration(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "duration", false))
	 {return ((Long) Debug.delegate(ba, "duration", null));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Public Sub Duration As Long";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="If player.IsInitialized = False Then Return 0";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="Try";
try {RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="Return player.Duration";
if (true) return (long) (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getDuration());
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=21299207;
 //BA.debugLineNum = 21299207;BA.debugLine="End Sub";
return 0L;
}
public long  _position(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "position", false))
	 {return ((Long) Debug.delegate(ba, "position", null));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Public Sub Position As Long";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="If player.IsInitialized = False Then Return 0";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="Try";
try {RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="Return player.Position";
if (true) return (long) (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getPosition());
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=21233669;
 //BA.debugLineNum = 21233669;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=21233671;
 //BA.debugLineNum = 21233671;BA.debugLine="End Sub";
return 0L;
}
public String  _stop(b4j.example.audioplayer __ref,int _fadetimems) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "stop", false))
	 {return ((String) Debug.delegate(ba, "stop", new Object[] {_fadetimems}));}
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Public Sub Stop(fadeTimeMs As Int)";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="lastPosition = 0";
__ref._lastposition /*long*/  = (long) (0);
RDebugUtils.currentLine=20840453;
 //BA.debugLineNum = 20840453;BA.debugLine="If player.IsInitialized = False Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=20840454;
 //BA.debugLineNum = 20840454;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=20840455;
 //BA.debugLineNum = 20840455;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20840457;
 //BA.debugLineNum = 20840457;BA.debugLine="If fadeTimeMs > 0 And currentVolume > 0 Then";
if (_fadetimems>0 && __ref._currentvolume /*double*/ >0) { 
RDebugUtils.currentLine=20840458;
 //BA.debugLineNum = 20840458;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=20840459;
 //BA.debugLineNum = 20840459;BA.debugLine="StartFade(FADE_OUT, 0, fadeTimeMs)";
__ref._startfade /*String*/ (null,__ref._fade_out /*int*/ ,0,_fadetimems);
 }else {
RDebugUtils.currentLine=20840461;
 //BA.debugLineNum = 20840461;BA.debugLine="StopImmediately";
__ref._stopimmediately /*String*/ (null);
 };
RDebugUtils.currentLine=20840463;
 //BA.debugLineNum = 20840463;BA.debugLine="End Sub";
return "";
}
public String  _loadurl(b4j.example.audioplayer __ref,String _url,int _volume) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "loadurl", false))
	 {return ((String) Debug.delegate(ba, "loadurl", new Object[] {_url,_volume}));}
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Public Sub LoadUrl(url As String, volume As Int)";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="loadTimer.Interval = 10 * DateTime.TicksPerSecond";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (10*__c.DateTime.TicksPerSecond));
RDebugUtils.currentLine=20709379;
 //BA.debugLineNum = 20709379;BA.debugLine="loadTimer.Enabled = True";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=20709380;
 //BA.debugLineNum = 20709380;BA.debugLine="playerState = STATE_LOADING";
__ref._playerstate /*int*/  = __ref._state_loading /*int*/ ;
RDebugUtils.currentLine=20709381;
 //BA.debugLineNum = 20709381;BA.debugLine="maxVolume = Max(0, Min(100, volume))";
__ref._maxvolume /*int*/  = (int) (__c.Max(0,__c.Min(100,_volume)));
RDebugUtils.currentLine=20709382;
 //BA.debugLineNum = 20709382;BA.debugLine="Try";
try {RDebugUtils.currentLine=20709383;
 //BA.debugLineNum = 20709383;BA.debugLine="player.Initialize(\"Player\", url)";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Initialize(ba,"Player",_url);
RDebugUtils.currentLine=20709384;
 //BA.debugLineNum = 20709384;BA.debugLine="jo = player";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .getObject()));
RDebugUtils.currentLine=20709385;
 //BA.debugLineNum = 20709385;BA.debugLine="jo.RunMethod(\"setOnError\", Array As Object(jo.Cr";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOnError",new Object[]{__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .CreateEventFromUI(ba,"java.lang.Runnable","Error",(Object)(__c.False))});
RDebugUtils.currentLine=20709386;
 //BA.debugLineNum = 20709386;BA.debugLine="jo.RunMethod(\"setOnReady\", Array As Object(jo.Cr";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOnReady",new Object[]{__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .CreateEventFromUI(ba,"java.lang.Runnable","Ready",(Object)(__c.False))});
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=20709388;
 //BA.debugLineNum = 20709388;BA.debugLine="NotifyError(LastException.Message)";
__ref._notifyerror /*String*/ (null,__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=20709390;
 //BA.debugLineNum = 20709390;BA.debugLine="End Sub";
return "";
}
public String  _callifexists(b4j.example.audioplayer __ref,String _subname) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "callifexists", false))
	 {return ((String) Debug.delegate(ba, "callifexists", new Object[] {_subname}));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Private Sub CallIfExists(subName As String)";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="If SubExists(targetModule, subName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,_subname)) { 
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="CallSubDelayed(targetModule, subName)";
__c.CallSubDelayed(ba,__ref._targetmodule /*Object*/ ,_subname);
 };
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="End Sub";
return "";
}
public String  _checktimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "checktimer_tick", false))
	 {return ((String) Debug.delegate(ba, "checktimer_tick", null));}
long _positionnow = 0L;
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Private Sub CheckTimer_Tick";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
if (__ref._playerstate /*int*/ !=__ref._state_playing /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="Dim positionNow As Long = Position";
_positionnow = __ref._position /*long*/ (null);
RDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="If positionNow = lastPosition Then";
if (_positionnow==__ref._lastposition /*long*/ ) { 
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="NotifyError(\"Silence detected 1\")";
__ref._notifyerror /*String*/ (null,"Silence detected 1");
 }else {
RDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="lastPosition = positionNow";
__ref._lastposition /*long*/  = _positionnow;
 };
RDebugUtils.currentLine=21692424;
 //BA.debugLineNum = 21692424;BA.debugLine="End Sub";
return "";
}
public String  _notifyerror(b4j.example.audioplayer __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "notifyerror", false))
	 {return ((String) Debug.delegate(ba, "notifyerror", new Object[] {_message}));}
String _subname = "";
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Private Sub NotifyError(message As String)";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="Dim subName As String = eventName & \"_Error\"";
_subname = __ref._eventname /*String*/ +"_Error";
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="If SubExists(targetModule, subName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,_subname)) { 
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="CallSubDelayed2(targetModule, subName, message)";
__c.CallSubDelayed2(ba,__ref._targetmodule /*Object*/ ,_subname,(Object)(_message));
 };
RDebugUtils.currentLine=21495814;
 //BA.debugLineNum = 21495814;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="Private Const STATE_STOPPED = 0, STATE_LOADING =";
_state_stopped = (int) (0);
_state_loading = (int) (1);
_state_ready = (int) (2);
_state_playing = (int) (3);
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="Private Const FADE_NONE = 0, FADE_IN = 1, FADE_OU";
_fade_none = (int) (0);
_fade_in = (int) (1);
_fade_out = (int) (2);
RDebugUtils.currentLine=20578308;
 //BA.debugLineNum = 20578308;BA.debugLine="Private player As MediaPlayer";
_player = new anywheresoftware.b4j.objects.MediaPlayerWrapper();
RDebugUtils.currentLine=20578309;
 //BA.debugLineNum = 20578309;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=20578310;
 //BA.debugLineNum = 20578310;BA.debugLine="Private eventName As String";
_eventname = "";
RDebugUtils.currentLine=20578311;
 //BA.debugLineNum = 20578311;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=20578312;
 //BA.debugLineNum = 20578312;BA.debugLine="Private timeUpdateTimer As Timer";
_timeupdatetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=20578313;
 //BA.debugLineNum = 20578313;BA.debugLine="Private lastPosition As Long";
_lastposition = 0L;
RDebugUtils.currentLine=20578314;
 //BA.debugLineNum = 20578314;BA.debugLine="Private checkTimer As Timer";
_checktimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=20578315;
 //BA.debugLineNum = 20578315;BA.debugLine="Private loadTimer As Timer";
_loadtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=20578316;
 //BA.debugLineNum = 20578316;BA.debugLine="Private fadeTimer As Timer";
_fadetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=20578317;
 //BA.debugLineNum = 20578317;BA.debugLine="Private playerState As Int";
_playerstate = 0;
RDebugUtils.currentLine=20578318;
 //BA.debugLineNum = 20578318;BA.debugLine="Private maxVolume As Int";
_maxvolume = 0;
RDebugUtils.currentLine=20578319;
 //BA.debugLineNum = 20578319;BA.debugLine="Private fadeMode As Int";
_fademode = 0;
RDebugUtils.currentLine=20578320;
 //BA.debugLineNum = 20578320;BA.debugLine="Private fadeTargetVolume As Double";
_fadetargetvolume = 0;
RDebugUtils.currentLine=20578321;
 //BA.debugLineNum = 20578321;BA.debugLine="Private fadeStepVolume As Double";
_fadestepvolume = 0;
RDebugUtils.currentLine=20578322;
 //BA.debugLineNum = 20578322;BA.debugLine="Private currentVolume As Double";
_currentvolume = 0;
RDebugUtils.currentLine=20578323;
 //BA.debugLineNum = 20578323;BA.debugLine="End Sub";
return "";
}
public String  _error_event(b4j.example.audioplayer __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "error_event", false))
	 {return ((String) Debug.delegate(ba, "error_event", new Object[] {_methodname,_args}));}
String _msg = "";
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Private Sub Error_Event(methodName As String, args";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Dim msg As String = \"\"";
_msg = "";
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="Try";
try {RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="msg = jo.RunMethod(\"getError\", Null)";
_msg = BA.ObjectToString(__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getError",(Object[])(__c.Null)));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="msg = LastException.Message";
_msg = __c.LastException(ba).getMessage();
 };
RDebugUtils.currentLine=21430279;
 //BA.debugLineNum = 21430279;BA.debugLine="NotifyError(msg)";
__ref._notifyerror /*String*/ (null,_msg);
RDebugUtils.currentLine=21430280;
 //BA.debugLineNum = 21430280;BA.debugLine="End Sub";
return "";
}
public String  _fadetimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "fadetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "fadetimer_tick", null));}
double _nextvolume = 0;
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Private Sub FadeTimer_Tick";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="If player.IsInitialized = False Then";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=22282246;
 //BA.debugLineNum = 22282246;BA.debugLine="Dim nextVolume As Double = currentVolume + fadeSt";
_nextvolume = __ref._currentvolume /*double*/ +__ref._fadestepvolume /*double*/ ;
RDebugUtils.currentLine=22282247;
 //BA.debugLineNum = 22282247;BA.debugLine="If fadeMode = FADE_IN Then";
if (__ref._fademode /*int*/ ==__ref._fade_in /*int*/ ) { 
RDebugUtils.currentLine=22282248;
 //BA.debugLineNum = 22282248;BA.debugLine="If nextVolume >= fadeTargetVolume Then";
if (_nextvolume>=__ref._fadetargetvolume /*double*/ ) { 
RDebugUtils.currentLine=22282249;
 //BA.debugLineNum = 22282249;BA.debugLine="nextVolume = fadeTargetVolume";
_nextvolume = __ref._fadetargetvolume /*double*/ ;
RDebugUtils.currentLine=22282250;
 //BA.debugLineNum = 22282250;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=22282251;
 //BA.debugLineNum = 22282251;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
 };
 }else 
{RDebugUtils.currentLine=22282253;
 //BA.debugLineNum = 22282253;BA.debugLine="Else If fadeMode = FADE_OUT Then";
if (__ref._fademode /*int*/ ==__ref._fade_out /*int*/ ) { 
RDebugUtils.currentLine=22282254;
 //BA.debugLineNum = 22282254;BA.debugLine="If nextVolume <= fadeTargetVolume Then";
if (_nextvolume<=__ref._fadetargetvolume /*double*/ ) { 
RDebugUtils.currentLine=22282255;
 //BA.debugLineNum = 22282255;BA.debugLine="nextVolume = fadeTargetVolume";
_nextvolume = __ref._fadetargetvolume /*double*/ ;
RDebugUtils.currentLine=22282256;
 //BA.debugLineNum = 22282256;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=22282257;
 //BA.debugLineNum = 22282257;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
 };
 }}
;
RDebugUtils.currentLine=22282260;
 //BA.debugLineNum = 22282260;BA.debugLine="SetPlayerVolume(nextVolume)";
__ref._setplayervolume /*String*/ (null,_nextvolume);
RDebugUtils.currentLine=22282261;
 //BA.debugLineNum = 22282261;BA.debugLine="If fadeMode = FADE_NONE And nextVolume <= 0 Then";
if (__ref._fademode /*int*/ ==__ref._fade_none /*int*/  && _nextvolume<=0) { 
RDebugUtils.currentLine=22282262;
 //BA.debugLineNum = 22282262;BA.debugLine="StopImmediately";
__ref._stopimmediately /*String*/ (null);
 };
RDebugUtils.currentLine=22282264;
 //BA.debugLineNum = 22282264;BA.debugLine="End Sub";
return "";
}
public String  _setplayervolume(b4j.example.audioplayer __ref,double _volumevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "setplayervolume", false))
	 {return ((String) Debug.delegate(ba, "setplayervolume", new Object[] {_volumevalue}));}
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Private Sub SetPlayerVolume(volumeValue As Double)";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="currentVolume = Max(0, Min(1, volumeValue))";
__ref._currentvolume /*double*/  = __c.Max(0,__c.Min(1,_volumevalue));
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="Try";
try {RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="player.Volume = currentVolume";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(__ref._currentvolume /*double*/ );
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=22413318;
 //BA.debugLineNum = 22413318;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("822413318",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=22413320;
 //BA.debugLineNum = 22413320;BA.debugLine="End Sub";
return "";
}
public String  _stopimmediately(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "stopimmediately", false))
	 {return ((String) Debug.delegate(ba, "stopimmediately", null));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Private Sub StopImmediately";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=22478851;
 //BA.debugLineNum = 22478851;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=22478852;
 //BA.debugLineNum = 22478852;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=22478853;
 //BA.debugLineNum = 22478853;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22478854;
 //BA.debugLineNum = 22478854;BA.debugLine="Try";
try {RDebugUtils.currentLine=22478855;
 //BA.debugLineNum = 22478855;BA.debugLine="player.Volume = 0";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .setVolume(0);
RDebugUtils.currentLine=22478856;
 //BA.debugLineNum = 22478856;BA.debugLine="player.Stop";
__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .Stop();
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=22478858;
 //BA.debugLineNum = 22478858;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("822478858",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=22478860;
 //BA.debugLineNum = 22478860;BA.debugLine="End Sub";
return "";
}
public boolean  _isloading(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isloading", false))
	 {return ((Boolean) Debug.delegate(ba, "isloading", null));}
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Public Sub IsLoading As Boolean";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="Return playerState = STATE_LOADING";
if (true) return __ref._playerstate /*int*/ ==__ref._state_loading /*int*/ ;
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaying(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isplaying", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaying", null));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Public Sub IsPlaying As Boolean";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="Return playerState = STATE_PLAYING";
if (true) return __ref._playerstate /*int*/ ==__ref._state_playing /*int*/ ;
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="End Sub";
return false;
}
public boolean  _isready(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isready", false))
	 {return ((Boolean) Debug.delegate(ba, "isready", null));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Public Sub IsReady As Boolean";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="Return playerState = STATE_READY";
if (true) return __ref._playerstate /*int*/ ==__ref._state_ready /*int*/ ;
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="End Sub";
return false;
}
public boolean  _isstopped(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "isstopped", false))
	 {return ((Boolean) Debug.delegate(ba, "isstopped", null));}
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Public Sub IsStopped As Boolean";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="Return playerState = STATE_STOPPED";
if (true) return __ref._playerstate /*int*/ ==__ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="End Sub";
return false;
}
public String  _loadtimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "loadtimer_tick", false))
	 {return ((String) Debug.delegate(ba, "loadtimer_tick", null));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Private Sub LoadTimer_Tick";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="NotifyError(\"Track loading timeout expired\")";
__ref._notifyerror /*String*/ (null,"Track loading timeout expired");
RDebugUtils.currentLine=21757955;
 //BA.debugLineNum = 21757955;BA.debugLine="End Sub";
return "";
}
public String  _play(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "play", false))
	 {return ((String) Debug.delegate(ba, "play", null));}
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Public Sub Play";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="PlayWithFade(0)";
__ref._playwithfade /*String*/ (null,(int) (0));
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="End Sub";
return "";
}
public String  _player_complete(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "player_complete", false))
	 {return ((String) Debug.delegate(ba, "player_complete", null));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Private Sub Player_Complete";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="If playerState = STATE_STOPPED Then Return";
if (__ref._playerstate /*int*/ ==__ref._state_stopped /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="checkTimer.Enabled = False";
__ref._checktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="timeUpdateTimer.Enabled = False";
__ref._timeupdatetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=22216709;
 //BA.debugLineNum = 22216709;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=22216710;
 //BA.debugLineNum = 22216710;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=22216711;
 //BA.debugLineNum = 22216711;BA.debugLine="currentVolume = 0";
__ref._currentvolume /*double*/  = 0;
RDebugUtils.currentLine=22216712;
 //BA.debugLineNum = 22216712;BA.debugLine="playerState = STATE_STOPPED";
__ref._playerstate /*int*/  = __ref._state_stopped /*int*/ ;
RDebugUtils.currentLine=22216713;
 //BA.debugLineNum = 22216713;BA.debugLine="CallIfExists(eventName & \"_Complete\")";
__ref._callifexists /*String*/ (null,__ref._eventname /*String*/ +"_Complete");
RDebugUtils.currentLine=22216714;
 //BA.debugLineNum = 22216714;BA.debugLine="End Sub";
return "";
}
public String  _startfade(b4j.example.audioplayer __ref,int _mode,double _targetvolume,int _fadetimems) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "startfade", false))
	 {return ((String) Debug.delegate(ba, "startfade", new Object[] {_mode,_targetvolume,_fadetimems}));}
int _intervalms = 0;
int _steps = 0;
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Private Sub StartFade(mode As Int, targetVolume As";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="fadeTimer.Enabled = False";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="fadeMode = FADE_NONE";
__ref._fademode /*int*/  = __ref._fade_none /*int*/ ;
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="If player.IsInitialized = False Then Return";
if (__ref._player /*anywheresoftware.b4j.objects.MediaPlayerWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22347780;
 //BA.debugLineNum = 22347780;BA.debugLine="If fadeTimeMs <= 0 Then";
if (_fadetimems<=0) { 
RDebugUtils.currentLine=22347781;
 //BA.debugLineNum = 22347781;BA.debugLine="SetPlayerVolume(targetVolume)";
__ref._setplayervolume /*String*/ (null,_targetvolume);
RDebugUtils.currentLine=22347782;
 //BA.debugLineNum = 22347782;BA.debugLine="If targetVolume <= 0 Then StopImmediately";
if (_targetvolume<=0) { 
__ref._stopimmediately /*String*/ (null);};
RDebugUtils.currentLine=22347783;
 //BA.debugLineNum = 22347783;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=22347785;
 //BA.debugLineNum = 22347785;BA.debugLine="Dim intervalMs As Int = Max(20, fadeTimer.Interva";
_intervalms = (int) (__c.Max(20,__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .getInterval()));
RDebugUtils.currentLine=22347786;
 //BA.debugLineNum = 22347786;BA.debugLine="Dim steps As Int = Max(1, Ceil(fadeTimeMs / inter";
_steps = (int) (__c.Max(1,__c.Ceil(_fadetimems/(double)_intervalms)));
RDebugUtils.currentLine=22347787;
 //BA.debugLineNum = 22347787;BA.debugLine="fadeMode = mode";
__ref._fademode /*int*/  = _mode;
RDebugUtils.currentLine=22347788;
 //BA.debugLineNum = 22347788;BA.debugLine="fadeTargetVolume = targetVolume";
__ref._fadetargetvolume /*double*/  = _targetvolume;
RDebugUtils.currentLine=22347789;
 //BA.debugLineNum = 22347789;BA.debugLine="fadeStepVolume = (targetVolume - currentVolume) /";
__ref._fadestepvolume /*double*/  = (_targetvolume-__ref._currentvolume /*double*/ )/(double)_steps;
RDebugUtils.currentLine=22347790;
 //BA.debugLineNum = 22347790;BA.debugLine="fadeTimer.Enabled = True";
__ref._fadetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=22347791;
 //BA.debugLineNum = 22347791;BA.debugLine="End Sub";
return "";
}
public String  _ready_event(b4j.example.audioplayer __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "ready_event", false))
	 {return ((String) Debug.delegate(ba, "ready_event", new Object[] {_methodname,_args}));}
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Private Sub Ready_Event(methodName As String, args";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="playerState = STATE_READY";
__ref._playerstate /*int*/  = __ref._state_ready /*int*/ ;
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="loadTimer.Enabled = False";
__ref._loadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="CallIfExists(eventName & \"_Ready\")";
__ref._callifexists /*String*/ (null,__ref._eventname /*String*/ +"_Ready");
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="End Sub";
return "";
}
public String  _timeupdatetimer_tick(b4j.example.audioplayer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="audioplayer";
if (Debug.shouldDelegate(ba, "timeupdatetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "timeupdatetimer_tick", null));}
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Private Sub TimeUpdateTimer_Tick";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
if (__ref._playerstate /*int*/ !=__ref._state_playing /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="CallIfExists(eventName & \"_Timeupdate\")";
__ref._callifexists /*String*/ (null,__ref._eventname /*String*/ +"_Timeupdate");
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="End Sub";
return "";
}
}