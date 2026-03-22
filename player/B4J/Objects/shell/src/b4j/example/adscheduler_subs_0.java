package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class adscheduler_subs_0 {


public static RemoteObject  _admatchescurrentminute(RemoteObject __ref,RemoteObject _ad,RemoteObject _todaykey,RemoteObject _todayweekday,RemoteObject _currentminuteofday,RemoteObject _allowregularads) throws Exception{
try {
		Debug.PushSubsStack("AdMatchesCurrentMinute (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("admatchescurrentminute")) { return __ref.runUserSub(false, "adscheduler","admatchescurrentminute", __ref, _ad, _todaykey, _todayweekday, _currentminuteofday, _allowregularads);}
RemoteObject _isexact = RemoteObject.createImmutable(false);
RemoteObject _startdate = RemoteObject.createImmutable("");
RemoteObject _enddate = RemoteObject.createImmutable("");
RemoteObject _weekdays = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _weekdaymatched = RemoteObject.createImmutable(false);
RemoteObject _weekdayobject = RemoteObject.declareNull("Object");
RemoteObject _baseminute = RemoteObject.createImmutable(0);
RemoteObject _intervalminutes = RemoteObject.createImmutable(0);
Debug.locals.put("ad", _ad);
Debug.locals.put("todayKey", _todaykey);
Debug.locals.put("todayWeekday", _todayweekday);
Debug.locals.put("currentMinuteOfDay", _currentminuteofday);
Debug.locals.put("allowRegularAds", _allowregularads);
 BA.debugLineNum = 73;BA.debugLine="Private Sub AdMatchesCurrentMinute(ad As Map, toda";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="If ad.IsInitialized = False Then Return False";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_ad.runMethod(true,"IsInitialized"),adscheduler.__c.getField(true,"False"))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 75;BA.debugLine="Dim isExact As Boolean = ad.GetDefault(\"exactly\",";
Debug.ShouldStop(1024);
_isexact = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("exactly"))),(Object)((adscheduler.__c.getField(true,"False")))),(adscheduler.__c.getField(true,"True"))));Debug.locals.put("isExact", _isexact);Debug.locals.put("isExact", _isexact);
 BA.debugLineNum = 76;BA.debugLine="If isExact = False And allowRegularAds = False Th";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_isexact,adscheduler.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_allowregularads,adscheduler.__c.getField(true,"False"))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 77;BA.debugLine="Dim startDate As String = ad.GetDefault(\"start\",";
Debug.ShouldStop(4096);
_startdate = BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("start"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("startDate", _startdate);Debug.locals.put("startDate", _startdate);
 BA.debugLineNum = 78;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(todayK";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",_startdate,BA.ObjectToString("")) && RemoteObject.solveBoolean(">",_startdate.runMethod(true,"compareTo",(Object)(_todaykey)),BA.numberCast(double.class, 0))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 79;BA.debugLine="Dim endDate As String = ad.GetDefault(\"end\", \"\")";
Debug.ShouldStop(16384);
_enddate = BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("end"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("endDate", _enddate);Debug.locals.put("endDate", _enddate);
 BA.debugLineNum = 80;BA.debugLine="If endDate <> \"\" And endDate.CompareTo(todayKey)";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_enddate,BA.ObjectToString("")) && RemoteObject.solveBoolean("<",_enddate.runMethod(true,"compareTo",(Object)(_todaykey)),BA.numberCast(double.class, 0))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 81;BA.debugLine="Dim weekdays As List = ad.GetDefault(\"weekdays\",";
Debug.ShouldStop(65536);
_weekdays = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_weekdays = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("weekdays"))),(Object)(adscheduler.__c.getField(false,"Null"))));Debug.locals.put("weekdays", _weekdays);Debug.locals.put("weekdays", _weekdays);
 BA.debugLineNum = 82;BA.debugLine="If weekdays.IsInitialized And weekdays.Size > 0 T";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(".",_weekdays.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_weekdays.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 83;BA.debugLine="Dim weekdayMatched As Boolean = False";
Debug.ShouldStop(262144);
_weekdaymatched = adscheduler.__c.getField(true,"False");Debug.locals.put("weekdayMatched", _weekdaymatched);Debug.locals.put("weekdayMatched", _weekdaymatched);
 BA.debugLineNum = 84;BA.debugLine="For Each weekdayObject As Object In weekdays";
Debug.ShouldStop(524288);
{
final RemoteObject group11 = _weekdays;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_weekdayobject = group11.runMethod(false,"Get",index11);Debug.locals.put("weekdayObject", _weekdayobject);
Debug.locals.put("weekdayObject", _weekdayobject);
 BA.debugLineNum = 85;BA.debugLine="If (\"\" & weekdayObject).Trim = todayWeekday The";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",(RemoteObject.concat(RemoteObject.createImmutable(""),_weekdayobject)).runMethod(true,"trim"),_todayweekday)) { 
 BA.debugLineNum = 86;BA.debugLine="weekdayMatched = True";
Debug.ShouldStop(2097152);
_weekdaymatched = adscheduler.__c.getField(true,"True");Debug.locals.put("weekdayMatched", _weekdaymatched);
 BA.debugLineNum = 87;BA.debugLine="Exit";
Debug.ShouldStop(4194304);
if (true) break;
 };
 }
}Debug.locals.put("weekdayObject", _weekdayobject);
;
 BA.debugLineNum = 90;BA.debugLine="If weekdayMatched = False Then Return False";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_weekdaymatched,adscheduler.__c.getField(true,"False"))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 };
 BA.debugLineNum = 92;BA.debugLine="Dim baseMinute As Int = TimeStringToMinutes(ad.Ge";
