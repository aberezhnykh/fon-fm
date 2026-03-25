
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class playbackmetastate {
    public static RemoteObject myClass;
	public playbackmetastate() {
	}
    public static PCBA staticBA = new PCBA(null, playbackmetastate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _currentmediaurl = RemoteObject.createImmutable("");
public static RemoteObject _currentmediatype = RemoteObject.createImmutable("");
public static RemoteObject _currenttrackid = RemoteObject.createImmutable("");
public static RemoteObject _pendinghistoryitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _historystartedatticks = RemoteObject.createImmutable(0L);
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CurrentMediaType",_ref.getField(false, "_currentmediatype"),"CurrentMediaUrl",_ref.getField(false, "_currentmediaurl"),"CurrentTrackId",_ref.getField(false, "_currenttrackid"),"HistoryStartedAtTicks",_ref.getField(false, "_historystartedatticks"),"PendingHistoryItem",_ref.getField(false, "_pendinghistoryitem")};
}
}