package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbackqueuestate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbackqueuestate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbackqueuestate.class).invoke(this, new Object[] {null});
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
public long _scheduledbreakat = 0L;
public boolean _skipqueuesnapshotrestoreonce = false;
public anywheresoftware.b4a.objects.collections.List _stoppedreservequeue = null;
public String _stoppedreservesignature = "";
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _clearexactbreakstate(b4j.example.playbackqueuestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "clearexactbreakstate", false))
	 {return ((String) Debug.delegate(ba, "clearexactbreakstate", null));}
RDebugUtils.currentLine=50069504;
 //BA.debugLineNum = 50069504;BA.debugLine="Public Sub ClearExactBreakState";
RDebugUtils.currentLine=50069505;
 //BA.debugLineNum = 50069505;BA.debugLine="ScheduledBreakAt = -1";
__ref._scheduledbreakat /*long*/  = (long) (-1);
RDebugUtils.currentLine=50069506;
 //BA.debugLineNum = 50069506;BA.debugLine="End Sub";
return "";
}
public long  _limitremainbybreak(b4j.example.playbackqueuestate __ref,long _trackremain,long _localnowtimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "limitremainbybreak", false))
	 {return ((Long) Debug.delegate(ba, "limitremainbybreak", new Object[] {_trackremain,_localnowtimestamp}));}
long _breakremain = 0L;
RDebugUtils.currentLine=50266112;
 //BA.debugLineNum = 50266112;BA.debugLine="Public Sub LimitRemainByBreak(trackRemain As Long,";
RDebugUtils.currentLine=50266113;
 //BA.debugLineNum = 50266113;BA.debugLine="If ScheduledBreakAt <= 0 Then Return trackRemain";
if (__ref._scheduledbreakat /*long*/ <=0) { 
if (true) return _trackremain;};
RDebugUtils.currentLine=50266114;
 //BA.debugLineNum = 50266114;BA.debugLine="Dim breakRemain As Long = (ScheduledBreakAt - loc";
_breakremain = (long) ((__ref._scheduledbreakat /*long*/ -_localnowtimestamp)*1000);
RDebugUtils.currentLine=50266115;
 //BA.debugLineNum = 50266115;BA.debugLine="If trackRemain <= 0 Then Return breakRemain";
if (_trackremain<=0) { 
if (true) return _breakremain;};
RDebugUtils.currentLine=50266116;
 //BA.debugLineNum = 50266116;BA.debugLine="Return Min(trackRemain, breakRemain)";
if (true) return (long) (__c.Min(_trackremain,_breakremain));
RDebugUtils.currentLine=50266117;
 //BA.debugLineNum = 50266117;BA.debugLine="End Sub";
return 0L;
}
public boolean  _haspendingexactbreak(b4j.example.playbackqueuestate __ref,long _localnowtimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "haspendingexactbreak", false))
	 {return ((Boolean) Debug.delegate(ba, "haspendingexactbreak", new Object[] {_localnowtimestamp}));}
RDebugUtils.currentLine=50135040;
 //BA.debugLineNum = 50135040;BA.debugLine="Public Sub HasPendingExactBreak(localNowTimestamp";
RDebugUtils.currentLine=50135041;
 //BA.debugLineNum = 50135041;BA.debugLine="Return ScheduledBreakAt > localNowTimestamp";
if (true) return __ref._scheduledbreakat /*long*/ >_localnowtimestamp;
RDebugUtils.currentLine=50135042;
 //BA.debugLineNum = 50135042;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.playbackqueuestate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=49217536;
 //BA.debugLineNum = 49217536;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=49217537;
 //BA.debugLineNum = 49217537;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=49217538;
 //BA.debugLineNum = 49217538;BA.debugLine="End Sub";
return "";
}
public String  _resolvescheduledbreakat(b4j.example.playbackqueuestate __ref,anywheresoftware.b4a.objects.collections.List _queue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "resolvescheduledbreakat", false))
	 {return ((String) Debug.delegate(ba, "resolvescheduledbreakat", new Object[] {_queue}));}
