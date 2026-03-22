package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbackresponseadapter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbackresponseadapter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbackresponseadapter.class).invoke(this, new Object[] {null});
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
public String  _initialize(b4j.example.playbackresponseadapter __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackresponseadapter";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=54722560;
 //BA.debugLineNum = 54722560;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=54722561;
 //BA.debugLineNum = 54722561;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _normalizequeueresponse(b4j.example.playbackresponseadapter __ref,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackresponseadapter";
if (Debug.shouldDelegate(ba, "normalizequeueresponse", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "normalizequeueresponse", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.List _normalized = null;
Object _item = null;
RDebugUtils.currentLine=54788096;
 //BA.debugLineNum = 54788096;BA.debugLine="Public Sub NormalizeQueueResponse(data As Object)";
RDebugUtils.currentLine=54788097;
 //BA.debugLineNum = 54788097;BA.debugLine="If data Is Map Then";
if (_data instanceof java.util.Map) { 
RDebugUtils.currentLine=54788098;
 //BA.debugLineNum = 54788098;BA.debugLine="Dim m As Map = data";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data));
RDebugUtils.currentLine=54788099;
 //BA.debugLineNum = 54788099;BA.debugLine="Dim items As List = m.GetDefault(\"queue\", Null)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.GetDefault((Object)("queue"),__c.Null)));
RDebugUtils.currentLine=54788100;
 //BA.debugLineNum = 54788100;BA.debugLine="If items.IsInitialized = False Then Return Null";
if (_items.IsInitialized()==__c.False) { 
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));};
RDebugUtils.currentLine=54788101;
 //BA.debugLineNum = 54788101;BA.debugLine="Dim normalized As List";
_normalized = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=54788102;
 //BA.debugLineNum = 54788102;BA.debugLine="normalized.Initialize";
_normalized.Initialize();
RDebugUtils.currentLine=54788103;
 //BA.debugLineNum = 54788103;BA.debugLine="For Each item As Object In items";
{
final anywheresoftware.b4a.BA.IterableList group7 = _items;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_item = group7.Get(index7);
RDebugUtils.currentLine=54788104;
 //BA.debugLineNum = 54788104;BA.debugLine="If item Is Map Then normalized.Add(item)";
if (_item instanceof java.util.Map) { 
_normalized.Add(_item);};
 }
};
RDebugUtils.currentLine=54788106;
 //BA.debugLineNum = 54788106;BA.debugLine="Return normalized";
if (true) return _normalized;
 };
RDebugUtils.currentLine=54788108;
 //BA.debugLineNum = 54788108;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
RDebugUtils.currentLine=54788109;
 //BA.debugLineNum = 54788109;BA.debugLine="End Sub";
return null;
}
public int  _normalizeretryafter(b4j.example.playbackresponseadapter __ref,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackresponseadapter";
if (Debug.shouldDelegate(ba, "normalizeretryafter", false))
	 {return ((Integer) Debug.delegate(ba, "normalizeretryafter", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
int _value = 0;
RDebugUtils.currentLine=54853632;
 //BA.debugLineNum = 54853632;BA.debugLine="Public Sub NormalizeRetryAfter(data As Object) As";
RDebugUtils.currentLine=54853633;
 //BA.debugLineNum = 54853633;BA.debugLine="If data Is Map Then";
if (_data instanceof java.util.Map) { 
RDebugUtils.currentLine=54853634;
 //BA.debugLineNum = 54853634;BA.debugLine="Dim m As Map = data";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data));
RDebugUtils.currentLine=54853635;
 //BA.debugLineNum = 54853635;BA.debugLine="If m.ContainsKey(\"retry_after\") = False Then Ret";
if (_m.ContainsKey((Object)("retry_after"))==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=54853636;
 //BA.debugLineNum = 54853636;BA.debugLine="Dim value As Int = m.Get(\"retry_after\")";
_value = (int)(BA.ObjectToNumber(_m.Get((Object)("retry_after"))));
RDebugUtils.currentLine=54853637;
 //BA.debugLineNum = 54853637;BA.debugLine="If value <= 0 Then Return 0";
if (_value<=0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=54853638;
 //BA.debugLineNum = 54853638;BA.debugLine="Return value";
if (true) return _value;
 };
RDebugUtils.currentLine=54853640;
 //BA.debugLineNum = 54853640;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=54853641;
 //BA.debugLineNum = 54853641;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4j.example.playbackresponseadapter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackresponseadapter";
RDebugUtils.currentLine=54657024;
 //BA.debugLineNum = 54657024;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=54657025;
 //BA.debugLineNum = 54657025;BA.debugLine="End Sub";
return "";
}
}