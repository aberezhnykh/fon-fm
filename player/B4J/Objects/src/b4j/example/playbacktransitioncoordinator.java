package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbacktransitioncoordinator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbacktransitioncoordinator", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbacktransitioncoordinator.class).invoke(this, new Object[] {null});
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
public b4j.example.b4xmainpage _targetpage = null;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.platformbridge _platformbridge = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public boolean  _cancrossfadeprepareditem(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "cancrossfadeprepareditem", false))
	 {return ((Boolean) Debug.delegate(ba, "cancrossfadeprepareditem", new Object[] {_runtimestate,_metastate,_orchestrationstate,_transitioninprogress}));}
RDebugUtils.currentLine=57671680;
 //BA.debugLineNum = 57671680;BA.debugLine="Public Sub CanCrossfadePreparedItem(runtimeState A";
RDebugUtils.currentLine=57671681;
 //BA.debugLineNum = 57671681;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
if (true) return __ref._canusepreparedtransition /*boolean*/ (null,_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,"track","track","crossfade");
RDebugUtils.currentLine=57671682;
 //BA.debugLineNum = 57671682;BA.debugLine="End Sub";
return false;
}
public boolean  _canstartpreparedontracktail(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "canstartpreparedontracktail", false))
	 {return ((Boolean) Debug.delegate(ba, "canstartpreparedontracktail", new Object[] {_runtimestate,_metastate,_orchestrationstate,_transitioninprogress}));}
RDebugUtils.currentLine=57737216;
 //BA.debugLineNum = 57737216;BA.debugLine="Public Sub CanStartPreparedOnTrackTail(runtimeStat";
RDebugUtils.currentLine=57737217;
 //BA.debugLineNum = 57737217;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
if (true) return __ref._canusepreparedtransition /*boolean*/ (null,_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,"track","ad","tail_start");
RDebugUtils.currentLine=57737218;
 //BA.debugLineNum = 57737218;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparenextplayable(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.List _playqueue,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,b4j.example.mediacache _mediacacheservice,String _playbackflowstate,String _flowplaying,String _flowidle,String _flowpreparing) throws Exception{
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "preparenextplayable", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "preparenextplayable", new Object[] {_playqueue,_runtimestate,_metastate,_orchestrationstate,_mediacacheservice,_playbackflowstate,_flowplaying,_flowidle,_flowpreparing}));}
ResumableSub_PrepareNextPlayable rsub = new ResumableSub_PrepareNextPlayable(this,__ref,_playqueue,_runtimestate,_metastate,_orchestrationstate,_mediacacheservice,_playbackflowstate,_flowplaying,_flowidle,_flowpreparing);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareNextPlayable extends BA.ResumableSub {
public ResumableSub_PrepareNextPlayable(b4j.example.playbacktransitioncoordinator parent,b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.List _playqueue,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,b4j.example.mediacache _mediacacheservice,String _playbackflowstate,String _flowplaying,String _flowidle,String _flowpreparing) {
this.parent = parent;
this.__ref = __ref;
this._playqueue = _playqueue;
this._runtimestate = _runtimestate;
this._metastate = _metastate;
this._orchestrationstate = _orchestrationstate;
this._mediacacheservice = _mediacacheservice;
this._playbackflowstate = _playbackflowstate;
this._flowplaying = _flowplaying;
this._flowidle = _flowidle;
this._flowpreparing = _flowpreparing;
this.__ref = parent;
}
b4j.example.playbacktransitioncoordinator __ref;
b4j.example.playbacktransitioncoordinator parent;
anywheresoftware.b4a.objects.collections.List _playqueue;
b4j.example.playbackruntimestate _runtimestate;
b4j.example.playbackmetastate _metastate;
b4j.example.playbackorchestrationstate _orchestrationstate;
b4j.example.mediacache _mediacacheservice;
String _playbackflowstate;
String _flowplaying;
String _flowidle;
String _flowpreparing;
int _candidateindex = 0;
int _scanindex = 0;
Object _nextobject = null;
anywheresoftware.b4a.objects.collections.Map _candidateitem = null;
String _candidatetype = "";
anywheresoftware.b4a.objects.collections.Map _activeitem = null;
anywheresoftware.b4a.objects.collections.Map _nextitem = null;
anywheresoftware.b4a.objects.collections.Map _existingprepareditem = null;
String _existingpreparedaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _matchargs = null;
String _targetaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _pendingprepareargs = null;
String _previousflowstate = "";
anywheresoftware.b4a.objects.collections.Map _flowargs = null;
anywheresoftware.b4a.objects.collections.Map _mediaargs = null;
String _nextitemurl = "";
double _volume = 0;
b4j.example.audioplayer _targetaudio = null;
anywheresoftware.b4a.objects.collections.Map _waitargs = null;
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.Map _readyargs = null;
anywheresoftware.b4a.objects.collections.Map _failedargs = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbacktransitioncoordinator";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=57868289;
 //BA.debugLineNum = 57868289;BA.debugLine="Dim candidateIndex As Int = -1";
_candidateindex = (int) (-1);
RDebugUtils.currentLine=57868290;
 //BA.debugLineNum = 57868290;BA.debugLine="Do While playQueue.Size > 0";
if (true) break;

case 1:
//do while
this.state = 41;
while (_playqueue.getSize()>0) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=57868291;
 //BA.debugLineNum = 57868291;BA.debugLine="Dim scanIndex As Int = candidateIndex + 1";
_scanindex = (int) (_candidateindex+1);
RDebugUtils.currentLine=57868292;
 //BA.debugLineNum = 57868292;BA.debugLine="If scanIndex < 0 Then scanIndex = 0";
if (true) break;

case 4:
//if
this.state = 9;
if (_scanindex<0) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_scanindex = (int) (0);
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=57868293;
 //BA.debugLineNum = 57868293;BA.debugLine="If scanIndex >= playQueue.Size Then Return False";
if (true) break;

case 10:
//if
this.state = 15;
if (_scanindex>=_playqueue.getSize()) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=57868294;
 //BA.debugLineNum = 57868294;BA.debugLine="Dim nextObject As Object = playQueue.Get(scanInd";
_nextobject = _playqueue.Get(_scanindex);
RDebugUtils.currentLine=57868295;
 //BA.debugLineNum = 57868295;BA.debugLine="If nextObject Is Map Then";
if (true) break;

case 16:
//if
this.state = 21;
if (_nextobject instanceof java.util.Map) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=57868297;
 //BA.debugLineNum = 57868297;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=57868299;
 //BA.debugLineNum = 57868299;BA.debugLine="Dim candidateItem As Map = nextObject";
_candidateitem = new anywheresoftware.b4a.objects.collections.Map();
_candidateitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_nextobject));
RDebugUtils.currentLine=57868300;
 //BA.debugLineNum = 57868300;BA.debugLine="Dim candidateType As String = candidateItem.GetD";
