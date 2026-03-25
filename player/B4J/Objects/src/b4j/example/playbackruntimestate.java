package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbackruntimestate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbackruntimestate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbackruntimestate.class).invoke(this, new Object[] {null});
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
public String _activeaudiokey = "";
public String _preparedaudiokey = "";
public anywheresoftware.b4a.objects.collections.Map _activeitem = null;
public anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
public String _pendingplayaudiokey = "";
public String _pendingprepareaudiokey = "";
public anywheresoftware.b4a.objects.collections.Map _pendingplayitem = null;
public anywheresoftware.b4a.objects.collections.Map _pendingprepareitem = null;
public int _pendingplayfadeinms = 0;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _setactive(b4j.example.playbackruntimestate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "setactive", false))
	 {return ((String) Debug.delegate(ba, "setactive", new Object[] {_audiokey,_item}));}
RDebugUtils.currentLine=53608448;
 //BA.debugLineNum = 53608448;BA.debugLine="Public Sub SetActive(audioKey As String, item As M";
RDebugUtils.currentLine=53608449;
 //BA.debugLineNum = 53608449;BA.debugLine="ActiveAudioKey = audioKey";
__ref._activeaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=53608450;
 //BA.debugLineNum = 53608450;BA.debugLine="ActiveItem = CloneStateMap(item)";
__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item);
RDebugUtils.currentLine=53608451;
 //BA.debugLineNum = 53608451;BA.debugLine="End Sub";
return "";
}
public String  _clearpendingplaystate(b4j.example.playbackruntimestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "clearpendingplaystate", false))
	 {return ((String) Debug.delegate(ba, "clearpendingplaystate", null));}
RDebugUtils.currentLine=53477376;
 //BA.debugLineNum = 53477376;BA.debugLine="Public Sub ClearPendingPlayState";
RDebugUtils.currentLine=53477377;
 //BA.debugLineNum = 53477377;BA.debugLine="PendingPlayAudioKey = \"\"";
__ref._pendingplayaudiokey /*String*/  = "";
RDebugUtils.currentLine=53477378;
 //BA.debugLineNum = 53477378;BA.debugLine="PendingPlayFadeInMs = 0";
__ref._pendingplayfadeinms /*int*/  = (int) (0);
RDebugUtils.currentLine=53477379;
 //BA.debugLineNum = 53477379;BA.debugLine="PendingPlayItem.Initialize";
__ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=53477380;
 //BA.debugLineNum = 53477380;BA.debugLine="End Sub";
return "";
}
public String  _clearpendingpreparestate(b4j.example.playbackruntimestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "clearpendingpreparestate", false))
	 {return ((String) Debug.delegate(ba, "clearpendingpreparestate", null));}
RDebugUtils.currentLine=53542912;
 //BA.debugLineNum = 53542912;BA.debugLine="Public Sub ClearPendingPrepareState";
RDebugUtils.currentLine=53542913;
 //BA.debugLineNum = 53542913;BA.debugLine="PendingPrepareAudioKey = \"\"";
__ref._pendingprepareaudiokey /*String*/  = "";
RDebugUtils.currentLine=53542914;
 //BA.debugLineNum = 53542914;BA.debugLine="PendingPrepareItem.Initialize";
__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=53542915;
 //BA.debugLineNum = 53542915;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackruntimestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=53411840;
 //BA.debugLineNum = 53411840;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=53411841;
 //BA.debugLineNum = 53411841;BA.debugLine="ActiveAudioKey = \"\"";
__ref._activeaudiokey /*String*/  = "";
RDebugUtils.currentLine=53411842;
 //BA.debugLineNum = 53411842;BA.debugLine="PreparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=53411843;
 //BA.debugLineNum = 53411843;BA.debugLine="PendingPlayAudioKey = \"\"";
__ref._pendingplayaudiokey /*String*/  = "";
RDebugUtils.currentLine=53411844;
 //BA.debugLineNum = 53411844;BA.debugLine="PendingPrepareAudioKey = \"\"";
__ref._pendingprepareaudiokey /*String*/  = "";
RDebugUtils.currentLine=53411845;
 //BA.debugLineNum = 53411845;BA.debugLine="PendingPlayFadeInMs = 0";
__ref._pendingplayfadeinms /*int*/  = (int) (0);
RDebugUtils.currentLine=53411846;
 //BA.debugLineNum = 53411846;BA.debugLine="ActiveItem.Initialize";
