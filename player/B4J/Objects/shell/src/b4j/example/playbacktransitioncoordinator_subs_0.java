package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbacktransitioncoordinator_subs_0 {


public static RemoteObject  _cancrossfadeprepareditem(RemoteObject __ref,RemoteObject _runtimestate,RemoteObject _metastate,RemoteObject _orchestrationstate,RemoteObject _transitioninprogress) throws Exception{
try {
		Debug.PushSubsStack("CanCrossfadePreparedItem (playbacktransitioncoordinator) ","playbacktransitioncoordinator",3,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("cancrossfadeprepareditem")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","cancrossfadeprepareditem", __ref, _runtimestate, _metastate, _orchestrationstate, _transitioninprogress);}
Debug.locals.put("runtimeState", _runtimestate);
Debug.locals.put("metaState", _metastate);
Debug.locals.put("orchestrationState", _orchestrationstate);
Debug.locals.put("transitionInProgress", _transitioninprogress);
 BA.debugLineNum = 32;BA.debugLine="Public Sub CanCrossfadePreparedItem(runtimeState A";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
Debug.ShouldStop(1);
if (true) return __ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_canusepreparedtransition" /*RemoteObject*/ ,(Object)(_runtimestate),(Object)(_metastate),(Object)(_orchestrationstate),(Object)(_transitioninprogress),(Object)(BA.ObjectToString("track")),(Object)(BA.ObjectToString("track")),(Object)(RemoteObject.createImmutable("crossfade")));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _canstartpreparedontracktail(RemoteObject __ref,RemoteObject _runtimestate,RemoteObject _metastate,RemoteObject _orchestrationstate,RemoteObject _transitioninprogress) throws Exception{
try {
		Debug.PushSubsStack("CanStartPreparedOnTrackTail (playbacktransitioncoordinator) ","playbacktransitioncoordinator",3,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("canstartpreparedontracktail")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","canstartpreparedontracktail", __ref, _runtimestate, _metastate, _orchestrationstate, _transitioninprogress);}
Debug.locals.put("runtimeState", _runtimestate);
Debug.locals.put("metaState", _metastate);
Debug.locals.put("orchestrationState", _orchestrationstate);
Debug.locals.put("transitionInProgress", _transitioninprogress);
 BA.debugLineNum = 36;BA.debugLine="Public Sub CanStartPreparedOnTrackTail(runtimeStat";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
Debug.ShouldStop(16);
if (true) return __ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_canusepreparedtransition" /*RemoteObject*/ ,(Object)(_runtimestate),(Object)(_metastate),(Object)(_orchestrationstate),(Object)(_transitioninprogress),(Object)(BA.ObjectToString("track")),(Object)(BA.ObjectToString("ad")),(Object)(RemoteObject.createImmutable("tail_start")));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _canusepreparedtransition(RemoteObject __ref,RemoteObject _runtimestate,RemoteObject _metastate,RemoteObject _orchestrationstate,RemoteObject _transitioninprogress,RemoteObject _currenttype,RemoteObject _preparedtype,RemoteObject _decisionname) throws Exception{
try {
		Debug.PushSubsStack("CanUsePreparedTransition (playbacktransitioncoordinator) ","playbacktransitioncoordinator",3,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("canusepreparedtransition")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","canusepreparedtransition", __ref, _runtimestate, _metastate, _orchestrationstate, _transitioninprogress, _currenttype, _preparedtype, _decisionname);}
Debug.locals.put("runtimeState", _runtimestate);
Debug.locals.put("metaState", _metastate);
Debug.locals.put("orchestrationState", _orchestrationstate);
Debug.locals.put("transitionInProgress", _transitioninprogress);
Debug.locals.put("currentType", _currenttype);
Debug.locals.put("preparedType", _preparedtype);
Debug.locals.put("decisionName", _decisionname);
 BA.debugLineNum = 24;BA.debugLine="Public Sub CanUsePreparedTransition(runtimeState A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="If transitionInProgress Then Return False";
Debug.ShouldStop(16777216);
if (_transitioninprogress.<Boolean>get().booleanValue()) { 
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 26;BA.debugLine="If orchestrationState.IsCrossfadeTriggered Then R";
Debug.ShouldStop(33554432);
if (_orchestrationstate.getField(true,"_iscrossfadetriggered" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 27;BA.debugLine="If metaState.CurrentMediaType <> currentType Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",_metastate.getField(true,"_currentmediatype" /*RemoteObject*/ ),_currenttype)) { 
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 28;BA.debugLine="If HasUsablePreparedItem(runtimeState) = False Th";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_hasusableprepareditem" /*RemoteObject*/ ,(Object)(_runtimestate)),playbacktransitioncoordinator.__c.getField(true,"False"))) { 
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 29;BA.debugLine="Return runtimeState.PreparedItem.GetDefault(\"type";
Debug.ShouldStop(268435456);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_runtimestate.getField(false,"_prepareditem" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),(_preparedtype)));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private targetModule As Object";
playbacktransitioncoordinator._targetmodule = RemoteObject.createNew ("Object");__ref.setField("_targetmodule",playbacktransitioncoordinator._targetmodule);
 //BA.debugLineNum = 4;BA.debugLine="Private traceSubName As String";
playbacktransitioncoordinator._tracesubname = RemoteObject.createImmutable("");__ref.setField("_tracesubname",playbacktransitioncoordinator._tracesubname);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clonemap(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("CloneMap (playbacktransitioncoordinator) ","playbacktransitioncoordinator",3,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("clonemap")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","clonemap", __ref, _sourcemap);}
RemoteObject _clonedmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 167;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="Dim clonedMap As Map";
Debug.ShouldStop(128);
_clonedmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("clonedMap", _clonedmap);
 BA.debugLineNum = 169;BA.debugLine="clonedMap.Initialize";
Debug.ShouldStop(256);
_clonedmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 170;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_sourcemap.runMethod(true,"IsInitialized"),playbacktransitioncoordinator.__c.getField(true,"False"))) { 
if (true) return _clonedmap;};
 BA.debugLineNum = 171;BA.debugLine="For Each key As Object In sourceMap.Keys";
Debug.ShouldStop(1024);
{
final RemoteObject group4 = _sourcemap.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 172;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
Debug.ShouldStop(2048);
_clonedmap.runVoidMethod ("Put",(Object)(_key),(Object)(_sourcemap.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 174;BA.debugLine="Return clonedMap";
Debug.ShouldStop(8192);
if (true) return _clonedmap;
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _describeitem(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("DescribeItem (playbacktransitioncoordinator) ","playbacktransitioncoordinator",3,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("describeitem")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","describeitem", __ref, _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 162;BA.debugLine="Private Sub DescribeItem(item As Map) As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),playbacktransitioncoordinator.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 164;BA.debugLine="Return CallSub2(targetModule, \"Transition_Describ";
Debug.ShouldStop(8);
if (true) return BA.ObjectToString(playbacktransitioncoordinator.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Transition_DescribeItem")),(Object)((_item))));
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getinactiveaudiokey(RemoteObject __ref,RemoteObject _runtimestate) throws Exception{
try {
		Debug.PushSubsStack("GetInactiveAudioKey (playbacktransitioncoordinator) ","playbacktransitioncoordinator",3,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("getinactiveaudiokey")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","getinactiveaudiokey", __ref, _runtimestate);}
Debug.locals.put("runtimeState", _runtimestate);
 BA.debugLineNum = 12;BA.debugLine="Public Sub GetInactiveAudioKey(runtimeState As Pla";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="If runtimeState.ActiveAudioKey = \"primary\" Then R";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_runtimestate.getField(true,"_activeaudiokey" /*RemoteObject*/ ),BA.ObjectToString("primary"))) { 
if (true) return BA.ObjectToString("secondary");};
 BA.debugLineNum = 14;BA.debugLine="Return \"primary\"";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("primary");
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasusableprepareditem(RemoteObject __ref,RemoteObject _runtimestate) throws Exception{
try {
		Debug.PushSubsStack("HasUsablePreparedItem (playbacktransitioncoordinator) ","playbacktransitioncoordinator",3,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("hasusableprepareditem")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","hasusableprepareditem", __ref, _runtimestate);}
RemoteObject _preparedtype = RemoteObject.createImmutable("");
Debug.locals.put("runtimeState", _runtimestate);
 BA.debugLineNum = 17;BA.debugLine="Public Sub HasUsablePreparedItem(runtimeState As P";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="If runtimeState.PreparedAudioKey = \"\" Then Return";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_runtimestate.getField(true,"_preparedaudiokey" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 19;BA.debugLine="If runtimeState.PreparedItem.IsInitialized = Fals";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_runtimestate.getField(false,"_prepareditem" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),playbacktransitioncoordinator.__c.getField(true,"False"))) { 
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 20;BA.debugLine="Dim preparedType As String = runtimeState.Prepare";
Debug.ShouldStop(524288);
_preparedtype = BA.ObjectToString(_runtimestate.getField(false,"_prepareditem" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("preparedType", _preparedtype);Debug.locals.put("preparedType", _preparedtype);
 BA.debugLineNum = 21;BA.debugLine="Return preparedType = \"track\" Or preparedType = \"";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_preparedtype,BA.ObjectToString("track")) || RemoteObject.solveBoolean("=",_preparedtype,BA.ObjectToString("ad")));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _targetmodulevalue,RemoteObject _tracesubnamevalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbacktransitioncoordinator) ","playbacktransitioncoordinator",3,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","initialize", __ref, _ba, _targetmodulevalue, _tracesubnamevalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("targetModuleValue", _targetmodulevalue);
Debug.locals.put("traceSubNameValue", _tracesubnamevalue);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize(targetModuleValue As Object,";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="targetModule = targetModuleValue";
Debug.ShouldStop(128);
__ref.setField ("_targetmodule" /*RemoteObject*/ ,_targetmodulevalue);
 BA.debugLineNum = 9;BA.debugLine="traceSubName = traceSubNameValue";
Debug.ShouldStop(256);
__ref.setField ("_tracesubname" /*RemoteObject*/ ,_tracesubnamevalue);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _preparedfadeoutms(RemoteObject __ref,RemoteObject _metastate,RemoteObject _runtimestate,RemoteObject _trackoverlapms,RemoteObject _adtailoverlapms) throws Exception{
try {
		Debug.PushSubsStack("PreparedFadeOutMs (playbacktransitioncoordinator) ","playbacktransitioncoordinator",3,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("preparedfadeoutms")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","preparedfadeoutms", __ref, _metastate, _runtimestate, _trackoverlapms, _adtailoverlapms);}
RemoteObject _nexttype = RemoteObject.createImmutable("");
Debug.locals.put("metaState", _metastate);
Debug.locals.put("runtimeState", _runtimestate);
Debug.locals.put("trackOverlapMs", _trackoverlapms);
Debug.locals.put("adTailOverlapMs", _adtailoverlapms);
 BA.debugLineNum = 40;BA.debugLine="Public Sub PreparedFadeOutMs(metaState As Playback";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="If metaState.CurrentMediaType <> \"track\" Then Ret";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",_metastate.getField(true,"_currentmediatype" /*RemoteObject*/ ),BA.ObjectToString("track"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 42;BA.debugLine="If runtimeState.PreparedItem.IsInitialized = Fals";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_runtimestate.getField(false,"_prepareditem" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),playbacktransitioncoordinator.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 43;BA.debugLine="Dim nextType As String = runtimeState.PreparedIte";
Debug.ShouldStop(1024);
_nexttype = BA.ObjectToString(_runtimestate.getField(false,"_prepareditem" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("nextType", _nexttype);Debug.locals.put("nextType", _nexttype);
 BA.debugLineNum = 44;BA.debugLine="If nextType = \"track\" Then Return trackOverlapMs";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_nexttype,BA.ObjectToString("track"))) { 
if (true) return _trackoverlapms;};
 BA.debugLineNum = 45;BA.debugLine="If nextType = \"ad\" Then Return adTailOverlapMs";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_nexttype,BA.ObjectToString("ad"))) { 
if (true) return _adtailoverlapms;};
 BA.debugLineNum = 46;BA.debugLine="Return 0";
Debug.ShouldStop(8192);
if (true) return BA.numberCast(int.class, 0);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _preparenextplayable(RemoteObject __ref,RemoteObject _playqueue,RemoteObject _runtimestate,RemoteObject _metastate,RemoteObject _orchestrationstate,RemoteObject _mediacacheservice,RemoteObject _playbackflowstate,RemoteObject _flowplaying,RemoteObject _flowidle,RemoteObject _flowpreparing) throws Exception{
try {
		Debug.PushSubsStack("PrepareNextPlayable (playbacktransitioncoordinator) ","playbacktransitioncoordinator",3,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("preparenextplayable")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","preparenextplayable", __ref, _playqueue, _runtimestate, _metastate, _orchestrationstate, _mediacacheservice, _playbackflowstate, _flowplaying, _flowidle, _flowpreparing);}
ResumableSub_PrepareNextPlayable rsub = new ResumableSub_PrepareNextPlayable(null,__ref,_playqueue,_runtimestate,_metastate,_orchestrationstate,_mediacacheservice,_playbackflowstate,_flowplaying,_flowidle,_flowpreparing);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PrepareNextPlayable extends BA.ResumableSub {
public ResumableSub_PrepareNextPlayable(b4j.example.playbacktransitioncoordinator parent,RemoteObject __ref,RemoteObject _playqueue,RemoteObject _runtimestate,RemoteObject _metastate,RemoteObject _orchestrationstate,RemoteObject _mediacacheservice,RemoteObject _playbackflowstate,RemoteObject _flowplaying,RemoteObject _flowidle,RemoteObject _flowpreparing) {
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
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbacktransitioncoordinator parent;
RemoteObject _playqueue;
RemoteObject _runtimestate;
RemoteObject _metastate;
RemoteObject _orchestrationstate;
RemoteObject _mediacacheservice;
RemoteObject _playbackflowstate;
RemoteObject _flowplaying;
RemoteObject _flowidle;
RemoteObject _flowpreparing;
RemoteObject _nextobject = RemoteObject.declareNull("Object");
RemoteObject _candidateitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _candidatetype = RemoteObject.createImmutable("");
RemoteObject _nextitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _matchargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _targetaudiokey = RemoteObject.createImmutable("");
RemoteObject _previousflowstate = RemoteObject.createImmutable("");
RemoteObject _flowargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mediaargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nextitemurl = RemoteObject.createImmutable("");
RemoteObject _volume = RemoteObject.createImmutable(0);
RemoteObject _targetaudio = RemoteObject.declareNull("b4j.example.audioplayer");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _readyargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _failedargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrepareNextPlayable (playbacktransitioncoordinator) ","playbacktransitioncoordinator",3,__ref.getField(false, "ba"),__ref,49);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("playQueue", _playqueue);
Debug.locals.put("runtimeState", _runtimestate);
Debug.locals.put("metaState", _metastate);
Debug.locals.put("orchestrationState", _orchestrationstate);
Debug.locals.put("mediaCacheService", _mediacacheservice);
Debug.locals.put("playbackFlowState", _playbackflowstate);
Debug.locals.put("flowPlaying", _flowplaying);
Debug.locals.put("flowIdle", _flowidle);
Debug.locals.put("flowPreparing", _flowpreparing);
 BA.debugLineNum = 50;BA.debugLine="Do While playQueue.Size > 0";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//do while
this.state = 23;
while (RemoteObject.solveBoolean(">",_playqueue.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 51;BA.debugLine="Dim nextObject As Object = playQueue.Get(0)";
Debug.ShouldStop(262144);
_nextobject = _playqueue.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("nextObject", _nextobject);Debug.locals.put("nextObject", _nextobject);
 BA.debugLineNum = 52;BA.debugLine="If nextObject Is Map Then";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("i",_nextobject, RemoteObject.createImmutable("java.util.Map"))) { 
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
 BA.debugLineNum = 54;BA.debugLine="Return False";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 56;BA.debugLine="Dim candidateItem As Map = nextObject";
Debug.ShouldStop(8388608);
_candidateitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_candidateitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _nextobject);Debug.locals.put("candidateItem", _candidateitem);Debug.locals.put("candidateItem", _candidateitem);
 BA.debugLineNum = 57;BA.debugLine="Dim candidateType As String = candidateItem.GetD";
Debug.ShouldStop(16777216);
_candidatetype = BA.ObjectToString(_candidateitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("candidateType", _candidatetype);Debug.locals.put("candidateType", _candidatetype);
 BA.debugLineNum = 58;BA.debugLine="If candidateType <> \"track\" And candidateType <>";
Debug.ShouldStop(33554432);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_candidatetype,BA.ObjectToString("track")) && RemoteObject.solveBoolean("!",_candidatetype,BA.ObjectToString("ad"))) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 59;BA.debugLine="If candidateType = \"track\" And mediaCacheService";
Debug.ShouldStop(67108864);
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_candidatetype,BA.ObjectToString("track")) && RemoteObject.solveBoolean("=",_mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_candidateitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))),parent.__c.getField(true,"False"))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 60;BA.debugLine="Trace(\"Удален из очереди трек без локального фа";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Удален из очереди трек без локального файла. item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_candidateitem)))));
 BA.debugLineNum = 61;BA.debugLine="playQueue.RemoveAt(0)";
Debug.ShouldStop(268435456);
_playqueue.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 62;BA.debugLine="CallSub(targetModule, \"Transition_SaveQueueSnap";
Debug.ShouldStop(536870912);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Transition_SaveQueueSnapshotState")));
 BA.debugLineNum = 63;BA.debugLine="Continue";
Debug.ShouldStop(1073741824);
this.state = 1;
if (true) break;;
 if (true) break;
;
 BA.debugLineNum = 65;BA.debugLine="If candidateType = \"ad\" And mediaCacheService.Is";
Debug.ShouldStop(1);

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_candidatetype,BA.ObjectToString("ad")) && RemoteObject.solveBoolean("=",_mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_isadcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_candidateitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))),parent.__c.getField(true,"False"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 66;BA.debugLine="Trace(\"Удален из очереди ролик без локального ф";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Удален из очереди ролик без локального файла. item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_candidateitem)))));
 BA.debugLineNum = 67;BA.debugLine="playQueue.RemoveAt(0)";
Debug.ShouldStop(4);
_playqueue.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 68;BA.debugLine="CallSub(targetModule, \"Transition_SaveQueueSnap";
Debug.ShouldStop(8);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Transition_SaveQueueSnapshotState")));
 BA.debugLineNum = 69;BA.debugLine="Continue";
Debug.ShouldStop(16);
this.state = 1;
if (true) break;;
 if (true) break;

case 22:
//C
this.state = 1;
;
 BA.debugLineNum = 71;BA.debugLine="Exit";
Debug.ShouldStop(64);
this.state = 23;
if (true) break;
 if (true) break;
;
 BA.debugLineNum = 73;BA.debugLine="If playQueue.Size = 0 Then Return False";
Debug.ShouldStop(256);

case 23:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_playqueue.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 74;BA.debugLine="Dim nextItem As Map = playQueue.Get(0)";
Debug.ShouldStop(512);
_nextitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nextitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playqueue.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("nextItem", _nextitem);Debug.locals.put("nextItem", _nextitem);
 BA.debugLineNum = 75;BA.debugLine="If runtimeState.PreparedItem.IsInitialized And ru";
Debug.ShouldStop(1024);
if (true) break;

case 29:
//if
this.state = 36;
if (RemoteObject.solveBoolean(".",_runtimestate.getField(false,"_prepareditem" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("!",_runtimestate.getField(true,"_preparedaudiokey" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 76;BA.debugLine="Dim matchArgs As Map";
Debug.ShouldStop(2048);
_matchargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("matchArgs", _matchargs);
 BA.debugLineNum = 77;BA.debugLine="matchArgs.Initialize";
Debug.ShouldStop(4096);
_matchargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 78;BA.debugLine="matchArgs.Put(\"first\", runtimeState.PreparedItem";
Debug.ShouldStop(8192);
_matchargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("first"))),(Object)((_runtimestate.getField(false,"_prepareditem" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 79;BA.debugLine="matchArgs.Put(\"second\", nextItem)";
Debug.ShouldStop(16384);
_matchargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("second"))),(Object)((_nextitem.getObject())));
 BA.debugLineNum = 80;BA.debugLine="If CallSub2(targetModule, \"Transition_ItemsMatch";
Debug.ShouldStop(32768);
if (true) break;

case 32:
//if
this.state = 35;
if (BA.ObjectToBoolean(parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Transition_ItemsMatch")),(Object)((_matchargs)))).<Boolean>get().booleanValue()) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 81;BA.debugLine="Trace(\"PlaybackTransitionCoordinator prepared i";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("PlaybackTransitionCoordinator prepared item accepted. item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_nextitem)))));
 BA.debugLineNum = 82;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
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
 BA.debugLineNum = 85;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
Debug.ShouldStop(1048576);
_targetaudiokey = __ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_getinactiveaudiokey" /*RemoteObject*/ ,(Object)(_runtimestate));Debug.locals.put("targetAudioKey", _targetaudiokey);Debug.locals.put("targetAudioKey", _targetaudiokey);
 BA.debugLineNum = 86;BA.debugLine="CallSub2(targetModule, \"Transition_ClearPreparedS";
Debug.ShouldStop(2097152);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Transition_ClearPreparedState")),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 87;BA.debugLine="runtimeState.SetPendingPrepare(targetAudioKey, ne";
Debug.ShouldStop(4194304);
_runtimestate.runClassMethod (b4j.example.playbackruntimestate.class, "_setpendingprepare" /*RemoteObject*/ ,(Object)(_targetaudiokey),(Object)(_nextitem));
 BA.debugLineNum = 88;BA.debugLine="Dim previousFlowState As String = playbackFlowSta";
Debug.ShouldStop(8388608);
_previousflowstate = _playbackflowstate;Debug.locals.put("previousFlowState", _previousflowstate);Debug.locals.put("previousFlowState", _previousflowstate);
 BA.debugLineNum = 89;BA.debugLine="If playbackFlowState = flowPlaying Or playbackFlo";
Debug.ShouldStop(16777216);
if (true) break;

case 37:
//if
this.state = 40;
if (RemoteObject.solveBoolean("=",_playbackflowstate,_flowplaying) || RemoteObject.solveBoolean("=",_playbackflowstate,_flowidle)) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 90;BA.debugLine="Dim flowArgs As Map";
Debug.ShouldStop(33554432);
_flowargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("flowArgs", _flowargs);
 BA.debugLineNum = 91;BA.debugLine="flowArgs.Initialize";
Debug.ShouldStop(67108864);
_flowargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 92;BA.debugLine="flowArgs.Put(\"state\", flowPreparing)";
Debug.ShouldStop(134217728);
_flowargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state"))),(Object)((_flowpreparing)));
 BA.debugLineNum = 93;BA.debugLine="flowArgs.Put(\"reason\", \"prepare_next:\" & nextIte";
Debug.ShouldStop(268435456);
_flowargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable("prepare_next:"),_nextitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable(""))))))));
 BA.debugLineNum = 94;BA.debugLine="CallSub2(targetModule, \"Transition_SetPlaybackFl";
Debug.ShouldStop(536870912);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Transition_SetPlaybackFlowState")),(Object)((_flowargs)));
 if (true) break;

case 40:
//C
this.state = 41;
;
 BA.debugLineNum = 96;BA.debugLine="Dim mediaArgs As Map";
Debug.ShouldStop(-2147483648);
_mediaargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mediaArgs", _mediaargs);
 BA.debugLineNum = 97;BA.debugLine="mediaArgs.Initialize";
Debug.ShouldStop(1);
_mediaargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 98;BA.debugLine="mediaArgs.Put(\"audioKey\", targetAudioKey)";
Debug.ShouldStop(2);
_mediaargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("audioKey"))),(Object)((_targetaudiokey)));
 BA.debugLineNum = 99;BA.debugLine="mediaArgs.Put(\"item\", nextItem)";
Debug.ShouldStop(4);
_mediaargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("item"))),(Object)((_nextitem.getObject())));
 BA.debugLineNum = 100;BA.debugLine="Dim nextItemUrl As String = CallSub2(targetModule";
Debug.ShouldStop(8);
_nextitemurl = BA.ObjectToString(parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Transition_ResolvePlaybackMediaUrl")),(Object)((_mediaargs))));Debug.locals.put("nextItemUrl", _nextitemurl);Debug.locals.put("nextItemUrl", _nextitemurl);
 BA.debugLineNum = 101;BA.debugLine="If nextItemUrl = \"\" Then";
Debug.ShouldStop(16);
if (true) break;

case 41:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_nextitemurl,BA.ObjectToString(""))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 102;BA.debugLine="Trace(\"PlaybackTransitionCoordinator preload fai";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("PlaybackTransitionCoordinator preload failed. audio="),_targetaudiokey,RemoteObject.createImmutable(", message=empty_media_url"))));
 BA.debugLineNum = 103;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 44:
