package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class adscheduler extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.adscheduler");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.adscheduler.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public Object _targetmodule = null;
public String _tracesubname = "";
public String _adlabeltext = "";
public String _lastscanminutekey = "";
public String _lastinjectedminutekey = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public boolean  _admatchescurrentminute(anywheresoftware.b4a.objects.collections.Map _ad,String _todaykey,String _todayweekday,int _currentminuteofday,boolean _allowregularads) throws Exception{
boolean _isexact = false;
String _startdate = "";
String _enddate = "";
anywheresoftware.b4a.objects.collections.List _weekdays = null;
boolean _weekdaymatched = false;
Object _weekdayobject = null;
int _baseminute = 0;
int _intervalminutes = 0;
 //BA.debugLineNum = 88;BA.debugLine="Private Sub AdMatchesCurrentMinute(ad As Map, toda";
 //BA.debugLineNum = 89;BA.debugLine="If ad.IsInitialized = False Then Return False";
if (_ad.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 90;BA.debugLine="Dim isExact As Boolean = ad.GetDefault(\"exactly\",";
_isexact = (_ad.GetDefault((Object)("exactly"),(Object)(__c.False))).equals((Object)(__c.True));
 //BA.debugLineNum = 91;BA.debugLine="If isExact = False And allowRegularAds = False Th";
if (_isexact==__c.False && _allowregularads==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 92;BA.debugLine="Dim startDate As String = ad.GetDefault(\"start\",";
_startdate = BA.ObjectToString(_ad.GetDefault((Object)("start"),(Object)("")));
 //BA.debugLineNum = 93;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(todayK";
if ((_startdate).equals("") == false && _startdate.compareTo(_todaykey)>0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 94;BA.debugLine="Dim endDate As String = ad.GetDefault(\"end\", \"\")";
_enddate = BA.ObjectToString(_ad.GetDefault((Object)("end"),(Object)("")));
 //BA.debugLineNum = 95;BA.debugLine="If endDate <> \"\" And endDate.CompareTo(todayKey)";
if ((_enddate).equals("") == false && _enddate.compareTo(_todaykey)<0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 96;BA.debugLine="Dim weekdays As List = ad.GetDefault(\"weekdays\",";
_weekdays = new anywheresoftware.b4a.objects.collections.List();
_weekdays = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ad.GetDefault((Object)("weekdays"),__c.Null)));
 //BA.debugLineNum = 97;BA.debugLine="If weekdays.IsInitialized And weekdays.Size > 0 T";
if (_weekdays.IsInitialized() && _weekdays.getSize()>0) { 
 //BA.debugLineNum = 98;BA.debugLine="Dim weekdayMatched As Boolean = False";
_weekdaymatched = __c.False;
 //BA.debugLineNum = 99;BA.debugLine="For Each weekdayObject As Object In weekdays";
{
final anywheresoftware.b4a.BA.IterableList group11 = _weekdays;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_weekdayobject = group11.Get(index11);
 //BA.debugLineNum = 100;BA.debugLine="If (\"\" & weekdayObject).Trim = todayWeekday The";
if (((""+BA.ObjectToString(_weekdayobject)).trim()).equals(_todayweekday)) { 
 //BA.debugLineNum = 101;BA.debugLine="weekdayMatched = True";
_weekdaymatched = __c.True;
 //BA.debugLineNum = 102;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 105;BA.debugLine="If weekdayMatched = False Then Return False";
if (_weekdaymatched==__c.False) { 
if (true) return __c.False;};
 };
 //BA.debugLineNum = 107;BA.debugLine="Dim baseMinute As Int = TimeStringToMinutes(ad.Ge";
_baseminute = _timestringtominutes(BA.ObjectToString(_ad.GetDefault((Object)("time"),(Object)(""))));
 //BA.debugLineNum = 108;BA.debugLine="If baseMinute < 0 Then Return False";
if (_baseminute<0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 109;BA.debugLine="If currentMinuteOfDay < baseMinute Then Return Fa";
if (_currentminuteofday<_baseminute) { 
if (true) return __c.False;};
 //BA.debugLineNum = 110;BA.debugLine="Dim intervalMinutes As Int = ToLongDefault(ad.Get";
_intervalminutes = (int) (_tolongdefault(_ad.GetDefault((Object)("interval"),(Object)(0)),(long) (0)));
 //BA.debugLineNum = 111;BA.debugLine="If intervalMinutes <= 0 Then Return currentMinute";
if (_intervalminutes<=0) { 
if (true) return _currentminuteofday==_baseminute;};
 //BA.debugLineNum = 112;BA.debugLine="Return ((currentMinuteOfDay - baseMinute) Mod int";
if (true) return ((_currentminuteofday-_baseminute)%_intervalminutes)==0;
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _buildbreakforminute(anywheresoftware.b4a.objects.collections.Map _offlinedata,long _targetminutetimestamp,boolean _allowregularads) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptybreak = null;
anywheresoftware.b4a.objects.collections.List _ads = null;
long _targetticks = 0L;
String _todaykey = "";
String _todayweekday = "";
int _currentminuteofday = 0;
anywheresoftware.b4a.objects.collections.List _dueitems = null;
boolean _hasexactads = false;
Object _adobject = null;
anywheresoftware.b4a.objects.collections.Map _ad = null;
anywheresoftware.b4a.objects.collections.Map _breakitem = null;
 //BA.debugLineNum = 55;BA.debugLine="Private Sub BuildBreakForMinute(offlineData As Map";
 //BA.debugLineNum = 56;BA.debugLine="Dim emptyBreak As Map";
_emptybreak = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 57;BA.debugLine="emptyBreak.Initialize";
_emptybreak.Initialize();
 //BA.debugLineNum = 58;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("ads"),__c.Null)));
 //BA.debugLineNum = 59;BA.debugLine="If ads.IsInitialized = False Or ads.Size = 0 Then";
if (_ads.IsInitialized()==__c.False || _ads.getSize()==0) { 
if (true) return _emptybreak;};
 //BA.debugLineNum = 60;BA.debugLine="Dim targetTicks As Long = LocalTimestampToTicks(t";
_targetticks = _localtimestamptoticks(_targetminutetimestamp);
 //BA.debugLineNum = 61;BA.debugLine="Dim todayKey As String = FormatIsoDate(targetTick";
_todaykey = _formatisodate(_targetticks);
 //BA.debugLineNum = 62;BA.debugLine="Dim todayWeekday As String = IsoWeekdayFromTimest";
_todayweekday = _isoweekdayfromtimestamp(_targetticks);
 //BA.debugLineNum = 63;BA.debugLine="Dim currentMinuteOfDay As Int = MinutesOfDayFromT";
_currentminuteofday = _minutesofdayfromtimestamp(_targetticks);
 //BA.debugLineNum = 64;BA.debugLine="Dim dueItems As List";
_dueitems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 65;BA.debugLine="dueItems.Initialize";
_dueitems.Initialize();
 //BA.debugLineNum = 66;BA.debugLine="Dim hasExactAds As Boolean = False";
_hasexactads = __c.False;
 //BA.debugLineNum = 67;BA.debugLine="For Each adObject As Object In ads";
{
final anywheresoftware.b4a.BA.IterableList group12 = _ads;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_adobject = group12.Get(index12);
 //BA.debugLineNum = 68;BA.debugLine="If adObject Is Map Then";
if (_adobject instanceof java.util.Map) { 
 //BA.debugLineNum = 69;BA.debugLine="Dim ad As Map = adObject";
_ad = new anywheresoftware.b4a.objects.collections.Map();
_ad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adobject));
 //BA.debugLineNum = 70;BA.debugLine="If AdMatchesCurrentMinute(ad, todayKey, todayWe";
if (_admatchescurrentminute(_ad,_todaykey,_todayweekday,_currentminuteofday,_allowregularads)) { 
 //BA.debugLineNum = 71;BA.debugLine="If ad.GetDefault(\"exactly\", False) = True Then";
if ((_ad.GetDefault((Object)("exactly"),(Object)(__c.False))).equals((Object)(__c.True))) { 
_hasexactads = __c.True;};
 //BA.debugLineNum = 72;BA.debugLine="dueItems.Add(CreateAdQueueItem(ad))";
_dueitems.Add((Object)(_createadqueueitem(_ad).getObject()));
 };
 };
 }
};
 //BA.debugLineNum = 76;BA.debugLine="If dueItems.Size = 0 Then Return emptyBreak";
if (_dueitems.getSize()==0) { 
if (true) return _emptybreak;};
 //BA.debugLineNum = 77;BA.debugLine="Dim breakItem As Map";
_breakitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 78;BA.debugLine="breakItem.Initialize";
_breakitem.Initialize();
 //BA.debugLineNum = 79;BA.debugLine="breakItem.Put(\"type\", \"break\")";
_breakitem.Put((Object)("type"),(Object)("break"));
 //BA.debugLineNum = 80;BA.debugLine="breakItem.Put(\"exactly\", hasExactAds)";
_breakitem.Put((Object)("exactly"),(Object)(_hasexactads));
 //BA.debugLineNum = 81;BA.debugLine="breakItem.Put(\"at\", targetMinuteTimestamp)";
_breakitem.Put((Object)("at"),(Object)(_targetminutetimestamp));
 //BA.debugLineNum = 82;BA.debugLine="breakItem.Put(\"items\", dueItems)";
_breakitem.Put((Object)("items"),(Object)(_dueitems.getObject()));
 //BA.debugLineNum = 83;BA.debugLine="breakItem.Put(\"items_count\", dueItems.Size)";
_breakitem.Put((Object)("items_count"),(Object)(_dueitems.getSize()));
 //BA.debugLineNum = 84;BA.debugLine="Return breakItem";
if (true) return _breakitem;
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
 //BA.debugLineNum = 11;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
 //BA.debugLineNum = 12;BA.debugLine="Private adLabelText As String";
_adlabeltext = "";
 //BA.debugLineNum = 13;BA.debugLine="Private lastScanMinuteKey As String = \"\"";
_lastscanminutekey = "";
 //BA.debugLineNum = 14;BA.debugLine="Private lastInjectedMinuteKey As String = \"\"";
_lastinjectedminutekey = "";
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _createadqueueitem(anywheresoftware.b4a.objects.collections.Map _ad) throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
 //BA.debugLineNum = 115;BA.debugLine="Private Sub CreateAdQueueItem(ad As Map) As Map";
 //BA.debugLineNum = 116;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 117;BA.debugLine="item.Initialize";
_item.Initialize();
 //BA.debugLineNum = 118;BA.debugLine="item.Put(\"type\", \"ad\")";
_item.Put((Object)("type"),(Object)("ad"));
 //BA.debugLineNum = 119;BA.debugLine="item.Put(\"id\", ad.GetDefault(\"id\", \"\"))";
_item.Put((Object)("id"),_ad.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 120;BA.debugLine="item.Put(\"title\", ad.GetDefault(\"title\", adLabelT";
_item.Put((Object)("title"),_ad.GetDefault((Object)("title"),(Object)(_adlabeltext)));
 //BA.debugLineNum = 121;BA.debugLine="item.Put(\"duration\", ToLongDefault(ad.GetDefault(";
_item.Put((Object)("duration"),(Object)(_tolongdefault(_ad.GetDefault((Object)("duration"),(Object)(0)),(long) (0))));
 //BA.debugLineNum = 122;BA.debugLine="item.Put(\"gain\", ad.GetDefault(\"gain\", -3))";
_item.Put((Object)("gain"),_ad.GetDefault((Object)("gain"),(Object)(-3)));
 //BA.debugLineNum = 123;BA.debugLine="item.Put(\"exactly\", ad.GetDefault(\"exactly\", Fals";
_item.Put((Object)("exactly"),_ad.GetDefault((Object)("exactly"),(Object)(__c.False)));
 //BA.debugLineNum = 124;BA.debugLine="Return item";
if (true) return _item;
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public String  _formatisodate(long _ticks) throws Exception{
String _previousdateformat = "";
String _value = "";
 //BA.debugLineNum = 144;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
 //BA.debugLineNum = 145;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
 //BA.debugLineNum = 146;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 147;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
 //BA.debugLineNum = 148;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
 //BA.debugLineNum = 149;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public boolean  _hasbreakscheduledat(anywheresoftware.b4a.objects.collections.List _playqueue,long _breakat) throws Exception{
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
 //BA.debugLineNum = 127;BA.debugLine="Private Sub HasBreakScheduledAt(playQueue As List,";
 //BA.debugLineNum = 128;BA.debugLine="If breakAt <= 0 Then Return False";
if (_breakat<=0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 129;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group2 = _playqueue;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_itemobject = group2.Get(index2);
 //BA.debugLineNum = 130;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
 //BA.debugLineNum = 131;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
 //BA.debugLineNum = 132;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"break\" And To";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break")) && _tolongdefault(_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1))==_breakat) { 
if (true) return __c.True;};
 };
 }
};
 //BA.debugLineNum = 135;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _targetmodulevalue,String _tracesubnamevalue,String _adlabeltextvalue) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(targetModuleValue As Object,";
 //BA.debugLineNum = 18;BA.debugLine="targetModule = targetModuleValue";
_targetmodule = _targetmodulevalue;
 //BA.debugLineNum = 19;BA.debugLine="traceSubName = traceSubNameValue";
_tracesubname = _tracesubnamevalue;
 //BA.debugLineNum = 20;BA.debugLine="adLabelText = adLabelTextValue";
_adlabeltext = _adlabeltextvalue;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _isoweekdayfromtimestamp(long _ticks) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _instantclass = null;
anywheresoftware.b4j.object.JavaObject _zoneclass = null;
anywheresoftware.b4j.object.JavaObject _instant = null;
anywheresoftware.b4j.object.JavaObject _zoneid = null;
anywheresoftware.b4j.object.JavaObject _zoneddatetimeclass = null;
anywheresoftware.b4j.object.JavaObject _zoneddatetime = null;
anywheresoftware.b4j.object.JavaObject _localdate = null;
anywheresoftware.b4j.object.JavaObject _dayofweek = null;
 //BA.debugLineNum = 162;BA.debugLine="Private Sub IsoWeekdayFromTimestamp(ticks As Long)";
 //BA.debugLineNum = 163;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 164;BA.debugLine="jo.InitializeStatic(\"java.time.LocalDate\")";
_jo.InitializeStatic("java.time.LocalDate");
 //BA.debugLineNum = 165;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 166;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant\"";
_instantclass.InitializeStatic("java.time.Instant");
 //BA.debugLineNum = 167;BA.debugLine="Dim zoneClass As JavaObject";
_zoneclass = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 168;BA.debugLine="zoneClass.InitializeStatic(\"java.time.ZoneId\")";
_zoneclass.InitializeStatic("java.time.ZoneId");
 //BA.debugLineNum = 169;BA.debugLine="Dim instant As JavaObject = instantClass.RunMetho";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("ofEpochMilli",new Object[]{(Object)(_ticks)})));
 //BA.debugLineNum = 170;BA.debugLine="Dim zoneId As JavaObject = zoneClass.RunMethod(\"s";
_zoneid = new anywheresoftware.b4j.object.JavaObject();
_zoneid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneclass.RunMethod("systemDefault",(Object[])(__c.Null))));
 //BA.debugLineNum = 171;BA.debugLine="Dim zonedDateTimeClass As JavaObject";
