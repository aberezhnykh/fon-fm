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
RDebugUtils.currentLine=65798144;
 //BA.debugLineNum = 65798144;BA.debugLine="Public Sub ApplyStoppedState(idleText As String)";
RDebugUtils.currentLine=65798145;
 //BA.debugLineNum = 65798145;BA.debugLine="ShowStream(idleText)";
__ref._showstream /*String*/ (null,_idletext);
RDebugUtils.currentLine=65798146;
 //BA.debugLineNum = 65798146;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=65798147;
 //BA.debugLineNum = 65798147;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playeruicontroller __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xuivalue,anywheresoftware.b4a.objects.B4XViewWrapper _streamlabel,anywheresoftware.b4a.objects.B4XViewWrapper _infolabel,anywheresoftware.b4a.objects.B4XViewWrapper _headerlabel,anywheresoftware.b4a.objects.B4XViewWrapper _connectioniconlabel,anywheresoftware.b4a.objects.B4XViewWrapper _headeractionlabel,anywheresoftware.b4a.objects.B4XViewWrapper _setupmessagelabel,anywheresoftware.b4a.objects.B4XViewWrapper _playiconlabel,anywheresoftware.b4a.objects.B4XViewWrapper _confirmpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _confirmyesbutton,anywheresoftware.b4a.objects.B4XViewWrapper _confirmnobutton,anywheresoftware.b4a.objects.B4XViewWrapper _setuppanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _playerpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _headeractionpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _playbuttonpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _orbitpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _accesscirclepanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _accesscorepanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _accessinputpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _setupsubmitbutton,anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _playercodeinput,anywheresoftware.b4a.objects.B4XViewWrapper _playercodeinputview,String _iconcloudokvalue,String _iconcloudoffvalue,String _iconclouddegradedvalue,String _iconmorevalue,String _iconclosevalue,String _iconplayvalue,String _iconstopvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_xuivalue,_streamlabel,_infolabel,_headerlabel,_connectioniconlabel,_headeractionlabel,_setupmessagelabel,_playiconlabel,_confirmpanevalue,_confirmyesbutton,_confirmnobutton,_setuppanevalue,_playerpanevalue,_headeractionpanevalue,_playbuttonpanevalue,_orbitpanevalue,_accesscirclepanevalue,_accesscorepanevalue,_accessinputpanevalue,_setupsubmitbutton,_playercodeinput,_playercodeinputview,_iconcloudokvalue,_iconcloudoffvalue,_iconclouddegradedvalue,_iconmorevalue,_iconclosevalue,_iconplayvalue,_iconstopvalue}));}
RDebugUtils.currentLine=65732608;
 //BA.debugLineNum = 65732608;BA.debugLine="Public Sub Initialize(xuiValue As XUI, streamLabel";
RDebugUtils.currentLine=65732609;
 //BA.debugLineNum = 65732609;BA.debugLine="xui = xuiValue";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/  = _xuivalue;
RDebugUtils.currentLine=65732610;
 //BA.debugLineNum = 65732610;BA.debugLine="lblStream = streamLabel";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _streamlabel;
RDebugUtils.currentLine=65732611;
 //BA.debugLineNum = 65732611;BA.debugLine="lblInfo = infoLabel";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _infolabel;
RDebugUtils.currentLine=65732612;
 //BA.debugLineNum = 65732612;BA.debugLine="lblHeader = headerLabel";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _headerlabel;
RDebugUtils.currentLine=65732613;
 //BA.debugLineNum = 65732613;BA.debugLine="lblConnectionIcon = connectionIconLabel";
__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _connectioniconlabel;
RDebugUtils.currentLine=65732614;
 //BA.debugLineNum = 65732614;BA.debugLine="lblHeaderAction = headerActionLabel";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _headeractionlabel;
RDebugUtils.currentLine=65732615;
 //BA.debugLineNum = 65732615;BA.debugLine="lblSetupMessage = setupMessageLabel";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _setupmessagelabel;
RDebugUtils.currentLine=65732616;
 //BA.debugLineNum = 65732616;BA.debugLine="lblPlayIcon = playIconLabel";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _playiconlabel;
RDebugUtils.currentLine=65732617;
 //BA.debugLineNum = 65732617;BA.debugLine="confirmPane = confirmPaneValue";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _confirmpanevalue;
RDebugUtils.currentLine=65732618;
 //BA.debugLineNum = 65732618;BA.debugLine="btnConfirmYes = confirmYesButton";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _confirmyesbutton;
RDebugUtils.currentLine=65732619;
 //BA.debugLineNum = 65732619;BA.debugLine="btnConfirmNo = confirmNoButton";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _confirmnobutton;
RDebugUtils.currentLine=65732620;
 //BA.debugLineNum = 65732620;BA.debugLine="setupPane = setupPaneValue";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _setuppanevalue;
RDebugUtils.currentLine=65732621;
 //BA.debugLineNum = 65732621;BA.debugLine="playerPane = playerPaneValue";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _playerpanevalue;
RDebugUtils.currentLine=65732622;
 //BA.debugLineNum = 65732622;BA.debugLine="headerActionPane = headerActionPaneValue";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _headeractionpanevalue;
RDebugUtils.currentLine=65732623;
 //BA.debugLineNum = 65732623;BA.debugLine="playButtonPane = playButtonPaneValue";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _playbuttonpanevalue;
RDebugUtils.currentLine=65732624;
 //BA.debugLineNum = 65732624;BA.debugLine="orbitPane = orbitPaneValue";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _orbitpanevalue;
RDebugUtils.currentLine=65732625;
 //BA.debugLineNum = 65732625;BA.debugLine="accessCirclePane = accessCirclePaneValue";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _accesscirclepanevalue;
RDebugUtils.currentLine=65732626;
 //BA.debugLineNum = 65732626;BA.debugLine="accessCorePane = accessCorePaneValue";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _accesscorepanevalue;
RDebugUtils.currentLine=65732627;
 //BA.debugLineNum = 65732627;BA.debugLine="accessInputPane = accessInputPaneValue";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _accessinputpanevalue;
RDebugUtils.currentLine=65732628;
 //BA.debugLineNum = 65732628;BA.debugLine="btnSetupSubmit = setupSubmitButton";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _setupsubmitbutton;
RDebugUtils.currentLine=65732629;
 //BA.debugLineNum = 65732629;BA.debugLine="txtPlayerCode = playerCodeInput";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = _playercodeinput;
RDebugUtils.currentLine=65732630;
 //BA.debugLineNum = 65732630;BA.debugLine="txtPlayerCodeView = playerCodeInputView";
__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _playercodeinputview;
RDebugUtils.currentLine=65732631;
 //BA.debugLineNum = 65732631;BA.debugLine="iconCloudOk = iconCloudOkValue";
__ref._iconcloudok /*String*/  = _iconcloudokvalue;
RDebugUtils.currentLine=65732632;
 //BA.debugLineNum = 65732632;BA.debugLine="iconCloudOff = iconCloudOffValue";
__ref._iconcloudoff /*String*/  = _iconcloudoffvalue;
RDebugUtils.currentLine=65732633;
 //BA.debugLineNum = 65732633;BA.debugLine="iconCloudDegraded = iconCloudDegradedValue";
