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
public String _devicekeyseed = "";
public String _mediadirname = "";
public String _adsdirname = "";
public String _tracksdirname = "";
public int _cache_audit_batch_size = 0;
public int _ad_download_timeout_ms = 0;
public int _track_download_timeout_ms = 0;
public int _stream_xor_buffer_size = 0;
public String _primary_temp_track_file = "";
public String _secondary_temp_track_file = "";
public anywheresoftware.b4a.objects.collections.Map _cachedadindex = null;
public anywheresoftware.b4a.objects.collections.Map _cachedtrackindex = null;
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
RDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Public Sub TouchCachedItem(item As Map)";
RDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=25231362;
 //BA.debugLineNum = 25231362;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=25231363;
 //BA.debugLineNum = 25231363;BA.debugLine="If itemId = \"\" Then Return";
if ((_itemid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=25231364;
 //BA.debugLineNum = 25231364;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=25231365;
 //BA.debugLineNum = 25231365;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=25231366;
 //BA.debugLineNum = 25231366;BA.debugLine="If cachedAdIndex.ContainsKey(itemId) = False The";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_itemid))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=25231367;
 //BA.debugLineNum = 25231367;BA.debugLine="UpdateAdIndex(item, cachedAdIndex)";
__ref._updateadindex /*String*/ (null,_item,__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=25231368;
 //BA.debugLineNum = 25231368;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=25231370;
 //BA.debugLineNum = 25231370;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=25231371;
 //BA.debugLineNum = 25231371;BA.debugLine="If cachedTrackIndex.ContainsKey(itemId) = False";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_itemid))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=25231372;
 //BA.debugLineNum = 25231372;BA.debugLine="UpdateTrackIndex(item, cachedTrackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=25231374;
 //BA.debugLineNum = 25231374;BA.debugLine="End Sub";
return "";
}
public boolean  _iscacheauditinprogress(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "iscacheauditinprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "iscacheauditinprogress", null));}
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Public Sub IsCacheAuditInProgress As Boolean";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="Return cacheAuditInProgress";
if (true) return __ref._cacheauditinprogress /*boolean*/ ;
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="End Sub";
return false;
}
public String  _startcacheaudit(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "startcacheaudit", false))
	 {return ((String) Debug.delegate(ba, "startcacheaudit", null));}
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Public Sub StartCacheAudit";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="If cacheAuditInProgress Then Return";
if (__ref._cacheauditinprogress /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="cacheAuditPendingTypes.Initialize";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="cacheAuditPendingTypes.Add(\"ads\")";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("ads"));
RDebugUtils.currentLine=24117252;
 //BA.debugLineNum = 24117252;BA.debugLine="cacheAuditPendingTypes.Add(\"tracks\")";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("tracks"));
RDebugUtils.currentLine=24117253;
 //BA.debugLineNum = 24117253;BA.debugLine="cacheAuditCurrentType = \"\"";
__ref._cacheauditcurrenttype /*String*/  = "";
RDebugUtils.currentLine=24117254;
 //BA.debugLineNum = 24117254;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=24117255;
 //BA.debugLineNum = 24117255;BA.debugLine="cacheAuditCurrentPosition = 0";
__ref._cacheauditcurrentposition /*int*/  = (int) (0);
RDebugUtils.currentLine=24117256;
 //BA.debugLineNum = 24117256;BA.debugLine="cacheAuditSeenIds.Initialize";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=24117257;
 //BA.debugLineNum = 24117257;BA.debugLine="cacheAuditAdIndexChanged = False";
__ref._cacheauditadindexchanged /*boolean*/  = __c.False;
RDebugUtils.currentLine=24117258;
 //BA.debugLineNum = 24117258;BA.debugLine="cacheAuditTrackIndexChanged = False";
__ref._cacheaudittrackindexchanged /*boolean*/  = __c.False;
RDebugUtils.currentLine=24117259;
 //BA.debugLineNum = 24117259;BA.debugLine="cacheAuditAddedCount = 0";
__ref._cacheauditaddedcount /*int*/  = (int) (0);
RDebugUtils.currentLine=24117260;
 //BA.debugLineNum = 24117260;BA.debugLine="cacheAuditRemovedCount = 0";
__ref._cacheauditremovedcount /*int*/  = (int) (0);
RDebugUtils.currentLine=24117261;
 //BA.debugLineNum = 24117261;BA.debugLine="cacheAuditTempDeletedCount = 0";
__ref._cacheaudittempdeletedcount /*int*/  = (int) (0);
RDebugUtils.currentLine=24117262;
 //BA.debugLineNum = 24117262;BA.debugLine="cacheAuditInProgress = True";
__ref._cacheauditinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=24117263;
 //BA.debugLineNum = 24117263;BA.debugLine="Trace(\"Запущен аудит кэша media.\")";
__ref._trace /*String*/ (null,"Запущен аудит кэша media.");
RDebugUtils.currentLine=24117264;
 //BA.debugLineNum = 24117264;BA.debugLine="End Sub";
return "";
}
public boolean  _runcacheauditstep(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "runcacheauditstep", false))
	 {return ((Boolean) Debug.delegate(ba, "runcacheauditstep", null));}
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Public Sub RunCacheAuditStep As Boolean";
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="If cacheAuditInProgress = False Then Return False";
if (__ref._cacheauditinprogress /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="If cacheAuditCurrentType = \"\" Then";
if ((__ref._cacheauditcurrenttype /*String*/ ).equals("")) { 
RDebugUtils.currentLine=24182787;
 //BA.debugLineNum = 24182787;BA.debugLine="If PrepareNextCacheAuditType = False Then";
if (__ref._preparenextcacheaudittype /*boolean*/ (null)==__c.False) { 
RDebugUtils.currentLine=24182788;
 //BA.debugLineNum = 24182788;BA.debugLine="FinishCacheAudit";
__ref._finishcacheaudit /*String*/ (null);
RDebugUtils.currentLine=24182789;
 //BA.debugLineNum = 24182789;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
RDebugUtils.currentLine=24182792;
 //BA.debugLineNum = 24182792;BA.debugLine="ProcessCurrentCacheAuditBatch";
__ref._processcurrentcacheauditbatch /*String*/ (null);
RDebugUtils.currentLine=24182793;
 //BA.debugLineNum = 24182793;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurrent";
if (__ref._cacheauditcurrentposition /*int*/ >=__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=24182794;
 //BA.debugLineNum = 24182794;BA.debugLine="FinalizeCurrentCacheAuditType";
__ref._finalizecurrentcacheaudittype /*String*/ (null);
RDebugUtils.currentLine=24182795;
 //BA.debugLineNum = 24182795;BA.debugLine="cacheAuditCurrentType = \"\"";
__ref._cacheauditcurrenttype /*String*/  = "";
RDebugUtils.currentLine=24182796;
 //BA.debugLineNum = 24182796;BA.debugLine="If cacheAuditPendingTypes.Size = 0 Then";
if (__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
RDebugUtils.currentLine=24182797;
 //BA.debugLineNum = 24182797;BA.debugLine="FinishCacheAudit";
__ref._finishcacheaudit /*String*/ (null);
RDebugUtils.currentLine=24182798;
 //BA.debugLineNum = 24182798;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
RDebugUtils.currentLine=24182801;
 //BA.debugLineNum = 24182801;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=24182802;
 //BA.debugLineNum = 24182802;BA.debugLine="End Sub";
return false;
}
public boolean  _istrackcached(b4j.example.mediacache __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "istrackcached", false))
	 {return ((Boolean) Debug.delegate(ba, "istrackcached", new Object[] {_trackid}));}
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
RDebugUtils.currentLine=24641537;
 //BA.debugLineNum = 24641537;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="Return ValidateIndexedFile(\"track\", trackId)";
if (true) return __ref._validateindexedfile /*boolean*/ (null,"track",_trackid);
RDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="End Sub";
return false;
}
public String  _cleanupplaybacktempfiles(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "cleanupplaybacktempfiles", false))
	 {return ((String) Debug.delegate(ba, "cleanupplaybacktempfiles", null));}
RDebugUtils.currentLine=55050240;
 //BA.debugLineNum = 55050240;BA.debugLine="Public Sub CleanupPlaybackTempFiles";
RDebugUtils.currentLine=55050241;
 //BA.debugLineNum = 55050241;BA.debugLine="DeleteFileIfExists(File.DirTemp, PRIMARY_TEMP_TRA";
__ref._deletefileifexists /*String*/ (null,__c.File.getDirTemp(),__ref._primary_temp_track_file /*String*/ );
RDebugUtils.currentLine=55050242;
 //BA.debugLineNum = 55050242;BA.debugLine="DeleteFileIfExists(File.DirTemp, SECONDARY_TEMP_T";
__ref._deletefileifexists /*String*/ (null,__c.File.getDirTemp(),__ref._secondary_temp_track_file /*String*/ );
RDebugUtils.currentLine=55050243;
 //BA.debugLineNum = 55050243;BA.debugLine="playbackTempTrackIds.Clear";
__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=55050244;
 //BA.debugLineNum = 55050244;BA.debugLine="End Sub";
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
int _downloadedcount = 0;
int _failedcount = 0;
Object _adobject = null;
anywheresoftware.b4a.objects.collections.Map _ad = null;
boolean _downloaded = false;
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

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
RDebugUtils.currentLine=24248321;
 //BA.debugLineNum = 24248321;BA.debugLine="If offlineData.IsInitialized = False Then Return";
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
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
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
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("ads"),parent.__c.Null)));
RDebugUtils.currentLine=24248324;
 //BA.debugLineNum = 24248324;BA.debugLine="If ads.IsInitialized = False Or ads.Size = 0 Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_ads.IsInitialized()==parent.__c.False || _ads.getSize()==0) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=24248325;
 //BA.debugLineNum = 24248325;BA.debugLine="Dim cachedAdIndex As Map = GetCachedAdIndex";
parent._cachedadindex = new anywheresoftware.b4a.objects.collections.Map();
parent._cachedadindex = __ref._getcachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=24248326;
 //BA.debugLineNum = 24248326;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
RDebugUtils.currentLine=24248327;
 //BA.debugLineNum = 24248327;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
RDebugUtils.currentLine=24248328;
 //BA.debugLineNum = 24248328;BA.debugLine="For Each adObject As Object In ads";
if (true) break;

case 19:
//for
this.state = 32;
group8 = _ads;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 33;
if (true) break;

case 33:
//C
this.state = 32;
if (index8 < groupLen8) {
this.state = 21;
_adobject = group8.Get(index8);}
if (true) break;

case 34:
//C
this.state = 33;
index8++;
if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=24248329;
 //BA.debugLineNum = 24248329;BA.debugLine="If adObject Is Map Then";
if (true) break;

case 22:
//if
this.state = 31;
if (_adobject instanceof java.util.Map) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=24248330;
 //BA.debugLineNum = 24248330;BA.debugLine="Dim ad As Map = adObject";
_ad = new anywheresoftware.b4a.objects.collections.Map();
_ad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adobject));
RDebugUtils.currentLine=24248331;
 //BA.debugLineNum = 24248331;BA.debugLine="Wait For (EnsureSingleAdCached(ad, cachedAdInde";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensureadscached"), __ref._ensuresingleadcached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_ad,__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ));
this.state = 35;
return;
case 35:
//C
this.state = 25;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=24248332;
 //BA.debugLineNum = 24248332;BA.debugLine="If downloaded Then";
if (true) break;

case 25:
//if
this.state = 30;
if (_downloaded) { 
this.state = 27;
}else 
{RDebugUtils.currentLine=24248334;
 //BA.debugLineNum = 24248334;BA.debugLine="Else If IsAdCached(ad.GetDefault(\"id\", \"\")) = F";
if (__ref._isadcached /*boolean*/ (null,BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)(""))))==parent.__c.False) { 
this.state = 29;
}}
if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=24248333;
 //BA.debugLineNum = 24248333;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=24248335;
 //BA.debugLineNum = 24248335;BA.debugLine="failedCount = failedCount + 1";
_failedcount = (int) (_failedcount+1);
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=24248339;
 //BA.debugLineNum = 24248339;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
RDebugUtils.currentLine=24248340;
 //BA.debugLineNum = 24248340;BA.debugLine="Trace(\"Синхронизация кэша рекламы завершена. down";
