package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playbacktransitioncoordinator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playbacktransitioncoordinator");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playbacktransitioncoordinator.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.b4xmainpage _targetpage = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public boolean  _cancrossfadeprepareditem(b4a.example.playbackruntimestate _runtimestate,b4a.example.playbackmetastate _metastate,b4a.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub CanCrossfadePreparedItem(runtimeState A";
 //BA.debugLineNum = 40;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
if (true) return _canusepreparedtransition(_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,"track","track","crossfade");
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return false;
}
public boolean  _canstartpreparedafterad(b4a.example.playbackruntimestate _runtimestate,b4a.example.playbackmetastate _metastate,b4a.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub CanStartPreparedAfterAd(runtimeState As";
 //BA.debugLineNum = 48;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
if (true) return _canusepreparedtransition(_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,"ad","track","ad_to_track");
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return false;
}
public boolean  _canstartpreparedontracktail(b4a.example.playbackruntimestate _runtimestate,b4a.example.playbackmetastate _metastate,b4a.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub CanStartPreparedOnTrackTail(runtimeStat";
 //BA.debugLineNum = 44;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
if (true) return _canusepreparedtransition(_runtimestate,_metastate,_orchestrationstate,_transitioninprogress,"track","ad","tail_start");
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return false;
}
public boolean  _canusepreparedtransition(b4a.example.playbackruntimestate _runtimestate,b4a.example.playbackmetastate _metastate,b4a.example.playbackorchestrationstate _orchestrationstate,boolean _transitioninprogress,String _currenttype,String _preparedtype,String _decisionname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
 //BA.debugLineNum = 30;BA.debugLine="Public Sub CanUsePreparedTransition(runtimeState A";
 //BA.debugLineNum = 31;BA.debugLine="If transitionInProgress Then Return False";
if (_transitioninprogress) { 
if (true) return __c.False;};
 //BA.debugLineNum = 32;BA.debugLine="If orchestrationState.IsCrossfadeTriggered Then R";
if (_orchestrationstate._iscrossfadetriggered /*boolean*/ ) { 
if (true) return __c.False;};
 //BA.debugLineNum = 33;BA.debugLine="If metaState.CurrentMediaType <> currentType Then";
if ((_metastate._currentmediatype /*String*/ ).equals(_currenttype) == false) { 
if (true) return __c.False;};
 //BA.debugLineNum = 34;BA.debugLine="If HasUsablePreparedItem(runtimeState) = False Th";
if (_hasusableprepareditem(_runtimestate)==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 35;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = _targetpage._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 36;BA.debugLine="Return preparedItem.GetDefault(\"type\", \"\") = prep";
if (true) return (_prepareditem.GetDefault((Object)("type"),(Object)(""))).equals((Object)(_preparedtype));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private targetPage As B4XMainPage";
_targetpage = new b4a.example.b4xmainpage();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
 //BA.debugLineNum = 325;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
 //BA.debugLineNum = 326;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 327;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
 //BA.debugLineNum = 328;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
 //BA.debugLineNum = 329;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
 //BA.debugLineNum = 330;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
 //BA.debugLineNum = 332;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public String  _describeitem(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Private Sub DescribeItem(item As Map) As String";
 //BA.debugLineNum = 313;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 314;BA.debugLine="Return targetPage.Transition_DescribeItem(item)";
if (true) return _targetpage._transition_describeitem /*String*/ (_item);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public String  _getinactiveaudiokey(b4a.example.playbackruntimestate _runtimestate) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub GetInactiveAudioKey(runtimeState As Pla";
 //BA.debugLineNum = 15;BA.debugLine="If targetPage.Transition_GetDirectorActiveAudioKe";
if ((_targetpage._transition_getdirectoractiveaudiokey /*String*/ ()).equals("primary")) { 
if (true) return "secondary";};
 //BA.debugLineNum = 16;BA.debugLine="Return \"primary\"";
if (true) return "primary";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public boolean  _hasusableprepareditem(b4a.example.playbackruntimestate _runtimestate) throws Exception{
String _preparedaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
String _preparedtype = "";
 //BA.debugLineNum = 20;BA.debugLine="Public Sub HasUsablePreparedItem(runtimeState As P";
 //BA.debugLineNum = 21;BA.debugLine="Dim preparedAudioKey As String = targetPage.Trans";
_preparedaudiokey = _targetpage._transition_getdirectorpreparedaudiokey /*String*/ ();
 //BA.debugLineNum = 22;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = _targetpage._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 23;BA.debugLine="If preparedAudioKey = \"\" Then Return False";
if ((_preparedaudiokey).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 24;BA.debugLine="If preparedItem.IsInitialized = False Then Return";
if (_prepareditem.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 25;BA.debugLine="Dim preparedType As String = preparedItem.GetDefa";
_preparedtype = BA.ObjectToString(_prepareditem.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 26;BA.debugLine="Return preparedType = \"track\" Or preparedType = \"";
if (true) return (_preparedtype).equals("track") || (_preparedtype).equals("ad");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,b4a.example.b4xmainpage _targetpagevalue) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(targetPageValue As B4XMainPa";
 //BA.debugLineNum = 10;BA.debugLine="targetPage = targetPageValue";
_targetpage = _targetpagevalue;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public boolean  _itemsmatch(anywheresoftware.b4a.objects.collections.Map _firstitem,anywheresoftware.b4a.objects.collections.Map _seconditem) throws Exception{
anywheresoftware.b4a.objects.collections.Map _args = null;
 //BA.debugLineNum = 317;BA.debugLine="Private Sub ItemsMatch(firstItem As Map, secondIte";
 //BA.debugLineNum = 318;BA.debugLine="Dim args As Map";
_args = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 319;BA.debugLine="args.Initialize";
_args.Initialize();
 //BA.debugLineNum = 320;BA.debugLine="args.Put(\"first\", firstItem)";
_args.Put((Object)("first"),(Object)(_firstitem.getObject()));
 //BA.debugLineNum = 321;BA.debugLine="args.Put(\"second\", secondItem)";
_args.Put((Object)("second"),(Object)(_seconditem.getObject()));
 //BA.debugLineNum = 322;BA.debugLine="Return targetPage.Transition_ItemsMatch(args)";
if (true) return _targetpage._transition_itemsmatch /*boolean*/ (_args);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return false;
}
public int  _preparedfadeoutms(b4a.example.playbackmetastate _metastate,b4a.example.playbackruntimestate _runtimestate,int _trackoverlapms,int _adtailoverlapms) throws Exception{
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
String _nexttype = "";
 //BA.debugLineNum = 51;BA.debugLine="Public Sub PreparedFadeOutMs(metaState As Playback";
 //BA.debugLineNum = 52;BA.debugLine="If metaState.CurrentMediaType <> \"track\" Then Ret";
if ((_metastate._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 53;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = _targetpage._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 54;BA.debugLine="If preparedItem.IsInitialized = False Then Return";
if (_prepareditem.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 55;BA.debugLine="Dim nextType As String = preparedItem.GetDefault(";
_nexttype = BA.ObjectToString(_prepareditem.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 56;BA.debugLine="If nextType = \"track\" Then Return trackOverlapMs";
if ((_nexttype).equals("track")) { 
if (true) return _trackoverlapms;};
 //BA.debugLineNum = 57;BA.debugLine="If nextType = \"ad\" Then Return adTailOverlapMs";
if ((_nexttype).equals("ad")) { 
if (true) return _adtailoverlapms;};
 //BA.debugLineNum = 58;BA.debugLine="Return 0";
if (true) return (int) (0);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparenextplayable(anywheresoftware.b4a.objects.collections.List _playqueue,b4a.example.playbackruntimestate _runtimestate,b4a.example.playbackmetastate _metastate,b4a.example.playbackorchestrationstate _orchestrationstate,b4a.example.mediacache _mediacacheservice,String _playbackflowstate,String _flowplaying,String _flowidle,String _flowpreparing) throws Exception{
ResumableSub_PrepareNextPlayable rsub = new ResumableSub_PrepareNextPlayable(this,_playqueue,_runtimestate,_metastate,_orchestrationstate,_mediacacheservice,_playbackflowstate,_flowplaying,_flowidle,_flowpreparing);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareNextPlayable extends BA.ResumableSub {
public ResumableSub_PrepareNextPlayable(b4a.example.playbacktransitioncoordinator parent,anywheresoftware.b4a.objects.collections.List _playqueue,b4a.example.playbackruntimestate _runtimestate,b4a.example.playbackmetastate _metastate,b4a.example.playbackorchestrationstate _orchestrationstate,b4a.example.mediacache _mediacacheservice,String _playbackflowstate,String _flowplaying,String _flowidle,String _flowpreparing) {
this.parent = parent;
this._playqueue = _playqueue;
this._runtimestate = _runtimestate;
this._metastate = _metastate;
this._orchestrationstate = _orchestrationstate;
this._mediacacheservice = _mediacacheservice;
this._playbackflowstate = _playbackflowstate;
this._flowplaying = _flowplaying;
this._flowidle = _flowidle;
this._flowpreparing = _flowpreparing;
}
b4a.example.playbacktransitioncoordinator parent;
anywheresoftware.b4a.objects.collections.List _playqueue;
b4a.example.playbackruntimestate _runtimestate;
b4a.example.playbackmetastate _metastate;
b4a.example.playbackorchestrationstate _orchestrationstate;
b4a.example.mediacache _mediacacheservice;
String _playbackflowstate;
String _flowplaying;
String _flowidle;
String _flowpreparing;
int _candidateindex = 0;
int _scanindex = 0;
Object _nextobject = null;
anywheresoftware.b4a.objects.collections.Map _candidateitem = null;
String _candidatetype = "";
anywheresoftware.b4a.objects.collections.Map _breakcandidate = null;
anywheresoftware.b4a.objects.collections.Map _activeitem = null;
anywheresoftware.b4a.objects.collections.Map _nextitem = null;
anywheresoftware.b4a.objects.collections.Map _breakprepareditem = null;
anywheresoftware.b4a.objects.collections.Map _existingprepareditem = null;
String _existingpreparedaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _matchargs = null;
String _targetaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _pendingplayitem = null;
anywheresoftware.b4a.objects.collections.Map _pendingprepareitem = null;
anywheresoftware.b4a.objects.collections.Map _pendingprepareargs = null;
String _previousflowstate = "";
anywheresoftware.b4a.objects.collections.Map _flowargs = null;
anywheresoftware.b4a.objects.collections.Map _mediaargs = null;
String _nextitemurl = "";
double _volume = 0;
b4a.example.audioplayer _targetaudio = null;
anywheresoftware.b4a.objects.collections.Map _waitargs = null;
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.Map _readyargs = null;
anywheresoftware.b4a.objects.collections.Map _failedargs = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 63;BA.debugLine="Dim candidateIndex As Int = -1";
_candidateindex = (int) (-1);
 //BA.debugLineNum = 64;BA.debugLine="Do While playQueue.Size > 0";
if (true) break;

case 1:
//do while
this.state = 47;
while (_playqueue.getSize()>0) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 65;BA.debugLine="Dim scanIndex As Int = candidateIndex + 1";
_scanindex = (int) (_candidateindex+1);
 //BA.debugLineNum = 66;BA.debugLine="If scanIndex < 0 Then scanIndex = 0";
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
 //BA.debugLineNum = 67;BA.debugLine="If scanIndex >= playQueue.Size Then Return False";
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
 //BA.debugLineNum = 68;BA.debugLine="Dim nextObject As Object = playQueue.Get(scanInd";
_nextobject = _playqueue.Get(_scanindex);
 //BA.debugLineNum = 69;BA.debugLine="If nextObject Is Map Then";
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
 //BA.debugLineNum = 71;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 21:
//C
this.state = 22;
;
 //BA.debugLineNum = 73;BA.debugLine="Dim candidateItem As Map = nextObject";
_candidateitem = new anywheresoftware.b4a.objects.collections.Map();
_candidateitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_nextobject));
 //BA.debugLineNum = 74;BA.debugLine="Dim candidateType As String = candidateItem.GetD";
_candidatetype = BA.ObjectToString(_candidateitem.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 75;BA.debugLine="If candidateType = \"break\" Then";
if (true) break;

case 22:
//if
this.state = 31;
if ((_candidatetype).equals("break")) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 76;BA.debugLine="Dim breakCandidate As Map = targetPage.Transiti";
_breakcandidate = new anywheresoftware.b4a.objects.collections.Map();
_breakcandidate = parent._targetpage._transition_peekbreakpreparedcandidate /*anywheresoftware.b4a.objects.collections.Map*/ (_candidateitem);
 //BA.debugLineNum = 77;BA.debugLine="If breakCandidate.IsInitialized And breakCandid";
if (true) break;

case 25:
//if
this.state = 30;
if (_breakcandidate.IsInitialized() && _breakcandidate.getSize()>0) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
 //BA.debugLineNum = 78;BA.debugLine="candidateItem = breakCandidate";
_candidateitem = _breakcandidate;
 //BA.debugLineNum = 79;BA.debugLine="candidateType = candidateItem.GetDefault(\"type";
_candidatetype = BA.ObjectToString(_candidateitem.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 80;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 82;BA.debugLine="Trace(\"prefetch skip reason=break_ahead item=\"";
parent._trace("prefetch skip reason=break_ahead item="+parent._describeitem(_candidateitem));
 //BA.debugLineNum = 83;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
 //BA.debugLineNum = 84;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
 //BA.debugLineNum = 87;BA.debugLine="If candidateType <> \"track\" And candidateType <>";

case 31:
//if
this.state = 36;
if ((_candidatetype).equals("track") == false && (_candidatetype).equals("ad") == false) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 36:
//C
this.state = 37;
;
 //BA.debugLineNum = 88;BA.debugLine="Dim activeItem As Map = targetPage.Transition_Ge";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = parent._targetpage._transition_getdirectoractiveitem /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 89;BA.debugLine="If ItemsMatch(activeItem, candidateItem) Then";
if (true) break;

case 37:
//if
this.state = 40;
if (parent._itemsmatch(_activeitem,_candidateitem)) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 //BA.debugLineNum = 90;BA.debugLine="Trace(\"prefetch skip reason=active_item item=\"";
parent._trace("prefetch skip reason=active_item item="+parent._describeitem(_candidateitem));
 //BA.debugLineNum = 91;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
 //BA.debugLineNum = 92;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;
;
 //BA.debugLineNum = 94;BA.debugLine="If candidateType = \"track\" And mediaCacheService";

case 40:
//if
this.state = 43;
if ((_candidatetype).equals("track") && _mediacacheservice._istrackcached /*boolean*/ (BA.ObjectToString(_candidateitem.GetDefault((Object)("id"),(Object)(""))))==parent.__c.False) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 //BA.debugLineNum = 95;BA.debugLine="Trace(\"prefetch skip reason=no_local_track item";
parent._trace("prefetch skip reason=no_local_track item="+parent._describeitem(_candidateitem));
 //BA.debugLineNum = 96;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
 //BA.debugLineNum = 97;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;
;
 //BA.debugLineNum = 99;BA.debugLine="If candidateType = \"ad\" And mediaCacheService.Is";

case 43:
//if
this.state = 46;
if ((_candidatetype).equals("ad") && _mediacacheservice._isadcached /*boolean*/ (BA.ObjectToString(_candidateitem.GetDefault((Object)("id"),(Object)(""))))==parent.__c.False) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 //BA.debugLineNum = 100;BA.debugLine="Trace(\"prefetch skip reason=no_local_ad item=\"";
parent._trace("prefetch skip reason=no_local_ad item="+parent._describeitem(_candidateitem));
 //BA.debugLineNum = 101;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
 //BA.debugLineNum = 102;BA.debugLine="Continue";
this.state = 1;
if (true) break;;
 if (true) break;

case 46:
//C
this.state = 1;
;
 //BA.debugLineNum = 104;BA.debugLine="candidateIndex = scanIndex";
_candidateindex = _scanindex;
 //BA.debugLineNum = 105;BA.debugLine="Exit";
this.state = 47;
if (true) break;
 if (true) break;
;
 //BA.debugLineNum = 107;BA.debugLine="If candidateIndex < 0 Or candidateIndex >= playQu";

case 47:
//if
this.state = 52;
if (_candidateindex<0 || _candidateindex>=_playqueue.getSize()) { 
this.state = 49;
;}if (true) break;

case 49:
//C
this.state = 52;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 52:
//C
this.state = 53;
;
 //BA.debugLineNum = 108;BA.debugLine="Dim nextItem As Map = playQueue.Get(candidateInde";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playqueue.Get(_candidateindex)));
 //BA.debugLineNum = 109;BA.debugLine="If nextItem.GetDefault(\"type\", \"\") = \"break\" Then";
if (true) break;

case 53:
//if
this.state = 62;
if ((_nextitem.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break"))) { 
this.state = 55;
}if (true) break;

case 55:
//C
this.state = 56;
 //BA.debugLineNum = 110;BA.debugLine="Dim breakPreparedItem As Map = targetPage.Transi";
_breakprepareditem = new anywheresoftware.b4a.objects.collections.Map();
_breakprepareditem = parent._targetpage._transition_peekbreakpreparedcandidate /*anywheresoftware.b4a.objects.collections.Map*/ (_nextitem);
 //BA.debugLineNum = 111;BA.debugLine="If breakPreparedItem.IsInitialized And breakPrep";
if (true) break;

case 56:
//if
this.state = 61;
if (_breakprepareditem.IsInitialized() && _breakprepareditem.getSize()>0) { 
this.state = 58;
}else {
this.state = 60;
}if (true) break;

case 58:
//C
this.state = 61;
 //BA.debugLineNum = 112;BA.debugLine="nextItem = breakPreparedItem";
_nextitem = _breakprepareditem;
 if (true) break;

case 60:
//C
this.state = 61;
 //BA.debugLineNum = 114;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 61:
//C
this.state = 62;
;
 if (true) break;

case 62:
//C
this.state = 63;
;
 //BA.debugLineNum = 117;BA.debugLine="Dim existingPreparedItem As Map = targetPage.Tran";
_existingprepareditem = new anywheresoftware.b4a.objects.collections.Map();
_existingprepareditem = parent._targetpage._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 118;BA.debugLine="Dim existingPreparedAudioKey As String = targetPa";
_existingpreparedaudiokey = parent._targetpage._transition_getdirectorpreparedaudiokey /*String*/ ();
 //BA.debugLineNum = 119;BA.debugLine="If existingPreparedItem.IsInitialized And existin";
if (true) break;

case 63:
//if
this.state = 70;
if (_existingprepareditem.IsInitialized() && (_existingpreparedaudiokey).equals("") == false) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 //BA.debugLineNum = 120;BA.debugLine="Dim matchArgs As Map";
_matchargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 121;BA.debugLine="matchArgs.Initialize";
_matchargs.Initialize();
 //BA.debugLineNum = 122;BA.debugLine="matchArgs.Put(\"first\", existingPreparedItem)";
_matchargs.Put((Object)("first"),(Object)(_existingprepareditem.getObject()));
 //BA.debugLineNum = 123;BA.debugLine="matchArgs.Put(\"second\", nextItem)";
_matchargs.Put((Object)("second"),(Object)(_nextitem.getObject()));
 //BA.debugLineNum = 124;BA.debugLine="If targetPage.Transition_ItemsMatch(matchArgs) T";
if (true) break;

case 66:
//if
this.state = 69;
if (parent._targetpage._transition_itemsmatch /*boolean*/ (_matchargs)) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
 //BA.debugLineNum = 125;BA.debugLine="Trace(\"prefetch reuse prepared item=\" & Describ";
parent._trace("prefetch reuse prepared item="+parent._describeitem(_nextitem));
 //BA.debugLineNum = 126;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 69:
//C
this.state = 70;
;
 if (true) break;

case 70:
//C
this.state = 71;
;
 //BA.debugLineNum = 129;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
_targetaudiokey = parent._getinactiveaudiokey(_runtimestate);
 //BA.debugLineNum = 130;BA.debugLine="Dim pendingPlayItem As Map = targetPage.Transitio";
_pendingplayitem = new anywheresoftware.b4a.objects.collections.Map();
_pendingplayitem = parent._targetpage._transition_getdirectorpendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ (_targetaudiokey);
 //BA.debugLineNum = 131;BA.debugLine="If pendingPlayItem.IsInitialized And pendingPlayI";
if (true) break;

case 71:
//if
this.state = 74;
if (_pendingplayitem.IsInitialized() && _pendingplayitem.getSize()>0) { 
this.state = 73;
}if (true) break;

case 73:
//C
this.state = 74;
 //BA.debugLineNum = 132;BA.debugLine="Trace(\"prefetch skip reason=target_audio_pending";
parent._trace("prefetch skip reason=target_audio_pending_play audio="+_targetaudiokey+" item="+parent._describeitem(_pendingplayitem));
 //BA.debugLineNum = 133;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 74:
//C
this.state = 75;
;
 //BA.debugLineNum = 135;BA.debugLine="Dim pendingPrepareItem As Map = targetPage.Transi";
_pendingprepareitem = new anywheresoftware.b4a.objects.collections.Map();
_pendingprepareitem = parent._targetpage._transition_getdirectorpendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ (_targetaudiokey);
 //BA.debugLineNum = 136;BA.debugLine="If pendingPrepareItem.IsInitialized And pendingPr";
if (true) break;

case 75:
//if
this.state = 78;
if (_pendingprepareitem.IsInitialized() && _pendingprepareitem.getSize()>0) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
 //BA.debugLineNum = 137;BA.debugLine="Trace(\"prefetch skip reason=target_audio_pending";
parent._trace("prefetch skip reason=target_audio_pending_prepare audio="+_targetaudiokey+" item="+parent._describeitem(_pendingprepareitem));
 //BA.debugLineNum = 138;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 78:
//C
this.state = 79;
;
 //BA.debugLineNum = 140;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
parent._targetpage._transition_clearpreparedstate /*String*/ (parent.__c.False);
 //BA.debugLineNum = 141;BA.debugLine="Dim pendingPrepareArgs As Map";
_pendingprepareargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 142;BA.debugLine="pendingPrepareArgs.Initialize";
_pendingprepareargs.Initialize();
 //BA.debugLineNum = 143;BA.debugLine="pendingPrepareArgs.Put(\"audioKey\", targetAudioKey";
_pendingprepareargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
 //BA.debugLineNum = 144;BA.debugLine="pendingPrepareArgs.Put(\"item\", nextItem)";
_pendingprepareargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
 //BA.debugLineNum = 145;BA.debugLine="targetPage.Transition_SetDirectorPendingPrepare(p";
parent._targetpage._transition_setdirectorpendingprepare /*String*/ (_pendingprepareargs);
 //BA.debugLineNum = 146;BA.debugLine="Dim previousFlowState As String = playbackFlowSta";
_previousflowstate = _playbackflowstate;
 //BA.debugLineNum = 147;BA.debugLine="If playbackFlowState = flowPlaying Or playbackFlo";
if (true) break;

case 79:
//if
this.state = 82;
if ((_playbackflowstate).equals(_flowplaying) || (_playbackflowstate).equals(_flowidle)) { 
this.state = 81;
}if (true) break;

case 81:
//C
this.state = 82;
 //BA.debugLineNum = 148;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 149;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
 //BA.debugLineNum = 150;BA.debugLine="flowArgs.Put(\"state\", flowPreparing)";
_flowargs.Put((Object)("state"),(Object)(_flowpreparing));
 //BA.debugLineNum = 151;BA.debugLine="flowArgs.Put(\"reason\", \"prepare_next:\" & nextIte";
_flowargs.Put((Object)("reason"),(Object)("prepare_next:"+BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")))));
 //BA.debugLineNum = 152;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowA";
parent._targetpage._transition_setplaybackflowstate /*String*/ (_flowargs);
 if (true) break;

case 82:
//C
this.state = 83;
;
 //BA.debugLineNum = 154;BA.debugLine="Dim mediaArgs As Map";
_mediaargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 155;BA.debugLine="mediaArgs.Initialize";
_mediaargs.Initialize();
 //BA.debugLineNum = 156;BA.debugLine="mediaArgs.Put(\"audioKey\", targetAudioKey)";
_mediaargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
 //BA.debugLineNum = 157;BA.debugLine="mediaArgs.Put(\"item\", nextItem)";
_mediaargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
 //BA.debugLineNum = 158;BA.debugLine="Dim nextItemUrl As String = targetPage.Transition";
_nextitemurl = parent._targetpage._transition_resolveplaybackmediaurl /*String*/ (_mediaargs);
 //BA.debugLineNum = 159;BA.debugLine="If nextItemUrl = \"\" Then";
if (true) break;

case 83:
//if
this.state = 86;
if ((_nextitemurl).equals("")) { 
this.state = 85;
}if (true) break;

case 85:
//C
this.state = 86;
 //BA.debugLineNum = 160;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetAu";
parent._trace("переход preload ошибка audio="+_targetaudiokey+" message=empty_media_url");
 //BA.debugLineNum = 161;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 86:
//C
this.state = 87;
;
 //BA.debugLineNum = 163;BA.debugLine="Trace(\"prefetch load audio=\" & targetAudioKey & \"";
parent._trace("prefetch load audio="+_targetaudiokey+" item="+parent._describeitem(_nextitem));
 //BA.debugLineNum = 164;BA.debugLine="Dim volume As Double = targetPage.Transition_Curr";
_volume = parent._targetpage._transition_currentvolume /*double*/ (_nextitem);
 //BA.debugLineNum = 165;BA.debugLine="Dim targetAudio As AudioPlayer = targetPage.Trans";
_targetaudio = parent._targetpage._transition_getaudiobykey /*b4a.example.audioplayer*/ (_targetaudiokey);
 //BA.debugLineNum = 166;BA.debugLine="targetAudio.LoadUrl(nextItemUrl, volume)";
_targetaudio._loadurl /*String*/ (_nextitemurl,_volume);
 //BA.debugLineNum = 167;BA.debugLine="Dim waitArgs As Map";
_waitargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 168;BA.debugLine="waitArgs.Initialize";
_waitargs.Initialize();
 //BA.debugLineNum = 169;BA.debugLine="waitArgs.Put(\"audioKey\", targetAudioKey)";
_waitargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
 //BA.debugLineNum = 170;BA.debugLine="waitArgs.Put(\"item\", nextItem)";
_waitargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
 //BA.debugLineNum = 171;BA.debugLine="waitArgs.Put(\"timeoutMs\", 5000)";
_waitargs.Put((Object)("timeoutMs"),(Object)(5000));
 //BA.debugLineNum = 172;BA.debugLine="Wait For (targetPage.Transition_WaitForPreparedAu";
parent.__c.WaitFor("complete", ba, this, parent._targetpage._transition_waitforpreparedaudio /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_waitargs));
this.state = 97;
return;
case 97:
//C
this.state = 87;
_result = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 173;BA.debugLine="If targetPage.Transition_GetPlaybackFlowState = f";
if (true) break;

case 87:
//if
this.state = 96;
if ((parent._targetpage._transition_getplaybackflowstate /*String*/ ()).equals(_flowpreparing)) { 
this.state = 89;
}if (true) break;

case 89:
//C
this.state = 90;
 //BA.debugLineNum = 174;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
if (true) break;

case 90:
//if
this.state = 95;
if (BA.ObjectToBoolean(_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)))) { 
this.state = 92;
}else {
this.state = 94;
}if (true) break;

case 92:
//C
this.state = 95;
 //BA.debugLineNum = 175;BA.debugLine="Dim readyArgs As Map";
_readyargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 176;BA.debugLine="readyArgs.Initialize";
_readyargs.Initialize();
 //BA.debugLineNum = 177;BA.debugLine="readyArgs.Put(\"state\", previousFlowState)";
_readyargs.Put((Object)("state"),(Object)(_previousflowstate));
 //BA.debugLineNum = 178;BA.debugLine="readyArgs.Put(\"reason\", \"prepare_ready\")";
_readyargs.Put((Object)("reason"),(Object)("prepare_ready"));
 //BA.debugLineNum = 179;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(read";
parent._targetpage._transition_setplaybackflowstate /*String*/ (_readyargs);
 //BA.debugLineNum = 180;BA.debugLine="Trace(\"prefetch prepared audio=\" & targetAudioK";
parent._trace("prefetch prepared audio="+_targetaudiokey+" item="+parent._describeitem(_nextitem));
 if (true) break;

case 94:
//C
this.state = 95;
 //BA.debugLineNum = 182;BA.debugLine="Dim failedArgs As Map";
_failedargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 183;BA.debugLine="failedArgs.Initialize";
_failedargs.Initialize();
 //BA.debugLineNum = 184;BA.debugLine="failedArgs.Put(\"state\", \"error\")";
_failedargs.Put((Object)("state"),(Object)("error"));
 //BA.debugLineNum = 185;BA.debugLine="failedArgs.Put(\"reason\", \"prepare_failed\")";
_failedargs.Put((Object)("reason"),(Object)("prepare_failed"));
 //BA.debugLineNum = 186;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(fail";
parent._targetpage._transition_setplaybackflowstate /*String*/ (_failedargs);
 //BA.debugLineNum = 187;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetA";
parent._trace("переход preload ошибка audio="+_targetaudiokey);
 if (true) break;

case 95:
//C
this.state = 96;
;
 if (true) break;

case 96:
//C
this.state = -1;
;
 //BA.debugLineNum = 190;BA.debugLine="Return result.GetDefault(\"Success\", False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)));return;};
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(anywheresoftware.b4a.objects.collections.Map _result) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparespecificplayable(anywheresoftware.b4a.objects.collections.Map _nextitem,b4a.example.playbackruntimestate _runtimestate,b4a.example.playbackmetastate _metastate,b4a.example.playbackorchestrationstate _orchestrationstate,String _playbackflowstate,String _flowplaying,String _flowidle,String _flowpreparing) throws Exception{
ResumableSub_PrepareSpecificPlayable rsub = new ResumableSub_PrepareSpecificPlayable(this,_nextitem,_runtimestate,_metastate,_orchestrationstate,_playbackflowstate,_flowplaying,_flowidle,_flowpreparing);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareSpecificPlayable extends BA.ResumableSub {
public ResumableSub_PrepareSpecificPlayable(b4a.example.playbacktransitioncoordinator parent,anywheresoftware.b4a.objects.collections.Map _nextitem,b4a.example.playbackruntimestate _runtimestate,b4a.example.playbackmetastate _metastate,b4a.example.playbackorchestrationstate _orchestrationstate,String _playbackflowstate,String _flowplaying,String _flowidle,String _flowpreparing) {
this.parent = parent;
this._nextitem = _nextitem;
this._runtimestate = _runtimestate;
this._metastate = _metastate;
this._orchestrationstate = _orchestrationstate;
this._playbackflowstate = _playbackflowstate;
this._flowplaying = _flowplaying;
this._flowidle = _flowidle;
this._flowpreparing = _flowpreparing;
}
b4a.example.playbacktransitioncoordinator parent;
anywheresoftware.b4a.objects.collections.Map _nextitem;
b4a.example.playbackruntimestate _runtimestate;
b4a.example.playbackmetastate _metastate;
b4a.example.playbackorchestrationstate _orchestrationstate;
String _playbackflowstate;
String _flowplaying;
String _flowidle;
String _flowpreparing;
anywheresoftware.b4a.objects.collections.Map _existingprepareditem = null;
String _existingpreparedaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _matchargs = null;
String _targetaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _pendingplayitem = null;
anywheresoftware.b4a.objects.collections.Map _pendingprepareitem = null;
anywheresoftware.b4a.objects.collections.Map _pendingprepareargs = null;
String _previousflowstate = "";
anywheresoftware.b4a.objects.collections.Map _flowargs = null;
anywheresoftware.b4a.objects.collections.Map _mediaargs = null;
String _nextitemurl = "";
double _volume = 0;
b4a.example.audioplayer _targetaudio = null;
anywheresoftware.b4a.objects.collections.Map _waitargs = null;
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.Map _readyargs = null;
anywheresoftware.b4a.objects.collections.Map _failedargs = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 194;BA.debugLine="If nextItem.IsInitialized = False Or nextItem.Siz";
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
 //BA.debugLineNum = 195;BA.debugLine="Dim existingPreparedItem As Map = targetPage.Tran";
_existingprepareditem = new anywheresoftware.b4a.objects.collections.Map();
_existingprepareditem = parent._targetpage._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 196;BA.debugLine="Dim existingPreparedAudioKey As String = targetPa";
_existingpreparedaudiokey = parent._targetpage._transition_getdirectorpreparedaudiokey /*String*/ ();
 //BA.debugLineNum = 197;BA.debugLine="If existingPreparedItem.IsInitialized And existin";
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
 //BA.debugLineNum = 198;BA.debugLine="Dim matchArgs As Map";
_matchargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 199;BA.debugLine="matchArgs.Initialize";
_matchargs.Initialize();
 //BA.debugLineNum = 200;BA.debugLine="matchArgs.Put(\"first\", existingPreparedItem)";
_matchargs.Put((Object)("first"),(Object)(_existingprepareditem.getObject()));
 //BA.debugLineNum = 201;BA.debugLine="matchArgs.Put(\"second\", nextItem)";
_matchargs.Put((Object)("second"),(Object)(_nextitem.getObject()));
 //BA.debugLineNum = 202;BA.debugLine="If targetPage.Transition_ItemsMatch(matchArgs) T";
if (true) break;

case 10:
//if
this.state = 13;
if (parent._targetpage._transition_itemsmatch /*boolean*/ (_matchargs)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 203;BA.debugLine="Trace(\"prefetch reuse prepared item=\" & Describ";
parent._trace("prefetch reuse prepared item="+parent._describeitem(_nextitem));
 //BA.debugLineNum = 204;BA.debugLine="Return True";
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
 //BA.debugLineNum = 207;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
_targetaudiokey = parent._getinactiveaudiokey(_runtimestate);
 //BA.debugLineNum = 208;BA.debugLine="Dim pendingPlayItem As Map = targetPage.Transitio";
_pendingplayitem = new anywheresoftware.b4a.objects.collections.Map();
_pendingplayitem = parent._targetpage._transition_getdirectorpendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ (_targetaudiokey);
 //BA.debugLineNum = 209;BA.debugLine="If pendingPlayItem.IsInitialized And pendingPlayI";
if (true) break;

case 15:
//if
this.state = 18;
if (_pendingplayitem.IsInitialized() && _pendingplayitem.getSize()>0) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 210;BA.debugLine="Trace(\"prefetch skip reason=target_audio_pending";
parent._trace("prefetch skip reason=target_audio_pending_play audio="+_targetaudiokey+" item="+parent._describeitem(_pendingplayitem));
 //BA.debugLineNum = 211;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 //BA.debugLineNum = 213;BA.debugLine="Dim pendingPrepareItem As Map = targetPage.Transi";
_pendingprepareitem = new anywheresoftware.b4a.objects.collections.Map();
_pendingprepareitem = parent._targetpage._transition_getdirectorpendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ (_targetaudiokey);
 //BA.debugLineNum = 214;BA.debugLine="If pendingPrepareItem.IsInitialized And pendingPr";
if (true) break;

case 19:
//if
this.state = 22;
if (_pendingprepareitem.IsInitialized() && _pendingprepareitem.getSize()>0) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 215;BA.debugLine="Trace(\"prefetch skip reason=target_audio_pending";
parent._trace("prefetch skip reason=target_audio_pending_prepare audio="+_targetaudiokey+" item="+parent._describeitem(_pendingprepareitem));
 //BA.debugLineNum = 216;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
 //BA.debugLineNum = 218;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
parent._targetpage._transition_clearpreparedstate /*String*/ (parent.__c.False);
 //BA.debugLineNum = 219;BA.debugLine="Dim pendingPrepareArgs As Map";
_pendingprepareargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 220;BA.debugLine="pendingPrepareArgs.Initialize";
_pendingprepareargs.Initialize();
 //BA.debugLineNum = 221;BA.debugLine="pendingPrepareArgs.Put(\"audioKey\", targetAudioKey";
_pendingprepareargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
 //BA.debugLineNum = 222;BA.debugLine="pendingPrepareArgs.Put(\"item\", nextItem)";
_pendingprepareargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
 //BA.debugLineNum = 223;BA.debugLine="targetPage.Transition_SetDirectorPendingPrepare(p";
parent._targetpage._transition_setdirectorpendingprepare /*String*/ (_pendingprepareargs);
 //BA.debugLineNum = 224;BA.debugLine="Dim previousFlowState As String = playbackFlowSta";
_previousflowstate = _playbackflowstate;
 //BA.debugLineNum = 225;BA.debugLine="If playbackFlowState = flowPlaying Or playbackFlo";
if (true) break;

case 23:
//if
this.state = 26;
if ((_playbackflowstate).equals(_flowplaying) || (_playbackflowstate).equals(_flowidle)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 226;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 227;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
 //BA.debugLineNum = 228;BA.debugLine="flowArgs.Put(\"state\", flowPreparing)";
_flowargs.Put((Object)("state"),(Object)(_flowpreparing));
 //BA.debugLineNum = 229;BA.debugLine="flowArgs.Put(\"reason\", \"prepare_direct:\" & nextI";
_flowargs.Put((Object)("reason"),(Object)("prepare_direct:"+BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")))));
 //BA.debugLineNum = 230;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowA";
parent._targetpage._transition_setplaybackflowstate /*String*/ (_flowargs);
 if (true) break;

case 26:
//C
this.state = 27;
;
 //BA.debugLineNum = 232;BA.debugLine="Dim mediaArgs As Map";
_mediaargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 233;BA.debugLine="mediaArgs.Initialize";
_mediaargs.Initialize();
 //BA.debugLineNum = 234;BA.debugLine="mediaArgs.Put(\"audioKey\", targetAudioKey)";
_mediaargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
 //BA.debugLineNum = 235;BA.debugLine="mediaArgs.Put(\"item\", nextItem)";
_mediaargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
 //BA.debugLineNum = 236;BA.debugLine="Dim nextItemUrl As String = targetPage.Transition";
_nextitemurl = parent._targetpage._transition_resolveplaybackmediaurl /*String*/ (_mediaargs);
 //BA.debugLineNum = 237;BA.debugLine="If nextItemUrl = \"\" Then";
if (true) break;

case 27:
//if
this.state = 30;
if ((_nextitemurl).equals("")) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 238;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetAu";
parent._trace("переход preload ошибка audio="+_targetaudiokey+" message=empty_media_url");
 //BA.debugLineNum = 239;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 241;BA.debugLine="Trace(\"prefetch load audio=\" & targetAudioKey & \"";
parent._trace("prefetch load audio="+_targetaudiokey+" item="+parent._describeitem(_nextitem));
 //BA.debugLineNum = 242;BA.debugLine="Dim volume As Double = targetPage.Transition_Curr";
_volume = parent._targetpage._transition_currentvolume /*double*/ (_nextitem);
 //BA.debugLineNum = 243;BA.debugLine="Dim targetAudio As AudioPlayer = targetPage.Trans";
_targetaudio = parent._targetpage._transition_getaudiobykey /*b4a.example.audioplayer*/ (_targetaudiokey);
 //BA.debugLineNum = 244;BA.debugLine="targetAudio.LoadUrl(nextItemUrl, volume)";
_targetaudio._loadurl /*String*/ (_nextitemurl,_volume);
 //BA.debugLineNum = 245;BA.debugLine="Dim waitArgs As Map";
_waitargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 246;BA.debugLine="waitArgs.Initialize";
_waitargs.Initialize();
 //BA.debugLineNum = 247;BA.debugLine="waitArgs.Put(\"audioKey\", targetAudioKey)";
_waitargs.Put((Object)("audioKey"),(Object)(_targetaudiokey));
 //BA.debugLineNum = 248;BA.debugLine="waitArgs.Put(\"item\", nextItem)";
_waitargs.Put((Object)("item"),(Object)(_nextitem.getObject()));
 //BA.debugLineNum = 249;BA.debugLine="waitArgs.Put(\"timeoutMs\", 5000)";
_waitargs.Put((Object)("timeoutMs"),(Object)(5000));
 //BA.debugLineNum = 250;BA.debugLine="Wait For (targetPage.Transition_WaitForPreparedAu";
parent.__c.WaitFor("complete", ba, this, parent._targetpage._transition_waitforpreparedaudio /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_waitargs));
this.state = 41;
return;
case 41:
//C
this.state = 31;
_result = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 251;BA.debugLine="If targetPage.Transition_GetPlaybackFlowState = f";
if (true) break;

case 31:
//if
this.state = 40;
if ((parent._targetpage._transition_getplaybackflowstate /*String*/ ()).equals(_flowpreparing)) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 252;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
if (true) break;

case 34:
//if
this.state = 39;
if (BA.ObjectToBoolean(_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)))) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
 //BA.debugLineNum = 253;BA.debugLine="Dim readyArgs As Map";
_readyargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 254;BA.debugLine="readyArgs.Initialize";
_readyargs.Initialize();
 //BA.debugLineNum = 255;BA.debugLine="readyArgs.Put(\"state\", previousFlowState)";
_readyargs.Put((Object)("state"),(Object)(_previousflowstate));
 //BA.debugLineNum = 256;BA.debugLine="readyArgs.Put(\"reason\", \"prepare_ready\")";
_readyargs.Put((Object)("reason"),(Object)("prepare_ready"));
 //BA.debugLineNum = 257;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(read";
parent._targetpage._transition_setplaybackflowstate /*String*/ (_readyargs);
 //BA.debugLineNum = 258;BA.debugLine="Trace(\"prefetch prepared audio=\" & targetAudioK";
parent._trace("prefetch prepared audio="+_targetaudiokey+" item="+parent._describeitem(_nextitem));
 if (true) break;

case 38:
//C
this.state = 39;
 //BA.debugLineNum = 260;BA.debugLine="Dim failedArgs As Map";
_failedargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 261;BA.debugLine="failedArgs.Initialize";
_failedargs.Initialize();
 //BA.debugLineNum = 262;BA.debugLine="failedArgs.Put(\"state\", \"error\")";
_failedargs.Put((Object)("state"),(Object)("error"));
 //BA.debugLineNum = 263;BA.debugLine="failedArgs.Put(\"reason\", \"prepare_failed\")";
_failedargs.Put((Object)("reason"),(Object)("prepare_failed"));
 //BA.debugLineNum = 264;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(fail";
parent._targetpage._transition_setplaybackflowstate /*String*/ (_failedargs);
 //BA.debugLineNum = 265;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetA";
parent._trace("переход preload ошибка audio="+_targetaudiokey);
 if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = -1;
;
 //BA.debugLineNum = 268;BA.debugLine="Return result.GetDefault(\"Success\", False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)));return;};
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _promotepreparedplayer(b4a.example.playbackruntimestate _runtimestate,b4a.example.dataplaybackresolver _dataresolver,b4a.example.keyvaluestore _storage,int _fadeinms,int _fadeoutms,String _flowtransitioning) throws Exception{
String _preparedaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
anywheresoftware.b4a.objects.collections.Map _flowargs = null;
String _previousaudiokey = "";
String _nextaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _promoteditem = null;
anywheresoftware.b4a.objects.collections.Map _boundaryargs = null;
b4a.example.audioplayer _previousaudio = null;
anywheresoftware.b4a.objects.collections.Map _activateargs = null;
 //BA.debugLineNum = 272;BA.debugLine="Public Sub PromotePreparedPlayer(runtimeState As P";
 //BA.debugLineNum = 273;BA.debugLine="Dim preparedAudioKey As String = targetPage.Trans";
_preparedaudiokey = _targetpage._transition_getdirectorpreparedaudiokey /*String*/ ();
 //BA.debugLineNum = 274;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = _targetpage._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 275;BA.debugLine="If preparedAudioKey = \"\" Or preparedItem.IsInitia";
if ((_preparedaudiokey).equals("") || _prepareditem.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 276;BA.debugLine="Trace(\"переход prepared reject reason=missing_pr";
_trace("переход prepared reject reason=missing_prepared");
 //BA.debugLineNum = 277;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 279;BA.debugLine="Dim flowArgs As Map";
_flowargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 280;BA.debugLine="flowArgs.Initialize";
_flowargs.Initialize();
 //BA.debugLineNum = 281;BA.debugLine="flowArgs.Put(\"state\", flowTransitioning)";
_flowargs.Put((Object)("state"),(Object)(_flowtransitioning));
 //BA.debugLineNum = 282;BA.debugLine="flowArgs.Put(\"reason\", \"promote_prepared\")";
_flowargs.Put((Object)("reason"),(Object)("promote_prepared"));
 //BA.debugLineNum = 283;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowAr";
_targetpage._transition_setplaybackflowstate /*String*/ (_flowargs);
 //BA.debugLineNum = 284;BA.debugLine="Dim previousAudioKey As String = targetPage.Trans";
_previousaudiokey = _targetpage._transition_getdirectoractiveaudiokey /*String*/ ();
 //BA.debugLineNum = 285;BA.debugLine="Dim nextAudioKey As String = preparedAudioKey";
_nextaudiokey = _preparedaudiokey;
 //BA.debugLineNum = 286;BA.debugLine="Dim promotedItem As Map = CloneMap(preparedItem)";
_promoteditem = new anywheresoftware.b4a.objects.collections.Map();
_promoteditem = _clonemap(_prepareditem);
 //BA.debugLineNum = 287;BA.debugLine="targetPage.Transition_ConsumePreparedQueueItem";
_targetpage._transition_consumepreparedqueueitem /*String*/ ();
 //BA.debugLineNum = 288;BA.debugLine="If previousAudioKey <> \"\" And previousAudioKey <>";
if ((_previousaudiokey).equals("") == false && (_previousaudiokey).equals(_nextaudiokey) == false) { 
 //BA.debugLineNum = 289;BA.debugLine="Dim boundaryArgs As Map";
_boundaryargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 290;BA.debugLine="boundaryArgs.Initialize";
_boundaryargs.Initialize();
 //BA.debugLineNum = 291;BA.debugLine="boundaryArgs.Put(\"fromAudioKey\", previousAudioKe";
_boundaryargs.Put((Object)("fromAudioKey"),(Object)(_previousaudiokey));
 //BA.debugLineNum = 292;BA.debugLine="boundaryArgs.Put(\"toAudioKey\", nextAudioKey)";
_boundaryargs.Put((Object)("toAudioKey"),(Object)(_nextaudiokey));
 //BA.debugLineNum = 293;BA.debugLine="boundaryArgs.Put(\"fadeOutMs\", fadeOutMs)";
_boundaryargs.Put((Object)("fadeOutMs"),(Object)(_fadeoutms));
 //BA.debugLineNum = 294;BA.debugLine="boundaryArgs.Put(\"fadeInMs\", fadeInMs)";
_boundaryargs.Put((Object)("fadeInMs"),(Object)(_fadeinms));
 //BA.debugLineNum = 295;BA.debugLine="boundaryArgs.Put(\"reason\", \"promote_prepared\")";
_boundaryargs.Put((Object)("reason"),(Object)("promote_prepared"));
 //BA.debugLineNum = 296;BA.debugLine="targetPage.Transition_RecordFadeBoundary(boundar";
_targetpage._transition_recordfadeboundary /*String*/ (_boundaryargs);
 //BA.debugLineNum = 297;BA.debugLine="Dim previousAudio As AudioPlayer = targetPage.Tr";
_previousaudio = _targetpage._transition_getaudiobykey /*b4a.example.audioplayer*/ (_previousaudiokey);
 //BA.debugLineNum = 298;BA.debugLine="previousAudio.Stop(fadeOutMs)";
_previousaudio._stop /*String*/ (_fadeoutms);
 };
 //BA.debugLineNum = 300;BA.debugLine="dataResolver.CommitPlaylistCursor(storage, promot";
_dataresolver._commitplaylistcursor /*String*/ (_storage,_promoteditem);
 //BA.debugLineNum = 301;BA.debugLine="Dim activateArgs As Map";
_activateargs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 302;BA.debugLine="activateArgs.Initialize";
_activateargs.Initialize();
 //BA.debugLineNum = 303;BA.debugLine="activateArgs.Put(\"audioKey\", nextAudioKey)";
_activateargs.Put((Object)("audioKey"),(Object)(_nextaudiokey));
 //BA.debugLineNum = 304;BA.debugLine="activateArgs.Put(\"item\", promotedItem)";
_activateargs.Put((Object)("item"),(Object)(_promoteditem.getObject()));
 //BA.debugLineNum = 305;BA.debugLine="activateArgs.Put(\"fadeInMs\", fadeInMs)";
_activateargs.Put((Object)("fadeInMs"),(Object)(_fadeinms));
 //BA.debugLineNum = 306;BA.debugLine="Trace(\"prepared promote audio=\" & nextAudioKey &";
_trace("prepared promote audio="+_nextaudiokey+" type="+BA.ObjectToString(_promoteditem.GetDefault((Object)("type"),(Object)("")))+" id="+BA.ObjectToString(_promoteditem.GetDefault((Object)("id"),(Object)(""))));
 //BA.debugLineNum = 307;BA.debugLine="targetPage.Transition_ActivateLoadedItem(activate";
_targetpage._transition_activateloadeditem /*String*/ (_activateargs);
 //BA.debugLineNum = 308;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
_targetpage._transition_clearpreparedstate /*String*/ (__c.False);
 //BA.debugLineNum = 309;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return false;
}
public String  _trace(String _message) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Private Sub Trace(message As String)";
 //BA.debugLineNum = 336;BA.debugLine="targetPage.TraceLog(message)";
_targetpage._tracelog /*String*/ (_message);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
