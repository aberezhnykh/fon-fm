package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mediacache_subs_0 {


public static RemoteObject  _accumulatetrackplayliststat(RemoteObject __ref,RemoteObject _playlistid,RemoteObject _trackbytes) throws Exception{
try {
		Debug.PushSubsStack("AccumulateTrackPlaylistStat (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1765);
if (RapidSub.canDelegate("accumulatetrackplayliststat")) { return __ref.runUserSub(false, "mediacache","accumulatetrackplayliststat", __ref, _playlistid, _trackbytes);}
RemoteObject _statskey = RemoteObject.createImmutable("");
RemoteObject _playlistentry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playlistId", _playlistid);
Debug.locals.put("trackBytes", _trackbytes);
 BA.debugLineNum = 1765;BA.debugLine="Private Sub AccumulateTrackPlaylistStat(playlistId";
Debug.ShouldStop(16);
 BA.debugLineNum = 1766;BA.debugLine="Dim statsKey As String = playlistId";
Debug.ShouldStop(32);
_statskey = _playlistid;Debug.locals.put("statsKey", _statskey);Debug.locals.put("statsKey", _statskey);
 BA.debugLineNum = 1767;BA.debugLine="If statsKey = \"\" Then statsKey = \"_unknown\"";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_statskey,BA.ObjectToString(""))) { 
_statskey = BA.ObjectToString("_unknown");Debug.locals.put("statsKey", _statskey);};
 BA.debugLineNum = 1768;BA.debugLine="Dim playlistEntry As Map = cachedTrackPlaylistSta";
Debug.ShouldStop(128);
_playlistentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_cachedtrackplayliststats" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_statskey)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("playlistEntry", _playlistentry);Debug.locals.put("playlistEntry", _playlistentry);
 BA.debugLineNum = 1769;BA.debugLine="If playlistEntry.IsInitialized = False Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_playlistentry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1770;BA.debugLine="playlistEntry.Initialize";
Debug.ShouldStop(512);
_playlistentry.runVoidMethod ("Initialize");
 BA.debugLineNum = 1771;BA.debugLine="playlistEntry.Put(\"count\", 0)";
Debug.ShouldStop(1024);
_playlistentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("count"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1772;BA.debugLine="playlistEntry.Put(\"bytes\", 0)";
Debug.ShouldStop(2048);
_playlistentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bytes"))),(Object)(RemoteObject.createImmutable((0))));
 };
 BA.debugLineNum = 1774;BA.debugLine="playlistEntry.Put(\"count\", playlistEntry.GetDefau";
Debug.ShouldStop(8192);
_playlistentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("count"))),(Object)((RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _playlistentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("count"))),(Object)(RemoteObject.createImmutable((0))))),RemoteObject.createImmutable(1)}, "+",1, 0))));
 BA.debugLineNum = 1775;BA.debugLine="playlistEntry.Put(\"bytes\", ToLongDefault(playlist";
Debug.ShouldStop(16384);
_playlistentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bytes"))),(Object)((RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4j.example.mediacache.class, "_tolongdefault" /*RemoteObject*/ ,(Object)(_playlistentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("bytes"))),(Object)(RemoteObject.createImmutable((0))))),(Object)(BA.numberCast(long.class, 0))),_trackbytes}, "+",1, 2))));
 BA.debugLineNum = 1776;BA.debugLine="cachedTrackPlaylistStats.Put(statsKey, playlistEn";
Debug.ShouldStop(32768);
__ref.getField(false,"_cachedtrackplayliststats" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_statskey)),(Object)((_playlistentry.getObject())));
 BA.debugLineNum = 1777;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addindexedfilefromaudit(RemoteObject __ref,RemoteObject _itemtype,RemoteObject _filename,RemoteObject _auditindex) throws Exception{
try {
		Debug.PushSubsStack("AddIndexedFileFromAudit (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1274);
if (RapidSub.canDelegate("addindexedfilefromaudit")) { return __ref.runUserSub(false, "mediacache","addindexedfilefromaudit", __ref, _itemtype, _filename, _auditindex);}
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _existingentry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
Debug.locals.put("itemType", _itemtype);
Debug.locals.put("fileName", _filename);
Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 1274;BA.debugLine="Private Sub AddIndexedFileFromAudit(itemType As St";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1275;BA.debugLine="Dim entry As Map";
Debug.ShouldStop(67108864);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("entry", _entry);
 BA.debugLineNum = 1276;BA.debugLine="entry.Initialize";
Debug.ShouldStop(134217728);
_entry.runVoidMethod ("Initialize");
 BA.debugLineNum = 1277;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
Debug.ShouldStop(268435456);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 1278;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(536870912);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 1279;BA.debugLine="If itemType = \"ads\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ads"))) { 
 BA.debugLineNum = 1280;BA.debugLine="entry.Put(\"id\", fileName)";
Debug.ShouldStop(-2147483648);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_filename)));
 BA.debugLineNum = 1281;BA.debugLine="entry.Put(\"title\", \"\")";
Debug.ShouldStop(1);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1282;BA.debugLine="entry.Put(\"duration\", 0)";
Debug.ShouldStop(2);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1283;BA.debugLine="entry.Put(\"gain\", 0)";
Debug.ShouldStop(4);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1284;BA.debugLine="auditIndex.Put(fileName, entry)";
Debug.ShouldStop(8);
_auditindex.runVoidMethod ("Put",(Object)((_filename)),(Object)((_entry.getObject())));
 }else {
 BA.debugLineNum = 1286;BA.debugLine="Dim trackId As String = FindTrackIdByFileName(fi";
Debug.ShouldStop(32);
_trackid = __ref.runClassMethod (b4j.example.mediacache.class, "_findtrackidbyfilename" /*RemoteObject*/ ,(Object)(_filename),(Object)(_auditindex));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 1287;BA.debugLine="If trackId = \"\" Then Return";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1288;BA.debugLine="entry.Put(\"id\", trackId)";
Debug.ShouldStop(128);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_trackid)));
 BA.debugLineNum = 1289;BA.debugLine="entry.Put(\"title\", \"\")";
Debug.ShouldStop(256);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1290;BA.debugLine="entry.Put(\"set\", \"\")";
Debug.ShouldStop(512);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("set"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1291;BA.debugLine="entry.Put(\"stream\", \"\")";
Debug.ShouldStop(1024);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1292;BA.debugLine="entry.Put(\"gain\", 0)";
Debug.ShouldStop(2048);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1293;BA.debugLine="Dim existingEntry As Map = auditIndex.GetDefault";
Debug.ShouldStop(4096);
_existingentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_existingentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _auditindex.runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("existingEntry", _existingentry);Debug.locals.put("existingEntry", _existingentry);
 BA.debugLineNum = 1294;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFrom";
Debug.ShouldStop(8192);
_playlistid = __ref.runClassMethod (b4j.example.mediacache.class, "_extractplaylistidfromtrackrelativepath" /*RemoteObject*/ ,(Object)(_filename));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 1295;BA.debugLine="If playlistId = \"\" And existingEntry.IsInitializ";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString("")) && RemoteObject.solveBoolean(".",_existingentry.runMethod(true,"IsInitialized"))) { 
_playlistid = BA.ObjectToString(_existingentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);};
 BA.debugLineNum = 1296;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
Debug.ShouldStop(32768);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((_playlistid)));
 BA.debugLineNum = 1297;BA.debugLine="entry.Put(\"file_name\", fileName)";
Debug.ShouldStop(65536);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((_filename)));
 BA.debugLineNum = 1298;BA.debugLine="entry.Put(\"size_bytes\", GetFileSizeSafe(GetTrack";
Debug.ShouldStop(131072);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("size_bytes"))),(Object)((__ref.runClassMethod (b4j.example.mediacache.class, "_getfilesizesafe" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_filename)))));
 BA.debugLineNum = 1299;BA.debugLine="auditIndex.Put(trackId, entry)";
Debug.ShouldStop(262144);
_auditindex.runVoidMethod ("Put",(Object)((_trackid)),(Object)((_entry.getObject())));
 };
 BA.debugLineNum = 1301;BA.debugLine="MarkAuditIndexChanged(itemType)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.mediacache.class, "_markauditindexchanged" /*RemoteObject*/ ,(Object)(_itemtype));
 BA.debugLineNum = 1302;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("ApplyXorToBuffer (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,963);
if (RapidSub.canDelegate("applyxortobuffer")) { return __ref.runUserSub(false, "mediacache","applyxortobuffer", __ref, _buffer, _count, _keybytes, _keyoffset);}
int _i = 0;
RemoteObject _keyindex = RemoteObject.createImmutable(0);
Debug.locals.put("buffer", _buffer);
Debug.locals.put("count", _count);
Debug.locals.put("keyBytes", _keybytes);
Debug.locals.put("keyOffset", _keyoffset);
 BA.debugLineNum = 963;BA.debugLine="Private Sub ApplyXorToBuffer(buffer() As Byte, cou";
Debug.ShouldStop(4);
 BA.debugLineNum = 964;BA.debugLine="If count <= 0 Or keyBytes.Length = 0 Then Return";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("k",_count,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",_keybytes.getField(true,"length"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 965;BA.debugLine="For i = 0 To count - 1";
Debug.ShouldStop(16);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 966;BA.debugLine="Dim keyIndex As Int = (keyOffset + i) Mod keyByt";
Debug.ShouldStop(32);
_keyindex = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_keyoffset,RemoteObject.createImmutable(_i)}, "+",1, 2)),_keybytes.getField(true,"length")}, "%",0, 2));Debug.locals.put("keyIndex", _keyindex);Debug.locals.put("keyIndex", _keyindex);
 BA.debugLineNum = 967;BA.debugLine="buffer(i) = Bit.Xor(buffer(i), keyBytes(keyIndex";
Debug.ShouldStop(64);
_buffer.setArrayElement (BA.numberCast(byte.class, mediacache.__c.getField(false,"Bit").runMethod(true,"Xor",(Object)(BA.numberCast(int.class, _buffer.getArrayElement(true,BA.numberCast(int.class, _i)))),(Object)(BA.numberCast(int.class, _keybytes.getArrayElement(true,_keyindex))))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 969;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _backfilltrackindexfromfiles(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BackfillTrackIndexFromFiles (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1390);
if (RapidSub.canDelegate("backfilltrackindexfromfiles")) { return __ref.runUserSub(false, "mediacache","backfilltrackindexfromfiles", __ref);}
RemoteObject _changed = RemoteObject.createImmutable(false);
RemoteObject _playlisttrackmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _listedfiles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _storedfilename = RemoteObject.createImmutable("");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _filesize = RemoteObject.createImmutable(0L);
RemoteObject _storedsize = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 1390;BA.debugLine="Private Sub BackfillTrackIndexFromFiles";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1391;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 1392;BA.debugLine="Dim changed As Boolean = False";
Debug.ShouldStop(32768);
_changed = mediacache.__c.getField(true,"False");Debug.locals.put("changed", _changed);Debug.locals.put("changed", _changed);
 BA.debugLineNum = 1393;BA.debugLine="Dim playlistTrackMaps As Map";
Debug.ShouldStop(65536);
_playlisttrackmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("playlistTrackMaps", _playlisttrackmaps);
 BA.debugLineNum = 1394;BA.debugLine="playlistTrackMaps.Initialize";
Debug.ShouldStop(131072);
_playlisttrackmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 1395;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 1396;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Re";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_directoryexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ ))),mediacache.__c.getField(true,"False"))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1397;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRec";
Debug.ShouldStop(1048576);
_listedfiles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listedfiles = __ref.runClassMethod (b4j.example.mediacache.class, "_listtrackcachefilesrecursive" /*RemoteObject*/ );Debug.locals.put("listedFiles", _listedfiles);Debug.locals.put("listedFiles", _listedfiles);
 BA.debugLineNum = 1398;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_listedfiles.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1399;BA.debugLine="For Each fileName As String In listedFiles";
Debug.ShouldStop(4194304);
{
final RemoteObject group9 = _listedfiles;
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_filename = BA.ObjectToString(group9.runMethod(false,"Get",index9));Debug.locals.put("fileName", _filename);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 1400;BA.debugLine="If fileName = \"\" Then Continue";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 1401;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
Debug.ShouldStop(16777216);
if (_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".tmp"))).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 1402;BA.debugLine="Dim trackId As String = FindTrackIdByFileNameWi";
Debug.ShouldStop(33554432);
_trackid = __ref.runClassMethod (b4j.example.mediacache.class, "_findtrackidbyfilenamewithmetadata" /*RemoteObject*/ ,(Object)(_filename),(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ )),(Object)(_playlisttrackmaps));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 1403;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 1404;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(";
Debug.ShouldStop(134217728);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 1405;BA.debugLine="If entry.IsInitialized = False Then entry.Initi";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Initialize");};
 BA.debugLineNum = 1406;BA.debugLine="Dim storedFileName As String = \"\" & entry.GetDe";
Debug.ShouldStop(536870912);
_storedfilename = RemoteObject.concat(RemoteObject.createImmutable(""),_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("storedFileName", _storedfilename);Debug.locals.put("storedFileName", _storedfilename);
 BA.debugLineNum = 1407;BA.debugLine="If storedFileName <> fileName Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",_storedfilename,_filename)) { 
 BA.debugLineNum = 1408;BA.debugLine="entry.Put(\"file_name\", fileName)";
Debug.ShouldStop(-2147483648);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((_filename)));
 BA.debugLineNum = 1409;BA.debugLine="changed = True";
Debug.ShouldStop(1);
_changed = mediacache.__c.getField(true,"True");Debug.locals.put("changed", _changed);
 };
 BA.debugLineNum = 1411;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFro";
Debug.ShouldStop(4);
_playlistid = __ref.runClassMethod (b4j.example.mediacache.class, "_extractplaylistidfromtrackrelativepath" /*RemoteObject*/ ,(Object)(_filename));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 1412;BA.debugLine="If playlistId = \"\" Then playlistId = ResolvePla";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
_playlistid = __ref.runClassMethod (b4j.example.mediacache.class, "_resolveplaylistidfortrackid" /*RemoteObject*/ ,(Object)(_trackid),(Object)(BA.ObjectToString(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(_playlisttrackmaps));Debug.locals.put("playlistId", _playlistid);};
 BA.debugLineNum = 1413;BA.debugLine="If playlistId <> \"\" And entry.GetDefault(\"playl";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_playlistid,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))),(_playlistid))) { 
 BA.debugLineNum = 1414;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
Debug.ShouldStop(32);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((_playlistid)));
 BA.debugLineNum = 1415;BA.debugLine="changed = True";
Debug.ShouldStop(64);
_changed = mediacache.__c.getField(true,"True");Debug.locals.put("changed", _changed);
 };
 BA.debugLineNum = 1417;BA.debugLine="If entry.ContainsKey(\"id\") = False Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("id")))),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1418;BA.debugLine="entry.Put(\"id\", trackId)";
Debug.ShouldStop(512);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_trackid)));
 BA.debugLineNum = 1419;BA.debugLine="changed = True";
Debug.ShouldStop(1024);
_changed = mediacache.__c.getField(true,"True");Debug.locals.put("changed", _changed);
 };
 BA.debugLineNum = 1421;BA.debugLine="Dim fileSize As Long = GetFileSizeSafe(GetTrack";
Debug.ShouldStop(4096);
_filesize = __ref.runClassMethod (b4j.example.mediacache.class, "_getfilesizesafe" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("fileSize", _filesize);Debug.locals.put("fileSize", _filesize);
 BA.debugLineNum = 1422;BA.debugLine="Dim storedSize As Long = ToLongDefault(entry.Ge";
Debug.ShouldStop(8192);
_storedsize = __ref.runClassMethod (b4j.example.mediacache.class, "_tolongdefault" /*RemoteObject*/ ,(Object)(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("size_bytes"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1)))))),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));Debug.locals.put("storedSize", _storedsize);Debug.locals.put("storedSize", _storedsize);
 BA.debugLineNum = 1423;BA.debugLine="If storedSize <> fileSize Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_storedsize,_filesize)) { 
 BA.debugLineNum = 1424;BA.debugLine="entry.Put(\"size_bytes\", fileSize)";
Debug.ShouldStop(32768);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("size_bytes"))),(Object)((_filesize)));
 BA.debugLineNum = 1425;BA.debugLine="changed = True";
Debug.ShouldStop(65536);
_changed = mediacache.__c.getField(true,"True");Debug.locals.put("changed", _changed);
 };
 BA.debugLineNum = 1427;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("saved_at")))),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1428;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
Debug.ShouldStop(524288);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 1429;BA.debugLine="changed = True";
Debug.ShouldStop(1048576);
_changed = mediacache.__c.getField(true,"True");Debug.locals.put("changed", _changed);
 };
 BA.debugLineNum = 1431;BA.debugLine="If entry.ContainsKey(\"last_used_at\") = False Th";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("last_used_at")))),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1432;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(8388608);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 1433;BA.debugLine="changed = True";
Debug.ShouldStop(16777216);
_changed = mediacache.__c.getField(true,"True");Debug.locals.put("changed", _changed);
 };
 BA.debugLineNum = 1435;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_trackid)),(Object)((_entry.getObject())));
 }
}Debug.locals.put("fileName", _filename);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e48) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e48.toString()); BA.debugLineNum = 1438;BA.debugLine="Trace(\"Не удалось выполнить стартовую переиндекс";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось выполнить стартовую переиндексацию кэша треков. message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 1440;BA.debugLine="If changed Then SaveTrackIndex";
Debug.ShouldStop(-2147483648);
if (_changed.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );};
 BA.debugLineNum = 1441;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("BuildAdUrl (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,713);
if (RapidSub.canDelegate("buildadurl")) { return __ref.runUserSub(false, "mediacache","buildadurl", __ref, _adid);}
RemoteObject _first = RemoteObject.createImmutable("");
Debug.locals.put("adId", _adid);
 BA.debugLineNum = 713;BA.debugLine="Private Sub BuildAdUrl(adId As String) As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 714;BA.debugLine="If adId = \"\" Then Return \"\"";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 715;BA.debugLine="Dim first As String = adId.SubString2(0, 1)";
Debug.ShouldStop(1024);
_first = _adid.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 716;BA.debugLine="Return \"https://cdn.fon.fm/media/ads/\" & first &";
Debug.ShouldStop(2048);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("https://cdn.fon.fm/media/ads/"),_first,RemoteObject.createImmutable("/"),_adid,RemoteObject.createImmutable(".mp3"));
 BA.debugLineNum = 717;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("BuildPlaybackTempTrackFileName (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,766);
if (RapidSub.canDelegate("buildplaybacktemptrackfilename")) { return __ref.runUserSub(false, "mediacache","buildplaybacktemptrackfilename", __ref, _audiokey);}
Debug.locals.put("audioKey", _audiokey);
 BA.debugLineNum = 766;BA.debugLine="Private Sub BuildPlaybackTempTrackFileName(audioKe";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 767;BA.debugLine="If audioKey = \"secondary\" Then Return SECONDARY_T";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_audiokey,BA.ObjectToString("secondary"))) { 
if (true) return __ref.getField(true,"_secondary_temp_track_file" /*RemoteObject*/ );};
 BA.debugLineNum = 768;BA.debugLine="Return PRIMARY_TEMP_TRACK_FILE";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(true,"_primary_temp_track_file" /*RemoteObject*/ );
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
public static RemoteObject  _buildtempcachefilename(RemoteObject __ref,RemoteObject _itemid) throws Exception{
try {
		Debug.PushSubsStack("BuildTempCacheFileName (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,762);
if (RapidSub.canDelegate("buildtempcachefilename")) { return __ref.runUserSub(false, "mediacache","buildtempcachefilename", __ref, _itemid);}
Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 762;BA.debugLine="Private Sub BuildTempCacheFileName(itemId As Strin";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 763;BA.debugLine="Return itemId & \".tmp\"";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.concat(_itemid,RemoteObject.createImmutable(".tmp"));
 BA.debugLineNum = 764;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("BuildTrackCacheFileName (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,725);
if (RapidSub.canDelegate("buildtrackcachefilename")) { return __ref.runUserSub(false, "mediacache","buildtrackcachefilename", __ref, _trackid);}
RemoteObject _sourcebytes = null;
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _uuid = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 725;BA.debugLine="Private Sub BuildTrackCacheFileName(trackId As Str";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 726;BA.debugLine="Dim sourceBytes() As Byte = GetBytesFromString(Bu";
Debug.ShouldStop(2097152);
_sourcebytes = __ref.runClassMethod (b4j.example.mediacache.class, "_getbytesfromstring" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackobfuscationseed" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache")),(Object)(_trackid))));Debug.locals.put("sourceBytes", _sourcebytes);Debug.locals.put("sourceBytes", _sourcebytes);
 BA.debugLineNum = 727;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(4194304);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 728;BA.debugLine="jo.InitializeStatic(\"java.util.UUID\")";
Debug.ShouldStop(8388608);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.util.UUID")));
 BA.debugLineNum = 729;BA.debugLine="Dim uuid As JavaObject = jo.RunMethod(\"nameUUIDFr";
Debug.ShouldStop(16777216);
_uuid = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_uuid = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("nameUUIDFromBytes")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_sourcebytes)}))));Debug.locals.put("uuid", _uuid);Debug.locals.put("uuid", _uuid);
 BA.debugLineNum = 730;BA.debugLine="Dim fileName As String = uuid.RunMethod(\"toString";
Debug.ShouldStop(33554432);
_filename = BA.ObjectToString(_uuid.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toString")),(Object)((mediacache.__c.getField(false,"Null")))));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 731;BA.debugLine="Return fileName.Replace(\"-\", \"\")";
Debug.ShouldStop(67108864);
if (true) return _filename.runMethod(true,"replace",(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 732;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtrackcacherelativefilename(RemoteObject __ref,RemoteObject _trackid,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("BuildTrackCacheRelativeFileName (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,734);
if (RapidSub.canDelegate("buildtrackcacherelativefilename")) { return __ref.runUserSub(false, "mediacache","buildtrackcacherelativefilename", __ref, _trackid, _playlistid);}
RemoteObject _unusedplaylistid = RemoteObject.createImmutable("");
Debug.locals.put("trackId", _trackid);
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 734;BA.debugLine="Private Sub BuildTrackCacheRelativeFileName(trackI";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 735;BA.debugLine="Dim unusedPlaylistId As String = playlistId";
Debug.ShouldStop(1073741824);
_unusedplaylistid = _playlistid;Debug.locals.put("unusedPlaylistId", _unusedplaylistid);Debug.locals.put("unusedPlaylistId", _unusedplaylistid);
 BA.debugLineNum = 736;BA.debugLine="If unusedPlaylistId = \"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_unusedplaylistid,BA.ObjectToString(""))) { 
 };
 BA.debugLineNum = 738;BA.debugLine="Return BuildTrackCacheFileName(trackId)";
Debug.ShouldStop(2);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcachefilename" /*RemoteObject*/ ,(Object)(_trackid));
 BA.debugLineNum = 739;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtrackcachesummary(RemoteObject __ref,RemoteObject _protectedids,RemoteObject _relevantids) throws Exception{
try {
		Debug.PushSubsStack("BuildTrackCacheSummary (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1535);
if (RapidSub.canDelegate("buildtrackcachesummary")) { return __ref.runUserSub(false, "mediacache","buildtrackcachesummary", __ref, _protectedids, _relevantids);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _candidates = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _keystoremove = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cachebytes = RemoteObject.createImmutable(0L);
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _filebytes = RemoteObject.createImmutable(0L);
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _candidate = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("protectedIds", _protectedids);
Debug.locals.put("relevantIds", _relevantids);
 BA.debugLineNum = 1535;BA.debugLine="Private Sub BuildTrackCacheSummary(protectedIds As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1536;BA.debugLine="Dim result As Map";
Debug.ShouldStop(-2147483648);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 1537;BA.debugLine="result.Initialize";
Debug.ShouldStop(1);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 1538;BA.debugLine="Dim candidates As List";
Debug.ShouldStop(2);
_candidates = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("candidates", _candidates);
 BA.debugLineNum = 1539;BA.debugLine="candidates.Initialize";
Debug.ShouldStop(4);
_candidates.runVoidMethod ("Initialize");
 BA.debugLineNum = 1540;BA.debugLine="Dim keysToRemove As List";
Debug.ShouldStop(8);
_keystoremove = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("keysToRemove", _keystoremove);
 BA.debugLineNum = 1541;BA.debugLine="keysToRemove.Initialize";
Debug.ShouldStop(16);
_keystoremove.runVoidMethod ("Initialize");
 BA.debugLineNum = 1542;BA.debugLine="Dim cacheBytes As Long = 0";
Debug.ShouldStop(32);
_cachebytes = BA.numberCast(long.class, 0);Debug.locals.put("cacheBytes", _cachebytes);Debug.locals.put("cacheBytes", _cachebytes);
 BA.debugLineNum = 1543;BA.debugLine="For Each trackId As String In cachedTrackIndex.Ke";
Debug.ShouldStop(64);
{
final RemoteObject group8 = __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_trackid = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("trackId", _trackid);
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 1544;BA.debugLine="Dim fileName As String = ResolveTrackCacheFileNa";
Debug.ShouldStop(128);
_filename = __ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackcachefilename" /*RemoteObject*/ ,(Object)(_trackid),(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ )));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 1545;BA.debugLine="If IsCachedFileUsable(GetTracksDir, fileName) =";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_filename)),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1546;BA.debugLine="keysToRemove.Add(trackId)";
Debug.ShouldStop(512);
_keystoremove.runVoidMethod ("Add",(Object)((_trackid)));
 BA.debugLineNum = 1547;BA.debugLine="Continue";
Debug.ShouldStop(1024);
if (true) continue;
 };
 BA.debugLineNum = 1549;BA.debugLine="Dim fileBytes As Long = GetFileSizeSafe(GetTrack";
Debug.ShouldStop(4096);
_filebytes = __ref.runClassMethod (b4j.example.mediacache.class, "_getfilesizesafe" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("fileBytes", _filebytes);Debug.locals.put("fileBytes", _filebytes);
 BA.debugLineNum = 1550;BA.debugLine="cacheBytes = cacheBytes + fileBytes";
Debug.ShouldStop(8192);
_cachebytes = RemoteObject.solve(new RemoteObject[] {_cachebytes,_filebytes}, "+",1, 2);Debug.locals.put("cacheBytes", _cachebytes);
 BA.debugLineNum = 1551;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(t";
Debug.ShouldStop(16384);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 1552;BA.debugLine="If entry.IsInitialized = False Then entry.Initia";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Initialize");};
 BA.debugLineNum = 1553;BA.debugLine="entry.Put(\"file_name\", fileName)";
Debug.ShouldStop(65536);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((_filename)));
 BA.debugLineNum = 1554;BA.debugLine="entry.Put(\"size_bytes\", fileBytes)";
Debug.ShouldStop(131072);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("size_bytes"))),(Object)((_filebytes)));
 BA.debugLineNum = 1555;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
Debug.ShouldStop(262144);
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_trackid)),(Object)((_entry.getObject())));
 BA.debugLineNum = 1556;BA.debugLine="If protectedIds.ContainsKey(trackId) Then Contin";
Debug.ShouldStop(524288);
if (_protectedids.runMethod(true,"ContainsKey",(Object)((_trackid))).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 1557;BA.debugLine="Dim candidate As Map";
Debug.ShouldStop(1048576);
_candidate = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("candidate", _candidate);
 BA.debugLineNum = 1558;BA.debugLine="candidate.Initialize";
Debug.ShouldStop(2097152);
_candidate.runVoidMethod ("Initialize");
 BA.debugLineNum = 1559;BA.debugLine="candidate.Put(\"id\", trackId)";
Debug.ShouldStop(4194304);
_candidate.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_trackid)));
 BA.debugLineNum = 1560;BA.debugLine="candidate.Put(\"file_name\", fileName)";
Debug.ShouldStop(8388608);
_candidate.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((_filename)));
 BA.debugLineNum = 1561;BA.debugLine="candidate.Put(\"size_bytes\", fileBytes)";
Debug.ShouldStop(16777216);
_candidate.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("size_bytes"))),(Object)((_filebytes)));
 BA.debugLineNum = 1562;BA.debugLine="candidate.Put(\"last_used_at\", entry.GetDefault(\"";
Debug.ShouldStop(33554432);
_candidate.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 1563;BA.debugLine="candidate.Put(\"saved_at\", entry.GetDefault(\"save";
Debug.ShouldStop(67108864);
_candidate.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 1564;BA.debugLine="candidate.Put(\"is_relevant\", relevantIds.Contain";
Debug.ShouldStop(134217728);
_candidate.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_relevant"))),(Object)((_relevantids.runMethod(true,"ContainsKey",(Object)((_trackid))))));
 BA.debugLineNum = 1565;BA.debugLine="candidates.Add(candidate)";
Debug.ShouldStop(268435456);
_candidates.runVoidMethod ("Add",(Object)((_candidate.getObject())));
 }
}Debug.locals.put("trackId", _trackid);
;
 BA.debugLineNum = 1567;BA.debugLine="For Each trackId As String In keysToRemove";
Debug.ShouldStop(1073741824);
{
final RemoteObject group32 = _keystoremove;
final int groupLen32 = group32.runMethod(true,"getSize").<Integer>get()
;int index32 = 0;
;
for (; index32 < groupLen32;index32++){
_trackid = BA.ObjectToString(group32.runMethod(false,"Get",index32));Debug.locals.put("trackId", _trackid);
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 1568;BA.debugLine="cachedTrackIndex.Remove(trackId)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_trackid)));
 }
}Debug.locals.put("trackId", _trackid);
;
 BA.debugLineNum = 1570;BA.debugLine="If keysToRemove.Size > 0 Then SaveTrackIndex";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_keystoremove.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );};
 BA.debugLineNum = 1571;BA.debugLine="result.Put(\"cache_bytes\", cacheBytes)";
Debug.ShouldStop(4);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cache_bytes"))),(Object)((_cachebytes)));
 BA.debugLineNum = 1572;BA.debugLine="result.Put(\"candidates\", candidates)";
Debug.ShouldStop(8);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("candidates"))),(Object)((_candidates.getObject())));
 BA.debugLineNum = 1573;BA.debugLine="Return result";
