package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mediacache_subs_0 {


public static RemoteObject  _addindexedfilefromaudit(RemoteObject __ref,RemoteObject _itemtype,RemoteObject _filename,RemoteObject _auditindex) throws Exception{
try {
		Debug.PushSubsStack("AddIndexedFileFromAudit (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,546);
if (RapidSub.canDelegate("addindexedfilefromaudit")) { return __ref.runUserSub(false, "mediacache","addindexedfilefromaudit", __ref, _itemtype, _filename, _auditindex);}
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("itemType", _itemtype);
Debug.locals.put("fileName", _filename);
Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 546;BA.debugLine="Private Sub AddIndexedFileFromAudit(itemType As St";
Debug.ShouldStop(2);
 BA.debugLineNum = 547;BA.debugLine="Dim entry As Map";
Debug.ShouldStop(4);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("entry", _entry);
 BA.debugLineNum = 548;BA.debugLine="entry.Initialize";
Debug.ShouldStop(8);
_entry.runVoidMethod ("Initialize");
 BA.debugLineNum = 549;BA.debugLine="entry.Put(\"id\", fileName)";
Debug.ShouldStop(16);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_filename)));
 BA.debugLineNum = 550;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
Debug.ShouldStop(32);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 551;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(64);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 552;BA.debugLine="If itemType = \"ads\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ads"))) { 
 BA.debugLineNum = 553;BA.debugLine="entry.Put(\"title\", \"\")";
Debug.ShouldStop(256);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 554;BA.debugLine="entry.Put(\"duration\", 0)";
Debug.ShouldStop(512);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 555;BA.debugLine="entry.Put(\"gain\", 0)";
Debug.ShouldStop(1024);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))));
 }else {
 BA.debugLineNum = 557;BA.debugLine="entry.Put(\"title\", \"\")";
Debug.ShouldStop(4096);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 558;BA.debugLine="entry.Put(\"set\", \"\")";
Debug.ShouldStop(8192);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("set"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 559;BA.debugLine="entry.Put(\"stream\", \"\")";
Debug.ShouldStop(16384);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 560;BA.debugLine="entry.Put(\"gain\", 0)";
Debug.ShouldStop(32768);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))));
 };
 BA.debugLineNum = 562;BA.debugLine="auditIndex.Put(fileName, entry)";
