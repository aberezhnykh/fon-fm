
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class mediacache {
    public static RemoteObject myClass;
	public mediacache() {
	}
    public static PCBA staticBA = new PCBA(null, mediacache.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _storagedir = RemoteObject.createImmutable("");
public static RemoteObject _storage = RemoteObject.declareNull("b4j.example.keyvaluestore");
public static RemoteObject _targetmodule = RemoteObject.declareNull("Object");
public static RemoteObject _tracesubname = RemoteObject.createImmutable("");
public static RemoteObject _mediadirname = RemoteObject.createImmutable("");
public static RemoteObject _adsdirname = RemoteObject.createImmutable("");
public static RemoteObject _tracksdirname = RemoteObject.createImmutable("");
public static RemoteObject _cache_audit_batch_size = RemoteObject.createImmutable(0);
public static RemoteObject _ad_download_timeout_ms = RemoteObject.createImmutable(0);
public static RemoteObject _track_download_timeout_ms = RemoteObject.createImmutable(0);
public static RemoteObject _stream_xor_buffer_size = RemoteObject.createImmutable(0);
public static RemoteObject _track_cache_hard_limit_mb = RemoteObject.createImmutable(0L);
public static RemoteObject _track_cache_target_mb = RemoteObject.createImmutable(0L);
public static RemoteObject _min_free_disk_mb = RemoteObject.createImmutable(0L);
public static RemoteObject _min_free_disk_percent = RemoteObject.createImmutable(0);
public static RemoteObject _primary_temp_track_file = RemoteObject.createImmutable("");
public static RemoteObject _secondary_temp_track_file = RemoteObject.createImmutable("");
public static RemoteObject _cachedadindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cachedtrackindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cachedadindexdirty = RemoteObject.createImmutable(false);
public static RemoteObject _cachedtrackindexdirty = RemoteObject.createImmutable(false);
public static RemoteObject _playbacktemptrackids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cacheauditinprogress = RemoteObject.createImmutable(false);
public static RemoteObject _cacheauditpendingtypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _cacheauditcurrenttype = RemoteObject.createImmutable("");
public static RemoteObject _cacheauditcurrentfilenames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _cacheauditcurrentposition = RemoteObject.createImmutable(0);
public static RemoteObject _cacheauditseenids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cacheauditadindexchanged = RemoteObject.createImmutable(false);
public static RemoteObject _cacheaudittrackindexchanged = RemoteObject.createImmutable(false);
public static RemoteObject _cacheauditaddedcount = RemoteObject.createImmutable(0);
public static RemoteObject _cacheauditremovedcount = RemoteObject.createImmutable(0);
public static RemoteObject _cacheaudittempdeletedcount = RemoteObject.createImmutable(0);
public static RemoteObject _recentmedianetworkfailure = RemoteObject.createImmutable(false);
public static RemoteObject _prunelastcachebytes = RemoteObject.createImmutable(0L);
public static RemoteObject _prunelastfreebytes = RemoteObject.createImmutable(0L);
public static RemoteObject _cachedtrackcount = RemoteObject.createImmutable(0);
public static RemoteObject _cachedadcount = RemoteObject.createImmutable(0);
public static RemoteObject _cachedtrackbytes = RemoteObject.createImmutable(0L);
public static RemoteObject _cachedadbytes = RemoteObject.createImmutable(0L);
public static RemoteObject _cachedtrackplayliststats = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cacheauditlistinginprogress = RemoteObject.createImmutable(false);
public static RemoteObject _cacheauditlistingdir = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.platformbridge _platformbridge = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AD_DOWNLOAD_TIMEOUT_MS",_ref.getField(false, "_ad_download_timeout_ms"),"adsDirName",_ref.getField(false, "_adsdirname"),"CACHE_AUDIT_BATCH_SIZE",_ref.getField(false, "_cache_audit_batch_size"),"cacheAuditAddedCount",_ref.getField(false, "_cacheauditaddedcount"),"cacheAuditAdIndexChanged",_ref.getField(false, "_cacheauditadindexchanged"),"cacheAuditCurrentFileNames",_ref.getField(false, "_cacheauditcurrentfilenames"),"cacheAuditCurrentPosition",_ref.getField(false, "_cacheauditcurrentposition"),"cacheAuditCurrentType",_ref.getField(false, "_cacheauditcurrenttype"),"cacheAuditInProgress",_ref.getField(false, "_cacheauditinprogress"),"cacheAuditListingDir",_ref.getField(false, "_cacheauditlistingdir"),"cacheAuditListingInProgress",_ref.getField(false, "_cacheauditlistinginprogress"),"cacheAuditPendingTypes",_ref.getField(false, "_cacheauditpendingtypes"),"cacheAuditRemovedCount",_ref.getField(false, "_cacheauditremovedcount"),"cacheAuditSeenIds",_ref.getField(false, "_cacheauditseenids"),"cacheAuditTempDeletedCount",_ref.getField(false, "_cacheaudittempdeletedcount"),"cacheAuditTrackIndexChanged",_ref.getField(false, "_cacheaudittrackindexchanged"),"cachedAdBytes",_ref.getField(false, "_cachedadbytes"),"cachedAdCount",_ref.getField(false, "_cachedadcount"),"cachedAdIndex",_ref.getField(false, "_cachedadindex"),"cachedAdIndexDirty",_ref.getField(false, "_cachedadindexdirty"),"cachedTrackBytes",_ref.getField(false, "_cachedtrackbytes"),"cachedTrackCount",_ref.getField(false, "_cachedtrackcount"),"cachedTrackIndex",_ref.getField(false, "_cachedtrackindex"),"cachedTrackIndexDirty",_ref.getField(false, "_cachedtrackindexdirty"),"cachedTrackPlaylistStats",_ref.getField(false, "_cachedtrackplayliststats"),"mediaDirName",_ref.getField(false, "_mediadirname"),"MIN_FREE_DISK_MB",_ref.getField(false, "_min_free_disk_mb"),"MIN_FREE_DISK_PERCENT",_ref.getField(false, "_min_free_disk_percent"),"playbackTempTrackIds",_ref.getField(false, "_playbacktemptrackids"),"PRIMARY_TEMP_TRACK_FILE",_ref.getField(false, "_primary_temp_track_file"),"pruneLastCacheBytes",_ref.getField(false, "_prunelastcachebytes"),"pruneLastFreeBytes",_ref.getField(false, "_prunelastfreebytes"),"recentMediaNetworkFailure",_ref.getField(false, "_recentmedianetworkfailure"),"SECONDARY_TEMP_TRACK_FILE",_ref.getField(false, "_secondary_temp_track_file"),"storage",_ref.getField(false, "_storage"),"storageDir",_ref.getField(false, "_storagedir"),"STREAM_XOR_BUFFER_SIZE",_ref.getField(false, "_stream_xor_buffer_size"),"targetModule",_ref.getField(false, "_targetmodule"),"traceSubName",_ref.getField(false, "_tracesubname"),"TRACK_CACHE_HARD_LIMIT_MB",_ref.getField(false, "_track_cache_hard_limit_mb"),"TRACK_CACHE_TARGET_MB",_ref.getField(false, "_track_cache_target_mb"),"TRACK_DOWNLOAD_TIMEOUT_MS",_ref.getField(false, "_track_download_timeout_ms"),"tracksDirName",_ref.getField(false, "_tracksdirname")};
}
}