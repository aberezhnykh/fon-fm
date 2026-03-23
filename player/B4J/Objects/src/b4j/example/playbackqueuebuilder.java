package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbackqueuebuilder extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbackqueuebuilder", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbackqueuebuilder.class).invoke(this, new Object[] {null});
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
public String  _buildqueuesignature(b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _nowticks,b4j.example.dataplaybackresolver _dataresolver) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "buildqueuesignature", false))
	 {return ((String) Debug.delegate(ba, "buildqueuesignature", new Object[] {_offlinedata,_nowticks,_dataresolver}));}
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.List _signatureparts = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlist = null;
RDebugUtils.currentLine=51249152;
 //BA.debugLineNum = 51249152;BA.debugLine="Public Sub BuildQueueSignature(offlineData As Map,";
RDebugUtils.currentLine=51249153;
 //BA.debugLineNum = 51249153;BA.debugLine="If CanUseDataPlaybackResolver(offlineData) = Fals";
if (__ref._canusedataplaybackresolver /*boolean*/ (null,_offlinedata)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=51249154;
 //BA.debugLineNum = 51249154;BA.debugLine="Dim currentSlot As Map = dataResolver.ResolveData";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = _dataresolver._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_nowticks);
RDebugUtils.currentLine=51249155;
 //BA.debugLineNum = 51249155;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=51249156;
 //BA.debugLineNum = 51249156;BA.debugLine="Dim signatureParts As List";
_signatureparts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=51249157;
 //BA.debugLineNum = 51249157;BA.debugLine="signatureParts.Initialize";
_signatureparts.Initialize();
RDebugUtils.currentLine=51249158;
 //BA.debugLineNum = 51249158;BA.debugLine="signatureParts.Add(\"v=4\")";
_signatureparts.Add((Object)("v=4"));
RDebugUtils.currentLine=51249159;
 //BA.debugLineNum = 51249159;BA.debugLine="signatureParts.Add(\"slot=\" & BuildDataSlotKey(cur";
_signatureparts.Add((Object)("slot="+__ref._builddataslotkey /*String*/ (null,_currentslot)));
RDebugUtils.currentLine=51249160;
 //BA.debugLineNum = 51249160;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=51249161;
 //BA.debugLineNum = 51249161;BA.debugLine="If playlists.IsInitialized Then";
if (_playlists.IsInitialized()) { 
RDebugUtils.currentLine=51249162;
 //BA.debugLineNum = 51249162;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group10 = _playlists;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_playlistobject = group10.Get(index10);
RDebugUtils.currentLine=51249163;
 //BA.debugLineNum = 51249163;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=51249164;
 //BA.debugLineNum = 51249164;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=51249165;
 //BA.debugLineNum = 51249165;BA.debugLine="signatureParts.Add(\"playlist=\" & playlist.GetD";
_signatureparts.Add((Object)("playlist="+BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")))+":"+BA.ObjectToString(_playlist.GetDefault((Object)("updated"),(Object)("")))));
 };
 }
};
 };
RDebugUtils.currentLine=51249169;
 //BA.debugLineNum = 51249169;BA.debugLine="signatureParts.Sort(True)";
_signatureparts.Sort(__c.True);
RDebugUtils.currentLine=51249170;
 //BA.debugLineNum = 51249170;BA.debugLine="Return JoinList(signatureParts, \"|\")";
if (true) return __ref._joinlist /*String*/ (null,_signatureparts,"|");
RDebugUtils.currentLine=51249171;
 //BA.debugLineNum = 51249171;BA.debugLine="End Sub";
return "";
}
public boolean  _canusedataplaybackresolver(b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "canusedataplaybackresolver", false))
	 {return ((Boolean) Debug.delegate(ba, "canusedataplaybackresolver", new Object[] {_offlinedata}));}
anywheresoftware.b4a.objects.collections.List _schedules = null;
RDebugUtils.currentLine=50855936;
 //BA.debugLineNum = 50855936;BA.debugLine="Public Sub CanUseDataPlaybackResolver(offlineData";
