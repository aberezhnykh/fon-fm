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
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.adscheduler __ref,anywheresoftware.b4a.BA _ba,Object _targetmodulevalue,String _tracesubnamevalue,String _adlabeltextvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_targetmodulevalue,_tracesubnamevalue,_adlabeltextvalue}));}
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Public Sub Initialize(targetModuleValue As Object,";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="adLabelText = adLabelTextValue";
__ref._adlabeltext /*String*/  = _adlabeltextvalue;
RDebugUtils.currentLine=36175876;
 //BA.debugLineNum = 36175876;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Public Sub ScanTargetMinute(offlineData As Map, pl";
RDebugUtils.currentLine=36306945;
 //BA.debugLineNum = 36306945;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if ((_offlinedata.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36306947;
 //BA.debugLineNum = 36306947;BA.debugLine="If playQueue.IsInitialized = False Then Return Fa";
if (_playqueue.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36306948;
 //BA.debugLineNum = 36306948;BA.debugLine="Dim minuteKey As String = MinuteKeyFromTimestamp(";
_minutekey = __ref._minutekeyfromtimestamp /*String*/ (null,_targetminutetimestamp);
RDebugUtils.currentLine=36306949;
 //BA.debugLineNum = 36306949;BA.debugLine="If force = False And minuteKey = lastScanMinuteKe";
if (_force==__c.False && (_minutekey).equals(__ref._lastscanminutekey /*String*/ )) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36306950;
 //BA.debugLineNum = 36306950;BA.debugLine="lastScanMinuteKey = minuteKey";
__ref._lastscanminutekey /*String*/  = _minutekey;
RDebugUtils.currentLine=36306951;
 //BA.debugLineNum = 36306951;BA.debugLine="Dim breakItem As Map = BuildBreakForMinute(offlin";
_breakitem = new anywheresoftware.b4a.objects.collections.Map();
_breakitem = __ref._buildbreakforminute /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_targetminutetimestamp,_allowregularads);
RDebugUtils.currentLine=36306952;
 //BA.debugLineNum = 36306952;BA.debugLine="If breakItem.IsInitialized = False Or breakItem.S";
if (_breakitem.IsInitialized()==__c.False || _breakitem.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36306953;
 //BA.debugLineNum = 36306953;BA.debugLine="Dim breakAt As Long = ToLongDefault(breakItem.Get";
_breakat = __ref._tolongdefault /*long*/ (null,_breakitem.GetDefault((Object)("at"),(Object)(-1)),(long) (-1));
RDebugUtils.currentLine=36306954;
 //BA.debugLineNum = 36306954;BA.debugLine="If breakAt <= 0 Then Return False";
if (_breakat<=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36306955;
 //BA.debugLineNum = 36306955;BA.debugLine="If HasBreakScheduledAt(playQueue, breakAt) Then";
if (__ref._hasbreakscheduledat /*boolean*/ (null,_playqueue,_breakat)) { 
RDebugUtils.currentLine=36306956;
 //BA.debugLineNum = 36306956;BA.debugLine="lastInjectedMinuteKey = minuteKey";
__ref._lastinjectedminutekey /*String*/  = _minutekey;
RDebugUtils.currentLine=36306957;
 //BA.debugLineNum = 36306957;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=36306959;
 //BA.debugLineNum = 36306959;BA.debugLine="If lastInjectedMinuteKey = minuteKey Then Return";
if ((__ref._lastinjectedminutekey /*String*/ ).equals(_minutekey)) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36306960;
 //BA.debugLineNum = 36306960;BA.debugLine="playQueue.InsertAt(0, breakItem)";
_playqueue.InsertAt((int) (0),(Object)(_breakitem.getObject()));
RDebugUtils.currentLine=36306961;
 //BA.debugLineNum = 36306961;BA.debugLine="lastInjectedMinuteKey = minuteKey";
__ref._lastinjectedminutekey /*String*/  = _minutekey;
RDebugUtils.currentLine=36306962;
 //BA.debugLineNum = 36306962;BA.debugLine="Trace(\"Локальный break добавлен в начало очереди.";
__ref._trace /*String*/ (null,"Локальный break добавлен в начало очереди. minute="+_minutekey+", exact="+BA.ObjectToString(_breakitem.GetDefault((Object)("exactly"),(Object)(__c.False)))+", items="+BA.ObjectToString(_breakitem.GetDefault((Object)("items_count"),(Object)(0)))+", queueSize="+BA.NumberToString(_playqueue.getSize()));
RDebugUtils.currentLine=36306963;
 //BA.debugLineNum = 36306963;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=36306964;
 //BA.debugLineNum = 36306964;BA.debugLine="End Sub";
return false;
}
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
RDebugUtils.currentLine=36438016;
 //BA.debugLineNum = 36438016;BA.debugLine="Private Sub AdMatchesCurrentMinute(ad As Map, toda";
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="If ad.IsInitialized = False Then Return False";
if (_ad.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36438018;
 //BA.debugLineNum = 36438018;BA.debugLine="Dim isExact As Boolean = ad.GetDefault(\"exactly\",";
_isexact = (_ad.GetDefault((Object)("exactly"),(Object)(__c.False))).equals((Object)(__c.True));
RDebugUtils.currentLine=36438019;
 //BA.debugLineNum = 36438019;BA.debugLine="If isExact = False And allowRegularAds = False Th";
if (_isexact==__c.False && _allowregularads==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36438020;
 //BA.debugLineNum = 36438020;BA.debugLine="Dim startDate As String = ad.GetDefault(\"start\",";
_startdate = BA.ObjectToString(_ad.GetDefault((Object)("start"),(Object)("")));
RDebugUtils.currentLine=36438021;
 //BA.debugLineNum = 36438021;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(todayK";
if ((_startdate).equals("") == false && _startdate.compareTo(_todaykey)>0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36438022;
 //BA.debugLineNum = 36438022;BA.debugLine="Dim endDate As String = ad.GetDefault(\"end\", \"\")";
_enddate = BA.ObjectToString(_ad.GetDefault((Object)("end"),(Object)("")));
RDebugUtils.currentLine=36438023;
 //BA.debugLineNum = 36438023;BA.debugLine="If endDate <> \"\" And endDate.CompareTo(todayKey)";
if ((_enddate).equals("") == false && _enddate.compareTo(_todaykey)<0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36438024;
 //BA.debugLineNum = 36438024;BA.debugLine="Dim weekdays As List = ad.GetDefault(\"weekdays\",";
_weekdays = new anywheresoftware.b4a.objects.collections.List();
_weekdays = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ad.GetDefault((Object)("weekdays"),__c.Null)));
RDebugUtils.currentLine=36438025;
 //BA.debugLineNum = 36438025;BA.debugLine="If weekdays.IsInitialized And weekdays.Size > 0 T";
if (_weekdays.IsInitialized() && _weekdays.getSize()>0) { 
RDebugUtils.currentLine=36438026;
 //BA.debugLineNum = 36438026;BA.debugLine="Dim weekdayMatched As Boolean = False";
_weekdaymatched = __c.False;
RDebugUtils.currentLine=36438027;
 //BA.debugLineNum = 36438027;BA.debugLine="For Each weekdayObject As Object In weekdays";
{
final anywheresoftware.b4a.BA.IterableList group11 = _weekdays;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_weekdayobject = group11.Get(index11);
RDebugUtils.currentLine=36438028;
 //BA.debugLineNum = 36438028;BA.debugLine="If (\"\" & weekdayObject).Trim = todayWeekday The";
if (((""+BA.ObjectToString(_weekdayobject)).trim()).equals(_todayweekday)) { 
RDebugUtils.currentLine=36438029;
 //BA.debugLineNum = 36438029;BA.debugLine="weekdayMatched = True";
_weekdaymatched = __c.True;
RDebugUtils.currentLine=36438030;
 //BA.debugLineNum = 36438030;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=36438033;
 //BA.debugLineNum = 36438033;BA.debugLine="If weekdayMatched = False Then Return False";
if (_weekdaymatched==__c.False) { 
if (true) return __c.False;};
 };
RDebugUtils.currentLine=36438035;
 //BA.debugLineNum = 36438035;BA.debugLine="Dim baseMinute As Int = TimeStringToMinutes(ad.Ge";
_baseminute = __ref._timestringtominutes /*int*/ (null,BA.ObjectToString(_ad.GetDefault((Object)("time"),(Object)(""))));
RDebugUtils.currentLine=36438036;
 //BA.debugLineNum = 36438036;BA.debugLine="If baseMinute < 0 Then Return False";
if (_baseminute<0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36438037;
 //BA.debugLineNum = 36438037;BA.debugLine="If currentMinuteOfDay < baseMinute Then Return Fa";
if (_currentminuteofday<_baseminute) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36438038;
 //BA.debugLineNum = 36438038;BA.debugLine="Dim intervalMinutes As Int = ToLongDefault(ad.Get";
_intervalminutes = (int) (__ref._tolongdefault /*long*/ (null,_ad.GetDefault((Object)("interval"),(Object)(0)),(long) (0)));
RDebugUtils.currentLine=36438039;
 //BA.debugLineNum = 36438039;BA.debugLine="If intervalMinutes <= 0 Then Return currentMinute";
if (_intervalminutes<=0) { 
if (true) return _currentminuteofday==_baseminute;};
RDebugUtils.currentLine=36438040;
 //BA.debugLineNum = 36438040;BA.debugLine="Return ((currentMinuteOfDay - baseMinute) Mod int";
if (true) return ((_currentminuteofday-_baseminute)%_intervalminutes)==0;
RDebugUtils.currentLine=36438041;
 //BA.debugLineNum = 36438041;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=37093376;
 //BA.debugLineNum = 37093376;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
RDebugUtils.currentLine=37093377;
 //BA.debugLineNum = 37093377;BA.debugLine="If value = \"\" Then Return -1";
if ((_value).equals("")) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=37093378;
 //BA.debugLineNum = 37093378;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
_parts = __c.Regex.Split(":",_value);
RDebugUtils.currentLine=37093379;
 //BA.debugLineNum = 37093379;BA.debugLine="If parts.Length < 2 Then Return -1";
if (_parts.length<2) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=37093380;
 //BA.debugLineNum = 37093380;BA.debugLine="Try";
try {RDebugUtils.currentLine=37093381;
 //BA.debugLineNum = 37093381;BA.debugLine="Dim hours As Int = parts(0)";
_hours = (int)(Double.parseDouble(_parts[(int) (0)]));
RDebugUtils.currentLine=37093382;
 //BA.debugLineNum = 37093382;BA.debugLine="Dim minutes As Int = parts(1)";
_minutes = (int)(Double.parseDouble(_parts[(int) (1)]));
RDebugUtils.currentLine=37093383;
 //BA.debugLineNum = 37093383;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
if (_hours<0 || _hours>23) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=37093384;
 //BA.debugLineNum = 37093384;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
if (_minutes<0 || _minutes>59) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=37093385;
 //BA.debugLineNum = 37093385;BA.debugLine="Return hours * 60 + minutes";
if (true) return (int) (_hours*60+_minutes);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=37093387;
 //BA.debugLineNum = 37093387;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
RDebugUtils.currentLine=37093389;
 //BA.debugLineNum = 37093389;BA.debugLine="End Sub";
return 0;
}
public long  _tolongdefault(b4j.example.adscheduler __ref,Object _value,long _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "tolongdefault", false))
	 {return ((Long) Debug.delegate(ba, "tolongdefault", new Object[] {_value,_defaultvalue}));}
RDebugUtils.currentLine=37158912;
 //BA.debugLineNum = 37158912;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
RDebugUtils.currentLine=37158913;
 //BA.debugLineNum = 37158913;BA.debugLine="Try";
try {RDebugUtils.currentLine=37158914;
 //BA.debugLineNum = 37158914;BA.debugLine="If value = Null Then Return defaultValue";
if (_value== null) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=37158915;
 //BA.debugLineNum = 37158915;BA.debugLine="Return value";
if (true) return BA.ObjectToLongNumber(_value);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=37158917;
 //BA.debugLineNum = 37158917;BA.debugLine="Try";
try {RDebugUtils.currentLine=37158918;
 //BA.debugLineNum = 37158918;BA.debugLine="Return Floor((\"\" & value).Trim)";
if (true) return (long) (__c.Floor((double)(Double.parseDouble((""+BA.ObjectToString(_value)).trim()))));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=37158920;
 //BA.debugLineNum = 37158920;BA.debugLine="Return defaultValue";
if (true) return _defaultvalue;
 };
 };
RDebugUtils.currentLine=37158923;
 //BA.debugLineNum = 37158923;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Private Sub BuildBreakForMinute(offlineData As Map";
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="Dim emptyBreak As Map";
_emptybreak = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="emptyBreak.Initialize";
_emptybreak.Initialize();
RDebugUtils.currentLine=36372483;
 //BA.debugLineNum = 36372483;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("ads"),__c.Null)));
RDebugUtils.currentLine=36372484;
 //BA.debugLineNum = 36372484;BA.debugLine="If ads.IsInitialized = False Or ads.Size = 0 Then";
if (_ads.IsInitialized()==__c.False || _ads.getSize()==0) { 
if (true) return _emptybreak;};
RDebugUtils.currentLine=36372485;
 //BA.debugLineNum = 36372485;BA.debugLine="Dim targetTicks As Long = LocalTimestampToTicks(t";
_targetticks = __ref._localtimestamptoticks /*long*/ (null,_targetminutetimestamp);
RDebugUtils.currentLine=36372486;
 //BA.debugLineNum = 36372486;BA.debugLine="Dim todayKey As String = FormatIsoDate(targetTick";
_todaykey = __ref._formatisodate /*String*/ (null,_targetticks);
RDebugUtils.currentLine=36372487;
 //BA.debugLineNum = 36372487;BA.debugLine="Dim todayWeekday As String = IsoWeekdayFromTimest";
_todayweekday = __ref._isoweekdayfromtimestamp /*String*/ (null,_targetticks);
RDebugUtils.currentLine=36372488;
 //BA.debugLineNum = 36372488;BA.debugLine="Dim currentMinuteOfDay As Int = MinutesOfDayFromT";
_currentminuteofday = __ref._minutesofdayfromtimestamp /*int*/ (null,_targetticks);
RDebugUtils.currentLine=36372489;
 //BA.debugLineNum = 36372489;BA.debugLine="Dim dueItems As List";
_dueitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=36372490;
 //BA.debugLineNum = 36372490;BA.debugLine="dueItems.Initialize";
_dueitems.Initialize();
RDebugUtils.currentLine=36372491;
 //BA.debugLineNum = 36372491;BA.debugLine="Dim hasExactAds As Boolean = False";
_hasexactads = __c.False;
RDebugUtils.currentLine=36372492;
 //BA.debugLineNum = 36372492;BA.debugLine="For Each adObject As Object In ads";
{
final anywheresoftware.b4a.BA.IterableList group12 = _ads;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_adobject = group12.Get(index12);
RDebugUtils.currentLine=36372493;
 //BA.debugLineNum = 36372493;BA.debugLine="If adObject Is Map Then";
if (_adobject instanceof java.util.Map) { 
RDebugUtils.currentLine=36372494;
 //BA.debugLineNum = 36372494;BA.debugLine="Dim ad As Map = adObject";
_ad = new anywheresoftware.b4a.objects.collections.Map();
_ad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adobject));
RDebugUtils.currentLine=36372495;
 //BA.debugLineNum = 36372495;BA.debugLine="If AdMatchesCurrentMinute(ad, todayKey, todayWe";
if (__ref._admatchescurrentminute /*boolean*/ (null,_ad,_todaykey,_todayweekday,_currentminuteofday,_allowregularads)) { 
RDebugUtils.currentLine=36372496;
 //BA.debugLineNum = 36372496;BA.debugLine="If ad.GetDefault(\"exactly\", False) = True Then";
if ((_ad.GetDefault((Object)("exactly"),(Object)(__c.False))).equals((Object)(__c.True))) { 
_hasexactads = __c.True;};
RDebugUtils.currentLine=36372497;
 //BA.debugLineNum = 36372497;BA.debugLine="dueItems.Add(CreateAdQueueItem(ad))";
_dueitems.Add((Object)(__ref._createadqueueitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,_ad).getObject()));
 };
 };
 }
};
RDebugUtils.currentLine=36372501;
 //BA.debugLineNum = 36372501;BA.debugLine="If dueItems.Size = 0 Then Return emptyBreak";
if (_dueitems.getSize()==0) { 
if (true) return _emptybreak;};
RDebugUtils.currentLine=36372502;
 //BA.debugLineNum = 36372502;BA.debugLine="Dim breakItem As Map";
_breakitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36372503;
 //BA.debugLineNum = 36372503;BA.debugLine="breakItem.Initialize";
_breakitem.Initialize();
RDebugUtils.currentLine=36372504;
 //BA.debugLineNum = 36372504;BA.debugLine="breakItem.Put(\"type\", \"break\")";
_breakitem.Put((Object)("type"),(Object)("break"));
RDebugUtils.currentLine=36372505;
 //BA.debugLineNum = 36372505;BA.debugLine="breakItem.Put(\"exactly\", hasExactAds)";
_breakitem.Put((Object)("exactly"),(Object)(_hasexactads));
RDebugUtils.currentLine=36372506;
 //BA.debugLineNum = 36372506;BA.debugLine="breakItem.Put(\"at\", targetMinuteTimestamp)";
_breakitem.Put((Object)("at"),(Object)(_targetminutetimestamp));
RDebugUtils.currentLine=36372507;
 //BA.debugLineNum = 36372507;BA.debugLine="breakItem.Put(\"items\", dueItems)";
_breakitem.Put((Object)("items"),(Object)(_dueitems.getObject()));
RDebugUtils.currentLine=36372508;
 //BA.debugLineNum = 36372508;BA.debugLine="breakItem.Put(\"items_count\", dueItems.Size)";
_breakitem.Put((Object)("items_count"),(Object)(_dueitems.getSize()));
RDebugUtils.currentLine=36372509;
 //BA.debugLineNum = 36372509;BA.debugLine="Return breakItem";
if (true) return _breakitem;
RDebugUtils.currentLine=36372510;
 //BA.debugLineNum = 36372510;BA.debugLine="End Sub";
return null;
}
public long  _localtimestamptoticks(b4j.example.adscheduler __ref,long _targettimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "localtimestamptoticks", false))
	 {return ((Long) Debug.delegate(ba, "localtimestamptoticks", new Object[] {_targettimestamp}));}
RDebugUtils.currentLine=36962304;
 //BA.debugLineNum = 36962304;BA.debugLine="Private Sub LocalTimestampToTicks(targetTimestamp";
RDebugUtils.currentLine=36962305;
 //BA.debugLineNum = 36962305;BA.debugLine="Return (targetTimestamp + (TimezoneOffsetMinutes";
if (true) return (long) ((_targettimestamp+(__ref._timezoneoffsetminutes /*int*/ (null)*60))*1000);
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="End Sub";
return 0L;
}
public String  _formatisodate(b4j.example.adscheduler __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "formatisodate", false))
	 {return ((String) Debug.delegate(ba, "formatisodate", new Object[] {_ticks}));}
