package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class mediacache extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.mediacache", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.mediacache.class).invoke(this, new Object[] {null});
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
public String _storagedir = "";
public b4j.example.keyvaluestore _storage = null;
public Object _targetmodule = null;
public String _tracesubname = "";
public String _mediadirname = "";
public String _adsdirname = "";
public String _tracksdirname = "";
public int _cache_audit_batch_size = 0;
public int _ad_download_timeout_ms = 0;
public int _track_download_timeout_ms = 0;
public int _stream_xor_buffer_size = 0;
public long _track_cache_hard_limit_mb = 0L;
public long _track_cache_target_mb = 0L;
public long _min_free_disk_mb = 0L;
public int _min_free_disk_percent = 0;
public String _primary_temp_track_file = "";
public String _secondary_temp_track_file = "";
public anywheresoftware.b4a.objects.collections.Map _cachedadindex = null;
public anywheresoftware.b4a.objects.collections.Map _cachedtrackindex = null;
public boolean _cachedadindexdirty = false;
public boolean _cachedtrackindexdirty = false;
public anywheresoftware.b4a.objects.collections.Map _playbacktemptrackids = null;
public boolean _cacheauditinprogress = false;
public anywheresoftware.b4a.objects.collections.List _cacheauditpendingtypes = null;
public String _cacheauditcurrenttype = "";
public anywheresoftware.b4a.objects.collections.List _cacheauditcurrentfilenames = null;
public int _cacheauditcurrentposition = 0;
public anywheresoftware.b4a.objects.collections.Map _cacheauditseenids = null;
public boolean _cacheauditadindexchanged = false;
public boolean _cacheaudittrackindexchanged = false;
public int _cacheauditaddedcount = 0;
public int _cacheauditremovedcount = 0;
public int _cacheaudittempdeletedcount = 0;
public boolean _recentmedianetworkfailure = false;
public long _prunelastcachebytes = 0L;
public long _prunelastfreebytes = 0L;
public int _cachedtrackcount = 0;
public int _cachedadcount = 0;
public long _cachedtrackbytes = 0L;
public long _cachedadbytes = 0L;
public anywheresoftware.b4a.objects.collections.Map _cachedtrackplayliststats = null;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _touchcacheditem(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "touchcacheditem", false))
	 {return ((String) Debug.delegate(ba, "touchcacheditem", new Object[] {_item}));}
String _itemid = "";
String _itemtype = "";
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Public Sub TouchCachedItem(item As Map)";
RDebugUtils.currentLine=35979265;
 //BA.debugLineNum = 35979265;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=35979266;
 //BA.debugLineNum = 35979266;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=35979267;
 //BA.debugLineNum = 35979267;BA.debugLine="If itemId = \"\" Then Return";
if ((_itemid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=35979268;
 //BA.debugLineNum = 35979268;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=35979269;
 //BA.debugLineNum = 35979269;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=35979270;
 //BA.debugLineNum = 35979270;BA.debugLine="If cachedAdIndex.ContainsKey(itemId) = False The";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_itemid))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=35979271;
 //BA.debugLineNum = 35979271;BA.debugLine="UpdateAdIndex(item, cachedAdIndex)";
__ref._updateadindex /*String*/ (null,_item,__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=35979272;
 //BA.debugLineNum = 35979272;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=35979274;
 //BA.debugLineNum = 35979274;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=35979275;
 //BA.debugLineNum = 35979275;BA.debugLine="If cachedTrackIndex.ContainsKey(itemId) = False";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_itemid))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=35979276;
 //BA.debugLineNum = 35979276;BA.debugLine="UpdateTrackIndex(item, cachedTrackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=35979278;
 //BA.debugLineNum = 35979278;BA.debugLine="End Sub";
return "";
}
public boolean  _iscacheauditinprogress(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "iscacheauditinprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "iscacheauditinprogress", null));}
RDebugUtils.currentLine=34471936;
 //BA.debugLineNum = 34471936;BA.debugLine="Public Sub IsCacheAuditInProgress As Boolean";
RDebugUtils.currentLine=34471937;
 //BA.debugLineNum = 34471937;BA.debugLine="Return cacheAuditInProgress";
if (true) return __ref._cacheauditinprogress /*boolean*/ ;
RDebugUtils.currentLine=34471938;
 //BA.debugLineNum = 34471938;BA.debugLine="End Sub";
return false;
}
public String  _startcacheaudit(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "startcacheaudit", false))
	 {return ((String) Debug.delegate(ba, "startcacheaudit", null));}
RDebugUtils.currentLine=34537472;
 //BA.debugLineNum = 34537472;BA.debugLine="Public Sub StartCacheAudit";
RDebugUtils.currentLine=34537473;
 //BA.debugLineNum = 34537473;BA.debugLine="If cacheAuditInProgress Then Return";
if (__ref._cacheauditinprogress /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=34537474;
 //BA.debugLineNum = 34537474;BA.debugLine="cacheAuditPendingTypes.Initialize";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=34537475;
 //BA.debugLineNum = 34537475;BA.debugLine="cacheAuditPendingTypes.Add(\"ads\")";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("ads"));
RDebugUtils.currentLine=34537476;
 //BA.debugLineNum = 34537476;BA.debugLine="cacheAuditPendingTypes.Add(\"tracks\")";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("tracks"));
RDebugUtils.currentLine=34537477;
 //BA.debugLineNum = 34537477;BA.debugLine="cacheAuditCurrentType = \"\"";
__ref._cacheauditcurrenttype /*String*/  = "";
RDebugUtils.currentLine=34537478;
 //BA.debugLineNum = 34537478;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=34537479;
 //BA.debugLineNum = 34537479;BA.debugLine="cacheAuditCurrentPosition = 0";
__ref._cacheauditcurrentposition /*int*/  = (int) (0);
RDebugUtils.currentLine=34537480;
 //BA.debugLineNum = 34537480;BA.debugLine="cacheAuditSeenIds.Initialize";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=34537481;
 //BA.debugLineNum = 34537481;BA.debugLine="cacheAuditAdIndexChanged = False";
__ref._cacheauditadindexchanged /*boolean*/  = __c.False;
RDebugUtils.currentLine=34537482;
 //BA.debugLineNum = 34537482;BA.debugLine="cacheAuditTrackIndexChanged = False";
__ref._cacheaudittrackindexchanged /*boolean*/  = __c.False;
RDebugUtils.currentLine=34537483;
 //BA.debugLineNum = 34537483;BA.debugLine="cacheAuditAddedCount = 0";
__ref._cacheauditaddedcount /*int*/  = (int) (0);
RDebugUtils.currentLine=34537484;
 //BA.debugLineNum = 34537484;BA.debugLine="cacheAuditRemovedCount = 0";
__ref._cacheauditremovedcount /*int*/  = (int) (0);
RDebugUtils.currentLine=34537485;
 //BA.debugLineNum = 34537485;BA.debugLine="cacheAuditTempDeletedCount = 0";
__ref._cacheaudittempdeletedcount /*int*/  = (int) (0);
RDebugUtils.currentLine=34537486;
 //BA.debugLineNum = 34537486;BA.debugLine="cacheAuditInProgress = True";
__ref._cacheauditinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=34537487;
 //BA.debugLineNum = 34537487;BA.debugLine="End Sub";
return "";
}
public boolean  _runcacheauditstep(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "runcacheauditstep", false))
	 {return ((Boolean) Debug.delegate(ba, "runcacheauditstep", null));}
RDebugUtils.currentLine=34603008;
 //BA.debugLineNum = 34603008;BA.debugLine="Public Sub RunCacheAuditStep As Boolean";
RDebugUtils.currentLine=34603009;
 //BA.debugLineNum = 34603009;BA.debugLine="If cacheAuditInProgress = False Then Return False";
if (__ref._cacheauditinprogress /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=34603010;
 //BA.debugLineNum = 34603010;BA.debugLine="If cacheAuditCurrentType = \"\" Then";
if ((__ref._cacheauditcurrenttype /*String*/ ).equals("")) { 
RDebugUtils.currentLine=34603011;
 //BA.debugLineNum = 34603011;BA.debugLine="If PrepareNextCacheAuditType = False Then";
if (__ref._preparenextcacheaudittype /*boolean*/ (null)==__c.False) { 
RDebugUtils.currentLine=34603012;
 //BA.debugLineNum = 34603012;BA.debugLine="FinishCacheAudit";
__ref._finishcacheaudit /*String*/ (null);
RDebugUtils.currentLine=34603013;
 //BA.debugLineNum = 34603013;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
RDebugUtils.currentLine=34603016;
 //BA.debugLineNum = 34603016;BA.debugLine="ProcessCurrentCacheAuditBatch";
__ref._processcurrentcacheauditbatch /*String*/ (null);
RDebugUtils.currentLine=34603017;
 //BA.debugLineNum = 34603017;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurrent";
if (__ref._cacheauditcurrentposition /*int*/ >=__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=34603018;
 //BA.debugLineNum = 34603018;BA.debugLine="FinalizeCurrentCacheAuditType";
__ref._finalizecurrentcacheaudittype /*String*/ (null);
RDebugUtils.currentLine=34603019;
 //BA.debugLineNum = 34603019;BA.debugLine="cacheAuditCurrentType = \"\"";
__ref._cacheauditcurrenttype /*String*/  = "";
RDebugUtils.currentLine=34603020;
 //BA.debugLineNum = 34603020;BA.debugLine="If cacheAuditPendingTypes.Size = 0 Then";
if (__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
RDebugUtils.currentLine=34603021;
 //BA.debugLineNum = 34603021;BA.debugLine="FinishCacheAudit";
__ref._finishcacheaudit /*String*/ (null);
RDebugUtils.currentLine=34603022;
 //BA.debugLineNum = 34603022;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
RDebugUtils.currentLine=34603025;
 //BA.debugLineNum = 34603025;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=34603026;
 //BA.debugLineNum = 34603026;BA.debugLine="End Sub";
return false;
}
public String  _flushpendingindexsaves(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "flushpendingindexsaves", false))
	 {return ((String) Debug.delegate(ba, "flushpendingindexsaves", null));}
RDebugUtils.currentLine=35389440;
 //BA.debugLineNum = 35389440;BA.debugLine="Public Sub FlushPendingIndexSaves";
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="If cachedAdIndexDirty Then SaveAdIndex";
if (__ref._cachedadindexdirty /*boolean*/ ) { 
__ref._saveadindex /*String*/ (null);};
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="If cachedTrackIndexDirty Then SaveTrackIndex";
if (__ref._cachedtrackindexdirty /*boolean*/ ) { 
__ref._savetrackindex /*String*/ (null);};
RDebugUtils.currentLine=35389443;
 //BA.debugLineNum = 35389443;BA.debugLine="End Sub";
return "";
}
public String  _cleanupplaybacktempfiles(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "cleanupplaybacktempfiles", false))
	 {return ((String) Debug.delegate(ba, "cleanupplaybacktempfiles", null));}
RDebugUtils.currentLine=34865152;
 //BA.debugLineNum = 34865152;BA.debugLine="Public Sub CleanupPlaybackTempFiles";
RDebugUtils.currentLine=34865153;
 //BA.debugLineNum = 34865153;BA.debugLine="DeleteFileIfExists(File.DirTemp, PRIMARY_TEMP_TRA";
__ref._deletefileifexists /*String*/ (null,__c.File.getDirTemp(),__ref._primary_temp_track_file /*String*/ );
RDebugUtils.currentLine=34865154;
 //BA.debugLineNum = 34865154;BA.debugLine="DeleteFileIfExists(File.DirTemp, SECONDARY_TEMP_T";
__ref._deletefileifexists /*String*/ (null,__c.File.getDirTemp(),__ref._secondary_temp_track_file /*String*/ );
RDebugUtils.currentLine=34865155;
 //BA.debugLineNum = 34865155;BA.debugLine="playbackTempTrackIds.Clear";
__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=34865156;
 //BA.debugLineNum = 34865156;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensureadscached(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensureadscached", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensureadscached", new Object[] {_offlinedata}));}
ResumableSub_EnsureAdsCached rsub = new ResumableSub_EnsureAdsCached(this,__ref,_offlinedata);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureAdsCached extends BA.ResumableSub {
public ResumableSub_EnsureAdsCached(b4j.example.mediacache parent,b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) {
this.parent = parent;
this.__ref = __ref;
this._offlinedata = _offlinedata;
this.__ref = parent;
}
b4j.example.mediacache __ref;
b4j.example.mediacache parent;
anywheresoftware.b4a.objects.collections.Map _offlinedata;
anywheresoftware.b4a.objects.collections.List _ads = null;
anywheresoftware.b4a.objects.collections.Map _actualadids = null;
int _downloadedcount = 0;
int _failedcount = 0;
Object _adobject = null;
anywheresoftware.b4a.objects.collections.Map _ad = null;
String _adid = "";
boolean _downloaded = false;
int _removedcount = 0;
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mediacache";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=34668545;
 //BA.debugLineNum = 34668545;BA.debugLine="FlushPendingIndexSaves";
__ref._flushpendingindexsaves /*String*/ (null);
RDebugUtils.currentLine=34668546;
 //BA.debugLineNum = 34668546;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_offlinedata.IsInitialized()==parent.__c.False) { 
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
RDebugUtils.currentLine=34668547;
 //BA.debugLineNum = 34668547;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if (true) break;

case 7:
//if
this.state = 12;
if ((_offlinedata.GetDefault((Object)("ok"),(Object)(parent.__c.False))).equals((Object)(parent.__c.True)) == false) { 
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
this.state = 13;
;
RDebugUtils.currentLine=34668548;
 //BA.debugLineNum = 34668548;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("ads"),parent.__c.Null)));
RDebugUtils.currentLine=34668549;
 //BA.debugLineNum = 34668549;BA.debugLine="Dim cachedAdIndex As Map = GetCachedAdIndex";
parent._cachedadindex = new anywheresoftware.b4a.objects.collections.Map();
parent._cachedadindex = __ref._getcachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=34668550;
 //BA.debugLineNum = 34668550;BA.debugLine="Dim actualAdIds As Map";
_actualadids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34668551;
 //BA.debugLineNum = 34668551;BA.debugLine="actualAdIds.Initialize";
_actualadids.Initialize();
RDebugUtils.currentLine=34668552;
 //BA.debugLineNum = 34668552;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
RDebugUtils.currentLine=34668553;
 //BA.debugLineNum = 34668553;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
RDebugUtils.currentLine=34668554;
 //BA.debugLineNum = 34668554;BA.debugLine="If ads.IsInitialized Then";
if (true) break;

case 13:
//if
this.state = 36;
if (_ads.IsInitialized()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=34668555;
 //BA.debugLineNum = 34668555;BA.debugLine="For Each adObject As Object In ads";
if (true) break;

case 16:
//for
this.state = 35;
group11 = _ads;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 35;
if (index11 < groupLen11) {
this.state = 18;
_adobject = group11.Get(index11);}
if (true) break;

case 38:
//C
this.state = 37;
index11++;
if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=34668556;
 //BA.debugLineNum = 34668556;BA.debugLine="If adObject Is Map Then";
if (true) break;

case 19:
//if
this.state = 34;
if (_adobject instanceof java.util.Map) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=34668557;
 //BA.debugLineNum = 34668557;BA.debugLine="Dim ad As Map = adObject";
_ad = new anywheresoftware.b4a.objects.collections.Map();
_ad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adobject));
RDebugUtils.currentLine=34668558;
 //BA.debugLineNum = 34668558;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=34668559;
 //BA.debugLineNum = 34668559;BA.debugLine="If adId = \"\" Then Continue";
if (true) break;

case 22:
//if
this.state = 27;
if ((_adid).equals("")) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
this.state = 38;
if (true) break;;
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=34668560;
 //BA.debugLineNum = 34668560;BA.debugLine="actualAdIds.Put(adId, True)";
_actualadids.Put((Object)(_adid),(Object)(parent.__c.True));
RDebugUtils.currentLine=34668561;
 //BA.debugLineNum = 34668561;BA.debugLine="Wait For (EnsureSingleAdCached(ad, cachedAdInd";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensureadscached"), __ref._ensuresingleadcached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_ad,__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ));
this.state = 39;
return;
case 39:
//C
this.state = 28;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=34668562;
 //BA.debugLineNum = 34668562;BA.debugLine="If downloaded Then";
if (true) break;

case 28:
//if
this.state = 33;
if (_downloaded) { 
this.state = 30;
}else 
{RDebugUtils.currentLine=34668564;
 //BA.debugLineNum = 34668564;BA.debugLine="Else If IsAdCached(adId) = False Then";
if (__ref._isadcached /*boolean*/ (null,_adid)==parent.__c.False) { 
this.state = 32;
}}
if (true) break;

case 30:
//C
this.state = 33;
RDebugUtils.currentLine=34668563;
 //BA.debugLineNum = 34668563;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=34668565;
 //BA.debugLineNum = 34668565;BA.debugLine="failedCount = failedCount + 1";
_failedcount = (int) (_failedcount+1);
 if (true) break;

case 33:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = 38;
;
 if (true) break;
if (true) break;

case 35:
//C
this.state = 36;
;
 if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=34668570;
 //BA.debugLineNum = 34668570;BA.debugLine="Dim removedCount As Int = PruneMissingAds(cachedA";
_removedcount = __ref._prunemissingads /*int*/ (null,__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ,_actualadids);
RDebugUtils.currentLine=34668571;
 //BA.debugLineNum = 34668571;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
RDebugUtils.currentLine=34668572;
 //BA.debugLineNum = 34668572;BA.debugLine="Trace(\"ad cache sync done downloaded=\" & download";
__ref._trace /*String*/ (null,"ad cache sync done downloaded="+BA.NumberToString(_downloadedcount)+" failed="+BA.NumberToString(_failedcount)+" removed="+BA.NumberToString(_removedcount)+" actual="+BA.NumberToString(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=34668573;
 //BA.debugLineNum = 34668573;BA.debugLine="Return downloadedCount > 0 Or removedCount > 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloadedcount>0 || _removedcount>0));return;};
RDebugUtils.currentLine=34668574;
 //BA.debugLineNum = 34668574;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _istrackcached(b4j.example.mediacache __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "istrackcached", false))
	 {return ((Boolean) Debug.delegate(ba, "istrackcached", new Object[] {_trackid}));}
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="Return ValidateIndexedFile(\"track\", trackId)";
if (true) return __ref._validateindexedfile /*boolean*/ (null,"track",_trackid);
RDebugUtils.currentLine=35192835;
 //BA.debugLineNum = 35192835;BA.debugLine="End Sub";
return false;
}
public boolean  _isadcached(b4j.example.mediacache __ref,String _adid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "isadcached", false))
	 {return ((Boolean) Debug.delegate(ba, "isadcached", new Object[] {_adid}));}
RDebugUtils.currentLine=34996224;
 //BA.debugLineNum = 34996224;BA.debugLine="Public Sub IsAdCached(adId As String) As Boolean";
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="If adId = \"\" Then Return False";
if ((_adid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="Return ValidateIndexedFile(\"ad\", adId)";
if (true) return __ref._validateindexedfile /*boolean*/ (null,"ad",_adid);
RDebugUtils.currentLine=34996227;
 //BA.debugLineNum = 34996227;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.mediacache __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,b4j.example.keyvaluestore _storagevalue,Object _targetmodulevalue,String _tracesubnamevalue,String _deviceidvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_storagevalue,_targetmodulevalue,_tracesubnamevalue,_deviceidvalue}));}
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="storage = storageValue";
__ref._storage /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=34406403;
 //BA.debugLineNum = 34406403;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=34406404;
 //BA.debugLineNum = 34406404;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=34406405;
 //BA.debugLineNum = 34406405;BA.debugLine="playbackTempTrackIds.Initialize";
__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=34406406;
 //BA.debugLineNum = 34406406;BA.debugLine="cachedTrackPlaylistStats.Initialize";
__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=34406407;
 //BA.debugLineNum = 34406407;BA.debugLine="cachedAdIndexDirty = False";
__ref._cachedadindexdirty /*boolean*/  = __c.False;
RDebugUtils.currentLine=34406408;
 //BA.debugLineNum = 34406408;BA.debugLine="cachedTrackIndexDirty = False";
__ref._cachedtrackindexdirty /*boolean*/  = __c.False;
RDebugUtils.currentLine=34406409;
 //BA.debugLineNum = 34406409;BA.debugLine="EnsureDirectory(GetAdsDir)";
__ref._ensuredirectory /*String*/ (null,__ref._getadsdir /*String*/ (null));
RDebugUtils.currentLine=34406410;
 //BA.debugLineNum = 34406410;BA.debugLine="EnsureDirectory(GetTracksDir)";
__ref._ensuredirectory /*String*/ (null,__ref._gettracksdir /*String*/ (null));
RDebugUtils.currentLine=34406411;
 //BA.debugLineNum = 34406411;BA.debugLine="LoadIndexesFromStorage";
__ref._loadindexesfromstorage /*String*/ (null);
RDebugUtils.currentLine=34406412;
 //BA.debugLineNum = 34406412;BA.debugLine="End Sub";
return "";
}
public String  _resolvelocalmediauri(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvelocalmediauri", false))
	 {return ((String) Debug.delegate(ba, "resolvelocalmediauri", new Object[] {_item}));}
String _itemtype = "";
String _itemid = "";
RDebugUtils.currentLine=34734080;
 //BA.debugLineNum = 34734080;BA.debugLine="Public Sub ResolveLocalMediaUri(item As Map) As St";
RDebugUtils.currentLine=34734081;
 //BA.debugLineNum = 34734081;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=34734082;
 //BA.debugLineNum = 34734082;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=34734083;
 //BA.debugLineNum = 34734083;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=34734084;
 //BA.debugLineNum = 34734084;BA.debugLine="If itemId = \"\" Then Return \"\"";
if ((_itemid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=34734085;
 //BA.debugLineNum = 34734085;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=34734086;
 //BA.debugLineNum = 34734086;BA.debugLine="If itemType = \"ad\" Then Return File.GetUri(GetAds";
if ((_itemtype).equals("ad")) { 
if (true) return __c.File.GetUri(__ref._getadsdir /*String*/ (null),_itemid);};
RDebugUtils.currentLine=34734087;
 //BA.debugLineNum = 34734087;BA.debugLine="If itemType = \"track\" Then Return ResolveRelative";
if ((_itemtype).equals("track")) { 
if (true) return __ref._resolverelativefileuri /*String*/ (null,__ref._gettracksdir /*String*/ (null),__ref._resolvetrackrelativefilenamefromitem /*String*/ (null,_item));};
RDebugUtils.currentLine=34734088;
 //BA.debugLineNum = 34734088;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=34734089;
 //BA.debugLineNum = 34734089;BA.debugLine="End Sub";
return "";
}
public boolean  _hasvalidatedlocalmedia(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "hasvalidatedlocalmedia", false))
	 {return ((Boolean) Debug.delegate(ba, "hasvalidatedlocalmedia", new Object[] {_item}));}
String _itemid = "";
String _itemtype = "";
String _preferredrelativename = "";
RDebugUtils.currentLine=34930688;
 //BA.debugLineNum = 34930688;BA.debugLine="Public Sub HasValidatedLocalMedia(item As Map) As";
RDebugUtils.currentLine=34930689;
 //BA.debugLineNum = 34930689;BA.debugLine="If item.IsInitialized = False Then Return False";
if (_item.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=34930690;
 //BA.debugLineNum = 34930690;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=34930691;
 //BA.debugLineNum = 34930691;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=34930692;
 //BA.debugLineNum = 34930692;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=34930693;
 //BA.debugLineNum = 34930693;BA.debugLine="If itemType = \"ad\" Then Return ValidateIndexedFil";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._validateindexedfile /*boolean*/ (null,"ad",_itemid);};
RDebugUtils.currentLine=34930694;
 //BA.debugLineNum = 34930694;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=34930695;
 //BA.debugLineNum = 34930695;BA.debugLine="Dim preferredRelativeName As String = ResolveTra";
_preferredrelativename = __ref._resolvetrackrelativefilenamefromitem /*String*/ (null,_item);
RDebugUtils.currentLine=34930696;
 //BA.debugLineNum = 34930696;BA.debugLine="If IsCachedFileUsable(GetTracksDir, preferredRel";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_preferredrelativename)) { 
RDebugUtils.currentLine=34930697;
 //BA.debugLineNum = 34930697;BA.debugLine="EnsureTrackIndexEntry(itemId, item.GetDefault(\"";
__ref._ensuretrackindexentry /*String*/ (null,_itemid,BA.ObjectToString(_item.GetDefault((Object)("playlist_id"),(Object)(""))),_preferredrelativename);
RDebugUtils.currentLine=34930698;
 //BA.debugLineNum = 34930698;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=34930700;
 //BA.debugLineNum = 34930700;BA.debugLine="Return ValidateIndexedFile(\"track\", itemId)";
if (true) return __ref._validateindexedfile /*boolean*/ (null,"track",_itemid);
 };
RDebugUtils.currentLine=34930702;
 //BA.debugLineNum = 34930702;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=34930703;
 //BA.debugLineNum = 34930703;BA.debugLine="End Sub";
return false;
}
public int  _prunetrackcacheifneeded(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.List _protectedtrackids,anywheresoftware.b4a.objects.collections.List _relevanttrackids) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "prunetrackcacheifneeded", false))
	 {return ((Integer) Debug.delegate(ba, "prunetrackcacheifneeded", new Object[] {_protectedtrackids,_relevanttrackids}));}
anywheresoftware.b4a.objects.collections.Map _protectedids = null;
anywheresoftware.b4a.objects.collections.Map _relevantids = null;
anywheresoftware.b4a.objects.collections.Map _summary = null;
long _cachebytes = 0L;
long _freebytes = 0L;
long _totalbytes = 0L;
long _minfreebytes = 0L;
long _hardlimitbytes = 0L;
long _targetbytes = 0L;
boolean _needprune = false;
int _removedcount = 0;
anywheresoftware.b4a.objects.collections.List _candidates = null;
anywheresoftware.b4a.objects.collections.List _nonrelevantcandidates = null;
anywheresoftware.b4a.objects.collections.List _relevantcandidates = null;
Object _candidateobject = null;
anywheresoftware.b4a.objects.collections.Map _candidate = null;
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Public Sub PruneTrackCacheIfNeeded(protectedTrackI";
RDebugUtils.currentLine=35454977;
 //BA.debugLineNum = 35454977;BA.debugLine="Dim protectedIds As Map = CreateTrackIdSet(protec";
_protectedids = new anywheresoftware.b4a.objects.collections.Map();
_protectedids = __ref._createtrackidset /*anywheresoftware.b4a.objects.collections.Map*/ (null,_protectedtrackids);
RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="Dim relevantIds As Map = CreateTrackIdSet(relevan";
_relevantids = new anywheresoftware.b4a.objects.collections.Map();
_relevantids = __ref._createtrackidset /*anywheresoftware.b4a.objects.collections.Map*/ (null,_relevanttrackids);
RDebugUtils.currentLine=35454979;
 //BA.debugLineNum = 35454979;BA.debugLine="Dim summary As Map = BuildTrackCacheSummary(prote";
_summary = new anywheresoftware.b4a.objects.collections.Map();
_summary = __ref._buildtrackcachesummary /*anywheresoftware.b4a.objects.collections.Map*/ (null,_protectedids,_relevantids);
RDebugUtils.currentLine=35454980;
 //BA.debugLineNum = 35454980;BA.debugLine="Dim cacheBytes As Long = summary.GetDefault(\"cach";
_cachebytes = BA.ObjectToLongNumber(_summary.GetDefault((Object)("cache_bytes"),(Object)(0)));
RDebugUtils.currentLine=35454981;
 //BA.debugLineNum = 35454981;BA.debugLine="Dim freeBytes As Long = GetDriveUsableSpace(stora";
_freebytes = __ref._getdriveusablespace /*long*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=35454982;
 //BA.debugLineNum = 35454982;BA.debugLine="Dim totalBytes As Long = GetDriveTotalSpace(stora";
_totalbytes = __ref._getdrivetotalspace /*long*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=35454983;
 //BA.debugLineNum = 35454983;BA.debugLine="Dim minFreeBytes As Long = ResolveMinFreeDiskByte";
_minfreebytes = __ref._resolveminfreediskbytes /*long*/ (null,_totalbytes);
RDebugUtils.currentLine=35454984;
 //BA.debugLineNum = 35454984;BA.debugLine="Dim hardLimitBytes As Long = MbToBytes(TRACK_CACH";
_hardlimitbytes = __ref._mbtobytes /*long*/ (null,__ref._track_cache_hard_limit_mb /*long*/ );
RDebugUtils.currentLine=35454985;
 //BA.debugLineNum = 35454985;BA.debugLine="Dim targetBytes As Long = MbToBytes(TRACK_CACHE_T";
_targetbytes = __ref._mbtobytes /*long*/ (null,__ref._track_cache_target_mb /*long*/ );
RDebugUtils.currentLine=35454986;
 //BA.debugLineNum = 35454986;BA.debugLine="Dim needPrune As Boolean = (cacheBytes > hardLimi";
_needprune = (_cachebytes>_hardlimitbytes) || (_freebytes>0 && _freebytes<_minfreebytes);
RDebugUtils.currentLine=35454987;
 //BA.debugLineNum = 35454987;BA.debugLine="If needPrune = False Then";
if (_needprune==__c.False) { 
RDebugUtils.currentLine=35454988;
 //BA.debugLineNum = 35454988;BA.debugLine="Return 0";
if (true) return (int) (0);
 };
RDebugUtils.currentLine=35454990;
 //BA.debugLineNum = 35454990;BA.debugLine="Dim removedCount As Int = 0";
_removedcount = (int) (0);
RDebugUtils.currentLine=35454991;
 //BA.debugLineNum = 35454991;BA.debugLine="Dim candidates As List = summary.GetDefault(\"cand";
_candidates = new anywheresoftware.b4a.objects.collections.List();
_candidates = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_summary.GetDefault((Object)("candidates"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()))));
RDebugUtils.currentLine=35454992;
 //BA.debugLineNum = 35454992;BA.debugLine="Dim nonRelevantCandidates As List";
_nonrelevantcandidates = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35454993;
 //BA.debugLineNum = 35454993;BA.debugLine="nonRelevantCandidates.Initialize";
_nonrelevantcandidates.Initialize();
RDebugUtils.currentLine=35454994;
 //BA.debugLineNum = 35454994;BA.debugLine="Dim relevantCandidates As List";
_relevantcandidates = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35454995;
 //BA.debugLineNum = 35454995;BA.debugLine="relevantCandidates.Initialize";
_relevantcandidates.Initialize();
RDebugUtils.currentLine=35454996;
 //BA.debugLineNum = 35454996;BA.debugLine="For Each candidateObject As Object In candidates";
{
final anywheresoftware.b4a.BA.IterableList group20 = _candidates;
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_candidateobject = group20.Get(index20);
RDebugUtils.currentLine=35454997;
 //BA.debugLineNum = 35454997;BA.debugLine="If (candidateObject Is Map) = False Then Continu";
if ((_candidateobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=35454998;
 //BA.debugLineNum = 35454998;BA.debugLine="Dim candidate As Map = candidateObject";
_candidate = new anywheresoftware.b4a.objects.collections.Map();
_candidate = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_candidateobject));
RDebugUtils.currentLine=35454999;
 //BA.debugLineNum = 35454999;BA.debugLine="If candidate.GetDefault(\"is_relevant\", False) Th";
if (BA.ObjectToBoolean(_candidate.GetDefault((Object)("is_relevant"),(Object)(__c.False)))) { 
RDebugUtils.currentLine=35455000;
 //BA.debugLineNum = 35455000;BA.debugLine="relevantCandidates.Add(candidate)";
_relevantcandidates.Add((Object)(_candidate.getObject()));
 }else {
RDebugUtils.currentLine=35455002;
 //BA.debugLineNum = 35455002;BA.debugLine="nonRelevantCandidates.Add(candidate)";
_nonrelevantcandidates.Add((Object)(_candidate.getObject()));
 };
 }
};
RDebugUtils.currentLine=35455005;
 //BA.debugLineNum = 35455005;BA.debugLine="SortTrackPruneCandidates(nonRelevantCandidates)";
