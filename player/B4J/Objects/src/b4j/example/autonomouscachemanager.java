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
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Public Sub Initialize( _ 	storageValue As KeyValue";
RDebugUtils.currentLine=27525128;
 //BA.debugLineNum = 27525128;BA.debugLine="kvs = storageValue";
__ref._kvs /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=27525129;
 //BA.debugLineNum = 27525129;BA.debugLine="offlineStoreService = offlineStoreValue";
__ref._offlinestoreservice /*b4j.example.offlinestore*/  = _offlinestorevalue;
RDebugUtils.currentLine=27525130;
 //BA.debugLineNum = 27525130;BA.debugLine="dataResolverService = dataResolverValue";
__ref._dataresolverservice /*b4j.example.dataplaybackresolver*/  = _dataresolvervalue;
RDebugUtils.currentLine=27525131;
 //BA.debugLineNum = 27525131;BA.debugLine="mediaCacheService = mediaCacheValue";
__ref._mediacacheservice /*b4j.example.mediacache*/  = _mediacachevalue;
RDebugUtils.currentLine=27525132;
 //BA.debugLineNum = 27525132;BA.debugLine="traceTarget = traceTargetValue";
__ref._tracetarget /*Object*/  = _tracetargetvalue;
RDebugUtils.currentLine=27525133;
 //BA.debugLineNum = 27525133;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=27525135;
 //BA.debugLineNum = 27525135;BA.debugLine="workerTimer.Initialize(\"workerTimer\", tickInterva";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"workerTimer",(long) (__ref._tickintervalms /*int*/ ));
RDebugUtils.currentLine=27525136;
 //BA.debugLineNum = 27525136;BA.debugLine="End Sub";
return "";
}
public String  _configure(b4j.example.autonomouscachemanager __ref,int _tickms,int _currentreserve,int _nextreserve,int _perplaylistreserve,int _maxdownloads) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "configure", false))
	 {return ((String) Debug.delegate(ba, "configure", new Object[] {_tickms,_currentreserve,_nextreserve,_perplaylistreserve,_maxdownloads}));}
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Public Sub Configure( _ 	tickMs As Int, _ 	current";
RDebugUtils.currentLine=27590663;
 //BA.debugLineNum = 27590663;BA.debugLine="If tickMs > 0 Then tickIntervalMs = tickMs";
if (_tickms>0) { 
__ref._tickintervalms /*int*/  = _tickms;};
RDebugUtils.currentLine=27590664;
 //BA.debugLineNum = 27590664;BA.debugLine="If currentReserve >= 0 Then currentSlotMinReserve";
if (_currentreserve>=0) { 
__ref._currentslotminreserve /*int*/  = _currentreserve;};
RDebugUtils.currentLine=27590665;
 //BA.debugLineNum = 27590665;BA.debugLine="If nextReserve >= 0 Then nextSlotMinReserve = nex";
if (_nextreserve>=0) { 
__ref._nextslotminreserve /*int*/  = _nextreserve;};
RDebugUtils.currentLine=27590666;
 //BA.debugLineNum = 27590666;BA.debugLine="If perPlaylistReserve >= 0 Then perPlaylistMinRes";
if (_perplaylistreserve>=0) { 
__ref._perplaylistminreserve /*int*/  = _perplaylistreserve;};
RDebugUtils.currentLine=27590667;
 //BA.debugLineNum = 27590667;BA.debugLine="If maxDownloads > 0 Then maxDownloadsPerStep = ma";
if (_maxdownloads>0) { 
__ref._maxdownloadsperstep /*int*/  = _maxdownloads;};
RDebugUtils.currentLine=27590669;
 //BA.debugLineNum = 27590669;BA.debugLine="workerTimer.Interval = tickIntervalMs";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._tickintervalms /*int*/ ));
RDebugUtils.currentLine=27590670;
 //BA.debugLineNum = 27590670;BA.debugLine="End Sub";
return "";
}
public String  _setcooldowns(b4j.example.autonomouscachemanager __ref,long _downloadcooldownvalue,long _failurecooldownvalue,long _prunecooldownvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "setcooldowns", false))
	 {return ((String) Debug.delegate(ba, "setcooldowns", new Object[] {_downloadcooldownvalue,_failurecooldownvalue,_prunecooldownvalue}));}
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Public Sub SetCooldowns(downloadCooldownValue As L";
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="If downloadCooldownValue >= 0 Then downloadCooldo";
if (_downloadcooldownvalue>=0) { 
__ref._downloadcooldownms /*long*/  = _downloadcooldownvalue;};
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="If failureCooldownValue >= 0 Then failureCooldown";
if (_failurecooldownvalue>=0) { 
__ref._failurecooldownms /*long*/  = _failurecooldownvalue;};
RDebugUtils.currentLine=27656195;
 //BA.debugLineNum = 27656195;BA.debugLine="If pruneCooldownValue >= 0 Then pruneCooldownMs =";
if (_prunecooldownvalue>=0) { 
__ref._prunecooldownms /*long*/  = _prunecooldownvalue;};
RDebugUtils.currentLine=27656196;
 //BA.debugLineNum = 27656196;BA.debugLine="End Sub";
return "";
}
public String  _start(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "start", false))
	 {return ((String) Debug.delegate(ba, "start", null));}
RDebugUtils.currentLine=27721728;
 //BA.debugLineNum = 27721728;BA.debugLine="Public Sub Start";
RDebugUtils.currentLine=27721729;
 //BA.debugLineNum = 27721729;BA.debugLine="isRunning = True";
__ref._isrunning /*boolean*/  = __c.True;
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="workerTimer.Interval = tickIntervalMs";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._tickintervalms /*int*/ ));
RDebugUtils.currentLine=27721731;
 //BA.debugLineNum = 27721731;BA.debugLine="workerTimer.Enabled = True";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=27721732;
 //BA.debugLineNum = 27721732;BA.debugLine="Trace(\"autocache manager started tickMs=\" & tickI";
__ref._trace /*String*/ (null,"autocache manager started tickMs="+BA.NumberToString(__ref._tickintervalms /*int*/ ));
RDebugUtils.currentLine=27721733;
 //BA.debugLineNum = 27721733;BA.debugLine="End Sub";
return "";
}
public String  _adddesiredtrackitemsforslot(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.List _result,anywheresoftware.b4a.objects.collections.Map _seentrackids,anywheresoftware.b4a.objects.collections.Map _slot,int _slotreserve,int _slotneed,String _slotlabel,anywheresoftware.b4a.objects.collections.Map _trackplayliststats) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "adddesiredtrackitemsforslot", false))
	 {return ((String) Debug.delegate(ba, "adddesiredtrackitemsforslot", new Object[] {_result,_seentrackids,_slot,_slotreserve,_slotneed,_slotlabel,_trackplayliststats}));}
anywheresoftware.b4a.objects.collections.List _playlists = null;
anywheresoftware.b4a.objects.collections.List _playlistids = null;
int _totalplayable = 0;
boolean _allplaylistsready = false;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
String _playlistid = "";
int _playlistplayablecount = 0;
anywheresoftware.b4a.objects.collections.Map _manifestsbyplaylist = null;
anywheresoftware.b4a.objects.collections.Map _manifest = null;
int _remainingneed = 0;
int _playableinplaylist = 0;
int _missingforplaylist = 0;
int _addedcount = 0;
int _addedinround = 0;
RDebugUtils.currentLine=83755008;
 //BA.debugLineNum = 83755008;BA.debugLine="Private Sub AddDesiredTrackItemsForSlot(result As";
RDebugUtils.currentLine=83755009;
 //BA.debugLineNum = 83755009;BA.debugLine="If slot.IsInitialized = False Or slot.Size = 0 Th";
if (_slot.IsInitialized()==__c.False || _slot.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=83755011;
 //BA.debugLineNum = 83755011;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = __ref._getslotplaylists /*anywheresoftware.b4a.objects.collections.List*/ (null,_slot);
RDebugUtils.currentLine=83755012;
 //BA.debugLineNum = 83755012;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=83755014;
 //BA.debugLineNum = 83755014;BA.debugLine="Dim playlistIds As List";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=83755015;
 //BA.debugLineNum = 83755015;BA.debugLine="playlistIds.Initialize";
_playlistids.Initialize();
RDebugUtils.currentLine=83755016;
 //BA.debugLineNum = 83755016;BA.debugLine="Dim totalPlayable As Int = 0";
_totalplayable = (int) (0);
RDebugUtils.currentLine=83755017;
 //BA.debugLineNum = 83755017;BA.debugLine="Dim allPlaylistsReady As Boolean = True";
_allplaylistsready = __c.True;
RDebugUtils.currentLine=83755019;
 //BA.debugLineNum = 83755019;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group8 = _playlists;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_playlistobject = group8.Get(index8);
RDebugUtils.currentLine=83755020;
 //BA.debugLineNum = 83755020;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=83755021;
 //BA.debugLineNum = 83755021;BA.debugLine="Dim descriptor As Map = playlistObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=83755022;
 //BA.debugLineNum = 83755022;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = __ref._getplaylistidfromdescriptor /*String*/ (null,_descriptor);
RDebugUtils.currentLine=83755023;
 //BA.debugLineNum = 83755023;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=83755024;
 //BA.debugLineNum = 83755024;BA.debugLine="If playlistIds.IndexOf(playlistId) >= 0 Then Con";
if (_playlistids.IndexOf((Object)(_playlistid))>=0) { 
if (true) continue;};
RDebugUtils.currentLine=83755025;
 //BA.debugLineNum = 83755025;BA.debugLine="playlistIds.Add(playlistId)";
_playlistids.Add((Object)(_playlistid));
RDebugUtils.currentLine=83755026;
 //BA.debugLineNum = 83755026;BA.debugLine="Dim playlistPlayableCount As Int = GetCachedTrac";
_playlistplayablecount = __ref._getcachedtrackcountforplaylist /*int*/ (null,_trackplayliststats,_playlistid);
RDebugUtils.currentLine=83755027;
 //BA.debugLineNum = 83755027;BA.debugLine="totalPlayable = totalPlayable + playlistPlayable";
_totalplayable = (int) (_totalplayable+_playlistplayablecount);
RDebugUtils.currentLine=83755028;
 //BA.debugLineNum = 83755028;BA.debugLine="If playlistPlayableCount < perPlaylistMinReserve";
if (_playlistplayablecount<__ref._perplaylistminreserve /*int*/ ) { 
_allplaylistsready = __c.False;};
 }
};
RDebugUtils.currentLine=83755031;
 //BA.debugLineNum = 83755031;BA.debugLine="If playlistIds.Size = 0 Then Return";