Object _itemobj = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=50003968;
 //BA.debugLineNum = 50003968;BA.debugLine="Public Sub ResolveScheduledBreakAt(queue As List)";
RDebugUtils.currentLine=50003969;
 //BA.debugLineNum = 50003969;BA.debugLine="ScheduledBreakAt = -1";
__ref._scheduledbreakat /*long*/  = (long) (-1);
RDebugUtils.currentLine=50003970;
 //BA.debugLineNum = 50003970;BA.debugLine="If queue.IsInitialized = False Then Return";
if (_queue.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=50003971;
 //BA.debugLineNum = 50003971;BA.debugLine="For Each itemObj As Object In queue";
{
final anywheresoftware.b4a.BA.IterableList group3 = _queue;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_itemobj = group3.Get(index3);
RDebugUtils.currentLine=50003972;
 //BA.debugLineNum = 50003972;BA.debugLine="If itemObj Is Map Then";
if (_itemobj instanceof java.util.Map) { 
RDebugUtils.currentLine=50003973;
 //BA.debugLineNum = 50003973;BA.debugLine="Dim item As Map = itemObj";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobj));
RDebugUtils.currentLine=50003974;
 //BA.debugLineNum = 50003974;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"break\" And it";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break")) && (_item.GetDefault((Object)("exactly"),(Object)(__c.False))).equals((Object)(__c.True)) && _item.ContainsKey((Object)("at"))) { 
RDebugUtils.currentLine=50003975;
 //BA.debugLineNum = 50003975;BA.debugLine="ScheduledBreakAt = ToLongDefault(item.Get(\"at\"";
__ref._scheduledbreakat /*long*/  = __ref._tolongdefault /*long*/ (null,_item.Get((Object)("at")),(long) (-1));
RDebugUtils.currentLine=50003976;
 //BA.debugLineNum = 50003976;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
RDebugUtils.currentLine=50003980;
 //BA.debugLineNum = 50003980;BA.debugLine="End Sub";
return "";
}
public boolean  _shouldtriggerbreaknow(b4j.example.playbackqueuestate __ref,long _localnowtimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "shouldtriggerbreaknow", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldtriggerbreaknow", new Object[] {_localnowtimestamp}));}
RDebugUtils.currentLine=50200576;
 //BA.debugLineNum = 50200576;BA.debugLine="Public Sub ShouldTriggerBreakNow(localNowTimestamp";
RDebugUtils.currentLine=50200577;
 //BA.debugLineNum = 50200577;BA.debugLine="If ScheduledBreakAt <= 0 Then Return False";
if (__ref._scheduledbreakat /*long*/ <=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=50200578;
 //BA.debugLineNum = 50200578;BA.debugLine="Return localNowTimestamp >= ScheduledBreakAt";
if (true) return _localnowtimestamp>=__ref._scheduledbreakat /*long*/ ;
RDebugUtils.currentLine=50200579;
 //BA.debugLineNum = 50200579;BA.debugLine="End Sub";
return false;
}
public String  _capturestoppedreserve(b4j.example.playbackqueuestate __ref,anywheresoftware.b4a.objects.collections.List _sourcequeue,String _signature) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "capturestoppedreserve", false))
	 {return ((String) Debug.delegate(ba, "capturestoppedreserve", new Object[] {_sourcequeue,_signature}));}
Object _itemobject = null;
RDebugUtils.currentLine=49610752;
 //BA.debugLineNum = 49610752;BA.debugLine="Public Sub CaptureStoppedReserve(sourceQueue As Li";
RDebugUtils.currentLine=49610753;
 //BA.debugLineNum = 49610753;BA.debugLine="ClearStoppedReserve";
__ref._clearstoppedreserve /*String*/ (null);
RDebugUtils.currentLine=49610754;
 //BA.debugLineNum = 49610754;BA.debugLine="If sourceQueue.IsInitialized = False Or sourceQue";
if (_sourcequeue.IsInitialized()==__c.False || _sourcequeue.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=49610755;
 //BA.debugLineNum = 49610755;BA.debugLine="If signature = \"\" Then Return";
if ((_signature).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=49610756;
 //BA.debugLineNum = 49610756;BA.debugLine="For Each itemObject As Object In sourceQueue";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcequeue;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_itemobject = group4.Get(index4);
RDebugUtils.currentLine=49610757;
 //BA.debugLineNum = 49610757;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=49610758;
 //BA.debugLineNum = 49610758;BA.debugLine="StoppedReserveQueue.Add(CloneStateMap(itemObjec";
__ref._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject))).getObject()));
 };
 }
};
RDebugUtils.currentLine=49610761;
 //BA.debugLineNum = 49610761;BA.debugLine="If StoppedReserveQueue.Size = 0 Then Return";
