package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playbackhost extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playbackhost");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playbackhost.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.Timer _directortimer = null;
public anywheresoftware.b4a.objects.Timer _watchdogtimer = null;
public anywheresoftware.b4a.objects.Timer _breaktimer = null;
public anywheresoftware.b4a.objects.Timer _historyflushtimer = null;
public anywheresoftware.b4a.objects.Timer _traceuploadtimer = null;
public anywheresoftware.b4a.objects.Timer _offlinedatarefreshtimer = null;
public anywheresoftware.b4a.objects.Timer _localadminutetimer = null;
public anywheresoftware.b4a.objects.Timer _cacheaudittimer = null;
public boolean _initializedflag = false;
public boolean _coretimersstarted = false;
public String _pendingcommand = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _attachpage(Object _page) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub AttachPage(page As Object)";
 //BA.debugLineNum = 38;BA.debugLine="EnsureCoreInitialized";
_ensurecoreinitialized();
 //BA.debugLineNum = 39;BA.debugLine="StartCoreTimers";
_startcoretimers();
 //BA.debugLineNum = 40;BA.debugLine="TryDispatchPendingCommand";
_trydispatchpendingcommand();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _breaktimer_tick() throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Private Sub BreakTimer_Tick";
 //BA.debugLineNum = 161;BA.debugLine="breakTimer.Enabled = False";
_breaktimer.setEnabled(__c.False);
 //BA.debugLineNum = 162;BA.debugLine="CallSubDelayed2(Starter, \"DispatchPlaybackHostEve";
__c.CallSubDelayed2(ba,(Object)(_starter.getObject()),"DispatchPlaybackHostEvent",(Object)("break_tick"));
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public String  _cacheaudittimer_tick() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Private Sub CacheAuditTimer_Tick";
 //BA.debugLineNum = 144;BA.debugLine="cacheAuditTimer.Enabled = False";
_cacheaudittimer.setEnabled(__c.False);
 //BA.debugLineNum = 145;BA.debugLine="CallSubDelayed2(Starter, \"DispatchPlaybackHostEve";
__c.CallSubDelayed2(ba,(Object)(_starter.getObject()),"DispatchPlaybackHostEvent",(Object)("cache_audit_tick"));
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _cancelbreak() throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Public Sub CancelBreak";
 //BA.debugLineNum = 157;BA.debugLine="breakTimer.Enabled = False";
_breaktimer.setEnabled(__c.False);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _cancelcacheaudit() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Public Sub CancelCacheAudit";
 //BA.debugLineNum = 94;BA.debugLine="cacheAuditTimer.Enabled = False";
_cacheaudittimer.setEnabled(__c.False);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private directorTimer As Timer";
_directortimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 8;BA.debugLine="Private watchdogTimer As Timer";
_watchdogtimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 9;BA.debugLine="Private breakTimer As Timer";
_breaktimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 10;BA.debugLine="Private historyFlushTimer As Timer";
_historyflushtimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 11;BA.debugLine="Private traceUploadTimer As Timer";
_traceuploadtimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 12;BA.debugLine="Private offlineDataRefreshTimer As Timer";
_offlinedatarefreshtimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 13;BA.debugLine="Private localAdMinuteTimer As Timer";
_localadminutetimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 14;BA.debugLine="Private cacheAuditTimer As Timer";
_cacheaudittimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 15;BA.debugLine="Private initializedFlag As Boolean";
_initializedflag = false;
 //BA.debugLineNum = 16;BA.debugLine="Private coreTimersStarted As Boolean";
_coretimersstarted = false;
 //BA.debugLineNum = 17;BA.debugLine="Private pendingCommand As String";
