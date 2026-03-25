package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xcache extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xcache", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xcache.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xcacheitem{
public boolean IsInitialized;
public Object Value;
public long LastAccessedTime;
public String Key;
public boolean Eternal;
public void Initialize() {
IsInitialized = true;
Value = new Object();
LastAccessedTime = 0L;
Key = "";
Eternal = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.b4xorderedmap _data = null;
public int _mmaxsize = 0;
public float _removethreshold = 0f;
public int _eternalcounts = 0;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _class_globals(b4j.example.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
RDebugUtils.currentLine=70451200;
 //BA.debugLineNum = 70451200;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=70451201;
 //BA.debugLineNum = 70451201;BA.debugLine="Type B4XCacheItem (Value As Object, LastAccessedT";
;
RDebugUtils.currentLine=70451202;
 //BA.debugLineNum = 70451202;BA.debugLine="Private Data As B4XOrderedMap";
_data = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=70451203;
 //BA.debugLineNum = 70451203;BA.debugLine="Private mMaxSize As Int = 100";
_mmaxsize = (int) (100);
RDebugUtils.currentLine=70451204;
 //BA.debugLineNum = 70451204;BA.debugLine="Private RemoveThreshold As Float = 0.3";
_removethreshold = (float) (0.3);
RDebugUtils.currentLine=70451205;
 //BA.debugLineNum = 70451205;BA.debugLine="Private EternalCounts As Int";
_eternalcounts = 0;
RDebugUtils.currentLine=70451206;
 //BA.debugLineNum = 70451206;BA.debugLine="End Sub";
return "";
}
public boolean  _containskey(b4j.example.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "containskey", true))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=71041024;
 //BA.debugLineNum = 71041024;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
RDebugUtils.currentLine=71041025;
 //BA.debugLineNum = 71041025;BA.debugLine="Return Data.ContainsKey(Key)";
if (true) return __ref._data /*b4j.example.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_key));
RDebugUtils.currentLine=71041026;
 //BA.debugLineNum = 71041026;BA.debugLine="End Sub";
return false;
}
public b4j.example.b4xcache._b4xcacheitem  _createb4xcacheitem(b4j.example.b4xcache __ref,Object _value,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "createb4xcacheitem", true))
	 {return ((b4j.example.b4xcache._b4xcacheitem) Debug.delegate(ba, "createb4xcacheitem", new Object[] {_value,_key}));}
b4j.example.b4xcache._b4xcacheitem _t1 = null;
RDebugUtils.currentLine=71368704;
 //BA.debugLineNum = 71368704;BA.debugLine="Private Sub CreateB4XCacheItem (Value As Object, K";
RDebugUtils.currentLine=71368705;
 //BA.debugLineNum = 71368705;BA.debugLine="Dim t1 As B4XCacheItem";
_t1 = new b4j.example.b4xcache._b4xcacheitem();
RDebugUtils.currentLine=71368706;
 //BA.debugLineNum = 71368706;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=71368707;
 //BA.debugLineNum = 71368707;BA.debugLine="t1.Value = Value";
_t1.Value /*Object*/  = _value;
RDebugUtils.currentLine=71368708;
 //BA.debugLineNum = 71368708;BA.debugLine="t1.LastAccessedTime = DateTime.Now";
_t1.LastAccessedTime /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=71368709;
 //BA.debugLineNum = 71368709;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=71368710;
 //BA.debugLineNum = 71368710;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=71368711;
 //BA.debugLineNum = 71368711;BA.debugLine="End Sub";
return null;
}
public Object  _get(b4j.example.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_key}));}
b4j.example.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=70713344;
 //BA.debugLineNum = 70713344;BA.debugLine="Public Sub Get (Key As String) As Object";
RDebugUtils.currentLine=70713345;
 //BA.debugLineNum = 70713345;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (b4j.example.b4xcache._b4xcacheitem)(__ref._data /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_key)));
