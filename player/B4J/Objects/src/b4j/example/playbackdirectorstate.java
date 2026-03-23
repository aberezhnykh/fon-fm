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
RDebugUtils.currentLine=67043328;
 //BA.debugLineNum = 67043328;BA.debugLine="Public Sub SetActive(audioKey As String, item As M";
RDebugUtils.currentLine=67043329;
 //BA.debugLineNum = 67043329;BA.debugLine="Dim currentActiveSlot As PlaybackPlayerSlot = Get";
_currentactiveslot = __ref._getactiveslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=67043330;
 //BA.debugLineNum = 67043330;BA.debugLine="If currentActiveSlot.IsInitialized And currentAct";
if (_currentactiveslot.IsInitialized /*boolean*/ () && (_currentactiveslot._audiokey /*String*/ ).equals(_audiokey) == false) { 
_currentactiveslot._reset /*String*/ (null);};
RDebugUtils.currentLine=67043331;
 //BA.debugLineNum = 67043331;BA.debugLine="ClearSlotByAudioKey(audioKey)";
__ref._clearslotbyaudiokey /*String*/ (null,_audiokey);
RDebugUtils.currentLine=67043332;
 //BA.debugLineNum = 67043332;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=67043333;
 //BA.debugLineNum = 67043333;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=67043334;
 //BA.debugLineNum = 67043334;BA.debugLine="slot.SetRoleState(\"active\", \"playing\")";
_slot._setrolestate /*String*/ (null,"active","playing");
RDebugUtils.currentLine=67043335;
 //BA.debugLineNum = 67043335;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (null,_item);
RDebugUtils.currentLine=67043336;
 //BA.debugLineNum = 67043336;BA.debugLine="slot.MarkProgress";
_slot._markprogress /*String*/ (null);
 };
RDebugUtils.currentLine=67043338;
 //BA.debugLineNum = 67043338;BA.debugLine="End Sub";
return "";
}
public String  _clearrole(b4j.example.playbackdirectorstate __ref,String _rolevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "clearrole", false))
	 {return ((String) Debug.delegate(ba, "clearrole", new Object[] {_rolevalue}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=66846720;
 //BA.debugLineNum = 66846720;BA.debugLine="Public Sub ClearRole(roleValue As String)";
RDebugUtils.currentLine=66846721;
 //BA.debugLineNum = 66846721;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByRole(ro";
_slot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,_rolevalue);
RDebugUtils.currentLine=66846722;
 //BA.debugLineNum = 66846722;BA.debugLine="If slot.IsInitialized Then slot.Reset";
if (_slot.IsInitialized /*boolean*/ ()) { 
_slot._reset /*String*/ (null);};
RDebugUtils.currentLine=66846723;
 //BA.debugLineNum = 66846723;BA.debugLine="End Sub";
return "";
}
public b4j.example.playbackplayerslot  _getactiveslot(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getactiveslot", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getactiveslot", null));}
RDebugUtils.currentLine=66125824;
 //BA.debugLineNum = 66125824;BA.debugLine="Public Sub GetActiveSlot As PlaybackPlayerSlot";
RDebugUtils.currentLine=66125825;
 //BA.debugLineNum = 66125825;BA.debugLine="Return GetSlotByRole(\"active\")";
if (true) return __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"active");
RDebugUtils.currentLine=66125826;
 //BA.debugLineNum = 66125826;BA.debugLine="End Sub";
return null;
}
public b4j.example.playbackplayerslot  _getpendingplayslot(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getpendingplayslot", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getpendingplayslot", null));}
RDebugUtils.currentLine=67174400;
 //BA.debugLineNum = 67174400;BA.debugLine="Public Sub GetPendingPlaySlot As PlaybackPlayerSlo";
RDebugUtils.currentLine=67174401;
 //BA.debugLineNum = 67174401;BA.debugLine="Return GetSlotByRole(\"pending_play\")";
if (true) return __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"pending_play");
RDebugUtils.currentLine=67174402;
 //BA.debugLineNum = 67174402;BA.debugLine="End Sub";
