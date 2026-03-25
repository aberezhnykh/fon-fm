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
RDebugUtils.currentLine=33816576;
 //BA.debugLineNum = 33816576;BA.debugLine="Public Sub AllowRegularAdsAtTargetMinute(offlineDa";
RDebugUtils.currentLine=33816577;
 //BA.debugLineNum = 33816577;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=33816578;
 //BA.debugLineNum = 33816578;BA.debugLine="Dim targetTicks As Long = targetMinuteTimestamp *";
_targetticks = (long) (_targetminutetimestamp*1000);
RDebugUtils.currentLine=33816579;
 //BA.debugLineNum = 33816579;BA.debugLine="Dim targetSlot As Map = stateStore.ResolveDataSlo";
_targetslot = new anywheresoftware.b4a.objects.collections.Map();
_targetslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_targetticks);
RDebugUtils.currentLine=33816580;
 //BA.debugLineNum = 33816580;BA.debugLine="Return IsIdleSlot(targetSlot) = False";
if (true) return __ref._isidleslot /*boolean*/ (null,_targetslot)==__c.False;
RDebugUtils.currentLine=33816581;
 //BA.debugLineNum = 33816581;BA.debugLine="End Sub";
return false;
}
public String  _activatelocalfallback(b4j.example.playbackdatacoordinator __ref,boolean _markdegraded,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "activatelocalfallback", false))
	 {return ((String) Debug.delegate(ba, "activatelocalfallback", new Object[] {_markdegraded,_reason}));}
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Public Sub ActivateLocalFallback(markDegraded As B";
RDebugUtils.currentLine=32964609;
 //BA.debugLineNum = 32964609;BA.debugLine="stateStore.TraceLog(\"fallback activate mode=local";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback activate mode=local reason="+_reason+" degraded="+BA.ObjectToString(_markdegraded));
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"switch_l";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","switch_local:"+_reason);
RDebugUtils.currentLine=32964611;
 //BA.debugLineNum = 32964611;BA.debugLine="stateStore.EnterLocalPlayback";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterlocalplayback /*String*/ (null);
RDebugUtils.currentLine=32964612;
 //BA.debugLineNum = 32964612;BA.debugLine="stateStore.SetMediaPathDegraded(markDegraded)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setmediapathdegraded /*String*/ (null,_markdegraded);
RDebugUtils.currentLine=32964613;
 //BA.debugLineNum = 32964613;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=32964614;
 //BA.debugLineNum = 32964614;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=32964615;
 //BA.debugLineNum = 32964615;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=32964616;
 //BA.debugLineNum = 32964616;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33751040;
 //BA.debugLineNum = 33751040;BA.debugLine="Public Sub ResolveIdleUntilMessage(offlineData As";
RDebugUtils.currentLine=33751041;
 //BA.debugLineNum = 33751041;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=33751042;
 //BA.debugLineNum = 33751042;BA.debugLine="Dim currentSlot As Map = stateStore.ResolveCurren";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvecurrentdataslot /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata);
RDebugUtils.currentLine=33751043;
 //BA.debugLineNum = 33751043;BA.debugLine="If IsIdleSlot(currentSlot) = False Then Return \"\"";
if (__ref._isidleslot /*boolean*/ (null,_currentslot)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=33751044;
 //BA.debugLineNum = 33751044;BA.debugLine="Dim nextSlot As Map = stateStore.ResolveNextDataS";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
_nextslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_effectivenowticks);
RDebugUtils.currentLine=33751045;
 //BA.debugLineNum = 33751045;BA.debugLine="Dim nextTime As String = nextSlot.GetDefault(\"slo";
_nexttime = BA.ObjectToString(_nextslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=33751046;
 //BA.debugLineNum = 33751046;BA.debugLine="If nextTime = \"\" Then Return stateStore.MessageVa";
if ((_nexttime).equals("")) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"idle");};
RDebugUtils.currentLine=33751047;
 //BA.debugLineNum = 33751047;BA.debugLine="Return stateStore.MessageValue(\"idle_until\").Repl";
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"idle_until").replace("{time}",_nexttime);
RDebugUtils.currentLine=33751048;
 //BA.debugLineNum = 33751048;BA.debugLine="End Sub";
return "";
}
public String  _pauseplaybackbypolicy(b4j.example.playbackdatacoordinator __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "pauseplaybackbypolicy", false))
	 {return ((String) Debug.delegate(ba, "pauseplaybackbypolicy", new Object[] {_reason,_connectionmode}));}
String _safereason = "";
RDebugUtils.currentLine=33488896;
 //BA.debugLineNum = 33488896;BA.debugLine="Public Sub PausePlaybackByPolicy(reason As String,";
RDebugUtils.currentLine=33488897;
 //BA.debugLineNum = 33488897;BA.debugLine="Dim safeReason As String = reason";
_safereason = _reason;
RDebugUtils.currentLine=33488898;
 //BA.debugLineNum = 33488898;BA.debugLine="If safeReason = \"\" Then safeReason = stateStore.M";
if ((_safereason).equals("")) { 
_safereason = __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");};
RDebugUtils.currentLine=33488899;
 //BA.debugLineNum = 33488899;BA.debugLine="stateStore.EnterPolicyPause(safeReason, connectio";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterpolicypause /*String*/ (null,_safereason,_connectionmode);
RDebugUtils.currentLine=33488900;
 //BA.debugLineNum = 33488900;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33619968;
 //BA.debugLineNum = 33619968;BA.debugLine="Public Sub CountPlayableLocalTracksInCurrentSlot(o";
RDebugUtils.currentLine=33619969;
 //BA.debugLineNum = 33619969;BA.debugLine="Dim currentSlot As Map = stateStore.ResolveDataSl";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_effectivenowticks);
RDebugUtils.currentLine=33619970;
 //BA.debugLineNum = 33619970;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=33619971;
 //BA.debugLineNum = 33619971;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=33619972;
 //BA.debugLineNum = 33619972;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=33619973;
 //BA.debugLineNum = 33619973;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
RDebugUtils.currentLine=33619974;
 //BA.debugLineNum = 33619974;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group6 = _playlists;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_playlistobject = group6.Get(index6);
RDebugUtils.currentLine=33619975;
 //BA.debugLineNum = 33619975;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=33619976;
 //BA.debugLineNum = 33619976;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=33619977;
 //BA.debugLineNum = 33619977;BA.debugLine="Dim playlistId As String = playlistDescriptor.G";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=33619978;
 //BA.debugLineNum = 33619978;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=33619979;
 //BA.debugLineNum = 33619979;BA.debugLine="Dim playlistData As Map = stateStore.LoadCached";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = __ref._statestore /*b4j.example.playerstatestore*/ ._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=33619980;
 //BA.debugLineNum = 33619980;BA.debugLine="totalCount = totalCount + CountCachedTracksInPl";
_totalcount = (int) (_totalcount+__ref._countcachedtracksinplaylist /*int*/ (null,_playlistdata));
 };
 }
};
RDebugUtils.currentLine=33619983;
 //BA.debugLineNum = 33619983;BA.debugLine="Return totalCount";
if (true) return _totalcount;
RDebugUtils.currentLine=33619984;
 //BA.debugLineNum = 33619984;BA.debugLine="End Sub";
