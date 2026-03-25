package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class autonomouscachemanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.autonomouscachemanager", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.autonomouscachemanager.class).invoke(this, new Object[] {null});
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
public b4j.example.keyvaluestore _kvs = null;
public b4j.example.offlinestore _offlinestoreservice = null;
public b4j.example.dataplaybackresolver _dataresolverservice = null;
public b4j.example.mediacache _mediacacheservice = null;
public Object _tracetarget = null;
public String _tracesubname = "";
public anywheresoftware.b4a.objects.Timer _workertimer = null;
public boolean _isrunning = false;
public boolean _stepinprogress = false;
public int _default_tick_interval_ms = 0;
public long _default_download_cooldown_ms = 0L;
public long _default_failure_cooldown_ms = 0L;
public long _default_prune_cooldown_ms = 0L;
public int _default_current_slot_min_reserve = 0;
public int _default_next_slot_min_reserve = 0;
public int _default_per_playlist_min_reserve = 0;
public int _default_max_downloads_per_step = 0;
public int _tickintervalms = 0;
public long _downloadcooldownms = 0L;
public long _failurecooldownms = 0L;
public long _prunecooldownms = 0L;
public int _currentslotminreserve = 0;
public int _nextslotminreserve = 0;
public int _perplaylistminreserve = 0;
public int _maxdownloadsperstep = 0;
public long _lastsuccessfuldownloadat = 0L;
public long _lastfailureat = 0L;
public long _lastpruneat = 0L;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.BA _ba,b4j.example.keyvaluestore _storagevalue,b4j.example.offlinestore _offlinestorevalue,b4j.example.dataplaybackresolver _dataresolvervalue,b4j.example.mediacache _mediacachevalue,Object _tracetargetvalue,String _tracesubnamevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagevalue,_offlinestorevalue,_dataresolvervalue,_mediacachevalue,_tracetargetvalue,_tracesubnamevalue}));}
RDebugUtils.currentLine=88014848;
 //BA.debugLineNum = 88014848;BA.debugLine="Public Sub Initialize( _ 	storageValue As KeyValue";
RDebugUtils.currentLine=88014856;
 //BA.debugLineNum = 88014856;BA.debugLine="kvs = storageValue";
__ref._kvs /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=88014857;
 //BA.debugLineNum = 88014857;BA.debugLine="offlineStoreService = offlineStoreValue";
__ref._offlinestoreservice /*b4j.example.offlinestore*/  = _offlinestorevalue;
RDebugUtils.currentLine=88014858;
 //BA.debugLineNum = 88014858;BA.debugLine="dataResolverService = dataResolverValue";
__ref._dataresolverservice /*b4j.example.dataplaybackresolver*/  = _dataresolvervalue;
RDebugUtils.currentLine=88014859;
 //BA.debugLineNum = 88014859;BA.debugLine="mediaCacheService = mediaCacheValue";
__ref._mediacacheservice /*b4j.example.mediacache*/  = _mediacachevalue;
RDebugUtils.currentLine=88014860;
 //BA.debugLineNum = 88014860;BA.debugLine="traceTarget = traceTargetValue";
__ref._tracetarget /*Object*/  = _tracetargetvalue;
RDebugUtils.currentLine=88014861;
 //BA.debugLineNum = 88014861;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=88014863;
 //BA.debugLineNum = 88014863;BA.debugLine="workerTimer.Initialize(\"workerTimer\", tickInterva";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"workerTimer",(long) (__ref._tickintervalms /*int*/ ));
RDebugUtils.currentLine=88014864;
 //BA.debugLineNum = 88014864;BA.debugLine="End Sub";
return "";
}
public String  _configure(b4j.example.autonomouscachemanager __ref,int _tickms,int _currentreserve,int _nextreserve,int _perplaylistreserve,int _maxdownloads) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "configure", false))
	 {return ((String) Debug.delegate(ba, "configure", new Object[] {_tickms,_currentreserve,_nextreserve,_perplaylistreserve,_maxdownloads}));}
RDebugUtils.currentLine=88080384;
 //BA.debugLineNum = 88080384;BA.debugLine="Public Sub Configure( _ 	tickMs As Int, _ 	current";
RDebugUtils.currentLine=88080391;
 //BA.debugLineNum = 88080391;BA.debugLine="If tickMs > 0 Then tickIntervalMs = tickMs";
if (_tickms>0) { 
__ref._tickintervalms /*int*/  = _tickms;};
RDebugUtils.currentLine=88080392;
 //BA.debugLineNum = 88080392;BA.debugLine="If currentReserve >= 0 Then currentSlotMinReserve";
if (_currentreserve>=0) { 
__ref._currentslotminreserve /*int*/  = _currentreserve;};
RDebugUtils.currentLine=88080393;
 //BA.debugLineNum = 88080393;BA.debugLine="If nextReserve >= 0 Then nextSlotMinReserve = nex";
if (_nextreserve>=0) { 
__ref._nextslotminreserve /*int*/  = _nextreserve;};
RDebugUtils.currentLine=88080394;
 //BA.debugLineNum = 88080394;BA.debugLine="If perPlaylistReserve >= 0 Then perPlaylistMinRes";
if (_perplaylistreserve>=0) { 
__ref._perplaylistminreserve /*int*/  = _perplaylistreserve;};
RDebugUtils.currentLine=88080395;
 //BA.debugLineNum = 88080395;BA.debugLine="If maxDownloads > 0 Then maxDownloadsPerStep = ma";
if (_maxdownloads>0) { 
__ref._maxdownloadsperstep /*int*/  = _maxdownloads;};
RDebugUtils.currentLine=88080397;
 //BA.debugLineNum = 88080397;BA.debugLine="workerTimer.Interval = tickIntervalMs";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._tickintervalms /*int*/ ));
RDebugUtils.currentLine=88080398;
 //BA.debugLineNum = 88080398;BA.debugLine="End Sub";
return "";
}
public String  _setcooldowns(b4j.example.autonomouscachemanager __ref,long _downloadcooldownvalue,long _failurecooldownvalue,long _prunecooldownvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "setcooldowns", false))
	 {return ((String) Debug.delegate(ba, "setcooldowns", new Object[] {_downloadcooldownvalue,_failurecooldownvalue,_prunecooldownvalue}));}
RDebugUtils.currentLine=88145920;
 //BA.debugLineNum = 88145920;BA.debugLine="Public Sub SetCooldowns(downloadCooldownValue As L";
RDebugUtils.currentLine=88145921;
 //BA.debugLineNum = 88145921;BA.debugLine="If downloadCooldownValue >= 0 Then downloadCooldo";
if (_downloadcooldownvalue>=0) { 
__ref._downloadcooldownms /*long*/  = _downloadcooldownvalue;};
RDebugUtils.currentLine=88145922;
 //BA.debugLineNum = 88145922;BA.debugLine="If failureCooldownValue >= 0 Then failureCooldown";
if (_failurecooldownvalue>=0) { 
__ref._failurecooldownms /*long*/  = _failurecooldownvalue;};
RDebugUtils.currentLine=88145923;
 //BA.debugLineNum = 88145923;BA.debugLine="If pruneCooldownValue >= 0 Then pruneCooldownMs =";
if (_prunecooldownvalue>=0) { 
__ref._prunecooldownms /*long*/  = _prunecooldownvalue;};
RDebugUtils.currentLine=88145924;
 //BA.debugLineNum = 88145924;BA.debugLine="End Sub";
return "";
}
public String  _start(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "start", false))
	 {return ((String) Debug.delegate(ba, "start", null));}
RDebugUtils.currentLine=88211456;
 //BA.debugLineNum = 88211456;BA.debugLine="Public Sub Start";
RDebugUtils.currentLine=88211457;
 //BA.debugLineNum = 88211457;BA.debugLine="isRunning = True";
__ref._isrunning /*boolean*/  = __c.True;
RDebugUtils.currentLine=88211458;
 //BA.debugLineNum = 88211458;BA.debugLine="workerTimer.Interval = tickIntervalMs";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._tickintervalms /*int*/ ));
RDebugUtils.currentLine=88211459;
 //BA.debugLineNum = 88211459;BA.debugLine="workerTimer.Enabled = True";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=88211460;
 //BA.debugLineNum = 88211460;BA.debugLine="Trace(\"autocache manager started tickMs=\" & tickI";
__ref._trace /*String*/ (null,"autocache manager started tickMs="+BA.NumberToString(__ref._tickintervalms /*int*/ ));
RDebugUtils.currentLine=88211461;
 //BA.debugLineNum = 88211461;BA.debugLine="End Sub";
return "";
}
public String  _addslotplaylistdescriptors(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.List _result,anywheresoftware.b4a.objects.collections.Map _seen,anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "addslotplaylistdescriptors", false))
	 {return ((String) Debug.delegate(ba, "addslotplaylistdescriptors", new Object[] {_result,_seen,_slot}));}
anywheresoftware.b4a.objects.collections.List _playlists = null;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
String _playlistid = "";
RDebugUtils.currentLine=88866816;
 //BA.debugLineNum = 88866816;BA.debugLine="Private Sub AddSlotPlaylistDescriptors(result As L";
RDebugUtils.currentLine=88866817;
 //BA.debugLineNum = 88866817;BA.debugLine="If slot.IsInitialized = False Or slot.Size = 0 Th";
