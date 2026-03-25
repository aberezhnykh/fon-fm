package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xbitset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xbitset", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xbitset.class).invoke(this, new Object[] {null});
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
public int[] _data = null;
public int _msize = 0;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _class_globals(b4j.example.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
RDebugUtils.currentLine=68943872;
 //BA.debugLineNum = 68943872;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=68943876;
 //BA.debugLineNum = 68943876;BA.debugLine="Private data() As Int";
_data = new int[(int) (0)];
;
RDebugUtils.currentLine=68943878;
 //BA.debugLineNum = 68943878;BA.debugLine="Private mSize As Int";
_msize = 0;
RDebugUtils.currentLine=68943879;
 //BA.debugLineNum = 68943879;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=69271552;
 //BA.debugLineNum = 69271552;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=69271556;
 //BA.debugLineNum = 69271556;BA.debugLine="Dim data(Bit.ShiftRight(mSize, 5) + 1) As Int";
_data = new int[(int) (__c.Bit.ShiftRight(__ref._msize /*int*/ ,(int) (5))+1)];
;
RDebugUtils.currentLine=69271558;
 //BA.debugLineNum = 69271558;BA.debugLine="End Sub";
return "";
}
public boolean  _get(b4j.example.b4xbitset __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Boolean) Debug.delegate(ba, "get", new Object[] {_index}));}
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
RDebugUtils.currentLine=69140480;
 //BA.debugLineNum = 69140480;BA.debugLine="Public Sub Get(Index As Int) As Boolean";
RDebugUtils.currentLine=69140481;
 //BA.debugLineNum = 69140481;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = __c.Bit.ShiftRight(_index,(int) (5));
RDebugUtils.currentLine=69140482;
 //BA.debugLineNum = 69140482;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = __c.Bit.And(((int)0x0000001f),_index);
RDebugUtils.currentLine=69140486;
 //BA.debugLineNum = 69140486;BA.debugLine="Dim BlockValue As Int = data(dindex)";
_blockvalue = __ref._data /*int[]*/ [_dindex];
RDebugUtils.currentLine=69140488;
 //BA.debugLineNum = 69140488;BA.debugLine="Return Bit.And(BlockValue, Bit.ShiftLeft(1, offse";
if (true) return __c.Bit.And(_blockvalue,__c.Bit.ShiftLeft((int) (1),_offset))!=0;
RDebugUtils.currentLine=69140489;
 //BA.debugLineNum = 69140489;BA.debugLine="End Sub";
return false;
}
public int  _getsize(b4j.example.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=69206016;
 //BA.debugLineNum = 69206016;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=69206017;
 //BA.debugLineNum = 69206017;BA.debugLine="Return mSize";
if (true) return __ref._msize /*int*/ ;
RDebugUtils.currentLine=69206018;
 //BA.debugLineNum = 69206018;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.example.b4xbitset __ref,anywheresoftware.b4a.BA _ba,int _size) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_size}));}
RDebugUtils.currentLine=69009408;
 //BA.debugLineNum = 69009408;BA.debugLine="Public Sub Initialize (Size As Int)";
RDebugUtils.currentLine=69009409;
 //BA.debugLineNum = 69009409;BA.debugLine="mSize = Size";
__ref._msize /*int*/  = _size;
RDebugUtils.currentLine=69009410;
 //BA.debugLineNum = 69009410;BA.debugLine="Clear";
__ref._clear /*String*/ (null);
RDebugUtils.currentLine=69009411;
 //BA.debugLineNum = 69009411;BA.debugLine="End Sub";
return "";
}
public String  _set(b4j.example.b4xbitset __ref,int _index,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_index,_value}));}
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
int _newblockvalue = 0;
RDebugUtils.currentLine=69074944;
 //BA.debugLineNum = 69074944;BA.debugLine="Public Sub Set(Index As Int, Value As Boolean)";
RDebugUtils.currentLine=69074945;
 //BA.debugLineNum = 69074945;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = __c.Bit.ShiftRight(_index,(int) (5));
RDebugUtils.currentLine=69074946;
 //BA.debugLineNum = 69074946;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = __c.Bit.And(((int)0x0000001f),_index);
RDebugUtils.currentLine=69074950;
 //BA.debugLineNum = 69074950;BA.debugLine="Dim BlockValue As Int = data(dindex)";
_blockvalue = __ref._data /*int[]*/ [_dindex];
RDebugUtils.currentLine=69074952;
 //BA.debugLineNum = 69074952;BA.debugLine="Dim NewBlockValue As Int";
_newblockvalue = 0;
RDebugUtils.currentLine=69074953;
 //BA.debugLineNum = 69074953;BA.debugLine="If Value Then";
if (_value) { 
RDebugUtils.currentLine=69074954;
 //BA.debugLineNum = 69074954;BA.debugLine="NewBlockValue = Bit.Or(BlockValue, Bit.ShiftLeft";
_newblockvalue = __c.Bit.Or(_blockvalue,__c.Bit.ShiftLeft((int) (1),_offset));
 }else {
RDebugUtils.currentLine=69074956;
 //BA.debugLineNum = 69074956;BA.debugLine="NewBlockValue = Bit.And(BlockValue, Bit.Not(Bit.";
_newblockvalue = __c.Bit.And(_blockvalue,__c.Bit.Not(__c.Bit.ShiftLeft((int) (1),_offset)));
 };
RDebugUtils.currentLine=69074961;
 //BA.debugLineNum = 69074961;BA.debugLine="data(dindex) = NewBlockValue";
__ref._data /*int[]*/ [_dindex] = _newblockvalue;
RDebugUtils.currentLine=69074963;
 //BA.debugLineNum = 69074963;BA.debugLine="End Sub";
return "";
}
}