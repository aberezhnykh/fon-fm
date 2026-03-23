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
public b4j.example.playbackretryfallbackstate _retryfallbackstateref = null;
public b4j.example.playbackqueuestate _queuestateref = null;
public b4j.example.playbackqueuebuilder _queuebuilderref = null;
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
RDebugUtils.currentLine=82444288;
 //BA.debugLineNum = 82444288;BA.debugLine="Public Sub OfflineData As Map";
RDebugUtils.currentLine=82444289;
 //BA.debugLineNum = 82444289;BA.debugLine="If offlineDataRef.IsInitialized = False Then offl";
if (__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=82444290;
 //BA.debugLineNum = 82444290;BA.debugLine="Return offlineDataRef";
if (true) return __ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=82444291;
 //BA.debugLineNum = 82444291;BA.debugLine="End Sub";
return null;
}
public boolean  _canusedataplaybackresolver(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "canusedataplaybackresolver", false))
	 {return ((Boolean) Debug.delegate(ba, "canusedataplaybackresolver", null));}
RDebugUtils.currentLine=88539136;
 //BA.debugLineNum = 88539136;BA.debugLine="Public Sub CanUseDataPlaybackResolver As Boolean";
RDebugUtils.currentLine=88539137;
 //BA.debugLineNum = 88539137;BA.debugLine="Return queueBuilderRef.CanUseDataPlaybackResolver";
if (true) return __ref._queuebuilderref /*b4j.example.playbackqueuebuilder*/ ._canusedataplaybackresolver /*boolean*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null));
RDebugUtils.currentLine=88539138;
 //BA.debugLineNum = 88539138;BA.debugLine="End Sub";
return false;
}
public String  _capturestoppedreservequeue(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.List _playqueue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "capturestoppedreservequeue", false))
	 {return ((String) Debug.delegate(ba, "capturestoppedreservequeue", new Object[] {_playqueue}));}
String _currentsignature = "";
anywheresoftware.b4a.objects.collections.List _reservequeue = null;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=88080384;
 //BA.debugLineNum = 88080384;BA.debugLine="Public Sub CaptureStoppedReserveQueue(playQueue As";
RDebugUtils.currentLine=88080385;
 //BA.debugLineNum = 88080385;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (_playqueue.IsInitialized()==__c.False || _playqueue.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=88080386;
 //BA.debugLineNum = 88080386;BA.debugLine="Dim currentSignature As String = BuildQueueSignat";
_currentsignature = __ref._buildqueuesignature /*String*/ (null);
RDebugUtils.currentLine=88080387;
 //BA.debugLineNum = 88080387;BA.debugLine="If currentSignature = \"\" Then Return";
