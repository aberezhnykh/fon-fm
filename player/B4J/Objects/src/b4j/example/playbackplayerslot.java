package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbackplayerslot extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbackplayerslot", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbackplayerslot.class).invoke(this, new Object[] {null});
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
public String _slotid = "";
public String _audiokey = "";
public String _role = "";
public String _state = "";
public anywheresoftware.b4a.objects.collections.Map _item = null;
public long _lastprogressat = 0L;
public long _laststatechangedat = 0L;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public boolean  _hasitem(b4j.example.playbackplayerslot __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackplayerslot";
if (Debug.shouldDelegate(ba, "hasitem", false))
	 {return ((Boolean) Debug.delegate(ba, "hasitem", null));}
RDebugUtils.currentLine=49807360;
 //BA.debugLineNum = 49807360;BA.debugLine="Public Sub HasItem As Boolean";
RDebugUtils.currentLine=49807361;
 //BA.debugLineNum = 49807361;BA.debugLine="Return Item.IsInitialized And Item.Size > 0";
if (true) return __ref._item /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._item /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0;
RDebugUtils.currentLine=49807362;
 //BA.debugLineNum = 49807362;BA.debugLine="End Sub";
return false;
}
public String  _markprogress(b4j.example.playbackplayerslot __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackplayerslot";
if (Debug.shouldDelegate(ba, "markprogress", false))
	 {return ((String) Debug.delegate(ba, "markprogress", null));}
RDebugUtils.currentLine=49741824;
 //BA.debugLineNum = 49741824;BA.debugLine="Public Sub MarkProgress";
RDebugUtils.currentLine=49741825;
 //BA.debugLineNum = 49741825;BA.debugLine="LastProgressAt = DateTime.Now";
__ref._lastprogressat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=49741826;
 //BA.debugLineNum = 49741826;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackplayerslot __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackplayerslot";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=49479680;
 //BA.debugLineNum = 49479680;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=49479681;
 //BA.debugLineNum = 49479681;BA.debugLine="Role = \"free\"";
__ref._role /*String*/  = "free";
RDebugUtils.currentLine=49479682;
 //BA.debugLineNum = 49479682;BA.debugLine="State = \"empty\"";
__ref._state /*String*/  = "empty";
RDebugUtils.currentLine=49479683;
 //BA.debugLineNum = 49479683;BA.debugLine="LastProgressAt = 0";
__ref._lastprogressat /*long*/  = (long) (0);
RDebugUtils.currentLine=49479684;
 //BA.debugLineNum = 49479684;BA.debugLine="LastStateChangedAt = DateTime.Now";
__ref._laststatechangedat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=49479685;
 //BA.debugLineNum = 49479685;BA.debugLine="Item.Initialize";
__ref._item /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=49479686;
 //BA.debugLineNum = 49479686;BA.debugLine="End Sub";
return "";
}
public String  _setrolestate(b4j.example.playbackplayerslot __ref,String _rolevalue,String _statevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackplayerslot";
if (Debug.shouldDelegate(ba, "setrolestate", false))
	 {return ((String) Debug.delegate(ba, "setrolestate", new Object[] {_rolevalue,_statevalue}));}
RDebugUtils.currentLine=49545216;
 //BA.debugLineNum = 49545216;BA.debugLine="Public Sub SetRoleState(roleValue As String, state";
RDebugUtils.currentLine=49545217;
 //BA.debugLineNum = 49545217;BA.debugLine="Role = roleValue";
__ref._role /*String*/  = _rolevalue;
RDebugUtils.currentLine=49545218;
 //BA.debugLineNum = 49545218;BA.debugLine="State = stateValue";
__ref._state /*String*/  = _statevalue;
RDebugUtils.currentLine=49545219;
 //BA.debugLineNum = 49545219;BA.debugLine="LastStateChangedAt = DateTime.Now";
__ref._laststatechangedat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=49545220;
 //BA.debugLineNum = 49545220;BA.debugLine="End Sub";
return "";
}
public String  _setitem(b4j.example.playbackplayerslot __ref,anywheresoftware.b4a.objects.collections.Map _sourceitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackplayerslot";
if (Debug.shouldDelegate(ba, "setitem", false))
	 {return ((String) Debug.delegate(ba, "setitem", new Object[] {_sourceitem}));}
RDebugUtils.currentLine=49610752;
 //BA.debugLineNum = 49610752;BA.debugLine="Public Sub SetItem(sourceItem As Map)";
RDebugUtils.currentLine=49610753;
 //BA.debugLineNum = 49610753;BA.debugLine="Item = CloneStateMap(sourceItem)";
__ref._item /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sourceitem);
RDebugUtils.currentLine=49610754;
 //BA.debugLineNum = 49610754;BA.debugLine="LastStateChangedAt = DateTime.Now";
