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
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public boolean  _cancrossfadeprepareditem(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "cancrossfadeprepareditem", false))
	 {return ((Boolean) Debug.delegate(ba, "cancrossfadeprepareditem", new Object[] {_runtimestate,_metastate,_orchestrationstate,_transitioninprogress}));}
RDebugUtils.currentLine=58064896;
 //BA.debugLineNum = 58064896;BA.debugLine="Public Sub CanCrossfadePreparedItem(runtimeState A";
RDebugUtils.currentLine=58064897;
 //BA.debugLineNum = 58064897;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
if (true) return __ref._canusepreparedtransition /*boolean*/ (null,_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,"track","track","crossfade");
RDebugUtils.currentLine=58064898;
 //BA.debugLineNum = 58064898;BA.debugLine="End Sub";
return false;
}
public boolean  _canstartpreparedontracktail(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "canstartpreparedontracktail", false))
	 {return ((Boolean) Debug.delegate(ba, "canstartpreparedontracktail", new Object[] {_runtimestate,_metastate,_orchestrationstate,_transitioninprogress}));}
RDebugUtils.currentLine=58130432;
 //BA.debugLineNum = 58130432;BA.debugLine="Public Sub CanStartPreparedOnTrackTail(runtimeStat";
RDebugUtils.currentLine=58130433;
 //BA.debugLineNum = 58130433;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
if (true) return __ref._canusepreparedtransition /*boolean*/ (null,_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,"track","ad","tail_start");
RDebugUtils.currentLine=58130434;
 //BA.debugLineNum = 58130434;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=58261505;
 //BA.debugLineNum = 58261505;BA.debugLine="Dim candidateIndex As Int = -1";
_candidateindex = (int) (-1);
RDebugUtils.currentLine=58261506;
 //BA.debugLineNum = 58261506;BA.debugLine="Do While playQueue.Size > 0";
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
RDebugUtils.currentLine=58261507;
 //BA.debugLineNum = 58261507;BA.debugLine="Dim scanIndex As Int = candidateIndex + 1";
_scanindex = (int) (_candidateindex+1);
RDebugUtils.currentLine=58261508;
 //BA.debugLineNum = 58261508;BA.debugLine="If scanIndex < 0 Then scanIndex = 0";
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
RDebugUtils.currentLine=58261509;
 //BA.debugLineNum = 58261509;BA.debugLine="If scanIndex >= playQueue.Size Then Return False";
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
RDebugUtils.currentLine=58261510;
 //BA.debugLineNum = 58261510;BA.debugLine="Dim nextObject As Object = playQueue.Get(scanInd";
_nextobject = _playqueue.Get(_scanindex);
RDebugUtils.currentLine=58261511;
 //BA.debugLineNum = 58261511;BA.debugLine="If nextObject Is Map Then";
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
RDebugUtils.currentLine=58261513;
 //BA.debugLineNum = 58261513;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=58261515;
 //BA.debugLineNum = 58261515;BA.debugLine="Dim candidateItem As Map = nextObject";
_candidateitem = new anywheresoftware.b4a.objects.collections.Map();
_candidateitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_nextobject));
RDebugUtils.currentLine=58261516;
 //BA.debugLineNum = 58261516;BA.debugLine="Dim candidateType As String = candidateItem.GetD";