if (_playlistids.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=83755032;
 //BA.debugLineNum = 83755032;BA.debugLine="If slotNeed <= 0 And totalPlayable >= slotReserve";
if (_slotneed<=0 && _totalplayable>=_slotreserve && _allplaylistsready) { 
if (true) return "";};
RDebugUtils.currentLine=83755034;
 //BA.debugLineNum = 83755034;BA.debugLine="Dim manifestsByPlaylist As Map";
_manifestsbyplaylist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=83755035;
 //BA.debugLineNum = 83755035;BA.debugLine="manifestsByPlaylist.Initialize";
_manifestsbyplaylist.Initialize();
RDebugUtils.currentLine=83755036;
 //BA.debugLineNum = 83755036;BA.debugLine="totalPlayable = 0";
_totalplayable = (int) (0);
RDebugUtils.currentLine=83755038;
 //BA.debugLineNum = 83755038;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group24 = _playlists;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_playlistobject = group24.Get(index24);
RDebugUtils.currentLine=83755039;
 //BA.debugLineNum = 83755039;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=83755041;
 //BA.debugLineNum = 83755041;BA.debugLine="Dim descriptor As Map = playlistObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=83755042;
 //BA.debugLineNum = 83755042;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = __ref._getplaylistidfromdescriptor /*String*/ (null,_descriptor);
RDebugUtils.currentLine=83755043;
 //BA.debugLineNum = 83755043;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=83755045;
 //BA.debugLineNum = 83755045;BA.debugLine="Dim manifest As Map = LoadPlaylistManifestSafe(p";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = __ref._loadplaylistmanifestsafe /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=83755046;
 //BA.debugLineNum = 83755046;BA.debugLine="If manifest.IsInitialized = False Or manifest.Si";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=83755047;
 //BA.debugLineNum = 83755047;BA.debugLine="If manifestsByPlaylist.ContainsKey(playlistId) T";
if (_manifestsbyplaylist.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
RDebugUtils.currentLine=83755049;
 //BA.debugLineNum = 83755049;BA.debugLine="manifestsByPlaylist.Put(playlistId, manifest)";
_manifestsbyplaylist.Put((Object)(_playlistid),(Object)(_manifest.getObject()));
RDebugUtils.currentLine=83755050;
 //BA.debugLineNum = 83755050;BA.debugLine="totalPlayable = totalPlayable + GetCachedTrackCo";
_totalplayable = (int) (_totalplayable+__ref._getcachedtrackcountforplaylist /*int*/ (null,_trackplayliststats,_playlistid));
 }
};
RDebugUtils.currentLine=83755053;
 //BA.debugLineNum = 83755053;BA.debugLine="If playlistIds.Size = 0 Then Return";
if (_playlistids.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=83755055;
 //BA.debugLineNum = 83755055;BA.debugLine="Dim remainingNeed As Int = Max(0, slotReserve - t";
_remainingneed = (int) (__c.Max(0,_slotreserve-_totalplayable));
RDebugUtils.currentLine=83755056;
 //BA.debugLineNum = 83755056;BA.debugLine="If slotNeed > remainingNeed Then remainingNeed =";
if (_slotneed>_remainingneed) { 
_remainingneed = _slotneed;};
RDebugUtils.currentLine=83755058;
 //BA.debugLineNum = 83755058;BA.debugLine="For Each playlistId As String In playlistIds";
{
final anywheresoftware.b4a.BA.IterableList group38 = _playlistids;
final int groupLen38 = group38.getSize()
;int index38 = 0;
;
for (; index38 < groupLen38;index38++){
_playlistid = BA.ObjectToString(group38.Get(index38));
RDebugUtils.currentLine=83755059;
 //BA.debugLineNum = 83755059;BA.debugLine="Dim manifest As Map = manifestsByPlaylist.Get(pl";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_manifestsbyplaylist.Get((Object)(_playlistid))));
RDebugUtils.currentLine=83755060;
 //BA.debugLineNum = 83755060;BA.debugLine="Dim playableInPlaylist As Int = GetCachedTrackCo";
_playableinplaylist = __ref._getcachedtrackcountforplaylist /*int*/ (null,_trackplayliststats,_playlistid);
RDebugUtils.currentLine=83755061;
 //BA.debugLineNum = 83755061;BA.debugLine="Dim missingForPlaylist As Int = Max(0, perPlayli";
_missingforplaylist = (int) (__c.Max(0,__ref._perplaylistminreserve /*int*/ -_playableinplaylist));
RDebugUtils.currentLine=83755062;
 //BA.debugLineNum = 83755062;BA.debugLine="If missingForPlaylist <= 0 Then Continue";
if (_missingforplaylist<=0) { 
if (true) continue;};
RDebugUtils.currentLine=83755063;
 //BA.debugLineNum = 83755063;BA.debugLine="Dim addedCount As Int = CollectUpcomingTracksFor";
_addedcount = __ref._collectupcomingtracksforplaylist /*int*/ (null,_result,_seentrackids,_playlistid,_missingforplaylist);
RDebugUtils.currentLine=83755064;
 //BA.debugLineNum = 83755064;BA.debugLine="If addedCount > 0 Then";
if (_addedcount>0) { 
RDebugUtils.currentLine=83755065;
 //BA.debugLineNum = 83755065;BA.debugLine="Trace(\"autocache slot fill slot=\" & slotLabel &";
__ref._trace /*String*/ (null,"autocache slot fill slot="+_slotlabel+" playlistId="+_playlistid+" added="+BA.NumberToString(_addedcount)+" reason=per_playlist_min");
 };
 }
};
RDebugUtils.currentLine=83755069;
 //BA.debugLineNum = 83755069;BA.debugLine="If remainingNeed <= 0 Then Return";
if (_remainingneed<=0) { 
if (true) return "";};
RDebugUtils.currentLine=83755071;
 //BA.debugLineNum = 83755071;BA.debugLine="Do While remainingNeed > 0";
while (_remainingneed>0) {
RDebugUtils.currentLine=83755072;
 //BA.debugLineNum = 83755072;BA.debugLine="Dim addedInRound As Int = 0";
_addedinround = (int) (0);
RDebugUtils.currentLine=83755073;
 //BA.debugLineNum = 83755073;BA.debugLine="For Each playlistId As String In playlistIds";
{
final anywheresoftware.b4a.BA.IterableList group51 = _playlistids;
final int groupLen51 = group51.getSize()
;int index51 = 0;
;
for (; index51 < groupLen51;index51++){
_playlistid = BA.ObjectToString(group51.Get(index51));
RDebugUtils.currentLine=83755074;
 //BA.debugLineNum = 83755074;BA.debugLine="If remainingNeed <= 0 Then Exit";
if (_remainingneed<=0) { 
if (true) break;};
RDebugUtils.currentLine=83755075;
 //BA.debugLineNum = 83755075;BA.debugLine="Dim addedCount As Int = CollectUpcomingTracksFo";
_addedcount = __ref._collectupcomingtracksforplaylist /*int*/ (null,_result,_seentrackids,_playlistid,(int) (1));
RDebugUtils.currentLine=83755076;
 //BA.debugLineNum = 83755076;BA.debugLine="If addedCount <= 0 Then Continue";
if (_addedcount<=0) { 
if (true) continue;};
RDebugUtils.currentLine=83755077;
 //BA.debugLineNum = 83755077;BA.debugLine="addedInRound = addedInRound + addedCount";
_addedinround = (int) (_addedinround+_addedcount);
RDebugUtils.currentLine=83755078;
 //BA.debugLineNum = 83755078;BA.debugLine="remainingNeed = Max(0, remainingNeed - addedCou";
_remainingneed = (int) (__c.Max(0,_remainingneed-_addedcount));
 }
};
RDebugUtils.currentLine=83755080;
 //BA.debugLineNum = 83755080;BA.debugLine="If addedInRound <= 0 Then Exit";
if (_addedinround<=0) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=83755082;
 //BA.debugLineNum = 83755082;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Private Sub GetSlotPlaylists(slot As Map) As List";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="If slot.IsInitialized = False Then";
if (_slot.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="Dim emptyList As List";
_emptylist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28835843;
 //BA.debugLineNum = 28835843;BA.debugLine="emptyList.Initialize";
_emptylist.Initialize();
RDebugUtils.currentLine=28835844;
 //BA.debugLineNum = 28835844;BA.debugLine="Return emptyList";
if (true) return _emptylist;
 };
RDebugUtils.currentLine=28835847;
 //BA.debugLineNum = 28835847;BA.debugLine="Dim playlists As List = slot.GetDefault(\"playlist";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=28835848;
 //BA.debugLineNum = 28835848;BA.debugLine="If playlists.IsInitialized Then Return playlists";
if (_playlists.IsInitialized()) { 
if (true) return _playlists;};
RDebugUtils.currentLine=28835850;
 //BA.debugLineNum = 28835850;BA.debugLine="playlists = slot.GetDefault(\"playlist_descriptors";
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slot.GetDefault((Object)("playlist_descriptors"),__c.Null)));
RDebugUtils.currentLine=28835851;
 //BA.debugLineNum = 28835851;BA.debugLine="If playlists.IsInitialized Then Return playlists";
