package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playerstatestore extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playerstatestore", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playerstatestore.class).invoke(this, new Object[] {null});
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
public b4j.example.b4xmainpage _owner = null;
public b4j.example.playbackdatapolicystate _policystate = null;
public b4j.example.playbackorchestrationstate _orchestrationstateref = null;
public b4j.example.offlinestore _offlinestoreref = null;
public b4j.example.dataplaybackresolver _dataresolverref = null;
public b4j.example.mediacache _mediacacheref = null;
public b4j.example.keyvaluestore _storageref = null;
public String _trustedsynctimekeyvalue = "";
public anywheresoftware.b4a.objects.Timer _retrytimerref = null;
public anywheresoftware.b4a.objects.collections.Map _offlinedataref = null;
public int _consecutivenetworkerrors = 0;
public String _lastretrymode = "";
public long _datasuccessatticks = 0L;
public long _historysuccessatticks = 0L;
public boolean _startupsequenceinprogress = false;
public boolean _adwarmupdeferredafterstartup = false;
public int _localretrydelay = 0;
public int _serverretrydelay = 0;
public int _dispatchretryafter = 0;
public boolean _mediapathdegradedflag = false;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.collections.Map  _offlinedata(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "offlinedata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "offlinedata", null));}
RDebugUtils.currentLine=59244544;
 //BA.debugLineNum = 59244544;BA.debugLine="Public Sub OfflineData As Map";
RDebugUtils.currentLine=59244545;
 //BA.debugLineNum = 59244545;BA.debugLine="If offlineDataRef.IsInitialized = False Then offl";
if (__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=59244546;
 //BA.debugLineNum = 59244546;BA.debugLine="Return offlineDataRef";
if (true) return __ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=59244547;
 //BA.debugLineNum = 59244547;BA.debugLine="End Sub";
return null;
}
public String  _cleardispatchretryafter(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "cleardispatchretryafter", false))
	 {return ((String) Debug.delegate(ba, "cleardispatchretryafter", null));}
RDebugUtils.currentLine=63111168;
 //BA.debugLineNum = 63111168;BA.debugLine="Public Sub ClearDispatchRetryAfter";
RDebugUtils.currentLine=63111169;
 //BA.debugLineNum = 63111169;BA.debugLine="dispatchRetryAfter = 0";
__ref._dispatchretryafter /*int*/  = (int) (0);
RDebugUtils.currentLine=63111170;
 //BA.debugLineNum = 63111170;BA.debugLine="End Sub";
return "";
}
public String  _clearlastretrymode(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clearlastretrymode", false))
	 {return ((String) Debug.delegate(ba, "clearlastretrymode", null));}
RDebugUtils.currentLine=57081856;
 //BA.debugLineNum = 57081856;BA.debugLine="Public Sub ClearLastRetryMode";
RDebugUtils.currentLine=57081857;
 //BA.debugLineNum = 57081857;BA.debugLine="lastRetryMode = \"\"";
__ref._lastretrymode /*String*/  = "";
RDebugUtils.currentLine=57081858;
 //BA.debugLineNum = 57081858;BA.debugLine="End Sub";
return "";
}
public String  _setmediapathdegraded(b4j.example.playerstatestore __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setmediapathdegraded", false))
	 {return ((String) Debug.delegate(ba, "setmediapathdegraded", new Object[] {_value}));}
RDebugUtils.currentLine=63307776;
 //BA.debugLineNum = 63307776;BA.debugLine="Public Sub SetMediaPathDegraded(value As Boolean)";
RDebugUtils.currentLine=63307777;
 //BA.debugLineNum = 63307777;BA.debugLine="mediaPathDegradedFlag = value";
__ref._mediapathdegradedflag /*boolean*/  = _value;
RDebugUtils.currentLine=63307778;
 //BA.debugLineNum = 63307778;BA.debugLine="End Sub";
return "";
}
public String  _setstartupsequenceinprogress(b4j.example.playerstatestore __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setstartupsequenceinprogress", false))
	 {return ((String) Debug.delegate(ba, "setstartupsequenceinprogress", new Object[] {_value}));}
RDebugUtils.currentLine=59703296;
 //BA.debugLineNum = 59703296;BA.debugLine="Public Sub SetStartupSequenceInProgress(value As B";
RDebugUtils.currentLine=59703297;
 //BA.debugLineNum = 59703297;BA.debugLine="startupSequenceInProgress = value";
__ref._startupsequenceinprogress /*boolean*/  = _value;
RDebugUtils.currentLine=59703298;
 //BA.debugLineNum = 59703298;BA.debugLine="If value = False Then adWarmupDeferredAfterStartu";
if (_value==__c.False) { 
__ref._adwarmupdeferredafterstartup /*boolean*/  = __c.False;};
RDebugUtils.currentLine=59703299;
 //BA.debugLineNum = 59703299;BA.debugLine="End Sub";
return "";
}
public int  _consumedispatchretryafter(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "consumedispatchretryafter", false))
	 {return ((Integer) Debug.delegate(ba, "consumedispatchretryafter", null));}
int _value = 0;
RDebugUtils.currentLine=63242240;
 //BA.debugLineNum = 63242240;BA.debugLine="Public Sub ConsumeDispatchRetryAfter As Int";
RDebugUtils.currentLine=63242241;
 //BA.debugLineNum = 63242241;BA.debugLine="Dim value As Int = dispatchRetryAfter";
_value = __ref._dispatchretryafter /*int*/ ;
RDebugUtils.currentLine=63242242;
 //BA.debugLineNum = 63242242;BA.debugLine="dispatchRetryAfter = 0";
__ref._dispatchretryafter /*int*/  = (int) (0);
RDebugUtils.currentLine=63242243;
 //BA.debugLineNum = 63242243;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=63242244;
 //BA.debugLineNum = 63242244;BA.debugLine="End Sub";
return 0;
}
public String  _resolveidleuntilmessage(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _data,long _targetticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resolveidleuntilmessage", false))
	 {return ((String) Debug.delegate(ba, "resolveidleuntilmessage", new Object[] {_data,_targetticks}));}
RDebugUtils.currentLine=61800448;
 //BA.debugLineNum = 61800448;BA.debugLine="Public Sub ResolveIdleUntilMessage(data As Map, ta";
RDebugUtils.currentLine=61800449;
 //BA.debugLineNum = 61800449;BA.debugLine="Return owner.Data_ResolveIdleUntilMessage(data, t";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._data_resolveidleuntilmessage /*String*/ (null,_data,_targetticks);
RDebugUtils.currentLine=61800450;
 //BA.debugLineNum = 61800450;BA.debugLine="End Sub";
return "";
}
public long  _effectivenowticks(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "effectivenowticks", false))
	 {return ((Long) Debug.delegate(ba, "effectivenowticks", null));}
long _devicenow = 0L;
long _trustednow = 0L;
RDebugUtils.currentLine=59965440;
 //BA.debugLineNum = 59965440;BA.debugLine="Public Sub EffectiveNowTicks As Long";
RDebugUtils.currentLine=59965441;
 //BA.debugLineNum = 59965441;BA.debugLine="Dim deviceNow As Long = DateTime.Now";
_devicenow = __c.DateTime.getNow();
RDebugUtils.currentLine=59965442;
 //BA.debugLineNum = 59965442;BA.debugLine="Dim trustedNow As Long = storageRef.GetDefault(tr";
_trustednow = BA.ObjectToLongNumber(__ref._storageref /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,__ref._trustedsynctimekeyvalue /*String*/ ,(Object)(0)));
RDebugUtils.currentLine=59965443;
 //BA.debugLineNum = 59965443;BA.debugLine="If trustedNow > deviceNow Then Return trustedNow";
if (_trustednow>_devicenow) { 
if (true) return _trustednow;};
RDebugUtils.currentLine=59965444;
 //BA.debugLineNum = 59965444;BA.debugLine="Return deviceNow";
if (true) return _devicenow;
RDebugUtils.currentLine=59965445;
 //BA.debugLineNum = 59965445;BA.debugLine="End Sub";
return 0L;
}
public String  _setlasthistoryoknow(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setlasthistoryoknow", false))
	 {return ((String) Debug.delegate(ba, "setlasthistoryoknow", null));}
RDebugUtils.currentLine=57278464;
 //BA.debugLineNum = 57278464;BA.debugLine="Public Sub SetLastHistoryOkNow";
RDebugUtils.currentLine=57278465;
 //BA.debugLineNum = 57278465;BA.debugLine="historySuccessAtTicks = DateTime.Now";
__ref._historysuccessatticks /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=57278466;
 //BA.debugLineNum = 57278466;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextlocaltrackitem(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resolvenextlocaltrackitem", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvenextlocaltrackitem", null));}
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
anywheresoftware.b4a.objects.collections.Map _resolveditem = null;
RDebugUtils.currentLine=84934656;
 //BA.debugLineNum = 84934656;BA.debugLine="Public Sub ResolveNextLocalTrackItem As Map";
RDebugUtils.currentLine=84934657;
 //BA.debugLineNum = 84934657;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=84934658;
 //BA.debugLineNum = 84934658;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
RDebugUtils.currentLine=84934659;
 //BA.debugLineNum = 84934659;BA.debugLine="If HasUsableDataPlaybackInstructions = False Then";
if (__ref._hasusabledataplaybackinstructions /*boolean*/ (null)==__c.False) { 
if (true) return __ref._resolveanycachedlocaltrackitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,_emptyitem);};
RDebugUtils.currentLine=84934660;
 //BA.debugLineNum = 84934660;BA.debugLine="Dim currentSlot As Map = dataResolverRef.ResolveD";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._effectivenowticks /*long*/ (null));
RDebugUtils.currentLine=84934661;
 //BA.debugLineNum = 84934661;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
RDebugUtils.currentLine=84934662;
 //BA.debugLineNum = 84934662;BA.debugLine="Return ResolveAnyCachedLocalTrackItem(emptyItem)";
if (true) return __ref._resolveanycachedlocaltrackitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,_emptyitem);
 };
RDebugUtils.currentLine=84934664;
 //BA.debugLineNum = 84934664;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=84934665;
 //BA.debugLineNum = 84934665;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
RDebugUtils.currentLine=84934666;
 //BA.debugLineNum = 84934666;BA.debugLine="Return ResolveAnyCachedLocalTrackItem(currentSlo";
if (true) return __ref._resolveanycachedlocaltrackitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,_currentslot);
 };
RDebugUtils.currentLine=84934668;
 //BA.debugLineNum = 84934668;BA.debugLine="Dim resolvedItem As Map = ResolveSequentialSlotTr";
_resolveditem = new anywheresoftware.b4a.objects.collections.Map();
_resolveditem = __ref._resolvesequentialslottrackitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,_currentslot,_playlists);
RDebugUtils.currentLine=84934669;
 //BA.debugLineNum = 84934669;BA.debugLine="If resolvedItem.IsInitialized And resolvedItem.Si";
if (_resolveditem.IsInitialized() && _resolveditem.getSize()>0) { 
if (true) return _resolveditem;};
RDebugUtils.currentLine=84934670;
 //BA.debugLineNum = 84934670;BA.debugLine="resolvedItem = ResolveAnyCachedLocalTrackItem(cur";
_resolveditem = __ref._resolveanycachedlocaltrackitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,_currentslot);
RDebugUtils.currentLine=84934671;
 //BA.debugLineNum = 84934671;BA.debugLine="Return resolvedItem";
if (true) return _resolveditem;
RDebugUtils.currentLine=84934672;
 //BA.debugLineNum = 84934672;BA.debugLine="End Sub";
return null;
}
public boolean  _hasanycachedtrack(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "hasanycachedtrack", false))
	 {return ((Boolean) Debug.delegate(ba, "hasanycachedtrack", null));}
anywheresoftware.b4a.objects.collections.Map _playliststats = null;
RDebugUtils.currentLine=85655552;
 //BA.debugLineNum = 85655552;BA.debugLine="Public Sub HasAnyCachedTrack As Boolean";
RDebugUtils.currentLine=85655553;
 //BA.debugLineNum = 85655553;BA.debugLine="mediaCacheRef.EnsureTrackCacheReady";
__ref._mediacacheref /*b4j.example.mediacache*/ ._ensuretrackcacheready /*String*/ (null);
RDebugUtils.currentLine=85655554;
 //BA.debugLineNum = 85655554;BA.debugLine="If mediaCacheRef.GetCachedTrackCount > 0 Then Ret";
if (__ref._mediacacheref /*b4j.example.mediacache*/ ._getcachedtrackcount /*int*/ (null)>0) { 
if (true) return __c.True;};
RDebugUtils.currentLine=85655555;
 //BA.debugLineNum = 85655555;BA.debugLine="Dim playlistStats As Map = mediaCacheRef.GetCache";
_playliststats = new anywheresoftware.b4a.objects.collections.Map();
_playliststats = __ref._mediacacheref /*b4j.example.mediacache*/ ._getcachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=85655556;
 //BA.debugLineNum = 85655556;BA.debugLine="If playlistStats.IsInitialized And playlistStats.";
if (_playliststats.IsInitialized() && _playliststats.getSize()>0) { 
if (true) return __c.True;};
RDebugUtils.currentLine=85655557;
 //BA.debugLineNum = 85655557;BA.debugLine="Return mediaCacheRef.HasAnyTrackFilesOnDisk";
if (true) return __ref._mediacacheref /*b4j.example.mediacache*/ ._hasanytrackfilesondisk /*boolean*/ (null);
RDebugUtils.currentLine=85655558;
 //BA.debugLineNum = 85655558;BA.debugLine="End Sub";
return false;
}
public int  _getlocalplayablequeuecount(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.List _playqueue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "getlocalplayablequeuecount", false))
	 {return ((Integer) Debug.delegate(ba, "getlocalplayablequeuecount", new Object[] {_playqueue}));}
