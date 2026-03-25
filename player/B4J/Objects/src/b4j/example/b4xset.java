package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xset", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xset.class).invoke(this, new Object[] {null});
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
public b4j.example.b4xorderedmap _map = null;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.b4xset __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=75235328;
 //BA.debugLineNum = 75235328;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=75235329;
 //BA.debugLineNum = 75235329;BA.debugLine="map.Initialize";
__ref._map /*b4j.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=75235330;
 //BA.debugLineNum = 75235330;BA.debugLine="End Sub";
return "";
}
public String  _add(b4j.example.b4xset __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "add", true))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_value}));}
RDebugUtils.currentLine=75300864;
 //BA.debugLineNum = 75300864;BA.debugLine="Public Sub Add(Value As Object)";
RDebugUtils.currentLine=75300865;
 //BA.debugLineNum = 75300865;BA.debugLine="map.Put(Value, \"\")";
__ref._map /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,_value,(Object)(""));
RDebugUtils.currentLine=75300866;
 //BA.debugLineNum = 75300866;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _aslist(b4j.example.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "aslist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "aslist", null));}
RDebugUtils.currentLine=75628544;
 //BA.debugLineNum = 75628544;BA.debugLine="Public Sub AsList As List";
RDebugUtils.currentLine=75628545;
 //BA.debugLineNum = 75628545;BA.debugLine="Return map.Keys";
if (true) return __ref._map /*b4j.example.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=75628546;
 //BA.debugLineNum = 75628546;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
RDebugUtils.currentLine=75169792;
 //BA.debugLineNum = 75169792;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=75169793;
 //BA.debugLineNum = 75169793;BA.debugLine="Private map As B4XOrderedMap";
_map = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=75169794;
 //BA.debugLineNum = 75169794;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=75563008;
 //BA.debugLineNum = 75563008;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=75563009;
 //BA.debugLineNum = 75563009;BA.debugLine="map.Clear";
__ref._map /*b4j.example.b4xorderedmap*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=75563010;
 //BA.debugLineNum = 75563010;BA.debugLine="End Sub";
return "";
}
public boolean  _contains(b4j.example.b4xset __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "contains", true))
	 {return ((Boolean) Debug.delegate(ba, "contains", new Object[] {_value}));}
RDebugUtils.currentLine=75431936;
 //BA.debugLineNum = 75431936;BA.debugLine="Public Sub Contains (Value As Object) As Boolean";
RDebugUtils.currentLine=75431937;
 //BA.debugLineNum = 75431937;BA.debugLine="Return map.ContainsKey(Value)";
if (true) return __ref._map /*b4j.example.b4xorderedmap*/ ._containskey /*boolean*/ (null,_value);
RDebugUtils.currentLine=75431938;
 //BA.debugLineNum = 75431938;BA.debugLine="End Sub";
return false;
}
public int  _getsize(b4j.example.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=75497472;
 //BA.debugLineNum = 75497472;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=75497473;
 //BA.debugLineNum = 75497473;BA.debugLine="Return map.Size";
if (true) return __ref._map /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null);
RDebugUtils.currentLine=75497474;
 //BA.debugLineNum = 75497474;BA.debugLine="End Sub";
return 0;
}
public String  _remove(b4j.example.b4xset __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_value}));}
RDebugUtils.currentLine=75366400;
 //BA.debugLineNum = 75366400;BA.debugLine="Public Sub Remove(Value As Object)";
RDebugUtils.currentLine=75366401;
 //BA.debugLineNum = 75366401;BA.debugLine="map.Remove(Value)";
__ref._map /*b4j.example.b4xorderedmap*/ ._remove /*String*/ (null,_value);
RDebugUtils.currentLine=75366402;
 //BA.debugLineNum = 75366402;BA.debugLine="End Sub";
return "";
}
}