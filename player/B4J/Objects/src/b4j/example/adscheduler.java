package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class adscheduler extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.adscheduler", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.adscheduler.class).invoke(this, new Object[] {null});
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
public Object _targetmodule = null;
public String _tracesubname = "";
public String _adlabeltext = "";
public String _lastscanminutekey = "";
public String _lastinjectedminutekey = "";
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.platformbridge _platformbridge = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public boolean  _admatchescurrentminute(b4j.example.adscheduler __ref,anywheresoftware.b4a.objects.collections.Map _ad,String _todaykey,String _todayweekday,int _currentminuteofday,boolean _allowregularads) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "admatchescurrentminute", false))
	 {return ((Boolean) Debug.delegate(ba, "admatchescurrentminute", new Object[] {_ad,_todaykey,_todayweekday,_currentminuteofday,_allowregularads}));}
boolean _isexact = false;
String _startdate = "";
String _enddate = "";
anywheresoftware.b4a.objects.collections.List _weekdays = null;
boolean _weekdaymatched = false;
Object _weekdayobject = null;
int _baseminute = 0;
int _intervalminutes = 0;
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Private Sub AdMatchesCurrentMinute(ad As Map, toda";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="If ad.IsInitialized = False Then Return False";
if (_ad.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="Dim isExact As Boolean = ad.GetDefault(\"exactly\",";
_isexact = (_ad.GetDefault((Object)("exactly"),(Object)(__c.False))).equals((Object)(__c.True));
RDebugUtils.currentLine=28639235;
 //BA.debugLineNum = 28639235;BA.debugLine="If isExact = False And allowRegularAds = False Th";
if (_isexact==__c.False && _allowregularads==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28639236;
 //BA.debugLineNum = 28639236;BA.debugLine="Dim startDate As String = ad.GetDefault(\"start\",";
_startdate = BA.ObjectToString(_ad.GetDefault((Object)("start"),(Object)("")));
RDebugUtils.currentLine=28639237;
 //BA.debugLineNum = 28639237;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(todayK";
if ((_startdate).equals("") == false && _startdate.compareTo(_todaykey)>0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28639238;
 //BA.debugLineNum = 28639238;BA.debugLine="Dim endDate As String = ad.GetDefault(\"end\", \"\")";
_enddate = BA.ObjectToString(_ad.GetDefault((Object)("end"),(Object)("")));
RDebugUtils.currentLine=28639239;
 //BA.debugLineNum = 28639239;BA.debugLine="If endDate <> \"\" And endDate.CompareTo(todayKey)";
if ((_enddate).equals("") == false && _enddate.compareTo(_todaykey)<0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28639240;
 //BA.debugLineNum = 28639240;BA.debugLine="Dim weekdays As List = ad.GetDefault(\"weekdays\",";
_weekdays = new anywheresoftware.b4a.objects.collections.List();
_weekdays = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ad.GetDefault((Object)("weekdays"),__c.Null)));
RDebugUtils.currentLine=28639241;
 //BA.debugLineNum = 28639241;BA.debugLine="If weekdays.IsInitialized And weekdays.Size > 0 T";
if (_weekdays.IsInitialized() && _weekdays.getSize()>0) { 
RDebugUtils.currentLine=28639242;
 //BA.debugLineNum = 28639242;BA.debugLine="Dim weekdayMatched As Boolean = False";
_weekdaymatched = __c.False;
RDebugUtils.currentLine=28639243;
 //BA.debugLineNum = 28639243;BA.debugLine="For Each weekdayObject As Object In weekdays";
{
final anywheresoftware.b4a.BA.IterableList group11 = _weekdays;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_weekdayobject = group11.Get(index11);
RDebugUtils.currentLine=28639244;
 //BA.debugLineNum = 28639244;BA.debugLine="If (\"\" & weekdayObject).Trim = todayWeekday The";
if (((""+BA.ObjectToString(_weekdayobject)).trim()).equals(_todayweekday)) { 
RDebugUtils.currentLine=28639245;
 //BA.debugLineNum = 28639245;BA.debugLine="weekdayMatched = True";
_weekdaymatched = __c.True;
RDebugUtils.currentLine=28639246;
 //BA.debugLineNum = 28639246;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=28639249;
 //BA.debugLineNum = 28639249;BA.debugLine="If weekdayMatched = False Then Return False";
if (_weekdaymatched==__c.False) { 
if (true) return __c.False;};
 };
RDebugUtils.currentLine=28639251;
 //BA.debugLineNum = 28639251;BA.debugLine="Dim baseMinute As Int = TimeStringToMinutes(ad.Ge";
_baseminute = __ref._timestringtominutes /*int*/ (null,BA.ObjectToString(_ad.GetDefault((Object)("time"),(Object)(""))));
RDebugUtils.currentLine=28639252;
 //BA.debugLineNum = 28639252;BA.debugLine="If baseMinute < 0 Then Return False";
if (_baseminute<0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28639253;
 //BA.debugLineNum = 28639253;BA.debugLine="If currentMinuteOfDay < baseMinute Then Return Fa";
if (_currentminuteofday<_baseminute) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28639254;
 //BA.debugLineNum = 28639254;BA.debugLine="Dim intervalMinutes As Int = ToLongDefault(ad.Get";
_intervalminutes = (int) (__ref._tolongdefault /*long*/ (null,_ad.GetDefault((Object)("interval"),(Object)(0)),(long) (0)));
RDebugUtils.currentLine=28639255;
 //BA.debugLineNum = 28639255;BA.debugLine="If intervalMinutes <= 0 Then Return currentMinute";
if (_intervalminutes<=0) { 
if (true) return _currentminuteofday==_baseminute;};
RDebugUtils.currentLine=28639256;
 //BA.debugLineNum = 28639256;BA.debugLine="Return ((currentMinuteOfDay - baseMinute) Mod int";
if (true) return ((_currentminuteofday-_baseminute)%_intervalminutes)==0;
RDebugUtils.currentLine=28639257;
 //BA.debugLineNum = 28639257;BA.debugLine="End Sub";
return false;
}
public int  _timestringtominutes(b4j.example.adscheduler __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "timestringtominutes", false))
	 {return ((Integer) Debug.delegate(ba, "timestringtominutes", new Object[] {_value}));}
String[] _parts = null;
int _hours = 0;
int _minutes = 0;
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="If value = \"\" Then Return -1";
if ((_value).equals("")) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
_parts = __c.Regex.Split(":",_value);
RDebugUtils.currentLine=29294595;
 //BA.debugLineNum = 29294595;BA.debugLine="If parts.Length < 2 Then Return -1";
if (_parts.length<2) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=29294596;
 //BA.debugLineNum = 29294596;BA.debugLine="Try";
try {RDebugUtils.currentLine=29294597;
 //BA.debugLineNum = 29294597;BA.debugLine="Dim hours As Int = parts(0)";
_hours = (int)(Double.parseDouble(_parts[(int) (0)]));
RDebugUtils.currentLine=29294598;
 //BA.debugLineNum = 29294598;BA.debugLine="Dim minutes As Int = parts(1)";
_minutes = (int)(Double.parseDouble(_parts[(int) (1)]));
RDebugUtils.currentLine=29294599;
 //BA.debugLineNum = 29294599;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
if (_hours<0 || _hours>23) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=29294600;
 //BA.debugLineNum = 29294600;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
if (_minutes<0 || _minutes>59) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=29294601;
 //BA.debugLineNum = 29294601;BA.debugLine="Return hours * 60 + minutes";
if (true) return (int) (_hours*60+_minutes);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=29294603;
 //BA.debugLineNum = 29294603;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
RDebugUtils.currentLine=29294605;
 //BA.debugLineNum = 29294605;BA.debugLine="End Sub";
return 0;
}
public long  _tolongdefault(b4j.example.adscheduler __ref,Object _value,long _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "tolongdefault", false))
	 {return ((Long) Debug.delegate(ba, "tolongdefault", new Object[] {_value,_defaultvalue}));}
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
RDebugUtils.currentLine=29360129;
 //BA.debugLineNum = 29360129;BA.debugLine="Try";
try {RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="If value = Null Then Return defaultValue";
if (_value== null) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=29360131;
 //BA.debugLineNum = 29360131;BA.debugLine="Return value";
if (true) return BA.ObjectToLongNumber(_value);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=29360133;
 //BA.debugLineNum = 29360133;BA.debugLine="Try";
try {RDebugUtils.currentLine=29360134;
 //BA.debugLineNum = 29360134;BA.debugLine="Return Floor((\"\" & value).Trim)";
if (true) return (long) (__c.Floor((double)(Double.parseDouble((""+BA.ObjectToString(_value)).trim()))));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=29360136;
 //BA.debugLineNum = 29360136;BA.debugLine="Return defaultValue";
if (true) return _defaultvalue;
 };
 };
RDebugUtils.currentLine=29360139;
 //BA.debugLineNum = 29360139;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.collections.Map  _buildbreakforminute(b4j.example.adscheduler __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _targetminutetimestamp,boolean _allowregularads) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "buildbreakforminute", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "buildbreakforminute", new Object[] {_offlinedata,_targetminutetimestamp,_allowregularads}));}
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
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Private Sub BuildBreakForMinute(offlineData As Map";
RDebugUtils.currentLine=28573697;
 //BA.debugLineNum = 28573697;BA.debugLine="Dim emptyBreak As Map";
_emptybreak = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="emptyBreak.Initialize";
_emptybreak.Initialize();
RDebugUtils.currentLine=28573699;
 //BA.debugLineNum = 28573699;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("ads"),__c.Null)));
RDebugUtils.currentLine=28573700;
 //BA.debugLineNum = 28573700;BA.debugLine="If ads.IsInitialized = False Or ads.Size = 0 Then";
if (_ads.IsInitialized()==__c.False || _ads.getSize()==0) { 
if (true) return _emptybreak;};
RDebugUtils.currentLine=28573701;
 //BA.debugLineNum = 28573701;BA.debugLine="Dim targetTicks As Long = LocalTimestampToTicks(t";
_targetticks = __ref._localtimestamptoticks /*long*/ (null,_targetminutetimestamp);
RDebugUtils.currentLine=28573702;
 //BA.debugLineNum = 28573702;BA.debugLine="Dim todayKey As String = FormatIsoDate(targetTick";
_todaykey = __ref._formatisodate /*String*/ (null,_targetticks);
RDebugUtils.currentLine=28573703;
 //BA.debugLineNum = 28573703;BA.debugLine="Dim todayWeekday As String = IsoWeekdayFromTimest";
_todayweekday = __ref._isoweekdayfromtimestamp /*String*/ (null,_targetticks);
RDebugUtils.currentLine=28573704;
 //BA.debugLineNum = 28573704;BA.debugLine="Dim currentMinuteOfDay As Int = MinutesOfDayFromT";
_currentminuteofday = __ref._minutesofdayfromtimestamp /*int*/ (null,_targetticks);
RDebugUtils.currentLine=28573705;
 //BA.debugLineNum = 28573705;BA.debugLine="Dim dueItems As List";
_dueitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28573706;
 //BA.debugLineNum = 28573706;BA.debugLine="dueItems.Initialize";
_dueitems.Initialize();
RDebugUtils.currentLine=28573707;
 //BA.debugLineNum = 28573707;BA.debugLine="Dim hasExactAds As Boolean = False";
_hasexactads = __c.False;
RDebugUtils.currentLine=28573708;
 //BA.debugLineNum = 28573708;BA.debugLine="For Each adObject As Object In ads";
{
final anywheresoftware.b4a.BA.IterableList group12 = _ads;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_adobject = group12.Get(index12);
RDebugUtils.currentLine=28573709;
 //BA.debugLineNum = 28573709;BA.debugLine="If adObject Is Map Then";
if (_adobject instanceof java.util.Map) { 
RDebugUtils.currentLine=28573710;
 //BA.debugLineNum = 28573710;BA.debugLine="Dim ad As Map = adObject";
_ad = new anywheresoftware.b4a.objects.collections.Map();
_ad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adobject));
RDebugUtils.currentLine=28573711;
 //BA.debugLineNum = 28573711;BA.debugLine="If AdMatchesCurrentMinute(ad, todayKey, todayWe";
if (__ref._admatchescurrentminute /*boolean*/ (null,_ad,_todaykey,_todayweekday,_currentminuteofday,_allowregularads)) { 
RDebugUtils.currentLine=28573712;
 //BA.debugLineNum = 28573712;BA.debugLine="If ad.GetDefault(\"exactly\", False) = True Then";
if ((_ad.GetDefault((Object)("exactly"),(Object)(__c.False))).equals((Object)(__c.True))) { 
_hasexactads = __c.True;};
RDebugUtils.currentLine=28573713;
 //BA.debugLineNum = 28573713;BA.debugLine="dueItems.Add(CreateAdQueueItem(ad))";
_dueitems.Add((Object)(__ref._createadqueueitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,_ad).getObject()));
 };
 };
 }
};
RDebugUtils.currentLine=28573717;
 //BA.debugLineNum = 28573717;BA.debugLine="If dueItems.Size = 0 Then Return emptyBreak";