__ref._sorttrackprunecandidates /*String*/ (null,_nonrelevantcandidates);
RDebugUtils.currentLine=35455006;
 //BA.debugLineNum = 35455006;BA.debugLine="SortTrackPruneCandidates(relevantCandidates)";
__ref._sorttrackprunecandidates /*String*/ (null,_relevantcandidates);
RDebugUtils.currentLine=35455010;
 //BA.debugLineNum = 35455010;BA.debugLine="removedCount = removedCount + PruneTrackCandidate";
_removedcount = (int) (_removedcount+__ref._prunetrackcandidates /*int*/ (null,_nonrelevantcandidates,_cachebytes,_freebytes,_targetbytes,_minfreebytes));
RDebugUtils.currentLine=35455011;
 //BA.debugLineNum = 35455011;BA.debugLine="cacheBytes = pruneLastCacheBytes";
_cachebytes = __ref._prunelastcachebytes /*long*/ ;
RDebugUtils.currentLine=35455012;
 //BA.debugLineNum = 35455012;BA.debugLine="freeBytes = pruneLastFreeBytes";
_freebytes = __ref._prunelastfreebytes /*long*/ ;
RDebugUtils.currentLine=35455013;
 //BA.debugLineNum = 35455013;BA.debugLine="If cacheBytes > targetBytes Or (freeBytes > 0 And";
if (_cachebytes>_targetbytes || (_freebytes>0 && _freebytes<_minfreebytes)) { 
RDebugUtils.currentLine=35455014;
 //BA.debugLineNum = 35455014;BA.debugLine="removedCount = removedCount + PruneTrackCandidat";
_removedcount = (int) (_removedcount+__ref._prunetrackcandidates /*int*/ (null,_relevantcandidates,_cachebytes,_freebytes,_targetbytes,_minfreebytes));
RDebugUtils.currentLine=35455015;
 //BA.debugLineNum = 35455015;BA.debugLine="cacheBytes = pruneLastCacheBytes";
_cachebytes = __ref._prunelastcachebytes /*long*/ ;
RDebugUtils.currentLine=35455016;
 //BA.debugLineNum = 35455016;BA.debugLine="freeBytes = pruneLastFreeBytes";
_freebytes = __ref._prunelastfreebytes /*long*/ ;
 };
RDebugUtils.currentLine=35455018;
 //BA.debugLineNum = 35455018;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
RDebugUtils.currentLine=35455019;
 //BA.debugLineNum = 35455019;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=35455020;
 //BA.debugLineNum = 35455020;BA.debugLine="Trace(\"Очистка кэша треков завершена. removed=\"";
__ref._trace /*String*/ (null,"Очистка кэша треков завершена. removed="+BA.NumberToString(_removedcount)+", cacheMb="+BA.NumberToString(__ref._bytestomb /*long*/ (null,_cachebytes))+", freeMb="+BA.NumberToString(__ref._bytestomb /*long*/ (null,_freebytes)));
 }else {
RDebugUtils.currentLine=35455022;
 //BA.debugLineNum = 35455022;BA.debugLine="Trace(\"Очистка кэша треков пропущена: нет подход";
__ref._trace /*String*/ (null,"Очистка кэша треков пропущена: нет подходящих кандидатов. cacheMb="+BA.NumberToString(__ref._bytestomb /*long*/ (null,_cachebytes))+", freeMb="+BA.NumberToString(__ref._bytestomb /*long*/ (null,_freebytes)));
 };
RDebugUtils.currentLine=35455024;
 //BA.debugLineNum = 35455024;BA.debugLine="Return removedCount";
if (true) return _removedcount;
RDebugUtils.currentLine=35455025;
 //BA.debugLineNum = 35455025;BA.debugLine="End Sub";
return 0;
}
public int  _getcachedadcount(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedadcount", false))
	 {return ((Integer) Debug.delegate(ba, "getcachedadcount", null));}
RDebugUtils.currentLine=83034112;
 //BA.debugLineNum = 83034112;BA.debugLine="Public Sub GetCachedAdCount As Int";
RDebugUtils.currentLine=83034113;
 //BA.debugLineNum = 83034113;BA.debugLine="Return cachedAdCount";
if (true) return __ref._cachedadcount /*int*/ ;
RDebugUtils.currentLine=83034114;
 //BA.debugLineNum = 83034114;BA.debugLine="End Sub";
return 0;
}
public long  _getcachedadbytes(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedadbytes", false))
	 {return ((Long) Debug.delegate(ba, "getcachedadbytes", null));}
RDebugUtils.currentLine=83165184;
 //BA.debugLineNum = 83165184;BA.debugLine="Public Sub GetCachedAdBytes As Long";
RDebugUtils.currentLine=83165185;
 //BA.debugLineNum = 83165185;BA.debugLine="Return cachedAdBytes";
if (true) return __ref._cachedadbytes /*long*/ ;
RDebugUtils.currentLine=83165186;
 //BA.debugLineNum = 83165186;BA.debugLine="End Sub";
return 0L;
}
public String  _resolveplaybackmediauri(b4j.example.mediacache __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveplaybackmediauri", false))
	 {return ((String) Debug.delegate(ba, "resolveplaybackmediauri", new Object[] {_audiokey,_item}));}
String _itemtype = "";
String _trackid = "";
RDebugUtils.currentLine=34799616;
 //BA.debugLineNum = 34799616;BA.debugLine="Public Sub ResolvePlaybackMediaUri(audioKey As Str";
RDebugUtils.currentLine=34799617;
 //BA.debugLineNum = 34799617;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=34799618;
 //BA.debugLineNum = 34799618;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=34799619;
 //BA.debugLineNum = 34799619;BA.debugLine="If itemType = \"ad\" Then Return ResolveLocalMediaU";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._resolvelocalmediauri /*String*/ (null,_item);};
RDebugUtils.currentLine=34799620;
 //BA.debugLineNum = 34799620;BA.debugLine="If itemType <> \"track\" Then Return \"\"";
if ((_itemtype).equals("track") == false) { 
if (true) return "";};
RDebugUtils.currentLine=34799621;
 //BA.debugLineNum = 34799621;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=34799622;
 //BA.debugLineNum = 34799622;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=34799623;
 //BA.debugLineNum = 34799623;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=34799624;
 //BA.debugLineNum = 34799624;BA.debugLine="If EnsureTrackPlaybackTemp(audioKey, item) = Fals";
if (__ref._ensuretrackplaybacktemp /*boolean*/ (null,_audiokey,_item)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=34799625;
 //BA.debugLineNum = 34799625;BA.debugLine="Return File.GetUri(File.DirTemp, BuildPlaybackTem";
if (true) return __c.File.GetUri(__c.File.getDirTemp(),__ref._buildplaybacktemptrackfilename /*String*/ (null,_audiokey));
RDebugUtils.currentLine=34799626;
 //BA.debugLineNum = 34799626;BA.debugLine="End Sub";
return "";
}
public int  _getcachedtrackcount(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedtrackcount", false))
	 {return ((Integer) Debug.delegate(ba, "getcachedtrackcount", null));}
RDebugUtils.currentLine=82968576;
 //BA.debugLineNum = 82968576;BA.debugLine="Public Sub GetCachedTrackCount As Int";
RDebugUtils.currentLine=82968577;
 //BA.debugLineNum = 82968577;BA.debugLine="Return cachedTrackCount";
if (true) return __ref._cachedtrackcount /*int*/ ;
RDebugUtils.currentLine=82968578;
 //BA.debugLineNum = 82968578;BA.debugLine="End Sub";
return 0;
}
public long  _getcachedtrackbytes(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedtrackbytes", false))
	 {return ((Long) Debug.delegate(ba, "getcachedtrackbytes", null));}
RDebugUtils.currentLine=83099648;
 //BA.debugLineNum = 83099648;BA.debugLine="Public Sub GetCachedTrackBytes As Long";
RDebugUtils.currentLine=83099649;
 //BA.debugLineNum = 83099649;BA.debugLine="Return cachedTrackBytes";
if (true) return __ref._cachedtrackbytes /*long*/ ;
RDebugUtils.currentLine=83099650;
 //BA.debugLineNum = 83099650;BA.debugLine="End Sub";
return 0L;
}
public String  _resolvemediasource(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvemediasource", false))
	 {return ((String) Debug.delegate(ba, "resolvemediasource", new Object[] {_item}));}
String _itemtype = "";
RDebugUtils.currentLine=37158912;
 //BA.debugLineNum = 37158912;BA.debugLine="Public Sub ResolveMediaSource(item As Map) As Stri";
RDebugUtils.currentLine=37158913;
 //BA.debugLineNum = 37158913;BA.debugLine="If item.IsInitialized = False Then Return \"none\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "none";};
RDebugUtils.currentLine=37158914;
 //BA.debugLineNum = 37158914;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=37158915;
 //BA.debugLineNum = 37158915;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=37158916;
 //BA.debugLineNum = 37158916;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)) { 
if (true) return "cache";};
RDebugUtils.currentLine=37158917;
 //BA.debugLineNum = 37158917;BA.debugLine="Return \"missing\"";
if (true) return "missing";
 };
RDebugUtils.currentLine=37158919;
 //BA.debugLineNum = 37158919;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=37158920;
 //BA.debugLineNum = 37158920;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)) { 
if (true) return "cache";};
RDebugUtils.currentLine=37158921;
 //BA.debugLineNum = 37158921;BA.debugLine="Return \"missing\"";
if (true) return "missing";
 };
RDebugUtils.currentLine=37158923;
 //BA.debugLineNum = 37158923;BA.debugLine="Return \"none\"";
if (true) return "none";
RDebugUtils.currentLine=37158924;
 //BA.debugLineNum = 37158924;BA.debugLine="End Sub";
return "";
}
public boolean  _consumerecentmedianetworkfailure(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "consumerecentmedianetworkfailure", false))
	 {return ((Boolean) Debug.delegate(ba, "consumerecentmedianetworkfailure", null));}
boolean _value = false;
RDebugUtils.currentLine=35323904;
 //BA.debugLineNum = 35323904;BA.debugLine="Public Sub ConsumeRecentMediaNetworkFailure As Boo";
RDebugUtils.currentLine=35323905;
 //BA.debugLineNum = 35323905;BA.debugLine="Dim value As Boolean = recentMediaNetworkFailure";
_value = __ref._recentmedianetworkfailure /*boolean*/ ;
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="recentMediaNetworkFailure = False";
__ref._recentmedianetworkfailure /*boolean*/  = __c.False;
RDebugUtils.currentLine=35323907;
 //BA.debugLineNum = 35323907;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=35323908;
 //BA.debugLineNum = 35323908;BA.debugLine="End Sub";
return false;
}
public String  _ensuretrackcacheready(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuretrackcacheready", false))
	 {return ((String) Debug.delegate(ba, "ensuretrackcacheready", null));}
int _actualtrackfiles = 0;
RDebugUtils.currentLine=85786624;
 //BA.debugLineNum = 85786624;BA.debugLine="Public Sub EnsureTrackCacheReady";
RDebugUtils.currentLine=85786625;
 //BA.debugLineNum = 85786625;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (__ref._directoryexists /*boolean*/ (null,__ref._gettracksdir /*String*/ (null))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=85786626;
 //BA.debugLineNum = 85786626;BA.debugLine="Dim actualTrackFiles As Int = CountTrackFilesOnDi";
_actualtrackfiles = __ref._counttrackfilesondisk /*int*/ (null);
RDebugUtils.currentLine=85786627;
 //BA.debugLineNum = 85786627;BA.debugLine="If actualTrackFiles = 0 Then Return";
if (_actualtrackfiles==0) { 
if (true) return "";};
RDebugUtils.currentLine=85786628;
 //BA.debugLineNum = 85786628;BA.debugLine="If cachedTrackCount = actualTrackFiles And cached";
if (__ref._cachedtrackcount /*int*/ ==_actualtrackfiles && __ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
if (true) return "";};
RDebugUtils.currentLine=85786629;
 //BA.debugLineNum = 85786629;BA.debugLine="BackfillTrackIndexFromFiles";
__ref._backfilltrackindexfromfiles /*String*/ (null);
RDebugUtils.currentLine=85786630;
 //BA.debugLineNum = 85786630;BA.debugLine="RebuildCacheStatsFromIndexes";
__ref._rebuildcachestatsfromindexes /*String*/ (null);
RDebugUtils.currentLine=85786631;
 //BA.debugLineNum = 85786631;BA.debugLine="SaveCacheStatsSnapshot";
__ref._savecachestatssnapshot /*String*/ (null);
RDebugUtils.currentLine=85786632;
 //BA.debugLineNum = 85786632;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedtrackplayliststats(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedtrackplayliststats", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedtrackplayliststats", null));}
anywheresoftware.b4a.objects.collections.Map _result = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _sourceentry = null;
anywheresoftware.b4a.objects.collections.Map _copyentry = null;
RDebugUtils.currentLine=83296256;
 //BA.debugLineNum = 83296256;BA.debugLine="Public Sub GetCachedTrackPlaylistStats As Map";
RDebugUtils.currentLine=83296257;
 //BA.debugLineNum = 83296257;BA.debugLine="EnsureTrackCacheReady";
__ref._ensuretrackcacheready /*String*/ (null);
RDebugUtils.currentLine=83296258;
 //BA.debugLineNum = 83296258;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=83296259;
 //BA.debugLineNum = 83296259;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=83296260;
 //BA.debugLineNum = 83296260;BA.debugLine="For Each playlistId As String In cachedTrackPlayl";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_playlistid = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=83296261;
 //BA.debugLineNum = 83296261;BA.debugLine="Dim sourceEntry As Map = cachedTrackPlaylistStat";
_sourceentry = new anywheresoftware.b4a.objects.collections.Map();
_sourceentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_playlistid))));
RDebugUtils.currentLine=83296262;
 //BA.debugLineNum = 83296262;BA.debugLine="Dim copyEntry As Map";
_copyentry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=83296263;
 //BA.debugLineNum = 83296263;BA.debugLine="copyEntry.Initialize";
_copyentry.Initialize();
RDebugUtils.currentLine=83296264;
 //BA.debugLineNum = 83296264;BA.debugLine="If sourceEntry.IsInitialized Then";
if (_sourceentry.IsInitialized()) { 
RDebugUtils.currentLine=83296265;
 //BA.debugLineNum = 83296265;BA.debugLine="copyEntry.Put(\"count\", sourceEntry.GetDefault(\"";
_copyentry.Put((Object)("count"),_sourceentry.GetDefault((Object)("count"),(Object)(0)));
RDebugUtils.currentLine=83296266;
 //BA.debugLineNum = 83296266;BA.debugLine="copyEntry.Put(\"bytes\", sourceEntry.GetDefault(\"";
_copyentry.Put((Object)("bytes"),_sourceentry.GetDefault((Object)("bytes"),(Object)(0)));
 };
RDebugUtils.currentLine=83296268;
 //BA.debugLineNum = 83296268;BA.debugLine="result.Put(playlistId, copyEntry)";
_result.Put((Object)(_playlistid),(Object)(_copyentry.getObject()));
 }
};
RDebugUtils.currentLine=83296270;
 //BA.debugLineNum = 83296270;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=83296271;
 //BA.debugLineNum = 83296271;BA.debugLine="End Sub";
return null;
}
public boolean  _hasanytrackfilesondisk(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "hasanytrackfilesondisk", false))
	 {return ((Boolean) Debug.delegate(ba, "hasanytrackfilesondisk", null));}
boolean _hasfiles = false;
anywheresoftware.b4a.objects.collections.List _playlistdirs = null;
String _playlistid = "";
String _playlistdir = "";
anywheresoftware.b4a.objects.collections.List _files = null;
String _filename = "";
RDebugUtils.currentLine=85852160;
 //BA.debugLineNum = 85852160;BA.debugLine="Public Sub HasAnyTrackFilesOnDisk As Boolean";
RDebugUtils.currentLine=85852161;
 //BA.debugLineNum = 85852161;BA.debugLine="Dim hasFiles As Boolean = False";
_hasfiles = __c.False;
RDebugUtils.currentLine=85852162;
 //BA.debugLineNum = 85852162;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (__ref._directoryexists /*boolean*/ (null,__ref._gettracksdir /*String*/ (null))==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=85852163;
 //BA.debugLineNum = 85852163;BA.debugLine="Try";
try {RDebugUtils.currentLine=85852164;
 //BA.debugLineNum = 85852164;BA.debugLine="Dim playlistDirs As List = File.ListFiles(GetTra";
_playlistdirs = new anywheresoftware.b4a.objects.collections.List();
_playlistdirs = __c.File.ListFiles(__ref._gettracksdir /*String*/ (null));
RDebugUtils.currentLine=85852165;
 //BA.debugLineNum = 85852165;BA.debugLine="If playlistDirs.IsInitialized And playlistDirs.S";
if (_playlistdirs.IsInitialized() && _playlistdirs.getSize()>0) { 
RDebugUtils.currentLine=85852166;
 //BA.debugLineNum = 85852166;BA.debugLine="For Each playlistId As String In playlistDirs";
{
final anywheresoftware.b4a.BA.IterableList group6 = _playlistdirs;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_playlistid = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=85852167;
 //BA.debugLineNum = 85852167;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=85852168;
 //BA.debugLineNum = 85852168;BA.debugLine="If File.IsDirectory(GetTracksDir, playlistId)";
if (__c.File.IsDirectory(__ref._gettracksdir /*String*/ (null),_playlistid)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=85852169;
 //BA.debugLineNum = 85852169;BA.debugLine="Dim playlistDir As String = File.Combine(GetTr";
_playlistdir = __c.File.Combine(__ref._gettracksdir /*String*/ (null),_playlistid);
RDebugUtils.currentLine=85852170;
 //BA.debugLineNum = 85852170;BA.debugLine="Dim files As List = File.ListFiles(playlistDir";
_files = new anywheresoftware.b4a.objects.collections.List();
_files = __c.File.ListFiles(_playlistdir);
RDebugUtils.currentLine=85852171;
 //BA.debugLineNum = 85852171;BA.debugLine="If files.IsInitialized = False Then Continue";
if (_files.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=85852172;
 //BA.debugLineNum = 85852172;BA.debugLine="For Each fileName As String In files";
{
final anywheresoftware.b4a.BA.IterableList group12 = _files;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_filename = BA.ObjectToString(group12.Get(index12));
RDebugUtils.currentLine=85852173;
 //BA.debugLineNum = 85852173;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=85852174;
 //BA.debugLineNum = 85852174;BA.debugLine="If File.IsDirectory(playlistDir, fileName) Th";
if (__c.File.IsDirectory(_playlistdir,_filename)) { 
if (true) continue;};
RDebugUtils.currentLine=85852175;
 //BA.debugLineNum = 85852175;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
if (_filename.endsWith(".tmp")) { 
if (true) continue;};
RDebugUtils.currentLine=85852176;
 //BA.debugLineNum = 85852176;BA.debugLine="hasFiles = True";
_hasfiles = __c.True;
RDebugUtils.currentLine=85852177;
 //BA.debugLineNum = 85852177;BA.debugLine="Exit";
if (true) break;
 }
};
RDebugUtils.currentLine=85852179;
 //BA.debugLineNum = 85852179;BA.debugLine="If hasFiles Then Exit";
if (_hasfiles) { 
if (true) break;};
 }
};
 };
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=85852183;
 //BA.debugLineNum = 85852183;BA.debugLine="Trace(\"Не удалось проверить наличие track файлов";
__ref._trace /*String*/ (null,"Не удалось проверить наличие track файлов на диске. message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=85852185;
 //BA.debugLineNum = 85852185;BA.debugLine="Return hasFiles";
if (true) return _hasfiles;
RDebugUtils.currentLine=85852186;
 //BA.debugLineNum = 85852186;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _getcachedtrackplaylistidsondisk(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedtrackplaylistidsondisk", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getcachedtrackplaylistidsondisk", null));}
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.List _playlistdirs = null;
String _playlistid = "";
RDebugUtils.currentLine=85917696;
 //BA.debugLineNum = 85917696;BA.debugLine="Public Sub GetCachedTrackPlaylistIdsOnDisk As List";
RDebugUtils.currentLine=85917697;
 //BA.debugLineNum = 85917697;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=85917698;
 //BA.debugLineNum = 85917698;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=85917699;
 //BA.debugLineNum = 85917699;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (__ref._directoryexists /*boolean*/ (null,__ref._gettracksdir /*String*/ (null))==__c.False) { 
if (true) return _result;};
RDebugUtils.currentLine=85917700;
 //BA.debugLineNum = 85917700;BA.debugLine="Try";
try {RDebugUtils.currentLine=85917701;
 //BA.debugLineNum = 85917701;BA.debugLine="Dim playlistDirs As List = File.ListFiles(GetTra";
_playlistdirs = new anywheresoftware.b4a.objects.collections.List();
_playlistdirs = __c.File.ListFiles(__ref._gettracksdir /*String*/ (null));
RDebugUtils.currentLine=85917702;
 //BA.debugLineNum = 85917702;BA.debugLine="If playlistDirs.IsInitialized Then";
if (_playlistdirs.IsInitialized()) { 
RDebugUtils.currentLine=85917703;
 //BA.debugLineNum = 85917703;BA.debugLine="For Each playlistId As String In playlistDirs";
{
final anywheresoftware.b4a.BA.IterableList group7 = _playlistdirs;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_playlistid = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=85917704;
 //BA.debugLineNum = 85917704;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=85917705;
 //BA.debugLineNum = 85917705;BA.debugLine="If File.IsDirectory(GetTracksDir, playlistId)";
if (__c.File.IsDirectory(__ref._gettracksdir /*String*/ (null),_playlistid)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=85917706;
 //BA.debugLineNum = 85917706;BA.debugLine="result.Add(playlistId)";
_result.Add((Object)(_playlistid));
 }
};
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=85917710;
 //BA.debugLineNum = 85917710;BA.debugLine="Trace(\"Не удалось получить список playlist папок";
__ref._trace /*String*/ (null,"Не удалось получить список playlist папок из track cache. message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=85917712;
 //BA.debugLineNum = 85917712;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=85917713;
 //BA.debugLineNum = 85917713;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolveanycachedtrackfromindex(b4j.example.mediacache __ref,String _playlistid,String _currenttrackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveanycachedtrackfromindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolveanycachedtrackfromindex", new Object[] {_playlistid,_currenttrackid}));}
anywheresoftware.b4a.objects.collections.Map _emptytrack = null;
anywheresoftware.b4a.objects.collections.Map _selectedtrack = null;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _entryplaylistid = "";
String _filename = "";
anywheresoftware.b4a.objects.collections.Map _copiedtrack = null;
Object _key = null;
RDebugUtils.currentLine=87556096;
 //BA.debugLineNum = 87556096;BA.debugLine="Public Sub ResolveAnyCachedTrackFromIndex(playlist";
RDebugUtils.currentLine=87556097;
 //BA.debugLineNum = 87556097;BA.debugLine="Dim emptyTrack As Map";
_emptytrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=87556098;
 //BA.debugLineNum = 87556098;BA.debugLine="emptyTrack.Initialize";
_emptytrack.Initialize();
RDebugUtils.currentLine=87556099;
 //BA.debugLineNum = 87556099;BA.debugLine="EnsureTrackCacheReady";
__ref._ensuretrackcacheready /*String*/ (null);
RDebugUtils.currentLine=87556100;
 //BA.debugLineNum = 87556100;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then Re";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=87556101;
 //BA.debugLineNum = 87556101;BA.debugLine="Dim selectedTrack As Map";
_selectedtrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=87556102;
 //BA.debugLineNum = 87556102;BA.debugLine="selectedTrack.Initialize";
_selectedtrack.Initialize();
RDebugUtils.currentLine=87556103;
 //BA.debugLineNum = 87556103;BA.debugLine="For Each trackId As String In cachedTrackIndex.Ke";
{
final anywheresoftware.b4a.BA.IterableList group7 = __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_trackid = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=87556104;
 //BA.debugLineNum = 87556104;BA.debugLine="If currentTrackId <> \"\" And cachedTrackIndex.Siz";
if ((_currenttrackid).equals("") == false && __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>1 && (_trackid).equals(_currenttrackid)) { 
if (true) continue;};
RDebugUtils.currentLine=87556105;
 //BA.debugLineNum = 87556105;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(t";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=87556106;
 //BA.debugLineNum = 87556106;BA.debugLine="If entry.IsInitialized = False Then Continue";
if (_entry.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=87556107;
 //BA.debugLineNum = 87556107;BA.debugLine="Dim entryPlaylistId As String = entry.GetDefault";
_entryplaylistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=87556108;
 //BA.debugLineNum = 87556108;BA.debugLine="If playlistId <> \"\" And entryPlaylistId <> playl";
if ((_playlistid).equals("") == false && (_entryplaylistid).equals(_playlistid) == false) { 
if (true) continue;};
RDebugUtils.currentLine=87556109;
 //BA.debugLineNum = 87556109;BA.debugLine="Dim fileName As String = ResolveTrackCacheFileNa";
_filename = __ref._resolvetrackcachefilename /*String*/ (null,_trackid,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=87556110;
 //BA.debugLineNum = 87556110;BA.debugLine="If IsCachedFileUsable(GetTracksDir, fileName) =";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_filename)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=87556111;
 //BA.debugLineNum = 87556111;BA.debugLine="Dim copiedTrack As Map";
_copiedtrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=87556112;
 //BA.debugLineNum = 87556112;BA.debugLine="copiedTrack.Initialize";
_copiedtrack.Initialize();
RDebugUtils.currentLine=87556113;
 //BA.debugLineNum = 87556113;BA.debugLine="For Each key As Object In entry.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = _entry.Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_key = group17.Get(index17);
RDebugUtils.currentLine=87556114;
 //BA.debugLineNum = 87556114;BA.debugLine="copiedTrack.Put(key, entry.Get(key))";
_copiedtrack.Put(_key,_entry.Get(_key));
 }
};
RDebugUtils.currentLine=87556116;
 //BA.debugLineNum = 87556116;BA.debugLine="selectedTrack = copiedTrack";
_selectedtrack = _copiedtrack;
RDebugUtils.currentLine=87556117;
 //BA.debugLineNum = 87556117;BA.debugLine="If selectedTrack.GetDefault(\"id\", \"\") = \"\" Then";
if ((_selectedtrack.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
_selectedtrack.Put((Object)("id"),(Object)(_trackid));};
RDebugUtils.currentLine=87556118;
 //BA.debugLineNum = 87556118;BA.debugLine="If selectedTrack.GetDefault(\"playlist_id\", \"\") =";
if ((_selectedtrack.GetDefault((Object)("playlist_id"),(Object)(""))).equals((Object)(""))) { 
_selectedtrack.Put((Object)("playlist_id"),(Object)(_entryplaylistid));};
RDebugUtils.currentLine=87556119;
 //BA.debugLineNum = 87556119;BA.debugLine="If selectedTrack.GetDefault(\"playlist_title\", \"\"";
if ((_selectedtrack.GetDefault((Object)("playlist_title"),(Object)(""))).equals((Object)(""))) { 
_selectedtrack.Put((Object)("playlist_title"),_entry.GetDefault((Object)("title"),(Object)("")));};
RDebugUtils.currentLine=87556120;
 //BA.debugLineNum = 87556120;BA.debugLine="Exit";
if (true) break;
 }
};
RDebugUtils.currentLine=87556122;
 //BA.debugLineNum = 87556122;BA.debugLine="If selectedTrack.IsInitialized And selectedTrack.";
if (_selectedtrack.IsInitialized() && _selectedtrack.getSize()>0) { 
if (true) return _selectedtrack;};
RDebugUtils.currentLine=87556123;
 //BA.debugLineNum = 87556123;BA.debugLine="Return emptyTrack";
if (true) return _emptytrack;
RDebugUtils.currentLine=87556124;
 //BA.debugLineNum = 87556124;BA.debugLine="End Sub";
return null;
}
public String  _accumulatetrackplayliststat(b4j.example.mediacache __ref,String _playlistid,long _trackbytes) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "accumulatetrackplayliststat", false))
	 {return ((String) Debug.delegate(ba, "accumulatetrackplayliststat", new Object[] {_playlistid,_trackbytes}));}
String _statskey = "";
anywheresoftware.b4a.objects.collections.Map _playlistentry = null;
RDebugUtils.currentLine=83558400;
 //BA.debugLineNum = 83558400;BA.debugLine="Private Sub AccumulateTrackPlaylistStat(playlistId";
RDebugUtils.currentLine=83558401;
 //BA.debugLineNum = 83558401;BA.debugLine="Dim statsKey As String = playlistId";
_statskey = _playlistid;
RDebugUtils.currentLine=83558402;
 //BA.debugLineNum = 83558402;BA.debugLine="If statsKey = \"\" Then statsKey = \"_unknown\"";
if ((_statskey).equals("")) { 
_statskey = "_unknown";};
RDebugUtils.currentLine=83558403;
 //BA.debugLineNum = 83558403;BA.debugLine="Dim playlistEntry As Map = cachedTrackPlaylistSta";
_playlistentry = new anywheresoftware.b4a.objects.collections.Map();
_playlistentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_statskey),__c.Null)));
RDebugUtils.currentLine=83558404;
 //BA.debugLineNum = 83558404;BA.debugLine="If playlistEntry.IsInitialized = False Then";
if (_playlistentry.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=83558405;
 //BA.debugLineNum = 83558405;BA.debugLine="playlistEntry.Initialize";
_playlistentry.Initialize();
RDebugUtils.currentLine=83558406;
 //BA.debugLineNum = 83558406;BA.debugLine="playlistEntry.Put(\"count\", 0)";
_playlistentry.Put((Object)("count"),(Object)(0));
RDebugUtils.currentLine=83558407;
 //BA.debugLineNum = 83558407;BA.debugLine="playlistEntry.Put(\"bytes\", 0)";
_playlistentry.Put((Object)("bytes"),(Object)(0));
 };
RDebugUtils.currentLine=83558409;
 //BA.debugLineNum = 83558409;BA.debugLine="playlistEntry.Put(\"count\", playlistEntry.GetDefau";
_playlistentry.Put((Object)("count"),(Object)((double)(BA.ObjectToNumber(_playlistentry.GetDefault((Object)("count"),(Object)(0))))+1));
RDebugUtils.currentLine=83558410;
 //BA.debugLineNum = 83558410;BA.debugLine="playlistEntry.Put(\"bytes\", ToLongDefault(playlist";
_playlistentry.Put((Object)("bytes"),(Object)(__ref._tolongdefault /*long*/ (null,_playlistentry.GetDefault((Object)("bytes"),(Object)(0)),(long) (0))+_trackbytes));
RDebugUtils.currentLine=83558411;
 //BA.debugLineNum = 83558411;BA.debugLine="cachedTrackPlaylistStats.Put(statsKey, playlistEn";
__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_statskey),(Object)(_playlistentry.getObject()));
RDebugUtils.currentLine=83558412;
 //BA.debugLineNum = 83558412;BA.debugLine="End Sub";
return "";
}
public long  _tolongdefault(b4j.example.mediacache __ref,Object _value,long _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "tolongdefault", false))
	 {return ((Long) Debug.delegate(ba, "tolongdefault", new Object[] {_value,_defaultvalue}));}
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="Try";
try {RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="If value = Null Then Return defaultValue";
if (_value== null) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=39059459;
 //BA.debugLineNum = 39059459;BA.debugLine="Return value";
if (true) return BA.ObjectToLongNumber(_value);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=39059461;
 //BA.debugLineNum = 39059461;BA.debugLine="Return defaultValue";
if (true) return _defaultvalue;
 };
