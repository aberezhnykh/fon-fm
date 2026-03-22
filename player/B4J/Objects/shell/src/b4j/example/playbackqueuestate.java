
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class playbackqueuestate {
    public static RemoteObject myClass;
	public playbackqueuestate() {
	}
    public static PCBA staticBA = new PCBA(null, playbackqueuestate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _scheduledbreakat = RemoteObject.createImmutable(0L);
public static RemoteObject _skipqueuesnapshotrestoreonce = RemoteObject.createImmutable(false);
public static RemoteObject _stoppedreservequeue = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _stoppedreservesignature = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ScheduledBreakAt",_ref.getField(false, "_scheduledbreakat"),"SkipQueueSnapshotRestoreOnce",_ref.getField(false, "_skipqueuesnapshotrestoreonce"),"StoppedReserveQueue",_ref.getField(false, "_stoppedreservequeue"),"StoppedReserveSignature",_ref.getField(false, "_stoppedreservesignature")};
}
}