Debug.ShouldStop(16);
if (true) return _result;
 BA.debugLineNum = 1574;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtrackobfuscationkey(RemoteObject __ref,RemoteObject _trackid) throws Exception{
try {
		Debug.PushSubsStack("BuildTrackObfuscationKey (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,931);
if (RapidSub.canDelegate("buildtrackobfuscationkey")) { return __ref.runUserSub(false, "mediacache","buildtrackobfuscationkey", __ref, _trackid);}
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 931;BA.debugLine="Private Sub BuildTrackObfuscationKey(trackId As St";
Debug.ShouldStop(4);
 BA.debugLineNum = 932;BA.debugLine="Return GetBytesFromString(BuildTrackObfuscationSe";
Debug.ShouldStop(8);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_getbytesfromstring" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackobfuscationseed" /*RemoteObject*/ ,(Object)(BA.ObjectToString("key")),(Object)(_trackid))));
 BA.debugLineNum = 933;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtrackobfuscationseed(RemoteObject __ref,RemoteObject _purpose,RemoteObject _trackid) throws Exception{
try {
		Debug.PushSubsStack("BuildTrackObfuscationSeed (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,935);
if (RapidSub.canDelegate("buildtrackobfuscationseed")) { return __ref.runUserSub(false, "mediacache","buildtrackobfuscationseed", __ref, _purpose, _trackid);}
Debug.locals.put("purpose", _purpose);
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 935;BA.debugLine="Private Sub BuildTrackObfuscationSeed(purpose As S";
Debug.ShouldStop(64);
 BA.debugLineNum = 936;BA.debugLine="Return \"fonfm|\" & purpose & \"|\" & trackId";
Debug.ShouldStop(128);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("fonfm|"),_purpose,RemoteObject.createImmutable("|"),_trackid);
 BA.debugLineNum = 937;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("BuildTrackUrl (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,719);
if (RapidSub.canDelegate("buildtrackurl")) { return __ref.runUserSub(false, "mediacache","buildtrackurl", __ref, _trackid);}
RemoteObject _first = RemoteObject.createImmutable("");
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 719;BA.debugLine="Private Sub BuildTrackUrl(trackId As String) As St";
Debug.ShouldStop(16384);
 BA.debugLineNum = 720;BA.debugLine="If trackId = \"\" Then Return \"\"";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 721;BA.debugLine="Dim first As String = trackId.SubString2(0, 1)";
Debug.ShouldStop(65536);
_first = _trackid.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 722;BA.debugLine="Return \"https://cdn.fon.fm/media/tracks/\" & first";
Debug.ShouldStop(131072);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("https://cdn.fon.fm/media/tracks/"),_first,RemoteObject.createImmutable("/"),_trackid,RemoteObject.createImmutable(".mp3"));
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
public static RemoteObject  _bytestomb(RemoteObject __ref,RemoteObject _valuebytes) throws Exception{
try {
		Debug.PushSubsStack("BytesToMb (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1809);
if (RapidSub.canDelegate("bytestomb")) { return __ref.runUserSub(false, "mediacache","bytestomb", __ref, _valuebytes);}
Debug.locals.put("valueBytes", _valuebytes);
 BA.debugLineNum = 1809;BA.debugLine="Private Sub BytesToMb(valueBytes As Long) As Long";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1810;BA.debugLine="Return Floor(valueBytes / 1024 / 1024)";
Debug.ShouldStop(131072);
if (true) return BA.numberCast(long.class, mediacache.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_valuebytes,RemoteObject.createImmutable(1024),RemoteObject.createImmutable(1024)}, "//",0, 0))));
 BA.debugLineNum = 1811;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private storageDir As String";
mediacache._storagedir = RemoteObject.createImmutable("");__ref.setField("_storagedir",mediacache._storagedir);
 //BA.debugLineNum = 7;BA.debugLine="Private storage As KeyValueStore";
mediacache._storage = RemoteObject.createNew ("b4j.example.keyvaluestore");__ref.setField("_storage",mediacache._storage);
 //BA.debugLineNum = 8;BA.debugLine="Private targetModule As Object";
mediacache._targetmodule = RemoteObject.createNew ("Object");__ref.setField("_targetmodule",mediacache._targetmodule);
 //BA.debugLineNum = 9;BA.debugLine="Private traceSubName As String";
mediacache._tracesubname = RemoteObject.createImmutable("");__ref.setField("_tracesubname",mediacache._tracesubname);
 //BA.debugLineNum = 10;BA.debugLine="Private mediaDirName As String = \"media\"";
mediacache._mediadirname = BA.ObjectToString("media");__ref.setField("_mediadirname",mediacache._mediadirname);
 //BA.debugLineNum = 11;BA.debugLine="Private adsDirName As String = \"ads\"";
mediacache._adsdirname = BA.ObjectToString("ads");__ref.setField("_adsdirname",mediacache._adsdirname);
 //BA.debugLineNum = 12;BA.debugLine="Private tracksDirName As String = \"tracks\"";
mediacache._tracksdirname = BA.ObjectToString("tracks");__ref.setField("_tracksdirname",mediacache._tracksdirname);
 //BA.debugLineNum = 13;BA.debugLine="Private Const CACHE_AUDIT_BATCH_SIZE As Int = 8";
mediacache._cache_audit_batch_size = BA.numberCast(int.class, 8);__ref.setField("_cache_audit_batch_size",mediacache._cache_audit_batch_size);
 //BA.debugLineNum = 14;BA.debugLine="Private Const AD_DOWNLOAD_TIMEOUT_MS As Int = 150";
mediacache._ad_download_timeout_ms = BA.numberCast(int.class, 15000);__ref.setField("_ad_download_timeout_ms",mediacache._ad_download_timeout_ms);
 //BA.debugLineNum = 15;BA.debugLine="Private Const TRACK_DOWNLOAD_TIMEOUT_MS As Int =";
mediacache._track_download_timeout_ms = BA.numberCast(int.class, 10000);__ref.setField("_track_download_timeout_ms",mediacache._track_download_timeout_ms);
 //BA.debugLineNum = 16;BA.debugLine="Private Const STREAM_XOR_BUFFER_SIZE As Int = 327";
mediacache._stream_xor_buffer_size = BA.numberCast(int.class, 32768);__ref.setField("_stream_xor_buffer_size",mediacache._stream_xor_buffer_size);
 //BA.debugLineNum = 17;BA.debugLine="Private Const TRACK_CACHE_HARD_LIMIT_MB As Long =";
mediacache._track_cache_hard_limit_mb = BA.numberCast(long.class, 1536);__ref.setField("_track_cache_hard_limit_mb",mediacache._track_cache_hard_limit_mb);
 //BA.debugLineNum = 18;BA.debugLine="Private Const TRACK_CACHE_TARGET_MB As Long = 768";
mediacache._track_cache_target_mb = BA.numberCast(long.class, 768);__ref.setField("_track_cache_target_mb",mediacache._track_cache_target_mb);
 //BA.debugLineNum = 19;BA.debugLine="Private Const MIN_FREE_DISK_MB As Long = 1536";
mediacache._min_free_disk_mb = BA.numberCast(long.class, 1536);__ref.setField("_min_free_disk_mb",mediacache._min_free_disk_mb);
 //BA.debugLineNum = 20;BA.debugLine="Private Const MIN_FREE_DISK_PERCENT As Int = 5";
mediacache._min_free_disk_percent = BA.numberCast(int.class, 5);__ref.setField("_min_free_disk_percent",mediacache._min_free_disk_percent);
 //BA.debugLineNum = 21;BA.debugLine="Private Const PRIMARY_TEMP_TRACK_FILE As String =";
mediacache._primary_temp_track_file = BA.ObjectToString("2f7f5f2f-91a0-4f4c-9f5f-70d7b94fd101.tmp");__ref.setField("_primary_temp_track_file",mediacache._primary_temp_track_file);
 //BA.debugLineNum = 22;BA.debugLine="Private Const SECONDARY_TEMP_TRACK_FILE As String";
mediacache._secondary_temp_track_file = BA.ObjectToString("92c2df6a-7f22-4b75-8c09-d5a6f4f40a21.tmp");__ref.setField("_secondary_temp_track_file",mediacache._secondary_temp_track_file);
 //BA.debugLineNum = 23;BA.debugLine="Private cachedAdIndex As Map";
mediacache._cachedadindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cachedadindex",mediacache._cachedadindex);
 //BA.debugLineNum = 24;BA.debugLine="Private cachedTrackIndex As Map";
mediacache._cachedtrackindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cachedtrackindex",mediacache._cachedtrackindex);
 //BA.debugLineNum = 25;BA.debugLine="Private cachedAdIndexDirty As Boolean";
mediacache._cachedadindexdirty = RemoteObject.createImmutable(false);__ref.setField("_cachedadindexdirty",mediacache._cachedadindexdirty);
 //BA.debugLineNum = 26;BA.debugLine="Private cachedTrackIndexDirty As Boolean";
mediacache._cachedtrackindexdirty = RemoteObject.createImmutable(false);__ref.setField("_cachedtrackindexdirty",mediacache._cachedtrackindexdirty);
 //BA.debugLineNum = 27;BA.debugLine="Private playbackTempTrackIds As Map";
mediacache._playbacktemptrackids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_playbacktemptrackids",mediacache._playbacktemptrackids);
 //BA.debugLineNum = 28;BA.debugLine="Private cacheAuditInProgress As Boolean";
mediacache._cacheauditinprogress = RemoteObject.createImmutable(false);__ref.setField("_cacheauditinprogress",mediacache._cacheauditinprogress);
 //BA.debugLineNum = 29;BA.debugLine="Private cacheAuditPendingTypes As List";
mediacache._cacheauditpendingtypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_cacheauditpendingtypes",mediacache._cacheauditpendingtypes);
 //BA.debugLineNum = 30;BA.debugLine="Private cacheAuditCurrentType As String";
mediacache._cacheauditcurrenttype = RemoteObject.createImmutable("");__ref.setField("_cacheauditcurrenttype",mediacache._cacheauditcurrenttype);
 //BA.debugLineNum = 31;BA.debugLine="Private cacheAuditCurrentFileNames As List";
mediacache._cacheauditcurrentfilenames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_cacheauditcurrentfilenames",mediacache._cacheauditcurrentfilenames);
 //BA.debugLineNum = 32;BA.debugLine="Private cacheAuditCurrentPosition As Int";
mediacache._cacheauditcurrentposition = RemoteObject.createImmutable(0);__ref.setField("_cacheauditcurrentposition",mediacache._cacheauditcurrentposition);
 //BA.debugLineNum = 33;BA.debugLine="Private cacheAuditSeenIds As Map";
mediacache._cacheauditseenids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cacheauditseenids",mediacache._cacheauditseenids);
 //BA.debugLineNum = 34;BA.debugLine="Private cacheAuditAdIndexChanged As Boolean";
mediacache._cacheauditadindexchanged = RemoteObject.createImmutable(false);__ref.setField("_cacheauditadindexchanged",mediacache._cacheauditadindexchanged);
 //BA.debugLineNum = 35;BA.debugLine="Private cacheAuditTrackIndexChanged As Boolean";
mediacache._cacheaudittrackindexchanged = RemoteObject.createImmutable(false);__ref.setField("_cacheaudittrackindexchanged",mediacache._cacheaudittrackindexchanged);
 //BA.debugLineNum = 36;BA.debugLine="Private cacheAuditAddedCount As Int";
mediacache._cacheauditaddedcount = RemoteObject.createImmutable(0);__ref.setField("_cacheauditaddedcount",mediacache._cacheauditaddedcount);
 //BA.debugLineNum = 37;BA.debugLine="Private cacheAuditRemovedCount As Int";
mediacache._cacheauditremovedcount = RemoteObject.createImmutable(0);__ref.setField("_cacheauditremovedcount",mediacache._cacheauditremovedcount);
 //BA.debugLineNum = 38;BA.debugLine="Private cacheAuditTempDeletedCount As Int";
mediacache._cacheaudittempdeletedcount = RemoteObject.createImmutable(0);__ref.setField("_cacheaudittempdeletedcount",mediacache._cacheaudittempdeletedcount);
 //BA.debugLineNum = 39;BA.debugLine="Private recentMediaNetworkFailure As Boolean";
mediacache._recentmedianetworkfailure = RemoteObject.createImmutable(false);__ref.setField("_recentmedianetworkfailure",mediacache._recentmedianetworkfailure);
 //BA.debugLineNum = 40;BA.debugLine="Private pruneLastCacheBytes As Long";
mediacache._prunelastcachebytes = RemoteObject.createImmutable(0L);__ref.setField("_prunelastcachebytes",mediacache._prunelastcachebytes);
 //BA.debugLineNum = 41;BA.debugLine="Private pruneLastFreeBytes As Long";
mediacache._prunelastfreebytes = RemoteObject.createImmutable(0L);__ref.setField("_prunelastfreebytes",mediacache._prunelastfreebytes);
 //BA.debugLineNum = 42;BA.debugLine="Private cachedTrackCount As Int";
mediacache._cachedtrackcount = RemoteObject.createImmutable(0);__ref.setField("_cachedtrackcount",mediacache._cachedtrackcount);
 //BA.debugLineNum = 43;BA.debugLine="Private cachedAdCount As Int";
mediacache._cachedadcount = RemoteObject.createImmutable(0);__ref.setField("_cachedadcount",mediacache._cachedadcount);
 //BA.debugLineNum = 44;BA.debugLine="Private cachedTrackBytes As Long";
mediacache._cachedtrackbytes = RemoteObject.createImmutable(0L);__ref.setField("_cachedtrackbytes",mediacache._cachedtrackbytes);
 //BA.debugLineNum = 45;BA.debugLine="Private cachedAdBytes As Long";
mediacache._cachedadbytes = RemoteObject.createImmutable(0L);__ref.setField("_cachedadbytes",mediacache._cachedadbytes);
 //BA.debugLineNum = 46;BA.debugLine="Private cachedTrackPlaylistStats As Map";
mediacache._cachedtrackplayliststats = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cachedtrackplayliststats",mediacache._cachedtrackplayliststats);
 //BA.debugLineNum = 47;BA.debugLine="Private cacheAuditListingInProgress As Boolean";
mediacache._cacheauditlistinginprogress = RemoteObject.createImmutable(false);__ref.setField("_cacheauditlistinginprogress",mediacache._cacheauditlistinginprogress);
 //BA.debugLineNum = 48;BA.debugLine="Private cacheAuditListingDir As String";
mediacache._cacheauditlistingdir = RemoteObject.createImmutable("");__ref.setField("_cacheauditlistingdir",mediacache._cacheauditlistingdir);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleanupemptytrackplaylistdir(RemoteObject __ref,RemoteObject _relativefilename) throws Exception{
try {
		Debug.PushSubsStack("CleanupEmptyTrackPlaylistDir (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1625);
if (RapidSub.canDelegate("cleanupemptytrackplaylistdir")) { return __ref.runUserSub(false, "mediacache","cleanupemptytrackplaylistdir", __ref, _relativefilename);}
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _playlistdir = RemoteObject.createImmutable("");
RemoteObject _listed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("relativeFileName", _relativefilename);
 BA.debugLineNum = 1625;BA.debugLine="Private Sub CleanupEmptyTrackPlaylistDir(relativeF";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1626;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFromT";
Debug.ShouldStop(33554432);
_playlistid = __ref.runClassMethod (b4j.example.mediacache.class, "_extractplaylistidfromtrackrelativepath" /*RemoteObject*/ ,(Object)(_relativefilename));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 1627;BA.debugLine="If playlistId = \"\" Then Return";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1628;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 1629;BA.debugLine="Dim playlistDir As String = File.Combine(GetTrac";
Debug.ShouldStop(268435456);
_playlistdir = mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_playlistid));Debug.locals.put("playlistDir", _playlistdir);Debug.locals.put("playlistDir", _playlistdir);
 BA.debugLineNum = 1630;BA.debugLine="If DirectoryExists(playlistDir) = False Then Ret";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_directoryexists" /*RemoteObject*/ ,(Object)(_playlistdir)),mediacache.__c.getField(true,"False"))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1631;BA.debugLine="Dim listed As List = File.ListFiles(playlistDir)";
Debug.ShouldStop(1073741824);
_listed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listed = mediacache.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_playlistdir));Debug.locals.put("listed", _listed);Debug.locals.put("listed", _listed);
 BA.debugLineNum = 1632;BA.debugLine="If listed.IsInitialized = False Or listed.Size =";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_listed.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_listed.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1633;BA.debugLine="File.Delete(playlistDir, \"\")";
Debug.ShouldStop(1);
mediacache.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_playlistdir),(Object)(RemoteObject.createImmutable("")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 1636;BA.debugLine="Trace(\"Не удалось очистить пустую папку плейлист";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось очистить пустую папку плейлиста. playlistId="),_playlistid,RemoteObject.createImmutable(", message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 1638;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cleanuplegacytracksubdirs(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CleanupLegacyTrackSubdirs (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,897);
if (RapidSub.canDelegate("cleanuplegacytracksubdirs")) { return __ref.runUserSub(false, "mediacache","cleanuplegacytracksubdirs", __ref);}
RemoteObject _listed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _name = RemoteObject.createImmutable("");
 BA.debugLineNum = 897;BA.debugLine="Private Sub CleanupLegacyTrackSubdirs";
Debug.ShouldStop(1);
 BA.debugLineNum = 898;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 899;BA.debugLine="Dim listed As List = File.ListFiles(GetTracksDir";
Debug.ShouldStop(4);
_listed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listed = mediacache.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )));Debug.locals.put("listed", _listed);Debug.locals.put("listed", _listed);
 BA.debugLineNum = 900;BA.debugLine="If listed.IsInitialized = False Then Return";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_listed.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 901;BA.debugLine="For Each name As String In listed";
Debug.ShouldStop(16);
{
final RemoteObject group4 = _listed;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_name = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("name", _name);
Debug.locals.put("name", _name);
 BA.debugLineNum = 902;BA.debugLine="If name = \"\" Then Continue";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_name,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 903;BA.debugLine="If File.IsDirectory(GetTracksDir, name) = False";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",mediacache.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_name)),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 904;BA.debugLine="DeleteTrackSubdirRecursive(File.Combine(GetTrac";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletetracksubdirrecursive" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_name))));
 }
}Debug.locals.put("name", _name);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e10.toString()); BA.debugLineNum = 907;BA.debugLine="Trace(\"Не удалось очистить legacy папки кэша тре";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось очистить legacy папки кэша треков. message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 909;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cleanupplaybacktempfiles(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CleanupPlaybackTempFiles (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("cleanupplaybacktempfiles")) { return __ref.runUserSub(false, "mediacache","cleanupplaybacktempfiles", __ref);}
 BA.debugLineNum = 168;BA.debugLine="Public Sub CleanupPlaybackTempFiles";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="DeleteFileIfExists(File.DirTemp, PRIMARY_TEMP_TRA";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(__ref.getField(true,"_primary_temp_track_file" /*RemoteObject*/ )));
 BA.debugLineNum = 170;BA.debugLine="DeleteFileIfExists(File.DirTemp, SECONDARY_TEMP_T";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(__ref.getField(true,"_secondary_temp_track_file" /*RemoteObject*/ )));
 BA.debugLineNum = 171;BA.debugLine="playbackTempTrackIds.Clear";
Debug.ShouldStop(1024);
__ref.getField(false,"_playbacktemptrackids" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _comparetrackprunecandidates(RemoteObject __ref,RemoteObject _leftitem,RemoteObject _rightitem) throws Exception{
try {
		Debug.PushSubsStack("CompareTrackPruneCandidates (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1654);
if (RapidSub.canDelegate("comparetrackprunecandidates")) { return __ref.runUserSub(false, "mediacache","comparetrackprunecandidates", __ref, _leftitem, _rightitem);}
RemoteObject _leftrelevant = RemoteObject.createImmutable(false);
RemoteObject _rightrelevant = RemoteObject.createImmutable(false);
RemoteObject _leftlastused = RemoteObject.createImmutable(0L);
RemoteObject _rightlastused = RemoteObject.createImmutable(0L);
RemoteObject _leftsaved = RemoteObject.createImmutable(0L);
RemoteObject _rightsaved = RemoteObject.createImmutable(0L);
Debug.locals.put("leftItem", _leftitem);
Debug.locals.put("rightItem", _rightitem);
 BA.debugLineNum = 1654;BA.debugLine="Private Sub CompareTrackPruneCandidates(leftItem A";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1655;BA.debugLine="Dim leftRelevant As Boolean = leftItem.GetDefault";
Debug.ShouldStop(4194304);
_leftrelevant = BA.ObjectToBoolean(_leftitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("is_relevant"))),(Object)((mediacache.__c.getField(true,"False")))));Debug.locals.put("leftRelevant", _leftrelevant);Debug.locals.put("leftRelevant", _leftrelevant);
 BA.debugLineNum = 1656;BA.debugLine="Dim rightRelevant As Boolean = rightItem.GetDefau";
Debug.ShouldStop(8388608);
_rightrelevant = BA.ObjectToBoolean(_rightitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("is_relevant"))),(Object)((mediacache.__c.getField(true,"False")))));Debug.locals.put("rightRelevant", _rightrelevant);Debug.locals.put("rightRelevant", _rightrelevant);
 BA.debugLineNum = 1657;BA.debugLine="If leftRelevant <> rightRelevant Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("!",_leftrelevant,_rightrelevant)) { 
 BA.debugLineNum = 1658;BA.debugLine="If leftRelevant = False Then Return -1 Else Retu";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_leftrelevant,mediacache.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));}
else {
if (true) return BA.numberCast(int.class, 1);};
 };
 BA.debugLineNum = 1660;BA.debugLine="Dim leftLastUsed As Long = leftItem.GetDefault(\"l";
Debug.ShouldStop(134217728);
_leftlastused = BA.numberCast(long.class, _leftitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("leftLastUsed", _leftlastused);Debug.locals.put("leftLastUsed", _leftlastused);
 BA.debugLineNum = 1661;BA.debugLine="Dim rightLastUsed As Long = rightItem.GetDefault(";
Debug.ShouldStop(268435456);
_rightlastused = BA.numberCast(long.class, _rightitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("rightLastUsed", _rightlastused);Debug.locals.put("rightLastUsed", _rightlastused);
 BA.debugLineNum = 1662;BA.debugLine="If leftLastUsed <> rightLastUsed Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_leftlastused,_rightlastused)) { 
 BA.debugLineNum = 1663;BA.debugLine="If leftLastUsed < rightLastUsed Then Return -1 E";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("<",_leftlastused,_rightlastused)) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));}
else {
if (true) return BA.numberCast(int.class, 1);};
 };
 BA.debugLineNum = 1665;BA.debugLine="Dim leftSaved As Long = leftItem.GetDefault(\"save";
Debug.ShouldStop(1);
_leftsaved = BA.numberCast(long.class, _leftitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("leftSaved", _leftsaved);Debug.locals.put("leftSaved", _leftsaved);
 BA.debugLineNum = 1666;BA.debugLine="Dim rightSaved As Long = rightItem.GetDefault(\"sa";
Debug.ShouldStop(2);
_rightsaved = BA.numberCast(long.class, _rightitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("rightSaved", _rightsaved);Debug.locals.put("rightSaved", _rightsaved);
 BA.debugLineNum = 1667;BA.debugLine="If leftSaved <> rightSaved Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",_leftsaved,_rightsaved)) { 
 BA.debugLineNum = 1668;BA.debugLine="If leftSaved < rightSaved Then Return -1 Else Re";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",_leftsaved,_rightsaved)) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));}
else {
if (true) return BA.numberCast(int.class, 1);};
 };
 BA.debugLineNum = 1670;BA.debugLine="Return 0";
Debug.ShouldStop(32);
if (true) return BA.numberCast(int.class, 0);
 BA.debugLineNum = 1671;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _consumerecentmedianetworkfailure(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConsumeRecentMediaNetworkFailure (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,349);
if (RapidSub.canDelegate("consumerecentmedianetworkfailure")) { return __ref.runUserSub(false, "mediacache","consumerecentmedianetworkfailure", __ref);}
RemoteObject _value = RemoteObject.createImmutable(false);
 BA.debugLineNum = 349;BA.debugLine="Public Sub ConsumeRecentMediaNetworkFailure As Boo";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 350;BA.debugLine="Dim value As Boolean = recentMediaNetworkFailure";
Debug.ShouldStop(536870912);
_value = __ref.getField(true,"_recentmedianetworkfailure" /*RemoteObject*/ );Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 351;BA.debugLine="recentMediaNetworkFailure = False";
Debug.ShouldStop(1073741824);
__ref.setField ("_recentmedianetworkfailure" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 352;BA.debugLine="Return value";
Debug.ShouldStop(-2147483648);
if (true) return _value;
 BA.debugLineNum = 353;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _counttrackfilesondisk(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CountTrackFilesOnDisk (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,260);
if (RapidSub.canDelegate("counttrackfilesondisk")) { return __ref.runUserSub(false, "mediacache","counttrackfilesondisk", __ref);}
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _listedfiles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filename = RemoteObject.createImmutable("");
 BA.debugLineNum = 260;BA.debugLine="Private Sub CountTrackFilesOnDisk As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 261;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_directoryexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ ))),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 262;BA.debugLine="Dim count As Int = 0";
Debug.ShouldStop(32);
_count = BA.numberCast(int.class, 0);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 263;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 264;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRec";
Debug.ShouldStop(128);
_listedfiles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listedfiles = __ref.runClassMethod (b4j.example.mediacache.class, "_listtrackcachefilesrecursive" /*RemoteObject*/ );Debug.locals.put("listedFiles", _listedfiles);Debug.locals.put("listedFiles", _listedfiles);
 BA.debugLineNum = 265;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_listedfiles.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 266;BA.debugLine="For Each fileName As String In listedFiles";
Debug.ShouldStop(512);
{
final RemoteObject group6 = _listedfiles;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_filename = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("fileName", _filename);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 267;BA.debugLine="If fileName = \"\" Then Continue";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 268;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
Debug.ShouldStop(2048);
if (_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".tmp"))).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 269;BA.debugLine="count = count + 1";
Debug.ShouldStop(4096);
_count = RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count", _count);
 }
}Debug.locals.put("fileName", _filename);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 272;BA.debugLine="Trace(\"Не удалось посчитать track файлы на диске";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось посчитать track файлы на диске. message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 274;BA.debugLine="Return count";
Debug.ShouldStop(131072);
if (true) return _count;
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinitializedlist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateInitializedList (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1813);
if (RapidSub.canDelegate("createinitializedlist")) { return __ref.runUserSub(false, "mediacache","createinitializedlist", __ref);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 1813;BA.debugLine="Private Sub CreateInitializedList As List";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1814;BA.debugLine="Dim items As List";
Debug.ShouldStop(2097152);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("items", _items);
 BA.debugLineNum = 1815;BA.debugLine="items.Initialize";
Debug.ShouldStop(4194304);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 1816;BA.debugLine="Return items";
Debug.ShouldStop(8388608);
if (true) return _items;
 BA.debugLineNum = 1817;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtrackidset(RemoteObject __ref,RemoteObject _trackids) throws Exception{
try {
		Debug.PushSubsStack("CreateTrackIdSet (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1673);
if (RapidSub.canDelegate("createtrackidset")) { return __ref.runUserSub(false, "mediacache","createtrackidset", __ref, _trackids);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackid = RemoteObject.createImmutable("");
Debug.locals.put("trackIds", _trackids);
 BA.debugLineNum = 1673;BA.debugLine="Private Sub CreateTrackIdSet(trackIds As List) As";
Debug.ShouldStop(256);
 BA.debugLineNum = 1674;BA.debugLine="Dim result As Map";
Debug.ShouldStop(512);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 1675;BA.debugLine="result.Initialize";
Debug.ShouldStop(1024);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 1676;BA.debugLine="If trackIds.IsInitialized = False Then Return res";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_trackids.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return _result;};
 BA.debugLineNum = 1677;BA.debugLine="For Each trackId As String In trackIds";
Debug.ShouldStop(4096);
{
final RemoteObject group4 = _trackids;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_trackid = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("trackId", _trackid);
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 1678;BA.debugLine="If trackId <> \"\" Then result.Put(trackId, True)";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",_trackid,BA.ObjectToString(""))) { 
_result.runVoidMethod ("Put",(Object)((_trackid)),(Object)((mediacache.__c.getField(true,"True"))));};
 }
}Debug.locals.put("trackId", _trackid);
;
 BA.debugLineNum = 1680;BA.debugLine="Return result";
Debug.ShouldStop(32768);
if (true) return _result;
 BA.debugLineNum = 1681;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deletefileifexists(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DeleteFileIfExists (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,971);
if (RapidSub.canDelegate("deletefileifexists")) { return __ref.runUserSub(false, "mediacache","deletefileifexists", __ref, _dir, _filename);}
RemoteObject _filedir = RemoteObject.createImmutable("");
RemoteObject _leafname = RemoteObject.createImmutable("");
Debug.locals.put("dir", _dir);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 971;BA.debugLine="Private Sub DeleteFileIfExists(dir As String, file";
Debug.ShouldStop(1024);
 BA.debugLineNum = 972;BA.debugLine="If fileName = \"\" Then Return";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 973;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 974;BA.debugLine="Dim fileDir As String = ResolveRelativeParentDir";
Debug.ShouldStop(8192);
_filedir = __ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativeparentdir" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename));Debug.locals.put("fileDir", _filedir);Debug.locals.put("fileDir", _filedir);
 BA.debugLineNum = 975;BA.debugLine="Dim leafName As String = ResolveRelativeLeafName";
Debug.ShouldStop(16384);
_leafname = __ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativeleafname" /*RemoteObject*/ ,(Object)(_filename));Debug.locals.put("leafName", _leafname);Debug.locals.put("leafName", _leafname);
 BA.debugLineNum = 976;BA.debugLine="If File.Exists(fileDir, leafName) Then File.Dele";
Debug.ShouldStop(32768);
if (mediacache.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_filedir),(Object)(_leafname)).<Boolean>get().booleanValue()) { 
mediacache.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_filedir),(Object)(_leafname));};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 978;BA.debugLine="Trace(\"ошибка кэша context=file_delete message=\"";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("ошибка кэша context=file_delete message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 980;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deletetracksubdirrecursive(RemoteObject __ref,RemoteObject _path) throws Exception{
try {
		Debug.PushSubsStack("DeleteTrackSubdirRecursive (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,911);
if (RapidSub.canDelegate("deletetracksubdirrecursive")) { return __ref.runUserSub(false, "mediacache","deletetracksubdirrecursive", __ref, _path);}
RemoteObject _listed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _name = RemoteObject.createImmutable("");
Debug.locals.put("path", _path);
 BA.debugLineNum = 911;BA.debugLine="Private Sub DeleteTrackSubdirRecursive(path As Str";
Debug.ShouldStop(16384);
 BA.debugLineNum = 912;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 913;BA.debugLine="If DirectoryExists(path) = False Then Return";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_directoryexists" /*RemoteObject*/ ,(Object)(_path)),mediacache.__c.getField(true,"False"))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 914;BA.debugLine="Dim listed As List = File.ListFiles(path)";
Debug.ShouldStop(131072);
_listed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listed = mediacache.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_path));Debug.locals.put("listed", _listed);Debug.locals.put("listed", _listed);
 BA.debugLineNum = 915;BA.debugLine="If listed.IsInitialized Then";
Debug.ShouldStop(262144);
if (_listed.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 916;BA.debugLine="For Each name As String In listed";
Debug.ShouldStop(524288);
{
final RemoteObject group5 = _listed;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_name = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("name", _name);
Debug.locals.put("name", _name);
 BA.debugLineNum = 917;BA.debugLine="If name = \"\" Then Continue";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_name,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 918;BA.debugLine="If File.IsDirectory(path, name) Then";
Debug.ShouldStop(2097152);
if (mediacache.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_path),(Object)(_name)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 919;BA.debugLine="DeleteTrackSubdirRecursive(File.Combine(path,";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletetracksubdirrecursive" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_path),(Object)(_name))));
 }else {
 BA.debugLineNum = 921;BA.debugLine="File.Delete(path, name)";
Debug.ShouldStop(16777216);
mediacache.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_path),(Object)(_name));
 };
 }
}Debug.locals.put("name", _name);
;
 };
 BA.debugLineNum = 925;BA.debugLine="File.Delete(path, \"\")";
Debug.ShouldStop(268435456);
mediacache.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_path),(Object)(RemoteObject.createImmutable("")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 927;BA.debugLine="Trace(\"Не удалось удалить legacy папку кэша трек";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось удалить legacy папку кэша треков. dir="),_path,RemoteObject.createImmutable(", message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 929;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _directoryexists(RemoteObject __ref,RemoteObject _path) throws Exception{
try {
		Debug.PushSubsStack("DirectoryExists (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1137);
if (RapidSub.canDelegate("directoryexists")) { return __ref.runUserSub(false, "mediacache","directoryexists", __ref, _path);}
RemoteObject _fileobject = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("path", _path);
 BA.debugLineNum = 1137;BA.debugLine="Private Sub DirectoryExists(path As String) As Boo";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1138;BA.debugLine="If path = \"\" Then Return False";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_path,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 1139;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 1140;BA.debugLine="Dim fileObject As JavaObject";
Debug.ShouldStop(524288);
_fileobject = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("fileObject", _fileobject);
 BA.debugLineNum = 1141;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
Debug.ShouldStop(1048576);
_fileobject.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_path)})));
 BA.debugLineNum = 1142;BA.debugLine="If fileObject.RunMethod(\"exists\", Null) = False";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_fileobject.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("exists")),(Object)((mediacache.__c.getField(false,"Null")))),(mediacache.__c.getField(true,"False")))) { 
Debug.CheckDeviceExceptions();if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 1143;BA.debugLine="Return fileObject.RunMethod(\"isDirectory\", Null)";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToBoolean(_fileobject.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isDirectory")),(Object)((mediacache.__c.getField(false,"Null")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 1145;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) return mediacache.__c.getField(true,"False");
 };
 BA.debugLineNum = 1147;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _elapsedms(RemoteObject __ref,RemoteObject _startedat) throws Exception{
try {
		Debug.PushSubsStack("ElapsedMs (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1127);
if (RapidSub.canDelegate("elapsedms")) { return __ref.runUserSub(false, "mediacache","elapsedms", __ref, _startedat);}
Debug.locals.put("startedAt", _startedat);
 BA.debugLineNum = 1127;BA.debugLine="Private Sub ElapsedMs(startedAt As Long) As Long";
Debug.ShouldStop(64);
 BA.debugLineNum = 1128;BA.debugLine="Return Max(0, DateTime.Now - startedAt)";
Debug.ShouldStop(128);
if (true) return BA.numberCast(long.class, mediacache.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"),_startedat}, "-",1, 2)))));
 BA.debugLineNum = 1129;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("EnsureAdsCached (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,111);
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
RemoteObject _actualadids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _downloadedcount = RemoteObject.createImmutable(0);
RemoteObject _failedcount = RemoteObject.createImmutable(0);
RemoteObject _adobject = RemoteObject.declareNull("Object");
RemoteObject _ad = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _adid = RemoteObject.createImmutable("");
RemoteObject _downloaded = RemoteObject.createImmutable(false);
RemoteObject _removedcount = RemoteObject.createImmutable(0);
RemoteObject group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureAdsCached (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,111);
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
 BA.debugLineNum = 112;BA.debugLine="FlushPendingIndexSaves";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_flushpendingindexsaves" /*RemoteObject*/ );
 BA.debugLineNum = 113;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 114;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 115;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
Debug.ShouldStop(262144);
_ads = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ads = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ads"))),(Object)(parent.__c.getField(false,"Null"))));Debug.locals.put("ads", _ads);Debug.locals.put("ads", _ads);
 BA.debugLineNum = 116;BA.debugLine="Dim cachedAdIndex As Map = GetCachedAdIndex";
Debug.ShouldStop(524288);
parent._cachedadindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
parent._cachedadindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getcachedadindex" /*RemoteObject*/ );__ref.setField("_cachedadindex",parent._cachedadindex);
 BA.debugLineNum = 117;BA.debugLine="Dim actualAdIds As Map";
Debug.ShouldStop(1048576);
_actualadids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("actualAdIds", _actualadids);
 BA.debugLineNum = 118;BA.debugLine="actualAdIds.Initialize";
Debug.ShouldStop(2097152);
_actualadids.runVoidMethod ("Initialize");
 BA.debugLineNum = 119;BA.debugLine="Dim downloadedCount As Int = 0";
Debug.ShouldStop(4194304);
_downloadedcount = BA.numberCast(int.class, 0);Debug.locals.put("downloadedCount", _downloadedcount);Debug.locals.put("downloadedCount", _downloadedcount);
 BA.debugLineNum = 120;BA.debugLine="Dim failedCount As Int = 0";
Debug.ShouldStop(8388608);
_failedcount = BA.numberCast(int.class, 0);Debug.locals.put("failedCount", _failedcount);Debug.locals.put("failedCount", _failedcount);
 BA.debugLineNum = 121;BA.debugLine="If ads.IsInitialized Then";
Debug.ShouldStop(16777216);
if (true) break;

case 13:
//if
this.state = 36;
if (_ads.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 122;BA.debugLine="For Each adObject As Object In ads";
Debug.ShouldStop(33554432);
if (true) break;

case 16:
//for
this.state = 35;
group11 = _ads;
index11 = 0;
groupLen11 = group11.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("adObject", _adobject);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 35;
if (index11 < groupLen11) {
this.state = 18;
_adobject = group11.runMethod(false,"Get",index11);Debug.locals.put("adObject", _adobject);}
if (true) break;

case 38:
//C
this.state = 37;
index11++;
Debug.locals.put("adObject", _adobject);
if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 123;BA.debugLine="If adObject Is Map Then";
Debug.ShouldStop(67108864);
if (true) break;

case 19:
//if
this.state = 34;
if (RemoteObject.solveBoolean("i",_adobject, RemoteObject.createImmutable("java.util.Map"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 124;BA.debugLine="Dim ad As Map = adObject";
Debug.ShouldStop(134217728);
_ad = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ad = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _adobject);Debug.locals.put("ad", _ad);Debug.locals.put("ad", _ad);
 BA.debugLineNum = 125;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
Debug.ShouldStop(268435456);
_adid = BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("adId", _adid);Debug.locals.put("adId", _adid);
 BA.debugLineNum = 126;BA.debugLine="If adId = \"\" Then Continue";
Debug.ShouldStop(536870912);
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
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
 BA.debugLineNum = 127;BA.debugLine="actualAdIds.Put(adId, True)";
Debug.ShouldStop(1073741824);
_actualadids.runVoidMethod ("Put",(Object)((_adid)),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 128;BA.debugLine="Wait For (EnsureSingleAdCached(ad, cachedAdInd";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensureadscached"), __ref.runClassMethod (b4j.example.mediacache.class, "_ensuresingleadcached" /*RemoteObject*/ ,(Object)(_ad),(Object)(__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ))));
this.state = 39;
return;
case 39:
//C
this.state = 28;
_downloaded = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("downloaded", _downloaded);
;
 BA.debugLineNum = 129;BA.debugLine="If downloaded Then";
Debug.ShouldStop(1);
if (true) break;

case 28:
//if
this.state = 33;
if (_downloaded.<Boolean>get().booleanValue()) { 
this.state = 30;
}else 
{ BA.debugLineNum = 131;BA.debugLine="Else If IsAdCached(adId) = False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_isadcached" /*RemoteObject*/ ,(Object)(_adid)),parent.__c.getField(true,"False"))) { 
this.state = 32;
}}
if (true) break;

case 30:
//C
this.state = 33;
 BA.debugLineNum = 130;BA.debugLine="downloadedCount = downloadedCount + 1";
Debug.ShouldStop(2);
_downloadedcount = RemoteObject.solve(new RemoteObject[] {_downloadedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("downloadedCount", _downloadedcount);
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 132;BA.debugLine="failedCount = failedCount + 1";
Debug.ShouldStop(8);
_failedcount = RemoteObject.solve(new RemoteObject[] {_failedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("failedCount", _failedcount);
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
Debug.locals.put("adObject", _adobject);
;
 if (true) break;

case 36:
//C
this.state = -1;
;
 BA.debugLineNum = 137;BA.debugLine="Dim removedCount As Int = PruneMissingAds(cachedA";
Debug.ShouldStop(256);
_removedcount = __ref.runClassMethod (b4j.example.mediacache.class, "_prunemissingads" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_cachedadindex" /*RemoteObject*/ )),(Object)(_actualadids));Debug.locals.put("removedCount", _removedcount);Debug.locals.put("removedCount", _removedcount);
 BA.debugLineNum = 138;BA.debugLine="SaveAdIndex";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );
 BA.debugLineNum = 139;BA.debugLine="Trace(\"ad cache sync done downloaded=\" & download";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("ad cache sync done downloaded="),_downloadedcount,RemoteObject.createImmutable(" failed="),_failedcount,RemoteObject.createImmutable(" removed="),_removedcount,RemoteObject.createImmutable(" actual="),__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 140;BA.debugLine="Return downloadedCount > 0 Or removedCount > 0";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((RemoteObject.solveBoolean(">",_downloadedcount,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_removedcount,BA.numberCast(double.class, 0)))));return;};
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("EnsureDirectory (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1131);
if (RapidSub.canDelegate("ensuredirectory")) { return __ref.runUserSub(false, "mediacache","ensuredirectory", __ref, _path);}
RemoteObject _fileobject = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("path", _path);
 BA.debugLineNum = 1131;BA.debugLine="Private Sub EnsureDirectory(path As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1132;BA.debugLine="Dim fileObject As JavaObject";
Debug.ShouldStop(2048);
_fileobject = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("fileObject", _fileobject);
 BA.debugLineNum = 1133;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
Debug.ShouldStop(4096);
_fileobject.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_path)})));
 BA.debugLineNum = 1134;BA.debugLine="fileObject.RunMethod(\"mkdirs\", Null)";
Debug.ShouldStop(8192);
_fileobject.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("mkdirs")),(Object)((mediacache.__c.getField(false,"Null"))));
 BA.debugLineNum = 1135;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("EnsureSingleAdCached (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,437);
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
RemoteObject _outstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureSingleAdCached (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,437);
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
 BA.debugLineNum = 438;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
Debug.ShouldStop(2097152);
_adid = BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("adId", _adid);Debug.locals.put("adId", _adid);
 BA.debugLineNum = 439;BA.debugLine="If adId = \"\" Then Return False";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 440;BA.debugLine="If TryRestoreExistingCachedMedia(\"ad\", adId, ad,";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 441;BA.debugLine="If IsAdCached(adId) Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 442;BA.debugLine="UpdateAdIndex(ad, adIndex)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_ad),(Object)(_adindex));
 BA.debugLineNum = 443;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 445;BA.debugLine="Dim adUrl As String = BuildAdUrl(adId)";
Debug.ShouldStop(268435456);
_adurl = __ref.runClassMethod (b4j.example.mediacache.class, "_buildadurl" /*RemoteObject*/ ,(Object)(_adid));Debug.locals.put("adUrl", _adurl);Debug.locals.put("adUrl", _adurl);
 BA.debugLineNum = 446;BA.debugLine="If adUrl = \"\" Then Return False";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 447;BA.debugLine="Dim downloadStartedAt As Long = DateTime.Now";
Debug.ShouldStop(1073741824);
_downloadstartedat = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("downloadStartedAt", _downloadstartedat);Debug.locals.put("downloadStartedAt", _downloadstartedat);
 BA.debugLineNum = 448;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(-2147483648);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 449;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(1);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 450;BA.debugLine="Trace(\"Скачивание рекламы в кэш. id=\" & adId & \",";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Скачивание рекламы в кэш. id="),_adid,RemoteObject.createImmutable(", url="),_adurl)));
 BA.debugLineNum = 451;BA.debugLine="j.Download(adUrl)";
Debug.ShouldStop(4);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_adurl));
 BA.debugLineNum = 452;BA.debugLine="j.GetRequest.Timeout = AD_DOWNLOAD_TIMEOUT_MS";
