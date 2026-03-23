package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playeruicontroller extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playeruicontroller", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playeruicontroller.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblstream = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblinfo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblheader = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblconnectionicon = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblheaderaction = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblsetupmessage = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblplayicon = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _confirmpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnconfirmyes = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnconfirmno = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _setuppane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _playerpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _headeractionpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsetupsubmit = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtplayercode = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtplayercodeview = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _playbuttonpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _orbitpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _accesscirclepane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _accesscorepane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _accessinputpane = null;
public String _iconcloudok = "";
public String _iconcloudoff = "";
public String _iconclouddegraded = "";
public String _iconmore = "";
public String _iconclose = "";
public String _iconplay = "";
public String _iconstop = "";
public float _playiconbasesize = 0f;
public float _stopiconbasesize = 0f;
public float _headeractionfontsize = 0f;
public float _codefontsize = 0f;
public double _orbitfadevalue = 0;
public double _orbitfadetarget = 0;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _applystoppedstate(b4j.example.playeruicontroller __ref,String _idletext) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "applystoppedstate", false))
	 {return ((String) Debug.delegate(ba, "applystoppedstate", new Object[] {_idletext}));}
RDebugUtils.currentLine=68157440;
 //BA.debugLineNum = 68157440;BA.debugLine="Public Sub ApplyStoppedState(idleText As String)";
RDebugUtils.currentLine=68157441;
 //BA.debugLineNum = 68157441;BA.debugLine="ShowStream(idleText)";
__ref._showstream /*String*/ (null,_idletext);
RDebugUtils.currentLine=68157442;
 //BA.debugLineNum = 68157442;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=68157443;
 //BA.debugLineNum = 68157443;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playeruicontroller __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xuivalue,anywheresoftware.b4a.objects.B4XViewWrapper _streamlabel,anywheresoftware.b4a.objects.B4XViewWrapper _infolabel,anywheresoftware.b4a.objects.B4XViewWrapper _headerlabel,anywheresoftware.b4a.objects.B4XViewWrapper _connectioniconlabel,anywheresoftware.b4a.objects.B4XViewWrapper _headeractionlabel,anywheresoftware.b4a.objects.B4XViewWrapper _setupmessagelabel,anywheresoftware.b4a.objects.B4XViewWrapper _playiconlabel,anywheresoftware.b4a.objects.B4XViewWrapper _confirmpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _confirmyesbutton,anywheresoftware.b4a.objects.B4XViewWrapper _confirmnobutton,anywheresoftware.b4a.objects.B4XViewWrapper _setuppanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _playerpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _headeractionpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _playbuttonpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _orbitpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _accesscirclepanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _accesscorepanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _accessinputpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _setupsubmitbutton,anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _playercodeinput,anywheresoftware.b4a.objects.B4XViewWrapper _playercodeinputview,String _iconcloudokvalue,String _iconcloudoffvalue,String _iconclouddegradedvalue,String _iconmorevalue,String _iconclosevalue,String _iconplayvalue,String _iconstopvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_xuivalue,_streamlabel,_infolabel,_headerlabel,_connectioniconlabel,_headeractionlabel,_setupmessagelabel,_playiconlabel,_confirmpanevalue,_confirmyesbutton,_confirmnobutton,_setuppanevalue,_playerpanevalue,_headeractionpanevalue,_playbuttonpanevalue,_orbitpanevalue,_accesscirclepanevalue,_accesscorepanevalue,_accessinputpanevalue,_setupsubmitbutton,_playercodeinput,_playercodeinputview,_iconcloudokvalue,_iconcloudoffvalue,_iconclouddegradedvalue,_iconmorevalue,_iconclosevalue,_iconplayvalue,_iconstopvalue}));}
RDebugUtils.currentLine=68091904;
 //BA.debugLineNum = 68091904;BA.debugLine="Public Sub Initialize(xuiValue As XUI, streamLabel";
RDebugUtils.currentLine=68091905;
 //BA.debugLineNum = 68091905;BA.debugLine="xui = xuiValue";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/  = _xuivalue;
RDebugUtils.currentLine=68091906;
 //BA.debugLineNum = 68091906;BA.debugLine="lblStream = streamLabel";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _streamlabel;
RDebugUtils.currentLine=68091907;
 //BA.debugLineNum = 68091907;BA.debugLine="lblInfo = infoLabel";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _infolabel;
RDebugUtils.currentLine=68091908;
 //BA.debugLineNum = 68091908;BA.debugLine="lblHeader = headerLabel";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _headerlabel;
RDebugUtils.currentLine=68091909;
 //BA.debugLineNum = 68091909;BA.debugLine="lblConnectionIcon = connectionIconLabel";
__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _connectioniconlabel;
RDebugUtils.currentLine=68091910;
 //BA.debugLineNum = 68091910;BA.debugLine="lblHeaderAction = headerActionLabel";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _headeractionlabel;
RDebugUtils.currentLine=68091911;
 //BA.debugLineNum = 68091911;BA.debugLine="lblSetupMessage = setupMessageLabel";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _setupmessagelabel;
RDebugUtils.currentLine=68091912;
 //BA.debugLineNum = 68091912;BA.debugLine="lblPlayIcon = playIconLabel";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _playiconlabel;
RDebugUtils.currentLine=68091913;
 //BA.debugLineNum = 68091913;BA.debugLine="confirmPane = confirmPaneValue";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _confirmpanevalue;
RDebugUtils.currentLine=68091914;
 //BA.debugLineNum = 68091914;BA.debugLine="btnConfirmYes = confirmYesButton";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _confirmyesbutton;
RDebugUtils.currentLine=68091915;
 //BA.debugLineNum = 68091915;BA.debugLine="btnConfirmNo = confirmNoButton";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _confirmnobutton;
RDebugUtils.currentLine=68091916;
 //BA.debugLineNum = 68091916;BA.debugLine="setupPane = setupPaneValue";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _setuppanevalue;
RDebugUtils.currentLine=68091917;
 //BA.debugLineNum = 68091917;BA.debugLine="playerPane = playerPaneValue";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _playerpanevalue;
RDebugUtils.currentLine=68091918;
 //BA.debugLineNum = 68091918;BA.debugLine="headerActionPane = headerActionPaneValue";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _headeractionpanevalue;
RDebugUtils.currentLine=68091919;
 //BA.debugLineNum = 68091919;BA.debugLine="playButtonPane = playButtonPaneValue";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _playbuttonpanevalue;
RDebugUtils.currentLine=68091920;
 //BA.debugLineNum = 68091920;BA.debugLine="orbitPane = orbitPaneValue";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _orbitpanevalue;
RDebugUtils.currentLine=68091921;
 //BA.debugLineNum = 68091921;BA.debugLine="accessCirclePane = accessCirclePaneValue";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _accesscirclepanevalue;
RDebugUtils.currentLine=68091922;
 //BA.debugLineNum = 68091922;BA.debugLine="accessCorePane = accessCorePaneValue";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _accesscorepanevalue;
RDebugUtils.currentLine=68091923;
 //BA.debugLineNum = 68091923;BA.debugLine="accessInputPane = accessInputPaneValue";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _accessinputpanevalue;
RDebugUtils.currentLine=68091924;
 //BA.debugLineNum = 68091924;BA.debugLine="btnSetupSubmit = setupSubmitButton";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _setupsubmitbutton;
RDebugUtils.currentLine=68091925;
 //BA.debugLineNum = 68091925;BA.debugLine="txtPlayerCode = playerCodeInput";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = _playercodeinput;