int _totalcount = 0;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=84606976;
 //BA.debugLineNum = 84606976;BA.debugLine="Public Sub GetLocalPlayableQueueCount(playQueue As";
RDebugUtils.currentLine=84606977;
 //BA.debugLineNum = 84606977;BA.debugLine="If playQueue.IsInitialized = False Then Return 0";
if (_playqueue.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=84606978;
 //BA.debugLineNum = 84606978;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
RDebugUtils.currentLine=84606979;
 //BA.debugLineNum = 84606979;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group3 = _playqueue;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_itemobject = group3.Get(index3);
RDebugUtils.currentLine=84606980;
 //BA.debugLineNum = 84606980;BA.debugLine="If (itemObject Is Map) = False Then Continue";
if ((_itemobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=84606981;
 //BA.debugLineNum = 84606981;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=84606982;
 //BA.debugLineNum = 84606982;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then C";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) continue;};
RDebugUtils.currentLine=84606983;
 //BA.debugLineNum = 84606983;BA.debugLine="If mediaCacheRef.HasValidatedLocalMedia(item) =";
if (__ref._mediacacheref /*b4j.example.mediacache*/ ._hasvalidatedlocalmedia /*boolean*/ (null,_item)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=84606984;
 //BA.debugLineNum = 84606984;BA.debugLine="totalCount = totalCount + 1";
_totalcount = (int) (_totalcount+1);
 }
};
RDebugUtils.currentLine=84606986;
 //BA.debugLineNum = 84606986;BA.debugLine="Return totalCount";
if (true) return _totalcount;
RDebugUtils.currentLine=84606987;
 //BA.debugLineNum = 84606987;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.example.playerstatestore __ref,anywheresoftware.b4a.BA _ba,b4j.example.b4xmainpage _mainpage,anywheresoftware.b4a.objects.Timer _retrytimervalue,b4j.example.playbackdatapolicystate _datapolicyvalue,b4j.example.playbackorchestrationstate _orchestrationstatevalue,b4j.example.keyvaluestore _storagevalue,String _trustedsynckeyvalue,b4j.example.offlinestore _offlinestorevalue,b4j.example.dataplaybackresolver _dataresolvervalue,b4j.example.mediacache _mediacachevalue,int _localretryinitial,int _serverretryinitial) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mainpage,_retrytimervalue,_datapolicyvalue,_orchestrationstatevalue,_storagevalue,_trustedsynckeyvalue,_offlinestorevalue,_dataresolvervalue,_mediacachevalue,_localretryinitial,_serverretryinitial}));}
RDebugUtils.currentLine=56688640;
 //BA.debugLineNum = 56688640;BA.debugLine="Public Sub Initialize(mainPage As B4XMainPage, ret";
RDebugUtils.currentLine=56688641;
 //BA.debugLineNum = 56688641;BA.debugLine="owner = mainPage";
__ref._owner /*b4j.example.b4xmainpage*/  = _mainpage;
RDebugUtils.currentLine=56688642;
 //BA.debugLineNum = 56688642;BA.debugLine="policyState = dataPolicyValue";
__ref._policystate /*b4j.example.playbackdatapolicystate*/  = _datapolicyvalue;
RDebugUtils.currentLine=56688643;
 //BA.debugLineNum = 56688643;BA.debugLine="orchestrationStateRef = orchestrationStateValue";
__ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/  = _orchestrationstatevalue;
RDebugUtils.currentLine=56688644;
 //BA.debugLineNum = 56688644;BA.debugLine="offlineStoreRef = offlineStoreValue";
__ref._offlinestoreref /*b4j.example.offlinestore*/  = _offlinestorevalue;
RDebugUtils.currentLine=56688645;
 //BA.debugLineNum = 56688645;BA.debugLine="dataResolverRef = dataResolverValue";
__ref._dataresolverref /*b4j.example.dataplaybackresolver*/  = _dataresolvervalue;
RDebugUtils.currentLine=56688646;
 //BA.debugLineNum = 56688646;BA.debugLine="mediaCacheRef = mediaCacheValue";
__ref._mediacacheref /*b4j.example.mediacache*/  = _mediacachevalue;
RDebugUtils.currentLine=56688647;
 //BA.debugLineNum = 56688647;BA.debugLine="storageRef = storageValue";
__ref._storageref /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=56688648;
 //BA.debugLineNum = 56688648;BA.debugLine="trustedSyncTimeKeyValue = trustedSyncKeyValue";
__ref._trustedsynctimekeyvalue /*String*/  = _trustedsynckeyvalue;
RDebugUtils.currentLine=56688649;
 //BA.debugLineNum = 56688649;BA.debugLine="retryTimerRef = retryTimerValue";
__ref._retrytimerref /*anywheresoftware.b4a.objects.Timer*/  = _retrytimervalue;
RDebugUtils.currentLine=56688650;
 //BA.debugLineNum = 56688650;BA.debugLine="offlineDataRef.Initialize";
__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=56688651;
 //BA.debugLineNum = 56688651;BA.debugLine="ResetRetryDelayState(localRetryInitial, serverRet";
__ref._resetretrydelaystate /*String*/ (null,_localretryinitial,_serverretryinitial);
RDebugUtils.currentLine=56688652;
 //BA.debugLineNum = 56688652;BA.debugLine="End Sub";
return "";
}
public String  _setofflinedata(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setofflinedata", false))
	 {return ((String) Debug.delegate(ba, "setofflinedata", new Object[] {_data}));}
RDebugUtils.currentLine=59179008;
 //BA.debugLineNum = 59179008;BA.debugLine="Public Sub SetOfflineData(data As Map)";
RDebugUtils.currentLine=59179009;
 //BA.debugLineNum = 59179009;BA.debugLine="If data.IsInitialized Then";
if (_data.IsInitialized()) { 
RDebugUtils.currentLine=59179010;
 //BA.debugLineNum = 59179010;BA.debugLine="offlineDataRef = data";
__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/  = _data;
 }else {
RDebugUtils.currentLine=59179012;
 //BA.debugLineNum = 59179012;BA.debugLine="offlineDataRef.Initialize";
__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=59179014;
 //BA.debugLineNum = 59179014;BA.debugLine="End Sub";
return "";
}
public boolean  _ismediapathdegraded(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "ismediapathdegraded", false))
	 {return ((Boolean) Debug.delegate(ba, "ismediapathdegraded", null));}
RDebugUtils.currentLine=63373312;
 //BA.debugLineNum = 63373312;BA.debugLine="Public Sub IsMediaPathDegraded As Boolean";
RDebugUtils.currentLine=63373313;
 //BA.debugLineNum = 63373313;BA.debugLine="Return mediaPathDegradedFlag";
if (true) return __ref._mediapathdegradedflag /*boolean*/ ;
RDebugUtils.currentLine=63373314;
 //BA.debugLineNum = 63373314;BA.debugLine="End Sub";
return false;
}
public String  _setdispatchretryafter(b4j.example.playerstatestore __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setdispatchretryafter", false))
	 {return ((String) Debug.delegate(ba, "setdispatchretryafter", new Object[] {_value}));}
RDebugUtils.currentLine=63176704;
 //BA.debugLineNum = 63176704;BA.debugLine="Public Sub SetDispatchRetryAfter(value As Int)";
RDebugUtils.currentLine=63176705;
 //BA.debugLineNum = 63176705;BA.debugLine="dispatchRetryAfter = Max(0, value)";
__ref._dispatchretryafter /*int*/  = (int) (__c.Max(0,_value));
RDebugUtils.currentLine=63176706;
 //BA.debugLineNum = 63176706;BA.debugLine="End Sub";
return "";
}
public String  _getlastretrymode(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "getlastretrymode", false))
	 {return ((String) Debug.delegate(ba, "getlastretrymode", null));}
RDebugUtils.currentLine=57016320;
 //BA.debugLineNum = 57016320;BA.debugLine="Public Sub GetLastRetryMode As String";
RDebugUtils.currentLine=57016321;
 //BA.debugLineNum = 57016321;BA.debugLine="Return lastRetryMode";
if (true) return __ref._lastretrymode /*String*/ ;
RDebugUtils.currentLine=57016322;
 //BA.debugLineNum = 57016322;BA.debugLine="End Sub";
return "";
}
public String  _updatemediapathdegradedfromcachesync(b4j.example.playerstatestore __ref,boolean _downloaded,boolean _networkfailure) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "updatemediapathdegradedfromcachesync", false))
	 {return ((String) Debug.delegate(ba, "updatemediapathdegradedfromcachesync", new Object[] {_downloaded,_networkfailure}));}
boolean _previous = false;
RDebugUtils.currentLine=86638592;
 //BA.debugLineNum = 86638592;BA.debugLine="Public Sub UpdateMediaPathDegradedFromCacheSync(do";
RDebugUtils.currentLine=86638593;
 //BA.debugLineNum = 86638593;BA.debugLine="Dim previous As Boolean = mediaPathDegradedFlag";
_previous = __ref._mediapathdegradedflag /*boolean*/ ;
RDebugUtils.currentLine=86638594;
 //BA.debugLineNum = 86638594;BA.debugLine="If downloaded Then";
if (_downloaded) { 
RDebugUtils.currentLine=86638595;
 //BA.debugLineNum = 86638595;BA.debugLine="mediaPathDegradedFlag = False";
__ref._mediapathdegradedflag /*boolean*/  = __c.False;
 }else 
{RDebugUtils.currentLine=86638596;
 //BA.debugLineNum = 86638596;BA.debugLine="Else If networkFailure Then";
if (_networkfailure) { 
RDebugUtils.currentLine=86638597;
 //BA.debugLineNum = 86638597;BA.debugLine="mediaPathDegradedFlag = True";
__ref._mediapathdegradedflag /*boolean*/  = __c.True;
 }}
;
RDebugUtils.currentLine=86638599;
 //BA.debugLineNum = 86638599;BA.debugLine="If previous = False And mediaPathDegradedFlag The";
if (_previous==__c.False && __ref._mediapathdegradedflag /*boolean*/ ) { 
if (true) return "entered";};
RDebugUtils.currentLine=86638600;
 //BA.debugLineNum = 86638600;BA.debugLine="If previous = True And mediaPathDegradedFlag = Fa";
if (_previous==__c.True && __ref._mediapathdegradedflag /*boolean*/ ==__c.False) { 
if (true) return "recovered";};
RDebugUtils.currentLine=86638601;
 //BA.debugLineNum = 86638601;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=86638602;
 //BA.debugLineNum = 86638602;BA.debugLine="End Sub";
return "";
}
public int  _getconsecutivenetworkerrors(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "getconsecutivenetworkerrors", false))
	 {return ((Integer) Debug.delegate(ba, "getconsecutivenetworkerrors", null));}
RDebugUtils.currentLine=56885248;
 //BA.debugLineNum = 56885248;BA.debugLine="Public Sub GetConsecutiveNetworkErrors As Int";
RDebugUtils.currentLine=56885249;
 //BA.debugLineNum = 56885249;BA.debugLine="Return consecutiveNetworkErrors";
if (true) return __ref._consecutivenetworkerrors /*int*/ ;
RDebugUtils.currentLine=56885250;
 //BA.debugLineNum = 56885250;BA.debugLine="End Sub";
return 0;
}
public long  _getlastdataokat(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "getlastdataokat", false))
	 {return ((Long) Debug.delegate(ba, "getlastdataokat", null));}
RDebugUtils.currentLine=57212928;
 //BA.debugLineNum = 57212928;BA.debugLine="Public Sub GetLastDataOkAt As Long";
RDebugUtils.currentLine=57212929;
 //BA.debugLineNum = 57212929;BA.debugLine="Return dataSuccessAtTicks";
if (true) return __ref._datasuccessatticks /*long*/ ;
RDebugUtils.currentLine=57212930;
 //BA.debugLineNum = 57212930;BA.debugLine="End Sub";
return 0L;
}
public long  _getlasthistoryokat(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "getlasthistoryokat", false))
	 {return ((Long) Debug.delegate(ba, "getlasthistoryokat", null));}
RDebugUtils.currentLine=57344000;
 //BA.debugLineNum = 57344000;BA.debugLine="Public Sub GetLastHistoryOkAt As Long";
RDebugUtils.currentLine=57344001;
 //BA.debugLineNum = 57344001;BA.debugLine="Return historySuccessAtTicks";
if (true) return __ref._historysuccessatticks /*long*/ ;
RDebugUtils.currentLine=57344002;
 //BA.debugLineNum = 57344002;BA.debugLine="End Sub";
return 0L;
}
public String  _applyclientrequestheaders(b4j.example.playerstatestore __ref,b4j.example.httpjob _j) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "applyclientrequestheaders", false))
	 {return ((String) Debug.delegate(ba, "applyclientrequestheaders", new Object[] {_j}));}
RDebugUtils.currentLine=58327040;
 //BA.debugLineNum = 58327040;BA.debugLine="Public Sub ApplyClientRequestHeaders(j As HttpJob)";
RDebugUtils.currentLine=58327041;
 //BA.debugLineNum = 58327041;BA.debugLine="owner.Data_ApplyClientRequestHeaders(j)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_applyclientrequestheaders /*String*/ (null,_j);
RDebugUtils.currentLine=58327042;
 //BA.debugLineNum = 58327042;BA.debugLine="End Sub";
return "";
}
public String  _applytemporarymode(b4j.example.playerstatestore __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "applytemporarymode", false))
	 {return ((String) Debug.delegate(ba, "applytemporarymode", new Object[] {_mode}));}
RDebugUtils.currentLine=60882944;
 //BA.debugLineNum = 60882944;BA.debugLine="Public Sub ApplyTemporaryMode(mode As String)";