//C
this.state = 45;
;
 BA.debugLineNum = 105;BA.debugLine="Dim volume As Double = CallSub2(targetModule, \"Tr";
Debug.ShouldStop(256);
_volume = BA.numberCast(double.class, parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Transition_CurrentVolume")),(Object)((_nextitem))));Debug.locals.put("volume", _volume);Debug.locals.put("volume", _volume);
 BA.debugLineNum = 106;BA.debugLine="Trace(\"PlaybackTransitionCoordinator preload requ";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("PlaybackTransitionCoordinator preload requested. targetAudio="),_targetaudiokey,RemoteObject.createImmutable(", item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_nextitem)),RemoteObject.createImmutable(", source="),_mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_resolvemediasource" /*RemoteObject*/ ,(Object)(_nextitem)))));
 BA.debugLineNum = 107;BA.debugLine="Dim targetAudio As AudioPlayer = CallSub2(targetM";
Debug.ShouldStop(1024);
_targetaudio = (parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Transition_GetAudioByKey")),(Object)((_targetaudiokey))));Debug.locals.put("targetAudio", _targetaudio);Debug.locals.put("targetAudio", _targetaudio);
 BA.debugLineNum = 108;BA.debugLine="targetAudio.LoadUrl(nextItemUrl, volume)";
Debug.ShouldStop(2048);
_targetaudio.runClassMethod (b4j.example.audioplayer.class, "_loadurl" /*RemoteObject*/ ,(Object)(_nextitemurl),(Object)(_volume));
 BA.debugLineNum = 109;BA.debugLine="Wait For PreloadDone(result As Map)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","preloaddone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbacktransitioncoordinator", "preparenextplayable"), null);
