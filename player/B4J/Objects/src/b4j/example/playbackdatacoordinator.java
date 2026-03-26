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
public b4j.example.platformbridge _platformbridge = null;
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
RDebugUtils.currentLine=48758784;
 //BA.debugLineNum = 48758784;BA.debugLine="Public Sub AllowRegularAdsAtTargetMinute(offlineDa";
RDebugUtils.currentLine=48758785;
 //BA.debugLineNum = 48758785;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=48758786;
 //BA.debugLineNum = 48758786;BA.debugLine="Dim targetTicks As Long = targetMinuteTimestamp *";
_targetticks = (long) (_targetminutetimestamp*1000);
RDebugUtils.currentLine=48758787;
 //BA.debugLineNum = 48758787;BA.debugLine="Dim targetSlot As Map = stateStore.ResolveDataSlo";
_targetslot = new anywheresoftware.b4a.objects.collections.Map();
_targetslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_targetticks);
RDebugUtils.currentLine=48758788;
 //BA.debugLineNum = 48758788;BA.debugLine="Return IsIdleSlot(targetSlot) = False";
if (true) return __ref._isidleslot /*boolean*/ (null,_targetslot)==__c.False;
RDebugUtils.currentLine=48758789;
 //BA.debugLineNum = 48758789;BA.debugLine="End Sub";
return false;
}
public String  _activatelocalfallback(b4j.example.playbackdatacoordinator __ref,boolean _markdegraded,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "activatelocalfallback", false))
	 {return ((String) Debug.delegate(ba, "activatelocalfallback", new Object[] {_markdegraded,_reason}));}
RDebugUtils.currentLine=47906816;
 //BA.debugLineNum = 47906816;BA.debugLine="Public Sub ActivateLocalFallback(markDegraded As B";
RDebugUtils.currentLine=47906817;
 //BA.debugLineNum = 47906817;BA.debugLine="stateStore.TraceLog(\"fallback activate mode=local";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback activate mode=local reason="+_reason+" degraded="+BA.ObjectToString(_markdegraded));
RDebugUtils.currentLine=47906818;
 //BA.debugLineNum = 47906818;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"switch_l";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","switch_local:"+_reason);
RDebugUtils.currentLine=47906819;
 //BA.debugLineNum = 47906819;BA.debugLine="stateStore.EnterLocalPlayback";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterlocalplayback /*String*/ (null);
RDebugUtils.currentLine=47906820;
 //BA.debugLineNum = 47906820;BA.debugLine="stateStore.SetMediaPathDegraded(markDegraded)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setmediapathdegraded /*String*/ (null,_markdegraded);
RDebugUtils.currentLine=47906821;
 //BA.debugLineNum = 47906821;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=47906822;
 //BA.debugLineNum = 47906822;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=47906823;
 //BA.debugLineNum = 47906823;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=47906824;
 //BA.debugLineNum = 47906824;BA.debugLine="End Sub";
return "";
}
public String  _resolveidleuntilmessage(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _effectivenowticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "resolveidleuntilmessage", false))
	 {return ((String) Debug.delegate(ba, "resolveidleuntilmessage", new Object[] {_offlinedata,_effectivenowticks}));}
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.Map _nextslot = null;
String _nexttime = "";
RDebugUtils.currentLine=48693248;
 //BA.debugLineNum = 48693248;BA.debugLine="Public Sub ResolveIdleUntilMessage(offlineData As";
RDebugUtils.currentLine=48693249;
 //BA.debugLineNum = 48693249;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=48693250;
 //BA.debugLineNum = 48693250;BA.debugLine="Dim currentSlot As Map = stateStore.ResolveCurren";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvecurrentdataslot /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata);
RDebugUtils.currentLine=48693251;
 //BA.debugLineNum = 48693251;BA.debugLine="If IsIdleSlot(currentSlot) = False Then Return \"\"";
if (__ref._isidleslot /*boolean*/ (null,_currentslot)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=48693252;
 //BA.debugLineNum = 48693252;BA.debugLine="Dim nextSlot As Map = stateStore.ResolveNextDataS";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
_nextslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_effectivenowticks);
RDebugUtils.currentLine=48693253;
 //BA.debugLineNum = 48693253;BA.debugLine="Dim nextTime As String = nextSlot.GetDefault(\"slo";
_nexttime = BA.ObjectToString(_nextslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=48693254;
 //BA.debugLineNum = 48693254;BA.debugLine="If nextTime = \"\" Then Return stateStore.MessageVa";
if ((_nexttime).equals("")) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"idle");};
RDebugUtils.currentLine=48693255;
 //BA.debugLineNum = 48693255;BA.debugLine="Return stateStore.MessageValue(\"idle_until\").Repl";
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"idle_until").replace("{time}",_nexttime);
RDebugUtils.currentLine=48693256;
 //BA.debugLineNum = 48693256;BA.debugLine="End Sub";
return "";
}
public String  _pauseplaybackbypolicy(b4j.example.playbackdatacoordinator __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "pauseplaybackbypolicy", false))
	 {return ((String) Debug.delegate(ba, "pauseplaybackbypolicy", new Object[] {_reason,_connectionmode}));}
String _safereason = "";
RDebugUtils.currentLine=48431104;
 //BA.debugLineNum = 48431104;BA.debugLine="Public Sub PausePlaybackByPolicy(reason As String,";
RDebugUtils.currentLine=48431105;
 //BA.debugLineNum = 48431105;BA.debugLine="Dim safeReason As String = reason";
_safereason = _reason;
RDebugUtils.currentLine=48431106;
 //BA.debugLineNum = 48431106;BA.debugLine="If safeReason = \"\" Then safeReason = stateStore.M";
if ((_safereason).equals("")) { 
_safereason = __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");};
RDebugUtils.currentLine=48431107;
 //BA.debugLineNum = 48431107;BA.debugLine="stateStore.EnterPolicyPause(safeReason, connectio";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterpolicypause /*String*/ (null,_safereason,_connectionmode);
RDebugUtils.currentLine=48431108;
 //BA.debugLineNum = 48431108;BA.debugLine="End Sub";
return "";
}
public int  _countplayablelocaltracksincurrentslot(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _effectivenowticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "countplayablelocaltracksincurrentslot", false))
	 {return ((Integer) Debug.delegate(ba, "countplayablelocaltracksincurrentslot", new Object[] {_offlinedata,_effectivenowticks}));}
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
int _totalcount = 0;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
RDebugUtils.currentLine=48562176;
 //BA.debugLineNum = 48562176;BA.debugLine="Public Sub CountPlayableLocalTracksInCurrentSlot(o";
RDebugUtils.currentLine=48562177;
 //BA.debugLineNum = 48562177;BA.debugLine="Dim currentSlot As Map = stateStore.ResolveDataSl";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_effectivenowticks);
RDebugUtils.currentLine=48562178;
 //BA.debugLineNum = 48562178;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=48562179;
 //BA.debugLineNum = 48562179;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=48562180;
 //BA.debugLineNum = 48562180;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=48562181;
 //BA.debugLineNum = 48562181;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
RDebugUtils.currentLine=48562182;
 //BA.debugLineNum = 48562182;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group6 = _playlists;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_playlistobject = group6.Get(index6);
RDebugUtils.currentLine=48562183;
 //BA.debugLineNum = 48562183;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=48562184;
 //BA.debugLineNum = 48562184;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=48562185;
 //BA.debugLineNum = 48562185;BA.debugLine="Dim playlistId As String = playlistDescriptor.G";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=48562186;
 //BA.debugLineNum = 48562186;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=48562187;
 //BA.debugLineNum = 48562187;BA.debugLine="Dim playlistData As Map = stateStore.LoadCached";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = __ref._statestore /*b4j.example.playerstatestore*/ ._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=48562188;
 //BA.debugLineNum = 48562188;BA.debugLine="totalCount = totalCount + CountCachedTracksInPl";