RDebugUtils.currentLine=60882945;
 //BA.debugLineNum = 60882945;BA.debugLine="owner.Data_ApplyTemporaryMode(mode)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_applytemporarymode /*String*/ (null,_mode);
RDebugUtils.currentLine=60882946;
 //BA.debugLineNum = 60882946;BA.debugLine="End Sub";
return "";
}
public boolean  _beginofflinedatarefresh(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "beginofflinedatarefresh", false))
	 {return ((Boolean) Debug.delegate(ba, "beginofflinedatarefresh", null));}
RDebugUtils.currentLine=58523648;
 //BA.debugLineNum = 58523648;BA.debugLine="Public Sub BeginOfflineDataRefresh As Boolean";
RDebugUtils.currentLine=58523649;
 //BA.debugLineNum = 58523649;BA.debugLine="Return policyState.BeginOfflineDataRefresh";
if (true) return __ref._policystate /*b4j.example.playbackdatapolicystate*/ ._beginofflinedatarefresh /*boolean*/ (null);
RDebugUtils.currentLine=58523650;
 //BA.debugLineNum = 58523650;BA.debugLine="End Sub";
return false;
}
public String  _builddataslotkey(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _currentslot) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "builddataslotkey", false))
	 {return ((String) Debug.delegate(ba, "builddataslotkey", new Object[] {_currentslot}));}
RDebugUtils.currentLine=63832064;
 //BA.debugLineNum = 63832064;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
RDebugUtils.currentLine=63832065;
 //BA.debugLineNum = 63832065;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
if (true) return BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=63832066;
 //BA.debugLineNum = 63832066;BA.debugLine="End Sub";
return "";
}
public String  _checkforappupdate(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "checkforappupdate", false))
	 {return ((String) Debug.delegate(ba, "checkforappupdate", new Object[] {_data}));}
RDebugUtils.currentLine=57802752;
 //BA.debugLineNum = 57802752;BA.debugLine="Public Sub CheckForAppUpdate(data As Map)";
RDebugUtils.currentLine=57802753;
 //BA.debugLineNum = 57802753;BA.debugLine="owner.Data_CheckForAppUpdate(data)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_checkforappupdate /*String*/ (null,_data);
RDebugUtils.currentLine=57802754;
 //BA.debugLineNum = 57802754;BA.debugLine="End Sub";
return "";
}
public String  _claimurlvalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "claimurlvalue", false))
	 {return ((String) Debug.delegate(ba, "claimurlvalue", null));}
RDebugUtils.currentLine=57933824;
 //BA.debugLineNum = 57933824;BA.debugLine="Public Sub ClaimUrlValue As String";
RDebugUtils.currentLine=57933825;
 //BA.debugLineNum = 57933825;BA.debugLine="Return owner.ClaimUrlValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._claimurlvalue /*String*/ (null);
RDebugUtils.currentLine=57933826;
 //BA.debugLineNum = 57933826;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
RDebugUtils.currentLine=56623104;
 //BA.debugLineNum = 56623104;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=56623105;
 //BA.debugLineNum = 56623105;BA.debugLine="Private owner As B4XMainPage";
_owner = new b4j.example.b4xmainpage();
RDebugUtils.currentLine=56623106;
 //BA.debugLineNum = 56623106;BA.debugLine="Private policyState As PlaybackDataPolicyState";
_policystate = new b4j.example.playbackdatapolicystate();
RDebugUtils.currentLine=56623107;
 //BA.debugLineNum = 56623107;BA.debugLine="Private orchestrationStateRef As PlaybackOrchestr";
_orchestrationstateref = new b4j.example.playbackorchestrationstate();
RDebugUtils.currentLine=56623108;
 //BA.debugLineNum = 56623108;BA.debugLine="Private offlineStoreRef As OfflineStore";
_offlinestoreref = new b4j.example.offlinestore();
RDebugUtils.currentLine=56623109;
 //BA.debugLineNum = 56623109;BA.debugLine="Private dataResolverRef As DataPlaybackResolver";
_dataresolverref = new b4j.example.dataplaybackresolver();
RDebugUtils.currentLine=56623110;
 //BA.debugLineNum = 56623110;BA.debugLine="Private mediaCacheRef As MediaCache";
_mediacacheref = new b4j.example.mediacache();
RDebugUtils.currentLine=56623111;
 //BA.debugLineNum = 56623111;BA.debugLine="Private storageRef As KeyValueStore";
_storageref = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=56623112;
 //BA.debugLineNum = 56623112;BA.debugLine="Private trustedSyncTimeKeyValue As String";
_trustedsynctimekeyvalue = "";
RDebugUtils.currentLine=56623113;
 //BA.debugLineNum = 56623113;BA.debugLine="Private retryTimerRef As Timer";
_retrytimerref = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=56623114;
 //BA.debugLineNum = 56623114;BA.debugLine="Private offlineDataRef As Map";
_offlinedataref = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56623115;
 //BA.debugLineNum = 56623115;BA.debugLine="Private consecutiveNetworkErrors As Int";
_consecutivenetworkerrors = 0;
RDebugUtils.currentLine=56623116;
 //BA.debugLineNum = 56623116;BA.debugLine="Private lastRetryMode As String";
_lastretrymode = "";
RDebugUtils.currentLine=56623117;
 //BA.debugLineNum = 56623117;BA.debugLine="Private dataSuccessAtTicks As Long";
_datasuccessatticks = 0L;
RDebugUtils.currentLine=56623118;
 //BA.debugLineNum = 56623118;BA.debugLine="Private historySuccessAtTicks As Long";
_historysuccessatticks = 0L;
RDebugUtils.currentLine=56623119;
 //BA.debugLineNum = 56623119;BA.debugLine="Private startupSequenceInProgress As Boolean";
_startupsequenceinprogress = false;
RDebugUtils.currentLine=56623120;
 //BA.debugLineNum = 56623120;BA.debugLine="Private adWarmupDeferredAfterStartup As Boolean";
_adwarmupdeferredafterstartup = false;
RDebugUtils.currentLine=56623121;
 //BA.debugLineNum = 56623121;BA.debugLine="Private localRetryDelay As Int";
_localretrydelay = 0;
RDebugUtils.currentLine=56623122;
 //BA.debugLineNum = 56623122;BA.debugLine="Private serverRetryDelay As Int";
_serverretrydelay = 0;
RDebugUtils.currentLine=56623123;
 //BA.debugLineNum = 56623123;BA.debugLine="Private dispatchRetryAfter As Int";
_dispatchretryafter = 0;
RDebugUtils.currentLine=56623124;
 //BA.debugLineNum = 56623124;BA.debugLine="Private mediaPathDegradedFlag As Boolean";
_mediapathdegradedflag = false;
RDebugUtils.currentLine=56623125;
 //BA.debugLineNum = 56623125;BA.debugLine="End Sub";
return "";
}
public String  _clearplaybackstate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clearplaybackstate", false))
	 {return ((String) Debug.delegate(ba, "clearplaybackstate", null));}
RDebugUtils.currentLine=60948480;
 //BA.debugLineNum = 60948480;BA.debugLine="Public Sub ClearPlaybackState";
RDebugUtils.currentLine=60948481;
 //BA.debugLineNum = 60948481;BA.debugLine="owner.Data_ClearPlaybackState";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=60948482;
 //BA.debugLineNum = 60948482;BA.debugLine="End Sub";
return "";
}
public String  _clearpolicypause(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clearpolicypause", false))
	 {return ((String) Debug.delegate(ba, "clearpolicypause", null));}
RDebugUtils.currentLine=60686336;
 //BA.debugLineNum = 60686336;BA.debugLine="Public Sub ClearPolicyPause";
RDebugUtils.currentLine=60686337;
 //BA.debugLineNum = 60686337;BA.debugLine="owner.Data_ClearPolicyPause";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=60686338;
 //BA.debugLineNum = 60686338;BA.debugLine="End Sub";
return "";
}
public String  _clearpolicypauseandresumerequest(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clearpolicypauseandresumerequest", false))
	 {return ((String) Debug.delegate(ba, "clearpolicypauseandresumerequest", null));}
RDebugUtils.currentLine=61341696;
 //BA.debugLineNum = 61341696;BA.debugLine="Public Sub ClearPolicyPauseAndResumeRequest";
RDebugUtils.currentLine=61341697;
 //BA.debugLineNum = 61341697;BA.debugLine="owner.Data_ClearPolicyPauseAndResumeRequest";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=61341698;
 //BA.debugLineNum = 61341698;BA.debugLine="End Sub";
return "";
}
public String  _clearresumeplaybackwhenserverallows(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clearresumeplaybackwhenserverallows", false))
	 {return ((String) Debug.delegate(ba, "clearresumeplaybackwhenserverallows", null));}
RDebugUtils.currentLine=58916864;
 //BA.debugLineNum = 58916864;BA.debugLine="Public Sub ClearResumePlaybackWhenServerAllows";
RDebugUtils.currentLine=58916865;
 //BA.debugLineNum = 58916865;BA.debugLine="policyState.ResumePlaybackWhenServerAllows = Fals";
__ref._policystate /*b4j.example.playbackdatapolicystate*/ ._resumeplaybackwhenserverallows /*boolean*/  = __c.False;
RDebugUtils.currentLine=58916866;
 //BA.debugLineNum = 58916866;BA.debugLine="End Sub";
return "";
}
public String  _clearretrytimer(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clearretrytimer", false))
	 {return ((String) Debug.delegate(ba, "clearretrytimer", null));}
RDebugUtils.currentLine=62717952;
 //BA.debugLineNum = 62717952;BA.debugLine="Public Sub ClearRetryTimer";
RDebugUtils.currentLine=62717953;
 //BA.debugLineNum = 62717953;BA.debugLine="retryTimerRef.Enabled = False";
__ref._retrytimerref /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=62717954;
 //BA.debugLineNum = 62717954;BA.debugLine="ClearLastRetryMode";
__ref._clearlastretrymode /*String*/ (null);
RDebugUtils.currentLine=62717955;
 //BA.debugLineNum = 62717955;BA.debugLine="End Sub";
return "";
}
public String  _clientosnamevalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clientosnamevalue", false))
	 {return ((String) Debug.delegate(ba, "clientosnamevalue", null));}
RDebugUtils.currentLine=57606144;
 //BA.debugLineNum = 57606144;BA.debugLine="Public Sub ClientOsNameValue As String";
RDebugUtils.currentLine=57606145;
 //BA.debugLineNum = 57606145;BA.debugLine="Return owner.ClientOsNameValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._clientosnamevalue /*String*/ (null);
RDebugUtils.currentLine=57606146;
 //BA.debugLineNum = 57606146;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
RDebugUtils.currentLine=63897600;
 //BA.debugLineNum = 63897600;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=63897601;
 //BA.debugLineNum = 63897601;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=63897602;
 //BA.debugLineNum = 63897602;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
RDebugUtils.currentLine=63897603;
 //BA.debugLineNum = 63897603;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
RDebugUtils.currentLine=63897604;
 //BA.debugLineNum = 63897604;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=63897605;
 //BA.debugLineNum = 63897605;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=63897607;
 //BA.debugLineNum = 63897607;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
RDebugUtils.currentLine=63897608;
 //BA.debugLineNum = 63897608;BA.debugLine="End Sub";
return null;
}
public String  _consumelastexception(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "consumelastexception", false))
	 {return ((String) Debug.delegate(ba, "consumelastexception", null));}
RDebugUtils.currentLine=58261504;
 //BA.debugLineNum = 58261504;BA.debugLine="Public Sub ConsumeLastException";
RDebugUtils.currentLine=58261505;
 //BA.debugLineNum = 58261505;BA.debugLine="owner.Data_ConsumeLastException";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_consumelastexception /*String*/ (null);
RDebugUtils.currentLine=58261506;
 //BA.debugLineNum = 58261506;BA.debugLine="End Sub";
return "";
}
public String  _dataurlvalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "dataurlvalue", false))
	 {return ((String) Debug.delegate(ba, "dataurlvalue", null));}
RDebugUtils.currentLine=57737216;
 //BA.debugLineNum = 57737216;BA.debugLine="Public Sub DataUrlValue As String";
RDebugUtils.currentLine=57737217;
 //BA.debugLineNum = 57737217;BA.debugLine="Return owner.DataUrlValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._dataurlvalue /*String*/ (null);
RDebugUtils.currentLine=57737218;
 //BA.debugLineNum = 57737218;BA.debugLine="End Sub";
return "";
}
public String  _deferadwarmupafterstartup(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "deferadwarmupafterstartup", false))
	 {return ((String) Debug.delegate(ba, "deferadwarmupafterstartup", null));}
RDebugUtils.currentLine=59768832;
 //BA.debugLineNum = 59768832;BA.debugLine="Public Sub DeferAdWarmupAfterStartup";
RDebugUtils.currentLine=59768833;
 //BA.debugLineNum = 59768833;BA.debugLine="adWarmupDeferredAfterStartup = True";
__ref._adwarmupdeferredafterstartup /*boolean*/  = __c.True;
RDebugUtils.currentLine=59768834;
 //BA.debugLineNum = 59768834;BA.debugLine="End Sub";
return "";
}
public String  _deviceidvalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "deviceidvalue", false))
	 {return ((String) Debug.delegate(ba, "deviceidvalue", null));}
RDebugUtils.currentLine=57475072;
 //BA.debugLineNum = 57475072;BA.debugLine="Public Sub DeviceIdValue As String";
RDebugUtils.currentLine=57475073;
 //BA.debugLineNum = 57475073;BA.debugLine="Return owner.DeviceIdValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._deviceidvalue /*String*/ (null);
RDebugUtils.currentLine=57475074;
 //BA.debugLineNum = 57475074;BA.debugLine="End Sub";
return "";
}
public String  _disablebackgroundrefreshtimers(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "disablebackgroundrefreshtimers", false))
	 {return ((String) Debug.delegate(ba, "disablebackgroundrefreshtimers", null));}
