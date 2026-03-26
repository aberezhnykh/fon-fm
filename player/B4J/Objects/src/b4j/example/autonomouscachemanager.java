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
public b4j.example.platformbridge _platformbridge = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
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
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Private Sub AddDesiredTrackItemsForSlot(result As";
RDebugUtils.currentLine=32178177;
 //BA.debugLineNum = 32178177;BA.debugLine="If slot.IsInitialized = False Or slot.Size = 0 Th";
if (_slot.IsInitialized()==__c.False || _slot.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=32178179;
 //BA.debugLineNum = 32178179;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = __ref._getslotplaylists /*anywheresoftware.b4a.objects.collections.List*/ (null,_slot);
RDebugUtils.currentLine=32178180;
 //BA.debugLineNum = 32178180;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=32178182;
 //BA.debugLineNum = 32178182;BA.debugLine="Dim playlistIds As List";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=32178183;
 //BA.debugLineNum = 32178183;BA.debugLine="playlistIds.Initialize";
_playlistids.Initialize();
RDebugUtils.currentLine=32178184;
 //BA.debugLineNum = 32178184;BA.debugLine="Dim totalPlayable As Int = 0";
_totalplayable = (int) (0);
RDebugUtils.currentLine=32178185;
 //BA.debugLineNum = 32178185;BA.debugLine="Dim allPlaylistsReady As Boolean = True";
_allplaylistsready = __c.True;
RDebugUtils.currentLine=32178187;
 //BA.debugLineNum = 32178187;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group8 = _playlists;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_playlistobject = group8.Get(index8);
RDebugUtils.currentLine=32178188;
 //BA.debugLineNum = 32178188;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=32178189;
 //BA.debugLineNum = 32178189;BA.debugLine="Dim descriptor As Map = playlistObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=32178190;
 //BA.debugLineNum = 32178190;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = __ref._getplaylistidfromdescriptor /*String*/ (null,_descriptor);
RDebugUtils.currentLine=32178191;
 //BA.debugLineNum = 32178191;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=32178192;
 //BA.debugLineNum = 32178192;BA.debugLine="If playlistIds.IndexOf(playlistId) >= 0 Then Con";
if (_playlistids.IndexOf((Object)(_playlistid))>=0) { 
if (true) continue;};
RDebugUtils.currentLine=32178193;
 //BA.debugLineNum = 32178193;BA.debugLine="playlistIds.Add(playlistId)";
_playlistids.Add((Object)(_playlistid));
RDebugUtils.currentLine=32178194;
 //BA.debugLineNum = 32178194;BA.debugLine="Dim playlistPlayableCount As Int = GetCachedTrac";
_playlistplayablecount = __ref._getcachedtrackcountforplaylist /*int*/ (null,_trackplayliststats,_playlistid);
RDebugUtils.currentLine=32178195;
 //BA.debugLineNum = 32178195;BA.debugLine="totalPlayable = totalPlayable + playlistPlayable";
_totalplayable = (int) (_totalplayable+_playlistplayablecount);
RDebugUtils.currentLine=32178196;
 //BA.debugLineNum = 32178196;BA.debugLine="If playlistPlayableCount < perPlaylistMinReserve";
if (_playlistplayablecount<__ref._perplaylistminreserve /*int*/ ) { 
_allplaylistsready = __c.False;};
 }
};
RDebugUtils.currentLine=32178199;
 //BA.debugLineNum = 32178199;BA.debugLine="If playlistIds.Size = 0 Then Return";
if (_playlistids.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=32178200;
 //BA.debugLineNum = 32178200;BA.debugLine="If slotNeed <= 0 And totalPlayable >= slotReserve";
if (_slotneed<=0 && _totalplayable>=_slotreserve && _allplaylistsready) { 
if (true) return "";};
RDebugUtils.currentLine=32178202;
 //BA.debugLineNum = 32178202;BA.debugLine="Dim manifestsByPlaylist As Map";
_manifestsbyplaylist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32178203;
 //BA.debugLineNum = 32178203;BA.debugLine="manifestsByPlaylist.Initialize";
_manifestsbyplaylist.Initialize();
RDebugUtils.currentLine=32178204;
 //BA.debugLineNum = 32178204;BA.debugLine="totalPlayable = 0";
_totalplayable = (int) (0);
RDebugUtils.currentLine=32178206;
 //BA.debugLineNum = 32178206;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group24 = _playlists;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_playlistobject = group24.Get(index24);
RDebugUtils.currentLine=32178207;
 //BA.debugLineNum = 32178207;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=32178209;
 //BA.debugLineNum = 32178209;BA.debugLine="Dim descriptor As Map = playlistObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=32178210;
 //BA.debugLineNum = 32178210;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = __ref._getplaylistidfromdescriptor /*String*/ (null,_descriptor);
RDebugUtils.currentLine=32178211;
 //BA.debugLineNum = 32178211;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=32178213;
 //BA.debugLineNum = 32178213;BA.debugLine="Dim manifest As Map = LoadPlaylistManifestSafe(p";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = __ref._loadplaylistmanifestsafe /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=32178214;
 //BA.debugLineNum = 32178214;BA.debugLine="If manifest.IsInitialized = False Or manifest.Si";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=32178215;
 //BA.debugLineNum = 32178215;BA.debugLine="If manifestsByPlaylist.ContainsKey(playlistId) T";
if (_manifestsbyplaylist.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
RDebugUtils.currentLine=32178217;
 //BA.debugLineNum = 32178217;BA.debugLine="manifestsByPlaylist.Put(playlistId, manifest)";
_manifestsbyplaylist.Put((Object)(_playlistid),(Object)(_manifest.getObject()));
RDebugUtils.currentLine=32178218;
 //BA.debugLineNum = 32178218;BA.debugLine="totalPlayable = totalPlayable + GetCachedTrackCo";
_totalplayable = (int) (_totalplayable+__ref._getcachedtrackcountforplaylist /*int*/ (null,_trackplayliststats,_playlistid));
 }
};
RDebugUtils.currentLine=32178221;
 //BA.debugLineNum = 32178221;BA.debugLine="If playlistIds.Size = 0 Then Return";
