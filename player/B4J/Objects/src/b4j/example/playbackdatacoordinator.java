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
RDebugUtils.currentLine=43778048;
 //BA.debugLineNum = 43778048;BA.debugLine="Public Sub AllowRegularAdsAtTargetMinute(offlineDa";
RDebugUtils.currentLine=43778049;
 //BA.debugLineNum = 43778049;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=43778050;
 //BA.debugLineNum = 43778050;BA.debugLine="Dim targetTicks As Long = targetMinuteTimestamp *";
_targetticks = (long) (_targetminutetimestamp*1000);
RDebugUtils.currentLine=43778051;
 //BA.debugLineNum = 43778051;BA.debugLine="Dim targetSlot As Map = stateStore.ResolveDataSlo";
_targetslot = new anywheresoftware.b4a.objects.collections.Map();
_targetslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_targetticks);
RDebugUtils.currentLine=43778052;
 //BA.debugLineNum = 43778052;BA.debugLine="Return IsIdleSlot(targetSlot) = False";
if (true) return __ref._isidleslot /*boolean*/ (null,_targetslot)==__c.False;
RDebugUtils.currentLine=43778053;
 //BA.debugLineNum = 43778053;BA.debugLine="End Sub";
return false;
}
public String  _activatelocalfallback(b4j.example.playbackdatacoordinator __ref,boolean _markdegraded,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "activatelocalfallback", false))
	 {return ((String) Debug.delegate(ba, "activatelocalfallback", new Object[] {_markdegraded,_reason}));}
RDebugUtils.currentLine=86310912;
 //BA.debugLineNum = 86310912;BA.debugLine="Public Sub ActivateLocalFallback(markDegraded As B";
RDebugUtils.currentLine=86310913;
 //BA.debugLineNum = 86310913;BA.debugLine="stateStore.TraceLog(\"fallback activate mode=local";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback activate mode=local reason="+_reason+" degraded="+BA.ObjectToString(_markdegraded));
RDebugUtils.currentLine=86310914;
 //BA.debugLineNum = 86310914;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"switch_l";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","switch_local:"+_reason);
RDebugUtils.currentLine=86310915;
 //BA.debugLineNum = 86310915;BA.debugLine="stateStore.EnterLocalPlayback";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterlocalplayback /*String*/ (null);
RDebugUtils.currentLine=86310916;
 //BA.debugLineNum = 86310916;BA.debugLine="stateStore.SetMediaPathDegraded(markDegraded)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setmediapathdegraded /*String*/ (null,_markdegraded);
RDebugUtils.currentLine=86310917;
 //BA.debugLineNum = 86310917;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=86310918;
 //BA.debugLineNum = 86310918;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=86310919;
 //BA.debugLineNum = 86310919;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=86310920;
 //BA.debugLineNum = 86310920;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=43712512;
 //BA.debugLineNum = 43712512;BA.debugLine="Public Sub ResolveIdleUntilMessage(offlineData As";
RDebugUtils.currentLine=43712513;
 //BA.debugLineNum = 43712513;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=43712514;
 //BA.debugLineNum = 43712514;BA.debugLine="Dim currentSlot As Map = stateStore.ResolveCurren";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvecurrentdataslot /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata);
RDebugUtils.currentLine=43712515;
 //BA.debugLineNum = 43712515;BA.debugLine="If IsIdleSlot(currentSlot) = False Then Return \"\"";
if (__ref._isidleslot /*boolean*/ (null,_currentslot)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=43712516;
 //BA.debugLineNum = 43712516;BA.debugLine="Dim nextSlot As Map = stateStore.ResolveNextDataS";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
_nextslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_effectivenowticks);
RDebugUtils.currentLine=43712517;
 //BA.debugLineNum = 43712517;BA.debugLine="Dim nextTime As String = nextSlot.GetDefault(\"slo";
_nexttime = BA.ObjectToString(_nextslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=43712518;
 //BA.debugLineNum = 43712518;BA.debugLine="If nextTime = \"\" Then Return stateStore.MessageVa";
if ((_nexttime).equals("")) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"idle");};
RDebugUtils.currentLine=43712519;
 //BA.debugLineNum = 43712519;BA.debugLine="Return stateStore.MessageValue(\"idle_until\").Repl";
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"idle_until").replace("{time}",_nexttime);
RDebugUtils.currentLine=43712520;
 //BA.debugLineNum = 43712520;BA.debugLine="End Sub";
return "";
}
public String  _pauseplaybackbypolicy(b4j.example.playbackdatacoordinator __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "pauseplaybackbypolicy", false))
	 {return ((String) Debug.delegate(ba, "pauseplaybackbypolicy", new Object[] {_reason,_connectionmode}));}
String _safereason = "";
RDebugUtils.currentLine=43581440;
 //BA.debugLineNum = 43581440;BA.debugLine="Public Sub PausePlaybackByPolicy(reason As String,";
RDebugUtils.currentLine=43581441;
 //BA.debugLineNum = 43581441;BA.debugLine="Dim safeReason As String = reason";
_safereason = _reason;
RDebugUtils.currentLine=43581442;
 //BA.debugLineNum = 43581442;BA.debugLine="If safeReason = \"\" Then safeReason = stateStore.M";
if ((_safereason).equals("")) { 
_safereason = __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");};
RDebugUtils.currentLine=43581443;
 //BA.debugLineNum = 43581443;BA.debugLine="stateStore.EnterPolicyPause(safeReason, connectio";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterpolicypause /*String*/ (null,_safereason,_connectionmode);
RDebugUtils.currentLine=43581444;
 //BA.debugLineNum = 43581444;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=84213760;
 //BA.debugLineNum = 84213760;BA.debugLine="Public Sub CountPlayableLocalTracksInCurrentSlot(o";
RDebugUtils.currentLine=84213761;
 //BA.debugLineNum = 84213761;BA.debugLine="Dim currentSlot As Map = stateStore.ResolveDataSl";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_effectivenowticks);
RDebugUtils.currentLine=84213762;
 //BA.debugLineNum = 84213762;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=84213763;
 //BA.debugLineNum = 84213763;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=84213764;
 //BA.debugLineNum = 84213764;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=84213765;
 //BA.debugLineNum = 84213765;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
RDebugUtils.currentLine=84213766;
 //BA.debugLineNum = 84213766;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group6 = _playlists;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_playlistobject = group6.Get(index6);
RDebugUtils.currentLine=84213767;
 //BA.debugLineNum = 84213767;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=84213768;
 //BA.debugLineNum = 84213768;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=84213769;
 //BA.debugLineNum = 84213769;BA.debugLine="Dim playlistId As String = playlistDescriptor.G";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=84213770;
 //BA.debugLineNum = 84213770;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=84213771;
 //BA.debugLineNum = 84213771;BA.debugLine="Dim playlistData As Map = stateStore.LoadCached";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = __ref._statestore /*b4j.example.playerstatestore*/ ._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=84213772;
 //BA.debugLineNum = 84213772;BA.debugLine="totalCount = totalCount + CountCachedTracksInPl";
_totalcount = (int) (_totalcount+__ref._countcachedtracksinplaylist /*int*/ (null,_playlistdata));
 };
 }
};
RDebugUtils.currentLine=84213775;
 //BA.debugLineNum = 84213775;BA.debugLine="Return totalCount";
if (true) return _totalcount;
RDebugUtils.currentLine=84213776;
 //BA.debugLineNum = 84213776;BA.debugLine="End Sub";
