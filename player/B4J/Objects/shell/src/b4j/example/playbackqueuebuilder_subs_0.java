package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackqueuebuilder_subs_0 {


public static RemoteObject  _applyexistingqueuetoworkingcursors(RemoteObject __ref,RemoteObject _workingcursors,RemoteObject _playqueue) throws Exception{
try {
		Debug.PushSubsStack("ApplyExistingQueueToWorkingCursors (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("applyexistingqueuetoworkingcursors")) { return __ref.runUserSub(false, "playbackqueuebuilder","applyexistingqueuetoworkingcursors", __ref, _workingcursors, _playqueue);}
RemoteObject _itemobject = RemoteObject.declareNull("Object");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slotkey = RemoteObject.createImmutable("");
RemoteObject _nextstored = RemoteObject.createImmutable(0);
Debug.locals.put("workingCursors", _workingcursors);
Debug.locals.put("playQueue", _playqueue);
 BA.debugLineNum = 56;BA.debugLine="Private Sub ApplyExistingQueueToWorkingCursors(wor";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="If workingCursors.IsInitialized = False Then Retu";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_workingcursors.runMethod(true,"IsInitialized"),playbackqueuebuilder.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 58;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_playqueue.runMethod(true,"IsInitialized"),playbackqueuebuilder.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playqueue.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 59;BA.debugLine="For Each itemObject As Object In playQueue";
Debug.ShouldStop(67108864);
{
final RemoteObject group3 = _playqueue;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_itemobject = group3.runMethod(false,"Get",index3);Debug.locals.put("itemObject", _itemobject);
Debug.locals.put("itemObject", _itemobject);
 BA.debugLineNum = 60;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("i",_itemobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 61;BA.debugLine="Dim item As Map = itemObject";
Debug.ShouldStop(268435456);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 62;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_isvaliddatatrackitem" /*RemoteObject*/ ,(Object)(_item)),playbackqueuebuilder.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 63;BA.debugLine="Dim slotKey As String = item.GetDefault(\"slot_k";
Debug.ShouldStop(1073741824);
_slotkey = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_key"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("slotKey", _slotkey);Debug.locals.put("slotKey", _slotkey);
 BA.debugLineNum = 64;BA.debugLine="If slotKey = \"\" Then Continue";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_slotkey,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 65;BA.debugLine="Dim nextStored As Int = item.GetDefault(\"playli";
Debug.ShouldStop(1);
_nextstored = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_index"))),(Object)(RemoteObject.createImmutable((0))))),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("nextStored", _nextstored);Debug.locals.put("nextStored", _nextstored);
 BA.debugLineNum = 66;BA.debugLine="workingCursors.Put(slotKey, nextStored)";
Debug.ShouldStop(2);
_workingcursors.runVoidMethod ("Put",(Object)((_slotkey)),(Object)((_nextstored)));
 };
 }
}Debug.locals.put("itemObject", _itemobject);
;
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _builddataslotkey(RemoteObject __ref,RemoteObject _currentslot) throws Exception{
try {
		Debug.PushSubsStack("BuildDataSlotKey (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,213);
if (RapidSub.canDelegate("builddataslotkey")) { return __ref.runUserSub(false, "playbackqueuebuilder","builddataslotkey", __ref, _currentslot);}
Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 213;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 214;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.concat(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable("|"),_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable("|"),_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildnexttrackfromdataplayback(RemoteObject __ref,RemoteObject _workingcursors,RemoteObject _offlinedata,RemoteObject _nowticks,RemoteObject _dataresolver,RemoteObject _mediacacheservice) throws Exception{
try {
		Debug.PushSubsStack("BuildNextTrackFromDataPlayback (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("buildnexttrackfromdataplayback")) { return __ref.runUserSub(false, "playbackqueuebuilder","buildnexttrackfromdataplayback", __ref, _workingcursors, _offlinedata, _nowticks, _dataresolver, _mediacacheservice);}
ResumableSub_BuildNextTrackFromDataPlayback rsub = new ResumableSub_BuildNextTrackFromDataPlayback(null,__ref,_workingcursors,_offlinedata,_nowticks,_dataresolver,_mediacacheservice);
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
public static class ResumableSub_BuildNextTrackFromDataPlayback extends BA.ResumableSub {
public ResumableSub_BuildNextTrackFromDataPlayback(b4j.example.playbackqueuebuilder parent,RemoteObject __ref,RemoteObject _workingcursors,RemoteObject _offlinedata,RemoteObject _nowticks,RemoteObject _dataresolver,RemoteObject _mediacacheservice) {
this.parent = parent;
this.__ref = __ref;
this._workingcursors = _workingcursors;
this._offlinedata = _offlinedata;
this._nowticks = _nowticks;
this._dataresolver = _dataresolver;
this._mediacacheservice = _mediacacheservice;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackqueuebuilder parent;
RemoteObject _workingcursors;
RemoteObject _offlinedata;
RemoteObject _nowticks;
RemoteObject _dataresolver;
RemoteObject _mediacacheservice;
RemoteObject _emptyitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _currentslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _attempt = 0;
RemoteObject _playlistdescriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _canuseplaylist = RemoteObject.createImmutable(false);
RemoteObject _playlistdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _downloaded = RemoteObject.createImmutable(false);
RemoteObject _chosentrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _chosenqueueitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _singletrackitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _downloadedtrack = RemoteObject.createImmutable(false);
RemoteObject _fallbacktrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fallbackqueueitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int step13;
int limit13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BuildNextTrackFromDataPlayback (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,72);
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
Debug.locals.put("workingCursors", _workingcursors);
Debug.locals.put("offlineData", _offlinedata);
Debug.locals.put("nowTicks", _nowticks);
Debug.locals.put("dataResolver", _dataresolver);
Debug.locals.put("mediaCacheService", _mediacacheservice);
 BA.debugLineNum = 73;BA.debugLine="Dim emptyItem As Map";
Debug.ShouldStop(256);
_emptyitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyItem", _emptyitem);
 BA.debugLineNum = 74;BA.debugLine="emptyItem.Initialize";
Debug.ShouldStop(512);
_emptyitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 75;BA.debugLine="Dim currentSlot As Map = dataResolver.ResolveData";
Debug.ShouldStop(1024);
_currentslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_currentslot = _dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvedataslotatticks" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(_nowticks));Debug.locals.put("currentSlot", _currentslot);Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 76;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 77;BA.debugLine="Trace(\"очередь next ошибка reason=current_slot_u";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("очередь next ошибка reason=current_slot_unavailable")));
 BA.debugLineNum = 78;BA.debugLine="Return emptyItem";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_emptyitem));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 80;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
Debug.ShouldStop(32768);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(parent.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 81;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
Debug.ShouldStop(65536);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlists.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 82;BA.debugLine="Trace(\"очередь next ошибка reason=no_playlists\")";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("очередь next ошибка reason=no_playlists")));
 BA.debugLineNum = 83;BA.debugLine="Return emptyItem";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_emptyitem));return;};
 if (true) break;
;
 BA.debugLineNum = 85;BA.debugLine="For attempt = 0 To playlists.Size - 1";
Debug.ShouldStop(1048576);

case 8:
//for
this.state = 56;
step13 = 1;
limit13 = RemoteObject.solve(new RemoteObject[] {_playlists.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_attempt = 0 ;
Debug.locals.put("attempt", _attempt);
this.state = 57;
if (true) break;

case 57:
//C
this.state = 56;
if ((step13 > 0 && _attempt <= limit13) || (step13 < 0 && _attempt >= limit13)) this.state = 10;
if (true) break;

case 58:
//C
this.state = 57;
_attempt = ((int)(0 + _attempt + step13)) ;
Debug.locals.put("attempt", _attempt);
if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 86;BA.debugLine="Dim playlistDescriptor As Map = dataResolver.Cho";
Debug.ShouldStop(2097152);
_playlistdescriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistdescriptor = _dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_choosenextplaylistdescriptor" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_workingcursors));Debug.locals.put("playlistDescriptor", _playlistdescriptor);Debug.locals.put("playlistDescriptor", _playlistdescriptor);
 BA.debugLineNum = 87;BA.debugLine="If playlistDescriptor.IsInitialized = False Or p";
Debug.ShouldStop(4194304);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_playlistdescriptor.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlistdescriptor.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
this.state = 56;
if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 88;BA.debugLine="Dim canUsePlaylist As Boolean = True";
Debug.ShouldStop(8388608);
_canuseplaylist = parent.__c.getField(true,"True");Debug.locals.put("canUsePlaylist", _canuseplaylist);Debug.locals.put("canUsePlaylist", _canuseplaylist);
 BA.debugLineNum = 89;BA.debugLine="Dim playlistData As Map = dataResolver.LoadCache";
Debug.ShouldStop(16777216);
_playlistdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistdata = _dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_loadcachedplaylistmetadata" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));Debug.locals.put("playlistData", _playlistdata);Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 90;BA.debugLine="If playlistData.IsInitialized = False Or playlis";
Debug.ShouldStop(33554432);
if (true) break;

case 17:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_playlistdata.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlistdata.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 91;BA.debugLine="Wait For (targetPage.QueueBuilder_EnsureSingleP";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackqueuebuilder", "buildnexttrackfromdataplayback"), __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_queuebuilder_ensuresingleplaylistmetadata" /*RemoteObject*/ ,(Object)(_playlistdescriptor)));
this.state = 59;
return;
case 59:
//C
this.state = 20;
_downloaded = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("downloaded", _downloaded);
;
 BA.debugLineNum = 92;BA.debugLine="If downloaded = False Then";
Debug.ShouldStop(134217728);
if (true) break;

case 20:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_downloaded,parent.__c.getField(true,"False"))) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 31;
 BA.debugLineNum = 93;BA.debugLine="canUsePlaylist = False";
Debug.ShouldStop(268435456);
_canuseplaylist = parent.__c.getField(true,"False");Debug.locals.put("canUsePlaylist", _canuseplaylist);
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 95;BA.debugLine="playlistData = dataResolver.LoadCachedPlaylist";
Debug.ShouldStop(1073741824);
_playlistdata = _dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_loadcachedplaylistmetadata" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 96;BA.debugLine="If playlistData.IsInitialized = False Or playl";
Debug.ShouldStop(-2147483648);
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_playlistdata.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlistdata.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
_canuseplaylist = parent.__c.getField(true,"False");Debug.locals.put("canUsePlaylist", _canuseplaylist);
if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;
;
 BA.debugLineNum = 99;BA.debugLine="If canUsePlaylist = False Then";
Debug.ShouldStop(4);

case 32:
//if
this.state = 55;
if (RemoteObject.solveBoolean("=",_canuseplaylist,parent.__c.getField(true,"False"))) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 55;
 BA.debugLineNum = 100;BA.debugLine="Trace(\"очередь playlist skip reason=metadata_un";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("очередь playlist skip reason=metadata_unavailable playlistId="),_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 102;BA.debugLine="Dim chosenTrack As Map = dataResolver.ChooseRan";
Debug.ShouldStop(32);
_chosentrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_chosentrack = _dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_chooserandomtrackfromplaylist" /*RemoteObject*/ ,(Object)(_playlistdata),(Object)(_mediacacheservice),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("chosenTrack", _chosentrack);Debug.locals.put("chosenTrack", _chosentrack);
 BA.debugLineNum = 103;BA.debugLine="If chosenTrack.IsInitialized = False Or chosenT";
Debug.ShouldStop(64);
if (true) break;

case 37:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",_chosentrack.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_chosentrack.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 39;
}else {
this.state = 41;
}if (true) break;

case 39:
//C
this.state = 54;
 BA.debugLineNum = 104;BA.debugLine="Trace(\"очередь next ошибка reason=no_track pla";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("очередь next ошибка reason=no_track playlistId="),_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 106;BA.debugLine="Dim chosenQueueItem As Map = dataResolver.Crea";
Debug.ShouldStop(512);
_chosenqueueitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_chosenqueueitem = _dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_createqueuetrackfromplaylist" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_playlistdescriptor),(Object)(_chosentrack),(Object)(_offlinedata));Debug.locals.put("chosenQueueItem", _chosenqueueitem);Debug.locals.put("chosenQueueItem", _chosenqueueitem);
 BA.debugLineNum = 107;BA.debugLine="If mediaCacheService.IsTrackCached(chosenQueue";
Debug.ShouldStop(1024);
if (true) break;

case 42:
//if
this.state = 45;
if (_mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_chosenqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))).<Boolean>get().booleanValue()) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 108;BA.debugLine="Trace(\"очередь next итог playlistId=\" & playl";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("очередь next итог playlistId="),_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(" trackId="),_chosenqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(" source=cache"))));
 BA.debugLineNum = 109;BA.debugLine="dataResolver.RememberResolvedTrack(chosenQueu";
