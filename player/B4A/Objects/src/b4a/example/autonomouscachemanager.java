package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class autonomouscachemanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.autonomouscachemanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.autonomouscachemanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.keyvaluestore _kvs = null;
public b4a.example.offlinestore _offlinestoreservice = null;
public b4a.example.dataplaybackresolver _dataresolverservice = null;
public b4a.example.mediacache _mediacacheservice = null;
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
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _adddesiredtrackitemsforslot(anywheresoftware.b4a.objects.collections.List _result,anywheresoftware.b4a.objects.collections.Map _seentrackids,anywheresoftware.b4a.objects.collections.Map _slot,int _slotreserve,int _slotneed,String _slotlabel) throws Exception{
anywheresoftware.b4a.objects.collections.List _playlists = null;
anywheresoftware.b4a.objects.collections.List _playlistids = null;
anywheresoftware.b4a.objects.collections.List _weightedplaylistids = null;
anywheresoftware.b4a.objects.collections.Map _playlistoccurrences = null;
int _totalplayable = 0;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
String _playlistid = "";
int _playlistplayablecount = 0;
boolean _allplaylistsready = false;
int _occurrenceweight = 0;
anywheresoftware.b4a.objects.collections.Map _manifestsbyplaylist = null;
anywheresoftware.b4a.objects.collections.Map _manifest = null;
int _remainingneed = 0;
int _playableinplaylist = 0;
int _missingforplaylist = 0;
int _addedcount = 0;
int _addedinround = 0;
 //BA.debugLineNum = 287;BA.debugLine="Private Sub AddDesiredTrackItemsForSlot(result As";
 //BA.debugLineNum = 288;BA.debugLine="If slot.IsInitialized = False Or slot.Size = 0 Th";
if (_slot.IsInitialized()==__c.False || _slot.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 290;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = _getslotplaylists(_slot);
 //BA.debugLineNum = 291;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 293;BA.debugLine="Dim playlistIds As List";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 294;BA.debugLine="playlistIds.Initialize";
_playlistids.Initialize();
 //BA.debugLineNum = 295;BA.debugLine="Dim weightedPlaylistIds As List";
_weightedplaylistids = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 296;BA.debugLine="weightedPlaylistIds.Initialize";
_weightedplaylistids.Initialize();
 //BA.debugLineNum = 297;BA.debugLine="Dim playlistOccurrences As Map";
_playlistoccurrences = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 298;BA.debugLine="playlistOccurrences.Initialize";
_playlistoccurrences.Initialize();
 //BA.debugLineNum = 299;BA.debugLine="Dim totalPlayable As Int = 0";
_totalplayable = (int) (0);
 //BA.debugLineNum = 301;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group11 = _playlists;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_playlistobject = group11.Get(index11);
 //BA.debugLineNum = 302;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 303;BA.debugLine="Dim descriptor As Map = playlistObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
 //BA.debugLineNum = 304;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = _getplaylistidfromdescriptor(_descriptor);
 //BA.debugLineNum = 305;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 306;BA.debugLine="weightedPlaylistIds.Add(playlistId)";
_weightedplaylistids.Add((Object)(_playlistid));
 //BA.debugLineNum = 307;BA.debugLine="playlistOccurrences.Put(playlistId, playlistOccu";
_playlistoccurrences.Put((Object)(_playlistid),(Object)((double)(BA.ObjectToNumber(_playlistoccurrences.GetDefault((Object)(_playlistid),(Object)(0))))+1));
 //BA.debugLineNum = 308;BA.debugLine="If playlistIds.IndexOf(playlistId) >= 0 Then Con";
if (_playlistids.IndexOf((Object)(_playlistid))>=0) { 
if (true) continue;};
 //BA.debugLineNum = 309;BA.debugLine="playlistIds.Add(playlistId)";
_playlistids.Add((Object)(_playlistid));
 //BA.debugLineNum = 310;BA.debugLine="Dim playlistPlayableCount As Int = CountUpcoming";
_playlistplayablecount = _countupcominghotcachedtracksforplaylist(_playlistid,(int) (__c.Max(_slotreserve*2,_perplaylistminreserve*8)));
 //BA.debugLineNum = 311;BA.debugLine="totalPlayable = totalPlayable + playlistPlayable";
_totalplayable = (int) (_totalplayable+_playlistplayablecount);
 }
};
 //BA.debugLineNum = 314;BA.debugLine="If playlistIds.Size = 0 Then Return";