__ref._iconclouddegraded /*String*/  = _iconclouddegradedvalue;
RDebugUtils.currentLine=65732634;
 //BA.debugLineNum = 65732634;BA.debugLine="iconMore = iconMoreValue";
__ref._iconmore /*String*/  = _iconmorevalue;
RDebugUtils.currentLine=65732635;
 //BA.debugLineNum = 65732635;BA.debugLine="iconClose = iconCloseValue";
__ref._iconclose /*String*/  = _iconclosevalue;
RDebugUtils.currentLine=65732636;
 //BA.debugLineNum = 65732636;BA.debugLine="iconPlay = iconPlayValue";
__ref._iconplay /*String*/  = _iconplayvalue;
RDebugUtils.currentLine=65732637;
 //BA.debugLineNum = 65732637;BA.debugLine="iconStop = iconStopValue";
__ref._iconstop /*String*/  = _iconstopvalue;
RDebugUtils.currentLine=65732638;
 //BA.debugLineNum = 65732638;BA.debugLine="End Sub";
return "";
}
public String  _bringtofront(b4j.example.playeruicontroller __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "bringtofront", false))
	 {return ((String) Debug.delegate(ba, "bringtofront", new Object[] {_view}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=67502080;
 //BA.debugLineNum = 67502080;BA.debugLine="Public Sub BringToFront(view As B4XView)";
RDebugUtils.currentLine=67502081;
 //BA.debugLineNum = 67502081;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=67502082;
 //BA.debugLineNum = 67502082;BA.debugLine="jo.RunMethod(\"toFront\", Null)";
_jo.RunMethod("toFront",(Object[])(__c.Null));
RDebugUtils.currentLine=67502083;
 //BA.debugLineNum = 67502083;BA.debugLine="End Sub";
return "";
}
public String  _setstatustext(b4j.example.playeruicontroller __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "setstatustext", false))
	 {return ((String) Debug.delegate(ba, "setstatustext", new Object[] {_text}));}
RDebugUtils.currentLine=66387968;
 //BA.debugLineNum = 66387968;BA.debugLine="Public Sub SetStatusText(text As String)";
RDebugUtils.currentLine=66387969;
 //BA.debugLineNum = 66387969;BA.debugLine="lblInfo.Text = text";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
RDebugUtils.currentLine=66387970;
 //BA.debugLineNum = 66387970;BA.debugLine="End Sub";
return "";
}
public String  _configureplayerheader(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "configureplayerheader", false))
	 {return ((String) Debug.delegate(ba, "configureplayerheader", null));}
RDebugUtils.currentLine=66650112;
 //BA.debugLineNum = 66650112;BA.debugLine="Public Sub ConfigurePlayerHeader";
RDebugUtils.currentLine=66650113;
 //BA.debugLineNum = 66650113;BA.debugLine="headerActionPane.Visible = True";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=66650114;
 //BA.debugLineNum = 66650114;BA.debugLine="lblHeaderAction.Text = iconMore";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._iconmore /*String*/ );
RDebugUtils.currentLine=66650115;
 //BA.debugLineNum = 66650115;BA.debugLine="End Sub";
return "";
}
public String  _configuresetupscreen(b4j.example.playeruicontroller __ref,String _mode,String _formattedplayercode,String _messagetext,String _setuptitle,String _settingsthanks,String _submittext,String _logouttext) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "configuresetupscreen", false))
	 {return ((String) Debug.delegate(ba, "configuresetupscreen", new Object[] {_mode,_formattedplayercode,_messagetext,_setuptitle,_settingsthanks,_submittext,_logouttext}));}
boolean _issettingsmode = false;
RDebugUtils.currentLine=66584576;
 //BA.debugLineNum = 66584576;BA.debugLine="Public Sub ConfigureSetupScreen(mode As String, fo";
RDebugUtils.currentLine=66584577;
 //BA.debugLineNum = 66584577;BA.debugLine="Dim isSettingsMode As Boolean = mode = \"settings\"";
_issettingsmode = (_mode).equals("settings");
RDebugUtils.currentLine=66584578;
 //BA.debugLineNum = 66584578;BA.debugLine="headerActionPane.Visible = mode <> \"setup\"";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible((_mode).equals("setup") == false);
RDebugUtils.currentLine=66584579;
 //BA.debugLineNum = 66584579;BA.debugLine="If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=66584580;
 //BA.debugLineNum = 66584580;BA.debugLine="lblHeaderAction.Text = iconClose";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._iconclose /*String*/ );
RDebugUtils.currentLine=66584581;
 //BA.debugLineNum = 66584581;BA.debugLine="txtPlayerCode.Editable = False";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(__c.False);
RDebugUtils.currentLine=66584582;
 //BA.debugLineNum = 66584582;BA.debugLine="btnSetupSubmit.Text = logoutText.ToUpperCase";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_logouttext.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 }else {
RDebugUtils.currentLine=66584584;
 //BA.debugLineNum = 66584584;BA.debugLine="lblHeaderAction.Text = iconMore";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._iconmore /*String*/ );
RDebugUtils.currentLine=66584585;
 //BA.debugLineNum = 66584585;BA.debugLine="txtPlayerCode.Editable = True";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(__c.True);
RDebugUtils.currentLine=66584586;
 //BA.debugLineNum = 66584586;BA.debugLine="btnSetupSubmit.Text = submitText.ToUpperCase";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_submittext.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 };
RDebugUtils.currentLine=66584588;
 //BA.debugLineNum = 66584588;BA.debugLine="txtPlayerCode.Text = formattedPlayerCode";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_formattedplayercode);
RDebugUtils.currentLine=66584589;
 //BA.debugLineNum = 66584589;BA.debugLine="If messageText <> \"\" Then";
if ((_messagetext).equals("") == false) { 
RDebugUtils.currentLine=66584590;
 //BA.debugLineNum = 66584590;BA.debugLine="lblSetupMessage.Text = messageText";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_messagetext);
 }else 
{RDebugUtils.currentLine=66584591;
 //BA.debugLineNum = 66584591;BA.debugLine="Else If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=66584592;
 //BA.debugLineNum = 66584592;BA.debugLine="lblSetupMessage.Text = settingsThanks";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_settingsthanks);
 }else {
RDebugUtils.currentLine=66584594;
 //BA.debugLineNum = 66584594;BA.debugLine="lblSetupMessage.Text = setupTitle";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_setuptitle);
 }}
;
RDebugUtils.currentLine=66584596;
 //BA.debugLineNum = 66584596;BA.debugLine="If formattedPlayerCode = \"\" Then lblHeader.Text =";
if ((_formattedplayercode).equals("")) { 
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");};
RDebugUtils.currentLine=66584597;
 //BA.debugLineNum = 66584597;BA.debugLine="End Sub";
return "";
}
public String  _hidecontentblocks(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "hidecontentblocks", false))
	 {return ((String) Debug.delegate(ba, "hidecontentblocks", null));}
RDebugUtils.currentLine=65863680;
 //BA.debugLineNum = 65863680;BA.debugLine="Public Sub HideContentBlocks";
RDebugUtils.currentLine=65863681;
 //BA.debugLineNum = 65863681;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=65863682;
 //BA.debugLineNum = 65863682;BA.debugLine="SetStreamText(\"\")";