Debug.ShouldStop(4096);
_dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_rememberresolvedtrack" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_chosenqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 110;BA.debugLine="dataResolver.RememberResolvedTrackForPlaylist";
Debug.ShouldStop(8192);
_dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_rememberresolvedtrackforplaylist" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_chosenqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToString(_chosenqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 111;BA.debugLine="Return chosenQueueItem";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_chosenqueueitem));return;};
 if (true) break;

case 45:
//C
this.state = 46;
;
 BA.debugLineNum = 113;BA.debugLine="Dim singleTrackItems As List";
Debug.ShouldStop(65536);
_singletrackitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("singleTrackItems", _singletrackitems);
 BA.debugLineNum = 114;BA.debugLine="singleTrackItems.Initialize";
Debug.ShouldStop(131072);
_singletrackitems.runVoidMethod ("Initialize");
 BA.debugLineNum = 115;BA.debugLine="singleTrackItems.Add(chosenQueueItem)";
Debug.ShouldStop(262144);
_singletrackitems.runVoidMethod ("Add",(Object)((_chosenqueueitem.getObject())));
 BA.debugLineNum = 116;BA.debugLine="Wait For (mediaCacheService.EnsureTracksCached";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackqueuebuilder", "buildnexttrackfromdataplayback"), _mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_ensuretrackscached" /*RemoteObject*/ ,(Object)(_singletrackitems),(Object)(BA.numberCast(int.class, 1))));