return 0;
}
public String  _handleblockedstate(b4j.example.playbackdatacoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "handleblockedstate", false))
	 {return ((String) Debug.delegate(ba, "handleblockedstate", null));}
RDebugUtils.currentLine=42926080;
 //BA.debugLineNum = 42926080;BA.debugLine="Public Sub HandleBlockedState";
RDebugUtils.currentLine=42926081;
 //BA.debugLineNum = 42926081;BA.debugLine="stateStore.TraceLog(\"состояние blocked\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние blocked");
RDebugUtils.currentLine=42926082;
 //BA.debugLineNum = 42926082;BA.debugLine="stateStore.EnterPolicyPause(stateStore.MessageVal";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterpolicypause /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"blocked"),"blocked");
RDebugUtils.currentLine=42926083;
 //BA.debugLineNum = 42926083;BA.debugLine="stateStore.ScheduleRetry(\"blocked\", 0)";
__ref._statestore /*b4j.example.playerstatestore*/ ._scheduleretry /*String*/ (null,"blocked",(int) (0));
RDebugUtils.currentLine=42926084;
 //BA.debugLineNum = 42926084;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=43253761;
 //BA.debugLineNum = 43253761;BA.debugLine="stateStore.TraceLog(\"очередь fetch ошибка kind=\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"очередь fetch ошибка kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+" message="+BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)(""))));
RDebugUtils.currentLine=43253762;
 //BA.debugLineNum = 43253762;BA.debugLine="If result.GetDefault(\"Kind\", \"\") = \"network\" Then";
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
RDebugUtils.currentLine=43253763;
 //BA.debugLineNum = 43253763;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=43253764;
 //BA.debugLineNum = 43253764;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=43253766;
 //BA.debugLineNum = 43253766;BA.debugLine="If stateStore.HasLocalPlaybackFallback Then";

case 4:
//if
this.state = 7;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._haslocalplaybackfallback /*boolean*/ (null)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=43253767;
 //BA.debugLineNum = 43253767;BA.debugLine="stateStore.TraceLog(\"fallback выбор mode=local r";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback выбор mode=local reason=data_fetch_error");
RDebugUtils.currentLine=43253768;
 //BA.debugLineNum = 43253768;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=43253769;
 //BA.debugLineNum = 43253769;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=43253771;
 //BA.debugLineNum = 43253771;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=43253772;
 //BA.debugLineNum = 43253772;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=43253773;
 //BA.debugLineNum = 43253773;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=43122688;
 //BA.debugLineNum = 43122688;BA.debugLine="Public Sub HandleLocalTemporaryState(text As Strin";
RDebugUtils.currentLine=43122689;
 //BA.debugLineNum = 43122689;BA.debugLine="Dim fallbackReady As Boolean = stateStore.HasLoca";
_fallbackready = __ref._statestore /*b4j.example.playerstatestore*/ ._haslocalplaybackfallback /*boolean*/ (null);
RDebugUtils.currentLine=43122690;
 //BA.debugLineNum = 43122690;BA.debugLine="stateStore.TraceLog(\"состояние local_empty fallba";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние local_empty fallbackReady="+BA.ObjectToString(_fallbackready)+" text="+_text);
RDebugUtils.currentLine=43122691;
 //BA.debugLineNum = 43122691;BA.debugLine="If fallbackReady Then stateStore.TraceLog(\"fallba";
if (_fallbackready) { 
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback выбор mode=local_ready reason=playable_local_fallback");};
RDebugUtils.currentLine=43122692;
 //BA.debugLineNum = 43122692;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"local_me";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","local_media_unavailable");
RDebugUtils.currentLine=43122693;
 //BA.debugLineNum = 43122693;BA.debugLine="If fallbackReady Then";
if (_fallbackready) { 
RDebugUtils.currentLine=43122694;
 //BA.debugLineNum = 43122694;BA.debugLine="stateStore.EnterLocalPlayback";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterlocalplayback /*String*/ (null);
 }else {
RDebugUtils.currentLine=43122696;
 //BA.debugLineNum = 43122696;BA.debugLine="stateStore.ApplyTemporaryMode(\"local_empty\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._applytemporarymode /*String*/ (null,"local_empty");
 };
RDebugUtils.currentLine=43122698;
 //BA.debugLineNum = 43122698;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=43122699;
 //BA.debugLineNum = 43122699;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=43122700;
 //BA.debugLineNum = 43122700;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=43122701;
 //BA.debugLineNum = 43122701;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=43122702;
 //BA.debugLineNum = 43122702;BA.debugLine="stateStore.ShowMessage(text)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_text);
 }else {
RDebugUtils.currentLine=43122704;
 //BA.debugLineNum = 43122704;BA.debugLine="stateStore.ShowMessage(\"Нет локальных треков\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,"Нет локальных треков");
 };
RDebugUtils.currentLine=43122706;
 //BA.debugLineNum = 43122706;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=43515905;
 //BA.debugLineNum = 43515905;BA.debugLine="stateStore.SetPlaybackFlowState(\"error\", \"media_e";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"error","media_error");
RDebugUtils.currentLine=43515906;
 //BA.debugLineNum = 43515906;BA.debugLine="If stateStore.HasLocalPlaybackFallback Then";
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
RDebugUtils.currentLine=43515907;
 //BA.debugLineNum = 43515907;BA.debugLine="stateStore.TraceLog(\"fallback выбор mode=local r";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback выбор mode=local reason=media_error");
RDebugUtils.currentLine=43515908;
 //BA.debugLineNum = 43515908;BA.debugLine="ActivateLocalFallback(True, \"media_failure\")";
__ref._activatelocalfallback /*String*/ (null,parent.__c.True,"media_failure");
RDebugUtils.currentLine=43515909;
 //BA.debugLineNum = 43515909;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=43515911;
 //BA.debugLineNum = 43515911;BA.debugLine="HandleLocalTemporaryState(\"Нет локальных треков\")";
__ref._handlelocaltemporarystate /*String*/ (null,"Нет локальных треков");
RDebugUtils.currentLine=43515912;
 //BA.debugLineNum = 43515912;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=43515913;
 //BA.debugLineNum = 43515913;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=43188224;
 //BA.debugLineNum = 43188224;BA.debugLine="Public Sub HandleShutdownMessage(text As String)";
RDebugUtils.currentLine=43188225;
 //BA.debugLineNum = 43188225;BA.debugLine="Dim safeText As String = text";
_safetext = _text;
RDebugUtils.currentLine=43188226;
 //BA.debugLineNum = 43188226;BA.debugLine="If safeText = \"\" Then safeText = stateStore.Messa";
if ((_safetext).equals("")) { 
_safetext = __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"server_wait");};
RDebugUtils.currentLine=43188227;
 //BA.debugLineNum = 43188227;BA.debugLine="stateStore.TraceLog(\"message shutdown text=\" & sa";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"message shutdown text="+_safetext);
RDebugUtils.currentLine=43188228;
 //BA.debugLineNum = 43188228;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"shutdown";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","shutdown");
RDebugUtils.currentLine=43188229;
 //BA.debugLineNum = 43188229;BA.debugLine="stateStore.ClearPolicyPauseAndResumeRequest";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=43188230;
 //BA.debugLineNum = 43188230;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=43188231;
 //BA.debugLineNum = 43188231;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=43188232;
 //BA.debugLineNum = 43188232;BA.debugLine="stateStore.EnterUserStoppedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=43188233;
 //BA.debugLineNum = 43188233;BA.debugLine="stateStore.SetPlayIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplayicon /*String*/ (null);