__ref._setstreamtext /*String*/ (null,"");
RDebugUtils.currentLine=65863683;
 //BA.debugLineNum = 65863683;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=65863684;
 //BA.debugLineNum = 65863684;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=65863685;
 //BA.debugLineNum = 65863685;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=65863686;
 //BA.debugLineNum = 65863686;BA.debugLine="End Sub";
return "";
}
public String  _hidepin(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "hidepin", false))
	 {return ((String) Debug.delegate(ba, "hidepin", null));}
RDebugUtils.currentLine=66125824;
 //BA.debugLineNum = 66125824;BA.debugLine="Public Sub HidePin";
RDebugUtils.currentLine=66125825;
 //BA.debugLineNum = 66125825;BA.debugLine="confirmPane.Visible = False";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=66125826;
 //BA.debugLineNum = 66125826;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=66125827;
 //BA.debugLineNum = 66125827;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=66125828;
 //BA.debugLineNum = 66125828;BA.debugLine="End Sub";
return "";
}
public boolean  _advanceorbitframe(b4j.example.playeruicontroller __ref,int _stepindex,double _fadestep) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "advanceorbitframe", false))
	 {return ((Boolean) Debug.delegate(ba, "advanceorbitframe", new Object[] {_stepindex,_fadestep}));}
RDebugUtils.currentLine=67174400;
 //BA.debugLineNum = 67174400;BA.debugLine="Public Sub AdvanceOrbitFrame(stepIndex As Int, fad";
RDebugUtils.currentLine=67174401;
 //BA.debugLineNum = 67174401;BA.debugLine="If orbitFadeValue < orbitFadeTarget Then";
if (__ref._orbitfadevalue /*double*/ <__ref._orbitfadetarget /*double*/ ) { 
RDebugUtils.currentLine=67174402;
 //BA.debugLineNum = 67174402;BA.debugLine="orbitFadeValue = Min(orbitFadeTarget, orbitFadeV";
__ref._orbitfadevalue /*double*/  = __c.Min(__ref._orbitfadetarget /*double*/ ,__ref._orbitfadevalue /*double*/ +_fadestep);
 }else 
{RDebugUtils.currentLine=67174403;
 //BA.debugLineNum = 67174403;BA.debugLine="Else If orbitFadeValue > orbitFadeTarget Then";
if (__ref._orbitfadevalue /*double*/ >__ref._orbitfadetarget /*double*/ ) { 
RDebugUtils.currentLine=67174404;
 //BA.debugLineNum = 67174404;BA.debugLine="orbitFadeValue = Max(orbitFadeTarget, orbitFadeV";
__ref._orbitfadevalue /*double*/  = __c.Max(__ref._orbitfadetarget /*double*/ ,__ref._orbitfadevalue /*double*/ -_fadestep);
 }}
;
RDebugUtils.currentLine=67174406;
 //BA.debugLineNum = 67174406;BA.debugLine="ApplyOrbitFrame(stepIndex)";
__ref._applyorbitframe /*String*/ (null,_stepindex);
RDebugUtils.currentLine=67174407;
 //BA.debugLineNum = 67174407;BA.debugLine="Return orbitFadeValue = 0 And orbitFadeTarget = 0";
if (true) return __ref._orbitfadevalue /*double*/ ==0 && __ref._orbitfadetarget /*double*/ ==0;
RDebugUtils.currentLine=67174408;
 //BA.debugLineNum = 67174408;BA.debugLine="End Sub";
return false;
}
public String  _renderplayerhead(b4j.example.playeruicontroller __ref,String _formattedcode,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "renderplayerhead", false))
	 {return ((String) Debug.delegate(ba, "renderplayerhead", new Object[] {_formattedcode,_title}));}
RDebugUtils.currentLine=66519040;
 //BA.debugLineNum = 66519040;BA.debugLine="Public Sub RenderPlayerHead(formattedCode As Strin";
RDebugUtils.currentLine=66519041;
 //BA.debugLineNum = 66519041;BA.debugLine="If title <> \"\" Then";
if ((_title).equals("") == false) { 
RDebugUtils.currentLine=66519042;
 //BA.debugLineNum = 66519042;BA.debugLine="lblHeader.Text = formattedCode & \" • \" & title.T";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_formattedcode+" • "+_title.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 }else {
RDebugUtils.currentLine=66519044;
 //BA.debugLineNum = 66519044;BA.debugLine="lblHeader.Text = formattedCode";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_formattedcode);
 };
RDebugUtils.currentLine=66519046;
 //BA.debugLineNum = 66519046;BA.debugLine="End Sub";
return "";
}
public String  _setplayicon(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "setplayicon", false))
	 {return ((String) Debug.delegate(ba, "setplayicon", null));}
RDebugUtils.currentLine=66846720;
 //BA.debugLineNum = 66846720;BA.debugLine="Public Sub SetPlayIcon";
RDebugUtils.currentLine=66846721;
 //BA.debugLineNum = 66846721;BA.debugLine="UiStyle.SetLabelStyle(lblPlayIcon, \"-fx-alignment";
_uistyle._setlabelstyle /*String*/ (__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+_uistyle._colortocss /*String*/ (((int)0xffd0ff71))+"; -fx-padding: 0;");
RDebugUtils.currentLine=66846722;
 //BA.debugLineNum = 66846722;BA.debugLine="lblPlayIcon.Text = iconPlay";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._iconplay /*String*/ );
RDebugUtils.currentLine=66846723;
 //BA.debugLineNum = 66846723;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblPlayIcon, p";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._playiconbasesize /*float*/ );
RDebugUtils.currentLine=66846724;
 //BA.debugLineNum = 66846724;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x00d0ff71),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=66846725;
 //BA.debugLineNum = 66846725;BA.debugLine="StopOrbitAnimation";
__ref._stoporbitanimation /*String*/ (null);
RDebugUtils.currentLine=66846726;
 //BA.debugLineNum = 66846726;BA.debugLine="UpdatePlayButtonAppearance(False, False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False,__c.False);
RDebugUtils.currentLine=66846727;
 //BA.debugLineNum = 66846727;BA.debugLine="End Sub";
return "";
}
public boolean  _isorbitidle(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "isorbitidle", false))
	 {return ((Boolean) Debug.delegate(ba, "isorbitidle", null));}
RDebugUtils.currentLine=67239936;
 //BA.debugLineNum = 67239936;BA.debugLine="Public Sub IsOrbitIdle As Boolean";
RDebugUtils.currentLine=67239937;
 //BA.debugLineNum = 67239937;BA.debugLine="Return orbitFadeValue = 0 And orbitFadeTarget = 0";
if (true) return __ref._orbitfadevalue /*double*/ ==0 && __ref._orbitfadetarget /*double*/ ==0;
RDebugUtils.currentLine=67239938;
 //BA.debugLineNum = 67239938;BA.debugLine="End Sub";
return false;
}
public String  _setstopicon(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "setstopicon", false))
	 {return ((String) Debug.delegate(ba, "setstopicon", null));}
RDebugUtils.currentLine=66912256;
 //BA.debugLineNum = 66912256;BA.debugLine="Public Sub SetStopIcon";