return null;
}
public String  _clearslotbyaudiokey(b4j.example.playbackdirectorstate __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "clearslotbyaudiokey", false))
	 {return ((String) Debug.delegate(ba, "clearslotbyaudiokey", new Object[] {_audiokey}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=66781184;
 //BA.debugLineNum = 66781184;BA.debugLine="Public Sub ClearSlotByAudioKey(audioKey As String)";
RDebugUtils.currentLine=66781185;
 //BA.debugLineNum = 66781185;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=66781186;
 //BA.debugLineNum = 66781186;BA.debugLine="If slot.IsInitialized Then slot.Reset";
if (_slot.IsInitialized /*boolean*/ ()) { 
_slot._reset /*String*/ (null);};
RDebugUtils.currentLine=66781187;
 //BA.debugLineNum = 66781187;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=63963136;
 //BA.debugLineNum = 63963136;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=63963137;
 //BA.debugLineNum = 63963137;BA.debugLine="Slots.Initialize";
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=63963138;
 //BA.debugLineNum = 63963138;BA.debugLine="IsTickInProgress = False";
__ref._istickinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=63963139;
 //BA.debugLineNum = 63963139;BA.debugLine="DecisionEpoch = 0";
__ref._decisionepoch /*long*/  = (long) (0);
RDebugUtils.currentLine=63963140;
 //BA.debugLineNum = 63963140;BA.debugLine="CurrentDecision = \"\"";
__ref._currentdecision /*String*/  = "";
RDebugUtils.currentLine=63963141;
 //BA.debugLineNum = 63963141;BA.debugLine="FlowState = \"idle\"";
__ref._flowstate /*String*/  = "idle";
RDebugUtils.currentLine=63963142;
 //BA.debugLineNum = 63963142;BA.debugLine="End Sub";
return "";
}
public String  _configuredefaultslots(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "configuredefaultslots", false))
	 {return ((String) Debug.delegate(ba, "configuredefaultslots", null));}
RDebugUtils.currentLine=64028672;
 //BA.debugLineNum = 64028672;BA.debugLine="Public Sub ConfigureDefaultSlots";
RDebugUtils.currentLine=64028673;
 //BA.debugLineNum = 64028673;BA.debugLine="If Slots.IsInitialized = False Then Slots.Initial";
if (__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=64028674;
 //BA.debugLineNum = 64028674;BA.debugLine="If Slots.Size > 0 Then Return";
if (__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
if (true) return "";};
RDebugUtils.currentLine=64028675;
 //BA.debugLineNum = 64028675;BA.debugLine="Slots.Add(CreateSlot(\"slot_primary\", \"primary\"))";
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createslot /*b4j.example.playbackplayerslot*/ (null,"slot_primary","primary")));
RDebugUtils.currentLine=64028676;
 //BA.debugLineNum = 64028676;BA.debugLine="Slots.Add(CreateSlot(\"slot_secondary\", \"secondary";
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createslot /*b4j.example.playbackplayerslot*/ (null,"slot_secondary","secondary")));
RDebugUtils.currentLine=64028677;
 //BA.debugLineNum = 64028677;BA.debugLine="Slots.Add(CreateSlot(\"slot_interrupt\", \"\"))";
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createslot /*b4j.example.playbackplayerslot*/ (null,"slot_interrupt","")));
RDebugUtils.currentLine=64028678;
 //BA.debugLineNum = 64028678;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=66191360;
 //BA.debugLineNum = 66191360;BA.debugLine="Public Sub GetPreparedSlot As PlaybackPlayerSlot";
RDebugUtils.currentLine=66191361;
 //BA.debugLineNum = 66191361;BA.debugLine="Dim preparedMusicSlot As PlaybackPlayerSlot = Get";
_preparedmusicslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"prepared_music");
RDebugUtils.currentLine=66191362;
 //BA.debugLineNum = 66191362;BA.debugLine="If preparedMusicSlot.IsInitialized Then Return pr";
if (_preparedmusicslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedmusicslot;};
RDebugUtils.currentLine=66191363;
 //BA.debugLineNum = 66191363;BA.debugLine="Dim preparedInterruptSlot As PlaybackPlayerSlot =";
_preparedinterruptslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"prepared_interrupt");
RDebugUtils.currentLine=66191364;
 //BA.debugLineNum = 66191364;BA.debugLine="If preparedInterruptSlot.IsInitialized Then Retur";
if (_preparedinterruptslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedinterruptslot;};
RDebugUtils.currentLine=66191365;
 //BA.debugLineNum = 66191365;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetSlotB";
_preparedslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"prepared");
RDebugUtils.currentLine=66191366;
 //BA.debugLineNum = 66191366;BA.debugLine="If preparedSlot.IsInitialized Then Return prepare";
if (_preparedslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedslot;};
RDebugUtils.currentLine=66191367;
 //BA.debugLineNum = 66191367;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=66191368;
 //BA.debugLineNum = 66191368;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
RDebugUtils.currentLine=66191369;
 //BA.debugLineNum = 66191369;BA.debugLine="End Sub";
return null;
}
public String  _begindecision(b4j.example.playbackdirectorstate __ref,String _decisionname) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "begindecision", false))
	 {return ((String) Debug.delegate(ba, "begindecision", new Object[] {_decisionname}));}
