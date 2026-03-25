package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbacktransitioncoordinator_subs_0 {


public static RemoteObject  _cancrossfadeprepareditem(RemoteObject __ref,RemoteObject _runtimestate,RemoteObject _metastate,RemoteObject _orchestrationstate,RemoteObject _transitioninprogress) throws Exception{
try {
		Debug.PushSubsStack("CanCrossfadePreparedItem (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("cancrossfadeprepareditem")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","cancrossfadeprepareditem", __ref, _runtimestate, _metastate, _orchestrationstate, _transitioninprogress);}
Debug.locals.put("runtimeState", _runtimestate);
Debug.locals.put("metaState", _metastate);
Debug.locals.put("orchestrationState", _orchestrationstate);
Debug.locals.put("transitionInProgress", _transitioninprogress);
 BA.debugLineNum = 39;BA.debugLine="Public Sub CanCrossfadePreparedItem(runtimeState A";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
Debug.ShouldStop(128);
if (true) return __ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_canusepreparedtransition" /*RemoteObject*/ ,(Object)(_runtimestate),(Object)(_metastate),(Object)(_orchestrationstate),(Object)(_transitioninprogress),(Object)(BA.ObjectToString("track")),(Object)(BA.ObjectToString("track")),(Object)(RemoteObject.createImmutable("crossfade")));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("CanStartPreparedOnTrackTail (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("canstartpreparedontracktail")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","canstartpreparedontracktail", __ref, _runtimestate, _metastate, _orchestrationstate, _transitioninprogress);}
Debug.locals.put("runtimeState", _runtimestate);
Debug.locals.put("metaState", _metastate);
Debug.locals.put("orchestrationState", _orchestrationstate);
Debug.locals.put("transitionInProgress", _transitioninprogress);
 BA.debugLineNum = 43;BA.debugLine="Public Sub CanStartPreparedOnTrackTail(runtimeStat";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Return CanUsePreparedTransition(runtimeState, met";
Debug.ShouldStop(2048);
if (true) return __ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_canusepreparedtransition" /*RemoteObject*/ ,(Object)(_runtimestate),(Object)(_metastate),(Object)(_orchestrationstate),(Object)(_transitioninprogress),(Object)(BA.ObjectToString("track")),(Object)(BA.ObjectToString("ad")),(Object)(RemoteObject.createImmutable("tail_start")));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("CanUsePreparedTransition (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("canusepreparedtransition")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","canusepreparedtransition", __ref, _runtimestate, _metastate, _orchestrationstate, _transitioninprogress, _currenttype, _preparedtype, _decisionname);}
RemoteObject _prepareditem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("runtimeState", _runtimestate);
Debug.locals.put("metaState", _metastate);
Debug.locals.put("orchestrationState", _orchestrationstate);
Debug.locals.put("transitionInProgress", _transitioninprogress);
Debug.locals.put("currentType", _currenttype);
Debug.locals.put("preparedType", _preparedtype);
Debug.locals.put("decisionName", _decisionname);
 BA.debugLineNum = 30;BA.debugLine="Public Sub CanUsePreparedTransition(runtimeState A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="If transitionInProgress Then Return False";
Debug.ShouldStop(1073741824);
if (_transitioninprogress.<Boolean>get().booleanValue()) { 
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 32;BA.debugLine="If orchestrationState.IsCrossfadeTriggered Then R";
Debug.ShouldStop(-2147483648);
if (_orchestrationstate.getField(true,"_iscrossfadetriggered" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 33;BA.debugLine="If metaState.CurrentMediaType <> currentType Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",_metastate.getField(true,"_currentmediatype" /*RemoteObject*/ ),_currenttype)) { 
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 34;BA.debugLine="If HasUsablePreparedItem(runtimeState) = False Th";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_hasusableprepareditem" /*RemoteObject*/ ,(Object)(_runtimestate)),playbacktransitioncoordinator.__c.getField(true,"False"))) { 
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 35;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
Debug.ShouldStop(4);
_prepareditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_prepareditem = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getdirectorprepareditem" /*RemoteObject*/ );Debug.locals.put("preparedItem", _prepareditem);Debug.locals.put("preparedItem", _prepareditem);
 BA.debugLineNum = 36;BA.debugLine="Return preparedItem.GetDefault(\"type\", \"\") = prep";
Debug.ShouldStop(8);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_prepareditem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),(_preparedtype)));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private targetPage As B4XMainPage";
playbacktransitioncoordinator._targetpage = RemoteObject.createNew ("b4j.example.b4xmainpage");__ref.setField("_targetpage",playbacktransitioncoordinator._targetpage);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clonemap(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("CloneMap (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,278);
if (RapidSub.canDelegate("clonemap")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","clonemap", __ref, _sourcemap);}
RemoteObject _clonedmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 278;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 279;BA.debugLine="Dim clonedMap As Map";
Debug.ShouldStop(4194304);
_clonedmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("clonedMap", _clonedmap);
 BA.debugLineNum = 280;BA.debugLine="clonedMap.Initialize";
Debug.ShouldStop(8388608);
_clonedmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 281;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_sourcemap.runMethod(true,"IsInitialized"),playbacktransitioncoordinator.__c.getField(true,"False"))) { 
if (true) return _clonedmap;};
 BA.debugLineNum = 282;BA.debugLine="For Each key As Object In sourceMap.Keys";
Debug.ShouldStop(33554432);
{
final RemoteObject group4 = _sourcemap.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 283;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
Debug.ShouldStop(67108864);
_clonedmap.runVoidMethod ("Put",(Object)(_key),(Object)(_sourcemap.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 285;BA.debugLine="Return clonedMap";
Debug.ShouldStop(268435456);
if (true) return _clonedmap;
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("DescribeItem (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,265);
if (RapidSub.canDelegate("describeitem")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","describeitem", __ref, _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 265;BA.debugLine="Private Sub DescribeItem(item As Map) As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 266;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),playbacktransitioncoordinator.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 267;BA.debugLine="Return targetPage.Transition_DescribeItem(item)";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_describeitem" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("GetInactiveAudioKey (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("getinactiveaudiokey")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","getinactiveaudiokey", __ref, _runtimestate);}
Debug.locals.put("runtimeState", _runtimestate);
 BA.debugLineNum = 14;BA.debugLine="Public Sub GetInactiveAudioKey(runtimeState As Pla";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="If targetPage.Transition_GetDirectorActiveAudioKe";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getdirectoractiveaudiokey" /*RemoteObject*/ ),BA.ObjectToString("primary"))) { 
if (true) return BA.ObjectToString("secondary");};
 BA.debugLineNum = 16;BA.debugLine="Return \"primary\"";
Debug.ShouldStop(32768);
if (true) return BA.ObjectToString("primary");
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("HasUsablePreparedItem (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("hasusableprepareditem")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","hasusableprepareditem", __ref, _runtimestate);}
RemoteObject _preparedaudiokey = RemoteObject.createImmutable("");
RemoteObject _prepareditem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _preparedtype = RemoteObject.createImmutable("");
Debug.locals.put("runtimeState", _runtimestate);
 BA.debugLineNum = 20;BA.debugLine="Public Sub HasUsablePreparedItem(runtimeState As P";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Dim preparedAudioKey As String = targetPage.Trans";
Debug.ShouldStop(1048576);
_preparedaudiokey = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getdirectorpreparedaudiokey" /*RemoteObject*/ );Debug.locals.put("preparedAudioKey", _preparedaudiokey);Debug.locals.put("preparedAudioKey", _preparedaudiokey);
 BA.debugLineNum = 22;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
Debug.ShouldStop(2097152);
_prepareditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_prepareditem = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getdirectorprepareditem" /*RemoteObject*/ );Debug.locals.put("preparedItem", _prepareditem);Debug.locals.put("preparedItem", _prepareditem);
 BA.debugLineNum = 23;BA.debugLine="If preparedAudioKey = \"\" Then Return False";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_preparedaudiokey,BA.ObjectToString(""))) { 
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 24;BA.debugLine="If preparedItem.IsInitialized = False Then Return";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_prepareditem.runMethod(true,"IsInitialized"),playbacktransitioncoordinator.__c.getField(true,"False"))) { 
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 25;BA.debugLine="Dim preparedType As String = preparedItem.GetDefa";
Debug.ShouldStop(16777216);
_preparedtype = BA.ObjectToString(_prepareditem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("preparedType", _preparedtype);Debug.locals.put("preparedType", _preparedtype);
 BA.debugLineNum = 26;BA.debugLine="Return preparedType = \"track\" Or preparedType = \"";
Debug.ShouldStop(33554432);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_preparedtype,BA.ObjectToString("track")) || RemoteObject.solveBoolean("=",_preparedtype,BA.ObjectToString("ad")));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _targetpagevalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","initialize", __ref, _ba, _targetpagevalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("targetPageValue", _targetpagevalue);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(targetPageValue As B4XMainPa";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="targetPage = targetPageValue";
Debug.ShouldStop(512);
__ref.setField ("_targetpage" /*RemoteObject*/ ,_targetpagevalue);
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _itemsmatch(RemoteObject __ref,RemoteObject _firstitem,RemoteObject _seconditem) throws Exception{
try {
		Debug.PushSubsStack("ItemsMatch (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,270);
if (RapidSub.canDelegate("itemsmatch")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","itemsmatch", __ref, _firstitem, _seconditem);}
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("firstItem", _firstitem);
Debug.locals.put("secondItem", _seconditem);
 BA.debugLineNum = 270;BA.debugLine="Private Sub ItemsMatch(firstItem As Map, secondIte";
Debug.ShouldStop(8192);
 BA.debugLineNum = 271;BA.debugLine="Dim args As Map";
Debug.ShouldStop(16384);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("args", _args);
 BA.debugLineNum = 272;BA.debugLine="args.Initialize";
Debug.ShouldStop(32768);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 273;BA.debugLine="args.Put(\"first\", firstItem)";
Debug.ShouldStop(65536);
_args.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("first"))),(Object)((_firstitem.getObject())));
 BA.debugLineNum = 274;BA.debugLine="args.Put(\"second\", secondItem)";
Debug.ShouldStop(131072);
_args.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("second"))),(Object)((_seconditem.getObject())));
 BA.debugLineNum = 275;BA.debugLine="Return targetPage.Transition_ItemsMatch(args)";
Debug.ShouldStop(262144);
if (true) return __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_itemsmatch" /*RemoteObject*/ ,(Object)(_args));
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _preparedfadeoutms(RemoteObject __ref,RemoteObject _metastate,RemoteObject _runtimestate,RemoteObject _trackoverlapms,RemoteObject _adtailoverlapms) throws Exception{
try {
		Debug.PushSubsStack("PreparedFadeOutMs (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("preparedfadeoutms")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","preparedfadeoutms", __ref, _metastate, _runtimestate, _trackoverlapms, _adtailoverlapms);}
RemoteObject _prepareditem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nexttype = RemoteObject.createImmutable("");
Debug.locals.put("metaState", _metastate);
Debug.locals.put("runtimeState", _runtimestate);
Debug.locals.put("trackOverlapMs", _trackoverlapms);
Debug.locals.put("adTailOverlapMs", _adtailoverlapms);
 BA.debugLineNum = 47;BA.debugLine="Public Sub PreparedFadeOutMs(metaState As Playback";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="If metaState.CurrentMediaType <> \"track\" Then Ret";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_metastate.getField(true,"_currentmediatype" /*RemoteObject*/ ),BA.ObjectToString("track"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 49;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
Debug.ShouldStop(65536);
_prepareditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_prepareditem = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getdirectorprepareditem" /*RemoteObject*/ );Debug.locals.put("preparedItem", _prepareditem);Debug.locals.put("preparedItem", _prepareditem);
 BA.debugLineNum = 50;BA.debugLine="If preparedItem.IsInitialized = False Then Return";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_prepareditem.runMethod(true,"IsInitialized"),playbacktransitioncoordinator.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 51;BA.debugLine="Dim nextType As String = preparedItem.GetDefault(";
Debug.ShouldStop(262144);
_nexttype = BA.ObjectToString(_prepareditem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("nextType", _nexttype);Debug.locals.put("nextType", _nexttype);
 BA.debugLineNum = 52;BA.debugLine="If nextType = \"track\" Then Return trackOverlapMs";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_nexttype,BA.ObjectToString("track"))) { 
if (true) return _trackoverlapms;};
 BA.debugLineNum = 53;BA.debugLine="If nextType = \"ad\" Then Return adTailOverlapMs";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_nexttype,BA.ObjectToString("ad"))) { 
if (true) return _adtailoverlapms;};
 BA.debugLineNum = 54;BA.debugLine="Return 0";
Debug.ShouldStop(2097152);
if (true) return BA.numberCast(int.class, 0);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("PrepareNextPlayable (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,58);
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
RemoteObject _candidateindex = RemoteObject.createImmutable(0);
RemoteObject _scanindex = RemoteObject.createImmutable(0);
RemoteObject _nextobject = RemoteObject.declareNull("Object");
RemoteObject _candidateitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _candidatetype = RemoteObject.createImmutable("");
RemoteObject _activeitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nextitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _existingprepareditem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _existingpreparedaudiokey = RemoteObject.createImmutable("");
RemoteObject _matchargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _targetaudiokey = RemoteObject.createImmutable("");
RemoteObject _pendingprepareargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _previousflowstate = RemoteObject.createImmutable("");
RemoteObject _flowargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mediaargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nextitemurl = RemoteObject.createImmutable("");
RemoteObject _volume = RemoteObject.createImmutable(0);
RemoteObject _targetaudio = RemoteObject.declareNull("b4j.example.audioplayer");
RemoteObject _waitargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _readyargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _failedargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrepareNextPlayable (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,58);
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
 BA.debugLineNum = 59;BA.debugLine="Dim candidateIndex As Int = -1";
Debug.ShouldStop(67108864);
_candidateindex = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("candidateIndex", _candidateindex);Debug.locals.put("candidateIndex", _candidateindex);
 BA.debugLineNum = 60;BA.debugLine="Do While playQueue.Size > 0";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//do while
this.state = 41;
while (RemoteObject.solveBoolean(">",_playqueue.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 61;BA.debugLine="Dim scanIndex As Int = candidateIndex + 1";
Debug.ShouldStop(268435456);
_scanindex = RemoteObject.solve(new RemoteObject[] {_candidateindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("scanIndex", _scanindex);Debug.locals.put("scanIndex", _scanindex);
 BA.debugLineNum = 62;BA.debugLine="If scanIndex < 0 Then scanIndex = 0";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("<",_scanindex,BA.numberCast(double.class, 0))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_scanindex = BA.numberCast(int.class, 0);Debug.locals.put("scanIndex", _scanindex);
if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 63;BA.debugLine="If scanIndex >= playQueue.Size Then Return False";
Debug.ShouldStop(1073741824);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("g",_scanindex,BA.numberCast(double.class, _playqueue.runMethod(true,"getSize")))) { 
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
 BA.debugLineNum = 64;BA.debugLine="Dim nextObject As Object = playQueue.Get(scanInd";
Debug.ShouldStop(-2147483648);
_nextobject = _playqueue.runMethod(false,"Get",(Object)(_scanindex));Debug.locals.put("nextObject", _nextobject);Debug.locals.put("nextObject", _nextobject);
 BA.debugLineNum = 65;BA.debugLine="If nextObject Is Map Then";
Debug.ShouldStop(1);
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("i",_nextobject, RemoteObject.createImmutable("java.util.Map"))) { 
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
 BA.debugLineNum = 67;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 69;BA.debugLine="Dim candidateItem As Map = nextObject";
Debug.ShouldStop(16);
_candidateitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_candidateitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _nextobject);Debug.locals.put("candidateItem", _candidateitem);Debug.locals.put("candidateItem", _candidateitem);
 BA.debugLineNum = 70;BA.debugLine="Dim candidateType As String = candidateItem.GetD";
Debug.ShouldStop(32);
_candidatetype = BA.ObjectToString(_candidateitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("candidateType", _candidatetype);Debug.locals.put("candidateType", _candidatetype);
 BA.debugLineNum = 71;BA.debugLine="If candidateType = \"break\" Then";
Debug.ShouldStop(64);
if (true) break;

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_candidatetype,BA.ObjectToString("break"))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 72;BA.debugLine="Trace(\"prefetch skip reason=break_ahead item=\"";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("prefetch skip reason=break_ahead item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_candidateitem)))));
 BA.debugLineNum = 73;BA.debugLine="candidateIndex = scanIndex";
Debug.ShouldStop(256);
_candidateindex = _scanindex;Debug.locals.put("candidateIndex", _candidateindex);
 BA.debugLineNum = 74;BA.debugLine="Continue";
Debug.ShouldStop(512);
this.state = 1;
if (true) break;;
 if (true) break;
;
 BA.debugLineNum = 76;BA.debugLine="If candidateType <> \"track\" And candidateType <>";
Debug.ShouldStop(2048);

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean("!",_candidatetype,BA.ObjectToString("track")) && RemoteObject.solveBoolean("!",_candidatetype,BA.ObjectToString("ad"))) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 77;BA.debugLine="Dim activeItem As Map = targetPage.Transition_Ge";
Debug.ShouldStop(4096);
_activeitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_activeitem = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getdirectoractiveitem" /*RemoteObject*/ );Debug.locals.put("activeItem", _activeitem);Debug.locals.put("activeItem", _activeitem);
 BA.debugLineNum = 78;BA.debugLine="If ItemsMatch(activeItem, candidateItem) Then";
Debug.ShouldStop(8192);
if (true) break;

case 31:
//if
this.state = 34;
if (__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_itemsmatch" /*RemoteObject*/ ,(Object)(_activeitem),(Object)(_candidateitem)).<Boolean>get().booleanValue()) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 79;BA.debugLine="Trace(\"prefetch skip reason=active_item item=\"";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("prefetch skip reason=active_item item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_candidateitem)))));
 BA.debugLineNum = 80;BA.debugLine="candidateIndex = scanIndex";
Debug.ShouldStop(32768);
_candidateindex = _scanindex;Debug.locals.put("candidateIndex", _candidateindex);
 BA.debugLineNum = 81;BA.debugLine="Continue";
Debug.ShouldStop(65536);
this.state = 1;
if (true) break;;
 if (true) break;
;
 BA.debugLineNum = 83;BA.debugLine="If candidateType = \"track\" And mediaCacheService";
Debug.ShouldStop(262144);

case 34:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",_candidatetype,BA.ObjectToString("track")) && RemoteObject.solveBoolean("=",_mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_candidateitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))),parent.__c.getField(true,"False"))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 84;BA.debugLine="Trace(\"prefetch skip reason=no_local_track item";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("prefetch skip reason=no_local_track item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_candidateitem)))));
 BA.debugLineNum = 85;BA.debugLine="candidateIndex = scanIndex";
Debug.ShouldStop(1048576);
_candidateindex = _scanindex;Debug.locals.put("candidateIndex", _candidateindex);
 BA.debugLineNum = 86;BA.debugLine="Continue";
Debug.ShouldStop(2097152);
this.state = 1;
if (true) break;;
 if (true) break;
;
 BA.debugLineNum = 88;BA.debugLine="If candidateType = \"ad\" And mediaCacheService.Is";
Debug.ShouldStop(8388608);

case 37:
//if
this.state = 40;
if (RemoteObject.solveBoolean("=",_candidatetype,BA.ObjectToString("ad")) && RemoteObject.solveBoolean("=",_mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_isadcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_candidateitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))),parent.__c.getField(true,"False"))) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 89;BA.debugLine="Trace(\"prefetch skip reason=no_local_ad item=\"";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("prefetch skip reason=no_local_ad item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_candidateitem)))));
 BA.debugLineNum = 90;BA.debugLine="candidateIndex = scanIndex";
Debug.ShouldStop(33554432);
_candidateindex = _scanindex;Debug.locals.put("candidateIndex", _candidateindex);
 BA.debugLineNum = 91;BA.debugLine="Continue";
Debug.ShouldStop(67108864);
this.state = 1;
if (true) break;;
 if (true) break;

case 40:
//C
this.state = 1;
;
 BA.debugLineNum = 93;BA.debugLine="candidateIndex = scanIndex";
Debug.ShouldStop(268435456);
_candidateindex = _scanindex;Debug.locals.put("candidateIndex", _candidateindex);
 BA.debugLineNum = 94;BA.debugLine="Exit";
Debug.ShouldStop(536870912);
this.state = 41;
if (true) break;
 if (true) break;
;
 BA.debugLineNum = 96;BA.debugLine="If candidateIndex < 0 Or candidateIndex >= playQu";
Debug.ShouldStop(-2147483648);

case 41:
//if
this.state = 46;
if (RemoteObject.solveBoolean("<",_candidateindex,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("g",_candidateindex,BA.numberCast(double.class, _playqueue.runMethod(true,"getSize")))) { 
this.state = 43;
;}if (true) break;

case 43:
//C
this.state = 46;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 46:
//C
this.state = 47;
;
 BA.debugLineNum = 97;BA.debugLine="Dim nextItem As Map = playQueue.Get(candidateInde";
Debug.ShouldStop(1);
_nextitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nextitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playqueue.runMethod(false,"Get",(Object)(_candidateindex)));Debug.locals.put("nextItem", _nextitem);Debug.locals.put("nextItem", _nextitem);
 BA.debugLineNum = 98;BA.debugLine="Dim existingPreparedItem As Map = targetPage.Tran";
Debug.ShouldStop(2);
_existingprepareditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_existingprepareditem = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getdirectorprepareditem" /*RemoteObject*/ );Debug.locals.put("existingPreparedItem", _existingprepareditem);Debug.locals.put("existingPreparedItem", _existingprepareditem);
 BA.debugLineNum = 99;BA.debugLine="Dim existingPreparedAudioKey As String = targetPa";
Debug.ShouldStop(4);
_existingpreparedaudiokey = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getdirectorpreparedaudiokey" /*RemoteObject*/ );Debug.locals.put("existingPreparedAudioKey", _existingpreparedaudiokey);Debug.locals.put("existingPreparedAudioKey", _existingpreparedaudiokey);
 BA.debugLineNum = 100;BA.debugLine="If existingPreparedItem.IsInitialized And existin";
Debug.ShouldStop(8);
if (true) break;

case 47:
//if
this.state = 54;
if (RemoteObject.solveBoolean(".",_existingprepareditem.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("!",_existingpreparedaudiokey,BA.ObjectToString(""))) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 101;BA.debugLine="Dim matchArgs As Map";
Debug.ShouldStop(16);
_matchargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("matchArgs", _matchargs);
 BA.debugLineNum = 102;BA.debugLine="matchArgs.Initialize";
Debug.ShouldStop(32);
_matchargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 103;BA.debugLine="matchArgs.Put(\"first\", existingPreparedItem)";
Debug.ShouldStop(64);
_matchargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("first"))),(Object)((_existingprepareditem.getObject())));
 BA.debugLineNum = 104;BA.debugLine="matchArgs.Put(\"second\", nextItem)";
Debug.ShouldStop(128);
_matchargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("second"))),(Object)((_nextitem.getObject())));
 BA.debugLineNum = 105;BA.debugLine="If targetPage.Transition_ItemsMatch(matchArgs) T";
Debug.ShouldStop(256);
if (true) break;

case 50:
//if
this.state = 53;
if (__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_itemsmatch" /*RemoteObject*/ ,(Object)(_matchargs)).<Boolean>get().booleanValue()) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 106;BA.debugLine="Trace(\"prefetch reuse prepared item=\" & Describ";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("prefetch reuse prepared item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_nextitem)))));
 BA.debugLineNum = 107;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
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
 BA.debugLineNum = 110;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
Debug.ShouldStop(8192);
_targetaudiokey = __ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_getinactiveaudiokey" /*RemoteObject*/ ,(Object)(_runtimestate));Debug.locals.put("targetAudioKey", _targetaudiokey);Debug.locals.put("targetAudioKey", _targetaudiokey);
 BA.debugLineNum = 111;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
Debug.ShouldStop(16384);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_clearpreparedstate" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 112;BA.debugLine="Dim pendingPrepareArgs As Map";
Debug.ShouldStop(32768);
_pendingprepareargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("pendingPrepareArgs", _pendingprepareargs);
 BA.debugLineNum = 113;BA.debugLine="pendingPrepareArgs.Initialize";
Debug.ShouldStop(65536);
_pendingprepareargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 114;BA.debugLine="pendingPrepareArgs.Put(\"audioKey\", targetAudioKey";
Debug.ShouldStop(131072);
_pendingprepareargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("audioKey"))),(Object)((_targetaudiokey)));
 BA.debugLineNum = 115;BA.debugLine="pendingPrepareArgs.Put(\"item\", nextItem)";
Debug.ShouldStop(262144);
_pendingprepareargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("item"))),(Object)((_nextitem.getObject())));
 BA.debugLineNum = 116;BA.debugLine="targetPage.Transition_SetDirectorPendingPrepare(p";
Debug.ShouldStop(524288);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_setdirectorpendingprepare" /*RemoteObject*/ ,(Object)(_pendingprepareargs));
 BA.debugLineNum = 117;BA.debugLine="Dim previousFlowState As String = playbackFlowSta";
Debug.ShouldStop(1048576);
_previousflowstate = _playbackflowstate;Debug.locals.put("previousFlowState", _previousflowstate);Debug.locals.put("previousFlowState", _previousflowstate);
 BA.debugLineNum = 118;BA.debugLine="If playbackFlowState = flowPlaying Or playbackFlo";
Debug.ShouldStop(2097152);
if (true) break;

case 55:
//if
this.state = 58;
if (RemoteObject.solveBoolean("=",_playbackflowstate,_flowplaying) || RemoteObject.solveBoolean("=",_playbackflowstate,_flowidle)) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 119;BA.debugLine="Dim flowArgs As Map";
Debug.ShouldStop(4194304);
_flowargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("flowArgs", _flowargs);
 BA.debugLineNum = 120;BA.debugLine="flowArgs.Initialize";
Debug.ShouldStop(8388608);
_flowargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 121;BA.debugLine="flowArgs.Put(\"state\", flowPreparing)";
Debug.ShouldStop(16777216);
_flowargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state"))),(Object)((_flowpreparing)));
 BA.debugLineNum = 122;BA.debugLine="flowArgs.Put(\"reason\", \"prepare_next:\" & nextIte";
Debug.ShouldStop(33554432);
_flowargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable("prepare_next:"),_nextitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable(""))))))));
 BA.debugLineNum = 123;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowA";