RDebugUtils.currentLine=66912257;
 //BA.debugLineNum = 66912257;BA.debugLine="UiStyle.SetLabelStyle(lblPlayIcon, \"-fx-alignment";
_uistyle._setlabelstyle /*String*/ (__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+_uistyle._colortocss /*String*/ (((int)0xffd0ff71))+"; -fx-padding: 0;");
RDebugUtils.currentLine=66912258;
 //BA.debugLineNum = 66912258;BA.debugLine="lblPlayIcon.Text = iconStop";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._iconstop /*String*/ );
RDebugUtils.currentLine=66912259;
 //BA.debugLineNum = 66912259;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblPlayIcon, s";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._stopiconbasesize /*float*/ );
RDebugUtils.currentLine=66912260;
 //BA.debugLineNum = 66912260;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x66d0ff71),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=66912261;
 //BA.debugLineNum = 66912261;BA.debugLine="StartOrbitAnimation";
__ref._startorbitanimation /*String*/ (null);
RDebugUtils.currentLine=66912262;
 //BA.debugLineNum = 66912262;BA.debugLine="UpdatePlayButtonAppearance(False, True)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False,__c.True);
RDebugUtils.currentLine=66912263;
 //BA.debugLineNum = 66912263;BA.debugLine="End Sub";
return "";
}
public String  _showadmeta(b4j.example.playeruicontroller __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "showadmeta", false))
	 {return ((String) Debug.delegate(ba, "showadmeta", new Object[] {_item}));}
RDebugUtils.currentLine=66256896;
 //BA.debugLineNum = 66256896;BA.debugLine="Public Sub ShowAdMeta(item As Map)";
RDebugUtils.currentLine=66256897;
 //BA.debugLineNum = 66256897;BA.debugLine="SetStatusText(item.GetDefault(\"title\", \"\"))";
__ref._setstatustext /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("title"),(Object)(""))));
RDebugUtils.currentLine=66256898;
 //BA.debugLineNum = 66256898;BA.debugLine="End Sub";
return "";
}
public String  _showclaimprompt(b4j.example.playeruicontroller __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "showclaimprompt", false))
	 {return ((String) Debug.delegate(ba, "showclaimprompt", new Object[] {_text}));}
RDebugUtils.currentLine=66060288;
 //BA.debugLineNum = 66060288;BA.debugLine="Public Sub ShowClaimPrompt(text As String)";
RDebugUtils.currentLine=66060289;
 //BA.debugLineNum = 66060289;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=66060290;
 //BA.debugLineNum = 66060290;BA.debugLine="SetStatusText(text)";
__ref._setstatustext /*String*/ (null,_text);
RDebugUtils.currentLine=66060291;
 //BA.debugLineNum = 66060291;BA.debugLine="confirmPane.Visible = True";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=66060292;
 //BA.debugLineNum = 66060292;BA.debugLine="End Sub";
return "";
}
public String  _showmessage(b4j.example.playeruicontroller __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "showmessage", false))
	 {return ((String) Debug.delegate(ba, "showmessage", new Object[] {_text}));}
RDebugUtils.currentLine=65994752;
 //BA.debugLineNum = 65994752;BA.debugLine="Public Sub ShowMessage(text As String)";
RDebugUtils.currentLine=65994753;
 //BA.debugLineNum = 65994753;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=65994754;
 //BA.debugLineNum = 65994754;BA.debugLine="SetStatusText(text)";
__ref._setstatustext /*String*/ (null,_text);
RDebugUtils.currentLine=65994755;
 //BA.debugLineNum = 65994755;BA.debugLine="End Sub";
return "";
}
public String  _showstream(b4j.example.playeruicontroller __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "showstream", false))
	 {return ((String) Debug.delegate(ba, "showstream", new Object[] {_text}));}
RDebugUtils.currentLine=65929216;
 //BA.debugLineNum = 65929216;BA.debugLine="Public Sub ShowStream(text As String)";
RDebugUtils.currentLine=65929217;
 //BA.debugLineNum = 65929217;BA.debugLine="SetStreamText(text)";
__ref._setstreamtext /*String*/ (null,_text);
RDebugUtils.currentLine=65929218;
 //BA.debugLineNum = 65929218;BA.debugLine="End Sub";
return "";
}
public String  _showtrackmeta(b4j.example.playeruicontroller __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "showtrackmeta", false))
	 {return ((String) Debug.delegate(ba, "showtrackmeta", new Object[] {_item}));}
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=66191360;
 //BA.debugLineNum = 66191360;BA.debugLine="Public Sub ShowTrackMeta(item As Map)";
RDebugUtils.currentLine=66191361;
 //BA.debugLineNum = 66191361;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66191362;
 //BA.debugLineNum = 66191362;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=66191363;
 //BA.debugLineNum = 66191363;BA.debugLine="If item.GetDefault(\"set\", \"\") <> \"\" Then parts.Ad";