return 0;
}
public String  _handleblockedstate(b4j.example.playbackdatacoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "handleblockedstate", false))
	 {return ((String) Debug.delegate(ba, "handleblockedstate", null));}
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Public Sub HandleBlockedState";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="stateStore.TraceLog(\"состояние blocked\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние blocked");
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="stateStore.EnterPolicyPause(stateStore.MessageVal";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterpolicypause /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"blocked"),"blocked");
RDebugUtils.currentLine=32833539;
 //BA.debugLineNum = 32833539;BA.debugLine="stateStore.ScheduleRetry(\"blocked\", 0)";
__ref._statestore /*b4j.example.playerstatestore*/ ._scheduleretry /*String*/ (null,"blocked",(int) (0));
RDebugUtils.currentLine=32833540;
 //BA.debugLineNum = 32833540;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33161217;
 //BA.debugLineNum = 33161217;BA.debugLine="stateStore.TraceLog(\"очередь fetch ошибка kind=\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"очередь fetch ошибка kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+" message="+BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)(""))));
RDebugUtils.currentLine=33161218;
 //BA.debugLineNum = 33161218;BA.debugLine="If result.GetDefault(\"Kind\", \"\") = \"network\" Then";
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
RDebugUtils.currentLine=33161219;
 //BA.debugLineNum = 33161219;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=33161220;
 //BA.debugLineNum = 33161220;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=33161222;
 //BA.debugLineNum = 33161222;BA.debugLine="If stateStore.HasLocalPlaybackFallback Then";

case 4:
//if
this.state = 7;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._haslocalplaybackfallback /*boolean*/ (null)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=33161223;
 //BA.debugLineNum = 33161223;BA.debugLine="stateStore.TraceLog(\"fallback выбор mode=local r";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback выбор mode=local reason=data_fetch_error");
RDebugUtils.currentLine=33161224;
 //BA.debugLineNum = 33161224;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=33161225;
 //BA.debugLineNum = 33161225;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=33161227;
 //BA.debugLineNum = 33161227;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=33161228;
 //BA.debugLineNum = 33161228;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=33161229;
 //BA.debugLineNum = 33161229;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Public Sub HandleLocalTemporaryState(text As Strin";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="Dim fallbackReady As Boolean = stateStore.HasLoca";
_fallbackready = __ref._statestore /*b4j.example.playerstatestore*/ ._haslocalplaybackfallback /*boolean*/ (null);
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="stateStore.TraceLog(\"состояние local_empty fallba";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние local_empty fallbackReady="+BA.ObjectToString(_fallbackready)+" text="+_text);
RDebugUtils.currentLine=33030147;
 //BA.debugLineNum = 33030147;BA.debugLine="If fallbackReady Then stateStore.TraceLog(\"fallba";
if (_fallbackready) { 
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback выбор mode=local_ready reason=playable_local_fallback");};
RDebugUtils.currentLine=33030148;
 //BA.debugLineNum = 33030148;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"local_me";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","local_media_unavailable");
RDebugUtils.currentLine=33030149;
 //BA.debugLineNum = 33030149;BA.debugLine="If fallbackReady Then";
if (_fallbackready) { 
RDebugUtils.currentLine=33030150;
 //BA.debugLineNum = 33030150;BA.debugLine="stateStore.EnterLocalPlayback";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterlocalplayback /*String*/ (null);
 }else {
RDebugUtils.currentLine=33030152;
 //BA.debugLineNum = 33030152;BA.debugLine="stateStore.ApplyTemporaryMode(\"local_empty\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._applytemporarymode /*String*/ (null,"local_empty");
 };
RDebugUtils.currentLine=33030154;
 //BA.debugLineNum = 33030154;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=33030155;
 //BA.debugLineNum = 33030155;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=33030156;
 //BA.debugLineNum = 33030156;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=33030157;
 //BA.debugLineNum = 33030157;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=33030158;
 //BA.debugLineNum = 33030158;BA.debugLine="stateStore.ShowMessage(text)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_text);
 }else {
RDebugUtils.currentLine=33030160;
 //BA.debugLineNum = 33030160;BA.debugLine="stateStore.ShowMessage(\"Нет локальных треков\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,"Нет локальных треков");
 };
RDebugUtils.currentLine=33030162;
 //BA.debugLineNum = 33030162;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33423361;
 //BA.debugLineNum = 33423361;BA.debugLine="stateStore.SetPlaybackFlowState(\"error\", \"media_e";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"error","media_error");
RDebugUtils.currentLine=33423362;
 //BA.debugLineNum = 33423362;BA.debugLine="If stateStore.HasLocalPlaybackFallback Then";
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
RDebugUtils.currentLine=33423363;
 //BA.debugLineNum = 33423363;BA.debugLine="stateStore.TraceLog(\"fallback выбор mode=local r";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"fallback выбор mode=local reason=media_error");
RDebugUtils.currentLine=33423364;
 //BA.debugLineNum = 33423364;BA.debugLine="ActivateLocalFallback(True, \"media_failure\")";
__ref._activatelocalfallback /*String*/ (null,parent.__c.True,"media_failure");
RDebugUtils.currentLine=33423365;
 //BA.debugLineNum = 33423365;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=33423367;
 //BA.debugLineNum = 33423367;BA.debugLine="HandleLocalTemporaryState(\"Нет локальных треков\")";
__ref._handlelocaltemporarystate /*String*/ (null,"Нет локальных треков");
RDebugUtils.currentLine=33423368;
 //BA.debugLineNum = 33423368;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=33423369;
 //BA.debugLineNum = 33423369;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33095680;
 //BA.debugLineNum = 33095680;BA.debugLine="Public Sub HandleShutdownMessage(text As String)";
RDebugUtils.currentLine=33095681;
 //BA.debugLineNum = 33095681;BA.debugLine="Dim safeText As String = text";
_safetext = _text;
RDebugUtils.currentLine=33095682;
 //BA.debugLineNum = 33095682;BA.debugLine="If safeText = \"\" Then safeText = stateStore.Messa";
if ((_safetext).equals("")) { 
_safetext = __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"server_wait");};
RDebugUtils.currentLine=33095683;
 //BA.debugLineNum = 33095683;BA.debugLine="stateStore.TraceLog(\"message shutdown text=\" & sa";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"message shutdown text="+_safetext);
RDebugUtils.currentLine=33095684;
 //BA.debugLineNum = 33095684;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"shutdown";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","shutdown");
RDebugUtils.currentLine=33095685;
 //BA.debugLineNum = 33095685;BA.debugLine="stateStore.ClearPolicyPauseAndResumeRequest";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=33095686;
 //BA.debugLineNum = 33095686;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=33095687;
 //BA.debugLineNum = 33095687;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=33095688;
 //BA.debugLineNum = 33095688;BA.debugLine="stateStore.EnterUserStoppedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=33095689;
 //BA.debugLineNum = 33095689;BA.debugLine="stateStore.SetPlayIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplayicon /*String*/ (null);
RDebugUtils.currentLine=33095690;
 //BA.debugLineNum = 33095690;BA.debugLine="stateStore.ShowMessage(safeText)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_safetext);
