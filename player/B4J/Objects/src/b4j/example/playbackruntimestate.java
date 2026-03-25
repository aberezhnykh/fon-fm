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
RDebugUtils.currentLine=54722560;
 //BA.debugLineNum = 54722560;BA.debugLine="Public Sub SetActive(audioKey As String, item As M";
RDebugUtils.currentLine=54722561;
 //BA.debugLineNum = 54722561;BA.debugLine="ActiveAudioKey = audioKey";
__ref._activeaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=54722562;
 //BA.debugLineNum = 54722562;BA.debugLine="ActiveItem = CloneStateMap(item)";
__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item);
RDebugUtils.currentLine=54722563;
 //BA.debugLineNum = 54722563;BA.debugLine="End Sub";
return "";
}
public String  _clearpendingplaystate(b4j.example.playbackruntimestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "clearpendingplaystate", false))
	 {return ((String) Debug.delegate(ba, "clearpendingplaystate", null));}
RDebugUtils.currentLine=54591488;
 //BA.debugLineNum = 54591488;BA.debugLine="Public Sub ClearPendingPlayState";
RDebugUtils.currentLine=54591489;
 //BA.debugLineNum = 54591489;BA.debugLine="PendingPlayAudioKey = \"\"";
__ref._pendingplayaudiokey /*String*/  = "";
RDebugUtils.currentLine=54591490;
 //BA.debugLineNum = 54591490;BA.debugLine="PendingPlayFadeInMs = 0";
__ref._pendingplayfadeinms /*int*/  = (int) (0);
RDebugUtils.currentLine=54591491;
 //BA.debugLineNum = 54591491;BA.debugLine="PendingPlayItem.Initialize";
__ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=54591492;
 //BA.debugLineNum = 54591492;BA.debugLine="End Sub";
return "";
}
public String  _clearpendingpreparestate(b4j.example.playbackruntimestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "clearpendingpreparestate", false))
	 {return ((String) Debug.delegate(ba, "clearpendingpreparestate", null));}
RDebugUtils.currentLine=54657024;
 //BA.debugLineNum = 54657024;BA.debugLine="Public Sub ClearPendingPrepareState";
RDebugUtils.currentLine=54657025;
 //BA.debugLineNum = 54657025;BA.debugLine="PendingPrepareAudioKey = \"\"";
__ref._pendingprepareaudiokey /*String*/  = "";
RDebugUtils.currentLine=54657026;
 //BA.debugLineNum = 54657026;BA.debugLine="PendingPrepareItem.Initialize";
__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=54657027;
 //BA.debugLineNum = 54657027;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackruntimestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=54525952;
 //BA.debugLineNum = 54525952;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=54525953;
 //BA.debugLineNum = 54525953;BA.debugLine="ActiveAudioKey = \"\"";
__ref._activeaudiokey /*String*/  = "";
RDebugUtils.currentLine=54525954;
 //BA.debugLineNum = 54525954;BA.debugLine="PreparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=54525955;
 //BA.debugLineNum = 54525955;BA.debugLine="PendingPlayAudioKey = \"\"";
__ref._pendingplayaudiokey /*String*/  = "";
RDebugUtils.currentLine=54525956;
 //BA.debugLineNum = 54525956;BA.debugLine="PendingPrepareAudioKey = \"\"";
__ref._pendingprepareaudiokey /*String*/  = "";
RDebugUtils.currentLine=54525957;
 //BA.debugLineNum = 54525957;BA.debugLine="PendingPlayFadeInMs = 0";
__ref._pendingplayfadeinms /*int*/  = (int) (0);
RDebugUtils.currentLine=54525958;
 //BA.debugLineNum = 54525958;BA.debugLine="ActiveItem.Initialize";
__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=54525959;
 //BA.debugLineNum = 54525959;BA.debugLine="PreparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=54525960;
 //BA.debugLineNum = 54525960;BA.debugLine="PendingPlayItem.Initialize";
__ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=54525961;
 //BA.debugLineNum = 54525961;BA.debugLine="PendingPrepareItem.Initialize";
__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=54525962;
 //BA.debugLineNum = 54525962;BA.debugLine="End Sub";
