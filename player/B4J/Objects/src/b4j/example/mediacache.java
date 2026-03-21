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
public anywheresoftware.b4a.objects.collections.Map _cachedadindex = null;
public anywheresoftware.b4a.objects.collections.Map _cachedtrackindex = null;
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
RDebugUtils.currentLine=42991616;
 //BA.debugLineNum = 42991616;BA.debugLine="Public Sub TouchCachedItem(item As Map)";
RDebugUtils.currentLine=42991617;
 //BA.debugLineNum = 42991617;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=42991618;
 //BA.debugLineNum = 42991618;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=42991619;
 //BA.debugLineNum = 42991619;BA.debugLine="If itemId = \"\" Then Return";
if ((_itemid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=42991620;
 //BA.debugLineNum = 42991620;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=42991621;
 //BA.debugLineNum = 42991621;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=42991622;
 //BA.debugLineNum = 42991622;BA.debugLine="If cachedAdIndex.ContainsKey(itemId) = False The";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_itemid))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=42991623;
 //BA.debugLineNum = 42991623;BA.debugLine="UpdateAdIndex(item, cachedAdIndex)";
__ref._updateadindex /*String*/ (null,_item,__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=42991624;
 //BA.debugLineNum = 42991624;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=42991626;
 //BA.debugLineNum = 42991626;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=42991627;
 //BA.debugLineNum = 42991627;BA.debugLine="If cachedTrackIndex.ContainsKey(itemId) = False";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_itemid))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=42991628;
 //BA.debugLineNum = 42991628;BA.debugLine="UpdateTrackIndex(item, cachedTrackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=42991630;
 //BA.debugLineNum = 42991630;BA.debugLine="End Sub";
return "";
}
public boolean  _iscacheauditinprogress(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "iscacheauditinprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "iscacheauditinprogress", null));}
RDebugUtils.currentLine=43450368;
 //BA.debugLineNum = 43450368;BA.debugLine="Public Sub IsCacheAuditInProgress As Boolean";
RDebugUtils.currentLine=43450369;
 //BA.debugLineNum = 43450369;BA.debugLine="Return cacheAuditInProgress";
if (true) return __ref._cacheauditinprogress /*boolean*/ ;
RDebugUtils.currentLine=43450370;
 //BA.debugLineNum = 43450370;BA.debugLine="End Sub";
return false;
}
public String  _startcacheaudit(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "startcacheaudit", false))
	 {return ((String) Debug.delegate(ba, "startcacheaudit", null));}
RDebugUtils.currentLine=43515904;
 //BA.debugLineNum = 43515904;BA.debugLine="Public Sub StartCacheAudit";
RDebugUtils.currentLine=43515905;
 //BA.debugLineNum = 43515905;BA.debugLine="If cacheAuditInProgress Then Return";
if (__ref._cacheauditinprogress /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=43515906;
 //BA.debugLineNum = 43515906;BA.debugLine="cacheAuditPendingTypes.Initialize";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=43515907;
 //BA.debugLineNum = 43515907;BA.debugLine="cacheAuditPendingTypes.Add(\"ads\")";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("ads"));
RDebugUtils.currentLine=43515908;
 //BA.debugLineNum = 43515908;BA.debugLine="cacheAuditPendingTypes.Add(\"tracks\")";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("tracks"));
RDebugUtils.currentLine=43515909;
 //BA.debugLineNum = 43515909;BA.debugLine="cacheAuditCurrentType = \"\"";
__ref._cacheauditcurrenttype /*String*/  = "";
RDebugUtils.currentLine=43515910;
 //BA.debugLineNum = 43515910;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=43515911;
 //BA.debugLineNum = 43515911;BA.debugLine="cacheAuditCurrentPosition = 0";
__ref._cacheauditcurrentposition /*int*/  = (int) (0);
RDebugUtils.currentLine=43515912;
 //BA.debugLineNum = 43515912;BA.debugLine="cacheAuditSeenIds.Initialize";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=43515913;
 //BA.debugLineNum = 43515913;BA.debugLine="cacheAuditAdIndexChanged = False";
__ref._cacheauditadindexchanged /*boolean*/  = __c.False;
RDebugUtils.currentLine=43515914;
 //BA.debugLineNum = 43515914;BA.debugLine="cacheAuditTrackIndexChanged = False";
__ref._cacheaudittrackindexchanged /*boolean*/  = __c.False;
RDebugUtils.currentLine=43515915;
 //BA.debugLineNum = 43515915;BA.debugLine="cacheAuditAddedCount = 0";
__ref._cacheauditaddedcount /*int*/  = (int) (0);
RDebugUtils.currentLine=43515916;
 //BA.debugLineNum = 43515916;BA.debugLine="cacheAuditRemovedCount = 0";
__ref._cacheauditremovedcount /*int*/  = (int) (0);
RDebugUtils.currentLine=43515917;
 //BA.debugLineNum = 43515917;BA.debugLine="cacheAuditTempDeletedCount = 0";
__ref._cacheaudittempdeletedcount /*int*/  = (int) (0);
RDebugUtils.currentLine=43515918;
 //BA.debugLineNum = 43515918;BA.debugLine="cacheAuditInProgress = True";
__ref._cacheauditinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=43515919;
 //BA.debugLineNum = 43515919;BA.debugLine="Trace(\"Запущен аудит кэша media.\")";
__ref._trace /*String*/ (null,"Запущен аудит кэша media.");
RDebugUtils.currentLine=43515920;
 //BA.debugLineNum = 43515920;BA.debugLine="End Sub";
return "";
}
public boolean  _runcacheauditstep(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "runcacheauditstep", false))
	 {return ((Boolean) Debug.delegate(ba, "runcacheauditstep", null));}
RDebugUtils.currentLine=43581440;
 //BA.debugLineNum = 43581440;BA.debugLine="Public Sub RunCacheAuditStep As Boolean";
RDebugUtils.currentLine=43581441;
 //BA.debugLineNum = 43581441;BA.debugLine="If cacheAuditInProgress = False Then Return False";
if (__ref._cacheauditinprogress /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=43581442;
 //BA.debugLineNum = 43581442;BA.debugLine="If cacheAuditCurrentType = \"\" Then";
if ((__ref._cacheauditcurrenttype /*String*/ ).equals("")) { 
RDebugUtils.currentLine=43581443;
 //BA.debugLineNum = 43581443;BA.debugLine="If PrepareNextCacheAuditType = False Then";
if (__ref._preparenextcacheaudittype /*boolean*/ (null)==__c.False) { 
RDebugUtils.currentLine=43581444;
 //BA.debugLineNum = 43581444;BA.debugLine="FinishCacheAudit";
__ref._finishcacheaudit /*String*/ (null);
RDebugUtils.currentLine=43581445;
 //BA.debugLineNum = 43581445;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
RDebugUtils.currentLine=43581448;
 //BA.debugLineNum = 43581448;BA.debugLine="ProcessCurrentCacheAuditBatch";
__ref._processcurrentcacheauditbatch /*String*/ (null);
RDebugUtils.currentLine=43581449;
 //BA.debugLineNum = 43581449;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurrent";
if (__ref._cacheauditcurrentposition /*int*/ >=__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=43581450;
 //BA.debugLineNum = 43581450;BA.debugLine="FinalizeCurrentCacheAuditType";
__ref._finalizecurrentcacheaudittype /*String*/ (null);
RDebugUtils.currentLine=43581451;
 //BA.debugLineNum = 43581451;BA.debugLine="cacheAuditCurrentType = \"\"";
__ref._cacheauditcurrenttype /*String*/  = "";
RDebugUtils.currentLine=43581452;
 //BA.debugLineNum = 43581452;BA.debugLine="If cacheAuditPendingTypes.Size = 0 Then";
if (__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
RDebugUtils.currentLine=43581453;
 //BA.debugLineNum = 43581453;BA.debugLine="FinishCacheAudit";
__ref._finishcacheaudit /*String*/ (null);
RDebugUtils.currentLine=43581454;
 //BA.debugLineNum = 43581454;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
RDebugUtils.currentLine=43581457;
 //BA.debugLineNum = 43581457;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=43581458;
 //BA.debugLineNum = 43581458;BA.debugLine="End Sub";
return false;
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
RDebugUtils.currentLine=37945345;
 //BA.debugLineNum = 37945345;BA.debugLine="If offlineData.IsInitialized = False Then Return";
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
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
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
RDebugUtils.currentLine=37945347;
 //BA.debugLineNum = 37945347;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("ads"),parent.__c.Null)));
RDebugUtils.currentLine=37945348;
 //BA.debugLineNum = 37945348;BA.debugLine="If ads.IsInitialized = False Or ads.Size = 0 Then";
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
RDebugUtils.currentLine=37945349;
 //BA.debugLineNum = 37945349;BA.debugLine="Dim cachedAdIndex As Map = GetCachedAdIndex";
parent._cachedadindex = new anywheresoftware.b4a.objects.collections.Map();
parent._cachedadindex = __ref._getcachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=37945350;
 //BA.debugLineNum = 37945350;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
RDebugUtils.currentLine=37945351;
 //BA.debugLineNum = 37945351;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
RDebugUtils.currentLine=37945352;
 //BA.debugLineNum = 37945352;BA.debugLine="For Each adObject As Object In ads";
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
RDebugUtils.currentLine=37945353;
 //BA.debugLineNum = 37945353;BA.debugLine="If adObject Is Map Then";
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
RDebugUtils.currentLine=37945354;
 //BA.debugLineNum = 37945354;BA.debugLine="Dim ad As Map = adObject";
_ad = new anywheresoftware.b4a.objects.collections.Map();
_ad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adobject));
RDebugUtils.currentLine=37945355;
 //BA.debugLineNum = 37945355;BA.debugLine="Wait For (EnsureSingleAdCached(ad, cachedAdInde";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensureadscached"), __ref._ensuresingleadcached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_ad,__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ));
this.state = 35;
return;
case 35:
//C
this.state = 25;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=37945356;
 //BA.debugLineNum = 37945356;BA.debugLine="If downloaded Then";
if (true) break;

case 25:
//if
this.state = 30;
if (_downloaded) { 
this.state = 27;
}else 
{RDebugUtils.currentLine=37945358;
 //BA.debugLineNum = 37945358;BA.debugLine="Else If IsAdCached(ad.GetDefault(\"id\", \"\")) = F";
if (__ref._isadcached /*boolean*/ (null,BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)(""))))==parent.__c.False) { 
this.state = 29;
}}
if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=37945357;
 //BA.debugLineNum = 37945357;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=37945359;
 //BA.debugLineNum = 37945359;BA.debugLine="failedCount = failedCount + 1";
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
RDebugUtils.currentLine=37945363;
 //BA.debugLineNum = 37945363;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