RDebugUtils.currentLine=33095691;
 //BA.debugLineNum = 33095691;BA.debugLine="stateStore.DisableBackgroundRefreshTimers";
__ref._statestore /*b4j.example.playerstatestore*/ ._disablebackgroundrefreshtimers /*String*/ (null);
RDebugUtils.currentLine=33095692;
 //BA.debugLineNum = 33095692;BA.debugLine="End Sub";
return "";
}
public String  _handletemporarystate(b4j.example.playbackdatacoordinator __ref,String _mode,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "handletemporarystate", false))
	 {return ((String) Debug.delegate(ba, "handletemporarystate", new Object[] {_mode,_text}));}
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Public Sub HandleTemporaryState(mode As String, te";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="stateStore.TraceLog(\"состояние temporary mode=\" &";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние temporary mode="+_mode+" text="+_text);
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="stateStore.ApplyTemporaryMode(mode)";
__ref._statestore /*b4j.example.playerstatestore*/ ._applytemporarymode /*String*/ (null,_mode);
RDebugUtils.currentLine=32768003;
 //BA.debugLineNum = 32768003;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=32768004;
 //BA.debugLineNum = 32768004;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=32768005;
 //BA.debugLineNum = 32768005;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=32768006;
 //BA.debugLineNum = 32768006;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=32768007;
 //BA.debugLineNum = 32768007;BA.debugLine="stateStore.ShowMessage(text)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_text);
 }else 
{RDebugUtils.currentLine=32768008;
 //BA.debugLineNum = 32768008;BA.debugLine="Else If mode = \"network\" Then";
if ((_mode).equals("network")) { 
RDebugUtils.currentLine=32768009;
 //BA.debugLineNum = 32768009;BA.debugLine="stateStore.ShowMessage(\"Проверьте интернет\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,"Проверьте интернет");
 }else {
RDebugUtils.currentLine=32768011;
 //BA.debugLineNum = 32768011;BA.debugLine="stateStore.ShowMessage(stateStore.MessageValue(\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"server_wait"));
 }}
;
RDebugUtils.currentLine=32768013;
 //BA.debugLineNum = 32768013;BA.debugLine="stateStore.ScheduleRetry(mode, 0)";
__ref._statestore /*b4j.example.playerstatestore*/ ._scheduleretry /*String*/ (null,_mode,(int) (0));
RDebugUtils.currentLine=32768014;
 //BA.debugLineNum = 32768014;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.BA _ba,b4j.example.playerstatestore _store,b4j.example.networksyncservice _syncworker) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_store,_syncworker}));}
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Public Sub Initialize(store As PlayerStateStore, s";
RDebugUtils.currentLine=32243713;
 //BA.debugLineNum = 32243713;BA.debugLine="stateStore = store";
__ref._statestore /*b4j.example.playerstatestore*/  = _store;
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="syncService = syncWorker";
__ref._syncservice /*b4j.example.networksyncservice*/  = _syncworker;
RDebugUtils.currentLine=32243715;
 //BA.debugLineNum = 32243715;BA.debugLine="End Sub";
return "";
}
public boolean  _isplaybackallowed(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data,long _effectivenowticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "isplaybackallowed", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackallowed", new Object[] {_data,_effectivenowticks}));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
long _endtimestamp = 0L;
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Public Sub IsPlaybackAllowed(data As Map, effectiv";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="If data.IsInitialized = False Then Return True";
if (_data.IsInitialized()==__c.False) { 
if (true) return __c.True;};
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=32374787;
 //BA.debugLineNum = 32374787;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
if (_playerdata.IsInitialized() && _playerdata.ContainsKey((Object)("playback_allowed"))) { 
RDebugUtils.currentLine=32374788;
 //BA.debugLineNum = 32374788;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
if ((_playerdata.GetDefault((Object)("playback_allowed"),(Object)(__c.True))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
 };
RDebugUtils.currentLine=32374790;
 //BA.debugLineNum = 32374790;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
_endtimestamp = __ref._resolveplaybackendtimestamp /*long*/ (null,_data);
RDebugUtils.currentLine=32374791;
 //BA.debugLineNum = 32374791;BA.debugLine="If endTimestamp <= 0 Then Return True";
if (_endtimestamp<=0) { 
if (true) return __c.True;};
RDebugUtils.currentLine=32374792;
 //BA.debugLineNum = 32374792;BA.debugLine="Return effectiveNowTicks < (endTimestamp * 1000)";
if (true) return _effectivenowticks<(_endtimestamp*1000);
RDebugUtils.currentLine=32374793;
 //BA.debugLineNum = 32374793;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="If stateStore.PlayerCodeValue = \"\" Then Return Fa";
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
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="If stateStore.BeginOfflineDataRefresh = False The";
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
RDebugUtils.currentLine=32702467;
 //BA.debugLineNum = 32702467;BA.debugLine="stateStore.TraceInfo(\"network\", \"запрос данных\",";
__ref._statestore /*b4j.example.playerstatestore*/ ._traceinfo /*String*/ (null,"network","запрос данных","");
RDebugUtils.currentLine=32702468;
 //BA.debugLineNum = 32702468;BA.debugLine="Wait For (syncService.FetchData(fetchTimeoutMs))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackdatacoordinator", "refreshofflinedatanow"), __ref._syncservice /*b4j.example.networksyncservice*/ ._fetchdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_fetchtimeoutms));
this.state = 55;
return;
case 55:
//C
this.state = 13;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=32702469;
 //BA.debugLineNum = 32702469;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
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
RDebugUtils.currentLine=32702470;
 //BA.debugLineNum = 32702470;BA.debugLine="stateStore.IncrementNetworkErrorCount";
__ref._statestore /*b4j.example.playerstatestore*/ ._incrementnetworkerrorcount /*String*/ (null);
RDebugUtils.currentLine=32702471;
 //BA.debugLineNum = 32702471;BA.debugLine="stateStore.TraceWarn(\"network\", \"data ошибка\", \"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data ошибка","kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+" lastDataOkAgoSec="+__ref._statestore /*b4j.example.playerstatestore*/ ._secondsagotext /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._getlastdataokat /*long*/ (null)));
RDebugUtils.currentLine=32702472;
 //BA.debugLineNum = 32702472;BA.debugLine="stateStore.EndOfflineDataRefresh(\"http_failed\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"http_failed");
RDebugUtils.currentLine=32702473;
 //BA.debugLineNum = 32702473;BA.debugLine="stateStore.WriteHealthSnapshot(\"ошибка_data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"ошибка_data");
RDebugUtils.currentLine=32702474;
 //BA.debugLineNum = 32702474;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=32702476;
 //BA.debugLineNum = 32702476;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=32702477;
 //BA.debugLineNum = 32702477;BA.debugLine="If resultData Is Map Then";
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
RDebugUtils.currentLine=32702478;
 //BA.debugLineNum = 32702478;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=32702479;
 //BA.debugLineNum = 32702479;BA.debugLine="If data.GetDefault(\"ok\", False) = True And data.";
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
RDebugUtils.currentLine=32702480;
 //BA.debugLineNum = 32702480;BA.debugLine="stateStore.SetLastDataOkNow";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastdataoknow /*String*/ (null);
RDebugUtils.currentLine=32702481;
 //BA.debugLineNum = 32702481;BA.debugLine="stateStore.ResetConsecutiveNetworkErrors";
__ref._statestore /*b4j.example.playerstatestore*/ ._resetconsecutivenetworkerrors /*String*/ (null);
RDebugUtils.currentLine=32702482;
 //BA.debugLineNum = 32702482;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"data";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"data");
RDebugUtils.currentLine=32702483;
 //BA.debugLineNum = 32702483;BA.debugLine="UpdateTrustedOnlineTimeFromData(data, stateStor";
__ref._updatetrustedonlinetimefromdata /*String*/ (null,_data,__ref._statestore /*b4j.example.playerstatestore*/ ._storage /*b4j.example.keyvaluestore*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._trustedsynctimekey /*String*/ (null));
RDebugUtils.currentLine=32702484;
 //BA.debugLineNum = 32702484;BA.debugLine="stateStore.SaveOfflineData(data)";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveofflinedata /*String*/ (null,_data);
RDebugUtils.currentLine=32702485;
 //BA.debugLineNum = 32702485;BA.debugLine="stateStore.CheckForAppUpdate(data)";
__ref._statestore /*b4j.example.playerstatestore*/ ._checkforappupdate /*String*/ (null,_data);
RDebugUtils.currentLine=32702486;
 //BA.debugLineNum = 32702486;BA.debugLine="If stateStore.IsTraceUploadEnabled Then stateSt";
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
RDebugUtils.currentLine=32702487;
 //BA.debugLineNum = 32702487;BA.debugLine="stateStore.InvalidateRelevantTrackIdsCache";
__ref._statestore /*b4j.example.playerstatestore*/ ._invalidaterelevanttrackidscache /*String*/ (null);
RDebugUtils.currentLine=32702488;
 //BA.debugLineNum = 32702488;BA.debugLine="stateStore.SetRemoteDataReady";
__ref._statestore /*b4j.example.playerstatestore*/ ._setremotedataready /*String*/ (null);
RDebugUtils.currentLine=32702489;
 //BA.debugLineNum = 32702489;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=32702490;
 //BA.debugLineNum = 32702490;BA.debugLine="stateStore.TraceInfo(\"network\", \"data загружены";
__ref._statestore /*b4j.example.playerstatestore*/ ._traceinfo /*String*/ (null,"network","data загружены","trace="+BA.ObjectToString(__ref._statestore /*b4j.example.playerstatestore*/ ._istraceuploadenabled /*boolean*/ (null)));
RDebugUtils.currentLine=32702491;
 //BA.debugLineNum = 32702491;BA.debugLine="stateStore.WriteHealthSnapshot(\"data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"data");
RDebugUtils.currentLine=32702492;
 //BA.debugLineNum = 32702492;BA.debugLine="Wait For (stateStore.SyncOfflinePlaylistMetadat";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackdatacoordinator", "refreshofflinedatanow"), __ref._statestore /*b4j.example.playerstatestore*/ ._syncofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 56;
return;
case 56:
//C
this.state = 29;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=32702493;
 //BA.debugLineNum = 32702493;BA.debugLine="If stateStore.IsStartupSequenceInProgress Then";
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
RDebugUtils.currentLine=32702494;
 //BA.debugLineNum = 32702494;BA.debugLine="stateStore.DeferAdWarmupAfterStartup";
__ref._statestore /*b4j.example.playerstatestore*/ ._deferadwarmupafterstartup /*String*/ (null);
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=32702496;
 //BA.debugLineNum = 32702496;BA.debugLine="stateStore.EnsureAdCacheSyncAsync";
__ref._statestore /*b4j.example.playerstatestore*/ ._ensureadcachesyncasync /*String*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=32702498;
 //BA.debugLineNum = 32702498;BA.debugLine="If IsPlaybackAllowed(stateStore.OfflineData, st";

case 34:
//if
this.state = 37;
if (__ref._isplaybackallowed /*boolean*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._effectivenowticks /*long*/ (null))==parent.__c.False) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=32702499;
 //BA.debugLineNum = 32702499;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReas";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._resolveplaybackblockreason /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._effectivenowticks /*long*/ (null)),"server");
RDebugUtils.currentLine=32702500;
 //BA.debugLineNum = 32702500;BA.debugLine="stateStore.EndOfflineDataRefresh(\"data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"data");
RDebugUtils.currentLine=32702501;
 //BA.debugLineNum = 32702501;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=32702503;
 //BA.debugLineNum = 32702503;BA.debugLine="If stateStore.ResumePlaybackWhenServerAllows An";

case 37:
//if
this.state = 40;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._resumeplaybackwhenserverallows /*boolean*/ (null) && __ref._statestore /*b4j.example.playerstatestore*/ ._shouldresumewithnewstart /*boolean*/ (null)==parent.__c.False && __ref._statestore /*b4j.example.playerstatestore*/ ._isuserstoppedstate /*boolean*/ (null)==parent.__c.False && __ref._statestore /*b4j.example.playerstatestore*/ ._isstopping /*boolean*/ (null)==parent.__c.False) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=32702504;
 //BA.debugLineNum = 32702504;BA.debugLine="stateStore.TraceLog(\"policy resume авто mode=s";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"policy resume авто mode=server_allow");
RDebugUtils.currentLine=32702505;
 //BA.debugLineNum = 32702505;BA.debugLine="stateStore.ClearResumePlaybackWhenServerAllows";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearresumeplaybackwhenserverallows /*String*/ (null);
RDebugUtils.currentLine=32702506;
 //BA.debugLineNum = 32702506;BA.debugLine="stateStore.EnterStartedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=32702507;
 //BA.debugLineNum = 32702507;BA.debugLine="stateStore.SetStopIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setstopicon /*String*/ (null);
RDebugUtils.currentLine=32702508;
 //BA.debugLineNum = 32702508;BA.debugLine="stateStore.HideContentBlocks";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=32702509;
 //BA.debugLineNum = 32702509;BA.debugLine="stateStore.ResumePlaybackAfterPolicyPauseAsync";
__ref._statestore /*b4j.example.playerstatestore*/ ._resumeplaybackafterpolicypauseasync /*String*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=32702511;
 //BA.debugLineNum = 32702511;BA.debugLine="If stateStore.IsPolicyPauseState Then";

case 40:
//if
this.state = 47;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._ispolicypausestate /*boolean*/ (null)) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=32702512;
 //BA.debugLineNum = 32702512;BA.debugLine="stateStore.ClearPolicyPause";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=32702513;
 //BA.debugLineNum = 32702513;BA.debugLine="If stateStore.IsUserStoppedState = False And s";
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
RDebugUtils.currentLine=32702514;
 //BA.debugLineNum = 32702514;BA.debugLine="stateStore.TraceLog(\"policy resume авто mode=";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"policy resume авто mode=policy_pause_clear");
RDebugUtils.currentLine=32702515;
 //BA.debugLineNum = 32702515;BA.debugLine="stateStore.EnterStartedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=32702516;
 //BA.debugLineNum = 32702516;BA.debugLine="stateStore.SetStopIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setstopicon /*String*/ (null);
RDebugUtils.currentLine=32702517;
 //BA.debugLineNum = 32702517;BA.debugLine="stateStore.HideContentBlocks";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=32702518;
 //BA.debugLineNum = 32702518;BA.debugLine="stateStore.ResumePlaybackAfterPolicyPauseAsyn";
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
RDebugUtils.currentLine=32702521;
 //BA.debugLineNum = 32702521;BA.debugLine="stateStore.EndOfflineDataRefresh(\"data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"data");
RDebugUtils.currentLine=32702522;
 //BA.debugLineNum = 32702522;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=32702524;
 //BA.debugLineNum = 32702524;BA.debugLine="If data.GetDefault(\"type\", \"\") = \"message\" Then";

case 48:
//if
this.state = 51;
if ((_data.GetDefault((Object)("type"),(Object)(""))).equals((Object)("message"))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=32702525;
 //BA.debugLineNum = 32702525;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"mess";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"message");
RDebugUtils.currentLine=32702526;
 //BA.debugLineNum = 32702526;BA.debugLine="stateStore.TraceWarn(\"network\", \"data сообщение";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data сообщение","action="+BA.ObjectToString(_data.GetDefault((Object)("action"),(Object)("")))+" reason="+BA.ObjectToString(_data.GetDefault((Object)("reason"),(Object)(""))));
RDebugUtils.currentLine=32702527;
 //BA.debugLineNum = 32702527;BA.debugLine="stateStore.HandleMessageItem(data)";
__ref._statestore /*b4j.example.playerstatestore*/ ._handlemessageitem /*String*/ (null,_data);
RDebugUtils.currentLine=32702528;
 //BA.debugLineNum = 32702528;BA.debugLine="stateStore.EndOfflineDataRefresh(\"message\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,"message");
RDebugUtils.currentLine=32702529;
 //BA.debugLineNum = 32702529;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 51:
//C
this.state = 54;
;
RDebugUtils.currentLine=32702531;
 //BA.debugLineNum = 32702531;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"inval";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"invalid_data");
RDebugUtils.currentLine=32702532;
 //BA.debugLineNum = 32702532;BA.debugLine="stateStore.TraceWarn(\"network\", \"data некорректн";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data некорректны","type="+BA.ObjectToString(_data.GetDefault((Object)("type"),(Object)("")))+" ok="+BA.ObjectToString(_data.GetDefault((Object)("ok"),(Object)(parent.__c.False))));
RDebugUtils.currentLine=32702533;
 //BA.debugLineNum = 32702533;BA.debugLine="PausePlaybackByPolicy(stateStore.MessageValue(\"i";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"invalid_data_response"),"server");
 if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=32702535;
 //BA.debugLineNum = 32702535;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"inval";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastofflinedatarefreshstate /*String*/ (null,"invalid_payload");
RDebugUtils.currentLine=32702536;
 //BA.debugLineNum = 32702536;BA.debugLine="stateStore.TraceWarn(\"network\", \"data некорректн";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data некорректны","payload=not_map");
RDebugUtils.currentLine=32702537;
 //BA.debugLineNum = 32702537;BA.debugLine="PausePlaybackByPolicy(stateStore.MessageValue(\"i";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"invalid_data_response"),"server");
 if (true) break;

case 54:
//C
this.state = -1;
;
RDebugUtils.currentLine=32702539;
 //BA.debugLineNum = 32702539;BA.debugLine="stateStore.EndOfflineDataRefresh(stateStore.LastO";
__ref._statestore /*b4j.example.playerstatestore*/ ._endofflinedatarefresh /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._lastofflinedatarefreshstate /*String*/ (null));
RDebugUtils.currentLine=32702540;
 //BA.debugLineNum = 32702540;BA.debugLine="stateStore.WriteHealthSnapshot(\"ошибка_data\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"ошибка_data");
RDebugUtils.currentLine=32702541;
 //BA.debugLineNum = 32702541;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=32702542;
 //BA.debugLineNum = 32702542;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33357824;
 //BA.debugLineNum = 33357824;BA.debugLine="Public Sub ResetRetryDelay(localRetryInitial As In";
RDebugUtils.currentLine=33357825;
 //BA.debugLineNum = 33357825;BA.debugLine="stateStore.ResetRetryDelayState(localRetryInitial";
__ref._statestore /*b4j.example.playerstatestore*/ ._resetretrydelaystate /*String*/ (null,_localretryinitial,_serverretryinitial);
RDebugUtils.currentLine=33357826;
 //BA.debugLineNum = 33357826;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Public Sub ResolvePlaybackBlockReason(data As Map,";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="If data.IsInitialized = False Then Return stateSt";
if (_data.IsInitialized()==__c.False) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");};
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=32440323;
 //BA.debugLineNum = 32440323;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
RDebugUtils.currentLine=32440324;
 //BA.debugLineNum = 32440324;BA.debugLine="Dim pauseReason As String = playerData.GetDefaul";
_pausereason = BA.ObjectToString(_playerdata.GetDefault((Object)("pause_reason"),(Object)("")));
RDebugUtils.currentLine=32440325;
 //BA.debugLineNum = 32440325;BA.debugLine="If pauseReason <> \"\" Then Return pauseReason";
if ((_pausereason).equals("") == false) { 
if (true) return _pausereason;};
 };
