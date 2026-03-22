package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mediacache_subs_0 {


public static RemoteObject  _addindexedfilefromaudit(RemoteObject __ref,RemoteObject _itemtype,RemoteObject _filename,RemoteObject _auditindex) throws Exception{
try {
		Debug.PushSubsStack("AddIndexedFileFromAudit (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,751);
if (RapidSub.canDelegate("addindexedfilefromaudit")) { return __ref.runUserSub(false, "mediacache","addindexedfilefromaudit", __ref, _itemtype, _filename, _auditindex);}
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("itemType", _itemtype);
Debug.locals.put("fileName", _filename);
Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 751;BA.debugLine="Private Sub AddIndexedFileFromAudit(itemType As St";
Debug.ShouldStop(16384);
 BA.debugLineNum = 752;BA.debugLine="Dim entry As Map";
Debug.ShouldStop(32768);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("entry", _entry);
 BA.debugLineNum = 753;BA.debugLine="entry.Initialize";
Debug.ShouldStop(65536);
_entry.runVoidMethod ("Initialize");
 BA.debugLineNum = 754;BA.debugLine="entry.Put(\"id\", fileName)";
Debug.ShouldStop(131072);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_filename)));
 BA.debugLineNum = 755;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
Debug.ShouldStop(262144);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 756;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(524288);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 757;BA.debugLine="If itemType = \"ads\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ads"))) { 
 BA.debugLineNum = 758;BA.debugLine="entry.Put(\"title\", \"\")";
Debug.ShouldStop(2097152);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 759;BA.debugLine="entry.Put(\"duration\", 0)";
Debug.ShouldStop(4194304);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 760;BA.debugLine="entry.Put(\"gain\", 0)";
Debug.ShouldStop(8388608);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))));
 }else {
 BA.debugLineNum = 762;BA.debugLine="entry.Put(\"title\", \"\")";
Debug.ShouldStop(33554432);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 763;BA.debugLine="entry.Put(\"set\", \"\")";
Debug.ShouldStop(67108864);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("set"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 764;BA.debugLine="entry.Put(\"stream\", \"\")";
Debug.ShouldStop(134217728);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 765;BA.debugLine="entry.Put(\"gain\", 0)";
Debug.ShouldStop(268435456);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))));
 };
 BA.debugLineNum = 767;BA.debugLine="auditIndex.Put(fileName, entry)";
Debug.ShouldStop(1073741824);
_auditindex.runVoidMethod ("Put",(Object)((_filename)),(Object)((_entry.getObject())));
 BA.debugLineNum = 768;BA.debugLine="MarkAuditIndexChanged(itemType)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.mediacache.class, "_markauditindexchanged" /*RemoteObject*/ ,(Object)(_itemtype));
 BA.debugLineNum = 769;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _applyxortobuffer(RemoteObject __ref,RemoteObject _buffer,RemoteObject _count,RemoteObject _keybytes,RemoteObject _keyoffset) throws Exception{
try {
		Debug.PushSubsStack("ApplyXorToBuffer (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,512);
if (RapidSub.canDelegate("applyxortobuffer")) { return __ref.runUserSub(false, "mediacache","applyxortobuffer", __ref, _buffer, _count, _keybytes, _keyoffset);}
int _i = 0;
RemoteObject _keyindex = RemoteObject.createImmutable(0);
Debug.locals.put("buffer", _buffer);
Debug.locals.put("count", _count);
Debug.locals.put("keyBytes", _keybytes);
Debug.locals.put("keyOffset", _keyoffset);
 BA.debugLineNum = 512;BA.debugLine="Private Sub ApplyXorToBuffer(buffer() As Byte, cou";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 513;BA.debugLine="If count <= 0 Or keyBytes.Length = 0 Then Return";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("k",_count,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",_keybytes.getField(true,"length"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 514;BA.debugLine="For i = 0 To count - 1";
Debug.ShouldStop(2);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 515;BA.debugLine="Dim keyIndex As Int = (keyOffset + i) Mod keyByt";
Debug.ShouldStop(4);
_keyindex = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_keyoffset,RemoteObject.createImmutable(_i)}, "+",1, 2)),_keybytes.getField(true,"length")}, "%",0, 2));Debug.locals.put("keyIndex", _keyindex);Debug.locals.put("keyIndex", _keyindex);
 BA.debugLineNum = 516;BA.debugLine="buffer(i) = Bit.Xor(buffer(i), keyBytes(keyIndex";
