package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbackdirectorstate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbackdirectorstate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbackdirectorstate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _slots = null;
public boolean _istickinprogress = false;
public long _decisionepoch = 0L;
public String _currentdecision = "";
public String _flowstate = "";
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _setactive(b4j.example.playbackdirectorstate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "setactive", false))
	 {return ((String) Debug.delegate(ba, "setactive", new Object[] {_audiokey,_item}));}
b4j.example.playbackplayerslot _currentactiveslot = null;
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=51511296;
 //BA.debugLineNum = 51511296;BA.debugLine="Public Sub SetActive(audioKey As String, item As M";
RDebugUtils.currentLine=51511297;
 //BA.debugLineNum = 51511297;BA.debugLine="Dim currentActiveSlot As PlaybackPlayerSlot = Get";
_currentactiveslot = __ref._getactiveslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=51511298;
 //BA.debugLineNum = 51511298;BA.debugLine="If currentActiveSlot.IsInitialized And currentAct";
if (_currentactiveslot.IsInitialized /*boolean*/ () && (_currentactiveslot._audiokey /*String*/ ).equals(_audiokey) == false) { 
_currentactiveslot._reset /*String*/ (null);};
RDebugUtils.currentLine=51511299;
 //BA.debugLineNum = 51511299;BA.debugLine="ClearSlotByAudioKey(audioKey)";
__ref._clearslotbyaudiokey /*String*/ (null,_audiokey);
RDebugUtils.currentLine=51511300;
 //BA.debugLineNum = 51511300;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=51511301;
 //BA.debugLineNum = 51511301;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=51511302;
 //BA.debugLineNum = 51511302;BA.debugLine="slot.SetRoleState(\"active\", \"playing\")";
_slot._setrolestate /*String*/ (null,"active","playing");
RDebugUtils.currentLine=51511303;
 //BA.debugLineNum = 51511303;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (null,_item);
RDebugUtils.currentLine=51511304;
 //BA.debugLineNum = 51511304;BA.debugLine="slot.MarkProgress";
_slot._markprogress /*String*/ (null);
 };
RDebugUtils.currentLine=51511306;
 //BA.debugLineNum = 51511306;BA.debugLine="End Sub";
return "";
}
public String  _clearrole(b4j.example.playbackdirectorstate __ref,String _rolevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "clearrole", false))
	 {return ((String) Debug.delegate(ba, "clearrole", new Object[] {_rolevalue}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=51249152;
 //BA.debugLineNum = 51249152;BA.debugLine="Public Sub ClearRole(roleValue As String)";
RDebugUtils.currentLine=51249153;
 //BA.debugLineNum = 51249153;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByRole(ro";
_slot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,_rolevalue);
RDebugUtils.currentLine=51249154;
 //BA.debugLineNum = 51249154;BA.debugLine="If slot.IsInitialized Then slot.Reset";
if (_slot.IsInitialized /*boolean*/ ()) { 
_slot._reset /*String*/ (null);};
RDebugUtils.currentLine=51249155;
 //BA.debugLineNum = 51249155;BA.debugLine="End Sub";
return "";
}
public b4j.example.playbackplayerslot  _getactiveslot(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getactiveslot", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getactiveslot", null));}
RDebugUtils.currentLine=50855936;
 //BA.debugLineNum = 50855936;BA.debugLine="Public Sub GetActiveSlot As PlaybackPlayerSlot";
RDebugUtils.currentLine=50855937;
 //BA.debugLineNum = 50855937;BA.debugLine="Return GetSlotByRole(\"active\")";
if (true) return __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"active");
RDebugUtils.currentLine=50855938;
 //BA.debugLineNum = 50855938;BA.debugLine="End Sub";
return null;
}
public b4j.example.playbackplayerslot  _getpendingplayslot(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getpendingplayslot", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getpendingplayslot", null));}
RDebugUtils.currentLine=50987008;
 //BA.debugLineNum = 50987008;BA.debugLine="Public Sub GetPendingPlaySlot As PlaybackPlayerSlo";
RDebugUtils.currentLine=50987009;
 //BA.debugLineNum = 50987009;BA.debugLine="Return GetSlotByRole(\"pending_play\")";
if (true) return __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"pending_play");
RDebugUtils.currentLine=50987010;
 //BA.debugLineNum = 50987010;BA.debugLine="End Sub";