if ((_currentsignature).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=88080388;
 //BA.debugLineNum = 88080388;BA.debugLine="Dim reserveQueue As List";
_reservequeue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=88080389;
 //BA.debugLineNum = 88080389;BA.debugLine="reserveQueue.Initialize";
_reservequeue.Initialize();
RDebugUtils.currentLine=88080390;
 //BA.debugLineNum = 88080390;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group6 = _playqueue;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_itemobject = group6.Get(index6);
RDebugUtils.currentLine=88080391;
 //BA.debugLineNum = 88080391;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=88080392;
 //BA.debugLineNum = 88080392;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=88080393;
 //BA.debugLineNum = 88080393;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
if (__ref._isvaliddatatrackitem /*boolean*/ (null,_item)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=88080394;
 //BA.debugLineNum = 88080394;BA.debugLine="If mediaCacheRef.IsTrackCached(item.GetDefault(";
if (__ref._mediacacheref /*b4j.example.mediacache*/ ._istrackcached /*boolean*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=88080395;
 //BA.debugLineNum = 88080395;BA.debugLine="reserveQueue.Add(CloneMap(item))";
_reservequeue.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item).getObject()));
 };
 }
};
RDebugUtils.currentLine=88080398;
 //BA.debugLineNum = 88080398;BA.debugLine="queueStateRef.CaptureStoppedReserve(reserveQueue,";
__ref._queuestateref /*b4j.example.playbackqueuestate*/ ._capturestoppedreserve /*String*/ (null,_reservequeue,_currentsignature);
RDebugUtils.currentLine=88080399;
 //BA.debugLineNum = 88080399;BA.debugLine="If queueStateRef.StoppedReserveQueue.Size = 0 The";
if (__ref._queuestateref /*b4j.example.playbackqueuestate*/ ._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=88080400;
 //BA.debugLineNum = 88080400;BA.debugLine="TraceLog(\"резерв очереди save tracks=\" & queueSta";
__ref._tracelog /*String*/ (null,"резерв очереди save tracks="+BA.NumberToString(__ref._queuestateref /*b4j.example.playbackqueuestate*/ ._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=88080401;
 //BA.debugLineNum = 88080401;BA.debugLine="End Sub";
return "";
}
public String  _cleardispatchretryafter(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "cleardispatchretryafter", false))
	 {return ((String) Debug.delegate(ba, "cleardispatchretryafter", null));}
RDebugUtils.currentLine=88801280;
 //BA.debugLineNum = 88801280;BA.debugLine="Public Sub ClearDispatchRetryAfter";
RDebugUtils.currentLine=88801281;
 //BA.debugLineNum = 88801281;BA.debugLine="retryFallbackStateRef.ClearDispatchRetryAfter";
__ref._retryfallbackstateref /*b4j.example.playbackretryfallbackstate*/ ._cleardispatchretryafter /*String*/ (null);
RDebugUtils.currentLine=88801282;
 //BA.debugLineNum = 88801282;BA.debugLine="End Sub";
return "";
}
public String  _clearqueuesnapshotstate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clearqueuesnapshotstate", false))
	 {return ((String) Debug.delegate(ba, "clearqueuesnapshotstate", null));}
RDebugUtils.currentLine=88145920;
 //BA.debugLineNum = 88145920;BA.debugLine="Public Sub ClearQueueSnapshotState";
RDebugUtils.currentLine=88145921;
 //BA.debugLineNum = 88145921;BA.debugLine="queueStateRef.ClearQueueSnapshot(storageRef)";
__ref._queuestateref /*b4j.example.playbackqueuestate*/ ._clearqueuesnapshot /*String*/ (null,__ref._storageref /*b4j.example.keyvaluestore*/ );
RDebugUtils.currentLine=88145922;
 //BA.debugLineNum = 88145922;BA.debugLine="TraceLog(\"снимок очереди clear\")";
__ref._tracelog /*String*/ (null,"снимок очереди clear");
RDebugUtils.currentLine=88145923;
 //BA.debugLineNum = 88145923;BA.debugLine="End Sub";
return "";
}
public String  _clearlastretrymode(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clearlastretrymode", false))
	 {return ((String) Debug.delegate(ba, "clearlastretrymode", null));}
RDebugUtils.currentLine=85917696;
 //BA.debugLineNum = 85917696;BA.debugLine="Public Sub ClearLastRetryMode";
RDebugUtils.currentLine=85917697;
 //BA.debugLineNum = 85917697;BA.debugLine="lastRetryMode = \"\"";
__ref._lastretrymode /*String*/  = "";
RDebugUtils.currentLine=85917698;
 //BA.debugLineNum = 85917698;BA.debugLine="End Sub";
return "";
}
public String  _setmediapathdegraded(b4j.example.playerstatestore __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setmediapathdegraded", false))
	 {return ((String) Debug.delegate(ba, "setmediapathdegraded", new Object[] {_value}));}
RDebugUtils.currentLine=84672512;
 //BA.debugLineNum = 84672512;BA.debugLine="Public Sub SetMediaPathDegraded(value As Boolean)";
RDebugUtils.currentLine=84672513;
 //BA.debugLineNum = 84672513;BA.debugLine="retryFallbackStateRef.SetMediaPathDegraded(value)";
__ref._retryfallbackstateref /*b4j.example.playbackretryfallbackstate*/ ._setmediapathdegraded /*String*/ (null,_value);
RDebugUtils.currentLine=84672514;
 //BA.debugLineNum = 84672514;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuredataplaybackqueue(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.List _playqueue,int _minitems) throws Exception{
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "ensuredataplaybackqueue", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuredataplaybackqueue", new Object[] {_playqueue,_minitems}));}
ResumableSub_EnsureDataPlaybackQueue rsub = new ResumableSub_EnsureDataPlaybackQueue(this,__ref,_playqueue,_minitems);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureDataPlaybackQueue extends BA.ResumableSub {
public ResumableSub_EnsureDataPlaybackQueue(b4j.example.playerstatestore parent,b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.List _playqueue,int _minitems) {
this.parent = parent;
this.__ref = __ref;
this._playqueue = _playqueue;
this._minitems = _minitems;
this.__ref = parent;
}
b4j.example.playerstatestore __ref;
b4j.example.playerstatestore parent;
anywheresoftware.b4a.objects.collections.List _playqueue;
int _minitems;
boolean _queueprepared = false;

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
RDebugUtils.currentLine=88670209;
 //BA.debugLineNum = 88670209;BA.debugLine="Wait For (queueBuilderRef.EnsureDataPlaybackQueue";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playerstatestore", "ensuredataplaybackqueue"), __ref._queuebuilderref /*b4j.example.playbackqueuebuilder*/ ._ensuredataplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_playqueue,_minitems,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._effectivenowticks /*long*/ (null),__ref._storageref /*b4j.example.keyvaluestore*/ ,__ref._queuestateref /*b4j.example.playbackqueuestate*/ ,__ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ,__ref._mediacacheref /*b4j.example.mediacache*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=88670210;
 //BA.debugLineNum = 88670210;BA.debugLine="Return queuePrepared";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_queueprepared));return;};
RDebugUtils.currentLine=88670211;
 //BA.debugLineNum = 88670211;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuredataplaybackready(b4j.example.playerstatestore __ref) throws Exception{
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "ensuredataplaybackready", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuredataplaybackready", null));}
ResumableSub_EnsureDataPlaybackReady rsub = new ResumableSub_EnsureDataPlaybackReady(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureDataPlaybackReady extends BA.ResumableSub {
public ResumableSub_EnsureDataPlaybackReady(b4j.example.playerstatestore parent,b4j.example.playerstatestore __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.playerstatestore __ref;
b4j.example.playerstatestore parent;
boolean _resolverready = false;

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
this.state = 1;
RDebugUtils.currentLine=88604673;
 //BA.debugLineNum = 88604673;BA.debugLine="Wait For (queueBuilderRef.EnsureDataPlaybackReady";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playerstatestore", "ensuredataplaybackready"), __ref._queuebuilderref /*b4j.example.playbackqueuebuilder*/ ._ensuredataplaybackready /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resolverready = (boolean) result[1];
;
RDebugUtils.currentLine=88604674;
 //BA.debugLineNum = 88604674;BA.debugLine="If resolverReady = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resolverready==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=88604675;
 //BA.debugLineNum = 88604675;BA.debugLine="TraceLog(\"подготовка data playback ошибка\")";
__ref._tracelog /*String*/ (null,"подготовка data playback ошибка");
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=88604677;
 //BA.debugLineNum = 88604677;BA.debugLine="Return resolverReady";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resolverready));return;};
RDebugUtils.currentLine=88604678;
 //BA.debugLineNum = 88604678;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setstartupsequenceinprogress(b4j.example.playerstatestore __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setstartupsequenceinprogress", false))
	 {return ((String) Debug.delegate(ba, "setstartupsequenceinprogress", new Object[] {_value}));}
RDebugUtils.currentLine=86179840;
 //BA.debugLineNum = 86179840;BA.debugLine="Public Sub SetStartupSequenceInProgress(value As B";
RDebugUtils.currentLine=86179841;
 //BA.debugLineNum = 86179841;BA.debugLine="startupSequenceInProgress = value";
__ref._startupsequenceinprogress /*boolean*/  = _value;
RDebugUtils.currentLine=86179842;
 //BA.debugLineNum = 86179842;BA.debugLine="If value = False Then adWarmupDeferredAfterStartu";
if (_value==__c.False) { 
__ref._adwarmupdeferredafterstartup /*boolean*/  = __c.False;};
RDebugUtils.currentLine=86179843;
 //BA.debugLineNum = 86179843;BA.debugLine="End Sub";
return "";
}
public int  _consumedispatchretryafter(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "consumedispatchretryafter", false))
	 {return ((Integer) Debug.delegate(ba, "consumedispatchretryafter", null));}
RDebugUtils.currentLine=88932352;
 //BA.debugLineNum = 88932352;BA.debugLine="Public Sub ConsumeDispatchRetryAfter As Int";
RDebugUtils.currentLine=88932353;
 //BA.debugLineNum = 88932353;BA.debugLine="Return retryFallbackStateRef.ConsumeDispatchRetry";
if (true) return __ref._retryfallbackstateref /*b4j.example.playbackretryfallbackstate*/ ._consumedispatchretryafter /*int*/ (null);
RDebugUtils.currentLine=88932354;
 //BA.debugLineNum = 88932354;BA.debugLine="End Sub";
return 0;
}
public String  _setlasthistoryoknow(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setlasthistoryoknow", false))
	 {return ((String) Debug.delegate(ba, "setlasthistoryoknow", null));}
RDebugUtils.currentLine=85983232;
 //BA.debugLineNum = 85983232;BA.debugLine="Public Sub SetLastHistoryOkNow";
RDebugUtils.currentLine=85983233;
 //BA.debugLineNum = 85983233;BA.debugLine="historySuccessAtTicks = DateTime.Now";
__ref._historysuccessatticks /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=85983234;
 //BA.debugLineNum = 85983234;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playerstatestore __ref,anywheresoftware.b4a.BA _ba,b4j.example.b4xmainpage _mainpage,anywheresoftware.b4a.objects.Timer _retrytimervalue,b4j.example.playbackdatapolicystate _datapolicyvalue,b4j.example.playbackorchestrationstate _orchestrationstatevalue,b4j.example.playbackretryfallbackstate _retryfallbackstatevalue,b4j.example.playbackqueuestate _queuestatevalue,b4j.example.playbackqueuebuilder _queuebuildervalue,b4j.example.keyvaluestore _storagevalue,String _trustedsynckeyvalue,b4j.example.offlinestore _offlinestorevalue,b4j.example.dataplaybackresolver _dataresolvervalue,b4j.example.mediacache _mediacachevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mainpage,_retrytimervalue,_datapolicyvalue,_orchestrationstatevalue,_retryfallbackstatevalue,_queuestatevalue,_queuebuildervalue,_storagevalue,_trustedsynckeyvalue,_offlinestorevalue,_dataresolvervalue,_mediacachevalue}));}
RDebugUtils.currentLine=80347136;
 //BA.debugLineNum = 80347136;BA.debugLine="Public Sub Initialize(mainPage As B4XMainPage, ret";
RDebugUtils.currentLine=80347137;
 //BA.debugLineNum = 80347137;BA.debugLine="owner = mainPage";
__ref._owner /*b4j.example.b4xmainpage*/  = _mainpage;
RDebugUtils.currentLine=80347138;
 //BA.debugLineNum = 80347138;BA.debugLine="policyState = dataPolicyValue";
__ref._policystate /*b4j.example.playbackdatapolicystate*/  = _datapolicyvalue;
RDebugUtils.currentLine=80347139;
 //BA.debugLineNum = 80347139;BA.debugLine="orchestrationStateRef = orchestrationStateValue";
__ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/  = _orchestrationstatevalue;
RDebugUtils.currentLine=80347140;
 //BA.debugLineNum = 80347140;BA.debugLine="retryFallbackStateRef = retryFallbackStateValue";
__ref._retryfallbackstateref /*b4j.example.playbackretryfallbackstate*/  = _retryfallbackstatevalue;
RDebugUtils.currentLine=80347141;
 //BA.debugLineNum = 80347141;BA.debugLine="queueStateRef = queueStateValue";
__ref._queuestateref /*b4j.example.playbackqueuestate*/  = _queuestatevalue;
RDebugUtils.currentLine=80347142;
 //BA.debugLineNum = 80347142;BA.debugLine="queueBuilderRef = queueBuilderValue";
__ref._queuebuilderref /*b4j.example.playbackqueuebuilder*/  = _queuebuildervalue;
RDebugUtils.currentLine=80347143;
 //BA.debugLineNum = 80347143;BA.debugLine="offlineStoreRef = offlineStoreValue";
__ref._offlinestoreref /*b4j.example.offlinestore*/  = _offlinestorevalue;
RDebugUtils.currentLine=80347144;
 //BA.debugLineNum = 80347144;BA.debugLine="dataResolverRef = dataResolverValue";
__ref._dataresolverref /*b4j.example.dataplaybackresolver*/  = _dataresolvervalue;
RDebugUtils.currentLine=80347145;
 //BA.debugLineNum = 80347145;BA.debugLine="mediaCacheRef = mediaCacheValue";
__ref._mediacacheref /*b4j.example.mediacache*/  = _mediacachevalue;
RDebugUtils.currentLine=80347146;
 //BA.debugLineNum = 80347146;BA.debugLine="storageRef = storageValue";
__ref._storageref /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=80347147;
 //BA.debugLineNum = 80347147;BA.debugLine="trustedSyncTimeKeyValue = trustedSyncKeyValue";
__ref._trustedsynctimekeyvalue /*String*/  = _trustedsynckeyvalue;
RDebugUtils.currentLine=80347148;
 //BA.debugLineNum = 80347148;BA.debugLine="retryTimerRef = retryTimerValue";
__ref._retrytimerref /*anywheresoftware.b4a.objects.Timer*/  = _retrytimervalue;
RDebugUtils.currentLine=80347149;
 //BA.debugLineNum = 80347149;BA.debugLine="offlineDataRef.Initialize";
__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=80347150;
 //BA.debugLineNum = 80347150;BA.debugLine="End Sub";
return "";
}
public String  _setofflinedata(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setofflinedata", false))
	 {return ((String) Debug.delegate(ba, "setofflinedata", new Object[] {_data}));}
RDebugUtils.currentLine=87883776;
 //BA.debugLineNum = 87883776;BA.debugLine="Public Sub SetOfflineData(data As Map)";
RDebugUtils.currentLine=87883777;
 //BA.debugLineNum = 87883777;BA.debugLine="If data.IsInitialized Then";
if (_data.IsInitialized()) { 
RDebugUtils.currentLine=87883778;
 //BA.debugLineNum = 87883778;BA.debugLine="offlineDataRef = data";
__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/  = _data;
 }else {
RDebugUtils.currentLine=87883780;
 //BA.debugLineNum = 87883780;BA.debugLine="offlineDataRef.Initialize";
__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=87883782;
 //BA.debugLineNum = 87883782;BA.debugLine="End Sub";
return "";
}
public boolean  _ismediapathdegraded(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "ismediapathdegraded", false))
	 {return ((Boolean) Debug.delegate(ba, "ismediapathdegraded", null));}
RDebugUtils.currentLine=88997888;
 //BA.debugLineNum = 88997888;BA.debugLine="Public Sub IsMediaPathDegraded As Boolean";
RDebugUtils.currentLine=88997889;
 //BA.debugLineNum = 88997889;BA.debugLine="Return retryFallbackStateRef.IsMediaPathDegraded";
if (true) return __ref._retryfallbackstateref /*b4j.example.playbackretryfallbackstate*/ ._ismediapathdegraded /*boolean*/ ;
RDebugUtils.currentLine=88997890;
 //BA.debugLineNum = 88997890;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _trypopulatequeuefromlocalplan(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.List _playqueue,int _minitems) throws Exception{
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "trypopulatequeuefromlocalplan", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "trypopulatequeuefromlocalplan", new Object[] {_playqueue,_minitems}));}
ResumableSub_TryPopulateQueueFromLocalPlan rsub = new ResumableSub_TryPopulateQueueFromLocalPlan(this,__ref,_playqueue,_minitems);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TryPopulateQueueFromLocalPlan extends BA.ResumableSub {
public ResumableSub_TryPopulateQueueFromLocalPlan(b4j.example.playerstatestore parent,b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.List _playqueue,int _minitems) {
this.parent = parent;
this.__ref = __ref;
this._playqueue = _playqueue;
this._minitems = _minitems;
this.__ref = parent;
}
b4j.example.playerstatestore __ref;
b4j.example.playerstatestore parent;
anywheresoftware.b4a.objects.collections.List _playqueue;
int _minitems;
anywheresoftware.b4a.objects.collections.Map _result = null;
boolean _resolverready = false;
boolean _queueprepared = false;

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
this.state = 1;
RDebugUtils.currentLine=89063425;
 //BA.debugLineNum = 89063425;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=89063426;
 //BA.debugLineNum = 89063426;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=89063427;
 //BA.debugLineNum = 89063427;BA.debugLine="result.Put(\"success\", False)";
_result.Put((Object)("success"),(Object)(parent.__c.False));
RDebugUtils.currentLine=89063428;
 //BA.debugLineNum = 89063428;BA.debugLine="result.Put(\"status\", \"\")";
_result.Put((Object)("status"),(Object)(""));
RDebugUtils.currentLine=89063429;
 //BA.debugLineNum = 89063429;BA.debugLine="result.Put(\"idle_text\", \"\")";
_result.Put((Object)("idle_text"),(Object)(""));
RDebugUtils.currentLine=89063430;
 //BA.debugLineNum = 89063430;BA.debugLine="ClearDispatchRetryAfter";
__ref._cleardispatchretryafter /*String*/ (null);
RDebugUtils.currentLine=89063431;
 //BA.debugLineNum = 89063431;BA.debugLine="If CanUseDataPlaybackResolver = False Then";
if (true) break;

case 1:
//if
this.state = 8;
if (__ref._canusedataplaybackresolver /*boolean*/ (null)==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=89063432;
 //BA.debugLineNum = 89063432;BA.debugLine="Wait For (EnsureDataPlaybackReady) Complete (res";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playerstatestore", "trypopulatequeuefromlocalplan"), __ref._ensuredataplaybackready /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_resolverready = (boolean) result[1];
;
RDebugUtils.currentLine=89063433;
 //BA.debugLineNum = 89063433;BA.debugLine="If resolverReady = False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_resolverready==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=89063434;
 //BA.debugLineNum = 89063434;BA.debugLine="result.Put(\"status\", \"resolver_unavailable\")";
_result.Put((Object)("status"),(Object)("resolver_unavailable"));
RDebugUtils.currentLine=89063435;
 //BA.debugLineNum = 89063435;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=89063438;
 //BA.debugLineNum = 89063438;BA.debugLine="Wait For (EnsureDataPlaybackQueue(playQueue, minI";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playerstatestore", "trypopulatequeuefromlocalplan"), __ref._ensuredataplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_playqueue,_minitems));
this.state = 14;
return;
case 14:
//C
this.state = 9;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=89063439;
 //BA.debugLineNum = 89063439;BA.debugLine="If queuePrepared = False Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_queueprepared==parent.__c.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=89063440;
 //BA.debugLineNum = 89063440;BA.debugLine="result.Put(\"status\", \"queue_empty\")";
_result.Put((Object)("status"),(Object)("queue_empty"));
RDebugUtils.currentLine=89063441;
 //BA.debugLineNum = 89063441;BA.debugLine="result.Put(\"idle_text\", ResolveIdleUntilMessage(";
_result.Put((Object)("idle_text"),(Object)(__ref._resolveidleuntilmessage /*String*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._effectivenowticks /*long*/ (null))));
RDebugUtils.currentLine=89063442;
 //BA.debugLineNum = 89063442;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=89063444;
 //BA.debugLineNum = 89063444;BA.debugLine="result.Put(\"success\", True)";
_result.Put((Object)("success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=89063445;
 //BA.debugLineNum = 89063445;BA.debugLine="result.Put(\"status\", \"success\")";
_result.Put((Object)("status"),(Object)("success"));
RDebugUtils.currentLine=89063446;
 //BA.debugLineNum = 89063446;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=89063447;
 //BA.debugLineNum = 89063447;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setdispatchretryafter(b4j.example.playerstatestore __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setdispatchretryafter", false))
	 {return ((String) Debug.delegate(ba, "setdispatchretryafter", new Object[] {_value}));}
RDebugUtils.currentLine=88866816;
 //BA.debugLineNum = 88866816;BA.debugLine="Public Sub SetDispatchRetryAfter(value As Int)";
RDebugUtils.currentLine=88866817;
 //BA.debugLineNum = 88866817;BA.debugLine="retryFallbackStateRef.SetDispatchRetryAfter(value";
__ref._retryfallbackstateref /*b4j.example.playbackretryfallbackstate*/ ._setdispatchretryafter /*String*/ (null,_value);
RDebugUtils.currentLine=88866818;
 //BA.debugLineNum = 88866818;BA.debugLine="End Sub";
return "";
}
public String  _requestskipqueuesnapshotrestore(b4j.example.playerstatestore __ref,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "requestskipqueuesnapshotrestore", false))
	 {return ((String) Debug.delegate(ba, "requestskipqueuesnapshotrestore", new Object[] {_reason}));}
RDebugUtils.currentLine=84738048;
 //BA.debugLineNum = 84738048;BA.debugLine="Public Sub RequestSkipQueueSnapshotRestore(reason";
RDebugUtils.currentLine=84738049;
 //BA.debugLineNum = 84738049;BA.debugLine="queueStateRef.RequestSkipQueueSnapshotRestore";
__ref._queuestateref /*b4j.example.playbackqueuestate*/ ._requestskipqueuesnapshotrestore /*String*/ (null);
RDebugUtils.currentLine=84738050;
 //BA.debugLineNum = 84738050;BA.debugLine="TraceLog(\"снимок очереди восстановление skip reas";
__ref._tracelog /*String*/ (null,"снимок очереди восстановление skip reason="+_reason);
RDebugUtils.currentLine=84738051;
 //BA.debugLineNum = 84738051;BA.debugLine="End Sub";
return "";
}
public boolean  _restorestoppedreservequeue(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.List _playqueue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "restorestoppedreservequeue", false))
	 {return ((Boolean) Debug.delegate(ba, "restorestoppedreservequeue", new Object[] {_playqueue}));}
String _currentsignature = "";
anywheresoftware.b4a.objects.collections.List _restoredqueue = null;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
int _restoredcount = 0;
Object _restoredobject = null;
RDebugUtils.currentLine=88473600;
 //BA.debugLineNum = 88473600;BA.debugLine="Public Sub RestoreStoppedReserveQueue(playQueue As";
RDebugUtils.currentLine=88473601;
 //BA.debugLineNum = 88473601;BA.debugLine="If queueStateRef.StoppedReserveQueue.IsInitialize";