if (_playlistids.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=32178223;
 //BA.debugLineNum = 32178223;BA.debugLine="Dim remainingNeed As Int = Max(0, slotReserve - t";
_remainingneed = (int) (__c.Max(0,_slotreserve-_totalplayable));
RDebugUtils.currentLine=32178224;
 //BA.debugLineNum = 32178224;BA.debugLine="If slotNeed > remainingNeed Then remainingNeed =";
if (_slotneed>_remainingneed) { 
_remainingneed = _slotneed;};
RDebugUtils.currentLine=32178226;
 //BA.debugLineNum = 32178226;BA.debugLine="For Each playlistId As String In playlistIds";
{
final anywheresoftware.b4a.BA.IterableList group38 = _playlistids;
final int groupLen38 = group38.getSize()
;int index38 = 0;
;
for (; index38 < groupLen38;index38++){
_playlistid = BA.ObjectToString(group38.Get(index38));
RDebugUtils.currentLine=32178227;
 //BA.debugLineNum = 32178227;BA.debugLine="Dim manifest As Map = manifestsByPlaylist.Get(pl";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_manifestsbyplaylist.Get((Object)(_playlistid))));
RDebugUtils.currentLine=32178228;
 //BA.debugLineNum = 32178228;BA.debugLine="Dim playableInPlaylist As Int = GetCachedTrackCo";
_playableinplaylist = __ref._getcachedtrackcountforplaylist /*int*/ (null,_trackplayliststats,_playlistid);
RDebugUtils.currentLine=32178229;
 //BA.debugLineNum = 32178229;BA.debugLine="Dim missingForPlaylist As Int = Max(0, perPlayli";
_missingforplaylist = (int) (__c.Max(0,__ref._perplaylistminreserve /*int*/ -_playableinplaylist));
RDebugUtils.currentLine=32178230;
 //BA.debugLineNum = 32178230;BA.debugLine="If missingForPlaylist <= 0 Then Continue";
if (_missingforplaylist<=0) { 
if (true) continue;};
RDebugUtils.currentLine=32178231;
 //BA.debugLineNum = 32178231;BA.debugLine="Dim addedCount As Int = CollectUpcomingTracksFor";
_addedcount = __ref._collectupcomingtracksforplaylist /*int*/ (null,_result,_seentrackids,_playlistid,_missingforplaylist);
RDebugUtils.currentLine=32178232;
 //BA.debugLineNum = 32178232;BA.debugLine="If addedCount > 0 Then";
if (_addedcount>0) { 
RDebugUtils.currentLine=32178233;
 //BA.debugLineNum = 32178233;BA.debugLine="Trace(\"autocache slot fill slot=\" & slotLabel &";
__ref._trace /*String*/ (null,"autocache slot fill slot="+_slotlabel+" playlistId="+_playlistid+" added="+BA.NumberToString(_addedcount)+" reason=per_playlist_min");
 };
 }
};
RDebugUtils.currentLine=32178237;
 //BA.debugLineNum = 32178237;BA.debugLine="If remainingNeed <= 0 Then Return";
if (_remainingneed<=0) { 
if (true) return "";};
RDebugUtils.currentLine=32178239;
 //BA.debugLineNum = 32178239;BA.debugLine="Do While remainingNeed > 0";
while (_remainingneed>0) {
RDebugUtils.currentLine=32178240;
 //BA.debugLineNum = 32178240;BA.debugLine="Dim addedInRound As Int = 0";
_addedinround = (int) (0);
RDebugUtils.currentLine=32178241;
 //BA.debugLineNum = 32178241;BA.debugLine="For Each playlistId As String In playlistIds";
{
final anywheresoftware.b4a.BA.IterableList group51 = _playlistids;
final int groupLen51 = group51.getSize()
;int index51 = 0;
;
for (; index51 < groupLen51;index51++){
_playlistid = BA.ObjectToString(group51.Get(index51));
RDebugUtils.currentLine=32178242;
 //BA.debugLineNum = 32178242;BA.debugLine="If remainingNeed <= 0 Then Exit";
if (_remainingneed<=0) { 
if (true) break;};
RDebugUtils.currentLine=32178243;
 //BA.debugLineNum = 32178243;BA.debugLine="Dim addedCount As Int = CollectUpcomingTracksFo";
_addedcount = __ref._collectupcomingtracksforplaylist /*int*/ (null,_result,_seentrackids,_playlistid,(int) (1));
RDebugUtils.currentLine=32178244;
 //BA.debugLineNum = 32178244;BA.debugLine="If addedCount <= 0 Then Continue";
if (_addedcount<=0) { 
if (true) continue;};
RDebugUtils.currentLine=32178245;
 //BA.debugLineNum = 32178245;BA.debugLine="addedInRound = addedInRound + addedCount";
_addedinround = (int) (_addedinround+_addedcount);
RDebugUtils.currentLine=32178246;
 //BA.debugLineNum = 32178246;BA.debugLine="remainingNeed = Max(0, remainingNeed - addedCou";
_remainingneed = (int) (__c.Max(0,_remainingneed-_addedcount));
 }
};
RDebugUtils.currentLine=32178248;
 //BA.debugLineNum = 32178248;BA.debugLine="If addedInRound <= 0 Then Exit";
if (_addedinround<=0) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=32178250;
 //BA.debugLineNum = 32178250;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Private Sub GetSlotPlaylists(slot As Map) As List";
RDebugUtils.currentLine=32636929;
 //BA.debugLineNum = 32636929;BA.debugLine="If slot.IsInitialized = False Then";
if (_slot.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="Dim emptyList As List";
_emptylist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=32636931;
 //BA.debugLineNum = 32636931;BA.debugLine="emptyList.Initialize";
_emptylist.Initialize();
RDebugUtils.currentLine=32636932;
 //BA.debugLineNum = 32636932;BA.debugLine="Return emptyList";
if (true) return _emptylist;
 };
RDebugUtils.currentLine=32636935;
 //BA.debugLineNum = 32636935;BA.debugLine="Dim playlists As List = slot.GetDefault(\"playlist";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=32636936;
 //BA.debugLineNum = 32636936;BA.debugLine="If playlists.IsInitialized Then Return playlists";
if (_playlists.IsInitialized()) { 
if (true) return _playlists;};
RDebugUtils.currentLine=32636938;
 //BA.debugLineNum = 32636938;BA.debugLine="playlists = slot.GetDefault(\"playlist_descriptors";
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slot.GetDefault((Object)("playlist_descriptors"),__c.Null)));
RDebugUtils.currentLine=32636939;
 //BA.debugLineNum = 32636939;BA.debugLine="If playlists.IsInitialized Then Return playlists";
if (_playlists.IsInitialized()) { 
if (true) return _playlists;};
RDebugUtils.currentLine=32636941;
 //BA.debugLineNum = 32636941;BA.debugLine="Dim emptyResult As List";
_emptyresult = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=32636942;
 //BA.debugLineNum = 32636942;BA.debugLine="emptyResult.Initialize";
_emptyresult.Initialize();
RDebugUtils.currentLine=32636943;
 //BA.debugLineNum = 32636943;BA.debugLine="Return emptyResult";
if (true) return _emptyresult;
RDebugUtils.currentLine=32636944;
 //BA.debugLineNum = 32636944;BA.debugLine="End Sub";
return null;
}
public String  _getplaylistidfromdescriptor(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _descriptor) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "getplaylistidfromdescriptor", false))
	 {return ((String) Debug.delegate(ba, "getplaylistidfromdescriptor", new Object[] {_descriptor}));}
String _playlistid = "";
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Private Sub GetPlaylistIdFromDescriptor(descriptor";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="If descriptor.IsInitialized = False Then Return \"";
if (_descriptor.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=32702467;
 //BA.debugLineNum = 32702467;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=32702468;
 //BA.debugLineNum = 32702468;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
if ((_playlistid).equals("") == false) { 
if (true) return _playlistid;};
RDebugUtils.currentLine=32702470;
 //BA.debugLineNum = 32702470;BA.debugLine="playlistId = descriptor.GetDefault(\"playlist_id\",";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=32702471;
 //BA.debugLineNum = 32702471;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
if ((_playlistid).equals("") == false) { 
if (true) return _playlistid;};
RDebugUtils.currentLine=32702473;
 //BA.debugLineNum = 32702473;BA.debugLine="playlistId = descriptor.GetDefault(\"playlistId\",";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("playlistId"),(Object)("")));
RDebugUtils.currentLine=32702474;
 //BA.debugLineNum = 32702474;BA.debugLine="Return playlistId";
if (true) return _playlistid;
RDebugUtils.currentLine=32702475;
 //BA.debugLineNum = 32702475;BA.debugLine="End Sub";
return "";
}
public int  _getcachedtrackcountforplaylist(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _trackplayliststats,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "getcachedtrackcountforplaylist", false))
	 {return ((Integer) Debug.delegate(ba, "getcachedtrackcountforplaylist", new Object[] {_trackplayliststats,_playlistid}));}
String _statskey = "";
anywheresoftware.b4a.objects.collections.Map _playlistentry = null;
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Private Sub GetCachedTrackCountForPlaylist(trackPl";
RDebugUtils.currentLine=32243713;
 //BA.debugLineNum = 32243713;BA.debugLine="If trackPlaylistStats.IsInitialized = False Then";
if (_trackplayliststats.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="Dim statsKey As String = playlistId";
_statskey = _playlistid;
RDebugUtils.currentLine=32243715;
 //BA.debugLineNum = 32243715;BA.debugLine="If statsKey = \"\" Then statsKey = \"_unknown\"";
if ((_statskey).equals("")) { 
_statskey = "_unknown";};
RDebugUtils.currentLine=32243716;
 //BA.debugLineNum = 32243716;BA.debugLine="Dim playlistEntry As Map = trackPlaylistStats.Get";
_playlistentry = new anywheresoftware.b4a.objects.collections.Map();
_playlistentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackplayliststats.GetDefault((Object)(_statskey),__c.Null)));
RDebugUtils.currentLine=32243717;
 //BA.debugLineNum = 32243717;BA.debugLine="If playlistEntry.IsInitialized = False Then Retur";