RDebugUtils.currentLine=37945364;
 //BA.debugLineNum = 37945364;BA.debugLine="Trace(\"Синхронизация кэша рекламы завершена. down";
__ref._trace /*String*/ (null,"Синхронизация кэша рекламы завершена. downloaded="+BA.NumberToString(_downloadedcount)+", failed="+BA.NumberToString(_failedcount)+", actual="+BA.NumberToString(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=37945365;
 //BA.debugLineNum = 37945365;BA.debugLine="Return downloadedCount > 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloadedcount>0));return;};
RDebugUtils.currentLine=37945366;
 //BA.debugLineNum = 37945366;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=39583745;
 //BA.debugLineNum = 39583745;BA.debugLine="If trackItems.IsInitialized = False Or trackItems";
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
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="Dim cachedTrackIndex As Map = GetCachedTrackIndex";
parent._cachedtrackindex = new anywheresoftware.b4a.objects.collections.Map();
parent._cachedtrackindex = __ref._getcachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=39583747;
 //BA.debugLineNum = 39583747;BA.debugLine="Dim seenTrackIds As Map";
_seentrackids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=39583748;
 //BA.debugLineNum = 39583748;BA.debugLine="seenTrackIds.Initialize";
_seentrackids.Initialize();
RDebugUtils.currentLine=39583749;
 //BA.debugLineNum = 39583749;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
RDebugUtils.currentLine=39583750;
 //BA.debugLineNum = 39583750;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
RDebugUtils.currentLine=39583751;
 //BA.debugLineNum = 39583751;BA.debugLine="Dim processedCount As Int = 0";
_processedcount = (int) (0);
RDebugUtils.currentLine=39583752;
 //BA.debugLineNum = 39583752;BA.debugLine="For Each itemObject As Object In trackItems";
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
RDebugUtils.currentLine=39583753;
 //BA.debugLineNum = 39583753;BA.debugLine="If processedCount >= maxCount Then Exit";
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
RDebugUtils.currentLine=39583754;
 //BA.debugLineNum = 39583754;BA.debugLine="If itemObject Is Map Then";
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
RDebugUtils.currentLine=39583755;
 //BA.debugLineNum = 39583755;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=39583756;
 //BA.debugLineNum = 39583756;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then";
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
RDebugUtils.currentLine=39583757;
 //BA.debugLineNum = 39583757;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=39583758;
 //BA.debugLineNum = 39583758;BA.debugLine="If trackId = \"\" Then Continue";
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
RDebugUtils.currentLine=39583759;
 //BA.debugLineNum = 39583759;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Conti";
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
RDebugUtils.currentLine=39583760;
 //BA.debugLineNum = 39583760;BA.debugLine="seenTrackIds.Put(trackId, True)";
_seentrackids.Put((Object)(_trackid),(Object)(parent.__c.True));
RDebugUtils.currentLine=39583761;
 //BA.debugLineNum = 39583761;BA.debugLine="processedCount = processedCount + 1";
_processedcount = (int) (_processedcount+1);
RDebugUtils.currentLine=39583762;
 //BA.debugLineNum = 39583762;BA.debugLine="Wait For (EnsureSingleTrackCached(item, cachedT";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensuretrackscached"), __ref._ensuresingletrackcached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_item,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ));
this.state = 47;
return;
case 47:
//C
this.state = 37;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=39583763;
 //BA.debugLineNum = 39583763;BA.debugLine="If downloaded Then";
if (true) break;

case 37:
//if
this.state = 42;
if (_downloaded) { 
this.state = 39;
}else 
{RDebugUtils.currentLine=39583765;
 //BA.debugLineNum = 39583765;BA.debugLine="Else If IsTrackCached(trackId) = False Then";
if (__ref._istrackcached /*boolean*/ (null,_trackid)==parent.__c.False) { 
this.state = 41;
}}
if (true) break;

case 39:
//C
this.state = 42;
RDebugUtils.currentLine=39583764;
 //BA.debugLineNum = 39583764;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=39583766;
 //BA.debugLineNum = 39583766;BA.debugLine="failedCount = failedCount + 1";
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
RDebugUtils.currentLine=39583770;
 //BA.debugLineNum = 39583770;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=39583771;
 //BA.debugLineNum = 39583771;BA.debugLine="Trace(\"Синхронизация кэша треков завершена. downl";
__ref._trace /*String*/ (null,"Синхронизация кэша треков завершена. downloaded="+BA.NumberToString(_downloadedcount)+", failed="+BA.NumberToString(_failedcount)+", actual="+BA.NumberToString(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=39583772;
 //BA.debugLineNum = 39583772;BA.debugLine="Return downloadedCount > 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloadedcount>0));return;};
RDebugUtils.currentLine=39583773;
 //BA.debugLineNum = 39583773;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.example.mediacache __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,b4j.example.keyvaluestore _storagevalue,Object _targetmodulevalue,String _tracesubnamevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_storagevalue,_targetmodulevalue,_tracesubnamevalue}));}
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="storage = storageValue";
__ref._storage /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=37879812;
 //BA.debugLineNum = 37879812;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=37879813;
 //BA.debugLineNum = 37879813;BA.debugLine="EnsureDirectory(GetAdsDir)";
__ref._ensuredirectory /*String*/ (null,__ref._getadsdir /*String*/ (null));
RDebugUtils.currentLine=37879814;
 //BA.debugLineNum = 37879814;BA.debugLine="EnsureDirectory(GetTracksDir)";
__ref._ensuredirectory /*String*/ (null,__ref._gettracksdir /*String*/ (null));
RDebugUtils.currentLine=37879815;
 //BA.debugLineNum = 37879815;BA.debugLine="LoadIndexesFromStorage";
__ref._loadindexesfromstorage /*String*/ (null);
RDebugUtils.currentLine=37879816;
 //BA.debugLineNum = 37879816;BA.debugLine="End Sub";
return "";
}
public String  _resolvelocalmediauri(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvelocalmediauri", false))
	 {return ((String) Debug.delegate(ba, "resolvelocalmediauri", new Object[] {_item}));}
String _itemtype = "";
String _itemid = "";
RDebugUtils.currentLine=38010880;
 //BA.debugLineNum = 38010880;BA.debugLine="Public Sub ResolveLocalMediaUri(item As Map) As St";
RDebugUtils.currentLine=38010881;
 //BA.debugLineNum = 38010881;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=38010883;
 //BA.debugLineNum = 38010883;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=38010884;
 //BA.debugLineNum = 38010884;BA.debugLine="If itemId = \"\" Then Return \"\"";
if ((_itemid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=38010885;
 //BA.debugLineNum = 38010885;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38010886;
 //BA.debugLineNum = 38010886;BA.debugLine="If itemType = \"ad\" Then Return File.GetUri(GetAds";
if ((_itemtype).equals("ad")) { 
if (true) return __c.File.GetUri(__ref._getadsdir /*String*/ (null),_itemid);};
RDebugUtils.currentLine=38010887;
 //BA.debugLineNum = 38010887;BA.debugLine="If itemType = \"track\" Then Return File.GetUri(Get";
if ((_itemtype).equals("track")) { 
if (true) return __c.File.GetUri(__ref._gettracksdir /*String*/ (null),_itemid);};
RDebugUtils.currentLine=38010888;
 //BA.debugLineNum = 38010888;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=38010889;
 //BA.debugLineNum = 38010889;BA.debugLine="End Sub";
return "";
}
public boolean  _istrackcached(b4j.example.mediacache __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "istrackcached", false))
	 {return ((Boolean) Debug.delegate(ba, "istrackcached", new Object[] {_trackid}));}
RDebugUtils.currentLine=39518208;
 //BA.debugLineNum = 39518208;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=39518210;
 //BA.debugLineNum = 39518210;BA.debugLine="Return ValidateIndexedFile(\"track\", trackId)";
if (true) return __ref._validateindexedfile /*boolean*/ (null,"track",_trackid);
RDebugUtils.currentLine=39518211;
 //BA.debugLineNum = 39518211;BA.debugLine="End Sub";
return false;
}
public boolean  _isadcached(b4j.example.mediacache __ref,String _adid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "isadcached", false))
	 {return ((Boolean) Debug.delegate(ba, "isadcached", new Object[] {_adid}));}
RDebugUtils.currentLine=38076416;
 //BA.debugLineNum = 38076416;BA.debugLine="Public Sub IsAdCached(adId As String) As Boolean";
RDebugUtils.currentLine=38076417;
 //BA.debugLineNum = 38076417;BA.debugLine="If adId = \"\" Then Return False";
if ((_adid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="Return ValidateIndexedFile(\"ad\", adId)";
if (true) return __ref._validateindexedfile /*boolean*/ (null,"ad",_adid);
RDebugUtils.currentLine=38076419;
 //BA.debugLineNum = 38076419;BA.debugLine="End Sub";
return false;
}
public String  _resolvemediasource(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvemediasource", false))
	 {return ((String) Debug.delegate(ba, "resolvemediasource", new Object[] {_item}));}
String _itemtype = "";
RDebugUtils.currentLine=39911424;
 //BA.debugLineNum = 39911424;BA.debugLine="Public Sub ResolveMediaSource(item As Map) As Stri";
RDebugUtils.currentLine=39911425;
 //BA.debugLineNum = 39911425;BA.debugLine="If item.IsInitialized = False Then Return \"none\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "none";};
RDebugUtils.currentLine=39911426;
 //BA.debugLineNum = 39911426;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=39911427;
 //BA.debugLineNum = 39911427;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=39911428;
 //BA.debugLineNum = 39911428;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)) { 
if (true) return "cache";};
RDebugUtils.currentLine=39911429;
 //BA.debugLineNum = 39911429;BA.debugLine="Return \"cdn\"";
if (true) return "cdn";
 };
RDebugUtils.currentLine=39911431;
 //BA.debugLineNum = 39911431;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=39911432;
 //BA.debugLineNum = 39911432;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)) { 
if (true) return "cache";};
RDebugUtils.currentLine=39911433;
 //BA.debugLineNum = 39911433;BA.debugLine="Return \"cdn\"";
if (true) return "cdn";
 };