_candidatetype = BA.ObjectToString(_candidateitem.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=57868301;
 //BA.debugLineNum = 57868301;BA.debugLine="If candidateType = \"break\" Then";
if (true) break;

case 22:
//if
this.state = 25;
if ((_candidatetype).equals("break")) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=57868302;
 //BA.debugLineNum = 57868302;BA.debugLine="Trace(\"prefetch skip reason=break_ahead item=\"";
__ref._trace /*String*/ (null,"prefetch skip reason=break_ahead item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=57868303;
 //BA.debugLineNum = 57868303;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=57868304;
 //BA.debugLineNum = 57868304;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;
;
RDebugUtils.currentLine=57868306;
 //BA.debugLineNum = 57868306;BA.debugLine="If candidateType <> \"track\" And candidateType <>";

case 25:
//if
this.state = 30;
if ((_candidatetype).equals("track") == false && (_candidatetype).equals("ad") == false) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=57868307;
 //BA.debugLineNum = 57868307;BA.debugLine="Dim activeItem As Map = targetPage.Transition_Ge";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectoractiveitem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=57868308;
 //BA.debugLineNum = 57868308;BA.debugLine="If ItemsMatch(activeItem, candidateItem) Then";
if (true) break;

case 31:
//if
this.state = 34;
if (__ref._itemsmatch /*boolean*/ (null,_activeitem,_candidateitem)) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=57868309;
 //BA.debugLineNum = 57868309;BA.debugLine="Trace(\"prefetch skip reason=active_item item=\"";
__ref._trace /*String*/ (null,"prefetch skip reason=active_item item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=57868310;
 //BA.debugLineNum = 57868310;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=57868311;
 //BA.debugLineNum = 57868311;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;
;
RDebugUtils.currentLine=57868313;
 //BA.debugLineNum = 57868313;BA.debugLine="If candidateType = \"track\" And mediaCacheService";

case 34:
//if
this.state = 37;
if ((_candidatetype).equals("track") && _mediacacheservice._istrackcached /*boolean*/ (null,BA.ObjectToString(_candidateitem.GetDefault((Object)("id"),(Object)(""))))==parent.__c.False) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=57868314;
 //BA.debugLineNum = 57868314;BA.debugLine="Trace(\"prefetch skip reason=no_local_track item";
__ref._trace /*String*/ (null,"prefetch skip reason=no_local_track item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=57868315;
 //BA.debugLineNum = 57868315;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=57868316;
 //BA.debugLineNum = 57868316;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;
;
RDebugUtils.currentLine=57868318;
 //BA.debugLineNum = 57868318;BA.debugLine="If candidateType = \"ad\" And mediaCacheService.Is";

case 37:
//if
this.state = 40;
if ((_candidatetype).equals("ad") && _mediacacheservice._isadcached /*boolean*/ (null,BA.ObjectToString(_candidateitem.GetDefault((Object)("id"),(Object)(""))))==parent.__c.False) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=57868319;
 //BA.debugLineNum = 57868319;BA.debugLine="Trace(\"prefetch skip reason=no_local_ad item=\"";
__ref._trace /*String*/ (null,"prefetch skip reason=no_local_ad item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=57868320;
 //BA.debugLineNum = 57868320;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=57868321;
 //BA.debugLineNum = 57868321;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;

case 40:
//C
this.state = 1;
;
RDebugUtils.currentLine=57868323;
 //BA.debugLineNum = 57868323;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=57868324;
 //BA.debugLineNum = 57868324;BA.debugLine="Exit";
this.state = 41;
if (true) break;
 if (true) break;
;
RDebugUtils.currentLine=57868326;
 //BA.debugLineNum = 57868326;BA.debugLine="If candidateIndex < 0 Or candidateIndex >= playQu";

case 41:
//if
this.state = 46;
if (_candidateindex<0 || _candidateindex>=_playqueue.getSize()) { 
this.state = 43;
;}if (true) break;

case 43:
//C
this.state = 46;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 46:
//C
this.state = 47;
;
RDebugUtils.currentLine=57868327;
 //BA.debugLineNum = 57868327;BA.debugLine="Dim nextItem As Map = playQueue.Get(candidateInde";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playqueue.Get(_candidateindex)));
RDebugUtils.currentLine=57868328;
 //BA.debugLineNum = 57868328;BA.debugLine="Dim existingPreparedItem As Map = targetPage.Tran";
_existingprepareditem = new anywheresoftware.b4a.objects.collections.Map();
_existingprepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=57868329;
 //BA.debugLineNum = 57868329;BA.debugLine="Dim existingPreparedAudioKey As String = targetPa";
_existingpreparedaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=57868330;
 //BA.debugLineNum = 57868330;BA.debugLine="If existingPreparedItem.IsInitialized And existin";
if (true) break;

case 47:
//if
this.state = 54;
if (_existingprepareditem.IsInitialized() && (_existingpreparedaudiokey).equals("") == false) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=57868331;
 //BA.debugLineNum = 57868331;BA.debugLine="Dim matchArgs As Map";
_matchargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57868332;
 //BA.debugLineNum = 57868332;BA.debugLine="matchArgs.Initialize";
_matchargs.Initialize();
RDebugUtils.currentLine=57868333;
 //BA.debugLineNum = 57868333;BA.debugLine="matchArgs.Put(\"first\", existingPreparedItem)";
_matchargs.Put((Object)("first"),(Object)(_existingprepareditem.getObject()));
RDebugUtils.currentLine=57868334;
 //BA.debugLineNum = 57868334;BA.debugLine="matchArgs.Put(\"second\", nextItem)";
_matchargs.Put((Object)("second"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=57868335;
 //BA.debugLineNum = 57868335;BA.debugLine="If targetPage.Transition_ItemsMatch(matchArgs) T";
if (true) break;

case 50:
//if
this.state = 53;
if (__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_itemsmatch /*boolean*/ (null,_matchargs)) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=57868336;
 //BA.debugLineNum = 57868336;BA.debugLine="Trace(\"prefetch reuse prepared item=\" & Describ";
__ref._trace /*String*/ (null,"prefetch reuse prepared item="+__ref._describeitem /*String*/ (null,_nextitem));
RDebugUtils.currentLine=57868337;
 //BA.debugLineNum = 57868337;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=57868340;
 //BA.debugLineNum = 57868340;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
_targetaudiokey = __ref._getinactiveaudiokey /*String*/ (null,_runtimestate);
RDebugUtils.currentLine=57868341;
 //BA.debugLineNum = 57868341;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=57868342;
 //BA.debugLineNum = 57868342;BA.debugLine="Dim pendingPrepareArgs As Map";
_pendingprepareargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57868343;
 //BA.debugLineNum = 57868343;BA.debugLine="pendingPrepareArgs.Initialize";
_pendingprepareargs.Initialize();
RDebugUtils.currentLine=57868344;
 //BA.debugLineNum = 57868344;BA.debugLine="pendingPrepareArgs.Put(\"audioKey\", targetAudioKey";
_pendingprepareargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=57868345;
 //BA.debugLineNum = 57868345;BA.debugLine="pendingPrepareArgs.Put(\"item\", nextItem)";
_pendingprepareargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=57868346;
 //BA.debugLineNum = 57868346;BA.debugLine="targetPage.Transition_SetDirectorPendingPrepare(p";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setdirectorpendingprepare /*String*/ (null,_pendingprepareargs);
RDebugUtils.currentLine=57868347;
 //BA.debugLineNum = 57868347;BA.debugLine="Dim previousFlowState As String = playbackFlowSta";
_previousflowstate = _playbackflowstate;
RDebugUtils.currentLine=57868348;
 //BA.debugLineNum = 57868348;BA.debugLine="If playbackFlowState = flowPlaying Or playbackFlo";
if (true) break;

case 55:
//if
this.state = 58;
if ((_playbackflowstate).equals(_flowplaying) || (_playbackflowstate).equals(_flowidle)) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=57868349;
 //BA.debugLineNum = 57868349;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57868350;
 //BA.debugLineNum = 57868350;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
RDebugUtils.currentLine=57868351;
 //BA.debugLineNum = 57868351;BA.debugLine="flowArgs.Put(\"state\", flowPreparing)";
_flowargs.Put((Object)("state"),(Object)(_flowpreparing));
RDebugUtils.currentLine=57868352;
 //BA.debugLineNum = 57868352;BA.debugLine="flowArgs.Put(\"reason\", \"prepare_next:\" & nextIte";
_flowargs.Put((Object)("reason"),(Object)("prepare_next:"+BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")))));
RDebugUtils.currentLine=57868353;
 //BA.debugLineNum = 57868353;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowA";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_flowargs);
 if (true) break;

case 58:
//C
this.state = 59;
;
RDebugUtils.currentLine=57868355;
 //BA.debugLineNum = 57868355;BA.debugLine="Dim mediaArgs As Map";
_mediaargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57868356;
 //BA.debugLineNum = 57868356;BA.debugLine="mediaArgs.Initialize";
_mediaargs.Initialize();
RDebugUtils.currentLine=57868357;
 //BA.debugLineNum = 57868357;BA.debugLine="mediaArgs.Put(\"audioKey\", targetAudioKey)";
_mediaargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=57868358;
 //BA.debugLineNum = 57868358;BA.debugLine="mediaArgs.Put(\"item\", nextItem)";
_mediaargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=57868359;
 //BA.debugLineNum = 57868359;BA.debugLine="Dim nextItemUrl As String = targetPage.Transition";
_nextitemurl = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_resolveplaybackmediaurl /*String*/ (null,_mediaargs);
RDebugUtils.currentLine=57868360;
 //BA.debugLineNum = 57868360;BA.debugLine="If nextItemUrl = \"\" Then";
if (true) break;

case 59:
//if
this.state = 62;
if ((_nextitemurl).equals("")) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=57868361;
 //BA.debugLineNum = 57868361;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetAu";
__ref._trace /*String*/ (null,"переход preload ошибка audio="+_targetaudiokey+" message=empty_media_url");
RDebugUtils.currentLine=57868362;
 //BA.debugLineNum = 57868362;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 62:
//C
this.state = 63;
;
RDebugUtils.currentLine=57868364;
 //BA.debugLineNum = 57868364;BA.debugLine="Trace(\"prefetch load audio=\" & targetAudioKey & \"";
__ref._trace /*String*/ (null,"prefetch load audio="+_targetaudiokey+" item="+__ref._describeitem /*String*/ (null,_nextitem));
RDebugUtils.currentLine=57868365;
 //BA.debugLineNum = 57868365;BA.debugLine="Dim volume As Double = targetPage.Transition_Curr";
_volume = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_currentvolume /*double*/ (null,_nextitem);
RDebugUtils.currentLine=57868366;
 //BA.debugLineNum = 57868366;BA.debugLine="Dim targetAudio As AudioPlayer = targetPage.Trans";
_targetaudio = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getaudiobykey /*b4j.example.audioplayer*/ (null,_targetaudiokey);
RDebugUtils.currentLine=57868367;
 //BA.debugLineNum = 57868367;BA.debugLine="targetAudio.LoadUrl(nextItemUrl, volume)";
_targetaudio._loadurl /*String*/ (null,_nextitemurl,_volume);
RDebugUtils.currentLine=57868368;
 //BA.debugLineNum = 57868368;BA.debugLine="Dim waitArgs As Map";
_waitargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57868369;
 //BA.debugLineNum = 57868369;BA.debugLine="waitArgs.Initialize";
_waitargs.Initialize();
RDebugUtils.currentLine=57868370;
 //BA.debugLineNum = 57868370;BA.debugLine="waitArgs.Put(\"audioKey\", targetAudioKey)";
_waitargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=57868371;
 //BA.debugLineNum = 57868371;BA.debugLine="waitArgs.Put(\"item\", nextItem)";
_waitargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=57868372;
 //BA.debugLineNum = 57868372;BA.debugLine="waitArgs.Put(\"timeoutMs\", 5000)";
_waitargs.Put((Object)("timeoutMs"),(Object)(5000));
RDebugUtils.currentLine=57868373;
 //BA.debugLineNum = 57868373;BA.debugLine="Wait For (targetPage.Transition_WaitForPreparedAu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbacktransitioncoordinator", "preparenextplayable"), __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_waitforpreparedaudio /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_waitargs));
this.state = 73;
return;
case 73:
//C
this.state = 63;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=57868374;
 //BA.debugLineNum = 57868374;BA.debugLine="If targetPage.Transition_GetPlaybackFlowState = f";
if (true) break;

case 63:
//if
this.state = 72;
if ((__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getplaybackflowstate /*String*/ (null)).equals(_flowpreparing)) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=57868375;
 //BA.debugLineNum = 57868375;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
if (true) break;

case 66:
//if
this.state = 71;
if (BA.ObjectToBoolean(_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)))) { 
this.state = 68;
}else {
this.state = 70;
}if (true) break;

case 68:
//C
this.state = 71;
RDebugUtils.currentLine=57868376;
 //BA.debugLineNum = 57868376;BA.debugLine="Dim readyArgs As Map";
_readyargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57868377;
 //BA.debugLineNum = 57868377;BA.debugLine="readyArgs.Initialize";
_readyargs.Initialize();
RDebugUtils.currentLine=57868378;
 //BA.debugLineNum = 57868378;BA.debugLine="readyArgs.Put(\"state\", previousFlowState)";
_readyargs.Put((Object)("state"),(Object)(_previousflowstate));
RDebugUtils.currentLine=57868379;
 //BA.debugLineNum = 57868379;BA.debugLine="readyArgs.Put(\"reason\", \"prepare_ready\")";
_readyargs.Put((Object)("reason"),(Object)("prepare_ready"));
RDebugUtils.currentLine=57868380;
 //BA.debugLineNum = 57868380;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(read";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_readyargs);
RDebugUtils.currentLine=57868381;
 //BA.debugLineNum = 57868381;BA.debugLine="Trace(\"prefetch prepared audio=\" & targetAudioK";
__ref._trace /*String*/ (null,"prefetch prepared audio="+_targetaudiokey+" item="+__ref._describeitem /*String*/ (null,_nextitem));
 if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=57868383;
 //BA.debugLineNum = 57868383;BA.debugLine="Dim failedArgs As Map";
_failedargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57868384;
 //BA.debugLineNum = 57868384;BA.debugLine="failedArgs.Initialize";
_failedargs.Initialize();
RDebugUtils.currentLine=57868385;
 //BA.debugLineNum = 57868385;BA.debugLine="failedArgs.Put(\"state\", \"error\")";
_failedargs.Put((Object)("state"),(Object)("error"));
RDebugUtils.currentLine=57868386;
 //BA.debugLineNum = 57868386;BA.debugLine="failedArgs.Put(\"reason\", \"prepare_failed\")";
_failedargs.Put((Object)("reason"),(Object)("prepare_failed"));
RDebugUtils.currentLine=57868387;
 //BA.debugLineNum = 57868387;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(fail";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_failedargs);
RDebugUtils.currentLine=57868388;
 //BA.debugLineNum = 57868388;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetA";
__ref._trace /*String*/ (null,"переход preload ошибка audio="+_targetaudiokey);
 if (true) break;

case 71:
//C
this.state = 72;
;
 if (true) break;

case 72:
//C
this.state = -1;
;
RDebugUtils.currentLine=57868391;
 //BA.debugLineNum = 57868391;BA.debugLine="Return result.GetDefault(\"Success\", False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)));return;};
RDebugUtils.currentLine=57868392;
 //BA.debugLineNum = 57868392;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _getinactiveaudiokey(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "getinactiveaudiokey", false))
	 {return ((String) Debug.delegate(ba, "getinactiveaudiokey", new Object[] {_runtimestate}));}
RDebugUtils.currentLine=57475072;
 //BA.debugLineNum = 57475072;BA.debugLine="Public Sub GetInactiveAudioKey(runtimeState As Pla";
RDebugUtils.currentLine=57475073;
 //BA.debugLineNum = 57475073;BA.debugLine="If targetPage.Transition_GetDirectorActiveAudioKe";
if ((__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectoractiveaudiokey /*String*/ (null)).equals("primary")) { 
if (true) return "secondary";};
RDebugUtils.currentLine=57475074;
 //BA.debugLineNum = 57475074;BA.debugLine="Return \"primary\"";
if (true) return "primary";
RDebugUtils.currentLine=57475075;
 //BA.debugLineNum = 57475075;BA.debugLine="End Sub";
return "";
}
public boolean  _hasusableprepareditem(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "hasusableprepareditem", false))
	 {return ((Boolean) Debug.delegate(ba, "hasusableprepareditem", new Object[] {_runtimestate}));}
String _preparedaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
String _preparedtype = "";
RDebugUtils.currentLine=57540608;
 //BA.debugLineNum = 57540608;BA.debugLine="Public Sub HasUsablePreparedItem(runtimeState As P";
RDebugUtils.currentLine=57540609;
 //BA.debugLineNum = 57540609;BA.debugLine="Dim preparedAudioKey As String = targetPage.Trans";
_preparedaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=57540610;
 //BA.debugLineNum = 57540610;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=57540611;
 //BA.debugLineNum = 57540611;BA.debugLine="If preparedAudioKey = \"\" Then Return False";
if ((_preparedaudiokey).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57540612;
 //BA.debugLineNum = 57540612;BA.debugLine="If preparedItem.IsInitialized = False Then Return";
if (_prepareditem.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57540613;
 //BA.debugLineNum = 57540613;BA.debugLine="Dim preparedType As String = preparedItem.GetDefa";
_preparedtype = BA.ObjectToString(_prepareditem.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=57540614;
 //BA.debugLineNum = 57540614;BA.debugLine="Return preparedType = \"track\" Or preparedType = \"";
if (true) return (_preparedtype).equals("track") || (_preparedtype).equals("ad");
RDebugUtils.currentLine=57540615;
 //BA.debugLineNum = 57540615;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.BA _ba,b4j.example.b4xmainpage _targetpagevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_targetpagevalue}));}
RDebugUtils.currentLine=57409536;
 //BA.debugLineNum = 57409536;BA.debugLine="Public Sub Initialize(targetPageValue As B4XMainPa";
RDebugUtils.currentLine=57409537;
 //BA.debugLineNum = 57409537;BA.debugLine="targetPage = targetPageValue";
__ref._targetpage /*b4j.example.b4xmainpage*/  = _targetpagevalue;
RDebugUtils.currentLine=57409538;
 //BA.debugLineNum = 57409538;BA.debugLine="End Sub";
return "";
}
public int  _preparedfadeoutms(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackmetastate _metastate,b4j.example.playbackruntimestate _runtimestate,int _trackoverlapms,int _adtailoverlapms) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "preparedfadeoutms", false))
	 {return ((Integer) Debug.delegate(ba, "preparedfadeoutms", new Object[] {_metastate,_runtimestate,_trackoverlapms,_adtailoverlapms}));}
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
String _nexttype = "";
RDebugUtils.currentLine=57802752;
 //BA.debugLineNum = 57802752;BA.debugLine="Public Sub PreparedFadeOutMs(metaState As Playback";
RDebugUtils.currentLine=57802753;
 //BA.debugLineNum = 57802753;BA.debugLine="If metaState.CurrentMediaType <> \"track\" Then Ret";
if ((_metastate._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=57802754;
 //BA.debugLineNum = 57802754;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=57802755;
 //BA.debugLineNum = 57802755;BA.debugLine="If preparedItem.IsInitialized = False Then Return";
if (_prepareditem.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=57802756;
 //BA.debugLineNum = 57802756;BA.debugLine="Dim nextType As String = preparedItem.GetDefault(";
_nexttype = BA.ObjectToString(_prepareditem.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=57802757;
 //BA.debugLineNum = 57802757;BA.debugLine="If nextType = \"track\" Then Return trackOverlapMs";
if ((_nexttype).equals("track")) { 
if (true) return _trackoverlapms;};
RDebugUtils.currentLine=57802758;
 //BA.debugLineNum = 57802758;BA.debugLine="If nextType = \"ad\" Then Return adTailOverlapMs";
if ((_nexttype).equals("ad")) { 
if (true) return _adtailoverlapms;};
RDebugUtils.currentLine=57802759;
 //BA.debugLineNum = 57802759;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=57802760;
 //BA.debugLineNum = 57802760;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparespecificplayable(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.Map _nextitem,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,String _playbackflowstate,String _flowplaying,String _flowidle,String _flowpreparing) throws Exception{
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "preparespecificplayable", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "preparespecificplayable", new Object[] {_nextitem,_runtimestate,_metastate,_orchestrationstate,_playbackflowstate,_flowplaying,_flowidle,_flowpreparing}));}
ResumableSub_PrepareSpecificPlayable rsub = new ResumableSub_PrepareSpecificPlayable(this,__ref,_nextitem,_runtimestate,_metastate,_orchestrationstate,_playbackflowstate,_flowplaying,_flowidle,_flowpreparing);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareSpecificPlayable extends BA.ResumableSub {
public ResumableSub_PrepareSpecificPlayable(b4j.example.playbacktransitioncoordinator parent,b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.Map _nextitem,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,String _playbackflowstate,String _flowplaying,String _flowidle,String _flowpreparing) {
this.parent = parent;
this.__ref = __ref;
this._nextitem = _nextitem;
this._runtimestate = _runtimestate;
this._metastate = _metastate;
this._orchestrationstate = _orchestrationstate;
this._playbackflowstate = _playbackflowstate;
this._flowplaying = _flowplaying;
this._flowidle = _flowidle;
this._flowpreparing = _flowpreparing;
this.__ref = parent;
}
b4j.example.playbacktransitioncoordinator __ref;
b4j.example.playbacktransitioncoordinator parent;
anywheresoftware.b4a.objects.collections.Map _nextitem;
b4j.example.playbackruntimestate _runtimestate;
b4j.example.playbackmetastate _metastate;
b4j.example.playbackorchestrationstate _orchestrationstate;
String _playbackflowstate;
String _flowplaying;
String _flowidle;
String _flowpreparing;
anywheresoftware.b4a.objects.collections.Map _existingprepareditem = null;
String _existingpreparedaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _matchargs = null;
String _targetaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _pendingprepareargs = null;
String _previousflowstate = "";
anywheresoftware.b4a.objects.collections.Map _flowargs = null;
anywheresoftware.b4a.objects.collections.Map _mediaargs = null;
String _nextitemurl = "";
double _volume = 0;
b4j.example.audioplayer _targetaudio = null;
anywheresoftware.b4a.objects.collections.Map _waitargs = null;
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.Map _readyargs = null;
anywheresoftware.b4a.objects.collections.Map _failedargs = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbacktransitioncoordinator";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=57933825;
 //BA.debugLineNum = 57933825;BA.debugLine="If nextItem.IsInitialized = False Or nextItem.Siz";
if (true) break;

case 1:
//if
this.state = 6;
if (_nextitem.IsInitialized()==parent.__c.False || _nextitem.getSize()==0) { 
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
RDebugUtils.currentLine=57933826;
 //BA.debugLineNum = 57933826;BA.debugLine="Dim existingPreparedItem As Map = targetPage.Tran";
_existingprepareditem = new anywheresoftware.b4a.objects.collections.Map();
_existingprepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=57933827;
 //BA.debugLineNum = 57933827;BA.debugLine="Dim existingPreparedAudioKey As String = targetPa";
_existingpreparedaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=57933828;
 //BA.debugLineNum = 57933828;BA.debugLine="If existingPreparedItem.IsInitialized And existin";
if (true) break;

case 7:
//if
this.state = 14;
if (_existingprepareditem.IsInitialized() && (_existingpreparedaudiokey).equals("") == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=57933829;
 //BA.debugLineNum = 57933829;BA.debugLine="Dim matchArgs As Map";
_matchargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57933830;
 //BA.debugLineNum = 57933830;BA.debugLine="matchArgs.Initialize";
_matchargs.Initialize();
RDebugUtils.currentLine=57933831;
 //BA.debugLineNum = 57933831;BA.debugLine="matchArgs.Put(\"first\", existingPreparedItem)";
_matchargs.Put((Object)("first"),(Object)(_existingprepareditem.getObject()));
RDebugUtils.currentLine=57933832;
 //BA.debugLineNum = 57933832;BA.debugLine="matchArgs.Put(\"second\", nextItem)";
_matchargs.Put((Object)("second"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=57933833;
 //BA.debugLineNum = 57933833;BA.debugLine="If targetPage.Transition_ItemsMatch(matchArgs) T";
if (true) break;

case 10:
//if
this.state = 13;
if (__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_itemsmatch /*boolean*/ (null,_matchargs)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=57933834;
 //BA.debugLineNum = 57933834;BA.debugLine="Trace(\"prefetch reuse prepared item=\" & Describ";
__ref._trace /*String*/ (null,"prefetch reuse prepared item="+__ref._describeitem /*String*/ (null,_nextitem));
RDebugUtils.currentLine=57933835;
 //BA.debugLineNum = 57933835;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=57933838;
 //BA.debugLineNum = 57933838;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
_targetaudiokey = __ref._getinactiveaudiokey /*String*/ (null,_runtimestate);
RDebugUtils.currentLine=57933839;
 //BA.debugLineNum = 57933839;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=57933840;
 //BA.debugLineNum = 57933840;BA.debugLine="Dim pendingPrepareArgs As Map";
_pendingprepareargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57933841;
 //BA.debugLineNum = 57933841;BA.debugLine="pendingPrepareArgs.Initialize";
_pendingprepareargs.Initialize();
RDebugUtils.currentLine=57933842;
 //BA.debugLineNum = 57933842;BA.debugLine="pendingPrepareArgs.Put(\"audioKey\", targetAudioKey";
_pendingprepareargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=57933843;
 //BA.debugLineNum = 57933843;BA.debugLine="pendingPrepareArgs.Put(\"item\", nextItem)";
_pendingprepareargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=57933844;
 //BA.debugLineNum = 57933844;BA.debugLine="targetPage.Transition_SetDirectorPendingPrepare(p";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setdirectorpendingprepare /*String*/ (null,_pendingprepareargs);
RDebugUtils.currentLine=57933845;
 //BA.debugLineNum = 57933845;BA.debugLine="Dim previousFlowState As String = playbackFlowSta";
_previousflowstate = _playbackflowstate;
RDebugUtils.currentLine=57933846;
 //BA.debugLineNum = 57933846;BA.debugLine="If playbackFlowState = flowPlaying Or playbackFlo";
if (true) break;

case 15:
//if
this.state = 18;
if ((_playbackflowstate).equals(_flowplaying) || (_playbackflowstate).equals(_flowidle)) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=57933847;
 //BA.debugLineNum = 57933847;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57933848;
 //BA.debugLineNum = 57933848;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
RDebugUtils.currentLine=57933849;
 //BA.debugLineNum = 57933849;BA.debugLine="flowArgs.Put(\"state\", flowPreparing)";
_flowargs.Put((Object)("state"),(Object)(_flowpreparing));
RDebugUtils.currentLine=57933850;
 //BA.debugLineNum = 57933850;BA.debugLine="flowArgs.Put(\"reason\", \"prepare_direct:\" & nextI";
_flowargs.Put((Object)("reason"),(Object)("prepare_direct:"+BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")))));
RDebugUtils.currentLine=57933851;
 //BA.debugLineNum = 57933851;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowA";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_flowargs);
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=57933853;
 //BA.debugLineNum = 57933853;BA.debugLine="Dim mediaArgs As Map";
_mediaargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57933854;
 //BA.debugLineNum = 57933854;BA.debugLine="mediaArgs.Initialize";
_mediaargs.Initialize();
RDebugUtils.currentLine=57933855;
 //BA.debugLineNum = 57933855;BA.debugLine="mediaArgs.Put(\"audioKey\", targetAudioKey)";
_mediaargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=57933856;
 //BA.debugLineNum = 57933856;BA.debugLine="mediaArgs.Put(\"item\", nextItem)";
_mediaargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=57933857;
 //BA.debugLineNum = 57933857;BA.debugLine="Dim nextItemUrl As String = targetPage.Transition";
_nextitemurl = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_resolveplaybackmediaurl /*String*/ (null,_mediaargs);
RDebugUtils.currentLine=57933858;
 //BA.debugLineNum = 57933858;BA.debugLine="If nextItemUrl = \"\" Then";
if (true) break;

case 19:
//if
this.state = 22;
if ((_nextitemurl).equals("")) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=57933859;
 //BA.debugLineNum = 57933859;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetAu";
__ref._trace /*String*/ (null,"переход preload ошибка audio="+_targetaudiokey+" message=empty_media_url");
RDebugUtils.currentLine=57933860;
 //BA.debugLineNum = 57933860;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=57933862;
 //BA.debugLineNum = 57933862;BA.debugLine="Trace(\"prefetch load audio=\" & targetAudioKey & \"";
__ref._trace /*String*/ (null,"prefetch load audio="+_targetaudiokey+" item="+__ref._describeitem /*String*/ (null,_nextitem));
RDebugUtils.currentLine=57933863;
 //BA.debugLineNum = 57933863;BA.debugLine="Dim volume As Double = targetPage.Transition_Curr";
_volume = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_currentvolume /*double*/ (null,_nextitem);
RDebugUtils.currentLine=57933864;
 //BA.debugLineNum = 57933864;BA.debugLine="Dim targetAudio As AudioPlayer = targetPage.Trans";
_targetaudio = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getaudiobykey /*b4j.example.audioplayer*/ (null,_targetaudiokey);
RDebugUtils.currentLine=57933865;
 //BA.debugLineNum = 57933865;BA.debugLine="targetAudio.LoadUrl(nextItemUrl, volume)";
_targetaudio._loadurl /*String*/ (null,_nextitemurl,_volume);
RDebugUtils.currentLine=57933866;
 //BA.debugLineNum = 57933866;BA.debugLine="Dim waitArgs As Map";
_waitargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57933867;
 //BA.debugLineNum = 57933867;BA.debugLine="waitArgs.Initialize";
_waitargs.Initialize();
RDebugUtils.currentLine=57933868;
 //BA.debugLineNum = 57933868;BA.debugLine="waitArgs.Put(\"audioKey\", targetAudioKey)";
_waitargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=57933869;
 //BA.debugLineNum = 57933869;BA.debugLine="waitArgs.Put(\"item\", nextItem)";
_waitargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=57933870;
 //BA.debugLineNum = 57933870;BA.debugLine="waitArgs.Put(\"timeoutMs\", 5000)";
_waitargs.Put((Object)("timeoutMs"),(Object)(5000));
RDebugUtils.currentLine=57933871;
 //BA.debugLineNum = 57933871;BA.debugLine="Wait For (targetPage.Transition_WaitForPreparedAu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbacktransitioncoordinator", "preparespecificplayable"), __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_waitforpreparedaudio /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_waitargs));
this.state = 33;
return;
case 33:
//C
this.state = 23;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=57933872;
 //BA.debugLineNum = 57933872;BA.debugLine="If targetPage.Transition_GetPlaybackFlowState = f";
if (true) break;

case 23:
//if
this.state = 32;
if ((__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getplaybackflowstate /*String*/ (null)).equals(_flowpreparing)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=57933873;
 //BA.debugLineNum = 57933873;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
if (true) break;

case 26:
//if
this.state = 31;
if (BA.ObjectToBoolean(_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)))) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=57933874;
 //BA.debugLineNum = 57933874;BA.debugLine="Dim readyArgs As Map";
_readyargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57933875;
 //BA.debugLineNum = 57933875;BA.debugLine="readyArgs.Initialize";
_readyargs.Initialize();
RDebugUtils.currentLine=57933876;
 //BA.debugLineNum = 57933876;BA.debugLine="readyArgs.Put(\"state\", previousFlowState)";
_readyargs.Put((Object)("state"),(Object)(_previousflowstate));
RDebugUtils.currentLine=57933877;
 //BA.debugLineNum = 57933877;BA.debugLine="readyArgs.Put(\"reason\", \"prepare_ready\")";
_readyargs.Put((Object)("reason"),(Object)("prepare_ready"));
RDebugUtils.currentLine=57933878;
 //BA.debugLineNum = 57933878;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(read";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_readyargs);
RDebugUtils.currentLine=57933879;
 //BA.debugLineNum = 57933879;BA.debugLine="Trace(\"prefetch prepared audio=\" & targetAudioK";
__ref._trace /*String*/ (null,"prefetch prepared audio="+_targetaudiokey+" item="+__ref._describeitem /*String*/ (null,_nextitem));
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=57933881;
 //BA.debugLineNum = 57933881;BA.debugLine="Dim failedArgs As Map";
_failedargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57933882;
 //BA.debugLineNum = 57933882;BA.debugLine="failedArgs.Initialize";
_failedargs.Initialize();
RDebugUtils.currentLine=57933883;
 //BA.debugLineNum = 57933883;BA.debugLine="failedArgs.Put(\"state\", \"error\")";
_failedargs.Put((Object)("state"),(Object)("error"));
RDebugUtils.currentLine=57933884;
 //BA.debugLineNum = 57933884;BA.debugLine="failedArgs.Put(\"reason\", \"prepare_failed\")";
_failedargs.Put((Object)("reason"),(Object)("prepare_failed"));
RDebugUtils.currentLine=57933885;
 //BA.debugLineNum = 57933885;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(fail";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_failedargs);
RDebugUtils.currentLine=57933886;
 //BA.debugLineNum = 57933886;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetA";
__ref._trace /*String*/ (null,"переход preload ошибка audio="+_targetaudiokey);
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=57933889;
 //BA.debugLineNum = 57933889;BA.debugLine="Return result.GetDefault(\"Success\", False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)));return;};
RDebugUtils.currentLine=57933890;
 //BA.debugLineNum = 57933890;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _promotepreparedplayer(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate,b4j.example.dataplaybackresolver _dataresolver,b4j.example.keyvaluestore _storage,int _fadeinms,int _fadeoutms,String _flowtransitioning) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "promotepreparedplayer", false))
	 {return ((Boolean) Debug.delegate(ba, "promotepreparedplayer", new Object[] {_runtimestate,_dataresolver,_storage,_fadeinms,_fadeoutms,_flowtransitioning}));}
String _preparedaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
anywheresoftware.b4a.objects.collections.Map _flowargs = null;
String _previousaudiokey = "";
String _nextaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _promoteditem = null;
b4j.example.audioplayer _previousaudio = null;
anywheresoftware.b4a.objects.collections.Map _activateargs = null;
RDebugUtils.currentLine=57999360;
 //BA.debugLineNum = 57999360;BA.debugLine="Public Sub PromotePreparedPlayer(runtimeState As P";
RDebugUtils.currentLine=57999361;
 //BA.debugLineNum = 57999361;BA.debugLine="Dim preparedAudioKey As String = targetPage.Trans";
_preparedaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=57999362;
 //BA.debugLineNum = 57999362;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=57999363;
 //BA.debugLineNum = 57999363;BA.debugLine="If preparedAudioKey = \"\" Or preparedItem.IsInitia";
if ((_preparedaudiokey).equals("") || _prepareditem.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=57999364;
 //BA.debugLineNum = 57999364;BA.debugLine="Trace(\"переход prepared reject reason=missing_pr";
__ref._trace /*String*/ (null,"переход prepared reject reason=missing_prepared");
RDebugUtils.currentLine=57999365;
 //BA.debugLineNum = 57999365;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=57999367;
 //BA.debugLineNum = 57999367;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57999368;
 //BA.debugLineNum = 57999368;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
RDebugUtils.currentLine=57999369;
 //BA.debugLineNum = 57999369;BA.debugLine="flowArgs.Put(\"state\", flowTransitioning)";
_flowargs.Put((Object)("state"),(Object)(_flowtransitioning));
RDebugUtils.currentLine=57999370;
 //BA.debugLineNum = 57999370;BA.debugLine="flowArgs.Put(\"reason\", \"promote_prepared\")";
_flowargs.Put((Object)("reason"),(Object)("promote_prepared"));
RDebugUtils.currentLine=57999371;
 //BA.debugLineNum = 57999371;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowAr";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_flowargs);
RDebugUtils.currentLine=57999372;
 //BA.debugLineNum = 57999372;BA.debugLine="Dim previousAudioKey As String = targetPage.Trans";
_previousaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectoractiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=57999373;
 //BA.debugLineNum = 57999373;BA.debugLine="Dim nextAudioKey As String = preparedAudioKey";
_nextaudiokey = _preparedaudiokey;
RDebugUtils.currentLine=57999374;
 //BA.debugLineNum = 57999374;BA.debugLine="Dim promotedItem As Map = CloneMap(preparedItem)";
_promoteditem = new anywheresoftware.b4a.objects.collections.Map();
_promoteditem = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_prepareditem);
RDebugUtils.currentLine=57999375;
 //BA.debugLineNum = 57999375;BA.debugLine="targetPage.Transition_ConsumePreparedQueueItem";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_consumepreparedqueueitem /*String*/ (null);
RDebugUtils.currentLine=57999376;
 //BA.debugLineNum = 57999376;BA.debugLine="If previousAudioKey <> \"\" And previousAudioKey <>";
if ((_previousaudiokey).equals("") == false && (_previousaudiokey).equals(_nextaudiokey) == false) { 
RDebugUtils.currentLine=57999377;
 //BA.debugLineNum = 57999377;BA.debugLine="Dim previousAudio As AudioPlayer = targetPage.Tr";
_previousaudio = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getaudiobykey /*b4j.example.audioplayer*/ (null,_previousaudiokey);
RDebugUtils.currentLine=57999378;
 //BA.debugLineNum = 57999378;BA.debugLine="previousAudio.Stop(fadeOutMs)";
_previousaudio._stop /*String*/ (null,_fadeoutms);
 };
RDebugUtils.currentLine=57999380;
 //BA.debugLineNum = 57999380;BA.debugLine="dataResolver.CommitPlaylistCursor(storage, promot";
_dataresolver._commitplaylistcursor /*String*/ (null,_storage,_promoteditem);
RDebugUtils.currentLine=57999381;
 //BA.debugLineNum = 57999381;BA.debugLine="Dim activateArgs As Map";
_activateargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57999382;
 //BA.debugLineNum = 57999382;BA.debugLine="activateArgs.Initialize";
_activateargs.Initialize();
RDebugUtils.currentLine=57999383;
 //BA.debugLineNum = 57999383;BA.debugLine="activateArgs.Put(\"audioKey\", nextAudioKey)";
_activateargs.Put((Object)("audioKey"),(Object)(_nextaudiokey));
RDebugUtils.currentLine=57999384;
 //BA.debugLineNum = 57999384;BA.debugLine="activateArgs.Put(\"item\", promotedItem)";
_activateargs.Put((Object)("item"),(Object)(_promoteditem.getObject()));
RDebugUtils.currentLine=57999385;
 //BA.debugLineNum = 57999385;BA.debugLine="activateArgs.Put(\"fadeInMs\", fadeInMs)";
_activateargs.Put((Object)("fadeInMs"),(Object)(_fadeinms));
RDebugUtils.currentLine=57999386;
 //BA.debugLineNum = 57999386;BA.debugLine="Trace(\"prepared promote audio=\" & nextAudioKey &";
__ref._trace /*String*/ (null,"prepared promote audio="+_nextaudiokey+" type="+BA.ObjectToString(_promoteditem.GetDefault((Object)("type"),(Object)("")))+" id="+BA.ObjectToString(_promoteditem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=57999387;
 //BA.debugLineNum = 57999387;BA.debugLine="targetPage.Transition_ActivateLoadedItem(activate";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_activateloadeditem /*String*/ (null,_activateargs);
RDebugUtils.currentLine=57999388;
 //BA.debugLineNum = 57999388;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_clearpreparedstate /*String*/ (null,__c.False);
RDebugUtils.currentLine=57999389;
 //BA.debugLineNum = 57999389;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=57999390;
 //BA.debugLineNum = 57999390;BA.debugLine="End Sub";
return false;
}
public boolean  _canusepreparedtransition(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress,String _currenttype,String _preparedtype,String _decisionname) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "canusepreparedtransition", false))
	 {return ((Boolean) Debug.delegate(ba, "canusepreparedtransition", new Object[] {_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,_currenttype,_preparedtype,_decisionname}));}
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
RDebugUtils.currentLine=57606144;
 //BA.debugLineNum = 57606144;BA.debugLine="Public Sub CanUsePreparedTransition(runtimeState A";
RDebugUtils.currentLine=57606145;
 //BA.debugLineNum = 57606145;BA.debugLine="If transitionInProgress Then Return False";
if (_transitioninprogress) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57606146;
 //BA.debugLineNum = 57606146;BA.debugLine="If orchestrationState.IsCrossfadeTriggered Then R";
if (_orchestrationstate._iscrossfadetriggered /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57606147;
 //BA.debugLineNum = 57606147;BA.debugLine="If metaState.CurrentMediaType <> currentType Then";
if ((_metastate._currentmediatype /*String*/ ).equals(_currenttype) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57606148;
 //BA.debugLineNum = 57606148;BA.debugLine="If HasUsablePreparedItem(runtimeState) = False Th";
if (__ref._hasusableprepareditem /*boolean*/ (null,_runtimestate)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57606149;
 //BA.debugLineNum = 57606149;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=57606150;
 //BA.debugLineNum = 57606150;BA.debugLine="Return preparedItem.GetDefault(\"type\", \"\") = prep";
if (true) return (_prepareditem.GetDefault((Object)("type"),(Object)(""))).equals((Object)(_preparedtype));
RDebugUtils.currentLine=57606151;
 //BA.debugLineNum = 57606151;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.playbacktransitioncoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
RDebugUtils.currentLine=57344000;
 //BA.debugLineNum = 57344000;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=57344001;
 //BA.debugLineNum = 57344001;BA.debugLine="Private targetPage As B4XMainPage";
_targetpage = new b4j.example.b4xmainpage();
RDebugUtils.currentLine=57344002;
 //BA.debugLineNum = 57344002;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
RDebugUtils.currentLine=58195968;
 //BA.debugLineNum = 58195968;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=58195969;
 //BA.debugLineNum = 58195969;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58195970;
 //BA.debugLineNum = 58195970;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
RDebugUtils.currentLine=58195971;
 //BA.debugLineNum = 58195971;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
RDebugUtils.currentLine=58195972;
 //BA.debugLineNum = 58195972;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=58195973;
 //BA.debugLineNum = 58195973;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=58195975;
 //BA.debugLineNum = 58195975;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
RDebugUtils.currentLine=58195976;
 //BA.debugLineNum = 58195976;BA.debugLine="End Sub";
return null;
}
public String  _describeitem(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "describeitem", false))
	 {return ((String) Debug.delegate(ba, "describeitem", new Object[] {_item}));}
RDebugUtils.currentLine=58064896;
 //BA.debugLineNum = 58064896;BA.debugLine="Private Sub DescribeItem(item As Map) As String";
RDebugUtils.currentLine=58064897;
 //BA.debugLineNum = 58064897;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=58064898;
 //BA.debugLineNum = 58064898;BA.debugLine="Return targetPage.Transition_DescribeItem(item)";
if (true) return __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_describeitem /*String*/ (null,_item);
RDebugUtils.currentLine=58064899;
 //BA.debugLineNum = 58064899;BA.debugLine="End Sub";
return "";
}
public boolean  _itemsmatch(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.Map _firstitem,anywheresoftware.b4a.objects.collections.Map _seconditem) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "itemsmatch", false))
	 {return ((Boolean) Debug.delegate(ba, "itemsmatch", new Object[] {_firstitem,_seconditem}));}
anywheresoftware.b4a.objects.collections.Map _args = null;
RDebugUtils.currentLine=58130432;
 //BA.debugLineNum = 58130432;BA.debugLine="Private Sub ItemsMatch(firstItem As Map, secondIte";
RDebugUtils.currentLine=58130433;
 //BA.debugLineNum = 58130433;BA.debugLine="Dim args As Map";
_args = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58130434;
 //BA.debugLineNum = 58130434;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=58130435;
 //BA.debugLineNum = 58130435;BA.debugLine="args.Put(\"first\", firstItem)";
_args.Put((Object)("first"),(Object)(_firstitem.getObject()));
RDebugUtils.currentLine=58130436;
 //BA.debugLineNum = 58130436;BA.debugLine="args.Put(\"second\", secondItem)";
_args.Put((Object)("second"),(Object)(_seconditem.getObject()));
RDebugUtils.currentLine=58130437;
 //BA.debugLineNum = 58130437;BA.debugLine="Return targetPage.Transition_ItemsMatch(args)";
if (true) return __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_itemsmatch /*boolean*/ (null,_args);
RDebugUtils.currentLine=58130438;
 //BA.debugLineNum = 58130438;BA.debugLine="End Sub";
return false;
}
public String  _trace(b4j.example.playbacktransitioncoordinator __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=58261504;
 //BA.debugLineNum = 58261504;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=58261505;
 //BA.debugLineNum = 58261505;BA.debugLine="targetPage.TraceLog(message)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._tracelog /*String*/ (null,_message);
RDebugUtils.currentLine=58261506;
 //BA.debugLineNum = 58261506;BA.debugLine="End Sub";
return "";
}
}