RDebugUtils.currentLine=50855937;
 //BA.debugLineNum = 50855937;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=50855938;
 //BA.debugLineNum = 50855938;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if ((_offlinedata.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=50855939;
 //BA.debugLineNum = 50855939;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=50855940;
 //BA.debugLineNum = 50855940;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=50855941;
 //BA.debugLineNum = 50855941;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=50855942;
 //BA.debugLineNum = 50855942;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuredataplaybackqueue(b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.List _playqueue,int _minitems,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _nowticks,b4j.example.keyvaluestore _storage,b4j.example.playbackqueuestate _queuestate,b4j.example.dataplaybackresolver _dataresolver,b4j.example.mediacache _mediacacheservice) throws Exception{
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "ensuredataplaybackqueue", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuredataplaybackqueue", new Object[] {_playqueue,_minitems,_offlinedata,_nowticks,_storage,_queuestate,_dataresolver,_mediacacheservice}));}
ResumableSub_EnsureDataPlaybackQueue rsub = new ResumableSub_EnsureDataPlaybackQueue(this,__ref,_playqueue,_minitems,_offlinedata,_nowticks,_storage,_queuestate,_dataresolver,_mediacacheservice);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureDataPlaybackQueue extends BA.ResumableSub {
public ResumableSub_EnsureDataPlaybackQueue(b4j.example.playbackqueuebuilder parent,b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.List _playqueue,int _minitems,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _nowticks,b4j.example.keyvaluestore _storage,b4j.example.playbackqueuestate _queuestate,b4j.example.dataplaybackresolver _dataresolver,b4j.example.mediacache _mediacacheservice) {
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
this.__ref = parent;
}
b4j.example.playbackqueuebuilder __ref;
b4j.example.playbackqueuebuilder parent;
anywheresoftware.b4a.objects.collections.List _playqueue;
int _minitems;
anywheresoftware.b4a.objects.collections.Map _offlinedata;
long _nowticks;
b4j.example.keyvaluestore _storage;
b4j.example.playbackqueuestate _queuestate;
b4j.example.dataplaybackresolver _dataresolver;
b4j.example.mediacache _mediacacheservice;
anywheresoftware.b4a.objects.collections.Map _workingcursors = null;
anywheresoftware.b4a.objects.collections.Map _nextitem = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackqueuebuilder";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=50987009;
 //BA.debugLineNum = 50987009;BA.debugLine="If minItems <= 0 Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_minitems<=0) { 
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
RDebugUtils.currentLine=50987010;
 //BA.debugLineNum = 50987010;BA.debugLine="If playQueue.Size = 0 Then";
if (true) break;

case 7:
//if
this.state = 26;
if (_playqueue.getSize()==0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=50987011;
 //BA.debugLineNum = 50987011;BA.debugLine="If queueState.ConsumeSkipQueueSnapshotRestore Th";
if (true) break;

case 10:
//if
this.state = 25;
if (_queuestate._consumeskipqueuesnapshotrestore /*boolean*/ (null)) { 
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
RDebugUtils.currentLine=50987013;
 //BA.debugLineNum = 50987013;BA.debugLine="If RestoreQueueSnapshotFromStorage(playQueue, o";
if (true) break;

case 15:
//if
this.state = 24;
if (__ref._restorequeuesnapshotfromstorage /*boolean*/ (null,_playqueue,_offlinedata,_nowticks,_storage,_queuestate,_dataresolver,_mediacacheservice)) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=50987014;
 //BA.debugLineNum = 50987014;BA.debugLine="If playQueue.Size >= minItems Then Return True";
if (true) break;

case 18:
//if
this.state = 23;
if (_playqueue.getSize()>=_minitems) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
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
RDebugUtils.currentLine=50987018;
 //BA.debugLineNum = 50987018;BA.debugLine="Dim workingCursors As Map = dataResolver.ClonePla";
_workingcursors = new anywheresoftware.b4a.objects.collections.Map();
_workingcursors = _dataresolver._cloneplaylistcursors /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=50987019;
 //BA.debugLineNum = 50987019;BA.debugLine="ApplyExistingQueueToWorkingCursors(workingCursors";
__ref._applyexistingqueuetoworkingcursors /*String*/ (null,_workingcursors,_playqueue);
RDebugUtils.currentLine=50987020;
 //BA.debugLineNum = 50987020;BA.debugLine="Do While playQueue.Size < minItems";
if (true) break;

case 27:
//do while
this.state = 36;
while (_playqueue.getSize()<_minitems) {
this.state = 29;
if (true) break;
}
if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=50987021;
 //BA.debugLineNum = 50987021;BA.debugLine="Wait For (BuildNextTrackFromDataPlayback(working";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackqueuebuilder", "ensuredataplaybackqueue"), __ref._buildnexttrackfromdataplayback /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_workingcursors,_offlinedata,_nowticks,_dataresolver,_mediacacheservice));
this.state = 40;
return;
case 40:
//C
this.state = 30;
_nextitem = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=50987022;
 //BA.debugLineNum = 50987022;BA.debugLine="If IsValidDataTrackItem(nextItem) = False Then E";
if (true) break;

case 30:
//if
this.state = 35;
if (__ref._isvaliddatatrackitem /*boolean*/ (null,_nextitem)==parent.__c.False) { 
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
RDebugUtils.currentLine=50987023;
 //BA.debugLineNum = 50987023;BA.debugLine="playQueue.Add(nextItem)";
_playqueue.Add((Object)(_nextitem.getObject()));
 if (true) break;
;
RDebugUtils.currentLine=50987025;
 //BA.debugLineNum = 50987025;BA.debugLine="If playQueue.Size > 0 Then";

case 36:
//if
this.state = 39;
if (_playqueue.getSize()>0) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=50987026;
 //BA.debugLineNum = 50987026;BA.debugLine="dataResolver.SavePreviewPlaylistCursors(storage,";
_dataresolver._savepreviewplaylistcursors /*String*/ (null,_storage,_workingcursors);
 if (true) break;

case 39:
//C
this.state = -1;
;
RDebugUtils.currentLine=50987028;
 //BA.debugLineNum = 50987028;BA.debugLine="SaveQueueSnapshotState(playQueue, offlineData, no";
__ref._savequeuesnapshotstate /*String*/ (null,_playqueue,_offlinedata,_nowticks,_storage,_queuestate,_dataresolver);
RDebugUtils.currentLine=50987029;
 //BA.debugLineNum = 50987029;BA.debugLine="Return playQueue.Size >= minItems";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_playqueue.getSize()>=_minitems));return;};
RDebugUtils.currentLine=50987030;
 //BA.debugLineNum = 50987030;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuredataplaybackready(b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "ensuredataplaybackready", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuredataplaybackready", new Object[] {_offlinedata}));}
ResumableSub_EnsureDataPlaybackReady rsub = new ResumableSub_EnsureDataPlaybackReady(this,__ref,_offlinedata);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureDataPlaybackReady extends BA.ResumableSub {
public ResumableSub_EnsureDataPlaybackReady(b4j.example.playbackqueuebuilder parent,b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) {
this.parent = parent;
this.__ref = __ref;
this._offlinedata = _offlinedata;
this.__ref = parent;
}
b4j.example.playbackqueuebuilder __ref;
b4j.example.playbackqueuebuilder parent;
anywheresoftware.b4a.objects.collections.Map _offlinedata;
boolean _refreshed = false;
anywheresoftware.b4a.objects.collections.Map _refreshedofflinedata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackqueuebuilder";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=50921473;
 //BA.debugLineNum = 50921473;BA.debugLine="If CanUseDataPlaybackResolver(offlineData) Then R";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._canusedataplaybackresolver /*boolean*/ (null,_offlinedata)) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=50921474;
 //BA.debugLineNum = 50921474;BA.debugLine="Wait For (targetPage.QueueBuilder_RefreshOfflineD";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackqueuebuilder", "ensuredataplaybackready"), __ref._targetpage /*b4j.example.b4xmainpage*/ ._queuebuilder_refreshofflinedatanow /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = 7;
_refreshed = (boolean) result[1];
;
RDebugUtils.currentLine=50921475;
 //BA.debugLineNum = 50921475;BA.debugLine="If refreshed = False Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (_refreshed==parent.__c.False) { 
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
this.state = -1;
;
RDebugUtils.currentLine=50921476;
 //BA.debugLineNum = 50921476;BA.debugLine="Dim refreshedOfflineData As Map = targetPage.GetQ";
_refreshedofflinedata = new anywheresoftware.b4a.objects.collections.Map();
_refreshedofflinedata = __ref._targetpage /*b4j.example.b4xmainpage*/ ._getqueuebuilderofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=50921477;
 //BA.debugLineNum = 50921477;BA.debugLine="Return CanUseDataPlaybackResolver(refreshedOfflin";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._canusedataplaybackresolver /*boolean*/ (null,_refreshedofflinedata)));return;};
RDebugUtils.currentLine=50921478;
 //BA.debugLineNum = 50921478;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.BA _ba,b4j.example.b4xmainpage _targetpagevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_targetpagevalue}));}
RDebugUtils.currentLine=50790400;
 //BA.debugLineNum = 50790400;BA.debugLine="Public Sub Initialize(targetPageValue As B4XMainPa";
RDebugUtils.currentLine=50790401;
 //BA.debugLineNum = 50790401;BA.debugLine="targetPage = targetPageValue";
__ref._targetpage /*b4j.example.b4xmainpage*/  = _targetpagevalue;
RDebugUtils.currentLine=50790402;
 //BA.debugLineNum = 50790402;BA.debugLine="End Sub";
return "";
}
public String  _savequeuesnapshotstate(b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.List _playqueue,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _nowticks,b4j.example.keyvaluestore _storage,b4j.example.playbackqueuestate _queuestate,b4j.example.dataplaybackresolver _dataresolver) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "savequeuesnapshotstate", false))
	 {return ((String) Debug.delegate(ba, "savequeuesnapshotstate", new Object[] {_playqueue,_offlinedata,_nowticks,_storage,_queuestate,_dataresolver}));}
String _signature = "";
anywheresoftware.b4a.objects.collections.List _snapshottracks = null;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=51183616;
 //BA.debugLineNum = 51183616;BA.debugLine="Public Sub SaveQueueSnapshotState(playQueue As Lis";
RDebugUtils.currentLine=51183617;
 //BA.debugLineNum = 51183617;BA.debugLine="If CanUseDataPlaybackResolver(offlineData) = Fals";
if (__ref._canusedataplaybackresolver /*boolean*/ (null,_offlinedata)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=51183618;
 //BA.debugLineNum = 51183618;BA.debugLine="Dim signature As String = BuildQueueSignature(off";
_signature = __ref._buildqueuesignature /*String*/ (null,_offlinedata,_nowticks,_dataresolver);
RDebugUtils.currentLine=51183619;
 //BA.debugLineNum = 51183619;BA.debugLine="If signature = \"\" Then Return";
if ((_signature).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=51183620;
 //BA.debugLineNum = 51183620;BA.debugLine="Dim snapshotTracks As List";
_snapshottracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=51183621;
 //BA.debugLineNum = 51183621;BA.debugLine="snapshotTracks.Initialize";
_snapshottracks.Initialize();
RDebugUtils.currentLine=51183622;
 //BA.debugLineNum = 51183622;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group6 = _playqueue;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_itemobject = group6.Get(index6);
RDebugUtils.currentLine=51183623;
 //BA.debugLineNum = 51183623;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=51183624;
 //BA.debugLineNum = 51183624;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=51183625;
 //BA.debugLineNum = 51183625;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
if (__ref._isvaliddatatrackitem /*boolean*/ (null,_item)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=51183626;
 //BA.debugLineNum = 51183626;BA.debugLine="snapshotTracks.Add(CloneMap(item))";
_snapshottracks.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item).getObject()));
RDebugUtils.currentLine=51183627;
 //BA.debugLineNum = 51183627;BA.debugLine="If snapshotTracks.Size >= 20 Then Exit";
if (_snapshottracks.getSize()>=20) { 
if (true) break;};
 };
 }
};
RDebugUtils.currentLine=51183630;
 //BA.debugLineNum = 51183630;BA.debugLine="queueState.SaveQueueSnapshot(storage, signature,";