Debug.ShouldStop(8);
_buffer.setArrayElement (BA.numberCast(byte.class, mediacache.__c.getField(false,"Bit").runMethod(true,"Xor",(Object)(BA.numberCast(int.class, _buffer.getArrayElement(true,BA.numberCast(int.class, _i)))),(Object)(BA.numberCast(int.class, _keybytes.getArrayElement(true,_keyindex))))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _buildadurl(RemoteObject __ref,RemoteObject _adid) throws Exception{
try {
		Debug.PushSubsStack("BuildAdUrl (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,403);
if (RapidSub.canDelegate("buildadurl")) { return __ref.runUserSub(false, "mediacache","buildadurl", __ref, _adid);}
RemoteObject _first = RemoteObject.createImmutable("");
Debug.locals.put("adId", _adid);
 BA.debugLineNum = 403;BA.debugLine="Private Sub BuildAdUrl(adId As String) As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 404;BA.debugLine="If adId = \"\" Then Return \"\"";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 405;BA.debugLine="Dim first As String = adId.SubString2(0, 1)";
Debug.ShouldStop(1048576);
_first = _adid.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 406;BA.debugLine="Return \"https://cdn.fon.fm/media/ads/\" & first &";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("https://cdn.fon.fm/media/ads/"),_first,RemoteObject.createImmutable("/"),_adid,RemoteObject.createImmutable(".mp3"));
 BA.debugLineNum = 407;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildplaybacktemptrackfilename(RemoteObject __ref,RemoteObject _audiokey) throws Exception{
try {
		Debug.PushSubsStack("BuildPlaybackTempTrackFileName (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,440);
if (RapidSub.canDelegate("buildplaybacktemptrackfilename")) { return __ref.runUserSub(false, "mediacache","buildplaybacktemptrackfilename", __ref, _audiokey);}
Debug.locals.put("audioKey", _audiokey);
 BA.debugLineNum = 440;BA.debugLine="Private Sub BuildPlaybackTempTrackFileName(audioKe";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 441;BA.debugLine="If audioKey = \"secondary\" Then Return SECONDARY_T";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_audiokey,BA.ObjectToString("secondary"))) { 
if (true) return __ref.getField(true,"_secondary_temp_track_file" /*RemoteObject*/ );};
 BA.debugLineNum = 442;BA.debugLine="Return PRIMARY_TEMP_TRACK_FILE";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(true,"_primary_temp_track_file" /*RemoteObject*/ );
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
public static RemoteObject  _buildtempcachefilename(RemoteObject __ref,RemoteObject _itemid) throws Exception{
try {
		Debug.PushSubsStack("BuildTempCacheFileName (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,436);
if (RapidSub.canDelegate("buildtempcachefilename")) { return __ref.runUserSub(false, "mediacache","buildtempcachefilename", __ref, _itemid);}
Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 436;BA.debugLine="Private Sub BuildTempCacheFileName(itemId As Strin";
Debug.ShouldStop(524288);
 BA.debugLineNum = 437;BA.debugLine="Return itemId & \".tmp\"";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.concat(_itemid,RemoteObject.createImmutable(".tmp"));
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtrackcachefilename(RemoteObject __ref,RemoteObject _trackid) throws Exception{
try {
		Debug.PushSubsStack("BuildTrackCacheFileName (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,415);
if (RapidSub.canDelegate("buildtrackcachefilename")) { return __ref.runUserSub(false, "mediacache","buildtrackcachefilename", __ref, _trackid);}
RemoteObject _sourcebytes = null;
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _uuid = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 415;BA.debugLine="Private Sub BuildTrackCacheFileName(trackId As Str";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 416;BA.debugLine="Dim sourceBytes() As Byte = GetBytesFromString(\"f";
Debug.ShouldStop(-2147483648);
_sourcebytes = __ref.runClassMethod (b4j.example.mediacache.class, "_getbytesfromstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("fonfm-track|"),__ref.getField(true,"_devicekeyseed" /*RemoteObject*/ ),RemoteObject.createImmutable("|"),_trackid)));Debug.locals.put("sourceBytes", _sourcebytes);Debug.locals.put("sourceBytes", _sourcebytes);
 BA.debugLineNum = 417;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(1);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 418;BA.debugLine="jo.InitializeStatic(\"java.util.UUID\")";
Debug.ShouldStop(2);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.util.UUID")));
 BA.debugLineNum = 419;BA.debugLine="Dim uuid As JavaObject = jo.RunMethod(\"nameUUIDFr";
Debug.ShouldStop(4);
_uuid = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_uuid = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("nameUUIDFromBytes")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_sourcebytes)}))));Debug.locals.put("uuid", _uuid);Debug.locals.put("uuid", _uuid);
 BA.debugLineNum = 420;BA.debugLine="Dim fileName As String = uuid.RunMethod(\"toString";
Debug.ShouldStop(8);
_filename = BA.ObjectToString(_uuid.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toString")),(Object)((mediacache.__c.getField(false,"Null")))));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 421;BA.debugLine="Return fileName.Replace(\"-\", \"\")";
Debug.ShouldStop(16);
if (true) return _filename.runMethod(true,"replace",(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 422;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtrackobfuscationkey(RemoteObject __ref,RemoteObject _trackid) throws Exception{
try {
		Debug.PushSubsStack("BuildTrackObfuscationKey (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,484);
if (RapidSub.canDelegate("buildtrackobfuscationkey")) { return __ref.runUserSub(false, "mediacache","buildtrackobfuscationkey", __ref, _trackid);}
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 484;BA.debugLine="Private Sub BuildTrackObfuscationKey(trackId As St";
Debug.ShouldStop(8);
 BA.debugLineNum = 485;BA.debugLine="Return GetBytesFromString(\"fonfm-track-key|\" & de";
Debug.ShouldStop(16);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_getbytesfromstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("fonfm-track-key|"),__ref.getField(true,"_devicekeyseed" /*RemoteObject*/ ),RemoteObject.createImmutable("|"),_trackid)));
 BA.debugLineNum = 486;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtrackurl(RemoteObject __ref,RemoteObject _trackid) throws Exception{
try {
		Debug.PushSubsStack("BuildTrackUrl (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,409);
if (RapidSub.canDelegate("buildtrackurl")) { return __ref.runUserSub(false, "mediacache","buildtrackurl", __ref, _trackid);}
RemoteObject _first = RemoteObject.createImmutable("");
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 409;BA.debugLine="Private Sub BuildTrackUrl(trackId As String) As St";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 410;BA.debugLine="If trackId = \"\" Then Return \"\"";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 411;BA.debugLine="Dim first As String = trackId.SubString2(0, 1)";
Debug.ShouldStop(67108864);
_first = _trackid.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 412;BA.debugLine="Return \"https://cdn.fon.fm/media/tracks/\" & first";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("https://cdn.fon.fm/media/tracks/"),_first,RemoteObject.createImmutable("/"),_trackid,RemoteObject.createImmutable(".mp3"));
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
 //BA.debugLineNum = 7;BA.debugLine="Private deviceKeySeed As String";
mediacache._devicekeyseed = RemoteObject.createImmutable("");__ref.setField("_devicekeyseed",mediacache._devicekeyseed);
 //BA.debugLineNum = 8;BA.debugLine="Private mediaDirName As String = \"media\"";
mediacache._mediadirname = BA.ObjectToString("media");__ref.setField("_mediadirname",mediacache._mediadirname);
 //BA.debugLineNum = 9;BA.debugLine="Private adsDirName As String = \"ads\"";
mediacache._adsdirname = BA.ObjectToString("ads");__ref.setField("_adsdirname",mediacache._adsdirname);
 //BA.debugLineNum = 10;BA.debugLine="Private tracksDirName As String = \"tracks\"";
mediacache._tracksdirname = BA.ObjectToString("tracks");__ref.setField("_tracksdirname",mediacache._tracksdirname);
 //BA.debugLineNum = 11;BA.debugLine="Private Const CACHE_AUDIT_BATCH_SIZE As Int = 8";
mediacache._cache_audit_batch_size = BA.numberCast(int.class, 8);__ref.setField("_cache_audit_batch_size",mediacache._cache_audit_batch_size);
 //BA.debugLineNum = 12;BA.debugLine="Private Const AD_DOWNLOAD_TIMEOUT_MS As Int = 150";
mediacache._ad_download_timeout_ms = BA.numberCast(int.class, 15000);__ref.setField("_ad_download_timeout_ms",mediacache._ad_download_timeout_ms);
 //BA.debugLineNum = 13;BA.debugLine="Private Const TRACK_DOWNLOAD_TIMEOUT_MS As Int =";
mediacache._track_download_timeout_ms = BA.numberCast(int.class, 10000);__ref.setField("_track_download_timeout_ms",mediacache._track_download_timeout_ms);
 //BA.debugLineNum = 14;BA.debugLine="Private Const STREAM_XOR_BUFFER_SIZE As Int = 327";
mediacache._stream_xor_buffer_size = BA.numberCast(int.class, 32768);__ref.setField("_stream_xor_buffer_size",mediacache._stream_xor_buffer_size);
 //BA.debugLineNum = 15;BA.debugLine="Private Const PRIMARY_TEMP_TRACK_FILE As String =";
mediacache._primary_temp_track_file = BA.ObjectToString("2f7f5f2f-91a0-4f4c-9f5f-70d7b94fd101.tmp");__ref.setField("_primary_temp_track_file",mediacache._primary_temp_track_file);
 //BA.debugLineNum = 16;BA.debugLine="Private Const SECONDARY_TEMP_TRACK_FILE As String";
mediacache._secondary_temp_track_file = BA.ObjectToString("92c2df6a-7f22-4b75-8c09-d5a6f4f40a21.tmp");__ref.setField("_secondary_temp_track_file",mediacache._secondary_temp_track_file);
 //BA.debugLineNum = 17;BA.debugLine="Private cachedAdIndex As Map";
mediacache._cachedadindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cachedadindex",mediacache._cachedadindex);
 //BA.debugLineNum = 18;BA.debugLine="Private cachedTrackIndex As Map";
mediacache._cachedtrackindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cachedtrackindex",mediacache._cachedtrackindex);
 //BA.debugLineNum = 19;BA.debugLine="Private playbackTempTrackIds As Map";
mediacache._playbacktemptrackids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_playbacktemptrackids",mediacache._playbacktemptrackids);
 //BA.debugLineNum = 20;BA.debugLine="Private cacheAuditInProgress As Boolean";
mediacache._cacheauditinprogress = RemoteObject.createImmutable(false);__ref.setField("_cacheauditinprogress",mediacache._cacheauditinprogress);
 //BA.debugLineNum = 21;BA.debugLine="Private cacheAuditPendingTypes As List";
mediacache._cacheauditpendingtypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_cacheauditpendingtypes",mediacache._cacheauditpendingtypes);
 //BA.debugLineNum = 22;BA.debugLine="Private cacheAuditCurrentType As String";
mediacache._cacheauditcurrenttype = RemoteObject.createImmutable("");__ref.setField("_cacheauditcurrenttype",mediacache._cacheauditcurrenttype);
 //BA.debugLineNum = 23;BA.debugLine="Private cacheAuditCurrentFileNames As List";
mediacache._cacheauditcurrentfilenames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_cacheauditcurrentfilenames",mediacache._cacheauditcurrentfilenames);
 //BA.debugLineNum = 24;BA.debugLine="Private cacheAuditCurrentPosition As Int";
mediacache._cacheauditcurrentposition = RemoteObject.createImmutable(0);__ref.setField("_cacheauditcurrentposition",mediacache._cacheauditcurrentposition);
 //BA.debugLineNum = 25;BA.debugLine="Private cacheAuditSeenIds As Map";
mediacache._cacheauditseenids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cacheauditseenids",mediacache._cacheauditseenids);
 //BA.debugLineNum = 26;BA.debugLine="Private cacheAuditAdIndexChanged As Boolean";
mediacache._cacheauditadindexchanged = RemoteObject.createImmutable(false);__ref.setField("_cacheauditadindexchanged",mediacache._cacheauditadindexchanged);
 //BA.debugLineNum = 27;BA.debugLine="Private cacheAuditTrackIndexChanged As Boolean";
mediacache._cacheaudittrackindexchanged = RemoteObject.createImmutable(false);__ref.setField("_cacheaudittrackindexchanged",mediacache._cacheaudittrackindexchanged);
 //BA.debugLineNum = 28;BA.debugLine="Private cacheAuditAddedCount As Int";
mediacache._cacheauditaddedcount = RemoteObject.createImmutable(0);__ref.setField("_cacheauditaddedcount",mediacache._cacheauditaddedcount);
 //BA.debugLineNum = 29;BA.debugLine="Private cacheAuditRemovedCount As Int";
mediacache._cacheauditremovedcount = RemoteObject.createImmutable(0);__ref.setField("_cacheauditremovedcount",mediacache._cacheauditremovedcount);
 //BA.debugLineNum = 30;BA.debugLine="Private cacheAuditTempDeletedCount As Int";
mediacache._cacheaudittempdeletedcount = RemoteObject.createImmutable(0);__ref.setField("_cacheaudittempdeletedcount",mediacache._cacheaudittempdeletedcount);
 //BA.debugLineNum = 31;BA.debugLine="Private recentMediaNetworkFailure As Boolean";
mediacache._recentmedianetworkfailure = RemoteObject.createImmutable(false);__ref.setField("_recentmedianetworkfailure",mediacache._recentmedianetworkfailure);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleanupplaybacktempfiles(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CleanupPlaybackTempFiles (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("cleanupplaybacktempfiles")) { return __ref.runUserSub(false, "mediacache","cleanupplaybacktempfiles", __ref);}
 BA.debugLineNum = 135;BA.debugLine="Public Sub CleanupPlaybackTempFiles";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="DeleteFileIfExists(File.DirTemp, PRIMARY_TEMP_TRA";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(__ref.getField(true,"_primary_temp_track_file" /*RemoteObject*/ )));
 BA.debugLineNum = 137;BA.debugLine="DeleteFileIfExists(File.DirTemp, SECONDARY_TEMP_T";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(__ref.getField(true,"_secondary_temp_track_file" /*RemoteObject*/ )));
 BA.debugLineNum = 138;BA.debugLine="playbackTempTrackIds.Clear";
Debug.ShouldStop(512);
__ref.getField(false,"_playbacktemptrackids" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _consumerecentmedianetworkfailure(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConsumeRecentMediaNetworkFailure (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("consumerecentmedianetworkfailure")) { return __ref.runUserSub(false, "mediacache","consumerecentmedianetworkfailure", __ref);}
RemoteObject _value = RemoteObject.createImmutable(false);
 BA.debugLineNum = 200;BA.debugLine="Public Sub ConsumeRecentMediaNetworkFailure As Boo";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Dim value As Boolean = recentMediaNetworkFailure";
Debug.ShouldStop(256);
_value = __ref.getField(true,"_recentmedianetworkfailure" /*RemoteObject*/ );Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 202;BA.debugLine="recentMediaNetworkFailure = False";
Debug.ShouldStop(512);
__ref.setField ("_recentmedianetworkfailure" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 203;BA.debugLine="Return value";
Debug.ShouldStop(1024);
if (true) return _value;
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deletefileifexists(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DeleteFileIfExists (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,520);
if (RapidSub.canDelegate("deletefileifexists")) { return __ref.runUserSub(false, "mediacache","deletefileifexists", __ref, _dir, _filename);}
Debug.locals.put("dir", _dir);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 520;BA.debugLine="Private Sub DeleteFileIfExists(dir As String, file";
Debug.ShouldStop(128);
 BA.debugLineNum = 521;BA.debugLine="If fileName = \"\" Then Return";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 522;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 523;BA.debugLine="If File.Exists(dir, fileName) Then File.Delete(d";
Debug.ShouldStop(1024);
if (mediacache.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_dir),(Object)(_filename)).<Boolean>get().booleanValue()) { 
mediacache.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_dir),(Object)(_filename));};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 525;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(4096);
mediacache.__c.runVoidMethod ("LogImpl","425821189",mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 527;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _elapsedms(RemoteObject __ref,RemoteObject _startedat) throws Exception{
try {
		Debug.PushSubsStack("ElapsedMs (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,634);
if (RapidSub.canDelegate("elapsedms")) { return __ref.runUserSub(false, "mediacache","elapsedms", __ref, _startedat);}
Debug.locals.put("startedAt", _startedat);
 BA.debugLineNum = 634;BA.debugLine="Private Sub ElapsedMs(startedAt As Long) As Long";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 635;BA.debugLine="Return Max(0, DateTime.Now - startedAt)";
Debug.ShouldStop(67108864);
if (true) return BA.numberCast(long.class, mediacache.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"),_startedat}, "-",1, 2)))));
 BA.debugLineNum = 636;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ensureadscached(RemoteObject __ref,RemoteObject _offlinedata) throws Exception{
try {
		Debug.PushSubsStack("EnsureAdsCached (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,88);
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
		Debug.PushSubsStack("EnsureAdsCached (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,88);
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
 BA.debugLineNum = 89;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 90;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 91;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
Debug.ShouldStop(67108864);
_ads = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ads = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ads"))),(Object)(parent.__c.getField(false,"Null"))));Debug.locals.put("ads", _ads);Debug.locals.put("ads", _ads);
 BA.debugLineNum = 92;BA.debugLine="If ads.IsInitialized = False Or ads.Size = 0 Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 93;BA.debugLine="Dim cachedAdIndex As Map = GetCachedAdIndex";
Debug.ShouldStop(268435456);
parent._cachedadindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
parent._cachedadindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getcachedadindex" /*RemoteObject*/ );__ref.setField("_cachedadindex",parent._cachedadindex);
 BA.debugLineNum = 94;BA.debugLine="Dim downloadedCount As Int = 0";
Debug.ShouldStop(536870912);
_downloadedcount = BA.numberCast(int.class, 0);Debug.locals.put("downloadedCount", _downloadedcount);Debug.locals.put("downloadedCount", _downloadedcount);
 BA.debugLineNum = 95;BA.debugLine="Dim failedCount As Int = 0";
Debug.ShouldStop(1073741824);
_failedcount = BA.numberCast(int.class, 0);Debug.locals.put("failedCount", _failedcount);Debug.locals.put("failedCount", _failedcount);
 BA.debugLineNum = 96;BA.debugLine="For Each adObject As Object In ads";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 97;BA.debugLine="If adObject Is Map Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 98;BA.debugLine="Dim ad As Map = adObject";
Debug.ShouldStop(2);
_ad = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ad = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _adobject);Debug.locals.put("ad", _ad);Debug.locals.put("ad", _ad);
 BA.debugLineNum = 99;BA.debugLine="Wait For (EnsureSingleAdCached(ad, cachedAdInde";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensureadscached"), __ref.runClassMethod (b4j.example.mediacache.class, "_ensuresingleadcached" /*RemoteObject*/ ,(Object)(_ad),(Object)(__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ))));
this.state = 35;
return;
case 35:
//C
this.state = 25;
_downloaded = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("downloaded", _downloaded);
;
 BA.debugLineNum = 100;BA.debugLine="If downloaded Then";
Debug.ShouldStop(8);
if (true) break;

case 25:
//if
this.state = 30;
if (_downloaded.<Boolean>get().booleanValue()) { 
this.state = 27;
}else 
{ BA.debugLineNum = 102;BA.debugLine="Else If IsAdCached(ad.GetDefault(\"id\", \"\")) = F";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_isadcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))),parent.__c.getField(true,"False"))) { 
this.state = 29;
}}
if (true) break;

case 27:
//C
this.state = 30;
 BA.debugLineNum = 101;BA.debugLine="downloadedCount = downloadedCount + 1";
Debug.ShouldStop(16);
_downloadedcount = RemoteObject.solve(new RemoteObject[] {_downloadedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("downloadedCount", _downloadedcount);
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 103;BA.debugLine="failedCount = failedCount + 1";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 107;BA.debugLine="SaveAdIndex";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );
 BA.debugLineNum = 108;BA.debugLine="Trace(\"Синхронизация кэша рекламы завершена. down";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Синхронизация кэша рекламы завершена. downloaded="),_downloadedcount,RemoteObject.createImmutable(", failed="),_failedcount,RemoteObject.createImmutable(", actual="),__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"getSize"))));
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
public static void  _complete(RemoteObject __ref,RemoteObject _downloaded) throws Exception{
}
public static RemoteObject  _ensuredirectory(RemoteObject __ref,RemoteObject _path) throws Exception{
try {
		Debug.PushSubsStack("EnsureDirectory (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,638);
if (RapidSub.canDelegate("ensuredirectory")) { return __ref.runUserSub(false, "mediacache","ensuredirectory", __ref, _path);}
RemoteObject _fileobject = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("path", _path);
 BA.debugLineNum = 638;BA.debugLine="Private Sub EnsureDirectory(path As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 639;BA.debugLine="Dim fileObject As JavaObject";
Debug.ShouldStop(1073741824);
_fileobject = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("fileObject", _fileobject);
 BA.debugLineNum = 640;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
Debug.ShouldStop(-2147483648);
_fileobject.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_path)})));
 BA.debugLineNum = 641;BA.debugLine="fileObject.RunMethod(\"mkdirs\", Null)";
Debug.ShouldStop(1);
_fileobject.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("mkdirs")),(Object)((mediacache.__c.getField(false,"Null"))));
 BA.debugLineNum = 642;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("EnsureSingleAdCached (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,206);
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
RemoteObject _downloadstartedat = RemoteObject.createImmutable(0L);
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _tempfilename = RemoteObject.createImmutable("");
RemoteObject _copystartedat = RemoteObject.createImmutable(0L);
RemoteObject _outstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _replacestartedat = RemoteObject.createImmutable(0L);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureSingleAdCached (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,206);
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
 BA.debugLineNum = 207;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
Debug.ShouldStop(16384);
_adid = BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("adId", _adid);Debug.locals.put("adId", _adid);
 BA.debugLineNum = 208;BA.debugLine="If adId = \"\" Then Return False";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 209;BA.debugLine="If TryRestoreExistingCachedMedia(\"ad\", adId, ad,";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//if
this.state = 12;
if (__ref.runClassMethod (b4j.example.mediacache.class, "_tryrestoreexistingcachedmedia" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ad")),(Object)(_adid),(Object)(_ad),(Object)(_adindex)).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 210;BA.debugLine="If IsAdCached(adId) Then";
Debug.ShouldStop(131072);
if (true) break;

case 13:
//if
this.state = 16;
if (__ref.runClassMethod (b4j.example.mediacache.class, "_isadcached" /*RemoteObject*/ ,(Object)(_adid)).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 211;BA.debugLine="UpdateAdIndex(ad, adIndex)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_ad),(Object)(_adindex));
 BA.debugLineNum = 212;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 214;BA.debugLine="Dim adUrl As String = BuildAdUrl(adId)";
Debug.ShouldStop(2097152);
_adurl = __ref.runClassMethod (b4j.example.mediacache.class, "_buildadurl" /*RemoteObject*/ ,(Object)(_adid));Debug.locals.put("adUrl", _adurl);Debug.locals.put("adUrl", _adurl);
 BA.debugLineNum = 215;BA.debugLine="If adUrl = \"\" Then Return False";
Debug.ShouldStop(4194304);
if (true) break;

case 17:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_adurl,BA.ObjectToString(""))) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 216;BA.debugLine="Dim downloadStartedAt As Long = DateTime.Now";
Debug.ShouldStop(8388608);
_downloadstartedat = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("downloadStartedAt", _downloadstartedat);Debug.locals.put("downloadStartedAt", _downloadstartedat);
 BA.debugLineNum = 217;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(16777216);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 218;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(33554432);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 219;BA.debugLine="Trace(\"Скачивание рекламы в кэш. id=\" & adId & \",";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Скачивание рекламы в кэш. id="),_adid,RemoteObject.createImmutable(", url="),_adurl)));
 BA.debugLineNum = 220;BA.debugLine="j.Download(adUrl)";
Debug.ShouldStop(134217728);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_adurl));
 BA.debugLineNum = 221;BA.debugLine="j.GetRequest.Timeout = AD_DOWNLOAD_TIMEOUT_MS";
Debug.ShouldStop(268435456);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",__ref.getField(true,"_ad_download_timeout_ms" /*RemoteObject*/ ));
 BA.debugLineNum = 222;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensuresingleadcached"), (_j));
this.state = 49;
return;
case 49:
//C
this.state = 23;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 223;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 23:
//if
this.state = 48;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 25;
}else {
this.state = 41;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 224;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 225;BA.debugLine="Trace(\"Скачивание рекламы завершено. id=\" & adI";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Скачивание рекламы завершено. id="),_adid,RemoteObject.createImmutable(", elapsedMs="),__ref.runClassMethod (b4j.example.mediacache.class, "_elapsedms" /*RemoteObject*/ ,(Object)(_downloadstartedat)))));
 BA.debugLineNum = 226;BA.debugLine="EnsureDirectory(GetAdsDir)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )));
 BA.debugLineNum = 227;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
Debug.ShouldStop(4);
_tempfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_adid));Debug.locals.put("tempFileName", _tempfilename);Debug.locals.put("tempFileName", _tempfilename);
 BA.debugLineNum = 228;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 229;BA.debugLine="Dim copyStartedAt As Long = DateTime.Now";
Debug.ShouldStop(16);
_copystartedat = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("copyStartedAt", _copystartedat);Debug.locals.put("copyStartedAt", _copystartedat);
 BA.debugLineNum = 230;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
Debug.ShouldStop(32);
_outstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_outstream = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("outStream", _outstream);Debug.locals.put("outStream", _outstream);
 BA.debugLineNum = 231;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
Debug.ShouldStop(64);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (b4j.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_outstream.getObject())));
 BA.debugLineNum = 232;BA.debugLine="outStream.Close";
Debug.ShouldStop(128);
_outstream.runVoidMethod ("Close");
 BA.debugLineNum = 233;BA.debugLine="Trace(\"Запись временного файла рекламы завершен";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Запись временного файла рекламы завершена. id="),_adid,RemoteObject.createImmutable(", elapsedMs="),__ref.runClassMethod (b4j.example.mediacache.class, "_elapsedms" /*RemoteObject*/ ,(Object)(_copystartedat)))));
 BA.debugLineNum = 234;BA.debugLine="If IsCachedFileUsable(GetAdsDir, tempFileName)";
Debug.ShouldStop(512);
if (true) break;

case 29:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename)),parent.__c.getField(true,"False"))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 235;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 236;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить рекламу в кэш. id="),_adid,RemoteObject.createImmutable(", message=empty temp file"))));
 BA.debugLineNum = 237;BA.debugLine="j.Release";
Debug.ShouldStop(4096);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 238;BA.debugLine="Return False";
Debug.ShouldStop(8192);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 240;BA.debugLine="Dim replaceStartedAt As Long = DateTime.Now";
Debug.ShouldStop(32768);
_replacestartedat = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("replaceStartedAt", _replacestartedat);Debug.locals.put("replaceStartedAt", _replacestartedat);
 BA.debugLineNum = 241;BA.debugLine="If ReplaceCacheFile(GetAdsDir, tempFileName, ad";
Debug.ShouldStop(65536);
if (true) break;

case 33:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_replacecachefile" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(_adid)),parent.__c.getField(true,"False"))) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 242;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 243;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить рекламу в кэш. id="),_adid,RemoteObject.createImmutable(", message=rename failed"))));
 BA.debugLineNum = 244;BA.debugLine="j.Release";
