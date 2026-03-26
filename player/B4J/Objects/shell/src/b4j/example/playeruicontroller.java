
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class playeruicontroller {
    public static RemoteObject myClass;
	public playeruicontroller() {
	}
    public static PCBA staticBA = new PCBA(null, playeruicontroller.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lblstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblconnectionicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblheaderaction = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblsetupmessage = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblplayicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _confirmpane = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btnconfirmyes = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btnconfirmno = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _setuppane = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _playerpane = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _headeractionpane = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btnsetupsubmit = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtplayercode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtplayercodeview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _playbuttonpane = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _orbitpane = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _accesscirclepane = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _accesscorepane = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _accessinputpane = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _iconcloudok = RemoteObject.createImmutable("");
public static RemoteObject _iconcloudoff = RemoteObject.createImmutable("");
public static RemoteObject _iconclouddegraded = RemoteObject.createImmutable("");
public static RemoteObject _iconmore = RemoteObject.createImmutable("");
public static RemoteObject _iconclose = RemoteObject.createImmutable("");
public static RemoteObject _iconplay = RemoteObject.createImmutable("");
public static RemoteObject _iconstop = RemoteObject.createImmutable("");
public static RemoteObject _playiconbasesize = RemoteObject.createImmutable(0f);
public static RemoteObject _stopiconbasesize = RemoteObject.createImmutable(0f);
public static RemoteObject _headeractionfontsize = RemoteObject.createImmutable(0f);
public static RemoteObject _codefontsize = RemoteObject.createImmutable(0f);
public static RemoteObject _orbitfadevalue = RemoteObject.createImmutable(0);
public static RemoteObject _orbitfadetarget = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.platformbridge _platformbridge = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"accessCirclePane",_ref.getField(false, "_accesscirclepane"),"accessCorePane",_ref.getField(false, "_accesscorepane"),"accessInputPane",_ref.getField(false, "_accessinputpane"),"btnConfirmNo",_ref.getField(false, "_btnconfirmno"),"btnConfirmYes",_ref.getField(false, "_btnconfirmyes"),"btnSetupSubmit",_ref.getField(false, "_btnsetupsubmit"),"codeFontSize",_ref.getField(false, "_codefontsize"),"confirmPane",_ref.getField(false, "_confirmpane"),"headerActionFontSize",_ref.getField(false, "_headeractionfontsize"),"headerActionPane",_ref.getField(false, "_headeractionpane"),"iconClose",_ref.getField(false, "_iconclose"),"iconCloudDegraded",_ref.getField(false, "_iconclouddegraded"),"iconCloudOff",_ref.getField(false, "_iconcloudoff"),"iconCloudOk",_ref.getField(false, "_iconcloudok"),"iconMore",_ref.getField(false, "_iconmore"),"iconPlay",_ref.getField(false, "_iconplay"),"iconStop",_ref.getField(false, "_iconstop"),"lblConnectionIcon",_ref.getField(false, "_lblconnectionicon"),"lblHeader",_ref.getField(false, "_lblheader"),"lblHeaderAction",_ref.getField(false, "_lblheaderaction"),"lblInfo",_ref.getField(false, "_lblinfo"),"lblPlayIcon",_ref.getField(false, "_lblplayicon"),"lblSetupMessage",_ref.getField(false, "_lblsetupmessage"),"lblStream",_ref.getField(false, "_lblstream"),"orbitFadeTarget",_ref.getField(false, "_orbitfadetarget"),"orbitFadeValue",_ref.getField(false, "_orbitfadevalue"),"orbitPane",_ref.getField(false, "_orbitpane"),"playButtonPane",_ref.getField(false, "_playbuttonpane"),"playerPane",_ref.getField(false, "_playerpane"),"playIconBaseSize",_ref.getField(false, "_playiconbasesize"),"setupPane",_ref.getField(false, "_setuppane"),"stopIconBaseSize",_ref.getField(false, "_stopiconbasesize"),"txtPlayerCode",_ref.getField(false, "_txtplayercode"),"txtPlayerCodeView",_ref.getField(false, "_txtplayercodeview"),"xui",_ref.getField(false, "_xui")};
}
}