this.state = 60;
return;
case 60:
//C
this.state = 46;
_downloadedtrack = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("downloadedTrack", _downloadedtrack);
;
 BA.debugLineNum = 117;BA.debugLine="If mediaCacheService.IsTrackCached(chosenQueue";
Debug.ShouldStop(1048576);
if (true) break;

case 46:
//if
this.state = 49;
if (_mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_chosenqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))).<Boolean>get().booleanValue()) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 118;BA.debugLine="Trace(\"очередь next итог playlistId=\" & playl";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("очередь next итог playlistId="),_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(" trackId="),_chosenqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(" source=downloaded"))));
 BA.debugLineNum = 119;BA.debugLine="dataResolver.RememberResolvedTrack(chosenQueu";
Debug.ShouldStop(4194304);
_dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_rememberresolvedtrack" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_chosenqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 120;BA.debugLine="dataResolver.RememberResolvedTrackForPlaylist";
Debug.ShouldStop(8388608);
_dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_rememberresolvedtrackforplaylist" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_chosenqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToString(_chosenqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 121;BA.debugLine="Return chosenQueueItem";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_chosenqueueitem));return;};
 if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 123;BA.debugLine="Dim fallbackTrack As Map = dataResolver.Choose";
Debug.ShouldStop(67108864);
_fallbacktrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fallbacktrack = _dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_chooserandomtrackfromplaylist" /*RemoteObject*/ ,(Object)(_playlistdata),(Object)(_mediacacheservice),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("fallbackTrack", _fallbacktrack);Debug.locals.put("fallbackTrack", _fallbacktrack);
 BA.debugLineNum = 124;BA.debugLine="If fallbackTrack.IsInitialized And fallbackTra";
Debug.ShouldStop(134217728);
if (true) break;

case 50:
//if
this.state = 53;
if (RemoteObject.solveBoolean(".",_fallbacktrack.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_fallbacktrack.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 125;BA.debugLine="Dim fallbackQueueItem As Map = dataResolver.C";
Debug.ShouldStop(268435456);
_fallbackqueueitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fallbackqueueitem = _dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_createqueuetrackfromplaylist" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_playlistdescriptor),(Object)(_fallbacktrack),(Object)(_offlinedata));Debug.locals.put("fallbackQueueItem", _fallbackqueueitem);Debug.locals.put("fallbackQueueItem", _fallbackqueueitem);
 BA.debugLineNum = 126;BA.debugLine="Trace(\"очередь next итог playlistId=\" & playl";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("очередь next итог playlistId="),_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(" trackId="),_fallbackqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(" source=fallback"))));
 BA.debugLineNum = 127;BA.debugLine="dataResolver.RememberResolvedTrack(fallbackQu";
Debug.ShouldStop(1073741824);
_dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_rememberresolvedtrack" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_fallbackqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 128;BA.debugLine="dataResolver.RememberResolvedTrackForPlaylist";
Debug.ShouldStop(-2147483648);
_dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_rememberresolvedtrackforplaylist" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_fallbackqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToString(_fallbackqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 129;BA.debugLine="Return fallbackQueueItem";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_fallbackqueueitem));return;};
 if (true) break;

case 53:
//C
this.state = 54;
;
 BA.debugLineNum = 131;BA.debugLine="Trace(\"очередь next ошибка reason=local_prepar";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("очередь next ошибка reason=local_prepare_failed playlistId="),_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(" trackId="),_chosenqueueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 if (true) break;

case 54:
//C
this.state = 55;
;
 if (true) break;

case 55:
//C
this.state = 58;
;
 if (true) break;
if (true) break;

