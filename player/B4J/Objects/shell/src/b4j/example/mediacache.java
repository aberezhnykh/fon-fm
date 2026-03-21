
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class mediacache {
    public static RemoteObject myClass;
	public mediacache() {
	}
    public static PCBA staticBA = new PCBA(null, mediacache.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _storagedir = RemoteObject.createImmutable("");
public static RemoteObject _storage = RemoteObject.declareNull("b4j.example.keyvaluestore");
public static RemoteObject _targetmodule = RemoteObject.declareNull("Object");
public static RemoteObject _tracesubname = RemoteObject.createImmutable("");
public static RemoteObject _mediadirname = RemoteObject.createImmutable("");
public static RemoteObject _adsdirname = RemoteObject.createImmutable("");
public static RemoteObject _tracksdirname = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"adsDirName",_ref.getField(false, "_adsdirname"),"mediaDirName",_ref.getField(false, "_mediadirname"),"storage",_ref.getField(false, "_storage"),"storageDir",_ref.getField(false, "_storagedir"),"targetModule",_ref.getField(false, "_targetmodule"),"traceSubName",_ref.getField(false, "_tracesubname"),"tracksDirName",_ref.getField(false, "_tracksdirname")};
}
}