Debug.ShouldStop(524288);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 245;BA.debugLine="Return False";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 36:
//C
this.state = 39;
;
 BA.debugLineNum = 247;BA.debugLine="Trace(\"Финализация файла рекламы завершена. id=";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Финализация файла рекламы завершена. id="),_adid,RemoteObject.createImmutable(", elapsedMs="),__ref.runClassMethod (b4j.example.mediacache.class, "_elapsedms" /*RemoteObject*/ ,(Object)(_replacestartedat)))));
 BA.debugLineNum = 248;BA.debugLine="UpdateAdIndex(ad, adIndex)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_ad),(Object)(_adindex));
 BA.debugLineNum = 249;BA.debugLine="SaveAdIndex";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );
 BA.debugLineNum = 250;BA.debugLine="recentMediaNetworkFailure = False";
Debug.ShouldStop(33554432);
__ref.setField ("_recentmedianetworkfailure" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 251;BA.debugLine="Trace(\"Реклама сохранена в кэш. id=\" & adId & \"";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Реклама сохранена в кэш. id="),_adid,RemoteObject.createImmutable(", totalElapsedMs="),__ref.runClassMethod (b4j.example.mediacache.class, "_elapsedms" /*RemoteObject*/ ,(Object)(_downloadstartedat)))));
 BA.debugLineNum = 252;BA.debugLine="j.Release";
Debug.ShouldStop(134217728);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 253;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 38:
//C
this.state = 39;
this.catchState = 0;
 BA.debugLineNum = 255;BA.debugLine="DeleteFileIfExists(GetAdsDir, BuildTempCacheFil";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_adid))));
 BA.debugLineNum = 256;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=\"";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить рекламу в кэш. id="),_adid,RemoteObject.createImmutable(", message="),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
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
 BA.debugLineNum = 259;BA.debugLine="If IsMediaNetworkFailure(j.ErrorMessage) Then re";
Debug.ShouldStop(4);
if (true) break;

case 42:
//if
this.state = 47;
if (__ref.runClassMethod (b4j.example.mediacache.class, "_ismedianetworkfailure" /*RemoteObject*/ ,(Object)(_j.getField(true,"_errormessage" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 44;
;}if (true) break;

case 44:
//C
this.state = 47;
__ref.setField ("_recentmedianetworkfailure" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
if (true) break;

case 47:
//C
this.state = 48;
;
 BA.debugLineNum = 260;BA.debugLine="Trace(\"Не удалось скачать рекламу. id=\" & adId &";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось скачать рекламу. id="),_adid,RemoteObject.createImmutable(", message="),_j.getField(true,"_errormessage" /*RemoteObject*/ ))));
 if (true) break;

case 48:
//C
this.state = -1;
;
 BA.debugLineNum = 262;BA.debugLine="j.Release";
Debug.ShouldStop(32);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 263;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("EnsureSingleTrackCached (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,266);
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
RemoteObject _downloadstartedat = RemoteObject.createImmutable(0L);
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _tempfilename = RemoteObject.createImmutable("");
RemoteObject _copystartedat = RemoteObject.createImmutable(0L);
RemoteObject _outstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _replacestartedat = RemoteObject.createImmutable(0L);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureSingleTrackCached (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,266);
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
 BA.debugLineNum = 267;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(1024);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 268;BA.debugLine="If trackId = \"\" Then Return False";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 269;BA.debugLine="If TryRestoreExistingCachedMedia(\"track\", trackId";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 12;
if (__ref.runClassMethod (b4j.example.mediacache.class, "_tryrestoreexistingcachedmedia" /*RemoteObject*/ ,(Object)(BA.ObjectToString("track")),(Object)(_trackid),(Object)(_item),(Object)(_trackindex)).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 270;BA.debugLine="If IsTrackCached(trackId) Then";
Debug.ShouldStop(8192);
if (true) break;

case 13:
//if
this.state = 16;
if (__ref.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_trackid)).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 271;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_trackindex));
 BA.debugLineNum = 272;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 274;BA.debugLine="Dim trackUrl As String = BuildTrackUrl(trackId)";
Debug.ShouldStop(131072);
_trackurl = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackurl" /*RemoteObject*/ ,(Object)(_trackid));Debug.locals.put("trackUrl", _trackurl);Debug.locals.put("trackUrl", _trackurl);
 BA.debugLineNum = 275;BA.debugLine="If trackUrl = \"\" Then Return False";
Debug.ShouldStop(262144);
if (true) break;

case 17:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_trackurl,BA.ObjectToString(""))) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 276;BA.debugLine="Dim downloadStartedAt As Long = DateTime.Now";
Debug.ShouldStop(524288);
_downloadstartedat = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("downloadStartedAt", _downloadstartedat);Debug.locals.put("downloadStartedAt", _downloadstartedat);
 BA.debugLineNum = 277;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(1048576);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 278;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(2097152);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 279;BA.debugLine="Trace(\"Скачивание трека в кэш. id=\" & trackId & \"";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Скачивание трека в кэш. id="),_trackid,RemoteObject.createImmutable(", url="),_trackurl)));
 BA.debugLineNum = 280;BA.debugLine="j.Download(trackUrl)";
Debug.ShouldStop(8388608);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_trackurl));
 BA.debugLineNum = 281;BA.debugLine="j.GetRequest.Timeout = TRACK_DOWNLOAD_TIMEOUT_MS";
Debug.ShouldStop(16777216);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",__ref.getField(true,"_track_download_timeout_ms" /*RemoteObject*/ ));
 BA.debugLineNum = 282;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensuresingletrackcached"), (_j));
this.state = 49;
return;
case 49:
//C
this.state = 23;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 283;BA.debugLine="If j.Success Then";
Debug.ShouldStop(67108864);
if (true) break;

case 23:
//if
this.state = 48;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 25;
}else {
this.state = 41;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 284;BA.debugLine="Try";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 285;BA.debugLine="Trace(\"Скачивание трека завершено. id=\" & trac";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Скачивание трека завершено. id="),_trackid,RemoteObject.createImmutable(", elapsedMs="),__ref.runClassMethod (b4j.example.mediacache.class, "_elapsedms" /*RemoteObject*/ ,(Object)(_downloadstartedat)))));
 BA.debugLineNum = 286;BA.debugLine="EnsureDirectory(GetTracksDir)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )));
 BA.debugLineNum = 287;BA.debugLine="Dim tempFileName As String = BuildTempCacheFil";
Debug.ShouldStop(1073741824);
_tempfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_trackid));Debug.locals.put("tempFileName", _tempfilename);Debug.locals.put("tempFileName", _tempfilename);
 BA.debugLineNum = 288;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 289;BA.debugLine="Dim copyStartedAt As Long = DateTime.Now";
Debug.ShouldStop(1);
_copystartedat = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("copyStartedAt", _copystartedat);Debug.locals.put("copyStartedAt", _copystartedat);
 BA.debugLineNum = 290;BA.debugLine="Dim outStream As OutputStream = File.OpenOutpu";
Debug.ShouldStop(2);
_outstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_outstream = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("outStream", _outstream);Debug.locals.put("outStream", _outstream);
 BA.debugLineNum = 291;BA.debugLine="TransformStreamWithXor(j.GetInputStream, outSt";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.mediacache.class, "_transformstreamwithxor" /*RemoteObject*/ ,(Object)(_j.runClassMethod (b4j.example.httpjob.class, "_getinputstream" /*RemoteObject*/ )),(Object)(_outstream),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackobfuscationkey" /*RemoteObject*/ ,(Object)(_trackid))));
 BA.debugLineNum = 292;BA.debugLine="outStream.Close";
Debug.ShouldStop(8);
_outstream.runVoidMethod ("Close");
 BA.debugLineNum = 293;BA.debugLine="Trace(\"Запись временного файла трека завершена";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Запись временного файла трека завершена. id="),_trackid,RemoteObject.createImmutable(", elapsedMs="),__ref.runClassMethod (b4j.example.mediacache.class, "_elapsedms" /*RemoteObject*/ ,(Object)(_copystartedat)))));
 BA.debugLineNum = 294;BA.debugLine="If IsCachedFileUsable(GetTracksDir, tempFileNa";
Debug.ShouldStop(32);
if (true) break;

case 29:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename)),parent.__c.getField(true,"False"))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 295;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 296;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\"";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить трек в кэш. id="),_trackid,RemoteObject.createImmutable(", message=empty temp file"))));
 BA.debugLineNum = 297;BA.debugLine="j.Release";
Debug.ShouldStop(256);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 298;BA.debugLine="Return False";
Debug.ShouldStop(512);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 300;BA.debugLine="Dim replaceStartedAt As Long = DateTime.Now";
Debug.ShouldStop(2048);
_replacestartedat = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("replaceStartedAt", _replacestartedat);Debug.locals.put("replaceStartedAt", _replacestartedat);
 BA.debugLineNum = 301;BA.debugLine="If ReplaceCacheFile(GetTracksDir, tempFileName,";
Debug.ShouldStop(4096);
if (true) break;

case 33:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_replacecachefile" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcachefilename" /*RemoteObject*/ ,(Object)(_trackid)))),parent.__c.getField(true,"False"))) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 302;BA.debugLine="DeleteFileIfExists(GetTracksDir, tempFileName)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 303;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить трек в кэш. id="),_trackid,RemoteObject.createImmutable(", message=rename failed"))));
 BA.debugLineNum = 304;BA.debugLine="j.Release";
