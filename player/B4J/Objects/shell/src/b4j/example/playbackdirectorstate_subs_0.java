package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackdirectorstate_subs_0 {


public static RemoteObject  _applylegacyruntime(RemoteObject __ref,RemoteObject _runtimestate) throws Exception{
try {
		Debug.PushSubsStack("ApplyLegacyRuntime (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("applylegacyruntime")) { return __ref.runUserSub(false, "playbackdirectorstate","applylegacyruntime", __ref, _runtimestate);}
RemoteObject _slot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _activeslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _pendingplayslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _preparedslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _pendingprepareslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
Debug.locals.put("runtimeState", _runtimestate);
 BA.debugLineNum = 35;BA.debugLine="Public Sub ApplyLegacyRuntime(runtimeState As Play";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="ConfigureDefaultSlots";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_configuredefaultslots" /*RemoteObject*/ );
 BA.debugLineNum = 37;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
Debug.ShouldStop(16);
{
final RemoteObject group2 = __ref.getField(false,"_slots" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_slot = (group2.runMethod(false,"Get",index2));Debug.locals.put("slot", _slot);
Debug.locals.put("slot", _slot);
 BA.debugLineNum = 38;BA.debugLine="slot.Reset";
Debug.ShouldStop(32);
_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_reset" /*RemoteObject*/ );
 }
}Debug.locals.put("slot", _slot);
;
 BA.debugLineNum = 40;BA.debugLine="If runtimeState.ActiveAudioKey <> \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",_runtimestate.getField(true,"_activeaudiokey" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 41;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = GetSlotBy";
Debug.ShouldStop(256);
_activeslot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyaudiokey" /*RemoteObject*/ ,(Object)(_runtimestate.getField(true,"_activeaudiokey" /*RemoteObject*/ )));Debug.locals.put("activeSlot", _activeslot);Debug.locals.put("activeSlot", _activeslot);
 BA.debugLineNum = 42;BA.debugLine="If activeSlot.IsInitialized Then";
Debug.ShouldStop(512);
if (_activeslot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 43;BA.debugLine="activeSlot.SetRoleState(\"active\", \"playing\")";
Debug.ShouldStop(1024);
_activeslot.runClassMethod (b4j.example.playbackplayerslot.class, "_setrolestate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("active")),(Object)(RemoteObject.createImmutable("playing")));
 BA.debugLineNum = 44;BA.debugLine="activeSlot.SetItem(runtimeState.ActiveItem)";
Debug.ShouldStop(2048);
_activeslot.runClassMethod (b4j.example.playbackplayerslot.class, "_setitem" /*RemoteObject*/ ,(Object)(_runtimestate.getField(false,"_activeitem" /*RemoteObject*/ )));
 };
 };
 BA.debugLineNum = 47;BA.debugLine="If runtimeState.PendingPlayAudioKey <> \"\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_runtimestate.getField(true,"_pendingplayaudiokey" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 48;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = GetS";
Debug.ShouldStop(32768);
_pendingplayslot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyaudiokey" /*RemoteObject*/ ,(Object)(_runtimestate.getField(true,"_pendingplayaudiokey" /*RemoteObject*/ )));Debug.locals.put("pendingPlaySlot", _pendingplayslot);Debug.locals.put("pendingPlaySlot", _pendingplayslot);
 BA.debugLineNum = 49;BA.debugLine="If pendingPlaySlot.IsInitialized Then";
Debug.ShouldStop(65536);
if (_pendingplayslot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 50;BA.debugLine="pendingPlaySlot.SetRoleState(\"pending_play\", \"l";
Debug.ShouldStop(131072);
_pendingplayslot.runClassMethod (b4j.example.playbackplayerslot.class, "_setrolestate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pending_play")),(Object)(RemoteObject.createImmutable("loading")));
 BA.debugLineNum = 51;BA.debugLine="pendingPlaySlot.SetItem(runtimeState.PendingPla";
Debug.ShouldStop(262144);
_pendingplayslot.runClassMethod (b4j.example.playbackplayerslot.class, "_setitem" /*RemoteObject*/ ,(Object)(_runtimestate.getField(false,"_pendingplayitem" /*RemoteObject*/ )));
 };
 };
 BA.debugLineNum = 54;BA.debugLine="If runtimeState.PreparedAudioKey <> \"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",_runtimestate.getField(true,"_preparedaudiokey" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 55;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetSlot";
Debug.ShouldStop(4194304);
_preparedslot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyaudiokey" /*RemoteObject*/ ,(Object)(_runtimestate.getField(true,"_preparedaudiokey" /*RemoteObject*/ )));Debug.locals.put("preparedSlot", _preparedslot);Debug.locals.put("preparedSlot", _preparedslot);
 BA.debugLineNum = 56;BA.debugLine="If preparedSlot.IsInitialized Then";
Debug.ShouldStop(8388608);
if (_preparedslot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 57;BA.debugLine="preparedSlot.SetRoleState(ResolvePreparedRole(r";
Debug.ShouldStop(16777216);
_preparedslot.runClassMethod (b4j.example.playbackplayerslot.class, "_setrolestate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_resolvepreparedrole" /*RemoteObject*/ ,(Object)(_runtimestate.getField(false,"_prepareditem" /*RemoteObject*/ )))),(Object)(RemoteObject.createImmutable("ready")));
 BA.debugLineNum = 58;BA.debugLine="preparedSlot.SetItem(runtimeState.PreparedItem)";
Debug.ShouldStop(33554432);
_preparedslot.runClassMethod (b4j.example.playbackplayerslot.class, "_setitem" /*RemoteObject*/ ,(Object)(_runtimestate.getField(false,"_prepareditem" /*RemoteObject*/ )));
 };
 };
 BA.debugLineNum = 61;BA.debugLine="If runtimeState.PendingPrepareAudioKey <> \"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",_runtimestate.getField(true,"_pendingprepareaudiokey" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 62;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = G";
Debug.ShouldStop(536870912);
_pendingprepareslot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyaudiokey" /*RemoteObject*/ ,(Object)(_runtimestate.getField(true,"_pendingprepareaudiokey" /*RemoteObject*/ )));Debug.locals.put("pendingPrepareSlot", _pendingprepareslot);Debug.locals.put("pendingPrepareSlot", _pendingprepareslot);
 BA.debugLineNum = 63;BA.debugLine="If pendingPrepareSlot.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (_pendingprepareslot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 64;BA.debugLine="pendingPrepareSlot.SetRoleState(ResolvePendingP";
Debug.ShouldStop(-2147483648);
_pendingprepareslot.runClassMethod (b4j.example.playbackplayerslot.class, "_setrolestate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_resolvependingpreparerole" /*RemoteObject*/ ,(Object)(_runtimestate.getField(false,"_pendingprepareitem" /*RemoteObject*/ )))),(Object)(RemoteObject.createImmutable("loading")));
 BA.debugLineNum = 65;BA.debugLine="pendingPrepareSlot.SetItem(runtimeState.Pending";
