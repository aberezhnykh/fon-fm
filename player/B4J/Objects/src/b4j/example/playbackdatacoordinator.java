package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbackdatacoordinator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbackdatacoordinator", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbackdatacoordinator.class).invoke(this, new Object[] {null});
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
public b4j.example.playerstatestore _statestore = null;
public b4j.example.networksyncservice _syncservice = null;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public boolean  _allowregularadsattargetminute(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _targetminutetimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "allowregularadsattargetminute", false))
	 {return ((Boolean) Debug.delegate(ba, "allowregularadsattargetminute", new Object[] {_offlinedata,_targetminutetimestamp}));}
long _targetticks = 0L;
anywheresoftware.b4a.objects.collections.Map _targetslot = null;
RDebugUtils.currentLine=74317824;
 //BA.debugLineNum = 74317824;BA.debugLine="Public Sub AllowRegularAdsAtTargetMinute(offlineDa";
RDebugUtils.currentLine=74317825;
 //BA.debugLineNum = 74317825;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=74317826;
 //BA.debugLineNum = 74317826;BA.debugLine="Dim targetTicks As Long = targetMinuteTimestamp *";
_targetticks = (long) (_targetminutetimestamp*1000);
RDebugUtils.currentLine=74317827;
 //BA.debugLineNum = 74317827;BA.debugLine="Dim targetSlot As Map = stateStore.ResolveDataSlo";
_targetslot = new anywheresoftware.b4a.objects.collections.Map();
_targetslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_targetticks);
RDebugUtils.currentLine=74317828;
 //BA.debugLineNum = 74317828;BA.debugLine="Return IsIdleSlot(targetSlot) = False";
if (true) return __ref._isidleslot /*boolean*/ (null,_targetslot)==__c.False;
RDebugUtils.currentLine=74317829;
 //BA.debugLineNum = 74317829;BA.debugLine="End Sub";
return false;
}
public String  _resolveidleuntilmessage(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _effectivenowticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "resolveidleuntilmessage", false))
	 {return ((String) Debug.delegate(ba, "resolveidleuntilmessage", new Object[] {_offlinedata,_effectivenowticks}));}
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.Map _nextslot = null;
String _nexttime = "";
RDebugUtils.currentLine=74252288;
 //BA.debugLineNum = 74252288;BA.debugLine="Public Sub ResolveIdleUntilMessage(offlineData As";
RDebugUtils.currentLine=74252289;
 //BA.debugLineNum = 74252289;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=74252290;
 //BA.debugLineNum = 74252290;BA.debugLine="Dim currentSlot As Map = stateStore.ResolveCurren";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvecurrentdataslot /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata);
RDebugUtils.currentLine=74252291;
 //BA.debugLineNum = 74252291;BA.debugLine="If IsIdleSlot(currentSlot) = False Then Return \"\"";
if (__ref._isidleslot /*boolean*/ (null,_currentslot)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=74252292;
 //BA.debugLineNum = 74252292;BA.debugLine="Dim nextSlot As Map = stateStore.ResolveNextDataS";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
_nextslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_effectivenowticks);
RDebugUtils.currentLine=74252293;
 //BA.debugLineNum = 74252293;BA.debugLine="Dim nextTime As String = nextSlot.GetDefault(\"slo";
_nexttime = BA.ObjectToString(_nextslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=74252294;
 //BA.debugLineNum = 74252294;BA.debugLine="If nextTime = \"\" Then Return stateStore.MessageVa";
if ((_nexttime).equals("")) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"idle");};
RDebugUtils.currentLine=74252295;
 //BA.debugLineNum = 74252295;BA.debugLine="Return stateStore.MessageValue(\"idle_until\").Repl";
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"idle_until").replace("{time}",_nexttime);
RDebugUtils.currentLine=74252296;
 //BA.debugLineNum = 74252296;BA.debugLine="End Sub";
return "";
}
public String  _pauseplaybackbypolicy(b4j.example.playbackdatacoordinator __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "pauseplaybackbypolicy", false))
	 {return ((String) Debug.delegate(ba, "pauseplaybackbypolicy", new Object[] {_reason,_connectionmode}));}
String _safereason = "";
RDebugUtils.currentLine=73793536;
 //BA.debugLineNum = 73793536;BA.debugLine="Public Sub PausePlaybackByPolicy(reason As String,";
RDebugUtils.currentLine=73793537;
 //BA.debugLineNum = 73793537;BA.debugLine="Dim safeReason As String = reason";
_safereason = _reason;
RDebugUtils.currentLine=73793538;
 //BA.debugLineNum = 73793538;BA.debugLine="If safeReason = \"\" Then safeReason = stateStore.M";
if ((_safereason).equals("")) { 
_safereason = __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");};
RDebugUtils.currentLine=73793539;
 //BA.debugLineNum = 73793539;BA.debugLine="stateStore.EnterPolicyPause(safeReason, connectio";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterpolicypause /*String*/ (null,_safereason,_connectionmode);
RDebugUtils.currentLine=73793540;
 //BA.debugLineNum = 73793540;BA.debugLine="End Sub";
return "";
}
public String  _handleblockedstate(b4j.example.playbackdatacoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "handleblockedstate", false))
	 {return ((String) Debug.delegate(ba, "handleblockedstate", null));}
RDebugUtils.currentLine=71041024;
 //BA.debugLineNum = 71041024;BA.debugLine="Public Sub HandleBlockedState";
RDebugUtils.currentLine=71041025;
 //BA.debugLineNum = 71041025;BA.debugLine="stateStore.TraceLog(\"состояние blocked\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние blocked");
RDebugUtils.currentLine=71041026;
 //BA.debugLineNum = 71041026;BA.debugLine="stateStore.EnterPolicyPause(stateStore.MessageVal";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterpolicypause /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"blocked"),"blocked");
RDebugUtils.currentLine=71041027;
 //BA.debugLineNum = 71041027;BA.debugLine="stateStore.ScheduleRetry(\"blocked\", 0)";