Debug.ShouldStop(67108864);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_setplaybackflowstate" /*RemoteObject*/ ,(Object)(_flowargs));
 if (true) break;

case 58:
//C
this.state = 59;
;
 BA.debugLineNum = 125;BA.debugLine="Dim mediaArgs As Map";
Debug.ShouldStop(268435456);
_mediaargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mediaArgs", _mediaargs);
 BA.debugLineNum = 126;BA.debugLine="mediaArgs.Initialize";
Debug.ShouldStop(536870912);
_mediaargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 127;BA.debugLine="mediaArgs.Put(\"audioKey\", targetAudioKey)";
Debug.ShouldStop(1073741824);
_mediaargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("audioKey"))),(Object)((_targetaudiokey)));
 BA.debugLineNum = 128;BA.debugLine="mediaArgs.Put(\"item\", nextItem)";
Debug.ShouldStop(-2147483648);
_mediaargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("item"))),(Object)((_nextitem.getObject())));
 BA.debugLineNum = 129;BA.debugLine="Dim nextItemUrl As String = targetPage.Transition";
Debug.ShouldStop(1);
_nextitemurl = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_resolveplaybackmediaurl" /*RemoteObject*/ ,(Object)(_mediaargs));Debug.locals.put("nextItemUrl", _nextitemurl);Debug.locals.put("nextItemUrl", _nextitemurl);
 BA.debugLineNum = 130;BA.debugLine="If nextItemUrl = \"\" Then";
