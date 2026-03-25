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
RDebugUtils.currentLine=46268416;
 //BA.debugLineNum = 46268416;BA.debugLine="Public Sub SetActive(audioKey As String, item As M";
RDebugUtils.currentLine=46268417;
 //BA.debugLineNum = 46268417;BA.debugLine="Dim currentActiveSlot As PlaybackPlayerSlot = Get";
_currentactiveslot = __ref._getactiveslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=46268418;
 //BA.debugLineNum = 46268418;BA.debugLine="If currentActiveSlot.IsInitialized And currentAct";
if (_currentactiveslot.IsInitialized /*boolean*/ () && (_currentactiveslot._audiokey /*String*/ ).equals(_audiokey) == false) { 
_currentactiveslot._reset /*String*/ (null);};
RDebugUtils.currentLine=46268419;
 //BA.debugLineNum = 46268419;BA.debugLine="ClearSlotByAudioKey(audioKey)";
__ref._clearslotbyaudiokey /*String*/ (null,_audiokey);
RDebugUtils.currentLine=46268420;
 //BA.debugLineNum = 46268420;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=46268421;
 //BA.debugLineNum = 46268421;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=46268422;
 //BA.debugLineNum = 46268422;BA.debugLine="slot.SetRoleState(\"active\", \"playing\")";
_slot._setrolestate /*String*/ (null,"active","playing");
RDebugUtils.currentLine=46268423;
 //BA.debugLineNum = 46268423;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (null,_item);
RDebugUtils.currentLine=46268424;
 //BA.debugLineNum = 46268424;BA.debugLine="slot.MarkProgress";
_slot._markprogress /*String*/ (null);
 };
RDebugUtils.currentLine=46268426;
 //BA.debugLineNum = 46268426;BA.debugLine="End Sub";
return "";
}
public String  _clearrole(b4j.example.playbackdirectorstate __ref,String _rolevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "clearrole", false))
	 {return ((String) Debug.delegate(ba, "clearrole", new Object[] {_rolevalue}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=46006272;
 //BA.debugLineNum = 46006272;BA.debugLine="Public Sub ClearRole(roleValue As String)";
RDebugUtils.currentLine=46006273;
 //BA.debugLineNum = 46006273;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByRole(ro";
_slot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,_rolevalue);
RDebugUtils.currentLine=46006274;
 //BA.debugLineNum = 46006274;BA.debugLine="If slot.IsInitialized Then slot.Reset";
if (_slot.IsInitialized /*boolean*/ ()) { 
_slot._reset /*String*/ (null);};
RDebugUtils.currentLine=46006275;
 //BA.debugLineNum = 46006275;BA.debugLine="End Sub";
return "";
}
public b4j.example.playbackplayerslot  _getactiveslot(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getactiveslot", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getactiveslot", null));}
RDebugUtils.currentLine=45613056;
 //BA.debugLineNum = 45613056;BA.debugLine="Public Sub GetActiveSlot As PlaybackPlayerSlot";
RDebugUtils.currentLine=45613057;
 //BA.debugLineNum = 45613057;BA.debugLine="Return GetSlotByRole(\"active\")";
if (true) return __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"active");
RDebugUtils.currentLine=45613058;
 //BA.debugLineNum = 45613058;BA.debugLine="End Sub";
return null;
}
public b4j.example.playbackplayerslot  _getpendingplayslot(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getpendingplayslot", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getpendingplayslot", null));}
RDebugUtils.currentLine=45744128;
 //BA.debugLineNum = 45744128;BA.debugLine="Public Sub GetPendingPlaySlot As PlaybackPlayerSlo";
RDebugUtils.currentLine=45744129;
 //BA.debugLineNum = 45744129;BA.debugLine="Return GetSlotByRole(\"pending_play\")";
if (true) return __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"pending_play");
RDebugUtils.currentLine=45744130;
 //BA.debugLineNum = 45744130;BA.debugLine="End Sub";