return null;
}
public String  _clearslotbyaudiokey(b4j.example.playbackdirectorstate __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "clearslotbyaudiokey", false))
	 {return ((String) Debug.delegate(ba, "clearslotbyaudiokey", new Object[] {_audiokey}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=51183616;
 //BA.debugLineNum = 51183616;BA.debugLine="Public Sub ClearSlotByAudioKey(audioKey As String)";
RDebugUtils.currentLine=51183617;
 //BA.debugLineNum = 51183617;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=51183618;
 //BA.debugLineNum = 51183618;BA.debugLine="If slot.IsInitialized Then slot.Reset";
if (_slot.IsInitialized /*boolean*/ ()) { 
_slot._reset /*String*/ (null);};
RDebugUtils.currentLine=51183619;
 //BA.debugLineNum = 51183619;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=50528256;
 //BA.debugLineNum = 50528256;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=50528257;
 //BA.debugLineNum = 50528257;BA.debugLine="Slots.Initialize";
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=50528258;
 //BA.debugLineNum = 50528258;BA.debugLine="IsTickInProgress = False";
__ref._istickinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=50528259;
 //BA.debugLineNum = 50528259;BA.debugLine="DecisionEpoch = 0";
__ref._decisionepoch /*long*/  = (long) (0);
RDebugUtils.currentLine=50528260;
 //BA.debugLineNum = 50528260;BA.debugLine="CurrentDecision = \"\"";
__ref._currentdecision /*String*/  = "";
RDebugUtils.currentLine=50528261;
 //BA.debugLineNum = 50528261;BA.debugLine="FlowState = \"idle\"";
__ref._flowstate /*String*/  = "idle";
RDebugUtils.currentLine=50528262;
 //BA.debugLineNum = 50528262;BA.debugLine="End Sub";
return "";
}
public String  _configuredefaultslots(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "configuredefaultslots", false))
	 {return ((String) Debug.delegate(ba, "configuredefaultslots", null));}
RDebugUtils.currentLine=50593792;
 //BA.debugLineNum = 50593792;BA.debugLine="Public Sub ConfigureDefaultSlots";
RDebugUtils.currentLine=50593793;
 //BA.debugLineNum = 50593793;BA.debugLine="If Slots.IsInitialized = False Then Slots.Initial";
if (__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=50593794;
 //BA.debugLineNum = 50593794;BA.debugLine="If Slots.Size > 0 Then Return";
if (__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
if (true) return "";};
RDebugUtils.currentLine=50593795;
 //BA.debugLineNum = 50593795;BA.debugLine="Slots.Add(CreateSlot(\"slot_primary\", \"primary\"))";
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createslot /*b4j.example.playbackplayerslot*/ (null,"slot_primary","primary")));
RDebugUtils.currentLine=50593796;
 //BA.debugLineNum = 50593796;BA.debugLine="Slots.Add(CreateSlot(\"slot_secondary\", \"secondary";
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createslot /*b4j.example.playbackplayerslot*/ (null,"slot_secondary","secondary")));
RDebugUtils.currentLine=50593797;
 //BA.debugLineNum = 50593797;BA.debugLine="Slots.Add(CreateSlot(\"slot_interrupt\", \"\"))";
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createslot /*b4j.example.playbackplayerslot*/ (null,"slot_interrupt","")));
RDebugUtils.currentLine=50593798;
 //BA.debugLineNum = 50593798;BA.debugLine="End Sub";
return "";
}
public b4j.example.playbackplayerslot  _getpreparedslot(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getpreparedslot", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getpreparedslot", null));}
b4j.example.playbackplayerslot _preparedmusicslot = null;
b4j.example.playbackplayerslot _preparedinterruptslot = null;
b4j.example.playbackplayerslot _preparedslot = null;
b4j.example.playbackplayerslot _emptyslot = null;
RDebugUtils.currentLine=50921472;
 //BA.debugLineNum = 50921472;BA.debugLine="Public Sub GetPreparedSlot As PlaybackPlayerSlot";
RDebugUtils.currentLine=50921473;
 //BA.debugLineNum = 50921473;BA.debugLine="Dim preparedMusicSlot As PlaybackPlayerSlot = Get";
_preparedmusicslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"prepared_music");
RDebugUtils.currentLine=50921474;
 //BA.debugLineNum = 50921474;BA.debugLine="If preparedMusicSlot.IsInitialized Then Return pr";
if (_preparedmusicslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedmusicslot;};
RDebugUtils.currentLine=50921475;
 //BA.debugLineNum = 50921475;BA.debugLine="Dim preparedInterruptSlot As PlaybackPlayerSlot =";
_preparedinterruptslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"prepared_interrupt");
RDebugUtils.currentLine=50921476;
 //BA.debugLineNum = 50921476;BA.debugLine="If preparedInterruptSlot.IsInitialized Then Retur";
if (_preparedinterruptslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedinterruptslot;};
RDebugUtils.currentLine=50921477;
 //BA.debugLineNum = 50921477;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetSlotB";
_preparedslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"prepared");
RDebugUtils.currentLine=50921478;
 //BA.debugLineNum = 50921478;BA.debugLine="If preparedSlot.IsInitialized Then Return prepare";
if (_preparedslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedslot;};
RDebugUtils.currentLine=50921479;
 //BA.debugLineNum = 50921479;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=50921480;
 //BA.debugLineNum = 50921480;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
RDebugUtils.currentLine=50921481;
 //BA.debugLineNum = 50921481;BA.debugLine="End Sub";