__ref._statestore /*b4j.example.playerstatestore*/ ._scheduleretry /*String*/ (null,"blocked",(int) (0));
RDebugUtils.currentLine=71041028;
 //BA.debugLineNum = 71041028;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _handlefetchfailure(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _result) throws Exception{
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "handlefetchfailure", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "handlefetchfailure", new Object[] {_result}));}
ResumableSub_HandleFetchFailure rsub = new ResumableSub_HandleFetchFailure(this,__ref,_result);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandleFetchFailure extends BA.ResumableSub {
public ResumableSub_HandleFetchFailure(b4j.example.playbackdatacoordinator parent,b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _result) {
this.parent = parent;
this.__ref = __ref;
this._result = _result;
this.__ref = parent;
}
b4j.example.playbackdatacoordinator __ref;
b4j.example.playbackdatacoordinator parent;
anywheresoftware.b4a.objects.collections.Map _result;
boolean _serviceavailable = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackdatacoordinator";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=72548353;
 //BA.debugLineNum = 72548353;BA.debugLine="stateStore.TraceLog(\"очередь fetch ошибка kind=\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"очередь fetch ошибка kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+" message="+BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)(""))));
RDebugUtils.currentLine=72548354;
 //BA.debugLineNum = 72548354;BA.debugLine="If result.GetDefault(\"Kind\", \"\") = \"offline\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_result.GetDefault((Object)("Kind"),(Object)(""))).equals((Object)("offline"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=72548355;
 //BA.debugLineNum = 72548355;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=72548356;
 //BA.debugLineNum = 72548356;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=72548358;
 //BA.debugLineNum = 72548358;BA.debugLine="If stateStore.HasLocalPlaybackFallback Then";

case 4:
//if
this.state = 7;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._haslocalplaybackfallback /*boolean*/ (null)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=72548359;
 //BA.debugLineNum = 72548359;BA.debugLine="stateStore.TraceLog(\"fallback выбор mode=local r";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback выбор mode=local reason=data_fetch_error");
RDebugUtils.currentLine=72548360;
 //BA.debugLineNum = 72548360;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=72548361;
 //BA.debugLineNum = 72548361;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=72548363;
 //BA.debugLineNum = 72548363;BA.debugLine="Wait For (syncService.CheckServiceAvailability(25";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackdatacoordinator", "handlefetchfailure"), __ref._syncservice /*b4j.example.networksyncservice*/ ._checkserviceavailability /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (2500)));
this.state = 14;
return;
case 14:
//C
this.state = 8;
_serviceavailable = (boolean) result[1];
;
RDebugUtils.currentLine=72548364;
 //BA.debugLineNum = 72548364;BA.debugLine="If serviceAvailable Then";
if (true) break;

case 8:
//if
this.state = 13;
if (_serviceavailable) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=72548365;
 //BA.debugLineNum = 72548365;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=72548367;
 //BA.debugLineNum = 72548367;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
 if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=72548369;
 //BA.debugLineNum = 72548369;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=72548370;
 //BA.debugLineNum = 72548370;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handlelocaltemporarystate(b4j.example.playbackdatacoordinator __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "handlelocaltemporarystate", false))
	 {return ((String) Debug.delegate(ba, "handlelocaltemporarystate", new Object[] {_text}));}
boolean _fallbackready = false;
RDebugUtils.currentLine=71237632;
 //BA.debugLineNum = 71237632;BA.debugLine="Public Sub HandleLocalTemporaryState(text As Strin";
RDebugUtils.currentLine=71237633;
 //BA.debugLineNum = 71237633;BA.debugLine="Dim fallbackReady As Boolean = stateStore.HasLoca";
_fallbackready = __ref._statestore /*b4j.example.playerstatestore*/ ._haslocalplaybackfallback /*boolean*/ (null);
RDebugUtils.currentLine=71237634;
 //BA.debugLineNum = 71237634;BA.debugLine="stateStore.TraceLog(\"состояние temporary mode=off";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние temporary mode=offline playableFallback="+BA.ObjectToString(_fallbackready)+" text="+_text);
RDebugUtils.currentLine=71237635;
 //BA.debugLineNum = 71237635;BA.debugLine="If fallbackReady Then stateStore.TraceLog(\"fallba";
if (_fallbackready) { 
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback выбор mode=temporary_local reason=playable_local_fallback");};
RDebugUtils.currentLine=71237636;
 //BA.debugLineNum = 71237636;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"temporar";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","temporary_local_state");
RDebugUtils.currentLine=71237637;
 //BA.debugLineNum = 71237637;BA.debugLine="stateStore.SetLocalFallbackReady(fallbackReady)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlocalfallbackready /*String*/ (null,_fallbackready);
RDebugUtils.currentLine=71237638;
 //BA.debugLineNum = 71237638;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=71237639;
 //BA.debugLineNum = 71237639;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=71237640;
 //BA.debugLineNum = 71237640;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=71237641;
 //BA.debugLineNum = 71237641;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=71237642;
 //BA.debugLineNum = 71237642;BA.debugLine="stateStore.ShowMessage(text)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_text);
 }else {
RDebugUtils.currentLine=71237644;
 //BA.debugLineNum = 71237644;BA.debugLine="stateStore.ShowMessage(stateStore.MessageValue(\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"offline"));
 };
RDebugUtils.currentLine=71237646;
 //BA.debugLineNum = 71237646;BA.debugLine="stateStore.ScheduleRetry(\"offline\", 0)";
__ref._statestore /*b4j.example.playerstatestore*/ ._scheduleretry /*String*/ (null,"offline",(int) (0));
RDebugUtils.currentLine=71237647;
 //BA.debugLineNum = 71237647;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _handlemediaerror(b4j.example.playbackdatacoordinator __ref) throws Exception{
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "handlemediaerror", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "handlemediaerror", null));}
ResumableSub_HandleMediaError rsub = new ResumableSub_HandleMediaError(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandleMediaError extends BA.ResumableSub {
public ResumableSub_HandleMediaError(b4j.example.playbackdatacoordinator parent,b4j.example.playbackdatacoordinator __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.playbackdatacoordinator __ref;
b4j.example.playbackdatacoordinator parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackdatacoordinator";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=73728001;
 //BA.debugLineNum = 73728001;BA.debugLine="stateStore.SetPlaybackFlowState(\"error\", \"media_e";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"error","media_error");
RDebugUtils.currentLine=73728002;
 //BA.debugLineNum = 73728002;BA.debugLine="If stateStore.HasLocalPlaybackFallback Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._haslocalplaybackfallback /*boolean*/ (null)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=73728003;
 //BA.debugLineNum = 73728003;BA.debugLine="stateStore.TraceLog(\"fallback выбор mode=local r";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback выбор mode=local reason=media_error");
RDebugUtils.currentLine=73728004;
 //BA.debugLineNum = 73728004;BA.debugLine="SwitchToLocalPlayback(True, \"media_failure\")";
__ref._switchtolocalplayback /*String*/ (null,parent.__c.True,"media_failure");
RDebugUtils.currentLine=73728005;
 //BA.debugLineNum = 73728005;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=73728007;
 //BA.debugLineNum = 73728007;BA.debugLine="HandleLocalTemporaryState(\"Нужен интернет\")";
__ref._handlelocaltemporarystate /*String*/ (null,"Нужен интернет");
RDebugUtils.currentLine=73728008;
 //BA.debugLineNum = 73728008;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=73728009;
 //BA.debugLineNum = 73728009;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handleshutdownmessage(b4j.example.playbackdatacoordinator __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "handleshutdownmessage", false))
	 {return ((String) Debug.delegate(ba, "handleshutdownmessage", new Object[] {_text}));}
String _safetext = "";
RDebugUtils.currentLine=71303168;
 //BA.debugLineNum = 71303168;BA.debugLine="Public Sub HandleShutdownMessage(text As String)";
RDebugUtils.currentLine=71303169;
 //BA.debugLineNum = 71303169;BA.debugLine="Dim safeText As String = text";
_safetext = _text;
RDebugUtils.currentLine=71303170;
 //BA.debugLineNum = 71303170;BA.debugLine="If safeText = \"\" Then safeText = stateStore.Messa";
if ((_safetext).equals("")) { 
_safetext = __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"server_wait");};
RDebugUtils.currentLine=71303171;
 //BA.debugLineNum = 71303171;BA.debugLine="stateStore.TraceLog(\"message shutdown text=\" & sa";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"message shutdown text="+_safetext);
RDebugUtils.currentLine=71303172;
 //BA.debugLineNum = 71303172;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"shutdown";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","shutdown");
RDebugUtils.currentLine=71303173;
 //BA.debugLineNum = 71303173;BA.debugLine="stateStore.ClearPolicyPauseAndResumeRequest";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=71303174;
 //BA.debugLineNum = 71303174;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=71303175;
 //BA.debugLineNum = 71303175;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=71303176;
 //BA.debugLineNum = 71303176;BA.debugLine="stateStore.EnterUserStoppedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=71303177;
 //BA.debugLineNum = 71303177;BA.debugLine="stateStore.SetPlayIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplayicon /*String*/ (null);
RDebugUtils.currentLine=71303178;
 //BA.debugLineNum = 71303178;BA.debugLine="stateStore.ShowMessage(safeText)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_safetext);
RDebugUtils.currentLine=71303179;
 //BA.debugLineNum = 71303179;BA.debugLine="stateStore.DisableBackgroundRefreshTimers";
__ref._statestore /*b4j.example.playerstatestore*/ ._disablebackgroundrefreshtimers /*String*/ (null);
RDebugUtils.currentLine=71303180;
 //BA.debugLineNum = 71303180;BA.debugLine="End Sub";
return "";
}
public String  _handletemporarystate(b4j.example.playbackdatacoordinator __ref,String _mode,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "handletemporarystate", false))
	 {return ((String) Debug.delegate(ba, "handletemporarystate", new Object[] {_mode,_text}));}
RDebugUtils.currentLine=70975488;
 //BA.debugLineNum = 70975488;BA.debugLine="Public Sub HandleTemporaryState(mode As String, te";
RDebugUtils.currentLine=70975489;
 //BA.debugLineNum = 70975489;BA.debugLine="stateStore.TraceLog(\"состояние temporary mode=\" &";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние temporary mode="+_mode+" text="+_text);
RDebugUtils.currentLine=70975490;
 //BA.debugLineNum = 70975490;BA.debugLine="stateStore.ApplyTemporaryMode(mode)";
