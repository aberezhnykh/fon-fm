package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dataplaybackresolver extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.dataplaybackresolver");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.dataplaybackresolver.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public long _slot_switch_lead_ms = 0L;
public String _storagedir = "";
public Object _targetmodule = null;
public String _tracesubname = "";
public anywheresoftware.b4a.objects.collections.Map _playlistcursors = null;
public b4a.example.keyvaluestore _storageref = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _builddataslotkey(anywheresoftware.b4a.objects.collections.Map _currentslot) throws Exception{
 //BA.debugLineNum = 655;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
 //BA.debugLineNum = 656;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
if (true) return BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
 //BA.debugLineNum = 657;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _buildmatchedslotsfordate(anywheresoftware.b4a.objects.collections.List _schedules,String _targetdatekey,String _targetweekday) throws Exception{
anywheresoftware.b4a.objects.collections.List _matchedslots = null;
Object _scheduleobject = null;
anywheresoftware.b4a.objects.collections.Map _schedule = null;
String _scheduletitle = "";
anywheresoftware.b4a.objects.collections.List _slots = null;
Object _slotobject = null;
anywheresoftware.b4a.objects.collections.Map _slot = null;
String _slottime = "";
int _slotminutes = 0;
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
 //BA.debugLineNum = 94;BA.debugLine="Private Sub BuildMatchedSlotsForDate(schedules As";
 //BA.debugLineNum = 95;BA.debugLine="Dim matchedSlots As List";
_matchedslots = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 96;BA.debugLine="matchedSlots.Initialize";
_matchedslots.Initialize();
 //BA.debugLineNum = 97;BA.debugLine="If schedules.IsInitialized = False Then Return ma";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return _matchedslots;};
 //BA.debugLineNum = 98;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group4 = _schedules;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_scheduleobject = group4.Get(index4);
 //BA.debugLineNum = 99;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
 //BA.debugLineNum = 100;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
 //BA.debugLineNum = 101;BA.debugLine="If ScheduleAppliesOnDate(schedule, targetDateKe";
if (_scheduleappliesondate(_schedule,_targetdatekey,_targetweekday)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 102;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 103;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
 //BA.debugLineNum = 104;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 105;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group11 = _slots;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_slotobject = group11.Get(index11);
 //BA.debugLineNum = 106;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
 //BA.debugLineNum = 107;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
 //BA.debugLineNum = 108;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
 //BA.debugLineNum = 109;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes(";
_slotminutes = _timestringtominutes(_slottime);
 //BA.debugLineNum = 110;BA.debugLine="If slotMinutes < 0 Then Continue";
if (_slotminutes<0) { 
if (true) continue;};
 //BA.debugLineNum = 111;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = _extractslotstreamdata(_slot);
 //BA.debugLineNum = 112;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 113;BA.debugLine="entry.Initialize";
_entry.Initialize();
 //BA.debugLineNum = 114;BA.debugLine="entry.Put(\"schedule_title\", scheduleTitle)";
_entry.Put((Object)("schedule_title"),(Object)(_scheduletitle));
 //BA.debugLineNum = 115;BA.debugLine="entry.Put(\"slot_time\", slotTime)";
_entry.Put((Object)("slot_time"),(Object)(_slottime));
 //BA.debugLineNum = 116;BA.debugLine="entry.Put(\"slot_minutes\", slotMinutes)";
_entry.Put((Object)("slot_minutes"),(Object)(_slotminutes));
 //BA.debugLineNum = 117;BA.debugLine="entry.Put(\"stream_id\", streamData.GetDefault(";
_entry.Put((Object)("stream_id"),_streamdata.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 118;BA.debugLine="entry.Put(\"stream_title\", streamData.GetDefau";
_entry.Put((Object)("stream_title"),_streamdata.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 119;BA.debugLine="entry.Put(\"playlists\", streamData.GetDefault(";
_entry.Put((Object)("playlists"),_streamdata.GetDefault((Object)("playlists"),(Object)(_createinitializedlist().getObject())));
 //BA.debugLineNum = 120;BA.debugLine="matchedSlots.Add(entry)";
_matchedslots.Add((Object)(_entry.getObject()));
 };
 }
};
 };
 }
};
 //BA.debugLineNum = 125;BA.debugLine="Return matchedSlots";
if (true) return _matchedslots;
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _buildplaylistplaybackmanifest(anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
anywheresoftware.b4a.objects.collections.Map _manifest = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.List _tracks = null;
anywheresoftware.b4a.objects.collections.Map _trackentries = null;
anywheresoftware.b4a.objects.collections.List _order = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
 //BA.debugLineNum = 414;BA.debugLine="Private Sub BuildPlaylistPlaybackManifest(playlist";
 //BA.debugLineNum = 415;BA.debugLine="Dim manifest As Map";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 416;BA.debugLine="manifest.Initialize";
_manifest.Initialize();
 //BA.debugLineNum = 417;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return _manifest;};
 //BA.debugLineNum = 418;BA.debugLine="Dim playlistId As String = playlistData.GetDefaul";
_playlistid = BA.ObjectToString(_playlistdata.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 419;BA.debugLine="If playlistId = \"\" Then Return manifest";
if ((_playlistid).equals("")) { 
if (true) return _manifest;};
 //BA.debugLineNum = 420;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
 //BA.debugLineNum = 421;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
if (true) return _manifest;};
 //BA.debugLineNum = 422;BA.debugLine="Dim trackEntries As Map";
_trackentries = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 423;BA.debugLine="trackEntries.Initialize";
_trackentries.Initialize();
 //BA.debugLineNum = 424;BA.debugLine="Dim order As List";
_order = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 425;BA.debugLine="order.Initialize";
_order.Initialize();
 //BA.debugLineNum = 426;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group12 = _tracks;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_trackobject = group12.Get(index12);
 //BA.debugLineNum = 427;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 428;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
 //BA.debugLineNum = 429;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 430;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 431;BA.debugLine="If trackEntries.ContainsKey(trackId) Then Contin";
if (_trackentries.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
 //BA.debugLineNum = 432;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 433;BA.debugLine="entry.Initialize";
_entry.Initialize();
 //BA.debugLineNum = 434;BA.debugLine="entry.Put(\"type\", \"track\")";
_entry.Put((Object)("type"),(Object)("track"));
 //BA.debugLineNum = 435;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
 //BA.debugLineNum = 436;BA.debugLine="entry.Put(\"code\", track.GetDefault(\"code\", \"\"))";
_entry.Put((Object)("code"),_track.GetDefault((Object)("code"),(Object)("")));
 //BA.debugLineNum = 437;BA.debugLine="entry.Put(\"set\", track.GetDefault(\"set\", \"\"))";
_entry.Put((Object)("set"),_track.GetDefault((Object)("set"),(Object)("")));
 //BA.debugLineNum = 438;BA.debugLine="entry.Put(\"duration\", track.GetDefault(\"duration";
_entry.Put((Object)("duration"),_track.GetDefault((Object)("duration"),(Object)(0)));
 //BA.debugLineNum = 439;BA.debugLine="entry.Put(\"gain\", track.GetDefault(\"gain\", -3))";
_entry.Put((Object)("gain"),_track.GetDefault((Object)("gain"),(Object)(-3)));
 //BA.debugLineNum = 440;BA.debugLine="entry.Put(\"title\", track.GetDefault(\"title\", \"\")";
_entry.Put((Object)("title"),_track.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 441;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));
 //BA.debugLineNum = 442;BA.debugLine="trackEntries.Put(trackId, entry)";
_trackentries.Put((Object)(_trackid),(Object)(_entry.getObject()));
 //BA.debugLineNum = 443;BA.debugLine="order.Add(trackId)";
_order.Add((Object)(_trackid));
 }
};
 //BA.debugLineNum = 445;BA.debugLine="If order.Size = 0 Then Return manifest";
if (_order.getSize()==0) { 
if (true) return _manifest;};
 //BA.debugLineNum = 446;BA.debugLine="ShuffleListInPlace(order)";
_shufflelistinplace(_order);
 //BA.debugLineNum = 447;BA.debugLine="manifest.Put(\"version\", PlaylistPlaybackManifestV";
_manifest.Put((Object)("version"),(Object)(_playlistplaybackmanifestversion(_playlistdata)));
 //BA.debugLineNum = 448;BA.debugLine="manifest.Put(\"playlist_id\", playlistId)";
_manifest.Put((Object)("playlist_id"),(Object)(_playlistid));
 //BA.debugLineNum = 449;BA.debugLine="manifest.Put(\"title\", playlistData.GetDefault(\"ti";
_manifest.Put((Object)("title"),_playlistdata.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 450;BA.debugLine="manifest.Put(\"updated\", playlistData.GetDefault(\"";
_manifest.Put((Object)("updated"),_playlistdata.GetDefault((Object)("updated"),(Object)("")));
 //BA.debugLineNum = 451;BA.debugLine="manifest.Put(\"track_count\", order.Size)";
_manifest.Put((Object)("track_count"),(Object)(_order.getSize()));
 //BA.debugLineNum = 452;BA.debugLine="manifest.Put(\"order\", order)";
_manifest.Put((Object)("order"),(Object)(_order.getObject()));
 //BA.debugLineNum = 453;BA.debugLine="manifest.Put(\"tracks\", trackEntries)";
_manifest.Put((Object)("tracks"),(Object)(_trackentries.getObject()));
 //BA.debugLineNum = 454;BA.debugLine="Return manifest";
if (true) return _manifest;
 //BA.debugLineNum = 455;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _buildslotfallbackresult(anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _cachedtrack,boolean _ispreferredplaylist) throws Exception{
anywheresoftware.b4a.objects.collections.Map _result = null;
 //BA.debugLineNum = 531;BA.debugLine="Private Sub BuildSlotFallbackResult(descriptor As";
 //BA.debugLineNum = 532;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 533;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 534;BA.debugLine="result.Put(\"playlist\", descriptor)";
_result.Put((Object)("playlist"),(Object)(_descriptor.getObject()));
 //BA.debugLineNum = 535;BA.debugLine="result.Put(\"track\", cachedTrack)";
_result.Put((Object)("track"),(Object)(_cachedtrack.getObject()));
 //BA.debugLineNum = 536;BA.debugLine="If isPreferredPlaylist Then";
if (_ispreferredplaylist) { 
 //BA.debugLineNum = 537;BA.debugLine="result.Put(\"source\", \"fallback_same_playlist\")";
_result.Put((Object)("source"),(Object)("fallback_same_playlist"));
 }else {
 //BA.debugLineNum = 539;BA.debugLine="result.Put(\"source\", \"fallback_other_playlist\")";
_result.Put((Object)("source"),(Object)("fallback_other_playlist"));
 };
 //BA.debugLineNum = 541;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 542;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _choosecachedtrackfromslot(anywheresoftware.b4a.objects.collections.Map _currentslot,String _preferredplaylistid,b4a.example.mediacache _mediacacheservice) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptyresult = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
anywheresoftware.b4a.objects.collections.Map _preferreddescriptor = null;
anywheresoftware.b4a.objects.collections.List _fallbackdescriptors = null;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.List _ordereddescriptors = null;
Object _descriptorobject = null;
anywheresoftware.b4a.objects.collections.Map _selectedresult = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
anywheresoftware.b4a.objects.collections.Map _cachedtrack = null;
 //BA.debugLineNum = 488;BA.debugLine="Public Sub ChooseCachedTrackFromSlot(currentSlot A";
 //BA.debugLineNum = 489;BA.debugLine="Dim emptyResult As Map";
_emptyresult = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 490;BA.debugLine="emptyResult.Initialize";
_emptyresult.Initialize();
 //BA.debugLineNum = 491;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
if (true) return _emptyresult;};
 //BA.debugLineNum = 492;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
 //BA.debugLineNum = 493;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return _emptyresult;};
 //BA.debugLineNum = 494;BA.debugLine="Dim preferredDescriptor As Map";
_preferreddescriptor = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 495;BA.debugLine="preferredDescriptor.Initialize";
_preferreddescriptor.Initialize();
 //BA.debugLineNum = 496;BA.debugLine="Dim fallbackDescriptors As List";