if (_dueitems.getSize()==0) { 
if (true) return _emptybreak;};
RDebugUtils.currentLine=28573718;
 //BA.debugLineNum = 28573718;BA.debugLine="Dim breakItem As Map";
_breakitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28573719;
 //BA.debugLineNum = 28573719;BA.debugLine="breakItem.Initialize";
_breakitem.Initialize();
RDebugUtils.currentLine=28573720;
 //BA.debugLineNum = 28573720;BA.debugLine="breakItem.Put(\"type\", \"break\")";
_breakitem.Put((Object)("type"),(Object)("break"));
RDebugUtils.currentLine=28573721;
 //BA.debugLineNum = 28573721;BA.debugLine="breakItem.Put(\"exactly\", hasExactAds)";
_breakitem.Put((Object)("exactly"),(Object)(_hasexactads));
RDebugUtils.currentLine=28573722;
 //BA.debugLineNum = 28573722;BA.debugLine="breakItem.Put(\"at\", targetMinuteTimestamp)";
_breakitem.Put((Object)("at"),(Object)(_targetminutetimestamp));
RDebugUtils.currentLine=28573723;
 //BA.debugLineNum = 28573723;BA.debugLine="breakItem.Put(\"items\", dueItems)";
_breakitem.Put((Object)("items"),(Object)(_dueitems.getObject()));
RDebugUtils.currentLine=28573724;
 //BA.debugLineNum = 28573724;BA.debugLine="breakItem.Put(\"items_count\", dueItems.Size)";
