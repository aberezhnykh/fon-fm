
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class playbackruntimestate {
    public static RemoteObject myClass;
	public playbackruntimestate() {
	}
    public static PCBA staticBA = new PCBA(null, playbackruntimestate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _activeaudiokey = RemoteObject.createImmutable("");
public static RemoteObject _preparedaudiokey = RemoteObject.createImmutable("");
public static RemoteObject _activeitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _prepareditem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _pendingplayaudiokey = RemoteObject.createImmutable("");
public static RemoteObject _pendingprepareaudiokey = RemoteObject.createImmutable("");
public static RemoteObject _pendingplayitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _pendingprepareitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _pendingplayfadeinms = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.platformbridge _platformbridge = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ActiveAudioKey",_ref.getField(false, "_activeaudiokey"),"ActiveItem",_ref.getField(false, "_activeitem"),"PendingPlayAudioKey",_ref.getField(false, "_pendingplayaudiokey"),"PendingPlayFadeInMs",_ref.getField(false, "_pendingplayfadeinms"),"PendingPlayItem",_ref.getField(false, "_pendingplayitem"),"PendingPrepareAudioKey",_ref.getField(false, "_pendingprepareaudiokey"),"PendingPrepareItem",_ref.getField(false, "_pendingprepareitem"),"PreparedAudioKey",_ref.getField(false, "_preparedaudiokey"),"PreparedItem",_ref.getField(false, "_prepareditem")};
}
}