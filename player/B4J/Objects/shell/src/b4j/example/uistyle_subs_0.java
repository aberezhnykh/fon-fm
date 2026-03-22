package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class uistyle_subs_0 {


public static RemoteObject  _applymaterialiconfont(RemoteObject _xui,RemoteObject _view,RemoteObject _fontsize) throws Exception{
try {
		Debug.PushSubsStack("ApplyMaterialIconFont (uistyle) ","uistyle",18,uistyle.ba,uistyle.mostCurrent,22);
if (RapidSub.canDelegate("applymaterialiconfont")) { return b4j.example.uistyle.remoteMe.runUserSub(false, "uistyle","applymaterialiconfont", _xui, _view, _fontsize);}
Debug.locals.put("xui", _xui);
Debug.locals.put("view", _view);
Debug.locals.put("fontSize", _fontsize);
 BA.debugLineNum = 22;BA.debugLine="Public Sub ApplyMaterialIconFont(xui As XUI, view";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="view.Font = xui.CreateMaterialIcons(fontSize)";
Debug.ShouldStop(4194304);
_view.runMethod(false,"setFont",_xui.runMethod(false,"CreateMaterialIcons",(Object)(_fontsize)));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colortocss(RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("ColorToCss (uistyle) ","uistyle",18,uistyle.ba,uistyle.mostCurrent,52);
if (RapidSub.canDelegate("colortocss")) { return b4j.example.uistyle.remoteMe.runUserSub(false, "uistyle","colortocss", _color);}
RemoteObject _unsignedcolor = RemoteObject.createImmutable(0L);
RemoteObject _rgb = RemoteObject.createImmutable(0);
Debug.locals.put("color", _color);
 BA.debugLineNum = 52;BA.debugLine="Public Sub ColorToCss(color As Int) As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Dim unsignedColor As Long = Bit.And(0xFFFFFFFF, c";
Debug.ShouldStop(1048576);
_unsignedcolor = BA.numberCast(long.class, uistyle.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, ((int)0xffffffff))),(Object)(_color)));Debug.locals.put("unsignedColor", _unsignedcolor);Debug.locals.put("unsignedColor", _unsignedcolor);
 BA.debugLineNum = 54;BA.debugLine="Dim rgb As Int = Bit.And(unsignedColor, 0xFFFFFF)";
Debug.ShouldStop(2097152);
_rgb = uistyle.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, _unsignedcolor)),(Object)(BA.numberCast(int.class, ((int)0xffffff))));Debug.locals.put("rgb", _rgb);Debug.locals.put("rgb", _rgb);
 BA.debugLineNum = 55;BA.debugLine="Return \"#\" & Bit.ToHexString(rgb)";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("#"),uistyle.__c.getField(false,"Bit").runMethod(true,"ToHexString",(Object)(_rgb)));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject _xui,RemoteObject _text,RemoteObject _fontsize,RemoteObject _textcolor,RemoteObject _bold,RemoteObject _wraptext) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (uistyle) ","uistyle",18,uistyle.ba,uistyle.mostCurrent,5);