Debug.ShouldStop(131072);
_auditindex.runVoidMethod ("Put",(Object)((_filename)),(Object)((_entry.getObject())));
 BA.debugLineNum = 563;BA.debugLine="MarkAuditIndexChanged(itemType)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.mediacache.class, "_markauditindexchanged" /*RemoteObject*/ ,(Object)(_itemtype));
 BA.debugLineNum = 564;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildadurl(RemoteObject __ref,RemoteObject _adid) throws Exception{
try {
		Debug.PushSubsStack("BuildAdUrl (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("buildadurl")) { return __ref.runUserSub(false, "mediacache","buildadurl", __ref, _adid);}
RemoteObject _first = RemoteObject.createImmutable("");
Debug.locals.put("adId", _adid);
 BA.debugLineNum = 350;BA.debugLine="Private Sub BuildAdUrl(adId As String) As String";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 351;BA.debugLine="If adId = \"\" Then Return \"\"";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 352;BA.debugLine="Dim first As String = adId.SubString2(0, 1)";
Debug.ShouldStop(-2147483648);
_first = _adid.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 353;BA.debugLine="Return \"https://cdn.fon.fm/media/ads/\" & first &";
Debug.ShouldStop(1);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("https://cdn.fon.fm/media/ads/"),_first,RemoteObject.createImmutable("/"),_adid,RemoteObject.createImmutable(".mp3"));
 BA.debugLineNum = 354;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtempcachefilename(RemoteObject __ref,RemoteObject _itemid) throws Exception{
try {
		Debug.PushSubsStack("BuildTempCacheFileName (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,374);
if (RapidSub.canDelegate("buildtempcachefilename")) { return __ref.runUserSub(false, "mediacache","buildtempcachefilename", __ref, _itemid);}
Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 374;BA.debugLine="Private Sub BuildTempCacheFileName(itemId As Strin";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 375;BA.debugLine="Return itemId & \".tmp\"";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.concat(_itemid,RemoteObject.createImmutable(".tmp"));
 BA.debugLineNum = 376;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtrackurl(RemoteObject __ref,RemoteObject _trackid) throws Exception{
try {
		Debug.PushSubsStack("BuildTrackUrl (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,356);
if (RapidSub.canDelegate("buildtrackurl")) { return __ref.runUserSub(false, "mediacache","buildtrackurl", __ref, _trackid);}
RemoteObject _first = RemoteObject.createImmutable("");
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 356;BA.debugLine="Private Sub BuildTrackUrl(trackId As String) As St";
Debug.ShouldStop(8);
 BA.debugLineNum = 357;BA.debugLine="If trackId = \"\" Then Return \"\"";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 358;BA.debugLine="Dim first As String = trackId.SubString2(0, 1)";
Debug.ShouldStop(32);
_first = _trackid.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 359;BA.debugLine="Return \"https://cdn.fon.fm/media/tracks/\" & first";
Debug.ShouldStop(64);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("https://cdn.fon.fm/media/tracks/"),_first,RemoteObject.createImmutable("/"),_trackid,RemoteObject.createImmutable(".mp3"));
 BA.debugLineNum = 360;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private storageDir As String";
mediacache._storagedir = RemoteObject.createImmutable("");__ref.setField("_storagedir",mediacache._storagedir);
 //BA.debugLineNum = 4;BA.debugLine="Private storage As KeyValueStore";
mediacache._storage = RemoteObject.createNew ("b4j.example.keyvaluestore");__ref.setField("_storage",mediacache._storage);
 //BA.debugLineNum = 5;BA.debugLine="Private targetModule As Object";
mediacache._targetmodule = RemoteObject.createNew ("Object");__ref.setField("_targetmodule",mediacache._targetmodule);
 //BA.debugLineNum = 6;BA.debugLine="Private traceSubName As String";
mediacache._tracesubname = RemoteObject.createImmutable("");__ref.setField("_tracesubname",mediacache._tracesubname);
 //BA.debugLineNum = 7;BA.debugLine="Private mediaDirName As String = \"media\"";
mediacache._mediadirname = BA.ObjectToString("media");__ref.setField("_mediadirname",mediacache._mediadirname);
 //BA.debugLineNum = 8;BA.debugLine="Private adsDirName As String = \"ads\"";
mediacache._adsdirname = BA.ObjectToString("ads");__ref.setField("_adsdirname",mediacache._adsdirname);
 //BA.debugLineNum = 9;BA.debugLine="Private tracksDirName As String = \"tracks\"";
mediacache._tracksdirname = BA.ObjectToString("tracks");__ref.setField("_tracksdirname",mediacache._tracksdirname);
 //BA.debugLineNum = 10;BA.debugLine="Private Const CACHE_AUDIT_BATCH_SIZE As Int = 8";
mediacache._cache_audit_batch_size = BA.numberCast(int.class, 8);__ref.setField("_cache_audit_batch_size",mediacache._cache_audit_batch_size);
 //BA.debugLineNum = 11;BA.debugLine="Private cachedAdIndex As Map";
mediacache._cachedadindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cachedadindex",mediacache._cachedadindex);
 //BA.debugLineNum = 12;BA.debugLine="Private cachedTrackIndex As Map";
mediacache._cachedtrackindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cachedtrackindex",mediacache._cachedtrackindex);
 //BA.debugLineNum = 13;BA.debugLine="Private cacheAuditInProgress As Boolean";
mediacache._cacheauditinprogress = RemoteObject.createImmutable(false);__ref.setField("_cacheauditinprogress",mediacache._cacheauditinprogress);
 //BA.debugLineNum = 14;BA.debugLine="Private cacheAuditPendingTypes As List";
mediacache._cacheauditpendingtypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_cacheauditpendingtypes",mediacache._cacheauditpendingtypes);
 //BA.debugLineNum = 15;BA.debugLine="Private cacheAuditCurrentType As String";
mediacache._cacheauditcurrenttype = RemoteObject.createImmutable("");__ref.setField("_cacheauditcurrenttype",mediacache._cacheauditcurrenttype);
 //BA.debugLineNum = 16;BA.debugLine="Private cacheAuditCurrentFileNames As List";
mediacache._cacheauditcurrentfilenames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_cacheauditcurrentfilenames",mediacache._cacheauditcurrentfilenames);
 //BA.debugLineNum = 17;BA.debugLine="Private cacheAuditCurrentPosition As Int";
mediacache._cacheauditcurrentposition = RemoteObject.createImmutable(0);__ref.setField("_cacheauditcurrentposition",mediacache._cacheauditcurrentposition);
 //BA.debugLineNum = 18;BA.debugLine="Private cacheAuditSeenIds As Map";
mediacache._cacheauditseenids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cacheauditseenids",mediacache._cacheauditseenids);
 //BA.debugLineNum = 19;BA.debugLine="Private cacheAuditAdIndexChanged As Boolean";
mediacache._cacheauditadindexchanged = RemoteObject.createImmutable(false);__ref.setField("_cacheauditadindexchanged",mediacache._cacheauditadindexchanged);
 //BA.debugLineNum = 20;BA.debugLine="Private cacheAuditTrackIndexChanged As Boolean";
mediacache._cacheaudittrackindexchanged = RemoteObject.createImmutable(false);__ref.setField("_cacheaudittrackindexchanged",mediacache._cacheaudittrackindexchanged);
 //BA.debugLineNum = 21;BA.debugLine="Private cacheAuditAddedCount As Int";
mediacache._cacheauditaddedcount = RemoteObject.createImmutable(0);__ref.setField("_cacheauditaddedcount",mediacache._cacheauditaddedcount);
 //BA.debugLineNum = 22;BA.debugLine="Private cacheAuditRemovedCount As Int";
mediacache._cacheauditremovedcount = RemoteObject.createImmutable(0);__ref.setField("_cacheauditremovedcount",mediacache._cacheauditremovedcount);
 //BA.debugLineNum = 23;BA.debugLine="Private cacheAuditTempDeletedCount As Int";
mediacache._cacheaudittempdeletedcount = RemoteObject.createImmutable(0);__ref.setField("_cacheaudittempdeletedcount",mediacache._cacheaudittempdeletedcount);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _deletefileifexists(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DeleteFileIfExists (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,397);
if (RapidSub.canDelegate("deletefileifexists")) { return __ref.runUserSub(false, "mediacache","deletefileifexists", __ref, _dir, _filename);}
Debug.locals.put("dir", _dir);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 397;BA.debugLine="Private Sub DeleteFileIfExists(dir As String, file";
Debug.ShouldStop(4096);
 BA.debugLineNum = 398;BA.debugLine="If fileName = \"\" Then Return";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 399;BA.debugLine="If File.Exists(dir, fileName) Then File.Delete(di";
Debug.ShouldStop(16384);
if (mediacache.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_dir),(Object)(_filename)).<Boolean>get().booleanValue()) { 
mediacache.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_dir),(Object)(_filename));};
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ensureadscached(RemoteObject __ref,RemoteObject _offlinedata) throws Exception{
try {
		Debug.PushSubsStack("EnsureAdsCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("ensureadscached")) { return __ref.runUserSub(false, "mediacache","ensureadscached", __ref, _offlinedata);}
ResumableSub_EnsureAdsCached rsub = new ResumableSub_EnsureAdsCached(null,__ref,_offlinedata);
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
public static class ResumableSub_EnsureAdsCached extends BA.ResumableSub {
public ResumableSub_EnsureAdsCached(b4j.example.mediacache parent,RemoteObject __ref,RemoteObject _offlinedata) {
this.parent = parent;
this.__ref = __ref;
this._offlinedata = _offlinedata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.mediacache parent;
RemoteObject _offlinedata;
RemoteObject _ads = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _downloadedcount = RemoteObject.createImmutable(0);
RemoteObject _failedcount = RemoteObject.createImmutable(0);
RemoteObject _adobject = RemoteObject.declareNull("Object");
RemoteObject _ad = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _downloaded = RemoteObject.createImmutable(false);
RemoteObject group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureAdsCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,78);
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
 BA.debugLineNum = 79;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False"))) { 
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
 BA.debugLineNum = 80;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ok"))),(Object)((parent.__c.getField(true,"False")))),(parent.__c.getField(true,"True")))) { 
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
this.state = 13;
;
 BA.debugLineNum = 81;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
Debug.ShouldStop(65536);
_ads = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ads = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ads"))),(Object)(parent.__c.getField(false,"Null"))));Debug.locals.put("ads", _ads);Debug.locals.put("ads", _ads);
 BA.debugLineNum = 82;BA.debugLine="If ads.IsInitialized = False Or ads.Size = 0 Then";
Debug.ShouldStop(131072);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_ads.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_ads.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 83;BA.debugLine="Dim cachedAdIndex As Map = GetCachedAdIndex";
Debug.ShouldStop(262144);
parent._cachedadindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
parent._cachedadindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getcachedadindex" /*RemoteObject*/ );__ref.setField("_cachedadindex",parent._cachedadindex);
 BA.debugLineNum = 84;BA.debugLine="Dim downloadedCount As Int = 0";
Debug.ShouldStop(524288);
_downloadedcount = BA.numberCast(int.class, 0);Debug.locals.put("downloadedCount", _downloadedcount);Debug.locals.put("downloadedCount", _downloadedcount);
 BA.debugLineNum = 85;BA.debugLine="Dim failedCount As Int = 0";
Debug.ShouldStop(1048576);
_failedcount = BA.numberCast(int.class, 0);Debug.locals.put("failedCount", _failedcount);Debug.locals.put("failedCount", _failedcount);
 BA.debugLineNum = 86;BA.debugLine="For Each adObject As Object In ads";
Debug.ShouldStop(2097152);
if (true) break;

case 19:
//for
this.state = 32;
group8 = _ads;
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("adObject", _adobject);
this.state = 33;
if (true) break;

case 33:
//C
this.state = 32;
if (index8 < groupLen8) {
this.state = 21;
_adobject = group8.runMethod(false,"Get",index8);Debug.locals.put("adObject", _adobject);}
if (true) break;

case 34:
//C
this.state = 33;
index8++;
Debug.locals.put("adObject", _adobject);
if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 87;BA.debugLine="If adObject Is Map Then";
Debug.ShouldStop(4194304);
if (true) break;

case 22:
//if
this.state = 31;
if (RemoteObject.solveBoolean("i",_adobject, RemoteObject.createImmutable("java.util.Map"))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 88;BA.debugLine="Dim ad As Map = adObject";
Debug.ShouldStop(8388608);
_ad = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ad = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _adobject);Debug.locals.put("ad", _ad);Debug.locals.put("ad", _ad);
 BA.debugLineNum = 89;BA.debugLine="Wait For (EnsureSingleAdCached(ad, cachedAdInde";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensureadscached"), __ref.runClassMethod (b4j.example.mediacache.class, "_ensuresingleadcached" /*RemoteObject*/ ,(Object)(_ad),(Object)(__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ))));
this.state = 35;
return;
case 35:
//C
this.state = 25;
_downloaded = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("downloaded", _downloaded);
;
 BA.debugLineNum = 90;BA.debugLine="If downloaded Then";
Debug.ShouldStop(33554432);
if (true) break;

case 25:
//if
this.state = 30;
if (_downloaded.<Boolean>get().booleanValue()) { 
this.state = 27;
}else 
{ BA.debugLineNum = 92;BA.debugLine="Else If IsAdCached(ad.GetDefault(\"id\", \"\")) = F";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_isadcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))),parent.__c.getField(true,"False"))) { 
this.state = 29;
}}
if (true) break;

case 27:
//C
this.state = 30;
 BA.debugLineNum = 91;BA.debugLine="downloadedCount = downloadedCount + 1";
Debug.ShouldStop(67108864);
_downloadedcount = RemoteObject.solve(new RemoteObject[] {_downloadedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("downloadedCount", _downloadedcount);
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 93;BA.debugLine="failedCount = failedCount + 1";
Debug.ShouldStop(268435456);
_failedcount = RemoteObject.solve(new RemoteObject[] {_failedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("failedCount", _failedcount);
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
Debug.locals.put("adObject", _adobject);
;
 BA.debugLineNum = 97;BA.debugLine="SaveAdIndex";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );
 BA.debugLineNum = 98;BA.debugLine="Trace(\"Синхронизация кэша рекламы завершена. down";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Синхронизация кэша рекламы завершена. downloaded="),_downloadedcount,RemoteObject.createImmutable(", failed="),_failedcount,RemoteObject.createImmutable(", actual="),__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 99;BA.debugLine="Return downloadedCount > 0";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((RemoteObject.solveBoolean(">",_downloadedcount,BA.numberCast(double.class, 0)))));return;};
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _ensuredirectory(RemoteObject __ref,RemoteObject _path) throws Exception{
try {
		Debug.PushSubsStack("EnsureDirectory (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,445);
if (RapidSub.canDelegate("ensuredirectory")) { return __ref.runUserSub(false, "mediacache","ensuredirectory", __ref, _path);}
RemoteObject _fileobject = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("path", _path);
 BA.debugLineNum = 445;BA.debugLine="Private Sub EnsureDirectory(path As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 446;BA.debugLine="Dim fileObject As JavaObject";
Debug.ShouldStop(536870912);
_fileobject = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("fileObject", _fileobject);
 BA.debugLineNum = 447;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
Debug.ShouldStop(1073741824);
_fileobject.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_path)})));
 BA.debugLineNum = 448;BA.debugLine="fileObject.RunMethod(\"mkdirs\", Null)";
Debug.ShouldStop(-2147483648);
_fileobject.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("mkdirs")),(Object)((mediacache.__c.getField(false,"Null"))));
 BA.debugLineNum = 449;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ensuresingleadcached(RemoteObject __ref,RemoteObject _ad,RemoteObject _adindex) throws Exception{
try {
		Debug.PushSubsStack("EnsureSingleAdCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("ensuresingleadcached")) { return __ref.runUserSub(false, "mediacache","ensuresingleadcached", __ref, _ad, _adindex);}
ResumableSub_EnsureSingleAdCached rsub = new ResumableSub_EnsureSingleAdCached(null,__ref,_ad,_adindex);
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
public static class ResumableSub_EnsureSingleAdCached extends BA.ResumableSub {
public ResumableSub_EnsureSingleAdCached(b4j.example.mediacache parent,RemoteObject __ref,RemoteObject _ad,RemoteObject _adindex) {
this.parent = parent;
this.__ref = __ref;
this._ad = _ad;
this._adindex = _adindex;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.mediacache parent;
RemoteObject _ad;
RemoteObject _adindex;
RemoteObject _adid = RemoteObject.createImmutable("");
RemoteObject _adurl = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _tempfilename = RemoteObject.createImmutable("");
RemoteObject _outstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureSingleAdCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,172);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("ad", _ad);
Debug.locals.put("adIndex", _adindex);
 BA.debugLineNum = 173;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
Debug.ShouldStop(4096);
_adid = BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("adId", _adid);Debug.locals.put("adId", _adid);
 BA.debugLineNum = 174;BA.debugLine="If adId = \"\" Then Return False";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
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
 BA.debugLineNum = 175;BA.debugLine="If IsAdCached(adId) Then";
Debug.ShouldStop(16384);
if (true) break;

case 7:
//if
this.state = 10;
if (__ref.runClassMethod (b4j.example.mediacache.class, "_isadcached" /*RemoteObject*/ ,(Object)(_adid)).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 176;BA.debugLine="UpdateAdIndex(ad, adIndex)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_ad),(Object)(_adindex));
 BA.debugLineNum = 177;BA.debugLine="Return False";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 179;BA.debugLine="Dim adUrl As String = BuildAdUrl(adId)";
Debug.ShouldStop(262144);
_adurl = __ref.runClassMethod (b4j.example.mediacache.class, "_buildadurl" /*RemoteObject*/ ,(Object)(_adid));Debug.locals.put("adUrl", _adurl);Debug.locals.put("adUrl", _adurl);
 BA.debugLineNum = 180;BA.debugLine="If adUrl = \"\" Then Return False";
Debug.ShouldStop(524288);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_adurl,BA.ObjectToString(""))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 181;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(1048576);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 182;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(2097152);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 183;BA.debugLine="Trace(\"Скачивание рекламы в кэш. id=\" & adId & \",";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Скачивание рекламы в кэш. id="),_adid,RemoteObject.createImmutable(", url="),_adurl)));
 BA.debugLineNum = 184;BA.debugLine="j.Download(adUrl)";
Debug.ShouldStop(8388608);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_adurl));
 BA.debugLineNum = 185;BA.debugLine="j.GetRequest.Timeout = 15000";
Debug.ShouldStop(16777216);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 186;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensuresingleadcached"), (_j));
this.state = 36;
return;
case 36:
//C
this.state = 17;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 187;BA.debugLine="If j.Success Then";
Debug.ShouldStop(67108864);
if (true) break;

case 17:
//if
this.state = 35;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 19;
}else {
this.state = 34;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 188;BA.debugLine="Try";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 189;BA.debugLine="EnsureDirectory(GetAdsDir)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )));
 BA.debugLineNum = 190;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
Debug.ShouldStop(536870912);
_tempfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_adid));Debug.locals.put("tempFileName", _tempfilename);Debug.locals.put("tempFileName", _tempfilename);
 BA.debugLineNum = 191;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 192;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
Debug.ShouldStop(-2147483648);
_outstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_outstream = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("outStream", _outstream);Debug.locals.put("outStream", _outstream);
 BA.debugLineNum = 193;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
Debug.ShouldStop(1);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (b4j.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_outstream.getObject())));
 BA.debugLineNum = 194;BA.debugLine="outStream.Close";