if (_playlistentry.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=32243718;
 //BA.debugLineNum = 32243718;BA.debugLine="Return playlistEntry.GetDefault(\"count\", 0)";
if (true) return (int)(BA.ObjectToNumber(_playlistentry.GetDefault((Object)("count"),(Object)(0))));
RDebugUtils.currentLine=32243719;
 //BA.debugLineNum = 32243719;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _loadplaylistmanifestsafe(b4j.example.autonomouscachemanager __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "loadplaylistmanifestsafe", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadplaylistmanifestsafe", new Object[] {_playlistid}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Private Sub LoadPlaylistManifestSafe(playlistId As";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=32768003;
 //BA.debugLineNum = 32768003;BA.debugLine="If playlistId = \"\" Then Return result";
if ((_playlistid).equals("")) { 
if (true) return _result;};
RDebugUtils.currentLine=32768005;
 //BA.debugLineNum = 32768005;BA.debugLine="Try";
try {RDebugUtils.currentLine=32768006;
 //BA.debugLineNum = 32768006;BA.debugLine="result = dataResolverService.GetPlaylistPlayback";
_result = __ref._dataresolverservice /*b4j.example.dataplaybackresolver*/ ._getplaylistplaybackmanifestbyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=32768008;
 //BA.debugLineNum = 32768008;BA.debugLine="result.Initialize";
_result.Initialize();
 };
RDebugUtils.currentLine=32768011;
 //BA.debugLineNum = 32768011;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=32768012;
 //BA.debugLineNum = 32768012;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32309248;
 //BA.debugLineNum = 32309248;BA.debugLine="Private Sub CollectUpcomingTracksForPlaylist(resul";
RDebugUtils.currentLine=32309249;
 //BA.debugLineNum = 32309249;BA.debugLine="If playlistId = \"\" Or limitCount <= 0 Then Return";
if ((_playlistid).equals("") || _limitcount<=0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=32309250;
 //BA.debugLineNum = 32309250;BA.debugLine="Dim requestCount As Int = Max(limitCount * 8, per";
_requestcount = (int) (__c.Max(_limitcount*8,__ref._perplaylistminreserve /*int*/ *8));
RDebugUtils.currentLine=32309251;
 //BA.debugLineNum = 32309251;BA.debugLine="Dim upcomingTracks As List = dataResolverService.";
_upcomingtracks = new anywheresoftware.b4a.objects.collections.List();
_upcomingtracks = __ref._dataresolverservice /*b4j.example.dataplaybackresolver*/ ._getupcomingplaybacktracksbyid /*anywheresoftware.b4a.objects.collections.List*/ (null,_playlistid,_requestcount,__ref._mediacacheservice /*b4j.example.mediacache*/ ,__c.False);
RDebugUtils.currentLine=32309252;
 //BA.debugLineNum = 32309252;BA.debugLine="If upcomingTracks.IsInitialized = False Or upcomi";
if (_upcomingtracks.IsInitialized()==__c.False || _upcomingtracks.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=32309253;
 //BA.debugLineNum = 32309253;BA.debugLine="Dim addedCount As Int = 0";
_addedcount = (int) (0);
RDebugUtils.currentLine=32309254;
 //BA.debugLineNum = 32309254;BA.debugLine="For Each trackObject As Object In upcomingTracks";
{
final anywheresoftware.b4a.BA.IterableList group6 = _upcomingtracks;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_trackobject = group6.Get(index6);
RDebugUtils.currentLine=32309255;
 //BA.debugLineNum = 32309255;BA.debugLine="If addedCount >= limitCount Then Exit";
if (_addedcount>=_limitcount) { 
if (true) break;};
RDebugUtils.currentLine=32309256;
 //BA.debugLineNum = 32309256;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=32309257;
 //BA.debugLineNum = 32309257;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=32309258;
 //BA.debugLineNum = 32309258;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=32309259;
 //BA.debugLineNum = 32309259;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=32309260;
 //BA.debugLineNum = 32309260;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Contin";
if (_seentrackids.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
RDebugUtils.currentLine=32309261;
 //BA.debugLineNum = 32309261;BA.debugLine="If IsTrackAlreadyAvailable(track, playlistId) Th";
if (__ref._istrackalreadyavailable /*boolean*/ (null,_track,_playlistid)) { 
if (true) continue;};
RDebugUtils.currentLine=32309262;
 //BA.debugLineNum = 32309262;BA.debugLine="Dim normalizedTrack As Map = CloneMap(track)";
_normalizedtrack = new anywheresoftware.b4a.objects.collections.Map();
_normalizedtrack = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_track);
RDebugUtils.currentLine=32309263;
 //BA.debugLineNum = 32309263;BA.debugLine="If normalizedTrack.ContainsKey(\"type\") = False T";
if (_normalizedtrack.ContainsKey((Object)("type"))==__c.False) { 
_normalizedtrack.Put((Object)("type"),(Object)("track"));};
RDebugUtils.currentLine=32309264;
 //BA.debugLineNum = 32309264;BA.debugLine="normalizedTrack.Put(\"playlist_prefetch_source\",";
_normalizedtrack.Put((Object)("playlist_prefetch_source"),(Object)("playback_upcoming"));
RDebugUtils.currentLine=32309265;
 //BA.debugLineNum = 32309265;BA.debugLine="result.Add(normalizedTrack)";
_result.Add((Object)(_normalizedtrack.getObject()));
RDebugUtils.currentLine=32309266;
 //BA.debugLineNum = 32309266;BA.debugLine="seenTrackIds.Put(trackId, True)";
_seentrackids.Put((Object)(_trackid),(Object)(__c.True));
RDebugUtils.currentLine=32309267;
 //BA.debugLineNum = 32309267;BA.debugLine="addedCount = addedCount + 1";
_addedcount = (int) (_addedcount+1);
RDebugUtils.currentLine=32309268;
 //BA.debugLineNum = 32309268;BA.debugLine="Trace(\"autocache candidate playlistId=\" & playli";
__ref._trace /*String*/ (null,"autocache candidate playlistId="+_playlistid+" orderIndex="+BA.ObjectToString(_normalizedtrack.GetDefault((Object)("playlist_track_index"),(Object)(-1)))+" trackId="+_trackid+" source=playback_manifest_cursor");
 }
};
RDebugUtils.currentLine=32309270;
 //BA.debugLineNum = 32309270;BA.debugLine="Return addedCount";
if (true) return _addedcount;
RDebugUtils.currentLine=32309271;
 //BA.debugLineNum = 32309271;BA.debugLine="End Sub";
return 0;
}
public String  _trace(b4j.example.autonomouscachemanager __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=33226752;
 //BA.debugLineNum = 33226752;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=33226753;
 //BA.debugLineNum = 33226753;BA.debugLine="If traceTarget = Null Then";
if (__ref._tracetarget /*Object*/ == null) { 
RDebugUtils.currentLine=33226754;
 //BA.debugLineNum = 33226754;BA.debugLine="Log(message)";
__c.LogImpl("233226754",_message,0);
RDebugUtils.currentLine=33226755;
 //BA.debugLineNum = 33226755;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=33226758;
 //BA.debugLineNum = 33226758;BA.debugLine="If traceSubName = \"\" Then";
if ((__ref._tracesubname /*String*/ ).equals("")) { 
RDebugUtils.currentLine=33226759;
 //BA.debugLineNum = 33226759;BA.debugLine="Log(message)";
__c.LogImpl("233226759",_message,0);
RDebugUtils.currentLine=33226760;
 //BA.debugLineNum = 33226760;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=33226763;
 //BA.debugLineNum = 33226763;BA.debugLine="Try";
try {RDebugUtils.currentLine=33226764;
 //BA.debugLineNum = 33226764;BA.debugLine="CallSub2(traceTarget, traceSubName, message)";
__c.CallSubNew2(ba,__ref._tracetarget /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=33226766;
 //BA.debugLineNum = 33226766;BA.debugLine="Log(message)";
__c.LogImpl("233226766",_message,0);
 };
RDebugUtils.currentLine=33226768;
 //BA.debugLineNum = 33226768;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _builddesiredtrackitemsforslots(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _nextslot,int _currentneed,int _nextneed,anywheresoftware.b4a.objects.collections.Map _trackplayliststats) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "builddesiredtrackitemsforslots", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "builddesiredtrackitemsforslots", new Object[] {_currentslot,_nextslot,_currentneed,_nextneed,_trackplayliststats}));}
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _seentrackids = null;
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Private Sub BuildDesiredTrackItemsForSlots(current";
RDebugUtils.currentLine=32112641;
 //BA.debugLineNum = 32112641;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=32112642;
 //BA.debugLineNum = 32112642;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=32112644;
 //BA.debugLineNum = 32112644;BA.debugLine="Dim seenTrackIds As Map";
_seentrackids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32112645;
 //BA.debugLineNum = 32112645;BA.debugLine="seenTrackIds.Initialize";
_seentrackids.Initialize();
RDebugUtils.currentLine=32112647;
 //BA.debugLineNum = 32112647;BA.debugLine="AddDesiredTrackItemsForSlot(result, seenTrackIds,";
__ref._adddesiredtrackitemsforslot /*String*/ (null,_result,_seentrackids,_currentslot,__ref._currentslotminreserve /*int*/ ,_currentneed,"current",_trackplayliststats);
RDebugUtils.currentLine=32112648;
 //BA.debugLineNum = 32112648;BA.debugLine="AddDesiredTrackItemsForSlot(result, seenTrackIds,";
__ref._adddesiredtrackitemsforslot /*String*/ (null,_result,_seentrackids,_nextslot,__ref._nextslotminreserve /*int*/ ,_nextneed,"next",_trackplayliststats);
RDebugUtils.currentLine=32112650;
 //BA.debugLineNum = 32112650;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=32112651;
 //BA.debugLineNum = 32112651;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _buildprotectedtrackids(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "buildprotectedtrackids", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "buildprotectedtrackids", null));}
anywheresoftware.b4a.objects.collections.List _result = null;
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Private Sub BuildProtectedTrackIds As List";
RDebugUtils.currentLine=32505857;
 //BA.debugLineNum = 32505857;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=32505859;
 //BA.debugLineNum = 32505859;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=32505860;
 //BA.debugLineNum = 32505860;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Private Sub BuildRelevantTrackIds As List";
RDebugUtils.currentLine=32571393;
 //BA.debugLineNum = 32571393;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=32571396;
 //BA.debugLineNum = 32571396;BA.debugLine="Dim relevantIds As Map";
_relevantids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32571397;
 //BA.debugLineNum = 32571397;BA.debugLine="relevantIds.Initialize";
_relevantids.Initialize();
RDebugUtils.currentLine=32571399;
 //BA.debugLineNum = 32571399;BA.debugLine="Dim descriptors As List = GetStoredPlaylistDescri";
_descriptors = new anywheresoftware.b4a.objects.collections.List();
_descriptors = __ref._getstoredplaylistdescriptorssafe /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=32571400;
 //BA.debugLineNum = 32571400;BA.debugLine="If descriptors.IsInitialized = False Or descripto";
if (_descriptors.IsInitialized()==__c.False || _descriptors.getSize()==0) { 
if (true) return _result;};
RDebugUtils.currentLine=32571402;
 //BA.debugLineNum = 32571402;BA.debugLine="For Each descriptorObject As Object In descriptor";
{
final anywheresoftware.b4a.BA.IterableList group7 = _descriptors;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_descriptorobject = group7.Get(index7);
RDebugUtils.currentLine=32571403;
 //BA.debugLineNum = 32571403;BA.debugLine="If (descriptorObject Is Map) = False Then Contin";
if ((_descriptorobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=32571405;
 //BA.debugLineNum = 32571405;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=32571406;
 //BA.debugLineNum = 32571406;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = __ref._getplaylistidfromdescriptor /*String*/ (null,_descriptor);
RDebugUtils.currentLine=32571407;
 //BA.debugLineNum = 32571407;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=32571409;
 //BA.debugLineNum = 32571409;BA.debugLine="Dim manifest As Map = LoadPlaylistManifestSafe(p";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = __ref._loadplaylistmanifestsafe /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=32571410;
 //BA.debugLineNum = 32571410;BA.debugLine="If manifest.IsInitialized = False Or manifest.Si";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=32571412;
 //BA.debugLineNum = 32571412;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
_order = new anywheresoftware.b4a.objects.collections.List();
_order = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_manifest.GetDefault((Object)("order"),__c.Null)));
RDebugUtils.currentLine=32571413;
 //BA.debugLineNum = 32571413;BA.debugLine="If order.IsInitialized = False Then Continue";
if (_order.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=32571415;
 //BA.debugLineNum = 32571415;BA.debugLine="For Each trackId As String In order";
{
final anywheresoftware.b4a.BA.IterableList group16 = _order;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_trackid = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=32571416;
 //BA.debugLineNum = 32571416;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=32571417;
 //BA.debugLineNum = 32571417;BA.debugLine="If relevantIds.ContainsKey(trackId) Then Contin";
if (_relevantids.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
RDebugUtils.currentLine=32571418;
 //BA.debugLineNum = 32571418;BA.debugLine="relevantIds.Put(trackId, True)";
_relevantids.Put((Object)(_trackid),(Object)(__c.True));
 }
};
 }
};
RDebugUtils.currentLine=32571422;
 //BA.debugLineNum = 32571422;BA.debugLine="For Each trackId As String In relevantIds.Keys";
{
final anywheresoftware.b4a.BA.IterableList group22 = _relevantids.Keys();
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_trackid = BA.ObjectToString(group22.Get(index22));
RDebugUtils.currentLine=32571423;
 //BA.debugLineNum = 32571423;BA.debugLine="result.Add(trackId)";
_result.Add((Object)(_trackid));
 }
};
RDebugUtils.currentLine=32571426;
 //BA.debugLineNum = 32571426;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=32571427;
 //BA.debugLineNum = 32571427;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getstoredplaylistdescriptorssafe(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "getstoredplaylistdescriptorssafe", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getstoredplaylistdescriptorssafe", null));}
anywheresoftware.b4a.objects.collections.List _result = null;
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Private Sub GetStoredPlaylistDescriptorsSafe As Li";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=32833540;
 //BA.debugLineNum = 32833540;BA.debugLine="Try";
try {RDebugUtils.currentLine=32833541;
 //BA.debugLineNum = 32833541;BA.debugLine="result = offlineStoreService.GetStoredPlaylistDe";
_result = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getstoredplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=32833543;
 //BA.debugLineNum = 32833543;BA.debugLine="result.Initialize";
_result.Initialize();
 };
RDebugUtils.currentLine=32833546;
 //BA.debugLineNum = 32833546;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=32833547;
 //BA.debugLineNum = 32833547;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
RDebugUtils.currentLine=31326208;
 //BA.debugLineNum = 31326208;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=31326209;
 //BA.debugLineNum = 31326209;BA.debugLine="Private kvs As KeyValueStore";
_kvs = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="Private offlineStoreService As OfflineStore";
_offlinestoreservice = new b4j.example.offlinestore();
RDebugUtils.currentLine=31326211;
 //BA.debugLineNum = 31326211;BA.debugLine="Private dataResolverService As DataPlaybackResolv";
_dataresolverservice = new b4j.example.dataplaybackresolver();
RDebugUtils.currentLine=31326212;
 //BA.debugLineNum = 31326212;BA.debugLine="Private mediaCacheService As MediaCache";
_mediacacheservice = new b4j.example.mediacache();
RDebugUtils.currentLine=31326214;
 //BA.debugLineNum = 31326214;BA.debugLine="Private traceTarget As Object";
_tracetarget = new Object();
RDebugUtils.currentLine=31326215;
 //BA.debugLineNum = 31326215;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=31326217;
 //BA.debugLineNum = 31326217;BA.debugLine="Private workerTimer As Timer";
_workertimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=31326218;
 //BA.debugLineNum = 31326218;BA.debugLine="Private isRunning As Boolean";
_isrunning = false;
RDebugUtils.currentLine=31326219;
 //BA.debugLineNum = 31326219;BA.debugLine="Private stepInProgress As Boolean";
_stepinprogress = false;
RDebugUtils.currentLine=31326221;
 //BA.debugLineNum = 31326221;BA.debugLine="Private Const DEFAULT_TICK_INTERVAL_MS As Int = 3";
_default_tick_interval_ms = (int) (30000);
RDebugUtils.currentLine=31326222;
 //BA.debugLineNum = 31326222;BA.debugLine="Private Const DEFAULT_DOWNLOAD_COOLDOWN_MS As Lon";
_default_download_cooldown_ms = (long) (15000);
RDebugUtils.currentLine=31326223;
 //BA.debugLineNum = 31326223;BA.debugLine="Private Const DEFAULT_FAILURE_COOLDOWN_MS As Long";
_default_failure_cooldown_ms = (long) (120000);
RDebugUtils.currentLine=31326224;
 //BA.debugLineNum = 31326224;BA.debugLine="Private Const DEFAULT_PRUNE_COOLDOWN_MS As Long =";
_default_prune_cooldown_ms = (long) (60000);
RDebugUtils.currentLine=31326226;
 //BA.debugLineNum = 31326226;BA.debugLine="Private Const DEFAULT_CURRENT_SLOT_MIN_RESERVE As";
_default_current_slot_min_reserve = (int) (8);
RDebugUtils.currentLine=31326227;
 //BA.debugLineNum = 31326227;BA.debugLine="Private Const DEFAULT_NEXT_SLOT_MIN_RESERVE As In";
_default_next_slot_min_reserve = (int) (4);
RDebugUtils.currentLine=31326228;
 //BA.debugLineNum = 31326228;BA.debugLine="Private Const DEFAULT_PER_PLAYLIST_MIN_RESERVE As";
_default_per_playlist_min_reserve = (int) (2);
RDebugUtils.currentLine=31326229;
 //BA.debugLineNum = 31326229;BA.debugLine="Private Const DEFAULT_MAX_DOWNLOADS_PER_STEP As I";
_default_max_downloads_per_step = (int) (2);
RDebugUtils.currentLine=31326231;
 //BA.debugLineNum = 31326231;BA.debugLine="Private tickIntervalMs As Int = DEFAULT_TICK_INTE";
_tickintervalms = __ref._default_tick_interval_ms /*int*/ ;
RDebugUtils.currentLine=31326232;
 //BA.debugLineNum = 31326232;BA.debugLine="Private downloadCooldownMs As Long = DEFAULT_DOWN";
_downloadcooldownms = __ref._default_download_cooldown_ms /*long*/ ;
RDebugUtils.currentLine=31326233;
 //BA.debugLineNum = 31326233;BA.debugLine="Private failureCooldownMs As Long = DEFAULT_FAILU";
_failurecooldownms = __ref._default_failure_cooldown_ms /*long*/ ;
RDebugUtils.currentLine=31326234;
 //BA.debugLineNum = 31326234;BA.debugLine="Private pruneCooldownMs As Long = DEFAULT_PRUNE_C";
_prunecooldownms = __ref._default_prune_cooldown_ms /*long*/ ;
RDebugUtils.currentLine=31326236;
 //BA.debugLineNum = 31326236;BA.debugLine="Private currentSlotMinReserve As Int = DEFAULT_CU";
_currentslotminreserve = __ref._default_current_slot_min_reserve /*int*/ ;
RDebugUtils.currentLine=31326237;
 //BA.debugLineNum = 31326237;BA.debugLine="Private nextSlotMinReserve As Int = DEFAULT_NEXT_";
_nextslotminreserve = __ref._default_next_slot_min_reserve /*int*/ ;
RDebugUtils.currentLine=31326238;
 //BA.debugLineNum = 31326238;BA.debugLine="Private perPlaylistMinReserve As Int = DEFAULT_PE";
_perplaylistminreserve = __ref._default_per_playlist_min_reserve /*int*/ ;
RDebugUtils.currentLine=31326239;
 //BA.debugLineNum = 31326239;BA.debugLine="Private maxDownloadsPerStep As Int = DEFAULT_MAX_";
_maxdownloadsperstep = __ref._default_max_downloads_per_step /*int*/ ;
RDebugUtils.currentLine=31326241;
 //BA.debugLineNum = 31326241;BA.debugLine="Private lastSuccessfulDownloadAt As Long";
_lastsuccessfuldownloadat = 0L;
RDebugUtils.currentLine=31326242;
 //BA.debugLineNum = 31326242;BA.debugLine="Private lastFailureAt As Long";
_lastfailureat = 0L;
RDebugUtils.currentLine=31326243;
 //BA.debugLineNum = 31326243;BA.debugLine="Private lastPruneAt As Long";
_lastpruneat = 0L;
RDebugUtils.currentLine=31326244;
 //BA.debugLineNum = 31326244;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
Object _key = null;
RDebugUtils.currentLine=33161216;
 //BA.debugLineNum = 33161216;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=33161217;
 //BA.debugLineNum = 33161217;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33161218;
 //BA.debugLineNum = 33161218;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=33161220;
 //BA.debugLineNum = 33161220;BA.debugLine="If sourceMap.IsInitialized = False Then Return re";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _result;};
RDebugUtils.currentLine=33161222;
 //BA.debugLineNum = 33161222;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=33161223;
 //BA.debugLineNum = 33161223;BA.debugLine="result.Put(key, sourceMap.Get(key))";
_result.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=33161226;
 //BA.debugLineNum = 33161226;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=33161227;
 //BA.debugLineNum = 33161227;BA.debugLine="End Sub";
return null;
}
public boolean  _istrackalreadyavailable(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _track,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "istrackalreadyavailable", false))
	 {return ((Boolean) Debug.delegate(ba, "istrackalreadyavailable", new Object[] {_track,_playlistid}));}
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _normalizedtrack = null;
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Private Sub IsTrackAlreadyAvailable(track As Map,";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="If track.IsInitialized = False Then Return False";
if (_track.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"\"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=32374787;
 //BA.debugLineNum = 32374787;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=32374788;
 //BA.debugLineNum = 32374788;BA.debugLine="If playlistId = \"\" Then playlistId = track.GetDef";
if ((_playlistid).equals("")) { 
_playlistid = BA.ObjectToString(_track.GetDefault((Object)("playlist_id"),(Object)("")));};
RDebugUtils.currentLine=32374789;
 //BA.debugLineNum = 32374789;BA.debugLine="If playlistId <> \"\" And mediaCacheService.HasTrac";
if ((_playlistid).equals("") == false && __ref._mediacacheservice /*b4j.example.mediacache*/ ._hastrackfilebyplaylist /*boolean*/ (null,_trackid,_playlistid)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=32374790;
 //BA.debugLineNum = 32374790;BA.debugLine="If mediaCacheService.IsTrackCached(trackId) Then";
if (__ref._mediacacheservice /*b4j.example.mediacache*/ ._istrackcached /*boolean*/ (null,_trackid)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=32374791;
 //BA.debugLineNum = 32374791;BA.debugLine="Dim normalizedTrack As Map = CloneMap(track)";
_normalizedtrack = new anywheresoftware.b4a.objects.collections.Map();
_normalizedtrack = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_track);
RDebugUtils.currentLine=32374792;
 //BA.debugLineNum = 32374792;BA.debugLine="If normalizedTrack.ContainsKey(\"type\") = False Th";
if (_normalizedtrack.ContainsKey((Object)("type"))==__c.False) { 
_normalizedtrack.Put((Object)("type"),(Object)("track"));};
RDebugUtils.currentLine=32374793;
 //BA.debugLineNum = 32374793;BA.debugLine="If playlistId <> \"\" And normalizedTrack.ContainsK";
if ((_playlistid).equals("") == false && _normalizedtrack.ContainsKey((Object)("playlist_id"))==__c.False) { 
_normalizedtrack.Put((Object)("playlist_id"),(Object)(_playlistid));};
RDebugUtils.currentLine=32374794;
 //BA.debugLineNum = 32374794;BA.debugLine="Return mediaCacheService.HasValidatedLocalMedia(n";
if (true) return __ref._mediacacheservice /*b4j.example.mediacache*/ ._hasvalidatedlocalmedia /*boolean*/ (null,_normalizedtrack);
RDebugUtils.currentLine=32374795;
 //BA.debugLineNum = 32374795;BA.debugLine="End Sub";
return false;
}
public String  _configure(b4j.example.autonomouscachemanager __ref,int _tickms,int _currentreserve,int _nextreserve,int _perplaylistreserve,int _maxdownloads) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "configure", false))
	 {return ((String) Debug.delegate(ba, "configure", new Object[] {_tickms,_currentreserve,_nextreserve,_perplaylistreserve,_maxdownloads}));}
RDebugUtils.currentLine=31457280;
 //BA.debugLineNum = 31457280;BA.debugLine="Public Sub Configure( _ 	tickMs As Int, _ 	current";
RDebugUtils.currentLine=31457287;
 //BA.debugLineNum = 31457287;BA.debugLine="If tickMs > 0 Then tickIntervalMs = tickMs";
if (_tickms>0) { 
__ref._tickintervalms /*int*/  = _tickms;};
RDebugUtils.currentLine=31457288;
 //BA.debugLineNum = 31457288;BA.debugLine="If currentReserve >= 0 Then currentSlotMinReserve";
if (_currentreserve>=0) { 
__ref._currentslotminreserve /*int*/  = _currentreserve;};
RDebugUtils.currentLine=31457289;
 //BA.debugLineNum = 31457289;BA.debugLine="If nextReserve >= 0 Then nextSlotMinReserve = nex";
if (_nextreserve>=0) { 
__ref._nextslotminreserve /*int*/  = _nextreserve;};
RDebugUtils.currentLine=31457290;
 //BA.debugLineNum = 31457290;BA.debugLine="If perPlaylistReserve >= 0 Then perPlaylistMinRes";
if (_perplaylistreserve>=0) { 
__ref._perplaylistminreserve /*int*/  = _perplaylistreserve;};
RDebugUtils.currentLine=31457291;
 //BA.debugLineNum = 31457291;BA.debugLine="If maxDownloads > 0 Then maxDownloadsPerStep = ma";
if (_maxdownloads>0) { 
__ref._maxdownloadsperstep /*int*/  = _maxdownloads;};
RDebugUtils.currentLine=31457293;
 //BA.debugLineNum = 31457293;BA.debugLine="workerTimer.Interval = tickIntervalMs";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._tickintervalms /*int*/ ));
RDebugUtils.currentLine=31457294;
 //BA.debugLineNum = 31457294;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Private Sub CountPlayableTracksInSlot(slot As Map,";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="If slot.IsInitialized = False Then Return 0";
if (_slot.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=32047107;
 //BA.debugLineNum = 32047107;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = __ref._getslotplaylists /*anywheresoftware.b4a.objects.collections.List*/ (null,_slot);
RDebugUtils.currentLine=32047108;
 //BA.debugLineNum = 32047108;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=32047110;
 //BA.debugLineNum = 32047110;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
RDebugUtils.currentLine=32047112;
 //BA.debugLineNum = 32047112;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group5 = _playlists;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_playlistobject = group5.Get(index5);
RDebugUtils.currentLine=32047113;
 //BA.debugLineNum = 32047113;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=32047114;
 //BA.debugLineNum = 32047114;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=32047115;
 //BA.debugLineNum = 32047115;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = __ref._getplaylistidfromdescriptor /*String*/ (null,_playlistdescriptor);
RDebugUtils.currentLine=32047116;
 //BA.debugLineNum = 32047116;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=32047117;
 //BA.debugLineNum = 32047117;BA.debugLine="totalCount = totalCount + GetCachedTrackCountFor";
_totalcount = (int) (_totalcount+__ref._getcachedtrackcountforplaylist /*int*/ (null,_trackplayliststats,_playlistid));
 }
};
RDebugUtils.currentLine=32047120;
 //BA.debugLineNum = 32047120;BA.debugLine="Return totalCount";
if (true) return _totalcount;
RDebugUtils.currentLine=32047121;
 //BA.debugLineNum = 32047121;BA.debugLine="End Sub";
return 0;
}
public boolean  _hasmediacacherecentfailure(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "hasmediacacherecentfailure", false))
	 {return ((Boolean) Debug.delegate(ba, "hasmediacacherecentfailure", null));}
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Private Sub HasMediaCacheRecentFailure As Boolean";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="Try";
try {RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="Return mediaCacheService.ConsumeRecentMediaNetwo";
if (true) return __ref._mediacacheservice /*b4j.example.mediacache*/ ._consumerecentmedianetworkfailure /*boolean*/ (null);
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=32899076;
 //BA.debugLineNum = 32899076;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=32899078;
 //BA.debugLineNum = 32899078;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.BA _ba,b4j.example.keyvaluestore _storagevalue,b4j.example.offlinestore _offlinestorevalue,b4j.example.dataplaybackresolver _dataresolvervalue,b4j.example.mediacache _mediacachevalue,Object _tracetargetvalue,String _tracesubnamevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagevalue,_offlinestorevalue,_dataresolvervalue,_mediacachevalue,_tracetargetvalue,_tracesubnamevalue}));}
RDebugUtils.currentLine=31391744;
 //BA.debugLineNum = 31391744;BA.debugLine="Public Sub Initialize( _ 	storageValue As KeyValue";
RDebugUtils.currentLine=31391752;
 //BA.debugLineNum = 31391752;BA.debugLine="kvs = storageValue";
__ref._kvs /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=31391753;
 //BA.debugLineNum = 31391753;BA.debugLine="offlineStoreService = offlineStoreValue";
__ref._offlinestoreservice /*b4j.example.offlinestore*/  = _offlinestorevalue;
RDebugUtils.currentLine=31391754;
 //BA.debugLineNum = 31391754;BA.debugLine="dataResolverService = dataResolverValue";
__ref._dataresolverservice /*b4j.example.dataplaybackresolver*/  = _dataresolvervalue;
RDebugUtils.currentLine=31391755;
 //BA.debugLineNum = 31391755;BA.debugLine="mediaCacheService = mediaCacheValue";
__ref._mediacacheservice /*b4j.example.mediacache*/  = _mediacachevalue;
RDebugUtils.currentLine=31391756;
 //BA.debugLineNum = 31391756;BA.debugLine="traceTarget = traceTargetValue";
__ref._tracetarget /*Object*/  = _tracetargetvalue;
RDebugUtils.currentLine=31391757;
 //BA.debugLineNum = 31391757;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=31391759;
 //BA.debugLineNum = 31391759;BA.debugLine="workerTimer.Initialize(\"workerTimer\", tickInterva";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"workerTimer",(long) (__ref._tickintervalms /*int*/ ));
RDebugUtils.currentLine=31391760;
 //BA.debugLineNum = 31391760;BA.debugLine="End Sub";
return "";
}
public boolean  _isdownloadcooldownactive(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "isdownloadcooldownactive", false))
	 {return ((Boolean) Debug.delegate(ba, "isdownloadcooldownactive", null));}
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Private Sub IsDownloadCooldownActive As Boolean";
RDebugUtils.currentLine=32964609;
 //BA.debugLineNum = 32964609;BA.debugLine="If lastSuccessfulDownloadAt <= 0 Then Return Fals";
