package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mediacache_subs_0 {


public static RemoteObject  _buildadurl(RemoteObject __ref,RemoteObject _adid) throws Exception{
try {
		Debug.PushSubsStack("BuildAdUrl (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("buildadurl")) { return __ref.runUserSub(false, "mediacache","buildadurl", __ref, _adid);}
RemoteObject _first = RemoteObject.createImmutable("");
Debug.locals.put("adId", _adid);
 BA.debugLineNum = 117;BA.debugLine="Private Sub BuildAdUrl(adId As String) As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="If adId = \"\" Then Return \"\"";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 119;BA.debugLine="Dim first As String = adId.SubString2(0, 1)";
Debug.ShouldStop(4194304);
_first = _adid.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 120;BA.debugLine="Return \"https://cdn.fon.fm/media/ads/\" & first &";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("https://cdn.fon.fm/media/ads/"),_first,RemoteObject.createImmutable("/"),_adid,RemoteObject.createImmutable(".mp3"));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _ensureadscached(RemoteObject __ref,RemoteObject _offlinedata) throws Exception{
try {
		Debug.PushSubsStack("EnsureAdsCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,19);
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
RemoteObject _cachedadindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
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
		Debug.PushSubsStack("EnsureAdsCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,19);
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
 BA.debugLineNum = 20;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 21;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 22;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
Debug.ShouldStop(2097152);
_ads = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ads = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ads"))),(Object)(parent.__c.getField(false,"Null"))));Debug.locals.put("ads", _ads);Debug.locals.put("ads", _ads);
 BA.debugLineNum = 23;BA.debugLine="If ads.IsInitialized = False Or ads.Size = 0 Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 24;BA.debugLine="Dim cachedAdIndex As Map = GetCachedAdIndex";
Debug.ShouldStop(8388608);
_cachedadindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cachedadindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getcachedadindex" /*RemoteObject*/ );Debug.locals.put("cachedAdIndex", _cachedadindex);Debug.locals.put("cachedAdIndex", _cachedadindex);
 BA.debugLineNum = 25;BA.debugLine="Dim downloadedCount As Int = 0";
Debug.ShouldStop(16777216);
_downloadedcount = BA.numberCast(int.class, 0);Debug.locals.put("downloadedCount", _downloadedcount);Debug.locals.put("downloadedCount", _downloadedcount);
 BA.debugLineNum = 26;BA.debugLine="Dim failedCount As Int = 0";
Debug.ShouldStop(33554432);
_failedcount = BA.numberCast(int.class, 0);Debug.locals.put("failedCount", _failedcount);Debug.locals.put("failedCount", _failedcount);
 BA.debugLineNum = 27;BA.debugLine="For Each adObject As Object In ads";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 28;BA.debugLine="If adObject Is Map Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 29;BA.debugLine="Dim ad As Map = adObject";
Debug.ShouldStop(268435456);
_ad = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ad = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _adobject);Debug.locals.put("ad", _ad);Debug.locals.put("ad", _ad);
 BA.debugLineNum = 30;BA.debugLine="Wait For (EnsureSingleAdCached(ad, cachedAdInde";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensureadscached"), __ref.runClassMethod (b4j.example.mediacache.class, "_ensuresingleadcached" /*RemoteObject*/ ,(Object)(_ad),(Object)(_cachedadindex)));
this.state = 35;
return;
case 35:
//C
this.state = 25;
_downloaded = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("downloaded", _downloaded);
;
 BA.debugLineNum = 31;BA.debugLine="If downloaded Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 25:
//if
this.state = 30;
if (_downloaded.<Boolean>get().booleanValue()) { 
this.state = 27;
}else 
{ BA.debugLineNum = 33;BA.debugLine="Else If IsAdCached(ad.GetDefault(\"id\", \"\")) = F";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_isadcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))),parent.__c.getField(true,"False"))) { 
this.state = 29;
}}
if (true) break;

case 27:
//C
this.state = 30;
 BA.debugLineNum = 32;BA.debugLine="downloadedCount = downloadedCount + 1";
Debug.ShouldStop(-2147483648);
_downloadedcount = RemoteObject.solve(new RemoteObject[] {_downloadedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("downloadedCount", _downloadedcount);
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 34;BA.debugLine="failedCount = failedCount + 1";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 38;BA.debugLine="storage.Put(\"cached_ad_index\", cachedAdIndex)";
Debug.ShouldStop(32);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_index")),(Object)((_cachedadindex.getObject())));
 BA.debugLineNum = 39;BA.debugLine="storage.Put(\"cached_ad_count\", cachedAdIndex.Size";
Debug.ShouldStop(64);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_count")),(Object)((_cachedadindex.runMethod(true,"getSize"))));
 BA.debugLineNum = 40;BA.debugLine="Trace(\"Синхронизация кэша рекламы завершена. down";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Синхронизация кэша рекламы завершена. downloaded="),_downloadedcount,RemoteObject.createImmutable(", failed="),_failedcount,RemoteObject.createImmutable(", actual="),_cachedadindex.runMethod(true,"getSize"))));
 BA.debugLineNum = 41;BA.debugLine="Return downloadedCount > 0";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((RemoteObject.solveBoolean(">",_downloadedcount,BA.numberCast(double.class, 0)))));return;};
 BA.debugLineNum = 42;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _downloaded) throws Exception{
}
public static RemoteObject  _ensuredirectory(RemoteObject __ref,RemoteObject _path) throws Exception{
try {
		Debug.PushSubsStack("EnsureDirectory (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("ensuredirectory")) { return __ref.runUserSub(false, "mediacache","ensuredirectory", __ref, _path);}
RemoteObject _fileobject = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("path", _path);
 BA.debugLineNum = 123;BA.debugLine="Private Sub EnsureDirectory(path As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="Dim fileObject As JavaObject";
Debug.ShouldStop(134217728);
_fileobject = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("fileObject", _fileobject);
 BA.debugLineNum = 125;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
Debug.ShouldStop(268435456);
_fileobject.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_path)})));
 BA.debugLineNum = 126;BA.debugLine="fileObject.RunMethod(\"mkdirs\", Null)";