RDebugUtils.currentLine=68091926;
 //BA.debugLineNum = 68091926;BA.debugLine="txtPlayerCodeView = playerCodeInputView";
__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _playercodeinputview;
RDebugUtils.currentLine=68091927;
 //BA.debugLineNum = 68091927;BA.debugLine="iconCloudOk = iconCloudOkValue";
__ref._iconcloudok /*String*/  = _iconcloudokvalue;
RDebugUtils.currentLine=68091928;
 //BA.debugLineNum = 68091928;BA.debugLine="iconCloudOff = iconCloudOffValue";
__ref._iconcloudoff /*String*/  = _iconcloudoffvalue;
RDebugUtils.currentLine=68091929;
 //BA.debugLineNum = 68091929;BA.debugLine="iconCloudDegraded = iconCloudDegradedValue";
__ref._iconclouddegraded /*String*/  = _iconclouddegradedvalue;
RDebugUtils.currentLine=68091930;
 //BA.debugLineNum = 68091930;BA.debugLine="iconMore = iconMoreValue";
__ref._iconmore /*String*/  = _iconmorevalue;
RDebugUtils.currentLine=68091931;
 //BA.debugLineNum = 68091931;BA.debugLine="iconClose = iconCloseValue";
__ref._iconclose /*String*/  = _iconclosevalue;
RDebugUtils.currentLine=68091932;
 //BA.debugLineNum = 68091932;BA.debugLine="iconPlay = iconPlayValue";
__ref._iconplay /*String*/  = _iconplayvalue;
RDebugUtils.currentLine=68091933;
 //BA.debugLineNum = 68091933;BA.debugLine="iconStop = iconStopValue";
__ref._iconstop /*String*/  = _iconstopvalue;
RDebugUtils.currentLine=68091934;
 //BA.debugLineNum = 68091934;BA.debugLine="End Sub";
return "";
}
public String  _bringtofront(b4j.example.playeruicontroller __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "bringtofront", false))
	 {return ((String) Debug.delegate(ba, "bringtofront", new Object[] {_view}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=69861376;
 //BA.debugLineNum = 69861376;BA.debugLine="Public Sub BringToFront(view As B4XView)";
RDebugUtils.currentLine=69861377;
 //BA.debugLineNum = 69861377;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=69861378;
 //BA.debugLineNum = 69861378;BA.debugLine="jo.RunMethod(\"toFront\", Null)";
_jo.RunMethod("toFront",(Object[])(__c.Null));
RDebugUtils.currentLine=69861379;
 //BA.debugLineNum = 69861379;BA.debugLine="End Sub";
return "";
}
public String  _setstatustext(b4j.example.playeruicontroller __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "setstatustext", false))
	 {return ((String) Debug.delegate(ba, "setstatustext", new Object[] {_text}));}
RDebugUtils.currentLine=68747264;
 //BA.debugLineNum = 68747264;BA.debugLine="Public Sub SetStatusText(text As String)";
RDebugUtils.currentLine=68747265;
 //BA.debugLineNum = 68747265;BA.debugLine="lblInfo.Text = text";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
RDebugUtils.currentLine=68747266;
 //BA.debugLineNum = 68747266;BA.debugLine="End Sub";
return "";
}
public String  _configureplayerheader(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "configureplayerheader", false))
	 {return ((String) Debug.delegate(ba, "configureplayerheader", null));}
RDebugUtils.currentLine=69074944;
 //BA.debugLineNum = 69074944;BA.debugLine="Public Sub ConfigurePlayerHeader";
RDebugUtils.currentLine=69074945;
 //BA.debugLineNum = 69074945;BA.debugLine="headerActionPane.Visible = True";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=69074946;
 //BA.debugLineNum = 69074946;BA.debugLine="lblHeaderAction.Text = iconMore";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._iconmore /*String*/ );
RDebugUtils.currentLine=69074947;
 //BA.debugLineNum = 69074947;BA.debugLine="End Sub";
return "";
}
public String  _configuresetupscreen(b4j.example.playeruicontroller __ref,String _mode,String _formattedplayercode,String _messagetext,String _setuptitle,String _settingsthanks,String _submittext,String _logouttext) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "configuresetupscreen", false))
	 {return ((String) Debug.delegate(ba, "configuresetupscreen", new Object[] {_mode,_formattedplayercode,_messagetext,_setuptitle,_settingsthanks,_submittext,_logouttext}));}
boolean _issettingsmode = false;
RDebugUtils.currentLine=69009408;
 //BA.debugLineNum = 69009408;BA.debugLine="Public Sub ConfigureSetupScreen(mode As String, fo";
RDebugUtils.currentLine=69009409;
 //BA.debugLineNum = 69009409;BA.debugLine="Dim isSettingsMode As Boolean = mode = \"settings\"";
_issettingsmode = (_mode).equals("settings");
RDebugUtils.currentLine=69009410;
 //BA.debugLineNum = 69009410;BA.debugLine="headerActionPane.Visible = mode <> \"setup\"";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible((_mode).equals("setup") == false);
RDebugUtils.currentLine=69009411;
 //BA.debugLineNum = 69009411;BA.debugLine="If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=69009412;
 //BA.debugLineNum = 69009412;BA.debugLine="lblHeaderAction.Text = iconClose";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._iconclose /*String*/ );
RDebugUtils.currentLine=69009413;
 //BA.debugLineNum = 69009413;BA.debugLine="txtPlayerCode.Editable = False";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(__c.False);
RDebugUtils.currentLine=69009414;
 //BA.debugLineNum = 69009414;BA.debugLine="btnSetupSubmit.Text = logoutText.ToUpperCase";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_logouttext.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 }else {
RDebugUtils.currentLine=69009416;
 //BA.debugLineNum = 69009416;BA.debugLine="lblHeaderAction.Text = iconMore";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._iconmore /*String*/ );
RDebugUtils.currentLine=69009417;
 //BA.debugLineNum = 69009417;BA.debugLine="txtPlayerCode.Editable = True";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(__c.True);
RDebugUtils.currentLine=69009418;
 //BA.debugLineNum = 69009418;BA.debugLine="btnSetupSubmit.Text = submitText.ToUpperCase";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_submittext.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 };
RDebugUtils.currentLine=69009420;
 //BA.debugLineNum = 69009420;BA.debugLine="txtPlayerCode.Text = formattedPlayerCode";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_formattedplayercode);
RDebugUtils.currentLine=69009421;
 //BA.debugLineNum = 69009421;BA.debugLine="If messageText <> \"\" Then";
if ((_messagetext).equals("") == false) { 
RDebugUtils.currentLine=69009422;
 //BA.debugLineNum = 69009422;BA.debugLine="lblSetupMessage.Text = messageText";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_messagetext);
 }else 
{RDebugUtils.currentLine=69009423;
 //BA.debugLineNum = 69009423;BA.debugLine="Else If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=69009424;
 //BA.debugLineNum = 69009424;BA.debugLine="lblSetupMessage.Text = settingsThanks";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_settingsthanks);
 }else {
RDebugUtils.currentLine=69009426;
 //BA.debugLineNum = 69009426;BA.debugLine="lblSetupMessage.Text = setupTitle";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_setuptitle);
 }}
;
RDebugUtils.currentLine=69009428;
 //BA.debugLineNum = 69009428;BA.debugLine="If formattedPlayerCode = \"\" Then lblHeader.Text =";
if ((_formattedplayercode).equals("")) { 
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");};
RDebugUtils.currentLine=69009429;
 //BA.debugLineNum = 69009429;BA.debugLine="End Sub";
return "";
}
public String  _hidecontentblocks(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "hidecontentblocks", false))
	 {return ((String) Debug.delegate(ba, "hidecontentblocks", null));}