Debug.ShouldStop(2);
_outstream.runVoidMethod ("Close");
 BA.debugLineNum = 195;BA.debugLine="If IsCachedFileUsable(GetAdsDir, tempFileName)";
Debug.ShouldStop(4);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename)),parent.__c.getField(true,"False"))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 196;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 197;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить рекламу в кэш. id="),_adid,RemoteObject.createImmutable(", message=empty temp file"))));
 BA.debugLineNum = 198;BA.debugLine="j.Release";
Debug.ShouldStop(32);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 199;BA.debugLine="Return False";
Debug.ShouldStop(64);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 201;BA.debugLine="If ReplaceCacheFile(GetAdsDir, tempFileName, ad";
Debug.ShouldStop(256);

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_replacecachefile" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(_adid)),parent.__c.getField(true,"False"))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 202;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 203;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить рекламу в кэш. id="),_adid,RemoteObject.createImmutable(", message=rename failed"))));
 BA.debugLineNum = 204;BA.debugLine="j.Release";
Debug.ShouldStop(2048);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 205;BA.debugLine="Return False";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 29:
//C
this.state = 32;
;
 BA.debugLineNum = 207;BA.debugLine="UpdateAdIndex(ad, adIndex)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_ad),(Object)(_adindex));
 BA.debugLineNum = 208;BA.debugLine="SaveAdIndex";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );
 BA.debugLineNum = 209;BA.debugLine="Trace(\"Реклама сохранена в кэш. id=\" & adId)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Реклама сохранена в кэш. id="),_adid)));
 BA.debugLineNum = 210;BA.debugLine="j.Release";
Debug.ShouldStop(131072);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 211;BA.debugLine="Return True";
Debug.ShouldStop(262144);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
 BA.debugLineNum = 213;BA.debugLine="DeleteFileIfExists(GetAdsDir, BuildTempCacheFil";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_adid))));
 BA.debugLineNum = 214;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=\"";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить рекламу в кэш. id="),_adid,RemoteObject.createImmutable(", message="),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
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
 BA.debugLineNum = 217;BA.debugLine="Trace(\"Не удалось скачать рекламу. id=\" & adId &";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось скачать рекламу. id="),_adid,RemoteObject.createImmutable(", message="),_j.getField(true,"_errormessage" /*RemoteObject*/ ))));
 if (true) break;

case 35:
//C
this.state = -1;
;
 BA.debugLineNum = 219;BA.debugLine="j.Release";
Debug.ShouldStop(67108864);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 220;BA.debugLine="Return False";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _ensuresingletrackcached(RemoteObject __ref,RemoteObject _item,RemoteObject _trackindex) throws Exception{
try {
		Debug.PushSubsStack("EnsureSingleTrackCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("ensuresingletrackcached")) { return __ref.runUserSub(false, "mediacache","ensuresingletrackcached", __ref, _item, _trackindex);}
ResumableSub_EnsureSingleTrackCached rsub = new ResumableSub_EnsureSingleTrackCached(null,__ref,_item,_trackindex);
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
public static class ResumableSub_EnsureSingleTrackCached extends BA.ResumableSub {
public ResumableSub_EnsureSingleTrackCached(b4j.example.mediacache parent,RemoteObject __ref,RemoteObject _item,RemoteObject _trackindex) {
this.parent = parent;
this.__ref = __ref;
this._item = _item;
this._trackindex = _trackindex;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.mediacache parent;
RemoteObject _item;
RemoteObject _trackindex;
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _trackurl = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _tempfilename = RemoteObject.createImmutable("");
RemoteObject _outstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureSingleTrackCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,223);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("item", _item);
Debug.locals.put("trackIndex", _trackindex);
 BA.debugLineNum = 224;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(-2147483648);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 225;BA.debugLine="If trackId = \"\" Then Return False";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
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
 BA.debugLineNum = 226;BA.debugLine="If IsTrackCached(trackId) Then";
Debug.ShouldStop(2);
if (true) break;

case 7:
//if
this.state = 10;
if (__ref.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_trackid)).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 227;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_trackindex));
 BA.debugLineNum = 228;BA.debugLine="Return False";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 230;BA.debugLine="Dim trackUrl As String = BuildTrackUrl(trackId)";
Debug.ShouldStop(32);
_trackurl = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackurl" /*RemoteObject*/ ,(Object)(_trackid));Debug.locals.put("trackUrl", _trackurl);Debug.locals.put("trackUrl", _trackurl);
 BA.debugLineNum = 231;BA.debugLine="If trackUrl = \"\" Then Return False";
Debug.ShouldStop(64);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_trackurl,BA.ObjectToString(""))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 232;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(128);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 233;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(256);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 234;BA.debugLine="Trace(\"Скачивание трека в кэш. id=\" & trackId & \"";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Скачивание трека в кэш. id="),_trackid,RemoteObject.createImmutable(", url="),_trackurl)));
 BA.debugLineNum = 235;BA.debugLine="j.Download(trackUrl)";
Debug.ShouldStop(1024);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_trackurl));
 BA.debugLineNum = 236;BA.debugLine="j.GetRequest.Timeout = 20000";
Debug.ShouldStop(2048);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 20000));
 BA.debugLineNum = 237;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensuresingletrackcached"), (_j));
this.state = 36;
return;
case 36:
//C
this.state = 17;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 238;BA.debugLine="If j.Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 17:
//if
this.state = 35;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 19;
}else {
this.state = 34;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 239;BA.debugLine="Try";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 240;BA.debugLine="EnsureDirectory(GetTracksDir)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )));
 BA.debugLineNum = 241;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
Debug.ShouldStop(65536);
_tempfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_trackid));Debug.locals.put("tempFileName", _tempfilename);Debug.locals.put("tempFileName", _tempfilename);
 BA.debugLineNum = 242;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 243;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
Debug.ShouldStop(262144);
_outstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_outstream = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("outStream", _outstream);Debug.locals.put("outStream", _outstream);
 BA.debugLineNum = 244;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
Debug.ShouldStop(524288);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (b4j.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_outstream.getObject())));
 BA.debugLineNum = 245;BA.debugLine="outStream.Close";
Debug.ShouldStop(1048576);
_outstream.runVoidMethod ("Close");
 BA.debugLineNum = 246;BA.debugLine="If IsCachedFileUsable(GetTracksDir, tempFileNam";
Debug.ShouldStop(2097152);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename)),parent.__c.getField(true,"False"))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 247;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 248;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить трек в кэш. id="),_trackid,RemoteObject.createImmutable(", message=empty temp file"))));
 BA.debugLineNum = 249;BA.debugLine="j.Release";
Debug.ShouldStop(16777216);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 250;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 252;BA.debugLine="If ReplaceCacheFile(GetTracksDir, tempFileName,";
Debug.ShouldStop(134217728);

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_replacecachefile" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(_trackid)),parent.__c.getField(true,"False"))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 253;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 254;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить трек в кэш. id="),_trackid,RemoteObject.createImmutable(", message=rename failed"))));
 BA.debugLineNum = 255;BA.debugLine="j.Release";