if (_playlists.IsInitialized()) { 
if (true) return _playlists;};
RDebugUtils.currentLine=28835853;
 //BA.debugLineNum = 28835853;BA.debugLine="Dim emptyResult As List";
_emptyresult = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28835854;
 //BA.debugLineNum = 28835854;BA.debugLine="emptyResult.Initialize";
_emptyresult.Initialize();
RDebugUtils.currentLine=28835855;
 //BA.debugLineNum = 28835855;BA.debugLine="Return emptyResult";
if (true) return _emptyresult;
RDebugUtils.currentLine=28835856;
 //BA.debugLineNum = 28835856;BA.debugLine="End Sub";
return null;
}
public String  _getplaylistidfromdescriptor(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _descriptor) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "getplaylistidfromdescriptor", false))
	 {return ((String) Debug.delegate(ba, "getplaylistidfromdescriptor", new Object[] {_descriptor}));}
String _playlistid = "";
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Private Sub GetPlaylistIdFromDescriptor(descriptor";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="If descriptor.IsInitialized = False Then Return \"";
if (_descriptor.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=28901379;
 //BA.debugLineNum = 28901379;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=28901380;
 //BA.debugLineNum = 28901380;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
if ((_playlistid).equals("") == false) { 
if (true) return _playlistid;};
RDebugUtils.currentLine=28901382;
 //BA.debugLineNum = 28901382;BA.debugLine="playlistId = descriptor.GetDefault(\"playlist_id\",";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=28901383;
 //BA.debugLineNum = 28901383;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
if ((_playlistid).equals("") == false) { 
if (true) return _playlistid;};
RDebugUtils.currentLine=28901385;
 //BA.debugLineNum = 28901385;BA.debugLine="playlistId = descriptor.GetDefault(\"playlistId\",";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("playlistId"),(Object)("")));
RDebugUtils.currentLine=28901386;
 //BA.debugLineNum = 28901386;BA.debugLine="Return playlistId";
if (true) return _playlistid;
RDebugUtils.currentLine=28901387;
 //BA.debugLineNum = 28901387;BA.debugLine="End Sub";
return "";
}
public int  _getcachedtrackcountforplaylist(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _trackplayliststats,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "getcachedtrackcountforplaylist", false))
	 {return ((Integer) Debug.delegate(ba, "getcachedtrackcountforplaylist", new Object[] {_trackplayliststats,_playlistid}));}
String _statskey = "";
anywheresoftware.b4a.objects.collections.Map _playlistentry = null;
RDebugUtils.currentLine=86245376;
 //BA.debugLineNum = 86245376;BA.debugLine="Private Sub GetCachedTrackCountForPlaylist(trackPl";
RDebugUtils.currentLine=86245377;
 //BA.debugLineNum = 86245377;BA.debugLine="If trackPlaylistStats.IsInitialized = False Then";
if (_trackplayliststats.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=86245378;
 //BA.debugLineNum = 86245378;BA.debugLine="Dim statsKey As String = playlistId";
_statskey = _playlistid;
RDebugUtils.currentLine=86245379;
 //BA.debugLineNum = 86245379;BA.debugLine="If statsKey = \"\" Then statsKey = \"_unknown\"";
if ((_statskey).equals("")) { 
_statskey = "_unknown";};
RDebugUtils.currentLine=86245380;
 //BA.debugLineNum = 86245380;BA.debugLine="Dim playlistEntry As Map = trackPlaylistStats.Get";
_playlistentry = new anywheresoftware.b4a.objects.collections.Map();
_playlistentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackplayliststats.GetDefault((Object)(_statskey),__c.Null)));
RDebugUtils.currentLine=86245381;
 //BA.debugLineNum = 86245381;BA.debugLine="If playlistEntry.IsInitialized = False Then Retur";
if (_playlistentry.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=86245382;
 //BA.debugLineNum = 86245382;BA.debugLine="Return playlistEntry.GetDefault(\"count\", 0)";
if (true) return (int)(BA.ObjectToNumber(_playlistentry.GetDefault((Object)("count"),(Object)(0))));
RDebugUtils.currentLine=86245383;
 //BA.debugLineNum = 86245383;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _loadplaylistmanifestsafe(b4j.example.autonomouscachemanager __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "loadplaylistmanifestsafe", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadplaylistmanifestsafe", new Object[] {_playlistid}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Private Sub LoadPlaylistManifestSafe(playlistId As";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="If playlistId = \"\" Then Return result";
if ((_playlistid).equals("")) { 
if (true) return _result;};
RDebugUtils.currentLine=28966917;
 //BA.debugLineNum = 28966917;BA.debugLine="Try";
try {RDebugUtils.currentLine=28966918;
 //BA.debugLineNum = 28966918;BA.debugLine="result = dataResolverService.GetPlaylistPlayback";
_result = __ref._dataresolverservice /*b4j.example.dataplaybackresolver*/ ._getplaylistplaybackmanifestbyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=28966920;
 //BA.debugLineNum = 28966920;BA.debugLine="result.Initialize";
_result.Initialize();
 };
RDebugUtils.currentLine=28966923;
 //BA.debugLineNum = 28966923;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=28966924;
 //BA.debugLineNum = 28966924;BA.debugLine="End Sub";
return null;
}
public int  _collectupcomingtracksforplaylist(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.List _result,anywheresoftware.b4a.objects.collections.Map _seentrackids,String _playlistid,int _limitcount) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "collectupcomingtracksforplaylist", false))
	 {return ((Integer) Debug.delegate(ba, "collectupcomingtracksforplaylist", new Object[] {_result,_seentrackids,_playlistid,_limitcount}));}
int _requestcount = 0;
anywheresoftware.b4a.objects.collections.List _upcomingtracks = null;
int _addedcount = 0;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _normalizedtrack = null;
RDebugUtils.currentLine=83951616;
 //BA.debugLineNum = 83951616;BA.debugLine="Private Sub CollectUpcomingTracksForPlaylist(resul";
RDebugUtils.currentLine=83951617;
 //BA.debugLineNum = 83951617;BA.debugLine="If playlistId = \"\" Or limitCount <= 0 Then Return";