return "";
}
public String  _setprepared(b4j.example.playbackruntimestate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "setprepared", false))
	 {return ((String) Debug.delegate(ba, "setprepared", new Object[] {_audiokey,_item}));}
RDebugUtils.currentLine=54788096;
 //BA.debugLineNum = 54788096;BA.debugLine="Public Sub SetPrepared(audioKey As String, item As";
RDebugUtils.currentLine=54788097;
 //BA.debugLineNum = 54788097;BA.debugLine="PreparedAudioKey = audioKey";
__ref._preparedaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=54788098;
 //BA.debugLineNum = 54788098;BA.debugLine="PreparedItem = CloneStateMap(item)";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item);
RDebugUtils.currentLine=54788099;
 //BA.debugLineNum = 54788099;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackruntimestate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=54460416;
 //BA.debugLineNum = 54460416;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=54460417;
 //BA.debugLineNum = 54460417;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=54460418;
 //BA.debugLineNum = 54460418;BA.debugLine="End Sub";
return "";
}
public String  _setpendingplay(b4j.example.playbackruntimestate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _fadeinms) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "setpendingplay", false))
	 {return ((String) Debug.delegate(ba, "setpendingplay", new Object[] {_audiokey,_item,_fadeinms}));}
RDebugUtils.currentLine=54853632;
 //BA.debugLineNum = 54853632;BA.debugLine="Public Sub SetPendingPlay(audioKey As String, item";
RDebugUtils.currentLine=54853633;
 //BA.debugLineNum = 54853633;BA.debugLine="PendingPlayAudioKey = audioKey";
__ref._pendingplayaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=54853634;
 //BA.debugLineNum = 54853634;BA.debugLine="PendingPlayItem = CloneStateMap(item)";
__ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item);
RDebugUtils.currentLine=54853635;
 //BA.debugLineNum = 54853635;BA.debugLine="PendingPlayFadeInMs = fadeInMs";
__ref._pendingplayfadeinms /*int*/  = _fadeinms;
RDebugUtils.currentLine=54853636;
 //BA.debugLineNum = 54853636;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbackruntimestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
RDebugUtils.currentLine=54394880;
 //BA.debugLineNum = 54394880;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=54394881;
 //BA.debugLineNum = 54394881;BA.debugLine="Public ActiveAudioKey As String";
_activeaudiokey = "";
RDebugUtils.currentLine=54394882;
 //BA.debugLineNum = 54394882;BA.debugLine="Public PreparedAudioKey As String";
_preparedaudiokey = "";
RDebugUtils.currentLine=54394883;
 //BA.debugLineNum = 54394883;BA.debugLine="Public ActiveItem As Map";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=54394884;
 //BA.debugLineNum = 54394884;BA.debugLine="Public PreparedItem As Map";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=54394885;
 //BA.debugLineNum = 54394885;BA.debugLine="Public PendingPlayAudioKey As String";
_pendingplayaudiokey = "";
RDebugUtils.currentLine=54394886;
 //BA.debugLineNum = 54394886;BA.debugLine="Public PendingPrepareAudioKey As String";
_pendingprepareaudiokey = "";
RDebugUtils.currentLine=54394887;
 //BA.debugLineNum = 54394887;BA.debugLine="Public PendingPlayItem As Map";
_pendingplayitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=54394888;
 //BA.debugLineNum = 54394888;BA.debugLine="Public PendingPrepareItem As Map";
_pendingprepareitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=54394889;
 //BA.debugLineNum = 54394889;BA.debugLine="Public PendingPlayFadeInMs As Int";
_pendingplayfadeinms = 0;
RDebugUtils.currentLine=54394890;
 //BA.debugLineNum = 54394890;BA.debugLine="End Sub";
return "";
}
public String  _clearpreparedifmatchesaudio(b4j.example.playbackruntimestate __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "clearpreparedifmatchesaudio", false))
	 {return ((String) Debug.delegate(ba, "clearpreparedifmatchesaudio", new Object[] {_audiokey}));}
RDebugUtils.currentLine=54984704;
 //BA.debugLineNum = 54984704;BA.debugLine="Public Sub ClearPreparedIfMatchesAudio(audioKey As";