_totalcount = (int) (_totalcount+__ref._countcachedtracksinplaylist /*int*/ (null,_playlistdata));
 };
 }
};
RDebugUtils.currentLine=48562191;
 //BA.debugLineNum = 48562191;BA.debugLine="Return totalCount";
if (true) return _totalcount;
RDebugUtils.currentLine=48562192;
 //BA.debugLineNum = 48562192;BA.debugLine="End Sub";
return 0;
}
public String  _handleblockedstate(b4j.example.playbackdatacoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "handleblockedstate", false))
	 {return ((String) Debug.delegate(ba, "handleblockedstate", null));}
RDebugUtils.currentLine=47775744;
 //BA.debugLineNum = 47775744;BA.debugLine="Public Sub HandleBlockedState";
RDebugUtils.currentLine=47775745;
 //BA.debugLineNum = 47775745;BA.debugLine="stateStore.TraceLog(\"состояние blocked\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние blocked");
RDebugUtils.currentLine=47775746;
 //BA.debugLineNum = 47775746;BA.debugLine="stateStore.EnterPolicyPause(stateStore.MessageVal";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterpolicypause /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"blocked"),"blocked");
RDebugUtils.currentLine=47775747;
 //BA.debugLineNum = 47775747;BA.debugLine="stateStore.ScheduleRetry(\"blocked\", 0)";
__ref._statestore /*b4j.example.playerstatestore*/ ._scheduleretry /*String*/ (null,"blocked",(int) (0));
RDebugUtils.currentLine=47775748;
 //BA.debugLineNum = 47775748;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=48103425;
 //BA.debugLineNum = 48103425;BA.debugLine="stateStore.TraceLog(\"очередь fetch ошибка kind=\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"очередь fetch ошибка kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+" message="+BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)(""))));
RDebugUtils.currentLine=48103426;
 //BA.debugLineNum = 48103426;BA.debugLine="If result.GetDefault(\"Kind\", \"\") = \"network\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_result.GetDefault((Object)("Kind"),(Object)(""))).equals((Object)("network"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=48103427;
 //BA.debugLineNum = 48103427;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=48103428;
 //BA.debugLineNum = 48103428;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=48103430;
 //BA.debugLineNum = 48103430;BA.debugLine="If stateStore.HasLocalPlaybackFallback Then";

case 4:
//if
this.state = 7;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._haslocalplaybackfallback /*boolean*/ (null)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=48103431;
 //BA.debugLineNum = 48103431;BA.debugLine="stateStore.TraceLog(\"fallback выбор mode=local r";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback выбор mode=local reason=data_fetch_error");
RDebugUtils.currentLine=48103432;
 //BA.debugLineNum = 48103432;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=48103433;
 //BA.debugLineNum = 48103433;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=48103435;
 //BA.debugLineNum = 48103435;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=48103436;
 //BA.debugLineNum = 48103436;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=48103437;
 //BA.debugLineNum = 48103437;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=47972352;
 //BA.debugLineNum = 47972352;BA.debugLine="Public Sub HandleLocalTemporaryState(text As Strin";
RDebugUtils.currentLine=47972353;
 //BA.debugLineNum = 47972353;BA.debugLine="Dim fallbackReady As Boolean = stateStore.HasLoca";
_fallbackready = __ref._statestore /*b4j.example.playerstatestore*/ ._haslocalplaybackfallback /*boolean*/ (null);
RDebugUtils.currentLine=47972354;
 //BA.debugLineNum = 47972354;BA.debugLine="stateStore.TraceLog(\"состояние local_empty fallba";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние local_empty fallbackReady="+BA.ObjectToString(_fallbackready)+" text="+_text);
RDebugUtils.currentLine=47972355;
 //BA.debugLineNum = 47972355;BA.debugLine="If fallbackReady Then stateStore.TraceLog(\"fallba";
if (_fallbackready) { 
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback выбор mode=local_ready reason=playable_local_fallback");};
RDebugUtils.currentLine=47972356;
 //BA.debugLineNum = 47972356;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"local_me";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","local_media_unavailable");
RDebugUtils.currentLine=47972357;
 //BA.debugLineNum = 47972357;BA.debugLine="If fallbackReady Then";
if (_fallbackready) { 
RDebugUtils.currentLine=47972358;
 //BA.debugLineNum = 47972358;BA.debugLine="stateStore.EnterLocalPlayback";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterlocalplayback /*String*/ (null);
 }else {
RDebugUtils.currentLine=47972360;
 //BA.debugLineNum = 47972360;BA.debugLine="stateStore.ApplyTemporaryMode(\"local_empty\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._applytemporarymode /*String*/ (null,"local_empty");
 };
RDebugUtils.currentLine=47972362;
 //BA.debugLineNum = 47972362;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=47972363;
 //BA.debugLineNum = 47972363;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=47972364;
 //BA.debugLineNum = 47972364;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=47972365;
 //BA.debugLineNum = 47972365;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=47972366;
 //BA.debugLineNum = 47972366;BA.debugLine="stateStore.ShowMessage(text)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_text);
 }else {
RDebugUtils.currentLine=47972368;
 //BA.debugLineNum = 47972368;BA.debugLine="stateStore.ShowMessage(\"Нет локальных треков\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,"Нет локальных треков");
 };
RDebugUtils.currentLine=47972370;
 //BA.debugLineNum = 47972370;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=48365569;
 //BA.debugLineNum = 48365569;BA.debugLine="stateStore.SetPlaybackFlowState(\"error\", \"media_e";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"error","media_error");
RDebugUtils.currentLine=48365570;
 //BA.debugLineNum = 48365570;BA.debugLine="If stateStore.HasLocalPlaybackFallback Then";
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
RDebugUtils.currentLine=48365571;
 //BA.debugLineNum = 48365571;BA.debugLine="stateStore.TraceLog(\"fallback выбор mode=local r";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback выбор mode=local reason=media_error");
RDebugUtils.currentLine=48365572;
 //BA.debugLineNum = 48365572;BA.debugLine="ActivateLocalFallback(True, \"media_failure\")";
__ref._activatelocalfallback /*String*/ (null,parent.__c.True,"media_failure");
RDebugUtils.currentLine=48365573;
 //BA.debugLineNum = 48365573;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=48365575;
 //BA.debugLineNum = 48365575;BA.debugLine="HandleLocalTemporaryState(\"Нет локальных треков\")";
__ref._handlelocaltemporarystate /*String*/ (null,"Нет локальных треков");
RDebugUtils.currentLine=48365576;
 //BA.debugLineNum = 48365576;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=48365577;
 //BA.debugLineNum = 48365577;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=48037888;
 //BA.debugLineNum = 48037888;BA.debugLine="Public Sub HandleShutdownMessage(text As String)";
RDebugUtils.currentLine=48037889;
 //BA.debugLineNum = 48037889;BA.debugLine="Dim safeText As String = text";
_safetext = _text;
RDebugUtils.currentLine=48037890;
 //BA.debugLineNum = 48037890;BA.debugLine="If safeText = \"\" Then safeText = stateStore.Messa";
if ((_safetext).equals("")) { 
_safetext = __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"server_wait");};
RDebugUtils.currentLine=48037891;
 //BA.debugLineNum = 48037891;BA.debugLine="stateStore.TraceLog(\"message shutdown text=\" & sa";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"message shutdown text="+_safetext);