_fallbackdescriptors = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 497;BA.debugLine="fallbackDescriptors.Initialize";
_fallbackdescriptors.Initialize();
 //BA.debugLineNum = 498;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group10 = _playlists;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_playlistobject = group10.Get(index10);
 //BA.debugLineNum = 499;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 500;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
 //BA.debugLineNum = 501;BA.debugLine="Dim playlistId As String = playlistDescriptor.Ge";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 502;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 503;BA.debugLine="If playlistId = preferredPlaylistId Then";
if ((_playlistid).equals(_preferredplaylistid)) { 
 //BA.debugLineNum = 504;BA.debugLine="preferredDescriptor = CloneMap(playlistDescript";
_preferreddescriptor = _clonemap(_playlistdescriptor);
 }else {
 //BA.debugLineNum = 506;BA.debugLine="fallbackDescriptors.Add(CloneMap(playlistDescri";
_fallbackdescriptors.Add((Object)(_clonemap(_playlistdescriptor).getObject()));
 };
 }
};
 //BA.debugLineNum = 509;BA.debugLine="Dim orderedDescriptors As List";
_ordereddescriptors = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 510;BA.debugLine="orderedDescriptors.Initialize";
_ordereddescriptors.Initialize();
 //BA.debugLineNum = 511;BA.debugLine="If preferredDescriptor.IsInitialized And preferre";
if (_preferreddescriptor.IsInitialized() && _preferreddescriptor.getSize()>0) { 
_ordereddescriptors.Add((Object)(_preferreddescriptor.getObject()));};
 //BA.debugLineNum = 512;BA.debugLine="For Each descriptorObject As Object In fallbackDe";
{
final anywheresoftware.b4a.BA.IterableList group24 = _fallbackdescriptors;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_descriptorobject = group24.Get(index24);
 //BA.debugLineNum = 513;BA.debugLine="orderedDescriptors.Add(descriptorObject)";
_ordereddescriptors.Add(_descriptorobject);
 }
};
 //BA.debugLineNum = 515;BA.debugLine="Dim selectedResult As Map";
_selectedresult = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 516;BA.debugLine="selectedResult.Initialize";
_selectedresult.Initialize();
 //BA.debugLineNum = 517;BA.debugLine="For Each descriptorObject As Object In orderedDes";
{
final anywheresoftware.b4a.BA.IterableList group29 = _ordereddescriptors;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_descriptorobject = group29.Get(index29);
 //BA.debugLineNum = 518;BA.debugLine="If (descriptorObject Is Map) = False Then Contin";
if ((_descriptorobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 519;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
 //BA.debugLineNum = 520;BA.debugLine="Dim playlistId As String = descriptor.GetDefault";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 521;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 522;BA.debugLine="Dim cachedTrack As Map = ResolveOrderedCachedTra";
_cachedtrack = new anywheresoftware.b4a.objects.collections.Map();
_cachedtrack = _resolveorderedcachedtrackfromplaylistbyid(_playlistid,_mediacacheservice);
 //BA.debugLineNum = 523;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedTr";
if (_cachedtrack.IsInitialized()==__c.False || _cachedtrack.getSize()==0) { 
if (true) continue;};
 //BA.debugLineNum = 524;BA.debugLine="selectedResult = BuildSlotFallbackResult(descrip";
_selectedresult = _buildslotfallbackresult(_descriptor,_cachedtrack,(_playlistid).equals(_preferredplaylistid));
 //BA.debugLineNum = 525;BA.debugLine="Exit";
if (true) break;
 }
};
 //BA.debugLineNum = 527;BA.debugLine="If selectedResult.IsInitialized And selectedResul";
if (_selectedresult.IsInitialized() && _selectedresult.getSize()>0) { 
if (true) return _selectedresult;};
 //BA.debugLineNum = 528;BA.debugLine="Return emptyResult";
if (true) return _emptyresult;
 //BA.debugLineNum = 529;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _choosenextplaylistdescriptor(anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _workingcursors) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptydescriptor = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
String _slotkey = "";
int _cursorvalue = 0;
int _playlistindexforslot = 0;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistsource = null;
anywheresoftware.b4a.objects.collections.Map _playlist = null;
 //BA.debugLineNum = 181;BA.debugLine="Public Sub ChooseNextPlaylistDescriptor(currentSlo";
 //BA.debugLineNum = 182;BA.debugLine="Dim emptyDescriptor As Map";
_emptydescriptor = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 183;BA.debugLine="emptyDescriptor.Initialize";
_emptydescriptor.Initialize();
 //BA.debugLineNum = 184;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
 //BA.debugLineNum = 185;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return _emptydescriptor;};
 //BA.debugLineNum = 186;BA.debugLine="Dim slotKey As String = BuildDataSlotKey(currentS";
_slotkey = _builddataslotkey(_currentslot);
 //BA.debugLineNum = 187;BA.debugLine="Dim cursorValue As Int = workingCursors.GetDefaul";
_cursorvalue = (int)(BA.ObjectToNumber(_workingcursors.GetDefault((Object)(_slotkey),_playlistcursors.GetDefault((Object)(_slotkey),(Object)(0)))));
 //BA.debugLineNum = 188;BA.debugLine="If cursorValue < 0 Then cursorValue = 0";
if (_cursorvalue<0) { 
_cursorvalue = (int) (0);};
 //BA.debugLineNum = 189;BA.debugLine="Dim playlistIndexForSlot As Int = cursorValue Mod";
_playlistindexforslot = (int) (_cursorvalue%_playlists.getSize());
 //BA.debugLineNum = 190;BA.debugLine="workingCursors.Put(slotKey, playlistIndexForSlot";
_workingcursors.Put((Object)(_slotkey),(Object)(_playlistindexforslot+1));
 //BA.debugLineNum = 191;BA.debugLine="Dim playlistObject As Object = playlists.Get(play";
_playlistobject = _playlists.Get(_playlistindexforslot);
 //BA.debugLineNum = 192;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
 //BA.debugLineNum = 193;BA.debugLine="Dim playlistSource As Map = playlistObject";
_playlistsource = new anywheresoftware.b4a.objects.collections.Map();
_playlistsource = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
 //BA.debugLineNum = 194;BA.debugLine="Dim playlist As Map = CloneMap(playlistSource)";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = _clonemap(_playlistsource);
 //BA.debugLineNum = 195;BA.debugLine="playlist.Put(\"_slot_key\", slotKey)";
_playlist.Put((Object)("_slot_key"),(Object)(_slotkey));
 //BA.debugLineNum = 196;BA.debugLine="playlist.Put(\"_playlist_index\", playlistIndexFor";
_playlist.Put((Object)("_playlist_index"),(Object)(_playlistindexforslot));
 //BA.debugLineNum = 197;BA.debugLine="Return playlist";
if (true) return _playlist;
 };
 //BA.debugLineNum = 199;BA.debugLine="Return emptyDescriptor";
if (true) return _emptydescriptor;
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private Const SLOT_SWITCH_LEAD_MS As Long = 10000";
_slot_switch_lead_ms = (long) (10000);
 //BA.debugLineNum = 7;BA.debugLine="Private storageDir As String";
_storagedir = "";
 //BA.debugLineNum = 8;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
 //BA.debugLineNum = 10;BA.debugLine="Private playlistCursors As Map";
_playlistcursors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Private storageRef As KeyValueStore";
_storageref = new b4a.example.keyvaluestore();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
anywheresoftware.b4a.objects.collections.Map _copy = null;
Object _key = null;
 //BA.debugLineNum = 730;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
 //BA.debugLineNum = 731;BA.debugLine="Dim copy As Map";
_copy = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 732;BA.debugLine="copy.Initialize";
_copy.Initialize();
 //BA.debugLineNum = 733;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
 //BA.debugLineNum = 734;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
 //BA.debugLineNum = 735;BA.debugLine="copy.Put(key, source.Get(key))";
_copy.Put(_key,_source.Get(_key));
 }
};
 //BA.debugLineNum = 737;BA.debugLine="Return copy";
if (true) return _copy;
 //BA.debugLineNum = 738;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _cloneplaylistcursors() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub ClonePlaylistCursors As Map";
 //BA.debugLineNum = 34;BA.debugLine="Return CloneMap(playlistCursors)";
if (true) return _clonemap(_playlistcursors);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public String  _commitplaylistcursor(b4a.example.keyvaluestore _storage,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _slotkey = "";
String _playlistid = "";
int _playlisttrackindex = 0;
int _storedcursor = 0;
int _playlistindex = 0;
 //BA.debugLineNum = 566;BA.debugLine="Public Sub CommitPlaylistCursor(storage As KeyValu";
 //BA.debugLineNum = 567;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 568;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return "";};
 //BA.debugLineNum = 569;BA.debugLine="Dim slotKey As String = item.GetDefault(\"slot_key";
_slotkey = BA.ObjectToString(_item.GetDefault((Object)("slot_key"),(Object)("")));
 //BA.debugLineNum = 570;BA.debugLine="Dim playlistId As String = item.GetDefault(\"playl";
_playlistid = BA.ObjectToString(_item.GetDefault((Object)("playlist_id"),(Object)("")));
 //BA.debugLineNum = 571;BA.debugLine="Dim playlistTrackIndex As Int = item.GetDefault(\"";
_playlisttrackindex = (int)(BA.ObjectToNumber(_item.GetDefault((Object)("playlist_track_index"),(Object)(-1))));
 //BA.debugLineNum = 572;BA.debugLine="If playlistId <> \"\" And playlistTrackIndex >= 0 T";
if ((_playlistid).equals("") == false && _playlisttrackindex>=0) { 
 //BA.debugLineNum = 573;BA.debugLine="Dim storedCursor As Int = item.GetDefault(\"playl";
_storedcursor = (int)(BA.ObjectToNumber(_item.GetDefault((Object)("playlist_cursor"),(Object)(_playlisttrackindex+1))));
 //BA.debugLineNum = 574;BA.debugLine="storage.Put(PlaylistTrackIndexKey(playlistId), p";
_storage._put /*String*/ (_playlisttrackindexkey(_playlistid),(Object)(_playlisttrackindex));
 //BA.debugLineNum = 575;BA.debugLine="storage.Put(PlaylistPlaybackCursorKey(playlistId";
_storage._put /*String*/ (_playlistplaybackcursorkey(_playlistid),(Object)(_storedcursor));
 //BA.debugLineNum = 576;BA.debugLine="Trace(\"playlist commit track playlistId=\" & play";
_trace("playlist commit track playlistId="+_playlistid+" trackIndex="+BA.NumberToString(_playlisttrackindex)+" cursor="+BA.NumberToString(_storedcursor)+" trackId="+BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))));
 };
 //BA.debugLineNum = 578;BA.debugLine="If slotKey = \"\" Then Return";
