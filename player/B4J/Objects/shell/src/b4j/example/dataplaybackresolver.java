
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class dataplaybackresolver {
    public static RemoteObject myClass;
	public dataplaybackresolver() {
	}
    public static PCBA staticBA = new PCBA(null, dataplaybackresolver.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _storagedir = RemoteObject.createImmutable("");
public static RemoteObject _targetmodule = RemoteObject.declareNull("Object");
public static RemoteObject _tracesubname = RemoteObject.createImmutable("");
public static RemoteObject _playlistcursors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _storageref = RemoteObject.declareNull("b4j.example.keyvaluestore");
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.platformbridge _platformbridge = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"playlistCursors",_ref.getField(false, "_playlistcursors"),"storageDir",_ref.getField(false, "_storagedir"),"storageRef",_ref.getField(false, "_storageref"),"targetModule",_ref.getField(false, "_targetmodule"),"traceSubName",_ref.getField(false, "_tracesubname")};
}
}