if ((_playlistid).equals("") || _limitcount<=0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=83951618;
 //BA.debugLineNum = 83951618;BA.debugLine="Dim requestCount As Int = Max(limitCount * 8, per";
_requestcount = (int) (__c.Max(_limitcount*8,__ref._perplaylistminreserve /*int*/ *8));
RDebugUtils.currentLine=83951619;
 //BA.debugLineNum = 83951619;BA.debugLine="Dim upcomingTracks As List = dataResolverService.";
_upcomingtracks = new anywheresoftware.b4a.objects.collections.List();
_upcomingtracks = __ref._dataresolverservice /*b4j.example.dataplaybackresolver*/ ._getupcomingplaybacktracksbyid /*anywheresoftware.b4a.objects.collections.List*/ (null,_playlistid,_requestcount,__ref._mediacacheservice /*b4j.example.mediacache*/ ,__c.False);
RDebugUtils.currentLine=83951620;
 //BA.debugLineNum = 83951620;BA.debugLine="If upcomingTracks.IsInitialized = False Or upcomi";
if (_upcomingtracks.IsInitialized()==__c.False || _upcomingtracks.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=83951621;
 //BA.debugLineNum = 83951621;BA.debugLine="Dim addedCount As Int = 0";
_addedcount = (int) (0);
RDebugUtils.currentLine=83951622;
 //BA.debugLineNum = 83951622;BA.debugLine="For Each trackObject As Object In upcomingTracks";
{
final anywheresoftware.b4a.BA.IterableList group6 = _upcomingtracks;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_trackobject = group6.Get(index6);
RDebugUtils.currentLine=83951623;
 //BA.debugLineNum = 83951623;BA.debugLine="If addedCount >= limitCount Then Exit";
if (_addedcount>=_limitcount) { 
if (true) break;};
RDebugUtils.currentLine=83951624;
 //BA.debugLineNum = 83951624;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=83951625;
 //BA.debugLineNum = 83951625;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=83951626;
 //BA.debugLineNum = 83951626;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=83951627;
 //BA.debugLineNum = 83951627;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=83951628;
 //BA.debugLineNum = 83951628;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Contin";
if (_seentrackids.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
RDebugUtils.currentLine=83951629;
 //BA.debugLineNum = 83951629;BA.debugLine="If IsTrackAlreadyAvailable(track, playlistId) Th";
if (__ref._istrackalreadyavailable /*boolean*/ (null,_track,_playlistid)) { 
if (true) continue;};
RDebugUtils.currentLine=83951630;
 //BA.debugLineNum = 83951630;BA.debugLine="Dim normalizedTrack As Map = CloneMap(track)";
_normalizedtrack = new anywheresoftware.b4a.objects.collections.Map();
_normalizedtrack = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_track);
RDebugUtils.currentLine=83951631;
 //BA.debugLineNum = 83951631;BA.debugLine="If normalizedTrack.ContainsKey(\"type\") = False T";
if (_normalizedtrack.ContainsKey((Object)("type"))==__c.False) { 
_normalizedtrack.Put((Object)("type"),(Object)("track"));};
RDebugUtils.currentLine=83951632;
 //BA.debugLineNum = 83951632;BA.debugLine="normalizedTrack.Put(\"playlist_prefetch_source\",";
_normalizedtrack.Put((Object)("playlist_prefetch_source"),(Object)("playback_upcoming"));
RDebugUtils.currentLine=83951633;
 //BA.debugLineNum = 83951633;BA.debugLine="result.Add(normalizedTrack)";
_result.Add((Object)(_normalizedtrack.getObject()));
RDebugUtils.currentLine=83951634;
 //BA.debugLineNum = 83951634;BA.debugLine="seenTrackIds.Put(trackId, True)";
_seentrackids.Put((Object)(_trackid),(Object)(__c.True));
RDebugUtils.currentLine=83951635;
 //BA.debugLineNum = 83951635;BA.debugLine="addedCount = addedCount + 1";
_addedcount = (int) (_addedcount+1);
RDebugUtils.currentLine=83951636;
 //BA.debugLineNum = 83951636;BA.debugLine="Trace(\"autocache candidate playlistId=\" & playli";
__ref._trace /*String*/ (null,"autocache candidate playlistId="+_playlistid+" orderIndex="+BA.ObjectToString(_normalizedtrack.GetDefault((Object)("playlist_track_index"),(Object)(-1)))+" trackId="+_trackid+" source=playback_manifest_cursor");
 }
};
RDebugUtils.currentLine=83951638;
 //BA.debugLineNum = 83951638;BA.debugLine="Return addedCount";
if (true) return _addedcount;
RDebugUtils.currentLine=83951639;
 //BA.debugLineNum = 83951639;BA.debugLine="End Sub";
return 0;
}
public String  _trace(b4j.example.autonomouscachemanager __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=29360129;
 //BA.debugLineNum = 29360129;BA.debugLine="If traceTarget = Null Then";
if (__ref._tracetarget /*Object*/ == null) { 
RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="Log(message)";
__c.LogImpl("229360130",_message,0);
RDebugUtils.currentLine=29360131;
 //BA.debugLineNum = 29360131;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=29360134;
 //BA.debugLineNum = 29360134;BA.debugLine="If traceSubName = \"\" Then";
if ((__ref._tracesubname /*String*/ ).equals("")) { 
RDebugUtils.currentLine=29360135;
 //BA.debugLineNum = 29360135;BA.debugLine="Log(message)";
__c.LogImpl("229360135",_message,0);
RDebugUtils.currentLine=29360136;
 //BA.debugLineNum = 29360136;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=29360139;
 //BA.debugLineNum = 29360139;BA.debugLine="Try";
try {RDebugUtils.currentLine=29360140;
 //BA.debugLineNum = 29360140;BA.debugLine="CallSub2(traceTarget, traceSubName, message)";
__c.CallSubNew2(ba,__ref._tracetarget /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=29360142;
 //BA.debugLineNum = 29360142;BA.debugLine="Log(message)";
__c.LogImpl("229360142",_message,0);
 };
RDebugUtils.currentLine=29360144;
 //BA.debugLineNum = 29360144;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _builddesiredtrackitemsforslots(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _nextslot,int _currentneed,int _nextneed,anywheresoftware.b4a.objects.collections.Map _trackplayliststats) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "builddesiredtrackitemsforslots", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "builddesiredtrackitemsforslots", new Object[] {_currentslot,_nextslot,_currentneed,_nextneed,_trackplayliststats}));}
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _seentrackids = null;
RDebugUtils.currentLine=83689472;
 //BA.debugLineNum = 83689472;BA.debugLine="Private Sub BuildDesiredTrackItemsForSlots(current";
RDebugUtils.currentLine=83689473;
 //BA.debugLineNum = 83689473;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=83689474;
 //BA.debugLineNum = 83689474;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=83689476;
 //BA.debugLineNum = 83689476;BA.debugLine="Dim seenTrackIds As Map";
_seentrackids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=83689477;
 //BA.debugLineNum = 83689477;BA.debugLine="seenTrackIds.Initialize";
_seentrackids.Initialize();
RDebugUtils.currentLine=83689479;
 //BA.debugLineNum = 83689479;BA.debugLine="AddDesiredTrackItemsForSlot(result, seenTrackIds,";
__ref._adddesiredtrackitemsforslot /*String*/ (null,_result,_seentrackids,_currentslot,__ref._currentslotminreserve /*int*/ ,_currentneed,"current",_trackplayliststats);
RDebugUtils.currentLine=83689480;
 //BA.debugLineNum = 83689480;BA.debugLine="AddDesiredTrackItemsForSlot(result, seenTrackIds,";
__ref._adddesiredtrackitemsforslot /*String*/ (null,_result,_seentrackids,_nextslot,__ref._nextslotminreserve /*int*/ ,_nextneed,"next",_trackplayliststats);
RDebugUtils.currentLine=83689482;
 //BA.debugLineNum = 83689482;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=83689483;
 //BA.debugLineNum = 83689483;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _buildprotectedtrackids(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "buildprotectedtrackids", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "buildprotectedtrackids", null));}
anywheresoftware.b4a.objects.collections.List _result = null;
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Private Sub BuildProtectedTrackIds As List";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=28704771;
 //BA.debugLineNum = 28704771;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=28704772;
 //BA.debugLineNum = 28704772;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Private Sub BuildRelevantTrackIds As List";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=28770308;
 //BA.debugLineNum = 28770308;BA.debugLine="Dim relevantIds As Map";
_relevantids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28770309;
 //BA.debugLineNum = 28770309;BA.debugLine="relevantIds.Initialize";
_relevantids.Initialize();
RDebugUtils.currentLine=28770311;
 //BA.debugLineNum = 28770311;BA.debugLine="Dim descriptors As List = GetStoredPlaylistDescri";
_descriptors = new anywheresoftware.b4a.objects.collections.List();
_descriptors = __ref._getstoredplaylistdescriptorssafe /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=28770312;
 //BA.debugLineNum = 28770312;BA.debugLine="If descriptors.IsInitialized = False Or descripto";
if (_descriptors.IsInitialized()==__c.False || _descriptors.getSize()==0) { 
if (true) return _result;};
RDebugUtils.currentLine=28770314;
 //BA.debugLineNum = 28770314;BA.debugLine="For Each descriptorObject As Object In descriptor";
{
final anywheresoftware.b4a.BA.IterableList group7 = _descriptors;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_descriptorobject = group7.Get(index7);
RDebugUtils.currentLine=28770315;
 //BA.debugLineNum = 28770315;BA.debugLine="If (descriptorObject Is Map) = False Then Contin";
if ((_descriptorobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=28770317;
 //BA.debugLineNum = 28770317;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=28770318;
 //BA.debugLineNum = 28770318;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = __ref._getplaylistidfromdescriptor /*String*/ (null,_descriptor);
RDebugUtils.currentLine=28770319;
 //BA.debugLineNum = 28770319;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=28770321;
 //BA.debugLineNum = 28770321;BA.debugLine="Dim manifest As Map = LoadPlaylistManifestSafe(p";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = __ref._loadplaylistmanifestsafe /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=28770322;
 //BA.debugLineNum = 28770322;BA.debugLine="If manifest.IsInitialized = False Or manifest.Si";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=28770324;
 //BA.debugLineNum = 28770324;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
_order = new anywheresoftware.b4a.objects.collections.List();
_order = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_manifest.GetDefault((Object)("order"),__c.Null)));
RDebugUtils.currentLine=28770325;
 //BA.debugLineNum = 28770325;BA.debugLine="If order.IsInitialized = False Then Continue";
if (_order.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=28770327;
 //BA.debugLineNum = 28770327;BA.debugLine="For Each trackId As String In order";
{
final anywheresoftware.b4a.BA.IterableList group16 = _order;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_trackid = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=28770328;
 //BA.debugLineNum = 28770328;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=28770329;
 //BA.debugLineNum = 28770329;BA.debugLine="If relevantIds.ContainsKey(trackId) Then Contin";
if (_relevantids.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
RDebugUtils.currentLine=28770330;
 //BA.debugLineNum = 28770330;BA.debugLine="relevantIds.Put(trackId, True)";
_relevantids.Put((Object)(_trackid),(Object)(__c.True));
 }
};
 }
};
RDebugUtils.currentLine=28770334;
 //BA.debugLineNum = 28770334;BA.debugLine="For Each trackId As String In relevantIds.Keys";
{
final anywheresoftware.b4a.BA.IterableList group22 = _relevantids.Keys();
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_trackid = BA.ObjectToString(group22.Get(index22));
RDebugUtils.currentLine=28770335;
 //BA.debugLineNum = 28770335;BA.debugLine="result.Add(trackId)";
_result.Add((Object)(_trackid));
 }
};
RDebugUtils.currentLine=28770338;
 //BA.debugLineNum = 28770338;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=28770339;
 //BA.debugLineNum = 28770339;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getstoredplaylistdescriptorssafe(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "getstoredplaylistdescriptorssafe", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getstoredplaylistdescriptorssafe", null));}
anywheresoftware.b4a.objects.collections.List _result = null;
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Private Sub GetStoredPlaylistDescriptorsSafe As Li";
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=29032452;
 //BA.debugLineNum = 29032452;BA.debugLine="Try";
try {RDebugUtils.currentLine=29032453;
 //BA.debugLineNum = 29032453;BA.debugLine="result = offlineStoreService.GetStoredPlaylistDe";
_result = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getstoredplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=29032455;
 //BA.debugLineNum = 29032455;BA.debugLine="result.Initialize";
_result.Initialize();
 };
RDebugUtils.currentLine=29032458;
 //BA.debugLineNum = 29032458;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=29032459;
 //BA.debugLineNum = 29032459;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="Private kvs As KeyValueStore";
_kvs = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="Private offlineStoreService As OfflineStore";
_offlinestoreservice = new b4j.example.offlinestore();
RDebugUtils.currentLine=27459587;
 //BA.debugLineNum = 27459587;BA.debugLine="Private dataResolverService As DataPlaybackResolv";
_dataresolverservice = new b4j.example.dataplaybackresolver();
RDebugUtils.currentLine=27459588;
 //BA.debugLineNum = 27459588;BA.debugLine="Private mediaCacheService As MediaCache";
_mediacacheservice = new b4j.example.mediacache();
RDebugUtils.currentLine=27459590;
 //BA.debugLineNum = 27459590;BA.debugLine="Private traceTarget As Object";
_tracetarget = new Object();
RDebugUtils.currentLine=27459591;
 //BA.debugLineNum = 27459591;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=27459593;
 //BA.debugLineNum = 27459593;BA.debugLine="Private workerTimer As Timer";
_workertimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=27459594;
 //BA.debugLineNum = 27459594;BA.debugLine="Private isRunning As Boolean";
_isrunning = false;
RDebugUtils.currentLine=27459595;
 //BA.debugLineNum = 27459595;BA.debugLine="Private stepInProgress As Boolean";
_stepinprogress = false;
RDebugUtils.currentLine=27459597;
 //BA.debugLineNum = 27459597;BA.debugLine="Private Const DEFAULT_TICK_INTERVAL_MS As Int = 3";
_default_tick_interval_ms = (int) (30000);
RDebugUtils.currentLine=27459598;
 //BA.debugLineNum = 27459598;BA.debugLine="Private Const DEFAULT_DOWNLOAD_COOLDOWN_MS As Lon";
_default_download_cooldown_ms = (long) (15000);
RDebugUtils.currentLine=27459599;
 //BA.debugLineNum = 27459599;BA.debugLine="Private Const DEFAULT_FAILURE_COOLDOWN_MS As Long";
_default_failure_cooldown_ms = (long) (120000);
RDebugUtils.currentLine=27459600;
 //BA.debugLineNum = 27459600;BA.debugLine="Private Const DEFAULT_PRUNE_COOLDOWN_MS As Long =";
_default_prune_cooldown_ms = (long) (60000);
RDebugUtils.currentLine=27459602;
 //BA.debugLineNum = 27459602;BA.debugLine="Private Const DEFAULT_CURRENT_SLOT_MIN_RESERVE As";
_default_current_slot_min_reserve = (int) (8);
RDebugUtils.currentLine=27459603;
 //BA.debugLineNum = 27459603;BA.debugLine="Private Const DEFAULT_NEXT_SLOT_MIN_RESERVE As In";
_default_next_slot_min_reserve = (int) (4);
RDebugUtils.currentLine=27459604;
 //BA.debugLineNum = 27459604;BA.debugLine="Private Const DEFAULT_PER_PLAYLIST_MIN_RESERVE As";
_default_per_playlist_min_reserve = (int) (2);
RDebugUtils.currentLine=27459605;
 //BA.debugLineNum = 27459605;BA.debugLine="Private Const DEFAULT_MAX_DOWNLOADS_PER_STEP As I";
_default_max_downloads_per_step = (int) (2);
RDebugUtils.currentLine=27459607;
 //BA.debugLineNum = 27459607;BA.debugLine="Private tickIntervalMs As Int = DEFAULT_TICK_INTE";
_tickintervalms = __ref._default_tick_interval_ms /*int*/ ;
RDebugUtils.currentLine=27459608;
 //BA.debugLineNum = 27459608;BA.debugLine="Private downloadCooldownMs As Long = DEFAULT_DOWN";
_downloadcooldownms = __ref._default_download_cooldown_ms /*long*/ ;
RDebugUtils.currentLine=27459609;
 //BA.debugLineNum = 27459609;BA.debugLine="Private failureCooldownMs As Long = DEFAULT_FAILU";
_failurecooldownms = __ref._default_failure_cooldown_ms /*long*/ ;
RDebugUtils.currentLine=27459610;
 //BA.debugLineNum = 27459610;BA.debugLine="Private pruneCooldownMs As Long = DEFAULT_PRUNE_C";
_prunecooldownms = __ref._default_prune_cooldown_ms /*long*/ ;
RDebugUtils.currentLine=27459612;
 //BA.debugLineNum = 27459612;BA.debugLine="Private currentSlotMinReserve As Int = DEFAULT_CU";
_currentslotminreserve = __ref._default_current_slot_min_reserve /*int*/ ;
RDebugUtils.currentLine=27459613;
 //BA.debugLineNum = 27459613;BA.debugLine="Private nextSlotMinReserve As Int = DEFAULT_NEXT_";
_nextslotminreserve = __ref._default_next_slot_min_reserve /*int*/ ;
RDebugUtils.currentLine=27459614;
 //BA.debugLineNum = 27459614;BA.debugLine="Private perPlaylistMinReserve As Int = DEFAULT_PE";
_perplaylistminreserve = __ref._default_per_playlist_min_reserve /*int*/ ;
RDebugUtils.currentLine=27459615;
 //BA.debugLineNum = 27459615;BA.debugLine="Private maxDownloadsPerStep As Int = DEFAULT_MAX_";
_maxdownloadsperstep = __ref._default_max_downloads_per_step /*int*/ ;
RDebugUtils.currentLine=27459617;
 //BA.debugLineNum = 27459617;BA.debugLine="Private lastSuccessfulDownloadAt As Long";
_lastsuccessfuldownloadat = 0L;
RDebugUtils.currentLine=27459618;
 //BA.debugLineNum = 27459618;BA.debugLine="Private lastFailureAt As Long";
_lastfailureat = 0L;
RDebugUtils.currentLine=27459619;
 //BA.debugLineNum = 27459619;BA.debugLine="Private lastPruneAt As Long";
_lastpruneat = 0L;
RDebugUtils.currentLine=27459620;
 //BA.debugLineNum = 27459620;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
Object _key = null;
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=29294596;
 //BA.debugLineNum = 29294596;BA.debugLine="If sourceMap.IsInitialized = False Then Return re";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _result;};
RDebugUtils.currentLine=29294598;
 //BA.debugLineNum = 29294598;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=29294599;
 //BA.debugLineNum = 29294599;BA.debugLine="result.Put(key, sourceMap.Get(key))";
_result.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=29294602;
 //BA.debugLineNum = 29294602;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=29294603;
 //BA.debugLineNum = 29294603;BA.debugLine="End Sub";
return null;
}
public boolean  _istrackalreadyavailable(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _track,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "istrackalreadyavailable", false))
	 {return ((Boolean) Debug.delegate(ba, "istrackalreadyavailable", new Object[] {_track,_playlistid}));}
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _normalizedtrack = null;
RDebugUtils.currentLine=83820544;
 //BA.debugLineNum = 83820544;BA.debugLine="Private Sub IsTrackAlreadyAvailable(track As Map,";
RDebugUtils.currentLine=83820545;
 //BA.debugLineNum = 83820545;BA.debugLine="If track.IsInitialized = False Then Return False";
if (_track.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=83820546;
 //BA.debugLineNum = 83820546;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"\"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=83820547;
 //BA.debugLineNum = 83820547;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=83820548;
 //BA.debugLineNum = 83820548;BA.debugLine="If playlistId = \"\" Then playlistId = track.GetDef";
if ((_playlistid).equals("")) { 
_playlistid = BA.ObjectToString(_track.GetDefault((Object)("playlist_id"),(Object)("")));};
RDebugUtils.currentLine=83820549;
 //BA.debugLineNum = 83820549;BA.debugLine="If playlistId <> \"\" And mediaCacheService.HasTrac";
if ((_playlistid).equals("") == false && __ref._mediacacheservice /*b4j.example.mediacache*/ ._hastrackfilebyplaylist /*boolean*/ (null,_trackid,_playlistid)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=83820550;
 //BA.debugLineNum = 83820550;BA.debugLine="If mediaCacheService.IsTrackCached(trackId) Then";
if (__ref._mediacacheservice /*b4j.example.mediacache*/ ._istrackcached /*boolean*/ (null,_trackid)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=83820551;
 //BA.debugLineNum = 83820551;BA.debugLine="Dim normalizedTrack As Map = CloneMap(track)";
_normalizedtrack = new anywheresoftware.b4a.objects.collections.Map();
_normalizedtrack = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_track);
RDebugUtils.currentLine=83820552;
 //BA.debugLineNum = 83820552;BA.debugLine="If normalizedTrack.ContainsKey(\"type\") = False Th";
if (_normalizedtrack.ContainsKey((Object)("type"))==__c.False) { 
_normalizedtrack.Put((Object)("type"),(Object)("track"));};
RDebugUtils.currentLine=83820553;
 //BA.debugLineNum = 83820553;BA.debugLine="If playlistId <> \"\" And normalizedTrack.ContainsK";
if ((_playlistid).equals("") == false && _normalizedtrack.ContainsKey((Object)("playlist_id"))==__c.False) { 
_normalizedtrack.Put((Object)("playlist_id"),(Object)(_playlistid));};
RDebugUtils.currentLine=83820554;
 //BA.debugLineNum = 83820554;BA.debugLine="Return mediaCacheService.HasValidatedLocalMedia(n";
if (true) return __ref._mediacacheservice /*b4j.example.mediacache*/ ._hasvalidatedlocalmedia /*boolean*/ (null,_normalizedtrack);
RDebugUtils.currentLine=83820555;
 //BA.debugLineNum = 83820555;BA.debugLine="End Sub";
return false;
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
RDebugUtils.currentLine=28180480;
 //BA.debugLineNum = 28180480;BA.debugLine="Private Sub CountPlayableTracksInManifest(manifest";
RDebugUtils.currentLine=28180481;
 //BA.debugLineNum = 28180481;BA.debugLine="If manifest.IsInitialized = False Then Return 0";
if (_manifest.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28180483;
 //BA.debugLineNum = 28180483;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
_order = new anywheresoftware.b4a.objects.collections.List();
_order = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_manifest.GetDefault((Object)("order"),__c.Null)));
RDebugUtils.currentLine=28180484;
 //BA.debugLineNum = 28180484;BA.debugLine="Dim trackMap As Map = manifest.GetDefault(\"tracks";
_trackmap = new anywheresoftware.b4a.objects.collections.Map();
_trackmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_manifest.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=28180485;
 //BA.debugLineNum = 28180485;BA.debugLine="If order.IsInitialized = False Or order.Size = 0";
if (_order.IsInitialized()==__c.False || _order.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28180486;
 //BA.debugLineNum = 28180486;BA.debugLine="If trackMap.IsInitialized = False Or trackMap.Siz";
if (_trackmap.IsInitialized()==__c.False || _trackmap.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28180488;
 //BA.debugLineNum = 28180488;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
RDebugUtils.currentLine=28180489;
 //BA.debugLineNum = 28180489;BA.debugLine="For Each trackId As String In order";
{
final anywheresoftware.b4a.BA.IterableList group7 = _order;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_trackid = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=28180490;
 //BA.debugLineNum = 28180490;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=28180491;
 //BA.debugLineNum = 28180491;BA.debugLine="Dim trackObject As Object = trackMap.GetDefault(";
_trackobject = _trackmap.GetDefault((Object)(_trackid),__c.Null);
RDebugUtils.currentLine=28180492;
 //BA.debugLineNum = 28180492;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=28180493;
 //BA.debugLineNum = 28180493;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=28180494;
 //BA.debugLineNum = 28180494;BA.debugLine="If IsTrackAlreadyAvailable(track, manifest.GetDe";
if (__ref._istrackalreadyavailable /*boolean*/ (null,_track,BA.ObjectToString(_manifest.GetDefault((Object)("playlist_id"),(Object)(""))))) { 
RDebugUtils.currentLine=28180495;
 //BA.debugLineNum = 28180495;BA.debugLine="totalCount = totalCount + 1";
_totalcount = (int) (_totalcount+1);
 };
 }
};
RDebugUtils.currentLine=28180499;
 //BA.debugLineNum = 28180499;BA.debugLine="Return totalCount";
if (true) return _totalcount;
RDebugUtils.currentLine=28180500;
 //BA.debugLineNum = 28180500;BA.debugLine="End Sub";
return 0;
}
public int  _countplayabletracksinslot(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _slot,anywheresoftware.b4a.objects.collections.Map _trackplayliststats) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "countplayabletracksinslot", false))
	 {return ((Integer) Debug.delegate(ba, "countplayabletracksinslot", new Object[] {_slot,_trackplayliststats}));}