this.state = 55;
return;
case 55:
//C
this.state = 45;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 110;BA.debugLine="Trace(\"PlaybackTransitionCoordinator preload comp";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("PlaybackTransitionCoordinator preload completed. audio="),_targetaudiokey,RemoteObject.createImmutable(", success="),_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False")))),RemoteObject.createImmutable(", message="),_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Message"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 111;BA.debugLine="If playbackFlowState = flowPreparing Then";
Debug.ShouldStop(16384);
if (true) break;

case 45:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",_playbackflowstate,_flowpreparing)) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 112;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
Debug.ShouldStop(32768);
if (true) break;

case 48:
//if
this.state = 53;
if (BA.ObjectToBoolean(_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False"))))).<Boolean>get().booleanValue()) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 53;
 BA.debugLineNum = 113;BA.debugLine="Dim readyArgs As Map";
Debug.ShouldStop(65536);
_readyargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("readyArgs", _readyargs);
 BA.debugLineNum = 114;BA.debugLine="readyArgs.Initialize";
Debug.ShouldStop(131072);
_readyargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 115;BA.debugLine="readyArgs.Put(\"state\", previousFlowState)";
Debug.ShouldStop(262144);
_readyargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state"))),(Object)((_previousflowstate)));
 BA.debugLineNum = 116;BA.debugLine="readyArgs.Put(\"reason\", \"prepare_ready\")";
Debug.ShouldStop(524288);
_readyargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((RemoteObject.createImmutable("prepare_ready"))));
 BA.debugLineNum = 117;BA.debugLine="CallSub2(targetModule, \"Transition_SetPlaybackF";
Debug.ShouldStop(1048576);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Transition_SetPlaybackFlowState")),(Object)((_readyargs)));
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 119;BA.debugLine="Dim failedArgs As Map";
Debug.ShouldStop(4194304);
_failedargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("failedArgs", _failedargs);
 BA.debugLineNum = 120;BA.debugLine="failedArgs.Initialize";
Debug.ShouldStop(8388608);
_failedargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 121;BA.debugLine="failedArgs.Put(\"state\", \"error\")";
Debug.ShouldStop(16777216);
_failedargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state"))),(Object)((RemoteObject.createImmutable("error"))));
 BA.debugLineNum = 122;BA.debugLine="failedArgs.Put(\"reason\", \"prepare_failed\")";
Debug.ShouldStop(33554432);
_failedargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((RemoteObject.createImmutable("prepare_failed"))));
 BA.debugLineNum = 123;BA.debugLine="CallSub2(targetModule, \"Transition_SetPlaybackF";