Debug.ShouldStop(8);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",__ref.getField(true,"_ad_download_timeout_ms" /*RemoteObject*/ ));
 BA.debugLineNum = 453;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensuresingleadcached"), (_j));
this.state = 48;
return;
case 48:
//C
this.state = 23;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 454;BA.debugLine="If j.Success Then";
Debug.ShouldStop(32);
if (true) break;

case 23:
//if
this.state = 47;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 25;
}else {
this.state = 40;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 455;BA.debugLine="Try";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 456;BA.debugLine="EnsureDirectory(GetAdsDir)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )));
 BA.debugLineNum = 457;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
Debug.ShouldStop(256);
_tempfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_adid));Debug.locals.put("tempFileName", _tempfilename);Debug.locals.put("tempFileName", _tempfilename);
 BA.debugLineNum = 458;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 459;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
Debug.ShouldStop(1024);
_outstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_outstream = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("outStream", _outstream);Debug.locals.put("outStream", _outstream);
 BA.debugLineNum = 460;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
Debug.ShouldStop(2048);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (b4j.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_outstream.getObject())));
 BA.debugLineNum = 461;BA.debugLine="outStream.Close";
Debug.ShouldStop(4096);
_outstream.runVoidMethod ("Close");
 BA.debugLineNum = 462;BA.debugLine="If IsCachedFileUsable(GetAdsDir, tempFileName)";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 463;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 464;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить рекламу в кэш. id="),_adid,RemoteObject.createImmutable(", message=empty temp file"))));
 BA.debugLineNum = 465;BA.debugLine="j.Release";
Debug.ShouldStop(65536);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 466;BA.debugLine="Return False";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 468;BA.debugLine="If ReplaceCacheFile(GetAdsDir, tempFileName, ad";
Debug.ShouldStop(524288);

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_replacecachefile" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename),(Object)(_adid)),parent.__c.getField(true,"False"))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 469;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_tempfilename));
 BA.debugLineNum = 470;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить рекламу в кэш. id="),_adid,RemoteObject.createImmutable(", message=rename failed"))));
 BA.debugLineNum = 471;BA.debugLine="j.Release";
Debug.ShouldStop(4194304);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 472;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 35:
//C
this.state = 38;
;
 BA.debugLineNum = 474;BA.debugLine="UpdateAdIndex(ad, adIndex)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_ad),(Object)(_adindex));
 BA.debugLineNum = 475;BA.debugLine="SaveAdIndex";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );
 BA.debugLineNum = 476;BA.debugLine="recentMediaNetworkFailure = False";
Debug.ShouldStop(134217728);
__ref.setField ("_recentmedianetworkfailure" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 477;BA.debugLine="Trace(\"Реклама сохранена в кэш. id=\" & adId & \"";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Реклама сохранена в кэш. id="),_adid,RemoteObject.createImmutable(", totalElapsedMs="),__ref.runClassMethod (b4j.example.mediacache.class, "_elapsedms" /*RemoteObject*/ ,(Object)(_downloadstartedat)))));
 BA.debugLineNum = 478;BA.debugLine="j.Release";
Debug.ShouldStop(536870912);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 479;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 0;
 BA.debugLineNum = 481;BA.debugLine="DeleteFileIfExists(GetAdsDir, BuildTempCacheFil";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_adid))));
 BA.debugLineNum = 482;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=\"";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить рекламу в кэш. id="),_adid,RemoteObject.createImmutable(", message="),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
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
 BA.debugLineNum = 485;BA.debugLine="If IsMediaNetworkFailure(j.ErrorMessage) Then re";
Debug.ShouldStop(16);
if (true) break;

case 41:
//if
this.state = 46;
if (__ref.runClassMethod (b4j.example.mediacache.class, "_ismedianetworkfailure" /*RemoteObject*/ ,(Object)(_j.getField(true,"_errormessage" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 43;
;}if (true) break;

case 43:
//C
this.state = 46;
__ref.setField ("_recentmedianetworkfailure" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
if (true) break;

case 46:
//C
this.state = 47;
;
 BA.debugLineNum = 486;BA.debugLine="Trace(\"Не удалось скачать рекламу. id=\" & adId &";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось скачать рекламу. id="),_adid,RemoteObject.createImmutable(", message="),_j.getField(true,"_errormessage" /*RemoteObject*/ ))));
 if (true) break;

case 47:
//C
this.state = -1;
;
 BA.debugLineNum = 488;BA.debugLine="j.Release";
Debug.ShouldStop(128);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 489;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 490;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("EnsureSingleTrackCached (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,492);
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
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _trackurl = RemoteObject.createImmutable("");
RemoteObject _downloadstartedat = RemoteObject.createImmutable(0L);
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _trackdir = RemoteObject.createImmutable("");
RemoteObject _tempfilename = RemoteObject.createImmutable("");
RemoteObject _outstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _failedplaylistid = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureSingleTrackCached (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,492);
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
 BA.debugLineNum = 493;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(4096);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 494;BA.debugLine="If trackId = \"\" Then Return False";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 495;BA.debugLine="Dim playlistId As String = ResolveTrackPlaylistId";
Debug.ShouldStop(16384);
_playlistid = __ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackplaylistid" /*RemoteObject*/ ,(Object)(_item),(Object)(_trackindex),(Object)(_trackid));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 496;BA.debugLine="If TryRestoreTrackByExpectedPath(trackId, playlis";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//if
this.state = 12;
if (__ref.runClassMethod (b4j.example.mediacache.class, "_tryrestoretrackbyexpectedpath" /*RemoteObject*/ ,(Object)(_trackid),(Object)(_playlistid),(Object)(_item),(Object)(_trackindex)).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 497;BA.debugLine="If TryRestoreExistingCachedMedia(\"track\", trackId";
Debug.ShouldStop(65536);
if (true) break;

case 13:
//if
this.state = 18;
if (__ref.runClassMethod (b4j.example.mediacache.class, "_tryrestoreexistingcachedmedia" /*RemoteObject*/ ,(Object)(BA.ObjectToString("track")),(Object)(_trackid),(Object)(_item),(Object)(_trackindex)).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 498;BA.debugLine="If IsTrackCached(trackId) Then";
Debug.ShouldStop(131072);
if (true) break;

case 19:
//if
this.state = 22;
if (__ref.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_trackid)).<Boolean>get().booleanValue()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 499;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_trackindex));
 BA.debugLineNum = 500;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 502;BA.debugLine="Dim trackUrl As String = BuildTrackUrl(trackId)";
Debug.ShouldStop(2097152);
_trackurl = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackurl" /*RemoteObject*/ ,(Object)(_trackid));Debug.locals.put("trackUrl", _trackurl);Debug.locals.put("trackUrl", _trackurl);
 BA.debugLineNum = 503;BA.debugLine="If trackUrl = \"\" Then Return False";
Debug.ShouldStop(4194304);
if (true) break;

case 23:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_trackurl,BA.ObjectToString(""))) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 504;BA.debugLine="Dim downloadStartedAt As Long = DateTime.Now";
Debug.ShouldStop(8388608);
_downloadstartedat = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("downloadStartedAt", _downloadstartedat);Debug.locals.put("downloadStartedAt", _downloadstartedat);
 BA.debugLineNum = 505;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(16777216);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 506;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(33554432);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 507;BA.debugLine="Trace(\"Скачивание трека в кэш. id=\" & trackId & \"";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Скачивание трека в кэш. id="),_trackid,RemoteObject.createImmutable(", url="),_trackurl)));
 BA.debugLineNum = 508;BA.debugLine="j.Download(trackUrl)";
Debug.ShouldStop(134217728);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_trackurl));
 BA.debugLineNum = 509;BA.debugLine="j.GetRequest.Timeout = TRACK_DOWNLOAD_TIMEOUT_MS";
Debug.ShouldStop(268435456);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",__ref.getField(true,"_track_download_timeout_ms" /*RemoteObject*/ ));
 BA.debugLineNum = 510;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensuresingletrackcached"), (_j));
this.state = 68;
return;
case 68:
//C
this.state = 29;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 511;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 29:
//if
this.state = 67;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 31;
}else {
this.state = 60;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 512;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
if (true) break;

case 32:
//try
this.state = 58;
this.catchState = 51;
this.state = 34;
if (true) break;

case 34:
//C
this.state = 35;
this.catchState = 51;
 BA.debugLineNum = 513;BA.debugLine="Dim trackDir As String = GetTracksDir";
Debug.ShouldStop(1);
_trackdir = __ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ );Debug.locals.put("trackDir", _trackdir);Debug.locals.put("trackDir", _trackdir);
 BA.debugLineNum = 514;BA.debugLine="EnsureDirectory(trackDir)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(_trackdir));
 BA.debugLineNum = 515;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
Debug.ShouldStop(4);
_tempfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_trackid));Debug.locals.put("tempFileName", _tempfilename);Debug.locals.put("tempFileName", _tempfilename);
 BA.debugLineNum = 516;BA.debugLine="DeleteFileIfExists(trackDir, tempFileName)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_trackdir),(Object)(_tempfilename));
 BA.debugLineNum = 517;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
Debug.ShouldStop(16);
_outstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_outstream = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_trackdir),(Object)(_tempfilename),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("outStream", _outstream);Debug.locals.put("outStream", _outstream);
 BA.debugLineNum = 518;BA.debugLine="TransformStreamWithXor(j.GetInputStream, outStr";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.mediacache.class, "_transformstreamwithxor" /*RemoteObject*/ ,(Object)(_j.runClassMethod (b4j.example.httpjob.class, "_getinputstream" /*RemoteObject*/ )),(Object)(_outstream),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackobfuscationkey" /*RemoteObject*/ ,(Object)(_trackid))));
 BA.debugLineNum = 519;BA.debugLine="outStream.Close";
Debug.ShouldStop(64);
_outstream.runVoidMethod ("Close");
 BA.debugLineNum = 520;BA.debugLine="If IsCachedFileUsable(trackDir, tempFileName) =";
Debug.ShouldStop(128);
if (true) break;

case 35:
//if
this.state = 38;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_trackdir),(Object)(_tempfilename)),parent.__c.getField(true,"False"))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 521;BA.debugLine="DeleteFileIfExists(trackDir, tempFileName)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_trackdir),(Object)(_tempfilename));
 BA.debugLineNum = 522;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить трек в кэш. id="),_trackid,RemoteObject.createImmutable(", message=empty temp file"))));
 BA.debugLineNum = 523;BA.debugLine="j.Release";
Debug.ShouldStop(1024);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 524;BA.debugLine="Return False";
Debug.ShouldStop(2048);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 526;BA.debugLine="If ReplaceCacheFile(trackDir, tempFileName, Bui";
Debug.ShouldStop(8192);

case 38:
//if
this.state = 41;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_replacecachefile" /*RemoteObject*/ ,(Object)(_trackdir),(Object)(_tempfilename),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcachefilename" /*RemoteObject*/ ,(Object)(_trackid)))),parent.__c.getField(true,"False"))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 527;BA.debugLine="DeleteFileIfExists(trackDir, tempFileName)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_trackdir),(Object)(_tempfilename));
 BA.debugLineNum = 528;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить трек в кэш. id="),_trackid,RemoteObject.createImmutable(", message=rename failed"))));
 BA.debugLineNum = 529;BA.debugLine="j.Release";
Debug.ShouldStop(65536);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 530;BA.debugLine="Return False";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 41:
//C
this.state = 42;
;
 BA.debugLineNum = 532;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_trackindex));
 BA.debugLineNum = 533;BA.debugLine="If ValidateIndexedFile(\"track\", trackId) = Fals";
Debug.ShouldStop(1048576);
if (true) break;

case 42:
//if
this.state = 49;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("track")),(Object)(_trackid)),parent.__c.getField(true,"False"))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 534;BA.debugLine="BackfillTrackIndexFromFiles";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.mediacache.class, "_backfilltrackindexfromfiles" /*RemoteObject*/ );
 BA.debugLineNum = 535;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_trackindex));
 BA.debugLineNum = 536;BA.debugLine="If ValidateIndexedFile(\"track\", trackId) = Fal";
Debug.ShouldStop(8388608);
if (true) break;

case 45:
//if
this.state = 48;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("track")),(Object)(_trackid)),parent.__c.getField(true,"False"))) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 537;BA.debugLine="Trace(\"Не удалось валидировать трек после сох";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось валидировать трек после сохранения. id="),_trackid)));
 BA.debugLineNum = 538;BA.debugLine="j.Release";
Debug.ShouldStop(33554432);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 539;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 48:
//C
this.state = 49;
;
 if (true) break;

case 49:
//C
this.state = 58;
;
 BA.debugLineNum = 542;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 543;BA.debugLine="recentMediaNetworkFailure = False";
Debug.ShouldStop(1073741824);
__ref.setField ("_recentmedianetworkfailure" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 544;BA.debugLine="Trace(\"Трек сохранен в кэш. id=\" & trackId & \",";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Трек сохранен в кэш. id="),_trackid,RemoteObject.createImmutable(", totalElapsedMs="),__ref.runClassMethod (b4j.example.mediacache.class, "_elapsedms" /*RemoteObject*/ ,(Object)(_downloadstartedat)))));
 BA.debugLineNum = 545;BA.debugLine="j.Release";
Debug.ShouldStop(1);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 546;BA.debugLine="Return True";
Debug.ShouldStop(2);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 51:
//C
this.state = 52;
this.catchState = 0;
 BA.debugLineNum = 548;BA.debugLine="Dim failedPlaylistId As String = ResolveTrackPl";
Debug.ShouldStop(8);
_failedplaylistid = __ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackplaylistid" /*RemoteObject*/ ,(Object)(_item),(Object)(_trackindex),(Object)(_trackid));Debug.locals.put("failedPlaylistId", _failedplaylistid);Debug.locals.put("failedPlaylistId", _failedplaylistid);
 BA.debugLineNum = 549;BA.debugLine="DeleteFileIfExists(GetTracksDir, BuildTempCache";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_trackid))));
 BA.debugLineNum = 550;BA.debugLine="If failedPlaylistId <> \"\" Then DeleteFileIfExis";
Debug.ShouldStop(32);
if (true) break;

case 52:
//if
this.state = 57;
if (RemoteObject.solveBoolean("!",_failedplaylistid,BA.ObjectToString(""))) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettrackplaylistdir" /*RemoteObject*/ ,(Object)(_failedplaylistid))),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtempcachefilename" /*RemoteObject*/ ,(Object)(_trackid))));
if (true) break;

case 57:
//C
this.state = 58;
;
 BA.debugLineNum = 551;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось сохранить трек в кэш. id="),_trackid,RemoteObject.createImmutable(", message="),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 if (true) break;
if (true) break;

case 58:
//C
this.state = 67;
this.catchState = 0;
;
 if (true) break;

case 60:
//C
this.state = 61;
 BA.debugLineNum = 554;BA.debugLine="If IsMediaNetworkFailure(j.ErrorMessage) Then re";
Debug.ShouldStop(512);
if (true) break;

case 61:
//if
this.state = 66;
if (__ref.runClassMethod (b4j.example.mediacache.class, "_ismedianetworkfailure" /*RemoteObject*/ ,(Object)(_j.getField(true,"_errormessage" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 63;
;}if (true) break;

case 63:
//C
this.state = 66;
__ref.setField ("_recentmedianetworkfailure" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
if (true) break;

case 66:
//C
this.state = 67;
;
 BA.debugLineNum = 555;BA.debugLine="Trace(\"Не удалось скачать трек. id=\" & trackId &";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось скачать трек. id="),_trackid,RemoteObject.createImmutable(", message="),_j.getField(true,"_errormessage" /*RemoteObject*/ ))));
 if (true) break;

case 67:
//C
this.state = -1;
;
 BA.debugLineNum = 557;BA.debugLine="j.Release";
Debug.ShouldStop(4096);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 558;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 559;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static RemoteObject  _ensuretrackcacheready(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnsureTrackCacheReady (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,249);
if (RapidSub.canDelegate("ensuretrackcacheready")) { return __ref.runUserSub(false, "mediacache","ensuretrackcacheready", __ref);}
RemoteObject _actualtrackfiles = RemoteObject.createImmutable(0);
 BA.debugLineNum = 249;BA.debugLine="Public Sub EnsureTrackCacheReady";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 250;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_directoryexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ ))),mediacache.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 251;BA.debugLine="MigrateLegacyTrackCacheLayout";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.mediacache.class, "_migratelegacytrackcachelayout" /*RemoteObject*/ );
 BA.debugLineNum = 252;BA.debugLine="Dim actualTrackFiles As Int = CountTrackFilesOnDi";
Debug.ShouldStop(134217728);
_actualtrackfiles = __ref.runClassMethod (b4j.example.mediacache.class, "_counttrackfilesondisk" /*RemoteObject*/ );Debug.locals.put("actualTrackFiles", _actualtrackfiles);Debug.locals.put("actualTrackFiles", _actualtrackfiles);
 BA.debugLineNum = 253;BA.debugLine="If actualTrackFiles = 0 Then Return";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_actualtrackfiles,BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 254;BA.debugLine="If cachedTrackCount = actualTrackFiles And cached";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cachedtrackcount" /*RemoteObject*/ ),BA.numberCast(double.class, _actualtrackfiles)) && RemoteObject.solveBoolean(".",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, _actualtrackfiles))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 255;BA.debugLine="BackfillTrackIndexFromFiles";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.mediacache.class, "_backfilltrackindexfromfiles" /*RemoteObject*/ );
 BA.debugLineNum = 256;BA.debugLine="RebuildCacheStatsFromIndexes";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.mediacache.class, "_rebuildcachestatsfromindexes" /*RemoteObject*/ );
 BA.debugLineNum = 257;BA.debugLine="SaveCacheStatsSnapshot";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.mediacache.class, "_savecachestatssnapshot" /*RemoteObject*/ );
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ensuretrackindexentry(RemoteObject __ref,RemoteObject _trackid,RemoteObject _playlistid,RemoteObject _relativefilename) throws Exception{
try {
		Debug.PushSubsStack("EnsureTrackIndexEntry (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,824);
if (RapidSub.canDelegate("ensuretrackindexentry")) { return __ref.runUserSub(false, "mediacache","ensuretrackindexentry", __ref, _trackid, _playlistid, _relativefilename);}
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("trackId", _trackid);
Debug.locals.put("playlistId", _playlistid);
Debug.locals.put("relativeFileName", _relativefilename);
 BA.debugLineNum = 824;BA.debugLine="Private Sub EnsureTrackIndexEntry(trackId As Strin";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 825;BA.debugLine="If trackId = \"\" Or relativeFileName = \"\" Then Ret";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_relativefilename,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 826;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 827;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(tr";
Debug.ShouldStop(67108864);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 828;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Initialize");};
 BA.debugLineNum = 829;BA.debugLine="entry.Put(\"id\", trackId)";
Debug.ShouldStop(268435456);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_trackid)));
 BA.debugLineNum = 830;BA.debugLine="If playlistId <> \"\" Then entry.Put(\"playlist_id\",";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_playlistid,BA.ObjectToString(""))) { 
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((_playlistid)));};
 BA.debugLineNum = 831;BA.debugLine="entry.Put(\"file_name\", relativeFileName)";
Debug.ShouldStop(1073741824);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((_relativefilename)));
 BA.debugLineNum = 832;BA.debugLine="entry.Put(\"size_bytes\", GetFileSizeSafe(GetTracks";
Debug.ShouldStop(-2147483648);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("size_bytes"))),(Object)((__ref.runClassMethod (b4j.example.mediacache.class, "_getfilesizesafe" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_relativefilename)))));
 BA.debugLineNum = 833;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("saved_at")))),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));};
 BA.debugLineNum = 834;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(2);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 835;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
Debug.ShouldStop(4);
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_trackid)),(Object)((_entry.getObject())));
 BA.debugLineNum = 836;BA.debugLine="cachedTrackIndexDirty = True";
Debug.ShouldStop(8);
__ref.setField ("_cachedtrackindexdirty" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 BA.debugLineNum = 837;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ensuretrackplaybacktemp(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("EnsureTrackPlaybackTemp (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,790);
if (RapidSub.canDelegate("ensuretrackplaybacktemp")) { return __ref.runUserSub(false, "mediacache","ensuretrackplaybacktemp", __ref, _audiokey, _item);}
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _tempfilename = RemoteObject.createImmutable("");
RemoteObject _sourcerelativename = RemoteObject.createImmutable("");
RemoteObject _sourcedir = RemoteObject.createImmutable("");
RemoteObject _sourceleafname = RemoteObject.createImmutable("");
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _outputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("item", _item);
 BA.debugLineNum = 790;BA.debugLine="Private Sub EnsureTrackPlaybackTemp(audioKey As St";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 791;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(4194304);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 792;BA.debugLine="If trackId = \"\" Then Return False";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 793;BA.debugLine="Dim tempFileName As String = BuildPlaybackTempTra";
Debug.ShouldStop(16777216);
_tempfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildplaybacktemptrackfilename" /*RemoteObject*/ ,(Object)(_audiokey));Debug.locals.put("tempFileName", _tempfilename);Debug.locals.put("tempFileName", _tempfilename);
 BA.debugLineNum = 794;BA.debugLine="If playbackTempTrackIds.GetDefault(audioKey, \"\")";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_playbacktemptrackids" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_audiokey)),(Object)((RemoteObject.createImmutable("")))),(_trackid)) && RemoteObject.solveBoolean(".",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_tempfilename)))) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 795;BA.debugLine="DeleteFileIfExists(File.DirTemp, tempFileName)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_tempfilename));
 BA.debugLineNum = 796;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 797;BA.debugLine="Dim sourceRelativeName As String = ResolveTrackR";
Debug.ShouldStop(268435456);
_sourcerelativename = __ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackrelativefilenamefromitem" /*RemoteObject*/ ,(Object)(_item));Debug.locals.put("sourceRelativeName", _sourcerelativename);Debug.locals.put("sourceRelativeName", _sourcerelativename);
 BA.debugLineNum = 798;BA.debugLine="Dim sourceDir As String = ResolveRelativeParentD";
Debug.ShouldStop(536870912);
_sourcedir = __ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativeparentdir" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_sourcerelativename));Debug.locals.put("sourceDir", _sourcedir);Debug.locals.put("sourceDir", _sourcedir);
 BA.debugLineNum = 799;BA.debugLine="Dim sourceLeafName As String = ResolveRelativeLe";
Debug.ShouldStop(1073741824);
_sourceleafname = __ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativeleafname" /*RemoteObject*/ ,(Object)(_sourcerelativename));Debug.locals.put("sourceLeafName", _sourceleafname);Debug.locals.put("sourceLeafName", _sourceleafname);
 BA.debugLineNum = 800;BA.debugLine="Dim inputStream As InputStream = File.OpenInput(";
Debug.ShouldStop(-2147483648);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
_inputstream = mediacache.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_sourcedir),(Object)(_sourceleafname));Debug.locals.put("inputStream", _inputstream);Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 801;BA.debugLine="Dim outputStream As OutputStream = File.OpenOutp";
Debug.ShouldStop(1);
_outputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_outputstream = mediacache.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_tempfilename),(Object)(mediacache.__c.getField(true,"False")));Debug.locals.put("outputStream", _outputstream);Debug.locals.put("outputStream", _outputstream);
 BA.debugLineNum = 802;BA.debugLine="TransformStreamWithXor(inputStream, outputStream";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.mediacache.class, "_transformstreamwithxor" /*RemoteObject*/ ,(Object)(_inputstream),(Object)(_outputstream),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackobfuscationkey" /*RemoteObject*/ ,(Object)(_trackid))));
 BA.debugLineNum = 803;BA.debugLine="outputStream.Close";
Debug.ShouldStop(4);
_outputstream.runVoidMethod ("Close");
 BA.debugLineNum = 804;BA.debugLine="inputStream.Close";
Debug.ShouldStop(8);
_inputstream.runVoidMethod ("Close");
 BA.debugLineNum = 805;BA.debugLine="playbackTempTrackIds.Put(audioKey, trackId)";
Debug.ShouldStop(16);
__ref.getField(false,"_playbacktemptrackids" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_audiokey)),(Object)((_trackid)));
 BA.debugLineNum = 806;BA.debugLine="Return IsCachedFileUsable(File.DirTemp, tempFile";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_tempfilename));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 808;BA.debugLine="DeleteFileIfExists(File.DirTemp, tempFileName)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_tempfilename));
 BA.debugLineNum = 809;BA.debugLine="Trace(\"Не удалось подготовить временный файл тре";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось подготовить временный файл трека. id="),_trackid,RemoteObject.createImmutable(", message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 811;BA.debugLine="playbackTempTrackIds.Remove(audioKey)";
Debug.ShouldStop(1024);
__ref.getField(false,"_playbacktemptrackids" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_audiokey)));
 BA.debugLineNum = 812;BA.debugLine="Return False";
Debug.ShouldStop(2048);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 813;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("EnsureTracksCached (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,317);
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
RemoteObject group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureTracksCached (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,317);
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
 BA.debugLineNum = 318;BA.debugLine="FlushPendingIndexSaves";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.mediacache.class, "_flushpendingindexsaves" /*RemoteObject*/ );
 BA.debugLineNum = 319;BA.debugLine="If trackItems.IsInitialized = False Or trackItems";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 320;BA.debugLine="Dim cachedTrackIndex As Map = GetCachedTrackIndex";
Debug.ShouldStop(-2147483648);
parent._cachedtrackindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
parent._cachedtrackindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getcachedtrackindex" /*RemoteObject*/ );__ref.setField("_cachedtrackindex",parent._cachedtrackindex);
 BA.debugLineNum = 321;BA.debugLine="Dim seenTrackIds As Map";
Debug.ShouldStop(1);
_seentrackids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("seenTrackIds", _seentrackids);
 BA.debugLineNum = 322;BA.debugLine="seenTrackIds.Initialize";
Debug.ShouldStop(2);
_seentrackids.runVoidMethod ("Initialize");
 BA.debugLineNum = 323;BA.debugLine="Dim downloadedCount As Int = 0";
Debug.ShouldStop(4);
_downloadedcount = BA.numberCast(int.class, 0);Debug.locals.put("downloadedCount", _downloadedcount);Debug.locals.put("downloadedCount", _downloadedcount);
 BA.debugLineNum = 324;BA.debugLine="Dim failedCount As Int = 0";
Debug.ShouldStop(8);
_failedcount = BA.numberCast(int.class, 0);Debug.locals.put("failedCount", _failedcount);Debug.locals.put("failedCount", _failedcount);
 BA.debugLineNum = 325;BA.debugLine="Dim processedCount As Int = 0";
Debug.ShouldStop(16);
_processedcount = BA.numberCast(int.class, 0);Debug.locals.put("processedCount", _processedcount);Debug.locals.put("processedCount", _processedcount);
 BA.debugLineNum = 326;BA.debugLine="For Each itemObject As Object In trackItems";
Debug.ShouldStop(32);
if (true) break;

case 7:
//for
this.state = 44;
group9 = _trackitems;
index9 = 0;
groupLen9 = group9.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("itemObject", _itemobject);
this.state = 45;
if (true) break;

case 45:
//C
this.state = 44;
if (index9 < groupLen9) {
this.state = 9;
_itemobject = group9.runMethod(false,"Get",index9);Debug.locals.put("itemObject", _itemobject);}
if (true) break;

case 46:
//C
this.state = 45;
index9++;
Debug.locals.put("itemObject", _itemobject);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 327;BA.debugLine="If processedCount >= maxCount Then Exit";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 328;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 329;BA.debugLine="Dim item As Map = itemObject";
Debug.ShouldStop(256);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 330;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 331;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"";
Debug.ShouldStop(1024);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 332;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 333;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Conti";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 334;BA.debugLine="seenTrackIds.Put(trackId, True)";
Debug.ShouldStop(8192);
_seentrackids.runVoidMethod ("Put",(Object)((_trackid)),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 335;BA.debugLine="processedCount = processedCount + 1";
Debug.ShouldStop(16384);
_processedcount = RemoteObject.solve(new RemoteObject[] {_processedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("processedCount", _processedcount);
 BA.debugLineNum = 336;BA.debugLine="Wait For (EnsureSingleTrackCached(item, cachedT";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "ensuretrackscached"), __ref.runClassMethod (b4j.example.mediacache.class, "_ensuresingletrackcached" /*RemoteObject*/ ,(Object)(_item),(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ))));
this.state = 47;
return;
case 47:
//C
this.state = 37;
_downloaded = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("downloaded", _downloaded);
;
 BA.debugLineNum = 337;BA.debugLine="If downloaded Then";
Debug.ShouldStop(65536);
if (true) break;

case 37:
//if
this.state = 42;
if (_downloaded.<Boolean>get().booleanValue()) { 
this.state = 39;
}else 
{ BA.debugLineNum = 339;BA.debugLine="Else If IsTrackCached(trackId) = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_trackid)),parent.__c.getField(true,"False"))) { 
this.state = 41;
}}
if (true) break;

case 39:
//C
this.state = 42;
 BA.debugLineNum = 338;BA.debugLine="downloadedCount = downloadedCount + 1";
Debug.ShouldStop(131072);
_downloadedcount = RemoteObject.solve(new RemoteObject[] {_downloadedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("downloadedCount", _downloadedcount);
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 340;BA.debugLine="failedCount = failedCount + 1";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 344;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 345;BA.debugLine="Trace(\"Синхронизация кэша треков завершена. downl";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Синхронизация кэша треков завершена. downloaded="),_downloadedcount,RemoteObject.createImmutable(", failed="),_failedcount,RemoteObject.createImmutable(", actual="),__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 346;BA.debugLine="Return downloadedCount > 0";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((RemoteObject.solveBoolean(">",_downloadedcount,BA.numberCast(double.class, 0)))));return;};
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _extractplaylistidfromtrackrelativepath(RemoteObject __ref,RemoteObject _relativefilename) throws Exception{
try {
		Debug.PushSubsStack("ExtractPlaylistIdFromTrackRelativePath (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1586);
if (RapidSub.canDelegate("extractplaylistidfromtrackrelativepath")) { return __ref.runUserSub(false, "mediacache","extractplaylistidfromtrackrelativepath", __ref, _relativefilename);}
RemoteObject _normalized = RemoteObject.createImmutable("");
RemoteObject _slashindex = RemoteObject.createImmutable(0);
Debug.locals.put("relativeFileName", _relativefilename);
 BA.debugLineNum = 1586;BA.debugLine="Private Sub ExtractPlaylistIdFromTrackRelativePath";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1587;BA.debugLine="If relativeFileName = \"\" Then Return \"\"";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_relativefilename,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 1588;BA.debugLine="Dim normalized As String = relativeFileName.Repla";
Debug.ShouldStop(524288);
_normalized = _relativefilename.runMethod(true,"replace",(Object)(BA.ObjectToString("\\\\")),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("normalized", _normalized);Debug.locals.put("normalized", _normalized);
 BA.debugLineNum = 1589;BA.debugLine="Dim slashIndex As Int = normalized.IndexOf(\"/\")";
Debug.ShouldStop(1048576);
_slashindex = _normalized.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("slashIndex", _slashindex);Debug.locals.put("slashIndex", _slashindex);
 BA.debugLineNum = 1590;BA.debugLine="If slashIndex <= 0 Then Return \"\"";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("k",_slashindex,BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 1591;BA.debugLine="Return normalized.SubString2(0, slashIndex)";
Debug.ShouldStop(4194304);
if (true) return _normalized.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_slashindex));
 BA.debugLineNum = 1592;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finalizecurrentcacheaudittype(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FinalizeCurrentCacheAuditType (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1222);
if (RapidSub.canDelegate("finalizecurrentcacheaudittype")) { return __ref.runUserSub(false, "mediacache","finalizecurrentcacheaudittype", __ref);}
RemoteObject _auditdir = RemoteObject.createImmutable("");
RemoteObject _auditindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _keyscopy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
 BA.debugLineNum = 1222;BA.debugLine="Private Sub FinalizeCurrentCacheAuditType";
Debug.ShouldStop(32);
 BA.debugLineNum = 1223;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
Debug.ShouldStop(64);
_auditdir = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditdirbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditDir", _auditdir);Debug.locals.put("auditDir", _auditdir);
 BA.debugLineNum = 1224;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
Debug.ShouldStop(128);
_auditindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_auditindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditindexbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditIndex", _auditindex);Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 1225;BA.debugLine="Dim keysCopy As List";
Debug.ShouldStop(256);
_keyscopy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("keysCopy", _keyscopy);
 BA.debugLineNum = 1226;BA.debugLine="keysCopy.Initialize";
Debug.ShouldStop(512);
_keyscopy.runVoidMethod ("Initialize");
 BA.debugLineNum = 1227;BA.debugLine="For Each key As String In auditIndex.Keys";
Debug.ShouldStop(1024);
{
final RemoteObject group5 = _auditindex.runMethod(false,"Keys");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 1228;BA.debugLine="keysCopy.Add(key)";
Debug.ShouldStop(2048);
_keyscopy.runVoidMethod ("Add",(Object)((_key)));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 1230;BA.debugLine="For Each key As String In keysCopy";
Debug.ShouldStop(8192);
{
final RemoteObject group8 = _keyscopy;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 1231;BA.debugLine="If cacheAuditSeenIds.ContainsKey(key) = False Th";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_key))),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1232;BA.debugLine="Dim fileName As String = ResolveIndexedAuditFil";
Debug.ShouldStop(32768);
_filename = __ref.runClassMethod (b4j.example.mediacache.class, "_resolveindexedauditfilename" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )),(Object)(_key),(Object)(_auditindex));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 1233;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then";
Debug.ShouldStop(65536);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1234;BA.debugLine="cacheAuditSeenIds.Put(key, True)";
Debug.ShouldStop(131072);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((mediacache.__c.getField(true,"True"))));
 BA.debugLineNum = 1235;BA.debugLine="Continue";
Debug.ShouldStop(262144);
if (true) continue;
 };
 BA.debugLineNum = 1237;BA.debugLine="auditIndex.Remove(key)";
Debug.ShouldStop(1048576);
_auditindex.runVoidMethod ("Remove",(Object)((_key)));
 BA.debugLineNum = 1238;BA.debugLine="cacheAuditRemovedCount = cacheAuditRemovedCount";
Debug.ShouldStop(2097152);
__ref.setField ("_cacheauditremovedcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cacheauditremovedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 1239;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_markauditindexchanged" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));
 };
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 1242;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("FindTrackIdByFileName (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1309);
if (RapidSub.canDelegate("findtrackidbyfilename")) { return __ref.runUserSub(false, "mediacache","findtrackidbyfilename", __ref, _filename, _trackindex);}
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _storedfilename = RemoteObject.createImmutable("");
Debug.locals.put("fileName", _filename);
Debug.locals.put("trackIndex", _trackindex);
 BA.debugLineNum = 1309;BA.debugLine="Private Sub FindTrackIdByFileName(fileName As Stri";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1310;BA.debugLine="For Each key As String In trackIndex.Keys";
Debug.ShouldStop(536870912);
{
final RemoteObject group1 = _trackindex.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 1311;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(key, Nu";
Debug.ShouldStop(1073741824);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackindex.runMethod(false,"GetDefault",(Object)((_key)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 1312;BA.debugLine="If entry.IsInitialized Then";
Debug.ShouldStop(-2147483648);
if (_entry.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1313;BA.debugLine="Dim storedFileName As String = entry.GetDefault";
Debug.ShouldStop(1);
_storedfilename = BA.ObjectToString(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("storedFileName", _storedfilename);Debug.locals.put("storedFileName", _storedfilename);
 BA.debugLineNum = 1314;BA.debugLine="If storedFileName = fileName Then Return key";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_storedfilename,_filename)) { 
if (true) return _key;};
 };
 BA.debugLineNum = 1316;BA.debugLine="If File.GetName(fileName) = BuildTrackCacheFileN";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",mediacache.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_filename)),__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcachefilename" /*RemoteObject*/ ,(Object)(_key)))) { 
if (true) return _key;};
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 1318;BA.debugLine="Return \"\"";
Debug.ShouldStop(32);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 1319;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findtrackidbyfilenamewithmetadata(RemoteObject __ref,RemoteObject _filename,RemoteObject _trackindex,RemoteObject _playlisttrackmaps) throws Exception{
try {
		Debug.PushSubsStack("FindTrackIdByFileNameWithMetadata (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1321);
if (RapidSub.canDelegate("findtrackidbyfilenamewithmetadata")) { return __ref.runUserSub(false, "mediacache","findtrackidbyfilenamewithmetadata", __ref, _filename, _trackindex, _playlisttrackmaps);}
RemoteObject _resolvedtrackid = RemoteObject.createImmutable("");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _globaltrackmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlisttrackmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("fileName", _filename);
Debug.locals.put("trackIndex", _trackindex);
Debug.locals.put("playlistTrackMaps", _playlisttrackmaps);
 BA.debugLineNum = 1321;BA.debugLine="Private Sub FindTrackIdByFileNameWithMetadata(file";
Debug.ShouldStop(256);
 BA.debugLineNum = 1322;BA.debugLine="Dim resolvedTrackId As String = FindTrackIdByFile";
Debug.ShouldStop(512);
_resolvedtrackid = __ref.runClassMethod (b4j.example.mediacache.class, "_findtrackidbyfilename" /*RemoteObject*/ ,(Object)(_filename),(Object)(_trackindex));Debug.locals.put("resolvedTrackId", _resolvedtrackid);Debug.locals.put("resolvedTrackId", _resolvedtrackid);
 BA.debugLineNum = 1323;BA.debugLine="If resolvedTrackId <> \"\" Then Return resolvedTrac";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("!",_resolvedtrackid,BA.ObjectToString(""))) { 
if (true) return _resolvedtrackid;};
 BA.debugLineNum = 1324;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFromT";
Debug.ShouldStop(2048);
_playlistid = __ref.runClassMethod (b4j.example.mediacache.class, "_extractplaylistidfromtrackrelativepath" /*RemoteObject*/ ,(Object)(_filename));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 1325;BA.debugLine="If playlistId = \"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1326;BA.debugLine="Dim globalTrackMap As Map = LoadGlobalTrackFileM";
Debug.ShouldStop(8192);
_globaltrackmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_globaltrackmap = __ref.runClassMethod (b4j.example.mediacache.class, "_loadglobaltrackfilemap" /*RemoteObject*/ ,(Object)(_playlisttrackmaps));Debug.locals.put("globalTrackMap", _globaltrackmap);Debug.locals.put("globalTrackMap", _globaltrackmap);
 BA.debugLineNum = 1327;BA.debugLine="If globalTrackMap.IsInitialized = False Then Ret";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_globaltrackmap.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 1328;BA.debugLine="Return globalTrackMap.GetDefault(File.GetName(fi";
Debug.ShouldStop(32768);
if (true) return BA.ObjectToString(_globaltrackmap.runMethod(false,"GetDefault",(Object)((mediacache.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_filename)))),(Object)((RemoteObject.createImmutable("")))));
 };
 BA.debugLineNum = 1330;BA.debugLine="Dim playlistTrackMap As Map = LoadPlaylistTrackFi";