case 56:
//C
this.state = -1;
Debug.locals.put("attempt", _attempt);
;
 BA.debugLineNum = 135;BA.debugLine="Return emptyItem";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_emptyitem));return;};
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
public static void  _complete(RemoteObject __ref,RemoteObject _downloaded) throws Exception{
}
public static RemoteObject  _buildqueuesignature(RemoteObject __ref,RemoteObject _offlinedata,RemoteObject _nowticks,RemoteObject _dataresolver) throws Exception{
try {
		Debug.PushSubsStack("BuildQueueSignature (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("buildqueuesignature")) { return __ref.runUserSub(false, "playbackqueuebuilder","buildqueuesignature", __ref, _offlinedata, _nowticks, _dataresolver);}
RemoteObject _currentslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _signatureparts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlistobject = RemoteObject.declareNull("Object");
RemoteObject _playlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("offlineData", _offlinedata);
Debug.locals.put("nowTicks", _nowticks);
Debug.locals.put("dataResolver", _dataresolver);
 BA.debugLineNum = 185;BA.debugLine="Public Sub BuildQueueSignature(offlineData As Map,";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="If CanUseDataPlaybackResolver(offlineData) = Fals";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_canusedataplaybackresolver" /*RemoteObject*/ ,(Object)(_offlinedata)),playbackqueuebuilder.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 187;BA.debugLine="Dim currentSlot As Map = dataResolver.ResolveData";
Debug.ShouldStop(67108864);
_currentslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_currentslot = _dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvedataslotatticks" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(_nowticks));Debug.locals.put("currentSlot", _currentslot);Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 188;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"IsInitialized"),playbackqueuebuilder.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 189;BA.debugLine="Dim signatureParts As List";
Debug.ShouldStop(268435456);
_signatureparts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("signatureParts", _signatureparts);
 BA.debugLineNum = 190;BA.debugLine="signatureParts.Initialize";
Debug.ShouldStop(536870912);
_signatureparts.runVoidMethod ("Initialize");
 BA.debugLineNum = 191;BA.debugLine="signatureParts.Add(\"v=4\")";
Debug.ShouldStop(1073741824);
_signatureparts.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("v=4"))));
 BA.debugLineNum = 192;BA.debugLine="signatureParts.Add(\"slot=\" & BuildDataSlotKey(cur";
Debug.ShouldStop(-2147483648);
_signatureparts.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("slot="),__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_builddataslotkey" /*RemoteObject*/ ,(Object)(_currentslot))))));
 BA.debugLineNum = 193;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
Debug.ShouldStop(1);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(playbackqueuebuilder.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 194;BA.debugLine="If playlists.IsInitialized Then";
Debug.ShouldStop(2);
if (_playlists.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 195;BA.debugLine="For Each playlistObject As Object In playlists";
Debug.ShouldStop(4);
{
final RemoteObject group10 = _playlists;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_playlistobject = group10.runMethod(false,"Get",index10);Debug.locals.put("playlistObject", _playlistobject);
Debug.locals.put("playlistObject", _playlistobject);
 BA.debugLineNum = 196;BA.debugLine="If playlistObject Is Map Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("i",_playlistobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 197;BA.debugLine="Dim playlist As Map = playlistObject";
Debug.ShouldStop(16);
_playlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlistobject);Debug.locals.put("playlist", _playlist);Debug.locals.put("playlist", _playlist);
 BA.debugLineNum = 198;BA.debugLine="signatureParts.Add(\"playlist=\" & playlist.GetD";
Debug.ShouldStop(32);
_signatureparts.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("playlist="),_playlist.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(":"),_playlist.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable(""))))))));
 };
 }
}Debug.locals.put("playlistObject", _playlistobject);
;
 };
 BA.debugLineNum = 202;BA.debugLine="signatureParts.Sort(True)";
Debug.ShouldStop(512);
_signatureparts.runVoidMethod ("Sort",(Object)(playbackqueuebuilder.__c.getField(true,"True")));
 BA.debugLineNum = 203;BA.debugLine="Return JoinList(signatureParts, \"|\")";
Debug.ShouldStop(1024);
if (true) return __ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_joinlist" /*RemoteObject*/ ,(Object)(_signatureparts),(Object)(RemoteObject.createImmutable("|")));
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _canusedataplaybackresolver(RemoteObject __ref,RemoteObject _offlinedata) throws Exception{
try {
		Debug.PushSubsStack("CanUseDataPlaybackResolver (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("canusedataplaybackresolver")) { return __ref.runUserSub(false, "playbackqueuebuilder","canusedataplaybackresolver", __ref, _offlinedata);}
RemoteObject _schedules = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 14;BA.debugLine="Public Sub CanUseDataPlaybackResolver(offlineData";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),playbackqueuebuilder.__c.getField(true,"False"))) { 
if (true) return playbackqueuebuilder.__c.getField(true,"False");};
 BA.debugLineNum = 16;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ok"))),(Object)((playbackqueuebuilder.__c.getField(true,"False")))),(playbackqueuebuilder.__c.getField(true,"True")))) { 
if (true) return playbackqueuebuilder.__c.getField(true,"False");};
 BA.debugLineNum = 17;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
Debug.ShouldStop(65536);
_schedules = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_schedules = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(playbackqueuebuilder.__c.getField(false,"Null"))));Debug.locals.put("schedules", _schedules);Debug.locals.put("schedules", _schedules);
 BA.debugLineNum = 18;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_schedules.runMethod(true,"IsInitialized"),playbackqueuebuilder.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_schedules.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playbackqueuebuilder.__c.getField(true,"False");};
 BA.debugLineNum = 19;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) return playbackqueuebuilder.__c.getField(true,"True");
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
playbackqueuebuilder._targetpage = RemoteObject.createNew ("b4j.example.b4xmainpage");__ref.setField("_targetpage",playbackqueuebuilder._targetpage);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clonemap(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("CloneMap (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("clonemap")) { return __ref.runUserSub(false, "playbackqueuebuilder","clonemap", __ref, _sourcemap);}
RemoteObject _clonedmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 217;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="Dim clonedMap As Map";
Debug.ShouldStop(33554432);
_clonedmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("clonedMap", _clonedmap);
 BA.debugLineNum = 219;BA.debugLine="clonedMap.Initialize";
Debug.ShouldStop(67108864);
_clonedmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 220;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_sourcemap.runMethod(true,"IsInitialized"),playbackqueuebuilder.__c.getField(true,"False"))) { 
if (true) return _clonedmap;};
 BA.debugLineNum = 221;BA.debugLine="For Each key As Object In sourceMap.Keys";