RDebugUtils.currentLine=32440327;
 //BA.debugLineNum = 32440327;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
_endtimestamp = __ref._resolveplaybackendtimestamp /*long*/ (null,_data);
RDebugUtils.currentLine=32440328;
 //BA.debugLineNum = 32440328;BA.debugLine="If endTimestamp > 0 And effectiveNowTicks >= (end";
if (_endtimestamp>0 && _effectivenowticks>=(_endtimestamp*1000)) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"subscription_expired");};
RDebugUtils.currentLine=32440329;
 //BA.debugLineNum = 32440329;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
if (_playerdata.IsInitialized() && _playerdata.ContainsKey((Object)("playback_allowed"))) { 
RDebugUtils.currentLine=32440330;
 //BA.debugLineNum = 32440330;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
if ((_playerdata.GetDefault((Object)("playback_allowed"),(Object)(__c.True))).equals((Object)(__c.True)) == false) { 
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");};
 };
RDebugUtils.currentLine=32440332;
 //BA.debugLineNum = 32440332;BA.debugLine="Return stateStore.MessageValue(\"playback_paused\")";
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._messagevalue /*String*/ (null,"playback_paused");
RDebugUtils.currentLine=32440333;
 //BA.debugLineNum = 32440333;BA.debugLine="End Sub";
return "";
}
public String  _scheduleretry(b4j.example.playbackdatacoordinator __ref,String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "scheduleretry", false))
	 {return ((String) Debug.delegate(ba, "scheduleretry", new Object[] {_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay}));}