RDebugUtils.currentLine=68222976;
 //BA.debugLineNum = 68222976;BA.debugLine="Public Sub HideContentBlocks";
RDebugUtils.currentLine=68222977;
 //BA.debugLineNum = 68222977;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=68222978;
 //BA.debugLineNum = 68222978;BA.debugLine="SetStreamText(\"\")";
__ref._setstreamtext /*String*/ (null,"");
RDebugUtils.currentLine=68222979;
 //BA.debugLineNum = 68222979;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=68222980;
 //BA.debugLineNum = 68222980;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=68222981;
 //BA.debugLineNum = 68222981;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=68222982;
 //BA.debugLineNum = 68222982;BA.debugLine="End Sub";
return "";
}
public String  _hidepin(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "hidepin", false))
	 {return ((String) Debug.delegate(ba, "hidepin", null));}
RDebugUtils.currentLine=68485120;
 //BA.debugLineNum = 68485120;BA.debugLine="Public Sub HidePin";
RDebugUtils.currentLine=68485121;
 //BA.debugLineNum = 68485121;BA.debugLine="confirmPane.Visible = False";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=68485122;
 //BA.debugLineNum = 68485122;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=68485123;
 //BA.debugLineNum = 68485123;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=68485124;
 //BA.debugLineNum = 68485124;BA.debugLine="End Sub";
return "";
}
public boolean  _advanceorbitframe(b4j.example.playeruicontroller __ref,int _stepindex,double _fadestep) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "advanceorbitframe", false))
	 {return ((Boolean) Debug.delegate(ba, "advanceorbitframe", new Object[] {_stepindex,_fadestep}));}
RDebugUtils.currentLine=69599232;
 //BA.debugLineNum = 69599232;BA.debugLine="Public Sub AdvanceOrbitFrame(stepIndex As Int, fad";
RDebugUtils.currentLine=69599233;
 //BA.debugLineNum = 69599233;BA.debugLine="If orbitFadeValue < orbitFadeTarget Then";
if (__ref._orbitfadevalue /*double*/ <__ref._orbitfadetarget /*double*/ ) { 
RDebugUtils.currentLine=69599234;
 //BA.debugLineNum = 69599234;BA.debugLine="orbitFadeValue = Min(orbitFadeTarget, orbitFadeV";
__ref._orbitfadevalue /*double*/  = __c.Min(__ref._orbitfadetarget /*double*/ ,__ref._orbitfadevalue /*double*/ +_fadestep);
 }else 
{RDebugUtils.currentLine=69599235;
 //BA.debugLineNum = 69599235;BA.debugLine="Else If orbitFadeValue > orbitFadeTarget Then";
if (__ref._orbitfadevalue /*double*/ >__ref._orbitfadetarget /*double*/ ) { 
RDebugUtils.currentLine=69599236;
 //BA.debugLineNum = 69599236;BA.debugLine="orbitFadeValue = Max(orbitFadeTarget, orbitFadeV";
__ref._orbitfadevalue /*double*/  = __c.Max(__ref._orbitfadetarget /*double*/ ,__ref._orbitfadevalue /*double*/ -_fadestep);
 }}
;
RDebugUtils.currentLine=69599238;
 //BA.debugLineNum = 69599238;BA.debugLine="ApplyOrbitFrame(stepIndex)";
__ref._applyorbitframe /*String*/ (null,_stepindex);
RDebugUtils.currentLine=69599239;
 //BA.debugLineNum = 69599239;BA.debugLine="Return orbitFadeValue = 0 And orbitFadeTarget = 0";
if (true) return __ref._orbitfadevalue /*double*/ ==0 && __ref._orbitfadetarget /*double*/ ==0;
RDebugUtils.currentLine=69599240;
 //BA.debugLineNum = 69599240;BA.debugLine="End Sub";
return false;
}
public String  _renderplayerhead(b4j.example.playeruicontroller __ref,String _formattedcode,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "renderplayerhead", false))
	 {return ((String) Debug.delegate(ba, "renderplayerhead", new Object[] {_formattedcode,_title}));}
RDebugUtils.currentLine=68878336;
 //BA.debugLineNum = 68878336;BA.debugLine="Public Sub RenderPlayerHead(formattedCode As Strin";
RDebugUtils.currentLine=68878337;
 //BA.debugLineNum = 68878337;BA.debugLine="If title <> \"\" Then";
if ((_title).equals("") == false) { 
RDebugUtils.currentLine=68878338;
 //BA.debugLineNum = 68878338;BA.debugLine="lblHeader.Text = formattedCode & \" • \" & title.T";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_formattedcode+" • "+_title.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 }else {
RDebugUtils.currentLine=68878340;
 //BA.debugLineNum = 68878340;BA.debugLine="lblHeader.Text = formattedCode";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_formattedcode);
 };
RDebugUtils.currentLine=68878342;
 //BA.debugLineNum = 68878342;BA.debugLine="End Sub";
return "";
}
public String  _setplayicon(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "setplayicon", false))
	 {return ((String) Debug.delegate(ba, "setplayicon", null));}
RDebugUtils.currentLine=69271552;
 //BA.debugLineNum = 69271552;BA.debugLine="Public Sub SetPlayIcon";
RDebugUtils.currentLine=69271553;
 //BA.debugLineNum = 69271553;BA.debugLine="UiStyle.SetLabelStyle(lblPlayIcon, \"-fx-alignment";
_uistyle._setlabelstyle /*String*/ (__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+_uistyle._colortocss /*String*/ (((int)0xffd0ff71))+"; -fx-padding: 0;");
RDebugUtils.currentLine=69271554;
 //BA.debugLineNum = 69271554;BA.debugLine="lblPlayIcon.Text = iconPlay";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._iconplay /*String*/ );
RDebugUtils.currentLine=69271555;
 //BA.debugLineNum = 69271555;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblPlayIcon, p";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._playiconbasesize /*float*/ );
RDebugUtils.currentLine=69271556;
 //BA.debugLineNum = 69271556;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x00d0ff71),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=69271557;
 //BA.debugLineNum = 69271557;BA.debugLine="StopOrbitAnimation";
__ref._stoporbitanimation /*String*/ (null);
RDebugUtils.currentLine=69271558;
 //BA.debugLineNum = 69271558;BA.debugLine="UpdatePlayButtonAppearance(False, False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False,__c.False);
RDebugUtils.currentLine=69271559;
 //BA.debugLineNum = 69271559;BA.debugLine="End Sub";
return "";
}
public boolean  _isorbitidle(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "isorbitidle", false))
	 {return ((Boolean) Debug.delegate(ba, "isorbitidle", null));}
RDebugUtils.currentLine=70057984;
 //BA.debugLineNum = 70057984;BA.debugLine="Public Sub IsOrbitIdle As Boolean";
RDebugUtils.currentLine=70057985;
 //BA.debugLineNum = 70057985;BA.debugLine="Return orbitFadeValue = 0 And orbitFadeTarget = 0";
if (true) return __ref._orbitfadevalue /*double*/ ==0 && __ref._orbitfadetarget /*double*/ ==0;
RDebugUtils.currentLine=70057986;
 //BA.debugLineNum = 70057986;BA.debugLine="End Sub";
return false;
}
public String  _setstopicon(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "setstopicon", false))
	 {return ((String) Debug.delegate(ba, "setstopicon", null));}
RDebugUtils.currentLine=69337088;
 //BA.debugLineNum = 69337088;BA.debugLine="Public Sub SetStopIcon";