if (__ref._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=49610762;
 //BA.debugLineNum = 49610762;BA.debugLine="StoppedReserveSignature = signature";
__ref._stoppedreservesignature /*String*/  = _signature;
RDebugUtils.currentLine=49610763;
 //BA.debugLineNum = 49610763;BA.debugLine="End Sub";
return "";
}
public String  _clearqueuesnapshot(b4j.example.playbackqueuestate __ref,b4j.example.keyvaluestore _storage) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "clearqueuesnapshot", false))
	 {return ((String) Debug.delegate(ba, "clearqueuesnapshot", new Object[] {_storage}));}
RDebugUtils.currentLine=49938432;
 //BA.debugLineNum = 49938432;BA.debugLine="Public Sub ClearQueueSnapshot(storage As KeyValueS";
RDebugUtils.currentLine=49938433;
 //BA.debugLineNum = 49938433;BA.debugLine="storage.Put(\"queue_snapshot_tracks\", CreateInitia";
_storage._put /*String*/ (null,"queue_snapshot_tracks",(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()));
RDebugUtils.currentLine=49938434;
 //BA.debugLineNum = 49938434;BA.debugLine="storage.Put(\"queue_snapshot_saved_at\", 0)";
_storage._put /*String*/ (null,"queue_snapshot_saved_at",(Object)(0));
RDebugUtils.currentLine=49938435;
 //BA.debugLineNum = 49938435;BA.debugLine="storage.Put(\"queue_snapshot_signature\", \"\")";
_storage._put /*String*/ (null,"queue_snapshot_signature",(Object)(""));
RDebugUtils.currentLine=49938436;
 //BA.debugLineNum = 49938436;BA.debugLine="storage.Put(\"download_plan_tracks\", CreateInitial";
_storage._put /*String*/ (null,"download_plan_tracks",(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()));
RDebugUtils.currentLine=49938437;
 //BA.debugLineNum = 49938437;BA.debugLine="storage.Put(\"download_plan_saved_at\", 0)";
_storage._put /*String*/ (null,"download_plan_saved_at",(Object)(0));
RDebugUtils.currentLine=49938438;
 //BA.debugLineNum = 49938438;BA.debugLine="storage.Put(\"download_plan_signature\", \"\")";
_storage._put /*String*/ (null,"download_plan_signature",(Object)(""));
RDebugUtils.currentLine=49938439;
 //BA.debugLineNum = 49938439;BA.debugLine="End Sub";
return "";
}
public String  _requestskipqueuesnapshotrestore(b4j.example.playbackqueuestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "requestskipqueuesnapshotrestore", false))
	 {return ((String) Debug.delegate(ba, "requestskipqueuesnapshotrestore", null));}
RDebugUtils.currentLine=49348608;
 //BA.debugLineNum = 49348608;BA.debugLine="Public Sub RequestSkipQueueSnapshotRestore";
RDebugUtils.currentLine=49348609;
 //BA.debugLineNum = 49348609;BA.debugLine="SkipQueueSnapshotRestoreOnce = True";
__ref._skipqueuesnapshotrestoreonce /*boolean*/  = __c.True;
RDebugUtils.currentLine=49348610;
 //BA.debugLineNum = 49348610;BA.debugLine="End Sub";