RDebugUtils.currentLine=61865984;
 //BA.debugLineNum = 61865984;BA.debugLine="Public Sub DisableBackgroundRefreshTimers";
RDebugUtils.currentLine=61865985;
 //BA.debugLineNum = 61865985;BA.debugLine="owner.Data_DisableBackgroundRefreshTimers";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_disablebackgroundrefreshtimers /*String*/ (null);
RDebugUtils.currentLine=61865986;
 //BA.debugLineNum = 61865986;BA.debugLine="End Sub";
return "";
}
public String  _enableretrytimer(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "enableretrytimer", false))
	 {return ((String) Debug.delegate(ba, "enableretrytimer", null));}
RDebugUtils.currentLine=62980096;
 //BA.debugLineNum = 62980096;BA.debugLine="Public Sub EnableRetryTimer";
RDebugUtils.currentLine=62980097;
 //BA.debugLineNum = 62980097;BA.debugLine="retryTimerRef.Enabled = True";
__ref._retrytimerref /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=62980098;
 //BA.debugLineNum = 62980098;BA.debugLine="End Sub";
return "";
}
public String  _endofflinedatarefresh(b4j.example.playerstatestore __ref,String _statevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "endofflinedatarefresh", false))
	 {return ((String) Debug.delegate(ba, "endofflinedatarefresh", new Object[] {_statevalue}));}
RDebugUtils.currentLine=58589184;
 //BA.debugLineNum = 58589184;BA.debugLine="Public Sub EndOfflineDataRefresh(stateValue As Str";
RDebugUtils.currentLine=58589185;
 //BA.debugLineNum = 58589185;BA.debugLine="policyState.EndOfflineDataRefresh(stateValue)";
__ref._policystate /*b4j.example.playbackdatapolicystate*/ ._endofflinedatarefresh /*String*/ (null,_statevalue);
RDebugUtils.currentLine=58589186;
 //BA.debugLineNum = 58589186;BA.debugLine="End Sub";
return "";
}
public String  _ensureadcachesyncasync(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "ensureadcachesyncasync", false))
	 {return ((String) Debug.delegate(ba, "ensureadcachesyncasync", null));}
RDebugUtils.currentLine=59899904;
 //BA.debugLineNum = 59899904;BA.debugLine="Public Sub EnsureAdCacheSyncAsync";
RDebugUtils.currentLine=59899905;
 //BA.debugLineNum = 59899905;BA.debugLine="owner.Data_EnsureAdCacheSyncAsync";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_ensureadcachesyncasync /*String*/ (null);
RDebugUtils.currentLine=59899906;
 //BA.debugLineNum = 59899906;BA.debugLine="End Sub";
return "";
}
public String  _enterlocalplayback(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "enterlocalplayback", false))
	 {return ((String) Debug.delegate(ba, "enterlocalplayback", null));}
RDebugUtils.currentLine=61538304;
 //BA.debugLineNum = 61538304;BA.debugLine="Public Sub EnterLocalPlayback";
RDebugUtils.currentLine=61538305;
 //BA.debugLineNum = 61538305;BA.debugLine="owner.Data_EnterLocalPlayback";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_enterlocalplayback /*String*/ (null);
RDebugUtils.currentLine=61538306;
 //BA.debugLineNum = 61538306;BA.debugLine="End Sub";
return "";
}
public String  _enterpolicypause(b4j.example.playerstatestore __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "enterpolicypause", false))
	 {return ((String) Debug.delegate(ba, "enterpolicypause", new Object[] {_reason,_connectionmode}));}
RDebugUtils.currentLine=61210624;
 //BA.debugLineNum = 61210624;BA.debugLine="Public Sub EnterPolicyPause(reason As String, conn";
RDebugUtils.currentLine=61210625;
 //BA.debugLineNum = 61210625;BA.debugLine="owner.Data_EnterPolicyPause(reason, connectionMod";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_enterpolicypause /*String*/ (null,_reason,_connectionmode);
RDebugUtils.currentLine=61210626;
 //BA.debugLineNum = 61210626;BA.debugLine="End Sub";
return "";
}
public String  _enterstartedstate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "enterstartedstate", false))
	 {return ((String) Debug.delegate(ba, "enterstartedstate", null));}
RDebugUtils.currentLine=60424192;
 //BA.debugLineNum = 60424192;BA.debugLine="Public Sub EnterStartedState";
RDebugUtils.currentLine=60424193;
 //BA.debugLineNum = 60424193;BA.debugLine="orchestrationStateRef.EnterStartedState";
__ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=60424194;
 //BA.debugLineNum = 60424194;BA.debugLine="End Sub";
return "";
}
public String  _enteruserstoppedstate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "enteruserstoppedstate", false))
	 {return ((String) Debug.delegate(ba, "enteruserstoppedstate", null));}
RDebugUtils.currentLine=61407232;
 //BA.debugLineNum = 61407232;BA.debugLine="Public Sub EnterUserStoppedState";
RDebugUtils.currentLine=61407233;
 //BA.debugLineNum = 61407233;BA.debugLine="owner.Data_EnterUserStoppedState";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=61407234;
 //BA.debugLineNum = 61407234;BA.debugLine="End Sub";
return "";
}
public String  _flushtracebufferasync(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "flushtracebufferasync", false))
	 {return ((String) Debug.delegate(ba, "flushtracebufferasync", null));}
RDebugUtils.currentLine=59375616;
 //BA.debugLineNum = 59375616;BA.debugLine="Public Sub FlushTraceBufferAsync";
RDebugUtils.currentLine=59375617;
 //BA.debugLineNum = 59375617;BA.debugLine="owner.Data_FlushTraceBufferAsync";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_flushtracebufferasync /*String*/ (null);
RDebugUtils.currentLine=59375618;
 //BA.debugLineNum = 59375618;BA.debugLine="End Sub";
return "";
}
public int  _getcurrentslotlocalreservecount(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "getcurrentslotlocalreservecount", false))
	 {return ((Integer) Debug.delegate(ba, "getcurrentslotlocalreservecount", null));}
RDebugUtils.currentLine=84541440;
 //BA.debugLineNum = 84541440;BA.debugLine="Public Sub GetCurrentSlotLocalReserveCount As Int";
RDebugUtils.currentLine=84541441;
 //BA.debugLineNum = 84541441;BA.debugLine="Return owner.Data_GetCurrentSlotLocalReserveCount";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._data_getcurrentslotlocalreservecount /*int*/ (null);
RDebugUtils.currentLine=84541442;
 //BA.debugLineNum = 84541442;BA.debugLine="End Sub";
return 0;
}
public int  _getretryinterval(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "getretryinterval", false))
	 {return ((Integer) Debug.delegate(ba, "getretryinterval", null));}
RDebugUtils.currentLine=62849024;
 //BA.debugLineNum = 62849024;BA.debugLine="Public Sub GetRetryInterval As Int";
RDebugUtils.currentLine=62849025;
 //BA.debugLineNum = 62849025;BA.debugLine="Return retryTimerRef.Interval";
if (true) return (int) (__ref._retrytimerref /*anywheresoftware.b4a.objects.Timer*/ .getInterval());
RDebugUtils.currentLine=62849026;
 //BA.debugLineNum = 62849026;BA.debugLine="End Sub";
return 0;
}
public String  _handlemessageitem(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "handlemessageitem", false))
	 {return ((String) Debug.delegate(ba, "handlemessageitem", new Object[] {_item}));}
RDebugUtils.currentLine=60751872;
 //BA.debugLineNum = 60751872;BA.debugLine="Public Sub HandleMessageItem(item As Map)";
RDebugUtils.currentLine=60751873;
 //BA.debugLineNum = 60751873;BA.debugLine="owner.Data_HandleMessageItem(item)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_handlemessageitem /*String*/ (null,_item);
RDebugUtils.currentLine=60751874;
 //BA.debugLineNum = 60751874;BA.debugLine="End Sub";
return "";
}
public boolean  _haslocalplaybackfallback(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "haslocalplaybackfallback", false))
	 {return ((Boolean) Debug.delegate(ba, "haslocalplaybackfallback", null));}
RDebugUtils.currentLine=61669376;
 //BA.debugLineNum = 61669376;BA.debugLine="Public Sub HasLocalPlaybackFallback As Boolean";
RDebugUtils.currentLine=61669377;
 //BA.debugLineNum = 61669377;BA.debugLine="Return owner.Data_HasLocalPlaybackFallback";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._data_haslocalplaybackfallback /*boolean*/ (null);
RDebugUtils.currentLine=61669378;
 //BA.debugLineNum = 61669378;BA.debugLine="End Sub";
return false;
}
public boolean  _hasusabledataplaybackinstructions(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "hasusabledataplaybackinstructions", false))
	 {return ((Boolean) Debug.delegate(ba, "hasusabledataplaybackinstructions", null));}
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4a.objects.collections.List _schedules = null;
RDebugUtils.currentLine=86245376;
 //BA.debugLineNum = 86245376;BA.debugLine="Private Sub HasUsableDataPlaybackInstructions As B";
RDebugUtils.currentLine=86245377;
 //BA.debugLineNum = 86245377;BA.debugLine="Dim data As Map = OfflineData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = __ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=86245378;
 //BA.debugLineNum = 86245378;BA.debugLine="If data.IsInitialized = False Then Return False";
if (_data.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=86245379;
 //BA.debugLineNum = 86245379;BA.debugLine="If data.GetDefault(\"ok\", False) <> True Then Retu";
if ((_data.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=86245380;
 //BA.debugLineNum = 86245380;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=86245381;
 //BA.debugLineNum = 86245381;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=86245382;
 //BA.debugLineNum = 86245382;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=86245383;
 //BA.debugLineNum = 86245383;BA.debugLine="End Sub";
return false;
}
public String  _hidecontentblocks(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "hidecontentblocks", false))
	 {return ((String) Debug.delegate(ba, "hidecontentblocks", null));}
RDebugUtils.currentLine=60555264;
 //BA.debugLineNum = 60555264;BA.debugLine="Public Sub HideContentBlocks";
RDebugUtils.currentLine=60555265;
 //BA.debugLineNum = 60555265;BA.debugLine="owner.Data_HideContentBlocks";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=60555266;
 //BA.debugLineNum = 60555266;BA.debugLine="End Sub";
return "";
}
public String  _hidepin(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "hidepin", false))
	 {return ((String) Debug.delegate(ba, "hidepin", null));}
RDebugUtils.currentLine=61014016;
 //BA.debugLineNum = 61014016;BA.debugLine="Public Sub HidePin";
RDebugUtils.currentLine=61014017;
 //BA.debugLineNum = 61014017;BA.debugLine="owner.Data_HidePin";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_hidepin /*String*/ (null);
RDebugUtils.currentLine=61014018;
 //BA.debugLineNum = 61014018;BA.debugLine="End Sub";
return "";
}
public String  _incrementnetworkerrorcount(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "incrementnetworkerrorcount", false))
	 {return ((String) Debug.delegate(ba, "incrementnetworkerrorcount", null));}
RDebugUtils.currentLine=56754176;
 //BA.debugLineNum = 56754176;BA.debugLine="Public Sub IncrementNetworkErrorCount";
RDebugUtils.currentLine=56754177;
 //BA.debugLineNum = 56754177;BA.debugLine="consecutiveNetworkErrors = consecutiveNetworkErro";
__ref._consecutivenetworkerrors /*int*/  = (int) (__ref._consecutivenetworkerrors /*int*/ +1);
RDebugUtils.currentLine=56754178;
 //BA.debugLineNum = 56754178;BA.debugLine="End Sub";
return "";
}
public String  _resetretrydelaystate(b4j.example.playerstatestore __ref,int _localretryinitial,int _serverretryinitial) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resetretrydelaystate", false))
	 {return ((String) Debug.delegate(ba, "resetretrydelaystate", new Object[] {_localretryinitial,_serverretryinitial}));}
RDebugUtils.currentLine=63045632;
 //BA.debugLineNum = 63045632;BA.debugLine="Public Sub ResetRetryDelayState(localRetryInitial";
RDebugUtils.currentLine=63045633;
 //BA.debugLineNum = 63045633;BA.debugLine="localRetryDelay = localRetryInitial";
__ref._localretrydelay /*int*/  = _localretryinitial;
RDebugUtils.currentLine=63045634;
 //BA.debugLineNum = 63045634;BA.debugLine="serverRetryDelay = serverRetryInitial";
__ref._serverretrydelay /*int*/  = _serverretryinitial;
RDebugUtils.currentLine=63045635;
 //BA.debugLineNum = 63045635;BA.debugLine="dispatchRetryAfter = 0";
__ref._dispatchretryafter /*int*/  = (int) (0);
RDebugUtils.currentLine=63045636;
 //BA.debugLineNum = 63045636;BA.debugLine="mediaPathDegradedFlag = False";
__ref._mediapathdegradedflag /*boolean*/  = __c.False;
RDebugUtils.currentLine=63045637;
 //BA.debugLineNum = 63045637;BA.debugLine="If GetConsecutiveNetworkErrors > 0 Then TraceInfo";
if (__ref._getconsecutivenetworkerrors /*int*/ (null)>0) { 
__ref._traceinfo /*String*/ (null,"network","retry сброшен","errors="+BA.NumberToString(__ref._getconsecutivenetworkerrors /*int*/ (null)));};
RDebugUtils.currentLine=63045638;
 //BA.debugLineNum = 63045638;BA.debugLine="ResetConsecutiveNetworkErrors";
__ref._resetconsecutivenetworkerrors /*String*/ (null);
RDebugUtils.currentLine=63045639;
 //BA.debugLineNum = 63045639;BA.debugLine="End Sub";