if (__ref._lastsuccessfuldownloadat /*long*/ <=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="Return DateTime.Now - lastSuccessfulDownloadAt <";
if (true) return __c.DateTime.getNow()-__ref._lastsuccessfuldownloadat /*long*/ <__ref._downloadcooldownms /*long*/ ;
RDebugUtils.currentLine=32964611;
 //BA.debugLineNum = 32964611;BA.debugLine="End Sub";
return false;
}
public boolean  _isfailurecooldownactive(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "isfailurecooldownactive", false))
	 {return ((Boolean) Debug.delegate(ba, "isfailurecooldownactive", null));}
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Private Sub IsFailureCooldownActive As Boolean";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="If lastFailureAt <= 0 Then Return False";
if (__ref._lastfailureat /*long*/ <=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="Return DateTime.Now - lastFailureAt < failureCool";
if (true) return __c.DateTime.getNow()-__ref._lastfailureat /*long*/ <__ref._failurecooldownms /*long*/ ;
RDebugUtils.currentLine=33030147;
 //BA.debugLineNum = 33030147;BA.debugLine="End Sub";
return false;
}
public boolean  _isstarted(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "isstarted", false))
	 {return ((Boolean) Debug.delegate(ba, "isstarted", null));}
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Public Sub IsStarted As Boolean";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="Return isRunning";
if (true) return __ref._isrunning /*boolean*/ ;
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="End Sub";
return false;
}
public String  _requestplaybackresumeifneeded(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "requestplaybackresumeifneeded", false))
	 {return ((String) Debug.delegate(ba, "requestplaybackresumeifneeded", null));}