Debug.ShouldStop(2);
if (true) break;

case 59:
//if
this.state = 62;
if (RemoteObject.solveBoolean("=",_nextitemurl,BA.ObjectToString(""))) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 131;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetAu";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("переход preload ошибка audio="),_targetaudiokey,RemoteObject.createImmutable(" message=empty_media_url"))));
 BA.debugLineNum = 132;BA.debugLine="Return False";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 62:
//C
this.state = 63;
;
 BA.debugLineNum = 134;BA.debugLine="Trace(\"prefetch load audio=\" & targetAudioKey & \"";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("prefetch load audio="),_targetaudiokey,RemoteObject.createImmutable(" item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_nextitem)))));
 BA.debugLineNum = 135;BA.debugLine="Dim volume As Double = targetPage.Transition_Curr";
Debug.ShouldStop(64);
_volume = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_currentvolume" /*RemoteObject*/ ,(Object)(_nextitem));Debug.locals.put("volume", _volume);Debug.locals.put("volume", _volume);
 BA.debugLineNum = 136;BA.debugLine="Dim targetAudio As AudioPlayer = targetPage.Trans";
Debug.ShouldStop(128);
_targetaudio = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getaudiobykey" /*RemoteObject*/ ,(Object)(_targetaudiokey));Debug.locals.put("targetAudio", _targetaudio);Debug.locals.put("targetAudio", _targetaudio);
 BA.debugLineNum = 137;BA.debugLine="targetAudio.LoadUrl(nextItemUrl, volume)";
Debug.ShouldStop(256);
_targetaudio.runClassMethod (b4j.example.audioplayer.class, "_loadurl" /*RemoteObject*/ ,(Object)(_nextitemurl),(Object)(_volume));
 BA.debugLineNum = 138;BA.debugLine="Dim waitArgs As Map";
Debug.ShouldStop(512);
_waitargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("waitArgs", _waitargs);
 BA.debugLineNum = 139;BA.debugLine="waitArgs.Initialize";
Debug.ShouldStop(1024);
_waitargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 140;BA.debugLine="waitArgs.Put(\"audioKey\", targetAudioKey)";
Debug.ShouldStop(2048);
_waitargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("audioKey"))),(Object)((_targetaudiokey)));
 BA.debugLineNum = 141;BA.debugLine="waitArgs.Put(\"item\", nextItem)";
