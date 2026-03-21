package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mediacache_subs_0 {


public static RemoteObject  _buildadurl(RemoteObject __ref,RemoteObject _adid) throws Exception{
try {
		Debug.PushSubsStack("BuildAdUrl (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,255);
if (RapidSub.canDelegate("buildadurl")) { return __ref.runUserSub(false, "mediacache","buildadurl", __ref, _adid);}
RemoteObject _first = RemoteObject.createImmutable("");
Debug.locals.put("adId", _adid);
 BA.debugLineNum = 255;BA.debugLine="Private Sub BuildAdUrl(adId As String) As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="If adId = \"\" Then Return \"\"";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 257;BA.debugLine="Dim first As String = adId.SubString2(0, 1)";
Debug.ShouldStop(1);
_first = _adid.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 258;BA.debugLine="Return \"https://cdn.fon.fm/media/ads/\" & first &";
Debug.ShouldStop(2);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("https://cdn.fon.fm/media/ads/"),_first,RemoteObject.createImmutable("/"),_adid,RemoteObject.createImmutable(".mp3"));
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("BuildTempCacheFileName (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("buildtempcachefilename")) { return __ref.runUserSub(false, "mediacache","buildtempcachefilename", __ref, _itemid);}
Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 279;BA.debugLine="Private Sub BuildTempCacheFileName(itemId As Strin";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="Return itemId & \".tmp\"";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.concat(_itemid,RemoteObject.createImmutable(".tmp"));
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("BuildTrackUrl (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("buildtrackurl")) { return __ref.runUserSub(false, "mediacache","buildtrackurl", __ref, _trackid);}
RemoteObject _first = RemoteObject.createImmutable("");
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 261;BA.debugLine="Private Sub BuildTrackUrl(trackId As String) As St";
Debug.ShouldStop(16);
 BA.debugLineNum = 262;BA.debugLine="If trackId = \"\" Then Return \"\"";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 263;BA.debugLine="Dim first As String = trackId.SubString2(0, 1)";
Debug.ShouldStop(64);
_first = _trackid.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 264;BA.debugLine="Return \"https://cdn.fon.fm/media/tracks/\" & first";
Debug.ShouldStop(128);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("https://cdn.fon.fm/media/tracks/"),_first,RemoteObject.createImmutable("/"),_trackid,RemoteObject.createImmutable(".mp3"));
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _deletefileifexists(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DeleteFileIfExists (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,293);
if (RapidSub.canDelegate("deletefileifexists")) { return __ref.runUserSub(false, "mediacache","deletefileifexists", __ref, _dir, _filename);}
Debug.locals.put("dir", _dir);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 293;BA.debugLine="Private Sub DeleteFileIfExists(dir As String, file";
Debug.ShouldStop(16);
 BA.debugLineNum = 294;BA.debugLine="If fileName = \"\" Then Return";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 295;BA.debugLine="If File.Exists(dir, fileName) Then File.Delete(di";
Debug.ShouldStop(64);
if (mediacache.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_dir),(Object)(_filename)).<Boolean>get().booleanValue()) { 
mediacache.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_dir),(Object)(_filename));};
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("EnsureAdsCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,21);
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
		Debug.PushSubsStack("EnsureAdsCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,21);
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
 BA.debugLineNum = 22;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 23;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 24;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
Debug.ShouldStop(8388608);
_ads = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ads = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ads"))),(Object)(parent.__c.getField(false,"Null"))));Debug.locals.put("ads", _ads);Debug.locals.put("ads", _ads);
 BA.debugLineNum = 25;BA.debugLine="If ads.IsInitialized = False Or ads.Size = 0 Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 26;BA.debugLine="Dim cachedAdIndex As Map = GetCachedAdIndex";
Debug.ShouldStop(33554432);
_cachedadindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cachedadindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getcachedadindex" /*RemoteObject*/ );Debug.locals.put("cachedAdIndex", _cachedadindex);Debug.locals.put("cachedAdIndex", _cachedadindex);
 BA.debugLineNum = 27;BA.debugLine="Dim downloadedCount As Int = 0";
Debug.ShouldStop(67108864);
_downloadedcount = BA.numberCast(int.class, 0);Debug.locals.put("downloadedCount", _downloadedcount);Debug.locals.put("downloadedCount", _downloadedcount);
 BA.debugLineNum = 28;BA.debugLine="Dim failedCount As Int = 0";
Debug.ShouldStop(134217728);
_failedcount = BA.numberCast(int.class, 0);Debug.locals.put("failedCount", _failedcount);Debug.locals.put("failedCount", _failedcount);
 BA.debugLineNum = 29;BA.debugLine="For Each adObject As Object In ads";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 30;BA.debugLine="If adObject Is Map Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 31;BA.debugLine="Dim ad As Map = adObject";
Debug.ShouldStop(1073741824);
_ad = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ad = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _adobject);Debug.locals.put("ad", _ad);Debug.locals.put("ad", _ad);
 BA.debugLineNum = 32;BA.debugLine="Wait For (EnsureSingleAdCached(ad, cachedAdInde";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensureadscached"), __ref.runClassMethod (b4j.example.mediacache.class, "_ensuresingleadcached" /*RemoteObject*/ ,(Object)(_ad),(Object)(_cachedadindex)));
this.state = 35;
return;
case 35:
//C
this.state = 25;
_downloaded = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("downloaded", _downloaded);
;
 BA.debugLineNum = 33;BA.debugLine="If downloaded Then";
Debug.ShouldStop(1);
if (true) break;

case 25:
//if
this.state = 30;
if (_downloaded.<Boolean>get().booleanValue()) { 
this.state = 27;
}else 
{ BA.debugLineNum = 35;BA.debugLine="Else If IsAdCached(ad.GetDefault(\"id\", \"\")) = F";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_isadcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))),parent.__c.getField(true,"False"))) { 
this.state = 29;
}}
if (true) break;

