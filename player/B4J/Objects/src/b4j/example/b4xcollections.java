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
RDebugUtils.currentLine=71761920;
 //BA.debugLineNum = 71761920;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
RDebugUtils.currentLine=71761921;
 //BA.debugLineNum = 71761921;BA.debugLine="Dim s As B4XBitSet";
_s = new b4j.example.b4xbitset();
RDebugUtils.currentLine=71761922;
 //BA.debugLineNum = 71761922;BA.debugLine="s.Initialize(Size)";
_s._initialize /*String*/ (null,ba,_size);
RDebugUtils.currentLine=71761923;
 //BA.debugLineNum = 71761923;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=71761924;
 //BA.debugLineNum = 71761924;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _createlist(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createlist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createlist", new Object[] {_items}));}
anywheresoftware.b4a.objects.collections.List _res = null;
RDebugUtils.currentLine=72089600;
 //BA.debugLineNum = 72089600;BA.debugLine="Public Sub CreateList (Items As List) As List";
RDebugUtils.currentLine=72089601;
 //BA.debugLineNum = 72089601;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=72089602;
 //BA.debugLineNum = 72089602;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=72089603;
 //BA.debugLineNum = 72089603;BA.debugLine="If Initialized(Items) Then res.AddAll(Items)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_items))) { 
_res.AddAll(_items);};
RDebugUtils.currentLine=72089604;
 //BA.debugLineNum = 72089604;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=72089605;
 //BA.debugLineNum = 72089605;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xorderedmap  _createorderedmap() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createorderedmap", true))
	 {return ((b4j.example.b4xorderedmap) Debug.delegate(ba, "createorderedmap", null));}
RDebugUtils.currentLine=71630848;
 //BA.debugLineNum = 71630848;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
RDebugUtils.currentLine=71630849;
 //BA.debugLineNum = 71630849;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return _createorderedmap2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=71630850;
 //BA.debugLineNum = 71630850;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xorderedmap  _createorderedmap2(anywheresoftware.b4a.objects.collections.List _keys,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createorderedmap2", true))
	 {return ((b4j.example.b4xorderedmap) Debug.delegate(ba, "createorderedmap2", new Object[] {_keys,_values}));}
b4j.example.b4xorderedmap _m = null;
int _i = 0;
RDebugUtils.currentLine=71696384;
 //BA.debugLineNum = 71696384;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
RDebugUtils.currentLine=71696385;
 //BA.debugLineNum = 71696385;BA.debugLine="Dim m As B4XOrderedMap";
_m = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=71696386;
 //BA.debugLineNum = 71696386;BA.debugLine="m.Initialize";
_m._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=71696387;
 //BA.debugLineNum = 71696387;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= null && _values!= null && _keys.IsInitialized() && _values.IsInitialized()) { 
RDebugUtils.currentLine=71696388;
 //BA.debugLineNum = 71696388;BA.debugLine="For i = 0 To Keys.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=71696389;
 //BA.debugLineNum = 71696389;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
_m._put /*String*/ (null,_keys.Get(_i),_values.Get(_i));
 }
};
 };
RDebugUtils.currentLine=71696392;
 //BA.debugLineNum = 71696392;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=71696393;
 //BA.debugLineNum = 71696393;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xset  _createset() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createset", true))
	 {return ((b4j.example.b4xset) Debug.delegate(ba, "createset", null));}
RDebugUtils.currentLine=71499776;
 //BA.debugLineNum = 71499776;BA.debugLine="Public Sub CreateSet As B4XSet";
RDebugUtils.currentLine=71499777;
 //BA.debugLineNum = 71499777;BA.debugLine="Return CreateSet2(Null)";
if (true) return _createset2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=71499778;
 //BA.debugLineNum = 71499778;BA.debugLine="End Sub";