return "";
}
public boolean  _canrestorestoppedreserve(b4j.example.playbackqueuestate __ref,String _currentsignature) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "canrestorestoppedreserve", false))
	 {return ((Boolean) Debug.delegate(ba, "canrestorestoppedreserve", new Object[] {_currentsignature}));}
RDebugUtils.currentLine=49676288;
 //BA.debugLineNum = 49676288;BA.debugLine="Public Sub CanRestoreStoppedReserve(currentSignatu";
RDebugUtils.currentLine=49676289;
 //BA.debugLineNum = 49676289;BA.debugLine="If StoppedReserveQueue.IsInitialized = False Or S";
if (__ref._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=49676290;
 //BA.debugLineNum = 49676290;BA.debugLine="If currentSignature = \"\" Then Return False";
if ((_currentsignature).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=49676291;
 //BA.debugLineNum = 49676291;BA.debugLine="Return StoppedReserveSignature = currentSignature";
if (true) return (__ref._stoppedreservesignature /*String*/ ).equals(_currentsignature);
RDebugUtils.currentLine=49676292;
 //BA.debugLineNum = 49676292;BA.debugLine="End Sub";
return false;
}
public String  _clearstoppedreserve(b4j.example.playbackqueuestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "clearstoppedreserve", false))
	 {return ((String) Debug.delegate(ba, "clearstoppedreserve", null));}
RDebugUtils.currentLine=49545216;
 //BA.debugLineNum = 49545216;BA.debugLine="Public Sub ClearStoppedReserve";
RDebugUtils.currentLine=49545217;
 //BA.debugLineNum = 49545217;BA.debugLine="If StoppedReserveQueue.IsInitialized = False Then";
if (__ref._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=49545218;
 //BA.debugLineNum = 49545218;BA.debugLine="StoppedReserveQueue.Clear";
__ref._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=49545219;
 //BA.debugLineNum = 49545219;BA.debugLine="StoppedReserveSignature = \"\"";
__ref._stoppedreservesignature /*String*/  = "";
RDebugUtils.currentLine=49545220;
 //BA.debugLineNum = 49545220;BA.debugLine="End Sub";
return "";
}
public String  _savequeuesnapshot(b4j.example.playbackqueuestate __ref,b4j.example.keyvaluestore _storage,String _signature,anywheresoftware.b4a.objects.collections.List _queue,int _limit) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "savequeuesnapshot", false))
	 {return ((String) Debug.delegate(ba, "savequeuesnapshot", new Object[] {_storage,_signature,_queue,_limit}));}
anywheresoftware.b4a.objects.collections.List _tracks = null;
Object _itemobject = null;
RDebugUtils.currentLine=49807360;
 //BA.debugLineNum = 49807360;BA.debugLine="Public Sub SaveQueueSnapshot(storage As KeyValueSt";
RDebugUtils.currentLine=49807361;
 //BA.debugLineNum = 49807361;BA.debugLine="Dim tracks As List";
_tracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=49807362;
 //BA.debugLineNum = 49807362;BA.debugLine="tracks.Initialize";
_tracks.Initialize();
RDebugUtils.currentLine=49807363;
 //BA.debugLineNum = 49807363;BA.debugLine="If queue.IsInitialized Then";
if (_queue.IsInitialized()) { 
RDebugUtils.currentLine=49807364;
 //BA.debugLineNum = 49807364;BA.debugLine="For Each itemObject As Object In queue";
{
final anywheresoftware.b4a.BA.IterableList group4 = _queue;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_itemobject = group4.Get(index4);
RDebugUtils.currentLine=49807365;
 //BA.debugLineNum = 49807365;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=49807366;
 //BA.debugLineNum = 49807366;BA.debugLine="tracks.Add(CloneStateMap(itemObject))";
_tracks.Add((Object)(__ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject))).getObject()));
RDebugUtils.currentLine=49807367;
 //BA.debugLineNum = 49807367;BA.debugLine="If limit > 0 And tracks.Size >= limit Then Exi";
if (_limit>0 && _tracks.getSize()>=_limit) { 
if (true) break;};
 };
 }
};
 };