return "";
}
public String  _invalidaterelevanttrackidscache(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "invalidaterelevanttrackidscache", false))
	 {return ((String) Debug.delegate(ba, "invalidaterelevanttrackidscache", null));}
RDebugUtils.currentLine=59441152;
 //BA.debugLineNum = 59441152;BA.debugLine="Public Sub InvalidateRelevantTrackIdsCache";
RDebugUtils.currentLine=59441153;
 //BA.debugLineNum = 59441153;BA.debugLine="owner.Data_InvalidateRelevantTrackIdsCache";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_invalidaterelevanttrackidscache /*String*/ (null);
RDebugUtils.currentLine=59441154;
 //BA.debugLineNum = 59441154;BA.debugLine="End Sub";
return "";
}
public boolean  _isadwarmupdeferredafterstartup(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isadwarmupdeferredafterstartup", false))
	 {return ((Boolean) Debug.delegate(ba, "isadwarmupdeferredafterstartup", null));}
RDebugUtils.currentLine=59834368;
 //BA.debugLineNum = 59834368;BA.debugLine="Public Sub IsAdWarmupDeferredAfterStartup As Boole";
RDebugUtils.currentLine=59834369;
 //BA.debugLineNum = 59834369;BA.debugLine="Return adWarmupDeferredAfterStartup";
if (true) return __ref._adwarmupdeferredafterstartup /*boolean*/ ;
RDebugUtils.currentLine=59834370;
 //BA.debugLineNum = 59834370;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybackpausedbypolicy(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isplaybackpausedbypolicy", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackpausedbypolicy", null));}
RDebugUtils.currentLine=62914560;
 //BA.debugLineNum = 62914560;BA.debugLine="Public Sub IsPlaybackPausedByPolicy As Boolean";
RDebugUtils.currentLine=62914561;
 //BA.debugLineNum = 62914561;BA.debugLine="Return policyState.IsPlaybackPausedByPolicy";
if (true) return __ref._policystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/ ;
RDebugUtils.currentLine=62914562;
 //BA.debugLineNum = 62914562;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybackstarted(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isplaybackstarted", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackstarted", null));}
RDebugUtils.currentLine=60030976;
 //BA.debugLineNum = 60030976;BA.debugLine="Public Sub IsPlaybackStarted As Boolean";
RDebugUtils.currentLine=60030977;
 //BA.debugLineNum = 60030977;BA.debugLine="Return orchestrationStateRef.IsStarted";
if (true) return __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ;
RDebugUtils.currentLine=60030978;
 //BA.debugLineNum = 60030978;BA.debugLine="End Sub";
return false;
}
public boolean  _ispolicypausestate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "ispolicypausestate", false))
	 {return ((Boolean) Debug.delegate(ba, "ispolicypausestate", null));}
RDebugUtils.currentLine=60227584;
 //BA.debugLineNum = 60227584;BA.debugLine="Public Sub IsPolicyPauseState As Boolean";
RDebugUtils.currentLine=60227585;
 //BA.debugLineNum = 60227585;BA.debugLine="Return policyState.IsPlaybackPausedByPolicy";
if (true) return __ref._policystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/ ;
RDebugUtils.currentLine=60227586;
 //BA.debugLineNum = 60227586;BA.debugLine="End Sub";
return false;
}
public boolean  _isstartupsequenceinprogress(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isstartupsequenceinprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "isstartupsequenceinprogress", null));}
RDebugUtils.currentLine=59637760;
 //BA.debugLineNum = 59637760;BA.debugLine="Public Sub IsStartupSequenceInProgress As Boolean";
RDebugUtils.currentLine=59637761;
 //BA.debugLineNum = 59637761;BA.debugLine="Return startupSequenceInProgress";
if (true) return __ref._startupsequenceinprogress /*boolean*/ ;
RDebugUtils.currentLine=59637762;
 //BA.debugLineNum = 59637762;BA.debugLine="End Sub";
return false;
}
public boolean  _isstoppedbyuser(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isstoppedbyuser", false))
	 {return ((Boolean) Debug.delegate(ba, "isstoppedbyuser", null));}
RDebugUtils.currentLine=60096512;
 //BA.debugLineNum = 60096512;BA.debugLine="Public Sub IsStoppedByUser As Boolean";
RDebugUtils.currentLine=60096513;
 //BA.debugLineNum = 60096513;BA.debugLine="Return orchestrationStateRef.IsStoppedByUser";
if (true) return __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ;
RDebugUtils.currentLine=60096514;
 //BA.debugLineNum = 60096514;BA.debugLine="End Sub";
return false;
}
public boolean  _isstopping(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isstopping", false))
	 {return ((Boolean) Debug.delegate(ba, "isstopping", null));}
RDebugUtils.currentLine=60358656;
 //BA.debugLineNum = 60358656;BA.debugLine="Public Sub IsStopping As Boolean";
RDebugUtils.currentLine=60358657;
 //BA.debugLineNum = 60358657;BA.debugLine="Return orchestrationStateRef.IsStopping";
if (true) return __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ;
RDebugUtils.currentLine=60358658;
 //BA.debugLineNum = 60358658;BA.debugLine="End Sub";
return false;
}
public boolean  _istraceuploadenabled(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "istraceuploadenabled", false))
	 {return ((Boolean) Debug.delegate(ba, "istraceuploadenabled", null));}
anywheresoftware.b4a.objects.collections.Map _snapshot = null;
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
RDebugUtils.currentLine=59310080;
 //BA.debugLineNum = 59310080;BA.debugLine="Public Sub IsTraceUploadEnabled As Boolean";
RDebugUtils.currentLine=59310081;
 //BA.debugLineNum = 59310081;BA.debugLine="Dim snapshot As Map = OfflineData";
_snapshot = new anywheresoftware.b4a.objects.collections.Map();
_snapshot = __ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=59310082;
 //BA.debugLineNum = 59310082;BA.debugLine="If snapshot.IsInitialized = False Then Return Fal";
if (_snapshot.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=59310083;
 //BA.debugLineNum = 59310083;BA.debugLine="If snapshot.GetDefault(\"ok\", False) <> True Then";
if ((_snapshot.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=59310084;
 //BA.debugLineNum = 59310084;BA.debugLine="If snapshot.ContainsKey(\"trace\") Then";
if (_snapshot.ContainsKey((Object)("trace"))) { 
RDebugUtils.currentLine=59310085;
 //BA.debugLineNum = 59310085;BA.debugLine="Return snapshot.GetDefault(\"trace\", False) = Tru";
if (true) return (_snapshot.GetDefault((Object)("trace"),(Object)(__c.False))).equals((Object)(__c.True));
 };
RDebugUtils.currentLine=59310087;
 //BA.debugLineNum = 59310087;BA.debugLine="Dim playerData As Map = snapshot.GetDefault(\"play";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_snapshot.GetDefault((Object)("player"),__c.Null)));
RDebugUtils.currentLine=59310088;
 //BA.debugLineNum = 59310088;BA.debugLine="If playerData.IsInitialized = False Then Return F";
if (_playerdata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=59310089;
 //BA.debugLineNum = 59310089;BA.debugLine="Return playerData.ContainsKey(\"trace\") And player";
if (true) return _playerdata.ContainsKey((Object)("trace")) && (_playerdata.GetDefault((Object)("trace"),(Object)(__c.False))).equals((Object)(__c.True));
RDebugUtils.currentLine=59310090;
 //BA.debugLineNum = 59310090;BA.debugLine="End Sub";
return false;
}
public boolean  _istrackcached(b4j.example.playerstatestore __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "istrackcached", false))
	 {return ((Boolean) Debug.delegate(ba, "istrackcached", new Object[] {_trackid}));}
RDebugUtils.currentLine=63700992;
 //BA.debugLineNum = 63700992;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
RDebugUtils.currentLine=63700993;
 //BA.debugLineNum = 63700993;BA.debugLine="Return mediaCacheRef.IsTrackCached(trackId)";
if (true) return __ref._mediacacheref /*b4j.example.mediacache*/ ._istrackcached /*boolean*/ (null,_trackid);
RDebugUtils.currentLine=63700994;
 //BA.debugLineNum = 63700994;BA.debugLine="End Sub";
return false;
}
public boolean  _isuserstoppedstate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isuserstoppedstate", false))
	 {return ((Boolean) Debug.delegate(ba, "isuserstoppedstate", null));}
RDebugUtils.currentLine=60162048;
 //BA.debugLineNum = 60162048;BA.debugLine="Public Sub IsUserStoppedState As Boolean";
RDebugUtils.currentLine=60162049;
 //BA.debugLineNum = 60162049;BA.debugLine="Return orchestrationStateRef.IsStarted = False An";
if (true) return __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False && __ref._policystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/ ==__c.False && __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ;
RDebugUtils.currentLine=60162050;
 //BA.debugLineNum = 60162050;BA.debugLine="End Sub";
return false;
}
public String  _lastofflinedatarefreshstate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "lastofflinedatarefreshstate", false))
	 {return ((String) Debug.delegate(ba, "lastofflinedatarefreshstate", null));}
RDebugUtils.currentLine=58720256;
 //BA.debugLineNum = 58720256;BA.debugLine="Public Sub LastOfflineDataRefreshState As String";
RDebugUtils.currentLine=58720257;
 //BA.debugLineNum = 58720257;BA.debugLine="Return policyState.LastOfflineDataRefreshState";
if (true) return __ref._policystate /*b4j.example.playbackdatapolicystate*/ ._lastofflinedatarefreshstate /*String*/ ;
RDebugUtils.currentLine=58720258;
 //BA.debugLineNum = 58720258;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadcachedplaylistmetadata(b4j.example.playerstatestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "loadcachedplaylistmetadata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadcachedplaylistmetadata", new Object[] {_playlistid}));}
RDebugUtils.currentLine=63635456;
 //BA.debugLineNum = 63635456;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
RDebugUtils.currentLine=63635457;
 //BA.debugLineNum = 63635457;BA.debugLine="Return dataResolverRef.LoadCachedPlaylistMetadata";
if (true) return __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=63635458;
 //BA.debugLineNum = 63635458;BA.debugLine="End Sub";
return null;
}
public String  _messagevalue(b4j.example.playerstatestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "messagevalue", false))
	 {return ((String) Debug.delegate(ba, "messagevalue", new Object[] {_key}));}
RDebugUtils.currentLine=57999360;
 //BA.debugLineNum = 57999360;BA.debugLine="Public Sub MessageValue(key As String) As String";
RDebugUtils.currentLine=57999361;
 //BA.debugLineNum = 57999361;BA.debugLine="Return owner.Data_MessageValue(key)";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._data_messagevalue /*String*/ (null,_key);
RDebugUtils.currentLine=57999362;
 //BA.debugLineNum = 57999362;BA.debugLine="End Sub";
return "";
}
public String  _nexturlvalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "nexturlvalue", false))
	 {return ((String) Debug.delegate(ba, "nexturlvalue", null));}
RDebugUtils.currentLine=57868288;
 //BA.debugLineNum = 57868288;BA.debugLine="Public Sub NextUrlValue As String";
RDebugUtils.currentLine=57868289;
 //BA.debugLineNum = 57868289;BA.debugLine="Return owner.NextUrlValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._nexturlvalue /*String*/ (null);
RDebugUtils.currentLine=57868290;
 //BA.debugLineNum = 57868290;BA.debugLine="End Sub";
return "";
}
public String  _playercodevalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "playercodevalue", false))
	 {return ((String) Debug.delegate(ba, "playercodevalue", null));}
RDebugUtils.currentLine=57409536;
 //BA.debugLineNum = 57409536;BA.debugLine="Public Sub PlayerCodeValue As String";
RDebugUtils.currentLine=57409537;
 //BA.debugLineNum = 57409537;BA.debugLine="Return owner.PlayerCodeValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._playercodevalue /*String*/ (null);
RDebugUtils.currentLine=57409538;
 //BA.debugLineNum = 57409538;BA.debugLine="End Sub";
return "";
}
public String  _refreshconnectionindicatorstate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "refreshconnectionindicatorstate", false))
	 {return ((String) Debug.delegate(ba, "refreshconnectionindicatorstate", null));}
RDebugUtils.currentLine=59506688;
 //BA.debugLineNum = 59506688;BA.debugLine="Public Sub RefreshConnectionIndicatorState";
RDebugUtils.currentLine=59506689;
 //BA.debugLineNum = 59506689;BA.debugLine="owner.Data_RefreshConnectionIndicatorState";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=59506690;
 //BA.debugLineNum = 59506690;BA.debugLine="End Sub";
