package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class uistyle extends Object{
public static uistyle mostCurrent = new uistyle();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.uistyle", null);
		ba.loadHtSubs(uistyle.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.uistyle", ba);
		}
	}
    public static Class<?> getObject() {
		return uistyle.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.main _main = null;
public static b4j.example.platformbridge _platformbridge = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _setlabelstyle(anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "setlabelstyle", false))
	 {return ((String) Debug.delegate(ba, "setlabelstyle", new Object[] {_view,_style}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=68943872;
 //BA.debugLineNum = 68943872;BA.debugLine="Public Sub SetLabelStyle(view As B4XView, style As";
RDebugUtils.currentLine=68943873;
 //BA.debugLineNum = 68943873;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=68943874;
 //BA.debugLineNum = 68943874;BA.debugLine="jo.RunMethod(\"setStyle\", Array(MergeNodeStyle(jo.";
_jo.RunMethod("setStyle",new Object[]{(Object)(_mergenodestyle(BA.ObjectToString(_jo.RunMethod("getStyle",(Object[])(anywheresoftware.b4a.keywords.Common.Null))),_style))});
RDebugUtils.currentLine=68943875;
 //BA.debugLineNum = 68943875;BA.debugLine="End Sub";
return "";
}
public static String  _colortocss(int _color) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "colortocss", false))
	 {return ((String) Debug.delegate(ba, "colortocss", new Object[] {_color}));}
long _unsignedcolor = 0L;
int _rgb = 0;
RDebugUtils.currentLine=69206016;
 //BA.debugLineNum = 69206016;BA.debugLine="Public Sub ColorToCss(color As Int) As String";
RDebugUtils.currentLine=69206017;
 //BA.debugLineNum = 69206017;BA.debugLine="Dim unsignedColor As Long = Bit.And(0xFFFFFFFF, c";
_unsignedcolor = (long) (anywheresoftware.b4a.keywords.Common.Bit.And(((int)0xffffffff),_color));
RDebugUtils.currentLine=69206018;
 //BA.debugLineNum = 69206018;BA.debugLine="Dim rgb As Int = Bit.And(unsignedColor, 0xFFFFFF)";
_rgb = anywheresoftware.b4a.keywords.Common.Bit.And((int) (_unsignedcolor),((int)0xffffff));
RDebugUtils.currentLine=69206019;
 //BA.debugLineNum = 69206019;BA.debugLine="Return \"#\" & Bit.ToHexString(rgb)";
if (true) return "#"+anywheresoftware.b4a.keywords.Common.Bit.ToHexString(_rgb);
RDebugUtils.currentLine=69206020;
 //BA.debugLineNum = 69206020;BA.debugLine="End Sub";
return "";
}
public static String  _applymaterialiconfont(anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui,anywheresoftware.b4a.objects.B4XViewWrapper _view,float _fontsize) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "applymaterialiconfont", false))
	 {return ((String) Debug.delegate(ba, "applymaterialiconfont", new Object[] {_xui,_view,_fontsize}));}
RDebugUtils.currentLine=68812800;
 //BA.debugLineNum = 68812800;BA.debugLine="Public Sub ApplyMaterialIconFont(xui As XUI, view";
RDebugUtils.currentLine=68812801;
 //BA.debugLineNum = 68812801;BA.debugLine="view.Font = xui.CreateMaterialIcons(fontSize)";
_view.setFont(_xui.CreateMaterialIcons(_fontsize));
RDebugUtils.currentLine=68812802;
 //BA.debugLineNum = 68812802;BA.debugLine="End Sub";