Debug.ShouldStop(67108864);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Transition_SetPlaybackFlowState")),(Object)((_failedargs)));
 BA.debugLineNum = 124;BA.debugLine="Trace(\"PlaybackTransitionCoordinator preload fa";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("PlaybackTransitionCoordinator preload failed. audio="),_targetaudiokey)));
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
 BA.debugLineNum = 127;BA.debugLine="Return result.GetDefault(\"Success\", False)";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False")))));return;};
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _preloaddone(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _promotepreparedplayer(RemoteObject __ref,RemoteObject _runtimestate,RemoteObject _dataresolver,RemoteObject _storage,RemoteObject _fadeinms,RemoteObject _fadeoutms,RemoteObject _flowtransitioning) throws Exception{
try {
		Debug.PushSubsStack("PromotePreparedPlayer (playbacktransitioncoordinator) ","playbacktransitioncoordinator",3,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("promotepreparedplayer")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","promotepreparedplayer", __ref, _runtimestate, _dataresolver, _storage, _fadeinms, _fadeoutms, _flowtransitioning);}
RemoteObject _flowargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _previousaudiokey = RemoteObject.createImmutable("");
RemoteObject _nextaudiokey = RemoteObject.createImmutable("");
RemoteObject _promoteditem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _previousaudio = RemoteObject.declareNull("b4j.example.audioplayer");
RemoteObject _activateargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("runtimeState", _runtimestate);
Debug.locals.put("dataResolver", _dataresolver);
Debug.locals.put("storage", _storage);
Debug.locals.put("fadeInMs", _fadeinms);
Debug.locals.put("fadeOutMs", _fadeoutms);
Debug.locals.put("flowTransitioning", _flowtransitioning);
 BA.debugLineNum = 130;BA.debugLine="Public Sub PromotePreparedPlayer(runtimeState As P";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="If runtimeState.PreparedAudioKey = \"\" Or runtimeS";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_runtimestate.getField(true,"_preparedaudiokey" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_runtimestate.getField(false,"_prepareditem" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),playbacktransitioncoordinator.__c.getField(true,"False"))) { 
 BA.debugLineNum = 132;BA.debugLine="Trace(\"PlaybackTransitionCoordinator prepared it";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("PlaybackTransitionCoordinator prepared item rejected. reason=missing_prepared")));
 BA.debugLineNum = 133;BA.debugLine="Return False";
Debug.ShouldStop(16);
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");
 };
 BA.debugLineNum = 135;BA.debugLine="Dim flowArgs As Map";
Debug.ShouldStop(64);
_flowargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("flowArgs", _flowargs);
 BA.debugLineNum = 136;BA.debugLine="flowArgs.Initialize";
Debug.ShouldStop(128);
_flowargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 137;BA.debugLine="flowArgs.Put(\"state\", flowTransitioning)";
Debug.ShouldStop(256);
_flowargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state"))),(Object)((_flowtransitioning)));
 BA.debugLineNum = 138;BA.debugLine="flowArgs.Put(\"reason\", \"promote_prepared\")";
Debug.ShouldStop(512);
_flowargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((RemoteObject.createImmutable("promote_prepared"))));
 BA.debugLineNum = 139;BA.debugLine="CallSub2(targetModule, \"Transition_SetPlaybackFlo";