RDebugUtils.currentLine=39059463;
 //BA.debugLineNum = 39059463;BA.debugLine="End Sub";
return 0L;
}
public String  _addindexedfilefromaudit(b4j.example.mediacache __ref,String _itemtype,String _filename,anywheresoftware.b4a.objects.collections.Map _auditindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "addindexedfilefromaudit", false))
	 {return ((String) Debug.delegate(ba, "addindexedfilefromaudit", new Object[] {_itemtype,_filename,_auditindex}));}
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Private Sub AddIndexedFileFromAudit(itemType As St";
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=38404099;
 //BA.debugLineNum = 38404099;BA.debugLine="entry.Put(\"id\", fileName)";
_entry.Put((Object)("id"),(Object)(_filename));
RDebugUtils.currentLine=38404100;
 //BA.debugLineNum = 38404100;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=38404101;
 //BA.debugLineNum = 38404101;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=38404102;
 //BA.debugLineNum = 38404102;BA.debugLine="If itemType = \"ads\" Then";
if ((_itemtype).equals("ads")) { 
RDebugUtils.currentLine=38404103;
 //BA.debugLineNum = 38404103;BA.debugLine="entry.Put(\"title\", \"\")";
_entry.Put((Object)("title"),(Object)(""));
RDebugUtils.currentLine=38404104;
 //BA.debugLineNum = 38404104;BA.debugLine="entry.Put(\"duration\", 0)";
_entry.Put((Object)("duration"),(Object)(0));
RDebugUtils.currentLine=38404105;
 //BA.debugLineNum = 38404105;BA.debugLine="entry.Put(\"gain\", 0)";
_entry.Put((Object)("gain"),(Object)(0));
 }else {
RDebugUtils.currentLine=38404107;
 //BA.debugLineNum = 38404107;BA.debugLine="entry.Put(\"title\", \"\")";
_entry.Put((Object)("title"),(Object)(""));
RDebugUtils.currentLine=38404108;
 //BA.debugLineNum = 38404108;BA.debugLine="entry.Put(\"set\", \"\")";
_entry.Put((Object)("set"),(Object)(""));
RDebugUtils.currentLine=38404109;
 //BA.debugLineNum = 38404109;BA.debugLine="entry.Put(\"stream\", \"\")";
_entry.Put((Object)("stream"),(Object)(""));
RDebugUtils.currentLine=38404110;
 //BA.debugLineNum = 38404110;BA.debugLine="entry.Put(\"gain\", 0)";
_entry.Put((Object)("gain"),(Object)(0));
RDebugUtils.currentLine=38404111;
 //BA.debugLineNum = 38404111;BA.debugLine="entry.Put(\"playlist_id\", ExtractPlaylistIdFromTr";
_entry.Put((Object)("playlist_id"),(Object)(__ref._extractplaylistidfromtrackrelativepath /*String*/ (null,_filename)));
RDebugUtils.currentLine=38404112;
 //BA.debugLineNum = 38404112;BA.debugLine="entry.Put(\"file_name\", fileName)";
_entry.Put((Object)("file_name"),(Object)(_filename));
RDebugUtils.currentLine=38404113;
 //BA.debugLineNum = 38404113;BA.debugLine="entry.Put(\"size_bytes\", GetFileSizeSafe(GetTrack";
_entry.Put((Object)("size_bytes"),(Object)(__ref._getfilesizesafe /*long*/ (null,__ref._gettracksdir /*String*/ (null),_filename)));
 };
RDebugUtils.currentLine=38404115;
 //BA.debugLineNum = 38404115;BA.debugLine="auditIndex.Put(fileName, entry)";
_auditindex.Put((Object)(_filename),(Object)(_entry.getObject()));
RDebugUtils.currentLine=38404116;
 //BA.debugLineNum = 38404116;BA.debugLine="MarkAuditIndexChanged(itemType)";
__ref._markauditindexchanged /*String*/ (null,_itemtype);
RDebugUtils.currentLine=38404117;
 //BA.debugLineNum = 38404117;BA.debugLine="End Sub";
return "";
}
public String  _extractplaylistidfromtrackrelativepath(b4j.example.mediacache __ref,String _relativefilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "extractplaylistidfromtrackrelativepath", false))
	 {return ((String) Debug.delegate(ba, "extractplaylistidfromtrackrelativepath", new Object[] {_relativefilename}));}
String _normalized = "";
int _slashindex = 0;
RDebugUtils.currentLine=82378752;
 //BA.debugLineNum = 82378752;BA.debugLine="Private Sub ExtractPlaylistIdFromTrackRelativePath";
RDebugUtils.currentLine=82378753;
 //BA.debugLineNum = 82378753;BA.debugLine="If relativeFileName = \"\" Then Return \"\"";
if ((_relativefilename).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=82378754;
 //BA.debugLineNum = 82378754;BA.debugLine="Dim normalized As String = relativeFileName.Repla";
_normalized = _relativefilename.replace("\\\\","/");
RDebugUtils.currentLine=82378755;
 //BA.debugLineNum = 82378755;BA.debugLine="Dim slashIndex As Int = normalized.IndexOf(\"/\")";
_slashindex = _normalized.indexOf("/");
RDebugUtils.currentLine=82378756;
 //BA.debugLineNum = 82378756;BA.debugLine="If slashIndex <= 0 Then Return \"\"";
if (_slashindex<=0) { 
if (true) return "";};
RDebugUtils.currentLine=82378757;
 //BA.debugLineNum = 82378757;BA.debugLine="Return normalized.SubString2(0, slashIndex)";
if (true) return _normalized.substring((int) (0),_slashindex);
RDebugUtils.currentLine=82378758;
 //BA.debugLineNum = 82378758;BA.debugLine="End Sub";
return "";
}
public long  _getfilesizesafe(b4j.example.mediacache __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getfilesizesafe", false))
	 {return ((Long) Debug.delegate(ba, "getfilesizesafe", new Object[] {_dir,_filename}));}
String _filedir = "";
String _leafname = "";
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Private Sub GetFileSizeSafe(dir As String, fileNam";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="Try";
try {RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="Dim fileDir As String = ResolveRelativeParentDir";
_filedir = __ref._resolverelativeparentdir /*String*/ (null,_dir,_filename);
RDebugUtils.currentLine=38993923;
 //BA.debugLineNum = 38993923;BA.debugLine="Dim leafName As String = ResolveRelativeLeafName";
_leafname = __ref._resolverelativeleafname /*String*/ (null,_filename);
RDebugUtils.currentLine=38993924;
 //BA.debugLineNum = 38993924;BA.debugLine="Return File.Size(fileDir, leafName)";
if (true) return __c.File.Size(_filedir,_leafname);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=38993926;
 //BA.debugLineNum = 38993926;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=38993928;
 //BA.debugLineNum = 38993928;BA.debugLine="End Sub";
return 0L;
}
public String  _gettracksdir(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "gettracksdir", false))
	 {return ((String) Debug.delegate(ba, "gettracksdir", null));}
RDebugUtils.currentLine=35127296;
 //BA.debugLineNum = 35127296;BA.debugLine="Public Sub GetTracksDir As String";
RDebugUtils.currentLine=35127297;
 //BA.debugLineNum = 35127297;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
if (true) return __c.File.Combine(__c.File.Combine(__ref._storagedir /*String*/ ,__ref._mediadirname /*String*/ ),__ref._tracksdirname /*String*/ );
RDebugUtils.currentLine=35127298;
 //BA.debugLineNum = 35127298;BA.debugLine="End Sub";
return "";
}
public String  _markauditindexchanged(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "markauditindexchanged", false))
	 {return ((String) Debug.delegate(ba, "markauditindexchanged", new Object[] {_itemtype}));}
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Private Sub MarkAuditIndexChanged(itemType As Stri";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="If itemType = \"ads\" Then";
if ((_itemtype).equals("ads")) { 
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="cacheAuditAdIndexChanged = True";
__ref._cacheauditadindexchanged /*boolean*/  = __c.True;
RDebugUtils.currentLine=38338563;
 //BA.debugLineNum = 38338563;BA.debugLine="cachedAdIndexDirty = True";
__ref._cachedadindexdirty /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=38338565;
 //BA.debugLineNum = 38338565;BA.debugLine="cacheAuditTrackIndexChanged = True";
__ref._cacheaudittrackindexchanged /*boolean*/  = __c.True;
RDebugUtils.currentLine=38338566;
 //BA.debugLineNum = 38338566;BA.debugLine="cachedTrackIndexDirty = True";
__ref._cachedtrackindexdirty /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=38338568;
 //BA.debugLineNum = 38338568;BA.debugLine="End Sub";
return "";
}
public String  _applyxortobuffer(b4j.example.mediacache __ref,byte[] _buffer,int _count,byte[] _keybytes,long _keyoffset) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "applyxortobuffer", false))
	 {return ((String) Debug.delegate(ba, "applyxortobuffer", new Object[] {_buffer,_count,_keybytes,_keyoffset}));}
int _i = 0;
int _keyindex = 0;
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Private Sub ApplyXorToBuffer(buffer() As Byte, cou";
RDebugUtils.currentLine=37027841;
 //BA.debugLineNum = 37027841;BA.debugLine="If count <= 0 Or keyBytes.Length = 0 Then Return";
if (_count<=0 || _keybytes.length==0) { 
if (true) return "";};
RDebugUtils.currentLine=37027842;
 //BA.debugLineNum = 37027842;BA.debugLine="For i = 0 To count - 1";
{
final int step2 = 1;
final int limit2 = (int) (_count-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=37027843;
 //BA.debugLineNum = 37027843;BA.debugLine="Dim keyIndex As Int = (keyOffset + i) Mod keyByt";
_keyindex = (int) ((_keyoffset+_i)%_keybytes.length);
RDebugUtils.currentLine=37027844;
 //BA.debugLineNum = 37027844;BA.debugLine="buffer(i) = Bit.Xor(buffer(i), keyBytes(keyIndex";
_buffer[_i] = (byte) (__c.Bit.Xor((int) (_buffer[_i]),(int) (_keybytes[_keyindex])));
 }
};
RDebugUtils.currentLine=37027846;
 //BA.debugLineNum = 37027846;BA.debugLine="End Sub";
return "";
}
public String  _backfilltrackindexfromfiles(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "backfilltrackindexfromfiles", false))
	 {return ((String) Debug.delegate(ba, "backfilltrackindexfromfiles", null));}
boolean _changed = false;
anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps = null;
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
String _filename = "";
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _storedfilename = "";
String _playlistid = "";
long _filesize = 0L;
long _storedsize = 0L;
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Private Sub BackfillTrackIndexFromFiles";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="Dim changed As Boolean = False";
_changed = __c.False;
RDebugUtils.currentLine=38666243;
 //BA.debugLineNum = 38666243;BA.debugLine="Dim playlistTrackMaps As Map";
_playlisttrackmaps = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38666244;
 //BA.debugLineNum = 38666244;BA.debugLine="playlistTrackMaps.Initialize";
_playlisttrackmaps.Initialize();
RDebugUtils.currentLine=38666245;
 //BA.debugLineNum = 38666245;BA.debugLine="Try";