case 27:
//C
this.state = 30;
 BA.debugLineNum = 34;BA.debugLine="downloadedCount = downloadedCount + 1";
Debug.ShouldStop(2);
_downloadedcount = RemoteObject.solve(new RemoteObject[] {_downloadedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("downloadedCount", _downloadedcount);
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 36;BA.debugLine="failedCount = failedCount + 1";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 40;BA.debugLine="storage.Put(\"cached_ad_index\", cachedAdIndex)";
Debug.ShouldStop(128);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_index")),(Object)((_cachedadindex.getObject())));
 BA.debugLineNum = 41;BA.debugLine="storage.Put(\"cached_ad_count\", cachedAdIndex.Size";
Debug.ShouldStop(256);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_count")),(Object)((_cachedadindex.runMethod(true,"getSize"))));
 BA.debugLineNum = 42;BA.debugLine="Trace(\"Синхронизация кэша рекламы завершена. down";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Синхронизация кэша рекламы завершена. downloaded="),_downloadedcount,RemoteObject.createImmutable(", failed="),_failedcount,RemoteObject.createImmutable(", actual="),_cachedadindex.runMethod(true,"getSize"))));
 BA.debugLineNum = 43;BA.debugLine="Return downloadedCount > 0";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((RemoteObject.solveBoolean(">",_downloadedcount,BA.numberCast(double.class, 0)))));return;};
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("EnsureDirectory (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("ensuredirectory")) { return __ref.runUserSub(false, "mediacache","ensuredirectory", __ref, _path);}
RemoteObject _fileobject = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("path", _path);
 BA.debugLineNum = 312;BA.debugLine="Private Sub EnsureDirectory(path As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 313;BA.debugLine="Dim fileObject As JavaObject";
Debug.ShouldStop(16777216);
_fileobject = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("fileObject", _fileobject);
 BA.debugLineNum = 314;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
Debug.ShouldStop(33554432);
_fileobject.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_path)})));
 BA.debugLineNum = 315;BA.debugLine="fileObject.RunMethod(\"mkdirs\", Null)";
Debug.ShouldStop(67108864);
_fileobject.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("mkdirs")),(Object)((mediacache.__c.getField(false,"Null"))));
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("EnsureSingleAdCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,112);
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
RemoteObject _tempfilename = RemoteObject.createImmutable("");
RemoteObject _outstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureSingleAdCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,112);
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
 BA.debugLineNum = 113;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
Debug.ShouldStop(65536);
_adid = BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("adId", _adid);Debug.locals.put("adId", _adid);
 BA.debugLineNum = 114;BA.debugLine="If adId = \"\" Then Return False";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 115;BA.debugLine="If IsAdCached(adId) Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 116;BA.debugLine="UpdateAdIndex(ad, cachedAdIndex)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_ad),(Object)(_cachedadindex));
 BA.debugLineNum = 117;BA.debugLine="Return False";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 119;BA.debugLine="Dim adUrl As String = BuildAdUrl(adId)";
Debug.ShouldStop(4194304);
_adurl = __ref.runClassMethod (b4j.example.mediacache.class, "_buildadurl" /*RemoteObject*/ ,(Object)(_adid));Debug.locals.put("adUrl", _adurl);Debug.locals.put("adUrl", _adurl);
 BA.debugLineNum = 120;BA.debugLine="If adUrl = \"\" Then Return False";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 121;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(16777216);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 122;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(33554432);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 123;BA.debugLine="Trace(\"Скачивание рекламы в кэш. id=\" & adId & \",";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Скачивание рекламы в кэш. id="),_adid,RemoteObject.createImmutable(", url="),_adurl)));
 BA.debugLineNum = 124;BA.debugLine="j.Download(adUrl)";
