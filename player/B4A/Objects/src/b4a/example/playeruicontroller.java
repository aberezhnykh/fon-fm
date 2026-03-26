package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playeruicontroller extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playeruicontroller");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playeruicontroller.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtplayercode = null;
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
public boolean _initializedvalue = false;
public boolean _orbitidlevalue = false;
public float _playiconbasesize = 0f;
public float _stopiconbasesize = 0f;
public float _headeractionfontsize = 0f;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public boolean  _advanceorbitframe(int _framestep,double _fadestep) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Public Sub AdvanceOrbitFrame(frameStep As Int, fad";
 //BA.debugLineNum = 185;BA.debugLine="If orbitIdleValue Then Return True";
if (_orbitidlevalue) { 
if (true) return __c.True;};
 //BA.debugLineNum = 186;BA.debugLine="If (frameStep Mod 2) = 0 Then";
if ((_framestep%2)==0) { 
 //BA.debugLineNum = 187;BA.debugLine="orbitPane.Color = 0x11000000";
_orbitpane.setColor(((int)0x11000000));
 }else {
 //BA.debugLineNum = 189;BA.debugLine="orbitPane.Color = xui.Color_Transparent";
_orbitpane.setColor(_xui.Color_Transparent);
 };
 //BA.debugLineNum = 191;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return false;
}
public String  _applystoppedstate(String _idletext) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Public Sub ApplyStoppedState(idleText As String)";
 //BA.debugLineNum = 244;BA.debugLine="ShowStream(idleText)";
_showstream(_idletext);
 //BA.debugLineNum = 245;BA.debugLine="SetStatusText(\"\")";
