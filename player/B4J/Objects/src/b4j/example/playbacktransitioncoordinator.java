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
RDebugUtils.currentLine=56033280;
 //BA.debugLineNum = 56033280;BA.debugLine="Public Sub CanCrossfadePreparedItem(runtimeState A";
RDebugUtils.currentLine=56033281;
 //BA.debugLineNum = 56033281;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
if (true) return __ref._canusepreparedtransition /*boolean*/ (null,_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,"track","track","crossfade");
RDebugUtils.currentLine=56033282;
 //BA.debugLineNum = 56033282;BA.debugLine="End Sub";
return false;
}
public boolean  _canstartpreparedontracktail(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "canstartpreparedontracktail", false))
	 {return ((Boolean) Debug.delegate(ba, "canstartpreparedontracktail", new Object[] {_runtimestate,_metastate,_orchestrationstate,_transitioninprogress}));}
RDebugUtils.currentLine=56098816;
 //BA.debugLineNum = 56098816;BA.debugLine="Public Sub CanStartPreparedOnTrackTail(runtimeStat";
RDebugUtils.currentLine=56098817;
 //BA.debugLineNum = 56098817;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
if (true) return __ref._canusepreparedtransition /*boolean*/ (null,_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,"track","ad","tail_start");
RDebugUtils.currentLine=56098818;
 //BA.debugLineNum = 56098818;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=56229889;
 //BA.debugLineNum = 56229889;BA.debugLine="Dim candidateIndex As Int = -1";
_candidateindex = (int) (-1);
RDebugUtils.currentLine=56229890;
 //BA.debugLineNum = 56229890;BA.debugLine="Do While playQueue.Size > 0";
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
RDebugUtils.currentLine=56229891;
 //BA.debugLineNum = 56229891;BA.debugLine="Dim scanIndex As Int = candidateIndex + 1";
_scanindex = (int) (_candidateindex+1);
RDebugUtils.currentLine=56229892;
 //BA.debugLineNum = 56229892;BA.debugLine="If scanIndex < 0 Then scanIndex = 0";
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
RDebugUtils.currentLine=56229893;
 //BA.debugLineNum = 56229893;BA.debugLine="If scanIndex >= playQueue.Size Then Return False";
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
RDebugUtils.currentLine=56229894;
 //BA.debugLineNum = 56229894;BA.debugLine="Dim nextObject As Object = playQueue.Get(scanInd";
_nextobject = _playqueue.Get(_scanindex);
RDebugUtils.currentLine=56229895;
 //BA.debugLineNum = 56229895;BA.debugLine="If nextObject Is Map Then";
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
RDebugUtils.currentLine=56229897;
 //BA.debugLineNum = 56229897;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=56229899;
 //BA.debugLineNum = 56229899;BA.debugLine="Dim candidateItem As Map = nextObject";
_candidateitem = new anywheresoftware.b4a.objects.collections.Map();
_candidateitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_nextobject));
RDebugUtils.currentLine=56229900;
 //BA.debugLineNum = 56229900;BA.debugLine="Dim candidateType As String = candidateItem.GetD";
