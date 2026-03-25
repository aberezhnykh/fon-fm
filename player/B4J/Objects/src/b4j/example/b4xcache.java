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
RDebugUtils.currentLine=72089600;
 //BA.debugLineNum = 72089600;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=72089601;
 //BA.debugLineNum = 72089601;BA.debugLine="Type B4XCacheItem (Value As Object, LastAccessedT";
;
RDebugUtils.currentLine=72089602;
 //BA.debugLineNum = 72089602;BA.debugLine="Private Data As B4XOrderedMap";
_data = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=72089603;
 //BA.debugLineNum = 72089603;BA.debugLine="Private mMaxSize As Int = 100";
_mmaxsize = (int) (100);
RDebugUtils.currentLine=72089604;
 //BA.debugLineNum = 72089604;BA.debugLine="Private RemoveThreshold As Float = 0.3";
_removethreshold = (float) (0.3);
RDebugUtils.currentLine=72089605;
 //BA.debugLineNum = 72089605;BA.debugLine="Private EternalCounts As Int";
_eternalcounts = 0;
RDebugUtils.currentLine=72089606;
 //BA.debugLineNum = 72089606;BA.debugLine="End Sub";
return "";
}
public boolean  _containskey(b4j.example.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "containskey", true))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=72679424;
 //BA.debugLineNum = 72679424;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
RDebugUtils.currentLine=72679425;
 //BA.debugLineNum = 72679425;BA.debugLine="Return Data.ContainsKey(Key)";
if (true) return __ref._data /*b4j.example.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_key));
RDebugUtils.currentLine=72679426;
 //BA.debugLineNum = 72679426;BA.debugLine="End Sub";
return false;
}
public b4j.example.b4xcache._b4xcacheitem  _createb4xcacheitem(b4j.example.b4xcache __ref,Object _value,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "createb4xcacheitem", true))
	 {return ((b4j.example.b4xcache._b4xcacheitem) Debug.delegate(ba, "createb4xcacheitem", new Object[] {_value,_key}));}
b4j.example.b4xcache._b4xcacheitem _t1 = null;
RDebugUtils.currentLine=73007104;
 //BA.debugLineNum = 73007104;BA.debugLine="Private Sub CreateB4XCacheItem (Value As Object, K";
RDebugUtils.currentLine=73007105;
 //BA.debugLineNum = 73007105;BA.debugLine="Dim t1 As B4XCacheItem";
_t1 = new b4j.example.b4xcache._b4xcacheitem();
RDebugUtils.currentLine=73007106;
 //BA.debugLineNum = 73007106;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=73007107;
 //BA.debugLineNum = 73007107;BA.debugLine="t1.Value = Value";
_t1.Value /*Object*/  = _value;
RDebugUtils.currentLine=73007108;
 //BA.debugLineNum = 73007108;BA.debugLine="t1.LastAccessedTime = DateTime.Now";
_t1.LastAccessedTime /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=73007109;
 //BA.debugLineNum = 73007109;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=73007110;
 //BA.debugLineNum = 73007110;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=73007111;
 //BA.debugLineNum = 73007111;BA.debugLine="End Sub";
return null;
}
public Object  _get(b4j.example.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_key}));}
b4j.example.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=72351744;
 //BA.debugLineNum = 72351744;BA.debugLine="Public Sub Get (Key As String) As Object";
RDebugUtils.currentLine=72351745;
 //BA.debugLineNum = 72351745;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (b4j.example.b4xcache._b4xcacheitem)(__ref._data /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_key)));
RDebugUtils.currentLine=72351746;
 //BA.debugLineNum = 72351746;BA.debugLine="If ci <> Null Then";
if (_ci!= null) { 
RDebugUtils.currentLine=72351747;
 //BA.debugLineNum = 72351747;BA.debugLine="If ci.Eternal = False Then ci.LastAccessedTime =";
if (_ci.Eternal /*boolean*/ ==__c.False) { 
_ci.LastAccessedTime /*long*/  = __c.DateTime.getNow();};
RDebugUtils.currentLine=72351748;
 //BA.debugLineNum = 72351748;BA.debugLine="Return ci.Value";
if (true) return _ci.Value /*Object*/ ;
 };
RDebugUtils.currentLine=72351750;
 //BA.debugLineNum = 72351750;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=72351751;
 //BA.debugLineNum = 72351751;BA.debugLine="End Sub";
return null;
}
public int  _getmaxsize(b4j.example.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "getmaxsize", true))
	 {return ((Integer) Debug.delegate(ba, "getmaxsize", null));}
RDebugUtils.currentLine=72286208;
 //BA.debugLineNum = 72286208;BA.debugLine="Public Sub getMaxSize As Int";
RDebugUtils.currentLine=72286209;
 //BA.debugLineNum = 72286209;BA.debugLine="Return mMaxSize";
