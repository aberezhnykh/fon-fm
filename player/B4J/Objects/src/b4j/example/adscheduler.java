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
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Public Sub Initialize(targetModuleValue As Object,";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="adLabelText = adLabelTextValue";
__ref._adlabeltext /*String*/  = _adlabeltextvalue;
RDebugUtils.currentLine=19333124;
 //BA.debugLineNum = 19333124;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Public Sub ScanTargetMinute(offlineData As Map, pl";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if ((_offlinedata.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="If playQueue.IsInitialized = False Then Return Fa";
if (_playqueue.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="Dim minuteKey As String = MinuteKeyFromTimestamp(";
_minutekey = __ref._minutekeyfromtimestamp /*String*/ (null,_targetminutetimestamp);
RDebugUtils.currentLine=19464197;
 //BA.debugLineNum = 19464197;BA.debugLine="If force = False And minuteKey = lastScanMinuteKe";
if (_force==__c.False && (_minutekey).equals(__ref._lastscanminutekey /*String*/ )) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19464198;
 //BA.debugLineNum = 19464198;BA.debugLine="lastScanMinuteKey = minuteKey";
__ref._lastscanminutekey /*String*/  = _minutekey;
RDebugUtils.currentLine=19464199;
 //BA.debugLineNum = 19464199;BA.debugLine="Dim breakItem As Map = BuildBreakForMinute(offlin";
_breakitem = new anywheresoftware.b4a.objects.collections.Map();
_breakitem = __ref._buildbreakforminute /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_targetminutetimestamp,_allowregularads);
RDebugUtils.currentLine=19464200;
 //BA.debugLineNum = 19464200;BA.debugLine="If breakItem.IsInitialized = False Or breakItem.S";
if (_breakitem.IsInitialized()==__c.False || _breakitem.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19464201;
 //BA.debugLineNum = 19464201;BA.debugLine="Dim breakAt As Long = ToLongDefault(breakItem.Get";
_breakat = __ref._tolongdefault /*long*/ (null,_breakitem.GetDefault((Object)("at"),(Object)(-1)),(long) (-1));
RDebugUtils.currentLine=19464202;
 //BA.debugLineNum = 19464202;BA.debugLine="If breakAt <= 0 Then Return False";
if (_breakat<=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19464203;
 //BA.debugLineNum = 19464203;BA.debugLine="If HasBreakScheduledAt(playQueue, breakAt) Then";
if (__ref._hasbreakscheduledat /*boolean*/ (null,_playqueue,_breakat)) { 
RDebugUtils.currentLine=19464204;
 //BA.debugLineNum = 19464204;BA.debugLine="lastInjectedMinuteKey = minuteKey";
__ref._lastinjectedminutekey /*String*/  = _minutekey;
RDebugUtils.currentLine=19464205;
 //BA.debugLineNum = 19464205;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=19464207;
 //BA.debugLineNum = 19464207;BA.debugLine="If lastInjectedMinuteKey = minuteKey Then Return";
if ((__ref._lastinjectedminutekey /*String*/ ).equals(_minutekey)) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19464208;
 //BA.debugLineNum = 19464208;BA.debugLine="playQueue.InsertAt(0, breakItem)";
_playqueue.InsertAt((int) (0),(Object)(_breakitem.getObject()));
RDebugUtils.currentLine=19464209;
 //BA.debugLineNum = 19464209;BA.debugLine="lastInjectedMinuteKey = minuteKey";
__ref._lastinjectedminutekey /*String*/  = _minutekey;
RDebugUtils.currentLine=19464210;
 //BA.debugLineNum = 19464210;BA.debugLine="Trace(\"Локальный break добавлен в начало очереди.";
__ref._trace /*String*/ (null,"Локальный break добавлен в начало очереди. minute="+_minutekey+", items="+BA.ObjectToString(_breakitem.GetDefault((Object)("items_count"),(Object)(0)))+", queueSize="+BA.NumberToString(_playqueue.getSize()));
RDebugUtils.currentLine=19464211;
 //BA.debugLineNum = 19464211;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=19464212;
 //BA.debugLineNum = 19464212;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Private Sub AdMatchesCurrentMinute(ad As Map, toda";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="If ad.IsInitialized = False Then Return False";
if (_ad.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="Dim isExact As Boolean = ad.GetDefault(\"exactly\",";
_isexact = (_ad.GetDefault((Object)("exactly"),(Object)(__c.False))).equals((Object)(__c.True));
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="If isExact = False And allowRegularAds = False Th";
if (_isexact==__c.False && _allowregularads==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="Dim startDate As String = ad.GetDefault(\"start\",";
_startdate = BA.ObjectToString(_ad.GetDefault((Object)("start"),(Object)("")));
RDebugUtils.currentLine=19595269;
 //BA.debugLineNum = 19595269;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(todayK";
if ((_startdate).equals("") == false && _startdate.compareTo(_todaykey)>0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19595270;
 //BA.debugLineNum = 19595270;BA.debugLine="Dim endDate As String = ad.GetDefault(\"end\", \"\")";
_enddate = BA.ObjectToString(_ad.GetDefault((Object)("end"),(Object)("")));
RDebugUtils.currentLine=19595271;
 //BA.debugLineNum = 19595271;BA.debugLine="If endDate <> \"\" And endDate.CompareTo(todayKey)";
if ((_enddate).equals("") == false && _enddate.compareTo(_todaykey)<0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19595272;
 //BA.debugLineNum = 19595272;BA.debugLine="Dim weekdays As List = ad.GetDefault(\"weekdays\",";
_weekdays = new anywheresoftware.b4a.objects.collections.List();
_weekdays = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ad.GetDefault((Object)("weekdays"),__c.Null)));
RDebugUtils.currentLine=19595273;
 //BA.debugLineNum = 19595273;BA.debugLine="If weekdays.IsInitialized And weekdays.Size > 0 T";
if (_weekdays.IsInitialized() && _weekdays.getSize()>0) { 
RDebugUtils.currentLine=19595274;
 //BA.debugLineNum = 19595274;BA.debugLine="Dim weekdayMatched As Boolean = False";
_weekdaymatched = __c.False;
RDebugUtils.currentLine=19595275;
 //BA.debugLineNum = 19595275;BA.debugLine="For Each weekdayObject As Object In weekdays";
{
final anywheresoftware.b4a.BA.IterableList group11 = _weekdays;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_weekdayobject = group11.Get(index11);
RDebugUtils.currentLine=19595276;
 //BA.debugLineNum = 19595276;BA.debugLine="If (\"\" & weekdayObject).Trim = todayWeekday The";
if (((""+BA.ObjectToString(_weekdayobject)).trim()).equals(_todayweekday)) { 
RDebugUtils.currentLine=19595277;
 //BA.debugLineNum = 19595277;BA.debugLine="weekdayMatched = True";
_weekdaymatched = __c.True;
RDebugUtils.currentLine=19595278;
 //BA.debugLineNum = 19595278;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=19595281;
 //BA.debugLineNum = 19595281;BA.debugLine="If weekdayMatched = False Then Return False";
if (_weekdaymatched==__c.False) { 
if (true) return __c.False;};
 };
RDebugUtils.currentLine=19595283;
 //BA.debugLineNum = 19595283;BA.debugLine="Dim baseMinute As Int = TimeStringToMinutes(ad.Ge";
_baseminute = __ref._timestringtominutes /*int*/ (null,BA.ObjectToString(_ad.GetDefault((Object)("time"),(Object)(""))));
RDebugUtils.currentLine=19595284;
 //BA.debugLineNum = 19595284;BA.debugLine="If baseMinute < 0 Then Return False";
if (_baseminute<0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19595285;
 //BA.debugLineNum = 19595285;BA.debugLine="If currentMinuteOfDay < baseMinute Then Return Fa";
if (_currentminuteofday<_baseminute) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19595286;
 //BA.debugLineNum = 19595286;BA.debugLine="Dim intervalMinutes As Int = ToLongDefault(ad.Get";
_intervalminutes = (int) (__ref._tolongdefault /*long*/ (null,_ad.GetDefault((Object)("interval"),(Object)(0)),(long) (0)));
RDebugUtils.currentLine=19595287;
 //BA.debugLineNum = 19595287;BA.debugLine="If intervalMinutes <= 0 Then Return currentMinute";
if (_intervalminutes<=0) { 
if (true) return _currentminuteofday==_baseminute;};
RDebugUtils.currentLine=19595288;
 //BA.debugLineNum = 19595288;BA.debugLine="Return ((currentMinuteOfDay - baseMinute) Mod int";
if (true) return ((_currentminuteofday-_baseminute)%_intervalminutes)==0;
RDebugUtils.currentLine=19595289;
 //BA.debugLineNum = 19595289;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="If value = \"\" Then Return -1";
if ((_value).equals("")) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
_parts = __c.Regex.Split(":",_value);
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="If parts.Length < 2 Then Return -1";
if (_parts.length<2) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=20250628;
 //BA.debugLineNum = 20250628;BA.debugLine="Try";
try {RDebugUtils.currentLine=20250629;
 //BA.debugLineNum = 20250629;BA.debugLine="Dim hours As Int = parts(0)";
_hours = (int)(Double.parseDouble(_parts[(int) (0)]));
RDebugUtils.currentLine=20250630;
 //BA.debugLineNum = 20250630;BA.debugLine="Dim minutes As Int = parts(1)";
_minutes = (int)(Double.parseDouble(_parts[(int) (1)]));
RDebugUtils.currentLine=20250631;
 //BA.debugLineNum = 20250631;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
if (_hours<0 || _hours>23) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=20250632;
 //BA.debugLineNum = 20250632;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
if (_minutes<0 || _minutes>59) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=20250633;
 //BA.debugLineNum = 20250633;BA.debugLine="Return hours * 60 + minutes";
if (true) return (int) (_hours*60+_minutes);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=20250635;
 //BA.debugLineNum = 20250635;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
RDebugUtils.currentLine=20250637;
 //BA.debugLineNum = 20250637;BA.debugLine="End Sub";
return 0;
}
public long  _tolongdefault(b4j.example.adscheduler __ref,Object _value,long _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "tolongdefault", false))
	 {return ((Long) Debug.delegate(ba, "tolongdefault", new Object[] {_value,_defaultvalue}));}
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="Try";
try {RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="If value = Null Then Return defaultValue";
if (_value== null) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="Return value";
if (true) return BA.ObjectToLongNumber(_value);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=20316165;
 //BA.debugLineNum = 20316165;BA.debugLine="Try";
try {RDebugUtils.currentLine=20316166;
 //BA.debugLineNum = 20316166;BA.debugLine="Return Floor((\"\" & value).Trim)";
if (true) return (long) (__c.Floor((double)(Double.parseDouble((""+BA.ObjectToString(_value)).trim()))));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=20316168;
 //BA.debugLineNum = 20316168;BA.debugLine="Return defaultValue";
if (true) return _defaultvalue;
 };
 };
RDebugUtils.currentLine=20316171;
 //BA.debugLineNum = 20316171;BA.debugLine="End Sub";
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
Object _adobject = null;
anywheresoftware.b4a.objects.collections.Map _ad = null;
anywheresoftware.b4a.objects.collections.Map _breakitem = null;
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Private Sub BuildBreakForMinute(offlineData As Map";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Dim emptyBreak As Map";
_emptybreak = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="emptyBreak.Initialize";
_emptybreak.Initialize();
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("ads"),__c.Null)));
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="If ads.IsInitialized = False Or ads.Size = 0 Then";
if (_ads.IsInitialized()==__c.False || _ads.getSize()==0) { 
if (true) return _emptybreak;};
RDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="Dim targetTicks As Long = LocalTimestampToTicks(t";
_targetticks = __ref._localtimestamptoticks /*long*/ (null,_targetminutetimestamp);
RDebugUtils.currentLine=19529734;
 //BA.debugLineNum = 19529734;BA.debugLine="Dim todayKey As String = FormatIsoDate(targetTick";
_todaykey = __ref._formatisodate /*String*/ (null,_targetticks);
RDebugUtils.currentLine=19529735;
 //BA.debugLineNum = 19529735;BA.debugLine="Dim todayWeekday As String = IsoWeekdayFromTimest";
_todayweekday = __ref._isoweekdayfromtimestamp /*String*/ (null,_targetticks);
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="Dim currentMinuteOfDay As Int = MinutesOfDayFromT";
_currentminuteofday = __ref._minutesofdayfromtimestamp /*int*/ (null,_targetticks);
RDebugUtils.currentLine=19529737;
 //BA.debugLineNum = 19529737;BA.debugLine="Dim dueItems As List";
_dueitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19529738;
 //BA.debugLineNum = 19529738;BA.debugLine="dueItems.Initialize";
_dueitems.Initialize();
RDebugUtils.currentLine=19529739;
 //BA.debugLineNum = 19529739;BA.debugLine="For Each adObject As Object In ads";
{
final anywheresoftware.b4a.BA.IterableList group11 = _ads;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_adobject = group11.Get(index11);
RDebugUtils.currentLine=19529740;
 //BA.debugLineNum = 19529740;BA.debugLine="If adObject Is Map Then";
if (_adobject instanceof java.util.Map) { 
RDebugUtils.currentLine=19529741;
 //BA.debugLineNum = 19529741;BA.debugLine="Dim ad As Map = adObject";
_ad = new anywheresoftware.b4a.objects.collections.Map();
_ad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adobject));
RDebugUtils.currentLine=19529742;
 //BA.debugLineNum = 19529742;BA.debugLine="If AdMatchesCurrentMinute(ad, todayKey, todayWe";
if (__ref._admatchescurrentminute /*boolean*/ (null,_ad,_todaykey,_todayweekday,_currentminuteofday,_allowregularads)) { 
RDebugUtils.currentLine=19529743;
 //BA.debugLineNum = 19529743;BA.debugLine="dueItems.Add(CreateAdQueueItem(ad))";
_dueitems.Add((Object)(__ref._createadqueueitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,_ad).getObject()));
 };
 };
 }
};
RDebugUtils.currentLine=19529747;
 //BA.debugLineNum = 19529747;BA.debugLine="If dueItems.Size = 0 Then Return emptyBreak";
if (_dueitems.getSize()==0) { 
if (true) return _emptybreak;};
RDebugUtils.currentLine=19529748;
 //BA.debugLineNum = 19529748;BA.debugLine="Dim breakItem As Map";
_breakitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=19529749;
 //BA.debugLineNum = 19529749;BA.debugLine="breakItem.Initialize";
_breakitem.Initialize();
RDebugUtils.currentLine=19529750;
 //BA.debugLineNum = 19529750;BA.debugLine="breakItem.Put(\"type\", \"break\")";
_breakitem.Put((Object)("type"),(Object)("break"));
RDebugUtils.currentLine=19529751;
 //BA.debugLineNum = 19529751;BA.debugLine="breakItem.Put(\"exactly\", True)";
_breakitem.Put((Object)("exactly"),(Object)(__c.True));
RDebugUtils.currentLine=19529752;
 //BA.debugLineNum = 19529752;BA.debugLine="breakItem.Put(\"at\", targetMinuteTimestamp)";
_breakitem.Put((Object)("at"),(Object)(_targetminutetimestamp));
RDebugUtils.currentLine=19529753;
 //BA.debugLineNum = 19529753;BA.debugLine="breakItem.Put(\"items\", dueItems)";
_breakitem.Put((Object)("items"),(Object)(_dueitems.getObject()));
RDebugUtils.currentLine=19529754;
 //BA.debugLineNum = 19529754;BA.debugLine="breakItem.Put(\"items_count\", dueItems.Size)";
_breakitem.Put((Object)("items_count"),(Object)(_dueitems.getSize()));
RDebugUtils.currentLine=19529755;
 //BA.debugLineNum = 19529755;BA.debugLine="Return breakItem";
if (true) return _breakitem;
RDebugUtils.currentLine=19529756;
 //BA.debugLineNum = 19529756;BA.debugLine="End Sub";
return null;
}
public long  _localtimestamptoticks(b4j.example.adscheduler __ref,long _targettimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "localtimestamptoticks", false))
	 {return ((Long) Debug.delegate(ba, "localtimestamptoticks", new Object[] {_targettimestamp}));}
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Private Sub LocalTimestampToTicks(targetTimestamp";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Return (targetTimestamp + (TimezoneOffsetMinutes";
if (true) return (long) ((_targettimestamp+(__ref._timezoneoffsetminutes /*int*/ (null)*60))*1000);
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="End Sub";
return 0L;
}
public String  _formatisodate(b4j.example.adscheduler __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "formatisodate", false))
	 {return ((String) Debug.delegate(ba, "formatisodate", new Object[] {_ticks}));}