try {RDebugUtils.currentLine=38666246;
 //BA.debugLineNum = 38666246;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Re";
if (__ref._directoryexists /*boolean*/ (null,__ref._gettracksdir /*String*/ (null))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38666247;
 //BA.debugLineNum = 38666247;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRec";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __ref._listtrackcachefilesrecursive /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=38666248;
 //BA.debugLineNum = 38666248;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38666249;
 //BA.debugLineNum = 38666249;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group9 = _listedfiles;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_filename = BA.ObjectToString(group9.Get(index9));
RDebugUtils.currentLine=38666250;
 //BA.debugLineNum = 38666250;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=38666251;
 //BA.debugLineNum = 38666251;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
if (_filename.endsWith(".tmp")) { 
if (true) continue;};
RDebugUtils.currentLine=38666252;
 //BA.debugLineNum = 38666252;BA.debugLine="Dim trackId As String = FindTrackIdByFileNameWi";
_trackid = __ref._findtrackidbyfilenamewithmetadata /*String*/ (null,_filename,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ,_playlisttrackmaps);
RDebugUtils.currentLine=38666253;
 //BA.debugLineNum = 38666253;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=38666254;
 //BA.debugLineNum = 38666254;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=38666255;
 //BA.debugLineNum = 38666255;BA.debugLine="If entry.IsInitialized = False Then entry.Initi";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=38666256;
 //BA.debugLineNum = 38666256;BA.debugLine="Dim storedFileName As String = \"\" & entry.GetDe";
_storedfilename = ""+BA.ObjectToString(_entry.GetDefault((Object)("file_name"),(Object)("")));
RDebugUtils.currentLine=38666257;
 //BA.debugLineNum = 38666257;BA.debugLine="If storedFileName <> fileName Then";
if ((_storedfilename).equals(_filename) == false) { 
RDebugUtils.currentLine=38666258;
 //BA.debugLineNum = 38666258;BA.debugLine="entry.Put(\"file_name\", fileName)";
_entry.Put((Object)("file_name"),(Object)(_filename));
RDebugUtils.currentLine=38666259;
 //BA.debugLineNum = 38666259;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=38666261;
 //BA.debugLineNum = 38666261;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFro";
_playlistid = __ref._extractplaylistidfromtrackrelativepath /*String*/ (null,_filename);
RDebugUtils.currentLine=38666262;
 //BA.debugLineNum = 38666262;BA.debugLine="If entry.GetDefault(\"playlist_id\", \"\") <> playl";
if ((_entry.GetDefault((Object)("playlist_id"),(Object)(""))).equals((Object)(_playlistid)) == false) { 
RDebugUtils.currentLine=38666263;
 //BA.debugLineNum = 38666263;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));
RDebugUtils.currentLine=38666264;
 //BA.debugLineNum = 38666264;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=38666266;
 //BA.debugLineNum = 38666266;BA.debugLine="If entry.ContainsKey(\"id\") = False Then";
if (_entry.ContainsKey((Object)("id"))==__c.False) { 
RDebugUtils.currentLine=38666267;
 //BA.debugLineNum = 38666267;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=38666268;
 //BA.debugLineNum = 38666268;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=38666270;
 //BA.debugLineNum = 38666270;BA.debugLine="Dim fileSize As Long = GetFileSizeSafe(GetTrack";
_filesize = __ref._getfilesizesafe /*long*/ (null,__ref._gettracksdir /*String*/ (null),_filename);
RDebugUtils.currentLine=38666271;
 //BA.debugLineNum = 38666271;BA.debugLine="Dim storedSize As Long = ToLongDefault(entry.Ge";
_storedsize = __ref._tolongdefault /*long*/ (null,_entry.GetDefault((Object)("size_bytes"),(Object)(-1)),(long) (-1));
RDebugUtils.currentLine=38666272;
 //BA.debugLineNum = 38666272;BA.debugLine="If storedSize <> fileSize Then";
if (_storedsize!=_filesize) { 
RDebugUtils.currentLine=38666273;
 //BA.debugLineNum = 38666273;BA.debugLine="entry.Put(\"size_bytes\", fileSize)";
_entry.Put((Object)("size_bytes"),(Object)(_filesize));
RDebugUtils.currentLine=38666274;
 //BA.debugLineNum = 38666274;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=38666276;
 //BA.debugLineNum = 38666276;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
RDebugUtils.currentLine=38666277;
 //BA.debugLineNum = 38666277;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=38666278;
 //BA.debugLineNum = 38666278;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=38666280;
 //BA.debugLineNum = 38666280;BA.debugLine="If entry.ContainsKey(\"last_used_at\") = False Th";
if (_entry.ContainsKey((Object)("last_used_at"))==__c.False) { 
RDebugUtils.currentLine=38666281;
 //BA.debugLineNum = 38666281;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=38666282;
 //BA.debugLineNum = 38666282;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=38666284;
 //BA.debugLineNum = 38666284;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_trackid),(Object)(_entry.getObject()));
 }
};
 } 
       catch (Exception e47) {
			ba.setLastException(e47);RDebugUtils.currentLine=38666287;
 //BA.debugLineNum = 38666287;BA.debugLine="Trace(\"Не удалось выполнить стартовую переиндекс";
__ref._trace /*String*/ (null,"Не удалось выполнить стартовую переиндексацию кэша треков. message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=38666289;
 //BA.debugLineNum = 38666289;BA.debugLine="If changed Then SaveTrackIndex";
if (_changed) { 
__ref._savetrackindex /*String*/ (null);};
RDebugUtils.currentLine=38666290;
 //BA.debugLineNum = 38666290;BA.debugLine="End Sub";
return "";
}
public boolean  _directoryexists(b4j.example.mediacache __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "directoryexists", false))
	 {return ((Boolean) Debug.delegate(ba, "directoryexists", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _fileobject = null;
RDebugUtils.currentLine=83886080;
 //BA.debugLineNum = 83886080;BA.debugLine="Private Sub DirectoryExists(path As String) As Boo";
RDebugUtils.currentLine=83886081;
 //BA.debugLineNum = 83886081;BA.debugLine="If path = \"\" Then Return False";
if ((_path).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=83886082;
 //BA.debugLineNum = 83886082;BA.debugLine="Try";
try {RDebugUtils.currentLine=83886083;
 //BA.debugLineNum = 83886083;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=83886084;
 //BA.debugLineNum = 83886084;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=83886085;
 //BA.debugLineNum = 83886085;BA.debugLine="If fileObject.RunMethod(\"exists\", Null) = False";
if ((_fileobject.RunMethod("exists",(Object[])(__c.Null))).equals((Object)(__c.False))) { 
if (true) return __c.False;};
RDebugUtils.currentLine=83886086;
 //BA.debugLineNum = 83886086;BA.debugLine="Return fileObject.RunMethod(\"isDirectory\", Null)";
if (true) return BA.ObjectToBoolean(_fileobject.RunMethod("isDirectory",(Object[])(__c.Null)));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=83886088;
 //BA.debugLineNum = 83886088;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=83886090;
 //BA.debugLineNum = 83886090;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _listtrackcachefilesrecursive(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "listtrackcachefilesrecursive", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listtrackcachefilesrecursive", null));}
anywheresoftware.b4a.objects.collections.List _result = null;
RDebugUtils.currentLine=82444288;
 //BA.debugLineNum = 82444288;BA.debugLine="Private Sub ListTrackCacheFilesRecursive As List";
RDebugUtils.currentLine=82444289;
 //BA.debugLineNum = 82444289;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=82444290;
 //BA.debugLineNum = 82444290;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=82444291;
 //BA.debugLineNum = 82444291;BA.debugLine="ListTrackCacheFilesInto(GetTracksDir, \"\", result)";
__ref._listtrackcachefilesinto /*String*/ (null,__ref._gettracksdir /*String*/ (null),"",_result);
RDebugUtils.currentLine=82444292;
 //BA.debugLineNum = 82444292;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=82444293;
 //BA.debugLineNum = 82444293;BA.debugLine="End Sub";
return null;
}
public String  _findtrackidbyfilenamewithmetadata(b4j.example.mediacache __ref,String _filename,anywheresoftware.b4a.objects.collections.Map _trackindex,anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "findtrackidbyfilenamewithmetadata", false))
	 {return ((String) Debug.delegate(ba, "findtrackidbyfilenamewithmetadata", new Object[] {_filename,_trackindex,_playlisttrackmaps}));}
String _resolvedtrackid = "";
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _playlisttrackmap = null;
RDebugUtils.currentLine=83689472;
 //BA.debugLineNum = 83689472;BA.debugLine="Private Sub FindTrackIdByFileNameWithMetadata(file";
RDebugUtils.currentLine=83689473;
 //BA.debugLineNum = 83689473;BA.debugLine="Dim resolvedTrackId As String = FindTrackIdByFile";
_resolvedtrackid = __ref._findtrackidbyfilename /*String*/ (null,_filename,_trackindex);
RDebugUtils.currentLine=83689474;
 //BA.debugLineNum = 83689474;BA.debugLine="If resolvedTrackId <> \"\" Then Return resolvedTrac";
if ((_resolvedtrackid).equals("") == false) { 
if (true) return _resolvedtrackid;};
RDebugUtils.currentLine=83689475;
 //BA.debugLineNum = 83689475;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFromT";
_playlistid = __ref._extractplaylistidfromtrackrelativepath /*String*/ (null,_filename);
RDebugUtils.currentLine=83689476;
 //BA.debugLineNum = 83689476;BA.debugLine="If playlistId = \"\" Then Return \"\"";
if ((_playlistid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=83689477;
 //BA.debugLineNum = 83689477;BA.debugLine="Dim playlistTrackMap As Map = LoadPlaylistTrackFi";
_playlisttrackmap = new anywheresoftware.b4a.objects.collections.Map();
_playlisttrackmap = __ref._loadplaylisttrackfilemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid,_playlisttrackmaps);
RDebugUtils.currentLine=83689478;
 //BA.debugLineNum = 83689478;BA.debugLine="If playlistTrackMap.IsInitialized = False Then Re";
if (_playlisttrackmap.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=83689479;
 //BA.debugLineNum = 83689479;BA.debugLine="Return playlistTrackMap.GetDefault(fileName, \"\")";
if (true) return BA.ObjectToString(_playlisttrackmap.GetDefault((Object)(_filename),(Object)("")));
RDebugUtils.currentLine=83689480;
 //BA.debugLineNum = 83689480;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.mediacache __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=39518208;
 //BA.debugLineNum = 39518208;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=39518210;
 //BA.debugLineNum = 39518210;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=39518212;
 //BA.debugLineNum = 39518212;BA.debugLine="End Sub";
return "";
}
public String  _savetrackindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "savetrackindex", false))
	 {return ((String) Debug.delegate(ba, "savetrackindex", null));}
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Private Sub SaveTrackIndex";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="RebuildCacheStatsFromIndexes";
__ref._rebuildcachestatsfromindexes /*String*/ (null);
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="storage.Put(\"cached_track_index\", cachedTrackInde";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_track_index",(Object)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="storage.Put(\"cached_track_count\", cachedTrackCoun";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_track_count",(Object)(__ref._cachedtrackcount /*int*/ ));
RDebugUtils.currentLine=36175876;
 //BA.debugLineNum = 36175876;BA.debugLine="SaveCacheStatsSnapshot";
__ref._savecachestatssnapshot /*String*/ (null);
RDebugUtils.currentLine=36175877;
 //BA.debugLineNum = 36175877;BA.debugLine="cachedTrackIndexDirty = False";
__ref._cachedtrackindexdirty /*boolean*/  = __c.False;
RDebugUtils.currentLine=36175878;
 //BA.debugLineNum = 36175878;BA.debugLine="End Sub";
return "";
}
public String  _buildadurl(b4j.example.mediacache __ref,String _adid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildadurl", false))
	 {return ((String) Debug.delegate(ba, "buildadurl", new Object[] {_adid}));}
String _first = "";
RDebugUtils.currentLine=36241408;
 //BA.debugLineNum = 36241408;BA.debugLine="Private Sub BuildAdUrl(adId As String) As String";
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="If adId = \"\" Then Return \"\"";
if ((_adid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="Dim first As String = adId.SubString2(0, 1)";
_first = _adid.substring((int) (0),(int) (1));
RDebugUtils.currentLine=36241411;
 //BA.debugLineNum = 36241411;BA.debugLine="Return \"https://cdn.fon.fm/media/ads/\" & first &";
if (true) return "https://cdn.fon.fm/media/ads/"+_first+"/"+_adid+".mp3";
RDebugUtils.currentLine=36241412;
 //BA.debugLineNum = 36241412;BA.debugLine="End Sub";
return "";
}
public String  _buildplaybacktemptrackfilename(b4j.example.mediacache __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildplaybacktemptrackfilename", false))
	 {return ((String) Debug.delegate(ba, "buildplaybacktemptrackfilename", new Object[] {_audiokey}));}
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Private Sub BuildPlaybackTempTrackFileName(audioKe";
RDebugUtils.currentLine=36569089;
 //BA.debugLineNum = 36569089;BA.debugLine="If audioKey = \"secondary\" Then Return SECONDARY_T";
if ((_audiokey).equals("secondary")) { 
if (true) return __ref._secondary_temp_track_file /*String*/ ;};
RDebugUtils.currentLine=36569090;
 //BA.debugLineNum = 36569090;BA.debugLine="Return PRIMARY_TEMP_TRACK_FILE";
if (true) return __ref._primary_temp_track_file /*String*/ ;
RDebugUtils.currentLine=36569091;
 //BA.debugLineNum = 36569091;BA.debugLine="End Sub";
return "";
}
public String  _buildtempcachefilename(b4j.example.mediacache __ref,String _itemid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtempcachefilename", false))
	 {return ((String) Debug.delegate(ba, "buildtempcachefilename", new Object[] {_itemid}));}
RDebugUtils.currentLine=36503552;
 //BA.debugLineNum = 36503552;BA.debugLine="Private Sub BuildTempCacheFileName(itemId As Strin";
RDebugUtils.currentLine=36503553;
 //BA.debugLineNum = 36503553;BA.debugLine="Return itemId & \".tmp\"";
if (true) return _itemid+".tmp";
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="End Sub";
return "";
}
public String  _buildtrackcachefilename(b4j.example.mediacache __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackcachefilename", false))
	 {return ((String) Debug.delegate(ba, "buildtrackcachefilename", new Object[] {_trackid}));}
byte[] _sourcebytes = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _uuid = null;
String _filename = "";
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Private Sub BuildTrackCacheFileName(trackId As Str";
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="Dim sourceBytes() As Byte = GetBytesFromString(Bu";
_sourcebytes = __ref._getbytesfromstring /*byte[]*/ (null,__ref._buildtrackobfuscationseed /*String*/ (null,"cache",_trackid));
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=36372483;
 //BA.debugLineNum = 36372483;BA.debugLine="jo.InitializeStatic(\"java.util.UUID\")";
_jo.InitializeStatic("java.util.UUID");
RDebugUtils.currentLine=36372484;
 //BA.debugLineNum = 36372484;BA.debugLine="Dim uuid As JavaObject = jo.RunMethod(\"nameUUIDFr";
_uuid = new anywheresoftware.b4j.object.JavaObject();
_uuid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("nameUUIDFromBytes",new Object[]{(Object)(_sourcebytes)})));
RDebugUtils.currentLine=36372485;
 //BA.debugLineNum = 36372485;BA.debugLine="Dim fileName As String = uuid.RunMethod(\"toString";
_filename = BA.ObjectToString(_uuid.RunMethod("toString",(Object[])(__c.Null)));
RDebugUtils.currentLine=36372486;
 //BA.debugLineNum = 36372486;BA.debugLine="Return fileName.Replace(\"-\", \"\")";
if (true) return _filename.replace("-","");
RDebugUtils.currentLine=36372487;
 //BA.debugLineNum = 36372487;BA.debugLine="End Sub";
return "";
}
public byte[]  _getbytesfromstring(b4j.example.mediacache __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getbytesfromstring", false))
	 {return ((byte[]) Debug.delegate(ba, "getbytesfromstring", new Object[] {_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Private Sub GetBytesFromString(value As String) As";
RDebugUtils.currentLine=36896769;
 //BA.debugLineNum = 36896769;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="jo.InitializeNewInstance(\"java.lang.String\", Arra";
_jo.InitializeNewInstance("java.lang.String",new Object[]{(Object)(_value)});
RDebugUtils.currentLine=36896771;
 //BA.debugLineNum = 36896771;BA.debugLine="Return jo.RunMethod(\"getBytes\", Array As Object(\"";
if (true) return (byte[])(_jo.RunMethod("getBytes",new Object[]{(Object)("UTF-8")}));
RDebugUtils.currentLine=36896772;
 //BA.debugLineNum = 36896772;BA.debugLine="End Sub";
return null;
}
public String  _buildtrackobfuscationseed(b4j.example.mediacache __ref,String _purpose,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackobfuscationseed", false))
	 {return ((String) Debug.delegate(ba, "buildtrackobfuscationseed", new Object[] {_purpose,_trackid}));}
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Private Sub BuildTrackObfuscationSeed(purpose As S";
RDebugUtils.currentLine=36831233;
 //BA.debugLineNum = 36831233;BA.debugLine="Return \"fonfm|\" & purpose & \"|\" & trackId";
if (true) return "fonfm|"+_purpose+"|"+_trackid;
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="End Sub";
return "";
}
public String  _buildtrackcacherelativefilename(b4j.example.mediacache __ref,String _trackid,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackcacherelativefilename", false))
	 {return ((String) Debug.delegate(ba, "buildtrackcacherelativefilename", new Object[] {_trackid,_playlistid}));}
String _filename = "";
RDebugUtils.currentLine=82182144;
 //BA.debugLineNum = 82182144;BA.debugLine="Private Sub BuildTrackCacheRelativeFileName(trackI";
RDebugUtils.currentLine=82182145;
 //BA.debugLineNum = 82182145;BA.debugLine="Dim fileName As String = BuildTrackCacheFileName(";
_filename = __ref._buildtrackcachefilename /*String*/ (null,_trackid);
RDebugUtils.currentLine=82182146;
 //BA.debugLineNum = 82182146;BA.debugLine="If playlistId = \"\" Then Return fileName";
if ((_playlistid).equals("")) { 
if (true) return _filename;};
RDebugUtils.currentLine=82182147;
 //BA.debugLineNum = 82182147;BA.debugLine="Return File.Combine(playlistId, fileName)";
if (true) return __c.File.Combine(_playlistid,_filename);
RDebugUtils.currentLine=82182148;
 //BA.debugLineNum = 82182148;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _buildtrackcachesummary(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _protectedids,anywheresoftware.b4a.objects.collections.Map _relevantids) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackcachesummary", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "buildtrackcachesummary", new Object[] {_protectedids,_relevantids}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.List _candidates = null;
anywheresoftware.b4a.objects.collections.List _keystoremove = null;
long _cachebytes = 0L;
String _trackid = "";
String _filename = "";
long _filebytes = 0L;
anywheresoftware.b4a.objects.collections.Map _entry = null;
anywheresoftware.b4a.objects.collections.Map _candidate = null;
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Private Sub BuildTrackCacheSummary(protectedIds As";
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=38731779;
 //BA.debugLineNum = 38731779;BA.debugLine="Dim candidates As List";
_candidates = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38731780;
 //BA.debugLineNum = 38731780;BA.debugLine="candidates.Initialize";
_candidates.Initialize();
RDebugUtils.currentLine=38731781;
 //BA.debugLineNum = 38731781;BA.debugLine="Dim keysToRemove As List";
_keystoremove = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38731782;
 //BA.debugLineNum = 38731782;BA.debugLine="keysToRemove.Initialize";
_keystoremove.Initialize();
RDebugUtils.currentLine=38731783;
 //BA.debugLineNum = 38731783;BA.debugLine="Dim cacheBytes As Long = 0";
_cachebytes = (long) (0);
RDebugUtils.currentLine=38731784;
 //BA.debugLineNum = 38731784;BA.debugLine="For Each trackId As String In cachedTrackIndex.Ke";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_trackid = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=38731785;
 //BA.debugLineNum = 38731785;BA.debugLine="Dim fileName As String = ResolveTrackCacheFileNa";
_filename = __ref._resolvetrackcachefilename /*String*/ (null,_trackid,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=38731786;
 //BA.debugLineNum = 38731786;BA.debugLine="If IsCachedFileUsable(GetTracksDir, fileName) =";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_filename)==__c.False) { 
RDebugUtils.currentLine=38731787;
 //BA.debugLineNum = 38731787;BA.debugLine="keysToRemove.Add(trackId)";
_keystoremove.Add((Object)(_trackid));
RDebugUtils.currentLine=38731788;
 //BA.debugLineNum = 38731788;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=38731790;
 //BA.debugLineNum = 38731790;BA.debugLine="Dim fileBytes As Long = GetFileSizeSafe(GetTrack";
_filebytes = __ref._getfilesizesafe /*long*/ (null,__ref._gettracksdir /*String*/ (null),_filename);
RDebugUtils.currentLine=38731791;
 //BA.debugLineNum = 38731791;BA.debugLine="cacheBytes = cacheBytes + fileBytes";
_cachebytes = (long) (_cachebytes+_filebytes);
RDebugUtils.currentLine=38731792;
 //BA.debugLineNum = 38731792;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(t";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=38731793;
 //BA.debugLineNum = 38731793;BA.debugLine="If entry.IsInitialized = False Then entry.Initia";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=38731794;
 //BA.debugLineNum = 38731794;BA.debugLine="entry.Put(\"file_name\", fileName)";
_entry.Put((Object)("file_name"),(Object)(_filename));
RDebugUtils.currentLine=38731795;
 //BA.debugLineNum = 38731795;BA.debugLine="entry.Put(\"size_bytes\", fileBytes)";
_entry.Put((Object)("size_bytes"),(Object)(_filebytes));
RDebugUtils.currentLine=38731796;
 //BA.debugLineNum = 38731796;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_trackid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=38731797;
 //BA.debugLineNum = 38731797;BA.debugLine="If protectedIds.ContainsKey(trackId) Then Contin";
if (_protectedids.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
RDebugUtils.currentLine=38731798;
 //BA.debugLineNum = 38731798;BA.debugLine="Dim candidate As Map";
_candidate = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38731799;
 //BA.debugLineNum = 38731799;BA.debugLine="candidate.Initialize";
_candidate.Initialize();
RDebugUtils.currentLine=38731800;
 //BA.debugLineNum = 38731800;BA.debugLine="candidate.Put(\"id\", trackId)";
_candidate.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=38731801;
 //BA.debugLineNum = 38731801;BA.debugLine="candidate.Put(\"file_name\", fileName)";
_candidate.Put((Object)("file_name"),(Object)(_filename));
RDebugUtils.currentLine=38731802;
 //BA.debugLineNum = 38731802;BA.debugLine="candidate.Put(\"size_bytes\", fileBytes)";
_candidate.Put((Object)("size_bytes"),(Object)(_filebytes));
RDebugUtils.currentLine=38731803;
 //BA.debugLineNum = 38731803;BA.debugLine="candidate.Put(\"last_used_at\", entry.GetDefault(\"";
_candidate.Put((Object)("last_used_at"),_entry.GetDefault((Object)("last_used_at"),(Object)(0)));
RDebugUtils.currentLine=38731804;
 //BA.debugLineNum = 38731804;BA.debugLine="candidate.Put(\"saved_at\", entry.GetDefault(\"save";
_candidate.Put((Object)("saved_at"),_entry.GetDefault((Object)("saved_at"),(Object)(0)));
RDebugUtils.currentLine=38731805;
 //BA.debugLineNum = 38731805;BA.debugLine="candidate.Put(\"is_relevant\", relevantIds.Contain";
_candidate.Put((Object)("is_relevant"),(Object)(_relevantids.ContainsKey((Object)(_trackid))));
RDebugUtils.currentLine=38731806;
 //BA.debugLineNum = 38731806;BA.debugLine="candidates.Add(candidate)";
_candidates.Add((Object)(_candidate.getObject()));
 }
};
RDebugUtils.currentLine=38731808;
 //BA.debugLineNum = 38731808;BA.debugLine="For Each trackId As String In keysToRemove";
{
final anywheresoftware.b4a.BA.IterableList group32 = _keystoremove;
final int groupLen32 = group32.getSize()
;int index32 = 0;
;
for (; index32 < groupLen32;index32++){
_trackid = BA.ObjectToString(group32.Get(index32));
RDebugUtils.currentLine=38731809;
 //BA.debugLineNum = 38731809;BA.debugLine="cachedTrackIndex.Remove(trackId)";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_trackid));
 }
};
RDebugUtils.currentLine=38731811;
 //BA.debugLineNum = 38731811;BA.debugLine="If keysToRemove.Size > 0 Then SaveTrackIndex";
if (_keystoremove.getSize()>0) { 
__ref._savetrackindex /*String*/ (null);};
RDebugUtils.currentLine=38731812;
 //BA.debugLineNum = 38731812;BA.debugLine="result.Put(\"cache_bytes\", cacheBytes)";
_result.Put((Object)("cache_bytes"),(Object)(_cachebytes));
RDebugUtils.currentLine=38731813;
 //BA.debugLineNum = 38731813;BA.debugLine="result.Put(\"candidates\", candidates)";
_result.Put((Object)("candidates"),(Object)(_candidates.getObject()));
RDebugUtils.currentLine=38731814;
 //BA.debugLineNum = 38731814;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=38731815;
 //BA.debugLineNum = 38731815;BA.debugLine="End Sub";
return null;
}
public String  _resolvetrackcachefilename(b4j.example.mediacache __ref,String _trackid,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvetrackcachefilename", false))
	 {return ((String) Debug.delegate(ba, "resolvetrackcachefilename", new Object[] {_trackid,_trackindex}));}
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _filename = "";
String _playlistid = "";
RDebugUtils.currentLine=37683200;
 //BA.debugLineNum = 37683200;BA.debugLine="Private Sub ResolveTrackCacheFileName(trackId As S";
RDebugUtils.currentLine=37683201;
 //BA.debugLineNum = 37683201;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="If entry.IsInitialized Then";
if (_entry.IsInitialized()) { 
RDebugUtils.currentLine=37683203;
 //BA.debugLineNum = 37683203;BA.debugLine="Dim fileName As String = entry.GetDefault(\"file_";
_filename = BA.ObjectToString(_entry.GetDefault((Object)("file_name"),(Object)("")));
RDebugUtils.currentLine=37683204;
 //BA.debugLineNum = 37683204;BA.debugLine="If fileName <> \"\" Then Return fileName";
if ((_filename).equals("") == false) { 
if (true) return _filename;};
 };
RDebugUtils.currentLine=37683206;
 //BA.debugLineNum = 37683206;BA.debugLine="Dim playlistId As String = \"\"";
_playlistid = "";
RDebugUtils.currentLine=37683207;
 //BA.debugLineNum = 37683207;BA.debugLine="If entry.IsInitialized Then playlistId = entry.Ge";
if (_entry.IsInitialized()) { 
_playlistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));};
RDebugUtils.currentLine=37683208;
 //BA.debugLineNum = 37683208;BA.debugLine="Return BuildTrackCacheRelativeFileName(trackId, p";
if (true) return __ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_playlistid);
RDebugUtils.currentLine=37683209;
 //BA.debugLineNum = 37683209;BA.debugLine="End Sub";
return "";
}
public boolean  _iscachedfileusable(b4j.example.mediacache __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "iscachedfileusable", false))
	 {return ((Boolean) Debug.delegate(ba, "iscachedfileusable", new Object[] {_dir,_filename}));}
String _filedir = "";
String _leafname = "";
RDebugUtils.currentLine=36438016;
 //BA.debugLineNum = 36438016;BA.debugLine="Private Sub IsCachedFileUsable(dir As String, file";
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="If fileName = \"\" Then Return False";
if ((_filename).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36438018;
 //BA.debugLineNum = 36438018;BA.debugLine="Dim fileDir As String = ResolveRelativeParentDir(";
_filedir = __ref._resolverelativeparentdir /*String*/ (null,_dir,_filename);
RDebugUtils.currentLine=36438019;
 //BA.debugLineNum = 36438019;BA.debugLine="Dim leafName As String = ResolveRelativeLeafName(";
_leafname = __ref._resolverelativeleafname /*String*/ (null,_filename);
RDebugUtils.currentLine=36438020;
 //BA.debugLineNum = 36438020;BA.debugLine="If File.Exists(fileDir, leafName) = False Then Re";
if (__c.File.Exists(_filedir,_leafname)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36438021;
 //BA.debugLineNum = 36438021;BA.debugLine="Try";
try {RDebugUtils.currentLine=36438022;
 //BA.debugLineNum = 36438022;BA.debugLine="If File.Size(fileDir, leafName) > 0 Then Return";
if (__c.File.Size(_filedir,_leafname)>0) { 
if (true) return __c.True;};
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=36438024;
 //BA.debugLineNum = 36438024;BA.debugLine="Trace(\"ошибка кэша context=file_size message=\" &";
__ref._trace /*String*/ (null,"ошибка кэша context=file_size message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=36438026;
 //BA.debugLineNum = 36438026;BA.debugLine="DeleteFileIfExists(dir, fileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_filename);
RDebugUtils.currentLine=36438027;
 //BA.debugLineNum = 36438027;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=36438028;
 //BA.debugLineNum = 36438028;BA.debugLine="End Sub";
return false;
}
public byte[]  _buildtrackobfuscationkey(b4j.example.mediacache __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackobfuscationkey", false))
	 {return ((byte[]) Debug.delegate(ba, "buildtrackobfuscationkey", new Object[] {_trackid}));}
RDebugUtils.currentLine=36765696;
 //BA.debugLineNum = 36765696;BA.debugLine="Private Sub BuildTrackObfuscationKey(trackId As St";
RDebugUtils.currentLine=36765697;
 //BA.debugLineNum = 36765697;BA.debugLine="Return GetBytesFromString(BuildTrackObfuscationSe";
if (true) return __ref._getbytesfromstring /*byte[]*/ (null,__ref._buildtrackobfuscationseed /*String*/ (null,"key",_trackid));
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="End Sub";
return null;
}
public String  _buildtrackurl(b4j.example.mediacache __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackurl", false))
	 {return ((String) Debug.delegate(ba, "buildtrackurl", new Object[] {_trackid}));}
String _first = "";
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Private Sub BuildTrackUrl(trackId As String) As St";
RDebugUtils.currentLine=36306945;
 //BA.debugLineNum = 36306945;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="Dim first As String = trackId.SubString2(0, 1)";
_first = _trackid.substring((int) (0),(int) (1));
RDebugUtils.currentLine=36306947;
 //BA.debugLineNum = 36306947;BA.debugLine="Return \"https://cdn.fon.fm/media/tracks/\" & first";
if (true) return "https://cdn.fon.fm/media/tracks/"+_first+"/"+_trackid+".mp3";
RDebugUtils.currentLine=36306948;
 //BA.debugLineNum = 36306948;BA.debugLine="End Sub";
return "";
}
public long  _bytestomb(b4j.example.mediacache __ref,long _valuebytes) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "bytestomb", false))
	 {return ((Long) Debug.delegate(ba, "bytestomb", new Object[] {_valuebytes}));}
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Private Sub BytesToMb(valueBytes As Long) As Long";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="Return Floor(valueBytes / 1024 / 1024)";
if (true) return (long) (__c.Floor(_valuebytes/(double)1024/(double)1024));
RDebugUtils.currentLine=39387138;
 //BA.debugLineNum = 39387138;BA.debugLine="End Sub";
return 0L;
}
public String  _class_globals(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
RDebugUtils.currentLine=34340864;
 //BA.debugLineNum = 34340864;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=34340865;
 //BA.debugLineNum = 34340865;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=34340866;
 //BA.debugLineNum = 34340866;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=34340867;
 //BA.debugLineNum = 34340867;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=34340868;
 //BA.debugLineNum = 34340868;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=34340869;
 //BA.debugLineNum = 34340869;BA.debugLine="Private mediaDirName As String = \"media\"";
_mediadirname = "media";
RDebugUtils.currentLine=34340870;
 //BA.debugLineNum = 34340870;BA.debugLine="Private adsDirName As String = \"ads\"";
_adsdirname = "ads";
RDebugUtils.currentLine=34340871;
 //BA.debugLineNum = 34340871;BA.debugLine="Private tracksDirName As String = \"tracks\"";
_tracksdirname = "tracks";
RDebugUtils.currentLine=34340872;
 //BA.debugLineNum = 34340872;BA.debugLine="Private Const CACHE_AUDIT_BATCH_SIZE As Int = 8";
_cache_audit_batch_size = (int) (8);
RDebugUtils.currentLine=34340873;
 //BA.debugLineNum = 34340873;BA.debugLine="Private Const AD_DOWNLOAD_TIMEOUT_MS As Int = 150";
_ad_download_timeout_ms = (int) (15000);
RDebugUtils.currentLine=34340874;
 //BA.debugLineNum = 34340874;BA.debugLine="Private Const TRACK_DOWNLOAD_TIMEOUT_MS As Int =";
_track_download_timeout_ms = (int) (10000);
RDebugUtils.currentLine=34340875;
 //BA.debugLineNum = 34340875;BA.debugLine="Private Const STREAM_XOR_BUFFER_SIZE As Int = 327";
_stream_xor_buffer_size = (int) (32768);
RDebugUtils.currentLine=34340876;
 //BA.debugLineNum = 34340876;BA.debugLine="Private Const TRACK_CACHE_HARD_LIMIT_MB As Long =";
_track_cache_hard_limit_mb = (long) (1536);
RDebugUtils.currentLine=34340877;
 //BA.debugLineNum = 34340877;BA.debugLine="Private Const TRACK_CACHE_TARGET_MB As Long = 768";
_track_cache_target_mb = (long) (768);
RDebugUtils.currentLine=34340878;
 //BA.debugLineNum = 34340878;BA.debugLine="Private Const MIN_FREE_DISK_MB As Long = 1536";
_min_free_disk_mb = (long) (1536);
RDebugUtils.currentLine=34340879;
 //BA.debugLineNum = 34340879;BA.debugLine="Private Const MIN_FREE_DISK_PERCENT As Int = 5";
_min_free_disk_percent = (int) (5);
RDebugUtils.currentLine=34340880;
 //BA.debugLineNum = 34340880;BA.debugLine="Private Const PRIMARY_TEMP_TRACK_FILE As String =";
_primary_temp_track_file = "2f7f5f2f-91a0-4f4c-9f5f-70d7b94fd101.tmp";
RDebugUtils.currentLine=34340881;
 //BA.debugLineNum = 34340881;BA.debugLine="Private Const SECONDARY_TEMP_TRACK_FILE As String";
_secondary_temp_track_file = "92c2df6a-7f22-4b75-8c09-d5a6f4f40a21.tmp";
RDebugUtils.currentLine=34340882;
 //BA.debugLineNum = 34340882;BA.debugLine="Private cachedAdIndex As Map";
_cachedadindex = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34340883;
 //BA.debugLineNum = 34340883;BA.debugLine="Private cachedTrackIndex As Map";
_cachedtrackindex = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34340884;
 //BA.debugLineNum = 34340884;BA.debugLine="Private cachedAdIndexDirty As Boolean";
_cachedadindexdirty = false;
RDebugUtils.currentLine=34340885;
 //BA.debugLineNum = 34340885;BA.debugLine="Private cachedTrackIndexDirty As Boolean";
_cachedtrackindexdirty = false;
RDebugUtils.currentLine=34340886;
 //BA.debugLineNum = 34340886;BA.debugLine="Private playbackTempTrackIds As Map";
_playbacktemptrackids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34340887;
 //BA.debugLineNum = 34340887;BA.debugLine="Private cacheAuditInProgress As Boolean";
_cacheauditinprogress = false;
RDebugUtils.currentLine=34340888;
 //BA.debugLineNum = 34340888;BA.debugLine="Private cacheAuditPendingTypes As List";
_cacheauditpendingtypes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34340889;
 //BA.debugLineNum = 34340889;BA.debugLine="Private cacheAuditCurrentType As String";
_cacheauditcurrenttype = "";
RDebugUtils.currentLine=34340890;
 //BA.debugLineNum = 34340890;BA.debugLine="Private cacheAuditCurrentFileNames As List";
_cacheauditcurrentfilenames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34340891;
 //BA.debugLineNum = 34340891;BA.debugLine="Private cacheAuditCurrentPosition As Int";
_cacheauditcurrentposition = 0;
RDebugUtils.currentLine=34340892;
 //BA.debugLineNum = 34340892;BA.debugLine="Private cacheAuditSeenIds As Map";
_cacheauditseenids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34340893;
 //BA.debugLineNum = 34340893;BA.debugLine="Private cacheAuditAdIndexChanged As Boolean";
_cacheauditadindexchanged = false;
RDebugUtils.currentLine=34340894;
 //BA.debugLineNum = 34340894;BA.debugLine="Private cacheAuditTrackIndexChanged As Boolean";
_cacheaudittrackindexchanged = false;
RDebugUtils.currentLine=34340895;
 //BA.debugLineNum = 34340895;BA.debugLine="Private cacheAuditAddedCount As Int";
_cacheauditaddedcount = 0;
RDebugUtils.currentLine=34340896;
 //BA.debugLineNum = 34340896;BA.debugLine="Private cacheAuditRemovedCount As Int";
_cacheauditremovedcount = 0;
RDebugUtils.currentLine=34340897;
 //BA.debugLineNum = 34340897;BA.debugLine="Private cacheAuditTempDeletedCount As Int";
_cacheaudittempdeletedcount = 0;
RDebugUtils.currentLine=34340898;
 //BA.debugLineNum = 34340898;BA.debugLine="Private recentMediaNetworkFailure As Boolean";
_recentmedianetworkfailure = false;
RDebugUtils.currentLine=34340899;
 //BA.debugLineNum = 34340899;BA.debugLine="Private pruneLastCacheBytes As Long";
_prunelastcachebytes = 0L;
RDebugUtils.currentLine=34340900;
 //BA.debugLineNum = 34340900;BA.debugLine="Private pruneLastFreeBytes As Long";
_prunelastfreebytes = 0L;
RDebugUtils.currentLine=34340901;
 //BA.debugLineNum = 34340901;BA.debugLine="Private cachedTrackCount As Int";
_cachedtrackcount = 0;
RDebugUtils.currentLine=34340902;
 //BA.debugLineNum = 34340902;BA.debugLine="Private cachedAdCount As Int";
_cachedadcount = 0;
RDebugUtils.currentLine=34340903;
 //BA.debugLineNum = 34340903;BA.debugLine="Private cachedTrackBytes As Long";
_cachedtrackbytes = 0L;
RDebugUtils.currentLine=34340904;
 //BA.debugLineNum = 34340904;BA.debugLine="Private cachedAdBytes As Long";
_cachedadbytes = 0L;
RDebugUtils.currentLine=34340905;
 //BA.debugLineNum = 34340905;BA.debugLine="Private cachedTrackPlaylistStats As Map";
_cachedtrackplayliststats = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34340906;
 //BA.debugLineNum = 34340906;BA.debugLine="End Sub";
return "";
}
public String  _cleanupemptytrackplaylistdir(b4j.example.mediacache __ref,String _relativefilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "cleanupemptytrackplaylistdir", false))
	 {return ((String) Debug.delegate(ba, "cleanupemptytrackplaylistdir", new Object[] {_relativefilename}));}
String _playlistid = "";
String _playlistdir = "";
anywheresoftware.b4a.objects.collections.List _listed = null;
RDebugUtils.currentLine=82575360;
 //BA.debugLineNum = 82575360;BA.debugLine="Private Sub CleanupEmptyTrackPlaylistDir(relativeF";
RDebugUtils.currentLine=82575361;
 //BA.debugLineNum = 82575361;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFromT";
_playlistid = __ref._extractplaylistidfromtrackrelativepath /*String*/ (null,_relativefilename);
RDebugUtils.currentLine=82575362;
 //BA.debugLineNum = 82575362;BA.debugLine="If playlistId = \"\" Then Return";
if ((_playlistid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=82575363;
 //BA.debugLineNum = 82575363;BA.debugLine="Try";
try {RDebugUtils.currentLine=82575364;
 //BA.debugLineNum = 82575364;BA.debugLine="Dim playlistDir As String = GetTrackPlaylistDir(";
_playlistdir = __ref._gettrackplaylistdir /*String*/ (null,_playlistid);
RDebugUtils.currentLine=82575365;
 //BA.debugLineNum = 82575365;BA.debugLine="If DirectoryExists(playlistDir) = False Then Ret";
if (__ref._directoryexists /*boolean*/ (null,_playlistdir)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=82575366;
 //BA.debugLineNum = 82575366;BA.debugLine="Dim listed As List = File.ListFiles(playlistDir)";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_playlistdir);
RDebugUtils.currentLine=82575367;
 //BA.debugLineNum = 82575367;BA.debugLine="If listed.IsInitialized = False Or listed.Size =";
if (_listed.IsInitialized()==__c.False || _listed.getSize()==0) { 
RDebugUtils.currentLine=82575368;
 //BA.debugLineNum = 82575368;BA.debugLine="File.Delete(playlistDir, \"\")";
__c.File.Delete(_playlistdir,"");
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=82575371;
 //BA.debugLineNum = 82575371;BA.debugLine="Trace(\"Не удалось очистить пустую папку плейлист";
__ref._trace /*String*/ (null,"Не удалось очистить пустую папку плейлиста. playlistId="+_playlistid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=82575373;
 //BA.debugLineNum = 82575373;BA.debugLine="End Sub";
return "";
}
public String  _gettrackplaylistdir(b4j.example.mediacache __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "gettrackplaylistdir", false))
	 {return ((String) Debug.delegate(ba, "gettrackplaylistdir", new Object[] {_playlistid}));}
RDebugUtils.currentLine=82247680;
 //BA.debugLineNum = 82247680;BA.debugLine="Private Sub GetTrackPlaylistDir(playlistId As Stri";
RDebugUtils.currentLine=82247681;
 //BA.debugLineNum = 82247681;BA.debugLine="If playlistId = \"\" Then Return GetTracksDir";
if ((_playlistid).equals("")) { 
if (true) return __ref._gettracksdir /*String*/ (null);};
RDebugUtils.currentLine=82247682;
 //BA.debugLineNum = 82247682;BA.debugLine="Return File.Combine(GetTracksDir, playlistId)";
if (true) return __c.File.Combine(__ref._gettracksdir /*String*/ (null),_playlistid);
RDebugUtils.currentLine=82247683;
 //BA.debugLineNum = 82247683;BA.debugLine="End Sub";
return "";
}
public String  _deletefileifexists(b4j.example.mediacache __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "deletefileifexists", false))
	 {return ((String) Debug.delegate(ba, "deletefileifexists", new Object[] {_dir,_filename}));}
String _filedir = "";
String _leafname = "";
RDebugUtils.currentLine=37093376;
 //BA.debugLineNum = 37093376;BA.debugLine="Private Sub DeleteFileIfExists(dir As String, file";
RDebugUtils.currentLine=37093377;
 //BA.debugLineNum = 37093377;BA.debugLine="If fileName = \"\" Then Return";
if ((_filename).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=37093378;
 //BA.debugLineNum = 37093378;BA.debugLine="Try";
try {RDebugUtils.currentLine=37093379;
 //BA.debugLineNum = 37093379;BA.debugLine="Dim fileDir As String = ResolveRelativeParentDir";
_filedir = __ref._resolverelativeparentdir /*String*/ (null,_dir,_filename);
RDebugUtils.currentLine=37093380;
 //BA.debugLineNum = 37093380;BA.debugLine="Dim leafName As String = ResolveRelativeLeafName";
_leafname = __ref._resolverelativeleafname /*String*/ (null,_filename);
RDebugUtils.currentLine=37093381;
 //BA.debugLineNum = 37093381;BA.debugLine="If File.Exists(fileDir, leafName) Then File.Dele";
if (__c.File.Exists(_filedir,_leafname)) { 
__c.File.Delete(_filedir,_leafname);};
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=37093383;
 //BA.debugLineNum = 37093383;BA.debugLine="Trace(\"ошибка кэша context=file_delete message=\"";
__ref._trace /*String*/ (null,"ошибка кэша context=file_delete message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=37093385;
 //BA.debugLineNum = 37093385;BA.debugLine="End Sub";
return "";
}
public int  _comparetrackprunecandidates(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _leftitem,anywheresoftware.b4a.objects.collections.Map _rightitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "comparetrackprunecandidates", false))
	 {return ((Integer) Debug.delegate(ba, "comparetrackprunecandidates", new Object[] {_leftitem,_rightitem}));}
boolean _leftrelevant = false;
boolean _rightrelevant = false;
long _leftlastused = 0L;
long _rightlastused = 0L;
long _leftsaved = 0L;
long _rightsaved = 0L;
RDebugUtils.currentLine=38862848;
 //BA.debugLineNum = 38862848;BA.debugLine="Private Sub CompareTrackPruneCandidates(leftItem A";
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="Dim leftRelevant As Boolean = leftItem.GetDefault";
_leftrelevant = BA.ObjectToBoolean(_leftitem.GetDefault((Object)("is_relevant"),(Object)(__c.False)));
RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="Dim rightRelevant As Boolean = rightItem.GetDefau";
_rightrelevant = BA.ObjectToBoolean(_rightitem.GetDefault((Object)("is_relevant"),(Object)(__c.False)));
RDebugUtils.currentLine=38862851;
 //BA.debugLineNum = 38862851;BA.debugLine="If leftRelevant <> rightRelevant Then";
if (_leftrelevant!=_rightrelevant) { 
RDebugUtils.currentLine=38862852;
 //BA.debugLineNum = 38862852;BA.debugLine="If leftRelevant = False Then Return -1 Else Retu";
if (_leftrelevant==__c.False) { 
if (true) return (int) (-1);}
else {
if (true) return (int) (1);};
 };
RDebugUtils.currentLine=38862854;
 //BA.debugLineNum = 38862854;BA.debugLine="Dim leftLastUsed As Long = leftItem.GetDefault(\"l";
_leftlastused = BA.ObjectToLongNumber(_leftitem.GetDefault((Object)("last_used_at"),(Object)(0)));
RDebugUtils.currentLine=38862855;
 //BA.debugLineNum = 38862855;BA.debugLine="Dim rightLastUsed As Long = rightItem.GetDefault(";
_rightlastused = BA.ObjectToLongNumber(_rightitem.GetDefault((Object)("last_used_at"),(Object)(0)));
RDebugUtils.currentLine=38862856;
 //BA.debugLineNum = 38862856;BA.debugLine="If leftLastUsed <> rightLastUsed Then";
if (_leftlastused!=_rightlastused) { 
RDebugUtils.currentLine=38862857;
 //BA.debugLineNum = 38862857;BA.debugLine="If leftLastUsed < rightLastUsed Then Return -1 E";
if (_leftlastused<_rightlastused) { 
if (true) return (int) (-1);}
else {
if (true) return (int) (1);};
 };
RDebugUtils.currentLine=38862859;
 //BA.debugLineNum = 38862859;BA.debugLine="Dim leftSaved As Long = leftItem.GetDefault(\"save";
_leftsaved = BA.ObjectToLongNumber(_leftitem.GetDefault((Object)("saved_at"),(Object)(0)));
RDebugUtils.currentLine=38862860;
 //BA.debugLineNum = 38862860;BA.debugLine="Dim rightSaved As Long = rightItem.GetDefault(\"sa";
_rightsaved = BA.ObjectToLongNumber(_rightitem.GetDefault((Object)("saved_at"),(Object)(0)));
RDebugUtils.currentLine=38862861;
 //BA.debugLineNum = 38862861;BA.debugLine="If leftSaved <> rightSaved Then";
if (_leftsaved!=_rightsaved) { 
RDebugUtils.currentLine=38862862;
 //BA.debugLineNum = 38862862;BA.debugLine="If leftSaved < rightSaved Then Return -1 Else Re";
if (_leftsaved<_rightsaved) { 
if (true) return (int) (-1);}
else {
if (true) return (int) (1);};
 };
RDebugUtils.currentLine=38862864;
 //BA.debugLineNum = 38862864;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=38862865;
 //BA.debugLineNum = 38862865;BA.debugLine="End Sub";
return 0;
}
public int  _counttrackfilesondisk(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "counttrackfilesondisk", false))
	 {return ((Integer) Debug.delegate(ba, "counttrackfilesondisk", null));}
int _count = 0;
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
String _filename = "";
RDebugUtils.currentLine=86769664;
 //BA.debugLineNum = 86769664;BA.debugLine="Private Sub CountTrackFilesOnDisk As Int";
RDebugUtils.currentLine=86769665;
 //BA.debugLineNum = 86769665;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (__ref._directoryexists /*boolean*/ (null,__ref._gettracksdir /*String*/ (null))==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=86769666;
 //BA.debugLineNum = 86769666;BA.debugLine="Dim count As Int = 0";
_count = (int) (0);
RDebugUtils.currentLine=86769667;
 //BA.debugLineNum = 86769667;BA.debugLine="Try";
try {RDebugUtils.currentLine=86769668;
 //BA.debugLineNum = 86769668;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRec";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __ref._listtrackcachefilesrecursive /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=86769669;
 //BA.debugLineNum = 86769669;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=86769670;
 //BA.debugLineNum = 86769670;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group6 = _listedfiles;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_filename = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=86769671;
 //BA.debugLineNum = 86769671;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=86769672;
 //BA.debugLineNum = 86769672;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
if (_filename.endsWith(".tmp")) { 
if (true) continue;};
RDebugUtils.currentLine=86769673;
 //BA.debugLineNum = 86769673;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
};
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=86769676;
 //BA.debugLineNum = 86769676;BA.debugLine="Trace(\"Не удалось посчитать track файлы на диске";
__ref._trace /*String*/ (null,"Не удалось посчитать track файлы на диске. message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=86769678;
 //BA.debugLineNum = 86769678;BA.debugLine="Return count";
if (true) return _count;
RDebugUtils.currentLine=86769679;
 //BA.debugLineNum = 86769679;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=39452672;
 //BA.debugLineNum = 39452672;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=39452675;
 //BA.debugLineNum = 39452675;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=39452676;
 //BA.debugLineNum = 39452676;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createtrackidset(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.List _trackids) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "createtrackidset", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createtrackidset", new Object[] {_trackids}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
String _trackid = "";
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Private Sub CreateTrackIdSet(trackIds As List) As";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=38928387;
 //BA.debugLineNum = 38928387;BA.debugLine="If trackIds.IsInitialized = False Then Return res";
if (_trackids.IsInitialized()==__c.False) { 
if (true) return _result;};
RDebugUtils.currentLine=38928388;
 //BA.debugLineNum = 38928388;BA.debugLine="For Each trackId As String In trackIds";
{
final anywheresoftware.b4a.BA.IterableList group4 = _trackids;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_trackid = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=38928389;
 //BA.debugLineNum = 38928389;BA.debugLine="If trackId <> \"\" Then result.Put(trackId, True)";
if ((_trackid).equals("") == false) { 
_result.Put((Object)(_trackid),(Object)(__c.True));};
 }
};
RDebugUtils.currentLine=38928391;
 //BA.debugLineNum = 38928391;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=38928392;
 //BA.debugLineNum = 38928392;BA.debugLine="End Sub";
return null;
}
public String  _resolverelativeparentdir(b4j.example.mediacache __ref,String _basedir,String _relativefilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolverelativeparentdir", false))
	 {return ((String) Debug.delegate(ba, "resolverelativeparentdir", new Object[] {_basedir,_relativefilename}));}
String _normalizedname = "";
int _slashindex = 0;
String _parentrelative = "";
RDebugUtils.currentLine=82640896;
 //BA.debugLineNum = 82640896;BA.debugLine="Private Sub ResolveRelativeParentDir(baseDir As St";
RDebugUtils.currentLine=82640897;
 //BA.debugLineNum = 82640897;BA.debugLine="Dim normalizedName As String = relativeFileName.R";
_normalizedname = _relativefilename.replace("\\\\","/");
RDebugUtils.currentLine=82640898;
 //BA.debugLineNum = 82640898;BA.debugLine="Dim slashIndex As Int = normalizedName.LastIndexO";
_slashindex = _normalizedname.lastIndexOf("/");
RDebugUtils.currentLine=82640899;
 //BA.debugLineNum = 82640899;BA.debugLine="If slashIndex < 0 Then Return baseDir";
if (_slashindex<0) { 
if (true) return _basedir;};
RDebugUtils.currentLine=82640900;
 //BA.debugLineNum = 82640900;BA.debugLine="Dim parentRelative As String = normalizedName.Sub";
_parentrelative = _normalizedname.substring((int) (0),_slashindex);
RDebugUtils.currentLine=82640901;
 //BA.debugLineNum = 82640901;BA.debugLine="If parentRelative = \"\" Then Return baseDir";
if ((_parentrelative).equals("")) { 
if (true) return _basedir;};
RDebugUtils.currentLine=82640902;
 //BA.debugLineNum = 82640902;BA.debugLine="Return File.Combine(baseDir, parentRelative)";
if (true) return __c.File.Combine(_basedir,_parentrelative);
RDebugUtils.currentLine=82640903;
 //BA.debugLineNum = 82640903;BA.debugLine="End Sub";
return "";
}
public String  _resolverelativeleafname(b4j.example.mediacache __ref,String _relativefilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolverelativeleafname", false))
	 {return ((String) Debug.delegate(ba, "resolverelativeleafname", new Object[] {_relativefilename}));}
String _normalizedname = "";
int _slashindex = 0;
RDebugUtils.currentLine=82706432;
 //BA.debugLineNum = 82706432;BA.debugLine="Private Sub ResolveRelativeLeafName(relativeFileNa";
RDebugUtils.currentLine=82706433;
 //BA.debugLineNum = 82706433;BA.debugLine="Dim normalizedName As String = relativeFileName.R";
_normalizedname = _relativefilename.replace("\\\\","/");
RDebugUtils.currentLine=82706434;
 //BA.debugLineNum = 82706434;BA.debugLine="Dim slashIndex As Int = normalizedName.LastIndexO";
_slashindex = _normalizedname.lastIndexOf("/");
RDebugUtils.currentLine=82706435;
 //BA.debugLineNum = 82706435;BA.debugLine="If slashIndex < 0 Then Return normalizedName";
if (_slashindex<0) { 
if (true) return _normalizedname;};
RDebugUtils.currentLine=82706436;
 //BA.debugLineNum = 82706436;BA.debugLine="Return normalizedName.SubString(slashIndex + 1)";
if (true) return _normalizedname.substring((int) (_slashindex+1));
RDebugUtils.currentLine=82706437;
 //BA.debugLineNum = 82706437;BA.debugLine="End Sub";
return "";
}
public long  _elapsedms(b4j.example.mediacache __ref,long _startedat) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "elapsedms", false))
	 {return ((Long) Debug.delegate(ba, "elapsedms", new Object[] {_startedat}));}
RDebugUtils.currentLine=37814272;
 //BA.debugLineNum = 37814272;BA.debugLine="Private Sub ElapsedMs(startedAt As Long) As Long";
RDebugUtils.currentLine=37814273;
 //BA.debugLineNum = 37814273;BA.debugLine="Return Max(0, DateTime.Now - startedAt)";
if (true) return (long) (__c.Max(0,__c.DateTime.getNow()-_startedat));
RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedadindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedadindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedadindex", null));}
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Private Sub GetCachedAdIndex As Map";
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="If cachedAdIndex.IsInitialized = False Then";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="cachedAdIndex.Initialize";
__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=35848196;
 //BA.debugLineNum = 35848196;BA.debugLine="Return cachedAdIndex";
if (true) return __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=35848197;
 //BA.debugLineNum = 35848197;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuresingleadcached(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _adindex) throws Exception{
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuresingleadcached", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuresingleadcached", new Object[] {_ad,_adindex}));}
ResumableSub_EnsureSingleAdCached rsub = new ResumableSub_EnsureSingleAdCached(this,__ref,_ad,_adindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureSingleAdCached extends BA.ResumableSub {
public ResumableSub_EnsureSingleAdCached(b4j.example.mediacache parent,b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _adindex) {
this.parent = parent;
this.__ref = __ref;
this._ad = _ad;
this._adindex = _adindex;
this.__ref = parent;
}
b4j.example.mediacache __ref;
b4j.example.mediacache parent;
anywheresoftware.b4a.objects.collections.Map _ad;
anywheresoftware.b4a.objects.collections.Map _adindex;
String _adid = "";
String _adurl = "";
long _downloadstartedat = 0L;
b4j.example.httpjob _j = null;
String _tempfilename = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outstream = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mediacache";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35520513;
 //BA.debugLineNum = 35520513;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="If adId = \"\" Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if ((_adid).equals("")) { 
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
RDebugUtils.currentLine=35520515;
 //BA.debugLineNum = 35520515;BA.debugLine="If TryRestoreExistingCachedMedia(\"ad\", adId, ad,";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._tryrestoreexistingcachedmedia /*boolean*/ (null,"ad",_adid,_ad,_adindex)) { 
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
this.state = 13;
;
RDebugUtils.currentLine=35520516;
 //BA.debugLineNum = 35520516;BA.debugLine="If IsAdCached(adId) Then";
if (true) break;

case 13:
//if
this.state = 16;
if (__ref._isadcached /*boolean*/ (null,_adid)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=35520517;
 //BA.debugLineNum = 35520517;BA.debugLine="UpdateAdIndex(ad, adIndex)";
__ref._updateadindex /*String*/ (null,_ad,_adindex);
RDebugUtils.currentLine=35520518;
 //BA.debugLineNum = 35520518;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=35520520;
 //BA.debugLineNum = 35520520;BA.debugLine="Dim adUrl As String = BuildAdUrl(adId)";
_adurl = __ref._buildadurl /*String*/ (null,_adid);
RDebugUtils.currentLine=35520521;
 //BA.debugLineNum = 35520521;BA.debugLine="If adUrl = \"\" Then Return False";
if (true) break;

case 17:
//if
this.state = 22;
if ((_adurl).equals("")) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=35520522;
 //BA.debugLineNum = 35520522;BA.debugLine="Dim downloadStartedAt As Long = DateTime.Now";
_downloadstartedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=35520523;
 //BA.debugLineNum = 35520523;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=35520524;
 //BA.debugLineNum = 35520524;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=35520525;
 //BA.debugLineNum = 35520525;BA.debugLine="Trace(\"Скачивание рекламы в кэш. id=\" & adId & \",";
__ref._trace /*String*/ (null,"Скачивание рекламы в кэш. id="+_adid+", url="+_adurl);
RDebugUtils.currentLine=35520526;
 //BA.debugLineNum = 35520526;BA.debugLine="j.Download(adUrl)";
_j._download /*String*/ (null,_adurl);
RDebugUtils.currentLine=35520527;
 //BA.debugLineNum = 35520527;BA.debugLine="j.GetRequest.Timeout = AD_DOWNLOAD_TIMEOUT_MS";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._ad_download_timeout_ms /*int*/ );
RDebugUtils.currentLine=35520528;
 //BA.debugLineNum = 35520528;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensuresingleadcached"), (Object)(_j));
this.state = 48;
return;
case 48:
//C
this.state = 23;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=35520529;
 //BA.debugLineNum = 35520529;BA.debugLine="If j.Success Then";
if (true) break;

case 23:
//if
this.state = 47;
if (_j._success /*boolean*/ ) { 
this.state = 25;
}else {
this.state = 40;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=35520530;
 //BA.debugLineNum = 35520530;BA.debugLine="Try";
if (true) break;

case 26:
//try
this.state = 38;
this.catchState = 37;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 37;
RDebugUtils.currentLine=35520531;
 //BA.debugLineNum = 35520531;BA.debugLine="EnsureDirectory(GetAdsDir)";
__ref._ensuredirectory /*String*/ (null,__ref._getadsdir /*String*/ (null));
RDebugUtils.currentLine=35520532;
 //BA.debugLineNum = 35520532;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
_tempfilename = __ref._buildtempcachefilename /*String*/ (null,_adid);
RDebugUtils.currentLine=35520533;
 //BA.debugLineNum = 35520533;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=35520534;
 //BA.debugLineNum = 35520534;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = parent.__c.File.OpenOutput(__ref._getadsdir /*String*/ (null),_tempfilename,parent.__c.False);
RDebugUtils.currentLine=35520535;
 //BA.debugLineNum = 35520535;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_outstream.getObject()));
RDebugUtils.currentLine=35520536;
 //BA.debugLineNum = 35520536;BA.debugLine="outStream.Close";
_outstream.Close();
RDebugUtils.currentLine=35520537;
 //BA.debugLineNum = 35520537;BA.debugLine="If IsCachedFileUsable(GetAdsDir, tempFileName)";
if (true) break;

case 29:
//if
this.state = 32;
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename)==parent.__c.False) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=35520538;
 //BA.debugLineNum = 35520538;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=35520539;
 //BA.debugLineNum = 35520539;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
__ref._trace /*String*/ (null,"Не удалось сохранить рекламу в кэш. id="+_adid+", message=empty temp file");
RDebugUtils.currentLine=35520540;
 //BA.debugLineNum = 35520540;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=35520541;
 //BA.debugLineNum = 35520541;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=35520543;
 //BA.debugLineNum = 35520543;BA.debugLine="If ReplaceCacheFile(GetAdsDir, tempFileName, ad";

case 32:
//if
this.state = 35;
if (__ref._replacecachefile /*boolean*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename,_adid)==parent.__c.False) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=35520544;
 //BA.debugLineNum = 35520544;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=35520545;
 //BA.debugLineNum = 35520545;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
__ref._trace /*String*/ (null,"Не удалось сохранить рекламу в кэш. id="+_adid+", message=rename failed");
RDebugUtils.currentLine=35520546;
 //BA.debugLineNum = 35520546;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=35520547;
 //BA.debugLineNum = 35520547;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 35:
//C
this.state = 38;
;
RDebugUtils.currentLine=35520549;
 //BA.debugLineNum = 35520549;BA.debugLine="UpdateAdIndex(ad, adIndex)";
__ref._updateadindex /*String*/ (null,_ad,_adindex);
RDebugUtils.currentLine=35520550;
 //BA.debugLineNum = 35520550;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
RDebugUtils.currentLine=35520551;
 //BA.debugLineNum = 35520551;BA.debugLine="recentMediaNetworkFailure = False";
__ref._recentmedianetworkfailure /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=35520552;
 //BA.debugLineNum = 35520552;BA.debugLine="Trace(\"Реклама сохранена в кэш. id=\" & adId & \"";
__ref._trace /*String*/ (null,"Реклама сохранена в кэш. id="+_adid+", totalElapsedMs="+BA.NumberToString(__ref._elapsedms /*long*/ (null,_downloadstartedat)));
RDebugUtils.currentLine=35520553;
 //BA.debugLineNum = 35520553;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=35520554;
 //BA.debugLineNum = 35520554;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 0;
RDebugUtils.currentLine=35520556;
 //BA.debugLineNum = 35520556;BA.debugLine="DeleteFileIfExists(GetAdsDir, BuildTempCacheFil";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),__ref._buildtempcachefilename /*String*/ (null,_adid));
RDebugUtils.currentLine=35520557;
 //BA.debugLineNum = 35520557;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=\"";
__ref._trace /*String*/ (null,"Не удалось сохранить рекламу в кэш. id="+_adid+", message="+parent.__c.LastException(ba).getMessage());
 if (true) break;
if (true) break;

case 38:
//C
this.state = 47;
this.catchState = 0;
;
 if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=35520560;
 //BA.debugLineNum = 35520560;BA.debugLine="If IsMediaNetworkFailure(j.ErrorMessage) Then re";
if (true) break;

case 41:
//if
this.state = 46;
if (__ref._ismedianetworkfailure /*boolean*/ (null,_j._errormessage /*String*/ )) { 
this.state = 43;
;}if (true) break;

case 43:
//C
this.state = 46;
__ref._recentmedianetworkfailure /*boolean*/  = parent.__c.True;
if (true) break;

case 46:
//C
this.state = 47;
;
RDebugUtils.currentLine=35520561;
 //BA.debugLineNum = 35520561;BA.debugLine="Trace(\"Не удалось скачать рекламу. id=\" & adId &";
__ref._trace /*String*/ (null,"Не удалось скачать рекламу. id="+_adid+", message="+_j._errormessage /*String*/ );
 if (true) break;

case 47:
//C
this.state = -1;
;
RDebugUtils.currentLine=35520563;
 //BA.debugLineNum = 35520563;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=35520564;
 //BA.debugLineNum = 35520564;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=35520565;
 //BA.debugLineNum = 35520565;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public int  _prunemissingads(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _adindex,anywheresoftware.b4a.objects.collections.Map _actualadids) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "prunemissingads", false))
	 {return ((Integer) Debug.delegate(ba, "prunemissingads", new Object[] {_adindex,_actualadids}));}
int _removedcount = 0;
anywheresoftware.b4a.objects.collections.List _idstoremove = null;
String _adid = "";
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Private Sub PruneMissingAds(adIndex As Map, actual";
RDebugUtils.currentLine=35717121;
 //BA.debugLineNum = 35717121;BA.debugLine="Dim removedCount As Int = 0";
_removedcount = (int) (0);
RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="Dim idsToRemove As List";
_idstoremove = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35717123;
 //BA.debugLineNum = 35717123;BA.debugLine="idsToRemove.Initialize";
_idstoremove.Initialize();
RDebugUtils.currentLine=35717124;
 //BA.debugLineNum = 35717124;BA.debugLine="For Each adId As String In adIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _adindex.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_adid = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=35717125;
 //BA.debugLineNum = 35717125;BA.debugLine="If actualAdIds.ContainsKey(adId) = False Then id";
if (_actualadids.ContainsKey((Object)(_adid))==__c.False) { 
_idstoremove.Add((Object)(_adid));};
 }
};
RDebugUtils.currentLine=35717127;
 //BA.debugLineNum = 35717127;BA.debugLine="For Each adId As String In idsToRemove";
{
final anywheresoftware.b4a.BA.IterableList group7 = _idstoremove;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_adid = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=35717128;
 //BA.debugLineNum = 35717128;BA.debugLine="DeleteFileIfExists(GetAdsDir, adId)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_adid);
RDebugUtils.currentLine=35717129;
 //BA.debugLineNum = 35717129;BA.debugLine="adIndex.Remove(adId)";
_adindex.Remove((Object)(_adid));
RDebugUtils.currentLine=35717130;
 //BA.debugLineNum = 35717130;BA.debugLine="removedCount = removedCount + 1";
_removedcount = (int) (_removedcount+1);
RDebugUtils.currentLine=35717131;
 //BA.debugLineNum = 35717131;BA.debugLine="cachedAdIndexDirty = True";
__ref._cachedadindexdirty /*boolean*/  = __c.True;
RDebugUtils.currentLine=35717132;
 //BA.debugLineNum = 35717132;BA.debugLine="Trace(\"Удален cached ad, отсутствующий в актуаль";
__ref._trace /*String*/ (null,"Удален cached ad, отсутствующий в актуальном data. id="+_adid);
 }
};
RDebugUtils.currentLine=35717134;
 //BA.debugLineNum = 35717134;BA.debugLine="Return removedCount";
if (true) return _removedcount;
RDebugUtils.currentLine=35717135;
 //BA.debugLineNum = 35717135;BA.debugLine="End Sub";
return 0;
}
public String  _saveadindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "saveadindex", false))
	 {return ((String) Debug.delegate(ba, "saveadindex", null));}
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Private Sub SaveAdIndex";
RDebugUtils.currentLine=36110337;
 //BA.debugLineNum = 36110337;BA.debugLine="RebuildCacheStatsFromIndexes";
__ref._rebuildcachestatsfromindexes /*String*/ (null);
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="storage.Put(\"cached_ad_index\", cachedAdIndex)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_ad_index",(Object)(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=36110339;
 //BA.debugLineNum = 36110339;BA.debugLine="storage.Put(\"cached_ad_count\", cachedAdCount)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_ad_count",(Object)(__ref._cachedadcount /*int*/ ));
RDebugUtils.currentLine=36110340;
 //BA.debugLineNum = 36110340;BA.debugLine="SaveCacheStatsSnapshot";
__ref._savecachestatssnapshot /*String*/ (null);
RDebugUtils.currentLine=36110341;
 //BA.debugLineNum = 36110341;BA.debugLine="cachedAdIndexDirty = False";
__ref._cachedadindexdirty /*boolean*/  = __c.False;
RDebugUtils.currentLine=36110342;
 //BA.debugLineNum = 36110342;BA.debugLine="End Sub";
return "";
}
public String  _ensuredirectory(b4j.example.mediacache __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _fileobject = null;
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="fileObject.RunMethod(\"mkdirs\", Null)";
_fileobject.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=37879812;
 //BA.debugLineNum = 37879812;BA.debugLine="End Sub";
return "";
}
public boolean  _tryrestoreexistingcachedmedia(b4j.example.mediacache __ref,String _itemtype,String _itemid,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _itemindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "tryrestoreexistingcachedmedia", false))
	 {return ((Boolean) Debug.delegate(ba, "tryrestoreexistingcachedmedia", new Object[] {_itemtype,_itemid,_item,_itemindex}));}
RDebugUtils.currentLine=37355520;
 //BA.debugLineNum = 37355520;BA.debugLine="Private Sub TryRestoreExistingCachedMedia(itemType";
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=37355522;
 //BA.debugLineNum = 37355522;BA.debugLine="If IsCachedFileUsable(GetDirByItemType(itemType),";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._getdirbyitemtype /*String*/ (null,_itemtype),__ref._resolveindexedfilename /*String*/ (null,_itemtype,_itemid,_itemindex))==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=37355523;
 //BA.debugLineNum = 37355523;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=37355524;
 //BA.debugLineNum = 37355524;BA.debugLine="UpdateAdIndex(item, itemIndex)";
__ref._updateadindex /*String*/ (null,_item,_itemindex);
RDebugUtils.currentLine=37355525;
 //BA.debugLineNum = 37355525;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
RDebugUtils.currentLine=37355526;
 //BA.debugLineNum = 37355526;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=37355528;
 //BA.debugLineNum = 37355528;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=37355529;
 //BA.debugLineNum = 37355529;BA.debugLine="UpdateTrackIndex(item, itemIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_itemindex);
RDebugUtils.currentLine=37355530;
 //BA.debugLineNum = 37355530;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=37355531;
 //BA.debugLineNum = 37355531;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=37355533;
 //BA.debugLineNum = 37355533;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=37355534;
 //BA.debugLineNum = 37355534;BA.debugLine="End Sub";
return false;
}
public String  _updateadindex(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _adindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "updateadindex", false))
	 {return ((String) Debug.delegate(ba, "updateadindex", new Object[] {_ad,_adindex}));}
