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
public Object _targetmodule = null;
public String _tracesubname = "";
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
RDebugUtils.currentLine=52690944;
 //BA.debugLineNum = 52690944;BA.debugLine="Public Sub CanCrossfadePreparedItem(runtimeState A";
RDebugUtils.currentLine=52690945;
 //BA.debugLineNum = 52690945;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
if (true) return __ref._canusepreparedtransition /*boolean*/ (null,_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,"track","track","crossfade");
RDebugUtils.currentLine=52690946;
 //BA.debugLineNum = 52690946;BA.debugLine="End Sub";
return false;
}
public boolean  _canstartpreparedontracktail(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "canstartpreparedontracktail", false))
	 {return ((Boolean) Debug.delegate(ba, "canstartpreparedontracktail", new Object[] {_runtimestate,_metastate,_orchestrationstate,_transitioninprogress}));}
RDebugUtils.currentLine=52756480;
 //BA.debugLineNum = 52756480;BA.debugLine="Public Sub CanStartPreparedOnTrackTail(runtimeStat";
RDebugUtils.currentLine=52756481;
 //BA.debugLineNum = 52756481;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
if (true) return __ref._canusepreparedtransition /*boolean*/ (null,_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,"track","ad","tail_start");
RDebugUtils.currentLine=52756482;
 //BA.debugLineNum = 52756482;BA.debugLine="End Sub";
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
Object _nextobject = null;
anywheresoftware.b4a.objects.collections.Map _candidateitem = null;
String _candidatetype = "";
anywheresoftware.b4a.objects.collections.Map _nextitem = null;
anywheresoftware.b4a.objects.collections.Map _matchargs = null;
String _targetaudiokey = "";
String _previousflowstate = "";
anywheresoftware.b4a.objects.collections.Map _flowargs = null;
anywheresoftware.b4a.objects.collections.Map _mediaargs = null;
String _nextitemurl = "";
double _volume = 0;
b4j.example.audioplayer _targetaudio = null;
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
RDebugUtils.currentLine=52887553;
 //BA.debugLineNum = 52887553;BA.debugLine="Do While playQueue.Size > 0";
if (true) break;

case 1:
//do while
this.state = 23;
while (_playqueue.getSize()>0) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=52887554;
 //BA.debugLineNum = 52887554;BA.debugLine="Dim nextObject As Object = playQueue.Get(0)";
_nextobject = _playqueue.Get((int) (0));
RDebugUtils.currentLine=52887555;
 //BA.debugLineNum = 52887555;BA.debugLine="If nextObject Is Map Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_nextobject instanceof java.util.Map) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=52887557;
 //BA.debugLineNum = 52887557;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=52887559;
 //BA.debugLineNum = 52887559;BA.debugLine="Dim candidateItem As Map = nextObject";
_candidateitem = new anywheresoftware.b4a.objects.collections.Map();
_candidateitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_nextobject));
RDebugUtils.currentLine=52887560;
 //BA.debugLineNum = 52887560;BA.debugLine="Dim candidateType As String = candidateItem.GetD";