Debug.ShouldStop(4096);
_waitargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("item"))),(Object)((_nextitem.getObject())));
 BA.debugLineNum = 142;BA.debugLine="waitArgs.Put(\"timeoutMs\", 5000)";
Debug.ShouldStop(8192);
_waitargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("timeoutMs"))),(Object)(RemoteObject.createImmutable((5000))));
 BA.debugLineNum = 143;BA.debugLine="Wait For (targetPage.Transition_WaitForPreparedAu";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbacktransitioncoordinator", "preparenextplayable"), __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_waitforpreparedaudio" /*RemoteObject*/ ,(Object)(_waitargs)));
this.state = 73;
return;
case 73:
//C
this.state = 63;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 144;BA.debugLine="If targetPage.Transition_GetPlaybackFlowState = f";
Debug.ShouldStop(32768);
if (true) break;

case 63:
//if
this.state = 72;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getplaybackflowstate" /*RemoteObject*/ ),_flowpreparing)) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 145;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
Debug.ShouldStop(65536);
if (true) break;

case 66:
//if
this.state = 71;
if (BA.ObjectToBoolean(_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False"))))).<Boolean>get().booleanValue()) { 
this.state = 68;
}else {
this.state = 70;
}if (true) break;

case 68:
//C
this.state = 71;
 BA.debugLineNum = 146;BA.debugLine="Dim readyArgs As Map";
Debug.ShouldStop(131072);
_readyargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("readyArgs", _readyargs);
 BA.debugLineNum = 147;BA.debugLine="readyArgs.Initialize";
Debug.ShouldStop(262144);
_readyargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 148;BA.debugLine="readyArgs.Put(\"state\", previousFlowState)";
Debug.ShouldStop(524288);
_readyargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state"))),(Object)((_previousflowstate)));
 BA.debugLineNum = 149;BA.debugLine="readyArgs.Put(\"reason\", \"prepare_ready\")";
Debug.ShouldStop(1048576);
_readyargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((RemoteObject.createImmutable("prepare_ready"))));
 BA.debugLineNum = 150;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(read";
Debug.ShouldStop(2097152);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_setplaybackflowstate" /*RemoteObject*/ ,(Object)(_readyargs));
 BA.debugLineNum = 151;BA.debugLine="Trace(\"prefetch prepared audio=\" & targetAudioK";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("prefetch prepared audio="),_targetaudiokey,RemoteObject.createImmutable(" item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_nextitem)))));
 if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 153;BA.debugLine="Dim failedArgs As Map";
Debug.ShouldStop(16777216);
_failedargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("failedArgs", _failedargs);
 BA.debugLineNum = 154;BA.debugLine="failedArgs.Initialize";
Debug.ShouldStop(33554432);
_failedargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 155;BA.debugLine="failedArgs.Put(\"state\", \"error\")";
Debug.ShouldStop(67108864);
_failedargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state"))),(Object)((RemoteObject.createImmutable("error"))));
 BA.debugLineNum = 156;BA.debugLine="failedArgs.Put(\"reason\", \"prepare_failed\")";
Debug.ShouldStop(134217728);
_failedargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((RemoteObject.createImmutable("prepare_failed"))));
 BA.debugLineNum = 157;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(fail";
Debug.ShouldStop(268435456);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_setplaybackflowstate" /*RemoteObject*/ ,(Object)(_failedargs));
 BA.debugLineNum = 158;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetA";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("переход preload ошибка audio="),_targetaudiokey)));
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
 BA.debugLineNum = 161;BA.debugLine="Return result.GetDefault(\"Success\", False)";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False")))));return;};
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _preparespecificplayable(RemoteObject __ref,RemoteObject _nextitem,RemoteObject _runtimestate,RemoteObject _metastate,RemoteObject _orchestrationstate,RemoteObject _playbackflowstate,RemoteObject _flowplaying,RemoteObject _flowidle,RemoteObject _flowpreparing) throws Exception{
try {
		Debug.PushSubsStack("PrepareSpecificPlayable (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("preparespecificplayable")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","preparespecificplayable", __ref, _nextitem, _runtimestate, _metastate, _orchestrationstate, _playbackflowstate, _flowplaying, _flowidle, _flowpreparing);}
ResumableSub_PrepareSpecificPlayable rsub = new ResumableSub_PrepareSpecificPlayable(null,__ref,_nextitem,_runtimestate,_metastate,_orchestrationstate,_playbackflowstate,_flowplaying,_flowidle,_flowpreparing);
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
public static class ResumableSub_PrepareSpecificPlayable extends BA.ResumableSub {
public ResumableSub_PrepareSpecificPlayable(b4j.example.playbacktransitioncoordinator parent,RemoteObject __ref,RemoteObject _nextitem,RemoteObject _runtimestate,RemoteObject _metastate,RemoteObject _orchestrationstate,RemoteObject _playbackflowstate,RemoteObject _flowplaying,RemoteObject _flowidle,RemoteObject _flowpreparing) {
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
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbacktransitioncoordinator parent;
RemoteObject _nextitem;
RemoteObject _runtimestate;
RemoteObject _metastate;
RemoteObject _orchestrationstate;
RemoteObject _playbackflowstate;
RemoteObject _flowplaying;
RemoteObject _flowidle;
RemoteObject _flowpreparing;
RemoteObject _existingprepareditem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _existingpreparedaudiokey = RemoteObject.createImmutable("");
RemoteObject _matchargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _targetaudiokey = RemoteObject.createImmutable("");
RemoteObject _pendingprepareargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _previousflowstate = RemoteObject.createImmutable("");
RemoteObject _flowargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mediaargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nextitemurl = RemoteObject.createImmutable("");
RemoteObject _volume = RemoteObject.createImmutable(0);
RemoteObject _targetaudio = RemoteObject.declareNull("b4j.example.audioplayer");
RemoteObject _waitargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _readyargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _failedargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrepareSpecificPlayable (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,164);
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
Debug.locals.put("nextItem", _nextitem);
Debug.locals.put("runtimeState", _runtimestate);
Debug.locals.put("metaState", _metastate);
Debug.locals.put("orchestrationState", _orchestrationstate);
Debug.locals.put("playbackFlowState", _playbackflowstate);
Debug.locals.put("flowPlaying", _flowplaying);
Debug.locals.put("flowIdle", _flowidle);
Debug.locals.put("flowPreparing", _flowpreparing);
 BA.debugLineNum = 165;BA.debugLine="If nextItem.IsInitialized = False Or nextItem.Siz";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_nextitem.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_nextitem.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 166;BA.debugLine="Dim existingPreparedItem As Map = targetPage.Tran";
Debug.ShouldStop(32);
_existingprepareditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_existingprepareditem = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getdirectorprepareditem" /*RemoteObject*/ );Debug.locals.put("existingPreparedItem", _existingprepareditem);Debug.locals.put("existingPreparedItem", _existingprepareditem);
 BA.debugLineNum = 167;BA.debugLine="Dim existingPreparedAudioKey As String = targetPa";
Debug.ShouldStop(64);
_existingpreparedaudiokey = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getdirectorpreparedaudiokey" /*RemoteObject*/ );Debug.locals.put("existingPreparedAudioKey", _existingpreparedaudiokey);Debug.locals.put("existingPreparedAudioKey", _existingpreparedaudiokey);
 BA.debugLineNum = 168;BA.debugLine="If existingPreparedItem.IsInitialized And existin";
Debug.ShouldStop(128);
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean(".",_existingprepareditem.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("!",_existingpreparedaudiokey,BA.ObjectToString(""))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 169;BA.debugLine="Dim matchArgs As Map";
Debug.ShouldStop(256);
_matchargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("matchArgs", _matchargs);
 BA.debugLineNum = 170;BA.debugLine="matchArgs.Initialize";
Debug.ShouldStop(512);
_matchargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 171;BA.debugLine="matchArgs.Put(\"first\", existingPreparedItem)";
Debug.ShouldStop(1024);
_matchargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("first"))),(Object)((_existingprepareditem.getObject())));
 BA.debugLineNum = 172;BA.debugLine="matchArgs.Put(\"second\", nextItem)";
Debug.ShouldStop(2048);
_matchargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("second"))),(Object)((_nextitem.getObject())));
 BA.debugLineNum = 173;BA.debugLine="If targetPage.Transition_ItemsMatch(matchArgs) T";
