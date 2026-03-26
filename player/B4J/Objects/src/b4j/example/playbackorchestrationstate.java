package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbackorchestrationstate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbackorchestrationstate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbackorchestrationstate.class).invoke(this, new Object[] {null});
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
public boolean _isstarted = false;
public boolean _isstoppedbyuser = false;
public boolean _isstopping = false;
public boolean _prefetchdone = false;
public boolean _iscrossfadetriggered = false;
public boolean _isqueuebackfillinprogress = false;
public boolean _isplaybackdispatchinprogress = false;
public String _activedispatchinitiator = "";
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.platformbridge _platformbridge = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _cleartracktransitionflags(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "cleartracktransitionflags", false))
	 {return ((String) Debug.delegate(ba, "cleartracktransitionflags", null));}
RDebugUtils.currentLine=52690944;
 //BA.debugLineNum = 52690944;BA.debugLine="Public Sub ClearTrackTransitionFlags";
RDebugUtils.currentLine=52690945;
 //BA.debugLineNum = 52690945;BA.debugLine="PrefetchDone = False";
__ref._prefetchdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=52690946;
 //BA.debugLineNum = 52690946;BA.debugLine="IsCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = __c.False;
RDebugUtils.currentLine=52690947;
 //BA.debugLineNum = 52690947;BA.debugLine="End Sub";
return "";
}
public String  _enterstartedstate(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "enterstartedstate", false))
	 {return ((String) Debug.delegate(ba, "enterstartedstate", null));}
RDebugUtils.currentLine=52756480;
 //BA.debugLineNum = 52756480;BA.debugLine="Public Sub EnterStartedState";
RDebugUtils.currentLine=52756481;
 //BA.debugLineNum = 52756481;BA.debugLine="IsStarted = True";
__ref._isstarted /*boolean*/  = __c.True;
RDebugUtils.currentLine=52756482;
 //BA.debugLineNum = 52756482;BA.debugLine="IsStoppedByUser = False";
__ref._isstoppedbyuser /*boolean*/  = __c.False;
RDebugUtils.currentLine=52756483;
 //BA.debugLineNum = 52756483;BA.debugLine="IsStopping = False";
__ref._isstopping /*boolean*/  = __c.False;
RDebugUtils.currentLine=52756484;
 //BA.debugLineNum = 52756484;BA.debugLine="End Sub";
return "";
}
public String  _enddispatch(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "enddispatch", false))
	 {return ((String) Debug.delegate(ba, "enddispatch", null));}
RDebugUtils.currentLine=53346304;
 //BA.debugLineNum = 53346304;BA.debugLine="Public Sub EndDispatch";
RDebugUtils.currentLine=53346305;
 //BA.debugLineNum = 53346305;BA.debugLine="IsPlaybackDispatchInProgress = False";
__ref._isplaybackdispatchinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=53346306;
 //BA.debugLineNum = 53346306;BA.debugLine="ActiveDispatchInitiator = \"\"";
__ref._activedispatchinitiator /*String*/  = "";
RDebugUtils.currentLine=53346307;
 //BA.debugLineNum = 53346307;BA.debugLine="End Sub";
return "";
}
public String  _enteruserstoppedstate(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "enteruserstoppedstate", false))
	 {return ((String) Debug.delegate(ba, "enteruserstoppedstate", null));}
RDebugUtils.currentLine=52822016;
 //BA.debugLineNum = 52822016;BA.debugLine="Public Sub EnterUserStoppedState";
RDebugUtils.currentLine=52822017;
 //BA.debugLineNum = 52822017;BA.debugLine="IsStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=52822018;
 //BA.debugLineNum = 52822018;BA.debugLine="IsStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = __c.True;
RDebugUtils.currentLine=52822019;
 //BA.debugLineNum = 52822019;BA.debugLine="IsStopping = False";
__ref._isstopping /*boolean*/  = __c.False;
RDebugUtils.currentLine=52822020;
 //BA.debugLineNum = 52822020;BA.debugLine="End Sub";
return "";
}
public String  _enterpolicypausedstate(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "enterpolicypausedstate", false))
	 {return ((String) Debug.delegate(ba, "enterpolicypausedstate", null));}
RDebugUtils.currentLine=52953088;
 //BA.debugLineNum = 52953088;BA.debugLine="Public Sub EnterPolicyPausedState";
RDebugUtils.currentLine=52953089;
 //BA.debugLineNum = 52953089;BA.debugLine="IsStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=52953090;
 //BA.debugLineNum = 52953090;BA.debugLine="IsStoppedByUser = False";
__ref._isstoppedbyuser /*boolean*/  = __c.False;
RDebugUtils.currentLine=52953091;
 //BA.debugLineNum = 52953091;BA.debugLine="IsStopping = False";