if (_slot.IsInitialized()==__c.False || _slot.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=88866819;
 //BA.debugLineNum = 88866819;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = __ref._getslotplaylists /*anywheresoftware.b4a.objects.collections.List*/ (null,_slot);
RDebugUtils.currentLine=88866820;
 //BA.debugLineNum = 88866820;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=88866822;
 //BA.debugLineNum = 88866822;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group4 = _playlists;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_playlistobject = group4.Get(index4);
RDebugUtils.currentLine=88866823;
 //BA.debugLineNum = 88866823;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=88866825;
 //BA.debugLineNum = 88866825;BA.debugLine="Dim descriptor As Map = playlistObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=88866826;
 //BA.debugLineNum = 88866826;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = __ref._getplaylistidfromdescriptor /*String*/ (null,_descriptor);
RDebugUtils.currentLine=88866827;
 //BA.debugLineNum = 88866827;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=88866828;
 //BA.debugLineNum = 88866828;BA.debugLine="If seen.ContainsKey(playlistId) Then Continue";
if (_seen.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
RDebugUtils.currentLine=88866830;
 //BA.debugLineNum = 88866830;BA.debugLine="seen.Put(playlistId, True)";
_seen.Put((Object)(_playlistid),(Object)(__c.True));
RDebugUtils.currentLine=88866831;
 //BA.debugLineNum = 88866831;BA.debugLine="result.Add(CloneMap(descriptor))";
_result.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_descriptor).getObject()));
 }
};
RDebugUtils.currentLine=88866833;
 //BA.debugLineNum = 88866833;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getslotplaylists(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "getslotplaylists", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getslotplaylists", new Object[] {_slot}));}
anywheresoftware.b4a.objects.collections.List _emptylist = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
anywheresoftware.b4a.objects.collections.List _emptyresult = null;
RDebugUtils.currentLine=89325568;
 //BA.debugLineNum = 89325568;BA.debugLine="Private Sub GetSlotPlaylists(slot As Map) As List";
RDebugUtils.currentLine=89325569;
 //BA.debugLineNum = 89325569;BA.debugLine="If slot.IsInitialized = False Then";
if (_slot.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=89325570;
 //BA.debugLineNum = 89325570;BA.debugLine="Dim emptyList As List";
_emptylist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89325571;
 //BA.debugLineNum = 89325571;BA.debugLine="emptyList.Initialize";
_emptylist.Initialize();
RDebugUtils.currentLine=89325572;
 //BA.debugLineNum = 89325572;BA.debugLine="Return emptyList";
if (true) return _emptylist;
 };
RDebugUtils.currentLine=89325575;
 //BA.debugLineNum = 89325575;BA.debugLine="Dim playlists As List = slot.GetDefault(\"playlist";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=89325576;
 //BA.debugLineNum = 89325576;BA.debugLine="If playlists.IsInitialized Then Return playlists";
if (_playlists.IsInitialized()) { 
if (true) return _playlists;};
RDebugUtils.currentLine=89325578;
 //BA.debugLineNum = 89325578;BA.debugLine="playlists = slot.GetDefault(\"playlist_descriptors";
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slot.GetDefault((Object)("playlist_descriptors"),__c.Null)));
RDebugUtils.currentLine=89325579;
 //BA.debugLineNum = 89325579;BA.debugLine="If playlists.IsInitialized Then Return playlists";
if (_playlists.IsInitialized()) { 
if (true) return _playlists;};
RDebugUtils.currentLine=89325581;
 //BA.debugLineNum = 89325581;BA.debugLine="Dim emptyResult As List";
_emptyresult = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89325582;
 //BA.debugLineNum = 89325582;BA.debugLine="emptyResult.Initialize";
_emptyresult.Initialize();
RDebugUtils.currentLine=89325583;
 //BA.debugLineNum = 89325583;BA.debugLine="Return emptyResult";
if (true) return _emptyresult;
RDebugUtils.currentLine=89325584;
 //BA.debugLineNum = 89325584;BA.debugLine="End Sub";
return null;
}
public String  _getplaylistidfromdescriptor(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _descriptor) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "getplaylistidfromdescriptor", false))
	 {return ((String) Debug.delegate(ba, "getplaylistidfromdescriptor", new Object[] {_descriptor}));}
String _playlistid = "";
RDebugUtils.currentLine=89456640;
 //BA.debugLineNum = 89456640;BA.debugLine="Private Sub GetPlaylistIdFromDescriptor(descriptor";
RDebugUtils.currentLine=89456641;
 //BA.debugLineNum = 89456641;BA.debugLine="If descriptor.IsInitialized = False Then Return \"";
if (_descriptor.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=89456643;
 //BA.debugLineNum = 89456643;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=89456644;
 //BA.debugLineNum = 89456644;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
if ((_playlistid).equals("") == false) { 
if (true) return _playlistid;};
RDebugUtils.currentLine=89456646;
 //BA.debugLineNum = 89456646;BA.debugLine="playlistId = descriptor.GetDefault(\"playlist_id\",";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=89456647;
 //BA.debugLineNum = 89456647;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
if ((_playlistid).equals("") == false) { 
if (true) return _playlistid;};
RDebugUtils.currentLine=89456649;
 //BA.debugLineNum = 89456649;BA.debugLine="playlistId = descriptor.GetDefault(\"playlistId\",";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("playlistId"),(Object)("")));
RDebugUtils.currentLine=89456650;
 //BA.debugLineNum = 89456650;BA.debugLine="Return playlistId";
if (true) return _playlistid;
RDebugUtils.currentLine=89456651;
 //BA.debugLineNum = 89456651;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
Object _key = null;
RDebugUtils.currentLine=89915392;
 //BA.debugLineNum = 89915392;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=89915393;
 //BA.debugLineNum = 89915393;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=89915394;
 //BA.debugLineNum = 89915394;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=89915396;
 //BA.debugLineNum = 89915396;BA.debugLine="If sourceMap.IsInitialized = False Then Return re";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _result;};
RDebugUtils.currentLine=89915398;
 //BA.debugLineNum = 89915398;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=89915399;
 //BA.debugLineNum = 89915399;BA.debugLine="result.Put(key, sourceMap.Get(key))";
_result.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=89915402;
 //BA.debugLineNum = 89915402;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=89915403;
 //BA.debugLineNum = 89915403;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _builddesiredtrackitems(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.List _targetdescriptors,int _currentneed,int _nextneed) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "builddesiredtrackitems", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "builddesiredtrackitems", new Object[] {_targetdescriptors,_currentneed,_nextneed}));}
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _seentrackids = null;
int _prioritybudget = 0;
Object _descriptorobject = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _manifest = null;
int _missingforplaylist = 0;
int _desiredforplaylist = 0;
RDebugUtils.currentLine=88932352;
 //BA.debugLineNum = 88932352;BA.debugLine="Private Sub BuildDesiredTrackItems(targetDescripto";
RDebugUtils.currentLine=88932353;
 //BA.debugLineNum = 88932353;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=88932354;
 //BA.debugLineNum = 88932354;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=88932356;
 //BA.debugLineNum = 88932356;BA.debugLine="If targetDescriptors.IsInitialized = False Or tar";
if (_targetdescriptors.IsInitialized()==__c.False || _targetdescriptors.getSize()==0) { 
if (true) return _result;};
RDebugUtils.currentLine=88932358;
 //BA.debugLineNum = 88932358;BA.debugLine="Dim seenTrackIds As Map";
_seentrackids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=88932359;
 //BA.debugLineNum = 88932359;BA.debugLine="seenTrackIds.Initialize";
_seentrackids.Initialize();
RDebugUtils.currentLine=88932361;
 //BA.debugLineNum = 88932361;BA.debugLine="Dim priorityBudget As Int = currentNeed + nextNee";
_prioritybudget = (int) (_currentneed+_nextneed);
RDebugUtils.currentLine=88932362;
 //BA.debugLineNum = 88932362;BA.debugLine="If priorityBudget <= 0 Then priorityBudget = perP";
if (_prioritybudget<=0) { 
_prioritybudget = __ref._perplaylistminreserve /*int*/ ;};
RDebugUtils.currentLine=88932364;
 //BA.debugLineNum = 88932364;BA.debugLine="For Each descriptorObject As Object In targetDesc";
{
final anywheresoftware.b4a.BA.IterableList group8 = _targetdescriptors;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_descriptorobject = group8.Get(index8);
RDebugUtils.currentLine=88932365;
 //BA.debugLineNum = 88932365;BA.debugLine="If (descriptorObject Is Map) = False Then Contin";
if ((_descriptorobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=88932367;
 //BA.debugLineNum = 88932367;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=88932368;
 //BA.debugLineNum = 88932368;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = __ref._getplaylistidfromdescriptor /*String*/ (null,_descriptor);
RDebugUtils.currentLine=88932369;
 //BA.debugLineNum = 88932369;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=88932371;
 //BA.debugLineNum = 88932371;BA.debugLine="Dim manifest As Map = LoadPlaylistManifestSafe(p";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = __ref._loadplaylistmanifestsafe /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=88932372;
 //BA.debugLineNum = 88932372;BA.debugLine="If manifest.IsInitialized = False Or manifest.Si";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=88932374;
 //BA.debugLineNum = 88932374;BA.debugLine="Dim missingForPlaylist As Int = ResolveMissingFo";
_missingforplaylist = __ref._resolvemissingforplaylistfrommanifest /*int*/ (null,_manifest,__ref._perplaylistminreserve /*int*/ );
RDebugUtils.currentLine=88932375;
 //BA.debugLineNum = 88932375;BA.debugLine="If missingForPlaylist <= 0 And priorityBudget <=";
if (_missingforplaylist<=0 && _prioritybudget<=0) { 
if (true) continue;};
RDebugUtils.currentLine=88932377;
 //BA.debugLineNum = 88932377;BA.debugLine="Dim desiredForPlaylist As Int = Max(perPlaylistM";
_desiredforplaylist = (int) (__c.Max(__ref._perplaylistminreserve /*int*/ ,_missingforplaylist));
RDebugUtils.currentLine=88932378;
 //BA.debugLineNum = 88932378;BA.debugLine="If priorityBudget > 0 Then desiredForPlaylist =";
if (_prioritybudget>0) { 
_desiredforplaylist = (int) (__c.Max(_desiredforplaylist,1));};
RDebugUtils.currentLine=88932380;
 //BA.debugLineNum = 88932380;BA.debugLine="CollectUncachedTracksFromManifest(result, seenTr";
__ref._collectuncachedtracksfrommanifest /*String*/ (null,_result,_seentrackids,_manifest,_playlistid,_desiredforplaylist);
 }
};
RDebugUtils.currentLine=88932383;
 //BA.debugLineNum = 88932383;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=88932384;
 //BA.debugLineNum = 88932384;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _loadplaylistmanifestsafe(b4j.example.autonomouscachemanager __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "loadplaylistmanifestsafe", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadplaylistmanifestsafe", new Object[] {_playlistid}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
RDebugUtils.currentLine=90374144;
 //BA.debugLineNum = 90374144;BA.debugLine="Private Sub LoadPlaylistManifestSafe(playlistId As";
RDebugUtils.currentLine=90374145;
 //BA.debugLineNum = 90374145;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=90374146;
 //BA.debugLineNum = 90374146;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=90374147;
 //BA.debugLineNum = 90374147;BA.debugLine="If playlistId = \"\" Then Return result";
if ((_playlistid).equals("")) { 
if (true) return _result;};
RDebugUtils.currentLine=90374149;
 //BA.debugLineNum = 90374149;BA.debugLine="Try";
try {RDebugUtils.currentLine=90374150;
 //BA.debugLineNum = 90374150;BA.debugLine="result = dataResolverService.GetPlaylistPlayback";
_result = __ref._dataresolverservice /*b4j.example.dataplaybackresolver*/ ._getplaylistplaybackmanifestbyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=90374152;
 //BA.debugLineNum = 90374152;BA.debugLine="result.Initialize";
_result.Initialize();
 };
RDebugUtils.currentLine=90374155;
 //BA.debugLineNum = 90374155;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=90374156;
 //BA.debugLineNum = 90374156;BA.debugLine="End Sub";
return null;
}
public int  _resolvemissingforplaylistfrommanifest(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _manifest,int _minreserve) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "resolvemissingforplaylistfrommanifest", false))
	 {return ((Integer) Debug.delegate(ba, "resolvemissingforplaylistfrommanifest", new Object[] {_manifest,_minreserve}));}