RDebugUtils.currentLine=69337089;
 //BA.debugLineNum = 69337089;BA.debugLine="UiStyle.SetLabelStyle(lblPlayIcon, \"-fx-alignment";
_uistyle._setlabelstyle /*String*/ (__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+_uistyle._colortocss /*String*/ (((int)0xffd0ff71))+"; -fx-padding: 0;");
RDebugUtils.currentLine=69337090;
 //BA.debugLineNum = 69337090;BA.debugLine="lblPlayIcon.Text = iconStop";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._iconstop /*String*/ );
RDebugUtils.currentLine=69337091;
 //BA.debugLineNum = 69337091;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblPlayIcon, s";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._stopiconbasesize /*float*/ );
RDebugUtils.currentLine=69337092;
 //BA.debugLineNum = 69337092;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x66d0ff71),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=69337093;
 //BA.debugLineNum = 69337093;BA.debugLine="StartOrbitAnimation";
__ref._startorbitanimation /*String*/ (null);
RDebugUtils.currentLine=69337094;
 //BA.debugLineNum = 69337094;BA.debugLine="UpdatePlayButtonAppearance(False, True)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False,__c.True);
RDebugUtils.currentLine=69337095;
 //BA.debugLineNum = 69337095;BA.debugLine="End Sub";
return "";
}
public String  _showadmeta(b4j.example.playeruicontroller __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "showadmeta", false))
	 {return ((String) Debug.delegate(ba, "showadmeta", new Object[] {_item}));}
RDebugUtils.currentLine=68616192;
 //BA.debugLineNum = 68616192;BA.debugLine="Public Sub ShowAdMeta(item As Map)";
RDebugUtils.currentLine=68616193;
 //BA.debugLineNum = 68616193;BA.debugLine="SetStatusText(item.GetDefault(\"title\", \"\"))";
__ref._setstatustext /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("title"),(Object)(""))));
RDebugUtils.currentLine=68616194;
 //BA.debugLineNum = 68616194;BA.debugLine="End Sub";
return "";
}
public String  _showclaimprompt(b4j.example.playeruicontroller __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "showclaimprompt", false))
	 {return ((String) Debug.delegate(ba, "showclaimprompt", new Object[] {_text}));}
RDebugUtils.currentLine=68419584;
 //BA.debugLineNum = 68419584;BA.debugLine="Public Sub ShowClaimPrompt(text As String)";
RDebugUtils.currentLine=68419585;
 //BA.debugLineNum = 68419585;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=68419586;
 //BA.debugLineNum = 68419586;BA.debugLine="SetStatusText(text)";
__ref._setstatustext /*String*/ (null,_text);
RDebugUtils.currentLine=68419587;
 //BA.debugLineNum = 68419587;BA.debugLine="confirmPane.Visible = True";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=68419588;
 //BA.debugLineNum = 68419588;BA.debugLine="End Sub";
return "";
}
public String  _showmessage(b4j.example.playeruicontroller __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "showmessage", false))
	 {return ((String) Debug.delegate(ba, "showmessage", new Object[] {_text}));}
RDebugUtils.currentLine=68354048;
 //BA.debugLineNum = 68354048;BA.debugLine="Public Sub ShowMessage(text As String)";
RDebugUtils.currentLine=68354049;
 //BA.debugLineNum = 68354049;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=68354050;
 //BA.debugLineNum = 68354050;BA.debugLine="SetStatusText(text)";
__ref._setstatustext /*String*/ (null,_text);
RDebugUtils.currentLine=68354051;
 //BA.debugLineNum = 68354051;BA.debugLine="End Sub";
return "";
}
public String  _showstream(b4j.example.playeruicontroller __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "showstream", false))
	 {return ((String) Debug.delegate(ba, "showstream", new Object[] {_text}));}
RDebugUtils.currentLine=68288512;
 //BA.debugLineNum = 68288512;BA.debugLine="Public Sub ShowStream(text As String)";
RDebugUtils.currentLine=68288513;
 //BA.debugLineNum = 68288513;BA.debugLine="SetStreamText(text)";
__ref._setstreamtext /*String*/ (null,_text);
RDebugUtils.currentLine=68288514;
 //BA.debugLineNum = 68288514;BA.debugLine="End Sub";
return "";
}
public String  _showtrackmeta(b4j.example.playeruicontroller __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "showtrackmeta", false))
	 {return ((String) Debug.delegate(ba, "showtrackmeta", new Object[] {_item}));}
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=68550656;
 //BA.debugLineNum = 68550656;BA.debugLine="Public Sub ShowTrackMeta(item As Map)";
RDebugUtils.currentLine=68550657;
 //BA.debugLineNum = 68550657;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=68550658;
 //BA.debugLineNum = 68550658;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=68550659;
 //BA.debugLineNum = 68550659;BA.debugLine="If item.GetDefault(\"set\", \"\") <> \"\" Then parts.Ad";