return "";
}
public static String  _setpanestyle(anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "setpanestyle", false))
	 {return ((String) Debug.delegate(ba, "setpanestyle", new Object[] {_view,_style}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=68878336;
 //BA.debugLineNum = 68878336;BA.debugLine="Public Sub SetPaneStyle(view As B4XView, style As";
RDebugUtils.currentLine=68878337;
 //BA.debugLineNum = 68878337;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=68878338;
 //BA.debugLineNum = 68878338;BA.debugLine="jo.RunMethod(\"setStyle\", Array(MergeNodeStyle(jo.";
_jo.RunMethod("setStyle",new Object[]{(Object)(_mergenodestyle(BA.ObjectToString(_jo.RunMethod("getStyle",(Object[])(anywheresoftware.b4a.keywords.Common.Null))),_style))});
RDebugUtils.currentLine=68878339;
 //BA.debugLineNum = 68878339;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui,String _text,float _fontsize,int _textcolor,boolean _bold,boolean _wraptext) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_xui,_text,_fontsize,_textcolor,_bold,_wraptext}));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=68747264;
 //BA.debugLineNum = 68747264;BA.debugLine="Public Sub CreateLabel(xui As XUI, text As String,";
RDebugUtils.currentLine=68747265;
 //BA.debugLineNum = 68747265;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=68747266;
 //BA.debugLineNum = 68747266;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=68747267;
 //BA.debugLineNum = 68747267;BA.debugLine="lbl.Text = text";
_lbl.setText(_text);
RDebugUtils.currentLine=68747268;
 //BA.debugLineNum = 68747268;BA.debugLine="lbl.WrapText = wrapText";
_lbl.setWrapText(_wraptext);
RDebugUtils.currentLine=68747269;
 //BA.debugLineNum = 68747269;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=68747270;
 //BA.debugLineNum = 68747270;BA.debugLine="If bold Then";
if (_bold) { 
RDebugUtils.currentLine=68747271;
 //BA.debugLineNum = 68747271;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(fontSize)";
_xlbl.setFont(_xui.CreateDefaultBoldFont(_fontsize));
 }else {
RDebugUtils.currentLine=68747273;
 //BA.debugLineNum = 68747273;BA.debugLine="xlbl.Font = xui.CreateDefaultFont(fontSize)";
_xlbl.setFont(_xui.CreateDefaultFont(_fontsize));
 };
RDebugUtils.currentLine=68747275;
 //BA.debugLineNum = 68747275;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=68747276;
 //BA.debugLineNum = 68747276;BA.debugLine="SetLabelStyle(xlbl, \"-fx-alignment: center; -fx-t";
_setlabelstyle(_xlbl,"-fx-alignment: center; -fx-text-fill: "+_colortocss(_textcolor)+";");
RDebugUtils.currentLine=68747277;
 //BA.debugLineNum = 68747277;BA.debugLine="SetMouseTransparent(xlbl, True)";
_setmousetransparent(_xlbl,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=68747278;
 //BA.debugLineNum = 68747278;BA.debugLine="Return xlbl";
if (true) return _xlbl;
RDebugUtils.currentLine=68747279;
 //BA.debugLineNum = 68747279;BA.debugLine="End Sub";
return null;
}
public static String  _setmousetransparent(anywheresoftware.b4a.objects.B4XViewWrapper _view,boolean _value) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "setmousetransparent", false))
	 {return ((String) Debug.delegate(ba, "setmousetransparent", new Object[] {_view,_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=69009408;
 //BA.debugLineNum = 69009408;BA.debugLine="Public Sub SetMouseTransparent(view As B4XView, va";
RDebugUtils.currentLine=69009409;
 //BA.debugLineNum = 69009409;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=69009410;
 //BA.debugLineNum = 69009410;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(value))";
_jo.RunMethod("setMouseTransparent",new Object[]{(Object)(_value)});
RDebugUtils.currentLine=69009411;
 //BA.debugLineNum = 69009411;BA.debugLine="End Sub";
return "";
}
public static String  _mergenodestyle(String _currentstyle,String _extrastyle) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "mergenodestyle", false))
	 {return ((String) Debug.delegate(ba, "mergenodestyle", new Object[] {_currentstyle,_extrastyle}));}
RDebugUtils.currentLine=69271552;
 //BA.debugLineNum = 69271552;BA.debugLine="Private Sub MergeNodeStyle(currentStyle As String,";
RDebugUtils.currentLine=69271553;
 //BA.debugLineNum = 69271553;BA.debugLine="If currentStyle = Null Or currentStyle.Trim = \"\"";
if (_currentstyle== null || (_currentstyle.trim()).equals("")) { 
if (true) return _extrastyle;};
RDebugUtils.currentLine=69271554;
 //BA.debugLineNum = 69271554;BA.debugLine="If extraStyle = Null Or extraStyle.Trim = \"\" Then";
if (_extrastyle== null || (_extrastyle.trim()).equals("")) { 
if (true) return _currentstyle;};
RDebugUtils.currentLine=69271555;
 //BA.debugLineNum = 69271555;BA.debugLine="If currentStyle.EndsWith(\";\") Then";
if (_currentstyle.endsWith(";")) { 
RDebugUtils.currentLine=69271556;
 //BA.debugLineNum = 69271556;BA.debugLine="Return currentStyle & \" \" & extraStyle";
if (true) return _currentstyle+" "+_extrastyle;
 }else {
RDebugUtils.currentLine=69271558;
 //BA.debugLineNum = 69271558;BA.debugLine="Return currentStyle & \"; \" & extraStyle";
if (true) return _currentstyle+"; "+_extrastyle;
 };
RDebugUtils.currentLine=69271560;
 //BA.debugLineNum = 69271560;BA.debugLine="End Sub";
return "";
}
public static int  _scalevalue(int _availablewidth,int _smallvalue,int _mediumvalue,int _largevalue) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "scalevalue", false))
	 {return ((Integer) Debug.delegate(ba, "scalevalue", new Object[] {_availablewidth,_smallvalue,_mediumvalue,_largevalue}));}
RDebugUtils.currentLine=69140480;
 //BA.debugLineNum = 69140480;BA.debugLine="Public Sub ScaleValue(availableWidth As Int, small";
RDebugUtils.currentLine=69140481;
 //BA.debugLineNum = 69140481;BA.debugLine="If availableWidth <= 420dip Then Return smallValu";
if (_availablewidth<=anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (420))) { 
if (true) return _smallvalue;};
RDebugUtils.currentLine=69140482;
 //BA.debugLineNum = 69140482;BA.debugLine="If availableWidth <= 720dip Then Return mediumVal";
if (_availablewidth<=anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (720))) { 
if (true) return _mediumvalue;};
RDebugUtils.currentLine=69140483;
 //BA.debugLineNum = 69140483;BA.debugLine="Return largeValue";
if (true) return _largevalue;
RDebugUtils.currentLine=69140484;
 //BA.debugLineNum = 69140484;BA.debugLine="End Sub";
return 0;
}
public static String  _setpickonbounds(anywheresoftware.b4a.objects.B4XViewWrapper _view,boolean _value) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "setpickonbounds", false))
	 {return ((String) Debug.delegate(ba, "setpickonbounds", new Object[] {_view,_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=69074944;
 //BA.debugLineNum = 69074944;BA.debugLine="Public Sub SetPickOnBounds(view As B4XView, value";
RDebugUtils.currentLine=69074945;
 //BA.debugLineNum = 69074945;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=69074946;
 //BA.debugLineNum = 69074946;BA.debugLine="jo.RunMethod(\"setPickOnBounds\", Array(value))";
_jo.RunMethod("setPickOnBounds",new Object[]{(Object)(_value)});
RDebugUtils.currentLine=69074947;
 //BA.debugLineNum = 69074947;BA.debugLine="End Sub";
return "";
}
}