RDebugUtils.currentLine=33095680;
 //BA.debugLineNum = 33095680;BA.debugLine="Private Sub RequestPlaybackResumeIfNeeded";
RDebugUtils.currentLine=33095681;
 //BA.debugLineNum = 33095681;BA.debugLine="If traceTarget = Null Then Return";
if (__ref._tracetarget /*Object*/ == null) { 
if (true) return "";};
RDebugUtils.currentLine=33095682;
 //BA.debugLineNum = 33095682;BA.debugLine="Try";
try {RDebugUtils.currentLine=33095683;
 //BA.debugLineNum = 33095683;BA.debugLine="If SubExists(traceTarget, \"AutoResumeAfterCacheW";
if (__c.SubExists(ba,__ref._tracetarget /*Object*/ ,"AutoResumeAfterCacheWarmup")) { 
RDebugUtils.currentLine=33095684;
 //BA.debugLineNum = 33095684;BA.debugLine="CallSubDelayed(traceTarget, \"AutoResumeAfterCac";
__c.CallSubDelayed(ba,__ref._tracetarget /*Object*/ ,"AutoResumeAfterCacheWarmup");
 };
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=33095687;
 //BA.debugLineNum = 33095687;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("233095687",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=33095689;
 //BA.debugLineNum = 33095689;BA.debugLine="End Sub";
return "";
}
public int  _resolveslotneed(b4j.example.autonomouscachemanager __ref,anywheresoftware.b4a.objects.collections.Map _slot,int _minreserve,anywheresoftware.b4a.objects.collections.Map _trackplayliststats) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "resolveslotneed", false))
	 {return ((Integer) Debug.delegate(ba, "resolveslotneed", new Object[] {_slot,_minreserve,_trackplayliststats}));}