RDebugUtils.currentLine=43188234;
 //BA.debugLineNum = 43188234;BA.debugLine="stateStore.ShowMessage(safeText)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_safetext);
RDebugUtils.currentLine=43188235;
 //BA.debugLineNum = 43188235;BA.debugLine="stateStore.DisableBackgroundRefreshTimers";
__ref._statestore /*b4j.example.playerstatestore*/ ._disablebackgroundrefreshtimers /*String*/ (null);
RDebugUtils.currentLine=43188236;
 //BA.debugLineNum = 43188236;BA.debugLine="End Sub";
return "";
}
public String  _handletemporarystate(b4j.example.playbackdatacoordinator __ref,String _mode,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "handletemporarystate", false))
	 {return ((String) Debug.delegate(ba, "handletemporarystate", new Object[] {_mode,_text}));}
RDebugUtils.currentLine=42860544;
 //BA.debugLineNum = 42860544;BA.debugLine="Public Sub HandleTemporaryState(mode As String, te";
RDebugUtils.currentLine=42860545;
 //BA.debugLineNum = 42860545;BA.debugLine="stateStore.TraceLog(\"состояние temporary mode=\" &";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние temporary mode="+_mode+" text="+_text);
RDebugUtils.currentLine=42860546;
 //BA.debugLineNum = 42860546;BA.debugLine="stateStore.ApplyTemporaryMode(mode)";
__ref._statestore /*b4j.example.playerstatestore*/ ._applytemporarymode /*String*/ (null,_mode);
RDebugUtils.currentLine=42860547;
 //BA.debugLineNum = 42860547;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=42860548;
 //BA.debugLineNum = 42860548;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=42860549;
 //BA.debugLineNum = 42860549;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=42860550;
 //BA.debugLineNum = 42860550;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=42860551;
 //BA.debugLineNum = 42860551;BA.debugLine="stateStore.ShowMessage(text)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_text);
 }else 
{RDebugUtils.currentLine=42860552;
 //BA.debugLineNum = 42860552;BA.debugLine="Else If mode = \"network\" Then";
if ((_mode).equals("network")) { 
RDebugUtils.currentLine=42860553;
 //BA.debugLineNum = 42860553;BA.debugLine="stateStore.ShowMessage(\"Проверьте интернет\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,"Проверьте интернет");
 }else {
RDebugUtils.currentLine=42860555;
 //BA.debugLineNum = 42860555;BA.debugLine="stateStore.ShowMessage(stateStore.MessageValue(\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"server_wait"));
 }}
;
RDebugUtils.currentLine=42860557;
 //BA.debugLineNum = 42860557;BA.debugLine="stateStore.ScheduleRetry(mode, 0)";
__ref._statestore /*b4j.example.playerstatestore*/ ._scheduleretry /*String*/ (null,_mode,(int) (0));
RDebugUtils.currentLine=42860558;
 //BA.debugLineNum = 42860558;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.BA _ba,b4j.example.playerstatestore _store,b4j.example.networksyncservice _syncworker) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_store,_syncworker}));}
RDebugUtils.currentLine=42401792;
 //BA.debugLineNum = 42401792;BA.debugLine="Public Sub Initialize(store As PlayerStateStore, s";
RDebugUtils.currentLine=42401793;
 //BA.debugLineNum = 42401793;BA.debugLine="stateStore = store";
__ref._statestore /*b4j.example.playerstatestore*/  = _store;
RDebugUtils.currentLine=42401794;
 //BA.debugLineNum = 42401794;BA.debugLine="syncService = syncWorker";
__ref._syncservice /*b4j.example.networksyncservice*/  = _syncworker;
RDebugUtils.currentLine=42401795;
 //BA.debugLineNum = 42401795;BA.debugLine="End Sub";
