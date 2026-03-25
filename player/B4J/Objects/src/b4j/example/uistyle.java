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
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _colortocss(int _color) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "colortocss", false))
	 {return ((String) Debug.delegate(ba, "colortocss", new Object[] {_color}));}
long _unsignedcolor = 0L;
int _rgb = 0;
RDebugUtils.currentLine=67895296;
 //BA.debugLineNum = 67895296;BA.debugLine="Public Sub ColorToCss(color As Int) As String";
RDebugUtils.currentLine=67895297;
 //BA.debugLineNum = 67895297;BA.debugLine="Dim unsignedColor As Long = Bit.And(0xFFFFFFFF, c";
_unsignedcolor = (long) (anywheresoftware.b4a.keywords.Common.Bit.And(((int)0xffffffff),_color));
RDebugUtils.currentLine=67895298;
 //BA.debugLineNum = 67895298;BA.debugLine="Dim rgb As Int = Bit.And(unsignedColor, 0xFFFFFF)";
_rgb = anywheresoftware.b4a.keywords.Common.Bit.And((int) (_unsignedcolor),((int)0xffffff));
RDebugUtils.currentLine=67895299;
 //BA.debugLineNum = 67895299;BA.debugLine="Return \"#\" & Bit.ToHexString(rgb)";
if (true) return "#"+anywheresoftware.b4a.keywords.Common.Bit.ToHexString(_rgb);
RDebugUtils.currentLine=67895300;
 //BA.debugLineNum = 67895300;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui,String _text,float _fontsize,int _textcolor,boolean _bold,boolean _wraptext) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_xui,_text,_fontsize,_textcolor,_bold,_wraptext}));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=67436544;
 //BA.debugLineNum = 67436544;BA.debugLine="Public Sub CreateLabel(xui As XUI, text As String,";
RDebugUtils.currentLine=67436545;
 //BA.debugLineNum = 67436545;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=67436546;
 //BA.debugLineNum = 67436546;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=67436547;
 //BA.debugLineNum = 67436547;BA.debugLine="lbl.Text = text";
_lbl.setText(_text);
RDebugUtils.currentLine=67436548;
 //BA.debugLineNum = 67436548;BA.debugLine="lbl.WrapText = wrapText";
_lbl.setWrapText(_wraptext);
RDebugUtils.currentLine=67436549;
 //BA.debugLineNum = 67436549;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=67436550;
 //BA.debugLineNum = 67436550;BA.debugLine="If bold Then";
if (_bold) { 
RDebugUtils.currentLine=67436551;
 //BA.debugLineNum = 67436551;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(fontSize)";
_xlbl.setFont(_xui.CreateDefaultBoldFont(_fontsize));
 }else {
RDebugUtils.currentLine=67436553;
 //BA.debugLineNum = 67436553;BA.debugLine="xlbl.Font = xui.CreateDefaultFont(fontSize)";
_xlbl.setFont(_xui.CreateDefaultFont(_fontsize));
 };
RDebugUtils.currentLine=67436555;
 //BA.debugLineNum = 67436555;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=67436556;
 //BA.debugLineNum = 67436556;BA.debugLine="SetLabelStyle(xlbl, \"-fx-alignment: center; -fx-t";
_setlabelstyle(_xlbl,"-fx-alignment: center; -fx-text-fill: "+_colortocss(_textcolor)+";");
RDebugUtils.currentLine=67436557;
 //BA.debugLineNum = 67436557;BA.debugLine="SetMouseTransparent(xlbl, True)";
_setmousetransparent(_xlbl,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=67436558;
 //BA.debugLineNum = 67436558;BA.debugLine="Return xlbl";
if (true) return _xlbl;
RDebugUtils.currentLine=67436559;
 //BA.debugLineNum = 67436559;BA.debugLine="End Sub";
return null;
}
public static int  _scalevalue(int _availablewidth,int _smallvalue,int _mediumvalue,int _largevalue) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "scalevalue", false))
	 {return ((Integer) Debug.delegate(ba, "scalevalue", new Object[] {_availablewidth,_smallvalue,_mediumvalue,_largevalue}));}
RDebugUtils.currentLine=67829760;
 //BA.debugLineNum = 67829760;BA.debugLine="Public Sub ScaleValue(availableWidth As Int, small";
RDebugUtils.currentLine=67829761;
 //BA.debugLineNum = 67829761;BA.debugLine="If availableWidth <= 420dip Then Return smallValu";
if (_availablewidth<=anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (420))) { 
if (true) return _smallvalue;};
RDebugUtils.currentLine=67829762;
 //BA.debugLineNum = 67829762;BA.debugLine="If availableWidth <= 720dip Then Return mediumVal";
if (_availablewidth<=anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (720))) { 
if (true) return _mediumvalue;};
RDebugUtils.currentLine=67829763;
 //BA.debugLineNum = 67829763;BA.debugLine="Return largeValue";
if (true) return _largevalue;
RDebugUtils.currentLine=67829764;
 //BA.debugLineNum = 67829764;BA.debugLine="End Sub";