Debug.ShouldStop(32768);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 305;BA.debugLine="Return False";
Debug.ShouldStop(65536);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 36:
//C
this.state = 39;
;
 BA.debugLineNum = 307;BA.debugLine="Trace(\"Финализация файла трека завершена. id=\"";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Финализация файла трека завершена. id="),_trackid,RemoteObject.createImmutable(", elapsedMs="),__ref.runClassMethod (b4j.example.mediacache.class, "_elapsedms" /*RemoteObject*/ ,(Object)(_replacestartedat)))));
 BA.debugLineNum = 308;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_trackindex));
 BA.debugLineNum = 309;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 310;BA.debugLine="recentMediaNetworkFailure = False";
Debug.ShouldStop(2097152);
__ref.setField ("_recentmedianetworkfailure" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 311;BA.debugLine="Trace(\"Трек сохранен в кэш. id=\" & trackId & \",";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Трек сохранен в кэш. id="),_trackid,RemoteObject.createImmutable(", totalElapsedMs="),__ref.runClassMethod (b4j.example.mediacache.class, "_elapsedms" /*RemoteObject*/ ,(Object)(_downloadstartedat)))));
 BA.debugLineNum = 312;BA.debugLine="j.Release";
Debug.ShouldStop(8388608);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 313;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 38:
//C
this.state = 39;
this.catchState = 0;
 BA.debugLineNum = 315;BA.debugLine="DeleteFileIfExists(GetTracksDir, BuildTempCache";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_trackid))));
 BA.debugLineNum = 316;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить трек в кэш. id="),_trackid,RemoteObject.createImmutable(", message="),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
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
 BA.debugLineNum = 319;BA.debugLine="If IsMediaNetworkFailure(j.ErrorMessage) Then re";
Debug.ShouldStop(1073741824);
if (true) break;

case 42:
//if
this.state = 47;
if (__ref.runClassMethod (b4j.example.mediacache.class, "_ismedianetworkfailure" /*RemoteObject*/ ,(Object)(_j.getField(true,"_errormessage" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 44;
;}if (true) break;

case 44:
//C
this.state = 47;
__ref.setField ("_recentmedianetworkfailure" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
if (true) break;

case 47:
//C
this.state = 48;
;
 BA.debugLineNum = 320;BA.debugLine="Trace(\"Не удалось скачать трек. id=\" & trackId &";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось скачать трек. id="),_trackid,RemoteObject.createImmutable(", message="),_j.getField(true,"_errormessage" /*RemoteObject*/ ))));
 if (true) break;

case 48:
//C
this.state = -1;
;
 BA.debugLineNum = 322;BA.debugLine="j.Release";
Debug.ShouldStop(2);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 323;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _ensuretrackplaybacktemp(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _trackid) throws Exception{
try {
		Debug.PushSubsStack("EnsureTrackPlaybackTemp (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,464);
if (RapidSub.canDelegate("ensuretrackplaybacktemp")) { return __ref.runUserSub(false, "mediacache","ensuretrackplaybacktemp", __ref, _audiokey, _trackid);}
RemoteObject _tempfilename = RemoteObject.createImmutable("");
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _outputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 464;BA.debugLine="Private Sub EnsureTrackPlaybackTemp(audioKey As St";
Debug.ShouldStop(32768);
 BA.debugLineNum = 465;BA.debugLine="Dim tempFileName As String = BuildPlaybackTempTra";
Debug.ShouldStop(65536);
_tempfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildplaybacktemptrackfilename" /*RemoteObject*/ ,(Object)(_audiokey));Debug.locals.put("tempFileName", _tempfilename);Debug.locals.put("tempFileName", _tempfilename);
 BA.debugLineNum = 466;BA.debugLine="If playbackTempTrackIds.GetDefault(audioKey, \"\")";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_playbacktemptrackids" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_audiokey)),(Object)((RemoteObject.createImmutable("")))),(_trackid)) && RemoteObject.solveBoolean(".",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_tempfilename)))) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 467;BA.debugLine="DeleteFileIfExists(File.DirTemp, tempFileName)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_tempfilename));
 BA.debugLineNum = 468;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 469;BA.debugLine="Dim inputStream As InputStream = File.OpenInput(";
Debug.ShouldStop(1048576);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
_inputstream = mediacache.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackcachefilename" /*RemoteObject*/ ,(Object)(_trackid),(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ )))));Debug.locals.put("inputStream", _inputstream);Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 470;BA.debugLine="Dim outputStream As OutputStream = File.OpenOutp";
Debug.ShouldStop(2097152);
_outputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_outputstream = mediacache.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_tempfilename),(Object)(mediacache.__c.getField(true,"False")));Debug.locals.put("outputStream", _outputstream);Debug.locals.put("outputStream", _outputstream);
 BA.debugLineNum = 471;BA.debugLine="TransformStreamWithXor(inputStream, outputStream";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_transformstreamwithxor" /*RemoteObject*/ ,(Object)(_inputstream),(Object)(_outputstream),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackobfuscationkey" /*RemoteObject*/ ,(Object)(_trackid))));
 BA.debugLineNum = 472;BA.debugLine="outputStream.Close";
Debug.ShouldStop(8388608);
_outputstream.runVoidMethod ("Close");
 BA.debugLineNum = 473;BA.debugLine="inputStream.Close";
Debug.ShouldStop(16777216);
_inputstream.runVoidMethod ("Close");
 BA.debugLineNum = 474;BA.debugLine="playbackTempTrackIds.Put(audioKey, trackId)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_playbacktemptrackids" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_audiokey)),(Object)((_trackid)));
 BA.debugLineNum = 475;BA.debugLine="Return IsCachedFileUsable(File.DirTemp, tempFile";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_tempfilename));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 477;BA.debugLine="DeleteFileIfExists(File.DirTemp, tempFileName)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_tempfilename));
 BA.debugLineNum = 478;BA.debugLine="Trace(\"Не удалось подготовить временный файл тре";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось подготовить временный файл трека. id="),_trackid,RemoteObject.createImmutable(", message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 480;BA.debugLine="playbackTempTrackIds.Remove(audioKey)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_playbacktemptrackids" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_audiokey)));
 BA.debugLineNum = 481;BA.debugLine="Return False";