RDebugUtils.currentLine=33292288;
 //BA.debugLineNum = 33292288;BA.debugLine="Public Sub ScheduleRetry(mode As String, delayMs A";
RDebugUtils.currentLine=33292289;
 //BA.debugLineNum = 33292289;BA.debugLine="stateStore.ClearRetryTimer";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=33292290;
 //BA.debugLineNum = 33292290;BA.debugLine="stateStore.SetLastRetryMode(mode)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlastretrymode /*String*/ (null,_mode);
RDebugUtils.currentLine=33292291;
 //BA.debugLineNum = 33292291;BA.debugLine="stateStore.SetRetryInterval(ResolveRetryDelay(mod";
__ref._statestore /*b4j.example.playerstatestore*/ ._setretryinterval /*String*/ (null,__ref._resolveretrydelay /*int*/ (null,_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay));
RDebugUtils.currentLine=33292292;
 //BA.debugLineNum = 33292292;BA.debugLine="If stateStore.IsPlaybackStarted = False Or stateS";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._isplaybackstarted /*boolean*/ (null)==__c.False || __ref._statestore /*b4j.example.playerstatestore*/ ._isstoppedbyuser /*boolean*/ (null)) { 
if (true) return "";};
RDebugUtils.currentLine=33292293;
 //BA.debugLineNum = 33292293;BA.debugLine="If stateStore.IsPlaybackPausedByPolicy And mode <";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._isplaybackpausedbypolicy /*boolean*/ (null) && (_mode).equals("blocked") == false && (_mode).equals("audio_device") == false) { 