_breakitem.Put((Object)("items_count"),(Object)(_dueitems.getSize()));
RDebugUtils.currentLine=28573725;
 //BA.debugLineNum = 28573725;BA.debugLine="Return breakItem";
if (true) return _breakitem;
RDebugUtils.currentLine=28573726;
 //BA.debugLineNum = 28573726;BA.debugLine="End Sub";
return null;
}
public long  _localtimestamptoticks(b4j.example.adscheduler __ref,long _targettimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "localtimestamptoticks", false))
	 {return ((Long) Debug.delegate(ba, "localtimestamptoticks", new Object[] {_targettimestamp}));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Private Sub LocalTimestampToTicks(targetTimestamp";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="Return (targetTimestamp + (TimezoneOffsetMinutes";
if (true) return (long) ((_targettimestamp+(__ref._timezoneoffsetminutes /*int*/ (null)*60))*1000);
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="End Sub";
return 0L;
}
public String  _formatisodate(b4j.example.adscheduler __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "formatisodate", false))
	 {return ((String) Debug.delegate(ba, "formatisodate", new Object[] {_ticks}));}
String _previousdateformat = "";
String _value = "";
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=28901379;
 //BA.debugLineNum = 28901379;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=28901380;
 //BA.debugLineNum = 28901380;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=28901381;
 //BA.debugLineNum = 28901381;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=28901382;
 //BA.debugLineNum = 28901382;BA.debugLine="End Sub";
return "";
}
public String  _isoweekdayfromtimestamp(b4j.example.adscheduler __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "isoweekdayfromtimestamp", false))
	 {return ((String) Debug.delegate(ba, "isoweekdayfromtimestamp", new Object[] {_ticks}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _instantclass = null;
anywheresoftware.b4j.object.JavaObject _zoneclass = null;
anywheresoftware.b4j.object.JavaObject _instant = null;
anywheresoftware.b4j.object.JavaObject _zoneid = null;
anywheresoftware.b4j.object.JavaObject _zoneddatetimeclass = null;
anywheresoftware.b4j.object.JavaObject _zoneddatetime = null;
anywheresoftware.b4j.object.JavaObject _localdate = null;
anywheresoftware.b4j.object.JavaObject _dayofweek = null;
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Private Sub IsoWeekdayFromTimestamp(ticks As Long)";
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="jo.InitializeStatic(\"java.time.LocalDate\")";
_jo.InitializeStatic("java.time.LocalDate");
RDebugUtils.currentLine=29032451;
 //BA.debugLineNum = 29032451;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=29032452;
 //BA.debugLineNum = 29032452;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant\"";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=29032453;
 //BA.debugLineNum = 29032453;BA.debugLine="Dim zoneClass As JavaObject";
_zoneclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=29032454;
 //BA.debugLineNum = 29032454;BA.debugLine="zoneClass.InitializeStatic(\"java.time.ZoneId\")";
_zoneclass.InitializeStatic("java.time.ZoneId");
RDebugUtils.currentLine=29032455;
 //BA.debugLineNum = 29032455;BA.debugLine="Dim instant As JavaObject = instantClass.RunMetho";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("ofEpochMilli",new Object[]{(Object)(_ticks)})));
RDebugUtils.currentLine=29032456;
 //BA.debugLineNum = 29032456;BA.debugLine="Dim zoneId As JavaObject = zoneClass.RunMethod(\"s";
_zoneid = new anywheresoftware.b4j.object.JavaObject();
_zoneid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneclass.RunMethod("systemDefault",(Object[])(__c.Null))));
RDebugUtils.currentLine=29032457;
 //BA.debugLineNum = 29032457;BA.debugLine="Dim zonedDateTimeClass As JavaObject";
_zoneddatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=29032458;
 //BA.debugLineNum = 29032458;BA.debugLine="zonedDateTimeClass.InitializeStatic(\"java.time.Zo";
_zoneddatetimeclass.InitializeStatic("java.time.ZonedDateTime");
RDebugUtils.currentLine=29032459;
 //BA.debugLineNum = 29032459;BA.debugLine="Dim zonedDateTime As JavaObject = zonedDateTimeCl";
_zoneddatetime = new anywheresoftware.b4j.object.JavaObject();
_zoneddatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetimeclass.RunMethod("ofInstant",new Object[]{(Object)(_instant.getObject()),(Object)(_zoneid.getObject())})));
RDebugUtils.currentLine=29032460;
 //BA.debugLineNum = 29032460;BA.debugLine="Dim localDate As JavaObject = zonedDateTime.RunMe";