RDebugUtils.currentLine=49807371;
 //BA.debugLineNum = 49807371;BA.debugLine="storage.Put(\"queue_snapshot_signature\", signature";
_storage._put /*String*/ (null,"queue_snapshot_signature",(Object)(_signature));
RDebugUtils.currentLine=49807372;
 //BA.debugLineNum = 49807372;BA.debugLine="storage.Put(\"queue_snapshot_tracks\", tracks)";
_storage._put /*String*/ (null,"queue_snapshot_tracks",(Object)(_tracks.getObject()));
RDebugUtils.currentLine=49807373;
 //BA.debugLineNum = 49807373;BA.debugLine="storage.Put(\"queue_snapshot_saved_at\", DateTime.N";
_storage._put /*String*/ (null,"queue_snapshot_saved_at",(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=49807374;
 //BA.debugLineNum = 49807374;BA.debugLine="End Sub";
return "";
}
public boolean  _consumeskipqueuesnapshotrestore(b4j.example.playbackqueuestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "consumeskipqueuesnapshotrestore", false))
	 {return ((Boolean) Debug.delegate(ba, "consumeskipqueuesnapshotrestore", null));}
RDebugUtils.currentLine=49414144;
 //BA.debugLineNum = 49414144;BA.debugLine="Public Sub ConsumeSkipQueueSnapshotRestore As Bool";
RDebugUtils.currentLine=49414145;
 //BA.debugLineNum = 49414145;BA.debugLine="If SkipQueueSnapshotRestoreOnce = False Then Retu";