Debug.ShouldStop(134217728);
_baseminute = __ref.runClassMethod (b4j.example.adscheduler.class, "_timestringtominutes" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("time"))),(Object)((RemoteObject.createImmutable("")))))));Debug.locals.put("baseMinute", _baseminute);Debug.locals.put("baseMinute", _baseminute);
 BA.debugLineNum = 93;BA.debugLine="If baseMinute < 0 Then Return False";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",_baseminute,BA.numberCast(double.class, 0))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 94;BA.debugLine="If currentMinuteOfDay < baseMinute Then Return Fa";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("<",_currentminuteofday,BA.numberCast(double.class, _baseminute))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 95;BA.debugLine="Dim intervalMinutes As Int = ToLongDefault(ad.Get";
Debug.ShouldStop(1073741824);
_intervalminutes = BA.numberCast(int.class, __ref.runClassMethod (b4j.example.adscheduler.class, "_tolongdefault" /*RemoteObject*/ ,(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("interval"))),(Object)(RemoteObject.createImmutable((0))))),(Object)(BA.numberCast(long.class, 0))));Debug.locals.put("intervalMinutes", _intervalminutes);Debug.locals.put("intervalMinutes", _intervalminutes);
 BA.debugLineNum = 96;BA.debugLine="If intervalMinutes <= 0 Then Return currentMinute";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("k",_intervalminutes,BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_currentminuteofday,BA.numberCast(double.class, _baseminute)));};
 BA.debugLineNum = 97;BA.debugLine="Return ((currentMinuteOfDay - baseMinute) Mod int";
Debug.ShouldStop(1);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_currentminuteofday,_baseminute}, "-",1, 1)),_intervalminutes}, "%",0, 1)),BA.numberCast(double.class, 0)));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildbreakforminute(RemoteObject __ref,RemoteObject _offlinedata,RemoteObject _targetminutetimestamp,RemoteObject _allowregularads) throws Exception{
try {
		Debug.PushSubsStack("BuildBreakForMinute (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("buildbreakforminute")) { return __ref.runUserSub(false, "adscheduler","buildbreakforminute", __ref, _offlinedata, _targetminutetimestamp, _allowregularads);}
RemoteObject _emptybreak = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ads = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _targetticks = RemoteObject.createImmutable(0L);
RemoteObject _todaykey = RemoteObject.createImmutable("");
RemoteObject _todayweekday = RemoteObject.createImmutable("");
RemoteObject _currentminuteofday = RemoteObject.createImmutable(0);
RemoteObject _dueitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _adobject = RemoteObject.declareNull("Object");
RemoteObject _ad = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _breakitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("offlineData", _offlinedata);
Debug.locals.put("targetMinuteTimestamp", _targetminutetimestamp);
Debug.locals.put("allowRegularAds", _allowregularads);
 BA.debugLineNum = 43;BA.debugLine="Private Sub BuildBreakForMinute(offlineData As Map";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Dim emptyBreak As Map";
Debug.ShouldStop(2048);
_emptybreak = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyBreak", _emptybreak);
 BA.debugLineNum = 45;BA.debugLine="emptyBreak.Initialize";
Debug.ShouldStop(4096);
_emptybreak.runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
Debug.ShouldStop(8192);
_ads = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ads = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ads"))),(Object)(adscheduler.__c.getField(false,"Null"))));Debug.locals.put("ads", _ads);Debug.locals.put("ads", _ads);
 BA.debugLineNum = 47;BA.debugLine="If ads.IsInitialized = False Or ads.Size = 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_ads.runMethod(true,"IsInitialized"),adscheduler.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_ads.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptybreak;};
 BA.debugLineNum = 48;BA.debugLine="Dim targetTicks As Long = LocalTimestampToTicks(t";
Debug.ShouldStop(32768);
_targetticks = __ref.runClassMethod (b4j.example.adscheduler.class, "_localtimestamptoticks" /*RemoteObject*/ ,(Object)(_targetminutetimestamp));Debug.locals.put("targetTicks", _targetticks);Debug.locals.put("targetTicks", _targetticks);
 BA.debugLineNum = 49;BA.debugLine="Dim todayKey As String = FormatIsoDate(targetTick";
Debug.ShouldStop(65536);
_todaykey = __ref.runClassMethod (b4j.example.adscheduler.class, "_formatisodate" /*RemoteObject*/ ,(Object)(_targetticks));Debug.locals.put("todayKey", _todaykey);Debug.locals.put("todayKey", _todaykey);
 BA.debugLineNum = 50;BA.debugLine="Dim todayWeekday As String = IsoWeekdayFromTimest";
Debug.ShouldStop(131072);
_todayweekday = __ref.runClassMethod (b4j.example.adscheduler.class, "_isoweekdayfromtimestamp" /*RemoteObject*/ ,(Object)(_targetticks));Debug.locals.put("todayWeekday", _todayweekday);Debug.locals.put("todayWeekday", _todayweekday);
 BA.debugLineNum = 51;BA.debugLine="Dim currentMinuteOfDay As Int = MinutesOfDayFromT";
Debug.ShouldStop(262144);
_currentminuteofday = __ref.runClassMethod (b4j.example.adscheduler.class, "_minutesofdayfromtimestamp" /*RemoteObject*/ ,(Object)(_targetticks));Debug.locals.put("currentMinuteOfDay", _currentminuteofday);Debug.locals.put("currentMinuteOfDay", _currentminuteofday);
 BA.debugLineNum = 52;BA.debugLine="Dim dueItems As List";
Debug.ShouldStop(524288);
_dueitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("dueItems", _dueitems);
 BA.debugLineNum = 53;BA.debugLine="dueItems.Initialize";
Debug.ShouldStop(1048576);
_dueitems.runVoidMethod ("Initialize");
 BA.debugLineNum = 54;BA.debugLine="For Each adObject As Object In ads";
Debug.ShouldStop(2097152);
{
final RemoteObject group11 = _ads;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_adobject = group11.runMethod(false,"Get",index11);Debug.locals.put("adObject", _adobject);
Debug.locals.put("adObject", _adobject);
 BA.debugLineNum = 55;BA.debugLine="If adObject Is Map Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("i",_adobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 56;BA.debugLine="Dim ad As Map = adObject";
Debug.ShouldStop(8388608);
_ad = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ad = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _adobject);Debug.locals.put("ad", _ad);Debug.locals.put("ad", _ad);
 BA.debugLineNum = 57;BA.debugLine="If AdMatchesCurrentMinute(ad, todayKey, todayWe";
Debug.ShouldStop(16777216);
if (__ref.runClassMethod (b4j.example.adscheduler.class, "_admatchescurrentminute" /*RemoteObject*/ ,(Object)(_ad),(Object)(_todaykey),(Object)(_todayweekday),(Object)(_currentminuteofday),(Object)(_allowregularads)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 58;BA.debugLine="dueItems.Add(CreateAdQueueItem(ad))";
Debug.ShouldStop(33554432);
_dueitems.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.adscheduler.class, "_createadqueueitem" /*RemoteObject*/ ,(Object)(_ad)).getObject())));
 };
 };
 }
}Debug.locals.put("adObject", _adobject);
;
 BA.debugLineNum = 62;BA.debugLine="If dueItems.Size = 0 Then Return emptyBreak";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_dueitems.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptybreak;};
 BA.debugLineNum = 63;BA.debugLine="Dim breakItem As Map";