RDebugUtils.currentLine=48037892;
 //BA.debugLineNum = 48037892;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"shutdown";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","shutdown");
RDebugUtils.currentLine=48037893;
 //BA.debugLineNum = 48037893;BA.debugLine="stateStore.ClearPolicyPauseAndResumeRequest";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=48037894;
 //BA.debugLineNum = 48037894;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=48037895;
 //BA.debugLineNum = 48037895;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=48037896;
 //BA.debugLineNum = 48037896;BA.debugLine="stateStore.EnterUserStoppedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=48037897;
 //BA.debugLineNum = 48037897;BA.debugLine="stateStore.SetPlayIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplayicon /*String*/ (null);
RDebugUtils.currentLine=48037898;
 //BA.debugLineNum = 48037898;BA.debugLine="stateStore.ShowMessage(safeText)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_safetext);
RDebugUtils.currentLine=48037899;
 //BA.debugLineNum = 48037899;BA.debugLine="stateStore.DisableBackgroundRefreshTimers";
__ref._statestore /*b4j.example.playerstatestore*/ ._disablebackgroundrefreshtimers /*String*/ (null);
RDebugUtils.currentLine=48037900;
 //BA.debugLineNum = 48037900;BA.debugLine="End Sub";
return "";
}
public String  _handletemporarystate(b4j.example.playbackdatacoordinator __ref,String _mode,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "handletemporarystate", false))
	 {return ((String) Debug.delegate(ba, "handletemporarystate", new Object[] {_mode,_text}));}
RDebugUtils.currentLine=47710208;
 //BA.debugLineNum = 47710208;BA.debugLine="Public Sub HandleTemporaryState(mode As String, te";
RDebugUtils.currentLine=47710209;
 //BA.debugLineNum = 47710209;BA.debugLine="stateStore.TraceLog(\"состояние temporary mode=\" &";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние temporary mode="+_mode+" text="+_text);
RDebugUtils.currentLine=47710210;
 //BA.debugLineNum = 47710210;BA.debugLine="stateStore.ApplyTemporaryMode(mode)";
__ref._statestore /*b4j.example.playerstatestore*/ ._applytemporarymode /*String*/ (null,_mode);
RDebugUtils.currentLine=47710211;
 //BA.debugLineNum = 47710211;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=47710212;
 //BA.debugLineNum = 47710212;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=47710213;
 //BA.debugLineNum = 47710213;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=47710214;
 //BA.debugLineNum = 47710214;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=47710215;
 //BA.debugLineNum = 47710215;BA.debugLine="stateStore.ShowMessage(text)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_text);
 }else 
{RDebugUtils.currentLine=47710216;
 //BA.debugLineNum = 47710216;BA.debugLine="Else If mode = \"network\" Then";
if ((_mode).equals("network")) { 
RDebugUtils.currentLine=47710217;
 //BA.debugLineNum = 47710217;BA.debugLine="stateStore.ShowMessage(\"Проверьте интернет\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,"Проверьте интернет");
 }else {
RDebugUtils.currentLine=47710219;
 //BA.debugLineNum = 47710219;BA.debugLine="stateStore.ShowMessage(stateStore.MessageValue(\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"server_wait"));
 }}
;
RDebugUtils.currentLine=47710221;
 //BA.debugLineNum = 47710221;BA.debugLine="stateStore.ScheduleRetry(mode, 0)";
__ref._statestore /*b4j.example.playerstatestore*/ ._scheduleretry /*String*/ (null,_mode,(int) (0));
RDebugUtils.currentLine=47710222;
 //BA.debugLineNum = 47710222;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.BA _ba,b4j.example.playerstatestore _store,b4j.example.networksyncservice _syncworker) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_store,_syncworker}));}
RDebugUtils.currentLine=47251456;
 //BA.debugLineNum = 47251456;BA.debugLine="Public Sub Initialize(store As PlayerStateStore, s";
RDebugUtils.currentLine=47251457;
 //BA.debugLineNum = 47251457;BA.debugLine="stateStore = store";
__ref._statestore /*b4j.example.playerstatestore*/  = _store;
RDebugUtils.currentLine=47251458;
 //BA.debugLineNum = 47251458;BA.debugLine="syncService = syncWorker";
__ref._syncservice /*b4j.example.networksyncservice*/  = _syncworker;
RDebugUtils.currentLine=47251459;
 //BA.debugLineNum = 47251459;BA.debugLine="End Sub";