Debug.ShouldStop(4096);
if (true) break;

case 10:
//if
this.state = 13;
if (__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_itemsmatch" /*RemoteObject*/ ,(Object)(_matchargs)).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 174;BA.debugLine="Trace(\"prefetch reuse prepared item=\" & Describ";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("prefetch reuse prepared item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_nextitem)))));
 BA.debugLineNum = 175;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
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
 BA.debugLineNum = 178;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
Debug.ShouldStop(131072);
_targetaudiokey = __ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_getinactiveaudiokey" /*RemoteObject*/ ,(Object)(_runtimestate));Debug.locals.put("targetAudioKey", _targetaudiokey);Debug.locals.put("targetAudioKey", _targetaudiokey);
 BA.debugLineNum = 179;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
Debug.ShouldStop(262144);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_clearpreparedstate" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 180;BA.debugLine="Dim pendingPrepareArgs As Map";
Debug.ShouldStop(524288);
_pendingprepareargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("pendingPrepareArgs", _pendingprepareargs);
 BA.debugLineNum = 181;BA.debugLine="pendingPrepareArgs.Initialize";
Debug.ShouldStop(1048576);
_pendingprepareargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 182;BA.debugLine="pendingPrepareArgs.Put(\"audioKey\", targetAudioKey";
Debug.ShouldStop(2097152);
_pendingprepareargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("audioKey"))),(Object)((_targetaudiokey)));
 BA.debugLineNum = 183;BA.debugLine="pendingPrepareArgs.Put(\"item\", nextItem)";