Debug.ShouldStop(1073741824);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 256;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 29:
//C
this.state = 32;
;
 BA.debugLineNum = 258;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_trackindex));
 BA.debugLineNum = 259;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 260;BA.debugLine="Trace(\"Трек сохранен в кэш. id=\" & trackId)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Трек сохранен в кэш. id="),_trackid)));
 BA.debugLineNum = 261;BA.debugLine="j.Release";
Debug.ShouldStop(16);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 262;BA.debugLine="Return True";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
 BA.debugLineNum = 264;BA.debugLine="DeleteFileIfExists(GetTracksDir, BuildTempCache";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_trackid))));
 BA.debugLineNum = 265;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить трек в кэш. id="),_trackid,RemoteObject.createImmutable(", message="),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
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
 BA.debugLineNum = 268;BA.debugLine="Trace(\"Не удалось скачать трек. id=\" & trackId &";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось скачать трек. id="),_trackid,RemoteObject.createImmutable(", message="),_j.getField(true,"_errormessage" /*RemoteObject*/ ))));
 if (true) break;

case 35:
//C
this.state = -1;
;
 BA.debugLineNum = 270;BA.debugLine="j.Release";
Debug.ShouldStop(8192);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 271;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _ensuretrackscached(RemoteObject __ref,RemoteObject _trackitems,RemoteObject _maxcount) throws Exception{
try {
		Debug.PushSubsStack("EnsureTracksCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("ensuretrackscached")) { return __ref.runUserSub(false, "mediacache","ensuretrackscached", __ref, _trackitems, _maxcount);}
ResumableSub_EnsureTracksCached rsub = new ResumableSub_EnsureTracksCached(null,__ref,_trackitems,_maxcount);
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
public static class ResumableSub_EnsureTracksCached extends BA.ResumableSub {
public ResumableSub_EnsureTracksCached(b4j.example.mediacache parent,RemoteObject __ref,RemoteObject _trackitems,RemoteObject _maxcount) {
this.parent = parent;
this.__ref = __ref;
this._trackitems = _trackitems;
this._maxcount = _maxcount;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.mediacache parent;
RemoteObject _trackitems;
RemoteObject _maxcount;
RemoteObject _seentrackids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _downloadedcount = RemoteObject.createImmutable(0);
RemoteObject _failedcount = RemoteObject.createImmutable(0);
RemoteObject _processedcount = RemoteObject.createImmutable(0);
RemoteObject _itemobject = RemoteObject.declareNull("Object");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _downloaded = RemoteObject.createImmutable(false);
RemoteObject group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureTracksCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,141);
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
Debug.locals.put("trackItems", _trackitems);
Debug.locals.put("maxCount", _maxcount);
 BA.debugLineNum = 142;BA.debugLine="If trackItems.IsInitialized = False Or trackItems";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_trackitems.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_trackitems.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
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
 BA.debugLineNum = 143;BA.debugLine="Dim cachedTrackIndex As Map = GetCachedTrackIndex";
Debug.ShouldStop(16384);
parent._cachedtrackindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
parent._cachedtrackindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getcachedtrackindex" /*RemoteObject*/ );__ref.setField("_cachedtrackindex",parent._cachedtrackindex);
 BA.debugLineNum = 144;BA.debugLine="Dim seenTrackIds As Map";
Debug.ShouldStop(32768);
_seentrackids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("seenTrackIds", _seentrackids);
 BA.debugLineNum = 145;BA.debugLine="seenTrackIds.Initialize";
Debug.ShouldStop(65536);
_seentrackids.runVoidMethod ("Initialize");
 BA.debugLineNum = 146;BA.debugLine="Dim downloadedCount As Int = 0";
Debug.ShouldStop(131072);
_downloadedcount = BA.numberCast(int.class, 0);Debug.locals.put("downloadedCount", _downloadedcount);Debug.locals.put("downloadedCount", _downloadedcount);
 BA.debugLineNum = 147;BA.debugLine="Dim failedCount As Int = 0";
Debug.ShouldStop(262144);
_failedcount = BA.numberCast(int.class, 0);Debug.locals.put("failedCount", _failedcount);Debug.locals.put("failedCount", _failedcount);
 BA.debugLineNum = 148;BA.debugLine="Dim processedCount As Int = 0";
Debug.ShouldStop(524288);
_processedcount = BA.numberCast(int.class, 0);Debug.locals.put("processedCount", _processedcount);Debug.locals.put("processedCount", _processedcount);
 BA.debugLineNum = 149;BA.debugLine="For Each itemObject As Object In trackItems";
Debug.ShouldStop(1048576);
if (true) break;

case 7:
//for
this.state = 44;
group8 = _trackitems;
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("itemObject", _itemobject);
this.state = 45;
if (true) break;

case 45:
//C
this.state = 44;
if (index8 < groupLen8) {
this.state = 9;
_itemobject = group8.runMethod(false,"Get",index8);Debug.locals.put("itemObject", _itemobject);}
if (true) break;

case 46:
//C
this.state = 45;
index8++;
Debug.locals.put("itemObject", _itemobject);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 150;BA.debugLine="If processedCount >= maxCount Then Exit";
Debug.ShouldStop(2097152);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("g",_processedcount,BA.numberCast(double.class, _maxcount))) { 
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
 BA.debugLineNum = 151;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(4194304);
if (true) break;

case 16:
//if
this.state = 43;
if (RemoteObject.solveBoolean("i",_itemobject, RemoteObject.createImmutable("java.util.Map"))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 152;BA.debugLine="Dim item As Map = itemObject";
Debug.ShouldStop(8388608);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 153;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("track")))) { 
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
 BA.debugLineNum = 154;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"";
Debug.ShouldStop(33554432);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 155;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(67108864);
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
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
 BA.debugLineNum = 156;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Conti";
Debug.ShouldStop(134217728);
if (true) break;

case 31:
//if
this.state = 36;
if (_seentrackids.runMethod(true,"ContainsKey",(Object)((_trackid))).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 157;BA.debugLine="seenTrackIds.Put(trackId, True)";
Debug.ShouldStop(268435456);
_seentrackids.runVoidMethod ("Put",(Object)((_trackid)),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 158;BA.debugLine="processedCount = processedCount + 1";
Debug.ShouldStop(536870912);
_processedcount = RemoteObject.solve(new RemoteObject[] {_processedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("processedCount", _processedcount);
 BA.debugLineNum = 159;BA.debugLine="Wait For (EnsureSingleTrackCached(item, cachedT";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensuretrackscached"), __ref.runClassMethod (b4j.example.mediacache.class, "_ensuresingletrackcached" /*RemoteObject*/ ,(Object)(_item),(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ))));
this.state = 47;
return;
case 47:
//C
this.state = 37;
_downloaded = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("downloaded", _downloaded);
;
 BA.debugLineNum = 160;BA.debugLine="If downloaded Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 37:
//if
this.state = 42;
if (_downloaded.<Boolean>get().booleanValue()) { 
this.state = 39;
}else 
{ BA.debugLineNum = 162;BA.debugLine="Else If IsTrackCached(trackId) = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_trackid)),parent.__c.getField(true,"False"))) { 
this.state = 41;
}}
if (true) break;

case 39:
//C
this.state = 42;
 BA.debugLineNum = 161;BA.debugLine="downloadedCount = downloadedCount + 1";
Debug.ShouldStop(1);
_downloadedcount = RemoteObject.solve(new RemoteObject[] {_downloadedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("downloadedCount", _downloadedcount);
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 163;BA.debugLine="failedCount = failedCount + 1";
Debug.ShouldStop(4);
_failedcount = RemoteObject.solve(new RemoteObject[] {_failedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("failedCount", _failedcount);
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
Debug.locals.put("itemObject", _itemobject);
;
 BA.debugLineNum = 167;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 168;BA.debugLine="Trace(\"Синхронизация кэша треков завершена. downl";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Синхронизация кэша треков завершена. downloaded="),_downloadedcount,RemoteObject.createImmutable(", failed="),_failedcount,RemoteObject.createImmutable(", actual="),__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 169;BA.debugLine="Return downloadedCount > 0";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((RemoteObject.solveBoolean(">",_downloadedcount,BA.numberCast(double.class, 0)))));return;};
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static RemoteObject  _finalizecurrentcacheaudittype(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FinalizeCurrentCacheAuditType (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,498);
if (RapidSub.canDelegate("finalizecurrentcacheaudittype")) { return __ref.runUserSub(false, "mediacache","finalizecurrentcacheaudittype", __ref);}
RemoteObject _auditdir = RemoteObject.createImmutable("");
RemoteObject _auditindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _keyscopy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _key = RemoteObject.createImmutable("");
 BA.debugLineNum = 498;BA.debugLine="Private Sub FinalizeCurrentCacheAuditType";
Debug.ShouldStop(131072);
 BA.debugLineNum = 499;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
Debug.ShouldStop(262144);
_auditdir = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditdirbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditDir", _auditdir);Debug.locals.put("auditDir", _auditdir);
 BA.debugLineNum = 500;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
Debug.ShouldStop(524288);
_auditindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_auditindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditindexbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditIndex", _auditindex);Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 501;BA.debugLine="Dim keysCopy As List";
Debug.ShouldStop(1048576);
_keyscopy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("keysCopy", _keyscopy);
 BA.debugLineNum = 502;BA.debugLine="keysCopy.Initialize";
Debug.ShouldStop(2097152);
_keyscopy.runVoidMethod ("Initialize");
 BA.debugLineNum = 503;BA.debugLine="For Each key As String In auditIndex.Keys";
Debug.ShouldStop(4194304);
{
final RemoteObject group5 = _auditindex.runMethod(false,"Keys");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 504;BA.debugLine="keysCopy.Add(key)";
Debug.ShouldStop(8388608);
_keyscopy.runVoidMethod ("Add",(Object)((_key)));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 506;BA.debugLine="For Each key As String In keysCopy";
Debug.ShouldStop(33554432);
{
final RemoteObject group8 = _keyscopy;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 507;BA.debugLine="If cacheAuditSeenIds.ContainsKey(key) = False Th";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_key))),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 508;BA.debugLine="If IsCachedFileUsable(auditDir, key) Then";
Debug.ShouldStop(134217728);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_key)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 509;BA.debugLine="cacheAuditSeenIds.Put(key, True)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((mediacache.__c.getField(true,"True"))));
 BA.debugLineNum = 510;BA.debugLine="Continue";
Debug.ShouldStop(536870912);
if (true) continue;
 };
 BA.debugLineNum = 512;BA.debugLine="auditIndex.Remove(key)";
Debug.ShouldStop(-2147483648);
_auditindex.runVoidMethod ("Remove",(Object)((_key)));
 BA.debugLineNum = 513;BA.debugLine="cacheAuditRemovedCount = cacheAuditRemovedCount";
Debug.ShouldStop(1);
__ref.setField ("_cacheauditremovedcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cacheauditremovedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 514;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.mediacache.class, "_markauditindexchanged" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));
 };
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 517;BA.debugLine="Trace(\"Аудит кэша: каталог обработан. type=\" & ca";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Аудит кэша: каталог обработан. type="),__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ ),RemoteObject.createImmutable(", seen="),__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 518;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finishcacheaudit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FinishCacheAudit (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,520);
if (RapidSub.canDelegate("finishcacheaudit")) { return __ref.runUserSub(false, "mediacache","finishcacheaudit", __ref);}
 BA.debugLineNum = 520;BA.debugLine="Private Sub FinishCacheAudit";
Debug.ShouldStop(128);
 BA.debugLineNum = 521;BA.debugLine="If cacheAuditAdIndexChanged Then SaveAdIndex";
Debug.ShouldStop(256);
if (__ref.getField(true,"_cacheauditadindexchanged" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );};
 BA.debugLineNum = 522;BA.debugLine="If cacheAuditTrackIndexChanged Then SaveTrackInde";
Debug.ShouldStop(512);
if (__ref.getField(true,"_cacheaudittrackindexchanged" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );};
 BA.debugLineNum = 523;BA.debugLine="cacheAuditInProgress = False";
Debug.ShouldStop(1024);
__ref.setField ("_cacheauditinprogress" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 524;BA.debugLine="cacheAuditCurrentType = \"\"";
Debug.ShouldStop(2048);
__ref.setField ("_cacheauditcurrenttype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 525;BA.debugLine="Trace(\"Аудит кэша завершен. added=\" & cacheAuditA";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Аудит кэша завершен. added="),__ref.getField(true,"_cacheauditaddedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(", removed="),__ref.getField(true,"_cacheauditremovedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(", tempDeleted="),__ref.getField(true,"_cacheaudittempdeletedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(", ads="),__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(", tracks="),__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 526;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getadsdir(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetAdsDir (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("getadsdir")) { return __ref.runUserSub(false, "mediacache","getadsdir", __ref);}
 BA.debugLineNum = 128;BA.debugLine="Public Sub GetAdsDir As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
Debug.ShouldStop(1);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mediadirname" /*RemoteObject*/ )))),(Object)(__ref.getField(true,"_adsdirname" /*RemoteObject*/ )));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getauditdirbytype(RemoteObject __ref,RemoteObject _itemtype) throws Exception{
try {
		Debug.PushSubsStack("GetAuditDirByType (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,528);
if (RapidSub.canDelegate("getauditdirbytype")) { return __ref.runUserSub(false, "mediacache","getauditdirbytype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 528;BA.debugLine="Private Sub GetAuditDirByType(itemType As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 529;BA.debugLine="If itemType = \"ads\" Then Return GetAdsDir";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ads"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ );};
 BA.debugLineNum = 530;BA.debugLine="Return GetTracksDir";
Debug.ShouldStop(131072);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ );
 BA.debugLineNum = 531;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getauditindexbytype(RemoteObject __ref,RemoteObject _itemtype) throws Exception{
try {
		Debug.PushSubsStack("GetAuditIndexByType (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,533);
if (RapidSub.canDelegate("getauditindexbytype")) { return __ref.runUserSub(false, "mediacache","getauditindexbytype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 533;BA.debugLine="Private Sub GetAuditIndexByType(itemType As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 534;BA.debugLine="If itemType = \"ads\" Then Return cachedAdIndex";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ads"))) { 
if (true) return __ref.getField(false,"_cachedadindex" /*RemoteObject*/ );};
 BA.debugLineNum = 535;BA.debugLine="Return cachedTrackIndex";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 536;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcachedadindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCachedAdIndex (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,303);
if (RapidSub.canDelegate("getcachedadindex")) { return __ref.runUserSub(false, "mediacache","getcachedadindex", __ref);}
 BA.debugLineNum = 303;BA.debugLine="Private Sub GetCachedAdIndex As Map";
Debug.ShouldStop(16384);
 BA.debugLineNum = 304;BA.debugLine="If cachedAdIndex.IsInitialized = False Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 305;BA.debugLine="cachedAdIndex.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 307;BA.debugLine="Return cachedAdIndex";
Debug.ShouldStop(262144);
if (true) return __ref.getField(false,"_cachedadindex" /*RemoteObject*/ );
 BA.debugLineNum = 308;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcachedtrackindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCachedTrackIndex (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,310);
if (RapidSub.canDelegate("getcachedtrackindex")) { return __ref.runUserSub(false, "mediacache","getcachedtrackindex", __ref);}
 BA.debugLineNum = 310;BA.debugLine="Private Sub GetCachedTrackIndex As Map";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 311;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 312;BA.debugLine="cachedTrackIndex.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 314;BA.debugLine="Return cachedTrackIndex";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 315;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdirbyitemtype(RemoteObject __ref,RemoteObject _itemtype) throws Exception{
try {
		Debug.PushSubsStack("GetDirByItemType (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,432);
if (RapidSub.canDelegate("getdirbyitemtype")) { return __ref.runUserSub(false, "mediacache","getdirbyitemtype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 432;BA.debugLine="Private Sub GetDirByItemType(itemType As String) A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 433;BA.debugLine="If itemType = \"ad\" Then Return GetAdsDir";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ );};
 BA.debugLineNum = 434;BA.debugLine="Return GetTracksDir";
Debug.ShouldStop(131072);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ );
 BA.debugLineNum = 435;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getindexbyitemtype(RemoteObject __ref,RemoteObject _itemtype) throws Exception{
try {
		Debug.PushSubsStack("GetIndexByItemType (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,427);
if (RapidSub.canDelegate("getindexbyitemtype")) { return __ref.runUserSub(false, "mediacache","getindexbyitemtype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 427;BA.debugLine="Private Sub GetIndexByItemType(itemType As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 428;BA.debugLine="If itemType = \"ad\" Then Return cachedAdIndex";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return __ref.getField(false,"_cachedadindex" /*RemoteObject*/ );};
 BA.debugLineNum = 429;BA.debugLine="Return cachedTrackIndex";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 430;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettracksdir(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTracksDir (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("gettracksdir")) { return __ref.runUserSub(false, "mediacache","gettracksdir", __ref);}
 BA.debugLineNum = 132;BA.debugLine="Public Sub GetTracksDir As String";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
Debug.ShouldStop(16);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mediadirname" /*RemoteObject*/ )))),(Object)(__ref.getField(true,"_tracksdirname" /*RemoteObject*/ )));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasvalidatedlocalmedia(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("HasValidatedLocalMedia (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("hasvalidatedlocalmedia")) { return __ref.runUserSub(false, "mediacache","hasvalidatedlocalmedia", __ref, _item);}
RemoteObject _itemid = RemoteObject.createImmutable("");
RemoteObject _itemtype = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 113;BA.debugLine="Public Sub HasValidatedLocalMedia(item As Map) As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="If item.IsInitialized = False Then Return False";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 115;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(262144);
_itemid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemId", _itemid);Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 116;BA.debugLine="If itemId = \"\" Then Return False";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 117;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(1048576);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 118;BA.debugLine="If itemType = \"ad\" Then Return ValidateIndexedFil";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ad")),(Object)(_itemid));};
 BA.debugLineNum = 119;BA.debugLine="If itemType = \"track\" Then Return ValidateIndexed";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("track")),(Object)(_itemid));};
 BA.debugLineNum = 120;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _storagedirvalue,RemoteObject _storagevalue,RemoteObject _targetmodulevalue,RemoteObject _tracesubnamevalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "mediacache","initialize", __ref, _ba, _storagedirvalue, _storagevalue, _targetmodulevalue, _tracesubnamevalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("storageDirValue", _storagedirvalue);
Debug.locals.put("storageValue", _storagevalue);
Debug.locals.put("targetModuleValue", _targetmodulevalue);
Debug.locals.put("traceSubNameValue", _tracesubnamevalue);
 BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="storageDir = storageDirValue";
Debug.ShouldStop(67108864);
__ref.setField ("_storagedir" /*RemoteObject*/ ,_storagedirvalue);
 BA.debugLineNum = 28;BA.debugLine="storage = storageValue";
Debug.ShouldStop(134217728);
__ref.setField ("_storage" /*RemoteObject*/ ,_storagevalue);
 BA.debugLineNum = 29;BA.debugLine="targetModule = targetModuleValue";
Debug.ShouldStop(268435456);
__ref.setField ("_targetmodule" /*RemoteObject*/ ,_targetmodulevalue);
 BA.debugLineNum = 30;BA.debugLine="traceSubName = traceSubNameValue";
Debug.ShouldStop(536870912);
__ref.setField ("_tracesubname" /*RemoteObject*/ ,_tracesubnamevalue);
 BA.debugLineNum = 31;BA.debugLine="EnsureDirectory(GetAdsDir)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )));
 BA.debugLineNum = 32;BA.debugLine="EnsureDirectory(GetTracksDir)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="LoadIndexesFromStorage";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.mediacache.class, "_loadindexesfromstorage" /*RemoteObject*/ );
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isadcached(RemoteObject __ref,RemoteObject _adid) throws Exception{
try {
		Debug.PushSubsStack("IsAdCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("isadcached")) { return __ref.runUserSub(false, "mediacache","isadcached", __ref, _adid);}
Debug.locals.put("adId", _adid);
 BA.debugLineNum = 123;BA.debugLine="Public Sub IsAdCached(adId As String) As Boolean";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="If adId = \"\" Then Return False";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 125;BA.debugLine="Return ValidateIndexedFile(\"ad\", adId)";
Debug.ShouldStop(268435456);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ad")),(Object)(_adid));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iscacheauditinprogress(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsCacheAuditInProgress (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("iscacheauditinprogress")) { return __ref.runUserSub(false, "mediacache","iscacheauditinprogress", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Public Sub IsCacheAuditInProgress As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Return cacheAuditInProgress";
Debug.ShouldStop(16);
if (true) return __ref.getField(true,"_cacheauditinprogress" /*RemoteObject*/ );
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iscachedfileusable(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("IsCachedFileUsable (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,362);
if (RapidSub.canDelegate("iscachedfileusable")) { return __ref.runUserSub(false, "mediacache","iscachedfileusable", __ref, _dir, _filename);}
Debug.locals.put("dir", _dir);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 362;BA.debugLine="Private Sub IsCachedFileUsable(dir As String, file";
Debug.ShouldStop(512);
 BA.debugLineNum = 363;BA.debugLine="If fileName = \"\" Then Return False";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 364;BA.debugLine="If File.Exists(dir, fileName) = False Then Return";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",mediacache.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_dir),(Object)(_filename)),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 365;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 366;BA.debugLine="If File.Size(dir, fileName) > 0 Then Return True";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",mediacache.__c.getField(false,"File").runMethod(true,"Size",(Object)(_dir),(Object)(_filename)),BA.numberCast(long.class, 0))) { 
Debug.CheckDeviceExceptions();if (true) return mediacache.__c.getField(true,"True");};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 368;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(32768);
mediacache.__c.runVoidMethod ("LogImpl","141418758",mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 370;BA.debugLine="DeleteFileIfExists(dir, fileName)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 371;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 372;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _istrackcached(RemoteObject __ref,RemoteObject _trackid) throws Exception{
try {
		Debug.PushSubsStack("IsTrackCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("istrackcached")) { return __ref.runUserSub(false, "mediacache","istrackcached", __ref, _trackid);}
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 136;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="If trackId = \"\" Then Return False";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 138;BA.debugLine="Return ValidateIndexedFile(\"track\", trackId)";
Debug.ShouldStop(512);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("track")),(Object)(_trackid));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadindexesfromstorage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadIndexesFromStorage (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,333);
if (RapidSub.canDelegate("loadindexesfromstorage")) { return __ref.runUserSub(false, "mediacache","loadindexesfromstorage", __ref);}
 BA.debugLineNum = 333;BA.debugLine="Private Sub LoadIndexesFromStorage";
Debug.ShouldStop(4096);
 BA.debugLineNum = 334;BA.debugLine="cachedAdIndex = storage.GetDefault(\"cached_ad_ind";
Debug.ShouldStop(8192);
__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).setObject (__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_index")),(Object)(mediacache.__c.getField(false,"Null"))));
 BA.debugLineNum = 335;BA.debugLine="If cachedAdIndex.IsInitialized = False Then cache";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 336;BA.debugLine="cachedTrackIndex = storage.GetDefault(\"cached_tra";
Debug.ShouldStop(32768);
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).setObject (__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_track_index")),(Object)(mediacache.__c.getField(false,"Null"))));
 BA.debugLineNum = 337;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _markauditindexchanged(RemoteObject __ref,RemoteObject _itemtype) throws Exception{
try {
		Debug.PushSubsStack("MarkAuditIndexChanged (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,538);
if (RapidSub.canDelegate("markauditindexchanged")) { return __ref.runUserSub(false, "mediacache","markauditindexchanged", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 538;BA.debugLine="Private Sub MarkAuditIndexChanged(itemType As Stri";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 539;BA.debugLine="If itemType = \"ads\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ads"))) { 
 BA.debugLineNum = 540;BA.debugLine="cacheAuditAdIndexChanged = True";
Debug.ShouldStop(134217728);
__ref.setField ("_cacheauditadindexchanged" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 542;BA.debugLine="cacheAuditTrackIndexChanged = True";
Debug.ShouldStop(536870912);
__ref.setField ("_cacheaudittrackindexchanged" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 };
 BA.debugLineNum = 544;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _preparenextcacheaudittype(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PrepareNextCacheAuditType (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,451);
if (RapidSub.canDelegate("preparenextcacheaudittype")) { return __ref.runUserSub(false, "mediacache","preparenextcacheaudittype", __ref);}
RemoteObject _auditdir = RemoteObject.createImmutable("");
RemoteObject _listedfiles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filename = RemoteObject.createImmutable("");
 BA.debugLineNum = 451;BA.debugLine="Private Sub PrepareNextCacheAuditType As Boolean";
Debug.ShouldStop(4);
 BA.debugLineNum = 452;BA.debugLine="If cacheAuditPendingTypes.IsInitialized = False O";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 453;BA.debugLine="cacheAuditCurrentType = cacheAuditPendingTypes.Ge";
Debug.ShouldStop(16);
__ref.setField ("_cacheauditcurrenttype" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 454;BA.debugLine="cacheAuditPendingTypes.RemoveAt(0)";
Debug.ShouldStop(32);
__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 455;BA.debugLine="cacheAuditCurrentPosition = 0";
Debug.ShouldStop(64);
__ref.setField ("_cacheauditcurrentposition" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 456;BA.debugLine="cacheAuditSeenIds.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 457;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 458;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
Debug.ShouldStop(512);
_auditdir = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditdirbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditDir", _auditdir);Debug.locals.put("auditDir", _auditdir);
 BA.debugLineNum = 459;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 460;BA.debugLine="If File.Exists(auditDir, \"\") Then";
Debug.ShouldStop(2048);
if (mediacache.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_auditdir),(Object)(RemoteObject.createImmutable(""))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 461;BA.debugLine="Dim listedFiles As List = File.ListFiles(auditD";
Debug.ShouldStop(4096);
_listedfiles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listedfiles = mediacache.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_auditdir));Debug.locals.put("listedFiles", _listedfiles);Debug.locals.put("listedFiles", _listedfiles);
 BA.debugLineNum = 462;BA.debugLine="If listedFiles.IsInitialized Then";
Debug.ShouldStop(8192);
if (_listedfiles.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 463;BA.debugLine="For Each fileName As String In listedFiles";
Debug.ShouldStop(16384);
{
final RemoteObject group12 = _listedfiles;
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_filename = BA.ObjectToString(group12.runMethod(false,"Get",index12));Debug.locals.put("fileName", _filename);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 464;BA.debugLine="cacheAuditCurrentFileNames.Add(fileName)";
Debug.ShouldStop(32768);
__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_filename)));
 }
}Debug.locals.put("fileName", _filename);
;
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 469;BA.debugLine="Trace(\"Не удалось получить список файлов для ауд";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось получить список файлов для аудита кэша. type="),__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ ),RemoteObject.createImmutable(", message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 471;BA.debugLine="Trace(\"Аудит кэша: подготовлен каталог. type=\" &";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Аудит кэша: подготовлен каталог. type="),__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ ),RemoteObject.createImmutable(", files="),__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 472;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return mediacache.__c.getField(true,"True");
 BA.debugLineNum = 473;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _processcurrentcacheauditbatch(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ProcessCurrentCacheAuditBatch (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,475);
if (RapidSub.canDelegate("processcurrentcacheauditbatch")) { return __ref.runUserSub(false, "mediacache","processcurrentcacheauditbatch", __ref);}
RemoteObject _auditdir = RemoteObject.createImmutable("");
RemoteObject _auditindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _filename = RemoteObject.createImmutable("");
 BA.debugLineNum = 475;BA.debugLine="Private Sub ProcessCurrentCacheAuditBatch";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 476;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
Debug.ShouldStop(134217728);
_auditdir = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditdirbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditDir", _auditdir);Debug.locals.put("auditDir", _auditdir);
 BA.debugLineNum = 477;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
Debug.ShouldStop(268435456);
_auditindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_auditindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditindexbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditIndex", _auditindex);Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 478;BA.debugLine="For i = 1 To CACHE_AUDIT_BATCH_SIZE";
Debug.ShouldStop(536870912);
{
final int step3 = 1;
final int limit3 = __ref.getField(true,"_cache_audit_batch_size" /*RemoteObject*/ ).<Integer>get().intValue();
_i = 1 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 479;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurren";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_cacheauditcurrentposition" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
if (true) break;};
 BA.debugLineNum = 480;BA.debugLine="Dim fileName As String = cacheAuditCurrentFileNa";
Debug.ShouldStop(-2147483648);
_filename = BA.ObjectToString(__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_cacheauditcurrentposition" /*RemoteObject*/ ))));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 481;BA.debugLine="cacheAuditCurrentPosition = cacheAuditCurrentPos";
Debug.ShouldStop(1);
__ref.setField ("_cacheauditcurrentposition" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cacheauditcurrentposition" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 482;BA.debugLine="If fileName = \"\" Then Continue";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 483;BA.debugLine="If fileName.EndsWith(\".tmp\") Then";
Debug.ShouldStop(4);
if (_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".tmp"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 484;BA.debugLine="DeleteFileIfExists(auditDir, fileName)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename));
 BA.debugLineNum = 485;BA.debugLine="cacheAuditTempDeletedCount = cacheAuditTempDele";
Debug.ShouldStop(16);
__ref.setField ("_cacheaudittempdeletedcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cacheaudittempdeletedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 486;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.mediacache.class, "_markauditindexchanged" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));
 BA.debugLineNum = 487;BA.debugLine="Continue";
Debug.ShouldStop(64);
if (true) continue;
 };
 BA.debugLineNum = 489;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename)),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 490;BA.debugLine="cacheAuditSeenIds.Put(fileName, True)";
Debug.ShouldStop(512);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_filename)),(Object)((mediacache.__c.getField(true,"True"))));
 BA.debugLineNum = 491;BA.debugLine="If auditIndex.ContainsKey(fileName) = False Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_auditindex.runMethod(true,"ContainsKey",(Object)((_filename))),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 492;BA.debugLine="AddIndexedFileFromAudit(cacheAuditCurrentType,";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.mediacache.class, "_addindexedfilefromaudit" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )),(Object)(_filename),(Object)(_auditindex));
 BA.debugLineNum = 493;BA.debugLine="cacheAuditAddedCount = cacheAuditAddedCount + 1";
Debug.ShouldStop(4096);
__ref.setField ("_cacheauditaddedcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cacheauditaddedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 496;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _replacecachefile(RemoteObject __ref,RemoteObject _dir,RemoteObject _tempfilename,RemoteObject _finalfilename) throws Exception{
try {
		Debug.PushSubsStack("ReplaceCacheFile (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,378);
if (RapidSub.canDelegate("replacecachefile")) { return __ref.runUserSub(false, "mediacache","replacecachefile", __ref, _dir, _tempfilename, _finalfilename);}
RemoteObject _tempfile = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _finalfile = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _renamed = RemoteObject.createImmutable(false);
Debug.locals.put("dir", _dir);
Debug.locals.put("tempFileName", _tempfilename);
Debug.locals.put("finalFileName", _finalfilename);
 BA.debugLineNum = 378;BA.debugLine="Private Sub ReplaceCacheFile(dir As String, tempFi";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 379;BA.debugLine="If IsCachedFileUsable(dir, tempFileName) = False";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_dir),(Object)(_tempfilename)),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 380;BA.debugLine="If IsCachedFileUsable(dir, finalFileName) Then";
Debug.ShouldStop(134217728);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_dir),(Object)(_finalfilename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 381;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_tempfilename));
 BA.debugLineNum = 382;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return mediacache.__c.getField(true,"True");
 };
 BA.debugLineNum = 384;BA.debugLine="DeleteFileIfExists(dir, finalFileName)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_finalfilename));
 BA.debugLineNum = 385;BA.debugLine="Dim tempFile As JavaObject";
Debug.ShouldStop(1);
_tempfile = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("tempFile", _tempfile);
 BA.debugLineNum = 386;BA.debugLine="tempFile.InitializeNewInstance(\"java.io.File\", Ar";
Debug.ShouldStop(2);
_tempfile.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_tempfilename)))})));
 BA.debugLineNum = 387;BA.debugLine="Dim finalFile As JavaObject";
Debug.ShouldStop(4);
_finalfile = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("finalFile", _finalfile);
 BA.debugLineNum = 388;BA.debugLine="finalFile.InitializeNewInstance(\"java.io.File\", A";
Debug.ShouldStop(8);
_finalfile.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_finalfilename)))})));
 BA.debugLineNum = 389;BA.debugLine="Dim renamed As Boolean = tempFile.RunMethod(\"rena";
Debug.ShouldStop(16);
_renamed = BA.ObjectToBoolean(_tempfile.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("renameTo")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_finalfile.getObject())}))));Debug.locals.put("renamed", _renamed);Debug.locals.put("renamed", _renamed);
 BA.debugLineNum = 390;BA.debugLine="If renamed = False And IsCachedFileUsable(dir, fi";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_renamed,mediacache.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_dir),(Object)(_finalfilename)))) { 
 BA.debugLineNum = 391;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_tempfilename));
 BA.debugLineNum = 392;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) return mediacache.__c.getField(true,"True");
 };
 BA.debugLineNum = 394;BA.debugLine="Return renamed";
Debug.ShouldStop(512);
if (true) return _renamed;
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvelocalmediauri(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ResolveLocalMediaUri (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("resolvelocalmediauri")) { return __ref.runUserSub(false, "mediacache","resolvelocalmediauri", __ref, _item);}
RemoteObject _itemtype = RemoteObject.createImmutable("");
RemoteObject _itemid = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 102;BA.debugLine="Public Sub ResolveLocalMediaUri(item As Map) As St";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 104;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(128);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 105;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(256);
_itemid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemId", _itemid);Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 106;BA.debugLine="If itemId = \"\" Then Return \"\"";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 107;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_item)),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 108;BA.debugLine="If itemType = \"ad\" Then Return File.GetUri(GetAds";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_itemid));};
 BA.debugLineNum = 109;BA.debugLine="If itemType = \"track\" Then Return File.GetUri(Get";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_itemid));};
 BA.debugLineNum = 110;BA.debugLine="Return \"\"";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvemediasource(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ResolveMediaSource (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,402);
if (RapidSub.canDelegate("resolvemediasource")) { return __ref.runUserSub(false, "mediacache","resolvemediasource", __ref, _item);}
RemoteObject _itemtype = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 402;BA.debugLine="Public Sub ResolveMediaSource(item As Map) As Stri";
Debug.ShouldStop(131072);
 BA.debugLineNum = 403;BA.debugLine="If item.IsInitialized = False Then Return \"none\"";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("none");};
 BA.debugLineNum = 404;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(524288);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 405;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 406;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