return null;
}
public String  _clearslotbyaudiokey(b4j.example.playbackdirectorstate __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "clearslotbyaudiokey", false))
	 {return ((String) Debug.delegate(ba, "clearslotbyaudiokey", new Object[] {_audiokey}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=45940736;
 //BA.debugLineNum = 45940736;BA.debugLine="Public Sub ClearSlotByAudioKey(audioKey As String)";
RDebugUtils.currentLine=45940737;
 //BA.debugLineNum = 45940737;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=45940738;
 //BA.debugLineNum = 45940738;BA.debugLine="If slot.IsInitialized Then slot.Reset";
if (_slot.IsInitialized /*boolean*/ ()) { 
_slot._reset /*String*/ (null);};
RDebugUtils.currentLine=45940739;
 //BA.debugLineNum = 45940739;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=45285376;
 //BA.debugLineNum = 45285376;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=45285377;
 //BA.debugLineNum = 45285377;BA.debugLine="Slots.Initialize";
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=45285378;
 //BA.debugLineNum = 45285378;BA.debugLine="IsTickInProgress = False";
__ref._istickinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=45285379;
 //BA.debugLineNum = 45285379;BA.debugLine="DecisionEpoch = 0";
__ref._decisionepoch /*long*/  = (long) (0);
RDebugUtils.currentLine=45285380;
 //BA.debugLineNum = 45285380;BA.debugLine="CurrentDecision = \"\"";
__ref._currentdecision /*String*/  = "";
RDebugUtils.currentLine=45285381;
 //BA.debugLineNum = 45285381;BA.debugLine="FlowState = \"idle\"";
__ref._flowstate /*String*/  = "idle";
RDebugUtils.currentLine=45285382;
 //BA.debugLineNum = 45285382;BA.debugLine="End Sub";
return "";
}
public String  _configuredefaultslots(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "configuredefaultslots", false))
	 {return ((String) Debug.delegate(ba, "configuredefaultslots", null));}
RDebugUtils.currentLine=45350912;
 //BA.debugLineNum = 45350912;BA.debugLine="Public Sub ConfigureDefaultSlots";
RDebugUtils.currentLine=45350913;
 //BA.debugLineNum = 45350913;BA.debugLine="If Slots.IsInitialized = False Then Slots.Initial";
if (__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=45350914;
 //BA.debugLineNum = 45350914;BA.debugLine="If Slots.Size > 0 Then Return";
if (__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
if (true) return "";};
RDebugUtils.currentLine=45350915;
 //BA.debugLineNum = 45350915;BA.debugLine="Slots.Add(CreateSlot(\"slot_primary\", \"primary\"))";
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createslot /*b4j.example.playbackplayerslot*/ (null,"slot_primary","primary")));
RDebugUtils.currentLine=45350916;
 //BA.debugLineNum = 45350916;BA.debugLine="Slots.Add(CreateSlot(\"slot_secondary\", \"secondary";
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createslot /*b4j.example.playbackplayerslot*/ (null,"slot_secondary","secondary")));
RDebugUtils.currentLine=45350917;
 //BA.debugLineNum = 45350917;BA.debugLine="Slots.Add(CreateSlot(\"slot_interrupt\", \"\"))";
__ref._slots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createslot /*b4j.example.playbackplayerslot*/ (null,"slot_interrupt","")));
RDebugUtils.currentLine=45350918;
 //BA.debugLineNum = 45350918;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=45678592;
 //BA.debugLineNum = 45678592;BA.debugLine="Public Sub GetPreparedSlot As PlaybackPlayerSlot";
RDebugUtils.currentLine=45678593;
 //BA.debugLineNum = 45678593;BA.debugLine="Dim preparedMusicSlot As PlaybackPlayerSlot = Get";
_preparedmusicslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"prepared_music");
RDebugUtils.currentLine=45678594;
 //BA.debugLineNum = 45678594;BA.debugLine="If preparedMusicSlot.IsInitialized Then Return pr";
if (_preparedmusicslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedmusicslot;};
RDebugUtils.currentLine=45678595;
 //BA.debugLineNum = 45678595;BA.debugLine="Dim preparedInterruptSlot As PlaybackPlayerSlot =";
_preparedinterruptslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"prepared_interrupt");
RDebugUtils.currentLine=45678596;
 //BA.debugLineNum = 45678596;BA.debugLine="If preparedInterruptSlot.IsInitialized Then Retur";
if (_preparedinterruptslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedinterruptslot;};
RDebugUtils.currentLine=45678597;
 //BA.debugLineNum = 45678597;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetSlotB";
_preparedslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"prepared");
RDebugUtils.currentLine=45678598;
 //BA.debugLineNum = 45678598;BA.debugLine="If preparedSlot.IsInitialized Then Return prepare";
if (_preparedslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedslot;};
RDebugUtils.currentLine=45678599;
 //BA.debugLineNum = 45678599;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=45678600;
 //BA.debugLineNum = 45678600;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
RDebugUtils.currentLine=45678601;
 //BA.debugLineNum = 45678601;BA.debugLine="End Sub";
return null;
}
public String  _begindecision(b4j.example.playbackdirectorstate __ref,String _decisionname) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "begindecision", false))
	 {return ((String) Debug.delegate(ba, "begindecision", new Object[] {_decisionname}));}
RDebugUtils.currentLine=46399488;
 //BA.debugLineNum = 46399488;BA.debugLine="Public Sub BeginDecision(decisionName As String)";