_candidatetype = BA.ObjectToString(_candidateitem.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=52887561;
 //BA.debugLineNum = 52887561;BA.debugLine="If candidateType <> \"track\" And candidateType <>";
if (true) break;

case 10:
//if
this.state = 15;
if ((_candidatetype).equals("track") == false && (_candidatetype).equals("ad") == false) { 
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
RDebugUtils.currentLine=52887562;
 //BA.debugLineNum = 52887562;BA.debugLine="If candidateType = \"track\" And mediaCacheService";
if (true) break;

case 16:
//if
this.state = 19;
if ((_candidatetype).equals("track") && _mediacacheservice._istrackcached /*boolean*/ (null,BA.ObjectToString(_candidateitem.GetDefault((Object)("id"),(Object)(""))))==parent.__c.False) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=52887563;
 //BA.debugLineNum = 52887563;BA.debugLine="Trace(\"Удален из очереди трек без локального фа";
__ref._trace /*String*/ (null,"Удален из очереди трек без локального файла. item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=52887564;
 //BA.debugLineNum = 52887564;BA.debugLine="playQueue.RemoveAt(0)";
_playqueue.RemoveAt((int) (0));
RDebugUtils.currentLine=52887565;
 //BA.debugLineNum = 52887565;BA.debugLine="CallSub(targetModule, \"Transition_SaveQueueSnap";
parent.__c.CallSubDebug(ba,__ref._targetmodule /*Object*/ ,"Transition_SaveQueueSnapshotState");
RDebugUtils.currentLine=52887566;
 //BA.debugLineNum = 52887566;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;
;
RDebugUtils.currentLine=52887568;
 //BA.debugLineNum = 52887568;BA.debugLine="If candidateType = \"ad\" And mediaCacheService.Is";

case 19:
//if
this.state = 22;
if ((_candidatetype).equals("ad") && _mediacacheservice._isadcached /*boolean*/ (null,BA.ObjectToString(_candidateitem.GetDefault((Object)("id"),(Object)(""))))==parent.__c.False) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=52887569;
 //BA.debugLineNum = 52887569;BA.debugLine="Trace(\"Удален из очереди ролик без локального ф";
__ref._trace /*String*/ (null,"Удален из очереди ролик без локального файла. item="+__ref._describeitem /*String*/ (null,_candidateitem));
RDebugUtils.currentLine=52887570;
 //BA.debugLineNum = 52887570;BA.debugLine="playQueue.RemoveAt(0)";
_playqueue.RemoveAt((int) (0));
RDebugUtils.currentLine=52887571;
 //BA.debugLineNum = 52887571;BA.debugLine="CallSub(targetModule, \"Transition_SaveQueueSnap";
parent.__c.CallSubDebug(ba,__ref._targetmodule /*Object*/ ,"Transition_SaveQueueSnapshotState");
RDebugUtils.currentLine=52887572;
 //BA.debugLineNum = 52887572;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;

case 22:
//C
this.state = 1;
;
RDebugUtils.currentLine=52887574;
 //BA.debugLineNum = 52887574;BA.debugLine="Exit";
this.state = 23;
if (true) break;
 if (true) break;
;
RDebugUtils.currentLine=52887576;
 //BA.debugLineNum = 52887576;BA.debugLine="If playQueue.Size = 0 Then Return False";

case 23:
//if
this.state = 28;
if (_playqueue.getSize()==0) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=52887577;
 //BA.debugLineNum = 52887577;BA.debugLine="Dim nextItem As Map = playQueue.Get(0)";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playqueue.Get((int) (0))));
RDebugUtils.currentLine=52887578;
 //BA.debugLineNum = 52887578;BA.debugLine="If runtimeState.PreparedItem.IsInitialized And ru";
if (true) break;

case 29:
//if
this.state = 36;
if (_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && (_runtimestate._preparedaudiokey /*String*/ ).equals("") == false) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=52887579;
 //BA.debugLineNum = 52887579;BA.debugLine="Dim matchArgs As Map";
_matchargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=52887580;
 //BA.debugLineNum = 52887580;BA.debugLine="matchArgs.Initialize";
_matchargs.Initialize();
RDebugUtils.currentLine=52887581;
 //BA.debugLineNum = 52887581;BA.debugLine="matchArgs.Put(\"first\", runtimeState.PreparedItem";
_matchargs.Put((Object)("first"),(Object)(_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=52887582;
 //BA.debugLineNum = 52887582;BA.debugLine="matchArgs.Put(\"second\", nextItem)";
_matchargs.Put((Object)("second"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=52887583;
 //BA.debugLineNum = 52887583;BA.debugLine="If CallSub2(targetModule, \"Transition_ItemsMatch";
if (true) break;

case 32:
//if
this.state = 35;
if (BA.ObjectToBoolean(parent.__c.CallSubDebug2(ba,__ref._targetmodule /*Object*/ ,"Transition_ItemsMatch",(Object)(_matchargs)))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=52887584;
 //BA.debugLineNum = 52887584;BA.debugLine="Trace(\"PlaybackTransitionCoordinator prepared i";
__ref._trace /*String*/ (null,"PlaybackTransitionCoordinator prepared item accepted. item="+__ref._describeitem /*String*/ (null,_nextitem));
RDebugUtils.currentLine=52887585;
 //BA.debugLineNum = 52887585;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 35:
//C
this.state = 36;
;
 if (true) break;

case 36:
//C
this.state = 37;
;
RDebugUtils.currentLine=52887588;
 //BA.debugLineNum = 52887588;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
_targetaudiokey = __ref._getinactiveaudiokey /*String*/ (null,_runtimestate);
RDebugUtils.currentLine=52887589;
 //BA.debugLineNum = 52887589;BA.debugLine="CallSub2(targetModule, \"Transition_ClearPreparedS";
parent.__c.CallSubDebug2(ba,__ref._targetmodule /*Object*/ ,"Transition_ClearPreparedState",(Object)(parent.__c.False));
RDebugUtils.currentLine=52887590;
 //BA.debugLineNum = 52887590;BA.debugLine="runtimeState.SetPendingPrepare(targetAudioKey, ne";
_runtimestate._setpendingprepare /*String*/ (null,_targetaudiokey,_nextitem);
RDebugUtils.currentLine=52887591;
 //BA.debugLineNum = 52887591;BA.debugLine="Dim previousFlowState As String = playbackFlowSta";
_previousflowstate = _playbackflowstate;
RDebugUtils.currentLine=52887592;
 //BA.debugLineNum = 52887592;BA.debugLine="If playbackFlowState = flowPlaying Or playbackFlo";
if (true) break;

case 37:
//if
this.state = 40;
if ((_playbackflowstate).equals(_flowplaying) || (_playbackflowstate).equals(_flowidle)) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=52887593;
 //BA.debugLineNum = 52887593;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=52887594;
 //BA.debugLineNum = 52887594;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
RDebugUtils.currentLine=52887595;
 //BA.debugLineNum = 52887595;BA.debugLine="flowArgs.Put(\"state\", flowPreparing)";
_flowargs.Put((Object)("state"),(Object)(_flowpreparing));
RDebugUtils.currentLine=52887596;
 //BA.debugLineNum = 52887596;BA.debugLine="flowArgs.Put(\"reason\", \"prepare_next:\" & nextIte";
_flowargs.Put((Object)("reason"),(Object)("prepare_next:"+BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")))));
RDebugUtils.currentLine=52887597;
 //BA.debugLineNum = 52887597;BA.debugLine="CallSub2(targetModule, \"Transition_SetPlaybackFl";
parent.__c.CallSubDebug2(ba,__ref._targetmodule /*Object*/ ,"Transition_SetPlaybackFlowState",(Object)(_flowargs));
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=52887599;
 //BA.debugLineNum = 52887599;BA.debugLine="Dim mediaArgs As Map";
_mediaargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=52887600;
 //BA.debugLineNum = 52887600;BA.debugLine="mediaArgs.Initialize";
_mediaargs.Initialize();
RDebugUtils.currentLine=52887601;
 //BA.debugLineNum = 52887601;BA.debugLine="mediaArgs.Put(\"audioKey\", targetAudioKey)";
_mediaargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
RDebugUtils.currentLine=52887602;
 //BA.debugLineNum = 52887602;BA.debugLine="mediaArgs.Put(\"item\", nextItem)";
_mediaargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
RDebugUtils.currentLine=52887603;
 //BA.debugLineNum = 52887603;BA.debugLine="Dim nextItemUrl As String = CallSub2(targetModule";
_nextitemurl = BA.ObjectToString(parent.__c.CallSubDebug2(ba,__ref._targetmodule /*Object*/ ,"Transition_ResolvePlaybackMediaUrl",(Object)(_mediaargs)));
RDebugUtils.currentLine=52887604;
 //BA.debugLineNum = 52887604;BA.debugLine="If nextItemUrl = \"\" Then";
if (true) break;

case 41:
//if
this.state = 44;
if ((_nextitemurl).equals("")) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=52887605;
 //BA.debugLineNum = 52887605;BA.debugLine="Trace(\"PlaybackTransitionCoordinator preload fai";
__ref._trace /*String*/ (null,"PlaybackTransitionCoordinator preload failed. audio="+_targetaudiokey+", message=empty_media_url");
RDebugUtils.currentLine=52887606;
 //BA.debugLineNum = 52887606;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=52887608;
 //BA.debugLineNum = 52887608;BA.debugLine="Dim volume As Double = CallSub2(targetModule, \"Tr";
_volume = (double)(BA.ObjectToNumber(parent.__c.CallSubDebug2(ba,__ref._targetmodule /*Object*/ ,"Transition_CurrentVolume",(Object)(_nextitem))));
RDebugUtils.currentLine=52887609;
 //BA.debugLineNum = 52887609;BA.debugLine="Trace(\"PlaybackTransitionCoordinator preload requ";
__ref._trace /*String*/ (null,"PlaybackTransitionCoordinator preload requested. targetAudio="+_targetaudiokey+", item="+__ref._describeitem /*String*/ (null,_nextitem)+", source="+_mediacacheservice._resolvemediasource /*String*/ (null,_nextitem));
RDebugUtils.currentLine=52887610;
 //BA.debugLineNum = 52887610;BA.debugLine="Dim targetAudio As AudioPlayer = CallSub2(targetM";
_targetaudio = (b4j.example.audioplayer)(parent.__c.CallSubDebug2(ba,__ref._targetmodule /*Object*/ ,"Transition_GetAudioByKey",(Object)(_targetaudiokey)));
RDebugUtils.currentLine=52887611;
 //BA.debugLineNum = 52887611;BA.debugLine="targetAudio.LoadUrl(nextItemUrl, volume)";
_targetaudio._loadurl /*String*/ (null,_nextitemurl,_volume);
RDebugUtils.currentLine=52887612;
 //BA.debugLineNum = 52887612;BA.debugLine="Wait For PreloadDone(result As Map)";
parent.__c.WaitFor("preloaddone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbacktransitioncoordinator", "preparenextplayable"), null);
this.state = 55;
return;
case 55:
//C
this.state = 45;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=52887613;
 //BA.debugLineNum = 52887613;BA.debugLine="Trace(\"PlaybackTransitionCoordinator preload comp";
__ref._trace /*String*/ (null,"PlaybackTransitionCoordinator preload completed. audio="+_targetaudiokey+", success="+BA.ObjectToString(_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)))+", message="+BA.ObjectToString(_result.GetDefault((Object)("Message"),(Object)(""))));
RDebugUtils.currentLine=52887614;
 //BA.debugLineNum = 52887614;BA.debugLine="If playbackFlowState = flowPreparing Then";
if (true) break;

case 45:
//if
this.state = 54;
if ((_playbackflowstate).equals(_flowpreparing)) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=52887615;
 //BA.debugLineNum = 52887615;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
if (true) break;

case 48:
//if
this.state = 53;
if (BA.ObjectToBoolean(_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)))) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 53;
RDebugUtils.currentLine=52887616;
 //BA.debugLineNum = 52887616;BA.debugLine="Dim readyArgs As Map";
_readyargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=52887617;
 //BA.debugLineNum = 52887617;BA.debugLine="readyArgs.Initialize";
_readyargs.Initialize();
RDebugUtils.currentLine=52887618;
 //BA.debugLineNum = 52887618;BA.debugLine="readyArgs.Put(\"state\", previousFlowState)";
_readyargs.Put((Object)("state"),(Object)(_previousflowstate));
RDebugUtils.currentLine=52887619;
 //BA.debugLineNum = 52887619;BA.debugLine="readyArgs.Put(\"reason\", \"prepare_ready\")";
_readyargs.Put((Object)("reason"),(Object)("prepare_ready"));
RDebugUtils.currentLine=52887620;
 //BA.debugLineNum = 52887620;BA.debugLine="CallSub2(targetModule, \"Transition_SetPlaybackF";
parent.__c.CallSubDebug2(ba,__ref._targetmodule /*Object*/ ,"Transition_SetPlaybackFlowState",(Object)(_readyargs));
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=52887622;
 //BA.debugLineNum = 52887622;BA.debugLine="Dim failedArgs As Map";
_failedargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=52887623;
 //BA.debugLineNum = 52887623;BA.debugLine="failedArgs.Initialize";
_failedargs.Initialize();
RDebugUtils.currentLine=52887624;
 //BA.debugLineNum = 52887624;BA.debugLine="failedArgs.Put(\"state\", \"error\")";
_failedargs.Put((Object)("state"),(Object)("error"));
RDebugUtils.currentLine=52887625;
 //BA.debugLineNum = 52887625;BA.debugLine="failedArgs.Put(\"reason\", \"prepare_failed\")";
_failedargs.Put((Object)("reason"),(Object)("prepare_failed"));
RDebugUtils.currentLine=52887626;
 //BA.debugLineNum = 52887626;BA.debugLine="CallSub2(targetModule, \"Transition_SetPlaybackF";
parent.__c.CallSubDebug2(ba,__ref._targetmodule /*Object*/ ,"Transition_SetPlaybackFlowState",(Object)(_failedargs));
RDebugUtils.currentLine=52887627;
 //BA.debugLineNum = 52887627;BA.debugLine="Trace(\"PlaybackTransitionCoordinator preload fa";
__ref._trace /*String*/ (null,"PlaybackTransitionCoordinator preload failed. audio="+_targetaudiokey);
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = -1;
;
RDebugUtils.currentLine=52887630;
 //BA.debugLineNum = 52887630;BA.debugLine="Return result.GetDefault(\"Success\", False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)));return;};
RDebugUtils.currentLine=52887631;
 //BA.debugLineNum = 52887631;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=52494336;
 //BA.debugLineNum = 52494336;BA.debugLine="Public Sub GetInactiveAudioKey(runtimeState As Pla";
RDebugUtils.currentLine=52494337;
 //BA.debugLineNum = 52494337;BA.debugLine="If runtimeState.ActiveAudioKey = \"primary\" Then R";
if ((_runtimestate._activeaudiokey /*String*/ ).equals("primary")) { 
if (true) return "secondary";};
RDebugUtils.currentLine=52494338;
 //BA.debugLineNum = 52494338;BA.debugLine="Return \"primary\"";
if (true) return "primary";
RDebugUtils.currentLine=52494339;
 //BA.debugLineNum = 52494339;BA.debugLine="End Sub";
return "";
}
public boolean  _hasusableprepareditem(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "hasusableprepareditem", false))
	 {return ((Boolean) Debug.delegate(ba, "hasusableprepareditem", new Object[] {_runtimestate}));}
String _preparedtype = "";
RDebugUtils.currentLine=52559872;
 //BA.debugLineNum = 52559872;BA.debugLine="Public Sub HasUsablePreparedItem(runtimeState As P";
RDebugUtils.currentLine=52559873;
 //BA.debugLineNum = 52559873;BA.debugLine="If runtimeState.PreparedAudioKey = \"\" Then Return";
if ((_runtimestate._preparedaudiokey /*String*/ ).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=52559874;
 //BA.debugLineNum = 52559874;BA.debugLine="If runtimeState.PreparedItem.IsInitialized = Fals";
if (_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=52559875;
 //BA.debugLineNum = 52559875;BA.debugLine="Dim preparedType As String = runtimeState.Prepare";
_preparedtype = BA.ObjectToString(_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=52559876;
 //BA.debugLineNum = 52559876;BA.debugLine="Return preparedType = \"track\" Or preparedType = \"";
if (true) return (_preparedtype).equals("track") || (_preparedtype).equals("ad");
RDebugUtils.currentLine=52559877;
 //BA.debugLineNum = 52559877;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.BA _ba,Object _targetmodulevalue,String _tracesubnamevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_targetmodulevalue,_tracesubnamevalue}));}
RDebugUtils.currentLine=52428800;
 //BA.debugLineNum = 52428800;BA.debugLine="Public Sub Initialize(targetModuleValue As Object,";
RDebugUtils.currentLine=52428801;
 //BA.debugLineNum = 52428801;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=52428802;
 //BA.debugLineNum = 52428802;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=52428803;
 //BA.debugLineNum = 52428803;BA.debugLine="End Sub";
return "";
}
public int  _preparedfadeoutms(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackmetastate _metastate,b4j.example.playbackruntimestate _runtimestate,int _trackoverlapms,int _adtailoverlapms) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "preparedfadeoutms", false))
	 {return ((Integer) Debug.delegate(ba, "preparedfadeoutms", new Object[] {_metastate,_runtimestate,_trackoverlapms,_adtailoverlapms}));}
String _nexttype = "";
RDebugUtils.currentLine=52822016;
 //BA.debugLineNum = 52822016;BA.debugLine="Public Sub PreparedFadeOutMs(metaState As Playback";
RDebugUtils.currentLine=52822017;
 //BA.debugLineNum = 52822017;BA.debugLine="If metaState.CurrentMediaType <> \"track\" Then Ret";
if ((_metastate._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=52822018;
 //BA.debugLineNum = 52822018;BA.debugLine="If runtimeState.PreparedItem.IsInitialized = Fals";
if (_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=52822019;
 //BA.debugLineNum = 52822019;BA.debugLine="Dim nextType As String = runtimeState.PreparedIte";
_nexttype = BA.ObjectToString(_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=52822020;
 //BA.debugLineNum = 52822020;BA.debugLine="If nextType = \"track\" Then Return trackOverlapMs";
if ((_nexttype).equals("track")) { 
if (true) return _trackoverlapms;};
RDebugUtils.currentLine=52822021;
 //BA.debugLineNum = 52822021;BA.debugLine="If nextType = \"ad\" Then Return adTailOverlapMs";
if ((_nexttype).equals("ad")) { 
if (true) return _adtailoverlapms;};
RDebugUtils.currentLine=52822022;
 //BA.debugLineNum = 52822022;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=52822023;
 //BA.debugLineNum = 52822023;BA.debugLine="End Sub";
return 0;
}
public boolean  _promotepreparedplayer(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate,b4j.example.dataplaybackresolver _dataresolver,b4j.example.keyvaluestore _storage,int _fadeinms,int _fadeoutms,String _flowtransitioning) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "promotepreparedplayer", false))
	 {return ((Boolean) Debug.delegate(ba, "promotepreparedplayer", new Object[] {_runtimestate,_dataresolver,_storage,_fadeinms,_fadeoutms,_flowtransitioning}));}
anywheresoftware.b4a.objects.collections.Map _flowargs = null;
String _previousaudiokey = "";
String _nextaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _promoteditem = null;
b4j.example.audioplayer _previousaudio = null;
anywheresoftware.b4a.objects.collections.Map _activateargs = null;
RDebugUtils.currentLine=52953088;
 //BA.debugLineNum = 52953088;BA.debugLine="Public Sub PromotePreparedPlayer(runtimeState As P";
RDebugUtils.currentLine=52953089;
 //BA.debugLineNum = 52953089;BA.debugLine="If runtimeState.PreparedAudioKey = \"\" Or runtimeS";
if ((_runtimestate._preparedaudiokey /*String*/ ).equals("") || _runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=52953090;
 //BA.debugLineNum = 52953090;BA.debugLine="Trace(\"PlaybackTransitionCoordinator prepared it";
__ref._trace /*String*/ (null,"PlaybackTransitionCoordinator prepared item rejected. reason=missing_prepared");
RDebugUtils.currentLine=52953091;
 //BA.debugLineNum = 52953091;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=52953093;
 //BA.debugLineNum = 52953093;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=52953094;
 //BA.debugLineNum = 52953094;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
RDebugUtils.currentLine=52953095;
 //BA.debugLineNum = 52953095;BA.debugLine="flowArgs.Put(\"state\", flowTransitioning)";
_flowargs.Put((Object)("state"),(Object)(_flowtransitioning));
RDebugUtils.currentLine=52953096;
 //BA.debugLineNum = 52953096;BA.debugLine="flowArgs.Put(\"reason\", \"promote_prepared\")";
_flowargs.Put((Object)("reason"),(Object)("promote_prepared"));
RDebugUtils.currentLine=52953097;
 //BA.debugLineNum = 52953097;BA.debugLine="CallSub2(targetModule, \"Transition_SetPlaybackFlo";
__c.CallSubDebug2(ba,__ref._targetmodule /*Object*/ ,"Transition_SetPlaybackFlowState",(Object)(_flowargs));
RDebugUtils.currentLine=52953098;
 //BA.debugLineNum = 52953098;BA.debugLine="Dim previousAudioKey As String = runtimeState.Act";
_previousaudiokey = _runtimestate._activeaudiokey /*String*/ ;
RDebugUtils.currentLine=52953099;
 //BA.debugLineNum = 52953099;BA.debugLine="Dim nextAudioKey As String = runtimeState.Prepare";
_nextaudiokey = _runtimestate._preparedaudiokey /*String*/ ;
RDebugUtils.currentLine=52953100;
 //BA.debugLineNum = 52953100;BA.debugLine="Dim promotedItem As Map = CloneMap(runtimeState.P";
_promoteditem = new anywheresoftware.b4a.objects.collections.Map();
_promoteditem = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=52953101;
 //BA.debugLineNum = 52953101;BA.debugLine="Trace(\"PlaybackTransitionCoordinator prepared ite";
__ref._trace /*String*/ (null,"PlaybackTransitionCoordinator prepared item promoted. fromAudio="+_previousaudiokey+", toAudio="+_nextaudiokey+", item="+__ref._describeitem /*String*/ (null,_promoteditem)+", fadeOutMs="+BA.NumberToString(_fadeoutms));
RDebugUtils.currentLine=52953102;
 //BA.debugLineNum = 52953102;BA.debugLine="CallSub(targetModule, \"Transition_ConsumePrepared";
__c.CallSubDebug(ba,__ref._targetmodule /*Object*/ ,"Transition_ConsumePreparedQueueItem");
RDebugUtils.currentLine=52953103;
 //BA.debugLineNum = 52953103;BA.debugLine="If previousAudioKey <> \"\" And previousAudioKey <>";
if ((_previousaudiokey).equals("") == false && (_previousaudiokey).equals(_nextaudiokey) == false) { 
RDebugUtils.currentLine=52953104;
 //BA.debugLineNum = 52953104;BA.debugLine="Dim previousAudio As AudioPlayer = CallSub2(targ";
_previousaudio = (b4j.example.audioplayer)(__c.CallSubDebug2(ba,__ref._targetmodule /*Object*/ ,"Transition_GetAudioByKey",(Object)(_previousaudiokey)));
RDebugUtils.currentLine=52953105;
 //BA.debugLineNum = 52953105;BA.debugLine="previousAudio.Stop(fadeOutMs)";
_previousaudio._stop /*String*/ (null,_fadeoutms);
 };
RDebugUtils.currentLine=52953107;
 //BA.debugLineNum = 52953107;BA.debugLine="dataResolver.CommitPlaylistCursor(storage, promot";
_dataresolver._commitplaylistcursor /*String*/ (null,_storage,_promoteditem);
RDebugUtils.currentLine=52953108;
 //BA.debugLineNum = 52953108;BA.debugLine="Trace(\"PlaybackQueueState playlist cursor committ";
__ref._trace /*String*/ (null,"PlaybackQueueState playlist cursor committed. item="+__ref._describeitem /*String*/ (null,_promoteditem));
RDebugUtils.currentLine=52953109;
 //BA.debugLineNum = 52953109;BA.debugLine="CallSub(targetModule, \"Transition_SaveQueueSnapsh";
__c.CallSubDebug(ba,__ref._targetmodule /*Object*/ ,"Transition_SaveQueueSnapshotState");
RDebugUtils.currentLine=52953110;
 //BA.debugLineNum = 52953110;BA.debugLine="Dim activateArgs As Map";
_activateargs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=52953111;
 //BA.debugLineNum = 52953111;BA.debugLine="activateArgs.Initialize";
_activateargs.Initialize();
RDebugUtils.currentLine=52953112;
 //BA.debugLineNum = 52953112;BA.debugLine="activateArgs.Put(\"audioKey\", nextAudioKey)";
_activateargs.Put((Object)("audioKey"),(Object)(_nextaudiokey));
RDebugUtils.currentLine=52953113;
 //BA.debugLineNum = 52953113;BA.debugLine="activateArgs.Put(\"item\", promotedItem)";
_activateargs.Put((Object)("item"),(Object)(_promoteditem.getObject()));
RDebugUtils.currentLine=52953114;
 //BA.debugLineNum = 52953114;BA.debugLine="activateArgs.Put(\"fadeInMs\", fadeInMs)";
_activateargs.Put((Object)("fadeInMs"),(Object)(_fadeinms));
RDebugUtils.currentLine=52953115;
 //BA.debugLineNum = 52953115;BA.debugLine="CallSub2(targetModule, \"Transition_ActivateLoaded";
__c.CallSubDebug2(ba,__ref._targetmodule /*Object*/ ,"Transition_ActivateLoadedItem",(Object)(_activateargs));
RDebugUtils.currentLine=52953116;
 //BA.debugLineNum = 52953116;BA.debugLine="CallSub2(targetModule, \"Transition_ClearPreparedS";
__c.CallSubDebug2(ba,__ref._targetmodule /*Object*/ ,"Transition_ClearPreparedState",(Object)(__c.False));
RDebugUtils.currentLine=52953117;
 //BA.debugLineNum = 52953117;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=52953118;
 //BA.debugLineNum = 52953118;BA.debugLine="End Sub";
return false;
}
public boolean  _canusepreparedtransition(b4j.example.playbacktransitioncoordinator __ref,b4j.example.playbackruntimestate _runtimestate,b4j.example.playbackmetastate _metastate,b4j.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress,String _currenttype,String _preparedtype,String _decisionname) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "canusepreparedtransition", false))
	 {return ((Boolean) Debug.delegate(ba, "canusepreparedtransition", new Object[] {_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,_currenttype,_preparedtype,_decisionname}));}
RDebugUtils.currentLine=52625408;
 //BA.debugLineNum = 52625408;BA.debugLine="Public Sub CanUsePreparedTransition(runtimeState A";
RDebugUtils.currentLine=52625409;
 //BA.debugLineNum = 52625409;BA.debugLine="If transitionInProgress Then Return False";
if (_transitioninprogress) { 
if (true) return __c.False;};
RDebugUtils.currentLine=52625410;
 //BA.debugLineNum = 52625410;BA.debugLine="If orchestrationState.IsCrossfadeTriggered Then R";
if (_orchestrationstate._iscrossfadetriggered /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=52625411;
 //BA.debugLineNum = 52625411;BA.debugLine="If metaState.CurrentMediaType <> currentType Then";
if ((_metastate._currentmediatype /*String*/ ).equals(_currenttype) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=52625412;
 //BA.debugLineNum = 52625412;BA.debugLine="If HasUsablePreparedItem(runtimeState) = False Th";
if (__ref._hasusableprepareditem /*boolean*/ (null,_runtimestate)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=52625413;
 //BA.debugLineNum = 52625413;BA.debugLine="Return runtimeState.PreparedItem.GetDefault(\"type";
if (true) return (_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)(""))).equals((Object)(_preparedtype));
RDebugUtils.currentLine=52625414;
 //BA.debugLineNum = 52625414;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.playbacktransitioncoordinator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
RDebugUtils.currentLine=52363264;
 //BA.debugLineNum = 52363264;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=52363265;
 //BA.debugLineNum = 52363265;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=52363266;
 //BA.debugLineNum = 52363266;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=52363267;
 //BA.debugLineNum = 52363267;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
RDebugUtils.currentLine=53084160;
 //BA.debugLineNum = 53084160;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=53084161;
 //BA.debugLineNum = 53084161;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=53084162;
 //BA.debugLineNum = 53084162;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
RDebugUtils.currentLine=53084163;
 //BA.debugLineNum = 53084163;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
RDebugUtils.currentLine=53084164;
 //BA.debugLineNum = 53084164;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=53084165;
 //BA.debugLineNum = 53084165;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=53084167;
 //BA.debugLineNum = 53084167;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
RDebugUtils.currentLine=53084168;
 //BA.debugLineNum = 53084168;BA.debugLine="End Sub";
return null;
}
public String  _describeitem(b4j.example.playbacktransitioncoordinator __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "describeitem", false))
	 {return ((String) Debug.delegate(ba, "describeitem", new Object[] {_item}));}
RDebugUtils.currentLine=53018624;
 //BA.debugLineNum = 53018624;BA.debugLine="Private Sub DescribeItem(item As Map) As String";
RDebugUtils.currentLine=53018625;
 //BA.debugLineNum = 53018625;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=53018626;
 //BA.debugLineNum = 53018626;BA.debugLine="Return CallSub2(targetModule, \"Transition_Describ";
if (true) return BA.ObjectToString(__c.CallSubDebug2(ba,__ref._targetmodule /*Object*/ ,"Transition_DescribeItem",(Object)(_item)));
RDebugUtils.currentLine=53018627;
 //BA.debugLineNum = 53018627;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.playbacktransitioncoordinator __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktransitioncoordinator";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=53149696;
 //BA.debugLineNum = 53149696;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=53149697;
 //BA.debugLineNum = 53149697;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=53149698;
 //BA.debugLineNum = 53149698;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=53149700;
 //BA.debugLineNum = 53149700;BA.debugLine="End Sub";
return "";
}
}