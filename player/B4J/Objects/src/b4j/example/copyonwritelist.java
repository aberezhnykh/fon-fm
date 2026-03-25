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
RDebugUtils.currentLine=75890688;
 //BA.debugLineNum = 75890688;BA.debugLine="Public Sub Add (Item As Object)";
RDebugUtils.currentLine=75890689;
 //BA.debugLineNum = 75890689;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=75890690;
 //BA.debugLineNum = 75890690;BA.debugLine="InternalList.Add(Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Add(_item);
RDebugUtils.currentLine=75890691;
 //BA.debugLineNum = 75890691;BA.debugLine="End Sub";
return "";
}
public String  _makecopy(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "makecopy", true))
	 {return ((String) Debug.delegate(ba, "makecopy", null));}
RDebugUtils.currentLine=75825152;
 //BA.debugLineNum = 75825152;BA.debugLine="Private Sub MakeCopy";
RDebugUtils.currentLine=75825153;
 //BA.debugLineNum = 75825153;BA.debugLine="InternalList = B4XCollections.CreateList(Internal";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/  = _b4xcollections._createlist /*anywheresoftware.b4a.objects.collections.List*/ (__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=75825154;
 //BA.debugLineNum = 75825154;BA.debugLine="End Sub";
return "";
}
public String  _addall(b4j.example.copyonwritelist __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "addall", true))
	 {return ((String) Debug.delegate(ba, "addall", new Object[] {_items}));}
RDebugUtils.currentLine=76349440;
 //BA.debugLineNum = 76349440;BA.debugLine="Public Sub AddAll (Items As List)";
RDebugUtils.currentLine=76349441;
 //BA.debugLineNum = 76349441;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=76349442;
 //BA.debugLineNum = 76349442;BA.debugLine="InternalList.AddAll(Items)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_items);
RDebugUtils.currentLine=76349443;
 //BA.debugLineNum = 76349443;BA.debugLine="End Sub";
return "";
}
public String  _addallat(b4j.example.copyonwritelist __ref,int _index,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "addallat", true))
	 {return ((String) Debug.delegate(ba, "addallat", new Object[] {_index,_items}));}
RDebugUtils.currentLine=76414976;
 //BA.debugLineNum = 76414976;BA.debugLine="Public Sub AddAllAt (Index As Int, Items As List)";
RDebugUtils.currentLine=76414977;
 //BA.debugLineNum = 76414977;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=76414978;
 //BA.debugLineNum = 76414978;BA.debugLine="InternalList.AddAllAt(Index, Items)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .AddAllAt(_index,_items);
RDebugUtils.currentLine=76414979;
 //BA.debugLineNum = 76414979;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
RDebugUtils.currentLine=75694080;
 //BA.debugLineNum = 75694080;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=75694081;
 //BA.debugLineNum = 75694081;BA.debugLine="Private InternalList As List";
_internallist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=75694082;
 //BA.debugLineNum = 75694082;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=76021760;
 //BA.debugLineNum = 76021760;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=76021761;
 //BA.debugLineNum = 76021761;BA.debugLine="Dim InternalList As List";
_internallist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=76021762;
 //BA.debugLineNum = 76021762;BA.debugLine="InternalList.Initialize";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=76021763;
 //BA.debugLineNum = 76021763;BA.debugLine="End Sub";
return "";
}
public boolean  _get(b4j.example.copyonwritelist __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Boolean) Debug.delegate(ba, "get", new Object[] {_index}));}
RDebugUtils.currentLine=76087296;
 //BA.debugLineNum = 76087296;BA.debugLine="Public Sub Get (Index As Int) As Boolean";
RDebugUtils.currentLine=76087297;
 //BA.debugLineNum = 76087297;BA.debugLine="Return InternalList.Get(Index)";
if (true) return BA.ObjectToBoolean(__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=76087298;
 //BA.debugLineNum = 76087298;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _getlist(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "getlist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getlist", null));}
RDebugUtils.currentLine=76808192;
 //BA.debugLineNum = 76808192;BA.debugLine="Public Sub GetList As List";
RDebugUtils.currentLine=76808193;
 //BA.debugLineNum = 76808193;BA.debugLine="Return InternalList";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=76808194;
 //BA.debugLineNum = 76808194;BA.debugLine="End Sub";
return null;
}
public int  _getsize(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=76218368;
 //BA.debugLineNum = 76218368;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=76218369;
 //BA.debugLineNum = 76218369;BA.debugLine="Return InternalList.Size";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=76218370;
 //BA.debugLineNum = 76218370;BA.debugLine="End Sub";
return 0;
}
public int  _indexof(b4j.example.copyonwritelist __ref,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "indexof", true))
	 {return ((Integer) Debug.delegate(ba, "indexof", new Object[] {_item}));}
RDebugUtils.currentLine=76480512;
 //BA.debugLineNum = 76480512;BA.debugLine="Public Sub IndexOf (Item As Object) As Int";
RDebugUtils.currentLine=76480513;
 //BA.debugLineNum = 76480513;BA.debugLine="Return InternalList.IndexOf(Item)";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_item);
RDebugUtils.currentLine=76480514;
 //BA.debugLineNum = 76480514;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.example.copyonwritelist __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _initialitems) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_initialitems}));}
RDebugUtils.currentLine=75759616;
 //BA.debugLineNum = 75759616;BA.debugLine="Public Sub Initialize (InitialItems As List)";