return "";
}
public boolean  _isplaybackallowed(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data,long _effectivenowticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "isplaybackallowed", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackallowed", new Object[] {_data,_effectivenowticks}));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
long _endtimestamp = 0L;
RDebugUtils.currentLine=47316992;
 //BA.debugLineNum = 47316992;BA.debugLine="Public Sub IsPlaybackAllowed(data As Map, effectiv";
RDebugUtils.currentLine=47316993;
 //BA.debugLineNum = 47316993;BA.debugLine="If data.IsInitialized = False Then Return True";
if (_data.IsInitialized()==__c.False) { 
if (true) return __c.True;};
RDebugUtils.currentLine=47316994;
 //BA.debugLineNum = 47316994;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=47316995;
 //BA.debugLineNum = 47316995;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
if (_playerdata.IsInitialized() && _playerdata.ContainsKey((Object)("playback_allowed"))) { 
RDebugUtils.currentLine=47316996;
 //BA.debugLineNum = 47316996;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
if ((_playerdata.GetDefault((Object)("playback_allowed"),(Object)(__c.True))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
 };
RDebugUtils.currentLine=47316998;
 //BA.debugLineNum = 47316998;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
_endtimestamp = __ref._resolveplaybackendtimestamp /*long*/ (null,_data);
RDebugUtils.currentLine=47316999;
 //BA.debugLineNum = 47316999;BA.debugLine="If endTimestamp <= 0 Then Return True";
if (_endtimestamp<=0) { 
if (true) return __c.True;};
RDebugUtils.currentLine=47317000;
 //BA.debugLineNum = 47317000;BA.debugLine="Return effectiveNowTicks < (endTimestamp * 1000)";
if (true) return _effectivenowticks<(_endtimestamp*1000);
RDebugUtils.currentLine=47317001;
 //BA.debugLineNum = 47317001;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=47644673;
 //BA.debugLineNum = 47644673;BA.debugLine="If stateStore.PlayerCodeValue = \"\" Then Return Fa";
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
RDebugUtils.currentLine=47644674;
 //BA.debugLineNum = 47644674;BA.debugLine="If stateStore.BeginOfflineDataRefresh = False The";
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
RDebugUtils.currentLine=47644675;
 //BA.debugLineNum = 47644675;BA.debugLine="stateStore.TraceInfo(\"network\", \"запрос данных\",";
__ref._statestore /*b4j.example.playerstatestore*/ ._traceinfo /*String*/ (null,"network","запрос данных","");
RDebugUtils.currentLine=47644676;
 //BA.debugLineNum = 47644676;BA.debugLine="Wait For (syncService.FetchData(fetchTimeoutMs))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackdatacoordinator", "refreshofflinedatanow"), __ref._syncservice /*b4j.example.networksyncservice*/ ._fetchdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_fetchtimeoutms));
this.state = 55;
return;
case 55:
//C
this.state = 13;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=47644677;
 //BA.debugLineNum = 47644677;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
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
RDebugUtils.currentLine=47644678;
 //BA.debugLineNum = 47644678;BA.debugLine="stateStore.IncrementNetworkErrorCount";
__ref._statestore /*b4j.example.playerstatestore*/ ._incrementnetworkerrorcount /*String*/ (null);
RDebugUtils.currentLine=47644679;
 //BA.debugLineNum = 47644679;BA.debugLine="stateStore.TraceWarn(\"network\", \"data ошибка\", \"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data ошибка","kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+" lastDataOkAgoSec="+__ref._statestore /*b4j.example.playerstatestore*/ ._secondsagotext /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._getlastdataokat /*long*/ (null)));
RDebugUtils.currentLine=47644680;
 //BA.debugLineNum = 47644680;BA.debugLine="stateStore.EndOfflineDataRefresh(\"http_failed\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"http_failed");
RDebugUtils.currentLine=47644681;
 //BA.debugLineNum = 47644681;BA.debugLine="stateStore.WriteHealthSnapshot(\"ошибка_data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"ошибка_data");
RDebugUtils.currentLine=47644682;
 //BA.debugLineNum = 47644682;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=47644684;
 //BA.debugLineNum = 47644684;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=47644685;
 //BA.debugLineNum = 47644685;BA.debugLine="If resultData Is Map Then";
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
RDebugUtils.currentLine=47644686;
 //BA.debugLineNum = 47644686;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=47644687;
 //BA.debugLineNum = 47644687;BA.debugLine="If data.GetDefault(\"ok\", False) = True And data.";
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
RDebugUtils.currentLine=47644688;
 //BA.debugLineNum = 47644688;BA.debugLine="stateStore.SetLastDataOkNow";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastdataoknow /*String*/ (null);
RDebugUtils.currentLine=47644689;
 //BA.debugLineNum = 47644689;BA.debugLine="stateStore.ResetConsecutiveNetworkErrors";
__ref._statestore /*b4j.example.playerstatestore*/ ._resetconsecutivenetworkerrors /*String*/ (null);
RDebugUtils.currentLine=47644690;
 //BA.debugLineNum = 47644690;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"data";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"data");
RDebugUtils.currentLine=47644691;
 //BA.debugLineNum = 47644691;BA.debugLine="UpdateTrustedOnlineTimeFromData(data, stateStor";
__ref._updatetrustedonlinetimefromdata /*String*/ (null,_data,__ref._statestore /*b4j.example.playerstatestore*/ ._storage /*b4j.example.keyvaluestore*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._trustedsynctimekey /*String*/ (null));
RDebugUtils.currentLine=47644692;
 //BA.debugLineNum = 47644692;BA.debugLine="stateStore.SaveOfflineData(data)";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveofflinedata /*String*/ (null,_data);
RDebugUtils.currentLine=47644693;
 //BA.debugLineNum = 47644693;BA.debugLine="stateStore.CheckForAppUpdate(data)";
__ref._statestore /*b4j.example.playerstatestore*/ ._checkforappupdate /*String*/ (null,_data);
RDebugUtils.currentLine=47644694;
 //BA.debugLineNum = 47644694;BA.debugLine="If stateStore.IsTraceUploadEnabled Then stateSt";
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
RDebugUtils.currentLine=47644695;
 //BA.debugLineNum = 47644695;BA.debugLine="stateStore.InvalidateRelevantTrackIdsCache";
__ref._statestore /*b4j.example.playerstatestore*/ ._invalidaterelevanttrackidscache /*String*/ (null);
RDebugUtils.currentLine=47644696;
 //BA.debugLineNum = 47644696;BA.debugLine="stateStore.SetRemoteDataReady";
__ref._statestore /*b4j.example.playerstatestore*/ ._setremotedataready /*String*/ (null);
RDebugUtils.currentLine=47644697;
 //BA.debugLineNum = 47644697;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=47644698;
 //BA.debugLineNum = 47644698;BA.debugLine="stateStore.TraceInfo(\"network\", \"data загружены";
__ref._statestore /*b4j.example.playerstatestore*/ ._traceinfo /*String*/ (null,"network","data загружены","trace="+BA.ObjectToString(__ref._statestore /*b4j.example.playerstatestore*/ ._istraceuploadenabled /*boolean*/ (null)));
RDebugUtils.currentLine=47644699;
 //BA.debugLineNum = 47644699;BA.debugLine="stateStore.WriteHealthSnapshot(\"data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"data");
RDebugUtils.currentLine=47644700;
 //BA.debugLineNum = 47644700;BA.debugLine="Wait For (stateStore.SyncOfflinePlaylistMetadat";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackdatacoordinator", "refreshofflinedatanow"), __ref._statestore /*b4j.example.playerstatestore*/ ._syncofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 56;
return;
case 56:
//C
this.state = 29;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=47644701;
 //BA.debugLineNum = 47644701;BA.debugLine="If stateStore.IsStartupSequenceInProgress Then";
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
RDebugUtils.currentLine=47644702;
 //BA.debugLineNum = 47644702;BA.debugLine="stateStore.DeferAdWarmupAfterStartup";
__ref._statestore /*b4j.example.playerstatestore*/ ._deferadwarmupafterstartup /*String*/ (null);
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=47644704;
 //BA.debugLineNum = 47644704;BA.debugLine="stateStore.EnsureAdCacheSyncAsync";
__ref._statestore /*b4j.example.playerstatestore*/ ._ensureadcachesyncasync /*String*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=47644706;
 //BA.debugLineNum = 47644706;BA.debugLine="If IsPlaybackAllowed(stateStore.OfflineData, st";

case 34:
//if
this.state = 37;
if (__ref._isplaybackallowed /*boolean*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._effectivenowticks /*long*/ (null))==parent.__c.False) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=47644707;
 //BA.debugLineNum = 47644707;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReas";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._resolveplaybackblockreason /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._effectivenowticks /*long*/ (null)),"server");
RDebugUtils.currentLine=47644708;
 //BA.debugLineNum = 47644708;BA.debugLine="stateStore.EndOfflineDataRefresh(\"data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"data");
RDebugUtils.currentLine=47644709;
 //BA.debugLineNum = 47644709;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=47644711;
 //BA.debugLineNum = 47644711;BA.debugLine="If stateStore.ResumePlaybackWhenServerAllows An";

case 37:
//if
this.state = 40;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._resumeplaybackwhenserverallows /*boolean*/ (null) && __ref._statestore /*b4j.example.playerstatestore*/ ._shouldresumewithnewstart /*boolean*/ (null)==parent.__c.False && __ref._statestore /*b4j.example.playerstatestore*/ ._isuserstoppedstate /*boolean*/ (null)==parent.__c.False && __ref._statestore /*b4j.example.playerstatestore*/ ._isstopping /*boolean*/ (null)==parent.__c.False) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=47644712;
 //BA.debugLineNum = 47644712;BA.debugLine="stateStore.TraceLog(\"policy resume авто mode=s";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"policy resume авто mode=server_allow");
RDebugUtils.currentLine=47644713;
 //BA.debugLineNum = 47644713;BA.debugLine="stateStore.ClearResumePlaybackWhenServerAllows";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearresumeplaybackwhenserverallows /*String*/ (null);
RDebugUtils.currentLine=47644714;
 //BA.debugLineNum = 47644714;BA.debugLine="stateStore.EnterStartedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=47644715;
 //BA.debugLineNum = 47644715;BA.debugLine="stateStore.SetStopIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setstopicon /*String*/ (null);
RDebugUtils.currentLine=47644716;
 //BA.debugLineNum = 47644716;BA.debugLine="stateStore.HideContentBlocks";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=47644717;
 //BA.debugLineNum = 47644717;BA.debugLine="stateStore.ResumePlaybackAfterPolicyPauseAsync";