__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=53411847;
 //BA.debugLineNum = 53411847;BA.debugLine="PreparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=53411848;
 //BA.debugLineNum = 53411848;BA.debugLine="PendingPlayItem.Initialize";
__ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=53411849;
 //BA.debugLineNum = 53411849;BA.debugLine="PendingPrepareItem.Initialize";
__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=53411850;
 //BA.debugLineNum = 53411850;BA.debugLine="End Sub";
return "";
}
public String  _setprepared(b4j.example.playbackruntimestate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "setprepared", false))
	 {return ((String) Debug.delegate(ba, "setprepared", new Object[] {_audiokey,_item}));}
RDebugUtils.currentLine=53673984;
 //BA.debugLineNum = 53673984;BA.debugLine="Public Sub SetPrepared(audioKey As String, item As";
RDebugUtils.currentLine=53673985;
 //BA.debugLineNum = 53673985;BA.debugLine="PreparedAudioKey = audioKey";
__ref._preparedaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=53673986;
 //BA.debugLineNum = 53673986;BA.debugLine="PreparedItem = CloneStateMap(item)";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item);
RDebugUtils.currentLine=53673987;
 //BA.debugLineNum = 53673987;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackruntimestate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=53346304;
 //BA.debugLineNum = 53346304;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=53346305;
 //BA.debugLineNum = 53346305;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=53346306;
 //BA.debugLineNum = 53346306;BA.debugLine="End Sub";
return "";
}
public String  _setpendingplay(b4j.example.playbackruntimestate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _fadeinms) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "setpendingplay", false))
	 {return ((String) Debug.delegate(ba, "setpendingplay", new Object[] {_audiokey,_item,_fadeinms}));}
RDebugUtils.currentLine=53739520;
 //BA.debugLineNum = 53739520;BA.debugLine="Public Sub SetPendingPlay(audioKey As String, item";
RDebugUtils.currentLine=53739521;
 //BA.debugLineNum = 53739521;BA.debugLine="PendingPlayAudioKey = audioKey";
__ref._pendingplayaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=53739522;
 //BA.debugLineNum = 53739522;BA.debugLine="PendingPlayItem = CloneStateMap(item)";
__ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item);
RDebugUtils.currentLine=53739523;
 //BA.debugLineNum = 53739523;BA.debugLine="PendingPlayFadeInMs = fadeInMs";
__ref._pendingplayfadeinms /*int*/  = _fadeinms;
RDebugUtils.currentLine=53739524;
 //BA.debugLineNum = 53739524;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbackruntimestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
RDebugUtils.currentLine=53280768;
 //BA.debugLineNum = 53280768;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=53280769;
 //BA.debugLineNum = 53280769;BA.debugLine="Public ActiveAudioKey As String";
_activeaudiokey = "";
RDebugUtils.currentLine=53280770;
 //BA.debugLineNum = 53280770;BA.debugLine="Public PreparedAudioKey As String";
_preparedaudiokey = "";
RDebugUtils.currentLine=53280771;
 //BA.debugLineNum = 53280771;BA.debugLine="Public ActiveItem As Map";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=53280772;
 //BA.debugLineNum = 53280772;BA.debugLine="Public PreparedItem As Map";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=53280773;
 //BA.debugLineNum = 53280773;BA.debugLine="Public PendingPlayAudioKey As String";
_pendingplayaudiokey = "";
RDebugUtils.currentLine=53280774;
 //BA.debugLineNum = 53280774;BA.debugLine="Public PendingPrepareAudioKey As String";
_pendingprepareaudiokey = "";
RDebugUtils.currentLine=53280775;
 //BA.debugLineNum = 53280775;BA.debugLine="Public PendingPlayItem As Map";
_pendingplayitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=53280776;
 //BA.debugLineNum = 53280776;BA.debugLine="Public PendingPrepareItem As Map";
_pendingprepareitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=53280777;
 //BA.debugLineNum = 53280777;BA.debugLine="Public PendingPlayFadeInMs As Int";
_pendingplayfadeinms = 0;
RDebugUtils.currentLine=53280778;
 //BA.debugLineNum = 53280778;BA.debugLine="End Sub";
return "";
}
public String  _clearpreparedifmatchesaudio(b4j.example.playbackruntimestate __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "clearpreparedifmatchesaudio", false))
	 {return ((String) Debug.delegate(ba, "clearpreparedifmatchesaudio", new Object[] {_audiokey}));}