Debug.ShouldStop(2097152);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_item)).<Boolean>get().booleanValue()) { 
if (true) return BA.ObjectToString("cache");};
 BA.debugLineNum = 407;BA.debugLine="Return \"cdn\"";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToString("cdn");
 };
 BA.debugLineNum = 409;BA.debugLine="If itemType = \"track\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
 BA.debugLineNum = 410;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
Debug.ShouldStop(33554432);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_item)).<Boolean>get().booleanValue()) { 
if (true) return BA.ObjectToString("cache");};
 BA.debugLineNum = 411;BA.debugLine="Return \"cdn\"";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToString("cdn");
 };
 BA.debugLineNum = 413;BA.debugLine="Return \"none\"";
Debug.ShouldStop(268435456);
if (true) return BA.ObjectToString("none");
 BA.debugLineNum = 414;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _runcacheauditstep(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RunCacheAuditStep (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("runcacheauditstep")) { return __ref.runUserSub(false, "mediacache","runcacheauditstep", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Public Sub RunCacheAuditStep As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="If cacheAuditInProgress = False Then Return False";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cacheauditinprogress" /*RemoteObject*/ ),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 60;BA.debugLine="If cacheAuditCurrentType = \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 61;BA.debugLine="If PrepareNextCacheAuditType = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_preparenextcacheaudittype" /*RemoteObject*/ ),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 62;BA.debugLine="FinishCacheAudit";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.mediacache.class, "_finishcacheaudit" /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
if (true) return mediacache.__c.getField(true,"False");
 };
 };
 BA.debugLineNum = 66;BA.debugLine="ProcessCurrentCacheAuditBatch";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.mediacache.class, "_processcurrentcacheauditbatch" /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurrent";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_cacheauditcurrentposition" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 68;BA.debugLine="FinalizeCurrentCacheAuditType";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.mediacache.class, "_finalizecurrentcacheaudittype" /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="cacheAuditCurrentType = \"\"";