_localdate = new anywheresoftware.b4j.object.JavaObject();
_localdate = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetime.RunMethod("toLocalDate",(Object[])(__c.Null))));
RDebugUtils.currentLine=29032461;
 //BA.debugLineNum = 29032461;BA.debugLine="Dim dayOfWeek As JavaObject = localDate.RunMethod";
_dayofweek = new anywheresoftware.b4j.object.JavaObject();
_dayofweek = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_localdate.RunMethod("getDayOfWeek",(Object[])(__c.Null))));
RDebugUtils.currentLine=29032462;
 //BA.debugLineNum = 29032462;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
if (true) return ""+BA.ObjectToString(_dayofweek.RunMethod("getValue",(Object[])(__c.Null)));
RDebugUtils.currentLine=29032463;
 //BA.debugLineNum = 29032463;BA.debugLine="End Sub";
return "";
}
public int  _minutesofdayfromtimestamp(b4j.example.adscheduler __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "minutesofdayfromtimestamp", false))
	 {return ((Integer) Debug.delegate(ba, "minutesofdayfromtimestamp", new Object[] {_ticks}));}
String _previoustimeformat = "";
String _timevalue = "";
String[] _parts = null;
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Private Sub MinutesOfDayFromTimestamp(ticks As Lon";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="Dim timeValue As String = DateTime.Time(ticks)";
_timevalue = __c.DateTime.Time(_ticks);
RDebugUtils.currentLine=28966916;
 //BA.debugLineNum = 28966916;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=28966917;
 //BA.debugLineNum = 28966917;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
RDebugUtils.currentLine=28966918;
 //BA.debugLineNum = 28966918;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28966919;
 //BA.debugLineNum = 28966919;BA.debugLine="Return parts(0) * 60 + parts(1)";
if (true) return (int) ((double)(Double.parseDouble(_parts[(int) (0)]))*60+(double)(Double.parseDouble(_parts[(int) (1)])));
RDebugUtils.currentLine=28966920;
 //BA.debugLineNum = 28966920;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _createadqueueitem(b4j.example.adscheduler __ref,anywheresoftware.b4a.objects.collections.Map _ad) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "createadqueueitem", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createadqueueitem", new Object[] {_ad}));}
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Private Sub CreateAdQueueItem(ad As Map) As Map";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=28704771;
 //BA.debugLineNum = 28704771;BA.debugLine="item.Put(\"type\", \"ad\")";
_item.Put((Object)("type"),(Object)("ad"));
RDebugUtils.currentLine=28704772;
 //BA.debugLineNum = 28704772;BA.debugLine="item.Put(\"id\", ad.GetDefault(\"id\", \"\"))";
_item.Put((Object)("id"),_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=28704773;
 //BA.debugLineNum = 28704773;BA.debugLine="item.Put(\"title\", ad.GetDefault(\"title\", adLabelT";
_item.Put((Object)("title"),_ad.GetDefault((Object)("title"),(Object)(__ref._adlabeltext /*String*/ )));
RDebugUtils.currentLine=28704774;
 //BA.debugLineNum = 28704774;BA.debugLine="item.Put(\"duration\", ToLongDefault(ad.GetDefault(";
_item.Put((Object)("duration"),(Object)(__ref._tolongdefault /*long*/ (null,_ad.GetDefault((Object)("duration"),(Object)(0)),(long) (0))));
RDebugUtils.currentLine=28704775;
 //BA.debugLineNum = 28704775;BA.debugLine="item.Put(\"gain\", ad.GetDefault(\"gain\", -3))";
_item.Put((Object)("gain"),_ad.GetDefault((Object)("gain"),(Object)(-3)));
RDebugUtils.currentLine=28704776;
 //BA.debugLineNum = 28704776;BA.debugLine="item.Put(\"exactly\", ad.GetDefault(\"exactly\", Fals";
_item.Put((Object)("exactly"),_ad.GetDefault((Object)("exactly"),(Object)(__c.False)));
RDebugUtils.currentLine=28704777;
 //BA.debugLineNum = 28704777;BA.debugLine="Return item";
if (true) return _item;
RDebugUtils.currentLine=28704778;
 //BA.debugLineNum = 28704778;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.adscheduler __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=28311554;
 //BA.debugLineNum = 28311554;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=28311555;
 //BA.debugLineNum = 28311555;BA.debugLine="Private adLabelText As String";
_adlabeltext = "";
RDebugUtils.currentLine=28311556;
 //BA.debugLineNum = 28311556;BA.debugLine="Private lastScanMinuteKey As String = \"\"";
_lastscanminutekey = "";
RDebugUtils.currentLine=28311557;
 //BA.debugLineNum = 28311557;BA.debugLine="Private lastInjectedMinuteKey As String = \"\"";
_lastinjectedminutekey = "";
RDebugUtils.currentLine=28311558;
 //BA.debugLineNum = 28311558;BA.debugLine="End Sub";
return "";
}
public boolean  _hasbreakscheduledat(b4j.example.adscheduler __ref,anywheresoftware.b4a.objects.collections.List _playqueue,long _breakat) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "hasbreakscheduledat", false))
	 {return ((Boolean) Debug.delegate(ba, "hasbreakscheduledat", new Object[] {_playqueue,_breakat}));}
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Private Sub HasBreakScheduledAt(playQueue As List,";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="If breakAt <= 0 Then Return False";
if (_breakat<=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group2 = _playqueue;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_itemobject = group2.Get(index2);
RDebugUtils.currentLine=28770307;
 //BA.debugLineNum = 28770307;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=28770308;
 //BA.debugLineNum = 28770308;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=28770309;
 //BA.debugLineNum = 28770309;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"break\" And To";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break")) && __ref._tolongdefault /*long*/ (null,_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1))==_breakat) { 
if (true) return __c.True;};
 };
 }
};
RDebugUtils.currentLine=28770312;
 //BA.debugLineNum = 28770312;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=28770313;
 //BA.debugLineNum = 28770313;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.adscheduler __ref,anywheresoftware.b4a.BA _ba,Object _targetmodulevalue,String _tracesubnamevalue,String _adlabeltextvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_targetmodulevalue,_tracesubnamevalue,_adlabeltextvalue}));}
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Public Sub Initialize(targetModuleValue As Object,";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=28377091;
 //BA.debugLineNum = 28377091;BA.debugLine="adLabelText = adLabelTextValue";
__ref._adlabeltext /*String*/  = _adlabeltextvalue;
RDebugUtils.currentLine=28377092;
 //BA.debugLineNum = 28377092;BA.debugLine="End Sub";
return "";
}
public int  _timezoneoffsetminutes(b4j.example.adscheduler __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "timezoneoffsetminutes", false))
	 {return ((Integer) Debug.delegate(ba, "timezoneoffsetminutes", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _nowoffset = null;
anywheresoftware.b4j.object.JavaObject _zoneoffset = null;
int _totalseconds = 0;
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Private Sub TimezoneOffsetMinutes As Int";
RDebugUtils.currentLine=29229057;
 //BA.debugLineNum = 29229057;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="jo.InitializeStatic(\"java.time.OffsetDateTime\")";
_jo.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=29229059;
 //BA.debugLineNum = 29229059;BA.debugLine="Dim nowOffset As JavaObject = jo.RunMethod(\"now\",";
_nowoffset = new anywheresoftware.b4j.object.JavaObject();
_nowoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("now",(Object[])(__c.Null))));
RDebugUtils.currentLine=29229060;
 //BA.debugLineNum = 29229060;BA.debugLine="Dim zoneOffset As JavaObject = nowOffset.RunMetho";
_zoneoffset = new anywheresoftware.b4j.object.JavaObject();
_zoneoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nowoffset.RunMethod("getOffset",(Object[])(__c.Null))));
RDebugUtils.currentLine=29229061;
 //BA.debugLineNum = 29229061;BA.debugLine="Dim totalSeconds As Int = zoneOffset.RunMethod(\"g";