if ((_item.GetDefault((Object)("set"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add(_item.Get((Object)("set")));};
RDebugUtils.currentLine=66191364;
 //BA.debugLineNum = 66191364;BA.debugLine="If item.GetDefault(\"code\", \"\") <> \"\" Then parts.A";
if ((_item.GetDefault((Object)("code"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add(_item.Get((Object)("code")));};
RDebugUtils.currentLine=66191365;
 //BA.debugLineNum = 66191365;BA.debugLine="SetStatusText(JoinList(parts, \" • \"))";
__ref._setstatustext /*String*/ (null,__ref._joinlist /*String*/ (null,_parts," • "));
RDebugUtils.currentLine=66191366;
 //BA.debugLineNum = 66191366;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=67436544;
 //BA.debugLineNum = 67436544;BA.debugLine="Public Sub UpdateCodeInputAppearance(isFocused As";
RDebugUtils.currentLine=67436545;
 //BA.debugLineNum = 67436545;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=67436546;
 //BA.debugLineNum = 67436546;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=67436547;
 //BA.debugLineNum = 67436547;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
RDebugUtils.currentLine=67436548;
 //BA.debugLineNum = 67436548;BA.debugLine="If isFocused Then";
if (_isfocused) { 
RDebugUtils.currentLine=67436549;
 //BA.debugLineNum = 67436549;BA.debugLine="fillColor = 0x10FFFFFF";
_fillcolor = ((int)0x10ffffff);
RDebugUtils.currentLine=67436550;
 //BA.debugLineNum = 67436550;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
RDebugUtils.currentLine=67436551;
 //BA.debugLineNum = 67436551;BA.debugLine="orbitBorderColor = 0x88FFFFFF";
_orbitbordercolor = ((int)0x88ffffff);
 }else {
RDebugUtils.currentLine=67436553;
 //BA.debugLineNum = 67436553;BA.debugLine="fillColor = 0x07FFFFFF";
_fillcolor = ((int)0x07ffffff);
RDebugUtils.currentLine=67436554;
 //BA.debugLineNum = 67436554;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
RDebugUtils.currentLine=67436555;
 //BA.debugLineNum = 67436555;BA.debugLine="orbitBorderColor = 0x66FFFFFF";
_orbitbordercolor = ((int)0x66ffffff);
 };
RDebugUtils.currentLine=67436557;
 //BA.debugLineNum = 67436557;BA.debugLine="accessCirclePane.SetColorAndBorder(fillColor, 4di";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=67436558;
 //BA.debugLineNum = 67436558;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=67436559;
 //BA.debugLineNum = 67436559;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0);
RDebugUtils.currentLine=67436560;
 //BA.debugLineNum = 67436560;BA.debugLine="UiStyle.SetPaneStyle(accessCirclePane, \"-fx-backg";
_uistyle._setpanestyle /*String*/ (__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=67436561;
 //BA.debugLineNum = 67436561;BA.debugLine="UiStyle.SetPaneStyle(accessCorePane, \"-fx-backgro";
_uistyle._setpanestyle /*String*/ (__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=67436562;
 //BA.debugLineNum = 67436562;BA.debugLine="UiStyle.SetPaneStyle(accessInputPane, \"-fx-backgr";
_uistyle._setpanestyle /*String*/ (__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;");
RDebugUtils.currentLine=67436563;
 //BA.debugLineNum = 67436563;BA.debugLine="UiStyle.SetPaneStyle(txtPlayerCodeView, \"-fx-back";
_uistyle._setpanestyle /*String*/ (__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-text-fill: "+_uistyle._colortocss /*String*/ (((int)0xfff2f7fb))+"; -fx-prompt-text-fill: "+_uistyle._colortocss /*String*/ (((int)0x66ffffff))+"; -fx-highlight-fill: transparent; -fx-highlight-text-fill: "+_uistyle._colortocss /*String*/ (((int)0xfff2f7fb))+"; -fx-display-caret: true; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-font-size: "+BA.NumberToString(__ref._codefontsize /*float*/ )+"px; -fx-font-weight: bold; -fx-padding: 0 0 2 0;");
RDebugUtils.currentLine=67436564;
 //BA.debugLineNum = 67436564;BA.debugLine="End Sub";
return "";
}
public String  _updateconnectionindicator(b4j.example.playeruicontroller __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "updateconnectionindicator", false))
	 {return ((String) Debug.delegate(ba, "updateconnectionindicator", new Object[] {_mode}));}
String _icontext = "";
int _iconcolor = 0;
RDebugUtils.currentLine=66453504;
 //BA.debugLineNum = 66453504;BA.debugLine="Public Sub UpdateConnectionIndicator(mode As Strin";
RDebugUtils.currentLine=66453505;
 //BA.debugLineNum = 66453505;BA.debugLine="If lblConnectionIcon.IsInitialized = False Then R";
if (__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=66453506;
 //BA.debugLineNum = 66453506;BA.debugLine="Dim iconText As String = iconCloudOk";
_icontext = __ref._iconcloudok /*String*/ ;
RDebugUtils.currentLine=66453507;
 //BA.debugLineNum = 66453507;BA.debugLine="Dim iconColor As Int = 0xFF747B86";
_iconcolor = ((int)0xff747b86);
RDebugUtils.currentLine=66453508;
 //BA.debugLineNum = 66453508;BA.debugLine="Select mode";
switch (BA.switchObjectToInt(_mode,"online","offline","server","local","degraded","connecting")) {
case 0: {
RDebugUtils.currentLine=66453510;
 //BA.debugLineNum = 66453510;BA.debugLine="iconText = iconCloudOk";
_icontext = __ref._iconcloudok /*String*/ ;
RDebugUtils.currentLine=66453511;
 //BA.debugLineNum = 66453511;BA.debugLine="iconColor = 0xFFD0FF71";
_iconcolor = ((int)0xffd0ff71);
 break; }
case 1: 
case 2: {
RDebugUtils.currentLine=66453513;
 //BA.debugLineNum = 66453513;BA.debugLine="iconText = iconCloudOff";
_icontext = __ref._iconcloudoff /*String*/ ;
RDebugUtils.currentLine=66453514;
 //BA.debugLineNum = 66453514;BA.debugLine="iconColor = 0xFFFF6B6B";
_iconcolor = ((int)0xffff6b6b);
 break; }
case 3: {
RDebugUtils.currentLine=66453516;
 //BA.debugLineNum = 66453516;BA.debugLine="iconText = iconCloudDegraded";
_icontext = __ref._iconclouddegraded /*String*/ ;
RDebugUtils.currentLine=66453517;
 //BA.debugLineNum = 66453517;BA.debugLine="iconColor = 0xFFFFD166";
_iconcolor = ((int)0xffffd166);
 break; }
case 4: {
RDebugUtils.currentLine=66453519;
 //BA.debugLineNum = 66453519;BA.debugLine="iconText = iconCloudDegraded";
_icontext = __ref._iconclouddegraded /*String*/ ;
RDebugUtils.currentLine=66453520;
 //BA.debugLineNum = 66453520;BA.debugLine="iconColor = 0xFFFFD166";
_iconcolor = ((int)0xffffd166);
 break; }
case 5: {
RDebugUtils.currentLine=66453522;
 //BA.debugLineNum = 66453522;BA.debugLine="iconText = iconCloudOk";
_icontext = __ref._iconcloudok /*String*/ ;
RDebugUtils.currentLine=66453523;
 //BA.debugLineNum = 66453523;BA.debugLine="iconColor = 0xFF8E97A3";
_iconcolor = ((int)0xff8e97a3);
 break; }
}
;
RDebugUtils.currentLine=66453525;
 //BA.debugLineNum = 66453525;BA.debugLine="lblConnectionIcon.Text = iconText";
__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_icontext);
RDebugUtils.currentLine=66453526;
 //BA.debugLineNum = 66453526;BA.debugLine="UiStyle.SetLabelStyle(lblConnectionIcon, \"-fx-ali";
_uistyle._setlabelstyle /*String*/ (__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+_uistyle._colortocss /*String*/ (_iconcolor)+";");
RDebugUtils.currentLine=66453527;
 //BA.debugLineNum = 66453527;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblConnectionI";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (16));
RDebugUtils.currentLine=66453528;
 //BA.debugLineNum = 66453528;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=67305472;
 //BA.debugLineNum = 67305472;BA.debugLine="Public Sub UpdateHeaderActionAppearance(isHovered";
RDebugUtils.currentLine=67305473;
 //BA.debugLineNum = 67305473;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=67305474;
 //BA.debugLineNum = 67305474;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=67305475;
 //BA.debugLineNum = 67305475;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=67305476;
 //BA.debugLineNum = 67305476;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=67305477;
 //BA.debugLineNum = 67305477;BA.debugLine="fillColor = 0x14FFFFFF";
_fillcolor = ((int)0x14ffffff);
RDebugUtils.currentLine=67305478;
 //BA.debugLineNum = 67305478;BA.debugLine="borderColor = 0x30FFFFFF";
_bordercolor = ((int)0x30ffffff);
RDebugUtils.currentLine=67305479;
 //BA.debugLineNum = 67305479;BA.debugLine="textColor = 0xFFDDE6EF";
_textcolor = ((int)0xffdde6ef);
 }else {
RDebugUtils.currentLine=67305481;
 //BA.debugLineNum = 67305481;BA.debugLine="fillColor = 0x08FFFFFF";
_fillcolor = ((int)0x08ffffff);
RDebugUtils.currentLine=67305482;
 //BA.debugLineNum = 67305482;BA.debugLine="borderColor = 0x18FFFFFF";
_bordercolor = ((int)0x18ffffff);
RDebugUtils.currentLine=67305483;
 //BA.debugLineNum = 67305483;BA.debugLine="textColor = 0xFFB9C0C9";
_textcolor = ((int)0xffb9c0c9);
 };
RDebugUtils.currentLine=67305485;
 //BA.debugLineNum = 67305485;BA.debugLine="headerActionPane.SetColorAndBorder(fillColor, 1di";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=67305486;
 //BA.debugLineNum = 67305486;BA.debugLine="UiStyle.SetPaneStyle(headerActionPane, \"-fx-curso";
_uistyle._setpanestyle /*String*/ (__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=67305487;
 //BA.debugLineNum = 67305487;BA.debugLine="UiStyle.SetLabelStyle(lblHeaderAction, \"-fx-align";
_uistyle._setlabelstyle /*String*/ (__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+_uistyle._colortocss /*String*/ (_textcolor)+";");
RDebugUtils.currentLine=67305488;
 //BA.debugLineNum = 67305488;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblHeaderActio";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._headeractionfontsize /*float*/ );
RDebugUtils.currentLine=67305489;
 //BA.debugLineNum = 67305489;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=66977792;
 //BA.debugLineNum = 66977792;BA.debugLine="Public Sub UpdatePlayButtonAppearance(isHovered As";
RDebugUtils.currentLine=66977793;
 //BA.debugLineNum = 66977793;BA.debugLine="Dim backgroundColor As Int";
_backgroundcolor = 0;
RDebugUtils.currentLine=66977794;
 //BA.debugLineNum = 66977794;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=66977795;
 //BA.debugLineNum = 66977795;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
RDebugUtils.currentLine=66977796;
 //BA.debugLineNum = 66977796;BA.debugLine="If isStarted Then";
if (_isstarted) { 
RDebugUtils.currentLine=66977797;
 //BA.debugLineNum = 66977797;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=66977798;
 //BA.debugLineNum = 66977798;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=66977799;
 //BA.debugLineNum = 66977799;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
 }else {
RDebugUtils.currentLine=66977801;
 //BA.debugLineNum = 66977801;BA.debugLine="backgroundColor = 0x08FFFFFF";
_backgroundcolor = ((int)0x08ffffff);
RDebugUtils.currentLine=66977802;
 //BA.debugLineNum = 66977802;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
 };
 }else {
RDebugUtils.currentLine=66977805;
 //BA.debugLineNum = 66977805;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=66977806;
 //BA.debugLineNum = 66977806;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=66977807;
 //BA.debugLineNum = 66977807;BA.debugLine="borderColor = 0x55D0FF71";
_bordercolor = ((int)0x55d0ff71);
 }else {
RDebugUtils.currentLine=66977809;
 //BA.debugLineNum = 66977809;BA.debugLine="backgroundColor = 0x07FFFFFF";
_backgroundcolor = ((int)0x07ffffff);
RDebugUtils.currentLine=66977810;
 //BA.debugLineNum = 66977810;BA.debugLine="borderColor = 0x40FFFFFF";
_bordercolor = ((int)0x40ffffff);
 };
 };
RDebugUtils.currentLine=66977813;
 //BA.debugLineNum = 66977813;BA.debugLine="If isStarted Or isHovered Then";
if (_isstarted || _ishovered) { 
RDebugUtils.currentLine=66977814;
 //BA.debugLineNum = 66977814;BA.debugLine="orbitBorderColor = 0x66D0FF71";
_orbitbordercolor = ((int)0x66d0ff71);
 }else {
RDebugUtils.currentLine=66977816;
 //BA.debugLineNum = 66977816;BA.debugLine="orbitBorderColor = 0x22D0FF71";
_orbitbordercolor = ((int)0x22d0ff71);
 };
RDebugUtils.currentLine=66977818;
 //BA.debugLineNum = 66977818;BA.debugLine="playButtonPane.SetColorAndBorder(backgroundColor,";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_backgroundcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=66977819;
 //BA.debugLineNum = 66977819;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=66977820;
 //BA.debugLineNum = 66977820;BA.debugLine="End Sub";
return "";
}
public String  _updateresponsivestyles(b4j.example.playeruicontroller __ref,float _streamfontsize,float _infofontsize,float _playfontsize,float _stopfontsize,float _headeractionsizevalue,float _codesize,boolean _iscodeinputfocused,boolean _showstopicon) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "updateresponsivestyles", false))
	 {return ((String) Debug.delegate(ba, "updateresponsivestyles", new Object[] {_streamfontsize,_infofontsize,_playfontsize,_stopfontsize,_headeractionsizevalue,_codesize,_iscodeinputfocused,_showstopicon}));}
RDebugUtils.currentLine=66781184;
 //BA.debugLineNum = 66781184;BA.debugLine="Public Sub UpdateResponsiveStyles(streamFontSize A";
RDebugUtils.currentLine=66781185;
 //BA.debugLineNum = 66781185;BA.debugLine="playIconBaseSize = playFontSize";
__ref._playiconbasesize /*float*/  = _playfontsize;
RDebugUtils.currentLine=66781186;
 //BA.debugLineNum = 66781186;BA.debugLine="stopIconBaseSize = stopFontSize";
__ref._stopiconbasesize /*float*/  = _stopfontsize;
RDebugUtils.currentLine=66781187;
 //BA.debugLineNum = 66781187;BA.debugLine="headerActionFontSize = headerActionSizeValue";
__ref._headeractionfontsize /*float*/  = _headeractionsizevalue;
RDebugUtils.currentLine=66781188;
 //BA.debugLineNum = 66781188;BA.debugLine="codeFontSize = codeSize";
__ref._codefontsize /*float*/  = _codesize;
RDebugUtils.currentLine=66781189;
 //BA.debugLineNum = 66781189;BA.debugLine="lblStream.Font = xui.CreateDefaultBoldFont(stream";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont(_streamfontsize));
RDebugUtils.currentLine=66781190;
 //BA.debugLineNum = 66781190;BA.debugLine="lblInfo.Font = xui.CreateDefaultFont(infoFontSize";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont(_infofontsize));
RDebugUtils.currentLine=66781191;
 //BA.debugLineNum = 66781191;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblConnectionI";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (16));
RDebugUtils.currentLine=66781192;
 //BA.debugLineNum = 66781192;BA.debugLine="UpdateHeaderActionAppearance(False)";
__ref._updateheaderactionappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=66781193;
 //BA.debugLineNum = 66781193;BA.debugLine="UpdateCodeInputAppearance(isCodeInputFocused)";
__ref._updatecodeinputappearance /*String*/ (null,_iscodeinputfocused);
RDebugUtils.currentLine=66781194;
 //BA.debugLineNum = 66781194;BA.debugLine="If showStopIcon Then";
if (_showstopicon) { 
RDebugUtils.currentLine=66781195;
 //BA.debugLineNum = 66781195;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
 }else {
RDebugUtils.currentLine=66781197;
 //BA.debugLineNum = 66781197;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
 };
RDebugUtils.currentLine=66781199;
 //BA.debugLineNum = 66781199;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=67371008;
 //BA.debugLineNum = 67371008;BA.debugLine="Public Sub UpdateTextButtonAppearance(buttonView A";
RDebugUtils.currentLine=67371009;
 //BA.debugLineNum = 67371009;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=67371010;
 //BA.debugLineNum = 67371010;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=67371011;
 //BA.debugLineNum = 67371011;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=67371012;
 //BA.debugLineNum = 67371012;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=67371013;
 //BA.debugLineNum = 67371013;BA.debugLine="fillColor = 0x12FFFFFF";
_fillcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=67371014;
 //BA.debugLineNum = 67371014;BA.debugLine="borderColor = 0x34FFFFFF";
_bordercolor = ((int)0x34ffffff);
RDebugUtils.currentLine=67371015;
 //BA.debugLineNum = 67371015;BA.debugLine="textColor = 0xFFF2F7FB";
_textcolor = ((int)0xfff2f7fb);
 }else {
RDebugUtils.currentLine=67371017;
 //BA.debugLineNum = 67371017;BA.debugLine="fillColor = 0x06FFFFFF";
_fillcolor = ((int)0x06ffffff);
RDebugUtils.currentLine=67371018;
 //BA.debugLineNum = 67371018;BA.debugLine="borderColor = 0x1EFFFFFF";
_bordercolor = ((int)0x1effffff);
RDebugUtils.currentLine=67371019;
 //BA.debugLineNum = 67371019;BA.debugLine="textColor = 0xFFE0E4EA";
_textcolor = ((int)0xffe0e4ea);
 };
RDebugUtils.currentLine=67371021;
 //BA.debugLineNum = 67371021;BA.debugLine="buttonView.SetColorAndBorder(fillColor, 1dip, bor";
_buttonview.SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (12)));
RDebugUtils.currentLine=67371022;
 //BA.debugLineNum = 67371022;BA.debugLine="UiStyle.SetPaneStyle(buttonView, \"-fx-cursor: han";