__ref._statestore /*b4j.example.playerstatestore*/ ._applytemporarymode /*String*/ (null,_mode);
RDebugUtils.currentLine=70975491;
 //BA.debugLineNum = 70975491;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=70975492;
 //BA.debugLineNum = 70975492;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=70975493;
 //BA.debugLineNum = 70975493;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=70975494;
 //BA.debugLineNum = 70975494;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=70975495;
 //BA.debugLineNum = 70975495;BA.debugLine="stateStore.ShowMessage(text)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_text);
 }else 
{RDebugUtils.currentLine=70975496;
 //BA.debugLineNum = 70975496;BA.debugLine="Else If mode = \"offline\" Then";
if ((_mode).equals("offline")) { 
RDebugUtils.currentLine=70975497;
 //BA.debugLineNum = 70975497;BA.debugLine="stateStore.ShowMessage(stateStore.MessageValue(\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"offline"));
 }else {
RDebugUtils.currentLine=70975499;
 //BA.debugLineNum = 70975499;BA.debugLine="stateStore.ShowMessage(stateStore.MessageValue(\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"server_wait"));
 }}
;
RDebugUtils.currentLine=70975501;
 //BA.debugLineNum = 70975501;BA.debugLine="stateStore.ScheduleRetry(mode, 0)";
__ref._statestore /*b4j.example.playerstatestore*/ ._scheduleretry /*String*/ (null,_mode,(int) (0));
RDebugUtils.currentLine=70975502;
 //BA.debugLineNum = 70975502;BA.debugLine="End Sub";
return "";
}
public boolean  _hasplayablelocaltrackincurrentslot(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _effectivenowticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "hasplayablelocaltrackincurrentslot", false))
	 {return ((Boolean) Debug.delegate(ba, "hasplayablelocaltrackincurrentslot", new Object[] {_offlinedata,_effectivenowticks}));}
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
RDebugUtils.currentLine=74186752;
 //BA.debugLineNum = 74186752;BA.debugLine="Public Sub HasPlayableLocalTrackInCurrentSlot(offl";
RDebugUtils.currentLine=74186753;
 //BA.debugLineNum = 74186753;BA.debugLine="Dim currentSlot As Map = stateStore.ResolveDataSl";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_effectivenowticks);
RDebugUtils.currentLine=74186754;
 //BA.debugLineNum = 74186754;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=74186755;
 //BA.debugLineNum = 74186755;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=74186756;
 //BA.debugLineNum = 74186756;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=74186757;
 //BA.debugLineNum = 74186757;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group5 = _playlists;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_playlistobject = group5.Get(index5);
RDebugUtils.currentLine=74186758;
 //BA.debugLineNum = 74186758;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=74186759;
 //BA.debugLineNum = 74186759;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=74186760;
 //BA.debugLineNum = 74186760;BA.debugLine="Dim playlistId As String = playlistDescriptor.G";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=74186761;
 //BA.debugLineNum = 74186761;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=74186762;
 //BA.debugLineNum = 74186762;BA.debugLine="Dim playlistData As Map = stateStore.LoadCached";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = __ref._statestore /*b4j.example.playerstatestore*/ ._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=74186763;
 //BA.debugLineNum = 74186763;BA.debugLine="If PlaylistHasCachedTrack(playlistData) Then Re";
if (__ref._playlisthascachedtrack /*boolean*/ (null,_playlistdata)) { 
if (true) return __c.True;};
 };
 }
};
RDebugUtils.currentLine=74186766;
 //BA.debugLineNum = 74186766;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=74186767;
 //BA.debugLineNum = 74186767;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.BA _ba,b4j.example.playerstatestore _store,b4j.example.networksyncservice _syncworker) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_store,_syncworker}));}
RDebugUtils.currentLine=70189056;
 //BA.debugLineNum = 70189056;BA.debugLine="Public Sub Initialize(store As PlayerStateStore, s";
RDebugUtils.currentLine=70189057;
 //BA.debugLineNum = 70189057;BA.debugLine="stateStore = store";
__ref._statestore /*b4j.example.playerstatestore*/  = _store;
RDebugUtils.currentLine=70189058;
 //BA.debugLineNum = 70189058;BA.debugLine="syncService = syncWorker";
__ref._syncservice /*b4j.example.networksyncservice*/  = _syncworker;
RDebugUtils.currentLine=70189059;
 //BA.debugLineNum = 70189059;BA.debugLine="End Sub";