Debug.ShouldStop(1);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 482;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ensuretrackscached(RemoteObject __ref,RemoteObject _trackitems,RemoteObject _maxcount) throws Exception{
try {
		Debug.PushSubsStack("EnsureTracksCached (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,169);
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
		Debug.PushSubsStack("EnsureTracksCached (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,169);
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
 BA.debugLineNum = 170;BA.debugLine="If trackItems.IsInitialized = False Or trackItems";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 171;BA.debugLine="Dim cachedTrackIndex As Map = GetCachedTrackIndex";
Debug.ShouldStop(1024);
parent._cachedtrackindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
parent._cachedtrackindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getcachedtrackindex" /*RemoteObject*/ );__ref.setField("_cachedtrackindex",parent._cachedtrackindex);
 BA.debugLineNum = 172;BA.debugLine="Dim seenTrackIds As Map";
Debug.ShouldStop(2048);
_seentrackids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("seenTrackIds", _seentrackids);
 BA.debugLineNum = 173;BA.debugLine="seenTrackIds.Initialize";
Debug.ShouldStop(4096);
_seentrackids.runVoidMethod ("Initialize");
 BA.debugLineNum = 174;BA.debugLine="Dim downloadedCount As Int = 0";
Debug.ShouldStop(8192);
_downloadedcount = BA.numberCast(int.class, 0);Debug.locals.put("downloadedCount", _downloadedcount);Debug.locals.put("downloadedCount", _downloadedcount);
 BA.debugLineNum = 175;BA.debugLine="Dim failedCount As Int = 0";
Debug.ShouldStop(16384);
_failedcount = BA.numberCast(int.class, 0);Debug.locals.put("failedCount", _failedcount);Debug.locals.put("failedCount", _failedcount);
 BA.debugLineNum = 176;BA.debugLine="Dim processedCount As Int = 0";
Debug.ShouldStop(32768);
_processedcount = BA.numberCast(int.class, 0);Debug.locals.put("processedCount", _processedcount);Debug.locals.put("processedCount", _processedcount);
 BA.debugLineNum = 177;BA.debugLine="For Each itemObject As Object In trackItems";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 178;BA.debugLine="If processedCount >= maxCount Then Exit";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 179;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 180;BA.debugLine="Dim item As Map = itemObject";
Debug.ShouldStop(524288);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 181;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 182;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"";
Debug.ShouldStop(2097152);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 183;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 184;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Conti";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 185;BA.debugLine="seenTrackIds.Put(trackId, True)";
Debug.ShouldStop(16777216);
_seentrackids.runVoidMethod ("Put",(Object)((_trackid)),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 186;BA.debugLine="processedCount = processedCount + 1";
Debug.ShouldStop(33554432);
_processedcount = RemoteObject.solve(new RemoteObject[] {_processedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("processedCount", _processedcount);
 BA.debugLineNum = 187;BA.debugLine="Wait For (EnsureSingleTrackCached(item, cachedT";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensuretrackscached"), __ref.runClassMethod (b4j.example.mediacache.class, "_ensuresingletrackcached" /*RemoteObject*/ ,(Object)(_item),(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ))));
this.state = 47;
return;
case 47:
//C
this.state = 37;
_downloaded = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("downloaded", _downloaded);
;
 BA.debugLineNum = 188;BA.debugLine="If downloaded Then";
Debug.ShouldStop(134217728);
if (true) break;

case 37:
//if
this.state = 42;
if (_downloaded.<Boolean>get().booleanValue()) { 
this.state = 39;
}else 
{ BA.debugLineNum = 190;BA.debugLine="Else If IsTrackCached(trackId) = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_trackid)),parent.__c.getField(true,"False"))) { 
this.state = 41;
}}
if (true) break;

case 39:
//C
this.state = 42;
 BA.debugLineNum = 189;BA.debugLine="downloadedCount = downloadedCount + 1";
Debug.ShouldStop(268435456);
_downloadedcount = RemoteObject.solve(new RemoteObject[] {_downloadedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("downloadedCount", _downloadedcount);
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 191;BA.debugLine="failedCount = failedCount + 1";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 195;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 196;BA.debugLine="Trace(\"Синхронизация кэша треков завершена. downl";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Синхронизация кэша треков завершена. downloaded="),_downloadedcount,RemoteObject.createImmutable(", failed="),_failedcount,RemoteObject.createImmutable(", actual="),__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 197;BA.debugLine="Return downloadedCount > 0";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((RemoteObject.solveBoolean(">",_downloadedcount,BA.numberCast(double.class, 0)))));return;};
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("FinalizeCurrentCacheAuditType (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,702);
if (RapidSub.canDelegate("finalizecurrentcacheaudittype")) { return __ref.runUserSub(false, "mediacache","finalizecurrentcacheaudittype", __ref);}
RemoteObject _auditdir = RemoteObject.createImmutable("");
RemoteObject _auditindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _keyscopy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
 BA.debugLineNum = 702;BA.debugLine="Private Sub FinalizeCurrentCacheAuditType";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 703;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
Debug.ShouldStop(1073741824);
_auditdir = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditdirbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditDir", _auditdir);Debug.locals.put("auditDir", _auditdir);
 BA.debugLineNum = 704;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
Debug.ShouldStop(-2147483648);
_auditindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_auditindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditindexbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditIndex", _auditindex);Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 705;BA.debugLine="Dim keysCopy As List";
Debug.ShouldStop(1);
_keyscopy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("keysCopy", _keyscopy);
 BA.debugLineNum = 706;BA.debugLine="keysCopy.Initialize";
Debug.ShouldStop(2);
_keyscopy.runVoidMethod ("Initialize");
 BA.debugLineNum = 707;BA.debugLine="For Each key As String In auditIndex.Keys";
Debug.ShouldStop(4);
{
final RemoteObject group5 = _auditindex.runMethod(false,"Keys");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 708;BA.debugLine="keysCopy.Add(key)";
Debug.ShouldStop(8);
_keyscopy.runVoidMethod ("Add",(Object)((_key)));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 710;BA.debugLine="For Each key As String In keysCopy";
Debug.ShouldStop(32);
{
final RemoteObject group8 = _keyscopy;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 711;BA.debugLine="If cacheAuditSeenIds.ContainsKey(key) = False Th";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_key))),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 712;BA.debugLine="Dim fileName As String = ResolveIndexedAuditFil";
Debug.ShouldStop(128);
_filename = __ref.runClassMethod (b4j.example.mediacache.class, "_resolveindexedauditfilename" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )),(Object)(_key),(Object)(_auditindex));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 713;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then";
Debug.ShouldStop(256);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 714;BA.debugLine="cacheAuditSeenIds.Put(key, True)";
Debug.ShouldStop(512);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((mediacache.__c.getField(true,"True"))));
 BA.debugLineNum = 715;BA.debugLine="Continue";
Debug.ShouldStop(1024);
if (true) continue;
 };
 BA.debugLineNum = 717;BA.debugLine="auditIndex.Remove(key)";
Debug.ShouldStop(4096);
_auditindex.runVoidMethod ("Remove",(Object)((_key)));
 BA.debugLineNum = 718;BA.debugLine="cacheAuditRemovedCount = cacheAuditRemovedCount";
Debug.ShouldStop(8192);
__ref.setField ("_cacheauditremovedcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cacheauditremovedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 719;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.mediacache.class, "_markauditindexchanged" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));
 };
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 722;BA.debugLine="Trace(\"Аудит кэша: каталог обработан. type=\" & ca";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Аудит кэша: каталог обработан. type="),__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ ),RemoteObject.createImmutable(", seen="),__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 723;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findtrackidbyfilename(RemoteObject __ref,RemoteObject _filename,RemoteObject _trackindex) throws Exception{
try {
		Debug.PushSubsStack("FindTrackIdByFileName (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,776);
if (RapidSub.canDelegate("findtrackidbyfilename")) { return __ref.runUserSub(false, "mediacache","findtrackidbyfilename", __ref, _filename, _trackindex);}
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("fileName", _filename);
Debug.locals.put("trackIndex", _trackindex);
 BA.debugLineNum = 776;BA.debugLine="Private Sub FindTrackIdByFileName(fileName As Stri";
Debug.ShouldStop(128);
 BA.debugLineNum = 777;BA.debugLine="For Each key As String In trackIndex.Keys";
Debug.ShouldStop(256);
{
final RemoteObject group1 = _trackindex.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 778;BA.debugLine="If ResolveTrackCacheFileName(key, trackIndex) =";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackcachefilename" /*RemoteObject*/ ,(Object)(_key),(Object)(_trackindex)),_filename)) { 
if (true) return _key;};
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 780;BA.debugLine="Return \"\"";
Debug.ShouldStop(2048);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 781;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("FinishCacheAudit (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,725);
if (RapidSub.canDelegate("finishcacheaudit")) { return __ref.runUserSub(false, "mediacache","finishcacheaudit", __ref);}
 BA.debugLineNum = 725;BA.debugLine="Private Sub FinishCacheAudit";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 726;BA.debugLine="If cacheAuditAdIndexChanged Then SaveAdIndex";
Debug.ShouldStop(2097152);
if (__ref.getField(true,"_cacheauditadindexchanged" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );};
 BA.debugLineNum = 727;BA.debugLine="If cacheAuditTrackIndexChanged Then SaveTrackInde";
Debug.ShouldStop(4194304);
if (__ref.getField(true,"_cacheaudittrackindexchanged" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );};
 BA.debugLineNum = 728;BA.debugLine="cacheAuditInProgress = False";
Debug.ShouldStop(8388608);
__ref.setField ("_cacheauditinprogress" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 729;BA.debugLine="cacheAuditCurrentType = \"\"";
Debug.ShouldStop(16777216);
__ref.setField ("_cacheauditcurrenttype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 730;BA.debugLine="Trace(\"Аудит кэша завершен. added=\" & cacheAuditA";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Аудит кэша завершен. added="),__ref.getField(true,"_cacheauditaddedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(", removed="),__ref.getField(true,"_cacheauditremovedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(", tempDeleted="),__ref.getField(true,"_cacheaudittempdeletedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(", ads="),__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(", tracks="),__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 731;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("GetAdsDir (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("getadsdir")) { return __ref.runUserSub(false, "mediacache","getadsdir", __ref);}
 BA.debugLineNum = 156;BA.debugLine="Public Sub GetAdsDir As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
Debug.ShouldStop(268435456);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mediadirname" /*RemoteObject*/ )))),(Object)(__ref.getField(true,"_adsdirname" /*RemoteObject*/ )));
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("GetAuditDirByType (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,733);
if (RapidSub.canDelegate("getauditdirbytype")) { return __ref.runUserSub(false, "mediacache","getauditdirbytype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 733;BA.debugLine="Private Sub GetAuditDirByType(itemType As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 734;BA.debugLine="If itemType = \"ads\" Then Return GetAdsDir";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ads"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ );};
 BA.debugLineNum = 735;BA.debugLine="Return GetTracksDir";
Debug.ShouldStop(1073741824);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ );
 BA.debugLineNum = 736;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("GetAuditIndexByType (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,738);
if (RapidSub.canDelegate("getauditindexbytype")) { return __ref.runUserSub(false, "mediacache","getauditindexbytype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 738;BA.debugLine="Private Sub GetAuditIndexByType(itemType As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 739;BA.debugLine="If itemType = \"ads\" Then Return cachedAdIndex";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ads"))) { 
if (true) return __ref.getField(false,"_cachedadindex" /*RemoteObject*/ );};
 BA.debugLineNum = 740;BA.debugLine="Return cachedTrackIndex";
Debug.ShouldStop(8);
if (true) return __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 741;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbytesfromstring(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetBytesFromString (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,488);
if (RapidSub.canDelegate("getbytesfromstring")) { return __ref.runUserSub(false, "mediacache","getbytesfromstring", __ref, _value);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("value", _value);
 BA.debugLineNum = 488;BA.debugLine="Private Sub GetBytesFromString(value As String) As";
Debug.ShouldStop(128);
 BA.debugLineNum = 489;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(256);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 490;BA.debugLine="jo.InitializeNewInstance(\"java.lang.String\", Arra";
Debug.ShouldStop(512);
_jo.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.lang.String")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_value)})));
 BA.debugLineNum = 491;BA.debugLine="Return jo.RunMethod(\"getBytes\", Array As Object(\"";
Debug.ShouldStop(1024);
if (true) return (_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBytes")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("UTF-8"))}))));
 BA.debugLineNum = 492;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("GetCachedAdIndex (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,356);
if (RapidSub.canDelegate("getcachedadindex")) { return __ref.runUserSub(false, "mediacache","getcachedadindex", __ref);}
 BA.debugLineNum = 356;BA.debugLine="Private Sub GetCachedAdIndex As Map";
Debug.ShouldStop(8);
 BA.debugLineNum = 357;BA.debugLine="If cachedAdIndex.IsInitialized = False Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 358;BA.debugLine="cachedAdIndex.Initialize";
Debug.ShouldStop(32);
__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 360;BA.debugLine="Return cachedAdIndex";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_cachedadindex" /*RemoteObject*/ );
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("GetCachedTrackIndex (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,363);
if (RapidSub.canDelegate("getcachedtrackindex")) { return __ref.runUserSub(false, "mediacache","getcachedtrackindex", __ref);}
 BA.debugLineNum = 363;BA.debugLine="Private Sub GetCachedTrackIndex As Map";
Debug.ShouldStop(1024);
 BA.debugLineNum = 364;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 365;BA.debugLine="cachedTrackIndex.Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 367;BA.debugLine="Return cachedTrackIndex";
Debug.ShouldStop(16384);
if (true) return __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 368;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("GetDirByItemType (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,593);
if (RapidSub.canDelegate("getdirbyitemtype")) { return __ref.runUserSub(false, "mediacache","getdirbyitemtype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 593;BA.debugLine="Private Sub GetDirByItemType(itemType As String) A";
Debug.ShouldStop(65536);
 BA.debugLineNum = 594;BA.debugLine="If itemType = \"ad\" Then Return GetAdsDir";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ );};
 BA.debugLineNum = 595;BA.debugLine="Return GetTracksDir";
Debug.ShouldStop(262144);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ );
 BA.debugLineNum = 596;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("GetIndexByItemType (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,588);
if (RapidSub.canDelegate("getindexbyitemtype")) { return __ref.runUserSub(false, "mediacache","getindexbyitemtype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 588;BA.debugLine="Private Sub GetIndexByItemType(itemType As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 589;BA.debugLine="If itemType = \"ad\" Then Return cachedAdIndex";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return __ref.getField(false,"_cachedadindex" /*RemoteObject*/ );};
 BA.debugLineNum = 590;BA.debugLine="Return cachedTrackIndex";
Debug.ShouldStop(8192);
if (true) return __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 591;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("GetTracksDir (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("gettracksdir")) { return __ref.runUserSub(false, "mediacache","gettracksdir", __ref);}
 BA.debugLineNum = 160;BA.debugLine="Public Sub GetTracksDir As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
Debug.ShouldStop(1);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mediadirname" /*RemoteObject*/ )))),(Object)(__ref.getField(true,"_tracksdirname" /*RemoteObject*/ )));
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("HasValidatedLocalMedia (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("hasvalidatedlocalmedia")) { return __ref.runUserSub(false, "mediacache","hasvalidatedlocalmedia", __ref, _item);}
RemoteObject _itemid = RemoteObject.createImmutable("");
RemoteObject _itemtype = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 141;BA.debugLine="Public Sub HasValidatedLocalMedia(item As Map) As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="If item.IsInitialized = False Then Return False";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 143;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(16384);
_itemid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemId", _itemid);Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 144;BA.debugLine="If itemId = \"\" Then Return False";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 145;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(65536);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 146;BA.debugLine="If itemType = \"ad\" Then Return ValidateIndexedFil";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ad")),(Object)(_itemid));};
 BA.debugLineNum = 147;BA.debugLine="If itemType = \"track\" Then Return ValidateIndexed";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("track")),(Object)(_itemid));};
 BA.debugLineNum = 148;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _storagedirvalue,RemoteObject _storagevalue,RemoteObject _targetmodulevalue,RemoteObject _tracesubnamevalue,RemoteObject _deviceidvalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "mediacache","initialize", __ref, _ba, _storagedirvalue, _storagevalue, _targetmodulevalue, _tracesubnamevalue, _deviceidvalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("storageDirValue", _storagedirvalue);
Debug.locals.put("storageValue", _storagevalue);
Debug.locals.put("targetModuleValue", _targetmodulevalue);
Debug.locals.put("traceSubNameValue", _tracesubnamevalue);
Debug.locals.put("deviceIdValue", _deviceidvalue);
 BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="storageDir = storageDirValue";
Debug.ShouldStop(4);
__ref.setField ("_storagedir" /*RemoteObject*/ ,_storagedirvalue);
 BA.debugLineNum = 36;BA.debugLine="storage = storageValue";
Debug.ShouldStop(8);
__ref.setField ("_storage" /*RemoteObject*/ ,_storagevalue);
 BA.debugLineNum = 37;BA.debugLine="targetModule = targetModuleValue";
Debug.ShouldStop(16);
__ref.setField ("_targetmodule" /*RemoteObject*/ ,_targetmodulevalue);
 BA.debugLineNum = 38;BA.debugLine="traceSubName = traceSubNameValue";
Debug.ShouldStop(32);
__ref.setField ("_tracesubname" /*RemoteObject*/ ,_tracesubnamevalue);
 BA.debugLineNum = 39;BA.debugLine="deviceKeySeed = deviceIdValue";
Debug.ShouldStop(64);
__ref.setField ("_devicekeyseed" /*RemoteObject*/ ,_deviceidvalue);
 BA.debugLineNum = 40;BA.debugLine="playbackTempTrackIds.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_playbacktemptrackids" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="EnsureDirectory(GetAdsDir)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )));
 BA.debugLineNum = 42;BA.debugLine="EnsureDirectory(GetTracksDir)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="LoadIndexesFromStorage";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.mediacache.class, "_loadindexesfromstorage" /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("IsAdCached (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("isadcached")) { return __ref.runUserSub(false, "mediacache","isadcached", __ref, _adid);}
Debug.locals.put("adId", _adid);
 BA.debugLineNum = 151;BA.debugLine="Public Sub IsAdCached(adId As String) As Boolean";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="If adId = \"\" Then Return False";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 153;BA.debugLine="Return ValidateIndexedFile(\"ad\", adId)";
Debug.ShouldStop(16777216);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ad")),(Object)(_adid));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("IsCacheAuditInProgress (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("iscacheauditinprogress")) { return __ref.runUserSub(false, "mediacache","iscacheauditinprogress", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Public Sub IsCacheAuditInProgress As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Return cacheAuditInProgress";
Debug.ShouldStop(16384);
if (true) return __ref.getField(true,"_cacheauditinprogress" /*RemoteObject*/ );
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("IsCachedFileUsable (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,424);
if (RapidSub.canDelegate("iscachedfileusable")) { return __ref.runUserSub(false, "mediacache","iscachedfileusable", __ref, _dir, _filename);}
Debug.locals.put("dir", _dir);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 424;BA.debugLine="Private Sub IsCachedFileUsable(dir As String, file";
Debug.ShouldStop(128);
 BA.debugLineNum = 425;BA.debugLine="If fileName = \"\" Then Return False";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 426;BA.debugLine="If File.Exists(dir, fileName) = False Then Return";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",mediacache.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_dir),(Object)(_filename)),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 427;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 428;BA.debugLine="If File.Size(dir, fileName) > 0 Then Return True";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",mediacache.__c.getField(false,"File").runMethod(true,"Size",(Object)(_dir),(Object)(_filename)),BA.numberCast(long.class, 0))) { 
Debug.CheckDeviceExceptions();if (true) return mediacache.__c.getField(true,"True");};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 430;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(8192);
mediacache.__c.runVoidMethod ("LogImpl","425624582",mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 432;BA.debugLine="DeleteFileIfExists(dir, fileName)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 433;BA.debugLine="Return False";
Debug.ShouldStop(65536);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 434;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ismedianetworkfailure(RemoteObject __ref,RemoteObject _errormessage) throws Exception{
try {
		Debug.PushSubsStack("IsMediaNetworkFailure (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,620);
if (RapidSub.canDelegate("ismedianetworkfailure")) { return __ref.runUserSub(false, "mediacache","ismedianetworkfailure", __ref, _errormessage);}
RemoteObject _text = RemoteObject.createImmutable("");
Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 620;BA.debugLine="Private Sub IsMediaNetworkFailure(errorMessage As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 621;BA.debugLine="Dim text As String = errorMessage.ToLowerCase";
Debug.ShouldStop(4096);
_text = _errormessage.runMethod(true,"toLowerCase");Debug.locals.put("text", _text);Debug.locals.put("text", _text);
 BA.debugLineNum = 622;BA.debugLine="If text.Contains(\"timed out\") Then Return True";
Debug.ShouldStop(8192);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("timed out"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 623;BA.debugLine="If text.Contains(\"unknownhost\") Then Return True";
Debug.ShouldStop(16384);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("unknownhost"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 624;BA.debugLine="If text.Contains(\"refused\") Then Return True";
Debug.ShouldStop(32768);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("refused"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 625;BA.debugLine="If text.Contains(\"sslhandshakeexception\") Then Re";
Debug.ShouldStop(65536);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("sslhandshakeexception"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 626;BA.debugLine="If text.Contains(\"pkix path building failed\") The";
Debug.ShouldStop(131072);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("pkix path building failed"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 627;BA.debugLine="If text.Contains(\"unable to find valid certificat";
Debug.ShouldStop(262144);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("unable to find valid certification path"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 628;BA.debugLine="If text.Contains(\"connectexception\") Then Return";
Debug.ShouldStop(524288);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("connectexception"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 629;BA.debugLine="If text.Contains(\"socketexception\") Then Return T";
Debug.ShouldStop(1048576);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("socketexception"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 630;BA.debugLine="If text.Contains(\"sockettimeoutexception\") Then R";
Debug.ShouldStop(2097152);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("sockettimeoutexception"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 631;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 632;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("IsTrackCached (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("istrackcached")) { return __ref.runUserSub(false, "mediacache","istrackcached", __ref, _trackid);}
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 164;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="If trackId = \"\" Then Return False";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 166;BA.debugLine="Return ValidateIndexedFile(\"track\", trackId)";
Debug.ShouldStop(32);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("track")),(Object)(_trackid));
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("LoadIndexesFromStorage (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,386);
if (RapidSub.canDelegate("loadindexesfromstorage")) { return __ref.runUserSub(false, "mediacache","loadindexesfromstorage", __ref);}
 BA.debugLineNum = 386;BA.debugLine="Private Sub LoadIndexesFromStorage";
Debug.ShouldStop(2);
 BA.debugLineNum = 387;BA.debugLine="cachedAdIndex = storage.GetDefault(\"cached_ad_ind";
Debug.ShouldStop(4);
__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).setObject (__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_index")),(Object)(mediacache.__c.getField(false,"Null"))));
 BA.debugLineNum = 388;BA.debugLine="If cachedAdIndex.IsInitialized = False Then cache";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 389;BA.debugLine="cachedTrackIndex = storage.GetDefault(\"cached_tra";
Debug.ShouldStop(16);
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).setObject (__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_track_index")),(Object)(mediacache.__c.getField(false,"Null"))));
 BA.debugLineNum = 390;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 391;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("MarkAuditIndexChanged (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,743);
if (RapidSub.canDelegate("markauditindexchanged")) { return __ref.runUserSub(false, "mediacache","markauditindexchanged", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 743;BA.debugLine="Private Sub MarkAuditIndexChanged(itemType As Stri";
Debug.ShouldStop(64);
 BA.debugLineNum = 744;BA.debugLine="If itemType = \"ads\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ads"))) { 
 BA.debugLineNum = 745;BA.debugLine="cacheAuditAdIndexChanged = True";
Debug.ShouldStop(256);
__ref.setField ("_cacheauditadindexchanged" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 747;BA.debugLine="cacheAuditTrackIndexChanged = True";
Debug.ShouldStop(1024);
__ref.setField ("_cacheaudittrackindexchanged" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 };
 BA.debugLineNum = 749;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("PrepareNextCacheAuditType (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,644);
if (RapidSub.canDelegate("preparenextcacheaudittype")) { return __ref.runUserSub(false, "mediacache","preparenextcacheaudittype", __ref);}
RemoteObject _auditdir = RemoteObject.createImmutable("");
RemoteObject _listedfiles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filename = RemoteObject.createImmutable("");
 BA.debugLineNum = 644;BA.debugLine="Private Sub PrepareNextCacheAuditType As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 645;BA.debugLine="If cacheAuditPendingTypes.IsInitialized = False O";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 646;BA.debugLine="cacheAuditCurrentType = cacheAuditPendingTypes.Ge";
Debug.ShouldStop(32);
__ref.setField ("_cacheauditcurrenttype" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 647;BA.debugLine="cacheAuditPendingTypes.RemoveAt(0)";
Debug.ShouldStop(64);
__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 648;BA.debugLine="cacheAuditCurrentPosition = 0";
Debug.ShouldStop(128);
__ref.setField ("_cacheauditcurrentposition" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 649;BA.debugLine="cacheAuditSeenIds.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 650;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 651;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
Debug.ShouldStop(1024);
_auditdir = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditdirbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditDir", _auditdir);Debug.locals.put("auditDir", _auditdir);
 BA.debugLineNum = 652;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 653;BA.debugLine="If File.Exists(auditDir, \"\") Then";
Debug.ShouldStop(4096);
if (mediacache.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_auditdir),(Object)(RemoteObject.createImmutable(""))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 654;BA.debugLine="Dim listedFiles As List = File.ListFiles(auditD";
Debug.ShouldStop(8192);
_listedfiles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listedfiles = mediacache.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_auditdir));Debug.locals.put("listedFiles", _listedfiles);Debug.locals.put("listedFiles", _listedfiles);
 BA.debugLineNum = 655;BA.debugLine="If listedFiles.IsInitialized Then";
Debug.ShouldStop(16384);
if (_listedfiles.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 656;BA.debugLine="For Each fileName As String In listedFiles";
Debug.ShouldStop(32768);
{
final RemoteObject group12 = _listedfiles;
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_filename = BA.ObjectToString(group12.runMethod(false,"Get",index12));Debug.locals.put("fileName", _filename);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 657;BA.debugLine="cacheAuditCurrentFileNames.Add(fileName)";
Debug.ShouldStop(65536);
__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_filename)));
 }
}Debug.locals.put("fileName", _filename);
;
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 662;BA.debugLine="Trace(\"Не удалось получить список файлов для ауд";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось получить список файлов для аудита кэша. type="),__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ ),RemoteObject.createImmutable(", message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 664;BA.debugLine="Trace(\"Аудит кэша: подготовлен каталог. type=\" &";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Аудит кэша: подготовлен каталог. type="),__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ ),RemoteObject.createImmutable(", files="),__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 665;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) return mediacache.__c.getField(true,"True");
 BA.debugLineNum = 666;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("ProcessCurrentCacheAuditBatch (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,668);
if (RapidSub.canDelegate("processcurrentcacheauditbatch")) { return __ref.runUserSub(false, "mediacache","processcurrentcacheauditbatch", __ref);}
RemoteObject _auditdir = RemoteObject.createImmutable("");
RemoteObject _auditindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _trackid = RemoteObject.createImmutable("");
 BA.debugLineNum = 668;BA.debugLine="Private Sub ProcessCurrentCacheAuditBatch";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 669;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
Debug.ShouldStop(268435456);
_auditdir = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditdirbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditDir", _auditdir);Debug.locals.put("auditDir", _auditdir);
 BA.debugLineNum = 670;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
Debug.ShouldStop(536870912);
_auditindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_auditindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditindexbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditIndex", _auditindex);Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 671;BA.debugLine="For i = 1 To CACHE_AUDIT_BATCH_SIZE";
Debug.ShouldStop(1073741824);
{
final int step3 = 1;
final int limit3 = __ref.getField(true,"_cache_audit_batch_size" /*RemoteObject*/ ).<Integer>get().intValue();
_i = 1 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 672;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurren";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_cacheauditcurrentposition" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
if (true) break;};
 BA.debugLineNum = 673;BA.debugLine="Dim fileName As String = cacheAuditCurrentFileNa";
Debug.ShouldStop(1);
_filename = BA.ObjectToString(__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_cacheauditcurrentposition" /*RemoteObject*/ ))));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 674;BA.debugLine="cacheAuditCurrentPosition = cacheAuditCurrentPos";
Debug.ShouldStop(2);
__ref.setField ("_cacheauditcurrentposition" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cacheauditcurrentposition" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 675;BA.debugLine="If fileName = \"\" Then Continue";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 676;BA.debugLine="If fileName.EndsWith(\".tmp\") Then";
Debug.ShouldStop(8);
if (_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".tmp"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 677;BA.debugLine="DeleteFileIfExists(auditDir, fileName)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename));
 BA.debugLineNum = 678;BA.debugLine="cacheAuditTempDeletedCount = cacheAuditTempDele";
Debug.ShouldStop(32);
__ref.setField ("_cacheaudittempdeletedcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cacheaudittempdeletedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 679;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.mediacache.class, "_markauditindexchanged" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));
 BA.debugLineNum = 680;BA.debugLine="Continue";
Debug.ShouldStop(128);
if (true) continue;
 };
 BA.debugLineNum = 682;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename)),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 683;BA.debugLine="If cacheAuditCurrentType = \"tracks\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ ),BA.ObjectToString("tracks"))) { 
 BA.debugLineNum = 684;BA.debugLine="Dim trackId As String = FindTrackIdByFileName(f";
Debug.ShouldStop(2048);
_trackid = __ref.runClassMethod (b4j.example.mediacache.class, "_findtrackidbyfilename" /*RemoteObject*/ ,(Object)(_filename),(Object)(_auditindex));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 685;BA.debugLine="If trackId = \"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
 BA.debugLineNum = 686;BA.debugLine="DeleteFileIfExists(auditDir, fileName)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename));
 BA.debugLineNum = 687;BA.debugLine="cacheAuditRemovedCount = cacheAuditRemovedCoun";
Debug.ShouldStop(16384);
__ref.setField ("_cacheauditremovedcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cacheauditremovedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 688;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_markauditindexchanged" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));
 BA.debugLineNum = 689;BA.debugLine="Continue";
Debug.ShouldStop(65536);
if (true) continue;
 };
 BA.debugLineNum = 691;BA.debugLine="cacheAuditSeenIds.Put(trackId, True)";
Debug.ShouldStop(262144);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_trackid)),(Object)((mediacache.__c.getField(true,"True"))));
 }else {
 BA.debugLineNum = 693;BA.debugLine="cacheAuditSeenIds.Put(fileName, True)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_filename)),(Object)((mediacache.__c.getField(true,"True"))));
 BA.debugLineNum = 694;BA.debugLine="If auditIndex.ContainsKey(fileName) = False The";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_auditindex.runMethod(true,"ContainsKey",(Object)((_filename))),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 695;BA.debugLine="AddIndexedFileFromAudit(cacheAuditCurrentType,";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_addindexedfilefromaudit" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )),(Object)(_filename),(Object)(_auditindex));
 BA.debugLineNum = 696;BA.debugLine="cacheAuditAddedCount = cacheAuditAddedCount +";
Debug.ShouldStop(8388608);
__ref.setField ("_cacheauditaddedcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cacheauditaddedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 700;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("ReplaceCacheFile (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,445);
if (RapidSub.canDelegate("replacecachefile")) { return __ref.runUserSub(false, "mediacache","replacecachefile", __ref, _dir, _tempfilename, _finalfilename);}
RemoteObject _tempfile = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _finalfile = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _renamed = RemoteObject.createImmutable(false);
Debug.locals.put("dir", _dir);
Debug.locals.put("tempFileName", _tempfilename);
Debug.locals.put("finalFileName", _finalfilename);
 BA.debugLineNum = 445;BA.debugLine="Private Sub ReplaceCacheFile(dir As String, tempFi";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 446;BA.debugLine="If IsCachedFileUsable(dir, tempFileName) = False";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_dir),(Object)(_tempfilename)),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 447;BA.debugLine="If IsCachedFileUsable(dir, finalFileName) Then";
Debug.ShouldStop(1073741824);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_dir),(Object)(_finalfilename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 448;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_tempfilename));
 BA.debugLineNum = 449;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) return mediacache.__c.getField(true,"True");
 };
 BA.debugLineNum = 451;BA.debugLine="DeleteFileIfExists(dir, finalFileName)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_finalfilename));
 BA.debugLineNum = 452;BA.debugLine="Dim tempFile As JavaObject";
Debug.ShouldStop(8);
_tempfile = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("tempFile", _tempfile);
 BA.debugLineNum = 453;BA.debugLine="tempFile.InitializeNewInstance(\"java.io.File\", Ar";
Debug.ShouldStop(16);
_tempfile.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_tempfilename)))})));
 BA.debugLineNum = 454;BA.debugLine="Dim finalFile As JavaObject";
Debug.ShouldStop(32);
_finalfile = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("finalFile", _finalfile);
 BA.debugLineNum = 455;BA.debugLine="finalFile.InitializeNewInstance(\"java.io.File\", A";
Debug.ShouldStop(64);
_finalfile.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_finalfilename)))})));
 BA.debugLineNum = 456;BA.debugLine="Dim renamed As Boolean = tempFile.RunMethod(\"rena";
Debug.ShouldStop(128);
_renamed = BA.ObjectToBoolean(_tempfile.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("renameTo")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_finalfile.getObject())}))));Debug.locals.put("renamed", _renamed);Debug.locals.put("renamed", _renamed);
 BA.debugLineNum = 457;BA.debugLine="If renamed = False And IsCachedFileUsable(dir, fi";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_renamed,mediacache.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_dir),(Object)(_finalfilename)))) { 
 BA.debugLineNum = 458;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_tempfilename));
 BA.debugLineNum = 459;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return mediacache.__c.getField(true,"True");
 };
 BA.debugLineNum = 461;BA.debugLine="Return renamed";
Debug.ShouldStop(4096);
if (true) return _renamed;
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveindexedauditfilename(RemoteObject __ref,RemoteObject _audittype,RemoteObject _itemid,RemoteObject _auditindex) throws Exception{
try {
		Debug.PushSubsStack("ResolveIndexedAuditFileName (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,771);
if (RapidSub.canDelegate("resolveindexedauditfilename")) { return __ref.runUserSub(false, "mediacache","resolveindexedauditfilename", __ref, _audittype, _itemid, _auditindex);}
Debug.locals.put("auditType", _audittype);
Debug.locals.put("itemId", _itemid);
Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 771;BA.debugLine="Private Sub ResolveIndexedAuditFileName(auditType";
Debug.ShouldStop(4);
 BA.debugLineNum = 772;BA.debugLine="If auditType = \"ads\" Then Return itemId";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_audittype,BA.ObjectToString("ads"))) { 
if (true) return _itemid;};
 BA.debugLineNum = 773;BA.debugLine="Return ResolveTrackCacheFileName(itemId, auditInd";
Debug.ShouldStop(16);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackcachefilename" /*RemoteObject*/ ,(Object)(_itemid),(Object)(_auditindex));
 BA.debugLineNum = 774;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveindexedfilename(RemoteObject __ref,RemoteObject _itemtype,RemoteObject _itemid,RemoteObject _itemindex) throws Exception{
try {
		Debug.PushSubsStack("ResolveIndexedFileName (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,606);
if (RapidSub.canDelegate("resolveindexedfilename")) { return __ref.runUserSub(false, "mediacache","resolveindexedfilename", __ref, _itemtype, _itemid, _itemindex);}
Debug.locals.put("itemType", _itemtype);
Debug.locals.put("itemId", _itemid);
Debug.locals.put("itemIndex", _itemindex);
 BA.debugLineNum = 606;BA.debugLine="Private Sub ResolveIndexedFileName(itemType As Str";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 607;BA.debugLine="If itemType = \"ad\" Then Return itemId";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return _itemid;};
 BA.debugLineNum = 608;BA.debugLine="Return ResolveTrackCacheFileName(itemId, itemInde";
Debug.ShouldStop(-2147483648);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackcachefilename" /*RemoteObject*/ ,(Object)(_itemid),(Object)(_itemindex));
 BA.debugLineNum = 609;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvelocalmediauri(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ResolveLocalMediaUri (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("resolvelocalmediauri")) { return __ref.runUserSub(false, "mediacache","resolvelocalmediauri", __ref, _item);}
RemoteObject _itemtype = RemoteObject.createImmutable("");
RemoteObject _itemid = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 112;BA.debugLine="Public Sub ResolveLocalMediaUri(item As Map) As St";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 114;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(131072);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 115;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(262144);
_itemid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemId", _itemid);Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 116;BA.debugLine="If itemId = \"\" Then Return \"\"";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 117;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_item)),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 118;BA.debugLine="If itemType = \"ad\" Then Return File.GetUri(GetAds";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_itemid));};
 BA.debugLineNum = 119;BA.debugLine="If itemType = \"track\" Then Return File.GetUri(Get";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackcachefilename" /*RemoteObject*/ ,(Object)(_itemid),(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ )))));};
 BA.debugLineNum = 120;BA.debugLine="Return \"\"";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToString("");
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
public static RemoteObject  _resolvemediasource(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ResolveMediaSource (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,529);
if (RapidSub.canDelegate("resolvemediasource")) { return __ref.runUserSub(false, "mediacache","resolvemediasource", __ref, _item);}
RemoteObject _itemtype = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 529;BA.debugLine="Public Sub ResolveMediaSource(item As Map) As Stri";
Debug.ShouldStop(65536);
 BA.debugLineNum = 530;BA.debugLine="If item.IsInitialized = False Then Return \"none\"";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("none");};
 BA.debugLineNum = 531;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(262144);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 532;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 533;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
Debug.ShouldStop(1048576);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_item)).<Boolean>get().booleanValue()) { 
if (true) return BA.ObjectToString("cache");};
 BA.debugLineNum = 534;BA.debugLine="Return \"missing\"";
Debug.ShouldStop(2097152);
if (true) return BA.ObjectToString("missing");
 };
 BA.debugLineNum = 536;BA.debugLine="If itemType = \"track\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
 BA.debugLineNum = 537;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
Debug.ShouldStop(16777216);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_item)).<Boolean>get().booleanValue()) { 
if (true) return BA.ObjectToString("cache");};
 BA.debugLineNum = 538;BA.debugLine="Return \"missing\"";