RDebugUtils.currentLine=54984705;
 //BA.debugLineNum = 54984705;BA.debugLine="If PreparedAudioKey <> audioKey Then Return";
if ((__ref._preparedaudiokey /*String*/ ).equals(_audiokey) == false) { 
if (true) return "";};
RDebugUtils.currentLine=54984706;
 //BA.debugLineNum = 54984706;BA.debugLine="PreparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=54984707;
 //BA.debugLineNum = 54984707;BA.debugLine="PreparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=54984708;
 //BA.debugLineNum = 54984708;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonestatemap(b4j.example.playbackruntimestate __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "clonestatemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonestatemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _cloned = null;
Object _key = null;
RDebugUtils.currentLine=55181312;
 //BA.debugLineNum = 55181312;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
RDebugUtils.currentLine=55181313;
 //BA.debugLineNum = 55181313;BA.debugLine="Dim cloned As Map";
_cloned = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=55181314;
 //BA.debugLineNum = 55181314;BA.debugLine="cloned.Initialize";
_cloned.Initialize();
RDebugUtils.currentLine=55181315;
 //BA.debugLineNum = 55181315;BA.debugLine="If source.IsInitialized = False Then Return clone";
if (_source.IsInitialized()==__c.False) { 
if (true) return _cloned;};
RDebugUtils.currentLine=55181316;
 //BA.debugLineNum = 55181316;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=55181317;
 //BA.debugLineNum = 55181317;BA.debugLine="cloned.Put(key, source.Get(key))";
_cloned.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=55181319;
 //BA.debugLineNum = 55181319;BA.debugLine="Return cloned";
if (true) return _cloned;
RDebugUtils.currentLine=55181320;
 //BA.debugLineNum = 55181320;BA.debugLine="End Sub";
return null;
}
public boolean  _haspendingplay(b4j.example.playbackruntimestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "haspendingplay", false))
	 {return ((Boolean) Debug.delegate(ba, "haspendingplay", null));}
RDebugUtils.currentLine=55115776;
 //BA.debugLineNum = 55115776;BA.debugLine="Public Sub HasPendingPlay As Boolean";
RDebugUtils.currentLine=55115777;
 //BA.debugLineNum = 55115777;BA.debugLine="Return PendingPlayAudioKey <> \"\" And PendingPlayI";
if (true) return (__ref._pendingplayaudiokey /*String*/ ).equals("") == false && __ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized();
RDebugUtils.currentLine=55115778;
 //BA.debugLineNum = 55115778;BA.debugLine="End Sub";
return false;
}
public boolean  _hasprepared(b4j.example.playbackruntimestate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "hasprepared", false))
	 {return ((Boolean) Debug.delegate(ba, "hasprepared", null));}
RDebugUtils.currentLine=55050240;
 //BA.debugLineNum = 55050240;BA.debugLine="Public Sub HasPrepared As Boolean";
RDebugUtils.currentLine=55050241;
 //BA.debugLineNum = 55050241;BA.debugLine="Return PreparedAudioKey <> \"\" And PreparedItem.Is";
if (true) return (__ref._preparedaudiokey /*String*/ ).equals("") == false && __ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized();
RDebugUtils.currentLine=55050242;
 //BA.debugLineNum = 55050242;BA.debugLine="End Sub";
return false;
}
public String  _setpendingprepare(b4j.example.playbackruntimestate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackruntimestate";
if (Debug.shouldDelegate(ba, "setpendingprepare", false))
	 {return ((String) Debug.delegate(ba, "setpendingprepare", new Object[] {_audiokey,_item}));}
RDebugUtils.currentLine=54919168;
 //BA.debugLineNum = 54919168;BA.debugLine="Public Sub SetPendingPrepare(audioKey As String, i";
RDebugUtils.currentLine=54919169;
 //BA.debugLineNum = 54919169;BA.debugLine="PendingPrepareAudioKey = audioKey";
__ref._pendingprepareaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=54919170;
 //BA.debugLineNum = 54919170;BA.debugLine="PendingPrepareItem = CloneStateMap(item)";
__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item);
RDebugUtils.currentLine=54919171;
 //BA.debugLineNum = 54919171;BA.debugLine="End Sub";
return "";
}
}