_setstatustext("");
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public String  _bringtofront(anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Public Sub BringToFront(view As B4XView)";
 //BA.debugLineNum = 240;BA.debugLine="view.BringToFront";
_view.BringToFront();
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 7;BA.debugLine="Private lblStream As B4XView";
_lblstream = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private lblInfo As B4XView";
_lblinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private lblHeader As B4XView";
_lblheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private lblConnectionIcon As B4XView";
_lblconnectionicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private lblHeaderAction As B4XView";
_lblheaderaction = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private lblSetupMessage As B4XView";
_lblsetupmessage = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private lblPlayIcon As B4XView";
_lblplayicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private confirmPane As B4XView";
_confirmpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private btnConfirmYes As B4XView";
_btnconfirmyes = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private btnConfirmNo As B4XView";
_btnconfirmno = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private setupPane As B4XView";
_setuppane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private playerPane As B4XView";
_playerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private headerActionPane As B4XView";
_headeractionpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private btnSetupSubmit As B4XView";
_btnsetupsubmit = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private txtPlayerCode As EditText";
_txtplayercode = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private txtPlayerCodeView As B4XView";
_txtplayercodeview = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private playButtonPane As B4XView";
_playbuttonpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private orbitPane As B4XView";
_orbitpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private accessCirclePane As B4XView";
_accesscirclepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private accessCorePane As B4XView";
_accesscorepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private accessInputPane As B4XView";
_accessinputpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private iconCloudOk As String";
_iconcloudok = "";
 //BA.debugLineNum = 29;BA.debugLine="Private iconCloudOff As String";
_iconcloudoff = "";
 //BA.debugLineNum = 30;BA.debugLine="Private iconCloudDegraded As String";
_iconclouddegraded = "";
 //BA.debugLineNum = 31;BA.debugLine="Private iconMore As String";
_iconmore = "";
 //BA.debugLineNum = 32;BA.debugLine="Private iconClose As String";
_iconclose = "";
 //BA.debugLineNum = 33;BA.debugLine="Private iconPlay As String";
_iconplay = "";
 //BA.debugLineNum = 34;BA.debugLine="Private iconStop As String";
_iconstop = "";
 //BA.debugLineNum = 35;BA.debugLine="Private initializedValue As Boolean";
_initializedvalue = false;
 //BA.debugLineNum = 36;BA.debugLine="Private orbitIdleValue As Boolean = True";
_orbitidlevalue = __c.True;
 //BA.debugLineNum = 37;BA.debugLine="Private playIconBaseSize As Float";
_playiconbasesize = 0f;
 //BA.debugLineNum = 38;BA.debugLine="Private stopIconBaseSize As Float";
_stopiconbasesize = 0f;
 //BA.debugLineNum = 39;BA.debugLine="Private headerActionFontSize As Float";
_headeractionfontsize = 0f;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _configureplayerheader() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Public Sub ConfigurePlayerHeader";
 //BA.debugLineNum = 144;BA.debugLine="headerActionPane.Visible = True";
_headeractionpane.setVisible(__c.True);
 //BA.debugLineNum = 145;BA.debugLine="lblHeaderAction.Text = iconMore";
_lblheaderaction.setText(BA.ObjectToCharSequence(_iconmore));
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _configuresetupscreen(String _mode,String _formattedplayercode,String _messagetext,String _setuptitle,String _settingsthanks,String _submittext,String _logouttext) throws Exception{
boolean _issettingsmode = false;
 //BA.debugLineNum = 118;BA.debugLine="Public Sub ConfigureSetupScreen(mode As String, fo";
 //BA.debugLineNum = 119;BA.debugLine="Dim isSettingsMode As Boolean = mode = \"settings\"";
_issettingsmode = (_mode).equals("settings");
 //BA.debugLineNum = 120;BA.debugLine="headerActionPane.Visible = mode <> \"setup\"";
_headeractionpane.setVisible((_mode).equals("setup") == false);
 //BA.debugLineNum = 121;BA.debugLine="If isSettingsMode Then";
if (_issettingsmode) { 
 //BA.debugLineNum = 122;BA.debugLine="lblHeaderAction.Text = iconClose";
_lblheaderaction.setText(BA.ObjectToCharSequence(_iconclose));
 //BA.debugLineNum = 123;BA.debugLine="txtPlayerCode.Enabled = False";
_txtplayercode.setEnabled(__c.False);
 //BA.debugLineNum = 124;BA.debugLine="btnSetupSubmit.Text = logoutText.ToUpperCase";
_btnsetupsubmit.setText(BA.ObjectToCharSequence(_logouttext.toUpperCase()));
 }else {
 //BA.debugLineNum = 126;BA.debugLine="lblHeaderAction.Text = iconMore";
_lblheaderaction.setText(BA.ObjectToCharSequence(_iconmore));
 //BA.debugLineNum = 127;BA.debugLine="txtPlayerCode.Enabled = True";
_txtplayercode.setEnabled(__c.True);
 //BA.debugLineNum = 128;BA.debugLine="btnSetupSubmit.Text = submitText.ToUpperCase";
_btnsetupsubmit.setText(BA.ObjectToCharSequence(_submittext.toUpperCase()));
 };
 //BA.debugLineNum = 130;BA.debugLine="txtPlayerCode.Text = formattedPlayerCode";
_txtplayercode.setText(BA.ObjectToCharSequence(_formattedplayercode));
 //BA.debugLineNum = 131;BA.debugLine="SetPlayerCodeSelectionToEnd";
_setplayercodeselectiontoend();
 //BA.debugLineNum = 132;BA.debugLine="If messageText <> \"\" Then";
if ((_messagetext).equals("") == false) { 
 //BA.debugLineNum = 133;BA.debugLine="lblSetupMessage.Text = messageText";
_lblsetupmessage.setText(BA.ObjectToCharSequence(_messagetext));
 }else if(_issettingsmode) { 
 //BA.debugLineNum = 135;BA.debugLine="lblSetupMessage.Text = settingsThanks";
_lblsetupmessage.setText(BA.ObjectToCharSequence(_settingsthanks));
 }else {
 //BA.debugLineNum = 137;BA.debugLine="lblSetupMessage.Text = setupTitle";
_lblsetupmessage.setText(BA.ObjectToCharSequence(_setuptitle));
 };
 //BA.debugLineNum = 139;BA.debugLine="UpdateTextButtonAppearance(btnSetupSubmit, False)";
_updatetextbuttonappearance(_btnsetupsubmit,__c.False);
 //BA.debugLineNum = 140;BA.debugLine="If formattedPlayerCode = \"\" Then lblHeader.Text =";
if ((_formattedplayercode).equals("")) { 
_lblheader.setText(BA.ObjectToCharSequence(""));};
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _hidecontentblocks() throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Public Sub HideContentBlocks";
 //BA.debugLineNum = 249;BA.debugLine="HidePin";
_hidepin();
 //BA.debugLineNum = 250;BA.debugLine="ShowStream(\"\")";
_showstream("");
 //BA.debugLineNum = 251;BA.debugLine="SetStatusText(\"\")";
_setstatustext("");
 //BA.debugLineNum = 252;BA.debugLine="btnConfirmYes.Enabled = True";
_btnconfirmyes.setEnabled(__c.True);
 //BA.debugLineNum = 253;BA.debugLine="btnConfirmNo.Enabled = True";
_btnconfirmno.setEnabled(__c.True);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public String  _hidepin() throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Public Sub HidePin";
 //BA.debugLineNum = 274;BA.debugLine="confirmPane.Visible = False";
_confirmpane.setVisible(__c.False);
 //BA.debugLineNum = 275;BA.debugLine="btnConfirmYes.Enabled = True";
_btnconfirmyes.setEnabled(__c.True);
 //BA.debugLineNum = 276;BA.debugLine="btnConfirmNo.Enabled = True";
_btnconfirmno.setEnabled(__c.True);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xuivalue,anywheresoftware.b4a.objects.B4XViewWrapper _streamlabel,anywheresoftware.b4a.objects.B4XViewWrapper _infolabel,anywheresoftware.b4a.objects.B4XViewWrapper _headerlabel,anywheresoftware.b4a.objects.B4XViewWrapper _connectioniconlabel,anywheresoftware.b4a.objects.B4XViewWrapper _headeractionlabel,anywheresoftware.b4a.objects.B4XViewWrapper _setupmessagelabel,anywheresoftware.b4a.objects.B4XViewWrapper _playiconlabel,anywheresoftware.b4a.objects.B4XViewWrapper _confirmpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _confirmyesbutton,anywheresoftware.b4a.objects.B4XViewWrapper _confirmnobutton,anywheresoftware.b4a.objects.B4XViewWrapper _setuppanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _playerpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _headeractionpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _playbuttonpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _orbitpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _accesscirclepanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _accesscorepanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _accessinputpanevalue,anywheresoftware.b4a.objects.B4XViewWrapper _setupsubmitbutton,anywheresoftware.b4a.objects.EditTextWrapper _playercodeinput,anywheresoftware.b4a.objects.B4XViewWrapper _playercodeinputview,String _iconcloudokvalue,String _iconcloudoffvalue,String _iconclouddegradedvalue,String _iconmorevalue,String _iconclosevalue,String _iconplayvalue,String _iconstopvalue) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 42;BA.debugLine="Public Sub Initialize(xuiValue As XUI, streamLabel";
 //BA.debugLineNum = 43;BA.debugLine="xui = xuiValue";
_xui = _xuivalue;
 //BA.debugLineNum = 44;BA.debugLine="lblStream = streamLabel";
_lblstream = _streamlabel;
 //BA.debugLineNum = 45;BA.debugLine="lblInfo = infoLabel";
_lblinfo = _infolabel;
 //BA.debugLineNum = 46;BA.debugLine="lblHeader = headerLabel";
_lblheader = _headerlabel;
 //BA.debugLineNum = 47;BA.debugLine="lblConnectionIcon = connectionIconLabel";
_lblconnectionicon = _connectioniconlabel;
 //BA.debugLineNum = 48;BA.debugLine="lblHeaderAction = headerActionLabel";
_lblheaderaction = _headeractionlabel;
 //BA.debugLineNum = 49;BA.debugLine="lblSetupMessage = setupMessageLabel";
_lblsetupmessage = _setupmessagelabel;
 //BA.debugLineNum = 50;BA.debugLine="lblPlayIcon = playIconLabel";
_lblplayicon = _playiconlabel;
 //BA.debugLineNum = 51;BA.debugLine="confirmPane = confirmPaneValue";
_confirmpane = _confirmpanevalue;
 //BA.debugLineNum = 52;BA.debugLine="btnConfirmYes = confirmYesButton";
_btnconfirmyes = _confirmyesbutton;
 //BA.debugLineNum = 53;BA.debugLine="btnConfirmNo = confirmNoButton";
_btnconfirmno = _confirmnobutton;
 //BA.debugLineNum = 54;BA.debugLine="setupPane = setupPaneValue";
_setuppane = _setuppanevalue;
 //BA.debugLineNum = 55;BA.debugLine="playerPane = playerPaneValue";
_playerpane = _playerpanevalue;
 //BA.debugLineNum = 56;BA.debugLine="headerActionPane = headerActionPaneValue";
_headeractionpane = _headeractionpanevalue;
 //BA.debugLineNum = 57;BA.debugLine="playButtonPane = playButtonPaneValue";
_playbuttonpane = _playbuttonpanevalue;
 //BA.debugLineNum = 58;BA.debugLine="orbitPane = orbitPaneValue";
_orbitpane = _orbitpanevalue;
 //BA.debugLineNum = 59;BA.debugLine="accessCirclePane = accessCirclePaneValue";
_accesscirclepane = _accesscirclepanevalue;
 //BA.debugLineNum = 60;BA.debugLine="accessCorePane = accessCorePaneValue";
_accesscorepane = _accesscorepanevalue;
 //BA.debugLineNum = 61;BA.debugLine="accessInputPane = accessInputPaneValue";
_accessinputpane = _accessinputpanevalue;
 //BA.debugLineNum = 62;BA.debugLine="btnSetupSubmit = setupSubmitButton";
_btnsetupsubmit = _setupsubmitbutton;
 //BA.debugLineNum = 63;BA.debugLine="txtPlayerCode = playerCodeInput";
_txtplayercode = _playercodeinput;
 //BA.debugLineNum = 64;BA.debugLine="txtPlayerCodeView = playerCodeInputView";
_txtplayercodeview = _playercodeinputview;
 //BA.debugLineNum = 65;BA.debugLine="iconCloudOk = iconCloudOkValue";
_iconcloudok = _iconcloudokvalue;
 //BA.debugLineNum = 66;BA.debugLine="iconCloudOff = iconCloudOffValue";
_iconcloudoff = _iconcloudoffvalue;
 //BA.debugLineNum = 67;BA.debugLine="iconCloudDegraded = iconCloudDegradedValue";
_iconclouddegraded = _iconclouddegradedvalue;
 //BA.debugLineNum = 68;BA.debugLine="iconMore = iconMoreValue";
_iconmore = _iconmorevalue;
 //BA.debugLineNum = 69;BA.debugLine="iconClose = iconCloseValue";
_iconclose = _iconclosevalue;
 //BA.debugLineNum = 70;BA.debugLine="iconPlay = iconPlayValue";
_iconplay = _iconplayvalue;
 //BA.debugLineNum = 71;BA.debugLine="iconStop = iconStopValue";
_iconstop = _iconstopvalue;
 //BA.debugLineNum = 72;BA.debugLine="If txtPlayerCode.IsInitialized Then";
if (_txtplayercode.IsInitialized()) { 
 //BA.debugLineNum = 73;BA.debugLine="txtPlayerCode.Gravity = 17";
_txtplayercode.setGravity((int) (17));
 //BA.debugLineNum = 74;BA.debugLine="txtPlayerCode.SingleLine = True";
_txtplayercode.setSingleLine(__c.True);
 };
 //BA.debugLineNum = 76;BA.debugLine="initializedValue = True";
_initializedvalue = __c.True;
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public boolean  _isinitialized() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub IsInitialized As Boolean";
 //BA.debugLineNum = 80;BA.debugLine="Return initializedValue";
if (true) return _initializedvalue;
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return false;
}
public boolean  _isorbitidle() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub IsOrbitIdle As Boolean";
 //BA.debugLineNum = 84;BA.debugLine="Return orbitIdleValue";