Debug.ShouldStop(134217728);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_adurl));
 BA.debugLineNum = 125;BA.debugLine="j.GetRequest.Timeout = 15000";
Debug.ShouldStop(268435456);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 126;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensuresingleadcached"), (_j));
this.state = 36;
return;
case 36:
//C
this.state = 17;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 127;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 128;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 129;BA.debugLine="EnsureDirectory(GetAdsDir)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )));
 BA.debugLineNum = 130;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
Debug.ShouldStop(2);
_tempfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_adid));Debug.locals.put("tempFileName", _tempfilename);Debug.locals.put("tempFileName", _tempfilename);
 BA.debugLineNum = 131;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 132;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
Debug.ShouldStop(8);
_outstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_outstream = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("outStream", _outstream);Debug.locals.put("outStream", _outstream);
 BA.debugLineNum = 133;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
Debug.ShouldStop(16);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (b4j.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_outstream.getObject())));
 BA.debugLineNum = 134;BA.debugLine="outStream.Close";
Debug.ShouldStop(32);
_outstream.runVoidMethod ("Close");
 BA.debugLineNum = 135;BA.debugLine="If IsCachedFileUsable(GetAdsDir, tempFileName)";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 136;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 137;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить рекламу в кэш. id="),_adid,RemoteObject.createImmutable(", message=empty temp file"))));
 BA.debugLineNum = 138;BA.debugLine="j.Release";
Debug.ShouldStop(512);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 139;BA.debugLine="Return False";
Debug.ShouldStop(1024);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 141;BA.debugLine="If ReplaceCacheFile(GetAdsDir, tempFileName, ad";
Debug.ShouldStop(4096);

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_replacecachefile" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(_adid)),parent.__c.getField(true,"False"))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 142;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 143;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить рекламу в кэш. id="),_adid,RemoteObject.createImmutable(", message=rename failed"))));
 BA.debugLineNum = 144;BA.debugLine="j.Release";
Debug.ShouldStop(32768);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 145;BA.debugLine="Return False";
Debug.ShouldStop(65536);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 29:
//C
this.state = 32;
;
 BA.debugLineNum = 147;BA.debugLine="UpdateAdIndex(ad, cachedAdIndex)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_ad),(Object)(_cachedadindex));
 BA.debugLineNum = 148;BA.debugLine="Trace(\"Реклама сохранена в кэш. id=\" & adId)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Реклама сохранена в кэш. id="),_adid)));
 BA.debugLineNum = 149;BA.debugLine="j.Release";
Debug.ShouldStop(1048576);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 150;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
 BA.debugLineNum = 152;BA.debugLine="DeleteFileIfExists(GetAdsDir, BuildTempCacheFil";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_adid))));
 BA.debugLineNum = 153;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=\"";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 156;BA.debugLine="Trace(\"Не удалось скачать рекламу. id=\" & adId &";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось скачать рекламу. id="),_adid,RemoteObject.createImmutable(", message="),_j.getField(true,"_errormessage" /*RemoteObject*/ ))));
 if (true) break;

case 35:
//C
this.state = -1;
;
 BA.debugLineNum = 158;BA.debugLine="j.Release";
Debug.ShouldStop(536870912);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 159;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _ensuresingletrackcached(RemoteObject __ref,RemoteObject _item,RemoteObject _cachedtrackindex) throws Exception{
try {
		Debug.PushSubsStack("EnsureSingleTrackCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("ensuresingletrackcached")) { return __ref.runUserSub(false, "mediacache","ensuresingletrackcached", __ref, _item, _cachedtrackindex);}
ResumableSub_EnsureSingleTrackCached rsub = new ResumableSub_EnsureSingleTrackCached(null,__ref,_item,_cachedtrackindex);
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
public ResumableSub_EnsureSingleTrackCached(b4j.example.mediacache parent,RemoteObject __ref,RemoteObject _item,RemoteObject _cachedtrackindex) {
this.parent = parent;
this.__ref = __ref;
this._item = _item;
this._cachedtrackindex = _cachedtrackindex;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.mediacache parent;
RemoteObject _item;
RemoteObject _cachedtrackindex;
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _trackurl = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _tempfilename = RemoteObject.createImmutable("");
RemoteObject _outstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureSingleTrackCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,162);
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
Debug.locals.put("cachedTrackIndex", _cachedtrackindex);
 BA.debugLineNum = 163;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(4);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 164;BA.debugLine="If trackId = \"\" Then Return False";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 165;BA.debugLine="If IsTrackCached(trackId) Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 166;BA.debugLine="UpdateTrackIndex(item, cachedTrackIndex)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_cachedtrackindex));
 BA.debugLineNum = 167;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 169;BA.debugLine="Dim trackUrl As String = BuildTrackUrl(trackId)";
Debug.ShouldStop(256);
_trackurl = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackurl" /*RemoteObject*/ ,(Object)(_trackid));Debug.locals.put("trackUrl", _trackurl);Debug.locals.put("trackUrl", _trackurl);
 BA.debugLineNum = 170;BA.debugLine="If trackUrl = \"\" Then Return False";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 171;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(1024);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 172;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(2048);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 173;BA.debugLine="Trace(\"Скачивание трека в кэш. id=\" & trackId & \"";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Скачивание трека в кэш. id="),_trackid,RemoteObject.createImmutable(", url="),_trackurl)));
 BA.debugLineNum = 174;BA.debugLine="j.Download(trackUrl)";
Debug.ShouldStop(8192);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_trackurl));
 BA.debugLineNum = 175;BA.debugLine="j.GetRequest.Timeout = 20000";