Debug.ShouldStop(16);
__ref.setField ("_cacheauditcurrenttype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 70;BA.debugLine="If cacheAuditPendingTypes.Size = 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 71;BA.debugLine="FinishCacheAudit";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.mediacache.class, "_finishcacheaudit" /*RemoteObject*/ );
 BA.debugLineNum = 72;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) return mediacache.__c.getField(true,"False");
 };
 };
 BA.debugLineNum = 75;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return mediacache.__c.getField(true,"True");
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveadindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SaveAdIndex (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,340);
if (RapidSub.canDelegate("saveadindex")) { return __ref.runUserSub(false, "mediacache","saveadindex", __ref);}
 BA.debugLineNum = 340;BA.debugLine="Private Sub SaveAdIndex";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="storage.Put(\"cached_ad_index\", cachedAdIndex)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_index")),(Object)((__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 342;BA.debugLine="storage.Put(\"cached_ad_count\", cachedAdIndex.Size";
Debug.ShouldStop(2097152);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_count")),(Object)((__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveindexbyitemtype(RemoteObject __ref,RemoteObject _itemtype) throws Exception{
try {
		Debug.PushSubsStack("SaveIndexByItemType (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,437);
if (RapidSub.canDelegate("saveindexbyitemtype")) { return __ref.runUserSub(false, "mediacache","saveindexbyitemtype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 437;BA.debugLine="Private Sub SaveIndexByItemType(itemType As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 438;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 439;BA.debugLine="SaveAdIndex";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 441;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 };
 BA.debugLineNum = 443;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savetrackindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SaveTrackIndex (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,345);
if (RapidSub.canDelegate("savetrackindex")) { return __ref.runUserSub(false, "mediacache","savetrackindex", __ref);}
 BA.debugLineNum = 345;BA.debugLine="Private Sub SaveTrackIndex";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 346;BA.debugLine="storage.Put(\"cached_track_index\", cachedTrackInde";
Debug.ShouldStop(33554432);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_track_index")),(Object)((__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 347;BA.debugLine="storage.Put(\"cached_track_count\", cachedTrackInde";
Debug.ShouldStop(67108864);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_track_count")),(Object)((__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startcacheaudit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StartCacheAudit (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("startcacheaudit")) { return __ref.runUserSub(false, "mediacache","startcacheaudit", __ref);}
 BA.debugLineNum = 40;BA.debugLine="Public Sub StartCacheAudit";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="If cacheAuditInProgress Then Return";
Debug.ShouldStop(256);
if (__ref.getField(true,"_cacheauditinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 42;BA.debugLine="cacheAuditPendingTypes.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="cacheAuditPendingTypes.Add(\"ads\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("ads"))));
 BA.debugLineNum = 44;BA.debugLine="cacheAuditPendingTypes.Add(\"tracks\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("tracks"))));
 BA.debugLineNum = 45;BA.debugLine="cacheAuditCurrentType = \"\"";
Debug.ShouldStop(4096);
__ref.setField ("_cacheauditcurrenttype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 46;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="cacheAuditCurrentPosition = 0";
Debug.ShouldStop(16384);
__ref.setField ("_cacheauditcurrentposition" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 48;BA.debugLine="cacheAuditSeenIds.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="cacheAuditAdIndexChanged = False";
Debug.ShouldStop(65536);
__ref.setField ("_cacheauditadindexchanged" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 50;BA.debugLine="cacheAuditTrackIndexChanged = False";
Debug.ShouldStop(131072);
__ref.setField ("_cacheaudittrackindexchanged" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 51;BA.debugLine="cacheAuditAddedCount = 0";
Debug.ShouldStop(262144);
__ref.setField ("_cacheauditaddedcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 52;BA.debugLine="cacheAuditRemovedCount = 0";
Debug.ShouldStop(524288);
__ref.setField ("_cacheauditremovedcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 53;BA.debugLine="cacheAuditTempDeletedCount = 0";
Debug.ShouldStop(1048576);
__ref.setField ("_cacheaudittempdeletedcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 54;BA.debugLine="cacheAuditInProgress = True";
Debug.ShouldStop(2097152);
__ref.setField ("_cacheauditinprogress" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 BA.debugLineNum = 55;BA.debugLine="Trace(\"Запущен аудит кэша media.\")";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Запущен аудит кэша media.")));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _touchcacheditem(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("TouchCachedItem (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,317);
if (RapidSub.canDelegate("touchcacheditem")) { return __ref.runUserSub(false, "mediacache","touchcacheditem", __ref, _item);}
RemoteObject _itemid = RemoteObject.createImmutable("");
RemoteObject _itemtype = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 317;BA.debugLine="Public Sub TouchCachedItem(item As Map)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 318;BA.debugLine="If item.IsInitialized = False Then Return";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 319;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(1073741824);
_itemid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemId", _itemid);Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 320;BA.debugLine="If itemId = \"\" Then Return";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 321;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(1);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 322;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 323;BA.debugLine="If cachedAdIndex.ContainsKey(itemId) = False The";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_itemid))),mediacache.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 324;BA.debugLine="UpdateAdIndex(item, cachedAdIndex)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_item),(Object)(__ref.getField(false,"_cachedadindex" /*RemoteObject*/ )));
 BA.debugLineNum = 325;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 327;BA.debugLine="If itemType = \"track\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
 BA.debugLineNum = 328;BA.debugLine="If cachedTrackIndex.ContainsKey(itemId) = False";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_itemid))),mediacache.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 329;BA.debugLine="UpdateTrackIndex(item, cachedTrackIndex)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Trace (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,566);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "mediacache","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 566;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 567;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
Debug.ShouldStop(4194304);
if (mediacache.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 568;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
Debug.ShouldStop(8388608);
mediacache.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ )),(Object)((_message)));
 };
 BA.debugLineNum = 570;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateadindex(RemoteObject __ref,RemoteObject _ad,RemoteObject _adindex) throws Exception{
try {
		Debug.PushSubsStack("UpdateAdIndex (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,274);
if (RapidSub.canDelegate("updateadindex")) { return __ref.runUserSub(false, "mediacache","updateadindex", __ref, _ad, _adindex);}
RemoteObject _adid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ad", _ad);
Debug.locals.put("adIndex", _adindex);
 BA.debugLineNum = 274;BA.debugLine="Private Sub UpdateAdIndex(ad As Map, adIndex As Ma";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
Debug.ShouldStop(262144);
_adid = BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("adId", _adid);Debug.locals.put("adId", _adid);
 BA.debugLineNum = 276;BA.debugLine="If adId = \"\" Then Return";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 277;BA.debugLine="Dim entry As Map = adIndex.GetDefault(adId, Null)";
Debug.ShouldStop(1048576);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _adindex.runMethod(false,"GetDefault",(Object)((_adid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 278;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Initialize");};
 BA.debugLineNum = 279;BA.debugLine="entry.Put(\"id\", adId)";
Debug.ShouldStop(4194304);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_adid)));
 BA.debugLineNum = 280;BA.debugLine="entry.Put(\"title\", ad.GetDefault(\"title\", \"\"))";
Debug.ShouldStop(8388608);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 281;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("saved_at")))),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));};
 BA.debugLineNum = 282;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(33554432);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 283;BA.debugLine="entry.Put(\"duration\", ad.GetDefault(\"duration\", 0";
Debug.ShouldStop(67108864);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 284;BA.debugLine="entry.Put(\"gain\", ad.GetDefault(\"gain\", 0))";
Debug.ShouldStop(134217728);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 285;BA.debugLine="adIndex.Put(adId, entry)";
Debug.ShouldStop(268435456);
_adindex.runVoidMethod ("Put",(Object)((_adid)),(Object)((_entry.getObject())));
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatetrackindex(RemoteObject __ref,RemoteObject _item,RemoteObject _trackindex) throws Exception{
try {
		Debug.PushSubsStack("UpdateTrackIndex (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("updatetrackindex")) { return __ref.runUserSub(false, "mediacache","updatetrackindex", __ref, _item, _trackindex);}
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("item", _item);
Debug.locals.put("trackIndex", _trackindex);
 BA.debugLineNum = 288;BA.debugLine="Private Sub UpdateTrackIndex(item As Map, trackInd";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(1);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 290;BA.debugLine="If trackId = \"\" Then Return";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 291;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
Debug.ShouldStop(4);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackindex.runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 292;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Initialize");};
 BA.debugLineNum = 293;BA.debugLine="entry.Put(\"id\", trackId)";
Debug.ShouldStop(16);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_trackid)));
 BA.debugLineNum = 294;BA.debugLine="entry.Put(\"title\", item.GetDefault(\"title\", \"\"))";
Debug.ShouldStop(32);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 295;BA.debugLine="entry.Put(\"set\", item.GetDefault(\"set\", \"\"))";
Debug.ShouldStop(64);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("set"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("set"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 296;BA.debugLine="entry.Put(\"stream\", item.GetDefault(\"stream\", \"\")";
Debug.ShouldStop(128);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 297;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("saved_at")))),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));};
 BA.debugLineNum = 298;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(512);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 299;BA.debugLine="entry.Put(\"gain\", item.GetDefault(\"gain\", 0))";
Debug.ShouldStop(1024);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 300;BA.debugLine="trackIndex.Put(trackId, entry)";
Debug.ShouldStop(2048);
_trackindex.runVoidMethod ("Put",(Object)((_trackid)),(Object)((_entry.getObject())));
 BA.debugLineNum = 301;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _validateindexedfile(RemoteObject __ref,RemoteObject _itemtype,RemoteObject _itemid) throws Exception{
try {
		Debug.PushSubsStack("ValidateIndexedFile (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,416);
if (RapidSub.canDelegate("validateindexedfile")) { return __ref.runUserSub(false, "mediacache","validateindexedfile", __ref, _itemtype, _itemid);}
RemoteObject _auditindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _auditdir = RemoteObject.createImmutable("");
Debug.locals.put("itemType", _itemtype);
Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 416;BA.debugLine="Private Sub ValidateIndexedFile(itemType As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 417;BA.debugLine="If itemId = \"\" Then Return False";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 418;BA.debugLine="Dim auditIndex As Map = GetIndexByItemType(itemTy";
Debug.ShouldStop(2);
_auditindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_auditindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getindexbyitemtype" /*RemoteObject*/ ,(Object)(_itemtype));Debug.locals.put("auditIndex", _auditindex);Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 419;BA.debugLine="If auditIndex.ContainsKey(itemId) = False Then Re";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_auditindex.runMethod(true,"ContainsKey",(Object)((_itemid))),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 420;BA.debugLine="Dim auditDir As String = GetDirByItemType(itemTyp";
Debug.ShouldStop(8);
_auditdir = __ref.runClassMethod (b4j.example.mediacache.class, "_getdirbyitemtype" /*RemoteObject*/ ,(Object)(_itemtype));Debug.locals.put("auditDir", _auditdir);Debug.locals.put("auditDir", _auditdir);
 BA.debugLineNum = 421;BA.debugLine="If IsCachedFileUsable(auditDir, itemId) Then Retu";
Debug.ShouldStop(16);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_itemid)).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 422;BA.debugLine="auditIndex.Remove(itemId)";
Debug.ShouldStop(32);
_auditindex.runVoidMethod ("Remove",(Object)((_itemid)));
 BA.debugLineNum = 423;BA.debugLine="SaveIndexByItemType(itemType)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveindexbyitemtype" /*RemoteObject*/ ,(Object)(_itemtype));
 BA.debugLineNum = 424;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 425;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}