Debug.ShouldStop(268435456);
{
final RemoteObject group4 = _sourcemap.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 222;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
Debug.ShouldStop(536870912);
_clonedmap.runVoidMethod ("Put",(Object)(_key),(Object)(_sourcemap.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 224;BA.debugLine="Return clonedMap";
Debug.ShouldStop(-2147483648);
if (true) return _clonedmap;
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinitializedlist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateInitializedList (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,227);
if (RapidSub.canDelegate("createinitializedlist")) { return __ref.runUserSub(false, "playbackqueuebuilder","createinitializedlist", __ref);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 227;BA.debugLine="Private Sub CreateInitializedList As List";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="Dim items As List";
Debug.ShouldStop(8);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("items", _items);
 BA.debugLineNum = 229;BA.debugLine="items.Initialize";
Debug.ShouldStop(16);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 230;BA.debugLine="Return items";
Debug.ShouldStop(32);
if (true) return _items;
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ensuredataplaybackqueue(RemoteObject __ref,RemoteObject _playqueue,RemoteObject _minitems,RemoteObject _offlinedata,RemoteObject _nowticks,RemoteObject _storage,RemoteObject _queuestate,RemoteObject _dataresolver,RemoteObject _mediacacheservice) throws Exception{
try {
		Debug.PushSubsStack("EnsureDataPlaybackQueue (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("ensuredataplaybackqueue")) { return __ref.runUserSub(false, "playbackqueuebuilder","ensuredataplaybackqueue", __ref, _playqueue, _minitems, _offlinedata, _nowticks, _storage, _queuestate, _dataresolver, _mediacacheservice);}
ResumableSub_EnsureDataPlaybackQueue rsub = new ResumableSub_EnsureDataPlaybackQueue(null,__ref,_playqueue,_minitems,_offlinedata,_nowticks,_storage,_queuestate,_dataresolver,_mediacacheservice);
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
public static class ResumableSub_EnsureDataPlaybackQueue extends BA.ResumableSub {
public ResumableSub_EnsureDataPlaybackQueue(b4j.example.playbackqueuebuilder parent,RemoteObject __ref,RemoteObject _playqueue,RemoteObject _minitems,RemoteObject _offlinedata,RemoteObject _nowticks,RemoteObject _storage,RemoteObject _queuestate,RemoteObject _dataresolver,RemoteObject _mediacacheservice) {
this.parent = parent;
this.__ref = __ref;
this._playqueue = _playqueue;
this._minitems = _minitems;
this._offlinedata = _offlinedata;
this._nowticks = _nowticks;
this._storage = _storage;
this._queuestate = _queuestate;
this._dataresolver = _dataresolver;
this._mediacacheservice = _mediacacheservice;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackqueuebuilder parent;
RemoteObject _playqueue;
RemoteObject _minitems;
RemoteObject _offlinedata;
RemoteObject _nowticks;
RemoteObject _storage;
RemoteObject _queuestate;
RemoteObject _dataresolver;
RemoteObject _mediacacheservice;
RemoteObject _workingcursors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nextitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureDataPlaybackQueue (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,32);
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
Debug.locals.put("minItems", _minitems);
Debug.locals.put("offlineData", _offlinedata);
Debug.locals.put("nowTicks", _nowticks);
Debug.locals.put("storage", _storage);
Debug.locals.put("queueState", _queuestate);
Debug.locals.put("dataResolver", _dataresolver);
Debug.locals.put("mediaCacheService", _mediacacheservice);
 BA.debugLineNum = 33;BA.debugLine="If minItems <= 0 Then Return False";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("k",_minitems,BA.numberCast(double.class, 0))) { 
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
 BA.debugLineNum = 34;BA.debugLine="If playQueue.Size = 0 Then";
Debug.ShouldStop(2);
if (true) break;

case 7:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_playqueue.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 35;BA.debugLine="If queueState.ConsumeSkipQueueSnapshotRestore Th";
Debug.ShouldStop(4);
if (true) break;

case 10:
//if
this.state = 25;
if (_queuestate.runClassMethod (b4j.example.playbackqueuestate.class, "_consumeskipqueuesnapshotrestore" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 25;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 37;BA.debugLine="If RestoreQueueSnapshotFromStorage(playQueue, o";
Debug.ShouldStop(16);
if (true) break;

case 15:
//if
this.state = 24;
if (__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_restorequeuesnapshotfromstorage" /*RemoteObject*/ ,(Object)(_playqueue),(Object)(_offlinedata),(Object)(_nowticks),(Object)(_storage),(Object)(_queuestate),(Object)(_dataresolver),(Object)(_mediacacheservice)).<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 38;BA.debugLine="If playQueue.Size >= minItems Then Return True";
Debug.ShouldStop(32);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("g",_playqueue.runMethod(true,"getSize"),BA.numberCast(double.class, _minitems))) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 42;BA.debugLine="Dim workingCursors As Map = dataResolver.ClonePla";
Debug.ShouldStop(512);
_workingcursors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_workingcursors = _dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_cloneplaylistcursors" /*RemoteObject*/ );Debug.locals.put("workingCursors", _workingcursors);Debug.locals.put("workingCursors", _workingcursors);
 BA.debugLineNum = 43;BA.debugLine="ApplyExistingQueueToWorkingCursors(workingCursors";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_applyexistingqueuetoworkingcursors" /*RemoteObject*/ ,(Object)(_workingcursors),(Object)(_playqueue));
 BA.debugLineNum = 44;BA.debugLine="Do While playQueue.Size < minItems";
Debug.ShouldStop(2048);
if (true) break;

case 27:
//do while
this.state = 36;
while (RemoteObject.solveBoolean("<",_playqueue.runMethod(true,"getSize"),BA.numberCast(double.class, _minitems))) {
this.state = 29;
if (true) break;
}
if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 45;BA.debugLine="Wait For (BuildNextTrackFromDataPlayback(working";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackqueuebuilder", "ensuredataplaybackqueue"), __ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_buildnexttrackfromdataplayback" /*RemoteObject*/ ,(Object)(_workingcursors),(Object)(_offlinedata),(Object)(_nowticks),(Object)(_dataresolver),(Object)(_mediacacheservice)));
this.state = 40;
return;
case 40:
//C
this.state = 30;
_nextitem = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("nextItem", _nextitem);
;
 BA.debugLineNum = 46;BA.debugLine="If IsValidDataTrackItem(nextItem) = False Then E";
Debug.ShouldStop(8192);
if (true) break;

case 30:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_isvaliddatatrackitem" /*RemoteObject*/ ,(Object)(_nextitem)),parent.__c.getField(true,"False"))) { 
this.state = 32;
;}if (true) break;

case 32:
//C
this.state = 35;
this.state = 36;
if (true) break;
if (true) break;

case 35:
//C
this.state = 27;
;
 BA.debugLineNum = 47;BA.debugLine="playQueue.Add(nextItem)";
Debug.ShouldStop(16384);
_playqueue.runVoidMethod ("Add",(Object)((_nextitem.getObject())));
 if (true) break;
;
 BA.debugLineNum = 49;BA.debugLine="If playQueue.Size > 0 Then";
Debug.ShouldStop(65536);

case 36:
//if
this.state = 39;
if (RemoteObject.solveBoolean(">",_playqueue.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 50;BA.debugLine="dataResolver.SavePreviewPlaylistCursors(storage,";
Debug.ShouldStop(131072);
_dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_savepreviewplaylistcursors" /*RemoteObject*/ ,(Object)(_storage),(Object)(_workingcursors));
 if (true) break;

case 39:
//C
this.state = -1;
;
 BA.debugLineNum = 52;BA.debugLine="SaveQueueSnapshotState(playQueue, offlineData, no";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_savequeuesnapshotstate" /*RemoteObject*/ ,(Object)(_playqueue),(Object)(_offlinedata),(Object)(_nowticks),(Object)(_storage),(Object)(_queuestate),(Object)(_dataresolver));
 BA.debugLineNum = 53;BA.debugLine="Return playQueue.Size >= minItems";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((RemoteObject.solveBoolean("g",_playqueue.runMethod(true,"getSize"),BA.numberCast(double.class, _minitems)))));return;};
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _ensuredataplaybackready(RemoteObject __ref,RemoteObject _offlinedata) throws Exception{
try {
		Debug.PushSubsStack("EnsureDataPlaybackReady (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("ensuredataplaybackready")) { return __ref.runUserSub(false, "playbackqueuebuilder","ensuredataplaybackready", __ref, _offlinedata);}
ResumableSub_EnsureDataPlaybackReady rsub = new ResumableSub_EnsureDataPlaybackReady(null,__ref,_offlinedata);
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
public static class ResumableSub_EnsureDataPlaybackReady extends BA.ResumableSub {
public ResumableSub_EnsureDataPlaybackReady(b4j.example.playbackqueuebuilder parent,RemoteObject __ref,RemoteObject _offlinedata) {
this.parent = parent;
this.__ref = __ref;
this._offlinedata = _offlinedata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackqueuebuilder parent;
RemoteObject _offlinedata;
RemoteObject _refreshed = RemoteObject.createImmutable(false);
RemoteObject _refreshedofflinedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureDataPlaybackReady (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,23);
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
Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 24;BA.debugLine="If CanUseDataPlaybackResolver(offlineData) Then R";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_canusedataplaybackresolver" /*RemoteObject*/ ,(Object)(_offlinedata)).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 25;BA.debugLine="Wait For (targetPage.QueueBuilder_RefreshOfflineD";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackqueuebuilder", "ensuredataplaybackready"), __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_queuebuilder_refreshofflinedatanow" /*RemoteObject*/ ));
this.state = 13;
return;
case 13:
//C
this.state = 7;
_refreshed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("refreshed", _refreshed);
;
 BA.debugLineNum = 26;BA.debugLine="If refreshed = False Then Return False";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_refreshed,parent.__c.getField(true,"False"))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 27;BA.debugLine="Dim refreshedOfflineData As Map = targetPage.GetQ";
Debug.ShouldStop(67108864);
_refreshedofflinedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_refreshedofflinedata = __ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_getqueuebuilderofflinedata" /*RemoteObject*/ );Debug.locals.put("refreshedOfflineData", _refreshedofflinedata);Debug.locals.put("refreshedOfflineData", _refreshedofflinedata);
 BA.debugLineNum = 28;BA.debugLine="Return CanUseDataPlaybackResolver(refreshedOfflin";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_canusedataplaybackresolver" /*RemoteObject*/ ,(Object)(_refreshedofflinedata))));return;};
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _targetpagevalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackqueuebuilder","initialize", __ref, _ba, _targetpagevalue);}
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
public static RemoteObject  _isvaliddatatrackitem(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("IsValidDataTrackItem (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("isvaliddatatrackitem")) { return __ref.runUserSub(false, "playbackqueuebuilder","isvaliddatatrackitem", __ref, _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 206;BA.debugLine="Private Sub IsValidDataTrackItem(item As Map) As B";
Debug.ShouldStop(8192);
 BA.debugLineNum = 207;BA.debugLine="If item.IsInitialized = False Or item.Size = 0 Th";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),playbackqueuebuilder.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_item.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playbackqueuebuilder.__c.getField(true,"False");};
 BA.debugLineNum = 208;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("track")))) { 
if (true) return playbackqueuebuilder.__c.getField(true,"False");};
 BA.debugLineNum = 209;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return Fal";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
if (true) return playbackqueuebuilder.__c.getField(true,"False");};
 BA.debugLineNum = 210;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) return playbackqueuebuilder.__c.getField(true,"True");
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _joinlist(RemoteObject __ref,RemoteObject _items,RemoteObject _separator) throws Exception{
try {
		Debug.PushSubsStack("JoinList (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,233);
if (RapidSub.canDelegate("joinlist")) { return __ref.runUserSub(false, "playbackqueuebuilder","joinlist", __ref, _items, _separator);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("items", _items);
Debug.locals.put("separator", _separator);
 BA.debugLineNum = 233;BA.debugLine="Private Sub JoinList(items As List, separator As S";
Debug.ShouldStop(256);
 BA.debugLineNum = 234;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(512);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 235;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 236;BA.debugLine="For i = 0 To items.Size - 1";
Debug.ShouldStop(2048);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 237;BA.debugLine="If i > 0 Then sb.Append(separator)";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(_separator));};
 BA.debugLineNum = 238;BA.debugLine="sb.Append(items.Get(i))";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_items.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 240;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(32768);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _restorequeuesnapshotfromstorage(RemoteObject __ref,RemoteObject _playqueue,RemoteObject _offlinedata,RemoteObject _nowticks,RemoteObject _storage,RemoteObject _queuestate,RemoteObject _dataresolver,RemoteObject _mediacacheservice) throws Exception{
try {
		Debug.PushSubsStack("RestoreQueueSnapshotFromStorage (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("restorequeuesnapshotfromstorage")) { return __ref.runUserSub(false, "playbackqueuebuilder","restorequeuesnapshotfromstorage", __ref, _playqueue, _offlinedata, _nowticks, _storage, _queuestate, _dataresolver, _mediacacheservice);}
RemoteObject _snapshot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _storedsignature = RemoteObject.createImmutable("");
RemoteObject _currentsignature = RemoteObject.createImmutable("");
RemoteObject _storedtracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _restoredcount = RemoteObject.createImmutable(0);
RemoteObject _itemobject = RemoteObject.declareNull("Object");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playQueue", _playqueue);
Debug.locals.put("offlineData", _offlinedata);
Debug.locals.put("nowTicks", _nowticks);
Debug.locals.put("storage", _storage);
Debug.locals.put("queueState", _queuestate);
Debug.locals.put("dataResolver", _dataresolver);
Debug.locals.put("mediaCacheService", _mediacacheservice);
 BA.debugLineNum = 139;BA.debugLine="Public Sub RestoreQueueSnapshotFromStorage(playQue";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="If CanUseDataPlaybackResolver(offlineData) = Fals";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_canusedataplaybackresolver" /*RemoteObject*/ ,(Object)(_offlinedata)),playbackqueuebuilder.__c.getField(true,"False"))) { 
if (true) return playbackqueuebuilder.__c.getField(true,"False");};
 BA.debugLineNum = 141;BA.debugLine="Dim snapshot As Map = queueState.RestoreQueueSnap";
Debug.ShouldStop(4096);
_snapshot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_snapshot = _queuestate.runClassMethod (b4j.example.playbackqueuestate.class, "_restorequeuesnapshot" /*RemoteObject*/ ,(Object)(_storage));Debug.locals.put("snapshot", _snapshot);Debug.locals.put("snapshot", _snapshot);
 BA.debugLineNum = 142;BA.debugLine="Dim storedSignature As String = snapshot.GetDefau";
Debug.ShouldStop(8192);
_storedsignature = BA.ObjectToString(_snapshot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("signature"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("storedSignature", _storedsignature);Debug.locals.put("storedSignature", _storedsignature);
 BA.debugLineNum = 143;BA.debugLine="If storedSignature = \"\" Then Return False";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_storedsignature,BA.ObjectToString(""))) { 
if (true) return playbackqueuebuilder.__c.getField(true,"False");};
 BA.debugLineNum = 144;BA.debugLine="Dim currentSignature As String = BuildQueueSignat";
Debug.ShouldStop(32768);
_currentsignature = __ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_buildqueuesignature" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(_nowticks),(Object)(_dataresolver));Debug.locals.put("currentSignature", _currentsignature);Debug.locals.put("currentSignature", _currentsignature);
 BA.debugLineNum = 145;BA.debugLine="If currentSignature = \"\" Then Return False";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_currentsignature,BA.ObjectToString(""))) { 
if (true) return playbackqueuebuilder.__c.getField(true,"False");};
 BA.debugLineNum = 146;BA.debugLine="If storedSignature <> currentSignature Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",_storedsignature,_currentsignature)) { 
 BA.debugLineNum = 147;BA.debugLine="Trace(\"очередь signature mismatch stored=\" & sto";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("очередь signature mismatch stored="),_storedsignature,RemoteObject.createImmutable(" current="),_currentsignature)));
 BA.debugLineNum = 148;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) return playbackqueuebuilder.__c.getField(true,"False");
 };
 BA.debugLineNum = 150;BA.debugLine="Dim storedTracks As List = snapshot.GetDefault(\"t";
Debug.ShouldStop(2097152);
_storedtracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_storedtracks = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _snapshot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)((__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_createinitializedlist" /*RemoteObject*/ ).getObject()))));Debug.locals.put("storedTracks", _storedtracks);Debug.locals.put("storedTracks", _storedtracks);
 BA.debugLineNum = 151;BA.debugLine="If storedTracks.IsInitialized = False Or storedTr";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_storedtracks.runMethod(true,"IsInitialized"),playbackqueuebuilder.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_storedtracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playbackqueuebuilder.__c.getField(true,"False");};
 BA.debugLineNum = 152;BA.debugLine="Dim restoredCount As Int = 0";
Debug.ShouldStop(8388608);
_restoredcount = BA.numberCast(int.class, 0);Debug.locals.put("restoredCount", _restoredcount);Debug.locals.put("restoredCount", _restoredcount);
 BA.debugLineNum = 153;BA.debugLine="For Each itemObject As Object In storedTracks";
Debug.ShouldStop(16777216);
{
final RemoteObject group14 = _storedtracks;
final int groupLen14 = group14.runMethod(true,"getSize").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_itemobject = group14.runMethod(false,"Get",index14);Debug.locals.put("itemObject", _itemobject);
Debug.locals.put("itemObject", _itemobject);
 BA.debugLineNum = 154;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("i",_itemobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 155;BA.debugLine="Dim item As Map = itemObject";
Debug.ShouldStop(67108864);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 156;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_isvaliddatatrackitem" /*RemoteObject*/ ,(Object)(_item)),playbackqueuebuilder.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 157;BA.debugLine="If mediaCacheService.IsTrackCached(item.GetDefa";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))),playbackqueuebuilder.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 158;BA.debugLine="playQueue.Add(CloneMap(item))";
Debug.ShouldStop(536870912);
_playqueue.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_clonemap" /*RemoteObject*/ ,(Object)(_item)).getObject())));
 BA.debugLineNum = 159;BA.debugLine="dataResolver.RememberResolvedTrack(item.GetDefa";
Debug.ShouldStop(1073741824);
_dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_rememberresolvedtrack" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 160;BA.debugLine="dataResolver.RememberResolvedTrackForPlaylist(i";
Debug.ShouldStop(-2147483648);
_dataresolver.runClassMethod (b4j.example.dataplaybackresolver.class, "_rememberresolvedtrackforplaylist" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 161;BA.debugLine="restoredCount = restoredCount + 1";
Debug.ShouldStop(1);
_restoredcount = RemoteObject.solve(new RemoteObject[] {_restoredcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("restoredCount", _restoredcount);
 };
 }
}Debug.locals.put("itemObject", _itemobject);
;
 BA.debugLineNum = 164;BA.debugLine="If restoredCount = 0 Then Return False";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_restoredcount,BA.numberCast(double.class, 0))) { 
if (true) return playbackqueuebuilder.__c.getField(true,"False");};
 BA.debugLineNum = 165;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return playbackqueuebuilder.__c.getField(true,"True");
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savequeuesnapshotstate(RemoteObject __ref,RemoteObject _playqueue,RemoteObject _offlinedata,RemoteObject _nowticks,RemoteObject _storage,RemoteObject _queuestate,RemoteObject _dataresolver) throws Exception{
try {
		Debug.PushSubsStack("SaveQueueSnapshotState (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("savequeuesnapshotstate")) { return __ref.runUserSub(false, "playbackqueuebuilder","savequeuesnapshotstate", __ref, _playqueue, _offlinedata, _nowticks, _storage, _queuestate, _dataresolver);}
RemoteObject _signature = RemoteObject.createImmutable("");
RemoteObject _snapshottracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _itemobject = RemoteObject.declareNull("Object");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playQueue", _playqueue);
Debug.locals.put("offlineData", _offlinedata);
Debug.locals.put("nowTicks", _nowticks);
Debug.locals.put("storage", _storage);
Debug.locals.put("queueState", _queuestate);
Debug.locals.put("dataResolver", _dataresolver);
 BA.debugLineNum = 168;BA.debugLine="Public Sub SaveQueueSnapshotState(playQueue As Lis";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="If CanUseDataPlaybackResolver(offlineData) = Fals";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_canusedataplaybackresolver" /*RemoteObject*/ ,(Object)(_offlinedata)),playbackqueuebuilder.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 170;BA.debugLine="Dim signature As String = BuildQueueSignature(off";
Debug.ShouldStop(512);
_signature = __ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_buildqueuesignature" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(_nowticks),(Object)(_dataresolver));Debug.locals.put("signature", _signature);Debug.locals.put("signature", _signature);
 BA.debugLineNum = 171;BA.debugLine="If signature = \"\" Then Return";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_signature,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 172;BA.debugLine="Dim snapshotTracks As List";
Debug.ShouldStop(2048);
_snapshottracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("snapshotTracks", _snapshottracks);
 BA.debugLineNum = 173;BA.debugLine="snapshotTracks.Initialize";
Debug.ShouldStop(4096);
_snapshottracks.runVoidMethod ("Initialize");
 BA.debugLineNum = 174;BA.debugLine="For Each itemObject As Object In playQueue";
Debug.ShouldStop(8192);
{
final RemoteObject group6 = _playqueue;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_itemobject = group6.runMethod(false,"Get",index6);Debug.locals.put("itemObject", _itemobject);
Debug.locals.put("itemObject", _itemobject);
 BA.debugLineNum = 175;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("i",_itemobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 176;BA.debugLine="Dim item As Map = itemObject";
Debug.ShouldStop(32768);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 177;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_isvaliddatatrackitem" /*RemoteObject*/ ,(Object)(_item)),playbackqueuebuilder.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 178;BA.debugLine="snapshotTracks.Add(CloneMap(item))";
Debug.ShouldStop(131072);
_snapshottracks.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.playbackqueuebuilder.class, "_clonemap" /*RemoteObject*/ ,(Object)(_item)).getObject())));
 BA.debugLineNum = 179;BA.debugLine="If snapshotTracks.Size >= 20 Then Exit";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("g",_snapshottracks.runMethod(true,"getSize"),BA.numberCast(double.class, 20))) { 
if (true) break;};
 };
 }
}Debug.locals.put("itemObject", _itemobject);
;
 BA.debugLineNum = 182;BA.debugLine="queueState.SaveQueueSnapshot(storage, signature,";
Debug.ShouldStop(2097152);
_queuestate.runClassMethod (b4j.example.playbackqueuestate.class, "_savequeuesnapshot" /*RemoteObject*/ ,(Object)(_storage),(Object)(_signature),(Object)(_snapshottracks),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trace(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("Trace (playbackqueuebuilder) ","playbackqueuebuilder",8,__ref.getField(false, "ba"),__ref,243);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "playbackqueuebuilder","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 243;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="targetPage.TraceLog(message)";
Debug.ShouldStop(524288);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_tracelog" /*RemoteObject*/ ,(Object)(_message));
 BA.debugLineNum = 245;BA.debugLine="End Sub";
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