int _playablecount = 0;
RDebugUtils.currentLine=90177536;
 //BA.debugLineNum = 90177536;BA.debugLine="Private Sub ResolveMissingForPlaylistFromManifest(";
RDebugUtils.currentLine=90177537;
 //BA.debugLineNum = 90177537;BA.debugLine="Dim playableCount As Int = CountPlayableTracksInM";
_playablecount = __ref._countplayabletracksinmanifest /*int*/ (null,_manifest);
RDebugUtils.currentLine=90177538;
 //BA.debugLineNum = 90177538;BA.debugLine="Return Max(0, minReserve - playableCount)";
if (true) return (int) (__c.Max(0,_minreserve-_playablecount));
RDebugUtils.currentLine=90177539;
 //BA.debugLineNum = 90177539;BA.debugLine="End Sub";
return 0;
}
public String  _collectuncachedtracksfrommanifest(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.List _result,anywheresoftware.b4a.objects.collections.Map _seentrackids,anywheresoftware.b4a.objects.collections.Map _manifest,String _playlistid,int _limitcount) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "collectuncachedtracksfrommanifest", false))
	 {return ((String) Debug.delegate(ba, "collectuncachedtracksfrommanifest", new Object[] {_result,_seentrackids,_manifest,_playlistid,_limitcount}));}
anywheresoftware.b4a.objects.collections.List _order = null;
anywheresoftware.b4a.objects.collections.Map _trackmap = null;
int _addedcount = 0;
int _startindex = 0;
String _trackindexkey = "";
int _offset = 0;
int _orderindex = 0;
String _trackid = "";
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
anywheresoftware.b4a.objects.collections.Map _normalizedtrack = null;
RDebugUtils.currentLine=90243072;
 //BA.debugLineNum = 90243072;BA.debugLine="Private Sub CollectUncachedTracksFromManifest(resu";
RDebugUtils.currentLine=90243073;
 //BA.debugLineNum = 90243073;BA.debugLine="If limitCount <= 0 Then Return";
if (_limitcount<=0) { 
if (true) return "";};
RDebugUtils.currentLine=90243074;
 //BA.debugLineNum = 90243074;BA.debugLine="If manifest.IsInitialized = False Then Return";
if (_manifest.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=90243076;
 //BA.debugLineNum = 90243076;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
_order = new anywheresoftware.b4a.objects.collections.List();
_order = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_manifest.GetDefault((Object)("order"),__c.Null)));
RDebugUtils.currentLine=90243077;
 //BA.debugLineNum = 90243077;BA.debugLine="Dim trackMap As Map = manifest.GetDefault(\"tracks";
_trackmap = new anywheresoftware.b4a.objects.collections.Map();
_trackmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_manifest.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=90243078;
 //BA.debugLineNum = 90243078;BA.debugLine="If order.IsInitialized = False Or order.Size = 0";