anywheresoftware.b4a.objects.collections.List _playlists = null;
int _totalcount = 0;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
RDebugUtils.currentLine=28114944;
 //BA.debugLineNum = 28114944;BA.debugLine="Private Sub CountPlayableTracksInSlot(slot As Map,";
RDebugUtils.currentLine=28114945;
 //BA.debugLineNum = 28114945;BA.debugLine="If slot.IsInitialized = False Then Return 0";
if (_slot.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28114947;
 //BA.debugLineNum = 28114947;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = __ref._getslotplaylists /*anywheresoftware.b4a.objects.collections.List*/ (null,_slot);
RDebugUtils.currentLine=28114948;
 //BA.debugLineNum = 28114948;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28114950;
 //BA.debugLineNum = 28114950;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
RDebugUtils.currentLine=28114952;
 //BA.debugLineNum = 28114952;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group5 = _playlists;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_playlistobject = group5.Get(index5);
RDebugUtils.currentLine=28114953;
 //BA.debugLineNum = 28114953;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=28114954;
 //BA.debugLineNum = 28114954;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=28114955;
 //BA.debugLineNum = 28114955;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = __ref._getplaylistidfromdescriptor /*String*/ (null,_playlistdescriptor);
RDebugUtils.currentLine=28114956;
 //BA.debugLineNum = 28114956;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=28114957;
 //BA.debugLineNum = 28114957;BA.debugLine="totalCount = totalCount + GetCachedTrackCountFor";
_totalcount = (int) (_totalcount+__ref._getcachedtrackcountforplaylist /*int*/ (null,_trackplayliststats,_playlistid));
 }
};
RDebugUtils.currentLine=28114960;
 //BA.debugLineNum = 28114960;BA.debugLine="Return totalCount";