return "";
}
public boolean  _isplaybackallowed(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data,long _effectivenowticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "isplaybackallowed", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackallowed", new Object[] {_data,_effectivenowticks}));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
long _endtimestamp = 0L;
RDebugUtils.currentLine=70254592;
 //BA.debugLineNum = 70254592;BA.debugLine="Public Sub IsPlaybackAllowed(data As Map, effectiv";
RDebugUtils.currentLine=70254593;
 //BA.debugLineNum = 70254593;BA.debugLine="If data.IsInitialized = False Then Return True";
if (_data.IsInitialized()==__c.False) { 
if (true) return __c.True;};
RDebugUtils.currentLine=70254594;
 //BA.debugLineNum = 70254594;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=70254595;
 //BA.debugLineNum = 70254595;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
if (_playerdata.IsInitialized() && _playerdata.ContainsKey((Object)("playback_allowed"))) { 
RDebugUtils.currentLine=70254596;
 //BA.debugLineNum = 70254596;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
if ((_playerdata.GetDefault((Object)("playback_allowed"),(Object)(__c.True))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
 };
RDebugUtils.currentLine=70254598;
 //BA.debugLineNum = 70254598;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
_endtimestamp = __ref._resolveplaybackendtimestamp /*long*/ (null,_data);
RDebugUtils.currentLine=70254599;
 //BA.debugLineNum = 70254599;BA.debugLine="If endTimestamp <= 0 Then Return True";
if (_endtimestamp<=0) { 
if (true) return __c.True;};
RDebugUtils.currentLine=70254600;
 //BA.debugLineNum = 70254600;BA.debugLine="Return effectiveNowTicks < (endTimestamp * 1000)";
if (true) return _effectivenowticks<(_endtimestamp*1000);
RDebugUtils.currentLine=70254601;
 //BA.debugLineNum = 70254601;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _refreshofflinedatanow(b4j.example.playbackdatacoordinator __ref,int _fetchtimeoutms) throws Exception{
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "refreshofflinedatanow", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "refreshofflinedatanow", new Object[] {_fetchtimeoutms}));}
ResumableSub_RefreshOfflineDataNow rsub = new ResumableSub_RefreshOfflineDataNow(this,__ref,_fetchtimeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RefreshOfflineDataNow extends BA.ResumableSub {
public ResumableSub_RefreshOfflineDataNow(b4j.example.playbackdatacoordinator parent,b4j.example.playbackdatacoordinator __ref,int _fetchtimeoutms) {
this.parent = parent;
this.__ref = __ref;
this._fetchtimeoutms = _fetchtimeoutms;
this.__ref = parent;
}
b4j.example.playbackdatacoordinator __ref;
b4j.example.playbackdatacoordinator parent;
int _fetchtimeoutms;
anywheresoftware.b4a.objects.collections.Map _result = null;
Object _resultdata = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackdatacoordinator";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=76939265;
 //BA.debugLineNum = 76939265;BA.debugLine="If stateStore.PlayerCodeValue = \"\" Then Return Fa";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null)).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=76939266;
 //BA.debugLineNum = 76939266;BA.debugLine="If stateStore.BeginOfflineDataRefresh = False The";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._beginofflinedatarefresh /*boolean*/ (null)==parent.__c.False) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=76939267;
 //BA.debugLineNum = 76939267;BA.debugLine="stateStore.TraceInfo(\"network\", \"запрос данных\",";
__ref._statestore /*b4j.example.playerstatestore*/ ._traceinfo /*String*/ (null,"network","запрос данных","");
RDebugUtils.currentLine=76939268;
 //BA.debugLineNum = 76939268;BA.debugLine="Wait For (syncService.FetchData(fetchTimeoutMs))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackdatacoordinator", "refreshofflinedatanow"), __ref._syncservice /*b4j.example.networksyncservice*/ ._fetchdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_fetchtimeoutms));
this.state = 55;
return;
case 55:
//C
this.state = 13;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=76939269;
 //BA.debugLineNum = 76939269;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
if (true) break;

case 13:
//if
this.state = 16;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=76939270;
 //BA.debugLineNum = 76939270;BA.debugLine="stateStore.IncrementNetworkErrorCount";
__ref._statestore /*b4j.example.playerstatestore*/ ._incrementnetworkerrorcount /*String*/ (null);
RDebugUtils.currentLine=76939271;
 //BA.debugLineNum = 76939271;BA.debugLine="stateStore.TraceWarn(\"network\", \"data ошибка\", \"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data ошибка","kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+" lastDataOkAgoSec="+__ref._statestore /*b4j.example.playerstatestore*/ ._secondsagotext /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._getlastdataokat /*long*/ (null)));
RDebugUtils.currentLine=76939272;
 //BA.debugLineNum = 76939272;BA.debugLine="stateStore.EndOfflineDataRefresh(\"http_failed\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"http_failed");
RDebugUtils.currentLine=76939273;
 //BA.debugLineNum = 76939273;BA.debugLine="stateStore.WriteHealthSnapshot(\"ошибка_data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"ошибка_data");
RDebugUtils.currentLine=76939274;
 //BA.debugLineNum = 76939274;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=76939276;
 //BA.debugLineNum = 76939276;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=76939277;
 //BA.debugLineNum = 76939277;BA.debugLine="If resultData Is Map Then";
if (true) break;

case 17:
//if
this.state = 54;
if (_resultdata instanceof java.util.Map) { 
this.state = 19;
}else {
this.state = 53;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=76939278;
 //BA.debugLineNum = 76939278;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=76939279;
 //BA.debugLineNum = 76939279;BA.debugLine="If data.GetDefault(\"ok\", False) = True And data.";
if (true) break;

case 20:
//if
this.state = 48;
if ((_data.GetDefault((Object)("ok"),(Object)(parent.__c.False))).equals((Object)(parent.__c.True)) && (_data.GetDefault((Object)("type"),(Object)(""))).equals((Object)("data"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=76939280;
 //BA.debugLineNum = 76939280;BA.debugLine="stateStore.SetLastDataOkNow";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastdataoknow /*String*/ (null);
RDebugUtils.currentLine=76939281;
 //BA.debugLineNum = 76939281;BA.debugLine="stateStore.ResetConsecutiveNetworkErrors";
__ref._statestore /*b4j.example.playerstatestore*/ ._resetconsecutivenetworkerrors /*String*/ (null);
RDebugUtils.currentLine=76939282;
 //BA.debugLineNum = 76939282;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"data";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"data");
RDebugUtils.currentLine=76939283;
 //BA.debugLineNum = 76939283;BA.debugLine="UpdateTrustedOnlineTimeFromData(data, stateStor";
__ref._updatetrustedonlinetimefromdata /*String*/ (null,_data,__ref._statestore /*b4j.example.playerstatestore*/ ._storage /*b4j.example.keyvaluestore*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._trustedsynctimekey /*String*/ (null));
RDebugUtils.currentLine=76939284;
 //BA.debugLineNum = 76939284;BA.debugLine="stateStore.SaveOfflineData(data)";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveofflinedata /*String*/ (null,_data);
RDebugUtils.currentLine=76939285;
 //BA.debugLineNum = 76939285;BA.debugLine="If stateStore.IsTraceUploadEnabled Then stateSt";
if (true) break;

case 23:
//if
this.state = 28;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._istraceuploadenabled /*boolean*/ (null)) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
__ref._statestore /*b4j.example.playerstatestore*/ ._flushtracebufferasync /*String*/ (null);
if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=76939286;
 //BA.debugLineNum = 76939286;BA.debugLine="stateStore.InvalidateRelevantTrackIdsCache";
__ref._statestore /*b4j.example.playerstatestore*/ ._invalidaterelevanttrackidscache /*String*/ (null);
RDebugUtils.currentLine=76939287;
 //BA.debugLineNum = 76939287;BA.debugLine="stateStore.SetRemoteDataReady";
__ref._statestore /*b4j.example.playerstatestore*/ ._setremotedataready /*String*/ (null);
RDebugUtils.currentLine=76939288;
 //BA.debugLineNum = 76939288;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=76939289;
 //BA.debugLineNum = 76939289;BA.debugLine="stateStore.TraceInfo(\"network\", \"data загружены";
__ref._statestore /*b4j.example.playerstatestore*/ ._traceinfo /*String*/ (null,"network","data загружены","trace="+BA.ObjectToString(__ref._statestore /*b4j.example.playerstatestore*/ ._istraceuploadenabled /*boolean*/ (null)));
RDebugUtils.currentLine=76939290;
 //BA.debugLineNum = 76939290;BA.debugLine="stateStore.WriteHealthSnapshot(\"data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"data");
RDebugUtils.currentLine=76939291;
 //BA.debugLineNum = 76939291;BA.debugLine="Wait For (stateStore.SyncOfflinePlaylistMetadat";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackdatacoordinator", "refreshofflinedatanow"), __ref._statestore /*b4j.example.playerstatestore*/ ._syncofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 56;
return;
case 56:
//C
this.state = 29;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=76939292;
 //BA.debugLineNum = 76939292;BA.debugLine="If stateStore.IsStartupSequenceInProgress Then";
if (true) break;

case 29:
//if
this.state = 34;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._isstartupsequenceinprogress /*boolean*/ (null)) { 
this.state = 31;
}else {
this.state = 33;
}if (true) break;

case 31:
//C
this.state = 34;
RDebugUtils.currentLine=76939293;
 //BA.debugLineNum = 76939293;BA.debugLine="stateStore.DeferAdWarmupAfterStartup";
__ref._statestore /*b4j.example.playerstatestore*/ ._deferadwarmupafterstartup /*String*/ (null);
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=76939295;
 //BA.debugLineNum = 76939295;BA.debugLine="stateStore.EnsureAdCacheSyncAsync";
__ref._statestore /*b4j.example.playerstatestore*/ ._ensureadcachesyncasync /*String*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=76939297;
 //BA.debugLineNum = 76939297;BA.debugLine="If IsPlaybackAllowed(stateStore.OfflineData, st";

case 34:
//if
this.state = 37;
if (__ref._isplaybackallowed /*boolean*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._effectivenowticks /*long*/ (null))==parent.__c.False) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=76939298;
 //BA.debugLineNum = 76939298;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReas";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._resolveplaybackblockreason /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._effectivenowticks /*long*/ (null)),"server");
RDebugUtils.currentLine=76939299;
 //BA.debugLineNum = 76939299;BA.debugLine="stateStore.EndOfflineDataRefresh(\"data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"data");
RDebugUtils.currentLine=76939300;
 //BA.debugLineNum = 76939300;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=76939302;
 //BA.debugLineNum = 76939302;BA.debugLine="If stateStore.ResumePlaybackWhenServerAllows An";

case 37:
//if
this.state = 40;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._resumeplaybackwhenserverallows /*boolean*/ (null) && __ref._statestore /*b4j.example.playerstatestore*/ ._shouldresumewithnewstart /*boolean*/ (null)==parent.__c.False && __ref._statestore /*b4j.example.playerstatestore*/ ._isuserstoppedstate /*boolean*/ (null)==parent.__c.False && __ref._statestore /*b4j.example.playerstatestore*/ ._isstopping /*boolean*/ (null)==parent.__c.False) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=76939303;
 //BA.debugLineNum = 76939303;BA.debugLine="stateStore.TraceLog(\"policy resume авто mode=s";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"policy resume авто mode=server_allow");
RDebugUtils.currentLine=76939304;
 //BA.debugLineNum = 76939304;BA.debugLine="stateStore.ClearResumePlaybackWhenServerAllows";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearresumeplaybackwhenserverallows /*String*/ (null);
RDebugUtils.currentLine=76939305;
 //BA.debugLineNum = 76939305;BA.debugLine="stateStore.EnterStartedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=76939306;
 //BA.debugLineNum = 76939306;BA.debugLine="stateStore.SetStopIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setstopicon /*String*/ (null);
RDebugUtils.currentLine=76939307;
 //BA.debugLineNum = 76939307;BA.debugLine="stateStore.HideContentBlocks";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=76939308;
 //BA.debugLineNum = 76939308;BA.debugLine="stateStore.ResumePlaybackAfterPolicyPauseAsync";
__ref._statestore /*b4j.example.playerstatestore*/ ._resumeplaybackafterpolicypauseasync /*String*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=76939310;
 //BA.debugLineNum = 76939310;BA.debugLine="If stateStore.IsPolicyPauseState Then";

case 40:
//if
this.state = 47;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._ispolicypausestate /*boolean*/ (null)) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=76939311;
 //BA.debugLineNum = 76939311;BA.debugLine="stateStore.ClearPolicyPause";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=76939312;
 //BA.debugLineNum = 76939312;BA.debugLine="If stateStore.IsUserStoppedState = False And s";
if (true) break;