RDebugUtils.currentLine=65273856;
 //BA.debugLineNum = 65273856;BA.debugLine="Public Sub BeginDecision(decisionName As String)";
RDebugUtils.currentLine=65273857;
 //BA.debugLineNum = 65273857;BA.debugLine="DecisionEpoch = DecisionEpoch + 1";
__ref._decisionepoch /*long*/  = (long) (__ref._decisionepoch /*long*/ +1);
RDebugUtils.currentLine=65273858;
 //BA.debugLineNum = 65273858;BA.debugLine="CurrentDecision = decisionName";
__ref._currentdecision /*String*/  = _decisionname;
RDebugUtils.currentLine=65273859;
 //BA.debugLineNum = 65273859;BA.debugLine="End Sub";
return "";
}
public String  _cleardecision(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "cleardecision", false))
	 {return ((String) Debug.delegate(ba, "cleardecision", null));}
RDebugUtils.currentLine=65339392;
 //BA.debugLineNum = 65339392;BA.debugLine="Public Sub ClearDecision";
RDebugUtils.currentLine=65339393;
 //BA.debugLineNum = 65339393;BA.debugLine="CurrentDecision = \"\"";
__ref._currentdecision /*String*/  = "";
RDebugUtils.currentLine=65339394;
 //BA.debugLineNum = 65339394;BA.debugLine="End Sub";
return "";
}
public String  _setprepared(b4j.example.playbackdirectorstate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "setprepared", false))
	 {return ((String) Debug.delegate(ba, "setprepared", new Object[] {_audiokey,_item}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=66977792;
 //BA.debugLineNum = 66977792;BA.debugLine="Public Sub SetPrepared(audioKey As String, item As";
RDebugUtils.currentLine=66977793;
 //BA.debugLineNum = 66977793;BA.debugLine="ClearSlotByAudioKey(audioKey)";
__ref._clearslotbyaudiokey /*String*/ (null,_audiokey);
RDebugUtils.currentLine=66977794;
 //BA.debugLineNum = 66977794;BA.debugLine="ClearRole(\"prepared_music\")";
__ref._clearrole /*String*/ (null,"prepared_music");
RDebugUtils.currentLine=66977795;
 //BA.debugLineNum = 66977795;BA.debugLine="ClearRole(\"prepared_interrupt\")";
__ref._clearrole /*String*/ (null,"prepared_interrupt");
RDebugUtils.currentLine=66977796;
 //BA.debugLineNum = 66977796;BA.debugLine="ClearRole(\"prepared\")";
__ref._clearrole /*String*/ (null,"prepared");
RDebugUtils.currentLine=66977797;
 //BA.debugLineNum = 66977797;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=66977798;
 //BA.debugLineNum = 66977798;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=66977799;
 //BA.debugLineNum = 66977799;BA.debugLine="slot.SetRoleState(ResolvePreparedRole(item), \"re";
_slot._setrolestate /*String*/ (null,__ref._resolvepreparedrole /*String*/ (null,_item),"ready");
RDebugUtils.currentLine=66977800;
 //BA.debugLineNum = 66977800;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (null,_item);
 };
RDebugUtils.currentLine=66977802;
 //BA.debugLineNum = 66977802;BA.debugLine="End Sub";
return "";
}
public b4j.example.playbackplayerslot  _getslotbyaudiokey(b4j.example.playbackdirectorstate __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getslotbyaudiokey", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getslotbyaudiokey", new Object[] {_audiokey}));}
b4j.example.playbackplayerslot _slot = null;
b4j.example.playbackplayerslot _emptyslot = null;
RDebugUtils.currentLine=64159744;
 //BA.debugLineNum = 64159744;BA.debugLine="Public Sub GetSlotByAudioKey(audioKey As String) A";
RDebugUtils.currentLine=64159745;
 //BA.debugLineNum = 64159745;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._slots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_slot = (b4j.example.playbackplayerslot)(group1.Get(index1));
RDebugUtils.currentLine=64159746;
 //BA.debugLineNum = 64159746;BA.debugLine="If slot.AudioKey = audioKey Then Return slot";
if ((_slot._audiokey /*String*/ ).equals(_audiokey)) { 
if (true) return _slot;};
 }
};
RDebugUtils.currentLine=64159748;
 //BA.debugLineNum = 64159748;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=64159749;
 //BA.debugLineNum = 64159749;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
RDebugUtils.currentLine=64159750;
 //BA.debugLineNum = 64159750;BA.debugLine="End Sub";