Debug.ShouldStop(33554432);
if (true) return BA.ObjectToString("missing");
 };
 BA.debugLineNum = 540;BA.debugLine="Return \"none\"";
Debug.ShouldStop(134217728);
if (true) return BA.ObjectToString("none");
 BA.debugLineNum = 541;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveplaybackmediauri(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ResolvePlaybackMediaUri (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("resolveplaybackmediauri")) { return __ref.runUserSub(false, "mediacache","resolveplaybackmediauri", __ref, _audiokey, _item);}
RemoteObject _itemtype = RemoteObject.createImmutable("");
RemoteObject _trackid = RemoteObject.createImmutable("");
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("item", _item);
 BA.debugLineNum = 123;BA.debugLine="Public Sub ResolvePlaybackMediaUri(audioKey As Str";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 125;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(268435456);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 126;BA.debugLine="If itemType = \"ad\" Then Return ResolveLocalMediaU";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_resolvelocalmediauri" /*RemoteObject*/ ,(Object)(_item));};
 BA.debugLineNum = 127;BA.debugLine="If itemType <> \"track\" Then Return \"\"";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",_itemtype,BA.ObjectToString("track"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 128;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(-2147483648);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 129;BA.debugLine="If trackId = \"\" Then Return \"\"";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 130;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_item)),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 131;BA.debugLine="If EnsureTrackPlaybackTemp(audioKey, trackId) = F";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_ensuretrackplaybacktemp" /*RemoteObject*/ ,(Object)(_audiokey),(Object)(_trackid)),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 132;BA.debugLine="Return File.GetUri(File.DirTemp, BuildPlaybackTem";
Debug.ShouldStop(8);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildplaybacktemptrackfilename" /*RemoteObject*/ ,(Object)(_audiokey))));
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
public static RemoteObject  _resolvetrackcachefilename(RemoteObject __ref,RemoteObject _trackid,RemoteObject _trackindex) throws Exception{
try {
		Debug.PushSubsStack("ResolveTrackCacheFileName (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,611);
if (RapidSub.canDelegate("resolvetrackcachefilename")) { return __ref.runUserSub(false, "mediacache","resolvetrackcachefilename", __ref, _trackid, _trackindex);}
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("trackId", _trackid);
Debug.locals.put("trackIndex", _trackindex);
 BA.debugLineNum = 611;BA.debugLine="Private Sub ResolveTrackCacheFileName(trackId As S";
Debug.ShouldStop(4);
 BA.debugLineNum = 612;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
Debug.ShouldStop(8);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackindex.runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 613;BA.debugLine="If entry.IsInitialized Then";
Debug.ShouldStop(16);
if (_entry.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 614;BA.debugLine="Dim fileName As String = entry.GetDefault(\"file_";
Debug.ShouldStop(32);
_filename = BA.ObjectToString(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 615;BA.debugLine="If fileName <> \"\" Then Return fileName";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",_filename,BA.ObjectToString(""))) { 
if (true) return _filename;};
 };
 BA.debugLineNum = 617;BA.debugLine="Return BuildTrackCacheFileName(trackId)";
Debug.ShouldStop(256);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcachefilename" /*RemoteObject*/ ,(Object)(_trackid));
 BA.debugLineNum = 618;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _restoreindexedfilebyid(RemoteObject __ref,RemoteObject _itemid,RemoteObject _itemindex) throws Exception{
try {
		Debug.PushSubsStack("RestoreIndexedFileById (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,560);
if (RapidSub.canDelegate("restoreindexedfilebyid")) { return __ref.runUserSub(false, "mediacache","restoreindexedfilebyid", __ref, _itemid, _itemindex);}
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("itemId", _itemid);
Debug.locals.put("itemIndex", _itemindex);
 BA.debugLineNum = 560;BA.debugLine="Private Sub RestoreIndexedFileById(itemId As Strin";
Debug.ShouldStop(32768);
 BA.debugLineNum = 561;BA.debugLine="Dim entry As Map = itemIndex.GetDefault(itemId, N";
Debug.ShouldStop(65536);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemindex.runMethod(false,"GetDefault",(Object)((_itemid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 562;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Initialize");};
 BA.debugLineNum = 563;BA.debugLine="entry.Put(\"id\", itemId)";
Debug.ShouldStop(262144);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_itemid)));
 BA.debugLineNum = 564;BA.debugLine="entry.Put(\"file_name\", BuildTrackCacheFileName(it";
Debug.ShouldStop(524288);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcachefilename" /*RemoteObject*/ ,(Object)(_itemid)))));
 BA.debugLineNum = 565;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("saved_at")))),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));};
 BA.debugLineNum = 566;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(2097152);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 567;BA.debugLine="itemIndex.Put(itemId, entry)";
Debug.ShouldStop(4194304);
_itemindex.runVoidMethod ("Put",(Object)((_itemid)),(Object)((_entry.getObject())));
 BA.debugLineNum = 568;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("RunCacheAuditStep (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("runcacheauditstep")) { return __ref.runUserSub(false, "mediacache","runcacheauditstep", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Public Sub RunCacheAuditStep As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="If cacheAuditInProgress = False Then Return False";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cacheauditinprogress" /*RemoteObject*/ ),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 70;BA.debugLine="If cacheAuditCurrentType = \"\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 71;BA.debugLine="If PrepareNextCacheAuditType = False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_preparenextcacheaudittype" /*RemoteObject*/ ),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 72;BA.debugLine="FinishCacheAudit";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.mediacache.class, "_finishcacheaudit" /*RemoteObject*/ );
 BA.debugLineNum = 73;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) return mediacache.__c.getField(true,"False");
 };
 };
 BA.debugLineNum = 76;BA.debugLine="ProcessCurrentCacheAuditBatch";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.mediacache.class, "_processcurrentcacheauditbatch" /*RemoteObject*/ );
 BA.debugLineNum = 77;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurrent";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_cacheauditcurrentposition" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 78;BA.debugLine="FinalizeCurrentCacheAuditType";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.mediacache.class, "_finalizecurrentcacheaudittype" /*RemoteObject*/ );
 BA.debugLineNum = 79;BA.debugLine="cacheAuditCurrentType = \"\"";