if (true) return __ref._mmaxsize /*int*/ ;
RDebugUtils.currentLine=72286210;
 //BA.debugLineNum = 72286210;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.example.b4xcache __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=72155136;
 //BA.debugLineNum = 72155136;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=72155137;
 //BA.debugLineNum = 72155137;BA.debugLine="Data.Initialize";
__ref._data /*b4j.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=72155138;
 //BA.debugLineNum = 72155138;BA.debugLine="End Sub";
return "";
}
public boolean  _iseternal(b4j.example.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "iseternal", true))
	 {return ((Boolean) Debug.delegate(ba, "iseternal", new Object[] {_key}));}
b4j.example.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=72613888;
 //BA.debugLineNum = 72613888;BA.debugLine="Private Sub IsEternal(Key As String) As Boolean";
RDebugUtils.currentLine=72613889;
 //BA.debugLineNum = 72613889;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (b4j.example.b4xcache._b4xcacheitem)(__ref._data /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_key)));
RDebugUtils.currentLine=72613890;
 //BA.debugLineNum = 72613890;BA.debugLine="Return IIf(ci = Null, False, ci.Eternal)";
if (true) return BA.ObjectToBoolean(((_ci== null) ? ((Object)(__c.False)) : ((Object)(_ci.Eternal /*boolean*/ ))));
RDebugUtils.currentLine=72613891;
 //BA.debugLineNum = 72613891;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _keys(b4j.example.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "keys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "keys", null));}
RDebugUtils.currentLine=72941568;
 //BA.debugLineNum = 72941568;BA.debugLine="Public Sub Keys As List";
RDebugUtils.currentLine=72941569;
 //BA.debugLineNum = 72941569;BA.debugLine="Return Data.Keys";
if (true) return __ref._data /*b4j.example.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=72941570;
 //BA.debugLineNum = 72941570;BA.debugLine="End Sub";
return null;
}
public Object  _put(b4j.example.b4xcache __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "put", true))
	 {return ((Object) Debug.delegate(ba, "put", new Object[] {_key,_value}));}
RDebugUtils.currentLine=72417280;
 //BA.debugLineNum = 72417280;BA.debugLine="Public Sub Put (Key As String, Value As Object) As";
RDebugUtils.currentLine=72417281;
 //BA.debugLineNum = 72417281;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=72417282;
 //BA.debugLineNum = 72417282;BA.debugLine="Data.Put(Key, CreateB4XCacheItem(Value, Key))";
__ref._data /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_key),(Object)(__ref._createb4xcacheitem /*b4j.example.b4xcache._b4xcacheitem*/ (null,_value,_key)));
RDebugUtils.currentLine=72417283;
 //BA.debugLineNum = 72417283;BA.debugLine="TrimIfOversize";
__ref._trimifoversize /*String*/ (null);
RDebugUtils.currentLine=72417284;
 //BA.debugLineNum = 72417284;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=72417285;
 //BA.debugLineNum = 72417285;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=72744960;
 //BA.debugLineNum = 72744960;BA.debugLine="Private Sub TrimIfOversize";
RDebugUtils.currentLine=72744961;
 //BA.debugLineNum = 72744961;BA.debugLine="If Data.Size - EternalCounts > mMaxSize Then";
if (__ref._data /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)-__ref._eternalcounts /*int*/ >__ref._mmaxsize /*int*/ ) { 
RDebugUtils.currentLine=72744962;
 //BA.debugLineNum = 72744962;BA.debugLine="Dim values As List = Data.Values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = __ref._data /*b4j.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=72744963;
 //BA.debugLineNum = 72744963;BA.debugLine="values.SortType(\"LastAccessedTime\", True)";
_values.SortType("LastAccessedTime",__c.True);
RDebugUtils.currentLine=72744964;
 //BA.debugLineNum = 72744964;BA.debugLine="Dim NumberOfItemsToRemove As Int = Ceil(mMaxSize";
_numberofitemstoremove = (int) (__c.Ceil(__ref._mmaxsize /*int*/ *__ref._removethreshold /*float*/ ));
RDebugUtils.currentLine=72744965;
 //BA.debugLineNum = 72744965;BA.debugLine="For i = 0 To NumberOfItemsToRemove";
{
final int step5 = 1;
final int limit5 = _numberofitemstoremove;
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=72744966;
 //BA.debugLineNum = 72744966;BA.debugLine="Data.Remove(values.Get(i).As(B4XCacheItem).Key)";
__ref._data /*b4j.example.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(((b4j.example.b4xcache._b4xcacheitem)(_values.Get(_i))).Key /*String*/ ));
 }
};
 };
RDebugUtils.currentLine=72744969;
 //BA.debugLineNum = 72744969;BA.debugLine="End Sub";
return "";
}
public Object  _puteternal(b4j.example.b4xcache __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "puteternal", true))
	 {return ((Object) Debug.delegate(ba, "puteternal", new Object[] {_key,_value}));}
