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
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _cleartracktransitionflags(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "cleartracktransitionflags", false))
	 {return ((String) Debug.delegate(ba, "cleartracktransitionflags", null));}
RDebugUtils.currentLine=46333952;
 //BA.debugLineNum = 46333952;BA.debugLine="Public Sub ClearTrackTransitionFlags";
RDebugUtils.currentLine=46333953;
 //BA.debugLineNum = 46333953;BA.debugLine="PrefetchDone = False";
__ref._prefetchdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=46333954;
 //BA.debugLineNum = 46333954;BA.debugLine="IsCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = __c.False;
RDebugUtils.currentLine=46333955;
 //BA.debugLineNum = 46333955;BA.debugLine="End Sub";
return "";
}
public String  _enterstartedstate(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "enterstartedstate", false))
	 {return ((String) Debug.delegate(ba, "enterstartedstate", null));}
RDebugUtils.currentLine=46399488;
 //BA.debugLineNum = 46399488;BA.debugLine="Public Sub EnterStartedState";
RDebugUtils.currentLine=46399489;
 //BA.debugLineNum = 46399489;BA.debugLine="IsStarted = True";
__ref._isstarted /*boolean*/  = __c.True;
RDebugUtils.currentLine=46399490;
 //BA.debugLineNum = 46399490;BA.debugLine="IsStoppedByUser = False";
__ref._isstoppedbyuser /*boolean*/  = __c.False;
RDebugUtils.currentLine=46399491;
 //BA.debugLineNum = 46399491;BA.debugLine="IsStopping = False";
__ref._isstopping /*boolean*/  = __c.False;
RDebugUtils.currentLine=46399492;
 //BA.debugLineNum = 46399492;BA.debugLine="End Sub";
return "";
}
public boolean  _beginqueuebackfill(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "beginqueuebackfill", false))
	 {return ((Boolean) Debug.delegate(ba, "beginqueuebackfill", null));}
RDebugUtils.currentLine=46792704;
 //BA.debugLineNum = 46792704;BA.debugLine="Public Sub BeginQueueBackfill As Boolean";
RDebugUtils.currentLine=46792705;
 //BA.debugLineNum = 46792705;BA.debugLine="If IsQueueBackfillInProgress Then Return False";
if (__ref._isqueuebackfillinprogress /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=46792706;
 //BA.debugLineNum = 46792706;BA.debugLine="IsQueueBackfillInProgress = True";
__ref._isqueuebackfillinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=46792707;
 //BA.debugLineNum = 46792707;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=46792708;
 //BA.debugLineNum = 46792708;BA.debugLine="End Sub";
return false;
}
public String  _endqueuebackfill(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "endqueuebackfill", false))
	 {return ((String) Debug.delegate(ba, "endqueuebackfill", null));}
RDebugUtils.currentLine=46858240;
 //BA.debugLineNum = 46858240;BA.debugLine="Public Sub EndQueueBackfill";
RDebugUtils.currentLine=46858241;
 //BA.debugLineNum = 46858241;BA.debugLine="IsQueueBackfillInProgress = False";
__ref._isqueuebackfillinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=46858242;
 //BA.debugLineNum = 46858242;BA.debugLine="End Sub";
return "";
}
public String  _enddispatch(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "enddispatch", false))
	 {return ((String) Debug.delegate(ba, "enddispatch", null));}
RDebugUtils.currentLine=46989312;
 //BA.debugLineNum = 46989312;BA.debugLine="Public Sub EndDispatch";
RDebugUtils.currentLine=46989313;
 //BA.debugLineNum = 46989313;BA.debugLine="IsPlaybackDispatchInProgress = False";
__ref._isplaybackdispatchinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=46989314;
 //BA.debugLineNum = 46989314;BA.debugLine="ActiveDispatchInitiator = \"\"";
__ref._activedispatchinitiator /*String*/  = "";
RDebugUtils.currentLine=46989315;
 //BA.debugLineNum = 46989315;BA.debugLine="End Sub";
return "";
}
public String  _enterpolicypausedstate(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "enterpolicypausedstate", false))
	 {return ((String) Debug.delegate(ba, "enterpolicypausedstate", null));}
RDebugUtils.currentLine=46596096;
 //BA.debugLineNum = 46596096;BA.debugLine="Public Sub EnterPolicyPausedState";
RDebugUtils.currentLine=46596097;
 //BA.debugLineNum = 46596097;BA.debugLine="IsStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=46596098;
 //BA.debugLineNum = 46596098;BA.debugLine="IsStoppedByUser = False";
__ref._isstoppedbyuser /*boolean*/  = __c.False;
RDebugUtils.currentLine=46596099;
 //BA.debugLineNum = 46596099;BA.debugLine="IsStopping = False";
