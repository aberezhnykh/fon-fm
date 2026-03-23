package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbackretryfallbackstate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbackretryfallbackstate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbackretryfallbackstate.class).invoke(this, new Object[] {null});
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
public int _localretrydelay = 0;
public int _serverretrydelay = 0;
public int _dispatchretryafter = 0;
public boolean _ismediapathdegraded = false;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.playbackretryfallbackstate __ref,anywheresoftware.b4a.BA _ba,int _localretryinitial,int _serverretryinitial) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackretryfallbackstate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_localretryinitial,_serverretryinitial}));}
RDebugUtils.currentLine=48365568;
 //BA.debugLineNum = 48365568;BA.debugLine="Public Sub Initialize(localRetryInitial As Int, se";
RDebugUtils.currentLine=48365569;
 //BA.debugLineNum = 48365569;BA.debugLine="Reset(localRetryInitial, serverRetryInitial)";
__ref._reset /*String*/ (null,_localretryinitial,_serverretryinitial);
RDebugUtils.currentLine=48365570;
 //BA.debugLineNum = 48365570;BA.debugLine="End Sub";
return "";
}
public String  _updatemediapathdegradedfromcachesync(b4j.example.playbackretryfallbackstate __ref,boolean _downloaded,boolean _networkfailure) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackretryfallbackstate";
if (Debug.shouldDelegate(ba, "updatemediapathdegradedfromcachesync", false))
	 {return ((String) Debug.delegate(ba, "updatemediapathdegradedfromcachesync", new Object[] {_downloaded,_networkfailure}));}
boolean _previous = false;
RDebugUtils.currentLine=49086464;
 //BA.debugLineNum = 49086464;BA.debugLine="Public Sub UpdateMediaPathDegradedFromCacheSync(do";
RDebugUtils.currentLine=49086465;
 //BA.debugLineNum = 49086465;BA.debugLine="Dim previous As Boolean = IsMediaPathDegraded";
_previous = __ref._ismediapathdegraded /*boolean*/ ;
RDebugUtils.currentLine=49086466;
 //BA.debugLineNum = 49086466;BA.debugLine="If downloaded Then";
if (_downloaded) { 
RDebugUtils.currentLine=49086467;
 //BA.debugLineNum = 49086467;BA.debugLine="IsMediaPathDegraded = False";
__ref._ismediapathdegraded /*boolean*/  = __c.False;
 }else 
{RDebugUtils.currentLine=49086468;
 //BA.debugLineNum = 49086468;BA.debugLine="Else If networkFailure Then";
if (_networkfailure) { 
RDebugUtils.currentLine=49086469;
 //BA.debugLineNum = 49086469;BA.debugLine="IsMediaPathDegraded = True";
__ref._ismediapathdegraded /*boolean*/  = __c.True;
 }}
;
RDebugUtils.currentLine=49086471;
 //BA.debugLineNum = 49086471;BA.debugLine="If previous = False And IsMediaPathDegraded Then";
if (_previous==__c.False && __ref._ismediapathdegraded /*boolean*/ ) { 
if (true) return "entered";};
RDebugUtils.currentLine=49086472;
 //BA.debugLineNum = 49086472;BA.debugLine="If previous = True And IsMediaPathDegraded = Fals";
if (_previous==__c.True && __ref._ismediapathdegraded /*boolean*/ ==__c.False) { 
if (true) return "recovered";};
RDebugUtils.currentLine=49086473;
 //BA.debugLineNum = 49086473;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=49086474;
 //BA.debugLineNum = 49086474;BA.debugLine="End Sub";
