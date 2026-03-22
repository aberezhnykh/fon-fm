
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class playbackdatapolicystate {
    public static RemoteObject myClass;
	public playbackdatapolicystate() {
	}
    public static PCBA staticBA = new PCBA(null, playbackdatapolicystate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _isofflinedatarefreshinprogress = RemoteObject.createImmutable(false);
public static RemoteObject _istrackcacherefreshinprogress = RemoteObject.createImmutable(false);
public static RemoteObject _islocalplaybackmode = RemoteObject.createImmutable(false);
public static RemoteObject _isplaybackpausedbypolicy = RemoteObject.createImmutable(false);
public static RemoteObject _resumeplaybackwhenserverallows = RemoteObject.createImmutable(false);
public static RemoteObject _lastofflinedatarefreshstate = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"IsLocalPlaybackMode",_ref.getField(false, "_islocalplaybackmode"),"IsOfflineDataRefreshInProgress",_ref.getField(false, "_isofflinedatarefreshinprogress"),"IsPlaybackPausedByPolicy",_ref.getField(false, "_isplaybackpausedbypolicy"),"IsTrackCacheRefreshInProgress",_ref.getField(false, "_istrackcacherefreshinprogress"),"LastOfflineDataRefreshState",_ref.getField(false, "_lastofflinedatarefreshstate"),"ResumePlaybackWhenServerAllows",_ref.getField(false, "_resumeplaybackwhenserverallows")};
}
}