Debug.ShouldStop(1073741824);
_breakitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("breakItem", _breakitem);
 BA.debugLineNum = 64;BA.debugLine="breakItem.Initialize";
Debug.ShouldStop(-2147483648);
_breakitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 65;BA.debugLine="breakItem.Put(\"type\", \"break\")";
Debug.ShouldStop(1);
_breakitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("break"))));
 BA.debugLineNum = 66;BA.debugLine="breakItem.Put(\"exactly\", True)";
Debug.ShouldStop(2);
_breakitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("exactly"))),(Object)((adscheduler.__c.getField(true,"True"))));
 BA.debugLineNum = 67;BA.debugLine="breakItem.Put(\"at\", targetMinuteTimestamp)";
Debug.ShouldStop(4);
_breakitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("at"))),(Object)((_targetminutetimestamp)));
 BA.debugLineNum = 68;BA.debugLine="breakItem.Put(\"items\", dueItems)";
Debug.ShouldStop(8);
_breakitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("items"))),(Object)((_dueitems.getObject())));
 BA.debugLineNum = 69;BA.debugLine="breakItem.Put(\"items_count\", dueItems.Size)";
Debug.ShouldStop(16);
_breakitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("items_count"))),(Object)((_dueitems.runMethod(true,"getSize"))));
 BA.debugLineNum = 70;BA.debugLine="Return breakItem";
Debug.ShouldStop(32);
if (true) return _breakitem;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private targetModule As Object";
adscheduler._targetmodule = RemoteObject.createNew ("Object");__ref.setField("_targetmodule",adscheduler._targetmodule);
 //BA.debugLineNum = 4;BA.debugLine="Private traceSubName As String";
adscheduler._tracesubname = RemoteObject.createImmutable("");__ref.setField("_tracesubname",adscheduler._tracesubname);
 //BA.debugLineNum = 5;BA.debugLine="Private adLabelText As String";
adscheduler._adlabeltext = RemoteObject.createImmutable("");__ref.setField("_adlabeltext",adscheduler._adlabeltext);
 //BA.debugLineNum = 6;BA.debugLine="Private lastScanMinuteKey As String = \"\"";
adscheduler._lastscanminutekey = BA.ObjectToString("");__ref.setField("_lastscanminutekey",adscheduler._lastscanminutekey);
 //BA.debugLineNum = 7;BA.debugLine="Private lastInjectedMinuteKey As String = \"\"";
