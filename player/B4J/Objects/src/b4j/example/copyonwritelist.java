package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class copyonwritelist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.copyonwritelist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.copyonwritelist.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _internallist = null;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _add(b4j.example.copyonwritelist __ref,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "add", true))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_item}));}
RDebugUtils.currentLine=74252288;
 //BA.debugLineNum = 74252288;BA.debugLine="Public Sub Add (Item As Object)";
RDebugUtils.currentLine=74252289;
 //BA.debugLineNum = 74252289;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=74252290;
 //BA.debugLineNum = 74252290;BA.debugLine="InternalList.Add(Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Add(_item);
RDebugUtils.currentLine=74252291;
 //BA.debugLineNum = 74252291;BA.debugLine="End Sub";
return "";
}
public String  _makecopy(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "makecopy", true))
	 {return ((String) Debug.delegate(ba, "makecopy", null));}
RDebugUtils.currentLine=74186752;
 //BA.debugLineNum = 74186752;BA.debugLine="Private Sub MakeCopy";
RDebugUtils.currentLine=74186753;
 //BA.debugLineNum = 74186753;BA.debugLine="InternalList = B4XCollections.CreateList(Internal";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/  = _b4xcollections._createlist /*anywheresoftware.b4a.objects.collections.List*/ (__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=74186754;
 //BA.debugLineNum = 74186754;BA.debugLine="End Sub";
return "";
}
public String  _addall(b4j.example.copyonwritelist __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "addall", true))
	 {return ((String) Debug.delegate(ba, "addall", new Object[] {_items}));}
RDebugUtils.currentLine=74711040;
 //BA.debugLineNum = 74711040;BA.debugLine="Public Sub AddAll (Items As List)";
RDebugUtils.currentLine=74711041;
 //BA.debugLineNum = 74711041;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=74711042;
 //BA.debugLineNum = 74711042;BA.debugLine="InternalList.AddAll(Items)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_items);
RDebugUtils.currentLine=74711043;
 //BA.debugLineNum = 74711043;BA.debugLine="End Sub";
return "";
}
public String  _addallat(b4j.example.copyonwritelist __ref,int _index,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "addallat", true))
	 {return ((String) Debug.delegate(ba, "addallat", new Object[] {_index,_items}));}
RDebugUtils.currentLine=74776576;
 //BA.debugLineNum = 74776576;BA.debugLine="Public Sub AddAllAt (Index As Int, Items As List)";
RDebugUtils.currentLine=74776577;
 //BA.debugLineNum = 74776577;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=74776578;
 //BA.debugLineNum = 74776578;BA.debugLine="InternalList.AddAllAt(Index, Items)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .AddAllAt(_index,_items);
RDebugUtils.currentLine=74776579;
 //BA.debugLineNum = 74776579;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
RDebugUtils.currentLine=74055680;
 //BA.debugLineNum = 74055680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=74055681;
 //BA.debugLineNum = 74055681;BA.debugLine="Private InternalList As List";
_internallist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=74055682;
 //BA.debugLineNum = 74055682;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=74383360;
 //BA.debugLineNum = 74383360;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=74383361;
 //BA.debugLineNum = 74383361;BA.debugLine="Dim InternalList As List";
_internallist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=74383362;
 //BA.debugLineNum = 74383362;BA.debugLine="InternalList.Initialize";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=74383363;
 //BA.debugLineNum = 74383363;BA.debugLine="End Sub";
return "";
}
public boolean  _get(b4j.example.copyonwritelist __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Boolean) Debug.delegate(ba, "get", new Object[] {_index}));}
RDebugUtils.currentLine=74448896;
 //BA.debugLineNum = 74448896;BA.debugLine="Public Sub Get (Index As Int) As Boolean";
RDebugUtils.currentLine=74448897;
 //BA.debugLineNum = 74448897;BA.debugLine="Return InternalList.Get(Index)";
if (true) return BA.ObjectToBoolean(__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=74448898;
 //BA.debugLineNum = 74448898;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _getlist(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "getlist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getlist", null));}
RDebugUtils.currentLine=75169792;
 //BA.debugLineNum = 75169792;BA.debugLine="Public Sub GetList As List";
RDebugUtils.currentLine=75169793;
 //BA.debugLineNum = 75169793;BA.debugLine="Return InternalList";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=75169794;
 //BA.debugLineNum = 75169794;BA.debugLine="End Sub";
return null;
}
public int  _getsize(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=74579968;
 //BA.debugLineNum = 74579968;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=74579969;
 //BA.debugLineNum = 74579969;BA.debugLine="Return InternalList.Size";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=74579970;
 //BA.debugLineNum = 74579970;BA.debugLine="End Sub";
return 0;
}
public int  _indexof(b4j.example.copyonwritelist __ref,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "indexof", true))
	 {return ((Integer) Debug.delegate(ba, "indexof", new Object[] {_item}));}
RDebugUtils.currentLine=74842112;
 //BA.debugLineNum = 74842112;BA.debugLine="Public Sub IndexOf (Item As Object) As Int";
RDebugUtils.currentLine=74842113;
 //BA.debugLineNum = 74842113;BA.debugLine="Return InternalList.IndexOf(Item)";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_item);
RDebugUtils.currentLine=74842114;
 //BA.debugLineNum = 74842114;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.example.copyonwritelist __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _initialitems) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_initialitems}));}
RDebugUtils.currentLine=74121216;
 //BA.debugLineNum = 74121216;BA.debugLine="Public Sub Initialize (InitialItems As List)";
