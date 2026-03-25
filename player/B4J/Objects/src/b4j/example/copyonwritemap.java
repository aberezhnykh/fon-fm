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
RDebugUtils.currentLine=76873728;
 //BA.debugLineNum = 76873728;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=76873729;
 //BA.debugLineNum = 76873729;BA.debugLine="Private InternalMap As Map";
_internalmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=76873730;
 //BA.debugLineNum = 76873730;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=77332480;
 //BA.debugLineNum = 77332480;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=77332481;
 //BA.debugLineNum = 77332481;BA.debugLine="Dim InternalMap As Map";
_internalmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=77332482;
 //BA.debugLineNum = 77332482;BA.debugLine="InternalMap.Initialize";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=77332483;
 //BA.debugLineNum = 77332483;BA.debugLine="End Sub";
return "";
}
public boolean  _containskey(b4j.example.copyonwritemap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "containskey", true))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=77463552;
 //BA.debugLineNum = 77463552;BA.debugLine="Public Sub ContainsKey (Key As Object) As Boolean";
RDebugUtils.currentLine=77463553;
 //BA.debugLineNum = 77463553;BA.debugLine="Return InternalMap.ContainsKey(Key)";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_key);
RDebugUtils.currentLine=77463554;
 //BA.debugLineNum = 77463554;BA.debugLine="End Sub";
return false;
}
public String  _copymap(b4j.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "copymap", true))
	 {return ((String) Debug.delegate(ba, "copymap", null));}
RDebugUtils.currentLine=77004800;
 //BA.debugLineNum = 77004800;BA.debugLine="Private Sub CopyMap";
RDebugUtils.currentLine=77004801;
 //BA.debugLineNum = 77004801;BA.debugLine="InternalMap = B4XCollections.MergeMaps(InternalMa";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/  = _b4xcollections._mergemaps /*anywheresoftware.b4a.objects.collections.Map*/ (__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ ,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__c.Null)));
RDebugUtils.currentLine=77004802;
 //BA.debugLineNum = 77004802;BA.debugLine="End Sub";
return "";
}
public Object  _get(b4j.example.copyonwritemap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_key}));}
RDebugUtils.currentLine=77070336;
 //BA.debugLineNum = 77070336;BA.debugLine="Public Sub Get (Key As Object) As Object";
RDebugUtils.currentLine=77070337;
 //BA.debugLineNum = 77070337;BA.debugLine="Return InternalMap.Get(Key)";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_key);
RDebugUtils.currentLine=77070338;
 //BA.debugLineNum = 77070338;BA.debugLine="End Sub";
return null;
}
public Object  _getdefault(b4j.example.copyonwritemap __ref,Object _key,Object _default) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "getdefault", true))
	 {return ((Object) Debug.delegate(ba, "getdefault", new Object[] {_key,_default}));}
RDebugUtils.currentLine=77135872;
 //BA.debugLineNum = 77135872;BA.debugLine="Public Sub GetDefault (Key As Object, Default As O";
RDebugUtils.currentLine=77135873;
 //BA.debugLineNum = 77135873;BA.debugLine="Return InternalMap.GetDefault(Key, Default)";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault(_key,_default);
RDebugUtils.currentLine=77135874;
 //BA.debugLineNum = 77135874;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getmap(b4j.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "getmap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getmap", null));}
RDebugUtils.currentLine=77529088;
 //BA.debugLineNum = 77529088;BA.debugLine="Public Sub GetMap As Map";
RDebugUtils.currentLine=77529089;
 //BA.debugLineNum = 77529089;BA.debugLine="Return InternalMap";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=77529090;
 //BA.debugLineNum = 77529090;BA.debugLine="End Sub";
return null;
}
public int  _getsize(b4j.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=77398016;
 //BA.debugLineNum = 77398016;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=77398017;
 //BA.debugLineNum = 77398017;BA.debugLine="Return InternalMap.Size";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .getSize();
RDebugUtils.currentLine=77398018;
 //BA.debugLineNum = 77398018;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.example.copyonwritemap __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _initialitems) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_initialitems}));}
RDebugUtils.currentLine=76939264;
 //BA.debugLineNum = 76939264;BA.debugLine="Public Sub Initialize (InitialItems As Map)";
RDebugUtils.currentLine=76939265;
 //BA.debugLineNum = 76939265;BA.debugLine="InternalMap = B4XCollections.MergeMaps(InitialIte";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/  = _b4xcollections._mergemaps /*anywheresoftware.b4a.objects.collections.Map*/ (_initialitems,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__c.Null)));
RDebugUtils.currentLine=76939266;
 //BA.debugLineNum = 76939266;BA.debugLine="End Sub";
return "";
}
public String  _put(b4j.example.copyonwritemap __ref,Object _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "put", true))
	 {return ((String) Debug.delegate(ba, "put", new Object[] {_key,_value}));}
RDebugUtils.currentLine=77201408;
 //BA.debugLineNum = 77201408;BA.debugLine="Public Sub Put (Key As Object, Value As Object)";
RDebugUtils.currentLine=77201409;
 //BA.debugLineNum = 77201409;BA.debugLine="CopyMap";
__ref._copymap /*String*/ (null);
RDebugUtils.currentLine=77201410;
 //BA.debugLineNum = 77201410;BA.debugLine="InternalMap.Put(Key, Value)";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_key,_value);
RDebugUtils.currentLine=77201411;
 //BA.debugLineNum = 77201411;BA.debugLine="End Sub";
return "";
}
public String  _remove(b4j.example.copyonwritemap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=77266944;
 //BA.debugLineNum = 77266944;BA.debugLine="Public Sub Remove (Key As Object)";
RDebugUtils.currentLine=77266945;
 //BA.debugLineNum = 77266945;BA.debugLine="CopyMap";
__ref._copymap /*String*/ (null);
RDebugUtils.currentLine=77266946;
 //BA.debugLineNum = 77266946;BA.debugLine="InternalMap.Remove(Key)";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .Remove(_key);
RDebugUtils.currentLine=77266947;
 //BA.debugLineNum = 77266947;BA.debugLine="End Sub";
return "";
}
}