case 43:
//if
this.state = 46;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._isuserstoppedstate /*boolean*/ (null)==parent.__c.False && __ref._statestore /*b4j.example.playerstatestore*/ ._isplaybackstarted /*boolean*/ (null)==parent.__c.False && __ref._statestore /*b4j.example.playerstatestore*/ ._isstopping /*boolean*/ (null)==parent.__c.False) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=76939313;
 //BA.debugLineNum = 76939313;BA.debugLine="stateStore.TraceLog(\"policy resume авто mode=";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"policy resume авто mode=policy_pause_clear");
RDebugUtils.currentLine=76939314;
 //BA.debugLineNum = 76939314;BA.debugLine="stateStore.EnterStartedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=76939315;
 //BA.debugLineNum = 76939315;BA.debugLine="stateStore.SetStopIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setstopicon /*String*/ (null);
RDebugUtils.currentLine=76939316;
 //BA.debugLineNum = 76939316;BA.debugLine="stateStore.HideContentBlocks";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=76939317;
 //BA.debugLineNum = 76939317;BA.debugLine="stateStore.ResumePlaybackAfterPolicyPauseAsyn";
__ref._statestore /*b4j.example.playerstatestore*/ ._resumeplaybackafterpolicypauseasync /*String*/ (null);
 if (true) break;

case 46:
//C
this.state = 47;
;
 if (true) break;

case 47:
//C
this.state = 48;
;
RDebugUtils.currentLine=76939320;
 //BA.debugLineNum = 76939320;BA.debugLine="stateStore.EndOfflineDataRefresh(\"data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"data");
RDebugUtils.currentLine=76939321;
 //BA.debugLineNum = 76939321;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=76939323;
 //BA.debugLineNum = 76939323;BA.debugLine="If data.GetDefault(\"type\", \"\") = \"message\" Then";

case 48:
//if
this.state = 51;
if ((_data.GetDefault((Object)("type"),(Object)(""))).equals((Object)("message"))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=76939324;
 //BA.debugLineNum = 76939324;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"mess";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"message");
RDebugUtils.currentLine=76939325;
 //BA.debugLineNum = 76939325;BA.debugLine="stateStore.TraceWarn(\"network\", \"data сообщение";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data сообщение","action="+BA.ObjectToString(_data.GetDefault((Object)("action"),(Object)("")))+" reason="+BA.ObjectToString(_data.GetDefault((Object)("reason"),(Object)(""))));
RDebugUtils.currentLine=76939326;
 //BA.debugLineNum = 76939326;BA.debugLine="stateStore.HandleMessageItem(data)";
__ref._statestore /*b4j.example.playerstatestore*/ ._handlemessageitem /*String*/ (null,_data);
RDebugUtils.currentLine=76939327;
 //BA.debugLineNum = 76939327;BA.debugLine="stateStore.EndOfflineDataRefresh(\"message\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"message");
RDebugUtils.currentLine=76939328;
 //BA.debugLineNum = 76939328;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 51:
//C
this.state = 54;
;
RDebugUtils.currentLine=76939330;
 //BA.debugLineNum = 76939330;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"inval";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"invalid_data");
RDebugUtils.currentLine=76939331;
 //BA.debugLineNum = 76939331;BA.debugLine="stateStore.TraceWarn(\"network\", \"data некорректн";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data некорректны","type="+BA.ObjectToString(_data.GetDefault((Object)("type"),(Object)("")))+" ok="+BA.ObjectToString(_data.GetDefault((Object)("ok"),(Object)(parent.__c.False))));
RDebugUtils.currentLine=76939332;
 //BA.debugLineNum = 76939332;BA.debugLine="PausePlaybackByPolicy(stateStore.MessageValue(\"i";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"invalid_data_response"),"server");
 if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=76939334;
 //BA.debugLineNum = 76939334;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"inval";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"invalid_payload");
RDebugUtils.currentLine=76939335;
 //BA.debugLineNum = 76939335;BA.debugLine="stateStore.TraceWarn(\"network\", \"data некорректн";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data некорректны","payload=not_map");
RDebugUtils.currentLine=76939336;
 //BA.debugLineNum = 76939336;BA.debugLine="PausePlaybackByPolicy(stateStore.MessageValue(\"i";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"invalid_data_response"),"server");
 if (true) break;

case 54:
//C
this.state = -1;
;
RDebugUtils.currentLine=76939338;
 //BA.debugLineNum = 76939338;BA.debugLine="stateStore.EndOfflineDataRefresh(stateStore.LastO";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._lastofflinedatarefreshstate /*String*/ (null));
RDebugUtils.currentLine=76939339;
 //BA.debugLineNum = 76939339;BA.debugLine="stateStore.WriteHealthSnapshot(\"ошибка_data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"ошибка_data");
RDebugUtils.currentLine=76939340;
 //BA.debugLineNum = 76939340;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=76939341;
 //BA.debugLineNum = 76939341;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _resetretrydelay(b4j.example.playbackdatacoordinator __ref,int _localretryinitial,int _serverretryinitial) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "resetretrydelay", false))
	 {return ((String) Debug.delegate(ba, "resetretrydelay", new Object[] {_localretryinitial,_serverretryinitial}));}
RDebugUtils.currentLine=72810496;
 //BA.debugLineNum = 72810496;BA.debugLine="Public Sub ResetRetryDelay(localRetryInitial As In";
RDebugUtils.currentLine=72810497;
 //BA.debugLineNum = 72810497;BA.debugLine="stateStore.ResetRetryDelayState(localRetryInitial";
__ref._statestore /*b4j.example.playerstatestore*/ ._resetretrydelaystate /*String*/ (null,_localretryinitial,_serverretryinitial);
RDebugUtils.currentLine=72810498;
 //BA.debugLineNum = 72810498;BA.debugLine="End Sub";
return "";
}
public String  _resolveplaybackblockreason(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data,long _effectivenowticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "resolveplaybackblockreason", false))
	 {return ((String) Debug.delegate(ba, "resolveplaybackblockreason", new Object[] {_data,_effectivenowticks}));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
String _pausereason = "";
long _endtimestamp = 0L;
RDebugUtils.currentLine=70320128;
 //BA.debugLineNum = 70320128;BA.debugLine="Public Sub ResolvePlaybackBlockReason(data As Map,";
RDebugUtils.currentLine=70320129;
 //BA.debugLineNum = 70320129;BA.debugLine="If data.IsInitialized = False Then Return stateSt";
if (_data.IsInitialized()==__c.False) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");};
RDebugUtils.currentLine=70320130;
 //BA.debugLineNum = 70320130;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=70320131;
 //BA.debugLineNum = 70320131;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
RDebugUtils.currentLine=70320132;
 //BA.debugLineNum = 70320132;BA.debugLine="Dim pauseReason As String = playerData.GetDefaul";
_pausereason = BA.ObjectToString(_playerdata.GetDefault((Object)("pause_reason"),(Object)("")));
RDebugUtils.currentLine=70320133;
 //BA.debugLineNum = 70320133;BA.debugLine="If pauseReason <> \"\" Then Return pauseReason";
if ((_pausereason).equals("") == false) { 
if (true) return _pausereason;};
 };
RDebugUtils.currentLine=70320135;
 //BA.debugLineNum = 70320135;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
_endtimestamp = __ref._resolveplaybackendtimestamp /*long*/ (null,_data);
RDebugUtils.currentLine=70320136;
 //BA.debugLineNum = 70320136;BA.debugLine="If endTimestamp > 0 And effectiveNowTicks >= (end";
if (_endtimestamp>0 && _effectivenowticks>=(_endtimestamp*1000)) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"subscription_expired");};
RDebugUtils.currentLine=70320137;
 //BA.debugLineNum = 70320137;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
if (_playerdata.IsInitialized() && _playerdata.ContainsKey((Object)("playback_allowed"))) { 
RDebugUtils.currentLine=70320138;
 //BA.debugLineNum = 70320138;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
if ((_playerdata.GetDefault((Object)("playback_allowed"),(Object)(__c.True))).equals((Object)(__c.True)) == false) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");};
 };
RDebugUtils.currentLine=70320140;
 //BA.debugLineNum = 70320140;BA.debugLine="Return stateStore.MessageValue(\"playback_paused\")";
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");
RDebugUtils.currentLine=70320141;
 //BA.debugLineNum = 70320141;BA.debugLine="End Sub";
