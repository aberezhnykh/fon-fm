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
public static String  _applymaterialiconfont(anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui,anywheresoftware.b4a.objects.B4XViewWrapper _view,float _fontsize) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "applymaterialiconfont", false))
	 {return ((String) Debug.delegate(ba, "applymaterialiconfont", new Object[] {_xui,_view,_fontsize}));}
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Public Sub ApplyMaterialIconFont(xui As XUI, view";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="view.Font = xui.CreateMaterialIcons(fontSize)";
_view.setFont(_xui.CreateMaterialIcons(_fontsize));
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="End Sub";
return "";
}
public static String  _colortocss(int _color) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "colortocss", false))
	 {return ((String) Debug.delegate(ba, "colortocss", new Object[] {_color}));}
long _unsignedcolor = 0L;
int _rgb = 0;
RDebugUtils.currentLine=33226752;
 //BA.debugLineNum = 33226752;BA.debugLine="Public Sub ColorToCss(color As Int) As String";
RDebugUtils.currentLine=33226753;
 //BA.debugLineNum = 33226753;BA.debugLine="Dim unsignedColor As Long = Bit.And(0xFFFFFFFF, c";
_unsignedcolor = (long) (anywheresoftware.b4a.keywords.Common.Bit.And(((int)0xffffffff),_color));
RDebugUtils.currentLine=33226754;
 //BA.debugLineNum = 33226754;BA.debugLine="Dim rgb As Int = Bit.And(unsignedColor, 0xFFFFFF)";
_rgb = anywheresoftware.b4a.keywords.Common.Bit.And((int) (_unsignedcolor),((int)0xffffff));
RDebugUtils.currentLine=33226755;
 //BA.debugLineNum = 33226755;BA.debugLine="Return \"#\" & Bit.ToHexString(rgb)";
if (true) return "#"+anywheresoftware.b4a.keywords.Common.Bit.ToHexString(_rgb);
RDebugUtils.currentLine=33226756;
 //BA.debugLineNum = 33226756;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui,String _text,float _fontsize,int _textcolor,boolean _bold,boolean _wraptext) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_xui,_text,_fontsize,_textcolor,_bold,_wraptext}));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Public Sub CreateLabel(xui As XUI, text As String,";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=32768003;
 //BA.debugLineNum = 32768003;BA.debugLine="lbl.Text = text";
_lbl.setText(_text);
RDebugUtils.currentLine=32768004;
 //BA.debugLineNum = 32768004;BA.debugLine="lbl.WrapText = wrapText";
_lbl.setWrapText(_wraptext);
RDebugUtils.currentLine=32768005;
 //BA.debugLineNum = 32768005;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=32768006;
 //BA.debugLineNum = 32768006;BA.debugLine="If bold Then";
if (_bold) { 
RDebugUtils.currentLine=32768007;
 //BA.debugLineNum = 32768007;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(fontSize)";
_xlbl.setFont(_xui.CreateDefaultBoldFont(_fontsize));
 }else {
RDebugUtils.currentLine=32768009;
 //BA.debugLineNum = 32768009;BA.debugLine="xlbl.Font = xui.CreateDefaultFont(fontSize)";
_xlbl.setFont(_xui.CreateDefaultFont(_fontsize));
 };
RDebugUtils.currentLine=32768011;
 //BA.debugLineNum = 32768011;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=32768012;
 //BA.debugLineNum = 32768012;BA.debugLine="SetLabelStyle(xlbl, \"-fx-alignment: center; -fx-t";
_setlabelstyle(_xlbl,"-fx-alignment: center; -fx-text-fill: "+_colortocss(_textcolor)+";");
RDebugUtils.currentLine=32768013;
 //BA.debugLineNum = 32768013;BA.debugLine="SetMouseTransparent(xlbl, True)";
_setmousetransparent(_xlbl,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=32768014;
 //BA.debugLineNum = 32768014;BA.debugLine="Return xlbl";
if (true) return _xlbl;
RDebugUtils.currentLine=32768015;
 //BA.debugLineNum = 32768015;BA.debugLine="End Sub";
return null;
}
public static int  _scalevalue(int _availablewidth,int _smallvalue,int _mediumvalue,int _largevalue) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "scalevalue", false))
	 {return ((Integer) Debug.delegate(ba, "scalevalue", new Object[] {_availablewidth,_smallvalue,_mediumvalue,_largevalue}));}
RDebugUtils.currentLine=33161216;
 //BA.debugLineNum = 33161216;BA.debugLine="Public Sub ScaleValue(availableWidth As Int, small";
RDebugUtils.currentLine=33161217;
 //BA.debugLineNum = 33161217;BA.debugLine="If availableWidth <= 420dip Then Return smallValu";
if (_availablewidth<=anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (420))) { 
if (true) return _smallvalue;};
RDebugUtils.currentLine=33161218;
 //BA.debugLineNum = 33161218;BA.debugLine="If availableWidth <= 720dip Then Return mediumVal";