anywheresoftware.b4a.objects.collections.List _playlists = null;
int _playablecount = 0;
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Private Sub ResolveSlotNeed(slot As Map, minReserv";
RDebugUtils.currentLine=31981569;
 //BA.debugLineNum = 31981569;BA.debugLine="If slot.IsInitialized = False Or slot.Size = 0 Th";
if (_slot.IsInitialized()==__c.False || _slot.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=31981571;
 //BA.debugLineNum = 31981571;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = __ref._getslotplaylists /*anywheresoftware.b4a.objects.collections.List*/ (null,_slot);
RDebugUtils.currentLine=31981572;
 //BA.debugLineNum = 31981572;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=31981574;
 //BA.debugLineNum = 31981574;BA.debugLine="Dim playableCount As Int = CountPlayableTracksInS";
_playablecount = __ref._countplayabletracksinslot /*int*/ (null,_slot,_trackplayliststats);
RDebugUtils.currentLine=31981575;
 //BA.debugLineNum = 31981575;BA.debugLine="Return Max(0, minReserve - playableCount)";
if (true) return (int) (__c.Max(0,_minreserve-_playablecount));
RDebugUtils.currentLine=31981576;
 //BA.debugLineNum = 31981576;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Private Sub RunPruneIfNeeded(initiator As String)";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="If DateTime.Now - lastPruneAt < pruneCooldownMs T";
if (__c.DateTime.getNow()-__ref._lastpruneat /*long*/ <__ref._prunecooldownms /*long*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=32440323;
 //BA.debugLineNum = 32440323;BA.debugLine="Dim protectedTrackIds As List = BuildProtectedTra";
_protectedtrackids = new anywheresoftware.b4a.objects.collections.List();
_protectedtrackids = __ref._buildprotectedtrackids /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=32440324;
 //BA.debugLineNum = 32440324;BA.debugLine="Dim relevantTrackIds As List = BuildRelevantTrack";
_relevanttrackids = new anywheresoftware.b4a.objects.collections.List();
_relevanttrackids = __ref._buildrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=32440326;
 //BA.debugLineNum = 32440326;BA.debugLine="Dim removedCount As Int = mediaCacheService.Prune";
_removedcount = __ref._mediacacheservice /*b4j.example.mediacache*/ ._prunetrackcacheifneeded /*int*/ (null,_protectedtrackids,_relevanttrackids);
RDebugUtils.currentLine=32440327;
 //BA.debugLineNum = 32440327;BA.debugLine="lastPruneAt = DateTime.Now";
__ref._lastpruneat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=32440329;
 //BA.debugLineNum = 32440329;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
RDebugUtils.currentLine=32440330;
 //BA.debugLineNum = 32440330;BA.debugLine="Trace(\"autocache prune completed initiator=\" & i";
__ref._trace /*String*/ (null,"autocache prune completed initiator="+_initiator+" removed="+BA.NumberToString(_removedcount));
 }else {
RDebugUtils.currentLine=32440332;
 //BA.debugLineNum = 32440332;BA.debugLine="Trace(\"autocache prune completed initiator=\" & i";
__ref._trace /*String*/ (null,"autocache prune completed initiator="+_initiator+" removed=0");
 };
RDebugUtils.currentLine=32440334;
 //BA.debugLineNum = 32440334;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="Dim summary As Map";
_summary = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="summary.Initialize";
_summary.Initialize();
RDebugUtils.currentLine=31916035;
 //BA.debugLineNum = 31916035;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "autonomouscachemanager", "runstepasync"),(int) (0));
this.state = 28;
return;
case 28:
//C
this.state = 1;
;
RDebugUtils.currentLine=31916037;
 //BA.debugLineNum = 31916037;BA.debugLine="If kvs.IsInitialized = False Or offlineStoreServi";
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
RDebugUtils.currentLine=31916038;
 //BA.debugLineNum = 31916038;BA.debugLine="summary.Put(\"status\", \"not_initialized\")";
_summary.Put((Object)("status"),(Object)("not_initialized"));
RDebugUtils.currentLine=31916039;
 //BA.debugLineNum = 31916039;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;
;
RDebugUtils.currentLine=31916042;
 //BA.debugLineNum = 31916042;BA.debugLine="If IsFailureCooldownActive Then";

case 4:
//if
this.state = 7;
if (__ref._isfailurecooldownactive /*boolean*/ (null)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=31916043;
 //BA.debugLineNum = 31916043;BA.debugLine="summary.Put(\"status\", \"failure_cooldown\")";
_summary.Put((Object)("status"),(Object)("failure_cooldown"));
RDebugUtils.currentLine=31916044;
 //BA.debugLineNum = 31916044;BA.debugLine="Trace(\"autocache step skipped reason=failure_coo";
__ref._trace /*String*/ (null,"autocache step skipped reason=failure_cooldown");
RDebugUtils.currentLine=31916045;
 //BA.debugLineNum = 31916045;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;
;
RDebugUtils.currentLine=31916048;
 //BA.debugLineNum = 31916048;BA.debugLine="If IsDownloadCooldownActive Then";

case 7:
//if
this.state = 10;
if (__ref._isdownloadcooldownactive /*boolean*/ (null)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=31916049;
 //BA.debugLineNum = 31916049;BA.debugLine="summary.Put(\"status\", \"download_cooldown\")";
_summary.Put((Object)("status"),(Object)("download_cooldown"));
RDebugUtils.currentLine=31916050;
 //BA.debugLineNum = 31916050;BA.debugLine="Trace(\"autocache step skipped reason=download_co";
__ref._trace /*String*/ (null,"autocache step skipped reason=download_cooldown");
RDebugUtils.currentLine=31916051;
 //BA.debugLineNum = 31916051;BA.debugLine="RunPruneIfNeeded(\"cooldown\")";
__ref._runpruneifneeded /*String*/ (null,"cooldown");
RDebugUtils.currentLine=31916052;
 //BA.debugLineNum = 31916052;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=31916055;
 //BA.debugLineNum = 31916055;BA.debugLine="Dim offlineData As Map = offlineStoreService.Load";
_offlinedata = new anywheresoftware.b4a.objects.collections.Map();
_offlinedata = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._loadofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=31916056;
 //BA.debugLineNum = 31916056;BA.debugLine="If offlineData.IsInitialized = False Or offlineDa";
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
RDebugUtils.currentLine=31916057;
 //BA.debugLineNum = 31916057;BA.debugLine="summary.Put(\"status\", \"no_offline_data\")";
_summary.Put((Object)("status"),(Object)("no_offline_data"));
RDebugUtils.currentLine=31916058;
 //BA.debugLineNum = 31916058;BA.debugLine="Trace(\"autocache step skipped reason=no_offline_";
__ref._trace /*String*/ (null,"autocache step skipped reason=no_offline_data");
RDebugUtils.currentLine=31916059;
 //BA.debugLineNum = 31916059;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=31916062;
 //BA.debugLineNum = 31916062;BA.debugLine="mediaCacheService.EnsureTrackCacheReady";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._ensuretrackcacheready /*String*/ (null);
RDebugUtils.currentLine=31916063;
 //BA.debugLineNum = 31916063;BA.debugLine="Dim trackPlaylistStats As Map = mediaCacheService";
_trackplayliststats = new anywheresoftware.b4a.objects.collections.Map();
_trackplayliststats = __ref._mediacacheservice /*b4j.example.mediacache*/ ._getcachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=31916065;
 //BA.debugLineNum = 31916065;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
_nowticks = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=31916066;
 //BA.debugLineNum = 31916066;BA.debugLine="Dim currentSlot As Map = dataResolverService.Reso";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._dataresolverservice /*b4j.example.dataplaybackresolver*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_nowticks);
RDebugUtils.currentLine=31916067;
 //BA.debugLineNum = 31916067;BA.debugLine="Dim nextSlot As Map = dataResolverService.Resolve";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
_nextslot = __ref._dataresolverservice /*b4j.example.dataplaybackresolver*/ ._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,_nowticks);
RDebugUtils.currentLine=31916069;
 //BA.debugLineNum = 31916069;BA.debugLine="Dim currentNeed As Int = ResolveSlotNeed(currentS";
_currentneed = __ref._resolveslotneed /*int*/ (null,_currentslot,__ref._currentslotminreserve /*int*/ ,_trackplayliststats);
RDebugUtils.currentLine=31916070;
 //BA.debugLineNum = 31916070;BA.debugLine="Dim nextNeed As Int = ResolveSlotNeed(nextSlot, n";
_nextneed = __ref._resolveslotneed /*int*/ (null,_nextslot,__ref._nextslotminreserve /*int*/ ,_trackplayliststats);
RDebugUtils.currentLine=31916072;
 //BA.debugLineNum = 31916072;BA.debugLine="Dim desiredTrackItems As List = BuildDesiredTrack";
_desiredtrackitems = new anywheresoftware.b4a.objects.collections.List();
_desiredtrackitems = __ref._builddesiredtrackitemsforslots /*anywheresoftware.b4a.objects.collections.List*/ (null,_currentslot,_nextslot,_currentneed,_nextneed,_trackplayliststats);
RDebugUtils.currentLine=31916074;
 //BA.debugLineNum = 31916074;BA.debugLine="summary.Put(\"current_need\", currentNeed)";
_summary.Put((Object)("current_need"),(Object)(_currentneed));
RDebugUtils.currentLine=31916075;
 //BA.debugLineNum = 31916075;BA.debugLine="summary.Put(\"next_need\", nextNeed)";
_summary.Put((Object)("next_need"),(Object)(_nextneed));
RDebugUtils.currentLine=31916076;
 //BA.debugLineNum = 31916076;BA.debugLine="summary.Put(\"candidate_count\", desiredTrackItems.";
_summary.Put((Object)("candidate_count"),(Object)(_desiredtrackitems.getSize()));
RDebugUtils.currentLine=31916078;
 //BA.debugLineNum = 31916078;BA.debugLine="If desiredTrackItems.Size = 0 Then";
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
RDebugUtils.currentLine=31916079;
 //BA.debugLineNum = 31916079;BA.debugLine="summary.Put(\"status\", \"nothing_to_download\")";
_summary.Put((Object)("status"),(Object)("nothing_to_download"));
RDebugUtils.currentLine=31916080;
 //BA.debugLineNum = 31916080;BA.debugLine="Trace(\"autocache step no work currentNeed=\" & cu";
__ref._trace /*String*/ (null,"autocache step no work currentNeed="+BA.NumberToString(_currentneed)+" nextNeed="+BA.NumberToString(_nextneed));
RDebugUtils.currentLine=31916081;
 //BA.debugLineNum = 31916081;BA.debugLine="RunPruneIfNeeded(\"idle\")";
__ref._runpruneifneeded /*String*/ (null,"idle");
RDebugUtils.currentLine=31916082;
 //BA.debugLineNum = 31916082;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=31916085;
 //BA.debugLineNum = 31916085;BA.debugLine="Dim actualMaxDownloads As Int = Min(maxDownloadsP";
_actualmaxdownloads = (int) (parent.__c.Min(__ref._maxdownloadsperstep /*int*/ ,_desiredtrackitems.getSize()));
RDebugUtils.currentLine=31916086;
 //BA.debugLineNum = 31916086;BA.debugLine="Trace(\"autocache step download start candidates=\"";
__ref._trace /*String*/ (null,"autocache step download start candidates="+BA.NumberToString(_desiredtrackitems.getSize())+" maxDownloads="+BA.NumberToString(_actualmaxdownloads));
RDebugUtils.currentLine=31916088;
 //BA.debugLineNum = 31916088;BA.debugLine="Wait For (mediaCacheService.EnsureTracksCached(de";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "autonomouscachemanager", "runstepasync"), __ref._mediacacheservice /*b4j.example.mediacache*/ ._ensuretrackscached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_desiredtrackitems,_actualmaxdownloads));
this.state = 29;
return;
case 29:
//C
this.state = 19;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=31916090;
 //BA.debugLineNum = 31916090;BA.debugLine="If HasMediaCacheRecentFailure Then";
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
RDebugUtils.currentLine=31916091;
 //BA.debugLineNum = 31916091;BA.debugLine="lastFailureAt = DateTime.Now";
__ref._lastfailureat /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=31916092;
 //BA.debugLineNum = 31916092;BA.debugLine="summary.Put(\"status\", \"network_failure\")";
_summary.Put((Object)("status"),(Object)("network_failure"));
RDebugUtils.currentLine=31916093;
 //BA.debugLineNum = 31916093;BA.debugLine="Trace(\"autocache step network failure\")";
__ref._trace /*String*/ (null,"autocache step network failure");
RDebugUtils.currentLine=31916094;
 //BA.debugLineNum = 31916094;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;
;
RDebugUtils.currentLine=31916097;
 //BA.debugLineNum = 31916097;BA.debugLine="If downloaded Then";

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
RDebugUtils.currentLine=31916098;
 //BA.debugLineNum = 31916098;BA.debugLine="lastSuccessfulDownloadAt = DateTime.Now";
__ref._lastsuccessfuldownloadat /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=31916099;
 //BA.debugLineNum = 31916099;BA.debugLine="summary.Put(\"status\", \"downloaded\")";
_summary.Put((Object)("status"),(Object)("downloaded"));
RDebugUtils.currentLine=31916100;
 //BA.debugLineNum = 31916100;BA.debugLine="summary.Put(\"downloaded\", True)";
_summary.Put((Object)("downloaded"),(Object)(parent.__c.True));
RDebugUtils.currentLine=31916101;
 //BA.debugLineNum = 31916101;BA.debugLine="RequestPlaybackResumeIfNeeded";
__ref._requestplaybackresumeifneeded /*String*/ (null);
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=31916103;
 //BA.debugLineNum = 31916103;BA.debugLine="summary.Put(\"status\", \"no_new_downloads\")";
_summary.Put((Object)("status"),(Object)("no_new_downloads"));
RDebugUtils.currentLine=31916104;
 //BA.debugLineNum = 31916104;BA.debugLine="summary.Put(\"downloaded\", False)";
_summary.Put((Object)("downloaded"),(Object)(parent.__c.False));
 if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=31916107;
 //BA.debugLineNum = 31916107;BA.debugLine="RunPruneIfNeeded(\"post_download\")";
__ref._runpruneifneeded /*String*/ (null,"post_download");
RDebugUtils.currentLine=31916108;
 //BA.debugLineNum = 31916108;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
RDebugUtils.currentLine=31916109;
 //BA.debugLineNum = 31916109;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="Wait For (RunStepAsync) Complete (summary As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "autonomouscachemanager", "runstepasyncdeferred"), __ref._runstepasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_summary = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="stepInProgress = False";
__ref._stepinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=31850499;
 //BA.debugLineNum = 31850499;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setcooldowns(b4j.example.autonomouscachemanager __ref,long _downloadcooldownvalue,long _failurecooldownvalue,long _prunecooldownvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "setcooldowns", false))
	 {return ((String) Debug.delegate(ba, "setcooldowns", new Object[] {_downloadcooldownvalue,_failurecooldownvalue,_prunecooldownvalue}));}
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Public Sub SetCooldowns(downloadCooldownValue As L";
RDebugUtils.currentLine=31522817;
 //BA.debugLineNum = 31522817;BA.debugLine="If downloadCooldownValue >= 0 Then downloadCooldo";
if (_downloadcooldownvalue>=0) { 
__ref._downloadcooldownms /*long*/  = _downloadcooldownvalue;};
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="If failureCooldownValue >= 0 Then failureCooldown";
if (_failurecooldownvalue>=0) { 
__ref._failurecooldownms /*long*/  = _failurecooldownvalue;};
RDebugUtils.currentLine=31522819;
 //BA.debugLineNum = 31522819;BA.debugLine="If pruneCooldownValue >= 0 Then pruneCooldownMs =";
if (_prunecooldownvalue>=0) { 
__ref._prunecooldownms /*long*/  = _prunecooldownvalue;};
RDebugUtils.currentLine=31522820;
 //BA.debugLineNum = 31522820;BA.debugLine="End Sub";
return "";
}
public String  _start(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "start", false))
	 {return ((String) Debug.delegate(ba, "start", null));}
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Public Sub Start";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="isRunning = True";
__ref._isrunning /*boolean*/  = __c.True;
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="workerTimer.Interval = tickIntervalMs";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._tickintervalms /*int*/ ));
RDebugUtils.currentLine=31588355;
 //BA.debugLineNum = 31588355;BA.debugLine="workerTimer.Enabled = True";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=31588356;
 //BA.debugLineNum = 31588356;BA.debugLine="Trace(\"autocache manager started tickMs=\" & tickI";