__ref._isstopping /*boolean*/  = __c.False;
RDebugUtils.currentLine=46596100;
 //BA.debugLineNum = 46596100;BA.debugLine="End Sub";
return "";
}
public String  _enterinternalstoppingstate(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "enterinternalstoppingstate", false))
	 {return ((String) Debug.delegate(ba, "enterinternalstoppingstate", null));}
RDebugUtils.currentLine=46530560;
 //BA.debugLineNum = 46530560;BA.debugLine="Public Sub EnterInternalStoppingState";
RDebugUtils.currentLine=46530561;
 //BA.debugLineNum = 46530561;BA.debugLine="IsStopping = True";
__ref._isstopping /*boolean*/  = __c.True;
RDebugUtils.currentLine=46530562;
 //BA.debugLineNum = 46530562;BA.debugLine="IsStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=46530563;
 //BA.debugLineNum = 46530563;BA.debugLine="End Sub";
return "";
}
public String  _enteruserstoppedstate(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "enteruserstoppedstate", false))
	 {return ((String) Debug.delegate(ba, "enteruserstoppedstate", null));}
RDebugUtils.currentLine=46465024;
 //BA.debugLineNum = 46465024;BA.debugLine="Public Sub EnterUserStoppedState";
RDebugUtils.currentLine=46465025;
 //BA.debugLineNum = 46465025;BA.debugLine="IsStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=46465026;
 //BA.debugLineNum = 46465026;BA.debugLine="IsStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = __c.True;
RDebugUtils.currentLine=46465027;
 //BA.debugLineNum = 46465027;BA.debugLine="IsStopping = False";
__ref._isstopping /*boolean*/  = __c.False;
RDebugUtils.currentLine=46465028;
 //BA.debugLineNum = 46465028;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackorchestrationstate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=46137344;
 //BA.debugLineNum = 46137344;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=46137345;
 //BA.debugLineNum = 46137345;BA.debugLine="ResetToStopped";
__ref._resettostopped /*String*/ (null);
RDebugUtils.currentLine=46137346;
 //BA.debugLineNum = 46137346;BA.debugLine="End Sub";
return "";
}
public boolean  _begindispatch(b4j.example.playbackorchestrationstate __ref,String _initiator) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "begindispatch", false))
	 {return ((Boolean) Debug.delegate(ba, "begindispatch", new Object[] {_initiator}));}
RDebugUtils.currentLine=46923776;
 //BA.debugLineNum = 46923776;BA.debugLine="Public Sub BeginDispatch(initiator As String) As B";
RDebugUtils.currentLine=46923777;
 //BA.debugLineNum = 46923777;BA.debugLine="If IsPlaybackDispatchInProgress Then Return False";
if (__ref._isplaybackdispatchinprogress /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=46923778;
 //BA.debugLineNum = 46923778;BA.debugLine="IsPlaybackDispatchInProgress = True";
__ref._isplaybackdispatchinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=46923779;
 //BA.debugLineNum = 46923779;BA.debugLine="ActiveDispatchInitiator = initiator";
__ref._activedispatchinitiator /*String*/  = _initiator;
RDebugUtils.currentLine=46923780;
 //BA.debugLineNum = 46923780;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=46923781;
 //BA.debugLineNum = 46923781;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
RDebugUtils.currentLine=46071808;
 //BA.debugLineNum = 46071808;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=46071809;
 //BA.debugLineNum = 46071809;BA.debugLine="Public IsStarted As Boolean";
_isstarted = false;
RDebugUtils.currentLine=46071810;
 //BA.debugLineNum = 46071810;BA.debugLine="Public IsStoppedByUser As Boolean";
_isstoppedbyuser = false;
RDebugUtils.currentLine=46071811;
 //BA.debugLineNum = 46071811;BA.debugLine="Public IsStopping As Boolean";
_isstopping = false;
RDebugUtils.currentLine=46071812;
 //BA.debugLineNum = 46071812;BA.debugLine="Public PrefetchDone As Boolean";
_prefetchdone = false;
RDebugUtils.currentLine=46071813;
 //BA.debugLineNum = 46071813;BA.debugLine="Public IsCrossfadeTriggered As Boolean";
_iscrossfadetriggered = false;
RDebugUtils.currentLine=46071814;
 //BA.debugLineNum = 46071814;BA.debugLine="Public IsQueueBackfillInProgress As Boolean";
_isqueuebackfillinprogress = false;
RDebugUtils.currentLine=46071815;
 //BA.debugLineNum = 46071815;BA.debugLine="Public IsPlaybackDispatchInProgress As Boolean";
_isplaybackdispatchinprogress = false;
RDebugUtils.currentLine=46071816;
 //BA.debugLineNum = 46071816;BA.debugLine="Public ActiveDispatchInitiator As String";
_activedispatchinitiator = "";
RDebugUtils.currentLine=46071817;
 //BA.debugLineNum = 46071817;BA.debugLine="End Sub";
return "";
}
public String  _exitstoppingstate(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "exitstoppingstate", false))
	 {return ((String) Debug.delegate(ba, "exitstoppingstate", null));}