Debug.ShouldStop(536870912);
_fileobject.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("mkdirs")),(Object)((mediacache.__c.getField(false,"Null"))));
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ensuresingleadcached(RemoteObject __ref,RemoteObject _ad,RemoteObject _cachedadindex) throws Exception{
try {
		Debug.PushSubsStack("EnsureSingleAdCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("ensuresingleadcached")) { return __ref.runUserSub(false, "mediacache","ensuresingleadcached", __ref, _ad, _cachedadindex);}
ResumableSub_EnsureSingleAdCached rsub = new ResumableSub_EnsureSingleAdCached(null,__ref,_ad,_cachedadindex);
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
public ResumableSub_EnsureSingleAdCached(b4j.example.mediacache parent,RemoteObject __ref,RemoteObject _ad,RemoteObject _cachedadindex) {
this.parent = parent;
this.__ref = __ref;
this._ad = _ad;
this._cachedadindex = _cachedadindex;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.mediacache parent;
RemoteObject _ad;
RemoteObject _cachedadindex;
RemoteObject _adid = RemoteObject.createImmutable("");
RemoteObject _adurl = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _outstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureSingleAdCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,61);
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
Debug.locals.put("cachedAdIndex", _cachedadindex);
 BA.debugLineNum = 62;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
Debug.ShouldStop(536870912);
_adid = BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("adId", _adid);Debug.locals.put("adId", _adid);
 BA.debugLineNum = 63;BA.debugLine="If adId = \"\" Then Return False";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 64;BA.debugLine="If IsAdCached(adId) Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 65;BA.debugLine="UpdateAdIndex(ad, cachedAdIndex)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_ad),(Object)(_cachedadindex));
 BA.debugLineNum = 66;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 68;BA.debugLine="Dim adUrl As String = BuildAdUrl(adId)";
Debug.ShouldStop(8);
_adurl = __ref.runClassMethod (b4j.example.mediacache.class, "_buildadurl" /*RemoteObject*/ ,(Object)(_adid));Debug.locals.put("adUrl", _adurl);Debug.locals.put("adUrl", _adurl);
 BA.debugLineNum = 69;BA.debugLine="If adUrl = \"\" Then Return False";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 70;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(32);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 71;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(64);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 72;BA.debugLine="Trace(\"Скачивание рекламы в кэш. id=\" & adId & \",";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Скачивание рекламы в кэш. id="),_adid,RemoteObject.createImmutable(", url="),_adurl)));
 BA.debugLineNum = 73;BA.debugLine="j.Download(adUrl)";
Debug.ShouldStop(256);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_adurl));
 BA.debugLineNum = 74;BA.debugLine="j.GetRequest.Timeout = 15000";