_uistyle._setpanestyle /*String*/ (_buttonview,"-fx-cursor: hand; -fx-border-radius: 12; -fx-background-radius: 12; -fx-text-fill: "+_uistyle._colortocss /*String*/ (_textcolor)+";");
RDebugUtils.currentLine=67371023;
 //BA.debugLineNum = 67371023;BA.debugLine="buttonView.Font = xui.CreateDefaultBoldFont(13)";
_buttonview.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (13)));
RDebugUtils.currentLine=67371024;
 //BA.debugLineNum = 67371024;BA.debugLine="End Sub";
return "";
}
public String  _updatevisiblemode(b4j.example.playeruicontroller __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "updatevisiblemode", false))
	 {return ((String) Debug.delegate(ba, "updatevisiblemode", new Object[] {_mode}));}
RDebugUtils.currentLine=66715648;
 //BA.debugLineNum = 66715648;BA.debugLine="Public Sub UpdateVisibleMode(mode As String)";
RDebugUtils.currentLine=66715649;
 //BA.debugLineNum = 66715649;BA.debugLine="setupPane.Visible = mode <> \"player\"";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible((_mode).equals("player") == false);
RDebugUtils.currentLine=66715650;
 //BA.debugLineNum = 66715650;BA.debugLine="playerPane.Visible = mode = \"player\"";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible((_mode).equals("player"));