Debug.ShouldStop(16384);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 20000));
 BA.debugLineNum = 176;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensuresingletrackcached"), (_j));
this.state = 36;
return;
case 36:
//C
this.state = 17;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 177;BA.debugLine="If j.Success Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 178;BA.debugLine="Try";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 179;BA.debugLine="EnsureDirectory(GetTracksDir)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )));
 BA.debugLineNum = 180;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
Debug.ShouldStop(524288);
_tempfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_trackid));Debug.locals.put("tempFileName", _tempfilename);Debug.locals.put("tempFileName", _tempfilename);
 BA.debugLineNum = 181;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 182;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
Debug.ShouldStop(2097152);
_outstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_outstream = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("outStream", _outstream);Debug.locals.put("outStream", _outstream);
 BA.debugLineNum = 183;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
Debug.ShouldStop(4194304);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (b4j.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_outstream.getObject())));
 BA.debugLineNum = 184;BA.debugLine="outStream.Close";
Debug.ShouldStop(8388608);
_outstream.runVoidMethod ("Close");
 BA.debugLineNum = 185;BA.debugLine="If IsCachedFileUsable(GetTracksDir, tempFileNam";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 186;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 187;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить трек в кэш. id="),_trackid,RemoteObject.createImmutable(", message=empty temp file"))));
 BA.debugLineNum = 188;BA.debugLine="j.Release";
Debug.ShouldStop(134217728);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 189;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 191;BA.debugLine="If ReplaceCacheFile(GetTracksDir, tempFileName,";
Debug.ShouldStop(1073741824);

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_replacecachefile" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(_trackid)),parent.__c.getField(true,"False"))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 192;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 193;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить трек в кэш. id="),_trackid,RemoteObject.createImmutable(", message=rename failed"))));
 BA.debugLineNum = 194;BA.debugLine="j.Release";
Debug.ShouldStop(2);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 195;BA.debugLine="Return False";
Debug.ShouldStop(4);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 29:
//C
this.state = 32;
;
 BA.debugLineNum = 197;BA.debugLine="UpdateTrackIndex(item, cachedTrackIndex)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_cachedtrackindex));
 BA.debugLineNum = 198;BA.debugLine="Trace(\"Трек сохранен в кэш. id=\" & trackId)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Трек сохранен в кэш. id="),_trackid)));
 BA.debugLineNum = 199;BA.debugLine="j.Release";
Debug.ShouldStop(64);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 200;BA.debugLine="Return True";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
 BA.debugLineNum = 202;BA.debugLine="DeleteFileIfExists(GetTracksDir, BuildTempCache";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_trackid))));
 BA.debugLineNum = 203;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 206;BA.debugLine="Trace(\"Не удалось скачать трек. id=\" & trackId &";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось скачать трек. id="),_trackid,RemoteObject.createImmutable(", message="),_j.getField(true,"_errormessage" /*RemoteObject*/ ))));
 if (true) break;

case 35:
//C
this.state = -1;
;
 BA.debugLineNum = 208;BA.debugLine="j.Release";