Debug.ShouldStop(1024);
playbacktransitioncoordinator.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Transition_SetPlaybackFlowState")),(Object)((_flowargs)));
 BA.debugLineNum = 140;BA.debugLine="Dim previousAudioKey As String = runtimeState.Act";
Debug.ShouldStop(2048);
_previousaudiokey = _runtimestate.getField(true,"_activeaudiokey" /*RemoteObject*/ );Debug.locals.put("previousAudioKey", _previousaudiokey);Debug.locals.put("previousAudioKey", _previousaudiokey);
 BA.debugLineNum = 141;BA.debugLine="Dim nextAudioKey As String = runtimeState.Prepare";
Debug.ShouldStop(4096);
_nextaudiokey = _runtimestate.getField(true,"_preparedaudiokey" /*RemoteObject*/ );Debug.locals.put("nextAudioKey", _nextaudiokey);Debug.locals.put("nextAudioKey", _nextaudiokey);
 BA.debugLineNum = 142;BA.debugLine="Dim promotedItem As Map = CloneMap(runtimeState.P";
Debug.ShouldStop(8192);
_promoteditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_promoteditem = __ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_clonemap" /*RemoteObject*/ ,(Object)(_runtimestate.getField(false,"_prepareditem" /*RemoteObject*/ )));Debug.locals.put("promotedItem", _promoteditem);Debug.locals.put("promotedItem", _promoteditem);
 BA.debugLineNum = 143;BA.debugLine="Trace(\"PlaybackTransitionCoordinator prepared ite";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("PlaybackTransitionCoordinator prepared item promoted. fromAudio="),_previousaudiokey,RemoteObject.createImmutable(", toAudio="),_nextaudiokey,RemoteObject.createImmutable(", item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_promoteditem)),RemoteObject.createImmutable(", fadeOutMs="),_fadeoutms)));
 BA.debugLineNum = 144;BA.debugLine="CallSub(targetModule, \"Transition_ConsumePrepared";
Debug.ShouldStop(32768);
playbacktransitioncoordinator.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Transition_ConsumePreparedQueueItem")));
 BA.debugLineNum = 145;BA.debugLine="If previousAudioKey <> \"\" And previousAudioKey <>";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",_previousaudiokey,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_previousaudiokey,_nextaudiokey)) { 
 BA.debugLineNum = 146;BA.debugLine="Dim previousAudio As AudioPlayer = CallSub2(targ";
Debug.ShouldStop(131072);
_previousaudio = (playbacktransitioncoordinator.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Transition_GetAudioByKey")),(Object)((_previousaudiokey))));Debug.locals.put("previousAudio", _previousaudio);Debug.locals.put("previousAudio", _previousaudio);
 BA.debugLineNum = 147;BA.debugLine="previousAudio.Stop(fadeOutMs)";
Debug.ShouldStop(262144);
_previousaudio.runClassMethod (b4j.example.audioplayer.class, "_stop" /*RemoteObject*/ ,(Object)(_fadeoutms));
 };
 BA.debugLineNum = 149;BA.debugLine="dataResolver.CommitPlaylistCursor(storage, promot";
Debug.ShouldStop(1048576);
_dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_commitplaylistcursor" /*RemoteObject*/ ,(Object)(_storage),(Object)(_promoteditem));
 BA.debugLineNum = 150;BA.debugLine="Trace(\"PlaybackQueueState playlist cursor committ";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("PlaybackQueueState playlist cursor committed. item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_promoteditem)))));
 BA.debugLineNum = 151;BA.debugLine="CallSub(targetModule, \"Transition_SaveQueueSnapsh";
Debug.ShouldStop(4194304);
playbacktransitioncoordinator.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Transition_SaveQueueSnapshotState")));
 BA.debugLineNum = 152;BA.debugLine="Dim activateArgs As Map";
Debug.ShouldStop(8388608);
_activateargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("activateArgs", _activateargs);
 BA.debugLineNum = 153;BA.debugLine="activateArgs.Initialize";
Debug.ShouldStop(16777216);
_activateargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 154;BA.debugLine="activateArgs.Put(\"audioKey\", nextAudioKey)";
Debug.ShouldStop(33554432);
_activateargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("audioKey"))),(Object)((_nextaudiokey)));
 BA.debugLineNum = 155;BA.debugLine="activateArgs.Put(\"item\", promotedItem)";
