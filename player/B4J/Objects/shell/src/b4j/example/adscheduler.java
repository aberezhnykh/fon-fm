
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class adscheduler {
    public static RemoteObject myClass;
	public adscheduler() {
	}
    public static PCBA staticBA = new PCBA(null, adscheduler.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _targetmodule = RemoteObject.declareNull("Object");
public static RemoteObject _tracesubname = RemoteObject.createImmutable("");
public static RemoteObject _adlabeltext = RemoteObject.createImmutable("");
public static RemoteObject _lastscanminutekey = RemoteObject.createImmutable("");
public static RemoteObject _lastinjectedminutekey = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"adLabelText",_ref.getField(false, "_adlabeltext"),"lastInjectedMinuteKey",_ref.getField(false, "_lastinjectedminutekey"),"lastScanMinuteKey",_ref.getField(false, "_lastscanminutekey"),"targetModule",_ref.getField(false, "_targetmodule"),"traceSubName",_ref.getField(false, "_tracesubname")};
}
}