RDebugUtils.currentLine=66715651;
 //BA.debugLineNum = 66715651;BA.debugLine="If mode = \"setup\" Then headerActionPane.Visible =";
if ((_mode).equals("setup")) { 
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);};
RDebugUtils.currentLine=66715652;
 //BA.debugLineNum = 66715652;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=67567616;
 //BA.debugLineNum = 67567616;BA.debugLine="Private Sub ApplyOrbitFrame(stepIndex As Int)";
RDebugUtils.currentLine=67567617;
 //BA.debugLineNum = 67567617;BA.debugLine="Dim opacity As Double";
_opacity = 0;
RDebugUtils.currentLine=67567618;
 //BA.debugLineNum = 67567618;BA.debugLine="If orbitFadeValue <= 0 Then";
if (__ref._orbitfadevalue /*double*/ <=0) { 
RDebugUtils.currentLine=67567619;
 //BA.debugLineNum = 67567619;BA.debugLine="opacity = 0";
_opacity = 0;
 }else {
RDebugUtils.currentLine=67567621;
 //BA.debugLineNum = 67567621;BA.debugLine="Dim basePhase As Double = stepIndex / 24";
_basephase = _stepindex/(double)24;
RDebugUtils.currentLine=67567622;
 //BA.debugLineNum = 67567622;BA.debugLine="Dim wave As Double = (Sin(basePhase * cPI * 2) +";
_wave = (__c.Sin(_basephase*__c.cPI*2)+1)/(double)2;
RDebugUtils.currentLine=67567623;
 //BA.debugLineNum = 67567623;BA.debugLine="opacity = (0.38 + wave * 0.28) * orbitFadeValue";
_opacity = (0.38+_wave*0.28)*__ref._orbitfadevalue /*double*/ ;
 };
RDebugUtils.currentLine=67567625;
 //BA.debugLineNum = 67567625;BA.debugLine="ApplyOrbitState(opacity)";
__ref._applyorbitstate /*String*/ (null,_opacity);
RDebugUtils.currentLine=67567626;
 //BA.debugLineNum = 67567626;BA.debugLine="End Sub";
