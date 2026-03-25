package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xorderedmap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xorderedmap", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xorderedmap.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _map = null;
public anywheresoftware.b4a.objects.collections.List _list = null;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public boolean  _containskey(b4j.example.b4xorderedmap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "containskey", true))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=73203712;
 //BA.debugLineNum = 73203712;BA.debugLine="Public Sub ContainsKey (Key As Object) As Boolean";
RDebugUtils.currentLine=73203713;
 //BA.debugLineNum = 73203713;BA.debugLine="Return map.ContainsKey(Key)";
if (true) return __ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_key);
RDebugUtils.currentLine=73203714;
 //BA.debugLineNum = 73203714;BA.debugLine="End Sub";
return false;
}
public Object  _get(b4j.example.b4xorderedmap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_key}));}
RDebugUtils.currentLine=73072640;
 //BA.debugLineNum = 73072640;BA.debugLine="Public Sub Get (Key As Object) As Object";
RDebugUtils.currentLine=73072641;
 //BA.debugLineNum = 73072641;BA.debugLine="Return map.Get(Key)";
if (true) return __ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_key);
RDebugUtils.currentLine=73072642;
 //BA.debugLineNum = 73072642;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.b4xorderedmap __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=72744960;
 //BA.debugLineNum = 72744960;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=72744961;
 //BA.debugLineNum = 72744961;BA.debugLine="map.Initialize";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=72744962;
 //BA.debugLineNum = 72744962;BA.debugLine="list.Initialize";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=72744963;
 //BA.debugLineNum = 72744963;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getkeys(b4j.example.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getkeys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getkeys", null));}
RDebugUtils.currentLine=73007104;
 //BA.debugLineNum = 73007104;BA.debugLine="Public Sub getKeys As List";
RDebugUtils.currentLine=73007105;
 //BA.debugLineNum = 73007105;BA.debugLine="Return list";
if (true) return __ref._list /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=73007106;
 //BA.debugLineNum = 73007106;BA.debugLine="End Sub";
return null;
}
public String  _put(b4j.example.b4xorderedmap __ref,Object _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "put", true))
	 {return ((String) Debug.delegate(ba, "put", new Object[] {_key,_value}));}
RDebugUtils.currentLine=72810496;
 //BA.debugLineNum = 72810496;BA.debugLine="Public Sub Put (Key As Object, Value As Object)";
RDebugUtils.currentLine=72810497;
 //BA.debugLineNum = 72810497;BA.debugLine="If map.ContainsKey(Key) = False Then";
if (__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_key)==__c.False) { 
RDebugUtils.currentLine=72810498;
 //BA.debugLineNum = 72810498;BA.debugLine="list.Add(Key)";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .Add(_key);
 };
RDebugUtils.currentLine=72810500;
 //BA.debugLineNum = 72810500;BA.debugLine="map.Put(Key, Value)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_key,_value);
RDebugUtils.currentLine=72810501;
 //BA.debugLineNum = 72810501;BA.debugLine="End Sub";
return "";
}
public String  _remove(b4j.example.b4xorderedmap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=72876032;
 //BA.debugLineNum = 72876032;BA.debugLine="Public Sub Remove (Key As Object)";
RDebugUtils.currentLine=72876033;
 //BA.debugLineNum = 72876033;BA.debugLine="If map.ContainsKey(Key) = False Then Return";
if (__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_key)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=72876034;
 //BA.debugLineNum = 72876034;BA.debugLine="list.RemoveAt(list.IndexOf(Key))";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_key));
RDebugUtils.currentLine=72876035;
 //BA.debugLineNum = 72876035;BA.debugLine="map.Remove(Key)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Remove(_key);
RDebugUtils.currentLine=72876036;
 //BA.debugLineNum = 72876036;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getvalues(b4j.example.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getvalues", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getvalues", null));}
anywheresoftware.b4a.objects.collections.List _res = null;
Object _key = null;
RDebugUtils.currentLine=73334784;
 //BA.debugLineNum = 73334784;BA.debugLine="Public Sub getValues As List";
RDebugUtils.currentLine=73334785;
 //BA.debugLineNum = 73334785;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=73334786;
 //BA.debugLineNum = 73334786;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=73334787;
 //BA.debugLineNum = 73334787;BA.debugLine="For Each key As Object In list";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._list /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = group3.Get(index3);
RDebugUtils.currentLine=73334788;
 //BA.debugLineNum = 73334788;BA.debugLine="res.Add(map.Get(key))";
_res.Add(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_key));
 }
};
RDebugUtils.currentLine=73334790;
 //BA.debugLineNum = 73334790;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=73334791;
 //BA.debugLineNum = 73334791;BA.debugLine="End Sub";