return "";
}
public String  _resetconsecutivenetworkerrors(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resetconsecutivenetworkerrors", false))
	 {return ((String) Debug.delegate(ba, "resetconsecutivenetworkerrors", null));}
RDebugUtils.currentLine=56819712;
 //BA.debugLineNum = 56819712;BA.debugLine="Public Sub ResetConsecutiveNetworkErrors";
RDebugUtils.currentLine=56819713;
 //BA.debugLineNum = 56819713;BA.debugLine="consecutiveNetworkErrors = 0";
__ref._consecutivenetworkerrors /*int*/  = (int) (0);
RDebugUtils.currentLine=56819714;
 //BA.debugLineNum = 56819714;BA.debugLine="End Sub";
return "";
}
public String  _traceinfo(b4j.example.playerstatestore __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "traceinfo", false))
	 {return ((String) Debug.delegate(ba, "traceinfo", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=58130432;
 //BA.debugLineNum = 58130432;BA.debugLine="Public Sub TraceInfo(category As String, message A";
RDebugUtils.currentLine=58130433;
 //BA.debugLineNum = 58130433;BA.debugLine="owner.Data_TraceInfo(category, message, details)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_traceinfo /*String*/ (null,_category,_message,_details);
RDebugUtils.currentLine=58130434;
 //BA.debugLineNum = 58130434;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolveanycachedlocaltrackitem(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _currentslot) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resolveanycachedlocaltrackitem", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolveanycachedlocaltrackitem", new Object[] {_currentslot}));}
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
anywheresoftware.b4a.objects.collections.Map _playliststats = null;
anywheresoftware.b4a.objects.collections.Map _fallbackslot = null;
anywheresoftware.b4a.objects.collections.List _playlistids = null;
String _playlistid = "";
int _startindex = 0;
anywheresoftware.b4a.objects.collections.Map _selecteditem = null;
int _offset = 0;
anywheresoftware.b4a.objects.collections.Map _cachedtrack = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
anywheresoftware.b4a.objects.collections.Map _queueitem = null;
anywheresoftware.b4a.objects.collections.Map _indexedtrack = null;
anywheresoftware.b4a.objects.collections.Map _indexeddescriptor = null;
anywheresoftware.b4a.objects.collections.Map _indexedqueueitem = null;
RDebugUtils.currentLine=85196800;
 //BA.debugLineNum = 85196800;BA.debugLine="Private Sub ResolveAnyCachedLocalTrackItem(current";
RDebugUtils.currentLine=85196801;
 //BA.debugLineNum = 85196801;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=85196802;
 //BA.debugLineNum = 85196802;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
RDebugUtils.currentLine=85196803;
 //BA.debugLineNum = 85196803;BA.debugLine="mediaCacheRef.EnsureTrackCacheReady";
__ref._mediacacheref /*b4j.example.mediacache*/ ._ensuretrackcacheready /*String*/ (null);
RDebugUtils.currentLine=85196804;
 //BA.debugLineNum = 85196804;BA.debugLine="Dim playlistStats As Map = mediaCacheRef.GetCache";
_playliststats = new anywheresoftware.b4a.objects.collections.Map();
_playliststats = __ref._mediacacheref /*b4j.example.mediacache*/ ._getcachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=85196805;
 //BA.debugLineNum = 85196805;BA.debugLine="Dim fallbackSlot As Map = currentSlot";
_fallbackslot = new anywheresoftware.b4a.objects.collections.Map();
_fallbackslot = _currentslot;
RDebugUtils.currentLine=85196806;
 //BA.debugLineNum = 85196806;BA.debugLine="If fallbackSlot.IsInitialized = False Or fallback";
if (_fallbackslot.IsInitialized()==__c.False || _fallbackslot.getSize()==0) { 
RDebugUtils.currentLine=85196807;
 //BA.debugLineNum = 85196807;BA.debugLine="fallbackSlot = dataResolverRef.ResolveDataSlotAt";
_fallbackslot = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._effectivenowticks /*long*/ (null));
 };
RDebugUtils.currentLine=85196809;
 //BA.debugLineNum = 85196809;BA.debugLine="If fallbackSlot.IsInitialized = False Then fallba";
if (_fallbackslot.IsInitialized()==__c.False) { 
_fallbackslot.Initialize();};
RDebugUtils.currentLine=85196810;
 //BA.debugLineNum = 85196810;BA.debugLine="Dim playlistIds As List";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=85196811;
 //BA.debugLineNum = 85196811;BA.debugLine="playlistIds.Initialize";
_playlistids.Initialize();
RDebugUtils.currentLine=85196812;
 //BA.debugLineNum = 85196812;BA.debugLine="If playlistStats.IsInitialized And playlistStats.";
if (_playliststats.IsInitialized() && _playliststats.getSize()>0) { 
RDebugUtils.currentLine=85196813;
 //BA.debugLineNum = 85196813;BA.debugLine="For Each playlistId As String In playlistStats.K";
{
final anywheresoftware.b4a.BA.IterableList group13 = _playliststats.Keys();
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_playlistid = BA.ObjectToString(group13.Get(index13));
RDebugUtils.currentLine=85196814;
 //BA.debugLineNum = 85196814;BA.debugLine="If playlistId = \"\" Or playlistId = \"_unknown\" T";
if ((_playlistid).equals("") || (_playlistid).equals("_unknown")) { 
if (true) continue;};
RDebugUtils.currentLine=85196815;
 //BA.debugLineNum = 85196815;BA.debugLine="playlistIds.Add(playlistId)";
_playlistids.Add((Object)(_playlistid));
 }
};
 };
RDebugUtils.currentLine=85196818;
 //BA.debugLineNum = 85196818;BA.debugLine="If playlistIds.Size = 0 Then";
if (_playlistids.getSize()==0) { 
RDebugUtils.currentLine=85196819;
 //BA.debugLineNum = 85196819;BA.debugLine="playlistIds = mediaCacheRef.GetCachedTrackPlayli";
_playlistids = __ref._mediacacheref /*b4j.example.mediacache*/ ._getcachedtrackplaylistidsondisk /*anywheresoftware.b4a.objects.collections.List*/ (null);
 };
RDebugUtils.currentLine=85196821;
 //BA.debugLineNum = 85196821;BA.debugLine="Dim startIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=85196822;
 //BA.debugLineNum = 85196822;BA.debugLine="If playlistIds.Size > 1 Then startIndex = Rnd(0,";
if (_playlistids.getSize()>1) { 
_startindex = __c.Rnd((int) (0),_playlistids.getSize());};
RDebugUtils.currentLine=85196823;
 //BA.debugLineNum = 85196823;BA.debugLine="Dim selectedItem As Map";
_selecteditem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=85196824;
 //BA.debugLineNum = 85196824;BA.debugLine="selectedItem.Initialize";
_selecteditem.Initialize();
RDebugUtils.currentLine=85196825;
 //BA.debugLineNum = 85196825;BA.debugLine="If playlistIds.Size > 0 Then";
if (_playlistids.getSize()>0) { 
RDebugUtils.currentLine=85196826;
 //BA.debugLineNum = 85196826;BA.debugLine="For offset = 0 To playlistIds.Size - 1";
{
final int step26 = 1;
final int limit26 = (int) (_playlistids.getSize()-1);
_offset = (int) (0) ;
for (;_offset <= limit26 ;_offset = _offset + step26 ) {
RDebugUtils.currentLine=85196827;
 //BA.debugLineNum = 85196827;BA.debugLine="Dim playlistId As String = playlistIds.Get((sta";
_playlistid = BA.ObjectToString(_playlistids.Get((int) ((_startindex+_offset)%_playlistids.getSize())));
RDebugUtils.currentLine=85196828;
 //BA.debugLineNum = 85196828;BA.debugLine="Dim cachedTrack As Map = dataResolverRef.Resolv";
_cachedtrack = new anywheresoftware.b4a.objects.collections.Map();
_cachedtrack = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._resolveorderedcachedtrackfromplaylistbyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid,__ref._mediacacheref /*b4j.example.mediacache*/ );
RDebugUtils.currentLine=85196829;
 //BA.debugLineNum = 85196829;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedT";
if (_cachedtrack.IsInitialized()==__c.False || _cachedtrack.getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=85196830;
 //BA.debugLineNum = 85196830;BA.debugLine="Dim descriptor As Map";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=85196831;
 //BA.debugLineNum = 85196831;BA.debugLine="descriptor.Initialize";
_descriptor.Initialize();
RDebugUtils.currentLine=85196832;
 //BA.debugLineNum = 85196832;BA.debugLine="descriptor.Put(\"id\", playlistId)";
_descriptor.Put((Object)("id"),(Object)(_playlistid));
RDebugUtils.currentLine=85196833;
 //BA.debugLineNum = 85196833;BA.debugLine="descriptor.Put(\"title\", cachedTrack.GetDefault(";
_descriptor.Put((Object)("title"),_cachedtrack.GetDefault((Object)("playlist_title"),(Object)("")));
RDebugUtils.currentLine=85196834;
 //BA.debugLineNum = 85196834;BA.debugLine="descriptor.Put(\"_slot_key\", BuildDataSlotKey(fa";
_descriptor.Put((Object)("_slot_key"),(Object)(__ref._builddataslotkey /*String*/ (null,_fallbackslot)));
RDebugUtils.currentLine=85196835;
 //BA.debugLineNum = 85196835;BA.debugLine="descriptor.Put(\"_playlist_index\", 0)";
_descriptor.Put((Object)("_playlist_index"),(Object)(0));
RDebugUtils.currentLine=85196836;
 //BA.debugLineNum = 85196836;BA.debugLine="Dim queueItem As Map = dataResolverRef.CreateQu";
_queueitem = new anywheresoftware.b4a.objects.collections.Map();
_queueitem = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._createqueuetrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (null,_fallbackslot,_descriptor,_cachedtrack,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null));
RDebugUtils.currentLine=85196837;
 //BA.debugLineNum = 85196837;BA.debugLine="selectedItem = queueItem";
_selecteditem = _queueitem;
RDebugUtils.currentLine=85196838;
 //BA.debugLineNum = 85196838;BA.debugLine="Exit";
if (true) break;
 }
};
 };
RDebugUtils.currentLine=85196841;
 //BA.debugLineNum = 85196841;BA.debugLine="If selectedItem.IsInitialized = False Or selected";
if (_selecteditem.IsInitialized()==__c.False || _selecteditem.getSize()==0) { 
RDebugUtils.currentLine=85196842;
 //BA.debugLineNum = 85196842;BA.debugLine="Dim indexedTrack As Map = mediaCacheRef.ResolveA";
_indexedtrack = new anywheresoftware.b4a.objects.collections.Map();
_indexedtrack = __ref._mediacacheref /*b4j.example.mediacache*/ ._resolveanycachedtrackfromindex /*anywheresoftware.b4a.objects.collections.Map*/ (null,"","");
RDebugUtils.currentLine=85196843;
 //BA.debugLineNum = 85196843;BA.debugLine="If indexedTrack.IsInitialized And indexedTrack.S";
if (_indexedtrack.IsInitialized() && _indexedtrack.getSize()>0) { 
RDebugUtils.currentLine=85196844;
 //BA.debugLineNum = 85196844;BA.debugLine="Dim indexedDescriptor As Map";
_indexeddescriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=85196845;
 //BA.debugLineNum = 85196845;BA.debugLine="indexedDescriptor.Initialize";
_indexeddescriptor.Initialize();
RDebugUtils.currentLine=85196846;
 //BA.debugLineNum = 85196846;BA.debugLine="indexedDescriptor.Put(\"id\", indexedTrack.GetDef";
_indexeddescriptor.Put((Object)("id"),_indexedtrack.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=85196847;
 //BA.debugLineNum = 85196847;BA.debugLine="indexedDescriptor.Put(\"title\", indexedTrack.Get";
_indexeddescriptor.Put((Object)("title"),_indexedtrack.GetDefault((Object)("playlist_title"),(Object)("")));
RDebugUtils.currentLine=85196848;
 //BA.debugLineNum = 85196848;BA.debugLine="indexedDescriptor.Put(\"_slot_key\", BuildDataSlo";
_indexeddescriptor.Put((Object)("_slot_key"),(Object)(__ref._builddataslotkey /*String*/ (null,_fallbackslot)));
RDebugUtils.currentLine=85196849;
 //BA.debugLineNum = 85196849;BA.debugLine="indexedDescriptor.Put(\"_playlist_index\", 0)";
_indexeddescriptor.Put((Object)("_playlist_index"),(Object)(0));
RDebugUtils.currentLine=85196850;
 //BA.debugLineNum = 85196850;BA.debugLine="Dim indexedQueueItem As Map = dataResolverRef.C";
_indexedqueueitem = new anywheresoftware.b4a.objects.collections.Map();
_indexedqueueitem = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._createqueuetrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (null,_fallbackslot,_indexeddescriptor,_indexedtrack,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null));
RDebugUtils.currentLine=85196851;
 //BA.debugLineNum = 85196851;BA.debugLine="selectedItem = indexedQueueItem";
_selecteditem = _indexedqueueitem;
 };
 };
RDebugUtils.currentLine=85196854;
 //BA.debugLineNum = 85196854;BA.debugLine="If selectedItem.IsInitialized And selectedItem.Si";
if (_selecteditem.IsInitialized() && _selecteditem.getSize()>0) { 
if (true) return _selecteditem;};
RDebugUtils.currentLine=85196855;
 //BA.debugLineNum = 85196855;BA.debugLine="Return emptyItem";
if (true) return _emptyitem;
RDebugUtils.currentLine=85196856;
 //BA.debugLineNum = 85196856;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvecurrentdataslot(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resolvecurrentdataslot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvecurrentdataslot", new Object[] {_data}));}
RDebugUtils.currentLine=63504384;
 //BA.debugLineNum = 63504384;BA.debugLine="Public Sub ResolveCurrentDataSlot(data As Map) As";
RDebugUtils.currentLine=63504385;
 //BA.debugLineNum = 63504385;BA.debugLine="Return dataResolverRef.ResolveCurrentDataSlot(dat";
if (true) return __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._resolvecurrentdataslot /*anywheresoftware.b4a.objects.collections.Map*/ (null,_data);
RDebugUtils.currentLine=63504386;
 //BA.debugLineNum = 63504386;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvedataslotatticks(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _data,long _targetticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resolvedataslotatticks", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvedataslotatticks", new Object[] {_data,_targetticks}));}
RDebugUtils.currentLine=63438848;
 //BA.debugLineNum = 63438848;BA.debugLine="Public Sub ResolveDataSlotAtTicks(data As Map, tar";
RDebugUtils.currentLine=63438849;
 //BA.debugLineNum = 63438849;BA.debugLine="Return dataResolverRef.ResolveDataSlotAtTicks(dat";
if (true) return __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_data,_targetticks);
RDebugUtils.currentLine=63438850;
 //BA.debugLineNum = 63438850;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextdataslotatticks(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _data,long _targetticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resolvenextdataslotatticks", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvenextdataslotatticks", new Object[] {_data,_targetticks}));}
