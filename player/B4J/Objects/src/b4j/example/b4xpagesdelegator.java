package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagesdelegator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagesdelegator", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagesdelegator.class).invoke(this, new Object[] {null});
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
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _mainform_closed(b4j.example.b4xpagesdelegator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "mainform_closed", true))
	 {return ((String) Debug.delegate(ba, "mainform_closed", null));}
RDebugUtils.currentLine=77791232;
 //BA.debugLineNum = 77791232;BA.debugLine="Public Sub MainForm_Closed";
RDebugUtils.currentLine=77791233;
 //BA.debugLineNum = 77791233;BA.debugLine="B4XPages.GetManager.MainForm_Closed";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._mainform_closed /*String*/ (null);
RDebugUtils.currentLine=77791234;
 //BA.debugLineNum = 77791234;BA.debugLine="End Sub";
return "";
}
public String  _mainform_closerequest(b4j.example.b4xpagesdelegator __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "mainform_closerequest", true))
	 {return ((String) Debug.delegate(ba, "mainform_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=77856768;
 //BA.debugLineNum = 77856768;BA.debugLine="Public Sub MainForm_CloseRequest (EventData As Eve";
RDebugUtils.currentLine=77856769;
 //BA.debugLineNum = 77856769;BA.debugLine="B4XPages.GetManager.MainForm_CloseRequest (EventD";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._mainform_closerequest /*String*/ (null,_eventdata);
RDebugUtils.currentLine=77856770;
 //BA.debugLineNum = 77856770;BA.debugLine="End Sub";
return "";
}
public String  _mainform_focuschanged(b4j.example.b4xpagesdelegator __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "mainform_focuschanged", true))
	 {return ((String) Debug.delegate(ba, "mainform_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=77725696;
 //BA.debugLineNum = 77725696;BA.debugLine="Public Sub MainForm_FocusChanged (HasFocus As Bool";
RDebugUtils.currentLine=77725697;
 //BA.debugLineNum = 77725697;BA.debugLine="B4XPages.GetManager.MainForm_FocusChanged (HasFoc";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._mainform_focuschanged /*String*/ (null,_hasfocus);
RDebugUtils.currentLine=77725698;
 //BA.debugLineNum = 77725698;BA.debugLine="End Sub";
return "";
}
public String  _mainform_iconifiedchanged(b4j.example.b4xpagesdelegator __ref,boolean _iconified) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "mainform_iconifiedchanged", true))
	 {return ((String) Debug.delegate(ba, "mainform_iconifiedchanged", new Object[] {_iconified}));}
RDebugUtils.currentLine=77922304;
 //BA.debugLineNum = 77922304;BA.debugLine="Public Sub MainForm_IconifiedChanged (Iconified As";
RDebugUtils.currentLine=77922305;
 //BA.debugLineNum = 77922305;BA.debugLine="B4XPages.GetManager.MainForm_IconifiedChanged(Ico";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._mainform_iconifiedchanged /*String*/ (null,_iconified);
RDebugUtils.currentLine=77922306;
 //BA.debugLineNum = 77922306;BA.debugLine="End Sub";
return "";
}
public String  _mainform_resize(b4j.example.b4xpagesdelegator __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "mainform_resize", true))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=77987840;
 //BA.debugLineNum = 77987840;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
RDebugUtils.currentLine=77987841;
 //BA.debugLineNum = 77987841;BA.debugLine="B4XPages.GetManager.MainForm_Resize(Width, Height";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._mainform_resize /*String*/ (null,_width,_height);
RDebugUtils.currentLine=77987842;
 //BA.debugLineNum = 77987842;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xpagesdelegator __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=77660160;
 //BA.debugLineNum = 77660160;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=77660162;
 //BA.debugLineNum = 77660162;BA.debugLine="End Sub";
return "";
}
public String  _activity_pause(b4j.example.b4xpagesdelegator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
RDebugUtils.currentLine=78118912;
 //BA.debugLineNum = 78118912;BA.debugLine="Public Sub Activity_Pause";
RDebugUtils.currentLine=78118913;
 //BA.debugLineNum = 78118913;BA.debugLine="B4XPages.GetManager.Activity_Pause";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._activity_pause /*String*/ (null);
RDebugUtils.currentLine=78118914;
 //BA.debugLineNum = 78118914;BA.debugLine="End Sub";
return "";
}
public String  _activity_resume(b4j.example.b4xpagesdelegator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "activity_resume", true))
	 {return ((String) Debug.delegate(ba, "activity_resume", null));}
RDebugUtils.currentLine=78053376;
 //BA.debugLineNum = 78053376;BA.debugLine="Public Sub Activity_Resume";
RDebugUtils.currentLine=78053377;
 //BA.debugLineNum = 78053377;BA.debugLine="B4XPages.GetManager.Activity_Resume";
_b4xpages._getmanager /*b4j.example.b4xpagesmanager*/ ()._activity_resume /*String*/ (null);
RDebugUtils.currentLine=78053378;
 //BA.debugLineNum = 78053378;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xpagesdelegator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
RDebugUtils.currentLine=77594624;
 //BA.debugLineNum = 77594624;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=77594625;
 //BA.debugLineNum = 77594625;BA.debugLine="End Sub";
return "";
}
}