__ref._trace /*String*/ (null,"autocache manager started tickMs="+BA.NumberToString(__ref._tickintervalms /*int*/ ));
RDebugUtils.currentLine=31588357;
 //BA.debugLineNum = 31588357;BA.debugLine="End Sub";
return "";
}
public String  _stopmanager(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "stopmanager", false))
	 {return ((String) Debug.delegate(ba, "stopmanager", null));}
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Public Sub StopManager";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="isRunning = False";
__ref._isrunning /*boolean*/  = __c.False;
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="workerTimer.Enabled = False";
__ref._workertimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=31653891;
 //BA.debugLineNum = 31653891;BA.debugLine="Trace(\"autocache manager stopped\")";
__ref._trace /*String*/ (null,"autocache manager stopped");
RDebugUtils.currentLine=31653892;
 //BA.debugLineNum = 31653892;BA.debugLine="End Sub";
return "";
}
public String  _workertimer_tick(b4j.example.autonomouscachemanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="autonomouscachemanager";
if (Debug.shouldDelegate(ba, "workertimer_tick", false))
	 {return ((String) Debug.delegate(ba, "workertimer_tick", null));}
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Private Sub workerTimer_Tick";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="If isRunning = False Then Return";
if (__ref._isrunning /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="If stepInProgress Then Return";
if (__ref._stepinprogress /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=31784964;
 //BA.debugLineNum = 31784964;BA.debugLine="stepInProgress = True";
__ref._stepinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=31784965;
 //BA.debugLineNum = 31784965;BA.debugLine="CallSubDelayed(Me, \"RunStepAsyncDeferred\")";
__c.CallSubDelayed(ba,this,"RunStepAsyncDeferred");
RDebugUtils.currentLine=31784966;
 //BA.debugLineNum = 31784966;BA.debugLine="End Sub";
return "";
}
}