if ((_slotkey).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 579;BA.debugLine="Dim playlistIndex As Int = item.GetDefault(\"playl";
_playlistindex = (int)(BA.ObjectToNumber(_item.GetDefault((Object)("playlist_index"),(Object)(-1))));
 //BA.debugLineNum = 580;BA.debugLine="If playlistIndex < 0 Then Return";
if (_playlistindex<0) { 
if (true) return "";};
 //BA.debugLineNum = 581;BA.debugLine="playlistCursors.Put(slotKey, playlistIndex + 1)";
_playlistcursors.Put((Object)(_slotkey),(Object)(_playlistindex+1));
 //BA.debugLineNum = 582;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
_storage._put /*String*/ ("data_slot_playlist_cursors",(Object)(_playlistcursors.getObject()));
 //BA.debugLineNum = 583;BA.debugLine="Trace(\"playlist commit slot slotKey=\" & slotKey &";
_trace("playlist commit slot slotKey="+_slotkey+" playlistIndex="+BA.NumberToString(_playlistindex)+" nextPlaylistCursor="+BA.NumberToString((_playlistindex+1)));
 //BA.debugLineNum = 584;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist() throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
 //BA.debugLineNum = 740;BA.debugLine="Private Sub CreateInitializedList As List";
 //BA.debugLineNum = 741;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 742;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 743;BA.debugLine="Return items";
if (true) return _items;
 //BA.debugLineNum = 744;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 724;BA.debugLine="Private Sub CreateInitializedMap As Map";
 //BA.debugLineNum = 725;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 726;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 727;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 728;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createqueuetrackfromplaylist(anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _playlistdescriptor,anywheresoftware.b4a.objects.collections.Map _track,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
 //BA.debugLineNum = 545;BA.debugLine="Public Sub CreateQueueTrackFromPlaylist(currentSlo";
 //BA.debugLineNum = 546;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 547;BA.debugLine="item.Initialize";
_item.Initialize();
 //BA.debugLineNum = 548;BA.debugLine="item.Put(\"type\", \"track\")";
_item.Put((Object)("type"),(Object)("track"));
 //BA.debugLineNum = 549;BA.debugLine="item.Put(\"id\", track.GetDefault(\"id\", \"\"))";
_item.Put((Object)("id"),_track.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 550;BA.debugLine="item.Put(\"code\", track.GetDefault(\"code\", \"\"))";
_item.Put((Object)("code"),_track.GetDefault((Object)("code"),(Object)("")));
 //BA.debugLineNum = 551;BA.debugLine="item.Put(\"set\", track.GetDefault(\"set\", \"\"))";
_item.Put((Object)("set"),_track.GetDefault((Object)("set"),(Object)("")));
 //BA.debugLineNum = 552;BA.debugLine="item.Put(\"duration\", track.GetDefault(\"duration\",";
_item.Put((Object)("duration"),_track.GetDefault((Object)("duration"),(Object)(0)));
 //BA.debugLineNum = 553;BA.debugLine="item.Put(\"gain\", track.GetDefault(\"gain\", -3))";
_item.Put((Object)("gain"),_track.GetDefault((Object)("gain"),(Object)(-3)));
 //BA.debugLineNum = 554;BA.debugLine="item.Put(\"stream\", ResolvePlaybackStreamTitle(cur";
_item.Put((Object)("stream"),(Object)(_resolveplaybackstreamtitle(_currentslot,_playlistdescriptor,_offlinedata)));
 //BA.debugLineNum = 555;BA.debugLine="item.Put(\"playlist_id\", playlistDescriptor.GetDef";
_item.Put((Object)("playlist_id"),_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 556;BA.debugLine="item.Put(\"playlist_title\", playlistDescriptor.Get";
_item.Put((Object)("playlist_title"),_playlistdescriptor.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 557;BA.debugLine="item.Put(\"slot_key\", playlistDescriptor.GetDefaul";
_item.Put((Object)("slot_key"),_playlistdescriptor.GetDefault((Object)("_slot_key"),(Object)(_builddataslotkey(_currentslot))));
 //BA.debugLineNum = 558;BA.debugLine="item.Put(\"playlist_index\", playlistDescriptor.Get";
_item.Put((Object)("playlist_index"),_playlistdescriptor.GetDefault((Object)("_playlist_index"),(Object)(0)));
 //BA.debugLineNum = 559;BA.debugLine="item.Put(\"playlist_track_index\", track.GetDefault";
_item.Put((Object)("playlist_track_index"),_track.GetDefault((Object)("playlist_track_index"),(Object)(-1)));
 //BA.debugLineNum = 560;BA.debugLine="item.Put(\"playlist_cursor\", track.GetDefault(\"pla";
_item.Put((Object)("playlist_cursor"),_track.GetDefault((Object)("playlist_cursor"),(Object)(-1)));
 //BA.debugLineNum = 561;BA.debugLine="item.Put(\"schedule_title\", currentSlot.GetDefault";
_item.Put((Object)("schedule_title"),_currentslot.GetDefault((Object)("schedule_title"),(Object)("")));
 //BA.debugLineNum = 562;BA.debugLine="item.Put(\"slot_time\", currentSlot.GetDefault(\"slo";
_item.Put((Object)("slot_time"),_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
 //BA.debugLineNum = 563;BA.debugLine="Return item";
if (true) return _item;
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return null;
}
public int  _cursorcount() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub CursorCount As Int";
 //BA.debugLineNum = 29;BA.debugLine="If playlistCursors.IsInitialized = False Then Ret";
if (_playlistcursors.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 30;BA.debugLine="Return playlistCursors.Size";
if (true) return _playlistcursors.getSize();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _extractslotstreamdata(anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
Object _streamobject = null;
 //BA.debugLineNum = 630;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
 //BA.debugLineNum = 631;BA.debugLine="Dim streamData As Map";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 632;BA.debugLine="streamData.Initialize";
_streamdata.Initialize();
 //BA.debugLineNum = 633;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
if (_slot.IsInitialized()==__c.False) { 
if (true) return _streamdata;};
 //BA.debugLineNum = 634;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
_streamobject = _slot.Get((Object)("stream"));
 //BA.debugLineNum = 635;BA.debugLine="If streamObject Is Map Then";
if (_streamobject instanceof java.util.Map) { 
 //BA.debugLineNum = 636;BA.debugLine="streamData = streamObject";
_streamdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_streamobject));
 //BA.debugLineNum = 637;BA.debugLine="Return streamData";
if (true) return _streamdata;
 };
 //BA.debugLineNum = 639;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
if (_streamobject!= null) { 
_streamdata.Put((Object)("id"),(Object)(""+BA.ObjectToString(_streamobject)));};
 //BA.debugLineNum = 640;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
if (_slot.ContainsKey((Object)("playlists"))) { 
_streamdata.Put((Object)("playlists"),_slot.Get((Object)("playlists")));};
 //BA.debugLineNum = 641;BA.debugLine="Return streamData";
if (true) return _streamdata;
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return null;
}
public String  _formatisodate(long _ticks) throws Exception{
String _previousdateformat = "";
String _value = "";
 //BA.debugLineNum = 667;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
 //BA.debugLineNum = 668;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
 //BA.debugLineNum = 669;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 670;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
 //BA.debugLineNum = 671;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
 //BA.debugLineNum = 672;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 673;BA.debugLine="End Sub";
return "";
}
public String  _getofflineplaylistsdir() throws Exception{
 //BA.debugLineNum = 659;BA.debugLine="Private Sub GetOfflinePlaylistsDir As String";
 //BA.debugLineNum = 660;BA.debugLine="Return File.Combine(storageDir, \"playlists\")";
if (true) return __c.File.Combine(_storagedir,"playlists");
 //BA.debugLineNum = 661;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getplaylistcacheheatcountsbyid(String _playlistid,b4a.example.mediacache _mediacacheservice) throws Exception{
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.Map _manifest = null;
anywheresoftware.b4a.objects.collections.List _order = null;
anywheresoftware.b4a.objects.collections.Map _trackmap = null;
String _cursorkey = "";
int _storedcursor = 0;
String _trackindexkey = "";
int _storedtrackindexvalue = 0;
int _storedtrackindex = 0;
int _hotcount = 0;
int _coldcount = 0;
int _orderindex = 0;
String _trackid = "";
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
 //BA.debugLineNum = 345;BA.debugLine="Public Sub GetPlaylistCacheHeatCountsById(playlist";
 //BA.debugLineNum = 346;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 347;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 348;BA.debugLine="result.Put(\"hot\", 0)";
_result.Put((Object)("hot"),(Object)(0));
 //BA.debugLineNum = 349;BA.debugLine="result.Put(\"cold\", 0)";
_result.Put((Object)("cold"),(Object)(0));
 //BA.debugLineNum = 350;BA.debugLine="result.Put(\"total\", 0)";
_result.Put((Object)("total"),(Object)(0));
 //BA.debugLineNum = 351;BA.debugLine="If storageRef.IsInitialized = False Then Return r";
if (_storageref.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return _result;};
 //BA.debugLineNum = 352;BA.debugLine="If playlistId = \"\" Then Return result";
if ((_playlistid).equals("")) { 
if (true) return _result;};
 //BA.debugLineNum = 353;BA.debugLine="Dim manifest As Map = LoadOrBuildPlaylistPlayback";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = _loadorbuildplaylistplaybackmanifestbyid(_playlistid);
 //BA.debugLineNum = 354;BA.debugLine="If manifest.IsInitialized = False Or manifest.Siz";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) return _result;};
 //BA.debugLineNum = 355;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
_order = new anywheresoftware.b4a.objects.collections.List();
_order = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_manifest.GetDefault((Object)("order"),__c.Null)));
 //BA.debugLineNum = 356;BA.debugLine="If order.IsInitialized = False Or order.Size = 0";
if (_order.IsInitialized()==__c.False || _order.getSize()==0) { 
if (true) return _result;};
 //BA.debugLineNum = 357;BA.debugLine="Dim trackMap As Map = manifest.GetDefault(\"tracks";
_trackmap = new anywheresoftware.b4a.objects.collections.Map();
_trackmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_manifest.GetDefault((Object)("tracks"),__c.Null)));
 //BA.debugLineNum = 358;BA.debugLine="If trackMap.IsInitialized = False Or trackMap.Siz";
if (_trackmap.IsInitialized()==__c.False || _trackmap.getSize()==0) { 
if (true) return _result;};
 //BA.debugLineNum = 360;BA.debugLine="Dim cursorKey As String = PlaylistPlaybackCursorK";
_cursorkey = _playlistplaybackcursorkey(_playlistid);
 //BA.debugLineNum = 361;BA.debugLine="Dim storedCursor As Int = storageRef.GetDefault(c";
_storedcursor = (int)(BA.ObjectToNumber(_storageref._getdefault /*Object*/ (_cursorkey,(Object)(-1))));
 //BA.debugLineNum = 362;BA.debugLine="Dim trackIndexKey As String = PlaylistTrackIndexK";
_trackindexkey = _playlisttrackindexkey(_playlistid);
 //BA.debugLineNum = 363;BA.debugLine="Dim storedTrackIndexValue As Int = storageRef.Get";
_storedtrackindexvalue = (int)(BA.ObjectToNumber(_storageref._getdefault /*Object*/ (_trackindexkey,(Object)(-1))));
 //BA.debugLineNum = 364;BA.debugLine="If storedCursor < 0 Then";
if (_storedcursor<0) { 
 //BA.debugLineNum = 365;BA.debugLine="If storedTrackIndexValue >= 0 Then storedCursor";
if (_storedtrackindexvalue>=0) { 
_storedcursor = (int) (_storedtrackindexvalue+1);};
 };
 //BA.debugLineNum = 367;BA.debugLine="Dim storedTrackIndex As Int = storedCursor - 1";
_storedtrackindex = (int) (_storedcursor-1);
 //BA.debugLineNum = 368;BA.debugLine="If storedTrackIndex >= order.Size Then storedTrac";
if (_storedtrackindex>=_order.getSize()) { 
_storedtrackindex = (int) (_storedtrackindex%_order.getSize());};
 //BA.debugLineNum = 370;BA.debugLine="Dim hotCount As Int = 0";
_hotcount = (int) (0);
 //BA.debugLineNum = 371;BA.debugLine="Dim coldCount As Int = 0";