RDebugUtils.currentLine=70713346;
 //BA.debugLineNum = 70713346;BA.debugLine="If ci <> Null Then";
if (_ci!= null) { 
RDebugUtils.currentLine=70713347;
 //BA.debugLineNum = 70713347;BA.debugLine="If ci.Eternal = False Then ci.LastAccessedTime =";
if (_ci.Eternal /*boolean*/ ==__c.False) { 
_ci.LastAccessedTime /*long*/  = __c.DateTime.getNow();};
RDebugUtils.currentLine=70713348;
 //BA.debugLineNum = 70713348;BA.debugLine="Return ci.Value";
if (true) return _ci.Value /*Object*/ ;
 };
RDebugUtils.currentLine=70713350;
 //BA.debugLineNum = 70713350;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=70713351;
 //BA.debugLineNum = 70713351;BA.debugLine="End Sub";
return null;
}
public int  _getmaxsize(b4j.example.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "getmaxsize", true))
	 {return ((Integer) Debug.delegate(ba, "getmaxsize", null));}
RDebugUtils.currentLine=70647808;
 //BA.debugLineNum = 70647808;BA.debugLine="Public Sub getMaxSize As Int";
RDebugUtils.currentLine=70647809;
 //BA.debugLineNum = 70647809;BA.debugLine="Return mMaxSize";
if (true) return __ref._mmaxsize /*int*/ ;
RDebugUtils.currentLine=70647810;
 //BA.debugLineNum = 70647810;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.example.b4xcache __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=70516736;
 //BA.debugLineNum = 70516736;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=70516737;
 //BA.debugLineNum = 70516737;BA.debugLine="Data.Initialize";
__ref._data /*b4j.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=70516738;
 //BA.debugLineNum = 70516738;BA.debugLine="End Sub";
return "";
}
public boolean  _iseternal(b4j.example.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "iseternal", true))
	 {return ((Boolean) Debug.delegate(ba, "iseternal", new Object[] {_key}));}
b4j.example.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=70975488;
 //BA.debugLineNum = 70975488;BA.debugLine="Private Sub IsEternal(Key As String) As Boolean";
RDebugUtils.currentLine=70975489;
 //BA.debugLineNum = 70975489;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (b4j.example.b4xcache._b4xcacheitem)(__ref._data /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_key)));
RDebugUtils.currentLine=70975490;
 //BA.debugLineNum = 70975490;BA.debugLine="Return IIf(ci = Null, False, ci.Eternal)";
if (true) return BA.ObjectToBoolean(((_ci== null) ? ((Object)(__c.False)) : ((Object)(_ci.Eternal /*boolean*/ ))));
RDebugUtils.currentLine=70975491;
 //BA.debugLineNum = 70975491;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _keys(b4j.example.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "keys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "keys", null));}
RDebugUtils.currentLine=71303168;
 //BA.debugLineNum = 71303168;BA.debugLine="Public Sub Keys As List";
RDebugUtils.currentLine=71303169;
 //BA.debugLineNum = 71303169;BA.debugLine="Return Data.Keys";
if (true) return __ref._data /*b4j.example.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=71303170;
 //BA.debugLineNum = 71303170;BA.debugLine="End Sub";
return null;
}
public Object  _put(b4j.example.b4xcache __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "put", true))
	 {return ((Object) Debug.delegate(ba, "put", new Object[] {_key,_value}));}
RDebugUtils.currentLine=70778880;
 //BA.debugLineNum = 70778880;BA.debugLine="Public Sub Put (Key As String, Value As Object) As";
RDebugUtils.currentLine=70778881;
 //BA.debugLineNum = 70778881;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=70778882;
 //BA.debugLineNum = 70778882;BA.debugLine="Data.Put(Key, CreateB4XCacheItem(Value, Key))";
__ref._data /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_key),(Object)(__ref._createb4xcacheitem /*b4j.example.b4xcache._b4xcacheitem*/ (null,_value,_key)));
RDebugUtils.currentLine=70778883;
 //BA.debugLineNum = 70778883;BA.debugLine="TrimIfOversize";
