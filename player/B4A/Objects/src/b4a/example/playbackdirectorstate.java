package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playbackdirectorstate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playbackdirectorstate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playbackdirectorstate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _slots = null;
public boolean _istickinprogress = false;
public long _decisionepoch = 0L;
public String _currentdecision = "";
public String _flowstate = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _applylegacyruntime(b4a.example.playbackruntimestate _runtimestate) throws Exception{
b4a.example.playbackplayerslot _slot = null;
b4a.example.playbackplayerslot _activeslot = null;
b4a.example.playbackplayerslot _pendingplayslot = null;
b4a.example.playbackplayerslot _preparedslot = null;
b4a.example.playbackplayerslot _pendingprepareslot = null;
 //BA.debugLineNum = 35;BA.debugLine="Public Sub ApplyLegacyRuntime(runtimeState As Play";
 //BA.debugLineNum = 36;BA.debugLine="ConfigureDefaultSlots";
_configuredefaultslots();
 //BA.debugLineNum = 37;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group2 = _slots;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_slot = (b4a.example.playbackplayerslot)(group2.Get(index2));
 //BA.debugLineNum = 38;BA.debugLine="slot.Reset";
_slot._reset /*String*/ ();
 }
};
 //BA.debugLineNum = 40;BA.debugLine="If runtimeState.ActiveAudioKey <> \"\" Then";