String _previousdateformat = "";
String _value = "";
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
RDebugUtils.currentLine=36700161;
 //BA.debugLineNum = 36700161;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=36700163;
 //BA.debugLineNum = 36700163;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=36700164;
 //BA.debugLineNum = 36700164;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=36700165;
 //BA.debugLineNum = 36700165;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=36700166;
 //BA.debugLineNum = 36700166;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Private Sub IsoWeekdayFromTimestamp(ticks As Long)";
RDebugUtils.currentLine=36831233;
 //BA.debugLineNum = 36831233;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="jo.InitializeStatic(\"java.time.LocalDate\")";
_jo.InitializeStatic("java.time.LocalDate");
RDebugUtils.currentLine=36831235;
 //BA.debugLineNum = 36831235;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=36831236;
 //BA.debugLineNum = 36831236;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant\"";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=36831237;
 //BA.debugLineNum = 36831237;BA.debugLine="Dim zoneClass As JavaObject";
_zoneclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=36831238;
 //BA.debugLineNum = 36831238;BA.debugLine="zoneClass.InitializeStatic(\"java.time.ZoneId\")";
_zoneclass.InitializeStatic("java.time.ZoneId");
RDebugUtils.currentLine=36831239;
 //BA.debugLineNum = 36831239;BA.debugLine="Dim instant As JavaObject = instantClass.RunMetho";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("ofEpochMilli",new Object[]{(Object)(_ticks)})));