Debug.ShouldStop(32768);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 209;BA.debugLine="Return False";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("EnsureTracksCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,80);
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
RemoteObject _cachedtrackindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
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
		Debug.PushSubsStack("EnsureTracksCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,80);
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
 BA.debugLineNum = 81;BA.debugLine="If trackItems.IsInitialized = False Or trackItems";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 82;BA.debugLine="Dim cachedTrackIndex As Map = GetCachedTrackIndex";
Debug.ShouldStop(131072);
_cachedtrackindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cachedtrackindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getcachedtrackindex" /*RemoteObject*/ );Debug.locals.put("cachedTrackIndex", _cachedtrackindex);Debug.locals.put("cachedTrackIndex", _cachedtrackindex);
 BA.debugLineNum = 83;BA.debugLine="Dim seenTrackIds As Map";
Debug.ShouldStop(262144);
_seentrackids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("seenTrackIds", _seentrackids);
 BA.debugLineNum = 84;BA.debugLine="seenTrackIds.Initialize";
Debug.ShouldStop(524288);
_seentrackids.runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="Dim downloadedCount As Int = 0";
Debug.ShouldStop(1048576);
_downloadedcount = BA.numberCast(int.class, 0);Debug.locals.put("downloadedCount", _downloadedcount);Debug.locals.put("downloadedCount", _downloadedcount);
 BA.debugLineNum = 86;BA.debugLine="Dim failedCount As Int = 0";
Debug.ShouldStop(2097152);
_failedcount = BA.numberCast(int.class, 0);Debug.locals.put("failedCount", _failedcount);Debug.locals.put("failedCount", _failedcount);
 BA.debugLineNum = 87;BA.debugLine="Dim processedCount As Int = 0";
Debug.ShouldStop(4194304);
_processedcount = BA.numberCast(int.class, 0);Debug.locals.put("processedCount", _processedcount);Debug.locals.put("processedCount", _processedcount);
 BA.debugLineNum = 88;BA.debugLine="For Each itemObject As Object In trackItems";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 89;BA.debugLine="If processedCount >= maxCount Then Exit";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 90;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 91;BA.debugLine="Dim item As Map = itemObject";
Debug.ShouldStop(67108864);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 92;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 93;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"";
Debug.ShouldStop(268435456);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 94;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 95;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Conti";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 96;BA.debugLine="seenTrackIds.Put(trackId, True)";
Debug.ShouldStop(-2147483648);
_seentrackids.runVoidMethod ("Put",(Object)((_trackid)),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 97;BA.debugLine="processedCount = processedCount + 1";
Debug.ShouldStop(1);
_processedcount = RemoteObject.solve(new RemoteObject[] {_processedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("processedCount", _processedcount);
 BA.debugLineNum = 98;BA.debugLine="Wait For (EnsureSingleTrackCached(item, cachedT";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensuretrackscached"), __ref.runClassMethod (b4j.example.mediacache.class, "_ensuresingletrackcached" /*RemoteObject*/ ,(Object)(_item),(Object)(_cachedtrackindex)));
this.state = 47;
return;
case 47:
//C
this.state = 37;
_downloaded = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("downloaded", _downloaded);
;
 BA.debugLineNum = 99;BA.debugLine="If downloaded Then";
Debug.ShouldStop(4);
if (true) break;

case 37:
//if
this.state = 42;
if (_downloaded.<Boolean>get().booleanValue()) { 
this.state = 39;
}else 
{ BA.debugLineNum = 101;BA.debugLine="Else If IsTrackCached(trackId) = False Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_trackid)),parent.__c.getField(true,"False"))) { 
this.state = 41;
}}
if (true) break;

case 39:
//C
this.state = 42;
 BA.debugLineNum = 100;BA.debugLine="downloadedCount = downloadedCount + 1";
Debug.ShouldStop(8);
_downloadedcount = RemoteObject.solve(new RemoteObject[] {_downloadedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("downloadedCount", _downloadedcount);
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 102;BA.debugLine="failedCount = failedCount + 1";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 106;BA.debugLine="storage.Put(\"cached_track_index\", cachedTrackInde";
Debug.ShouldStop(512);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_track_index")),(Object)((_cachedtrackindex.getObject())));
 BA.debugLineNum = 107;BA.debugLine="storage.Put(\"cached_track_count\", cachedTrackInde";
Debug.ShouldStop(1024);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_track_count")),(Object)((_cachedtrackindex.runMethod(true,"getSize"))));
 BA.debugLineNum = 108;BA.debugLine="Trace(\"Синхронизация кэша треков завершена. downl";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Синхронизация кэша треков завершена. downloaded="),_downloadedcount,RemoteObject.createImmutable(", failed="),_failedcount,RemoteObject.createImmutable(", actual="),_cachedtrackindex.runMethod(true,"getSize"))));
 BA.debugLineNum = 109;BA.debugLine="Return downloadedCount > 0";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((RemoteObject.solveBoolean(">",_downloadedcount,BA.numberCast(double.class, 0)))));return;};
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static RemoteObject  _getadsdir(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetAdsDir (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("getadsdir")) { return __ref.runUserSub(false, "mediacache","getadsdir", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Public Sub GetAdsDir As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
Debug.ShouldStop(8);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mediadirname" /*RemoteObject*/ )))),(Object)(__ref.getField(true,"_adsdirname" /*RemoteObject*/ )));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("GetCachedAdIndex (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("getcachedadindex")) { return __ref.runUserSub(false, "mediacache","getcachedadindex", __ref);}
RemoteObject _cachedadindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 239;BA.debugLine="Private Sub GetCachedAdIndex As Map";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="Dim cachedAdIndex As Map = storage.GetDefault(\"ca";
Debug.ShouldStop(32768);
_cachedadindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cachedadindex = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_index")),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("cachedAdIndex", _cachedadindex);Debug.locals.put("cachedAdIndex", _cachedadindex);
 BA.debugLineNum = 241;BA.debugLine="If cachedAdIndex.IsInitialized = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_cachedadindex.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 242;BA.debugLine="cachedAdIndex.Initialize";
Debug.ShouldStop(131072);
_cachedadindex.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 244;BA.debugLine="Return cachedAdIndex";
Debug.ShouldStop(524288);
if (true) return _cachedadindex;
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("GetCachedTrackIndex (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("getcachedtrackindex")) { return __ref.runUserSub(false, "mediacache","getcachedtrackindex", __ref);}
RemoteObject _cachedtrackindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 247;BA.debugLine="Private Sub GetCachedTrackIndex As Map";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="Dim cachedTrackIndex As Map = storage.GetDefault(";
Debug.ShouldStop(8388608);
_cachedtrackindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cachedtrackindex = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_track_index")),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("cachedTrackIndex", _cachedtrackindex);Debug.locals.put("cachedTrackIndex", _cachedtrackindex);
 BA.debugLineNum = 249;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_cachedtrackindex.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 250;BA.debugLine="cachedTrackIndex.Initialize";
Debug.ShouldStop(33554432);
_cachedtrackindex.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 252;BA.debugLine="Return cachedTrackIndex";
Debug.ShouldStop(134217728);
if (true) return _cachedtrackindex;
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("GetTracksDir (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("gettracksdir")) { return __ref.runUserSub(false, "mediacache","gettracksdir", __ref);}
 BA.debugLineNum = 71;BA.debugLine="Public Sub GetTracksDir As String";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
Debug.ShouldStop(128);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mediadirname" /*RemoteObject*/ )))),(Object)(__ref.getField(true,"_tracksdirname" /*RemoteObject*/ )));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _storagedirvalue,RemoteObject _storagevalue,RemoteObject _targetmodulevalue,RemoteObject _tracesubnamevalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "mediacache","initialize", __ref, _ba, _storagedirvalue, _storagevalue, _targetmodulevalue, _tracesubnamevalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("storageDirValue", _storagedirvalue);
Debug.locals.put("storageValue", _storagevalue);
Debug.locals.put("targetModuleValue", _targetmodulevalue);
Debug.locals.put("traceSubNameValue", _tracesubnamevalue);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="storageDir = storageDirValue";
Debug.ShouldStop(4096);
__ref.setField ("_storagedir" /*RemoteObject*/ ,_storagedirvalue);
 BA.debugLineNum = 14;BA.debugLine="storage = storageValue";
Debug.ShouldStop(8192);
__ref.setField ("_storage" /*RemoteObject*/ ,_storagevalue);
 BA.debugLineNum = 15;BA.debugLine="targetModule = targetModuleValue";
Debug.ShouldStop(16384);
__ref.setField ("_targetmodule" /*RemoteObject*/ ,_targetmodulevalue);
 BA.debugLineNum = 16;BA.debugLine="traceSubName = traceSubNameValue";
Debug.ShouldStop(32768);
__ref.setField ("_tracesubname" /*RemoteObject*/ ,_tracesubnamevalue);
 BA.debugLineNum = 17;BA.debugLine="EnsureDirectory(GetAdsDir)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )));
 BA.debugLineNum = 18;BA.debugLine="EnsureDirectory(GetTracksDir)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("IsAdCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("isadcached")) { return __ref.runUserSub(false, "mediacache","isadcached", __ref, _adid);}
Debug.locals.put("adId", _adid);
 BA.debugLineNum = 62;BA.debugLine="Public Sub IsAdCached(adId As String) As Boolean";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="If adId = \"\" Then Return False";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 64;BA.debugLine="Return IsCachedFileUsable(GetAdsDir, adId)";
Debug.ShouldStop(-2147483648);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_adid));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("IsCachedFileUsable (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,267);
if (RapidSub.canDelegate("iscachedfileusable")) { return __ref.runUserSub(false, "mediacache","iscachedfileusable", __ref, _dir, _filename);}
Debug.locals.put("dir", _dir);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 267;BA.debugLine="Private Sub IsCachedFileUsable(dir As String, file";
Debug.ShouldStop(1024);
 BA.debugLineNum = 268;BA.debugLine="If fileName = \"\" Then Return False";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 269;BA.debugLine="If File.Exists(dir, fileName) = False Then Return";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",mediacache.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_dir),(Object)(_filename)),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 270;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 271;BA.debugLine="If File.Size(dir, fileName) > 0 Then Return True";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",mediacache.__c.getField(false,"File").runMethod(true,"Size",(Object)(_dir),(Object)(_filename)),BA.numberCast(long.class, 0))) { 
Debug.CheckDeviceExceptions();if (true) return mediacache.__c.getField(true,"True");};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 273;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(65536);
mediacache.__c.runVoidMethod ("LogImpl","441418758",mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 275;BA.debugLine="DeleteFileIfExists(dir, fileName)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 276;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("IsTrackCached (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("istrackcached")) { return __ref.runUserSub(false, "mediacache","istrackcached", __ref, _trackid);}
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 75;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="If trackId = \"\" Then Return False";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 77;BA.debugLine="Return IsCachedFileUsable(GetTracksDir, trackId)";
Debug.ShouldStop(4096);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_trackid));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _replacecachefile(RemoteObject __ref,RemoteObject _dir,RemoteObject _tempfilename,RemoteObject _finalfilename) throws Exception{
try {
		Debug.PushSubsStack("ReplaceCacheFile (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("replacecachefile")) { return __ref.runUserSub(false, "mediacache","replacecachefile", __ref, _dir, _tempfilename, _finalfilename);}
RemoteObject _tempfile = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _finalfile = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("dir", _dir);
Debug.locals.put("tempFileName", _tempfilename);
Debug.locals.put("finalFileName", _finalfilename);
 BA.debugLineNum = 283;BA.debugLine="Private Sub ReplaceCacheFile(dir As String, tempFi";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 284;BA.debugLine="If IsCachedFileUsable(dir, tempFileName) = False";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_dir),(Object)(_tempfilename)),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 285;BA.debugLine="DeleteFileIfExists(dir, finalFileName)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_finalfilename));
 BA.debugLineNum = 286;BA.debugLine="Dim tempFile As JavaObject";
Debug.ShouldStop(536870912);
_tempfile = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("tempFile", _tempfile);
 BA.debugLineNum = 287;BA.debugLine="tempFile.InitializeNewInstance(\"java.io.File\", Ar";
Debug.ShouldStop(1073741824);
_tempfile.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_tempfilename)))})));
 BA.debugLineNum = 288;BA.debugLine="Dim finalFile As JavaObject";