Debug.ShouldStop(4194304);
_pendingprepareargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("item"))),(Object)((_nextitem.getObject())));
 BA.debugLineNum = 184;BA.debugLine="targetPage.Transition_SetDirectorPendingPrepare(p";
Debug.ShouldStop(8388608);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_setdirectorpendingprepare" /*RemoteObject*/ ,(Object)(_pendingprepareargs));
 BA.debugLineNum = 185;BA.debugLine="Dim previousFlowState As String = playbackFlowSta";
Debug.ShouldStop(16777216);
_previousflowstate = _playbackflowstate;Debug.locals.put("previousFlowState", _previousflowstate);Debug.locals.put("previousFlowState", _previousflowstate);
 BA.debugLineNum = 186;BA.debugLine="If playbackFlowState = flowPlaying Or playbackFlo";
Debug.ShouldStop(33554432);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_playbackflowstate,_flowplaying) || RemoteObject.solveBoolean("=",_playbackflowstate,_flowidle)) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 187;BA.debugLine="Dim flowArgs As Map";
Debug.ShouldStop(67108864);
_flowargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("flowArgs", _flowargs);
 BA.debugLineNum = 188;BA.debugLine="flowArgs.Initialize";
Debug.ShouldStop(134217728);
_flowargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 189;BA.debugLine="flowArgs.Put(\"state\", flowPreparing)";
Debug.ShouldStop(268435456);
_flowargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state"))),(Object)((_flowpreparing)));
 BA.debugLineNum = 190;BA.debugLine="flowArgs.Put(\"reason\", \"prepare_direct:\" & nextI";
Debug.ShouldStop(536870912);
_flowargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable("prepare_direct:"),_nextitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable(""))))))));
 BA.debugLineNum = 191;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowA";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_setplaybackflowstate" /*RemoteObject*/ ,(Object)(_flowargs));
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 193;BA.debugLine="Dim mediaArgs As Map";
Debug.ShouldStop(1);
_mediaargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mediaArgs", _mediaargs);
 BA.debugLineNum = 194;BA.debugLine="mediaArgs.Initialize";