_queuestate._savequeuesnapshot /*String*/ (null,_storage,_signature,_snapshottracks,(int) (20));
RDebugUtils.currentLine=51183631;
 //BA.debugLineNum = 51183631;BA.debugLine="End Sub";
return "";
}
public String  _applyexistingqueuetoworkingcursors(b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.Map _workingcursors,anywheresoftware.b4a.objects.collections.List _playqueue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "applyexistingqueuetoworkingcursors", false))
	 {return ((String) Debug.delegate(ba, "applyexistingqueuetoworkingcursors", new Object[] {_workingcursors,_playqueue}));}
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _slotkey = "";
int _nextstored = 0;
RDebugUtils.currentLine=54919168;
 //BA.debugLineNum = 54919168;BA.debugLine="Private Sub ApplyExistingQueueToWorkingCursors(wor";
RDebugUtils.currentLine=54919169;
 //BA.debugLineNum = 54919169;BA.debugLine="If workingCursors.IsInitialized = False Then Retu";
if (_workingcursors.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=54919170;
 //BA.debugLineNum = 54919170;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (_playqueue.IsInitialized()==__c.False || _playqueue.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=54919171;
 //BA.debugLineNum = 54919171;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group3 = _playqueue;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_itemobject = group3.Get(index3);
RDebugUtils.currentLine=54919172;
 //BA.debugLineNum = 54919172;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=54919173;
 //BA.debugLineNum = 54919173;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=54919174;
 //BA.debugLineNum = 54919174;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
if (__ref._isvaliddatatrackitem /*boolean*/ (null,_item)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=54919175;
 //BA.debugLineNum = 54919175;BA.debugLine="Dim slotKey As String = item.GetDefault(\"slot_k";
_slotkey = BA.ObjectToString(_item.GetDefault((Object)("slot_key"),(Object)("")));
RDebugUtils.currentLine=54919176;
 //BA.debugLineNum = 54919176;BA.debugLine="If slotKey = \"\" Then Continue";
if ((_slotkey).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=54919177;
 //BA.debugLineNum = 54919177;BA.debugLine="Dim nextStored As Int = item.GetDefault(\"playli";
_nextstored = (int) ((double)(BA.ObjectToNumber(_item.GetDefault((Object)("playlist_index"),(Object)(0))))+1);
RDebugUtils.currentLine=54919178;
 //BA.debugLineNum = 54919178;BA.debugLine="workingCursors.Put(slotKey, nextStored)";
_workingcursors.Put((Object)(_slotkey),(Object)(_nextstored));
 };
 }
};
RDebugUtils.currentLine=54919181;
 //BA.debugLineNum = 54919181;BA.debugLine="End Sub";