__ref._statestore /*b4j.example.playerstatestore*/ ._resumeplaybackafterpolicypauseasync /*String*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=47644719;
 //BA.debugLineNum = 47644719;BA.debugLine="If stateStore.IsPolicyPauseState Then";

case 40:
//if
this.state = 47;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._ispolicypausestate /*boolean*/ (null)) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=47644720;
 //BA.debugLineNum = 47644720;BA.debugLine="stateStore.ClearPolicyPause";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=47644721;
 //BA.debugLineNum = 47644721;BA.debugLine="If stateStore.IsUserStoppedState = False And s";
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
RDebugUtils.currentLine=47644722;
 //BA.debugLineNum = 47644722;BA.debugLine="stateStore.TraceLog(\"policy resume авто mode=";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"policy resume авто mode=policy_pause_clear");
RDebugUtils.currentLine=47644723;
 //BA.debugLineNum = 47644723;BA.debugLine="stateStore.EnterStartedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=47644724;
 //BA.debugLineNum = 47644724;BA.debugLine="stateStore.SetStopIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setstopicon /*String*/ (null);
RDebugUtils.currentLine=47644725;
 //BA.debugLineNum = 47644725;BA.debugLine="stateStore.HideContentBlocks";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=47644726;
 //BA.debugLineNum = 47644726;BA.debugLine="stateStore.ResumePlaybackAfterPolicyPauseAsyn";
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
RDebugUtils.currentLine=47644729;
 //BA.debugLineNum = 47644729;BA.debugLine="stateStore.EndOfflineDataRefresh(\"data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"data");
RDebugUtils.currentLine=47644730;
 //BA.debugLineNum = 47644730;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=47644732;
 //BA.debugLineNum = 47644732;BA.debugLine="If data.GetDefault(\"type\", \"\") = \"message\" Then";

case 48:
//if
this.state = 51;
if ((_data.GetDefault((Object)("type"),(Object)(""))).equals((Object)("message"))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=47644733;
 //BA.debugLineNum = 47644733;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"mess";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"message");
RDebugUtils.currentLine=47644734;
 //BA.debugLineNum = 47644734;BA.debugLine="stateStore.TraceWarn(\"network\", \"data сообщение";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data сообщение","action="+BA.ObjectToString(_data.GetDefault((Object)("action"),(Object)("")))+" reason="+BA.ObjectToString(_data.GetDefault((Object)("reason"),(Object)(""))));
RDebugUtils.currentLine=47644735;
 //BA.debugLineNum = 47644735;BA.debugLine="stateStore.HandleMessageItem(data)";
__ref._statestore /*b4j.example.playerstatestore*/ ._handlemessageitem /*String*/ (null,_data);
RDebugUtils.currentLine=47644736;
 //BA.debugLineNum = 47644736;BA.debugLine="stateStore.EndOfflineDataRefresh(\"message\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"message");
RDebugUtils.currentLine=47644737;
 //BA.debugLineNum = 47644737;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 51:
//C
this.state = 54;
;
RDebugUtils.currentLine=47644739;
 //BA.debugLineNum = 47644739;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"inval";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"invalid_data");
RDebugUtils.currentLine=47644740;
 //BA.debugLineNum = 47644740;BA.debugLine="stateStore.TraceWarn(\"network\", \"data некорректн";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data некорректны","type="+BA.ObjectToString(_data.GetDefault((Object)("type"),(Object)("")))+" ok="+BA.ObjectToString(_data.GetDefault((Object)("ok"),(Object)(parent.__c.False))));
RDebugUtils.currentLine=47644741;
 //BA.debugLineNum = 47644741;BA.debugLine="PausePlaybackByPolicy(stateStore.MessageValue(\"i";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"invalid_data_response"),"server");
 if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=47644743;
 //BA.debugLineNum = 47644743;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"inval";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"invalid_payload");
RDebugUtils.currentLine=47644744;
 //BA.debugLineNum = 47644744;BA.debugLine="stateStore.TraceWarn(\"network\", \"data некорректн";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data некорректны","payload=not_map");
RDebugUtils.currentLine=47644745;
 //BA.debugLineNum = 47644745;BA.debugLine="PausePlaybackByPolicy(stateStore.MessageValue(\"i";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"invalid_data_response"),"server");
 if (true) break;

case 54:
//C
this.state = -1;
;
RDebugUtils.currentLine=47644747;
 //BA.debugLineNum = 47644747;BA.debugLine="stateStore.EndOfflineDataRefresh(stateStore.LastO";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._lastofflinedatarefreshstate /*String*/ (null));
RDebugUtils.currentLine=47644748;
 //BA.debugLineNum = 47644748;BA.debugLine="stateStore.WriteHealthSnapshot(\"ошибка_data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"ошибка_data");
RDebugUtils.currentLine=47644749;
 //BA.debugLineNum = 47644749;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=47644750;
 //BA.debugLineNum = 47644750;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=48300032;
 //BA.debugLineNum = 48300032;BA.debugLine="Public Sub ResetRetryDelay(localRetryInitial As In";
RDebugUtils.currentLine=48300033;
 //BA.debugLineNum = 48300033;BA.debugLine="stateStore.ResetRetryDelayState(localRetryInitial";
__ref._statestore /*b4j.example.playerstatestore*/ ._resetretrydelaystate /*String*/ (null,_localretryinitial,_serverretryinitial);
RDebugUtils.currentLine=48300034;
 //BA.debugLineNum = 48300034;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=47382528;
 //BA.debugLineNum = 47382528;BA.debugLine="Public Sub ResolvePlaybackBlockReason(data As Map,";
RDebugUtils.currentLine=47382529;
 //BA.debugLineNum = 47382529;BA.debugLine="If data.IsInitialized = False Then Return stateSt";
if (_data.IsInitialized()==__c.False) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");};
RDebugUtils.currentLine=47382530;
 //BA.debugLineNum = 47382530;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=47382531;
 //BA.debugLineNum = 47382531;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
RDebugUtils.currentLine=47382532;
 //BA.debugLineNum = 47382532;BA.debugLine="Dim pauseReason As String = playerData.GetDefaul";
_pausereason = BA.ObjectToString(_playerdata.GetDefault((Object)("pause_reason"),(Object)("")));
RDebugUtils.currentLine=47382533;
 //BA.debugLineNum = 47382533;BA.debugLine="If pauseReason <> \"\" Then Return pauseReason";
if ((_pausereason).equals("") == false) { 
if (true) return _pausereason;};
 };
RDebugUtils.currentLine=47382535;
 //BA.debugLineNum = 47382535;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
_endtimestamp = __ref._resolveplaybackendtimestamp /*long*/ (null,_data);
RDebugUtils.currentLine=47382536;
 //BA.debugLineNum = 47382536;BA.debugLine="If endTimestamp > 0 And effectiveNowTicks >= (end";
if (_endtimestamp>0 && _effectivenowticks>=(_endtimestamp*1000)) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"subscription_expired");};
RDebugUtils.currentLine=47382537;
 //BA.debugLineNum = 47382537;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
if (_playerdata.IsInitialized() && _playerdata.ContainsKey((Object)("playback_allowed"))) { 
RDebugUtils.currentLine=47382538;
 //BA.debugLineNum = 47382538;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
if ((_playerdata.GetDefault((Object)("playback_allowed"),(Object)(__c.True))).equals((Object)(__c.True)) == false) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");};
 };
RDebugUtils.currentLine=47382540;
 //BA.debugLineNum = 47382540;BA.debugLine="Return stateStore.MessageValue(\"playback_paused\")";
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");
RDebugUtils.currentLine=47382541;
 //BA.debugLineNum = 47382541;BA.debugLine="End Sub";