_candidatetype = BA.ObjectToString(_candidateitem.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=58261517;
 //BA.debugLineNum = 58261517;BA.debugLine="If candidateType = \"break\" Then";
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
RDebugUtils.currentLine=58261518;
 //BA.debugLineNum = 58261518;BA.debugLine="Trace(\"prefetch skip reason=break_ahead item=\"";
__ref._trace /*String*/ (null,"prefetch skip reason=break_ahead item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=58261519;
 //BA.debugLineNum = 58261519;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=58261520;
 //BA.debugLineNum = 58261520;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;
;
RDebugUtils.currentLine=58261522;
 //BA.debugLineNum = 58261522;BA.debugLine="If candidateType <> \"track\" And candidateType <>";

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
RDebugUtils.currentLine=58261523;
 //BA.debugLineNum = 58261523;BA.debugLine="Dim activeItem As Map = targetPage.Transition_Ge";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectoractiveitem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=58261524;
 //BA.debugLineNum = 58261524;BA.debugLine="If ItemsMatch(activeItem, candidateItem) Then";
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
RDebugUtils.currentLine=58261525;
 //BA.debugLineNum = 58261525;BA.debugLine="Trace(\"prefetch skip reason=active_item item=\"";
__ref._trace /*String*/ (null,"prefetch skip reason=active_item item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=58261526;
 //BA.debugLineNum = 58261526;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=58261527;
 //BA.debugLineNum = 58261527;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;
;
RDebugUtils.currentLine=58261529;
 //BA.debugLineNum = 58261529;BA.debugLine="If candidateType = \"track\" And mediaCacheService";

case 34:
//if
this.state = 37;
if ((_candidatetype).equals("track") && _mediacacheservice._istrackcached /*boolean*/ (null,BA.ObjectToString(_candidateitem.GetDefault((Object)("id"),(Object)(""))))==parent.__c.False) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=58261530;
 //BA.debugLineNum = 58261530;BA.debugLine="Trace(\"prefetch skip reason=no_local_track item";
__ref._trace /*String*/ (null,"prefetch skip reason=no_local_track item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=58261531;
 //BA.debugLineNum = 58261531;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=58261532;
 //BA.debugLineNum = 58261532;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;
;
RDebugUtils.currentLine=58261534;
 //BA.debugLineNum = 58261534;BA.debugLine="If candidateType = \"ad\" And mediaCacheService.Is";

case 37:
//if
this.state = 40;
if ((_candidatetype).equals("ad") && _mediacacheservice._isadcached /*boolean*/ (null,BA.ObjectToString(_candidateitem.GetDefault((Object)("id"),(Object)(""))))==parent.__c.False) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=58261535;
 //BA.debugLineNum = 58261535;BA.debugLine="Trace(\"prefetch skip reason=no_local_ad item=\"";
__ref._trace /*String*/ (null,"prefetch skip reason=no_local_ad item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=58261536;
 //BA.debugLineNum = 58261536;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=58261537;
 //BA.debugLineNum = 58261537;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;

case 40:
//C
this.state = 1;
;
RDebugUtils.currentLine=58261539;
 //BA.debugLineNum = 58261539;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=58261540;
 //BA.debugLineNum = 58261540;BA.debugLine="Exit";
this.state = 41;
if (true) break;
 if (true) break;
;
RDebugUtils.currentLine=58261542;
 //BA.debugLineNum = 58261542;BA.debugLine="If candidateIndex < 0 Or candidateIndex >= playQu";

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
RDebugUtils.currentLine=58261543;
 //BA.debugLineNum = 58261543;BA.debugLine="Dim nextItem As Map = playQueue.Get(candidateInde";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playqueue.Get(_candidateindex)));
RDebugUtils.currentLine=58261544;
 //BA.debugLineNum = 58261544;BA.debugLine="Dim existingPreparedItem As Map = targetPage.Tran";
_existingprepareditem = new anywheresoftware.b4a.objects.collections.Map();
_existingprepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=58261545;
 //BA.debugLineNum = 58261545;BA.debugLine="Dim existingPreparedAudioKey As String = targetPa";
_existingpreparedaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=58261546;
 //BA.debugLineNum = 58261546;BA.debugLine="If existingPreparedItem.IsInitialized And existin";
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
RDebugUtils.currentLine=58261547;
 //BA.debugLineNum = 58261547;BA.debugLine="Dim matchArgs As Map";
_matchargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58261548;
 //BA.debugLineNum = 58261548;BA.debugLine="matchArgs.Initialize";
_matchargs.Initialize();
RDebugUtils.currentLine=58261549;
 //BA.debugLineNum = 58261549;BA.debugLine="matchArgs.Put(\"first\", existingPreparedItem)";
_matchargs.Put((Object)("first"),(Object)(_existingprepareditem.getObject()));
RDebugUtils.currentLine=58261550;
 //BA.debugLineNum = 58261550;BA.debugLine="matchArgs.Put(\"second\", nextItem)";
_matchargs.Put((Object)("second"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=58261551;
 //BA.debugLineNum = 58261551;BA.debugLine="If targetPage.Transition_ItemsMatch(matchArgs) T";
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
RDebugUtils.currentLine=58261552;
 //BA.debugLineNum = 58261552;BA.debugLine="Trace(\"prefetch reuse prepared item=\" & Describ";
__ref._trace /*String*/ (null,"prefetch reuse prepared item="+__ref._describeitem /*String*/ (null,_nextitem));
RDebugUtils.currentLine=58261553;
 //BA.debugLineNum = 58261553;BA.debugLine="Return True";
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
RDebugUtils.currentLine=58261556;
 //BA.debugLineNum = 58261556;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
_targetaudiokey = __ref._getinactiveaudiokey /*String*/ (null,_runtimestate);
RDebugUtils.currentLine=58261557;
 //BA.debugLineNum = 58261557;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=58261558;
 //BA.debugLineNum = 58261558;BA.debugLine="Dim pendingPrepareArgs As Map";
_pendingprepareargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58261559;
 //BA.debugLineNum = 58261559;BA.debugLine="pendingPrepareArgs.Initialize";
_pendingprepareargs.Initialize();
RDebugUtils.currentLine=58261560;
 //BA.debugLineNum = 58261560;BA.debugLine="pendingPrepareArgs.Put(\"audioKey\", targetAudioKey";
_pendingprepareargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=58261561;
 //BA.debugLineNum = 58261561;BA.debugLine="pendingPrepareArgs.Put(\"item\", nextItem)";
_pendingprepareargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=58261562;
 //BA.debugLineNum = 58261562;BA.debugLine="targetPage.Transition_SetDirectorPendingPrepare(p";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setdirectorpendingprepare /*String*/ (null,_pendingprepareargs);
RDebugUtils.currentLine=58261563;
 //BA.debugLineNum = 58261563;BA.debugLine="Dim previousFlowState As String = playbackFlowSta";
_previousflowstate = _playbackflowstate;
RDebugUtils.currentLine=58261564;
 //BA.debugLineNum = 58261564;BA.debugLine="If playbackFlowState = flowPlaying Or playbackFlo";
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
RDebugUtils.currentLine=58261565;
 //BA.debugLineNum = 58261565;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58261566;
 //BA.debugLineNum = 58261566;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
RDebugUtils.currentLine=58261567;
 //BA.debugLineNum = 58261567;BA.debugLine="flowArgs.Put(\"state\", flowPreparing)";
_flowargs.Put((Object)("state"),(Object)(_flowpreparing));
RDebugUtils.currentLine=58261568;
 //BA.debugLineNum = 58261568;BA.debugLine="flowArgs.Put(\"reason\", \"prepare_next:\" & nextIte";
_flowargs.Put((Object)("reason"),(Object)("prepare_next:"+BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")))));
RDebugUtils.currentLine=58261569;
 //BA.debugLineNum = 58261569;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowA";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_flowargs);
 if (true) break;

case 58:
//C
this.state = 59;
;
RDebugUtils.currentLine=58261571;
 //BA.debugLineNum = 58261571;BA.debugLine="Dim mediaArgs As Map";
_mediaargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58261572;
 //BA.debugLineNum = 58261572;BA.debugLine="mediaArgs.Initialize";
_mediaargs.Initialize();
RDebugUtils.currentLine=58261573;
 //BA.debugLineNum = 58261573;BA.debugLine="mediaArgs.Put(\"audioKey\", targetAudioKey)";
_mediaargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=58261574;
 //BA.debugLineNum = 58261574;BA.debugLine="mediaArgs.Put(\"item\", nextItem)";
_mediaargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=58261575;
 //BA.debugLineNum = 58261575;BA.debugLine="Dim nextItemUrl As String = targetPage.Transition";
_nextitemurl = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_resolveplaybackmediaurl /*String*/ (null,_mediaargs);
RDebugUtils.currentLine=58261576;
 //BA.debugLineNum = 58261576;BA.debugLine="If nextItemUrl = \"\" Then";
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
RDebugUtils.currentLine=58261577;
 //BA.debugLineNum = 58261577;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetAu";
__ref._trace /*String*/ (null,"переход preload ошибка audio="+_targetaudiokey+" message=empty_media_url");
RDebugUtils.currentLine=58261578;
 //BA.debugLineNum = 58261578;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 62:
//C
this.state = 63;
;
RDebugUtils.currentLine=58261580;
 //BA.debugLineNum = 58261580;BA.debugLine="Trace(\"prefetch load audio=\" & targetAudioKey & \"";
__ref._trace /*String*/ (null,"prefetch load audio="+_targetaudiokey+" item="+__ref._describeitem /*String*/ (null,_nextitem));
RDebugUtils.currentLine=58261581;
 //BA.debugLineNum = 58261581;BA.debugLine="Dim volume As Double = targetPage.Transition_Curr";
_volume = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_currentvolume /*double*/ (null,_nextitem);
RDebugUtils.currentLine=58261582;
 //BA.debugLineNum = 58261582;BA.debugLine="Dim targetAudio As AudioPlayer = targetPage.Trans";
_targetaudio = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getaudiobykey /*b4j.example.audioplayer*/ (null,_targetaudiokey);
RDebugUtils.currentLine=58261583;
 //BA.debugLineNum = 58261583;BA.debugLine="targetAudio.LoadUrl(nextItemUrl, volume)";
_targetaudio._loadurl /*String*/ (null,_nextitemurl,_volume);
RDebugUtils.currentLine=58261584;
 //BA.debugLineNum = 58261584;BA.debugLine="Dim waitArgs As Map";
_waitargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58261585;
 //BA.debugLineNum = 58261585;BA.debugLine="waitArgs.Initialize";
_waitargs.Initialize();
RDebugUtils.currentLine=58261586;
 //BA.debugLineNum = 58261586;BA.debugLine="waitArgs.Put(\"audioKey\", targetAudioKey)";
_waitargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=58261587;
 //BA.debugLineNum = 58261587;BA.debugLine="waitArgs.Put(\"item\", nextItem)";
_waitargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=58261588;
 //BA.debugLineNum = 58261588;BA.debugLine="waitArgs.Put(\"timeoutMs\", 5000)";
_waitargs.Put((Object)("timeoutMs"),(Object)(5000));
RDebugUtils.currentLine=58261589;
 //BA.debugLineNum = 58261589;BA.debugLine="Wait For (targetPage.Transition_WaitForPreparedAu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbacktransitioncoordinator", "preparenextplayable"), __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_waitforpreparedaudio /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_waitargs));
this.state = 73;
return;
case 73:
//C
this.state = 63;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=58261590;
 //BA.debugLineNum = 58261590;BA.debugLine="If targetPage.Transition_GetPlaybackFlowState = f";
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
RDebugUtils.currentLine=58261591;
 //BA.debugLineNum = 58261591;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
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
RDebugUtils.currentLine=58261592;
 //BA.debugLineNum = 58261592;BA.debugLine="Dim readyArgs As Map";
_readyargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58261593;
 //BA.debugLineNum = 58261593;BA.debugLine="readyArgs.Initialize";
_readyargs.Initialize();
RDebugUtils.currentLine=58261594;
 //BA.debugLineNum = 58261594;BA.debugLine="readyArgs.Put(\"state\", previousFlowState)";
_readyargs.Put((Object)("state"),(Object)(_previousflowstate));
RDebugUtils.currentLine=58261595;
 //BA.debugLineNum = 58261595;BA.debugLine="readyArgs.Put(\"reason\", \"prepare_ready\")";
_readyargs.Put((Object)("reason"),(Object)("prepare_ready"));
RDebugUtils.currentLine=58261596;
 //BA.debugLineNum = 58261596;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(read";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_readyargs);
RDebugUtils.currentLine=58261597;
 //BA.debugLineNum = 58261597;BA.debugLine="Trace(\"prefetch prepared audio=\" & targetAudioK";
__ref._trace /*String*/ (null,"prefetch prepared audio="+_targetaudiokey+" item="+__ref._describeitem /*String*/ (null,_nextitem));
 if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=58261599;
 //BA.debugLineNum = 58261599;BA.debugLine="Dim failedArgs As Map";
_failedargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58261600;
 //BA.debugLineNum = 58261600;BA.debugLine="failedArgs.Initialize";
_failedargs.Initialize();
RDebugUtils.currentLine=58261601;
 //BA.debugLineNum = 58261601;BA.debugLine="failedArgs.Put(\"state\", \"error\")";
_failedargs.Put((Object)("state"),(Object)("error"));
RDebugUtils.currentLine=58261602;
 //BA.debugLineNum = 58261602;BA.debugLine="failedArgs.Put(\"reason\", \"prepare_failed\")";
_failedargs.Put((Object)("reason"),(Object)("prepare_failed"));
RDebugUtils.currentLine=58261603;
 //BA.debugLineNum = 58261603;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(fail";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_failedargs);
RDebugUtils.currentLine=58261604;
 //BA.debugLineNum = 58261604;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetA";
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
RDebugUtils.currentLine=58261607;
 //BA.debugLineNum = 58261607;BA.debugLine="Return result.GetDefault(\"Success\", False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)));return;};
RDebugUtils.currentLine=58261608;
 //BA.debugLineNum = 58261608;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=57868288;
 //BA.debugLineNum = 57868288;BA.debugLine="Public Sub GetInactiveAudioKey(runtimeState As Pla";
RDebugUtils.currentLine=57868289;
 //BA.debugLineNum = 57868289;BA.debugLine="If targetPage.Transition_GetDirectorActiveAudioKe";
if ((__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectoractiveaudiokey /*String*/ (null)).equals("primary")) { 
if (true) return "secondary";};
RDebugUtils.currentLine=57868290;
 //BA.debugLineNum = 57868290;BA.debugLine="Return \"primary\"";
if (true) return "primary";
RDebugUtils.currentLine=57868291;
 //BA.debugLineNum = 57868291;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=57933824;
 //BA.debugLineNum = 57933824;BA.debugLine="Public Sub HasUsablePreparedItem(runtimeState As P";
RDebugUtils.currentLine=57933825;
 //BA.debugLineNum = 57933825;BA.debugLine="Dim preparedAudioKey As String = targetPage.Trans";
_preparedaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=57933826;
 //BA.debugLineNum = 57933826;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=57933827;
 //BA.debugLineNum = 57933827;BA.debugLine="If preparedAudioKey = \"\" Then Return False";
if ((_preparedaudiokey).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57933828;
 //BA.debugLineNum = 57933828;BA.debugLine="If preparedItem.IsInitialized = False Then Return";
if (_prepareditem.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57933829;
 //BA.debugLineNum = 57933829;BA.debugLine="Dim preparedType As String = preparedItem.GetDefa";
_preparedtype = BA.ObjectToString(_prepareditem.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=57933830;
 //BA.debugLineNum = 57933830;BA.debugLine="Return preparedType = \"track\" Or preparedType = \"";
if (true) return (_preparedtype).equals("track") || (_preparedtype).equals("ad");
RDebugUtils.currentLine=57933831;
 //BA.debugLineNum = 57933831;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.BA _ba,b4j.example.b4xmainpage _targetpagevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_targetpagevalue}));}
RDebugUtils.currentLine=57802752;
 //BA.debugLineNum = 57802752;BA.debugLine="Public Sub Initialize(targetPageValue As B4XMainPa";
RDebugUtils.currentLine=57802753;
 //BA.debugLineNum = 57802753;BA.debugLine="targetPage = targetPageValue";
__ref._targetpage /*b4j.example.b4xmainpage*/  = _targetpagevalue;
RDebugUtils.currentLine=57802754;
 //BA.debugLineNum = 57802754;BA.debugLine="End Sub";
return "";
}
public int  _preparedfadeoutms(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackmetastate _metastate,b4j.example.playbackruntimestate _runtimestate,int _trackoverlapms,int _adtailoverlapms) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "preparedfadeoutms", false))
	 {return ((Integer) Debug.delegate(ba, "preparedfadeoutms", new Object[] {_metastate,_runtimestate,_trackoverlapms,_adtailoverlapms}));}
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
String _nexttype = "";
RDebugUtils.currentLine=58195968;
 //BA.debugLineNum = 58195968;BA.debugLine="Public Sub PreparedFadeOutMs(metaState As Playback";
RDebugUtils.currentLine=58195969;
 //BA.debugLineNum = 58195969;BA.debugLine="If metaState.CurrentMediaType <> \"track\" Then Ret";
if ((_metastate._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=58195970;
 //BA.debugLineNum = 58195970;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=58195971;
 //BA.debugLineNum = 58195971;BA.debugLine="If preparedItem.IsInitialized = False Then Return";
if (_prepareditem.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=58195972;
 //BA.debugLineNum = 58195972;BA.debugLine="Dim nextType As String = preparedItem.GetDefault(";
_nexttype = BA.ObjectToString(_prepareditem.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=58195973;
 //BA.debugLineNum = 58195973;BA.debugLine="If nextType = \"track\" Then Return trackOverlapMs";
if ((_nexttype).equals("track")) { 
if (true) return _trackoverlapms;};
RDebugUtils.currentLine=58195974;
 //BA.debugLineNum = 58195974;BA.debugLine="If nextType = \"ad\" Then Return adTailOverlapMs";
if ((_nexttype).equals("ad")) { 
if (true) return _adtailoverlapms;};
RDebugUtils.currentLine=58195975;
 //BA.debugLineNum = 58195975;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=58195976;
 //BA.debugLineNum = 58195976;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=58327041;
 //BA.debugLineNum = 58327041;BA.debugLine="If nextItem.IsInitialized = False Or nextItem.Siz";
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
RDebugUtils.currentLine=58327042;
 //BA.debugLineNum = 58327042;BA.debugLine="Dim existingPreparedItem As Map = targetPage.Tran";
_existingprepareditem = new anywheresoftware.b4a.objects.collections.Map();
_existingprepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=58327043;
 //BA.debugLineNum = 58327043;BA.debugLine="Dim existingPreparedAudioKey As String = targetPa";
_existingpreparedaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=58327044;
 //BA.debugLineNum = 58327044;BA.debugLine="If existingPreparedItem.IsInitialized And existin";
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
RDebugUtils.currentLine=58327045;
 //BA.debugLineNum = 58327045;BA.debugLine="Dim matchArgs As Map";
_matchargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58327046;
 //BA.debugLineNum = 58327046;BA.debugLine="matchArgs.Initialize";
_matchargs.Initialize();
RDebugUtils.currentLine=58327047;
 //BA.debugLineNum = 58327047;BA.debugLine="matchArgs.Put(\"first\", existingPreparedItem)";
_matchargs.Put((Object)("first"),(Object)(_existingprepareditem.getObject()));
RDebugUtils.currentLine=58327048;
 //BA.debugLineNum = 58327048;BA.debugLine="matchArgs.Put(\"second\", nextItem)";
_matchargs.Put((Object)("second"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=58327049;
 //BA.debugLineNum = 58327049;BA.debugLine="If targetPage.Transition_ItemsMatch(matchArgs) T";
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
RDebugUtils.currentLine=58327050;
 //BA.debugLineNum = 58327050;BA.debugLine="Trace(\"prefetch reuse prepared item=\" & Describ";
__ref._trace /*String*/ (null,"prefetch reuse prepared item="+__ref._describeitem /*String*/ (null,_nextitem));
RDebugUtils.currentLine=58327051;
 //BA.debugLineNum = 58327051;BA.debugLine="Return True";
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
RDebugUtils.currentLine=58327054;
 //BA.debugLineNum = 58327054;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
_targetaudiokey = __ref._getinactiveaudiokey /*String*/ (null,_runtimestate);
RDebugUtils.currentLine=58327055;
 //BA.debugLineNum = 58327055;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=58327056;
 //BA.debugLineNum = 58327056;BA.debugLine="Dim pendingPrepareArgs As Map";
_pendingprepareargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58327057;
 //BA.debugLineNum = 58327057;BA.debugLine="pendingPrepareArgs.Initialize";
_pendingprepareargs.Initialize();
RDebugUtils.currentLine=58327058;
 //BA.debugLineNum = 58327058;BA.debugLine="pendingPrepareArgs.Put(\"audioKey\", targetAudioKey";
_pendingprepareargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=58327059;
 //BA.debugLineNum = 58327059;BA.debugLine="pendingPrepareArgs.Put(\"item\", nextItem)";
_pendingprepareargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=58327060;
 //BA.debugLineNum = 58327060;BA.debugLine="targetPage.Transition_SetDirectorPendingPrepare(p";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setdirectorpendingprepare /*String*/ (null,_pendingprepareargs);
RDebugUtils.currentLine=58327061;
 //BA.debugLineNum = 58327061;BA.debugLine="Dim previousFlowState As String = playbackFlowSta";
_previousflowstate = _playbackflowstate;
RDebugUtils.currentLine=58327062;
 //BA.debugLineNum = 58327062;BA.debugLine="If playbackFlowState = flowPlaying Or playbackFlo";
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
RDebugUtils.currentLine=58327063;
 //BA.debugLineNum = 58327063;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58327064;
 //BA.debugLineNum = 58327064;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
RDebugUtils.currentLine=58327065;
 //BA.debugLineNum = 58327065;BA.debugLine="flowArgs.Put(\"state\", flowPreparing)";
_flowargs.Put((Object)("state"),(Object)(_flowpreparing));
RDebugUtils.currentLine=58327066;
 //BA.debugLineNum = 58327066;BA.debugLine="flowArgs.Put(\"reason\", \"prepare_direct:\" & nextI";
_flowargs.Put((Object)("reason"),(Object)("prepare_direct:"+BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")))));
RDebugUtils.currentLine=58327067;
 //BA.debugLineNum = 58327067;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowA";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_flowargs);
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=58327069;
 //BA.debugLineNum = 58327069;BA.debugLine="Dim mediaArgs As Map";
_mediaargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58327070;
 //BA.debugLineNum = 58327070;BA.debugLine="mediaArgs.Initialize";
_mediaargs.Initialize();
RDebugUtils.currentLine=58327071;
 //BA.debugLineNum = 58327071;BA.debugLine="mediaArgs.Put(\"audioKey\", targetAudioKey)";
_mediaargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=58327072;
 //BA.debugLineNum = 58327072;BA.debugLine="mediaArgs.Put(\"item\", nextItem)";
_mediaargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=58327073;
 //BA.debugLineNum = 58327073;BA.debugLine="Dim nextItemUrl As String = targetPage.Transition";
_nextitemurl = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_resolveplaybackmediaurl /*String*/ (null,_mediaargs);
RDebugUtils.currentLine=58327074;
 //BA.debugLineNum = 58327074;BA.debugLine="If nextItemUrl = \"\" Then";
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
RDebugUtils.currentLine=58327075;
 //BA.debugLineNum = 58327075;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetAu";
__ref._trace /*String*/ (null,"переход preload ошибка audio="+_targetaudiokey+" message=empty_media_url");
RDebugUtils.currentLine=58327076;
 //BA.debugLineNum = 58327076;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=58327078;
 //BA.debugLineNum = 58327078;BA.debugLine="Trace(\"prefetch load audio=\" & targetAudioKey & \"";
__ref._trace /*String*/ (null,"prefetch load audio="+_targetaudiokey+" item="+__ref._describeitem /*String*/ (null,_nextitem));
RDebugUtils.currentLine=58327079;
 //BA.debugLineNum = 58327079;BA.debugLine="Dim volume As Double = targetPage.Transition_Curr";
_volume = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_currentvolume /*double*/ (null,_nextitem);
RDebugUtils.currentLine=58327080;
 //BA.debugLineNum = 58327080;BA.debugLine="Dim targetAudio As AudioPlayer = targetPage.Trans";
_targetaudio = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getaudiobykey /*b4j.example.audioplayer*/ (null,_targetaudiokey);
RDebugUtils.currentLine=58327081;
 //BA.debugLineNum = 58327081;BA.debugLine="targetAudio.LoadUrl(nextItemUrl, volume)";
_targetaudio._loadurl /*String*/ (null,_nextitemurl,_volume);
RDebugUtils.currentLine=58327082;
 //BA.debugLineNum = 58327082;BA.debugLine="Dim waitArgs As Map";
_waitargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58327083;
 //BA.debugLineNum = 58327083;BA.debugLine="waitArgs.Initialize";
_waitargs.Initialize();
RDebugUtils.currentLine=58327084;
 //BA.debugLineNum = 58327084;BA.debugLine="waitArgs.Put(\"audioKey\", targetAudioKey)";
_waitargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=58327085;
 //BA.debugLineNum = 58327085;BA.debugLine="waitArgs.Put(\"item\", nextItem)";
_waitargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=58327086;
 //BA.debugLineNum = 58327086;BA.debugLine="waitArgs.Put(\"timeoutMs\", 5000)";
_waitargs.Put((Object)("timeoutMs"),(Object)(5000));
RDebugUtils.currentLine=58327087;
 //BA.debugLineNum = 58327087;BA.debugLine="Wait For (targetPage.Transition_WaitForPreparedAu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbacktransitioncoordinator", "preparespecificplayable"), __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_waitforpreparedaudio /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_waitargs));
this.state = 33;
return;
case 33:
//C
this.state = 23;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=58327088;
 //BA.debugLineNum = 58327088;BA.debugLine="If targetPage.Transition_GetPlaybackFlowState = f";
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
RDebugUtils.currentLine=58327089;
 //BA.debugLineNum = 58327089;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
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
RDebugUtils.currentLine=58327090;
 //BA.debugLineNum = 58327090;BA.debugLine="Dim readyArgs As Map";
_readyargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58327091;
 //BA.debugLineNum = 58327091;BA.debugLine="readyArgs.Initialize";
_readyargs.Initialize();
RDebugUtils.currentLine=58327092;
 //BA.debugLineNum = 58327092;BA.debugLine="readyArgs.Put(\"state\", previousFlowState)";
_readyargs.Put((Object)("state"),(Object)(_previousflowstate));
RDebugUtils.currentLine=58327093;
 //BA.debugLineNum = 58327093;BA.debugLine="readyArgs.Put(\"reason\", \"prepare_ready\")";
_readyargs.Put((Object)("reason"),(Object)("prepare_ready"));
RDebugUtils.currentLine=58327094;
 //BA.debugLineNum = 58327094;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(read";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_readyargs);
RDebugUtils.currentLine=58327095;
 //BA.debugLineNum = 58327095;BA.debugLine="Trace(\"prefetch prepared audio=\" & targetAudioK";
__ref._trace /*String*/ (null,"prefetch prepared audio="+_targetaudiokey+" item="+__ref._describeitem /*String*/ (null,_nextitem));
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=58327097;
 //BA.debugLineNum = 58327097;BA.debugLine="Dim failedArgs As Map";
_failedargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58327098;
 //BA.debugLineNum = 58327098;BA.debugLine="failedArgs.Initialize";
_failedargs.Initialize();
RDebugUtils.currentLine=58327099;
 //BA.debugLineNum = 58327099;BA.debugLine="failedArgs.Put(\"state\", \"error\")";
_failedargs.Put((Object)("state"),(Object)("error"));
RDebugUtils.currentLine=58327100;
 //BA.debugLineNum = 58327100;BA.debugLine="failedArgs.Put(\"reason\", \"prepare_failed\")";
_failedargs.Put((Object)("reason"),(Object)("prepare_failed"));
RDebugUtils.currentLine=58327101;
 //BA.debugLineNum = 58327101;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(fail";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_failedargs);
RDebugUtils.currentLine=58327102;
 //BA.debugLineNum = 58327102;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetA";
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
RDebugUtils.currentLine=58327105;
 //BA.debugLineNum = 58327105;BA.debugLine="Return result.GetDefault(\"Success\", False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)));return;};
RDebugUtils.currentLine=58327106;
 //BA.debugLineNum = 58327106;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=58392576;
 //BA.debugLineNum = 58392576;BA.debugLine="Public Sub PromotePreparedPlayer(runtimeState As P";
RDebugUtils.currentLine=58392577;
 //BA.debugLineNum = 58392577;BA.debugLine="Dim preparedAudioKey As String = targetPage.Trans";
_preparedaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=58392578;
 //BA.debugLineNum = 58392578;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=58392579;
 //BA.debugLineNum = 58392579;BA.debugLine="If preparedAudioKey = \"\" Or preparedItem.IsInitia";
if ((_preparedaudiokey).equals("") || _prepareditem.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=58392580;
 //BA.debugLineNum = 58392580;BA.debugLine="Trace(\"переход prepared reject reason=missing_pr";
__ref._trace /*String*/ (null,"переход prepared reject reason=missing_prepared");
RDebugUtils.currentLine=58392581;
 //BA.debugLineNum = 58392581;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=58392583;
 //BA.debugLineNum = 58392583;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58392584;
 //BA.debugLineNum = 58392584;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
RDebugUtils.currentLine=58392585;
 //BA.debugLineNum = 58392585;BA.debugLine="flowArgs.Put(\"state\", flowTransitioning)";
_flowargs.Put((Object)("state"),(Object)(_flowtransitioning));
RDebugUtils.currentLine=58392586;
 //BA.debugLineNum = 58392586;BA.debugLine="flowArgs.Put(\"reason\", \"promote_prepared\")";
_flowargs.Put((Object)("reason"),(Object)("promote_prepared"));
RDebugUtils.currentLine=58392587;
 //BA.debugLineNum = 58392587;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowAr";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_flowargs);
RDebugUtils.currentLine=58392588;
 //BA.debugLineNum = 58392588;BA.debugLine="Dim previousAudioKey As String = targetPage.Trans";
_previousaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectoractiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=58392589;
 //BA.debugLineNum = 58392589;BA.debugLine="Dim nextAudioKey As String = preparedAudioKey";
_nextaudiokey = _preparedaudiokey;
RDebugUtils.currentLine=58392590;
 //BA.debugLineNum = 58392590;BA.debugLine="Dim promotedItem As Map = CloneMap(preparedItem)";
_promoteditem = new anywheresoftware.b4a.objects.collections.Map();
_promoteditem = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_prepareditem);
RDebugUtils.currentLine=58392591;
 //BA.debugLineNum = 58392591;BA.debugLine="targetPage.Transition_ConsumePreparedQueueItem";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_consumepreparedqueueitem /*String*/ (null);
RDebugUtils.currentLine=58392592;
 //BA.debugLineNum = 58392592;BA.debugLine="If previousAudioKey <> \"\" And previousAudioKey <>";
if ((_previousaudiokey).equals("") == false && (_previousaudiokey).equals(_nextaudiokey) == false) { 
RDebugUtils.currentLine=58392593;
 //BA.debugLineNum = 58392593;BA.debugLine="Dim previousAudio As AudioPlayer = targetPage.Tr";
_previousaudio = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getaudiobykey /*b4j.example.audioplayer*/ (null,_previousaudiokey);
RDebugUtils.currentLine=58392594;
 //BA.debugLineNum = 58392594;BA.debugLine="previousAudio.Stop(fadeOutMs)";
_previousaudio._stop /*String*/ (null,_fadeoutms);
 };
RDebugUtils.currentLine=58392596;
 //BA.debugLineNum = 58392596;BA.debugLine="dataResolver.CommitPlaylistCursor(storage, promot";
_dataresolver._commitplaylistcursor /*String*/ (null,_storage,_promoteditem);
RDebugUtils.currentLine=58392597;
 //BA.debugLineNum = 58392597;BA.debugLine="Dim activateArgs As Map";
_activateargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58392598;
 //BA.debugLineNum = 58392598;BA.debugLine="activateArgs.Initialize";
_activateargs.Initialize();
RDebugUtils.currentLine=58392599;
 //BA.debugLineNum = 58392599;BA.debugLine="activateArgs.Put(\"audioKey\", nextAudioKey)";
_activateargs.Put((Object)("audioKey"),(Object)(_nextaudiokey));
RDebugUtils.currentLine=58392600;
 //BA.debugLineNum = 58392600;BA.debugLine="activateArgs.Put(\"item\", promotedItem)";
_activateargs.Put((Object)("item"),(Object)(_promoteditem.getObject()));
RDebugUtils.currentLine=58392601;
 //BA.debugLineNum = 58392601;BA.debugLine="activateArgs.Put(\"fadeInMs\", fadeInMs)";
_activateargs.Put((Object)("fadeInMs"),(Object)(_fadeinms));
RDebugUtils.currentLine=58392602;
 //BA.debugLineNum = 58392602;BA.debugLine="Trace(\"prepared promote audio=\" & nextAudioKey &";
__ref._trace /*String*/ (null,"prepared promote audio="+_nextaudiokey+" type="+BA.ObjectToString(_promoteditem.GetDefault((Object)("type"),(Object)("")))+" id="+BA.ObjectToString(_promoteditem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=58392603;
 //BA.debugLineNum = 58392603;BA.debugLine="targetPage.Transition_ActivateLoadedItem(activate";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_activateloadeditem /*String*/ (null,_activateargs);
RDebugUtils.currentLine=58392604;
 //BA.debugLineNum = 58392604;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_clearpreparedstate /*String*/ (null,__c.False);
RDebugUtils.currentLine=58392605;
 //BA.debugLineNum = 58392605;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=58392606;
 //BA.debugLineNum = 58392606;BA.debugLine="End Sub";
return false;
}
public boolean  _canusepreparedtransition(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress,String _currenttype,String _preparedtype,String _decisionname) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "canusepreparedtransition", false))
	 {return ((Boolean) Debug.delegate(ba, "canusepreparedtransition", new Object[] {_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,_currenttype,_preparedtype,_decisionname}));}
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
RDebugUtils.currentLine=57999360;
 //BA.debugLineNum = 57999360;BA.debugLine="Public Sub CanUsePreparedTransition(runtimeState A";
RDebugUtils.currentLine=57999361;
 //BA.debugLineNum = 57999361;BA.debugLine="If transitionInProgress Then Return False";
if (_transitioninprogress) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57999362;
 //BA.debugLineNum = 57999362;BA.debugLine="If orchestrationState.IsCrossfadeTriggered Then R";
if (_orchestrationstate._iscrossfadetriggered /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57999363;
 //BA.debugLineNum = 57999363;BA.debugLine="If metaState.CurrentMediaType <> currentType Then";
if ((_metastate._currentmediatype /*String*/ ).equals(_currenttype) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57999364;
 //BA.debugLineNum = 57999364;BA.debugLine="If HasUsablePreparedItem(runtimeState) = False Th";
if (__ref._hasusableprepareditem /*boolean*/ (null,_runtimestate)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57999365;
 //BA.debugLineNum = 57999365;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=57999366;
 //BA.debugLineNum = 57999366;BA.debugLine="Return preparedItem.GetDefault(\"type\", \"\") = prep";
if (true) return (_prepareditem.GetDefault((Object)("type"),(Object)(""))).equals((Object)(_preparedtype));
RDebugUtils.currentLine=57999367;
 //BA.debugLineNum = 57999367;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.playbacktransitioncoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
RDebugUtils.currentLine=57737216;
 //BA.debugLineNum = 57737216;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=57737217;
 //BA.debugLineNum = 57737217;BA.debugLine="Private targetPage As B4XMainPage";
_targetpage = new b4j.example.b4xmainpage();
RDebugUtils.currentLine=57737218;
 //BA.debugLineNum = 57737218;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
RDebugUtils.currentLine=58589184;
 //BA.debugLineNum = 58589184;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=58589185;
 //BA.debugLineNum = 58589185;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58589186;
 //BA.debugLineNum = 58589186;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
RDebugUtils.currentLine=58589187;
 //BA.debugLineNum = 58589187;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
RDebugUtils.currentLine=58589188;
 //BA.debugLineNum = 58589188;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=58589189;
 //BA.debugLineNum = 58589189;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=58589191;
 //BA.debugLineNum = 58589191;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
RDebugUtils.currentLine=58589192;
 //BA.debugLineNum = 58589192;BA.debugLine="End Sub";
return null;
}
public String  _describeitem(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "describeitem", false))
	 {return ((String) Debug.delegate(ba, "describeitem", new Object[] {_item}));}
RDebugUtils.currentLine=58458112;
 //BA.debugLineNum = 58458112;BA.debugLine="Private Sub DescribeItem(item As Map) As String";
RDebugUtils.currentLine=58458113;
 //BA.debugLineNum = 58458113;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=58458114;
 //BA.debugLineNum = 58458114;BA.debugLine="Return targetPage.Transition_DescribeItem(item)";
if (true) return __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_describeitem /*String*/ (null,_item);
RDebugUtils.currentLine=58458115;
 //BA.debugLineNum = 58458115;BA.debugLine="End Sub";
return "";
}
public boolean  _itemsmatch(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.Map _firstitem,anywheresoftware.b4a.objects.collections.Map _seconditem) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "itemsmatch", false))
	 {return ((Boolean) Debug.delegate(ba, "itemsmatch", new Object[] {_firstitem,_seconditem}));}
anywheresoftware.b4a.objects.collections.Map _args = null;
RDebugUtils.currentLine=58523648;
 //BA.debugLineNum = 58523648;BA.debugLine="Private Sub ItemsMatch(firstItem As Map, secondIte";
RDebugUtils.currentLine=58523649;
 //BA.debugLineNum = 58523649;BA.debugLine="Dim args As Map";
_args = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58523650;
 //BA.debugLineNum = 58523650;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=58523651;
 //BA.debugLineNum = 58523651;BA.debugLine="args.Put(\"first\", firstItem)";
_args.Put((Object)("first"),(Object)(_firstitem.getObject()));
RDebugUtils.currentLine=58523652;
 //BA.debugLineNum = 58523652;BA.debugLine="args.Put(\"second\", secondItem)";
_args.Put((Object)("second"),(Object)(_seconditem.getObject()));
RDebugUtils.currentLine=58523653;
 //BA.debugLineNum = 58523653;BA.debugLine="Return targetPage.Transition_ItemsMatch(args)";
if (true) return __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_itemsmatch /*boolean*/ (null,_args);
RDebugUtils.currentLine=58523654;
 //BA.debugLineNum = 58523654;BA.debugLine="End Sub";
return false;
}
public String  _trace(b4j.example.playbacktransitioncoordinator __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=58654720;
 //BA.debugLineNum = 58654720;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=58654721;
 //BA.debugLineNum = 58654721;BA.debugLine="targetPage.TraceLog(message)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._tracelog /*String*/ (null,_message);
RDebugUtils.currentLine=58654722;
 //BA.debugLineNum = 58654722;BA.debugLine="End Sub";
return "";
}
}