Debug.ShouldStop(67108864);
_activateargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("item"))),(Object)((_promoteditem.getObject())));
 BA.debugLineNum = 156;BA.debugLine="activateArgs.Put(\"fadeInMs\", fadeInMs)";
Debug.ShouldStop(134217728);
_activateargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fadeInMs"))),(Object)((_fadeinms)));
 BA.debugLineNum = 157;BA.debugLine="CallSub2(targetModule, \"Transition_ActivateLoaded";
Debug.ShouldStop(268435456);
playbacktransitioncoordinator.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Transition_ActivateLoadedItem")),(Object)((_activateargs)));
 BA.debugLineNum = 158;BA.debugLine="CallSub2(targetModule, \"Transition_ClearPreparedS";
Debug.ShouldStop(536870912);
playbacktransitioncoordinator.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Transition_ClearPreparedState")),(Object)((playbacktransitioncoordinator.__c.getField(true,"False"))));
 BA.debugLineNum = 159;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
if (true) return playbacktransitioncoordinator.__c.getField(true,"True");
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trace(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("Trace (playbacktransitioncoordinator) ","playbacktransitioncoordinator",3,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 177;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
Debug.ShouldStop(131072);
if (playbacktransitioncoordinator.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 179;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
Debug.ShouldStop(262144);
playbacktransitioncoordinator.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ )),(Object)((_message)));
 };
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}