RDebugUtils.currentLine=74121217;
 //BA.debugLineNum = 74121217;BA.debugLine="InternalList = B4XCollections.CreateList(InitialI";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/  = _b4xcollections._createlist /*anywheresoftware.b4a.objects.collections.List*/ (_initialitems);
RDebugUtils.currentLine=74121218;
 //BA.debugLineNum = 74121218;BA.debugLine="End Sub";
return "";
}
public String  _insertat(b4j.example.copyonwritelist __ref,int _index,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "insertat", true))
	 {return ((String) Debug.delegate(ba, "insertat", new Object[] {_index,_item}));}
RDebugUtils.currentLine=74645504;
 //BA.debugLineNum = 74645504;BA.debugLine="Public Sub InsertAt (Index As Int, Item As Object)";
RDebugUtils.currentLine=74645505;
 //BA.debugLineNum = 74645505;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=74645506;
 //BA.debugLineNum = 74645506;BA.debugLine="InternalList.InsertAt(Index, Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_index,_item);
RDebugUtils.currentLine=74645507;
 //BA.debugLineNum = 74645507;BA.debugLine="End Sub";
return "";
}
public String  _removeat(b4j.example.copyonwritelist __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "removeat", true))
	 {return ((String) Debug.delegate(ba, "removeat", new Object[] {_index}));}
RDebugUtils.currentLine=74317824;
 //BA.debugLineNum = 74317824;BA.debugLine="Public Sub RemoveAt (Index As Int)";
RDebugUtils.currentLine=74317825;
 //BA.debugLineNum = 74317825;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=74317826;
 //BA.debugLineNum = 74317826;BA.debugLine="InternalList.RemoveAt(Index)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=74317827;
 //BA.debugLineNum = 74317827;BA.debugLine="End Sub";
return "";
}
public String  _set(b4j.example.copyonwritelist __ref,int _index,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_index,_item}));}
RDebugUtils.currentLine=74514432;
 //BA.debugLineNum = 74514432;BA.debugLine="Public Sub Set (Index As Int, Item As Object)";
RDebugUtils.currentLine=74514433;
 //BA.debugLineNum = 74514433;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=74514434;
 //BA.debugLineNum = 74514434;BA.debugLine="InternalList.Set(Index, Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Set(_index,_item);
RDebugUtils.currentLine=74514435;
 //BA.debugLineNum = 74514435;BA.debugLine="End Sub";
return "";
}
public String  _sort(b4j.example.copyonwritelist __ref,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sort", true))
	 {return ((String) Debug.delegate(ba, "sort", new Object[] {_ascending}));}
RDebugUtils.currentLine=74907648;
 //BA.debugLineNum = 74907648;BA.debugLine="Public Sub Sort (Ascending As Boolean)";
RDebugUtils.currentLine=74907649;
 //BA.debugLineNum = 74907649;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=74907650;
 //BA.debugLineNum = 74907650;BA.debugLine="InternalList.Sort(Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Sort(_ascending);
RDebugUtils.currentLine=74907651;
 //BA.debugLineNum = 74907651;BA.debugLine="End Sub";
return "";
}
public String  _sortcaseinsensitive(b4j.example.copyonwritelist __ref,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sortcaseinsensitive", true))
	 {return ((String) Debug.delegate(ba, "sortcaseinsensitive", new Object[] {_ascending}));}
RDebugUtils.currentLine=74973184;
 //BA.debugLineNum = 74973184;BA.debugLine="Public Sub SortCaseInsensitive (Ascending As Boole";
RDebugUtils.currentLine=74973185;
 //BA.debugLineNum = 74973185;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=74973186;
 //BA.debugLineNum = 74973186;BA.debugLine="InternalList.SortCaseInsensitive(Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortCaseInsensitive(_ascending);
RDebugUtils.currentLine=74973187;
 //BA.debugLineNum = 74973187;BA.debugLine="End Sub";
return "";
}
public String  _sorttype(b4j.example.copyonwritelist __ref,String _fieldname,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sorttype", true))
	 {return ((String) Debug.delegate(ba, "sorttype", new Object[] {_fieldname,_ascending}));}
RDebugUtils.currentLine=75038720;
 //BA.debugLineNum = 75038720;BA.debugLine="Public Sub SortType (FieldName As String, Ascendin";
RDebugUtils.currentLine=75038721;
 //BA.debugLineNum = 75038721;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=75038722;
 //BA.debugLineNum = 75038722;BA.debugLine="InternalList.SortType(FieldName, Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortType(_fieldname,_ascending);
RDebugUtils.currentLine=75038723;
 //BA.debugLineNum = 75038723;BA.debugLine="End Sub";
return "";
}
public String  _sorttypecaseinsensitive(b4j.example.copyonwritelist __ref,String _fieldname,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sorttypecaseinsensitive", true))
	 {return ((String) Debug.delegate(ba, "sorttypecaseinsensitive", new Object[] {_fieldname,_ascending}));}
RDebugUtils.currentLine=75104256;
 //BA.debugLineNum = 75104256;BA.debugLine="Public Sub SortTypeCaseInsensitive (FieldName As S";
RDebugUtils.currentLine=75104257;
 //BA.debugLineNum = 75104257;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=75104258;
 //BA.debugLineNum = 75104258;BA.debugLine="InternalList.SortTypeCaseInsensitive(FieldName, A";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortTypeCaseInsensitive(_fieldname,_ascending);
RDebugUtils.currentLine=75104259;
 //BA.debugLineNum = 75104259;BA.debugLine="End Sub";
return "";
}
}