_coldcount = (int) (0);
 //BA.debugLineNum = 372;BA.debugLine="For orderIndex = 0 To order.Size - 1";
{
final int step25 = 1;
final int limit25 = (int) (_order.getSize()-1);
_orderindex = (int) (0) ;
for (;_orderindex <= limit25 ;_orderindex = _orderindex + step25 ) {
 //BA.debugLineNum = 373;BA.debugLine="Dim trackId As String = order.Get(orderIndex)";
_trackid = BA.ObjectToString(_order.Get(_orderindex));
 //BA.debugLineNum = 374;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 375;BA.debugLine="Dim trackObject As Object = trackMap.GetDefault(";
_trackobject = _trackmap.GetDefault((Object)(_trackid),__c.Null);
 //BA.debugLineNum = 376;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 377;BA.debugLine="Dim track As Map = CloneMap(trackObject)";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = _clonemap((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject)));
 //BA.debugLineNum = 378;BA.debugLine="track.Put(\"playlist_id\", playlistId)";
_track.Put((Object)("playlist_id"),(Object)(_playlistid));
 //BA.debugLineNum = 379;BA.debugLine="track.Put(\"playlist_track_index\", orderIndex)";
_track.Put((Object)("playlist_track_index"),(Object)(_orderindex));
 //BA.debugLineNum = 380;BA.debugLine="If mediaCacheService.HasValidatedLocalMedia(trac";
if (_mediacacheservice._hasvalidatedlocalmedia /*boolean*/ (_track)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 381;BA.debugLine="If storedTrackIndex < 0 Or orderIndex > storedTr";
if (_storedtrackindex<0 || _orderindex>_storedtrackindex) { 
 //BA.debugLineNum = 382;BA.debugLine="hotCount = hotCount + 1";
_hotcount = (int) (_hotcount+1);
 }else {
 //BA.debugLineNum = 384;BA.debugLine="coldCount = coldCount + 1";
_coldcount = (int) (_coldcount+1);
 };
 }
};
 //BA.debugLineNum = 387;BA.debugLine="result.Put(\"hot\", hotCount)";
_result.Put((Object)("hot"),(Object)(_hotcount));
 //BA.debugLineNum = 388;BA.debugLine="result.Put(\"cold\", coldCount)";
_result.Put((Object)("cold"),(Object)(_coldcount));
 //BA.debugLineNum = 389;BA.debugLine="result.Put(\"total\", hotCount + coldCount)";
_result.Put((Object)("total"),(Object)(_hotcount+_coldcount));
 //BA.debugLineNum = 390;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getplaylistplaybackmanifestbyid(String _playlistid) throws Exception{
 //BA.debugLineNum = 752;BA.debugLine="Public Sub GetPlaylistPlaybackManifestById(playlis";
 //BA.debugLineNum = 753;BA.debugLine="Return LoadOrBuildPlaylistPlaybackManifestById(pl";
if (true) return _loadorbuildplaylistplaybackmanifestbyid(_playlistid);
 //BA.debugLineNum = 754;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getupcomingplaybacktracksbyid(String _playlistid,int _limitcount,b4a.example.mediacache _mediacacheservice,boolean _includecached) throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _manifest = null;
String _playlisttitle = "";
anywheresoftware.b4a.objects.collections.List _order = null;
anywheresoftware.b4a.objects.collections.Map _trackmap = null;
String _cursorkey = "";
int _storedcursor = 0;
String _trackindexkey = "";
int _storedtrackindexvalue = 0;
int _storedtrackindex = 0;
int _startindex = 0;
int _offset = 0;
int _orderindex = 0;
String _trackid = "";
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
 //BA.debugLineNum = 298;BA.debugLine="Public Sub GetUpcomingPlaybackTracksById(playlistI";
 //BA.debugLineNum = 299;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 300;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 301;BA.debugLine="If storageRef.IsInitialized = False Then Return r";
if (_storageref.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return _result;};
 //BA.debugLineNum = 302;BA.debugLine="If playlistId = \"\" Or limitCount <= 0 Then Return";
if ((_playlistid).equals("") || _limitcount<=0) { 
if (true) return _result;};
 //BA.debugLineNum = 303;BA.debugLine="Dim manifest As Map = LoadOrBuildPlaylistPlayback";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = _loadorbuildplaylistplaybackmanifestbyid(_playlistid);
 //BA.debugLineNum = 304;BA.debugLine="If manifest.IsInitialized = False Or manifest.Siz";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) return _result;};
 //BA.debugLineNum = 305;BA.debugLine="Dim playlistTitle As String = manifest.GetDefault";
_playlisttitle = BA.ObjectToString(_manifest.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 306;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
_order = new anywheresoftware.b4a.objects.collections.List();
_order = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_manifest.GetDefault((Object)("order"),__c.Null)));
 //BA.debugLineNum = 307;BA.debugLine="If order.IsInitialized = False Or order.Size = 0";
if (_order.IsInitialized()==__c.False || _order.getSize()==0) { 
if (true) return _result;};
 //BA.debugLineNum = 308;BA.debugLine="Dim trackMap As Map = manifest.GetDefault(\"tracks";
_trackmap = new anywheresoftware.b4a.objects.collections.Map();
_trackmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_manifest.GetDefault((Object)("tracks"),__c.Null)));
 //BA.debugLineNum = 309;BA.debugLine="If trackMap.IsInitialized = False Or trackMap.Siz";
if (_trackmap.IsInitialized()==__c.False || _trackmap.getSize()==0) { 
if (true) return _result;};
 //BA.debugLineNum = 311;BA.debugLine="Dim cursorKey As String = PlaylistPlaybackCursorK";
_cursorkey = _playlistplaybackcursorkey(_playlistid);
 //BA.debugLineNum = 312;BA.debugLine="Dim storedCursor As Int = storageRef.GetDefault(c";
_storedcursor = (int)(BA.ObjectToNumber(_storageref._getdefault /*Object*/ (_cursorkey,(Object)(-1))));
 //BA.debugLineNum = 313;BA.debugLine="Dim trackIndexKey As String = PlaylistTrackIndexK";
_trackindexkey = _playlisttrackindexkey(_playlistid);
 //BA.debugLineNum = 314;BA.debugLine="Dim storedTrackIndexValue As Int = storageRef.Get";
_storedtrackindexvalue = (int)(BA.ObjectToNumber(_storageref._getdefault /*Object*/ (_trackindexkey,(Object)(-1))));
 //BA.debugLineNum = 315;BA.debugLine="If storedCursor < 0 Then";
if (_storedcursor<0) { 
 //BA.debugLineNum = 316;BA.debugLine="If storedTrackIndexValue >= 0 Then storedCursor";
if (_storedtrackindexvalue>=0) { 
_storedcursor = (int) (_storedtrackindexvalue+1);};
 };
 //BA.debugLineNum = 318;BA.debugLine="Dim storedTrackIndex As Int = storedCursor - 1";
_storedtrackindex = (int) (_storedcursor-1);
 //BA.debugLineNum = 319;BA.debugLine="If storedTrackIndex >= order.Size Then storedTrac";
if (_storedtrackindex>=_order.getSize()) { 
_storedtrackindex = (int) (_storedtrackindex%_order.getSize());};
 //BA.debugLineNum = 321;BA.debugLine="Dim startIndex As Int = storedTrackIndex + 1";
_startindex = (int) (_storedtrackindex+1);
 //BA.debugLineNum = 322;BA.debugLine="If startIndex < 0 Then startIndex = 0";
if (_startindex<0) { 
_startindex = (int) (0);};
 //BA.debugLineNum = 323;BA.debugLine="If startIndex >= order.Size Then startIndex = sta";
if (_startindex>=_order.getSize()) { 
_startindex = (int) (_startindex%_order.getSize());};
 //BA.debugLineNum = 325;BA.debugLine="For offset = 0 To order.Size - 1";
{
final int step24 = 1;
final int limit24 = (int) (_order.getSize()-1);
_offset = (int) (0) ;
for (;_offset <= limit24 ;_offset = _offset + step24 ) {
 //BA.debugLineNum = 326;BA.debugLine="If result.Size >= limitCount Then Exit";
if (_result.getSize()>=_limitcount) { 
if (true) break;};
 //BA.debugLineNum = 327;BA.debugLine="Dim orderIndex As Int = (startIndex + offset) Mo";
_orderindex = (int) ((_startindex+_offset)%_order.getSize());
 //BA.debugLineNum = 328;BA.debugLine="Dim trackId As String = order.Get(orderIndex)";
_trackid = BA.ObjectToString(_order.Get(_orderindex));
 //BA.debugLineNum = 329;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 330;BA.debugLine="If storedTrackIndex >= 0 And order.Size > 1 And";
if (_storedtrackindex>=0 && _order.getSize()>1 && _orderindex==_storedtrackindex) { 
if (true) continue;};
 //BA.debugLineNum = 331;BA.debugLine="Dim trackObject As Object = trackMap.GetDefault(";
_trackobject = _trackmap.GetDefault((Object)(_trackid),__c.Null);
 //BA.debugLineNum = 332;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 333;BA.debugLine="Dim track As Map = CloneMap(trackObject)";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = _clonemap((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject)));
 //BA.debugLineNum = 334;BA.debugLine="track.Put(\"playlist_id\", playlistId)";
_track.Put((Object)("playlist_id"),(Object)(_playlistid));
 //BA.debugLineNum = 335;BA.debugLine="track.Put(\"playlist_title\", playlistTitle)";
_track.Put((Object)("playlist_title"),(Object)(_playlisttitle));
 //BA.debugLineNum = 336;BA.debugLine="track.Put(\"playlist_track_index\", orderIndex)";
_track.Put((Object)("playlist_track_index"),(Object)(_orderindex));
 //BA.debugLineNum = 337;BA.debugLine="track.Put(\"playlist_cursor\", orderIndex + 1)";
_track.Put((Object)("playlist_cursor"),(Object)(_orderindex+1));
 //BA.debugLineNum = 338;BA.debugLine="If includeCached = False And mediaCacheService.H";
if (_includecached==__c.False && _mediacacheservice._hasvalidatedlocalmedia /*boolean*/ (_track)) { 
if (true) continue;};
 //BA.debugLineNum = 339;BA.debugLine="result.Add(track)";
_result.Add((Object)(_track.getObject()));
 }
};
 //BA.debugLineNum = 342;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _storagedirvalue,Object _targetmodulevalue,String _tracesubnamevalue) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(storageDirValue As String, t";
 //BA.debugLineNum = 15;BA.debugLine="storageDir = storageDirValue";
_storagedir = _storagedirvalue;
 //BA.debugLineNum = 16;BA.debugLine="targetModule = targetModuleValue";
_targetmodule = _targetmodulevalue;
 //BA.debugLineNum = 17;BA.debugLine="traceSubName = traceSubNameValue";
_tracesubname = _tracesubnamevalue;
 //BA.debugLineNum = 18;BA.debugLine="playlistCursors.Initialize";
_playlistcursors.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _isoweekdayfromticks(long _ticks) throws Exception{
anywheresoftware.b4j.object.JavaObject _instantclass = null;
anywheresoftware.b4j.object.JavaObject _zoneclass = null;
anywheresoftware.b4j.object.JavaObject _zoneddatetimeclass = null;
anywheresoftware.b4j.object.JavaObject _instant = null;
anywheresoftware.b4j.object.JavaObject _zoneid = null;
anywheresoftware.b4j.object.JavaObject _zoneddatetime = null;
anywheresoftware.b4j.object.JavaObject _localdate = null;
anywheresoftware.b4j.object.JavaObject _dayofweek = null;
 //BA.debugLineNum = 685;BA.debugLine="Private Sub IsoWeekdayFromTicks(ticks As Long) As";
 //BA.debugLineNum = 686;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 687;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant\"";
_instantclass.InitializeStatic("java.time.Instant");
 //BA.debugLineNum = 688;BA.debugLine="Dim zoneClass As JavaObject";
_zoneclass = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 689;BA.debugLine="zoneClass.InitializeStatic(\"java.time.ZoneId\")";
_zoneclass.InitializeStatic("java.time.ZoneId");
 //BA.debugLineNum = 690;BA.debugLine="Dim zonedDateTimeClass As JavaObject";
_zoneddatetimeclass = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 691;BA.debugLine="zonedDateTimeClass.InitializeStatic(\"java.time.Zo";
_zoneddatetimeclass.InitializeStatic("java.time.ZonedDateTime");
 //BA.debugLineNum = 692;BA.debugLine="Dim instant As JavaObject = instantClass.RunMetho";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("ofEpochMilli",new Object[]{(Object)(_ticks)})));
 //BA.debugLineNum = 693;BA.debugLine="Dim zoneId As JavaObject = zoneClass.RunMethod(\"s";
_zoneid = new anywheresoftware.b4j.object.JavaObject();
_zoneid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneclass.RunMethod("systemDefault",(Object[])(__c.Null))));
 //BA.debugLineNum = 694;BA.debugLine="Dim zonedDateTime As JavaObject = zonedDateTimeCl";
_zoneddatetime = new anywheresoftware.b4j.object.JavaObject();
_zoneddatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetimeclass.RunMethod("ofInstant",new Object[]{(Object)(_instant.getObject()),(Object)(_zoneid.getObject())})));
 //BA.debugLineNum = 695;BA.debugLine="Dim localDate As JavaObject = zonedDateTime.RunMe";
_localdate = new anywheresoftware.b4j.object.JavaObject();
_localdate = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetime.RunMethod("toLocalDate",(Object[])(__c.Null))));
 //BA.debugLineNum = 696;BA.debugLine="Dim dayOfWeek As JavaObject = localDate.RunMethod";