String _previousdateformat = "";
String _value = "";
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=19857411;
 //BA.debugLineNum = 19857411;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=19857413;
 //BA.debugLineNum = 19857413;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=19857414;
 //BA.debugLineNum = 19857414;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Private Sub IsoWeekdayFromTimestamp(ticks As Long)";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="jo.InitializeStatic(\"java.time.LocalDate\")";
_jo.InitializeStatic("java.time.LocalDate");
RDebugUtils.currentLine=19988483;
 //BA.debugLineNum = 19988483;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant\"";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="Dim zoneClass As JavaObject";
_zoneclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="zoneClass.InitializeStatic(\"java.time.ZoneId\")";
_zoneclass.InitializeStatic("java.time.ZoneId");
RDebugUtils.currentLine=19988487;
 //BA.debugLineNum = 19988487;BA.debugLine="Dim instant As JavaObject = instantClass.RunMetho";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("ofEpochMilli",new Object[]{(Object)(_ticks)})));
RDebugUtils.currentLine=19988488;
 //BA.debugLineNum = 19988488;BA.debugLine="Dim zoneId As JavaObject = zoneClass.RunMethod(\"s";
_zoneid = new anywheresoftware.b4j.object.JavaObject();
_zoneid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneclass.RunMethod("systemDefault",(Object[])(__c.Null))));
RDebugUtils.currentLine=19988489;
 //BA.debugLineNum = 19988489;BA.debugLine="Dim zonedDateTimeClass As JavaObject";
_zoneddatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19988490;
 //BA.debugLineNum = 19988490;BA.debugLine="zonedDateTimeClass.InitializeStatic(\"java.time.Zo";
_zoneddatetimeclass.InitializeStatic("java.time.ZonedDateTime");
RDebugUtils.currentLine=19988491;
 //BA.debugLineNum = 19988491;BA.debugLine="Dim zonedDateTime As JavaObject = zonedDateTimeCl";
_zoneddatetime = new anywheresoftware.b4j.object.JavaObject();
_zoneddatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetimeclass.RunMethod("ofInstant",new Object[]{(Object)(_instant.getObject()),(Object)(_zoneid.getObject())})));
RDebugUtils.currentLine=19988492;
 //BA.debugLineNum = 19988492;BA.debugLine="Dim localDate As JavaObject = zonedDateTime.RunMe";
_localdate = new anywheresoftware.b4j.object.JavaObject();
_localdate = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetime.RunMethod("toLocalDate",(Object[])(__c.Null))));
RDebugUtils.currentLine=19988493;
 //BA.debugLineNum = 19988493;BA.debugLine="Dim dayOfWeek As JavaObject = localDate.RunMethod";
_dayofweek = new anywheresoftware.b4j.object.JavaObject();
_dayofweek = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_localdate.RunMethod("getDayOfWeek",(Object[])(__c.Null))));
RDebugUtils.currentLine=19988494;
 //BA.debugLineNum = 19988494;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