String _adid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Private Sub UpdateAdIndex(ad As Map, adIndex As Ma";
RDebugUtils.currentLine=35651585;
 //BA.debugLineNum = 35651585;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="If adId = \"\" Then Return";
if ((_adid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=35651587;
 //BA.debugLineNum = 35651587;BA.debugLine="Dim entry As Map = adIndex.GetDefault(adId, Null)";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adindex.GetDefault((Object)(_adid),__c.Null)));
RDebugUtils.currentLine=35651588;
 //BA.debugLineNum = 35651588;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=35651589;
 //BA.debugLineNum = 35651589;BA.debugLine="entry.Put(\"id\", adId)";
_entry.Put((Object)("id"),(Object)(_adid));
RDebugUtils.currentLine=35651590;
 //BA.debugLineNum = 35651590;BA.debugLine="entry.Put(\"title\", ad.GetDefault(\"title\", \"\"))";
_entry.Put((Object)("title"),_ad.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=35651591;
 //BA.debugLineNum = 35651591;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=35651592;
 //BA.debugLineNum = 35651592;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=35651593;
 //BA.debugLineNum = 35651593;BA.debugLine="entry.Put(\"duration\", ad.GetDefault(\"duration\", 0";
_entry.Put((Object)("duration"),_ad.GetDefault((Object)("duration"),(Object)(0)));
RDebugUtils.currentLine=35651594;
 //BA.debugLineNum = 35651594;BA.debugLine="entry.Put(\"gain\", ad.GetDefault(\"gain\", 0))";
_entry.Put((Object)("gain"),_ad.GetDefault((Object)("gain"),(Object)(0)));
RDebugUtils.currentLine=35651595;
 //BA.debugLineNum = 35651595;BA.debugLine="adIndex.Put(adId, entry)";
_adindex.Put((Object)(_adid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=35651596;
 //BA.debugLineNum = 35651596;BA.debugLine="cachedAdIndexDirty = True";
__ref._cachedadindexdirty /*boolean*/  = __c.True;
RDebugUtils.currentLine=35651597;
 //BA.debugLineNum = 35651597;BA.debugLine="End Sub";
return "";
}
public String  _getadsdir(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getadsdir", false))
	 {return ((String) Debug.delegate(ba, "getadsdir", null));}
RDebugUtils.currentLine=35061760;
 //BA.debugLineNum = 35061760;BA.debugLine="Public Sub GetAdsDir As String";
RDebugUtils.currentLine=35061761;
 //BA.debugLineNum = 35061761;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
if (true) return __c.File.Combine(__c.File.Combine(__ref._storagedir /*String*/ ,__ref._mediadirname /*String*/ ),__ref._adsdirname /*String*/ );
RDebugUtils.currentLine=35061762;
 //BA.debugLineNum = 35061762;BA.debugLine="End Sub";
return "";
}
public boolean  _replacecachefile(b4j.example.mediacache __ref,String _dir,String _tempfilename,String _finalfilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "replacecachefile", false))
	 {return ((Boolean) Debug.delegate(ba, "replacecachefile", new Object[] {_dir,_tempfilename,_finalfilename}));}
anywheresoftware.b4j.object.JavaObject _tempfile = null;
anywheresoftware.b4j.object.JavaObject _finalfile = null;
boolean _renamed = false;
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Private Sub ReplaceCacheFile(dir As String, tempFi";
RDebugUtils.currentLine=36634625;
 //BA.debugLineNum = 36634625;BA.debugLine="If IsCachedFileUsable(dir, tempFileName) = False";
if (__ref._iscachedfileusable /*boolean*/ (null,_dir,_tempfilename)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="If IsCachedFileUsable(dir, finalFileName) Then";
if (__ref._iscachedfileusable /*boolean*/ (null,_dir,_finalfilename)) { 
RDebugUtils.currentLine=36634627;
 //BA.debugLineNum = 36634627;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_tempfilename);
RDebugUtils.currentLine=36634628;
 //BA.debugLineNum = 36634628;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=36634630;
 //BA.debugLineNum = 36634630;BA.debugLine="DeleteFileIfExists(dir, finalFileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_finalfilename);
RDebugUtils.currentLine=36634631;
 //BA.debugLineNum = 36634631;BA.debugLine="Dim tempFile As JavaObject";
_tempfile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=36634632;
 //BA.debugLineNum = 36634632;BA.debugLine="tempFile.InitializeNewInstance(\"java.io.File\", Ar";
_tempfile.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_dir,_tempfilename))});
RDebugUtils.currentLine=36634633;
 //BA.debugLineNum = 36634633;BA.debugLine="Dim finalFile As JavaObject";
_finalfile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=36634634;
 //BA.debugLineNum = 36634634;BA.debugLine="finalFile.InitializeNewInstance(\"java.io.File\", A";
_finalfile.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_dir,_finalfilename))});
RDebugUtils.currentLine=36634635;
 //BA.debugLineNum = 36634635;BA.debugLine="Dim renamed As Boolean = tempFile.RunMethod(\"rena";
_renamed = BA.ObjectToBoolean(_tempfile.RunMethod("renameTo",new Object[]{(Object)(_finalfile.getObject())}));
RDebugUtils.currentLine=36634636;
 //BA.debugLineNum = 36634636;BA.debugLine="If renamed = False And IsCachedFileUsable(dir, fi";