Debug.ShouldStop(-2147483648);
_finalfile = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("finalFile", _finalfile);
 BA.debugLineNum = 289;BA.debugLine="finalFile.InitializeNewInstance(\"java.io.File\", A";
Debug.ShouldStop(1);
_finalfile.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_finalfilename)))})));
 BA.debugLineNum = 290;BA.debugLine="Return tempFile.RunMethod(\"renameTo\", Array As Ob";
Debug.ShouldStop(2);
if (true) return BA.ObjectToBoolean(_tempfile.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("renameTo")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_finalfile.getObject())}))));
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("ResolveLocalMediaUri (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("resolvelocalmediauri")) { return __ref.runUserSub(false, "mediacache","resolvelocalmediauri", __ref, _item);}
RemoteObject _itemtype = RemoteObject.createImmutable("");
RemoteObject _itemid = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 46;BA.debugLine="Public Sub ResolveLocalMediaUri(item As Map) As St";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 48;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(32768);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 49;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(65536);
_itemid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemId", _itemid);Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 50;BA.debugLine="If itemId = \"\" Then Return \"\"";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 51;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 52;BA.debugLine="If IsAdCached(itemId) = False Then Return \"\"";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_isadcached" /*RemoteObject*/ ,(Object)(_itemid)),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 53;BA.debugLine="Return File.GetUri(GetAdsDir, itemId)";
Debug.ShouldStop(1048576);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_itemid));
 };
 BA.debugLineNum = 55;BA.debugLine="If itemType = \"track\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
 BA.debugLineNum = 56;BA.debugLine="If IsTrackCached(itemId) = False Then Return \"\"";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_itemid)),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 57;BA.debugLine="Return File.GetUri(GetTracksDir, itemId)";