RDebugUtils.currentLine=36831240;
 //BA.debugLineNum = 36831240;BA.debugLine="Dim zoneId As JavaObject = zoneClass.RunMethod(\"s";
_zoneid = new anywheresoftware.b4j.object.JavaObject();
_zoneid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneclass.RunMethod("systemDefault",(Object[])(__c.Null))));
RDebugUtils.currentLine=36831241;
 //BA.debugLineNum = 36831241;BA.debugLine="Dim zonedDateTimeClass As JavaObject";
_zoneddatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=36831242;
 //BA.debugLineNum = 36831242;BA.debugLine="zonedDateTimeClass.InitializeStatic(\"java.time.Zo";
_zoneddatetimeclass.InitializeStatic("java.time.ZonedDateTime");
RDebugUtils.currentLine=36831243;
 //BA.debugLineNum = 36831243;BA.debugLine="Dim zonedDateTime As JavaObject = zonedDateTimeCl";
_zoneddatetime = new anywheresoftware.b4j.object.JavaObject();
_zoneddatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetimeclass.RunMethod("ofInstant",new Object[]{(Object)(_instant.getObject()),(Object)(_zoneid.getObject())})));
RDebugUtils.currentLine=36831244;
 //BA.debugLineNum = 36831244;BA.debugLine="Dim localDate As JavaObject = zonedDateTime.RunMe";