RDebugUtils.currentLine=39911435;
 //BA.debugLineNum = 39911435;BA.debugLine="Return \"none\"";
if (true) return "none";
RDebugUtils.currentLine=39911436;
 //BA.debugLineNum = 39911436;BA.debugLine="End Sub";
return "";
}
public boolean  _hasvalidatedlocalmedia(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "hasvalidatedlocalmedia", false))
	 {return ((Boolean) Debug.delegate(ba, "hasvalidatedlocalmedia", new Object[] {_item}));}
String _itemid = "";
String _itemtype = "";
RDebugUtils.currentLine=44433408;
 //BA.debugLineNum = 44433408;BA.debugLine="Public Sub HasValidatedLocalMedia(item As Map) As";
RDebugUtils.currentLine=44433409;
 //BA.debugLineNum = 44433409;BA.debugLine="If item.IsInitialized = False Then Return False";
if (_item.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=44433410;
 //BA.debugLineNum = 44433410;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=44433411;
 //BA.debugLineNum = 44433411;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=44433412;
 //BA.debugLineNum = 44433412;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=44433413;
 //BA.debugLineNum = 44433413;BA.debugLine="If itemType = \"ad\" Then Return ValidateIndexedFil";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._validateindexedfile /*boolean*/ (null,"ad",_itemid);};
RDebugUtils.currentLine=44433414;
 //BA.debugLineNum = 44433414;BA.debugLine="If itemType = \"track\" Then Return ValidateIndexed";
if ((_itemtype).equals("track")) { 
if (true) return __ref._validateindexedfile /*boolean*/ (null,"track",_itemid);};
RDebugUtils.currentLine=44433415;
 //BA.debugLineNum = 44433415;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=44433416;
 //BA.debugLineNum = 44433416;BA.debugLine="End Sub";
return false;
}
public String  _addindexedfilefromaudit(b4j.example.mediacache __ref,String _itemtype,String _filename,anywheresoftware.b4a.objects.collections.Map _auditindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "addindexedfilefromaudit", false))
	 {return ((String) Debug.delegate(ba, "addindexedfilefromaudit", new Object[] {_itemtype,_filename,_auditindex}));}
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=44105728;
 //BA.debugLineNum = 44105728;BA.debugLine="Private Sub AddIndexedFileFromAudit(itemType As St";
RDebugUtils.currentLine=44105729;
 //BA.debugLineNum = 44105729;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=44105730;
 //BA.debugLineNum = 44105730;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=44105731;
 //BA.debugLineNum = 44105731;BA.debugLine="entry.Put(\"id\", fileName)";
_entry.Put((Object)("id"),(Object)(_filename));
RDebugUtils.currentLine=44105732;
 //BA.debugLineNum = 44105732;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=44105733;
 //BA.debugLineNum = 44105733;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=44105734;
 //BA.debugLineNum = 44105734;BA.debugLine="If itemType = \"ads\" Then";
if ((_itemtype).equals("ads")) { 
RDebugUtils.currentLine=44105735;
 //BA.debugLineNum = 44105735;BA.debugLine="entry.Put(\"title\", \"\")";
_entry.Put((Object)("title"),(Object)(""));
RDebugUtils.currentLine=44105736;
 //BA.debugLineNum = 44105736;BA.debugLine="entry.Put(\"duration\", 0)";
_entry.Put((Object)("duration"),(Object)(0));
RDebugUtils.currentLine=44105737;
 //BA.debugLineNum = 44105737;BA.debugLine="entry.Put(\"gain\", 0)";
_entry.Put((Object)("gain"),(Object)(0));
 }else {
RDebugUtils.currentLine=44105739;
 //BA.debugLineNum = 44105739;BA.debugLine="entry.Put(\"title\", \"\")";
_entry.Put((Object)("title"),(Object)(""));
RDebugUtils.currentLine=44105740;
 //BA.debugLineNum = 44105740;BA.debugLine="entry.Put(\"set\", \"\")";
_entry.Put((Object)("set"),(Object)(""));
RDebugUtils.currentLine=44105741;
 //BA.debugLineNum = 44105741;BA.debugLine="entry.Put(\"stream\", \"\")";
_entry.Put((Object)("stream"),(Object)(""));
RDebugUtils.currentLine=44105742;
 //BA.debugLineNum = 44105742;BA.debugLine="entry.Put(\"gain\", 0)";
_entry.Put((Object)("gain"),(Object)(0));
 };
RDebugUtils.currentLine=44105744;
 //BA.debugLineNum = 44105744;BA.debugLine="auditIndex.Put(fileName, entry)";
_auditindex.Put((Object)(_filename),(Object)(_entry.getObject()));
RDebugUtils.currentLine=44105745;
 //BA.debugLineNum = 44105745;BA.debugLine="MarkAuditIndexChanged(itemType)";
__ref._markauditindexchanged /*String*/ (null,_itemtype);
RDebugUtils.currentLine=44105746;
 //BA.debugLineNum = 44105746;BA.debugLine="End Sub";
return "";
}
public String  _markauditindexchanged(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "markauditindexchanged", false))
	 {return ((String) Debug.delegate(ba, "markauditindexchanged", new Object[] {_itemtype}));}
RDebugUtils.currentLine=44040192;
 //BA.debugLineNum = 44040192;BA.debugLine="Private Sub MarkAuditIndexChanged(itemType As Stri";
RDebugUtils.currentLine=44040193;
 //BA.debugLineNum = 44040193;BA.debugLine="If itemType = \"ads\" Then";