if (_renamed==__c.False && __ref._iscachedfileusable /*boolean*/ (null,_dir,_finalfilename)) { 
RDebugUtils.currentLine=36634637;
 //BA.debugLineNum = 36634637;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_tempfilename);
RDebugUtils.currentLine=36634638;
 //BA.debugLineNum = 36634638;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=36634640;
 //BA.debugLineNum = 36634640;BA.debugLine="Return renamed";
if (true) return _renamed;
RDebugUtils.currentLine=36634641;
 //BA.debugLineNum = 36634641;BA.debugLine="End Sub";
return false;
}
public boolean  _ismedianetworkfailure(b4j.example.mediacache __ref,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ismedianetworkfailure", false))
	 {return ((Boolean) Debug.delegate(ba, "ismedianetworkfailure", new Object[] {_errormessage}));}
String _text = "";
RDebugUtils.currentLine=37748736;
 //BA.debugLineNum = 37748736;BA.debugLine="Private Sub IsMediaNetworkFailure(errorMessage As";
RDebugUtils.currentLine=37748737;
 //BA.debugLineNum = 37748737;BA.debugLine="Dim text As String = errorMessage.ToLowerCase";
_text = _errormessage.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="If text.Contains(\"timed out\") Then Return True";
if (_text.contains("timed out")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=37748739;
 //BA.debugLineNum = 37748739;BA.debugLine="If text.Contains(\"unknownhost\") Then Return True";
if (_text.contains("unknownhost")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=37748740;
 //BA.debugLineNum = 37748740;BA.debugLine="If text.Contains(\"refused\") Then Return True";
if (_text.contains("refused")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=37748741;
 //BA.debugLineNum = 37748741;BA.debugLine="If text.Contains(\"sslhandshakeexception\") Then Re";
if (_text.contains("sslhandshakeexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=37748742;
 //BA.debugLineNum = 37748742;BA.debugLine="If text.Contains(\"pkix path building failed\") The";
if (_text.contains("pkix path building failed")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=37748743;
 //BA.debugLineNum = 37748743;BA.debugLine="If text.Contains(\"unable to find valid certificat";
if (_text.contains("unable to find valid certification path")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=37748744;
 //BA.debugLineNum = 37748744;BA.debugLine="If text.Contains(\"connectexception\") Then Return";
if (_text.contains("connectexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=37748745;
 //BA.debugLineNum = 37748745;BA.debugLine="If text.Contains(\"socketexception\") Then Return T";
if (_text.contains("socketexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=37748746;
 //BA.debugLineNum = 37748746;BA.debugLine="If text.Contains(\"sockettimeoutexception\") Then R";
if (_text.contains("sockettimeoutexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=37748747;
 //BA.debugLineNum = 37748747;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=37748748;
 //BA.debugLineNum = 37748748;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuresingletrackcached(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuresingletrackcached", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuresingletrackcached", new Object[] {_item,_trackindex}));}
ResumableSub_EnsureSingleTrackCached rsub = new ResumableSub_EnsureSingleTrackCached(this,__ref,_item,_trackindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureSingleTrackCached extends BA.ResumableSub {
public ResumableSub_EnsureSingleTrackCached(b4j.example.mediacache parent,b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex) {
this.parent = parent;
this.__ref = __ref;
this._item = _item;
this._trackindex = _trackindex;
this.__ref = parent;
}
b4j.example.mediacache __ref;
b4j.example.mediacache parent;
anywheresoftware.b4a.objects.collections.Map _item;
anywheresoftware.b4a.objects.collections.Map _trackindex;
String _trackid = "";
String _trackurl = "";
long _downloadstartedat = 0L;
b4j.example.httpjob _j = null;
String _playlistid = "";
String _trackdir = "";
String _tempfilename = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outstream = null;
String _failedplaylistid = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mediacache";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35586049;
 //BA.debugLineNum = 35586049;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=35586050;
 //BA.debugLineNum = 35586050;BA.debugLine="If trackId = \"\" Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if ((_trackid).equals("")) { 
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
RDebugUtils.currentLine=35586051;
 //BA.debugLineNum = 35586051;BA.debugLine="If TryRestoreExistingCachedMedia(\"track\", trackId";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._tryrestoreexistingcachedmedia /*boolean*/ (null,"track",_trackid,_item,_trackindex)) { 
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
this.state = 13;
;
RDebugUtils.currentLine=35586052;
 //BA.debugLineNum = 35586052;BA.debugLine="If IsTrackCached(trackId) Then";
if (true) break;

case 13:
//if
this.state = 16;
if (__ref._istrackcached /*boolean*/ (null,_trackid)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=35586053;
 //BA.debugLineNum = 35586053;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_trackindex);
RDebugUtils.currentLine=35586054;
 //BA.debugLineNum = 35586054;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=35586056;
 //BA.debugLineNum = 35586056;BA.debugLine="Dim trackUrl As String = BuildTrackUrl(trackId)";
_trackurl = __ref._buildtrackurl /*String*/ (null,_trackid);
RDebugUtils.currentLine=35586057;
 //BA.debugLineNum = 35586057;BA.debugLine="If trackUrl = \"\" Then Return False";
if (true) break;

case 17:
//if
this.state = 22;
if ((_trackurl).equals("")) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=35586058;
 //BA.debugLineNum = 35586058;BA.debugLine="Dim downloadStartedAt As Long = DateTime.Now";
_downloadstartedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=35586059;
 //BA.debugLineNum = 35586059;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=35586060;
 //BA.debugLineNum = 35586060;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=35586061;
 //BA.debugLineNum = 35586061;BA.debugLine="Trace(\"Скачивание трека в кэш. id=\" & trackId & \"";
__ref._trace /*String*/ (null,"Скачивание трека в кэш. id="+_trackid+", url="+_trackurl);
RDebugUtils.currentLine=35586062;
 //BA.debugLineNum = 35586062;BA.debugLine="j.Download(trackUrl)";
_j._download /*String*/ (null,_trackurl);
RDebugUtils.currentLine=35586063;
 //BA.debugLineNum = 35586063;BA.debugLine="j.GetRequest.Timeout = TRACK_DOWNLOAD_TIMEOUT_MS";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._track_download_timeout_ms /*int*/ );
RDebugUtils.currentLine=35586064;
 //BA.debugLineNum = 35586064;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensuresingletrackcached"), (Object)(_j));
this.state = 56;
return;
case 56:
//C
this.state = 23;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=35586065;
 //BA.debugLineNum = 35586065;BA.debugLine="If j.Success Then";
if (true) break;

case 23:
//if
this.state = 55;
if (_j._success /*boolean*/ ) { 
this.state = 25;
}else {
this.state = 48;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=35586066;
 //BA.debugLineNum = 35586066;BA.debugLine="Try";
if (true) break;

case 26:
//try
this.state = 46;
this.catchState = 45;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 45;
RDebugUtils.currentLine=35586067;
 //BA.debugLineNum = 35586067;BA.debugLine="Dim playlistId As String = ResolveTrackPlaylis";
_playlistid = __ref._resolvetrackplaylistid /*String*/ (null,_item,_trackindex,_trackid);
RDebugUtils.currentLine=35586068;
 //BA.debugLineNum = 35586068;BA.debugLine="Dim trackDir As String = GetTrackPlaylistDir(p";
_trackdir = __ref._gettrackplaylistdir /*String*/ (null,_playlistid);
RDebugUtils.currentLine=35586069;
 //BA.debugLineNum = 35586069;BA.debugLine="EnsureDirectory(trackDir)";
__ref._ensuredirectory /*String*/ (null,_trackdir);
RDebugUtils.currentLine=35586070;
 //BA.debugLineNum = 35586070;BA.debugLine="Dim tempFileName As String = BuildTempCacheFil";
_tempfilename = __ref._buildtempcachefilename /*String*/ (null,_trackid);
RDebugUtils.currentLine=35586071;
 //BA.debugLineNum = 35586071;BA.debugLine="DeleteFileIfExists(trackDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_trackdir,_tempfilename);
RDebugUtils.currentLine=35586072;
 //BA.debugLineNum = 35586072;BA.debugLine="Dim outStream As OutputStream = File.OpenOutpu";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = parent.__c.File.OpenOutput(_trackdir,_tempfilename,parent.__c.False);
RDebugUtils.currentLine=35586073;
 //BA.debugLineNum = 35586073;BA.debugLine="TransformStreamWithXor(j.GetInputStream, outSt";
__ref._transformstreamwithxor /*String*/ (null,_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null),_outstream,__ref._buildtrackobfuscationkey /*byte[]*/ (null,_trackid));
RDebugUtils.currentLine=35586074;
 //BA.debugLineNum = 35586074;BA.debugLine="outStream.Close";
_outstream.Close();
RDebugUtils.currentLine=35586075;
 //BA.debugLineNum = 35586075;BA.debugLine="If IsCachedFileUsable(trackDir, tempFileName)";
if (true) break;

case 29:
//if
this.state = 32;
if (__ref._iscachedfileusable /*boolean*/ (null,_trackdir,_tempfilename)==parent.__c.False) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=35586076;
 //BA.debugLineNum = 35586076;BA.debugLine="DeleteFileIfExists(trackDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_trackdir,_tempfilename);
RDebugUtils.currentLine=35586077;
 //BA.debugLineNum = 35586077;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\"";
__ref._trace /*String*/ (null,"Не удалось сохранить трек в кэш. id="+_trackid+", message=empty temp file");
RDebugUtils.currentLine=35586078;
 //BA.debugLineNum = 35586078;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=35586079;
 //BA.debugLineNum = 35586079;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=35586081;
 //BA.debugLineNum = 35586081;BA.debugLine="If ReplaceCacheFile(trackDir, tempFileName, Bui";

case 32:
//if
this.state = 35;
if (__ref._replacecachefile /*boolean*/ (null,_trackdir,_tempfilename,__ref._buildtrackcachefilename /*String*/ (null,_trackid))==parent.__c.False) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=35586082;
 //BA.debugLineNum = 35586082;BA.debugLine="DeleteFileIfExists(trackDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_trackdir,_tempfilename);
RDebugUtils.currentLine=35586083;
 //BA.debugLineNum = 35586083;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
__ref._trace /*String*/ (null,"Не удалось сохранить трек в кэш. id="+_trackid+", message=rename failed");
RDebugUtils.currentLine=35586084;
 //BA.debugLineNum = 35586084;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=35586085;
 //BA.debugLineNum = 35586085;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 35:
//C
this.state = 36;
;
RDebugUtils.currentLine=35586087;
 //BA.debugLineNum = 35586087;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_trackindex);
RDebugUtils.currentLine=35586088;
 //BA.debugLineNum = 35586088;BA.debugLine="If ValidateIndexedFile(\"track\", trackId) = Fals";
if (true) break;

case 36:
//if
this.state = 43;
if (__ref._validateindexedfile /*boolean*/ (null,"track",_trackid)==parent.__c.False) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=35586089;
 //BA.debugLineNum = 35586089;BA.debugLine="BackfillTrackIndexFromFiles";
__ref._backfilltrackindexfromfiles /*String*/ (null);
RDebugUtils.currentLine=35586090;
 //BA.debugLineNum = 35586090;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_trackindex);
RDebugUtils.currentLine=35586091;
 //BA.debugLineNum = 35586091;BA.debugLine="If ValidateIndexedFile(\"track\", trackId) = Fal";
if (true) break;

case 39:
//if
this.state = 42;
if (__ref._validateindexedfile /*boolean*/ (null,"track",_trackid)==parent.__c.False) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=35586092;
 //BA.debugLineNum = 35586092;BA.debugLine="Trace(\"Не удалось валидировать трек после сох";
__ref._trace /*String*/ (null,"Не удалось валидировать трек после сохранения. id="+_trackid);
RDebugUtils.currentLine=35586093;
 //BA.debugLineNum = 35586093;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=35586094;
 //BA.debugLineNum = 35586094;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = 46;
;
RDebugUtils.currentLine=35586097;
 //BA.debugLineNum = 35586097;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=35586098;
 //BA.debugLineNum = 35586098;BA.debugLine="recentMediaNetworkFailure = False";
__ref._recentmedianetworkfailure /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=35586099;
 //BA.debugLineNum = 35586099;BA.debugLine="Trace(\"Трек сохранен в кэш. id=\" & trackId & \",";
__ref._trace /*String*/ (null,"Трек сохранен в кэш. id="+_trackid+", totalElapsedMs="+BA.NumberToString(__ref._elapsedms /*long*/ (null,_downloadstartedat)));
RDebugUtils.currentLine=35586100;
 //BA.debugLineNum = 35586100;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=35586101;
 //BA.debugLineNum = 35586101;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
RDebugUtils.currentLine=35586103;
 //BA.debugLineNum = 35586103;BA.debugLine="Dim failedPlaylistId As String = ResolveTrackPl";
_failedplaylistid = __ref._resolvetrackplaylistid /*String*/ (null,_item,_trackindex,_trackid);
RDebugUtils.currentLine=35586104;
 //BA.debugLineNum = 35586104;BA.debugLine="DeleteFileIfExists(GetTrackPlaylistDir(failedPl";
__ref._deletefileifexists /*String*/ (null,__ref._gettrackplaylistdir /*String*/ (null,_failedplaylistid),__ref._buildtempcachefilename /*String*/ (null,_trackid));
RDebugUtils.currentLine=35586105;
 //BA.debugLineNum = 35586105;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
__ref._trace /*String*/ (null,"Не удалось сохранить трек в кэш. id="+_trackid+", message="+parent.__c.LastException(ba).getMessage());
 if (true) break;
if (true) break;

case 46:
//C
this.state = 55;
this.catchState = 0;
;
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=35586108;
 //BA.debugLineNum = 35586108;BA.debugLine="If IsMediaNetworkFailure(j.ErrorMessage) Then re";
if (true) break;

case 49:
//if
this.state = 54;
if (__ref._ismedianetworkfailure /*boolean*/ (null,_j._errormessage /*String*/ )) { 
this.state = 51;
;}if (true) break;

case 51:
//C
this.state = 54;
__ref._recentmedianetworkfailure /*boolean*/  = parent.__c.True;
if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=35586109;
 //BA.debugLineNum = 35586109;BA.debugLine="Trace(\"Не удалось скачать трек. id=\" & trackId &";
__ref._trace /*String*/ (null,"Не удалось скачать трек. id="+_trackid+", message="+_j._errormessage /*String*/ );
 if (true) break;

case 55:
//C
this.state = -1;
;
RDebugUtils.currentLine=35586111;
 //BA.debugLineNum = 35586111;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=35586112;
 //BA.debugLineNum = 35586112;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=35586113;
 //BA.debugLineNum = 35586113;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _updatetrackindex(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "updatetrackindex", false))
	 {return ((String) Debug.delegate(ba, "updatetrackindex", new Object[] {_item,_trackindex}));}
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _playlistid = "";
String _filename = "";
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Private Sub UpdateTrackIndex(item As Map, trackInd";
RDebugUtils.currentLine=35782657;
 //BA.debugLineNum = 35782657;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=35782659;
 //BA.debugLineNum = 35782659;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=35782660;
 //BA.debugLineNum = 35782660;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=35782661;
 //BA.debugLineNum = 35782661;BA.debugLine="Dim playlistId As String = ResolveTrackPlaylistId";
_playlistid = __ref._resolvetrackplaylistid /*String*/ (null,_item,_trackindex,_trackid);
RDebugUtils.currentLine=35782662;
 //BA.debugLineNum = 35782662;BA.debugLine="Dim fileName As String = BuildTrackCacheRelativeF";
_filename = __ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_playlistid);
RDebugUtils.currentLine=35782663;
 //BA.debugLineNum = 35782663;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=35782664;
 //BA.debugLineNum = 35782664;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));
RDebugUtils.currentLine=35782665;
 //BA.debugLineNum = 35782665;BA.debugLine="entry.Put(\"file_name\", fileName)";
_entry.Put((Object)("file_name"),(Object)(_filename));
RDebugUtils.currentLine=35782666;
 //BA.debugLineNum = 35782666;BA.debugLine="entry.Put(\"title\", item.GetDefault(\"title\", \"\"))";
_entry.Put((Object)("title"),_item.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=35782667;
 //BA.debugLineNum = 35782667;BA.debugLine="entry.Put(\"set\", item.GetDefault(\"set\", \"\"))";
_entry.Put((Object)("set"),_item.GetDefault((Object)("set"),(Object)("")));
RDebugUtils.currentLine=35782668;
 //BA.debugLineNum = 35782668;BA.debugLine="entry.Put(\"stream\", item.GetDefault(\"stream\", \"\")";
_entry.Put((Object)("stream"),_item.GetDefault((Object)("stream"),(Object)("")));
RDebugUtils.currentLine=35782669;
 //BA.debugLineNum = 35782669;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=35782670;
 //BA.debugLineNum = 35782670;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=35782671;
 //BA.debugLineNum = 35782671;BA.debugLine="entry.Put(\"gain\", item.GetDefault(\"gain\", 0))";
_entry.Put((Object)("gain"),_item.GetDefault((Object)("gain"),(Object)(0)));
RDebugUtils.currentLine=35782672;
 //BA.debugLineNum = 35782672;BA.debugLine="If IsCachedFileUsable(GetTracksDir, fileName) The";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_filename)) { 
_entry.Put((Object)("size_bytes"),(Object)(__ref._getfilesizesafe /*long*/ (null,__ref._gettracksdir /*String*/ (null),_filename)));};
RDebugUtils.currentLine=35782673;
 //BA.debugLineNum = 35782673;BA.debugLine="trackIndex.Put(trackId, entry)";
_trackindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=35782674;
 //BA.debugLineNum = 35782674;BA.debugLine="cachedTrackIndexDirty = True";
__ref._cachedtrackindexdirty /*boolean*/  = __c.True;
RDebugUtils.currentLine=35782675;
 //BA.debugLineNum = 35782675;BA.debugLine="End Sub";
return "";
}
public String  _resolvetrackplaylistid(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvetrackplaylistid", false))
	 {return ((String) Debug.delegate(ba, "resolvetrackplaylistid", new Object[] {_item,_trackindex,_trackid}));}
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=82313216;
 //BA.debugLineNum = 82313216;BA.debugLine="Private Sub ResolveTrackPlaylistId(item As Map, tr";
RDebugUtils.currentLine=82313217;
 //BA.debugLineNum = 82313217;BA.debugLine="If item.IsInitialized Then";
if (_item.IsInitialized()) { 
RDebugUtils.currentLine=82313218;
 //BA.debugLineNum = 82313218;BA.debugLine="Dim playlistId As String = item.GetDefault(\"play";
_playlistid = BA.ObjectToString(_item.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=82313219;
 //BA.debugLineNum = 82313219;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
if ((_playlistid).equals("") == false) { 
if (true) return _playlistid;};
 };
RDebugUtils.currentLine=82313221;
 //BA.debugLineNum = 82313221;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=82313222;
 //BA.debugLineNum = 82313222;BA.debugLine="If entry.IsInitialized Then Return entry.GetDefau";
if (_entry.IsInitialized()) { 
if (true) return BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));};
RDebugUtils.currentLine=82313223;
 //BA.debugLineNum = 82313223;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=82313224;
 //BA.debugLineNum = 82313224;BA.debugLine="End Sub";
return "";
}
public String  _transformstreamwithxor(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outputstream,byte[] _keybytes) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "transformstreamwithxor", false))
	 {return ((String) Debug.delegate(ba, "transformstreamwithxor", new Object[] {_inputstream,_outputstream,_keybytes}));}
byte[] _buffer = null;
long _totalprocessed = 0L;
int _count = 0;
RDebugUtils.currentLine=36962304;
 //BA.debugLineNum = 36962304;BA.debugLine="Private Sub TransformStreamWithXor(inputStream As";
RDebugUtils.currentLine=36962305;
 //BA.debugLineNum = 36962305;BA.debugLine="If keyBytes.Length = 0 Then";
if (_keybytes.length==0) { 
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="File.Copy2(inputStream, outputStream)";
__c.File.Copy2((java.io.InputStream)(_inputstream.getObject()),(java.io.OutputStream)(_outputstream.getObject()));
RDebugUtils.currentLine=36962307;
 //BA.debugLineNum = 36962307;BA.debugLine="outputStream.Flush";
_outputstream.Flush();
RDebugUtils.currentLine=36962308;
 //BA.debugLineNum = 36962308;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=36962310;
 //BA.debugLineNum = 36962310;BA.debugLine="Dim buffer(STREAM_XOR_BUFFER_SIZE) As Byte";
_buffer = new byte[__ref._stream_xor_buffer_size /*int*/ ];
;
RDebugUtils.currentLine=36962311;
 //BA.debugLineNum = 36962311;BA.debugLine="Dim totalProcessed As Long = 0";
_totalprocessed = (long) (0);
RDebugUtils.currentLine=36962312;
 //BA.debugLineNum = 36962312;BA.debugLine="Do While True";
while (__c.True) {
RDebugUtils.currentLine=36962313;
 //BA.debugLineNum = 36962313;BA.debugLine="Dim count As Int = inputStream.ReadBytes(buffer,";
_count = _inputstream.ReadBytes(_buffer,(int) (0),_buffer.length);
RDebugUtils.currentLine=36962314;
 //BA.debugLineNum = 36962314;BA.debugLine="If count <= 0 Then Exit";
if (_count<=0) { 
if (true) break;};
RDebugUtils.currentLine=36962315;
 //BA.debugLineNum = 36962315;BA.debugLine="ApplyXorToBuffer(buffer, count, keyBytes, totalP";
__ref._applyxortobuffer /*String*/ (null,_buffer,_count,_keybytes,_totalprocessed);
RDebugUtils.currentLine=36962316;
 //BA.debugLineNum = 36962316;BA.debugLine="outputStream.WriteBytes(buffer, 0, count)";
_outputstream.WriteBytes(_buffer,(int) (0),_count);
RDebugUtils.currentLine=36962317;
 //BA.debugLineNum = 36962317;BA.debugLine="totalProcessed = totalProcessed + count";
_totalprocessed = (long) (_totalprocessed+_count);
 }
;
RDebugUtils.currentLine=36962319;
 //BA.debugLineNum = 36962319;BA.debugLine="outputStream.Flush";
_outputstream.Flush();
RDebugUtils.currentLine=36962320;
 //BA.debugLineNum = 36962320;BA.debugLine="End Sub";
return "";
}
public boolean  _validateindexedfile(b4j.example.mediacache __ref,String _itemtype,String _itemid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "validateindexedfile", false))
	 {return ((Boolean) Debug.delegate(ba, "validateindexedfile", new Object[] {_itemtype,_itemid}));}
anywheresoftware.b4a.objects.collections.Map _auditindex = null;
String _auditdir = "";
String _filename = "";
RDebugUtils.currentLine=37224448;
 //BA.debugLineNum = 37224448;BA.debugLine="Private Sub ValidateIndexedFile(itemType As String";
RDebugUtils.currentLine=37224449;
 //BA.debugLineNum = 37224449;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="Dim auditIndex As Map = GetIndexByItemType(itemTy";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = __ref._getindexbyitemtype /*anywheresoftware.b4a.objects.collections.Map*/ (null,_itemtype);
RDebugUtils.currentLine=37224451;
 //BA.debugLineNum = 37224451;BA.debugLine="Dim auditDir As String = GetDirByItemType(itemTyp";
_auditdir = __ref._getdirbyitemtype /*String*/ (null,_itemtype);
RDebugUtils.currentLine=37224452;
 //BA.debugLineNum = 37224452;BA.debugLine="Dim fileName As String = ResolveIndexedFileName(i";
_filename = __ref._resolveindexedfilename /*String*/ (null,_itemtype,_itemid,_auditindex);
RDebugUtils.currentLine=37224453;
 //BA.debugLineNum = 37224453;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=37224454;
 //BA.debugLineNum = 37224454;BA.debugLine="If TryHealTrackIndexEntry(itemId, auditIndex, au";
if (__ref._tryhealtrackindexentry /*boolean*/ (null,_itemid,_auditindex,_auditdir,_filename)) { 
RDebugUtils.currentLine=37224455;
 //BA.debugLineNum = 37224455;BA.debugLine="fileName = ResolveIndexedFileName(itemType, ite";
_filename = __ref._resolveindexedfilename /*String*/ (null,_itemtype,_itemid,_auditindex);
 };
 };
RDebugUtils.currentLine=37224458;
 //BA.debugLineNum = 37224458;BA.debugLine="If auditIndex.ContainsKey(itemId) = False Then";
if (_auditindex.ContainsKey((Object)(_itemid))==__c.False) { 
RDebugUtils.currentLine=37224459;
 //BA.debugLineNum = 37224459;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=37224460;
 //BA.debugLineNum = 37224460;BA.debugLine="RestoreIndexedFileById(itemId, auditIndex)";
__ref._restoreindexedfilebyid /*String*/ (null,_itemid,_auditindex);
RDebugUtils.currentLine=37224461;
 //BA.debugLineNum = 37224461;BA.debugLine="SaveIndexByItemType(itemType)";
__ref._saveindexbyitemtype /*String*/ (null,_itemtype);
RDebugUtils.currentLine=37224462;
 //BA.debugLineNum = 37224462;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=37224464;
 //BA.debugLineNum = 37224464;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then Re";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=37224465;
 //BA.debugLineNum = 37224465;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=37224466;
 //BA.debugLineNum = 37224466;BA.debugLine="If TryHealTrackIndexEntry(itemId, auditIndex, au";
if (__ref._tryhealtrackindexentry /*boolean*/ (null,_itemid,_auditindex,_auditdir,_filename)) { 
RDebugUtils.currentLine=37224467;
 //BA.debugLineNum = 37224467;BA.debugLine="fileName = ResolveIndexedFileName(itemType, ite";
_filename = __ref._resolveindexedfilename /*String*/ (null,_itemtype,_itemid,_auditindex);
RDebugUtils.currentLine=37224468;
 //BA.debugLineNum = 37224468;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)) { 
if (true) return __c.True;};
 };
 };
RDebugUtils.currentLine=37224471;
 //BA.debugLineNum = 37224471;BA.debugLine="auditIndex.Remove(itemId)";
_auditindex.Remove((Object)(_itemid));
RDebugUtils.currentLine=37224472;
 //BA.debugLineNum = 37224472;BA.debugLine="SaveIndexByItemType(itemType)";
__ref._saveindexbyitemtype /*String*/ (null,_itemtype);
RDebugUtils.currentLine=37224473;
 //BA.debugLineNum = 37224473;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=37224474;
 //BA.debugLineNum = 37224474;BA.debugLine="End Sub";
return false;
}
public String  _rebuildcachestatsfromindexes(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "rebuildcachestatsfromindexes", false))
	 {return ((String) Debug.delegate(ba, "rebuildcachestatsfromindexes", null));}
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _trackentry = null;
long _trackbytes = 0L;
String _adid = "";
anywheresoftware.b4a.objects.collections.Map _adentry = null;
RDebugUtils.currentLine=83492864;
 //BA.debugLineNum = 83492864;BA.debugLine="Private Sub RebuildCacheStatsFromIndexes";
RDebugUtils.currentLine=83492865;
 //BA.debugLineNum = 83492865;BA.debugLine="cachedTrackCount = 0";
__ref._cachedtrackcount /*int*/  = (int) (0);
RDebugUtils.currentLine=83492866;
 //BA.debugLineNum = 83492866;BA.debugLine="cachedAdCount = 0";
__ref._cachedadcount /*int*/  = (int) (0);
RDebugUtils.currentLine=83492867;
 //BA.debugLineNum = 83492867;BA.debugLine="cachedTrackBytes = 0";
__ref._cachedtrackbytes /*long*/  = (long) (0);
RDebugUtils.currentLine=83492868;
 //BA.debugLineNum = 83492868;BA.debugLine="cachedAdBytes = 0";
__ref._cachedadbytes /*long*/  = (long) (0);
RDebugUtils.currentLine=83492869;
 //BA.debugLineNum = 83492869;BA.debugLine="cachedTrackPlaylistStats.Initialize";
__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=83492870;
 //BA.debugLineNum = 83492870;BA.debugLine="If cachedTrackIndex.IsInitialized Then";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=83492871;
 //BA.debugLineNum = 83492871;BA.debugLine="For Each trackId As String In cachedTrackIndex.K";
{
final anywheresoftware.b4a.BA.IterableList group7 = __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_trackid = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=83492872;
 //BA.debugLineNum = 83492872;BA.debugLine="Dim trackEntry As Map = cachedTrackIndex.Get(tr";
_trackentry = new anywheresoftware.b4a.objects.collections.Map();
_trackentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_trackid))));
RDebugUtils.currentLine=83492873;
 //BA.debugLineNum = 83492873;BA.debugLine="If trackEntry.IsInitialized = False Then Contin";
if (_trackentry.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=83492874;
 //BA.debugLineNum = 83492874;BA.debugLine="cachedTrackCount = cachedTrackCount + 1";
__ref._cachedtrackcount /*int*/  = (int) (__ref._cachedtrackcount /*int*/ +1);
RDebugUtils.currentLine=83492875;
 //BA.debugLineNum = 83492875;BA.debugLine="Dim trackBytes As Long = ToLongDefault(trackEnt";
_trackbytes = __ref._tolongdefault /*long*/ (null,_trackentry.GetDefault((Object)("size_bytes"),(Object)(0)),(long) (0));
RDebugUtils.currentLine=83492876;
 //BA.debugLineNum = 83492876;BA.debugLine="cachedTrackBytes = cachedTrackBytes + trackByte";
__ref._cachedtrackbytes /*long*/  = (long) (__ref._cachedtrackbytes /*long*/ +_trackbytes);
RDebugUtils.currentLine=83492877;
 //BA.debugLineNum = 83492877;BA.debugLine="AccumulateTrackPlaylistStat(trackEntry.GetDefau";
__ref._accumulatetrackplayliststat /*String*/ (null,BA.ObjectToString(_trackentry.GetDefault((Object)("playlist_id"),(Object)(""))),_trackbytes);
 }
};
 };
RDebugUtils.currentLine=83492880;
 //BA.debugLineNum = 83492880;BA.debugLine="If cachedAdIndex.IsInitialized Then";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=83492881;
 //BA.debugLineNum = 83492881;BA.debugLine="For Each adId As String In cachedAdIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_adid = BA.ObjectToString(group17.Get(index17));
RDebugUtils.currentLine=83492882;
 //BA.debugLineNum = 83492882;BA.debugLine="Dim adEntry As Map = cachedAdIndex.Get(adId)";
_adentry = new anywheresoftware.b4a.objects.collections.Map();
_adentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_adid))));
RDebugUtils.currentLine=83492883;
 //BA.debugLineNum = 83492883;BA.debugLine="If adEntry.IsInitialized = False Then Continue";
if (_adentry.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=83492884;
 //BA.debugLineNum = 83492884;BA.debugLine="cachedAdCount = cachedAdCount + 1";
__ref._cachedadcount /*int*/  = (int) (__ref._cachedadcount /*int*/ +1);
RDebugUtils.currentLine=83492885;
 //BA.debugLineNum = 83492885;BA.debugLine="cachedAdBytes = cachedAdBytes + ToLongDefault(a";
__ref._cachedadbytes /*long*/  = (long) (__ref._cachedadbytes /*long*/ +__ref._tolongdefault /*long*/ (null,_adentry.GetDefault((Object)("size_bytes"),(Object)(0)),(long) (0)));
 }
};
 };
RDebugUtils.currentLine=83492888;
 //BA.debugLineNum = 83492888;BA.debugLine="End Sub";
return "";
}
public String  _savecachestatssnapshot(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "savecachestatssnapshot", false))
	 {return ((String) Debug.delegate(ba, "savecachestatssnapshot", null));}
RDebugUtils.currentLine=83427328;
 //BA.debugLineNum = 83427328;BA.debugLine="Private Sub SaveCacheStatsSnapshot";
RDebugUtils.currentLine=83427329;
 //BA.debugLineNum = 83427329;BA.debugLine="storage.Put(\"cache_stats_track_count\", cachedTrac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cache_stats_track_count",(Object)(__ref._cachedtrackcount /*int*/ ));
RDebugUtils.currentLine=83427330;
 //BA.debugLineNum = 83427330;BA.debugLine="storage.Put(\"cache_stats_ad_count\", cachedAdCount";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cache_stats_ad_count",(Object)(__ref._cachedadcount /*int*/ ));
RDebugUtils.currentLine=83427331;
 //BA.debugLineNum = 83427331;BA.debugLine="storage.Put(\"cache_stats_track_bytes\", cachedTrac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cache_stats_track_bytes",(Object)(__ref._cachedtrackbytes /*long*/ ));
RDebugUtils.currentLine=83427332;
 //BA.debugLineNum = 83427332;BA.debugLine="storage.Put(\"cache_stats_ad_bytes\", cachedAdBytes";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cache_stats_ad_bytes",(Object)(__ref._cachedadbytes /*long*/ ));
RDebugUtils.currentLine=83427333;
 //BA.debugLineNum = 83427333;BA.debugLine="storage.Put(\"cache_stats_track_playlist\", cachedT";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cache_stats_track_playlist",(Object)(__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=83427334;
 //BA.debugLineNum = 83427334;BA.debugLine="End Sub";
return "";
}
public String  _ensuretrackindexentry(b4j.example.mediacache __ref,String _trackid,String _playlistid,String _relativefilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuretrackindexentry", false))
	 {return ((String) Debug.delegate(ba, "ensuretrackindexentry", new Object[] {_trackid,_playlistid,_relativefilename}));}
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=86114304;
 //BA.debugLineNum = 86114304;BA.debugLine="Private Sub EnsureTrackIndexEntry(trackId As Strin";
RDebugUtils.currentLine=86114305;
 //BA.debugLineNum = 86114305;BA.debugLine="If trackId = \"\" Or relativeFileName = \"\" Then Ret";
if ((_trackid).equals("") || (_relativefilename).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=86114306;
 //BA.debugLineNum = 86114306;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=86114307;
 //BA.debugLineNum = 86114307;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(tr";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=86114308;
 //BA.debugLineNum = 86114308;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=86114309;
 //BA.debugLineNum = 86114309;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=86114310;
 //BA.debugLineNum = 86114310;BA.debugLine="If playlistId <> \"\" Then entry.Put(\"playlist_id\",";
if ((_playlistid).equals("") == false) { 
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));};
RDebugUtils.currentLine=86114311;
 //BA.debugLineNum = 86114311;BA.debugLine="entry.Put(\"file_name\", relativeFileName)";
_entry.Put((Object)("file_name"),(Object)(_relativefilename));
RDebugUtils.currentLine=86114312;
 //BA.debugLineNum = 86114312;BA.debugLine="entry.Put(\"size_bytes\", GetFileSizeSafe(GetTracks";
_entry.Put((Object)("size_bytes"),(Object)(__ref._getfilesizesafe /*long*/ (null,__ref._gettracksdir /*String*/ (null),_relativefilename)));
RDebugUtils.currentLine=86114313;
 //BA.debugLineNum = 86114313;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=86114314;
 //BA.debugLineNum = 86114314;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=86114315;
 //BA.debugLineNum = 86114315;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_trackid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=86114316;
 //BA.debugLineNum = 86114316;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=86114317;
 //BA.debugLineNum = 86114317;BA.debugLine="End Sub";
return "";
}
public boolean  _ensuretrackplaybacktemp(b4j.example.mediacache __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuretrackplaybacktemp", false))
	 {return ((Boolean) Debug.delegate(ba, "ensuretrackplaybacktemp", new Object[] {_audiokey,_item}));}
String _trackid = "";
String _tempfilename = "";
String _sourcerelativename = "";
String _sourcedir = "";
String _sourceleafname = "";
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outputstream = null;
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Private Sub EnsureTrackPlaybackTemp(audioKey As St";
RDebugUtils.currentLine=36700161;
 //BA.debugLineNum = 36700161;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36700163;
 //BA.debugLineNum = 36700163;BA.debugLine="Dim tempFileName As String = BuildPlaybackTempTra";
_tempfilename = __ref._buildplaybacktemptrackfilename /*String*/ (null,_audiokey);
RDebugUtils.currentLine=36700164;
 //BA.debugLineNum = 36700164;BA.debugLine="If playbackTempTrackIds.GetDefault(audioKey, \"\")";
if ((__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_audiokey),(Object)(""))).equals((Object)(_trackid)) && __ref._iscachedfileusable /*boolean*/ (null,__c.File.getDirTemp(),_tempfilename)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=36700165;
 //BA.debugLineNum = 36700165;BA.debugLine="DeleteFileIfExists(File.DirTemp, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__c.File.getDirTemp(),_tempfilename);
RDebugUtils.currentLine=36700166;
 //BA.debugLineNum = 36700166;BA.debugLine="Try";
try {RDebugUtils.currentLine=36700167;
 //BA.debugLineNum = 36700167;BA.debugLine="Dim sourceRelativeName As String = ResolveTrackR";
_sourcerelativename = __ref._resolvetrackrelativefilenamefromitem /*String*/ (null,_item);
RDebugUtils.currentLine=36700168;
 //BA.debugLineNum = 36700168;BA.debugLine="Dim sourceDir As String = ResolveRelativeParentD";
_sourcedir = __ref._resolverelativeparentdir /*String*/ (null,__ref._gettracksdir /*String*/ (null),_sourcerelativename);
RDebugUtils.currentLine=36700169;
 //BA.debugLineNum = 36700169;BA.debugLine="Dim sourceLeafName As String = ResolveRelativeLe";
_sourceleafname = __ref._resolverelativeleafname /*String*/ (null,_sourcerelativename);
RDebugUtils.currentLine=36700170;
 //BA.debugLineNum = 36700170;BA.debugLine="Dim inputStream As InputStream = File.OpenInput(";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_inputstream = __c.File.OpenInput(_sourcedir,_sourceleafname);
RDebugUtils.currentLine=36700171;
 //BA.debugLineNum = 36700171;BA.debugLine="Dim outputStream As OutputStream = File.OpenOutp";
_outputstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outputstream = __c.File.OpenOutput(__c.File.getDirTemp(),_tempfilename,__c.False);
RDebugUtils.currentLine=36700172;
 //BA.debugLineNum = 36700172;BA.debugLine="TransformStreamWithXor(inputStream, outputStream";
__ref._transformstreamwithxor /*String*/ (null,_inputstream,_outputstream,__ref._buildtrackobfuscationkey /*byte[]*/ (null,_trackid));
RDebugUtils.currentLine=36700173;
 //BA.debugLineNum = 36700173;BA.debugLine="outputStream.Close";
_outputstream.Close();
RDebugUtils.currentLine=36700174;
 //BA.debugLineNum = 36700174;BA.debugLine="inputStream.Close";
_inputstream.Close();
RDebugUtils.currentLine=36700175;
 //BA.debugLineNum = 36700175;BA.debugLine="playbackTempTrackIds.Put(audioKey, trackId)";
__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_audiokey),(Object)(_trackid));
RDebugUtils.currentLine=36700176;
 //BA.debugLineNum = 36700176;BA.debugLine="Return IsCachedFileUsable(File.DirTemp, tempFile";
if (true) return __ref._iscachedfileusable /*boolean*/ (null,__c.File.getDirTemp(),_tempfilename);
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=36700178;
 //BA.debugLineNum = 36700178;BA.debugLine="DeleteFileIfExists(File.DirTemp, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__c.File.getDirTemp(),_tempfilename);
RDebugUtils.currentLine=36700179;
 //BA.debugLineNum = 36700179;BA.debugLine="Trace(\"Не удалось подготовить временный файл тре";