return null;
}
public int  _getsize(b4j.example.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=73269248;
 //BA.debugLineNum = 73269248;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=73269249;
 //BA.debugLineNum = 73269249;BA.debugLine="Return map.Size";
if (true) return __ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .getSize();
RDebugUtils.currentLine=73269250;
 //BA.debugLineNum = 73269250;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4j.example.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
RDebugUtils.currentLine=72679424;
 //BA.debugLineNum = 72679424;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=72679425;
 //BA.debugLineNum = 72679425;BA.debugLine="Private map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=72679426;
 //BA.debugLineNum = 72679426;BA.debugLine="Private list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=72679427;
 //BA.debugLineNum = 72679427;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=72941568;
 //BA.debugLineNum = 72941568;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=72941569;
 //BA.debugLineNum = 72941569;BA.debugLine="list.Clear";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=72941570;
 //BA.debugLineNum = 72941570;BA.debugLine="map.Clear";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=72941571;
 //BA.debugLineNum = 72941571;BA.debugLine="End Sub";
return "";
}
public Object  _getdataforserializator(b4j.example.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getdataforserializator", true))
	 {return ((Object) Debug.delegate(ba, "getdataforserializator", null));}
RDebugUtils.currentLine=73400320;
 //BA.debugLineNum = 73400320;BA.debugLine="Public Sub GetDataForSerializator As Object";
RDebugUtils.currentLine=73400321;
 //BA.debugLineNum = 73400321;BA.debugLine="Return Array(map, list)";
if (true) return (Object)(new Object[]{(Object)(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=73400322;
 //BA.debugLineNum = 73400322;BA.debugLine="End Sub";
return null;
}
public Object  _getdefault(b4j.example.b4xorderedmap __ref,Object _key,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getdefault", true))
	 {return ((Object) Debug.delegate(ba, "getdefault", new Object[] {_key,_defaultvalue}));}
RDebugUtils.currentLine=73138176;
 //BA.debugLineNum = 73138176;BA.debugLine="Public Sub GetDefault (Key As Object, DefaultValue";
RDebugUtils.currentLine=73138177;
 //BA.debugLineNum = 73138177;BA.debugLine="Return map.GetDefault(Key, DefaultValue)";
if (true) return __ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault(_key,_defaultvalue);
RDebugUtils.currentLine=73138178;
 //BA.debugLineNum = 73138178;BA.debugLine="End Sub";
return null;
}
public String  _setdatafromserializator(b4j.example.b4xorderedmap __ref,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "setdatafromserializator", true))
	 {return ((String) Debug.delegate(ba, "setdatafromserializator", new Object[] {_data}));}
Object[] _o = null;
RDebugUtils.currentLine=73465856;
 //BA.debugLineNum = 73465856;BA.debugLine="Public Sub SetDataFromSerializator (Data As Object";
RDebugUtils.currentLine=73465857;
 //BA.debugLineNum = 73465857;BA.debugLine="Dim o() As Object = Data";
_o = (Object[])(_data);
RDebugUtils.currentLine=73465858;
 //BA.debugLineNum = 73465858;BA.debugLine="map = o(0)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_o[(int) (0)]));
RDebugUtils.currentLine=73465859;
 //BA.debugLineNum = 73465859;BA.debugLine="list = o(1)";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_o[(int) (1)]));
RDebugUtils.currentLine=73465860;
 //BA.debugLineNum = 73465860;BA.debugLine="End Sub";
return "";
}
}