Debug.ShouldStop(16384);
__ref.setField ("_cacheauditcurrenttype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 80;BA.debugLine="If cacheAuditPendingTypes.Size = 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 81;BA.debugLine="FinishCacheAudit";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.mediacache.class, "_finishcacheaudit" /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) return mediacache.__c.getField(true,"False");
 };
 };
 BA.debugLineNum = 85;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) return mediacache.__c.getField(true,"True");
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("SaveAdIndex (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,393);
if (RapidSub.canDelegate("saveadindex")) { return __ref.runUserSub(false, "mediacache","saveadindex", __ref);}
 BA.debugLineNum = 393;BA.debugLine="Private Sub SaveAdIndex";
Debug.ShouldStop(256);
 BA.debugLineNum = 394;BA.debugLine="storage.Put(\"cached_ad_index\", cachedAdIndex)";
Debug.ShouldStop(512);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_index")),(Object)((__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 395;BA.debugLine="storage.Put(\"cached_ad_count\", cachedAdIndex.Size";
Debug.ShouldStop(1024);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_count")),(Object)((__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("SaveIndexByItemType (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,598);
if (RapidSub.canDelegate("saveindexbyitemtype")) { return __ref.runUserSub(false, "mediacache","saveindexbyitemtype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 598;BA.debugLine="Private Sub SaveIndexByItemType(itemType As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 599;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 600;BA.debugLine="SaveAdIndex";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 602;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 };
 BA.debugLineNum = 604;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("SaveTrackIndex (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,398);
if (RapidSub.canDelegate("savetrackindex")) { return __ref.runUserSub(false, "mediacache","savetrackindex", __ref);}
 BA.debugLineNum = 398;BA.debugLine="Private Sub SaveTrackIndex";
Debug.ShouldStop(8192);
 BA.debugLineNum = 399;BA.debugLine="storage.Put(\"cached_track_index\", cachedTrackInde";
Debug.ShouldStop(16384);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_track_index")),(Object)((__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 400;BA.debugLine="storage.Put(\"cached_track_count\", cachedTrackInde";
Debug.ShouldStop(32768);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_track_count")),(Object)((__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 401;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("StartCacheAudit (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("startcacheaudit")) { return __ref.runUserSub(false, "mediacache","startcacheaudit", __ref);}
 BA.debugLineNum = 50;BA.debugLine="Public Sub StartCacheAudit";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="If cacheAuditInProgress Then Return";
Debug.ShouldStop(262144);
if (__ref.getField(true,"_cacheauditinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 52;BA.debugLine="cacheAuditPendingTypes.Initialize";
Debug.ShouldStop(524288);
__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 53;BA.debugLine="cacheAuditPendingTypes.Add(\"ads\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("ads"))));
 BA.debugLineNum = 54;BA.debugLine="cacheAuditPendingTypes.Add(\"tracks\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("tracks"))));
 BA.debugLineNum = 55;BA.debugLine="cacheAuditCurrentType = \"\"";
Debug.ShouldStop(4194304);
__ref.setField ("_cacheauditcurrenttype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 56;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 57;BA.debugLine="cacheAuditCurrentPosition = 0";
Debug.ShouldStop(16777216);
__ref.setField ("_cacheauditcurrentposition" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 58;BA.debugLine="cacheAuditSeenIds.Initialize";
Debug.ShouldStop(33554432);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="cacheAuditAdIndexChanged = False";
Debug.ShouldStop(67108864);
__ref.setField ("_cacheauditadindexchanged" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="cacheAuditTrackIndexChanged = False";
Debug.ShouldStop(134217728);
__ref.setField ("_cacheaudittrackindexchanged" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 61;BA.debugLine="cacheAuditAddedCount = 0";
Debug.ShouldStop(268435456);
__ref.setField ("_cacheauditaddedcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 62;BA.debugLine="cacheAuditRemovedCount = 0";
Debug.ShouldStop(536870912);
__ref.setField ("_cacheauditremovedcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 63;BA.debugLine="cacheAuditTempDeletedCount = 0";
Debug.ShouldStop(1073741824);
__ref.setField ("_cacheaudittempdeletedcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 64;BA.debugLine="cacheAuditInProgress = True";
Debug.ShouldStop(-2147483648);
__ref.setField ("_cacheauditinprogress" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 BA.debugLineNum = 65;BA.debugLine="Trace(\"Запущен аудит кэша media.\")";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Запущен аудит кэша media.")));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("TouchCachedItem (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,370);
if (RapidSub.canDelegate("touchcacheditem")) { return __ref.runUserSub(false, "mediacache","touchcacheditem", __ref, _item);}
RemoteObject _itemid = RemoteObject.createImmutable("");
RemoteObject _itemtype = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 370;BA.debugLine="Public Sub TouchCachedItem(item As Map)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 371;BA.debugLine="If item.IsInitialized = False Then Return";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 372;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(524288);
_itemid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemId", _itemid);Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 373;BA.debugLine="If itemId = \"\" Then Return";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 374;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(2097152);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 375;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 376;BA.debugLine="If cachedAdIndex.ContainsKey(itemId) = False The";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_itemid))),mediacache.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 377;BA.debugLine="UpdateAdIndex(item, cachedAdIndex)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_item),(Object)(__ref.getField(false,"_cachedadindex" /*RemoteObject*/ )));
 BA.debugLineNum = 378;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 380;BA.debugLine="If itemType = \"track\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
 BA.debugLineNum = 381;BA.debugLine="If cachedTrackIndex.ContainsKey(itemId) = False";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_itemid))),mediacache.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 382;BA.debugLine="UpdateTrackIndex(item, cachedTrackIndex)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Trace (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,783);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "mediacache","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 783;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 784;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
Debug.ShouldStop(32768);
if (mediacache.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 785;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
Debug.ShouldStop(65536);
mediacache.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ )),(Object)((_message)));
 };
 BA.debugLineNum = 787;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _transformstreamwithxor(RemoteObject __ref,RemoteObject _inputstream,RemoteObject _outputstream,RemoteObject _keybytes) throws Exception{
try {
		Debug.PushSubsStack("TransformStreamWithXor (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,494);
if (RapidSub.canDelegate("transformstreamwithxor")) { return __ref.runUserSub(false, "mediacache","transformstreamwithxor", __ref, _inputstream, _outputstream, _keybytes);}
RemoteObject _buffer = null;
RemoteObject _totalprocessed = RemoteObject.createImmutable(0L);
RemoteObject _count = RemoteObject.createImmutable(0);
Debug.locals.put("inputStream", _inputstream);
Debug.locals.put("outputStream", _outputstream);
Debug.locals.put("keyBytes", _keybytes);
 BA.debugLineNum = 494;BA.debugLine="Private Sub TransformStreamWithXor(inputStream As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 495;BA.debugLine="If keyBytes.Length = 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_keybytes.getField(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 496;BA.debugLine="File.Copy2(inputStream, outputStream)";
Debug.ShouldStop(32768);
mediacache.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_inputstream.getObject())),(Object)((_outputstream.getObject())));
 BA.debugLineNum = 497;BA.debugLine="outputStream.Flush";
Debug.ShouldStop(65536);
_outputstream.runVoidMethod ("Flush");
 BA.debugLineNum = 498;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 500;BA.debugLine="Dim buffer(STREAM_XOR_BUFFER_SIZE) As Byte";
Debug.ShouldStop(524288);
_buffer = RemoteObject.createNewArray ("byte", new int[] {__ref.getField(true,"_stream_xor_buffer_size" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 501;BA.debugLine="Dim totalProcessed As Long = 0";
Debug.ShouldStop(1048576);
_totalprocessed = BA.numberCast(long.class, 0);Debug.locals.put("totalProcessed", _totalprocessed);Debug.locals.put("totalProcessed", _totalprocessed);
 BA.debugLineNum = 502;BA.debugLine="Do While True";
Debug.ShouldStop(2097152);
while (mediacache.__c.getField(true,"True").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 503;BA.debugLine="Dim count As Int = inputStream.ReadBytes(buffer,";
Debug.ShouldStop(4194304);
_count = _inputstream.runMethod(true,"ReadBytes",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")));Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 504;BA.debugLine="If count <= 0 Then Exit";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("k",_count,BA.numberCast(double.class, 0))) { 
if (true) break;};
 BA.debugLineNum = 505;BA.debugLine="ApplyXorToBuffer(buffer, count, keyBytes, totalP";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.mediacache.class, "_applyxortobuffer" /*RemoteObject*/ ,(Object)(_buffer),(Object)(_count),(Object)(_keybytes),(Object)(_totalprocessed));
 BA.debugLineNum = 506;BA.debugLine="outputStream.WriteBytes(buffer, 0, count)";
Debug.ShouldStop(33554432);
_outputstream.runVoidMethod ("WriteBytes",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_count));
 BA.debugLineNum = 507;BA.debugLine="totalProcessed = totalProcessed + count";
Debug.ShouldStop(67108864);
_totalprocessed = RemoteObject.solve(new RemoteObject[] {_totalprocessed,_count}, "+",1, 2);Debug.locals.put("totalProcessed", _totalprocessed);
 }
;
 BA.debugLineNum = 509;BA.debugLine="outputStream.Flush";
Debug.ShouldStop(268435456);
_outputstream.runVoidMethod ("Flush");
 BA.debugLineNum = 510;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tryrestoreexistingcachedmedia(RemoteObject __ref,RemoteObject _itemtype,RemoteObject _itemid,RemoteObject _item,RemoteObject _itemindex) throws Exception{
try {
		Debug.PushSubsStack("TryRestoreExistingCachedMedia (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,570);
if (RapidSub.canDelegate("tryrestoreexistingcachedmedia")) { return __ref.runUserSub(false, "mediacache","tryrestoreexistingcachedmedia", __ref, _itemtype, _itemid, _item, _itemindex);}
Debug.locals.put("itemType", _itemtype);
Debug.locals.put("itemId", _itemid);
Debug.locals.put("item", _item);
Debug.locals.put("itemIndex", _itemindex);
 BA.debugLineNum = 570;BA.debugLine="Private Sub TryRestoreExistingCachedMedia(itemType";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 571;BA.debugLine="If itemId = \"\" Then Return False";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 572;BA.debugLine="If IsCachedFileUsable(GetDirByItemType(itemType),";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getdirbyitemtype" /*RemoteObject*/ ,(Object)(_itemtype))),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_resolveindexedfilename" /*RemoteObject*/ ,(Object)(_itemtype),(Object)(_itemid),(Object)(_itemindex)))),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 573;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 574;BA.debugLine="UpdateAdIndex(item, itemIndex)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_itemindex));
 BA.debugLineNum = 575;BA.debugLine="SaveAdIndex";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );
 BA.debugLineNum = 576;BA.debugLine="Trace(\"Валидный cached ad восстановлен в индексе";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Валидный cached ad восстановлен в индексе без скачивания. id="),_itemid)));
 BA.debugLineNum = 577;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) return mediacache.__c.getField(true,"True");
 };
 BA.debugLineNum = 579;BA.debugLine="If itemType = \"track\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
 BA.debugLineNum = 580;BA.debugLine="UpdateTrackIndex(item, itemIndex)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_itemindex));
 BA.debugLineNum = 581;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 582;BA.debugLine="Trace(\"Валидный cached track восстановлен в инде";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Валидный cached track восстановлен в индексе без скачивания. id="),_itemid)));
 BA.debugLineNum = 583;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) return mediacache.__c.getField(true,"True");
 };
 BA.debugLineNum = 585;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 586;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateadindex(RemoteObject __ref,RemoteObject _ad,RemoteObject _adindex) throws Exception{
try {
		Debug.PushSubsStack("UpdateAdIndex (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("updateadindex")) { return __ref.runUserSub(false, "mediacache","updateadindex", __ref, _ad, _adindex);}
RemoteObject _adid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ad", _ad);
Debug.locals.put("adIndex", _adindex);
 BA.debugLineNum = 326;BA.debugLine="Private Sub UpdateAdIndex(ad As Map, adIndex As Ma";
Debug.ShouldStop(32);
 BA.debugLineNum = 327;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
Debug.ShouldStop(64);
_adid = BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("adId", _adid);Debug.locals.put("adId", _adid);
 BA.debugLineNum = 328;BA.debugLine="If adId = \"\" Then Return";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 329;BA.debugLine="Dim entry As Map = adIndex.GetDefault(adId, Null)";
Debug.ShouldStop(256);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _adindex.runMethod(false,"GetDefault",(Object)((_adid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 330;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Initialize");};
 BA.debugLineNum = 331;BA.debugLine="entry.Put(\"id\", adId)";
Debug.ShouldStop(1024);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_adid)));
 BA.debugLineNum = 332;BA.debugLine="entry.Put(\"title\", ad.GetDefault(\"title\", \"\"))";
Debug.ShouldStop(2048);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 333;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("saved_at")))),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));};
 BA.debugLineNum = 334;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(8192);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 335;BA.debugLine="entry.Put(\"duration\", ad.GetDefault(\"duration\", 0";
Debug.ShouldStop(16384);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 336;BA.debugLine="entry.Put(\"gain\", ad.GetDefault(\"gain\", 0))";
Debug.ShouldStop(32768);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 337;BA.debugLine="adIndex.Put(adId, entry)";
Debug.ShouldStop(65536);
_adindex.runVoidMethod ("Put",(Object)((_adid)),(Object)((_entry.getObject())));
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
public static RemoteObject  _updatetrackindex(RemoteObject __ref,RemoteObject _item,RemoteObject _trackindex) throws Exception{
try {
		Debug.PushSubsStack("UpdateTrackIndex (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,340);
if (RapidSub.canDelegate("updatetrackindex")) { return __ref.runUserSub(false, "mediacache","updatetrackindex", __ref, _item, _trackindex);}
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("item", _item);
Debug.locals.put("trackIndex", _trackindex);
 BA.debugLineNum = 340;BA.debugLine="Private Sub UpdateTrackIndex(item As Map, trackInd";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(1048576);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 342;BA.debugLine="If trackId = \"\" Then Return";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 343;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
Debug.ShouldStop(4194304);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackindex.runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 344;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Initialize");};
 BA.debugLineNum = 345;BA.debugLine="entry.Put(\"id\", trackId)";
Debug.ShouldStop(16777216);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_trackid)));
 BA.debugLineNum = 346;BA.debugLine="entry.Put(\"file_name\", BuildTrackCacheFileName(tr";
Debug.ShouldStop(33554432);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcachefilename" /*RemoteObject*/ ,(Object)(_trackid)))));
 BA.debugLineNum = 347;BA.debugLine="entry.Put(\"title\", item.GetDefault(\"title\", \"\"))";
Debug.ShouldStop(67108864);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 348;BA.debugLine="entry.Put(\"set\", item.GetDefault(\"set\", \"\"))";
Debug.ShouldStop(134217728);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("set"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("set"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 349;BA.debugLine="entry.Put(\"stream\", item.GetDefault(\"stream\", \"\")";
Debug.ShouldStop(268435456);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 350;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("saved_at")))),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));};
 BA.debugLineNum = 351;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(1073741824);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 352;BA.debugLine="entry.Put(\"gain\", item.GetDefault(\"gain\", 0))";