if (_order.IsInitialized()==__c.False || _order.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=90243079;
 //BA.debugLineNum = 90243079;BA.debugLine="If trackMap.IsInitialized = False Or trackMap.Siz";
if (_trackmap.IsInitialized()==__c.False || _trackmap.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=90243081;
 //BA.debugLineNum = 90243081;BA.debugLine="Dim addedCount As Int = 0";
_addedcount = (int) (0);
RDebugUtils.currentLine=90243082;
 //BA.debugLineNum = 90243082;BA.debugLine="Dim startIndex As Int = ResolveManifestPrefetchSt";
_startindex = __ref._resolvemanifestprefetchstartindex /*int*/ (null,_playlistid,_order.getSize());
RDebugUtils.currentLine=90243083;
 //BA.debugLineNum = 90243083;BA.debugLine="Dim trackIndexKey As String = \"playlist_track_ind";
_trackindexkey = "playlist_track_index_"+_playlistid;
RDebugUtils.currentLine=90243085;
 //BA.debugLineNum = 90243085;BA.debugLine="For offset = 0 To order.Size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_order.getSize()-1);
_offset = (int) (0) ;
for (;_offset <= limit10 ;_offset = _offset + step10 ) {
RDebugUtils.currentLine=90243086;
 //BA.debugLineNum = 90243086;BA.debugLine="If addedCount >= limitCount Then Exit";
if (_addedcount>=_limitcount) { 
if (true) break;};
RDebugUtils.currentLine=90243088;
 //BA.debugLineNum = 90243088;BA.debugLine="Dim orderIndex As Int = (startIndex + offset) Mo";
_orderindex = (int) ((_startindex+_offset)%_order.getSize());
RDebugUtils.currentLine=90243089;
 //BA.debugLineNum = 90243089;BA.debugLine="Dim trackId As String = order.Get(orderIndex)";
_trackid = BA.ObjectToString(_order.Get(_orderindex));
RDebugUtils.currentLine=90243090;
 //BA.debugLineNum = 90243090;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=90243091;
 //BA.debugLineNum = 90243091;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Contin";
if (_seentrackids.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
RDebugUtils.currentLine=90243093;
 //BA.debugLineNum = 90243093;BA.debugLine="Dim trackObject As Object = trackMap.GetDefault(";
_trackobject = _trackmap.GetDefault((Object)(_trackid),__c.Null);
RDebugUtils.currentLine=90243094;
 //BA.debugLineNum = 90243094;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=90243096;
 //BA.debugLineNum = 90243096;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=90243097;
 //BA.debugLineNum = 90243097;BA.debugLine="If mediaCacheService.HasValidatedLocalMedia(trac";
if (__ref._mediacacheservice /*b4j.example.mediacache*/ ._hasvalidatedlocalmedia /*boolean*/ (null,_track)) { 
if (true) continue;};
RDebugUtils.currentLine=90243099;
 //BA.debugLineNum = 90243099;BA.debugLine="Dim normalizedTrack As Map = CloneMap(track)";
_normalizedtrack = new anywheresoftware.b4a.objects.collections.Map();
_normalizedtrack = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_track);
RDebugUtils.currentLine=90243100;
 //BA.debugLineNum = 90243100;BA.debugLine="If normalizedTrack.ContainsKey(\"type\") = False T";
if (_normalizedtrack.ContainsKey((Object)("type"))==__c.False) { 
_normalizedtrack.Put((Object)("type"),(Object)("track"));};
RDebugUtils.currentLine=90243101;
 //BA.debugLineNum = 90243101;BA.debugLine="If normalizedTrack.ContainsKey(\"playlist_id\") =";
if (_normalizedtrack.ContainsKey((Object)("playlist_id"))==__c.False) { 
_normalizedtrack.Put((Object)("playlist_id"),(Object)(_playlistid));};
RDebugUtils.currentLine=90243102;
 //BA.debugLineNum = 90243102;BA.debugLine="normalizedTrack.Put(\"playlist_track_index\", orde";
_normalizedtrack.Put((Object)("playlist_track_index"),(Object)(_orderindex));
RDebugUtils.currentLine=90243103;
 //BA.debugLineNum = 90243103;BA.debugLine="normalizedTrack.Put(\"playlist_prefetch_source\",";
_normalizedtrack.Put((Object)("playlist_prefetch_source"),(Object)("manifest_order"));
RDebugUtils.currentLine=90243105;
 //BA.debugLineNum = 90243105;BA.debugLine="result.Add(normalizedTrack)";
_result.Add((Object)(_normalizedtrack.getObject()));
RDebugUtils.currentLine=90243106;
 //BA.debugLineNum = 90243106;BA.debugLine="seenTrackIds.Put(trackId, True)";
_seentrackids.Put((Object)(_trackid),(Object)(__c.True));
RDebugUtils.currentLine=90243107;
 //BA.debugLineNum = 90243107;BA.debugLine="addedCount = addedCount + 1";
_addedcount = (int) (_addedcount+1);
RDebugUtils.currentLine=90243109;
 //BA.debugLineNum = 90243109;BA.debugLine="Trace(\"autocache candidate playlistId=\" & playli";
__ref._trace /*String*/ (null,"autocache candidate playlistId="+_playlistid+" orderIndex="+BA.NumberToString(_orderindex)+" trackId="+_trackid+" basedOnKey="+_trackindexkey);
 }
};
RDebugUtils.currentLine=90243111;
 //BA.debugLineNum = 90243111;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _buildprotectedtrackids(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "buildprotectedtrackids", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "buildprotectedtrackids", null));}
anywheresoftware.b4a.objects.collections.List _result = null;
RDebugUtils.currentLine=89194496;
 //BA.debugLineNum = 89194496;BA.debugLine="Private Sub BuildProtectedTrackIds As List";
RDebugUtils.currentLine=89194497;
 //BA.debugLineNum = 89194497;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89194498;
 //BA.debugLineNum = 89194498;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=89194499;
 //BA.debugLineNum = 89194499;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=89194500;
 //BA.debugLineNum = 89194500;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _buildrelevanttrackids(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "buildrelevanttrackids", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "buildrelevanttrackids", null));}
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _relevantids = null;
anywheresoftware.b4a.objects.collections.List _descriptors = null;
Object _descriptorobject = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _manifest = null;
anywheresoftware.b4a.objects.collections.List _order = null;
String _trackid = "";
RDebugUtils.currentLine=89260032;
 //BA.debugLineNum = 89260032;BA.debugLine="Private Sub BuildRelevantTrackIds As List";
RDebugUtils.currentLine=89260033;
 //BA.debugLineNum = 89260033;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89260034;
 //BA.debugLineNum = 89260034;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=89260036;
 //BA.debugLineNum = 89260036;BA.debugLine="Dim relevantIds As Map";
_relevantids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=89260037;
 //BA.debugLineNum = 89260037;BA.debugLine="relevantIds.Initialize";
_relevantids.Initialize();
RDebugUtils.currentLine=89260039;
 //BA.debugLineNum = 89260039;BA.debugLine="Dim descriptors As List = GetStoredPlaylistDescri";
_descriptors = new anywheresoftware.b4a.objects.collections.List();
_descriptors = __ref._getstoredplaylistdescriptorssafe /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=89260040;
 //BA.debugLineNum = 89260040;BA.debugLine="If descriptors.IsInitialized = False Or descripto";
if (_descriptors.IsInitialized()==__c.False || _descriptors.getSize()==0) { 
if (true) return _result;};
RDebugUtils.currentLine=89260042;
 //BA.debugLineNum = 89260042;BA.debugLine="For Each descriptorObject As Object In descriptor";
{
final anywheresoftware.b4a.BA.IterableList group7 = _descriptors;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_descriptorobject = group7.Get(index7);
RDebugUtils.currentLine=89260043;
 //BA.debugLineNum = 89260043;BA.debugLine="If (descriptorObject Is Map) = False Then Contin";
if ((_descriptorobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=89260045;
 //BA.debugLineNum = 89260045;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=89260046;
 //BA.debugLineNum = 89260046;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = __ref._getplaylistidfromdescriptor /*String*/ (null,_descriptor);
RDebugUtils.currentLine=89260047;
 //BA.debugLineNum = 89260047;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=89260049;
 //BA.debugLineNum = 89260049;BA.debugLine="Dim manifest As Map = LoadPlaylistManifestSafe(p";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = __ref._loadplaylistmanifestsafe /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=89260050;
 //BA.debugLineNum = 89260050;BA.debugLine="If manifest.IsInitialized = False Or manifest.Si";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=89260052;
 //BA.debugLineNum = 89260052;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
_order = new anywheresoftware.b4a.objects.collections.List();
_order = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_manifest.GetDefault((Object)("order"),__c.Null)));
RDebugUtils.currentLine=89260053;
 //BA.debugLineNum = 89260053;BA.debugLine="If order.IsInitialized = False Then Continue";
if (_order.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=89260055;
 //BA.debugLineNum = 89260055;BA.debugLine="For Each trackId As String In order";
{
final anywheresoftware.b4a.BA.IterableList group16 = _order;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_trackid = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=89260056;
 //BA.debugLineNum = 89260056;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=89260057;
 //BA.debugLineNum = 89260057;BA.debugLine="If relevantIds.ContainsKey(trackId) Then Contin";
if (_relevantids.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
RDebugUtils.currentLine=89260058;
 //BA.debugLineNum = 89260058;BA.debugLine="relevantIds.Put(trackId, True)";
_relevantids.Put((Object)(_trackid),(Object)(__c.True));
 }
};
 }
};
RDebugUtils.currentLine=89260062;
 //BA.debugLineNum = 89260062;BA.debugLine="For Each trackId As String In relevantIds.Keys";
{
final anywheresoftware.b4a.BA.IterableList group22 = _relevantids.Keys();
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_trackid = BA.ObjectToString(group22.Get(index22));
RDebugUtils.currentLine=89260063;
 //BA.debugLineNum = 89260063;BA.debugLine="result.Add(trackId)";
_result.Add((Object)(_trackid));
 }
};
RDebugUtils.currentLine=89260066;
 //BA.debugLineNum = 89260066;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=89260067;
 //BA.debugLineNum = 89260067;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getstoredplaylistdescriptorssafe(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "getstoredplaylistdescriptorssafe", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getstoredplaylistdescriptorssafe", null));}
anywheresoftware.b4a.objects.collections.List _result = null;
RDebugUtils.currentLine=89653248;
 //BA.debugLineNum = 89653248;BA.debugLine="Private Sub GetStoredPlaylistDescriptorsSafe As Li";
RDebugUtils.currentLine=89653249;
 //BA.debugLineNum = 89653249;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=89653250;
 //BA.debugLineNum = 89653250;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=89653252;
 //BA.debugLineNum = 89653252;BA.debugLine="Try";
try {RDebugUtils.currentLine=89653253;
 //BA.debugLineNum = 89653253;BA.debugLine="result = offlineStoreService.GetStoredPlaylistDe";
_result = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getstoredplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=89653255;
 //BA.debugLineNum = 89653255;BA.debugLine="result.Initialize";
_result.Initialize();
 };
RDebugUtils.currentLine=89653258;
 //BA.debugLineNum = 89653258;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=89653259;
 //BA.debugLineNum = 89653259;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _buildtargetplaylistdescriptors(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _nextslot) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "buildtargetplaylistdescriptors", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "buildtargetplaylistdescriptors", new Object[] {_currentslot,_nextslot}));}
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _seen = null;
RDebugUtils.currentLine=88801280;
 //BA.debugLineNum = 88801280;BA.debugLine="Private Sub BuildTargetPlaylistDescriptors(current";
RDebugUtils.currentLine=88801281;
 //BA.debugLineNum = 88801281;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=88801282;
 //BA.debugLineNum = 88801282;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=88801284;
 //BA.debugLineNum = 88801284;BA.debugLine="Dim seen As Map";
_seen = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=88801285;
 //BA.debugLineNum = 88801285;BA.debugLine="seen.Initialize";
_seen.Initialize();
RDebugUtils.currentLine=88801287;
 //BA.debugLineNum = 88801287;BA.debugLine="AddSlotPlaylistDescriptors(result, seen, currentS";
__ref._addslotplaylistdescriptors /*String*/ (null,_result,_seen,_currentslot);
RDebugUtils.currentLine=88801288;
 //BA.debugLineNum = 88801288;BA.debugLine="AddSlotPlaylistDescriptors(result, seen, nextSlot";
__ref._addslotplaylistdescriptors /*String*/ (null,_result,_seen,_nextslot);
RDebugUtils.currentLine=88801290;
 //BA.debugLineNum = 88801290;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=88801291;
 //BA.debugLineNum = 88801291;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
RDebugUtils.currentLine=87949312;
 //BA.debugLineNum = 87949312;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=87949313;
 //BA.debugLineNum = 87949313;BA.debugLine="Private kvs As KeyValueStore";
_kvs = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=87949314;
 //BA.debugLineNum = 87949314;BA.debugLine="Private offlineStoreService As OfflineStore";
_offlinestoreservice = new b4j.example.offlinestore();
RDebugUtils.currentLine=87949315;
 //BA.debugLineNum = 87949315;BA.debugLine="Private dataResolverService As DataPlaybackResolv";
