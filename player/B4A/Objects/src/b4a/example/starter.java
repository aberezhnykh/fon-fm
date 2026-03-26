package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, BA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new BA(this, null, null, "b4a.example", "b4a.example.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			if (ServiceHelper.StarterHelper.runWaitForLayouts() == false) {
                BA.LogInfo("stopping spontaneous created service");
                stopSelf();
            }
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }

	public void onTimeout(int startId) {
        BA.LogInfo("** Service (starter) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}public anywheresoftware.b4a.keywords.Common __c = null;
public static String _pendingupdatedir = "";
public static String _pendingupdatefile = "";
public static b4a.example.playbackhost _playbackenginehost = null;
public static Object _playbackpage = null;
public static boolean _playbackpageattached = false;
public static anywheresoftware.b4a.objects.collections.Map _publishedplaybackstate = null;
public static anywheresoftware.b4a.objects.collections.List _pendingplaybackevents = null;
public static String _action_boot_completed = "";
public static String _action_locked_boot_completed = "";
public static String _action_my_package_replaced = "";
public static String _action_package_replaced = "";
public b4a.example.main _main = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 54;BA.debugLine="Log(\"Starter.Application_Error: \" & Error.Message";
anywheresoftware.b4a.keywords.Common.LogImpl("332440321","Starter.Application_Error: "+_error.getMessage(),0);
 //BA.debugLineNum = 55;BA.debugLine="Log(StackTrace)";
anywheresoftware.b4a.keywords.Common.LogImpl("332440322",_stacktrace,0);
 //BA.debugLineNum = 56;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return false;
}
public static String  _attachplaybackpage(Object _page) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub AttachPlaybackPage(page As Object)";
 //BA.debugLineNum = 75;BA.debugLine="RegisterPlaybackPage(page)";
_registerplaybackpage(_page);
 //BA.debugLineNum = 76;BA.debugLine="PlaybackEngineHost.AttachPage(page)";
_playbackenginehost._attachpage /*String*/ (_page);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public static String  _cancelplaybackbreak() throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Public Sub CancelPlaybackBreak";
 //BA.debugLineNum = 204;BA.debugLine="PlaybackEngineHost.CancelBreak";
_playbackenginehost._cancelbreak /*String*/ ();
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public static String  _cancelplaybackcacheaudit() throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Public Sub CancelPlaybackCacheAudit";
 //BA.debugLineNum = 212;BA.debugLine="PlaybackEngineHost.CancelCacheAudit";
_playbackenginehost._cancelcacheaudit /*String*/ ();
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public static String  _configureplaybackbackgroundtimers(boolean _enablenetworktimers) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Public Sub ConfigurePlaybackBackgroundTimers(enabl";
 //BA.debugLineNum = 192;BA.debugLine="PlaybackEngineHost.ConfigureBackgroundTimers(enab";
_playbackenginehost._configurebackgroundtimers /*String*/ (_enablenetworktimers);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public static String  _detachplaybackpage(Object _page) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub DetachPlaybackPage(page As Object)";
 //BA.debugLineNum = 80;BA.debugLine="PlaybackEngineHost.DetachPage(page)";
_playbackenginehost._detachpage /*String*/ (_page);
 //BA.debugLineNum = 81;BA.debugLine="UnregisterPlaybackPage(page)";
_unregisterplaybackpage(_page);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static String  _dispatchplaybackhostevent(String _eventname) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Public Sub DispatchPlaybackHostEvent(eventName As";
 //BA.debugLineNum = 94;BA.debugLine="If playbackPageAttached = False Then";
if (_playbackpageattached==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 95;BA.debugLine="EnqueuePendingPlaybackEvent(eventName)";
_enqueuependingplaybackevent(_eventname);
 //BA.debugLineNum = 96;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 98;BA.debugLine="DispatchPlaybackPageEvent(eventName)";
_dispatchplaybackpageevent(_eventname);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public static String  _dispatchplaybackpagecommand(String _eventname) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Private Sub DispatchPlaybackPageCommand(eventName";
 //BA.debugLineNum = 132;BA.debugLine="Select eventName";
switch (BA.switchObjectToInt(_eventname,"auto_start","manual_start","stop")) {
case 0: {
 //BA.debugLineNum = 134;BA.debugLine="CallSubDelayed(playbackPage, \"Host_CommandAutoS";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,_playbackpage,"Host_CommandAutoStart");
 break; }
case 1: {
 //BA.debugLineNum = 136;BA.debugLine="CallSubDelayed(playbackPage, \"Host_CommandManua";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,_playbackpage,"Host_CommandManualStart");
 break; }
case 2: {
 //BA.debugLineNum = 138;BA.debugLine="CallSubDelayed(playbackPage, \"Host_CommandStop\"";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,_playbackpage,"Host_CommandStop");
 break; }
}
;
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public static String  _dispatchplaybackpageevent(String _eventname) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Private Sub DispatchPlaybackPageEvent(eventName As";
 //BA.debugLineNum = 123;BA.debugLine="If playbackPageAttached = False Then Return";
if (_playbackpageattached==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
 //BA.debugLineNum = 124;BA.debugLine="If IsPlaybackCommandEvent(eventName) Then";
if (_isplaybackcommandevent(_eventname)) { 
 //BA.debugLineNum = 125;BA.debugLine="DispatchPlaybackPageCommand(eventName)";
_dispatchplaybackpagecommand(_eventname);
 //BA.debugLineNum = 126;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 128;BA.debugLine="DispatchPlaybackPageTimer(eventName)";
_dispatchplaybackpagetimer(_eventname);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public static String  _dispatchplaybackpagetimer(String _eventname) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Private Sub DispatchPlaybackPageTimer(eventName As";
 //BA.debugLineNum = 143;BA.debugLine="Select eventName";
switch (BA.switchObjectToInt(_eventname,"playback_watchdog_tick","playback_director_tick","break_tick","history_flush","trace_upload","offline_refresh","local_ad_minute","cache_audit_tick")) {
case 0: {
 //BA.debugLineNum = 145;BA.debugLine="CallSubDelayed(playbackPage, \"Host_TimerPlaybac";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,_playbackpage,"Host_TimerPlaybackWatchdogTick");
 break; }
case 1: {
 //BA.debugLineNum = 147;BA.debugLine="CallSubDelayed(playbackPage, \"Host_TimerPlaybac";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,_playbackpage,"Host_TimerPlaybackDirectorTick");
 break; }
case 2: {
 //BA.debugLineNum = 149;BA.debugLine="CallSubDelayed(playbackPage, \"Host_TimerBreakTi";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,_playbackpage,"Host_TimerBreakTick");
 break; }
case 3: {
 //BA.debugLineNum = 151;BA.debugLine="CallSubDelayed(playbackPage, \"Host_TimerHistory";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,_playbackpage,"Host_TimerHistoryFlush");
 break; }
case 4: {
 //BA.debugLineNum = 153;BA.debugLine="CallSubDelayed(playbackPage, \"Host_TimerTraceUp";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,_playbackpage,"Host_TimerTraceUpload");
 break; }
case 5: {
 //BA.debugLineNum = 155;BA.debugLine="CallSubDelayed(playbackPage, \"Host_TimerOffline";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,_playbackpage,"Host_TimerOfflineRefresh");
 break; }
case 6: {
 //BA.debugLineNum = 157;BA.debugLine="CallSubDelayed(playbackPage, \"Host_TimerLocalAd";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,_playbackpage,"Host_TimerLocalAdMinute");
 break; }
case 7: {
 //BA.debugLineNum = 159;BA.debugLine="CallSubDelayed(playbackPage, \"Host_TimerCacheAu";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,_playbackpage,"Host_TimerCacheAudit");
 break; }
}
;
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public static String  _enqueuependingplaybackevent(String _eventname) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Private Sub EnqueuePendingPlaybackEvent(eventName";
 //BA.debugLineNum = 102;BA.debugLine="If pendingPlaybackEvents.IsInitialized = False Th";
if (_pendingplaybackevents.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_pendingplaybackevents.Initialize();};
 //BA.debugLineNum = 103;BA.debugLine="If eventName = \"\" Then Return";
if ((_eventname).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 104;BA.debugLine="If IsCoalescedPlaybackEvent(eventName) And pendin";
if (_iscoalescedplaybackevent(_eventname) && _pendingplaybackevents.IndexOf((Object)(_eventname))>-1) { 
if (true) return "";};
 //BA.debugLineNum = 105;BA.debugLine="pendingPlaybackEvents.Add(eventName)";
_pendingplaybackevents.Add((Object)(_eventname));
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static String  _flushpendingplaybackevents() throws Exception{
anywheresoftware.b4a.objects.collections.List _eventscopy = null;
String _eventname = "";
 //BA.debugLineNum = 108;BA.debugLine="Private Sub FlushPendingPlaybackEvents";
 //BA.debugLineNum = 109;BA.debugLine="If playbackPageAttached = False Then Return";
if (_playbackpageattached==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
 //BA.debugLineNum = 110;BA.debugLine="If pendingPlaybackEvents.IsInitialized = False Or";
if (_pendingplaybackevents.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _pendingplaybackevents.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 111;BA.debugLine="Dim eventsCopy As List";
_eventscopy = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 112;BA.debugLine="eventsCopy.Initialize";
_eventscopy.Initialize();
 //BA.debugLineNum = 113;BA.debugLine="For Each eventName As String In pendingPlaybackEv";
{
final anywheresoftware.b4a.BA.IterableList group5 = _pendingplaybackevents;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_eventname = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 114;BA.debugLine="eventsCopy.Add(eventName)";
_eventscopy.Add((Object)(_eventname));
 }
};
 //BA.debugLineNum = 116;BA.debugLine="pendingPlaybackEvents.Clear";
_pendingplaybackevents.Clear();
 //BA.debugLineNum = 117;BA.debugLine="For Each eventName As String In eventsCopy";
{
final anywheresoftware.b4a.BA.IterableList group9 = _eventscopy;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_eventname = BA.ObjectToString(group9.Get(index9));
 //BA.debugLineNum = 118;BA.debugLine="DispatchPlaybackPageEvent(eventName)";
_dispatchplaybackpageevent(_eventname);
 }
};
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _getpublishedplaybackstate() throws Exception{
anywheresoftware.b4a.objects.collections.Map _statebundle = null;
String _key = "";
 //BA.debugLineNum = 224;BA.debugLine="Public Sub GetPublishedPlaybackState As Map";
 //BA.debugLineNum = 225;BA.debugLine="Dim stateBundle As Map";
_statebundle = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 226;BA.debugLine="stateBundle.Initialize";
_statebundle.Initialize();
 //BA.debugLineNum = 227;BA.debugLine="If publishedPlaybackState.IsInitialized = False T";
if (_publishedplaybackstate.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return _statebundle;};
 //BA.debugLineNum = 228;BA.debugLine="For Each key As String In publishedPlaybackState.";
{
final anywheresoftware.b4a.BA.IterableList group4 = _publishedplaybackstate.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 229;BA.debugLine="stateBundle.Put(key, publishedPlaybackState.Get(";
_statebundle.Put((Object)(_key),_publishedplaybackstate.Get((Object)(_key)));
 }
};
 //BA.debugLineNum = 231;BA.debugLine="Return stateBundle";
if (true) return _statebundle;
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public static boolean  _hasplaybackpage() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub HasPlaybackPage As Boolean";
 //BA.debugLineNum = 90;BA.debugLine="Return playbackPageAttached";
if (true) return _playbackpageattached;
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return false;
}
public static boolean  _iscoalescedplaybackevent(String _eventname) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Private Sub IsCoalescedPlaybackEvent(eventName As";
 //BA.debugLineNum = 164;BA.debugLine="Select eventName";
switch (BA.switchObjectToInt(_eventname,"playback_director_tick","playback_watchdog_tick","history_flush","trace_upload","offline_refresh","local_ad_minute","cache_audit_tick","break_tick")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 166;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
}
;
 //BA.debugLineNum = 168;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return false;
}
public static boolean  _isplaybackcommandevent(String _eventname) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Private Sub IsPlaybackCommandEvent(eventName As St";
 //BA.debugLineNum = 172;BA.debugLine="Select eventName";
switch (BA.switchObjectToInt(_eventname,"auto_start","manual_start","stop")) {
case 0: 
case 1: 
case 2: {
 //BA.debugLineNum = 174;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
}
;
 //BA.debugLineNum = 176;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Public PendingUpdateDir As String";
_pendingupdatedir = "";
 //BA.debugLineNum = 12;BA.debugLine="Public PendingUpdateFile As String";
_pendingupdatefile = "";
 //BA.debugLineNum = 13;BA.debugLine="Public PlaybackEngineHost As PlaybackHost";
_playbackenginehost = new b4a.example.playbackhost();
 //BA.debugLineNum = 14;BA.debugLine="Private playbackPage As Object";
_playbackpage = new Object();
 //BA.debugLineNum = 15;BA.debugLine="Private playbackPageAttached As Boolean";
_playbackpageattached = false;
 //BA.debugLineNum = 16;BA.debugLine="Private publishedPlaybackState As Map";
_publishedplaybackstate = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 17;BA.debugLine="Private pendingPlaybackEvents As List";
_pendingplaybackevents = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 18;BA.debugLine="Private Const ACTION_BOOT_COMPLETED As String = \"";
_action_boot_completed = "android.intent.action.BOOT_COMPLETED";
 //BA.debugLineNum = 19;BA.debugLine="Private Const ACTION_LOCKED_BOOT_COMPLETED As Str";
_action_locked_boot_completed = "android.intent.action.LOCKED_BOOT_COMPLETED";
 //BA.debugLineNum = 20;BA.debugLine="Private Const ACTION_MY_PACKAGE_REPLACED As Strin";
_action_my_package_replaced = "android.intent.action.MY_PACKAGE_REPLACED";
 //BA.debugLineNum = 21;BA.debugLine="Private Const ACTION_PACKAGE_REPLACED As String =";
_action_package_replaced = "android.intent.action.PACKAGE_REPLACED";
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static String  _queueappupdateinstall(String _updatedir,String _updatefile) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub QueueAppUpdateInstall(updateDir As Stri";
 //BA.debugLineNum = 63;BA.debugLine="PendingUpdateDir = updateDir";
_pendingupdatedir = _updatedir;
 //BA.debugLineNum = 64;BA.debugLine="PendingUpdateFile = updateFile";
_pendingupdatefile = _updatefile;
 //BA.debugLineNum = 65;BA.debugLine="StartService(Me)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,starter.getObject());
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public static String  _registerplaybackpage(Object _page) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub RegisterPlaybackPage(page As Object)";
 //BA.debugLineNum = 69;BA.debugLine="playbackPage = page";
_playbackpage = _page;
 //BA.debugLineNum = 70;BA.debugLine="playbackPageAttached = True";
_playbackpageattached = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 71;BA.debugLine="FlushPendingPlaybackEvents";
_flushpendingplaybackevents();
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public static String  _requestplaybackautostart() throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Public Sub RequestPlaybackAutoStart";
 //BA.debugLineNum = 180;BA.debugLine="PlaybackEngineHost.RequestAutoStart";
_playbackenginehost._requestautostart /*String*/ ();
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public static String  _requestplaybackmanualstart() throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Public Sub RequestPlaybackManualStart";
 //BA.debugLineNum = 184;BA.debugLine="PlaybackEngineHost.RequestManualStart";
_playbackenginehost._requestmanualstart /*String*/ ();
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public static String  _requestplaybackstop() throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Public Sub RequestPlaybackStop";
 //BA.debugLineNum = 188;BA.debugLine="PlaybackEngineHost.RequestStop";
_playbackenginehost._requeststop /*String*/ ();
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public static String  _resolveintentaction(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Private Sub ResolveIntentAction(startingIntent As";
 //BA.debugLineNum = 235;BA.debugLine="If startingIntent.IsInitialized = False Then Retu";
if (_startingintent.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
 //BA.debugLineNum = 236;BA.debugLine="If startingIntent.Action = Null Then Return \"\"";
if (_startingintent.getAction()== null) { 
if (true) return "";};
 //BA.debugLineNum = 237;BA.debugLine="Return startingIntent.Action";
if (true) return _startingintent.getAction();
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public static String  _scheduleplaybackbreak(long _delayms) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Public Sub SchedulePlaybackBreak(delayMs As Long)";
 //BA.debugLineNum = 200;BA.debugLine="PlaybackEngineHost.ScheduleBreak(delayMs)";
_playbackenginehost._schedulebreak /*String*/ (_delayms);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public static String  _scheduleplaybackcacheaudit(int _delayms) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Public Sub SchedulePlaybackCacheAudit(delayMs As I";
 //BA.debugLineNum = 208;BA.debugLine="PlaybackEngineHost.ScheduleCacheAudit(delayMs)";
_playbackenginehost._schedulecacheaudit /*String*/ (_delayms);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 27;BA.debugLine="PlaybackEngineHost.Initialize";
_playbackenginehost._initialize /*String*/ (processBA);
 //BA.debugLineNum = 28;BA.debugLine="If publishedPlaybackState.IsInitialized = False T";
if (_publishedplaybackstate.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_publishedplaybackstate.Initialize();};
 //BA.debugLineNum = 29;BA.debugLine="If pendingPlaybackEvents.IsInitialized = False Th";
if (_pendingplaybackevents.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_pendingplaybackevents.Initialize();};
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
String _action = "";
 //BA.debugLineNum = 32;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
 //BA.debugLineNum = 33;BA.debugLine="PlaybackEngineHost.Initialize";
_playbackenginehost._initialize /*String*/ (processBA);
 //BA.debugLineNum = 34;BA.debugLine="Dim action As String = ResolveIntentAction(Starti";
_action = _resolveintentaction(_startingintent);
 //BA.debugLineNum = 35;BA.debugLine="If action = ACTION_BOOT_COMPLETED Or action = ACT";
if ((_action).equals(_action_boot_completed) || (_action).equals(_action_locked_boot_completed)) { 
 //BA.debugLineNum = 36;BA.debugLine="RequestPlaybackAutoStart";
_requestplaybackautostart();
 //BA.debugLineNum = 37;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 }else if((_action).equals(_action_my_package_replaced) || (_action).equals(_action_package_replaced)) { 
 //BA.debugLineNum = 39;BA.debugLine="RequestPlaybackAutoStart";
_requestplaybackautostart();
 //BA.debugLineNum = 40;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 }else if((_pendingupdatefile).equals("") == false) { 
 };
 //BA.debugLineNum = 45;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
mostCurrent._service.StopAutomaticForeground();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub Service_TaskRemoved";
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public static String  _stopplaybackbackgroundtimers() throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Public Sub StopPlaybackBackgroundTimers";
 //BA.debugLineNum = 196;BA.debugLine="PlaybackEngineHost.StopBackgroundTimers";
_playbackenginehost._stopbackgroundtimers /*String*/ ();
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public static String  _unregisterplaybackpage(Object _page) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Public Sub UnregisterPlaybackPage(page As Object)";
 //BA.debugLineNum = 85;BA.debugLine="playbackPage = Null";
_playbackpage = anywheresoftware.b4a.keywords.Common.Null;
 //BA.debugLineNum = 86;BA.debugLine="playbackPageAttached = False";
_playbackpageattached = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public static String  _updatepublishedplaybackstate(anywheresoftware.b4a.objects.collections.Map _statebundle) throws Exception{
String _key = "";
 //BA.debugLineNum = 215;BA.debugLine="Public Sub UpdatePublishedPlaybackState(stateBundl";
 //BA.debugLineNum = 216;BA.debugLine="If publishedPlaybackState.IsInitialized = False T";
if (_publishedplaybackstate.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_publishedplaybackstate.Initialize();};
 //BA.debugLineNum = 217;BA.debugLine="publishedPlaybackState.Clear";
_publishedplaybackstate.Clear();
 //BA.debugLineNum = 218;BA.debugLine="If stateBundle.IsInitialized = False Then Return";
if (_statebundle.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
 //BA.debugLineNum = 219;BA.debugLine="For Each key As String In stateBundle.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _statebundle.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 220;BA.debugLine="publishedPlaybackState.Put(key, stateBundle.Get(";
_publishedplaybackstate.Put((Object)(_key),_statebundle.Get((Object)(_key)));
 }
};
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
}