if (true) return _totalcount;
RDebugUtils.currentLine=28114961;
 //BA.debugLineNum = 28114961;BA.debugLine="End Sub";
return 0;
}
public boolean  _hasmediacacherecentfailure(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "hasmediacacherecentfailure", false))
	 {return ((Boolean) Debug.delegate(ba, "hasmediacacherecentfailure", null));}
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Private Sub HasMediaCacheRecentFailure As Boolean";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="Try";
try {RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="Return mediaCacheService.ConsumeRecentMediaNetwo";
if (true) return __ref._mediacacheservice /*b4j.example.mediacache*/ ._consumerecentmedianetworkfailure /*boolean*/ (null);
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=29097988;
 //BA.debugLineNum = 29097988;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=29097990;
 //BA.debugLineNum = 29097990;BA.debugLine="End Sub";
return false;
}
public boolean  _isdownloadcooldownactive(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "isdownloadcooldownactive", false))
	 {return ((Boolean) Debug.delegate(ba, "isdownloadcooldownactive", null));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Private Sub IsDownloadCooldownActive As Boolean";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="If lastSuccessfulDownloadAt <= 0 Then Return Fals";
if (__ref._lastsuccessfuldownloadat /*long*/ <=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="Return DateTime.Now - lastSuccessfulDownloadAt <";
if (true) return __c.DateTime.getNow()-__ref._lastsuccessfuldownloadat /*long*/ <__ref._downloadcooldownms /*long*/ ;
RDebugUtils.currentLine=29163523;
 //BA.debugLineNum = 29163523;BA.debugLine="End Sub";
return false;
}
public boolean  _isfailurecooldownactive(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "isfailurecooldownactive", false))
	 {return ((Boolean) Debug.delegate(ba, "isfailurecooldownactive", null));}
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Private Sub IsFailureCooldownActive As Boolean";
RDebugUtils.currentLine=29229057;
 //BA.debugLineNum = 29229057;BA.debugLine="If lastFailureAt <= 0 Then Return False";
if (__ref._lastfailureat /*long*/ <=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="Return DateTime.Now - lastFailureAt < failureCool";
if (true) return __c.DateTime.getNow()-__ref._lastfailureat /*long*/ <__ref._failurecooldownms /*long*/ ;
RDebugUtils.currentLine=29229059;
 //BA.debugLineNum = 29229059;BA.debugLine="End Sub";
return false;
}
public boolean  _isstarted(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "isstarted", false))
	 {return ((Boolean) Debug.delegate(ba, "isstarted", null));}
RDebugUtils.currentLine=27852800;
 //BA.debugLineNum = 27852800;BA.debugLine="Public Sub IsStarted As Boolean";
RDebugUtils.currentLine=27852801;
 //BA.debugLineNum = 27852801;BA.debugLine="Return isRunning";
if (true) return __ref._isrunning /*boolean*/ ;
RDebugUtils.currentLine=27852802;
 //BA.debugLineNum = 27852802;BA.debugLine="End Sub";
return false;
}
public String  _requestplaybackresumeifneeded(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "requestplaybackresumeifneeded", false))
	 {return ((String) Debug.delegate(ba, "requestplaybackresumeifneeded", null));}
RDebugUtils.currentLine=84541440;
 //BA.debugLineNum = 84541440;BA.debugLine="Private Sub RequestPlaybackResumeIfNeeded";
RDebugUtils.currentLine=84541441;
 //BA.debugLineNum = 84541441;BA.debugLine="If traceTarget = Null Then Return";
if (__ref._tracetarget /*Object*/ == null) { 
if (true) return "";};
RDebugUtils.currentLine=84541442;
 //BA.debugLineNum = 84541442;BA.debugLine="Try";