return "";
}
public String  _scheduleretry(b4j.example.playbackdatacoordinator __ref,String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "scheduleretry", false))
	 {return ((String) Debug.delegate(ba, "scheduleretry", new Object[] {_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay}));}
RDebugUtils.currentLine=72744960;
 //BA.debugLineNum = 72744960;BA.debugLine="Public Sub ScheduleRetry(mode As String, delayMs A";
RDebugUtils.currentLine=72744961;
 //BA.debugLineNum = 72744961;BA.debugLine="stateStore.ClearRetryTimer";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=72744962;
 //BA.debugLineNum = 72744962;BA.debugLine="stateStore.SetLastRetryMode(mode)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastretrymode /*String*/ (null,_mode);
RDebugUtils.currentLine=72744963;
 //BA.debugLineNum = 72744963;BA.debugLine="stateStore.SetRetryInterval(ResolveRetryDelay(mod";
__ref._statestore /*b4j.example.playerstatestore*/ ._setretryinterval /*String*/ (null,__ref._resolveretrydelay /*int*/ (null,_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay));
RDebugUtils.currentLine=72744964;
 //BA.debugLineNum = 72744964;BA.debugLine="If stateStore.IsPlaybackStarted = False Or stateS";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._isplaybackstarted /*boolean*/ (null)==__c.False || __ref._statestore /*b4j.example.playerstatestore*/ ._isstoppedbyuser /*boolean*/ (null)) { 
if (true) return "";};
RDebugUtils.currentLine=72744965;
 //BA.debugLineNum = 72744965;BA.debugLine="If stateStore.IsPlaybackPausedByPolicy And mode <";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._isplaybackpausedbypolicy /*boolean*/ (null) && (_mode).equals("blocked") == false && (_mode).equals("audio_device") == false) { 
if (true) return "";};
RDebugUtils.currentLine=72744966;
 //BA.debugLineNum = 72744966;BA.debugLine="stateStore.TraceWarn(\"network\", \"переход в retry\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","переход в retry","mode="+_mode+" delaySec="+BA.NumberToString(__c.Floor(__ref._statestore /*b4j.example.playerstatestore*/ ._getretryinterval /*int*/ (null)/(double)1000)));
RDebugUtils.currentLine=72744967;
 //BA.debugLineNum = 72744967;BA.debugLine="stateStore.WriteHealthSnapshot(\"retry\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"retry");
RDebugUtils.currentLine=72744968;
 //BA.debugLineNum = 72744968;BA.debugLine="stateStore.EnableRetryTimer";
__ref._statestore /*b4j.example.playerstatestore*/ ._enableretrytimer /*String*/ (null);
RDebugUtils.currentLine=72744969;
 //BA.debugLineNum = 72744969;BA.debugLine="End Sub";
return "";
}
public String  _stopformissingdata(b4j.example.playbackdatacoordinator __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "stopformissingdata", false))
	 {return ((String) Debug.delegate(ba, "stopformissingdata", new Object[] {_text}));}
RDebugUtils.currentLine=71106560;
 //BA.debugLineNum = 71106560;BA.debugLine="Public Sub StopForMissingData(text As String)";
RDebugUtils.currentLine=71106561;
 //BA.debugLineNum = 71106561;BA.debugLine="stateStore.TraceLog(\"состояние stop reason=missin";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние stop reason=missing_data text="+_text);
RDebugUtils.currentLine=71106562;
 //BA.debugLineNum = 71106562;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"missing_";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","missing_data");
RDebugUtils.currentLine=71106563;
 //BA.debugLineNum = 71106563;BA.debugLine="stateStore.ClearPolicyPauseAndResumeRequest";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=71106564;
 //BA.debugLineNum = 71106564;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=71106565;
 //BA.debugLineNum = 71106565;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=71106566;
 //BA.debugLineNum = 71106566;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=71106567;
 //BA.debugLineNum = 71106567;BA.debugLine="stateStore.EnterUserStoppedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=71106568;
 //BA.debugLineNum = 71106568;BA.debugLine="stateStore.SetPlayIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplayicon /*String*/ (null);
RDebugUtils.currentLine=71106569;
 //BA.debugLineNum = 71106569;BA.debugLine="stateStore.ShowMessage(text)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_text);
RDebugUtils.currentLine=71106570;
 //BA.debugLineNum = 71106570;BA.debugLine="End Sub";
return "";
}
public String  _switchtolocalplayback(b4j.example.playbackdatacoordinator __ref,boolean _markdegraded,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "switchtolocalplayback", false))
	 {return ((String) Debug.delegate(ba, "switchtolocalplayback", new Object[] {_markdegraded,_reason}));}
RDebugUtils.currentLine=71172096;
 //BA.debugLineNum = 71172096;BA.debugLine="Public Sub SwitchToLocalPlayback(markDegraded As B";
RDebugUtils.currentLine=71172097;
 //BA.debugLineNum = 71172097;BA.debugLine="stateStore.TraceLog(\"fallback activate mode=local";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback activate mode=local reason="+_reason+" degraded="+BA.ObjectToString(_markdegraded));
RDebugUtils.currentLine=71172098;
 //BA.debugLineNum = 71172098;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"switch_l";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","switch_local:"+_reason);
RDebugUtils.currentLine=71172099;
 //BA.debugLineNum = 71172099;BA.debugLine="stateStore.EnterLocalPlayback";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterlocalplayback /*String*/ (null);
RDebugUtils.currentLine=71172100;
 //BA.debugLineNum = 71172100;BA.debugLine="stateStore.SetMediaPathDegraded(markDegraded)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setmediapathdegraded /*String*/ (null,_markdegraded);
RDebugUtils.currentLine=71172101;
 //BA.debugLineNum = 71172101;BA.debugLine="stateStore.RequestSkipQueueSnapshotRestore(\"switc";
__ref._statestore /*b4j.example.playerstatestore*/ ._requestskipqueuesnapshotrestore /*String*/ (null,"switch_local:"+_reason);
RDebugUtils.currentLine=71172102;
 //BA.debugLineNum = 71172102;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=71172103;
 //BA.debugLineNum = 71172103;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=71172104;
 //BA.debugLineNum = 71172104;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=71172105;
 //BA.debugLineNum = 71172105;BA.debugLine="End Sub";
return "";
}
public boolean  _isidleslot(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _slotcontext) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "isidleslot", false))
	 {return ((Boolean) Debug.delegate(ba, "isidleslot", new Object[] {_slotcontext}));}
anywheresoftware.b4a.objects.collections.List _playlists = null;
String _streamid = "";
String _streamtitle = "";
RDebugUtils.currentLine=74383360;
 //BA.debugLineNum = 74383360;BA.debugLine="Private Sub IsIdleSlot(slotContext As Map) As Bool";
RDebugUtils.currentLine=74383361;
 //BA.debugLineNum = 74383361;BA.debugLine="If slotContext.IsInitialized = False Or slotConte";
