
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class offlinestore {
    public static RemoteObject myClass;
	public offlinestore() {
	}
    public static PCBA staticBA = new PCBA(null, offlinestore.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _storagedir = RemoteObject.createImmutable("");
public static RemoteObject _storage = RemoteObject.declareNull("b4j.example.keyvaluestore");
public static RemoteObject _targetmodule = RemoteObject.declareNull("Object");
public static RemoteObject _tracesubname = RemoteObject.createImmutable("");
public static RemoteObject _offlinedatafilename = RemoteObject.createImmutable("");
public static RemoteObject _offlineplaylistrequirementsfilename = RemoteObject.createImmutable("");
public static RemoteObject _offlineplaylistsdirname = RemoteObject.createImmutable("");
public static RemoteObject _playlistcdnbaseurl = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"offlineDataFileName",_ref.getField(false, "_offlinedatafilename"),"offlinePlaylistRequirementsFileName",_ref.getField(false, "_offlineplaylistrequirementsfilename"),"offlinePlaylistsDirName",_ref.getField(false, "_offlineplaylistsdirname"),"playlistCdnBaseUrl",_ref.getField(false, "_playlistcdnbaseurl"),"storage",_ref.getField(false, "_storage"),"storageDir",_ref.getField(false, "_storagedir"),"targetModule",_ref.getField(false, "_targetmodule"),"traceSubName",_ref.getField(false, "_tracesubname")};
}
}