package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class b4xcollections extends Object{
public static b4xcollections mostCurrent = new b4xcollections();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xcollections", null);
		ba.loadHtSubs(b4xcollections.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.b4xcollections", ba);
		}
	}
    public static Class<?> getObject() {
		return b4xcollections.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _memptymap = null;
public static anywheresoftware.b4a.objects.collections.List _memptylist = null;
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.b4xbitset  _createbitset(int _size) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createbitset", true))
	 {return ((b4j.example.b4xbitset) Debug.delegate(ba, "createbitset", new Object[] {_size}));}
b4j.example.b4xbitset _s = null;
RDebugUtils.currentLine=73400320;
 //BA.debugLineNum = 73400320;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
RDebugUtils.currentLine=73400321;
 //BA.debugLineNum = 73400321;BA.debugLine="Dim s As B4XBitSet";
_s = new b4j.example.b4xbitset();
RDebugUtils.currentLine=73400322;
 //BA.debugLineNum = 73400322;BA.debugLine="s.Initialize(Size)";
_s._initialize /*String*/ (null,ba,_size);
RDebugUtils.currentLine=73400323;
 //BA.debugLineNum = 73400323;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=73400324;
 //BA.debugLineNum = 73400324;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _createlist(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createlist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createlist", new Object[] {_items}));}
anywheresoftware.b4a.objects.collections.List _res = null;
RDebugUtils.currentLine=73728000;
 //BA.debugLineNum = 73728000;BA.debugLine="Public Sub CreateList (Items As List) As List";
RDebugUtils.currentLine=73728001;
 //BA.debugLineNum = 73728001;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=73728002;
 //BA.debugLineNum = 73728002;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=73728003;
 //BA.debugLineNum = 73728003;BA.debugLine="If Initialized(Items) Then res.AddAll(Items)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_items))) { 
_res.AddAll(_items);};
RDebugUtils.currentLine=73728004;
 //BA.debugLineNum = 73728004;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=73728005;
 //BA.debugLineNum = 73728005;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xorderedmap  _createorderedmap() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createorderedmap", true))
	 {return ((b4j.example.b4xorderedmap) Debug.delegate(ba, "createorderedmap", null));}
RDebugUtils.currentLine=73269248;
 //BA.debugLineNum = 73269248;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
RDebugUtils.currentLine=73269249;
 //BA.debugLineNum = 73269249;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return _createorderedmap2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=73269250;
 //BA.debugLineNum = 73269250;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xorderedmap  _createorderedmap2(anywheresoftware.b4a.objects.collections.List _keys,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createorderedmap2", true))
	 {return ((b4j.example.b4xorderedmap) Debug.delegate(ba, "createorderedmap2", new Object[] {_keys,_values}));}
b4j.example.b4xorderedmap _m = null;
int _i = 0;
RDebugUtils.currentLine=73334784;
 //BA.debugLineNum = 73334784;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
RDebugUtils.currentLine=73334785;
 //BA.debugLineNum = 73334785;BA.debugLine="Dim m As B4XOrderedMap";
_m = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=73334786;
 //BA.debugLineNum = 73334786;BA.debugLine="m.Initialize";
_m._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=73334787;
 //BA.debugLineNum = 73334787;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= null && _values!= null && _keys.IsInitialized() && _values.IsInitialized()) { 
RDebugUtils.currentLine=73334788;
 //BA.debugLineNum = 73334788;BA.debugLine="For i = 0 To Keys.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=73334789;
 //BA.debugLineNum = 73334789;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
_m._put /*String*/ (null,_keys.Get(_i),_values.Get(_i));
 }
};
 };
RDebugUtils.currentLine=73334792;
 //BA.debugLineNum = 73334792;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=73334793;
 //BA.debugLineNum = 73334793;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xset  _createset() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createset", true))
	 {return ((b4j.example.b4xset) Debug.delegate(ba, "createset", null));}
RDebugUtils.currentLine=73138176;
 //BA.debugLineNum = 73138176;BA.debugLine="Public Sub CreateSet As B4XSet";
RDebugUtils.currentLine=73138177;
 //BA.debugLineNum = 73138177;BA.debugLine="Return CreateSet2(Null)";
if (true) return _createset2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=73138178;
 //BA.debugLineNum = 73138178;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xset  _createset2(anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createset2", true))
	 {return ((b4j.example.b4xset) Debug.delegate(ba, "createset2", new Object[] {_values}));}