if (true) return "";};
RDebugUtils.currentLine=33292294;
 //BA.debugLineNum = 33292294;BA.debugLine="stateStore.TraceWarn(\"network\", \"переход в retry\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","переход в retry","mode="+_mode+" delaySec="+BA.NumberToString(__c.Floor(__ref._statestore /*b4j.example.playerstatestore*/ ._getretryinterval /*int*/ (null)/(double)1000)));
RDebugUtils.currentLine=33292295;
 //BA.debugLineNum = 33292295;BA.debugLine="stateStore.WriteHealthSnapshot(\"retry\")";
__ref._statestore /*b4j.example.playerstatestore*/ ._writehealthsnapshot /*String*/ (null,"retry");
RDebugUtils.currentLine=33292296;
 //BA.debugLineNum = 33292296;BA.debugLine="stateStore.EnableRetryTimer";
__ref._statestore /*b4j.example.playerstatestore*/ ._enableretrytimer /*String*/ (null);
RDebugUtils.currentLine=33292297;
 //BA.debugLineNum = 33292297;BA.debugLine="End Sub";
return "";
}
public String  _stopformissingdata(b4j.example.playbackdatacoordinator __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "stopformissingdata", false))
	 {return ((String) Debug.delegate(ba, "stopformissingdata", new Object[] {_text}));}
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Public Sub StopForMissingData(text As String)";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="stateStore.TraceLog(\"состояние stop reason=missin";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"состояние stop reason=missing_data text="+_text);
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"missing_";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplaybackflowstate /*String*/ (null,"idle","missing_data");
RDebugUtils.currentLine=32899075;
 //BA.debugLineNum = 32899075;BA.debugLine="stateStore.ClearPolicyPauseAndResumeRequest";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=32899076;
 //BA.debugLineNum = 32899076;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
__ref._statestore /*b4j.example.playerstatestore*/ ._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=32899077;
 //BA.debugLineNum = 32899077;BA.debugLine="stateStore.ClearPlaybackState";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=32899078;
 //BA.debugLineNum = 32899078;BA.debugLine="stateStore.HidePin";
__ref._statestore /*b4j.example.playerstatestore*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=32899079;
 //BA.debugLineNum = 32899079;BA.debugLine="stateStore.EnterUserStoppedState";
__ref._statestore /*b4j.example.playerstatestore*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=32899080;
 //BA.debugLineNum = 32899080;BA.debugLine="stateStore.SetPlayIcon";
__ref._statestore /*b4j.example.playerstatestore*/ ._setplayicon /*String*/ (null);
RDebugUtils.currentLine=32899081;
 //BA.debugLineNum = 32899081;BA.debugLine="stateStore.ShowMessage(text)";
__ref._statestore /*b4j.example.playerstatestore*/ ._showmessage /*String*/ (null,_text);
RDebugUtils.currentLine=32899082;
 //BA.debugLineNum = 32899082;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Private Sub IsIdleSlot(slotContext As Map) As Bool";
RDebugUtils.currentLine=34144257;
 //BA.debugLineNum = 34144257;BA.debugLine="If slotContext.IsInitialized = False Or slotConte";
if (_slotcontext.IsInitialized()==__c.False || _slotcontext.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="Dim playlists As List = slotContext.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slotcontext.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=34144259;
 //BA.debugLineNum = 34144259;BA.debugLine="If playlists.IsInitialized And playlists.Size > 0";
if (_playlists.IsInitialized() && _playlists.getSize()>0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=34144260;
 //BA.debugLineNum = 34144260;BA.debugLine="Dim streamId As String = slotContext.GetDefault(\"";
_streamid = BA.ObjectToString(_slotcontext.GetDefault((Object)("stream_id"),(Object)("")));
RDebugUtils.currentLine=34144261;
 //BA.debugLineNum = 34144261;BA.debugLine="Dim streamTitle As String = slotContext.GetDefaul";
_streamtitle = BA.ObjectToString(_slotcontext.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=34144262;
 //BA.debugLineNum = 34144262;BA.debugLine="Return streamId = \"\" And streamTitle = \"\"";
if (true) return (_streamid).equals("") && (_streamtitle).equals("");
RDebugUtils.currentLine=34144263;
 //BA.debugLineNum = 34144263;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.playbackdatacoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=32178177;
 //BA.debugLineNum = 32178177;BA.debugLine="Private stateStore As PlayerStateStore";
_statestore = new b4j.example.playerstatestore();
RDebugUtils.currentLine=32178178;
 //BA.debugLineNum = 32178178;BA.debugLine="Private syncService As NetworkSyncService";
_syncservice = new b4j.example.networksyncservice();
RDebugUtils.currentLine=32178179;
 //BA.debugLineNum = 32178179;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33685504;
 //BA.debugLineNum = 33685504;BA.debugLine="Private Sub CountCachedTracksInPlaylist(playlistDa";
RDebugUtils.currentLine=33685505;
 //BA.debugLineNum = 33685505;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=33685506;
 //BA.debugLineNum = 33685506;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=33685507;
 //BA.debugLineNum = 33685507;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=33685508;
 //BA.debugLineNum = 33685508;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
RDebugUtils.currentLine=33685509;
 //BA.debugLineNum = 33685509;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group5 = _tracks;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_trackobject = group5.Get(index5);
RDebugUtils.currentLine=33685510;
 //BA.debugLineNum = 33685510;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=33685511;
 //BA.debugLineNum = 33685511;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=33685512;
 //BA.debugLineNum = 33685512;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=33685513;
 //BA.debugLineNum = 33685513;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=33685514;
 //BA.debugLineNum = 33685514;BA.debugLine="If stateStore.IsTrackCached(trackId) = False The";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._istrackcached /*boolean*/ (null,_trackid)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=33685515;
 //BA.debugLineNum = 33685515;BA.debugLine="totalCount = totalCount + 1";
_totalcount = (int) (_totalcount+1);
 }
};
RDebugUtils.currentLine=33685517;
 //BA.debugLineNum = 33685517;BA.debugLine="Return totalCount";
if (true) return _totalcount;
RDebugUtils.currentLine=33685518;
 //BA.debugLineNum = 33685518;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.playbackdatacoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=34078720;
 //BA.debugLineNum = 34078720;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=34078721;
 //BA.debugLineNum = 34078721;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34078722;
 //BA.debugLineNum = 34078722;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=34078723;
 //BA.debugLineNum = 34078723;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=34078724;
 //BA.debugLineNum = 34078724;BA.debugLine="End Sub";
return null;
}
public boolean  _hasplayablelocaltrackincurrentslot(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _effectivenowticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "hasplayablelocaltrackincurrentslot", false))
	 {return ((Boolean) Debug.delegate(ba, "hasplayablelocaltrackincurrentslot", new Object[] {_offlinedata,_effectivenowticks}));}