RDebugUtils.currentLine=46399489;
 //BA.debugLineNum = 46399489;BA.debugLine="DecisionEpoch = DecisionEpoch + 1";
__ref._decisionepoch /*long*/  = (long) (__ref._decisionepoch /*long*/ +1);
RDebugUtils.currentLine=46399490;
 //BA.debugLineNum = 46399490;BA.debugLine="CurrentDecision = decisionName";
__ref._currentdecision /*String*/  = _decisionname;
RDebugUtils.currentLine=46399491;
 //BA.debugLineNum = 46399491;BA.debugLine="End Sub";
return "";
}
public String  _cleardecision(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "cleardecision", false))
	 {return ((String) Debug.delegate(ba, "cleardecision", null));}
RDebugUtils.currentLine=46530560;
 //BA.debugLineNum = 46530560;BA.debugLine="Public Sub ClearDecision";
RDebugUtils.currentLine=46530561;
 //BA.debugLineNum = 46530561;BA.debugLine="CurrentDecision = \"\"";
__ref._currentdecision /*String*/  = "";
RDebugUtils.currentLine=46530562;
 //BA.debugLineNum = 46530562;BA.debugLine="End Sub";
return "";
}
public String  _setprepared(b4j.example.playbackdirectorstate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "setprepared", false))
	 {return ((String) Debug.delegate(ba, "setprepared", new Object[] {_audiokey,_item}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=46202880;
 //BA.debugLineNum = 46202880;BA.debugLine="Public Sub SetPrepared(audioKey As String, item As";
RDebugUtils.currentLine=46202881;
 //BA.debugLineNum = 46202881;BA.debugLine="ClearSlotByAudioKey(audioKey)";
__ref._clearslotbyaudiokey /*String*/ (null,_audiokey);
RDebugUtils.currentLine=46202882;
 //BA.debugLineNum = 46202882;BA.debugLine="ClearRole(\"prepared_music\")";
__ref._clearrole /*String*/ (null,"prepared_music");
RDebugUtils.currentLine=46202883;
 //BA.debugLineNum = 46202883;BA.debugLine="ClearRole(\"prepared_interrupt\")";
__ref._clearrole /*String*/ (null,"prepared_interrupt");
RDebugUtils.currentLine=46202884;
 //BA.debugLineNum = 46202884;BA.debugLine="ClearRole(\"prepared\")";
__ref._clearrole /*String*/ (null,"prepared");
RDebugUtils.currentLine=46202885;
 //BA.debugLineNum = 46202885;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=46202886;
 //BA.debugLineNum = 46202886;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=46202887;
 //BA.debugLineNum = 46202887;BA.debugLine="slot.SetRoleState(ResolvePreparedRole(item), \"re";
_slot._setrolestate /*String*/ (null,__ref._resolvepreparedrole /*String*/ (null,_item),"ready");
RDebugUtils.currentLine=46202888;
 //BA.debugLineNum = 46202888;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (null,_item);
 };
RDebugUtils.currentLine=46202890;
 //BA.debugLineNum = 46202890;BA.debugLine="End Sub";
return "";
}
public b4j.example.playbackplayerslot  _getslotbyaudiokey(b4j.example.playbackdirectorstate __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getslotbyaudiokey", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getslotbyaudiokey", new Object[] {_audiokey}));}
b4j.example.playbackplayerslot _slot = null;
b4j.example.playbackplayerslot _emptyslot = null;
RDebugUtils.currentLine=45481984;
 //BA.debugLineNum = 45481984;BA.debugLine="Public Sub GetSlotByAudioKey(audioKey As String) A";
RDebugUtils.currentLine=45481985;
 //BA.debugLineNum = 45481985;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._slots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_slot = (b4j.example.playbackplayerslot)(group1.Get(index1));
RDebugUtils.currentLine=45481986;
 //BA.debugLineNum = 45481986;BA.debugLine="If slot.AudioKey = audioKey Then Return slot";
if ((_slot._audiokey /*String*/ ).equals(_audiokey)) { 
if (true) return _slot;};
 }
};
RDebugUtils.currentLine=45481988;
 //BA.debugLineNum = 45481988;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=45481989;
 //BA.debugLineNum = 45481989;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
RDebugUtils.currentLine=45481990;
 //BA.debugLineNum = 45481990;BA.debugLine="End Sub";
return null;
}
public boolean  _haspreparedslot(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "haspreparedslot", false))
	 {return ((Boolean) Debug.delegate(ba, "haspreparedslot", null));}