_dataresolverservice = new b4j.example.dataplaybackresolver();
RDebugUtils.currentLine=87949316;
 //BA.debugLineNum = 87949316;BA.debugLine="Private mediaCacheService As MediaCache";
_mediacacheservice = new b4j.example.mediacache();
RDebugUtils.currentLine=87949318;
 //BA.debugLineNum = 87949318;BA.debugLine="Private traceTarget As Object";
_tracetarget = new Object();
RDebugUtils.currentLine=87949319;
 //BA.debugLineNum = 87949319;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=87949321;
 //BA.debugLineNum = 87949321;BA.debugLine="Private workerTimer As Timer";
_workertimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=87949322;
 //BA.debugLineNum = 87949322;BA.debugLine="Private isRunning As Boolean";
_isrunning = false;
RDebugUtils.currentLine=87949323;
 //BA.debugLineNum = 87949323;BA.debugLine="Private stepInProgress As Boolean";
_stepinprogress = false;
RDebugUtils.currentLine=87949325;
 //BA.debugLineNum = 87949325;BA.debugLine="Private Const DEFAULT_TICK_INTERVAL_MS As Int = 3";
_default_tick_interval_ms = (int) (30000);
RDebugUtils.currentLine=87949326;
 //BA.debugLineNum = 87949326;BA.debugLine="Private Const DEFAULT_DOWNLOAD_COOLDOWN_MS As Lon";
_default_download_cooldown_ms = (long) (15000);
RDebugUtils.currentLine=87949327;
 //BA.debugLineNum = 87949327;BA.debugLine="Private Const DEFAULT_FAILURE_COOLDOWN_MS As Long";
_default_failure_cooldown_ms = (long) (120000);
RDebugUtils.currentLine=87949328;
 //BA.debugLineNum = 87949328;BA.debugLine="Private Const DEFAULT_PRUNE_COOLDOWN_MS As Long =";
_default_prune_cooldown_ms = (long) (60000);
RDebugUtils.currentLine=87949330;
 //BA.debugLineNum = 87949330;BA.debugLine="Private Const DEFAULT_CURRENT_SLOT_MIN_RESERVE As";
_default_current_slot_min_reserve = (int) (8);
RDebugUtils.currentLine=87949331;
 //BA.debugLineNum = 87949331;BA.debugLine="Private Const DEFAULT_NEXT_SLOT_MIN_RESERVE As In";
_default_next_slot_min_reserve = (int) (4);
RDebugUtils.currentLine=87949332;
 //BA.debugLineNum = 87949332;BA.debugLine="Private Const DEFAULT_PER_PLAYLIST_MIN_RESERVE As";
_default_per_playlist_min_reserve = (int) (2);
RDebugUtils.currentLine=87949333;
 //BA.debugLineNum = 87949333;BA.debugLine="Private Const DEFAULT_MAX_DOWNLOADS_PER_STEP As I";
_default_max_downloads_per_step = (int) (2);
RDebugUtils.currentLine=87949335;
 //BA.debugLineNum = 87949335;BA.debugLine="Private tickIntervalMs As Int = DEFAULT_TICK_INTE";
_tickintervalms = __ref._default_tick_interval_ms /*int*/ ;
RDebugUtils.currentLine=87949336;
 //BA.debugLineNum = 87949336;BA.debugLine="Private downloadCooldownMs As Long = DEFAULT_DOWN";
_downloadcooldownms = __ref._default_download_cooldown_ms /*long*/ ;
RDebugUtils.currentLine=87949337;
 //BA.debugLineNum = 87949337;BA.debugLine="Private failureCooldownMs As Long = DEFAULT_FAILU";
_failurecooldownms = __ref._default_failure_cooldown_ms /*long*/ ;
RDebugUtils.currentLine=87949338;
 //BA.debugLineNum = 87949338;BA.debugLine="Private pruneCooldownMs As Long = DEFAULT_PRUNE_C";
_prunecooldownms = __ref._default_prune_cooldown_ms /*long*/ ;
RDebugUtils.currentLine=87949340;
 //BA.debugLineNum = 87949340;BA.debugLine="Private currentSlotMinReserve As Int = DEFAULT_CU";
_currentslotminreserve = __ref._default_current_slot_min_reserve /*int*/ ;
RDebugUtils.currentLine=87949341;
 //BA.debugLineNum = 87949341;BA.debugLine="Private nextSlotMinReserve As Int = DEFAULT_NEXT_";
_nextslotminreserve = __ref._default_next_slot_min_reserve /*int*/ ;
RDebugUtils.currentLine=87949342;
 //BA.debugLineNum = 87949342;BA.debugLine="Private perPlaylistMinReserve As Int = DEFAULT_PE";
_perplaylistminreserve = __ref._default_per_playlist_min_reserve /*int*/ ;
RDebugUtils.currentLine=87949343;
 //BA.debugLineNum = 87949343;BA.debugLine="Private maxDownloadsPerStep As Int = DEFAULT_MAX_";
_maxdownloadsperstep = __ref._default_max_downloads_per_step /*int*/ ;
RDebugUtils.currentLine=87949345;
 //BA.debugLineNum = 87949345;BA.debugLine="Private lastSuccessfulDownloadAt As Long";
_lastsuccessfuldownloadat = 0L;
RDebugUtils.currentLine=87949346;
 //BA.debugLineNum = 87949346;BA.debugLine="Private lastFailureAt As Long";
_lastfailureat = 0L;
RDebugUtils.currentLine=87949347;
 //BA.debugLineNum = 87949347;BA.debugLine="Private lastPruneAt As Long";
_lastpruneat = 0L;
RDebugUtils.currentLine=87949348;
 //BA.debugLineNum = 87949348;BA.debugLine="End Sub";
return "";
}
public int  _resolvemanifestprefetchstartindex(b4j.example.autonomouscachemanager __ref,String _playlistid,int _ordersize) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "resolvemanifestprefetchstartindex", false))
	 {return ((Integer) Debug.delegate(ba, "resolvemanifestprefetchstartindex", new Object[] {_playlistid,_ordersize}));}
int _storedtrackindex = 0;
int _startindex = 0;
RDebugUtils.currentLine=90308608;
 //BA.debugLineNum = 90308608;BA.debugLine="Private Sub ResolveManifestPrefetchStartIndex(play";
RDebugUtils.currentLine=90308609;
 //BA.debugLineNum = 90308609;BA.debugLine="If orderSize <= 0 Then Return 0";
if (_ordersize<=0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=90308611;
 //BA.debugLineNum = 90308611;BA.debugLine="Dim storedTrackIndex As Int = -1";
_storedtrackindex = (int) (-1);
RDebugUtils.currentLine=90308613;
 //BA.debugLineNum = 90308613;BA.debugLine="Try";
try {RDebugUtils.currentLine=90308614;
 //BA.debugLineNum = 90308614;BA.debugLine="storedTrackIndex = kvs.GetDefault(\"playlist_trac";
_storedtrackindex = (int)(BA.ObjectToNumber(__ref._kvs /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"playlist_track_index_"+_playlistid,(Object)(-1))));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=90308616;
 //BA.debugLineNum = 90308616;BA.debugLine="storedTrackIndex = -1";
_storedtrackindex = (int) (-1);
 };
RDebugUtils.currentLine=90308619;
 //BA.debugLineNum = 90308619;BA.debugLine="Dim startIndex As Int = storedTrackIndex + 1";
_startindex = (int) (_storedtrackindex+1);
RDebugUtils.currentLine=90308620;
 //BA.debugLineNum = 90308620;BA.debugLine="If startIndex < 0 Then startIndex = 0";
if (_startindex<0) { 
_startindex = (int) (0);};
RDebugUtils.currentLine=90308621;
 //BA.debugLineNum = 90308621;BA.debugLine="If startIndex >= orderSize Then startIndex = star";
if (_startindex>=_ordersize) { 
_startindex = (int) (_startindex%_ordersize);};
RDebugUtils.currentLine=90308623;
 //BA.debugLineNum = 90308623;BA.debugLine="Return startIndex";
if (true) return _startindex;
RDebugUtils.currentLine=90308624;
 //BA.debugLineNum = 90308624;BA.debugLine="End Sub";
return 0;
}
public String  _trace(b4j.example.autonomouscachemanager __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=89980928;
 //BA.debugLineNum = 89980928;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=89980929;
 //BA.debugLineNum = 89980929;BA.debugLine="If traceTarget = Null Then";
if (__ref._tracetarget /*Object*/ == null) { 
RDebugUtils.currentLine=89980930;
 //BA.debugLineNum = 89980930;BA.debugLine="Log(message)";
__c.LogImpl("289980930",_message,0);
RDebugUtils.currentLine=89980931;
 //BA.debugLineNum = 89980931;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=89980934;
 //BA.debugLineNum = 89980934;BA.debugLine="If traceSubName = \"\" Then";
if ((__ref._tracesubname /*String*/ ).equals("")) { 
RDebugUtils.currentLine=89980935;
 //BA.debugLineNum = 89980935;BA.debugLine="Log(message)";
__c.LogImpl("289980935",_message,0);
RDebugUtils.currentLine=89980936;
 //BA.debugLineNum = 89980936;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=89980939;
 //BA.debugLineNum = 89980939;BA.debugLine="Try";
try {RDebugUtils.currentLine=89980940;
 //BA.debugLineNum = 89980940;BA.debugLine="CallSub2(traceTarget, traceSubName, message)";
__c.CallSubNew2(ba,__ref._tracetarget /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=89980942;
 //BA.debugLineNum = 89980942;BA.debugLine="Log(message)";
__c.LogImpl("289980942",_message,0);
 };
RDebugUtils.currentLine=89980944;
 //BA.debugLineNum = 89980944;BA.debugLine="End Sub";
return "";
}
public int  _countplayabletracksinmanifest(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _manifest) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "countplayabletracksinmanifest", false))
	 {return ((Integer) Debug.delegate(ba, "countplayabletracksinmanifest", new Object[] {_manifest}));}
anywheresoftware.b4a.objects.collections.List _order = null;
anywheresoftware.b4a.objects.collections.Map _trackmap = null;
int _totalcount = 0;
String _trackid = "";
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
RDebugUtils.currentLine=90112000;
 //BA.debugLineNum = 90112000;BA.debugLine="Private Sub CountPlayableTracksInManifest(manifest";
RDebugUtils.currentLine=90112001;
 //BA.debugLineNum = 90112001;BA.debugLine="If manifest.IsInitialized = False Then Return 0";
if (_manifest.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=90112003;
 //BA.debugLineNum = 90112003;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
_order = new anywheresoftware.b4a.objects.collections.List();
_order = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_manifest.GetDefault((Object)("order"),__c.Null)));
RDebugUtils.currentLine=90112004;
 //BA.debugLineNum = 90112004;BA.debugLine="Dim trackMap As Map = manifest.GetDefault(\"tracks";
