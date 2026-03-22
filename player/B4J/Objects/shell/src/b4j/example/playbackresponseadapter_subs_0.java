package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackresponseadapter_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbackresponseadapter) ","playbackresponseadapter",5,__ref.getField(false, "ba"),__ref,5);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackresponseadapter","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 5;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16);
 BA.debugLineNum = 6;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _normalizequeueresponse(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("NormalizeQueueResponse (playbackresponseadapter) ","playbackresponseadapter",5,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("normalizequeueresponse")) { return __ref.runUserSub(false, "playbackresponseadapter","normalizequeueresponse", __ref, _data);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _normalized = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("Object");
Debug.locals.put("data", _data);
 BA.debugLineNum = 8;BA.debugLine="Public Sub NormalizeQueueResponse(data As Object)";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="If data Is Map Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("i",_data, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 10;BA.debugLine="Dim m As Map = data";
Debug.ShouldStop(512);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data);Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 11;BA.debugLine="Dim items As List = m.GetDefault(\"queue\", Null)";
Debug.ShouldStop(1024);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("queue"))),(Object)(playbackresponseadapter.__c.getField(false,"Null"))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 12;BA.debugLine="If items.IsInitialized = False Then Return Null";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_items.runMethod(true,"IsInitialized"),playbackresponseadapter.__c.getField(true,"False"))) { 
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), playbackresponseadapter.__c.getField(false,"Null"));};
 BA.debugLineNum = 13;BA.debugLine="Dim normalized As List";
Debug.ShouldStop(4096);
_normalized = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("normalized", _normalized);
 BA.debugLineNum = 14;BA.debugLine="normalized.Initialize";
Debug.ShouldStop(8192);
_normalized.runVoidMethod ("Initialize");
 BA.debugLineNum = 15;BA.debugLine="For Each item As Object In items";
Debug.ShouldStop(16384);
{
final RemoteObject group7 = _items;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_item = group7.runMethod(false,"Get",index7);Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 16;BA.debugLine="If item Is Map Then normalized.Add(item)";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("i",_item, RemoteObject.createImmutable("java.util.Map"))) { 
_normalized.runVoidMethod ("Add",(Object)(_item));};
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 18;BA.debugLine="Return normalized";
Debug.ShouldStop(131072);
if (true) return _normalized;
 };
 BA.debugLineNum = 20;BA.debugLine="Return Null";
Debug.ShouldStop(524288);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), playbackresponseadapter.__c.getField(false,"Null"));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _normalizeretryafter(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("NormalizeRetryAfter (playbackresponseadapter) ","playbackresponseadapter",5,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("normalizeretryafter")) { return __ref.runUserSub(false, "playbackresponseadapter","normalizeretryafter", __ref, _data);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable(0);
Debug.locals.put("data", _data);
 BA.debugLineNum = 23;BA.debugLine="Public Sub NormalizeRetryAfter(data As Object) As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="If data Is Map Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("i",_data, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 25;BA.debugLine="Dim m As Map = data";
Debug.ShouldStop(16777216);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data);Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 26;BA.debugLine="If m.ContainsKey(\"retry_after\") = False Then Ret";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_m.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("retry_after")))),playbackresponseadapter.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 27;BA.debugLine="Dim value As Int = m.Get(\"retry_after\")";
Debug.ShouldStop(67108864);
_value = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("retry_after")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 28;BA.debugLine="If value <= 0 Then Return 0";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("k",_value,BA.numberCast(double.class, 0))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 29;BA.debugLine="Return value";
Debug.ShouldStop(268435456);
if (true) return _value;
 };
 BA.debugLineNum = 31;BA.debugLine="Return 0";
Debug.ShouldStop(1073741824);
if (true) return BA.numberCast(int.class, 0);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}