if (_slotcontext.IsInitialized()==__c.False || _slotcontext.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=74383362;
 //BA.debugLineNum = 74383362;BA.debugLine="Dim playlists As List = slotContext.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slotcontext.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=74383363;
 //BA.debugLineNum = 74383363;BA.debugLine="If playlists.IsInitialized And playlists.Size > 0";
if (_playlists.IsInitialized() && _playlists.getSize()>0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=74383364;
 //BA.debugLineNum = 74383364;BA.debugLine="Dim streamId As String = slotContext.GetDefault(\"";
_streamid = BA.ObjectToString(_slotcontext.GetDefault((Object)("stream_id"),(Object)("")));
RDebugUtils.currentLine=74383365;
 //BA.debugLineNum = 74383365;BA.debugLine="Dim streamTitle As String = slotContext.GetDefaul";
_streamtitle = BA.ObjectToString(_slotcontext.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=74383366;
 //BA.debugLineNum = 74383366;BA.debugLine="Return streamId = \"\" And streamTitle = \"\"";
if (true) return (_streamid).equals("") && (_streamtitle).equals("");
RDebugUtils.currentLine=74383367;
 //BA.debugLineNum = 74383367;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.playbackdatacoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
RDebugUtils.currentLine=70123520;
 //BA.debugLineNum = 70123520;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=70123521;
 //BA.debugLineNum = 70123521;BA.debugLine="Private stateStore As PlayerStateStore";
_statestore = new b4j.example.playerstatestore();
RDebugUtils.currentLine=70123522;
 //BA.debugLineNum = 70123522;BA.debugLine="Private syncService As NetworkSyncService";
_syncservice = new b4j.example.networksyncservice();
RDebugUtils.currentLine=70123523;
 //BA.debugLineNum = 70123523;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.playbackdatacoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=70778880;
 //BA.debugLineNum = 70778880;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=70778881;
 //BA.debugLineNum = 70778881;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=70778882;
 //BA.debugLineNum = 70778882;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=70778883;
 //BA.debugLineNum = 70778883;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=70778884;
 //BA.debugLineNum = 70778884;BA.debugLine="End Sub";
return null;
}
public boolean  _playlisthascachedtrack(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "playlisthascachedtrack", false))
	 {return ((Boolean) Debug.delegate(ba, "playlisthascachedtrack", new Object[] {_playlistdata}));}
anywheresoftware.b4a.objects.collections.List _tracks = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
RDebugUtils.currentLine=74448896;
 //BA.debugLineNum = 74448896;BA.debugLine="Private Sub PlaylistHasCachedTrack(playlistData As";
RDebugUtils.currentLine=74448897;
 //BA.debugLineNum = 74448897;BA.debugLine="If playlistData.IsInitialized = False Or playlist";
if (_playlistdata.IsInitialized()==__c.False || _playlistdata.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=74448898;
 //BA.debugLineNum = 74448898;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=74448899;
 //BA.debugLineNum = 74448899;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=74448900;
 //BA.debugLineNum = 74448900;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group4 = _tracks;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_trackobject = group4.Get(index4);
RDebugUtils.currentLine=74448901;
 //BA.debugLineNum = 74448901;BA.debugLine="If trackObject Is Map Then";
if (_trackobject instanceof java.util.Map) { 
RDebugUtils.currentLine=74448902;
 //BA.debugLineNum = 74448902;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=74448903;
 //BA.debugLineNum = 74448903;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=74448904;
 //BA.debugLineNum = 74448904;BA.debugLine="If trackId <> \"\" And stateStore.IsTrackCached(t";
if ((_trackid).equals("") == false && __ref._statestore /*b4j.example.playerstatestore*/ ._istrackcached /*boolean*/ (null,_trackid)) { 
if (true) return __c.True;};
 };
 }
};
RDebugUtils.currentLine=74448907;
 //BA.debugLineNum = 74448907;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=74448908;
 //BA.debugLineNum = 74448908;BA.debugLine="End Sub";
return false;
}
public long  _resolveplaybackendtimestamp(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "resolveplaybackendtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "resolveplaybackendtimestamp", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
long _playerend = 0L;
RDebugUtils.currentLine=70385664;
 //BA.debugLineNum = 70385664;BA.debugLine="Public Sub ResolvePlaybackEndTimestamp(data As Map";
RDebugUtils.currentLine=70385665;
 //BA.debugLineNum = 70385665;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=70385666;
 //BA.debugLineNum = 70385666;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=70385667;
 //BA.debugLineNum = 70385667;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
RDebugUtils.currentLine=70385668;
 //BA.debugLineNum = 70385668;BA.debugLine="Dim playerEnd As Long = ParseEndValueToTimestamp";
_playerend = __ref._parseendvaluetotimestamp /*long*/ (null,_playerdata.Get((Object)("end")));
RDebugUtils.currentLine=70385669;
 //BA.debugLineNum = 70385669;BA.debugLine="If playerEnd > 0 Then Return playerEnd";
if (_playerend>0) { 
if (true) return _playerend;};
 };
RDebugUtils.currentLine=70385671;
 //BA.debugLineNum = 70385671;BA.debugLine="Return ParseEndValueToTimestamp(data.Get(\"end\"))";
if (true) return __ref._parseendvaluetotimestamp /*long*/ (null,_data.Get((Object)("end")));
RDebugUtils.currentLine=70385672;
 //BA.debugLineNum = 70385672;BA.debugLine="End Sub";
return 0L;
}
public long  _parsedateonlyendtimestamp(b4j.example.playbackdatacoordinator __ref,String _textvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "parsedateonlyendtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "parsedateonlyendtimestamp", new Object[] {_textvalue}));}
String _previousdateformat = "";
long _daystartticks = 0L;
RDebugUtils.currentLine=70713344;
 //BA.debugLineNum = 70713344;BA.debugLine="Private Sub ParseDateOnlyEndTimestamp(textValue As";
RDebugUtils.currentLine=70713345;
 //BA.debugLineNum = 70713345;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=70713346;
 //BA.debugLineNum = 70713346;BA.debugLine="Try";
try {RDebugUtils.currentLine=70713347;
 //BA.debugLineNum = 70713347;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=70713348;
 //BA.debugLineNum = 70713348;BA.debugLine="Dim dayStartTicks As Long = DateTime.DateParse(t";
_daystartticks = __c.DateTime.DateParse(_textvalue);
RDebugUtils.currentLine=70713349;
 //BA.debugLineNum = 70713349;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=70713350;
 //BA.debugLineNum = 70713350;BA.debugLine="Return Floor((dayStartTicks + DateTime.TicksPerD";
if (true) return (long) (__c.Floor((_daystartticks+__c.DateTime.TicksPerDay)/(double)1000));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=70713352;
 //BA.debugLineNum = 70713352;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=70713353;
 //BA.debugLineNum = 70713353;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
RDebugUtils.currentLine=70713354;
 //BA.debugLineNum = 70713354;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=70713356;
 //BA.debugLineNum = 70713356;BA.debugLine="End Sub";
return 0L;
}
public long  _parseendvaluetotimestamp(b4j.example.playbackdatacoordinator __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "parseendvaluetotimestamp", false))
	 {return ((Long) Debug.delegate(ba, "parseendvaluetotimestamp", new Object[] {_value}));}
String _textvalue = "";
anywheresoftware.b4j.object.JavaObject _instantclass = null;
anywheresoftware.b4j.object.JavaObject _instant = null;
anywheresoftware.b4j.object.JavaObject _offsetdatetimeclass = null;
anywheresoftware.b4j.object.JavaObject _offsetdatetime = null;
RDebugUtils.currentLine=70582272;
 //BA.debugLineNum = 70582272;BA.debugLine="Private Sub ParseEndValueToTimestamp(value As Obje";
RDebugUtils.currentLine=70582273;
 //BA.debugLineNum = 70582273;BA.debugLine="If value = Null Then Return 0";
if (_value== null) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=70582274;
 //BA.debugLineNum = 70582274;BA.debugLine="Dim textValue As String = (\"\" & value).Trim";
_textvalue = (""+BA.ObjectToString(_value)).trim();
RDebugUtils.currentLine=70582275;
 //BA.debugLineNum = 70582275;BA.debugLine="If textValue = \"\" Then Return 0";
if ((_textvalue).equals("")) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=70582276;
 //BA.debugLineNum = 70582276;BA.debugLine="If Regex.IsMatch(\"^\\d+$\", textValue) Then Return";
if (__c.Regex.IsMatch("^\\d+$",_textvalue)) { 
if (true) return (long) (__c.Floor((double)(Double.parseDouble(_textvalue))));};
RDebugUtils.currentLine=70582277;
 //BA.debugLineNum = 70582277;BA.debugLine="If Regex.IsMatch(\"^\\d{4}-\\d{2}-\\d{2}$\", textValue";
if (__c.Regex.IsMatch("^\\d{4}-\\d{2}-\\d{2}$",_textvalue)) { 
RDebugUtils.currentLine=70582278;
 //BA.debugLineNum = 70582278;BA.debugLine="Return ParseDateOnlyEndTimestamp(textValue)";
if (true) return __ref._parsedateonlyendtimestamp /*long*/ (null,_textvalue);
 };
RDebugUtils.currentLine=70582280;
 //BA.debugLineNum = 70582280;BA.debugLine="Try";
try {RDebugUtils.currentLine=70582281;
 //BA.debugLineNum = 70582281;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=70582282;
 //BA.debugLineNum = 70582282;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=70582283;
 //BA.debugLineNum = 70582283;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("parse",new Object[]{(Object)(_textvalue)})));
RDebugUtils.currentLine=70582284;
 //BA.debugLineNum = 70582284;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("getEpochSecond",(Object[])(__c.Null)));
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=70582286;
 //BA.debugLineNum = 70582286;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
 };
RDebugUtils.currentLine=70582288;
 //BA.debugLineNum = 70582288;BA.debugLine="Try";