__ref._isstopping /*boolean*/  = __c.False;
RDebugUtils.currentLine=52953092;
 //BA.debugLineNum = 52953092;BA.debugLine="End Sub";
return "";
}
public String  _enterinternalstoppingstate(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "enterinternalstoppingstate", false))
	 {return ((String) Debug.delegate(ba, "enterinternalstoppingstate", null));}
RDebugUtils.currentLine=52887552;
 //BA.debugLineNum = 52887552;BA.debugLine="Public Sub EnterInternalStoppingState";
RDebugUtils.currentLine=52887553;
 //BA.debugLineNum = 52887553;BA.debugLine="IsStopping = True";
__ref._isstopping /*boolean*/  = __c.True;
RDebugUtils.currentLine=52887554;
 //BA.debugLineNum = 52887554;BA.debugLine="IsStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=52887555;
 //BA.debugLineNum = 52887555;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackorchestrationstate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=52494336;
 //BA.debugLineNum = 52494336;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=52494337;
 //BA.debugLineNum = 52494337;BA.debugLine="ResetToStopped";
__ref._resettostopped /*String*/ (null);
RDebugUtils.currentLine=52494338;
 //BA.debugLineNum = 52494338;BA.debugLine="End Sub";
return "";
}
public boolean  _begindispatch(b4j.example.playbackorchestrationstate __ref,String _initiator) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "begindispatch", false))
	 {return ((Boolean) Debug.delegate(ba, "begindispatch", new Object[] {_initiator}));}
RDebugUtils.currentLine=53280768;
 //BA.debugLineNum = 53280768;BA.debugLine="Public Sub BeginDispatch(initiator As String) As B";
RDebugUtils.currentLine=53280769;
 //BA.debugLineNum = 53280769;BA.debugLine="If IsPlaybackDispatchInProgress Then Return False";
if (__ref._isplaybackdispatchinprogress /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=53280770;
 //BA.debugLineNum = 53280770;BA.debugLine="IsPlaybackDispatchInProgress = True";
__ref._isplaybackdispatchinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=53280771;
 //BA.debugLineNum = 53280771;BA.debugLine="ActiveDispatchInitiator = initiator";
__ref._activedispatchinitiator /*String*/  = _initiator;
RDebugUtils.currentLine=53280772;
 //BA.debugLineNum = 53280772;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=53280773;
 //BA.debugLineNum = 53280773;BA.debugLine="End Sub";
return false;
}
public boolean  _beginqueuebackfill(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "beginqueuebackfill", false))
	 {return ((Boolean) Debug.delegate(ba, "beginqueuebackfill", null));}
RDebugUtils.currentLine=53149696;
 //BA.debugLineNum = 53149696;BA.debugLine="Public Sub BeginQueueBackfill As Boolean";
RDebugUtils.currentLine=53149697;
 //BA.debugLineNum = 53149697;BA.debugLine="If IsQueueBackfillInProgress Then Return False";
if (__ref._isqueuebackfillinprogress /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=53149698;
 //BA.debugLineNum = 53149698;BA.debugLine="IsQueueBackfillInProgress = True";
__ref._isqueuebackfillinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=53149699;
 //BA.debugLineNum = 53149699;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=53149700;
 //BA.debugLineNum = 53149700;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
RDebugUtils.currentLine=52428800;
 //BA.debugLineNum = 52428800;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=52428801;
 //BA.debugLineNum = 52428801;BA.debugLine="Public IsStarted As Boolean";
_isstarted = false;
RDebugUtils.currentLine=52428802;
 //BA.debugLineNum = 52428802;BA.debugLine="Public IsStoppedByUser As Boolean";
_isstoppedbyuser = false;
RDebugUtils.currentLine=52428803;
 //BA.debugLineNum = 52428803;BA.debugLine="Public IsStopping As Boolean";
_isstopping = false;
RDebugUtils.currentLine=52428804;
 //BA.debugLineNum = 52428804;BA.debugLine="Public PrefetchDone As Boolean";
_prefetchdone = false;
RDebugUtils.currentLine=52428805;
 //BA.debugLineNum = 52428805;BA.debugLine="Public IsCrossfadeTriggered As Boolean";
_iscrossfadetriggered = false;
RDebugUtils.currentLine=52428806;
 //BA.debugLineNum = 52428806;BA.debugLine="Public IsQueueBackfillInProgress As Boolean";
_isqueuebackfillinprogress = false;
RDebugUtils.currentLine=52428807;
 //BA.debugLineNum = 52428807;BA.debugLine="Public IsPlaybackDispatchInProgress As Boolean";
_isplaybackdispatchinprogress = false;
RDebugUtils.currentLine=52428808;
 //BA.debugLineNum = 52428808;BA.debugLine="Public ActiveDispatchInitiator As String";
_activedispatchinitiator = "";
RDebugUtils.currentLine=52428809;
 //BA.debugLineNum = 52428809;BA.debugLine="End Sub";
return "";
}
public String  _endqueuebackfill(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "endqueuebackfill", false))
	 {return ((String) Debug.delegate(ba, "endqueuebackfill", null));}
