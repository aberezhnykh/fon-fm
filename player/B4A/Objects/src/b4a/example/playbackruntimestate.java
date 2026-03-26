package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playbackruntimestate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playbackruntimestate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playbackruntimestate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _activeaudiokey = "";
public String _preparedaudiokey = "";
public anywheresoftware.b4a.objects.collections.Map _activeitem = null;
public anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
public String _pendingplayaudiokey = "";
public String _pendingprepareaudiokey = "";
public anywheresoftware.b4a.objects.collections.Map _pendingplayitem = null;
public anywheresoftware.b4a.objects.collections.Map _pendingprepareitem = null;
public int _pendingplayfadeinms = 0;
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
 //BA.debugLineNum = 6;BA.debugLine="Public ActiveAudioKey As String";
_activeaudiokey = "";
 //BA.debugLineNum = 7;BA.debugLine="Public PreparedAudioKey As String";
_preparedaudiokey = "";
 //BA.debugLineNum = 8;BA.debugLine="Public ActiveItem As Map";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Public PreparedItem As Map";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Public PendingPlayAudioKey As String";
_pendingplayaudiokey = "";
 //BA.debugLineNum = 11;BA.debugLine="Public PendingPrepareAudioKey As String";
_pendingprepareaudiokey = "";
 //BA.debugLineNum = 12;BA.debugLine="Public PendingPlayItem As Map";
_pendingplayitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Public PendingPrepareItem As Map";
_pendingprepareitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 14;BA.debugLine="Public PendingPlayFadeInMs As Int";
_pendingplayfadeinms = 0;
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _clearpendingplaystate() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub ClearPendingPlayState";
 //BA.debugLineNum = 35;BA.debugLine="PendingPlayAudioKey = \"\"";
_pendingplayaudiokey = "";
 //BA.debugLineNum = 36;BA.debugLine="PendingPlayFadeInMs = 0";
_pendingplayfadeinms = (int) (0);
 //BA.debugLineNum = 37;BA.debugLine="PendingPlayItem.Initialize";
_pendingplayitem.Initialize();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _clearpendingpreparestate() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub ClearPendingPrepareState";
 //BA.debugLineNum = 41;BA.debugLine="PendingPrepareAudioKey = \"\"";
_pendingprepareaudiokey = "";
 //BA.debugLineNum = 42;BA.debugLine="PendingPrepareItem.Initialize";
_pendingprepareitem.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _clearpreparedifmatchesaudio(String _audiokey) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub ClearPreparedIfMatchesAudio(audioKey As";
 //BA.debugLineNum = 69;BA.debugLine="If PreparedAudioKey <> audioKey Then Return";
if ((_preparedaudiokey).equals(_audiokey) == false) { 
if (true) return "";};
 //BA.debugLineNum = 70;BA.debugLine="PreparedAudioKey = \"\"";
_preparedaudiokey = "";
 //BA.debugLineNum = 71;BA.debugLine="PreparedItem.Initialize";
_prepareditem.Initialize();
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonestatemap(anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cloned = null;
Object _key = null;
 //BA.debugLineNum = 82;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
 //BA.debugLineNum = 83;BA.debugLine="Dim cloned As Map";
_cloned = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 84;BA.debugLine="cloned.Initialize";
_cloned.Initialize();
 //BA.debugLineNum = 85;BA.debugLine="If source.IsInitialized = False Then Return clone";
if (_source.IsInitialized()==__c.False) { 
if (true) return _cloned;};
 //BA.debugLineNum = 86;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
 //BA.debugLineNum = 87;BA.debugLine="cloned.Put(key, source.Get(key))";
_cloned.Put(_key,_source.Get(_key));
 }
};
 //BA.debugLineNum = 89;BA.debugLine="Return cloned";
if (true) return _cloned;
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public boolean  _haspendingplay() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub HasPendingPlay As Boolean";
 //BA.debugLineNum = 79;BA.debugLine="Return PendingPlayAudioKey <> \"\" And PendingPlayI";
if (true) return (_pendingplayaudiokey).equals("") == false && _pendingplayitem.IsInitialized();
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return false;
}
public boolean  _hasprepared() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub HasPrepared As Boolean";
 //BA.debugLineNum = 75;BA.debugLine="Return PreparedAudioKey <> \"\" And PreparedItem.Is";
if (true) return (_preparedaudiokey).equals("") == false && _prepareditem.IsInitialized();
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 18;BA.debugLine="Reset";
_reset();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _reset() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Reset";
 //BA.debugLineNum = 23;BA.debugLine="ActiveAudioKey = \"\"";
_activeaudiokey = "";
 //BA.debugLineNum = 24;BA.debugLine="PreparedAudioKey = \"\"";
_preparedaudiokey = "";
 //BA.debugLineNum = 25;BA.debugLine="PendingPlayAudioKey = \"\"";
_pendingplayaudiokey = "";
 //BA.debugLineNum = 26;BA.debugLine="PendingPrepareAudioKey = \"\"";
_pendingprepareaudiokey = "";
 //BA.debugLineNum = 27;BA.debugLine="PendingPlayFadeInMs = 0";
_pendingplayfadeinms = (int) (0);
 //BA.debugLineNum = 28;BA.debugLine="ActiveItem.Initialize";
_activeitem.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="PreparedItem.Initialize";
_prepareditem.Initialize();
 //BA.debugLineNum = 30;BA.debugLine="PendingPlayItem.Initialize";
_pendingplayitem.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="PendingPrepareItem.Initialize";
_pendingprepareitem.Initialize();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _setactive(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub SetActive(audioKey As String, item As M";
 //BA.debugLineNum = 47;BA.debugLine="ActiveAudioKey = audioKey";
_activeaudiokey = _audiokey;
 //BA.debugLineNum = 48;BA.debugLine="ActiveItem = CloneStateMap(item)";
_activeitem = _clonestatemap(_item);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _setpendingplay(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _fadeinms) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub SetPendingPlay(audioKey As String, item";
 //BA.debugLineNum = 58;BA.debugLine="PendingPlayAudioKey = audioKey";
_pendingplayaudiokey = _audiokey;
 //BA.debugLineNum = 59;BA.debugLine="PendingPlayItem = CloneStateMap(item)";
_pendingplayitem = _clonestatemap(_item);
 //BA.debugLineNum = 60;BA.debugLine="PendingPlayFadeInMs = fadeInMs";
_pendingplayfadeinms = _fadeinms;
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _setpendingprepare(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Public Sub SetPendingPrepare(audioKey As String, i";
 //BA.debugLineNum = 64;BA.debugLine="PendingPrepareAudioKey = audioKey";
_pendingprepareaudiokey = _audiokey;
 //BA.debugLineNum = 65;BA.debugLine="PendingPrepareItem = CloneStateMap(item)";
_pendingprepareitem = _clonestatemap(_item);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _setprepared(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub SetPrepared(audioKey As String, item As";
 //BA.debugLineNum = 53;BA.debugLine="PreparedAudioKey = audioKey";
_preparedaudiokey = _audiokey;
 //BA.debugLineNum = 54;BA.debugLine="PreparedItem = CloneStateMap(item)";
_prepareditem = _clonestatemap(_item);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