__ref._trace /*String*/ (null,"Синхронизация кэша рекламы завершена. downloaded="+BA.NumberToString(_downloadedcount)+", failed="+BA.NumberToString(_failedcount)+", actual="+BA.NumberToString(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=24248341;
 //BA.debugLineNum = 24248341;BA.debugLine="Return downloadedCount > 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloadedcount>0));return;};
RDebugUtils.currentLine=24248342;
 //BA.debugLineNum = 24248342;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

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
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="If trackItems.IsInitialized = False Or trackItems";
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
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="Dim cachedTrackIndex As Map = GetCachedTrackIndex";
parent._cachedtrackindex = new anywheresoftware.b4a.objects.collections.Map();
parent._cachedtrackindex = __ref._getcachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=24707075;
 //BA.debugLineNum = 24707075;BA.debugLine="Dim seenTrackIds As Map";
_seentrackids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24707076;
 //BA.debugLineNum = 24707076;BA.debugLine="seenTrackIds.Initialize";
_seentrackids.Initialize();
RDebugUtils.currentLine=24707077;
 //BA.debugLineNum = 24707077;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
RDebugUtils.currentLine=24707078;
 //BA.debugLineNum = 24707078;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
RDebugUtils.currentLine=24707079;
 //BA.debugLineNum = 24707079;BA.debugLine="Dim processedCount As Int = 0";
_processedcount = (int) (0);
RDebugUtils.currentLine=24707080;
 //BA.debugLineNum = 24707080;BA.debugLine="For Each itemObject As Object In trackItems";
if (true) break;

case 7:
//for
this.state = 44;
group8 = _trackitems;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 45;
if (true) break;

case 45:
//C
this.state = 44;
if (index8 < groupLen8) {
this.state = 9;
_itemobject = group8.Get(index8);}
if (true) break;

case 46:
//C
this.state = 45;
index8++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=24707081;
 //BA.debugLineNum = 24707081;BA.debugLine="If processedCount >= maxCount Then Exit";
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
RDebugUtils.currentLine=24707082;
 //BA.debugLineNum = 24707082;BA.debugLine="If itemObject Is Map Then";
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
RDebugUtils.currentLine=24707083;
 //BA.debugLineNum = 24707083;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=24707084;
 //BA.debugLineNum = 24707084;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then";
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
RDebugUtils.currentLine=24707085;
 //BA.debugLineNum = 24707085;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=24707086;
 //BA.debugLineNum = 24707086;BA.debugLine="If trackId = \"\" Then Continue";
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
RDebugUtils.currentLine=24707087;
 //BA.debugLineNum = 24707087;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Conti";
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
RDebugUtils.currentLine=24707088;
 //BA.debugLineNum = 24707088;BA.debugLine="seenTrackIds.Put(trackId, True)";
_seentrackids.Put((Object)(_trackid),(Object)(parent.__c.True));
RDebugUtils.currentLine=24707089;
 //BA.debugLineNum = 24707089;BA.debugLine="processedCount = processedCount + 1";
_processedcount = (int) (_processedcount+1);
RDebugUtils.currentLine=24707090;
 //BA.debugLineNum = 24707090;BA.debugLine="Wait For (EnsureSingleTrackCached(item, cachedT";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensuretrackscached"), __ref._ensuresingletrackcached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_item,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ));
this.state = 47;
return;
case 47:
//C
this.state = 37;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=24707091;
 //BA.debugLineNum = 24707091;BA.debugLine="If downloaded Then";
if (true) break;

case 37:
//if
this.state = 42;
if (_downloaded) { 
this.state = 39;
}else 
{RDebugUtils.currentLine=24707093;
 //BA.debugLineNum = 24707093;BA.debugLine="Else If IsTrackCached(trackId) = False Then";
if (__ref._istrackcached /*boolean*/ (null,_trackid)==parent.__c.False) { 
this.state = 41;
}}
if (true) break;

case 39:
//C
this.state = 42;
RDebugUtils.currentLine=24707092;
 //BA.debugLineNum = 24707092;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=24707094;
 //BA.debugLineNum = 24707094;BA.debugLine="failedCount = failedCount + 1";
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
RDebugUtils.currentLine=24707098;
 //BA.debugLineNum = 24707098;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=24707099;
 //BA.debugLineNum = 24707099;BA.debugLine="Trace(\"Синхронизация кэша треков завершена. downl";
__ref._trace /*String*/ (null,"Синхронизация кэша треков завершена. downloaded="+BA.NumberToString(_downloadedcount)+", failed="+BA.NumberToString(_failedcount)+", actual="+BA.NumberToString(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=24707100;
 //BA.debugLineNum = 24707100;BA.debugLine="Return downloadedCount > 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloadedcount>0));return;};
RDebugUtils.currentLine=24707101;
 //BA.debugLineNum = 24707101;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.example.mediacache __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,b4j.example.keyvaluestore _storagevalue,Object _targetmodulevalue,String _tracesubnamevalue,String _deviceidvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_storagevalue,_targetmodulevalue,_tracesubnamevalue,_deviceidvalue}));}
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="storage = storageValue";
__ref._storage /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=23986179;
 //BA.debugLineNum = 23986179;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=23986180;
 //BA.debugLineNum = 23986180;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=23986181;
 //BA.debugLineNum = 23986181;BA.debugLine="deviceKeySeed = deviceIdValue";
__ref._devicekeyseed /*String*/  = _deviceidvalue;
RDebugUtils.currentLine=23986182;
 //BA.debugLineNum = 23986182;BA.debugLine="playbackTempTrackIds.Initialize";
__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=23986183;
 //BA.debugLineNum = 23986183;BA.debugLine="EnsureDirectory(GetAdsDir)";
__ref._ensuredirectory /*String*/ (null,__ref._getadsdir /*String*/ (null));
RDebugUtils.currentLine=23986184;
 //BA.debugLineNum = 23986184;BA.debugLine="EnsureDirectory(GetTracksDir)";
__ref._ensuredirectory /*String*/ (null,__ref._gettracksdir /*String*/ (null));
RDebugUtils.currentLine=23986185;
 //BA.debugLineNum = 23986185;BA.debugLine="LoadIndexesFromStorage";
__ref._loadindexesfromstorage /*String*/ (null);
RDebugUtils.currentLine=23986186;
 //BA.debugLineNum = 23986186;BA.debugLine="End Sub";
return "";
}
public String  _resolvelocalmediauri(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvelocalmediauri", false))
	 {return ((String) Debug.delegate(ba, "resolvelocalmediauri", new Object[] {_item}));}
String _itemtype = "";
String _itemid = "";
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Public Sub ResolveLocalMediaUri(item As Map) As St";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=24313859;
 //BA.debugLineNum = 24313859;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=24313860;
 //BA.debugLineNum = 24313860;BA.debugLine="If itemId = \"\" Then Return \"\"";
if ((_itemid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=24313861;
 //BA.debugLineNum = 24313861;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=24313862;
 //BA.debugLineNum = 24313862;BA.debugLine="If itemType = \"ad\" Then Return File.GetUri(GetAds";
if ((_itemtype).equals("ad")) { 
if (true) return __c.File.GetUri(__ref._getadsdir /*String*/ (null),_itemid);};
RDebugUtils.currentLine=24313863;
 //BA.debugLineNum = 24313863;BA.debugLine="If itemType = \"track\" Then Return File.GetUri(Get";
if ((_itemtype).equals("track")) { 
if (true) return __c.File.GetUri(__ref._gettracksdir /*String*/ (null),__ref._resolvetrackcachefilename /*String*/ (null,_itemid,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ));};
RDebugUtils.currentLine=24313864;
 //BA.debugLineNum = 24313864;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=24313865;
 //BA.debugLineNum = 24313865;BA.debugLine="End Sub";
return "";
}
public boolean  _hasvalidatedlocalmedia(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "hasvalidatedlocalmedia", false))
	 {return ((Boolean) Debug.delegate(ba, "hasvalidatedlocalmedia", new Object[] {_item}));}
String _itemid = "";
String _itemtype = "";
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Public Sub HasValidatedLocalMedia(item As Map) As";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="If item.IsInitialized = False Then Return False";
if (_item.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=24379395;
 //BA.debugLineNum = 24379395;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=24379396;
 //BA.debugLineNum = 24379396;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=24379397;
 //BA.debugLineNum = 24379397;BA.debugLine="If itemType = \"ad\" Then Return ValidateIndexedFil";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._validateindexedfile /*boolean*/ (null,"ad",_itemid);};
RDebugUtils.currentLine=24379398;
 //BA.debugLineNum = 24379398;BA.debugLine="If itemType = \"track\" Then Return ValidateIndexed";
if ((_itemtype).equals("track")) { 
if (true) return __ref._validateindexedfile /*boolean*/ (null,"track",_itemid);};
RDebugUtils.currentLine=24379399;
 //BA.debugLineNum = 24379399;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=24379400;
 //BA.debugLineNum = 24379400;BA.debugLine="End Sub";
return false;
}
public String  _resolveplaybackmediauri(b4j.example.mediacache __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveplaybackmediauri", false))
	 {return ((String) Debug.delegate(ba, "resolveplaybackmediauri", new Object[] {_audiokey,_item}));}
String _itemtype = "";
String _trackid = "";
RDebugUtils.currentLine=54984704;
 //BA.debugLineNum = 54984704;BA.debugLine="Public Sub ResolvePlaybackMediaUri(audioKey As Str";
RDebugUtils.currentLine=54984705;
 //BA.debugLineNum = 54984705;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=54984706;
 //BA.debugLineNum = 54984706;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=54984707;
 //BA.debugLineNum = 54984707;BA.debugLine="If itemType = \"ad\" Then Return ResolveLocalMediaU";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._resolvelocalmediauri /*String*/ (null,_item);};
RDebugUtils.currentLine=54984708;
 //BA.debugLineNum = 54984708;BA.debugLine="If itemType <> \"track\" Then Return \"\"";
if ((_itemtype).equals("track") == false) { 
if (true) return "";};
RDebugUtils.currentLine=54984709;
 //BA.debugLineNum = 54984709;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=54984710;
 //BA.debugLineNum = 54984710;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=54984711;
 //BA.debugLineNum = 54984711;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=54984712;
 //BA.debugLineNum = 54984712;BA.debugLine="If EnsureTrackPlaybackTemp(audioKey, trackId) = F";
if (__ref._ensuretrackplaybacktemp /*boolean*/ (null,_audiokey,_trackid)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=54984713;
 //BA.debugLineNum = 54984713;BA.debugLine="Return File.GetUri(File.DirTemp, BuildPlaybackTem";
if (true) return __c.File.GetUri(__c.File.getDirTemp(),__ref._buildplaybacktemptrackfilename /*String*/ (null,_audiokey));
RDebugUtils.currentLine=54984714;
 //BA.debugLineNum = 54984714;BA.debugLine="End Sub";
return "";
}
public String  _resolvemediasource(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvemediasource", false))
	 {return ((String) Debug.delegate(ba, "resolvemediasource", new Object[] {_item}));}
String _itemtype = "";
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Public Sub ResolveMediaSource(item As Map) As Stri";
RDebugUtils.currentLine=25886721;
 //BA.debugLineNum = 25886721;BA.debugLine="If item.IsInitialized = False Then Return \"none\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "none";};
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=25886723;
 //BA.debugLineNum = 25886723;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=25886724;
 //BA.debugLineNum = 25886724;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)) { 
if (true) return "cache";};
RDebugUtils.currentLine=25886725;
 //BA.debugLineNum = 25886725;BA.debugLine="Return \"missing\"";
if (true) return "missing";
 };
RDebugUtils.currentLine=25886727;
 //BA.debugLineNum = 25886727;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=25886728;
 //BA.debugLineNum = 25886728;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)) { 
if (true) return "cache";};
RDebugUtils.currentLine=25886729;
 //BA.debugLineNum = 25886729;BA.debugLine="Return \"missing\"";
if (true) return "missing";
 };
RDebugUtils.currentLine=25886731;
 //BA.debugLineNum = 25886731;BA.debugLine="Return \"none\"";
if (true) return "none";
RDebugUtils.currentLine=25886732;
 //BA.debugLineNum = 25886732;BA.debugLine="End Sub";
return "";
}
public boolean  _consumerecentmedianetworkfailure(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "consumerecentmedianetworkfailure", false))
	 {return ((Boolean) Debug.delegate(ba, "consumerecentmedianetworkfailure", null));}
boolean _value = false;
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Public Sub ConsumeRecentMediaNetworkFailure As Boo";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="Dim value As Boolean = recentMediaNetworkFailure";
_value = __ref._recentmedianetworkfailure /*boolean*/ ;
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="recentMediaNetworkFailure = False";
__ref._recentmedianetworkfailure /*boolean*/  = __c.False;
RDebugUtils.currentLine=24772611;
 //BA.debugLineNum = 24772611;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=24772612;
 //BA.debugLineNum = 24772612;BA.debugLine="End Sub";
return false;
}
public String  _addindexedfilefromaudit(b4j.example.mediacache __ref,String _itemtype,String _filename,anywheresoftware.b4a.objects.collections.Map _auditindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "addindexedfilefromaudit", false))
	 {return ((String) Debug.delegate(ba, "addindexedfilefromaudit", new Object[] {_itemtype,_filename,_auditindex}));}
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Private Sub AddIndexedFileFromAudit(itemType As St";
RDebugUtils.currentLine=27000833;
 //BA.debugLineNum = 27000833;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=27000835;
 //BA.debugLineNum = 27000835;BA.debugLine="entry.Put(\"id\", fileName)";
_entry.Put((Object)("id"),(Object)(_filename));
RDebugUtils.currentLine=27000836;
 //BA.debugLineNum = 27000836;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=27000837;
 //BA.debugLineNum = 27000837;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=27000838;
 //BA.debugLineNum = 27000838;BA.debugLine="If itemType = \"ads\" Then";
if ((_itemtype).equals("ads")) { 
RDebugUtils.currentLine=27000839;
 //BA.debugLineNum = 27000839;BA.debugLine="entry.Put(\"title\", \"\")";
_entry.Put((Object)("title"),(Object)(""));
RDebugUtils.currentLine=27000840;
 //BA.debugLineNum = 27000840;BA.debugLine="entry.Put(\"duration\", 0)";
_entry.Put((Object)("duration"),(Object)(0));
RDebugUtils.currentLine=27000841;
 //BA.debugLineNum = 27000841;BA.debugLine="entry.Put(\"gain\", 0)";
_entry.Put((Object)("gain"),(Object)(0));
 }else {
RDebugUtils.currentLine=27000843;
 //BA.debugLineNum = 27000843;BA.debugLine="entry.Put(\"title\", \"\")";
_entry.Put((Object)("title"),(Object)(""));
RDebugUtils.currentLine=27000844;
 //BA.debugLineNum = 27000844;BA.debugLine="entry.Put(\"set\", \"\")";
_entry.Put((Object)("set"),(Object)(""));
RDebugUtils.currentLine=27000845;
 //BA.debugLineNum = 27000845;BA.debugLine="entry.Put(\"stream\", \"\")";
_entry.Put((Object)("stream"),(Object)(""));
RDebugUtils.currentLine=27000846;
 //BA.debugLineNum = 27000846;BA.debugLine="entry.Put(\"gain\", 0)";
_entry.Put((Object)("gain"),(Object)(0));
 };
RDebugUtils.currentLine=27000848;
 //BA.debugLineNum = 27000848;BA.debugLine="auditIndex.Put(fileName, entry)";
_auditindex.Put((Object)(_filename),(Object)(_entry.getObject()));
RDebugUtils.currentLine=27000849;
 //BA.debugLineNum = 27000849;BA.debugLine="MarkAuditIndexChanged(itemType)";
__ref._markauditindexchanged /*String*/ (null,_itemtype);
RDebugUtils.currentLine=27000850;
 //BA.debugLineNum = 27000850;BA.debugLine="End Sub";
return "";
}
public String  _markauditindexchanged(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "markauditindexchanged", false))
	 {return ((String) Debug.delegate(ba, "markauditindexchanged", new Object[] {_itemtype}));}
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Private Sub MarkAuditIndexChanged(itemType As Stri";
RDebugUtils.currentLine=26935297;
 //BA.debugLineNum = 26935297;BA.debugLine="If itemType = \"ads\" Then";
if ((_itemtype).equals("ads")) { 
RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="cacheAuditAdIndexChanged = True";
__ref._cacheauditadindexchanged /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=26935300;
 //BA.debugLineNum = 26935300;BA.debugLine="cacheAuditTrackIndexChanged = True";
__ref._cacheaudittrackindexchanged /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=26935302;
 //BA.debugLineNum = 26935302;BA.debugLine="End Sub";
return "";
}
public String  _applyxortobuffer(b4j.example.mediacache __ref,byte[] _buffer,int _count,byte[] _keybytes,long _keyoffset) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "applyxortobuffer", false))
	 {return ((String) Debug.delegate(ba, "applyxortobuffer", new Object[] {_buffer,_count,_keybytes,_keyoffset}));}