return null;
}
public String  _begindecision(b4j.example.playbackdirectorstate __ref,String _decisionname) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "begindecision", false))
	 {return ((String) Debug.delegate(ba, "begindecision", new Object[] {_decisionname}));}
RDebugUtils.currentLine=51642368;
 //BA.debugLineNum = 51642368;BA.debugLine="Public Sub BeginDecision(decisionName As String)";
RDebugUtils.currentLine=51642369;
 //BA.debugLineNum = 51642369;BA.debugLine="DecisionEpoch = DecisionEpoch + 1";
__ref._decisionepoch /*long*/  = (long) (__ref._decisionepoch /*long*/ +1);
RDebugUtils.currentLine=51642370;
 //BA.debugLineNum = 51642370;BA.debugLine="CurrentDecision = decisionName";
__ref._currentdecision /*String*/  = _decisionname;
RDebugUtils.currentLine=51642371;
 //BA.debugLineNum = 51642371;BA.debugLine="End Sub";
return "";
}
public String  _cleardecision(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "cleardecision", false))
	 {return ((String) Debug.delegate(ba, "cleardecision", null));}
RDebugUtils.currentLine=51773440;
 //BA.debugLineNum = 51773440;BA.debugLine="Public Sub ClearDecision";
RDebugUtils.currentLine=51773441;
 //BA.debugLineNum = 51773441;BA.debugLine="CurrentDecision = \"\"";
__ref._currentdecision /*String*/  = "";
RDebugUtils.currentLine=51773442;
 //BA.debugLineNum = 51773442;BA.debugLine="End Sub";
return "";
}
public String  _setprepared(b4j.example.playbackdirectorstate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "setprepared", false))
	 {return ((String) Debug.delegate(ba, "setprepared", new Object[] {_audiokey,_item}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=51445760;
 //BA.debugLineNum = 51445760;BA.debugLine="Public Sub SetPrepared(audioKey As String, item As";
RDebugUtils.currentLine=51445761;
 //BA.debugLineNum = 51445761;BA.debugLine="ClearSlotByAudioKey(audioKey)";
__ref._clearslotbyaudiokey /*String*/ (null,_audiokey);
RDebugUtils.currentLine=51445762;
 //BA.debugLineNum = 51445762;BA.debugLine="ClearRole(\"prepared_music\")";
__ref._clearrole /*String*/ (null,"prepared_music");
RDebugUtils.currentLine=51445763;
 //BA.debugLineNum = 51445763;BA.debugLine="ClearRole(\"prepared_interrupt\")";
__ref._clearrole /*String*/ (null,"prepared_interrupt");
RDebugUtils.currentLine=51445764;
 //BA.debugLineNum = 51445764;BA.debugLine="ClearRole(\"prepared\")";
__ref._clearrole /*String*/ (null,"prepared");
RDebugUtils.currentLine=51445765;
 //BA.debugLineNum = 51445765;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=51445766;
 //BA.debugLineNum = 51445766;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=51445767;
 //BA.debugLineNum = 51445767;BA.debugLine="slot.SetRoleState(ResolvePreparedRole(item), \"re";
_slot._setrolestate /*String*/ (null,__ref._resolvepreparedrole /*String*/ (null,_item),"ready");
RDebugUtils.currentLine=51445768;
 //BA.debugLineNum = 51445768;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (null,_item);
 };
RDebugUtils.currentLine=51445770;
 //BA.debugLineNum = 51445770;BA.debugLine="End Sub";
return "";
}
public b4j.example.playbackplayerslot  _getslotbyaudiokey(b4j.example.playbackdirectorstate __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getslotbyaudiokey", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getslotbyaudiokey", new Object[] {_audiokey}));}
b4j.example.playbackplayerslot _slot = null;
b4j.example.playbackplayerslot _emptyslot = null;
RDebugUtils.currentLine=50724864;
 //BA.debugLineNum = 50724864;BA.debugLine="Public Sub GetSlotByAudioKey(audioKey As String) A";
RDebugUtils.currentLine=50724865;
 //BA.debugLineNum = 50724865;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._slots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_slot = (b4j.example.playbackplayerslot)(group1.Get(index1));
RDebugUtils.currentLine=50724866;
 //BA.debugLineNum = 50724866;BA.debugLine="If slot.AudioKey = audioKey Then Return slot";
if ((_slot._audiokey /*String*/ ).equals(_audiokey)) { 
if (true) return _slot;};
 }
};
RDebugUtils.currentLine=50724868;
 //BA.debugLineNum = 50724868;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=50724869;
 //BA.debugLineNum = 50724869;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
RDebugUtils.currentLine=50724870;
 //BA.debugLineNum = 50724870;BA.debugLine="End Sub";
return null;
}
public boolean  _haspreparedslot(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "haspreparedslot", false))
	 {return ((Boolean) Debug.delegate(ba, "haspreparedslot", null));}
