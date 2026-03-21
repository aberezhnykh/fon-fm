
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
public static RemoteObject _cachedadindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cachedtrackindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
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
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"adsDirName",_ref.getField(false, "_adsdirname"),"CACHE_AUDIT_BATCH_SIZE",_ref.getField(false, "_cache_audit_batch_size"),"cacheAuditAddedCount",_ref.getField(false, "_cacheauditaddedcount"),"cacheAuditAdIndexChanged",_ref.getField(false, "_cacheauditadindexchanged"),"cacheAuditCurrentFileNames",_ref.getField(false, "_cacheauditcurrentfilenames"),"cacheAuditCurrentPosition",_ref.getField(false, "_cacheauditcurrentposition"),"cacheAuditCurrentType",_ref.getField(false, "_cacheauditcurrenttype"),"cacheAuditInProgress",_ref.getField(false, "_cacheauditinprogress"),"cacheAuditPendingTypes",_ref.getField(false, "_cacheauditpendingtypes"),"cacheAuditRemovedCount",_ref.getField(false, "_cacheauditremovedcount"),"cacheAuditSeenIds",_ref.getField(false, "_cacheauditseenids"),"cacheAuditTempDeletedCount",_ref.getField(false, "_cacheaudittempdeletedcount"),"cacheAuditTrackIndexChanged",_ref.getField(false, "_cacheaudittrackindexchanged"),"cachedAdIndex",_ref.getField(false, "_cachedadindex"),"cachedTrackIndex",_ref.getField(false, "_cachedtrackindex"),"mediaDirName",_ref.getField(false, "_mediadirname"),"recentMediaNetworkFailure",_ref.getField(false, "_recentmedianetworkfailure"),"storage",_ref.getField(false, "_storage"),"storageDir",_ref.getField(false, "_storagedir"),"targetModule",_ref.getField(false, "_targetmodule"),"traceSubName",_ref.getField(false, "_tracesubname"),"tracksDirName",_ref.getField(false, "_tracksdirname")};
}
}