if (RapidSub.canDelegate("createlabel")) { return b4j.example.uistyle.remoteMe.runUserSub(false, "uistyle","createlabel", _xui, _text, _fontsize, _textcolor, _bold, _wraptext);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("xui", _xui);
Debug.locals.put("text", _text);
Debug.locals.put("fontSize", _fontsize);
Debug.locals.put("textColor", _textcolor);
Debug.locals.put("bold", _bold);
Debug.locals.put("wrapText", _wraptext);
 BA.debugLineNum = 5;BA.debugLine="Public Sub CreateLabel(xui As XUI, text As String,";
Debug.ShouldStop(16);
 BA.debugLineNum = 6;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(32);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 7;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(64);
_lbl.runVoidMethod ("Initialize",uistyle.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 8;BA.debugLine="lbl.Text = text";
Debug.ShouldStop(128);
_lbl.runMethod(true,"setText",_text);
 BA.debugLineNum = 9;BA.debugLine="lbl.WrapText = wrapText";
Debug.ShouldStop(256);
_lbl.runMethod(true,"setWrapText",_wraptext);
 BA.debugLineNum = 10;BA.debugLine="Dim xlbl As B4XView = lbl";
Debug.ShouldStop(512);
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 11;BA.debugLine="If bold Then";
Debug.ShouldStop(1024);
if (_bold.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 12;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(fontSize)";
Debug.ShouldStop(2048);
_xlbl.runMethod(false,"setFont",_xui.runMethod(false,"CreateDefaultBoldFont",(Object)(_fontsize)));
 }else {
 BA.debugLineNum = 14;BA.debugLine="xlbl.Font = xui.CreateDefaultFont(fontSize)";
Debug.ShouldStop(8192);
_xlbl.runMethod(false,"setFont",_xui.runMethod(false,"CreateDefaultFont",(Object)(_fontsize)));
 };
 BA.debugLineNum = 16;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.ShouldStop(32768);
_xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 17;BA.debugLine="SetLabelStyle(xlbl, \"-fx-alignment: center; -fx-t";
Debug.ShouldStop(65536);
_setlabelstyle(_xlbl,RemoteObject.concat(RemoteObject.createImmutable("-fx-alignment: center; -fx-text-fill: "),_colortocss(_textcolor),RemoteObject.createImmutable(";")));
 BA.debugLineNum = 18;BA.debugLine="SetMouseTransparent(xlbl, True)";
Debug.ShouldStop(131072);
_setmousetransparent(_xlbl,uistyle.__c.getField(true,"True"));
 BA.debugLineNum = 19;BA.debugLine="Return xlbl";
Debug.ShouldStop(262144);
if (true) return _xlbl;
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mergenodestyle(RemoteObject _currentstyle,RemoteObject _extrastyle) throws Exception{
try {
		Debug.PushSubsStack("MergeNodeStyle (uistyle) ","uistyle",18,uistyle.ba,uistyle.mostCurrent,58);
if (RapidSub.canDelegate("mergenodestyle")) { return b4j.example.uistyle.remoteMe.runUserSub(false, "uistyle","mergenodestyle", _currentstyle, _extrastyle);}
Debug.locals.put("currentStyle", _currentstyle);
Debug.locals.put("extraStyle", _extrastyle);
 BA.debugLineNum = 58;BA.debugLine="Private Sub MergeNodeStyle(currentStyle As String,";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="If currentStyle = Null Or currentStyle.Trim = \"\"";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("n",_currentstyle) || RemoteObject.solveBoolean("=",_currentstyle.runMethod(true,"trim"),BA.ObjectToString(""))) { 
if (true) return _extrastyle;};
 BA.debugLineNum = 60;BA.debugLine="If extraStyle = Null Or extraStyle.Trim = \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("n",_extrastyle) || RemoteObject.solveBoolean("=",_extrastyle.runMethod(true,"trim"),BA.ObjectToString(""))) { 
if (true) return _currentstyle;};
 BA.debugLineNum = 61;BA.debugLine="If currentStyle.EndsWith(\";\") Then";
Debug.ShouldStop(268435456);
if (_currentstyle.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(";"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 62;BA.debugLine="Return currentStyle & \" \" & extraStyle";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.concat(_currentstyle,RemoteObject.createImmutable(" "),_extrastyle);
 }else {
 BA.debugLineNum = 64;BA.debugLine="Return currentStyle & \"; \" & extraStyle";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.concat(_currentstyle,RemoteObject.createImmutable("; "),_extrastyle);
 };
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scalevalue(RemoteObject _availablewidth,RemoteObject _smallvalue,RemoteObject _mediumvalue,RemoteObject _largevalue) throws Exception{
try {
		Debug.PushSubsStack("ScaleValue (uistyle) ","uistyle",18,uistyle.ba,uistyle.mostCurrent,46);
if (RapidSub.canDelegate("scalevalue")) { return b4j.example.uistyle.remoteMe.runUserSub(false, "uistyle","scalevalue", _availablewidth, _smallvalue, _mediumvalue, _largevalue);}
Debug.locals.put("availableWidth", _availablewidth);
Debug.locals.put("smallValue", _smallvalue);
Debug.locals.put("mediumValue", _mediumvalue);
Debug.locals.put("largeValue", _largevalue);
 BA.debugLineNum = 46;BA.debugLine="Public Sub ScaleValue(availableWidth As Int, small";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="If availableWidth <= 420dip Then Return smallValu";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("k",_availablewidth,BA.numberCast(double.class, uistyle.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 420)))))) { 
if (true) return _smallvalue;};
 BA.debugLineNum = 48;BA.debugLine="If availableWidth <= 720dip Then Return mediumVal";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("k",_availablewidth,BA.numberCast(double.class, uistyle.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 720)))))) { 
if (true) return _mediumvalue;};
 BA.debugLineNum = 49;BA.debugLine="Return largeValue";