if (__ref._queuestateref /*b4j.example.playbackqueuestate*/ ._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._queuestateref /*b4j.example.playbackqueuestate*/ ._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=88473602;
 //BA.debugLineNum = 88473602;BA.debugLine="Dim currentSignature As String = BuildQueueSignat";
_currentsignature = __ref._buildqueuesignature /*String*/ (null);
RDebugUtils.currentLine=88473603;
 //BA.debugLineNum = 88473603;BA.debugLine="If currentSignature = \"\" Then Return False";
if ((_currentsignature).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=88473604;
 //BA.debugLineNum = 88473604;BA.debugLine="If queueStateRef.CanRestoreStoppedReserve(current";
if (__ref._queuestateref /*b4j.example.playbackqueuestate*/ ._canrestorestoppedreserve /*boolean*/ (null,_currentsignature)==__c.False) { 
RDebugUtils.currentLine=88473605;
 //BA.debugLineNum = 88473605;BA.debugLine="queueStateRef.ClearStoppedReserve";
__ref._queuestateref /*b4j.example.playbackqueuestate*/ ._clearstoppedreserve /*String*/ (null);
RDebugUtils.currentLine=88473606;
 //BA.debugLineNum = 88473606;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=88473608;
 //BA.debugLineNum = 88473608;BA.debugLine="Dim restoredQueue As List";
_restoredqueue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=88473609;
 //BA.debugLineNum = 88473609;BA.debugLine="restoredQueue.Initialize";
_restoredqueue.Initialize();
RDebugUtils.currentLine=88473610;
 //BA.debugLineNum = 88473610;BA.debugLine="For Each itemObject As Object In queueStateRef.St";
{
final anywheresoftware.b4a.BA.IterableList group10 = __ref._queuestateref /*b4j.example.playbackqueuestate*/ ._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_itemobject = group10.Get(index10);
RDebugUtils.currentLine=88473611;
 //BA.debugLineNum = 88473611;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=88473612;
 //BA.debugLineNum = 88473612;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=88473613;
 //BA.debugLineNum = 88473613;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
if (__ref._isvaliddatatrackitem /*boolean*/ (null,_item)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=88473614;
 //BA.debugLineNum = 88473614;BA.debugLine="If mediaCacheRef.IsTrackCached(item.GetDefault(";
if (__ref._mediacacheref /*b4j.example.mediacache*/ ._istrackcached /*boolean*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=88473615;
 //BA.debugLineNum = 88473615;BA.debugLine="restoredQueue.Add(CloneMap(item))";
_restoredqueue.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item).getObject()));
 };
 }
};
RDebugUtils.currentLine=88473618;
 //BA.debugLineNum = 88473618;BA.debugLine="queueStateRef.ClearStoppedReserve";
__ref._queuestateref /*b4j.example.playbackqueuestate*/ ._clearstoppedreserve /*String*/ (null);
RDebugUtils.currentLine=88473619;
 //BA.debugLineNum = 88473619;BA.debugLine="If playQueue.IsInitialized = False Then playQueue";
if (_playqueue.IsInitialized()==__c.False) { 
_playqueue.Initialize();};
RDebugUtils.currentLine=88473620;
 //BA.debugLineNum = 88473620;BA.debugLine="playQueue.Clear";
_playqueue.Clear();
RDebugUtils.currentLine=88473621;
 //BA.debugLineNum = 88473621;BA.debugLine="Dim restoredCount As Int = 0";
_restoredcount = (int) (0);
RDebugUtils.currentLine=88473622;
 //BA.debugLineNum = 88473622;BA.debugLine="For Each restoredObject As Object In restoredQueu";
{
final anywheresoftware.b4a.BA.IterableList group22 = _restoredqueue;
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_restoredobject = group22.Get(index22);
RDebugUtils.currentLine=88473623;
 //BA.debugLineNum = 88473623;BA.debugLine="playQueue.Add(restoredObject)";
_playqueue.Add(_restoredobject);
RDebugUtils.currentLine=88473624;
 //BA.debugLineNum = 88473624;BA.debugLine="restoredCount = restoredCount + 1";
_restoredcount = (int) (_restoredcount+1);
 }
};
RDebugUtils.currentLine=88473626;
 //BA.debugLineNum = 88473626;BA.debugLine="Return restoredCount > 0";
if (true) return _restoredcount>0;
RDebugUtils.currentLine=88473627;
 //BA.debugLineNum = 88473627;BA.debugLine="End Sub";
return false;
}
public String  _getlastretrymode(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "getlastretrymode", false))
	 {return ((String) Debug.delegate(ba, "getlastretrymode", null));}
RDebugUtils.currentLine=86114304;
 //BA.debugLineNum = 86114304;BA.debugLine="Public Sub GetLastRetryMode As String";
RDebugUtils.currentLine=86114305;
 //BA.debugLineNum = 86114305;BA.debugLine="Return lastRetryMode";
if (true) return __ref._lastretrymode /*String*/ ;
RDebugUtils.currentLine=86114306;
 //BA.debugLineNum = 86114306;BA.debugLine="End Sub";
return "";
}
public String  _savequeuesnapshotstate(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.List _playqueue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "savequeuesnapshotstate", false))
	 {return ((String) Debug.delegate(ba, "savequeuesnapshotstate", new Object[] {_playqueue}));}
String _signature = "";
anywheresoftware.b4a.objects.collections.List _snapshottracks = null;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=88014848;
 //BA.debugLineNum = 88014848;BA.debugLine="Public Sub SaveQueueSnapshotState(playQueue As Lis";
RDebugUtils.currentLine=88014849;
 //BA.debugLineNum = 88014849;BA.debugLine="If playQueue.IsInitialized = False Then Return";
if (_playqueue.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=88014850;
 //BA.debugLineNum = 88014850;BA.debugLine="Dim signature As String = BuildQueueSignature";
_signature = __ref._buildqueuesignature /*String*/ (null);
RDebugUtils.currentLine=88014851;
 //BA.debugLineNum = 88014851;BA.debugLine="If signature = \"\" Then Return";
if ((_signature).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=88014852;
 //BA.debugLineNum = 88014852;BA.debugLine="Dim snapshotTracks As List";
_snapshottracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=88014853;
 //BA.debugLineNum = 88014853;BA.debugLine="snapshotTracks.Initialize";
_snapshottracks.Initialize();
RDebugUtils.currentLine=88014854;
 //BA.debugLineNum = 88014854;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group6 = _playqueue;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_itemobject = group6.Get(index6);
RDebugUtils.currentLine=88014855;
 //BA.debugLineNum = 88014855;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=88014856;
 //BA.debugLineNum = 88014856;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=88014857;
 //BA.debugLineNum = 88014857;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
if (__ref._isvaliddatatrackitem /*boolean*/ (null,_item)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=88014858;
 //BA.debugLineNum = 88014858;BA.debugLine="snapshotTracks.Add(CloneMap(item))";
_snapshottracks.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item).getObject()));
RDebugUtils.currentLine=88014859;
 //BA.debugLineNum = 88014859;BA.debugLine="If snapshotTracks.Size >= 20 Then Exit";
if (_snapshottracks.getSize()>=20) { 
if (true) break;};
 };
 }
};
RDebugUtils.currentLine=88014862;
 //BA.debugLineNum = 88014862;BA.debugLine="queueStateRef.SaveQueueSnapshot(storageRef, signa";
__ref._queuestateref /*b4j.example.playbackqueuestate*/ ._savequeuesnapshot /*String*/ (null,__ref._storageref /*b4j.example.keyvaluestore*/ ,_signature,_snapshottracks,(int) (20));
RDebugUtils.currentLine=88014863;
 //BA.debugLineNum = 88014863;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _tryseedfirsttrackfromcache(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.List _playqueue) throws Exception{
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "tryseedfirsttrackfromcache", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "tryseedfirsttrackfromcache", new Object[] {_playqueue}));}
ResumableSub_TrySeedFirstTrackFromCache rsub = new ResumableSub_TrySeedFirstTrackFromCache(this,__ref,_playqueue);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TrySeedFirstTrackFromCache extends BA.ResumableSub {
public ResumableSub_TrySeedFirstTrackFromCache(b4j.example.playerstatestore parent,b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.List _playqueue) {
this.parent = parent;
this.__ref = __ref;
this._playqueue = _playqueue;
this.__ref = parent;
}
b4j.example.playerstatestore __ref;
b4j.example.playerstatestore parent;
anywheresoftware.b4a.objects.collections.List _playqueue;
boolean _emptyresult = false;
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
anywheresoftware.b4a.objects.collections.Map _workingcursors = null;
boolean _seeded = false;
int _attempt = 0;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
anywheresoftware.b4a.objects.collections.Map _cachedtrack = null;
anywheresoftware.b4a.objects.collections.Map _queueitem = null;
int step9;
int limit9;

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
this.state = 1;
RDebugUtils.currentLine=88735745;
 //BA.debugLineNum = 88735745;BA.debugLine="Dim emptyResult As Boolean = False";
_emptyresult = parent.__c.False;
RDebugUtils.currentLine=88735746;
 //BA.debugLineNum = 88735746;BA.debugLine="If CanUseDataPlaybackResolver = False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._canusedataplaybackresolver /*boolean*/ (null)==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyresult));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=88735747;
 //BA.debugLineNum = 88735747;BA.debugLine="Dim currentSlot As Map = dataResolverRef.ResolveD";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._effectivenowticks /*long*/ (null));
RDebugUtils.currentLine=88735748;
 //BA.debugLineNum = 88735748;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (true) break;

case 7:
//if
this.state = 12;
if (_currentslot.IsInitialized()==parent.__c.False || _currentslot.getSize()==0) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyresult));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=88735749;
 //BA.debugLineNum = 88735749;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),parent.__c.Null)));
RDebugUtils.currentLine=88735750;
 //BA.debugLineNum = 88735750;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (true) break;

case 13:
//if
this.state = 18;
if (_playlists.IsInitialized()==parent.__c.False || _playlists.getSize()==0) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyresult));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=88735751;
 //BA.debugLineNum = 88735751;BA.debugLine="Dim workingCursors As Map = dataResolverRef.Clone";
_workingcursors = new anywheresoftware.b4a.objects.collections.Map();
_workingcursors = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._cloneplaylistcursors /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=88735752;
 //BA.debugLineNum = 88735752;BA.debugLine="Dim seeded As Boolean = False";
_seeded = parent.__c.False;
RDebugUtils.currentLine=88735753;
 //BA.debugLineNum = 88735753;BA.debugLine="For attempt = 0 To playlists.Size - 1";
if (true) break;

case 19:
//for
this.state = 46;
step9 = 1;
limit9 = (int) (_playlists.getSize()-1);
_attempt = (int) (0) ;
this.state = 47;
if (true) break;

case 47:
//C
this.state = 46;
if ((step9 > 0 && _attempt <= limit9) || (step9 < 0 && _attempt >= limit9)) this.state = 21;
if (true) break;

case 48:
//C
this.state = 47;
_attempt = ((int)(0 + _attempt + step9)) ;
if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=88735754;
 //BA.debugLineNum = 88735754;BA.debugLine="Dim playlistDescriptor As Map = dataResolverRef.";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._choosenextplaylistdescriptor /*anywheresoftware.b4a.objects.collections.Map*/ (null,_currentslot,_workingcursors);
RDebugUtils.currentLine=88735755;
 //BA.debugLineNum = 88735755;BA.debugLine="If playlistDescriptor.IsInitialized = False Or p";
if (true) break;

case 22:
//if
this.state = 27;
if (_playlistdescriptor.IsInitialized()==parent.__c.False || _playlistdescriptor.getSize()==0) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
this.state = 46;
if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=88735756;
 //BA.debugLineNum = 88735756;BA.debugLine="Dim playlistId As String = playlistDescriptor.Ge";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=88735757;
 //BA.debugLineNum = 88735757;BA.debugLine="If playlistId = \"\" Then Continue";
if (true) break;

case 28:
//if
this.state = 33;
if ((_playlistid).equals("")) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
this.state = 48;
if (true) break;;
if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=88735758;
 //BA.debugLineNum = 88735758;BA.debugLine="Dim playlistData As Map = dataResolverRef.LoadCa";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=88735759;
 //BA.debugLineNum = 88735759;BA.debugLine="If playlistData.IsInitialized = False Or playlis";
if (true) break;

case 34:
//if
this.state = 39;
if (_playlistdata.IsInitialized()==parent.__c.False || _playlistdata.getSize()==0) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
this.state = 48;
if (true) break;;
if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=88735760;
 //BA.debugLineNum = 88735760;BA.debugLine="Dim cachedTrack As Map = dataResolverRef.ChooseR";
_cachedtrack = new anywheresoftware.b4a.objects.collections.Map();
_cachedtrack = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._chooserandomtrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdata,__ref._mediacacheref /*b4j.example.mediacache*/ ,parent.__c.True);
RDebugUtils.currentLine=88735761;
 //BA.debugLineNum = 88735761;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedTr";
if (true) break;

case 40:
//if
this.state = 45;
if (_cachedtrack.IsInitialized()==parent.__c.False || _cachedtrack.getSize()==0) { 
this.state = 42;
;}if (true) break;

case 42:
//C
this.state = 45;
this.state = 48;
if (true) break;;
if (true) break;

case 45:
//C
this.state = 48;
;
RDebugUtils.currentLine=88735762;
 //BA.debugLineNum = 88735762;BA.debugLine="Dim queueItem As Map = dataResolverRef.CreateQue";
_queueitem = new anywheresoftware.b4a.objects.collections.Map();
_queueitem = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._createqueuetrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (null,_currentslot,_playlistdescriptor,_cachedtrack,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null));
RDebugUtils.currentLine=88735763;
 //BA.debugLineNum = 88735763;BA.debugLine="playQueue.Add(queueItem)";
_playqueue.Add((Object)(_queueitem.getObject()));
RDebugUtils.currentLine=88735764;
 //BA.debugLineNum = 88735764;BA.debugLine="dataResolverRef.SavePreviewPlaylistCursors(stora";
__ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._savepreviewplaylistcursors /*String*/ (null,__ref._storageref /*b4j.example.keyvaluestore*/ ,_workingcursors);
RDebugUtils.currentLine=88735765;
 //BA.debugLineNum = 88735765;BA.debugLine="dataResolverRef.RememberResolvedTrack(queueItem.";
__ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._rememberresolvedtrack /*String*/ (null,BA.ObjectToString(_queueitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=88735766;
 //BA.debugLineNum = 88735766;BA.debugLine="dataResolverRef.RememberResolvedTrackForPlaylist";
__ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._rememberresolvedtrackforplaylist /*String*/ (null,BA.ObjectToString(_queueitem.GetDefault((Object)("playlist_id"),(Object)(""))),BA.ObjectToString(_queueitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=88735767;
 //BA.debugLineNum = 88735767;BA.debugLine="SaveQueueSnapshotState(playQueue)";
__ref._savequeuesnapshotstate /*String*/ (null,_playqueue);
RDebugUtils.currentLine=88735768;
 //BA.debugLineNum = 88735768;BA.debugLine="TraceLog(\"первый старт cache hit playlistId=\" &";
__ref._tracelog /*String*/ (null,"первый старт cache hit playlistId="+_playlistid+" trackId="+BA.ObjectToString(_queueitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=88735769;
 //BA.debugLineNum = 88735769;BA.debugLine="seeded = True";
_seeded = parent.__c.True;
RDebugUtils.currentLine=88735770;
 //BA.debugLineNum = 88735770;BA.debugLine="Exit";
this.state = 46;
if (true) break;
 if (true) break;
if (true) break;

case 46:
//C
this.state = -1;
;
RDebugUtils.currentLine=88735772;
 //BA.debugLineNum = 88735772;BA.debugLine="Return seeded";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_seeded));return;};
RDebugUtils.currentLine=88735773;
 //BA.debugLineNum = 88735773;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public int  _getconsecutivenetworkerrors(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "getconsecutivenetworkerrors", false))
	 {return ((Integer) Debug.delegate(ba, "getconsecutivenetworkerrors", null));}
RDebugUtils.currentLine=81526784;
 //BA.debugLineNum = 81526784;BA.debugLine="Public Sub GetConsecutiveNetworkErrors As Int";
RDebugUtils.currentLine=81526785;
 //BA.debugLineNum = 81526785;BA.debugLine="Return consecutiveNetworkErrors";
if (true) return __ref._consecutivenetworkerrors /*int*/ ;
RDebugUtils.currentLine=81526786;
 //BA.debugLineNum = 81526786;BA.debugLine="End Sub";
return 0;
}
public long  _getlastdataokat(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "getlastdataokat", false))
	 {return ((Long) Debug.delegate(ba, "getlastdataokat", null));}
RDebugUtils.currentLine=81657856;
 //BA.debugLineNum = 81657856;BA.debugLine="Public Sub GetLastDataOkAt As Long";
RDebugUtils.currentLine=81657857;
 //BA.debugLineNum = 81657857;BA.debugLine="Return dataSuccessAtTicks";
if (true) return __ref._datasuccessatticks /*long*/ ;
RDebugUtils.currentLine=81657858;
 //BA.debugLineNum = 81657858;BA.debugLine="End Sub";
return 0L;
}
public long  _getlasthistoryokat(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "getlasthistoryokat", false))
	 {return ((Long) Debug.delegate(ba, "getlasthistoryokat", null));}
RDebugUtils.currentLine=86048768;
 //BA.debugLineNum = 86048768;BA.debugLine="Public Sub GetLastHistoryOkAt As Long";
RDebugUtils.currentLine=86048769;
 //BA.debugLineNum = 86048769;BA.debugLine="Return historySuccessAtTicks";
if (true) return __ref._historysuccessatticks /*long*/ ;
RDebugUtils.currentLine=86048770;
 //BA.debugLineNum = 86048770;BA.debugLine="End Sub";
return 0L;
}
public String  _applyclientrequestheaders(b4j.example.playerstatestore __ref,b4j.example.httpjob _j) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "applyclientrequestheaders", false))
	 {return ((String) Debug.delegate(ba, "applyclientrequestheaders", new Object[] {_j}));}
RDebugUtils.currentLine=81264640;
 //BA.debugLineNum = 81264640;BA.debugLine="Public Sub ApplyClientRequestHeaders(j As HttpJob)";
RDebugUtils.currentLine=81264641;
 //BA.debugLineNum = 81264641;BA.debugLine="owner.Data_ApplyClientRequestHeaders(j)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_applyclientrequestheaders /*String*/ (null,_j);
RDebugUtils.currentLine=81264642;
 //BA.debugLineNum = 81264642;BA.debugLine="End Sub";
return "";
}
public String  _applytemporarymode(b4j.example.playerstatestore __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "applytemporarymode", false))
	 {return ((String) Debug.delegate(ba, "applytemporarymode", new Object[] {_mode}));}
RDebugUtils.currentLine=83951616;
 //BA.debugLineNum = 83951616;BA.debugLine="Public Sub ApplyTemporaryMode(mode As String)";
RDebugUtils.currentLine=83951617;
 //BA.debugLineNum = 83951617;BA.debugLine="owner.Data_ApplyTemporaryMode(mode)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_applytemporarymode /*String*/ (null,_mode);
RDebugUtils.currentLine=83951618;
 //BA.debugLineNum = 83951618;BA.debugLine="End Sub";
return "";
}
public boolean  _beginofflinedatarefresh(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "beginofflinedatarefresh", false))
	 {return ((Boolean) Debug.delegate(ba, "beginofflinedatarefresh", null));}
RDebugUtils.currentLine=81788928;
 //BA.debugLineNum = 81788928;BA.debugLine="Public Sub BeginOfflineDataRefresh As Boolean";
RDebugUtils.currentLine=81788929;
 //BA.debugLineNum = 81788929;BA.debugLine="Return policyState.BeginOfflineDataRefresh";
if (true) return __ref._policystate /*b4j.example.playbackdatapolicystate*/ ._beginofflinedatarefresh /*boolean*/ (null);
RDebugUtils.currentLine=81788930;
 //BA.debugLineNum = 81788930;BA.debugLine="End Sub";
return false;
}
public String  _builddataslotkey(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _currentslot) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "builddataslotkey", false))
	 {return ((String) Debug.delegate(ba, "builddataslotkey", new Object[] {_currentslot}));}
RDebugUtils.currentLine=88276992;
 //BA.debugLineNum = 88276992;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
RDebugUtils.currentLine=88276993;
 //BA.debugLineNum = 88276993;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
if (true) return BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=88276994;
 //BA.debugLineNum = 88276994;BA.debugLine="End Sub";
return "";
}
public String  _buildqueuesignature(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "buildqueuesignature", false))
	 {return ((String) Debug.delegate(ba, "buildqueuesignature", null));}
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.List _signatureparts = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlist = null;
RDebugUtils.currentLine=87949312;
 //BA.debugLineNum = 87949312;BA.debugLine="Public Sub BuildQueueSignature As String";
RDebugUtils.currentLine=87949313;
 //BA.debugLineNum = 87949313;BA.debugLine="If OfflineData.IsInitialized = False Then Return";
if (__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null).IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=87949314;
 //BA.debugLineNum = 87949314;BA.debugLine="Dim currentSlot As Map = dataResolverRef.ResolveD";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._effectivenowticks /*long*/ (null));
RDebugUtils.currentLine=87949315;
 //BA.debugLineNum = 87949315;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=87949316;
 //BA.debugLineNum = 87949316;BA.debugLine="Dim signatureParts As List";
_signatureparts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=87949317;
 //BA.debugLineNum = 87949317;BA.debugLine="signatureParts.Initialize";
_signatureparts.Initialize();
RDebugUtils.currentLine=87949318;
 //BA.debugLineNum = 87949318;BA.debugLine="signatureParts.Add(\"v=4\")";
_signatureparts.Add((Object)("v=4"));
RDebugUtils.currentLine=87949319;
 //BA.debugLineNum = 87949319;BA.debugLine="signatureParts.Add(\"slot=\" & BuildDataSlotKey(cur";
_signatureparts.Add((Object)("slot="+__ref._builddataslotkey /*String*/ (null,_currentslot)));
RDebugUtils.currentLine=87949320;
 //BA.debugLineNum = 87949320;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=87949321;
 //BA.debugLineNum = 87949321;BA.debugLine="If playlists.IsInitialized Then";
if (_playlists.IsInitialized()) { 
RDebugUtils.currentLine=87949322;
 //BA.debugLineNum = 87949322;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group10 = _playlists;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_playlistobject = group10.Get(index10);
RDebugUtils.currentLine=87949323;
 //BA.debugLineNum = 87949323;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=87949324;
 //BA.debugLineNum = 87949324;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=87949325;
 //BA.debugLineNum = 87949325;BA.debugLine="signatureParts.Add(\"playlist=\" & playlist.GetD";
_signatureparts.Add((Object)("playlist="+BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")))+":"+BA.ObjectToString(_playlist.GetDefault((Object)("updated"),(Object)("")))));
 };
 }
};
 };
RDebugUtils.currentLine=87949329;
 //BA.debugLineNum = 87949329;BA.debugLine="signatureParts.Sort(True)";
_signatureparts.Sort(__c.True);
RDebugUtils.currentLine=87949330;
 //BA.debugLineNum = 87949330;BA.debugLine="Return JoinList(signatureParts, \"|\")";
if (true) return __ref._joinlist /*String*/ (null,_signatureparts,"|");
RDebugUtils.currentLine=87949331;
 //BA.debugLineNum = 87949331;BA.debugLine="End Sub";
return "";
}
public long  _effectivenowticks(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "effectivenowticks", false))
	 {return ((Long) Debug.delegate(ba, "effectivenowticks", null));}
long _devicenow = 0L;
long _trustednow = 0L;
RDebugUtils.currentLine=83034112;
 //BA.debugLineNum = 83034112;BA.debugLine="Public Sub EffectiveNowTicks As Long";
RDebugUtils.currentLine=83034113;
 //BA.debugLineNum = 83034113;BA.debugLine="Dim deviceNow As Long = DateTime.Now";
_devicenow = __c.DateTime.getNow();
RDebugUtils.currentLine=83034114;
 //BA.debugLineNum = 83034114;BA.debugLine="Dim trustedNow As Long = storageRef.GetDefault(tr";
_trustednow = BA.ObjectToLongNumber(__ref._storageref /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,__ref._trustedsynctimekeyvalue /*String*/ ,(Object)(0)));
RDebugUtils.currentLine=83034115;
 //BA.debugLineNum = 83034115;BA.debugLine="If trustedNow > deviceNow Then Return trustedNow";
if (_trustednow>_devicenow) { 
if (true) return _trustednow;};
RDebugUtils.currentLine=83034116;
 //BA.debugLineNum = 83034116;BA.debugLine="Return deviceNow";
if (true) return _devicenow;
RDebugUtils.currentLine=83034117;
 //BA.debugLineNum = 83034117;BA.debugLine="End Sub";
return 0L;
}
public String  _joinlist(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=88408064;
 //BA.debugLineNum = 88408064;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=88408065;
 //BA.debugLineNum = 88408065;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=88408066;
 //BA.debugLineNum = 88408066;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=88408067;
 //BA.debugLineNum = 88408067;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=88408068;
 //BA.debugLineNum = 88408068;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=88408069;
 //BA.debugLineNum = 88408069;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=88408071;
 //BA.debugLineNum = 88408071;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=88408072;
 //BA.debugLineNum = 88408072;BA.debugLine="End Sub";
return "";
}
public boolean  _isvaliddatatrackitem(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isvaliddatatrackitem", false))
	 {return ((Boolean) Debug.delegate(ba, "isvaliddatatrackitem", new Object[] {_item}));}
RDebugUtils.currentLine=88211456;
 //BA.debugLineNum = 88211456;BA.debugLine="Private Sub IsValidDataTrackItem(item As Map) As B";
RDebugUtils.currentLine=88211457;
 //BA.debugLineNum = 88211457;BA.debugLine="If item.IsInitialized = False Or item.Size = 0 Th";
if (_item.IsInitialized()==__c.False || _item.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=88211458;
 //BA.debugLineNum = 88211458;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=88211459;
 //BA.debugLineNum = 88211459;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return Fal";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return __c.False;};
RDebugUtils.currentLine=88211460;
 //BA.debugLineNum = 88211460;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=88211461;
 //BA.debugLineNum = 88211461;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
RDebugUtils.currentLine=88342528;
 //BA.debugLineNum = 88342528;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=88342529;
 //BA.debugLineNum = 88342529;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=88342530;
 //BA.debugLineNum = 88342530;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
RDebugUtils.currentLine=88342531;
 //BA.debugLineNum = 88342531;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
RDebugUtils.currentLine=88342532;
 //BA.debugLineNum = 88342532;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=88342533;
 //BA.debugLineNum = 88342533;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=88342535;
 //BA.debugLineNum = 88342535;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
RDebugUtils.currentLine=88342536;
 //BA.debugLineNum = 88342536;BA.debugLine="End Sub";
return null;
}
public String  _tracelog(b4j.example.playerstatestore __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "tracelog", false))
	 {return ((String) Debug.delegate(ba, "tracelog", new Object[] {_message}));}
RDebugUtils.currentLine=81002496;
 //BA.debugLineNum = 81002496;BA.debugLine="Public Sub TraceLog(message As String)";
RDebugUtils.currentLine=81002497;
 //BA.debugLineNum = 81002497;BA.debugLine="owner.Data_TraceLog(message)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_tracelog /*String*/ (null,_message);
RDebugUtils.currentLine=81002498;
 //BA.debugLineNum = 81002498;BA.debugLine="End Sub";
return "";
}
public String  _claimurlvalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "claimurlvalue", false))
	 {return ((String) Debug.delegate(ba, "claimurlvalue", null));}
RDebugUtils.currentLine=80871424;
 //BA.debugLineNum = 80871424;BA.debugLine="Public Sub ClaimUrlValue As String";
RDebugUtils.currentLine=80871425;
 //BA.debugLineNum = 80871425;BA.debugLine="Return owner.ClaimUrlValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._claimurlvalue /*String*/ (null);
RDebugUtils.currentLine=80871426;
 //BA.debugLineNum = 80871426;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
RDebugUtils.currentLine=80281600;
 //BA.debugLineNum = 80281600;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=80281601;
 //BA.debugLineNum = 80281601;BA.debugLine="Private owner As B4XMainPage";
_owner = new b4j.example.b4xmainpage();
RDebugUtils.currentLine=80281602;
 //BA.debugLineNum = 80281602;BA.debugLine="Private policyState As PlaybackDataPolicyState";
_policystate = new b4j.example.playbackdatapolicystate();
RDebugUtils.currentLine=80281603;
 //BA.debugLineNum = 80281603;BA.debugLine="Private orchestrationStateRef As PlaybackOrchestr";