__ref._trace /*String*/ (null,"Не удалось подготовить временный файл трека. id="+_trackid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=36700181;
 //BA.debugLineNum = 36700181;BA.debugLine="playbackTempTrackIds.Remove(audioKey)";
__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_audiokey));
RDebugUtils.currentLine=36700182;
 //BA.debugLineNum = 36700182;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=36700183;
 //BA.debugLineNum = 36700183;BA.debugLine="End Sub";
return false;
}
public String  _resolvetrackrelativefilenamefromitem(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvetrackrelativefilenamefromitem", false))
	 {return ((String) Debug.delegate(ba, "resolvetrackrelativefilenamefromitem", new Object[] {_item}));}
String _trackid = "";
String _playlistid = "";
String _preferredrelativename = "";
RDebugUtils.currentLine=86048768;
 //BA.debugLineNum = 86048768;BA.debugLine="Private Sub ResolveTrackRelativeFileNameFromItem(i";
RDebugUtils.currentLine=86048769;
 //BA.debugLineNum = 86048769;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=86048770;
 //BA.debugLineNum = 86048770;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=86048771;
 //BA.debugLineNum = 86048771;BA.debugLine="Dim playlistId As String = item.GetDefault(\"playl";
_playlistid = BA.ObjectToString(_item.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=86048772;
 //BA.debugLineNum = 86048772;BA.debugLine="If playlistId <> \"\" Then";
if ((_playlistid).equals("") == false) { 
RDebugUtils.currentLine=86048773;
 //BA.debugLineNum = 86048773;BA.debugLine="Dim preferredRelativeName As String = BuildTrack";
_preferredrelativename = __ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_playlistid);
RDebugUtils.currentLine=86048774;
 //BA.debugLineNum = 86048774;BA.debugLine="If IsCachedFileUsable(GetTracksDir, preferredRel";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_preferredrelativename)) { 
if (true) return _preferredrelativename;};
 };
RDebugUtils.currentLine=86048776;
 //BA.debugLineNum = 86048776;BA.debugLine="Return ResolveTrackCacheFileName(trackId, cachedT";
if (true) return __ref._resolvetrackcachefilename /*String*/ (null,_trackid,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=86048777;
 //BA.debugLineNum = 86048777;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuretrackscached(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.List _trackitems,int _maxcount) throws Exception{
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuretrackscached", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuretrackscached", new Object[] {_trackitems,_maxcount}));}
ResumableSub_EnsureTracksCached rsub = new ResumableSub_EnsureTracksCached(this,__ref,_trackitems,_maxcount);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureTracksCached extends BA.ResumableSub {
public ResumableSub_EnsureTracksCached(b4j.example.mediacache parent,b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.List _trackitems,int _maxcount) {
this.parent = parent;
this.__ref = __ref;
this._trackitems = _trackitems;
this._maxcount = _maxcount;
this.__ref = parent;
}
b4j.example.mediacache __ref;
b4j.example.mediacache parent;
anywheresoftware.b4a.objects.collections.List _trackitems;
int _maxcount;
anywheresoftware.b4a.objects.collections.Map _seentrackids = null;
int _downloadedcount = 0;
int _failedcount = 0;
int _processedcount = 0;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _trackid = "";
boolean _downloaded = false;
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mediacache";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35258369;
 //BA.debugLineNum = 35258369;BA.debugLine="FlushPendingIndexSaves";
__ref._flushpendingindexsaves /*String*/ (null);
RDebugUtils.currentLine=35258370;
 //BA.debugLineNum = 35258370;BA.debugLine="If trackItems.IsInitialized = False Or trackItems";
if (true) break;

case 1:
//if
this.state = 6;
if (_trackitems.IsInitialized()==parent.__c.False || _trackitems.getSize()==0) { 
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
RDebugUtils.currentLine=35258371;
 //BA.debugLineNum = 35258371;BA.debugLine="Dim cachedTrackIndex As Map = GetCachedTrackIndex";
parent._cachedtrackindex = new anywheresoftware.b4a.objects.collections.Map();
parent._cachedtrackindex = __ref._getcachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=35258372;
 //BA.debugLineNum = 35258372;BA.debugLine="Dim seenTrackIds As Map";
_seentrackids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35258373;
 //BA.debugLineNum = 35258373;BA.debugLine="seenTrackIds.Initialize";
_seentrackids.Initialize();
RDebugUtils.currentLine=35258374;
 //BA.debugLineNum = 35258374;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
RDebugUtils.currentLine=35258375;
 //BA.debugLineNum = 35258375;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
RDebugUtils.currentLine=35258376;
 //BA.debugLineNum = 35258376;BA.debugLine="Dim processedCount As Int = 0";
_processedcount = (int) (0);
RDebugUtils.currentLine=35258377;
 //BA.debugLineNum = 35258377;BA.debugLine="For Each itemObject As Object In trackItems";
if (true) break;

case 7:
//for
this.state = 44;
group9 = _trackitems;
index9 = 0;
groupLen9 = group9.getSize();
this.state = 45;
if (true) break;

case 45:
//C
this.state = 44;
if (index9 < groupLen9) {
this.state = 9;
_itemobject = group9.Get(index9);}
if (true) break;

case 46:
//C
this.state = 45;
index9++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=35258378;
 //BA.debugLineNum = 35258378;BA.debugLine="If processedCount >= maxCount Then Exit";
if (true) break;

case 10:
//if
this.state = 15;
if (_processedcount>=_maxcount) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
this.state = 44;
if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=35258379;
 //BA.debugLineNum = 35258379;BA.debugLine="If itemObject Is Map Then";
if (true) break;

case 16:
//if
this.state = 43;
if (_itemobject instanceof java.util.Map) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=35258380;
 //BA.debugLineNum = 35258380;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=35258381;
 //BA.debugLineNum = 35258381;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then";
if (true) break;

case 19:
//if
this.state = 24;
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
this.state = 46;
if (true) break;;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=35258382;
 //BA.debugLineNum = 35258382;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=35258383;
 //BA.debugLineNum = 35258383;BA.debugLine="If trackId = \"\" Then Continue";
if (true) break;

case 25:
//if
this.state = 30;
if ((_trackid).equals("")) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
this.state = 46;
if (true) break;;
if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=35258384;
 //BA.debugLineNum = 35258384;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Conti";
if (true) break;

case 31:
//if
this.state = 36;
if (_seentrackids.ContainsKey((Object)(_trackid))) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
this.state = 46;
if (true) break;;
if (true) break;

case 36:
//C
this.state = 37;
;
RDebugUtils.currentLine=35258385;
 //BA.debugLineNum = 35258385;BA.debugLine="seenTrackIds.Put(trackId, True)";
_seentrackids.Put((Object)(_trackid),(Object)(parent.__c.True));
RDebugUtils.currentLine=35258386;
 //BA.debugLineNum = 35258386;BA.debugLine="processedCount = processedCount + 1";
_processedcount = (int) (_processedcount+1);
RDebugUtils.currentLine=35258387;
 //BA.debugLineNum = 35258387;BA.debugLine="Wait For (EnsureSingleTrackCached(item, cachedT";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensuretrackscached"), __ref._ensuresingletrackcached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_item,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ));
this.state = 47;
return;
case 47:
//C
this.state = 37;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=35258388;
 //BA.debugLineNum = 35258388;BA.debugLine="If downloaded Then";
if (true) break;

case 37:
//if
this.state = 42;
if (_downloaded) { 
this.state = 39;
}else 
{RDebugUtils.currentLine=35258390;
 //BA.debugLineNum = 35258390;BA.debugLine="Else If IsTrackCached(trackId) = False Then";
if (__ref._istrackcached /*boolean*/ (null,_trackid)==parent.__c.False) { 
this.state = 41;
}}
if (true) break;

case 39:
//C
this.state = 42;
RDebugUtils.currentLine=35258389;
 //BA.debugLineNum = 35258389;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=35258391;
 //BA.debugLineNum = 35258391;BA.debugLine="failedCount = failedCount + 1";
_failedcount = (int) (_failedcount+1);
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = 46;
;
 if (true) break;
if (true) break;

case 44:
//C
this.state = -1;
;
RDebugUtils.currentLine=35258395;
 //BA.debugLineNum = 35258395;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=35258396;
 //BA.debugLineNum = 35258396;BA.debugLine="Trace(\"Синхронизация кэша треков завершена. downl";
__ref._trace /*String*/ (null,"Синхронизация кэша треков завершена. downloaded="+BA.NumberToString(_downloadedcount)+", failed="+BA.NumberToString(_failedcount)+", actual="+BA.NumberToString(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=35258397;
 //BA.debugLineNum = 35258397;BA.debugLine="Return downloadedCount > 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloadedcount>0));return;};
RDebugUtils.currentLine=35258398;
 //BA.debugLineNum = 35258398;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedtrackindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedtrackindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedtrackindex", null));}
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Private Sub GetCachedTrackIndex As Map";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="cachedTrackIndex.Initialize";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=35913732;
 //BA.debugLineNum = 35913732;BA.debugLine="Return cachedTrackIndex";
if (true) return __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=35913733;
 //BA.debugLineNum = 35913733;BA.debugLine="End Sub";
return null;
}
public String  _finalizecurrentcacheaudittype(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "finalizecurrentcacheaudittype", false))
	 {return ((String) Debug.delegate(ba, "finalizecurrentcacheaudittype", null));}
String _auditdir = "";
anywheresoftware.b4a.objects.collections.Map _auditindex = null;
anywheresoftware.b4a.objects.collections.List _keyscopy = null;
String _key = "";
String _filename = "";
RDebugUtils.currentLine=38076416;
 //BA.debugLineNum = 38076416;BA.debugLine="Private Sub FinalizeCurrentCacheAuditType";
RDebugUtils.currentLine=38076417;
 //BA.debugLineNum = 38076417;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = __ref._getauditdirbytype /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = __ref._getauditindexbytype /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=38076419;
 //BA.debugLineNum = 38076419;BA.debugLine="Dim keysCopy As List";
_keyscopy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38076420;
 //BA.debugLineNum = 38076420;BA.debugLine="keysCopy.Initialize";
_keyscopy.Initialize();
RDebugUtils.currentLine=38076421;
 //BA.debugLineNum = 38076421;BA.debugLine="For Each key As String In auditIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _auditindex.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=38076422;
 //BA.debugLineNum = 38076422;BA.debugLine="keysCopy.Add(key)";
_keyscopy.Add((Object)(_key));
 }
};
RDebugUtils.currentLine=38076424;
 //BA.debugLineNum = 38076424;BA.debugLine="For Each key As String In keysCopy";
{
final anywheresoftware.b4a.BA.IterableList group8 = _keyscopy;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=38076425;
 //BA.debugLineNum = 38076425;BA.debugLine="If cacheAuditSeenIds.ContainsKey(key) = False Th";
if (__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))==__c.False) { 
RDebugUtils.currentLine=38076426;
 //BA.debugLineNum = 38076426;BA.debugLine="Dim fileName As String = ResolveIndexedAuditFil";
_filename = __ref._resolveindexedauditfilename /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ ,_key,_auditindex);
RDebugUtils.currentLine=38076427;
 //BA.debugLineNum = 38076427;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)) { 
RDebugUtils.currentLine=38076428;
 //BA.debugLineNum = 38076428;BA.debugLine="cacheAuditSeenIds.Put(key, True)";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(__c.True));
RDebugUtils.currentLine=38076429;
 //BA.debugLineNum = 38076429;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=38076431;
 //BA.debugLineNum = 38076431;BA.debugLine="auditIndex.Remove(key)";
_auditindex.Remove((Object)(_key));
RDebugUtils.currentLine=38076432;
 //BA.debugLineNum = 38076432;BA.debugLine="cacheAuditRemovedCount = cacheAuditRemovedCount";
__ref._cacheauditremovedcount /*int*/  = (int) (__ref._cacheauditremovedcount /*int*/ +1);
RDebugUtils.currentLine=38076433;
 //BA.debugLineNum = 38076433;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
__ref._markauditindexchanged /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
 };
 }
};
RDebugUtils.currentLine=38076436;
 //BA.debugLineNum = 38076436;BA.debugLine="End Sub";
return "";
}
public String  _getauditdirbytype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getauditdirbytype", false))
	 {return ((String) Debug.delegate(ba, "getauditdirbytype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=38207488;
 //BA.debugLineNum = 38207488;BA.debugLine="Private Sub GetAuditDirByType(itemType As String)";
RDebugUtils.currentLine=38207489;
 //BA.debugLineNum = 38207489;BA.debugLine="If itemType = \"ads\" Then Return GetAdsDir";
if ((_itemtype).equals("ads")) { 
if (true) return __ref._getadsdir /*String*/ (null);};
RDebugUtils.currentLine=38207490;
 //BA.debugLineNum = 38207490;BA.debugLine="Return GetTracksDir";
if (true) return __ref._gettracksdir /*String*/ (null);
RDebugUtils.currentLine=38207491;
 //BA.debugLineNum = 38207491;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getauditindexbytype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getauditindexbytype", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getauditindexbytype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Private Sub GetAuditIndexByType(itemType As String";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="If itemType = \"ads\" Then Return cachedAdIndex";
if ((_itemtype).equals("ads")) { 
if (true) return __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="Return cachedTrackIndex";
if (true) return __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="End Sub";
return null;
}
public String  _resolveindexedauditfilename(b4j.example.mediacache __ref,String _audittype,String _itemid,anywheresoftware.b4a.objects.collections.Map _auditindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveindexedauditfilename", false))
	 {return ((String) Debug.delegate(ba, "resolveindexedauditfilename", new Object[] {_audittype,_itemid,_auditindex}));}
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Private Sub ResolveIndexedAuditFileName(auditType";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="If auditType = \"ads\" Then Return itemId";
if ((_audittype).equals("ads")) { 
if (true) return _itemid;};
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="Return ResolveTrackCacheFileName(itemId, auditInd";
if (true) return __ref._resolvetrackcachefilename /*String*/ (null,_itemid,_auditindex);
RDebugUtils.currentLine=38469635;
 //BA.debugLineNum = 38469635;BA.debugLine="End Sub";
return "";
}
public String  _findtrackidbyfilename(b4j.example.mediacache __ref,String _filename,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "findtrackidbyfilename", false))
	 {return ((String) Debug.delegate(ba, "findtrackidbyfilename", new Object[] {_filename,_trackindex}));}
String _key = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _storedfilename = "";
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Private Sub FindTrackIdByFileName(fileName As Stri";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="For Each key As String In trackIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _trackindex.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(key, Nu";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_key),__c.Null)));
RDebugUtils.currentLine=38535171;
 //BA.debugLineNum = 38535171;BA.debugLine="If entry.IsInitialized Then";
if (_entry.IsInitialized()) { 
RDebugUtils.currentLine=38535172;
 //BA.debugLineNum = 38535172;BA.debugLine="Dim storedFileName As String = entry.GetDefault";
_storedfilename = BA.ObjectToString(_entry.GetDefault((Object)("file_name"),(Object)("")));
RDebugUtils.currentLine=38535173;
 //BA.debugLineNum = 38535173;BA.debugLine="If storedFileName = fileName Then Return key";
if ((_storedfilename).equals(_filename)) { 
if (true) return _key;};
 };
RDebugUtils.currentLine=38535175;
 //BA.debugLineNum = 38535175;BA.debugLine="If File.GetName(fileName) = BuildTrackCacheFileN";
if ((__c.File.GetName(_filename)).equals(__ref._buildtrackcachefilename /*String*/ (null,_key))) { 
if (true) return _key;};
 }
};
RDebugUtils.currentLine=38535177;
 //BA.debugLineNum = 38535177;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=38535178;
 //BA.debugLineNum = 38535178;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadplaylisttrackfilemap(b4j.example.mediacache __ref,String _playlistid,anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "loadplaylisttrackfilemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadplaylisttrackfilemap", new Object[] {_playlistid,_playlisttrackmaps}));}
anywheresoftware.b4a.objects.collections.Map _emptymap = null;
anywheresoftware.b4a.objects.collections.Map _result = null;
String _playlistsdir = "";
String _metadatafilename = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
anywheresoftware.b4a.objects.collections.List _tracks = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
RDebugUtils.currentLine=83755008;
 //BA.debugLineNum = 83755008;BA.debugLine="Private Sub LoadPlaylistTrackFileMap(playlistId As";
RDebugUtils.currentLine=83755009;
 //BA.debugLineNum = 83755009;BA.debugLine="Dim emptyMap As Map";
_emptymap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=83755010;
 //BA.debugLineNum = 83755010;BA.debugLine="emptyMap.Initialize";
_emptymap.Initialize();
RDebugUtils.currentLine=83755011;
 //BA.debugLineNum = 83755011;BA.debugLine="If playlistId = \"\" Then Return emptyMap";
if ((_playlistid).equals("")) { 
if (true) return _emptymap;};
RDebugUtils.currentLine=83755012;
 //BA.debugLineNum = 83755012;BA.debugLine="If playlistTrackMaps.ContainsKey(playlistId) Then";
if (_playlisttrackmaps.ContainsKey((Object)(_playlistid))) { 
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlisttrackmaps.Get((Object)(_playlistid))));};
RDebugUtils.currentLine=83755013;
 //BA.debugLineNum = 83755013;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=83755014;
 //BA.debugLineNum = 83755014;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=83755015;
 //BA.debugLineNum = 83755015;BA.debugLine="Dim playlistsDir As String = File.Combine(storage";
_playlistsdir = __c.File.Combine(__ref._storagedir /*String*/ ,"playlists");
RDebugUtils.currentLine=83755016;
 //BA.debugLineNum = 83755016;BA.debugLine="Dim metadataFileName As String = playlistId & \".j";
_metadatafilename = _playlistid+".json";
RDebugUtils.currentLine=83755017;
 //BA.debugLineNum = 83755017;BA.debugLine="If File.Exists(playlistsDir, metadataFileName) =";
if (__c.File.Exists(_playlistsdir,_metadatafilename)==__c.False) { 
RDebugUtils.currentLine=83755018;
 //BA.debugLineNum = 83755018;BA.debugLine="playlistTrackMaps.Put(playlistId, result)";
_playlisttrackmaps.Put((Object)(_playlistid),(Object)(_result.getObject()));
RDebugUtils.currentLine=83755019;
 //BA.debugLineNum = 83755019;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=83755021;
 //BA.debugLineNum = 83755021;BA.debugLine="Try";
try {RDebugUtils.currentLine=83755022;
 //BA.debugLineNum = 83755022;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=83755023;
 //BA.debugLineNum = 83755023;BA.debugLine="parser.Initialize(File.ReadString(playlistsDir,";
_parser.Initialize(__c.File.ReadString(_playlistsdir,_metadatafilename));
RDebugUtils.currentLine=83755024;
 //BA.debugLineNum = 83755024;BA.debugLine="Dim playlistData As Map = parser.NextObject";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = _parser.NextObject();
RDebugUtils.currentLine=83755025;
 //BA.debugLineNum = 83755025;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tr";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=83755026;
 //BA.debugLineNum = 83755026;BA.debugLine="If tracks.IsInitialized Then";
if (_tracks.IsInitialized()) { 
RDebugUtils.currentLine=83755027;
 //BA.debugLineNum = 83755027;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group19 = _tracks;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_trackobject = group19.Get(index19);
RDebugUtils.currentLine=83755028;
 //BA.debugLineNum = 83755028;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=83755029;
 //BA.debugLineNum = 83755029;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=83755030;
 //BA.debugLineNum = 83755030;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=83755031;
 //BA.debugLineNum = 83755031;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=83755032;
 //BA.debugLineNum = 83755032;BA.debugLine="result.Put(BuildTrackCacheRelativeFileName(tra";
_result.Put((Object)(__ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_playlistid)),(Object)(_trackid));
 }
};
 };
 } 
       catch (Exception e28) {
			ba.setLastException(e28);RDebugUtils.currentLine=83755036;
 //BA.debugLineNum = 83755036;BA.debugLine="Trace(\"Не удалось восстановить track map по play";
__ref._trace /*String*/ (null,"Не удалось восстановить track map по playlist metadata. playlistId="+_playlistid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=83755038;
 //BA.debugLineNum = 83755038;BA.debugLine="playlistTrackMaps.Put(playlistId, result)";
_playlisttrackmaps.Put((Object)(_playlistid),(Object)(_result.getObject()));
RDebugUtils.currentLine=83755039;
 //BA.debugLineNum = 83755039;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=83755040;
 //BA.debugLineNum = 83755040;BA.debugLine="End Sub";
return null;
}
public String  _finishcacheaudit(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "finishcacheaudit", false))
	 {return ((String) Debug.delegate(ba, "finishcacheaudit", null));}
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Private Sub FinishCacheAudit";
RDebugUtils.currentLine=38141953;
 //BA.debugLineNum = 38141953;BA.debugLine="If cacheAuditAdIndexChanged Then SaveAdIndex";
if (__ref._cacheauditadindexchanged /*boolean*/ ) { 
__ref._saveadindex /*String*/ (null);};
RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="If cacheAuditTrackIndexChanged Then SaveTrackInde";
if (__ref._cacheaudittrackindexchanged /*boolean*/ ) { 
__ref._savetrackindex /*String*/ (null);};
RDebugUtils.currentLine=38141955;
 //BA.debugLineNum = 38141955;BA.debugLine="cacheAuditInProgress = False";
__ref._cacheauditinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=38141956;
 //BA.debugLineNum = 38141956;BA.debugLine="cacheAuditCurrentType = \"\"";
__ref._cacheauditcurrenttype /*String*/  = "";
RDebugUtils.currentLine=38141957;
 //BA.debugLineNum = 38141957;BA.debugLine="Trace(\"Аудит кэша завершен. added=\" & cacheAuditA";
