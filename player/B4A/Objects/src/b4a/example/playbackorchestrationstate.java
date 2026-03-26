package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playbackorchestrationstate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playbackorchestrationstate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playbackorchestrationstate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
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
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public boolean  _begindispatch(String _initiator) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub BeginDispatch(initiator As String) As B";
 //BA.debugLineNum = 88;BA.debugLine="If IsPlaybackDispatchInProgress Then Return False";
if (_isplaybackdispatchinprogress) { 
if (true) return __c.False;};
 //BA.debugLineNum = 89;BA.debugLine="IsPlaybackDispatchInProgress = True";
_isplaybackdispatchinprogress = __c.True;
 //BA.debugLineNum = 90;BA.debugLine="ActiveDispatchInitiator = initiator";
_activedispatchinitiator = _initiator;
 //BA.debugLineNum = 91;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return false;
}
public boolean  _beginqueuebackfill() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub BeginQueueBackfill As Boolean";
 //BA.debugLineNum = 77;BA.debugLine="If IsQueueBackfillInProgress Then Return False";
if (_isqueuebackfillinprogress) { 
if (true) return __c.False;};
 //BA.debugLineNum = 78;BA.debugLine="IsQueueBackfillInProgress = True";
_isqueuebackfillinprogress = __c.True;
 //BA.debugLineNum = 79;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public IsStarted As Boolean";
_isstarted = false;
 //BA.debugLineNum = 7;BA.debugLine="Public IsStoppedByUser As Boolean";
_isstoppedbyuser = false;
 //BA.debugLineNum = 8;BA.debugLine="Public IsStopping As Boolean";
_isstopping = false;
 //BA.debugLineNum = 9;BA.debugLine="Public PrefetchDone As Boolean";
_prefetchdone = false;
 //BA.debugLineNum = 10;BA.debugLine="Public IsCrossfadeTriggered As Boolean";
_iscrossfadetriggered = false;
 //BA.debugLineNum = 11;BA.debugLine="Public IsQueueBackfillInProgress As Boolean";
_isqueuebackfillinprogress = false;
 //BA.debugLineNum = 12;BA.debugLine="Public IsPlaybackDispatchInProgress As Boolean";
_isplaybackdispatchinprogress = false;
 //BA.debugLineNum = 13;BA.debugLine="Public ActiveDispatchInitiator As String";
_activedispatchinitiator = "";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _cleartracktransitionflags() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub ClearTrackTransitionFlags";
 //BA.debugLineNum = 41;BA.debugLine="PrefetchDone = False";
_prefetchdone = __c.False;
 //BA.debugLineNum = 42;BA.debugLine="IsCrossfadeTriggered = False";
_iscrossfadetriggered = __c.False;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _enddispatch() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub EndDispatch";
 //BA.debugLineNum = 95;BA.debugLine="IsPlaybackDispatchInProgress = False";
_isplaybackdispatchinprogress = __c.False;
 //BA.debugLineNum = 96;BA.debugLine="ActiveDispatchInitiator = \"\"";
_activedispatchinitiator = "";
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _endqueuebackfill() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub EndQueueBackfill";
 //BA.debugLineNum = 83;BA.debugLine="IsQueueBackfillInProgress = False";
_isqueuebackfillinprogress = __c.False;
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _enterinternalstoppingstate() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub EnterInternalStoppingState";
 //BA.debugLineNum = 58;BA.debugLine="IsStopping = True";
_isstopping = __c.True;
 //BA.debugLineNum = 59;BA.debugLine="IsStarted = False";
_isstarted = __c.False;
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _enterpolicypausedstate() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub EnterPolicyPausedState";
 //BA.debugLineNum = 63;BA.debugLine="IsStarted = False";
_isstarted = __c.False;
 //BA.debugLineNum = 64;BA.debugLine="IsStoppedByUser = False";
_isstoppedbyuser = __c.False;
 //BA.debugLineNum = 65;BA.debugLine="IsStopping = False";
_isstopping = __c.False;
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _enterstartedstate() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub EnterStartedState";
 //BA.debugLineNum = 46;BA.debugLine="IsStarted = True";
_isstarted = __c.True;
 //BA.debugLineNum = 47;BA.debugLine="IsStoppedByUser = False";
_isstoppedbyuser = __c.False;
 //BA.debugLineNum = 48;BA.debugLine="IsStopping = False";
_isstopping = __c.False;
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _enteruserstoppedstate() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub EnterUserStoppedState";
 //BA.debugLineNum = 52;BA.debugLine="IsStarted = False";
_isstarted = __c.False;
 //BA.debugLineNum = 53;BA.debugLine="IsStoppedByUser = True";
_isstoppedbyuser = __c.True;
 //BA.debugLineNum = 54;BA.debugLine="IsStopping = False";
_isstopping = __c.False;
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _exitstoppingstate() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub ExitStoppingState";
 //BA.debugLineNum = 69;BA.debugLine="IsStopping = False";
_isstopping = __c.False;
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 17;BA.debugLine="ResetToStopped";
_resettostopped();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public boolean  _isplaybackactive() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub IsPlaybackActive As Boolean";
 //BA.debugLineNum = 73;BA.debugLine="Return IsStarted And IsStoppedByUser = False And";
if (true) return _isstarted && _isstoppedbyuser==__c.False && _isstopping==__c.False;
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return false;
}
public String  _resettostopped() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub ResetToStopped";
 //BA.debugLineNum = 22;BA.debugLine="IsStarted = False";
_isstarted = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="IsStoppedByUser = True";
_isstoppedbyuser = __c.True;
 //BA.debugLineNum = 24;BA.debugLine="IsStopping = False";
_isstopping = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="PrefetchDone = False";
_prefetchdone = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="IsCrossfadeTriggered = False";
_iscrossfadetriggered = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="IsQueueBackfillInProgress = False";
_isqueuebackfillinprogress = __c.False;
 //BA.debugLineNum = 28;BA.debugLine="IsPlaybackDispatchInProgress = False";
_isplaybackdispatchinprogress = __c.False;
 //BA.debugLineNum = 29;BA.debugLine="ActiveDispatchInitiator = \"\"";
_activedispatchinitiator = "";
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _resettransientflags() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub ResetTransientFlags";
 //BA.debugLineNum = 33;BA.debugLine="PrefetchDone = False";
_prefetchdone = __c.False;
 //BA.debugLineNum = 34;BA.debugLine="IsCrossfadeTriggered = False";
_iscrossfadetriggered = __c.False;
 //BA.debugLineNum = 35;BA.debugLine="IsQueueBackfillInProgress = False";
_isqueuebackfillinprogress = __c.False;
 //BA.debugLineNum = 36;BA.debugLine="IsPlaybackDispatchInProgress = False";
_isplaybackdispatchinprogress = __c.False;
 //BA.debugLineNum = 37;BA.debugLine="ActiveDispatchInitiator = \"\"";
_activedispatchinitiator = "";
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
