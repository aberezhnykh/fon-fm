
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class playerstatestore {
    public static RemoteObject myClass;
	public playerstatestore() {
	}
    public static PCBA staticBA = new PCBA(null, playerstatestore.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _owner = RemoteObject.declareNull("b4j.example.b4xmainpage");
public static RemoteObject _policystate = RemoteObject.declareNull("b4j.example.playbackdatapolicystate");
public static RemoteObject _orchestrationstateref = RemoteObject.declareNull("b4j.example.playbackorchestrationstate");
public static RemoteObject _retryfallbackstateref = RemoteObject.declareNull("b4j.example.playbackretryfallbackstate");
public static RemoteObject _queuestateref = RemoteObject.declareNull("b4j.example.playbackqueuestate");
public static RemoteObject _queuebuilderref = RemoteObject.declareNull("b4j.example.playbackqueuebuilder");
public static RemoteObject _offlinestoreref = RemoteObject.declareNull("b4j.example.offlinestore");
public static RemoteObject _dataresolverref = RemoteObject.declareNull("b4j.example.dataplaybackresolver");
public static RemoteObject _mediacacheref = RemoteObject.declareNull("b4j.example.mediacache");
public static RemoteObject _storageref = RemoteObject.declareNull("b4j.example.keyvaluestore");
public static RemoteObject _trustedsynctimekeyvalue = RemoteObject.createImmutable("");
public static RemoteObject _retrytimerref = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _offlinedataref = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _consecutivenetworkerrors = RemoteObject.createImmutable(0);
public static RemoteObject _lastretrymode = RemoteObject.createImmutable("");
public static RemoteObject _datasuccessatticks = RemoteObject.createImmutable(0L);
public static RemoteObject _historysuccessatticks = RemoteObject.createImmutable(0L);
public static RemoteObject _startupsequenceinprogress = RemoteObject.createImmutable(false);
public static RemoteObject _adwarmupdeferredafterstartup = RemoteObject.createImmutable(false);
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"adWarmupDeferredAfterStartup",_ref.getField(false, "_adwarmupdeferredafterstartup"),"consecutiveNetworkErrors",_ref.getField(false, "_consecutivenetworkerrors"),"dataResolverRef",_ref.getField(false, "_dataresolverref"),"dataSuccessAtTicks",_ref.getField(false, "_datasuccessatticks"),"historySuccessAtTicks",_ref.getField(false, "_historysuccessatticks"),"lastRetryMode",_ref.getField(false, "_lastretrymode"),"mediaCacheRef",_ref.getField(false, "_mediacacheref"),"offlineDataRef",_ref.getField(false, "_offlinedataref"),"offlineStoreRef",_ref.getField(false, "_offlinestoreref"),"orchestrationStateRef",_ref.getField(false, "_orchestrationstateref"),"owner",_ref.getField(false, "_owner"),"policyState",_ref.getField(false, "_policystate"),"queueBuilderRef",_ref.getField(false, "_queuebuilderref"),"queueStateRef",_ref.getField(false, "_queuestateref"),"retryFallbackStateRef",_ref.getField(false, "_retryfallbackstateref"),"retryTimerRef",_ref.getField(false, "_retrytimerref"),"startupSequenceInProgress",_ref.getField(false, "_startupsequenceinprogress"),"storageRef",_ref.getField(false, "_storageref"),"trustedSyncTimeKeyValue",_ref.getField(false, "_trustedsynctimekeyvalue")};
}
}