
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class playbackplayerslot {
    public static RemoteObject myClass;
	public playbackplayerslot() {
	}
    public static PCBA staticBA = new PCBA(null, playbackplayerslot.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _slotid = RemoteObject.createImmutable("");
public static RemoteObject _audiokey = RemoteObject.createImmutable("");
public static RemoteObject _role = RemoteObject.createImmutable("");
public static RemoteObject _state = RemoteObject.createImmutable("");
public static RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _lastprogressat = RemoteObject.createImmutable(0L);
public static RemoteObject _laststatechangedat = RemoteObject.createImmutable(0L);
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.platformbridge _platformbridge = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AudioKey",_ref.getField(false, "_audiokey"),"Item",_ref.getField(false, "_item"),"LastProgressAt",_ref.getField(false, "_lastprogressat"),"LastStateChangedAt",_ref.getField(false, "_laststatechangedat"),"Role",_ref.getField(false, "_role"),"SlotId",_ref.getField(false, "_slotid"),"State",_ref.getField(false, "_state")};
}
}