_orchestrationstateref = new b4j.example.playbackorchestrationstate();
RDebugUtils.currentLine=80281604;
 //BA.debugLineNum = 80281604;BA.debugLine="Private retryFallbackStateRef As PlaybackRetryFal";
_retryfallbackstateref = new b4j.example.playbackretryfallbackstate();
RDebugUtils.currentLine=80281605;
 //BA.debugLineNum = 80281605;BA.debugLine="Private queueStateRef As PlaybackQueueState";
_queuestateref = new b4j.example.playbackqueuestate();
RDebugUtils.currentLine=80281606;
 //BA.debugLineNum = 80281606;BA.debugLine="Private queueBuilderRef As PlaybackQueueBuilder";
_queuebuilderref = new b4j.example.playbackqueuebuilder();
RDebugUtils.currentLine=80281607;
 //BA.debugLineNum = 80281607;BA.debugLine="Private offlineStoreRef As OfflineStore";
_offlinestoreref = new b4j.example.offlinestore();
RDebugUtils.currentLine=80281608;
 //BA.debugLineNum = 80281608;BA.debugLine="Private dataResolverRef As DataPlaybackResolver";
_dataresolverref = new b4j.example.dataplaybackresolver();
RDebugUtils.currentLine=80281609;
 //BA.debugLineNum = 80281609;BA.debugLine="Private mediaCacheRef As MediaCache";
_mediacacheref = new b4j.example.mediacache();
RDebugUtils.currentLine=80281610;
 //BA.debugLineNum = 80281610;BA.debugLine="Private storageRef As KeyValueStore";
_storageref = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=80281611;
 //BA.debugLineNum = 80281611;BA.debugLine="Private trustedSyncTimeKeyValue As String";
_trustedsynctimekeyvalue = "";
RDebugUtils.currentLine=80281612;
 //BA.debugLineNum = 80281612;BA.debugLine="Private retryTimerRef As Timer";
_retrytimerref = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=80281613;
 //BA.debugLineNum = 80281613;BA.debugLine="Private offlineDataRef As Map";
_offlinedataref = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=80281614;
 //BA.debugLineNum = 80281614;BA.debugLine="Private consecutiveNetworkErrors As Int";
_consecutivenetworkerrors = 0;
RDebugUtils.currentLine=80281615;
 //BA.debugLineNum = 80281615;BA.debugLine="Private lastRetryMode As String";
_lastretrymode = "";
RDebugUtils.currentLine=80281616;
 //BA.debugLineNum = 80281616;BA.debugLine="Private dataSuccessAtTicks As Long";
_datasuccessatticks = 0L;
RDebugUtils.currentLine=80281617;
 //BA.debugLineNum = 80281617;BA.debugLine="Private historySuccessAtTicks As Long";
_historysuccessatticks = 0L;
RDebugUtils.currentLine=80281618;
 //BA.debugLineNum = 80281618;BA.debugLine="Private startupSequenceInProgress As Boolean";
_startupsequenceinprogress = false;
RDebugUtils.currentLine=80281619;
 //BA.debugLineNum = 80281619;BA.debugLine="Private adWarmupDeferredAfterStartup As Boolean";
_adwarmupdeferredafterstartup = false;
RDebugUtils.currentLine=80281620;
 //BA.debugLineNum = 80281620;BA.debugLine="End Sub";
return "";
}
public String  _clearplaybackstate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clearplaybackstate", false))
	 {return ((String) Debug.delegate(ba, "clearplaybackstate", null));}
RDebugUtils.currentLine=84017152;
 //BA.debugLineNum = 84017152;BA.debugLine="Public Sub ClearPlaybackState";
RDebugUtils.currentLine=84017153;
 //BA.debugLineNum = 84017153;BA.debugLine="owner.Data_ClearPlaybackState";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=84017154;
 //BA.debugLineNum = 84017154;BA.debugLine="End Sub";
return "";
}
public String  _clearpolicypause(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clearpolicypause", false))
	 {return ((String) Debug.delegate(ba, "clearpolicypause", null));}
RDebugUtils.currentLine=83755008;
 //BA.debugLineNum = 83755008;BA.debugLine="Public Sub ClearPolicyPause";
RDebugUtils.currentLine=83755009;
 //BA.debugLineNum = 83755009;BA.debugLine="owner.Data_ClearPolicyPause";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=83755010;
 //BA.debugLineNum = 83755010;BA.debugLine="End Sub";
return "";
}
public String  _clearpolicypauseandresumerequest(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clearpolicypauseandresumerequest", false))
	 {return ((String) Debug.delegate(ba, "clearpolicypauseandresumerequest", null));}
RDebugUtils.currentLine=84410368;
 //BA.debugLineNum = 84410368;BA.debugLine="Public Sub ClearPolicyPauseAndResumeRequest";
RDebugUtils.currentLine=84410369;
 //BA.debugLineNum = 84410369;BA.debugLine="owner.Data_ClearPolicyPauseAndResumeRequest";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=84410370;
 //BA.debugLineNum = 84410370;BA.debugLine="End Sub";
return "";
}
public String  _clearresumeplaybackwhenserverallows(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clearresumeplaybackwhenserverallows", false))
	 {return ((String) Debug.delegate(ba, "clearresumeplaybackwhenserverallows", null));}
RDebugUtils.currentLine=82182144;
 //BA.debugLineNum = 82182144;BA.debugLine="Public Sub ClearResumePlaybackWhenServerAllows";
RDebugUtils.currentLine=82182145;
 //BA.debugLineNum = 82182145;BA.debugLine="policyState.ResumePlaybackWhenServerAllows = Fals";
__ref._policystate /*b4j.example.playbackdatapolicystate*/ ._resumeplaybackwhenserverallows /*boolean*/  = __c.False;
RDebugUtils.currentLine=82182146;
 //BA.debugLineNum = 82182146;BA.debugLine="End Sub";
return "";
}
public String  _clearretrytimer(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clearretrytimer", false))
	 {return ((String) Debug.delegate(ba, "clearretrytimer", null));}
RDebugUtils.currentLine=85065728;
 //BA.debugLineNum = 85065728;BA.debugLine="Public Sub ClearRetryTimer";
RDebugUtils.currentLine=85065729;
 //BA.debugLineNum = 85065729;BA.debugLine="retryTimerRef.Enabled = False";
__ref._retrytimerref /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=85065730;
 //BA.debugLineNum = 85065730;BA.debugLine="ClearLastRetryMode";
__ref._clearlastretrymode /*String*/ (null);
RDebugUtils.currentLine=85065731;
 //BA.debugLineNum = 85065731;BA.debugLine="End Sub";
return "";
}
public String  _clientosnamevalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "clientosnamevalue", false))
	 {return ((String) Debug.delegate(ba, "clientosnamevalue", null));}
RDebugUtils.currentLine=80609280;
 //BA.debugLineNum = 80609280;BA.debugLine="Public Sub ClientOsNameValue As String";
RDebugUtils.currentLine=80609281;
 //BA.debugLineNum = 80609281;BA.debugLine="Return owner.ClientOsNameValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._clientosnamevalue /*String*/ (null);
RDebugUtils.currentLine=80609282;
 //BA.debugLineNum = 80609282;BA.debugLine="End Sub";
return "";
}
public String  _consumelastexception(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "consumelastexception", false))
	 {return ((String) Debug.delegate(ba, "consumelastexception", null));}
RDebugUtils.currentLine=81199104;
 //BA.debugLineNum = 81199104;BA.debugLine="Public Sub ConsumeLastException";
RDebugUtils.currentLine=81199105;
 //BA.debugLineNum = 81199105;BA.debugLine="owner.Data_ConsumeLastException";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_consumelastexception /*String*/ (null);
RDebugUtils.currentLine=81199106;
 //BA.debugLineNum = 81199106;BA.debugLine="End Sub";
return "";
}
public String  _dataurlvalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "dataurlvalue", false))
	 {return ((String) Debug.delegate(ba, "dataurlvalue", null));}
RDebugUtils.currentLine=80740352;
 //BA.debugLineNum = 80740352;BA.debugLine="Public Sub DataUrlValue As String";
RDebugUtils.currentLine=80740353;
 //BA.debugLineNum = 80740353;BA.debugLine="Return owner.DataUrlValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._dataurlvalue /*String*/ (null);
RDebugUtils.currentLine=80740354;
 //BA.debugLineNum = 80740354;BA.debugLine="End Sub";
return "";
}
public String  _deferadwarmupafterstartup(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "deferadwarmupafterstartup", false))
	 {return ((String) Debug.delegate(ba, "deferadwarmupafterstartup", null));}
RDebugUtils.currentLine=82903040;
 //BA.debugLineNum = 82903040;BA.debugLine="Public Sub DeferAdWarmupAfterStartup";
RDebugUtils.currentLine=82903041;
 //BA.debugLineNum = 82903041;BA.debugLine="adWarmupDeferredAfterStartup = True";
__ref._adwarmupdeferredafterstartup /*boolean*/  = __c.True;
RDebugUtils.currentLine=82903042;
 //BA.debugLineNum = 82903042;BA.debugLine="End Sub";
return "";
}
public String  _deviceidvalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "deviceidvalue", false))
	 {return ((String) Debug.delegate(ba, "deviceidvalue", null));}
RDebugUtils.currentLine=80478208;
 //BA.debugLineNum = 80478208;BA.debugLine="Public Sub DeviceIdValue As String";
RDebugUtils.currentLine=80478209;
 //BA.debugLineNum = 80478209;BA.debugLine="Return owner.DeviceIdValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._deviceidvalue /*String*/ (null);
RDebugUtils.currentLine=80478210;
 //BA.debugLineNum = 80478210;BA.debugLine="End Sub";
return "";
}
public String  _disablebackgroundrefreshtimers(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "disablebackgroundrefreshtimers", false))
	 {return ((String) Debug.delegate(ba, "disablebackgroundrefreshtimers", null));}
RDebugUtils.currentLine=84934656;
 //BA.debugLineNum = 84934656;BA.debugLine="Public Sub DisableBackgroundRefreshTimers";
RDebugUtils.currentLine=84934657;
 //BA.debugLineNum = 84934657;BA.debugLine="owner.Data_DisableBackgroundRefreshTimers";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_disablebackgroundrefreshtimers /*String*/ (null);
RDebugUtils.currentLine=84934658;
 //BA.debugLineNum = 84934658;BA.debugLine="End Sub";
return "";
}
public String  _enableretrytimer(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "enableretrytimer", false))
	 {return ((String) Debug.delegate(ba, "enableretrytimer", null));}
RDebugUtils.currentLine=85393408;
 //BA.debugLineNum = 85393408;BA.debugLine="Public Sub EnableRetryTimer";
RDebugUtils.currentLine=85393409;
 //BA.debugLineNum = 85393409;BA.debugLine="retryTimerRef.Enabled = True";
__ref._retrytimerref /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=85393410;
 //BA.debugLineNum = 85393410;BA.debugLine="End Sub";
return "";
}
public String  _endofflinedatarefresh(b4j.example.playerstatestore __ref,String _statevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "endofflinedatarefresh", false))
	 {return ((String) Debug.delegate(ba, "endofflinedatarefresh", new Object[] {_statevalue}));}
RDebugUtils.currentLine=81854464;
 //BA.debugLineNum = 81854464;BA.debugLine="Public Sub EndOfflineDataRefresh(stateValue As Str";
RDebugUtils.currentLine=81854465;
 //BA.debugLineNum = 81854465;BA.debugLine="policyState.EndOfflineDataRefresh(stateValue)";
__ref._policystate /*b4j.example.playbackdatapolicystate*/ ._endofflinedatarefresh /*String*/ (null,_statevalue);
RDebugUtils.currentLine=81854466;
 //BA.debugLineNum = 81854466;BA.debugLine="End Sub";
return "";
}
public String  _ensureadcachesyncasync(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "ensureadcachesyncasync", false))
	 {return ((String) Debug.delegate(ba, "ensureadcachesyncasync", null));}
RDebugUtils.currentLine=82968576;
 //BA.debugLineNum = 82968576;BA.debugLine="Public Sub EnsureAdCacheSyncAsync";
RDebugUtils.currentLine=82968577;
 //BA.debugLineNum = 82968577;BA.debugLine="owner.Data_EnsureAdCacheSyncAsync";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_ensureadcachesyncasync /*String*/ (null);
RDebugUtils.currentLine=82968578;
 //BA.debugLineNum = 82968578;BA.debugLine="End Sub";
return "";
}
public String  _enterlocalplayback(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "enterlocalplayback", false))
	 {return ((String) Debug.delegate(ba, "enterlocalplayback", null));}
RDebugUtils.currentLine=84606976;
 //BA.debugLineNum = 84606976;BA.debugLine="Public Sub EnterLocalPlayback";
RDebugUtils.currentLine=84606977;
 //BA.debugLineNum = 84606977;BA.debugLine="owner.Data_EnterLocalPlayback";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_enterlocalplayback /*String*/ (null);
RDebugUtils.currentLine=84606978;
 //BA.debugLineNum = 84606978;BA.debugLine="End Sub";
return "";
}
public String  _enterpolicypause(b4j.example.playerstatestore __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "enterpolicypause", false))
	 {return ((String) Debug.delegate(ba, "enterpolicypause", new Object[] {_reason,_connectionmode}));}
RDebugUtils.currentLine=84279296;
 //BA.debugLineNum = 84279296;BA.debugLine="Public Sub EnterPolicyPause(reason As String, conn";
RDebugUtils.currentLine=84279297;
 //BA.debugLineNum = 84279297;BA.debugLine="owner.Data_EnterPolicyPause(reason, connectionMod";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_enterpolicypause /*String*/ (null,_reason,_connectionmode);
RDebugUtils.currentLine=84279298;
 //BA.debugLineNum = 84279298;BA.debugLine="End Sub";
return "";
}
public String  _enterstartedstate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "enterstartedstate", false))
	 {return ((String) Debug.delegate(ba, "enterstartedstate", null));}
RDebugUtils.currentLine=83492864;
 //BA.debugLineNum = 83492864;BA.debugLine="Public Sub EnterStartedState";