_localdate = new anywheresoftware.b4j.object.JavaObject();
_localdate = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetime.RunMethod("toLocalDate",(Object[])(__c.Null))));
RDebugUtils.currentLine=36831245;
 //BA.debugLineNum = 36831245;BA.debugLine="Dim dayOfWeek As JavaObject = localDate.RunMethod";
_dayofweek = new anywheresoftware.b4j.object.JavaObject();
_dayofweek = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_localdate.RunMethod("getDayOfWeek",(Object[])(__c.Null))));
RDebugUtils.currentLine=36831246;
 //BA.debugLineNum = 36831246;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
if (true) return ""+BA.ObjectToString(_dayofweek.RunMethod("getValue",(Object[])(__c.Null)));
RDebugUtils.currentLine=36831247;
 //BA.debugLineNum = 36831247;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36765696;
 //BA.debugLineNum = 36765696;BA.debugLine="Private Sub MinutesOfDayFromTimestamp(ticks As Lon";
RDebugUtils.currentLine=36765697;
 //BA.debugLineNum = 36765697;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=36765699;
 //BA.debugLineNum = 36765699;BA.debugLine="Dim timeValue As String = DateTime.Time(ticks)";
_timevalue = __c.DateTime.Time(_ticks);
RDebugUtils.currentLine=36765700;
 //BA.debugLineNum = 36765700;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=36765701;
 //BA.debugLineNum = 36765701;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
