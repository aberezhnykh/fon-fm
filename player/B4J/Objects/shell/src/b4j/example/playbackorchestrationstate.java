
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class playbackorchestrationstate {
    public static RemoteObject myClass;
	public playbackorchestrationstate() {
	}
    public static PCBA staticBA = new PCBA(null, playbackorchestrationstate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _isstarted = RemoteObject.createImmutable(false);
public static RemoteObject _isstoppedbyuser = RemoteObject.createImmutable(false);
public static RemoteObject _isstopping = RemoteObject.createImmutable(false);
public static RemoteObject _prefetchdone = RemoteObject.createImmutable(false);
public static RemoteObject _iscrossfadetriggered = RemoteObject.createImmutable(false);
public static RemoteObject _isqueuebackfillinprogress = RemoteObject.createImmutable(false);
public static RemoteObject _isplaybackdispatchinprogress = RemoteObject.createImmutable(false);
public static RemoteObject _activedispatchinitiator = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ActiveDispatchInitiator",_ref.getField(false, "_activedispatchinitiator"),"IsCrossfadeTriggered",_ref.getField(false, "_iscrossfadetriggered"),"IsPlaybackDispatchInProgress",_ref.getField(false, "_isplaybackdispatchinprogress"),"IsQueueBackfillInProgress",_ref.getField(false, "_isqueuebackfillinprogress"),"IsStarted",_ref.getField(false, "_isstarted"),"IsStoppedByUser",_ref.getField(false, "_isstoppedbyuser"),"IsStopping",_ref.getField(false, "_isstopping"),"PrefetchDone",_ref.getField(false, "_prefetchdone")};
}
}