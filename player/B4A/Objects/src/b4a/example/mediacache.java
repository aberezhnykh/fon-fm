package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mediacache extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.mediacache");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.mediacache.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _storagedir = "";
public b4a.example.keyvaluestore _storage = null;
public Object _targetmodule = null;
public String _tracesubname = "";
public String _mediadirname = "";
public String _adsdirname = "";
public String _tracksdirname = "";
public int _cache_audit_batch_size = 0;
public int _ad_download_timeout_ms = 0;
public int _track_download_timeout_ms = 0;
public long _track_cache_hard_limit_mb = 0L;
public long _track_cache_target_mb = 0L;
public long _min_free_disk_mb = 0L;
public int _min_free_disk_percent = 0;
public String _android_plain_track_cache_format_key = "";
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
public boolean _cacheauditlistinginprogress = false;
public String _cacheauditlistingdir = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _accumulatetrackplayliststat(String _playlistid,long _trackbytes) throws Exception{
String _statskey = "";
anywheresoftware.b4a.objects.collections.Map _playlistentry = null;
 //BA.debugLineNum = 1909;BA.debugLine="Private Sub AccumulateTrackPlaylistStat(playlistId";
 //BA.debugLineNum = 1910;BA.debugLine="Dim statsKey As String = playlistId";
_statskey = _playlistid;
 //BA.debugLineNum = 1911;BA.debugLine="If statsKey = \"\" Then statsKey = \"_unknown\"";
if ((_statskey).equals("")) { 
_statskey = "_unknown";};
 //BA.debugLineNum = 1912;BA.debugLine="Dim playlistEntry As Map = cachedTrackPlaylistSta";
_playlistentry = new anywheresoftware.b4a.objects.collections.Map();
_playlistentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedtrackplayliststats.GetDefault((Object)(_statskey),__c.Null)));
 //BA.debugLineNum = 1913;BA.debugLine="If playlistEntry.IsInitialized = False Then";
if (_playlistentry.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1914;BA.debugLine="playlistEntry.Initialize";
_playlistentry.Initialize();
 //BA.debugLineNum = 1915;BA.debugLine="playlistEntry.Put(\"count\", 0)";
_playlistentry.Put((Object)("count"),(Object)(0));
 //BA.debugLineNum = 1916;BA.debugLine="playlistEntry.Put(\"bytes\", 0)";
_playlistentry.Put((Object)("bytes"),(Object)(0));
 };
 //BA.debugLineNum = 1918;BA.debugLine="playlistEntry.Put(\"count\", playlistEntry.GetDefau";
_playlistentry.Put((Object)("count"),(Object)((double)(BA.ObjectToNumber(_playlistentry.GetDefault((Object)("count"),(Object)(0))))+1));
 //BA.debugLineNum = 1919;BA.debugLine="playlistEntry.Put(\"bytes\", ToLongDefault(playlist";
_playlistentry.Put((Object)("bytes"),(Object)(_tolongdefault(_playlistentry.GetDefault((Object)("bytes"),(Object)(0)),(long) (0))+_trackbytes));
 //BA.debugLineNum = 1920;BA.debugLine="cachedTrackPlaylistStats.Put(statsKey, playlistEn";
_cachedtrackplayliststats.Put((Object)(_statskey),(Object)(_playlistentry.getObject()));
 //BA.debugLineNum = 1921;BA.debugLine="End Sub";
return "";
}
public String  _addindexedfilefromaudit(String _itemtype,String _filename,anywheresoftware.b4a.objects.collections.Map _auditindex) throws Exception{
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _existingentry = null;
String _playlistid = "";
 //BA.debugLineNum = 1389;BA.debugLine="Private Sub AddIndexedFileFromAudit(itemType As St";
 //BA.debugLineNum = 1390;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1391;BA.debugLine="entry.Initialize";
_entry.Initialize();
 //BA.debugLineNum = 1392;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 1393;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 1394;BA.debugLine="If itemType = \"ads\" Then";
if ((_itemtype).equals("ads")) { 
 //BA.debugLineNum = 1395;BA.debugLine="entry.Put(\"id\", fileName)";
_entry.Put((Object)("id"),(Object)(_filename));
 //BA.debugLineNum = 1396;BA.debugLine="entry.Put(\"title\", \"\")";
_entry.Put((Object)("title"),(Object)(""));
 //BA.debugLineNum = 1397;BA.debugLine="entry.Put(\"duration\", 0)";
_entry.Put((Object)("duration"),(Object)(0));
 //BA.debugLineNum = 1398;BA.debugLine="entry.Put(\"gain\", 0)";
_entry.Put((Object)("gain"),(Object)(0));
 //BA.debugLineNum = 1399;BA.debugLine="auditIndex.Put(fileName, entry)";
_auditindex.Put((Object)(_filename),(Object)(_entry.getObject()));
 }else {
 //BA.debugLineNum = 1401;BA.debugLine="Dim trackId As String = FindTrackIdByFileName(fi";
_trackid = _findtrackidbyfilename(_filename,_auditindex);
 //BA.debugLineNum = 1402;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 1403;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
 //BA.debugLineNum = 1404;BA.debugLine="entry.Put(\"title\", \"\")";
_entry.Put((Object)("title"),(Object)(""));
 //BA.debugLineNum = 1405;BA.debugLine="entry.Put(\"set\", \"\")";
_entry.Put((Object)("set"),(Object)(""));
 //BA.debugLineNum = 1406;BA.debugLine="entry.Put(\"stream\", \"\")";
_entry.Put((Object)("stream"),(Object)(""));
 //BA.debugLineNum = 1407;BA.debugLine="entry.Put(\"gain\", 0)";
_entry.Put((Object)("gain"),(Object)(0));
 //BA.debugLineNum = 1408;BA.debugLine="Dim existingEntry As Map = auditIndex.GetDefault";
_existingentry = new anywheresoftware.b4a.objects.collections.Map();
_existingentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_auditindex.GetDefault((Object)(_trackid),__c.Null)));
 //BA.debugLineNum = 1409;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFrom";
_playlistid = _extractplaylistidfromtrackrelativepath(_filename);
 //BA.debugLineNum = 1410;BA.debugLine="If playlistId = \"\" And existingEntry.IsInitializ";
if ((_playlistid).equals("") && _existingentry.IsInitialized()) { 
_playlistid = BA.ObjectToString(_existingentry.GetDefault((Object)("playlist_id"),(Object)("")));};
 //BA.debugLineNum = 1411;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));
 //BA.debugLineNum = 1412;BA.debugLine="entry.Put(\"file_name\", fileName)";
_entry.Put((Object)("file_name"),(Object)(_filename));
 //BA.debugLineNum = 1413;BA.debugLine="entry.Put(\"size_bytes\", GetFileSizeSafe(GetTrack";
_entry.Put((Object)("size_bytes"),(Object)(_getfilesizesafe(_gettracksdir(),_filename)));
 //BA.debugLineNum = 1414;BA.debugLine="auditIndex.Put(trackId, entry)";
_auditindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
 };
 //BA.debugLineNum = 1416;BA.debugLine="MarkAuditIndexChanged(itemType)";
_markauditindexchanged(_itemtype);
 //BA.debugLineNum = 1417;BA.debugLine="End Sub";
return "";
}
public String  _backfilltrackindexfromfiles() throws Exception{
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
 //BA.debugLineNum = 1505;BA.debugLine="Private Sub BackfillTrackIndexFromFiles";
 //BA.debugLineNum = 1506;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
if (_cachedtrackindex.IsInitialized()==__c.False) { 
_cachedtrackindex.Initialize();};
 //BA.debugLineNum = 1507;BA.debugLine="Dim changed As Boolean = False";
_changed = __c.False;
 //BA.debugLineNum = 1508;BA.debugLine="Dim playlistTrackMaps As Map";
_playlisttrackmaps = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1509;BA.debugLine="playlistTrackMaps.Initialize";
_playlisttrackmaps.Initialize();
 //BA.debugLineNum = 1510;BA.debugLine="Try";
try { //BA.debugLineNum = 1511;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Re";
if (_directoryexists(_gettracksdir())==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1512;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRec";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = _listtrackcachefilesrecursive();
 //BA.debugLineNum = 1513;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1514;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group9 = _listedfiles;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_filename = BA.ObjectToString(group9.Get(index9));
 //BA.debugLineNum = 1515;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 1516;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
if (_filename.endsWith(".tmp")) { 
if (true) continue;};
 //BA.debugLineNum = 1517;BA.debugLine="Dim trackId As String = FindTrackIdByFileNameWi";
_trackid = _findtrackidbyfilenamewithmetadata(_filename,_cachedtrackindex,_playlisttrackmaps);
 //BA.debugLineNum = 1518;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 1519;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedtrackindex.GetDefault((Object)(_trackid),__c.Null)));
 //BA.debugLineNum = 1520;BA.debugLine="If entry.IsInitialized = False Then entry.Initi";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
 //BA.debugLineNum = 1521;BA.debugLine="Dim storedFileName As String = \"\" & entry.GetDe";
_storedfilename = ""+BA.ObjectToString(_entry.GetDefault((Object)("file_name"),(Object)("")));
 //BA.debugLineNum = 1522;BA.debugLine="If storedFileName <> fileName Then";
if ((_storedfilename).equals(_filename) == false) { 
 //BA.debugLineNum = 1523;BA.debugLine="entry.Put(\"file_name\", fileName)";
_entry.Put((Object)("file_name"),(Object)(_filename));
 //BA.debugLineNum = 1524;BA.debugLine="changed = True";
_changed = __c.True;
 };
 //BA.debugLineNum = 1526;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFro";
_playlistid = _extractplaylistidfromtrackrelativepath(_filename);
 //BA.debugLineNum = 1527;BA.debugLine="If playlistId = \"\" Then playlistId = ResolvePla";
if ((_playlistid).equals("")) { 
_playlistid = _resolveplaylistidfortrackid(_trackid,BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)(""))),_playlisttrackmaps);};
 //BA.debugLineNum = 1528;BA.debugLine="If playlistId <> \"\" And entry.GetDefault(\"playl";
if ((_playlistid).equals("") == false && (_entry.GetDefault((Object)("playlist_id"),(Object)(""))).equals((Object)(_playlistid)) == false) { 
 //BA.debugLineNum = 1529;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));
 //BA.debugLineNum = 1530;BA.debugLine="changed = True";
_changed = __c.True;
 };
 //BA.debugLineNum = 1532;BA.debugLine="If entry.ContainsKey(\"id\") = False Then";
if (_entry.ContainsKey((Object)("id"))==__c.False) { 
 //BA.debugLineNum = 1533;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
 //BA.debugLineNum = 1534;BA.debugLine="changed = True";
_changed = __c.True;
 };
 //BA.debugLineNum = 1536;BA.debugLine="Dim fileSize As Long = GetFileSizeSafe(GetTrack";
_filesize = _getfilesizesafe(_gettracksdir(),_filename);
 //BA.debugLineNum = 1537;BA.debugLine="Dim storedSize As Long = ToLongDefault(entry.Ge";
_storedsize = _tolongdefault(_entry.GetDefault((Object)("size_bytes"),(Object)(-1)),(long) (-1));
 //BA.debugLineNum = 1538;BA.debugLine="If storedSize <> fileSize Then";
if (_storedsize!=_filesize) { 
 //BA.debugLineNum = 1539;BA.debugLine="entry.Put(\"size_bytes\", fileSize)";
_entry.Put((Object)("size_bytes"),(Object)(_filesize));
 //BA.debugLineNum = 1540;BA.debugLine="changed = True";
_changed = __c.True;
 };
 //BA.debugLineNum = 1542;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
 //BA.debugLineNum = 1543;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 1544;BA.debugLine="changed = True";
_changed = __c.True;
 };
 //BA.debugLineNum = 1546;BA.debugLine="If entry.ContainsKey(\"last_used_at\") = False Th";
if (_entry.ContainsKey((Object)("last_used_at"))==__c.False) { 
 //BA.debugLineNum = 1547;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 1548;BA.debugLine="changed = True";
_changed = __c.True;
 };
 //BA.debugLineNum = 1550;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
_cachedtrackindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
 }
};
 } 
       catch (Exception e48) {
			ba.setLastException(e48); //BA.debugLineNum = 1553;BA.debugLine="Trace(\"Не удалось выполнить стартовую переиндекс";
_trace("Не удалось выполнить стартовую переиндексацию кэша треков. message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 1555;BA.debugLine="If changed Then SaveTrackIndex";
if (_changed) { 
_savetrackindex();};
 //BA.debugLineNum = 1556;BA.debugLine="End Sub";
return "";
}
public String  _buildadurl(String _adid) throws Exception{
String _first = "";
 //BA.debugLineNum = 764;BA.debugLine="Private Sub BuildAdUrl(adId As String) As String";
 //BA.debugLineNum = 765;BA.debugLine="If adId = \"\" Then Return \"\"";
if ((_adid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 766;BA.debugLine="Dim first As String = adId.SubString2(0, 1)";
_first = _adid.substring((int) (0),(int) (1));
 //BA.debugLineNum = 767;BA.debugLine="Return \"https://cdn.fon.fm/media/ads/\" & first &";
if (true) return "https://cdn.fon.fm/media/ads/"+_first+"/"+_adid+".mp3";
 //BA.debugLineNum = 768;BA.debugLine="End Sub";
return "";
}
public String  _buildfileuri(String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 1840;BA.debugLine="Private Sub BuildFileUri(dir As String, fileName A";
 //BA.debugLineNum = 1844;BA.debugLine="Return File.Combine(dir, fileName)";
if (true) return __c.File.Combine(_dir,_filename);
 //BA.debugLineNum = 1848;BA.debugLine="End Sub";
return "";
}
public String  _buildtempcachefilename(String _itemid) throws Exception{
 //BA.debugLineNum = 813;BA.debugLine="Private Sub BuildTempCacheFileName(itemId As Strin";
 //BA.debugLineNum = 814;BA.debugLine="Return itemId & \".tmp\"";
if (true) return _itemid+".tmp";
 //BA.debugLineNum = 815;BA.debugLine="End Sub";
return "";
}
public String  _buildtrackcachefilename(String _trackid) throws Exception{
byte[] _sourcebytes = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _uuid = null;
String _filename = "";
 //BA.debugLineNum = 776;BA.debugLine="Private Sub BuildTrackCacheFileName(trackId As Str";
 //BA.debugLineNum = 777;BA.debugLine="Dim sourceBytes() As Byte = GetBytesFromString(Bu";
_sourcebytes = _getbytesfromstring(_buildtrackobfuscationseed("cache",_trackid));
 //BA.debugLineNum = 778;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 779;BA.debugLine="jo.InitializeStatic(\"java.util.UUID\")";
_jo.InitializeStatic("java.util.UUID");
 //BA.debugLineNum = 780;BA.debugLine="Dim uuid As JavaObject = jo.RunMethod(\"nameUUIDFr";
_uuid = new anywheresoftware.b4j.object.JavaObject();
_uuid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("nameUUIDFromBytes",new Object[]{(Object)(_sourcebytes)})));
 //BA.debugLineNum = 781;BA.debugLine="Dim fileName As String = uuid.RunMethod(\"toString";
_filename = BA.ObjectToString(_uuid.RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 782;BA.debugLine="Return fileName.Replace(\"-\", \"\")";
if (true) return _filename.replace("-","");
 //BA.debugLineNum = 783;BA.debugLine="End Sub";
return "";
}
public String  _buildtrackcacherelativefilename(String _trackid,String _playlistid) throws Exception{
String _unusedplaylistid = "";
 //BA.debugLineNum = 785;BA.debugLine="Private Sub BuildTrackCacheRelativeFileName(trackI";
 //BA.debugLineNum = 786;BA.debugLine="Dim unusedPlaylistId As String = playlistId";
_unusedplaylistid = _playlistid;
 //BA.debugLineNum = 787;BA.debugLine="If unusedPlaylistId = \"\" Then";
if ((_unusedplaylistid).equals("")) { 
 };
 //BA.debugLineNum = 789;BA.debugLine="Return BuildTrackCacheFileName(trackId)";
if (true) return _buildtrackcachefilename(_trackid);
 //BA.debugLineNum = 790;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _buildtrackcachesummary(anywheresoftware.b4a.objects.collections.Map _protectedids,anywheresoftware.b4a.objects.collections.Map _relevantids) throws Exception{
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.List _candidates = null;
anywheresoftware.b4a.objects.collections.List _keystoremove = null;
long _cachebytes = 0L;
String _trackid = "";
String _filename = "";
long _filebytes = 0L;
anywheresoftware.b4a.objects.collections.Map _entry = null;
anywheresoftware.b4a.objects.collections.Map _candidate = null;
 //BA.debugLineNum = 1650;BA.debugLine="Private Sub BuildTrackCacheSummary(protectedIds As";
 //BA.debugLineNum = 1651;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1652;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 1653;BA.debugLine="Dim candidates As List";
_candidates = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1654;BA.debugLine="candidates.Initialize";
_candidates.Initialize();
 //BA.debugLineNum = 1655;BA.debugLine="Dim keysToRemove As List";
_keystoremove = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1656;BA.debugLine="keysToRemove.Initialize";
_keystoremove.Initialize();
 //BA.debugLineNum = 1657;BA.debugLine="Dim cacheBytes As Long = 0";
_cachebytes = (long) (0);
 //BA.debugLineNum = 1658;BA.debugLine="For Each trackId As String In cachedTrackIndex.Ke";
{
final anywheresoftware.b4a.BA.IterableList group8 = _cachedtrackindex.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_trackid = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 1659;BA.debugLine="Dim fileName As String = ResolveTrackCacheFileNa";
_filename = _resolvetrackcachefilename(_trackid,_cachedtrackindex);
 //BA.debugLineNum = 1660;BA.debugLine="If IsCachedFileUsable(GetTracksDir, fileName) =";
if (_iscachedfileusable(_gettracksdir(),_filename)==__c.False) { 
 //BA.debugLineNum = 1661;BA.debugLine="keysToRemove.Add(trackId)";
_keystoremove.Add((Object)(_trackid));
 //BA.debugLineNum = 1662;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 1664;BA.debugLine="Dim fileBytes As Long = GetFileSizeSafe(GetTrack";
_filebytes = _getfilesizesafe(_gettracksdir(),_filename);
 //BA.debugLineNum = 1665;BA.debugLine="cacheBytes = cacheBytes + fileBytes";
_cachebytes = (long) (_cachebytes+_filebytes);
 //BA.debugLineNum = 1666;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(t";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedtrackindex.GetDefault((Object)(_trackid),__c.Null)));
 //BA.debugLineNum = 1667;BA.debugLine="If entry.IsInitialized = False Then entry.Initia";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
 //BA.debugLineNum = 1668;BA.debugLine="entry.Put(\"file_name\", fileName)";
_entry.Put((Object)("file_name"),(Object)(_filename));
 //BA.debugLineNum = 1669;BA.debugLine="entry.Put(\"size_bytes\", fileBytes)";
_entry.Put((Object)("size_bytes"),(Object)(_filebytes));
 //BA.debugLineNum = 1670;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
_cachedtrackindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
 //BA.debugLineNum = 1671;BA.debugLine="If protectedIds.ContainsKey(trackId) Then Contin";
if (_protectedids.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
 //BA.debugLineNum = 1672;BA.debugLine="Dim candidate As Map";
_candidate = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1673;BA.debugLine="candidate.Initialize";
_candidate.Initialize();
 //BA.debugLineNum = 1674;BA.debugLine="candidate.Put(\"id\", trackId)";
_candidate.Put((Object)("id"),(Object)(_trackid));
 //BA.debugLineNum = 1675;BA.debugLine="candidate.Put(\"file_name\", fileName)";
_candidate.Put((Object)("file_name"),(Object)(_filename));
 //BA.debugLineNum = 1676;BA.debugLine="candidate.Put(\"size_bytes\", fileBytes)";
_candidate.Put((Object)("size_bytes"),(Object)(_filebytes));
 //BA.debugLineNum = 1677;BA.debugLine="candidate.Put(\"last_used_at\", entry.GetDefault(\"";
_candidate.Put((Object)("last_used_at"),_entry.GetDefault((Object)("last_used_at"),(Object)(0)));
 //BA.debugLineNum = 1678;BA.debugLine="candidate.Put(\"saved_at\", entry.GetDefault(\"save";
_candidate.Put((Object)("saved_at"),_entry.GetDefault((Object)("saved_at"),(Object)(0)));
 //BA.debugLineNum = 1679;BA.debugLine="candidate.Put(\"is_relevant\", relevantIds.Contain";
_candidate.Put((Object)("is_relevant"),(Object)(_relevantids.ContainsKey((Object)(_trackid))));
 //BA.debugLineNum = 1680;BA.debugLine="candidates.Add(candidate)";
_candidates.Add((Object)(_candidate.getObject()));
 }
};
 //BA.debugLineNum = 1682;BA.debugLine="For Each trackId As String In keysToRemove";
{
final anywheresoftware.b4a.BA.IterableList group32 = _keystoremove;
final int groupLen32 = group32.getSize()
;int index32 = 0;
;
for (; index32 < groupLen32;index32++){
_trackid = BA.ObjectToString(group32.Get(index32));
 //BA.debugLineNum = 1683;BA.debugLine="cachedTrackIndex.Remove(trackId)";
_cachedtrackindex.Remove((Object)(_trackid));
 }
};
 //BA.debugLineNum = 1685;BA.debugLine="If keysToRemove.Size > 0 Then SaveTrackIndex";
if (_keystoremove.getSize()>0) { 
_savetrackindex();};
 //BA.debugLineNum = 1686;BA.debugLine="result.Put(\"cache_bytes\", cacheBytes)";
_result.Put((Object)("cache_bytes"),(Object)(_cachebytes));
 //BA.debugLineNum = 1687;BA.debugLine="result.Put(\"candidates\", candidates)";
_result.Put((Object)("candidates"),(Object)(_candidates.getObject()));
 //BA.debugLineNum = 1688;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 1689;BA.debugLine="End Sub";
return null;
}
public String  _buildtrackobfuscationseed(String _purpose,String _trackid) throws Exception{
 //BA.debugLineNum = 1046;BA.debugLine="Private Sub BuildTrackObfuscationSeed(purpose As S";
 //BA.debugLineNum = 1047;BA.debugLine="Return \"fonfm|\" & purpose & \"|\" & trackId";
if (true) return "fonfm|"+_purpose+"|"+_trackid;
 //BA.debugLineNum = 1048;BA.debugLine="End Sub";
return "";
}
public String  _buildtrackurl(String _trackid) throws Exception{
String _first = "";
 //BA.debugLineNum = 770;BA.debugLine="Private Sub BuildTrackUrl(trackId As String) As St";
 //BA.debugLineNum = 771;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 772;BA.debugLine="Dim first As String = trackId.SubString2(0, 1)";
_first = _trackid.substring((int) (0),(int) (1));
 //BA.debugLineNum = 773;BA.debugLine="Return \"https://cdn.fon.fm/media/tracks/\" & first";
if (true) return "https://cdn.fon.fm/media/tracks/"+_first+"/"+_trackid+".mp3";
 //BA.debugLineNum = 774;BA.debugLine="End Sub";
return "";
}
public long  _bytestomb(long _valuebytes) throws Exception{
 //BA.debugLineNum = 1953;BA.debugLine="Private Sub BytesToMb(valueBytes As Long) As Long";
 //BA.debugLineNum = 1954;BA.debugLine="Return Floor(valueBytes / 1024 / 1024)";
if (true) return (long) (__c.Floor(_valuebytes/(double)1024/(double)1024));
 //BA.debugLineNum = 1955;BA.debugLine="End Sub";
return 0L;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private storageDir As String";
_storagedir = "";
 //BA.debugLineNum = 7;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4a.example.keyvaluestore();
 //BA.debugLineNum = 8;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
 //BA.debugLineNum = 10;BA.debugLine="Private mediaDirName As String = \"media\"";
_mediadirname = "media";
 //BA.debugLineNum = 11;BA.debugLine="Private adsDirName As String = \"ads\"";
_adsdirname = "ads";
 //BA.debugLineNum = 12;BA.debugLine="Private tracksDirName As String = \"tracks\"";
_tracksdirname = "tracks";
 //BA.debugLineNum = 13;BA.debugLine="Private Const CACHE_AUDIT_BATCH_SIZE As Int = 8";
_cache_audit_batch_size = (int) (8);
 //BA.debugLineNum = 14;BA.debugLine="Private Const AD_DOWNLOAD_TIMEOUT_MS As Int = 150";
_ad_download_timeout_ms = (int) (15000);
 //BA.debugLineNum = 15;BA.debugLine="Private Const TRACK_DOWNLOAD_TIMEOUT_MS As Int =";
_track_download_timeout_ms = (int) (10000);
 //BA.debugLineNum = 19;BA.debugLine="Private Const TRACK_CACHE_HARD_LIMIT_MB As Long =";
_track_cache_hard_limit_mb = (long) (1536);
 //BA.debugLineNum = 20;BA.debugLine="Private Const TRACK_CACHE_TARGET_MB As Long = 768";
_track_cache_target_mb = (long) (768);
 //BA.debugLineNum = 21;BA.debugLine="Private Const MIN_FREE_DISK_MB As Long = 1536";
_min_free_disk_mb = (long) (1536);
 //BA.debugLineNum = 22;BA.debugLine="Private Const MIN_FREE_DISK_PERCENT As Int = 5";
_min_free_disk_percent = (int) (5);
 //BA.debugLineNum = 23;BA.debugLine="Private Const ANDROID_PLAIN_TRACK_CACHE_FORMAT_KE";
_android_plain_track_cache_format_key = "android_plain_track_cache_format_v1";
 //BA.debugLineNum = 28;BA.debugLine="Private cachedAdIndex As Map";
_cachedadindex = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 29;BA.debugLine="Private cachedTrackIndex As Map";
_cachedtrackindex = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 30;BA.debugLine="Private cachedAdIndexDirty As Boolean";
_cachedadindexdirty = false;
 //BA.debugLineNum = 31;BA.debugLine="Private cachedTrackIndexDirty As Boolean";
_cachedtrackindexdirty = false;
 //BA.debugLineNum = 32;BA.debugLine="Private playbackTempTrackIds As Map";
_playbacktemptrackids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 33;BA.debugLine="Private cacheAuditInProgress As Boolean";
_cacheauditinprogress = false;
 //BA.debugLineNum = 34;BA.debugLine="Private cacheAuditPendingTypes As List";
_cacheauditpendingtypes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 35;BA.debugLine="Private cacheAuditCurrentType As String";
_cacheauditcurrenttype = "";
 //BA.debugLineNum = 36;BA.debugLine="Private cacheAuditCurrentFileNames As List";
_cacheauditcurrentfilenames = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 37;BA.debugLine="Private cacheAuditCurrentPosition As Int";
_cacheauditcurrentposition = 0;
 //BA.debugLineNum = 38;BA.debugLine="Private cacheAuditSeenIds As Map";
_cacheauditseenids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 39;BA.debugLine="Private cacheAuditAdIndexChanged As Boolean";
_cacheauditadindexchanged = false;
 //BA.debugLineNum = 40;BA.debugLine="Private cacheAuditTrackIndexChanged As Boolean";
_cacheaudittrackindexchanged = false;
 //BA.debugLineNum = 41;BA.debugLine="Private cacheAuditAddedCount As Int";
_cacheauditaddedcount = 0;
 //BA.debugLineNum = 42;BA.debugLine="Private cacheAuditRemovedCount As Int";
_cacheauditremovedcount = 0;
 //BA.debugLineNum = 43;BA.debugLine="Private cacheAuditTempDeletedCount As Int";
_cacheaudittempdeletedcount = 0;
 //BA.debugLineNum = 44;BA.debugLine="Private recentMediaNetworkFailure As Boolean";
_recentmedianetworkfailure = false;
 //BA.debugLineNum = 45;BA.debugLine="Private pruneLastCacheBytes As Long";
_prunelastcachebytes = 0L;
 //BA.debugLineNum = 46;BA.debugLine="Private pruneLastFreeBytes As Long";
_prunelastfreebytes = 0L;
 //BA.debugLineNum = 47;BA.debugLine="Private cachedTrackCount As Int";
_cachedtrackcount = 0;
 //BA.debugLineNum = 48;BA.debugLine="Private cachedAdCount As Int";
_cachedadcount = 0;
 //BA.debugLineNum = 49;BA.debugLine="Private cachedTrackBytes As Long";
_cachedtrackbytes = 0L;
 //BA.debugLineNum = 50;BA.debugLine="Private cachedAdBytes As Long";
_cachedadbytes = 0L;
 //BA.debugLineNum = 51;BA.debugLine="Private cachedTrackPlaylistStats As Map";
_cachedtrackplayliststats = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 52;BA.debugLine="Private cacheAuditListingInProgress As Boolean";
_cacheauditlistinginprogress = false;
 //BA.debugLineNum = 53;BA.debugLine="Private cacheAuditListingDir As String";
_cacheauditlistingdir = "";
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _cleanupemptytrackplaylistdir(String _relativefilename) throws Exception{
String _playlistid = "";
String _playlistdir = "";
anywheresoftware.b4a.objects.collections.List _listed = null;
 //BA.debugLineNum = 1740;BA.debugLine="Private Sub CleanupEmptyTrackPlaylistDir(relativeF";
 //BA.debugLineNum = 1741;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFromT";
_playlistid = _extractplaylistidfromtrackrelativepath(_relativefilename);
 //BA.debugLineNum = 1742;BA.debugLine="If playlistId = \"\" Then Return";
if ((_playlistid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 1743;BA.debugLine="Try";
try { //BA.debugLineNum = 1744;BA.debugLine="Dim playlistDir As String = File.Combine(GetTrac";
_playlistdir = __c.File.Combine(_gettracksdir(),_playlistid);
 //BA.debugLineNum = 1745;BA.debugLine="If DirectoryExists(playlistDir) = False Then Ret";
if (_directoryexists(_playlistdir)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1746;BA.debugLine="Dim listed As List = File.ListFiles(playlistDir)";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_playlistdir);
 //BA.debugLineNum = 1747;BA.debugLine="If listed.IsInitialized = False Or listed.Size =";
if (_listed.IsInitialized()==__c.False || _listed.getSize()==0) { 
 //BA.debugLineNum = 1748;BA.debugLine="File.Delete(playlistDir, \"\")";
__c.File.Delete(_playlistdir,"");
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 1751;BA.debugLine="Trace(\"Не удалось очистить пустую папку плейлист";
_trace("Не удалось очистить пустую папку плейлиста. playlistId="+_playlistid+", message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 1753;BA.debugLine="End Sub";
return "";
}
public String  _cleanuplegacytracksubdirs() throws Exception{
anywheresoftware.b4a.objects.collections.List _listed = null;
String _name = "";
 //BA.debugLineNum = 1006;BA.debugLine="Private Sub CleanupLegacyTrackSubdirs";
 //BA.debugLineNum = 1007;BA.debugLine="Try";
try { //BA.debugLineNum = 1008;BA.debugLine="Dim listed As List = File.ListFiles(GetTracksDir";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_gettracksdir());
 //BA.debugLineNum = 1009;BA.debugLine="If listed.IsInitialized = False Then Return";
if (_listed.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1010;BA.debugLine="For Each name As String In listed";
{
final anywheresoftware.b4a.BA.IterableList group4 = _listed;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_name = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 1011;BA.debugLine="If name = \"\" Then Continue";
if ((_name).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 1012;BA.debugLine="If File.IsDirectory(GetTracksDir, name) = False";
if (__c.File.IsDirectory(_gettracksdir(),_name)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1013;BA.debugLine="DeleteTrackSubdirRecursive(File.Combine(GetTrac";
_deletetracksubdirrecursive(__c.File.Combine(_gettracksdir(),_name));
 }
};
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 1016;BA.debugLine="Trace(\"Не удалось очистить legacy папки кэша тре";
_trace("Не удалось очистить legacy папки кэша треков. message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 1018;BA.debugLine="End Sub";
return "";
}
public String  _cleanupplaybacktempfiles() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Public Sub CleanupPlaybackTempFiles";
 //BA.debugLineNum = 187;BA.debugLine="playbackTempTrackIds.Clear";
_playbacktemptrackids.Clear();
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public int  _comparetrackprunecandidates(anywheresoftware.b4a.objects.collections.Map _leftitem,anywheresoftware.b4a.objects.collections.Map _rightitem) throws Exception{
boolean _leftrelevant = false;
boolean _rightrelevant = false;
long _leftlastused = 0L;
long _rightlastused = 0L;
long _leftsaved = 0L;
long _rightsaved = 0L;
 //BA.debugLineNum = 1769;BA.debugLine="Private Sub CompareTrackPruneCandidates(leftItem A";
 //BA.debugLineNum = 1770;BA.debugLine="Dim leftRelevant As Boolean = leftItem.GetDefault";
_leftrelevant = BA.ObjectToBoolean(_leftitem.GetDefault((Object)("is_relevant"),(Object)(__c.False)));
 //BA.debugLineNum = 1771;BA.debugLine="Dim rightRelevant As Boolean = rightItem.GetDefau";
_rightrelevant = BA.ObjectToBoolean(_rightitem.GetDefault((Object)("is_relevant"),(Object)(__c.False)));
 //BA.debugLineNum = 1772;BA.debugLine="If leftRelevant <> rightRelevant Then";
if (_leftrelevant!=_rightrelevant) { 
 //BA.debugLineNum = 1773;BA.debugLine="If leftRelevant = False Then Return -1 Else Retu";
if (_leftrelevant==__c.False) { 
if (true) return (int) (-1);}
else {
if (true) return (int) (1);};
 };
 //BA.debugLineNum = 1775;BA.debugLine="Dim leftLastUsed As Long = leftItem.GetDefault(\"l";
_leftlastused = BA.ObjectToLongNumber(_leftitem.GetDefault((Object)("last_used_at"),(Object)(0)));
 //BA.debugLineNum = 1776;BA.debugLine="Dim rightLastUsed As Long = rightItem.GetDefault(";
_rightlastused = BA.ObjectToLongNumber(_rightitem.GetDefault((Object)("last_used_at"),(Object)(0)));
 //BA.debugLineNum = 1777;BA.debugLine="If leftLastUsed <> rightLastUsed Then";
if (_leftlastused!=_rightlastused) { 
 //BA.debugLineNum = 1778;BA.debugLine="If leftLastUsed < rightLastUsed Then Return -1 E";
if (_leftlastused<_rightlastused) { 
if (true) return (int) (-1);}
else {
if (true) return (int) (1);};
 };
 //BA.debugLineNum = 1780;BA.debugLine="Dim leftSaved As Long = leftItem.GetDefault(\"save";
_leftsaved = BA.ObjectToLongNumber(_leftitem.GetDefault((Object)("saved_at"),(Object)(0)));
 //BA.debugLineNum = 1781;BA.debugLine="Dim rightSaved As Long = rightItem.GetDefault(\"sa";
_rightsaved = BA.ObjectToLongNumber(_rightitem.GetDefault((Object)("saved_at"),(Object)(0)));
 //BA.debugLineNum = 1782;BA.debugLine="If leftSaved <> rightSaved Then";
if (_leftsaved!=_rightsaved) { 
 //BA.debugLineNum = 1783;BA.debugLine="If leftSaved < rightSaved Then Return -1 Else Re";
if (_leftsaved<_rightsaved) { 
if (true) return (int) (-1);}
else {
if (true) return (int) (1);};
 };
 //BA.debugLineNum = 1785;BA.debugLine="Return 0";
if (true) return (int) (0);
 //BA.debugLineNum = 1786;BA.debugLine="End Sub";
return 0;
}
public boolean  _consumerecentmedianetworkfailure() throws Exception{
boolean _value = false;
 //BA.debugLineNum = 370;BA.debugLine="Public Sub ConsumeRecentMediaNetworkFailure As Boo";
 //BA.debugLineNum = 371;BA.debugLine="Dim value As Boolean = recentMediaNetworkFailure";
_value = _recentmedianetworkfailure;
 //BA.debugLineNum = 372;BA.debugLine="recentMediaNetworkFailure = False";
_recentmedianetworkfailure = __c.False;
 //BA.debugLineNum = 373;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return false;
}
public int  _counttrackfilesondisk() throws Exception{
int _count = 0;
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
String _filename = "";
 //BA.debugLineNum = 281;BA.debugLine="Private Sub CountTrackFilesOnDisk As Int";
 //BA.debugLineNum = 282;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (_directoryexists(_gettracksdir())==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 283;BA.debugLine="Dim count As Int = 0";
_count = (int) (0);
 //BA.debugLineNum = 284;BA.debugLine="Try";
try { //BA.debugLineNum = 285;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRec";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = _listtrackcachefilesrecursive();
 //BA.debugLineNum = 286;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 287;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group6 = _listedfiles;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_filename = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 288;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 289;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
if (_filename.endsWith(".tmp")) { 
if (true) continue;};
 //BA.debugLineNum = 290;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
};
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 293;BA.debugLine="Trace(\"Не удалось посчитать track файлы на диске";
_trace("Не удалось посчитать track файлы на диске. message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 295;BA.debugLine="Return count";
if (true) return _count;
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist() throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
 //BA.debugLineNum = 1957;BA.debugLine="Private Sub CreateInitializedList As List";
 //BA.debugLineNum = 1958;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1959;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 1960;BA.debugLine="Return items";
if (true) return _items;
 //BA.debugLineNum = 1961;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createtrackidset(anywheresoftware.b4a.objects.collections.List _trackids) throws Exception{
anywheresoftware.b4a.objects.collections.Map _result = null;
String _trackid = "";
 //BA.debugLineNum = 1788;BA.debugLine="Private Sub CreateTrackIdSet(trackIds As List) As";
 //BA.debugLineNum = 1789;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1790;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 1791;BA.debugLine="If trackIds.IsInitialized = False Then Return res";
if (_trackids.IsInitialized()==__c.False) { 
if (true) return _result;};
 //BA.debugLineNum = 1792;BA.debugLine="For Each trackId As String In trackIds";
{
final anywheresoftware.b4a.BA.IterableList group4 = _trackids;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_trackid = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 1793;BA.debugLine="If trackId <> \"\" Then result.Put(trackId, True)";
if ((_trackid).equals("") == false) { 
_result.Put((Object)(_trackid),(Object)(__c.True));};
 }
};
 //BA.debugLineNum = 1795;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 1796;BA.debugLine="End Sub";
return null;
}
public String  _deletefileifexists(String _dir,String _filename) throws Exception{
String _filedir = "";
String _leafname = "";
 //BA.debugLineNum = 1086;BA.debugLine="Private Sub DeleteFileIfExists(dir As String, file";
 //BA.debugLineNum = 1087;BA.debugLine="If fileName = \"\" Then Return";
if ((_filename).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 1088;BA.debugLine="Try";
try { //BA.debugLineNum = 1089;BA.debugLine="Dim fileDir As String = ResolveRelativeParentDir";
_filedir = _resolverelativeparentdir(_dir,_filename);
 //BA.debugLineNum = 1090;BA.debugLine="Dim leafName As String = ResolveRelativeLeafName";
_leafname = _resolverelativeleafname(_filename);
 //BA.debugLineNum = 1091;BA.debugLine="If File.Exists(fileDir, leafName) Then File.Dele";
if (__c.File.Exists(_filedir,_leafname)) { 
__c.File.Delete(_filedir,_leafname);};
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 1093;BA.debugLine="Trace(\"ошибка кэша context=file_delete message=\"";
_trace("ошибка кэша context=file_delete message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 1095;BA.debugLine="End Sub";
return "";
}
public String  _deletetracksubdirrecursive(String _path) throws Exception{
anywheresoftware.b4a.objects.collections.List _listed = null;
String _name = "";
 //BA.debugLineNum = 1020;BA.debugLine="Private Sub DeleteTrackSubdirRecursive(path As Str";
 //BA.debugLineNum = 1021;BA.debugLine="Try";
try { //BA.debugLineNum = 1022;BA.debugLine="If DirectoryExists(path) = False Then Return";
if (_directoryexists(_path)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1023;BA.debugLine="Dim listed As List = File.ListFiles(path)";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_path);
 //BA.debugLineNum = 1024;BA.debugLine="If listed.IsInitialized Then";
if (_listed.IsInitialized()) { 
 //BA.debugLineNum = 1025;BA.debugLine="For Each name As String In listed";
{
final anywheresoftware.b4a.BA.IterableList group5 = _listed;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_name = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 1026;BA.debugLine="If name = \"\" Then Continue";
if ((_name).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 1027;BA.debugLine="If File.IsDirectory(path, name) Then";
if (__c.File.IsDirectory(_path,_name)) { 
 //BA.debugLineNum = 1028;BA.debugLine="DeleteTrackSubdirRecursive(File.Combine(path,";
_deletetracksubdirrecursive(__c.File.Combine(_path,_name));
 }else {
 //BA.debugLineNum = 1030;BA.debugLine="File.Delete(path, name)";
__c.File.Delete(_path,_name);
 };
 }
};
 };
 //BA.debugLineNum = 1034;BA.debugLine="File.Delete(path, \"\")";
__c.File.Delete(_path,"");
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 1036;BA.debugLine="Trace(\"Не удалось удалить legacy папку кэша трек";
_trace("Не удалось удалить legacy папку кэша треков. dir="+_path+", message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 1038;BA.debugLine="End Sub";
return "";
}
public boolean  _directoryexists(String _path) throws Exception{
anywheresoftware.b4j.object.JavaObject _fileobject = null;
 //BA.debugLineNum = 1252;BA.debugLine="Private Sub DirectoryExists(path As String) As Boo";
 //BA.debugLineNum = 1253;BA.debugLine="If path = \"\" Then Return False";
if ((_path).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1254;BA.debugLine="Try";
try { //BA.debugLineNum = 1255;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 1256;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
 //BA.debugLineNum = 1257;BA.debugLine="If fileObject.RunMethod(\"exists\", Null) = False";
if ((_fileobject.RunMethod("exists",(Object[])(__c.Null))).equals((Object)(__c.False))) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1258;BA.debugLine="Return fileObject.RunMethod(\"isDirectory\", Null)";
if (true) return BA.ObjectToBoolean(_fileobject.RunMethod("isDirectory",(Object[])(__c.Null)));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 1260;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 1262;BA.debugLine="End Sub";
return false;
}
public long  _elapsedms(long _startedat) throws Exception{
 //BA.debugLineNum = 1242;BA.debugLine="Private Sub ElapsedMs(startedAt As Long) As Long";
 //BA.debugLineNum = 1243;BA.debugLine="Return Max(0, DateTime.Now - startedAt)";
if (true) return (long) (__c.Max(0,__c.DateTime.getNow()-_startedat));
 //BA.debugLineNum = 1244;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensureadscached(anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
ResumableSub_EnsureAdsCached rsub = new ResumableSub_EnsureAdsCached(this,_offlinedata);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureAdsCached extends BA.ResumableSub {
public ResumableSub_EnsureAdsCached(b4a.example.mediacache parent,anywheresoftware.b4a.objects.collections.Map _offlinedata) {
this.parent = parent;
this._offlinedata = _offlinedata;
}
b4a.example.mediacache parent;
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

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 118;BA.debugLine="FlushPendingIndexSaves";
parent._flushpendingindexsaves();
 //BA.debugLineNum = 119;BA.debugLine="If offlineData.IsInitialized = False Then Return";
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
 //BA.debugLineNum = 120;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
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
 //BA.debugLineNum = 121;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("ads"),parent.__c.Null)));
 //BA.debugLineNum = 122;BA.debugLine="Dim cachedAdIndex As Map = GetCachedAdIndex";
parent._cachedadindex = new anywheresoftware.b4a.objects.collections.Map();
parent._cachedadindex = parent._getcachedadindex();
 //BA.debugLineNum = 123;BA.debugLine="Dim actualAdIds As Map";
_actualadids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 124;BA.debugLine="actualAdIds.Initialize";
_actualadids.Initialize();
 //BA.debugLineNum = 125;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
 //BA.debugLineNum = 126;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
 //BA.debugLineNum = 127;BA.debugLine="If ads.IsInitialized Then";
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
 //BA.debugLineNum = 128;BA.debugLine="For Each adObject As Object In ads";
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
 //BA.debugLineNum = 129;BA.debugLine="If adObject Is Map Then";
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
 //BA.debugLineNum = 130;BA.debugLine="Dim ad As Map = adObject";
_ad = new anywheresoftware.b4a.objects.collections.Map();
_ad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adobject));
 //BA.debugLineNum = 131;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 132;BA.debugLine="If adId = \"\" Then Continue";
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
 //BA.debugLineNum = 133;BA.debugLine="actualAdIds.Put(adId, True)";
_actualadids.Put((Object)(_adid),(Object)(parent.__c.True));
 //BA.debugLineNum = 134;BA.debugLine="Wait For (EnsureSingleAdCached(ad, cachedAdInd";
parent.__c.WaitFor("complete", ba, this, parent._ensuresingleadcached(_ad,parent._cachedadindex));
this.state = 39;
return;
case 39:
//C
this.state = 28;
_downloaded = (Boolean) result[0];
;
 //BA.debugLineNum = 135;BA.debugLine="If downloaded Then";
if (true) break;

case 28:
//if
this.state = 33;
if (_downloaded) { 
this.state = 30;
}else if(parent._isadcached(_adid)==parent.__c.False) { 
this.state = 32;
}if (true) break;

case 30:
//C
this.state = 33;
 //BA.debugLineNum = 136;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 32:
//C
this.state = 33;
 //BA.debugLineNum = 138;BA.debugLine="failedCount = failedCount + 1";
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
 //BA.debugLineNum = 143;BA.debugLine="Dim removedCount As Int = PruneMissingAds(cachedA";
_removedcount = parent._prunemissingads(parent._cachedadindex,_actualadids);
 //BA.debugLineNum = 144;BA.debugLine="SaveAdIndex";
parent._saveadindex();
 //BA.debugLineNum = 145;BA.debugLine="Trace(\"ad cache sync done downloaded=\" & download";
parent._trace("ad cache sync done downloaded="+BA.NumberToString(_downloadedcount)+" failed="+BA.NumberToString(_failedcount)+" removed="+BA.NumberToString(_removedcount)+" actual="+BA.NumberToString(parent._cachedadindex.getSize()));
 //BA.debugLineNum = 146;BA.debugLine="Return downloadedCount > 0 Or removedCount > 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloadedcount>0 || _removedcount>0));return;};
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _downloaded) throws Exception{
}
public String  _ensureandroidplaintrackcacheformat() throws Exception{
 //BA.debugLineNum = 871;BA.debugLine="Private Sub EnsureAndroidPlainTrackCacheFormat";
 //BA.debugLineNum = 873;BA.debugLine="If ToLongDefault(storage.GetDefault(ANDROID_PLAIN";
if (_tolongdefault(_storage._getdefault /*Object*/ (_android_plain_track_cache_format_key,(Object)(0)),(long) (0))==1) { 
if (true) return "";};
 //BA.debugLineNum = 874;BA.debugLine="ResetAndroidTrackCacheForPlainPlayback";
_resetandroidtrackcacheforplainplayback();
 //BA.debugLineNum = 875;BA.debugLine="storage.Put(ANDROID_PLAIN_TRACK_CACHE_FORMAT_KEY,";
_storage._put /*String*/ (_android_plain_track_cache_format_key,(Object)(1));
 //BA.debugLineNum = 877;BA.debugLine="End Sub";
return "";
}
public String  _ensuredirectory(String _path) throws Exception{
anywheresoftware.b4j.object.JavaObject _fileobject = null;
 //BA.debugLineNum = 1246;BA.debugLine="Private Sub EnsureDirectory(path As String)";
 //BA.debugLineNum = 1247;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 1248;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
 //BA.debugLineNum = 1249;BA.debugLine="fileObject.RunMethod(\"mkdirs\", Null)";
_fileobject.RunMethod("mkdirs",(Object[])(__c.Null));
 //BA.debugLineNum = 1250;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuresingleadcached(anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _adindex) throws Exception{
ResumableSub_EnsureSingleAdCached rsub = new ResumableSub_EnsureSingleAdCached(this,_ad,_adindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureSingleAdCached extends BA.ResumableSub {
public ResumableSub_EnsureSingleAdCached(b4a.example.mediacache parent,anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _adindex) {
this.parent = parent;
this._ad = _ad;
this._adindex = _adindex;
}
b4a.example.mediacache parent;
anywheresoftware.b4a.objects.collections.Map _ad;
anywheresoftware.b4a.objects.collections.Map _adindex;
String _adid = "";
String _adurl = "";
long _downloadstartedat = 0L;
b4a.example.httpjob _j = null;
String _tempfilename = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outstream = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 459;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 460;BA.debugLine="If adId = \"\" Then Return False";
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
 //BA.debugLineNum = 461;BA.debugLine="If TryRestoreExistingCachedMedia(\"ad\", adId, ad,";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._tryrestoreexistingcachedmedia("ad",_adid,_ad,_adindex)) { 
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
 //BA.debugLineNum = 462;BA.debugLine="If IsAdCached(adId) Then";
if (true) break;

case 13:
//if
this.state = 16;
if (parent._isadcached(_adid)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 463;BA.debugLine="UpdateAdIndex(ad, adIndex)";
parent._updateadindex(_ad,_adindex);
 //BA.debugLineNum = 464;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 466;BA.debugLine="Dim adUrl As String = BuildAdUrl(adId)";
_adurl = parent._buildadurl(_adid);
 //BA.debugLineNum = 467;BA.debugLine="If adUrl = \"\" Then Return False";
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
 //BA.debugLineNum = 468;BA.debugLine="Dim downloadStartedAt As Long = DateTime.Now";
_downloadstartedat = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 469;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
 //BA.debugLineNum = 470;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 471;BA.debugLine="Trace(\"Скачивание рекламы в кэш. id=\" & adId & \",";
parent._trace("Скачивание рекламы в кэш. id="+_adid+", url="+_adurl);
 //BA.debugLineNum = 472;BA.debugLine="j.Download(adUrl)";
_j._download /*String*/ (_adurl);
 //BA.debugLineNum = 473;BA.debugLine="j.GetRequest.Timeout = AD_DOWNLOAD_TIMEOUT_MS";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().setTimeout(parent._ad_download_timeout_ms);
 //BA.debugLineNum = 474;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 48;
return;
case 48:
//C
this.state = 23;
_j = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 475;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 476;BA.debugLine="Try";
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
 //BA.debugLineNum = 477;BA.debugLine="EnsureDirectory(GetAdsDir)";
parent._ensuredirectory(parent._getadsdir());
 //BA.debugLineNum = 478;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
_tempfilename = parent._buildtempcachefilename(_adid);
 //BA.debugLineNum = 479;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
parent._deletefileifexists(parent._getadsdir(),_tempfilename);
 //BA.debugLineNum = 480;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = parent.__c.File.OpenOutput(parent._getadsdir(),_tempfilename,parent.__c.False);
 //BA.debugLineNum = 481;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(java.io.OutputStream)(_outstream.getObject()));
 //BA.debugLineNum = 482;BA.debugLine="outStream.Close";
_outstream.Close();
 //BA.debugLineNum = 483;BA.debugLine="If IsCachedFileUsable(GetAdsDir, tempFileName)";
if (true) break;

case 29:
//if
this.state = 32;
if (parent._iscachedfileusable(parent._getadsdir(),_tempfilename)==parent.__c.False) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 484;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
parent._deletefileifexists(parent._getadsdir(),_tempfilename);
 //BA.debugLineNum = 485;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
parent._trace("Не удалось сохранить рекламу в кэш. id="+_adid+", message=empty temp file");
 //BA.debugLineNum = 486;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 487;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 489;BA.debugLine="If ReplaceCacheFile(GetAdsDir, tempFileName, ad";

case 32:
//if
this.state = 35;
if (parent._replacecachefile(parent._getadsdir(),_tempfilename,_adid)==parent.__c.False) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 490;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
parent._deletefileifexists(parent._getadsdir(),_tempfilename);
 //BA.debugLineNum = 491;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
parent._trace("Не удалось сохранить рекламу в кэш. id="+_adid+", message=rename failed");
 //BA.debugLineNum = 492;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 493;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 35:
//C
this.state = 38;
;
 //BA.debugLineNum = 495;BA.debugLine="UpdateAdIndex(ad, adIndex)";
parent._updateadindex(_ad,_adindex);
 //BA.debugLineNum = 496;BA.debugLine="SaveAdIndex";
parent._saveadindex();
 //BA.debugLineNum = 497;BA.debugLine="recentMediaNetworkFailure = False";
parent._recentmedianetworkfailure = parent.__c.False;
 //BA.debugLineNum = 498;BA.debugLine="Trace(\"Реклама сохранена в кэш. id=\" & adId & \"";
parent._trace("Реклама сохранена в кэш. id="+_adid+", totalElapsedMs="+BA.NumberToString(parent._elapsedms(_downloadstartedat)));
 //BA.debugLineNum = 499;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 500;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 0;
 //BA.debugLineNum = 502;BA.debugLine="DeleteFileIfExists(GetAdsDir, BuildTempCacheFil";
parent._deletefileifexists(parent._getadsdir(),parent._buildtempcachefilename(_adid));
 //BA.debugLineNum = 503;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=\"";
parent._trace("Не удалось сохранить рекламу в кэш. id="+_adid+", message="+parent.__c.LastException(parent.getActivityBA()).getMessage());
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
 //BA.debugLineNum = 506;BA.debugLine="If IsMediaNetworkFailure(j.ErrorMessage) Then re";
if (true) break;

case 41:
//if
this.state = 46;
if (parent._ismedianetworkfailure(_j._errormessage /*String*/ )) { 
this.state = 43;
;}if (true) break;

case 43:
//C
this.state = 46;
parent._recentmedianetworkfailure = parent.__c.True;
if (true) break;

case 46:
//C
this.state = 47;
;
 //BA.debugLineNum = 507;BA.debugLine="Trace(\"Не удалось скачать рекламу. id=\" & adId &";
parent._trace("Не удалось скачать рекламу. id="+_adid+", message="+_j._errormessage /*String*/ );
 if (true) break;

case 47:
//C
this.state = -1;
;
 //BA.debugLineNum = 509;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 510;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
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
public void  _jobdone(b4a.example.httpjob _j) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuresingletrackcached(anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
ResumableSub_EnsureSingleTrackCached rsub = new ResumableSub_EnsureSingleTrackCached(this,_item,_trackindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureSingleTrackCached extends BA.ResumableSub {
public ResumableSub_EnsureSingleTrackCached(b4a.example.mediacache parent,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex) {
this.parent = parent;
this._item = _item;
this._trackindex = _trackindex;
}
b4a.example.mediacache parent;
anywheresoftware.b4a.objects.collections.Map _item;
anywheresoftware.b4a.objects.collections.Map _trackindex;
String _trackid = "";
String _playlistid = "";
String _trackurl = "";
long _downloadstartedat = 0L;
b4a.example.httpjob _j = null;
String _trackdir = "";
String _tempfilename = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outstream = null;
String _failedplaylistid = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 514;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 515;BA.debugLine="If trackId = \"\" Then Return False";
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
 //BA.debugLineNum = 516;BA.debugLine="Dim playlistId As String = ResolveTrackPlaylistId";
_playlistid = parent._resolvetrackplaylistid(_item,_trackindex,_trackid);
 //BA.debugLineNum = 517;BA.debugLine="If TryRestoreTrackByExpectedPath(trackId, playlis";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._tryrestoretrackbyexpectedpath(_trackid,_playlistid,_item,_trackindex)) { 
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
 //BA.debugLineNum = 518;BA.debugLine="If TryRestoreExistingCachedMedia(\"track\", trackId";
if (true) break;

case 13:
//if
this.state = 18;
if (parent._tryrestoreexistingcachedmedia("track",_trackid,_item,_trackindex)) { 
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
 //BA.debugLineNum = 519;BA.debugLine="If IsTrackCached(trackId) Then";
if (true) break;

case 19:
//if
this.state = 22;
if (parent._istrackcached(_trackid)) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 520;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
parent._updatetrackindex(_item,_trackindex);
 //BA.debugLineNum = 521;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
 //BA.debugLineNum = 523;BA.debugLine="Dim trackUrl As String = BuildTrackUrl(trackId)";
_trackurl = parent._buildtrackurl(_trackid);
 //BA.debugLineNum = 524;BA.debugLine="If trackUrl = \"\" Then Return False";
if (true) break;

case 23:
//if
this.state = 28;
if ((_trackurl).equals("")) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 28:
//C
this.state = 29;
;
 //BA.debugLineNum = 525;BA.debugLine="Dim downloadStartedAt As Long = DateTime.Now";
_downloadstartedat = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 526;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
 //BA.debugLineNum = 527;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 528;BA.debugLine="Trace(\"Скачивание трека в кэш. id=\" & trackId & \"";
parent._trace("Скачивание трека в кэш. id="+_trackid+", url="+_trackurl);
 //BA.debugLineNum = 529;BA.debugLine="j.Download(trackUrl)";
_j._download /*String*/ (_trackurl);
 //BA.debugLineNum = 530;BA.debugLine="j.GetRequest.Timeout = TRACK_DOWNLOAD_TIMEOUT_MS";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().setTimeout(parent._track_download_timeout_ms);
 //BA.debugLineNum = 531;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 68;
return;
case 68:
//C
this.state = 29;
_j = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 532;BA.debugLine="If j.Success Then";
if (true) break;

case 29:
//if
this.state = 67;
if (_j._success /*boolean*/ ) { 
this.state = 31;
}else {
this.state = 60;
}if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 533;BA.debugLine="Try";
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
 //BA.debugLineNum = 534;BA.debugLine="Dim trackDir As String = GetTracksDir";
_trackdir = parent._gettracksdir();
 //BA.debugLineNum = 535;BA.debugLine="EnsureDirectory(trackDir)";
parent._ensuredirectory(_trackdir);
 //BA.debugLineNum = 536;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
_tempfilename = parent._buildtempcachefilename(_trackid);
 //BA.debugLineNum = 537;BA.debugLine="DeleteFileIfExists(trackDir, tempFileName)";
parent._deletefileifexists(_trackdir,_tempfilename);
 //BA.debugLineNum = 538;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = parent.__c.File.OpenOutput(_trackdir,_tempfilename,parent.__c.False);
 //BA.debugLineNum = 540;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(java.io.OutputStream)(_outstream.getObject()));
 //BA.debugLineNum = 544;BA.debugLine="outStream.Close";
_outstream.Close();
 //BA.debugLineNum = 545;BA.debugLine="If IsCachedFileUsable(trackDir, tempFileName) =";
if (true) break;

case 35:
//if
this.state = 38;
if (parent._iscachedfileusable(_trackdir,_tempfilename)==parent.__c.False) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 //BA.debugLineNum = 546;BA.debugLine="DeleteFileIfExists(trackDir, tempFileName)";
parent._deletefileifexists(_trackdir,_tempfilename);
 //BA.debugLineNum = 547;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
parent._trace("Не удалось сохранить трек в кэш. id="+_trackid+", message=empty temp file");
 //BA.debugLineNum = 548;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 549;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 551;BA.debugLine="If ReplaceCacheFile(trackDir, tempFileName, Bui";

case 38:
//if
this.state = 41;
if (parent._replacecachefile(_trackdir,_tempfilename,parent._buildtrackcachefilename(_trackid))==parent.__c.False) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 //BA.debugLineNum = 552;BA.debugLine="DeleteFileIfExists(trackDir, tempFileName)";
parent._deletefileifexists(_trackdir,_tempfilename);
 //BA.debugLineNum = 553;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
parent._trace("Не удалось сохранить трек в кэш. id="+_trackid+", message=rename failed");
 //BA.debugLineNum = 554;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 555;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 41:
//C
this.state = 42;
;
 //BA.debugLineNum = 557;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
parent._updatetrackindex(_item,_trackindex);
 //BA.debugLineNum = 558;BA.debugLine="If ValidateIndexedFile(\"track\", trackId) = Fals";
if (true) break;

case 42:
//if
this.state = 49;
if (parent._validateindexedfile("track",_trackid)==parent.__c.False) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 //BA.debugLineNum = 559;BA.debugLine="BackfillTrackIndexFromFiles";
parent._backfilltrackindexfromfiles();
 //BA.debugLineNum = 560;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
parent._updatetrackindex(_item,_trackindex);
 //BA.debugLineNum = 561;BA.debugLine="If ValidateIndexedFile(\"track\", trackId) = Fal";
if (true) break;

case 45:
//if
this.state = 48;
if (parent._validateindexedfile("track",_trackid)==parent.__c.False) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
 //BA.debugLineNum = 562;BA.debugLine="Trace(\"Не удалось валидировать трек после сох";
parent._trace("Не удалось валидировать трек после сохранения. id="+_trackid);
 //BA.debugLineNum = 563;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 564;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
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
 //BA.debugLineNum = 567;BA.debugLine="SaveTrackIndex";
parent._savetrackindex();
 //BA.debugLineNum = 568;BA.debugLine="recentMediaNetworkFailure = False";
parent._recentmedianetworkfailure = parent.__c.False;
 //BA.debugLineNum = 569;BA.debugLine="Trace(\"Трек сохранен в кэш. id=\" & trackId & \",";
parent._trace("Трек сохранен в кэш. id="+_trackid+", totalElapsedMs="+BA.NumberToString(parent._elapsedms(_downloadstartedat)));
 //BA.debugLineNum = 570;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 571;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 51:
//C
this.state = 52;
this.catchState = 0;
 //BA.debugLineNum = 573;BA.debugLine="Dim failedPlaylistId As String = ResolveTrackPl";
_failedplaylistid = parent._resolvetrackplaylistid(_item,_trackindex,_trackid);
 //BA.debugLineNum = 574;BA.debugLine="DeleteFileIfExists(GetTracksDir, BuildTempCache";
parent._deletefileifexists(parent._gettracksdir(),parent._buildtempcachefilename(_trackid));
 //BA.debugLineNum = 575;BA.debugLine="If failedPlaylistId <> \"\" Then DeleteFileIfExis";
if (true) break;

case 52:
//if
this.state = 57;
if ((_failedplaylistid).equals("") == false) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
parent._deletefileifexists(parent._gettrackplaylistdir(_failedplaylistid),parent._buildtempcachefilename(_trackid));
if (true) break;

case 57:
//C
this.state = 58;
;
 //BA.debugLineNum = 576;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
parent._trace("Не удалось сохранить трек в кэш. id="+_trackid+", message="+parent.__c.LastException(parent.getActivityBA()).getMessage());
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
 //BA.debugLineNum = 579;BA.debugLine="If IsMediaNetworkFailure(j.ErrorMessage) Then re";
if (true) break;

case 61:
//if
this.state = 66;
if (parent._ismedianetworkfailure(_j._errormessage /*String*/ )) { 
this.state = 63;
;}if (true) break;

case 63:
//C
this.state = 66;
parent._recentmedianetworkfailure = parent.__c.True;
if (true) break;

case 66:
//C
this.state = 67;
;
 //BA.debugLineNum = 580;BA.debugLine="Trace(\"Не удалось скачать трек. id=\" & trackId &";
parent._trace("Не удалось скачать трек. id="+_trackid+", message="+_j._errormessage /*String*/ );
 if (true) break;

case 67:
//C
this.state = -1;
;
 //BA.debugLineNum = 582;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 583;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 584;BA.debugLine="End Sub";
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
public String  _ensuretrackcacheready() throws Exception{
int _actualtrackfiles = 0;
 //BA.debugLineNum = 270;BA.debugLine="Public Sub EnsureTrackCacheReady";
 //BA.debugLineNum = 271;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (_directoryexists(_gettracksdir())==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 272;BA.debugLine="MigrateLegacyTrackCacheLayout";
_migratelegacytrackcachelayout();
 //BA.debugLineNum = 273;BA.debugLine="Dim actualTrackFiles As Int = CountTrackFilesOnDi";
_actualtrackfiles = _counttrackfilesondisk();
 //BA.debugLineNum = 274;BA.debugLine="If actualTrackFiles = 0 Then Return";
if (_actualtrackfiles==0) { 
if (true) return "";};
 //BA.debugLineNum = 275;BA.debugLine="If cachedTrackCount = actualTrackFiles And cached";
if (_cachedtrackcount==_actualtrackfiles && _cachedtrackindex.IsInitialized() && _cachedtrackindex.getSize()==_actualtrackfiles) { 
if (true) return "";};
 //BA.debugLineNum = 276;BA.debugLine="BackfillTrackIndexFromFiles";
_backfilltrackindexfromfiles();
 //BA.debugLineNum = 277;BA.debugLine="RebuildCacheStatsFromIndexes";
_rebuildcachestatsfromindexes();
 //BA.debugLineNum = 278;BA.debugLine="SaveCacheStatsSnapshot";
_savecachestatssnapshot();
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return "";
}
public String  _ensuretrackindexentry(String _trackid,String _playlistid,String _relativefilename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _entry = null;
 //BA.debugLineNum = 933;BA.debugLine="Private Sub EnsureTrackIndexEntry(trackId As Strin";
 //BA.debugLineNum = 934;BA.debugLine="If trackId = \"\" Or relativeFileName = \"\" Then Ret";
if ((_trackid).equals("") || (_relativefilename).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 935;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
if (_cachedtrackindex.IsInitialized()==__c.False) { 
_cachedtrackindex.Initialize();};
 //BA.debugLineNum = 936;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(tr";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedtrackindex.GetDefault((Object)(_trackid),__c.Null)));
 //BA.debugLineNum = 937;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
 //BA.debugLineNum = 938;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
 //BA.debugLineNum = 939;BA.debugLine="If playlistId <> \"\" Then entry.Put(\"playlist_id\",";
if ((_playlistid).equals("") == false) { 
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));};
 //BA.debugLineNum = 940;BA.debugLine="entry.Put(\"file_name\", relativeFileName)";
_entry.Put((Object)("file_name"),(Object)(_relativefilename));
 //BA.debugLineNum = 941;BA.debugLine="entry.Put(\"size_bytes\", GetFileSizeSafe(GetTracks";
_entry.Put((Object)("size_bytes"),(Object)(_getfilesizesafe(_gettracksdir(),_relativefilename)));
 //BA.debugLineNum = 942;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
 //BA.debugLineNum = 943;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 944;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
_cachedtrackindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
 //BA.debugLineNum = 945;BA.debugLine="cachedTrackIndexDirty = True";
_cachedtrackindexdirty = __c.True;
 //BA.debugLineNum = 946;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuretrackscached(anywheresoftware.b4a.objects.collections.List _trackitems,int _maxcount) throws Exception{
ResumableSub_EnsureTracksCached rsub = new ResumableSub_EnsureTracksCached(this,_trackitems,_maxcount);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureTracksCached extends BA.ResumableSub {
public ResumableSub_EnsureTracksCached(b4a.example.mediacache parent,anywheresoftware.b4a.objects.collections.List _trackitems,int _maxcount) {
this.parent = parent;
this._trackitems = _trackitems;
this._maxcount = _maxcount;
}
b4a.example.mediacache parent;
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

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 339;BA.debugLine="FlushPendingIndexSaves";
parent._flushpendingindexsaves();
 //BA.debugLineNum = 340;BA.debugLine="If trackItems.IsInitialized = False Or trackItems";
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
 //BA.debugLineNum = 341;BA.debugLine="Dim cachedTrackIndex As Map = GetCachedTrackIndex";
parent._cachedtrackindex = new anywheresoftware.b4a.objects.collections.Map();
parent._cachedtrackindex = parent._getcachedtrackindex();
 //BA.debugLineNum = 342;BA.debugLine="Dim seenTrackIds As Map";
_seentrackids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 343;BA.debugLine="seenTrackIds.Initialize";
_seentrackids.Initialize();
 //BA.debugLineNum = 344;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
 //BA.debugLineNum = 345;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
 //BA.debugLineNum = 346;BA.debugLine="Dim processedCount As Int = 0";
_processedcount = (int) (0);
 //BA.debugLineNum = 347;BA.debugLine="For Each itemObject As Object In trackItems";
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
 //BA.debugLineNum = 348;BA.debugLine="If processedCount >= maxCount Then Exit";
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
 //BA.debugLineNum = 349;BA.debugLine="If itemObject Is Map Then";
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
 //BA.debugLineNum = 350;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
 //BA.debugLineNum = 351;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then";
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
 //BA.debugLineNum = 352;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 353;BA.debugLine="If trackId = \"\" Then Continue";
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
 //BA.debugLineNum = 354;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Conti";
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
 //BA.debugLineNum = 355;BA.debugLine="seenTrackIds.Put(trackId, True)";
_seentrackids.Put((Object)(_trackid),(Object)(parent.__c.True));
 //BA.debugLineNum = 356;BA.debugLine="processedCount = processedCount + 1";
_processedcount = (int) (_processedcount+1);
 //BA.debugLineNum = 357;BA.debugLine="Wait For (EnsureSingleTrackCached(item, cachedT";
parent.__c.WaitFor("complete", ba, this, parent._ensuresingletrackcached(_item,parent._cachedtrackindex));
this.state = 47;
return;
case 47:
//C
this.state = 37;
_downloaded = (Boolean) result[0];
;
 //BA.debugLineNum = 358;BA.debugLine="If downloaded Then";
if (true) break;

case 37:
//if
this.state = 42;
if (_downloaded) { 
this.state = 39;
}else if(parent._istrackcached(_trackid)==parent.__c.False) { 
this.state = 41;
}if (true) break;

case 39:
//C
this.state = 42;
 //BA.debugLineNum = 359;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 41:
//C
this.state = 42;
 //BA.debugLineNum = 361;BA.debugLine="failedCount = failedCount + 1";
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
 //BA.debugLineNum = 365;BA.debugLine="SaveTrackIndex";
parent._savetrackindex();
 //BA.debugLineNum = 366;BA.debugLine="Trace(\"Синхронизация кэша треков завершена. downl";
parent._trace("Синхронизация кэша треков завершена. downloaded="+BA.NumberToString(_downloadedcount)+", failed="+BA.NumberToString(_failedcount)+", actual="+BA.NumberToString(parent._cachedtrackindex.getSize()));
 //BA.debugLineNum = 367;BA.debugLine="Return downloadedCount > 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloadedcount>0));return;};
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _extractplaylistidfromtrackrelativepath(String _relativefilename) throws Exception{
String _normalized = "";
int _slashindex = 0;
 //BA.debugLineNum = 1701;BA.debugLine="Private Sub ExtractPlaylistIdFromTrackRelativePath";
 //BA.debugLineNum = 1702;BA.debugLine="If relativeFileName = \"\" Then Return \"\"";
if ((_relativefilename).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 1703;BA.debugLine="Dim normalized As String = relativeFileName.Repla";
_normalized = _relativefilename.replace("\\\\","/");
 //BA.debugLineNum = 1704;BA.debugLine="Dim slashIndex As Int = normalized.IndexOf(\"/\")";
_slashindex = _normalized.indexOf("/");
 //BA.debugLineNum = 1705;BA.debugLine="If slashIndex <= 0 Then Return \"\"";
if (_slashindex<=0) { 
if (true) return "";};
 //BA.debugLineNum = 1706;BA.debugLine="Return normalized.SubString2(0, slashIndex)";
if (true) return _normalized.substring((int) (0),_slashindex);
 //BA.debugLineNum = 1707;BA.debugLine="End Sub";
return "";
}
public String  _finalizecurrentcacheaudittype() throws Exception{
String _auditdir = "";
anywheresoftware.b4a.objects.collections.Map _auditindex = null;
anywheresoftware.b4a.objects.collections.List _keyscopy = null;
String _key = "";
String _filename = "";
 //BA.debugLineNum = 1337;BA.debugLine="Private Sub FinalizeCurrentCacheAuditType";
 //BA.debugLineNum = 1338;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = _getauditdirbytype(_cacheauditcurrenttype);
 //BA.debugLineNum = 1339;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = _getauditindexbytype(_cacheauditcurrenttype);
 //BA.debugLineNum = 1340;BA.debugLine="Dim keysCopy As List";
_keyscopy = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1341;BA.debugLine="keysCopy.Initialize";
_keyscopy.Initialize();
 //BA.debugLineNum = 1342;BA.debugLine="For Each key As String In auditIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _auditindex.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 1343;BA.debugLine="keysCopy.Add(key)";
_keyscopy.Add((Object)(_key));
 }
};
 //BA.debugLineNum = 1345;BA.debugLine="For Each key As String In keysCopy";
{
final anywheresoftware.b4a.BA.IterableList group8 = _keyscopy;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 1346;BA.debugLine="If cacheAuditSeenIds.ContainsKey(key) = False Th";
if (_cacheauditseenids.ContainsKey((Object)(_key))==__c.False) { 
 //BA.debugLineNum = 1347;BA.debugLine="Dim fileName As String = ResolveIndexedAuditFil";
_filename = _resolveindexedauditfilename(_cacheauditcurrenttype,_key,_auditindex);
 //BA.debugLineNum = 1348;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then";
if (_iscachedfileusable(_auditdir,_filename)) { 
 //BA.debugLineNum = 1349;BA.debugLine="cacheAuditSeenIds.Put(key, True)";
_cacheauditseenids.Put((Object)(_key),(Object)(__c.True));
 //BA.debugLineNum = 1350;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 1352;BA.debugLine="auditIndex.Remove(key)";
_auditindex.Remove((Object)(_key));
 //BA.debugLineNum = 1353;BA.debugLine="cacheAuditRemovedCount = cacheAuditRemovedCount";
_cacheauditremovedcount = (int) (_cacheauditremovedcount+1);
 //BA.debugLineNum = 1354;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
_markauditindexchanged(_cacheauditcurrenttype);
 };
 }
};
 //BA.debugLineNum = 1357;BA.debugLine="End Sub";
return "";
}
public String  _findtrackidbyfilename(String _filename,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
String _key = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _storedfilename = "";
 //BA.debugLineNum = 1424;BA.debugLine="Private Sub FindTrackIdByFileName(fileName As Stri";
 //BA.debugLineNum = 1425;BA.debugLine="For Each key As String In trackIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _trackindex.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1426;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(key, Nu";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_key),__c.Null)));
 //BA.debugLineNum = 1427;BA.debugLine="If entry.IsInitialized Then";
if (_entry.IsInitialized()) { 
 //BA.debugLineNum = 1428;BA.debugLine="Dim storedFileName As String = entry.GetDefault";
_storedfilename = BA.ObjectToString(_entry.GetDefault((Object)("file_name"),(Object)("")));
 //BA.debugLineNum = 1429;BA.debugLine="If storedFileName = fileName Then Return key";
if ((_storedfilename).equals(_filename)) { 
if (true) return _key;};
 };
 //BA.debugLineNum = 1431;BA.debugLine="If GetLeafName(fileName) = BuildTrackCacheFileNa";
if ((_getleafname(_filename)).equals(_buildtrackcachefilename(_key))) { 
if (true) return _key;};
 }
};
 //BA.debugLineNum = 1433;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 1434;BA.debugLine="End Sub";
return "";
}
public String  _findtrackidbyfilenamewithmetadata(String _filename,anywheresoftware.b4a.objects.collections.Map _trackindex,anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps) throws Exception{
String _resolvedtrackid = "";
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _globaltrackmap = null;
anywheresoftware.b4a.objects.collections.Map _playlisttrackmap = null;
 //BA.debugLineNum = 1436;BA.debugLine="Private Sub FindTrackIdByFileNameWithMetadata(file";
 //BA.debugLineNum = 1437;BA.debugLine="Dim resolvedTrackId As String = FindTrackIdByFile";
_resolvedtrackid = _findtrackidbyfilename(_filename,_trackindex);
 //BA.debugLineNum = 1438;BA.debugLine="If resolvedTrackId <> \"\" Then Return resolvedTrac";
if ((_resolvedtrackid).equals("") == false) { 
if (true) return _resolvedtrackid;};
 //BA.debugLineNum = 1439;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFromT";
_playlistid = _extractplaylistidfromtrackrelativepath(_filename);
 //BA.debugLineNum = 1440;BA.debugLine="If playlistId = \"\" Then";
if ((_playlistid).equals("")) { 
 //BA.debugLineNum = 1441;BA.debugLine="Dim globalTrackMap As Map = LoadGlobalTrackFileM";
_globaltrackmap = new anywheresoftware.b4a.objects.collections.Map();
_globaltrackmap = _loadglobaltrackfilemap(_playlisttrackmaps);
 //BA.debugLineNum = 1442;BA.debugLine="If globalTrackMap.IsInitialized = False Then Ret";
if (_globaltrackmap.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1443;BA.debugLine="Return globalTrackMap.GetDefault(GetLeafName(fil";
if (true) return BA.ObjectToString(_globaltrackmap.GetDefault((Object)(_getleafname(_filename)),(Object)("")));
 };
 //BA.debugLineNum = 1445;BA.debugLine="Dim playlistTrackMap As Map = LoadPlaylistTrackFi";
_playlisttrackmap = new anywheresoftware.b4a.objects.collections.Map();
_playlisttrackmap = _loadplaylisttrackfilemap(_playlistid,_playlisttrackmaps);
 //BA.debugLineNum = 1446;BA.debugLine="If playlistTrackMap.IsInitialized = False Then Re";
if (_playlisttrackmap.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1447;BA.debugLine="Return playlistTrackMap.GetDefault(fileName, \"\")";
if (true) return BA.ObjectToString(_playlisttrackmap.GetDefault((Object)(_filename),(Object)("")));
 //BA.debugLineNum = 1448;BA.debugLine="End Sub";
return "";
}
public String  _finishcacheaudit() throws Exception{
 //BA.debugLineNum = 1359;BA.debugLine="Private Sub FinishCacheAudit";
 //BA.debugLineNum = 1360;BA.debugLine="If cacheAuditAdIndexChanged Then SaveAdIndex";
if (_cacheauditadindexchanged) { 
_saveadindex();};
 //BA.debugLineNum = 1361;BA.debugLine="If cacheAuditTrackIndexChanged Then SaveTrackInde";
if (_cacheaudittrackindexchanged) { 
_savetrackindex();};
 //BA.debugLineNum = 1362;BA.debugLine="cacheAuditInProgress = False";
_cacheauditinprogress = __c.False;
 //BA.debugLineNum = 1363;BA.debugLine="cacheAuditCurrentType = \"\"";
_cacheauditcurrenttype = "";
 //BA.debugLineNum = 1364;BA.debugLine="cacheAuditListingInProgress = False";
_cacheauditlistinginprogress = __c.False;
 //BA.debugLineNum = 1365;BA.debugLine="cacheAuditListingDir = \"\"";
_cacheauditlistingdir = "";
 //BA.debugLineNum = 1366;BA.debugLine="Trace(\"Аудит кэша завершен. added=\" & cacheAuditA";
_trace("Аудит кэша завершен. added="+BA.NumberToString(_cacheauditaddedcount)+", removed="+BA.NumberToString(_cacheauditremovedcount)+", tempDeleted="+BA.NumberToString(_cacheaudittempdeletedcount)+", ads="+BA.NumberToString(_cachedadindex.getSize())+", tracks="+BA.NumberToString(_cachedtrackindex.getSize()));
 //BA.debugLineNum = 1367;BA.debugLine="End Sub";
return "";
}
public String  _flushpendingindexsaves() throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Public Sub FlushPendingIndexSaves";
 //BA.debugLineNum = 377;BA.debugLine="If cachedAdIndexDirty Then SaveAdIndex";
if (_cachedadindexdirty) { 
_saveadindex();};
 //BA.debugLineNum = 378;BA.debugLine="If cachedTrackIndexDirty Then SaveTrackIndex";
if (_cachedtrackindexdirty) { 
_savetrackindex();};
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return "";
}
public String  _getadsdir() throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Public Sub GetAdsDir As String";
 //BA.debugLineNum = 218;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
if (true) return __c.File.Combine(__c.File.Combine(_storagedir,_mediadirname),_adsdirname);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public String  _getauditdirbytype(String _itemtype) throws Exception{
 //BA.debugLineNum = 1369;BA.debugLine="Private Sub GetAuditDirByType(itemType As String)";
 //BA.debugLineNum = 1370;BA.debugLine="If itemType = \"ads\" Then Return GetAdsDir";
if ((_itemtype).equals("ads")) { 
if (true) return _getadsdir();};
 //BA.debugLineNum = 1371;BA.debugLine="Return GetTracksDir";
if (true) return _gettracksdir();
 //BA.debugLineNum = 1372;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getauditindexbytype(String _itemtype) throws Exception{
 //BA.debugLineNum = 1374;BA.debugLine="Private Sub GetAuditIndexByType(itemType As String";
 //BA.debugLineNum = 1375;BA.debugLine="If itemType = \"ads\" Then Return cachedAdIndex";
if ((_itemtype).equals("ads")) { 
if (true) return _cachedadindex;};
 //BA.debugLineNum = 1376;BA.debugLine="Return cachedTrackIndex";
if (true) return _cachedtrackindex;
 //BA.debugLineNum = 1377;BA.debugLine="End Sub";
return null;
}
public byte[]  _getbytesfromstring(String _value) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 1050;BA.debugLine="Private Sub GetBytesFromString(value As String) As";
 //BA.debugLineNum = 1051;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 1052;BA.debugLine="jo.InitializeNewInstance(\"java.lang.String\", Arra";
_jo.InitializeNewInstance("java.lang.String",new Object[]{(Object)(_value)});
 //BA.debugLineNum = 1053;BA.debugLine="Return jo.RunMethod(\"getBytes\", Array As Object(\"";
if (true) return (byte[])(_jo.RunMethod("getBytes",new Object[]{(Object)("UTF-8")}));
 //BA.debugLineNum = 1054;BA.debugLine="End Sub";
return null;
}
public long  _getcachedadbytes() throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Public Sub GetCachedAdBytes As Long";
 //BA.debugLineNum = 250;BA.debugLine="Return cachedAdBytes";
if (true) return _cachedadbytes;
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return 0L;
}
public int  _getcachedadcount() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Public Sub GetCachedAdCount As Int";
 //BA.debugLineNum = 242;BA.debugLine="Return cachedAdCount";
if (true) return _cachedadcount;
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedadindex() throws Exception{
 //BA.debugLineNum = 651;BA.debugLine="Private Sub GetCachedAdIndex As Map";
 //BA.debugLineNum = 652;BA.debugLine="If cachedAdIndex.IsInitialized = False Then";
if (_cachedadindex.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 653;BA.debugLine="cachedAdIndex.Initialize";
_cachedadindex.Initialize();
 };
 //BA.debugLineNum = 655;BA.debugLine="Return cachedAdIndex";
if (true) return _cachedadindex;
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return null;
}
public long  _getcachedtrackbytes() throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Public Sub GetCachedTrackBytes As Long";
 //BA.debugLineNum = 246;BA.debugLine="Return cachedTrackBytes";
if (true) return _cachedtrackbytes;
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return 0L;
}
public int  _getcachedtrackcount() throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Public Sub GetCachedTrackCount As Int";
 //BA.debugLineNum = 238;BA.debugLine="Return cachedTrackCount";
if (true) return _cachedtrackcount;
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedtrackindex() throws Exception{
 //BA.debugLineNum = 658;BA.debugLine="Private Sub GetCachedTrackIndex As Map";
 //BA.debugLineNum = 659;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then";
if (_cachedtrackindex.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 660;BA.debugLine="cachedTrackIndex.Initialize";
_cachedtrackindex.Initialize();
 };
 //BA.debugLineNum = 662;BA.debugLine="Return cachedTrackIndex";
if (true) return _cachedtrackindex;
 //BA.debugLineNum = 663;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getcachedtrackplaylistidsondisk() throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _seenids = null;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _playlistid = "";
 //BA.debugLineNum = 314;BA.debugLine="Public Sub GetCachedTrackPlaylistIdsOnDisk As List";
 //BA.debugLineNum = 315;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 316;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 317;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (_directoryexists(_gettracksdir())==__c.False) { 
if (true) return _result;};
 //BA.debugLineNum = 318;BA.debugLine="EnsureTrackCacheReady";
_ensuretrackcacheready();
 //BA.debugLineNum = 319;BA.debugLine="Dim seenIds As Map";
_seenids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 320;BA.debugLine="seenIds.Initialize";
_seenids.Initialize();
 //BA.debugLineNum = 321;BA.debugLine="Try";
try { //BA.debugLineNum = 322;BA.debugLine="If cachedTrackIndex.IsInitialized Then";
if (_cachedtrackindex.IsInitialized()) { 
 //BA.debugLineNum = 323;BA.debugLine="For Each trackId As String In cachedTrackIndex.";
{
final anywheresoftware.b4a.BA.IterableList group9 = _cachedtrackindex.Keys();
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_trackid = BA.ObjectToString(group9.Get(index9));
 //BA.debugLineNum = 324;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedtrackindex.GetDefault((Object)(_trackid),__c.Null)));
 //BA.debugLineNum = 325;BA.debugLine="If entry.IsInitialized = False Then Continue";
if (_entry.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 326;BA.debugLine="Dim playlistId As String = entry.GetDefault(\"p";
_playlistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));
 //BA.debugLineNum = 327;BA.debugLine="If playlistId = \"\" Or seenIds.ContainsKey(play";
if ((_playlistid).equals("") || _seenids.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
 //BA.debugLineNum = 328;BA.debugLine="seenIds.Put(playlistId, True)";
_seenids.Put((Object)(_playlistid),(Object)(__c.True));
 //BA.debugLineNum = 329;BA.debugLine="result.Add(playlistId)";
_result.Add((Object)(_playlistid));
 }
};
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19); //BA.debugLineNum = 333;BA.debugLine="Trace(\"Не удалось получить список playlist папок";
_trace("Не удалось получить список playlist папок из track cache. message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 335;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedtrackplayliststats() throws Exception{
anywheresoftware.b4a.objects.collections.Map _result = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _sourceentry = null;
anywheresoftware.b4a.objects.collections.Map _copyentry = null;
 //BA.debugLineNum = 253;BA.debugLine="Public Sub GetCachedTrackPlaylistStats As Map";
 //BA.debugLineNum = 254;BA.debugLine="EnsureTrackCacheReady";
_ensuretrackcacheready();
 //BA.debugLineNum = 255;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 256;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 257;BA.debugLine="For Each playlistId As String In cachedTrackPlayl";
{
final anywheresoftware.b4a.BA.IterableList group4 = _cachedtrackplayliststats.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_playlistid = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 258;BA.debugLine="Dim sourceEntry As Map = cachedTrackPlaylistStat";
_sourceentry = new anywheresoftware.b4a.objects.collections.Map();
_sourceentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedtrackplayliststats.Get((Object)(_playlistid))));
 //BA.debugLineNum = 259;BA.debugLine="Dim copyEntry As Map";
_copyentry = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 260;BA.debugLine="copyEntry.Initialize";
_copyentry.Initialize();
 //BA.debugLineNum = 261;BA.debugLine="If sourceEntry.IsInitialized Then";
if (_sourceentry.IsInitialized()) { 
 //BA.debugLineNum = 262;BA.debugLine="copyEntry.Put(\"count\", sourceEntry.GetDefault(\"";
_copyentry.Put((Object)("count"),_sourceentry.GetDefault((Object)("count"),(Object)(0)));
 //BA.debugLineNum = 263;BA.debugLine="copyEntry.Put(\"bytes\", sourceEntry.GetDefault(\"";
_copyentry.Put((Object)("bytes"),_sourceentry.GetDefault((Object)("bytes"),(Object)(0)));
 };
 //BA.debugLineNum = 265;BA.debugLine="result.Put(playlistId, copyEntry)";
_result.Put((Object)(_playlistid),(Object)(_copyentry.getObject()));
 }
};
 //BA.debugLineNum = 267;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public String  _getdirbyitemtype(String _itemtype) throws Exception{
 //BA.debugLineNum = 1199;BA.debugLine="Private Sub GetDirByItemType(itemType As String) A";
 //BA.debugLineNum = 1200;BA.debugLine="If itemType = \"ad\" Then Return GetAdsDir";
if ((_itemtype).equals("ad")) { 
if (true) return _getadsdir();};
 //BA.debugLineNum = 1201;BA.debugLine="Return GetTracksDir";
if (true) return _gettracksdir();
 //BA.debugLineNum = 1202;BA.debugLine="End Sub";
return "";
}
public long  _getdrivetotalspace(String _path) throws Exception{
anywheresoftware.b4j.object.JavaObject _fileobject = null;
 //BA.debugLineNum = 1939;BA.debugLine="Private Sub GetDriveTotalSpace(path As String) As";
 //BA.debugLineNum = 1940;BA.debugLine="Try";
try { //BA.debugLineNum = 1941;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 1942;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
 //BA.debugLineNum = 1943;BA.debugLine="Return fileObject.RunMethod(\"getTotalSpace\", Nul";
if (true) return BA.ObjectToLongNumber(_fileobject.RunMethod("getTotalSpace",(Object[])(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 1945;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
 //BA.debugLineNum = 1947;BA.debugLine="End Sub";
return 0L;
}
public long  _getdriveusablespace(String _path) throws Exception{
anywheresoftware.b4j.object.JavaObject _fileobject = null;
 //BA.debugLineNum = 1929;BA.debugLine="Private Sub GetDriveUsableSpace(path As String) As";
 //BA.debugLineNum = 1930;BA.debugLine="Try";
try { //BA.debugLineNum = 1931;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 1932;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
 //BA.debugLineNum = 1933;BA.debugLine="Return fileObject.RunMethod(\"getUsableSpace\", Nu";
if (true) return BA.ObjectToLongNumber(_fileobject.RunMethod("getUsableSpace",(Object[])(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 1935;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
 //BA.debugLineNum = 1937;BA.debugLine="End Sub";
return 0L;
}
public long  _getfilesizesafe(String _dir,String _filename) throws Exception{
String _filedir = "";
String _leafname = "";
 //BA.debugLineNum = 1798;BA.debugLine="Private Sub GetFileSizeSafe(dir As String, fileNam";
 //BA.debugLineNum = 1799;BA.debugLine="Try";
try { //BA.debugLineNum = 1800;BA.debugLine="Dim fileDir As String = ResolveRelativeParentDir";
_filedir = _resolverelativeparentdir(_dir,_filename);
 //BA.debugLineNum = 1801;BA.debugLine="Dim leafName As String = ResolveRelativeLeafName";
_leafname = _resolverelativeleafname(_filename);
 //BA.debugLineNum = 1802;BA.debugLine="Return File.Size(fileDir, leafName)";
if (true) return __c.File.Size(_filedir,_leafname);
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 1804;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
 //BA.debugLineNum = 1806;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.collections.Map  _getindexbyitemtype(String _itemtype) throws Exception{
 //BA.debugLineNum = 1194;BA.debugLine="Private Sub GetIndexByItemType(itemType As String)";
 //BA.debugLineNum = 1195;BA.debugLine="If itemType = \"ad\" Then Return cachedAdIndex";
if ((_itemtype).equals("ad")) { 
if (true) return _cachedadindex;};
 //BA.debugLineNum = 1196;BA.debugLine="Return cachedTrackIndex";
if (true) return _cachedtrackindex;
 //BA.debugLineNum = 1197;BA.debugLine="End Sub";
return null;
}
public String  _getleafname(String _fullpath) throws Exception{
String _normalizedname = "";
int _slashindex = 0;
 //BA.debugLineNum = 1850;BA.debugLine="Private Sub GetLeafName(fullPath As String) As Str";
 //BA.debugLineNum = 1851;BA.debugLine="Dim normalizedName As String = fullPath.Replace(\"";
_normalizedname = _fullpath.replace("\\\\","/");
 //BA.debugLineNum = 1852;BA.debugLine="Dim slashIndex As Int = normalizedName.LastIndexO";
_slashindex = _normalizedname.lastIndexOf("/");
 //BA.debugLineNum = 1853;BA.debugLine="If slashIndex < 0 Then Return normalizedName";
if (_slashindex<0) { 
if (true) return _normalizedname;};
 //BA.debugLineNum = 1854;BA.debugLine="Return normalizedName.SubString(slashIndex + 1)";
if (true) return _normalizedname.substring((int) (_slashindex+1));
 //BA.debugLineNum = 1855;BA.debugLine="End Sub";
return "";
}
public String  _getplaybacktempdir() throws Exception{
String _tempdir = "";
 //BA.debugLineNum = 1828;BA.debugLine="Private Sub GetPlaybackTempDir As String";
 //BA.debugLineNum = 1832;BA.debugLine="Dim tempDir As String = File.Combine(storageDir,";
_tempdir = __c.File.Combine(_storagedir,"temp");
 //BA.debugLineNum = 1833;BA.debugLine="EnsureDirectory(tempDir)";
_ensuredirectory(_tempdir);
 //BA.debugLineNum = 1834;BA.debugLine="Return tempDir";
if (true) return _tempdir;
 //BA.debugLineNum = 1838;BA.debugLine="End Sub";
return "";
}
public int  _gettrackplaycount(String _trackid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _entry = null;
 //BA.debugLineNum = 718;BA.debugLine="Public Sub GetTrackPlayCount(trackId As String) As";
 //BA.debugLineNum = 719;BA.debugLine="If trackId = \"\" Then Return 0";
if ((_trackid).equals("")) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 720;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then Re";
if (_cachedtrackindex.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 721;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(tr";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedtrackindex.GetDefault((Object)(_trackid),__c.Null)));
 //BA.debugLineNum = 722;BA.debugLine="If entry.IsInitialized = False Then Return 0";
if (_entry.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 723;BA.debugLine="Return entry.GetDefault(\"play_count\", 0)";
if (true) return (int)(BA.ObjectToNumber(_entry.GetDefault((Object)("play_count"),(Object)(0))));
 //BA.debugLineNum = 724;BA.debugLine="End Sub";
return 0;
}
public String  _gettrackplaylistdir(String _playlistid) throws Exception{
String _unusedplaylistid = "";
 //BA.debugLineNum = 792;BA.debugLine="Private Sub GetTrackPlaylistDir(playlistId As Stri";
 //BA.debugLineNum = 793;BA.debugLine="Dim unusedPlaylistId As String = playlistId";
_unusedplaylistid = _playlistid;
 //BA.debugLineNum = 794;BA.debugLine="If unusedPlaylistId = \"\" Then";
if ((_unusedplaylistid).equals("")) { 
 };
 //BA.debugLineNum = 796;BA.debugLine="Return GetTracksDir";
if (true) return _gettracksdir();
 //BA.debugLineNum = 797;BA.debugLine="End Sub";
return "";
}
public String  _gettracksdir() throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Public Sub GetTracksDir As String";
 //BA.debugLineNum = 222;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
if (true) return __c.File.Combine(__c.File.Combine(_storagedir,_mediadirname),_tracksdirname);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public boolean  _hasanytrackfilesondisk() throws Exception{
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
String _filename = "";
 //BA.debugLineNum = 298;BA.debugLine="Public Sub HasAnyTrackFilesOnDisk As Boolean";
 //BA.debugLineNum = 299;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (_directoryexists(_gettracksdir())==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 300;BA.debugLine="Try";
try { //BA.debugLineNum = 301;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRec";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = _listtrackcachefilesrecursive();
 //BA.debugLineNum = 302;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 303;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group5 = _listedfiles;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_filename = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 304;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 305;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
if (_filename.endsWith(".tmp")) { 
if (true) continue;};
 //BA.debugLineNum = 306;BA.debugLine="Return True";
if (true) return __c.True;
 }
};
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 309;BA.debugLine="Trace(\"Не удалось проверить наличие track файлов";
_trace("Не удалось проверить наличие track файлов на диске. message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 311;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return false;
}
public boolean  _hashotvalidatedlocalmedia(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _trackid = "";
 //BA.debugLineNum = 726;BA.debugLine="Public Sub HasHotValidatedLocalMedia(item As Map)";
 //BA.debugLineNum = 727;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
if (_hasvalidatedlocalmedia(_item)==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 728;BA.debugLine="If item.IsInitialized = False Then Return False";
if (_item.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 729;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return __c.True;};
 //BA.debugLineNum = 730;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 731;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 732;BA.debugLine="Return GetTrackPlayCount(trackId) <= 0";
if (true) return _gettrackplaycount(_trackid)<=0;
 //BA.debugLineNum = 733;BA.debugLine="End Sub";
return false;
}
public boolean  _hastrackfilebyplaylist(String _trackid,String _playlistid) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Public Sub HasTrackFileByPlaylist(trackId As Strin";
 //BA.debugLineNum = 233;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 234;BA.debugLine="Return IsCachedFileUsable(GetTracksDir, BuildTrac";
if (true) return _iscachedfileusable(_gettracksdir(),_buildtrackcacherelativefilename(_trackid,_playlistid));
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return false;
}
public boolean  _hasvalidatedlocalmedia(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _itemid = "";
String _itemtype = "";
String _preferredrelativename = "";
 //BA.debugLineNum = 195;BA.debugLine="Public Sub HasValidatedLocalMedia(item As Map) As";
 //BA.debugLineNum = 196;BA.debugLine="If item.IsInitialized = False Then Return False";
if (_item.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 197;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 198;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 199;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 200;BA.debugLine="If itemType = \"ad\" Then Return ValidateIndexedFil";
if ((_itemtype).equals("ad")) { 
if (true) return _validateindexedfile("ad",_itemid);};
 //BA.debugLineNum = 201;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
 //BA.debugLineNum = 202;BA.debugLine="Dim preferredRelativeName As String = ResolveTra";
_preferredrelativename = _resolvetrackrelativefilenamefromitem(_item);
 //BA.debugLineNum = 203;BA.debugLine="If IsCachedFileUsable(GetTracksDir, preferredRel";
if (_iscachedfileusable(_gettracksdir(),_preferredrelativename)) { 
 //BA.debugLineNum = 204;BA.debugLine="EnsureTrackIndexEntry(itemId, item.GetDefault(\"";
_ensuretrackindexentry(_itemid,BA.ObjectToString(_item.GetDefault((Object)("playlist_id"),(Object)(""))),_preferredrelativename);
 //BA.debugLineNum = 205;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 207;BA.debugLine="Return ValidateIndexedFile(\"track\", itemId)";
if (true) return _validateindexedfile("track",_itemid);
 };
 //BA.debugLineNum = 209;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _storagedirvalue,b4a.example.keyvaluestore _storagevalue,Object _targetmodulevalue,String _tracesubnamevalue,String _deviceidvalue) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 56;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
 //BA.debugLineNum = 57;BA.debugLine="storageDir = storageDirValue";
_storagedir = _storagedirvalue;
 //BA.debugLineNum = 58;BA.debugLine="storage = storageValue";
_storage = _storagevalue;
 //BA.debugLineNum = 59;BA.debugLine="targetModule = targetModuleValue";
_targetmodule = _targetmodulevalue;
 //BA.debugLineNum = 60;BA.debugLine="traceSubName = traceSubNameValue";
_tracesubname = _tracesubnamevalue;
 //BA.debugLineNum = 61;BA.debugLine="playbackTempTrackIds.Initialize";
_playbacktemptrackids.Initialize();
 //BA.debugLineNum = 62;BA.debugLine="cachedTrackPlaylistStats.Initialize";
_cachedtrackplayliststats.Initialize();
 //BA.debugLineNum = 63;BA.debugLine="cachedAdIndexDirty = False";
_cachedadindexdirty = __c.False;
 //BA.debugLineNum = 64;BA.debugLine="cachedTrackIndexDirty = False";
_cachedtrackindexdirty = __c.False;
 //BA.debugLineNum = 65;BA.debugLine="EnsureDirectory(GetAdsDir)";
_ensuredirectory(_getadsdir());
 //BA.debugLineNum = 66;BA.debugLine="EnsureDirectory(GetTracksDir)";
_ensuredirectory(_gettracksdir());
 //BA.debugLineNum = 67;BA.debugLine="LoadIndexesFromStorage";
_loadindexesfromstorage();
 //BA.debugLineNum = 68;BA.debugLine="EnsureAndroidPlainTrackCacheFormat";
_ensureandroidplaintrackcacheformat();
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public boolean  _isadcached(String _adid) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Public Sub IsAdCached(adId As String) As Boolean";
 //BA.debugLineNum = 213;BA.debugLine="If adId = \"\" Then Return False";
if ((_adid).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 214;BA.debugLine="Return ValidateIndexedFile(\"ad\", adId)";
if (true) return _validateindexedfile("ad",_adid);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return false;
}
public boolean  _iscacheauditinprogress() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub IsCacheAuditInProgress As Boolean";
 //BA.debugLineNum = 72;BA.debugLine="Return cacheAuditInProgress";
if (true) return _cacheauditinprogress;
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return false;
}
public boolean  _iscachedfileusable(String _dir,String _filename) throws Exception{
String _filedir = "";
String _leafname = "";
 //BA.debugLineNum = 799;BA.debugLine="Private Sub IsCachedFileUsable(dir As String, file";
 //BA.debugLineNum = 800;BA.debugLine="If fileName = \"\" Then Return False";
if ((_filename).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 801;BA.debugLine="Dim fileDir As String = ResolveRelativeParentDir(";
_filedir = _resolverelativeparentdir(_dir,_filename);
 //BA.debugLineNum = 802;BA.debugLine="Dim leafName As String = ResolveRelativeLeafName(";
_leafname = _resolverelativeleafname(_filename);
 //BA.debugLineNum = 803;BA.debugLine="If File.Exists(fileDir, leafName) = False Then Re";
if (__c.File.Exists(_filedir,_leafname)==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 804;BA.debugLine="Try";
try { //BA.debugLineNum = 805;BA.debugLine="If File.Size(fileDir, leafName) > 0 Then Return";
if (__c.File.Size(_filedir,_leafname)>0) { 
if (true) return __c.True;};
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 807;BA.debugLine="Trace(\"ошибка кэша context=file_size message=\" &";
_trace("ошибка кэша context=file_size message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 809;BA.debugLine="DeleteFileIfExists(dir, fileName)";
_deletefileifexists(_dir,_filename);
 //BA.debugLineNum = 810;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 811;BA.debugLine="End Sub";
return false;
}
public boolean  _ismedianetworkfailure(String _errormessage) throws Exception{
String _text = "";
 //BA.debugLineNum = 1228;BA.debugLine="Private Sub IsMediaNetworkFailure(errorMessage As";
 //BA.debugLineNum = 1229;BA.debugLine="Dim text As String = errorMessage.ToLowerCase";
_text = _errormessage.toLowerCase();
 //BA.debugLineNum = 1230;BA.debugLine="If text.Contains(\"timed out\") Then Return True";
if (_text.contains("timed out")) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1231;BA.debugLine="If text.Contains(\"unknownhost\") Then Return True";
if (_text.contains("unknownhost")) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1232;BA.debugLine="If text.Contains(\"refused\") Then Return True";
if (_text.contains("refused")) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1233;BA.debugLine="If text.Contains(\"sslhandshakeexception\") Then Re";
if (_text.contains("sslhandshakeexception")) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1234;BA.debugLine="If text.Contains(\"pkix path building failed\") The";
if (_text.contains("pkix path building failed")) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1235;BA.debugLine="If text.Contains(\"unable to find valid certificat";
if (_text.contains("unable to find valid certification path")) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1236;BA.debugLine="If text.Contains(\"connectexception\") Then Return";
if (_text.contains("connectexception")) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1237;BA.debugLine="If text.Contains(\"socketexception\") Then Return T";
if (_text.contains("socketexception")) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1238;BA.debugLine="If text.Contains(\"sockettimeoutexception\") Then R";
if (_text.contains("sockettimeoutexception")) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1239;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 1240;BA.debugLine="End Sub";
return false;
}
public boolean  _istrackcached(String _trackid) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
 //BA.debugLineNum = 226;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 227;BA.debugLine="If ValidateIndexedFile(\"track\", trackId) Then Ret";
if (_validateindexedfile("track",_trackid)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 228;BA.debugLine="BackfillTrackIndexFromFiles";
_backfilltrackindexfromfiles();
 //BA.debugLineNum = 229;BA.debugLine="Return ValidateIndexedFile(\"track\", trackId)";
if (true) return _validateindexedfile("track",_trackid);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return false;
}
public String  _listtrackcachefilesinto(String _currentdir,String _relativeprefix,anywheresoftware.b4a.objects.collections.List _result) throws Exception{
anywheresoftware.b4a.objects.collections.List _listed = null;
String _name = "";
String _childrelative = "";
String _childpath = "";
 //BA.debugLineNum = 1716;BA.debugLine="Private Sub ListTrackCacheFilesInto(currentDir As";
 //BA.debugLineNum = 1717;BA.debugLine="Try";
try { //BA.debugLineNum = 1718;BA.debugLine="If DirectoryExists(currentDir) = False Then Retu";
if (_directoryexists(_currentdir)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1719;BA.debugLine="Dim listed As List = File.ListFiles(currentDir)";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_currentdir);
 //BA.debugLineNum = 1720;BA.debugLine="If listed.IsInitialized = False Then Return";
if (_listed.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1721;BA.debugLine="For Each name As String In listed";
{
final anywheresoftware.b4a.BA.IterableList group5 = _listed;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_name = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 1722;BA.debugLine="Dim childRelative As String";
_childrelative = "";
 //BA.debugLineNum = 1723;BA.debugLine="If relativePrefix = \"\" Then";
if ((_relativeprefix).equals("")) { 
 //BA.debugLineNum = 1724;BA.debugLine="childRelative = name";
_childrelative = _name;
 }else {
 //BA.debugLineNum = 1726;BA.debugLine="childRelative = File.Combine(relativePrefix, n";
_childrelative = __c.File.Combine(_relativeprefix,_name);
 };
 //BA.debugLineNum = 1728;BA.debugLine="Dim childPath As String = File.Combine(currentD";
_childpath = __c.File.Combine(_currentdir,_name);
 //BA.debugLineNum = 1729;BA.debugLine="If File.IsDirectory(currentDir, name) Then";
if (__c.File.IsDirectory(_currentdir,_name)) { 
 //BA.debugLineNum = 1730;BA.debugLine="ListTrackCacheFilesInto(childPath, childRelati";
_listtrackcachefilesinto(_childpath,_childrelative,_result);
 }else {
 //BA.debugLineNum = 1732;BA.debugLine="result.Add(childRelative)";
_result.Add((Object)(_childrelative));
 };
 }
};
 } 
       catch (Exception e20) {
			ba.setLastException(e20); //BA.debugLineNum = 1736;BA.debugLine="Trace(\"Не удалось получить список track cache фа";
_trace("Не удалось получить список track cache файлов. dir="+_currentdir+", message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 1738;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _listtrackcachefilesrecursive() throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
 //BA.debugLineNum = 1709;BA.debugLine="Private Sub ListTrackCacheFilesRecursive As List";
 //BA.debugLineNum = 1710;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1711;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 1712;BA.debugLine="ListTrackCacheFilesInto(GetTracksDir, \"\", result)";
_listtrackcachefilesinto(_gettracksdir(),"",_result);
 //BA.debugLineNum = 1713;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 1714;BA.debugLine="End Sub";
return null;
}
public String  _loadcachestatssnapshot() throws Exception{
 //BA.debugLineNum = 1866;BA.debugLine="Private Sub LoadCacheStatsSnapshot";
 //BA.debugLineNum = 1867;BA.debugLine="cachedTrackCount = storage.GetDefault(\"cache_stat";
_cachedtrackcount = (int)(BA.ObjectToNumber(_storage._getdefault /*Object*/ ("cache_stats_track_count",(Object)(0))));
 //BA.debugLineNum = 1868;BA.debugLine="cachedAdCount = storage.GetDefault(\"cache_stats_a";
_cachedadcount = (int)(BA.ObjectToNumber(_storage._getdefault /*Object*/ ("cache_stats_ad_count",(Object)(0))));
 //BA.debugLineNum = 1869;BA.debugLine="cachedTrackBytes = ToLongDefault(storage.GetDefau";
_cachedtrackbytes = _tolongdefault(_storage._getdefault /*Object*/ ("cache_stats_track_bytes",(Object)(0)),(long) (0));
 //BA.debugLineNum = 1870;BA.debugLine="cachedAdBytes = ToLongDefault(storage.GetDefault(";
_cachedadbytes = _tolongdefault(_storage._getdefault /*Object*/ ("cache_stats_ad_bytes",(Object)(0)),(long) (0));
 //BA.debugLineNum = 1871;BA.debugLine="cachedTrackPlaylistStats = storage.GetDefault(\"ca";
_cachedtrackplayliststats = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ ("cache_stats_track_playlist",__c.Null)));
 //BA.debugLineNum = 1872;BA.debugLine="If cachedTrackPlaylistStats.IsInitialized = False";
if (_cachedtrackplayliststats.IsInitialized()==__c.False) { 
_cachedtrackplayliststats.Initialize();};
 //BA.debugLineNum = 1873;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadglobaltrackfilemap(anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptymap = null;
String _cachekey = "";
anywheresoftware.b4a.objects.collections.Map _result = null;
String _playlistsdir = "";
anywheresoftware.b4a.objects.collections.List _listed = null;
String _filename = "";
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _playlisttrackmap = null;
String _relativename = "";
 //BA.debugLineNum = 1450;BA.debugLine="Private Sub LoadGlobalTrackFileMap(playlistTrackMa";
 //BA.debugLineNum = 1451;BA.debugLine="Dim emptyMap As Map";
_emptymap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1452;BA.debugLine="emptyMap.Initialize";
_emptymap.Initialize();
 //BA.debugLineNum = 1453;BA.debugLine="Dim cacheKey As String = \"__global_track_file_map";
_cachekey = "__global_track_file_map__";
 //BA.debugLineNum = 1454;BA.debugLine="If playlistTrackMaps.ContainsKey(cacheKey) Then R";
if (_playlisttrackmaps.ContainsKey((Object)(_cachekey))) { 
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlisttrackmaps.Get((Object)(_cachekey))));};
 //BA.debugLineNum = 1455;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1456;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 1457;BA.debugLine="Dim playlistsDir As String = File.Combine(storage";
_playlistsdir = __c.File.Combine(_storagedir,"playlists");
 //BA.debugLineNum = 1458;BA.debugLine="If DirectoryExists(playlistsDir) = False Then";
if (_directoryexists(_playlistsdir)==__c.False) { 
 //BA.debugLineNum = 1459;BA.debugLine="playlistTrackMaps.Put(cacheKey, result)";
_playlisttrackmaps.Put((Object)(_cachekey),(Object)(_result.getObject()));
 //BA.debugLineNum = 1460;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 1462;BA.debugLine="Try";
try { //BA.debugLineNum = 1463;BA.debugLine="Dim listed As List = File.ListFiles(playlistsDir";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_playlistsdir);
 //BA.debugLineNum = 1464;BA.debugLine="If listed.IsInitialized Then";
if (_listed.IsInitialized()) { 
 //BA.debugLineNum = 1465;BA.debugLine="For Each fileName As String In listed";
{
final anywheresoftware.b4a.BA.IterableList group15 = _listed;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_filename = BA.ObjectToString(group15.Get(index15));
 //BA.debugLineNum = 1466;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 1467;BA.debugLine="If fileName.ToLowerCase.EndsWith(\".json\") = Fa";
if (_filename.toLowerCase().endsWith(".json")==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1468;BA.debugLine="Dim playlistId As String = fileName.SubString2";
_playlistid = _filename.substring((int) (0),(int) (_filename.length()-5));
 //BA.debugLineNum = 1469;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 1470;BA.debugLine="Dim playlistTrackMap As Map = LoadPlaylistTrac";
_playlisttrackmap = new anywheresoftware.b4a.objects.collections.Map();
_playlisttrackmap = _loadplaylisttrackfilemap(_playlistid,_playlisttrackmaps);
 //BA.debugLineNum = 1471;BA.debugLine="If playlistTrackMap.IsInitialized = False Then";
if (_playlisttrackmap.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1472;BA.debugLine="For Each relativeName As String In playlistTra";
{
final anywheresoftware.b4a.BA.IterableList group22 = _playlisttrackmap.Keys();
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_relativename = BA.ObjectToString(group22.Get(index22));
 //BA.debugLineNum = 1473;BA.debugLine="If result.ContainsKey(relativeName) Then Cont";
if (_result.ContainsKey((Object)(_relativename))) { 
if (true) continue;};
 //BA.debugLineNum = 1474;BA.debugLine="result.Put(relativeName, playlistTrackMap.Get";
_result.Put((Object)(_relativename),_playlisttrackmap.Get((Object)(_relativename)));
 }
};
 }
};
 };
 } 
       catch (Exception e29) {
			ba.setLastException(e29); //BA.debugLineNum = 1479;BA.debugLine="Trace(\"Не удалось восстановить глобальную track";
_trace("Не удалось восстановить глобальную track map по playlist metadata. message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 1481;BA.debugLine="playlistTrackMaps.Put(cacheKey, result)";
_playlisttrackmaps.Put((Object)(_cachekey),(Object)(_result.getObject()));
 //BA.debugLineNum = 1482;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 1483;BA.debugLine="End Sub";
return null;
}
public String  _loadindexesfromstorage() throws Exception{
 //BA.debugLineNum = 735;BA.debugLine="Private Sub LoadIndexesFromStorage";
 //BA.debugLineNum = 736;BA.debugLine="cachedAdIndex = storage.GetDefault(\"cached_ad_ind";
_cachedadindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ ("cached_ad_index",__c.Null)));
 //BA.debugLineNum = 737;BA.debugLine="If cachedAdIndex.IsInitialized = False Then cache";
if (_cachedadindex.IsInitialized()==__c.False) { 
_cachedadindex.Initialize();};
 //BA.debugLineNum = 738;BA.debugLine="cachedTrackIndex = storage.GetDefault(\"cached_tra";
_cachedtrackindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ ("cached_track_index",__c.Null)));
 //BA.debugLineNum = 739;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
if (_cachedtrackindex.IsInitialized()==__c.False) { 
_cachedtrackindex.Initialize();};
 //BA.debugLineNum = 740;BA.debugLine="LoadCacheStatsSnapshot";
_loadcachestatssnapshot();
 //BA.debugLineNum = 741;BA.debugLine="MigrateLegacyTrackCacheLayout";
_migratelegacytrackcachelayout();
 //BA.debugLineNum = 742;BA.debugLine="NormalizeTrackIndexFileNames(cachedTrackIndex)";
_normalizetrackindexfilenames(_cachedtrackindex);
 //BA.debugLineNum = 743;BA.debugLine="BackfillTrackIndexFromFiles";
_backfilltrackindexfromfiles();
 //BA.debugLineNum = 744;BA.debugLine="RebuildCacheStatsFromIndexes";
_rebuildcachestatsfromindexes();
 //BA.debugLineNum = 745;BA.debugLine="SaveCacheStatsSnapshot";
_savecachestatssnapshot();
 //BA.debugLineNum = 746;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadplaylisttrackfilemap(String _playlistid,anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptymap = null;
anywheresoftware.b4a.objects.collections.Map _result = null;
String _playlistsdir = "";
String _metadatafilename = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
anywheresoftware.b4a.objects.collections.List _tracks = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
 //BA.debugLineNum = 1616;BA.debugLine="Private Sub LoadPlaylistTrackFileMap(playlistId As";
 //BA.debugLineNum = 1617;BA.debugLine="Dim emptyMap As Map";
_emptymap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1618;BA.debugLine="emptyMap.Initialize";
_emptymap.Initialize();
 //BA.debugLineNum = 1619;BA.debugLine="If playlistId = \"\" Then Return emptyMap";
if ((_playlistid).equals("")) { 
if (true) return _emptymap;};
 //BA.debugLineNum = 1620;BA.debugLine="If playlistTrackMaps.ContainsKey(playlistId) Then";
if (_playlisttrackmaps.ContainsKey((Object)(_playlistid))) { 
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlisttrackmaps.Get((Object)(_playlistid))));};
 //BA.debugLineNum = 1621;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1622;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 1623;BA.debugLine="Dim playlistsDir As String = File.Combine(storage";
_playlistsdir = __c.File.Combine(_storagedir,"playlists");
 //BA.debugLineNum = 1624;BA.debugLine="Dim metadataFileName As String = playlistId & \".j";
_metadatafilename = _playlistid+".json";
 //BA.debugLineNum = 1625;BA.debugLine="If File.Exists(playlistsDir, metadataFileName) =";
if (__c.File.Exists(_playlistsdir,_metadatafilename)==__c.False) { 
 //BA.debugLineNum = 1626;BA.debugLine="playlistTrackMaps.Put(playlistId, result)";
_playlisttrackmaps.Put((Object)(_playlistid),(Object)(_result.getObject()));
 //BA.debugLineNum = 1627;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 1629;BA.debugLine="Try";
try { //BA.debugLineNum = 1630;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 1631;BA.debugLine="parser.Initialize(File.ReadString(playlistsDir,";
_parser.Initialize(__c.File.ReadString(_playlistsdir,_metadatafilename));
 //BA.debugLineNum = 1632;BA.debugLine="Dim playlistData As Map = parser.NextObject";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = _parser.NextObject();
 //BA.debugLineNum = 1633;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tr";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
 //BA.debugLineNum = 1634;BA.debugLine="If tracks.IsInitialized Then";
if (_tracks.IsInitialized()) { 
 //BA.debugLineNum = 1635;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group19 = _tracks;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_trackobject = group19.Get(index19);
 //BA.debugLineNum = 1636;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1637;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
 //BA.debugLineNum = 1638;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 1639;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 1640;BA.debugLine="result.Put(BuildTrackCacheRelativeFileName(tra";
_result.Put((Object)(_buildtrackcacherelativefilename(_trackid,_playlistid)),(Object)(_trackid));
 }
};
 };
 } 
       catch (Exception e28) {
			ba.setLastException(e28); //BA.debugLineNum = 1644;BA.debugLine="Trace(\"Не удалось восстановить track map по play";
_trace("Не удалось восстановить track map по playlist metadata. playlistId="+_playlistid+", message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 1646;BA.debugLine="playlistTrackMaps.Put(playlistId, result)";
_playlisttrackmaps.Put((Object)(_playlistid),(Object)(_result.getObject()));
 //BA.debugLineNum = 1647;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 1648;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _loadplaylisttrackidmap(String _playlistid,anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptymap = null;
String _cachekey = "";
anywheresoftware.b4a.objects.collections.Map _result = null;
String _playlistsdir = "";
String _metadatafilename = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
anywheresoftware.b4a.objects.collections.List _tracks = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
 //BA.debugLineNum = 1581;BA.debugLine="Private Sub LoadPlaylistTrackIdMap(playlistId As S";
 //BA.debugLineNum = 1582;BA.debugLine="Dim emptyMap As Map";
_emptymap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1583;BA.debugLine="emptyMap.Initialize";
_emptymap.Initialize();
 //BA.debugLineNum = 1584;BA.debugLine="If playlistId = \"\" Then Return emptyMap";
if ((_playlistid).equals("")) { 
if (true) return _emptymap;};
 //BA.debugLineNum = 1585;BA.debugLine="Dim cacheKey As String = \"ids:\" & playlistId";
_cachekey = "ids:"+_playlistid;
 //BA.debugLineNum = 1586;BA.debugLine="If playlistTrackMaps.ContainsKey(cacheKey) Then R";
if (_playlisttrackmaps.ContainsKey((Object)(_cachekey))) { 
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlisttrackmaps.Get((Object)(_cachekey))));};
 //BA.debugLineNum = 1587;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1588;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 1589;BA.debugLine="Dim playlistsDir As String = File.Combine(storage";
_playlistsdir = __c.File.Combine(_storagedir,"playlists");
 //BA.debugLineNum = 1590;BA.debugLine="Dim metadataFileName As String = playlistId & \".j";
_metadatafilename = _playlistid+".json";
 //BA.debugLineNum = 1591;BA.debugLine="If File.Exists(playlistsDir, metadataFileName) =";
if (__c.File.Exists(_playlistsdir,_metadatafilename)==__c.False) { 
 //BA.debugLineNum = 1592;BA.debugLine="playlistTrackMaps.Put(cacheKey, result)";
_playlisttrackmaps.Put((Object)(_cachekey),(Object)(_result.getObject()));
 //BA.debugLineNum = 1593;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 1595;BA.debugLine="Try";
try { //BA.debugLineNum = 1596;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 1597;BA.debugLine="parser.Initialize(File.ReadString(playlistsDir,";
_parser.Initialize(__c.File.ReadString(_playlistsdir,_metadatafilename));
 //BA.debugLineNum = 1598;BA.debugLine="Dim playlistData As Map = parser.NextObject";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = _parser.NextObject();
 //BA.debugLineNum = 1599;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tr";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
 //BA.debugLineNum = 1600;BA.debugLine="If tracks.IsInitialized Then";
if (_tracks.IsInitialized()) { 
 //BA.debugLineNum = 1601;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group20 = _tracks;
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_trackobject = group20.Get(index20);
 //BA.debugLineNum = 1602;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1603;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
 //BA.debugLineNum = 1604;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 1605;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 1606;BA.debugLine="result.Put(trackId, True)";
_result.Put((Object)(_trackid),(Object)(__c.True));
 }
};
 };
 } 
       catch (Exception e29) {
			ba.setLastException(e29); //BA.debugLineNum = 1610;BA.debugLine="Trace(\"Не удалось восстановить track id map по p";
_trace("Не удалось восстановить track id map по playlist metadata. playlistId="+_playlistid+", message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 1612;BA.debugLine="playlistTrackMaps.Put(cacheKey, result)";
_playlisttrackmaps.Put((Object)(_cachekey),(Object)(_result.getObject()));
 //BA.debugLineNum = 1613;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 1614;BA.debugLine="End Sub";
return null;
}
public String  _markauditindexchanged(String _itemtype) throws Exception{
 //BA.debugLineNum = 1379;BA.debugLine="Private Sub MarkAuditIndexChanged(itemType As Stri";
 //BA.debugLineNum = 1380;BA.debugLine="If itemType = \"ads\" Then";
if ((_itemtype).equals("ads")) { 
 //BA.debugLineNum = 1381;BA.debugLine="cacheAuditAdIndexChanged = True";
_cacheauditadindexchanged = __c.True;
 //BA.debugLineNum = 1382;BA.debugLine="cachedAdIndexDirty = True";
_cachedadindexdirty = __c.True;
 }else {
 //BA.debugLineNum = 1384;BA.debugLine="cacheAuditTrackIndexChanged = True";
_cacheaudittrackindexchanged = __c.True;
 //BA.debugLineNum = 1385;BA.debugLine="cachedTrackIndexDirty = True";
_cachedtrackindexdirty = __c.True;
 };
 //BA.debugLineNum = 1387;BA.debugLine="End Sub";
return "";
}
public long  _mbtobytes(long _valuemb) throws Exception{
 //BA.debugLineNum = 1949;BA.debugLine="Private Sub MbToBytes(valueMb As Long) As Long";
 //BA.debugLineNum = 1950;BA.debugLine="Return valueMb * 1024 * 1024";
if (true) return (long) (_valuemb*1024*1024);
 //BA.debugLineNum = 1951;BA.debugLine="End Sub";
return 0L;
}
public String  _migratelegacytrackcachelayout() throws Exception{
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
int _migratedcount = 0;
String _relativefilename = "";
String _flatfilename = "";
 //BA.debugLineNum = 948;BA.debugLine="Private Sub MigrateLegacyTrackCacheLayout";
 //BA.debugLineNum = 949;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (_directoryexists(_gettracksdir())==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 950;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRecu";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = _listtrackcachefilesrecursive();
 //BA.debugLineNum = 951;BA.debugLine="If listedFiles.IsInitialized = False Or listedFil";
if (_listedfiles.IsInitialized()==__c.False || _listedfiles.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 952;BA.debugLine="Dim migratedCount As Int = 0";
_migratedcount = (int) (0);
 //BA.debugLineNum = 953;BA.debugLine="For Each relativeFileName As String In listedFile";
{
final anywheresoftware.b4a.BA.IterableList group5 = _listedfiles;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_relativefilename = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 954;BA.debugLine="If relativeFileName = \"\" Or relativeFileName.End";
if ((_relativefilename).equals("") || _relativefilename.endsWith(".tmp")) { 
if (true) continue;};
 //BA.debugLineNum = 955;BA.debugLine="If relativeFileName.Contains(\"/\") = False And re";
if (_relativefilename.contains("/")==__c.False && _relativefilename.contains("\\")==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 956;BA.debugLine="Dim flatFileName As String = ResolveRelativeLeaf";
_flatfilename = _resolverelativeleafname(_relativefilename);
 //BA.debugLineNum = 957;BA.debugLine="If flatFileName = \"\" Then Continue";
if ((_flatfilename).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 958;BA.debugLine="If MoveLegacyTrackFileToFlat(relativeFileName, f";
if (_movelegacytrackfiletoflat(_relativefilename,_flatfilename)) { 
_migratedcount = (int) (_migratedcount+1);};
 }
};
 //BA.debugLineNum = 960;BA.debugLine="If migratedCount > 0 Then";
if (_migratedcount>0) { 
 //BA.debugLineNum = 961;BA.debugLine="Trace(\"Миграция кэша треков в плоскую структуру";
_trace("Миграция кэша треков в плоскую структуру завершена. moved="+BA.NumberToString(_migratedcount));
 };
 //BA.debugLineNum = 963;BA.debugLine="CleanupLegacyTrackSubdirs";
_cleanuplegacytracksubdirs();
 //BA.debugLineNum = 964;BA.debugLine="End Sub";
return "";
}
public boolean  _movelegacytrackfiletoflat(String _sourcerelativename,String _flatfilename) throws Exception{
String _sourcedir = "";
String _sourceleaf = "";
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outputstream = null;
 //BA.debugLineNum = 966;BA.debugLine="Private Sub MoveLegacyTrackFileToFlat(sourceRelati";
 //BA.debugLineNum = 967;BA.debugLine="If sourceRelativeName = \"\" Or flatFileName = \"\" T";
if ((_sourcerelativename).equals("") || (_flatfilename).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 968;BA.debugLine="If IsCachedFileUsable(GetTracksDir, sourceRelativ";
if (_iscachedfileusable(_gettracksdir(),_sourcerelativename)==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 969;BA.debugLine="If IsCachedFileUsable(GetTracksDir, flatFileName)";
if (_iscachedfileusable(_gettracksdir(),_flatfilename)) { 
 //BA.debugLineNum = 970;BA.debugLine="DeleteFileIfExists(GetTracksDir, sourceRelativeN";
_deletefileifexists(_gettracksdir(),_sourcerelativename);
 //BA.debugLineNum = 971;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 973;BA.debugLine="Dim sourceDir As String = ResolveRelativeParentDi";
_sourcedir = _resolverelativeparentdir(_gettracksdir(),_sourcerelativename);
 //BA.debugLineNum = 974;BA.debugLine="Dim sourceLeaf As String = ResolveRelativeLeafNam";
_sourceleaf = _resolverelativeleafname(_sourcerelativename);
 //BA.debugLineNum = 975;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 976;BA.debugLine="Dim outputStream As OutputStream";
_outputstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 977;BA.debugLine="Try";
try { //BA.debugLineNum = 978;BA.debugLine="inputStream = File.OpenInput(sourceDir, sourceLe";
_inputstream = __c.File.OpenInput(_sourcedir,_sourceleaf);
 //BA.debugLineNum = 979;BA.debugLine="outputStream = File.OpenOutput(GetTracksDir, fla";
_outputstream = __c.File.OpenOutput(_gettracksdir(),_flatfilename,__c.False);
 //BA.debugLineNum = 980;BA.debugLine="File.Copy2(inputStream, outputStream)";
__c.File.Copy2((java.io.InputStream)(_inputstream.getObject()),(java.io.OutputStream)(_outputstream.getObject()));
 //BA.debugLineNum = 981;BA.debugLine="outputStream.Close";
_outputstream.Close();
 //BA.debugLineNum = 982;BA.debugLine="inputStream.Close";
_inputstream.Close();
 //BA.debugLineNum = 983;BA.debugLine="If IsCachedFileUsable(GetTracksDir, flatFileName";
if (_iscachedfileusable(_gettracksdir(),_flatfilename)==__c.False) { 
 //BA.debugLineNum = 984;BA.debugLine="DeleteFileIfExists(GetTracksDir, flatFileName)";
_deletefileifexists(_gettracksdir(),_flatfilename);
 //BA.debugLineNum = 985;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 987;BA.debugLine="DeleteFileIfExists(GetTracksDir, sourceRelativeN";
_deletefileifexists(_gettracksdir(),_sourcerelativename);
 //BA.debugLineNum = 988;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e24) {
			ba.setLastException(e24); //BA.debugLineNum = 990;BA.debugLine="Try";
try { //BA.debugLineNum = 991;BA.debugLine="If outputStream.IsInitialized Then outputStream";
if (_outputstream.IsInitialized()) { 
_outputstream.Close();};
 } 
       catch (Exception e27) {
			ba.setLastException(e27); //BA.debugLineNum = 993;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("346399515",__c.LastException(getActivityBA()).getMessage(),0);
 };
 //BA.debugLineNum = 995;BA.debugLine="Try";
try { //BA.debugLineNum = 996;BA.debugLine="If inputStream.IsInitialized Then inputStream.C";
if (_inputstream.IsInitialized()) { 
_inputstream.Close();};
 } 
       catch (Exception e32) {
			ba.setLastException(e32); //BA.debugLineNum = 998;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("346399520",__c.LastException(getActivityBA()).getMessage(),0);
 };
 //BA.debugLineNum = 1000;BA.debugLine="DeleteFileIfExists(GetTracksDir, flatFileName)";
_deletefileifexists(_gettracksdir(),_flatfilename);
 //BA.debugLineNum = 1001;BA.debugLine="Trace(\"Не удалось переместить legacy track cache";
_trace("Не удалось переместить legacy track cache файл. source="+_sourcerelativename+", message="+__c.LastException(getActivityBA()).getMessage());
 //BA.debugLineNum = 1002;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 1004;BA.debugLine="End Sub";
return false;
}
public String  _normalizetrackindexfilenames(anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
boolean _changed = false;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _playlistid = "";
String _canonicalfilename = "";
String _storedfilename = "";
 //BA.debugLineNum = 1485;BA.debugLine="Private Sub NormalizeTrackIndexFileNames(trackInde";
 //BA.debugLineNum = 1486;BA.debugLine="If trackIndex.IsInitialized = False Then Return";
if (_trackindex.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1487;BA.debugLine="Dim changed As Boolean = False";
_changed = __c.False;
 //BA.debugLineNum = 1488;BA.debugLine="For Each trackId As String In trackIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _trackindex.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_trackid = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1489;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
 //BA.debugLineNum = 1490;BA.debugLine="If entry.IsInitialized = False Then Continue";
if (_entry.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1491;BA.debugLine="Dim playlistId As String = entry.GetDefault(\"pla";
_playlistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));
 //BA.debugLineNum = 1492;BA.debugLine="Dim canonicalFileName As String = BuildTrackCach";
_canonicalfilename = _buildtrackcacherelativefilename(_trackid,_playlistid);
 //BA.debugLineNum = 1493;BA.debugLine="Dim storedFileName As String = entry.GetDefault(";
_storedfilename = BA.ObjectToString(_entry.GetDefault((Object)("file_name"),(Object)("")));
 //BA.debugLineNum = 1494;BA.debugLine="If storedFileName = canonicalFileName Then Conti";
if ((_storedfilename).equals(_canonicalfilename)) { 
if (true) continue;};
 //BA.debugLineNum = 1495;BA.debugLine="If IsCachedFileUsable(GetTracksDir, canonicalFil";
if (_iscachedfileusable(_gettracksdir(),_canonicalfilename)) { 
 //BA.debugLineNum = 1496;BA.debugLine="entry.Put(\"file_name\", canonicalFileName)";
_entry.Put((Object)("file_name"),(Object)(_canonicalfilename));
 //BA.debugLineNum = 1497;BA.debugLine="entry.Put(\"size_bytes\", GetFileSizeSafe(GetTrac";
_entry.Put((Object)("size_bytes"),(Object)(_getfilesizesafe(_gettracksdir(),_canonicalfilename)));
 //BA.debugLineNum = 1498;BA.debugLine="trackIndex.Put(trackId, entry)";
_trackindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
 //BA.debugLineNum = 1499;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
 //BA.debugLineNum = 1502;BA.debugLine="If changed Then SaveTrackIndex";
if (_changed) { 
_savetrackindex();};
 //BA.debugLineNum = 1503;BA.debugLine="End Sub";
return "";
}
public boolean  _preparenextcacheaudittype() throws Exception{
String _auditdir = "";
 //BA.debugLineNum = 1264;BA.debugLine="Private Sub PrepareNextCacheAuditType As Boolean";
 //BA.debugLineNum = 1265;BA.debugLine="If cacheAuditPendingTypes.IsInitialized = False O";
if (_cacheauditpendingtypes.IsInitialized()==__c.False || _cacheauditpendingtypes.getSize()==0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1266;BA.debugLine="cacheAuditCurrentType = cacheAuditPendingTypes.Ge";
_cacheauditcurrenttype = BA.ObjectToString(_cacheauditpendingtypes.Get((int) (0)));
 //BA.debugLineNum = 1267;BA.debugLine="cacheAuditPendingTypes.RemoveAt(0)";
_cacheauditpendingtypes.RemoveAt((int) (0));
 //BA.debugLineNum = 1268;BA.debugLine="cacheAuditCurrentPosition = 0";
_cacheauditcurrentposition = (int) (0);
 //BA.debugLineNum = 1269;BA.debugLine="cacheAuditSeenIds.Initialize";
_cacheauditseenids.Initialize();
 //BA.debugLineNum = 1270;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
_cacheauditcurrentfilenames.Initialize();
 //BA.debugLineNum = 1271;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = _getauditdirbytype(_cacheauditcurrenttype);
 //BA.debugLineNum = 1272;BA.debugLine="Try";
try { //BA.debugLineNum = 1273;BA.debugLine="If DirectoryExists(auditDir) Then";
if (_directoryexists(_auditdir)) { 
 //BA.debugLineNum = 1274;BA.debugLine="cacheAuditListingDir = auditDir";
_cacheauditlistingdir = _auditdir;
 //BA.debugLineNum = 1275;BA.debugLine="cacheAuditListingInProgress = True";
_cacheauditlistinginprogress = __c.True;
 //BA.debugLineNum = 1276;BA.debugLine="StartCacheAuditFileListingAsync";
_startcacheauditfilelistingasync();
 };
 } 
       catch (Exception e15) {
			ba.setLastException(e15); //BA.debugLineNum = 1279;BA.debugLine="Trace(\"Не удалось получить список файлов для ауд";
_trace("Не удалось получить список файлов для аудита кэша. type="+_cacheauditcurrenttype+", message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 1281;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 1282;BA.debugLine="End Sub";
return false;
}
public String  _processcurrentcacheauditbatch() throws Exception{
String _auditdir = "";
anywheresoftware.b4a.objects.collections.Map _auditindex = null;
int _i = 0;
String _filename = "";
String _trackid = "";
 //BA.debugLineNum = 1303;BA.debugLine="Private Sub ProcessCurrentCacheAuditBatch";
 //BA.debugLineNum = 1304;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = _getauditdirbytype(_cacheauditcurrenttype);
 //BA.debugLineNum = 1305;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = _getauditindexbytype(_cacheauditcurrenttype);
 //BA.debugLineNum = 1306;BA.debugLine="For i = 1 To CACHE_AUDIT_BATCH_SIZE";
{
final int step3 = 1;
final int limit3 = _cache_audit_batch_size;
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 1307;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurren";
if (_cacheauditcurrentposition>=_cacheauditcurrentfilenames.getSize()) { 
if (true) break;};
 //BA.debugLineNum = 1308;BA.debugLine="Dim fileName As String = cacheAuditCurrentFileNa";
_filename = BA.ObjectToString(_cacheauditcurrentfilenames.Get(_cacheauditcurrentposition));
 //BA.debugLineNum = 1309;BA.debugLine="cacheAuditCurrentPosition = cacheAuditCurrentPos";
_cacheauditcurrentposition = (int) (_cacheauditcurrentposition+1);
 //BA.debugLineNum = 1310;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 1311;BA.debugLine="If File.IsDirectory(auditDir, fileName) Then Con";
if (__c.File.IsDirectory(_auditdir,_filename)) { 
if (true) continue;};
 //BA.debugLineNum = 1312;BA.debugLine="If fileName.EndsWith(\".tmp\") Then";
if (_filename.endsWith(".tmp")) { 
 //BA.debugLineNum = 1313;BA.debugLine="DeleteFileIfExists(auditDir, fileName)";
_deletefileifexists(_auditdir,_filename);
 //BA.debugLineNum = 1314;BA.debugLine="cacheAuditTempDeletedCount = cacheAuditTempDele";
_cacheaudittempdeletedcount = (int) (_cacheaudittempdeletedcount+1);
 //BA.debugLineNum = 1315;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
_markauditindexchanged(_cacheauditcurrenttype);
 //BA.debugLineNum = 1316;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 1318;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
if (_iscachedfileusable(_auditdir,_filename)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1319;BA.debugLine="If cacheAuditCurrentType = \"tracks\" Then";
if ((_cacheauditcurrenttype).equals("tracks")) { 
 //BA.debugLineNum = 1320;BA.debugLine="Dim trackId As String = FindTrackIdByFileName(f";
_trackid = _findtrackidbyfilename(_filename,_auditindex);
 //BA.debugLineNum = 1321;BA.debugLine="If trackId = \"\" Then";
if ((_trackid).equals("")) { 
 //BA.debugLineNum = 1324;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 1326;BA.debugLine="cacheAuditSeenIds.Put(trackId, True)";
_cacheauditseenids.Put((Object)(_trackid),(Object)(__c.True));
 }else {
 //BA.debugLineNum = 1328;BA.debugLine="cacheAuditSeenIds.Put(fileName, True)";
_cacheauditseenids.Put((Object)(_filename),(Object)(__c.True));
 //BA.debugLineNum = 1329;BA.debugLine="If auditIndex.ContainsKey(fileName) = False The";
if (_auditindex.ContainsKey((Object)(_filename))==__c.False) { 
 //BA.debugLineNum = 1330;BA.debugLine="AddIndexedFileFromAudit(cacheAuditCurrentType,";
_addindexedfilefromaudit(_cacheauditcurrenttype,_filename,_auditindex);
 //BA.debugLineNum = 1331;BA.debugLine="cacheAuditAddedCount = cacheAuditAddedCount +";
_cacheauditaddedcount = (int) (_cacheauditaddedcount+1);
 };
 };
 }
};
 //BA.debugLineNum = 1335;BA.debugLine="End Sub";
return "";
}
public int  _prunemissingads(anywheresoftware.b4a.objects.collections.Map _adindex,anywheresoftware.b4a.objects.collections.Map _actualadids) throws Exception{
int _removedcount = 0;
anywheresoftware.b4a.objects.collections.List _idstoremove = null;
String _adid = "";
 //BA.debugLineNum = 611;BA.debugLine="Private Sub PruneMissingAds(adIndex As Map, actual";
 //BA.debugLineNum = 612;BA.debugLine="Dim removedCount As Int = 0";
_removedcount = (int) (0);
 //BA.debugLineNum = 613;BA.debugLine="Dim idsToRemove As List";
_idstoremove = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 614;BA.debugLine="idsToRemove.Initialize";
_idstoremove.Initialize();
 //BA.debugLineNum = 615;BA.debugLine="For Each adId As String In adIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _adindex.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_adid = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 616;BA.debugLine="If actualAdIds.ContainsKey(adId) = False Then id";
if (_actualadids.ContainsKey((Object)(_adid))==__c.False) { 
_idstoremove.Add((Object)(_adid));};
 }
};
 //BA.debugLineNum = 618;BA.debugLine="For Each adId As String In idsToRemove";
{
final anywheresoftware.b4a.BA.IterableList group7 = _idstoremove;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_adid = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 619;BA.debugLine="DeleteFileIfExists(GetAdsDir, adId)";
_deletefileifexists(_getadsdir(),_adid);
 //BA.debugLineNum = 620;BA.debugLine="adIndex.Remove(adId)";
_adindex.Remove((Object)(_adid));
 //BA.debugLineNum = 621;BA.debugLine="removedCount = removedCount + 1";
_removedcount = (int) (_removedcount+1);
 //BA.debugLineNum = 622;BA.debugLine="cachedAdIndexDirty = True";
_cachedadindexdirty = __c.True;
 //BA.debugLineNum = 623;BA.debugLine="Trace(\"Удален cached ad, отсутствующий в актуаль";
_trace("Удален cached ad, отсутствующий в актуальном data. id="+_adid);
 }
};
 //BA.debugLineNum = 625;BA.debugLine="Return removedCount";
if (true) return _removedcount;
 //BA.debugLineNum = 626;BA.debugLine="End Sub";
return 0;
}
public int  _prunetrackcacheifneeded(anywheresoftware.b4a.objects.collections.List _protectedtrackids,anywheresoftware.b4a.objects.collections.List _relevanttrackids) throws Exception{
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
 //BA.debugLineNum = 382;BA.debugLine="Public Sub PruneTrackCacheIfNeeded(protectedTrackI";
 //BA.debugLineNum = 383;BA.debugLine="Dim protectedIds As Map = CreateTrackIdSet(protec";
_protectedids = new anywheresoftware.b4a.objects.collections.Map();
_protectedids = _createtrackidset(_protectedtrackids);
 //BA.debugLineNum = 384;BA.debugLine="Dim relevantIds As Map = CreateTrackIdSet(relevan";
_relevantids = new anywheresoftware.b4a.objects.collections.Map();
_relevantids = _createtrackidset(_relevanttrackids);
 //BA.debugLineNum = 385;BA.debugLine="Dim summary As Map = BuildTrackCacheSummary(prote";
_summary = new anywheresoftware.b4a.objects.collections.Map();
_summary = _buildtrackcachesummary(_protectedids,_relevantids);
 //BA.debugLineNum = 386;BA.debugLine="Dim cacheBytes As Long = summary.GetDefault(\"cach";
_cachebytes = BA.ObjectToLongNumber(_summary.GetDefault((Object)("cache_bytes"),(Object)(0)));
 //BA.debugLineNum = 387;BA.debugLine="Dim freeBytes As Long = GetDriveUsableSpace(stora";
_freebytes = _getdriveusablespace(_storagedir);
 //BA.debugLineNum = 388;BA.debugLine="Dim totalBytes As Long = GetDriveTotalSpace(stora";
_totalbytes = _getdrivetotalspace(_storagedir);
 //BA.debugLineNum = 389;BA.debugLine="Dim minFreeBytes As Long = ResolveMinFreeDiskByte";
_minfreebytes = _resolveminfreediskbytes(_totalbytes);
 //BA.debugLineNum = 390;BA.debugLine="Dim hardLimitBytes As Long = MbToBytes(TRACK_CACH";
_hardlimitbytes = _mbtobytes(_track_cache_hard_limit_mb);
 //BA.debugLineNum = 391;BA.debugLine="Dim targetBytes As Long = MbToBytes(TRACK_CACHE_T";
_targetbytes = _mbtobytes(_track_cache_target_mb);
 //BA.debugLineNum = 392;BA.debugLine="Dim needPrune As Boolean = (cacheBytes > hardLimi";
_needprune = (_cachebytes>_hardlimitbytes) || (_freebytes>0 && _freebytes<_minfreebytes);
 //BA.debugLineNum = 393;BA.debugLine="If needPrune = False Then";
if (_needprune==__c.False) { 
 //BA.debugLineNum = 394;BA.debugLine="Return 0";
if (true) return (int) (0);
 };
 //BA.debugLineNum = 396;BA.debugLine="Dim removedCount As Int = 0";
_removedcount = (int) (0);
 //BA.debugLineNum = 397;BA.debugLine="Dim candidates As List = summary.GetDefault(\"cand";
_candidates = new anywheresoftware.b4a.objects.collections.List();
_candidates = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_summary.GetDefault((Object)("candidates"),(Object)(_createinitializedlist().getObject()))));
 //BA.debugLineNum = 398;BA.debugLine="Dim nonRelevantCandidates As List";
_nonrelevantcandidates = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 399;BA.debugLine="nonRelevantCandidates.Initialize";
_nonrelevantcandidates.Initialize();
 //BA.debugLineNum = 400;BA.debugLine="Dim relevantCandidates As List";
_relevantcandidates = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 401;BA.debugLine="relevantCandidates.Initialize";
_relevantcandidates.Initialize();
 //BA.debugLineNum = 402;BA.debugLine="For Each candidateObject As Object In candidates";
{
final anywheresoftware.b4a.BA.IterableList group20 = _candidates;
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_candidateobject = group20.Get(index20);
 //BA.debugLineNum = 403;BA.debugLine="If (candidateObject Is Map) = False Then Continu";
if ((_candidateobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 404;BA.debugLine="Dim candidate As Map = candidateObject";
_candidate = new anywheresoftware.b4a.objects.collections.Map();
_candidate = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_candidateobject));
 //BA.debugLineNum = 405;BA.debugLine="If candidate.GetDefault(\"is_relevant\", False) Th";
if (BA.ObjectToBoolean(_candidate.GetDefault((Object)("is_relevant"),(Object)(__c.False)))) { 
 //BA.debugLineNum = 406;BA.debugLine="relevantCandidates.Add(candidate)";
_relevantcandidates.Add((Object)(_candidate.getObject()));
 }else {
 //BA.debugLineNum = 408;BA.debugLine="nonRelevantCandidates.Add(candidate)";
_nonrelevantcandidates.Add((Object)(_candidate.getObject()));
 };
 }
};
 //BA.debugLineNum = 411;BA.debugLine="SortTrackPruneCandidates(nonRelevantCandidates)";
_sorttrackprunecandidates(_nonrelevantcandidates);
 //BA.debugLineNum = 412;BA.debugLine="SortTrackPruneCandidates(relevantCandidates)";
_sorttrackprunecandidates(_relevantcandidates);
 //BA.debugLineNum = 416;BA.debugLine="removedCount = removedCount + PruneTrackCandidate";
_removedcount = (int) (_removedcount+_prunetrackcandidates(_nonrelevantcandidates,_cachebytes,_freebytes,_targetbytes,_minfreebytes));
 //BA.debugLineNum = 417;BA.debugLine="cacheBytes = pruneLastCacheBytes";
_cachebytes = _prunelastcachebytes;
 //BA.debugLineNum = 418;BA.debugLine="freeBytes = pruneLastFreeBytes";
_freebytes = _prunelastfreebytes;
 //BA.debugLineNum = 419;BA.debugLine="If cacheBytes > targetBytes Or (freeBytes > 0 And";
if (_cachebytes>_targetbytes || (_freebytes>0 && _freebytes<_minfreebytes)) { 
 //BA.debugLineNum = 420;BA.debugLine="removedCount = removedCount + PruneTrackCandidat";
_removedcount = (int) (_removedcount+_prunetrackcandidates(_relevantcandidates,_cachebytes,_freebytes,_targetbytes,_minfreebytes));
 //BA.debugLineNum = 421;BA.debugLine="cacheBytes = pruneLastCacheBytes";
_cachebytes = _prunelastcachebytes;
 //BA.debugLineNum = 422;BA.debugLine="freeBytes = pruneLastFreeBytes";
_freebytes = _prunelastfreebytes;
 };
 //BA.debugLineNum = 424;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
 //BA.debugLineNum = 425;BA.debugLine="SaveTrackIndex";
_savetrackindex();
 //BA.debugLineNum = 426;BA.debugLine="Trace(\"Очистка кэша треков завершена. removed=\"";
_trace("Очистка кэша треков завершена. removed="+BA.NumberToString(_removedcount)+", cacheMb="+BA.NumberToString(_bytestomb(_cachebytes))+", freeMb="+BA.NumberToString(_bytestomb(_freebytes)));
 }else {
 //BA.debugLineNum = 428;BA.debugLine="Trace(\"Очистка кэша треков пропущена: нет подход";
_trace("Очистка кэша треков пропущена: нет подходящих кандидатов. cacheMb="+BA.NumberToString(_bytestomb(_cachebytes))+", freeMb="+BA.NumberToString(_bytestomb(_freebytes)));
 };
 //BA.debugLineNum = 430;BA.debugLine="Return removedCount";
if (true) return _removedcount;
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return 0;
}
public int  _prunetrackcandidates(anywheresoftware.b4a.objects.collections.List _candidates,long _initialcachebytes,long _initialfreebytes,long _targetbytes,long _minfreebytes) throws Exception{
int _removedcount = 0;
long _cachebytes = 0L;
long _freebytes = 0L;
Object _candidateobject = null;
anywheresoftware.b4a.objects.collections.Map _candidate = null;
String _trackid = "";
String _filename = "";
long _filebytes = 0L;
 //BA.debugLineNum = 433;BA.debugLine="Private Sub PruneTrackCandidates(candidates As Lis";
 //BA.debugLineNum = 434;BA.debugLine="Dim removedCount As Int = 0";
_removedcount = (int) (0);
 //BA.debugLineNum = 435;BA.debugLine="Dim cacheBytes As Long = initialCacheBytes";
_cachebytes = _initialcachebytes;
 //BA.debugLineNum = 436;BA.debugLine="Dim freeBytes As Long = initialFreeBytes";
_freebytes = _initialfreebytes;
 //BA.debugLineNum = 437;BA.debugLine="For Each candidateObject As Object In candidates";
{
final anywheresoftware.b4a.BA.IterableList group4 = _candidates;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_candidateobject = group4.Get(index4);
 //BA.debugLineNum = 438;BA.debugLine="If cacheBytes <= targetBytes And (freeBytes <= 0";
if (_cachebytes<=_targetbytes && (_freebytes<=0 || _freebytes>=_minfreebytes)) { 
if (true) break;};
 //BA.debugLineNum = 439;BA.debugLine="If (candidateObject Is Map) = False Then Continu";
if ((_candidateobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 440;BA.debugLine="Dim candidate As Map = candidateObject";
_candidate = new anywheresoftware.b4a.objects.collections.Map();
_candidate = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_candidateobject));
 //BA.debugLineNum = 441;BA.debugLine="Dim trackId As String = candidate.GetDefault(\"id";
_trackid = BA.ObjectToString(_candidate.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 442;BA.debugLine="Dim fileName As String = candidate.GetDefault(\"f";
_filename = BA.ObjectToString(_candidate.GetDefault((Object)("file_name"),(Object)("")));
 //BA.debugLineNum = 443;BA.debugLine="Dim fileBytes As Long = candidate.GetDefault(\"si";
_filebytes = BA.ObjectToLongNumber(_candidate.GetDefault((Object)("size_bytes"),(Object)(0)));
 //BA.debugLineNum = 444;BA.debugLine="If trackId = \"\" Or fileName = \"\" Then Continue";
if ((_trackid).equals("") || (_filename).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 445;BA.debugLine="DeleteFileIfExists(GetTracksDir, fileName)";
_deletefileifexists(_gettracksdir(),_filename);
 //BA.debugLineNum = 446;BA.debugLine="CleanupEmptyTrackPlaylistDir(fileName)";
_cleanupemptytrackplaylistdir(_filename);
 //BA.debugLineNum = 447;BA.debugLine="cachedTrackIndex.Remove(trackId)";
_cachedtrackindex.Remove((Object)(_trackid));
 //BA.debugLineNum = 448;BA.debugLine="cacheBytes = Max(0, cacheBytes - fileBytes)";
_cachebytes = (long) (__c.Max(0,_cachebytes-_filebytes));
 //BA.debugLineNum = 449;BA.debugLine="freeBytes = GetDriveUsableSpace(storageDir)";
_freebytes = _getdriveusablespace(_storagedir);
 //BA.debugLineNum = 450;BA.debugLine="removedCount = removedCount + 1";
_removedcount = (int) (_removedcount+1);
 //BA.debugLineNum = 451;BA.debugLine="Trace(\"Удален cached track при очистке кэша. id=";
_trace("Удален cached track при очистке кэша. id="+_trackid+", sizeMb="+BA.NumberToString(_bytestomb(_filebytes)));
 }
};
 //BA.debugLineNum = 453;BA.debugLine="pruneLastCacheBytes = cacheBytes";
_prunelastcachebytes = _cachebytes;
 //BA.debugLineNum = 454;BA.debugLine="pruneLastFreeBytes = freeBytes";
_prunelastfreebytes = _freebytes;
 //BA.debugLineNum = 455;BA.debugLine="Return removedCount";
if (true) return _removedcount;
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return 0;
}
public String  _rebuildcachestatsfromindexes() throws Exception{
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _trackentry = null;
long _trackbytes = 0L;
String _adid = "";
anywheresoftware.b4a.objects.collections.Map _adentry = null;
 //BA.debugLineNum = 1883;BA.debugLine="Private Sub RebuildCacheStatsFromIndexes";
 //BA.debugLineNum = 1884;BA.debugLine="cachedTrackCount = 0";
_cachedtrackcount = (int) (0);
 //BA.debugLineNum = 1885;BA.debugLine="cachedAdCount = 0";
_cachedadcount = (int) (0);
 //BA.debugLineNum = 1886;BA.debugLine="cachedTrackBytes = 0";
_cachedtrackbytes = (long) (0);
 //BA.debugLineNum = 1887;BA.debugLine="cachedAdBytes = 0";
_cachedadbytes = (long) (0);
 //BA.debugLineNum = 1888;BA.debugLine="cachedTrackPlaylistStats.Initialize";
_cachedtrackplayliststats.Initialize();
 //BA.debugLineNum = 1889;BA.debugLine="If cachedTrackIndex.IsInitialized Then";
if (_cachedtrackindex.IsInitialized()) { 
 //BA.debugLineNum = 1890;BA.debugLine="For Each trackId As String In cachedTrackIndex.K";
{
final anywheresoftware.b4a.BA.IterableList group7 = _cachedtrackindex.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_trackid = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 1891;BA.debugLine="Dim trackEntry As Map = cachedTrackIndex.Get(tr";
_trackentry = new anywheresoftware.b4a.objects.collections.Map();
_trackentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedtrackindex.Get((Object)(_trackid))));
 //BA.debugLineNum = 1892;BA.debugLine="If trackEntry.IsInitialized = False Then Contin";
if (_trackentry.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1893;BA.debugLine="cachedTrackCount = cachedTrackCount + 1";
_cachedtrackcount = (int) (_cachedtrackcount+1);
 //BA.debugLineNum = 1894;BA.debugLine="Dim trackBytes As Long = ToLongDefault(trackEnt";
_trackbytes = _tolongdefault(_trackentry.GetDefault((Object)("size_bytes"),(Object)(0)),(long) (0));
 //BA.debugLineNum = 1895;BA.debugLine="cachedTrackBytes = cachedTrackBytes + trackByte";
_cachedtrackbytes = (long) (_cachedtrackbytes+_trackbytes);
 //BA.debugLineNum = 1896;BA.debugLine="AccumulateTrackPlaylistStat(trackEntry.GetDefau";
_accumulatetrackplayliststat(BA.ObjectToString(_trackentry.GetDefault((Object)("playlist_id"),(Object)(""))),_trackbytes);
 }
};
 };
 //BA.debugLineNum = 1899;BA.debugLine="If cachedAdIndex.IsInitialized Then";
if (_cachedadindex.IsInitialized()) { 
 //BA.debugLineNum = 1900;BA.debugLine="For Each adId As String In cachedAdIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = _cachedadindex.Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_adid = BA.ObjectToString(group17.Get(index17));
 //BA.debugLineNum = 1901;BA.debugLine="Dim adEntry As Map = cachedAdIndex.Get(adId)";
_adentry = new anywheresoftware.b4a.objects.collections.Map();
_adentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedadindex.Get((Object)(_adid))));
 //BA.debugLineNum = 1902;BA.debugLine="If adEntry.IsInitialized = False Then Continue";
if (_adentry.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1903;BA.debugLine="cachedAdCount = cachedAdCount + 1";
_cachedadcount = (int) (_cachedadcount+1);
 //BA.debugLineNum = 1904;BA.debugLine="cachedAdBytes = cachedAdBytes + ToLongDefault(a";
_cachedadbytes = (long) (_cachedadbytes+_tolongdefault(_adentry.GetDefault((Object)("size_bytes"),(Object)(0)),(long) (0)));
 }
};
 };
 //BA.debugLineNum = 1907;BA.debugLine="End Sub";
return "";
}
public boolean  _replacecachefile(String _dir,String _tempfilename,String _finalfilename) throws Exception{
anywheresoftware.b4j.object.JavaObject _tempfile = null;
anywheresoftware.b4j.object.JavaObject _finalfile = null;
boolean _renamed = false;
 //BA.debugLineNum = 824;BA.debugLine="Private Sub ReplaceCacheFile(dir As String, tempFi";
 //BA.debugLineNum = 825;BA.debugLine="If IsCachedFileUsable(dir, tempFileName) = False";
if (_iscachedfileusable(_dir,_tempfilename)==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 826;BA.debugLine="If IsCachedFileUsable(dir, finalFileName) Then";
if (_iscachedfileusable(_dir,_finalfilename)) { 
 //BA.debugLineNum = 827;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
_deletefileifexists(_dir,_tempfilename);
 //BA.debugLineNum = 828;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 830;BA.debugLine="DeleteFileIfExists(dir, finalFileName)";
_deletefileifexists(_dir,_finalfilename);
 //BA.debugLineNum = 831;BA.debugLine="Dim tempFile As JavaObject";
_tempfile = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 832;BA.debugLine="tempFile.InitializeNewInstance(\"java.io.File\", Ar";
_tempfile.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_dir,_tempfilename))});
 //BA.debugLineNum = 833;BA.debugLine="Dim finalFile As JavaObject";
_finalfile = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 834;BA.debugLine="finalFile.InitializeNewInstance(\"java.io.File\", A";
_finalfile.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_dir,_finalfilename))});
 //BA.debugLineNum = 835;BA.debugLine="Dim renamed As Boolean = tempFile.RunMethod(\"rena";
_renamed = BA.ObjectToBoolean(_tempfile.RunMethod("renameTo",new Object[]{(Object)(_finalfile.getObject())}));
 //BA.debugLineNum = 836;BA.debugLine="If renamed = False And IsCachedFileUsable(dir, fi";
if (_renamed==__c.False && _iscachedfileusable(_dir,_finalfilename)) { 
 //BA.debugLineNum = 837;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
_deletefileifexists(_dir,_tempfilename);
 //BA.debugLineNum = 838;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 840;BA.debugLine="Return renamed";
if (true) return _renamed;
 //BA.debugLineNum = 841;BA.debugLine="End Sub";
return false;
}
public String  _resetandroidtrackcacheforplainplayback() throws Exception{
anywheresoftware.b4a.objects.collections.List _listed = null;
String _name = "";
String _tempdir = "";
anywheresoftware.b4a.objects.collections.List _tempfiles = null;
String _tempname = "";
 //BA.debugLineNum = 879;BA.debugLine="Private Sub ResetAndroidTrackCacheForPlainPlayback";
 //BA.debugLineNum = 880;BA.debugLine="Trace(\"Android кэш треков: переход на прямое восп";
_trace("Android кэш треков: переход на прямое воспроизведение без temp/xor. Выполняю одноразовый сброс.");
 //BA.debugLineNum = 881;BA.debugLine="Try";
try { //BA.debugLineNum = 882;BA.debugLine="If DirectoryExists(GetTracksDir) Then";
if (_directoryexists(_gettracksdir())) { 
 //BA.debugLineNum = 883;BA.debugLine="Dim listed As List = File.ListFiles(GetTracksDi";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_gettracksdir());
 //BA.debugLineNum = 884;BA.debugLine="If listed.IsInitialized Then";
if (_listed.IsInitialized()) { 
 //BA.debugLineNum = 885;BA.debugLine="For Each name As String In listed";
{
final anywheresoftware.b4a.BA.IterableList group6 = _listed;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_name = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 886;BA.debugLine="If name = \"\" Then Continue";
if ((_name).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 887;BA.debugLine="If File.IsDirectory(GetTracksDir, name) Then";
if (__c.File.IsDirectory(_gettracksdir(),_name)) { 
 //BA.debugLineNum = 888;BA.debugLine="DeleteTrackSubdirRecursive(File.Combine(GetT";
_deletetracksubdirrecursive(__c.File.Combine(_gettracksdir(),_name));
 }else {
 //BA.debugLineNum = 890;BA.debugLine="File.Delete(GetTracksDir, name)";
__c.File.Delete(_gettracksdir(),_name);
 };
 }
};
 };
 };
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 896;BA.debugLine="Trace(\"Не удалось очистить Android track cache д";
_trace("Не удалось очистить Android track cache для plain playback. message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 898;BA.debugLine="Try";
try { //BA.debugLineNum = 899;BA.debugLine="Dim tempDir As String = GetPlaybackTempDir";
_tempdir = _getplaybacktempdir();
 //BA.debugLineNum = 900;BA.debugLine="If DirectoryExists(tempDir) Then";
if (_directoryexists(_tempdir)) { 
 //BA.debugLineNum = 901;BA.debugLine="Dim tempFiles As List = File.ListFiles(tempDir)";
_tempfiles = new anywheresoftware.b4a.objects.collections.List();
_tempfiles = __c.File.ListFiles(_tempdir);
 //BA.debugLineNum = 902;BA.debugLine="If tempFiles.IsInitialized Then";
if (_tempfiles.IsInitialized()) { 
 //BA.debugLineNum = 903;BA.debugLine="For Each tempName As String In tempFiles";
{
final anywheresoftware.b4a.BA.IterableList group24 = _tempfiles;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_tempname = BA.ObjectToString(group24.Get(index24));
 //BA.debugLineNum = 904;BA.debugLine="If tempName = \"\" Then Continue";
if ((_tempname).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 905;BA.debugLine="If File.IsDirectory(tempDir, tempName) Then";
if (__c.File.IsDirectory(_tempdir,_tempname)) { 
 //BA.debugLineNum = 906;BA.debugLine="DeleteTrackSubdirRecursive(File.Combine(temp";
_deletetracksubdirrecursive(__c.File.Combine(_tempdir,_tempname));
 }else {
 //BA.debugLineNum = 908;BA.debugLine="File.Delete(tempDir, tempName)";
__c.File.Delete(_tempdir,_tempname);
 };
 }
};
 };
 };
 } 
       catch (Exception e35) {
			ba.setLastException(e35); //BA.debugLineNum = 914;BA.debugLine="Trace(\"Не удалось очистить Android temp playback";
_trace("Не удалось очистить Android temp playback cache. message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 916;BA.debugLine="cachedTrackIndex.Clear";
_cachedtrackindex.Clear();
 //BA.debugLineNum = 917;BA.debugLine="cachedTrackPlaylistStats.Clear";
_cachedtrackplayliststats.Clear();
 //BA.debugLineNum = 918;BA.debugLine="cachedTrackIndexDirty = True";
_cachedtrackindexdirty = __c.True;
 //BA.debugLineNum = 919;BA.debugLine="SaveTrackIndex";
_savetrackindex();
 //BA.debugLineNum = 920;BA.debugLine="CleanupPlaybackTempFiles";
_cleanupplaybacktempfiles();
 //BA.debugLineNum = 921;BA.debugLine="Trace(\"Android кэш треков сброшен. Ожидаю повторн";
_trace("Android кэш треков сброшен. Ожидаю повторную загрузку треков в raw-формате.");
 //BA.debugLineNum = 922;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolveanycachedtrackfromindex(String _playlistid,String _currenttrackid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptytrack = null;
anywheresoftware.b4a.objects.collections.Map _selectedtrack = null;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _entryplaylistid = "";
String _filename = "";
anywheresoftware.b4a.objects.collections.Map _copiedtrack = null;
Object _key = null;
 //BA.debugLineNum = 665;BA.debugLine="Public Sub ResolveAnyCachedTrackFromIndex(playlist";
 //BA.debugLineNum = 666;BA.debugLine="Dim emptyTrack As Map";
_emptytrack = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 667;BA.debugLine="emptyTrack.Initialize";
_emptytrack.Initialize();
 //BA.debugLineNum = 668;BA.debugLine="EnsureTrackCacheReady";
_ensuretrackcacheready();
 //BA.debugLineNum = 669;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then Re";
if (_cachedtrackindex.IsInitialized()==__c.False) { 
if (true) return _emptytrack;};
 //BA.debugLineNum = 670;BA.debugLine="Dim selectedTrack As Map";
_selectedtrack = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 671;BA.debugLine="selectedTrack.Initialize";
_selectedtrack.Initialize();
 //BA.debugLineNum = 672;BA.debugLine="For Each trackId As String In cachedTrackIndex.Ke";
{
final anywheresoftware.b4a.BA.IterableList group7 = _cachedtrackindex.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_trackid = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 673;BA.debugLine="If currentTrackId <> \"\" And cachedTrackIndex.Siz";
if ((_currenttrackid).equals("") == false && _cachedtrackindex.getSize()>1 && (_trackid).equals(_currenttrackid)) { 
if (true) continue;};
 //BA.debugLineNum = 674;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(t";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedtrackindex.GetDefault((Object)(_trackid),__c.Null)));
 //BA.debugLineNum = 675;BA.debugLine="If entry.IsInitialized = False Then Continue";
if (_entry.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 676;BA.debugLine="Dim entryPlaylistId As String = entry.GetDefault";
_entryplaylistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));
 //BA.debugLineNum = 677;BA.debugLine="If playlistId <> \"\" And entryPlaylistId <> playl";
if ((_playlistid).equals("") == false && (_entryplaylistid).equals(_playlistid) == false) { 
if (true) continue;};
 //BA.debugLineNum = 678;BA.debugLine="Dim fileName As String = ResolveTrackCacheFileNa";
_filename = _resolvetrackcachefilename(_trackid,_cachedtrackindex);
 //BA.debugLineNum = 679;BA.debugLine="If IsCachedFileUsable(GetTracksDir, fileName) =";
if (_iscachedfileusable(_gettracksdir(),_filename)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 680;BA.debugLine="Dim copiedTrack As Map";
_copiedtrack = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 681;BA.debugLine="copiedTrack.Initialize";
_copiedtrack.Initialize();
 //BA.debugLineNum = 682;BA.debugLine="For Each key As Object In entry.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = _entry.Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_key = group17.Get(index17);
 //BA.debugLineNum = 683;BA.debugLine="copiedTrack.Put(key, entry.Get(key))";
_copiedtrack.Put(_key,_entry.Get(_key));
 }
};
 //BA.debugLineNum = 685;BA.debugLine="selectedTrack = copiedTrack";
_selectedtrack = _copiedtrack;
 //BA.debugLineNum = 686;BA.debugLine="If selectedTrack.GetDefault(\"id\", \"\") = \"\" Then";
if ((_selectedtrack.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
_selectedtrack.Put((Object)("id"),(Object)(_trackid));};
 //BA.debugLineNum = 687;BA.debugLine="If selectedTrack.GetDefault(\"playlist_id\", \"\") =";
if ((_selectedtrack.GetDefault((Object)("playlist_id"),(Object)(""))).equals((Object)(""))) { 
_selectedtrack.Put((Object)("playlist_id"),(Object)(_entryplaylistid));};
 //BA.debugLineNum = 688;BA.debugLine="If selectedTrack.GetDefault(\"playlist_title\", \"\"";
if ((_selectedtrack.GetDefault((Object)("playlist_title"),(Object)(""))).equals((Object)(""))) { 
_selectedtrack.Put((Object)("playlist_title"),_entry.GetDefault((Object)("title"),(Object)("")));};
 //BA.debugLineNum = 689;BA.debugLine="Exit";
if (true) break;
 }
};
 //BA.debugLineNum = 691;BA.debugLine="If selectedTrack.IsInitialized And selectedTrack.";
if (_selectedtrack.IsInitialized() && _selectedtrack.getSize()>0) { 
if (true) return _selectedtrack;};
 //BA.debugLineNum = 692;BA.debugLine="Return emptyTrack";
if (true) return _emptytrack;
 //BA.debugLineNum = 693;BA.debugLine="End Sub";
return null;
}
public String  _resolveindexedauditfilename(String _audittype,String _itemid,anywheresoftware.b4a.objects.collections.Map _auditindex) throws Exception{
 //BA.debugLineNum = 1419;BA.debugLine="Private Sub ResolveIndexedAuditFileName(auditType";
 //BA.debugLineNum = 1420;BA.debugLine="If auditType = \"ads\" Then Return itemId";
if ((_audittype).equals("ads")) { 
if (true) return _itemid;};
 //BA.debugLineNum = 1421;BA.debugLine="Return ResolveTrackCacheFileName(itemId, auditInd";
if (true) return _resolvetrackcachefilename(_itemid,_auditindex);
 //BA.debugLineNum = 1422;BA.debugLine="End Sub";
return "";
}
public String  _resolveindexedfilename(String _itemtype,String _itemid,anywheresoftware.b4a.objects.collections.Map _itemindex) throws Exception{
 //BA.debugLineNum = 1212;BA.debugLine="Private Sub ResolveIndexedFileName(itemType As Str";
 //BA.debugLineNum = 1213;BA.debugLine="If itemType = \"ad\" Then Return itemId";
if ((_itemtype).equals("ad")) { 
if (true) return _itemid;};
 //BA.debugLineNum = 1214;BA.debugLine="Return ResolveTrackCacheFileName(itemId, itemInde";
if (true) return _resolvetrackcachefilename(_itemid,_itemindex);
 //BA.debugLineNum = 1215;BA.debugLine="End Sub";
return "";
}
public String  _resolvelocalmediauri(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _itemtype = "";
String _itemid = "";
 //BA.debugLineNum = 150;BA.debugLine="Public Sub ResolveLocalMediaUri(item As Map) As St";
 //BA.debugLineNum = 151;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 152;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 153;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 154;BA.debugLine="If itemId = \"\" Then Return \"\"";
if ((_itemid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 155;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
if (_hasvalidatedlocalmedia(_item)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 156;BA.debugLine="If itemType = \"ad\" Then Return BuildFileUri(GetAd";
if ((_itemtype).equals("ad")) { 
if (true) return _buildfileuri(_getadsdir(),_itemid);};
 //BA.debugLineNum = 157;BA.debugLine="If itemType = \"track\" Then Return ResolveRelative";
if ((_itemtype).equals("track")) { 
if (true) return _resolverelativefileuri(_gettracksdir(),_resolvetrackrelativefilenamefromitem(_item));};
 //BA.debugLineNum = 158;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public String  _resolvemediasource(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _itemtype = "";
 //BA.debugLineNum = 1097;BA.debugLine="Public Sub ResolveMediaSource(item As Map) As Stri";
 //BA.debugLineNum = 1098;BA.debugLine="If item.IsInitialized = False Then Return \"none\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "none";};
 //BA.debugLineNum = 1099;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 1100;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
 //BA.debugLineNum = 1101;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
if (_hasvalidatedlocalmedia(_item)) { 
if (true) return "cache";};
 //BA.debugLineNum = 1102;BA.debugLine="Return \"missing\"";
if (true) return "missing";
 };
 //BA.debugLineNum = 1104;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
 //BA.debugLineNum = 1105;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
if (_hasvalidatedlocalmedia(_item)) { 
if (true) return "cache";};
 //BA.debugLineNum = 1106;BA.debugLine="Return \"missing\"";
if (true) return "missing";
 };
 //BA.debugLineNum = 1108;BA.debugLine="Return \"none\"";
if (true) return "none";
 //BA.debugLineNum = 1109;BA.debugLine="End Sub";
return "";
}
public long  _resolveminfreediskbytes(long _totalbytes) throws Exception{
long _percentbytes = 0L;
 //BA.debugLineNum = 1923;BA.debugLine="Private Sub ResolveMinFreeDiskBytes(totalBytes As";
 //BA.debugLineNum = 1924;BA.debugLine="Dim percentBytes As Long = 0";
_percentbytes = (long) (0);
 //BA.debugLineNum = 1925;BA.debugLine="If totalBytes > 0 Then percentBytes = Floor(total";
if (_totalbytes>0) { 
_percentbytes = (long) (__c.Floor(_totalbytes*_min_free_disk_percent/(double)100));};
 //BA.debugLineNum = 1926;BA.debugLine="Return Max(MbToBytes(MIN_FREE_DISK_MB), percentBy";
if (true) return (long) (__c.Max(_mbtobytes(_min_free_disk_mb),_percentbytes));
 //BA.debugLineNum = 1927;BA.debugLine="End Sub";
return 0L;
}
public String  _resolveplaybackmediauri(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _itemtype = "";
String _trackid = "";
 //BA.debugLineNum = 162;BA.debugLine="Public Sub ResolvePlaybackMediaUri(audioKey As Str";
 //BA.debugLineNum = 164;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 165;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 166;BA.debugLine="If itemType = \"ad\" Then Return ResolveLocalMediaU";
if ((_itemtype).equals("ad")) { 
if (true) return _resolvelocalmediauri(_item);};
 //BA.debugLineNum = 167;BA.debugLine="If itemType <> \"track\" Then Return \"\"";
if ((_itemtype).equals("track") == false) { 
if (true) return "";};
 //BA.debugLineNum = 168;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 169;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 170;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
if (_hasvalidatedlocalmedia(_item)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 171;BA.debugLine="Return ResolveLocalMediaUri(item)";
if (true) return _resolvelocalmediauri(_item);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public String  _resolveplaylistidfortrackid(String _trackid,String _preferredplaylistid,anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps) throws Exception{
String _playlistsdir = "";
anywheresoftware.b4a.objects.collections.List _listed = null;
String _filename = "";
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _playlisttrackids = null;
 //BA.debugLineNum = 1558;BA.debugLine="Private Sub ResolvePlaylistIdForTrackId(trackId As";
 //BA.debugLineNum = 1559;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 1560;BA.debugLine="If preferredPlaylistId <> \"\" Then Return preferre";
if ((_preferredplaylistid).equals("") == false) { 
if (true) return _preferredplaylistid;};
 //BA.debugLineNum = 1561;BA.debugLine="Dim playlistsDir As String = File.Combine(storage";
_playlistsdir = __c.File.Combine(_storagedir,"playlists");
 //BA.debugLineNum = 1562;BA.debugLine="If DirectoryExists(playlistsDir) = False Then Ret";
if (_directoryexists(_playlistsdir)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1563;BA.debugLine="Try";
try { //BA.debugLineNum = 1564;BA.debugLine="Dim listed As List = File.ListFiles(playlistsDir";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_playlistsdir);
 //BA.debugLineNum = 1565;BA.debugLine="If listed.IsInitialized = False Then Return \"\"";
if (_listed.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1566;BA.debugLine="For Each fileName As String In listed";
{
final anywheresoftware.b4a.BA.IterableList group8 = _listed;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_filename = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 1567;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 1568;BA.debugLine="If fileName.ToLowerCase.EndsWith(\".json\") = Fal";
if (_filename.toLowerCase().endsWith(".json")==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1569;BA.debugLine="Dim playlistId As String = fileName.SubString2(";
_playlistid = _filename.substring((int) (0),(int) (_filename.length()-5));
 //BA.debugLineNum = 1570;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 1571;BA.debugLine="Dim playlistTrackIds As Map = LoadPlaylistTrack";
_playlisttrackids = new anywheresoftware.b4a.objects.collections.Map();
_playlisttrackids = _loadplaylisttrackidmap(_playlistid,_playlisttrackmaps);
 //BA.debugLineNum = 1572;BA.debugLine="If playlistTrackIds.IsInitialized = False Then";
if (_playlisttrackids.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1573;BA.debugLine="If playlistTrackIds.ContainsKey(trackId) Then R";
if (_playlisttrackids.ContainsKey((Object)(_trackid))) { 
if (true) return _playlistid;};
 }
};
 } 
       catch (Exception e18) {
			ba.setLastException(e18); //BA.debugLineNum = 1576;BA.debugLine="Trace(\"Не удалось определить playlist_id для cac";
_trace("Не удалось определить playlist_id для cached track. trackId="+_trackid+", message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 1578;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 1579;BA.debugLine="End Sub";
return "";
}
public String  _resolverelativefileuri(String _basedir,String _relativefilename) throws Exception{
 //BA.debugLineNum = 1824;BA.debugLine="Private Sub ResolveRelativeFileUri(baseDir As Stri";
 //BA.debugLineNum = 1825;BA.debugLine="Return BuildFileUri(ResolveRelativeParentDir(base";
if (true) return _buildfileuri(_resolverelativeparentdir(_basedir,_relativefilename),_resolverelativeleafname(_relativefilename));
 //BA.debugLineNum = 1826;BA.debugLine="End Sub";
return "";
}
public String  _resolverelativeleafname(String _relativefilename) throws Exception{
String _normalizedname = "";
int _slashindex = 0;
 //BA.debugLineNum = 1817;BA.debugLine="Private Sub ResolveRelativeLeafName(relativeFileNa";
 //BA.debugLineNum = 1818;BA.debugLine="Dim normalizedName As String = relativeFileName.R";
_normalizedname = _relativefilename.replace("\\\\","/");
 //BA.debugLineNum = 1819;BA.debugLine="Dim slashIndex As Int = normalizedName.LastIndexO";
_slashindex = _normalizedname.lastIndexOf("/");
 //BA.debugLineNum = 1820;BA.debugLine="If slashIndex < 0 Then Return normalizedName";
if (_slashindex<0) { 
if (true) return _normalizedname;};
 //BA.debugLineNum = 1821;BA.debugLine="Return normalizedName.SubString(slashIndex + 1)";
if (true) return _normalizedname.substring((int) (_slashindex+1));
 //BA.debugLineNum = 1822;BA.debugLine="End Sub";
return "";
}
public String  _resolverelativeparentdir(String _basedir,String _relativefilename) throws Exception{
String _normalizedname = "";
int _slashindex = 0;
String _parentrelative = "";
 //BA.debugLineNum = 1808;BA.debugLine="Private Sub ResolveRelativeParentDir(baseDir As St";
 //BA.debugLineNum = 1809;BA.debugLine="Dim normalizedName As String = relativeFileName.R";
_normalizedname = _relativefilename.replace("\\\\","/");
 //BA.debugLineNum = 1810;BA.debugLine="Dim slashIndex As Int = normalizedName.LastIndexO";
_slashindex = _normalizedname.lastIndexOf("/");
 //BA.debugLineNum = 1811;BA.debugLine="If slashIndex < 0 Then Return baseDir";
if (_slashindex<0) { 
if (true) return _basedir;};
 //BA.debugLineNum = 1812;BA.debugLine="Dim parentRelative As String = normalizedName.Sub";
_parentrelative = _normalizedname.substring((int) (0),_slashindex);
 //BA.debugLineNum = 1813;BA.debugLine="If parentRelative = \"\" Then Return baseDir";
if ((_parentrelative).equals("")) { 
if (true) return _basedir;};
 //BA.debugLineNum = 1814;BA.debugLine="Return File.Combine(baseDir, parentRelative)";
if (true) return __c.File.Combine(_basedir,_parentrelative);
 //BA.debugLineNum = 1815;BA.debugLine="End Sub";
return "";
}
public String  _resolvetrackcachefilename(String _trackid,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _filename = "";
String _playlistid = "";
 //BA.debugLineNum = 1217;BA.debugLine="Private Sub ResolveTrackCacheFileName(trackId As S";
 //BA.debugLineNum = 1218;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
 //BA.debugLineNum = 1219;BA.debugLine="If entry.IsInitialized Then";
if (_entry.IsInitialized()) { 
 //BA.debugLineNum = 1220;BA.debugLine="Dim fileName As String = entry.GetDefault(\"file_";
_filename = BA.ObjectToString(_entry.GetDefault((Object)("file_name"),(Object)("")));
 //BA.debugLineNum = 1221;BA.debugLine="If fileName <> \"\" Then Return fileName";
if ((_filename).equals("") == false) { 
if (true) return _filename;};
 };
 //BA.debugLineNum = 1223;BA.debugLine="Dim playlistId As String = \"\"";
_playlistid = "";
 //BA.debugLineNum = 1224;BA.debugLine="If entry.IsInitialized Then playlistId = entry.Ge";
if (_entry.IsInitialized()) { 
_playlistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));};
 //BA.debugLineNum = 1225;BA.debugLine="Return BuildTrackCacheRelativeFileName(trackId, p";
if (true) return _buildtrackcacherelativefilename(_trackid,_playlistid);
 //BA.debugLineNum = 1226;BA.debugLine="End Sub";
return "";
}
public String  _resolvetrackplaylistid(anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex,String _trackid) throws Exception{
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
 //BA.debugLineNum = 1691;BA.debugLine="Private Sub ResolveTrackPlaylistId(item As Map, tr";
 //BA.debugLineNum = 1692;BA.debugLine="If item.IsInitialized Then";
if (_item.IsInitialized()) { 
 //BA.debugLineNum = 1693;BA.debugLine="Dim playlistId As String = item.GetDefault(\"play";
_playlistid = BA.ObjectToString(_item.GetDefault((Object)("playlist_id"),(Object)("")));
 //BA.debugLineNum = 1694;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
if ((_playlistid).equals("") == false) { 
if (true) return _playlistid;};
 };
 //BA.debugLineNum = 1696;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
 //BA.debugLineNum = 1697;BA.debugLine="If entry.IsInitialized Then Return entry.GetDefau";
if (_entry.IsInitialized()) { 
if (true) return BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));};
 //BA.debugLineNum = 1698;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 1699;BA.debugLine="End Sub";
return "";
}
public String  _resolvetrackrelativefilenamefromitem(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _trackid = "";
String _playlistid = "";
String _preferredrelativename = "";
 //BA.debugLineNum = 924;BA.debugLine="Private Sub ResolveTrackRelativeFileNameFromItem(i";
 //BA.debugLineNum = 925;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 926;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 927;BA.debugLine="Dim playlistId As String = item.GetDefault(\"playl";
_playlistid = BA.ObjectToString(_item.GetDefault((Object)("playlist_id"),(Object)("")));
 //BA.debugLineNum = 928;BA.debugLine="Dim preferredRelativeName As String = BuildTrackC";
_preferredrelativename = _buildtrackcacherelativefilename(_trackid,_playlistid);
 //BA.debugLineNum = 929;BA.debugLine="If IsCachedFileUsable(GetTracksDir, preferredRela";
if (_iscachedfileusable(_gettracksdir(),_preferredrelativename)) { 
if (true) return _preferredrelativename;};
 //BA.debugLineNum = 930;BA.debugLine="Return ResolveTrackCacheFileName(trackId, cachedT";
if (true) return _resolvetrackcachefilename(_trackid,_cachedtrackindex);
 //BA.debugLineNum = 931;BA.debugLine="End Sub";
return "";
}
public String  _restoreindexedfilebyid(String _itemid,anywheresoftware.b4a.objects.collections.Map _itemindex) throws Exception{
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _playlistid = "";
 //BA.debugLineNum = 1167;BA.debugLine="Private Sub RestoreIndexedFileById(itemId As Strin";
 //BA.debugLineNum = 1168;BA.debugLine="Dim entry As Map = itemIndex.GetDefault(itemId, N";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemindex.GetDefault((Object)(_itemid),__c.Null)));
 //BA.debugLineNum = 1169;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
 //BA.debugLineNum = 1170;BA.debugLine="entry.Put(\"id\", itemId)";
_entry.Put((Object)("id"),(Object)(_itemid));
 //BA.debugLineNum = 1171;BA.debugLine="Dim playlistId As String = entry.GetDefault(\"play";
_playlistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));
 //BA.debugLineNum = 1172;BA.debugLine="entry.Put(\"file_name\", BuildTrackCacheRelativeFil";
_entry.Put((Object)("file_name"),(Object)(_buildtrackcacherelativefilename(_itemid,_playlistid)));
 //BA.debugLineNum = 1173;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
 //BA.debugLineNum = 1174;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 1175;BA.debugLine="itemIndex.Put(itemId, entry)";
_itemindex.Put((Object)(_itemid),(Object)(_entry.getObject()));
 //BA.debugLineNum = 1176;BA.debugLine="End Sub";
return "";
}
public boolean  _runcacheauditstep() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Public Sub RunCacheAuditStep As Boolean";
 //BA.debugLineNum = 96;BA.debugLine="If cacheAuditInProgress = False Then Return False";
if (_cacheauditinprogress==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 97;BA.debugLine="If cacheAuditCurrentType = \"\" Then";
if ((_cacheauditcurrenttype).equals("")) { 
 //BA.debugLineNum = 98;BA.debugLine="If PrepareNextCacheAuditType = False Then";
if (_preparenextcacheaudittype()==__c.False) { 
 //BA.debugLineNum = 99;BA.debugLine="FinishCacheAudit";
_finishcacheaudit();
 //BA.debugLineNum = 100;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 //BA.debugLineNum = 103;BA.debugLine="If cacheAuditListingInProgress Then Return True";
if (_cacheauditlistinginprogress) { 
if (true) return __c.True;};
 //BA.debugLineNum = 104;BA.debugLine="ProcessCurrentCacheAuditBatch";
_processcurrentcacheauditbatch();
 //BA.debugLineNum = 105;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurrent";
if (_cacheauditcurrentposition>=_cacheauditcurrentfilenames.getSize()) { 
 //BA.debugLineNum = 106;BA.debugLine="FinalizeCurrentCacheAuditType";
_finalizecurrentcacheaudittype();
 //BA.debugLineNum = 107;BA.debugLine="cacheAuditCurrentType = \"\"";
_cacheauditcurrenttype = "";
 //BA.debugLineNum = 108;BA.debugLine="If cacheAuditPendingTypes.Size = 0 Then";
if (_cacheauditpendingtypes.getSize()==0) { 
 //BA.debugLineNum = 109;BA.debugLine="FinishCacheAudit";
_finishcacheaudit();
 //BA.debugLineNum = 110;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 //BA.debugLineNum = 113;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return false;
}
public String  _saveadindex() throws Exception{
 //BA.debugLineNum = 748;BA.debugLine="Private Sub SaveAdIndex";
 //BA.debugLineNum = 749;BA.debugLine="RebuildCacheStatsFromIndexes";
_rebuildcachestatsfromindexes();
 //BA.debugLineNum = 750;BA.debugLine="storage.Put(\"cached_ad_index\", cachedAdIndex)";
_storage._put /*String*/ ("cached_ad_index",(Object)(_cachedadindex.getObject()));
 //BA.debugLineNum = 751;BA.debugLine="storage.Put(\"cached_ad_count\", cachedAdCount)";
_storage._put /*String*/ ("cached_ad_count",(Object)(_cachedadcount));
 //BA.debugLineNum = 752;BA.debugLine="SaveCacheStatsSnapshot";
_savecachestatssnapshot();
 //BA.debugLineNum = 753;BA.debugLine="cachedAdIndexDirty = False";
_cachedadindexdirty = __c.False;
 //BA.debugLineNum = 754;BA.debugLine="End Sub";
return "";
}
public String  _savecachestatssnapshot() throws Exception{
 //BA.debugLineNum = 1875;BA.debugLine="Private Sub SaveCacheStatsSnapshot";
 //BA.debugLineNum = 1876;BA.debugLine="storage.Put(\"cache_stats_track_count\", cachedTrac";
_storage._put /*String*/ ("cache_stats_track_count",(Object)(_cachedtrackcount));
 //BA.debugLineNum = 1877;BA.debugLine="storage.Put(\"cache_stats_ad_count\", cachedAdCount";
_storage._put /*String*/ ("cache_stats_ad_count",(Object)(_cachedadcount));
 //BA.debugLineNum = 1878;BA.debugLine="storage.Put(\"cache_stats_track_bytes\", cachedTrac";
_storage._put /*String*/ ("cache_stats_track_bytes",(Object)(_cachedtrackbytes));
 //BA.debugLineNum = 1879;BA.debugLine="storage.Put(\"cache_stats_ad_bytes\", cachedAdBytes";
_storage._put /*String*/ ("cache_stats_ad_bytes",(Object)(_cachedadbytes));
 //BA.debugLineNum = 1880;BA.debugLine="storage.Put(\"cache_stats_track_playlist\", cachedT";
_storage._put /*String*/ ("cache_stats_track_playlist",(Object)(_cachedtrackplayliststats.getObject()));
 //BA.debugLineNum = 1881;BA.debugLine="End Sub";
return "";
}
public String  _saveindexbyitemtype(String _itemtype) throws Exception{
 //BA.debugLineNum = 1204;BA.debugLine="Private Sub SaveIndexByItemType(itemType As String";
 //BA.debugLineNum = 1205;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
 //BA.debugLineNum = 1206;BA.debugLine="SaveAdIndex";
_saveadindex();
 }else {
 //BA.debugLineNum = 1208;BA.debugLine="SaveTrackIndex";
_savetrackindex();
 };
 //BA.debugLineNum = 1210;BA.debugLine="End Sub";
return "";
}
public String  _savetrackindex() throws Exception{
 //BA.debugLineNum = 756;BA.debugLine="Private Sub SaveTrackIndex";
 //BA.debugLineNum = 757;BA.debugLine="RebuildCacheStatsFromIndexes";
_rebuildcachestatsfromindexes();
 //BA.debugLineNum = 758;BA.debugLine="storage.Put(\"cached_track_index\", cachedTrackInde";
_storage._put /*String*/ ("cached_track_index",(Object)(_cachedtrackindex.getObject()));
 //BA.debugLineNum = 759;BA.debugLine="storage.Put(\"cached_track_count\", cachedTrackCoun";
_storage._put /*String*/ ("cached_track_count",(Object)(_cachedtrackcount));
 //BA.debugLineNum = 760;BA.debugLine="SaveCacheStatsSnapshot";
_savecachestatssnapshot();
 //BA.debugLineNum = 761;BA.debugLine="cachedTrackIndexDirty = False";
_cachedtrackindexdirty = __c.False;
 //BA.debugLineNum = 762;BA.debugLine="End Sub";
return "";
}
public String  _sorttrackprunecandidates(anywheresoftware.b4a.objects.collections.List _candidates) throws Exception{
int _i = 0;
int _j = 0;
anywheresoftware.b4a.objects.collections.Map _leftitem = null;
anywheresoftware.b4a.objects.collections.Map _rightitem = null;
 //BA.debugLineNum = 1755;BA.debugLine="Private Sub SortTrackPruneCandidates(candidates As";
 //BA.debugLineNum = 1756;BA.debugLine="If candidates.IsInitialized = False Or candidates";
if (_candidates.IsInitialized()==__c.False || _candidates.getSize()<2) { 
if (true) return "";};
 //BA.debugLineNum = 1757;BA.debugLine="For i = 0 To candidates.Size - 2";
{
final int step2 = 1;
final int limit2 = (int) (_candidates.getSize()-2);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 1758;BA.debugLine="For j = i + 1 To candidates.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_candidates.getSize()-1);
_j = (int) (_i+1) ;
for (;_j <= limit3 ;_j = _j + step3 ) {
 //BA.debugLineNum = 1759;BA.debugLine="Dim leftItem As Map = candidates.Get(i)";
_leftitem = new anywheresoftware.b4a.objects.collections.Map();
_leftitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_candidates.Get(_i)));
 //BA.debugLineNum = 1760;BA.debugLine="Dim rightItem As Map = candidates.Get(j)";
_rightitem = new anywheresoftware.b4a.objects.collections.Map();
_rightitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_candidates.Get(_j)));
 //BA.debugLineNum = 1761;BA.debugLine="If CompareTrackPruneCandidates(leftItem, rightI";
if (_comparetrackprunecandidates(_leftitem,_rightitem)>0) { 
 //BA.debugLineNum = 1762;BA.debugLine="candidates.Set(i, rightItem)";
_candidates.Set(_i,(Object)(_rightitem.getObject()));
 //BA.debugLineNum = 1763;BA.debugLine="candidates.Set(j, leftItem)";
_candidates.Set(_j,(Object)(_leftitem.getObject()));
 };
 }
};
 }
};
 //BA.debugLineNum = 1767;BA.debugLine="End Sub";
return "";
}
public String  _startcacheaudit() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub StartCacheAudit";
 //BA.debugLineNum = 76;BA.debugLine="If cacheAuditInProgress Then Return";
if (_cacheauditinprogress) { 
if (true) return "";};
 //BA.debugLineNum = 77;BA.debugLine="cacheAuditPendingTypes.Initialize";
_cacheauditpendingtypes.Initialize();
 //BA.debugLineNum = 78;BA.debugLine="cacheAuditPendingTypes.Add(\"ads\")";
_cacheauditpendingtypes.Add((Object)("ads"));
 //BA.debugLineNum = 79;BA.debugLine="cacheAuditPendingTypes.Add(\"tracks\")";
_cacheauditpendingtypes.Add((Object)("tracks"));
 //BA.debugLineNum = 80;BA.debugLine="cacheAuditCurrentType = \"\"";
_cacheauditcurrenttype = "";
 //BA.debugLineNum = 81;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
_cacheauditcurrentfilenames.Initialize();
 //BA.debugLineNum = 82;BA.debugLine="cacheAuditCurrentPosition = 0";
_cacheauditcurrentposition = (int) (0);
 //BA.debugLineNum = 83;BA.debugLine="cacheAuditSeenIds.Initialize";
_cacheauditseenids.Initialize();
 //BA.debugLineNum = 84;BA.debugLine="cacheAuditAdIndexChanged = False";
_cacheauditadindexchanged = __c.False;
 //BA.debugLineNum = 85;BA.debugLine="cacheAuditTrackIndexChanged = False";
_cacheaudittrackindexchanged = __c.False;
 //BA.debugLineNum = 86;BA.debugLine="cacheAuditAddedCount = 0";
_cacheauditaddedcount = (int) (0);
 //BA.debugLineNum = 87;BA.debugLine="cacheAuditRemovedCount = 0";
_cacheauditremovedcount = (int) (0);
 //BA.debugLineNum = 88;BA.debugLine="cacheAuditTempDeletedCount = 0";
_cacheaudittempdeletedcount = (int) (0);
 //BA.debugLineNum = 89;BA.debugLine="cacheAuditListingInProgress = False";
_cacheauditlistinginprogress = __c.False;
 //BA.debugLineNum = 90;BA.debugLine="cacheAuditListingDir = \"\"";
_cacheauditlistingdir = "";
 //BA.debugLineNum = 91;BA.debugLine="cacheAuditInProgress = True";
_cacheauditinprogress = __c.True;
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _startcacheauditfilelistingasync() throws Exception{
ResumableSub_StartCacheAuditFileListingAsync rsub = new ResumableSub_StartCacheAuditFileListingAsync(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_StartCacheAuditFileListingAsync extends BA.ResumableSub {
public ResumableSub_StartCacheAuditFileListingAsync(b4a.example.mediacache parent) {
this.parent = parent;
}
b4a.example.mediacache parent;
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
boolean _success = false;
anywheresoftware.b4a.objects.collections.List _files = null;
String _filename = "";
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1285;BA.debugLine="Dim listedFiles As List";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1286;BA.debugLine="listedFiles.Initialize";
_listedfiles.Initialize();
 //BA.debugLineNum = 1287;BA.debugLine="Wait For (File.ListFilesAsync(cacheAuditListingDi";
parent.__c.WaitFor("complete", ba, this, parent.__c.File.ListFilesAsync(ba,parent._cacheauditlistingdir));
this.state = 16;
return;
case 16:
//C
this.state = 1;
_success = (Boolean) result[0];
_files = (anywheresoftware.b4a.objects.collections.List) result[1];
;
 //BA.debugLineNum = 1288;BA.debugLine="If success And files.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_success && _files.IsInitialized()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 1289;BA.debugLine="listedFiles = files";
_listedfiles = _files;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 1291;BA.debugLine="Trace(\"Не удалось получить список файлов для ауд";
parent._trace("Не удалось получить список файлов для аудита кэша async. type="+parent._cacheauditcurrenttype+", success="+BA.ObjectToString(_success));
 if (true) break;
;
 //BA.debugLineNum = 1293;BA.debugLine="If cacheAuditCurrentFileNames.IsInitialized = Fal";

case 6:
//if
this.state = 11;
if (parent._cacheauditcurrentfilenames.IsInitialized()==parent.__c.False) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
parent._cacheauditcurrentfilenames.Initialize();
if (true) break;

case 11:
//C
this.state = 12;
;
 //BA.debugLineNum = 1294;BA.debugLine="cacheAuditCurrentFileNames.Clear";
parent._cacheauditcurrentfilenames.Clear();
 //BA.debugLineNum = 1295;BA.debugLine="For Each fileName As String In listedFiles";
if (true) break;

case 12:
//for
this.state = 15;
group11 = _listedfiles;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 15;
if (index11 < groupLen11) {
this.state = 14;
_filename = BA.ObjectToString(group11.Get(index11));}
if (true) break;

case 18:
//C
this.state = 17;
index11++;
if (true) break;

case 14:
//C
this.state = 18;
 //BA.debugLineNum = 1296;BA.debugLine="cacheAuditCurrentFileNames.Add(fileName)";
parent._cacheauditcurrentfilenames.Add((Object)(_filename));
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
;
 //BA.debugLineNum = 1298;BA.debugLine="cacheAuditListingInProgress = False";
parent._cacheauditlistinginprogress = parent.__c.False;
 //BA.debugLineNum = 1299;BA.debugLine="cacheAuditListingDir = \"\"";
parent._cacheauditlistingdir = "";
 //BA.debugLineNum = 1300;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 1301;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public long  _tolongdefault(Object _value,long _defaultvalue) throws Exception{
 //BA.debugLineNum = 1857;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
 //BA.debugLineNum = 1858;BA.debugLine="Try";
try { //BA.debugLineNum = 1859;BA.debugLine="If value = Null Then Return defaultValue";
if (_value== null) { 
if (true) return _defaultvalue;};
 //BA.debugLineNum = 1860;BA.debugLine="Return value";
if (true) return BA.ObjectToLongNumber(_value);
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 1862;BA.debugLine="Return defaultValue";
if (true) return _defaultvalue;
 };
 //BA.debugLineNum = 1864;BA.debugLine="End Sub";
return 0L;
}
public String  _touchcacheditem(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _itemid = "";
String _itemtype = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
 //BA.debugLineNum = 695;BA.debugLine="Public Sub TouchCachedItem(item As Map)";
 //BA.debugLineNum = 696;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 697;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 698;BA.debugLine="If itemId = \"\" Then Return";
if ((_itemid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 699;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 700;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
 //BA.debugLineNum = 701;BA.debugLine="If cachedAdIndex.ContainsKey(itemId) = False The";
if (_cachedadindex.ContainsKey((Object)(_itemid))==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 702;BA.debugLine="UpdateAdIndex(item, cachedAdIndex)";
_updateadindex(_item,_cachedadindex);
 //BA.debugLineNum = 703;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 705;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
 //BA.debugLineNum = 706;BA.debugLine="If cachedTrackIndex.ContainsKey(itemId) = False";
if (_cachedtrackindex.ContainsKey((Object)(_itemid))==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 707;BA.debugLine="UpdateTrackIndex(item, cachedTrackIndex)";
_updatetrackindex(_item,_cachedtrackindex);
 //BA.debugLineNum = 708;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(i";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedtrackindex.GetDefault((Object)(_itemid),__c.Null)));
 //BA.debugLineNum = 709;BA.debugLine="If entry.IsInitialized Then";
if (_entry.IsInitialized()) { 
 //BA.debugLineNum = 710;BA.debugLine="entry.Put(\"play_count\", entry.GetDefault(\"play_";
_entry.Put((Object)("play_count"),(Object)((double)(BA.ObjectToNumber(_entry.GetDefault((Object)("play_count"),(Object)(0))))+1));
 //BA.debugLineNum = 711;BA.debugLine="entry.Put(\"last_played_at\", DateTime.Now)";
_entry.Put((Object)("last_played_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 712;BA.debugLine="cachedTrackIndex.Put(itemId, entry)";
_cachedtrackindex.Put((Object)(_itemid),(Object)(_entry.getObject()));
 //BA.debugLineNum = 713;BA.debugLine="cachedTrackIndexDirty = True";
_cachedtrackindexdirty = __c.True;
 };
 };
 //BA.debugLineNum = 716;BA.debugLine="End Sub";
return "";
}
public String  _trace(String _message) throws Exception{
 //BA.debugLineNum = 1963;BA.debugLine="Private Sub Trace(message As String)";
 //BA.debugLineNum = 1964;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,_targetmodule,_tracesubname)) { 
 //BA.debugLineNum = 1965;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,_targetmodule,_tracesubname,(Object)(_message));
 };
 //BA.debugLineNum = 1967;BA.debugLine="End Sub";
return "";
}
public boolean  _tryhealtrackindexentry(String _trackid,anywheresoftware.b4a.objects.collections.Map _trackindex,String _trackdir,String _currentfilename) throws Exception{
String _expectedplaylistid = "";
anywheresoftware.b4a.objects.collections.Map _existingentry = null;
String _expectedfilename = "";
String _healedfilename = "";
 //BA.debugLineNum = 1139;BA.debugLine="Private Sub TryHealTrackIndexEntry(trackId As Stri";
 //BA.debugLineNum = 1140;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1141;BA.debugLine="If IsCachedFileUsable(trackDir, currentFileName)";
if (_iscachedfileusable(_trackdir,_currentfilename)) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1142;BA.debugLine="Dim expectedPlaylistId As String = \"\"";
_expectedplaylistid = "";
 //BA.debugLineNum = 1143;BA.debugLine="Dim existingEntry As Map = trackIndex.GetDefault(";
_existingentry = new anywheresoftware.b4a.objects.collections.Map();
_existingentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
 //BA.debugLineNum = 1144;BA.debugLine="If existingEntry.IsInitialized Then expectedPlayl";
if (_existingentry.IsInitialized()) { 
_expectedplaylistid = BA.ObjectToString(_existingentry.GetDefault((Object)("playlist_id"),(Object)("")));};
 //BA.debugLineNum = 1145;BA.debugLine="Dim expectedFileName As String = BuildTrackCacheR";
_expectedfilename = _buildtrackcacherelativefilename(_trackid,_expectedplaylistid);
 //BA.debugLineNum = 1146;BA.debugLine="If expectedFileName <> \"\" And expectedFileName <>";
if ((_expectedfilename).equals("") == false && (_expectedfilename).equals(_currentfilename) == false) { 
 //BA.debugLineNum = 1147;BA.debugLine="If IsCachedFileUsable(trackDir, expectedFileName";
if (_iscachedfileusable(_trackdir,_expectedfilename)) { 
 //BA.debugLineNum = 1148;BA.debugLine="If existingEntry.IsInitialized = False Then exi";
if (_existingentry.IsInitialized()==__c.False) { 
_existingentry.Initialize();};
 //BA.debugLineNum = 1149;BA.debugLine="existingEntry.Put(\"id\", trackId)";
_existingentry.Put((Object)("id"),(Object)(_trackid));
 //BA.debugLineNum = 1150;BA.debugLine="existingEntry.Put(\"playlist_id\", expectedPlayli";
_existingentry.Put((Object)("playlist_id"),(Object)(_expectedplaylistid));
 //BA.debugLineNum = 1151;BA.debugLine="existingEntry.Put(\"file_name\", expectedFileName";
_existingentry.Put((Object)("file_name"),(Object)(_expectedfilename));
 //BA.debugLineNum = 1152;BA.debugLine="existingEntry.Put(\"size_bytes\", GetFileSizeSafe";
_existingentry.Put((Object)("size_bytes"),(Object)(_getfilesizesafe(_trackdir,_expectedfilename)));
 //BA.debugLineNum = 1153;BA.debugLine="If existingEntry.ContainsKey(\"saved_at\") = Fals";
if (_existingentry.ContainsKey((Object)("saved_at"))==__c.False) { 
_existingentry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
 //BA.debugLineNum = 1154;BA.debugLine="existingEntry.Put(\"last_used_at\", DateTime.Now)";
_existingentry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 1155;BA.debugLine="trackIndex.Put(trackId, existingEntry)";
_trackindex.Put((Object)(_trackid),(Object)(_existingentry.getObject()));
 //BA.debugLineNum = 1156;BA.debugLine="cachedTrackIndexDirty = True";
_cachedtrackindexdirty = __c.True;
 //BA.debugLineNum = 1157;BA.debugLine="SaveTrackIndex";
_savetrackindex();
 //BA.debugLineNum = 1158;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
 //BA.debugLineNum = 1161;BA.debugLine="BackfillTrackIndexFromFiles";
_backfilltrackindexfromfiles();
 //BA.debugLineNum = 1162;BA.debugLine="Dim healedFileName As String = ResolveTrackCacheF";
_healedfilename = _resolvetrackcachefilename(_trackid,_cachedtrackindex);
 //BA.debugLineNum = 1163;BA.debugLine="If IsCachedFileUsable(trackDir, healedFileName) T";
if (_iscachedfileusable(_trackdir,_healedfilename)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1164;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 1165;BA.debugLine="End Sub";
return false;
}
public boolean  _tryrestoreexistingcachedmedia(String _itemtype,String _itemid,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _itemindex) throws Exception{
 //BA.debugLineNum = 1178;BA.debugLine="Private Sub TryRestoreExistingCachedMedia(itemType";
 //BA.debugLineNum = 1179;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1180;BA.debugLine="If IsCachedFileUsable(GetDirByItemType(itemType),";
if (_iscachedfileusable(_getdirbyitemtype(_itemtype),_resolveindexedfilename(_itemtype,_itemid,_itemindex))==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1181;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
 //BA.debugLineNum = 1182;BA.debugLine="UpdateAdIndex(item, itemIndex)";
_updateadindex(_item,_itemindex);
 //BA.debugLineNum = 1183;BA.debugLine="SaveAdIndex";
_saveadindex();
 //BA.debugLineNum = 1184;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 1186;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
 //BA.debugLineNum = 1187;BA.debugLine="UpdateTrackIndex(item, itemIndex)";
_updatetrackindex(_item,_itemindex);
 //BA.debugLineNum = 1188;BA.debugLine="SaveTrackIndex";
_savetrackindex();
 //BA.debugLineNum = 1189;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 1191;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 1192;BA.debugLine="End Sub";
return false;
}
public boolean  _tryrestoretrackbyexpectedpath(String _trackid,String _playlistid,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
String _relativefilename = "";
 //BA.debugLineNum = 586;BA.debugLine="Private Sub TryRestoreTrackByExpectedPath(trackId";
 //BA.debugLineNum = 587;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 588;BA.debugLine="Dim relativeFileName As String = BuildTrackCacheR";
_relativefilename = _buildtrackcacherelativefilename(_trackid,_playlistid);
 //BA.debugLineNum = 589;BA.debugLine="If IsCachedFileUsable(GetTracksDir, relativeFileN";
if (_iscachedfileusable(_gettracksdir(),_relativefilename)==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 590;BA.debugLine="EnsureTrackIndexEntry(trackId, playlistId, relati";
_ensuretrackindexentry(_trackid,_playlistid,_relativefilename);
 //BA.debugLineNum = 591;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
_updatetrackindex(_item,_trackindex);
 //BA.debugLineNum = 592;BA.debugLine="SaveTrackIndex";
_savetrackindex();
 //BA.debugLineNum = 593;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 594;BA.debugLine="End Sub";
return false;
}
public String  _updateadindex(anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _adindex) throws Exception{
String _adid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
 //BA.debugLineNum = 596;BA.debugLine="Private Sub UpdateAdIndex(ad As Map, adIndex As Ma";
 //BA.debugLineNum = 597;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 598;BA.debugLine="If adId = \"\" Then Return";
if ((_adid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 599;BA.debugLine="Dim entry As Map = adIndex.GetDefault(adId, Null)";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adindex.GetDefault((Object)(_adid),__c.Null)));
 //BA.debugLineNum = 600;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
 //BA.debugLineNum = 601;BA.debugLine="entry.Put(\"id\", adId)";
_entry.Put((Object)("id"),(Object)(_adid));
 //BA.debugLineNum = 602;BA.debugLine="entry.Put(\"title\", ad.GetDefault(\"title\", \"\"))";
_entry.Put((Object)("title"),_ad.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 603;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
 //BA.debugLineNum = 604;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 605;BA.debugLine="entry.Put(\"duration\", ad.GetDefault(\"duration\", 0";
_entry.Put((Object)("duration"),_ad.GetDefault((Object)("duration"),(Object)(0)));
 //BA.debugLineNum = 606;BA.debugLine="entry.Put(\"gain\", ad.GetDefault(\"gain\", 0))";
_entry.Put((Object)("gain"),_ad.GetDefault((Object)("gain"),(Object)(0)));
 //BA.debugLineNum = 607;BA.debugLine="adIndex.Put(adId, entry)";
_adindex.Put((Object)(_adid),(Object)(_entry.getObject()));
 //BA.debugLineNum = 608;BA.debugLine="cachedAdIndexDirty = True";
_cachedadindexdirty = __c.True;
 //BA.debugLineNum = 609;BA.debugLine="End Sub";
return "";
}
public String  _updatetrackindex(anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _playlistid = "";
String _filename = "";
 //BA.debugLineNum = 628;BA.debugLine="Private Sub UpdateTrackIndex(item As Map, trackInd";
 //BA.debugLineNum = 629;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 630;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 631;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
 //BA.debugLineNum = 632;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
 //BA.debugLineNum = 633;BA.debugLine="Dim playlistId As String = ResolveTrackPlaylistId";
_playlistid = _resolvetrackplaylistid(_item,_trackindex,_trackid);
 //BA.debugLineNum = 634;BA.debugLine="Dim fileName As String = BuildTrackCacheRelativeF";
_filename = _buildtrackcacherelativefilename(_trackid,_playlistid);
 //BA.debugLineNum = 635;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
 //BA.debugLineNum = 636;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));
 //BA.debugLineNum = 637;BA.debugLine="entry.Put(\"file_name\", fileName)";
_entry.Put((Object)("file_name"),(Object)(_filename));
 //BA.debugLineNum = 638;BA.debugLine="entry.Put(\"title\", item.GetDefault(\"title\", \"\"))";
_entry.Put((Object)("title"),_item.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 639;BA.debugLine="entry.Put(\"set\", item.GetDefault(\"set\", \"\"))";
_entry.Put((Object)("set"),_item.GetDefault((Object)("set"),(Object)("")));
 //BA.debugLineNum = 640;BA.debugLine="entry.Put(\"stream\", item.GetDefault(\"stream\", \"\")";
_entry.Put((Object)("stream"),_item.GetDefault((Object)("stream"),(Object)("")));
 //BA.debugLineNum = 641;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
 //BA.debugLineNum = 642;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 643;BA.debugLine="If entry.ContainsKey(\"play_count\") = False Then e";
if (_entry.ContainsKey((Object)("play_count"))==__c.False) { 
_entry.Put((Object)("play_count"),(Object)(0));};
 //BA.debugLineNum = 644;BA.debugLine="If entry.ContainsKey(\"last_played_at\") = False Th";
if (_entry.ContainsKey((Object)("last_played_at"))==__c.False) { 
_entry.Put((Object)("last_played_at"),(Object)(0));};
 //BA.debugLineNum = 645;BA.debugLine="entry.Put(\"gain\", item.GetDefault(\"gain\", 0))";
_entry.Put((Object)("gain"),_item.GetDefault((Object)("gain"),(Object)(0)));
 //BA.debugLineNum = 646;BA.debugLine="If IsCachedFileUsable(GetTracksDir, fileName) The";
if (_iscachedfileusable(_gettracksdir(),_filename)) { 
_entry.Put((Object)("size_bytes"),(Object)(_getfilesizesafe(_gettracksdir(),_filename)));};
 //BA.debugLineNum = 647;BA.debugLine="trackIndex.Put(trackId, entry)";
_trackindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
 //BA.debugLineNum = 648;BA.debugLine="cachedTrackIndexDirty = True";
_cachedtrackindexdirty = __c.True;
 //BA.debugLineNum = 649;BA.debugLine="End Sub";
return "";
}
public boolean  _validateindexedfile(String _itemtype,String _itemid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _auditindex = null;
String _auditdir = "";
String _filename = "";
 //BA.debugLineNum = 1111;BA.debugLine="Private Sub ValidateIndexedFile(itemType As String";
 //BA.debugLineNum = 1112;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1113;BA.debugLine="Dim auditIndex As Map = GetIndexByItemType(itemTy";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = _getindexbyitemtype(_itemtype);
 //BA.debugLineNum = 1114;BA.debugLine="Dim auditDir As String = GetDirByItemType(itemTyp";
_auditdir = _getdirbyitemtype(_itemtype);
 //BA.debugLineNum = 1115;BA.debugLine="Dim fileName As String = ResolveIndexedFileName(i";
_filename = _resolveindexedfilename(_itemtype,_itemid,_auditindex);
 //BA.debugLineNum = 1116;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
 //BA.debugLineNum = 1117;BA.debugLine="If TryHealTrackIndexEntry(itemId, auditIndex, au";
if (_tryhealtrackindexentry(_itemid,_auditindex,_auditdir,_filename)) { 
 //BA.debugLineNum = 1118;BA.debugLine="fileName = ResolveIndexedFileName(itemType, ite";
_filename = _resolveindexedfilename(_itemtype,_itemid,_auditindex);
 };
 };
 //BA.debugLineNum = 1121;BA.debugLine="If auditIndex.ContainsKey(itemId) = False Then";
if (_auditindex.ContainsKey((Object)(_itemid))==__c.False) { 
 //BA.debugLineNum = 1122;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
if (_iscachedfileusable(_auditdir,_filename)==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1123;BA.debugLine="RestoreIndexedFileById(itemId, auditIndex)";
_restoreindexedfilebyid(_itemid,_auditindex);
 //BA.debugLineNum = 1124;BA.debugLine="SaveIndexByItemType(itemType)";
_saveindexbyitemtype(_itemtype);
 //BA.debugLineNum = 1125;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 1127;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then Re";
if (_iscachedfileusable(_auditdir,_filename)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1128;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
 //BA.debugLineNum = 1129;BA.debugLine="If TryHealTrackIndexEntry(itemId, auditIndex, au";
if (_tryhealtrackindexentry(_itemid,_auditindex,_auditdir,_filename)) { 
 //BA.debugLineNum = 1130;BA.debugLine="fileName = ResolveIndexedFileName(itemType, ite";
_filename = _resolveindexedfilename(_itemtype,_itemid,_auditindex);
 //BA.debugLineNum = 1131;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then";
if (_iscachedfileusable(_auditdir,_filename)) { 
if (true) return __c.True;};
 };
 };
 //BA.debugLineNum = 1134;BA.debugLine="auditIndex.Remove(itemId)";
_auditindex.Remove((Object)(_itemid));
 //BA.debugLineNum = 1135;BA.debugLine="SaveIndexByItemType(itemType)";
_saveindexbyitemtype(_itemtype);
 //BA.debugLineNum = 1136;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 1137;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