adscheduler._lastinjectedminutekey = BA.ObjectToString("");__ref.setField("_lastinjectedminutekey",adscheduler._lastinjectedminutekey);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createadqueueitem(RemoteObject __ref,RemoteObject _ad) throws Exception{
try {
		Debug.PushSubsStack("CreateAdQueueItem (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("createadqueueitem")) { return __ref.runUserSub(false, "adscheduler","createadqueueitem", __ref, _ad);}
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ad", _ad);
 BA.debugLineNum = 100;BA.debugLine="Private Sub CreateAdQueueItem(ad As Map) As Map";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="Dim item As Map";
Debug.ShouldStop(16);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("item", _item);
 BA.debugLineNum = 102;BA.debugLine="item.Initialize";
Debug.ShouldStop(32);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 103;BA.debugLine="item.Put(\"type\", \"ad\")";
Debug.ShouldStop(64);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("ad"))));
 BA.debugLineNum = 104;BA.debugLine="item.Put(\"id\", ad.GetDefault(\"id\", \"\"))";
Debug.ShouldStop(128);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 105;BA.debugLine="item.Put(\"title\", ad.GetDefault(\"title\", adLabelT";
Debug.ShouldStop(256);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((__ref.getField(true,"_adlabeltext" /*RemoteObject*/ ))))));
 BA.debugLineNum = 106;BA.debugLine="item.Put(\"duration\", ToLongDefault(ad.GetDefault(";
Debug.ShouldStop(512);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("duration"))),(Object)((__ref.runClassMethod (b4j.example.adscheduler.class, "_tolongdefault" /*RemoteObject*/ ,(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(RemoteObject.createImmutable((0))))),(Object)(BA.numberCast(long.class, 0))))));
 BA.debugLineNum = 107;BA.debugLine="item.Put(\"gain\", ad.GetDefault(\"gain\", -3))";
Debug.ShouldStop(1024);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 3)))))));
 BA.debugLineNum = 108;BA.debugLine="item.Put(\"exactly\", ad.GetDefault(\"exactly\", Fals";
Debug.ShouldStop(2048);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("exactly"))),(Object)(_ad.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("exactly"))),(Object)((adscheduler.__c.getField(true,"False"))))));
 BA.debugLineNum = 109;BA.debugLine="Return item";
Debug.ShouldStop(4096);
if (true) return _item;
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formatisodate(RemoteObject __ref,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("FormatIsoDate (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("formatisodate")) { return __ref.runUserSub(false, "adscheduler","formatisodate", __ref, _ticks);}
RemoteObject _previousdateformat = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 129;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
Debug.ShouldStop(2);
_previousdateformat = adscheduler.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("previousDateFormat", _previousdateformat);Debug.locals.put("previousDateFormat", _previousdateformat);
 BA.debugLineNum = 131;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(4);
adscheduler.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 132;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
Debug.ShouldStop(8);
_value = adscheduler.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 133;BA.debugLine="DateTime.DateFormat = previousDateFormat";
Debug.ShouldStop(16);
adscheduler.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_previousdateformat);
 BA.debugLineNum = 134;BA.debugLine="Return value";
Debug.ShouldStop(32);
if (true) return _value;
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasbreakscheduledat(RemoteObject __ref,RemoteObject _playqueue,RemoteObject _breakat) throws Exception{
try {
		Debug.PushSubsStack("HasBreakScheduledAt (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("hasbreakscheduledat")) { return __ref.runUserSub(false, "adscheduler","hasbreakscheduledat", __ref, _playqueue, _breakat);}
RemoteObject _itemobject = RemoteObject.declareNull("Object");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playQueue", _playqueue);
Debug.locals.put("breakAt", _breakat);
 BA.debugLineNum = 112;BA.debugLine="Private Sub HasBreakScheduledAt(playQueue As List,";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="If breakAt <= 0 Then Return False";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("k",_breakat,BA.numberCast(long.class, 0))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 114;BA.debugLine="For Each itemObject As Object In playQueue";
Debug.ShouldStop(131072);
{
final RemoteObject group2 = _playqueue;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_itemobject = group2.runMethod(false,"Get",index2);Debug.locals.put("itemObject", _itemobject);
Debug.locals.put("itemObject", _itemobject);
 BA.debugLineNum = 115;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("i",_itemobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 116;BA.debugLine="Dim item As Map = itemObject";
Debug.ShouldStop(524288);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 117;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"break\" And To";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("break"))) && RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.adscheduler.class, "_tolongdefault" /*RemoteObject*/ ,(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("at"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1)))))),(Object)(BA.numberCast(long.class, -(double) (0 + 1)))),_breakat)) { 
if (true) return adscheduler.__c.getField(true,"True");};
 };
 }
}Debug.locals.put("itemObject", _itemobject);
;
 BA.debugLineNum = 120;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) return adscheduler.__c.getField(true,"False");
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _targetmodulevalue,RemoteObject _tracesubnamevalue,RemoteObject _adlabeltextvalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "adscheduler","initialize", __ref, _ba, _targetmodulevalue, _tracesubnamevalue, _adlabeltextvalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("targetModuleValue", _targetmodulevalue);
Debug.locals.put("traceSubNameValue", _tracesubnamevalue);
Debug.locals.put("adLabelTextValue", _adlabeltextvalue);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(targetModuleValue As Object,";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="targetModule = targetModuleValue";
Debug.ShouldStop(1024);
__ref.setField ("_targetmodule" /*RemoteObject*/ ,_targetmodulevalue);
 BA.debugLineNum = 12;BA.debugLine="traceSubName = traceSubNameValue";
Debug.ShouldStop(2048);
__ref.setField ("_tracesubname" /*RemoteObject*/ ,_tracesubnamevalue);
 BA.debugLineNum = 13;BA.debugLine="adLabelText = adLabelTextValue";
Debug.ShouldStop(4096);
__ref.setField ("_adlabeltext" /*RemoteObject*/ ,_adlabeltextvalue);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isoweekdayfromtimestamp(RemoteObject __ref,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("IsoWeekdayFromTimestamp (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("isoweekdayfromtimestamp")) { return __ref.runUserSub(false, "adscheduler","isoweekdayfromtimestamp", __ref, _ticks);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _instantclass = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _zoneclass = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _instant = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _zoneid = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _zoneddatetimeclass = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _zoneddatetime = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _localdate = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _dayofweek = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 147;BA.debugLine="Private Sub IsoWeekdayFromTimestamp(ticks As Long)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(524288);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 149;BA.debugLine="jo.InitializeStatic(\"java.time.LocalDate\")";
Debug.ShouldStop(1048576);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.LocalDate")));
 BA.debugLineNum = 150;BA.debugLine="Dim instantClass As JavaObject";
Debug.ShouldStop(2097152);
_instantclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("instantClass", _instantclass);
 BA.debugLineNum = 151;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant\"";
Debug.ShouldStop(4194304);
_instantclass.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.Instant")));
 BA.debugLineNum = 152;BA.debugLine="Dim zoneClass As JavaObject";
Debug.ShouldStop(8388608);
_zoneclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("zoneClass", _zoneclass);
 BA.debugLineNum = 153;BA.debugLine="zoneClass.InitializeStatic(\"java.time.ZoneId\")";
Debug.ShouldStop(16777216);
_zoneclass.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.ZoneId")));
 BA.debugLineNum = 154;BA.debugLine="Dim instant As JavaObject = instantClass.RunMetho";
Debug.ShouldStop(33554432);
_instant = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_instant = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _instantclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("ofEpochMilli")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ticks)}))));Debug.locals.put("instant", _instant);Debug.locals.put("instant", _instant);
 BA.debugLineNum = 155;BA.debugLine="Dim zoneId As JavaObject = zoneClass.RunMethod(\"s";