RDebugUtils.currentLine=33554432;
 //BA.debugLineNum = 33554432;BA.debugLine="Public Sub HasPlayableLocalTrackInCurrentSlot(offl";
RDebugUtils.currentLine=33554433;
 //BA.debugLineNum = 33554433;BA.debugLine="Return CountPlayableLocalTracksInCurrentSlot(offl";
if (true) return __ref._countplayablelocaltracksincurrentslot /*int*/ (null,_offlinedata,_effectivenowticks)>0;
RDebugUtils.currentLine=33554434;
 //BA.debugLineNum = 33554434;BA.debugLine="End Sub";
return false;
}
public long  _resolveplaybackendtimestamp(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "resolveplaybackendtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "resolveplaybackendtimestamp", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
long _playerend = 0L;
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Public Sub ResolvePlaybackEndTimestamp(data As Map";
RDebugUtils.currentLine=32505857;
 //BA.debugLineNum = 32505857;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=32505859;
 //BA.debugLineNum = 32505859;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
RDebugUtils.currentLine=32505860;
 //BA.debugLineNum = 32505860;BA.debugLine="Dim playerEnd As Long = ParseEndValueToTimestamp";
_playerend = __ref._parseendvaluetotimestamp /*long*/ (null,_playerdata.Get((Object)("end")));
RDebugUtils.currentLine=32505861;
 //BA.debugLineNum = 32505861;BA.debugLine="If playerEnd > 0 Then Return playerEnd";
if (_playerend>0) { 
if (true) return _playerend;};
 };
RDebugUtils.currentLine=32505863;
 //BA.debugLineNum = 32505863;BA.debugLine="Return ParseEndValueToTimestamp(data.Get(\"end\"))";
if (true) return __ref._parseendvaluetotimestamp /*long*/ (null,_data.Get((Object)("end")));
RDebugUtils.currentLine=32505864;
 //BA.debugLineNum = 32505864;BA.debugLine="End Sub";
return 0L;
}
public long  _parsedateonlyendtimestamp(b4j.example.playbackdatacoordinator __ref,String _textvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "parsedateonlyendtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "parsedateonlyendtimestamp", new Object[] {_textvalue}));}
String _previousdateformat = "";
long _daystartticks = 0L;
RDebugUtils.currentLine=34013184;
 //BA.debugLineNum = 34013184;BA.debugLine="Private Sub ParseDateOnlyEndTimestamp(textValue As";
RDebugUtils.currentLine=34013185;
 //BA.debugLineNum = 34013185;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=34013186;
 //BA.debugLineNum = 34013186;BA.debugLine="Try";
try {RDebugUtils.currentLine=34013187;
 //BA.debugLineNum = 34013187;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=34013188;
 //BA.debugLineNum = 34013188;BA.debugLine="Dim dayStartTicks As Long = DateTime.DateParse(t";
_daystartticks = __c.DateTime.DateParse(_textvalue);
RDebugUtils.currentLine=34013189;
 //BA.debugLineNum = 34013189;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=34013190;
 //BA.debugLineNum = 34013190;BA.debugLine="Return Floor((dayStartTicks + DateTime.TicksPerD";
if (true) return (long) (__c.Floor((_daystartticks+__c.DateTime.TicksPerDay)/(double)1000));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=34013192;
 //BA.debugLineNum = 34013192;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=34013193;
 //BA.debugLineNum = 34013193;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
RDebugUtils.currentLine=34013194;
 //BA.debugLineNum = 34013194;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=34013196;
 //BA.debugLineNum = 34013196;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33882112;
 //BA.debugLineNum = 33882112;BA.debugLine="Private Sub ParseEndValueToTimestamp(value As Obje";
RDebugUtils.currentLine=33882113;
 //BA.debugLineNum = 33882113;BA.debugLine="If value = Null Then Return 0";
if (_value== null) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=33882114;
 //BA.debugLineNum = 33882114;BA.debugLine="Dim textValue As String = (\"\" & value).Trim";
_textvalue = (""+BA.ObjectToString(_value)).trim();
RDebugUtils.currentLine=33882115;
 //BA.debugLineNum = 33882115;BA.debugLine="If textValue = \"\" Then Return 0";
if ((_textvalue).equals("")) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=33882116;
 //BA.debugLineNum = 33882116;BA.debugLine="If Regex.IsMatch(\"^\\d+$\", textValue) Then Return";
if (__c.Regex.IsMatch("^\\d+$",_textvalue)) { 
if (true) return (long) (__c.Floor((double)(Double.parseDouble(_textvalue))));};
RDebugUtils.currentLine=33882117;
 //BA.debugLineNum = 33882117;BA.debugLine="If Regex.IsMatch(\"^\\d{4}-\\d{2}-\\d{2}$\", textValue";
if (__c.Regex.IsMatch("^\\d{4}-\\d{2}-\\d{2}$",_textvalue)) { 
RDebugUtils.currentLine=33882118;
 //BA.debugLineNum = 33882118;BA.debugLine="Return ParseDateOnlyEndTimestamp(textValue)";
if (true) return __ref._parsedateonlyendtimestamp /*long*/ (null,_textvalue);
 };
RDebugUtils.currentLine=33882120;
 //BA.debugLineNum = 33882120;BA.debugLine="Try";
try {RDebugUtils.currentLine=33882121;
 //BA.debugLineNum = 33882121;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33882122;
 //BA.debugLineNum = 33882122;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=33882123;
 //BA.debugLineNum = 33882123;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("parse",new Object[]{(Object)(_textvalue)})));
RDebugUtils.currentLine=33882124;
 //BA.debugLineNum = 33882124;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("getEpochSecond",(Object[])(__c.Null)));
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=33882126;
 //BA.debugLineNum = 33882126;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
 };
RDebugUtils.currentLine=33882128;
 //BA.debugLineNum = 33882128;BA.debugLine="Try";
try {RDebugUtils.currentLine=33882129;
 //BA.debugLineNum = 33882129;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
_offsetdatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33882130;
 //BA.debugLineNum = 33882130;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time.";
_offsetdatetimeclass.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=33882131;
 //BA.debugLineNum = 33882131;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTim";
_offsetdatetime = new anywheresoftware.b4j.object.JavaObject();
_offsetdatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetimeclass.RunMethod("parse",new Object[]{(Object)(_textvalue)})));
RDebugUtils.currentLine=33882132;
 //BA.debugLineNum = 33882132;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunMe";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetime.RunMethod("toInstant",(Object[])(__c.Null))));
RDebugUtils.currentLine=33882133;
 //BA.debugLineNum = 33882133;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("getEpochSecond",(Object[])(__c.Null)));
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=33882135;
 //BA.debugLineNum = 33882135;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
 };