Debug.ShouldStop(131072);
_playlisttrackmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlisttrackmap = __ref.runClassMethod (b4j.example.mediacache.class, "_loadplaylisttrackfilemap" /*RemoteObject*/ ,(Object)(_playlistid),(Object)(_playlisttrackmaps));Debug.locals.put("playlistTrackMap", _playlisttrackmap);Debug.locals.put("playlistTrackMap", _playlisttrackmap);
 BA.debugLineNum = 1331;BA.debugLine="If playlistTrackMap.IsInitialized = False Then Re";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_playlisttrackmap.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 1332;BA.debugLine="Return playlistTrackMap.GetDefault(fileName, \"\")";
Debug.ShouldStop(524288);
if (true) return BA.ObjectToString(_playlisttrackmap.runMethod(false,"GetDefault",(Object)((_filename)),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1333;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("FinishCacheAudit (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1244);
if (RapidSub.canDelegate("finishcacheaudit")) { return __ref.runUserSub(false, "mediacache","finishcacheaudit", __ref);}
 BA.debugLineNum = 1244;BA.debugLine="Private Sub FinishCacheAudit";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1245;BA.debugLine="If cacheAuditAdIndexChanged Then SaveAdIndex";
Debug.ShouldStop(268435456);
if (__ref.getField(true,"_cacheauditadindexchanged" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );};
 BA.debugLineNum = 1246;BA.debugLine="If cacheAuditTrackIndexChanged Then SaveTrackInde";
Debug.ShouldStop(536870912);
if (__ref.getField(true,"_cacheaudittrackindexchanged" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );};
 BA.debugLineNum = 1247;BA.debugLine="cacheAuditInProgress = False";
Debug.ShouldStop(1073741824);
__ref.setField ("_cacheauditinprogress" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 1248;BA.debugLine="cacheAuditCurrentType = \"\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_cacheauditcurrenttype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1249;BA.debugLine="cacheAuditListingInProgress = False";
Debug.ShouldStop(1);
__ref.setField ("_cacheauditlistinginprogress" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 1250;BA.debugLine="cacheAuditListingDir = \"\"";
Debug.ShouldStop(2);
__ref.setField ("_cacheauditlistingdir" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1251;BA.debugLine="Trace(\"Аудит кэша завершен. added=\" & cacheAuditA";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Аудит кэша завершен. added="),__ref.getField(true,"_cacheauditaddedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(", removed="),__ref.getField(true,"_cacheauditremovedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(", tempDeleted="),__ref.getField(true,"_cacheaudittempdeletedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(", ads="),__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(", tracks="),__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 1252;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _flushpendingindexsaves(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FlushPendingIndexSaves (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,355);
if (RapidSub.canDelegate("flushpendingindexsaves")) { return __ref.runUserSub(false, "mediacache","flushpendingindexsaves", __ref);}
 BA.debugLineNum = 355;BA.debugLine="Public Sub FlushPendingIndexSaves";
Debug.ShouldStop(4);
 BA.debugLineNum = 356;BA.debugLine="If cachedAdIndexDirty Then SaveAdIndex";
Debug.ShouldStop(8);
if (__ref.getField(true,"_cachedadindexdirty" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );};
 BA.debugLineNum = 357;BA.debugLine="If cachedTrackIndexDirty Then SaveTrackIndex";
Debug.ShouldStop(16);
if (__ref.getField(true,"_cachedtrackindexdirty" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );};
 BA.debugLineNum = 358;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("GetAdsDir (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("getadsdir")) { return __ref.runUserSub(false, "mediacache","getadsdir", __ref);}
 BA.debugLineNum = 196;BA.debugLine="Public Sub GetAdsDir As String";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
Debug.ShouldStop(16);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mediadirname" /*RemoteObject*/ )))),(Object)(__ref.getField(true,"_adsdirname" /*RemoteObject*/ )));
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("GetAuditDirByType (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1254);
if (RapidSub.canDelegate("getauditdirbytype")) { return __ref.runUserSub(false, "mediacache","getauditdirbytype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 1254;BA.debugLine="Private Sub GetAuditDirByType(itemType As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 1255;BA.debugLine="If itemType = \"ads\" Then Return GetAdsDir";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ads"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ );};
 BA.debugLineNum = 1256;BA.debugLine="Return GetTracksDir";
Debug.ShouldStop(128);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ );
 BA.debugLineNum = 1257;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("GetAuditIndexByType (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1259);
if (RapidSub.canDelegate("getauditindexbytype")) { return __ref.runUserSub(false, "mediacache","getauditindexbytype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 1259;BA.debugLine="Private Sub GetAuditIndexByType(itemType As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1260;BA.debugLine="If itemType = \"ads\" Then Return cachedAdIndex";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ads"))) { 
if (true) return __ref.getField(false,"_cachedadindex" /*RemoteObject*/ );};
 BA.debugLineNum = 1261;BA.debugLine="Return cachedTrackIndex";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 1262;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("GetBytesFromString (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,939);
if (RapidSub.canDelegate("getbytesfromstring")) { return __ref.runUserSub(false, "mediacache","getbytesfromstring", __ref, _value);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("value", _value);
 BA.debugLineNum = 939;BA.debugLine="Private Sub GetBytesFromString(value As String) As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 940;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(2048);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 941;BA.debugLine="jo.InitializeNewInstance(\"java.lang.String\", Arra";
Debug.ShouldStop(4096);
_jo.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.lang.String")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_value)})));
 BA.debugLineNum = 942;BA.debugLine="Return jo.RunMethod(\"getBytes\", Array As Object(\"";
Debug.ShouldStop(8192);
if (true) return (_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBytes")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("UTF-8"))}))));
 BA.debugLineNum = 943;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcachedadbytes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCachedAdBytes (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("getcachedadbytes")) { return __ref.runUserSub(false, "mediacache","getcachedadbytes", __ref);}
 BA.debugLineNum = 228;BA.debugLine="Public Sub GetCachedAdBytes As Long";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="Return cachedAdBytes";
Debug.ShouldStop(16);
if (true) return __ref.getField(true,"_cachedadbytes" /*RemoteObject*/ );
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcachedadcount(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCachedAdCount (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("getcachedadcount")) { return __ref.runUserSub(false, "mediacache","getcachedadcount", __ref);}
 BA.debugLineNum = 220;BA.debugLine="Public Sub GetCachedAdCount As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="Return cachedAdCount";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(true,"_cachedadcount" /*RemoteObject*/ );
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcachedadindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCachedAdIndex (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,624);
if (RapidSub.canDelegate("getcachedadindex")) { return __ref.runUserSub(false, "mediacache","getcachedadindex", __ref);}
 BA.debugLineNum = 624;BA.debugLine="Private Sub GetCachedAdIndex As Map";
Debug.ShouldStop(32768);
 BA.debugLineNum = 625;BA.debugLine="If cachedAdIndex.IsInitialized = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 626;BA.debugLine="cachedAdIndex.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 628;BA.debugLine="Return cachedAdIndex";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_cachedadindex" /*RemoteObject*/ );
 BA.debugLineNum = 629;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcachedtrackbytes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCachedTrackBytes (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,224);
if (RapidSub.canDelegate("getcachedtrackbytes")) { return __ref.runUserSub(false, "mediacache","getcachedtrackbytes", __ref);}
 BA.debugLineNum = 224;BA.debugLine="Public Sub GetCachedTrackBytes As Long";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 225;BA.debugLine="Return cachedTrackBytes";
Debug.ShouldStop(1);
if (true) return __ref.getField(true,"_cachedtrackbytes" /*RemoteObject*/ );
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcachedtrackcount(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCachedTrackCount (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("getcachedtrackcount")) { return __ref.runUserSub(false, "mediacache","getcachedtrackcount", __ref);}
 BA.debugLineNum = 216;BA.debugLine="Public Sub GetCachedTrackCount As Int";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="Return cachedTrackCount";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(true,"_cachedtrackcount" /*RemoteObject*/ );
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcachedtrackindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCachedTrackIndex (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,631);
if (RapidSub.canDelegate("getcachedtrackindex")) { return __ref.runUserSub(false, "mediacache","getcachedtrackindex", __ref);}
 BA.debugLineNum = 631;BA.debugLine="Private Sub GetCachedTrackIndex As Map";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 632;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 633;BA.debugLine="cachedTrackIndex.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 635;BA.debugLine="Return cachedTrackIndex";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 636;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcachedtrackplaylistidsondisk(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCachedTrackPlaylistIdsOnDisk (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,293);
if (RapidSub.canDelegate("getcachedtrackplaylistidsondisk")) { return __ref.runUserSub(false, "mediacache","getcachedtrackplaylistidsondisk", __ref);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _seenids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
 BA.debugLineNum = 293;BA.debugLine="Public Sub GetCachedTrackPlaylistIdsOnDisk As List";
Debug.ShouldStop(16);
 BA.debugLineNum = 294;BA.debugLine="Dim result As List";
Debug.ShouldStop(32);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 295;BA.debugLine="result.Initialize";
Debug.ShouldStop(64);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 296;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_directoryexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ ))),mediacache.__c.getField(true,"False"))) { 
if (true) return _result;};
 BA.debugLineNum = 297;BA.debugLine="EnsureTrackCacheReady";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuretrackcacheready" /*RemoteObject*/ );
 BA.debugLineNum = 298;BA.debugLine="Dim seenIds As Map";
Debug.ShouldStop(512);
_seenids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("seenIds", _seenids);
 BA.debugLineNum = 299;BA.debugLine="seenIds.Initialize";
Debug.ShouldStop(1024);
_seenids.runVoidMethod ("Initialize");
 BA.debugLineNum = 300;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 301;BA.debugLine="If cachedTrackIndex.IsInitialized Then";
Debug.ShouldStop(4096);
if (__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 302;BA.debugLine="For Each trackId As String In cachedTrackIndex.";
Debug.ShouldStop(8192);
{
final RemoteObject group9 = __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_trackid = BA.ObjectToString(group9.runMethod(false,"Get",index9));Debug.locals.put("trackId", _trackid);
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 303;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault";
Debug.ShouldStop(16384);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 304;BA.debugLine="If entry.IsInitialized = False Then Continue";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 305;BA.debugLine="Dim playlistId As String = entry.GetDefault(\"p";
Debug.ShouldStop(65536);
_playlistid = BA.ObjectToString(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 306;BA.debugLine="If playlistId = \"\" Or seenIds.ContainsKey(play";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString("")) || RemoteObject.solveBoolean(".",_seenids.runMethod(true,"ContainsKey",(Object)((_playlistid))))) { 
if (true) continue;};
 BA.debugLineNum = 307;BA.debugLine="seenIds.Put(playlistId, True)";
Debug.ShouldStop(262144);
_seenids.runVoidMethod ("Put",(Object)((_playlistid)),(Object)((mediacache.__c.getField(true,"True"))));
 BA.debugLineNum = 308;BA.debugLine="result.Add(playlistId)";
Debug.ShouldStop(524288);
_result.runVoidMethod ("Add",(Object)((_playlistid)));
 }
}Debug.locals.put("trackId", _trackid);
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e19.toString()); BA.debugLineNum = 312;BA.debugLine="Trace(\"Не удалось получить список playlist папок";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось получить список playlist папок из track cache. message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 314;BA.debugLine="Return result";
Debug.ShouldStop(33554432);
if (true) return _result;
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
public static RemoteObject  _getcachedtrackplayliststats(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCachedTrackPlaylistStats (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("getcachedtrackplayliststats")) { return __ref.runUserSub(false, "mediacache","getcachedtrackplayliststats", __ref);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _sourceentry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _copyentry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 232;BA.debugLine="Public Sub GetCachedTrackPlaylistStats As Map";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="EnsureTrackCacheReady";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuretrackcacheready" /*RemoteObject*/ );
 BA.debugLineNum = 234;BA.debugLine="Dim result As Map";
Debug.ShouldStop(512);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 235;BA.debugLine="result.Initialize";
Debug.ShouldStop(1024);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 236;BA.debugLine="For Each playlistId As String In cachedTrackPlayl";
Debug.ShouldStop(2048);
{
final RemoteObject group4 = __ref.getField(false,"_cachedtrackplayliststats" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_playlistid = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("playlistId", _playlistid);
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 237;BA.debugLine="Dim sourceEntry As Map = cachedTrackPlaylistStat";
Debug.ShouldStop(4096);
_sourceentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_sourceentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_cachedtrackplayliststats" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_playlistid))));Debug.locals.put("sourceEntry", _sourceentry);Debug.locals.put("sourceEntry", _sourceentry);
 BA.debugLineNum = 238;BA.debugLine="Dim copyEntry As Map";
Debug.ShouldStop(8192);
_copyentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("copyEntry", _copyentry);
 BA.debugLineNum = 239;BA.debugLine="copyEntry.Initialize";
Debug.ShouldStop(16384);
_copyentry.runVoidMethod ("Initialize");
 BA.debugLineNum = 240;BA.debugLine="If sourceEntry.IsInitialized Then";
Debug.ShouldStop(32768);
if (_sourceentry.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 241;BA.debugLine="copyEntry.Put(\"count\", sourceEntry.GetDefault(\"";
Debug.ShouldStop(65536);
_copyentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("count"))),(Object)(_sourceentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("count"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 242;BA.debugLine="copyEntry.Put(\"bytes\", sourceEntry.GetDefault(\"";
Debug.ShouldStop(131072);
_copyentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bytes"))),(Object)(_sourceentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("bytes"))),(Object)(RemoteObject.createImmutable((0))))));
 };
 BA.debugLineNum = 244;BA.debugLine="result.Put(playlistId, copyEntry)";
Debug.ShouldStop(524288);
_result.runVoidMethod ("Put",(Object)((_playlistid)),(Object)((_copyentry.getObject())));
 }
}Debug.locals.put("playlistId", _playlistid);
;
 BA.debugLineNum = 246;BA.debugLine="Return result";
Debug.ShouldStop(2097152);
if (true) return _result;
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("GetDirByItemType (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1084);
if (RapidSub.canDelegate("getdirbyitemtype")) { return __ref.runUserSub(false, "mediacache","getdirbyitemtype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 1084;BA.debugLine="Private Sub GetDirByItemType(itemType As String) A";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1085;BA.debugLine="If itemType = \"ad\" Then Return GetAdsDir";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ );};
 BA.debugLineNum = 1086;BA.debugLine="Return GetTracksDir";
Debug.ShouldStop(536870912);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ );
 BA.debugLineNum = 1087;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdrivetotalspace(RemoteObject __ref,RemoteObject _path) throws Exception{
try {
		Debug.PushSubsStack("GetDriveTotalSpace (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1795);
if (RapidSub.canDelegate("getdrivetotalspace")) { return __ref.runUserSub(false, "mediacache","getdrivetotalspace", __ref, _path);}
RemoteObject _fileobject = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("path", _path);
 BA.debugLineNum = 1795;BA.debugLine="Private Sub GetDriveTotalSpace(path As String) As";
Debug.ShouldStop(4);
 BA.debugLineNum = 1796;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 1797;BA.debugLine="Dim fileObject As JavaObject";
Debug.ShouldStop(16);
_fileobject = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("fileObject", _fileobject);
 BA.debugLineNum = 1798;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
Debug.ShouldStop(32);
_fileobject.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_path)})));
 BA.debugLineNum = 1799;BA.debugLine="Return fileObject.RunMethod(\"getTotalSpace\", Nul";
Debug.ShouldStop(64);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, _fileobject.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTotalSpace")),(Object)((mediacache.__c.getField(false,"Null")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 1801;BA.debugLine="Return 0";
Debug.ShouldStop(256);
if (true) return BA.numberCast(long.class, 0);
 };
 BA.debugLineNum = 1803;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdriveusablespace(RemoteObject __ref,RemoteObject _path) throws Exception{
try {
		Debug.PushSubsStack("GetDriveUsableSpace (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1785);
if (RapidSub.canDelegate("getdriveusablespace")) { return __ref.runUserSub(false, "mediacache","getdriveusablespace", __ref, _path);}
RemoteObject _fileobject = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("path", _path);
 BA.debugLineNum = 1785;BA.debugLine="Private Sub GetDriveUsableSpace(path As String) As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1786;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 1787;BA.debugLine="Dim fileObject As JavaObject";
Debug.ShouldStop(67108864);
_fileobject = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("fileObject", _fileobject);
 BA.debugLineNum = 1788;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
Debug.ShouldStop(134217728);
_fileobject.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_path)})));
 BA.debugLineNum = 1789;BA.debugLine="Return fileObject.RunMethod(\"getUsableSpace\", Nu";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, _fileobject.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getUsableSpace")),(Object)((mediacache.__c.getField(false,"Null")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 1791;BA.debugLine="Return 0";
Debug.ShouldStop(1073741824);
if (true) return BA.numberCast(long.class, 0);
 };
 BA.debugLineNum = 1793;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfilesizesafe(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("GetFileSizeSafe (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1683);
if (RapidSub.canDelegate("getfilesizesafe")) { return __ref.runUserSub(false, "mediacache","getfilesizesafe", __ref, _dir, _filename);}
RemoteObject _filedir = RemoteObject.createImmutable("");
RemoteObject _leafname = RemoteObject.createImmutable("");
Debug.locals.put("dir", _dir);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 1683;BA.debugLine="Private Sub GetFileSizeSafe(dir As String, fileNam";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1684;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 1685;BA.debugLine="Dim fileDir As String = ResolveRelativeParentDir";
Debug.ShouldStop(1048576);
_filedir = __ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativeparentdir" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename));Debug.locals.put("fileDir", _filedir);Debug.locals.put("fileDir", _filedir);
 BA.debugLineNum = 1686;BA.debugLine="Dim leafName As String = ResolveRelativeLeafName";
Debug.ShouldStop(2097152);
_leafname = __ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativeleafname" /*RemoteObject*/ ,(Object)(_filename));Debug.locals.put("leafName", _leafname);Debug.locals.put("leafName", _leafname);
 BA.debugLineNum = 1687;BA.debugLine="Return File.Size(fileDir, leafName)";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) return mediacache.__c.getField(false,"File").runMethod(true,"Size",(Object)(_filedir),(Object)(_leafname));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 1689;BA.debugLine="Return 0";
Debug.ShouldStop(16777216);
if (true) return BA.numberCast(long.class, 0);
 };
 BA.debugLineNum = 1691;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getindexbyitemtype(RemoteObject __ref,RemoteObject _itemtype) throws Exception{
try {
		Debug.PushSubsStack("GetIndexByItemType (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1079);
if (RapidSub.canDelegate("getindexbyitemtype")) { return __ref.runUserSub(false, "mediacache","getindexbyitemtype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 1079;BA.debugLine="Private Sub GetIndexByItemType(itemType As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1080;BA.debugLine="If itemType = \"ad\" Then Return cachedAdIndex";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return __ref.getField(false,"_cachedadindex" /*RemoteObject*/ );};
 BA.debugLineNum = 1081;BA.debugLine="Return cachedTrackIndex";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 1082;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettrackplaylistdir(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("GetTrackPlaylistDir (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,741);
if (RapidSub.canDelegate("gettrackplaylistdir")) { return __ref.runUserSub(false, "mediacache","gettrackplaylistdir", __ref, _playlistid);}
RemoteObject _unusedplaylistid = RemoteObject.createImmutable("");
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 741;BA.debugLine="Private Sub GetTrackPlaylistDir(playlistId As Stri";
Debug.ShouldStop(16);
 BA.debugLineNum = 742;BA.debugLine="Dim unusedPlaylistId As String = playlistId";
Debug.ShouldStop(32);
_unusedplaylistid = _playlistid;Debug.locals.put("unusedPlaylistId", _unusedplaylistid);Debug.locals.put("unusedPlaylistId", _unusedplaylistid);
 BA.debugLineNum = 743;BA.debugLine="If unusedPlaylistId = \"\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_unusedplaylistid,BA.ObjectToString(""))) { 
 };
 BA.debugLineNum = 745;BA.debugLine="Return GetTracksDir";
Debug.ShouldStop(256);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ );
 BA.debugLineNum = 746;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettracksdir(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTracksDir (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("gettracksdir")) { return __ref.runUserSub(false, "mediacache","gettracksdir", __ref);}
 BA.debugLineNum = 200;BA.debugLine="Public Sub GetTracksDir As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
Debug.ShouldStop(256);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mediadirname" /*RemoteObject*/ )))),(Object)(__ref.getField(true,"_tracksdirname" /*RemoteObject*/ )));
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasanytrackfilesondisk(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasAnyTrackFilesOnDisk (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,277);
if (RapidSub.canDelegate("hasanytrackfilesondisk")) { return __ref.runUserSub(false, "mediacache","hasanytrackfilesondisk", __ref);}
RemoteObject _listedfiles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filename = RemoteObject.createImmutable("");
 BA.debugLineNum = 277;BA.debugLine="Public Sub HasAnyTrackFilesOnDisk As Boolean";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 278;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_directoryexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ ))),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 279;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 280;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRec";
Debug.ShouldStop(8388608);
_listedfiles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listedfiles = __ref.runClassMethod (b4j.example.mediacache.class, "_listtrackcachefilesrecursive" /*RemoteObject*/ );Debug.locals.put("listedFiles", _listedfiles);Debug.locals.put("listedFiles", _listedfiles);
 BA.debugLineNum = 281;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_listedfiles.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
Debug.CheckDeviceExceptions();if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 282;BA.debugLine="For Each fileName As String In listedFiles";
Debug.ShouldStop(33554432);
{
final RemoteObject group5 = _listedfiles;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_filename = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("fileName", _filename);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 283;BA.debugLine="If fileName = \"\" Then Continue";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 284;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
Debug.ShouldStop(134217728);
if (_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".tmp"))).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 285;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return mediacache.__c.getField(true,"True");
 }
}Debug.locals.put("fileName", _filename);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 288;BA.debugLine="Trace(\"Не удалось проверить наличие track файлов";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось проверить наличие track файлов на диске. message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 290;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) return mediacache.__c.getField(true,"False");
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
public static RemoteObject  _hastrackfilebyplaylist(RemoteObject __ref,RemoteObject _trackid,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("HasTrackFileByPlaylist (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,211);
if (RapidSub.canDelegate("hastrackfilebyplaylist")) { return __ref.runUserSub(false, "mediacache","hastrackfilebyplaylist", __ref, _trackid, _playlistid);}
Debug.locals.put("trackId", _trackid);
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 211;BA.debugLine="Public Sub HasTrackFileByPlaylist(trackId As Strin";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="If trackId = \"\" Then Return False";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 213;BA.debugLine="Return IsCachedFileUsable(GetTracksDir, BuildTrac";
Debug.ShouldStop(1048576);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcacherelativefilename" /*RemoteObject*/ ,(Object)(_trackid),(Object)(_playlistid))));
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasvalidatedlocalmedia(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("HasValidatedLocalMedia (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("hasvalidatedlocalmedia")) { return __ref.runUserSub(false, "mediacache","hasvalidatedlocalmedia", __ref, _item);}
RemoteObject _itemid = RemoteObject.createImmutable("");
RemoteObject _itemtype = RemoteObject.createImmutable("");
RemoteObject _preferredrelativename = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 174;BA.debugLine="Public Sub HasValidatedLocalMedia(item As Map) As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="If item.IsInitialized = False Then Return False";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 176;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(32768);
_itemid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemId", _itemid);Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 177;BA.debugLine="If itemId = \"\" Then Return False";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 178;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(131072);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 179;BA.debugLine="If itemType = \"ad\" Then Return ValidateIndexedFil";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ad")),(Object)(_itemid));};
 BA.debugLineNum = 180;BA.debugLine="If itemType = \"track\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
 BA.debugLineNum = 181;BA.debugLine="Dim preferredRelativeName As String = ResolveTra";
Debug.ShouldStop(1048576);
_preferredrelativename = __ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackrelativefilenamefromitem" /*RemoteObject*/ ,(Object)(_item));Debug.locals.put("preferredRelativeName", _preferredrelativename);Debug.locals.put("preferredRelativeName", _preferredrelativename);
 BA.debugLineNum = 182;BA.debugLine="If IsCachedFileUsable(GetTracksDir, preferredRel";
Debug.ShouldStop(2097152);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_preferredrelativename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 183;BA.debugLine="EnsureTrackIndexEntry(itemId, item.GetDefault(\"";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuretrackindexentry" /*RemoteObject*/ ,(Object)(_itemid),(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(_preferredrelativename));
 BA.debugLineNum = 184;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return mediacache.__c.getField(true,"True");
 };
 BA.debugLineNum = 186;BA.debugLine="Return ValidateIndexedFile(\"track\", itemId)";
Debug.ShouldStop(33554432);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("track")),(Object)(_itemid));
 };
 BA.debugLineNum = 188;BA.debugLine="Return False";
Debug.ShouldStop(134217728);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Initialize (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "mediacache","initialize", __ref, _ba, _storagedirvalue, _storagevalue, _targetmodulevalue, _tracesubnamevalue, _deviceidvalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("storageDirValue", _storagedirvalue);
Debug.locals.put("storageValue", _storagevalue);
Debug.locals.put("targetModuleValue", _targetmodulevalue);
Debug.locals.put("traceSubNameValue", _tracesubnamevalue);
Debug.locals.put("deviceIdValue", _deviceidvalue);
 BA.debugLineNum = 51;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="storageDir = storageDirValue";
Debug.ShouldStop(524288);
__ref.setField ("_storagedir" /*RemoteObject*/ ,_storagedirvalue);
 BA.debugLineNum = 53;BA.debugLine="storage = storageValue";
Debug.ShouldStop(1048576);
__ref.setField ("_storage" /*RemoteObject*/ ,_storagevalue);
 BA.debugLineNum = 54;BA.debugLine="targetModule = targetModuleValue";
Debug.ShouldStop(2097152);
__ref.setField ("_targetmodule" /*RemoteObject*/ ,_targetmodulevalue);
 BA.debugLineNum = 55;BA.debugLine="traceSubName = traceSubNameValue";
Debug.ShouldStop(4194304);
__ref.setField ("_tracesubname" /*RemoteObject*/ ,_tracesubnamevalue);
 BA.debugLineNum = 56;BA.debugLine="playbackTempTrackIds.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_playbacktemptrackids" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 57;BA.debugLine="cachedTrackPlaylistStats.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_cachedtrackplayliststats" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 58;BA.debugLine="cachedAdIndexDirty = False";
Debug.ShouldStop(33554432);
__ref.setField ("_cachedadindexdirty" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 59;BA.debugLine="cachedTrackIndexDirty = False";
Debug.ShouldStop(67108864);
__ref.setField ("_cachedtrackindexdirty" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="EnsureDirectory(GetAdsDir)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )));
 BA.debugLineNum = 61;BA.debugLine="EnsureDirectory(GetTracksDir)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )));
 BA.debugLineNum = 62;BA.debugLine="LoadIndexesFromStorage";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.mediacache.class, "_loadindexesfromstorage" /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("IsAdCached (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("isadcached")) { return __ref.runUserSub(false, "mediacache","isadcached", __ref, _adid);}
Debug.locals.put("adId", _adid);
 BA.debugLineNum = 191;BA.debugLine="Public Sub IsAdCached(adId As String) As Boolean";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="If adId = \"\" Then Return False";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 193;BA.debugLine="Return ValidateIndexedFile(\"ad\", adId)";
Debug.ShouldStop(1);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ad")),(Object)(_adid));
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("IsCacheAuditInProgress (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("iscacheauditinprogress")) { return __ref.runUserSub(false, "mediacache","iscacheauditinprogress", __ref);}
 BA.debugLineNum = 65;BA.debugLine="Public Sub IsCacheAuditInProgress As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Return cacheAuditInProgress";
Debug.ShouldStop(2);
if (true) return __ref.getField(true,"_cacheauditinprogress" /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("IsCachedFileUsable (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,748);
if (RapidSub.canDelegate("iscachedfileusable")) { return __ref.runUserSub(false, "mediacache","iscachedfileusable", __ref, _dir, _filename);}
RemoteObject _filedir = RemoteObject.createImmutable("");
RemoteObject _leafname = RemoteObject.createImmutable("");
Debug.locals.put("dir", _dir);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 748;BA.debugLine="Private Sub IsCachedFileUsable(dir As String, file";
Debug.ShouldStop(2048);
 BA.debugLineNum = 749;BA.debugLine="If fileName = \"\" Then Return False";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 750;BA.debugLine="Dim fileDir As String = ResolveRelativeParentDir(";
Debug.ShouldStop(8192);
_filedir = __ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativeparentdir" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename));Debug.locals.put("fileDir", _filedir);Debug.locals.put("fileDir", _filedir);
 BA.debugLineNum = 751;BA.debugLine="Dim leafName As String = ResolveRelativeLeafName(";
Debug.ShouldStop(16384);
_leafname = __ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativeleafname" /*RemoteObject*/ ,(Object)(_filename));Debug.locals.put("leafName", _leafname);Debug.locals.put("leafName", _leafname);
 BA.debugLineNum = 752;BA.debugLine="If File.Exists(fileDir, leafName) = False Then Re";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",mediacache.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_filedir),(Object)(_leafname)),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 753;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 754;BA.debugLine="If File.Size(fileDir, leafName) > 0 Then Return";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",mediacache.__c.getField(false,"File").runMethod(true,"Size",(Object)(_filedir),(Object)(_leafname)),BA.numberCast(long.class, 0))) { 
Debug.CheckDeviceExceptions();if (true) return mediacache.__c.getField(true,"True");};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 756;BA.debugLine="Trace(\"ошибка кэша context=file_size message=\" &";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("ошибка кэша context=file_size message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 758;BA.debugLine="DeleteFileIfExists(dir, fileName)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 759;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 760;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("IsMediaNetworkFailure (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1113);
if (RapidSub.canDelegate("ismedianetworkfailure")) { return __ref.runUserSub(false, "mediacache","ismedianetworkfailure", __ref, _errormessage);}
RemoteObject _text = RemoteObject.createImmutable("");
Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 1113;BA.debugLine="Private Sub IsMediaNetworkFailure(errorMessage As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1114;BA.debugLine="Dim text As String = errorMessage.ToLowerCase";
Debug.ShouldStop(33554432);
_text = _errormessage.runMethod(true,"toLowerCase");Debug.locals.put("text", _text);Debug.locals.put("text", _text);
 BA.debugLineNum = 1115;BA.debugLine="If text.Contains(\"timed out\") Then Return True";
Debug.ShouldStop(67108864);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("timed out"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 1116;BA.debugLine="If text.Contains(\"unknownhost\") Then Return True";
Debug.ShouldStop(134217728);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("unknownhost"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 1117;BA.debugLine="If text.Contains(\"refused\") Then Return True";
Debug.ShouldStop(268435456);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("refused"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 1118;BA.debugLine="If text.Contains(\"sslhandshakeexception\") Then Re";
Debug.ShouldStop(536870912);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("sslhandshakeexception"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 1119;BA.debugLine="If text.Contains(\"pkix path building failed\") The";
Debug.ShouldStop(1073741824);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("pkix path building failed"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 1120;BA.debugLine="If text.Contains(\"unable to find valid certificat";
Debug.ShouldStop(-2147483648);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("unable to find valid certification path"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 1121;BA.debugLine="If text.Contains(\"connectexception\") Then Return";
Debug.ShouldStop(1);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("connectexception"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 1122;BA.debugLine="If text.Contains(\"socketexception\") Then Return T";
Debug.ShouldStop(2);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("socketexception"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 1123;BA.debugLine="If text.Contains(\"sockettimeoutexception\") Then R";
Debug.ShouldStop(4);
if (_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("sockettimeoutexception"))).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 1124;BA.debugLine="Return False";
Debug.ShouldStop(8);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 1125;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("IsTrackCached (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("istrackcached")) { return __ref.runUserSub(false, "mediacache","istrackcached", __ref, _trackid);}
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 204;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
Debug.ShouldStop(2048);
 BA.debugLineNum = 205;BA.debugLine="If trackId = \"\" Then Return False";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 206;BA.debugLine="If ValidateIndexedFile(\"track\", trackId) Then Ret";
Debug.ShouldStop(8192);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("track")),(Object)(_trackid)).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 207;BA.debugLine="BackfillTrackIndexFromFiles";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.mediacache.class, "_backfilltrackindexfromfiles" /*RemoteObject*/ );
 BA.debugLineNum = 208;BA.debugLine="Return ValidateIndexedFile(\"track\", trackId)";
Debug.ShouldStop(32768);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_validateindexedfile" /*RemoteObject*/ ,(Object)(BA.ObjectToString("track")),(Object)(_trackid));
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listtrackcachefilesinto(RemoteObject __ref,RemoteObject _currentdir,RemoteObject _relativeprefix,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("ListTrackCacheFilesInto (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1601);
if (RapidSub.canDelegate("listtrackcachefilesinto")) { return __ref.runUserSub(false, "mediacache","listtrackcachefilesinto", __ref, _currentdir, _relativeprefix, _result);}
RemoteObject _listed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _childrelative = RemoteObject.createImmutable("");
RemoteObject _childpath = RemoteObject.createImmutable("");
Debug.locals.put("currentDir", _currentdir);
Debug.locals.put("relativePrefix", _relativeprefix);
Debug.locals.put("result", _result);
 BA.debugLineNum = 1601;BA.debugLine="Private Sub ListTrackCacheFilesInto(currentDir As";
Debug.ShouldStop(1);
 BA.debugLineNum = 1602;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 1603;BA.debugLine="If DirectoryExists(currentDir) = False Then Retu";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_directoryexists" /*RemoteObject*/ ,(Object)(_currentdir)),mediacache.__c.getField(true,"False"))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1604;BA.debugLine="Dim listed As List = File.ListFiles(currentDir)";
Debug.ShouldStop(8);
_listed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listed = mediacache.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_currentdir));Debug.locals.put("listed", _listed);Debug.locals.put("listed", _listed);
 BA.debugLineNum = 1605;BA.debugLine="If listed.IsInitialized = False Then Return";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_listed.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1606;BA.debugLine="For Each name As String In listed";
Debug.ShouldStop(32);
{
final RemoteObject group5 = _listed;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_name = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("name", _name);
Debug.locals.put("name", _name);
 BA.debugLineNum = 1607;BA.debugLine="Dim childRelative As String";
Debug.ShouldStop(64);
_childrelative = RemoteObject.createImmutable("");Debug.locals.put("childRelative", _childrelative);
 BA.debugLineNum = 1608;BA.debugLine="If relativePrefix = \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_relativeprefix,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1609;BA.debugLine="childRelative = name";
Debug.ShouldStop(256);
_childrelative = _name;Debug.locals.put("childRelative", _childrelative);
 }else {
 BA.debugLineNum = 1611;BA.debugLine="childRelative = File.Combine(relativePrefix, n";
Debug.ShouldStop(1024);
_childrelative = mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_relativeprefix),(Object)(_name));Debug.locals.put("childRelative", _childrelative);
 };
 BA.debugLineNum = 1613;BA.debugLine="Dim childPath As String = File.Combine(currentD";
Debug.ShouldStop(4096);
_childpath = mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_currentdir),(Object)(_name));Debug.locals.put("childPath", _childpath);Debug.locals.put("childPath", _childpath);
 BA.debugLineNum = 1614;BA.debugLine="If File.IsDirectory(currentDir, name) Then";
Debug.ShouldStop(8192);
if (mediacache.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_currentdir),(Object)(_name)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1615;BA.debugLine="ListTrackCacheFilesInto(childPath, childRelati";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.mediacache.class, "_listtrackcachefilesinto" /*RemoteObject*/ ,(Object)(_childpath),(Object)(_childrelative),(Object)(_result));
 }else {
 BA.debugLineNum = 1617;BA.debugLine="result.Add(childRelative)";
Debug.ShouldStop(65536);
_result.runVoidMethod ("Add",(Object)((_childrelative)));
 };
 }
}Debug.locals.put("name", _name);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e20.toString()); BA.debugLineNum = 1621;BA.debugLine="Trace(\"Не удалось получить список track cache фа";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось получить список track cache файлов. dir="),_currentdir,RemoteObject.createImmutable(", message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 1623;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listtrackcachefilesrecursive(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ListTrackCacheFilesRecursive (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1594);
if (RapidSub.canDelegate("listtrackcachefilesrecursive")) { return __ref.runUserSub(false, "mediacache","listtrackcachefilesrecursive", __ref);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 1594;BA.debugLine="Private Sub ListTrackCacheFilesRecursive As List";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1595;BA.debugLine="Dim result As List";
Debug.ShouldStop(67108864);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 1596;BA.debugLine="result.Initialize";
Debug.ShouldStop(134217728);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 1597;BA.debugLine="ListTrackCacheFilesInto(GetTracksDir, \"\", result)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.mediacache.class, "_listtrackcachefilesinto" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(_result));
 BA.debugLineNum = 1598;BA.debugLine="Return result";
Debug.ShouldStop(536870912);
if (true) return _result;
 BA.debugLineNum = 1599;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadcachestatssnapshot(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadCacheStatsSnapshot (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1722);
if (RapidSub.canDelegate("loadcachestatssnapshot")) { return __ref.runUserSub(false, "mediacache","loadcachestatssnapshot", __ref);}
 BA.debugLineNum = 1722;BA.debugLine="Private Sub LoadCacheStatsSnapshot";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1723;BA.debugLine="cachedTrackCount = storage.GetDefault(\"cache_stat";
Debug.ShouldStop(67108864);
__ref.setField ("_cachedtrackcount" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache_stats_track_count")),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 1724;BA.debugLine="cachedAdCount = storage.GetDefault(\"cache_stats_a";
Debug.ShouldStop(134217728);
__ref.setField ("_cachedadcount" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache_stats_ad_count")),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 1725;BA.debugLine="cachedTrackBytes = ToLongDefault(storage.GetDefau";
Debug.ShouldStop(268435456);
__ref.setField ("_cachedtrackbytes" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.mediacache.class, "_tolongdefault" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache_stats_track_bytes")),(Object)(RemoteObject.createImmutable((0))))),(Object)(BA.numberCast(long.class, 0))));
 BA.debugLineNum = 1726;BA.debugLine="cachedAdBytes = ToLongDefault(storage.GetDefault(";
Debug.ShouldStop(536870912);
__ref.setField ("_cachedadbytes" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.mediacache.class, "_tolongdefault" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache_stats_ad_bytes")),(Object)(RemoteObject.createImmutable((0))))),(Object)(BA.numberCast(long.class, 0))));
 BA.debugLineNum = 1727;BA.debugLine="cachedTrackPlaylistStats = storage.GetDefault(\"ca";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_cachedtrackplayliststats" /*RemoteObject*/ ).setObject (__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache_stats_track_playlist")),(Object)(mediacache.__c.getField(false,"Null"))));
 BA.debugLineNum = 1728;BA.debugLine="If cachedTrackPlaylistStats.IsInitialized = False";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackplayliststats" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
__ref.getField(false,"_cachedtrackplayliststats" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 1729;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadglobaltrackfilemap(RemoteObject __ref,RemoteObject _playlisttrackmaps) throws Exception{
try {
		Debug.PushSubsStack("LoadGlobalTrackFileMap (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1335);
if (RapidSub.canDelegate("loadglobaltrackfilemap")) { return __ref.runUserSub(false, "mediacache","loadglobaltrackfilemap", __ref, _playlisttrackmaps);}
RemoteObject _emptymap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cachekey = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistsdir = RemoteObject.createImmutable("");
RemoteObject _listed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _playlisttrackmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _relativename = RemoteObject.createImmutable("");
Debug.locals.put("playlistTrackMaps", _playlisttrackmaps);
 BA.debugLineNum = 1335;BA.debugLine="Private Sub LoadGlobalTrackFileMap(playlistTrackMa";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1336;BA.debugLine="Dim emptyMap As Map";
Debug.ShouldStop(8388608);
_emptymap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyMap", _emptymap);
 BA.debugLineNum = 1337;BA.debugLine="emptyMap.Initialize";
Debug.ShouldStop(16777216);
_emptymap.runVoidMethod ("Initialize");
 BA.debugLineNum = 1338;BA.debugLine="Dim cacheKey As String = \"__global_track_file_map";
Debug.ShouldStop(33554432);
_cachekey = BA.ObjectToString("__global_track_file_map__");Debug.locals.put("cacheKey", _cachekey);Debug.locals.put("cacheKey", _cachekey);
 BA.debugLineNum = 1339;BA.debugLine="If playlistTrackMaps.ContainsKey(cacheKey) Then R";
Debug.ShouldStop(67108864);
if (_playlisttrackmaps.runMethod(true,"ContainsKey",(Object)((_cachekey))).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlisttrackmaps.runMethod(false,"Get",(Object)((_cachekey))));};
 BA.debugLineNum = 1340;BA.debugLine="Dim result As Map";
Debug.ShouldStop(134217728);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 1341;BA.debugLine="result.Initialize";
Debug.ShouldStop(268435456);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 1342;BA.debugLine="Dim playlistsDir As String = File.Combine(storage";
Debug.ShouldStop(536870912);
_playlistsdir = mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("playlists")));Debug.locals.put("playlistsDir", _playlistsdir);Debug.locals.put("playlistsDir", _playlistsdir);
 BA.debugLineNum = 1343;BA.debugLine="If DirectoryExists(playlistsDir) = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_directoryexists" /*RemoteObject*/ ,(Object)(_playlistsdir)),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1344;BA.debugLine="playlistTrackMaps.Put(cacheKey, result)";
Debug.ShouldStop(-2147483648);
_playlisttrackmaps.runVoidMethod ("Put",(Object)((_cachekey)),(Object)((_result.getObject())));
 BA.debugLineNum = 1345;BA.debugLine="Return result";
Debug.ShouldStop(1);
if (true) return _result;
 };
 BA.debugLineNum = 1347;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 1348;BA.debugLine="Dim listed As List = File.ListFiles(playlistsDir";
Debug.ShouldStop(8);
_listed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listed = mediacache.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_playlistsdir));Debug.locals.put("listed", _listed);Debug.locals.put("listed", _listed);
 BA.debugLineNum = 1349;BA.debugLine="If listed.IsInitialized Then";
Debug.ShouldStop(16);
if (_listed.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1350;BA.debugLine="For Each fileName As String In listed";
Debug.ShouldStop(32);
{
final RemoteObject group15 = _listed;
final int groupLen15 = group15.runMethod(true,"getSize").<Integer>get()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_filename = BA.ObjectToString(group15.runMethod(false,"Get",index15));Debug.locals.put("fileName", _filename);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 1351;BA.debugLine="If fileName = \"\" Then Continue";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 1352;BA.debugLine="If fileName.ToLowerCase.EndsWith(\".json\") = Fa";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_filename.runMethod(true,"toLowerCase").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".json"))),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 1353;BA.debugLine="Dim playlistId As String = fileName.SubString2";
Debug.ShouldStop(256);
_playlistid = _filename.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_filename.runMethod(true,"length"),RemoteObject.createImmutable(5)}, "-",1, 1)));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 1354;BA.debugLine="If playlistId = \"\" Then Continue";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 1355;BA.debugLine="Dim playlistTrackMap As Map = LoadPlaylistTrac";
Debug.ShouldStop(1024);
_playlisttrackmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlisttrackmap = __ref.runClassMethod (b4j.example.mediacache.class, "_loadplaylisttrackfilemap" /*RemoteObject*/ ,(Object)(_playlistid),(Object)(_playlisttrackmaps));Debug.locals.put("playlistTrackMap", _playlisttrackmap);Debug.locals.put("playlistTrackMap", _playlisttrackmap);
 BA.debugLineNum = 1356;BA.debugLine="If playlistTrackMap.IsInitialized = False Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_playlisttrackmap.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 1357;BA.debugLine="For Each relativeName As String In playlistTra";
Debug.ShouldStop(4096);
{
final RemoteObject group22 = _playlisttrackmap.runMethod(false,"Keys");
final int groupLen22 = group22.runMethod(true,"getSize").<Integer>get()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_relativename = BA.ObjectToString(group22.runMethod(false,"Get",index22));Debug.locals.put("relativeName", _relativename);
Debug.locals.put("relativeName", _relativename);
 BA.debugLineNum = 1358;BA.debugLine="If result.ContainsKey(relativeName) Then Cont";
Debug.ShouldStop(8192);
if (_result.runMethod(true,"ContainsKey",(Object)((_relativename))).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 1359;BA.debugLine="result.Put(relativeName, playlistTrackMap.Get";
Debug.ShouldStop(16384);
_result.runVoidMethod ("Put",(Object)((_relativename)),(Object)(_playlisttrackmap.runMethod(false,"Get",(Object)((_relativename)))));
 }
}Debug.locals.put("relativeName", _relativename);
;
 }
}Debug.locals.put("fileName", _filename);
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e29) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e29.toString()); BA.debugLineNum = 1364;BA.debugLine="Trace(\"Не удалось восстановить глобальную track";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось восстановить глобальную track map по playlist metadata. message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 1366;BA.debugLine="playlistTrackMaps.Put(cacheKey, result)";
Debug.ShouldStop(2097152);
_playlisttrackmaps.runVoidMethod ("Put",(Object)((_cachekey)),(Object)((_result.getObject())));
 BA.debugLineNum = 1367;BA.debugLine="Return result";
Debug.ShouldStop(4194304);
if (true) return _result;
 BA.debugLineNum = 1368;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadindexesfromstorage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadIndexesFromStorage (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,684);
if (RapidSub.canDelegate("loadindexesfromstorage")) { return __ref.runUserSub(false, "mediacache","loadindexesfromstorage", __ref);}
 BA.debugLineNum = 684;BA.debugLine="Private Sub LoadIndexesFromStorage";
Debug.ShouldStop(2048);
 BA.debugLineNum = 685;BA.debugLine="cachedAdIndex = storage.GetDefault(\"cached_ad_ind";
Debug.ShouldStop(4096);
__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).setObject (__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_index")),(Object)(mediacache.__c.getField(false,"Null"))));
 BA.debugLineNum = 686;BA.debugLine="If cachedAdIndex.IsInitialized = False Then cache";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 687;BA.debugLine="cachedTrackIndex = storage.GetDefault(\"cached_tra";
Debug.ShouldStop(16384);
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).setObject (__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_track_index")),(Object)(mediacache.__c.getField(false,"Null"))));
 BA.debugLineNum = 688;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 689;BA.debugLine="LoadCacheStatsSnapshot";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.mediacache.class, "_loadcachestatssnapshot" /*RemoteObject*/ );
 BA.debugLineNum = 690;BA.debugLine="MigrateLegacyTrackCacheLayout";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.mediacache.class, "_migratelegacytrackcachelayout" /*RemoteObject*/ );
 BA.debugLineNum = 691;BA.debugLine="NormalizeTrackIndexFileNames(cachedTrackIndex)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.mediacache.class, "_normalizetrackindexfilenames" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ )));
 BA.debugLineNum = 692;BA.debugLine="BackfillTrackIndexFromFiles";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.mediacache.class, "_backfilltrackindexfromfiles" /*RemoteObject*/ );
 BA.debugLineNum = 693;BA.debugLine="RebuildCacheStatsFromIndexes";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.mediacache.class, "_rebuildcachestatsfromindexes" /*RemoteObject*/ );
 BA.debugLineNum = 694;BA.debugLine="SaveCacheStatsSnapshot";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.mediacache.class, "_savecachestatssnapshot" /*RemoteObject*/ );
 BA.debugLineNum = 695;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadplaylisttrackfilemap(RemoteObject __ref,RemoteObject _playlistid,RemoteObject _playlisttrackmaps) throws Exception{
try {
		Debug.PushSubsStack("LoadPlaylistTrackFileMap (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1501);
if (RapidSub.canDelegate("loadplaylisttrackfilemap")) { return __ref.runUserSub(false, "mediacache","loadplaylisttrackfilemap", __ref, _playlistid, _playlisttrackmaps);}
RemoteObject _emptymap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistsdir = RemoteObject.createImmutable("");
RemoteObject _metadatafilename = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _playlistdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _trackobject = RemoteObject.declareNull("Object");
RemoteObject _track = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackid = RemoteObject.createImmutable("");
Debug.locals.put("playlistId", _playlistid);
Debug.locals.put("playlistTrackMaps", _playlisttrackmaps);
 BA.debugLineNum = 1501;BA.debugLine="Private Sub LoadPlaylistTrackFileMap(playlistId As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1502;BA.debugLine="Dim emptyMap As Map";
Debug.ShouldStop(536870912);
_emptymap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyMap", _emptymap);
 BA.debugLineNum = 1503;BA.debugLine="emptyMap.Initialize";
Debug.ShouldStop(1073741824);
_emptymap.runVoidMethod ("Initialize");
 BA.debugLineNum = 1504;BA.debugLine="If playlistId = \"\" Then Return emptyMap";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) return _emptymap;};
 BA.debugLineNum = 1505;BA.debugLine="If playlistTrackMaps.ContainsKey(playlistId) Then";
Debug.ShouldStop(1);
if (_playlisttrackmaps.runMethod(true,"ContainsKey",(Object)((_playlistid))).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlisttrackmaps.runMethod(false,"Get",(Object)((_playlistid))));};
 BA.debugLineNum = 1506;BA.debugLine="Dim result As Map";
Debug.ShouldStop(2);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 1507;BA.debugLine="result.Initialize";
Debug.ShouldStop(4);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 1508;BA.debugLine="Dim playlistsDir As String = File.Combine(storage";
Debug.ShouldStop(8);
_playlistsdir = mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("playlists")));Debug.locals.put("playlistsDir", _playlistsdir);Debug.locals.put("playlistsDir", _playlistsdir);
 BA.debugLineNum = 1509;BA.debugLine="Dim metadataFileName As String = playlistId & \".j";