_dayofweek = new anywheresoftware.b4j.object.JavaObject();
_dayofweek = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_localdate.RunMethod("getDayOfWeek",(Object[])(__c.Null))));
 //BA.debugLineNum = 697;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
if (true) return ""+BA.ObjectToString(_dayofweek.RunMethod("getValue",(Object[])(__c.Null)));
 //BA.debugLineNum = 698;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadcachedplaylistmetadata(String _playlistid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _parseddata = null;
 //BA.debugLineNum = 202;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
 //BA.debugLineNum = 203;BA.debugLine="Dim playlistData As Map";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 204;BA.debugLine="playlistData.Initialize";
_playlistdata.Initialize();
 //BA.debugLineNum = 205;BA.debugLine="If playlistId = \"\" Then Return playlistData";
if ((_playlistid).equals("")) { 
if (true) return _playlistdata;};
 //BA.debugLineNum = 206;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistMe";
if (__c.File.Exists(_getofflineplaylistsdir(),_playlistmetadatafilename(_playlistid))==__c.False) { 
if (true) return _playlistdata;};
 //BA.debugLineNum = 207;BA.debugLine="Try";
try { //BA.debugLineNum = 208;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 209;BA.debugLine="parser.Initialize(File.ReadString(GetOfflinePlay";
_parser.Initialize(__c.File.ReadString(_getofflineplaylistsdir(),_playlistmetadatafilename(_playlistid)));
 //BA.debugLineNum = 210;BA.debugLine="Dim parsedData As Map = parser.NextObject";
_parseddata = new anywheresoftware.b4a.objects.collections.Map();
_parseddata = _parser.NextObject();
 //BA.debugLineNum = 211;BA.debugLine="If parsedData.IsInitialized Then playlistData =";
if (_parseddata.IsInitialized()) { 
_playlistdata = _parseddata;};
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 213;BA.debugLine="playlistData.Initialize";
_playlistdata.Initialize();
 //BA.debugLineNum = 214;BA.debugLine="Trace(\"Не удалось загрузить playlist metadata из";
_trace("Не удалось загрузить playlist metadata из кэша. id="+_playlistid+", message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 216;BA.debugLine="Return playlistData";
if (true) return _playlistdata;
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _loadorbuildplaylistplaybackmanifestbyid(String _playlistid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _manifest = null;
anywheresoftware.b4a.objects.collections.Map _storedmanifest = null;
anywheresoftware.b4a.objects.collections.List _storedorder = null;
anywheresoftware.b4a.objects.collections.Map _storedtracks = null;
anywheresoftware.b4a.objects.collections.Map _sourceplaylistdata = null;
 //BA.debugLineNum = 393;BA.debugLine="Private Sub LoadOrBuildPlaylistPlaybackManifestByI";
 //BA.debugLineNum = 394;BA.debugLine="Dim manifest As Map";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 395;BA.debugLine="manifest.Initialize";
_manifest.Initialize();
 //BA.debugLineNum = 396;BA.debugLine="If playlistId = \"\" Then Return manifest";
if ((_playlistid).equals("")) { 
if (true) return _manifest;};
 //BA.debugLineNum = 397;BA.debugLine="Dim storedManifest As Map = storageRef.GetDefault";
_storedmanifest = new anywheresoftware.b4a.objects.collections.Map();
_storedmanifest = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storageref._getdefault /*Object*/ (_playlistplaybackmanifestkey(_playlistid),__c.Null)));
 //BA.debugLineNum = 398;BA.debugLine="If storedManifest.IsInitialized Then";
if (_storedmanifest.IsInitialized()) { 
 //BA.debugLineNum = 399;BA.debugLine="Dim storedOrder As List = storedManifest.GetDefa";
_storedorder = new anywheresoftware.b4a.objects.collections.List();
_storedorder = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_storedmanifest.GetDefault((Object)("order"),__c.Null)));
 //BA.debugLineNum = 400;BA.debugLine="Dim storedTracks As Map = storedManifest.GetDefa";
_storedtracks = new anywheresoftware.b4a.objects.collections.Map();
_storedtracks = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storedmanifest.GetDefault((Object)("tracks"),__c.Null)));
 //BA.debugLineNum = 401;BA.debugLine="If storedOrder.IsInitialized And storedOrder.Siz";
if (_storedorder.IsInitialized() && _storedorder.getSize()>0 && _storedtracks.IsInitialized() && _storedtracks.getSize()>0) { 
 //BA.debugLineNum = 402;BA.debugLine="Return storedManifest";
if (true) return _storedmanifest;
 };
 };
 //BA.debugLineNum = 405;BA.debugLine="Dim sourcePlaylistData As Map = LoadCachedPlaylis";
_sourceplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
_sourceplaylistdata = _loadcachedplaylistmetadata(_playlistid);
 //BA.debugLineNum = 406;BA.debugLine="If sourcePlaylistData.IsInitialized = False Or so";
if (_sourceplaylistdata.IsInitialized()==__c.False || _sourceplaylistdata.getSize()==0) { 
if (true) return _manifest;};
 //BA.debugLineNum = 407;BA.debugLine="manifest = BuildPlaylistPlaybackManifest(sourcePl";
_manifest = _buildplaylistplaybackmanifest(_sourceplaylistdata);
 //BA.debugLineNum = 408;BA.debugLine="If manifest.IsInitialized And manifest.Size > 0 T";
if (_manifest.IsInitialized() && _manifest.getSize()>0) { 
 //BA.debugLineNum = 409;BA.debugLine="storageRef.Put(PlaylistPlaybackManifestKey(playl";
_storageref._put /*String*/ (_playlistplaybackmanifestkey(_playlistid),(Object)(_manifest.getObject()));
 };
 //BA.debugLineNum = 411;BA.debugLine="Return manifest";
if (true) return _manifest;
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public String  _loadstate(b4a.example.keyvaluestore _storage) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub LoadState(storage As KeyValueStore)";
 //BA.debugLineNum = 23;BA.debugLine="storageRef = storage";
_storageref = _storage;
 //BA.debugLineNum = 24;BA.debugLine="playlistCursors = storage.GetDefault(\"data_slot_p";
_playlistcursors = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ ("data_slot_playlist_cursors",(Object)(_createinitializedmap().getObject()))));
 //BA.debugLineNum = 25;BA.debugLine="If playlistCursors.IsInitialized = False Then pla";
