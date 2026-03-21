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
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
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
anywheresoftware.b4a.objects.collections.Map _cachedadindex = null;
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
_cachedadindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedadindex = __ref._getcachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
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
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensureadscached"), __ref._ensuresingleadcached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_ad,_cachedadindex));
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
 //BA.debugLineNum = 37945363;BA.debugLine="storage.Put(\"cached_ad_index\", cachedAdIndex)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_ad_index",(Object)(_cachedadindex.getObject()));
RDebugUtils.currentLine=37945364;
 //BA.debugLineNum = 37945364;BA.debugLine="storage.Put(\"cached_ad_count\", cachedAdIndex.Size";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_ad_count",(Object)(_cachedadindex.getSize()));
RDebugUtils.currentLine=37945365;
 //BA.debugLineNum = 37945365;BA.debugLine="Trace(\"Синхронизация кэша рекламы завершена. down";
__ref._trace /*String*/ (null,"Синхронизация кэша рекламы завершена. downloaded="+BA.NumberToString(_downloadedcount)+", failed="+BA.NumberToString(_failedcount)+", actual="+BA.NumberToString(_cachedadindex.getSize()));
RDebugUtils.currentLine=37945366;
 //BA.debugLineNum = 37945366;BA.debugLine="Return downloadedCount > 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloadedcount>0));return;};
RDebugUtils.currentLine=37945367;
 //BA.debugLineNum = 37945367;BA.debugLine="End Sub";
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
anywheresoftware.b4a.objects.collections.Map _cachedtrackindex = null;
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
_cachedtrackindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedtrackindex = __ref._getcachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
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
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensuretrackscached"), __ref._ensuresingletrackcached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_item,_cachedtrackindex));
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
 //BA.debugLineNum = 39583770;BA.debugLine="storage.Put(\"cached_track_index\", cachedTrackInde";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_track_index",(Object)(_cachedtrackindex.getObject()));
RDebugUtils.currentLine=39583771;
 //BA.debugLineNum = 39583771;BA.debugLine="storage.Put(\"cached_track_count\", cachedTrackInde";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_track_count",(Object)(_cachedtrackindex.getSize()));
RDebugUtils.currentLine=39583772;
 //BA.debugLineNum = 39583772;BA.debugLine="Trace(\"Синхронизация кэша треков завершена. downl";
__ref._trace /*String*/ (null,"Синхронизация кэша треков завершена. downloaded="+BA.NumberToString(_downloadedcount)+", failed="+BA.NumberToString(_failedcount)+", actual="+BA.NumberToString(_cachedtrackindex.getSize()));
RDebugUtils.currentLine=39583773;
 //BA.debugLineNum = 39583773;BA.debugLine="Return downloadedCount > 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloadedcount>0));return;};
RDebugUtils.currentLine=39583774;
 //BA.debugLineNum = 39583774;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 37879815;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 38010885;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=38010886;
 //BA.debugLineNum = 38010886;BA.debugLine="If IsAdCached(itemId) = False Then Return \"\"";
if (__ref._isadcached /*boolean*/ (null,_itemid)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38010887;
 //BA.debugLineNum = 38010887;BA.debugLine="Return File.GetUri(GetAdsDir, itemId)";
if (true) return __c.File.GetUri(__ref._getadsdir /*String*/ (null),_itemid);
 };
RDebugUtils.currentLine=38010889;
 //BA.debugLineNum = 38010889;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=38010890;
 //BA.debugLineNum = 38010890;BA.debugLine="If IsTrackCached(itemId) = False Then Return \"\"";
if (__ref._istrackcached /*boolean*/ (null,_itemid)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38010891;
 //BA.debugLineNum = 38010891;BA.debugLine="Return File.GetUri(GetTracksDir, itemId)";
if (true) return __c.File.GetUri(__ref._gettracksdir /*String*/ (null),_itemid);
 };
RDebugUtils.currentLine=38010893;
 //BA.debugLineNum = 38010893;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=38010894;
 //BA.debugLineNum = 38010894;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 39518210;BA.debugLine="Return IsCachedFileUsable(GetTracksDir, trackId)";
if (true) return __ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_trackid);
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
 //BA.debugLineNum = 38076418;BA.debugLine="Return IsCachedFileUsable(GetAdsDir, adId)";