Debug.ShouldStop(16);
_metadatafilename = RemoteObject.concat(_playlistid,RemoteObject.createImmutable(".json"));Debug.locals.put("metadataFileName", _metadatafilename);Debug.locals.put("metadataFileName", _metadatafilename);
 BA.debugLineNum = 1510;BA.debugLine="If File.Exists(playlistsDir, metadataFileName) =";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",mediacache.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_playlistsdir),(Object)(_metadatafilename)),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1511;BA.debugLine="playlistTrackMaps.Put(playlistId, result)";
Debug.ShouldStop(64);
_playlisttrackmaps.runVoidMethod ("Put",(Object)((_playlistid)),(Object)((_result.getObject())));
 BA.debugLineNum = 1512;BA.debugLine="Return result";
Debug.ShouldStop(128);
if (true) return _result;
 };
 BA.debugLineNum = 1514;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 1515;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1024);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1516;BA.debugLine="parser.Initialize(File.ReadString(playlistsDir,";
Debug.ShouldStop(2048);
_parser.runVoidMethod ("Initialize",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(_playlistsdir),(Object)(_metadatafilename))));
 BA.debugLineNum = 1517;BA.debugLine="Dim playlistData As Map = parser.NextObject";
Debug.ShouldStop(4096);
_playlistdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistdata = _parser.runMethod(false,"NextObject");Debug.locals.put("playlistData", _playlistdata);Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 1518;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tr";
Debug.ShouldStop(8192);
_tracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tracks = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _playlistdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("tracks", _tracks);Debug.locals.put("tracks", _tracks);
 BA.debugLineNum = 1519;BA.debugLine="If tracks.IsInitialized Then";
Debug.ShouldStop(16384);
if (_tracks.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1520;BA.debugLine="For Each trackObject As Object In tracks";
Debug.ShouldStop(32768);
{
final RemoteObject group19 = _tracks;
final int groupLen19 = group19.runMethod(true,"getSize").<Integer>get()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_trackobject = group19.runMethod(false,"Get",index19);Debug.locals.put("trackObject", _trackobject);
Debug.locals.put("trackObject", _trackobject);
 BA.debugLineNum = 1521;BA.debugLine="If (trackObject Is Map) = False Then Continue";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_trackobject, RemoteObject.createImmutable("java.util.Map")))),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 1522;BA.debugLine="Dim track As Map = trackObject";
Debug.ShouldStop(131072);
_track = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_track = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackobject);Debug.locals.put("track", _track);Debug.locals.put("track", _track);
 BA.debugLineNum = 1523;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
Debug.ShouldStop(262144);
_trackid = BA.ObjectToString(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 1524;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 1525;BA.debugLine="result.Put(BuildTrackCacheRelativeFileName(tra";
Debug.ShouldStop(1048576);
_result.runVoidMethod ("Put",(Object)((__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcacherelativefilename" /*RemoteObject*/ ,(Object)(_trackid),(Object)(_playlistid)))),(Object)((_trackid)));
 }
}Debug.locals.put("trackObject", _trackobject);
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e28) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e28.toString()); BA.debugLineNum = 1529;BA.debugLine="Trace(\"Не удалось восстановить track map по play";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось восстановить track map по playlist metadata. playlistId="),_playlistid,RemoteObject.createImmutable(", message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 1531;BA.debugLine="playlistTrackMaps.Put(playlistId, result)";
Debug.ShouldStop(67108864);
_playlisttrackmaps.runVoidMethod ("Put",(Object)((_playlistid)),(Object)((_result.getObject())));
 BA.debugLineNum = 1532;BA.debugLine="Return result";
Debug.ShouldStop(134217728);
if (true) return _result;
 BA.debugLineNum = 1533;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadplaylisttrackidmap(RemoteObject __ref,RemoteObject _playlistid,RemoteObject _playlisttrackmaps) throws Exception{
try {
		Debug.PushSubsStack("LoadPlaylistTrackIdMap (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1466);
if (RapidSub.canDelegate("loadplaylisttrackidmap")) { return __ref.runUserSub(false, "mediacache","loadplaylisttrackidmap", __ref, _playlistid, _playlisttrackmaps);}
RemoteObject _emptymap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cachekey = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistsdir = RemoteObject.createImmutable("");
RemoteObject _metadatafilename = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _playlistdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _trackobject = RemoteObject.declareNull("Object");
RemoteObject _track = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackid = RemoteObject.createImmutable("");
Debug.locals.put("playlistId", _playlistid);
Debug.locals.put("playlistTrackMaps", _playlisttrackmaps);
 BA.debugLineNum = 1466;BA.debugLine="Private Sub LoadPlaylistTrackIdMap(playlistId As S";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1467;BA.debugLine="Dim emptyMap As Map";
Debug.ShouldStop(67108864);
_emptymap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyMap", _emptymap);
 BA.debugLineNum = 1468;BA.debugLine="emptyMap.Initialize";
Debug.ShouldStop(134217728);
_emptymap.runVoidMethod ("Initialize");
 BA.debugLineNum = 1469;BA.debugLine="If playlistId = \"\" Then Return emptyMap";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) return _emptymap;};
 BA.debugLineNum = 1470;BA.debugLine="Dim cacheKey As String = \"ids:\" & playlistId";
Debug.ShouldStop(536870912);
_cachekey = RemoteObject.concat(RemoteObject.createImmutable("ids:"),_playlistid);Debug.locals.put("cacheKey", _cachekey);Debug.locals.put("cacheKey", _cachekey);
 BA.debugLineNum = 1471;BA.debugLine="If playlistTrackMaps.ContainsKey(cacheKey) Then R";
Debug.ShouldStop(1073741824);
if (_playlisttrackmaps.runMethod(true,"ContainsKey",(Object)((_cachekey))).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlisttrackmaps.runMethod(false,"Get",(Object)((_cachekey))));};
 BA.debugLineNum = 1472;BA.debugLine="Dim result As Map";
Debug.ShouldStop(-2147483648);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 1473;BA.debugLine="result.Initialize";
Debug.ShouldStop(1);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 1474;BA.debugLine="Dim playlistsDir As String = File.Combine(storage";
Debug.ShouldStop(2);
_playlistsdir = mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("playlists")));Debug.locals.put("playlistsDir", _playlistsdir);Debug.locals.put("playlistsDir", _playlistsdir);
 BA.debugLineNum = 1475;BA.debugLine="Dim metadataFileName As String = playlistId & \".j";
Debug.ShouldStop(4);
_metadatafilename = RemoteObject.concat(_playlistid,RemoteObject.createImmutable(".json"));Debug.locals.put("metadataFileName", _metadatafilename);Debug.locals.put("metadataFileName", _metadatafilename);
 BA.debugLineNum = 1476;BA.debugLine="If File.Exists(playlistsDir, metadataFileName) =";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",mediacache.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_playlistsdir),(Object)(_metadatafilename)),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1477;BA.debugLine="playlistTrackMaps.Put(cacheKey, result)";
Debug.ShouldStop(16);
_playlisttrackmaps.runVoidMethod ("Put",(Object)((_cachekey)),(Object)((_result.getObject())));
 BA.debugLineNum = 1478;BA.debugLine="Return result";
Debug.ShouldStop(32);
if (true) return _result;
 };
 BA.debugLineNum = 1480;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 1481;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1482;BA.debugLine="parser.Initialize(File.ReadString(playlistsDir,";
Debug.ShouldStop(512);
_parser.runVoidMethod ("Initialize",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(_playlistsdir),(Object)(_metadatafilename))));
 BA.debugLineNum = 1483;BA.debugLine="Dim playlistData As Map = parser.NextObject";
Debug.ShouldStop(1024);
_playlistdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistdata = _parser.runMethod(false,"NextObject");Debug.locals.put("playlistData", _playlistdata);Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 1484;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tr";
Debug.ShouldStop(2048);
_tracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tracks = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _playlistdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("tracks", _tracks);Debug.locals.put("tracks", _tracks);
 BA.debugLineNum = 1485;BA.debugLine="If tracks.IsInitialized Then";
Debug.ShouldStop(4096);
if (_tracks.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1486;BA.debugLine="For Each trackObject As Object In tracks";
Debug.ShouldStop(8192);
{
final RemoteObject group20 = _tracks;
final int groupLen20 = group20.runMethod(true,"getSize").<Integer>get()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_trackobject = group20.runMethod(false,"Get",index20);Debug.locals.put("trackObject", _trackobject);
Debug.locals.put("trackObject", _trackobject);
 BA.debugLineNum = 1487;BA.debugLine="If (trackObject Is Map) = False Then Continue";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_trackobject, RemoteObject.createImmutable("java.util.Map")))),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 1488;BA.debugLine="Dim track As Map = trackObject";
Debug.ShouldStop(32768);
_track = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_track = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackobject);Debug.locals.put("track", _track);Debug.locals.put("track", _track);
 BA.debugLineNum = 1489;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
Debug.ShouldStop(65536);
_trackid = BA.ObjectToString(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 1490;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 1491;BA.debugLine="result.Put(trackId, True)";
Debug.ShouldStop(262144);
_result.runVoidMethod ("Put",(Object)((_trackid)),(Object)((mediacache.__c.getField(true,"True"))));
 }
}Debug.locals.put("trackObject", _trackobject);
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e29) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e29.toString()); BA.debugLineNum = 1495;BA.debugLine="Trace(\"Не удалось восстановить track id map по p";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось восстановить track id map по playlist metadata. playlistId="),_playlistid,RemoteObject.createImmutable(", message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 1497;BA.debugLine="playlistTrackMaps.Put(cacheKey, result)";
Debug.ShouldStop(16777216);
_playlisttrackmaps.runVoidMethod ("Put",(Object)((_cachekey)),(Object)((_result.getObject())));
 BA.debugLineNum = 1498;BA.debugLine="Return result";
Debug.ShouldStop(33554432);
if (true) return _result;
 BA.debugLineNum = 1499;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _markauditindexchanged(RemoteObject __ref,RemoteObject _itemtype) throws Exception{
try {
		Debug.PushSubsStack("MarkAuditIndexChanged (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1264);
if (RapidSub.canDelegate("markauditindexchanged")) { return __ref.runUserSub(false, "mediacache","markauditindexchanged", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 1264;BA.debugLine="Private Sub MarkAuditIndexChanged(itemType As Stri";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1265;BA.debugLine="If itemType = \"ads\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ads"))) { 
 BA.debugLineNum = 1266;BA.debugLine="cacheAuditAdIndexChanged = True";
Debug.ShouldStop(131072);
__ref.setField ("_cacheauditadindexchanged" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 BA.debugLineNum = 1267;BA.debugLine="cachedAdIndexDirty = True";
Debug.ShouldStop(262144);
__ref.setField ("_cachedadindexdirty" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 1269;BA.debugLine="cacheAuditTrackIndexChanged = True";
Debug.ShouldStop(1048576);
__ref.setField ("_cacheaudittrackindexchanged" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 BA.debugLineNum = 1270;BA.debugLine="cachedTrackIndexDirty = True";
Debug.ShouldStop(2097152);
__ref.setField ("_cachedtrackindexdirty" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1272;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mbtobytes(RemoteObject __ref,RemoteObject _valuemb) throws Exception{
try {
		Debug.PushSubsStack("MbToBytes (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1805);
if (RapidSub.canDelegate("mbtobytes")) { return __ref.runUserSub(false, "mediacache","mbtobytes", __ref, _valuemb);}
Debug.locals.put("valueMb", _valuemb);
 BA.debugLineNum = 1805;BA.debugLine="Private Sub MbToBytes(valueMb As Long) As Long";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1806;BA.debugLine="Return valueMb * 1024 * 1024";
Debug.ShouldStop(8192);
if (true) return RemoteObject.solve(new RemoteObject[] {_valuemb,RemoteObject.createImmutable(1024),RemoteObject.createImmutable(1024)}, "**",0, 2);
 BA.debugLineNum = 1807;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _migratelegacytrackcachelayout(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MigrateLegacyTrackCacheLayout (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,839);
if (RapidSub.canDelegate("migratelegacytrackcachelayout")) { return __ref.runUserSub(false, "mediacache","migratelegacytrackcachelayout", __ref);}
RemoteObject _listedfiles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _migratedcount = RemoteObject.createImmutable(0);
RemoteObject _relativefilename = RemoteObject.createImmutable("");
RemoteObject _flatfilename = RemoteObject.createImmutable("");
 BA.debugLineNum = 839;BA.debugLine="Private Sub MigrateLegacyTrackCacheLayout";
Debug.ShouldStop(64);
 BA.debugLineNum = 840;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_directoryexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ ))),mediacache.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 841;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRecu";
Debug.ShouldStop(256);
_listedfiles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listedfiles = __ref.runClassMethod (b4j.example.mediacache.class, "_listtrackcachefilesrecursive" /*RemoteObject*/ );Debug.locals.put("listedFiles", _listedfiles);Debug.locals.put("listedFiles", _listedfiles);
 BA.debugLineNum = 842;BA.debugLine="If listedFiles.IsInitialized = False Or listedFil";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_listedfiles.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_listedfiles.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 843;BA.debugLine="Dim migratedCount As Int = 0";
Debug.ShouldStop(1024);
_migratedcount = BA.numberCast(int.class, 0);Debug.locals.put("migratedCount", _migratedcount);Debug.locals.put("migratedCount", _migratedcount);
 BA.debugLineNum = 844;BA.debugLine="For Each relativeFileName As String In listedFile";
Debug.ShouldStop(2048);
{
final RemoteObject group5 = _listedfiles;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_relativefilename = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("relativeFileName", _relativefilename);
Debug.locals.put("relativeFileName", _relativefilename);
 BA.debugLineNum = 845;BA.debugLine="If relativeFileName = \"\" Or relativeFileName.End";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_relativefilename,BA.ObjectToString("")) || RemoteObject.solveBoolean(".",_relativefilename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".tmp"))))) { 
if (true) continue;};
 BA.debugLineNum = 846;BA.debugLine="If relativeFileName.Contains(\"/\") = False And re";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_relativefilename.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("/"))),mediacache.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_relativefilename.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("\\"))),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 847;BA.debugLine="Dim flatFileName As String = ResolveRelativeLeaf";
Debug.ShouldStop(16384);
_flatfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativeleafname" /*RemoteObject*/ ,(Object)(_relativefilename));Debug.locals.put("flatFileName", _flatfilename);Debug.locals.put("flatFileName", _flatfilename);
 BA.debugLineNum = 848;BA.debugLine="If flatFileName = \"\" Then Continue";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_flatfilename,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 849;BA.debugLine="If MoveLegacyTrackFileToFlat(relativeFileName, f";
Debug.ShouldStop(65536);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_movelegacytrackfiletoflat" /*RemoteObject*/ ,(Object)(_relativefilename),(Object)(_flatfilename)).<Boolean>get().booleanValue()) { 
_migratedcount = RemoteObject.solve(new RemoteObject[] {_migratedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("migratedCount", _migratedcount);};
 }
}Debug.locals.put("relativeFileName", _relativefilename);
;
 BA.debugLineNum = 851;BA.debugLine="If migratedCount > 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_migratedcount,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 852;BA.debugLine="Trace(\"Миграция кэша треков в плоскую структуру";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Миграция кэша треков в плоскую структуру завершена. moved="),_migratedcount)));
 };
 BA.debugLineNum = 854;BA.debugLine="CleanupLegacyTrackSubdirs";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.mediacache.class, "_cleanuplegacytracksubdirs" /*RemoteObject*/ );
 BA.debugLineNum = 855;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _movelegacytrackfiletoflat(RemoteObject __ref,RemoteObject _sourcerelativename,RemoteObject _flatfilename) throws Exception{
try {
		Debug.PushSubsStack("MoveLegacyTrackFileToFlat (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,857);
if (RapidSub.canDelegate("movelegacytrackfiletoflat")) { return __ref.runUserSub(false, "mediacache","movelegacytrackfiletoflat", __ref, _sourcerelativename, _flatfilename);}
RemoteObject _sourcedir = RemoteObject.createImmutable("");
RemoteObject _sourceleaf = RemoteObject.createImmutable("");
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _outputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("sourceRelativeName", _sourcerelativename);
Debug.locals.put("flatFileName", _flatfilename);
 BA.debugLineNum = 857;BA.debugLine="Private Sub MoveLegacyTrackFileToFlat(sourceRelati";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 858;BA.debugLine="If sourceRelativeName = \"\" Or flatFileName = \"\" T";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_sourcerelativename,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_flatfilename,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 859;BA.debugLine="If IsCachedFileUsable(GetTracksDir, sourceRelativ";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_sourcerelativename)),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 860;BA.debugLine="If IsCachedFileUsable(GetTracksDir, flatFileName)";
Debug.ShouldStop(134217728);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_flatfilename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 861;BA.debugLine="DeleteFileIfExists(GetTracksDir, sourceRelativeN";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_sourcerelativename));
 BA.debugLineNum = 862;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) return mediacache.__c.getField(true,"False");
 };
 BA.debugLineNum = 864;BA.debugLine="Dim sourceDir As String = ResolveRelativeParentDi";
Debug.ShouldStop(-2147483648);
_sourcedir = __ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativeparentdir" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_sourcerelativename));Debug.locals.put("sourceDir", _sourcedir);Debug.locals.put("sourceDir", _sourcedir);
 BA.debugLineNum = 865;BA.debugLine="Dim sourceLeaf As String = ResolveRelativeLeafNam";
Debug.ShouldStop(1);
_sourceleaf = __ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativeleafname" /*RemoteObject*/ ,(Object)(_sourcerelativename));Debug.locals.put("sourceLeaf", _sourceleaf);Debug.locals.put("sourceLeaf", _sourceleaf);
 BA.debugLineNum = 866;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(2);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 867;BA.debugLine="Dim outputStream As OutputStream";
Debug.ShouldStop(4);
_outputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("outputStream", _outputstream);
 BA.debugLineNum = 868;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 869;BA.debugLine="inputStream = File.OpenInput(sourceDir, sourceLe";
Debug.ShouldStop(16);
_inputstream = mediacache.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_sourcedir),(Object)(_sourceleaf));Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 870;BA.debugLine="outputStream = File.OpenOutput(GetTracksDir, fla";
Debug.ShouldStop(32);
_outputstream = mediacache.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_flatfilename),(Object)(mediacache.__c.getField(true,"False")));Debug.locals.put("outputStream", _outputstream);
 BA.debugLineNum = 871;BA.debugLine="File.Copy2(inputStream, outputStream)";
Debug.ShouldStop(64);
mediacache.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_inputstream.getObject())),(Object)((_outputstream.getObject())));
 BA.debugLineNum = 872;BA.debugLine="outputStream.Close";
Debug.ShouldStop(128);
_outputstream.runVoidMethod ("Close");
 BA.debugLineNum = 873;BA.debugLine="inputStream.Close";
Debug.ShouldStop(256);
_inputstream.runVoidMethod ("Close");
 BA.debugLineNum = 874;BA.debugLine="If IsCachedFileUsable(GetTracksDir, flatFileName";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_flatfilename)),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 875;BA.debugLine="DeleteFileIfExists(GetTracksDir, flatFileName)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_flatfilename));
 BA.debugLineNum = 876;BA.debugLine="Return False";
Debug.ShouldStop(2048);
Debug.CheckDeviceExceptions();if (true) return mediacache.__c.getField(true,"False");
 };
 BA.debugLineNum = 878;BA.debugLine="DeleteFileIfExists(GetTracksDir, sourceRelativeN";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_sourcerelativename));
 BA.debugLineNum = 879;BA.debugLine="Return True";