if (_playlistcursors.IsInitialized()==__c.False) { 
_playlistcursors.Initialize();};
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public int  _minutesofdayfromticks(long _ticks) throws Exception{
String _previoustimeformat = "";
String _timevalue = "";
String[] _parts = null;
 //BA.debugLineNum = 675;BA.debugLine="Private Sub MinutesOfDayFromTicks(ticks As Long) A";
 //BA.debugLineNum = 676;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
 //BA.debugLineNum = 677;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
 //BA.debugLineNum = 678;BA.debugLine="Dim timeValue As String = DateTime.Time(ticks)";
_timevalue = __c.DateTime.Time(_ticks);
 //BA.debugLineNum = 679;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
 //BA.debugLineNum = 680;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
 //BA.debugLineNum = 681;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 682;BA.debugLine="Return parts(0) * 60 + parts(1)";
if (true) return (int) ((double)(Double.parseDouble(_parts[(int) (0)]))*60+(double)(Double.parseDouble(_parts[(int) (1)])));
 //BA.debugLineNum = 683;BA.debugLine="End Sub";
return 0;
}
public String  _playlistmetadatafilename(String _playlistid) throws Exception{
 //BA.debugLineNum = 663;BA.debugLine="Private Sub PlaylistMetadataFileName(playlistId As";
 //BA.debugLineNum = 664;BA.debugLine="Return playlistId & \".json\"";
if (true) return _playlistid+".json";
 //BA.debugLineNum = 665;BA.debugLine="End Sub";
return "";
}
public String  _playlistplaybackcursorkey(String _playlistid) throws Exception{
 //BA.debugLineNum = 469;BA.debugLine="Private Sub PlaylistPlaybackCursorKey(playlistId A";
 //BA.debugLineNum = 470;BA.debugLine="Return \"playlist_playback_cursor_\" & playlistId";
if (true) return "playlist_playback_cursor_"+_playlistid;
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return "";
}
public String  _playlistplaybackmanifestkey(String _playlistid) throws Exception{
 //BA.debugLineNum = 465;BA.debugLine="Private Sub PlaylistPlaybackManifestKey(playlistId";
 //BA.debugLineNum = 466;BA.debugLine="Return \"playlist_playback_manifest_\" & playlistId";
if (true) return "playlist_playback_manifest_"+_playlistid;
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return "";
}
public String  _playlistplaybackmanifestversion(anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
String _updatedvalue = "";
anywheresoftware.b4a.objects.collections.List _tracks = null;
int _trackcount = 0;
 //BA.debugLineNum = 457;BA.debugLine="Private Sub PlaylistPlaybackManifestVersion(playli";
 //BA.debugLineNum = 458;BA.debugLine="Dim updatedValue As String = playlistData.GetDefa";
_updatedvalue = BA.ObjectToString(_playlistdata.GetDefault((Object)("updated"),(Object)("")));
 //BA.debugLineNum = 459;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
 //BA.debugLineNum = 460;BA.debugLine="Dim trackCount As Int = 0";
_trackcount = (int) (0);
 //BA.debugLineNum = 461;BA.debugLine="If tracks.IsInitialized Then trackCount = tracks.";
if (_tracks.IsInitialized()) { 
_trackcount = _tracks.getSize();};
 //BA.debugLineNum = 462;BA.debugLine="Return updatedValue & \"|\" & trackCount";
if (true) return _updatedvalue+"|"+BA.NumberToString(_trackcount);
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return "";
}
public String  _playlisttrackindexkey(String _playlistid) throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Private Sub PlaylistTrackIndexKey(playlistId As St";
 //BA.debugLineNum = 474;BA.debugLine="Return \"playlist_track_index_\" & playlistId";
if (true) return "playlist_track_index_"+_playlistid;
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolvecurrentdataslot(anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub ResolveCurrentDataSlot(offlineData As M";
 //BA.debugLineNum = 38;BA.debugLine="Return ResolveDataSlotAtTicks(offlineData, DateTi";
if (true) return _resolvedataslotatticks(_offlinedata,__c.DateTime.getNow());
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvedataslotatticks(anywheresoftware.b4a.objects.collections.Map _offlinedata,long _targetticks) throws Exception{
anywheresoftware.b4a.objects.collections.Map _slotcontext = null;
anywheresoftware.b4a.objects.collections.List _schedules = null;
long _effectiveticks = 0L;
String _todaykey = "";
int _nowminutes = 0;
String _todayweekday = "";
anywheresoftware.b4a.objects.collections.List _matchedslots = null;
anywheresoftware.b4a.objects.collections.Map _selectedslot = null;
int _selectedminutes = 0;
Object _slotentryobject = null;
anywheresoftware.b4a.objects.collections.Map _slotentry = null;
int _slotminutes = 0;
int _dayoffset = 0;
long _previousdayticks = 0L;
String _previousdaykey = "";
String _previousweekday = "";
anywheresoftware.b4a.objects.collections.List _previousslots = null;
anywheresoftware.b4a.objects.collections.Map _previousselected = null;
int _previousselectedminutes = 0;
Object _previousentryobject = null;
anywheresoftware.b4a.objects.collections.Map _previousentry = null;
int _previousminutes = 0;
 //BA.debugLineNum = 42;BA.debugLine="Public Sub ResolveDataSlotAtTicks(offlineData As M";
 //BA.debugLineNum = 43;BA.debugLine="Dim slotContext As Map";
_slotcontext = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 44;BA.debugLine="slotContext.Initialize";
_slotcontext.Initialize();
 //BA.debugLineNum = 45;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return _slotcontext;};
 //BA.debugLineNum = 46;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
 //BA.debugLineNum = 47;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return _slotcontext;};
 //BA.debugLineNum = 48;BA.debugLine="Dim effectiveTicks As Long = targetTicks + SLOT_S";
_effectiveticks = (long) (_targetticks+_slot_switch_lead_ms);
 //BA.debugLineNum = 49;BA.debugLine="Dim todayKey As String = FormatIsoDate(effectiveT";
_todaykey = _formatisodate(_effectiveticks);
 //BA.debugLineNum = 50;BA.debugLine="Dim nowMinutes As Int = MinutesOfDayFromTicks(eff";
_nowminutes = _minutesofdayfromticks(_effectiveticks);
 //BA.debugLineNum = 51;BA.debugLine="Dim todayWeekday As String = IsoWeekdayFromTicks(";
_todayweekday = _isoweekdayfromticks(_effectiveticks);
 //BA.debugLineNum = 52;BA.debugLine="Dim matchedSlots As List = BuildMatchedSlotsForDa";
_matchedslots = new anywheresoftware.b4a.objects.collections.List();
_matchedslots = _buildmatchedslotsfordate(_schedules,_todaykey,_todayweekday);
 //BA.debugLineNum = 53;BA.debugLine="If matchedSlots.Size = 0 Then Return slotContext";
if (_matchedslots.getSize()==0) { 
if (true) return _slotcontext;};
 //BA.debugLineNum = 54;BA.debugLine="Dim selectedSlot As Map";
_selectedslot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 55;BA.debugLine="selectedSlot.Initialize";
_selectedslot.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="Dim selectedMinutes As Int = -1";
_selectedminutes = (int) (-1);
 //BA.debugLineNum = 57;BA.debugLine="For Each slotEntryObject As Object In matchedSlot";
{
final anywheresoftware.b4a.BA.IterableList group15 = _matchedslots;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_slotentryobject = group15.Get(index15);
 //BA.debugLineNum = 58;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
_slotentry = new anywheresoftware.b4a.objects.collections.Map();
_slotentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotentryobject));
 //BA.debugLineNum = 59;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"s";
_slotminutes = (int)(BA.ObjectToNumber(_slotentry.GetDefault((Object)("slot_minutes"),(Object)(-1))));
 //BA.debugLineNum = 60;BA.debugLine="If slotMinutes <= nowMinutes And slotMinutes >=";
if (_slotminutes<=_nowminutes && _slotminutes>=_selectedminutes) { 
 //BA.debugLineNum = 61;BA.debugLine="selectedSlot = slotEntry";
_selectedslot = _slotentry;
 //BA.debugLineNum = 62;BA.debugLine="selectedMinutes = slotMinutes";
_selectedminutes = _slotminutes;
 };
 }
};
 //BA.debugLineNum = 65;BA.debugLine="If selectedSlot.Size = 0 Then";
if (_selectedslot.getSize()==0) { 
 //BA.debugLineNum = 68;BA.debugLine="For dayOffset = 1 To 7";
{
final int step24 = 1;
final int limit24 = (int) (7);
_dayoffset = (int) (1) ;
for (;_dayoffset <= limit24 ;_dayoffset = _dayoffset + step24 ) {
 //BA.debugLineNum = 69;BA.debugLine="Dim previousDayTicks As Long = effectiveTicks -";
_previousdayticks = (long) (_effectiveticks-_dayoffset*__c.DateTime.TicksPerDay);
 //BA.debugLineNum = 70;BA.debugLine="Dim previousDayKey As String = FormatIsoDate(pr";
_previousdaykey = _formatisodate(_previousdayticks);
 //BA.debugLineNum = 71;BA.debugLine="Dim previousWeekday As String = IsoWeekdayFromT";
_previousweekday = _isoweekdayfromticks(_previousdayticks);
 //BA.debugLineNum = 72;BA.debugLine="Dim previousSlots As List = BuildMatchedSlotsFo";
_previousslots = new anywheresoftware.b4a.objects.collections.List();
_previousslots = _buildmatchedslotsfordate(_schedules,_previousdaykey,_previousweekday);
 //BA.debugLineNum = 73;BA.debugLine="If previousSlots.IsInitialized = False Or previ";
if (_previousslots.IsInitialized()==__c.False || _previousslots.getSize()==0) { 
if (true) continue;};
 //BA.debugLineNum = 74;BA.debugLine="Dim previousSelected As Map";
_previousselected = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 75;BA.debugLine="previousSelected.Initialize";
_previousselected.Initialize();
 //BA.debugLineNum = 76;BA.debugLine="Dim previousSelectedMinutes As Int = -1";
_previousselectedminutes = (int) (-1);
 //BA.debugLineNum = 77;BA.debugLine="For Each previousEntryObject As Object In previ";
{
final anywheresoftware.b4a.BA.IterableList group33 = _previousslots;
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_previousentryobject = group33.Get(index33);
 //BA.debugLineNum = 78;BA.debugLine="Dim previousEntry As Map = previousEntryObject";
_previousentry = new anywheresoftware.b4a.objects.collections.Map();
_previousentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_previousentryobject));
 //BA.debugLineNum = 79;BA.debugLine="Dim previousMinutes As Int = previousEntry.Get";
_previousminutes = (int)(BA.ObjectToNumber(_previousentry.GetDefault((Object)("slot_minutes"),(Object)(-1))));
 //BA.debugLineNum = 80;BA.debugLine="If previousMinutes > previousSelectedMinutes T";
if (_previousminutes>_previousselectedminutes) { 
 //BA.debugLineNum = 81;BA.debugLine="previousSelected = previousEntry";
_previousselected = _previousentry;
 //BA.debugLineNum = 82;BA.debugLine="previousSelectedMinutes = previousMinutes";
_previousselectedminutes = _previousminutes;
 };
 }
};
 //BA.debugLineNum = 85;BA.debugLine="If previousSelected.IsInitialized And previousS";
if (_previousselected.IsInitialized() && _previousselected.getSize()>0) { 
 //BA.debugLineNum = 86;BA.debugLine="selectedSlot = previousSelected";
_selectedslot = _previousselected;
 //BA.debugLineNum = 87;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 //BA.debugLineNum = 91;BA.debugLine="Return selectedSlot";
if (true) return _selectedslot;
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextdataslot(anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Public Sub ResolveNextDataSlot(offlineData As Map)";
 //BA.debugLineNum = 129;BA.debugLine="Return ResolveNextDataSlotAtTicks(offlineData, Da";
if (true) return _resolvenextdataslotatticks(_offlinedata,__c.DateTime.getNow());
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextdataslotatticks(anywheresoftware.b4a.objects.collections.Map _offlinedata,long _referenceticks) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nextslot = null;
anywheresoftware.b4a.objects.collections.List _schedules = null;
long _nowticks = 0L;
long _bestslotticks = 0L;
int _dayoffset = 0;
long _dayticks = 0L;
String _daykey = "";
String _dayweekday = "";
Object _scheduleobject = null;
anywheresoftware.b4a.objects.collections.Map _schedule = null;
String _scheduletitle = "";
anywheresoftware.b4a.objects.collections.List _slots = null;
Object _slotobject = null;
anywheresoftware.b4a.objects.collections.Map _slot = null;
String _slottime = "";
int _slotminutes = 0;
long _slotticks = 0L;
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
 //BA.debugLineNum = 133;BA.debugLine="Public Sub ResolveNextDataSlotAtTicks(offlineData";
 //BA.debugLineNum = 134;BA.debugLine="Dim nextSlot As Map";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 135;BA.debugLine="nextSlot.Initialize";
_nextslot.Initialize();
 //BA.debugLineNum = 136;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return _nextslot;};
 //BA.debugLineNum = 137;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
 //BA.debugLineNum = 138;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return _nextslot;};
 //BA.debugLineNum = 139;BA.debugLine="Dim nowTicks As Long = referenceTicks";
_nowticks = _referenceticks;
 //BA.debugLineNum = 140;BA.debugLine="Dim bestSlotTicks As Long = 0";
_bestslotticks = (long) (0);
 //BA.debugLineNum = 141;BA.debugLine="For dayOffset = 0 To 7";
{
final int step8 = 1;
final int limit8 = (int) (7);
_dayoffset = (int) (0) ;
for (;_dayoffset <= limit8 ;_dayoffset = _dayoffset + step8 ) {
 //BA.debugLineNum = 142;BA.debugLine="Dim dayTicks As Long = StartOfDayTicks(nowTicks";
_dayticks = _startofdayticks((long) (_nowticks+_dayoffset*__c.DateTime.TicksPerDay));
 //BA.debugLineNum = 143;BA.debugLine="Dim dayKey As String = FormatIsoDate(dayTicks)";
_daykey = _formatisodate(_dayticks);
 //BA.debugLineNum = 144;BA.debugLine="Dim dayWeekday As String = IsoWeekdayFromTicks(d";
_dayweekday = _isoweekdayfromticks(_dayticks);
 //BA.debugLineNum = 145;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group12 = _schedules;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_scheduleobject = group12.Get(index12);
 //BA.debugLineNum = 146;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
 //BA.debugLineNum = 147;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
 //BA.debugLineNum = 148;BA.debugLine="If ScheduleAppliesOnDate(schedule, dayKey, day";
if (_scheduleappliesondate(_schedule,_daykey,_dayweekday)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 149;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefa";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 150;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
 //BA.debugLineNum = 151;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 152;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group19 = _slots;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_slotobject = group19.Get(index19);
 //BA.debugLineNum = 153;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
 //BA.debugLineNum = 154;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
 //BA.debugLineNum = 155;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"ti";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
 //BA.debugLineNum = 156;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes";
_slotminutes = _timestringtominutes(_slottime);
 //BA.debugLineNum = 157;BA.debugLine="If slotMinutes < 0 Then Continue";
if (_slotminutes<0) { 
if (true) continue;};
 //BA.debugLineNum = 158;BA.debugLine="Dim slotTicks As Long = dayTicks + slotMinut";
_slotticks = (long) (_dayticks+_slotminutes*__c.DateTime.TicksPerMinute);
 //BA.debugLineNum = 159;BA.debugLine="If slotTicks <= nowTicks Then Continue";
if (_slotticks<=_nowticks) { 
if (true) continue;};
 //BA.debugLineNum = 160;BA.debugLine="If bestSlotTicks > 0 And slotTicks >= bestSl";
if (_bestslotticks>0 && _slotticks>=_bestslotticks) { 
if (true) continue;};
 //BA.debugLineNum = 161;BA.debugLine="Dim streamData As Map = ExtractSlotStreamDat";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = _extractslotstreamdata(_slot);
 //BA.debugLineNum = 162;BA.debugLine="nextSlot.Initialize";
_nextslot.Initialize();
 //BA.debugLineNum = 163;BA.debugLine="nextSlot.Put(\"schedule_title\", scheduleTitle";
_nextslot.Put((Object)("schedule_title"),(Object)(_scheduletitle));
 //BA.debugLineNum = 164;BA.debugLine="nextSlot.Put(\"slot_time\", slotTime)";
_nextslot.Put((Object)("slot_time"),(Object)(_slottime));
 //BA.debugLineNum = 165;BA.debugLine="nextSlot.Put(\"slot_minutes\", slotMinutes)";
_nextslot.Put((Object)("slot_minutes"),(Object)(_slotminutes));
 //BA.debugLineNum = 166;BA.debugLine="nextSlot.Put(\"slot_ticks\", slotTicks)";
_nextslot.Put((Object)("slot_ticks"),(Object)(_slotticks));
 //BA.debugLineNum = 167;BA.debugLine="nextSlot.Put(\"stream_id\", streamData.GetDefa";
_nextslot.Put((Object)("stream_id"),_streamdata.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 168;BA.debugLine="nextSlot.Put(\"stream_title\", streamData.GetD";
_nextslot.Put((Object)("stream_title"),_streamdata.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 169;BA.debugLine="nextSlot.Put(\"playlists\", streamData.GetDefa";
_nextslot.Put((Object)("playlists"),_streamdata.GetDefault((Object)("playlists"),(Object)(_createinitializedlist().getObject())));
 //BA.debugLineNum = 170;BA.debugLine="bestSlotTicks = slotTicks";
_bestslotticks = _slotticks;
 };
 }
};
 };
 }
};
 //BA.debugLineNum = 175;BA.debugLine="If nextSlot.IsInitialized And nextSlot.Size > 0";
if (_nextslot.IsInitialized() && _nextslot.getSize()>0) { 
if (true) break;};
 }
};
 //BA.debugLineNum = 177;BA.debugLine="Return nextSlot";