Debug.ShouldStop(67108864);
_zoneid = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_zoneid = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _zoneclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("systemDefault")),(Object)((adscheduler.__c.getField(false,"Null")))));Debug.locals.put("zoneId", _zoneid);Debug.locals.put("zoneId", _zoneid);
 BA.debugLineNum = 156;BA.debugLine="Dim zonedDateTimeClass As JavaObject";
Debug.ShouldStop(134217728);
_zoneddatetimeclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("zonedDateTimeClass", _zoneddatetimeclass);
 BA.debugLineNum = 157;BA.debugLine="zonedDateTimeClass.InitializeStatic(\"java.time.Zo";
Debug.ShouldStop(268435456);
_zoneddatetimeclass.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.ZonedDateTime")));
 BA.debugLineNum = 158;BA.debugLine="Dim zonedDateTime As JavaObject = zonedDateTimeCl";
Debug.ShouldStop(536870912);
_zoneddatetime = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_zoneddatetime = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _zoneddatetimeclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("ofInstant")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_instant.getObject()),(_zoneid.getObject())}))));Debug.locals.put("zonedDateTime", _zoneddatetime);Debug.locals.put("zonedDateTime", _zoneddatetime);
 BA.debugLineNum = 159;BA.debugLine="Dim localDate As JavaObject = zonedDateTime.RunMe";
Debug.ShouldStop(1073741824);
_localdate = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_localdate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _zoneddatetime.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toLocalDate")),(Object)((adscheduler.__c.getField(false,"Null")))));Debug.locals.put("localDate", _localdate);Debug.locals.put("localDate", _localdate);
 BA.debugLineNum = 160;BA.debugLine="Dim dayOfWeek As JavaObject = localDate.RunMethod";
Debug.ShouldStop(-2147483648);
_dayofweek = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_dayofweek = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _localdate.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDayOfWeek")),(Object)((adscheduler.__c.getField(false,"Null")))));Debug.locals.put("dayOfWeek", _dayofweek);Debug.locals.put("dayOfWeek", _dayofweek);
 BA.debugLineNum = 161;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