int _i = 0;
int _keyindex = 0;
RDebugUtils.currentLine=56229888;
 //BA.debugLineNum = 56229888;BA.debugLine="Private Sub ApplyXorToBuffer(buffer() As Byte, cou";
RDebugUtils.currentLine=56229889;
 //BA.debugLineNum = 56229889;BA.debugLine="If count <= 0 Or keyBytes.Length = 0 Then Return";
if (_count<=0 || _keybytes.length==0) { 
if (true) return "";};
RDebugUtils.currentLine=56229890;
 //BA.debugLineNum = 56229890;BA.debugLine="For i = 0 To count - 1";
{
final int step2 = 1;
final int limit2 = (int) (_count-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=56229891;
 //BA.debugLineNum = 56229891;BA.debugLine="Dim keyIndex As Int = (keyOffset + i) Mod keyByt";
_keyindex = (int) ((_keyoffset+_i)%_keybytes.length);
RDebugUtils.currentLine=56229892;
 //BA.debugLineNum = 56229892;BA.debugLine="buffer(i) = Bit.Xor(buffer(i), keyBytes(keyIndex";
_buffer[_i] = (byte) (__c.Bit.Xor((int) (_buffer[_i]),(int) (_keybytes[_keyindex])));
 }
};
RDebugUtils.currentLine=56229894;
 //BA.debugLineNum = 56229894;BA.debugLine="End Sub";