if (__ref._skipqueuesnapshotrestoreonce /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=49414146;
 //BA.debugLineNum = 49414146;BA.debugLine="SkipQueueSnapshotRestoreOnce = False";
__ref._skipqueuesnapshotrestoreonce /*boolean*/  = __c.False;
RDebugUtils.currentLine=49414147;
 //BA.debugLineNum = 49414147;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=49414148;
 //BA.debugLineNum = 49414148;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _restorequeuesnapshot(b4j.example.playbackqueuestate __ref,b4j.example.keyvaluestore _storage) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "restorequeuesnapshot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "restorequeuesnapshot", new Object[] {_storage}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.List _tracks = null;
RDebugUtils.currentLine=49872896;
 //BA.debugLineNum = 49872896;BA.debugLine="Public Sub RestoreQueueSnapshot(storage As KeyValu";
RDebugUtils.currentLine=49872897;
 //BA.debugLineNum = 49872897;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49872898;
 //BA.debugLineNum = 49872898;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=49872899;
 //BA.debugLineNum = 49872899;BA.debugLine="result.Put(\"signature\", storage.GetDefault(\"queue";
_result.Put((Object)("signature"),_storage._getdefault /*Object*/ (null,"queue_snapshot_signature",(Object)("")));
RDebugUtils.currentLine=49872900;
 //BA.debugLineNum = 49872900;BA.debugLine="result.Put(\"tracks\", storage.GetDefault(\"queue_sn";
_result.Put((Object)("tracks"),_storage._getdefault /*Object*/ (null,"queue_snapshot_tracks",(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=49872901;
 //BA.debugLineNum = 49872901;BA.debugLine="If result.Get(\"signature\") = \"\" Then";
if ((_result.Get((Object)("signature"))).equals((Object)(""))) { 
RDebugUtils.currentLine=49872902;
 //BA.debugLineNum = 49872902;BA.debugLine="result.Put(\"signature\", storage.GetDefault(\"down";
_result.Put((Object)("signature"),_storage._getdefault /*Object*/ (null,"download_plan_signature",(Object)("")));
 };
RDebugUtils.currentLine=49872904;
 //BA.debugLineNum = 49872904;BA.debugLine="Dim tracks As List = result.Get(\"tracks\")";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_result.Get((Object)("tracks"))));
RDebugUtils.currentLine=49872905;
 //BA.debugLineNum = 49872905;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
RDebugUtils.currentLine=49872906;
 //BA.debugLineNum = 49872906;BA.debugLine="result.Put(\"tracks\", storage.GetDefault(\"downloa";
_result.Put((Object)("tracks"),_storage._getdefault /*Object*/ (null,"download_plan_tracks",(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
 };
RDebugUtils.currentLine=49872908;
 //BA.debugLineNum = 49872908;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=49872909;
 //BA.debugLineNum = 49872909;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _clonestatemap(b4j.example.playbackqueuestate __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "clonestatemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonestatemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _cloned = null;
Object _key = null;
RDebugUtils.currentLine=50331648;
 //BA.debugLineNum = 50331648;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
RDebugUtils.currentLine=50331649;
 //BA.debugLineNum = 50331649;BA.debugLine="Dim cloned As Map";
_cloned = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=50331650;
 //BA.debugLineNum = 50331650;BA.debugLine="cloned.Initialize";
_cloned.Initialize();
RDebugUtils.currentLine=50331651;
 //BA.debugLineNum = 50331651;BA.debugLine="If source.IsInitialized = False Then Return clone";
if (_source.IsInitialized()==__c.False) { 
if (true) return _cloned;};
RDebugUtils.currentLine=50331652;
 //BA.debugLineNum = 50331652;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=50331653;
 //BA.debugLineNum = 50331653;BA.debugLine="cloned.Put(key, source.Get(key))";
_cloned.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=50331655;
 //BA.debugLineNum = 50331655;BA.debugLine="Return cloned";
if (true) return _cloned;
RDebugUtils.currentLine=50331656;
 //BA.debugLineNum = 50331656;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.playbackqueuestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
RDebugUtils.currentLine=49152000;
 //BA.debugLineNum = 49152000;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=49152001;
 //BA.debugLineNum = 49152001;BA.debugLine="Public ScheduledBreakAt As Long";
_scheduledbreakat = 0L;
RDebugUtils.currentLine=49152002;
 //BA.debugLineNum = 49152002;BA.debugLine="Public SkipQueueSnapshotRestoreOnce As Boolean";
_skipqueuesnapshotrestoreonce = false;
RDebugUtils.currentLine=49152003;
 //BA.debugLineNum = 49152003;BA.debugLine="Public StoppedReserveQueue As List";
_stoppedreservequeue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=49152004;
 //BA.debugLineNum = 49152004;BA.debugLine="Public StoppedReserveSignature As String";
_stoppedreservesignature = "";
RDebugUtils.currentLine=49152005;
 //BA.debugLineNum = 49152005;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.playbackqueuestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=50397184;
 //BA.debugLineNum = 50397184;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=50397185;
 //BA.debugLineNum = 50397185;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=50397186;
 //BA.debugLineNum = 50397186;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=50397187;
 //BA.debugLineNum = 50397187;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=50397188;
 //BA.debugLineNum = 50397188;BA.debugLine="End Sub";
return null;
}
public String  _clearqueuesnapshotskip(b4j.example.playbackqueuestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "clearqueuesnapshotskip", false))
	 {return ((String) Debug.delegate(ba, "clearqueuesnapshotskip", null));}
RDebugUtils.currentLine=49479680;
 //BA.debugLineNum = 49479680;BA.debugLine="Public Sub ClearQueueSnapshotSkip";
RDebugUtils.currentLine=49479681;
 //BA.debugLineNum = 49479681;BA.debugLine="SkipQueueSnapshotRestoreOnce = False";
__ref._skipqueuesnapshotrestoreonce /*boolean*/  = __c.False;
RDebugUtils.currentLine=49479682;
 //BA.debugLineNum = 49479682;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackqueuestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=49283072;
 //BA.debugLineNum = 49283072;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=49283073;
 //BA.debugLineNum = 49283073;BA.debugLine="ScheduledBreakAt = -1";
__ref._scheduledbreakat /*long*/  = (long) (-1);
RDebugUtils.currentLine=49283074;
 //BA.debugLineNum = 49283074;BA.debugLine="SkipQueueSnapshotRestoreOnce = False";
__ref._skipqueuesnapshotrestoreonce /*boolean*/  = __c.False;
RDebugUtils.currentLine=49283075;
 //BA.debugLineNum = 49283075;BA.debugLine="StoppedReserveQueue.Initialize";
__ref._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=49283076;
 //BA.debugLineNum = 49283076;BA.debugLine="StoppedReserveSignature = \"\"";
__ref._stoppedreservesignature /*String*/  = "";
RDebugUtils.currentLine=49283077;
 //BA.debugLineNum = 49283077;BA.debugLine="End Sub";
return "";
}
public int  _movestoppedreservetoqueue(b4j.example.playbackqueuestate __ref,anywheresoftware.b4a.objects.collections.List _targetqueue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "movestoppedreservetoqueue", false))
	 {return ((Integer) Debug.delegate(ba, "movestoppedreservetoqueue", new Object[] {_targetqueue}));}
int _restoredcount = 0;
Object _itemobject = null;
RDebugUtils.currentLine=49741824;
 //BA.debugLineNum = 49741824;BA.debugLine="Public Sub MoveStoppedReserveToQueue(targetQueue A";
RDebugUtils.currentLine=49741825;
 //BA.debugLineNum = 49741825;BA.debugLine="If targetQueue.IsInitialized = False Then targetQ";
if (_targetqueue.IsInitialized()==__c.False) { 
_targetqueue.Initialize();};
RDebugUtils.currentLine=49741826;
 //BA.debugLineNum = 49741826;BA.debugLine="targetQueue.Clear";
_targetqueue.Clear();
RDebugUtils.currentLine=49741827;
 //BA.debugLineNum = 49741827;BA.debugLine="Dim restoredCount As Int = 0";
_restoredcount = (int) (0);
RDebugUtils.currentLine=49741828;
 //BA.debugLineNum = 49741828;BA.debugLine="For Each itemObject As Object In StoppedReserveQu";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_itemobject = group4.Get(index4);
RDebugUtils.currentLine=49741829;
 //BA.debugLineNum = 49741829;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=49741830;
 //BA.debugLineNum = 49741830;BA.debugLine="targetQueue.Add(CloneStateMap(itemObject))";
_targetqueue.Add((Object)(__ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject))).getObject()));
RDebugUtils.currentLine=49741831;
 //BA.debugLineNum = 49741831;BA.debugLine="restoredCount = restoredCount + 1";