try {RDebugUtils.currentLine=70582289;
 //BA.debugLineNum = 70582289;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
_offsetdatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=70582290;
 //BA.debugLineNum = 70582290;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time.";
_offsetdatetimeclass.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=70582291;
 //BA.debugLineNum = 70582291;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTim";
_offsetdatetime = new anywheresoftware.b4j.object.JavaObject();
_offsetdatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetimeclass.RunMethod("parse",new Object[]{(Object)(_textvalue)})));
RDebugUtils.currentLine=70582292;
 //BA.debugLineNum = 70582292;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunMe";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetime.RunMethod("toInstant",(Object[])(__c.Null))));
RDebugUtils.currentLine=70582293;
 //BA.debugLineNum = 70582293;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("getEpochSecond",(Object[])(__c.Null)));
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=70582295;
 //BA.debugLineNum = 70582295;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
 };
RDebugUtils.currentLine=70582297;
 //BA.debugLineNum = 70582297;BA.debugLine="stateStore.TraceLog(\"player end parse fail value=";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"player end parse fail value="+_textvalue);
RDebugUtils.currentLine=70582298;
 //BA.debugLineNum = 70582298;BA.debugLine="Return 0";
if (true) return (long) (0);
RDebugUtils.currentLine=70582299;
 //BA.debugLineNum = 70582299;BA.debugLine="End Sub";
return 0L;
}
public long  _parsetrustedonlineticks(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "parsetrustedonlineticks", false))
	 {return ((Long) Debug.delegate(ba, "parsetrustedonlineticks", new Object[] {_data}));}
String _updatedtext = "";
anywheresoftware.b4j.object.JavaObject _instantclass = null;
anywheresoftware.b4j.object.JavaObject _instant = null;
anywheresoftware.b4j.object.JavaObject _offsetdatetimeclass = null;
anywheresoftware.b4j.object.JavaObject _offsetdatetime = null;
RDebugUtils.currentLine=70647808;
 //BA.debugLineNum = 70647808;BA.debugLine="Private Sub ParseTrustedOnlineTicks(data As Map) A";
RDebugUtils.currentLine=70647809;
 //BA.debugLineNum = 70647809;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=70647810;
 //BA.debugLineNum = 70647810;BA.debugLine="Dim updatedText As String = (\"\" & data.GetDefault";
_updatedtext = (""+BA.ObjectToString(_data.GetDefault((Object)("updated"),(Object)("")))).trim();
RDebugUtils.currentLine=70647811;
 //BA.debugLineNum = 70647811;BA.debugLine="If updatedText = \"\" Then Return 0";
if ((_updatedtext).equals("")) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=70647812;
 //BA.debugLineNum = 70647812;BA.debugLine="Try";
try {RDebugUtils.currentLine=70647813;
 //BA.debugLineNum = 70647813;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=70647814;
 //BA.debugLineNum = 70647814;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=70647815;
 //BA.debugLineNum = 70647815;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("parse",new Object[]{(Object)(_updatedtext)})));
RDebugUtils.currentLine=70647816;
 //BA.debugLineNum = 70647816;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("toEpochMilli",(Object[])(__c.Null)));
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=70647818;
 //BA.debugLineNum = 70647818;BA.debugLine="Try";
try {RDebugUtils.currentLine=70647819;
 //BA.debugLineNum = 70647819;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
_offsetdatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=70647820;
 //BA.debugLineNum = 70647820;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time";
_offsetdatetimeclass.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=70647821;
 //BA.debugLineNum = 70647821;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTi";
_offsetdatetime = new anywheresoftware.b4j.object.JavaObject();
_offsetdatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetimeclass.RunMethod("parse",new Object[]{(Object)(_updatedtext)})));
RDebugUtils.currentLine=70647822;
 //BA.debugLineNum = 70647822;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunM";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetime.RunMethod("toInstant",(Object[])(__c.Null))));
RDebugUtils.currentLine=70647823;
 //BA.debugLineNum = 70647823;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("toEpochMilli",(Object[])(__c.Null)));
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=70647825;
 //BA.debugLineNum = 70647825;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
 };
 };
RDebugUtils.currentLine=70647828;
 //BA.debugLineNum = 70647828;BA.debugLine="Return 0";
if (true) return (long) (0);
RDebugUtils.currentLine=70647829;
 //BA.debugLineNum = 70647829;BA.debugLine="End Sub";
return 0L;
}
public String  _updatetrustedonlinetimefromdata(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data,b4j.example.keyvaluestore _storage,String _storagekey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "updatetrustedonlinetimefromdata", false))
	 {return ((String) Debug.delegate(ba, "updatetrustedonlinetimefromdata", new Object[] {_data,_storage,_storagekey}));}
long _candidateticks = 0L;
RDebugUtils.currentLine=70451200;
 //BA.debugLineNum = 70451200;BA.debugLine="Public Sub UpdateTrustedOnlineTimeFromData(data As";
RDebugUtils.currentLine=70451201;
 //BA.debugLineNum = 70451201;BA.debugLine="Dim candidateTicks As Long = ParseTrustedOnlineTi";
_candidateticks = __ref._parsetrustedonlineticks /*long*/ (null,_data);
RDebugUtils.currentLine=70451202;
 //BA.debugLineNum = 70451202;BA.debugLine="If candidateTicks <= 0 Then candidateTicks = Date";
if (_candidateticks<=0) { 
_candidateticks = __c.DateTime.getNow();};
RDebugUtils.currentLine=70451203;
 //BA.debugLineNum = 70451203;BA.debugLine="UpdateTrustedOnlineTimeTicks(candidateTicks, stor";
__ref._updatetrustedonlinetimeticks /*String*/ (null,_candidateticks,_storage,_storagekey);
RDebugUtils.currentLine=70451204;
 //BA.debugLineNum = 70451204;BA.debugLine="End Sub";
return "";
}
public int  _resolveretrydelay(b4j.example.playbackdatacoordinator __ref,String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "resolveretrydelay", false))
	 {return ((Integer) Debug.delegate(ba, "resolveretrydelay", new Object[] {_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay}));}
RDebugUtils.currentLine=72679424;
 //BA.debugLineNum = 72679424;BA.debugLine="Public Sub ResolveRetryDelay(mode As String, delay";
RDebugUtils.currentLine=72679425;
 //BA.debugLineNum = 72679425;BA.debugLine="Return stateStore.ResolveRetryDelay(mode, delayMs";
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._resolveretrydelay /*int*/ (null,_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay);
RDebugUtils.currentLine=72679426;
 //BA.debugLineNum = 72679426;BA.debugLine="End Sub";
return 0;
}
public String  _updatetrustedonlinetimeticks(b4j.example.playbackdatacoordinator __ref,long _candidateticks,b4j.example.keyvaluestore _storage,String _storagekey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "updatetrustedonlinetimeticks", false))
	 {return ((String) Debug.delegate(ba, "updatetrustedonlinetimeticks", new Object[] {_candidateticks,_storage,_storagekey}));}
long _storedticks = 0L;
RDebugUtils.currentLine=70516736;
 //BA.debugLineNum = 70516736;BA.debugLine="Public Sub UpdateTrustedOnlineTimeTicks(candidateT";
RDebugUtils.currentLine=70516737;
 //BA.debugLineNum = 70516737;BA.debugLine="If candidateTicks <= 0 Then Return";
if (_candidateticks<=0) { 
if (true) return "";};
RDebugUtils.currentLine=70516738;
 //BA.debugLineNum = 70516738;BA.debugLine="Dim storedTicks As Long = storage.GetDefault(stor";
_storedticks = BA.ObjectToLongNumber(_storage._getdefault /*Object*/ (null,_storagekey,(Object)(0)));
RDebugUtils.currentLine=70516739;
 //BA.debugLineNum = 70516739;BA.debugLine="If candidateTicks <= storedTicks Then Return";
if (_candidateticks<=_storedticks) { 
if (true) return "";};
RDebugUtils.currentLine=70516740;
 //BA.debugLineNum = 70516740;BA.debugLine="storage.Put(storageKey, candidateTicks)";
_storage._put /*String*/ (null,_storagekey,(Object)(_candidateticks));
RDebugUtils.currentLine=70516741;
 //BA.debugLineNum = 70516741;BA.debugLine="stateStore.TraceLog(\"trusted time update ticks=\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"trusted time update ticks="+BA.NumberToString(_candidateticks));
RDebugUtils.currentLine=70516742;
 //BA.debugLineNum = 70516742;BA.debugLine="End Sub";
return "";
}
}