if (true) return ""+BA.ObjectToString(_dayofweek.RunMethod("getValue",(Object[])(__c.Null)));
RDebugUtils.currentLine=19988495;
 //BA.debugLineNum = 19988495;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Private Sub MinutesOfDayFromTimestamp(ticks As Lon";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=19922947;
 //BA.debugLineNum = 19922947;BA.debugLine="Dim timeValue As String = DateTime.Time(ticks)";
_timevalue = __c.DateTime.Time(_ticks);
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
RDebugUtils.currentLine=19922950;
 //BA.debugLineNum = 19922950;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=19922951;
 //BA.debugLineNum = 19922951;BA.debugLine="Return parts(0) * 60 + parts(1)";
if (true) return (int) ((double)(Double.parseDouble(_parts[(int) (0)]))*60+(double)(Double.parseDouble(_parts[(int) (1)])));
RDebugUtils.currentLine=19922952;
 //BA.debugLineNum = 19922952;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _createadqueueitem(b4j.example.adscheduler __ref,anywheresoftware.b4a.objects.collections.Map _ad) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "createadqueueitem", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createadqueueitem", new Object[] {_ad}));}
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Private Sub CreateAdQueueItem(ad As Map) As Map";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="item.Put(\"type\", \"ad\")";
_item.Put((Object)("type"),(Object)("ad"));
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="item.Put(\"id\", ad.GetDefault(\"id\", \"\"))";
_item.Put((Object)("id"),_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="item.Put(\"title\", ad.GetDefault(\"title\", adLabelT";
_item.Put((Object)("title"),_ad.GetDefault((Object)("title"),(Object)(__ref._adlabeltext /*String*/ )));
RDebugUtils.currentLine=19660806;
 //BA.debugLineNum = 19660806;BA.debugLine="item.Put(\"duration\", ToLongDefault(ad.GetDefault(";
_item.Put((Object)("duration"),(Object)(__ref._tolongdefault /*long*/ (null,_ad.GetDefault((Object)("duration"),(Object)(0)),(long) (0))));
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="item.Put(\"gain\", ad.GetDefault(\"gain\", -3))";
_item.Put((Object)("gain"),_ad.GetDefault((Object)("gain"),(Object)(-3)));
RDebugUtils.currentLine=19660808;
 //BA.debugLineNum = 19660808;BA.debugLine="item.Put(\"exactly\", ad.GetDefault(\"exactly\", Fals";
_item.Put((Object)("exactly"),_ad.GetDefault((Object)("exactly"),(Object)(__c.False)));
RDebugUtils.currentLine=19660809;
 //BA.debugLineNum = 19660809;BA.debugLine="Return item";
if (true) return _item;
RDebugUtils.currentLine=19660810;
 //BA.debugLineNum = 19660810;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.adscheduler __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=19267587;
 //BA.debugLineNum = 19267587;BA.debugLine="Private adLabelText As String";
_adlabeltext = "";
RDebugUtils.currentLine=19267588;
 //BA.debugLineNum = 19267588;BA.debugLine="Private lastScanMinuteKey As String = \"\"";
_lastscanminutekey = "";
RDebugUtils.currentLine=19267589;
 //BA.debugLineNum = 19267589;BA.debugLine="Private lastInjectedMinuteKey As String = \"\"";
_lastinjectedminutekey = "";
RDebugUtils.currentLine=19267590;
 //BA.debugLineNum = 19267590;BA.debugLine="End Sub";
return "";
}
public boolean  _hasbreakscheduledat(b4j.example.adscheduler __ref,anywheresoftware.b4a.objects.collections.List _playqueue,long _breakat) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "hasbreakscheduledat", false))
	 {return ((Boolean) Debug.delegate(ba, "hasbreakscheduledat", new Object[] {_playqueue,_breakat}));}
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Private Sub HasBreakScheduledAt(playQueue As List,";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="If breakAt <= 0 Then Return False";
if (_breakat<=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group2 = _playqueue;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_itemobject = group2.Get(index2);
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"break\" And To";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break")) && __ref._tolongdefault /*long*/ (null,_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1))==_breakat) { 
if (true) return __c.True;};
 };
 }
};
RDebugUtils.currentLine=19726344;
 //BA.debugLineNum = 19726344;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=19726345;
 //BA.debugLineNum = 19726345;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Private Sub TimezoneOffsetMinutes As Int";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="jo.InitializeStatic(\"java.time.OffsetDateTime\")";