Debug.ShouldStop(2);
_mediaargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 195;BA.debugLine="mediaArgs.Put(\"audioKey\", targetAudioKey)";
Debug.ShouldStop(4);
_mediaargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("audioKey"))),(Object)((_targetaudiokey)));
 BA.debugLineNum = 196;BA.debugLine="mediaArgs.Put(\"item\", nextItem)";
Debug.ShouldStop(8);
_mediaargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("item"))),(Object)((_nextitem.getObject())));
 BA.debugLineNum = 197;BA.debugLine="Dim nextItemUrl As String = targetPage.Transition";
Debug.ShouldStop(16);
_nextitemurl = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_resolveplaybackmediaurl" /*RemoteObject*/ ,(Object)(_mediaargs));Debug.locals.put("nextItemUrl", _nextitemurl);Debug.locals.put("nextItemUrl", _nextitemurl);
 BA.debugLineNum = 198;BA.debugLine="If nextItemUrl = \"\" Then";
Debug.ShouldStop(32);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_nextitemurl,BA.ObjectToString(""))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 199;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetAu";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("переход preload ошибка audio="),_targetaudiokey,RemoteObject.createImmutable(" message=empty_media_url"))));
 BA.debugLineNum = 200;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 202;BA.debugLine="Trace(\"prefetch load audio=\" & targetAudioKey & \"";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("prefetch load audio="),_targetaudiokey,RemoteObject.createImmutable(" item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_nextitem)))));
 BA.debugLineNum = 203;BA.debugLine="Dim volume As Double = targetPage.Transition_Curr";
Debug.ShouldStop(1024);
_volume = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_currentvolume" /*RemoteObject*/ ,(Object)(_nextitem));Debug.locals.put("volume", _volume);Debug.locals.put("volume", _volume);
 BA.debugLineNum = 204;BA.debugLine="Dim targetAudio As AudioPlayer = targetPage.Trans";
Debug.ShouldStop(2048);
_targetaudio = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getaudiobykey" /*RemoteObject*/ ,(Object)(_targetaudiokey));Debug.locals.put("targetAudio", _targetaudio);Debug.locals.put("targetAudio", _targetaudio);
 BA.debugLineNum = 205;BA.debugLine="targetAudio.LoadUrl(nextItemUrl, volume)";
Debug.ShouldStop(4096);
_targetaudio.runClassMethod (b4j.example.audioplayer.class, "_loadurl" /*RemoteObject*/ ,(Object)(_nextitemurl),(Object)(_volume));
 BA.debugLineNum = 206;BA.debugLine="Dim waitArgs As Map";
Debug.ShouldStop(8192);
_waitargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("waitArgs", _waitargs);
 BA.debugLineNum = 207;BA.debugLine="waitArgs.Initialize";
Debug.ShouldStop(16384);
_waitargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 208;BA.debugLine="waitArgs.Put(\"audioKey\", targetAudioKey)";
Debug.ShouldStop(32768);
_waitargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("audioKey"))),(Object)((_targetaudiokey)));
 BA.debugLineNum = 209;BA.debugLine="waitArgs.Put(\"item\", nextItem)";
Debug.ShouldStop(65536);
_waitargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("item"))),(Object)((_nextitem.getObject())));
 BA.debugLineNum = 210;BA.debugLine="waitArgs.Put(\"timeoutMs\", 5000)";
Debug.ShouldStop(131072);
_waitargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("timeoutMs"))),(Object)(RemoteObject.createImmutable((5000))));
 BA.debugLineNum = 211;BA.debugLine="Wait For (targetPage.Transition_WaitForPreparedAu";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbacktransitioncoordinator", "preparespecificplayable"), __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_waitforpreparedaudio" /*RemoteObject*/ ,(Object)(_waitargs)));
this.state = 33;
return;
case 33:
//C
this.state = 23;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 212;BA.debugLine="If targetPage.Transition_GetPlaybackFlowState = f";
Debug.ShouldStop(524288);
if (true) break;

case 23:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getplaybackflowstate" /*RemoteObject*/ ),_flowpreparing)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 213;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 26:
//if
this.state = 31;
if (BA.ObjectToBoolean(_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False"))))).<Boolean>get().booleanValue()) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 214;BA.debugLine="Dim readyArgs As Map";
Debug.ShouldStop(2097152);
_readyargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("readyArgs", _readyargs);
 BA.debugLineNum = 215;BA.debugLine="readyArgs.Initialize";
Debug.ShouldStop(4194304);
_readyargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 216;BA.debugLine="readyArgs.Put(\"state\", previousFlowState)";
Debug.ShouldStop(8388608);
_readyargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state"))),(Object)((_previousflowstate)));
 BA.debugLineNum = 217;BA.debugLine="readyArgs.Put(\"reason\", \"prepare_ready\")";
Debug.ShouldStop(16777216);
_readyargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((RemoteObject.createImmutable("prepare_ready"))));
 BA.debugLineNum = 218;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(read";
Debug.ShouldStop(33554432);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_setplaybackflowstate" /*RemoteObject*/ ,(Object)(_readyargs));
 BA.debugLineNum = 219;BA.debugLine="Trace(\"prefetch prepared audio=\" & targetAudioK";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("prefetch prepared audio="),_targetaudiokey,RemoteObject.createImmutable(" item="),__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_describeitem" /*RemoteObject*/ ,(Object)(_nextitem)))));
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 221;BA.debugLine="Dim failedArgs As Map";
Debug.ShouldStop(268435456);
_failedargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("failedArgs", _failedargs);
 BA.debugLineNum = 222;BA.debugLine="failedArgs.Initialize";
Debug.ShouldStop(536870912);
_failedargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 223;BA.debugLine="failedArgs.Put(\"state\", \"error\")";
Debug.ShouldStop(1073741824);
_failedargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state"))),(Object)((RemoteObject.createImmutable("error"))));
 BA.debugLineNum = 224;BA.debugLine="failedArgs.Put(\"reason\", \"prepare_failed\")";
Debug.ShouldStop(-2147483648);
_failedargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((RemoteObject.createImmutable("prepare_failed"))));
 BA.debugLineNum = 225;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(fail";
Debug.ShouldStop(1);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_setplaybackflowstate" /*RemoteObject*/ ,(Object)(_failedargs));
 BA.debugLineNum = 226;BA.debugLine="Trace(\"переход preload ошибка audio=\" & targetA";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("переход preload ошибка audio="),_targetaudiokey)));
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
 BA.debugLineNum = 229;BA.debugLine="Return result.GetDefault(\"Success\", False)";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False")))));return;};
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _promotepreparedplayer(RemoteObject __ref,RemoteObject _runtimestate,RemoteObject _dataresolver,RemoteObject _storage,RemoteObject _fadeinms,RemoteObject _fadeoutms,RemoteObject _flowtransitioning) throws Exception{
try {
		Debug.PushSubsStack("PromotePreparedPlayer (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,233);
if (RapidSub.canDelegate("promotepreparedplayer")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","promotepreparedplayer", __ref, _runtimestate, _dataresolver, _storage, _fadeinms, _fadeoutms, _flowtransitioning);}
RemoteObject _preparedaudiokey = RemoteObject.createImmutable("");
RemoteObject _prepareditem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
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
 BA.debugLineNum = 233;BA.debugLine="Public Sub PromotePreparedPlayer(runtimeState As P";
Debug.ShouldStop(256);
 BA.debugLineNum = 234;BA.debugLine="Dim preparedAudioKey As String = targetPage.Trans";
Debug.ShouldStop(512);
_preparedaudiokey = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getdirectorpreparedaudiokey" /*RemoteObject*/ );Debug.locals.put("preparedAudioKey", _preparedaudiokey);Debug.locals.put("preparedAudioKey", _preparedaudiokey);
 BA.debugLineNum = 235;BA.debugLine="Dim preparedItem As Map = targetPage.Transition_G";
Debug.ShouldStop(1024);
_prepareditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_prepareditem = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getdirectorprepareditem" /*RemoteObject*/ );Debug.locals.put("preparedItem", _prepareditem);Debug.locals.put("preparedItem", _prepareditem);
 BA.debugLineNum = 236;BA.debugLine="If preparedAudioKey = \"\" Or preparedItem.IsInitia";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_preparedaudiokey,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_prepareditem.runMethod(true,"IsInitialized"),playbacktransitioncoordinator.__c.getField(true,"False"))) { 
 BA.debugLineNum = 237;BA.debugLine="Trace(\"переход prepared reject reason=missing_pr";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("переход prepared reject reason=missing_prepared")));
 BA.debugLineNum = 238;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) return playbacktransitioncoordinator.__c.getField(true,"False");
 };
 BA.debugLineNum = 240;BA.debugLine="Dim flowArgs As Map";
