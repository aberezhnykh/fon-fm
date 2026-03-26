
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("b4j.example.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4j.example.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _labelname = RemoteObject.createImmutable("");
public static RemoteObject _versionname = RemoteObject.createImmutable("");
public static RemoteObject _versioncode = RemoteObject.createImmutable(0);
public static RemoteObject _hostargument = RemoteObject.createImmutable("");
public static RemoteObject _exitcodestop = RemoteObject.createImmutable(0);
public static RemoteObject _exitcodeapplyupdate = RemoteObject.createImmutable(0);
public static RemoteObject _exitcoderestart = RemoteObject.createImmutable(0);
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mainform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _startedbyhost = RemoteObject.createImmutable(false);
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.platformbridge _platformbridge = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(b4j.example.b4xcollections.class),"B4XPages",Debug.moduleToString(b4j.example.b4xpages.class),"ExitCodeApplyUpdate",main._exitcodeapplyupdate,"ExitCodeRestart",main._exitcoderestart,"ExitCodeStop",main._exitcodestop,"fx",main._fx,"HostArgument",main._hostargument,"HttpUtils2Service",Debug.moduleToString(b4j.example.httputils2service.class),"LabelName",main._labelname,"mainForm",main._mainform,"PlatformBridge",Debug.moduleToString(b4j.example.platformbridge.class),"startedByHost",main._startedbyhost,"UiStyle",Debug.moduleToString(b4j.example.uistyle.class),"VersionCode",main._versioncode,"VersionName",main._versionname};
}
}