RDebugUtils.currentLine=63569920;
 //BA.debugLineNum = 63569920;BA.debugLine="Public Sub ResolveNextDataSlotAtTicks(data As Map,";
RDebugUtils.currentLine=63569921;
 //BA.debugLineNum = 63569921;BA.debugLine="Return dataResolverRef.ResolveNextDataSlotAtTicks";
if (true) return __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_data,_targetticks);
RDebugUtils.currentLine=63569922;
 //BA.debugLineNum = 63569922;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvesequentialslottrackitem(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.List _playlists) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resolvesequentialslottrackitem", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvesequentialslottrackitem", new Object[] {_currentslot,_playlists}));}
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
String _slotkey = "";
anywheresoftware.b4a.objects.collections.Map _workingcursors = null;
int _cursorvalue = 0;
int _startindex = 0;
anywheresoftware.b4a.objects.collections.Map _selecteditem = null;
int _offset = 0;
int _playlistindex = 0;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _cachedtrack = null;
anywheresoftware.b4a.objects.collections.Map _normalizeddescriptor = null;
anywheresoftware.b4a.objects.collections.Map _queueitem = null;
RDebugUtils.currentLine=85721088;
 //BA.debugLineNum = 85721088;BA.debugLine="Private Sub ResolveSequentialSlotTrackItem(current";
RDebugUtils.currentLine=85721089;
 //BA.debugLineNum = 85721089;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=85721090;
 //BA.debugLineNum = 85721090;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
RDebugUtils.currentLine=85721091;
 //BA.debugLineNum = 85721091;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return _emptyitem;};
RDebugUtils.currentLine=85721092;
 //BA.debugLineNum = 85721092;BA.debugLine="Dim slotKey As String = BuildDataSlotKey(currentS";
_slotkey = __ref._builddataslotkey /*String*/ (null,_currentslot);
RDebugUtils.currentLine=85721093;
 //BA.debugLineNum = 85721093;BA.debugLine="Dim workingCursors As Map = dataResolverRef.Clone";
_workingcursors = new anywheresoftware.b4a.objects.collections.Map();
_workingcursors = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._cloneplaylistcursors /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=85721094;
 //BA.debugLineNum = 85721094;BA.debugLine="Dim cursorValue As Int = workingCursors.GetDefaul";
_cursorvalue = (int)(BA.ObjectToNumber(_workingcursors.GetDefault((Object)(_slotkey),(Object)(0))));
RDebugUtils.currentLine=85721095;
 //BA.debugLineNum = 85721095;BA.debugLine="If cursorValue < 0 Then cursorValue = 0";
if (_cursorvalue<0) { 
_cursorvalue = (int) (0);};
RDebugUtils.currentLine=85721096;
 //BA.debugLineNum = 85721096;BA.debugLine="Dim startIndex As Int = cursorValue Mod playlists";
_startindex = (int) (_cursorvalue%_playlists.getSize());
RDebugUtils.currentLine=85721097;
 //BA.debugLineNum = 85721097;BA.debugLine="Dim selectedItem As Map";
_selecteditem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=85721098;
 //BA.debugLineNum = 85721098;BA.debugLine="selectedItem.Initialize";
_selecteditem.Initialize();
RDebugUtils.currentLine=85721099;
 //BA.debugLineNum = 85721099;BA.debugLine="For offset = 0 To playlists.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_playlists.getSize()-1);
_offset = (int) (0) ;
for (;_offset <= limit11 ;_offset = _offset + step11 ) {
RDebugUtils.currentLine=85721100;
 //BA.debugLineNum = 85721100;BA.debugLine="Dim playlistIndex As Int = (startIndex + offset)";
_playlistindex = (int) ((_startindex+_offset)%_playlists.getSize());
RDebugUtils.currentLine=85721101;
 //BA.debugLineNum = 85721101;BA.debugLine="Dim playlistObject As Object = playlists.Get(pla";
_playlistobject = _playlists.Get(_playlistindex);
RDebugUtils.currentLine=85721102;
 //BA.debugLineNum = 85721102;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=85721103;
 //BA.debugLineNum = 85721103;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=85721104;
 //BA.debugLineNum = 85721104;BA.debugLine="Dim playlistId As String = playlistDescriptor.Ge";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=85721105;
 //BA.debugLineNum = 85721105;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=85721106;
 //BA.debugLineNum = 85721106;BA.debugLine="Dim cachedTrack As Map = dataResolverRef.Resolve";
_cachedtrack = new anywheresoftware.b4a.objects.collections.Map();
_cachedtrack = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._resolveorderedcachedtrackfromplaylistbyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid,__ref._mediacacheref /*b4j.example.mediacache*/ );
RDebugUtils.currentLine=85721107;
 //BA.debugLineNum = 85721107;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedTr";
if (_cachedtrack.IsInitialized()==__c.False || _cachedtrack.getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=85721108;
 //BA.debugLineNum = 85721108;BA.debugLine="Dim normalizedDescriptor As Map = CloneMap(playl";
_normalizeddescriptor = new anywheresoftware.b4a.objects.collections.Map();
_normalizeddescriptor = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptor);
RDebugUtils.currentLine=85721109;
 //BA.debugLineNum = 85721109;BA.debugLine="normalizedDescriptor.Put(\"_slot_key\", slotKey)";
_normalizeddescriptor.Put((Object)("_slot_key"),(Object)(_slotkey));
RDebugUtils.currentLine=85721110;
 //BA.debugLineNum = 85721110;BA.debugLine="normalizedDescriptor.Put(\"_playlist_index\", play";
_normalizeddescriptor.Put((Object)("_playlist_index"),(Object)(_playlistindex));
RDebugUtils.currentLine=85721111;
 //BA.debugLineNum = 85721111;BA.debugLine="workingCursors.Put(slotKey, playlistIndex + 1)";
_workingcursors.Put((Object)(_slotkey),(Object)(_playlistindex+1));
RDebugUtils.currentLine=85721112;
 //BA.debugLineNum = 85721112;BA.debugLine="dataResolverRef.SavePreviewPlaylistCursors(stora";
__ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._savepreviewplaylistcursors /*String*/ (null,__ref._storageref /*b4j.example.keyvaluestore*/ ,_workingcursors);
RDebugUtils.currentLine=85721113;
 //BA.debugLineNum = 85721113;BA.debugLine="Dim queueItem As Map = dataResolverRef.CreateQue";
_queueitem = new anywheresoftware.b4a.objects.collections.Map();
_queueitem = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._createqueuetrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (null,_currentslot,_normalizeddescriptor,_cachedtrack,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null));
RDebugUtils.currentLine=85721114;
 //BA.debugLineNum = 85721114;BA.debugLine="selectedItem = queueItem";
_selecteditem = _queueitem;
RDebugUtils.currentLine=85721115;
 //BA.debugLineNum = 85721115;BA.debugLine="Exit";
if (true) break;
 }
};
RDebugUtils.currentLine=85721117;
 //BA.debugLineNum = 85721117;BA.debugLine="If selectedItem.IsInitialized And selectedItem.Si";
if (_selecteditem.IsInitialized() && _selecteditem.getSize()>0) { 
if (true) return _selecteditem;};
RDebugUtils.currentLine=85721118;
 //BA.debugLineNum = 85721118;BA.debugLine="Return emptyItem";
if (true) return _emptyitem;
RDebugUtils.currentLine=85721119;
 //BA.debugLineNum = 85721119;BA.debugLine="End Sub";
return null;
}
public int  _resolveretrydelay(b4j.example.playerstatestore __ref,String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resolveretrydelay", false))
	 {return ((Integer) Debug.delegate(ba, "resolveretrydelay", new Object[] {_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay}));}
int _delay = 0;
int _delayserver = 0;
RDebugUtils.currentLine=62652416;
 //BA.debugLineNum = 62652416;BA.debugLine="Public Sub ResolveRetryDelay(mode As String, delay";
RDebugUtils.currentLine=62652417;
 //BA.debugLineNum = 62652417;BA.debugLine="If delayMs > 0 Then Return delayMs";
if (_delayms>0) { 
if (true) return _delayms;};
RDebugUtils.currentLine=62652418;
 //BA.debugLineNum = 62652418;BA.debugLine="If mode = \"network\" Then";
if ((_mode).equals("network")) { 
RDebugUtils.currentLine=62652419;
 //BA.debugLineNum = 62652419;BA.debugLine="Dim delay As Int = localRetryDelay";
_delay = __ref._localretrydelay /*int*/ ;
RDebugUtils.currentLine=62652420;
 //BA.debugLineNum = 62652420;BA.debugLine="localRetryDelay = Min(localRetryDelay * 2, local";
__ref._localretrydelay /*int*/  = (int) (__c.Min(__ref._localretrydelay /*int*/ *2,_localretrymax));
RDebugUtils.currentLine=62652421;
 //BA.debugLineNum = 62652421;BA.debugLine="Return delay";
if (true) return _delay;
 };
RDebugUtils.currentLine=62652423;
 //BA.debugLineNum = 62652423;BA.debugLine="If mode = \"blocked\" Then Return blockedRetryDelay";
if ((_mode).equals("blocked")) { 
if (true) return _blockedretrydelay;};
RDebugUtils.currentLine=62652424;
 //BA.debugLineNum = 62652424;BA.debugLine="Dim delayServer As Int = serverRetryDelay";
_delayserver = __ref._serverretrydelay /*int*/ ;
RDebugUtils.currentLine=62652425;
 //BA.debugLineNum = 62652425;BA.debugLine="serverRetryDelay = Min(serverRetryDelay * 2, serv";
__ref._serverretrydelay /*int*/  = (int) (__c.Min(__ref._serverretrydelay /*int*/ *2,_serverretrymax));
RDebugUtils.currentLine=62652426;
 //BA.debugLineNum = 62652426;BA.debugLine="Return delayServer";
if (true) return _delayserver;
RDebugUtils.currentLine=62652427;
 //BA.debugLineNum = 62652427;BA.debugLine="End Sub";
return 0;
}
public String  _resumeplaybackafterpolicypauseasync(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resumeplaybackafterpolicypauseasync", false))
	 {return ((String) Debug.delegate(ba, "resumeplaybackafterpolicypauseasync", null));}
RDebugUtils.currentLine=60620800;
 //BA.debugLineNum = 60620800;BA.debugLine="Public Sub ResumePlaybackAfterPolicyPauseAsync";
RDebugUtils.currentLine=60620801;
 //BA.debugLineNum = 60620801;BA.debugLine="owner.Data_ResumePlaybackAfterPolicyPauseAsync";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_resumeplaybackafterpolicypauseasync /*String*/ (null);
RDebugUtils.currentLine=60620802;
 //BA.debugLineNum = 60620802;BA.debugLine="End Sub";
return "";
}
public boolean  _resumeplaybackwhenserverallows(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resumeplaybackwhenserverallows", false))
	 {return ((Boolean) Debug.delegate(ba, "resumeplaybackwhenserverallows", null));}
RDebugUtils.currentLine=58851328;
 //BA.debugLineNum = 58851328;BA.debugLine="Public Sub ResumePlaybackWhenServerAllows As Boole";
RDebugUtils.currentLine=58851329;
 //BA.debugLineNum = 58851329;BA.debugLine="Return policyState.ResumePlaybackWhenServerAllows";
if (true) return __ref._policystate /*b4j.example.playbackdatapolicystate*/ ._resumeplaybackwhenserverallows /*boolean*/ ;
RDebugUtils.currentLine=58851330;
 //BA.debugLineNum = 58851330;BA.debugLine="End Sub";
return false;
}
public String  _saveofflinedata(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "saveofflinedata", false))
	 {return ((String) Debug.delegate(ba, "saveofflinedata", new Object[] {_data}));}
RDebugUtils.currentLine=59113472;
 //BA.debugLineNum = 59113472;BA.debugLine="Public Sub SaveOfflineData(data As Map)";
RDebugUtils.currentLine=59113473;
 //BA.debugLineNum = 59113473;BA.debugLine="offlineDataRef = offlineStoreRef.SaveOfflineData(";
__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._offlinestoreref /*b4j.example.offlinestore*/ ._saveofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_data,__ref._playercodevalue /*String*/ (null),__ref._deviceidvalue /*String*/ (null));
RDebugUtils.currentLine=59113474;
 //BA.debugLineNum = 59113474;BA.debugLine="If offlineDataRef.IsInitialized = False Then offl";
if (__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=59113475;
 //BA.debugLineNum = 59113475;BA.debugLine="End Sub";
return "";
}
public String  _saveserversnapshot(b4j.example.playerstatestore __ref,String _method,String _url,boolean _success,String _body,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "saveserversnapshot", false))
	 {return ((String) Debug.delegate(ba, "saveserversnapshot", new Object[] {_method,_url,_success,_body,_errormessage}));}
RDebugUtils.currentLine=58392576;
 //BA.debugLineNum = 58392576;BA.debugLine="Public Sub SaveServerSnapshot(method As String, ur";
RDebugUtils.currentLine=58392577;
 //BA.debugLineNum = 58392577;BA.debugLine="owner.Data_SaveServerSnapshot(method, url, succes";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_saveserversnapshot /*String*/ (null,_method,_url,_success,_body,_errormessage);
RDebugUtils.currentLine=58392578;
 //BA.debugLineNum = 58392578;BA.debugLine="End Sub";
return "";
}
public String  _scheduleretry(b4j.example.playerstatestore __ref,String _mode,int _delayms) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "scheduleretry", false))
	 {return ((String) Debug.delegate(ba, "scheduleretry", new Object[] {_mode,_delayms}));}
RDebugUtils.currentLine=61145088;
 //BA.debugLineNum = 61145088;BA.debugLine="Public Sub ScheduleRetry(mode As String, delayMs A";