__ref._laststatechangedat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=49610755;
 //BA.debugLineNum = 49610755;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackplayerslot __ref,anywheresoftware.b4a.BA _ba,String _slotidvalue,String _audiokeyvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackplayerslot";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_slotidvalue,_audiokeyvalue}));}
RDebugUtils.currentLine=49414144;
 //BA.debugLineNum = 49414144;BA.debugLine="Public Sub Initialize(slotIdValue As String, audio";
RDebugUtils.currentLine=49414145;
 //BA.debugLineNum = 49414145;BA.debugLine="SlotId = slotIdValue";
__ref._slotid /*String*/  = _slotidvalue;
RDebugUtils.currentLine=49414146;
 //BA.debugLineNum = 49414146;BA.debugLine="AudioKey = audioKeyValue";
__ref._audiokey /*String*/  = _audiokeyvalue;
RDebugUtils.currentLine=49414147;
 //BA.debugLineNum = 49414147;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=49414148;
 //BA.debugLineNum = 49414148;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbackplayerslot __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackplayerslot";
RDebugUtils.currentLine=49348608;
 //BA.debugLineNum = 49348608;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=49348609;
 //BA.debugLineNum = 49348609;BA.debugLine="Public SlotId As String";
_slotid = "";
RDebugUtils.currentLine=49348610;
 //BA.debugLineNum = 49348610;BA.debugLine="Public AudioKey As String";
_audiokey = "";
RDebugUtils.currentLine=49348611;
 //BA.debugLineNum = 49348611;BA.debugLine="Public Role As String";
_role = "";
RDebugUtils.currentLine=49348612;
 //BA.debugLineNum = 49348612;BA.debugLine="Public State As String";
_state = "";
RDebugUtils.currentLine=49348613;
 //BA.debugLineNum = 49348613;BA.debugLine="Public Item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49348614;
 //BA.debugLineNum = 49348614;BA.debugLine="Public LastProgressAt As Long";
_lastprogressat = 0L;
RDebugUtils.currentLine=49348615;
 //BA.debugLineNum = 49348615;BA.debugLine="Public LastStateChangedAt As Long";
_laststatechangedat = 0L;
RDebugUtils.currentLine=49348616;
 //BA.debugLineNum = 49348616;BA.debugLine="End Sub";
return "";
}
public String  _clearitem(b4j.example.playbackplayerslot __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackplayerslot";
if (Debug.shouldDelegate(ba, "clearitem", false))
	 {return ((String) Debug.delegate(ba, "clearitem", null));}
RDebugUtils.currentLine=49676288;
 //BA.debugLineNum = 49676288;BA.debugLine="Public Sub ClearItem";
RDebugUtils.currentLine=49676289;
 //BA.debugLineNum = 49676289;BA.debugLine="Item.Initialize";
__ref._item /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=49676290;
 //BA.debugLineNum = 49676290;BA.debugLine="LastStateChangedAt = DateTime.Now";
__ref._laststatechangedat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=49676291;
 //BA.debugLineNum = 49676291;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonestatemap(b4j.example.playbackplayerslot __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackplayerslot";
if (Debug.shouldDelegate(ba, "clonestatemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonestatemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _cloned = null;
Object _key = null;
RDebugUtils.currentLine=49872896;
 //BA.debugLineNum = 49872896;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
RDebugUtils.currentLine=49872897;
 //BA.debugLineNum = 49872897;BA.debugLine="Dim cloned As Map";
_cloned = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49872898;
 //BA.debugLineNum = 49872898;BA.debugLine="cloned.Initialize";
_cloned.Initialize();
RDebugUtils.currentLine=49872899;
 //BA.debugLineNum = 49872899;BA.debugLine="If source.IsInitialized = False Then Return clone";
if (_source.IsInitialized()==__c.False) { 
if (true) return _cloned;};
RDebugUtils.currentLine=49872900;
 //BA.debugLineNum = 49872900;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=49872901;
 //BA.debugLineNum = 49872901;BA.debugLine="cloned.Put(key, source.Get(key))";
_cloned.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=49872903;
 //BA.debugLineNum = 49872903;BA.debugLine="Return cloned";
if (true) return _cloned;
RDebugUtils.currentLine=49872904;
 //BA.debugLineNum = 49872904;BA.debugLine="End Sub";
return null;
}
}