RDebugUtils.currentLine=83492865;
 //BA.debugLineNum = 83492865;BA.debugLine="orchestrationStateRef.EnterStartedState";
__ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=83492866;
 //BA.debugLineNum = 83492866;BA.debugLine="End Sub";
return "";
}
public String  _enteruserstoppedstate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "enteruserstoppedstate", false))
	 {return ((String) Debug.delegate(ba, "enteruserstoppedstate", null));}
RDebugUtils.currentLine=84475904;
 //BA.debugLineNum = 84475904;BA.debugLine="Public Sub EnterUserStoppedState";
RDebugUtils.currentLine=84475905;
 //BA.debugLineNum = 84475905;BA.debugLine="owner.Data_EnterUserStoppedState";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=84475906;
 //BA.debugLineNum = 84475906;BA.debugLine="End Sub";
return "";
}
public String  _flushtracebufferasync(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "flushtracebufferasync", false))
	 {return ((String) Debug.delegate(ba, "flushtracebufferasync", null));}
RDebugUtils.currentLine=82575360;
 //BA.debugLineNum = 82575360;BA.debugLine="Public Sub FlushTraceBufferAsync";
RDebugUtils.currentLine=82575361;
 //BA.debugLineNum = 82575361;BA.debugLine="owner.Data_FlushTraceBufferAsync";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_flushtracebufferasync /*String*/ (null);
RDebugUtils.currentLine=82575362;
 //BA.debugLineNum = 82575362;BA.debugLine="End Sub";
return "";
}
public int  _getretryinterval(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "getretryinterval", false))
	 {return ((Integer) Debug.delegate(ba, "getretryinterval", null));}
RDebugUtils.currentLine=85262336;
 //BA.debugLineNum = 85262336;BA.debugLine="Public Sub GetRetryInterval As Int";
RDebugUtils.currentLine=85262337;
 //BA.debugLineNum = 85262337;BA.debugLine="Return retryTimerRef.Interval";
if (true) return (int) (__ref._retrytimerref /*anywheresoftware.b4a.objects.Timer*/ .getInterval());
RDebugUtils.currentLine=85262338;
 //BA.debugLineNum = 85262338;BA.debugLine="End Sub";
return 0;
}
public String  _handlemessageitem(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "handlemessageitem", false))
	 {return ((String) Debug.delegate(ba, "handlemessageitem", new Object[] {_item}));}
RDebugUtils.currentLine=83820544;
 //BA.debugLineNum = 83820544;BA.debugLine="Public Sub HandleMessageItem(item As Map)";
RDebugUtils.currentLine=83820545;
 //BA.debugLineNum = 83820545;BA.debugLine="owner.Data_HandleMessageItem(item)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_handlemessageitem /*String*/ (null,_item);
RDebugUtils.currentLine=83820546;
 //BA.debugLineNum = 83820546;BA.debugLine="End Sub";
return "";
}
public boolean  _haslocalplaybackfallback(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "haslocalplaybackfallback", false))
	 {return ((Boolean) Debug.delegate(ba, "haslocalplaybackfallback", null));}
RDebugUtils.currentLine=84803584;
 //BA.debugLineNum = 84803584;BA.debugLine="Public Sub HasLocalPlaybackFallback As Boolean";
RDebugUtils.currentLine=84803585;
 //BA.debugLineNum = 84803585;BA.debugLine="Return owner.Data_HasLocalPlaybackFallback";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._data_haslocalplaybackfallback /*boolean*/ (null);
RDebugUtils.currentLine=84803586;
 //BA.debugLineNum = 84803586;BA.debugLine="End Sub";
return false;
}
public String  _hidecontentblocks(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "hidecontentblocks", false))
	 {return ((String) Debug.delegate(ba, "hidecontentblocks", null));}
RDebugUtils.currentLine=83623936;
 //BA.debugLineNum = 83623936;BA.debugLine="Public Sub HideContentBlocks";
RDebugUtils.currentLine=83623937;
 //BA.debugLineNum = 83623937;BA.debugLine="owner.Data_HideContentBlocks";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=83623938;
 //BA.debugLineNum = 83623938;BA.debugLine="End Sub";
return "";
}
public String  _hidepin(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "hidepin", false))
	 {return ((String) Debug.delegate(ba, "hidepin", null));}
RDebugUtils.currentLine=84082688;
 //BA.debugLineNum = 84082688;BA.debugLine="Public Sub HidePin";
RDebugUtils.currentLine=84082689;
 //BA.debugLineNum = 84082689;BA.debugLine="owner.Data_HidePin";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_hidepin /*String*/ (null);
RDebugUtils.currentLine=84082690;
 //BA.debugLineNum = 84082690;BA.debugLine="End Sub";
return "";
}
public String  _incrementnetworkerrorcount(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "incrementnetworkerrorcount", false))
	 {return ((String) Debug.delegate(ba, "incrementnetworkerrorcount", null));}
RDebugUtils.currentLine=81395712;
 //BA.debugLineNum = 81395712;BA.debugLine="Public Sub IncrementNetworkErrorCount";
RDebugUtils.currentLine=81395713;
 //BA.debugLineNum = 81395713;BA.debugLine="consecutiveNetworkErrors = consecutiveNetworkErro";
__ref._consecutivenetworkerrors /*int*/  = (int) (__ref._consecutivenetworkerrors /*int*/ +1);
RDebugUtils.currentLine=81395714;
 //BA.debugLineNum = 81395714;BA.debugLine="End Sub";
return "";
}
public String  _invalidaterelevanttrackidscache(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "invalidaterelevanttrackidscache", false))
	 {return ((String) Debug.delegate(ba, "invalidaterelevanttrackidscache", null));}
RDebugUtils.currentLine=82640896;
 //BA.debugLineNum = 82640896;BA.debugLine="Public Sub InvalidateRelevantTrackIdsCache";
RDebugUtils.currentLine=82640897;
 //BA.debugLineNum = 82640897;BA.debugLine="owner.Data_InvalidateRelevantTrackIdsCache";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_invalidaterelevanttrackidscache /*String*/ (null);
RDebugUtils.currentLine=82640898;
 //BA.debugLineNum = 82640898;BA.debugLine="End Sub";
return "";
}
public boolean  _isadwarmupdeferredafterstartup(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isadwarmupdeferredafterstartup", false))
	 {return ((Boolean) Debug.delegate(ba, "isadwarmupdeferredafterstartup", null));}
RDebugUtils.currentLine=86245376;
 //BA.debugLineNum = 86245376;BA.debugLine="Public Sub IsAdWarmupDeferredAfterStartup As Boole";
RDebugUtils.currentLine=86245377;
 //BA.debugLineNum = 86245377;BA.debugLine="Return adWarmupDeferredAfterStartup";
if (true) return __ref._adwarmupdeferredafterstartup /*boolean*/ ;
RDebugUtils.currentLine=86245378;
 //BA.debugLineNum = 86245378;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybackpausedbypolicy(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isplaybackpausedbypolicy", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackpausedbypolicy", null));}
RDebugUtils.currentLine=85327872;
 //BA.debugLineNum = 85327872;BA.debugLine="Public Sub IsPlaybackPausedByPolicy As Boolean";
RDebugUtils.currentLine=85327873;
 //BA.debugLineNum = 85327873;BA.debugLine="Return policyState.IsPlaybackPausedByPolicy";
if (true) return __ref._policystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/ ;
RDebugUtils.currentLine=85327874;
 //BA.debugLineNum = 85327874;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybackstarted(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isplaybackstarted", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackstarted", null));}
RDebugUtils.currentLine=83099648;
 //BA.debugLineNum = 83099648;BA.debugLine="Public Sub IsPlaybackStarted As Boolean";
RDebugUtils.currentLine=83099649;
 //BA.debugLineNum = 83099649;BA.debugLine="Return orchestrationStateRef.IsStarted";
if (true) return __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ;
RDebugUtils.currentLine=83099650;
 //BA.debugLineNum = 83099650;BA.debugLine="End Sub";
return false;
}
public boolean  _ispolicypausestate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "ispolicypausestate", false))
	 {return ((Boolean) Debug.delegate(ba, "ispolicypausestate", null));}
RDebugUtils.currentLine=83296256;
 //BA.debugLineNum = 83296256;BA.debugLine="Public Sub IsPolicyPauseState As Boolean";
RDebugUtils.currentLine=83296257;
 //BA.debugLineNum = 83296257;BA.debugLine="Return policyState.IsPlaybackPausedByPolicy";
if (true) return __ref._policystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/ ;
RDebugUtils.currentLine=83296258;
 //BA.debugLineNum = 83296258;BA.debugLine="End Sub";
return false;
}
public boolean  _isstartupsequenceinprogress(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isstartupsequenceinprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "isstartupsequenceinprogress", null));}
RDebugUtils.currentLine=82837504;
 //BA.debugLineNum = 82837504;BA.debugLine="Public Sub IsStartupSequenceInProgress As Boolean";
RDebugUtils.currentLine=82837505;
 //BA.debugLineNum = 82837505;BA.debugLine="Return startupSequenceInProgress";
if (true) return __ref._startupsequenceinprogress /*boolean*/ ;
RDebugUtils.currentLine=82837506;
 //BA.debugLineNum = 82837506;BA.debugLine="End Sub";
return false;
}
public boolean  _isstoppedbyuser(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isstoppedbyuser", false))
	 {return ((Boolean) Debug.delegate(ba, "isstoppedbyuser", null));}
RDebugUtils.currentLine=83165184;
 //BA.debugLineNum = 83165184;BA.debugLine="Public Sub IsStoppedByUser As Boolean";
RDebugUtils.currentLine=83165185;
 //BA.debugLineNum = 83165185;BA.debugLine="Return orchestrationStateRef.IsStoppedByUser";
if (true) return __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ;
RDebugUtils.currentLine=83165186;
 //BA.debugLineNum = 83165186;BA.debugLine="End Sub";
return false;
}
public boolean  _isstopping(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isstopping", false))
	 {return ((Boolean) Debug.delegate(ba, "isstopping", null));}
RDebugUtils.currentLine=83427328;
 //BA.debugLineNum = 83427328;BA.debugLine="Public Sub IsStopping As Boolean";
RDebugUtils.currentLine=83427329;
 //BA.debugLineNum = 83427329;BA.debugLine="Return orchestrationStateRef.IsStopping";
if (true) return __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ;
RDebugUtils.currentLine=83427330;
 //BA.debugLineNum = 83427330;BA.debugLine="End Sub";
return false;
}
public boolean  _istraceuploadenabled(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "istraceuploadenabled", false))
	 {return ((Boolean) Debug.delegate(ba, "istraceuploadenabled", null));}
anywheresoftware.b4a.objects.collections.Map _snapshot = null;
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
RDebugUtils.currentLine=82509824;
 //BA.debugLineNum = 82509824;BA.debugLine="Public Sub IsTraceUploadEnabled As Boolean";
RDebugUtils.currentLine=82509825;
 //BA.debugLineNum = 82509825;BA.debugLine="Dim snapshot As Map = OfflineData";
_snapshot = new anywheresoftware.b4a.objects.collections.Map();
_snapshot = __ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=82509826;
 //BA.debugLineNum = 82509826;BA.debugLine="If snapshot.IsInitialized = False Then Return Fal";
if (_snapshot.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=82509827;
 //BA.debugLineNum = 82509827;BA.debugLine="If snapshot.GetDefault(\"ok\", False) <> True Then";
if ((_snapshot.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=82509828;
 //BA.debugLineNum = 82509828;BA.debugLine="If snapshot.ContainsKey(\"trace\") Then";
if (_snapshot.ContainsKey((Object)("trace"))) { 
RDebugUtils.currentLine=82509829;
 //BA.debugLineNum = 82509829;BA.debugLine="Return snapshot.GetDefault(\"trace\", False) = Tru";
if (true) return (_snapshot.GetDefault((Object)("trace"),(Object)(__c.False))).equals((Object)(__c.True));
 };
RDebugUtils.currentLine=82509831;
 //BA.debugLineNum = 82509831;BA.debugLine="Dim playerData As Map = snapshot.GetDefault(\"play";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_snapshot.GetDefault((Object)("player"),__c.Null)));
RDebugUtils.currentLine=82509832;
 //BA.debugLineNum = 82509832;BA.debugLine="If playerData.IsInitialized = False Then Return F";
if (_playerdata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=82509833;
 //BA.debugLineNum = 82509833;BA.debugLine="Return playerData.ContainsKey(\"trace\") And player";
if (true) return _playerdata.ContainsKey((Object)("trace")) && (_playerdata.GetDefault((Object)("trace"),(Object)(__c.False))).equals((Object)(__c.True));
RDebugUtils.currentLine=82509834;
 //BA.debugLineNum = 82509834;BA.debugLine="End Sub";
return false;
}
public boolean  _istrackcached(b4j.example.playerstatestore __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "istrackcached", false))
	 {return ((Boolean) Debug.delegate(ba, "istrackcached", new Object[] {_trackid}));}
RDebugUtils.currentLine=85786624;
 //BA.debugLineNum = 85786624;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
RDebugUtils.currentLine=85786625;
 //BA.debugLineNum = 85786625;BA.debugLine="Return mediaCacheRef.IsTrackCached(trackId)";
if (true) return __ref._mediacacheref /*b4j.example.mediacache*/ ._istrackcached /*boolean*/ (null,_trackid);
RDebugUtils.currentLine=85786626;
 //BA.debugLineNum = 85786626;BA.debugLine="End Sub";
return false;
}
public boolean  _isuserstoppedstate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "isuserstoppedstate", false))
	 {return ((Boolean) Debug.delegate(ba, "isuserstoppedstate", null));}
RDebugUtils.currentLine=83230720;
 //BA.debugLineNum = 83230720;BA.debugLine="Public Sub IsUserStoppedState As Boolean";
RDebugUtils.currentLine=83230721;
 //BA.debugLineNum = 83230721;BA.debugLine="Return orchestrationStateRef.IsStarted = False An";