Debug.ShouldStop(1);
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_dayofweek.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getValue")),(Object)((adscheduler.__c.getField(false,"Null")))));
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _localtimestamptoticks(RemoteObject __ref,RemoteObject _targettimestamp) throws Exception{
try {
		Debug.PushSubsStack("LocalTimestampToTicks (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("localtimestamptoticks")) { return __ref.runUserSub(false, "adscheduler","localtimestamptoticks", __ref, _targettimestamp);}
Debug.locals.put("targetTimestamp", _targettimestamp);
 BA.debugLineNum = 176;BA.debugLine="Private Sub LocalTimestampToTicks(targetTimestamp";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="Return (targetTimestamp + (TimezoneOffsetMinutes";
Debug.ShouldStop(65536);
if (true) return RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_targettimestamp,(RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4j.example.adscheduler.class, "_timezoneoffsetminutes" /*RemoteObject*/ ),RemoteObject.createImmutable(60)}, "*",0, 1))}, "+",1, 2)),RemoteObject.createImmutable(1000)}, "*",0, 2);
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _minutekeyfromtimestamp(RemoteObject __ref,RemoteObject _targetminutetimestamp) throws Exception{
try {
		Debug.PushSubsStack("MinuteKeyFromTimestamp (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("minutekeyfromtimestamp")) { return __ref.runUserSub(false, "adscheduler","minutekeyfromtimestamp", __ref, _targetminutetimestamp);}
RemoteObject _previousdateformat = RemoteObject.createImmutable("");
RemoteObject _previoustimeformat = RemoteObject.createImmutable("");
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("targetMinuteTimestamp", _targetminutetimestamp);
 BA.debugLineNum = 164;BA.debugLine="Private Sub MinuteKeyFromTimestamp(targetMinuteTim";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
Debug.ShouldStop(16);
_previousdateformat = adscheduler.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("previousDateFormat", _previousdateformat);Debug.locals.put("previousDateFormat", _previousdateformat);
 BA.debugLineNum = 166;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
Debug.ShouldStop(32);
_previoustimeformat = adscheduler.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("previousTimeFormat", _previoustimeformat);Debug.locals.put("previousTimeFormat", _previoustimeformat);
 BA.debugLineNum = 167;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(64);
adscheduler.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 168;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
Debug.ShouldStop(128);
adscheduler.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 169;BA.debugLine="Dim ticks As Long = LocalTimestampToTicks(targetM";
Debug.ShouldStop(256);
_ticks = __ref.runClassMethod (b4j.example.adscheduler.class, "_localtimestamptoticks" /*RemoteObject*/ ,(Object)(_targetminutetimestamp));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 170;BA.debugLine="Dim value As String = DateTime.Date(ticks) & \" \"";
Debug.ShouldStop(512);
_value = RemoteObject.concat(adscheduler.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks)),RemoteObject.createImmutable(" "),adscheduler.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_ticks)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 171;BA.debugLine="DateTime.DateFormat = previousDateFormat";
Debug.ShouldStop(1024);
adscheduler.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_previousdateformat);
 BA.debugLineNum = 172;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
Debug.ShouldStop(2048);
adscheduler.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_previoustimeformat);
 BA.debugLineNum = 173;BA.debugLine="Return value";
Debug.ShouldStop(4096);
if (true) return _value;
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _minutesofdayfromtimestamp(RemoteObject __ref,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("MinutesOfDayFromTimestamp (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("minutesofdayfromtimestamp")) { return __ref.runUserSub(false, "adscheduler","minutesofdayfromtimestamp", __ref, _ticks);}
RemoteObject _previoustimeformat = RemoteObject.createImmutable("");
RemoteObject _timevalue = RemoteObject.createImmutable("");
RemoteObject _parts = null;
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 137;BA.debugLine="Private Sub MinutesOfDayFromTimestamp(ticks As Lon";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
Debug.ShouldStop(512);
_previoustimeformat = adscheduler.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("previousTimeFormat", _previoustimeformat);Debug.locals.put("previousTimeFormat", _previoustimeformat);
 BA.debugLineNum = 139;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(1024);
adscheduler.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 140;BA.debugLine="Dim timeValue As String = DateTime.Time(ticks)";
Debug.ShouldStop(2048);
_timevalue = adscheduler.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_ticks));Debug.locals.put("timeValue", _timevalue);Debug.locals.put("timeValue", _timevalue);
 BA.debugLineNum = 141;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
Debug.ShouldStop(4096);
adscheduler.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_previoustimeformat);
 BA.debugLineNum = 142;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
Debug.ShouldStop(8192);
_parts = adscheduler.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_timevalue));Debug.locals.put("parts", _parts);Debug.locals.put("parts", _parts);
 BA.debugLineNum = 143;BA.debugLine="If parts.Length < 2 Then Return 0";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("<",_parts.getField(true,"length"),BA.numberCast(double.class, 2))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 144;BA.debugLine="Return parts(0) * 60 + parts(1)";
Debug.ShouldStop(32768);
if (true) return BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _parts.getArrayElement(true,BA.numberCast(int.class, 0))),RemoteObject.createImmutable(60),BA.numberCast(double.class, _parts.getArrayElement(true,BA.numberCast(int.class, 1)))}, "*+",1, 0));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reset(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Reset (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "adscheduler","reset", __ref);}
 BA.debugLineNum = 16;BA.debugLine="Public Sub Reset";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="lastScanMinuteKey = \"\"";