return null;
}
public boolean  _haspreparedslot(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "haspreparedslot", false))
	 {return ((Boolean) Debug.delegate(ba, "haspreparedslot", null));}
b4j.example.playbackplayerslot _preparedslot = null;
RDebugUtils.currentLine=66256896;
 //BA.debugLineNum = 66256896;BA.debugLine="Public Sub HasPreparedSlot As Boolean";
RDebugUtils.currentLine=66256897;
 //BA.debugLineNum = 66256897;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetPrepa";
_preparedslot = __ref._getpreparedslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=66256898;
 //BA.debugLineNum = 66256898;BA.debugLine="Return preparedSlot.IsInitialized And preparedSlo";
if (true) return _preparedslot.IsInitialized /*boolean*/ () && _preparedslot._hasitem /*boolean*/ (null);
RDebugUtils.currentLine=66256899;
 //BA.debugLineNum = 66256899;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.playbackdirectorstate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=63897600;
 //BA.debugLineNum = 63897600;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=63897601;
 //BA.debugLineNum = 63897601;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=63897602;
 //BA.debugLineNum = 63897602;BA.debugLine="End Sub";
return "";
}
public String  _setflowstate(b4j.example.playbackdirectorstate __ref,String _statevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "setflowstate", false))
	 {return ((String) Debug.delegate(ba, "setflowstate", new Object[] {_statevalue}));}
RDebugUtils.currentLine=65929216;
 //BA.debugLineNum = 65929216;BA.debugLine="Public Sub SetFlowState(stateValue As String)";
RDebugUtils.currentLine=65929217;
 //BA.debugLineNum = 65929217;BA.debugLine="If stateValue = \"\" Then stateValue = \"idle\"";
if ((_statevalue).equals("")) { 
_statevalue = "idle";};
RDebugUtils.currentLine=65929218;
 //BA.debugLineNum = 65929218;BA.debugLine="FlowState = stateValue";
__ref._flowstate /*String*/  = _statevalue;
RDebugUtils.currentLine=65929219;
 //BA.debugLineNum = 65929219;BA.debugLine="End Sub";
return "";
}
public boolean  _isflowactive(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "isflowactive", false))
	 {return ((Boolean) Debug.delegate(ba, "isflowactive", null));}
RDebugUtils.currentLine=66060288;
 //BA.debugLineNum = 66060288;BA.debugLine="Public Sub IsFlowActive As Boolean";
RDebugUtils.currentLine=66060289;
 //BA.debugLineNum = 66060289;BA.debugLine="Return FlowState = \"playing\" Or FlowState = \"prep";
if (true) return (__ref._flowstate /*String*/ ).equals("playing") || (__ref._flowstate /*String*/ ).equals("preparing") || (__ref._flowstate /*String*/ ).equals("transitioning") || (__ref._flowstate /*String*/ ).equals("starting");
RDebugUtils.currentLine=66060290;
 //BA.debugLineNum = 66060290;BA.debugLine="End Sub";
return false;
}
public boolean  _istransitioninprogress(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "istransitioninprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "istransitioninprogress", null));}
RDebugUtils.currentLine=65994752;
 //BA.debugLineNum = 65994752;BA.debugLine="Public Sub IsTransitionInProgress As Boolean";
RDebugUtils.currentLine=65994753;
 //BA.debugLineNum = 65994753;BA.debugLine="Return FlowState = \"starting\" Or FlowState = \"tra";
if (true) return (__ref._flowstate /*String*/ ).equals("starting") || (__ref._flowstate /*String*/ ).equals("transitioning") || (__ref._flowstate /*String*/ ).equals("stopping");
RDebugUtils.currentLine=65994754;
 //BA.debugLineNum = 65994754;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=67239936;
 //BA.debugLineNum = 67239936;BA.debugLine="Public Sub GetPendingPrepareSlot As PlaybackPlayer";
RDebugUtils.currentLine=67239937;
 //BA.debugLineNum = 67239937;BA.debugLine="Dim pendingPrepareMusicSlot As PlaybackPlayerSlot";
_pendingpreparemusicslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"pending_prepare_music");
RDebugUtils.currentLine=67239938;
 //BA.debugLineNum = 67239938;BA.debugLine="If pendingPrepareMusicSlot.IsInitialized Then Ret";
if (_pendingpreparemusicslot.IsInitialized /*boolean*/ ()) { 
if (true) return _pendingpreparemusicslot;};
RDebugUtils.currentLine=67239939;
 //BA.debugLineNum = 67239939;BA.debugLine="Dim pendingInterruptSlot As PlaybackPlayerSlot =";
_pendinginterruptslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"pending_interrupt");
RDebugUtils.currentLine=67239940;
 //BA.debugLineNum = 67239940;BA.debugLine="If pendingInterruptSlot.IsInitialized Then Return";
if (_pendinginterruptslot.IsInitialized /*boolean*/ ()) { 
if (true) return _pendinginterruptslot;};
RDebugUtils.currentLine=67239941;
 //BA.debugLineNum = 67239941;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = Ge";
_pendingprepareslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"pending_prepare");
RDebugUtils.currentLine=67239942;
 //BA.debugLineNum = 67239942;BA.debugLine="If pendingPrepareSlot.IsInitialized Then Return p";
if (_pendingprepareslot.IsInitialized /*boolean*/ ()) { 
if (true) return _pendingprepareslot;};
RDebugUtils.currentLine=67239943;
 //BA.debugLineNum = 67239943;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=67239944;
 //BA.debugLineNum = 67239944;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
RDebugUtils.currentLine=67239945;
 //BA.debugLineNum = 67239945;BA.debugLine="End Sub";
return null;
}
public boolean  _trybegindecision(b4j.example.playbackdirectorstate __ref,String _decisionname) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "trybegindecision", false))
	 {return ((Boolean) Debug.delegate(ba, "trybegindecision", new Object[] {_decisionname}));}
RDebugUtils.currentLine=67502080;
 //BA.debugLineNum = 67502080;BA.debugLine="Public Sub TryBeginDecision(decisionName As String";
RDebugUtils.currentLine=67502081;
 //BA.debugLineNum = 67502081;BA.debugLine="If CurrentDecision <> \"\" Then Return False";
if ((__ref._currentdecision /*String*/ ).equals("") == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=67502082;
 //BA.debugLineNum = 67502082;BA.debugLine="BeginDecision(decisionName)";
__ref._begindecision /*String*/ (null,_decisionname);
RDebugUtils.currentLine=67502083;
 //BA.debugLineNum = 67502083;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=67502084;
 //BA.debugLineNum = 67502084;BA.debugLine="End Sub";
return false;
}
public String  _setpendingplay(b4j.example.playbackdirectorstate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "setpendingplay", false))
	 {return ((String) Debug.delegate(ba, "setpendingplay", new Object[] {_audiokey,_item}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=66912256;
 //BA.debugLineNum = 66912256;BA.debugLine="Public Sub SetPendingPlay(audioKey As String, item";
RDebugUtils.currentLine=66912257;
 //BA.debugLineNum = 66912257;BA.debugLine="ClearSlotByAudioKey(audioKey)";
__ref._clearslotbyaudiokey /*String*/ (null,_audiokey);
RDebugUtils.currentLine=66912258;
 //BA.debugLineNum = 66912258;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=66912259;
 //BA.debugLineNum = 66912259;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=66912260;
 //BA.debugLineNum = 66912260;BA.debugLine="slot.SetRoleState(\"pending_play\", \"loading\")";
_slot._setrolestate /*String*/ (null,"pending_play","loading");
RDebugUtils.currentLine=66912261;
 //BA.debugLineNum = 66912261;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (null,_item);
 };
RDebugUtils.currentLine=66912263;
 //BA.debugLineNum = 66912263;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=64094208;
 //BA.debugLineNum = 64094208;BA.debugLine="Public Sub ApplyLegacyRuntime(runtimeState As Play";
RDebugUtils.currentLine=64094209;
 //BA.debugLineNum = 64094209;BA.debugLine="ConfigureDefaultSlots";
__ref._configuredefaultslots /*String*/ (null);
RDebugUtils.currentLine=64094210;
 //BA.debugLineNum = 64094210;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._slots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_slot = (b4j.example.playbackplayerslot)(group2.Get(index2));
RDebugUtils.currentLine=64094211;
 //BA.debugLineNum = 64094211;BA.debugLine="slot.Reset";
_slot._reset /*String*/ (null);
 }
};
RDebugUtils.currentLine=64094213;
 //BA.debugLineNum = 64094213;BA.debugLine="If runtimeState.ActiveAudioKey <> \"\" Then";