if (true) return __ref._iscachedfileusable /*boolean*/ (null,__ref._getadsdir /*String*/ (null),_adid);
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
 //BA.debugLineNum = 39911428;BA.debugLine="If IsAdCached(item.GetDefault(\"id\", \"\")) Then Re";
if (__ref._isadcached /*boolean*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))) { 
if (true) return "cache";};
RDebugUtils.currentLine=39911429;
 //BA.debugLineNum = 39911429;BA.debugLine="Return \"cdn\"";
if (true) return "cdn";
 };
RDebugUtils.currentLine=39911431;
 //BA.debugLineNum = 39911431;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=39911432;
 //BA.debugLineNum = 39911432;BA.debugLine="If IsTrackCached(item.GetDefault(\"id\", \"\")) Then";
if (__ref._istrackcached /*boolean*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))) { 
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
 //BA.debugLineNum = 37814280;BA.debugLine="End Sub";
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
anywheresoftware.b4a.objects.collections.Map _cachedadindex = null;
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Private Sub GetCachedAdIndex As Map";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="Dim cachedAdIndex As Map = storage.GetDefault(\"ca";
_cachedadindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedadindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_ad_index",__c.Null)));
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="If cachedAdIndex.IsInitialized = False Then";
if (_cachedadindex.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=38338563;
 //BA.debugLineNum = 38338563;BA.debugLine="cachedAdIndex.Initialize";
_cachedadindex.Initialize();
 };
RDebugUtils.currentLine=38338565;
 //BA.debugLineNum = 38338565;BA.debugLine="Return cachedAdIndex";
if (true) return _cachedadindex;
RDebugUtils.currentLine=38338566;
 //BA.debugLineNum = 38338566;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuresingleadcached(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _cachedadindex) throws Exception{
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuresingleadcached", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuresingleadcached", new Object[] {_ad,_cachedadindex}));}
ResumableSub_EnsureSingleAdCached rsub = new ResumableSub_EnsureSingleAdCached(this,__ref,_ad,_cachedadindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureSingleAdCached extends BA.ResumableSub {
public ResumableSub_EnsureSingleAdCached(b4j.example.mediacache parent,b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _cachedadindex) {
this.parent = parent;
this.__ref = __ref;
this._ad = _ad;
this._cachedadindex = _cachedadindex;
this.__ref = parent;
}
b4j.example.mediacache __ref;
b4j.example.mediacache parent;
anywheresoftware.b4a.objects.collections.Map _ad;
anywheresoftware.b4a.objects.collections.Map _cachedadindex;
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
 //BA.debugLineNum = 38207492;BA.debugLine="UpdateAdIndex(ad, cachedAdIndex)";
__ref._updateadindex /*String*/ (null,_ad,_cachedadindex);
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
 //BA.debugLineNum = 38207523;BA.debugLine="UpdateAdIndex(ad, cachedAdIndex)";
__ref._updateadindex /*String*/ (null,_ad,_cachedadindex);
RDebugUtils.currentLine=38207524;
 //BA.debugLineNum = 38207524;BA.debugLine="Trace(\"Реклама сохранена в кэш. id=\" & adId)";
__ref._trace /*String*/ (null,"Реклама сохранена в кэш. id="+_adid);
RDebugUtils.currentLine=38207525;
 //BA.debugLineNum = 38207525;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38207526;
 //BA.debugLineNum = 38207526;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
RDebugUtils.currentLine=38207528;
 //BA.debugLineNum = 38207528;BA.debugLine="DeleteFileIfExists(GetAdsDir, BuildTempCacheFil";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),__ref._buildtempcachefilename /*String*/ (null,_adid));
RDebugUtils.currentLine=38207529;
 //BA.debugLineNum = 38207529;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=\"";
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
RDebugUtils.currentLine=38207532;
 //BA.debugLineNum = 38207532;BA.debugLine="Trace(\"Не удалось скачать рекламу. id=\" & adId &";
__ref._trace /*String*/ (null,"Не удалось скачать рекламу. id="+_adid+", message="+_j._errormessage /*String*/ );
 if (true) break;

case 35:
//C
this.state = -1;
;
RDebugUtils.currentLine=38207534;
 //BA.debugLineNum = 38207534;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38207535;
 //BA.debugLineNum = 38207535;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=38207536;
 //BA.debugLineNum = 38207536;BA.debugLine="End Sub";
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
public String  _updateadindex(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _cachedadindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "updateadindex", false))
	 {return ((String) Debug.delegate(ba, "updateadindex", new Object[] {_ad,_cachedadindex}));}