RDebugUtils.currentLine=33882137;
 //BA.debugLineNum = 33882137;BA.debugLine="stateStore.TraceLog(\"player end parse fail value=";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"player end parse fail value="+_textvalue);
RDebugUtils.currentLine=33882138;
 //BA.debugLineNum = 33882138;BA.debugLine="Return 0";
if (true) return (long) (0);
RDebugUtils.currentLine=33882139;
 //BA.debugLineNum = 33882139;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33947648;
 //BA.debugLineNum = 33947648;BA.debugLine="Private Sub ParseTrustedOnlineTicks(data As Map) A";
RDebugUtils.currentLine=33947649;
 //BA.debugLineNum = 33947649;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=33947650;
 //BA.debugLineNum = 33947650;BA.debugLine="Dim updatedText As String = (\"\" & data.GetDefault";
_updatedtext = (""+BA.ObjectToString(_data.GetDefault((Object)("updated"),(Object)("")))).trim();
RDebugUtils.currentLine=33947651;
 //BA.debugLineNum = 33947651;BA.debugLine="If updatedText = \"\" Then Return 0";
if ((_updatedtext).equals("")) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=33947652;
 //BA.debugLineNum = 33947652;BA.debugLine="Try";
try {RDebugUtils.currentLine=33947653;
 //BA.debugLineNum = 33947653;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33947654;
 //BA.debugLineNum = 33947654;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=33947655;
 //BA.debugLineNum = 33947655;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("parse",new Object[]{(Object)(_updatedtext)})));
RDebugUtils.currentLine=33947656;
 //BA.debugLineNum = 33947656;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("toEpochMilli",(Object[])(__c.Null)));
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=33947658;
 //BA.debugLineNum = 33947658;BA.debugLine="Try";
try {RDebugUtils.currentLine=33947659;
 //BA.debugLineNum = 33947659;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
_offsetdatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33947660;
 //BA.debugLineNum = 33947660;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time";
_offsetdatetimeclass.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=33947661;
 //BA.debugLineNum = 33947661;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTi";
_offsetdatetime = new anywheresoftware.b4j.object.JavaObject();
_offsetdatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetimeclass.RunMethod("parse",new Object[]{(Object)(_updatedtext)})));
RDebugUtils.currentLine=33947662;
 //BA.debugLineNum = 33947662;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunM";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetime.RunMethod("toInstant",(Object[])(__c.Null))));
RDebugUtils.currentLine=33947663;
 //BA.debugLineNum = 33947663;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("toEpochMilli",(Object[])(__c.Null)));
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=33947665;
 //BA.debugLineNum = 33947665;BA.debugLine="stateStore.ConsumeLastException";
__ref._statestore /*b4j.example.playerstatestore*/ ._consumelastexception /*String*/ (null);
 };
 };
RDebugUtils.currentLine=33947668;
 //BA.debugLineNum = 33947668;BA.debugLine="Return 0";
if (true) return (long) (0);
RDebugUtils.currentLine=33947669;
 //BA.debugLineNum = 33947669;BA.debugLine="End Sub";
return 0L;
}
public String  _updatetrustedonlinetimefromdata(b4j.example.playbackdatacoordinator __ref,anywheresoftware.b4a.objects.collections.Map _data,b4j.example.keyvaluestore _storage,String _storagekey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "updatetrustedonlinetimefromdata", false))
	 {return ((String) Debug.delegate(ba, "updatetrustedonlinetimefromdata", new Object[] {_data,_storage,_storagekey}));}
long _candidateticks = 0L;
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Public Sub UpdateTrustedOnlineTimeFromData(data As";
RDebugUtils.currentLine=32571393;
 //BA.debugLineNum = 32571393;BA.debugLine="Dim candidateTicks As Long = ParseTrustedOnlineTi";
_candidateticks = __ref._parsetrustedonlineticks /*long*/ (null,_data);
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="If candidateTicks <= 0 Then candidateTicks = Date";
if (_candidateticks<=0) { 
_candidateticks = __c.DateTime.getNow();};
RDebugUtils.currentLine=32571395;
 //BA.debugLineNum = 32571395;BA.debugLine="UpdateTrustedOnlineTimeTicks(candidateTicks, stor";
__ref._updatetrustedonlinetimeticks /*String*/ (null,_candidateticks,_storage,_storagekey);
RDebugUtils.currentLine=32571396;
 //BA.debugLineNum = 32571396;BA.debugLine="End Sub";
return "";
}
public int  _resolveretrydelay(b4j.example.playbackdatacoordinator __ref,String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "resolveretrydelay", false))
	 {return ((Integer) Debug.delegate(ba, "resolveretrydelay", new Object[] {_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay}));}
RDebugUtils.currentLine=33226752;
 //BA.debugLineNum = 33226752;BA.debugLine="Public Sub ResolveRetryDelay(mode As String, delay";
RDebugUtils.currentLine=33226753;
 //BA.debugLineNum = 33226753;BA.debugLine="Return stateStore.ResolveRetryDelay(mode, delayMs";
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._resolveretrydelay /*int*/ (null,_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay);
RDebugUtils.currentLine=33226754;
 //BA.debugLineNum = 33226754;BA.debugLine="End Sub";
return 0;
}
public String  _updatetrustedonlinetimeticks(b4j.example.playbackdatacoordinator __ref,long _candidateticks,b4j.example.keyvaluestore _storage,String _storagekey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatacoordinator";
if (Debug.shouldDelegate(ba, "updatetrustedonlinetimeticks", false))
	 {return ((String) Debug.delegate(ba, "updatetrustedonlinetimeticks", new Object[] {_candidateticks,_storage,_storagekey}));}
long _storedticks = 0L;
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Public Sub UpdateTrustedOnlineTimeTicks(candidateT";
RDebugUtils.currentLine=32636929;
 //BA.debugLineNum = 32636929;BA.debugLine="If candidateTicks <= 0 Then Return";
if (_candidateticks<=0) { 
if (true) return "";};
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="Dim storedTicks As Long = storage.GetDefault(stor";
_storedticks = BA.ObjectToLongNumber(_storage._getdefault /*Object*/ (null,_storagekey,(Object)(0)));
RDebugUtils.currentLine=32636931;
 //BA.debugLineNum = 32636931;BA.debugLine="If candidateTicks <= storedTicks Then Return";
if (_candidateticks<=_storedticks) { 
if (true) return "";};
RDebugUtils.currentLine=32636932;
 //BA.debugLineNum = 32636932;BA.debugLine="storage.Put(storageKey, candidateTicks)";
_storage._put /*String*/ (null,_storagekey,(Object)(_candidateticks));
RDebugUtils.currentLine=32636933;
 //BA.debugLineNum = 32636933;BA.debugLine="stateStore.TraceLog(\"trusted time update ticks=\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"trusted time update ticks="+BA.NumberToString(_candidateticks));
RDebugUtils.currentLine=32636934;
 //BA.debugLineNum = 32636934;BA.debugLine="End Sub";
return "";
}
}