if (_availablewidth<=anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (720))) { 
if (true) return _mediumvalue;};
RDebugUtils.currentLine=33161219;
 //BA.debugLineNum = 33161219;BA.debugLine="Return largeValue";
if (true) return _largevalue;
RDebugUtils.currentLine=33161220;
 //BA.debugLineNum = 33161220;BA.debugLine="End Sub";
return 0;
}
public static String  _setlabelstyle(anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "setlabelstyle", false))
	 {return ((String) Debug.delegate(ba, "setlabelstyle", new Object[] {_view,_style}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Public Sub SetLabelStyle(view As B4XView, style As";
RDebugUtils.currentLine=32964609;
 //BA.debugLineNum = 32964609;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="jo.RunMethod(\"setStyle\", Array(MergeNodeStyle(jo.";
_jo.RunMethod("setStyle",new Object[]{(Object)(_mergenodestyle(BA.ObjectToString(_jo.RunMethod("getStyle",(Object[])(anywheresoftware.b4a.keywords.Common.Null))),_style))});
RDebugUtils.currentLine=32964611;
 //BA.debugLineNum = 32964611;BA.debugLine="End Sub";
return "";
}
public static String  _setpanestyle(anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "setpanestyle", false))
	 {return ((String) Debug.delegate(ba, "setpanestyle", new Object[] {_view,_style}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Public Sub SetPaneStyle(view As B4XView, style As";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="jo.RunMethod(\"setStyle\", Array(MergeNodeStyle(jo.";
_jo.RunMethod("setStyle",new Object[]{(Object)(_mergenodestyle(BA.ObjectToString(_jo.RunMethod("getStyle",(Object[])(anywheresoftware.b4a.keywords.Common.Null))),_style))});
RDebugUtils.currentLine=32899075;
 //BA.debugLineNum = 32899075;BA.debugLine="End Sub";
return "";
}
public static String  _setpickonbounds(anywheresoftware.b4a.objects.B4XViewWrapper _view,boolean _value) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "setpickonbounds", false))
	 {return ((String) Debug.delegate(ba, "setpickonbounds", new Object[] {_view,_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=33095680;
 //BA.debugLineNum = 33095680;BA.debugLine="Public Sub SetPickOnBounds(view As B4XView, value";
RDebugUtils.currentLine=33095681;
 //BA.debugLineNum = 33095681;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=33095682;
 //BA.debugLineNum = 33095682;BA.debugLine="jo.RunMethod(\"setPickOnBounds\", Array(value))";
_jo.RunMethod("setPickOnBounds",new Object[]{(Object)(_value)});
RDebugUtils.currentLine=33095683;
 //BA.debugLineNum = 33095683;BA.debugLine="End Sub";
return "";
}
public static String  _setmousetransparent(anywheresoftware.b4a.objects.B4XViewWrapper _view,boolean _value) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "setmousetransparent", false))
	 {return ((String) Debug.delegate(ba, "setmousetransparent", new Object[] {_view,_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Public Sub SetMouseTransparent(view As B4XView, va";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(value))";
_jo.RunMethod("setMouseTransparent",new Object[]{(Object)(_value)});
RDebugUtils.currentLine=33030147;
 //BA.debugLineNum = 33030147;BA.debugLine="End Sub";
return "";
}
public static String  _mergenodestyle(String _currentstyle,String _extrastyle) throws Exception{
RDebugUtils.currentModule="uistyle";
if (Debug.shouldDelegate(ba, "mergenodestyle", false))
	 {return ((String) Debug.delegate(ba, "mergenodestyle", new Object[] {_currentstyle,_extrastyle}));}
RDebugUtils.currentLine=33292288;
 //BA.debugLineNum = 33292288;BA.debugLine="Private Sub MergeNodeStyle(currentStyle As String,";
RDebugUtils.currentLine=33292289;
 //BA.debugLineNum = 33292289;BA.debugLine="If currentStyle = Null Or currentStyle.Trim = \"\"";
if (_currentstyle== null || (_currentstyle.trim()).equals("")) { 
if (true) return _extrastyle;};
RDebugUtils.currentLine=33292290;
 //BA.debugLineNum = 33292290;BA.debugLine="If extraStyle = Null Or extraStyle.Trim = \"\" Then";
if (_extrastyle== null || (_extrastyle.trim()).equals("")) { 
if (true) return _currentstyle;};
RDebugUtils.currentLine=33292291;
 //BA.debugLineNum = 33292291;BA.debugLine="If currentStyle.EndsWith(\";\") Then";
if (_currentstyle.endsWith(";")) { 
RDebugUtils.currentLine=33292292;
 //BA.debugLineNum = 33292292;BA.debugLine="Return currentStyle & \" \" & extraStyle";
if (true) return _currentstyle+" "+_extrastyle;
 }else {
RDebugUtils.currentLine=33292294;
 //BA.debugLineNum = 33292294;BA.debugLine="Return currentStyle & \"; \" & extraStyle";
if (true) return _currentstyle+"; "+_extrastyle;
 };
RDebugUtils.currentLine=33292296;
 //BA.debugLineNum = 33292296;BA.debugLine="End Sub";
return "";
}
}