return "";
}
public String  _applyorbitstate(b4j.example.playeruicontroller __ref,double _opacity) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "applyorbitstate", false))
	 {return ((String) Debug.delegate(ba, "applyorbitstate", new Object[] {_opacity}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=67633152;
 //BA.debugLineNum = 67633152;BA.debugLine="Private Sub ApplyOrbitState(opacity As Double)";
RDebugUtils.currentLine=67633153;
 //BA.debugLineNum = 67633153;BA.debugLine="Dim jo As JavaObject = orbitPane";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=67633154;
 //BA.debugLineNum = 67633154;BA.debugLine="jo.RunMethod(\"setOpacity\", Array As Object(opacit";
_jo.RunMethod("setOpacity",new Object[]{(Object)(_opacity)});
RDebugUtils.currentLine=67633155;
 //BA.debugLineNum = 67633155;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
RDebugUtils.currentLine=65667072;
 //BA.debugLineNum = 65667072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=65667073;
 //BA.debugLineNum = 65667073;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=65667074;
 //BA.debugLineNum = 65667074;BA.debugLine="Private lblStream As B4XView";
_lblstream = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667075;
 //BA.debugLineNum = 65667075;BA.debugLine="Private lblInfo As B4XView";
_lblinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667076;
 //BA.debugLineNum = 65667076;BA.debugLine="Private lblHeader As B4XView";
_lblheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667077;
 //BA.debugLineNum = 65667077;BA.debugLine="Private lblConnectionIcon As B4XView";
_lblconnectionicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667078;
 //BA.debugLineNum = 65667078;BA.debugLine="Private lblHeaderAction As B4XView";
_lblheaderaction = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667079;
 //BA.debugLineNum = 65667079;BA.debugLine="Private lblSetupMessage As B4XView";
_lblsetupmessage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667080;
 //BA.debugLineNum = 65667080;BA.debugLine="Private lblPlayIcon As B4XView";
_lblplayicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667081;
 //BA.debugLineNum = 65667081;BA.debugLine="Private confirmPane As B4XView";
_confirmpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667082;
 //BA.debugLineNum = 65667082;BA.debugLine="Private btnConfirmYes As B4XView";
_btnconfirmyes = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667083;
 //BA.debugLineNum = 65667083;BA.debugLine="Private btnConfirmNo As B4XView";
_btnconfirmno = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667084;
 //BA.debugLineNum = 65667084;BA.debugLine="Private setupPane As B4XView";
_setuppane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667085;
 //BA.debugLineNum = 65667085;BA.debugLine="Private playerPane As B4XView";
_playerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667086;
 //BA.debugLineNum = 65667086;BA.debugLine="Private headerActionPane As B4XView";
_headeractionpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667087;
 //BA.debugLineNum = 65667087;BA.debugLine="Private btnSetupSubmit As B4XView";
_btnsetupsubmit = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667088;
 //BA.debugLineNum = 65667088;BA.debugLine="Private txtPlayerCode As TextField";
_txtplayercode = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65667089;
 //BA.debugLineNum = 65667089;BA.debugLine="Private txtPlayerCodeView As B4XView";
_txtplayercodeview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667090;
 //BA.debugLineNum = 65667090;BA.debugLine="Private playButtonPane As B4XView";
_playbuttonpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667091;
 //BA.debugLineNum = 65667091;BA.debugLine="Private orbitPane As B4XView";
_orbitpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667092;
 //BA.debugLineNum = 65667092;BA.debugLine="Private accessCirclePane As B4XView";
_accesscirclepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667093;
 //BA.debugLineNum = 65667093;BA.debugLine="Private accessCorePane As B4XView";
_accesscorepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667094;
 //BA.debugLineNum = 65667094;BA.debugLine="Private accessInputPane As B4XView";
_accessinputpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667095;
 //BA.debugLineNum = 65667095;BA.debugLine="Private iconCloudOk As String";
_iconcloudok = "";
RDebugUtils.currentLine=65667096;
 //BA.debugLineNum = 65667096;BA.debugLine="Private iconCloudOff As String";
_iconcloudoff = "";
RDebugUtils.currentLine=65667097;
 //BA.debugLineNum = 65667097;BA.debugLine="Private iconCloudDegraded As String";
_iconclouddegraded = "";
RDebugUtils.currentLine=65667098;
 //BA.debugLineNum = 65667098;BA.debugLine="Private iconMore As String";
_iconmore = "";
RDebugUtils.currentLine=65667099;
 //BA.debugLineNum = 65667099;BA.debugLine="Private iconClose As String";
_iconclose = "";
RDebugUtils.currentLine=65667100;
 //BA.debugLineNum = 65667100;BA.debugLine="Private iconPlay As String";
_iconplay = "";
RDebugUtils.currentLine=65667101;
 //BA.debugLineNum = 65667101;BA.debugLine="Private iconStop As String";
_iconstop = "";
RDebugUtils.currentLine=65667102;
 //BA.debugLineNum = 65667102;BA.debugLine="Private playIconBaseSize As Float";
_playiconbasesize = 0f;
RDebugUtils.currentLine=65667103;
 //BA.debugLineNum = 65667103;BA.debugLine="Private stopIconBaseSize As Float";
_stopiconbasesize = 0f;
RDebugUtils.currentLine=65667104;
 //BA.debugLineNum = 65667104;BA.debugLine="Private headerActionFontSize As Float";
_headeractionfontsize = 0f;
RDebugUtils.currentLine=65667105;
 //BA.debugLineNum = 65667105;BA.debugLine="Private codeFontSize As Float";
_codefontsize = 0f;
RDebugUtils.currentLine=65667106;
 //BA.debugLineNum = 65667106;BA.debugLine="Private orbitFadeValue As Double";
_orbitfadevalue = 0;
RDebugUtils.currentLine=65667107;
 //BA.debugLineNum = 65667107;BA.debugLine="Private orbitFadeTarget As Double";
_orbitfadetarget = 0;
RDebugUtils.currentLine=65667108;
 //BA.debugLineNum = 65667108;BA.debugLine="End Sub";
return "";
}
public String  _setstreamtext(b4j.example.playeruicontroller __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "setstreamtext", false))
	 {return ((String) Debug.delegate(ba, "setstreamtext", new Object[] {_text}));}
RDebugUtils.currentLine=66322432;
 //BA.debugLineNum = 66322432;BA.debugLine="Public Sub SetStreamText(text As String)";
RDebugUtils.currentLine=66322433;
 //BA.debugLineNum = 66322433;BA.debugLine="lblStream.Text = text";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
RDebugUtils.currentLine=66322434;
 //BA.debugLineNum = 66322434;BA.debugLine="End Sub";
return "";
}
public String  _joinlist(b4j.example.playeruicontroller __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=67698688;
 //BA.debugLineNum = 67698688;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=67698689;
 //BA.debugLineNum = 67698689;BA.debugLine="If items.IsInitialized = False Or items.Size = 0";
if (_items.IsInitialized()==__c.False || _items.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=67698690;
 //BA.debugLineNum = 67698690;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=67698691;
 //BA.debugLineNum = 67698691;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=67698692;
 //BA.debugLineNum = 67698692;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=67698693;
 //BA.debugLineNum = 67698693;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=67698694;
 //BA.debugLineNum = 67698694;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=67698696;
 //BA.debugLineNum = 67698696;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=67698697;
 //BA.debugLineNum = 67698697;BA.debugLine="End Sub";
return "";
}
public String  _stoporbitanimation(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "stoporbitanimation", false))
	 {return ((String) Debug.delegate(ba, "stoporbitanimation", null));}
RDebugUtils.currentLine=67108864;
 //BA.debugLineNum = 67108864;BA.debugLine="Public Sub StopOrbitAnimation";
RDebugUtils.currentLine=67108865;
 //BA.debugLineNum = 67108865;BA.debugLine="orbitFadeTarget = 0";
__ref._orbitfadetarget /*double*/  = 0;
RDebugUtils.currentLine=67108866;
 //BA.debugLineNum = 67108866;BA.debugLine="If orbitFadeValue = 0 Then ApplyOrbitState(0)";
if (__ref._orbitfadevalue /*double*/ ==0) { 
__ref._applyorbitstate /*String*/ (null,0);};
RDebugUtils.currentLine=67108867;
 //BA.debugLineNum = 67108867;BA.debugLine="End Sub";
return "";
}
public String  _startorbitanimation(b4j.example.playeruicontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playeruicontroller";
if (Debug.shouldDelegate(ba, "startorbitanimation", false))
	 {return ((String) Debug.delegate(ba, "startorbitanimation", null));}
RDebugUtils.currentLine=67043328;
 //BA.debugLineNum = 67043328;BA.debugLine="Public Sub StartOrbitAnimation";
RDebugUtils.currentLine=67043329;
 //BA.debugLineNum = 67043329;BA.debugLine="orbitFadeTarget = 1";
__ref._orbitfadetarget /*double*/  = 1;
RDebugUtils.currentLine=67043330;
 //BA.debugLineNum = 67043330;BA.debugLine="End Sub";
return "";
}
}