return "";
}
public boolean  _isplaybackallowed(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data,long _effectivenowticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "isplaybackallowed", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackallowed", new Object[] {_data,_effectivenowticks}));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
long _endtimestamp = 0L;
RDebugUtils.currentLine=42467328;
 //BA.debugLineNum = 42467328;BA.debugLine="Public Sub IsPlaybackAllowed(data As Map, effectiv";
RDebugUtils.currentLine=42467329;
 //BA.debugLineNum = 42467329;BA.debugLine="If data.IsInitialized = False Then Return True";
if (_data.IsInitialized()==__c.False) { 
if (true) return __c.True;};
RDebugUtils.currentLine=42467330;
 //BA.debugLineNum = 42467330;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=42467331;
 //BA.debugLineNum = 42467331;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
if (_playerdata.IsInitialized() && _playerdata.ContainsKey((Object)("playback_allowed"))) { 
RDebugUtils.currentLine=42467332;
 //BA.debugLineNum = 42467332;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
if ((_playerdata.GetDefault((Object)("playback_allowed"),(Object)(__c.True))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
 };
RDebugUtils.currentLine=42467334;
 //BA.debugLineNum = 42467334;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
_endtimestamp = __ref._resolveplaybackendtimestamp /*long*/ (null,_data);
RDebugUtils.currentLine=42467335;
 //BA.debugLineNum = 42467335;BA.debugLine="If endTimestamp <= 0 Then Return True";
if (_endtimestamp<=0) { 
if (true) return __c.True;};
RDebugUtils.currentLine=42467336;
 //BA.debugLineNum = 42467336;BA.debugLine="Return effectiveNowTicks < (endTimestamp * 1000)";
if (true) return _effectivenowticks<(_endtimestamp*1000);
RDebugUtils.currentLine=42467337;
 //BA.debugLineNum = 42467337;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=42795009;
 //BA.debugLineNum = 42795009;BA.debugLine="If stateStore.PlayerCodeValue = \"\" Then Return Fa";
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
RDebugUtils.currentLine=42795010;
 //BA.debugLineNum = 42795010;BA.debugLine="If stateStore.BeginOfflineDataRefresh = False The";
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
RDebugUtils.currentLine=42795011;
 //BA.debugLineNum = 42795011;BA.debugLine="stateStore.TraceInfo(\"network\", \"запрос данных\",";
__ref._statestore /*b4j.example.playerstatestore*/ ._traceinfo /*String*/ (null,"network","запрос данных","");
RDebugUtils.currentLine=42795012;
 //BA.debugLineNum = 42795012;BA.debugLine="Wait For (syncService.FetchData(fetchTimeoutMs))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackdatacoordinator", "refreshofflinedatanow"), __ref._syncservice /*b4j.example.networksyncservice*/ ._fetchdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_fetchtimeoutms));
this.state = 55;
return;
case 55:
//C
this.state = 13;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=42795013;
 //BA.debugLineNum = 42795013;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
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
RDebugUtils.currentLine=42795014;
 //BA.debugLineNum = 42795014;BA.debugLine="stateStore.IncrementNetworkErrorCount";
__ref._statestore /*b4j.example.playerstatestore*/ ._incrementnetworkerrorcount /*String*/ (null);
RDebugUtils.currentLine=42795015;
 //BA.debugLineNum = 42795015;BA.debugLine="stateStore.TraceWarn(\"network\", \"data ошибка\", \"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data ошибка","kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+" lastDataOkAgoSec="+__ref._statestore /*b4j.example.playerstatestore*/ ._secondsagotext /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._getlastdataokat /*long*/ (null)));
RDebugUtils.currentLine=42795016;
 //BA.debugLineNum = 42795016;BA.debugLine="stateStore.EndOfflineDataRefresh(\"http_failed\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"http_failed");
RDebugUtils.currentLine=42795017;
 //BA.debugLineNum = 42795017;BA.debugLine="stateStore.WriteHealthSnapshot(\"ошибка_data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"ошибка_data");
RDebugUtils.currentLine=42795018;
 //BA.debugLineNum = 42795018;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=42795020;
 //BA.debugLineNum = 42795020;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=42795021;
 //BA.debugLineNum = 42795021;BA.debugLine="If resultData Is Map Then";
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
RDebugUtils.currentLine=42795022;
 //BA.debugLineNum = 42795022;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=42795023;
 //BA.debugLineNum = 42795023;BA.debugLine="If data.GetDefault(\"ok\", False) = True And data.";
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
RDebugUtils.currentLine=42795024;
 //BA.debugLineNum = 42795024;BA.debugLine="stateStore.SetLastDataOkNow";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastdataoknow /*String*/ (null);
RDebugUtils.currentLine=42795025;
 //BA.debugLineNum = 42795025;BA.debugLine="stateStore.ResetConsecutiveNetworkErrors";
__ref._statestore /*b4j.example.playerstatestore*/ ._resetconsecutivenetworkerrors /*String*/ (null);
RDebugUtils.currentLine=42795026;
 //BA.debugLineNum = 42795026;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"data";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"data");
RDebugUtils.currentLine=42795027;
 //BA.debugLineNum = 42795027;BA.debugLine="UpdateTrustedOnlineTimeFromData(data, stateStor";
__ref._updatetrustedonlinetimefromdata /*String*/ (null,_data,__ref._statestore /*b4j.example.playerstatestore*/ ._storage /*b4j.example.keyvaluestore*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._trustedsynctimekey /*String*/ (null));
RDebugUtils.currentLine=42795028;
 //BA.debugLineNum = 42795028;BA.debugLine="stateStore.SaveOfflineData(data)";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveofflinedata /*String*/ (null,_data);
RDebugUtils.currentLine=42795029;
 //BA.debugLineNum = 42795029;BA.debugLine="stateStore.CheckForAppUpdate(data)";
__ref._statestore /*b4j.example.playerstatestore*/ ._checkforappupdate /*String*/ (null,_data);
RDebugUtils.currentLine=42795030;
 //BA.debugLineNum = 42795030;BA.debugLine="If stateStore.IsTraceUploadEnabled Then stateSt";
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
RDebugUtils.currentLine=42795031;
 //BA.debugLineNum = 42795031;BA.debugLine="stateStore.InvalidateRelevantTrackIdsCache";
__ref._statestore /*b4j.example.playerstatestore*/ ._invalidaterelevanttrackidscache /*String*/ (null);
RDebugUtils.currentLine=42795032;
 //BA.debugLineNum = 42795032;BA.debugLine="stateStore.SetRemoteDataReady";
__ref._statestore /*b4j.example.playerstatestore*/ ._setremotedataready /*String*/ (null);
RDebugUtils.currentLine=42795033;
 //BA.debugLineNum = 42795033;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=42795034;
 //BA.debugLineNum = 42795034;BA.debugLine="stateStore.TraceInfo(\"network\", \"data загружены";
__ref._statestore /*b4j.example.playerstatestore*/ ._traceinfo /*String*/ (null,"network","data загружены","trace="+BA.ObjectToString(__ref._statestore /*b4j.example.playerstatestore*/ ._istraceuploadenabled /*boolean*/ (null)));
RDebugUtils.currentLine=42795035;
 //BA.debugLineNum = 42795035;BA.debugLine="stateStore.WriteHealthSnapshot(\"data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"data");
RDebugUtils.currentLine=42795036;
 //BA.debugLineNum = 42795036;BA.debugLine="Wait For (stateStore.SyncOfflinePlaylistMetadat";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackdatacoordinator", "refreshofflinedatanow"), __ref._statestore /*b4j.example.playerstatestore*/ ._syncofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 56;
return;
case 56:
//C
this.state = 29;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=42795037;
 //BA.debugLineNum = 42795037;BA.debugLine="If stateStore.IsStartupSequenceInProgress Then";
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
RDebugUtils.currentLine=42795038;
 //BA.debugLineNum = 42795038;BA.debugLine="stateStore.DeferAdWarmupAfterStartup";
__ref._statestore /*b4j.example.playerstatestore*/ ._deferadwarmupafterstartup /*String*/ (null);
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=42795040;
 //BA.debugLineNum = 42795040;BA.debugLine="stateStore.EnsureAdCacheSyncAsync";
__ref._statestore /*b4j.example.playerstatestore*/ ._ensureadcachesyncasync /*String*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=42795042;
 //BA.debugLineNum = 42795042;BA.debugLine="If IsPlaybackAllowed(stateStore.OfflineData, st";

case 34:
//if
this.state = 37;
if (__ref._isplaybackallowed /*boolean*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._effectivenowticks /*long*/ (null))==parent.__c.False) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=42795043;
 //BA.debugLineNum = 42795043;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReas";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._resolveplaybackblockreason /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._effectivenowticks /*long*/ (null)),"server");
RDebugUtils.currentLine=42795044;
 //BA.debugLineNum = 42795044;BA.debugLine="stateStore.EndOfflineDataRefresh(\"data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"data");
RDebugUtils.currentLine=42795045;
 //BA.debugLineNum = 42795045;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=42795047;
 //BA.debugLineNum = 42795047;BA.debugLine="If stateStore.ResumePlaybackWhenServerAllows An";

case 37:
//if
this.state = 40;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._resumeplaybackwhenserverallows /*boolean*/ (null) && __ref._statestore /*b4j.example.playerstatestore*/ ._shouldresumewithnewstart /*boolean*/ (null)==parent.__c.False && __ref._statestore /*b4j.example.playerstatestore*/ ._isuserstoppedstate /*boolean*/ (null)==parent.__c.False && __ref._statestore /*b4j.example.playerstatestore*/ ._isstopping /*boolean*/ (null)==parent.__c.False) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=42795048;
 //BA.debugLineNum = 42795048;BA.debugLine="stateStore.TraceLog(\"policy resume авто mode=s";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"policy resume авто mode=server_allow");
RDebugUtils.currentLine=42795049;
 //BA.debugLineNum = 42795049;BA.debugLine="stateStore.ClearResumePlaybackWhenServerAllows";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearresumeplaybackwhenserverallows /*String*/ (null);
RDebugUtils.currentLine=42795050;
 //BA.debugLineNum = 42795050;BA.debugLine="stateStore.EnterStartedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=42795051;
 //BA.debugLineNum = 42795051;BA.debugLine="stateStore.SetStopIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setstopicon /*String*/ (null);
RDebugUtils.currentLine=42795052;
 //BA.debugLineNum = 42795052;BA.debugLine="stateStore.HideContentBlocks";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=42795053;
 //BA.debugLineNum = 42795053;BA.debugLine="stateStore.ResumePlaybackAfterPolicyPauseAsync";