return null;
}
public static b4j.example.b4xset  _createset2(anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createset2", true))
	 {return ((b4j.example.b4xset) Debug.delegate(ba, "createset2", new Object[] {_values}));}
b4j.example.b4xset _s = null;
Object _v = null;
RDebugUtils.currentLine=71565312;
 //BA.debugLineNum = 71565312;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
RDebugUtils.currentLine=71565313;
 //BA.debugLineNum = 71565313;BA.debugLine="Dim s As B4XSet";
_s = new b4j.example.b4xset();
RDebugUtils.currentLine=71565314;
 //BA.debugLineNum = 71565314;BA.debugLine="s.Initialize";
_s._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=71565315;
 //BA.debugLineNum = 71565315;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= null && _values.IsInitialized()) { 
RDebugUtils.currentLine=71565316;
 //BA.debugLineNum = 71565316;BA.debugLine="For Each v As Object In Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = _values;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = group4.Get(index4);
RDebugUtils.currentLine=71565317;
 //BA.debugLineNum = 71565317;BA.debugLine="s.Add(v)";
_s._add /*String*/ (null,_v);
 }
};
 };
RDebugUtils.currentLine=71565320;
 //BA.debugLineNum = 71565320;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=71565321;
 //BA.debugLineNum = 71565321;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getemptylist() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "getemptylist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getemptylist", null));}
RDebugUtils.currentLine=71892992;
 //BA.debugLineNum = 71892992;BA.debugLine="Public Sub GetEmptyList As List";
RDebugUtils.currentLine=71892993;
 //BA.debugLineNum = 71892993;BA.debugLine="If mEmptyList.IsInitialized = False Or mEmptyList";
if (_memptylist.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _memptylist.getSize()>0) { 
RDebugUtils.currentLine=71892994;
 //BA.debugLineNum = 71892994;BA.debugLine="Dim mEmptyList As List";
_memptylist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=71892995;
 //BA.debugLineNum = 71892995;BA.debugLine="mEmptyList.Initialize";
_memptylist.Initialize();
 };
RDebugUtils.currentLine=71892997;
 //BA.debugLineNum = 71892997;BA.debugLine="Return mEmptyList";
if (true) return _memptylist;
RDebugUtils.currentLine=71892998;
 //BA.debugLineNum = 71892998;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _getemptymap() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "getemptymap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getemptymap", null));}
RDebugUtils.currentLine=71827456;
 //BA.debugLineNum = 71827456;BA.debugLine="Public Sub GetEmptyMap As Map";
RDebugUtils.currentLine=71827457;
 //BA.debugLineNum = 71827457;BA.debugLine="If mEmptyMap.IsInitialized = False Or mEmptyMap.S";
if (_memptymap.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _memptymap.getSize()>0) { 
RDebugUtils.currentLine=71827458;
 //BA.debugLineNum = 71827458;BA.debugLine="Dim mEmptyMap As Map";
_memptymap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=71827459;
 //BA.debugLineNum = 71827459;BA.debugLine="mEmptyMap.Initialize";
_memptymap.Initialize();
 };
RDebugUtils.currentLine=71827461;
 //BA.debugLineNum = 71827461;BA.debugLine="Return mEmptyMap";
if (true) return _memptymap;
RDebugUtils.currentLine=71827462;
 //BA.debugLineNum = 71827462;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _mergelists(anywheresoftware.b4a.objects.collections.List _list1,anywheresoftware.b4a.objects.collections.List _list2) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "mergelists", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "mergelists", new Object[] {_list1,_list2}));}
anywheresoftware.b4a.objects.collections.List _res = null;
RDebugUtils.currentLine=72024064;
 //BA.debugLineNum = 72024064;BA.debugLine="Public Sub MergeLists (List1 As List, List2 As Lis";
RDebugUtils.currentLine=72024065;
 //BA.debugLineNum = 72024065;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=72024066;
 //BA.debugLineNum = 72024066;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=72024067;
 //BA.debugLineNum = 72024067;BA.debugLine="If Initialized(List1) Then res.AddAll(List1)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_list1))) { 
_res.AddAll(_list1);};
RDebugUtils.currentLine=72024068;
 //BA.debugLineNum = 72024068;BA.debugLine="If Initialized(List2) Then res.AddAll(List2)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_list2))) { 
_res.AddAll(_list2);};
RDebugUtils.currentLine=72024069;
 //BA.debugLineNum = 72024069;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=72024070;
 //BA.debugLineNum = 72024070;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _mergemaps(anywheresoftware.b4a.objects.collections.Map _map1,anywheresoftware.b4a.objects.collections.Map _map2) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "mergemaps", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "mergemaps", new Object[] {_map1,_map2}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
