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
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
RDebugUtils.currentLine=35454977;
 //BA.debugLineNum = 35454977;BA.debugLine="Dim s As B4XBitSet";
_s = new b4j.example.b4xbitset();
RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="s.Initialize(Size)";
_s._initialize /*String*/ (null,ba,_size);
RDebugUtils.currentLine=35454979;
 //BA.debugLineNum = 35454979;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=35454980;
 //BA.debugLineNum = 35454980;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _createlist(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createlist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createlist", new Object[] {_items}));}
anywheresoftware.b4a.objects.collections.List _res = null;
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Public Sub CreateList (Items As List) As List";
RDebugUtils.currentLine=35782657;
 //BA.debugLineNum = 35782657;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=35782659;
 //BA.debugLineNum = 35782659;BA.debugLine="If Initialized(Items) Then res.AddAll(Items)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_items))) { 
_res.AddAll(_items);};
RDebugUtils.currentLine=35782660;
 //BA.debugLineNum = 35782660;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=35782661;
 //BA.debugLineNum = 35782661;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xorderedmap  _createorderedmap() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createorderedmap", true))
	 {return ((b4j.example.b4xorderedmap) Debug.delegate(ba, "createorderedmap", null));}
RDebugUtils.currentLine=35323904;
 //BA.debugLineNum = 35323904;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
RDebugUtils.currentLine=35323905;
 //BA.debugLineNum = 35323905;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return _createorderedmap2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xorderedmap  _createorderedmap2(anywheresoftware.b4a.objects.collections.List _keys,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createorderedmap2", true))
	 {return ((b4j.example.b4xorderedmap) Debug.delegate(ba, "createorderedmap2", new Object[] {_keys,_values}));}
b4j.example.b4xorderedmap _m = null;
int _i = 0;
RDebugUtils.currentLine=35389440;
 //BA.debugLineNum = 35389440;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="Dim m As B4XOrderedMap";
_m = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="m.Initialize";
_m._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=35389443;
 //BA.debugLineNum = 35389443;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= null && _values!= null && _keys.IsInitialized() && _values.IsInitialized()) { 
RDebugUtils.currentLine=35389444;
 //BA.debugLineNum = 35389444;BA.debugLine="For i = 0 To Keys.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=35389445;
 //BA.debugLineNum = 35389445;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
_m._put /*String*/ (null,_keys.Get(_i),_values.Get(_i));
 }
};
 };
RDebugUtils.currentLine=35389448;
 //BA.debugLineNum = 35389448;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=35389449;
 //BA.debugLineNum = 35389449;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xset  _createset() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createset", true))
	 {return ((b4j.example.b4xset) Debug.delegate(ba, "createset", null));}
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Public Sub CreateSet As B4XSet";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="Return CreateSet2(Null)";
if (true) return _createset2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xset  _createset2(anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createset2", true))
	 {return ((b4j.example.b4xset) Debug.delegate(ba, "createset2", new Object[] {_values}));}
b4j.example.b4xset _s = null;
Object _v = null;
RDebugUtils.currentLine=35258368;
 //BA.debugLineNum = 35258368;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
RDebugUtils.currentLine=35258369;
 //BA.debugLineNum = 35258369;BA.debugLine="Dim s As B4XSet";
_s = new b4j.example.b4xset();
RDebugUtils.currentLine=35258370;
 //BA.debugLineNum = 35258370;BA.debugLine="s.Initialize";
_s._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=35258371;
 //BA.debugLineNum = 35258371;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= null && _values.IsInitialized()) { 
RDebugUtils.currentLine=35258372;
 //BA.debugLineNum = 35258372;BA.debugLine="For Each v As Object In Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = _values;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = group4.Get(index4);
RDebugUtils.currentLine=35258373;
 //BA.debugLineNum = 35258373;BA.debugLine="s.Add(v)";
_s._add /*String*/ (null,_v);
 }
};
 };
RDebugUtils.currentLine=35258376;
 //BA.debugLineNum = 35258376;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=35258377;
 //BA.debugLineNum = 35258377;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getemptylist() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "getemptylist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getemptylist", null));}
RDebugUtils.currentLine=35586048;
 //BA.debugLineNum = 35586048;BA.debugLine="Public Sub GetEmptyList As List";
RDebugUtils.currentLine=35586049;
 //BA.debugLineNum = 35586049;BA.debugLine="If mEmptyList.IsInitialized = False Or mEmptyList";
if (_memptylist.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _memptylist.getSize()>0) { 
RDebugUtils.currentLine=35586050;
 //BA.debugLineNum = 35586050;BA.debugLine="Dim mEmptyList As List";
_memptylist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35586051;
 //BA.debugLineNum = 35586051;BA.debugLine="mEmptyList.Initialize";
_memptylist.Initialize();
 };
RDebugUtils.currentLine=35586053;
 //BA.debugLineNum = 35586053;BA.debugLine="Return mEmptyList";
if (true) return _memptylist;
RDebugUtils.currentLine=35586054;
 //BA.debugLineNum = 35586054;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _getemptymap() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "getemptymap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getemptymap", null));}
RDebugUtils.currentLine=35520512;
 //BA.debugLineNum = 35520512;BA.debugLine="Public Sub GetEmptyMap As Map";