RDebugUtils.currentLine=36765702;
 //BA.debugLineNum = 36765702;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=36765703;
 //BA.debugLineNum = 36765703;BA.debugLine="Return parts(0) * 60 + parts(1)";
if (true) return (int) ((double)(Double.parseDouble(_parts[(int) (0)]))*60+(double)(Double.parseDouble(_parts[(int) (1)])));
RDebugUtils.currentLine=36765704;
 //BA.debugLineNum = 36765704;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _createadqueueitem(b4j.example.adscheduler __ref,anywheresoftware.b4a.objects.collections.Map _ad) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "createadqueueitem", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createadqueueitem", new Object[] {_ad}));}
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=36503552;
 //BA.debugLineNum = 36503552;BA.debugLine="Private Sub CreateAdQueueItem(ad As Map) As Map";
RDebugUtils.currentLine=36503553;
 //BA.debugLineNum = 36503553;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=36503555;
 //BA.debugLineNum = 36503555;BA.debugLine="item.Put(\"type\", \"ad\")";
_item.Put((Object)("type"),(Object)("ad"));
RDebugUtils.currentLine=36503556;
 //BA.debugLineNum = 36503556;BA.debugLine="item.Put(\"id\", ad.GetDefault(\"id\", \"\"))";
_item.Put((Object)("id"),_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=36503557;
 //BA.debugLineNum = 36503557;BA.debugLine="item.Put(\"title\", ad.GetDefault(\"title\", adLabelT";
_item.Put((Object)("title"),_ad.GetDefault((Object)("title"),(Object)(__ref._adlabeltext /*String*/ )));
RDebugUtils.currentLine=36503558;
 //BA.debugLineNum = 36503558;BA.debugLine="item.Put(\"duration\", ToLongDefault(ad.GetDefault(";
_item.Put((Object)("duration"),(Object)(__ref._tolongdefault /*long*/ (null,_ad.GetDefault((Object)("duration"),(Object)(0)),(long) (0))));
RDebugUtils.currentLine=36503559;
 //BA.debugLineNum = 36503559;BA.debugLine="item.Put(\"gain\", ad.GetDefault(\"gain\", -3))";
_item.Put((Object)("gain"),_ad.GetDefault((Object)("gain"),(Object)(-3)));
RDebugUtils.currentLine=36503560;
 //BA.debugLineNum = 36503560;BA.debugLine="item.Put(\"exactly\", ad.GetDefault(\"exactly\", Fals";
_item.Put((Object)("exactly"),_ad.GetDefault((Object)("exactly"),(Object)(__c.False)));
RDebugUtils.currentLine=36503561;
 //BA.debugLineNum = 36503561;BA.debugLine="Return item";
if (true) return _item;
RDebugUtils.currentLine=36503562;
 //BA.debugLineNum = 36503562;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.adscheduler __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=36110337;
 //BA.debugLineNum = 36110337;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=36110339;
 //BA.debugLineNum = 36110339;BA.debugLine="Private adLabelText As String";
_adlabeltext = "";
RDebugUtils.currentLine=36110340;
 //BA.debugLineNum = 36110340;BA.debugLine="Private lastScanMinuteKey As String = \"\"";
_lastscanminutekey = "";
RDebugUtils.currentLine=36110341;
 //BA.debugLineNum = 36110341;BA.debugLine="Private lastInjectedMinuteKey As String = \"\"";
_lastinjectedminutekey = "";
RDebugUtils.currentLine=36110342;
 //BA.debugLineNum = 36110342;BA.debugLine="End Sub";
return "";
}
public boolean  _hasbreakscheduledat(b4j.example.adscheduler __ref,anywheresoftware.b4a.objects.collections.List _playqueue,long _breakat) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "hasbreakscheduledat", false))
	 {return ((Boolean) Debug.delegate(ba, "hasbreakscheduledat", new Object[] {_playqueue,_breakat}));}
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Private Sub HasBreakScheduledAt(playQueue As List,";
RDebugUtils.currentLine=36569089;
 //BA.debugLineNum = 36569089;BA.debugLine="If breakAt <= 0 Then Return False";
if (_breakat<=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36569090;
 //BA.debugLineNum = 36569090;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group2 = _playqueue;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_itemobject = group2.Get(index2);
RDebugUtils.currentLine=36569091;
 //BA.debugLineNum = 36569091;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=36569092;
 //BA.debugLineNum = 36569092;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=36569093;
 //BA.debugLineNum = 36569093;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"break\" And To";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break")) && __ref._tolongdefault /*long*/ (null,_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1))==_breakat) { 
if (true) return __c.True;};
 };
 }
};
RDebugUtils.currentLine=36569096;
 //BA.debugLineNum = 36569096;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=36569097;
 //BA.debugLineNum = 36569097;BA.debugLine="End Sub";