_trackmap = new anywheresoftware.b4a.objects.collections.Map();
_trackmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_manifest.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=90112005;
 //BA.debugLineNum = 90112005;BA.debugLine="If order.IsInitialized = False Or order.Size = 0";
if (_order.IsInitialized()==__c.False || _order.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=90112006;
 //BA.debugLineNum = 90112006;BA.debugLine="If trackMap.IsInitialized = False Or trackMap.Siz";
if (_trackmap.IsInitialized()==__c.False || _trackmap.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=90112008;
 //BA.debugLineNum = 90112008;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
RDebugUtils.currentLine=90112009;
 //BA.debugLineNum = 90112009;BA.debugLine="For Each trackId As String In order";
{
final anywheresoftware.b4a.BA.IterableList group7 = _order;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_trackid = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=90112010;
 //BA.debugLineNum = 90112010;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=90112011;
 //BA.debugLineNum = 90112011;BA.debugLine="Dim trackObject As Object = trackMap.GetDefault(";
_trackobject = _trackmap.GetDefault((Object)(_trackid),__c.Null);
RDebugUtils.currentLine=90112012;
 //BA.debugLineNum = 90112012;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=90112013;
 //BA.debugLineNum = 90112013;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=90112014;
 //BA.debugLineNum = 90112014;BA.debugLine="If mediaCacheService.HasValidatedLocalMedia(trac";
if (__ref._mediacacheservice /*b4j.example.mediacache*/ ._hasvalidatedlocalmedia /*boolean*/ (null,_track)) { 
RDebugUtils.currentLine=90112015;
 //BA.debugLineNum = 90112015;BA.debugLine="totalCount = totalCount + 1";
_totalcount = (int) (_totalcount+1);
 };
 }
};
RDebugUtils.currentLine=90112019;
 //BA.debugLineNum = 90112019;BA.debugLine="Return totalCount";
if (true) return _totalcount;
RDebugUtils.currentLine=90112020;
 //BA.debugLineNum = 90112020;BA.debugLine="End Sub";
return 0;
}
public int  _countplayabletracksinslot(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "countplayabletracksinslot", false))
	 {return ((Integer) Debug.delegate(ba, "countplayabletracksinslot", new Object[] {_slot}));}
anywheresoftware.b4a.objects.collections.List _playlists = null;
int _totalcount = 0;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _manifest = null;
RDebugUtils.currentLine=88670208;
 //BA.debugLineNum = 88670208;BA.debugLine="Private Sub CountPlayableTracksInSlot(slot As Map)";
RDebugUtils.currentLine=88670209;
 //BA.debugLineNum = 88670209;BA.debugLine="If slot.IsInitialized = False Then Return 0";
if (_slot.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=88670211;
 //BA.debugLineNum = 88670211;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = __ref._getslotplaylists /*anywheresoftware.b4a.objects.collections.List*/ (null,_slot);
RDebugUtils.currentLine=88670212;
 //BA.debugLineNum = 88670212;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=88670214;
 //BA.debugLineNum = 88670214;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
RDebugUtils.currentLine=88670216;
 //BA.debugLineNum = 88670216;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group5 = _playlists;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_playlistobject = group5.Get(index5);
RDebugUtils.currentLine=88670217;
 //BA.debugLineNum = 88670217;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=88670218;
 //BA.debugLineNum = 88670218;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=88670219;
 //BA.debugLineNum = 88670219;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = __ref._getplaylistidfromdescriptor /*String*/ (null,_playlistdescriptor);
RDebugUtils.currentLine=88670220;
 //BA.debugLineNum = 88670220;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=88670222;
 //BA.debugLineNum = 88670222;BA.debugLine="Dim manifest As Map = LoadPlaylistManifestSafe(p";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = __ref._loadplaylistmanifestsafe /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=88670223;
 //BA.debugLineNum = 88670223;BA.debugLine="totalCount = totalCount + CountPlayableTracksInM";
_totalcount = (int) (_totalcount+__ref._countplayabletracksinmanifest /*int*/ (null,_manifest));
 }
};
RDebugUtils.currentLine=88670226;
 //BA.debugLineNum = 88670226;BA.debugLine="Return totalCount";
if (true) return _totalcount;
RDebugUtils.currentLine=88670227;
 //BA.debugLineNum = 88670227;BA.debugLine="End Sub";
return 0;
}
public boolean  _hasmediacacherecentfailure(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "hasmediacacherecentfailure", false))
	 {return ((Boolean) Debug.delegate(ba, "hasmediacacherecentfailure", null));}
RDebugUtils.currentLine=89718784;
 //BA.debugLineNum = 89718784;BA.debugLine="Private Sub HasMediaCacheRecentFailure As Boolean";
RDebugUtils.currentLine=89718785;
 //BA.debugLineNum = 89718785;BA.debugLine="Try";
try {RDebugUtils.currentLine=89718786;
 //BA.debugLineNum = 89718786;BA.debugLine="Return mediaCacheService.ConsumeRecentMediaNetwo";
if (true) return __ref._mediacacheservice /*b4j.example.mediacache*/ ._consumerecentmedianetworkfailure /*boolean*/ (null);
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=89718788;
 //BA.debugLineNum = 89718788;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=89718790;
 //BA.debugLineNum = 89718790;BA.debugLine="End Sub";
return false;
}
public boolean  _isdownloadcooldownactive(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "isdownloadcooldownactive", false))
	 {return ((Boolean) Debug.delegate(ba, "isdownloadcooldownactive", null));}
RDebugUtils.currentLine=89784320;
 //BA.debugLineNum = 89784320;BA.debugLine="Private Sub IsDownloadCooldownActive As Boolean";
RDebugUtils.currentLine=89784321;
 //BA.debugLineNum = 89784321;BA.debugLine="If lastSuccessfulDownloadAt <= 0 Then Return Fals";
if (__ref._lastsuccessfuldownloadat /*long*/ <=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=89784322;
 //BA.debugLineNum = 89784322;BA.debugLine="Return DateTime.Now - lastSuccessfulDownloadAt <";
if (true) return __c.DateTime.getNow()-__ref._lastsuccessfuldownloadat /*long*/ <__ref._downloadcooldownms /*long*/ ;
RDebugUtils.currentLine=89784323;
 //BA.debugLineNum = 89784323;BA.debugLine="End Sub";
return false;
}
public boolean  _isfailurecooldownactive(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "isfailurecooldownactive", false))
	 {return ((Boolean) Debug.delegate(ba, "isfailurecooldownactive", null));}
RDebugUtils.currentLine=89849856;
 //BA.debugLineNum = 89849856;BA.debugLine="Private Sub IsFailureCooldownActive As Boolean";
RDebugUtils.currentLine=89849857;
 //BA.debugLineNum = 89849857;BA.debugLine="If lastFailureAt <= 0 Then Return False";
if (__ref._lastfailureat /*long*/ <=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=89849858;
 //BA.debugLineNum = 89849858;BA.debugLine="Return DateTime.Now - lastFailureAt < failureCool";
if (true) return __c.DateTime.getNow()-__ref._lastfailureat /*long*/ <__ref._failurecooldownms /*long*/ ;
RDebugUtils.currentLine=89849859;
 //BA.debugLineNum = 89849859;BA.debugLine="End Sub";
return false;
}
public boolean  _isstarted(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "isstarted", false))
	 {return ((Boolean) Debug.delegate(ba, "isstarted", null));}
RDebugUtils.currentLine=88408064;
 //BA.debugLineNum = 88408064;BA.debugLine="Public Sub IsStarted As Boolean";
RDebugUtils.currentLine=88408065;
 //BA.debugLineNum = 88408065;BA.debugLine="Return isRunning";
if (true) return __ref._isrunning /*boolean*/ ;
RDebugUtils.currentLine=88408066;
 //BA.debugLineNum = 88408066;BA.debugLine="End Sub";
return false;
}
public int  _resolveslotneed(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _slot,int _minreserve) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "resolveslotneed", false))
	 {return ((Integer) Debug.delegate(ba, "resolveslotneed", new Object[] {_slot,_minreserve}));}