_jo.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="Dim nowOffset As JavaObject = jo.RunMethod(\"now\",";
_nowoffset = new anywheresoftware.b4j.object.JavaObject();
_nowoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("now",(Object[])(__c.Null))));
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="Dim zoneOffset As JavaObject = nowOffset.RunMetho";
_zoneoffset = new anywheresoftware.b4j.object.JavaObject();
_zoneoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nowoffset.RunMethod("getOffset",(Object[])(__c.Null))));
RDebugUtils.currentLine=20185093;
 //BA.debugLineNum = 20185093;BA.debugLine="Dim totalSeconds As Int = zoneOffset.RunMethod(\"g";
_totalseconds = (int)(BA.ObjectToNumber(_zoneoffset.RunMethod("getTotalSeconds",(Object[])(__c.Null))));
RDebugUtils.currentLine=20185094;
 //BA.debugLineNum = 20185094;BA.debugLine="Return -Round(totalSeconds / 60)";
if (true) return (int) (-__c.Round(_totalseconds/(double)60));
RDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Private Sub MinuteKeyFromTimestamp(targetMinuteTim";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
__c.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="Dim ticks As Long = LocalTimestampToTicks(targetM";
_ticks = __ref._localtimestamptoticks /*long*/ (null,_targetminutetimestamp);
RDebugUtils.currentLine=20054022;
 //BA.debugLineNum = 20054022;BA.debugLine="Dim value As String = DateTime.Date(ticks) & \" \"";
_value = __c.DateTime.Date(_ticks)+" "+__c.DateTime.Time(_ticks);
RDebugUtils.currentLine=20054023;
 //BA.debugLineNum = 20054023;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=20054024;
 //BA.debugLineNum = 20054024;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=20054025;
 //BA.debugLineNum = 20054025;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=20054026;
 //BA.debugLineNum = 20054026;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.adscheduler __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="lastScanMinuteKey = \"\"";
__ref._lastscanminutekey /*String*/  = "";
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="lastInjectedMinuteKey = \"\"";
__ref._lastinjectedminutekey /*String*/  = "";
RDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.adscheduler __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="adscheduler";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="End Sub";
return "";
}
}