return "";
}
public boolean  _isvaliddatatrackitem(b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "isvaliddatatrackitem", false))
	 {return ((Boolean) Debug.delegate(ba, "isvaliddatatrackitem", new Object[] {_item}));}
RDebugUtils.currentLine=51314688;
 //BA.debugLineNum = 51314688;BA.debugLine="Private Sub IsValidDataTrackItem(item As Map) As B";
RDebugUtils.currentLine=51314689;
 //BA.debugLineNum = 51314689;BA.debugLine="If item.IsInitialized = False Or item.Size = 0 Th";
if (_item.IsInitialized()==__c.False || _item.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=51314690;
 //BA.debugLineNum = 51314690;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=51314691;
 //BA.debugLineNum = 51314691;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return Fal";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return __c.False;};
RDebugUtils.currentLine=51314692;
 //BA.debugLineNum = 51314692;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=51314693;
 //BA.debugLineNum = 51314693;BA.debugLine="End Sub";
return false;
}
public String  _builddataslotkey(b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.Map _currentslot) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "builddataslotkey", false))
	 {return ((String) Debug.delegate(ba, "builddataslotkey", new Object[] {_currentslot}));}
RDebugUtils.currentLine=51380224;
 //BA.debugLineNum = 51380224;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
RDebugUtils.currentLine=51380225;
 //BA.debugLineNum = 51380225;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