__ref._trace /*String*/ (null,"Аудит кэша завершен. added="+BA.NumberToString(__ref._cacheauditaddedcount /*int*/ )+", removed="+BA.NumberToString(__ref._cacheauditremovedcount /*int*/ )+", tempDeleted="+BA.NumberToString(__ref._cacheaudittempdeletedcount /*int*/ )+", ads="+BA.NumberToString(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize())+", tracks="+BA.NumberToString(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=38141958;
 //BA.debugLineNum = 38141958;BA.debugLine="End Sub";
return "";
}
public String  _getdirbyitemtype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getdirbyitemtype", false))
	 {return ((String) Debug.delegate(ba, "getdirbyitemtype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=37486592;
 //BA.debugLineNum = 37486592;BA.debugLine="Private Sub GetDirByItemType(itemType As String) A";
RDebugUtils.currentLine=37486593;
 //BA.debugLineNum = 37486593;BA.debugLine="If itemType = \"ad\" Then Return GetAdsDir";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._getadsdir /*String*/ (null);};
RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="Return GetTracksDir";
if (true) return __ref._gettracksdir /*String*/ (null);
RDebugUtils.currentLine=37486595;
 //BA.debugLineNum = 37486595;BA.debugLine="End Sub";
return "";
}
public long  _getdrivetotalspace(b4j.example.mediacache __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getdrivetotalspace", false))
	 {return ((Long) Debug.delegate(ba, "getdrivetotalspace", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _fileobject = null;
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Private Sub GetDriveTotalSpace(path As String) As";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="Try";
try {RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=39256067;
 //BA.debugLineNum = 39256067;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=39256068;
 //BA.debugLineNum = 39256068;BA.debugLine="Return fileObject.RunMethod(\"getTotalSpace\", Nul";
if (true) return BA.ObjectToLongNumber(_fileobject.RunMethod("getTotalSpace",(Object[])(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=39256070;
 //BA.debugLineNum = 39256070;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=39256072;
 //BA.debugLineNum = 39256072;BA.debugLine="End Sub";
return 0L;
}
public long  _getdriveusablespace(b4j.example.mediacache __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getdriveusablespace", false))
	 {return ((Long) Debug.delegate(ba, "getdriveusablespace", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _fileobject = null;
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Private Sub GetDriveUsableSpace(path As String) As";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="Try";
try {RDebugUtils.currentLine=39190530;
 //BA.debugLineNum = 39190530;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=39190531;
 //BA.debugLineNum = 39190531;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=39190532;
 //BA.debugLineNum = 39190532;BA.debugLine="Return fileObject.RunMethod(\"getUsableSpace\", Nu";
if (true) return BA.ObjectToLongNumber(_fileobject.RunMethod("getUsableSpace",(Object[])(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=39190534;
 //BA.debugLineNum = 39190534;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=39190536;
 //BA.debugLineNum = 39190536;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.collections.Map  _getindexbyitemtype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getindexbyitemtype", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getindexbyitemtype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=37421056;
 //BA.debugLineNum = 37421056;BA.debugLine="Private Sub GetIndexByItemType(itemType As String)";
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="If itemType = \"ad\" Then Return cachedAdIndex";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="Return cachedTrackIndex";
if (true) return __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=37421059;
 //BA.debugLineNum = 37421059;BA.debugLine="End Sub";
return null;
}
public boolean  _hastrackfilebyplaylist(b4j.example.mediacache __ref,String _trackid,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "hastrackfilebyplaylist", false))
	 {return ((Boolean) Debug.delegate(ba, "hastrackfilebyplaylist", new Object[] {_trackid,_playlistid}));}
RDebugUtils.currentLine=85983232;
 //BA.debugLineNum = 85983232;BA.debugLine="Public Sub HasTrackFileByPlaylist(trackId As Strin";
RDebugUtils.currentLine=85983233;
 //BA.debugLineNum = 85983233;BA.debugLine="If trackId = \"\" Or playlistId = \"\" Then Return Fa";
if ((_trackid).equals("") || (_playlistid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=85983234;
 //BA.debugLineNum = 85983234;BA.debugLine="Return IsCachedFileUsable(GetTracksDir, BuildTrac";
if (true) return __ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),__ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_playlistid));
RDebugUtils.currentLine=85983235;
 //BA.debugLineNum = 85983235;BA.debugLine="End Sub";
return false;
}
public String  _loadindexesfromstorage(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "loadindexesfromstorage", false))
	 {return ((String) Debug.delegate(ba, "loadindexesfromstorage", null));}
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Private Sub LoadIndexesFromStorage";
RDebugUtils.currentLine=36044801;
 //BA.debugLineNum = 36044801;BA.debugLine="cachedAdIndex = storage.GetDefault(\"cached_ad_ind";
__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_ad_index",__c.Null)));
RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="If cachedAdIndex.IsInitialized = False Then cache";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=36044803;
 //BA.debugLineNum = 36044803;BA.debugLine="cachedTrackIndex = storage.GetDefault(\"cached_tra";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_track_index",__c.Null)));
RDebugUtils.currentLine=36044804;
 //BA.debugLineNum = 36044804;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=36044805;
 //BA.debugLineNum = 36044805;BA.debugLine="LoadCacheStatsSnapshot";
__ref._loadcachestatssnapshot /*String*/ (null);
RDebugUtils.currentLine=36044806;
 //BA.debugLineNum = 36044806;BA.debugLine="NormalizeTrackIndexFileNames(cachedTrackIndex)";
__ref._normalizetrackindexfilenames /*String*/ (null,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=36044807;
 //BA.debugLineNum = 36044807;BA.debugLine="BackfillTrackIndexFromFiles";
__ref._backfilltrackindexfromfiles /*String*/ (null);
RDebugUtils.currentLine=36044808;
 //BA.debugLineNum = 36044808;BA.debugLine="RebuildCacheStatsFromIndexes";
__ref._rebuildcachestatsfromindexes /*String*/ (null);
RDebugUtils.currentLine=36044809;
 //BA.debugLineNum = 36044809;BA.debugLine="SaveCacheStatsSnapshot";
__ref._savecachestatssnapshot /*String*/ (null);
RDebugUtils.currentLine=36044810;
 //BA.debugLineNum = 36044810;BA.debugLine="End Sub";
return "";
}
public String  _listtrackcachefilesinto(b4j.example.mediacache __ref,String _currentdir,String _relativeprefix,anywheresoftware.b4a.objects.collections.List _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "listtrackcachefilesinto", false))
	 {return ((String) Debug.delegate(ba, "listtrackcachefilesinto", new Object[] {_currentdir,_relativeprefix,_result}));}
anywheresoftware.b4a.objects.collections.List _listed = null;
String _name = "";
String _childrelative = "";
String _childpath = "";
RDebugUtils.currentLine=82509824;
 //BA.debugLineNum = 82509824;BA.debugLine="Private Sub ListTrackCacheFilesInto(currentDir As";
RDebugUtils.currentLine=82509825;
 //BA.debugLineNum = 82509825;BA.debugLine="Try";
try {RDebugUtils.currentLine=82509826;
 //BA.debugLineNum = 82509826;BA.debugLine="If DirectoryExists(currentDir) = False Then Retu";
if (__ref._directoryexists /*boolean*/ (null,_currentdir)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=82509827;
 //BA.debugLineNum = 82509827;BA.debugLine="Dim listed As List = File.ListFiles(currentDir)";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_currentdir);
RDebugUtils.currentLine=82509828;
 //BA.debugLineNum = 82509828;BA.debugLine="If listed.IsInitialized = False Then Return";
if (_listed.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=82509829;
 //BA.debugLineNum = 82509829;BA.debugLine="For Each name As String In listed";
{
final anywheresoftware.b4a.BA.IterableList group5 = _listed;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_name = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=82509830;
 //BA.debugLineNum = 82509830;BA.debugLine="Dim childRelative As String";
_childrelative = "";
RDebugUtils.currentLine=82509831;
 //BA.debugLineNum = 82509831;BA.debugLine="If relativePrefix = \"\" Then";
if ((_relativeprefix).equals("")) { 
RDebugUtils.currentLine=82509832;
 //BA.debugLineNum = 82509832;BA.debugLine="childRelative = name";
_childrelative = _name;
 }else {
RDebugUtils.currentLine=82509834;
 //BA.debugLineNum = 82509834;BA.debugLine="childRelative = File.Combine(relativePrefix, n";
_childrelative = __c.File.Combine(_relativeprefix,_name);
 };
RDebugUtils.currentLine=82509836;
 //BA.debugLineNum = 82509836;BA.debugLine="Dim childPath As String = File.Combine(currentD";
_childpath = __c.File.Combine(_currentdir,_name);
RDebugUtils.currentLine=82509837;
 //BA.debugLineNum = 82509837;BA.debugLine="If File.IsDirectory(currentDir, name) Then";
if (__c.File.IsDirectory(_currentdir,_name)) { 
RDebugUtils.currentLine=82509838;
 //BA.debugLineNum = 82509838;BA.debugLine="ListTrackCacheFilesInto(childPath, childRelati";
__ref._listtrackcachefilesinto /*String*/ (null,_childpath,_childrelative,_result);
 }else {
RDebugUtils.currentLine=82509840;
 //BA.debugLineNum = 82509840;BA.debugLine="result.Add(childRelative)";
_result.Add((Object)(_childrelative));
 };
 }
};
 } 
       catch (Exception e20) {
			ba.setLastException(e20);RDebugUtils.currentLine=82509844;
 //BA.debugLineNum = 82509844;BA.debugLine="Trace(\"Не удалось получить список track cache фа";
__ref._trace /*String*/ (null,"Не удалось получить список track cache файлов. dir="+_currentdir+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=82509846;
 //BA.debugLineNum = 82509846;BA.debugLine="End Sub";
return "";
}
public String  _loadcachestatssnapshot(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "loadcachestatssnapshot", false))
	 {return ((String) Debug.delegate(ba, "loadcachestatssnapshot", null));}
RDebugUtils.currentLine=83361792;
 //BA.debugLineNum = 83361792;BA.debugLine="Private Sub LoadCacheStatsSnapshot";
RDebugUtils.currentLine=83361793;
 //BA.debugLineNum = 83361793;BA.debugLine="cachedTrackCount = storage.GetDefault(\"cache_stat";
__ref._cachedtrackcount /*int*/  = (int)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cache_stats_track_count",(Object)(0))));
RDebugUtils.currentLine=83361794;
 //BA.debugLineNum = 83361794;BA.debugLine="cachedAdCount = storage.GetDefault(\"cache_stats_a";
__ref._cachedadcount /*int*/  = (int)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cache_stats_ad_count",(Object)(0))));
RDebugUtils.currentLine=83361795;
 //BA.debugLineNum = 83361795;BA.debugLine="cachedTrackBytes = ToLongDefault(storage.GetDefau";
__ref._cachedtrackbytes /*long*/  = __ref._tolongdefault /*long*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cache_stats_track_bytes",(Object)(0)),(long) (0));
RDebugUtils.currentLine=83361796;
 //BA.debugLineNum = 83361796;BA.debugLine="cachedAdBytes = ToLongDefault(storage.GetDefault(";
__ref._cachedadbytes /*long*/  = __ref._tolongdefault /*long*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cache_stats_ad_bytes",(Object)(0)),(long) (0));
RDebugUtils.currentLine=83361797;
 //BA.debugLineNum = 83361797;BA.debugLine="cachedTrackPlaylistStats = storage.GetDefault(\"ca";
__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cache_stats_track_playlist",__c.Null)));
RDebugUtils.currentLine=83361798;
 //BA.debugLineNum = 83361798;BA.debugLine="If cachedTrackPlaylistStats.IsInitialized = False";
if (__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=83361799;
 //BA.debugLineNum = 83361799;BA.debugLine="End Sub";
return "";
}
public String  _normalizetrackindexfilenames(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "normalizetrackindexfilenames", false))
	 {return ((String) Debug.delegate(ba, "normalizetrackindexfilenames", new Object[] {_trackindex}));}
boolean _changed = false;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _playlistid = "";
String _canonicalfilename = "";
String _storedfilename = "";
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Private Sub NormalizeTrackIndexFileNames(trackInde";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="If trackIndex.IsInitialized = False Then Return";
if (_trackindex.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="Dim changed As Boolean = False";
_changed = __c.False;
RDebugUtils.currentLine=38600707;
 //BA.debugLineNum = 38600707;BA.debugLine="For Each trackId As String In trackIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _trackindex.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_trackid = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=38600708;
 //BA.debugLineNum = 38600708;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=38600709;
 //BA.debugLineNum = 38600709;BA.debugLine="If entry.IsInitialized = False Then Continue";
if (_entry.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=38600710;
 //BA.debugLineNum = 38600710;BA.debugLine="Dim playlistId As String = entry.GetDefault(\"pla";
_playlistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=38600711;
 //BA.debugLineNum = 38600711;BA.debugLine="Dim canonicalFileName As String = BuildTrackCach";
_canonicalfilename = __ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_playlistid);
RDebugUtils.currentLine=38600712;
 //BA.debugLineNum = 38600712;BA.debugLine="Dim storedFileName As String = entry.GetDefault(";
_storedfilename = BA.ObjectToString(_entry.GetDefault((Object)("file_name"),(Object)("")));
RDebugUtils.currentLine=38600713;
 //BA.debugLineNum = 38600713;BA.debugLine="If storedFileName = canonicalFileName Then Conti";
if ((_storedfilename).equals(_canonicalfilename)) { 
if (true) continue;};
RDebugUtils.currentLine=38600714;
 //BA.debugLineNum = 38600714;BA.debugLine="If IsCachedFileUsable(GetTracksDir, canonicalFil";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_canonicalfilename)) { 
RDebugUtils.currentLine=38600715;
 //BA.debugLineNum = 38600715;BA.debugLine="entry.Put(\"file_name\", canonicalFileName)";
_entry.Put((Object)("file_name"),(Object)(_canonicalfilename));
RDebugUtils.currentLine=38600716;
 //BA.debugLineNum = 38600716;BA.debugLine="entry.Put(\"size_bytes\", GetFileSizeSafe(GetTrac";
_entry.Put((Object)("size_bytes"),(Object)(__ref._getfilesizesafe /*long*/ (null,__ref._gettracksdir /*String*/ (null),_canonicalfilename)));
RDebugUtils.currentLine=38600717;
 //BA.debugLineNum = 38600717;BA.debugLine="trackIndex.Put(trackId, entry)";
_trackindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=38600718;
 //BA.debugLineNum = 38600718;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
RDebugUtils.currentLine=38600721;
 //BA.debugLineNum = 38600721;BA.debugLine="If changed Then SaveTrackIndex";
if (_changed) { 
__ref._savetrackindex /*String*/ (null);};
RDebugUtils.currentLine=38600722;
 //BA.debugLineNum = 38600722;BA.debugLine="End Sub";
return "";
}
public long  _mbtobytes(b4j.example.mediacache __ref,long _valuemb) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "mbtobytes", false))
	 {return ((Long) Debug.delegate(ba, "mbtobytes", new Object[] {_valuemb}));}
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Private Sub MbToBytes(valueMb As Long) As Long";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="Return valueMb * 1024 * 1024";
if (true) return (long) (_valuemb*1024*1024);
RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="End Sub";
return 0L;
}
public boolean  _preparenextcacheaudittype(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "preparenextcacheaudittype", false))
	 {return ((Boolean) Debug.delegate(ba, "preparenextcacheaudittype", null));}
String _auditdir = "";
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
String _filename = "";
RDebugUtils.currentLine=37945344;
 //BA.debugLineNum = 37945344;BA.debugLine="Private Sub PrepareNextCacheAuditType As Boolean";
RDebugUtils.currentLine=37945345;
 //BA.debugLineNum = 37945345;BA.debugLine="If cacheAuditPendingTypes.IsInitialized = False O";
if (__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="cacheAuditCurrentType = cacheAuditPendingTypes.Ge";
__ref._cacheauditcurrenttype /*String*/  = BA.ObjectToString(__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=37945347;
 //BA.debugLineNum = 37945347;BA.debugLine="cacheAuditPendingTypes.RemoveAt(0)";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=37945348;
 //BA.debugLineNum = 37945348;BA.debugLine="cacheAuditCurrentPosition = 0";
__ref._cacheauditcurrentposition /*int*/  = (int) (0);
RDebugUtils.currentLine=37945349;
 //BA.debugLineNum = 37945349;BA.debugLine="cacheAuditSeenIds.Initialize";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=37945350;
 //BA.debugLineNum = 37945350;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=37945351;
 //BA.debugLineNum = 37945351;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = __ref._getauditdirbytype /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=37945352;
 //BA.debugLineNum = 37945352;BA.debugLine="Try";
try {RDebugUtils.currentLine=37945353;
 //BA.debugLineNum = 37945353;BA.debugLine="If DirectoryExists(auditDir) Then";
if (__ref._directoryexists /*boolean*/ (null,_auditdir)) { 
RDebugUtils.currentLine=37945354;
 //BA.debugLineNum = 37945354;BA.debugLine="Dim listedFiles As List";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37945355;
 //BA.debugLineNum = 37945355;BA.debugLine="If cacheAuditCurrentType = \"tracks\" Then";
if ((__ref._cacheauditcurrenttype /*String*/ ).equals("tracks")) { 
RDebugUtils.currentLine=37945356;
 //BA.debugLineNum = 37945356;BA.debugLine="listedFiles = ListTrackCacheFilesRecursive";
_listedfiles = __ref._listtrackcachefilesrecursive /*anywheresoftware.b4a.objects.collections.List*/ (null);
 }else {
RDebugUtils.currentLine=37945358;
 //BA.debugLineNum = 37945358;BA.debugLine="listedFiles = File.ListFiles(auditDir)";
_listedfiles = __c.File.ListFiles(_auditdir);
 };
RDebugUtils.currentLine=37945360;
 //BA.debugLineNum = 37945360;BA.debugLine="If listedFiles.IsInitialized Then";
if (_listedfiles.IsInitialized()) { 
RDebugUtils.currentLine=37945361;
 //BA.debugLineNum = 37945361;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group17 = _listedfiles;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_filename = BA.ObjectToString(group17.Get(index17));
RDebugUtils.currentLine=37945362;
 //BA.debugLineNum = 37945362;BA.debugLine="cacheAuditCurrentFileNames.Add(fileName)";
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_filename));
 }
};
 };
 };
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=37945367;
 //BA.debugLineNum = 37945367;BA.debugLine="Trace(\"Не удалось получить список файлов для ауд";
__ref._trace /*String*/ (null,"Не удалось получить список файлов для аудита кэша. type="+__ref._cacheauditcurrenttype /*String*/ +", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=37945369;
 //BA.debugLineNum = 37945369;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=37945370;
 //BA.debugLineNum = 37945370;BA.debugLine="End Sub";
return false;
}
public String  _processcurrentcacheauditbatch(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "processcurrentcacheauditbatch", false))
	 {return ((String) Debug.delegate(ba, "processcurrentcacheauditbatch", null));}
String _auditdir = "";
anywheresoftware.b4a.objects.collections.Map _auditindex = null;
int _i = 0;
String _filename = "";
String _trackid = "";
RDebugUtils.currentLine=38010880;
 //BA.debugLineNum = 38010880;BA.debugLine="Private Sub ProcessCurrentCacheAuditBatch";
RDebugUtils.currentLine=38010881;
 //BA.debugLineNum = 38010881;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = __ref._getauditdirbytype /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = __ref._getauditindexbytype /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=38010883;
 //BA.debugLineNum = 38010883;BA.debugLine="For i = 1 To CACHE_AUDIT_BATCH_SIZE";
{
final int step3 = 1;
final int limit3 = __ref._cache_audit_batch_size /*int*/ ;
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=38010884;
 //BA.debugLineNum = 38010884;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurren";
if (__ref._cacheauditcurrentposition /*int*/ >=__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
if (true) break;};
RDebugUtils.currentLine=38010885;
 //BA.debugLineNum = 38010885;BA.debugLine="Dim fileName As String = cacheAuditCurrentFileNa";
_filename = BA.ObjectToString(__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._cacheauditcurrentposition /*int*/ ));
RDebugUtils.currentLine=38010886;
 //BA.debugLineNum = 38010886;BA.debugLine="cacheAuditCurrentPosition = cacheAuditCurrentPos";
__ref._cacheauditcurrentposition /*int*/  = (int) (__ref._cacheauditcurrentposition /*int*/ +1);
RDebugUtils.currentLine=38010887;
 //BA.debugLineNum = 38010887;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=38010888;
 //BA.debugLineNum = 38010888;BA.debugLine="If fileName.EndsWith(\".tmp\") Then";
if (_filename.endsWith(".tmp")) { 
RDebugUtils.currentLine=38010889;
 //BA.debugLineNum = 38010889;BA.debugLine="DeleteFileIfExists(auditDir, fileName)";
__ref._deletefileifexists /*String*/ (null,_auditdir,_filename);
RDebugUtils.currentLine=38010890;
 //BA.debugLineNum = 38010890;BA.debugLine="cacheAuditTempDeletedCount = cacheAuditTempDele";
__ref._cacheaudittempdeletedcount /*int*/  = (int) (__ref._cacheaudittempdeletedcount /*int*/ +1);
RDebugUtils.currentLine=38010891;
 //BA.debugLineNum = 38010891;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
__ref._markauditindexchanged /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=38010892;
 //BA.debugLineNum = 38010892;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=38010894;
 //BA.debugLineNum = 38010894;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=38010895;
 //BA.debugLineNum = 38010895;BA.debugLine="If cacheAuditCurrentType = \"tracks\" Then";
if ((__ref._cacheauditcurrenttype /*String*/ ).equals("tracks")) { 
RDebugUtils.currentLine=38010896;
 //BA.debugLineNum = 38010896;BA.debugLine="Dim trackId As String = FindTrackIdByFileName(f";
_trackid = __ref._findtrackidbyfilename /*String*/ (null,_filename,_auditindex);
RDebugUtils.currentLine=38010897;
 //BA.debugLineNum = 38010897;BA.debugLine="If trackId = \"\" Then";
if ((_trackid).equals("")) { 
RDebugUtils.currentLine=38010900;
 //BA.debugLineNum = 38010900;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=38010902;
 //BA.debugLineNum = 38010902;BA.debugLine="cacheAuditSeenIds.Put(trackId, True)";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_trackid),(Object)(__c.True));
 }else {
RDebugUtils.currentLine=38010904;
 //BA.debugLineNum = 38010904;BA.debugLine="cacheAuditSeenIds.Put(fileName, True)";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_filename),(Object)(__c.True));
RDebugUtils.currentLine=38010905;
 //BA.debugLineNum = 38010905;BA.debugLine="If auditIndex.ContainsKey(fileName) = False The";
if (_auditindex.ContainsKey((Object)(_filename))==__c.False) { 
RDebugUtils.currentLine=38010906;
 //BA.debugLineNum = 38010906;BA.debugLine="AddIndexedFileFromAudit(cacheAuditCurrentType,";
__ref._addindexedfilefromaudit /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ ,_filename,_auditindex);
RDebugUtils.currentLine=38010907;
 //BA.debugLineNum = 38010907;BA.debugLine="cacheAuditAddedCount = cacheAuditAddedCount +";
__ref._cacheauditaddedcount /*int*/  = (int) (__ref._cacheauditaddedcount /*int*/ +1);
 };
 };
 }
};
RDebugUtils.currentLine=38010911;
 //BA.debugLineNum = 38010911;BA.debugLine="End Sub";
return "";
}
public long  _resolveminfreediskbytes(b4j.example.mediacache __ref,long _totalbytes) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveminfreediskbytes", false))
	 {return ((Long) Debug.delegate(ba, "resolveminfreediskbytes", new Object[] {_totalbytes}));}
long _percentbytes = 0L;
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Private Sub ResolveMinFreeDiskBytes(totalBytes As";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="Dim percentBytes As Long = 0";
_percentbytes = (long) (0);
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="If totalBytes > 0 Then percentBytes = Floor(total";
if (_totalbytes>0) { 
_percentbytes = (long) (__c.Floor(_totalbytes*__ref._min_free_disk_percent /*int*/ /(double)100));};
RDebugUtils.currentLine=39124995;
 //BA.debugLineNum = 39124995;BA.debugLine="Return Max(MbToBytes(MIN_FREE_DISK_MB), percentBy";
if (true) return (long) (__c.Max(__ref._mbtobytes /*long*/ (null,__ref._min_free_disk_mb /*long*/ ),_percentbytes));
RDebugUtils.currentLine=39124996;
 //BA.debugLineNum = 39124996;BA.debugLine="End Sub";
return 0L;
}
public String  _sorttrackprunecandidates(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.List _candidates) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "sorttrackprunecandidates", false))
	 {return ((String) Debug.delegate(ba, "sorttrackprunecandidates", new Object[] {_candidates}));}
int _i = 0;
int _j = 0;
anywheresoftware.b4a.objects.collections.Map _leftitem = null;
anywheresoftware.b4a.objects.collections.Map _rightitem = null;
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Private Sub SortTrackPruneCandidates(candidates As";
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="If candidates.IsInitialized = False Or candidates";
if (_candidates.IsInitialized()==__c.False || _candidates.getSize()<2) { 
if (true) return "";};
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="For i = 0 To candidates.Size - 2";
{
final int step2 = 1;
final int limit2 = (int) (_candidates.getSize()-2);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=38797315;
 //BA.debugLineNum = 38797315;BA.debugLine="For j = i + 1 To candidates.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_candidates.getSize()-1);
_j = (int) (_i+1) ;
for (;_j <= limit3 ;_j = _j + step3 ) {
RDebugUtils.currentLine=38797316;
 //BA.debugLineNum = 38797316;BA.debugLine="Dim leftItem As Map = candidates.Get(i)";
_leftitem = new anywheresoftware.b4a.objects.collections.Map();
_leftitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_candidates.Get(_i)));
RDebugUtils.currentLine=38797317;
 //BA.debugLineNum = 38797317;BA.debugLine="Dim rightItem As Map = candidates.Get(j)";
_rightitem = new anywheresoftware.b4a.objects.collections.Map();
_rightitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_candidates.Get(_j)));
RDebugUtils.currentLine=38797318;
 //BA.debugLineNum = 38797318;BA.debugLine="If CompareTrackPruneCandidates(leftItem, rightI";
if (__ref._comparetrackprunecandidates /*int*/ (null,_leftitem,_rightitem)>0) { 
RDebugUtils.currentLine=38797319;
 //BA.debugLineNum = 38797319;BA.debugLine="candidates.Set(i, rightItem)";
_candidates.Set(_i,(Object)(_rightitem.getObject()));
RDebugUtils.currentLine=38797320;
 //BA.debugLineNum = 38797320;BA.debugLine="candidates.Set(j, leftItem)";
_candidates.Set(_j,(Object)(_leftitem.getObject()));
 };
 }
};
 }
};
RDebugUtils.currentLine=38797324;
 //BA.debugLineNum = 38797324;BA.debugLine="End Sub";
return "";
}
public int  _prunetrackcandidates(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.List _candidates,long _initialcachebytes,long _initialfreebytes,long _targetbytes,long _minfreebytes) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "prunetrackcandidates", false))
	 {return ((Integer) Debug.delegate(ba, "prunetrackcandidates", new Object[] {_candidates,_initialcachebytes,_initialfreebytes,_targetbytes,_minfreebytes}));}
int _removedcount = 0;
long _cachebytes = 0L;
long _freebytes = 0L;
Object _candidateobject = null;
anywheresoftware.b4a.objects.collections.Map _candidate = null;
String _trackid = "";
String _filename = "";
long _filebytes = 0L;
RDebugUtils.currentLine=82051072;
 //BA.debugLineNum = 82051072;BA.debugLine="Private Sub PruneTrackCandidates(candidates As Lis";
RDebugUtils.currentLine=82051073;
 //BA.debugLineNum = 82051073;BA.debugLine="Dim removedCount As Int = 0";
_removedcount = (int) (0);
RDebugUtils.currentLine=82051074;
 //BA.debugLineNum = 82051074;BA.debugLine="Dim cacheBytes As Long = initialCacheBytes";
_cachebytes = _initialcachebytes;
RDebugUtils.currentLine=82051075;
 //BA.debugLineNum = 82051075;BA.debugLine="Dim freeBytes As Long = initialFreeBytes";
_freebytes = _initialfreebytes;
RDebugUtils.currentLine=82051076;
 //BA.debugLineNum = 82051076;BA.debugLine="For Each candidateObject As Object In candidates";
{
final anywheresoftware.b4a.BA.IterableList group4 = _candidates;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_candidateobject = group4.Get(index4);
RDebugUtils.currentLine=82051077;
 //BA.debugLineNum = 82051077;BA.debugLine="If cacheBytes <= targetBytes And (freeBytes <= 0";
if (_cachebytes<=_targetbytes && (_freebytes<=0 || _freebytes>=_minfreebytes)) { 
if (true) break;};
RDebugUtils.currentLine=82051078;
 //BA.debugLineNum = 82051078;BA.debugLine="If (candidateObject Is Map) = False Then Continu";
if ((_candidateobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=82051079;
 //BA.debugLineNum = 82051079;BA.debugLine="Dim candidate As Map = candidateObject";
_candidate = new anywheresoftware.b4a.objects.collections.Map();
_candidate = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_candidateobject));
RDebugUtils.currentLine=82051080;
 //BA.debugLineNum = 82051080;BA.debugLine="Dim trackId As String = candidate.GetDefault(\"id";
_trackid = BA.ObjectToString(_candidate.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=82051081;
 //BA.debugLineNum = 82051081;BA.debugLine="Dim fileName As String = candidate.GetDefault(\"f";
_filename = BA.ObjectToString(_candidate.GetDefault((Object)("file_name"),(Object)("")));
RDebugUtils.currentLine=82051082;
 //BA.debugLineNum = 82051082;BA.debugLine="Dim fileBytes As Long = candidate.GetDefault(\"si";
_filebytes = BA.ObjectToLongNumber(_candidate.GetDefault((Object)("size_bytes"),(Object)(0)));
RDebugUtils.currentLine=82051083;
 //BA.debugLineNum = 82051083;BA.debugLine="If trackId = \"\" Or fileName = \"\" Then Continue";
if ((_trackid).equals("") || (_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=82051084;
 //BA.debugLineNum = 82051084;BA.debugLine="DeleteFileIfExists(GetTracksDir, fileName)";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),_filename);
RDebugUtils.currentLine=82051085;
 //BA.debugLineNum = 82051085;BA.debugLine="CleanupEmptyTrackPlaylistDir(fileName)";
__ref._cleanupemptytrackplaylistdir /*String*/ (null,_filename);
RDebugUtils.currentLine=82051086;
 //BA.debugLineNum = 82051086;BA.debugLine="cachedTrackIndex.Remove(trackId)";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_trackid));
RDebugUtils.currentLine=82051087;
 //BA.debugLineNum = 82051087;BA.debugLine="cacheBytes = Max(0, cacheBytes - fileBytes)";
_cachebytes = (long) (__c.Max(0,_cachebytes-_filebytes));
RDebugUtils.currentLine=82051088;
 //BA.debugLineNum = 82051088;BA.debugLine="freeBytes = GetDriveUsableSpace(storageDir)";
_freebytes = __ref._getdriveusablespace /*long*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=82051089;
 //BA.debugLineNum = 82051089;BA.debugLine="removedCount = removedCount + 1";
_removedcount = (int) (_removedcount+1);
RDebugUtils.currentLine=82051090;
 //BA.debugLineNum = 82051090;BA.debugLine="Trace(\"Удален cached track при очистке кэша. id=";
__ref._trace /*String*/ (null,"Удален cached track при очистке кэша. id="+_trackid+", sizeMb="+BA.NumberToString(__ref._bytestomb /*long*/ (null,_filebytes)));
 }
};
RDebugUtils.currentLine=82051092;
 //BA.debugLineNum = 82051092;BA.debugLine="pruneLastCacheBytes = cacheBytes";
__ref._prunelastcachebytes /*long*/  = _cachebytes;
RDebugUtils.currentLine=82051093;
 //BA.debugLineNum = 82051093;BA.debugLine="pruneLastFreeBytes = freeBytes";
__ref._prunelastfreebytes /*long*/  = _freebytes;
RDebugUtils.currentLine=82051094;
 //BA.debugLineNum = 82051094;BA.debugLine="Return removedCount";
if (true) return _removedcount;
RDebugUtils.currentLine=82051095;
 //BA.debugLineNum = 82051095;BA.debugLine="End Sub";
return 0;
}
public String  _resolveindexedfilename(b4j.example.mediacache __ref,String _itemtype,String _itemid,anywheresoftware.b4a.objects.collections.Map _itemindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveindexedfilename", false))
	 {return ((String) Debug.delegate(ba, "resolveindexedfilename", new Object[] {_itemtype,_itemid,_itemindex}));}
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Private Sub ResolveIndexedFileName(itemType As Str";
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="If itemType = \"ad\" Then Return itemId";
if ((_itemtype).equals("ad")) { 
if (true) return _itemid;};
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="Return ResolveTrackCacheFileName(itemId, itemInde";
if (true) return __ref._resolvetrackcachefilename /*String*/ (null,_itemid,_itemindex);
RDebugUtils.currentLine=37617667;
 //BA.debugLineNum = 37617667;BA.debugLine="End Sub";
return "";
}
public String  _resolverelativefileuri(b4j.example.mediacache __ref,String _basedir,String _relativefilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolverelativefileuri", false))
	 {return ((String) Debug.delegate(ba, "resolverelativefileuri", new Object[] {_basedir,_relativefilename}));}
RDebugUtils.currentLine=82771968;
 //BA.debugLineNum = 82771968;BA.debugLine="Private Sub ResolveRelativeFileUri(baseDir As Stri";
RDebugUtils.currentLine=82771969;
 //BA.debugLineNum = 82771969;BA.debugLine="Return File.GetUri(ResolveRelativeParentDir(baseD";
if (true) return __c.File.GetUri(__ref._resolverelativeparentdir /*String*/ (null,_basedir,_relativefilename),__ref._resolverelativeleafname /*String*/ (null,_relativefilename));
RDebugUtils.currentLine=82771970;
 //BA.debugLineNum = 82771970;BA.debugLine="End Sub";
return "";
}
public String  _restoreindexedfilebyid(b4j.example.mediacache __ref,String _itemid,anywheresoftware.b4a.objects.collections.Map _itemindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "restoreindexedfilebyid", false))
	 {return ((String) Debug.delegate(ba, "restoreindexedfilebyid", new Object[] {_itemid,_itemindex}));}
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _playlistid = "";
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Private Sub RestoreIndexedFileById(itemId As Strin";
RDebugUtils.currentLine=37289985;
 //BA.debugLineNum = 37289985;BA.debugLine="Dim entry As Map = itemIndex.GetDefault(itemId, N";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemindex.GetDefault((Object)(_itemid),__c.Null)));
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=37289987;
 //BA.debugLineNum = 37289987;BA.debugLine="entry.Put(\"id\", itemId)";
_entry.Put((Object)("id"),(Object)(_itemid));
RDebugUtils.currentLine=37289988;
 //BA.debugLineNum = 37289988;BA.debugLine="Dim playlistId As String = entry.GetDefault(\"play";
_playlistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=37289989;
 //BA.debugLineNum = 37289989;BA.debugLine="entry.Put(\"file_name\", BuildTrackCacheRelativeFil";
_entry.Put((Object)("file_name"),(Object)(__ref._buildtrackcacherelativefilename /*String*/ (null,_itemid,_playlistid)));
RDebugUtils.currentLine=37289990;
 //BA.debugLineNum = 37289990;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=37289991;
 //BA.debugLineNum = 37289991;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=37289992;
 //BA.debugLineNum = 37289992;BA.debugLine="itemIndex.Put(itemId, entry)";
_itemindex.Put((Object)(_itemid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=37289993;
 //BA.debugLineNum = 37289993;BA.debugLine="End Sub";
return "";
}
public String  _saveindexbyitemtype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "saveindexbyitemtype", false))
	 {return ((String) Debug.delegate(ba, "saveindexbyitemtype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Private Sub SaveIndexByItemType(itemType As String";
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
 }else {
RDebugUtils.currentLine=37552132;
 //BA.debugLineNum = 37552132;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
 };
RDebugUtils.currentLine=37552134;
 //BA.debugLineNum = 37552134;BA.debugLine="End Sub";
return "";
}
public boolean  _tryhealtrackindexentry(b4j.example.mediacache __ref,String _trackid,anywheresoftware.b4a.objects.collections.Map _trackindex,String _trackdir,String _currentfilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "tryhealtrackindexentry", false))
	 {return ((Boolean) Debug.delegate(ba, "tryhealtrackindexentry", new Object[] {_trackid,_trackindex,_trackdir,_currentfilename}));}
String _expectedplaylistid = "";
anywheresoftware.b4a.objects.collections.Map _existingentry = null;
String _expectedfilename = "";
String _healedfilename = "";
RDebugUtils.currentLine=83820544;
 //BA.debugLineNum = 83820544;BA.debugLine="Private Sub TryHealTrackIndexEntry(trackId As Stri";
RDebugUtils.currentLine=83820545;
 //BA.debugLineNum = 83820545;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=83820546;
 //BA.debugLineNum = 83820546;BA.debugLine="If IsCachedFileUsable(trackDir, currentFileName)";
if (__ref._iscachedfileusable /*boolean*/ (null,_trackdir,_currentfilename)) { 
if (true) return __c.False;};
RDebugUtils.currentLine=83820547;
 //BA.debugLineNum = 83820547;BA.debugLine="Dim expectedPlaylistId As String = \"\"";
_expectedplaylistid = "";
RDebugUtils.currentLine=83820548;
 //BA.debugLineNum = 83820548;BA.debugLine="Dim existingEntry As Map = trackIndex.GetDefault(";
_existingentry = new anywheresoftware.b4a.objects.collections.Map();
_existingentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=83820549;
 //BA.debugLineNum = 83820549;BA.debugLine="If existingEntry.IsInitialized Then expectedPlayl";
if (_existingentry.IsInitialized()) { 
_expectedplaylistid = BA.ObjectToString(_existingentry.GetDefault((Object)("playlist_id"),(Object)("")));};
RDebugUtils.currentLine=83820550;
 //BA.debugLineNum = 83820550;BA.debugLine="Dim expectedFileName As String = BuildTrackCacheR";
_expectedfilename = __ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_expectedplaylistid);
RDebugUtils.currentLine=83820551;
 //BA.debugLineNum = 83820551;BA.debugLine="If expectedFileName <> \"\" And expectedFileName <>";
if ((_expectedfilename).equals("") == false && (_expectedfilename).equals(_currentfilename) == false) { 
RDebugUtils.currentLine=83820552;
 //BA.debugLineNum = 83820552;BA.debugLine="If IsCachedFileUsable(trackDir, expectedFileName";
if (__ref._iscachedfileusable /*boolean*/ (null,_trackdir,_expectedfilename)) { 
RDebugUtils.currentLine=83820553;
 //BA.debugLineNum = 83820553;BA.debugLine="If existingEntry.IsInitialized = False Then exi";
if (_existingentry.IsInitialized()==__c.False) { 
_existingentry.Initialize();};
RDebugUtils.currentLine=83820554;
 //BA.debugLineNum = 83820554;BA.debugLine="existingEntry.Put(\"id\", trackId)";
_existingentry.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=83820555;
 //BA.debugLineNum = 83820555;BA.debugLine="existingEntry.Put(\"playlist_id\", expectedPlayli";
_existingentry.Put((Object)("playlist_id"),(Object)(_expectedplaylistid));
RDebugUtils.currentLine=83820556;
 //BA.debugLineNum = 83820556;BA.debugLine="existingEntry.Put(\"file_name\", expectedFileName";
_existingentry.Put((Object)("file_name"),(Object)(_expectedfilename));
RDebugUtils.currentLine=83820557;
 //BA.debugLineNum = 83820557;BA.debugLine="existingEntry.Put(\"size_bytes\", GetFileSizeSafe";
_existingentry.Put((Object)("size_bytes"),(Object)(__ref._getfilesizesafe /*long*/ (null,_trackdir,_expectedfilename)));
RDebugUtils.currentLine=83820558;
 //BA.debugLineNum = 83820558;BA.debugLine="If existingEntry.ContainsKey(\"saved_at\") = Fals";
if (_existingentry.ContainsKey((Object)("saved_at"))==__c.False) { 
_existingentry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=83820559;
 //BA.debugLineNum = 83820559;BA.debugLine="existingEntry.Put(\"last_used_at\", DateTime.Now)";
_existingentry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=83820560;
 //BA.debugLineNum = 83820560;BA.debugLine="trackIndex.Put(trackId, existingEntry)";
_trackindex.Put((Object)(_trackid),(Object)(_existingentry.getObject()));
RDebugUtils.currentLine=83820561;
 //BA.debugLineNum = 83820561;BA.debugLine="cachedTrackIndexDirty = True";
__ref._cachedtrackindexdirty /*boolean*/  = __c.True;
RDebugUtils.currentLine=83820562;
 //BA.debugLineNum = 83820562;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=83820563;
 //BA.debugLineNum = 83820563;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
RDebugUtils.currentLine=83820566;
 //BA.debugLineNum = 83820566;BA.debugLine="BackfillTrackIndexFromFiles";
__ref._backfilltrackindexfromfiles /*String*/ (null);
RDebugUtils.currentLine=83820567;
 //BA.debugLineNum = 83820567;BA.debugLine="Dim healedFileName As String = ResolveTrackCacheF";
_healedfilename = __ref._resolvetrackcachefilename /*String*/ (null,_trackid,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=83820568;
 //BA.debugLineNum = 83820568;BA.debugLine="If IsCachedFileUsable(trackDir, healedFileName) T";
if (__ref._iscachedfileusable /*boolean*/ (null,_trackdir,_healedfilename)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=83820569;
 //BA.debugLineNum = 83820569;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=83820570;
 //BA.debugLineNum = 83820570;BA.debugLine="End Sub";
return false;
}
}