return "";
}
public String  _cleardispatchretryafter(b4j.example.playbackretryfallbackstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackretryfallbackstate";
if (Debug.shouldDelegate(ba, "cleardispatchretryafter", false))
	 {return ((String) Debug.delegate(ba, "cleardispatchretryafter", null));}
RDebugUtils.currentLine=48627712;
 //BA.debugLineNum = 48627712;BA.debugLine="Public Sub ClearDispatchRetryAfter";
RDebugUtils.currentLine=48627713;
 //BA.debugLineNum = 48627713;BA.debugLine="DispatchRetryAfter = 0";
__ref._dispatchretryafter /*int*/  = (int) (0);
RDebugUtils.currentLine=48627714;
 //BA.debugLineNum = 48627714;BA.debugLine="End Sub";
return "";
}
public int  _consumedispatchretryafter(b4j.example.playbackretryfallbackstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackretryfallbackstate";
if (Debug.shouldDelegate(ba, "consumedispatchretryafter", false))
	 {return ((Integer) Debug.delegate(ba, "consumedispatchretryafter", null));}
int _value = 0;
RDebugUtils.currentLine=48758784;
 //BA.debugLineNum = 48758784;BA.debugLine="Public Sub ConsumeDispatchRetryAfter As Int";
RDebugUtils.currentLine=48758785;
 //BA.debugLineNum = 48758785;BA.debugLine="Dim value As Int = DispatchRetryAfter";
_value = __ref._dispatchretryafter /*int*/ ;
RDebugUtils.currentLine=48758786;
 //BA.debugLineNum = 48758786;BA.debugLine="DispatchRetryAfter = 0";
__ref._dispatchretryafter /*int*/  = (int) (0);
RDebugUtils.currentLine=48758787;
 //BA.debugLineNum = 48758787;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=48758788;
 //BA.debugLineNum = 48758788;BA.debugLine="End Sub";
return 0;
}
public String  _resetretrydelays(b4j.example.playbackretryfallbackstate __ref,int _localretryinitial,int _serverretryinitial) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackretryfallbackstate";
if (Debug.shouldDelegate(ba, "resetretrydelays", false))
	 {return ((String) Debug.delegate(ba, "resetretrydelays", new Object[] {_localretryinitial,_serverretryinitial}));}
RDebugUtils.currentLine=48562176;
 //BA.debugLineNum = 48562176;BA.debugLine="Public Sub ResetRetryDelays(localRetryInitial As I";
RDebugUtils.currentLine=48562177;
 //BA.debugLineNum = 48562177;BA.debugLine="LocalRetryDelay = localRetryInitial";
__ref._localretrydelay /*int*/  = _localretryinitial;
RDebugUtils.currentLine=48562178;
 //BA.debugLineNum = 48562178;BA.debugLine="ServerRetryDelay = serverRetryInitial";
__ref._serverretrydelay /*int*/  = _serverretryinitial;
RDebugUtils.currentLine=48562179;
 //BA.debugLineNum = 48562179;BA.debugLine="End Sub";
