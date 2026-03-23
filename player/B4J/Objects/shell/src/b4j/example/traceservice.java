
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class traceservice {
    public static RemoteObject myClass;
	public traceservice() {
	}
    public static PCBA staticBA = new PCBA(null, traceservice.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _storagedir = RemoteObject.createImmutable("");
public static RemoteObject _debugresponsesdir = RemoteObject.createImmutable("");
public static RemoteObject _tracelogs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _debuglogs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _pendingtracebatch = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _serversnapshots = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _traceloglimit = RemoteObject.createImmutable(0);
public static RemoteObject _serversnapshotlimit = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"debugLogs",_ref.getField(false, "_debuglogs"),"debugResponsesDir",_ref.getField(false, "_debugresponsesdir"),"pendingTraceBatch",_ref.getField(false, "_pendingtracebatch"),"serverSnapshotLimit",_ref.getField(false, "_serversnapshotlimit"),"serverSnapshots",_ref.getField(false, "_serversnapshots"),"storageDir",_ref.getField(false, "_storagedir"),"traceLogLimit",_ref.getField(false, "_traceloglimit"),"traceLogs",_ref.getField(false, "_tracelogs")};
}
}