Debug.ShouldStop(32768);
_flowargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("flowArgs", _flowargs);
 BA.debugLineNum = 241;BA.debugLine="flowArgs.Initialize";
Debug.ShouldStop(65536);
_flowargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 242;BA.debugLine="flowArgs.Put(\"state\", flowTransitioning)";
Debug.ShouldStop(131072);
_flowargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state"))),(Object)((_flowtransitioning)));
 BA.debugLineNum = 243;BA.debugLine="flowArgs.Put(\"reason\", \"promote_prepared\")";
Debug.ShouldStop(262144);
_flowargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((RemoteObject.createImmutable("promote_prepared"))));
 BA.debugLineNum = 244;BA.debugLine="targetPage.Transition_SetPlaybackFlowState(flowAr";
Debug.ShouldStop(524288);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_setplaybackflowstate" /*RemoteObject*/ ,(Object)(_flowargs));
 BA.debugLineNum = 245;BA.debugLine="Dim previousAudioKey As String = targetPage.Trans";
Debug.ShouldStop(1048576);
_previousaudiokey = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getdirectoractiveaudiokey" /*RemoteObject*/ );Debug.locals.put("previousAudioKey", _previousaudiokey);Debug.locals.put("previousAudioKey", _previousaudiokey);
 BA.debugLineNum = 246;BA.debugLine="Dim nextAudioKey As String = preparedAudioKey";
Debug.ShouldStop(2097152);
_nextaudiokey = _preparedaudiokey;Debug.locals.put("nextAudioKey", _nextaudiokey);Debug.locals.put("nextAudioKey", _nextaudiokey);
 BA.debugLineNum = 247;BA.debugLine="Dim promotedItem As Map = CloneMap(preparedItem)";
Debug.ShouldStop(4194304);
_promoteditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_promoteditem = __ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_clonemap" /*RemoteObject*/ ,(Object)(_prepareditem));Debug.locals.put("promotedItem", _promoteditem);Debug.locals.put("promotedItem", _promoteditem);
 BA.debugLineNum = 248;BA.debugLine="targetPage.Transition_ConsumePreparedQueueItem";
Debug.ShouldStop(8388608);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_consumepreparedqueueitem" /*RemoteObject*/ );
 BA.debugLineNum = 249;BA.debugLine="If previousAudioKey <> \"\" And previousAudioKey <>";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("!",_previousaudiokey,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_previousaudiokey,_nextaudiokey)) { 
 BA.debugLineNum = 250;BA.debugLine="Dim previousAudio As AudioPlayer = targetPage.Tr";
Debug.ShouldStop(33554432);
_previousaudio = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_getaudiobykey" /*RemoteObject*/ ,(Object)(_previousaudiokey));Debug.locals.put("previousAudio", _previousaudio);Debug.locals.put("previousAudio", _previousaudio);
 BA.debugLineNum = 251;BA.debugLine="previousAudio.Stop(fadeOutMs)";
Debug.ShouldStop(67108864);
_previousaudio.runClassMethod (b4j.example.audioplayer.class, "_stop" /*RemoteObject*/ ,(Object)(_fadeoutms));
 };
 BA.debugLineNum = 253;BA.debugLine="dataResolver.CommitPlaylistCursor(storage, promot";
Debug.ShouldStop(268435456);
_dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_commitplaylistcursor" /*RemoteObject*/ ,(Object)(_storage),(Object)(_promoteditem));
 BA.debugLineNum = 254;BA.debugLine="Dim activateArgs As Map";
Debug.ShouldStop(536870912);
_activateargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("activateArgs", _activateargs);
 BA.debugLineNum = 255;BA.debugLine="activateArgs.Initialize";
Debug.ShouldStop(1073741824);
_activateargs.runVoidMethod ("Initialize");
 BA.debugLineNum = 256;BA.debugLine="activateArgs.Put(\"audioKey\", nextAudioKey)";
Debug.ShouldStop(-2147483648);
_activateargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("audioKey"))),(Object)((_nextaudiokey)));
 BA.debugLineNum = 257;BA.debugLine="activateArgs.Put(\"item\", promotedItem)";
Debug.ShouldStop(1);
_activateargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("item"))),(Object)((_promoteditem.getObject())));
 BA.debugLineNum = 258;BA.debugLine="activateArgs.Put(\"fadeInMs\", fadeInMs)";
Debug.ShouldStop(2);
_activateargs.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fadeInMs"))),(Object)((_fadeinms)));
 BA.debugLineNum = 259;BA.debugLine="Trace(\"prepared promote audio=\" & nextAudioKey &";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.playbacktransitioncoordinator.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("prepared promote audio="),_nextaudiokey,RemoteObject.createImmutable(" type="),_promoteditem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(" id="),_promoteditem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 260;BA.debugLine="targetPage.Transition_ActivateLoadedItem(activate";
Debug.ShouldStop(8);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_activateloadeditem" /*RemoteObject*/ ,(Object)(_activateargs));
 BA.debugLineNum = 261;BA.debugLine="targetPage.Transition_ClearPreparedState(False)";
Debug.ShouldStop(16);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_transition_clearpreparedstate" /*RemoteObject*/ ,(Object)(playbacktransitioncoordinator.__c.getField(true,"False")));
 BA.debugLineNum = 262;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) return playbacktransitioncoordinator.__c.getField(true,"True");
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Trace (playbacktransitioncoordinator) ","playbacktransitioncoordinator",14,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "playbacktransitioncoordinator","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 288;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="targetPage.TraceLog(message)";
Debug.ShouldStop(1);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_tracelog" /*RemoteObject*/ ,(Object)(_message));
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}