return "";
}
public int  _resolveretrydelay(b4j.example.playbackretryfallbackstate __ref,String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackretryfallbackstate";
if (Debug.shouldDelegate(ba, "resolveretrydelay", false))
	 {return ((Integer) Debug.delegate(ba, "resolveretrydelay", new Object[] {_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay}));}
int _delay = 0;
int _delayserver = 0;
RDebugUtils.currentLine=48496640;
 //BA.debugLineNum = 48496640;BA.debugLine="Public Sub ResolveRetryDelay(mode As String, delay";
RDebugUtils.currentLine=48496641;
 //BA.debugLineNum = 48496641;BA.debugLine="If delayMs > 0 Then Return delayMs";
if (_delayms>0) { 
if (true) return _delayms;};
RDebugUtils.currentLine=48496642;
 //BA.debugLineNum = 48496642;BA.debugLine="If mode = \"offline\" Then";
if ((_mode).equals("offline")) { 
RDebugUtils.currentLine=48496643;
 //BA.debugLineNum = 48496643;BA.debugLine="Dim delay As Int = LocalRetryDelay";
_delay = __ref._localretrydelay /*int*/ ;
RDebugUtils.currentLine=48496644;
 //BA.debugLineNum = 48496644;BA.debugLine="LocalRetryDelay = Min(LocalRetryDelay * 2, local";
__ref._localretrydelay /*int*/  = (int) (__c.Min(__ref._localretrydelay /*int*/ *2,_localretrymax));
RDebugUtils.currentLine=48496645;
 //BA.debugLineNum = 48496645;BA.debugLine="Return delay";
if (true) return _delay;
 };
RDebugUtils.currentLine=48496647;
 //BA.debugLineNum = 48496647;BA.debugLine="If mode = \"blocked\" Then Return blockedRetryDelay";
if ((_mode).equals("blocked")) { 
if (true) return _blockedretrydelay;};
RDebugUtils.currentLine=48496648;
 //BA.debugLineNum = 48496648;BA.debugLine="Dim delayServer As Int = ServerRetryDelay";
_delayserver = __ref._serverretrydelay /*int*/ ;
RDebugUtils.currentLine=48496649;
 //BA.debugLineNum = 48496649;BA.debugLine="ServerRetryDelay = Min(ServerRetryDelay * 2, serv";
__ref._serverretrydelay /*int*/  = (int) (__c.Min(__ref._serverretrydelay /*int*/ *2,_serverretrymax));
RDebugUtils.currentLine=48496650;
 //BA.debugLineNum = 48496650;BA.debugLine="Return delayServer";
if (true) return _delayserver;
RDebugUtils.currentLine=48496651;
 //BA.debugLineNum = 48496651;BA.debugLine="End Sub";
return 0;
}
public String  _setdispatchretryafter(b4j.example.playbackretryfallbackstate __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackretryfallbackstate";
if (Debug.shouldDelegate(ba, "setdispatchretryafter", false))
	 {return ((String) Debug.delegate(ba, "setdispatchretryafter", new Object[] {_value}));}
RDebugUtils.currentLine=48693248;
 //BA.debugLineNum = 48693248;BA.debugLine="Public Sub SetDispatchRetryAfter(value As Int)";
RDebugUtils.currentLine=48693249;
 //BA.debugLineNum = 48693249;BA.debugLine="DispatchRetryAfter = Max(0, value)";
__ref._dispatchretryafter /*int*/  = (int) (__c.Max(0,_value));
RDebugUtils.currentLine=48693250;
 //BA.debugLineNum = 48693250;BA.debugLine="End Sub";
return "";
}
public String  _setmediapathdegraded(b4j.example.playbackretryfallbackstate __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackretryfallbackstate";
if (Debug.shouldDelegate(ba, "setmediapathdegraded", false))
	 {return ((String) Debug.delegate(ba, "setmediapathdegraded", new Object[] {_value}));}
RDebugUtils.currentLine=49020928;
 //BA.debugLineNum = 49020928;BA.debugLine="Public Sub SetMediaPathDegraded(value As Boolean)";
RDebugUtils.currentLine=49020929;
 //BA.debugLineNum = 49020929;BA.debugLine="IsMediaPathDegraded = value";
__ref._ismediapathdegraded /*boolean*/  = _value;
RDebugUtils.currentLine=49020930;
 //BA.debugLineNum = 49020930;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbackretryfallbackstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackretryfallbackstate";
RDebugUtils.currentLine=48300032;
 //BA.debugLineNum = 48300032;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=48300033;
 //BA.debugLineNum = 48300033;BA.debugLine="Public LocalRetryDelay As Int";
_localretrydelay = 0;
RDebugUtils.currentLine=48300034;
 //BA.debugLineNum = 48300034;BA.debugLine="Public ServerRetryDelay As Int";
_serverretrydelay = 0;
RDebugUtils.currentLine=48300035;
 //BA.debugLineNum = 48300035;BA.debugLine="Public DispatchRetryAfter As Int";
_dispatchretryafter = 0;
RDebugUtils.currentLine=48300036;
 //BA.debugLineNum = 48300036;BA.debugLine="Public IsMediaPathDegraded As Boolean";
_ismediapathdegraded = false;
RDebugUtils.currentLine=48300037;
 //BA.debugLineNum = 48300037;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackretryfallbackstate __ref,int _localretryinitial,int _serverretryinitial) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackretryfallbackstate";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", new Object[] {_localretryinitial,_serverretryinitial}));}
RDebugUtils.currentLine=48431104;
 //BA.debugLineNum = 48431104;BA.debugLine="Public Sub Reset(localRetryInitial As Int, serverR";
RDebugUtils.currentLine=48431105;
 //BA.debugLineNum = 48431105;BA.debugLine="LocalRetryDelay = localRetryInitial";
__ref._localretrydelay /*int*/  = _localretryinitial;
RDebugUtils.currentLine=48431106;
 //BA.debugLineNum = 48431106;BA.debugLine="ServerRetryDelay = serverRetryInitial";
__ref._serverretrydelay /*int*/  = _serverretryinitial;
RDebugUtils.currentLine=48431107;
 //BA.debugLineNum = 48431107;BA.debugLine="DispatchRetryAfter = 0";
__ref._dispatchretryafter /*int*/  = (int) (0);
RDebugUtils.currentLine=48431108;
 //BA.debugLineNum = 48431108;BA.debugLine="IsMediaPathDegraded = False";
__ref._ismediapathdegraded /*boolean*/  = __c.False;
RDebugUtils.currentLine=48431109;
 //BA.debugLineNum = 48431109;BA.debugLine="End Sub";
return "";
}
}