b4j.example.playbackplayerslot _preparedslot = null;
RDebugUtils.currentLine=51118080;
 //BA.debugLineNum = 51118080;BA.debugLine="Public Sub HasPreparedSlot As Boolean";
RDebugUtils.currentLine=51118081;
 //BA.debugLineNum = 51118081;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetPrepa";
_preparedslot = __ref._getpreparedslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=51118082;
 //BA.debugLineNum = 51118082;BA.debugLine="Return preparedSlot.IsInitialized And preparedSlo";
if (true) return _preparedslot.IsInitialized /*boolean*/ () && _preparedslot._hasitem /*boolean*/ (null);
RDebugUtils.currentLine=51118083;
 //BA.debugLineNum = 51118083;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.playbackdirectorstate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=50462720;
 //BA.debugLineNum = 50462720;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=50462721;
 //BA.debugLineNum = 50462721;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=50462722;
 //BA.debugLineNum = 50462722;BA.debugLine="End Sub";
return "";
}
public String  _setflowstate(b4j.example.playbackdirectorstate __ref,String _statevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "setflowstate", false))
	 {return ((String) Debug.delegate(ba, "setflowstate", new Object[] {_statevalue}));}
RDebugUtils.currentLine=51838976;
 //BA.debugLineNum = 51838976;BA.debugLine="Public Sub SetFlowState(stateValue As String)";
RDebugUtils.currentLine=51838977;
 //BA.debugLineNum = 51838977;BA.debugLine="If stateValue = \"\" Then stateValue = \"idle\"";
if ((_statevalue).equals("")) { 
_statevalue = "idle";};
RDebugUtils.currentLine=51838978;
 //BA.debugLineNum = 51838978;BA.debugLine="FlowState = stateValue";
__ref._flowstate /*String*/  = _statevalue;
RDebugUtils.currentLine=51838979;
 //BA.debugLineNum = 51838979;BA.debugLine="End Sub";
return "";
}
public boolean  _isflowactive(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "isflowactive", false))
	 {return ((Boolean) Debug.delegate(ba, "isflowactive", null));}
RDebugUtils.currentLine=51970048;
 //BA.debugLineNum = 51970048;BA.debugLine="Public Sub IsFlowActive As Boolean";
RDebugUtils.currentLine=51970049;
 //BA.debugLineNum = 51970049;BA.debugLine="Return FlowState = \"playing\" Or FlowState = \"prep";
if (true) return (__ref._flowstate /*String*/ ).equals("playing") || (__ref._flowstate /*String*/ ).equals("preparing") || (__ref._flowstate /*String*/ ).equals("transitioning") || (__ref._flowstate /*String*/ ).equals("starting");
RDebugUtils.currentLine=51970050;
 //BA.debugLineNum = 51970050;BA.debugLine="End Sub";
return false;
}
public boolean  _istransitioninprogress(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "istransitioninprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "istransitioninprogress", null));}
RDebugUtils.currentLine=51904512;
 //BA.debugLineNum = 51904512;BA.debugLine="Public Sub IsTransitionInProgress As Boolean";
RDebugUtils.currentLine=51904513;
 //BA.debugLineNum = 51904513;BA.debugLine="Return FlowState = \"starting\" Or FlowState = \"tra";
if (true) return (__ref._flowstate /*String*/ ).equals("starting") || (__ref._flowstate /*String*/ ).equals("transitioning") || (__ref._flowstate /*String*/ ).equals("stopping");
RDebugUtils.currentLine=51904514;
 //BA.debugLineNum = 51904514;BA.debugLine="End Sub";
return false;
}
public b4j.example.playbackplayerslot  _getpendingprepareslot(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getpendingprepareslot", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getpendingprepareslot", null));}
b4j.example.playbackplayerslot _pendingpreparemusicslot = null;
b4j.example.playbackplayerslot _pendinginterruptslot = null;
b4j.example.playbackplayerslot _pendingprepareslot = null;
b4j.example.playbackplayerslot _emptyslot = null;
RDebugUtils.currentLine=51052544;
 //BA.debugLineNum = 51052544;BA.debugLine="Public Sub GetPendingPrepareSlot As PlaybackPlayer";
RDebugUtils.currentLine=51052545;
 //BA.debugLineNum = 51052545;BA.debugLine="Dim pendingPrepareMusicSlot As PlaybackPlayerSlot";
_pendingpreparemusicslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"pending_prepare_music");
RDebugUtils.currentLine=51052546;
 //BA.debugLineNum = 51052546;BA.debugLine="If pendingPrepareMusicSlot.IsInitialized Then Ret";
if (_pendingpreparemusicslot.IsInitialized /*boolean*/ ()) { 
if (true) return _pendingpreparemusicslot;};
RDebugUtils.currentLine=51052547;
 //BA.debugLineNum = 51052547;BA.debugLine="Dim pendingInterruptSlot As PlaybackPlayerSlot =";
_pendinginterruptslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"pending_interrupt");
RDebugUtils.currentLine=51052548;
 //BA.debugLineNum = 51052548;BA.debugLine="If pendingInterruptSlot.IsInitialized Then Return";
if (_pendinginterruptslot.IsInitialized /*boolean*/ ()) { 
if (true) return _pendinginterruptslot;};
RDebugUtils.currentLine=51052549;
 //BA.debugLineNum = 51052549;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = Ge";
_pendingprepareslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"pending_prepare");
RDebugUtils.currentLine=51052550;
 //BA.debugLineNum = 51052550;BA.debugLine="If pendingPrepareSlot.IsInitialized Then Return p";
if (_pendingprepareslot.IsInitialized /*boolean*/ ()) { 
if (true) return _pendingprepareslot;};
RDebugUtils.currentLine=51052551;
 //BA.debugLineNum = 51052551;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=51052552;
 //BA.debugLineNum = 51052552;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
RDebugUtils.currentLine=51052553;
 //BA.debugLineNum = 51052553;BA.debugLine="End Sub";
return null;
}
public boolean  _trybegindecision(b4j.example.playbackdirectorstate __ref,String _decisionname) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "trybegindecision", false))
	 {return ((Boolean) Debug.delegate(ba, "trybegindecision", new Object[] {_decisionname}));}
RDebugUtils.currentLine=51707904;
 //BA.debugLineNum = 51707904;BA.debugLine="Public Sub TryBeginDecision(decisionName As String";
RDebugUtils.currentLine=51707905;
 //BA.debugLineNum = 51707905;BA.debugLine="If CurrentDecision <> \"\" Then Return False";
if ((__ref._currentdecision /*String*/ ).equals("") == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=51707906;
 //BA.debugLineNum = 51707906;BA.debugLine="BeginDecision(decisionName)";
__ref._begindecision /*String*/ (null,_decisionname);
RDebugUtils.currentLine=51707907;
 //BA.debugLineNum = 51707907;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=51707908;
 //BA.debugLineNum = 51707908;BA.debugLine="End Sub";
return false;
}
public String  _setpendingplay(b4j.example.playbackdirectorstate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "setpendingplay", false))
	 {return ((String) Debug.delegate(ba, "setpendingplay", new Object[] {_audiokey,_item}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=51314688;
 //BA.debugLineNum = 51314688;BA.debugLine="Public Sub SetPendingPlay(audioKey As String, item";
RDebugUtils.currentLine=51314689;
 //BA.debugLineNum = 51314689;BA.debugLine="ClearSlotByAudioKey(audioKey)";
__ref._clearslotbyaudiokey /*String*/ (null,_audiokey);
RDebugUtils.currentLine=51314690;
 //BA.debugLineNum = 51314690;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=51314691;
 //BA.debugLineNum = 51314691;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=51314692;
 //BA.debugLineNum = 51314692;BA.debugLine="slot.SetRoleState(\"pending_play\", \"loading\")";
_slot._setrolestate /*String*/ (null,"pending_play","loading");
RDebugUtils.currentLine=51314693;
 //BA.debugLineNum = 51314693;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (null,_item);
 };
RDebugUtils.currentLine=51314695;
 //BA.debugLineNum = 51314695;BA.debugLine="End Sub";
return "";
}
public String  _applylegacyruntime(b4j.example.playbackdirectorstate __ref,b4j.example.playbackruntimestate _runtimestate) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "applylegacyruntime", false))
	 {return ((String) Debug.delegate(ba, "applylegacyruntime", new Object[] {_runtimestate}));}
b4j.example.playbackplayerslot _slot = null;
b4j.example.playbackplayerslot _activeslot = null;
b4j.example.playbackplayerslot _pendingplayslot = null;
b4j.example.playbackplayerslot _preparedslot = null;
b4j.example.playbackplayerslot _pendingprepareslot = null;
RDebugUtils.currentLine=50659328;
 //BA.debugLineNum = 50659328;BA.debugLine="Public Sub ApplyLegacyRuntime(runtimeState As Play";
RDebugUtils.currentLine=50659329;
 //BA.debugLineNum = 50659329;BA.debugLine="ConfigureDefaultSlots";
__ref._configuredefaultslots /*String*/ (null);
RDebugUtils.currentLine=50659330;
 //BA.debugLineNum = 50659330;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._slots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_slot = (b4j.example.playbackplayerslot)(group2.Get(index2));
RDebugUtils.currentLine=50659331;
 //BA.debugLineNum = 50659331;BA.debugLine="slot.Reset";
_slot._reset /*String*/ (null);
 }
};
RDebugUtils.currentLine=50659333;
 //BA.debugLineNum = 50659333;BA.debugLine="If runtimeState.ActiveAudioKey <> \"\" Then";