if ((_runtimestate._activeaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=64094214;
 //BA.debugLineNum = 64094214;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = GetSlotBy";
_activeslot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_runtimestate._activeaudiokey /*String*/ );
RDebugUtils.currentLine=64094215;
 //BA.debugLineNum = 64094215;BA.debugLine="If activeSlot.IsInitialized Then";
if (_activeslot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=64094216;
 //BA.debugLineNum = 64094216;BA.debugLine="activeSlot.SetRoleState(\"active\", \"playing\")";
_activeslot._setrolestate /*String*/ (null,"active","playing");
RDebugUtils.currentLine=64094217;
 //BA.debugLineNum = 64094217;BA.debugLine="activeSlot.SetItem(runtimeState.ActiveItem)";
_activeslot._setitem /*String*/ (null,_runtimestate._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
RDebugUtils.currentLine=64094220;
 //BA.debugLineNum = 64094220;BA.debugLine="If runtimeState.PendingPlayAudioKey <> \"\" Then";
if ((_runtimestate._pendingplayaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=64094221;
 //BA.debugLineNum = 64094221;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = GetS";
_pendingplayslot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_runtimestate._pendingplayaudiokey /*String*/ );
RDebugUtils.currentLine=64094222;
 //BA.debugLineNum = 64094222;BA.debugLine="If pendingPlaySlot.IsInitialized Then";
if (_pendingplayslot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=64094223;
 //BA.debugLineNum = 64094223;BA.debugLine="pendingPlaySlot.SetRoleState(\"pending_play\", \"l";
_pendingplayslot._setrolestate /*String*/ (null,"pending_play","loading");
RDebugUtils.currentLine=64094224;
 //BA.debugLineNum = 64094224;BA.debugLine="pendingPlaySlot.SetItem(runtimeState.PendingPla";
_pendingplayslot._setitem /*String*/ (null,_runtimestate._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
RDebugUtils.currentLine=64094227;
 //BA.debugLineNum = 64094227;BA.debugLine="If runtimeState.PreparedAudioKey <> \"\" Then";
if ((_runtimestate._preparedaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=64094228;
 //BA.debugLineNum = 64094228;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetSlot";
_preparedslot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_runtimestate._preparedaudiokey /*String*/ );
RDebugUtils.currentLine=64094229;
 //BA.debugLineNum = 64094229;BA.debugLine="If preparedSlot.IsInitialized Then";
if (_preparedslot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=64094230;
 //BA.debugLineNum = 64094230;BA.debugLine="preparedSlot.SetRoleState(ResolvePreparedRole(r";
_preparedslot._setrolestate /*String*/ (null,__ref._resolvepreparedrole /*String*/ (null,_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ ),"ready");
RDebugUtils.currentLine=64094231;
 //BA.debugLineNum = 64094231;BA.debugLine="preparedSlot.SetItem(runtimeState.PreparedItem)";
_preparedslot._setitem /*String*/ (null,_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
RDebugUtils.currentLine=64094234;
 //BA.debugLineNum = 64094234;BA.debugLine="If runtimeState.PendingPrepareAudioKey <> \"\" Then";
if ((_runtimestate._pendingprepareaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=64094235;
 //BA.debugLineNum = 64094235;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = G";
_pendingprepareslot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_runtimestate._pendingprepareaudiokey /*String*/ );
RDebugUtils.currentLine=64094236;
 //BA.debugLineNum = 64094236;BA.debugLine="If pendingPrepareSlot.IsInitialized Then";
if (_pendingprepareslot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=64094237;
 //BA.debugLineNum = 64094237;BA.debugLine="pendingPrepareSlot.SetRoleState(ResolvePendingP";
_pendingprepareslot._setrolestate /*String*/ (null,__ref._resolvependingpreparerole /*String*/ (null,_runtimestate._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ ),"loading");
RDebugUtils.currentLine=64094238;
 //BA.debugLineNum = 64094238;BA.debugLine="pendingPrepareSlot.SetItem(runtimeState.Pending";
_pendingprepareslot._setitem /*String*/ (null,_runtimestate._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
RDebugUtils.currentLine=64094241;
 //BA.debugLineNum = 64094241;BA.debugLine="End Sub";
return "";
}
public String  _setpendingprepare(b4j.example.playbackdirectorstate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "setpendingprepare", false))
	 {return ((String) Debug.delegate(ba, "setpendingprepare", new Object[] {_audiokey,_item}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=67305472;
 //BA.debugLineNum = 67305472;BA.debugLine="Public Sub SetPendingPrepare(audioKey As String, i";
RDebugUtils.currentLine=67305473;
 //BA.debugLineNum = 67305473;BA.debugLine="ClearSlotByAudioKey(audioKey)";
__ref._clearslotbyaudiokey /*String*/ (null,_audiokey);
RDebugUtils.currentLine=67305474;
 //BA.debugLineNum = 67305474;BA.debugLine="ClearRole(\"pending_prepare_music\")";
__ref._clearrole /*String*/ (null,"pending_prepare_music");
RDebugUtils.currentLine=67305475;
 //BA.debugLineNum = 67305475;BA.debugLine="ClearRole(\"pending_interrupt\")";
__ref._clearrole /*String*/ (null,"pending_interrupt");
RDebugUtils.currentLine=67305476;
 //BA.debugLineNum = 67305476;BA.debugLine="ClearRole(\"pending_prepare\")";
__ref._clearrole /*String*/ (null,"pending_prepare");
RDebugUtils.currentLine=67305477;
 //BA.debugLineNum = 67305477;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=67305478;
 //BA.debugLineNum = 67305478;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=67305479;
 //BA.debugLineNum = 67305479;BA.debugLine="slot.SetRoleState(ResolvePendingPrepareRole(item";
_slot._setrolestate /*String*/ (null,__ref._resolvependingpreparerole /*String*/ (null,_item),"loading");
RDebugUtils.currentLine=67305480;
 //BA.debugLineNum = 67305480;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (null,_item);
 };
RDebugUtils.currentLine=67305482;
 //BA.debugLineNum = 67305482;BA.debugLine="End Sub";
return "";
}
public String  _resolvepreparedrole(b4j.example.playbackdirectorstate __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "resolvepreparedrole", false))
	 {return ((String) Debug.delegate(ba, "resolvepreparedrole", new Object[] {_item}));}
RDebugUtils.currentLine=64356352;
 //BA.debugLineNum = 64356352;BA.debugLine="Private Sub ResolvePreparedRole(item As Map) As St";
RDebugUtils.currentLine=64356353;
 //BA.debugLineNum = 64356353;BA.debugLine="If item.IsInitialized = False Then Return \"prepar";
if (_item.IsInitialized()==__c.False) { 
if (true) return "prepared";};
RDebugUtils.currentLine=64356354;
 //BA.debugLineNum = 64356354;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"ad\" Then Return";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
if (true) return "prepared_interrupt";};
RDebugUtils.currentLine=64356355;
 //BA.debugLineNum = 64356355;BA.debugLine="Return \"prepared_music\"";
if (true) return "prepared_music";
RDebugUtils.currentLine=64356356;
 //BA.debugLineNum = 64356356;BA.debugLine="End Sub";
return "";
}
public String  _resolvependingpreparerole(b4j.example.playbackdirectorstate __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "resolvependingpreparerole", false))
	 {return ((String) Debug.delegate(ba, "resolvependingpreparerole", new Object[] {_item}));}
RDebugUtils.currentLine=64421888;
 //BA.debugLineNum = 64421888;BA.debugLine="Private Sub ResolvePendingPrepareRole(item As Map)";
RDebugUtils.currentLine=64421889;
 //BA.debugLineNum = 64421889;BA.debugLine="If item.IsInitialized = False Then Return \"pendin";
if (_item.IsInitialized()==__c.False) { 
if (true) return "pending_prepare";};
RDebugUtils.currentLine=64421890;
 //BA.debugLineNum = 64421890;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"ad\" Then Return";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
if (true) return "pending_interrupt";};
RDebugUtils.currentLine=64421891;
 //BA.debugLineNum = 64421891;BA.debugLine="Return \"pending_prepare_music\"";
if (true) return "pending_prepare_music";
RDebugUtils.currentLine=64421892;
 //BA.debugLineNum = 64421892;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
RDebugUtils.currentLine=63832064;
 //BA.debugLineNum = 63832064;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=63832065;
 //BA.debugLineNum = 63832065;BA.debugLine="Public Slots As List";
_slots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=63832066;
 //BA.debugLineNum = 63832066;BA.debugLine="Public IsTickInProgress As Boolean";
_istickinprogress = false;
RDebugUtils.currentLine=63832067;
 //BA.debugLineNum = 63832067;BA.debugLine="Public DecisionEpoch As Long";
_decisionepoch = 0L;
RDebugUtils.currentLine=63832068;
 //BA.debugLineNum = 63832068;BA.debugLine="Public CurrentDecision As String";
_currentdecision = "";
RDebugUtils.currentLine=63832069;
 //BA.debugLineNum = 63832069;BA.debugLine="Public FlowState As String";
_flowstate = "";
RDebugUtils.currentLine=63832070;
 //BA.debugLineNum = 63832070;BA.debugLine="End Sub";
return "";
}
public b4j.example.playbackplayerslot  _getslotbyrole(b4j.example.playbackdirectorstate __ref,String _rolevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getslotbyrole", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getslotbyrole", new Object[] {_rolevalue}));}
b4j.example.playbackplayerslot _slot = null;
b4j.example.playbackplayerslot _emptyslot = null;
RDebugUtils.currentLine=64225280;
 //BA.debugLineNum = 64225280;BA.debugLine="Public Sub GetSlotByRole(roleValue As String) As P";
RDebugUtils.currentLine=64225281;
 //BA.debugLineNum = 64225281;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._slots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_slot = (b4j.example.playbackplayerslot)(group1.Get(index1));
RDebugUtils.currentLine=64225282;
 //BA.debugLineNum = 64225282;BA.debugLine="If slot.Role = roleValue Then Return slot";
if ((_slot._role /*String*/ ).equals(_rolevalue)) { 
if (true) return _slot;};
 }
};
RDebugUtils.currentLine=64225284;
 //BA.debugLineNum = 64225284;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=64225285;
 //BA.debugLineNum = 64225285;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
RDebugUtils.currentLine=64225286;
 //BA.debugLineNum = 64225286;BA.debugLine="End Sub";
return null;
}
public b4j.example.playbackplayerslot  _createslot(b4j.example.playbackdirectorstate __ref,String _slotidvalue,String _audiokeyvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "createslot", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "createslot", new Object[] {_slotidvalue,_audiokeyvalue}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=64487424;
 //BA.debugLineNum = 64487424;BA.debugLine="Private Sub CreateSlot(slotIdValue As String, audi";
RDebugUtils.currentLine=64487425;
 //BA.debugLineNum = 64487425;BA.debugLine="Dim slot As PlaybackPlayerSlot";
_slot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=64487426;
 //BA.debugLineNum = 64487426;BA.debugLine="slot.Initialize(slotIdValue, audioKeyValue)";
_slot._initialize /*String*/ (null,ba,_slotidvalue,_audiokeyvalue);
RDebugUtils.currentLine=64487427;
 //BA.debugLineNum = 64487427;BA.debugLine="Return slot";
if (true) return _slot;
RDebugUtils.currentLine=64487428;
 //BA.debugLineNum = 64487428;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=64290816;
 //BA.debugLineNum = 64290816;BA.debugLine="Public Sub DescribeSlots As String";
RDebugUtils.currentLine=64290817;
 //BA.debugLineNum = 64290817;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=64290818;
 //BA.debugLineNum = 64290818;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=64290819;
 //BA.debugLineNum = 64290819;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._slots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_slot = (b4j.example.playbackplayerslot)(group3.Get(index3));
RDebugUtils.currentLine=64290820;
 //BA.debugLineNum = 64290820;BA.debugLine="Dim itemId As String = \"\"";
_itemid = "";
RDebugUtils.currentLine=64290821;
 //BA.debugLineNum = 64290821;BA.debugLine="If slot.HasItem Then itemId = slot.Item.GetDefau";
if (_slot._hasitem /*boolean*/ (null)) { 
_itemid = BA.ObjectToString(_slot._item /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)("")));};
RDebugUtils.currentLine=64290822;
 //BA.debugLineNum = 64290822;BA.debugLine="parts.Add(slot.SlotId & \":\" & slot.Role & \":\" &";