Object _key = null;
RDebugUtils.currentLine=71958528;
 //BA.debugLineNum = 71958528;BA.debugLine="Public Sub MergeMaps (Map1 As Map, Map2 As Map) As";
RDebugUtils.currentLine=71958529;
 //BA.debugLineNum = 71958529;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=71958530;
 //BA.debugLineNum = 71958530;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=71958531;
 //BA.debugLineNum = 71958531;BA.debugLine="If Initialized(Map1) Then";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_map1))) { 
RDebugUtils.currentLine=71958532;
 //BA.debugLineNum = 71958532;BA.debugLine="For Each key As Object In Map1.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _map1.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=71958533;
 //BA.debugLineNum = 71958533;BA.debugLine="res.Put(key, Map1.Get(key))";
_res.Put(_key,_map1.Get(_key));
 }
};
 };
RDebugUtils.currentLine=71958536;
 //BA.debugLineNum = 71958536;BA.debugLine="If Initialized(Map2) Then";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_map2))) { 
RDebugUtils.currentLine=71958537;
 //BA.debugLineNum = 71958537;BA.debugLine="For Each key As Object In Map2.Keys";
{
final anywheresoftware.b4a.BA.IterableList group9 = _map2.Keys();
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_key = group9.Get(index9);
RDebugUtils.currentLine=71958538;
 //BA.debugLineNum = 71958538;BA.debugLine="res.Put(key, Map2.Get(key))";
_res.Put(_key,_map2.Get(_key));
 }
};
 };
RDebugUtils.currentLine=71958541;
 //BA.debugLineNum = 71958541;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=71958542;
 //BA.debugLineNum = 71958542;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=72155136;
 //BA.debugLineNum = 72155136;BA.debugLine="Public Sub ShuffleList (Items As List)";
RDebugUtils.currentLine=72155137;
 //BA.debugLineNum = 72155137;BA.debugLine="Dim n As Int = Items.Size";
_n = _items.getSize();
RDebugUtils.currentLine=72155138;
 //BA.debugLineNum = 72155138;BA.debugLine="For i = 0 To n - 2";
{
final int step2 = 1;
final int limit2 = (int) (_n-2);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=72155139;
 //BA.debugLineNum = 72155139;BA.debugLine="Dim j As Int = Rnd(i, n)";
_j = anywheresoftware.b4a.keywords.Common.Rnd(_i,_n);
RDebugUtils.currentLine=72155140;
 //BA.debugLineNum = 72155140;BA.debugLine="Dim o As Object = Items.Get(i)";
_o = _items.Get(_i);
RDebugUtils.currentLine=72155141;
 //BA.debugLineNum = 72155141;BA.debugLine="Items.Set(i, Items.Get(j))";
_items.Set(_i,_items.Get(_j));
RDebugUtils.currentLine=72155142;
 //BA.debugLineNum = 72155142;BA.debugLine="Items.Set(j, o)";
_items.Set(_j,_o);
 }
};
RDebugUtils.currentLine=72155144;
 //BA.debugLineNum = 72155144;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _sublist(anywheresoftware.b4a.objects.collections.List _items,int _startindex,int _endindex) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "sublist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "sublist", new Object[] {_items,_startindex,_endindex}));}
anywheresoftware.b4a.objects.collections.List _res = null;
int _i = 0;
RDebugUtils.currentLine=72220672;
 //BA.debugLineNum = 72220672;BA.debugLine="Public Sub SubList (Items As List, StartIndex As I";
RDebugUtils.currentLine=72220673;
 //BA.debugLineNum = 72220673;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=72220674;
 //BA.debugLineNum = 72220674;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=72220675;
 //BA.debugLineNum = 72220675;BA.debugLine="For i = StartIndex To EndIndex - 1";
{
final int step3 = 1;
final int limit3 = (int) (_endindex-1);
_i = _startindex ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=72220676;
 //BA.debugLineNum = 72220676;BA.debugLine="res.Add(Items.Get(i))";
_res.Add(_items.Get(_i));
 }
};
RDebugUtils.currentLine=72220678;
 //BA.debugLineNum = 72220678;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=72220679;
 //BA.debugLineNum = 72220679;BA.debugLine="End Sub";
return null;
}
}