return false;
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
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Private Sub TimezoneOffsetMinutes As Int";
RDebugUtils.currentLine=37027841;
 //BA.debugLineNum = 37027841;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=37027842;
 //BA.debugLineNum = 37027842;BA.debugLine="jo.InitializeStatic(\"java.time.OffsetDateTime\")";
_jo.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=37027843;
 //BA.debugLineNum = 37027843;BA.debugLine="Dim nowOffset As JavaObject = jo.RunMethod(\"now\",";
_nowoffset = new anywheresoftware.b4j.object.JavaObject();
_nowoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("now",(Object[])(__c.Null))));
RDebugUtils.currentLine=37027844;
 //BA.debugLineNum = 37027844;BA.debugLine="Dim zoneOffset As JavaObject = nowOffset.RunMetho";
_zoneoffset = new anywheresoftware.b4j.object.JavaObject();
_zoneoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nowoffset.RunMethod("getOffset",(Object[])(__c.Null))));
RDebugUtils.currentLine=37027845;
 //BA.debugLineNum = 37027845;BA.debugLine="Dim totalSeconds As Int = zoneOffset.RunMethod(\"g";
_totalseconds = (int)(BA.ObjectToNumber(_zoneoffset.RunMethod("getTotalSeconds",(Object[])(__c.Null))));
RDebugUtils.currentLine=37027846;
 //BA.debugLineNum = 37027846;BA.debugLine="Return -Round(totalSeconds / 60)";