b4j.example.playbackplayerslot _preparedslot = null;
RDebugUtils.currentLine=45875200;
 //BA.debugLineNum = 45875200;BA.debugLine="Public Sub HasPreparedSlot As Boolean";
RDebugUtils.currentLine=45875201;
 //BA.debugLineNum = 45875201;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetPrepa";
_preparedslot = __ref._getpreparedslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=45875202;
 //BA.debugLineNum = 45875202;BA.debugLine="Return preparedSlot.IsInitialized And preparedSlo";
if (true) return _preparedslot.IsInitialized /*boolean*/ () && _preparedslot._hasitem /*boolean*/ (null);
RDebugUtils.currentLine=45875203;
 //BA.debugLineNum = 45875203;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.playbackdirectorstate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=45219840;
 //BA.debugLineNum = 45219840;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=45219841;
 //BA.debugLineNum = 45219841;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=45219842;
 //BA.debugLineNum = 45219842;BA.debugLine="End Sub";
return "";
}
public String  _setflowstate(b4j.example.playbackdirectorstate __ref,String _statevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "setflowstate", false))
	 {return ((String) Debug.delegate(ba, "setflowstate", new Object[] {_statevalue}));}
RDebugUtils.currentLine=46596096;
 //BA.debugLineNum = 46596096;BA.debugLine="Public Sub SetFlowState(stateValue As String)";
RDebugUtils.currentLine=46596097;
 //BA.debugLineNum = 46596097;BA.debugLine="If stateValue = \"\" Then stateValue = \"idle\"";
if ((_statevalue).equals("")) { 
_statevalue = "idle";};
RDebugUtils.currentLine=46596098;
 //BA.debugLineNum = 46596098;BA.debugLine="FlowState = stateValue";
__ref._flowstate /*String*/  = _statevalue;
RDebugUtils.currentLine=46596099;
 //BA.debugLineNum = 46596099;BA.debugLine="End Sub";
return "";
}
public boolean  _isflowactive(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "isflowactive", false))
	 {return ((Boolean) Debug.delegate(ba, "isflowactive", null));}
RDebugUtils.currentLine=46727168;
 //BA.debugLineNum = 46727168;BA.debugLine="Public Sub IsFlowActive As Boolean";
RDebugUtils.currentLine=46727169;
 //BA.debugLineNum = 46727169;BA.debugLine="Return FlowState = \"playing\" Or FlowState = \"prep";
if (true) return (__ref._flowstate /*String*/ ).equals("playing") || (__ref._flowstate /*String*/ ).equals("preparing") || (__ref._flowstate /*String*/ ).equals("transitioning") || (__ref._flowstate /*String*/ ).equals("starting");
RDebugUtils.currentLine=46727170;
 //BA.debugLineNum = 46727170;BA.debugLine="End Sub";
return false;
}
public boolean  _istransitioninprogress(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "istransitioninprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "istransitioninprogress", null));}
RDebugUtils.currentLine=46661632;
 //BA.debugLineNum = 46661632;BA.debugLine="Public Sub IsTransitionInProgress As Boolean";
RDebugUtils.currentLine=46661633;
 //BA.debugLineNum = 46661633;BA.debugLine="Return FlowState = \"starting\" Or FlowState = \"tra";
if (true) return (__ref._flowstate /*String*/ ).equals("starting") || (__ref._flowstate /*String*/ ).equals("transitioning") || (__ref._flowstate /*String*/ ).equals("stopping");
RDebugUtils.currentLine=46661634;
 //BA.debugLineNum = 46661634;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=45809664;
 //BA.debugLineNum = 45809664;BA.debugLine="Public Sub GetPendingPrepareSlot As PlaybackPlayer";
RDebugUtils.currentLine=45809665;
 //BA.debugLineNum = 45809665;BA.debugLine="Dim pendingPrepareMusicSlot As PlaybackPlayerSlot";
_pendingpreparemusicslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"pending_prepare_music");
RDebugUtils.currentLine=45809666;
 //BA.debugLineNum = 45809666;BA.debugLine="If pendingPrepareMusicSlot.IsInitialized Then Ret";
if (_pendingpreparemusicslot.IsInitialized /*boolean*/ ()) { 
if (true) return _pendingpreparemusicslot;};
RDebugUtils.currentLine=45809667;
 //BA.debugLineNum = 45809667;BA.debugLine="Dim pendingInterruptSlot As PlaybackPlayerSlot =";
_pendinginterruptslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"pending_interrupt");
RDebugUtils.currentLine=45809668;
 //BA.debugLineNum = 45809668;BA.debugLine="If pendingInterruptSlot.IsInitialized Then Return";
if (_pendinginterruptslot.IsInitialized /*boolean*/ ()) { 
if (true) return _pendinginterruptslot;};
RDebugUtils.currentLine=45809669;
 //BA.debugLineNum = 45809669;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = Ge";