Debug.ShouldStop(512);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 75;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensuresingleadcached"), (_j));
this.state = 29;
return;
case 29:
//C
this.state = 17;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 76;BA.debugLine="If j.Success Then";
Debug.ShouldStop(2048);
if (true) break;

case 17:
//if
this.state = 28;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 19;
}else {
this.state = 27;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 77;BA.debugLine="Try";
Debug.ShouldStop(4096);
if (true) break;

case 20:
//try
this.state = 25;
this.catchState = 24;
this.state = 22;
if (true) break;

case 22:
//C
this.state = 25;
this.catchState = 24;
 BA.debugLineNum = 78;BA.debugLine="EnsureDirectory(GetAdsDir)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )));
 BA.debugLineNum = 79;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
Debug.ShouldStop(16384);
_outstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_outstream = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_adid),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("outStream", _outstream);Debug.locals.put("outStream", _outstream);
 BA.debugLineNum = 80;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
Debug.ShouldStop(32768);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (b4j.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_outstream.getObject())));
 BA.debugLineNum = 81;BA.debugLine="outStream.Close";
Debug.ShouldStop(65536);
_outstream.runVoidMethod ("Close");
 BA.debugLineNum = 82;BA.debugLine="UpdateAdIndex(ad, cachedAdIndex)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_ad),(Object)(_cachedadindex));
 BA.debugLineNum = 83;BA.debugLine="Trace(\"Реклама сохранена в кэш. id=\" & adId)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Реклама сохранена в кэш. id="),_adid)));
 BA.debugLineNum = 84;BA.debugLine="j.Release";
Debug.ShouldStop(524288);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 85;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
 BA.debugLineNum = 87;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=\"";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить рекламу в кэш. id="),_adid,RemoteObject.createImmutable(", message="),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 if (true) break;
if (true) break;

case 25:
//C
this.state = 28;
this.catchState = 0;
;
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 90;BA.debugLine="Trace(\"Не удалось скачать рекламу. id=\" & adId &";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось скачать рекламу. id="),_adid,RemoteObject.createImmutable(", message="),_j.getField(true,"_errormessage" /*RemoteObject*/ ))));
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 92;BA.debugLine="j.Release";
Debug.ShouldStop(134217728);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _getadsdir(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetAdsDir (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("getadsdir")) { return __ref.runUserSub(false, "mediacache","getadsdir", __ref);}
 BA.debugLineNum = 57;BA.debugLine="Public Sub GetAdsDir As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
Debug.ShouldStop(33554432);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mediadirname" /*RemoteObject*/ )))),(Object)(__ref.getField(true,"_adsdirname" /*RemoteObject*/ )));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcachedadindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCachedAdIndex (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("getcachedadindex")) { return __ref.runUserSub(false, "mediacache","getcachedadindex", __ref);}
RemoteObject _cachedadindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 109;BA.debugLine="Private Sub GetCachedAdIndex As Map";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Dim cachedAdIndex As Map = storage.GetDefault(\"ca";
Debug.ShouldStop(8192);
_cachedadindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cachedadindex = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_index")),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("cachedAdIndex", _cachedadindex);Debug.locals.put("cachedAdIndex", _cachedadindex);
 BA.debugLineNum = 111;BA.debugLine="If cachedAdIndex.IsInitialized = False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_cachedadindex.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 112;BA.debugLine="cachedAdIndex.Initialize";
Debug.ShouldStop(32768);
_cachedadindex.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 114;BA.debugLine="Return cachedAdIndex";
Debug.ShouldStop(131072);
if (true) return _cachedadindex;
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _storagedirvalue,RemoteObject _storagevalue,RemoteObject _targetmodulevalue,RemoteObject _tracesubnamevalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "mediacache","initialize", __ref, _ba, _storagedirvalue, _storagevalue, _targetmodulevalue, _tracesubnamevalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("storageDirValue", _storagedirvalue);
Debug.locals.put("storageValue", _storagevalue);
Debug.locals.put("targetModuleValue", _targetmodulevalue);
Debug.locals.put("traceSubNameValue", _tracesubnamevalue);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="storageDir = storageDirValue";
Debug.ShouldStop(2048);
__ref.setField ("_storagedir" /*RemoteObject*/ ,_storagedirvalue);
 BA.debugLineNum = 13;BA.debugLine="storage = storageValue";
Debug.ShouldStop(4096);
__ref.setField ("_storage" /*RemoteObject*/ ,_storagevalue);
 BA.debugLineNum = 14;BA.debugLine="targetModule = targetModuleValue";
Debug.ShouldStop(8192);
__ref.setField ("_targetmodule" /*RemoteObject*/ ,_targetmodulevalue);
 BA.debugLineNum = 15;BA.debugLine="traceSubName = traceSubNameValue";
Debug.ShouldStop(16384);
__ref.setField ("_tracesubname" /*RemoteObject*/ ,_tracesubnamevalue);
 BA.debugLineNum = 16;BA.debugLine="EnsureDirectory(GetAdsDir)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("IsAdCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("isadcached")) { return __ref.runUserSub(false, "mediacache","isadcached", __ref, _adid);}
Debug.locals.put("adId", _adid);
 BA.debugLineNum = 52;BA.debugLine="Public Sub IsAdCached(adId As String) As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="If adId = \"\" Then Return False";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 54;BA.debugLine="Return File.Exists(GetAdsDir, adId)";
Debug.ShouldStop(2097152);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_adid));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("ResolveLocalMediaUri (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("resolvelocalmediauri")) { return __ref.runUserSub(false, "mediacache","resolvelocalmediauri", __ref, _item);}
RemoteObject _adid = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 44;BA.debugLine="Public Sub ResolveLocalMediaUri(item As Map) As St";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 46;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"ad\" Then Retur";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("ad")))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 47;BA.debugLine="Dim adId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(16384);
_adid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("adId", _adid);Debug.locals.put("adId", _adid);
 BA.debugLineNum = 48;BA.debugLine="If IsAdCached(adId) = False Then Return \"\"";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_isadcached" /*RemoteObject*/ ,(Object)(_adid)),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 49;BA.debugLine="Return File.GetUri(GetAdsDir, adId)";