if (true) return BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=51380226;
 //BA.debugLineNum = 51380226;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _buildnexttrackfromdataplayback(b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.Map _workingcursors,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _nowticks,b4j.example.dataplaybackresolver _dataresolver,b4j.example.mediacache _mediacacheservice) throws Exception{
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "buildnexttrackfromdataplayback", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "buildnexttrackfromdataplayback", new Object[] {_workingcursors,_offlinedata,_nowticks,_dataresolver,_mediacacheservice}));}
ResumableSub_BuildNextTrackFromDataPlayback rsub = new ResumableSub_BuildNextTrackFromDataPlayback(this,__ref,_workingcursors,_offlinedata,_nowticks,_dataresolver,_mediacacheservice);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BuildNextTrackFromDataPlayback extends BA.ResumableSub {
public ResumableSub_BuildNextTrackFromDataPlayback(b4j.example.playbackqueuebuilder parent,b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.Map _workingcursors,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _nowticks,b4j.example.dataplaybackresolver _dataresolver,b4j.example.mediacache _mediacacheservice) {
this.parent = parent;
this.__ref = __ref;
this._workingcursors = _workingcursors;
this._offlinedata = _offlinedata;
this._nowticks = _nowticks;
this._dataresolver = _dataresolver;
this._mediacacheservice = _mediacacheservice;
this.__ref = parent;
}
b4j.example.playbackqueuebuilder __ref;
b4j.example.playbackqueuebuilder parent;
anywheresoftware.b4a.objects.collections.Map _workingcursors;
anywheresoftware.b4a.objects.collections.Map _offlinedata;
long _nowticks;
b4j.example.dataplaybackresolver _dataresolver;
b4j.example.mediacache _mediacacheservice;
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
int _attempt = 0;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
boolean _canuseplaylist = false;
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
boolean _downloaded = false;
anywheresoftware.b4a.objects.collections.Map _chosentrack = null;
anywheresoftware.b4a.objects.collections.Map _chosenqueueitem = null;
anywheresoftware.b4a.objects.collections.List _singletrackitems = null;
boolean _downloadedtrack = false;
anywheresoftware.b4a.objects.collections.Map _fallbacktrack = null;
anywheresoftware.b4a.objects.collections.Map _fallbackqueueitem = null;
int step13;
int limit13;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackqueuebuilder";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=51052545;
 //BA.debugLineNum = 51052545;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=51052546;
 //BA.debugLineNum = 51052546;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
RDebugUtils.currentLine=51052547;
 //BA.debugLineNum = 51052547;BA.debugLine="Dim currentSlot As Map = dataResolver.ResolveData";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = _dataresolver._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_nowticks);
RDebugUtils.currentLine=51052548;
 //BA.debugLineNum = 51052548;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (true) break;

case 1:
//if
this.state = 4;
if (_currentslot.IsInitialized()==parent.__c.False || _currentslot.getSize()==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=51052549;
 //BA.debugLineNum = 51052549;BA.debugLine="Trace(\"очередь next ошибка reason=current_slot_u";
__ref._trace /*String*/ (null,"очередь next ошибка reason=current_slot_unavailable");
RDebugUtils.currentLine=51052550;
 //BA.debugLineNum = 51052550;BA.debugLine="Return emptyItem";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyitem));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=51052552;
 //BA.debugLineNum = 51052552;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),parent.__c.Null)));
RDebugUtils.currentLine=51052553;
 //BA.debugLineNum = 51052553;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (true) break;

case 5:
//if
this.state = 8;
if (_playlists.IsInitialized()==parent.__c.False || _playlists.getSize()==0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=51052554;
 //BA.debugLineNum = 51052554;BA.debugLine="Trace(\"очередь next ошибка reason=no_playlists\")";
__ref._trace /*String*/ (null,"очередь next ошибка reason=no_playlists");
RDebugUtils.currentLine=51052555;
 //BA.debugLineNum = 51052555;BA.debugLine="Return emptyItem";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyitem));return;};
 if (true) break;
;
RDebugUtils.currentLine=51052557;
 //BA.debugLineNum = 51052557;BA.debugLine="For attempt = 0 To playlists.Size - 1";

case 8:
//for
this.state = 56;
step13 = 1;
limit13 = (int) (_playlists.getSize()-1);
_attempt = (int) (0) ;
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
if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=51052558;
 //BA.debugLineNum = 51052558;BA.debugLine="Dim playlistDescriptor As Map = dataResolver.Cho";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = _dataresolver._choosenextplaylistdescriptor /*anywheresoftware.b4a.objects.collections.Map*/ (null,_currentslot,_workingcursors);
RDebugUtils.currentLine=51052559;
 //BA.debugLineNum = 51052559;BA.debugLine="If playlistDescriptor.IsInitialized = False Or p";
if (true) break;

case 11:
//if
this.state = 16;
if (_playlistdescriptor.IsInitialized()==parent.__c.False || _playlistdescriptor.getSize()==0) { 
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
RDebugUtils.currentLine=51052560;
 //BA.debugLineNum = 51052560;BA.debugLine="Dim canUsePlaylist As Boolean = True";
_canuseplaylist = parent.__c.True;
RDebugUtils.currentLine=51052561;
 //BA.debugLineNum = 51052561;BA.debugLine="Dim playlistData As Map = dataResolver.LoadCache";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = _dataresolver._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=51052562;
 //BA.debugLineNum = 51052562;BA.debugLine="If playlistData.IsInitialized = False Or playlis";
if (true) break;

case 17:
//if
this.state = 32;
if (_playlistdata.IsInitialized()==parent.__c.False || _playlistdata.getSize()==0) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=51052563;
 //BA.debugLineNum = 51052563;BA.debugLine="Wait For (targetPage.QueueBuilder_EnsureSingleP";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackqueuebuilder", "buildnexttrackfromdataplayback"), __ref._targetpage /*b4j.example.b4xmainpage*/ ._queuebuilder_ensuresingleplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_playlistdescriptor));
this.state = 59;
return;
case 59:
//C
this.state = 20;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=51052564;
 //BA.debugLineNum = 51052564;BA.debugLine="If downloaded = False Then";
if (true) break;

case 20:
//if
this.state = 31;
if (_downloaded==parent.__c.False) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 31;
RDebugUtils.currentLine=51052565;
 //BA.debugLineNum = 51052565;BA.debugLine="canUsePlaylist = False";
_canuseplaylist = parent.__c.False;
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=51052567;
 //BA.debugLineNum = 51052567;BA.debugLine="playlistData = dataResolver.LoadCachedPlaylist";
_playlistdata = _dataresolver._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=51052568;
 //BA.debugLineNum = 51052568;BA.debugLine="If playlistData.IsInitialized = False Or playl";
if (true) break;

case 25:
//if
this.state = 30;
if (_playlistdata.IsInitialized()==parent.__c.False || _playlistdata.getSize()==0) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
_canuseplaylist = parent.__c.False;
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
RDebugUtils.currentLine=51052571;
 //BA.debugLineNum = 51052571;BA.debugLine="If canUsePlaylist = False Then";

case 32:
//if
this.state = 55;
if (_canuseplaylist==parent.__c.False) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 55;
RDebugUtils.currentLine=51052572;
 //BA.debugLineNum = 51052572;BA.debugLine="Trace(\"очередь playlist skip reason=metadata_un";
__ref._trace /*String*/ (null,"очередь playlist skip reason=metadata_unavailable playlistId="+BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)(""))));
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=51052574;
 //BA.debugLineNum = 51052574;BA.debugLine="Dim chosenTrack As Map = dataResolver.ChooseRan";
_chosentrack = new anywheresoftware.b4a.objects.collections.Map();
_chosentrack = _dataresolver._chooserandomtrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdata,_mediacacheservice,parent.__c.False);
RDebugUtils.currentLine=51052575;
 //BA.debugLineNum = 51052575;BA.debugLine="If chosenTrack.IsInitialized = False Or chosenT";