if (true) return (int) (-__c.Round(_totalseconds/(double)60));
RDebugUtils.currentLine=37027847;
 //BA.debugLineNum = 37027847;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Private Sub MinuteKeyFromTimestamp(targetMinuteTim";
RDebugUtils.currentLine=36896769;
 //BA.debugLineNum = 36896769;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=36896771;
 //BA.debugLineNum = 36896771;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=36896772;
 //BA.debugLineNum = 36896772;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
__c.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=36896773;
 //BA.debugLineNum = 36896773;BA.debugLine="Dim ticks As Long = LocalTimestampToTicks(targetM";
_ticks = __ref._localtimestamptoticks /*long*/ (null,_targetminutetimestamp);
RDebugUtils.currentLine=36896774;
 //BA.debugLineNum = 36896774;BA.debugLine="Dim value As String = DateTime.Date(ticks) & \" \"";
_value = __c.DateTime.Date(_ticks)+" "+__c.DateTime.Time(_ticks);
RDebugUtils.currentLine=36896775;
 //BA.debugLineNum = 36896775;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=36896776;
 //BA.debugLineNum = 36896776;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=36896777;
 //BA.debugLineNum = 36896777;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=36896778;
 //BA.debugLineNum = 36896778;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.adscheduler __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=36241408;
 //BA.debugLineNum = 36241408;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="lastScanMinuteKey = \"\"";
__ref._lastscanminutekey /*String*/  = "";
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="lastInjectedMinuteKey = \"\"";
__ref._lastinjectedminutekey /*String*/  = "";
RDebugUtils.currentLine=36241411;
 //BA.debugLineNum = 36241411;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.adscheduler __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=36634625;
 //BA.debugLineNum = 36634625;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=36634628;
 //BA.debugLineNum = 36634628;BA.debugLine="End Sub";
return "";
}
}