if (_playlistids.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 315;BA.debugLine="Dim allPlaylistsReady As Boolean = True";
_allplaylistsready = __c.True;
 //BA.debugLineNum = 316;BA.debugLine="For Each playlistId As String In playlistIds";
{
final anywheresoftware.b4a.BA.IterableList group25 = _playlistids;
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_playlistid = BA.ObjectToString(group25.Get(index25));
 //BA.debugLineNum = 317;BA.debugLine="Dim playlistPlayableCount As Int = CountUpcoming";
_playlistplayablecount = _countupcominghotcachedtracksforplaylist(_playlistid,(int) (__c.Max(_slotreserve*2,_perplaylistminreserve*8)));
 //BA.debugLineNum = 318;BA.debugLine="Dim occurrenceWeight As Int = Max(1, playlistOcc";
_occurrenceweight = (int) (__c.Max(1,(double)(BA.ObjectToNumber(_playlistoccurrences.GetDefault((Object)(_playlistid),(Object)(1))))));
 //BA.debugLineNum = 319;BA.debugLine="If playlistPlayableCount < perPlaylistMinReserve";
if (_playlistplayablecount<_perplaylistminreserve*_occurrenceweight) { 
 //BA.debugLineNum = 320;BA.debugLine="allPlaylistsReady = False";
_allplaylistsready = __c.False;
 //BA.debugLineNum = 321;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 324;BA.debugLine="If slotNeed <= 0 And totalPlayable >= slotReserve";
if (_slotneed<=0 && _totalplayable>=_slotreserve && _allplaylistsready) { 
if (true) return "";};
 //BA.debugLineNum = 326;BA.debugLine="Dim manifestsByPlaylist As Map";
_manifestsbyplaylist = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 327;BA.debugLine="manifestsByPlaylist.Initialize";
_manifestsbyplaylist.Initialize();
 //BA.debugLineNum = 328;BA.debugLine="totalPlayable = 0";
_totalplayable = (int) (0);
 //BA.debugLineNum = 330;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group37 = _playlists;
final int groupLen37 = group37.getSize()
;int index37 = 0;
;
for (; index37 < groupLen37;index37++){
_playlistobject = group37.Get(index37);
 //BA.debugLineNum = 331;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 333;BA.debugLine="Dim descriptor As Map = playlistObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
 //BA.debugLineNum = 334;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = _getplaylistidfromdescriptor(_descriptor);
 //BA.debugLineNum = 335;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 337;BA.debugLine="Dim manifest As Map = LoadPlaylistManifestSafe(p";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = _loadplaylistmanifestsafe(_playlistid);
 //BA.debugLineNum = 338;BA.debugLine="If manifest.IsInitialized = False Or manifest.Si";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) continue;};
 //BA.debugLineNum = 339;BA.debugLine="If manifestsByPlaylist.ContainsKey(playlistId) T";
if (_manifestsbyplaylist.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
 //BA.debugLineNum = 341;BA.debugLine="manifestsByPlaylist.Put(playlistId, manifest)";
_manifestsbyplaylist.Put((Object)(_playlistid),(Object)(_manifest.getObject()));
 //BA.debugLineNum = 342;BA.debugLine="totalPlayable = totalPlayable + CountUpcomingHot";
_totalplayable = (int) (_totalplayable+_countupcominghotcachedtracksforplaylist(_playlistid,(int) (__c.Max(_slotreserve*2,_perplaylistminreserve*8))));
 }
};
 //BA.debugLineNum = 345;BA.debugLine="If playlistIds.Size = 0 Then Return";
if (_playlistids.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 347;BA.debugLine="Dim remainingNeed As Int = Max(0, slotReserve - t";
_remainingneed = (int) (__c.Max(0,_slotreserve-_totalplayable));
 //BA.debugLineNum = 348;BA.debugLine="If slotNeed > remainingNeed Then remainingNeed =";
if (_slotneed>_remainingneed) { 
_remainingneed = _slotneed;};
 //BA.debugLineNum = 350;BA.debugLine="For Each playlistId As String In playlistIds";
{
final anywheresoftware.b4a.BA.IterableList group51 = _playlistids;
final int groupLen51 = group51.getSize()
;int index51 = 0;
;
for (; index51 < groupLen51;index51++){
_playlistid = BA.ObjectToString(group51.Get(index51));
 //BA.debugLineNum = 351;BA.debugLine="Dim manifest As Map = manifestsByPlaylist.Get(pl";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_manifestsbyplaylist.Get((Object)(_playlistid))));
 //BA.debugLineNum = 352;BA.debugLine="Dim playableInPlaylist As Int = CountUpcomingHot";
_playableinplaylist = _countupcominghotcachedtracksforplaylist(_playlistid,(int) (__c.Max(_slotreserve*2,_perplaylistminreserve*8)));
 //BA.debugLineNum = 353;BA.debugLine="Dim occurrenceWeight As Int = Max(1, playlistOcc";
_occurrenceweight = (int) (__c.Max(1,(double)(BA.ObjectToNumber(_playlistoccurrences.GetDefault((Object)(_playlistid),(Object)(1))))));
 //BA.debugLineNum = 354;BA.debugLine="Dim missingForPlaylist As Int = Max(0, (perPlayl";
_missingforplaylist = (int) (__c.Max(0,(_perplaylistminreserve*_occurrenceweight)-_playableinplaylist));
 //BA.debugLineNum = 355;BA.debugLine="If missingForPlaylist <= 0 Then Continue";
if (_missingforplaylist<=0) { 
if (true) continue;};
 //BA.debugLineNum = 356;BA.debugLine="Dim addedCount As Int = CollectUpcomingTracksFor";
_addedcount = _collectupcomingtracksforplaylist(_result,_seentrackids,_playlistid,_missingforplaylist);
 //BA.debugLineNum = 357;BA.debugLine="If addedCount > 0 Then";
if (_addedcount>0) { 
 //BA.debugLineNum = 358;BA.debugLine="Trace(\"autocache slot fill slot=\" & slotLabel &";
_trace("autocache slot fill slot="+_slotlabel+" playlistId="+_playlistid+" added="+BA.NumberToString(_addedcount)+" reason=per_playlist_min weight="+BA.NumberToString(_occurrenceweight));
 };
 }
};
 //BA.debugLineNum = 362;BA.debugLine="If remainingNeed <= 0 Then Return";
if (_remainingneed<=0) { 
if (true) return "";};
 //BA.debugLineNum = 364;BA.debugLine="Do While remainingNeed > 0";
while (_remainingneed>0) {
 //BA.debugLineNum = 365;BA.debugLine="Dim addedInRound As Int = 0";
_addedinround = (int) (0);
 //BA.debugLineNum = 366;BA.debugLine="For Each playlistId As String In weightedPlaylis";
{
final anywheresoftware.b4a.BA.IterableList group65 = _weightedplaylistids;
final int groupLen65 = group65.getSize()
;int index65 = 0;
;
for (; index65 < groupLen65;index65++){
_playlistid = BA.ObjectToString(group65.Get(index65));
 //BA.debugLineNum = 367;BA.debugLine="If remainingNeed <= 0 Then Exit";
if (_remainingneed<=0) { 
if (true) break;};
 //BA.debugLineNum = 368;BA.debugLine="Dim addedCount As Int = CollectUpcomingTracksFo";
_addedcount = _collectupcomingtracksforplaylist(_result,_seentrackids,_playlistid,(int) (1));
 //BA.debugLineNum = 369;BA.debugLine="If addedCount <= 0 Then Continue";
if (_addedcount<=0) { 
if (true) continue;};
 //BA.debugLineNum = 370;BA.debugLine="addedInRound = addedInRound + addedCount";
_addedinround = (int) (_addedinround+_addedcount);
 //BA.debugLineNum = 371;BA.debugLine="remainingNeed = Max(0, remainingNeed - addedCou";
_remainingneed = (int) (__c.Max(0,_remainingneed-_addedcount));
 }
};
 //BA.debugLineNum = 373;BA.debugLine="If addedInRound <= 0 Then Exit";
if (_addedinround<=0) { 
if (true) break;};
 }
;
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _builddesiredtrackitemsforslots(anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _nextslot,int _currentneed,int _nextneed) throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _seentrackids = null;
 //BA.debugLineNum = 274;BA.debugLine="Private Sub BuildDesiredTrackItemsForSlots(current";
 //BA.debugLineNum = 275;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 276;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 278;BA.debugLine="Dim seenTrackIds As Map";
_seentrackids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 279;BA.debugLine="seenTrackIds.Initialize";
_seentrackids.Initialize();
 //BA.debugLineNum = 281;BA.debugLine="AddDesiredTrackItemsForSlot(result, seenTrackIds,";
_adddesiredtrackitemsforslot(_result,_seentrackids,_currentslot,_currentslotminreserve,_currentneed,"current");
 //BA.debugLineNum = 282;BA.debugLine="AddDesiredTrackItemsForSlot(result, seenTrackIds,";
_adddesiredtrackitemsforslot(_result,_seentrackids,_nextslot,_nextslotminreserve,_nextneed,"next");
 //BA.debugLineNum = 284;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _buildprotectedtrackids() throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
 //BA.debugLineNum = 431;BA.debugLine="Private Sub BuildProtectedTrackIds As List";
 //BA.debugLineNum = 432;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 433;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 434;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _buildrelevanttrackids() throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _relevantids = null;
anywheresoftware.b4a.objects.collections.List _descriptors = null;
Object _descriptorobject = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _manifest = null;
anywheresoftware.b4a.objects.collections.List _order = null;
String _trackid = "";
 //BA.debugLineNum = 437;BA.debugLine="Private Sub BuildRelevantTrackIds As List";
 //BA.debugLineNum = 438;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 439;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 441;BA.debugLine="Dim relevantIds As Map";
_relevantids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 442;BA.debugLine="relevantIds.Initialize";
_relevantids.Initialize();
 //BA.debugLineNum = 444;BA.debugLine="Dim descriptors As List = GetStoredPlaylistDescri";
_descriptors = new anywheresoftware.b4a.objects.collections.List();
_descriptors = _getstoredplaylistdescriptorssafe();
 //BA.debugLineNum = 445;BA.debugLine="If descriptors.IsInitialized = False Or descripto";
if (_descriptors.IsInitialized()==__c.False || _descriptors.getSize()==0) { 
if (true) return _result;};
 //BA.debugLineNum = 447;BA.debugLine="For Each descriptorObject As Object In descriptor";
{
final anywheresoftware.b4a.BA.IterableList group7 = _descriptors;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_descriptorobject = group7.Get(index7);
 //BA.debugLineNum = 448;BA.debugLine="If (descriptorObject Is Map) = False Then Contin";
if ((_descriptorobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 450;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
 //BA.debugLineNum = 451;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = _getplaylistidfromdescriptor(_descriptor);
 //BA.debugLineNum = 452;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 454;BA.debugLine="Dim manifest As Map = LoadPlaylistManifestSafe(p";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = _loadplaylistmanifestsafe(_playlistid);
 //BA.debugLineNum = 455;BA.debugLine="If manifest.IsInitialized = False Or manifest.Si";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) continue;};
 //BA.debugLineNum = 457;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
_order = new anywheresoftware.b4a.objects.collections.List();
_order = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_manifest.GetDefault((Object)("order"),__c.Null)));
 //BA.debugLineNum = 458;BA.debugLine="If order.IsInitialized = False Then Continue";
if (_order.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 460;BA.debugLine="For Each trackId As String In order";
{
final anywheresoftware.b4a.BA.IterableList group16 = _order;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_trackid = BA.ObjectToString(group16.Get(index16));
 //BA.debugLineNum = 461;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 462;BA.debugLine="If relevantIds.ContainsKey(trackId) Then Contin";
if (_relevantids.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
 //BA.debugLineNum = 463;BA.debugLine="relevantIds.Put(trackId, True)";
_relevantids.Put((Object)(_trackid),(Object)(__c.True));
 }
};
 }
};
 //BA.debugLineNum = 467;BA.debugLine="For Each trackId As String In relevantIds.Keys";
{
final anywheresoftware.b4a.BA.IterableList group22 = _relevantids.Keys();
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_trackid = BA.ObjectToString(group22.Get(index22));
 //BA.debugLineNum = 468;BA.debugLine="result.Add(trackId)";
_result.Add((Object)(_trackid));
 }
};
 //BA.debugLineNum = 471;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private kvs As KeyValueStore";
_kvs = new b4a.example.keyvaluestore();
 //BA.debugLineNum = 8;BA.debugLine="Private offlineStoreService As OfflineStore";
_offlinestoreservice = new b4a.example.offlinestore();
 //BA.debugLineNum = 9;BA.debugLine="Private dataResolverService As DataPlaybackResolv";
_dataresolverservice = new b4a.example.dataplaybackresolver();
 //BA.debugLineNum = 10;BA.debugLine="Private mediaCacheService As MediaCache";
_mediacacheservice = new b4a.example.mediacache();
 //BA.debugLineNum = 12;BA.debugLine="Private traceTarget As Object";
_tracetarget = new Object();
 //BA.debugLineNum = 13;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
 //BA.debugLineNum = 15;BA.debugLine="Private workerTimer As Timer";
_workertimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 16;BA.debugLine="Private isRunning As Boolean";
_isrunning = false;
 //BA.debugLineNum = 17;BA.debugLine="Private stepInProgress As Boolean";
_stepinprogress = false;
 //BA.debugLineNum = 19;BA.debugLine="Private Const DEFAULT_TICK_INTERVAL_MS As Int = 3";
_default_tick_interval_ms = (int) (30000);
 //BA.debugLineNum = 20;BA.debugLine="Private Const DEFAULT_DOWNLOAD_COOLDOWN_MS As Lon";
_default_download_cooldown_ms = (long) (15000);
 //BA.debugLineNum = 21;BA.debugLine="Private Const DEFAULT_FAILURE_COOLDOWN_MS As Long";
_default_failure_cooldown_ms = (long) (120000);
 //BA.debugLineNum = 22;BA.debugLine="Private Const DEFAULT_PRUNE_COOLDOWN_MS As Long =";
_default_prune_cooldown_ms = (long) (60000);
 //BA.debugLineNum = 24;BA.debugLine="Private Const DEFAULT_CURRENT_SLOT_MIN_RESERVE As";
_default_current_slot_min_reserve = (int) (8);
 //BA.debugLineNum = 25;BA.debugLine="Private Const DEFAULT_NEXT_SLOT_MIN_RESERVE As In";
_default_next_slot_min_reserve = (int) (4);
 //BA.debugLineNum = 26;BA.debugLine="Private Const DEFAULT_PER_PLAYLIST_MIN_RESERVE As";
_default_per_playlist_min_reserve = (int) (2);
 //BA.debugLineNum = 27;BA.debugLine="Private Const DEFAULT_MAX_DOWNLOADS_PER_STEP As I";
_default_max_downloads_per_step = (int) (2);
 //BA.debugLineNum = 29;BA.debugLine="Private tickIntervalMs As Int = DEFAULT_TICK_INTE";
_tickintervalms = _default_tick_interval_ms;
 //BA.debugLineNum = 30;BA.debugLine="Private downloadCooldownMs As Long = DEFAULT_DOWN";
_downloadcooldownms = _default_download_cooldown_ms;
 //BA.debugLineNum = 31;BA.debugLine="Private failureCooldownMs As Long = DEFAULT_FAILU";
_failurecooldownms = _default_failure_cooldown_ms;
 //BA.debugLineNum = 32;BA.debugLine="Private pruneCooldownMs As Long = DEFAULT_PRUNE_C";
_prunecooldownms = _default_prune_cooldown_ms;
 //BA.debugLineNum = 34;BA.debugLine="Private currentSlotMinReserve As Int = DEFAULT_CU";
_currentslotminreserve = _default_current_slot_min_reserve;
 //BA.debugLineNum = 35;BA.debugLine="Private nextSlotMinReserve As Int = DEFAULT_NEXT_";
_nextslotminreserve = _default_next_slot_min_reserve;
 //BA.debugLineNum = 36;BA.debugLine="Private perPlaylistMinReserve As Int = DEFAULT_PE";
_perplaylistminreserve = _default_per_playlist_min_reserve;
 //BA.debugLineNum = 37;BA.debugLine="Private maxDownloadsPerStep As Int = DEFAULT_MAX_";
_maxdownloadsperstep = _default_max_downloads_per_step;
 //BA.debugLineNum = 39;BA.debugLine="Private lastSuccessfulDownloadAt As Long";
_lastsuccessfuldownloadat = 0L;
 //BA.debugLineNum = 40;BA.debugLine="Private lastFailureAt As Long";
_lastfailureat = 0L;
 //BA.debugLineNum = 41;BA.debugLine="Private lastPruneAt As Long";
_lastpruneat = 0L;
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.Map _result = null;
Object _key = null;
 //BA.debugLineNum = 561;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
 //BA.debugLineNum = 562;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 563;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 565;BA.debugLine="If sourceMap.IsInitialized = False Then Return re";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _result;};
 //BA.debugLineNum = 567;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
 //BA.debugLineNum = 568;BA.debugLine="result.Put(key, sourceMap.Get(key))";
_result.Put(_key,_sourcemap.Get(_key));
 }
};
 //BA.debugLineNum = 571;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 572;BA.debugLine="End Sub";
return null;
}
public int  _collectupcomingtracksforplaylist(anywheresoftware.b4a.objects.collections.List _result,anywheresoftware.b4a.objects.collections.Map _seentrackids,String _playlistid,int _limitcount) throws Exception{
int _requestcount = 0;
anywheresoftware.b4a.objects.collections.List _upcomingtracks = null;
int _addedcount = 0;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _normalizedtrack = null;
 //BA.debugLineNum = 377;BA.debugLine="Private Sub CollectUpcomingTracksForPlaylist(resul";
 //BA.debugLineNum = 378;BA.debugLine="If playlistId = \"\" Or limitCount <= 0 Then Return";
if ((_playlistid).equals("") || _limitcount<=0) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 379;BA.debugLine="Dim requestCount As Int = Max(limitCount * 8, per";
_requestcount = (int) (__c.Max(_limitcount*8,_perplaylistminreserve*8));
 //BA.debugLineNum = 380;BA.debugLine="Dim upcomingTracks As List = dataResolverService.";
_upcomingtracks = new anywheresoftware.b4a.objects.collections.List();
_upcomingtracks = _dataresolverservice._getupcomingplaybacktracksbyid /*anywheresoftware.b4a.objects.collections.List*/ (_playlistid,_requestcount,_mediacacheservice,__c.False);
 //BA.debugLineNum = 381;BA.debugLine="If upcomingTracks.IsInitialized = False Or upcomi";
if (_upcomingtracks.IsInitialized()==__c.False || _upcomingtracks.getSize()==0) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 382;BA.debugLine="Dim addedCount As Int = 0";
_addedcount = (int) (0);
 //BA.debugLineNum = 383;BA.debugLine="For Each trackObject As Object In upcomingTracks";
{
final anywheresoftware.b4a.BA.IterableList group6 = _upcomingtracks;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_trackobject = group6.Get(index6);
 //BA.debugLineNum = 384;BA.debugLine="If addedCount >= limitCount Then Exit";
if (_addedcount>=_limitcount) { 
if (true) break;};
 //BA.debugLineNum = 385;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 386;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
 //BA.debugLineNum = 387;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 388;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 389;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Contin";
if (_seentrackids.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
 //BA.debugLineNum = 390;BA.debugLine="If IsTrackAlreadyAvailable(track, playlistId) Th";
if (_istrackalreadyavailable(_track,_playlistid)) { 
if (true) continue;};
 //BA.debugLineNum = 391;BA.debugLine="Dim normalizedTrack As Map = CloneMap(track)";
_normalizedtrack = new anywheresoftware.b4a.objects.collections.Map();
_normalizedtrack = _clonemap(_track);
 //BA.debugLineNum = 392;BA.debugLine="If normalizedTrack.ContainsKey(\"type\") = False T";
if (_normalizedtrack.ContainsKey((Object)("type"))==__c.False) { 
_normalizedtrack.Put((Object)("type"),(Object)("track"));};
 //BA.debugLineNum = 393;BA.debugLine="normalizedTrack.Put(\"playlist_prefetch_source\",";
_normalizedtrack.Put((Object)("playlist_prefetch_source"),(Object)("playback_upcoming"));
 //BA.debugLineNum = 394;BA.debugLine="result.Add(normalizedTrack)";
_result.Add((Object)(_normalizedtrack.getObject()));
 //BA.debugLineNum = 395;BA.debugLine="seenTrackIds.Put(trackId, True)";
_seentrackids.Put((Object)(_trackid),(Object)(__c.True));
 //BA.debugLineNum = 396;BA.debugLine="addedCount = addedCount + 1";
_addedcount = (int) (_addedcount+1);
 //BA.debugLineNum = 397;BA.debugLine="Trace(\"autocache candidate playlistId=\" & playli";
_trace("autocache candidate playlistId="+_playlistid+" orderIndex="+BA.ObjectToString(_normalizedtrack.GetDefault((Object)("playlist_track_index"),(Object)(-1)))+" trackId="+_trackid+" source=playback_manifest_cursor");
 }
};
 //BA.debugLineNum = 399;BA.debugLine="Return addedCount";
if (true) return _addedcount;
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return 0;
}
public String  _configure(int _tickms,int _currentreserve,int _nextreserve,int _perplaylistreserve,int _maxdownloads) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub Configure( _ 	tickMs As Int, _ 	current";
 //BA.debugLineNum = 69;BA.debugLine="If tickMs > 0 Then tickIntervalMs = tickMs";
if (_tickms>0) { 
_tickintervalms = _tickms;};
 //BA.debugLineNum = 70;BA.debugLine="If currentReserve >= 0 Then currentSlotMinReserve";
if (_currentreserve>=0) { 
_currentslotminreserve = _currentreserve;};
 //BA.debugLineNum = 71;BA.debugLine="If nextReserve >= 0 Then nextSlotMinReserve = nex";
if (_nextreserve>=0) { 
_nextslotminreserve = _nextreserve;};
 //BA.debugLineNum = 72;BA.debugLine="If perPlaylistReserve >= 0 Then perPlaylistMinRes";
if (_perplaylistreserve>=0) { 
_perplaylistminreserve = _perplaylistreserve;};
 //BA.debugLineNum = 73;BA.debugLine="If maxDownloads > 0 Then maxDownloadsPerStep = ma";
if (_maxdownloads>0) { 
_maxdownloadsperstep = _maxdownloads;};
 //BA.debugLineNum = 75;BA.debugLine="workerTimer.Interval = tickIntervalMs";
_workertimer.setInterval((long) (_tickintervalms));
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public int  _counthotplayabletracksinslot(anywheresoftware.b4a.objects.collections.Map _slot,int _minreserve) throws Exception{
anywheresoftware.b4a.objects.collections.List _playlists = null;
int _totalcount = 0;
anywheresoftware.b4a.objects.collections.Map _seenplaylistids = null;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
 //BA.debugLineNum = 237;BA.debugLine="Private Sub CountHotPlayableTracksInSlot(slot As M";
 //BA.debugLineNum = 238;BA.debugLine="If slot.IsInitialized = False Then Return 0";
if (_slot.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 240;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = _getslotplaylists(_slot);
 //BA.debugLineNum = 241;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 243;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
 //BA.debugLineNum = 244;BA.debugLine="Dim seenPlaylistIds As Map";
_seenplaylistids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 245;BA.debugLine="seenPlaylistIds.Initialize";
_seenplaylistids.Initialize();
 //BA.debugLineNum = 247;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group7 = _playlists;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_playlistobject = group7.Get(index7);
 //BA.debugLineNum = 248;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 249;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
 //BA.debugLineNum = 250;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = _getplaylistidfromdescriptor(_playlistdescriptor);
 //BA.debugLineNum = 251;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 252;BA.debugLine="If seenPlaylistIds.ContainsKey(playlistId) Then";
if (_seenplaylistids.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
 //BA.debugLineNum = 253;BA.debugLine="seenPlaylistIds.Put(playlistId, True)";
_seenplaylistids.Put((Object)(_playlistid),(Object)(__c.True));
 //BA.debugLineNum = 254;BA.debugLine="totalCount = totalCount + CountUpcomingHotCached";
_totalcount = (int) (_totalcount+_countupcominghotcachedtracksforplaylist(_playlistid,(int) (__c.Max(_minreserve*2,_perplaylistminreserve*4))));
 //BA.debugLineNum = 255;BA.debugLine="If totalCount >= minReserve Then Exit";
if (_totalcount>=_minreserve) { 
if (true) break;};
 }
};
 //BA.debugLineNum = 258;BA.debugLine="Return totalCount";
if (true) return _totalcount;
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _countslotcacheheat(anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
anywheresoftware.b4a.objects.collections.Map _seenplaylistids = null;
int _hotcount = 0;
int _coldcount = 0;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _heat = null;
 //BA.debugLineNum = 199;BA.debugLine="Private Sub CountSlotCacheHeat(slot As Map) As Map";
 //BA.debugLineNum = 200;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 201;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 202;BA.debugLine="result.Put(\"hot\", 0)";
_result.Put((Object)("hot"),(Object)(0));
 //BA.debugLineNum = 203;BA.debugLine="result.Put(\"cold\", 0)";
_result.Put((Object)("cold"),(Object)(0));
 //BA.debugLineNum = 204;BA.debugLine="If slot.IsInitialized = False Or slot.Size = 0 Th";
if (_slot.IsInitialized()==__c.False || _slot.getSize()==0) { 
if (true) return _result;};
 //BA.debugLineNum = 205;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = _getslotplaylists(_slot);
 //BA.debugLineNum = 206;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return _result;};
 //BA.debugLineNum = 207;BA.debugLine="Dim seenPlaylistIds As Map";
_seenplaylistids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 208;BA.debugLine="seenPlaylistIds.Initialize";
_seenplaylistids.Initialize();
 //BA.debugLineNum = 209;BA.debugLine="Dim hotCount As Int = 0";
_hotcount = (int) (0);
 //BA.debugLineNum = 210;BA.debugLine="Dim coldCount As Int = 0";
_coldcount = (int) (0);
 //BA.debugLineNum = 211;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group12 = _playlists;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_playlistobject = group12.Get(index12);
 //BA.debugLineNum = 212;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 213;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
 //BA.debugLineNum = 214;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
_playlistid = _getplaylistidfromdescriptor(_playlistdescriptor);
 //BA.debugLineNum = 215;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 216;BA.debugLine="If seenPlaylistIds.ContainsKey(playlistId) Then";
if (_seenplaylistids.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
 //BA.debugLineNum = 217;BA.debugLine="seenPlaylistIds.Put(playlistId, True)";
_seenplaylistids.Put((Object)(_playlistid),(Object)(__c.True));
 //BA.debugLineNum = 218;BA.debugLine="Dim heat As Map = dataResolverService.GetPlaylis";
_heat = new anywheresoftware.b4a.objects.collections.Map();
_heat = _dataresolverservice._getplaylistcacheheatcountsbyid /*anywheresoftware.b4a.objects.collections.Map*/ (_playlistid,_mediacacheservice);
 //BA.debugLineNum = 219;BA.debugLine="hotCount = hotCount + heat.GetDefault(\"hot\", 0)";
_hotcount = (int) (_hotcount+(double)(BA.ObjectToNumber(_heat.GetDefault((Object)("hot"),(Object)(0)))));
 //BA.debugLineNum = 220;BA.debugLine="coldCount = coldCount + heat.GetDefault(\"cold\",";
_coldcount = (int) (_coldcount+(double)(BA.ObjectToNumber(_heat.GetDefault((Object)("cold"),(Object)(0)))));
 }
};
 //BA.debugLineNum = 222;BA.debugLine="result.Put(\"hot\", hotCount)";
_result.Put((Object)("hot"),(Object)(_hotcount));
 //BA.debugLineNum = 223;BA.debugLine="result.Put(\"cold\", coldCount)";
_result.Put((Object)("cold"),(Object)(_coldcount));
 //BA.debugLineNum = 224;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public int  _countupcominghotcachedtracksforplaylist(String _playlistid,int _lookaheadcount) throws Exception{
anywheresoftware.b4a.objects.collections.List _upcomingtracks = null;
int _count = 0;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
 //BA.debugLineNum = 261;BA.debugLine="Private Sub CountUpcomingHotCachedTracksForPlaylis";
 //BA.debugLineNum = 262;BA.debugLine="If playlistId = \"\" Or lookaheadCount <= 0 Then Re";
if ((_playlistid).equals("") || _lookaheadcount<=0) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 263;BA.debugLine="Dim upcomingTracks As List = dataResolverService.";
_upcomingtracks = new anywheresoftware.b4a.objects.collections.List();
_upcomingtracks = _dataresolverservice._getupcomingplaybacktracksbyid /*anywheresoftware.b4a.objects.collections.List*/ (_playlistid,_lookaheadcount,_mediacacheservice,__c.True);
 //BA.debugLineNum = 264;BA.debugLine="If upcomingTracks.IsInitialized = False Or upcomi";
if (_upcomingtracks.IsInitialized()==__c.False || _upcomingtracks.getSize()==0) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 265;BA.debugLine="Dim count As Int = 0";
_count = (int) (0);
 //BA.debugLineNum = 266;BA.debugLine="For Each trackObject As Object In upcomingTracks";
{
final anywheresoftware.b4a.BA.IterableList group5 = _upcomingtracks;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_trackobject = group5.Get(index5);
 //BA.debugLineNum = 267;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 268;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
 //BA.debugLineNum = 269;BA.debugLine="If mediaCacheService.HasValidatedLocalMedia(trac";
if (_mediacacheservice._hasvalidatedlocalmedia /*boolean*/ (_track)) { 
_count = (int) (_count+1);};
 }
};
 //BA.debugLineNum = 271;BA.debugLine="Return count";
if (true) return _count;
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return 0;
}
public String  _getplaylistidfromdescriptor(anywheresoftware.b4a.objects.collections.Map _descriptor) throws Exception{
String _playlistid = "";
 //BA.debugLineNum = 492;BA.debugLine="Private Sub GetPlaylistIdFromDescriptor(descriptor";
 //BA.debugLineNum = 493;BA.debugLine="If descriptor.IsInitialized = False Then Return \"";
if (_descriptor.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 495;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 496;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
if ((_playlistid).equals("") == false) { 
if (true) return _playlistid;};
 //BA.debugLineNum = 498;BA.debugLine="playlistId = descriptor.GetDefault(\"playlist_id\",";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("playlist_id"),(Object)("")));
 //BA.debugLineNum = 499;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
if ((_playlistid).equals("") == false) { 
if (true) return _playlistid;};
 //BA.debugLineNum = 501;BA.debugLine="playlistId = descriptor.GetDefault(\"playlistId\",";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("playlistId"),(Object)("")));
 //BA.debugLineNum = 502;BA.debugLine="Return playlistId";
if (true) return _playlistid;
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getslotplaylists(anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
anywheresoftware.b4a.objects.collections.List _emptylist = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
anywheresoftware.b4a.objects.collections.List _emptyresult = null;
 //BA.debugLineNum = 474;BA.debugLine="Private Sub GetSlotPlaylists(slot As Map) As List";
 //BA.debugLineNum = 475;BA.debugLine="If slot.IsInitialized = False Then";
if (_slot.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 476;BA.debugLine="Dim emptyList As List";
_emptylist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 477;BA.debugLine="emptyList.Initialize";
_emptylist.Initialize();
 //BA.debugLineNum = 478;BA.debugLine="Return emptyList";
if (true) return _emptylist;
 };
 //BA.debugLineNum = 481;BA.debugLine="Dim playlists As List = slot.GetDefault(\"playlist";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slot.GetDefault((Object)("playlists"),__c.Null)));
 //BA.debugLineNum = 482;BA.debugLine="If playlists.IsInitialized Then Return playlists";
if (_playlists.IsInitialized()) { 
if (true) return _playlists;};
 //BA.debugLineNum = 484;BA.debugLine="playlists = slot.GetDefault(\"playlist_descriptors";
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slot.GetDefault((Object)("playlist_descriptors"),__c.Null)));
 //BA.debugLineNum = 485;BA.debugLine="If playlists.IsInitialized Then Return playlists";
if (_playlists.IsInitialized()) { 
if (true) return _playlists;};
 //BA.debugLineNum = 487;BA.debugLine="Dim emptyResult As List";
_emptyresult = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 488;BA.debugLine="emptyResult.Initialize";
_emptyresult.Initialize();
 //BA.debugLineNum = 489;BA.debugLine="Return emptyResult";
if (true) return _emptyresult;
 //BA.debugLineNum = 490;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getstoredplaylistdescriptorssafe() throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
 //BA.debugLineNum = 519;BA.debugLine="Private Sub GetStoredPlaylistDescriptorsSafe As Li";
 //BA.debugLineNum = 520;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 521;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 523;BA.debugLine="Try";
try { //BA.debugLineNum = 524;BA.debugLine="result = offlineStoreService.GetStoredPlaylistDe";
_result = _offlinestoreservice._getstoredplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ ();
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 526;BA.debugLine="result.Initialize";
_result.Initialize();
 };
 //BA.debugLineNum = 529;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return null;
}
public boolean  _hasmediacacherecentfailure() throws Exception{
 //BA.debugLineNum = 532;BA.debugLine="Private Sub HasMediaCacheRecentFailure As Boolean";
 //BA.debugLineNum = 533;BA.debugLine="Try";
try { //BA.debugLineNum = 534;BA.debugLine="Return mediaCacheService.ConsumeRecentMediaNetwo";
if (true) return _mediacacheservice._consumerecentmedianetworkfailure /*boolean*/ ();
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 536;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,b4a.example.keyvaluestore _storagevalue,b4a.example.offlinestore _offlinestorevalue,b4a.example.dataplaybackresolver _dataresolvervalue,b4a.example.mediacache _mediacachevalue,Object _tracetargetvalue,String _tracesubnamevalue) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 44;BA.debugLine="Public Sub Initialize( _ 	storageValue As KeyValue";
 //BA.debugLineNum = 52;BA.debugLine="kvs = storageValue";
_kvs = _storagevalue;
 //BA.debugLineNum = 53;BA.debugLine="offlineStoreService = offlineStoreValue";
_offlinestoreservice = _offlinestorevalue;
 //BA.debugLineNum = 54;BA.debugLine="dataResolverService = dataResolverValue";
_dataresolverservice = _dataresolvervalue;
 //BA.debugLineNum = 55;BA.debugLine="mediaCacheService = mediaCacheValue";
_mediacacheservice = _mediacachevalue;
 //BA.debugLineNum = 56;BA.debugLine="traceTarget = traceTargetValue";
_tracetarget = _tracetargetvalue;
 //BA.debugLineNum = 57;BA.debugLine="traceSubName = traceSubNameValue";
_tracesubname = _tracesubnamevalue;
 //BA.debugLineNum = 59;BA.debugLine="workerTimer.Initialize(\"workerTimer\", tickInterva";
_workertimer.Initialize(ba,"workerTimer",(long) (_tickintervalms));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public boolean  _isdownloadcooldownactive() throws Exception{
 //BA.debugLineNum = 540;BA.debugLine="Private Sub IsDownloadCooldownActive As Boolean";
 //BA.debugLineNum = 541;BA.debugLine="If lastSuccessfulDownloadAt <= 0 Then Return Fals";
if (_lastsuccessfuldownloadat<=0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 542;BA.debugLine="Return DateTime.Now - lastSuccessfulDownloadAt <";
if (true) return __c.DateTime.getNow()-_lastsuccessfuldownloadat<_downloadcooldownms;
 //BA.debugLineNum = 543;BA.debugLine="End Sub";
return false;
}
public boolean  _isfailurecooldownactive() throws Exception{
 //BA.debugLineNum = 545;BA.debugLine="Private Sub IsFailureCooldownActive As Boolean";
 //BA.debugLineNum = 546;BA.debugLine="If lastFailureAt <= 0 Then Return False";
if (_lastfailureat<=0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 547;BA.debugLine="Return DateTime.Now - lastFailureAt < failureCool";
if (true) return __c.DateTime.getNow()-_lastfailureat<_failurecooldownms;
 //BA.debugLineNum = 548;BA.debugLine="End Sub";
return false;
}
public boolean  _isstarted() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub IsStarted As Boolean";
 //BA.debugLineNum = 98;BA.debugLine="Return isRunning";
if (true) return _isrunning;
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return false;
}
public boolean  _istrackalreadyavailable(anywheresoftware.b4a.objects.collections.Map _track,String _playlistid) throws Exception{
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _normalizedtrack = null;
 //BA.debugLineNum = 402;BA.debugLine="Private Sub IsTrackAlreadyAvailable(track As Map,";
 //BA.debugLineNum = 403;BA.debugLine="If track.IsInitialized = False Then Return False";
if (_track.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 404;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"\"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 405;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 406;BA.debugLine="If playlistId = \"\" Then playlistId = track.GetDef";
if ((_playlistid).equals("")) { 
_playlistid = BA.ObjectToString(_track.GetDefault((Object)("playlist_id"),(Object)("")));};
 //BA.debugLineNum = 407;BA.debugLine="If playlistId <> \"\" And mediaCacheService.HasTrac";
if ((_playlistid).equals("") == false && _mediacacheservice._hastrackfilebyplaylist /*boolean*/ (_trackid,_playlistid)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 408;BA.debugLine="If mediaCacheService.IsTrackCached(trackId) Then";
if (_mediacacheservice._istrackcached /*boolean*/ (_trackid)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 409;BA.debugLine="Dim normalizedTrack As Map = CloneMap(track)";
_normalizedtrack = new anywheresoftware.b4a.objects.collections.Map();
_normalizedtrack = _clonemap(_track);
 //BA.debugLineNum = 410;BA.debugLine="If normalizedTrack.ContainsKey(\"type\") = False Th";
if (_normalizedtrack.ContainsKey((Object)("type"))==__c.False) { 
_normalizedtrack.Put((Object)("type"),(Object)("track"));};
 //BA.debugLineNum = 411;BA.debugLine="If playlistId <> \"\" And normalizedTrack.ContainsK";
if ((_playlistid).equals("") == false && _normalizedtrack.ContainsKey((Object)("playlist_id"))==__c.False) { 
_normalizedtrack.Put((Object)("playlist_id"),(Object)(_playlistid));};
 //BA.debugLineNum = 412;BA.debugLine="Return mediaCacheService.HasValidatedLocalMedia(n";
if (true) return _mediacacheservice._hasvalidatedlocalmedia /*boolean*/ (_normalizedtrack);
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _loadplaylistmanifestsafe(String _playlistid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _result = null;
 //BA.debugLineNum = 505;BA.debugLine="Private Sub LoadPlaylistManifestSafe(playlistId As";
 //BA.debugLineNum = 506;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 507;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 508;BA.debugLine="If playlistId = \"\" Then Return result";
if ((_playlistid).equals("")) { 
if (true) return _result;};
 //BA.debugLineNum = 510;BA.debugLine="Try";
try { //BA.debugLineNum = 511;BA.debugLine="result = dataResolverService.GetPlaylistPlayback";
_result = _dataresolverservice._getplaylistplaybackmanifestbyid /*anywheresoftware.b4a.objects.collections.Map*/ (_playlistid);
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 513;BA.debugLine="result.Initialize";
_result.Initialize();
 };
 //BA.debugLineNum = 516;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 517;BA.debugLine="End Sub";
return null;
}
public String  _requestplaybackresumeifneeded() throws Exception{
 //BA.debugLineNum = 550;BA.debugLine="Private Sub RequestPlaybackResumeIfNeeded";
 //BA.debugLineNum = 551;BA.debugLine="If traceTarget = Null Then Return";
if (_tracetarget== null) { 
if (true) return "";};
 //BA.debugLineNum = 552;BA.debugLine="Try";
try { //BA.debugLineNum = 553;BA.debugLine="If SubExists(traceTarget, \"AutoResumeAfterCacheW";
if (__c.SubExists(ba,_tracetarget,"AutoResumeAfterCacheWarmup")) { 
 //BA.debugLineNum = 554;BA.debugLine="CallSubDelayed(traceTarget, \"AutoResumeAfterCac";
__c.CallSubDelayed(ba,_tracetarget,"AutoResumeAfterCacheWarmup");
 };
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 557;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("339583751",__c.LastException(getActivityBA()).getMessage(),0);
 };
 //BA.debugLineNum = 559;BA.debugLine="End Sub";
return "";
}
public int  _resolveslotneed(anywheresoftware.b4a.objects.collections.Map _slot,int _minreserve) throws Exception{
anywheresoftware.b4a.objects.collections.List _playlists = null;
int _playablecount = 0;
 //BA.debugLineNum = 227;BA.debugLine="Private Sub ResolveSlotNeed(slot As Map, minReserv";
 //BA.debugLineNum = 228;BA.debugLine="If slot.IsInitialized = False Or slot.Size = 0 Th";
if (_slot.IsInitialized()==__c.False || _slot.getSize()==0) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 230;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = _getslotplaylists(_slot);
 //BA.debugLineNum = 231;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 233;BA.debugLine="Dim playableCount As Int = CountHotPlayableTracks";
_playablecount = _counthotplayabletracksinslot(_slot,_minreserve);
 //BA.debugLineNum = 234;BA.debugLine="Return Max(0, minReserve - playableCount)";
if (true) return (int) (__c.Max(0,_minreserve-_playablecount));
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return 0;
}
public String  _runpruneifneeded(String _initiator) throws Exception{
anywheresoftware.b4a.objects.collections.List _protectedtrackids = null;
anywheresoftware.b4a.objects.collections.List _relevanttrackids = null;
int _removedcount = 0;
 //BA.debugLineNum = 415;BA.debugLine="Private Sub RunPruneIfNeeded(initiator As String)";
 //BA.debugLineNum = 416;BA.debugLine="If DateTime.Now - lastPruneAt < pruneCooldownMs T";
if (__c.DateTime.getNow()-_lastpruneat<_prunecooldownms) { 
if (true) return "";};
 //BA.debugLineNum = 418;BA.debugLine="Dim protectedTrackIds As List = BuildProtectedTra";
_protectedtrackids = new anywheresoftware.b4a.objects.collections.List();
_protectedtrackids = _buildprotectedtrackids();
 //BA.debugLineNum = 419;BA.debugLine="Dim relevantTrackIds As List = BuildRelevantTrack";
_relevanttrackids = new anywheresoftware.b4a.objects.collections.List();
_relevanttrackids = _buildrelevanttrackids();
 //BA.debugLineNum = 421;BA.debugLine="Dim removedCount As Int = mediaCacheService.Prune";
_removedcount = _mediacacheservice._prunetrackcacheifneeded /*int*/ (_protectedtrackids,_relevanttrackids);
 //BA.debugLineNum = 422;BA.debugLine="lastPruneAt = DateTime.Now";
_lastpruneat = __c.DateTime.getNow();
 //BA.debugLineNum = 424;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
 //BA.debugLineNum = 425;BA.debugLine="Trace(\"autocache prune completed initiator=\" & i";
_trace("autocache prune completed initiator="+_initiator+" removed="+BA.NumberToString(_removedcount));
 }else {
 //BA.debugLineNum = 427;BA.debugLine="Trace(\"autocache prune completed initiator=\" & i";
_trace("autocache prune completed initiator="+_initiator+" removed=0");
 };
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _runstepasync() throws Exception{
ResumableSub_RunStepAsync rsub = new ResumableSub_RunStepAsync(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RunStepAsync extends BA.ResumableSub {
public ResumableSub_RunStepAsync(b4a.example.autonomouscachemanager parent) {
this.parent = parent;
}
b4a.example.autonomouscachemanager parent;
anywheresoftware.b4a.objects.collections.Map _summary = null;
anywheresoftware.b4a.objects.collections.Map _offlinedata = null;
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

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 115;BA.debugLine="Dim summary As Map";
_summary = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 116;BA.debugLine="summary.Initialize";
_summary.Initialize();
 //BA.debugLineNum = 117;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 28;
return;
case 28:
//C
this.state = 1;
;
 //BA.debugLineNum = 119;BA.debugLine="If kvs.IsInitialized = False Or offlineStoreServi";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._kvs.IsInitialized /*boolean*/ ()==parent.__c.False || parent._offlinestoreservice.IsInitialized /*boolean*/ ()==parent.__c.False || parent._dataresolverservice.IsInitialized /*boolean*/ ()==parent.__c.False || parent._mediacacheservice.IsInitialized /*boolean*/ ()==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 120;BA.debugLine="summary.Put(\"status\", \"not_initialized\")";
_summary.Put((Object)("status"),(Object)("not_initialized"));
 //BA.debugLineNum = 121;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;
;
 //BA.debugLineNum = 124;BA.debugLine="If IsFailureCooldownActive Then";

case 4:
//if
this.state = 7;
if (parent._isfailurecooldownactive()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 125;BA.debugLine="summary.Put(\"status\", \"failure_cooldown\")";
_summary.Put((Object)("status"),(Object)("failure_cooldown"));
 //BA.debugLineNum = 126;BA.debugLine="Trace(\"autocache step skipped reason=failure_coo";
parent._trace("autocache step skipped reason=failure_cooldown");
 //BA.debugLineNum = 127;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;
;
 //BA.debugLineNum = 130;BA.debugLine="If IsDownloadCooldownActive Then";

case 7:
//if
this.state = 10;
if (parent._isdownloadcooldownactive()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 131;BA.debugLine="summary.Put(\"status\", \"download_cooldown\")";
_summary.Put((Object)("status"),(Object)("download_cooldown"));
 //BA.debugLineNum = 132;BA.debugLine="Trace(\"autocache step skipped reason=download_co";
parent._trace("autocache step skipped reason=download_cooldown");
 //BA.debugLineNum = 133;BA.debugLine="RunPruneIfNeeded(\"cooldown\")";
parent._runpruneifneeded("cooldown");
 //BA.debugLineNum = 134;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 137;BA.debugLine="Dim offlineData As Map = offlineStoreService.Load";
_offlinedata = new anywheresoftware.b4a.objects.collections.Map();
_offlinedata = parent._offlinestoreservice._loadofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 138;BA.debugLine="If offlineData.IsInitialized = False Or offlineDa";
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
 //BA.debugLineNum = 139;BA.debugLine="summary.Put(\"status\", \"no_offline_data\")";
_summary.Put((Object)("status"),(Object)("no_offline_data"));
 //BA.debugLineNum = 140;BA.debugLine="Trace(\"autocache step skipped reason=no_offline_";
parent._trace("autocache step skipped reason=no_offline_data");
 //BA.debugLineNum = 141;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 144;BA.debugLine="mediaCacheService.EnsureTrackCacheReady";
parent._mediacacheservice._ensuretrackcacheready /*String*/ ();
 //BA.debugLineNum = 145;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
_nowticks = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 146;BA.debugLine="Dim currentSlot As Map = dataResolverService.Reso";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = parent._dataresolverservice._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (_offlinedata,_nowticks);
 //BA.debugLineNum = 147;BA.debugLine="Dim nextSlot As Map = dataResolverService.Resolve";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
_nextslot = parent._dataresolverservice._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (_offlinedata,_nowticks);
 //BA.debugLineNum = 148;BA.debugLine="TraceCacheHeatState(currentSlot, nextSlot)";
parent._tracecacheheatstate(_currentslot,_nextslot);
 //BA.debugLineNum = 150;BA.debugLine="Dim currentNeed As Int = ResolveSlotNeed(currentS";
_currentneed = parent._resolveslotneed(_currentslot,parent._currentslotminreserve);
 //BA.debugLineNum = 151;BA.debugLine="Dim nextNeed As Int = ResolveSlotNeed(nextSlot, n";
_nextneed = parent._resolveslotneed(_nextslot,parent._nextslotminreserve);
 //BA.debugLineNum = 153;BA.debugLine="Dim desiredTrackItems As List = BuildDesiredTrack";
_desiredtrackitems = new anywheresoftware.b4a.objects.collections.List();
_desiredtrackitems = parent._builddesiredtrackitemsforslots(_currentslot,_nextslot,_currentneed,_nextneed);
 //BA.debugLineNum = 155;BA.debugLine="summary.Put(\"current_need\", currentNeed)";
_summary.Put((Object)("current_need"),(Object)(_currentneed));
 //BA.debugLineNum = 156;BA.debugLine="summary.Put(\"next_need\", nextNeed)";
_summary.Put((Object)("next_need"),(Object)(_nextneed));
 //BA.debugLineNum = 157;BA.debugLine="summary.Put(\"candidate_count\", desiredTrackItems.";
_summary.Put((Object)("candidate_count"),(Object)(_desiredtrackitems.getSize()));
 //BA.debugLineNum = 159;BA.debugLine="If desiredTrackItems.Size = 0 Then";
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
 //BA.debugLineNum = 160;BA.debugLine="summary.Put(\"status\", \"nothing_to_download\")";
_summary.Put((Object)("status"),(Object)("nothing_to_download"));
 //BA.debugLineNum = 161;BA.debugLine="Trace(\"autocache step no work currentNeed=\" & cu";
parent._trace("autocache step no work currentNeed="+BA.NumberToString(_currentneed)+" nextNeed="+BA.NumberToString(_nextneed));
 //BA.debugLineNum = 162;BA.debugLine="RunPruneIfNeeded(\"idle\")";
parent._runpruneifneeded("idle");
 //BA.debugLineNum = 163;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 //BA.debugLineNum = 166;BA.debugLine="Dim actualMaxDownloads As Int = Min(maxDownloadsP";
_actualmaxdownloads = (int) (parent.__c.Min(parent._maxdownloadsperstep,_desiredtrackitems.getSize()));
 //BA.debugLineNum = 167;BA.debugLine="Trace(\"autocache step download start candidates=\"";
parent._trace("autocache step download start candidates="+BA.NumberToString(_desiredtrackitems.getSize())+" maxDownloads="+BA.NumberToString(_actualmaxdownloads));
 //BA.debugLineNum = 169;BA.debugLine="Wait For (mediaCacheService.EnsureTracksCached(de";
parent.__c.WaitFor("complete", ba, this, parent._mediacacheservice._ensuretrackscached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_desiredtrackitems,_actualmaxdownloads));
this.state = 29;
return;
case 29:
//C
this.state = 19;
_downloaded = (Boolean) result[0];
;
 //BA.debugLineNum = 171;BA.debugLine="If HasMediaCacheRecentFailure Then";
if (true) break;

case 19:
//if
this.state = 22;
if (parent._hasmediacacherecentfailure()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 172;BA.debugLine="lastFailureAt = DateTime.Now";
parent._lastfailureat = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 173;BA.debugLine="summary.Put(\"status\", \"network_failure\")";
_summary.Put((Object)("status"),(Object)("network_failure"));
 //BA.debugLineNum = 174;BA.debugLine="Trace(\"autocache step network failure\")";
parent._trace("autocache step network failure");
 //BA.debugLineNum = 175;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 if (true) break;
;
 //BA.debugLineNum = 178;BA.debugLine="If downloaded Then";

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
 //BA.debugLineNum = 179;BA.debugLine="lastSuccessfulDownloadAt = DateTime.Now";
parent._lastsuccessfuldownloadat = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 180;BA.debugLine="summary.Put(\"status\", \"downloaded\")";
_summary.Put((Object)("status"),(Object)("downloaded"));
 //BA.debugLineNum = 181;BA.debugLine="summary.Put(\"downloaded\", True)";
_summary.Put((Object)("downloaded"),(Object)(parent.__c.True));
 //BA.debugLineNum = 182;BA.debugLine="RequestPlaybackResumeIfNeeded";
parent._requestplaybackresumeifneeded();
 if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 184;BA.debugLine="summary.Put(\"status\", \"no_new_downloads\")";
_summary.Put((Object)("status"),(Object)("no_new_downloads"));
 //BA.debugLineNum = 185;BA.debugLine="summary.Put(\"downloaded\", False)";
_summary.Put((Object)("downloaded"),(Object)(parent.__c.False));
 if (true) break;

case 27:
//C
this.state = -1;
;
 //BA.debugLineNum = 188;BA.debugLine="RunPruneIfNeeded(\"post_download\")";
parent._runpruneifneeded("post_download");
 //BA.debugLineNum = 189;BA.debugLine="Return summary";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_summary));return;};
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _downloaded) throws Exception{
}
public void  _runstepasyncdeferred() throws Exception{
ResumableSub_RunStepAsyncDeferred rsub = new ResumableSub_RunStepAsyncDeferred(this);
rsub.resume(ba, null);
}
public static class ResumableSub_RunStepAsyncDeferred extends BA.ResumableSub {
public ResumableSub_RunStepAsyncDeferred(b4a.example.autonomouscachemanager parent) {
this.parent = parent;
}
b4a.example.autonomouscachemanager parent;
anywheresoftware.b4a.objects.collections.Map _summary = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 110;BA.debugLine="Wait For (RunStepAsync) Complete (summary As Map)";
parent.__c.WaitFor("complete", ba, this, parent._runstepasync());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_summary = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 111;BA.debugLine="stepInProgress = False";
parent._stepinprogress = parent.__c.False;
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setcooldowns(long _downloadcooldownvalue,long _failurecooldownvalue,long _prunecooldownvalue) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub SetCooldowns(downloadCooldownValue As L";
 //BA.debugLineNum = 79;BA.debugLine="If downloadCooldownValue >= 0 Then downloadCooldo";
if (_downloadcooldownvalue>=0) { 
_downloadcooldownms = _downloadcooldownvalue;};
 //BA.debugLineNum = 80;BA.debugLine="If failureCooldownValue >= 0 Then failureCooldown";
if (_failurecooldownvalue>=0) { 
_failurecooldownms = _failurecooldownvalue;};
 //BA.debugLineNum = 81;BA.debugLine="If pruneCooldownValue >= 0 Then pruneCooldownMs =";
if (_prunecooldownvalue>=0) { 
_prunecooldownms = _prunecooldownvalue;};
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _start() throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Public Sub Start";
 //BA.debugLineNum = 85;BA.debugLine="isRunning = True";
_isrunning = __c.True;
 //BA.debugLineNum = 86;BA.debugLine="workerTimer.Interval = tickIntervalMs";
_workertimer.setInterval((long) (_tickintervalms));
 //BA.debugLineNum = 87;BA.debugLine="workerTimer.Enabled = True";
_workertimer.setEnabled(__c.True);
 //BA.debugLineNum = 88;BA.debugLine="Trace(\"autocache manager started tickMs=\" & tickI";
_trace("autocache manager started tickMs="+BA.NumberToString(_tickintervalms));
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _stopmanager() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub StopManager";
 //BA.debugLineNum = 92;BA.debugLine="isRunning = False";
_isrunning = __c.False;
 //BA.debugLineNum = 93;BA.debugLine="workerTimer.Enabled = False";
_workertimer.setEnabled(__c.False);
 //BA.debugLineNum = 94;BA.debugLine="Trace(\"autocache manager stopped\")";
_trace("autocache manager stopped");
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public String  _trace(String _message) throws Exception{
 //BA.debugLineNum = 574;BA.debugLine="Private Sub Trace(message As String)";
 //BA.debugLineNum = 575;BA.debugLine="If traceTarget = Null Then";
if (_tracetarget== null) { 
 //BA.debugLineNum = 576;BA.debugLine="Log(message)";
__c.LogImpl("339714818",_message,0);
 //BA.debugLineNum = 577;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 580;BA.debugLine="If traceSubName = \"\" Then";
if ((_tracesubname).equals("")) { 
 //BA.debugLineNum = 581;BA.debugLine="Log(message)";
__c.LogImpl("339714823",_message,0);
 //BA.debugLineNum = 582;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 585;BA.debugLine="Try";
try { //BA.debugLineNum = 586;BA.debugLine="CallSub2(traceTarget, traceSubName, message)";
__c.CallSubNew2(ba,_tracetarget,_tracesubname,(Object)(_message));
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 588;BA.debugLine="Log(message)";
__c.LogImpl("339714830",_message,0);
 };
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return "";
}
public String  _tracecacheheatstate(anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _nextslot) throws Exception{
anywheresoftware.b4a.objects.collections.Map _currentheat = null;
anywheresoftware.b4a.objects.collections.Map _nextheat = null;
 //BA.debugLineNum = 192;BA.debugLine="Private Sub TraceCacheHeatState(currentSlot As Map";
 //BA.debugLineNum = 193;BA.debugLine="Dim currentHeat As Map = CountSlotCacheHeat(curre";
_currentheat = new anywheresoftware.b4a.objects.collections.Map();
_currentheat = _countslotcacheheat(_currentslot);
 //BA.debugLineNum = 194;BA.debugLine="Dim nextHeat As Map = CountSlotCacheHeat(nextSlot";
_nextheat = new anywheresoftware.b4a.objects.collections.Map();
_nextheat = _countslotcacheheat(_nextslot);
 //BA.debugLineNum = 195;BA.debugLine="Trace(\"Кэш: горячий \" & currentHeat.GetDefault(\"h";
_trace("Кэш: горячий "+BA.ObjectToString(_currentheat.GetDefault((Object)("hot"),(Object)(0)))+", холодный "+BA.ObjectToString(_currentheat.GetDefault((Object)("cold"),(Object)(0)))+"; следующий горячий "+BA.ObjectToString(_nextheat.GetDefault((Object)("hot"),(Object)(0)))+", холодный "+BA.ObjectToString(_nextheat.GetDefault((Object)("cold"),(Object)(0))));
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _workertimer_tick() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Private Sub workerTimer_Tick";
 //BA.debugLineNum = 102;BA.debugLine="If isRunning = False Then Return";
if (_isrunning==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 103;BA.debugLine="If stepInProgress Then Return";
if (_stepinprogress) { 
if (true) return "";};
 //BA.debugLineNum = 105;BA.debugLine="stepInProgress = True";
_stepinprogress = __c.True;
 //BA.debugLineNum = 106;BA.debugLine="CallSubDelayed(Me, \"RunStepAsyncDeferred\")";
__c.CallSubDelayed(ba,this,"RunStepAsyncDeferred");
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