_totalseconds = (int)(BA.ObjectToNumber(_zoneoffset.RunMethod("getTotalSeconds",(Object[])(__c.Null))));
RDebugUtils.currentLine=29229062;
 //BA.debugLineNum = 29229062;BA.debugLine="Return -Round(totalSeconds / 60)";
if (true) return (int) (-__c.Round(_totalseconds/(double)60));
RDebugUtils.currentLine=29229063;
 //BA.debugLineNum = 29229063;BA.debugLine="End Sub";
return 0;
}
public String  _minutekeyfromtimestamp(b4j.example.adscheduler __ref,long _targetminutetimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "minutekeyfromtimestamp", false))
	 {return ((String) Debug.delegate(ba, "minutekeyfromtimestamp", new Object[] {_targetminutetimestamp}));}
String _previousdateformat = "";
String _previoustimeformat = "";
long _ticks = 0L;
String _value = "";
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Private Sub MinuteKeyFromTimestamp(targetMinuteTim";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=29097987;
 //BA.debugLineNum = 29097987;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=29097988;
 //BA.debugLineNum = 29097988;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
__c.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=29097989;
 //BA.debugLineNum = 29097989;BA.debugLine="Dim ticks As Long = LocalTimestampToTicks(targetM";
_ticks = __ref._localtimestamptoticks /*long*/ (null,_targetminutetimestamp);
RDebugUtils.currentLine=29097990;
 //BA.debugLineNum = 29097990;BA.debugLine="Dim value As String = DateTime.Date(ticks) & \" \"";
_value = __c.DateTime.Date(_ticks)+" "+__c.DateTime.Time(_ticks);
RDebugUtils.currentLine=29097991;
 //BA.debugLineNum = 29097991;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=29097992;
 //BA.debugLineNum = 29097992;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=29097993;
 //BA.debugLineNum = 29097993;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=29097994;
 //BA.debugLineNum = 29097994;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.adscheduler __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=28442624;
 //BA.debugLineNum = 28442624;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=28442625;
 //BA.debugLineNum = 28442625;BA.debugLine="lastScanMinuteKey = \"\"";
__ref._lastscanminutekey /*String*/  = "";
RDebugUtils.currentLine=28442626;
 //BA.debugLineNum = 28442626;BA.debugLine="lastInjectedMinuteKey = \"\"";
__ref._lastinjectedminutekey /*String*/  = "";
RDebugUtils.currentLine=28442627;
 //BA.debugLineNum = 28442627;BA.debugLine="End Sub";
return "";
}
public boolean  _scantargetminute(b4j.example.adscheduler __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata,anywheresoftware.b4a.objects.collections.List _playqueue,long _targetminutetimestamp,boolean _force,boolean _allowregularads) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "scantargetminute", false))
	 {return ((Boolean) Debug.delegate(ba, "scantargetminute", new Object[] {_offlinedata,_playqueue,_targetminutetimestamp,_force,_allowregularads}));}