if (true) return _nextslot;
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public String  _resolveofflinestreamtitle(anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
String _targetstreamid = "";
String _targetslottime = "";
anywheresoftware.b4a.objects.collections.List _schedules = null;
Object _scheduleobject = null;
anywheresoftware.b4a.objects.collections.Map _schedule = null;
anywheresoftware.b4a.objects.collections.List _slots = null;
Object _slotobject = null;
anywheresoftware.b4a.objects.collections.Map _slot = null;
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
String _streamtitle = "";
 //BA.debugLineNum = 604;BA.debugLine="Private Sub ResolveOfflineStreamTitle(currentSlot";
 //BA.debugLineNum = 605;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 606;BA.debugLine="Dim targetStreamId As String = currentSlot.GetDef";
_targetstreamid = BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")));
 //BA.debugLineNum = 607;BA.debugLine="Dim targetSlotTime As String = currentSlot.GetDef";
_targetslottime = BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
 //BA.debugLineNum = 608;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
 //BA.debugLineNum = 609;BA.debugLine="If schedules.IsInitialized = False Then Return \"\"";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 610;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group6 = _schedules;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_scheduleobject = group6.Get(index6);
 //BA.debugLineNum = 611;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
 //BA.debugLineNum = 612;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
 //BA.debugLineNum = 613;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
 //BA.debugLineNum = 614;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 615;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group11 = _slots;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_slotobject = group11.Get(index11);
 //BA.debugLineNum = 616;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
 //BA.debugLineNum = 617;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
 //BA.debugLineNum = 618;BA.debugLine="If targetSlotTime <> \"\" And slot.GetDefault(\"";
if ((_targetslottime).equals("") == false && (_slot.GetDefault((Object)("time"),(Object)(""))).equals((Object)(_targetslottime)) == false) { 
if (true) continue;};
 //BA.debugLineNum = 619;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = _extractslotstreamdata(_slot);
 //BA.debugLineNum = 620;BA.debugLine="If targetStreamId <> \"\" And streamData.GetDef";
if ((_targetstreamid).equals("") == false && (_streamdata.GetDefault((Object)("id"),(Object)(""))).equals((Object)(_targetstreamid)) == false) { 
if (true) continue;};
 //BA.debugLineNum = 621;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
_streamtitle = BA.ObjectToString(_streamdata.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 622;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
if ((_streamtitle).equals("") == false) { 
if (true) return _streamtitle;};
 };
 }
};
 };
 }
};
 //BA.debugLineNum = 627;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 628;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolveorderedcachedtrackfromplaylistbyid(String _playlistid,b4a.example.mediacache _mediacacheservice) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptytrack = null;
anywheresoftware.b4a.objects.collections.Map _manifest = null;
String _playlisttitle = "";
anywheresoftware.b4a.objects.collections.List _order = null;
anywheresoftware.b4a.objects.collections.Map _trackmap = null;
String _cursorkey = "";
int _storedcursor = 0;
String _trackindexkey = "";
int _storedtrackindexvalue = 0;
int _storedtrackindex = 0;
anywheresoftware.b4a.objects.collections.Map _selectedtrack = null;
int _startindex = 0;
int _offset = 0;
int _orderindex = 0;
String _trackid = "";
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
int _fallbackorderindex = 0;
String _fallbacktrackid = "";
Object _fallbacktrackobject = null;
 //BA.debugLineNum = 221;BA.debugLine="Public Sub ResolveOrderedCachedTrackFromPlaylistBy";
 //BA.debugLineNum = 222;BA.debugLine="Dim emptyTrack As Map";
_emptytrack = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 223;BA.debugLine="emptyTrack.Initialize";
_emptytrack.Initialize();
 //BA.debugLineNum = 224;BA.debugLine="If storageRef.IsInitialized = False Then Return e";
if (_storageref.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return _emptytrack;};
 //BA.debugLineNum = 225;BA.debugLine="If playlistId = \"\" Then Return emptyTrack";
if ((_playlistid).equals("")) { 
if (true) return _emptytrack;};
 //BA.debugLineNum = 226;BA.debugLine="Dim manifest As Map = LoadOrBuildPlaylistPlayback";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = _loadorbuildplaylistplaybackmanifestbyid(_playlistid);
 //BA.debugLineNum = 227;BA.debugLine="If manifest.IsInitialized = False Or manifest.Siz";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) return _emptytrack;};
 //BA.debugLineNum = 228;BA.debugLine="Dim playlistTitle As String = manifest.GetDefault";
_playlisttitle = BA.ObjectToString(_manifest.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 229;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
_order = new anywheresoftware.b4a.objects.collections.List();
_order = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_manifest.GetDefault((Object)("order"),__c.Null)));
 //BA.debugLineNum = 230;BA.debugLine="If order.IsInitialized = False Or order.Size = 0";
if (_order.IsInitialized()==__c.False || _order.getSize()==0) { 
if (true) return _emptytrack;};
 //BA.debugLineNum = 231;BA.debugLine="Dim trackMap As Map = manifest.GetDefault(\"tracks";
_trackmap = new anywheresoftware.b4a.objects.collections.Map();
_trackmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_manifest.GetDefault((Object)("tracks"),__c.Null)));
 //BA.debugLineNum = 232;BA.debugLine="If trackMap.IsInitialized = False Or trackMap.Siz";
if (_trackmap.IsInitialized()==__c.False || _trackmap.getSize()==0) { 
if (true) return _emptytrack;};
 //BA.debugLineNum = 233;BA.debugLine="Dim cursorKey As String = PlaylistPlaybackCursorK";
_cursorkey = _playlistplaybackcursorkey(_playlistid);
 //BA.debugLineNum = 234;BA.debugLine="Dim storedCursor As Int = storageRef.GetDefault(c";
_storedcursor = (int)(BA.ObjectToNumber(_storageref._getdefault /*Object*/ (_cursorkey,(Object)(-1))));
 //BA.debugLineNum = 235;BA.debugLine="Dim trackIndexKey As String = PlaylistTrackIndexK";
_trackindexkey = _playlisttrackindexkey(_playlistid);
 //BA.debugLineNum = 236;BA.debugLine="Dim storedTrackIndexValue As Int = storageRef.Get";
_storedtrackindexvalue = (int)(BA.ObjectToNumber(_storageref._getdefault /*Object*/ (_trackindexkey,(Object)(-1))));
 //BA.debugLineNum = 237;BA.debugLine="If storedCursor < 0 Then";
if (_storedcursor<0) { 
 //BA.debugLineNum = 238;BA.debugLine="If storedTrackIndexValue >= 0 Then storedCursor";
if (_storedtrackindexvalue>=0) { 
_storedcursor = (int) (_storedtrackindexvalue+1);};
 };
 //BA.debugLineNum = 240;BA.debugLine="Dim storedTrackIndex As Int = storedCursor - 1";
_storedtrackindex = (int) (_storedcursor-1);
 //BA.debugLineNum = 241;BA.debugLine="If storedTrackIndex >= order.Size Then storedTrac";
if (_storedtrackindex>=_order.getSize()) { 
_storedtrackindex = (int) (_storedtrackindex%_order.getSize());};
 //BA.debugLineNum = 242;BA.debugLine="Trace(\"playlist resolve start playlistId=\" & play";
_trace("playlist resolve start playlistId="+_playlistid+" orderSize="+BA.NumberToString(_order.getSize())+" storedCursor="+BA.NumberToString(_storedcursor)+" storedTrackIndexKey="+BA.NumberToString(_storedtrackindexvalue)+" effectiveStoredTrackIndex="+BA.NumberToString(_storedtrackindex));
 //BA.debugLineNum = 243;BA.debugLine="Dim selectedTrack As Map";
_selectedtrack = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 244;BA.debugLine="selectedTrack.Initialize";
_selectedtrack.Initialize();
 //BA.debugLineNum = 245;BA.debugLine="Dim startIndex As Int = storedTrackIndex + 1";
_startindex = (int) (_storedtrackindex+1);
 //BA.debugLineNum = 246;BA.debugLine="If startIndex < 0 Then startIndex = 0";
if (_startindex<0) { 
_startindex = (int) (0);};
 //BA.debugLineNum = 247;BA.debugLine="If startIndex >= order.Size Then startIndex = sta";