if ((_item.GetDefault((Object)("set"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add(_item.Get((Object)("set")));};
RDebugUtils.currentLine=68550660;
 //BA.debugLineNum = 68550660;BA.debugLine="If item.GetDefault(\"code\", \"\") <> \"\" Then parts.A";
if ((_item.GetDefault((Object)("code"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add(_item.Get((Object)("code")));};
RDebugUtils.currentLine=68550661;
 //BA.debugLineNum = 68550661;BA.debugLine="SetStatusText(JoinList(parts, \" • \"))";
__ref._setstatustext /*String*/ (null,__ref._joinlist /*String*/ (null,_parts," • "));
RDebugUtils.currentLine=68550662;
 //BA.debugLineNum = 68550662;BA.debugLine="End Sub";
return "";
}
public String  _updatecodeinputappearance(b4j.example.playeruicontroller __ref,boolean _isfocused) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "updatecodeinputappearance", false))
	 {return ((String) Debug.delegate(ba, "updatecodeinputappearance", new Object[] {_isfocused}));}
int _fillcolor = 0;
int _bordercolor = 0;
int _orbitbordercolor = 0;
RDebugUtils.currentLine=69795840;
 //BA.debugLineNum = 69795840;BA.debugLine="Public Sub UpdateCodeInputAppearance(isFocused As";
RDebugUtils.currentLine=69795841;
 //BA.debugLineNum = 69795841;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=69795842;
 //BA.debugLineNum = 69795842;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=69795843;
 //BA.debugLineNum = 69795843;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
RDebugUtils.currentLine=69795844;
 //BA.debugLineNum = 69795844;BA.debugLine="If isFocused Then";
if (_isfocused) { 
RDebugUtils.currentLine=69795845;
 //BA.debugLineNum = 69795845;BA.debugLine="fillColor = 0x10FFFFFF";
_fillcolor = ((int)0x10ffffff);
RDebugUtils.currentLine=69795846;
 //BA.debugLineNum = 69795846;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
RDebugUtils.currentLine=69795847;
 //BA.debugLineNum = 69795847;BA.debugLine="orbitBorderColor = 0x88FFFFFF";
_orbitbordercolor = ((int)0x88ffffff);
 }else {
RDebugUtils.currentLine=69795849;
 //BA.debugLineNum = 69795849;BA.debugLine="fillColor = 0x07FFFFFF";
_fillcolor = ((int)0x07ffffff);
RDebugUtils.currentLine=69795850;
 //BA.debugLineNum = 69795850;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
RDebugUtils.currentLine=69795851;
 //BA.debugLineNum = 69795851;BA.debugLine="orbitBorderColor = 0x66FFFFFF";
_orbitbordercolor = ((int)0x66ffffff);
 };
RDebugUtils.currentLine=69795853;
 //BA.debugLineNum = 69795853;BA.debugLine="accessCirclePane.SetColorAndBorder(fillColor, 4di";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=69795854;
 //BA.debugLineNum = 69795854;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=69795855;
 //BA.debugLineNum = 69795855;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0);
RDebugUtils.currentLine=69795856;
 //BA.debugLineNum = 69795856;BA.debugLine="UiStyle.SetPaneStyle(accessCirclePane, \"-fx-backg";
_uistyle._setpanestyle /*String*/ (__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=69795857;
 //BA.debugLineNum = 69795857;BA.debugLine="UiStyle.SetPaneStyle(accessCorePane, \"-fx-backgro";
_uistyle._setpanestyle /*String*/ (__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=69795858;
 //BA.debugLineNum = 69795858;BA.debugLine="UiStyle.SetPaneStyle(accessInputPane, \"-fx-backgr";
_uistyle._setpanestyle /*String*/ (__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;");
RDebugUtils.currentLine=69795859;
 //BA.debugLineNum = 69795859;BA.debugLine="UiStyle.SetPaneStyle(txtPlayerCodeView, \"-fx-back";
_uistyle._setpanestyle /*String*/ (__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-text-fill: "+_uistyle._colortocss /*String*/ (((int)0xfff2f7fb))+"; -fx-prompt-text-fill: "+_uistyle._colortocss /*String*/ (((int)0x66ffffff))+"; -fx-highlight-fill: transparent; -fx-highlight-text-fill: "+_uistyle._colortocss /*String*/ (((int)0xfff2f7fb))+"; -fx-display-caret: true; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-font-size: "+BA.NumberToString(__ref._codefontsize /*float*/ )+"px; -fx-font-weight: bold; -fx-padding: 0 0 2 0;");
RDebugUtils.currentLine=69795860;
 //BA.debugLineNum = 69795860;BA.debugLine="End Sub";
return "";
}
public String  _updateconnectionindicator(b4j.example.playeruicontroller __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "updateconnectionindicator", false))
	 {return ((String) Debug.delegate(ba, "updateconnectionindicator", new Object[] {_mode}));}
String _icontext = "";
int _iconcolor = 0;
RDebugUtils.currentLine=68812800;
 //BA.debugLineNum = 68812800;BA.debugLine="Public Sub UpdateConnectionIndicator(mode As Strin";
RDebugUtils.currentLine=68812801;
 //BA.debugLineNum = 68812801;BA.debugLine="If lblConnectionIcon.IsInitialized = False Then R";
if (__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=68812802;
 //BA.debugLineNum = 68812802;BA.debugLine="Dim iconText As String = iconCloudOk";
_icontext = __ref._iconcloudok /*String*/ ;
RDebugUtils.currentLine=68812803;
 //BA.debugLineNum = 68812803;BA.debugLine="Dim iconColor As Int = 0xFF747B86";
_iconcolor = ((int)0xff747b86);
RDebugUtils.currentLine=68812804;
 //BA.debugLineNum = 68812804;BA.debugLine="Select mode";
switch (BA.switchObjectToInt(_mode,"online","offline","server","degraded","connecting")) {
case 0: {
RDebugUtils.currentLine=68812806;
 //BA.debugLineNum = 68812806;BA.debugLine="iconText = iconCloudOk";
_icontext = __ref._iconcloudok /*String*/ ;
RDebugUtils.currentLine=68812807;
 //BA.debugLineNum = 68812807;BA.debugLine="iconColor = 0xFFD0FF71";
_iconcolor = ((int)0xffd0ff71);
 break; }
case 1: 
case 2: {
RDebugUtils.currentLine=68812809;
 //BA.debugLineNum = 68812809;BA.debugLine="iconText = iconCloudOff";
_icontext = __ref._iconcloudoff /*String*/ ;
RDebugUtils.currentLine=68812810;
 //BA.debugLineNum = 68812810;BA.debugLine="iconColor = 0xFFFF6B6B";
_iconcolor = ((int)0xffff6b6b);
 break; }
case 3: {
RDebugUtils.currentLine=68812812;
 //BA.debugLineNum = 68812812;BA.debugLine="iconText = iconCloudDegraded";
_icontext = __ref._iconclouddegraded /*String*/ ;
RDebugUtils.currentLine=68812813;
 //BA.debugLineNum = 68812813;BA.debugLine="iconColor = 0xFFFFD166";
_iconcolor = ((int)0xffffd166);
 break; }
case 4: {
RDebugUtils.currentLine=68812815;
 //BA.debugLineNum = 68812815;BA.debugLine="iconText = iconCloudOk";
_icontext = __ref._iconcloudok /*String*/ ;
RDebugUtils.currentLine=68812816;
 //BA.debugLineNum = 68812816;BA.debugLine="iconColor = 0xFF8E97A3";
_iconcolor = ((int)0xff8e97a3);
 break; }
}
;
RDebugUtils.currentLine=68812818;
 //BA.debugLineNum = 68812818;BA.debugLine="lblConnectionIcon.Text = iconText";
__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_icontext);
RDebugUtils.currentLine=68812819;
 //BA.debugLineNum = 68812819;BA.debugLine="UiStyle.SetLabelStyle(lblConnectionIcon, \"-fx-ali";
_uistyle._setlabelstyle /*String*/ (__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+_uistyle._colortocss /*String*/ (_iconcolor)+";");
RDebugUtils.currentLine=68812820;
 //BA.debugLineNum = 68812820;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblConnectionI";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (16));
RDebugUtils.currentLine=68812821;
 //BA.debugLineNum = 68812821;BA.debugLine="End Sub";
return "";
}
public String  _updateheaderactionappearance(b4j.example.playeruicontroller __ref,boolean _ishovered) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "updateheaderactionappearance", false))
	 {return ((String) Debug.delegate(ba, "updateheaderactionappearance", new Object[] {_ishovered}));}
int _fillcolor = 0;
int _bordercolor = 0;
int _textcolor = 0;
RDebugUtils.currentLine=69664768;
 //BA.debugLineNum = 69664768;BA.debugLine="Public Sub UpdateHeaderActionAppearance(isHovered";
RDebugUtils.currentLine=69664769;
 //BA.debugLineNum = 69664769;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=69664770;
 //BA.debugLineNum = 69664770;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=69664771;
 //BA.debugLineNum = 69664771;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=69664772;
 //BA.debugLineNum = 69664772;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=69664773;
 //BA.debugLineNum = 69664773;BA.debugLine="fillColor = 0x14FFFFFF";
_fillcolor = ((int)0x14ffffff);
RDebugUtils.currentLine=69664774;
 //BA.debugLineNum = 69664774;BA.debugLine="borderColor = 0x30FFFFFF";
_bordercolor = ((int)0x30ffffff);
RDebugUtils.currentLine=69664775;
 //BA.debugLineNum = 69664775;BA.debugLine="textColor = 0xFFDDE6EF";
_textcolor = ((int)0xffdde6ef);
 }else {
RDebugUtils.currentLine=69664777;
 //BA.debugLineNum = 69664777;BA.debugLine="fillColor = 0x08FFFFFF";
_fillcolor = ((int)0x08ffffff);
RDebugUtils.currentLine=69664778;
 //BA.debugLineNum = 69664778;BA.debugLine="borderColor = 0x18FFFFFF";
_bordercolor = ((int)0x18ffffff);
RDebugUtils.currentLine=69664779;
 //BA.debugLineNum = 69664779;BA.debugLine="textColor = 0xFFB9C0C9";
_textcolor = ((int)0xffb9c0c9);
 };
RDebugUtils.currentLine=69664781;
 //BA.debugLineNum = 69664781;BA.debugLine="headerActionPane.SetColorAndBorder(fillColor, 1di";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=69664782;
 //BA.debugLineNum = 69664782;BA.debugLine="UiStyle.SetPaneStyle(headerActionPane, \"-fx-curso";
_uistyle._setpanestyle /*String*/ (__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=69664783;
 //BA.debugLineNum = 69664783;BA.debugLine="UiStyle.SetLabelStyle(lblHeaderAction, \"-fx-align";
_uistyle._setlabelstyle /*String*/ (__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+_uistyle._colortocss /*String*/ (_textcolor)+";");
RDebugUtils.currentLine=69664784;
 //BA.debugLineNum = 69664784;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblHeaderActio";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._headeractionfontsize /*float*/ );
RDebugUtils.currentLine=69664785;
 //BA.debugLineNum = 69664785;BA.debugLine="End Sub";
return "";
}
public String  _updateplaybuttonappearance(b4j.example.playeruicontroller __ref,boolean _ishovered,boolean _isstarted) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "updateplaybuttonappearance", false))
	 {return ((String) Debug.delegate(ba, "updateplaybuttonappearance", new Object[] {_ishovered,_isstarted}));}
