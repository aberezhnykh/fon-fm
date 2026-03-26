package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playbackplayerslot extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playbackplayerslot");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playbackplayerslot.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _slotid = "";
public String _audiokey = "";
public String _role = "";
public String _state = "";
public anywheresoftware.b4a.objects.collections.Map _item = null;
public long _lastprogressat = 0L;
public long _laststatechangedat = 0L;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public SlotId As String";
_slotid = "";
 //BA.debugLineNum = 7;BA.debugLine="Public AudioKey As String";
_audiokey = "";
 //BA.debugLineNum = 8;BA.debugLine="Public Role As String";
_role = "";
 //BA.debugLineNum = 9;BA.debugLine="Public State As String";
_state = "";
 //BA.debugLineNum = 10;BA.debugLine="Public Item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Public LastProgressAt As Long";
_lastprogressat = 0L;
 //BA.debugLineNum = 12;BA.debugLine="Public LastStateChangedAt As Long";
_laststatechangedat = 0L;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _clearitem() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub ClearItem";
 //BA.debugLineNum = 43;BA.debugLine="Item.Initialize";
_item.Initialize();
 //BA.debugLineNum = 44;BA.debugLine="LastStateChangedAt = DateTime.Now";
_laststatechangedat = __c.DateTime.getNow();
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonestatemap(anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cloned = null;
Object _key = null;
 //BA.debugLineNum = 56;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
 //BA.debugLineNum = 57;BA.debugLine="Dim cloned As Map";
_cloned = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 58;BA.debugLine="cloned.Initialize";
_cloned.Initialize();
 //BA.debugLineNum = 59;BA.debugLine="If source.IsInitialized = False Then Return clone";
if (_source.IsInitialized()==__c.False) { 
if (true) return _cloned;};
 //BA.debugLineNum = 60;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
 //BA.debugLineNum = 61;BA.debugLine="cloned.Put(key, source.Get(key))";
_cloned.Put(_key,_source.Get(_key));
 }
};
 //BA.debugLineNum = 63;BA.debugLine="Return cloned";
if (true) return _cloned;
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public boolean  _hasitem() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub HasItem As Boolean";
 //BA.debugLineNum = 53;BA.debugLine="Return Item.IsInitialized And Item.Size > 0";
if (true) return _item.IsInitialized() && _item.getSize()>0;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _slotidvalue,String _audiokeyvalue) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(slotIdValue As String, audio";
 //BA.debugLineNum = 16;BA.debugLine="SlotId = slotIdValue";
_slotid = _slotidvalue;
 //BA.debugLineNum = 17;BA.debugLine="AudioKey = audioKeyValue";
_audiokey = _audiokeyvalue;
 //BA.debugLineNum = 18;BA.debugLine="Reset";
_reset();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _markprogress() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Public Sub MarkProgress";
 //BA.debugLineNum = 49;BA.debugLine="LastProgressAt = DateTime.Now";
_lastprogressat = __c.DateTime.getNow();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _reset() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Reset";
 //BA.debugLineNum = 23;BA.debugLine="Role = \"free\"";
_role = "free";
 //BA.debugLineNum = 24;BA.debugLine="State = \"empty\"";
_state = "empty";
 //BA.debugLineNum = 25;BA.debugLine="LastProgressAt = 0";
_lastprogressat = (long) (0);
 //BA.debugLineNum = 26;BA.debugLine="LastStateChangedAt = DateTime.Now";
_laststatechangedat = __c.DateTime.getNow();
 //BA.debugLineNum = 27;BA.debugLine="Item.Initialize";
_item.Initialize();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _setitem(anywheresoftware.b4a.objects.collections.Map _sourceitem) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub SetItem(sourceItem As Map)";
 //BA.debugLineNum = 38;BA.debugLine="Item = CloneStateMap(sourceItem)";
_item = _clonestatemap(_sourceitem);
 //BA.debugLineNum = 39;BA.debugLine="LastStateChangedAt = DateTime.Now";
_laststatechangedat = __c.DateTime.getNow();
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _setrolestate(String _rolevalue,String _statevalue) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub SetRoleState(roleValue As String, state";
 //BA.debugLineNum = 31;BA.debugLine="Role = roleValue";
_role = _rolevalue;
 //BA.debugLineNum = 32;BA.debugLine="State = stateValue";
_state = _statevalue;
 //BA.debugLineNum = 33;BA.debugLine="LastStateChangedAt = DateTime.Now";
_laststatechangedat = __c.DateTime.getNow();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