Debug.ShouldStop(1);
_pendingprepareslot.runClassMethod (b4j.example.playbackplayerslot.class, "_setitem" /*RemoteObject*/ ,(Object)(_runtimestate.getField(false,"_pendingprepareitem" /*RemoteObject*/ )));
 };
 };
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _begindecision(RemoteObject __ref,RemoteObject _decisionname) throws Exception{
try {
		Debug.PushSubsStack("BeginDecision (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("begindecision")) { return __ref.runUserSub(false, "playbackdirectorstate","begindecision", __ref, _decisionname);}
Debug.locals.put("decisionName", _decisionname);
 BA.debugLineNum = 193;BA.debugLine="Public Sub BeginDecision(decisionName As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 194;BA.debugLine="DecisionEpoch = DecisionEpoch + 1";
Debug.ShouldStop(2);
__ref.setField ("_decisionepoch" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_decisionepoch" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 2));
 BA.debugLineNum = 195;BA.debugLine="CurrentDecision = decisionName";
Debug.ShouldStop(4);
__ref.setField ("_currentdecision" /*RemoteObject*/ ,_decisionname);
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public Slots As List";
playbackdirectorstate._slots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_slots",playbackdirectorstate._slots);
 //BA.debugLineNum = 7;BA.debugLine="Public IsTickInProgress As Boolean";
playbackdirectorstate._istickinprogress = RemoteObject.createImmutable(false);__ref.setField("_istickinprogress",playbackdirectorstate._istickinprogress);
 //BA.debugLineNum = 8;BA.debugLine="Public DecisionEpoch As Long";
playbackdirectorstate._decisionepoch = RemoteObject.createImmutable(0L);__ref.setField("_decisionepoch",playbackdirectorstate._decisionepoch);
 //BA.debugLineNum = 9;BA.debugLine="Public CurrentDecision As String";
playbackdirectorstate._currentdecision = RemoteObject.createImmutable("");__ref.setField("_currentdecision",playbackdirectorstate._currentdecision);
 //BA.debugLineNum = 10;BA.debugLine="Public FlowState As String";
playbackdirectorstate._flowstate = RemoteObject.createImmutable("");__ref.setField("_flowstate",playbackdirectorstate._flowstate);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleardecision(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearDecision (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("cleardecision")) { return __ref.runUserSub(false, "playbackdirectorstate","cleardecision", __ref);}
 BA.debugLineNum = 205;BA.debugLine="Public Sub ClearDecision";
Debug.ShouldStop(4096);
 BA.debugLineNum = 206;BA.debugLine="CurrentDecision = \"\"";
Debug.ShouldStop(8192);
__ref.setField ("_currentdecision" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearrole(RemoteObject __ref,RemoteObject _rolevalue) throws Exception{
try {
		Debug.PushSubsStack("ClearRole (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("clearrole")) { return __ref.runUserSub(false, "playbackdirectorstate","clearrole", __ref, _rolevalue);}
RemoteObject _slot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
Debug.locals.put("roleValue", _rolevalue);
 BA.debugLineNum = 128;BA.debugLine="Public Sub ClearRole(roleValue As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByRole(ro";
Debug.ShouldStop(1);
_slot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyrole" /*RemoteObject*/ ,(Object)(_rolevalue));Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 130;BA.debugLine="If slot.IsInitialized Then slot.Reset";
Debug.ShouldStop(2);
if (_slot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_reset" /*RemoteObject*/ );};
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearslotbyaudiokey(RemoteObject __ref,RemoteObject _audiokey) throws Exception{
try {
		Debug.PushSubsStack("ClearSlotByAudioKey (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("clearslotbyaudiokey")) { return __ref.runUserSub(false, "playbackdirectorstate","clearslotbyaudiokey", __ref, _audiokey);}
RemoteObject _slot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
Debug.locals.put("audioKey", _audiokey);
 BA.debugLineNum = 123;BA.debugLine="Public Sub ClearSlotByAudioKey(audioKey As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
Debug.ShouldStop(134217728);
_slot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyaudiokey" /*RemoteObject*/ ,(Object)(_audiokey));Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 125;BA.debugLine="If slot.IsInitialized Then slot.Reset";
Debug.ShouldStop(268435456);
if (_slot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_reset" /*RemoteObject*/ );};
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _configuredefaultslots(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConfigureDefaultSlots (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("configuredefaultslots")) { return __ref.runUserSub(false, "playbackdirectorstate","configuredefaultslots", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Public Sub ConfigureDefaultSlots";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="If Slots.IsInitialized = False Then Slots.Initial";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_slots" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),playbackdirectorstate.__c.getField(true,"False"))) { 
__ref.getField(false,"_slots" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 28;BA.debugLine="If Slots.Size > 0 Then Return";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_slots" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 29;BA.debugLine="Slots.Add(CreateSlot(\"slot_primary\", \"primary\"))";
Debug.ShouldStop(268435456);
__ref.getField(false,"_slots" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_createslot" /*RemoteObject*/ ,(Object)(BA.ObjectToString("slot_primary")),(Object)(RemoteObject.createImmutable("primary"))))));
 BA.debugLineNum = 30;BA.debugLine="Slots.Add(CreateSlot(\"slot_secondary\", \"secondary";
Debug.ShouldStop(536870912);
__ref.getField(false,"_slots" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_createslot" /*RemoteObject*/ ,(Object)(BA.ObjectToString("slot_secondary")),(Object)(RemoteObject.createImmutable("secondary"))))));
 BA.debugLineNum = 31;BA.debugLine="Slots.Add(CreateSlot(\"slot_interrupt\", \"\"))";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_slots" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_createslot" /*RemoteObject*/ ,(Object)(BA.ObjectToString("slot_interrupt")),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createslot(RemoteObject __ref,RemoteObject _slotidvalue,RemoteObject _audiokeyvalue) throws Exception{
try {
		Debug.PushSubsStack("CreateSlot (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,235);
if (RapidSub.canDelegate("createslot")) { return __ref.runUserSub(false, "playbackdirectorstate","createslot", __ref, _slotidvalue, _audiokeyvalue);}
RemoteObject _slot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
Debug.locals.put("slotIdValue", _slotidvalue);
Debug.locals.put("audioKeyValue", _audiokeyvalue);
 BA.debugLineNum = 235;BA.debugLine="Private Sub CreateSlot(slotIdValue As String, audi";
Debug.ShouldStop(1024);
 BA.debugLineNum = 236;BA.debugLine="Dim slot As PlaybackPlayerSlot";
Debug.ShouldStop(2048);
_slot = RemoteObject.createNew ("b4j.example.playbackplayerslot");Debug.locals.put("slot", _slot);
 BA.debugLineNum = 237;BA.debugLine="slot.Initialize(slotIdValue, audioKeyValue)";
Debug.ShouldStop(4096);
_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_slotidvalue),(Object)(_audiokeyvalue));
 BA.debugLineNum = 238;BA.debugLine="Return slot";
Debug.ShouldStop(8192);
if (true) return _slot;
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _describeslots(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DescribeSlots (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("describeslots")) { return __ref.runUserSub(false, "playbackdirectorstate","describeslots", __ref);}
RemoteObject _parts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _slot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _itemid = RemoteObject.createImmutable("");
 BA.debugLineNum = 182;BA.debugLine="Public Sub DescribeSlots As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="Dim parts As List";
Debug.ShouldStop(4194304);
_parts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("parts", _parts);
 BA.debugLineNum = 184;BA.debugLine="parts.Initialize";
Debug.ShouldStop(8388608);
_parts.runVoidMethod ("Initialize");
 BA.debugLineNum = 185;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
Debug.ShouldStop(16777216);
{
final RemoteObject group3 = __ref.getField(false,"_slots" /*RemoteObject*/ );
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_slot = (group3.runMethod(false,"Get",index3));Debug.locals.put("slot", _slot);
Debug.locals.put("slot", _slot);
 BA.debugLineNum = 186;BA.debugLine="Dim itemId As String = \"\"";
Debug.ShouldStop(33554432);
_itemid = BA.ObjectToString("");Debug.locals.put("itemId", _itemid);Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 187;BA.debugLine="If slot.HasItem Then itemId = slot.Item.GetDefau";
Debug.ShouldStop(67108864);
if (_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_hasitem" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_itemid = BA.ObjectToString(_slot.getField(false,"_item" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemId", _itemid);};
 BA.debugLineNum = 188;BA.debugLine="parts.Add(slot.SlotId & \":\" & slot.Role & \":\" &";
Debug.ShouldStop(134217728);
_parts.runVoidMethod ("Add",(Object)((RemoteObject.concat(_slot.getField(true,"_slotid" /*RemoteObject*/ ),RemoteObject.createImmutable(":"),_slot.getField(true,"_role" /*RemoteObject*/ ),RemoteObject.createImmutable(":"),_slot.getField(true,"_state" /*RemoteObject*/ ),RemoteObject.createImmutable(":"),_itemid))));
 }
}Debug.locals.put("slot", _slot);
;
 BA.debugLineNum = 190;BA.debugLine="Return JoinParts(parts)";
Debug.ShouldStop(536870912);
if (true) return __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_joinparts" /*RemoteObject*/ ,(Object)(_parts));
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getactiveslot(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetActiveSlot (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("getactiveslot")) { return __ref.runUserSub(false, "playbackdirectorstate","getactiveslot", __ref);}
 BA.debugLineNum = 86;BA.debugLine="Public Sub GetActiveSlot As PlaybackPlayerSlot";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Return GetSlotByRole(\"active\")";
Debug.ShouldStop(4194304);
if (true) return __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("active")));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpendingplayslot(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPendingPlaySlot (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("getpendingplayslot")) { return __ref.runUserSub(false, "playbackdirectorstate","getpendingplayslot", __ref);}
 BA.debugLineNum = 102;BA.debugLine="Public Sub GetPendingPlaySlot As PlaybackPlayerSlo";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Return GetSlotByRole(\"pending_play\")";
Debug.ShouldStop(64);
if (true) return __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pending_play")));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpendingprepareslot(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPendingPrepareSlot (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("getpendingprepareslot")) { return __ref.runUserSub(false, "playbackdirectorstate","getpendingprepareslot", __ref);}
RemoteObject _pendingpreparemusicslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _pendinginterruptslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _pendingprepareslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _emptyslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
 BA.debugLineNum = 107;BA.debugLine="Public Sub GetPendingPrepareSlot As PlaybackPlayer";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="Dim pendingPrepareMusicSlot As PlaybackPlayerSlot";
Debug.ShouldStop(2048);
_pendingpreparemusicslot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pending_prepare_music")));Debug.locals.put("pendingPrepareMusicSlot", _pendingpreparemusicslot);Debug.locals.put("pendingPrepareMusicSlot", _pendingpreparemusicslot);
 BA.debugLineNum = 109;BA.debugLine="If pendingPrepareMusicSlot.IsInitialized Then Ret";
Debug.ShouldStop(4096);
if (_pendingpreparemusicslot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return _pendingpreparemusicslot;};
 BA.debugLineNum = 110;BA.debugLine="Dim pendingInterruptSlot As PlaybackPlayerSlot =";
Debug.ShouldStop(8192);
_pendinginterruptslot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pending_interrupt")));Debug.locals.put("pendingInterruptSlot", _pendinginterruptslot);Debug.locals.put("pendingInterruptSlot", _pendinginterruptslot);
 BA.debugLineNum = 111;BA.debugLine="If pendingInterruptSlot.IsInitialized Then Return";
Debug.ShouldStop(16384);
if (_pendinginterruptslot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return _pendinginterruptslot;};
 BA.debugLineNum = 112;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = Ge";
Debug.ShouldStop(32768);
_pendingprepareslot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pending_prepare")));Debug.locals.put("pendingPrepareSlot", _pendingprepareslot);Debug.locals.put("pendingPrepareSlot", _pendingprepareslot);
 BA.debugLineNum = 113;BA.debugLine="If pendingPrepareSlot.IsInitialized Then Return p";
Debug.ShouldStop(65536);
if (_pendingprepareslot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return _pendingprepareslot;};
 BA.debugLineNum = 114;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
Debug.ShouldStop(131072);
_emptyslot = RemoteObject.createNew ("b4j.example.playbackplayerslot");Debug.locals.put("emptySlot", _emptyslot);
 BA.debugLineNum = 115;BA.debugLine="Return emptySlot";
Debug.ShouldStop(262144);
if (true) return _emptyslot;
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpreparedslot(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPreparedSlot (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("getpreparedslot")) { return __ref.runUserSub(false, "playbackdirectorstate","getpreparedslot", __ref);}
RemoteObject _preparedmusicslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _preparedinterruptslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _preparedslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _emptyslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
 BA.debugLineNum = 91;BA.debugLine="Public Sub GetPreparedSlot As PlaybackPlayerSlot";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Dim preparedMusicSlot As PlaybackPlayerSlot = Get";
Debug.ShouldStop(134217728);
_preparedmusicslot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("prepared_music")));Debug.locals.put("preparedMusicSlot", _preparedmusicslot);Debug.locals.put("preparedMusicSlot", _preparedmusicslot);
 BA.debugLineNum = 93;BA.debugLine="If preparedMusicSlot.IsInitialized Then Return pr";
Debug.ShouldStop(268435456);
if (_preparedmusicslot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return _preparedmusicslot;};
 BA.debugLineNum = 94;BA.debugLine="Dim preparedInterruptSlot As PlaybackPlayerSlot =";
Debug.ShouldStop(536870912);
_preparedinterruptslot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("prepared_interrupt")));Debug.locals.put("preparedInterruptSlot", _preparedinterruptslot);Debug.locals.put("preparedInterruptSlot", _preparedinterruptslot);
 BA.debugLineNum = 95;BA.debugLine="If preparedInterruptSlot.IsInitialized Then Retur";
Debug.ShouldStop(1073741824);
if (_preparedinterruptslot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return _preparedinterruptslot;};
 BA.debugLineNum = 96;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetSlotB";
Debug.ShouldStop(-2147483648);
_preparedslot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("prepared")));Debug.locals.put("preparedSlot", _preparedslot);Debug.locals.put("preparedSlot", _preparedslot);
 BA.debugLineNum = 97;BA.debugLine="If preparedSlot.IsInitialized Then Return prepare";
Debug.ShouldStop(1);
if (_preparedslot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return _preparedslot;};
 BA.debugLineNum = 98;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
Debug.ShouldStop(2);
_emptyslot = RemoteObject.createNew ("b4j.example.playbackplayerslot");Debug.locals.put("emptySlot", _emptyslot);
 BA.debugLineNum = 99;BA.debugLine="Return emptySlot";
Debug.ShouldStop(4);
if (true) return _emptyslot;
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getslotbyaudiokey(RemoteObject __ref,RemoteObject _audiokey) throws Exception{
try {
		Debug.PushSubsStack("GetSlotByAudioKey (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("getslotbyaudiokey")) { return __ref.runUserSub(false, "playbackdirectorstate","getslotbyaudiokey", __ref, _audiokey);}
RemoteObject _slot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _emptyslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
Debug.locals.put("audioKey", _audiokey);
 BA.debugLineNum = 70;BA.debugLine="Public Sub GetSlotByAudioKey(audioKey As String) A";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
Debug.ShouldStop(64);
{
final RemoteObject group1 = __ref.getField(false,"_slots" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_slot = (group1.runMethod(false,"Get",index1));Debug.locals.put("slot", _slot);
Debug.locals.put("slot", _slot);
 BA.debugLineNum = 72;BA.debugLine="If slot.AudioKey = audioKey Then Return slot";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_slot.getField(true,"_audiokey" /*RemoteObject*/ ),_audiokey)) { 
if (true) return _slot;};
 }
}Debug.locals.put("slot", _slot);
;
 BA.debugLineNum = 74;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
Debug.ShouldStop(512);
_emptyslot = RemoteObject.createNew ("b4j.example.playbackplayerslot");Debug.locals.put("emptySlot", _emptyslot);
 BA.debugLineNum = 75;BA.debugLine="Return emptySlot";
Debug.ShouldStop(1024);
if (true) return _emptyslot;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getslotbyrole(RemoteObject __ref,RemoteObject _rolevalue) throws Exception{
try {
		Debug.PushSubsStack("GetSlotByRole (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("getslotbyrole")) { return __ref.runUserSub(false, "playbackdirectorstate","getslotbyrole", __ref, _rolevalue);}
RemoteObject _slot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _emptyslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
Debug.locals.put("roleValue", _rolevalue);
 BA.debugLineNum = 78;BA.debugLine="Public Sub GetSlotByRole(roleValue As String) As P";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="For Each slot As PlaybackPlayerSlot In Slots";
Debug.ShouldStop(16384);
{
final RemoteObject group1 = __ref.getField(false,"_slots" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_slot = (group1.runMethod(false,"Get",index1));Debug.locals.put("slot", _slot);
Debug.locals.put("slot", _slot);
 BA.debugLineNum = 80;BA.debugLine="If slot.Role = roleValue Then Return slot";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_slot.getField(true,"_role" /*RemoteObject*/ ),_rolevalue)) { 
if (true) return _slot;};
 }
}Debug.locals.put("slot", _slot);
;
 BA.debugLineNum = 82;BA.debugLine="Dim emptySlot As PlaybackPlayerSlot";
Debug.ShouldStop(131072);
_emptyslot = RemoteObject.createNew ("b4j.example.playbackplayerslot");Debug.locals.put("emptySlot", _emptyslot);
 BA.debugLineNum = 83;BA.debugLine="Return emptySlot";
Debug.ShouldStop(262144);
if (true) return _emptyslot;
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _haspreparedslot(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasPreparedSlot (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("haspreparedslot")) { return __ref.runUserSub(false, "playbackdirectorstate","haspreparedslot", __ref);}
RemoteObject _preparedslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
 BA.debugLineNum = 118;BA.debugLine="Public Sub HasPreparedSlot As Boolean";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = GetPrepa";
Debug.ShouldStop(4194304);
_preparedslot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getpreparedslot" /*RemoteObject*/ );Debug.locals.put("preparedSlot", _preparedslot);Debug.locals.put("preparedSlot", _preparedslot);
 BA.debugLineNum = 120;BA.debugLine="Return preparedSlot.IsInitialized And preparedSlo";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_preparedslot.runMethod(true,"IsInitialized" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",_preparedslot.runClassMethod (b4j.example.playbackplayerslot.class, "_hasitem" /*RemoteObject*/ )));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackdirectorstate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Reset";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_reset" /*RemoteObject*/ );
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isflowactive(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsFlowActive (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,218);
if (RapidSub.canDelegate("isflowactive")) { return __ref.runUserSub(false, "playbackdirectorstate","isflowactive", __ref);}
 BA.debugLineNum = 218;BA.debugLine="Public Sub IsFlowActive As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 219;BA.debugLine="Return FlowState = \"playing\" Or FlowState = \"prep";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_flowstate" /*RemoteObject*/ ),BA.ObjectToString("playing")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_flowstate" /*RemoteObject*/ ),BA.ObjectToString("preparing")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_flowstate" /*RemoteObject*/ ),BA.ObjectToString("transitioning")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_flowstate" /*RemoteObject*/ ),BA.ObjectToString("starting")));
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _istransitioninprogress(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsTransitionInProgress (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,214);
if (RapidSub.canDelegate("istransitioninprogress")) { return __ref.runUserSub(false, "playbackdirectorstate","istransitioninprogress", __ref);}
 BA.debugLineNum = 214;BA.debugLine="Public Sub IsTransitionInProgress As Boolean";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 215;BA.debugLine="Return FlowState = \"starting\" Or FlowState = \"tra";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_flowstate" /*RemoteObject*/ ),BA.ObjectToString("starting")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_flowstate" /*RemoteObject*/ ),BA.ObjectToString("transitioning")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_flowstate" /*RemoteObject*/ ),BA.ObjectToString("stopping")));
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _joinparts(RemoteObject __ref,RemoteObject _parts) throws Exception{
try {
		Debug.PushSubsStack("JoinParts (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,241);
if (RapidSub.canDelegate("joinparts")) { return __ref.runUserSub(false, "playbackdirectorstate","joinparts", __ref, _parts);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("parts", _parts);
 BA.debugLineNum = 241;BA.debugLine="Private Sub JoinParts(parts As List) As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 242;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(131072);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 243;BA.debugLine="sb.Initialize";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 244;BA.debugLine="For i = 0 To parts.Size - 1";
Debug.ShouldStop(524288);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_parts.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 245;BA.debugLine="If i > 0 Then sb.Append(\" | \")";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" | ")));};
 BA.debugLineNum = 246;BA.debugLine="sb.Append(parts.Get(i))";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_parts.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 248;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(8388608);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reset(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Reset (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "playbackdirectorstate","reset", __ref);}
 BA.debugLineNum = 17;BA.debugLine="Public Sub Reset";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Slots.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_slots" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 19;BA.debugLine="IsTickInProgress = False";
Debug.ShouldStop(262144);
__ref.setField ("_istickinprogress" /*RemoteObject*/ ,playbackdirectorstate.__c.getField(true,"False"));
 BA.debugLineNum = 20;BA.debugLine="DecisionEpoch = 0";
Debug.ShouldStop(524288);
__ref.setField ("_decisionepoch" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 21;BA.debugLine="CurrentDecision = \"\"";
Debug.ShouldStop(1048576);
__ref.setField ("_currentdecision" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 22;BA.debugLine="FlowState = \"idle\"";
Debug.ShouldStop(2097152);
__ref.setField ("_flowstate" /*RemoteObject*/ ,BA.ObjectToString("idle"));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvependingpreparerole(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ResolvePendingPrepareRole (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("resolvependingpreparerole")) { return __ref.runUserSub(false, "playbackdirectorstate","resolvependingpreparerole", __ref, _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 229;BA.debugLine="Private Sub ResolvePendingPrepareRole(item As Map)";
Debug.ShouldStop(16);
 BA.debugLineNum = 230;BA.debugLine="If item.IsInitialized = False Then Return \"pendin";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),playbackdirectorstate.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("pending_prepare");};
 BA.debugLineNum = 231;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"ad\" Then Return";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("ad")))) { 
if (true) return BA.ObjectToString("pending_interrupt");};
 BA.debugLineNum = 232;BA.debugLine="Return \"pending_prepare_music\"";
Debug.ShouldStop(128);
if (true) return BA.ObjectToString("pending_prepare_music");
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvepreparedrole(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ResolvePreparedRole (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("resolvepreparedrole")) { return __ref.runUserSub(false, "playbackdirectorstate","resolvepreparedrole", __ref, _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 223;BA.debugLine="Private Sub ResolvePreparedRole(item As Map) As St";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="If item.IsInitialized = False Then Return \"prepar";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),playbackdirectorstate.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("prepared");};
 BA.debugLineNum = 225;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"ad\" Then Return";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("ad")))) { 
if (true) return BA.ObjectToString("prepared_interrupt");};
 BA.debugLineNum = 226;BA.debugLine="Return \"prepared_music\"";
Debug.ShouldStop(2);
if (true) return BA.ObjectToString("prepared_music");
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactive(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("SetActive (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("setactive")) { return __ref.runUserSub(false, "playbackdirectorstate","setactive", __ref, _audiokey, _item);}
RemoteObject _currentactiveslot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
RemoteObject _slot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("item", _item);
 BA.debugLineNum = 170;BA.debugLine="Public Sub SetActive(audioKey As String, item As M";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Dim currentActiveSlot As PlaybackPlayerSlot = Get";
Debug.ShouldStop(1024);
_currentactiveslot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getactiveslot" /*RemoteObject*/ );Debug.locals.put("currentActiveSlot", _currentactiveslot);Debug.locals.put("currentActiveSlot", _currentactiveslot);
 BA.debugLineNum = 172;BA.debugLine="If currentActiveSlot.IsInitialized And currentAct";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(".",_currentactiveslot.runMethod(true,"IsInitialized" /*RemoteObject*/ )) && RemoteObject.solveBoolean("!",_currentactiveslot.getField(true,"_audiokey" /*RemoteObject*/ ),_audiokey)) { 
_currentactiveslot.runClassMethod (b4j.example.playbackplayerslot.class, "_reset" /*RemoteObject*/ );};
 BA.debugLineNum = 173;BA.debugLine="ClearSlotByAudioKey(audioKey)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_clearslotbyaudiokey" /*RemoteObject*/ ,(Object)(_audiokey));
 BA.debugLineNum = 174;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
Debug.ShouldStop(8192);
_slot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyaudiokey" /*RemoteObject*/ ,(Object)(_audiokey));Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 175;BA.debugLine="If slot.IsInitialized Then";
Debug.ShouldStop(16384);
if (_slot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 176;BA.debugLine="slot.SetRoleState(\"active\", \"playing\")";
Debug.ShouldStop(32768);
_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_setrolestate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("active")),(Object)(RemoteObject.createImmutable("playing")));
 BA.debugLineNum = 177;BA.debugLine="slot.SetItem(item)";
Debug.ShouldStop(65536);
_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_setitem" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 178;BA.debugLine="slot.MarkProgress";
Debug.ShouldStop(131072);
_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_markprogress" /*RemoteObject*/ );
 };
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setflowstate(RemoteObject __ref,RemoteObject _statevalue) throws Exception{
try {
		Debug.PushSubsStack("SetFlowState (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("setflowstate")) { return __ref.runUserSub(false, "playbackdirectorstate","setflowstate", __ref, _statevalue);}
Debug.locals.put("stateValue", _statevalue);
 BA.debugLineNum = 209;BA.debugLine="Public Sub SetFlowState(stateValue As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="If stateValue = \"\" Then stateValue = \"idle\"";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_statevalue,BA.ObjectToString(""))) { 
_statevalue = BA.ObjectToString("idle");Debug.locals.put("stateValue", _statevalue);};
 BA.debugLineNum = 211;BA.debugLine="FlowState = stateValue";
Debug.ShouldStop(262144);
__ref.setField ("_flowstate" /*RemoteObject*/ ,_statevalue);
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpendingplay(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("SetPendingPlay (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("setpendingplay")) { return __ref.runUserSub(false, "playbackdirectorstate","setpendingplay", __ref, _audiokey, _item);}
RemoteObject _slot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("item", _item);
 BA.debugLineNum = 134;BA.debugLine="Public Sub SetPendingPlay(audioKey As String, item";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="ClearSlotByAudioKey(audioKey)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_clearslotbyaudiokey" /*RemoteObject*/ ,(Object)(_audiokey));
 BA.debugLineNum = 136;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
Debug.ShouldStop(128);
_slot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyaudiokey" /*RemoteObject*/ ,(Object)(_audiokey));Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 137;BA.debugLine="If slot.IsInitialized Then";
Debug.ShouldStop(256);
if (_slot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 138;BA.debugLine="slot.SetRoleState(\"pending_play\", \"loading\")";
Debug.ShouldStop(512);
_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_setrolestate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pending_play")),(Object)(RemoteObject.createImmutable("loading")));
 BA.debugLineNum = 139;BA.debugLine="slot.SetItem(item)";
Debug.ShouldStop(1024);
_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_setitem" /*RemoteObject*/ ,(Object)(_item));
 };
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpendingprepare(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("SetPendingPrepare (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("setpendingprepare")) { return __ref.runUserSub(false, "playbackdirectorstate","setpendingprepare", __ref, _audiokey, _item);}
RemoteObject _slot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("item", _item);
 BA.debugLineNum = 144;BA.debugLine="Public Sub SetPendingPrepare(audioKey As String, i";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="ClearSlotByAudioKey(audioKey)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_clearslotbyaudiokey" /*RemoteObject*/ ,(Object)(_audiokey));
 BA.debugLineNum = 146;BA.debugLine="ClearRole(\"pending_prepare_music\")";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_clearrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pending_prepare_music")));
 BA.debugLineNum = 147;BA.debugLine="ClearRole(\"pending_interrupt\")";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_clearrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pending_interrupt")));
 BA.debugLineNum = 148;BA.debugLine="ClearRole(\"pending_prepare\")";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_clearrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pending_prepare")));
 BA.debugLineNum = 149;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
Debug.ShouldStop(1048576);
_slot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyaudiokey" /*RemoteObject*/ ,(Object)(_audiokey));Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 150;BA.debugLine="If slot.IsInitialized Then";
Debug.ShouldStop(2097152);
if (_slot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 151;BA.debugLine="slot.SetRoleState(ResolvePendingPrepareRole(item";
Debug.ShouldStop(4194304);
_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_setrolestate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_resolvependingpreparerole" /*RemoteObject*/ ,(Object)(_item))),(Object)(RemoteObject.createImmutable("loading")));
 BA.debugLineNum = 152;BA.debugLine="slot.SetItem(item)";
Debug.ShouldStop(8388608);
_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_setitem" /*RemoteObject*/ ,(Object)(_item));
 };
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprepared(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("SetPrepared (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("setprepared")) { return __ref.runUserSub(false, "playbackdirectorstate","setprepared", __ref, _audiokey, _item);}
RemoteObject _slot = RemoteObject.declareNull("b4j.example.playbackplayerslot");
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("item", _item);
 BA.debugLineNum = 157;BA.debugLine="Public Sub SetPrepared(audioKey As String, item As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="ClearSlotByAudioKey(audioKey)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_clearslotbyaudiokey" /*RemoteObject*/ ,(Object)(_audiokey));
 BA.debugLineNum = 159;BA.debugLine="ClearRole(\"prepared_music\")";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_clearrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("prepared_music")));
 BA.debugLineNum = 160;BA.debugLine="ClearRole(\"prepared_interrupt\")";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_clearrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("prepared_interrupt")));
 BA.debugLineNum = 161;BA.debugLine="ClearRole(\"prepared\")";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_clearrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("prepared")));
 BA.debugLineNum = 162;BA.debugLine="Dim slot As PlaybackPlayerSlot = GetSlotByAudioKe";
Debug.ShouldStop(2);
_slot = __ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_getslotbyaudiokey" /*RemoteObject*/ ,(Object)(_audiokey));Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 163;BA.debugLine="If slot.IsInitialized Then";
Debug.ShouldStop(4);
if (_slot.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 164;BA.debugLine="slot.SetRoleState(ResolvePreparedRole(item), \"re";
Debug.ShouldStop(8);
_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_setrolestate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_resolvepreparedrole" /*RemoteObject*/ ,(Object)(_item))),(Object)(RemoteObject.createImmutable("ready")));
 BA.debugLineNum = 165;BA.debugLine="slot.SetItem(item)";
Debug.ShouldStop(16);
_slot.runClassMethod (b4j.example.playbackplayerslot.class, "_setitem" /*RemoteObject*/ ,(Object)(_item));
 };
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trybegindecision(RemoteObject __ref,RemoteObject _decisionname) throws Exception{
try {
		Debug.PushSubsStack("TryBeginDecision (playbackdirectorstate) ","playbackdirectorstate",16,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("trybegindecision")) { return __ref.runUserSub(false, "playbackdirectorstate","trybegindecision", __ref, _decisionname);}
Debug.locals.put("decisionName", _decisionname);
 BA.debugLineNum = 199;BA.debugLine="Public Sub TryBeginDecision(decisionName As String";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="If CurrentDecision <> \"\" Then Return False";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_currentdecision" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
if (true) return playbackdirectorstate.__c.getField(true,"False");};
 BA.debugLineNum = 201;BA.debugLine="BeginDecision(decisionName)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.playbackdirectorstate.class, "_begindecision" /*RemoteObject*/ ,(Object)(_decisionname));
 BA.debugLineNum = 202;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) return playbackdirectorstate.__c.getField(true,"True");
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}