try {RDebugUtils.currentLine=84541443;
 //BA.debugLineNum = 84541443;BA.debugLine="If SubExists(traceTarget, \"AutoResumeAfterCacheW";
if (__c.SubExists(ba,__ref._tracetarget /*Object*/ ,"AutoResumeAfterCacheWarmup")) { 
RDebugUtils.currentLine=84541444;
 //BA.debugLineNum = 84541444;BA.debugLine="CallSubDelayed(traceTarget, \"AutoResumeAfterCac";
__c.CallSubDelayed(ba,__ref._tracetarget /*Object*/ ,"AutoResumeAfterCacheWarmup");
 };
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=84541447;
 //BA.debugLineNum = 84541447;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("284541447",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=84541449;
 //BA.debugLineNum = 84541449;BA.debugLine="End Sub";
return "";
}
public int  _resolveslotneed(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _slot,int _minreserve,anywheresoftware.b4a.objects.collections.Map _trackplayliststats) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "resolveslotneed", false))
	 {return ((Integer) Debug.delegate(ba, "resolveslotneed", new Object[] {_slot,_minreserve,_trackplayliststats}));}
anywheresoftware.b4a.objects.collections.List _playlists = null;
int _playablecount = 0;
RDebugUtils.currentLine=28049408;
 //BA.debugLineNum = 28049408;BA.debugLine="Private Sub ResolveSlotNeed(slot As Map, minReserv";
RDebugUtils.currentLine=28049409;
 //BA.debugLineNum = 28049409;BA.debugLine="If slot.IsInitialized = False Or slot.Size = 0 Th";
if (_slot.IsInitialized()==__c.False || _slot.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28049411;
 //BA.debugLineNum = 28049411;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = __ref._getslotplaylists /*anywheresoftware.b4a.objects.collections.List*/ (null,_slot);
RDebugUtils.currentLine=28049412;
 //BA.debugLineNum = 28049412;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28049414;
 //BA.debugLineNum = 28049414;BA.debugLine="Dim playableCount As Int = CountPlayableTracksInS";
_playablecount = __ref._countplayabletracksinslot /*int*/ (null,_slot,_trackplayliststats);
RDebugUtils.currentLine=28049415;
 //BA.debugLineNum = 28049415;BA.debugLine="Return Max(0, minReserve - playableCount)";
if (true) return (int) (__c.Max(0,_minreserve-_playablecount));
RDebugUtils.currentLine=28049416;
 //BA.debugLineNum = 28049416;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Private Sub RunPruneIfNeeded(initiator As String)";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="If DateTime.Now - lastPruneAt < pruneCooldownMs T";
if (__c.DateTime.getNow()-__ref._lastpruneat /*long*/ <__ref._prunecooldownms /*long*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=28639235;
 //BA.debugLineNum = 28639235;BA.debugLine="Dim protectedTrackIds As List = BuildProtectedTra";
_protectedtrackids = new anywheresoftware.b4a.objects.collections.List();
_protectedtrackids = __ref._buildprotectedtrackids /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=28639236;
 //BA.debugLineNum = 28639236;BA.debugLine="Dim relevantTrackIds As List = BuildRelevantTrack";
_relevanttrackids = new anywheresoftware.b4a.objects.collections.List();
_relevanttrackids = __ref._buildrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=28639238;
 //BA.debugLineNum = 28639238;BA.debugLine="Dim removedCount As Int = mediaCacheService.Prune";
_removedcount = __ref._mediacacheservice /*b4j.example.mediacache*/ ._prunetrackcacheifneeded /*int*/ (null,_protectedtrackids,_relevanttrackids);
RDebugUtils.currentLine=28639239;
 //BA.debugLineNum = 28639239;BA.debugLine="lastPruneAt = DateTime.Now";
__ref._lastpruneat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=28639241;
 //BA.debugLineNum = 28639241;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
RDebugUtils.currentLine=28639242;
 //BA.debugLineNum = 28639242;BA.debugLine="Trace(\"autocache prune completed initiator=\" & i";
__ref._trace /*String*/ (null,"autocache prune completed initiator="+_initiator+" removed="+BA.NumberToString(_removedcount));
 }else {
RDebugUtils.currentLine=28639244;
 //BA.debugLineNum = 28639244;BA.debugLine="Trace(\"autocache prune completed initiator=\" & i";
__ref._trace /*String*/ (null,"autocache prune completed initiator="+_initiator+" removed=0");
 };
RDebugUtils.currentLine=28639246;
 //BA.debugLineNum = 28639246;BA.debugLine="End Sub";
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
anywheresoftware.b4a.objects.collections.Map _trackplayliststats = null;
long _nowticks = 0L;
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.Map _nextslot = null;
int _currentneed = 0;
int _nextneed = 0;
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
RDebugUtils.currentLine=27983873;
 //BA.debugLineNum = 27983873;BA.debugLine="Dim summary As Map";
_summary = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=27983874;
 //BA.debugLineNum = 27983874;BA.debugLine="summary.Initialize";
_summary.Initialize();
RDebugUtils.currentLine=27983875;
 //BA.debugLineNum = 27983875;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "autonomouscachemanager", "runstepasync"),(int) (0));
this.state = 28;
return;
case 28:
//C
this.state = 1;
;
RDebugUtils.currentLine=27983877;
 //BA.debugLineNum = 27983877;BA.debugLine="If kvs.IsInitialized = False Or offlineStoreServi";
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
RDebugUtils.currentLine=27983878;
 //BA.debugLineNum = 27983878;BA.debugLine="summary.Put(\"status\", \"not_initialized\")";
_summary.Put((Object)("status"),(Object)("not_initialized"));
RDebugUtils.currentLine=27983879;
 //BA.debugLineNum = 27983879;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;
;
RDebugUtils.currentLine=27983882;
 //BA.debugLineNum = 27983882;BA.debugLine="If IsFailureCooldownActive Then";

case 4:
//if
this.state = 7;
if (__ref._isfailurecooldownactive /*boolean*/ (null)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=27983883;
 //BA.debugLineNum = 27983883;BA.debugLine="summary.Put(\"status\", \"failure_cooldown\")";
_summary.Put((Object)("status"),(Object)("failure_cooldown"));
RDebugUtils.currentLine=27983884;
 //BA.debugLineNum = 27983884;BA.debugLine="Trace(\"autocache step skipped reason=failure_coo";
__ref._trace /*String*/ (null,"autocache step skipped reason=failure_cooldown");
RDebugUtils.currentLine=27983885;
 //BA.debugLineNum = 27983885;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;
;
RDebugUtils.currentLine=27983888;
 //BA.debugLineNum = 27983888;BA.debugLine="If IsDownloadCooldownActive Then";

case 7:
//if
this.state = 10;
if (__ref._isdownloadcooldownactive /*boolean*/ (null)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=27983889;
 //BA.debugLineNum = 27983889;BA.debugLine="summary.Put(\"status\", \"download_cooldown\")";
_summary.Put((Object)("status"),(Object)("download_cooldown"));
RDebugUtils.currentLine=27983890;
 //BA.debugLineNum = 27983890;BA.debugLine="Trace(\"autocache step skipped reason=download_co";
__ref._trace /*String*/ (null,"autocache step skipped reason=download_cooldown");
RDebugUtils.currentLine=27983891;
 //BA.debugLineNum = 27983891;BA.debugLine="RunPruneIfNeeded(\"cooldown\")";
__ref._runpruneifneeded /*String*/ (null,"cooldown");
RDebugUtils.currentLine=27983892;
 //BA.debugLineNum = 27983892;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=27983895;
 //BA.debugLineNum = 27983895;BA.debugLine="Dim offlineData As Map = offlineStoreService.Load";
_offlinedata = new anywheresoftware.b4a.objects.collections.Map();
_offlinedata = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._loadofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=27983896;
 //BA.debugLineNum = 27983896;BA.debugLine="If offlineData.IsInitialized = False Or offlineDa";
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
RDebugUtils.currentLine=27983897;
 //BA.debugLineNum = 27983897;BA.debugLine="summary.Put(\"status\", \"no_offline_data\")";
_summary.Put((Object)("status"),(Object)("no_offline_data"));
RDebugUtils.currentLine=27983898;
 //BA.debugLineNum = 27983898;BA.debugLine="Trace(\"autocache step skipped reason=no_offline_";
__ref._trace /*String*/ (null,"autocache step skipped reason=no_offline_data");
RDebugUtils.currentLine=27983899;
 //BA.debugLineNum = 27983899;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=27983902;
 //BA.debugLineNum = 27983902;BA.debugLine="mediaCacheService.EnsureTrackCacheReady";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._ensuretrackcacheready /*String*/ (null);
RDebugUtils.currentLine=27983903;
 //BA.debugLineNum = 27983903;BA.debugLine="Dim trackPlaylistStats As Map = mediaCacheService";
_trackplayliststats = new anywheresoftware.b4a.objects.collections.Map();
_trackplayliststats = __ref._mediacacheservice /*b4j.example.mediacache*/ ._getcachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=27983905;
 //BA.debugLineNum = 27983905;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
_nowticks = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=27983906;
 //BA.debugLineNum = 27983906;BA.debugLine="Dim currentSlot As Map = dataResolverService.Reso";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._dataresolverservice /*b4j.example.dataplaybackresolver*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_nowticks);
RDebugUtils.currentLine=27983907;
 //BA.debugLineNum = 27983907;BA.debugLine="Dim nextSlot As Map = dataResolverService.Resolve";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
_nextslot = __ref._dataresolverservice /*b4j.example.dataplaybackresolver*/ ._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_nowticks);
RDebugUtils.currentLine=27983909;
 //BA.debugLineNum = 27983909;BA.debugLine="Dim currentNeed As Int = ResolveSlotNeed(currentS";
_currentneed = __ref._resolveslotneed /*int*/ (null,_currentslot,__ref._currentslotminreserve /*int*/ ,_trackplayliststats);
RDebugUtils.currentLine=27983910;
 //BA.debugLineNum = 27983910;BA.debugLine="Dim nextNeed As Int = ResolveSlotNeed(nextSlot, n";
_nextneed = __ref._resolveslotneed /*int*/ (null,_nextslot,__ref._nextslotminreserve /*int*/ ,_trackplayliststats);
RDebugUtils.currentLine=27983912;
 //BA.debugLineNum = 27983912;BA.debugLine="Dim desiredTrackItems As List = BuildDesiredTrack";
_desiredtrackitems = new anywheresoftware.b4a.objects.collections.List();
_desiredtrackitems = __ref._builddesiredtrackitemsforslots /*anywheresoftware.b4a.objects.collections.List*/ (null,_currentslot,_nextslot,_currentneed,_nextneed,_trackplayliststats);
RDebugUtils.currentLine=27983914;
 //BA.debugLineNum = 27983914;BA.debugLine="summary.Put(\"current_need\", currentNeed)";
_summary.Put((Object)("current_need"),(Object)(_currentneed));
RDebugUtils.currentLine=27983915;
 //BA.debugLineNum = 27983915;BA.debugLine="summary.Put(\"next_need\", nextNeed)";
_summary.Put((Object)("next_need"),(Object)(_nextneed));
RDebugUtils.currentLine=27983916;
 //BA.debugLineNum = 27983916;BA.debugLine="summary.Put(\"candidate_count\", desiredTrackItems.";
_summary.Put((Object)("candidate_count"),(Object)(_desiredtrackitems.getSize()));
RDebugUtils.currentLine=27983918;
 //BA.debugLineNum = 27983918;BA.debugLine="If desiredTrackItems.Size = 0 Then";
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
RDebugUtils.currentLine=27983919;
 //BA.debugLineNum = 27983919;BA.debugLine="summary.Put(\"status\", \"nothing_to_download\")";
_summary.Put((Object)("status"),(Object)("nothing_to_download"));
RDebugUtils.currentLine=27983920;
 //BA.debugLineNum = 27983920;BA.debugLine="Trace(\"autocache step no work currentNeed=\" & cu";
__ref._trace /*String*/ (null,"autocache step no work currentNeed="+BA.NumberToString(_currentneed)+" nextNeed="+BA.NumberToString(_nextneed));
RDebugUtils.currentLine=27983921;
 //BA.debugLineNum = 27983921;BA.debugLine="RunPruneIfNeeded(\"idle\")";
__ref._runpruneifneeded /*String*/ (null,"idle");
RDebugUtils.currentLine=27983922;
 //BA.debugLineNum = 27983922;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=27983925;
 //BA.debugLineNum = 27983925;BA.debugLine="Dim actualMaxDownloads As Int = Min(maxDownloadsP";
_actualmaxdownloads = (int) (parent.__c.Min(__ref._maxdownloadsperstep /*int*/ ,_desiredtrackitems.getSize()));
RDebugUtils.currentLine=27983926;
 //BA.debugLineNum = 27983926;BA.debugLine="Trace(\"autocache step download start candidates=\"";
__ref._trace /*String*/ (null,"autocache step download start candidates="+BA.NumberToString(_desiredtrackitems.getSize())+" maxDownloads="+BA.NumberToString(_actualmaxdownloads));
RDebugUtils.currentLine=27983928;
 //BA.debugLineNum = 27983928;BA.debugLine="Wait For (mediaCacheService.EnsureTracksCached(de";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "autonomouscachemanager", "runstepasync"), __ref._mediacacheservice /*b4j.example.mediacache*/ ._ensuretrackscached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_desiredtrackitems,_actualmaxdownloads));
this.state = 29;
return;
case 29:
//C
this.state = 19;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=27983930;
 //BA.debugLineNum = 27983930;BA.debugLine="If HasMediaCacheRecentFailure Then";
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
RDebugUtils.currentLine=27983931;
 //BA.debugLineNum = 27983931;BA.debugLine="lastFailureAt = DateTime.Now";
__ref._lastfailureat /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=27983932;
 //BA.debugLineNum = 27983932;BA.debugLine="summary.Put(\"status\", \"network_failure\")";
_summary.Put((Object)("status"),(Object)("network_failure"));
RDebugUtils.currentLine=27983933;
 //BA.debugLineNum = 27983933;BA.debugLine="Trace(\"autocache step network failure\")";
__ref._trace /*String*/ (null,"autocache step network failure");
RDebugUtils.currentLine=27983934;
 //BA.debugLineNum = 27983934;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;
;
RDebugUtils.currentLine=27983937;
 //BA.debugLineNum = 27983937;BA.debugLine="If downloaded Then";

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
RDebugUtils.currentLine=27983938;
 //BA.debugLineNum = 27983938;BA.debugLine="lastSuccessfulDownloadAt = DateTime.Now";
__ref._lastsuccessfuldownloadat /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=27983939;
 //BA.debugLineNum = 27983939;BA.debugLine="summary.Put(\"status\", \"downloaded\")";
_summary.Put((Object)("status"),(Object)("downloaded"));
RDebugUtils.currentLine=27983940;
 //BA.debugLineNum = 27983940;BA.debugLine="summary.Put(\"downloaded\", True)";
_summary.Put((Object)("downloaded"),(Object)(parent.__c.True));
RDebugUtils.currentLine=27983941;
 //BA.debugLineNum = 27983941;BA.debugLine="RequestPlaybackResumeIfNeeded";
__ref._requestplaybackresumeifneeded /*String*/ (null);
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=27983943;
 //BA.debugLineNum = 27983943;BA.debugLine="summary.Put(\"status\", \"no_new_downloads\")";
_summary.Put((Object)("status"),(Object)("no_new_downloads"));
RDebugUtils.currentLine=27983944;
 //BA.debugLineNum = 27983944;BA.debugLine="summary.Put(\"downloaded\", False)";
_summary.Put((Object)("downloaded"),(Object)(parent.__c.False));
 if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=27983947;
 //BA.debugLineNum = 27983947;BA.debugLine="RunPruneIfNeeded(\"post_download\")";
__ref._runpruneifneeded /*String*/ (null,"post_download");
RDebugUtils.currentLine=27983948;
 //BA.debugLineNum = 27983948;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
RDebugUtils.currentLine=27983949;
 //BA.debugLineNum = 27983949;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _runstepasyncdeferred(b4j.example.autonomouscachemanager __ref) throws Exception{
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "runstepasyncdeferred", false))
	 {Debug.delegate(ba, "runstepasyncdeferred", null); return;}
