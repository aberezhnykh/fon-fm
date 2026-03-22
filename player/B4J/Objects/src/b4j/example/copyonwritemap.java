package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class copyonwritemap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.copyonwritemap", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.copyonwritemap.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _internalmap = null;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _class_globals(b4j.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="Private InternalMap As Map";
_internalmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="Dim InternalMap As Map";
_internalmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=39387138;
 //BA.debugLineNum = 39387138;BA.debugLine="InternalMap.Initialize";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=39387139;
 //BA.debugLineNum = 39387139;BA.debugLine="End Sub";
return "";
}
public boolean  _containskey(b4j.example.copyonwritemap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "containskey", true))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=39518208;
 //BA.debugLineNum = 39518208;BA.debugLine="Public Sub ContainsKey (Key As Object) As Boolean";
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="Return InternalMap.ContainsKey(Key)";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_key);
RDebugUtils.currentLine=39518210;
 //BA.debugLineNum = 39518210;BA.debugLine="End Sub";
return false;
}
public String  _copymap(b4j.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "copymap", true))
	 {return ((String) Debug.delegate(ba, "copymap", null));}
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Private Sub CopyMap";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="InternalMap = B4XCollections.MergeMaps(InternalMa";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/  = _b4xcollections._mergemaps /*anywheresoftware.b4a.objects.collections.Map*/ (__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ ,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__c.Null)));
RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="End Sub";
return "";
}
public Object  _get(b4j.example.copyonwritemap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_key}));}
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Public Sub Get (Key As Object) As Object";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="Return InternalMap.Get(Key)";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_key);
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="End Sub";
return null;
}
public Object  _getdefault(b4j.example.copyonwritemap __ref,Object _key,Object _default) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "getdefault", true))
	 {return ((Object) Debug.delegate(ba, "getdefault", new Object[] {_key,_default}));}
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Public Sub GetDefault (Key As Object, Default As O";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="Return InternalMap.GetDefault(Key, Default)";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault(_key,_default);
RDebugUtils.currentLine=39190530;
 //BA.debugLineNum = 39190530;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getmap(b4j.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "getmap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getmap", null));}
RDebugUtils.currentLine=39583744;
 //BA.debugLineNum = 39583744;BA.debugLine="Public Sub GetMap As Map";
RDebugUtils.currentLine=39583745;
 //BA.debugLineNum = 39583745;BA.debugLine="Return InternalMap";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="End Sub";
return null;
}
public int  _getsize(b4j.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=39452672;
 //BA.debugLineNum = 39452672;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="Return InternalMap.Size";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .getSize();
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.example.copyonwritemap __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _initialitems) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_initialitems}));}
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Public Sub Initialize (InitialItems As Map)";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="InternalMap = B4XCollections.MergeMaps(InitialIte";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/  = _b4xcollections._mergemaps /*anywheresoftware.b4a.objects.collections.Map*/ (_initialitems,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__c.Null)));
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="End Sub";
return "";
}
public String  _put(b4j.example.copyonwritemap __ref,Object _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "put", true))
	 {return ((String) Debug.delegate(ba, "put", new Object[] {_key,_value}));}
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Public Sub Put (Key As Object, Value As Object)";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="CopyMap";
__ref._copymap /*String*/ (null);
RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="InternalMap.Put(Key, Value)";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_key,_value);
RDebugUtils.currentLine=39256067;
 //BA.debugLineNum = 39256067;BA.debugLine="End Sub";
return "";
}
public String  _remove(b4j.example.copyonwritemap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Public Sub Remove (Key As Object)";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="CopyMap";
__ref._copymap /*String*/ (null);
RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="InternalMap.Remove(Key)";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .Remove(_key);
RDebugUtils.currentLine=39321603;
 //BA.debugLineNum = 39321603;BA.debugLine="End Sub";
return "";
}
}