_pendingprepareslot = __ref._getslotbyrole /*b4j.example.playbackplayerslot*/ (null,"pending_prepare");
RDebugUtils.currentLine=45809670;
 //BA.debugLineNum = 45809670;BA.debugLine="If pendingPrepareSlot.IsInitialized Then Return p";
if (_pendingprepareslot.IsInitialized /*boolean*/ ()) { 
if (true) return _pendingprepareslot;};
RDebugUtils.currentLine=45809671;
 //BA.debugLineNum = 45809671;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=45809672;
 //BA.debugLineNum = 45809672;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
RDebugUtils.currentLine=45809673;
 //BA.debugLineNum = 45809673;BA.debugLine="End Sub";
return null;
}
public boolean  _trybegindecision(b4j.example.playbackdirectorstate __ref,String _decisionname) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "trybegindecision", false))
	 {return ((Boolean) Debug.delegate(ba, "trybegindecision", new Object[] {_decisionname}));}
RDebugUtils.currentLine=46465024;
 //BA.debugLineNum = 46465024;BA.debugLine="Public Sub TryBeginDecision(decisionName As String";
RDebugUtils.currentLine=46465025;
 //BA.debugLineNum = 46465025;BA.debugLine="If CurrentDecision <> \"\" Then Return False";
if ((__ref._currentdecision /*String*/ ).equals("") == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=46465026;
 //BA.debugLineNum = 46465026;BA.debugLine="BeginDecision(decisionName)";
__ref._begindecision /*String*/ (null,_decisionname);
RDebugUtils.currentLine=46465027;
 //BA.debugLineNum = 46465027;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=46465028;
 //BA.debugLineNum = 46465028;BA.debugLine="End Sub";
return false;
}
public String  _setpendingplay(b4j.example.playbackdirectorstate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "setpendingplay", false))
	 {return ((String) Debug.delegate(ba, "setpendingplay", new Object[] {_audiokey,_item}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=46071808;
 //BA.debugLineNum = 46071808;BA.debugLine="Public Sub SetPendingPlay(audioKey As String, item";
RDebugUtils.currentLine=46071809;
 //BA.debugLineNum = 46071809;BA.debugLine="ClearSlotByAudioKey(audioKey)";
__ref._clearslotbyaudiokey /*String*/ (null,_audiokey);
RDebugUtils.currentLine=46071810;
 //BA.debugLineNum = 46071810;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=46071811;
 //BA.debugLineNum = 46071811;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=46071812;
 //BA.debugLineNum = 46071812;BA.debugLine="slot.SetRoleState(\"pending_play\", \"loading\")";
_slot._setrolestate /*String*/ (null,"pending_play","loading");
RDebugUtils.currentLine=46071813;
 //BA.debugLineNum = 46071813;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (null,_item);
 };
RDebugUtils.currentLine=46071815;
 //BA.debugLineNum = 46071815;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=45416448;
 //BA.debugLineNum = 45416448;BA.debugLine="Public Sub ApplyLegacyRuntime(runtimeState As Play";
RDebugUtils.currentLine=45416449;
 //BA.debugLineNum = 45416449;BA.debugLine="ConfigureDefaultSlots";
__ref._configuredefaultslots /*String*/ (null);
RDebugUtils.currentLine=45416450;
 //BA.debugLineNum = 45416450;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._slots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_slot = (b4j.example.playbackplayerslot)(group2.Get(index2));
RDebugUtils.currentLine=45416451;
 //BA.debugLineNum = 45416451;BA.debugLine="slot.Reset";
_slot._reset /*String*/ (null);
 }
};
RDebugUtils.currentLine=45416453;
 //BA.debugLineNum = 45416453;BA.debugLine="If runtimeState.ActiveAudioKey <> \"\" Then";