Debug.ShouldStop(65536);
__ref.setField ("_lastscanminutekey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 18;BA.debugLine="lastInjectedMinuteKey = \"\"";
Debug.ShouldStop(131072);
__ref.setField ("_lastinjectedminutekey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scantargetminute(RemoteObject __ref,RemoteObject _offlinedata,RemoteObject _playqueue,RemoteObject _targetminutetimestamp,RemoteObject _force,RemoteObject _allowregularads) throws Exception{
try {
		Debug.PushSubsStack("ScanTargetMinute (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("scantargetminute")) { return __ref.runUserSub(false, "adscheduler","scantargetminute", __ref, _offlinedata, _playqueue, _targetminutetimestamp, _force, _allowregularads);}
RemoteObject _minutekey = RemoteObject.createImmutable("");
RemoteObject _breakitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _breakat = RemoteObject.createImmutable(0L);
Debug.locals.put("offlineData", _offlinedata);
Debug.locals.put("playQueue", _playqueue);
Debug.locals.put("targetMinuteTimestamp", _targetminutetimestamp);
Debug.locals.put("force", _force);
Debug.locals.put("allowRegularAds", _allowregularads);
 BA.debugLineNum = 21;BA.debugLine="Public Sub ScanTargetMinute(offlineData As Map, pl";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),adscheduler.__c.getField(true,"False"))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 23;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",_offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ok"))),(Object)((adscheduler.__c.getField(true,"False")))),(adscheduler.__c.getField(true,"True")))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 24;BA.debugLine="If playQueue.IsInitialized = False Then Return Fa";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_playqueue.runMethod(true,"IsInitialized"),adscheduler.__c.getField(true,"False"))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 25;BA.debugLine="Dim minuteKey As String = MinuteKeyFromTimestamp(";
Debug.ShouldStop(16777216);
_minutekey = __ref.runClassMethod (b4j.example.adscheduler.class, "_minutekeyfromtimestamp" /*RemoteObject*/ ,(Object)(_targetminutetimestamp));Debug.locals.put("minuteKey", _minutekey);Debug.locals.put("minuteKey", _minutekey);
 BA.debugLineNum = 26;BA.debugLine="If force = False And minuteKey = lastScanMinuteKe";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_force,adscheduler.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_minutekey,__ref.getField(true,"_lastscanminutekey" /*RemoteObject*/ ))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 27;BA.debugLine="lastScanMinuteKey = minuteKey";
Debug.ShouldStop(67108864);
__ref.setField ("_lastscanminutekey" /*RemoteObject*/ ,_minutekey);
 BA.debugLineNum = 28;BA.debugLine="Dim breakItem As Map = BuildBreakForMinute(offlin";
Debug.ShouldStop(134217728);
_breakitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_breakitem = __ref.runClassMethod (b4j.example.adscheduler.class, "_buildbreakforminute" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(_targetminutetimestamp),(Object)(_allowregularads));Debug.locals.put("breakItem", _breakitem);Debug.locals.put("breakItem", _breakitem);
 BA.debugLineNum = 29;BA.debugLine="If breakItem.IsInitialized = False Or breakItem.S";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_breakitem.runMethod(true,"IsInitialized"),adscheduler.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_breakitem.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 30;BA.debugLine="Dim breakAt As Long = ToLongDefault(breakItem.Get";
Debug.ShouldStop(536870912);
_breakat = __ref.runClassMethod (b4j.example.adscheduler.class, "_tolongdefault" /*RemoteObject*/ ,(Object)(_breakitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("at"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1)))))),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));Debug.locals.put("breakAt", _breakat);Debug.locals.put("breakAt", _breakat);
 BA.debugLineNum = 31;BA.debugLine="If breakAt <= 0 Then Return False";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("k",_breakat,BA.numberCast(long.class, 0))) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 32;BA.debugLine="If HasBreakScheduledAt(playQueue, breakAt) Then";
Debug.ShouldStop(-2147483648);
if (__ref.runClassMethod (b4j.example.adscheduler.class, "_hasbreakscheduledat" /*RemoteObject*/ ,(Object)(_playqueue),(Object)(_breakat)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 33;BA.debugLine="lastInjectedMinuteKey = minuteKey";
Debug.ShouldStop(1);
__ref.setField ("_lastinjectedminutekey" /*RemoteObject*/ ,_minutekey);
 BA.debugLineNum = 34;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) return adscheduler.__c.getField(true,"False");
 };
 BA.debugLineNum = 36;BA.debugLine="If lastInjectedMinuteKey = minuteKey Then Return";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_lastinjectedminutekey" /*RemoteObject*/ ),_minutekey)) { 
if (true) return adscheduler.__c.getField(true,"False");};
 BA.debugLineNum = 37;BA.debugLine="playQueue.InsertAt(0, breakItem)";
Debug.ShouldStop(16);
_playqueue.runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, 0)),(Object)((_breakitem.getObject())));
 BA.debugLineNum = 38;BA.debugLine="lastInjectedMinuteKey = minuteKey";
Debug.ShouldStop(32);
__ref.setField ("_lastinjectedminutekey" /*RemoteObject*/ ,_minutekey);
 BA.debugLineNum = 39;BA.debugLine="Trace(\"Локальный break добавлен в начало очереди.";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.adscheduler.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Локальный break добавлен в начало очереди. minute="),_minutekey,RemoteObject.createImmutable(", items="),_breakitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("items_count"))),(Object)(RemoteObject.createImmutable((0)))),RemoteObject.createImmutable(", queueSize="),_playqueue.runMethod(true,"getSize"))));
 BA.debugLineNum = 40;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) return adscheduler.__c.getField(true,"True");
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timestringtominutes(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("TimeStringToMinutes (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,189);
if (RapidSub.canDelegate("timestringtominutes")) { return __ref.runUserSub(false, "adscheduler","timestringtominutes", __ref, _value);}
RemoteObject _parts = null;
RemoteObject _hours = RemoteObject.createImmutable(0);
RemoteObject _minutes = RemoteObject.createImmutable(0);
Debug.locals.put("value", _value);
 BA.debugLineNum = 189;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="If value = \"\" Then Return -1";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(""))) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 191;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