_zoneddatetimeclass = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 172;BA.debugLine="zonedDateTimeClass.InitializeStatic(\"java.time.Zo";
_zoneddatetimeclass.InitializeStatic("java.time.ZonedDateTime");
 //BA.debugLineNum = 173;BA.debugLine="Dim zonedDateTime As JavaObject = zonedDateTimeCl";
_zoneddatetime = new anywheresoftware.b4j.object.JavaObject();
_zoneddatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetimeclass.RunMethod("ofInstant",new Object[]{(Object)(_instant.getObject()),(Object)(_zoneid.getObject())})));
 //BA.debugLineNum = 174;BA.debugLine="Dim localDate As JavaObject = zonedDateTime.RunMe";
_localdate = new anywheresoftware.b4j.object.JavaObject();
_localdate = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetime.RunMethod("toLocalDate",(Object[])(__c.Null))));
 //BA.debugLineNum = 175;BA.debugLine="Dim dayOfWeek As JavaObject = localDate.RunMethod";
_dayofweek = new anywheresoftware.b4j.object.JavaObject();
_dayofweek = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_localdate.RunMethod("getDayOfWeek",(Object[])(__c.Null))));
 //BA.debugLineNum = 176;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
if (true) return ""+BA.ObjectToString(_dayofweek.RunMethod("getValue",(Object[])(__c.Null)));
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public long  _localtimestamptoticks(long _targettimestamp) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Private Sub LocalTimestampToTicks(targetTimestamp";
 //BA.debugLineNum = 192;BA.debugLine="Return (targetTimestamp + (TimezoneOffsetMinutes";
if (true) return (long) ((_targettimestamp+(_timezoneoffsetminutes()*60))*1000);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return 0L;
}
public String  _minutekeyfromtimestamp(long _targetminutetimestamp) throws Exception{
String _previousdateformat = "";
String _previoustimeformat = "";
long _ticks = 0L;
String _value = "";
 //BA.debugLineNum = 179;BA.debugLine="Private Sub MinuteKeyFromTimestamp(targetMinuteTim";
 //BA.debugLineNum = 180;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
 //BA.debugLineNum = 181;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
 //BA.debugLineNum = 182;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 183;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
__c.DateTime.setTimeFormat("HH:mm");
 //BA.debugLineNum = 184;BA.debugLine="Dim ticks As Long = LocalTimestampToTicks(targetM";
_ticks = _localtimestamptoticks(_targetminutetimestamp);
 //BA.debugLineNum = 185;BA.debugLine="Dim value As String = DateTime.Date(ticks) & \" \"";
_value = __c.DateTime.Date(_ticks)+" "+__c.DateTime.Time(_ticks);
 //BA.debugLineNum = 186;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
 //BA.debugLineNum = 187;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
 //BA.debugLineNum = 188;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public int  _minutesofdayfromtimestamp(long _ticks) throws Exception{
String _previoustimeformat = "";
String _timevalue = "";
String[] _parts = null;
 //BA.debugLineNum = 152;BA.debugLine="Private Sub MinutesOfDayFromTimestamp(ticks As Lon";
 //BA.debugLineNum = 153;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
 //BA.debugLineNum = 154;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
 //BA.debugLineNum = 155;BA.debugLine="Dim timeValue As String = DateTime.Time(ticks)";
_timevalue = __c.DateTime.Time(_ticks);
 //BA.debugLineNum = 156;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
 //BA.debugLineNum = 157;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
 //BA.debugLineNum = 158;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 159;BA.debugLine="Return parts(0) * 60 + parts(1)";
if (true) return (int) ((double)(Double.parseDouble(_parts[(int) (0)]))*60+(double)(Double.parseDouble(_parts[(int) (1)])));
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return 0;
}
public String  _reset() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Reset";
 //BA.debugLineNum = 25;BA.debugLine="lastScanMinuteKey = \"\"";
