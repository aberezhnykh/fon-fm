
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class playbacktraceuploader {
    public static RemoteObject myClass;
	public playbacktraceuploader() {
	}
    public static PCBA staticBA = new PCBA(null, playbacktraceuploader.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _statestore = RemoteObject.declareNull("b4j.example.playerstatestore");
public static RemoteObject _traceserviceref = RemoteObject.declareNull("b4j.example.traceservice");
public static RemoteObject _syncserviceref = RemoteObject.declareNull("b4j.example.networksyncservice");
public static RemoteObject _tracebaseurl = RemoteObject.createImmutable("");
public static RemoteObject _appversionvalue = RemoteObject.createImmutable("");
public static RemoteObject _uploadinprogress = RemoteObject.createImmutable(false);
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.platformbridge _platformbridge = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"appVersionValue",_ref.getField(false, "_appversionvalue"),"stateStore",_ref.getField(false, "_statestore"),"syncServiceRef",_ref.getField(false, "_syncserviceref"),"traceBaseUrl",_ref.getField(false, "_tracebaseurl"),"traceServiceRef",_ref.getField(false, "_traceserviceref"),"uploadInProgress",_ref.getField(false, "_uploadinprogress")};
}
}