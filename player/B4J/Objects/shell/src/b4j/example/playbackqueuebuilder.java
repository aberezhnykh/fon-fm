
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class playbackqueuebuilder {
    public static RemoteObject myClass;
	public playbackqueuebuilder() {
	}
    public static PCBA staticBA = new PCBA(null, playbackqueuebuilder.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _targetmodule = RemoteObject.declareNull("Object");
public static RemoteObject _tracesubname = RemoteObject.createImmutable("");
public static RemoteObject _refreshdatasubname = RemoteObject.createImmutable("");
public static RemoteObject _ensureplaylistmetadatasubname = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ensurePlaylistMetadataSubName",_ref.getField(false, "_ensureplaylistmetadatasubname"),"refreshDataSubName",_ref.getField(false, "_refreshdatasubname"),"targetModule",_ref.getField(false, "_targetmodule"),"traceSubName",_ref.getField(false, "_tracesubname")};
}
}