if (true) return __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False && __ref._policystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/ ==__c.False && __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ;
RDebugUtils.currentLine=83230722;
 //BA.debugLineNum = 83230722;BA.debugLine="End Sub";
return false;
}
public String  _lastofflinedatarefreshstate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "lastofflinedatarefreshstate", false))
	 {return ((String) Debug.delegate(ba, "lastofflinedatarefreshstate", null));}
RDebugUtils.currentLine=81985536;
 //BA.debugLineNum = 81985536;BA.debugLine="Public Sub LastOfflineDataRefreshState As String";
RDebugUtils.currentLine=81985537;
 //BA.debugLineNum = 81985537;BA.debugLine="Return policyState.LastOfflineDataRefreshState";
if (true) return __ref._policystate /*b4j.example.playbackdatapolicystate*/ ._lastofflinedatarefreshstate /*String*/ ;
RDebugUtils.currentLine=81985538;
 //BA.debugLineNum = 81985538;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadcachedplaylistmetadata(b4j.example.playerstatestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "loadcachedplaylistmetadata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadcachedplaylistmetadata", new Object[] {_playlistid}));}
RDebugUtils.currentLine=85721088;
 //BA.debugLineNum = 85721088;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
RDebugUtils.currentLine=85721089;
 //BA.debugLineNum = 85721089;BA.debugLine="Return dataResolverRef.LoadCachedPlaylistMetadata";
if (true) return __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=85721090;
 //BA.debugLineNum = 85721090;BA.debugLine="End Sub";
return null;
}
public String  _messagevalue(b4j.example.playerstatestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "messagevalue", false))
	 {return ((String) Debug.delegate(ba, "messagevalue", new Object[] {_key}));}
RDebugUtils.currentLine=80936960;
 //BA.debugLineNum = 80936960;BA.debugLine="Public Sub MessageValue(key As String) As String";
RDebugUtils.currentLine=80936961;
 //BA.debugLineNum = 80936961;BA.debugLine="Return owner.Data_MessageValue(key)";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._data_messagevalue /*String*/ (null,_key);
RDebugUtils.currentLine=80936962;
 //BA.debugLineNum = 80936962;BA.debugLine="End Sub";
return "";
}
public String  _nexturlvalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "nexturlvalue", false))
	 {return ((String) Debug.delegate(ba, "nexturlvalue", null));}
RDebugUtils.currentLine=80805888;
 //BA.debugLineNum = 80805888;BA.debugLine="Public Sub NextUrlValue As String";
RDebugUtils.currentLine=80805889;
 //BA.debugLineNum = 80805889;BA.debugLine="Return owner.NextUrlValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._nexturlvalue /*String*/ (null);
RDebugUtils.currentLine=80805890;
 //BA.debugLineNum = 80805890;BA.debugLine="End Sub";
return "";
}
public String  _playercodevalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "playercodevalue", false))
	 {return ((String) Debug.delegate(ba, "playercodevalue", null));}
RDebugUtils.currentLine=80412672;
 //BA.debugLineNum = 80412672;BA.debugLine="Public Sub PlayerCodeValue As String";
RDebugUtils.currentLine=80412673;
 //BA.debugLineNum = 80412673;BA.debugLine="Return owner.PlayerCodeValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._playercodevalue /*String*/ (null);
RDebugUtils.currentLine=80412674;
 //BA.debugLineNum = 80412674;BA.debugLine="End Sub";
return "";
}
public String  _refreshconnectionindicatorstate(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "refreshconnectionindicatorstate", false))
	 {return ((String) Debug.delegate(ba, "refreshconnectionindicatorstate", null));}
RDebugUtils.currentLine=82706432;
 //BA.debugLineNum = 82706432;BA.debugLine="Public Sub RefreshConnectionIndicatorState";
RDebugUtils.currentLine=82706433;
 //BA.debugLineNum = 82706433;BA.debugLine="owner.Data_RefreshConnectionIndicatorState";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=82706434;
 //BA.debugLineNum = 82706434;BA.debugLine="End Sub";
return "";
}
public String  _resetconsecutivenetworkerrors(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resetconsecutivenetworkerrors", false))
	 {return ((String) Debug.delegate(ba, "resetconsecutivenetworkerrors", null));}
RDebugUtils.currentLine=81461248;
 //BA.debugLineNum = 81461248;BA.debugLine="Public Sub ResetConsecutiveNetworkErrors";
RDebugUtils.currentLine=81461249;
 //BA.debugLineNum = 81461249;BA.debugLine="consecutiveNetworkErrors = 0";
__ref._consecutivenetworkerrors /*int*/  = (int) (0);
RDebugUtils.currentLine=81461250;
 //BA.debugLineNum = 81461250;BA.debugLine="End Sub";
return "";
}
public String  _resetretrydelaystate(b4j.example.playerstatestore __ref,int _localretryinitial,int _serverretryinitial) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resetretrydelaystate", false))
	 {return ((String) Debug.delegate(ba, "resetretrydelaystate", new Object[] {_localretryinitial,_serverretryinitial}));}
RDebugUtils.currentLine=85458944;
 //BA.debugLineNum = 85458944;BA.debugLine="Public Sub ResetRetryDelayState(localRetryInitial";
RDebugUtils.currentLine=85458945;
 //BA.debugLineNum = 85458945;BA.debugLine="retryFallbackStateRef.ResetRetryDelays(localRetry";
__ref._retryfallbackstateref /*b4j.example.playbackretryfallbackstate*/ ._resetretrydelays /*String*/ (null,_localretryinitial,_serverretryinitial);
RDebugUtils.currentLine=85458946;
 //BA.debugLineNum = 85458946;BA.debugLine="If GetConsecutiveNetworkErrors > 0 Then TraceInfo";
if (__ref._getconsecutivenetworkerrors /*int*/ (null)>0) { 
__ref._traceinfo /*String*/ (null,"network","retry сброшен","errors="+BA.NumberToString(__ref._getconsecutivenetworkerrors /*int*/ (null)));};
RDebugUtils.currentLine=85458947;
 //BA.debugLineNum = 85458947;BA.debugLine="ResetConsecutiveNetworkErrors";
__ref._resetconsecutivenetworkerrors /*String*/ (null);
RDebugUtils.currentLine=85458948;
 //BA.debugLineNum = 85458948;BA.debugLine="End Sub";
return "";
}
public String  _traceinfo(b4j.example.playerstatestore __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "traceinfo", false))
	 {return ((String) Debug.delegate(ba, "traceinfo", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=81068032;
 //BA.debugLineNum = 81068032;BA.debugLine="Public Sub TraceInfo(category As String, message A";
RDebugUtils.currentLine=81068033;
 //BA.debugLineNum = 81068033;BA.debugLine="owner.Data_TraceInfo(category, message, details)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_traceinfo /*String*/ (null,_category,_message,_details);
RDebugUtils.currentLine=81068034;
 //BA.debugLineNum = 81068034;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolvecurrentdataslot(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resolvecurrentdataslot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvecurrentdataslot", new Object[] {_data}));}
RDebugUtils.currentLine=85590016;
 //BA.debugLineNum = 85590016;BA.debugLine="Public Sub ResolveCurrentDataSlot(data As Map) As";
RDebugUtils.currentLine=85590017;
 //BA.debugLineNum = 85590017;BA.debugLine="Return dataResolverRef.ResolveCurrentDataSlot(dat";
if (true) return __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._resolvecurrentdataslot /*anywheresoftware.b4a.objects.collections.Map*/ (null,_data);
RDebugUtils.currentLine=85590018;
 //BA.debugLineNum = 85590018;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvedataslotatticks(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _data,long _targetticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resolvedataslotatticks", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvedataslotatticks", new Object[] {_data,_targetticks}));}
RDebugUtils.currentLine=85524480;
 //BA.debugLineNum = 85524480;BA.debugLine="Public Sub ResolveDataSlotAtTicks(data As Map, tar";
RDebugUtils.currentLine=85524481;
 //BA.debugLineNum = 85524481;BA.debugLine="Return dataResolverRef.ResolveDataSlotAtTicks(dat";
if (true) return __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_data,_targetticks);
RDebugUtils.currentLine=85524482;
 //BA.debugLineNum = 85524482;BA.debugLine="End Sub";
return null;
}
public String  _resolveidleuntilmessage(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _data,long _targetticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resolveidleuntilmessage", false))
	 {return ((String) Debug.delegate(ba, "resolveidleuntilmessage", new Object[] {_data,_targetticks}));}
RDebugUtils.currentLine=89194496;
 //BA.debugLineNum = 89194496;BA.debugLine="Public Sub ResolveIdleUntilMessage(data As Map, ta";
RDebugUtils.currentLine=89194497;
 //BA.debugLineNum = 89194497;BA.debugLine="Return owner.Data_ResolveIdleUntilMessage(data, t";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._data_resolveidleuntilmessage /*String*/ (null,_data,_targetticks);
RDebugUtils.currentLine=89194498;
 //BA.debugLineNum = 89194498;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextdataslotatticks(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _data,long _targetticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resolvenextdataslotatticks", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvenextdataslotatticks", new Object[] {_data,_targetticks}));}
RDebugUtils.currentLine=85655552;
 //BA.debugLineNum = 85655552;BA.debugLine="Public Sub ResolveNextDataSlotAtTicks(data As Map,";
RDebugUtils.currentLine=85655553;
 //BA.debugLineNum = 85655553;BA.debugLine="Return dataResolverRef.ResolveNextDataSlotAtTicks";
if (true) return __ref._dataresolverref /*b4j.example.dataplaybackresolver*/ ._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_data,_targetticks);
RDebugUtils.currentLine=85655554;
 //BA.debugLineNum = 85655554;BA.debugLine="End Sub";
return null;
}
public int  _resolveretrydelay(b4j.example.playerstatestore __ref,String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resolveretrydelay", false))
	 {return ((Integer) Debug.delegate(ba, "resolveretrydelay", new Object[] {_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay}));}
RDebugUtils.currentLine=85000192;
 //BA.debugLineNum = 85000192;BA.debugLine="Public Sub ResolveRetryDelay(mode As String, delay";
RDebugUtils.currentLine=85000193;
 //BA.debugLineNum = 85000193;BA.debugLine="Return retryFallbackStateRef.ResolveRetryDelay(mo";
if (true) return __ref._retryfallbackstateref /*b4j.example.playbackretryfallbackstate*/ ._resolveretrydelay /*int*/ (null,_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay);
RDebugUtils.currentLine=85000194;
 //BA.debugLineNum = 85000194;BA.debugLine="End Sub";
return 0;
}
public String  _resumeplaybackafterpolicypauseasync(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resumeplaybackafterpolicypauseasync", false))
	 {return ((String) Debug.delegate(ba, "resumeplaybackafterpolicypauseasync", null));}
RDebugUtils.currentLine=83689472;
 //BA.debugLineNum = 83689472;BA.debugLine="Public Sub ResumePlaybackAfterPolicyPauseAsync";
RDebugUtils.currentLine=83689473;
 //BA.debugLineNum = 83689473;BA.debugLine="owner.Data_ResumePlaybackAfterPolicyPauseAsync";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_resumeplaybackafterpolicypauseasync /*String*/ (null);
RDebugUtils.currentLine=83689474;
 //BA.debugLineNum = 83689474;BA.debugLine="End Sub";
return "";
}
public boolean  _resumeplaybackwhenserverallows(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "resumeplaybackwhenserverallows", false))
	 {return ((Boolean) Debug.delegate(ba, "resumeplaybackwhenserverallows", null));}
RDebugUtils.currentLine=82116608;
 //BA.debugLineNum = 82116608;BA.debugLine="Public Sub ResumePlaybackWhenServerAllows As Boole";
RDebugUtils.currentLine=82116609;
 //BA.debugLineNum = 82116609;BA.debugLine="Return policyState.ResumePlaybackWhenServerAllows";
if (true) return __ref._policystate /*b4j.example.playbackdatapolicystate*/ ._resumeplaybackwhenserverallows /*boolean*/ ;
RDebugUtils.currentLine=82116610;
 //BA.debugLineNum = 82116610;BA.debugLine="End Sub";
return false;
}
public String  _saveofflinedata(b4j.example.playerstatestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "saveofflinedata", false))
	 {return ((String) Debug.delegate(ba, "saveofflinedata", new Object[] {_data}));}
RDebugUtils.currentLine=82378752;
 //BA.debugLineNum = 82378752;BA.debugLine="Public Sub SaveOfflineData(data As Map)";
RDebugUtils.currentLine=82378753;
 //BA.debugLineNum = 82378753;BA.debugLine="offlineDataRef = offlineStoreRef.SaveOfflineData(";
__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._offlinestoreref /*b4j.example.offlinestore*/ ._saveofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_data,__ref._playercodevalue /*String*/ (null),__ref._deviceidvalue /*String*/ (null));
RDebugUtils.currentLine=82378754;
 //BA.debugLineNum = 82378754;BA.debugLine="If offlineDataRef.IsInitialized = False Then offl";
if (__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._offlinedataref /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=82378755;
 //BA.debugLineNum = 82378755;BA.debugLine="End Sub";
return "";
}
public String  _saveserversnapshot(b4j.example.playerstatestore __ref,String _method,String _url,boolean _success,String _body,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "saveserversnapshot", false))
	 {return ((String) Debug.delegate(ba, "saveserversnapshot", new Object[] {_method,_url,_success,_body,_errormessage}));}
RDebugUtils.currentLine=81330176;
 //BA.debugLineNum = 81330176;BA.debugLine="Public Sub SaveServerSnapshot(method As String, ur";
RDebugUtils.currentLine=81330177;
 //BA.debugLineNum = 81330177;BA.debugLine="owner.Data_SaveServerSnapshot(method, url, succes";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_saveserversnapshot /*String*/ (null,_method,_url,_success,_body,_errormessage);