anywheresoftware.b4a.objects.collections.List _playlists = null;
int _playablecount = 0;
RDebugUtils.currentLine=88604672;
 //BA.debugLineNum = 88604672;BA.debugLine="Private Sub ResolveSlotNeed(slot As Map, minReserv";
RDebugUtils.currentLine=88604673;
 //BA.debugLineNum = 88604673;BA.debugLine="If slot.IsInitialized = False Or slot.Size = 0 Th";
if (_slot.IsInitialized()==__c.False || _slot.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=88604675;
 //BA.debugLineNum = 88604675;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = __ref._getslotplaylists /*anywheresoftware.b4a.objects.collections.List*/ (null,_slot);
RDebugUtils.currentLine=88604676;
 //BA.debugLineNum = 88604676;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=88604678;
 //BA.debugLineNum = 88604678;BA.debugLine="Dim playableCount As Int = CountPlayableTracksInS";
_playablecount = __ref._countplayabletracksinslot /*int*/ (null,_slot);
RDebugUtils.currentLine=88604679;
 //BA.debugLineNum = 88604679;BA.debugLine="Return Max(0, minReserve - playableCount)";
if (true) return (int) (__c.Max(0,_minreserve-_playablecount));
RDebugUtils.currentLine=88604680;
 //BA.debugLineNum = 88604680;BA.debugLine="End Sub";
return 0;
}
public String  _runpruneifneeded(b4j.example.autonomouscachemanager __ref,String _initiator) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "runpruneifneeded", false))
	 {return ((String) Debug.delegate(ba, "runpruneifneeded", new Object[] {_initiator}));}
anywheresoftware.b4a.objects.collections.List _protectedtrackids = null;
anywheresoftware.b4a.objects.collections.List _relevanttrackids = null;
int _removedcount = 0;
RDebugUtils.currentLine=89128960;
 //BA.debugLineNum = 89128960;BA.debugLine="Private Sub RunPruneIfNeeded(initiator As String)";
RDebugUtils.currentLine=89128961;
 //BA.debugLineNum = 89128961;BA.debugLine="If DateTime.Now - lastPruneAt < pruneCooldownMs T";
if (__c.DateTime.getNow()-__ref._lastpruneat /*long*/ <__ref._prunecooldownms /*long*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=89128963;
 //BA.debugLineNum = 89128963;BA.debugLine="Dim protectedTrackIds As List = BuildProtectedTra";
_protectedtrackids = new anywheresoftware.b4a.objects.collections.List();
_protectedtrackids = __ref._buildprotectedtrackids /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=89128964;
 //BA.debugLineNum = 89128964;BA.debugLine="Dim relevantTrackIds As List = BuildRelevantTrack";
_relevanttrackids = new anywheresoftware.b4a.objects.collections.List();
_relevanttrackids = __ref._buildrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=89128966;
 //BA.debugLineNum = 89128966;BA.debugLine="Dim removedCount As Int = mediaCacheService.Prune";
_removedcount = __ref._mediacacheservice /*b4j.example.mediacache*/ ._prunetrackcacheifneeded /*int*/ (null,_protectedtrackids,_relevanttrackids);
RDebugUtils.currentLine=89128967;
 //BA.debugLineNum = 89128967;BA.debugLine="lastPruneAt = DateTime.Now";
__ref._lastpruneat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=89128969;
 //BA.debugLineNum = 89128969;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
RDebugUtils.currentLine=89128970;
 //BA.debugLineNum = 89128970;BA.debugLine="Trace(\"autocache prune completed initiator=\" & i";
__ref._trace /*String*/ (null,"autocache prune completed initiator="+_initiator+" removed="+BA.NumberToString(_removedcount));
 }else {
RDebugUtils.currentLine=89128972;
 //BA.debugLineNum = 89128972;BA.debugLine="Trace(\"autocache prune completed initiator=\" & i";
__ref._trace /*String*/ (null,"autocache prune completed initiator="+_initiator+" removed=0");
 };