_lastscanminutekey = "";
 //BA.debugLineNum = 26;BA.debugLine="lastInjectedMinuteKey = \"\"";
_lastinjectedminutekey = "";
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public boolean  _scantargetminute(anywheresoftware.b4a.objects.collections.Map _offlinedata,anywheresoftware.b4a.objects.collections.List _playqueue,long _targetminutetimestamp,boolean _force,boolean _allowregularads) throws Exception{
String _minutekey = "";
anywheresoftware.b4a.objects.collections.Map _breakitem = null;
long _breakat = 0L;
 //BA.debugLineNum = 31;BA.debugLine="Public Sub ScanTargetMinute(offlineData As Map, pl";
 //BA.debugLineNum = 32;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 33;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if ((_offlinedata.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
 //BA.debugLineNum = 34;BA.debugLine="If playQueue.IsInitialized = False Then Return Fa";
if (_playqueue.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 35;BA.debugLine="Dim minuteKey As String = MinuteKeyFromTimestamp(";
_minutekey = _minutekeyfromtimestamp(_targetminutetimestamp);
 //BA.debugLineNum = 36;BA.debugLine="If force = False And minuteKey = lastScanMinuteKe";
if (_force==__c.False && (_minutekey).equals(_lastscanminutekey)) { 
if (true) return __c.False;};
 //BA.debugLineNum = 37;BA.debugLine="lastScanMinuteKey = minuteKey";
_lastscanminutekey = _minutekey;
 //BA.debugLineNum = 38;BA.debugLine="Dim breakItem As Map = BuildBreakForMinute(offlin";
_breakitem = new anywheresoftware.b4a.objects.collections.Map();
_breakitem = _buildbreakforminute(_offlinedata,_targetminutetimestamp,_allowregularads);
 //BA.debugLineNum = 39;BA.debugLine="If breakItem.IsInitialized = False Or breakItem.S";
if (_breakitem.IsInitialized()==__c.False || _breakitem.getSize()==0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 40;BA.debugLine="Dim breakAt As Long = ToLongDefault(breakItem.Get";
_breakat = _tolongdefault(_breakitem.GetDefault((Object)("at"),(Object)(-1)),(long) (-1));
 //BA.debugLineNum = 41;BA.debugLine="If breakAt <= 0 Then Return False";
if (_breakat<=0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 42;BA.debugLine="If HasBreakScheduledAt(playQueue, breakAt) Then";
if (_hasbreakscheduledat(_playqueue,_breakat)) { 
 //BA.debugLineNum = 43;BA.debugLine="lastInjectedMinuteKey = minuteKey";
_lastinjectedminutekey = _minutekey;
 //BA.debugLineNum = 44;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 46;BA.debugLine="If lastInjectedMinuteKey = minuteKey Then Return";
if ((_lastinjectedminutekey).equals(_minutekey)) { 
if (true) return __c.False;};
 //BA.debugLineNum = 47;BA.debugLine="playQueue.InsertAt(0, breakItem)";
_playqueue.InsertAt((int) (0),(Object)(_breakitem.getObject()));
 //BA.debugLineNum = 48;BA.debugLine="lastInjectedMinuteKey = minuteKey";
_lastinjectedminutekey = _minutekey;
 //BA.debugLineNum = 49;BA.debugLine="Trace(\"Локальный break добавлен в начало очереди.";
_trace("Локальный break добавлен в начало очереди. minute="+_minutekey+", exact="+BA.ObjectToString(_breakitem.GetDefault((Object)("exactly"),(Object)(__c.False)))+", items="+BA.ObjectToString(_breakitem.GetDefault((Object)("items_count"),(Object)(0)))+", queueSize="+BA.NumberToString(_playqueue.getSize()));
 //BA.debugLineNum = 50;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return false;
}
public int  _timestringtominutes(String _value) throws Exception{
String[] _parts = null;
int _hours = 0;
int _minutes = 0;
 //BA.debugLineNum = 204;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
 //BA.debugLineNum = 205;BA.debugLine="If value = \"\" Then Return -1";
if ((_value).equals("")) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 206;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
_parts = __c.Regex.Split(":",_value);
 //BA.debugLineNum = 207;BA.debugLine="If parts.Length < 2 Then Return -1";
if (_parts.length<2) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 208;BA.debugLine="Try";
try { //BA.debugLineNum = 209;BA.debugLine="Dim hours As Int = parts(0)";
_hours = (int)(Double.parseDouble(_parts[(int) (0)]));
 //BA.debugLineNum = 210;BA.debugLine="Dim minutes As Int = parts(1)";
_minutes = (int)(Double.parseDouble(_parts[(int) (1)]));
 //BA.debugLineNum = 211;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
if (_hours<0 || _hours>23) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 212;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
if (_minutes<0 || _minutes>59) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 213;BA.debugLine="Return hours * 60 + minutes";
if (true) return (int) (_hours*60+_minutes);
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 215;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return 0;
}
public int  _timezoneoffsetminutes() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _nowoffset = null;
anywheresoftware.b4j.object.JavaObject _zoneoffset = null;
int _totalseconds = 0;
 //BA.debugLineNum = 195;BA.debugLine="Private Sub TimezoneOffsetMinutes As Int";
 //BA.debugLineNum = 196;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 197;BA.debugLine="jo.InitializeStatic(\"java.time.OffsetDateTime\")";
_jo.InitializeStatic("java.time.OffsetDateTime");
 //BA.debugLineNum = 198;BA.debugLine="Dim nowOffset As JavaObject = jo.RunMethod(\"now\",";
_nowoffset = new anywheresoftware.b4j.object.JavaObject();
_nowoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("now",(Object[])(__c.Null))));
 //BA.debugLineNum = 199;BA.debugLine="Dim zoneOffset As JavaObject = nowOffset.RunMetho";
_zoneoffset = new anywheresoftware.b4j.object.JavaObject();
_zoneoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nowoffset.RunMethod("getOffset",(Object[])(__c.Null))));
 //BA.debugLineNum = 200;BA.debugLine="Dim totalSeconds As Int = zoneOffset.RunMethod(\"g";
_totalseconds = (int)(BA.ObjectToNumber(_zoneoffset.RunMethod("getTotalSeconds",(Object[])(__c.Null))));
 //BA.debugLineNum = 201;BA.debugLine="Return -Round(totalSeconds / 60)";
if (true) return (int) (-__c.Round(_totalseconds/(double)60));
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return 0;
}
public long  _tolongdefault(Object _value,long _defaultvalue) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
 //BA.debugLineNum = 220;BA.debugLine="Try";
try { //BA.debugLineNum = 221;BA.debugLine="If value = Null Then Return defaultValue";
if (_value== null) { 
if (true) return _defaultvalue;};
 //BA.debugLineNum = 222;BA.debugLine="Return value";
if (true) return BA.ObjectToLongNumber(_value);
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 224;BA.debugLine="Try";
try { //BA.debugLineNum = 225;BA.debugLine="Return Floor((\"\" & value).Trim)";
if (true) return (long) (__c.Floor((double)(Double.parseDouble((""+BA.ObjectToString(_value)).trim()))));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 227;BA.debugLine="Return defaultValue";
if (true) return _defaultvalue;
 };
 };
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return 0L;
}
public String  _trace(String _message) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Private Sub Trace(message As String)";
 //BA.debugLineNum = 139;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,_targetmodule,_tracesubname)) { 
 //BA.debugLineNum = 140;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,_targetmodule,_tracesubname,(Object)(_message));
 };
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