return "";
}
public String  _scheduleretry(b4j.example.playbackdatacoordinator __ref,String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "scheduleretry", false))
	 {return ((String) Debug.delegate(ba, "scheduleretry", new Object[] {_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay}));}
RDebugUtils.currentLine=48234496;
 //BA.debugLineNum = 48234496;BA.debugLine="Public Sub ScheduleRetry(mode As String, delayMs A";
RDebugUtils.currentLine=48234497;
 //BA.debugLineNum = 48234497;BA.debugLine="stateStore.ClearRetryTimer";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=48234498;
 //BA.debugLineNum = 48234498;BA.debugLine="stateStore.SetLastRetryMode(mode)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastretrymode /*String*/ (null,_mode);
RDebugUtils.currentLine=48234499;
 //BA.debugLineNum = 48234499;BA.debugLine="stateStore.SetRetryInterval(ResolveRetryDelay(mod";
__ref._statestore /*b4j.example.playerstatestore*/ ._setretryinterval /*String*/ (null,__ref._resolveretrydelay /*int*/ (null,_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay));
RDebugUtils.currentLine=48234500;
 //BA.debugLineNum = 48234500;BA.debugLine="If stateStore.IsPlaybackStarted = False Or stateS";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._isplaybackstarted /*boolean*/ (null)==__c.False || __ref._statestore /*b4j.example.playerstatestore*/ ._isstoppedbyuser /*boolean*/ (null)) { 
if (true) return "";};
RDebugUtils.currentLine=48234501;
 //BA.debugLineNum = 48234501;BA.debugLine="If stateStore.IsPlaybackPausedByPolicy And mode <";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._isplaybackpausedbypolicy /*boolean*/ (null) && (_mode).equals("blocked") == false && (_mode).equals("audio_device") == false) { 
if (true) return "";};
RDebugUtils.currentLine=48234502;
 //BA.debugLineNum = 48234502;BA.debugLine="stateStore.TraceWarn(\"network\", \"переход в retry\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","переход в retry","mode="+_mode+" delaySec="+BA.NumberToString(__c.Floor(__ref._statestore /*b4j.example.playerstatestore*/ ._getretryinterval /*int*/ (null)/(double)1000)));
RDebugUtils.currentLine=48234503;
 //BA.debugLineNum = 48234503;BA.debugLine="stateStore.WriteHealthSnapshot(\"retry\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"retry");
RDebugUtils.currentLine=48234504;
 //BA.debugLineNum = 48234504;BA.debugLine="stateStore.EnableRetryTimer";
__ref._statestore /*b4j.example.playerstatestore*/ ._enableretrytimer /*String*/ (null);
RDebugUtils.currentLine=48234505;
 //BA.debugLineNum = 48234505;BA.debugLine="End Sub";
return "";
}
public String  _stopformissingdata(b4j.example.playbackdatacoordinator __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "stopformissingdata", false))
	 {return ((String) Debug.delegate(ba, "stopformissingdata", new Object[] {_text}));}
RDebugUtils.currentLine=47841280;
 //BA.debugLineNum = 47841280;BA.debugLine="Public Sub StopForMissingData(text As String)";
RDebugUtils.currentLine=47841281;
 //BA.debugLineNum = 47841281;BA.debugLine="stateStore.TraceLog(\"состояние stop reason=missin";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние stop reason=missing_data text="+_text);
RDebugUtils.currentLine=47841282;
 //BA.debugLineNum = 47841282;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"missing_";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","missing_data");
RDebugUtils.currentLine=47841283;
 //BA.debugLineNum = 47841283;BA.debugLine="stateStore.ClearPolicyPauseAndResumeRequest";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=47841284;
 //BA.debugLineNum = 47841284;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=47841285;
 //BA.debugLineNum = 47841285;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=47841286;
 //BA.debugLineNum = 47841286;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=47841287;
 //BA.debugLineNum = 47841287;BA.debugLine="stateStore.EnterUserStoppedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=47841288;
 //BA.debugLineNum = 47841288;BA.debugLine="stateStore.SetPlayIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplayicon /*String*/ (null);
RDebugUtils.currentLine=47841289;
 //BA.debugLineNum = 47841289;BA.debugLine="stateStore.ShowMessage(text)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_text);
RDebugUtils.currentLine=47841290;
 //BA.debugLineNum = 47841290;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=49086464;
 //BA.debugLineNum = 49086464;BA.debugLine="Private Sub IsIdleSlot(slotContext As Map) As Bool";
RDebugUtils.currentLine=49086465;
 //BA.debugLineNum = 49086465;BA.debugLine="If slotContext.IsInitialized = False Or slotConte";
if (_slotcontext.IsInitialized()==__c.False || _slotcontext.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=49086466;
 //BA.debugLineNum = 49086466;BA.debugLine="Dim playlists As List = slotContext.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slotcontext.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=49086467;
 //BA.debugLineNum = 49086467;BA.debugLine="If playlists.IsInitialized And playlists.Size > 0";
if (_playlists.IsInitialized() && _playlists.getSize()>0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=49086468;
 //BA.debugLineNum = 49086468;BA.debugLine="Dim streamId As String = slotContext.GetDefault(\"";
_streamid = BA.ObjectToString(_slotcontext.GetDefault((Object)("stream_id"),(Object)("")));
RDebugUtils.currentLine=49086469;
 //BA.debugLineNum = 49086469;BA.debugLine="Dim streamTitle As String = slotContext.GetDefaul";
_streamtitle = BA.ObjectToString(_slotcontext.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=49086470;
 //BA.debugLineNum = 49086470;BA.debugLine="Return streamId = \"\" And streamTitle = \"\"";
if (true) return (_streamid).equals("") && (_streamtitle).equals("");
RDebugUtils.currentLine=49086471;
 //BA.debugLineNum = 49086471;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.playbackdatacoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
RDebugUtils.currentLine=47185920;
 //BA.debugLineNum = 47185920;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=47185921;
 //BA.debugLineNum = 47185921;BA.debugLine="Private stateStore As PlayerStateStore";
_statestore = new b4j.example.playerstatestore();
RDebugUtils.currentLine=47185922;
 //BA.debugLineNum = 47185922;BA.debugLine="Private syncService As NetworkSyncService";
_syncservice = new b4j.example.networksyncservice();
RDebugUtils.currentLine=47185923;
 //BA.debugLineNum = 47185923;BA.debugLine="End Sub";
return "";
}
public int  _countcachedtracksinplaylist(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "countcachedtracksinplaylist", false))
	 {return ((Integer) Debug.delegate(ba, "countcachedtracksinplaylist", new Object[] {_playlistdata}));}
anywheresoftware.b4a.objects.collections.List _tracks = null;
int _totalcount = 0;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
RDebugUtils.currentLine=48627712;
 //BA.debugLineNum = 48627712;BA.debugLine="Private Sub CountCachedTracksInPlaylist(playlistDa";
RDebugUtils.currentLine=48627713;
 //BA.debugLineNum = 48627713;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=48627714;
 //BA.debugLineNum = 48627714;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=48627715;
 //BA.debugLineNum = 48627715;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=48627716;
 //BA.debugLineNum = 48627716;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
RDebugUtils.currentLine=48627717;
 //BA.debugLineNum = 48627717;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group5 = _tracks;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_trackobject = group5.Get(index5);
RDebugUtils.currentLine=48627718;
 //BA.debugLineNum = 48627718;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=48627719;
 //BA.debugLineNum = 48627719;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=48627720;
 //BA.debugLineNum = 48627720;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=48627721;
 //BA.debugLineNum = 48627721;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=48627722;
 //BA.debugLineNum = 48627722;BA.debugLine="If stateStore.IsTrackCached(trackId) = False The";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._istrackcached /*boolean*/ (null,_trackid)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=48627723;
 //BA.debugLineNum = 48627723;BA.debugLine="totalCount = totalCount + 1";
_totalcount = (int) (_totalcount+1);
 }
};
RDebugUtils.currentLine=48627725;
 //BA.debugLineNum = 48627725;BA.debugLine="Return totalCount";