Debug.ShouldStop(1073741824);
_parts = adscheduler.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_value));Debug.locals.put("parts", _parts);Debug.locals.put("parts", _parts);
 BA.debugLineNum = 192;BA.debugLine="If parts.Length < 2 Then Return -1";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",_parts.getField(true,"length"),BA.numberCast(double.class, 2))) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 193;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 194;BA.debugLine="Dim hours As Int = parts(0)";
Debug.ShouldStop(2);
_hours = BA.numberCast(int.class, _parts.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("hours", _hours);Debug.locals.put("hours", _hours);
 BA.debugLineNum = 195;BA.debugLine="Dim minutes As Int = parts(1)";
Debug.ShouldStop(4);
_minutes = BA.numberCast(int.class, _parts.getArrayElement(true,BA.numberCast(int.class, 1)));Debug.locals.put("minutes", _minutes);Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 196;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",_hours,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_hours,BA.numberCast(double.class, 23))) { 
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 197;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",_minutes,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_minutes,BA.numberCast(double.class, 59))) { 
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 198;BA.debugLine="Return hours * 60 + minutes";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.solve(new RemoteObject[] {_hours,RemoteObject.createImmutable(60),_minutes}, "*+",1, 1);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 200;BA.debugLine="Return -1";
Debug.ShouldStop(128);
if (true) return BA.numberCast(int.class, -(double) (0 + 1));
 };
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timezoneoffsetminutes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TimezoneOffsetMinutes (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("timezoneoffsetminutes")) { return __ref.runUserSub(false, "adscheduler","timezoneoffsetminutes", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _nowoffset = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _zoneoffset = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _totalseconds = RemoteObject.createImmutable(0);
 BA.debugLineNum = 180;BA.debugLine="Private Sub TimezoneOffsetMinutes As Int";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(1048576);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 182;BA.debugLine="jo.InitializeStatic(\"java.time.OffsetDateTime\")";
Debug.ShouldStop(2097152);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.OffsetDateTime")));
 BA.debugLineNum = 183;BA.debugLine="Dim nowOffset As JavaObject = jo.RunMethod(\"now\",";
Debug.ShouldStop(4194304);
_nowoffset = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_nowoffset = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("now")),(Object)((adscheduler.__c.getField(false,"Null")))));Debug.locals.put("nowOffset", _nowoffset);Debug.locals.put("nowOffset", _nowoffset);
 BA.debugLineNum = 184;BA.debugLine="Dim zoneOffset As JavaObject = nowOffset.RunMetho";
Debug.ShouldStop(8388608);
_zoneoffset = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_zoneoffset = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _nowoffset.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getOffset")),(Object)((adscheduler.__c.getField(false,"Null")))));Debug.locals.put("zoneOffset", _zoneoffset);Debug.locals.put("zoneOffset", _zoneoffset);
 BA.debugLineNum = 185;BA.debugLine="Dim totalSeconds As Int = zoneOffset.RunMethod(\"g";
Debug.ShouldStop(16777216);
_totalseconds = BA.numberCast(int.class, _zoneoffset.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTotalSeconds")),(Object)((adscheduler.__c.getField(false,"Null")))));Debug.locals.put("totalSeconds", _totalseconds);Debug.locals.put("totalSeconds", _totalseconds);
 BA.debugLineNum = 186;BA.debugLine="Return -Round(totalSeconds / 60)";
Debug.ShouldStop(33554432);
if (true) return BA.numberCast(int.class, -(double) (0 + adscheduler.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_totalseconds,RemoteObject.createImmutable(60)}, "/",0, 0))).<Long>get().longValue()));
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tolongdefault(RemoteObject __ref,RemoteObject _value,RemoteObject _defaultvalue) throws Exception{
try {
		Debug.PushSubsStack("ToLongDefault (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("tolongdefault")) { return __ref.runUserSub(false, "adscheduler","tolongdefault", __ref, _value, _defaultvalue);}
Debug.locals.put("value", _value);
Debug.locals.put("defaultValue", _defaultvalue);
 BA.debugLineNum = 204;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
Debug.ShouldStop(2048);
 BA.debugLineNum = 205;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 206;BA.debugLine="If value = Null Then Return defaultValue";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("n",_value)) { 
Debug.CheckDeviceExceptions();if (true) return _defaultvalue;};
 BA.debugLineNum = 207;BA.debugLine="Return value";
Debug.ShouldStop(16384);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, _value);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 209;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 210;BA.debugLine="Return Floor((\"\" & value).Trim)";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, adscheduler.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, (RemoteObject.concat(RemoteObject.createImmutable(""),_value)).runMethod(true,"trim")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 212;BA.debugLine="Return defaultValue";
Debug.ShouldStop(524288);
if (true) return _defaultvalue;
 };
 };
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trace(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("Trace (adscheduler) ","adscheduler",15,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "adscheduler","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 123;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
Debug.ShouldStop(134217728);
if (adscheduler.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 125;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
Debug.ShouldStop(268435456);
adscheduler.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ )),(Object)((_message)));
 };
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}