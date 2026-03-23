
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class playbacktracerouter {
    public static RemoteObject myClass;
	public playbacktracerouter() {
	}
    public static PCBA staticBA = new PCBA(null, playbacktracerouter.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _traceserviceref = RemoteObject.declareNull("b4j.example.traceservice");
public static RemoteObject _formatterref = RemoteObject.declareNull("b4j.example.playbacktraceformatter");
public static RemoteObject _releasebuild = RemoteObject.createImmutable(false);
public static RemoteObject _debugcontextlines = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"debugContextLines",_ref.getField(false, "_debugcontextlines"),"formatterRef",_ref.getField(false, "_formatterref"),"releaseBuild",_ref.getField(false, "_releasebuild"),"traceServiceRef",_ref.getField(false, "_traceserviceref")};
}
}