Debug.ShouldStop(16384);
Debug.CheckDeviceExceptions();if (true) return mediacache.__c.getField(true,"True");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e24) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e24.toString()); BA.debugLineNum = 881;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 882;BA.debugLine="If outputStream.IsInitialized Then outputStream";
Debug.ShouldStop(131072);
if (_outputstream.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_outputstream.runVoidMethod ("Close");};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e27.toString()); BA.debugLineNum = 884;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(524288);
mediacache.__c.runVoidMethod ("LogImpl","284344859",mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 886;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 887;BA.debugLine="If inputStream.IsInitialized Then inputStream.C";
Debug.ShouldStop(4194304);
if (_inputstream.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_inputstream.runVoidMethod ("Close");};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e32) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e32.toString()); BA.debugLineNum = 889;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(16777216);
mediacache.__c.runVoidMethod ("LogImpl","284344864",mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 891;BA.debugLine="DeleteFileIfExists(GetTracksDir, flatFileName)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_flatfilename));
 BA.debugLineNum = 892;BA.debugLine="Trace(\"Не удалось переместить legacy track cache";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось переместить legacy track cache файл. source="),_sourcerelativename,RemoteObject.createImmutable(", message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 BA.debugLineNum = 893;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) return mediacache.__c.getField(true,"False");
 };
 BA.debugLineNum = 895;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _normalizetrackindexfilenames(RemoteObject __ref,RemoteObject _trackindex) throws Exception{
try {
		Debug.PushSubsStack("NormalizeTrackIndexFileNames (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1370);
if (RapidSub.canDelegate("normalizetrackindexfilenames")) { return __ref.runUserSub(false, "mediacache","normalizetrackindexfilenames", __ref, _trackindex);}
RemoteObject _changed = RemoteObject.createImmutable(false);
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _canonicalfilename = RemoteObject.createImmutable("");
RemoteObject _storedfilename = RemoteObject.createImmutable("");
Debug.locals.put("trackIndex", _trackindex);
 BA.debugLineNum = 1370;BA.debugLine="Private Sub NormalizeTrackIndexFileNames(trackInde";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1371;BA.debugLine="If trackIndex.IsInitialized = False Then Return";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_trackindex.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1372;BA.debugLine="Dim changed As Boolean = False";
Debug.ShouldStop(134217728);
_changed = mediacache.__c.getField(true,"False");Debug.locals.put("changed", _changed);Debug.locals.put("changed", _changed);
 BA.debugLineNum = 1373;BA.debugLine="For Each trackId As String In trackIndex.Keys";
Debug.ShouldStop(268435456);
{
final RemoteObject group3 = _trackindex.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_trackid = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("trackId", _trackid);
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 1374;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId";
Debug.ShouldStop(536870912);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackindex.runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 1375;BA.debugLine="If entry.IsInitialized = False Then Continue";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 1376;BA.debugLine="Dim playlistId As String = entry.GetDefault(\"pla";
Debug.ShouldStop(-2147483648);
_playlistid = BA.ObjectToString(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 1377;BA.debugLine="Dim canonicalFileName As String = BuildTrackCach";
Debug.ShouldStop(1);
_canonicalfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcacherelativefilename" /*RemoteObject*/ ,(Object)(_trackid),(Object)(_playlistid));Debug.locals.put("canonicalFileName", _canonicalfilename);Debug.locals.put("canonicalFileName", _canonicalfilename);
 BA.debugLineNum = 1378;BA.debugLine="Dim storedFileName As String = entry.GetDefault(";
Debug.ShouldStop(2);
_storedfilename = BA.ObjectToString(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("storedFileName", _storedfilename);Debug.locals.put("storedFileName", _storedfilename);
 BA.debugLineNum = 1379;BA.debugLine="If storedFileName = canonicalFileName Then Conti";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_storedfilename,_canonicalfilename)) { 
if (true) continue;};
 BA.debugLineNum = 1380;BA.debugLine="If IsCachedFileUsable(GetTracksDir, canonicalFil";
Debug.ShouldStop(8);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_canonicalfilename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1381;BA.debugLine="entry.Put(\"file_name\", canonicalFileName)";
Debug.ShouldStop(16);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((_canonicalfilename)));
 BA.debugLineNum = 1382;BA.debugLine="entry.Put(\"size_bytes\", GetFileSizeSafe(GetTrac";
Debug.ShouldStop(32);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("size_bytes"))),(Object)((__ref.runClassMethod (b4j.example.mediacache.class, "_getfilesizesafe" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_canonicalfilename)))));
 BA.debugLineNum = 1383;BA.debugLine="trackIndex.Put(trackId, entry)";
Debug.ShouldStop(64);
_trackindex.runVoidMethod ("Put",(Object)((_trackid)),(Object)((_entry.getObject())));
 BA.debugLineNum = 1384;BA.debugLine="changed = True";
Debug.ShouldStop(128);
_changed = mediacache.__c.getField(true,"True");Debug.locals.put("changed", _changed);
 };
 }
}Debug.locals.put("trackId", _trackid);
;
 BA.debugLineNum = 1387;BA.debugLine="If changed Then SaveTrackIndex";
Debug.ShouldStop(1024);
if (_changed.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );};
 BA.debugLineNum = 1388;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("PrepareNextCacheAuditType (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1149);
if (RapidSub.canDelegate("preparenextcacheaudittype")) { return __ref.runUserSub(false, "mediacache","preparenextcacheaudittype", __ref);}
RemoteObject _auditdir = RemoteObject.createImmutable("");
 BA.debugLineNum = 1149;BA.debugLine="Private Sub PrepareNextCacheAuditType As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1150;BA.debugLine="If cacheAuditPendingTypes.IsInitialized = False O";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 1151;BA.debugLine="cacheAuditCurrentType = cacheAuditPendingTypes.Ge";
Debug.ShouldStop(1073741824);
__ref.setField ("_cacheauditcurrenttype" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 1152;BA.debugLine="cacheAuditPendingTypes.RemoveAt(0)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1153;BA.debugLine="cacheAuditCurrentPosition = 0";
Debug.ShouldStop(1);
__ref.setField ("_cacheauditcurrentposition" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1154;BA.debugLine="cacheAuditSeenIds.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1155;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
Debug.ShouldStop(4);
__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1156;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
Debug.ShouldStop(8);
_auditdir = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditdirbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditDir", _auditdir);Debug.locals.put("auditDir", _auditdir);
 BA.debugLineNum = 1157;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 1158;BA.debugLine="If DirectoryExists(auditDir) Then";
Debug.ShouldStop(32);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_directoryexists" /*RemoteObject*/ ,(Object)(_auditdir)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1159;BA.debugLine="cacheAuditListingDir = auditDir";
Debug.ShouldStop(64);
__ref.setField ("_cacheauditlistingdir" /*RemoteObject*/ ,_auditdir);
 BA.debugLineNum = 1160;BA.debugLine="cacheAuditListingInProgress = True";
Debug.ShouldStop(128);
__ref.setField ("_cacheauditlistinginprogress" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 BA.debugLineNum = 1161;BA.debugLine="StartCacheAuditFileListingAsync";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_startcacheauditfilelistingasync" /*RemoteObject*/ );
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e15.toString()); BA.debugLineNum = 1164;BA.debugLine="Trace(\"Не удалось получить список файлов для ауд";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось получить список файлов для аудита кэша. type="),__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ ),RemoteObject.createImmutable(", message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 1166;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) return mediacache.__c.getField(true,"True");
 BA.debugLineNum = 1167;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("ProcessCurrentCacheAuditBatch (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1188);
if (RapidSub.canDelegate("processcurrentcacheauditbatch")) { return __ref.runUserSub(false, "mediacache","processcurrentcacheauditbatch", __ref);}
RemoteObject _auditdir = RemoteObject.createImmutable("");
RemoteObject _auditindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _trackid = RemoteObject.createImmutable("");
 BA.debugLineNum = 1188;BA.debugLine="Private Sub ProcessCurrentCacheAuditBatch";
Debug.ShouldStop(8);
 BA.debugLineNum = 1189;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
Debug.ShouldStop(16);
_auditdir = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditdirbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditDir", _auditdir);Debug.locals.put("auditDir", _auditdir);
 BA.debugLineNum = 1190;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
Debug.ShouldStop(32);
_auditindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_auditindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getauditindexbytype" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));Debug.locals.put("auditIndex", _auditindex);Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 1191;BA.debugLine="For i = 1 To CACHE_AUDIT_BATCH_SIZE";
Debug.ShouldStop(64);
{
final int step3 = 1;
final int limit3 = __ref.getField(true,"_cache_audit_batch_size" /*RemoteObject*/ ).<Integer>get().intValue();
_i = 1 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1192;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurren";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_cacheauditcurrentposition" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
if (true) break;};
 BA.debugLineNum = 1193;BA.debugLine="Dim fileName As String = cacheAuditCurrentFileNa";
Debug.ShouldStop(256);
_filename = BA.ObjectToString(__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_cacheauditcurrentposition" /*RemoteObject*/ ))));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 1194;BA.debugLine="cacheAuditCurrentPosition = cacheAuditCurrentPos";
Debug.ShouldStop(512);
__ref.setField ("_cacheauditcurrentposition" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cacheauditcurrentposition" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 1195;BA.debugLine="If fileName = \"\" Then Continue";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 1196;BA.debugLine="If File.IsDirectory(auditDir, fileName) Then Con";
Debug.ShouldStop(2048);
if (mediacache.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_auditdir),(Object)(_filename)).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 1197;BA.debugLine="If fileName.EndsWith(\".tmp\") Then";
Debug.ShouldStop(4096);
if (_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".tmp"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1198;BA.debugLine="DeleteFileIfExists(auditDir, fileName)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename));
 BA.debugLineNum = 1199;BA.debugLine="cacheAuditTempDeletedCount = cacheAuditTempDele";
Debug.ShouldStop(16384);
__ref.setField ("_cacheaudittempdeletedcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cacheaudittempdeletedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 1200;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_markauditindexchanged" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )));
 BA.debugLineNum = 1201;BA.debugLine="Continue";
Debug.ShouldStop(65536);
if (true) continue;
 };
 BA.debugLineNum = 1203;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename)),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 1204;BA.debugLine="If cacheAuditCurrentType = \"tracks\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ ),BA.ObjectToString("tracks"))) { 
 BA.debugLineNum = 1205;BA.debugLine="Dim trackId As String = FindTrackIdByFileName(f";
Debug.ShouldStop(1048576);
_trackid = __ref.runClassMethod (b4j.example.mediacache.class, "_findtrackidbyfilename" /*RemoteObject*/ ,(Object)(_filename),(Object)(_auditindex));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 1206;BA.debugLine="If trackId = \"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1209;BA.debugLine="Continue";
Debug.ShouldStop(16777216);
if (true) continue;
 };
 BA.debugLineNum = 1211;BA.debugLine="cacheAuditSeenIds.Put(trackId, True)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_trackid)),(Object)((mediacache.__c.getField(true,"True"))));
 }else {
 BA.debugLineNum = 1213;BA.debugLine="cacheAuditSeenIds.Put(fileName, True)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_filename)),(Object)((mediacache.__c.getField(true,"True"))));
 BA.debugLineNum = 1214;BA.debugLine="If auditIndex.ContainsKey(fileName) = False The";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_auditindex.runMethod(true,"ContainsKey",(Object)((_filename))),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1215;BA.debugLine="AddIndexedFileFromAudit(cacheAuditCurrentType,";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.mediacache.class, "_addindexedfilefromaudit" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ )),(Object)(_filename),(Object)(_auditindex));
 BA.debugLineNum = 1216;BA.debugLine="cacheAuditAddedCount = cacheAuditAddedCount +";
Debug.ShouldStop(-2147483648);
__ref.setField ("_cacheauditaddedcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cacheauditaddedcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1220;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prunemissingads(RemoteObject __ref,RemoteObject _adindex,RemoteObject _actualadids) throws Exception{
try {
		Debug.PushSubsStack("PruneMissingAds (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,586);
if (RapidSub.canDelegate("prunemissingads")) { return __ref.runUserSub(false, "mediacache","prunemissingads", __ref, _adindex, _actualadids);}
RemoteObject _removedcount = RemoteObject.createImmutable(0);
RemoteObject _idstoremove = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _adid = RemoteObject.createImmutable("");
Debug.locals.put("adIndex", _adindex);
Debug.locals.put("actualAdIds", _actualadids);
 BA.debugLineNum = 586;BA.debugLine="Private Sub PruneMissingAds(adIndex As Map, actual";
Debug.ShouldStop(512);
 BA.debugLineNum = 587;BA.debugLine="Dim removedCount As Int = 0";
Debug.ShouldStop(1024);
_removedcount = BA.numberCast(int.class, 0);Debug.locals.put("removedCount", _removedcount);Debug.locals.put("removedCount", _removedcount);
 BA.debugLineNum = 588;BA.debugLine="Dim idsToRemove As List";
Debug.ShouldStop(2048);
_idstoremove = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("idsToRemove", _idstoremove);
 BA.debugLineNum = 589;BA.debugLine="idsToRemove.Initialize";
Debug.ShouldStop(4096);
_idstoremove.runVoidMethod ("Initialize");
 BA.debugLineNum = 590;BA.debugLine="For Each adId As String In adIndex.Keys";
Debug.ShouldStop(8192);
{
final RemoteObject group4 = _adindex.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_adid = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("adId", _adid);
Debug.locals.put("adId", _adid);
 BA.debugLineNum = 591;BA.debugLine="If actualAdIds.ContainsKey(adId) = False Then id";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_actualadids.runMethod(true,"ContainsKey",(Object)((_adid))),mediacache.__c.getField(true,"False"))) { 
_idstoremove.runVoidMethod ("Add",(Object)((_adid)));};
 }
}Debug.locals.put("adId", _adid);
;
 BA.debugLineNum = 593;BA.debugLine="For Each adId As String In idsToRemove";
Debug.ShouldStop(65536);
{
final RemoteObject group7 = _idstoremove;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_adid = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("adId", _adid);
Debug.locals.put("adId", _adid);
 BA.debugLineNum = 594;BA.debugLine="DeleteFileIfExists(GetAdsDir, adId)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_adid));
 BA.debugLineNum = 595;BA.debugLine="adIndex.Remove(adId)";
Debug.ShouldStop(262144);
_adindex.runVoidMethod ("Remove",(Object)((_adid)));
 BA.debugLineNum = 596;BA.debugLine="removedCount = removedCount + 1";
Debug.ShouldStop(524288);
_removedcount = RemoteObject.solve(new RemoteObject[] {_removedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("removedCount", _removedcount);
 BA.debugLineNum = 597;BA.debugLine="cachedAdIndexDirty = True";
Debug.ShouldStop(1048576);
__ref.setField ("_cachedadindexdirty" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 BA.debugLineNum = 598;BA.debugLine="Trace(\"Удален cached ad, отсутствующий в актуаль";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Удален cached ad, отсутствующий в актуальном data. id="),_adid)));
 }
}Debug.locals.put("adId", _adid);
;
 BA.debugLineNum = 600;BA.debugLine="Return removedCount";
Debug.ShouldStop(8388608);
if (true) return _removedcount;
 BA.debugLineNum = 601;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prunetrackcacheifneeded(RemoteObject __ref,RemoteObject _protectedtrackids,RemoteObject _relevanttrackids) throws Exception{
try {
		Debug.PushSubsStack("PruneTrackCacheIfNeeded (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,361);
if (RapidSub.canDelegate("prunetrackcacheifneeded")) { return __ref.runUserSub(false, "mediacache","prunetrackcacheifneeded", __ref, _protectedtrackids, _relevanttrackids);}
RemoteObject _protectedids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _relevantids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _summary = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cachebytes = RemoteObject.createImmutable(0L);
RemoteObject _freebytes = RemoteObject.createImmutable(0L);
RemoteObject _totalbytes = RemoteObject.createImmutable(0L);
RemoteObject _minfreebytes = RemoteObject.createImmutable(0L);
RemoteObject _hardlimitbytes = RemoteObject.createImmutable(0L);
RemoteObject _targetbytes = RemoteObject.createImmutable(0L);
RemoteObject _needprune = RemoteObject.createImmutable(false);
RemoteObject _removedcount = RemoteObject.createImmutable(0);
RemoteObject _candidates = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nonrelevantcandidates = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _relevantcandidates = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _candidateobject = RemoteObject.declareNull("Object");
RemoteObject _candidate = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("protectedTrackIds", _protectedtrackids);
Debug.locals.put("relevantTrackIds", _relevanttrackids);
 BA.debugLineNum = 361;BA.debugLine="Public Sub PruneTrackCacheIfNeeded(protectedTrackI";
Debug.ShouldStop(256);
 BA.debugLineNum = 362;BA.debugLine="Dim protectedIds As Map = CreateTrackIdSet(protec";
Debug.ShouldStop(512);
_protectedids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_protectedids = __ref.runClassMethod (b4j.example.mediacache.class, "_createtrackidset" /*RemoteObject*/ ,(Object)(_protectedtrackids));Debug.locals.put("protectedIds", _protectedids);Debug.locals.put("protectedIds", _protectedids);
 BA.debugLineNum = 363;BA.debugLine="Dim relevantIds As Map = CreateTrackIdSet(relevan";
Debug.ShouldStop(1024);
_relevantids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_relevantids = __ref.runClassMethod (b4j.example.mediacache.class, "_createtrackidset" /*RemoteObject*/ ,(Object)(_relevanttrackids));Debug.locals.put("relevantIds", _relevantids);Debug.locals.put("relevantIds", _relevantids);
 BA.debugLineNum = 364;BA.debugLine="Dim summary As Map = BuildTrackCacheSummary(prote";
Debug.ShouldStop(2048);
_summary = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_summary = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcachesummary" /*RemoteObject*/ ,(Object)(_protectedids),(Object)(_relevantids));Debug.locals.put("summary", _summary);Debug.locals.put("summary", _summary);
 BA.debugLineNum = 365;BA.debugLine="Dim cacheBytes As Long = summary.GetDefault(\"cach";
Debug.ShouldStop(4096);
_cachebytes = BA.numberCast(long.class, _summary.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("cache_bytes"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("cacheBytes", _cachebytes);Debug.locals.put("cacheBytes", _cachebytes);
 BA.debugLineNum = 366;BA.debugLine="Dim freeBytes As Long = GetDriveUsableSpace(stora";
Debug.ShouldStop(8192);
_freebytes = __ref.runClassMethod (b4j.example.mediacache.class, "_getdriveusablespace" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )));Debug.locals.put("freeBytes", _freebytes);Debug.locals.put("freeBytes", _freebytes);
 BA.debugLineNum = 367;BA.debugLine="Dim totalBytes As Long = GetDriveTotalSpace(stora";
Debug.ShouldStop(16384);
_totalbytes = __ref.runClassMethod (b4j.example.mediacache.class, "_getdrivetotalspace" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )));Debug.locals.put("totalBytes", _totalbytes);Debug.locals.put("totalBytes", _totalbytes);
 BA.debugLineNum = 368;BA.debugLine="Dim minFreeBytes As Long = ResolveMinFreeDiskByte";
Debug.ShouldStop(32768);
_minfreebytes = __ref.runClassMethod (b4j.example.mediacache.class, "_resolveminfreediskbytes" /*RemoteObject*/ ,(Object)(_totalbytes));Debug.locals.put("minFreeBytes", _minfreebytes);Debug.locals.put("minFreeBytes", _minfreebytes);
 BA.debugLineNum = 369;BA.debugLine="Dim hardLimitBytes As Long = MbToBytes(TRACK_CACH";
Debug.ShouldStop(65536);
_hardlimitbytes = __ref.runClassMethod (b4j.example.mediacache.class, "_mbtobytes" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_track_cache_hard_limit_mb" /*RemoteObject*/ )));Debug.locals.put("hardLimitBytes", _hardlimitbytes);Debug.locals.put("hardLimitBytes", _hardlimitbytes);
 BA.debugLineNum = 370;BA.debugLine="Dim targetBytes As Long = MbToBytes(TRACK_CACHE_T";
Debug.ShouldStop(131072);
_targetbytes = __ref.runClassMethod (b4j.example.mediacache.class, "_mbtobytes" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_track_cache_target_mb" /*RemoteObject*/ )));Debug.locals.put("targetBytes", _targetbytes);Debug.locals.put("targetBytes", _targetbytes);
 BA.debugLineNum = 371;BA.debugLine="Dim needPrune As Boolean = (cacheBytes > hardLimi";
Debug.ShouldStop(262144);
_needprune = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_cachebytes,_hardlimitbytes)))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_freebytes,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("<",_freebytes,_minfreebytes)))));Debug.locals.put("needPrune", _needprune);Debug.locals.put("needPrune", _needprune);
 BA.debugLineNum = 372;BA.debugLine="If needPrune = False Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_needprune,mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 373;BA.debugLine="Return 0";
Debug.ShouldStop(1048576);
if (true) return BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 375;BA.debugLine="Dim removedCount As Int = 0";
Debug.ShouldStop(4194304);
_removedcount = BA.numberCast(int.class, 0);Debug.locals.put("removedCount", _removedcount);Debug.locals.put("removedCount", _removedcount);
 BA.debugLineNum = 376;BA.debugLine="Dim candidates As List = summary.GetDefault(\"cand";
Debug.ShouldStop(8388608);
_candidates = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_candidates = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _summary.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("candidates"))),(Object)((__ref.runClassMethod (b4j.example.mediacache.class, "_createinitializedlist" /*RemoteObject*/ ).getObject()))));Debug.locals.put("candidates", _candidates);Debug.locals.put("candidates", _candidates);
 BA.debugLineNum = 377;BA.debugLine="Dim nonRelevantCandidates As List";
Debug.ShouldStop(16777216);
_nonrelevantcandidates = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nonRelevantCandidates", _nonrelevantcandidates);
 BA.debugLineNum = 378;BA.debugLine="nonRelevantCandidates.Initialize";
Debug.ShouldStop(33554432);
_nonrelevantcandidates.runVoidMethod ("Initialize");
 BA.debugLineNum = 379;BA.debugLine="Dim relevantCandidates As List";
Debug.ShouldStop(67108864);
_relevantcandidates = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("relevantCandidates", _relevantcandidates);
 BA.debugLineNum = 380;BA.debugLine="relevantCandidates.Initialize";
Debug.ShouldStop(134217728);
_relevantcandidates.runVoidMethod ("Initialize");
 BA.debugLineNum = 381;BA.debugLine="For Each candidateObject As Object In candidates";
Debug.ShouldStop(268435456);
{
final RemoteObject group20 = _candidates;
final int groupLen20 = group20.runMethod(true,"getSize").<Integer>get()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_candidateobject = group20.runMethod(false,"Get",index20);Debug.locals.put("candidateObject", _candidateobject);
Debug.locals.put("candidateObject", _candidateobject);
 BA.debugLineNum = 382;BA.debugLine="If (candidateObject Is Map) = False Then Continu";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_candidateobject, RemoteObject.createImmutable("java.util.Map")))),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 383;BA.debugLine="Dim candidate As Map = candidateObject";
Debug.ShouldStop(1073741824);
_candidate = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_candidate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _candidateobject);Debug.locals.put("candidate", _candidate);Debug.locals.put("candidate", _candidate);
 BA.debugLineNum = 384;BA.debugLine="If candidate.GetDefault(\"is_relevant\", False) Th";
Debug.ShouldStop(-2147483648);
if (BA.ObjectToBoolean(_candidate.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("is_relevant"))),(Object)((mediacache.__c.getField(true,"False"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 385;BA.debugLine="relevantCandidates.Add(candidate)";
Debug.ShouldStop(1);
_relevantcandidates.runVoidMethod ("Add",(Object)((_candidate.getObject())));
 }else {
 BA.debugLineNum = 387;BA.debugLine="nonRelevantCandidates.Add(candidate)";
Debug.ShouldStop(4);
_nonrelevantcandidates.runVoidMethod ("Add",(Object)((_candidate.getObject())));
 };
 }
}Debug.locals.put("candidateObject", _candidateobject);
;
 BA.debugLineNum = 390;BA.debugLine="SortTrackPruneCandidates(nonRelevantCandidates)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.mediacache.class, "_sorttrackprunecandidates" /*RemoteObject*/ ,(Object)(_nonrelevantcandidates));
 BA.debugLineNum = 391;BA.debugLine="SortTrackPruneCandidates(relevantCandidates)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.mediacache.class, "_sorttrackprunecandidates" /*RemoteObject*/ ,(Object)(_relevantcandidates));
 BA.debugLineNum = 395;BA.debugLine="removedCount = removedCount + PruneTrackCandidate";
Debug.ShouldStop(1024);
_removedcount = RemoteObject.solve(new RemoteObject[] {_removedcount,__ref.runClassMethod (b4j.example.mediacache.class, "_prunetrackcandidates" /*RemoteObject*/ ,(Object)(_nonrelevantcandidates),(Object)(_cachebytes),(Object)(_freebytes),(Object)(_targetbytes),(Object)(_minfreebytes))}, "+",1, 1);Debug.locals.put("removedCount", _removedcount);
 BA.debugLineNum = 396;BA.debugLine="cacheBytes = pruneLastCacheBytes";
Debug.ShouldStop(2048);
_cachebytes = __ref.getField(true,"_prunelastcachebytes" /*RemoteObject*/ );Debug.locals.put("cacheBytes", _cachebytes);
 BA.debugLineNum = 397;BA.debugLine="freeBytes = pruneLastFreeBytes";
Debug.ShouldStop(4096);
_freebytes = __ref.getField(true,"_prunelastfreebytes" /*RemoteObject*/ );Debug.locals.put("freeBytes", _freebytes);
 BA.debugLineNum = 398;BA.debugLine="If cacheBytes > targetBytes Or (freeBytes > 0 And";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_cachebytes,_targetbytes) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_freebytes,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("<",_freebytes,_minfreebytes))))) { 
 BA.debugLineNum = 399;BA.debugLine="removedCount = removedCount + PruneTrackCandidat";
Debug.ShouldStop(16384);
_removedcount = RemoteObject.solve(new RemoteObject[] {_removedcount,__ref.runClassMethod (b4j.example.mediacache.class, "_prunetrackcandidates" /*RemoteObject*/ ,(Object)(_relevantcandidates),(Object)(_cachebytes),(Object)(_freebytes),(Object)(_targetbytes),(Object)(_minfreebytes))}, "+",1, 1);Debug.locals.put("removedCount", _removedcount);
 BA.debugLineNum = 400;BA.debugLine="cacheBytes = pruneLastCacheBytes";
Debug.ShouldStop(32768);
_cachebytes = __ref.getField(true,"_prunelastcachebytes" /*RemoteObject*/ );Debug.locals.put("cacheBytes", _cachebytes);
 BA.debugLineNum = 401;BA.debugLine="freeBytes = pruneLastFreeBytes";
Debug.ShouldStop(65536);
_freebytes = __ref.getField(true,"_prunelastfreebytes" /*RemoteObject*/ );Debug.locals.put("freeBytes", _freebytes);
 };
 BA.debugLineNum = 403;BA.debugLine="If removedCount > 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_removedcount,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 404;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 405;BA.debugLine="Trace(\"Очистка кэша треков завершена. removed=\"";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Очистка кэша треков завершена. removed="),_removedcount,RemoteObject.createImmutable(", cacheMb="),__ref.runClassMethod (b4j.example.mediacache.class, "_bytestomb" /*RemoteObject*/ ,(Object)(_cachebytes)),RemoteObject.createImmutable(", freeMb="),__ref.runClassMethod (b4j.example.mediacache.class, "_bytestomb" /*RemoteObject*/ ,(Object)(_freebytes)))));
 }else {
 BA.debugLineNum = 407;BA.debugLine="Trace(\"Очистка кэша треков пропущена: нет подход";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Очистка кэша треков пропущена: нет подходящих кандидатов. cacheMb="),__ref.runClassMethod (b4j.example.mediacache.class, "_bytestomb" /*RemoteObject*/ ,(Object)(_cachebytes)),RemoteObject.createImmutable(", freeMb="),__ref.runClassMethod (b4j.example.mediacache.class, "_bytestomb" /*RemoteObject*/ ,(Object)(_freebytes)))));
 };
 BA.debugLineNum = 409;BA.debugLine="Return removedCount";
Debug.ShouldStop(16777216);
if (true) return _removedcount;
 BA.debugLineNum = 410;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prunetrackcandidates(RemoteObject __ref,RemoteObject _candidates,RemoteObject _initialcachebytes,RemoteObject _initialfreebytes,RemoteObject _targetbytes,RemoteObject _minfreebytes) throws Exception{
try {
		Debug.PushSubsStack("PruneTrackCandidates (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,412);
if (RapidSub.canDelegate("prunetrackcandidates")) { return __ref.runUserSub(false, "mediacache","prunetrackcandidates", __ref, _candidates, _initialcachebytes, _initialfreebytes, _targetbytes, _minfreebytes);}
RemoteObject _removedcount = RemoteObject.createImmutable(0);
RemoteObject _cachebytes = RemoteObject.createImmutable(0L);
RemoteObject _freebytes = RemoteObject.createImmutable(0L);
RemoteObject _candidateobject = RemoteObject.declareNull("Object");
RemoteObject _candidate = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _filebytes = RemoteObject.createImmutable(0L);
Debug.locals.put("candidates", _candidates);
Debug.locals.put("initialCacheBytes", _initialcachebytes);
Debug.locals.put("initialFreeBytes", _initialfreebytes);
Debug.locals.put("targetBytes", _targetbytes);
Debug.locals.put("minFreeBytes", _minfreebytes);
 BA.debugLineNum = 412;BA.debugLine="Private Sub PruneTrackCandidates(candidates As Lis";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 413;BA.debugLine="Dim removedCount As Int = 0";
Debug.ShouldStop(268435456);
_removedcount = BA.numberCast(int.class, 0);Debug.locals.put("removedCount", _removedcount);Debug.locals.put("removedCount", _removedcount);
 BA.debugLineNum = 414;BA.debugLine="Dim cacheBytes As Long = initialCacheBytes";
Debug.ShouldStop(536870912);
_cachebytes = _initialcachebytes;Debug.locals.put("cacheBytes", _cachebytes);Debug.locals.put("cacheBytes", _cachebytes);
 BA.debugLineNum = 415;BA.debugLine="Dim freeBytes As Long = initialFreeBytes";
Debug.ShouldStop(1073741824);
_freebytes = _initialfreebytes;Debug.locals.put("freeBytes", _freebytes);Debug.locals.put("freeBytes", _freebytes);
 BA.debugLineNum = 416;BA.debugLine="For Each candidateObject As Object In candidates";
Debug.ShouldStop(-2147483648);
{
final RemoteObject group4 = _candidates;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_candidateobject = group4.runMethod(false,"Get",index4);Debug.locals.put("candidateObject", _candidateobject);
Debug.locals.put("candidateObject", _candidateobject);
 BA.debugLineNum = 417;BA.debugLine="If cacheBytes <= targetBytes And (freeBytes <= 0";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("k",_cachebytes,_targetbytes) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("k",_freebytes,BA.numberCast(long.class, 0)) || RemoteObject.solveBoolean("g",_freebytes,_minfreebytes))))) { 
if (true) break;};
 BA.debugLineNum = 418;BA.debugLine="If (candidateObject Is Map) = False Then Continu";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_candidateobject, RemoteObject.createImmutable("java.util.Map")))),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 419;BA.debugLine="Dim candidate As Map = candidateObject";
Debug.ShouldStop(4);
_candidate = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_candidate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _candidateobject);Debug.locals.put("candidate", _candidate);Debug.locals.put("candidate", _candidate);
 BA.debugLineNum = 420;BA.debugLine="Dim trackId As String = candidate.GetDefault(\"id";
Debug.ShouldStop(8);
_trackid = BA.ObjectToString(_candidate.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 421;BA.debugLine="Dim fileName As String = candidate.GetDefault(\"f";
Debug.ShouldStop(16);
_filename = BA.ObjectToString(_candidate.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 422;BA.debugLine="Dim fileBytes As Long = candidate.GetDefault(\"si";
Debug.ShouldStop(32);
_filebytes = BA.numberCast(long.class, _candidate.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("size_bytes"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("fileBytes", _filebytes);Debug.locals.put("fileBytes", _filebytes);
 BA.debugLineNum = 423;BA.debugLine="If trackId = \"\" Or fileName = \"\" Then Continue";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 424;BA.debugLine="DeleteFileIfExists(GetTracksDir, fileName)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_filename));
 BA.debugLineNum = 425;BA.debugLine="CleanupEmptyTrackPlaylistDir(fileName)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_cleanupemptytrackplaylistdir" /*RemoteObject*/ ,(Object)(_filename));
 BA.debugLineNum = 426;BA.debugLine="cachedTrackIndex.Remove(trackId)";
Debug.ShouldStop(512);
__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_trackid)));
 BA.debugLineNum = 427;BA.debugLine="cacheBytes = Max(0, cacheBytes - fileBytes)";
Debug.ShouldStop(1024);
_cachebytes = BA.numberCast(long.class, mediacache.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_cachebytes,_filebytes}, "-",1, 2)))));Debug.locals.put("cacheBytes", _cachebytes);
 BA.debugLineNum = 428;BA.debugLine="freeBytes = GetDriveUsableSpace(storageDir)";
Debug.ShouldStop(2048);
_freebytes = __ref.runClassMethod (b4j.example.mediacache.class, "_getdriveusablespace" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )));Debug.locals.put("freeBytes", _freebytes);
 BA.debugLineNum = 429;BA.debugLine="removedCount = removedCount + 1";
Debug.ShouldStop(4096);
_removedcount = RemoteObject.solve(new RemoteObject[] {_removedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("removedCount", _removedcount);
 BA.debugLineNum = 430;BA.debugLine="Trace(\"Удален cached track при очистке кэша. id=";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Удален cached track при очистке кэша. id="),_trackid,RemoteObject.createImmutable(", sizeMb="),__ref.runClassMethod (b4j.example.mediacache.class, "_bytestomb" /*RemoteObject*/ ,(Object)(_filebytes)))));
 }
}Debug.locals.put("candidateObject", _candidateobject);
;
 BA.debugLineNum = 432;BA.debugLine="pruneLastCacheBytes = cacheBytes";
Debug.ShouldStop(32768);
__ref.setField ("_prunelastcachebytes" /*RemoteObject*/ ,_cachebytes);
 BA.debugLineNum = 433;BA.debugLine="pruneLastFreeBytes = freeBytes";
Debug.ShouldStop(65536);
__ref.setField ("_prunelastfreebytes" /*RemoteObject*/ ,_freebytes);
 BA.debugLineNum = 434;BA.debugLine="Return removedCount";
Debug.ShouldStop(131072);
if (true) return _removedcount;
 BA.debugLineNum = 435;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rebuildcachestatsfromindexes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RebuildCacheStatsFromIndexes (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1739);
if (RapidSub.canDelegate("rebuildcachestatsfromindexes")) { return __ref.runUserSub(false, "mediacache","rebuildcachestatsfromindexes", __ref);}
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _trackentry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackbytes = RemoteObject.createImmutable(0L);
RemoteObject _adid = RemoteObject.createImmutable("");
RemoteObject _adentry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 1739;BA.debugLine="Private Sub RebuildCacheStatsFromIndexes";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1740;BA.debugLine="cachedTrackCount = 0";
Debug.ShouldStop(2048);
__ref.setField ("_cachedtrackcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1741;BA.debugLine="cachedAdCount = 0";
Debug.ShouldStop(4096);
__ref.setField ("_cachedadcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1742;BA.debugLine="cachedTrackBytes = 0";
Debug.ShouldStop(8192);
__ref.setField ("_cachedtrackbytes" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 1743;BA.debugLine="cachedAdBytes = 0";
Debug.ShouldStop(16384);
__ref.setField ("_cachedadbytes" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 1744;BA.debugLine="cachedTrackPlaylistStats.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_cachedtrackplayliststats" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1745;BA.debugLine="If cachedTrackIndex.IsInitialized Then";
Debug.ShouldStop(65536);
if (__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1746;BA.debugLine="For Each trackId As String In cachedTrackIndex.K";
Debug.ShouldStop(131072);
{
final RemoteObject group7 = __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_trackid = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("trackId", _trackid);
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 1747;BA.debugLine="Dim trackEntry As Map = cachedTrackIndex.Get(tr";
Debug.ShouldStop(262144);
_trackentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_trackentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_trackid))));Debug.locals.put("trackEntry", _trackentry);Debug.locals.put("trackEntry", _trackentry);
 BA.debugLineNum = 1748;BA.debugLine="If trackEntry.IsInitialized = False Then Contin";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_trackentry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 1749;BA.debugLine="cachedTrackCount = cachedTrackCount + 1";
Debug.ShouldStop(1048576);
__ref.setField ("_cachedtrackcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cachedtrackcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 1750;BA.debugLine="Dim trackBytes As Long = ToLongDefault(trackEnt";
Debug.ShouldStop(2097152);
_trackbytes = __ref.runClassMethod (b4j.example.mediacache.class, "_tolongdefault" /*RemoteObject*/ ,(Object)(_trackentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("size_bytes"))),(Object)(RemoteObject.createImmutable((0))))),(Object)(BA.numberCast(long.class, 0)));Debug.locals.put("trackBytes", _trackbytes);Debug.locals.put("trackBytes", _trackbytes);
 BA.debugLineNum = 1751;BA.debugLine="cachedTrackBytes = cachedTrackBytes + trackByte";
Debug.ShouldStop(4194304);
__ref.setField ("_cachedtrackbytes" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cachedtrackbytes" /*RemoteObject*/ ),_trackbytes}, "+",1, 2));
 BA.debugLineNum = 1752;BA.debugLine="AccumulateTrackPlaylistStat(trackEntry.GetDefau";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.mediacache.class, "_accumulatetrackplayliststat" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_trackentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(_trackbytes));
 }
}Debug.locals.put("trackId", _trackid);
;
 };
 BA.debugLineNum = 1755;BA.debugLine="If cachedAdIndex.IsInitialized Then";
Debug.ShouldStop(67108864);
if (__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1756;BA.debugLine="For Each adId As String In cachedAdIndex.Keys";
Debug.ShouldStop(134217728);
{
final RemoteObject group17 = __ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen17 = group17.runMethod(true,"getSize").<Integer>get()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_adid = BA.ObjectToString(group17.runMethod(false,"Get",index17));Debug.locals.put("adId", _adid);
Debug.locals.put("adId", _adid);
 BA.debugLineNum = 1757;BA.debugLine="Dim adEntry As Map = cachedAdIndex.Get(adId)";
Debug.ShouldStop(268435456);
_adentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_adentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_adid))));Debug.locals.put("adEntry", _adentry);Debug.locals.put("adEntry", _adentry);
 BA.debugLineNum = 1758;BA.debugLine="If adEntry.IsInitialized = False Then Continue";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_adentry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 1759;BA.debugLine="cachedAdCount = cachedAdCount + 1";