Debug.ShouldStop(16777216);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_itemid));
 };
 BA.debugLineNum = 59;BA.debugLine="Return \"\"";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("ResolveMediaSource (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,298);
if (RapidSub.canDelegate("resolvemediasource")) { return __ref.runUserSub(false, "mediacache","resolvemediasource", __ref, _item);}
RemoteObject _itemtype = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 298;BA.debugLine="Public Sub ResolveMediaSource(item As Map) As Stri";
Debug.ShouldStop(512);
 BA.debugLineNum = 299;BA.debugLine="If item.IsInitialized = False Then Return \"none\"";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("none");};
 BA.debugLineNum = 300;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(2048);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 301;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 302;BA.debugLine="If IsAdCached(item.GetDefault(\"id\", \"\")) Then Re";
Debug.ShouldStop(8192);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_isadcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))).<Boolean>get().booleanValue()) { 
if (true) return BA.ObjectToString("cache");};
 BA.debugLineNum = 303;BA.debugLine="Return \"cdn\"";
Debug.ShouldStop(16384);
if (true) return BA.ObjectToString("cdn");
 };
 BA.debugLineNum = 305;BA.debugLine="If itemType = \"track\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
 BA.debugLineNum = 306;BA.debugLine="If IsTrackCached(item.GetDefault(\"id\", \"\")) Then";