_pendingcommand = "";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _configurebackgroundtimers(boolean _enablenetworktimers) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub ConfigureBackgroundTimers(enableNetwork";
 //BA.debugLineNum = 62;BA.debugLine="EnsureCoreInitialized";
_ensurecoreinitialized();
 //BA.debugLineNum = 63;BA.debugLine="historyFlushTimer.Enabled = False";
_historyflushtimer.setEnabled(__c.False);
 //BA.debugLineNum = 64;BA.debugLine="traceUploadTimer.Enabled = False";
_traceuploadtimer.setEnabled(__c.False);
 //BA.debugLineNum = 65;BA.debugLine="offlineDataRefreshTimer.Enabled = False";
_offlinedatarefreshtimer.setEnabled(__c.False);
 //BA.debugLineNum = 66;BA.debugLine="localAdMinuteTimer.Interval = 1000";
_localadminutetimer.setInterval((long) (1000));
 //BA.debugLineNum = 67;BA.debugLine="localAdMinuteTimer.Enabled = True";
_localadminutetimer.setEnabled(__c.True);
 //BA.debugLineNum = 68;BA.debugLine="If enableNetworkTimers = False Then Return";
if (_enablenetworktimers==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 69;BA.debugLine="offlineDataRefreshTimer.Interval = 5 * 60 * 1000";
_offlinedatarefreshtimer.setInterval((long) (5*60*1000));
 //BA.debugLineNum = 70;BA.debugLine="offlineDataRefreshTimer.Enabled = True";
_offlinedatarefreshtimer.setEnabled(__c.True);
 //BA.debugLineNum = 71;BA.debugLine="historyFlushTimer.Interval = 30000";
_historyflushtimer.setInterval((long) (30000));
 //BA.debugLineNum = 72;BA.debugLine="historyFlushTimer.Enabled = True";
_historyflushtimer.setEnabled(__c.True);
 //BA.debugLineNum = 73;BA.debugLine="traceUploadTimer.Interval = 60000";
_traceuploadtimer.setInterval((long) (60000));
 //BA.debugLineNum = 74;BA.debugLine="traceUploadTimer.Enabled = True";
_traceuploadtimer.setEnabled(__c.True);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _detachpage(Object _page) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub DetachPage(page As Object)";
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _directortimer_tick() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Private Sub DirectorTimer_Tick";
 //BA.debugLineNum = 120;BA.debugLine="CallSubDelayed2(Starter, \"DispatchPlaybackHostEve";
__c.CallSubDelayed2(ba,(Object)(_starter.getObject()),"DispatchPlaybackHostEvent",(Object)("playback_director_tick"));
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public String  _ensurecoreinitialized() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Private Sub EnsureCoreInitialized";
 //BA.debugLineNum = 25;BA.debugLine="If initializedFlag Then Return";
if (_initializedflag) { 
if (true) return "";};
 //BA.debugLineNum = 26;BA.debugLine="directorTimer.Initialize(\"DirectorTimer\", 250)";
_directortimer.Initialize(ba,"DirectorTimer",(long) (250));
 //BA.debugLineNum = 27;BA.debugLine="watchdogTimer.Initialize(\"WatchdogTimer\", 1000)";
_watchdogtimer.Initialize(ba,"WatchdogTimer",(long) (1000));
 //BA.debugLineNum = 28;BA.debugLine="breakTimer.Initialize(\"BreakTimer\", 1000)";
_breaktimer.Initialize(ba,"BreakTimer",(long) (1000));
 //BA.debugLineNum = 29;BA.debugLine="historyFlushTimer.Initialize(\"HistoryFlushTimer\",";
_historyflushtimer.Initialize(ba,"HistoryFlushTimer",(long) (30000));
 //BA.debugLineNum = 30;BA.debugLine="traceUploadTimer.Initialize(\"TraceUploadTimer\", 6";
_traceuploadtimer.Initialize(ba,"TraceUploadTimer",(long) (60000));
 //BA.debugLineNum = 31;BA.debugLine="offlineDataRefreshTimer.Initialize(\"OfflineDataRe";
_offlinedatarefreshtimer.Initialize(ba,"OfflineDataRefreshTimer",(long) (5*60*1000));
 //BA.debugLineNum = 32;BA.debugLine="localAdMinuteTimer.Initialize(\"LocalAdMinuteTimer";
_localadminutetimer.Initialize(ba,"LocalAdMinuteTimer",(long) (1000));
 //BA.debugLineNum = 33;BA.debugLine="cacheAuditTimer.Initialize(\"CacheAuditTimer\", 200";
_cacheaudittimer.Initialize(ba,"CacheAuditTimer",(long) (20000));
 //BA.debugLineNum = 34;BA.debugLine="initializedFlag = True";
_initializedflag = __c.True;
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _historyflushtimer_tick() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Private Sub HistoryFlushTimer_Tick";
 //BA.debugLineNum = 128;BA.debugLine="CallSubDelayed2(Starter, \"DispatchPlaybackHostEve";
__c.CallSubDelayed2(ba,(Object)(_starter.getObject()),"DispatchPlaybackHostEvent",(Object)("history_flush"));
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 21;BA.debugLine="EnsureCoreInitialized";
_ensurecoreinitialized();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _localadminutetimer_tick() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Private Sub LocalAdMinuteTimer_Tick";
 //BA.debugLineNum = 140;BA.debugLine="CallSubDelayed2(Starter, \"DispatchPlaybackHostEve";
__c.CallSubDelayed2(ba,(Object)(_starter.getObject()),"DispatchPlaybackHostEvent",(Object)("local_ad_minute"));
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _offlinedatarefreshtimer_tick() throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Private Sub OfflineDataRefreshTimer_Tick";
 //BA.debugLineNum = 136;BA.debugLine="CallSubDelayed2(Starter, \"DispatchPlaybackHostEve";
__c.CallSubDelayed2(ba,(Object)(_starter.getObject()),"DispatchPlaybackHostEvent",(Object)("offline_refresh"));
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _requestautostart() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub RequestAutoStart";
 //BA.debugLineNum = 98;BA.debugLine="pendingCommand = \"auto_start\"";
_pendingcommand = "auto_start";
 //BA.debugLineNum = 99;BA.debugLine="TryDispatchPendingCommand";
_trydispatchpendingcommand();
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _requestmanualstart() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub RequestManualStart";
 //BA.debugLineNum = 103;BA.debugLine="pendingCommand = \"manual_start\"";
_pendingcommand = "manual_start";
 //BA.debugLineNum = 104;BA.debugLine="TryDispatchPendingCommand";
_trydispatchpendingcommand();
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _requeststop() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub RequestStop";
 //BA.debugLineNum = 108;BA.debugLine="pendingCommand = \"stop\"";
_pendingcommand = "stop";
 //BA.debugLineNum = 109;BA.debugLine="TryDispatchPendingCommand";
_trydispatchpendingcommand();
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _schedulebreak(long _delayms) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Public Sub ScheduleBreak(delayMs As Long)";
 //BA.debugLineNum = 149;BA.debugLine="EnsureCoreInitialized";
_ensurecoreinitialized();
 //BA.debugLineNum = 150;BA.debugLine="breakTimer.Enabled = False";
_breaktimer.setEnabled(__c.False);
 //BA.debugLineNum = 151;BA.debugLine="If delayMs <= 0 Then Return";
if (_delayms<=0) { 
if (true) return "";};
 //BA.debugLineNum = 152;BA.debugLine="breakTimer.Interval = delayMs";
_breaktimer.setInterval(_delayms);
 //BA.debugLineNum = 153;BA.debugLine="breakTimer.Enabled = True";
_breaktimer.setEnabled(__c.True);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _schedulecacheaudit(int _delayms) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub ScheduleCacheAudit(delayMs As Int)";
 //BA.debugLineNum = 86;BA.debugLine="EnsureCoreInitialized";
_ensurecoreinitialized();
 //BA.debugLineNum = 87;BA.debugLine="cacheAuditTimer.Enabled = False";
_cacheaudittimer.setEnabled(__c.False);
 //BA.debugLineNum = 88;BA.debugLine="If delayMs <= 0 Then Return";
if (_delayms<=0) { 
if (true) return "";};
 //BA.debugLineNum = 89;BA.debugLine="cacheAuditTimer.Interval = delayMs";
_cacheaudittimer.setInterval((long) (_delayms));
 //BA.debugLineNum = 90;BA.debugLine="cacheAuditTimer.Enabled = True";
_cacheaudittimer.setEnabled(__c.True);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _startcoretimers() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub StartCoreTimers";
 //BA.debugLineNum = 47;BA.debugLine="EnsureCoreInitialized";
_ensurecoreinitialized();
 //BA.debugLineNum = 48;BA.debugLine="If coreTimersStarted Then Return";
if (_coretimersstarted) { 
if (true) return "";};
 //BA.debugLineNum = 49;BA.debugLine="directorTimer.Enabled = True";
_directortimer.setEnabled(__c.True);
 //BA.debugLineNum = 50;BA.debugLine="watchdogTimer.Enabled = True";
_watchdogtimer.setEnabled(__c.True);
 //BA.debugLineNum = 51;BA.debugLine="coreTimersStarted = True";
_coretimersstarted = __c.True;
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _stopbackgroundtimers() throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub StopBackgroundTimers";
 //BA.debugLineNum = 78;BA.debugLine="historyFlushTimer.Enabled = False";
_historyflushtimer.setEnabled(__c.False);
 //BA.debugLineNum = 79;BA.debugLine="traceUploadTimer.Enabled = False";
_traceuploadtimer.setEnabled(__c.False);
 //BA.debugLineNum = 80;BA.debugLine="offlineDataRefreshTimer.Enabled = False";
_offlinedatarefreshtimer.setEnabled(__c.False);
 //BA.debugLineNum = 81;BA.debugLine="localAdMinuteTimer.Enabled = False";
_localadminutetimer.setEnabled(__c.False);
 //BA.debugLineNum = 82;BA.debugLine="cacheAuditTimer.Enabled = False";
_cacheaudittimer.setEnabled(__c.False);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _stopcoretimers() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub StopCoreTimers";
 //BA.debugLineNum = 55;BA.debugLine="directorTimer.Enabled = False";
_directortimer.setEnabled(__c.False);
 //BA.debugLineNum = 56;BA.debugLine="watchdogTimer.Enabled = False";
_watchdogtimer.setEnabled(__c.False);
 //BA.debugLineNum = 57;BA.debugLine="breakTimer.Enabled = False";
_breaktimer.setEnabled(__c.False);
 //BA.debugLineNum = 58;BA.debugLine="coreTimersStarted = False";
_coretimersstarted = __c.False;
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _traceuploadtimer_tick() throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Private Sub TraceUploadTimer_Tick";
 //BA.debugLineNum = 132;BA.debugLine="CallSubDelayed2(Starter, \"DispatchPlaybackHostEve";
__c.CallSubDelayed2(ba,(Object)(_starter.getObject()),"DispatchPlaybackHostEvent",(Object)("trace_upload"));
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _trydispatchpendingcommand() throws Exception{
String _commandname = "";
 //BA.debugLineNum = 112;BA.debugLine="Private Sub TryDispatchPendingCommand";
 //BA.debugLineNum = 113;BA.debugLine="If pendingCommand = \"\" Then Return";
if ((_pendingcommand).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 114;BA.debugLine="Dim commandName As String = pendingCommand";
_commandname = _pendingcommand;
 //BA.debugLineNum = 115;BA.debugLine="pendingCommand = \"\"";
_pendingcommand = "";
 //BA.debugLineNum = 116;BA.debugLine="CallSubDelayed2(Starter, \"DispatchPlaybackHostEve";
__c.CallSubDelayed2(ba,(Object)(_starter.getObject()),"DispatchPlaybackHostEvent",(Object)(_commandname));
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _watchdogtimer_tick() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Private Sub WatchdogTimer_Tick";
 //BA.debugLineNum = 124;BA.debugLine="CallSubDelayed2(Starter, \"DispatchPlaybackHostEve";
__c.CallSubDelayed2(ba,(Object)(_starter.getObject()),"DispatchPlaybackHostEvent",(Object)("playback_watchdog_tick"));
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