if (true) return _orbitidlevalue;
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return false;
}
public String  _joinlist(anywheresoftware.b4a.objects.collections.List _values,String _separator) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
 //BA.debugLineNum = 316;BA.debugLine="Private Sub JoinList(values As List, separator As";
 //BA.debugLineNum = 317;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 318;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 319;BA.debugLine="For i = 0 To values.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_values.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 320;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
 //BA.debugLineNum = 321;BA.debugLine="sb.Append(values.Get(i))";
_sb.Append(BA.ObjectToString(_values.Get(_i)));
 }
};
 //BA.debugLineNum = 323;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return "";
}
public String  _renderplayerhead(String _formattedcode,String _title) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub RenderPlayerHead(formattedCode As Strin";
 //BA.debugLineNum = 111;BA.debugLine="If title <> \"\" Then";
if ((_title).equals("") == false) { 
 //BA.debugLineNum = 112;BA.debugLine="lblHeader.Text = formattedCode & \" • \" & title";
_lblheader.setText(BA.ObjectToCharSequence(_formattedcode+" • "+_title));
 }else {
 //BA.debugLineNum = 114;BA.debugLine="lblHeader.Text = formattedCode";
_lblheader.setText(BA.ObjectToCharSequence(_formattedcode));
 };
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _setplayercodeselectiontoend() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 326;BA.debugLine="Private Sub SetPlayerCodeSelectionToEnd";
 //BA.debugLineNum = 327;BA.debugLine="If txtPlayerCode.IsInitialized = False Then Retur";
if (_txtplayercode.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 328;BA.debugLine="Try";
try { //BA.debugLineNum = 329;BA.debugLine="Dim jo As JavaObject = txtPlayerCode";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_txtplayercode.getObject()));
 //BA.debugLineNum = 330;BA.debugLine="jo.RunMethod(\"setSelection\", Array As Object(txt";
_jo.RunMethod("setSelection",new Object[]{(Object)(_txtplayercode.getText().length())});
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 332;BA.debugLine="Log(\"PlayerUiController.SetPlayerCodeSelectionTo";
__c.LogImpl("377791238","PlayerUiController.SetPlayerCodeSelectionToEnd: "+__c.LastException(ba).getMessage(),0);
 };
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return "";
}
public String  _setplayicon() throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Public Sub SetPlayIcon";
 //BA.debugLineNum = 155;BA.debugLine="orbitIdleValue = True";
_orbitidlevalue = __c.True;
 //BA.debugLineNum = 156;BA.debugLine="lblPlayIcon.Text = iconPlay";
_lblplayicon.setText(BA.ObjectToCharSequence(_iconplay));
 //BA.debugLineNum = 157;BA.debugLine="lblPlayIcon.Font = xui.CreateMaterialIcons(Max(36";
_lblplayicon.setFont(_xui.CreateMaterialIcons((float) (__c.Max(36,_playiconbasesize))));
 //BA.debugLineNum = 158;BA.debugLine="lblPlayIcon.TextColor = 0xFFD0FF71";
_lblplayicon.setTextColor(((int)0xffd0ff71));
 //BA.debugLineNum = 159;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
_orbitpane.SetColorAndBorder(_xui.Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x00d0ff71),__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 160;BA.debugLine="UpdatePlayButtonAppearance(False, False)";
_updateplaybuttonappearance(__c.False,__c.False);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public String  _setstatustext(String _text) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub SetStatusText(text As String)";
 //BA.debugLineNum = 107;BA.debugLine="lblInfo.Text = text";
_lblinfo.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _setstopicon() throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Public Sub SetStopIcon";
 //BA.debugLineNum = 164;BA.debugLine="orbitIdleValue = False";
_orbitidlevalue = __c.False;
 //BA.debugLineNum = 165;BA.debugLine="lblPlayIcon.Text = iconStop";
_lblplayicon.setText(BA.ObjectToCharSequence(_iconstop));
 //BA.debugLineNum = 166;BA.debugLine="lblPlayIcon.Font = xui.CreateMaterialIcons(Max(34";
_lblplayicon.setFont(_xui.CreateMaterialIcons((float) (__c.Max(34,_stopiconbasesize))));
 //BA.debugLineNum = 167;BA.debugLine="lblPlayIcon.TextColor = 0xFFD0FF71";
_lblplayicon.setTextColor(((int)0xffd0ff71));
 //BA.debugLineNum = 168;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
_orbitpane.SetColorAndBorder(_xui.Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x66d0ff71),__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 169;BA.debugLine="UpdatePlayButtonAppearance(False, True)";
_updateplaybuttonappearance(__c.False,__c.True);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public String  _showadmeta(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Public Sub ShowAdMeta(item As Map)";
 //BA.debugLineNum = 288;BA.debugLine="SetStatusText(item.GetDefault(\"title\", \"\"))";
_setstatustext(BA.ObjectToString(_item.GetDefault((Object)("title"),(Object)(""))));
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return "";
}
public String  _showclaimprompt(String _text) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Public Sub ShowClaimPrompt(text As String)";
 //BA.debugLineNum = 266;BA.debugLine="HideContentBlocks";
_hidecontentblocks();
 //BA.debugLineNum = 267;BA.debugLine="SetStatusText(text)";
_setstatustext(_text);
 //BA.debugLineNum = 268;BA.debugLine="confirmPane.Visible = True";
_confirmpane.setVisible(__c.True);
 //BA.debugLineNum = 269;BA.debugLine="UpdateTextButtonAppearance(btnConfirmYes, False)";
_updatetextbuttonappearance(_btnconfirmyes,__c.False);
 //BA.debugLineNum = 270;BA.debugLine="UpdateTextButtonAppearance(btnConfirmNo, False)";
_updatetextbuttonappearance(_btnconfirmno,__c.False);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return "";
}
public String  _showmessage(String _text) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Public Sub ShowMessage(text As String)";
 //BA.debugLineNum = 261;BA.debugLine="HideContentBlocks";