return "";
}
public String  _buildadurl(b4j.example.mediacache __ref,String _adid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildadurl", false))
	 {return ((String) Debug.delegate(ba, "buildadurl", new Object[] {_adid}));}
String _first = "";
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Private Sub BuildAdUrl(adId As String) As String";
RDebugUtils.currentLine=25493505;
 //BA.debugLineNum = 25493505;BA.debugLine="If adId = \"\" Then Return \"\"";
if ((_adid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=25493506;
 //BA.debugLineNum = 25493506;BA.debugLine="Dim first As String = adId.SubString2(0, 1)";
_first = _adid.substring((int) (0),(int) (1));
RDebugUtils.currentLine=25493507;
 //BA.debugLineNum = 25493507;BA.debugLine="Return \"https://cdn.fon.fm/media/ads/\" & first &";
if (true) return "https://cdn.fon.fm/media/ads/"+_first+"/"+_adid+".mp3";
RDebugUtils.currentLine=25493508;
 //BA.debugLineNum = 25493508;BA.debugLine="End Sub";
return "";
}
public String  _buildplaybacktemptrackfilename(b4j.example.mediacache __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildplaybacktemptrackfilename", false))
	 {return ((String) Debug.delegate(ba, "buildplaybacktemptrackfilename", new Object[] {_audiokey}));}
RDebugUtils.currentLine=55181312;
 //BA.debugLineNum = 55181312;BA.debugLine="Private Sub BuildPlaybackTempTrackFileName(audioKe";
RDebugUtils.currentLine=55181313;
 //BA.debugLineNum = 55181313;BA.debugLine="If audioKey = \"secondary\" Then Return SECONDARY_T";
if ((_audiokey).equals("secondary")) { 
if (true) return __ref._secondary_temp_track_file /*String*/ ;};
RDebugUtils.currentLine=55181314;
 //BA.debugLineNum = 55181314;BA.debugLine="Return PRIMARY_TEMP_TRACK_FILE";
if (true) return __ref._primary_temp_track_file /*String*/ ;
RDebugUtils.currentLine=55181315;
 //BA.debugLineNum = 55181315;BA.debugLine="End Sub";
return "";
}
public String  _buildtempcachefilename(b4j.example.mediacache __ref,String _itemid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtempcachefilename", false))
	 {return ((String) Debug.delegate(ba, "buildtempcachefilename", new Object[] {_itemid}));}
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Private Sub BuildTempCacheFileName(itemId As Strin";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="Return itemId & \".tmp\"";
if (true) return _itemid+".tmp";
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=55115776;
 //BA.debugLineNum = 55115776;BA.debugLine="Private Sub BuildTrackCacheFileName(trackId As Str";
RDebugUtils.currentLine=55115777;
 //BA.debugLineNum = 55115777;BA.debugLine="Dim sourceBytes() As Byte = GetBytesFromString(\"f";
_sourcebytes = __ref._getbytesfromstring /*byte[]*/ (null,"fonfm-track|"+__ref._devicekeyseed /*String*/ +"|"+_trackid);
RDebugUtils.currentLine=55115778;
 //BA.debugLineNum = 55115778;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=55115779;
 //BA.debugLineNum = 55115779;BA.debugLine="jo.InitializeStatic(\"java.util.UUID\")";
_jo.InitializeStatic("java.util.UUID");
RDebugUtils.currentLine=55115780;
 //BA.debugLineNum = 55115780;BA.debugLine="Dim uuid As JavaObject = jo.RunMethod(\"nameUUIDFr";
_uuid = new anywheresoftware.b4j.object.JavaObject();
_uuid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("nameUUIDFromBytes",new Object[]{(Object)(_sourcebytes)})));
RDebugUtils.currentLine=55115781;
 //BA.debugLineNum = 55115781;BA.debugLine="Dim fileName As String = uuid.RunMethod(\"toString";
_filename = BA.ObjectToString(_uuid.RunMethod("toString",(Object[])(__c.Null)));
RDebugUtils.currentLine=55115782;
 //BA.debugLineNum = 55115782;BA.debugLine="Return fileName.Replace(\"-\", \"\")";
if (true) return _filename.replace("-","");
RDebugUtils.currentLine=55115783;
 //BA.debugLineNum = 55115783;BA.debugLine="End Sub";
return "";
}
public byte[]  _getbytesfromstring(b4j.example.mediacache __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getbytesfromstring", false))
	 {return ((byte[]) Debug.delegate(ba, "getbytesfromstring", new Object[] {_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=56098816;
 //BA.debugLineNum = 56098816;BA.debugLine="Private Sub GetBytesFromString(value As String) As";
RDebugUtils.currentLine=56098817;
 //BA.debugLineNum = 56098817;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=56098818;
 //BA.debugLineNum = 56098818;BA.debugLine="jo.InitializeNewInstance(\"java.lang.String\", Arra";
_jo.InitializeNewInstance("java.lang.String",new Object[]{(Object)(_value)});
RDebugUtils.currentLine=56098819;
 //BA.debugLineNum = 56098819;BA.debugLine="Return jo.RunMethod(\"getBytes\", Array As Object(\"";
if (true) return (byte[])(_jo.RunMethod("getBytes",new Object[]{(Object)("UTF-8")}));
RDebugUtils.currentLine=56098820;
 //BA.debugLineNum = 56098820;BA.debugLine="End Sub";
return null;
}
public byte[]  _buildtrackobfuscationkey(b4j.example.mediacache __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackobfuscationkey", false))
	 {return ((byte[]) Debug.delegate(ba, "buildtrackobfuscationkey", new Object[] {_trackid}));}
RDebugUtils.currentLine=55443456;
 //BA.debugLineNum = 55443456;BA.debugLine="Private Sub BuildTrackObfuscationKey(trackId As St";
RDebugUtils.currentLine=55443457;
 //BA.debugLineNum = 55443457;BA.debugLine="Return GetBytesFromString(\"fonfm-track-key|\" & de";
if (true) return __ref._getbytesfromstring /*byte[]*/ (null,"fonfm-track-key|"+__ref._devicekeyseed /*String*/ +"|"+_trackid);
RDebugUtils.currentLine=55443458;
 //BA.debugLineNum = 55443458;BA.debugLine="End Sub";
return null;
}
public String  _buildtrackurl(b4j.example.mediacache __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackurl", false))
	 {return ((String) Debug.delegate(ba, "buildtrackurl", new Object[] {_trackid}));}
String _first = "";
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Private Sub BuildTrackUrl(trackId As String) As St";
RDebugUtils.currentLine=25559041;
 //BA.debugLineNum = 25559041;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="Dim first As String = trackId.SubString2(0, 1)";
_first = _trackid.substring((int) (0),(int) (1));
RDebugUtils.currentLine=25559043;
 //BA.debugLineNum = 25559043;BA.debugLine="Return \"https://cdn.fon.fm/media/tracks/\" & first";
if (true) return "https://cdn.fon.fm/media/tracks/"+_first+"/"+_trackid+".mp3";
RDebugUtils.currentLine=25559044;
 //BA.debugLineNum = 25559044;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=23920644;
 //BA.debugLineNum = 23920644;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=23920645;
 //BA.debugLineNum = 23920645;BA.debugLine="Private deviceKeySeed As String";
_devicekeyseed = "";
RDebugUtils.currentLine=23920646;
 //BA.debugLineNum = 23920646;BA.debugLine="Private mediaDirName As String = \"media\"";
_mediadirname = "media";
RDebugUtils.currentLine=23920647;
 //BA.debugLineNum = 23920647;BA.debugLine="Private adsDirName As String = \"ads\"";
_adsdirname = "ads";
RDebugUtils.currentLine=23920648;
 //BA.debugLineNum = 23920648;BA.debugLine="Private tracksDirName As String = \"tracks\"";
_tracksdirname = "tracks";
RDebugUtils.currentLine=23920649;
 //BA.debugLineNum = 23920649;BA.debugLine="Private Const CACHE_AUDIT_BATCH_SIZE As Int = 8";
_cache_audit_batch_size = (int) (8);
RDebugUtils.currentLine=23920650;
 //BA.debugLineNum = 23920650;BA.debugLine="Private Const AD_DOWNLOAD_TIMEOUT_MS As Int = 150";
_ad_download_timeout_ms = (int) (15000);
RDebugUtils.currentLine=23920651;
 //BA.debugLineNum = 23920651;BA.debugLine="Private Const TRACK_DOWNLOAD_TIMEOUT_MS As Int =";
_track_download_timeout_ms = (int) (10000);
RDebugUtils.currentLine=23920652;
 //BA.debugLineNum = 23920652;BA.debugLine="Private Const STREAM_XOR_BUFFER_SIZE As Int = 327";
_stream_xor_buffer_size = (int) (32768);
RDebugUtils.currentLine=23920653;
 //BA.debugLineNum = 23920653;BA.debugLine="Private Const PRIMARY_TEMP_TRACK_FILE As String =";
_primary_temp_track_file = "2f7f5f2f-91a0-4f4c-9f5f-70d7b94fd101.tmp";
RDebugUtils.currentLine=23920654;
 //BA.debugLineNum = 23920654;BA.debugLine="Private Const SECONDARY_TEMP_TRACK_FILE As String";
_secondary_temp_track_file = "92c2df6a-7f22-4b75-8c09-d5a6f4f40a21.tmp";
RDebugUtils.currentLine=23920655;
 //BA.debugLineNum = 23920655;BA.debugLine="Private cachedAdIndex As Map";
_cachedadindex = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=23920656;
 //BA.debugLineNum = 23920656;BA.debugLine="Private cachedTrackIndex As Map";
_cachedtrackindex = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=23920657;
 //BA.debugLineNum = 23920657;BA.debugLine="Private playbackTempTrackIds As Map";
_playbacktemptrackids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=23920658;
 //BA.debugLineNum = 23920658;BA.debugLine="Private cacheAuditInProgress As Boolean";
_cacheauditinprogress = false;
RDebugUtils.currentLine=23920659;
 //BA.debugLineNum = 23920659;BA.debugLine="Private cacheAuditPendingTypes As List";
_cacheauditpendingtypes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23920660;
 //BA.debugLineNum = 23920660;BA.debugLine="Private cacheAuditCurrentType As String";
_cacheauditcurrenttype = "";
RDebugUtils.currentLine=23920661;
 //BA.debugLineNum = 23920661;BA.debugLine="Private cacheAuditCurrentFileNames As List";
_cacheauditcurrentfilenames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23920662;
 //BA.debugLineNum = 23920662;BA.debugLine="Private cacheAuditCurrentPosition As Int";
_cacheauditcurrentposition = 0;
RDebugUtils.currentLine=23920663;
 //BA.debugLineNum = 23920663;BA.debugLine="Private cacheAuditSeenIds As Map";
_cacheauditseenids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=23920664;
 //BA.debugLineNum = 23920664;BA.debugLine="Private cacheAuditAdIndexChanged As Boolean";
_cacheauditadindexchanged = false;
RDebugUtils.currentLine=23920665;
 //BA.debugLineNum = 23920665;BA.debugLine="Private cacheAuditTrackIndexChanged As Boolean";
_cacheaudittrackindexchanged = false;
RDebugUtils.currentLine=23920666;
 //BA.debugLineNum = 23920666;BA.debugLine="Private cacheAuditAddedCount As Int";
_cacheauditaddedcount = 0;
RDebugUtils.currentLine=23920667;
 //BA.debugLineNum = 23920667;BA.debugLine="Private cacheAuditRemovedCount As Int";
_cacheauditremovedcount = 0;
RDebugUtils.currentLine=23920668;
 //BA.debugLineNum = 23920668;BA.debugLine="Private cacheAuditTempDeletedCount As Int";
_cacheaudittempdeletedcount = 0;
RDebugUtils.currentLine=23920669;
 //BA.debugLineNum = 23920669;BA.debugLine="Private recentMediaNetworkFailure As Boolean";
_recentmedianetworkfailure = false;
RDebugUtils.currentLine=23920670;
 //BA.debugLineNum = 23920670;BA.debugLine="End Sub";
return "";
}
public String  _deletefileifexists(b4j.example.mediacache __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "deletefileifexists", false))
	 {return ((String) Debug.delegate(ba, "deletefileifexists", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Private Sub DeleteFileIfExists(dir As String, file";
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="If fileName = \"\" Then Return";
if ((_filename).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="Try";
try {RDebugUtils.currentLine=25821187;
 //BA.debugLineNum = 25821187;BA.debugLine="If File.Exists(dir, fileName) Then File.Delete(d";
if (__c.File.Exists(_dir,_filename)) { 
__c.File.Delete(_dir,_filename);};
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=25821189;
 //BA.debugLineNum = 25821189;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("425821189",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=25821191;
 //BA.debugLineNum = 25821191;BA.debugLine="End Sub";
return "";
}
public long  _elapsedms(b4j.example.mediacache __ref,long _startedat) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "elapsedms", false))
	 {return ((Long) Debug.delegate(ba, "elapsedms", new Object[] {_startedat}));}
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Private Sub ElapsedMs(startedAt As Long) As Long";
RDebugUtils.currentLine=26411009;
 //BA.debugLineNum = 26411009;BA.debugLine="Return Max(0, DateTime.Now - startedAt)";
if (true) return (long) (__c.Max(0,__c.DateTime.getNow()-_startedat));
RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedadindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedadindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedadindex", null));}
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Private Sub GetCachedAdIndex As Map";
RDebugUtils.currentLine=25100289;
 //BA.debugLineNum = 25100289;BA.debugLine="If cachedAdIndex.IsInitialized = False Then";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="cachedAdIndex.Initialize";
__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=25100292;
 //BA.debugLineNum = 25100292;BA.debugLine="Return cachedAdIndex";
if (true) return __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=25100293;
 //BA.debugLineNum = 25100293;BA.debugLine="End Sub";
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
long _copystartedat = 0L;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outstream = null;
long _replacestartedat = 0L;

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
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="If adId = \"\" Then Return False";
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
RDebugUtils.currentLine=24838147;
 //BA.debugLineNum = 24838147;BA.debugLine="If TryRestoreExistingCachedMedia(\"ad\", adId, ad,";
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
RDebugUtils.currentLine=24838148;
 //BA.debugLineNum = 24838148;BA.debugLine="If IsAdCached(adId) Then";
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
RDebugUtils.currentLine=24838149;
 //BA.debugLineNum = 24838149;BA.debugLine="UpdateAdIndex(ad, adIndex)";
__ref._updateadindex /*String*/ (null,_ad,_adindex);
RDebugUtils.currentLine=24838150;
 //BA.debugLineNum = 24838150;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=24838152;
 //BA.debugLineNum = 24838152;BA.debugLine="Dim adUrl As String = BuildAdUrl(adId)";
_adurl = __ref._buildadurl /*String*/ (null,_adid);
RDebugUtils.currentLine=24838153;
 //BA.debugLineNum = 24838153;BA.debugLine="If adUrl = \"\" Then Return False";
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
RDebugUtils.currentLine=24838154;
 //BA.debugLineNum = 24838154;BA.debugLine="Dim downloadStartedAt As Long = DateTime.Now";
_downloadstartedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=24838155;
 //BA.debugLineNum = 24838155;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=24838156;
 //BA.debugLineNum = 24838156;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=24838157;
 //BA.debugLineNum = 24838157;BA.debugLine="Trace(\"Скачивание рекламы в кэш. id=\" & adId & \",";
__ref._trace /*String*/ (null,"Скачивание рекламы в кэш. id="+_adid+", url="+_adurl);
RDebugUtils.currentLine=24838158;
 //BA.debugLineNum = 24838158;BA.debugLine="j.Download(adUrl)";
_j._download /*String*/ (null,_adurl);
RDebugUtils.currentLine=24838159;
 //BA.debugLineNum = 24838159;BA.debugLine="j.GetRequest.Timeout = AD_DOWNLOAD_TIMEOUT_MS";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._ad_download_timeout_ms /*int*/ );
RDebugUtils.currentLine=24838160;
 //BA.debugLineNum = 24838160;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensuresingleadcached"), (Object)(_j));
this.state = 49;
return;
case 49:
//C
this.state = 23;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=24838161;
 //BA.debugLineNum = 24838161;BA.debugLine="If j.Success Then";
if (true) break;

case 23:
//if
this.state = 48;
if (_j._success /*boolean*/ ) { 
this.state = 25;
}else {
this.state = 41;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=24838162;
 //BA.debugLineNum = 24838162;BA.debugLine="Try";
if (true) break;

case 26:
//try
this.state = 39;
this.catchState = 38;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 38;
RDebugUtils.currentLine=24838163;
 //BA.debugLineNum = 24838163;BA.debugLine="Trace(\"Скачивание рекламы завершено. id=\" & adI";
__ref._trace /*String*/ (null,"Скачивание рекламы завершено. id="+_adid+", elapsedMs="+BA.NumberToString(__ref._elapsedms /*long*/ (null,_downloadstartedat)));
RDebugUtils.currentLine=24838164;
 //BA.debugLineNum = 24838164;BA.debugLine="EnsureDirectory(GetAdsDir)";
__ref._ensuredirectory /*String*/ (null,__ref._getadsdir /*String*/ (null));
RDebugUtils.currentLine=24838165;
 //BA.debugLineNum = 24838165;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
_tempfilename = __ref._buildtempcachefilename /*String*/ (null,_adid);
RDebugUtils.currentLine=24838166;
 //BA.debugLineNum = 24838166;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=24838167;
 //BA.debugLineNum = 24838167;BA.debugLine="Dim copyStartedAt As Long = DateTime.Now";
_copystartedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=24838168;
 //BA.debugLineNum = 24838168;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = parent.__c.File.OpenOutput(__ref._getadsdir /*String*/ (null),_tempfilename,parent.__c.False);
RDebugUtils.currentLine=24838169;
 //BA.debugLineNum = 24838169;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_outstream.getObject()));
RDebugUtils.currentLine=24838170;
 //BA.debugLineNum = 24838170;BA.debugLine="outStream.Close";
_outstream.Close();
RDebugUtils.currentLine=24838171;
 //BA.debugLineNum = 24838171;BA.debugLine="Trace(\"Запись временного файла рекламы завершен";
__ref._trace /*String*/ (null,"Запись временного файла рекламы завершена. id="+_adid+", elapsedMs="+BA.NumberToString(__ref._elapsedms /*long*/ (null,_copystartedat)));
RDebugUtils.currentLine=24838172;
 //BA.debugLineNum = 24838172;BA.debugLine="If IsCachedFileUsable(GetAdsDir, tempFileName)";
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
RDebugUtils.currentLine=24838173;
 //BA.debugLineNum = 24838173;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=24838174;
 //BA.debugLineNum = 24838174;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
__ref._trace /*String*/ (null,"Не удалось сохранить рекламу в кэш. id="+_adid+", message=empty temp file");
RDebugUtils.currentLine=24838175;
 //BA.debugLineNum = 24838175;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=24838176;
 //BA.debugLineNum = 24838176;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=24838178;
 //BA.debugLineNum = 24838178;BA.debugLine="Dim replaceStartedAt As Long = DateTime.Now";
_replacestartedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=24838179;
 //BA.debugLineNum = 24838179;BA.debugLine="If ReplaceCacheFile(GetAdsDir, tempFileName, ad";
if (true) break;

case 33:
//if
this.state = 36;
if (__ref._replacecachefile /*boolean*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename,_adid)==parent.__c.False) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=24838180;
 //BA.debugLineNum = 24838180;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=24838181;
 //BA.debugLineNum = 24838181;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
__ref._trace /*String*/ (null,"Не удалось сохранить рекламу в кэш. id="+_adid+", message=rename failed");
RDebugUtils.currentLine=24838182;
 //BA.debugLineNum = 24838182;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=24838183;
 //BA.debugLineNum = 24838183;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 36:
//C
this.state = 39;
;
RDebugUtils.currentLine=24838185;
 //BA.debugLineNum = 24838185;BA.debugLine="Trace(\"Финализация файла рекламы завершена. id=";
__ref._trace /*String*/ (null,"Финализация файла рекламы завершена. id="+_adid+", elapsedMs="+BA.NumberToString(__ref._elapsedms /*long*/ (null,_replacestartedat)));
RDebugUtils.currentLine=24838186;
 //BA.debugLineNum = 24838186;BA.debugLine="UpdateAdIndex(ad, adIndex)";
__ref._updateadindex /*String*/ (null,_ad,_adindex);
RDebugUtils.currentLine=24838187;
 //BA.debugLineNum = 24838187;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
RDebugUtils.currentLine=24838188;
 //BA.debugLineNum = 24838188;BA.debugLine="recentMediaNetworkFailure = False";
__ref._recentmedianetworkfailure /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=24838189;
 //BA.debugLineNum = 24838189;BA.debugLine="Trace(\"Реклама сохранена в кэш. id=\" & adId & \"";
__ref._trace /*String*/ (null,"Реклама сохранена в кэш. id="+_adid+", totalElapsedMs="+BA.NumberToString(__ref._elapsedms /*long*/ (null,_downloadstartedat)));
RDebugUtils.currentLine=24838190;
 //BA.debugLineNum = 24838190;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=24838191;
 //BA.debugLineNum = 24838191;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 38:
//C
this.state = 39;
this.catchState = 0;
RDebugUtils.currentLine=24838193;
 //BA.debugLineNum = 24838193;BA.debugLine="DeleteFileIfExists(GetAdsDir, BuildTempCacheFil";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),__ref._buildtempcachefilename /*String*/ (null,_adid));
RDebugUtils.currentLine=24838194;
 //BA.debugLineNum = 24838194;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=\"";
__ref._trace /*String*/ (null,"Не удалось сохранить рекламу в кэш. id="+_adid+", message="+parent.__c.LastException(ba).getMessage());
 if (true) break;
if (true) break;

case 39:
//C
this.state = 48;
this.catchState = 0;
;
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=24838197;
 //BA.debugLineNum = 24838197;BA.debugLine="If IsMediaNetworkFailure(j.ErrorMessage) Then re";
if (true) break;

case 42:
//if
this.state = 47;
if (__ref._ismedianetworkfailure /*boolean*/ (null,_j._errormessage /*String*/ )) { 
this.state = 44;
;}if (true) break;

case 44:
//C
this.state = 47;
__ref._recentmedianetworkfailure /*boolean*/  = parent.__c.True;
if (true) break;

case 47:
//C
this.state = 48;
;
RDebugUtils.currentLine=24838198;
 //BA.debugLineNum = 24838198;BA.debugLine="Trace(\"Не удалось скачать рекламу. id=\" & adId &";
__ref._trace /*String*/ (null,"Не удалось скачать рекламу. id="+_adid+", message="+_j._errormessage /*String*/ );
 if (true) break;

case 48:
//C
this.state = -1;
;
RDebugUtils.currentLine=24838200;
 //BA.debugLineNum = 24838200;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=24838201;
 //BA.debugLineNum = 24838201;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=24838202;
 //BA.debugLineNum = 24838202;BA.debugLine="End Sub";
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
public boolean  _isadcached(b4j.example.mediacache __ref,String _adid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "isadcached", false))
	 {return ((Boolean) Debug.delegate(ba, "isadcached", new Object[] {_adid}));}
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Public Sub IsAdCached(adId As String) As Boolean";
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="If adId = \"\" Then Return False";
if ((_adid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="Return ValidateIndexedFile(\"ad\", adId)";
if (true) return __ref._validateindexedfile /*boolean*/ (null,"ad",_adid);
RDebugUtils.currentLine=24444931;
 //BA.debugLineNum = 24444931;BA.debugLine="End Sub";
return false;
}
public String  _saveadindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "saveadindex", false))
	 {return ((String) Debug.delegate(ba, "saveadindex", null));}
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Private Sub SaveAdIndex";
RDebugUtils.currentLine=25362433;
 //BA.debugLineNum = 25362433;BA.debugLine="storage.Put(\"cached_ad_index\", cachedAdIndex)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_ad_index",(Object)(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=25362434;
 //BA.debugLineNum = 25362434;BA.debugLine="storage.Put(\"cached_ad_count\", cachedAdIndex.Size";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_ad_count",(Object)(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=25362435;
 //BA.debugLineNum = 25362435;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.mediacache __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=27066369;
 //BA.debugLineNum = 27066369;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=27066372;
 //BA.debugLineNum = 27066372;BA.debugLine="End Sub";
return "";
}
public String  _ensuredirectory(b4j.example.mediacache __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _fileobject = null;
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=26476547;
 //BA.debugLineNum = 26476547;BA.debugLine="fileObject.RunMethod(\"mkdirs\", Null)";
_fileobject.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=26476548;
 //BA.debugLineNum = 26476548;BA.debugLine="End Sub";
return "";
}
public boolean  _tryrestoreexistingcachedmedia(b4j.example.mediacache __ref,String _itemtype,String _itemid,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _itemindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "tryrestoreexistingcachedmedia", false))
	 {return ((Boolean) Debug.delegate(ba, "tryrestoreexistingcachedmedia", new Object[] {_itemtype,_itemid,_item,_itemindex}));}
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Private Sub TryRestoreExistingCachedMedia(itemType";
RDebugUtils.currentLine=26083329;
 //BA.debugLineNum = 26083329;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="If IsCachedFileUsable(GetDirByItemType(itemType),";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._getdirbyitemtype /*String*/ (null,_itemtype),__ref._resolveindexedfilename /*String*/ (null,_itemtype,_itemid,_itemindex))==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=26083331;
 //BA.debugLineNum = 26083331;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=26083332;
 //BA.debugLineNum = 26083332;BA.debugLine="UpdateAdIndex(item, itemIndex)";
__ref._updateadindex /*String*/ (null,_item,_itemindex);
RDebugUtils.currentLine=26083333;
 //BA.debugLineNum = 26083333;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
RDebugUtils.currentLine=26083334;
 //BA.debugLineNum = 26083334;BA.debugLine="Trace(\"Валидный cached ad восстановлен в индексе";
__ref._trace /*String*/ (null,"Валидный cached ad восстановлен в индексе без скачивания. id="+_itemid);
RDebugUtils.currentLine=26083335;
 //BA.debugLineNum = 26083335;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=26083337;
 //BA.debugLineNum = 26083337;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=26083338;
 //BA.debugLineNum = 26083338;BA.debugLine="UpdateTrackIndex(item, itemIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_itemindex);
RDebugUtils.currentLine=26083339;
 //BA.debugLineNum = 26083339;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=26083340;
 //BA.debugLineNum = 26083340;BA.debugLine="Trace(\"Валидный cached track восстановлен в инде";
__ref._trace /*String*/ (null,"Валидный cached track восстановлен в индексе без скачивания. id="+_itemid);
RDebugUtils.currentLine=26083341;
 //BA.debugLineNum = 26083341;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=26083343;
 //BA.debugLineNum = 26083343;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=26083344;
 //BA.debugLineNum = 26083344;BA.debugLine="End Sub";
return false;
}
public String  _updateadindex(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _adindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "updateadindex", false))
	 {return ((String) Debug.delegate(ba, "updateadindex", new Object[] {_ad,_adindex}));}
String _adid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Private Sub UpdateAdIndex(ad As Map, adIndex As Ma";
RDebugUtils.currentLine=24969217;
 //BA.debugLineNum = 24969217;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="If adId = \"\" Then Return";
if ((_adid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="Dim entry As Map = adIndex.GetDefault(adId, Null)";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adindex.GetDefault((Object)(_adid),__c.Null)));
RDebugUtils.currentLine=24969220;
 //BA.debugLineNum = 24969220;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=24969221;
 //BA.debugLineNum = 24969221;BA.debugLine="entry.Put(\"id\", adId)";
_entry.Put((Object)("id"),(Object)(_adid));
RDebugUtils.currentLine=24969222;
 //BA.debugLineNum = 24969222;BA.debugLine="entry.Put(\"title\", ad.GetDefault(\"title\", \"\"))";
_entry.Put((Object)("title"),_ad.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=24969223;
 //BA.debugLineNum = 24969223;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=24969224;
 //BA.debugLineNum = 24969224;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=24969225;
 //BA.debugLineNum = 24969225;BA.debugLine="entry.Put(\"duration\", ad.GetDefault(\"duration\", 0";
_entry.Put((Object)("duration"),_ad.GetDefault((Object)("duration"),(Object)(0)));
RDebugUtils.currentLine=24969226;
 //BA.debugLineNum = 24969226;BA.debugLine="entry.Put(\"gain\", ad.GetDefault(\"gain\", 0))";
_entry.Put((Object)("gain"),_ad.GetDefault((Object)("gain"),(Object)(0)));
RDebugUtils.currentLine=24969227;
 //BA.debugLineNum = 24969227;BA.debugLine="adIndex.Put(adId, entry)";
_adindex.Put((Object)(_adid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=24969228;
 //BA.debugLineNum = 24969228;BA.debugLine="End Sub";
return "";
}
public String  _getadsdir(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getadsdir", false))
	 {return ((String) Debug.delegate(ba, "getadsdir", null));}
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Public Sub GetAdsDir As String";
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
if (true) return __c.File.Combine(__c.File.Combine(__ref._storagedir /*String*/ ,__ref._mediadirname /*String*/ ),__ref._adsdirname /*String*/ );
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="End Sub";
return "";
}
public boolean  _iscachedfileusable(b4j.example.mediacache __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "iscachedfileusable", false))
	 {return ((Boolean) Debug.delegate(ba, "iscachedfileusable", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Private Sub IsCachedFileUsable(dir As String, file";
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="If fileName = \"\" Then Return False";
if ((_filename).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="If File.Exists(dir, fileName) = False Then Return";
if (__c.File.Exists(_dir,_filename)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=25624579;
 //BA.debugLineNum = 25624579;BA.debugLine="Try";
try {RDebugUtils.currentLine=25624580;
 //BA.debugLineNum = 25624580;BA.debugLine="If File.Size(dir, fileName) > 0 Then Return True";
if (__c.File.Size(_dir,_filename)>0) { 
if (true) return __c.True;};
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=25624582;
 //BA.debugLineNum = 25624582;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("425624582",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=25624584;
 //BA.debugLineNum = 25624584;BA.debugLine="DeleteFileIfExists(dir, fileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_filename);
RDebugUtils.currentLine=25624585;
 //BA.debugLineNum = 25624585;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=25624586;
 //BA.debugLineNum = 25624586;BA.debugLine="End Sub";
return false;
}
public boolean  _replacecachefile(b4j.example.mediacache __ref,String _dir,String _tempfilename,String _finalfilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "replacecachefile", false))
	 {return ((Boolean) Debug.delegate(ba, "replacecachefile", new Object[] {_dir,_tempfilename,_finalfilename}));}
anywheresoftware.b4j.object.JavaObject _tempfile = null;
anywheresoftware.b4j.object.JavaObject _finalfile = null;
boolean _renamed = false;
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Private Sub ReplaceCacheFile(dir As String, tempFi";
RDebugUtils.currentLine=25755649;
 //BA.debugLineNum = 25755649;BA.debugLine="If IsCachedFileUsable(dir, tempFileName) = False";
if (__ref._iscachedfileusable /*boolean*/ (null,_dir,_tempfilename)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="If IsCachedFileUsable(dir, finalFileName) Then";
if (__ref._iscachedfileusable /*boolean*/ (null,_dir,_finalfilename)) { 
RDebugUtils.currentLine=25755651;
 //BA.debugLineNum = 25755651;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_tempfilename);
RDebugUtils.currentLine=25755652;
 //BA.debugLineNum = 25755652;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=25755654;
 //BA.debugLineNum = 25755654;BA.debugLine="DeleteFileIfExists(dir, finalFileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_finalfilename);
RDebugUtils.currentLine=25755655;
 //BA.debugLineNum = 25755655;BA.debugLine="Dim tempFile As JavaObject";
_tempfile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=25755656;
 //BA.debugLineNum = 25755656;BA.debugLine="tempFile.InitializeNewInstance(\"java.io.File\", Ar";
_tempfile.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_dir,_tempfilename))});
RDebugUtils.currentLine=25755657;
 //BA.debugLineNum = 25755657;BA.debugLine="Dim finalFile As JavaObject";
_finalfile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=25755658;
 //BA.debugLineNum = 25755658;BA.debugLine="finalFile.InitializeNewInstance(\"java.io.File\", A";
_finalfile.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_dir,_finalfilename))});
RDebugUtils.currentLine=25755659;
 //BA.debugLineNum = 25755659;BA.debugLine="Dim renamed As Boolean = tempFile.RunMethod(\"rena";
_renamed = BA.ObjectToBoolean(_tempfile.RunMethod("renameTo",new Object[]{(Object)(_finalfile.getObject())}));
RDebugUtils.currentLine=25755660;
 //BA.debugLineNum = 25755660;BA.debugLine="If renamed = False And IsCachedFileUsable(dir, fi";
if (_renamed==__c.False && __ref._iscachedfileusable /*boolean*/ (null,_dir,_finalfilename)) { 
RDebugUtils.currentLine=25755661;
 //BA.debugLineNum = 25755661;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_tempfilename);
RDebugUtils.currentLine=25755662;
 //BA.debugLineNum = 25755662;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=25755664;
 //BA.debugLineNum = 25755664;BA.debugLine="Return renamed";
if (true) return _renamed;
RDebugUtils.currentLine=25755665;
 //BA.debugLineNum = 25755665;BA.debugLine="End Sub";
return false;
}
public boolean  _ismedianetworkfailure(b4j.example.mediacache __ref,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ismedianetworkfailure", false))
	 {return ((Boolean) Debug.delegate(ba, "ismedianetworkfailure", new Object[] {_errormessage}));}
String _text = "";
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Private Sub IsMediaNetworkFailure(errorMessage As";
RDebugUtils.currentLine=26345473;
 //BA.debugLineNum = 26345473;BA.debugLine="Dim text As String = errorMessage.ToLowerCase";
_text = _errormessage.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="If text.Contains(\"timed out\") Then Return True";
if (_text.contains("timed out")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=26345475;
 //BA.debugLineNum = 26345475;BA.debugLine="If text.Contains(\"unknownhost\") Then Return True";
if (_text.contains("unknownhost")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=26345476;
 //BA.debugLineNum = 26345476;BA.debugLine="If text.Contains(\"refused\") Then Return True";
if (_text.contains("refused")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=26345477;
 //BA.debugLineNum = 26345477;BA.debugLine="If text.Contains(\"sslhandshakeexception\") Then Re";
if (_text.contains("sslhandshakeexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=26345478;
 //BA.debugLineNum = 26345478;BA.debugLine="If text.Contains(\"pkix path building failed\") The";
if (_text.contains("pkix path building failed")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=26345479;
 //BA.debugLineNum = 26345479;BA.debugLine="If text.Contains(\"unable to find valid certificat";
if (_text.contains("unable to find valid certification path")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=26345480;
 //BA.debugLineNum = 26345480;BA.debugLine="If text.Contains(\"connectexception\") Then Return";
if (_text.contains("connectexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=26345481;
 //BA.debugLineNum = 26345481;BA.debugLine="If text.Contains(\"socketexception\") Then Return T";
if (_text.contains("socketexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=26345482;
 //BA.debugLineNum = 26345482;BA.debugLine="If text.Contains(\"sockettimeoutexception\") Then R";
if (_text.contains("sockettimeoutexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=26345483;
 //BA.debugLineNum = 26345483;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=26345484;
 //BA.debugLineNum = 26345484;BA.debugLine="End Sub";
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
String _tempfilename = "";
long _copystartedat = 0L;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outstream = null;
long _replacestartedat = 0L;

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
RDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="If trackId = \"\" Then Return False";
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
RDebugUtils.currentLine=24903683;
 //BA.debugLineNum = 24903683;BA.debugLine="If TryRestoreExistingCachedMedia(\"track\", trackId";
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
RDebugUtils.currentLine=24903684;
 //BA.debugLineNum = 24903684;BA.debugLine="If IsTrackCached(trackId) Then";
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
RDebugUtils.currentLine=24903685;
 //BA.debugLineNum = 24903685;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_trackindex);
RDebugUtils.currentLine=24903686;
 //BA.debugLineNum = 24903686;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=24903688;
 //BA.debugLineNum = 24903688;BA.debugLine="Dim trackUrl As String = BuildTrackUrl(trackId)";
_trackurl = __ref._buildtrackurl /*String*/ (null,_trackid);
RDebugUtils.currentLine=24903689;
 //BA.debugLineNum = 24903689;BA.debugLine="If trackUrl = \"\" Then Return False";
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
RDebugUtils.currentLine=24903690;
 //BA.debugLineNum = 24903690;BA.debugLine="Dim downloadStartedAt As Long = DateTime.Now";
_downloadstartedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=24903691;
 //BA.debugLineNum = 24903691;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=24903692;
 //BA.debugLineNum = 24903692;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=24903693;
 //BA.debugLineNum = 24903693;BA.debugLine="Trace(\"Скачивание трека в кэш. id=\" & trackId & \"";
__ref._trace /*String*/ (null,"Скачивание трека в кэш. id="+_trackid+", url="+_trackurl);
RDebugUtils.currentLine=24903694;
 //BA.debugLineNum = 24903694;BA.debugLine="j.Download(trackUrl)";
_j._download /*String*/ (null,_trackurl);
RDebugUtils.currentLine=24903695;
 //BA.debugLineNum = 24903695;BA.debugLine="j.GetRequest.Timeout = TRACK_DOWNLOAD_TIMEOUT_MS";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._track_download_timeout_ms /*int*/ );
RDebugUtils.currentLine=24903696;
 //BA.debugLineNum = 24903696;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensuresingletrackcached"), (Object)(_j));
this.state = 49;
return;
case 49:
//C
this.state = 23;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=24903697;
 //BA.debugLineNum = 24903697;BA.debugLine="If j.Success Then";
if (true) break;

case 23:
//if
this.state = 48;
if (_j._success /*boolean*/ ) { 
this.state = 25;
}else {
this.state = 41;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=24903698;
 //BA.debugLineNum = 24903698;BA.debugLine="Try";
if (true) break;

case 26:
//try
this.state = 39;
this.catchState = 38;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 38;
RDebugUtils.currentLine=24903699;
 //BA.debugLineNum = 24903699;BA.debugLine="Trace(\"Скачивание трека завершено. id=\" & trac";
__ref._trace /*String*/ (null,"Скачивание трека завершено. id="+_trackid+", elapsedMs="+BA.NumberToString(__ref._elapsedms /*long*/ (null,_downloadstartedat)));
RDebugUtils.currentLine=24903700;
 //BA.debugLineNum = 24903700;BA.debugLine="EnsureDirectory(GetTracksDir)";
__ref._ensuredirectory /*String*/ (null,__ref._gettracksdir /*String*/ (null));
RDebugUtils.currentLine=24903701;
 //BA.debugLineNum = 24903701;BA.debugLine="Dim tempFileName As String = BuildTempCacheFil";
_tempfilename = __ref._buildtempcachefilename /*String*/ (null,_trackid);
RDebugUtils.currentLine=24903702;
 //BA.debugLineNum = 24903702;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=24903703;
 //BA.debugLineNum = 24903703;BA.debugLine="Dim copyStartedAt As Long = DateTime.Now";
_copystartedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=24903704;
 //BA.debugLineNum = 24903704;BA.debugLine="Dim outStream As OutputStream = File.OpenOutpu";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = parent.__c.File.OpenOutput(__ref._gettracksdir /*String*/ (null),_tempfilename,parent.__c.False);
RDebugUtils.currentLine=24903705;
 //BA.debugLineNum = 24903705;BA.debugLine="TransformStreamWithXor(j.GetInputStream, outSt";
__ref._transformstreamwithxor /*String*/ (null,_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null),_outstream,__ref._buildtrackobfuscationkey /*byte[]*/ (null,_trackid));
RDebugUtils.currentLine=24903706;
 //BA.debugLineNum = 24903706;BA.debugLine="outStream.Close";
_outstream.Close();
RDebugUtils.currentLine=24903707;
 //BA.debugLineNum = 24903707;BA.debugLine="Trace(\"Запись временного файла трека завершена";
__ref._trace /*String*/ (null,"Запись временного файла трека завершена. id="+_trackid+", elapsedMs="+BA.NumberToString(__ref._elapsedms /*long*/ (null,_copystartedat)));
RDebugUtils.currentLine=24903708;
 //BA.debugLineNum = 24903708;BA.debugLine="If IsCachedFileUsable(GetTracksDir, tempFileNa";
if (true) break;

case 29:
//if
this.state = 32;
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_tempfilename)==parent.__c.False) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=24903709;
 //BA.debugLineNum = 24903709;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=24903710;
 //BA.debugLineNum = 24903710;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\"";
__ref._trace /*String*/ (null,"Не удалось сохранить трек в кэш. id="+_trackid+", message=empty temp file");
RDebugUtils.currentLine=24903711;
 //BA.debugLineNum = 24903711;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=24903712;
 //BA.debugLineNum = 24903712;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=24903714;
 //BA.debugLineNum = 24903714;BA.debugLine="Dim replaceStartedAt As Long = DateTime.Now";
_replacestartedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=24903715;
 //BA.debugLineNum = 24903715;BA.debugLine="If ReplaceCacheFile(GetTracksDir, tempFileName,";
if (true) break;

case 33:
//if
this.state = 36;
if (__ref._replacecachefile /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_tempfilename,__ref._buildtrackcachefilename /*String*/ (null,_trackid))==parent.__c.False) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=24903716;
 //BA.debugLineNum = 24903716;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=24903717;
 //BA.debugLineNum = 24903717;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
__ref._trace /*String*/ (null,"Не удалось сохранить трек в кэш. id="+_trackid+", message=rename failed");
RDebugUtils.currentLine=24903718;
 //BA.debugLineNum = 24903718;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=24903719;
 //BA.debugLineNum = 24903719;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 36:
//C
this.state = 39;
;
RDebugUtils.currentLine=24903721;
 //BA.debugLineNum = 24903721;BA.debugLine="Trace(\"Финализация файла трека завершена. id=\"";
__ref._trace /*String*/ (null,"Финализация файла трека завершена. id="+_trackid+", elapsedMs="+BA.NumberToString(__ref._elapsedms /*long*/ (null,_replacestartedat)));
RDebugUtils.currentLine=24903722;
 //BA.debugLineNum = 24903722;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_trackindex);
RDebugUtils.currentLine=24903723;
 //BA.debugLineNum = 24903723;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=24903724;
 //BA.debugLineNum = 24903724;BA.debugLine="recentMediaNetworkFailure = False";
__ref._recentmedianetworkfailure /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=24903725;
 //BA.debugLineNum = 24903725;BA.debugLine="Trace(\"Трек сохранен в кэш. id=\" & trackId & \",";
__ref._trace /*String*/ (null,"Трек сохранен в кэш. id="+_trackid+", totalElapsedMs="+BA.NumberToString(__ref._elapsedms /*long*/ (null,_downloadstartedat)));
RDebugUtils.currentLine=24903726;
 //BA.debugLineNum = 24903726;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=24903727;
 //BA.debugLineNum = 24903727;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 38:
//C
this.state = 39;
this.catchState = 0;
RDebugUtils.currentLine=24903729;
 //BA.debugLineNum = 24903729;BA.debugLine="DeleteFileIfExists(GetTracksDir, BuildTempCache";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),__ref._buildtempcachefilename /*String*/ (null,_trackid));
RDebugUtils.currentLine=24903730;
 //BA.debugLineNum = 24903730;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
__ref._trace /*String*/ (null,"Не удалось сохранить трек в кэш. id="+_trackid+", message="+parent.__c.LastException(ba).getMessage());
 if (true) break;
if (true) break;

case 39:
//C
this.state = 48;
this.catchState = 0;
;
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=24903733;
 //BA.debugLineNum = 24903733;BA.debugLine="If IsMediaNetworkFailure(j.ErrorMessage) Then re";
if (true) break;

case 42:
//if
this.state = 47;
if (__ref._ismedianetworkfailure /*boolean*/ (null,_j._errormessage /*String*/ )) { 
this.state = 44;
;}if (true) break;

case 44:
//C
this.state = 47;
__ref._recentmedianetworkfailure /*boolean*/  = parent.__c.True;
if (true) break;

case 47:
//C
this.state = 48;
;
RDebugUtils.currentLine=24903734;
 //BA.debugLineNum = 24903734;BA.debugLine="Trace(\"Не удалось скачать трек. id=\" & trackId &";
__ref._trace /*String*/ (null,"Не удалось скачать трек. id="+_trackid+", message="+_j._errormessage /*String*/ );
 if (true) break;

case 48:
//C
this.state = -1;
;
RDebugUtils.currentLine=24903736;
 //BA.debugLineNum = 24903736;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=24903737;
 //BA.debugLineNum = 24903737;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=24903738;
 //BA.debugLineNum = 24903738;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Private Sub UpdateTrackIndex(item As Map, trackInd";
RDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=25034755;
 //BA.debugLineNum = 25034755;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=25034756;
 //BA.debugLineNum = 25034756;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=25034757;
 //BA.debugLineNum = 25034757;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=25034758;
 //BA.debugLineNum = 25034758;BA.debugLine="entry.Put(\"file_name\", BuildTrackCacheFileName(tr";
_entry.Put((Object)("file_name"),(Object)(__ref._buildtrackcachefilename /*String*/ (null,_trackid)));
RDebugUtils.currentLine=25034759;
 //BA.debugLineNum = 25034759;BA.debugLine="entry.Put(\"title\", item.GetDefault(\"title\", \"\"))";
_entry.Put((Object)("title"),_item.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=25034760;
 //BA.debugLineNum = 25034760;BA.debugLine="entry.Put(\"set\", item.GetDefault(\"set\", \"\"))";
_entry.Put((Object)("set"),_item.GetDefault((Object)("set"),(Object)("")));
RDebugUtils.currentLine=25034761;
 //BA.debugLineNum = 25034761;BA.debugLine="entry.Put(\"stream\", item.GetDefault(\"stream\", \"\")";
_entry.Put((Object)("stream"),_item.GetDefault((Object)("stream"),(Object)("")));
RDebugUtils.currentLine=25034762;
 //BA.debugLineNum = 25034762;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=25034763;
 //BA.debugLineNum = 25034763;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=25034764;
 //BA.debugLineNum = 25034764;BA.debugLine="entry.Put(\"gain\", item.GetDefault(\"gain\", 0))";
_entry.Put((Object)("gain"),_item.GetDefault((Object)("gain"),(Object)(0)));
RDebugUtils.currentLine=25034765;
 //BA.debugLineNum = 25034765;BA.debugLine="trackIndex.Put(trackId, entry)";
_trackindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=25034766;
 //BA.debugLineNum = 25034766;BA.debugLine="End Sub";
return "";
}
public String  _gettracksdir(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "gettracksdir", false))
	 {return ((String) Debug.delegate(ba, "gettracksdir", null));}
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Public Sub GetTracksDir As String";
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
if (true) return __c.File.Combine(__c.File.Combine(__ref._storagedir /*String*/ ,__ref._mediadirname /*String*/ ),__ref._tracksdirname /*String*/ );
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=56164352;
 //BA.debugLineNum = 56164352;BA.debugLine="Private Sub TransformStreamWithXor(inputStream As";
RDebugUtils.currentLine=56164353;
 //BA.debugLineNum = 56164353;BA.debugLine="If keyBytes.Length = 0 Then";
if (_keybytes.length==0) { 
RDebugUtils.currentLine=56164354;
 //BA.debugLineNum = 56164354;BA.debugLine="File.Copy2(inputStream, outputStream)";
__c.File.Copy2((java.io.InputStream)(_inputstream.getObject()),(java.io.OutputStream)(_outputstream.getObject()));
RDebugUtils.currentLine=56164355;
 //BA.debugLineNum = 56164355;BA.debugLine="outputStream.Flush";
_outputstream.Flush();
RDebugUtils.currentLine=56164356;
 //BA.debugLineNum = 56164356;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=56164358;
 //BA.debugLineNum = 56164358;BA.debugLine="Dim buffer(STREAM_XOR_BUFFER_SIZE) As Byte";
_buffer = new byte[__ref._stream_xor_buffer_size /*int*/ ];
;
RDebugUtils.currentLine=56164359;
 //BA.debugLineNum = 56164359;BA.debugLine="Dim totalProcessed As Long = 0";
_totalprocessed = (long) (0);
RDebugUtils.currentLine=56164360;
 //BA.debugLineNum = 56164360;BA.debugLine="Do While True";
while (__c.True) {
RDebugUtils.currentLine=56164361;
 //BA.debugLineNum = 56164361;BA.debugLine="Dim count As Int = inputStream.ReadBytes(buffer,";
_count = _inputstream.ReadBytes(_buffer,(int) (0),_buffer.length);
RDebugUtils.currentLine=56164362;
 //BA.debugLineNum = 56164362;BA.debugLine="If count <= 0 Then Exit";
if (_count<=0) { 
if (true) break;};
RDebugUtils.currentLine=56164363;
 //BA.debugLineNum = 56164363;BA.debugLine="ApplyXorToBuffer(buffer, count, keyBytes, totalP";
__ref._applyxortobuffer /*String*/ (null,_buffer,_count,_keybytes,_totalprocessed);
RDebugUtils.currentLine=56164364;
 //BA.debugLineNum = 56164364;BA.debugLine="outputStream.WriteBytes(buffer, 0, count)";
_outputstream.WriteBytes(_buffer,(int) (0),_count);
RDebugUtils.currentLine=56164365;
 //BA.debugLineNum = 56164365;BA.debugLine="totalProcessed = totalProcessed + count";
_totalprocessed = (long) (_totalprocessed+_count);
 }
;
RDebugUtils.currentLine=56164367;
 //BA.debugLineNum = 56164367;BA.debugLine="outputStream.Flush";
_outputstream.Flush();
RDebugUtils.currentLine=56164368;
 //BA.debugLineNum = 56164368;BA.debugLine="End Sub";
return "";
}
public String  _savetrackindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "savetrackindex", false))
	 {return ((String) Debug.delegate(ba, "savetrackindex", null));}
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Private Sub SaveTrackIndex";
RDebugUtils.currentLine=25427969;
 //BA.debugLineNum = 25427969;BA.debugLine="storage.Put(\"cached_track_index\", cachedTrackInde";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_track_index",(Object)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="storage.Put(\"cached_track_count\", cachedTrackInde";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_track_count",(Object)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=25427971;
 //BA.debugLineNum = 25427971;BA.debugLine="End Sub";
return "";
}
public boolean  _ensuretrackplaybacktemp(b4j.example.mediacache __ref,String _audiokey,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuretrackplaybacktemp", false))
	 {return ((Boolean) Debug.delegate(ba, "ensuretrackplaybacktemp", new Object[] {_audiokey,_trackid}));}
String _tempfilename = "";
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outputstream = null;
RDebugUtils.currentLine=55246848;
 //BA.debugLineNum = 55246848;BA.debugLine="Private Sub EnsureTrackPlaybackTemp(audioKey As St";
RDebugUtils.currentLine=55246849;
 //BA.debugLineNum = 55246849;BA.debugLine="Dim tempFileName As String = BuildPlaybackTempTra";
_tempfilename = __ref._buildplaybacktemptrackfilename /*String*/ (null,_audiokey);
RDebugUtils.currentLine=55246850;
 //BA.debugLineNum = 55246850;BA.debugLine="If playbackTempTrackIds.GetDefault(audioKey, \"\")";
if ((__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_audiokey),(Object)(""))).equals((Object)(_trackid)) && __ref._iscachedfileusable /*boolean*/ (null,__c.File.getDirTemp(),_tempfilename)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=55246851;
 //BA.debugLineNum = 55246851;BA.debugLine="DeleteFileIfExists(File.DirTemp, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__c.File.getDirTemp(),_tempfilename);
RDebugUtils.currentLine=55246852;
 //BA.debugLineNum = 55246852;BA.debugLine="Try";
try {RDebugUtils.currentLine=55246853;
 //BA.debugLineNum = 55246853;BA.debugLine="Dim inputStream As InputStream = File.OpenInput(";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_inputstream = __c.File.OpenInput(__ref._gettracksdir /*String*/ (null),__ref._resolvetrackcachefilename /*String*/ (null,_trackid,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ));
RDebugUtils.currentLine=55246854;
 //BA.debugLineNum = 55246854;BA.debugLine="Dim outputStream As OutputStream = File.OpenOutp";
_outputstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outputstream = __c.File.OpenOutput(__c.File.getDirTemp(),_tempfilename,__c.False);
RDebugUtils.currentLine=55246855;
 //BA.debugLineNum = 55246855;BA.debugLine="TransformStreamWithXor(inputStream, outputStream";
__ref._transformstreamwithxor /*String*/ (null,_inputstream,_outputstream,__ref._buildtrackobfuscationkey /*byte[]*/ (null,_trackid));
RDebugUtils.currentLine=55246856;
 //BA.debugLineNum = 55246856;BA.debugLine="outputStream.Close";
_outputstream.Close();
RDebugUtils.currentLine=55246857;
 //BA.debugLineNum = 55246857;BA.debugLine="inputStream.Close";
_inputstream.Close();
RDebugUtils.currentLine=55246858;
 //BA.debugLineNum = 55246858;BA.debugLine="playbackTempTrackIds.Put(audioKey, trackId)";
__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_audiokey),(Object)(_trackid));
RDebugUtils.currentLine=55246859;
 //BA.debugLineNum = 55246859;BA.debugLine="Return IsCachedFileUsable(File.DirTemp, tempFile";
if (true) return __ref._iscachedfileusable /*boolean*/ (null,__c.File.getDirTemp(),_tempfilename);
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=55246861;
 //BA.debugLineNum = 55246861;BA.debugLine="DeleteFileIfExists(File.DirTemp, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__c.File.getDirTemp(),_tempfilename);
RDebugUtils.currentLine=55246862;
 //BA.debugLineNum = 55246862;BA.debugLine="Trace(\"Не удалось подготовить временный файл тре";
__ref._trace /*String*/ (null,"Не удалось подготовить временный файл трека. id="+_trackid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=55246864;
 //BA.debugLineNum = 55246864;BA.debugLine="playbackTempTrackIds.Remove(audioKey)";
__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_audiokey));
RDebugUtils.currentLine=55246865;
 //BA.debugLineNum = 55246865;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=55246866;
 //BA.debugLineNum = 55246866;BA.debugLine="End Sub";
return false;
}
public String  _resolvetrackcachefilename(b4j.example.mediacache __ref,String _trackid,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvetrackcachefilename", false))
	 {return ((String) Debug.delegate(ba, "resolvetrackcachefilename", new Object[] {_trackid,_trackindex}));}
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _filename = "";
RDebugUtils.currentLine=55640064;
 //BA.debugLineNum = 55640064;BA.debugLine="Private Sub ResolveTrackCacheFileName(trackId As S";
RDebugUtils.currentLine=55640065;
 //BA.debugLineNum = 55640065;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=55640066;
 //BA.debugLineNum = 55640066;BA.debugLine="If entry.IsInitialized Then";
if (_entry.IsInitialized()) { 
RDebugUtils.currentLine=55640067;
 //BA.debugLineNum = 55640067;BA.debugLine="Dim fileName As String = entry.GetDefault(\"file_";
_filename = BA.ObjectToString(_entry.GetDefault((Object)("file_name"),(Object)("")));
RDebugUtils.currentLine=55640068;
 //BA.debugLineNum = 55640068;BA.debugLine="If fileName <> \"\" Then Return fileName";
if ((_filename).equals("") == false) { 
if (true) return _filename;};
 };
RDebugUtils.currentLine=55640070;
 //BA.debugLineNum = 55640070;BA.debugLine="Return BuildTrackCacheFileName(trackId)";
if (true) return __ref._buildtrackcachefilename /*String*/ (null,_trackid);
RDebugUtils.currentLine=55640071;
 //BA.debugLineNum = 55640071;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedtrackindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedtrackindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedtrackindex", null));}
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Private Sub GetCachedTrackIndex As Map";
RDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="cachedTrackIndex.Initialize";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=25165828;
 //BA.debugLineNum = 25165828;BA.debugLine="Return cachedTrackIndex";
if (true) return __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=25165829;
 //BA.debugLineNum = 25165829;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Private Sub FinalizeCurrentCacheAuditType";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = __ref._getauditdirbytype /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = __ref._getauditindexbytype /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=26673155;
 //BA.debugLineNum = 26673155;BA.debugLine="Dim keysCopy As List";
_keyscopy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=26673156;
 //BA.debugLineNum = 26673156;BA.debugLine="keysCopy.Initialize";
_keyscopy.Initialize();
RDebugUtils.currentLine=26673157;
 //BA.debugLineNum = 26673157;BA.debugLine="For Each key As String In auditIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _auditindex.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=26673158;
 //BA.debugLineNum = 26673158;BA.debugLine="keysCopy.Add(key)";
_keyscopy.Add((Object)(_key));
 }
};
RDebugUtils.currentLine=26673160;
 //BA.debugLineNum = 26673160;BA.debugLine="For Each key As String In keysCopy";
{
final anywheresoftware.b4a.BA.IterableList group8 = _keyscopy;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=26673161;
 //BA.debugLineNum = 26673161;BA.debugLine="If cacheAuditSeenIds.ContainsKey(key) = False Th";
if (__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))==__c.False) { 
RDebugUtils.currentLine=26673162;
 //BA.debugLineNum = 26673162;BA.debugLine="Dim fileName As String = ResolveIndexedAuditFil";
_filename = __ref._resolveindexedauditfilename /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ ,_key,_auditindex);
RDebugUtils.currentLine=26673163;
 //BA.debugLineNum = 26673163;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)) { 
RDebugUtils.currentLine=26673164;
 //BA.debugLineNum = 26673164;BA.debugLine="cacheAuditSeenIds.Put(key, True)";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(__c.True));
RDebugUtils.currentLine=26673165;
 //BA.debugLineNum = 26673165;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=26673167;
 //BA.debugLineNum = 26673167;BA.debugLine="auditIndex.Remove(key)";
_auditindex.Remove((Object)(_key));
RDebugUtils.currentLine=26673168;
 //BA.debugLineNum = 26673168;BA.debugLine="cacheAuditRemovedCount = cacheAuditRemovedCount";
__ref._cacheauditremovedcount /*int*/  = (int) (__ref._cacheauditremovedcount /*int*/ +1);
RDebugUtils.currentLine=26673169;
 //BA.debugLineNum = 26673169;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
__ref._markauditindexchanged /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
 };
 }
};
RDebugUtils.currentLine=26673172;
 //BA.debugLineNum = 26673172;BA.debugLine="Trace(\"Аудит кэша: каталог обработан. type=\" & ca";
__ref._trace /*String*/ (null,"Аудит кэша: каталог обработан. type="+__ref._cacheauditcurrenttype /*String*/ +", seen="+BA.NumberToString(__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=26673173;
 //BA.debugLineNum = 26673173;BA.debugLine="End Sub";
return "";
}
public String  _getauditdirbytype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getauditdirbytype", false))
	 {return ((String) Debug.delegate(ba, "getauditdirbytype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Private Sub GetAuditDirByType(itemType As String)";
RDebugUtils.currentLine=26804225;
 //BA.debugLineNum = 26804225;BA.debugLine="If itemType = \"ads\" Then Return GetAdsDir";
if ((_itemtype).equals("ads")) { 
if (true) return __ref._getadsdir /*String*/ (null);};
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="Return GetTracksDir";
if (true) return __ref._gettracksdir /*String*/ (null);
RDebugUtils.currentLine=26804227;
 //BA.debugLineNum = 26804227;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getauditindexbytype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getauditindexbytype", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getauditindexbytype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Private Sub GetAuditIndexByType(itemType As String";
RDebugUtils.currentLine=26869761;
 //BA.debugLineNum = 26869761;BA.debugLine="If itemType = \"ads\" Then Return cachedAdIndex";
if ((_itemtype).equals("ads")) { 
if (true) return __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=26869762;
 //BA.debugLineNum = 26869762;BA.debugLine="Return cachedTrackIndex";
if (true) return __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=26869763;
 //BA.debugLineNum = 26869763;BA.debugLine="End Sub";
return null;
}
public String  _resolveindexedauditfilename(b4j.example.mediacache __ref,String _audittype,String _itemid,anywheresoftware.b4a.objects.collections.Map _auditindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveindexedauditfilename", false))
	 {return ((String) Debug.delegate(ba, "resolveindexedauditfilename", new Object[] {_audittype,_itemid,_auditindex}));}
RDebugUtils.currentLine=55705600;
 //BA.debugLineNum = 55705600;BA.debugLine="Private Sub ResolveIndexedAuditFileName(auditType";
RDebugUtils.currentLine=55705601;
 //BA.debugLineNum = 55705601;BA.debugLine="If auditType = \"ads\" Then Return itemId";
if ((_audittype).equals("ads")) { 
if (true) return _itemid;};
RDebugUtils.currentLine=55705602;
 //BA.debugLineNum = 55705602;BA.debugLine="Return ResolveTrackCacheFileName(itemId, auditInd";
if (true) return __ref._resolvetrackcachefilename /*String*/ (null,_itemid,_auditindex);
RDebugUtils.currentLine=55705603;
 //BA.debugLineNum = 55705603;BA.debugLine="End Sub";
return "";
}
public String  _findtrackidbyfilename(b4j.example.mediacache __ref,String _filename,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "findtrackidbyfilename", false))
	 {return ((String) Debug.delegate(ba, "findtrackidbyfilename", new Object[] {_filename,_trackindex}));}
String _key = "";
RDebugUtils.currentLine=55771136;
 //BA.debugLineNum = 55771136;BA.debugLine="Private Sub FindTrackIdByFileName(fileName As Stri";
RDebugUtils.currentLine=55771137;
 //BA.debugLineNum = 55771137;BA.debugLine="For Each key As String In trackIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _trackindex.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=55771138;
 //BA.debugLineNum = 55771138;BA.debugLine="If ResolveTrackCacheFileName(key, trackIndex) =";
if ((__ref._resolvetrackcachefilename /*String*/ (null,_key,_trackindex)).equals(_filename)) { 
if (true) return _key;};
 }
};
RDebugUtils.currentLine=55771140;
 //BA.debugLineNum = 55771140;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=55771141;
 //BA.debugLineNum = 55771141;BA.debugLine="End Sub";
return "";
}
public String  _finishcacheaudit(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "finishcacheaudit", false))
	 {return ((String) Debug.delegate(ba, "finishcacheaudit", null));}
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Private Sub FinishCacheAudit";
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="If cacheAuditAdIndexChanged Then SaveAdIndex";
if (__ref._cacheauditadindexchanged /*boolean*/ ) { 
__ref._saveadindex /*String*/ (null);};
RDebugUtils.currentLine=26738690;
 //BA.debugLineNum = 26738690;BA.debugLine="If cacheAuditTrackIndexChanged Then SaveTrackInde";
if (__ref._cacheaudittrackindexchanged /*boolean*/ ) { 
__ref._savetrackindex /*String*/ (null);};
RDebugUtils.currentLine=26738691;
 //BA.debugLineNum = 26738691;BA.debugLine="cacheAuditInProgress = False";
__ref._cacheauditinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=26738692;
 //BA.debugLineNum = 26738692;BA.debugLine="cacheAuditCurrentType = \"\"";
__ref._cacheauditcurrenttype /*String*/  = "";
RDebugUtils.currentLine=26738693;
 //BA.debugLineNum = 26738693;BA.debugLine="Trace(\"Аудит кэша завершен. added=\" & cacheAuditA";
__ref._trace /*String*/ (null,"Аудит кэша завершен. added="+BA.NumberToString(__ref._cacheauditaddedcount /*int*/ )+", removed="+BA.NumberToString(__ref._cacheauditremovedcount /*int*/ )+", tempDeleted="+BA.NumberToString(__ref._cacheaudittempdeletedcount /*int*/ )+", ads="+BA.NumberToString(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize())+", tracks="+BA.NumberToString(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=26738694;
 //BA.debugLineNum = 26738694;BA.debugLine="End Sub";
return "";
}
public String  _getdirbyitemtype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getdirbyitemtype", false))
	 {return ((String) Debug.delegate(ba, "getdirbyitemtype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Private Sub GetDirByItemType(itemType As String) A";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="If itemType = \"ad\" Then Return GetAdsDir";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._getadsdir /*String*/ (null);};
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="Return GetTracksDir";
if (true) return __ref._gettracksdir /*String*/ (null);
RDebugUtils.currentLine=26214403;
 //BA.debugLineNum = 26214403;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getindexbyitemtype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getindexbyitemtype", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getindexbyitemtype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Private Sub GetIndexByItemType(itemType As String)";
RDebugUtils.currentLine=26148865;
 //BA.debugLineNum = 26148865;BA.debugLine="If itemType = \"ad\" Then Return cachedAdIndex";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="Return cachedTrackIndex";
if (true) return __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=26148867;
 //BA.debugLineNum = 26148867;BA.debugLine="End Sub";
return null;
}
public boolean  _validateindexedfile(b4j.example.mediacache __ref,String _itemtype,String _itemid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "validateindexedfile", false))
	 {return ((Boolean) Debug.delegate(ba, "validateindexedfile", new Object[] {_itemtype,_itemid}));}
anywheresoftware.b4a.objects.collections.Map _auditindex = null;
String _auditdir = "";
String _filename = "";
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Private Sub ValidateIndexedFile(itemType As String";
RDebugUtils.currentLine=25952257;
 //BA.debugLineNum = 25952257;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="Dim auditIndex As Map = GetIndexByItemType(itemTy";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = __ref._getindexbyitemtype /*anywheresoftware.b4a.objects.collections.Map*/ (null,_itemtype);
RDebugUtils.currentLine=25952259;
 //BA.debugLineNum = 25952259;BA.debugLine="Dim auditDir As String = GetDirByItemType(itemTyp";
_auditdir = __ref._getdirbyitemtype /*String*/ (null,_itemtype);
RDebugUtils.currentLine=25952260;
 //BA.debugLineNum = 25952260;BA.debugLine="Dim fileName As String = ResolveIndexedFileName(i";
_filename = __ref._resolveindexedfilename /*String*/ (null,_itemtype,_itemid,_auditindex);
RDebugUtils.currentLine=25952261;
 //BA.debugLineNum = 25952261;BA.debugLine="If auditIndex.ContainsKey(itemId) = False Then";
if (_auditindex.ContainsKey((Object)(_itemid))==__c.False) { 
RDebugUtils.currentLine=25952262;
 //BA.debugLineNum = 25952262;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=25952263;
 //BA.debugLineNum = 25952263;BA.debugLine="RestoreIndexedFileById(itemId, auditIndex)";
__ref._restoreindexedfilebyid /*String*/ (null,_itemid,_auditindex);
RDebugUtils.currentLine=25952264;
 //BA.debugLineNum = 25952264;BA.debugLine="SaveIndexByItemType(itemType)";
__ref._saveindexbyitemtype /*String*/ (null,_itemtype);
RDebugUtils.currentLine=25952265;
 //BA.debugLineNum = 25952265;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=25952267;
 //BA.debugLineNum = 25952267;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then Re";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=25952268;
 //BA.debugLineNum = 25952268;BA.debugLine="auditIndex.Remove(itemId)";
_auditindex.Remove((Object)(_itemid));
RDebugUtils.currentLine=25952269;
 //BA.debugLineNum = 25952269;BA.debugLine="SaveIndexByItemType(itemType)";
__ref._saveindexbyitemtype /*String*/ (null,_itemtype);
RDebugUtils.currentLine=25952270;
 //BA.debugLineNum = 25952270;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=25952271;
 //BA.debugLineNum = 25952271;BA.debugLine="End Sub";
return false;
}
public String  _loadindexesfromstorage(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "loadindexesfromstorage", false))
	 {return ((String) Debug.delegate(ba, "loadindexesfromstorage", null));}
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Private Sub LoadIndexesFromStorage";
RDebugUtils.currentLine=25296897;
 //BA.debugLineNum = 25296897;BA.debugLine="cachedAdIndex = storage.GetDefault(\"cached_ad_ind";
__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_ad_index",__c.Null)));
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="If cachedAdIndex.IsInitialized = False Then cache";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=25296899;
 //BA.debugLineNum = 25296899;BA.debugLine="cachedTrackIndex = storage.GetDefault(\"cached_tra";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_track_index",__c.Null)));
RDebugUtils.currentLine=25296900;
 //BA.debugLineNum = 25296900;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=25296901;
 //BA.debugLineNum = 25296901;BA.debugLine="End Sub";
return "";
}
public boolean  _preparenextcacheaudittype(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "preparenextcacheaudittype", false))
	 {return ((Boolean) Debug.delegate(ba, "preparenextcacheaudittype", null));}
String _auditdir = "";
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
String _filename = "";
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Private Sub PrepareNextCacheAuditType As Boolean";
RDebugUtils.currentLine=26542081;
 //BA.debugLineNum = 26542081;BA.debugLine="If cacheAuditPendingTypes.IsInitialized = False O";
if (__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="cacheAuditCurrentType = cacheAuditPendingTypes.Ge";
__ref._cacheauditcurrenttype /*String*/  = BA.ObjectToString(__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=26542083;
 //BA.debugLineNum = 26542083;BA.debugLine="cacheAuditPendingTypes.RemoveAt(0)";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=26542084;
 //BA.debugLineNum = 26542084;BA.debugLine="cacheAuditCurrentPosition = 0";
__ref._cacheauditcurrentposition /*int*/  = (int) (0);
RDebugUtils.currentLine=26542085;
 //BA.debugLineNum = 26542085;BA.debugLine="cacheAuditSeenIds.Initialize";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=26542086;
 //BA.debugLineNum = 26542086;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=26542087;
 //BA.debugLineNum = 26542087;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = __ref._getauditdirbytype /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=26542088;
 //BA.debugLineNum = 26542088;BA.debugLine="Try";
try {RDebugUtils.currentLine=26542089;
 //BA.debugLineNum = 26542089;BA.debugLine="If File.Exists(auditDir, \"\") Then";
if (__c.File.Exists(_auditdir,"")) { 
RDebugUtils.currentLine=26542090;
 //BA.debugLineNum = 26542090;BA.debugLine="Dim listedFiles As List = File.ListFiles(auditD";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(_auditdir);
RDebugUtils.currentLine=26542091;
 //BA.debugLineNum = 26542091;BA.debugLine="If listedFiles.IsInitialized Then";
if (_listedfiles.IsInitialized()) { 
RDebugUtils.currentLine=26542092;
 //BA.debugLineNum = 26542092;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group12 = _listedfiles;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_filename = BA.ObjectToString(group12.Get(index12));
RDebugUtils.currentLine=26542093;
 //BA.debugLineNum = 26542093;BA.debugLine="cacheAuditCurrentFileNames.Add(fileName)";
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_filename));
 }
};
 };
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=26542098;
 //BA.debugLineNum = 26542098;BA.debugLine="Trace(\"Не удалось получить список файлов для ауд";
__ref._trace /*String*/ (null,"Не удалось получить список файлов для аудита кэша. type="+__ref._cacheauditcurrenttype /*String*/ +", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=26542100;
 //BA.debugLineNum = 26542100;BA.debugLine="Trace(\"Аудит кэша: подготовлен каталог. type=\" &";
__ref._trace /*String*/ (null,"Аудит кэша: подготовлен каталог. type="+__ref._cacheauditcurrenttype /*String*/ +", files="+BA.NumberToString(__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=26542101;
 //BA.debugLineNum = 26542101;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=26542102;
 //BA.debugLineNum = 26542102;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Private Sub ProcessCurrentCacheAuditBatch";
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = __ref._getauditdirbytype /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = __ref._getauditindexbytype /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=26607619;
 //BA.debugLineNum = 26607619;BA.debugLine="For i = 1 To CACHE_AUDIT_BATCH_SIZE";
{
final int step3 = 1;
final int limit3 = __ref._cache_audit_batch_size /*int*/ ;
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=26607620;
 //BA.debugLineNum = 26607620;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurren";
if (__ref._cacheauditcurrentposition /*int*/ >=__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
if (true) break;};
RDebugUtils.currentLine=26607621;
 //BA.debugLineNum = 26607621;BA.debugLine="Dim fileName As String = cacheAuditCurrentFileNa";
_filename = BA.ObjectToString(__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._cacheauditcurrentposition /*int*/ ));
RDebugUtils.currentLine=26607622;
 //BA.debugLineNum = 26607622;BA.debugLine="cacheAuditCurrentPosition = cacheAuditCurrentPos";
__ref._cacheauditcurrentposition /*int*/  = (int) (__ref._cacheauditcurrentposition /*int*/ +1);
RDebugUtils.currentLine=26607623;
 //BA.debugLineNum = 26607623;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=26607624;
 //BA.debugLineNum = 26607624;BA.debugLine="If fileName.EndsWith(\".tmp\") Then";
if (_filename.endsWith(".tmp")) { 
RDebugUtils.currentLine=26607625;
 //BA.debugLineNum = 26607625;BA.debugLine="DeleteFileIfExists(auditDir, fileName)";
__ref._deletefileifexists /*String*/ (null,_auditdir,_filename);
RDebugUtils.currentLine=26607626;
 //BA.debugLineNum = 26607626;BA.debugLine="cacheAuditTempDeletedCount = cacheAuditTempDele";
__ref._cacheaudittempdeletedcount /*int*/  = (int) (__ref._cacheaudittempdeletedcount /*int*/ +1);
RDebugUtils.currentLine=26607627;
 //BA.debugLineNum = 26607627;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
__ref._markauditindexchanged /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=26607628;
 //BA.debugLineNum = 26607628;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=26607630;
 //BA.debugLineNum = 26607630;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=26607631;
 //BA.debugLineNum = 26607631;BA.debugLine="If cacheAuditCurrentType = \"tracks\" Then";
if ((__ref._cacheauditcurrenttype /*String*/ ).equals("tracks")) { 
RDebugUtils.currentLine=26607632;
 //BA.debugLineNum = 26607632;BA.debugLine="Dim trackId As String = FindTrackIdByFileName(f";
_trackid = __ref._findtrackidbyfilename /*String*/ (null,_filename,_auditindex);
RDebugUtils.currentLine=26607633;
 //BA.debugLineNum = 26607633;BA.debugLine="If trackId = \"\" Then";
if ((_trackid).equals("")) { 
RDebugUtils.currentLine=26607634;
 //BA.debugLineNum = 26607634;BA.debugLine="DeleteFileIfExists(auditDir, fileName)";
__ref._deletefileifexists /*String*/ (null,_auditdir,_filename);
RDebugUtils.currentLine=26607635;
 //BA.debugLineNum = 26607635;BA.debugLine="cacheAuditRemovedCount = cacheAuditRemovedCoun";
__ref._cacheauditremovedcount /*int*/  = (int) (__ref._cacheauditremovedcount /*int*/ +1);
RDebugUtils.currentLine=26607636;
 //BA.debugLineNum = 26607636;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
__ref._markauditindexchanged /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=26607637;
 //BA.debugLineNum = 26607637;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=26607639;
 //BA.debugLineNum = 26607639;BA.debugLine="cacheAuditSeenIds.Put(trackId, True)";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_trackid),(Object)(__c.True));
 }else {
RDebugUtils.currentLine=26607641;
 //BA.debugLineNum = 26607641;BA.debugLine="cacheAuditSeenIds.Put(fileName, True)";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_filename),(Object)(__c.True));
RDebugUtils.currentLine=26607642;
 //BA.debugLineNum = 26607642;BA.debugLine="If auditIndex.ContainsKey(fileName) = False The";
if (_auditindex.ContainsKey((Object)(_filename))==__c.False) { 
RDebugUtils.currentLine=26607643;
 //BA.debugLineNum = 26607643;BA.debugLine="AddIndexedFileFromAudit(cacheAuditCurrentType,";
__ref._addindexedfilefromaudit /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ ,_filename,_auditindex);
RDebugUtils.currentLine=26607644;
 //BA.debugLineNum = 26607644;BA.debugLine="cacheAuditAddedCount = cacheAuditAddedCount +";
__ref._cacheauditaddedcount /*int*/  = (int) (__ref._cacheauditaddedcount /*int*/ +1);
 };
 };
 }
};
RDebugUtils.currentLine=26607648;
 //BA.debugLineNum = 26607648;BA.debugLine="End Sub";
return "";
}
public String  _resolveindexedfilename(b4j.example.mediacache __ref,String _itemtype,String _itemid,anywheresoftware.b4a.objects.collections.Map _itemindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveindexedfilename", false))
	 {return ((String) Debug.delegate(ba, "resolveindexedfilename", new Object[] {_itemtype,_itemid,_itemindex}));}
RDebugUtils.currentLine=55574528;
 //BA.debugLineNum = 55574528;BA.debugLine="Private Sub ResolveIndexedFileName(itemType As Str";
RDebugUtils.currentLine=55574529;
 //BA.debugLineNum = 55574529;BA.debugLine="If itemType = \"ad\" Then Return itemId";
if ((_itemtype).equals("ad")) { 
if (true) return _itemid;};
RDebugUtils.currentLine=55574530;
 //BA.debugLineNum = 55574530;BA.debugLine="Return ResolveTrackCacheFileName(itemId, itemInde";
if (true) return __ref._resolvetrackcachefilename /*String*/ (null,_itemid,_itemindex);
RDebugUtils.currentLine=55574531;
 //BA.debugLineNum = 55574531;BA.debugLine="End Sub";
return "";
}
public String  _restoreindexedfilebyid(b4j.example.mediacache __ref,String _itemid,anywheresoftware.b4a.objects.collections.Map _itemindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "restoreindexedfilebyid", false))
	 {return ((String) Debug.delegate(ba, "restoreindexedfilebyid", new Object[] {_itemid,_itemindex}));}
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Private Sub RestoreIndexedFileById(itemId As Strin";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="Dim entry As Map = itemIndex.GetDefault(itemId, N";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemindex.GetDefault((Object)(_itemid),__c.Null)));
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=26017795;
 //BA.debugLineNum = 26017795;BA.debugLine="entry.Put(\"id\", itemId)";
_entry.Put((Object)("id"),(Object)(_itemid));
RDebugUtils.currentLine=26017796;
 //BA.debugLineNum = 26017796;BA.debugLine="entry.Put(\"file_name\", BuildTrackCacheFileName(it";
_entry.Put((Object)("file_name"),(Object)(__ref._buildtrackcachefilename /*String*/ (null,_itemid)));
RDebugUtils.currentLine=26017797;
 //BA.debugLineNum = 26017797;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=26017798;
 //BA.debugLineNum = 26017798;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=26017799;
 //BA.debugLineNum = 26017799;BA.debugLine="itemIndex.Put(itemId, entry)";
_itemindex.Put((Object)(_itemid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=26017800;
 //BA.debugLineNum = 26017800;BA.debugLine="End Sub";
return "";
}
public String  _saveindexbyitemtype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "saveindexbyitemtype", false))
	 {return ((String) Debug.delegate(ba, "saveindexbyitemtype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Private Sub SaveIndexByItemType(itemType As String";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
 }else {
RDebugUtils.currentLine=26279940;
 //BA.debugLineNum = 26279940;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
 };
RDebugUtils.currentLine=26279942;
 //BA.debugLineNum = 26279942;BA.debugLine="End Sub";
return "";
}
}