String _adid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Private Sub UpdateAdIndex(ad As Map, cachedAdIndex";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="If adId = \"\" Then Return";
if ((_adid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38273028;
 //BA.debugLineNum = 38273028;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=38273029;
 //BA.debugLineNum = 38273029;BA.debugLine="entry.Put(\"id\", adId)";
_entry.Put((Object)("id"),(Object)(_adid));
RDebugUtils.currentLine=38273030;
 //BA.debugLineNum = 38273030;BA.debugLine="entry.Put(\"title\", ad.GetDefault(\"title\", \"\"))";
_entry.Put((Object)("title"),_ad.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=38273031;
 //BA.debugLineNum = 38273031;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=38273032;
 //BA.debugLineNum = 38273032;BA.debugLine="entry.Put(\"duration\", ad.GetDefault(\"duration\", 0";
_entry.Put((Object)("duration"),_ad.GetDefault((Object)("duration"),(Object)(0)));
RDebugUtils.currentLine=38273033;
 //BA.debugLineNum = 38273033;BA.debugLine="entry.Put(\"gain\", ad.GetDefault(\"gain\", 0))";
_entry.Put((Object)("gain"),_ad.GetDefault((Object)("gain"),(Object)(0)));
RDebugUtils.currentLine=38273034;
 //BA.debugLineNum = 38273034;BA.debugLine="cachedAdIndex.Put(adId, entry)";
_cachedadindex.Put((Object)(_adid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=38273035;
 //BA.debugLineNum = 38273035;BA.debugLine="End Sub";
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
__c.LogImpl("441418758",__c.LastException(ba).getMessage(),0);
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
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Private Sub ReplaceCacheFile(dir As String, tempFi";
RDebugUtils.currentLine=41549825;
 //BA.debugLineNum = 41549825;BA.debugLine="If IsCachedFileUsable(dir, tempFileName) = False";
if (__ref._iscachedfileusable /*boolean*/ (null,_dir,_tempfilename)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=41549826;
 //BA.debugLineNum = 41549826;BA.debugLine="DeleteFileIfExists(dir, finalFileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_finalfilename);
RDebugUtils.currentLine=41549827;
 //BA.debugLineNum = 41549827;BA.debugLine="Dim tempFile As JavaObject";
_tempfile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=41549828;
 //BA.debugLineNum = 41549828;BA.debugLine="tempFile.InitializeNewInstance(\"java.io.File\", Ar";
_tempfile.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_dir,_tempfilename))});
RDebugUtils.currentLine=41549829;
 //BA.debugLineNum = 41549829;BA.debugLine="Dim finalFile As JavaObject";
_finalfile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=41549830;
 //BA.debugLineNum = 41549830;BA.debugLine="finalFile.InitializeNewInstance(\"java.io.File\", A";
_finalfile.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_dir,_finalfilename))});
RDebugUtils.currentLine=41549831;
 //BA.debugLineNum = 41549831;BA.debugLine="Return tempFile.RunMethod(\"renameTo\", Array As Ob";