Debug.ShouldStop(65536);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_adid));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Trace (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "mediacache","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 129;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
Debug.ShouldStop(2);
if (mediacache.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 131;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
Debug.ShouldStop(4);
mediacache.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ )),(Object)((_message)));
 };
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateadindex(RemoteObject __ref,RemoteObject _ad,RemoteObject _cachedadindex) throws Exception{
try {
		Debug.PushSubsStack("UpdateAdIndex (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("updateadindex")) { return __ref.runUserSub(false, "mediacache","updateadindex", __ref, _ad, _cachedadindex);}
RemoteObject _adid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ad", _ad);
Debug.locals.put("cachedAdIndex", _cachedadindex);
 BA.debugLineNum = 96;BA.debugLine="Private Sub UpdateAdIndex(ad As Map, cachedAdIndex";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
Debug.ShouldStop(1);
_adid = BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("adId", _adid);Debug.locals.put("adId", _adid);
 BA.debugLineNum = 98;BA.debugLine="If adId = \"\" Then Return";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 99;BA.debugLine="Dim entry As Map";
Debug.ShouldStop(4);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("entry", _entry);
 BA.debugLineNum = 100;BA.debugLine="entry.Initialize";
Debug.ShouldStop(8);
_entry.runVoidMethod ("Initialize");
 BA.debugLineNum = 101;BA.debugLine="entry.Put(\"id\", adId)";
Debug.ShouldStop(16);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_adid)));
 BA.debugLineNum = 102;BA.debugLine="entry.Put(\"title\", ad.GetDefault(\"title\", \"\"))";
Debug.ShouldStop(32);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 103;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
Debug.ShouldStop(64);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 104;BA.debugLine="entry.Put(\"duration\", ad.GetDefault(\"duration\", 0";
Debug.ShouldStop(128);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 105;BA.debugLine="entry.Put(\"gain\", ad.GetDefault(\"gain\", 0))";
Debug.ShouldStop(256);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 106;BA.debugLine="cachedAdIndex.Put(adId, entry)";
Debug.ShouldStop(512);
_cachedadindex.runVoidMethod ("Put",(Object)((_adid)),(Object)((_entry.getObject())));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}