return 0;
}
public static String  _setpanestyle(anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "setpanestyle", false))
	 {return ((String) Debug.delegate(ba, "setpanestyle", new Object[] {_view,_style}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=67567616;
 //BA.debugLineNum = 67567616;BA.debugLine="Public Sub SetPaneStyle(view As B4XView, style As";
RDebugUtils.currentLine=67567617;
 //BA.debugLineNum = 67567617;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=67567618;
 //BA.debugLineNum = 67567618;BA.debugLine="jo.RunMethod(\"setStyle\", Array(MergeNodeStyle(jo.";
_jo.RunMethod("setStyle",new Object[]{(Object)(_mergenodestyle(BA.ObjectToString(_jo.RunMethod("getStyle",(Object[])(anywheresoftware.b4a.keywords.Common.Null))),_style))});
RDebugUtils.currentLine=67567619;
 //BA.debugLineNum = 67567619;BA.debugLine="End Sub";
return "";
}
public static String  _setpickonbounds(anywheresoftware.b4a.objects.B4XViewWrapper _view,boolean _value) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "setpickonbounds", false))
	 {return ((String) Debug.delegate(ba, "setpickonbounds", new Object[] {_view,_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=67764224;
 //BA.debugLineNum = 67764224;BA.debugLine="Public Sub SetPickOnBounds(view As B4XView, value";
RDebugUtils.currentLine=67764225;
 //BA.debugLineNum = 67764225;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=67764226;
 //BA.debugLineNum = 67764226;BA.debugLine="jo.RunMethod(\"setPickOnBounds\", Array(value))";
_jo.RunMethod("setPickOnBounds",new Object[]{(Object)(_value)});
RDebugUtils.currentLine=67764227;
 //BA.debugLineNum = 67764227;BA.debugLine="End Sub";
return "";
}
public static String  _setlabelstyle(anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "setlabelstyle", false))
	 {return ((String) Debug.delegate(ba, "setlabelstyle", new Object[] {_view,_style}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=67633152;
 //BA.debugLineNum = 67633152;BA.debugLine="Public Sub SetLabelStyle(view As B4XView, style As";
RDebugUtils.currentLine=67633153;
 //BA.debugLineNum = 67633153;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=67633154;
 //BA.debugLineNum = 67633154;BA.debugLine="jo.RunMethod(\"setStyle\", Array(MergeNodeStyle(jo.";
_jo.RunMethod("setStyle",new Object[]{(Object)(_mergenodestyle(BA.ObjectToString(_jo.RunMethod("getStyle",(Object[])(anywheresoftware.b4a.keywords.Common.Null))),_style))});
RDebugUtils.currentLine=67633155;
 //BA.debugLineNum = 67633155;BA.debugLine="End Sub";
return "";
}
public static String  _applymaterialiconfont(anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui,anywheresoftware.b4a.objects.B4XViewWrapper _view,float _fontsize) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "applymaterialiconfont", false))
	 {return ((String) Debug.delegate(ba, "applymaterialiconfont", new Object[] {_xui,_view,_fontsize}));}
RDebugUtils.currentLine=67502080;
 //BA.debugLineNum = 67502080;BA.debugLine="Public Sub ApplyMaterialIconFont(xui As XUI, view";
RDebugUtils.currentLine=67502081;
 //BA.debugLineNum = 67502081;BA.debugLine="view.Font = xui.CreateMaterialIcons(fontSize)";
_view.setFont(_xui.CreateMaterialIcons(_fontsize));
RDebugUtils.currentLine=67502082;
 //BA.debugLineNum = 67502082;BA.debugLine="End Sub";
return "";
}
public static String  _setmousetransparent(anywheresoftware.b4a.objects.B4XViewWrapper _view,boolean _value) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "setmousetransparent", false))
	 {return ((String) Debug.delegate(ba, "setmousetransparent", new Object[] {_view,_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=67698688;
 //BA.debugLineNum = 67698688;BA.debugLine="Public Sub SetMouseTransparent(view As B4XView, va";
RDebugUtils.currentLine=67698689;
 //BA.debugLineNum = 67698689;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=67698690;
 //BA.debugLineNum = 67698690;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(value))";
_jo.RunMethod("setMouseTransparent",new Object[]{(Object)(_value)});
RDebugUtils.currentLine=67698691;
 //BA.debugLineNum = 67698691;BA.debugLine="End Sub";
return "";
}
public static String  _mergenodestyle(String _currentstyle,String _extrastyle) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "mergenodestyle", false))
	 {return ((String) Debug.delegate(ba, "mergenodestyle", new Object[] {_currentstyle,_extrastyle}));}
RDebugUtils.currentLine=67960832;
 //BA.debugLineNum = 67960832;BA.debugLine="Private Sub MergeNodeStyle(currentStyle As String,";
RDebugUtils.currentLine=67960833;
 //BA.debugLineNum = 67960833;BA.debugLine="If currentStyle = Null Or currentStyle.Trim = \"\"";
if (_currentstyle== null || (_currentstyle.trim()).equals("")) { 
if (true) return _extrastyle;};
RDebugUtils.currentLine=67960834;
 //BA.debugLineNum = 67960834;BA.debugLine="If extraStyle = Null Or extraStyle.Trim = \"\" Then";
if (_extrastyle== null || (_extrastyle.trim()).equals("")) { 
if (true) return _currentstyle;};
RDebugUtils.currentLine=67960835;
 //BA.debugLineNum = 67960835;BA.debugLine="If currentStyle.EndsWith(\";\") Then";
if (_currentstyle.endsWith(";")) { 
RDebugUtils.currentLine=67960836;
 //BA.debugLineNum = 67960836;BA.debugLine="Return currentStyle & \" \" & extraStyle";
if (true) return _currentstyle+" "+_extrastyle;
 }else {
RDebugUtils.currentLine=67960838;
 //BA.debugLineNum = 67960838;BA.debugLine="Return currentStyle & \"; \" & extraStyle";
if (true) return _currentstyle+"; "+_extrastyle;
 };
RDebugUtils.currentLine=67960840;
 //BA.debugLineNum = 67960840;BA.debugLine="End Sub";
return "";
}
}