if ((_runtimestate._activeaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=50659334;
 //BA.debugLineNum = 50659334;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = GetSlotBy";
_activeslot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_runtimestate._activeaudiokey /*String*/ );
RDebugUtils.currentLine=50659335;
 //BA.debugLineNum = 50659335;BA.debugLine="If activeSlot.IsInitialized Then";
if (_activeslot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=50659336;
 //BA.debugLineNum = 50659336;BA.debugLine="activeSlot.SetRoleState(\"active\", \"playing\")";
_activeslot._setrolestate /*String*/ (null,"active","playing");
RDebugUtils.currentLine=50659337;
 //BA.debugLineNum = 50659337;BA.debugLine="activeSlot.SetItem(runtimeState.ActiveItem)";
_activeslot._setitem /*String*/ (null,_runtimestate._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
RDebugUtils.currentLine=50659340;
 //BA.debugLineNum = 50659340;BA.debugLine="If runtimeState.PendingPlayAudioKey <> \"\" Then";
if ((_runtimestate._pendingplayaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=50659341;
 //BA.debugLineNum = 50659341;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = GetS";
_pendingplayslot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_runtimestate._pendingplayaudiokey /*String*/ );
RDebugUtils.currentLine=50659342;
 //BA.debugLineNum = 50659342;BA.debugLine="If pendingPlaySlot.IsInitialized Then";
if (_pendingplayslot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=50659343;
 //BA.debugLineNum = 50659343;BA.debugLine="pendingPlaySlot.SetRoleState(\"pending_play\", \"l";
_pendingplayslot._setrolestate /*String*/ (null,"pending_play","loading");
RDebugUtils.currentLine=50659344;
 //BA.debugLineNum = 50659344;BA.debugLine="pendingPlaySlot.SetItem(runtimeState.PendingPla";
_pendingplayslot._setitem /*String*/ (null,_runtimestate._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
RDebugUtils.currentLine=50659347;
 //BA.debugLineNum = 50659347;BA.debugLine="If runtimeState.PreparedAudioKey <> \"\" Then";
if ((_runtimestate._preparedaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=50659348;
 //BA.debugLineNum = 50659348;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetSlot";
_preparedslot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_runtimestate._preparedaudiokey /*String*/ );
RDebugUtils.currentLine=50659349;
 //BA.debugLineNum = 50659349;BA.debugLine="If preparedSlot.IsInitialized Then";
if (_preparedslot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=50659350;
 //BA.debugLineNum = 50659350;BA.debugLine="preparedSlot.SetRoleState(ResolvePreparedRole(r";
_preparedslot._setrolestate /*String*/ (null,__ref._resolvepreparedrole /*String*/ (null,_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ ),"ready");
RDebugUtils.currentLine=50659351;
 //BA.debugLineNum = 50659351;BA.debugLine="preparedSlot.SetItem(runtimeState.PreparedItem)";
_preparedslot._setitem /*String*/ (null,_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
RDebugUtils.currentLine=50659354;
 //BA.debugLineNum = 50659354;BA.debugLine="If runtimeState.PendingPrepareAudioKey <> \"\" Then";
if ((_runtimestate._pendingprepareaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=50659355;
 //BA.debugLineNum = 50659355;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = G";
_pendingprepareslot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_runtimestate._pendingprepareaudiokey /*String*/ );
RDebugUtils.currentLine=50659356;
 //BA.debugLineNum = 50659356;BA.debugLine="If pendingPrepareSlot.IsInitialized Then";
if (_pendingprepareslot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=50659357;
 //BA.debugLineNum = 50659357;BA.debugLine="pendingPrepareSlot.SetRoleState(ResolvePendingP";
_pendingprepareslot._setrolestate /*String*/ (null,__ref._resolvependingpreparerole /*String*/ (null,_runtimestate._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ ),"loading");
RDebugUtils.currentLine=50659358;
 //BA.debugLineNum = 50659358;BA.debugLine="pendingPrepareSlot.SetItem(runtimeState.Pending";
_pendingprepareslot._setitem /*String*/ (null,_runtimestate._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
RDebugUtils.currentLine=50659361;
 //BA.debugLineNum = 50659361;BA.debugLine="End Sub";
return "";
}
public String  _setpendingprepare(b4j.example.playbackdirectorstate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "setpendingprepare", false))
	 {return ((String) Debug.delegate(ba, "setpendingprepare", new Object[] {_audiokey,_item}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=51380224;
 //BA.debugLineNum = 51380224;BA.debugLine="Public Sub SetPendingPrepare(audioKey As String, i";
RDebugUtils.currentLine=51380225;
 //BA.debugLineNum = 51380225;BA.debugLine="ClearSlotByAudioKey(audioKey)";
__ref._clearslotbyaudiokey /*String*/ (null,_audiokey);
RDebugUtils.currentLine=51380226;
 //BA.debugLineNum = 51380226;BA.debugLine="ClearRole(\"pending_prepare_music\")";
__ref._clearrole /*String*/ (null,"pending_prepare_music");
RDebugUtils.currentLine=51380227;
 //BA.debugLineNum = 51380227;BA.debugLine="ClearRole(\"pending_interrupt\")";
__ref._clearrole /*String*/ (null,"pending_interrupt");
RDebugUtils.currentLine=51380228;
 //BA.debugLineNum = 51380228;BA.debugLine="ClearRole(\"pending_prepare\")";
__ref._clearrole /*String*/ (null,"pending_prepare");
RDebugUtils.currentLine=51380229;
 //BA.debugLineNum = 51380229;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=51380230;
 //BA.debugLineNum = 51380230;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=51380231;
 //BA.debugLineNum = 51380231;BA.debugLine="slot.SetRoleState(ResolvePendingPrepareRole(item";
_slot._setrolestate /*String*/ (null,__ref._resolvependingpreparerole /*String*/ (null,_item),"loading");
RDebugUtils.currentLine=51380232;
 //BA.debugLineNum = 51380232;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (null,_item);
 };
RDebugUtils.currentLine=51380234;
 //BA.debugLineNum = 51380234;BA.debugLine="End Sub";
return "";
}
public String  _resolvepreparedrole(b4j.example.playbackdirectorstate __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "resolvepreparedrole", false))
	 {return ((String) Debug.delegate(ba, "resolvepreparedrole", new Object[] {_item}));}
RDebugUtils.currentLine=52035584;
 //BA.debugLineNum = 52035584;BA.debugLine="Private Sub ResolvePreparedRole(item As Map) As St";
RDebugUtils.currentLine=52035585;
 //BA.debugLineNum = 52035585;BA.debugLine="If item.IsInitialized = False Then Return \"prepar";
if (_item.IsInitialized()==__c.False) { 
if (true) return "prepared";};
RDebugUtils.currentLine=52035586;
 //BA.debugLineNum = 52035586;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"ad\" Then Return";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
if (true) return "prepared_interrupt";};
RDebugUtils.currentLine=52035587;
 //BA.debugLineNum = 52035587;BA.debugLine="Return \"prepared_music\"";
if (true) return "prepared_music";
RDebugUtils.currentLine=52035588;
 //BA.debugLineNum = 52035588;BA.debugLine="End Sub";
return "";
}
public String  _resolvependingpreparerole(b4j.example.playbackdirectorstate __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "resolvependingpreparerole", false))
	 {return ((String) Debug.delegate(ba, "resolvependingpreparerole", new Object[] {_item}));}
RDebugUtils.currentLine=52101120;
 //BA.debugLineNum = 52101120;BA.debugLine="Private Sub ResolvePendingPrepareRole(item As Map)";
RDebugUtils.currentLine=52101121;
 //BA.debugLineNum = 52101121;BA.debugLine="If item.IsInitialized = False Then Return \"pendin";
if (_item.IsInitialized()==__c.False) { 
if (true) return "pending_prepare";};
RDebugUtils.currentLine=52101122;
 //BA.debugLineNum = 52101122;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"ad\" Then Return";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
if (true) return "pending_interrupt";};
RDebugUtils.currentLine=52101123;
 //BA.debugLineNum = 52101123;BA.debugLine="Return \"pending_prepare_music\"";
if (true) return "pending_prepare_music";
RDebugUtils.currentLine=52101124;
 //BA.debugLineNum = 52101124;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
RDebugUtils.currentLine=50397184;
 //BA.debugLineNum = 50397184;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=50397185;
 //BA.debugLineNum = 50397185;BA.debugLine="Public Slots As List";
_slots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=50397186;
 //BA.debugLineNum = 50397186;BA.debugLine="Public IsTickInProgress As Boolean";
_istickinprogress = false;
RDebugUtils.currentLine=50397187;
 //BA.debugLineNum = 50397187;BA.debugLine="Public DecisionEpoch As Long";
_decisionepoch = 0L;
RDebugUtils.currentLine=50397188;
 //BA.debugLineNum = 50397188;BA.debugLine="Public CurrentDecision As String";
_currentdecision = "";
RDebugUtils.currentLine=50397189;
 //BA.debugLineNum = 50397189;BA.debugLine="Public FlowState As String";
_flowstate = "";
RDebugUtils.currentLine=50397190;
 //BA.debugLineNum = 50397190;BA.debugLine="End Sub";
return "";
}
public b4j.example.playbackplayerslot  _getslotbyrole(b4j.example.playbackdirectorstate __ref,String _rolevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getslotbyrole", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getslotbyrole", new Object[] {_rolevalue}));}
b4j.example.playbackplayerslot _slot = null;
b4j.example.playbackplayerslot _emptyslot = null;
RDebugUtils.currentLine=50790400;
 //BA.debugLineNum = 50790400;BA.debugLine="Public Sub GetSlotByRole(roleValue As String) As P";
RDebugUtils.currentLine=50790401;
 //BA.debugLineNum = 50790401;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._slots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_slot = (b4j.example.playbackplayerslot)(group1.Get(index1));
RDebugUtils.currentLine=50790402;
 //BA.debugLineNum = 50790402;BA.debugLine="If slot.Role = roleValue Then Return slot";
if ((_slot._role /*String*/ ).equals(_rolevalue)) { 
if (true) return _slot;};
 }
};
RDebugUtils.currentLine=50790404;
 //BA.debugLineNum = 50790404;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=50790405;
 //BA.debugLineNum = 50790405;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
RDebugUtils.currentLine=50790406;
 //BA.debugLineNum = 50790406;BA.debugLine="End Sub";
return null;
}
public b4j.example.playbackplayerslot  _createslot(b4j.example.playbackdirectorstate __ref,String _slotidvalue,String _audiokeyvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "createslot", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "createslot", new Object[] {_slotidvalue,_audiokeyvalue}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=52166656;
 //BA.debugLineNum = 52166656;BA.debugLine="Private Sub CreateSlot(slotIdValue As String, audi";
RDebugUtils.currentLine=52166657;
 //BA.debugLineNum = 52166657;BA.debugLine="Dim slot As PlaybackPlayerSlot";
_slot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=52166658;
 //BA.debugLineNum = 52166658;BA.debugLine="slot.Initialize(slotIdValue, audioKeyValue)";
_slot._initialize /*String*/ (null,ba,_slotidvalue,_audiokeyvalue);
RDebugUtils.currentLine=52166659;
 //BA.debugLineNum = 52166659;BA.debugLine="Return slot";
if (true) return _slot;
RDebugUtils.currentLine=52166660;
 //BA.debugLineNum = 52166660;BA.debugLine="End Sub";
return null;
}
public String  _describeslots(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "describeslots", false))
	 {return ((String) Debug.delegate(ba, "describeslots", null));}