if ((_itemtype).equals("ads")) { 
RDebugUtils.currentLine=44040194;
 //BA.debugLineNum = 44040194;BA.debugLine="cacheAuditAdIndexChanged = True";
__ref._cacheauditadindexchanged /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=44040196;
 //BA.debugLineNum = 44040196;BA.debugLine="cacheAuditTrackIndexChanged = True";
__ref._cacheaudittrackindexchanged /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=44040198;
 //BA.debugLineNum = 44040198;BA.debugLine="End Sub";
return "";
}
public String  _buildadurl(b4j.example.mediacache __ref,String _adid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildadurl", false))
	 {return ((String) Debug.delegate(ba, "buildadurl", new Object[] {_adid}));}
String _first = "";
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Private Sub BuildAdUrl(adId As String) As String";
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="If adId = \"\" Then Return \"\"";
if ((_adid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="Dim first As String = adId.SubString2(0, 1)";
_first = _adid.substring((int) (0),(int) (1));
RDebugUtils.currentLine=38404099;
 //BA.debugLineNum = 38404099;BA.debugLine="Return \"https://cdn.fon.fm/media/ads/\" & first &";
if (true) return "https://cdn.fon.fm/media/ads/"+_first+"/"+_adid+".mp3";
RDebugUtils.currentLine=38404100;
 //BA.debugLineNum = 38404100;BA.debugLine="End Sub";
return "";
}
public String  _buildtempcachefilename(b4j.example.mediacache __ref,String _itemid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtempcachefilename", false))
	 {return ((String) Debug.delegate(ba, "buildtempcachefilename", new Object[] {_itemid}));}
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Private Sub BuildTempCacheFileName(itemId As Strin";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="Return itemId & \".tmp\"";
if (true) return _itemid+".tmp";
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="End Sub";
return "";
}
public String  _buildtrackurl(b4j.example.mediacache __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackurl", false))
	 {return ((String) Debug.delegate(ba, "buildtrackurl", new Object[] {_trackid}));}
String _first = "";
RDebugUtils.currentLine=39845888;
 //BA.debugLineNum = 39845888;BA.debugLine="Private Sub BuildTrackUrl(trackId As String) As St";
RDebugUtils.currentLine=39845889;
 //BA.debugLineNum = 39845889;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=39845890;
 //BA.debugLineNum = 39845890;BA.debugLine="Dim first As String = trackId.SubString2(0, 1)";
_first = _trackid.substring((int) (0),(int) (1));
RDebugUtils.currentLine=39845891;
 //BA.debugLineNum = 39845891;BA.debugLine="Return \"https://cdn.fon.fm/media/tracks/\" & first";
if (true) return "https://cdn.fon.fm/media/tracks/"+_first+"/"+_trackid+".mp3";
RDebugUtils.currentLine=39845892;
 //BA.debugLineNum = 39845892;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
RDebugUtils.currentLine=37814272;
 //BA.debugLineNum = 37814272;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=37814273;
 //BA.debugLineNum = 37814273;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=37814275;
 //BA.debugLineNum = 37814275;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=37814276;
 //BA.debugLineNum = 37814276;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=37814277;
 //BA.debugLineNum = 37814277;BA.debugLine="Private mediaDirName As String = \"media\"";
_mediadirname = "media";
RDebugUtils.currentLine=37814278;
 //BA.debugLineNum = 37814278;BA.debugLine="Private adsDirName As String = \"ads\"";
_adsdirname = "ads";
RDebugUtils.currentLine=37814279;
 //BA.debugLineNum = 37814279;BA.debugLine="Private tracksDirName As String = \"tracks\"";
_tracksdirname = "tracks";
RDebugUtils.currentLine=37814280;
 //BA.debugLineNum = 37814280;BA.debugLine="Private Const CACHE_AUDIT_BATCH_SIZE As Int = 8";
_cache_audit_batch_size = (int) (8);
RDebugUtils.currentLine=37814281;
 //BA.debugLineNum = 37814281;BA.debugLine="Private cachedAdIndex As Map";
_cachedadindex = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37814282;
 //BA.debugLineNum = 37814282;BA.debugLine="Private cachedTrackIndex As Map";
_cachedtrackindex = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37814283;
 //BA.debugLineNum = 37814283;BA.debugLine="Private cacheAuditInProgress As Boolean";
_cacheauditinprogress = false;
RDebugUtils.currentLine=37814284;
 //BA.debugLineNum = 37814284;BA.debugLine="Private cacheAuditPendingTypes As List";
_cacheauditpendingtypes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37814285;
 //BA.debugLineNum = 37814285;BA.debugLine="Private cacheAuditCurrentType As String";
_cacheauditcurrenttype = "";
RDebugUtils.currentLine=37814286;
 //BA.debugLineNum = 37814286;BA.debugLine="Private cacheAuditCurrentFileNames As List";
_cacheauditcurrentfilenames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37814287;
 //BA.debugLineNum = 37814287;BA.debugLine="Private cacheAuditCurrentPosition As Int";
_cacheauditcurrentposition = 0;
RDebugUtils.currentLine=37814288;
 //BA.debugLineNum = 37814288;BA.debugLine="Private cacheAuditSeenIds As Map";
_cacheauditseenids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37814289;
 //BA.debugLineNum = 37814289;BA.debugLine="Private cacheAuditAdIndexChanged As Boolean";
_cacheauditadindexchanged = false;
RDebugUtils.currentLine=37814290;
 //BA.debugLineNum = 37814290;BA.debugLine="Private cacheAuditTrackIndexChanged As Boolean";
_cacheaudittrackindexchanged = false;
RDebugUtils.currentLine=37814291;
 //BA.debugLineNum = 37814291;BA.debugLine="Private cacheAuditAddedCount As Int";
_cacheauditaddedcount = 0;
RDebugUtils.currentLine=37814292;
 //BA.debugLineNum = 37814292;BA.debugLine="Private cacheAuditRemovedCount As Int";
_cacheauditremovedcount = 0;
RDebugUtils.currentLine=37814293;
 //BA.debugLineNum = 37814293;BA.debugLine="Private cacheAuditTempDeletedCount As Int";
_cacheaudittempdeletedcount = 0;
RDebugUtils.currentLine=37814294;
 //BA.debugLineNum = 37814294;BA.debugLine="End Sub";
return "";
}
public String  _deletefileifexists(b4j.example.mediacache __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "deletefileifexists", false))
	 {return ((String) Debug.delegate(ba, "deletefileifexists", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=41615360;
 //BA.debugLineNum = 41615360;BA.debugLine="Private Sub DeleteFileIfExists(dir As String, file";
RDebugUtils.currentLine=41615361;
 //BA.debugLineNum = 41615361;BA.debugLine="If fileName = \"\" Then Return";
if ((_filename).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=41615362;
 //BA.debugLineNum = 41615362;BA.debugLine="If File.Exists(dir, fileName) Then File.Delete(di";
if (__c.File.Exists(_dir,_filename)) { 
__c.File.Delete(_dir,_filename);};
RDebugUtils.currentLine=41615363;
 //BA.debugLineNum = 41615363;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedadindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedadindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedadindex", null));}
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Private Sub GetCachedAdIndex As Map";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="If cachedAdIndex.IsInitialized = False Then";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="cachedAdIndex.Initialize";
__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=38338564;
 //BA.debugLineNum = 38338564;BA.debugLine="Return cachedAdIndex";
if (true) return __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=38338565;
 //BA.debugLineNum = 38338565;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=38207489;
 //BA.debugLineNum = 38207489;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=38207490;
 //BA.debugLineNum = 38207490;BA.debugLine="If adId = \"\" Then Return False";
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
RDebugUtils.currentLine=38207491;
 //BA.debugLineNum = 38207491;BA.debugLine="If IsAdCached(adId) Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._isadcached /*boolean*/ (null,_adid)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=38207492;
 //BA.debugLineNum = 38207492;BA.debugLine="UpdateAdIndex(ad, adIndex)";
__ref._updateadindex /*String*/ (null,_ad,_adindex);
RDebugUtils.currentLine=38207493;
 //BA.debugLineNum = 38207493;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=38207495;
 //BA.debugLineNum = 38207495;BA.debugLine="Dim adUrl As String = BuildAdUrl(adId)";
_adurl = __ref._buildadurl /*String*/ (null,_adid);
RDebugUtils.currentLine=38207496;
 //BA.debugLineNum = 38207496;BA.debugLine="If adUrl = \"\" Then Return False";
if (true) break;

case 11:
//if
this.state = 16;
if ((_adurl).equals("")) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=38207497;
 //BA.debugLineNum = 38207497;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=38207498;
 //BA.debugLineNum = 38207498;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=38207499;
 //BA.debugLineNum = 38207499;BA.debugLine="Trace(\"Скачивание рекламы в кэш. id=\" & adId & \",";
__ref._trace /*String*/ (null,"Скачивание рекламы в кэш. id="+_adid+", url="+_adurl);
RDebugUtils.currentLine=38207500;
 //BA.debugLineNum = 38207500;BA.debugLine="j.Download(adUrl)";
_j._download /*String*/ (null,_adurl);
RDebugUtils.currentLine=38207501;
 //BA.debugLineNum = 38207501;BA.debugLine="j.GetRequest.Timeout = 15000";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=38207502;
 //BA.debugLineNum = 38207502;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensuresingleadcached"), (Object)(_j));
this.state = 36;
return;
case 36:
//C
this.state = 17;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=38207503;
 //BA.debugLineNum = 38207503;BA.debugLine="If j.Success Then";
if (true) break;

case 17:
//if
this.state = 35;
if (_j._success /*boolean*/ ) { 
this.state = 19;
}else {
this.state = 34;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=38207504;
 //BA.debugLineNum = 38207504;BA.debugLine="Try";
if (true) break;

case 20:
//try
this.state = 32;
this.catchState = 31;
this.state = 22;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 31;
RDebugUtils.currentLine=38207505;
 //BA.debugLineNum = 38207505;BA.debugLine="EnsureDirectory(GetAdsDir)";
__ref._ensuredirectory /*String*/ (null,__ref._getadsdir /*String*/ (null));
RDebugUtils.currentLine=38207506;
 //BA.debugLineNum = 38207506;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
_tempfilename = __ref._buildtempcachefilename /*String*/ (null,_adid);
RDebugUtils.currentLine=38207507;
 //BA.debugLineNum = 38207507;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=38207508;
 //BA.debugLineNum = 38207508;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = parent.__c.File.OpenOutput(__ref._getadsdir /*String*/ (null),_tempfilename,parent.__c.False);
RDebugUtils.currentLine=38207509;
 //BA.debugLineNum = 38207509;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_outstream.getObject()));
RDebugUtils.currentLine=38207510;
 //BA.debugLineNum = 38207510;BA.debugLine="outStream.Close";
_outstream.Close();
RDebugUtils.currentLine=38207511;
 //BA.debugLineNum = 38207511;BA.debugLine="If IsCachedFileUsable(GetAdsDir, tempFileName)";
if (true) break;

case 23:
//if
this.state = 26;
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename)==parent.__c.False) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=38207512;
 //BA.debugLineNum = 38207512;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=38207513;
 //BA.debugLineNum = 38207513;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
__ref._trace /*String*/ (null,"Не удалось сохранить рекламу в кэш. id="+_adid+", message=empty temp file");
RDebugUtils.currentLine=38207514;
 //BA.debugLineNum = 38207514;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38207515;
 //BA.debugLineNum = 38207515;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=38207517;
 //BA.debugLineNum = 38207517;BA.debugLine="If ReplaceCacheFile(GetAdsDir, tempFileName, ad";

case 26:
//if
this.state = 29;
if (__ref._replacecachefile /*boolean*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename,_adid)==parent.__c.False) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=38207518;
 //BA.debugLineNum = 38207518;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=38207519;
 //BA.debugLineNum = 38207519;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
__ref._trace /*String*/ (null,"Не удалось сохранить рекламу в кэш. id="+_adid+", message=rename failed");
RDebugUtils.currentLine=38207520;
 //BA.debugLineNum = 38207520;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38207521;
 //BA.debugLineNum = 38207521;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 29:
//C
this.state = 32;
;
RDebugUtils.currentLine=38207523;
 //BA.debugLineNum = 38207523;BA.debugLine="UpdateAdIndex(ad, adIndex)";
__ref._updateadindex /*String*/ (null,_ad,_adindex);
RDebugUtils.currentLine=38207524;
 //BA.debugLineNum = 38207524;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
RDebugUtils.currentLine=38207525;
 //BA.debugLineNum = 38207525;BA.debugLine="Trace(\"Реклама сохранена в кэш. id=\" & adId)";
__ref._trace /*String*/ (null,"Реклама сохранена в кэш. id="+_adid);
RDebugUtils.currentLine=38207526;
 //BA.debugLineNum = 38207526;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38207527;
 //BA.debugLineNum = 38207527;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
RDebugUtils.currentLine=38207529;
 //BA.debugLineNum = 38207529;BA.debugLine="DeleteFileIfExists(GetAdsDir, BuildTempCacheFil";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),__ref._buildtempcachefilename /*String*/ (null,_adid));
RDebugUtils.currentLine=38207530;
 //BA.debugLineNum = 38207530;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=\"";
__ref._trace /*String*/ (null,"Не удалось сохранить рекламу в кэш. id="+_adid+", message="+parent.__c.LastException(ba).getMessage());
 if (true) break;
if (true) break;

case 32:
//C
this.state = 35;
this.catchState = 0;
;
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=38207533;
 //BA.debugLineNum = 38207533;BA.debugLine="Trace(\"Не удалось скачать рекламу. id=\" & adId &";
__ref._trace /*String*/ (null,"Не удалось скачать рекламу. id="+_adid+", message="+_j._errormessage /*String*/ );
 if (true) break;

case 35:
//C
this.state = -1;
;
RDebugUtils.currentLine=38207535;
 //BA.debugLineNum = 38207535;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38207536;
 //BA.debugLineNum = 38207536;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=38207537;
 //BA.debugLineNum = 38207537;BA.debugLine="End Sub";
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
public String  _saveadindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "saveadindex", false))
	 {return ((String) Debug.delegate(ba, "saveadindex", null));}
RDebugUtils.currentLine=43122688;
 //BA.debugLineNum = 43122688;BA.debugLine="Private Sub SaveAdIndex";
RDebugUtils.currentLine=43122689;
 //BA.debugLineNum = 43122689;BA.debugLine="storage.Put(\"cached_ad_index\", cachedAdIndex)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_ad_index",(Object)(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=43122690;
 //BA.debugLineNum = 43122690;BA.debugLine="storage.Put(\"cached_ad_count\", cachedAdIndex.Size";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_ad_count",(Object)(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=43122691;
 //BA.debugLineNum = 43122691;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.mediacache __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=38535172;
 //BA.debugLineNum = 38535172;BA.debugLine="End Sub";
return "";
}
public String  _ensuredirectory(b4j.example.mediacache __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _fileobject = null;
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=38469635;
 //BA.debugLineNum = 38469635;BA.debugLine="fileObject.RunMethod(\"mkdirs\", Null)";
_fileobject.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=38469636;
 //BA.debugLineNum = 38469636;BA.debugLine="End Sub";
return "";
}
public String  _updateadindex(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _adindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "updateadindex", false))
	 {return ((String) Debug.delegate(ba, "updateadindex", new Object[] {_ad,_adindex}));}
String _adid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Private Sub UpdateAdIndex(ad As Map, adIndex As Ma";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="If adId = \"\" Then Return";
if ((_adid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="Dim entry As Map = adIndex.GetDefault(adId, Null)";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adindex.GetDefault((Object)(_adid),__c.Null)));
RDebugUtils.currentLine=38273028;
 //BA.debugLineNum = 38273028;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=38273029;
 //BA.debugLineNum = 38273029;BA.debugLine="entry.Put(\"id\", adId)";
_entry.Put((Object)("id"),(Object)(_adid));
RDebugUtils.currentLine=38273030;
 //BA.debugLineNum = 38273030;BA.debugLine="entry.Put(\"title\", ad.GetDefault(\"title\", \"\"))";
_entry.Put((Object)("title"),_ad.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=38273031;
 //BA.debugLineNum = 38273031;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=38273032;
 //BA.debugLineNum = 38273032;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=38273033;
 //BA.debugLineNum = 38273033;BA.debugLine="entry.Put(\"duration\", ad.GetDefault(\"duration\", 0";
_entry.Put((Object)("duration"),_ad.GetDefault((Object)("duration"),(Object)(0)));
RDebugUtils.currentLine=38273034;
 //BA.debugLineNum = 38273034;BA.debugLine="entry.Put(\"gain\", ad.GetDefault(\"gain\", 0))";
_entry.Put((Object)("gain"),_ad.GetDefault((Object)("gain"),(Object)(0)));
RDebugUtils.currentLine=38273035;
 //BA.debugLineNum = 38273035;BA.debugLine="adIndex.Put(adId, entry)";
_adindex.Put((Object)(_adid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=38273036;
 //BA.debugLineNum = 38273036;BA.debugLine="End Sub";
return "";
}
public String  _getadsdir(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getadsdir", false))
	 {return ((String) Debug.delegate(ba, "getadsdir", null));}
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Public Sub GetAdsDir As String";
RDebugUtils.currentLine=38141953;
 //BA.debugLineNum = 38141953;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
if (true) return __c.File.Combine(__c.File.Combine(__ref._storagedir /*String*/ ,__ref._mediadirname /*String*/ ),__ref._adsdirname /*String*/ );
RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="End Sub";
return "";
}
public boolean  _iscachedfileusable(b4j.example.mediacache __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "iscachedfileusable", false))
	 {return ((Boolean) Debug.delegate(ba, "iscachedfileusable", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Private Sub IsCachedFileUsable(dir As String, file";
RDebugUtils.currentLine=41418753;
 //BA.debugLineNum = 41418753;BA.debugLine="If fileName = \"\" Then Return False";
if ((_filename).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="If File.Exists(dir, fileName) = False Then Return";
if (__c.File.Exists(_dir,_filename)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=41418755;
 //BA.debugLineNum = 41418755;BA.debugLine="Try";
try {RDebugUtils.currentLine=41418756;
 //BA.debugLineNum = 41418756;BA.debugLine="If File.Size(dir, fileName) > 0 Then Return True";
if (__c.File.Size(_dir,_filename)>0) { 
if (true) return __c.True;};
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=41418758;
 //BA.debugLineNum = 41418758;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("141418758",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=41418760;
 //BA.debugLineNum = 41418760;BA.debugLine="DeleteFileIfExists(dir, fileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_filename);
RDebugUtils.currentLine=41418761;
 //BA.debugLineNum = 41418761;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=41418762;
 //BA.debugLineNum = 41418762;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Private Sub ReplaceCacheFile(dir As String, tempFi";
RDebugUtils.currentLine=41549825;
 //BA.debugLineNum = 41549825;BA.debugLine="If IsCachedFileUsable(dir, tempFileName) = False";
if (__ref._iscachedfileusable /*boolean*/ (null,_dir,_tempfilename)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=41549826;
 //BA.debugLineNum = 41549826;BA.debugLine="If IsCachedFileUsable(dir, finalFileName) Then";
if (__ref._iscachedfileusable /*boolean*/ (null,_dir,_finalfilename)) { 
RDebugUtils.currentLine=41549827;
 //BA.debugLineNum = 41549827;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_tempfilename);
RDebugUtils.currentLine=41549828;
 //BA.debugLineNum = 41549828;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=41549830;
 //BA.debugLineNum = 41549830;BA.debugLine="DeleteFileIfExists(dir, finalFileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_finalfilename);
RDebugUtils.currentLine=41549831;
 //BA.debugLineNum = 41549831;BA.debugLine="Dim tempFile As JavaObject";
_tempfile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=41549832;
 //BA.debugLineNum = 41549832;BA.debugLine="tempFile.InitializeNewInstance(\"java.io.File\", Ar";
_tempfile.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_dir,_tempfilename))});
RDebugUtils.currentLine=41549833;
 //BA.debugLineNum = 41549833;BA.debugLine="Dim finalFile As JavaObject";
_finalfile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=41549834;
 //BA.debugLineNum = 41549834;BA.debugLine="finalFile.InitializeNewInstance(\"java.io.File\", A";
_finalfile.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_dir,_finalfilename))});
RDebugUtils.currentLine=41549835;
 //BA.debugLineNum = 41549835;BA.debugLine="Dim renamed As Boolean = tempFile.RunMethod(\"rena";
_renamed = BA.ObjectToBoolean(_tempfile.RunMethod("renameTo",new Object[]{(Object)(_finalfile.getObject())}));
RDebugUtils.currentLine=41549836;
 //BA.debugLineNum = 41549836;BA.debugLine="If renamed = False And IsCachedFileUsable(dir, fi";
if (_renamed==__c.False && __ref._iscachedfileusable /*boolean*/ (null,_dir,_finalfilename)) { 
RDebugUtils.currentLine=41549837;
 //BA.debugLineNum = 41549837;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_tempfilename);
RDebugUtils.currentLine=41549838;
 //BA.debugLineNum = 41549838;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=41549840;
 //BA.debugLineNum = 41549840;BA.debugLine="Return renamed";
if (true) return _renamed;
RDebugUtils.currentLine=41549841;
 //BA.debugLineNum = 41549841;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=39649282;
 //BA.debugLineNum = 39649282;BA.debugLine="If trackId = \"\" Then Return False";
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
RDebugUtils.currentLine=39649283;
 //BA.debugLineNum = 39649283;BA.debugLine="If IsTrackCached(trackId) Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._istrackcached /*boolean*/ (null,_trackid)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=39649284;
 //BA.debugLineNum = 39649284;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_trackindex);
RDebugUtils.currentLine=39649285;
 //BA.debugLineNum = 39649285;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=39649287;
 //BA.debugLineNum = 39649287;BA.debugLine="Dim trackUrl As String = BuildTrackUrl(trackId)";
_trackurl = __ref._buildtrackurl /*String*/ (null,_trackid);
RDebugUtils.currentLine=39649288;
 //BA.debugLineNum = 39649288;BA.debugLine="If trackUrl = \"\" Then Return False";
if (true) break;

case 11:
//if
this.state = 16;
if ((_trackurl).equals("")) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=39649289;
 //BA.debugLineNum = 39649289;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=39649290;
 //BA.debugLineNum = 39649290;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=39649291;
 //BA.debugLineNum = 39649291;BA.debugLine="Trace(\"Скачивание трека в кэш. id=\" & trackId & \"";
__ref._trace /*String*/ (null,"Скачивание трека в кэш. id="+_trackid+", url="+_trackurl);
RDebugUtils.currentLine=39649292;
 //BA.debugLineNum = 39649292;BA.debugLine="j.Download(trackUrl)";
_j._download /*String*/ (null,_trackurl);
RDebugUtils.currentLine=39649293;
 //BA.debugLineNum = 39649293;BA.debugLine="j.GetRequest.Timeout = 20000";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (20000));
RDebugUtils.currentLine=39649294;
 //BA.debugLineNum = 39649294;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensuresingletrackcached"), (Object)(_j));
this.state = 36;
return;
case 36:
//C
this.state = 17;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=39649295;
 //BA.debugLineNum = 39649295;BA.debugLine="If j.Success Then";
if (true) break;

case 17:
//if
this.state = 35;
if (_j._success /*boolean*/ ) { 
this.state = 19;
}else {
this.state = 34;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=39649296;
 //BA.debugLineNum = 39649296;BA.debugLine="Try";
if (true) break;

case 20:
//try
this.state = 32;
this.catchState = 31;
this.state = 22;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 31;
RDebugUtils.currentLine=39649297;
 //BA.debugLineNum = 39649297;BA.debugLine="EnsureDirectory(GetTracksDir)";
__ref._ensuredirectory /*String*/ (null,__ref._gettracksdir /*String*/ (null));
RDebugUtils.currentLine=39649298;
 //BA.debugLineNum = 39649298;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
_tempfilename = __ref._buildtempcachefilename /*String*/ (null,_trackid);
RDebugUtils.currentLine=39649299;
 //BA.debugLineNum = 39649299;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=39649300;
 //BA.debugLineNum = 39649300;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = parent.__c.File.OpenOutput(__ref._gettracksdir /*String*/ (null),_tempfilename,parent.__c.False);
RDebugUtils.currentLine=39649301;
 //BA.debugLineNum = 39649301;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_outstream.getObject()));
RDebugUtils.currentLine=39649302;
 //BA.debugLineNum = 39649302;BA.debugLine="outStream.Close";
_outstream.Close();
RDebugUtils.currentLine=39649303;
 //BA.debugLineNum = 39649303;BA.debugLine="If IsCachedFileUsable(GetTracksDir, tempFileNam";
if (true) break;

case 23:
//if
this.state = 26;
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_tempfilename)==parent.__c.False) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=39649304;
 //BA.debugLineNum = 39649304;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=39649305;
 //BA.debugLineNum = 39649305;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
__ref._trace /*String*/ (null,"Не удалось сохранить трек в кэш. id="+_trackid+", message=empty temp file");
RDebugUtils.currentLine=39649306;
 //BA.debugLineNum = 39649306;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=39649307;
 //BA.debugLineNum = 39649307;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=39649309;
 //BA.debugLineNum = 39649309;BA.debugLine="If ReplaceCacheFile(GetTracksDir, tempFileName,";

case 26:
//if
this.state = 29;
if (__ref._replacecachefile /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_tempfilename,_trackid)==parent.__c.False) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=39649310;
 //BA.debugLineNum = 39649310;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=39649311;
 //BA.debugLineNum = 39649311;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
__ref._trace /*String*/ (null,"Не удалось сохранить трек в кэш. id="+_trackid+", message=rename failed");
RDebugUtils.currentLine=39649312;
 //BA.debugLineNum = 39649312;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=39649313;
 //BA.debugLineNum = 39649313;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 29:
//C
this.state = 32;
;
RDebugUtils.currentLine=39649315;
 //BA.debugLineNum = 39649315;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_trackindex);
RDebugUtils.currentLine=39649316;
 //BA.debugLineNum = 39649316;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=39649317;
 //BA.debugLineNum = 39649317;BA.debugLine="Trace(\"Трек сохранен в кэш. id=\" & trackId)";
__ref._trace /*String*/ (null,"Трек сохранен в кэш. id="+_trackid);
RDebugUtils.currentLine=39649318;
 //BA.debugLineNum = 39649318;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=39649319;
 //BA.debugLineNum = 39649319;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
RDebugUtils.currentLine=39649321;
 //BA.debugLineNum = 39649321;BA.debugLine="DeleteFileIfExists(GetTracksDir, BuildTempCache";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),__ref._buildtempcachefilename /*String*/ (null,_trackid));
RDebugUtils.currentLine=39649322;
 //BA.debugLineNum = 39649322;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
__ref._trace /*String*/ (null,"Не удалось сохранить трек в кэш. id="+_trackid+", message="+parent.__c.LastException(ba).getMessage());
 if (true) break;
if (true) break;

case 32:
//C
this.state = 35;
this.catchState = 0;
;
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=39649325;
 //BA.debugLineNum = 39649325;BA.debugLine="Trace(\"Не удалось скачать трек. id=\" & trackId &";
__ref._trace /*String*/ (null,"Не удалось скачать трек. id="+_trackid+", message="+_j._errormessage /*String*/ );
 if (true) break;

case 35:
//C
this.state = -1;
;
RDebugUtils.currentLine=39649327;
 //BA.debugLineNum = 39649327;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=39649328;
 //BA.debugLineNum = 39649328;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=39649329;
 //BA.debugLineNum = 39649329;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=39714816;
 //BA.debugLineNum = 39714816;BA.debugLine="Private Sub UpdateTrackIndex(item As Map, trackInd";
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=39714818;
 //BA.debugLineNum = 39714818;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=39714819;
 //BA.debugLineNum = 39714819;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=39714820;
 //BA.debugLineNum = 39714820;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=39714821;
 //BA.debugLineNum = 39714821;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=39714822;
 //BA.debugLineNum = 39714822;BA.debugLine="entry.Put(\"title\", item.GetDefault(\"title\", \"\"))";
_entry.Put((Object)("title"),_item.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=39714823;
 //BA.debugLineNum = 39714823;BA.debugLine="entry.Put(\"set\", item.GetDefault(\"set\", \"\"))";
_entry.Put((Object)("set"),_item.GetDefault((Object)("set"),(Object)("")));
RDebugUtils.currentLine=39714824;
 //BA.debugLineNum = 39714824;BA.debugLine="entry.Put(\"stream\", item.GetDefault(\"stream\", \"\")";
_entry.Put((Object)("stream"),_item.GetDefault((Object)("stream"),(Object)("")));
RDebugUtils.currentLine=39714825;
 //BA.debugLineNum = 39714825;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=39714826;
 //BA.debugLineNum = 39714826;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=39714827;
 //BA.debugLineNum = 39714827;BA.debugLine="entry.Put(\"gain\", item.GetDefault(\"gain\", 0))";
_entry.Put((Object)("gain"),_item.GetDefault((Object)("gain"),(Object)(0)));
RDebugUtils.currentLine=39714828;
 //BA.debugLineNum = 39714828;BA.debugLine="trackIndex.Put(trackId, entry)";
_trackindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=39714829;
 //BA.debugLineNum = 39714829;BA.debugLine="End Sub";
return "";
}
public String  _gettracksdir(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "gettracksdir", false))
	 {return ((String) Debug.delegate(ba, "gettracksdir", null));}
RDebugUtils.currentLine=39452672;
 //BA.debugLineNum = 39452672;BA.debugLine="Public Sub GetTracksDir As String";
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
if (true) return __c.File.Combine(__c.File.Combine(__ref._storagedir /*String*/ ,__ref._mediadirname /*String*/ ),__ref._tracksdirname /*String*/ );
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="End Sub";
return "";
}
public String  _savetrackindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "savetrackindex", false))
	 {return ((String) Debug.delegate(ba, "savetrackindex", null));}