_restoredcount = (int) (_restoredcount+1);
 };
 }
};
RDebugUtils.currentLine=49741834;
 //BA.debugLineNum = 49741834;BA.debugLine="ClearStoppedReserve";
__ref._clearstoppedreserve /*String*/ (null);
RDebugUtils.currentLine=49741835;
 //BA.debugLineNum = 49741835;BA.debugLine="Return restoredCount";
if (true) return _restoredcount;
RDebugUtils.currentLine=49741836;
 //BA.debugLineNum = 49741836;BA.debugLine="End Sub";
return 0;
}
public long  _tolongdefault(b4j.example.playbackqueuestate __ref,Object _value,long _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackqueuestate";
if (Debug.shouldDelegate(ba, "tolongdefault", false))
	 {return ((Long) Debug.delegate(ba, "tolongdefault", new Object[] {_value,_defaultvalue}));}
RDebugUtils.currentLine=50462720;
 //BA.debugLineNum = 50462720;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
RDebugUtils.currentLine=50462721;
 //BA.debugLineNum = 50462721;BA.debugLine="If value = Null Then Return defaultValue";
if (_value== null) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=50462722;
 //BA.debugLineNum = 50462722;BA.debugLine="Try";
try {RDebugUtils.currentLine=50462723;
 //BA.debugLineNum = 50462723;BA.debugLine="Return value";
if (true) return BA.ObjectToLongNumber(_value);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=50462725;
 //BA.debugLineNum = 50462725;BA.debugLine="Return defaultValue";
if (true) return _defaultvalue;
 };
RDebugUtils.currentLine=50462727;
 //BA.debugLineNum = 50462727;BA.debugLine="End Sub";
return 0L;
}
}