if (true) return BA.ObjectToBoolean(_tempfile.RunMethod("renameTo",new Object[]{(Object)(_finalfile.getObject())}));
RDebugUtils.currentLine=41549832;
 //BA.debugLineNum = 41549832;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuresingletrackcached(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _cachedtrackindex) throws Exception{
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuresingletrackcached", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuresingletrackcached", new Object[] {_item,_cachedtrackindex}));}
ResumableSub_EnsureSingleTrackCached rsub = new ResumableSub_EnsureSingleTrackCached(this,__ref,_item,_cachedtrackindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureSingleTrackCached extends BA.ResumableSub {
public ResumableSub_EnsureSingleTrackCached(b4j.example.mediacache parent,b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _cachedtrackindex) {
this.parent = parent;
this.__ref = __ref;
this._item = _item;
this._cachedtrackindex = _cachedtrackindex;
this.__ref = parent;
}
b4j.example.mediacache __ref;
b4j.example.mediacache parent;
anywheresoftware.b4a.objects.collections.Map _item;
anywheresoftware.b4a.objects.collections.Map _cachedtrackindex;
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
 //BA.debugLineNum = 39649284;BA.debugLine="UpdateTrackIndex(item, cachedTrackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_cachedtrackindex);
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
 //BA.debugLineNum = 39649315;BA.debugLine="UpdateTrackIndex(item, cachedTrackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_cachedtrackindex);
RDebugUtils.currentLine=39649316;
 //BA.debugLineNum = 39649316;BA.debugLine="Trace(\"Трек сохранен в кэш. id=\" & trackId)";
__ref._trace /*String*/ (null,"Трек сохранен в кэш. id="+_trackid);
RDebugUtils.currentLine=39649317;
 //BA.debugLineNum = 39649317;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=39649318;
 //BA.debugLineNum = 39649318;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
RDebugUtils.currentLine=39649320;
 //BA.debugLineNum = 39649320;BA.debugLine="DeleteFileIfExists(GetTracksDir, BuildTempCache";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),__ref._buildtempcachefilename /*String*/ (null,_trackid));
RDebugUtils.currentLine=39649321;
 //BA.debugLineNum = 39649321;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
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
RDebugUtils.currentLine=39649324;
 //BA.debugLineNum = 39649324;BA.debugLine="Trace(\"Не удалось скачать трек. id=\" & trackId &";
__ref._trace /*String*/ (null,"Не удалось скачать трек. id="+_trackid+", message="+_j._errormessage /*String*/ );
 if (true) break;

case 35:
//C
this.state = -1;
;
RDebugUtils.currentLine=39649326;
 //BA.debugLineNum = 39649326;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=39649327;
 //BA.debugLineNum = 39649327;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=39649328;
 //BA.debugLineNum = 39649328;BA.debugLine="End Sub";
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
public String  _updatetrackindex(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _cachedtrackindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "updatetrackindex", false))
	 {return ((String) Debug.delegate(ba, "updatetrackindex", new Object[] {_item,_cachedtrackindex}));}
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=39714816;
 //BA.debugLineNum = 39714816;BA.debugLine="Private Sub UpdateTrackIndex(item As Map, cachedTr";
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=39714818;
 //BA.debugLineNum = 39714818;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=39714819;
 //BA.debugLineNum = 39714819;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=39714820;
 //BA.debugLineNum = 39714820;BA.debugLine="entry.Initialize";
_entry.Initialize();
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
 //BA.debugLineNum = 39714825;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=39714826;
 //BA.debugLineNum = 39714826;BA.debugLine="entry.Put(\"gain\", item.GetDefault(\"gain\", 0))";
_entry.Put((Object)("gain"),_item.GetDefault((Object)("gain"),(Object)(0)));
RDebugUtils.currentLine=39714827;
 //BA.debugLineNum = 39714827;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
_cachedtrackindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=39714828;
 //BA.debugLineNum = 39714828;BA.debugLine="End Sub";
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
public anywheresoftware.b4a.objects.collections.Map  _getcachedtrackindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedtrackindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedtrackindex", null));}
anywheresoftware.b4a.objects.collections.Map _cachedtrackindex = null;
RDebugUtils.currentLine=39780352;
 //BA.debugLineNum = 39780352;BA.debugLine="Private Sub GetCachedTrackIndex As Map";
RDebugUtils.currentLine=39780353;
 //BA.debugLineNum = 39780353;BA.debugLine="Dim cachedTrackIndex As Map = storage.GetDefault(";
_cachedtrackindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedtrackindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_track_index",__c.Null)));
RDebugUtils.currentLine=39780354;
 //BA.debugLineNum = 39780354;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then";
if (_cachedtrackindex.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=39780355;
 //BA.debugLineNum = 39780355;BA.debugLine="cachedTrackIndex.Initialize";
_cachedtrackindex.Initialize();
 };
RDebugUtils.currentLine=39780357;
 //BA.debugLineNum = 39780357;BA.debugLine="Return cachedTrackIndex";
if (true) return _cachedtrackindex;
RDebugUtils.currentLine=39780358;
 //BA.debugLineNum = 39780358;BA.debugLine="End Sub";
return null;
}
}