RDebugUtils.currentLine=43188224;
 //BA.debugLineNum = 43188224;BA.debugLine="Private Sub SaveTrackIndex";
RDebugUtils.currentLine=43188225;
 //BA.debugLineNum = 43188225;BA.debugLine="storage.Put(\"cached_track_index\", cachedTrackInde";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_track_index",(Object)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=43188226;
 //BA.debugLineNum = 43188226;BA.debugLine="storage.Put(\"cached_track_count\", cachedTrackInde";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_track_count",(Object)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=43188227;
 //BA.debugLineNum = 43188227;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedtrackindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedtrackindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedtrackindex", null));}
RDebugUtils.currentLine=39780352;
 //BA.debugLineNum = 39780352;BA.debugLine="Private Sub GetCachedTrackIndex As Map";
RDebugUtils.currentLine=39780353;
 //BA.debugLineNum = 39780353;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=39780354;
 //BA.debugLineNum = 39780354;BA.debugLine="cachedTrackIndex.Initialize";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=39780356;
 //BA.debugLineNum = 39780356;BA.debugLine="Return cachedTrackIndex";
if (true) return __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=39780357;
 //BA.debugLineNum = 39780357;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=43778048;
 //BA.debugLineNum = 43778048;BA.debugLine="Private Sub FinalizeCurrentCacheAuditType";