RDebugUtils.currentLine=53870592;
 //BA.debugLineNum = 53870592;BA.debugLine="Public Sub ClearPreparedIfMatchesAudio(audioKey As";
RDebugUtils.currentLine=53870593;
 //BA.debugLineNum = 53870593;BA.debugLine="If PreparedAudioKey <> audioKey Then Return";
if ((__ref._preparedaudiokey /*String*/ ).equals(_audiokey) == false) { 
if (true) return "";};
RDebugUtils.currentLine=53870594;
 //BA.debugLineNum = 53870594;BA.debugLine="PreparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=53870595;
 //BA.debugLineNum = 53870595;BA.debugLine="PreparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=53870596;
 //BA.debugLineNum = 53870596;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonestatemap(b4j.example.playbackruntimestate __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "clonestatemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonestatemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _cloned = null;
Object _key = null;
RDebugUtils.currentLine=54067200;
 //BA.debugLineNum = 54067200;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
RDebugUtils.currentLine=54067201;
 //BA.debugLineNum = 54067201;BA.debugLine="Dim cloned As Map";
_cloned = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=54067202;
 //BA.debugLineNum = 54067202;BA.debugLine="cloned.Initialize";
_cloned.Initialize();
RDebugUtils.currentLine=54067203;
 //BA.debugLineNum = 54067203;BA.debugLine="If source.IsInitialized = False Then Return clone";
if (_source.IsInitialized()==__c.False) { 
if (true) return _cloned;};
RDebugUtils.currentLine=54067204;
 //BA.debugLineNum = 54067204;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=54067205;
 //BA.debugLineNum = 54067205;BA.debugLine="cloned.Put(key, source.Get(key))";
_cloned.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=54067207;
 //BA.debugLineNum = 54067207;BA.debugLine="Return cloned";
if (true) return _cloned;
RDebugUtils.currentLine=54067208;
 //BA.debugLineNum = 54067208;BA.debugLine="End Sub";
return null;
}
public boolean  _haspendingplay(b4j.example.playbackruntimestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "haspendingplay", false))
	 {return ((Boolean) Debug.delegate(ba, "haspendingplay", null));}
RDebugUtils.currentLine=54001664;
 //BA.debugLineNum = 54001664;BA.debugLine="Public Sub HasPendingPlay As Boolean";
RDebugUtils.currentLine=54001665;
 //BA.debugLineNum = 54001665;BA.debugLine="Return PendingPlayAudioKey <> \"\" And PendingPlayI";
if (true) return (__ref._pendingplayaudiokey /*String*/ ).equals("") == false && __ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized();
RDebugUtils.currentLine=54001666;
 //BA.debugLineNum = 54001666;BA.debugLine="End Sub";
return false;
}
public boolean  _hasprepared(b4j.example.playbackruntimestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "hasprepared", false))
	 {return ((Boolean) Debug.delegate(ba, "hasprepared", null));}
RDebugUtils.currentLine=53936128;
 //BA.debugLineNum = 53936128;BA.debugLine="Public Sub HasPrepared As Boolean";
RDebugUtils.currentLine=53936129;
 //BA.debugLineNum = 53936129;BA.debugLine="Return PreparedAudioKey <> \"\" And PreparedItem.Is";
if (true) return (__ref._preparedaudiokey /*String*/ ).equals("") == false && __ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized();
RDebugUtils.currentLine=53936130;
 //BA.debugLineNum = 53936130;BA.debugLine="End Sub";
return false;
}
public String  _setpendingprepare(b4j.example.playbackruntimestate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "setpendingprepare", false))
	 {return ((String) Debug.delegate(ba, "setpendingprepare", new Object[] {_audiokey,_item}));}
RDebugUtils.currentLine=53805056;
 //BA.debugLineNum = 53805056;BA.debugLine="Public Sub SetPendingPrepare(audioKey As String, i";
RDebugUtils.currentLine=53805057;
 //BA.debugLineNum = 53805057;BA.debugLine="PendingPrepareAudioKey = audioKey";
__ref._pendingprepareaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=53805058;
 //BA.debugLineNum = 53805058;BA.debugLine="PendingPrepareItem = CloneStateMap(item)";
__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item);
RDebugUtils.currentLine=53805059;
 //BA.debugLineNum = 53805059;BA.debugLine="End Sub";
return "";
}
}