__ref._statestore /*b4j.example.playerstatestore*/ ._resumeplaybackafterpolicypauseasync /*String*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=42795055;
 //BA.debugLineNum = 42795055;BA.debugLine="If stateStore.IsPolicyPauseState Then";

case 40:
//if
this.state = 47;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._ispolicypausestate /*boolean*/ (null)) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=42795056;
 //BA.debugLineNum = 42795056;BA.debugLine="stateStore.ClearPolicyPause";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=42795057;
 //BA.debugLineNum = 42795057;BA.debugLine="If stateStore.IsUserStoppedState = False And s";
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
RDebugUtils.currentLine=42795058;
 //BA.debugLineNum = 42795058;BA.debugLine="stateStore.TraceLog(\"policy resume авто mode=";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"policy resume авто mode=policy_pause_clear");
RDebugUtils.currentLine=42795059;
 //BA.debugLineNum = 42795059;BA.debugLine="stateStore.EnterStartedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=42795060;
 //BA.debugLineNum = 42795060;BA.debugLine="stateStore.SetStopIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setstopicon /*String*/ (null);
RDebugUtils.currentLine=42795061;
 //BA.debugLineNum = 42795061;BA.debugLine="stateStore.HideContentBlocks";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=42795062;
 //BA.debugLineNum = 42795062;BA.debugLine="stateStore.ResumePlaybackAfterPolicyPauseAsyn";
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
RDebugUtils.currentLine=42795065;
 //BA.debugLineNum = 42795065;BA.debugLine="stateStore.EndOfflineDataRefresh(\"data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"data");
RDebugUtils.currentLine=42795066;
 //BA.debugLineNum = 42795066;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=42795068;
 //BA.debugLineNum = 42795068;BA.debugLine="If data.GetDefault(\"type\", \"\") = \"message\" Then";

case 48:
//if
this.state = 51;
if ((_data.GetDefault((Object)("type"),(Object)(""))).equals((Object)("message"))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=42795069;
 //BA.debugLineNum = 42795069;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"mess";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"message");
RDebugUtils.currentLine=42795070;
 //BA.debugLineNum = 42795070;BA.debugLine="stateStore.TraceWarn(\"network\", \"data сообщение";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data сообщение","action="+BA.ObjectToString(_data.GetDefault((Object)("action"),(Object)("")))+" reason="+BA.ObjectToString(_data.GetDefault((Object)("reason"),(Object)(""))));
RDebugUtils.currentLine=42795071;
 //BA.debugLineNum = 42795071;BA.debugLine="stateStore.HandleMessageItem(data)";
__ref._statestore /*b4j.example.playerstatestore*/ ._handlemessageitem /*String*/ (null,_data);
RDebugUtils.currentLine=42795072;
 //BA.debugLineNum = 42795072;BA.debugLine="stateStore.EndOfflineDataRefresh(\"message\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"message");
RDebugUtils.currentLine=42795073;
 //BA.debugLineNum = 42795073;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 51:
//C
this.state = 54;
;
RDebugUtils.currentLine=42795075;
 //BA.debugLineNum = 42795075;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"inval";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"invalid_data");
RDebugUtils.currentLine=42795076;
 //BA.debugLineNum = 42795076;BA.debugLine="stateStore.TraceWarn(\"network\", \"data некорректн";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data некорректны","type="+BA.ObjectToString(_data.GetDefault((Object)("type"),(Object)("")))+" ok="+BA.ObjectToString(_data.GetDefault((Object)("ok"),(Object)(parent.__c.False))));
RDebugUtils.currentLine=42795077;
 //BA.debugLineNum = 42795077;BA.debugLine="PausePlaybackByPolicy(stateStore.MessageValue(\"i";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"invalid_data_response"),"server");
 if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=42795079;
 //BA.debugLineNum = 42795079;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"inval";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"invalid_payload");
RDebugUtils.currentLine=42795080;
 //BA.debugLineNum = 42795080;BA.debugLine="stateStore.TraceWarn(\"network\", \"data некорректн";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data некорректны","payload=not_map");
RDebugUtils.currentLine=42795081;
 //BA.debugLineNum = 42795081;BA.debugLine="PausePlaybackByPolicy(stateStore.MessageValue(\"i";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"invalid_data_response"),"server");
 if (true) break;

case 54:
//C
this.state = -1;
;
RDebugUtils.currentLine=42795083;
 //BA.debugLineNum = 42795083;BA.debugLine="stateStore.EndOfflineDataRefresh(stateStore.LastO";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._lastofflinedatarefreshstate /*String*/ (null));
RDebugUtils.currentLine=42795084;
 //BA.debugLineNum = 42795084;BA.debugLine="stateStore.WriteHealthSnapshot(\"ошибка_data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"ошибка_data");
RDebugUtils.currentLine=42795085;
 //BA.debugLineNum = 42795085;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=42795086;
 //BA.debugLineNum = 42795086;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=43450368;
 //BA.debugLineNum = 43450368;BA.debugLine="Public Sub ResetRetryDelay(localRetryInitial As In";
RDebugUtils.currentLine=43450369;
 //BA.debugLineNum = 43450369;BA.debugLine="stateStore.ResetRetryDelayState(localRetryInitial";
__ref._statestore /*b4j.example.playerstatestore*/ ._resetretrydelaystate /*String*/ (null,_localretryinitial,_serverretryinitial);
RDebugUtils.currentLine=43450370;
 //BA.debugLineNum = 43450370;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=42532864;
 //BA.debugLineNum = 42532864;BA.debugLine="Public Sub ResolvePlaybackBlockReason(data As Map,";
RDebugUtils.currentLine=42532865;
 //BA.debugLineNum = 42532865;BA.debugLine="If data.IsInitialized = False Then Return stateSt";
if (_data.IsInitialized()==__c.False) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");};
RDebugUtils.currentLine=42532866;
 //BA.debugLineNum = 42532866;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=42532867;
 //BA.debugLineNum = 42532867;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
RDebugUtils.currentLine=42532868;
 //BA.debugLineNum = 42532868;BA.debugLine="Dim pauseReason As String = playerData.GetDefaul";
_pausereason = BA.ObjectToString(_playerdata.GetDefault((Object)("pause_reason"),(Object)("")));
RDebugUtils.currentLine=42532869;
 //BA.debugLineNum = 42532869;BA.debugLine="If pauseReason <> \"\" Then Return pauseReason";
if ((_pausereason).equals("") == false) { 
if (true) return _pausereason;};
 };
RDebugUtils.currentLine=42532871;
 //BA.debugLineNum = 42532871;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
_endtimestamp = __ref._resolveplaybackendtimestamp /*long*/ (null,_data);
RDebugUtils.currentLine=42532872;
 //BA.debugLineNum = 42532872;BA.debugLine="If endTimestamp > 0 And effectiveNowTicks >= (end";
if (_endtimestamp>0 && _effectivenowticks>=(_endtimestamp*1000)) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"subscription_expired");};
RDebugUtils.currentLine=42532873;
 //BA.debugLineNum = 42532873;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
if (_playerdata.IsInitialized() && _playerdata.ContainsKey((Object)("playback_allowed"))) { 
RDebugUtils.currentLine=42532874;
 //BA.debugLineNum = 42532874;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
if ((_playerdata.GetDefault((Object)("playback_allowed"),(Object)(__c.True))).equals((Object)(__c.True)) == false) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");};
 };
RDebugUtils.currentLine=42532876;
 //BA.debugLineNum = 42532876;BA.debugLine="Return stateStore.MessageValue(\"playback_paused\")";
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");
RDebugUtils.currentLine=42532877;
 //BA.debugLineNum = 42532877;BA.debugLine="End Sub";
