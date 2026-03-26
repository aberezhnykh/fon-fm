
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class autonomouscachemanager {
    public static RemoteObject myClass;
	public autonomouscachemanager() {
	}
    public static PCBA staticBA = new PCBA(null, autonomouscachemanager.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _kvs = RemoteObject.declareNull("b4j.example.keyvaluestore");
public static RemoteObject _offlinestoreservice = RemoteObject.declareNull("b4j.example.offlinestore");
public static RemoteObject _dataresolverservice = RemoteObject.declareNull("b4j.example.dataplaybackresolver");
public static RemoteObject _mediacacheservice = RemoteObject.declareNull("b4j.example.mediacache");
public static RemoteObject _tracetarget = RemoteObject.declareNull("Object");
public static RemoteObject _tracesubname = RemoteObject.createImmutable("");
public static RemoteObject _workertimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _isrunning = RemoteObject.createImmutable(false);
public static RemoteObject _stepinprogress = RemoteObject.createImmutable(false);
public static RemoteObject _default_tick_interval_ms = RemoteObject.createImmutable(0);
public static RemoteObject _default_download_cooldown_ms = RemoteObject.createImmutable(0L);
public static RemoteObject _default_failure_cooldown_ms = RemoteObject.createImmutable(0L);
public static RemoteObject _default_prune_cooldown_ms = RemoteObject.createImmutable(0L);
public static RemoteObject _default_current_slot_min_reserve = RemoteObject.createImmutable(0);
public static RemoteObject _default_next_slot_min_reserve = RemoteObject.createImmutable(0);
public static RemoteObject _default_per_playlist_min_reserve = RemoteObject.createImmutable(0);
public static RemoteObject _default_max_downloads_per_step = RemoteObject.createImmutable(0);
public static RemoteObject _tickintervalms = RemoteObject.createImmutable(0);
public static RemoteObject _downloadcooldownms = RemoteObject.createImmutable(0L);
public static RemoteObject _failurecooldownms = RemoteObject.createImmutable(0L);
public static RemoteObject _prunecooldownms = RemoteObject.createImmutable(0L);
public static RemoteObject _currentslotminreserve = RemoteObject.createImmutable(0);
public static RemoteObject _nextslotminreserve = RemoteObject.createImmutable(0);
public static RemoteObject _perplaylistminreserve = RemoteObject.createImmutable(0);
public static RemoteObject _maxdownloadsperstep = RemoteObject.createImmutable(0);
public static RemoteObject _lastsuccessfuldownloadat = RemoteObject.createImmutable(0L);
public static RemoteObject _lastfailureat = RemoteObject.createImmutable(0L);
public static RemoteObject _lastpruneat = RemoteObject.createImmutable(0L);
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.platformbridge _platformbridge = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"currentSlotMinReserve",_ref.getField(false, "_currentslotminreserve"),"dataResolverService",_ref.getField(false, "_dataresolverservice"),"DEFAULT_CURRENT_SLOT_MIN_RESERVE",_ref.getField(false, "_default_current_slot_min_reserve"),"DEFAULT_DOWNLOAD_COOLDOWN_MS",_ref.getField(false, "_default_download_cooldown_ms"),"DEFAULT_FAILURE_COOLDOWN_MS",_ref.getField(false, "_default_failure_cooldown_ms"),"DEFAULT_MAX_DOWNLOADS_PER_STEP",_ref.getField(false, "_default_max_downloads_per_step"),"DEFAULT_NEXT_SLOT_MIN_RESERVE",_ref.getField(false, "_default_next_slot_min_reserve"),"DEFAULT_PER_PLAYLIST_MIN_RESERVE",_ref.getField(false, "_default_per_playlist_min_reserve"),"DEFAULT_PRUNE_COOLDOWN_MS",_ref.getField(false, "_default_prune_cooldown_ms"),"DEFAULT_TICK_INTERVAL_MS",_ref.getField(false, "_default_tick_interval_ms"),"downloadCooldownMs",_ref.getField(false, "_downloadcooldownms"),"failureCooldownMs",_ref.getField(false, "_failurecooldownms"),"isRunning",_ref.getField(false, "_isrunning"),"kvs",_ref.getField(false, "_kvs"),"lastFailureAt",_ref.getField(false, "_lastfailureat"),"lastPruneAt",_ref.getField(false, "_lastpruneat"),"lastSuccessfulDownloadAt",_ref.getField(false, "_lastsuccessfuldownloadat"),"maxDownloadsPerStep",_ref.getField(false, "_maxdownloadsperstep"),"mediaCacheService",_ref.getField(false, "_mediacacheservice"),"nextSlotMinReserve",_ref.getField(false, "_nextslotminreserve"),"offlineStoreService",_ref.getField(false, "_offlinestoreservice"),"perPlaylistMinReserve",_ref.getField(false, "_perplaylistminreserve"),"pruneCooldownMs",_ref.getField(false, "_prunecooldownms"),"stepInProgress",_ref.getField(false, "_stepinprogress"),"tickIntervalMs",_ref.getField(false, "_tickintervalms"),"traceSubName",_ref.getField(false, "_tracesubname"),"traceTarget",_ref.getField(false, "_tracetarget"),"workerTimer",_ref.getField(false, "_workertimer")};
}
}