__ref._trimifoversize /*String*/ (null);
RDebugUtils.currentLine=70778884;
 //BA.debugLineNum = 70778884;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=70778885;
 //BA.debugLineNum = 70778885;BA.debugLine="End Sub";
return null;
}
public String  _trimifoversize(b4j.example.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "trimifoversize", true))
	 {return ((String) Debug.delegate(ba, "trimifoversize", null));}
anywheresoftware.b4a.objects.collections.List _values = null;
int _numberofitemstoremove = 0;
int _i = 0;
RDebugUtils.currentLine=71106560;
 //BA.debugLineNum = 71106560;BA.debugLine="Private Sub TrimIfOversize";
RDebugUtils.currentLine=71106561;
 //BA.debugLineNum = 71106561;BA.debugLine="If Data.Size - EternalCounts > mMaxSize Then";
if (__ref._data /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)-__ref._eternalcounts /*int*/ >__ref._mmaxsize /*int*/ ) { 
RDebugUtils.currentLine=71106562;
 //BA.debugLineNum = 71106562;BA.debugLine="Dim values As List = Data.Values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = __ref._data /*b4j.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=71106563;
 //BA.debugLineNum = 71106563;BA.debugLine="values.SortType(\"LastAccessedTime\", True)";
_values.SortType("LastAccessedTime",__c.True);
RDebugUtils.currentLine=71106564;
 //BA.debugLineNum = 71106564;BA.debugLine="Dim NumberOfItemsToRemove As Int = Ceil(mMaxSize";
_numberofitemstoremove = (int) (__c.Ceil(__ref._mmaxsize /*int*/ *__ref._removethreshold /*float*/ ));
RDebugUtils.currentLine=71106565;
 //BA.debugLineNum = 71106565;BA.debugLine="For i = 0 To NumberOfItemsToRemove";
{
final int step5 = 1;
final int limit5 = _numberofitemstoremove;
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=71106566;
 //BA.debugLineNum = 71106566;BA.debugLine="Data.Remove(values.Get(i).As(B4XCacheItem).Key)";
__ref._data /*b4j.example.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(((b4j.example.b4xcache._b4xcacheitem)(_values.Get(_i))).Key /*String*/ ));
 }
};
 };
RDebugUtils.currentLine=71106569;
 //BA.debugLineNum = 71106569;BA.debugLine="End Sub";
return "";
}
public Object  _puteternal(b4j.example.b4xcache __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "puteternal", true))
	 {return ((Object) Debug.delegate(ba, "puteternal", new Object[] {_key,_value}));}
b4j.example.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=70844416;
 //BA.debugLineNum = 70844416;BA.debugLine="Public Sub PutEternal (Key As String, Value As Obj";
RDebugUtils.currentLine=70844417;
 //BA.debugLineNum = 70844417;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=70844418;
 //BA.debugLineNum = 70844418;BA.debugLine="Dim ci As B4XCacheItem = CreateB4XCacheItem(Value";
_ci = __ref._createb4xcacheitem /*b4j.example.b4xcache._b4xcacheitem*/ (null,_value,_key);
RDebugUtils.currentLine=70844419;
 //BA.debugLineNum = 70844419;BA.debugLine="ci.Eternal = True";
_ci.Eternal /*boolean*/  = __c.True;
RDebugUtils.currentLine=70844420;
 //BA.debugLineNum = 70844420;BA.debugLine="ci.LastAccessedTime = 9223372036854775807";
_ci.LastAccessedTime /*long*/  = (long) (9223372036854775807L);
RDebugUtils.currentLine=70844421;
 //BA.debugLineNum = 70844421;BA.debugLine="EternalCounts = EternalCounts + 1";
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ +1);
RDebugUtils.currentLine=70844422;
 //BA.debugLineNum = 70844422;BA.debugLine="Data.Put(Key, ci)";