return "";
}
public String  _scheduleretry(b4j.example.playbackdatacoordinator __ref,String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "scheduleretry", false))
	 {return ((String) Debug.delegate(ba, "scheduleretry", new Object[] {_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay}));}
RDebugUtils.currentLine=43384832;
 //BA.debugLineNum = 43384832;BA.debugLine="Public Sub ScheduleRetry(mode As String, delayMs A";
RDebugUtils.currentLine=43384833;
 //BA.debugLineNum = 43384833;BA.debugLine="stateStore.ClearRetryTimer";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=43384834;
 //BA.debugLineNum = 43384834;BA.debugLine="stateStore.SetLastRetryMode(mode)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastretrymode /*String*/ (null,_mode);
RDebugUtils.currentLine=43384835;
 //BA.debugLineNum = 43384835;BA.debugLine="stateStore.SetRetryInterval(ResolveRetryDelay(mod";
__ref._statestore /*b4j.example.playerstatestore*/ ._setretryinterval /*String*/ (null,__ref._resolveretrydelay /*int*/ (null,_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay));
RDebugUtils.currentLine=43384836;
 //BA.debugLineNum = 43384836;BA.debugLine="If stateStore.IsPlaybackStarted = False Or stateS";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._isplaybackstarted /*boolean*/ (null)==__c.False || __ref._statestore /*b4j.example.playerstatestore*/ ._isstoppedbyuser /*boolean*/ (null)) { 
if (true) return "";};
RDebugUtils.currentLine=43384837;
 //BA.debugLineNum = 43384837;BA.debugLine="If stateStore.IsPlaybackPausedByPolicy And mode <";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._isplaybackpausedbypolicy /*boolean*/ (null) && (_mode).equals("blocked") == false && (_mode).equals("audio_device") == false) { 
if (true) return "";};
RDebugUtils.currentLine=43384838;
 //BA.debugLineNum = 43384838;BA.debugLine="stateStore.TraceWarn(\"network\", \"переход в retry\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","переход в retry","mode="+_mode+" delaySec="+BA.NumberToString(__c.Floor(__ref._statestore /*b4j.example.playerstatestore*/ ._getretryinterval /*int*/ (null)/(double)1000)));
RDebugUtils.currentLine=43384839;
 //BA.debugLineNum = 43384839;BA.debugLine="stateStore.WriteHealthSnapshot(\"retry\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"retry");
RDebugUtils.currentLine=43384840;
 //BA.debugLineNum = 43384840;BA.debugLine="stateStore.EnableRetryTimer";
__ref._statestore /*b4j.example.playerstatestore*/ ._enableretrytimer /*String*/ (null);
RDebugUtils.currentLine=43384841;
 //BA.debugLineNum = 43384841;BA.debugLine="End Sub";
return "";
}
public String  _stopformissingdata(b4j.example.playbackdatacoordinator __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "stopformissingdata", false))
	 {return ((String) Debug.delegate(ba, "stopformissingdata", new Object[] {_text}));}
RDebugUtils.currentLine=42991616;
 //BA.debugLineNum = 42991616;BA.debugLine="Public Sub StopForMissingData(text As String)";
RDebugUtils.currentLine=42991617;
 //BA.debugLineNum = 42991617;BA.debugLine="stateStore.TraceLog(\"состояние stop reason=missin";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние stop reason=missing_data text="+_text);
RDebugUtils.currentLine=42991618;
 //BA.debugLineNum = 42991618;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"missing_";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","missing_data");
RDebugUtils.currentLine=42991619;
 //BA.debugLineNum = 42991619;BA.debugLine="stateStore.ClearPolicyPauseAndResumeRequest";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=42991620;
 //BA.debugLineNum = 42991620;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=42991621;
 //BA.debugLineNum = 42991621;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=42991622;
 //BA.debugLineNum = 42991622;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=42991623;
 //BA.debugLineNum = 42991623;BA.debugLine="stateStore.EnterUserStoppedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=42991624;
 //BA.debugLineNum = 42991624;BA.debugLine="stateStore.SetPlayIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplayicon /*String*/ (null);
RDebugUtils.currentLine=42991625;
 //BA.debugLineNum = 42991625;BA.debugLine="stateStore.ShowMessage(text)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_text);
RDebugUtils.currentLine=42991626;
 //BA.debugLineNum = 42991626;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=44105728;
 //BA.debugLineNum = 44105728;BA.debugLine="Private Sub IsIdleSlot(slotContext As Map) As Bool";
RDebugUtils.currentLine=44105729;
 //BA.debugLineNum = 44105729;BA.debugLine="If slotContext.IsInitialized = False Or slotConte";
if (_slotcontext.IsInitialized()==__c.False || _slotcontext.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=44105730;
 //BA.debugLineNum = 44105730;BA.debugLine="Dim playlists As List = slotContext.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slotcontext.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=44105731;
 //BA.debugLineNum = 44105731;BA.debugLine="If playlists.IsInitialized And playlists.Size > 0";
if (_playlists.IsInitialized() && _playlists.getSize()>0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=44105732;
 //BA.debugLineNum = 44105732;BA.debugLine="Dim streamId As String = slotContext.GetDefault(\"";
_streamid = BA.ObjectToString(_slotcontext.GetDefault((Object)("stream_id"),(Object)("")));
RDebugUtils.currentLine=44105733;
 //BA.debugLineNum = 44105733;BA.debugLine="Dim streamTitle As String = slotContext.GetDefaul";
_streamtitle = BA.ObjectToString(_slotcontext.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=44105734;
 //BA.debugLineNum = 44105734;BA.debugLine="Return streamId = \"\" And streamTitle = \"\"";
if (true) return (_streamid).equals("") && (_streamtitle).equals("");
RDebugUtils.currentLine=44105735;
 //BA.debugLineNum = 44105735;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.playbackdatacoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
RDebugUtils.currentLine=42336256;
 //BA.debugLineNum = 42336256;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=42336257;
 //BA.debugLineNum = 42336257;BA.debugLine="Private stateStore As PlayerStateStore";
_statestore = new b4j.example.playerstatestore();
RDebugUtils.currentLine=42336258;
 //BA.debugLineNum = 42336258;BA.debugLine="Private syncService As NetworkSyncService";
_syncservice = new b4j.example.networksyncservice();
RDebugUtils.currentLine=42336259;
 //BA.debugLineNum = 42336259;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=84279296;
 //BA.debugLineNum = 84279296;BA.debugLine="Private Sub CountCachedTracksInPlaylist(playlistDa";
RDebugUtils.currentLine=84279297;
 //BA.debugLineNum = 84279297;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=84279298;
 //BA.debugLineNum = 84279298;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=84279299;
 //BA.debugLineNum = 84279299;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=84279300;
 //BA.debugLineNum = 84279300;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
RDebugUtils.currentLine=84279301;
 //BA.debugLineNum = 84279301;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group5 = _tracks;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_trackobject = group5.Get(index5);
RDebugUtils.currentLine=84279302;
 //BA.debugLineNum = 84279302;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=84279303;
 //BA.debugLineNum = 84279303;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=84279304;
 //BA.debugLineNum = 84279304;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=84279305;
 //BA.debugLineNum = 84279305;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=84279306;
 //BA.debugLineNum = 84279306;BA.debugLine="If stateStore.IsTrackCached(trackId) = False The";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._istrackcached /*boolean*/ (null,_trackid)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=84279307;
 //BA.debugLineNum = 84279307;BA.debugLine="totalCount = totalCount + 1";
_totalcount = (int) (_totalcount+1);
 }
};
RDebugUtils.currentLine=84279309;
 //BA.debugLineNum = 84279309;BA.debugLine="Return totalCount";
if (true) return _totalcount;
RDebugUtils.currentLine=84279310;
 //BA.debugLineNum = 84279310;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.playbackdatacoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=44040192;
 //BA.debugLineNum = 44040192;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=44040193;
 //BA.debugLineNum = 44040193;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=44040194;
 //BA.debugLineNum = 44040194;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=44040195;
 //BA.debugLineNum = 44040195;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=44040196;
 //BA.debugLineNum = 44040196;BA.debugLine="End Sub";
return null;
}
public boolean  _hasplayablelocaltrackincurrentslot(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _effectivenowticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "hasplayablelocaltrackincurrentslot", false))
	 {return ((Boolean) Debug.delegate(ba, "hasplayablelocaltrackincurrentslot", new Object[] {_offlinedata,_effectivenowticks}));}