if ((_runtimestate._activeaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=45416454;
 //BA.debugLineNum = 45416454;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = GetSlotBy";
_activeslot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_runtimestate._activeaudiokey /*String*/ );
RDebugUtils.currentLine=45416455;
 //BA.debugLineNum = 45416455;BA.debugLine="If activeSlot.IsInitialized Then";
if (_activeslot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=45416456;
 //BA.debugLineNum = 45416456;BA.debugLine="activeSlot.SetRoleState(\"active\", \"playing\")";
_activeslot._setrolestate /*String*/ (null,"active","playing");
RDebugUtils.currentLine=45416457;
 //BA.debugLineNum = 45416457;BA.debugLine="activeSlot.SetItem(runtimeState.ActiveItem)";
_activeslot._setitem /*String*/ (null,_runtimestate._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
RDebugUtils.currentLine=45416460;
 //BA.debugLineNum = 45416460;BA.debugLine="If runtimeState.PendingPlayAudioKey <> \"\" Then";
if ((_runtimestate._pendingplayaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=45416461;
 //BA.debugLineNum = 45416461;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = GetS";
_pendingplayslot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_runtimestate._pendingplayaudiokey /*String*/ );
RDebugUtils.currentLine=45416462;
 //BA.debugLineNum = 45416462;BA.debugLine="If pendingPlaySlot.IsInitialized Then";
if (_pendingplayslot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=45416463;
 //BA.debugLineNum = 45416463;BA.debugLine="pendingPlaySlot.SetRoleState(\"pending_play\", \"l";
_pendingplayslot._setrolestate /*String*/ (null,"pending_play","loading");
RDebugUtils.currentLine=45416464;
 //BA.debugLineNum = 45416464;BA.debugLine="pendingPlaySlot.SetItem(runtimeState.PendingPla";
_pendingplayslot._setitem /*String*/ (null,_runtimestate._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
RDebugUtils.currentLine=45416467;
 //BA.debugLineNum = 45416467;BA.debugLine="If runtimeState.PreparedAudioKey <> \"\" Then";
if ((_runtimestate._preparedaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=45416468;
 //BA.debugLineNum = 45416468;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetSlot";
_preparedslot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_runtimestate._preparedaudiokey /*String*/ );
RDebugUtils.currentLine=45416469;
 //BA.debugLineNum = 45416469;BA.debugLine="If preparedSlot.IsInitialized Then";
if (_preparedslot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=45416470;
 //BA.debugLineNum = 45416470;BA.debugLine="preparedSlot.SetRoleState(ResolvePreparedRole(r";
_preparedslot._setrolestate /*String*/ (null,__ref._resolvepreparedrole /*String*/ (null,_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ ),"ready");
RDebugUtils.currentLine=45416471;
 //BA.debugLineNum = 45416471;BA.debugLine="preparedSlot.SetItem(runtimeState.PreparedItem)";
_preparedslot._setitem /*String*/ (null,_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
RDebugUtils.currentLine=45416474;
 //BA.debugLineNum = 45416474;BA.debugLine="If runtimeState.PendingPrepareAudioKey <> \"\" Then";
if ((_runtimestate._pendingprepareaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=45416475;
 //BA.debugLineNum = 45416475;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = G";
_pendingprepareslot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_runtimestate._pendingprepareaudiokey /*String*/ );
RDebugUtils.currentLine=45416476;
 //BA.debugLineNum = 45416476;BA.debugLine="If pendingPrepareSlot.IsInitialized Then";
if (_pendingprepareslot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=45416477;
 //BA.debugLineNum = 45416477;BA.debugLine="pendingPrepareSlot.SetRoleState(ResolvePendingP";
_pendingprepareslot._setrolestate /*String*/ (null,__ref._resolvependingpreparerole /*String*/ (null,_runtimestate._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ ),"loading");
RDebugUtils.currentLine=45416478;
 //BA.debugLineNum = 45416478;BA.debugLine="pendingPrepareSlot.SetItem(runtimeState.Pending";
_pendingprepareslot._setitem /*String*/ (null,_runtimestate._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
RDebugUtils.currentLine=45416481;
 //BA.debugLineNum = 45416481;BA.debugLine="End Sub";
return "";
}
public String  _setpendingprepare(b4j.example.playbackdirectorstate __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "setpendingprepare", false))
	 {return ((String) Debug.delegate(ba, "setpendingprepare", new Object[] {_audiokey,_item}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=46137344;
 //BA.debugLineNum = 46137344;BA.debugLine="Public Sub SetPendingPrepare(audioKey As String, i";
RDebugUtils.currentLine=46137345;
 //BA.debugLineNum = 46137345;BA.debugLine="ClearSlotByAudioKey(audioKey)";
__ref._clearslotbyaudiokey /*String*/ (null,_audiokey);
RDebugUtils.currentLine=46137346;
 //BA.debugLineNum = 46137346;BA.debugLine="ClearRole(\"pending_prepare_music\")";
__ref._clearrole /*String*/ (null,"pending_prepare_music");
RDebugUtils.currentLine=46137347;
 //BA.debugLineNum = 46137347;BA.debugLine="ClearRole(\"pending_interrupt\")";
__ref._clearrole /*String*/ (null,"pending_interrupt");
RDebugUtils.currentLine=46137348;
 //BA.debugLineNum = 46137348;BA.debugLine="ClearRole(\"pending_prepare\")";
__ref._clearrole /*String*/ (null,"pending_prepare");
RDebugUtils.currentLine=46137349;
 //BA.debugLineNum = 46137349;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = __ref._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=46137350;
 //BA.debugLineNum = 46137350;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=46137351;
 //BA.debugLineNum = 46137351;BA.debugLine="slot.SetRoleState(ResolvePendingPrepareRole(item";
_slot._setrolestate /*String*/ (null,__ref._resolvependingpreparerole /*String*/ (null,_item),"loading");
RDebugUtils.currentLine=46137352;
 //BA.debugLineNum = 46137352;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (null,_item);
 };
RDebugUtils.currentLine=46137354;
 //BA.debugLineNum = 46137354;BA.debugLine="End Sub";
return "";
}
public String  _resolvepreparedrole(b4j.example.playbackdirectorstate __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "resolvepreparedrole", false))
	 {return ((String) Debug.delegate(ba, "resolvepreparedrole", new Object[] {_item}));}
RDebugUtils.currentLine=46792704;
 //BA.debugLineNum = 46792704;BA.debugLine="Private Sub ResolvePreparedRole(item As Map) As St";
RDebugUtils.currentLine=46792705;
 //BA.debugLineNum = 46792705;BA.debugLine="If item.IsInitialized = False Then Return \"prepar";
if (_item.IsInitialized()==__c.False) { 
if (true) return "prepared";};
RDebugUtils.currentLine=46792706;
 //BA.debugLineNum = 46792706;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"ad\" Then Return";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
if (true) return "prepared_interrupt";};
RDebugUtils.currentLine=46792707;
 //BA.debugLineNum = 46792707;BA.debugLine="Return \"prepared_music\"";
if (true) return "prepared_music";
RDebugUtils.currentLine=46792708;
 //BA.debugLineNum = 46792708;BA.debugLine="End Sub";
return "";
}
public String  _resolvependingpreparerole(b4j.example.playbackdirectorstate __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "resolvependingpreparerole", false))
	 {return ((String) Debug.delegate(ba, "resolvependingpreparerole", new Object[] {_item}));}
RDebugUtils.currentLine=46858240;
 //BA.debugLineNum = 46858240;BA.debugLine="Private Sub ResolvePendingPrepareRole(item As Map)";
RDebugUtils.currentLine=46858241;
 //BA.debugLineNum = 46858241;BA.debugLine="If item.IsInitialized = False Then Return \"pendin";
if (_item.IsInitialized()==__c.False) { 
if (true) return "pending_prepare";};
RDebugUtils.currentLine=46858242;
 //BA.debugLineNum = 46858242;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"ad\" Then Return";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
if (true) return "pending_interrupt";};
RDebugUtils.currentLine=46858243;
 //BA.debugLineNum = 46858243;BA.debugLine="Return \"pending_prepare_music\"";
if (true) return "pending_prepare_music";
RDebugUtils.currentLine=46858244;
 //BA.debugLineNum = 46858244;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbackdirectorstate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
RDebugUtils.currentLine=45154304;
 //BA.debugLineNum = 45154304;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=45154305;
 //BA.debugLineNum = 45154305;BA.debugLine="Public Slots As List";
_slots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=45154306;
 //BA.debugLineNum = 45154306;BA.debugLine="Public IsTickInProgress As Boolean";
_istickinprogress = false;
RDebugUtils.currentLine=45154307;
 //BA.debugLineNum = 45154307;BA.debugLine="Public DecisionEpoch As Long";
_decisionepoch = 0L;
RDebugUtils.currentLine=45154308;
 //BA.debugLineNum = 45154308;BA.debugLine="Public CurrentDecision As String";
_currentdecision = "";
RDebugUtils.currentLine=45154309;
 //BA.debugLineNum = 45154309;BA.debugLine="Public FlowState As String";
_flowstate = "";
RDebugUtils.currentLine=45154310;
 //BA.debugLineNum = 45154310;BA.debugLine="End Sub";
return "";
}
public b4j.example.playbackplayerslot  _getslotbyrole(b4j.example.playbackdirectorstate __ref,String _rolevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "getslotbyrole", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "getslotbyrole", new Object[] {_rolevalue}));}
b4j.example.playbackplayerslot _slot = null;
b4j.example.playbackplayerslot _emptyslot = null;
RDebugUtils.currentLine=45547520;
 //BA.debugLineNum = 45547520;BA.debugLine="Public Sub GetSlotByRole(roleValue As String) As P";
RDebugUtils.currentLine=45547521;
 //BA.debugLineNum = 45547521;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._slots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_slot = (b4j.example.playbackplayerslot)(group1.Get(index1));
RDebugUtils.currentLine=45547522;
 //BA.debugLineNum = 45547522;BA.debugLine="If slot.Role = roleValue Then Return slot";
if ((_slot._role /*String*/ ).equals(_rolevalue)) { 
if (true) return _slot;};
 }
};
RDebugUtils.currentLine=45547524;
 //BA.debugLineNum = 45547524;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=45547525;
 //BA.debugLineNum = 45547525;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
RDebugUtils.currentLine=45547526;
 //BA.debugLineNum = 45547526;BA.debugLine="End Sub";
return null;
}
public b4j.example.playbackplayerslot  _createslot(b4j.example.playbackdirectorstate __ref,String _slotidvalue,String _audiokeyvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "createslot", false))
	 {return ((b4j.example.playbackplayerslot) Debug.delegate(ba, "createslot", new Object[] {_slotidvalue,_audiokeyvalue}));}