anywheresoftware.b4a.objects.collections.List _parts = null;
b4j.example.playbackplayerslot _slot = null;
String _itemid = "";
RDebugUtils.currentLine=51576832;
 //BA.debugLineNum = 51576832;BA.debugLine="Public Sub DescribeSlots As String";
RDebugUtils.currentLine=51576833;
 //BA.debugLineNum = 51576833;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=51576834;
 //BA.debugLineNum = 51576834;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=51576835;
 //BA.debugLineNum = 51576835;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._slots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_slot = (b4j.example.playbackplayerslot)(group3.Get(index3));
RDebugUtils.currentLine=51576836;
 //BA.debugLineNum = 51576836;BA.debugLine="Dim itemId As String = \"\"";
_itemid = "";
RDebugUtils.currentLine=51576837;
 //BA.debugLineNum = 51576837;BA.debugLine="If slot.HasItem Then itemId = slot.Item.GetDefau";
if (_slot._hasitem /*boolean*/ (null)) { 
_itemid = BA.ObjectToString(_slot._item /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)("")));};
RDebugUtils.currentLine=51576838;
 //BA.debugLineNum = 51576838;BA.debugLine="parts.Add(slot.SlotId & \":\" & slot.Role & \":\" &";
_parts.Add((Object)(_slot._slotid /*String*/ +":"+_slot._role /*String*/ +":"+_slot._state /*String*/ +":"+_itemid));
 }
};
RDebugUtils.currentLine=51576840;
 //BA.debugLineNum = 51576840;BA.debugLine="Return JoinParts(parts)";