RDebugUtils.currentLine=89128974;
 //BA.debugLineNum = 89128974;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _runstepasync(b4j.example.autonomouscachemanager __ref) throws Exception{
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "runstepasync", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "runstepasync", null));}
ResumableSub_RunStepAsync rsub = new ResumableSub_RunStepAsync(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RunStepAsync extends BA.ResumableSub {
public ResumableSub_RunStepAsync(b4j.example.autonomouscachemanager parent,b4j.example.autonomouscachemanager __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.autonomouscachemanager __ref;
b4j.example.autonomouscachemanager parent;
anywheresoftware.b4a.objects.collections.Map _summary = null;
anywheresoftware.b4a.objects.collections.Map _offlinedata = null;
long _nowticks = 0L;
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.Map _nextslot = null;
int _currentneed = 0;
int _nextneed = 0;
anywheresoftware.b4a.objects.collections.List _targetdescriptors = null;
anywheresoftware.b4a.objects.collections.List _desiredtrackitems = null;
int _actualmaxdownloads = 0;
boolean _downloaded = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="autonomouscachemanager";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=88539137;
 //BA.debugLineNum = 88539137;BA.debugLine="Dim summary As Map";
_summary = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=88539138;
 //BA.debugLineNum = 88539138;BA.debugLine="summary.Initialize";
_summary.Initialize();
RDebugUtils.currentLine=88539140;
 //BA.debugLineNum = 88539140;BA.debugLine="If kvs.IsInitialized = False Or offlineStoreServi";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._kvs /*b4j.example.keyvaluestore*/ .IsInitialized /*boolean*/ ()==parent.__c.False || __ref._offlinestoreservice /*b4j.example.offlinestore*/ .IsInitialized /*boolean*/ ()==parent.__c.False || __ref._dataresolverservice /*b4j.example.dataplaybackresolver*/ .IsInitialized /*boolean*/ ()==parent.__c.False || __ref._mediacacheservice /*b4j.example.mediacache*/ .IsInitialized /*boolean*/ ()==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=88539141;
 //BA.debugLineNum = 88539141;BA.debugLine="summary.Put(\"status\", \"not_initialized\")";
_summary.Put((Object)("status"),(Object)("not_initialized"));
RDebugUtils.currentLine=88539142;
 //BA.debugLineNum = 88539142;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;
;
RDebugUtils.currentLine=88539145;
 //BA.debugLineNum = 88539145;BA.debugLine="If IsFailureCooldownActive Then";

case 4:
//if
this.state = 7;
if (__ref._isfailurecooldownactive /*boolean*/ (null)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=88539146;
 //BA.debugLineNum = 88539146;BA.debugLine="summary.Put(\"status\", \"failure_cooldown\")";
_summary.Put((Object)("status"),(Object)("failure_cooldown"));
RDebugUtils.currentLine=88539147;
 //BA.debugLineNum = 88539147;BA.debugLine="Trace(\"autocache step skipped reason=failure_coo";
__ref._trace /*String*/ (null,"autocache step skipped reason=failure_cooldown");
RDebugUtils.currentLine=88539148;
 //BA.debugLineNum = 88539148;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;
;
RDebugUtils.currentLine=88539151;
 //BA.debugLineNum = 88539151;BA.debugLine="If IsDownloadCooldownActive Then";

case 7:
//if
this.state = 10;
if (__ref._isdownloadcooldownactive /*boolean*/ (null)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=88539152;
 //BA.debugLineNum = 88539152;BA.debugLine="summary.Put(\"status\", \"download_cooldown\")";
_summary.Put((Object)("status"),(Object)("download_cooldown"));
RDebugUtils.currentLine=88539153;
 //BA.debugLineNum = 88539153;BA.debugLine="Trace(\"autocache step skipped reason=download_co";
__ref._trace /*String*/ (null,"autocache step skipped reason=download_cooldown");
RDebugUtils.currentLine=88539154;
 //BA.debugLineNum = 88539154;BA.debugLine="RunPruneIfNeeded(\"cooldown\")";
__ref._runpruneifneeded /*String*/ (null,"cooldown");
RDebugUtils.currentLine=88539155;
 //BA.debugLineNum = 88539155;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=88539158;
 //BA.debugLineNum = 88539158;BA.debugLine="Dim offlineData As Map = offlineStoreService.Load";
_offlinedata = new anywheresoftware.b4a.objects.collections.Map();
_offlinedata = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._loadofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=88539159;
 //BA.debugLineNum = 88539159;BA.debugLine="If offlineData.IsInitialized = False Or offlineDa";
if (true) break;

case 11:
//if
this.state = 14;
if (_offlinedata.IsInitialized()==parent.__c.False || _offlinedata.getSize()==0) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=88539160;
 //BA.debugLineNum = 88539160;BA.debugLine="summary.Put(\"status\", \"no_offline_data\")";
_summary.Put((Object)("status"),(Object)("no_offline_data"));
RDebugUtils.currentLine=88539161;
 //BA.debugLineNum = 88539161;BA.debugLine="Trace(\"autocache step skipped reason=no_offline_";
__ref._trace /*String*/ (null,"autocache step skipped reason=no_offline_data");
RDebugUtils.currentLine=88539162;
 //BA.debugLineNum = 88539162;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=88539165;
 //BA.debugLineNum = 88539165;BA.debugLine="mediaCacheService.EnsureTrackCacheReady";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._ensuretrackcacheready /*String*/ (null);
RDebugUtils.currentLine=88539167;
 //BA.debugLineNum = 88539167;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
_nowticks = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=88539168;
 //BA.debugLineNum = 88539168;BA.debugLine="Dim currentSlot As Map = dataResolverService.Reso";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._dataresolverservice /*b4j.example.dataplaybackresolver*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_nowticks);
RDebugUtils.currentLine=88539169;
 //BA.debugLineNum = 88539169;BA.debugLine="Dim nextSlot As Map = dataResolverService.Resolve";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
_nextslot = __ref._dataresolverservice /*b4j.example.dataplaybackresolver*/ ._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_nowticks);
RDebugUtils.currentLine=88539171;
 //BA.debugLineNum = 88539171;BA.debugLine="Dim currentNeed As Int = ResolveSlotNeed(currentS";
_currentneed = __ref._resolveslotneed /*int*/ (null,_currentslot,__ref._currentslotminreserve /*int*/ );
RDebugUtils.currentLine=88539172;
 //BA.debugLineNum = 88539172;BA.debugLine="Dim nextNeed As Int = ResolveSlotNeed(nextSlot, n";
_nextneed = __ref._resolveslotneed /*int*/ (null,_nextslot,__ref._nextslotminreserve /*int*/ );
RDebugUtils.currentLine=88539174;
 //BA.debugLineNum = 88539174;BA.debugLine="Dim targetDescriptors As List = BuildTargetPlayli";
_targetdescriptors = new anywheresoftware.b4a.objects.collections.List();
_targetdescriptors = __ref._buildtargetplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null,_currentslot,_nextslot);
RDebugUtils.currentLine=88539175;
 //BA.debugLineNum = 88539175;BA.debugLine="Dim desiredTrackItems As List = BuildDesiredTrack";
_desiredtrackitems = new anywheresoftware.b4a.objects.collections.List();
_desiredtrackitems = __ref._builddesiredtrackitems /*anywheresoftware.b4a.objects.collections.List*/ (null,_targetdescriptors,_currentneed,_nextneed);
RDebugUtils.currentLine=88539177;
 //BA.debugLineNum = 88539177;BA.debugLine="summary.Put(\"current_need\", currentNeed)";
_summary.Put((Object)("current_need"),(Object)(_currentneed));
RDebugUtils.currentLine=88539178;
 //BA.debugLineNum = 88539178;BA.debugLine="summary.Put(\"next_need\", nextNeed)";
_summary.Put((Object)("next_need"),(Object)(_nextneed));
RDebugUtils.currentLine=88539179;
 //BA.debugLineNum = 88539179;BA.debugLine="summary.Put(\"candidate_count\", desiredTrackItems.";
_summary.Put((Object)("candidate_count"),(Object)(_desiredtrackitems.getSize()));
RDebugUtils.currentLine=88539181;
 //BA.debugLineNum = 88539181;BA.debugLine="If desiredTrackItems.Size = 0 Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_desiredtrackitems.getSize()==0) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=88539182;
 //BA.debugLineNum = 88539182;BA.debugLine="summary.Put(\"status\", \"nothing_to_download\")";
_summary.Put((Object)("status"),(Object)("nothing_to_download"));
RDebugUtils.currentLine=88539183;
 //BA.debugLineNum = 88539183;BA.debugLine="Trace(\"autocache step no work currentNeed=\" & cu";
__ref._trace /*String*/ (null,"autocache step no work currentNeed="+BA.NumberToString(_currentneed)+" nextNeed="+BA.NumberToString(_nextneed));
RDebugUtils.currentLine=88539184;
 //BA.debugLineNum = 88539184;BA.debugLine="RunPruneIfNeeded(\"idle\")";
__ref._runpruneifneeded /*String*/ (null,"idle");
RDebugUtils.currentLine=88539185;
 //BA.debugLineNum = 88539185;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=88539188;
 //BA.debugLineNum = 88539188;BA.debugLine="Dim actualMaxDownloads As Int = Min(maxDownloadsP";
_actualmaxdownloads = (int) (parent.__c.Min(__ref._maxdownloadsperstep /*int*/ ,_desiredtrackitems.getSize()));
RDebugUtils.currentLine=88539189;
 //BA.debugLineNum = 88539189;BA.debugLine="Trace(\"autocache step download start candidates=\"";
__ref._trace /*String*/ (null,"autocache step download start candidates="+BA.NumberToString(_desiredtrackitems.getSize())+" maxDownloads="+BA.NumberToString(_actualmaxdownloads));
RDebugUtils.currentLine=88539191;
 //BA.debugLineNum = 88539191;BA.debugLine="Wait For (mediaCacheService.EnsureTracksCached(de";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "autonomouscachemanager", "runstepasync"), __ref._mediacacheservice /*b4j.example.mediacache*/ ._ensuretrackscached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_desiredtrackitems,_actualmaxdownloads));
this.state = 28;
return;
case 28:
//C
this.state = 19;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=88539193;
 //BA.debugLineNum = 88539193;BA.debugLine="If HasMediaCacheRecentFailure Then";
if (true) break;

case 19:
//if
this.state = 22;
if (__ref._hasmediacacherecentfailure /*boolean*/ (null)) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=88539194;
 //BA.debugLineNum = 88539194;BA.debugLine="lastFailureAt = DateTime.Now";
__ref._lastfailureat /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=88539195;
 //BA.debugLineNum = 88539195;BA.debugLine="summary.Put(\"status\", \"network_failure\")";
_summary.Put((Object)("status"),(Object)("network_failure"));
RDebugUtils.currentLine=88539196;
 //BA.debugLineNum = 88539196;BA.debugLine="Trace(\"autocache step network failure\")";
__ref._trace /*String*/ (null,"autocache step network failure");
RDebugUtils.currentLine=88539197;
 //BA.debugLineNum = 88539197;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;
;
RDebugUtils.currentLine=88539200;
 //BA.debugLineNum = 88539200;BA.debugLine="If downloaded Then";

case 22:
//if
this.state = 27;
if (_downloaded) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
RDebugUtils.currentLine=88539201;
 //BA.debugLineNum = 88539201;BA.debugLine="lastSuccessfulDownloadAt = DateTime.Now";
__ref._lastsuccessfuldownloadat /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=88539202;
 //BA.debugLineNum = 88539202;BA.debugLine="summary.Put(\"status\", \"downloaded\")";
_summary.Put((Object)("status"),(Object)("downloaded"));
RDebugUtils.currentLine=88539203;
 //BA.debugLineNum = 88539203;BA.debugLine="summary.Put(\"downloaded\", True)";
_summary.Put((Object)("downloaded"),(Object)(parent.__c.True));
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=88539205;
 //BA.debugLineNum = 88539205;BA.debugLine="summary.Put(\"status\", \"no_new_downloads\")";
_summary.Put((Object)("status"),(Object)("no_new_downloads"));
RDebugUtils.currentLine=88539206;
 //BA.debugLineNum = 88539206;BA.debugLine="summary.Put(\"downloaded\", False)";
_summary.Put((Object)("downloaded"),(Object)(parent.__c.False));
 if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=88539209;
 //BA.debugLineNum = 88539209;BA.debugLine="RunPruneIfNeeded(\"post_download\")";
__ref._runpruneifneeded /*String*/ (null,"post_download");
RDebugUtils.currentLine=88539210;
 //BA.debugLineNum = 88539210;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
RDebugUtils.currentLine=88539211;
 //BA.debugLineNum = 88539211;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _stopmanager(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "stopmanager", false))
	 {return ((String) Debug.delegate(ba, "stopmanager", null));}
RDebugUtils.currentLine=88342528;
 //BA.debugLineNum = 88342528;BA.debugLine="Public Sub StopManager";
RDebugUtils.currentLine=88342529;
 //BA.debugLineNum = 88342529;BA.debugLine="isRunning = False";
__ref._isrunning /*boolean*/  = __c.False;
RDebugUtils.currentLine=88342530;
 //BA.debugLineNum = 88342530;BA.debugLine="workerTimer.Enabled = False";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=88342531;
 //BA.debugLineNum = 88342531;BA.debugLine="Trace(\"autocache manager stopped\")";
__ref._trace /*String*/ (null,"autocache manager stopped");
RDebugUtils.currentLine=88342532;
 //BA.debugLineNum = 88342532;BA.debugLine="End Sub";
return "";
}
public void  _workertimer_tick(b4j.example.autonomouscachemanager __ref) throws Exception{
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "workertimer_tick", false))
	 {Debug.delegate(ba, "workertimer_tick", null); return;}
ResumableSub_workerTimer_Tick rsub = new ResumableSub_workerTimer_Tick(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_workerTimer_Tick extends BA.ResumableSub {
public ResumableSub_workerTimer_Tick(b4j.example.autonomouscachemanager parent,b4j.example.autonomouscachemanager __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.autonomouscachemanager __ref;
b4j.example.autonomouscachemanager parent;
anywheresoftware.b4a.objects.collections.Map _summary = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="autonomouscachemanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=88473601;
 //BA.debugLineNum = 88473601;BA.debugLine="If isRunning = False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._isrunning /*boolean*/ ==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=88473602;
 //BA.debugLineNum = 88473602;BA.debugLine="If stepInProgress Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._stepinprogress /*boolean*/ ) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=88473604;
 //BA.debugLineNum = 88473604;BA.debugLine="stepInProgress = True";
__ref._stepinprogress /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=88473605;
 //BA.debugLineNum = 88473605;BA.debugLine="Wait For (RunStepAsync) Complete (summary As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "autonomouscachemanager", "workertimer_tick"), __ref._runstepasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = -1;
_summary = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=88473606;
 //BA.debugLineNum = 88473606;BA.debugLine="stepInProgress = False";
__ref._stepinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=88473607;
 //BA.debugLineNum = 88473607;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}