String _minutekey = "";
anywheresoftware.b4a.objects.collections.Map _breakitem = null;
long _breakat = 0L;
RDebugUtils.currentLine=28508160;
 //BA.debugLineNum = 28508160;BA.debugLine="Public Sub ScanTargetMinute(offlineData As Map, pl";
RDebugUtils.currentLine=28508161;
 //BA.debugLineNum = 28508161;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if ((_offlinedata.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28508163;
 //BA.debugLineNum = 28508163;BA.debugLine="If playQueue.IsInitialized = False Then Return Fa";
if (_playqueue.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28508164;
 //BA.debugLineNum = 28508164;BA.debugLine="Dim minuteKey As String = MinuteKeyFromTimestamp(";
_minutekey = __ref._minutekeyfromtimestamp /*String*/ (null,_targetminutetimestamp);
RDebugUtils.currentLine=28508165;
 //BA.debugLineNum = 28508165;BA.debugLine="If force = False And minuteKey = lastScanMinuteKe";
if (_force==__c.False && (_minutekey).equals(__ref._lastscanminutekey /*String*/ )) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28508166;
 //BA.debugLineNum = 28508166;BA.debugLine="lastScanMinuteKey = minuteKey";
__ref._lastscanminutekey /*String*/  = _minutekey;
RDebugUtils.currentLine=28508167;
 //BA.debugLineNum = 28508167;BA.debugLine="Dim breakItem As Map = BuildBreakForMinute(offlin";
_breakitem = new anywheresoftware.b4a.objects.collections.Map();
_breakitem = __ref._buildbreakforminute /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_targetminutetimestamp,_allowregularads);
RDebugUtils.currentLine=28508168;
 //BA.debugLineNum = 28508168;BA.debugLine="If breakItem.IsInitialized = False Or breakItem.S";