Debug.ShouldStop(131072);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))).<Boolean>get().booleanValue()) { 
if (true) return BA.ObjectToString("cache");};
 BA.debugLineNum = 307;BA.debugLine="Return \"cdn\"";
Debug.ShouldStop(262144);
if (true) return BA.ObjectToString("cdn");
 };
 BA.debugLineNum = 309;BA.debugLine="Return \"none\"";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToString("none");
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Trace (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "mediacache","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 318;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 319;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
Debug.ShouldStop(1073741824);
if (mediacache.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 320;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
Debug.ShouldStop(-2147483648);
mediacache.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ )),(Object)((_message)));
 };
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("UpdateAdIndex (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,212);
if (RapidSub.canDelegate("updateadindex")) { return __ref.runUserSub(false, "mediacache","updateadindex", __ref, _ad, _cachedadindex);}
RemoteObject _adid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ad", _ad);
Debug.locals.put("cachedAdIndex", _cachedadindex);
 BA.debugLineNum = 212;BA.debugLine="Private Sub UpdateAdIndex(ad As Map, cachedAdIndex";
Debug.ShouldStop(524288);
 BA.debugLineNum = 213;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
Debug.ShouldStop(1048576);
_adid = BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("adId", _adid);Debug.locals.put("adId", _adid);
 BA.debugLineNum = 214;BA.debugLine="If adId = \"\" Then Return";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 215;BA.debugLine="Dim entry As Map";
Debug.ShouldStop(4194304);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("entry", _entry);
 BA.debugLineNum = 216;BA.debugLine="entry.Initialize";
Debug.ShouldStop(8388608);
_entry.runVoidMethod ("Initialize");
 BA.debugLineNum = 217;BA.debugLine="entry.Put(\"id\", adId)";
Debug.ShouldStop(16777216);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_adid)));
 BA.debugLineNum = 218;BA.debugLine="entry.Put(\"title\", ad.GetDefault(\"title\", \"\"))";
Debug.ShouldStop(33554432);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 219;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
Debug.ShouldStop(67108864);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 220;BA.debugLine="entry.Put(\"duration\", ad.GetDefault(\"duration\", 0";
Debug.ShouldStop(134217728);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 221;BA.debugLine="entry.Put(\"gain\", ad.GetDefault(\"gain\", 0))";
Debug.ShouldStop(268435456);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 222;BA.debugLine="cachedAdIndex.Put(adId, entry)";
Debug.ShouldStop(536870912);
_cachedadindex.runVoidMethod ("Put",(Object)((_adid)),(Object)((_entry.getObject())));
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatetrackindex(RemoteObject __ref,RemoteObject _item,RemoteObject _cachedtrackindex) throws Exception{
try {
		Debug.PushSubsStack("UpdateTrackIndex (mediacache) ","mediacache",7,__ref.getField(false, "ba"),__ref,225);
if (RapidSub.canDelegate("updatetrackindex")) { return __ref.runUserSub(false, "mediacache","updatetrackindex", __ref, _item, _cachedtrackindex);}
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("item", _item);
Debug.locals.put("cachedTrackIndex", _cachedtrackindex);
 BA.debugLineNum = 225;BA.debugLine="Private Sub UpdateTrackIndex(item As Map, cachedTr";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(2);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 227;BA.debugLine="If trackId = \"\" Then Return";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 228;BA.debugLine="Dim entry As Map";
Debug.ShouldStop(8);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("entry", _entry);
 BA.debugLineNum = 229;BA.debugLine="entry.Initialize";
Debug.ShouldStop(16);
_entry.runVoidMethod ("Initialize");
 BA.debugLineNum = 230;BA.debugLine="entry.Put(\"id\", trackId)";
Debug.ShouldStop(32);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_trackid)));
 BA.debugLineNum = 231;BA.debugLine="entry.Put(\"title\", item.GetDefault(\"title\", \"\"))";
Debug.ShouldStop(64);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 232;BA.debugLine="entry.Put(\"set\", item.GetDefault(\"set\", \"\"))";
Debug.ShouldStop(128);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("set"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("set"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 233;BA.debugLine="entry.Put(\"stream\", item.GetDefault(\"stream\", \"\")";
Debug.ShouldStop(256);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 234;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
Debug.ShouldStop(512);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 235;BA.debugLine="entry.Put(\"gain\", item.GetDefault(\"gain\", 0))";
Debug.ShouldStop(1024);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 236;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
Debug.ShouldStop(2048);
_cachedtrackindex.runVoidMethod ("Put",(Object)((_trackid)),(Object)((_entry.getObject())));
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}