if (true) return _totalcount;
RDebugUtils.currentLine=48627726;
 //BA.debugLineNum = 48627726;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.playbackdatacoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=49020928;
 //BA.debugLineNum = 49020928;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=49020929;
 //BA.debugLineNum = 49020929;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49020930;
 //BA.debugLineNum = 49020930;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=49020931;
 //BA.debugLineNum = 49020931;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=49020932;
 //BA.debugLineNum = 49020932;BA.debugLine="End Sub";
return null;
}
public boolean  _hasplayablelocaltrackincurrentslot(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _effectivenowticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "hasplayablelocaltrackincurrentslot", false))
	 {return ((Boolean) Debug.delegate(ba, "hasplayablelocaltrackincurrentslot", new Object[] {_offlinedata,_effectivenowticks}));}
RDebugUtils.currentLine=48496640;
 //BA.debugLineNum = 48496640;BA.debugLine="Public Sub HasPlayableLocalTrackInCurrentSlot(offl";
RDebugUtils.currentLine=48496641;
 //BA.debugLineNum = 48496641;BA.debugLine="Return CountPlayableLocalTracksInCurrentSlot(offl";
if (true) return __ref._countplayablelocaltracksincurrentslot /*int*/ (null,_offlinedata,_effectivenowticks)>0;
RDebugUtils.currentLine=48496642;
 //BA.debugLineNum = 48496642;BA.debugLine="End Sub";
return false;
}
public long  _resolveplaybackendtimestamp(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "resolveplaybackendtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "resolveplaybackendtimestamp", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
long _playerend = 0L;
RDebugUtils.currentLine=47448064;
 //BA.debugLineNum = 47448064;BA.debugLine="Public Sub ResolvePlaybackEndTimestamp(data As Map";
RDebugUtils.currentLine=47448065;
 //BA.debugLineNum = 47448065;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=47448066;
 //BA.debugLineNum = 47448066;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=47448067;
 //BA.debugLineNum = 47448067;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
RDebugUtils.currentLine=47448068;
 //BA.debugLineNum = 47448068;BA.debugLine="Dim playerEnd As Long = ParseEndValueToTimestamp";
_playerend = __ref._parseendvaluetotimestamp /*long*/ (null,_playerdata.Get((Object)("end")));
RDebugUtils.currentLine=47448069;
 //BA.debugLineNum = 47448069;BA.debugLine="If playerEnd > 0 Then Return playerEnd";
if (_playerend>0) { 
if (true) return _playerend;};
 };
RDebugUtils.currentLine=47448071;
 //BA.debugLineNum = 47448071;BA.debugLine="Return ParseEndValueToTimestamp(data.Get(\"end\"))";
if (true) return __ref._parseendvaluetotimestamp /*long*/ (null,_data.Get((Object)("end")));
RDebugUtils.currentLine=47448072;
 //BA.debugLineNum = 47448072;BA.debugLine="End Sub";
return 0L;
}
public long  _parsedateonlyendtimestamp(b4j.example.playbackdatacoordinator __ref,String _textvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "parsedateonlyendtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "parsedateonlyendtimestamp", new Object[] {_textvalue}));}
String _previousdateformat = "";
long _daystartticks = 0L;
RDebugUtils.currentLine=48955392;
 //BA.debugLineNum = 48955392;BA.debugLine="Private Sub ParseDateOnlyEndTimestamp(textValue As";
RDebugUtils.currentLine=48955393;
 //BA.debugLineNum = 48955393;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=48955394;
 //BA.debugLineNum = 48955394;BA.debugLine="Try";
try {RDebugUtils.currentLine=48955395;
 //BA.debugLineNum = 48955395;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=48955396;
 //BA.debugLineNum = 48955396;BA.debugLine="Dim dayStartTicks As Long = DateTime.DateParse(t";
_daystartticks = __c.DateTime.DateParse(_textvalue);
RDebugUtils.currentLine=48955397;
 //BA.debugLineNum = 48955397;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=48955398;
 //BA.debugLineNum = 48955398;BA.debugLine="Return Floor((dayStartTicks + DateTime.TicksPerD";
if (true) return (long) (__c.Floor((_daystartticks+__c.DateTime.TicksPerDay)/(double)1000));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=48955400;
 //BA.debugLineNum = 48955400;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=48955401;
 //BA.debugLineNum = 48955401;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
RDebugUtils.currentLine=48955402;
 //BA.debugLineNum = 48955402;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=48955404;
 //BA.debugLineNum = 48955404;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=48824320;
 //BA.debugLineNum = 48824320;BA.debugLine="Private Sub ParseEndValueToTimestamp(value As Obje";
RDebugUtils.currentLine=48824321;
 //BA.debugLineNum = 48824321;BA.debugLine="If value = Null Then Return 0";
if (_value== null) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=48824322;
 //BA.debugLineNum = 48824322;BA.debugLine="Dim textValue As String = (\"\" & value).Trim";
_textvalue = (""+BA.ObjectToString(_value)).trim();
RDebugUtils.currentLine=48824323;
 //BA.debugLineNum = 48824323;BA.debugLine="If textValue = \"\" Then Return 0";
if ((_textvalue).equals("")) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=48824324;
 //BA.debugLineNum = 48824324;BA.debugLine="If Regex.IsMatch(\"^\\d+$\", textValue) Then Return";
if (__c.Regex.IsMatch("^\\d+$",_textvalue)) { 
if (true) return (long) (__c.Floor((double)(Double.parseDouble(_textvalue))));};
RDebugUtils.currentLine=48824325;
 //BA.debugLineNum = 48824325;BA.debugLine="If Regex.IsMatch(\"^\\d{4}-\\d{2}-\\d{2}$\", textValue";
if (__c.Regex.IsMatch("^\\d{4}-\\d{2}-\\d{2}$",_textvalue)) { 
RDebugUtils.currentLine=48824326;
 //BA.debugLineNum = 48824326;BA.debugLine="Return ParseDateOnlyEndTimestamp(textValue)";
if (true) return __ref._parsedateonlyendtimestamp /*long*/ (null,_textvalue);
 };
RDebugUtils.currentLine=48824328;
 //BA.debugLineNum = 48824328;BA.debugLine="Try";
try {RDebugUtils.currentLine=48824329;
 //BA.debugLineNum = 48824329;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=48824330;
 //BA.debugLineNum = 48824330;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=48824331;
 //BA.debugLineNum = 48824331;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("parse",new Object[]{(Object)(_textvalue)})));
RDebugUtils.currentLine=48824332;
 //BA.debugLineNum = 48824332;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("getEpochSecond",(Object[])(__c.Null)));
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=48824334;
 //BA.debugLineNum = 48824334;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
 };
RDebugUtils.currentLine=48824336;
 //BA.debugLineNum = 48824336;BA.debugLine="Try";
try {RDebugUtils.currentLine=48824337;
 //BA.debugLineNum = 48824337;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
_offsetdatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=48824338;
 //BA.debugLineNum = 48824338;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time.";
_offsetdatetimeclass.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=48824339;
 //BA.debugLineNum = 48824339;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTim";
_offsetdatetime = new anywheresoftware.b4j.object.JavaObject();
_offsetdatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetimeclass.RunMethod("parse",new Object[]{(Object)(_textvalue)})));
RDebugUtils.currentLine=48824340;
 //BA.debugLineNum = 48824340;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunMe";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetime.RunMethod("toInstant",(Object[])(__c.Null))));
RDebugUtils.currentLine=48824341;
 //BA.debugLineNum = 48824341;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("getEpochSecond",(Object[])(__c.Null)));
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=48824343;
 //BA.debugLineNum = 48824343;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
 };