int _backgroundcolor = 0;
int _bordercolor = 0;
int _orbitbordercolor = 0;
RDebugUtils.currentLine=69402624;
 //BA.debugLineNum = 69402624;BA.debugLine="Public Sub UpdatePlayButtonAppearance(isHovered As";
RDebugUtils.currentLine=69402625;
 //BA.debugLineNum = 69402625;BA.debugLine="Dim backgroundColor As Int";
_backgroundcolor = 0;
RDebugUtils.currentLine=69402626;
 //BA.debugLineNum = 69402626;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=69402627;
 //BA.debugLineNum = 69402627;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
RDebugUtils.currentLine=69402628;
 //BA.debugLineNum = 69402628;BA.debugLine="If isStarted Then";
if (_isstarted) { 
RDebugUtils.currentLine=69402629;
 //BA.debugLineNum = 69402629;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=69402630;
 //BA.debugLineNum = 69402630;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=69402631;
 //BA.debugLineNum = 69402631;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
 }else {
RDebugUtils.currentLine=69402633;
 //BA.debugLineNum = 69402633;BA.debugLine="backgroundColor = 0x08FFFFFF";
_backgroundcolor = ((int)0x08ffffff);
RDebugUtils.currentLine=69402634;
 //BA.debugLineNum = 69402634;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
 };
 }else {
RDebugUtils.currentLine=69402637;
 //BA.debugLineNum = 69402637;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=69402638;
 //BA.debugLineNum = 69402638;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=69402639;
 //BA.debugLineNum = 69402639;BA.debugLine="borderColor = 0x55D0FF71";
_bordercolor = ((int)0x55d0ff71);
 }else {
RDebugUtils.currentLine=69402641;
 //BA.debugLineNum = 69402641;BA.debugLine="backgroundColor = 0x07FFFFFF";
_backgroundcolor = ((int)0x07ffffff);
RDebugUtils.currentLine=69402642;
 //BA.debugLineNum = 69402642;BA.debugLine="borderColor = 0x40FFFFFF";
_bordercolor = ((int)0x40ffffff);
 };
 };
RDebugUtils.currentLine=69402645;
 //BA.debugLineNum = 69402645;BA.debugLine="If isStarted Or isHovered Then";
if (_isstarted || _ishovered) { 
RDebugUtils.currentLine=69402646;
 //BA.debugLineNum = 69402646;BA.debugLine="orbitBorderColor = 0x66D0FF71";
_orbitbordercolor = ((int)0x66d0ff71);
 }else {
RDebugUtils.currentLine=69402648;
 //BA.debugLineNum = 69402648;BA.debugLine="orbitBorderColor = 0x22D0FF71";
_orbitbordercolor = ((int)0x22d0ff71);
 };
RDebugUtils.currentLine=69402650;
 //BA.debugLineNum = 69402650;BA.debugLine="playButtonPane.SetColorAndBorder(backgroundColor,";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_backgroundcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=69402651;
 //BA.debugLineNum = 69402651;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=69402652;
 //BA.debugLineNum = 69402652;BA.debugLine="End Sub";
return "";
}
public String  _updateresponsivestyles(b4j.example.playeruicontroller __ref,float _streamfontsize,float _infofontsize,float _playfontsize,float _stopfontsize,float _headeractionsizevalue,float _codesize,boolean _iscodeinputfocused,boolean _showstopicon) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "updateresponsivestyles", false))
	 {return ((String) Debug.delegate(ba, "updateresponsivestyles", new Object[] {_streamfontsize,_infofontsize,_playfontsize,_stopfontsize,_headeractionsizevalue,_codesize,_iscodeinputfocused,_showstopicon}));}
RDebugUtils.currentLine=69206016;
 //BA.debugLineNum = 69206016;BA.debugLine="Public Sub UpdateResponsiveStyles(streamFontSize A";
RDebugUtils.currentLine=69206017;
 //BA.debugLineNum = 69206017;BA.debugLine="playIconBaseSize = playFontSize";
__ref._playiconbasesize /*float*/  = _playfontsize;
RDebugUtils.currentLine=69206018;
 //BA.debugLineNum = 69206018;BA.debugLine="stopIconBaseSize = stopFontSize";
__ref._stopiconbasesize /*float*/  = _stopfontsize;
RDebugUtils.currentLine=69206019;
 //BA.debugLineNum = 69206019;BA.debugLine="headerActionFontSize = headerActionSizeValue";
__ref._headeractionfontsize /*float*/  = _headeractionsizevalue;
RDebugUtils.currentLine=69206020;
 //BA.debugLineNum = 69206020;BA.debugLine="codeFontSize = codeSize";
__ref._codefontsize /*float*/  = _codesize;
RDebugUtils.currentLine=69206021;
 //BA.debugLineNum = 69206021;BA.debugLine="lblStream.Font = xui.CreateDefaultBoldFont(stream";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont(_streamfontsize));
RDebugUtils.currentLine=69206022;
 //BA.debugLineNum = 69206022;BA.debugLine="lblInfo.Font = xui.CreateDefaultFont(infoFontSize";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont(_infofontsize));
RDebugUtils.currentLine=69206023;
 //BA.debugLineNum = 69206023;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblConnectionI";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (16));
RDebugUtils.currentLine=69206024;
 //BA.debugLineNum = 69206024;BA.debugLine="UpdateHeaderActionAppearance(False)";
__ref._updateheaderactionappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=69206025;
 //BA.debugLineNum = 69206025;BA.debugLine="UpdateCodeInputAppearance(isCodeInputFocused)";
__ref._updatecodeinputappearance /*String*/ (null,_iscodeinputfocused);
RDebugUtils.currentLine=69206026;
 //BA.debugLineNum = 69206026;BA.debugLine="If showStopIcon Then";
if (_showstopicon) { 
RDebugUtils.currentLine=69206027;
 //BA.debugLineNum = 69206027;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
 }else {
RDebugUtils.currentLine=69206029;
 //BA.debugLineNum = 69206029;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
 };
RDebugUtils.currentLine=69206031;
 //BA.debugLineNum = 69206031;BA.debugLine="End Sub";