b4j.example.b4xset _s = null;
Object _v = null;
RDebugUtils.currentLine=73203712;
 //BA.debugLineNum = 73203712;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
RDebugUtils.currentLine=73203713;
 //BA.debugLineNum = 73203713;BA.debugLine="Dim s As B4XSet";
_s = new b4j.example.b4xset();
RDebugUtils.currentLine=73203714;
 //BA.debugLineNum = 73203714;BA.debugLine="s.Initialize";
_s._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=73203715;
 //BA.debugLineNum = 73203715;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= null && _values.IsInitialized()) { 
RDebugUtils.currentLine=73203716;
 //BA.debugLineNum = 73203716;BA.debugLine="For Each v As Object In Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = _values;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = group4.Get(index4);
RDebugUtils.currentLine=73203717;
 //BA.debugLineNum = 73203717;BA.debugLine="s.Add(v)";
_s._add /*String*/ (null,_v);
 }
};
 };
RDebugUtils.currentLine=73203720;
 //BA.debugLineNum = 73203720;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=73203721;
 //BA.debugLineNum = 73203721;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getemptylist() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "getemptylist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getemptylist", null));}
RDebugUtils.currentLine=73531392;
 //BA.debugLineNum = 73531392;BA.debugLine="Public Sub GetEmptyList As List";
RDebugUtils.currentLine=73531393;
 //BA.debugLineNum = 73531393;BA.debugLine="If mEmptyList.IsInitialized = False Or mEmptyList";
if (_memptylist.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _memptylist.getSize()>0) { 
RDebugUtils.currentLine=73531394;
 //BA.debugLineNum = 73531394;BA.debugLine="Dim mEmptyList As List";
_memptylist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=73531395;
 //BA.debugLineNum = 73531395;BA.debugLine="mEmptyList.Initialize";
_memptylist.Initialize();
 };
RDebugUtils.currentLine=73531397;
 //BA.debugLineNum = 73531397;BA.debugLine="Return mEmptyList";
if (true) return _memptylist;
RDebugUtils.currentLine=73531398;
 //BA.debugLineNum = 73531398;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _getemptymap() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "getemptymap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getemptymap", null));}
RDebugUtils.currentLine=73465856;
 //BA.debugLineNum = 73465856;BA.debugLine="Public Sub GetEmptyMap As Map";
RDebugUtils.currentLine=73465857;
 //BA.debugLineNum = 73465857;BA.debugLine="If mEmptyMap.IsInitialized = False Or mEmptyMap.S";
if (_memptymap.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _memptymap.getSize()>0) { 
RDebugUtils.currentLine=73465858;
 //BA.debugLineNum = 73465858;BA.debugLine="Dim mEmptyMap As Map";
_memptymap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=73465859;
 //BA.debugLineNum = 73465859;BA.debugLine="mEmptyMap.Initialize";
_memptymap.Initialize();
 };
RDebugUtils.currentLine=73465861;
 //BA.debugLineNum = 73465861;BA.debugLine="Return mEmptyMap";
if (true) return _memptymap;
RDebugUtils.currentLine=73465862;
 //BA.debugLineNum = 73465862;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _mergelists(anywheresoftware.b4a.objects.collections.List _list1,anywheresoftware.b4a.objects.collections.List _list2) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "mergelists", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "mergelists", new Object[] {_list1,_list2}));}
anywheresoftware.b4a.objects.collections.List _res = null;
RDebugUtils.currentLine=73662464;
 //BA.debugLineNum = 73662464;BA.debugLine="Public Sub MergeLists (List1 As List, List2 As Lis";
RDebugUtils.currentLine=73662465;
 //BA.debugLineNum = 73662465;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=73662466;
 //BA.debugLineNum = 73662466;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=73662467;
 //BA.debugLineNum = 73662467;BA.debugLine="If Initialized(List1) Then res.AddAll(List1)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_list1))) { 
_res.AddAll(_list1);};
RDebugUtils.currentLine=73662468;
 //BA.debugLineNum = 73662468;BA.debugLine="If Initialized(List2) Then res.AddAll(List2)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_list2))) { 
_res.AddAll(_list2);};
RDebugUtils.currentLine=73662469;
 //BA.debugLineNum = 73662469;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=73662470;
 //BA.debugLineNum = 73662470;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _mergemaps(anywheresoftware.b4a.objects.collections.Map _map1,anywheresoftware.b4a.objects.collections.Map _map2) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "mergemaps", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "mergemaps", new Object[] {_map1,_map2}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