RDebugUtils.currentLine=43646976;
 //BA.debugLineNum = 43646976;BA.debugLine="Public Sub HasPlayableLocalTrackInCurrentSlot(offl";
RDebugUtils.currentLine=43646977;
 //BA.debugLineNum = 43646977;BA.debugLine="Return CountPlayableLocalTracksInCurrentSlot(offl";
if (true) return __ref._countplayablelocaltracksincurrentslot /*int*/ (null,_offlinedata,_effectivenowticks)>0;
RDebugUtils.currentLine=43646978;
 //BA.debugLineNum = 43646978;BA.debugLine="End Sub";
return false;
}
public long  _resolveplaybackendtimestamp(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "resolveplaybackendtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "resolveplaybackendtimestamp", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
long _playerend = 0L;
RDebugUtils.currentLine=42598400;
 //BA.debugLineNum = 42598400;BA.debugLine="Public Sub ResolvePlaybackEndTimestamp(data As Map";
RDebugUtils.currentLine=42598401;
 //BA.debugLineNum = 42598401;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=42598402;
 //BA.debugLineNum = 42598402;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=42598403;
 //BA.debugLineNum = 42598403;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
RDebugUtils.currentLine=42598404;
 //BA.debugLineNum = 42598404;BA.debugLine="Dim playerEnd As Long = ParseEndValueToTimestamp";
_playerend = __ref._parseendvaluetotimestamp /*long*/ (null,_playerdata.Get((Object)("end")));
RDebugUtils.currentLine=42598405;
 //BA.debugLineNum = 42598405;BA.debugLine="If playerEnd > 0 Then Return playerEnd";
if (_playerend>0) { 
if (true) return _playerend;};
 };
RDebugUtils.currentLine=42598407;
 //BA.debugLineNum = 42598407;BA.debugLine="Return ParseEndValueToTimestamp(data.Get(\"end\"))";
if (true) return __ref._parseendvaluetotimestamp /*long*/ (null,_data.Get((Object)("end")));
RDebugUtils.currentLine=42598408;
 //BA.debugLineNum = 42598408;BA.debugLine="End Sub";
return 0L;
}
public long  _parsedateonlyendtimestamp(b4j.example.playbackdatacoordinator __ref,String _textvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "parsedateonlyendtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "parsedateonlyendtimestamp", new Object[] {_textvalue}));}
String _previousdateformat = "";
long _daystartticks = 0L;
RDebugUtils.currentLine=43974656;
 //BA.debugLineNum = 43974656;BA.debugLine="Private Sub ParseDateOnlyEndTimestamp(textValue As";
RDebugUtils.currentLine=43974657;
 //BA.debugLineNum = 43974657;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=43974658;
 //BA.debugLineNum = 43974658;BA.debugLine="Try";
try {RDebugUtils.currentLine=43974659;
 //BA.debugLineNum = 43974659;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=43974660;
 //BA.debugLineNum = 43974660;BA.debugLine="Dim dayStartTicks As Long = DateTime.DateParse(t";
_daystartticks = __c.DateTime.DateParse(_textvalue);
RDebugUtils.currentLine=43974661;
 //BA.debugLineNum = 43974661;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=43974662;
 //BA.debugLineNum = 43974662;BA.debugLine="Return Floor((dayStartTicks + DateTime.TicksPerD";
if (true) return (long) (__c.Floor((_daystartticks+__c.DateTime.TicksPerDay)/(double)1000));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=43974664;
 //BA.debugLineNum = 43974664;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=43974665;
 //BA.debugLineNum = 43974665;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
RDebugUtils.currentLine=43974666;
 //BA.debugLineNum = 43974666;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=43974668;
 //BA.debugLineNum = 43974668;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=43843584;
 //BA.debugLineNum = 43843584;BA.debugLine="Private Sub ParseEndValueToTimestamp(value As Obje";
RDebugUtils.currentLine=43843585;
 //BA.debugLineNum = 43843585;BA.debugLine="If value = Null Then Return 0";
if (_value== null) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=43843586;
 //BA.debugLineNum = 43843586;BA.debugLine="Dim textValue As String = (\"\" & value).Trim";
_textvalue = (""+BA.ObjectToString(_value)).trim();
RDebugUtils.currentLine=43843587;
 //BA.debugLineNum = 43843587;BA.debugLine="If textValue = \"\" Then Return 0";
if ((_textvalue).equals("")) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=43843588;
 //BA.debugLineNum = 43843588;BA.debugLine="If Regex.IsMatch(\"^\\d+$\", textValue) Then Return";
if (__c.Regex.IsMatch("^\\d+$",_textvalue)) { 
if (true) return (long) (__c.Floor((double)(Double.parseDouble(_textvalue))));};
RDebugUtils.currentLine=43843589;
 //BA.debugLineNum = 43843589;BA.debugLine="If Regex.IsMatch(\"^\\d{4}-\\d{2}-\\d{2}$\", textValue";
if (__c.Regex.IsMatch("^\\d{4}-\\d{2}-\\d{2}$",_textvalue)) { 
RDebugUtils.currentLine=43843590;
 //BA.debugLineNum = 43843590;BA.debugLine="Return ParseDateOnlyEndTimestamp(textValue)";
if (true) return __ref._parsedateonlyendtimestamp /*long*/ (null,_textvalue);
 };
RDebugUtils.currentLine=43843592;
 //BA.debugLineNum = 43843592;BA.debugLine="Try";
try {RDebugUtils.currentLine=43843593;
 //BA.debugLineNum = 43843593;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=43843594;
 //BA.debugLineNum = 43843594;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=43843595;
 //BA.debugLineNum = 43843595;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("parse",new Object[]{(Object)(_textvalue)})));
RDebugUtils.currentLine=43843596;
 //BA.debugLineNum = 43843596;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("getEpochSecond",(Object[])(__c.Null)));
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=43843598;
 //BA.debugLineNum = 43843598;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
 };
RDebugUtils.currentLine=43843600;
 //BA.debugLineNum = 43843600;BA.debugLine="Try";
try {RDebugUtils.currentLine=43843601;
 //BA.debugLineNum = 43843601;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
_offsetdatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=43843602;
 //BA.debugLineNum = 43843602;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time.";
_offsetdatetimeclass.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=43843603;
 //BA.debugLineNum = 43843603;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTim";
_offsetdatetime = new anywheresoftware.b4j.object.JavaObject();
_offsetdatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetimeclass.RunMethod("parse",new Object[]{(Object)(_textvalue)})));
RDebugUtils.currentLine=43843604;
 //BA.debugLineNum = 43843604;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunMe";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetime.RunMethod("toInstant",(Object[])(__c.Null))));
RDebugUtils.currentLine=43843605;
 //BA.debugLineNum = 43843605;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("getEpochSecond",(Object[])(__c.Null)));
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=43843607;
 //BA.debugLineNum = 43843607;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
 };