_parts.Add((Object)(_slot._slotid /*String*/ +":"+_slot._role /*String*/ +":"+_slot._state /*String*/ +":"+_itemid));
 }
};
RDebugUtils.currentLine=64290824;
 //BA.debugLineNum = 64290824;BA.debugLine="Return JoinParts(parts)";
if (true) return __ref._joinparts /*String*/ (null,_parts);
RDebugUtils.currentLine=64290825;
 //BA.debugLineNum = 64290825;BA.debugLine="End Sub";
return "";
}
public String  _joinparts(b4j.example.playbackdirectorstate __ref,anywheresoftware.b4a.objects.collections.List _parts) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "joinparts", false))
	 {return ((String) Debug.delegate(ba, "joinparts", new Object[] {_parts}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=64552960;
 //BA.debugLineNum = 64552960;BA.debugLine="Private Sub JoinParts(parts As List) As String";
RDebugUtils.currentLine=64552961;
 //BA.debugLineNum = 64552961;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=64552962;
 //BA.debugLineNum = 64552962;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=64552963;
 //BA.debugLineNum = 64552963;BA.debugLine="For i = 0 To parts.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_parts.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=64552964;
 //BA.debugLineNum = 64552964;BA.debugLine="If i > 0 Then sb.Append(\" | \")";
if (_i>0) { 
_sb.Append(" | ");};
RDebugUtils.currentLine=64552965;
 //BA.debugLineNum = 64552965;BA.debugLine="sb.Append(parts.Get(i))";
_sb.Append(BA.ObjectToString(_parts.Get(_i)));
 }
};
RDebugUtils.currentLine=64552967;
 //BA.debugLineNum = 64552967;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=64552968;
 //BA.debugLineNum = 64552968;BA.debugLine="End Sub";
return "";
}
}