b4j.example.playbackplayerslot _slot = null;
RDebugUtils.currentLine=46923776;
 //BA.debugLineNum = 46923776;BA.debugLine="Private Sub CreateSlot(slotIdValue As String, audi";
RDebugUtils.currentLine=46923777;
 //BA.debugLineNum = 46923777;BA.debugLine="Dim slot As PlaybackPlayerSlot";
_slot = new b4j.example.playbackplayerslot();
RDebugUtils.currentLine=46923778;
 //BA.debugLineNum = 46923778;BA.debugLine="slot.Initialize(slotIdValue, audioKeyValue)";
_slot._initialize /*String*/ (null,ba,_slotidvalue,_audiokeyvalue);
RDebugUtils.currentLine=46923779;
 //BA.debugLineNum = 46923779;BA.debugLine="Return slot";
if (true) return _slot;
RDebugUtils.currentLine=46923780;
 //BA.debugLineNum = 46923780;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=46333952;
 //BA.debugLineNum = 46333952;BA.debugLine="Public Sub DescribeSlots As String";
RDebugUtils.currentLine=46333953;
 //BA.debugLineNum = 46333953;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=46333954;
 //BA.debugLineNum = 46333954;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=46333955;
 //BA.debugLineNum = 46333955;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._slots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_slot = (b4j.example.playbackplayerslot)(group3.Get(index3));
