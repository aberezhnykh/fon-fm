package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class uistyle {
private static uistyle mostCurrent = new uistyle();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public static String  _applymaterialiconfont(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui,anywheresoftware.b4a.objects.B4XViewWrapper _view,float _fontsize) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Public Sub ApplyMaterialIconFont(xui As XUI, view";
 //BA.debugLineNum = 25;BA.debugLine="view.Font = xui.CreateMaterialIcons(fontSize)";
_view.setFont(_xui.CreateMaterialIcons(_fontsize));
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static String  _colortocss(anywheresoftware.b4a.BA _ba,int _color) throws Exception{
long _unsignedcolor = 0L;
int _rgb = 0;
 //BA.debugLineNum = 43;BA.debugLine="Public Sub ColorToCss(color As Int) As String";
 //BA.debugLineNum = 44;BA.debugLine="Dim unsignedColor As Long = Bit.And(0xFFFFFFFF, c";
_unsignedcolor = (long) (anywheresoftware.b4a.keywords.Common.Bit.And(((int)0xffffffff),_color));
 //BA.debugLineNum = 45;BA.debugLine="Dim rgb As Int = Bit.And(unsignedColor, 0xFFFFFF)";
_rgb = anywheresoftware.b4a.keywords.Common.Bit.And((int) (_unsignedcolor),((int)0xffffff));
 //BA.debugLineNum = 46;BA.debugLine="Return \"#\" & Bit.ToHexString(rgb)";
if (true) return "#"+anywheresoftware.b4a.keywords.Common.Bit.ToHexString(_rgb);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui,String _text,float _fontsize,int _textcolor,boolean _bold,boolean _wraptext) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
 //BA.debugLineNum = 8;BA.debugLine="Public Sub CreateLabel(xui As XUI, text As String,";
 //BA.debugLineNum = 9;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(_ba,"");
 //BA.debugLineNum = 11;BA.debugLine="lbl.Text = text";
_lbl.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 12;BA.debugLine="lbl.SingleLine = Not(wrapText)";
_lbl.setSingleLine(anywheresoftware.b4a.keywords.Common.Not(_wraptext));
 //BA.debugLineNum = 13;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 14;BA.debugLine="If bold Then";
if (_bold) { 
 //BA.debugLineNum = 15;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(fontSize)";
_xlbl.setFont(_xui.CreateDefaultBoldFont(_fontsize));
 }else {
 //BA.debugLineNum = 17;BA.debugLine="xlbl.Font = xui.CreateDefaultFont(fontSize)";
_xlbl.setFont(_xui.CreateDefaultFont(_fontsize));
 };
 //BA.debugLineNum = 19;BA.debugLine="xlbl.TextColor = textColor";
_xlbl.setTextColor(_textcolor);
 //BA.debugLineNum = 20;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 21;BA.debugLine="Return xlbl";
if (true) return _xlbl;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static int  _scalevalue(anywheresoftware.b4a.BA _ba,int _availablewidth,int _smallvalue,int _mediumvalue,int _largevalue) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub ScaleValue(availableWidth As Int, small";
 //BA.debugLineNum = 38;BA.debugLine="If availableWidth <= 420dip Then Return smallValu";
if (_availablewidth<=anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (420))) { 
if (true) return _smallvalue;};
 //BA.debugLineNum = 39;BA.debugLine="If availableWidth <= 720dip Then Return mediumVal";
if (_availablewidth<=anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (720))) { 
if (true) return _mediumvalue;};
 //BA.debugLineNum = 40;BA.debugLine="Return largeValue";
if (true) return _largevalue;
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return 0;
}
public static String  _setlabelstyle(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub SetLabelStyle(view As B4XView, style As";
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _setpanestyle(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub SetPaneStyle(view As B4XView, style As";
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public static String  _setpickonbounds(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _view,boolean _value) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub SetPickOnBounds(view As B4XView, value";
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
}