RDebugUtils.currentLine=46661632;
 //BA.debugLineNum = 46661632;BA.debugLine="Public Sub ExitStoppingState";
RDebugUtils.currentLine=46661633;
 //BA.debugLineNum = 46661633;BA.debugLine="IsStopping = False";
__ref._isstopping /*boolean*/  = __c.False;
RDebugUtils.currentLine=46661634;
 //BA.debugLineNum = 46661634;BA.debugLine="End Sub";
return "";
}
public String  _resettostopped(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "resettostopped", false))
	 {return ((String) Debug.delegate(ba, "resettostopped", null));}
RDebugUtils.currentLine=46202880;
 //BA.debugLineNum = 46202880;BA.debugLine="Public Sub ResetToStopped";
RDebugUtils.currentLine=46202881;
 //BA.debugLineNum = 46202881;BA.debugLine="IsStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=46202882;
 //BA.debugLineNum = 46202882;BA.debugLine="IsStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = __c.True;
RDebugUtils.currentLine=46202883;
 //BA.debugLineNum = 46202883;BA.debugLine="IsStopping = False";
__ref._isstopping /*boolean*/  = __c.False;
RDebugUtils.currentLine=46202884;
 //BA.debugLineNum = 46202884;BA.debugLine="PrefetchDone = False";
__ref._prefetchdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=46202885;
 //BA.debugLineNum = 46202885;BA.debugLine="IsCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = __c.False;
RDebugUtils.currentLine=46202886;
 //BA.debugLineNum = 46202886;BA.debugLine="IsQueueBackfillInProgress = False";
__ref._isqueuebackfillinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=46202887;
 //BA.debugLineNum = 46202887;BA.debugLine="IsPlaybackDispatchInProgress = False";
__ref._isplaybackdispatchinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=46202888;
 //BA.debugLineNum = 46202888;BA.debugLine="ActiveDispatchInitiator = \"\"";
__ref._activedispatchinitiator /*String*/  = "";
RDebugUtils.currentLine=46202889;
 //BA.debugLineNum = 46202889;BA.debugLine="End Sub";
return "";
}
public boolean  _isplaybackactive(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "isplaybackactive", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackactive", null));}
RDebugUtils.currentLine=46727168;
 //BA.debugLineNum = 46727168;BA.debugLine="Public Sub IsPlaybackActive As Boolean";
RDebugUtils.currentLine=46727169;
 //BA.debugLineNum = 46727169;BA.debugLine="Return IsStarted And IsStoppedByUser = False And";
if (true) return __ref._isstarted /*boolean*/  && __ref._isstoppedbyuser /*boolean*/ ==__c.False && __ref._isstopping /*boolean*/ ==__c.False;
RDebugUtils.currentLine=46727170;
 //BA.debugLineNum = 46727170;BA.debugLine="End Sub";
return false;
}
public String  _resettransientflags(b4j.example.playbackorchestrationstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackorchestrationstate";
if (Debug.shouldDelegate(ba, "resettransientflags", false))
	 {return ((String) Debug.delegate(ba, "resettransientflags", null));}
RDebugUtils.currentLine=46268416;
 //BA.debugLineNum = 46268416;BA.debugLine="Public Sub ResetTransientFlags";
RDebugUtils.currentLine=46268417;
 //BA.debugLineNum = 46268417;BA.debugLine="PrefetchDone = False";
__ref._prefetchdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=46268418;
 //BA.debugLineNum = 46268418;BA.debugLine="IsCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = __c.False;
RDebugUtils.currentLine=46268419;
 //BA.debugLineNum = 46268419;BA.debugLine="IsQueueBackfillInProgress = False";
__ref._isqueuebackfillinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=46268420;
 //BA.debugLineNum = 46268420;BA.debugLine="IsPlaybackDispatchInProgress = False";
__ref._isplaybackdispatchinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=46268421;
 //BA.debugLineNum = 46268421;BA.debugLine="ActiveDispatchInitiator = \"\"";
__ref._activedispatchinitiator /*String*/  = "";
RDebugUtils.currentLine=46268422;
 //BA.debugLineNum = 46268422;BA.debugLine="End Sub";
return "";
}
}