_candidatetype = BA.ObjectToString(_candidateitem.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=56229901;
 //BA.debugLineNum = 56229901;BA.debugLine="If candidateType = \"break\" Then";
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
RDebugUtils.currentLine=56229902;
 //BA.debugLineNum = 56229902;BA.debugLine="Trace(\"prefetch skip reason=break_ahead item=\"";
__ref._trace /*String*/ (null,"prefetch skip reason=break_ahead item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=56229903;
 //BA.debugLineNum = 56229903;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=56229904;
 //BA.debugLineNum = 56229904;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;
;
RDebugUtils.currentLine=56229906;
 //BA.debugLineNum = 56229906;BA.debugLine="If candidateType <> \"track\" And candidateType <>";

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
RDebugUtils.currentLine=56229907;
 //BA.debugLineNum = 56229907;BA.debugLine="Dim activeItem As Map = targetPage.Transition_Ge";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectoractiveitem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=56229908;
 //BA.debugLineNum = 56229908;BA.debugLine="If ItemsMatch(activeItem, candidateItem) Then";
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
RDebugUtils.currentLine=56229909;
 //BA.debugLineNum = 56229909;BA.debugLine="Trace(\"prefetch skip reason=active_item item=\"";
__ref._trace /*String*/ (null,"prefetch skip reason=active_item item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=56229910;
 //BA.debugLineNum = 56229910;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=56229911;
 //BA.debugLineNum = 56229911;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;
;
RDebugUtils.currentLine=56229913;
 //BA.debugLineNum = 56229913;BA.debugLine="If candidateType = \"track\" And mediaCacheService";

case 34:
//if
this.state = 37;
if ((_candidatetype).equals("track") && _mediacacheservice._istrackcached /*boolean*/ (null,BA.ObjectToString(_candidateitem.GetDefault((Object)("id"),(Object)(""))))==parent.__c.False) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=56229914;
 //BA.debugLineNum = 56229914;BA.debugLine="Trace(\"prefetch skip reason=no_local_track item";
__ref._trace /*String*/ (null,"prefetch skip reason=no_local_track item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=56229915;
 //BA.debugLineNum = 56229915;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=56229916;
 //BA.debugLineNum = 56229916;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;
;
RDebugUtils.currentLine=56229918;
 //BA.debugLineNum = 56229918;BA.debugLine="If candidateType = \"ad\" And mediaCacheService.Is";

case 37:
//if
this.state = 40;
if ((_candidatetype).equals("ad") && _mediacacheservice._isadcached /*boolean*/ (null,BA.ObjectToString(_candidateitem.GetDefault((Object)("id"),(Object)(""))))==parent.__c.False) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=56229919;
 //BA.debugLineNum = 56229919;BA.debugLine="Trace(\"prefetch skip reason=no_local_ad item=\"";
__ref._trace /*String*/ (null,"prefetch skip reason=no_local_ad item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=56229920;
 //BA.debugLineNum = 56229920;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=56229921;
 //BA.debugLineNum = 56229921;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;

case 40:
//C
this.state = 1;
;
RDebugUtils.currentLine=56229923;
 //BA.debugLineNum = 56229923;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
RDebugUtils.currentLine=56229924;
 //BA.debugLineNum = 56229924;BA.debugLine="Exit";
this.state = 41;
if (true) break;
 if (true) break;
;
RDebugUtils.currentLine=56229926;
 //BA.debugLineNum = 56229926;BA.debugLine="If candidateIndex < 0 Or candidateIndex >= playQu";

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
RDebugUtils.currentLine=56229927;
 //BA.debugLineNum = 56229927;BA.debugLine="Dim nextItem As Map = playQueue.Get(candidateInde";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playqueue.Get(_candidateindex)));
RDebugUtils.currentLine=56229928;
 //BA.debugLineNum = 56229928;BA.debugLine="Dim existingPreparedItem As Map = targetPage.Tran";
_existingprepareditem = new anywheresoftware.b4a.objects.collections.Map();
_existingprepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=56229929;
 //BA.debugLineNum = 56229929;BA.debugLine="Dim existingPreparedAudioKey As String = targetPa";
_existingpreparedaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=56229930;
 //BA.debugLineNum = 56229930;BA.debugLine="If existingPreparedItem.IsInitialized And existin";
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
RDebugUtils.currentLine=56229931;
 //BA.debugLineNum = 56229931;BA.debugLine="Dim matchArgs As Map";
_matchargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56229932;
 //BA.debugLineNum = 56229932;BA.debugLine="matchArgs.Initialize";
_matchargs.Initialize();
RDebugUtils.currentLine=56229933;
 //BA.debugLineNum = 56229933;BA.debugLine="matchArgs.Put(\"first\", existingPreparedItem)";
_matchargs.Put((Object)("first"),(Object)(_existingprepareditem.getObject()));
RDebugUtils.currentLine=56229934;
 //BA.debugLineNum = 56229934;BA.debugLine="matchArgs.Put(\"second\", nextItem)";
_matchargs.Put((Object)("second"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=56229935;
 //BA.debugLineNum = 56229935;BA.debugLine="If targetPage.Transition_ItemsMatch(matchArgs) T";
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
RDebugUtils.currentLine=56229936;
 //BA.debugLineNum = 56229936;BA.debugLine="Trace(\"prefetch reuse prepared item=\" & Describ";
__ref._trace /*String*/ (null,"prefetch reuse prepared item="+__ref._describeitem /*String*/ (null,_nextitem));
RDebugUtils.currentLine=56229937;
 //BA.debugLineNum = 56229937;BA.debugLine="Return True";
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
RDebugUtils.currentLine=56229940;
 //BA.debugLineNum = 56229940;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
_targetaudiokey = __ref._getinactiveaudiokey /*String*/ (null,_runtimestate);
RDebugUtils.currentLine=56229941;
 //BA.debugLineNum = 56229941;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=56229942;
 //BA.debugLineNum = 56229942;BA.debugLine="Dim pendingPrepareArgs As Map";
_pendingprepareargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56229943;
 //BA.debugLineNum = 56229943;BA.debugLine="pendingPrepareArgs.Initialize";
_pendingprepareargs.Initialize();
RDebugUtils.currentLine=56229944;
 //BA.debugLineNum = 56229944;BA.debugLine="pendingPrepareArgs.Put(\"audioKey\", targetAudioKey";
_pendingprepareargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=56229945;
 //BA.debugLineNum = 56229945;BA.debugLine="pendingPrepareArgs.Put(\"item\", nextItem)";
_pendingprepareargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=56229946;
 //BA.debugLineNum = 56229946;BA.debugLine="targetPage.Transition_SetDirectorPendingPrepare(p";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setdirectorpendingprepare /*String*/ (null,_pendingprepareargs);
RDebugUtils.currentLine=56229947;
 //BA.debugLineNum = 56229947;BA.debugLine="Dim previousFlowState As String = playbackFlowSta";
_previousflowstate = _playbackflowstate;
RDebugUtils.currentLine=56229948;
 //BA.debugLineNum = 56229948;BA.debugLine="If playbackFlowState = flowPlaying Or playbackFlo";
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
RDebugUtils.currentLine=56229949;
 //BA.debugLineNum = 56229949;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56229950;
 //BA.debugLineNum = 56229950;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
RDebugUtils.currentLine=56229951;
 //BA.debugLineNum = 56229951;BA.debugLine="flowArgs.Put(\"state\", flowPreparing)";
_flowargs.Put((Object)("state"),(Object)(_flowpreparing));
RDebugUtils.currentLine=56229952;
 //BA.debugLineNum = 56229952;BA.debugLine="flowArgs.Put(\"reason\", \"prepare_next:\" & nextIte";
_flowargs.Put((Object)("reason"),(Object)("prepare_next:"+BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")))));
RDebugUtils.currentLine=56229953;
 //BA.debugLineNum = 56229953;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowA";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_flowargs);
 if (true) break;

case 58:
//C
this.state = 59;
;
RDebugUtils.currentLine=56229955;
 //BA.debugLineNum = 56229955;BA.debugLine="Dim mediaArgs As Map";
_mediaargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56229956;
 //BA.debugLineNum = 56229956;BA.debugLine="mediaArgs.Initialize";
_mediaargs.Initialize();
RDebugUtils.currentLine=56229957;
 //BA.debugLineNum = 56229957;BA.debugLine="mediaArgs.Put(\"audioKey\", targetAudioKey)";
_mediaargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=56229958;
 //BA.debugLineNum = 56229958;BA.debugLine="mediaArgs.Put(\"item\", nextItem)";
_mediaargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=56229959;
 //BA.debugLineNum = 56229959;BA.debugLine="Dim nextItemUrl As String = targetPage.Transition";
_nextitemurl = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_resolveplaybackmediaurl /*String*/ (null,_mediaargs);
RDebugUtils.currentLine=56229960;
 //BA.debugLineNum = 56229960;BA.debugLine="If nextItemUrl = \"\" Then";
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
RDebugUtils.currentLine=56229961;
 //BA.debugLineNum = 56229961;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetAu";
__ref._trace /*String*/ (null,"переход preload ошибка audio="+_targetaudiokey+" message=empty_media_url");
RDebugUtils.currentLine=56229962;
 //BA.debugLineNum = 56229962;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 62:
//C
this.state = 63;
;
RDebugUtils.currentLine=56229964;
 //BA.debugLineNum = 56229964;BA.debugLine="Trace(\"prefetch load audio=\" & targetAudioKey & \"";
__ref._trace /*String*/ (null,"prefetch load audio="+_targetaudiokey+" item="+__ref._describeitem /*String*/ (null,_nextitem));
RDebugUtils.currentLine=56229965;
 //BA.debugLineNum = 56229965;BA.debugLine="Dim volume As Double = targetPage.Transition_Curr";
_volume = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_currentvolume /*double*/ (null,_nextitem);
RDebugUtils.currentLine=56229966;
 //BA.debugLineNum = 56229966;BA.debugLine="Dim targetAudio As AudioPlayer = targetPage.Trans";
_targetaudio = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getaudiobykey /*b4j.example.audioplayer*/ (null,_targetaudiokey);
RDebugUtils.currentLine=56229967;
 //BA.debugLineNum = 56229967;BA.debugLine="targetAudio.LoadUrl(nextItemUrl, volume)";
_targetaudio._loadurl /*String*/ (null,_nextitemurl,_volume);
RDebugUtils.currentLine=56229968;
 //BA.debugLineNum = 56229968;BA.debugLine="Dim waitArgs As Map";
_waitargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56229969;
 //BA.debugLineNum = 56229969;BA.debugLine="waitArgs.Initialize";
_waitargs.Initialize();
RDebugUtils.currentLine=56229970;
 //BA.debugLineNum = 56229970;BA.debugLine="waitArgs.Put(\"audioKey\", targetAudioKey)";
_waitargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=56229971;
 //BA.debugLineNum = 56229971;BA.debugLine="waitArgs.Put(\"item\", nextItem)";
_waitargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=56229972;
 //BA.debugLineNum = 56229972;BA.debugLine="waitArgs.Put(\"timeoutMs\", 5000)";
_waitargs.Put((Object)("timeoutMs"),(Object)(5000));
RDebugUtils.currentLine=56229973;
 //BA.debugLineNum = 56229973;BA.debugLine="Wait For (targetPage.Transition_WaitForPreparedAu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbacktransitioncoordinator", "preparenextplayable"), __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_waitforpreparedaudio /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_waitargs));
this.state = 73;
return;
case 73:
//C
this.state = 63;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=56229974;
 //BA.debugLineNum = 56229974;BA.debugLine="If targetPage.Transition_GetPlaybackFlowState = f";
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
RDebugUtils.currentLine=56229975;
 //BA.debugLineNum = 56229975;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
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
RDebugUtils.currentLine=56229976;
 //BA.debugLineNum = 56229976;BA.debugLine="Dim readyArgs As Map";
_readyargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56229977;
 //BA.debugLineNum = 56229977;BA.debugLine="readyArgs.Initialize";
_readyargs.Initialize();
RDebugUtils.currentLine=56229978;
 //BA.debugLineNum = 56229978;BA.debugLine="readyArgs.Put(\"state\", previousFlowState)";
_readyargs.Put((Object)("state"),(Object)(_previousflowstate));
RDebugUtils.currentLine=56229979;
 //BA.debugLineNum = 56229979;BA.debugLine="readyArgs.Put(\"reason\", \"prepare_ready\")";
_readyargs.Put((Object)("reason"),(Object)("prepare_ready"));
RDebugUtils.currentLine=56229980;
 //BA.debugLineNum = 56229980;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(read";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_readyargs);
RDebugUtils.currentLine=56229981;
 //BA.debugLineNum = 56229981;BA.debugLine="Trace(\"prefetch prepared audio=\" & targetAudioK";
__ref._trace /*String*/ (null,"prefetch prepared audio="+_targetaudiokey+" item="+__ref._describeitem /*String*/ (null,_nextitem));
 if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=56229983;
 //BA.debugLineNum = 56229983;BA.debugLine="Dim failedArgs As Map";
_failedargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56229984;
 //BA.debugLineNum = 56229984;BA.debugLine="failedArgs.Initialize";
_failedargs.Initialize();
RDebugUtils.currentLine=56229985;
 //BA.debugLineNum = 56229985;BA.debugLine="failedArgs.Put(\"state\", \"error\")";
_failedargs.Put((Object)("state"),(Object)("error"));
RDebugUtils.currentLine=56229986;
 //BA.debugLineNum = 56229986;BA.debugLine="failedArgs.Put(\"reason\", \"prepare_failed\")";
_failedargs.Put((Object)("reason"),(Object)("prepare_failed"));
RDebugUtils.currentLine=56229987;
 //BA.debugLineNum = 56229987;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(fail";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_failedargs);
RDebugUtils.currentLine=56229988;
 //BA.debugLineNum = 56229988;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetA";
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
RDebugUtils.currentLine=56229991;
 //BA.debugLineNum = 56229991;BA.debugLine="Return result.GetDefault(\"Success\", False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)));return;};
RDebugUtils.currentLine=56229992;
 //BA.debugLineNum = 56229992;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=55836672;
 //BA.debugLineNum = 55836672;BA.debugLine="Public Sub GetInactiveAudioKey(runtimeState As Pla";
RDebugUtils.currentLine=55836673;
 //BA.debugLineNum = 55836673;BA.debugLine="If targetPage.Transition_GetDirectorActiveAudioKe";
if ((__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectoractiveaudiokey /*String*/ (null)).equals("primary")) { 
if (true) return "secondary";};
RDebugUtils.currentLine=55836674;
 //BA.debugLineNum = 55836674;BA.debugLine="Return \"primary\"";
if (true) return "primary";
RDebugUtils.currentLine=55836675;
 //BA.debugLineNum = 55836675;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=55902208;
 //BA.debugLineNum = 55902208;BA.debugLine="Public Sub HasUsablePreparedItem(runtimeState As P";
RDebugUtils.currentLine=55902209;
 //BA.debugLineNum = 55902209;BA.debugLine="Dim preparedAudioKey As String = targetPage.Trans";
_preparedaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=55902210;
 //BA.debugLineNum = 55902210;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=55902211;
 //BA.debugLineNum = 55902211;BA.debugLine="If preparedAudioKey = \"\" Then Return False";
if ((_preparedaudiokey).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=55902212;
 //BA.debugLineNum = 55902212;BA.debugLine="If preparedItem.IsInitialized = False Then Return";
if (_prepareditem.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=55902213;
 //BA.debugLineNum = 55902213;BA.debugLine="Dim preparedType As String = preparedItem.GetDefa";
_preparedtype = BA.ObjectToString(_prepareditem.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=55902214;
 //BA.debugLineNum = 55902214;BA.debugLine="Return preparedType = \"track\" Or preparedType = \"";
if (true) return (_preparedtype).equals("track") || (_preparedtype).equals("ad");
RDebugUtils.currentLine=55902215;
 //BA.debugLineNum = 55902215;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.BA _ba,b4j.example.b4xmainpage _targetpagevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_targetpagevalue}));}
RDebugUtils.currentLine=55771136;
 //BA.debugLineNum = 55771136;BA.debugLine="Public Sub Initialize(targetPageValue As B4XMainPa";
RDebugUtils.currentLine=55771137;
 //BA.debugLineNum = 55771137;BA.debugLine="targetPage = targetPageValue";
__ref._targetpage /*b4j.example.b4xmainpage*/  = _targetpagevalue;
RDebugUtils.currentLine=55771138;
 //BA.debugLineNum = 55771138;BA.debugLine="End Sub";
return "";
}
public int  _preparedfadeoutms(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackmetastate _metastate,b4j.example.playbackruntimestate _runtimestate,int _trackoverlapms,int _adtailoverlapms) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "preparedfadeoutms", false))
	 {return ((Integer) Debug.delegate(ba, "preparedfadeoutms", new Object[] {_metastate,_runtimestate,_trackoverlapms,_adtailoverlapms}));}
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
String _nexttype = "";
RDebugUtils.currentLine=56164352;
 //BA.debugLineNum = 56164352;BA.debugLine="Public Sub PreparedFadeOutMs(metaState As Playback";
RDebugUtils.currentLine=56164353;
 //BA.debugLineNum = 56164353;BA.debugLine="If metaState.CurrentMediaType <> \"track\" Then Ret";
if ((_metastate._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=56164354;
 //BA.debugLineNum = 56164354;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=56164355;
 //BA.debugLineNum = 56164355;BA.debugLine="If preparedItem.IsInitialized = False Then Return";
if (_prepareditem.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=56164356;
 //BA.debugLineNum = 56164356;BA.debugLine="Dim nextType As String = preparedItem.GetDefault(";
_nexttype = BA.ObjectToString(_prepareditem.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=56164357;
 //BA.debugLineNum = 56164357;BA.debugLine="If nextType = \"track\" Then Return trackOverlapMs";
if ((_nexttype).equals("track")) { 
if (true) return _trackoverlapms;};
RDebugUtils.currentLine=56164358;
 //BA.debugLineNum = 56164358;BA.debugLine="If nextType = \"ad\" Then Return adTailOverlapMs";
if ((_nexttype).equals("ad")) { 
if (true) return _adtailoverlapms;};
RDebugUtils.currentLine=56164359;
 //BA.debugLineNum = 56164359;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=56164360;
 //BA.debugLineNum = 56164360;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=84869121;
 //BA.debugLineNum = 84869121;BA.debugLine="If nextItem.IsInitialized = False Or nextItem.Siz";
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
RDebugUtils.currentLine=84869122;
 //BA.debugLineNum = 84869122;BA.debugLine="Dim existingPreparedItem As Map = targetPage.Tran";
_existingprepareditem = new anywheresoftware.b4a.objects.collections.Map();
_existingprepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=84869123;
 //BA.debugLineNum = 84869123;BA.debugLine="Dim existingPreparedAudioKey As String = targetPa";
_existingpreparedaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=84869124;
 //BA.debugLineNum = 84869124;BA.debugLine="If existingPreparedItem.IsInitialized And existin";
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
RDebugUtils.currentLine=84869125;
 //BA.debugLineNum = 84869125;BA.debugLine="Dim matchArgs As Map";
_matchargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=84869126;
 //BA.debugLineNum = 84869126;BA.debugLine="matchArgs.Initialize";
_matchargs.Initialize();
RDebugUtils.currentLine=84869127;
 //BA.debugLineNum = 84869127;BA.debugLine="matchArgs.Put(\"first\", existingPreparedItem)";
_matchargs.Put((Object)("first"),(Object)(_existingprepareditem.getObject()));
RDebugUtils.currentLine=84869128;
 //BA.debugLineNum = 84869128;BA.debugLine="matchArgs.Put(\"second\", nextItem)";
_matchargs.Put((Object)("second"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=84869129;
 //BA.debugLineNum = 84869129;BA.debugLine="If targetPage.Transition_ItemsMatch(matchArgs) T";
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
RDebugUtils.currentLine=84869130;
 //BA.debugLineNum = 84869130;BA.debugLine="Trace(\"prefetch reuse prepared item=\" & Describ";
__ref._trace /*String*/ (null,"prefetch reuse prepared item="+__ref._describeitem /*String*/ (null,_nextitem));
RDebugUtils.currentLine=84869131;
 //BA.debugLineNum = 84869131;BA.debugLine="Return True";
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
RDebugUtils.currentLine=84869134;
 //BA.debugLineNum = 84869134;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
_targetaudiokey = __ref._getinactiveaudiokey /*String*/ (null,_runtimestate);
RDebugUtils.currentLine=84869135;
 //BA.debugLineNum = 84869135;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=84869136;
 //BA.debugLineNum = 84869136;BA.debugLine="Dim pendingPrepareArgs As Map";
_pendingprepareargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=84869137;
 //BA.debugLineNum = 84869137;BA.debugLine="pendingPrepareArgs.Initialize";
_pendingprepareargs.Initialize();
RDebugUtils.currentLine=84869138;
 //BA.debugLineNum = 84869138;BA.debugLine="pendingPrepareArgs.Put(\"audioKey\", targetAudioKey";
_pendingprepareargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=84869139;
 //BA.debugLineNum = 84869139;BA.debugLine="pendingPrepareArgs.Put(\"item\", nextItem)";
_pendingprepareargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=84869140;
 //BA.debugLineNum = 84869140;BA.debugLine="targetPage.Transition_SetDirectorPendingPrepare(p";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setdirectorpendingprepare /*String*/ (null,_pendingprepareargs);
RDebugUtils.currentLine=84869141;
 //BA.debugLineNum = 84869141;BA.debugLine="Dim previousFlowState As String = playbackFlowSta";
_previousflowstate = _playbackflowstate;
RDebugUtils.currentLine=84869142;
 //BA.debugLineNum = 84869142;BA.debugLine="If playbackFlowState = flowPlaying Or playbackFlo";
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
RDebugUtils.currentLine=84869143;
 //BA.debugLineNum = 84869143;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=84869144;
 //BA.debugLineNum = 84869144;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
RDebugUtils.currentLine=84869145;
 //BA.debugLineNum = 84869145;BA.debugLine="flowArgs.Put(\"state\", flowPreparing)";
_flowargs.Put((Object)("state"),(Object)(_flowpreparing));
RDebugUtils.currentLine=84869146;
 //BA.debugLineNum = 84869146;BA.debugLine="flowArgs.Put(\"reason\", \"prepare_direct:\" & nextI";
_flowargs.Put((Object)("reason"),(Object)("prepare_direct:"+BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")))));
RDebugUtils.currentLine=84869147;
 //BA.debugLineNum = 84869147;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowA";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_flowargs);
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=84869149;
 //BA.debugLineNum = 84869149;BA.debugLine="Dim mediaArgs As Map";
_mediaargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=84869150;
 //BA.debugLineNum = 84869150;BA.debugLine="mediaArgs.Initialize";
_mediaargs.Initialize();
RDebugUtils.currentLine=84869151;
 //BA.debugLineNum = 84869151;BA.debugLine="mediaArgs.Put(\"audioKey\", targetAudioKey)";
_mediaargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=84869152;
 //BA.debugLineNum = 84869152;BA.debugLine="mediaArgs.Put(\"item\", nextItem)";
_mediaargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=84869153;
 //BA.debugLineNum = 84869153;BA.debugLine="Dim nextItemUrl As String = targetPage.Transition";
_nextitemurl = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_resolveplaybackmediaurl /*String*/ (null,_mediaargs);
RDebugUtils.currentLine=84869154;
 //BA.debugLineNum = 84869154;BA.debugLine="If nextItemUrl = \"\" Then";
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
RDebugUtils.currentLine=84869155;
 //BA.debugLineNum = 84869155;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetAu";
__ref._trace /*String*/ (null,"переход preload ошибка audio="+_targetaudiokey+" message=empty_media_url");
RDebugUtils.currentLine=84869156;
 //BA.debugLineNum = 84869156;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=84869158;
 //BA.debugLineNum = 84869158;BA.debugLine="Trace(\"prefetch load audio=\" & targetAudioKey & \"";
__ref._trace /*String*/ (null,"prefetch load audio="+_targetaudiokey+" item="+__ref._describeitem /*String*/ (null,_nextitem));
RDebugUtils.currentLine=84869159;
 //BA.debugLineNum = 84869159;BA.debugLine="Dim volume As Double = targetPage.Transition_Curr";
_volume = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_currentvolume /*double*/ (null,_nextitem);
RDebugUtils.currentLine=84869160;
 //BA.debugLineNum = 84869160;BA.debugLine="Dim targetAudio As AudioPlayer = targetPage.Trans";
_targetaudio = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getaudiobykey /*b4j.example.audioplayer*/ (null,_targetaudiokey);
RDebugUtils.currentLine=84869161;
 //BA.debugLineNum = 84869161;BA.debugLine="targetAudio.LoadUrl(nextItemUrl, volume)";
_targetaudio._loadurl /*String*/ (null,_nextitemurl,_volume);
RDebugUtils.currentLine=84869162;
 //BA.debugLineNum = 84869162;BA.debugLine="Dim waitArgs As Map";
_waitargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=84869163;
 //BA.debugLineNum = 84869163;BA.debugLine="waitArgs.Initialize";
_waitargs.Initialize();
RDebugUtils.currentLine=84869164;
 //BA.debugLineNum = 84869164;BA.debugLine="waitArgs.Put(\"audioKey\", targetAudioKey)";
_waitargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=84869165;
 //BA.debugLineNum = 84869165;BA.debugLine="waitArgs.Put(\"item\", nextItem)";
_waitargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=84869166;
 //BA.debugLineNum = 84869166;BA.debugLine="waitArgs.Put(\"timeoutMs\", 5000)";
_waitargs.Put((Object)("timeoutMs"),(Object)(5000));
RDebugUtils.currentLine=84869167;
 //BA.debugLineNum = 84869167;BA.debugLine="Wait For (targetPage.Transition_WaitForPreparedAu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbacktransitioncoordinator", "preparespecificplayable"), __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_waitforpreparedaudio /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_waitargs));
this.state = 33;
return;
case 33:
//C
this.state = 23;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=84869168;
 //BA.debugLineNum = 84869168;BA.debugLine="If targetPage.Transition_GetPlaybackFlowState = f";
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
RDebugUtils.currentLine=84869169;
 //BA.debugLineNum = 84869169;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
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
RDebugUtils.currentLine=84869170;
 //BA.debugLineNum = 84869170;BA.debugLine="Dim readyArgs As Map";
_readyargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=84869171;
 //BA.debugLineNum = 84869171;BA.debugLine="readyArgs.Initialize";
_readyargs.Initialize();
RDebugUtils.currentLine=84869172;
 //BA.debugLineNum = 84869172;BA.debugLine="readyArgs.Put(\"state\", previousFlowState)";
_readyargs.Put((Object)("state"),(Object)(_previousflowstate));
RDebugUtils.currentLine=84869173;
 //BA.debugLineNum = 84869173;BA.debugLine="readyArgs.Put(\"reason\", \"prepare_ready\")";
_readyargs.Put((Object)("reason"),(Object)("prepare_ready"));
RDebugUtils.currentLine=84869174;
 //BA.debugLineNum = 84869174;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(read";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_readyargs);
RDebugUtils.currentLine=84869175;
 //BA.debugLineNum = 84869175;BA.debugLine="Trace(\"prefetch prepared audio=\" & targetAudioK";
__ref._trace /*String*/ (null,"prefetch prepared audio="+_targetaudiokey+" item="+__ref._describeitem /*String*/ (null,_nextitem));
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=84869177;
 //BA.debugLineNum = 84869177;BA.debugLine="Dim failedArgs As Map";
_failedargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=84869178;
 //BA.debugLineNum = 84869178;BA.debugLine="failedArgs.Initialize";
_failedargs.Initialize();
RDebugUtils.currentLine=84869179;
 //BA.debugLineNum = 84869179;BA.debugLine="failedArgs.Put(\"state\", \"error\")";
_failedargs.Put((Object)("state"),(Object)("error"));
RDebugUtils.currentLine=84869180;
 //BA.debugLineNum = 84869180;BA.debugLine="failedArgs.Put(\"reason\", \"prepare_failed\")";
_failedargs.Put((Object)("reason"),(Object)("prepare_failed"));
RDebugUtils.currentLine=84869181;
 //BA.debugLineNum = 84869181;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(fail";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_failedargs);
RDebugUtils.currentLine=84869182;
 //BA.debugLineNum = 84869182;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetA";
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
RDebugUtils.currentLine=84869185;
 //BA.debugLineNum = 84869185;BA.debugLine="Return result.GetDefault(\"Success\", False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)));return;};
RDebugUtils.currentLine=84869186;
 //BA.debugLineNum = 84869186;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=56295424;
 //BA.debugLineNum = 56295424;BA.debugLine="Public Sub PromotePreparedPlayer(runtimeState As P";
RDebugUtils.currentLine=56295425;
 //BA.debugLineNum = 56295425;BA.debugLine="Dim preparedAudioKey As String = targetPage.Trans";
_preparedaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=56295426;
 //BA.debugLineNum = 56295426;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=56295427;
 //BA.debugLineNum = 56295427;BA.debugLine="If preparedAudioKey = \"\" Or preparedItem.IsInitia";
if ((_preparedaudiokey).equals("") || _prepareditem.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=56295428;
 //BA.debugLineNum = 56295428;BA.debugLine="Trace(\"переход prepared reject reason=missing_pr";
__ref._trace /*String*/ (null,"переход prepared reject reason=missing_prepared");
RDebugUtils.currentLine=56295429;
 //BA.debugLineNum = 56295429;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=56295431;
 //BA.debugLineNum = 56295431;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56295432;
 //BA.debugLineNum = 56295432;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
RDebugUtils.currentLine=56295433;
 //BA.debugLineNum = 56295433;BA.debugLine="flowArgs.Put(\"state\", flowTransitioning)";
_flowargs.Put((Object)("state"),(Object)(_flowtransitioning));
RDebugUtils.currentLine=56295434;
 //BA.debugLineNum = 56295434;BA.debugLine="flowArgs.Put(\"reason\", \"promote_prepared\")";
_flowargs.Put((Object)("reason"),(Object)("promote_prepared"));
RDebugUtils.currentLine=56295435;
 //BA.debugLineNum = 56295435;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowAr";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_setplaybackflowstate /*String*/ (null,_flowargs);
RDebugUtils.currentLine=56295436;
 //BA.debugLineNum = 56295436;BA.debugLine="Dim previousAudioKey As String = targetPage.Trans";
_previousaudiokey = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectoractiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=56295437;
 //BA.debugLineNum = 56295437;BA.debugLine="Dim nextAudioKey As String = preparedAudioKey";
_nextaudiokey = _preparedaudiokey;
RDebugUtils.currentLine=56295438;
 //BA.debugLineNum = 56295438;BA.debugLine="Dim promotedItem As Map = CloneMap(preparedItem)";
_promoteditem = new anywheresoftware.b4a.objects.collections.Map();
_promoteditem = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_prepareditem);
RDebugUtils.currentLine=56295439;
 //BA.debugLineNum = 56295439;BA.debugLine="targetPage.Transition_ConsumePreparedQueueItem";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_consumepreparedqueueitem /*String*/ (null);
RDebugUtils.currentLine=56295440;
 //BA.debugLineNum = 56295440;BA.debugLine="If previousAudioKey <> \"\" And previousAudioKey <>";
if ((_previousaudiokey).equals("") == false && (_previousaudiokey).equals(_nextaudiokey) == false) { 
RDebugUtils.currentLine=56295441;
 //BA.debugLineNum = 56295441;BA.debugLine="Dim previousAudio As AudioPlayer = targetPage.Tr";
_previousaudio = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getaudiobykey /*b4j.example.audioplayer*/ (null,_previousaudiokey);
RDebugUtils.currentLine=56295442;
 //BA.debugLineNum = 56295442;BA.debugLine="previousAudio.Stop(fadeOutMs)";
_previousaudio._stop /*String*/ (null,_fadeoutms);
 };
RDebugUtils.currentLine=56295444;
 //BA.debugLineNum = 56295444;BA.debugLine="dataResolver.CommitPlaylistCursor(storage, promot";
_dataresolver._commitplaylistcursor /*String*/ (null,_storage,_promoteditem);
RDebugUtils.currentLine=56295445;
 //BA.debugLineNum = 56295445;BA.debugLine="Dim activateArgs As Map";
_activateargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56295446;
 //BA.debugLineNum = 56295446;BA.debugLine="activateArgs.Initialize";
_activateargs.Initialize();
RDebugUtils.currentLine=56295447;
 //BA.debugLineNum = 56295447;BA.debugLine="activateArgs.Put(\"audioKey\", nextAudioKey)";
_activateargs.Put((Object)("audioKey"),(Object)(_nextaudiokey));
RDebugUtils.currentLine=56295448;
 //BA.debugLineNum = 56295448;BA.debugLine="activateArgs.Put(\"item\", promotedItem)";
_activateargs.Put((Object)("item"),(Object)(_promoteditem.getObject()));
RDebugUtils.currentLine=56295449;
 //BA.debugLineNum = 56295449;BA.debugLine="activateArgs.Put(\"fadeInMs\", fadeInMs)";
_activateargs.Put((Object)("fadeInMs"),(Object)(_fadeinms));
RDebugUtils.currentLine=56295450;
 //BA.debugLineNum = 56295450;BA.debugLine="Trace(\"prepared promote audio=\" & nextAudioKey &";
__ref._trace /*String*/ (null,"prepared promote audio="+_nextaudiokey+" type="+BA.ObjectToString(_promoteditem.GetDefault((Object)("type"),(Object)("")))+" id="+BA.ObjectToString(_promoteditem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=56295451;
 //BA.debugLineNum = 56295451;BA.debugLine="targetPage.Transition_ActivateLoadedItem(activate";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_activateloadeditem /*String*/ (null,_activateargs);
RDebugUtils.currentLine=56295452;
 //BA.debugLineNum = 56295452;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_clearpreparedstate /*String*/ (null,__c.False);
RDebugUtils.currentLine=56295453;
 //BA.debugLineNum = 56295453;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=56295454;
 //BA.debugLineNum = 56295454;BA.debugLine="End Sub";
return false;
}
public boolean  _canusepreparedtransition(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress,String _currenttype,String _preparedtype,String _decisionname) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "canusepreparedtransition", false))
	 {return ((Boolean) Debug.delegate(ba, "canusepreparedtransition", new Object[] {_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,_currenttype,_preparedtype,_decisionname}));}
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
RDebugUtils.currentLine=55967744;
 //BA.debugLineNum = 55967744;BA.debugLine="Public Sub CanUsePreparedTransition(runtimeState A";
RDebugUtils.currentLine=55967745;
 //BA.debugLineNum = 55967745;BA.debugLine="If transitionInProgress Then Return False";
if (_transitioninprogress) { 
if (true) return __c.False;};
RDebugUtils.currentLine=55967746;
 //BA.debugLineNum = 55967746;BA.debugLine="If orchestrationState.IsCrossfadeTriggered Then R";
if (_orchestrationstate._iscrossfadetriggered /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=55967747;
 //BA.debugLineNum = 55967747;BA.debugLine="If metaState.CurrentMediaType <> currentType Then";
if ((_metastate._currentmediatype /*String*/ ).equals(_currenttype) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=55967748;
 //BA.debugLineNum = 55967748;BA.debugLine="If HasUsablePreparedItem(runtimeState) = False Th";
if (__ref._hasusableprepareditem /*boolean*/ (null,_runtimestate)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=55967749;
 //BA.debugLineNum = 55967749;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=55967750;
 //BA.debugLineNum = 55967750;BA.debugLine="Return preparedItem.GetDefault(\"type\", \"\") = prep";
if (true) return (_prepareditem.GetDefault((Object)("type"),(Object)(""))).equals((Object)(_preparedtype));
RDebugUtils.currentLine=55967751;
 //BA.debugLineNum = 55967751;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.playbacktransitioncoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
RDebugUtils.currentLine=55705600;
 //BA.debugLineNum = 55705600;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=55705601;
 //BA.debugLineNum = 55705601;BA.debugLine="Private targetPage As B4XMainPage";
_targetpage = new b4j.example.b4xmainpage();
RDebugUtils.currentLine=55705602;
 //BA.debugLineNum = 55705602;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
RDebugUtils.currentLine=56492032;
 //BA.debugLineNum = 56492032;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=56492033;
 //BA.debugLineNum = 56492033;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56492034;
 //BA.debugLineNum = 56492034;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
RDebugUtils.currentLine=56492035;
 //BA.debugLineNum = 56492035;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
RDebugUtils.currentLine=56492036;
 //BA.debugLineNum = 56492036;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=56492037;
 //BA.debugLineNum = 56492037;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=56492039;
 //BA.debugLineNum = 56492039;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
RDebugUtils.currentLine=56492040;
 //BA.debugLineNum = 56492040;BA.debugLine="End Sub";
return null;
}
public String  _describeitem(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "describeitem", false))
	 {return ((String) Debug.delegate(ba, "describeitem", new Object[] {_item}));}
RDebugUtils.currentLine=56360960;
 //BA.debugLineNum = 56360960;BA.debugLine="Private Sub DescribeItem(item As Map) As String";
RDebugUtils.currentLine=56360961;
 //BA.debugLineNum = 56360961;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=56360962;
 //BA.debugLineNum = 56360962;BA.debugLine="Return targetPage.Transition_DescribeItem(item)";
if (true) return __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_describeitem /*String*/ (null,_item);
RDebugUtils.currentLine=56360963;
 //BA.debugLineNum = 56360963;BA.debugLine="End Sub";
return "";
}
public boolean  _itemsmatch(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.Map _firstitem,anywheresoftware.b4a.objects.collections.Map _seconditem) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "itemsmatch", false))
	 {return ((Boolean) Debug.delegate(ba, "itemsmatch", new Object[] {_firstitem,_seconditem}));}
anywheresoftware.b4a.objects.collections.Map _args = null;
RDebugUtils.currentLine=56426496;
 //BA.debugLineNum = 56426496;BA.debugLine="Private Sub ItemsMatch(firstItem As Map, secondIte";
RDebugUtils.currentLine=56426497;
 //BA.debugLineNum = 56426497;BA.debugLine="Dim args As Map";
_args = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56426498;
 //BA.debugLineNum = 56426498;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=56426499;
 //BA.debugLineNum = 56426499;BA.debugLine="args.Put(\"first\", firstItem)";
_args.Put((Object)("first"),(Object)(_firstitem.getObject()));
RDebugUtils.currentLine=56426500;
 //BA.debugLineNum = 56426500;BA.debugLine="args.Put(\"second\", secondItem)";
_args.Put((Object)("second"),(Object)(_seconditem.getObject()));
RDebugUtils.currentLine=56426501;
 //BA.debugLineNum = 56426501;BA.debugLine="Return targetPage.Transition_ItemsMatch(args)";
if (true) return __ref._targetpage /*b4j.example.b4xmainpage*/ ._transition_itemsmatch /*boolean*/ (null,_args);
RDebugUtils.currentLine=56426502;
 //BA.debugLineNum = 56426502;BA.debugLine="End Sub";
return false;
}
public String  _trace(b4j.example.playbacktransitioncoordinator __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=56557568;
 //BA.debugLineNum = 56557568;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=56557569;
 //BA.debugLineNum = 56557569;BA.debugLine="targetPage.TraceLog(message)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._tracelog /*String*/ (null,_message);
RDebugUtils.currentLine=56557570;
 //BA.debugLineNum = 56557570;BA.debugLine="End Sub";
return "";
}
}