RDebugUtils.currentLine=48824345;
 //BA.debugLineNum = 48824345;BA.debugLine="stateStore.TraceLog(\"player end parse fail value=";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"player end parse fail value="+_textvalue);
RDebugUtils.currentLine=48824346;
 //BA.debugLineNum = 48824346;BA.debugLine="Return 0";
if (true) return (long) (0);
RDebugUtils.currentLine=48824347;
 //BA.debugLineNum = 48824347;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=48889856;
 //BA.debugLineNum = 48889856;BA.debugLine="Private Sub ParseTrustedOnlineTicks(data As Map) A";
RDebugUtils.currentLine=48889857;
 //BA.debugLineNum = 48889857;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=48889858;
 //BA.debugLineNum = 48889858;BA.debugLine="Dim updatedText As String = (\"\" & data.GetDefault";
_updatedtext = (""+BA.ObjectToString(_data.GetDefault((Object)("updated"),(Object)("")))).trim();
RDebugUtils.currentLine=48889859;
 //BA.debugLineNum = 48889859;BA.debugLine="If updatedText = \"\" Then Return 0";
if ((_updatedtext).equals("")) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=48889860;
 //BA.debugLineNum = 48889860;BA.debugLine="Try";
try {RDebugUtils.currentLine=48889861;
 //BA.debugLineNum = 48889861;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=48889862;
 //BA.debugLineNum = 48889862;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=48889863;
 //BA.debugLineNum = 48889863;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("parse",new Object[]{(Object)(_updatedtext)})));
RDebugUtils.currentLine=48889864;
 //BA.debugLineNum = 48889864;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("toEpochMilli",(Object[])(__c.Null)));
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=48889866;
 //BA.debugLineNum = 48889866;BA.debugLine="Try";
try {RDebugUtils.currentLine=48889867;
 //BA.debugLineNum = 48889867;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
_offsetdatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=48889868;
 //BA.debugLineNum = 48889868;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time";
_offsetdatetimeclass.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=48889869;
 //BA.debugLineNum = 48889869;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTi";
_offsetdatetime = new anywheresoftware.b4j.object.JavaObject();
_offsetdatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetimeclass.RunMethod("parse",new Object[]{(Object)(_updatedtext)})));
RDebugUtils.currentLine=48889870;
 //BA.debugLineNum = 48889870;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunM";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetime.RunMethod("toInstant",(Object[])(__c.Null))));
RDebugUtils.currentLine=48889871;
 //BA.debugLineNum = 48889871;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("toEpochMilli",(Object[])(__c.Null)));
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=48889873;
 //BA.debugLineNum = 48889873;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
 };
 };
RDebugUtils.currentLine=48889876;
 //BA.debugLineNum = 48889876;BA.debugLine="Return 0";
if (true) return (long) (0);
RDebugUtils.currentLine=48889877;
 //BA.debugLineNum = 48889877;BA.debugLine="End Sub";
return 0L;
}
public String  _updatetrustedonlinetimefromdata(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data,b4j.example.keyvaluestore _storage,String _storagekey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "updatetrustedonlinetimefromdata", false))
	 {return ((String) Debug.delegate(ba, "updatetrustedonlinetimefromdata", new Object[] {_data,_storage,_storagekey}));}
long _candidateticks = 0L;
RDebugUtils.currentLine=47513600;
 //BA.debugLineNum = 47513600;BA.debugLine="Public Sub UpdateTrustedOnlineTimeFromData(data As";
RDebugUtils.currentLine=47513601;
 //BA.debugLineNum = 47513601;BA.debugLine="Dim candidateTicks As Long = ParseTrustedOnlineTi";
_candidateticks = __ref._parsetrustedonlineticks /*long*/ (null,_data);
RDebugUtils.currentLine=47513602;
 //BA.debugLineNum = 47513602;BA.debugLine="If candidateTicks <= 0 Then candidateTicks = Date";
if (_candidateticks<=0) { 
_candidateticks = __c.DateTime.getNow();};
RDebugUtils.currentLine=47513603;
 //BA.debugLineNum = 47513603;BA.debugLine="UpdateTrustedOnlineTimeTicks(candidateTicks, stor";
__ref._updatetrustedonlinetimeticks /*String*/ (null,_candidateticks,_storage,_storagekey);
RDebugUtils.currentLine=47513604;
 //BA.debugLineNum = 47513604;BA.debugLine="End Sub";
return "";
}
public int  _resolveretrydelay(b4j.example.playbackdatacoordinator __ref,String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "resolveretrydelay", false))
	 {return ((Integer) Debug.delegate(ba, "resolveretrydelay", new Object[] {_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay}));}
RDebugUtils.currentLine=48168960;
 //BA.debugLineNum = 48168960;BA.debugLine="Public Sub ResolveRetryDelay(mode As String, delay";
RDebugUtils.currentLine=48168961;
 //BA.debugLineNum = 48168961;BA.debugLine="Return stateStore.ResolveRetryDelay(mode, delayMs";
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._resolveretrydelay /*int*/ (null,_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay);
RDebugUtils.currentLine=48168962;
 //BA.debugLineNum = 48168962;BA.debugLine="End Sub";
return 0;
}
public String  _updatetrustedonlinetimeticks(b4j.example.playbackdatacoordinator __ref,long _candidateticks,b4j.example.keyvaluestore _storage,String _storagekey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "updatetrustedonlinetimeticks", false))
	 {return ((String) Debug.delegate(ba, "updatetrustedonlinetimeticks", new Object[] {_candidateticks,_storage,_storagekey}));}
long _storedticks = 0L;
RDebugUtils.currentLine=47579136;
 //BA.debugLineNum = 47579136;BA.debugLine="Public Sub UpdateTrustedOnlineTimeTicks(candidateT";
RDebugUtils.currentLine=47579137;
 //BA.debugLineNum = 47579137;BA.debugLine="If candidateTicks <= 0 Then Return";
if (_candidateticks<=0) { 
if (true) return "";};
RDebugUtils.currentLine=47579138;
 //BA.debugLineNum = 47579138;BA.debugLine="Dim storedTicks As Long = storage.GetDefault(stor";
_storedticks = BA.ObjectToLongNumber(_storage._getdefault /*Object*/ (null,_storagekey,(Object)(0)));
RDebugUtils.currentLine=47579139;
 //BA.debugLineNum = 47579139;BA.debugLine="If candidateTicks <= storedTicks Then Return";
if (_candidateticks<=_storedticks) { 
if (true) return "";};
RDebugUtils.currentLine=47579140;
 //BA.debugLineNum = 47579140;BA.debugLine="storage.Put(storageKey, candidateTicks)";
_storage._put /*String*/ (null,_storagekey,(Object)(_candidateticks));
RDebugUtils.currentLine=47579141;
 //BA.debugLineNum = 47579141;BA.debugLine="stateStore.TraceLog(\"trusted time update ticks=\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"trusted time update ticks="+BA.NumberToString(_candidateticks));
RDebugUtils.currentLine=47579142;
 //BA.debugLineNum = 47579142;BA.debugLine="End Sub";
return "";
}
}