RDebugUtils.currentLine=81330178;
 //BA.debugLineNum = 81330178;BA.debugLine="End Sub";
return "";
}
public String  _scheduleretry(b4j.example.playerstatestore __ref,String _mode,int _delayms) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "scheduleretry", false))
	 {return ((String) Debug.delegate(ba, "scheduleretry", new Object[] {_mode,_delayms}));}
RDebugUtils.currentLine=84213760;
 //BA.debugLineNum = 84213760;BA.debugLine="Public Sub ScheduleRetry(mode As String, delayMs A";
RDebugUtils.currentLine=84213761;
 //BA.debugLineNum = 84213761;BA.debugLine="owner.Data_ScheduleRetry(mode, delayMs)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_scheduleretry /*String*/ (null,_mode,_delayms);
RDebugUtils.currentLine=84213762;
 //BA.debugLineNum = 84213762;BA.debugLine="End Sub";
return "";
}
public String  _secondsagotext(b4j.example.playerstatestore __ref,long _ticksvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "secondsagotext", false))
	 {return ((String) Debug.delegate(ba, "secondsagotext", new Object[] {_ticksvalue}));}
RDebugUtils.currentLine=81723392;
 //BA.debugLineNum = 81723392;BA.debugLine="Public Sub SecondsAgoText(ticksValue As Long) As S";
RDebugUtils.currentLine=81723393;
 //BA.debugLineNum = 81723393;BA.debugLine="Return owner.Data_SecondsAgoText(ticksValue)";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._data_secondsagotext /*String*/ (null,_ticksvalue);
RDebugUtils.currentLine=81723394;
 //BA.debugLineNum = 81723394;BA.debugLine="End Sub";
return "";
}
public String  _servicecheckurlvalue(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "servicecheckurlvalue", false))
	 {return ((String) Debug.delegate(ba, "servicecheckurlvalue", null));}
RDebugUtils.currentLine=80674816;
 //BA.debugLineNum = 80674816;BA.debugLine="Public Sub ServiceCheckUrlValue As String";
RDebugUtils.currentLine=80674817;
 //BA.debugLineNum = 80674817;BA.debugLine="Return owner.ServiceCheckUrlValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._servicecheckurlvalue /*String*/ (null);
RDebugUtils.currentLine=80674818;
 //BA.debugLineNum = 80674818;BA.debugLine="End Sub";
return "";
}
public String  _setlastdataoknow(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setlastdataoknow", false))
	 {return ((String) Debug.delegate(ba, "setlastdataoknow", null));}
RDebugUtils.currentLine=81592320;
 //BA.debugLineNum = 81592320;BA.debugLine="Public Sub SetLastDataOkNow";
RDebugUtils.currentLine=81592321;
 //BA.debugLineNum = 81592321;BA.debugLine="dataSuccessAtTicks = DateTime.Now";
__ref._datasuccessatticks /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=81592322;
 //BA.debugLineNum = 81592322;BA.debugLine="End Sub";
return "";
}
public String  _setlastofflinedatarefreshstate(b4j.example.playerstatestore __ref,String _statevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setlastofflinedatarefreshstate", false))
	 {return ((String) Debug.delegate(ba, "setlastofflinedatarefreshstate", new Object[] {_statevalue}));}
RDebugUtils.currentLine=81920000;
 //BA.debugLineNum = 81920000;BA.debugLine="Public Sub SetLastOfflineDataRefreshState(stateVal";
RDebugUtils.currentLine=81920001;
 //BA.debugLineNum = 81920001;BA.debugLine="policyState.LastOfflineDataRefreshState = stateVa";
__ref._policystate /*b4j.example.playbackdatapolicystate*/ ._lastofflinedatarefreshstate /*String*/  = _statevalue;
RDebugUtils.currentLine=81920002;
 //BA.debugLineNum = 81920002;BA.debugLine="End Sub";
return "";
}
public String  _setlastretrymode(b4j.example.playerstatestore __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setlastretrymode", false))
	 {return ((String) Debug.delegate(ba, "setlastretrymode", new Object[] {_mode}));}
RDebugUtils.currentLine=85131264;
 //BA.debugLineNum = 85131264;BA.debugLine="Public Sub SetLastRetryMode(mode As String)";
RDebugUtils.currentLine=85131265;
 //BA.debugLineNum = 85131265;BA.debugLine="lastRetryMode = mode";
__ref._lastretrymode /*String*/  = _mode;
RDebugUtils.currentLine=85131266;
 //BA.debugLineNum = 85131266;BA.debugLine="End Sub";
return "";
}
public String  _setlocalfallbackready(b4j.example.playerstatestore __ref,boolean _fallbackready) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setlocalfallbackready", false))
	 {return ((String) Debug.delegate(ba, "setlocalfallbackready", new Object[] {_fallbackready}));}
RDebugUtils.currentLine=84869120;
 //BA.debugLineNum = 84869120;BA.debugLine="Public Sub SetLocalFallbackReady(fallbackReady As";
RDebugUtils.currentLine=84869121;
 //BA.debugLineNum = 84869121;BA.debugLine="owner.Data_SetLocalFallbackReady(fallbackReady)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_setlocalfallbackready /*String*/ (null,_fallbackready);
RDebugUtils.currentLine=84869122;
 //BA.debugLineNum = 84869122;BA.debugLine="End Sub";
return "";
}
public String  _setplaybackflowstate(b4j.example.playerstatestore __ref,String _statevalue,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setplaybackflowstate", false))
	 {return ((String) Debug.delegate(ba, "setplaybackflowstate", new Object[] {_statevalue,_reason}));}
RDebugUtils.currentLine=84344832;
 //BA.debugLineNum = 84344832;BA.debugLine="Public Sub SetPlaybackFlowState(stateValue As Stri";
RDebugUtils.currentLine=84344833;
 //BA.debugLineNum = 84344833;BA.debugLine="owner.Data_SetPlaybackFlowState(stateValue, reaso";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_setplaybackflowstate /*String*/ (null,_statevalue,_reason);
RDebugUtils.currentLine=84344834;
 //BA.debugLineNum = 84344834;BA.debugLine="End Sub";
return "";
}
public String  _setplayicon(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setplayicon", false))
	 {return ((String) Debug.delegate(ba, "setplayicon", null));}
RDebugUtils.currentLine=84541440;
 //BA.debugLineNum = 84541440;BA.debugLine="Public Sub SetPlayIcon";
RDebugUtils.currentLine=84541441;
 //BA.debugLineNum = 84541441;BA.debugLine="owner.Data_SetPlayIcon";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_setplayicon /*String*/ (null);
RDebugUtils.currentLine=84541442;
 //BA.debugLineNum = 84541442;BA.debugLine="End Sub";
return "";
}
public String  _setremotedataready(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setremotedataready", false))
	 {return ((String) Debug.delegate(ba, "setremotedataready", null));}
RDebugUtils.currentLine=82051072;
 //BA.debugLineNum = 82051072;BA.debugLine="Public Sub SetRemoteDataReady";
RDebugUtils.currentLine=82051073;
 //BA.debugLineNum = 82051073;BA.debugLine="policyState.SetRemoteDataReady";
__ref._policystate /*b4j.example.playbackdatapolicystate*/ ._setremotedataready /*String*/ (null);
RDebugUtils.currentLine=82051074;
 //BA.debugLineNum = 82051074;BA.debugLine="End Sub";
return "";
}
public String  _setretryinterval(b4j.example.playerstatestore __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setretryinterval", false))
	 {return ((String) Debug.delegate(ba, "setretryinterval", new Object[] {_value}));}
RDebugUtils.currentLine=85196800;
 //BA.debugLineNum = 85196800;BA.debugLine="Public Sub SetRetryInterval(value As Int)";
RDebugUtils.currentLine=85196801;
 //BA.debugLineNum = 85196801;BA.debugLine="retryTimerRef.Interval = value";
__ref._retrytimerref /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (_value));
RDebugUtils.currentLine=85196802;
 //BA.debugLineNum = 85196802;BA.debugLine="End Sub";
return "";
}
public String  _setstopicon(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "setstopicon", false))
	 {return ((String) Debug.delegate(ba, "setstopicon", null));}
RDebugUtils.currentLine=83558400;
 //BA.debugLineNum = 83558400;BA.debugLine="Public Sub SetStopIcon";
RDebugUtils.currentLine=83558401;
 //BA.debugLineNum = 83558401;BA.debugLine="owner.Data_SetStopIcon";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_setstopicon /*String*/ (null);
RDebugUtils.currentLine=83558402;
 //BA.debugLineNum = 83558402;BA.debugLine="End Sub";
return "";
}
public boolean  _shouldresumewithnewstart(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "shouldresumewithnewstart", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldresumewithnewstart", null));}
RDebugUtils.currentLine=83361792;
 //BA.debugLineNum = 83361792;BA.debugLine="Public Sub ShouldResumeWithNewStart As Boolean";
RDebugUtils.currentLine=83361793;
 //BA.debugLineNum = 83361793;BA.debugLine="Return orchestrationStateRef.IsStarted And IsUser";
if (true) return __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/  && __ref._isuserstoppedstate /*boolean*/ (null)==__c.False && __ref._ispolicypausestate /*boolean*/ (null)==__c.False && __ref._orchestrationstateref /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ==__c.False;
RDebugUtils.currentLine=83361794;
 //BA.debugLineNum = 83361794;BA.debugLine="End Sub";
return false;
}
public String  _showmessage(b4j.example.playerstatestore __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "showmessage", false))
	 {return ((String) Debug.delegate(ba, "showmessage", new Object[] {_text}));}
RDebugUtils.currentLine=84148224;
 //BA.debugLineNum = 84148224;BA.debugLine="Public Sub ShowMessage(text As String)";
RDebugUtils.currentLine=84148225;
 //BA.debugLineNum = 84148225;BA.debugLine="owner.Data_ShowMessage(text)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_showmessage /*String*/ (null,_text);
RDebugUtils.currentLine=84148226;
 //BA.debugLineNum = 84148226;BA.debugLine="End Sub";
return "";
}
public b4j.example.keyvaluestore  _storage(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "storage", false))
	 {return ((b4j.example.keyvaluestore) Debug.delegate(ba, "storage", null));}
RDebugUtils.currentLine=82247680;
 //BA.debugLineNum = 82247680;BA.debugLine="Public Sub Storage As KeyValueStore";
RDebugUtils.currentLine=82247681;
 //BA.debugLineNum = 82247681;BA.debugLine="Return storageRef";
if (true) return __ref._storageref /*b4j.example.keyvaluestore*/ ;
RDebugUtils.currentLine=82247682;
 //BA.debugLineNum = 82247682;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=83886081;
 //BA.debugLineNum = 83886081;BA.debugLine="Wait For (owner.Data_SyncOfflinePlaylistMetadata)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playerstatestore", "syncofflineplaylistmetadata"), __ref._owner /*b4j.example.b4xmainpage*/ ._data_syncofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_synced = (boolean) result[1];
;
RDebugUtils.currentLine=83886082;
 //BA.debugLineNum = 83886082;BA.debugLine="Return synced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_synced));return;};
RDebugUtils.currentLine=83886083;
 //BA.debugLineNum = 83886083;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=80543744;
 //BA.debugLineNum = 80543744;BA.debugLine="Public Sub TimezoneOffsetMinutesValue As Int";
RDebugUtils.currentLine=80543745;
 //BA.debugLineNum = 80543745;BA.debugLine="Return owner.TimezoneOffsetMinutesValue";
if (true) return __ref._owner /*b4j.example.b4xmainpage*/ ._timezoneoffsetminutesvalue /*int*/ (null);
RDebugUtils.currentLine=80543746;
 //BA.debugLineNum = 80543746;BA.debugLine="End Sub";
return 0;
}
public String  _tracewarn(b4j.example.playerstatestore __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "tracewarn", false))
	 {return ((String) Debug.delegate(ba, "tracewarn", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=81133568;
 //BA.debugLineNum = 81133568;BA.debugLine="Public Sub TraceWarn(category As String, message A";
RDebugUtils.currentLine=81133569;
 //BA.debugLineNum = 81133569;BA.debugLine="owner.Data_TraceWarn(category, message, details)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_tracewarn /*String*/ (null,_category,_message,_details);
RDebugUtils.currentLine=81133570;
 //BA.debugLineNum = 81133570;BA.debugLine="End Sub";
return "";
}
public String  _trustedsynctimekey(b4j.example.playerstatestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "trustedsynctimekey", false))
	 {return ((String) Debug.delegate(ba, "trustedsynctimekey", null));}
RDebugUtils.currentLine=82313216;
 //BA.debugLineNum = 82313216;BA.debugLine="Public Sub TrustedSyncTimeKey As String";
RDebugUtils.currentLine=82313217;
 //BA.debugLineNum = 82313217;BA.debugLine="Return trustedSyncTimeKeyValue";
if (true) return __ref._trustedsynctimekeyvalue /*String*/ ;
RDebugUtils.currentLine=82313218;
 //BA.debugLineNum = 82313218;BA.debugLine="End Sub";
return "";
}
public String  _writehealthsnapshot(b4j.example.playerstatestore __ref,String _trigger) throws Exception{
__ref = this;
RDebugUtils.currentModule="playerstatestore";
if (Debug.shouldDelegate(ba, "writehealthsnapshot", false))
	 {return ((String) Debug.delegate(ba, "writehealthsnapshot", new Object[] {_trigger}));}
RDebugUtils.currentLine=82771968;
 //BA.debugLineNum = 82771968;BA.debugLine="Public Sub WriteHealthSnapshot(trigger As String)";
RDebugUtils.currentLine=82771969;
 //BA.debugLineNum = 82771969;BA.debugLine="owner.Data_WriteHealthSnapshot(trigger)";
__ref._owner /*b4j.example.b4xmainpage*/ ._data_writehealthsnapshot /*String*/ (null,_trigger);
RDebugUtils.currentLine=82771970;
 //BA.debugLineNum = 82771970;BA.debugLine="End Sub";
return "";
}
}