ResumableSub_RunStepAsyncDeferred rsub = new ResumableSub_RunStepAsyncDeferred(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_RunStepAsyncDeferred extends BA.ResumableSub {
public ResumableSub_RunStepAsyncDeferred(b4j.example.autonomouscachemanager parent,b4j.example.autonomouscachemanager __ref) {
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
this.state = -1;
RDebugUtils.currentLine=86179841;
 //BA.debugLineNum = 86179841;BA.debugLine="Wait For (RunStepAsync) Complete (summary As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "autonomouscachemanager", "runstepasyncdeferred"), __ref._runstepasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_summary = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=86179842;
 //BA.debugLineNum = 86179842;BA.debugLine="stepInProgress = False";
__ref._stepinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=86179843;
 //BA.debugLineNum = 86179843;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=27787264;
 //BA.debugLineNum = 27787264;BA.debugLine="Public Sub StopManager";
RDebugUtils.currentLine=27787265;
 //BA.debugLineNum = 27787265;BA.debugLine="isRunning = False";
__ref._isrunning /*boolean*/  = __c.False;
RDebugUtils.currentLine=27787266;
 //BA.debugLineNum = 27787266;BA.debugLine="workerTimer.Enabled = False";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=27787267;
 //BA.debugLineNum = 27787267;BA.debugLine="Trace(\"autocache manager stopped\")";
__ref._trace /*String*/ (null,"autocache manager stopped");
RDebugUtils.currentLine=27787268;
 //BA.debugLineNum = 27787268;BA.debugLine="End Sub";
return "";
}
public String  _workertimer_tick(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "workertimer_tick", false))
	 {return ((String) Debug.delegate(ba, "workertimer_tick", null));}
RDebugUtils.currentLine=27918336;
 //BA.debugLineNum = 27918336;BA.debugLine="Private Sub workerTimer_Tick";
RDebugUtils.currentLine=27918337;
 //BA.debugLineNum = 27918337;BA.debugLine="If isRunning = False Then Return";
if (__ref._isrunning /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=27918338;
 //BA.debugLineNum = 27918338;BA.debugLine="If stepInProgress Then Return";
if (__ref._stepinprogress /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=27918340;
 //BA.debugLineNum = 27918340;BA.debugLine="stepInProgress = True";
__ref._stepinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=27918341;
 //BA.debugLineNum = 27918341;BA.debugLine="CallSubDelayed(Me, \"RunStepAsyncDeferred\")";
__c.CallSubDelayed(ba,this,"RunStepAsyncDeferred");
RDebugUtils.currentLine=27918342;
 //BA.debugLineNum = 27918342;BA.debugLine="End Sub";
return "";
}
}