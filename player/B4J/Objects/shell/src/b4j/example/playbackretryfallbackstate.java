
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class playbackretryfallbackstate {
    public static RemoteObject myClass;
	public playbackretryfallbackstate() {
	}
    public static PCBA staticBA = new PCBA(null, playbackretryfallbackstate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _localretrydelay = RemoteObject.createImmutable(0);
public static RemoteObject _serverretrydelay = RemoteObject.createImmutable(0);
public static RemoteObject _dispatchretryafter = RemoteObject.createImmutable(0);
public static RemoteObject _ismediapathdegraded = RemoteObject.createImmutable(false);
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DispatchRetryAfter",_ref.getField(false, "_dispatchretryafter"),"IsMediaPathDegraded",_ref.getField(false, "_ismediapathdegraded"),"LocalRetryDelay",_ref.getField(false, "_localretrydelay"),"ServerRetryDelay",_ref.getField(false, "_serverretrydelay")};
}
}