return "";
}
public String  _updatetextbuttonappearance(b4j.example.playeruicontroller __ref,anywheresoftware.b4a.objects.B4XViewWrapper _buttonview,boolean _ishovered) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "updatetextbuttonappearance", false))
	 {return ((String) Debug.delegate(ba, "updatetextbuttonappearance", new Object[] {_buttonview,_ishovered}));}
int _fillcolor = 0;
int _bordercolor = 0;
int _textcolor = 0;
RDebugUtils.currentLine=69730304;
 //BA.debugLineNum = 69730304;BA.debugLine="Public Sub UpdateTextButtonAppearance(buttonView A";
RDebugUtils.currentLine=69730305;
 //BA.debugLineNum = 69730305;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=69730306;
 //BA.debugLineNum = 69730306;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=69730307;
 //BA.debugLineNum = 69730307;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=69730308;
 //BA.debugLineNum = 69730308;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=69730309;
 //BA.debugLineNum = 69730309;BA.debugLine="fillColor = 0x12FFFFFF";
_fillcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=69730310;
 //BA.debugLineNum = 69730310;BA.debugLine="borderColor = 0x34FFFFFF";
_bordercolor = ((int)0x34ffffff);
RDebugUtils.currentLine=69730311;
 //BA.debugLineNum = 69730311;BA.debugLine="textColor = 0xFFF2F7FB";
_textcolor = ((int)0xfff2f7fb);
 }else {
RDebugUtils.currentLine=69730313;
 //BA.debugLineNum = 69730313;BA.debugLine="fillColor = 0x06FFFFFF";
_fillcolor = ((int)0x06ffffff);
RDebugUtils.currentLine=69730314;
 //BA.debugLineNum = 69730314;BA.debugLine="borderColor = 0x1EFFFFFF";
_bordercolor = ((int)0x1effffff);
RDebugUtils.currentLine=69730315;
 //BA.debugLineNum = 69730315;BA.debugLine="textColor = 0xFFE0E4EA";
_textcolor = ((int)0xffe0e4ea);
 };
RDebugUtils.currentLine=69730317;
 //BA.debugLineNum = 69730317;BA.debugLine="buttonView.SetColorAndBorder(fillColor, 1dip, bor";
_buttonview.SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (12)));
RDebugUtils.currentLine=69730318;
 //BA.debugLineNum = 69730318;BA.debugLine="UiStyle.SetPaneStyle(buttonView, \"-fx-cursor: han";
_uistyle._setpanestyle /*String*/ (_buttonview,"-fx-cursor: hand; -fx-border-radius: 12; -fx-background-radius: 12; -fx-text-fill: "+_uistyle._colortocss /*String*/ (_textcolor)+";");
RDebugUtils.currentLine=69730319;
 //BA.debugLineNum = 69730319;BA.debugLine="buttonView.Font = xui.CreateDefaultBoldFont(13)";
_buttonview.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (13)));
RDebugUtils.currentLine=69730320;
 //BA.debugLineNum = 69730320;BA.debugLine="End Sub";
return "";
}
public String  _updatevisiblemode(b4j.example.playeruicontroller __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "updatevisiblemode", false))
	 {return ((String) Debug.delegate(ba, "updatevisiblemode", new Object[] {_mode}));}
RDebugUtils.currentLine=69140480;
 //BA.debugLineNum = 69140480;BA.debugLine="Public Sub UpdateVisibleMode(mode As String)";
RDebugUtils.currentLine=69140481;
 //BA.debugLineNum = 69140481;BA.debugLine="setupPane.Visible = mode <> \"player\"";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible((_mode).equals("player") == false);
RDebugUtils.currentLine=69140482;
 //BA.debugLineNum = 69140482;BA.debugLine="playerPane.Visible = mode = \"player\"";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible((_mode).equals("player"));
RDebugUtils.currentLine=69140483;
 //BA.debugLineNum = 69140483;BA.debugLine="If mode = \"setup\" Then headerActionPane.Visible =";
if ((_mode).equals("setup")) { 
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);};
RDebugUtils.currentLine=69140484;
 //BA.debugLineNum = 69140484;BA.debugLine="End Sub";
return "";
}
public String  _applyorbitframe(b4j.example.playeruicontroller __ref,int _stepindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "applyorbitframe", false))
	 {return ((String) Debug.delegate(ba, "applyorbitframe", new Object[] {_stepindex}));}
double _opacity = 0;
double _basephase = 0;
double _wave = 0;
RDebugUtils.currentLine=69926912;
 //BA.debugLineNum = 69926912;BA.debugLine="Private Sub ApplyOrbitFrame(stepIndex As Int)";
RDebugUtils.currentLine=69926913;
 //BA.debugLineNum = 69926913;BA.debugLine="Dim opacity As Double";
_opacity = 0;
RDebugUtils.currentLine=69926914;
 //BA.debugLineNum = 69926914;BA.debugLine="If orbitFadeValue <= 0 Then";
if (__ref._orbitfadevalue /*double*/ <=0) { 
RDebugUtils.currentLine=69926915;
 //BA.debugLineNum = 69926915;BA.debugLine="opacity = 0";
_opacity = 0;
 }else {
RDebugUtils.currentLine=69926917;
 //BA.debugLineNum = 69926917;BA.debugLine="Dim basePhase As Double = stepIndex / 24";
_basephase = _stepindex/(double)24;
RDebugUtils.currentLine=69926918;
 //BA.debugLineNum = 69926918;BA.debugLine="Dim wave As Double = (Sin(basePhase * cPI * 2) +";
_wave = (__c.Sin(_basephase*__c.cPI*2)+1)/(double)2;
RDebugUtils.currentLine=69926919;
 //BA.debugLineNum = 69926919;BA.debugLine="opacity = (0.38 + wave * 0.28) * orbitFadeValue";
_opacity = (0.38+_wave*0.28)*__ref._orbitfadevalue /*double*/ ;
 };
RDebugUtils.currentLine=69926921;
 //BA.debugLineNum = 69926921;BA.debugLine="ApplyOrbitState(opacity)";
__ref._applyorbitstate /*String*/ (null,_opacity);
RDebugUtils.currentLine=69926922;
 //BA.debugLineNum = 69926922;BA.debugLine="End Sub";