RDebugUtils.currentLine=43778049;
 //BA.debugLineNum = 43778049;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = __ref._getauditdirbytype /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=43778050;
 //BA.debugLineNum = 43778050;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = __ref._getauditindexbytype /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=43778051;
 //BA.debugLineNum = 43778051;BA.debugLine="Dim keysCopy As List";
_keyscopy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=43778052;
 //BA.debugLineNum = 43778052;BA.debugLine="keysCopy.Initialize";
_keyscopy.Initialize();
RDebugUtils.currentLine=43778053;
 //BA.debugLineNum = 43778053;BA.debugLine="For Each key As String In auditIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _auditindex.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=43778054;
 //BA.debugLineNum = 43778054;BA.debugLine="keysCopy.Add(key)";
_keyscopy.Add((Object)(_key));
 }
};
RDebugUtils.currentLine=43778056;
 //BA.debugLineNum = 43778056;BA.debugLine="For Each key As String In keysCopy";
{
final anywheresoftware.b4a.BA.IterableList group8 = _keyscopy;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=43778057;
 //BA.debugLineNum = 43778057;BA.debugLine="If cacheAuditSeenIds.ContainsKey(key) = False Th";
if (__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))==__c.False) { 
RDebugUtils.currentLine=43778058;
 //BA.debugLineNum = 43778058;BA.debugLine="If IsCachedFileUsable(auditDir, key) Then";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_key)) { 
RDebugUtils.currentLine=43778059;
 //BA.debugLineNum = 43778059;BA.debugLine="cacheAuditSeenIds.Put(key, True)";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(__c.True));
RDebugUtils.currentLine=43778060;
 //BA.debugLineNum = 43778060;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=43778062;
 //BA.debugLineNum = 43778062;BA.debugLine="auditIndex.Remove(key)";
_auditindex.Remove((Object)(_key));
RDebugUtils.currentLine=43778063;
 //BA.debugLineNum = 43778063;BA.debugLine="cacheAuditRemovedCount = cacheAuditRemovedCount";
__ref._cacheauditremovedcount /*int*/  = (int) (__ref._cacheauditremovedcount /*int*/ +1);
RDebugUtils.currentLine=43778064;
 //BA.debugLineNum = 43778064;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
__ref._markauditindexchanged /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
 };
 }
};
RDebugUtils.currentLine=43778067;
 //BA.debugLineNum = 43778067;BA.debugLine="Trace(\"Аудит кэша: каталог обработан. type=\" & ca";