if (true) return __ref._joinparts /*String*/ (null,_parts);
RDebugUtils.currentLine=51576841;
 //BA.debugLineNum = 51576841;BA.debugLine="End Sub";
return "";
}
public String  _joinparts(b4j.example.playbackdirectorstate __ref,anywheresoftware.b4a.objects.collections.List _parts) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "joinparts", false))
	 {return ((String) Debug.delegate(ba, "joinparts", new Object[] {_parts}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=52232192;
 //BA.debugLineNum = 52232192;BA.debugLine="Private Sub JoinParts(parts As List) As String";
RDebugUtils.currentLine=52232193;
 //BA.debugLineNum = 52232193;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=52232194;
 //BA.debugLineNum = 52232194;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=52232195;
 //BA.debugLineNum = 52232195;BA.debugLine="For i = 0 To parts.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_parts.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=52232196;
 //BA.debugLineNum = 52232196;BA.debugLine="If i > 0 Then sb.Append(\" | \")";
if (_i>0) { 
_sb.Append(" | ");};
RDebugUtils.currentLine=52232197;
 //BA.debugLineNum = 52232197;BA.debugLine="sb.Append(parts.Get(i))";
_sb.Append(BA.ObjectToString(_parts.Get(_i)));
 }
};
RDebugUtils.currentLine=52232199;
 //BA.debugLineNum = 52232199;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=52232200;
 //BA.debugLineNum = 52232200;BA.debugLine="End Sub";
return "";
}
}