return "";
}
public String  _applyorbitstate(b4j.example.playeruicontroller __ref,double _opacity) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "applyorbitstate", false))
	 {return ((String) Debug.delegate(ba, "applyorbitstate", new Object[] {_opacity}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=69992448;
 //BA.debugLineNum = 69992448;BA.debugLine="Private Sub ApplyOrbitState(opacity As Double)";
RDebugUtils.currentLine=69992449;
 //BA.debugLineNum = 69992449;BA.debugLine="Dim jo As JavaObject = orbitPane";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=69992450;
 //BA.debugLineNum = 69992450;BA.debugLine="jo.RunMethod(\"setOpacity\", Array As Object(opacit";
_jo.RunMethod("setOpacity",new Object[]{(Object)(_opacity)});
RDebugUtils.currentLine=69992451;
 //BA.debugLineNum = 69992451;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
RDebugUtils.currentLine=68026368;
 //BA.debugLineNum = 68026368;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=68026369;
 //BA.debugLineNum = 68026369;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=68026370;
 //BA.debugLineNum = 68026370;BA.debugLine="Private lblStream As B4XView";
_lblstream = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026371;
 //BA.debugLineNum = 68026371;BA.debugLine="Private lblInfo As B4XView";
_lblinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026372;
 //BA.debugLineNum = 68026372;BA.debugLine="Private lblHeader As B4XView";
_lblheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026373;
 //BA.debugLineNum = 68026373;BA.debugLine="Private lblConnectionIcon As B4XView";
_lblconnectionicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026374;
 //BA.debugLineNum = 68026374;BA.debugLine="Private lblHeaderAction As B4XView";
_lblheaderaction = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026375;
 //BA.debugLineNum = 68026375;BA.debugLine="Private lblSetupMessage As B4XView";
_lblsetupmessage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026376;
 //BA.debugLineNum = 68026376;BA.debugLine="Private lblPlayIcon As B4XView";
_lblplayicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026377;
 //BA.debugLineNum = 68026377;BA.debugLine="Private confirmPane As B4XView";
_confirmpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026378;
 //BA.debugLineNum = 68026378;BA.debugLine="Private btnConfirmYes As B4XView";
_btnconfirmyes = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026379;
 //BA.debugLineNum = 68026379;BA.debugLine="Private btnConfirmNo As B4XView";
_btnconfirmno = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026380;
 //BA.debugLineNum = 68026380;BA.debugLine="Private setupPane As B4XView";
_setuppane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026381;
 //BA.debugLineNum = 68026381;BA.debugLine="Private playerPane As B4XView";
_playerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026382;
 //BA.debugLineNum = 68026382;BA.debugLine="Private headerActionPane As B4XView";
_headeractionpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026383;
 //BA.debugLineNum = 68026383;BA.debugLine="Private btnSetupSubmit As B4XView";
_btnsetupsubmit = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026384;
 //BA.debugLineNum = 68026384;BA.debugLine="Private txtPlayerCode As TextField";
_txtplayercode = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=68026385;
 //BA.debugLineNum = 68026385;BA.debugLine="Private txtPlayerCodeView As B4XView";
_txtplayercodeview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026386;
 //BA.debugLineNum = 68026386;BA.debugLine="Private playButtonPane As B4XView";
_playbuttonpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026387;
 //BA.debugLineNum = 68026387;BA.debugLine="Private orbitPane As B4XView";
_orbitpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026388;
 //BA.debugLineNum = 68026388;BA.debugLine="Private accessCirclePane As B4XView";
_accesscirclepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026389;
 //BA.debugLineNum = 68026389;BA.debugLine="Private accessCorePane As B4XView";
_accesscorepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026390;
 //BA.debugLineNum = 68026390;BA.debugLine="Private accessInputPane As B4XView";
_accessinputpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=68026391;
 //BA.debugLineNum = 68026391;BA.debugLine="Private iconCloudOk As String";
_iconcloudok = "";
RDebugUtils.currentLine=68026392;
 //BA.debugLineNum = 68026392;BA.debugLine="Private iconCloudOff As String";
_iconcloudoff = "";
RDebugUtils.currentLine=68026393;
 //BA.debugLineNum = 68026393;BA.debugLine="Private iconCloudDegraded As String";
_iconclouddegraded = "";
RDebugUtils.currentLine=68026394;
 //BA.debugLineNum = 68026394;BA.debugLine="Private iconMore As String";
_iconmore = "";
RDebugUtils.currentLine=68026395;
 //BA.debugLineNum = 68026395;BA.debugLine="Private iconClose As String";
_iconclose = "";
RDebugUtils.currentLine=68026396;
 //BA.debugLineNum = 68026396;BA.debugLine="Private iconPlay As String";
_iconplay = "";
RDebugUtils.currentLine=68026397;
 //BA.debugLineNum = 68026397;BA.debugLine="Private iconStop As String";
_iconstop = "";
RDebugUtils.currentLine=68026398;
 //BA.debugLineNum = 68026398;BA.debugLine="Private playIconBaseSize As Float";
_playiconbasesize = 0f;
RDebugUtils.currentLine=68026399;
 //BA.debugLineNum = 68026399;BA.debugLine="Private stopIconBaseSize As Float";
_stopiconbasesize = 0f;
RDebugUtils.currentLine=68026400;
 //BA.debugLineNum = 68026400;BA.debugLine="Private headerActionFontSize As Float";
_headeractionfontsize = 0f;
RDebugUtils.currentLine=68026401;
 //BA.debugLineNum = 68026401;BA.debugLine="Private codeFontSize As Float";
_codefontsize = 0f;
RDebugUtils.currentLine=68026402;
 //BA.debugLineNum = 68026402;BA.debugLine="Private orbitFadeValue As Double";
_orbitfadevalue = 0;
RDebugUtils.currentLine=68026403;
 //BA.debugLineNum = 68026403;BA.debugLine="Private orbitFadeTarget As Double";
_orbitfadetarget = 0;
RDebugUtils.currentLine=68026404;
 //BA.debugLineNum = 68026404;BA.debugLine="End Sub";
return "";
}
public String  _setstreamtext(b4j.example.playeruicontroller __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "setstreamtext", false))
	 {return ((String) Debug.delegate(ba, "setstreamtext", new Object[] {_text}));}
RDebugUtils.currentLine=68681728;
 //BA.debugLineNum = 68681728;BA.debugLine="Public Sub SetStreamText(text As String)";
RDebugUtils.currentLine=68681729;
 //BA.debugLineNum = 68681729;BA.debugLine="lblStream.Text = text";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
RDebugUtils.currentLine=68681730;
 //BA.debugLineNum = 68681730;BA.debugLine="End Sub";
return "";
}
public String  _joinlist(b4j.example.playeruicontroller __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=68943872;
 //BA.debugLineNum = 68943872;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=68943873;
 //BA.debugLineNum = 68943873;BA.debugLine="If items.IsInitialized = False Or items.Size = 0";
if (_items.IsInitialized()==__c.False || _items.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=68943874;
 //BA.debugLineNum = 68943874;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=68943875;
 //BA.debugLineNum = 68943875;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=68943876;
 //BA.debugLineNum = 68943876;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=68943877;
 //BA.debugLineNum = 68943877;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=68943878;
 //BA.debugLineNum = 68943878;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=68943880;
 //BA.debugLineNum = 68943880;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=68943881;
 //BA.debugLineNum = 68943881;BA.debugLine="End Sub";
return "";
}
public String  _stoporbitanimation(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "stoporbitanimation", false))
	 {return ((String) Debug.delegate(ba, "stoporbitanimation", null));}
RDebugUtils.currentLine=69533696;
 //BA.debugLineNum = 69533696;BA.debugLine="Public Sub StopOrbitAnimation";
RDebugUtils.currentLine=69533697;
 //BA.debugLineNum = 69533697;BA.debugLine="orbitFadeTarget = 0";
__ref._orbitfadetarget /*double*/  = 0;
RDebugUtils.currentLine=69533698;
 //BA.debugLineNum = 69533698;BA.debugLine="If orbitFadeValue = 0 Then ApplyOrbitState(0)";
if (__ref._orbitfadevalue /*double*/ ==0) { 
__ref._applyorbitstate /*String*/ (null,0);};
RDebugUtils.currentLine=69533699;
 //BA.debugLineNum = 69533699;BA.debugLine="End Sub";
return "";
}
public String  _startorbitanimation(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "startorbitanimation", false))
	 {return ((String) Debug.delegate(ba, "startorbitanimation", null));}
RDebugUtils.currentLine=69468160;
 //BA.debugLineNum = 69468160;BA.debugLine="Public Sub StartOrbitAnimation";
RDebugUtils.currentLine=69468161;
 //BA.debugLineNum = 69468161;BA.debugLine="orbitFadeTarget = 1";
__ref._orbitfadetarget /*double*/  = 1;
RDebugUtils.currentLine=69468162;
 //BA.debugLineNum = 69468162;BA.debugLine="End Sub";
return "";
}
}