b4j.example.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=72482816;
 //BA.debugLineNum = 72482816;BA.debugLine="Public Sub PutEternal (Key As String, Value As Obj";
RDebugUtils.currentLine=72482817;
 //BA.debugLineNum = 72482817;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=72482818;
 //BA.debugLineNum = 72482818;BA.debugLine="Dim ci As B4XCacheItem = CreateB4XCacheItem(Value";
_ci = __ref._createb4xcacheitem /*b4j.example.b4xcache._b4xcacheitem*/ (null,_value,_key);
RDebugUtils.currentLine=72482819;
 //BA.debugLineNum = 72482819;BA.debugLine="ci.Eternal = True";
_ci.Eternal /*boolean*/  = __c.True;
RDebugUtils.currentLine=72482820;
 //BA.debugLineNum = 72482820;BA.debugLine="ci.LastAccessedTime = 9223372036854775807";
_ci.LastAccessedTime /*long*/  = (long) (9223372036854775807L);
RDebugUtils.currentLine=72482821;
 //BA.debugLineNum = 72482821;BA.debugLine="EternalCounts = EternalCounts + 1";
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ +1);
RDebugUtils.currentLine=72482822;
 //BA.debugLineNum = 72482822;BA.debugLine="Data.Put(Key, ci)";
__ref._data /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_key),(Object)(_ci));
RDebugUtils.currentLine=72482823;
 //BA.debugLineNum = 72482823;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=72482824;
 //BA.debugLineNum = 72482824;BA.debugLine="End Sub";
return null;
}
public String  _remove(b4j.example.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=72548352;
 //BA.debugLineNum = 72548352;BA.debugLine="Public Sub Remove (Key As String)";
RDebugUtils.currentLine=72548353;
 //BA.debugLineNum = 72548353;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=72548354;
 //BA.debugLineNum = 72548354;BA.debugLine="Data.Remove(Key)";
__ref._data /*b4j.example.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_key));
RDebugUtils.currentLine=72548355;
 //BA.debugLineNum = 72548355;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=72810496;
 //BA.debugLineNum = 72810496;BA.debugLine="Public Sub RemoveOldItems (AgeMs As Long)";
RDebugUtils.currentLine=72810497;
 //BA.debugLineNum = 72810497;BA.debugLine="Dim values As List = Data.Values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = __ref._data /*b4j.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=72810498;
 //BA.debugLineNum = 72810498;BA.debugLine="Dim level As Long = DateTime.Now - AgeMs";
_level = (long) (__c.DateTime.getNow()-_agems);
RDebugUtils.currentLine=72810499;
 //BA.debugLineNum = 72810499;BA.debugLine="For Each ci As B4XCacheItem In values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _values;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_ci = (b4j.example.b4xcache._b4xcacheitem)(group3.Get(index3));
RDebugUtils.currentLine=72810500;
 //BA.debugLineNum = 72810500;BA.debugLine="If ci.LastAccessedTime <= level Then";
if (_ci.LastAccessedTime /*long*/ <=_level) { 
RDebugUtils.currentLine=72810501;
 //BA.debugLineNum = 72810501;BA.debugLine="Data.Remove(ci.Key)";
__ref._data /*b4j.example.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_ci.Key /*String*/ ));
 };
 }
};
RDebugUtils.currentLine=72810504;
 //BA.debugLineNum = 72810504;BA.debugLine="End Sub";
return "";
}
public String  _setmaxsize(b4j.example.b4xcache __ref,int _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "setmaxsize", true))
	 {return ((String) Debug.delegate(ba, "setmaxsize", new Object[] {_s}));}
RDebugUtils.currentLine=72220672;
 //BA.debugLineNum = 72220672;BA.debugLine="Public Sub setMaxSize(s As Int)";
RDebugUtils.currentLine=72220673;
 //BA.debugLineNum = 72220673;BA.debugLine="mMaxSize = s";
__ref._mmaxsize /*int*/  = _s;
RDebugUtils.currentLine=72220674;
 //BA.debugLineNum = 72220674;BA.debugLine="TrimIfOversize";
__ref._trimifoversize /*String*/ (null);
RDebugUtils.currentLine=72220675;
 //BA.debugLineNum = 72220675;BA.debugLine="End Sub";
return "";
}
public int  _size(b4j.example.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "size", true))
	 {return ((Integer) Debug.delegate(ba, "size", null));}
RDebugUtils.currentLine=72876032;
 //BA.debugLineNum = 72876032;BA.debugLine="Public Sub Size As Int";
RDebugUtils.currentLine=72876033;
 //BA.debugLineNum = 72876033;BA.debugLine="Return Data.Size";
if (true) return __ref._data /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null);
RDebugUtils.currentLine=72876034;
 //BA.debugLineNum = 72876034;BA.debugLine="End Sub";
return 0;
}
}