RDebugUtils.currentLine=43843609;
 //BA.debugLineNum = 43843609;BA.debugLine="stateStore.TraceLog(\"player end parse fail value=";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"player end parse fail value="+_textvalue);
RDebugUtils.currentLine=43843610;
 //BA.debugLineNum = 43843610;BA.debugLine="Return 0";
if (true) return (long) (0);
RDebugUtils.currentLine=43843611;
 //BA.debugLineNum = 43843611;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=43909120;
 //BA.debugLineNum = 43909120;BA.debugLine="Private Sub ParseTrustedOnlineTicks(data As Map) A";
RDebugUtils.currentLine=43909121;
 //BA.debugLineNum = 43909121;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=43909122;
 //BA.debugLineNum = 43909122;BA.debugLine="Dim updatedText As String = (\"\" & data.GetDefault";
_updatedtext = (""+BA.ObjectToString(_data.GetDefault((Object)("updated"),(Object)("")))).trim();
RDebugUtils.currentLine=43909123;
 //BA.debugLineNum = 43909123;BA.debugLine="If updatedText = \"\" Then Return 0";
if ((_updatedtext).equals("")) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=43909124;
 //BA.debugLineNum = 43909124;BA.debugLine="Try";
try {RDebugUtils.currentLine=43909125;
 //BA.debugLineNum = 43909125;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=43909126;
 //BA.debugLineNum = 43909126;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=43909127;
 //BA.debugLineNum = 43909127;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("parse",new Object[]{(Object)(_updatedtext)})));
RDebugUtils.currentLine=43909128;
 //BA.debugLineNum = 43909128;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("toEpochMilli",(Object[])(__c.Null)));
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=43909130;
 //BA.debugLineNum = 43909130;BA.debugLine="Try";
try {RDebugUtils.currentLine=43909131;
 //BA.debugLineNum = 43909131;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
_offsetdatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=43909132;
 //BA.debugLineNum = 43909132;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time";
_offsetdatetimeclass.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=43909133;
 //BA.debugLineNum = 43909133;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTi";
_offsetdatetime = new anywheresoftware.b4j.object.JavaObject();
_offsetdatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetimeclass.RunMethod("parse",new Object[]{(Object)(_updatedtext)})));
RDebugUtils.currentLine=43909134;
 //BA.debugLineNum = 43909134;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunM";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetime.RunMethod("toInstant",(Object[])(__c.Null))));
RDebugUtils.currentLine=43909135;
 //BA.debugLineNum = 43909135;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("toEpochMilli",(Object[])(__c.Null)));
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=43909137;
 //BA.debugLineNum = 43909137;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
 };
 };
RDebugUtils.currentLine=43909140;
 //BA.debugLineNum = 43909140;BA.debugLine="Return 0";
if (true) return (long) (0);
RDebugUtils.currentLine=43909141;
 //BA.debugLineNum = 43909141;BA.debugLine="End Sub";
return 0L;
}
public String  _updatetrustedonlinetimefromdata(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data,b4j.example.keyvaluestore _storage,String _storagekey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "updatetrustedonlinetimefromdata", false))
	 {return ((String) Debug.delegate(ba, "updatetrustedonlinetimefromdata", new Object[] {_data,_storage,_storagekey}));}
long _candidateticks = 0L;
RDebugUtils.currentLine=42663936;
 //BA.debugLineNum = 42663936;BA.debugLine="Public Sub UpdateTrustedOnlineTimeFromData(data As";
RDebugUtils.currentLine=42663937;
 //BA.debugLineNum = 42663937;BA.debugLine="Dim candidateTicks As Long = ParseTrustedOnlineTi";
_candidateticks = __ref._parsetrustedonlineticks /*long*/ (null,_data);
RDebugUtils.currentLine=42663938;
 //BA.debugLineNum = 42663938;BA.debugLine="If candidateTicks <= 0 Then candidateTicks = Date";
if (_candidateticks<=0) { 
_candidateticks = __c.DateTime.getNow();};
RDebugUtils.currentLine=42663939;
 //BA.debugLineNum = 42663939;BA.debugLine="UpdateTrustedOnlineTimeTicks(candidateTicks, stor";
__ref._updatetrustedonlinetimeticks /*String*/ (null,_candidateticks,_storage,_storagekey);
RDebugUtils.currentLine=42663940;
 //BA.debugLineNum = 42663940;BA.debugLine="End Sub";
return "";
}
public int  _resolveretrydelay(b4j.example.playbackdatacoordinator __ref,String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "resolveretrydelay", false))
	 {return ((Integer) Debug.delegate(ba, "resolveretrydelay", new Object[] {_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay}));}
RDebugUtils.currentLine=43319296;
 //BA.debugLineNum = 43319296;BA.debugLine="Public Sub ResolveRetryDelay(mode As String, delay";
RDebugUtils.currentLine=43319297;
 //BA.debugLineNum = 43319297;BA.debugLine="Return stateStore.ResolveRetryDelay(mode, delayMs";
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._resolveretrydelay /*int*/ (null,_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay);
RDebugUtils.currentLine=43319298;
 //BA.debugLineNum = 43319298;BA.debugLine="End Sub";
return 0;
}
public String  _updatetrustedonlinetimeticks(b4j.example.playbackdatacoordinator __ref,long _candidateticks,b4j.example.keyvaluestore _storage,String _storagekey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "updatetrustedonlinetimeticks", false))
	 {return ((String) Debug.delegate(ba, "updatetrustedonlinetimeticks", new Object[] {_candidateticks,_storage,_storagekey}));}
long _storedticks = 0L;
RDebugUtils.currentLine=42729472;
 //BA.debugLineNum = 42729472;BA.debugLine="Public Sub UpdateTrustedOnlineTimeTicks(candidateT";
RDebugUtils.currentLine=42729473;
 //BA.debugLineNum = 42729473;BA.debugLine="If candidateTicks <= 0 Then Return";
if (_candidateticks<=0) { 
if (true) return "";};
RDebugUtils.currentLine=42729474;
 //BA.debugLineNum = 42729474;BA.debugLine="Dim storedTicks As Long = storage.GetDefault(stor";
_storedticks = BA.ObjectToLongNumber(_storage._getdefault /*Object*/ (null,_storagekey,(Object)(0)));
RDebugUtils.currentLine=42729475;
 //BA.debugLineNum = 42729475;BA.debugLine="If candidateTicks <= storedTicks Then Return";
if (_candidateticks<=_storedticks) { 
if (true) return "";};
RDebugUtils.currentLine=42729476;
 //BA.debugLineNum = 42729476;BA.debugLine="storage.Put(storageKey, candidateTicks)";
_storage._put /*String*/ (null,_storagekey,(Object)(_candidateticks));
RDebugUtils.currentLine=42729477;
 //BA.debugLineNum = 42729477;BA.debugLine="stateStore.TraceLog(\"trusted time update ticks=\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"trusted time update ticks="+BA.NumberToString(_candidateticks));
RDebugUtils.currentLine=42729478;
 //BA.debugLineNum = 42729478;BA.debugLine="End Sub";
return "";
}
}