RDebugUtils.currentLine=35520513;
 //BA.debugLineNum = 35520513;BA.debugLine="If mEmptyMap.IsInitialized = False Or mEmptyMap.S";
if (_memptymap.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _memptymap.getSize()>0) { 
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="Dim mEmptyMap As Map";
_memptymap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35520515;
 //BA.debugLineNum = 35520515;BA.debugLine="mEmptyMap.Initialize";
_memptymap.Initialize();
 };
RDebugUtils.currentLine=35520517;
 //BA.debugLineNum = 35520517;BA.debugLine="Return mEmptyMap";
if (true) return _memptymap;
RDebugUtils.currentLine=35520518;
 //BA.debugLineNum = 35520518;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _mergelists(anywheresoftware.b4a.objects.collections.List _list1,anywheresoftware.b4a.objects.collections.List _list2) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "mergelists", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "mergelists", new Object[] {_list1,_list2}));}
anywheresoftware.b4a.objects.collections.List _res = null;
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Public Sub MergeLists (List1 As List, List2 As Lis";
RDebugUtils.currentLine=35717121;
 //BA.debugLineNum = 35717121;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=35717123;
 //BA.debugLineNum = 35717123;BA.debugLine="If Initialized(List1) Then res.AddAll(List1)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_list1))) { 
_res.AddAll(_list1);};
RDebugUtils.currentLine=35717124;
 //BA.debugLineNum = 35717124;BA.debugLine="If Initialized(List2) Then res.AddAll(List2)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_list2))) { 
_res.AddAll(_list2);};
RDebugUtils.currentLine=35717125;
 //BA.debugLineNum = 35717125;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=35717126;
 //BA.debugLineNum = 35717126;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _mergemaps(anywheresoftware.b4a.objects.collections.Map _map1,anywheresoftware.b4a.objects.collections.Map _map2) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "mergemaps", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "mergemaps", new Object[] {_map1,_map2}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
Object _key = null;
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Public Sub MergeMaps (Map1 As Map, Map2 As Map) As";
RDebugUtils.currentLine=35651585;
 //BA.debugLineNum = 35651585;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=35651587;
 //BA.debugLineNum = 35651587;BA.debugLine="If Initialized(Map1) Then";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_map1))) { 
RDebugUtils.currentLine=35651588;
 //BA.debugLineNum = 35651588;BA.debugLine="For Each key As Object In Map1.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _map1.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=35651589;
 //BA.debugLineNum = 35651589;BA.debugLine="res.Put(key, Map1.Get(key))";
_res.Put(_key,_map1.Get(_key));
 }
};
 };
RDebugUtils.currentLine=35651592;
 //BA.debugLineNum = 35651592;BA.debugLine="If Initialized(Map2) Then";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_map2))) { 
RDebugUtils.currentLine=35651593;
 //BA.debugLineNum = 35651593;BA.debugLine="For Each key As Object In Map2.Keys";
{
final anywheresoftware.b4a.BA.IterableList group9 = _map2.Keys();
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_key = group9.Get(index9);
RDebugUtils.currentLine=35651594;
 //BA.debugLineNum = 35651594;BA.debugLine="res.Put(key, Map2.Get(key))";
_res.Put(_key,_map2.Get(_key));
 }
};
 };
RDebugUtils.currentLine=35651597;
 //BA.debugLineNum = 35651597;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=35651598;
 //BA.debugLineNum = 35651598;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Public Sub ShuffleList (Items As List)";
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="Dim n As Int = Items.Size";
_n = _items.getSize();
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="For i = 0 To n - 2";
{
final int step2 = 1;
final int limit2 = (int) (_n-2);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=35848195;
 //BA.debugLineNum = 35848195;BA.debugLine="Dim j As Int = Rnd(i, n)";
_j = anywheresoftware.b4a.keywords.Common.Rnd(_i,_n);
RDebugUtils.currentLine=35848196;
 //BA.debugLineNum = 35848196;BA.debugLine="Dim o As Object = Items.Get(i)";
_o = _items.Get(_i);
RDebugUtils.currentLine=35848197;
 //BA.debugLineNum = 35848197;BA.debugLine="Items.Set(i, Items.Get(j))";
_items.Set(_i,_items.Get(_j));
RDebugUtils.currentLine=35848198;
 //BA.debugLineNum = 35848198;BA.debugLine="Items.Set(j, o)";
_items.Set(_j,_o);
 }
};
RDebugUtils.currentLine=35848200;
 //BA.debugLineNum = 35848200;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _sublist(anywheresoftware.b4a.objects.collections.List _items,int _startindex,int _endindex) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "sublist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "sublist", new Object[] {_items,_startindex,_endindex}));}
anywheresoftware.b4a.objects.collections.List _res = null;
int _i = 0;
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Public Sub SubList (Items As List, StartIndex As I";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=35913731;
 //BA.debugLineNum = 35913731;BA.debugLine="For i = StartIndex To EndIndex - 1";
{
final int step3 = 1;
final int limit3 = (int) (_endindex-1);
_i = _startindex ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=35913732;
 //BA.debugLineNum = 35913732;BA.debugLine="res.Add(Items.Get(i))";
_res.Add(_items.Get(_i));
 }
};
RDebugUtils.currentLine=35913734;
 //BA.debugLineNum = 35913734;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=35913735;
 //BA.debugLineNum = 35913735;BA.debugLine="End Sub";
return null;
}
}