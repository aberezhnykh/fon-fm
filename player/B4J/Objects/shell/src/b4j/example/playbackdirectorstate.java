
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class playbackdirectorstate {
    public static RemoteObject myClass;
	public playbackdirectorstate() {
	}
    public static PCBA staticBA = new PCBA(null, playbackdirectorstate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _slots = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _istickinprogress = RemoteObject.createImmutable(false);
public static RemoteObject _decisionepoch = RemoteObject.createImmutable(0L);
public static RemoteObject _currentdecision = RemoteObject.createImmutable("");
public static RemoteObject _flowstate = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.platformbridge _platformbridge = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CurrentDecision",_ref.getField(false, "_currentdecision"),"DecisionEpoch",_ref.getField(false, "_decisionepoch"),"FlowState",_ref.getField(false, "_flowstate"),"IsTickInProgress",_ref.getField(false, "_istickinprogress"),"Slots",_ref.getField(false, "_slots")};
}
}