Debug.ShouldStop(1073741824);
__ref.setField ("_cachedadcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cachedadcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 1760;BA.debugLine="cachedAdBytes = cachedAdBytes + ToLongDefault(a";
Debug.ShouldStop(-2147483648);
__ref.setField ("_cachedadbytes" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cachedadbytes" /*RemoteObject*/ ),__ref.runClassMethod (b4j.example.mediacache.class, "_tolongdefault" /*RemoteObject*/ ,(Object)(_adentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("size_bytes"))),(Object)(RemoteObject.createImmutable((0))))),(Object)(BA.numberCast(long.class, 0)))}, "+",1, 2));
 }
}Debug.locals.put("adId", _adid);
;
 };
 BA.debugLineNum = 1763;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("ReplaceCacheFile (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,771);
if (RapidSub.canDelegate("replacecachefile")) { return __ref.runUserSub(false, "mediacache","replacecachefile", __ref, _dir, _tempfilename, _finalfilename);}
RemoteObject _tempfile = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _finalfile = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _renamed = RemoteObject.createImmutable(false);
Debug.locals.put("dir", _dir);
Debug.locals.put("tempFileName", _tempfilename);
Debug.locals.put("finalFileName", _finalfilename);
 BA.debugLineNum = 771;BA.debugLine="Private Sub ReplaceCacheFile(dir As String, tempFi";
Debug.ShouldStop(4);
 BA.debugLineNum = 772;BA.debugLine="If IsCachedFileUsable(dir, tempFileName) = False";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_dir),(Object)(_tempfilename)),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 773;BA.debugLine="If IsCachedFileUsable(dir, finalFileName) Then";
Debug.ShouldStop(16);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_dir),(Object)(_finalfilename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 774;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_tempfilename));
 BA.debugLineNum = 775;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) return mediacache.__c.getField(true,"True");
 };
 BA.debugLineNum = 777;BA.debugLine="DeleteFileIfExists(dir, finalFileName)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_finalfilename));
 BA.debugLineNum = 778;BA.debugLine="Dim tempFile As JavaObject";
Debug.ShouldStop(512);
_tempfile = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("tempFile", _tempfile);
 BA.debugLineNum = 779;BA.debugLine="tempFile.InitializeNewInstance(\"java.io.File\", Ar";
Debug.ShouldStop(1024);
_tempfile.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_tempfilename)))})));
 BA.debugLineNum = 780;BA.debugLine="Dim finalFile As JavaObject";
Debug.ShouldStop(2048);
_finalfile = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("finalFile", _finalfile);
 BA.debugLineNum = 781;BA.debugLine="finalFile.InitializeNewInstance(\"java.io.File\", A";
Debug.ShouldStop(4096);
_finalfile.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_finalfilename)))})));
 BA.debugLineNum = 782;BA.debugLine="Dim renamed As Boolean = tempFile.RunMethod(\"rena";
Debug.ShouldStop(8192);
_renamed = BA.ObjectToBoolean(_tempfile.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("renameTo")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_finalfile.getObject())}))));Debug.locals.put("renamed", _renamed);Debug.locals.put("renamed", _renamed);
 BA.debugLineNum = 783;BA.debugLine="If renamed = False And IsCachedFileUsable(dir, fi";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_renamed,mediacache.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_dir),(Object)(_finalfilename)))) { 
 BA.debugLineNum = 784;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_deletefileifexists" /*RemoteObject*/ ,(Object)(_dir),(Object)(_tempfilename));
 BA.debugLineNum = 785;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) return mediacache.__c.getField(true,"True");
 };
 BA.debugLineNum = 787;BA.debugLine="Return renamed";
Debug.ShouldStop(262144);
if (true) return _renamed;
 BA.debugLineNum = 788;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveanycachedtrackfromindex(RemoteObject __ref,RemoteObject _playlistid,RemoteObject _currenttrackid) throws Exception{
try {
		Debug.PushSubsStack("ResolveAnyCachedTrackFromIndex (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,638);
if (RapidSub.canDelegate("resolveanycachedtrackfromindex")) { return __ref.runUserSub(false, "mediacache","resolveanycachedtrackfromindex", __ref, _playlistid, _currenttrackid);}
RemoteObject _emptytrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _selectedtrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _entryplaylistid = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _copiedtrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("playlistId", _playlistid);
Debug.locals.put("currentTrackId", _currenttrackid);
 BA.debugLineNum = 638;BA.debugLine="Public Sub ResolveAnyCachedTrackFromIndex(playlist";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 639;BA.debugLine="Dim emptyTrack As Map";
Debug.ShouldStop(1073741824);
_emptytrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyTrack", _emptytrack);
 BA.debugLineNum = 640;BA.debugLine="emptyTrack.Initialize";
Debug.ShouldStop(-2147483648);
_emptytrack.runVoidMethod ("Initialize");
 BA.debugLineNum = 641;BA.debugLine="EnsureTrackCacheReady";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuretrackcacheready" /*RemoteObject*/ );
 BA.debugLineNum = 642;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then Re";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return _emptytrack;};
 BA.debugLineNum = 643;BA.debugLine="Dim selectedTrack As Map";
Debug.ShouldStop(4);
_selectedtrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("selectedTrack", _selectedtrack);
 BA.debugLineNum = 644;BA.debugLine="selectedTrack.Initialize";
Debug.ShouldStop(8);
_selectedtrack.runVoidMethod ("Initialize");
 BA.debugLineNum = 645;BA.debugLine="For Each trackId As String In cachedTrackIndex.Ke";
Debug.ShouldStop(16);
{
final RemoteObject group7 = __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_trackid = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("trackId", _trackid);
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 646;BA.debugLine="If currentTrackId <> \"\" And cachedTrackIndex.Siz";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",_currenttrackid,BA.ObjectToString("")) && RemoteObject.solveBoolean(">",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_trackid,_currenttrackid)) { 
if (true) continue;};
 BA.debugLineNum = 647;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(t";
Debug.ShouldStop(64);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 648;BA.debugLine="If entry.IsInitialized = False Then Continue";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 649;BA.debugLine="Dim entryPlaylistId As String = entry.GetDefault";
Debug.ShouldStop(256);
_entryplaylistid = BA.ObjectToString(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("entryPlaylistId", _entryplaylistid);Debug.locals.put("entryPlaylistId", _entryplaylistid);
 BA.debugLineNum = 650;BA.debugLine="If playlistId <> \"\" And entryPlaylistId <> playl";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("!",_playlistid,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_entryplaylistid,_playlistid)) { 
if (true) continue;};
 BA.debugLineNum = 651;BA.debugLine="Dim fileName As String = ResolveTrackCacheFileNa";
Debug.ShouldStop(1024);
_filename = __ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackcachefilename" /*RemoteObject*/ ,(Object)(_trackid),(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ )));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 652;BA.debugLine="If IsCachedFileUsable(GetTracksDir, fileName) =";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_filename)),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 653;BA.debugLine="Dim copiedTrack As Map";
Debug.ShouldStop(4096);
_copiedtrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("copiedTrack", _copiedtrack);
 BA.debugLineNum = 654;BA.debugLine="copiedTrack.Initialize";
Debug.ShouldStop(8192);
_copiedtrack.runVoidMethod ("Initialize");
 BA.debugLineNum = 655;BA.debugLine="For Each key As Object In entry.Keys";
Debug.ShouldStop(16384);
{
final RemoteObject group17 = _entry.runMethod(false,"Keys");
final int groupLen17 = group17.runMethod(true,"getSize").<Integer>get()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_key = group17.runMethod(false,"Get",index17);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 656;BA.debugLine="copiedTrack.Put(key, entry.Get(key))";
Debug.ShouldStop(32768);
_copiedtrack.runVoidMethod ("Put",(Object)(_key),(Object)(_entry.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 658;BA.debugLine="selectedTrack = copiedTrack";
Debug.ShouldStop(131072);
_selectedtrack = _copiedtrack;Debug.locals.put("selectedTrack", _selectedtrack);
 BA.debugLineNum = 659;BA.debugLine="If selectedTrack.GetDefault(\"id\", \"\") = \"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_selectedtrack.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
_selectedtrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_trackid)));};
 BA.debugLineNum = 660;BA.debugLine="If selectedTrack.GetDefault(\"playlist_id\", \"\") =";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_selectedtrack.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
_selectedtrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((_entryplaylistid)));};
 BA.debugLineNum = 661;BA.debugLine="If selectedTrack.GetDefault(\"playlist_title\", \"\"";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_selectedtrack.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_title"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
_selectedtrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_title"))),(Object)(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));};
 BA.debugLineNum = 662;BA.debugLine="Exit";
Debug.ShouldStop(2097152);
if (true) break;
 }
}Debug.locals.put("trackId", _trackid);
;
 BA.debugLineNum = 664;BA.debugLine="If selectedTrack.IsInitialized And selectedTrack.";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(".",_selectedtrack.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_selectedtrack.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _selectedtrack;};
 BA.debugLineNum = 665;BA.debugLine="Return emptyTrack";
Debug.ShouldStop(16777216);
if (true) return _emptytrack;
 BA.debugLineNum = 666;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveindexedauditfilename(RemoteObject __ref,RemoteObject _audittype,RemoteObject _itemid,RemoteObject _auditindex) throws Exception{
try {
		Debug.PushSubsStack("ResolveIndexedAuditFileName (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1304);
if (RapidSub.canDelegate("resolveindexedauditfilename")) { return __ref.runUserSub(false, "mediacache","resolveindexedauditfilename", __ref, _audittype, _itemid, _auditindex);}
Debug.locals.put("auditType", _audittype);
Debug.locals.put("itemId", _itemid);
Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 1304;BA.debugLine="Private Sub ResolveIndexedAuditFileName(auditType";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1305;BA.debugLine="If auditType = \"ads\" Then Return itemId";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_audittype,BA.ObjectToString("ads"))) { 
if (true) return _itemid;};
 BA.debugLineNum = 1306;BA.debugLine="Return ResolveTrackCacheFileName(itemId, auditInd";
Debug.ShouldStop(33554432);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackcachefilename" /*RemoteObject*/ ,(Object)(_itemid),(Object)(_auditindex));
 BA.debugLineNum = 1307;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("ResolveIndexedFileName (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1097);
if (RapidSub.canDelegate("resolveindexedfilename")) { return __ref.runUserSub(false, "mediacache","resolveindexedfilename", __ref, _itemtype, _itemid, _itemindex);}
Debug.locals.put("itemType", _itemtype);
Debug.locals.put("itemId", _itemid);
Debug.locals.put("itemIndex", _itemindex);
 BA.debugLineNum = 1097;BA.debugLine="Private Sub ResolveIndexedFileName(itemType As Str";
Debug.ShouldStop(256);
 BA.debugLineNum = 1098;BA.debugLine="If itemType = \"ad\" Then Return itemId";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return _itemid;};
 BA.debugLineNum = 1099;BA.debugLine="Return ResolveTrackCacheFileName(itemId, itemInde";
Debug.ShouldStop(1024);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackcachefilename" /*RemoteObject*/ ,(Object)(_itemid),(Object)(_itemindex));
 BA.debugLineNum = 1100;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("ResolveLocalMediaUri (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("resolvelocalmediauri")) { return __ref.runUserSub(false, "mediacache","resolvelocalmediauri", __ref, _item);}
RemoteObject _itemtype = RemoteObject.createImmutable("");
RemoteObject _itemid = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 144;BA.debugLine="Public Sub ResolveLocalMediaUri(item As Map) As St";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 146;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(131072);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 147;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(262144);
_itemid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemId", _itemid);Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 148;BA.debugLine="If itemId = \"\" Then Return \"\"";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 149;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_item)),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 150;BA.debugLine="If itemType = \"ad\" Then Return File.GetUri(GetAds";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getadsdir" /*RemoteObject*/ )),(Object)(_itemid));};
 BA.debugLineNum = 151;BA.debugLine="If itemType = \"track\" Then Return ResolveRelative";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativefileuri" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackrelativefilenamefromitem" /*RemoteObject*/ ,(Object)(_item))));};
 BA.debugLineNum = 152;BA.debugLine="Return \"\"";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 153;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ResolveMediaSource (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,982);
if (RapidSub.canDelegate("resolvemediasource")) { return __ref.runUserSub(false, "mediacache","resolvemediasource", __ref, _item);}
RemoteObject _itemtype = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 982;BA.debugLine="Public Sub ResolveMediaSource(item As Map) As Stri";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 983;BA.debugLine="If item.IsInitialized = False Then Return \"none\"";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("none");};
 BA.debugLineNum = 984;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(8388608);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 985;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 986;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
Debug.ShouldStop(33554432);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_item)).<Boolean>get().booleanValue()) { 
if (true) return BA.ObjectToString("cache");};
 BA.debugLineNum = 987;BA.debugLine="Return \"missing\"";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToString("missing");
 };
 BA.debugLineNum = 989;BA.debugLine="If itemType = \"track\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
 BA.debugLineNum = 990;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
Debug.ShouldStop(536870912);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_item)).<Boolean>get().booleanValue()) { 
if (true) return BA.ObjectToString("cache");};
 BA.debugLineNum = 991;BA.debugLine="Return \"missing\"";
Debug.ShouldStop(1073741824);
if (true) return BA.ObjectToString("missing");
 };
 BA.debugLineNum = 993;BA.debugLine="Return \"none\"";
Debug.ShouldStop(1);
if (true) return BA.ObjectToString("none");
 BA.debugLineNum = 994;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveminfreediskbytes(RemoteObject __ref,RemoteObject _totalbytes) throws Exception{
try {
		Debug.PushSubsStack("ResolveMinFreeDiskBytes (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1779);
if (RapidSub.canDelegate("resolveminfreediskbytes")) { return __ref.runUserSub(false, "mediacache","resolveminfreediskbytes", __ref, _totalbytes);}
RemoteObject _percentbytes = RemoteObject.createImmutable(0L);
Debug.locals.put("totalBytes", _totalbytes);
 BA.debugLineNum = 1779;BA.debugLine="Private Sub ResolveMinFreeDiskBytes(totalBytes As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1780;BA.debugLine="Dim percentBytes As Long = 0";
Debug.ShouldStop(524288);
_percentbytes = BA.numberCast(long.class, 0);Debug.locals.put("percentBytes", _percentbytes);Debug.locals.put("percentBytes", _percentbytes);
 BA.debugLineNum = 1781;BA.debugLine="If totalBytes > 0 Then percentBytes = Floor(total";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_totalbytes,BA.numberCast(long.class, 0))) { 
_percentbytes = BA.numberCast(long.class, mediacache.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_totalbytes,__ref.getField(true,"_min_free_disk_percent" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "*/",0, 0))));Debug.locals.put("percentBytes", _percentbytes);};
 BA.debugLineNum = 1782;BA.debugLine="Return Max(MbToBytes(MIN_FREE_DISK_MB), percentBy";
Debug.ShouldStop(2097152);
if (true) return BA.numberCast(long.class, mediacache.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.runClassMethod (b4j.example.mediacache.class, "_mbtobytes" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_min_free_disk_mb" /*RemoteObject*/ ))))),(Object)(BA.numberCast(double.class, _percentbytes))));
 BA.debugLineNum = 1783;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveplaybackmediauri(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ResolvePlaybackMediaUri (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("resolveplaybackmediauri")) { return __ref.runUserSub(false, "mediacache","resolveplaybackmediauri", __ref, _audiokey, _item);}
RemoteObject _itemtype = RemoteObject.createImmutable("");
RemoteObject _trackid = RemoteObject.createImmutable("");
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("item", _item);
 BA.debugLineNum = 156;BA.debugLine="Public Sub ResolvePlaybackMediaUri(audioKey As Str";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 158;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(536870912);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 159;BA.debugLine="If itemType = \"ad\" Then Return ResolveLocalMediaU";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_resolvelocalmediauri" /*RemoteObject*/ ,(Object)(_item));};
 BA.debugLineNum = 160;BA.debugLine="If itemType <> \"track\" Then Return \"\"";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",_itemtype,BA.ObjectToString("track"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 161;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(1);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 162;BA.debugLine="If trackId = \"\" Then Return \"\"";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 163;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_item)),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 164;BA.debugLine="If EnsureTrackPlaybackTemp(audioKey, item) = Fals";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_ensuretrackplaybacktemp" /*RemoteObject*/ ,(Object)(_audiokey),(Object)(_item)),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 165;BA.debugLine="Return File.GetUri(File.DirTemp, BuildPlaybackTem";
Debug.ShouldStop(16);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(mediacache.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_buildplaybacktemptrackfilename" /*RemoteObject*/ ,(Object)(_audiokey))));
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveplaylistidfortrackid(RemoteObject __ref,RemoteObject _trackid,RemoteObject _preferredplaylistid,RemoteObject _playlisttrackmaps) throws Exception{
try {
		Debug.PushSubsStack("ResolvePlaylistIdForTrackId (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1443);
if (RapidSub.canDelegate("resolveplaylistidfortrackid")) { return __ref.runUserSub(false, "mediacache","resolveplaylistidfortrackid", __ref, _trackid, _preferredplaylistid, _playlisttrackmaps);}
RemoteObject _playlistsdir = RemoteObject.createImmutable("");
RemoteObject _listed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _playlisttrackids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("trackId", _trackid);
Debug.locals.put("preferredPlaylistId", _preferredplaylistid);
Debug.locals.put("playlistTrackMaps", _playlisttrackmaps);
 BA.debugLineNum = 1443;BA.debugLine="Private Sub ResolvePlaylistIdForTrackId(trackId As";
Debug.ShouldStop(4);
 BA.debugLineNum = 1444;BA.debugLine="If trackId = \"\" Then Return \"\"";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 1445;BA.debugLine="If preferredPlaylistId <> \"\" Then Return preferre";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_preferredplaylistid,BA.ObjectToString(""))) { 
if (true) return _preferredplaylistid;};
 BA.debugLineNum = 1446;BA.debugLine="Dim playlistsDir As String = File.Combine(storage";
Debug.ShouldStop(32);
_playlistsdir = mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("playlists")));Debug.locals.put("playlistsDir", _playlistsdir);Debug.locals.put("playlistsDir", _playlistsdir);
 BA.debugLineNum = 1447;BA.debugLine="If DirectoryExists(playlistsDir) = False Then Ret";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_directoryexists" /*RemoteObject*/ ,(Object)(_playlistsdir)),mediacache.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 1448;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 1449;BA.debugLine="Dim listed As List = File.ListFiles(playlistsDir";
Debug.ShouldStop(256);
_listed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listed = mediacache.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_playlistsdir));Debug.locals.put("listed", _listed);Debug.locals.put("listed", _listed);
 BA.debugLineNum = 1450;BA.debugLine="If listed.IsInitialized = False Then Return \"\"";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_listed.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 1451;BA.debugLine="For Each fileName As String In listed";
Debug.ShouldStop(1024);
{
final RemoteObject group8 = _listed;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_filename = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("fileName", _filename);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 1452;BA.debugLine="If fileName = \"\" Then Continue";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 1453;BA.debugLine="If fileName.ToLowerCase.EndsWith(\".json\") = Fal";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_filename.runMethod(true,"toLowerCase").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".json"))),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 1454;BA.debugLine="Dim playlistId As String = fileName.SubString2(";
Debug.ShouldStop(8192);
_playlistid = _filename.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_filename.runMethod(true,"length"),RemoteObject.createImmutable(5)}, "-",1, 1)));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 1455;BA.debugLine="If playlistId = \"\" Then Continue";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 1456;BA.debugLine="Dim playlistTrackIds As Map = LoadPlaylistTrack";
Debug.ShouldStop(32768);
_playlisttrackids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlisttrackids = __ref.runClassMethod (b4j.example.mediacache.class, "_loadplaylisttrackidmap" /*RemoteObject*/ ,(Object)(_playlistid),(Object)(_playlisttrackmaps));Debug.locals.put("playlistTrackIds", _playlisttrackids);Debug.locals.put("playlistTrackIds", _playlisttrackids);
 BA.debugLineNum = 1457;BA.debugLine="If playlistTrackIds.IsInitialized = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_playlisttrackids.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 1458;BA.debugLine="If playlistTrackIds.ContainsKey(trackId) Then R";
Debug.ShouldStop(131072);
if (_playlisttrackids.runMethod(true,"ContainsKey",(Object)((_trackid))).<Boolean>get().booleanValue()) { 
Debug.CheckDeviceExceptions();if (true) return _playlistid;};
 }
}Debug.locals.put("fileName", _filename);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 1461;BA.debugLine="Trace(\"Не удалось определить playlist_id для cac";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось определить playlist_id для cached track. trackId="),_trackid,RemoteObject.createImmutable(", message="),mediacache.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 1463;BA.debugLine="Return \"\"";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 1464;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolverelativefileuri(RemoteObject __ref,RemoteObject _basedir,RemoteObject _relativefilename) throws Exception{
try {
		Debug.PushSubsStack("ResolveRelativeFileUri (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1709);
if (RapidSub.canDelegate("resolverelativefileuri")) { return __ref.runUserSub(false, "mediacache","resolverelativefileuri", __ref, _basedir, _relativefilename);}
Debug.locals.put("baseDir", _basedir);
Debug.locals.put("relativeFileName", _relativefilename);
 BA.debugLineNum = 1709;BA.debugLine="Private Sub ResolveRelativeFileUri(baseDir As Stri";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1710;BA.debugLine="Return File.GetUri(ResolveRelativeParentDir(baseD";
Debug.ShouldStop(8192);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativeparentdir" /*RemoteObject*/ ,(Object)(_basedir),(Object)(_relativefilename))),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_resolverelativeleafname" /*RemoteObject*/ ,(Object)(_relativefilename))));
 BA.debugLineNum = 1711;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolverelativeleafname(RemoteObject __ref,RemoteObject _relativefilename) throws Exception{
try {
		Debug.PushSubsStack("ResolveRelativeLeafName (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1702);
if (RapidSub.canDelegate("resolverelativeleafname")) { return __ref.runUserSub(false, "mediacache","resolverelativeleafname", __ref, _relativefilename);}
RemoteObject _normalizedname = RemoteObject.createImmutable("");
RemoteObject _slashindex = RemoteObject.createImmutable(0);
Debug.locals.put("relativeFileName", _relativefilename);
 BA.debugLineNum = 1702;BA.debugLine="Private Sub ResolveRelativeLeafName(relativeFileNa";
Debug.ShouldStop(32);
 BA.debugLineNum = 1703;BA.debugLine="Dim normalizedName As String = relativeFileName.R";
Debug.ShouldStop(64);
_normalizedname = _relativefilename.runMethod(true,"replace",(Object)(BA.ObjectToString("\\\\")),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("normalizedName", _normalizedname);Debug.locals.put("normalizedName", _normalizedname);
 BA.debugLineNum = 1704;BA.debugLine="Dim slashIndex As Int = normalizedName.LastIndexO";
Debug.ShouldStop(128);
_slashindex = _normalizedname.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("slashIndex", _slashindex);Debug.locals.put("slashIndex", _slashindex);
 BA.debugLineNum = 1705;BA.debugLine="If slashIndex < 0 Then Return normalizedName";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("<",_slashindex,BA.numberCast(double.class, 0))) { 
if (true) return _normalizedname;};
 BA.debugLineNum = 1706;BA.debugLine="Return normalizedName.SubString(slashIndex + 1)";
Debug.ShouldStop(512);
if (true) return _normalizedname.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_slashindex,RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 1707;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolverelativeparentdir(RemoteObject __ref,RemoteObject _basedir,RemoteObject _relativefilename) throws Exception{
try {
		Debug.PushSubsStack("ResolveRelativeParentDir (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1693);
if (RapidSub.canDelegate("resolverelativeparentdir")) { return __ref.runUserSub(false, "mediacache","resolverelativeparentdir", __ref, _basedir, _relativefilename);}
RemoteObject _normalizedname = RemoteObject.createImmutable("");
RemoteObject _slashindex = RemoteObject.createImmutable(0);
RemoteObject _parentrelative = RemoteObject.createImmutable("");
Debug.locals.put("baseDir", _basedir);
Debug.locals.put("relativeFileName", _relativefilename);
 BA.debugLineNum = 1693;BA.debugLine="Private Sub ResolveRelativeParentDir(baseDir As St";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1694;BA.debugLine="Dim normalizedName As String = relativeFileName.R";
Debug.ShouldStop(536870912);
_normalizedname = _relativefilename.runMethod(true,"replace",(Object)(BA.ObjectToString("\\\\")),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("normalizedName", _normalizedname);Debug.locals.put("normalizedName", _normalizedname);
 BA.debugLineNum = 1695;BA.debugLine="Dim slashIndex As Int = normalizedName.LastIndexO";
Debug.ShouldStop(1073741824);
_slashindex = _normalizedname.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("slashIndex", _slashindex);Debug.locals.put("slashIndex", _slashindex);
 BA.debugLineNum = 1696;BA.debugLine="If slashIndex < 0 Then Return baseDir";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",_slashindex,BA.numberCast(double.class, 0))) { 
if (true) return _basedir;};
 BA.debugLineNum = 1697;BA.debugLine="Dim parentRelative As String = normalizedName.Sub";
Debug.ShouldStop(1);
_parentrelative = _normalizedname.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_slashindex));Debug.locals.put("parentRelative", _parentrelative);Debug.locals.put("parentRelative", _parentrelative);
 BA.debugLineNum = 1698;BA.debugLine="If parentRelative = \"\" Then Return baseDir";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_parentrelative,BA.ObjectToString(""))) { 
if (true) return _basedir;};
 BA.debugLineNum = 1699;BA.debugLine="Return File.Combine(baseDir, parentRelative)";
Debug.ShouldStop(4);
if (true) return mediacache.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_basedir),(Object)(_parentrelative));
 BA.debugLineNum = 1700;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("ResolveTrackCacheFileName (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1102);
if (RapidSub.canDelegate("resolvetrackcachefilename")) { return __ref.runUserSub(false, "mediacache","resolvetrackcachefilename", __ref, _trackid, _trackindex);}
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _playlistid = RemoteObject.createImmutable("");
Debug.locals.put("trackId", _trackid);
Debug.locals.put("trackIndex", _trackindex);
 BA.debugLineNum = 1102;BA.debugLine="Private Sub ResolveTrackCacheFileName(trackId As S";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1103;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
Debug.ShouldStop(16384);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackindex.runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 1104;BA.debugLine="If entry.IsInitialized Then";
Debug.ShouldStop(32768);
if (_entry.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1105;BA.debugLine="Dim fileName As String = entry.GetDefault(\"file_";
Debug.ShouldStop(65536);
_filename = BA.ObjectToString(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 1106;BA.debugLine="If fileName <> \"\" Then Return fileName";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",_filename,BA.ObjectToString(""))) { 
if (true) return _filename;};
 };
 BA.debugLineNum = 1108;BA.debugLine="Dim playlistId As String = \"\"";
Debug.ShouldStop(524288);
_playlistid = BA.ObjectToString("");Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 1109;BA.debugLine="If entry.IsInitialized Then playlistId = entry.Ge";
Debug.ShouldStop(1048576);
if (_entry.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_playlistid = BA.ObjectToString(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);};
 BA.debugLineNum = 1110;BA.debugLine="Return BuildTrackCacheRelativeFileName(trackId, p";
Debug.ShouldStop(2097152);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcacherelativefilename" /*RemoteObject*/ ,(Object)(_trackid),(Object)(_playlistid));
 BA.debugLineNum = 1111;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvetrackplaylistid(RemoteObject __ref,RemoteObject _item,RemoteObject _trackindex,RemoteObject _trackid) throws Exception{
try {
		Debug.PushSubsStack("ResolveTrackPlaylistId (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1576);
if (RapidSub.canDelegate("resolvetrackplaylistid")) { return __ref.runUserSub(false, "mediacache","resolvetrackplaylistid", __ref, _item, _trackindex, _trackid);}
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("item", _item);
Debug.locals.put("trackIndex", _trackindex);
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 1576;BA.debugLine="Private Sub ResolveTrackPlaylistId(item As Map, tr";
Debug.ShouldStop(128);
 BA.debugLineNum = 1577;BA.debugLine="If item.IsInitialized Then";
Debug.ShouldStop(256);
if (_item.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1578;BA.debugLine="Dim playlistId As String = item.GetDefault(\"play";
Debug.ShouldStop(512);
_playlistid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 1579;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("!",_playlistid,BA.ObjectToString(""))) { 
if (true) return _playlistid;};
 };
 BA.debugLineNum = 1581;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
Debug.ShouldStop(4096);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackindex.runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 1582;BA.debugLine="If entry.IsInitialized Then Return entry.GetDefau";
Debug.ShouldStop(8192);
if (_entry.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
if (true) return BA.ObjectToString(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))));};
 BA.debugLineNum = 1583;BA.debugLine="Return \"\"";
Debug.ShouldStop(16384);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 1584;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvetrackrelativefilenamefromitem(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ResolveTrackRelativeFileNameFromItem (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,815);
if (RapidSub.canDelegate("resolvetrackrelativefilenamefromitem")) { return __ref.runUserSub(false, "mediacache","resolvetrackrelativefilenamefromitem", __ref, _item);}
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _preferredrelativename = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 815;BA.debugLine="Private Sub ResolveTrackRelativeFileNameFromItem(i";
Debug.ShouldStop(16384);
 BA.debugLineNum = 816;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(32768);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 817;BA.debugLine="If trackId = \"\" Then Return \"\"";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 818;BA.debugLine="Dim playlistId As String = item.GetDefault(\"playl";
Debug.ShouldStop(131072);
_playlistid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 819;BA.debugLine="Dim preferredRelativeName As String = BuildTrackC";
Debug.ShouldStop(262144);
_preferredrelativename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcacherelativefilename" /*RemoteObject*/ ,(Object)(_trackid),(Object)(_playlistid));Debug.locals.put("preferredRelativeName", _preferredrelativename);Debug.locals.put("preferredRelativeName", _preferredrelativename);
 BA.debugLineNum = 820;BA.debugLine="If IsCachedFileUsable(GetTracksDir, preferredRela";
Debug.ShouldStop(524288);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_preferredrelativename)).<Boolean>get().booleanValue()) { 
if (true) return _preferredrelativename;};
 BA.debugLineNum = 821;BA.debugLine="Return ResolveTrackCacheFileName(trackId, cachedT";
Debug.ShouldStop(1048576);
if (true) return __ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackcachefilename" /*RemoteObject*/ ,(Object)(_trackid),(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ )));
 BA.debugLineNum = 822;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("RestoreIndexedFileById (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1052);
if (RapidSub.canDelegate("restoreindexedfilebyid")) { return __ref.runUserSub(false, "mediacache","restoreindexedfilebyid", __ref, _itemid, _itemindex);}
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
Debug.locals.put("itemId", _itemid);
Debug.locals.put("itemIndex", _itemindex);
 BA.debugLineNum = 1052;BA.debugLine="Private Sub RestoreIndexedFileById(itemId As Strin";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1053;BA.debugLine="Dim entry As Map = itemIndex.GetDefault(itemId, N";
Debug.ShouldStop(268435456);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemindex.runMethod(false,"GetDefault",(Object)((_itemid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 1054;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Initialize");};
 BA.debugLineNum = 1055;BA.debugLine="entry.Put(\"id\", itemId)";
Debug.ShouldStop(1073741824);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_itemid)));
 BA.debugLineNum = 1056;BA.debugLine="Dim playlistId As String = entry.GetDefault(\"play";
Debug.ShouldStop(-2147483648);
_playlistid = BA.ObjectToString(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 1057;BA.debugLine="entry.Put(\"file_name\", BuildTrackCacheRelativeFil";
Debug.ShouldStop(1);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((__ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcacherelativefilename" /*RemoteObject*/ ,(Object)(_itemid),(Object)(_playlistid)))));
 BA.debugLineNum = 1058;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("saved_at")))),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));};
 BA.debugLineNum = 1059;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(4);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 1060;BA.debugLine="itemIndex.Put(itemId, entry)";
Debug.ShouldStop(8);
_itemindex.runVoidMethod ("Put",(Object)((_itemid)),(Object)((_entry.getObject())));
 BA.debugLineNum = 1061;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("RunCacheAuditStep (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("runcacheauditstep")) { return __ref.runUserSub(false, "mediacache","runcacheauditstep", __ref);}
 BA.debugLineNum = 89;BA.debugLine="Public Sub RunCacheAuditStep As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="If cacheAuditInProgress = False Then Return False";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cacheauditinprogress" /*RemoteObject*/ ),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 91;BA.debugLine="If cacheAuditCurrentType = \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 92;BA.debugLine="If PrepareNextCacheAuditType = False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_preparenextcacheaudittype" /*RemoteObject*/ ),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 93;BA.debugLine="FinishCacheAudit";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.mediacache.class, "_finishcacheaudit" /*RemoteObject*/ );
 BA.debugLineNum = 94;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) return mediacache.__c.getField(true,"False");
 };
 };
 BA.debugLineNum = 97;BA.debugLine="If cacheAuditListingInProgress Then Return True";
Debug.ShouldStop(1);
if (__ref.getField(true,"_cacheauditlistinginprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 98;BA.debugLine="ProcessCurrentCacheAuditBatch";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.mediacache.class, "_processcurrentcacheauditbatch" /*RemoteObject*/ );
 BA.debugLineNum = 99;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurrent";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_cacheauditcurrentposition" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 100;BA.debugLine="FinalizeCurrentCacheAuditType";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.mediacache.class, "_finalizecurrentcacheaudittype" /*RemoteObject*/ );
 BA.debugLineNum = 101;BA.debugLine="cacheAuditCurrentType = \"\"";
Debug.ShouldStop(16);
__ref.setField ("_cacheauditcurrenttype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 102;BA.debugLine="If cacheAuditPendingTypes.Size = 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 103;BA.debugLine="FinishCacheAudit";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.mediacache.class, "_finishcacheaudit" /*RemoteObject*/ );
 BA.debugLineNum = 104;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) return mediacache.__c.getField(true,"False");
 };
 };
 BA.debugLineNum = 107;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return mediacache.__c.getField(true,"True");
 BA.debugLineNum = 108;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SaveAdIndex (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,697);
if (RapidSub.canDelegate("saveadindex")) { return __ref.runUserSub(false, "mediacache","saveadindex", __ref);}
 BA.debugLineNum = 697;BA.debugLine="Private Sub SaveAdIndex";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 698;BA.debugLine="RebuildCacheStatsFromIndexes";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.mediacache.class, "_rebuildcachestatsfromindexes" /*RemoteObject*/ );
 BA.debugLineNum = 699;BA.debugLine="storage.Put(\"cached_ad_index\", cachedAdIndex)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_index")),(Object)((__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 700;BA.debugLine="storage.Put(\"cached_ad_count\", cachedAdCount)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_ad_count")),(Object)((__ref.getField(true,"_cachedadcount" /*RemoteObject*/ ))));
 BA.debugLineNum = 701;BA.debugLine="SaveCacheStatsSnapshot";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.mediacache.class, "_savecachestatssnapshot" /*RemoteObject*/ );
 BA.debugLineNum = 702;BA.debugLine="cachedAdIndexDirty = False";