RDebugUtils.currentLine=46333956;
 //BA.debugLineNum = 46333956;BA.debugLine="Dim itemId As String = \"\"";
_itemid = "";
RDebugUtils.currentLine=46333957;
 //BA.debugLineNum = 46333957;BA.debugLine="If slot.HasItem Then itemId = slot.Item.GetDefau";
if (_slot._hasitem /*boolean*/ (null)) { 
_itemid = BA.ObjectToString(_slot._item /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)("")));};
RDebugUtils.currentLine=46333958;
 //BA.debugLineNum = 46333958;BA.debugLine="parts.Add(slot.SlotId & \":\" & slot.Role & \":\" &";
_parts.Add((Object)(_slot._slotid /*String*/ +":"+_slot._role /*String*/ +":"+_slot._state /*String*/ +":"+_itemid));
 }
};
RDebugUtils.currentLine=46333960;
 //BA.debugLineNum = 46333960;BA.debugLine="Return JoinParts(parts)";
if (true) return __ref._joinparts /*String*/ (null,_parts);
RDebugUtils.currentLine=46333961;
 //BA.debugLineNum = 46333961;BA.debugLine="End Sub";
return "";
}
public String  _joinparts(b4j.example.playbackdirectorstate __ref,anywheresoftware.b4a.objects.collections.List _parts) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdirectorstate";
if (Debug.shouldDelegate(ba, "joinparts", false))
	 {return ((String) Debug.delegate(ba, "joinparts", new Object[] {_parts}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=46989312;
 //BA.debugLineNum = 46989312;BA.debugLine="Private Sub JoinParts(parts As List) As String";
RDebugUtils.currentLine=46989313;
 //BA.debugLineNum = 46989313;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=46989314;
 //BA.debugLineNum = 46989314;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=46989315;
 //BA.debugLineNum = 46989315;BA.debugLine="For i = 0 To parts.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_parts.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=46989316;
 //BA.debugLineNum = 46989316;BA.debugLine="If i > 0 Then sb.Append(\" | \")";
if (_i>0) { 
_sb.Append(" | ");};
RDebugUtils.currentLine=46989317;
 //BA.debugLineNum = 46989317;BA.debugLine="sb.Append(parts.Get(i))";
_sb.Append(BA.ObjectToString(_parts.Get(_i)));
 }
};
RDebugUtils.currentLine=46989319;
 //BA.debugLineNum = 46989319;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=46989320;
 //BA.debugLineNum = 46989320;BA.debugLine="End Sub";
return "";
}
}