__ref._data /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_key),(Object)(_ci));
RDebugUtils.currentLine=70844423;
 //BA.debugLineNum = 70844423;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=70844424;
 //BA.debugLineNum = 70844424;BA.debugLine="End Sub";
return null;
}
public String  _remove(b4j.example.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=70909952;
 //BA.debugLineNum = 70909952;BA.debugLine="Public Sub Remove (Key As String)";
RDebugUtils.currentLine=70909953;
 //BA.debugLineNum = 70909953;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=70909954;
 //BA.debugLineNum = 70909954;BA.debugLine="Data.Remove(Key)";
__ref._data /*b4j.example.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_key));
RDebugUtils.currentLine=70909955;
 //BA.debugLineNum = 70909955;BA.debugLine="End Sub";
return "";
}
public String  _removeolditems(b4j.example.b4xcache __ref,long _agems) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "removeolditems", true))
	 {return ((String) Debug.delegate(ba, "removeolditems", new Object[] {_agems}));}
anywheresoftware.b4a.objects.collections.List _values = null;
long _level = 0L;
b4j.example.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=71172096;
 //BA.debugLineNum = 71172096;BA.debugLine="Public Sub RemoveOldItems (AgeMs As Long)";
RDebugUtils.currentLine=71172097;
 //BA.debugLineNum = 71172097;BA.debugLine="Dim values As List = Data.Values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = __ref._data /*b4j.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=71172098;
 //BA.debugLineNum = 71172098;BA.debugLine="Dim level As Long = DateTime.Now - AgeMs";
_level = (long) (__c.DateTime.getNow()-_agems);
RDebugUtils.currentLine=71172099;
 //BA.debugLineNum = 71172099;BA.debugLine="For Each ci As B4XCacheItem In values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _values;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_ci = (b4j.example.b4xcache._b4xcacheitem)(group3.Get(index3));
RDebugUtils.currentLine=71172100;
 //BA.debugLineNum = 71172100;BA.debugLine="If ci.LastAccessedTime <= level Then";
if (_ci.LastAccessedTime /*long*/ <=_level) { 
RDebugUtils.currentLine=71172101;
 //BA.debugLineNum = 71172101;BA.debugLine="Data.Remove(ci.Key)";
__ref._data /*b4j.example.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_ci.Key /*String*/ ));
 };
 }
};
RDebugUtils.currentLine=71172104;
 //BA.debugLineNum = 71172104;BA.debugLine="End Sub";
return "";
}
public String  _setmaxsize(b4j.example.b4xcache __ref,int _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "setmaxsize", true))
	 {return ((String) Debug.delegate(ba, "setmaxsize", new Object[] {_s}));}
RDebugUtils.currentLine=70582272;
 //BA.debugLineNum = 70582272;BA.debugLine="Public Sub setMaxSize(s As Int)";
RDebugUtils.currentLine=70582273;
 //BA.debugLineNum = 70582273;BA.debugLine="mMaxSize = s";
__ref._mmaxsize /*int*/  = _s;
RDebugUtils.currentLine=70582274;
 //BA.debugLineNum = 70582274;BA.debugLine="TrimIfOversize";
__ref._trimifoversize /*String*/ (null);
RDebugUtils.currentLine=70582275;
 //BA.debugLineNum = 70582275;BA.debugLine="End Sub";
return "";
}
public int  _size(b4j.example.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "size", true))
	 {return ((Integer) Debug.delegate(ba, "size", null));}
RDebugUtils.currentLine=71237632;
 //BA.debugLineNum = 71237632;BA.debugLine="Public Sub Size As Int";
RDebugUtils.currentLine=71237633;
 //BA.debugLineNum = 71237633;BA.debugLine="Return Data.Size";
if (true) return __ref._data /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null);
RDebugUtils.currentLine=71237634;
 //BA.debugLineNum = 71237634;BA.debugLine="End Sub";
return 0;
}
}