Debug.ShouldStop(-2147483648);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 353;BA.debugLine="trackIndex.Put(trackId, entry)";
Debug.ShouldStop(1);
_trackindex.runVoidMethod ("Put",(Object)((_trackid)),(Object)((_entry.getObject())));
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
public static RemoteObject  _validateindexedfile(RemoteObject __ref,RemoteObject _itemtype,RemoteObject _itemid) throws Exception{
try {
		Debug.PushSubsStack("ValidateIndexedFile (mediacache) ","mediacache",2,__ref.getField(false, "ba"),__ref,543);
if (RapidSub.canDelegate("validateindexedfile")) { return __ref.runUserSub(false, "mediacache","validateindexedfile", __ref, _itemtype, _itemid);}
RemoteObject _auditindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _auditdir = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("itemType", _itemtype);
Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 543;BA.debugLine="Private Sub ValidateIndexedFile(itemType As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 544;BA.debugLine="If itemId = \"\" Then Return False";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 545;BA.debugLine="Dim auditIndex As Map = GetIndexByItemType(itemTy";
Debug.ShouldStop(1);
_auditindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_auditindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getindexbyitemtype" /*RemoteObject*/ ,(Object)(_itemtype));Debug.locals.put("auditIndex", _auditindex);Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 546;BA.debugLine="Dim auditDir As String = GetDirByItemType(itemTyp";
Debug.ShouldStop(2);
_auditdir = __ref.runClassMethod (b4j.example.mediacache.class, "_getdirbyitemtype" /*RemoteObject*/ ,(Object)(_itemtype));Debug.locals.put("auditDir", _auditdir);Debug.locals.put("auditDir", _auditdir);
 BA.debugLineNum = 547;BA.debugLine="Dim fileName As String = ResolveIndexedFileName(i";
Debug.ShouldStop(4);
_filename = __ref.runClassMethod (b4j.example.mediacache.class, "_resolveindexedfilename" /*RemoteObject*/ ,(Object)(_itemtype),(Object)(_itemid),(Object)(_auditindex));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 548;BA.debugLine="If auditIndex.ContainsKey(itemId) = False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_auditindex.runMethod(true,"ContainsKey",(Object)((_itemid))),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 549;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename)),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 550;BA.debugLine="RestoreIndexedFileById(itemId, auditIndex)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.mediacache.class, "_restoreindexedfilebyid" /*RemoteObject*/ ,(Object)(_itemid),(Object)(_auditindex));
 BA.debugLineNum = 551;BA.debugLine="SaveIndexByItemType(itemType)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveindexbyitemtype" /*RemoteObject*/ ,(Object)(_itemtype));
 BA.debugLineNum = 552;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) return mediacache.__c.getField(true,"True");
 };
 BA.debugLineNum = 554;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then Re";
Debug.ShouldStop(512);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename)).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 555;BA.debugLine="auditIndex.Remove(itemId)";
Debug.ShouldStop(1024);
_auditindex.runVoidMethod ("Remove",(Object)((_itemid)));
 BA.debugLineNum = 556;BA.debugLine="SaveIndexByItemType(itemType)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveindexbyitemtype" /*RemoteObject*/ ,(Object)(_itemtype));
 BA.debugLineNum = 557;BA.debugLine="Return False";
Debug.ShouldStop(4096);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 558;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}