Object _key = null;
RDebugUtils.currentLine=73596928;
 //BA.debugLineNum = 73596928;BA.debugLine="Public Sub MergeMaps (Map1 As Map, Map2 As Map) As";
RDebugUtils.currentLine=73596929;
 //BA.debugLineNum = 73596929;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=73596930;
 //BA.debugLineNum = 73596930;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=73596931;
 //BA.debugLineNum = 73596931;BA.debugLine="If Initialized(Map1) Then";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_map1))) { 
RDebugUtils.currentLine=73596932;
 //BA.debugLineNum = 73596932;BA.debugLine="For Each key As Object In Map1.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _map1.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=73596933;
 //BA.debugLineNum = 73596933;BA.debugLine="res.Put(key, Map1.Get(key))";
_res.Put(_key,_map1.Get(_key));
 }
};
 };
RDebugUtils.currentLine=73596936;
 //BA.debugLineNum = 73596936;BA.debugLine="If Initialized(Map2) Then";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_map2))) { 
RDebugUtils.currentLine=73596937;
 //BA.debugLineNum = 73596937;BA.debugLine="For Each key As Object In Map2.Keys";
{
final anywheresoftware.b4a.BA.IterableList group9 = _map2.Keys();
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_key = group9.Get(index9);
RDebugUtils.currentLine=73596938;
 //BA.debugLineNum = 73596938;BA.debugLine="res.Put(key, Map2.Get(key))";
_res.Put(_key,_map2.Get(_key));
 }
};
 };
RDebugUtils.currentLine=73596941;
 //BA.debugLineNum = 73596941;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=73596942;
 //BA.debugLineNum = 73596942;BA.debugLine="End Sub";
return null;
}
public static String  _shufflelist(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "shufflelist", true))
	 {return ((String) Debug.delegate(ba, "shufflelist", new Object[] {_items}));}
int _n = 0;
int _i = 0;
int _j = 0;
Object _o = null;
RDebugUtils.currentLine=73793536;
 //BA.debugLineNum = 73793536;BA.debugLine="Public Sub ShuffleList (Items As List)";
RDebugUtils.currentLine=73793537;
 //BA.debugLineNum = 73793537;BA.debugLine="Dim n As Int = Items.Size";
_n = _items.getSize();
RDebugUtils.currentLine=73793538;
 //BA.debugLineNum = 73793538;BA.debugLine="For i = 0 To n - 2";
{
final int step2 = 1;
final int limit2 = (int) (_n-2);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=73793539;
 //BA.debugLineNum = 73793539;BA.debugLine="Dim j As Int = Rnd(i, n)";
_j = anywheresoftware.b4a.keywords.Common.Rnd(_i,_n);
RDebugUtils.currentLine=73793540;
 //BA.debugLineNum = 73793540;BA.debugLine="Dim o As Object = Items.Get(i)";
_o = _items.Get(_i);
RDebugUtils.currentLine=73793541;
 //BA.debugLineNum = 73793541;BA.debugLine="Items.Set(i, Items.Get(j))";
_items.Set(_i,_items.Get(_j));
RDebugUtils.currentLine=73793542;
 //BA.debugLineNum = 73793542;BA.debugLine="Items.Set(j, o)";
_items.Set(_j,_o);
 }
};
RDebugUtils.currentLine=73793544;
 //BA.debugLineNum = 73793544;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _sublist(anywheresoftware.b4a.objects.collections.List _items,int _startindex,int _endindex) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "sublist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "sublist", new Object[] {_items,_startindex,_endindex}));}
anywheresoftware.b4a.objects.collections.List _res = null;
int _i = 0;
RDebugUtils.currentLine=73859072;
 //BA.debugLineNum = 73859072;BA.debugLine="Public Sub SubList (Items As List, StartIndex As I";
RDebugUtils.currentLine=73859073;
 //BA.debugLineNum = 73859073;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=73859074;
 //BA.debugLineNum = 73859074;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=73859075;
 //BA.debugLineNum = 73859075;BA.debugLine="For i = StartIndex To EndIndex - 1";
{
final int step3 = 1;
final int limit3 = (int) (_endindex-1);
_i = _startindex ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=73859076;
 //BA.debugLineNum = 73859076;BA.debugLine="res.Add(Items.Get(i))";
_res.Add(_items.Get(_i));
 }
};
RDebugUtils.currentLine=73859078;
 //BA.debugLineNum = 73859078;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=73859079;
 //BA.debugLineNum = 73859079;BA.debugLine="End Sub";
return null;
}
}