__ref._trace /*String*/ (null,"Аудит кэша: каталог обработан. type="+__ref._cacheauditcurrenttype /*String*/ +", seen="+BA.NumberToString(__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=43778068;
 //BA.debugLineNum = 43778068;BA.debugLine="End Sub";
return "";
}
public String  _getauditdirbytype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getauditdirbytype", false))
	 {return ((String) Debug.delegate(ba, "getauditdirbytype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=43909120;
 //BA.debugLineNum = 43909120;BA.debugLine="Private Sub GetAuditDirByType(itemType As String)";
RDebugUtils.currentLine=43909121;
 //BA.debugLineNum = 43909121;BA.debugLine="If itemType = \"ads\" Then Return GetAdsDir";
if ((_itemtype).equals("ads")) { 
if (true) return __ref._getadsdir /*String*/ (null);};
RDebugUtils.currentLine=43909122;
 //BA.debugLineNum = 43909122;BA.debugLine="Return GetTracksDir";
if (true) return __ref._gettracksdir /*String*/ (null);
RDebugUtils.currentLine=43909123;
 //BA.debugLineNum = 43909123;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getauditindexbytype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getauditindexbytype", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getauditindexbytype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=43974656;
 //BA.debugLineNum = 43974656;BA.debugLine="Private Sub GetAuditIndexByType(itemType As String";
RDebugUtils.currentLine=43974657;
 //BA.debugLineNum = 43974657;BA.debugLine="If itemType = \"ads\" Then Return cachedAdIndex";
if ((_itemtype).equals("ads")) { 
if (true) return __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=43974658;
 //BA.debugLineNum = 43974658;BA.debugLine="Return cachedTrackIndex";
if (true) return __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=43974659;
 //BA.debugLineNum = 43974659;BA.debugLine="End Sub";
return null;
}
public String  _finishcacheaudit(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "finishcacheaudit", false))
	 {return ((String) Debug.delegate(ba, "finishcacheaudit", null));}
RDebugUtils.currentLine=43843584;
 //BA.debugLineNum = 43843584;BA.debugLine="Private Sub FinishCacheAudit";
RDebugUtils.currentLine=43843585;
 //BA.debugLineNum = 43843585;BA.debugLine="If cacheAuditAdIndexChanged Then SaveAdIndex";
if (__ref._cacheauditadindexchanged /*boolean*/ ) { 
__ref._saveadindex /*String*/ (null);};
RDebugUtils.currentLine=43843586;
 //BA.debugLineNum = 43843586;BA.debugLine="If cacheAuditTrackIndexChanged Then SaveTrackInde";
if (__ref._cacheaudittrackindexchanged /*boolean*/ ) { 
__ref._savetrackindex /*String*/ (null);};
RDebugUtils.currentLine=43843587;
 //BA.debugLineNum = 43843587;BA.debugLine="cacheAuditInProgress = False";
__ref._cacheauditinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=43843588;
 //BA.debugLineNum = 43843588;BA.debugLine="cacheAuditCurrentType = \"\"";
__ref._cacheauditcurrenttype /*String*/  = "";
RDebugUtils.currentLine=43843589;
 //BA.debugLineNum = 43843589;BA.debugLine="Trace(\"Аудит кэша завершен. added=\" & cacheAuditA";
__ref._trace /*String*/ (null,"Аудит кэша завершен. added="+BA.NumberToString(__ref._cacheauditaddedcount /*int*/ )+", removed="+BA.NumberToString(__ref._cacheauditremovedcount /*int*/ )+", tempDeleted="+BA.NumberToString(__ref._cacheaudittempdeletedcount /*int*/ )+", ads="+BA.NumberToString(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize())+", tracks="+BA.NumberToString(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=43843590;
 //BA.debugLineNum = 43843590;BA.debugLine="End Sub";
return "";
}
public String  _getdirbyitemtype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getdirbyitemtype", false))
	 {return ((String) Debug.delegate(ba, "getdirbyitemtype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=44302336;
 //BA.debugLineNum = 44302336;BA.debugLine="Private Sub GetDirByItemType(itemType As String) A";
RDebugUtils.currentLine=44302337;
 //BA.debugLineNum = 44302337;BA.debugLine="If itemType = \"ad\" Then Return GetAdsDir";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._getadsdir /*String*/ (null);};
RDebugUtils.currentLine=44302338;
 //BA.debugLineNum = 44302338;BA.debugLine="Return GetTracksDir";
if (true) return __ref._gettracksdir /*String*/ (null);
RDebugUtils.currentLine=44302339;
 //BA.debugLineNum = 44302339;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getindexbyitemtype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getindexbyitemtype", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getindexbyitemtype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=44236800;
 //BA.debugLineNum = 44236800;BA.debugLine="Private Sub GetIndexByItemType(itemType As String)";
RDebugUtils.currentLine=44236801;
 //BA.debugLineNum = 44236801;BA.debugLine="If itemType = \"ad\" Then Return cachedAdIndex";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=44236802;
 //BA.debugLineNum = 44236802;BA.debugLine="Return cachedTrackIndex";
if (true) return __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=44236803;
 //BA.debugLineNum = 44236803;BA.debugLine="End Sub";
return null;
}
public boolean  _validateindexedfile(b4j.example.mediacache __ref,String _itemtype,String _itemid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "validateindexedfile", false))
	 {return ((Boolean) Debug.delegate(ba, "validateindexedfile", new Object[] {_itemtype,_itemid}));}
anywheresoftware.b4a.objects.collections.Map _auditindex = null;
String _auditdir = "";
RDebugUtils.currentLine=44171264;
 //BA.debugLineNum = 44171264;BA.debugLine="Private Sub ValidateIndexedFile(itemType As String";
RDebugUtils.currentLine=44171265;
 //BA.debugLineNum = 44171265;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=44171266;
 //BA.debugLineNum = 44171266;BA.debugLine="Dim auditIndex As Map = GetIndexByItemType(itemTy";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = __ref._getindexbyitemtype /*anywheresoftware.b4a.objects.collections.Map*/ (null,_itemtype);
RDebugUtils.currentLine=44171267;
 //BA.debugLineNum = 44171267;BA.debugLine="If auditIndex.ContainsKey(itemId) = False Then Re";
if (_auditindex.ContainsKey((Object)(_itemid))==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=44171268;
 //BA.debugLineNum = 44171268;BA.debugLine="Dim auditDir As String = GetDirByItemType(itemTyp";
_auditdir = __ref._getdirbyitemtype /*String*/ (null,_itemtype);
RDebugUtils.currentLine=44171269;
 //BA.debugLineNum = 44171269;BA.debugLine="If IsCachedFileUsable(auditDir, itemId) Then Retu";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_itemid)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=44171270;
 //BA.debugLineNum = 44171270;BA.debugLine="auditIndex.Remove(itemId)";
_auditindex.Remove((Object)(_itemid));
RDebugUtils.currentLine=44171271;
 //BA.debugLineNum = 44171271;BA.debugLine="SaveIndexByItemType(itemType)";
__ref._saveindexbyitemtype /*String*/ (null,_itemtype);
RDebugUtils.currentLine=44171272;
 //BA.debugLineNum = 44171272;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=44171273;
 //BA.debugLineNum = 44171273;BA.debugLine="End Sub";
return false;
}
public String  _loadindexesfromstorage(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "loadindexesfromstorage", false))
	 {return ((String) Debug.delegate(ba, "loadindexesfromstorage", null));}
RDebugUtils.currentLine=43057152;
 //BA.debugLineNum = 43057152;BA.debugLine="Private Sub LoadIndexesFromStorage";
RDebugUtils.currentLine=43057153;
 //BA.debugLineNum = 43057153;BA.debugLine="cachedAdIndex = storage.GetDefault(\"cached_ad_ind";
__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_ad_index",__c.Null)));
RDebugUtils.currentLine=43057154;
 //BA.debugLineNum = 43057154;BA.debugLine="If cachedAdIndex.IsInitialized = False Then cache";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=43057155;
 //BA.debugLineNum = 43057155;BA.debugLine="cachedTrackIndex = storage.GetDefault(\"cached_tra";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_track_index",__c.Null)));
RDebugUtils.currentLine=43057156;
 //BA.debugLineNum = 43057156;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=43057157;
 //BA.debugLineNum = 43057157;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=43646976;
 //BA.debugLineNum = 43646976;BA.debugLine="Private Sub PrepareNextCacheAuditType As Boolean";
RDebugUtils.currentLine=43646977;
 //BA.debugLineNum = 43646977;BA.debugLine="If cacheAuditPendingTypes.IsInitialized = False O";
if (__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=43646978;
 //BA.debugLineNum = 43646978;BA.debugLine="cacheAuditCurrentType = cacheAuditPendingTypes.Ge";
__ref._cacheauditcurrenttype /*String*/  = BA.ObjectToString(__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=43646979;
 //BA.debugLineNum = 43646979;BA.debugLine="cacheAuditPendingTypes.RemoveAt(0)";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=43646980;
 //BA.debugLineNum = 43646980;BA.debugLine="cacheAuditCurrentPosition = 0";
__ref._cacheauditcurrentposition /*int*/  = (int) (0);
RDebugUtils.currentLine=43646981;
 //BA.debugLineNum = 43646981;BA.debugLine="cacheAuditSeenIds.Initialize";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=43646982;
 //BA.debugLineNum = 43646982;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=43646983;
 //BA.debugLineNum = 43646983;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = __ref._getauditdirbytype /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=43646984;
 //BA.debugLineNum = 43646984;BA.debugLine="Try";
try {RDebugUtils.currentLine=43646985;
 //BA.debugLineNum = 43646985;BA.debugLine="If File.Exists(auditDir, \"\") Then";
if (__c.File.Exists(_auditdir,"")) { 
RDebugUtils.currentLine=43646986;
 //BA.debugLineNum = 43646986;BA.debugLine="Dim listedFiles As List = File.ListFiles(auditD";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(_auditdir);
RDebugUtils.currentLine=43646987;
 //BA.debugLineNum = 43646987;BA.debugLine="If listedFiles.IsInitialized Then";
if (_listedfiles.IsInitialized()) { 
RDebugUtils.currentLine=43646988;
 //BA.debugLineNum = 43646988;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group12 = _listedfiles;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_filename = BA.ObjectToString(group12.Get(index12));
RDebugUtils.currentLine=43646989;
 //BA.debugLineNum = 43646989;BA.debugLine="cacheAuditCurrentFileNames.Add(fileName)";
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_filename));
 }
};
 };
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=43646994;
 //BA.debugLineNum = 43646994;BA.debugLine="Trace(\"Не удалось получить список файлов для ауд";
__ref._trace /*String*/ (null,"Не удалось получить список файлов для аудита кэша. type="+__ref._cacheauditcurrenttype /*String*/ +", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=43646996;
 //BA.debugLineNum = 43646996;BA.debugLine="Trace(\"Аудит кэша: подготовлен каталог. type=\" &";
__ref._trace /*String*/ (null,"Аудит кэша: подготовлен каталог. type="+__ref._cacheauditcurrenttype /*String*/ +", files="+BA.NumberToString(__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=43646997;
 //BA.debugLineNum = 43646997;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=43646998;
 //BA.debugLineNum = 43646998;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=43712512;
 //BA.debugLineNum = 43712512;BA.debugLine="Private Sub ProcessCurrentCacheAuditBatch";
RDebugUtils.currentLine=43712513;
 //BA.debugLineNum = 43712513;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = __ref._getauditdirbytype /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=43712514;
 //BA.debugLineNum = 43712514;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = __ref._getauditindexbytype /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=43712515;
 //BA.debugLineNum = 43712515;BA.debugLine="For i = 1 To CACHE_AUDIT_BATCH_SIZE";
{
final int step3 = 1;
final int limit3 = __ref._cache_audit_batch_size /*int*/ ;
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=43712516;
 //BA.debugLineNum = 43712516;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurren";
if (__ref._cacheauditcurrentposition /*int*/ >=__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
if (true) break;};
RDebugUtils.currentLine=43712517;
 //BA.debugLineNum = 43712517;BA.debugLine="Dim fileName As String = cacheAuditCurrentFileNa";
_filename = BA.ObjectToString(__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._cacheauditcurrentposition /*int*/ ));
RDebugUtils.currentLine=43712518;
 //BA.debugLineNum = 43712518;BA.debugLine="cacheAuditCurrentPosition = cacheAuditCurrentPos";
__ref._cacheauditcurrentposition /*int*/  = (int) (__ref._cacheauditcurrentposition /*int*/ +1);
RDebugUtils.currentLine=43712519;
 //BA.debugLineNum = 43712519;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=43712520;
 //BA.debugLineNum = 43712520;BA.debugLine="If fileName.EndsWith(\".tmp\") Then";
if (_filename.endsWith(".tmp")) { 
RDebugUtils.currentLine=43712521;
 //BA.debugLineNum = 43712521;BA.debugLine="DeleteFileIfExists(auditDir, fileName)";
__ref._deletefileifexists /*String*/ (null,_auditdir,_filename);
RDebugUtils.currentLine=43712522;
 //BA.debugLineNum = 43712522;BA.debugLine="cacheAuditTempDeletedCount = cacheAuditTempDele";
__ref._cacheaudittempdeletedcount /*int*/  = (int) (__ref._cacheaudittempdeletedcount /*int*/ +1);
RDebugUtils.currentLine=43712523;
 //BA.debugLineNum = 43712523;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
__ref._markauditindexchanged /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=43712524;
 //BA.debugLineNum = 43712524;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=43712526;
 //BA.debugLineNum = 43712526;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=43712527;
 //BA.debugLineNum = 43712527;BA.debugLine="cacheAuditSeenIds.Put(fileName, True)";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_filename),(Object)(__c.True));
RDebugUtils.currentLine=43712528;
 //BA.debugLineNum = 43712528;BA.debugLine="If auditIndex.ContainsKey(fileName) = False Then";
if (_auditindex.ContainsKey((Object)(_filename))==__c.False) { 
RDebugUtils.currentLine=43712529;
 //BA.debugLineNum = 43712529;BA.debugLine="AddIndexedFileFromAudit(cacheAuditCurrentType,";
__ref._addindexedfilefromaudit /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ ,_filename,_auditindex);
RDebugUtils.currentLine=43712530;
 //BA.debugLineNum = 43712530;BA.debugLine="cacheAuditAddedCount = cacheAuditAddedCount + 1";
__ref._cacheauditaddedcount /*int*/  = (int) (__ref._cacheauditaddedcount /*int*/ +1);
 };
 }
};
RDebugUtils.currentLine=43712533;
 //BA.debugLineNum = 43712533;BA.debugLine="End Sub";
return "";
}
public String  _saveindexbyitemtype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "saveindexbyitemtype", false))
	 {return ((String) Debug.delegate(ba, "saveindexbyitemtype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=44367872;
 //BA.debugLineNum = 44367872;BA.debugLine="Private Sub SaveIndexByItemType(itemType As String";
RDebugUtils.currentLine=44367873;
 //BA.debugLineNum = 44367873;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=44367874;
 //BA.debugLineNum = 44367874;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
 }else {
RDebugUtils.currentLine=44367876;
 //BA.debugLineNum = 44367876;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
 };
RDebugUtils.currentLine=44367878;
 //BA.debugLineNum = 44367878;BA.debugLine="End Sub";
return "";
}
}