if (true) break;

case 37:
//if
this.state = 54;
if (_chosentrack.IsInitialized()==parent.__c.False || _chosentrack.getSize()==0) { 
this.state = 39;
}else {
this.state = 41;
}if (true) break;

case 39:
//C
this.state = 54;
RDebugUtils.currentLine=51052576;
 //BA.debugLineNum = 51052576;BA.debugLine="Trace(\"очередь next ошибка reason=no_track pla";
__ref._trace /*String*/ (null,"очередь next ошибка reason=no_track playlistId="+BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)(""))));
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=51052578;
 //BA.debugLineNum = 51052578;BA.debugLine="Dim chosenQueueItem As Map = dataResolver.Crea";
_chosenqueueitem = new anywheresoftware.b4a.objects.collections.Map();
_chosenqueueitem = _dataresolver._createqueuetrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (null,_currentslot,_playlistdescriptor,_chosentrack,_offlinedata);
RDebugUtils.currentLine=51052579;
 //BA.debugLineNum = 51052579;BA.debugLine="If mediaCacheService.IsTrackCached(chosenQueue";
if (true) break;

case 42:
//if
this.state = 45;
if (_mediacacheservice._istrackcached /*boolean*/ (null,BA.ObjectToString(_chosenqueueitem.GetDefault((Object)("id"),(Object)(""))))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=51052580;
 //BA.debugLineNum = 51052580;BA.debugLine="Trace(\"очередь next итог playlistId=\" & playl";
__ref._trace /*String*/ (null,"очередь next итог playlistId="+BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")))+" trackId="+BA.ObjectToString(_chosenqueueitem.GetDefault((Object)("id"),(Object)("")))+" source=cache");
RDebugUtils.currentLine=51052581;
 //BA.debugLineNum = 51052581;BA.debugLine="dataResolver.RememberResolvedTrack(chosenQueu";
_dataresolver._rememberresolvedtrack /*String*/ (null,BA.ObjectToString(_chosenqueueitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=51052582;
 //BA.debugLineNum = 51052582;BA.debugLine="dataResolver.RememberResolvedTrackForPlaylist";
_dataresolver._rememberresolvedtrackforplaylist /*String*/ (null,BA.ObjectToString(_chosenqueueitem.GetDefault((Object)("playlist_id"),(Object)(""))),BA.ObjectToString(_chosenqueueitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=51052583;
 //BA.debugLineNum = 51052583;BA.debugLine="Return chosenQueueItem";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_chosenqueueitem));return;};
 if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=51052585;
 //BA.debugLineNum = 51052585;BA.debugLine="Dim singleTrackItems As List";
_singletrackitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=51052586;
 //BA.debugLineNum = 51052586;BA.debugLine="singleTrackItems.Initialize";
_singletrackitems.Initialize();
RDebugUtils.currentLine=51052587;
 //BA.debugLineNum = 51052587;BA.debugLine="singleTrackItems.Add(chosenQueueItem)";
_singletrackitems.Add((Object)(_chosenqueueitem.getObject()));
RDebugUtils.currentLine=51052588;
 //BA.debugLineNum = 51052588;BA.debugLine="Wait For (mediaCacheService.EnsureTracksCached";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackqueuebuilder", "buildnexttrackfromdataplayback"), _mediacacheservice._ensuretrackscached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_singletrackitems,(int) (1)));
this.state = 60;
return;
case 60:
//C
this.state = 46;
_downloadedtrack = (boolean) result[1];
;
RDebugUtils.currentLine=51052589;
 //BA.debugLineNum = 51052589;BA.debugLine="If mediaCacheService.IsTrackCached(chosenQueue";
if (true) break;

case 46:
//if
this.state = 49;
if (_mediacacheservice._istrackcached /*boolean*/ (null,BA.ObjectToString(_chosenqueueitem.GetDefault((Object)("id"),(Object)(""))))) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=51052590;
 //BA.debugLineNum = 51052590;BA.debugLine="Trace(\"очередь next итог playlistId=\" & playl";
__ref._trace /*String*/ (null,"очередь next итог playlistId="+BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")))+" trackId="+BA.ObjectToString(_chosenqueueitem.GetDefault((Object)("id"),(Object)("")))+" source=downloaded");
RDebugUtils.currentLine=51052591;
 //BA.debugLineNum = 51052591;BA.debugLine="dataResolver.RememberResolvedTrack(chosenQueu";
_dataresolver._rememberresolvedtrack /*String*/ (null,BA.ObjectToString(_chosenqueueitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=51052592;
 //BA.debugLineNum = 51052592;BA.debugLine="dataResolver.RememberResolvedTrackForPlaylist";
_dataresolver._rememberresolvedtrackforplaylist /*String*/ (null,BA.ObjectToString(_chosenqueueitem.GetDefault((Object)("playlist_id"),(Object)(""))),BA.ObjectToString(_chosenqueueitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=51052593;
 //BA.debugLineNum = 51052593;BA.debugLine="Return chosenQueueItem";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_chosenqueueitem));return;};
 if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=51052595;
 //BA.debugLineNum = 51052595;BA.debugLine="Dim fallbackTrack As Map = dataResolver.Choose";
_fallbacktrack = new anywheresoftware.b4a.objects.collections.Map();
_fallbacktrack = _dataresolver._chooserandomtrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdata,_mediacacheservice,parent.__c.True);
RDebugUtils.currentLine=51052596;
 //BA.debugLineNum = 51052596;BA.debugLine="If fallbackTrack.IsInitialized And fallbackTra";
if (true) break;

case 50:
//if
this.state = 53;
if (_fallbacktrack.IsInitialized() && _fallbacktrack.getSize()>0) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=51052597;
 //BA.debugLineNum = 51052597;BA.debugLine="Dim fallbackQueueItem As Map = dataResolver.C";
_fallbackqueueitem = new anywheresoftware.b4a.objects.collections.Map();
_fallbackqueueitem = _dataresolver._createqueuetrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (null,_currentslot,_playlistdescriptor,_fallbacktrack,_offlinedata);
RDebugUtils.currentLine=51052598;
 //BA.debugLineNum = 51052598;BA.debugLine="Trace(\"очередь next итог playlistId=\" & playl";
__ref._trace /*String*/ (null,"очередь next итог playlistId="+BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")))+" trackId="+BA.ObjectToString(_fallbackqueueitem.GetDefault((Object)("id"),(Object)("")))+" source=fallback");
RDebugUtils.currentLine=51052599;
 //BA.debugLineNum = 51052599;BA.debugLine="dataResolver.RememberResolvedTrack(fallbackQu";
_dataresolver._rememberresolvedtrack /*String*/ (null,BA.ObjectToString(_fallbackqueueitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=51052600;
 //BA.debugLineNum = 51052600;BA.debugLine="dataResolver.RememberResolvedTrackForPlaylist";
_dataresolver._rememberresolvedtrackforplaylist /*String*/ (null,BA.ObjectToString(_fallbackqueueitem.GetDefault((Object)("playlist_id"),(Object)(""))),BA.ObjectToString(_fallbackqueueitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=51052601;
 //BA.debugLineNum = 51052601;BA.debugLine="Return fallbackQueueItem";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_fallbackqueueitem));return;};
 if (true) break;

case 53:
//C
this.state = 54;
;
RDebugUtils.currentLine=51052603;
 //BA.debugLineNum = 51052603;BA.debugLine="Trace(\"очередь next ошибка reason=local_prepar";
__ref._trace /*String*/ (null,"очередь next ошибка reason=local_prepare_failed playlistId="+BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")))+" trackId="+BA.ObjectToString(_chosenqueueitem.GetDefault((Object)("id"),(Object)(""))));
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
;
RDebugUtils.currentLine=51052607;
 //BA.debugLineNum = 51052607;BA.debugLine="Return emptyItem";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyitem));return;};
RDebugUtils.currentLine=51052608;
 //BA.debugLineNum = 51052608;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _trace(b4j.example.playbackqueuebuilder __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=51642368;
 //BA.debugLineNum = 51642368;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=51642369;
 //BA.debugLineNum = 51642369;BA.debugLine="targetPage.TraceLog(message)";
__ref._targetpage /*b4j.example.b4xmainpage*/ ._tracelog /*String*/ (null,_message);
RDebugUtils.currentLine=51642370;
 //BA.debugLineNum = 51642370;BA.debugLine="End Sub";
return "";
}
public String  _joinlist(b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=51576832;
 //BA.debugLineNum = 51576832;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=51576833;
 //BA.debugLineNum = 51576833;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=51576834;
 //BA.debugLineNum = 51576834;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=51576835;
 //BA.debugLineNum = 51576835;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=51576836;
 //BA.debugLineNum = 51576836;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=51576837;
 //BA.debugLineNum = 51576837;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=51576839;
 //BA.debugLineNum = 51576839;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=51576840;
 //BA.debugLineNum = 51576840;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbackqueuebuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuebuilder";
RDebugUtils.currentLine=50724864;
 //BA.debugLineNum = 50724864;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=50724865;
 //BA.debugLineNum = 50724865;BA.debugLine="Private targetPage As B4XMainPage";
_targetpage = new b4j.example.b4xmainpage();
RDebugUtils.currentLine=50724866;
 //BA.debugLineNum = 50724866;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
RDebugUtils.currentLine=51445760;
 //BA.debugLineNum = 51445760;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=51445761;
 //BA.debugLineNum = 51445761;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=51445762;
 //BA.debugLineNum = 51445762;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
RDebugUtils.currentLine=51445763;
 //BA.debugLineNum = 51445763;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
RDebugUtils.currentLine=51445764;
 //BA.debugLineNum = 51445764;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=51445765;
 //BA.debugLineNum = 51445765;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=51445767;
 //BA.debugLineNum = 51445767;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
RDebugUtils.currentLine=51445768;
 //BA.debugLineNum = 51445768;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.playbackqueuebuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=51511296;
 //BA.debugLineNum = 51511296;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=51511297;
 //BA.debugLineNum = 51511297;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=51511298;
 //BA.debugLineNum = 51511298;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=51511299;
 //BA.debugLineNum = 51511299;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=51511300;
 //BA.debugLineNum = 51511300;BA.debugLine="End Sub";
return null;
}
public boolean  _restorequeuesnapshotfromstorage(b4j.example.playbackqueuebuilder __ref,anywheresoftware.b4a.objects.collections.List _playqueue,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _nowticks,b4j.example.keyvaluestore _storage,b4j.example.playbackqueuestate _queuestate,b4j.example.dataplaybackresolver _dataresolver,b4j.example.mediacache _mediacacheservice) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuebuilder";
if (Debug.shouldDelegate(ba, "restorequeuesnapshotfromstorage", false))
	 {return ((Boolean) Debug.delegate(ba, "restorequeuesnapshotfromstorage", new Object[] {_playqueue,_offlinedata,_nowticks,_storage,_queuestate,_dataresolver,_mediacacheservice}));}
anywheresoftware.b4a.objects.collections.Map _snapshot = null;
String _storedsignature = "";
String _currentsignature = "";
anywheresoftware.b4a.objects.collections.List _storedtracks = null;
int _restoredcount = 0;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=51118080;
 //BA.debugLineNum = 51118080;BA.debugLine="Public Sub RestoreQueueSnapshotFromStorage(playQue";
RDebugUtils.currentLine=51118081;
 //BA.debugLineNum = 51118081;BA.debugLine="If CanUseDataPlaybackResolver(offlineData) = Fals";
if (__ref._canusedataplaybackresolver /*boolean*/ (null,_offlinedata)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=51118082;
 //BA.debugLineNum = 51118082;BA.debugLine="Dim snapshot As Map = queueState.RestoreQueueSnap";
_snapshot = new anywheresoftware.b4a.objects.collections.Map();
_snapshot = _queuestate._restorequeuesnapshot /*anywheresoftware.b4a.objects.collections.Map*/ (null,_storage);
RDebugUtils.currentLine=51118083;
 //BA.debugLineNum = 51118083;BA.debugLine="Dim storedSignature As String = snapshot.GetDefau";
_storedsignature = BA.ObjectToString(_snapshot.GetDefault((Object)("signature"),(Object)("")));
RDebugUtils.currentLine=51118084;
 //BA.debugLineNum = 51118084;BA.debugLine="If storedSignature = \"\" Then Return False";
if ((_storedsignature).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=51118085;
 //BA.debugLineNum = 51118085;BA.debugLine="Dim currentSignature As String = BuildQueueSignat";
_currentsignature = __ref._buildqueuesignature /*String*/ (null,_offlinedata,_nowticks,_dataresolver);
RDebugUtils.currentLine=51118086;
 //BA.debugLineNum = 51118086;BA.debugLine="If currentSignature = \"\" Then Return False";
if ((_currentsignature).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=51118087;
 //BA.debugLineNum = 51118087;BA.debugLine="If storedSignature <> currentSignature Then";
if ((_storedsignature).equals(_currentsignature) == false) { 
RDebugUtils.currentLine=51118088;
 //BA.debugLineNum = 51118088;BA.debugLine="Trace(\"очередь signature mismatch stored=\" & sto";
__ref._trace /*String*/ (null,"очередь signature mismatch stored="+_storedsignature+" current="+_currentsignature);
RDebugUtils.currentLine=51118089;
 //BA.debugLineNum = 51118089;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=51118091;
 //BA.debugLineNum = 51118091;BA.debugLine="Dim storedTracks As List = snapshot.GetDefault(\"t";
_storedtracks = new anywheresoftware.b4a.objects.collections.List();
_storedtracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_snapshot.GetDefault((Object)("tracks"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()))));
RDebugUtils.currentLine=51118092;
 //BA.debugLineNum = 51118092;BA.debugLine="If storedTracks.IsInitialized = False Or storedTr";
if (_storedtracks.IsInitialized()==__c.False || _storedtracks.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=51118093;
 //BA.debugLineNum = 51118093;BA.debugLine="Dim restoredCount As Int = 0";
_restoredcount = (int) (0);
RDebugUtils.currentLine=51118094;
 //BA.debugLineNum = 51118094;BA.debugLine="For Each itemObject As Object In storedTracks";
{
final anywheresoftware.b4a.BA.IterableList group14 = _storedtracks;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_itemobject = group14.Get(index14);
RDebugUtils.currentLine=51118095;
 //BA.debugLineNum = 51118095;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=51118096;
 //BA.debugLineNum = 51118096;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=51118097;
 //BA.debugLineNum = 51118097;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
if (__ref._isvaliddatatrackitem /*boolean*/ (null,_item)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=51118098;
 //BA.debugLineNum = 51118098;BA.debugLine="If mediaCacheService.IsTrackCached(item.GetDefa";
if (_mediacacheservice._istrackcached /*boolean*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=51118099;
 //BA.debugLineNum = 51118099;BA.debugLine="playQueue.Add(CloneMap(item))";
_playqueue.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item).getObject()));
RDebugUtils.currentLine=51118100;
 //BA.debugLineNum = 51118100;BA.debugLine="dataResolver.RememberResolvedTrack(item.GetDefa";
_dataresolver._rememberresolvedtrack /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=51118101;
 //BA.debugLineNum = 51118101;BA.debugLine="dataResolver.RememberResolvedTrackForPlaylist(i";
_dataresolver._rememberresolvedtrackforplaylist /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("playlist_id"),(Object)(""))),BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=51118102;
 //BA.debugLineNum = 51118102;BA.debugLine="restoredCount = restoredCount + 1";
_restoredcount = (int) (_restoredcount+1);
 };
 }
};
RDebugUtils.currentLine=51118105;
 //BA.debugLineNum = 51118105;BA.debugLine="If restoredCount = 0 Then Return False";
if (_restoredcount==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=51118106;
 //BA.debugLineNum = 51118106;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=51118107;
 //BA.debugLineNum = 51118107;BA.debugLine="End Sub";
return false;
}
}