if (_startindex>=_order.getSize()) { 
_startindex = (int) (_startindex%_order.getSize());};
 //BA.debugLineNum = 248;BA.debugLine="For offset = 0 To order.Size - 1";
{
final int step27 = 1;
final int limit27 = (int) (_order.getSize()-1);
_offset = (int) (0) ;
for (;_offset <= limit27 ;_offset = _offset + step27 ) {
 //BA.debugLineNum = 249;BA.debugLine="Dim orderIndex As Int = (startIndex + offset) Mo";
_orderindex = (int) ((_startindex+_offset)%_order.getSize());
 //BA.debugLineNum = 250;BA.debugLine="Dim trackId As String = order.Get(orderIndex)";
_trackid = BA.ObjectToString(_order.Get(_orderindex));
 //BA.debugLineNum = 251;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 252;BA.debugLine="If storedTrackIndex >= 0 And order.Size > 1 And";
if (_storedtrackindex>=0 && _order.getSize()>1 && _orderindex==_storedtrackindex) { 
 //BA.debugLineNum = 253;BA.debugLine="Trace(\"playlist resolve skip_current playlistId";
_trace("playlist resolve skip_current playlistId="+_playlistid+" orderIndex="+BA.NumberToString(_orderindex)+" trackId="+_trackid);
 //BA.debugLineNum = 254;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 256;BA.debugLine="Dim trackObject As Object = trackMap.GetDefault(";
_trackobject = _trackmap.GetDefault((Object)(_trackid),__c.Null);
 //BA.debugLineNum = 257;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 258;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
 //BA.debugLineNum = 259;BA.debugLine="If mediaCacheService.HasValidatedLocalMedia(trac";
if (_mediacacheservice._hasvalidatedlocalmedia /*boolean*/ (_track)) { 
 //BA.debugLineNum = 260;BA.debugLine="storageRef.Put(trackIndexKey, orderIndex)";
_storageref._put /*String*/ (_trackindexkey,(Object)(_orderindex));
 //BA.debugLineNum = 261;BA.debugLine="storageRef.Put(cursorKey, orderIndex + 1)";
_storageref._put /*String*/ (_cursorkey,(Object)(_orderindex+1));
 //BA.debugLineNum = 262;BA.debugLine="selectedTrack = CloneMap(track)";
_selectedtrack = _clonemap(_track);
 //BA.debugLineNum = 263;BA.debugLine="selectedTrack.Put(\"playlist_track_index\", order";
_selectedtrack.Put((Object)("playlist_track_index"),(Object)(_orderindex));
 //BA.debugLineNum = 264;BA.debugLine="selectedTrack.Put(\"playlist_cursor\", orderIndex";
_selectedtrack.Put((Object)("playlist_cursor"),(Object)(_orderindex+1));
 //BA.debugLineNum = 265;BA.debugLine="selectedTrack.Put(\"playlist_title\", playlistTit";
_selectedtrack.Put((Object)("playlist_title"),(Object)(_playlisttitle));
 //BA.debugLineNum = 266;BA.debugLine="Trace(\"playlist resolve selected playlistId=\" &";
_trace("playlist resolve selected playlistId="+_playlistid+" orderIndex="+BA.NumberToString(_orderindex)+" nextCursor="+BA.NumberToString((_orderindex+1))+" trackId="+_trackid);
 //BA.debugLineNum = 267;BA.debugLine="Exit";
if (true) break;
 }else {
 };
 }
};
 //BA.debugLineNum = 272;BA.debugLine="If selectedTrack.IsInitialized = False Or selecte";
if (_selectedtrack.IsInitialized()==__c.False || _selectedtrack.getSize()==0) { 
 //BA.debugLineNum = 273;BA.debugLine="For offset = 0 To order.Size - 1";
{
final int step51 = 1;
final int limit51 = (int) (_order.getSize()-1);
_offset = (int) (0) ;
for (;_offset <= limit51 ;_offset = _offset + step51 ) {
 //BA.debugLineNum = 274;BA.debugLine="Dim fallbackOrderIndex As Int = (startIndex + o";
_fallbackorderindex = (int) ((_startindex+_offset)%_order.getSize());
 //BA.debugLineNum = 275;BA.debugLine="Dim fallbackTrackId As String = order.Get(fallb";
_fallbacktrackid = BA.ObjectToString(_order.Get(_fallbackorderindex));
 //BA.debugLineNum = 276;BA.debugLine="If fallbackTrackId = \"\" Then Continue";
if ((_fallbacktrackid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 277;BA.debugLine="If storedTrackIndex >= 0 And order.Size > 1 And";
if (_storedtrackindex>=0 && _order.getSize()>1 && _fallbackorderindex==_storedtrackindex) { 
if (true) continue;};
 //BA.debugLineNum = 278;BA.debugLine="If mediaCacheService.IsTrackCached(fallbackTrac";
if (_mediacacheservice._istrackcached /*boolean*/ (_fallbacktrackid)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 279;BA.debugLine="Dim fallbackTrackObject As Object = trackMap.Ge";
_fallbacktrackobject = _trackmap.GetDefault((Object)(_fallbacktrackid),__c.Null);
 //BA.debugLineNum = 280;BA.debugLine="If (fallbackTrackObject Is Map) = False Then Co";
if ((_fallbacktrackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 281;BA.debugLine="selectedTrack = CloneMap(fallbackTrackObject)";
_selectedtrack = _clonemap((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_fallbacktrackobject)));
 //BA.debugLineNum = 282;BA.debugLine="selectedTrack.Put(\"playlist_title\", playlistTit";
_selectedtrack.Put((Object)("playlist_title"),(Object)(_playlisttitle));
 //BA.debugLineNum = 283;BA.debugLine="storageRef.Put(trackIndexKey, fallbackOrderInde";
_storageref._put /*String*/ (_trackindexkey,(Object)(_fallbackorderindex));
 //BA.debugLineNum = 284;BA.debugLine="storageRef.Put(cursorKey, fallbackOrderIndex +";
_storageref._put /*String*/ (_cursorkey,(Object)(_fallbackorderindex+1));
 //BA.debugLineNum = 285;BA.debugLine="selectedTrack.Put(\"playlist_track_index\", fallb";
_selectedtrack.Put((Object)("playlist_track_index"),(Object)(_fallbackorderindex));
 //BA.debugLineNum = 286;BA.debugLine="selectedTrack.Put(\"playlist_cursor\", fallbackOr";
_selectedtrack.Put((Object)("playlist_cursor"),(Object)(_fallbackorderindex+1));
 //BA.debugLineNum = 287;BA.debugLine="Trace(\"playlist resolve fallback_index playlist";
_trace("playlist resolve fallback_index playlistId="+_playlistid+" orderIndex="+BA.NumberToString(_fallbackorderindex)+" trackId="+_fallbacktrackid);
 //BA.debugLineNum = 288;BA.debugLine="Exit";
if (true) break;
 }
};
 //BA.debugLineNum = 290;BA.debugLine="If selectedTrack.IsInitialized = False Or select";
if (_selectedtrack.IsInitialized()==__c.False || _selectedtrack.getSize()==0) { 
 //BA.debugLineNum = 291;BA.debugLine="Trace(\"playlist resolve empty playlistId=\" & pl";
_trace("playlist resolve empty playlistId="+_playlistid+" orderSize="+BA.NumberToString(_order.getSize()));
 };
 };
 //BA.debugLineNum = 294;BA.debugLine="If selectedTrack.IsInitialized And selectedTrack.";
if (_selectedtrack.IsInitialized() && _selectedtrack.getSize()>0) { 
if (true) return _selectedtrack;};
 //BA.debugLineNum = 295;BA.debugLine="Return emptyTrack";
if (true) return _emptytrack;
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public String  _resolveplaybackstreamtitle(anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _playlistdescriptor,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
String _streamtitle = "";
String _resolvedstreamtitle = "";
String _scheduletitle = "";
String _descriptorstreamtitle = "";
 //BA.debugLineNum = 592;BA.debugLine="Private Sub ResolvePlaybackStreamTitle(currentSlot";
 //BA.debugLineNum = 593;BA.debugLine="Dim streamTitle As String = currentSlot.GetDefaul";
_streamtitle = BA.ObjectToString(_currentslot.GetDefault((Object)("stream_title"),(Object)("")));
 //BA.debugLineNum = 594;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
if ((_streamtitle).equals("") == false) { 
if (true) return _streamtitle;};
 //BA.debugLineNum = 595;BA.debugLine="Dim resolvedStreamTitle As String = ResolveOfflin";
_resolvedstreamtitle = _resolveofflinestreamtitle(_currentslot,_offlinedata);
 //BA.debugLineNum = 596;BA.debugLine="If resolvedStreamTitle <> \"\" Then Return resolved";
if ((_resolvedstreamtitle).equals("") == false) { 
if (true) return _resolvedstreamtitle;};
 //BA.debugLineNum = 597;BA.debugLine="Dim scheduleTitle As String = currentSlot.GetDefa";
_scheduletitle = BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")));
 //BA.debugLineNum = 598;BA.debugLine="Dim descriptorStreamTitle As String = playlistDes";
_descriptorstreamtitle = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("stream_title"),(Object)("")));
 //BA.debugLineNum = 599;BA.debugLine="If descriptorStreamTitle <> \"\" Then Return descri";
if ((_descriptorstreamtitle).equals("") == false) { 
if (true) return _descriptorstreamtitle;};
 //BA.debugLineNum = 600;BA.debugLine="If scheduleTitle <> \"\" Then Return scheduleTitle";
if ((_scheduletitle).equals("") == false) { 
if (true) return _scheduletitle;};
 //BA.debugLineNum = 601;BA.debugLine="Return playlistDescriptor.GetDefault(\"title\", \"\")";
if (true) return BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 602;BA.debugLine="End Sub";
return "";
}
public String  _savepreviewplaylistcursors(b4a.example.keyvaluestore _storage,anywheresoftware.b4a.objects.collections.Map _workingcursors) throws Exception{
 //BA.debugLineNum = 586;BA.debugLine="Public Sub SavePreviewPlaylistCursors(storage As K";
 //BA.debugLineNum = 587;BA.debugLine="If workingCursors.IsInitialized = False Or workin";
if (_workingcursors.IsInitialized()==__c.False || _workingcursors.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 588;BA.debugLine="playlistCursors = CloneMap(workingCursors)";
_playlistcursors = _clonemap(_workingcursors);
 //BA.debugLineNum = 589;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
_storage._put /*String*/ ("data_slot_playlist_cursors",(Object)(_playlistcursors.getObject()));
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return "";
}
public boolean  _scheduleappliesondate(anywheresoftware.b4a.objects.collections.Map _schedule,String _targetdatekey,String _targetweekday) throws Exception{
String _startdate = "";
anywheresoftware.b4a.objects.collections.List _weekdays = null;
Object _weekdayobject = null;
 //BA.debugLineNum = 644;BA.debugLine="Private Sub ScheduleAppliesOnDate(schedule As Map,";
 //BA.debugLineNum = 645;BA.debugLine="Dim startDate As String = schedule.GetDefault(\"st";
_startdate = BA.ObjectToString(_schedule.GetDefault((Object)("start"),(Object)("")));
 //BA.debugLineNum = 646;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(target";
if ((_startdate).equals("") == false && _startdate.compareTo(_targetdatekey)>0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 647;BA.debugLine="Dim weekdays As List = schedule.GetDefault(\"weekd";
_weekdays = new anywheresoftware.b4a.objects.collections.List();
_weekdays = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("weekdays"),__c.Null)));
 //BA.debugLineNum = 648;BA.debugLine="If weekdays.IsInitialized = False Or weekdays.Siz";
if (_weekdays.IsInitialized()==__c.False || _weekdays.getSize()==0) { 
if (true) return __c.True;};
 //BA.debugLineNum = 649;BA.debugLine="For Each weekdayObject As Object In weekdays";
{
final anywheresoftware.b4a.BA.IterableList group5 = _weekdays;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_weekdayobject = group5.Get(index5);
 //BA.debugLineNum = 650;BA.debugLine="If (\"\" & weekdayObject).Trim = targetWeekday The";
if (((""+BA.ObjectToString(_weekdayobject)).trim()).equals(_targetweekday)) { 
if (true) return __c.True;};
 }
};
 //BA.debugLineNum = 652;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 653;BA.debugLine="End Sub";
return false;
}
public String  _shufflelistinplace(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
int _i = 0;
int _j = 0;
Object _temp = null;
 //BA.debugLineNum = 477;BA.debugLine="Private Sub ShuffleListInPlace(items As List)";
 //BA.debugLineNum = 478;BA.debugLine="If items.IsInitialized = False Or items.Size < 2";
if (_items.IsInitialized()==__c.False || _items.getSize()<2) { 
if (true) return "";};
 //BA.debugLineNum = 479;BA.debugLine="For i = items.Size - 1 To 1 Step -1";
{
final int step2 = -1;
final int limit2 = (int) (1);
_i = (int) (_items.getSize()-1) ;
for (;_i >= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 480;BA.debugLine="Dim j As Int = Rnd(0, i + 1)";
_j = __c.Rnd((int) (0),(int) (_i+1));
 //BA.debugLineNum = 481;BA.debugLine="If j = i Then Continue";
if (_j==_i) { 
if (true) continue;};
 //BA.debugLineNum = 482;BA.debugLine="Dim temp As Object = items.Get(i)";
_temp = _items.Get(_i);
 //BA.debugLineNum = 483;BA.debugLine="items.Set(i, items.Get(j))";
_items.Set(_i,_items.Get(_j));
 //BA.debugLineNum = 484;BA.debugLine="items.Set(j, temp)";
_items.Set(_j,_temp);
 }
};
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return "";
}
public long  _startofdayticks(long _ticks) throws Exception{
String _previousdateformat = "";
String _daykey = "";
long _dayticks = 0L;
 //BA.debugLineNum = 715;BA.debugLine="Private Sub StartOfDayTicks(ticks As Long) As Long";
 //BA.debugLineNum = 716;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
 //BA.debugLineNum = 717;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 718;BA.debugLine="Dim dayKey As String = DateTime.Date(ticks)";
_daykey = __c.DateTime.Date(_ticks);
 //BA.debugLineNum = 719;BA.debugLine="Dim dayTicks As Long = DateTime.DateParse(dayKey)";
_dayticks = __c.DateTime.DateParse(_daykey);
 //BA.debugLineNum = 720;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
 //BA.debugLineNum = 721;BA.debugLine="Return dayTicks";
if (true) return _dayticks;
 //BA.debugLineNum = 722;BA.debugLine="End Sub";
return 0L;
}
public int  _timestringtominutes(String _value) throws Exception{
String[] _parts = null;
int _hours = 0;
int _minutes = 0;
 //BA.debugLineNum = 700;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
 //BA.debugLineNum = 701;BA.debugLine="If value = \"\" Then Return -1";
if ((_value).equals("")) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 702;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
_parts = __c.Regex.Split(":",_value);
 //BA.debugLineNum = 703;BA.debugLine="If parts.Length < 2 Then Return -1";
if (_parts.length<2) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 704;BA.debugLine="Try";
try { //BA.debugLineNum = 705;BA.debugLine="Dim hours As Int = parts(0)";
_hours = (int)(Double.parseDouble(_parts[(int) (0)]));
 //BA.debugLineNum = 706;BA.debugLine="Dim minutes As Int = parts(1)";
_minutes = (int)(Double.parseDouble(_parts[(int) (1)]));
 //BA.debugLineNum = 707;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
if (_hours<0 || _hours>23) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 708;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
if (_minutes<0 || _minutes>59) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 709;BA.debugLine="Return hours * 60 + minutes";
if (true) return (int) (_hours*60+_minutes);
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 711;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
 //BA.debugLineNum = 713;BA.debugLine="End Sub";
return 0;
}
public String  _trace(String _message) throws Exception{
 //BA.debugLineNum = 746;BA.debugLine="Private Sub Trace(message As String)";
 //BA.debugLineNum = 747;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,_targetmodule,_tracesubname)) { 
 //BA.debugLineNum = 748;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,_targetmodule,_tracesubname,(Object)(_message));
 };
 //BA.debugLineNum = 750;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