RDebugUtils.currentLine=75759617;
 //BA.debugLineNum = 75759617;BA.debugLine="InternalList = B4XCollections.CreateList(InitialI";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/  = _b4xcollections._createlist /*anywheresoftware.b4a.objects.collections.List*/ (_initialitems);
RDebugUtils.currentLine=75759618;
 //BA.debugLineNum = 75759618;BA.debugLine="End Sub";
return "";
}
public String  _insertat(b4j.example.copyonwritelist __ref,int _index,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "insertat", true))
	 {return ((String) Debug.delegate(ba, "insertat", new Object[] {_index,_item}));}
RDebugUtils.currentLine=76283904;
 //BA.debugLineNum = 76283904;BA.debugLine="Public Sub InsertAt (Index As Int, Item As Object)";
RDebugUtils.currentLine=76283905;
 //BA.debugLineNum = 76283905;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=76283906;
 //BA.debugLineNum = 76283906;BA.debugLine="InternalList.InsertAt(Index, Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_index,_item);
RDebugUtils.currentLine=76283907;
 //BA.debugLineNum = 76283907;BA.debugLine="End Sub";
return "";
}
public String  _removeat(b4j.example.copyonwritelist __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "removeat", true))
	 {return ((String) Debug.delegate(ba, "removeat", new Object[] {_index}));}
RDebugUtils.currentLine=75956224;
 //BA.debugLineNum = 75956224;BA.debugLine="Public Sub RemoveAt (Index As Int)";
RDebugUtils.currentLine=75956225;
 //BA.debugLineNum = 75956225;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=75956226;
 //BA.debugLineNum = 75956226;BA.debugLine="InternalList.RemoveAt(Index)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=75956227;
 //BA.debugLineNum = 75956227;BA.debugLine="End Sub";
return "";
}
public String  _set(b4j.example.copyonwritelist __ref,int _index,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_index,_item}));}
RDebugUtils.currentLine=76152832;
 //BA.debugLineNum = 76152832;BA.debugLine="Public Sub Set (Index As Int, Item As Object)";
RDebugUtils.currentLine=76152833;
 //BA.debugLineNum = 76152833;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=76152834;
 //BA.debugLineNum = 76152834;BA.debugLine="InternalList.Set(Index, Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Set(_index,_item);
RDebugUtils.currentLine=76152835;
 //BA.debugLineNum = 76152835;BA.debugLine="End Sub";
return "";
}
public String  _sort(b4j.example.copyonwritelist __ref,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sort", true))
	 {return ((String) Debug.delegate(ba, "sort", new Object[] {_ascending}));}
RDebugUtils.currentLine=76546048;
 //BA.debugLineNum = 76546048;BA.debugLine="Public Sub Sort (Ascending As Boolean)";
RDebugUtils.currentLine=76546049;
 //BA.debugLineNum = 76546049;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=76546050;
 //BA.debugLineNum = 76546050;BA.debugLine="InternalList.Sort(Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Sort(_ascending);
RDebugUtils.currentLine=76546051;
 //BA.debugLineNum = 76546051;BA.debugLine="End Sub";
return "";
}
public String  _sortcaseinsensitive(b4j.example.copyonwritelist __ref,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sortcaseinsensitive", true))
	 {return ((String) Debug.delegate(ba, "sortcaseinsensitive", new Object[] {_ascending}));}
RDebugUtils.currentLine=76611584;
 //BA.debugLineNum = 76611584;BA.debugLine="Public Sub SortCaseInsensitive (Ascending As Boole";
RDebugUtils.currentLine=76611585;
 //BA.debugLineNum = 76611585;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=76611586;
 //BA.debugLineNum = 76611586;BA.debugLine="InternalList.SortCaseInsensitive(Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortCaseInsensitive(_ascending);
RDebugUtils.currentLine=76611587;
 //BA.debugLineNum = 76611587;BA.debugLine="End Sub";
return "";
}
public String  _sorttype(b4j.example.copyonwritelist __ref,String _fieldname,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sorttype", true))
	 {return ((String) Debug.delegate(ba, "sorttype", new Object[] {_fieldname,_ascending}));}
RDebugUtils.currentLine=76677120;
 //BA.debugLineNum = 76677120;BA.debugLine="Public Sub SortType (FieldName As String, Ascendin";
RDebugUtils.currentLine=76677121;
 //BA.debugLineNum = 76677121;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=76677122;
 //BA.debugLineNum = 76677122;BA.debugLine="InternalList.SortType(FieldName, Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortType(_fieldname,_ascending);
RDebugUtils.currentLine=76677123;
 //BA.debugLineNum = 76677123;BA.debugLine="End Sub";
return "";
}
public String  _sorttypecaseinsensitive(b4j.example.copyonwritelist __ref,String _fieldname,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sorttypecaseinsensitive", true))
	 {return ((String) Debug.delegate(ba, "sorttypecaseinsensitive", new Object[] {_fieldname,_ascending}));}
RDebugUtils.currentLine=76742656;
 //BA.debugLineNum = 76742656;BA.debugLine="Public Sub SortTypeCaseInsensitive (FieldName As S";
RDebugUtils.currentLine=76742657;
 //BA.debugLineNum = 76742657;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=76742658;
 //BA.debugLineNum = 76742658;BA.debugLine="InternalList.SortTypeCaseInsensitive(FieldName, A";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortTypeCaseInsensitive(_fieldname,_ascending);
RDebugUtils.currentLine=76742659;
 //BA.debugLineNum = 76742659;BA.debugLine="End Sub";
return "";
}
}