_hidecontentblocks();
 //BA.debugLineNum = 262;BA.debugLine="SetStatusText(text)";
_setstatustext(_text);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return "";
}
public String  _showstream(String _text) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Public Sub ShowStream(text As String)";
 //BA.debugLineNum = 257;BA.debugLine="lblStream.Text = text";
_lblstream.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return "";
}
public String  _showtrackmeta(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
anywheresoftware.b4a.objects.collections.List _parts = null;
 //BA.debugLineNum = 279;BA.debugLine="Public Sub ShowTrackMeta(item As Map)";
 //BA.debugLineNum = 280;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 281;BA.debugLine="parts.Initialize";
_parts.Initialize();
 //BA.debugLineNum = 282;BA.debugLine="If item.GetDefault(\"set\", \"\") <> \"\" Then parts.Ad";
if ((_item.GetDefault((Object)("set"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add(_item.Get((Object)("set")));};
 //BA.debugLineNum = 283;BA.debugLine="If item.GetDefault(\"code\", \"\") <> \"\" Then parts.A";
if ((_item.GetDefault((Object)("code"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add(_item.Get((Object)("code")));};
 //BA.debugLineNum = 284;BA.debugLine="SetStatusText(JoinList(parts, \" • \"))";
_setstatustext(_joinlist(_parts," • "));
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return "";
}
public String  _updatecodeinputappearance(boolean _isfocused) throws Exception{
int _circleborder = 0;
int _coreborder = 0;
 //BA.debugLineNum = 217;BA.debugLine="Public Sub UpdateCodeInputAppearance(isFocused As";
 //BA.debugLineNum = 218;BA.debugLine="If txtPlayerCode.IsInitialized = False Then Retur";
if (_txtplayercode.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 219;BA.debugLine="Dim circleBorder As Int";
_circleborder = 0;
 //BA.debugLineNum = 220;BA.debugLine="Dim coreBorder As Int";
_coreborder = 0;
 //BA.debugLineNum = 221;BA.debugLine="If isFocused Then";
if (_isfocused) { 
 //BA.debugLineNum = 222;BA.debugLine="circleBorder = 0x77FFFFFF";
_circleborder = ((int)0x77ffffff);
 //BA.debugLineNum = 223;BA.debugLine="coreBorder = 0x88FFFFFF";
_coreborder = ((int)0x88ffffff);
 }else {
 //BA.debugLineNum = 225;BA.debugLine="circleBorder = 0x55FFFFFF";
_circleborder = ((int)0x55ffffff);
 //BA.debugLineNum = 226;BA.debugLine="coreBorder = 0x44FFFFFF";
_coreborder = ((int)0x44ffffff);
 };
 //BA.debugLineNum = 228;BA.debugLine="accessCirclePane.SetColorAndBorder(0x07FFFFFF, 4d";
_accesscirclepane.SetColorAndBorder(((int)0x07ffffff),__c.DipToCurrent((int) (4)),_circleborder,__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 229;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
_accesscorepane.SetColorAndBorder(_xui.Color_Transparent,__c.DipToCurrent((int) (2)),_coreborder,__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 230;BA.debugLine="accessInputPane.Color = xui.Color_Transparent";
_accessinputpane.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 231;BA.debugLine="txtPlayerCode.Color = 0x00FFFFFF";
_txtplayercode.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 232;BA.debugLine="txtPlayerCode.TextColor = 0xFFF2F7FB";
_txtplayercode.setTextColor(((int)0xfff2f7fb));
 //BA.debugLineNum = 233;BA.debugLine="txtPlayerCode.HintColor = 0x88FFFFFF";
_txtplayercode.setHintColor(((int)0x88ffffff));
 //BA.debugLineNum = 234;BA.debugLine="If txtPlayerCodeView.IsInitialized Then";
if (_txtplayercodeview.IsInitialized()) { 
 //BA.debugLineNum = 235;BA.debugLine="txtPlayerCodeView.Visible = True";
_txtplayercodeview.setVisible(__c.True);
 };
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public String  _updateconnectionindicator(String _mode) throws Exception{
String _icontext = "";
int _iconcolor = 0;
 //BA.debugLineNum = 291;BA.debugLine="Public Sub UpdateConnectionIndicator(mode As Strin";
 //BA.debugLineNum = 292;BA.debugLine="Dim iconText As String = iconCloudOk";
_icontext = _iconcloudok;
 //BA.debugLineNum = 293;BA.debugLine="Dim iconColor As Int = 0xFFD0FF71";
_iconcolor = ((int)0xffd0ff71);
 //BA.debugLineNum = 294;BA.debugLine="Select mode";
switch (BA.switchObjectToInt(_mode,"online","offline","server","local","degraded","connecting")) {
case 0: {
 //BA.debugLineNum = 296;BA.debugLine="iconText = iconCloudOk";
_icontext = _iconcloudok;
 //BA.debugLineNum = 297;BA.debugLine="iconColor = 0xFFD0FF71";
_iconcolor = ((int)0xffd0ff71);
 break; }
case 1: 
case 2: {
 //BA.debugLineNum = 299;BA.debugLine="iconText = iconCloudOff";
_icontext = _iconcloudoff;
 //BA.debugLineNum = 300;BA.debugLine="iconColor = 0xFFFF7A7A";
_iconcolor = ((int)0xffff7a7a);
 break; }
case 3: 
case 4: {
 //BA.debugLineNum = 302;BA.debugLine="iconText = iconCloudDegraded";
_icontext = _iconclouddegraded;
 //BA.debugLineNum = 303;BA.debugLine="iconColor = 0xFFFFD166";
_iconcolor = ((int)0xffffd166);
 break; }
case 5: {
 //BA.debugLineNum = 305;BA.debugLine="iconText = iconCloudOk";
_icontext = _iconcloudok;
 //BA.debugLineNum = 306;BA.debugLine="iconColor = 0xFF8E97A3";
_iconcolor = ((int)0xff8e97a3);
 break; }
default: {
 //BA.debugLineNum = 308;BA.debugLine="iconText = iconCloudOk";
_icontext = _iconcloudok;
 //BA.debugLineNum = 309;BA.debugLine="iconColor = 0xFFD0FF71";
_iconcolor = ((int)0xffd0ff71);
 break; }
}
;
 //BA.debugLineNum = 311;BA.debugLine="lblConnectionIcon.Text = iconText";
_lblconnectionicon.setText(BA.ObjectToCharSequence(_icontext));
 //BA.debugLineNum = 312;BA.debugLine="lblConnectionIcon.TextColor = iconColor";
_lblconnectionicon.setTextColor(_iconcolor);
 //BA.debugLineNum = 313;BA.debugLine="lblConnectionIcon.Font = xui.CreateMaterialIcons(";
_lblconnectionicon.setFont(_xui.CreateMaterialIcons((float) (16)));
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return "";
}
public String  _updateheaderactionappearance(boolean _ishovered) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Public Sub UpdateHeaderActionAppearance(isHovered";
 //BA.debugLineNum = 195;BA.debugLine="If headerActionPane.IsInitialized = False Then Re";
if (_headeractionpane.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 196;BA.debugLine="If isHovered Then";
if (_ishovered) { 
 //BA.debugLineNum = 197;BA.debugLine="headerActionPane.SetColorAndBorder(0x18000000, 1";
_headeractionpane.SetColorAndBorder(((int)0x18000000),__c.DipToCurrent((int) (1)),((int)0x24ffffff),__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 198;BA.debugLine="lblHeaderAction.TextColor = 0xFFF2F7FB";
_lblheaderaction.setTextColor(((int)0xfff2f7fb));
 }else {
 //BA.debugLineNum = 200;BA.debugLine="headerActionPane.SetColorAndBorder(0x11000000, 1";
_headeractionpane.SetColorAndBorder(((int)0x11000000),__c.DipToCurrent((int) (1)),((int)0x14ffffff),__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 201;BA.debugLine="lblHeaderAction.TextColor = 0xFFB9C0C9";
_lblheaderaction.setTextColor(((int)0xffb9c0c9));
 };
 //BA.debugLineNum = 203;BA.debugLine="lblHeaderAction.Font = xui.CreateMaterialIcons(Ma";
_lblheaderaction.setFont(_xui.CreateMaterialIcons((float) (__c.Max(18,_headeractionfontsize))));
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public String  _updateplaybuttonappearance(boolean _ishovered,boolean _isstarted) throws Exception{
int _backgroundcolor = 0;
 //BA.debugLineNum = 172;BA.debugLine="Public Sub UpdatePlayButtonAppearance(isHovered As";
 //BA.debugLineNum = 173;BA.debugLine="Dim backgroundColor As Int";
_backgroundcolor = 0;
 //BA.debugLineNum = 174;BA.debugLine="If isStarted Then";
if (_isstarted) { 
 //BA.debugLineNum = 175;BA.debugLine="backgroundColor = 0x14000000";
_backgroundcolor = ((int)0x14000000);
 }else if(_ishovered) { 
 //BA.debugLineNum = 177;BA.debugLine="backgroundColor = 0x18000000";
_backgroundcolor = ((int)0x18000000);
 }else {
 //BA.debugLineNum = 179;BA.debugLine="backgroundColor = 0x10000000";
_backgroundcolor = ((int)0x10000000);
 };
 //BA.debugLineNum = 181;BA.debugLine="playButtonPane.Color = backgroundColor";
_playbuttonpane.setColor(_backgroundcolor);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public String  _updateresponsivestyles(float _streamfontsize,float _infofontsize,float _playfontsize,float _stopfontsize,float _headeractionsizevalue,float _codesize,boolean _iscodeinputfocused,boolean _showstopicon) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub UpdateResponsiveStyles(streamFontSize A";
 //BA.debugLineNum = 88;BA.debugLine="playIconBaseSize = playFontSize";
_playiconbasesize = _playfontsize;
 //BA.debugLineNum = 89;BA.debugLine="stopIconBaseSize = stopFontSize";
_stopiconbasesize = _stopfontsize;
 //BA.debugLineNum = 90;BA.debugLine="headerActionFontSize = headerActionSizeValue";
_headeractionfontsize = _headeractionsizevalue;
 //BA.debugLineNum = 91;BA.debugLine="lblStream.Font = xui.CreateDefaultBoldFont(stream";
_lblstream.setFont(_xui.CreateDefaultBoldFont(_streamfontsize));
 //BA.debugLineNum = 92;BA.debugLine="lblInfo.Font = xui.CreateDefaultFont(infoFontSize";
_lblinfo.setFont(_xui.CreateDefaultFont(_infofontsize));
 //BA.debugLineNum = 93;BA.debugLine="lblHeader.Font = xui.CreateDefaultFont(12)";
_lblheader.setFont(_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 94;BA.debugLine="lblSetupMessage.Font = xui.CreateDefaultFont(info";
_lblsetupmessage.setFont(_xui.CreateDefaultFont(_infofontsize));
 //BA.debugLineNum = 95;BA.debugLine="txtPlayerCode.TextSize = codeSize";
_txtplayercode.setTextSize(_codesize);
 //BA.debugLineNum = 96;BA.debugLine="lblConnectionIcon.TextColor = 0xFF747B86";
_lblconnectionicon.setTextColor(((int)0xff747b86));
 //BA.debugLineNum = 97;BA.debugLine="UpdateHeaderActionAppearance(False)";
_updateheaderactionappearance(__c.False);
 //BA.debugLineNum = 98;BA.debugLine="UpdateCodeInputAppearance(isCodeInputFocused)";
_updatecodeinputappearance(_iscodeinputfocused);
 //BA.debugLineNum = 99;BA.debugLine="If showStopIcon Then";
if (_showstopicon) { 
 //BA.debugLineNum = 100;BA.debugLine="SetStopIcon";
_setstopicon();
 }else {
 //BA.debugLineNum = 102;BA.debugLine="SetPlayIcon";
_setplayicon();
 };
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _updatetextbuttonappearance(anywheresoftware.b4a.objects.B4XViewWrapper _buttonview,boolean _ishovered) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Public Sub UpdateTextButtonAppearance(buttonView A";
 //BA.debugLineNum = 207;BA.debugLine="If buttonView.IsInitialized = False Then Return";
if (_buttonview.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 208;BA.debugLine="If isHovered Then";
if (_ishovered) { 
 //BA.debugLineNum = 209;BA.debugLine="buttonView.SetColorAndBorder(0x18FFFFFF, 1dip, 0";
_buttonview.SetColorAndBorder(((int)0x18ffffff),__c.DipToCurrent((int) (1)),((int)0x34ffffff),__c.DipToCurrent((int) (12)));
 //BA.debugLineNum = 210;BA.debugLine="buttonView.TextColor = 0xFFF2F7FB";
_buttonview.setTextColor(((int)0xfff2f7fb));
 }else {
 //BA.debugLineNum = 212;BA.debugLine="buttonView.SetColorAndBorder(0x10FFFFFF, 1dip, 0";
_buttonview.SetColorAndBorder(((int)0x10ffffff),__c.DipToCurrent((int) (1)),((int)0x20ffffff),__c.DipToCurrent((int) (12)));
 //BA.debugLineNum = 213;BA.debugLine="buttonView.TextColor = 0xFFE0E4EA";
_buttonview.setTextColor(((int)0xffe0e4ea));
 };
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public String  _updatevisiblemode(String _mode) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Public Sub UpdateVisibleMode(mode As String)";
 //BA.debugLineNum = 149;BA.debugLine="setupPane.Visible = mode <> \"player\"";
_setuppane.setVisible((_mode).equals("player") == false);
 //BA.debugLineNum = 150;BA.debugLine="playerPane.Visible = mode = \"player\"";
_playerpane.setVisible((_mode).equals("player"));
 //BA.debugLineNum = 151;BA.debugLine="If mode = \"setup\" Then headerActionPane.Visible =";
if ((_mode).equals("setup")) { 
_headeractionpane.setVisible(__c.False);};
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