RDebugUtils.currentLine=61145089;
 //BA.debugLineNum = 61145089;BA.debugLine="owner.Data_ScheduleRetry(mode, delayMs)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_scheduleretry /*String*/ (null,_mode,_delayms);
RDebugUtils.currentLine=61145090;
 //BA.debugLineNum = 61145090;BA.debugLine="End Sub";
return "";
}
public String  _secondsagotext(b4j.example.playerstatestore __ref,long _ticksvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "secondsagotext", false))
	 {return ((String) Debug.delegate(ba, "secondsagotext", new Object[] {_ticksvalue}));}
RDebugUtils.currentLine=58458112;
 //BA.debugLineNum = 58458112;BA.debugLine="Public Sub SecondsAgoText(ticksValue As Long) As S";
RDebugUtils.currentLine=58458113;
 //BA.debugLineNum = 58458113;BA.debugLine="Return owner.Data_SecondsAgoText(ticksValue)";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._data_secondsagotext /*String*/ (null,_ticksvalue);
RDebugUtils.currentLine=58458114;
 //BA.debugLineNum = 58458114;BA.debugLine="End Sub";
return "";
}
public String  _servicecheckurlvalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "servicecheckurlvalue", false))
	 {return ((String) Debug.delegate(ba, "servicecheckurlvalue", null));}
RDebugUtils.currentLine=57671680;
 //BA.debugLineNum = 57671680;BA.debugLine="Public Sub ServiceCheckUrlValue As String";
RDebugUtils.currentLine=57671681;
 //BA.debugLineNum = 57671681;BA.debugLine="Return owner.ServiceCheckUrlValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._servicecheckurlvalue /*String*/ (null);
RDebugUtils.currentLine=57671682;
 //BA.debugLineNum = 57671682;BA.debugLine="End Sub";
return "";
}
public String  _setlastdataoknow(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setlastdataoknow", false))
	 {return ((String) Debug.delegate(ba, "setlastdataoknow", null));}
RDebugUtils.currentLine=57147392;
 //BA.debugLineNum = 57147392;BA.debugLine="Public Sub SetLastDataOkNow";
RDebugUtils.currentLine=57147393;
 //BA.debugLineNum = 57147393;BA.debugLine="dataSuccessAtTicks = DateTime.Now";
__ref._datasuccessatticks /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=57147394;
 //BA.debugLineNum = 57147394;BA.debugLine="End Sub";
return "";
}
public String  _setlastofflinedatarefreshstate(b4j.example.playerstatestore __ref,String _statevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setlastofflinedatarefreshstate", false))
	 {return ((String) Debug.delegate(ba, "setlastofflinedatarefreshstate", new Object[] {_statevalue}));}
RDebugUtils.currentLine=58654720;
 //BA.debugLineNum = 58654720;BA.debugLine="Public Sub SetLastOfflineDataRefreshState(stateVal";
RDebugUtils.currentLine=58654721;
 //BA.debugLineNum = 58654721;BA.debugLine="policyState.LastOfflineDataRefreshState = stateVa";
__ref._policystate /*b4j.example.playbackdatapolicystate*/ ._lastofflinedatarefreshstate /*String*/  = _statevalue;
RDebugUtils.currentLine=58654722;
 //BA.debugLineNum = 58654722;BA.debugLine="End Sub";
return "";
}
public String  _setlastretrymode(b4j.example.playerstatestore __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setlastretrymode", false))
	 {return ((String) Debug.delegate(ba, "setlastretrymode", new Object[] {_mode}));}
RDebugUtils.currentLine=56950784;
 //BA.debugLineNum = 56950784;BA.debugLine="Public Sub SetLastRetryMode(mode As String)";
RDebugUtils.currentLine=56950785;
 //BA.debugLineNum = 56950785;BA.debugLine="lastRetryMode = mode";
__ref._lastretrymode /*String*/  = _mode;
RDebugUtils.currentLine=56950786;
 //BA.debugLineNum = 56950786;BA.debugLine="End Sub";
return "";
}
public String  _setplaybackflowstate(b4j.example.playerstatestore __ref,String _statevalue,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setplaybackflowstate", false))
	 {return ((String) Debug.delegate(ba, "setplaybackflowstate", new Object[] {_statevalue,_reason}));}
RDebugUtils.currentLine=61276160;
 //BA.debugLineNum = 61276160;BA.debugLine="Public Sub SetPlaybackFlowState(stateValue As Stri";
RDebugUtils.currentLine=61276161;
 //BA.debugLineNum = 61276161;BA.debugLine="owner.Data_SetPlaybackFlowState(stateValue, reaso";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_setplaybackflowstate /*String*/ (null,_statevalue,_reason);
RDebugUtils.currentLine=61276162;
 //BA.debugLineNum = 61276162;BA.debugLine="End Sub";
return "";
}
public String  _setplayicon(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setplayicon", false))
	 {return ((String) Debug.delegate(ba, "setplayicon", null));}
RDebugUtils.currentLine=61472768;
 //BA.debugLineNum = 61472768;BA.debugLine="Public Sub SetPlayIcon";
RDebugUtils.currentLine=61472769;
 //BA.debugLineNum = 61472769;BA.debugLine="owner.Data_SetPlayIcon";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_setplayicon /*String*/ (null);
RDebugUtils.currentLine=61472770;
 //BA.debugLineNum = 61472770;BA.debugLine="End Sub";
return "";
}
public String  _setremotedataready(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setremotedataready", false))
	 {return ((String) Debug.delegate(ba, "setremotedataready", null));}
RDebugUtils.currentLine=58785792;
 //BA.debugLineNum = 58785792;BA.debugLine="Public Sub SetRemoteDataReady";
RDebugUtils.currentLine=58785793;
 //BA.debugLineNum = 58785793;BA.debugLine="policyState.SetRemoteDataReady";
__ref._policystate /*b4j.example.playbackdatapolicystate*/ ._setremotedataready /*String*/ (null);
RDebugUtils.currentLine=58785794;
 //BA.debugLineNum = 58785794;BA.debugLine="End Sub";
return "";
}
public String  _setretryinterval(b4j.example.playerstatestore __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setretryinterval", false))
	 {return ((String) Debug.delegate(ba, "setretryinterval", new Object[] {_value}));}
RDebugUtils.currentLine=62783488;
 //BA.debugLineNum = 62783488;BA.debugLine="Public Sub SetRetryInterval(value As Int)";
RDebugUtils.currentLine=62783489;
 //BA.debugLineNum = 62783489;BA.debugLine="retryTimerRef.Interval = value";
__ref._retrytimerref /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (_value));
RDebugUtils.currentLine=62783490;
 //BA.debugLineNum = 62783490;BA.debugLine="End Sub";
return "";
}
public String  _setstopicon(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setstopicon", false))
	 {return ((String) Debug.delegate(ba, "setstopicon", null));}
RDebugUtils.currentLine=60489728;
 //BA.debugLineNum = 60489728;BA.debugLine="Public Sub SetStopIcon";
RDebugUtils.currentLine=60489729;
 //BA.debugLineNum = 60489729;BA.debugLine="owner.Data_SetStopIcon";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_setstopicon /*String*/ (null);
RDebugUtils.currentLine=60489730;
 //BA.debugLineNum = 60489730;BA.debugLine="End Sub";
return "";
}
public boolean  _shouldresumewithnewstart(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "shouldresumewithnewstart", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldresumewithnewstart", null));}
RDebugUtils.currentLine=60293120;
 //BA.debugLineNum = 60293120;BA.debugLine="Public Sub ShouldResumeWithNewStart As Boolean";
RDebugUtils.currentLine=60293121;
 //BA.debugLineNum = 60293121;BA.debugLine="Return orchestrationStateRef.IsStarted And IsUser";
if (true) return __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/  && __ref._isuserstoppedstate /*boolean*/ (null)==__c.False && __ref._ispolicypausestate /*boolean*/ (null)==__c.False && __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ==__c.False;
RDebugUtils.currentLine=60293122;
 //BA.debugLineNum = 60293122;BA.debugLine="End Sub";
return false;
}
public String  _showmessage(b4j.example.playerstatestore __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "showmessage", false))
	 {return ((String) Debug.delegate(ba, "showmessage", new Object[] {_text}));}
RDebugUtils.currentLine=61079552;
 //BA.debugLineNum = 61079552;BA.debugLine="Public Sub ShowMessage(text As String)";
RDebugUtils.currentLine=61079553;
 //BA.debugLineNum = 61079553;BA.debugLine="owner.Data_ShowMessage(text)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_showmessage /*String*/ (null,_text);
RDebugUtils.currentLine=61079554;
 //BA.debugLineNum = 61079554;BA.debugLine="End Sub";
return "";
}
public b4j.example.keyvaluestore  _storage(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "storage", false))
	 {return ((b4j.example.keyvaluestore) Debug.delegate(ba, "storage", null));}
RDebugUtils.currentLine=58982400;
 //BA.debugLineNum = 58982400;BA.debugLine="Public Sub Storage As KeyValueStore";
RDebugUtils.currentLine=58982401;
 //BA.debugLineNum = 58982401;BA.debugLine="Return storageRef";
if (true) return __ref._storageref /*b4j.example.keyvaluestore*/ ;
RDebugUtils.currentLine=58982402;
 //BA.debugLineNum = 58982402;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _syncofflineplaylistmetadata(b4j.example.playerstatestore __ref) throws Exception{
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "syncofflineplaylistmetadata", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "syncofflineplaylistmetadata", null));}
ResumableSub_SyncOfflinePlaylistMetadata rsub = new ResumableSub_SyncOfflinePlaylistMetadata(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SyncOfflinePlaylistMetadata extends BA.ResumableSub {
public ResumableSub_SyncOfflinePlaylistMetadata(b4j.example.playerstatestore parent,b4j.example.playerstatestore __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.playerstatestore __ref;
b4j.example.playerstatestore parent;
boolean _synced = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playerstatestore";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=60817409;
 //BA.debugLineNum = 60817409;BA.debugLine="Wait For (owner.Data_SyncOfflinePlaylistMetadata)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playerstatestore", "syncofflineplaylistmetadata"), __ref._owner /*b4j.example.b4xmainpage*/ ._data_syncofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_synced = (boolean) result[1];
;
RDebugUtils.currentLine=60817410;
 //BA.debugLineNum = 60817410;BA.debugLine="Return synced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_synced));return;};
RDebugUtils.currentLine=60817411;
 //BA.debugLineNum = 60817411;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public int  _timezoneoffsetminutesvalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "timezoneoffsetminutesvalue", false))
	 {return ((Integer) Debug.delegate(ba, "timezoneoffsetminutesvalue", null));}
RDebugUtils.currentLine=57540608;
 //BA.debugLineNum = 57540608;BA.debugLine="Public Sub TimezoneOffsetMinutesValue As Int";
RDebugUtils.currentLine=57540609;
 //BA.debugLineNum = 57540609;BA.debugLine="Return owner.TimezoneOffsetMinutesValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._timezoneoffsetminutesvalue /*int*/ (null);
RDebugUtils.currentLine=57540610;
 //BA.debugLineNum = 57540610;BA.debugLine="End Sub";
return 0;
}
public String  _tracelog(b4j.example.playerstatestore __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "tracelog", false))
	 {return ((String) Debug.delegate(ba, "tracelog", new Object[] {_message}));}
RDebugUtils.currentLine=58064896;
 //BA.debugLineNum = 58064896;BA.debugLine="Public Sub TraceLog(message As String)";
RDebugUtils.currentLine=58064897;
 //BA.debugLineNum = 58064897;BA.debugLine="owner.Data_TraceLog(message)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_tracelog /*String*/ (null,_message);
RDebugUtils.currentLine=58064898;
 //BA.debugLineNum = 58064898;BA.debugLine="End Sub";
return "";
}
public String  _tracewarn(b4j.example.playerstatestore __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "tracewarn", false))
	 {return ((String) Debug.delegate(ba, "tracewarn", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=58195968;
 //BA.debugLineNum = 58195968;BA.debugLine="Public Sub TraceWarn(category As String, message A";
RDebugUtils.currentLine=58195969;
 //BA.debugLineNum = 58195969;BA.debugLine="owner.Data_TraceWarn(category, message, details)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_tracewarn /*String*/ (null,_category,_message,_details);
RDebugUtils.currentLine=58195970;
 //BA.debugLineNum = 58195970;BA.debugLine="End Sub";
return "";
}
public String  _trustedsynctimekey(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "trustedsynctimekey", false))
	 {return ((String) Debug.delegate(ba, "trustedsynctimekey", null));}
RDebugUtils.currentLine=59047936;
 //BA.debugLineNum = 59047936;BA.debugLine="Public Sub TrustedSyncTimeKey As String";
RDebugUtils.currentLine=59047937;
 //BA.debugLineNum = 59047937;BA.debugLine="Return trustedSyncTimeKeyValue";
if (true) return __ref._trustedsynctimekeyvalue /*String*/ ;
RDebugUtils.currentLine=59047938;
 //BA.debugLineNum = 59047938;BA.debugLine="End Sub";
return "";
}
public String  _writehealthsnapshot(b4j.example.playerstatestore __ref,String _trigger) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "writehealthsnapshot", false))
	 {return ((String) Debug.delegate(ba, "writehealthsnapshot", new Object[] {_trigger}));}
RDebugUtils.currentLine=59572224;
 //BA.debugLineNum = 59572224;BA.debugLine="Public Sub WriteHealthSnapshot(trigger As String)";
RDebugUtils.currentLine=59572225;
 //BA.debugLineNum = 59572225;BA.debugLine="owner.Data_WriteHealthSnapshot(trigger)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_writehealthsnapshot /*String*/ (null,_trigger);
RDebugUtils.currentLine=59572226;
 //BA.debugLineNum = 59572226;BA.debugLine="End Sub";
return "";
}
}