RDebugUtils.currentLine=53215232;
 //BA.debugLineNum = 53215232;BA.debugLine="Public Sub EndQueueBackfill";
RDebugUtils.currentLine=53215233;
 //BA.debugLineNum = 53215233;BA.debugLine="IsQueueBackfillInProgress = False";
__ref._isqueuebackfillinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=53215234;
 //BA.debugLineNum = 53215234;BA.debugLine="End Sub";
return "";
}
public String  _exitstoppingstate(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "exitstoppingstate", false))
	 {return ((String) Debug.delegate(ba, "exitstoppingstate", null));}
RDebugUtils.currentLine=53018624;
 //BA.debugLineNum = 53018624;BA.debugLine="Public Sub ExitStoppingState";
RDebugUtils.currentLine=53018625;
 //BA.debugLineNum = 53018625;BA.debugLine="IsStopping = False";
__ref._isstopping /*boolean*/  = __c.False;
RDebugUtils.currentLine=53018626;
 //BA.debugLineNum = 53018626;BA.debugLine="End Sub";
return "";
}
public String  _resettostopped(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "resettostopped", false))
	 {return ((String) Debug.delegate(ba, "resettostopped", null));}
RDebugUtils.currentLine=52559872;
 //BA.debugLineNum = 52559872;BA.debugLine="Public Sub ResetToStopped";
RDebugUtils.currentLine=52559873;
 //BA.debugLineNum = 52559873;BA.debugLine="IsStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=52559874;
 //BA.debugLineNum = 52559874;BA.debugLine="IsStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = __c.True;
RDebugUtils.currentLine=52559875;
 //BA.debugLineNum = 52559875;BA.debugLine="IsStopping = False";
__ref._isstopping /*boolean*/  = __c.False;
RDebugUtils.currentLine=52559876;
 //BA.debugLineNum = 52559876;BA.debugLine="PrefetchDone = False";
__ref._prefetchdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=52559877;
 //BA.debugLineNum = 52559877;BA.debugLine="IsCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = __c.False;
RDebugUtils.currentLine=52559878;
 //BA.debugLineNum = 52559878;BA.debugLine="IsQueueBackfillInProgress = False";
__ref._isqueuebackfillinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=52559879;
 //BA.debugLineNum = 52559879;BA.debugLine="IsPlaybackDispatchInProgress = False";
__ref._isplaybackdispatchinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=52559880;
 //BA.debugLineNum = 52559880;BA.debugLine="ActiveDispatchInitiator = \"\"";
__ref._activedispatchinitiator /*String*/  = "";
RDebugUtils.currentLine=52559881;
 //BA.debugLineNum = 52559881;BA.debugLine="End Sub";
return "";
}
public boolean  _isplaybackactive(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "isplaybackactive", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackactive", null));}
RDebugUtils.currentLine=53084160;
 //BA.debugLineNum = 53084160;BA.debugLine="Public Sub IsPlaybackActive As Boolean";
RDebugUtils.currentLine=53084161;
 //BA.debugLineNum = 53084161;BA.debugLine="Return IsStarted And IsStoppedByUser = False And";
if (true) return __ref._isstarted /*boolean*/  && __ref._isstoppedbyuser /*boolean*/ ==__c.False && __ref._isstopping /*boolean*/ ==__c.False;
RDebugUtils.currentLine=53084162;
 //BA.debugLineNum = 53084162;BA.debugLine="End Sub";
return false;
}
public String  _resettransientflags(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "resettransientflags", false))
	 {return ((String) Debug.delegate(ba, "resettransientflags", null));}
RDebugUtils.currentLine=52625408;
 //BA.debugLineNum = 52625408;BA.debugLine="Public Sub ResetTransientFlags";
RDebugUtils.currentLine=52625409;
 //BA.debugLineNum = 52625409;BA.debugLine="PrefetchDone = False";
__ref._prefetchdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=52625410;
 //BA.debugLineNum = 52625410;BA.debugLine="IsCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = __c.False;
RDebugUtils.currentLine=52625411;
 //BA.debugLineNum = 52625411;BA.debugLine="IsQueueBackfillInProgress = False";
__ref._isqueuebackfillinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=52625412;
 //BA.debugLineNum = 52625412;BA.debugLine="IsPlaybackDispatchInProgress = False";
__ref._isplaybackdispatchinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=52625413;
 //BA.debugLineNum = 52625413;BA.debugLine="ActiveDispatchInitiator = \"\"";
__ref._activedispatchinitiator /*String*/  = "";
RDebugUtils.currentLine=52625414;
 //BA.debugLineNum = 52625414;BA.debugLine="End Sub";
return "";
}
}