if (_breakitem.IsInitialized()==__c.False || _breakitem.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28508169;
 //BA.debugLineNum = 28508169;BA.debugLine="Dim breakAt As Long = ToLongDefault(breakItem.Get";
_breakat = __ref._tolongdefault /*long*/ (null,_breakitem.GetDefault((Object)("at"),(Object)(-1)),(long) (-1));
RDebugUtils.currentLine=28508170;
 //BA.debugLineNum = 28508170;BA.debugLine="If breakAt <= 0 Then Return False";
if (_breakat<=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28508171;
 //BA.debugLineNum = 28508171;BA.debugLine="If HasBreakScheduledAt(playQueue, breakAt) Then";
if (__ref._hasbreakscheduledat /*boolean*/ (null,_playqueue,_breakat)) { 
RDebugUtils.currentLine=28508172;
 //BA.debugLineNum = 28508172;BA.debugLine="lastInjectedMinuteKey = minuteKey";
__ref._lastinjectedminutekey /*String*/  = _minutekey;
RDebugUtils.currentLine=28508173;
 //BA.debugLineNum = 28508173;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=28508175;
 //BA.debugLineNum = 28508175;BA.debugLine="If lastInjectedMinuteKey = minuteKey Then Return";
if ((__ref._lastinjectedminutekey /*String*/ ).equals(_minutekey)) { 
if (true) return __c.False;};
RDebugUtils.currentLine=28508176;
 //BA.debugLineNum = 28508176;BA.debugLine="playQueue.InsertAt(0, breakItem)";
_playqueue.InsertAt((int) (0),(Object)(_breakitem.getObject()));
RDebugUtils.currentLine=28508177;
 //BA.debugLineNum = 28508177;BA.debugLine="lastInjectedMinuteKey = minuteKey";
__ref._lastinjectedminutekey /*String*/  = _minutekey;
RDebugUtils.currentLine=28508178;
 //BA.debugLineNum = 28508178;BA.debugLine="Trace(\"Локальный break добавлен в начало очереди.";
__ref._trace /*String*/ (null,"Локальный break добавлен в начало очереди. minute="+_minutekey+", exact="+BA.ObjectToString(_breakitem.GetDefault((Object)("exactly"),(Object)(__c.False)))+", items="+BA.ObjectToString(_breakitem.GetDefault((Object)("items_count"),(Object)(0)))+", queueSize="+BA.NumberToString(_playqueue.getSize()));
RDebugUtils.currentLine=28508179;
 //BA.debugLineNum = 28508179;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=28508180;
 //BA.debugLineNum = 28508180;BA.debugLine="End Sub";
return false;
}
public String  _trace(b4j.example.adscheduler __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=28835844;
 //BA.debugLineNum = 28835844;BA.debugLine="End Sub";
return "";
}
}