Debug.ShouldStop(65536);
if (true) return _largevalue;
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlabelstyle(RemoteObject _view,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("SetLabelStyle (uistyle) ","uistyle",18,uistyle.ba,uistyle.mostCurrent,31);
if (RapidSub.canDelegate("setlabelstyle")) { return b4j.example.uistyle.remoteMe.runUserSub(false, "uistyle","setlabelstyle", _view, _style);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("view", _view);
Debug.locals.put("style", _style);
 BA.debugLineNum = 31;BA.debugLine="Public Sub SetLabelStyle(view As B4XView, style As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Dim jo As JavaObject = view";
Debug.ShouldStop(-2147483648);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 33;BA.debugLine="jo.RunMethod(\"setStyle\", Array(MergeNodeStyle(jo.";
Debug.ShouldStop(1);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStyle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_mergenodestyle(BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getStyle")),(Object)((uistyle.__c.getField(false,"Null"))))),_style))})));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmousetransparent(RemoteObject _view,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetMouseTransparent (uistyle) ","uistyle",18,uistyle.ba,uistyle.mostCurrent,36);
if (RapidSub.canDelegate("setmousetransparent")) { return b4j.example.uistyle.remoteMe.runUserSub(false, "uistyle","setmousetransparent", _view, _value);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("view", _view);
Debug.locals.put("value", _value);
 BA.debugLineNum = 36;BA.debugLine="Public Sub SetMouseTransparent(view As B4XView, va";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Dim jo As JavaObject = view";
Debug.ShouldStop(16);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 38;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(value))";
Debug.ShouldStop(32);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMouseTransparent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_value)})));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpanestyle(RemoteObject _view,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("SetPaneStyle (uistyle) ","uistyle",18,uistyle.ba,uistyle.mostCurrent,26);
if (RapidSub.canDelegate("setpanestyle")) { return b4j.example.uistyle.remoteMe.runUserSub(false, "uistyle","setpanestyle", _view, _style);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("view", _view);
Debug.locals.put("style", _style);
 BA.debugLineNum = 26;BA.debugLine="Public Sub SetPaneStyle(view As B4XView, style As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Dim jo As JavaObject = view";
Debug.ShouldStop(67108864);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 28;BA.debugLine="jo.RunMethod(\"setStyle\", Array(MergeNodeStyle(jo.";
Debug.ShouldStop(134217728);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStyle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_mergenodestyle(BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getStyle")),(Object)((uistyle.__c.getField(false,"Null"))))),_style))})));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpickonbounds(RemoteObject _view,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetPickOnBounds (uistyle) ","uistyle",18,uistyle.ba,uistyle.mostCurrent,41);
if (RapidSub.canDelegate("setpickonbounds")) { return b4j.example.uistyle.remoteMe.runUserSub(false, "uistyle","setpickonbounds", _view, _value);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("view", _view);
Debug.locals.put("value", _value);
 BA.debugLineNum = 41;BA.debugLine="Public Sub SetPickOnBounds(view As B4XView, value";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Dim jo As JavaObject = view";
Debug.ShouldStop(512);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 43;BA.debugLine="jo.RunMethod(\"setPickOnBounds\", Array(value))";
Debug.ShouldStop(1024);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setPickOnBounds")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_value)})));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}