Debug.ShouldStop(536870912);
__ref.setField ("_cachedadindexdirty" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 703;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savecachestatssnapshot(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SaveCacheStatsSnapshot (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1731);
if (RapidSub.canDelegate("savecachestatssnapshot")) { return __ref.runUserSub(false, "mediacache","savecachestatssnapshot", __ref);}
 BA.debugLineNum = 1731;BA.debugLine="Private Sub SaveCacheStatsSnapshot";
Debug.ShouldStop(4);
 BA.debugLineNum = 1732;BA.debugLine="storage.Put(\"cache_stats_track_count\", cachedTrac";
Debug.ShouldStop(8);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache_stats_track_count")),(Object)((__ref.getField(true,"_cachedtrackcount" /*RemoteObject*/ ))));
 BA.debugLineNum = 1733;BA.debugLine="storage.Put(\"cache_stats_ad_count\", cachedAdCount";
Debug.ShouldStop(16);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache_stats_ad_count")),(Object)((__ref.getField(true,"_cachedadcount" /*RemoteObject*/ ))));
 BA.debugLineNum = 1734;BA.debugLine="storage.Put(\"cache_stats_track_bytes\", cachedTrac";
Debug.ShouldStop(32);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache_stats_track_bytes")),(Object)((__ref.getField(true,"_cachedtrackbytes" /*RemoteObject*/ ))));
 BA.debugLineNum = 1735;BA.debugLine="storage.Put(\"cache_stats_ad_bytes\", cachedAdBytes";
Debug.ShouldStop(64);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache_stats_ad_bytes")),(Object)((__ref.getField(true,"_cachedadbytes" /*RemoteObject*/ ))));
 BA.debugLineNum = 1736;BA.debugLine="storage.Put(\"cache_stats_track_playlist\", cachedT";
Debug.ShouldStop(128);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache_stats_track_playlist")),(Object)((__ref.getField(false,"_cachedtrackplayliststats" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 1737;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("SaveIndexByItemType (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1089);
if (RapidSub.canDelegate("saveindexbyitemtype")) { return __ref.runUserSub(false, "mediacache","saveindexbyitemtype", __ref, _itemtype);}
Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 1089;BA.debugLine="Private Sub SaveIndexByItemType(itemType As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 1090;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 1091;BA.debugLine="SaveAdIndex";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 1093;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 };
 BA.debugLineNum = 1095;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("SaveTrackIndex (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,705);
if (RapidSub.canDelegate("savetrackindex")) { return __ref.runUserSub(false, "mediacache","savetrackindex", __ref);}
 BA.debugLineNum = 705;BA.debugLine="Private Sub SaveTrackIndex";
Debug.ShouldStop(1);
 BA.debugLineNum = 706;BA.debugLine="RebuildCacheStatsFromIndexes";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.mediacache.class, "_rebuildcachestatsfromindexes" /*RemoteObject*/ );
 BA.debugLineNum = 707;BA.debugLine="storage.Put(\"cached_track_index\", cachedTrackInde";
Debug.ShouldStop(4);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_track_index")),(Object)((__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 708;BA.debugLine="storage.Put(\"cached_track_count\", cachedTrackCoun";
Debug.ShouldStop(8);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_track_count")),(Object)((__ref.getField(true,"_cachedtrackcount" /*RemoteObject*/ ))));
 BA.debugLineNum = 709;BA.debugLine="SaveCacheStatsSnapshot";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.mediacache.class, "_savecachestatssnapshot" /*RemoteObject*/ );
 BA.debugLineNum = 710;BA.debugLine="cachedTrackIndexDirty = False";
Debug.ShouldStop(32);
__ref.setField ("_cachedtrackindexdirty" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 711;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sorttrackprunecandidates(RemoteObject __ref,RemoteObject _candidates) throws Exception{
try {
		Debug.PushSubsStack("SortTrackPruneCandidates (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1640);
if (RapidSub.canDelegate("sorttrackprunecandidates")) { return __ref.runUserSub(false, "mediacache","sorttrackprunecandidates", __ref, _candidates);}
int _i = 0;
int _j = 0;
RemoteObject _leftitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rightitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("candidates", _candidates);
 BA.debugLineNum = 1640;BA.debugLine="Private Sub SortTrackPruneCandidates(candidates As";
Debug.ShouldStop(128);
 BA.debugLineNum = 1641;BA.debugLine="If candidates.IsInitialized = False Or candidates";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_candidates.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False")) || RemoteObject.solveBoolean("<",_candidates.runMethod(true,"getSize"),BA.numberCast(double.class, 2))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1642;BA.debugLine="For i = 0 To candidates.Size - 2";
Debug.ShouldStop(512);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_candidates.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1643;BA.debugLine="For j = i + 1 To candidates.Size - 1";
Debug.ShouldStop(1024);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_candidates.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ;
for (;(step3 > 0 && _j <= limit3) || (step3 < 0 && _j >= limit3) ;_j = ((int)(0 + _j + step3))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 1644;BA.debugLine="Dim leftItem As Map = candidates.Get(i)";
Debug.ShouldStop(2048);
_leftitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_leftitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _candidates.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("leftItem", _leftitem);Debug.locals.put("leftItem", _leftitem);
 BA.debugLineNum = 1645;BA.debugLine="Dim rightItem As Map = candidates.Get(j)";
Debug.ShouldStop(4096);
_rightitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rightitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _candidates.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));Debug.locals.put("rightItem", _rightitem);Debug.locals.put("rightItem", _rightitem);
 BA.debugLineNum = 1646;BA.debugLine="If CompareTrackPruneCandidates(leftItem, rightI";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",__ref.runClassMethod (b4j.example.mediacache.class, "_comparetrackprunecandidates" /*RemoteObject*/ ,(Object)(_leftitem),(Object)(_rightitem)),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1647;BA.debugLine="candidates.Set(i, rightItem)";
Debug.ShouldStop(16384);
_candidates.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, _i)),(Object)((_rightitem.getObject())));
 BA.debugLineNum = 1648;BA.debugLine="candidates.Set(j, leftItem)";
Debug.ShouldStop(32768);
_candidates.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, _j)),(Object)((_leftitem.getObject())));
 };
 }
}Debug.locals.put("j", _j);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1652;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("StartCacheAudit (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("startcacheaudit")) { return __ref.runUserSub(false, "mediacache","startcacheaudit", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Public Sub StartCacheAudit";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="If cacheAuditInProgress Then Return";
Debug.ShouldStop(32);
if (__ref.getField(true,"_cacheauditinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 71;BA.debugLine="cacheAuditPendingTypes.Initialize";
Debug.ShouldStop(64);
__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="cacheAuditPendingTypes.Add(\"ads\")";
Debug.ShouldStop(128);
__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("ads"))));
 BA.debugLineNum = 73;BA.debugLine="cacheAuditPendingTypes.Add(\"tracks\")";
Debug.ShouldStop(256);
__ref.getField(false,"_cacheauditpendingtypes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("tracks"))));
 BA.debugLineNum = 74;BA.debugLine="cacheAuditCurrentType = \"\"";
Debug.ShouldStop(512);
__ref.setField ("_cacheauditcurrenttype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 75;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 76;BA.debugLine="cacheAuditCurrentPosition = 0";
Debug.ShouldStop(2048);
__ref.setField ("_cacheauditcurrentposition" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 77;BA.debugLine="cacheAuditSeenIds.Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_cacheauditseenids" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 78;BA.debugLine="cacheAuditAdIndexChanged = False";
Debug.ShouldStop(8192);
__ref.setField ("_cacheauditadindexchanged" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 79;BA.debugLine="cacheAuditTrackIndexChanged = False";
Debug.ShouldStop(16384);
__ref.setField ("_cacheaudittrackindexchanged" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 80;BA.debugLine="cacheAuditAddedCount = 0";
Debug.ShouldStop(32768);
__ref.setField ("_cacheauditaddedcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 81;BA.debugLine="cacheAuditRemovedCount = 0";
Debug.ShouldStop(65536);
__ref.setField ("_cacheauditremovedcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 82;BA.debugLine="cacheAuditTempDeletedCount = 0";
Debug.ShouldStop(131072);
__ref.setField ("_cacheaudittempdeletedcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 83;BA.debugLine="cacheAuditListingInProgress = False";
Debug.ShouldStop(262144);
__ref.setField ("_cacheauditlistinginprogress" /*RemoteObject*/ ,mediacache.__c.getField(true,"False"));
 BA.debugLineNum = 84;BA.debugLine="cacheAuditListingDir = \"\"";
Debug.ShouldStop(524288);
__ref.setField ("_cacheauditlistingdir" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 85;BA.debugLine="cacheAuditInProgress = True";
Debug.ShouldStop(1048576);
__ref.setField ("_cacheauditinprogress" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startcacheauditfilelistingasync(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StartCacheAuditFileListingAsync (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1169);
if (RapidSub.canDelegate("startcacheauditfilelistingasync")) { return __ref.runUserSub(false, "mediacache","startcacheauditfilelistingasync", __ref);}
ResumableSub_StartCacheAuditFileListingAsync rsub = new ResumableSub_StartCacheAuditFileListingAsync(null,__ref);
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
public static class ResumableSub_StartCacheAuditFileListingAsync extends BA.ResumableSub {
public ResumableSub_StartCacheAuditFileListingAsync(b4j.example.mediacache parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.mediacache parent;
RemoteObject _listedfiles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StartCacheAuditFileListingAsync (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1169);
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
 BA.debugLineNum = 1170;BA.debugLine="Dim listedFiles As List";
Debug.ShouldStop(131072);
_listedfiles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listedFiles", _listedfiles);
 BA.debugLineNum = 1171;BA.debugLine="listedFiles.Initialize";
Debug.ShouldStop(262144);
_listedfiles.runVoidMethod ("Initialize");
 BA.debugLineNum = 1172;BA.debugLine="Wait For (File.ListFilesAsync(cacheAuditListingDi";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mediacache", "startcacheauditfilelistingasync"), parent.__c.getField(false,"File").runMethod(false,"ListFilesAsync",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_cacheauditlistingdir" /*RemoteObject*/ ))));
this.state = 16;
return;
case 16:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("files", _files);
;
 BA.debugLineNum = 1173;BA.debugLine="If success And files.IsInitialized Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(".",_success) && RemoteObject.solveBoolean(".",_files.runMethod(true,"IsInitialized"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1174;BA.debugLine="listedFiles = files";
Debug.ShouldStop(2097152);
_listedfiles = _files;Debug.locals.put("listedFiles", _listedfiles);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1176;BA.debugLine="Trace(\"Не удалось получить список файлов для ауд";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.mediacache.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось получить список файлов для аудита кэша async. type="),__ref.getField(true,"_cacheauditcurrenttype" /*RemoteObject*/ ),RemoteObject.createImmutable(", success="),_success)));
 if (true) break;
;
 BA.debugLineNum = 1178;BA.debugLine="If cacheAuditCurrentFileNames.IsInitialized = Fal";
Debug.ShouldStop(33554432);

case 6:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),parent.__c.getField(true,"False"))) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runVoidMethod ("Initialize");
if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 1179;BA.debugLine="cacheAuditCurrentFileNames.Clear";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1180;BA.debugLine="For Each fileName As String In listedFiles";
Debug.ShouldStop(134217728);
if (true) break;

case 12:
//for
this.state = 15;
group11 = _listedfiles;
index11 = 0;
groupLen11 = group11.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("fileName", _filename);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 15;
if (index11 < groupLen11) {
this.state = 14;
_filename = BA.ObjectToString(group11.runMethod(false,"Get",index11));Debug.locals.put("fileName", _filename);}
if (true) break;

case 18:
//C
this.state = 17;
index11++;
Debug.locals.put("fileName", _filename);
if (true) break;

case 14:
//C
this.state = 18;
 BA.debugLineNum = 1181;BA.debugLine="cacheAuditCurrentFileNames.Add(fileName)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cacheauditcurrentfilenames" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_filename)));
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
Debug.locals.put("fileName", _filename);
;
 BA.debugLineNum = 1183;BA.debugLine="cacheAuditListingInProgress = False";
Debug.ShouldStop(1073741824);
__ref.setField ("_cacheauditlistinginprogress" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1184;BA.debugLine="cacheAuditListingDir = \"\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_cacheauditlistingdir" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1185;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1186;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static RemoteObject  _tolongdefault(RemoteObject __ref,RemoteObject _value,RemoteObject _defaultvalue) throws Exception{
try {
		Debug.PushSubsStack("ToLongDefault (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1713);
if (RapidSub.canDelegate("tolongdefault")) { return __ref.runUserSub(false, "mediacache","tolongdefault", __ref, _value, _defaultvalue);}
Debug.locals.put("value", _value);
Debug.locals.put("defaultValue", _defaultvalue);
 BA.debugLineNum = 1713;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1714;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 1715;BA.debugLine="If value = Null Then Return defaultValue";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("n",_value)) { 
Debug.CheckDeviceExceptions();if (true) return _defaultvalue;};
 BA.debugLineNum = 1716;BA.debugLine="Return value";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, _value);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 1718;BA.debugLine="Return defaultValue";
Debug.ShouldStop(2097152);
if (true) return _defaultvalue;
 };
 BA.debugLineNum = 1720;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _touchcacheditem(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("TouchCachedItem (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,668);
if (RapidSub.canDelegate("touchcacheditem")) { return __ref.runUserSub(false, "mediacache","touchcacheditem", __ref, _item);}
RemoteObject _itemid = RemoteObject.createImmutable("");
RemoteObject _itemtype = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 668;BA.debugLine="Public Sub TouchCachedItem(item As Map)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 669;BA.debugLine="If item.IsInitialized = False Then Return";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 670;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(536870912);
_itemid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemId", _itemid);Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 671;BA.debugLine="If itemId = \"\" Then Return";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 672;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(-2147483648);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 673;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 674;BA.debugLine="If cachedAdIndex.ContainsKey(itemId) = False The";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedadindex" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_itemid))),mediacache.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 675;BA.debugLine="UpdateAdIndex(item, cachedAdIndex)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_item),(Object)(__ref.getField(false,"_cachedadindex" /*RemoteObject*/ )));
 BA.debugLineNum = 676;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 678;BA.debugLine="If itemType = \"track\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
 BA.debugLineNum = 679;BA.debugLine="If cachedTrackIndex.ContainsKey(itemId) = False";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_itemid))),mediacache.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 680;BA.debugLine="UpdateTrackIndex(item, cachedTrackIndex)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 682;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Trace (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1819);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "mediacache","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 1819;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1820;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
Debug.ShouldStop(134217728);
if (mediacache.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1821;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
Debug.ShouldStop(268435456);
mediacache.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ )),(Object)((_message)));
 };
 BA.debugLineNum = 1823;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("TransformStreamWithXor (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,945);
if (RapidSub.canDelegate("transformstreamwithxor")) { return __ref.runUserSub(false, "mediacache","transformstreamwithxor", __ref, _inputstream, _outputstream, _keybytes);}
RemoteObject _buffer = null;
RemoteObject _totalprocessed = RemoteObject.createImmutable(0L);
RemoteObject _count = RemoteObject.createImmutable(0);
Debug.locals.put("inputStream", _inputstream);
Debug.locals.put("outputStream", _outputstream);
Debug.locals.put("keyBytes", _keybytes);
 BA.debugLineNum = 945;BA.debugLine="Private Sub TransformStreamWithXor(inputStream As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 946;BA.debugLine="If keyBytes.Length = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_keybytes.getField(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 947;BA.debugLine="File.Copy2(inputStream, outputStream)";
Debug.ShouldStop(262144);
mediacache.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_inputstream.getObject())),(Object)((_outputstream.getObject())));
 BA.debugLineNum = 948;BA.debugLine="outputStream.Flush";
Debug.ShouldStop(524288);
_outputstream.runVoidMethod ("Flush");
 BA.debugLineNum = 949;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 951;BA.debugLine="Dim buffer(STREAM_XOR_BUFFER_SIZE) As Byte";
Debug.ShouldStop(4194304);
_buffer = RemoteObject.createNewArray ("byte", new int[] {__ref.getField(true,"_stream_xor_buffer_size" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 952;BA.debugLine="Dim totalProcessed As Long = 0";
Debug.ShouldStop(8388608);
_totalprocessed = BA.numberCast(long.class, 0);Debug.locals.put("totalProcessed", _totalprocessed);Debug.locals.put("totalProcessed", _totalprocessed);
 BA.debugLineNum = 953;BA.debugLine="Do While True";
Debug.ShouldStop(16777216);
while (mediacache.__c.getField(true,"True").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 954;BA.debugLine="Dim count As Int = inputStream.ReadBytes(buffer,";
Debug.ShouldStop(33554432);
_count = _inputstream.runMethod(true,"ReadBytes",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")));Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 955;BA.debugLine="If count <= 0 Then Exit";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("k",_count,BA.numberCast(double.class, 0))) { 
if (true) break;};
 BA.debugLineNum = 956;BA.debugLine="ApplyXorToBuffer(buffer, count, keyBytes, totalP";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.mediacache.class, "_applyxortobuffer" /*RemoteObject*/ ,(Object)(_buffer),(Object)(_count),(Object)(_keybytes),(Object)(_totalprocessed));
 BA.debugLineNum = 957;BA.debugLine="outputStream.WriteBytes(buffer, 0, count)";
Debug.ShouldStop(268435456);
_outputstream.runVoidMethod ("WriteBytes",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_count));
 BA.debugLineNum = 958;BA.debugLine="totalProcessed = totalProcessed + count";
Debug.ShouldStop(536870912);
_totalprocessed = RemoteObject.solve(new RemoteObject[] {_totalprocessed,_count}, "+",1, 2);Debug.locals.put("totalProcessed", _totalprocessed);
 }
;
 BA.debugLineNum = 960;BA.debugLine="outputStream.Flush";
Debug.ShouldStop(-2147483648);
_outputstream.runVoidMethod ("Flush");
 BA.debugLineNum = 961;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tryhealtrackindexentry(RemoteObject __ref,RemoteObject _trackid,RemoteObject _trackindex,RemoteObject _trackdir,RemoteObject _currentfilename) throws Exception{
try {
		Debug.PushSubsStack("TryHealTrackIndexEntry (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1024);
if (RapidSub.canDelegate("tryhealtrackindexentry")) { return __ref.runUserSub(false, "mediacache","tryhealtrackindexentry", __ref, _trackid, _trackindex, _trackdir, _currentfilename);}
RemoteObject _expectedplaylistid = RemoteObject.createImmutable("");
RemoteObject _existingentry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _expectedfilename = RemoteObject.createImmutable("");
RemoteObject _healedfilename = RemoteObject.createImmutable("");
Debug.locals.put("trackId", _trackid);
Debug.locals.put("trackIndex", _trackindex);
Debug.locals.put("trackDir", _trackdir);
Debug.locals.put("currentFileName", _currentfilename);
 BA.debugLineNum = 1024;BA.debugLine="Private Sub TryHealTrackIndexEntry(trackId As Stri";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1025;BA.debugLine="If trackId = \"\" Then Return False";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 1026;BA.debugLine="If IsCachedFileUsable(trackDir, currentFileName)";
Debug.ShouldStop(2);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_trackdir),(Object)(_currentfilename)).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 1027;BA.debugLine="Dim expectedPlaylistId As String = \"\"";
Debug.ShouldStop(4);
_expectedplaylistid = BA.ObjectToString("");Debug.locals.put("expectedPlaylistId", _expectedplaylistid);Debug.locals.put("expectedPlaylistId", _expectedplaylistid);
 BA.debugLineNum = 1028;BA.debugLine="Dim existingEntry As Map = trackIndex.GetDefault(";
Debug.ShouldStop(8);
_existingentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_existingentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackindex.runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("existingEntry", _existingentry);Debug.locals.put("existingEntry", _existingentry);
 BA.debugLineNum = 1029;BA.debugLine="If existingEntry.IsInitialized Then expectedPlayl";
Debug.ShouldStop(16);
if (_existingentry.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_expectedplaylistid = BA.ObjectToString(_existingentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("expectedPlaylistId", _expectedplaylistid);};
 BA.debugLineNum = 1030;BA.debugLine="Dim expectedFileName As String = BuildTrackCacheR";
Debug.ShouldStop(32);
_expectedfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcacherelativefilename" /*RemoteObject*/ ,(Object)(_trackid),(Object)(_expectedplaylistid));Debug.locals.put("expectedFileName", _expectedfilename);Debug.locals.put("expectedFileName", _expectedfilename);
 BA.debugLineNum = 1031;BA.debugLine="If expectedFileName <> \"\" And expectedFileName <>";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",_expectedfilename,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_expectedfilename,_currentfilename)) { 
 BA.debugLineNum = 1032;BA.debugLine="If IsCachedFileUsable(trackDir, expectedFileName";
Debug.ShouldStop(128);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_trackdir),(Object)(_expectedfilename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1033;BA.debugLine="If existingEntry.IsInitialized = False Then exi";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_existingentry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
_existingentry.runVoidMethod ("Initialize");};
 BA.debugLineNum = 1034;BA.debugLine="existingEntry.Put(\"id\", trackId)";
Debug.ShouldStop(512);
_existingentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_trackid)));
 BA.debugLineNum = 1035;BA.debugLine="existingEntry.Put(\"playlist_id\", expectedPlayli";
Debug.ShouldStop(1024);
_existingentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((_expectedplaylistid)));
 BA.debugLineNum = 1036;BA.debugLine="existingEntry.Put(\"file_name\", expectedFileName";
Debug.ShouldStop(2048);
_existingentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((_expectedfilename)));
 BA.debugLineNum = 1037;BA.debugLine="existingEntry.Put(\"size_bytes\", GetFileSizeSafe";
Debug.ShouldStop(4096);
_existingentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("size_bytes"))),(Object)((__ref.runClassMethod (b4j.example.mediacache.class, "_getfilesizesafe" /*RemoteObject*/ ,(Object)(_trackdir),(Object)(_expectedfilename)))));
 BA.debugLineNum = 1038;BA.debugLine="If existingEntry.ContainsKey(\"saved_at\") = Fals";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_existingentry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("saved_at")))),mediacache.__c.getField(true,"False"))) { 
_existingentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));};
 BA.debugLineNum = 1039;BA.debugLine="existingEntry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(16384);
_existingentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 1040;BA.debugLine="trackIndex.Put(trackId, existingEntry)";
Debug.ShouldStop(32768);
_trackindex.runVoidMethod ("Put",(Object)((_trackid)),(Object)((_existingentry.getObject())));
 BA.debugLineNum = 1041;BA.debugLine="cachedTrackIndexDirty = True";
Debug.ShouldStop(65536);
__ref.setField ("_cachedtrackindexdirty" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 BA.debugLineNum = 1042;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 1043;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) return mediacache.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 1046;BA.debugLine="BackfillTrackIndexFromFiles";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.mediacache.class, "_backfilltrackindexfromfiles" /*RemoteObject*/ );
 BA.debugLineNum = 1047;BA.debugLine="Dim healedFileName As String = ResolveTrackCacheF";
Debug.ShouldStop(4194304);
_healedfilename = __ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackcachefilename" /*RemoteObject*/ ,(Object)(_trackid),(Object)(__ref.getField(false,"_cachedtrackindex" /*RemoteObject*/ )));Debug.locals.put("healedFileName", _healedfilename);Debug.locals.put("healedFileName", _healedfilename);
 BA.debugLineNum = 1048;BA.debugLine="If IsCachedFileUsable(trackDir, healedFileName) T";
Debug.ShouldStop(8388608);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_trackdir),(Object)(_healedfilename)).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 1049;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 1050;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tryrestoreexistingcachedmedia(RemoteObject __ref,RemoteObject _itemtype,RemoteObject _itemid,RemoteObject _item,RemoteObject _itemindex) throws Exception{
try {
		Debug.PushSubsStack("TryRestoreExistingCachedMedia (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,1063);
if (RapidSub.canDelegate("tryrestoreexistingcachedmedia")) { return __ref.runUserSub(false, "mediacache","tryrestoreexistingcachedmedia", __ref, _itemtype, _itemid, _item, _itemindex);}
Debug.locals.put("itemType", _itemtype);
Debug.locals.put("itemId", _itemid);
Debug.locals.put("item", _item);
Debug.locals.put("itemIndex", _itemindex);
 BA.debugLineNum = 1063;BA.debugLine="Private Sub TryRestoreExistingCachedMedia(itemType";
Debug.ShouldStop(64);
 BA.debugLineNum = 1064;BA.debugLine="If itemId = \"\" Then Return False";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 1065;BA.debugLine="If IsCachedFileUsable(GetDirByItemType(itemType),";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_getdirbyitemtype" /*RemoteObject*/ ,(Object)(_itemtype))),(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_resolveindexedfilename" /*RemoteObject*/ ,(Object)(_itemtype),(Object)(_itemid),(Object)(_itemindex)))),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 1066;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 1067;BA.debugLine="UpdateAdIndex(item, itemIndex)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.mediacache.class, "_updateadindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_itemindex));
 BA.debugLineNum = 1068;BA.debugLine="SaveAdIndex";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveadindex" /*RemoteObject*/ );
 BA.debugLineNum = 1069;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) return mediacache.__c.getField(true,"True");
 };
 BA.debugLineNum = 1071;BA.debugLine="If itemType = \"track\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
 BA.debugLineNum = 1072;BA.debugLine="UpdateTrackIndex(item, itemIndex)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_itemindex));
 BA.debugLineNum = 1073;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 1074;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) return mediacache.__c.getField(true,"True");
 };
 BA.debugLineNum = 1076;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 1077;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tryrestoretrackbyexpectedpath(RemoteObject __ref,RemoteObject _trackid,RemoteObject _playlistid,RemoteObject _item,RemoteObject _trackindex) throws Exception{
try {
		Debug.PushSubsStack("TryRestoreTrackByExpectedPath (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,561);
if (RapidSub.canDelegate("tryrestoretrackbyexpectedpath")) { return __ref.runUserSub(false, "mediacache","tryrestoretrackbyexpectedpath", __ref, _trackid, _playlistid, _item, _trackindex);}
RemoteObject _relativefilename = RemoteObject.createImmutable("");
Debug.locals.put("trackId", _trackid);
Debug.locals.put("playlistId", _playlistid);
Debug.locals.put("item", _item);
Debug.locals.put("trackIndex", _trackindex);
 BA.debugLineNum = 561;BA.debugLine="Private Sub TryRestoreTrackByExpectedPath(trackId";
Debug.ShouldStop(65536);
 BA.debugLineNum = 562;BA.debugLine="If trackId = \"\" Then Return False";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 563;BA.debugLine="Dim relativeFileName As String = BuildTrackCacheR";
Debug.ShouldStop(262144);
_relativefilename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcacherelativefilename" /*RemoteObject*/ ,(Object)(_trackid),(Object)(_playlistid));Debug.locals.put("relativeFileName", _relativefilename);Debug.locals.put("relativeFileName", _relativefilename);
 BA.debugLineNum = 564;BA.debugLine="If IsCachedFileUsable(GetTracksDir, relativeFileN";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_relativefilename)),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 565;BA.debugLine="EnsureTrackIndexEntry(trackId, playlistId, relati";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.mediacache.class, "_ensuretrackindexentry" /*RemoteObject*/ ,(Object)(_trackid),(Object)(_playlistid),(Object)(_relativefilename));
 BA.debugLineNum = 566;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.mediacache.class, "_updatetrackindex" /*RemoteObject*/ ,(Object)(_item),(Object)(_trackindex));
 BA.debugLineNum = 567;BA.debugLine="SaveTrackIndex";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.mediacache.class, "_savetrackindex" /*RemoteObject*/ );
 BA.debugLineNum = 568;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return mediacache.__c.getField(true,"True");
 BA.debugLineNum = 569;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("UpdateAdIndex (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,571);
if (RapidSub.canDelegate("updateadindex")) { return __ref.runUserSub(false, "mediacache","updateadindex", __ref, _ad, _adindex);}
RemoteObject _adid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ad", _ad);
Debug.locals.put("adIndex", _adindex);
 BA.debugLineNum = 571;BA.debugLine="Private Sub UpdateAdIndex(ad As Map, adIndex As Ma";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 572;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
Debug.ShouldStop(134217728);
_adid = BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("adId", _adid);Debug.locals.put("adId", _adid);
 BA.debugLineNum = 573;BA.debugLine="If adId = \"\" Then Return";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_adid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 574;BA.debugLine="Dim entry As Map = adIndex.GetDefault(adId, Null)";
Debug.ShouldStop(536870912);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _adindex.runMethod(false,"GetDefault",(Object)((_adid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 575;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Initialize");};
 BA.debugLineNum = 576;BA.debugLine="entry.Put(\"id\", adId)";
Debug.ShouldStop(-2147483648);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_adid)));
 BA.debugLineNum = 577;BA.debugLine="entry.Put(\"title\", ad.GetDefault(\"title\", \"\"))";
Debug.ShouldStop(1);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 578;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("saved_at")))),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));};
 BA.debugLineNum = 579;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(4);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 580;BA.debugLine="entry.Put(\"duration\", ad.GetDefault(\"duration\", 0";
Debug.ShouldStop(8);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 581;BA.debugLine="entry.Put(\"gain\", ad.GetDefault(\"gain\", 0))";
Debug.ShouldStop(16);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 582;BA.debugLine="adIndex.Put(adId, entry)";
Debug.ShouldStop(32);
_adindex.runVoidMethod ("Put",(Object)((_adid)),(Object)((_entry.getObject())));
 BA.debugLineNum = 583;BA.debugLine="cachedAdIndexDirty = True";
Debug.ShouldStop(64);
__ref.setField ("_cachedadindexdirty" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 BA.debugLineNum = 584;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("UpdateTrackIndex (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,603);
if (RapidSub.canDelegate("updatetrackindex")) { return __ref.runUserSub(false, "mediacache","updatetrackindex", __ref, _item, _trackindex);}
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
Debug.locals.put("trackIndex", _trackindex);
 BA.debugLineNum = 603;BA.debugLine="Private Sub UpdateTrackIndex(item As Map, trackInd";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 604;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(134217728);
_trackid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 605;BA.debugLine="If trackId = \"\" Then Return";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 606;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
Debug.ShouldStop(536870912);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackindex.runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(mediacache.__c.getField(false,"Null"))));Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 607;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"IsInitialized"),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Initialize");};
 BA.debugLineNum = 608;BA.debugLine="Dim playlistId As String = ResolveTrackPlaylistId";
Debug.ShouldStop(-2147483648);
_playlistid = __ref.runClassMethod (b4j.example.mediacache.class, "_resolvetrackplaylistid" /*RemoteObject*/ ,(Object)(_item),(Object)(_trackindex),(Object)(_trackid));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 609;BA.debugLine="Dim fileName As String = BuildTrackCacheRelativeF";
Debug.ShouldStop(1);
_filename = __ref.runClassMethod (b4j.example.mediacache.class, "_buildtrackcacherelativefilename" /*RemoteObject*/ ,(Object)(_trackid),(Object)(_playlistid));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 610;BA.debugLine="entry.Put(\"id\", trackId)";
Debug.ShouldStop(2);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_trackid)));
 BA.debugLineNum = 611;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
Debug.ShouldStop(4);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((_playlistid)));
 BA.debugLineNum = 612;BA.debugLine="entry.Put(\"file_name\", fileName)";
Debug.ShouldStop(8);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("file_name"))),(Object)((_filename)));
 BA.debugLineNum = 613;BA.debugLine="entry.Put(\"title\", item.GetDefault(\"title\", \"\"))";
Debug.ShouldStop(16);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 614;BA.debugLine="entry.Put(\"set\", item.GetDefault(\"set\", \"\"))";
Debug.ShouldStop(32);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("set"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("set"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 615;BA.debugLine="entry.Put(\"stream\", item.GetDefault(\"stream\", \"\")";
Debug.ShouldStop(64);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 616;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("saved_at")))),mediacache.__c.getField(true,"False"))) { 
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));};
 BA.debugLineNum = 617;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
Debug.ShouldStop(256);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("last_used_at"))),(Object)((mediacache.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 618;BA.debugLine="entry.Put(\"gain\", item.GetDefault(\"gain\", 0))";
Debug.ShouldStop(512);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 619;BA.debugLine="If IsCachedFileUsable(GetTracksDir, fileName) The";
Debug.ShouldStop(1024);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_filename)).<Boolean>get().booleanValue()) { 
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("size_bytes"))),(Object)((__ref.runClassMethod (b4j.example.mediacache.class, "_getfilesizesafe" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.mediacache.class, "_gettracksdir" /*RemoteObject*/ )),(Object)(_filename)))));};
 BA.debugLineNum = 620;BA.debugLine="trackIndex.Put(trackId, entry)";
Debug.ShouldStop(2048);
_trackindex.runVoidMethod ("Put",(Object)((_trackid)),(Object)((_entry.getObject())));
 BA.debugLineNum = 621;BA.debugLine="cachedTrackIndexDirty = True";
Debug.ShouldStop(4096);
__ref.setField ("_cachedtrackindexdirty" /*RemoteObject*/ ,mediacache.__c.getField(true,"True"));
 BA.debugLineNum = 622;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("ValidateIndexedFile (mediacache) ","mediacache",8,__ref.getField(false, "ba"),__ref,996);
if (RapidSub.canDelegate("validateindexedfile")) { return __ref.runUserSub(false, "mediacache","validateindexedfile", __ref, _itemtype, _itemid);}
RemoteObject _auditindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _auditdir = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("itemType", _itemtype);
Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 996;BA.debugLine="Private Sub ValidateIndexedFile(itemType As String";
Debug.ShouldStop(8);
 BA.debugLineNum = 997;BA.debugLine="If itemId = \"\" Then Return False";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 998;BA.debugLine="Dim auditIndex As Map = GetIndexByItemType(itemTy";
Debug.ShouldStop(32);
_auditindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_auditindex = __ref.runClassMethod (b4j.example.mediacache.class, "_getindexbyitemtype" /*RemoteObject*/ ,(Object)(_itemtype));Debug.locals.put("auditIndex", _auditindex);Debug.locals.put("auditIndex", _auditindex);
 BA.debugLineNum = 999;BA.debugLine="Dim auditDir As String = GetDirByItemType(itemTyp";
Debug.ShouldStop(64);
_auditdir = __ref.runClassMethod (b4j.example.mediacache.class, "_getdirbyitemtype" /*RemoteObject*/ ,(Object)(_itemtype));Debug.locals.put("auditDir", _auditdir);Debug.locals.put("auditDir", _auditdir);
 BA.debugLineNum = 1000;BA.debugLine="Dim fileName As String = ResolveIndexedFileName(i";
Debug.ShouldStop(128);
_filename = __ref.runClassMethod (b4j.example.mediacache.class, "_resolveindexedfilename" /*RemoteObject*/ ,(Object)(_itemtype),(Object)(_itemid),(Object)(_auditindex));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 1001;BA.debugLine="If itemType = \"track\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
 BA.debugLineNum = 1002;BA.debugLine="If TryHealTrackIndexEntry(itemId, auditIndex, au";
Debug.ShouldStop(512);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_tryhealtrackindexentry" /*RemoteObject*/ ,(Object)(_itemid),(Object)(_auditindex),(Object)(_auditdir),(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1003;BA.debugLine="fileName = ResolveIndexedFileName(itemType, ite";
Debug.ShouldStop(1024);
_filename = __ref.runClassMethod (b4j.example.mediacache.class, "_resolveindexedfilename" /*RemoteObject*/ ,(Object)(_itemtype),(Object)(_itemid),(Object)(_auditindex));Debug.locals.put("fileName", _filename);
 };
 };
 BA.debugLineNum = 1006;BA.debugLine="If auditIndex.ContainsKey(itemId) = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_auditindex.runMethod(true,"ContainsKey",(Object)((_itemid))),mediacache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1007;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename)),mediacache.__c.getField(true,"False"))) { 
if (true) return mediacache.__c.getField(true,"False");};
 BA.debugLineNum = 1008;BA.debugLine="RestoreIndexedFileById(itemId, auditIndex)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.mediacache.class, "_restoreindexedfilebyid" /*RemoteObject*/ ,(Object)(_itemid),(Object)(_auditindex));
 BA.debugLineNum = 1009;BA.debugLine="SaveIndexByItemType(itemType)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveindexbyitemtype" /*RemoteObject*/ ,(Object)(_itemtype));
 BA.debugLineNum = 1010;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) return mediacache.__c.getField(true,"True");
 };
 BA.debugLineNum = 1012;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then Re";
Debug.ShouldStop(524288);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename)).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 BA.debugLineNum = 1013;BA.debugLine="If itemType = \"track\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track"))) { 
 BA.debugLineNum = 1014;BA.debugLine="If TryHealTrackIndexEntry(itemId, auditIndex, au";
Debug.ShouldStop(2097152);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_tryhealtrackindexentry" /*RemoteObject*/ ,(Object)(_itemid),(Object)(_auditindex),(Object)(_auditdir),(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1015;BA.debugLine="fileName = ResolveIndexedFileName(itemType, ite";
Debug.ShouldStop(4194304);
_filename = __ref.runClassMethod (b4j.example.mediacache.class, "_resolveindexedfilename" /*RemoteObject*/ ,(Object)(_itemtype),(Object)(_itemid),(Object)(_auditindex));Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 1016;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then";
Debug.ShouldStop(8388608);
if (__ref.runClassMethod (b4j.example.mediacache.class, "_iscachedfileusable" /*RemoteObject*/ ,(Object)(_auditdir),(Object)(_filename)).<Boolean>get().booleanValue()) { 
if (true) return mediacache.__c.getField(true,"True");};
 };
 };
 BA.debugLineNum = 1019;BA.debugLine="auditIndex.Remove(itemId)";
Debug.ShouldStop(67108864);
_auditindex.runVoidMethod ("Remove",(Object)((_itemid)));
 BA.debugLineNum = 1020;BA.debugLine="SaveIndexByItemType(itemType)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.mediacache.class, "_saveindexbyitemtype" /*RemoteObject*/ ,(Object)(_itemtype));
 BA.debugLineNum = 1021;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) return mediacache.__c.getField(true,"False");
 BA.debugLineNum = 1022;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}