if ((_runtimestate._activeaudiokey /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 41;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = GetSlotBy";
_activeslot = _getslotbyaudiokey(_runtimestate._activeaudiokey /*String*/ );
 //BA.debugLineNum = 42;BA.debugLine="If activeSlot.IsInitialized Then";
if (_activeslot.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 43;BA.debugLine="activeSlot.SetRoleState(\"active\", \"playing\")";
_activeslot._setrolestate /*String*/ ("active","playing");
 //BA.debugLineNum = 44;BA.debugLine="activeSlot.SetItem(runtimeState.ActiveItem)";
_activeslot._setitem /*String*/ (_runtimestate._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
 //BA.debugLineNum = 47;BA.debugLine="If runtimeState.PendingPlayAudioKey <> \"\" Then";
if ((_runtimestate._pendingplayaudiokey /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 48;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = GetS";
_pendingplayslot = _getslotbyaudiokey(_runtimestate._pendingplayaudiokey /*String*/ );
 //BA.debugLineNum = 49;BA.debugLine="If pendingPlaySlot.IsInitialized Then";
if (_pendingplayslot.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 50;BA.debugLine="pendingPlaySlot.SetRoleState(\"pending_play\", \"l";
_pendingplayslot._setrolestate /*String*/ ("pending_play","loading");
 //BA.debugLineNum = 51;BA.debugLine="pendingPlaySlot.SetItem(runtimeState.PendingPla";
_pendingplayslot._setitem /*String*/ (_runtimestate._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
 //BA.debugLineNum = 54;BA.debugLine="If runtimeState.PreparedAudioKey <> \"\" Then";
if ((_runtimestate._preparedaudiokey /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 55;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetSlot";
_preparedslot = _getslotbyaudiokey(_runtimestate._preparedaudiokey /*String*/ );
 //BA.debugLineNum = 56;BA.debugLine="If preparedSlot.IsInitialized Then";
if (_preparedslot.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 57;BA.debugLine="preparedSlot.SetRoleState(ResolvePreparedRole(r";
_preparedslot._setrolestate /*String*/ (_resolvepreparedrole(_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ ),"ready");
 //BA.debugLineNum = 58;BA.debugLine="preparedSlot.SetItem(runtimeState.PreparedItem)";
_preparedslot._setitem /*String*/ (_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
 //BA.debugLineNum = 61;BA.debugLine="If runtimeState.PendingPrepareAudioKey <> \"\" Then";
if ((_runtimestate._pendingprepareaudiokey /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 62;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = G";
_pendingprepareslot = _getslotbyaudiokey(_runtimestate._pendingprepareaudiokey /*String*/ );
 //BA.debugLineNum = 63;BA.debugLine="If pendingPrepareSlot.IsInitialized Then";
if (_pendingprepareslot.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 64;BA.debugLine="pendingPrepareSlot.SetRoleState(ResolvePendingP";
_pendingprepareslot._setrolestate /*String*/ (_resolvependingpreparerole(_runtimestate._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ ),"loading");
 //BA.debugLineNum = 65;BA.debugLine="pendingPrepareSlot.SetItem(runtimeState.Pending";
_pendingprepareslot._setitem /*String*/ (_runtimestate._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 };
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _begindecision(String _decisionname) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Public Sub BeginDecision(decisionName As String)";
 //BA.debugLineNum = 203;BA.debugLine="DecisionEpoch = DecisionEpoch + 1";
_decisionepoch = (long) (_decisionepoch+1);
 //BA.debugLineNum = 204;BA.debugLine="CurrentDecision = decisionName";
_currentdecision = _decisionname;
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public Slots As List";
_slots = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Public IsTickInProgress As Boolean";
_istickinprogress = false;
 //BA.debugLineNum = 8;BA.debugLine="Public DecisionEpoch As Long";
_decisionepoch = 0L;
 //BA.debugLineNum = 9;BA.debugLine="Public CurrentDecision As String";
_currentdecision = "";
 //BA.debugLineNum = 10;BA.debugLine="Public FlowState As String";
_flowstate = "";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _cleardecision() throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Public Sub ClearDecision";
 //BA.debugLineNum = 215;BA.debugLine="CurrentDecision = \"\"";
_currentdecision = "";
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return "";
}
public String  _clearrole(String _rolevalue) throws Exception{
b4a.example.playbackplayerslot _slot = null;
 //BA.debugLineNum = 128;BA.debugLine="Public Sub ClearRole(roleValue As String)";
 //BA.debugLineNum = 129;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByRole(ro";
_slot = _getslotbyrole(_rolevalue);
 //BA.debugLineNum = 130;BA.debugLine="If slot.IsInitialized Then slot.Reset";
if (_slot.IsInitialized /*boolean*/ ()) { 
_slot._reset /*String*/ ();};
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _clearslotbyaudiokey(String _audiokey) throws Exception{
b4a.example.playbackplayerslot _slot = null;
 //BA.debugLineNum = 123;BA.debugLine="Public Sub ClearSlotByAudioKey(audioKey As String)";
 //BA.debugLineNum = 124;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = _getslotbyaudiokey(_audiokey);
 //BA.debugLineNum = 125;BA.debugLine="If slot.IsInitialized Then slot.Reset";
if (_slot.IsInitialized /*boolean*/ ()) { 
_slot._reset /*String*/ ();};
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _configuredefaultslots() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub ConfigureDefaultSlots";
 //BA.debugLineNum = 27;BA.debugLine="If Slots.IsInitialized = False Then Slots.Initial";
if (_slots.IsInitialized()==__c.False) { 
_slots.Initialize();};
 //BA.debugLineNum = 28;BA.debugLine="If Slots.Size > 0 Then Return";
if (_slots.getSize()>0) { 
if (true) return "";};
 //BA.debugLineNum = 29;BA.debugLine="Slots.Add(CreateSlot(\"slot_primary\", \"primary\"))";
_slots.Add((Object)(_createslot("slot_primary","primary")));
 //BA.debugLineNum = 30;BA.debugLine="Slots.Add(CreateSlot(\"slot_secondary\", \"secondary";
_slots.Add((Object)(_createslot("slot_secondary","secondary")));
 //BA.debugLineNum = 31;BA.debugLine="Slots.Add(CreateSlot(\"slot_interrupt\", \"\"))";
_slots.Add((Object)(_createslot("slot_interrupt","")));
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public b4a.example.playbackplayerslot  _createslot(String _slotidvalue,String _audiokeyvalue) throws Exception{
b4a.example.playbackplayerslot _slot = null;
 //BA.debugLineNum = 244;BA.debugLine="Private Sub CreateSlot(slotIdValue As String, audi";
 //BA.debugLineNum = 245;BA.debugLine="Dim slot As PlaybackPlayerSlot";
_slot = new b4a.example.playbackplayerslot();
 //BA.debugLineNum = 246;BA.debugLine="slot.Initialize(slotIdValue, audioKeyValue)";
_slot._initialize /*String*/ (ba,_slotidvalue,_audiokeyvalue);
 //BA.debugLineNum = 247;BA.debugLine="Return slot";
if (true) return _slot;
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public String  _describeslots() throws Exception{
anywheresoftware.b4a.objects.collections.List _parts = null;
b4a.example.playbackplayerslot _slot = null;
String _itemid = "";
 //BA.debugLineNum = 191;BA.debugLine="Public Sub DescribeSlots As String";
 //BA.debugLineNum = 192;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 193;BA.debugLine="parts.Initialize";
_parts.Initialize();
 //BA.debugLineNum = 194;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group3 = _slots;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_slot = (b4a.example.playbackplayerslot)(group3.Get(index3));
 //BA.debugLineNum = 195;BA.debugLine="Dim itemId As String = \"\"";
_itemid = "";
 //BA.debugLineNum = 196;BA.debugLine="If slot.HasItem Then itemId = slot.Item.GetDefau";
if (_slot._hasitem /*boolean*/ ()) { 
_itemid = BA.ObjectToString(_slot._item /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)("")));};
 //BA.debugLineNum = 197;BA.debugLine="parts.Add(slot.SlotId & \":\" & slot.Role & \":\" &";
_parts.Add((Object)(_slot._slotid /*String*/ +":"+_slot._role /*String*/ +":"+_slot._state /*String*/ +":"+_itemid));
 }
};
 //BA.debugLineNum = 199;BA.debugLine="Return JoinParts(parts)";
if (true) return _joinparts(_parts);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return "";
}
public b4a.example.playbackplayerslot  _getactiveslot() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub GetActiveSlot As PlaybackPlayerSlot";
 //BA.debugLineNum = 87;BA.debugLine="Return GetSlotByRole(\"active\")";
if (true) return _getslotbyrole("active");
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4a.example.playbackplayerslot  _getpendingplayslot() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub GetPendingPlaySlot As PlaybackPlayerSlo";
 //BA.debugLineNum = 103;BA.debugLine="Return GetSlotByRole(\"pending_play\")";
if (true) return _getslotbyrole("pending_play");
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4a.example.playbackplayerslot  _getpendingprepareslot() throws Exception{
b4a.example.playbackplayerslot _pendingpreparemusicslot = null;
b4a.example.playbackplayerslot _pendinginterruptslot = null;
b4a.example.playbackplayerslot _pendingprepareslot = null;
b4a.example.playbackplayerslot _emptyslot = null;
 //BA.debugLineNum = 107;BA.debugLine="Public Sub GetPendingPrepareSlot As PlaybackPlayer";
 //BA.debugLineNum = 108;BA.debugLine="Dim pendingPrepareMusicSlot As PlaybackPlayerSlot";
_pendingpreparemusicslot = _getslotbyrole("pending_prepare_music");
 //BA.debugLineNum = 109;BA.debugLine="If pendingPrepareMusicSlot.IsInitialized Then Ret";
if (_pendingpreparemusicslot.IsInitialized /*boolean*/ ()) { 
if (true) return _pendingpreparemusicslot;};
 //BA.debugLineNum = 110;BA.debugLine="Dim pendingInterruptSlot As PlaybackPlayerSlot =";
_pendinginterruptslot = _getslotbyrole("pending_interrupt");
 //BA.debugLineNum = 111;BA.debugLine="If pendingInterruptSlot.IsInitialized Then Return";
if (_pendinginterruptslot.IsInitialized /*boolean*/ ()) { 
if (true) return _pendinginterruptslot;};
 //BA.debugLineNum = 112;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = Ge";
_pendingprepareslot = _getslotbyrole("pending_prepare");
 //BA.debugLineNum = 113;BA.debugLine="If pendingPrepareSlot.IsInitialized Then Return p";
if (_pendingprepareslot.IsInitialized /*boolean*/ ()) { 
if (true) return _pendingprepareslot;};
 //BA.debugLineNum = 114;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4a.example.playbackplayerslot();
 //BA.debugLineNum = 115;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4a.example.playbackplayerslot  _getpreparedslot() throws Exception{
b4a.example.playbackplayerslot _preparedmusicslot = null;
b4a.example.playbackplayerslot _preparedinterruptslot = null;
b4a.example.playbackplayerslot _preparedslot = null;
b4a.example.playbackplayerslot _emptyslot = null;
 //BA.debugLineNum = 91;BA.debugLine="Public Sub GetPreparedSlot As PlaybackPlayerSlot";
 //BA.debugLineNum = 92;BA.debugLine="Dim preparedMusicSlot As PlaybackPlayerSlot = Get";
_preparedmusicslot = _getslotbyrole("prepared_music");
 //BA.debugLineNum = 93;BA.debugLine="If preparedMusicSlot.IsInitialized Then Return pr";
if (_preparedmusicslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedmusicslot;};
 //BA.debugLineNum = 94;BA.debugLine="Dim preparedInterruptSlot As PlaybackPlayerSlot =";
_preparedinterruptslot = _getslotbyrole("prepared_interrupt");
 //BA.debugLineNum = 95;BA.debugLine="If preparedInterruptSlot.IsInitialized Then Retur";
if (_preparedinterruptslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedinterruptslot;};
 //BA.debugLineNum = 96;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetSlotB";
_preparedslot = _getslotbyrole("prepared");
 //BA.debugLineNum = 97;BA.debugLine="If preparedSlot.IsInitialized Then Return prepare";
if (_preparedslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedslot;};
 //BA.debugLineNum = 98;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4a.example.playbackplayerslot();
 //BA.debugLineNum = 99;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4a.example.playbackplayerslot  _getslotbyaudiokey(String _audiokey) throws Exception{
b4a.example.playbackplayerslot _slot = null;
b4a.example.playbackplayerslot _emptyslot = null;
 //BA.debugLineNum = 70;BA.debugLine="Public Sub GetSlotByAudioKey(audioKey As String) A";
 //BA.debugLineNum = 71;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group1 = _slots;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_slot = (b4a.example.playbackplayerslot)(group1.Get(index1));
 //BA.debugLineNum = 72;BA.debugLine="If slot.AudioKey = audioKey Then Return slot";
if ((_slot._audiokey /*String*/ ).equals(_audiokey)) { 
if (true) return _slot;};
 }
};
 //BA.debugLineNum = 74;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4a.example.playbackplayerslot();
 //BA.debugLineNum = 75;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4a.example.playbackplayerslot  _getslotbyrole(String _rolevalue) throws Exception{
b4a.example.playbackplayerslot _slot = null;
b4a.example.playbackplayerslot _emptyslot = null;
 //BA.debugLineNum = 78;BA.debugLine="Public Sub GetSlotByRole(roleValue As String) As P";
 //BA.debugLineNum = 79;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
{
final anywheresoftware.b4a.BA.IterableList group1 = _slots;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_slot = (b4a.example.playbackplayerslot)(group1.Get(index1));
 //BA.debugLineNum = 80;BA.debugLine="If slot.Role = roleValue Then Return slot";
if ((_slot._role /*String*/ ).equals(_rolevalue)) { 
if (true) return _slot;};
 }
};
 //BA.debugLineNum = 82;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
_emptyslot = new b4a.example.playbackplayerslot();
 //BA.debugLineNum = 83;BA.debugLine="Return emptySlot";
if (true) return _emptyslot;
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public boolean  _haspreparedslot() throws Exception{
b4a.example.playbackplayerslot _preparedslot = null;
 //BA.debugLineNum = 118;BA.debugLine="Public Sub HasPreparedSlot As Boolean";
 //BA.debugLineNum = 119;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetPrepa";
_preparedslot = _getpreparedslot();
 //BA.debugLineNum = 120;BA.debugLine="Return preparedSlot.IsInitialized And preparedSlo";
if (true) return _preparedslot.IsInitialized /*boolean*/ () && _preparedslot._hasitem /*boolean*/ ();
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 14;BA.debugLine="Reset";
_reset();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public boolean  _isflowactive() throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Public Sub IsFlowActive As Boolean";
 //BA.debugLineNum = 228;BA.debugLine="Return FlowState = \"playing\" Or FlowState = \"prep";
if (true) return (_flowstate).equals("playing") || (_flowstate).equals("preparing") || (_flowstate).equals("transitioning") || (_flowstate).equals("starting");
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return false;
}
public boolean  _istransitioninprogress() throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Public Sub IsTransitionInProgress As Boolean";
 //BA.debugLineNum = 224;BA.debugLine="Return FlowState = \"starting\" Or FlowState = \"tra";
if (true) return (_flowstate).equals("starting") || (_flowstate).equals("transitioning") || (_flowstate).equals("stopping");
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return false;
}
public String  _joinparts(anywheresoftware.b4a.objects.collections.List _parts) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
 //BA.debugLineNum = 250;BA.debugLine="Private Sub JoinParts(parts As List) As String";
 //BA.debugLineNum = 251;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 252;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 253;BA.debugLine="For i = 0 To parts.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_parts.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 254;BA.debugLine="If i > 0 Then sb.Append(\" | \")";
if (_i>0) { 
_sb.Append(" | ");};
 //BA.debugLineNum = 255;BA.debugLine="sb.Append(parts.Get(i))";
_sb.Append(BA.ObjectToString(_parts.Get(_i)));
 }
};
 //BA.debugLineNum = 257;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return "";
}
public String  _markslotready(String _audiokey) throws Exception{
b4a.example.playbackplayerslot _slot = null;
 //BA.debugLineNum = 182;BA.debugLine="Public Sub MarkSlotReady(audioKey As String)";
 //BA.debugLineNum = 183;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = _getslotbyaudiokey(_audiokey);
 //BA.debugLineNum = 184;BA.debugLine="If slot.IsInitialized = False Then Return";
if (_slot.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 185;BA.debugLine="If slot.Role = \"pending_play\" Or slot.Role = \"pen";
if ((_slot._role /*String*/ ).equals("pending_play") || (_slot._role /*String*/ ).equals("pending_prepare_music") || (_slot._role /*String*/ ).equals("pending_interrupt") || (_slot._role /*String*/ ).equals("pending_prepare")) { 
 //BA.debugLineNum = 186;BA.debugLine="slot.SetRoleState(slot.Role, \"ready\")";
_slot._setrolestate /*String*/ (_slot._role /*String*/ ,"ready");
 //BA.debugLineNum = 187;BA.debugLine="slot.MarkProgress";
_slot._markprogress /*String*/ ();
 };
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public String  _reset() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Reset";
 //BA.debugLineNum = 18;BA.debugLine="Slots.Initialize";
_slots.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="IsTickInProgress = False";
_istickinprogress = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="DecisionEpoch = 0";
_decisionepoch = (long) (0);
 //BA.debugLineNum = 21;BA.debugLine="CurrentDecision = \"\"";
_currentdecision = "";
 //BA.debugLineNum = 22;BA.debugLine="FlowState = \"idle\"";
_flowstate = "idle";
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _resolvependingpreparerole(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Private Sub ResolvePendingPrepareRole(item As Map)";
 //BA.debugLineNum = 239;BA.debugLine="If item.IsInitialized = False Then Return \"pendin";
if (_item.IsInitialized()==__c.False) { 
if (true) return "pending_prepare";};
 //BA.debugLineNum = 240;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"ad\" Then Return";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
if (true) return "pending_interrupt";};
 //BA.debugLineNum = 241;BA.debugLine="Return \"pending_prepare_music\"";
if (true) return "pending_prepare_music";
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return "";
}
public String  _resolvepreparedrole(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Private Sub ResolvePreparedRole(item As Map) As St";
 //BA.debugLineNum = 233;BA.debugLine="If item.IsInitialized = False Then Return \"prepar";
if (_item.IsInitialized()==__c.False) { 
if (true) return "prepared";};
 //BA.debugLineNum = 234;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"ad\" Then Return";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
if (true) return "prepared_interrupt";};
 //BA.debugLineNum = 235;BA.debugLine="Return \"prepared_music\"";
if (true) return "prepared_music";
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public String  _setactive(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
b4a.example.playbackplayerslot _currentactiveslot = null;
b4a.example.playbackplayerslot _slot = null;
 //BA.debugLineNum = 170;BA.debugLine="Public Sub SetActive(audioKey As String, item As M";
 //BA.debugLineNum = 171;BA.debugLine="Dim currentActiveSlot As PlaybackPlayerSlot = Get";
_currentactiveslot = _getactiveslot();
 //BA.debugLineNum = 172;BA.debugLine="If currentActiveSlot.IsInitialized And currentAct";
if (_currentactiveslot.IsInitialized /*boolean*/ () && (_currentactiveslot._audiokey /*String*/ ).equals(_audiokey) == false) { 
_currentactiveslot._reset /*String*/ ();};
 //BA.debugLineNum = 173;BA.debugLine="ClearSlotByAudioKey(audioKey)";
_clearslotbyaudiokey(_audiokey);
 //BA.debugLineNum = 174;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = _getslotbyaudiokey(_audiokey);
 //BA.debugLineNum = 175;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 176;BA.debugLine="slot.SetRoleState(\"active\", \"playing\")";
_slot._setrolestate /*String*/ ("active","playing");
 //BA.debugLineNum = 177;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (_item);
 //BA.debugLineNum = 178;BA.debugLine="slot.MarkProgress";
_slot._markprogress /*String*/ ();
 };
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _setflowstate(String _statevalue) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Public Sub SetFlowState(stateValue As String)";
 //BA.debugLineNum = 219;BA.debugLine="If stateValue = \"\" Then stateValue = \"idle\"";
if ((_statevalue).equals("")) { 
_statevalue = "idle";};
 //BA.debugLineNum = 220;BA.debugLine="FlowState = stateValue";
_flowstate = _statevalue;
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return "";
}
public String  _setpendingplay(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
b4a.example.playbackplayerslot _slot = null;
 //BA.debugLineNum = 134;BA.debugLine="Public Sub SetPendingPlay(audioKey As String, item";
 //BA.debugLineNum = 135;BA.debugLine="ClearSlotByAudioKey(audioKey)";
_clearslotbyaudiokey(_audiokey);
 //BA.debugLineNum = 136;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = _getslotbyaudiokey(_audiokey);
 //BA.debugLineNum = 137;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 138;BA.debugLine="slot.SetRoleState(\"pending_play\", \"loading\")";
_slot._setrolestate /*String*/ ("pending_play","loading");
 //BA.debugLineNum = 139;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (_item);
 };
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _setpendingprepare(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
b4a.example.playbackplayerslot _slot = null;
 //BA.debugLineNum = 144;BA.debugLine="Public Sub SetPendingPrepare(audioKey As String, i";
 //BA.debugLineNum = 145;BA.debugLine="ClearSlotByAudioKey(audioKey)";
_clearslotbyaudiokey(_audiokey);
 //BA.debugLineNum = 146;BA.debugLine="ClearRole(\"pending_prepare_music\")";
_clearrole("pending_prepare_music");
 //BA.debugLineNum = 147;BA.debugLine="ClearRole(\"pending_interrupt\")";
_clearrole("pending_interrupt");
 //BA.debugLineNum = 148;BA.debugLine="ClearRole(\"pending_prepare\")";
_clearrole("pending_prepare");
 //BA.debugLineNum = 149;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = _getslotbyaudiokey(_audiokey);
 //BA.debugLineNum = 150;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 151;BA.debugLine="slot.SetRoleState(ResolvePendingPrepareRole(item";
_slot._setrolestate /*String*/ (_resolvependingpreparerole(_item),"loading");
 //BA.debugLineNum = 152;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (_item);
 };
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _setprepared(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
b4a.example.playbackplayerslot _slot = null;
 //BA.debugLineNum = 157;BA.debugLine="Public Sub SetPrepared(audioKey As String, item As";
 //BA.debugLineNum = 158;BA.debugLine="ClearSlotByAudioKey(audioKey)";
_clearslotbyaudiokey(_audiokey);
 //BA.debugLineNum = 159;BA.debugLine="ClearRole(\"prepared_music\")";
_clearrole("prepared_music");
 //BA.debugLineNum = 160;BA.debugLine="ClearRole(\"prepared_interrupt\")";
_clearrole("prepared_interrupt");
 //BA.debugLineNum = 161;BA.debugLine="ClearRole(\"prepared\")";
_clearrole("prepared");
 //BA.debugLineNum = 162;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
_slot = _getslotbyaudiokey(_audiokey);
 //BA.debugLineNum = 163;BA.debugLine="If slot.IsInitialized Then";
if (_slot.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 164;BA.debugLine="slot.SetRoleState(ResolvePreparedRole(item), \"re";
_slot._setrolestate /*String*/ (_resolvepreparedrole(_item),"ready");
 //BA.debugLineNum = 165;BA.debugLine="slot.SetItem(item)";
_slot._setitem /*String*/ (_item);
 };
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public boolean  _trybegindecision(String _decisionname) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Public Sub TryBeginDecision(decisionName As String";
 //BA.debugLineNum = 209;BA.debugLine="If CurrentDecision <> \"\" Then Return False";
if ((_currentdecision).equals("") == false) { 
if (true) return __c.False;};
 //BA.debugLineNum = 210;BA.debugLine="BeginDecision(decisionName)";
_begindecision(_decisionname);
 //BA.debugLineNum = 211;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
