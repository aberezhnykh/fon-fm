package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class offlinestore extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.offlinestore");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.offlinestore.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _storagedir = "";
public b4a.example.keyvaluestore _storage = null;
public Object _targetmodule = null;
public String _tracesubname = "";
public String _playerdatafilename = "";
public String _playlistrequirementsfilename = "";
public String _playlistsdirname = "";
public String _playlistcdnbaseurl = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.collections.List  _buildofflineplaylistdescriptors(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
anywheresoftware.b4a.objects.collections.List _descriptors = null;
anywheresoftware.b4a.objects.collections.Map _uniquedescriptors = null;
anywheresoftware.b4a.objects.collections.List _schedules = null;
Object _scheduleobject = null;
anywheresoftware.b4a.objects.collections.Map _schedule = null;
String _scheduletitle = "";
anywheresoftware.b4a.objects.collections.List _slots = null;
Object _slotobject = null;
anywheresoftware.b4a.objects.collections.Map _slot = null;
String _slottime = "";
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
String _streamid = "";
String _streamtitle = "";
anywheresoftware.b4a.objects.collections.List _playlists = null;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlist = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
 //BA.debugLineNum = 202;BA.debugLine="Private Sub BuildOfflinePlaylistDescriptors(data A";
 //BA.debugLineNum = 203;BA.debugLine="Dim descriptors As List";
_descriptors = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 204;BA.debugLine="descriptors.Initialize";
_descriptors.Initialize();
 //BA.debugLineNum = 205;BA.debugLine="If data.IsInitialized = False Then Return descrip";
if (_data.IsInitialized()==__c.False) { 
if (true) return _descriptors;};
 //BA.debugLineNum = 206;BA.debugLine="Dim uniqueDescriptors As Map";
_uniquedescriptors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 207;BA.debugLine="uniqueDescriptors.Initialize";
_uniquedescriptors.Initialize();
 //BA.debugLineNum = 208;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
 //BA.debugLineNum = 209;BA.debugLine="If schedules.IsInitialized = False Then Return de";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return _descriptors;};
 //BA.debugLineNum = 210;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group8 = _schedules;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.Get(index8);
 //BA.debugLineNum = 211;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
 //BA.debugLineNum = 212;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
 //BA.debugLineNum = 213;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 214;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
 //BA.debugLineNum = 215;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 216;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group14 = _slots;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_slotobject = group14.Get(index14);
 //BA.debugLineNum = 217;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
 //BA.debugLineNum = 218;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
 //BA.debugLineNum = 219;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
 //BA.debugLineNum = 220;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = _extractslotstreamdata(_slot);
 //BA.debugLineNum = 221;BA.debugLine="Dim streamId As String = streamData.GetDefaul";
_streamid = BA.ObjectToString(_streamdata.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 222;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
_streamtitle = BA.ObjectToString(_streamdata.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 223;BA.debugLine="Dim playlists As List = streamData.GetDefault";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_streamdata.GetDefault((Object)("playlists"),__c.Null)));
 //BA.debugLineNum = 224;BA.debugLine="If playlists.IsInitialized = False Then Conti";
if (_playlists.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 225;BA.debugLine="For Each playlistObject As Object In playlist";
{
final anywheresoftware.b4a.BA.IterableList group23 = _playlists;
final int groupLen23 = group23.getSize()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_playlistobject = group23.Get(index23);
 //BA.debugLineNum = 226;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
 //BA.debugLineNum = 227;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
 //BA.debugLineNum = 228;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
_playlistid = BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 229;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 230;BA.debugLine="If uniqueDescriptors.ContainsKey(playlistId";
if (_uniquedescriptors.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
 //BA.debugLineNum = 231;BA.debugLine="Dim descriptor As Map";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 232;BA.debugLine="descriptor.Initialize";
_descriptor.Initialize();
 //BA.debugLineNum = 233;BA.debugLine="descriptor.Put(\"id\", playlistId)";
_descriptor.Put((Object)("id"),(Object)(_playlistid));
 //BA.debugLineNum = 234;BA.debugLine="descriptor.Put(\"updated\", playlist.GetDefau";
_descriptor.Put((Object)("updated"),_playlist.GetDefault((Object)("updated"),(Object)("")));
 //BA.debugLineNum = 235;BA.debugLine="descriptor.Put(\"title\", playlist.GetDefault";
_descriptor.Put((Object)("title"),_playlist.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 236;BA.debugLine="descriptor.Put(\"schedule_title\", scheduleTi";
_descriptor.Put((Object)("schedule_title"),(Object)(_scheduletitle));
 //BA.debugLineNum = 237;BA.debugLine="descriptor.Put(\"slot_time\", slotTime)";
_descriptor.Put((Object)("slot_time"),(Object)(_slottime));
 //BA.debugLineNum = 238;BA.debugLine="descriptor.Put(\"stream_id\", streamId)";
_descriptor.Put((Object)("stream_id"),(Object)(_streamid));
 //BA.debugLineNum = 239;BA.debugLine="descriptor.Put(\"stream_title\", streamTitle)";
_descriptor.Put((Object)("stream_title"),(Object)(_streamtitle));
 //BA.debugLineNum = 240;BA.debugLine="uniqueDescriptors.Put(playlistId, descripto";
_uniquedescriptors.Put((Object)(_playlistid),(Object)(_descriptor.getObject()));
 //BA.debugLineNum = 241;BA.debugLine="descriptors.Add(descriptor)";
_descriptors.Add((Object)(_descriptor.getObject()));
 };
 }
};
 };
 }
};
 };
 }
};
 //BA.debugLineNum = 248;BA.debugLine="Return descriptors";
if (true) return _descriptors;
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private storageDir As String";
_storagedir = "";
 //BA.debugLineNum = 7;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4a.example.keyvaluestore();
 //BA.debugLineNum = 8;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
 //BA.debugLineNum = 10;BA.debugLine="Private playerDataFileName As String";
_playerdatafilename = "";
 //BA.debugLineNum = 11;BA.debugLine="Private playlistRequirementsFileName As String";
_playlistrequirementsfilename = "";
 //BA.debugLineNum = 12;BA.debugLine="Private playlistsDirName As String";
_playlistsdirname = "";
 //BA.debugLineNum = 13;BA.debugLine="Private playlistCdnBaseUrl As String";
_playlistcdnbaseurl = "";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _cleanupobsoleteplaylistmetadata(anywheresoftware.b4a.objects.collections.List _descriptors) throws Exception{
anywheresoftware.b4a.objects.collections.Map _actualids = null;
Object _descriptorobject = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex = null;
int _removedcount = 0;
anywheresoftware.b4a.objects.collections.List _obsoleteids = null;
 //BA.debugLineNum = 312;BA.debugLine="Private Sub CleanupObsoletePlaylistMetadata(descri";
 //BA.debugLineNum = 313;BA.debugLine="Dim actualIds As Map";
_actualids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 314;BA.debugLine="actualIds.Initialize";
_actualids.Initialize();
 //BA.debugLineNum = 315;BA.debugLine="If descriptors.IsInitialized Then";
if (_descriptors.IsInitialized()) { 
 //BA.debugLineNum = 316;BA.debugLine="For Each descriptorObject As Object In descripto";
{
final anywheresoftware.b4a.BA.IterableList group4 = _descriptors;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_descriptorobject = group4.Get(index4);
 //BA.debugLineNum = 317;BA.debugLine="If descriptorObject Is Map Then";
if (_descriptorobject instanceof java.util.Map) { 
 //BA.debugLineNum = 318;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
 //BA.debugLineNum = 319;BA.debugLine="Dim playlistId As String = descriptor.GetDefau";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 320;BA.debugLine="If playlistId <> \"\" Then actualIds.Put(playlis";
if ((_playlistid).equals("") == false) { 
_actualids.Put((Object)(_playlistid),(Object)(__c.True));};
 };
 }
};
 };
 //BA.debugLineNum = 324;BA.debugLine="Dim cachedPlaylistIndex As Map = storage.GetDefau";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ ("cached_playlist_index",(Object)(_createinitializedmap().getObject()))));
 //BA.debugLineNum = 325;BA.debugLine="Dim removedCount As Int = 0";
_removedcount = (int) (0);
 //BA.debugLineNum = 326;BA.debugLine="Dim obsoleteIds As List";
_obsoleteids = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 327;BA.debugLine="obsoleteIds.Initialize";
_obsoleteids.Initialize();
 //BA.debugLineNum = 328;BA.debugLine="For Each playlistId As String In cachedPlaylistIn";
{
final anywheresoftware.b4a.BA.IterableList group16 = _cachedplaylistindex.Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_playlistid = BA.ObjectToString(group16.Get(index16));
 //BA.debugLineNum = 329;BA.debugLine="If actualIds.ContainsKey(playlistId) = False The";
if (_actualids.ContainsKey((Object)(_playlistid))==__c.False) { 
_obsoleteids.Add((Object)(_playlistid));};
 }
};
 //BA.debugLineNum = 331;BA.debugLine="For Each playlistId As String In obsoleteIds";
{
final anywheresoftware.b4a.BA.IterableList group19 = _obsoleteids;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_playlistid = BA.ObjectToString(group19.Get(index19));
 //BA.debugLineNum = 332;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistM";
if (__c.File.Exists(_getofflineplaylistsdir(),_playlistmetadatafilename(_playlistid))) { 
 //BA.debugLineNum = 333;BA.debugLine="File.Delete(GetOfflinePlaylistsDir, PlaylistMet";
__c.File.Delete(_getofflineplaylistsdir(),_playlistmetadatafilename(_playlistid));
 };
 //BA.debugLineNum = 335;BA.debugLine="InvalidatePlaylistPlaybackOrder(playlistId)";
_invalidateplaylistplaybackorder(_playlistid);
 //BA.debugLineNum = 336;BA.debugLine="cachedPlaylistIndex.Remove(playlistId)";
_cachedplaylistindex.Remove((Object)(_playlistid));
 //BA.debugLineNum = 337;BA.debugLine="removedCount = removedCount + 1";
_removedcount = (int) (_removedcount+1);
 }
};
 //BA.debugLineNum = 339;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
 //BA.debugLineNum = 340;BA.debugLine="storage.Put(\"cached_playlist_index\", cachedPlayl";
_storage._put /*String*/ ("cached_playlist_index",(Object)(_cachedplaylistindex.getObject()));
 //BA.debugLineNum = 341;BA.debugLine="Trace(\"playlist metadata cleanup done removed=\"";
_trace("playlist metadata cleanup done removed="+BA.NumberToString(_removedcount));
 };
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _compareofflineplaylistswithcache(anywheresoftware.b4a.objects.collections.List _descriptors) throws Exception{
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.List _downloadids = null;
anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex = null;
int _missingcount = 0;
int _outdatedcount = 0;
int _actualcount = 0;
Object _descriptorobject = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
String _playlistid = "";
Object _cachedentryobject = null;
anywheresoftware.b4a.objects.collections.Map _cachedentry = null;
 //BA.debugLineNum = 251;BA.debugLine="Private Sub CompareOfflinePlaylistsWithCache(descr";
 //BA.debugLineNum = 252;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 253;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 254;BA.debugLine="Dim downloadIds As List";
_downloadids = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 255;BA.debugLine="downloadIds.Initialize";
_downloadids.Initialize();
 //BA.debugLineNum = 256;BA.debugLine="Dim cachedPlaylistIndex As Map = storage.GetDefau";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ ("cached_playlist_index",(Object)(_createinitializedmap().getObject()))));
 //BA.debugLineNum = 257;BA.debugLine="Dim missingCount As Int = 0";
_missingcount = (int) (0);
 //BA.debugLineNum = 258;BA.debugLine="Dim outdatedCount As Int = 0";
_outdatedcount = (int) (0);
 //BA.debugLineNum = 259;BA.debugLine="Dim actualCount As Int = 0";
_actualcount = (int) (0);
 //BA.debugLineNum = 260;BA.debugLine="For Each descriptorObject As Object In descriptor";
{
final anywheresoftware.b4a.BA.IterableList group9 = _descriptors;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_descriptorobject = group9.Get(index9);
 //BA.debugLineNum = 261;BA.debugLine="If descriptorObject Is Map Then";
if (_descriptorobject instanceof java.util.Map) { 
 //BA.debugLineNum = 262;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
 //BA.debugLineNum = 263;BA.debugLine="Dim playlistId As String = descriptor.GetDefaul";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 264;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 265;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId)";
if (_cachedplaylistindex.ContainsKey((Object)(_playlistid))==__c.False) { 
 //BA.debugLineNum = 266;BA.debugLine="missingCount = missingCount + 1";
_missingcount = (int) (_missingcount+1);
 //BA.debugLineNum = 267;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
 //BA.debugLineNum = 268;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 270;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylis";
_cachedentryobject = _cachedplaylistindex.Get((Object)(_playlistid));
 //BA.debugLineNum = 271;BA.debugLine="If cachedEntryObject Is Map Then";
if (_cachedentryobject instanceof java.util.Map) { 
 //BA.debugLineNum = 272;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
_cachedentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedentryobject));
 //BA.debugLineNum = 273;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> de";
if ((_cachedentry.GetDefault((Object)("updated"),(Object)(""))).equals(_descriptor.GetDefault((Object)("updated"),(Object)(""))) == false) { 
 //BA.debugLineNum = 274;BA.debugLine="outdatedCount = outdatedCount + 1";
_outdatedcount = (int) (_outdatedcount+1);
 //BA.debugLineNum = 275;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
 }else {
 //BA.debugLineNum = 277;BA.debugLine="actualCount = actualCount + 1";
_actualcount = (int) (_actualcount+1);
 };
 }else {
 //BA.debugLineNum = 280;BA.debugLine="missingCount = missingCount + 1";
_missingcount = (int) (_missingcount+1);
 //BA.debugLineNum = 281;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
 };
 };
 }
};
 //BA.debugLineNum = 285;BA.debugLine="result.Put(\"DownloadIds\", downloadIds)";
_result.Put((Object)("DownloadIds"),(Object)(_downloadids.getObject()));
 //BA.debugLineNum = 286;BA.debugLine="result.Put(\"MissingCount\", missingCount)";
_result.Put((Object)("MissingCount"),(Object)(_missingcount));
 //BA.debugLineNum = 287;BA.debugLine="result.Put(\"OutdatedCount\", outdatedCount)";
_result.Put((Object)("OutdatedCount"),(Object)(_outdatedcount));
 //BA.debugLineNum = 288;BA.debugLine="result.Put(\"ActualCount\", actualCount)";
_result.Put((Object)("ActualCount"),(Object)(_actualcount));
 //BA.debugLineNum = 289;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist() throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
 //BA.debugLineNum = 390;BA.debugLine="Private Sub CreateInitializedList As List";
 //BA.debugLineNum = 391;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 392;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 393;BA.debugLine="Return items";
if (true) return _items;
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 384;BA.debugLine="Private Sub CreateInitializedMap As Map";
 //BA.debugLineNum = 385;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 386;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 387;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public String  _ensuredirectory(String _path) throws Exception{
anywheresoftware.b4j.object.JavaObject _jofile = null;
 //BA.debugLineNum = 378;BA.debugLine="Private Sub EnsureDirectory(path As String)";
 //BA.debugLineNum = 379;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 380;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
 //BA.debugLineNum = 381;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _extractslotstreamdata(anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
Object _streamobject = null;
 //BA.debugLineNum = 364;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
 //BA.debugLineNum = 365;BA.debugLine="Dim streamData As Map";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 366;BA.debugLine="streamData.Initialize";
_streamdata.Initialize();
 //BA.debugLineNum = 367;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
if (_slot.IsInitialized()==__c.False) { 
if (true) return _streamdata;};
 //BA.debugLineNum = 368;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
_streamobject = _slot.Get((Object)("stream"));
 //BA.debugLineNum = 369;BA.debugLine="If streamObject Is Map Then";
if (_streamobject instanceof java.util.Map) { 
 //BA.debugLineNum = 370;BA.debugLine="streamData = streamObject";
_streamdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_streamobject));
 //BA.debugLineNum = 371;BA.debugLine="Return streamData";
if (true) return _streamdata;
 };
 //BA.debugLineNum = 373;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
if (_streamobject!= null) { 
_streamdata.Put((Object)("id"),(Object)(""+BA.ObjectToString(_streamobject)));};
 //BA.debugLineNum = 374;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
if (_slot.ContainsKey((Object)("playlists"))) { 
_streamdata.Put((Object)("playlists"),_slot.Get((Object)("playlists")));};
 //BA.debugLineNum = 375;BA.debugLine="Return streamData";
if (true) return _streamdata;
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedplaylistindex() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub GetCachedPlaylistIndex As Map";
 //BA.debugLineNum = 76;BA.debugLine="Return storage.GetDefault(\"cached_playlist_index\"";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ ("cached_playlist_index",(Object)(_createinitializedmap().getObject()))));
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public int  _getofflineadscount(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
anywheresoftware.b4a.objects.collections.List _ads = null;
 //BA.debugLineNum = 188;BA.debugLine="Private Sub GetOfflineAdsCount(data As Map) As Int";
 //BA.debugLineNum = 189;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 190;BA.debugLine="Dim ads As List = data.GetDefault(\"ads\", Null)";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("ads"),__c.Null)));
 //BA.debugLineNum = 191;BA.debugLine="If ads.IsInitialized = False Then Return 0";
if (_ads.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 192;BA.debugLine="Return ads.Size";
if (true) return _ads.getSize();
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getofflineplaylistids(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
anywheresoftware.b4a.objects.collections.List _playlistids = null;
anywheresoftware.b4a.objects.collections.Map _uniqueids = null;
anywheresoftware.b4a.objects.collections.List _schedules = null;
Object _scheduleobject = null;
anywheresoftware.b4a.objects.collections.Map _schedule = null;
anywheresoftware.b4a.objects.collections.List _slots = null;
Object _slotobject = null;
anywheresoftware.b4a.objects.collections.Map _slot = null;
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlist = null;
String _playlistid = "";
 //BA.debugLineNum = 152;BA.debugLine="Private Sub GetOfflinePlaylistIds(data As Map) As";
 //BA.debugLineNum = 153;BA.debugLine="Dim playlistIds As List";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 154;BA.debugLine="playlistIds.Initialize";
_playlistids.Initialize();
 //BA.debugLineNum = 155;BA.debugLine="If data.IsInitialized = False Then Return playlis";
if (_data.IsInitialized()==__c.False) { 
if (true) return _playlistids;};
 //BA.debugLineNum = 156;BA.debugLine="Dim uniqueIds As Map";
_uniqueids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 157;BA.debugLine="uniqueIds.Initialize";
_uniqueids.Initialize();
 //BA.debugLineNum = 158;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
 //BA.debugLineNum = 159;BA.debugLine="If schedules.IsInitialized = False Then Return pl";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return _playlistids;};
 //BA.debugLineNum = 160;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group8 = _schedules;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.Get(index8);
 //BA.debugLineNum = 161;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
 //BA.debugLineNum = 162;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
 //BA.debugLineNum = 163;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
 //BA.debugLineNum = 164;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 165;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group13 = _slots;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_slotobject = group13.Get(index13);
 //BA.debugLineNum = 166;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
 //BA.debugLineNum = 167;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
 //BA.debugLineNum = 168;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = _extractslotstreamdata(_slot);
 //BA.debugLineNum = 169;BA.debugLine="Dim playlists As List = streamData.GetDefault";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_streamdata.GetDefault((Object)("playlists"),__c.Null)));
 //BA.debugLineNum = 170;BA.debugLine="If playlists.IsInitialized = False Then Conti";
if (_playlists.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 171;BA.debugLine="For Each playlistObject As Object In playlist";
{
final anywheresoftware.b4a.BA.IterableList group19 = _playlists;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_playlistobject = group19.Get(index19);
 //BA.debugLineNum = 172;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
 //BA.debugLineNum = 173;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
 //BA.debugLineNum = 174;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
_playlistid = BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 175;BA.debugLine="If playlistId <> \"\" And uniqueIds.ContainsK";
if ((_playlistid).equals("") == false && _uniqueids.ContainsKey((Object)(_playlistid))==__c.False) { 
 //BA.debugLineNum = 176;BA.debugLine="uniqueIds.Put(playlistId, True)";
_uniqueids.Put((Object)(_playlistid),(Object)(__c.True));
 //BA.debugLineNum = 177;BA.debugLine="playlistIds.Add(playlistId)";
_playlistids.Add((Object)(_playlistid));
 };
 };
 }
};
 };
 }
};
 };
 }
};
 //BA.debugLineNum = 185;BA.debugLine="Return playlistIds";
if (true) return _playlistids;
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public String  _getofflineplaylistsdir() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Public Sub GetOfflinePlaylistsDir As String";
 //BA.debugLineNum = 126;BA.debugLine="Return File.Combine(storageDir, playlistsDirName)";
if (true) return __c.File.Combine(_storagedir,_playlistsdirname);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public int  _getofflineschedulescount(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
anywheresoftware.b4a.objects.collections.List _schedules = null;
 //BA.debugLineNum = 195;BA.debugLine="Private Sub GetOfflineSchedulesCount(data As Map)";
 //BA.debugLineNum = 196;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 197;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
 //BA.debugLineNum = 198;BA.debugLine="If schedules.IsInitialized = False Then Return 0";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 199;BA.debugLine="Return schedules.Size";
if (true) return _schedules.getSize();
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return 0;
}
public int  _getplaylisttrackcount(anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
anywheresoftware.b4a.objects.collections.List _tracks = null;
 //BA.debugLineNum = 357;BA.debugLine="Private Sub GetPlaylistTrackCount(playlistData As";
 //BA.debugLineNum = 358;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 359;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
 //BA.debugLineNum = 360;BA.debugLine="If tracks.IsInitialized = False Then Return 0";
if (_tracks.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 361;BA.debugLine="Return tracks.Size";
if (true) return _tracks.getSize();
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getstoredplaylistdescriptors() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub GetStoredPlaylistDescriptors As List";
 //BA.debugLineNum = 72;BA.debugLine="Return storage.GetDefault(\"playlist_descriptors\",";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_storage._getdefault /*Object*/ ("playlist_descriptors",(Object)(_createinitializedlist().getObject()))));
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _storagedirvalue,b4a.example.keyvaluestore _storagevalue,Object _targetmodulevalue,String _tracesubnamevalue,String _playerdatafilenamevalue,String _playlistrequirementsfilenamevalue,String _playlistsdirnamevalue,String _playlistcdnbaseurlvalue) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
 //BA.debugLineNum = 17;BA.debugLine="storageDir = storageDirValue";
_storagedir = _storagedirvalue;
 //BA.debugLineNum = 18;BA.debugLine="storage = storageValue";
_storage = _storagevalue;
 //BA.debugLineNum = 19;BA.debugLine="targetModule = targetModuleValue";
_targetmodule = _targetmodulevalue;
 //BA.debugLineNum = 20;BA.debugLine="traceSubName = traceSubNameValue";
_tracesubname = _tracesubnamevalue;
 //BA.debugLineNum = 21;BA.debugLine="playerDataFileName = playerDataFileNameValue";
_playerdatafilename = _playerdatafilenamevalue;
 //BA.debugLineNum = 22;BA.debugLine="playlistRequirementsFileName = playlistRequiremen";
_playlistrequirementsfilename = _playlistrequirementsfilenamevalue;
 //BA.debugLineNum = 23;BA.debugLine="playlistsDirName = playlistsDirNameValue";
_playlistsdirname = _playlistsdirnamevalue;
 //BA.debugLineNum = 24;BA.debugLine="playlistCdnBaseUrl = playlistCdnBaseUrlValue";
_playlistcdnbaseurl = _playlistcdnbaseurlvalue;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _invalidateplaylistplaybackorder(String _playlistid) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Private Sub InvalidatePlaylistPlaybackOrder(playli";
 //BA.debugLineNum = 293;BA.debugLine="If playlistId = \"\" Then Return";
if ((_playlistid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 294;BA.debugLine="storage.Remove(\"playlist_playback_manifest_\" & pl";
_storage._remove /*String*/ ("playlist_playback_manifest_"+_playlistid);
 //BA.debugLineNum = 295;BA.debugLine="storage.Remove(\"playlist_playback_cursor_\" & play";
_storage._remove /*String*/ ("playlist_playback_cursor_"+_playlistid);
 //BA.debugLineNum = 296;BA.debugLine="storage.Remove(\"playlist_track_index_\" & playlist";
_storage._remove /*String*/ ("playlist_track_index_"+_playlistid);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadofflinedata() throws Exception{
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _parsed = null;
 //BA.debugLineNum = 28;BA.debugLine="Public Sub LoadOfflineData As Map";
 //BA.debugLineNum = 29;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 30;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="If File.Exists(storageDir, playerDataFileName) =";
if (__c.File.Exists(_storagedir,_playerdatafilename)==__c.False) { 
if (true) return _data;};
 //BA.debugLineNum = 32;BA.debugLine="Try";
try { //BA.debugLineNum = 33;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 34;BA.debugLine="parser.Initialize(File.ReadString(storageDir, pl";
_parser.Initialize(__c.File.ReadString(_storagedir,_playerdatafilename));
 //BA.debugLineNum = 35;BA.debugLine="Dim parsed As Map = parser.NextObject";
_parsed = new anywheresoftware.b4a.objects.collections.Map();
_parsed = _parser.NextObject();
 //BA.debugLineNum = 36;BA.debugLine="If parsed.IsInitialized Then";
if (_parsed.IsInitialized()) { 
 //BA.debugLineNum = 37;BA.debugLine="data = parsed";
_data = _parsed;
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 40;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 41;BA.debugLine="Trace(\"данные плеера load ошибка message=\" & Las";
_trace("данные плеера load ошибка message="+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 43;BA.debugLine="Return data";
if (true) return _data;
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _normalizeofflinedata(anywheresoftware.b4a.objects.collections.Map _sourcedata,String _playercode,String _deviceid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _normalizeddata = null;
 //BA.debugLineNum = 137;BA.debugLine="Private Sub NormalizeOfflineData(sourceData As Map";
 //BA.debugLineNum = 138;BA.debugLine="Dim normalizedData As Map";
_normalizeddata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 139;BA.debugLine="normalizedData.Initialize";
_normalizeddata.Initialize();
 //BA.debugLineNum = 140;BA.debugLine="normalizedData.Put(\"ok\", sourceData.GetDefault(\"o";
_normalizeddata.Put((Object)("ok"),_sourcedata.GetDefault((Object)("ok"),(Object)(__c.False)));
 //BA.debugLineNum = 141;BA.debugLine="normalizedData.Put(\"type\", sourceData.GetDefault(";
_normalizeddata.Put((Object)("type"),_sourcedata.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 142;BA.debugLine="normalizedData.Put(\"updated\", sourceData.GetDefau";
_normalizeddata.Put((Object)("updated"),_sourcedata.GetDefault((Object)("updated"),(Object)("")));
 //BA.debugLineNum = 143;BA.debugLine="normalizedData.Put(\"saved_at\", DateTime.Now)";
_normalizeddata.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 144;BA.debugLine="normalizedData.Put(\"player_code\", playerCode)";
_normalizeddata.Put((Object)("player_code"),(Object)(_playercode));
 //BA.debugLineNum = 145;BA.debugLine="normalizedData.Put(\"device_id\", deviceId)";
_normalizeddata.Put((Object)("device_id"),(Object)(_deviceid));
 //BA.debugLineNum = 146;BA.debugLine="If sourceData.ContainsKey(\"player\") Then normaliz";
if (_sourcedata.ContainsKey((Object)("player"))) { 
_normalizeddata.Put((Object)("player"),_sourcedata.Get((Object)("player")));};
 //BA.debugLineNum = 147;BA.debugLine="If sourceData.ContainsKey(\"ads\") Then normalizedD";
if (_sourcedata.ContainsKey((Object)("ads"))) { 
_normalizeddata.Put((Object)("ads"),_sourcedata.Get((Object)("ads")));};
 //BA.debugLineNum = 148;BA.debugLine="If sourceData.ContainsKey(\"schedules\") Then norma";
if (_sourcedata.ContainsKey((Object)("schedules"))) { 
_normalizeddata.Put((Object)("schedules"),_sourcedata.Get((Object)("schedules")));};
 //BA.debugLineNum = 149;BA.debugLine="Return normalizedData";
if (true) return _normalizeddata;
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _normalizeofflineplaylistdata(anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
anywheresoftware.b4a.objects.collections.Map _normalizedplaylistdata = null;
String _key = "";
 //BA.debugLineNum = 345;BA.debugLine="Private Sub NormalizeOfflinePlaylistData(descripto";
 //BA.debugLineNum = 346;BA.debugLine="Dim normalizedPlaylistData As Map";
_normalizedplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 347;BA.debugLine="normalizedPlaylistData.Initialize";
_normalizedplaylistdata.Initialize();
 //BA.debugLineNum = 348;BA.debugLine="For Each key As String In playlistData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _playlistdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 349;BA.debugLine="normalizedPlaylistData.Put(key, playlistData.Get";
_normalizedplaylistdata.Put((Object)(_key),_playlistdata.Get((Object)(_key)));
 }
};
 //BA.debugLineNum = 351;BA.debugLine="normalizedPlaylistData.Put(\"id\", descriptor.GetDe";
_normalizedplaylistdata.Put((Object)("id"),_descriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 352;BA.debugLine="normalizedPlaylistData.Put(\"required_updated\", de";
_normalizedplaylistdata.Put((Object)("required_updated"),_descriptor.GetDefault((Object)("updated"),(Object)("")));
 //BA.debugLineNum = 353;BA.debugLine="normalizedPlaylistData.Put(\"saved_at\", DateTime.N";
_normalizedplaylistdata.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 354;BA.debugLine="Return normalizedPlaylistData";
if (true) return _normalizedplaylistdata;
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public String  _playlistmetadatafilename(String _playlistid) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Public Sub PlaylistMetadataFileName(playlistId As";
 //BA.debugLineNum = 130;BA.debugLine="Return playlistId & \".json\"";
if (true) return _playlistid+".json";
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _playlistmetadataurl(String _playlistid) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Public Sub PlaylistMetadataUrl(playlistId As Strin";
 //BA.debugLineNum = 134;BA.debugLine="Return playlistCdnBaseUrl & playlistId & \".json\"";
if (true) return _playlistcdnbaseurl+_playlistid+".json";
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _refreshplaylistcachestatus(anywheresoftware.b4a.objects.collections.List _playlistdescriptors) throws Exception{
anywheresoftware.b4a.objects.collections.Map _refreshedcachestatus = null;
 //BA.debugLineNum = 83;BA.debugLine="Public Sub RefreshPlaylistCacheStatus(playlistDesc";
 //BA.debugLineNum = 84;BA.debugLine="Dim refreshedCacheStatus As Map = CompareOfflineP";
_refreshedcachestatus = new anywheresoftware.b4a.objects.collections.Map();
_refreshedcachestatus = _compareofflineplaylistswithcache(_playlistdescriptors);
 //BA.debugLineNum = 85;BA.debugLine="storage.Put(\"playlist_download_ids\", refreshedCac";
_storage._put /*String*/ ("playlist_download_ids",_refreshedcachestatus.GetDefault((Object)("DownloadIds"),(Object)(_createinitializedlist().getObject())));
 //BA.debugLineNum = 86;BA.debugLine="storage.Put(\"playlist_missing_count\", refreshedCa";
_storage._put /*String*/ ("playlist_missing_count",_refreshedcachestatus.GetDefault((Object)("MissingCount"),(Object)(0)));
 //BA.debugLineNum = 87;BA.debugLine="storage.Put(\"playlist_outdated_count\", refreshedC";
_storage._put /*String*/ ("playlist_outdated_count",_refreshedcachestatus.GetDefault((Object)("OutdatedCount"),(Object)(0)));
 //BA.debugLineNum = 88;BA.debugLine="storage.Put(\"playlist_actual_count\", refreshedCac";
_storage._put /*String*/ ("playlist_actual_count",_refreshedcachestatus.GetDefault((Object)("ActualCount"),(Object)(0)));
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _resolveplaylistsyncaction(anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) throws Exception{
String _playlistid = "";
Object _cachedentryobject = null;
anywheresoftware.b4a.objects.collections.Map _cachedentry = null;
 //BA.debugLineNum = 92;BA.debugLine="Public Sub ResolvePlaylistSyncAction(descriptor As";
 //BA.debugLineNum = 93;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 94;BA.debugLine="If playlistId = \"\" Then Return \"skip\"";
if ((_playlistid).equals("")) { 
if (true) return "skip";};
 //BA.debugLineNum = 95;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId) =";
if (_cachedplaylistindex.ContainsKey((Object)(_playlistid))==__c.False) { 
if (true) return "missing";};
 //BA.debugLineNum = 96;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylistI";
_cachedentryobject = _cachedplaylistindex.Get((Object)(_playlistid));
 //BA.debugLineNum = 97;BA.debugLine="If cachedEntryObject Is Map Then";
if (_cachedentryobject instanceof java.util.Map) { 
 //BA.debugLineNum = 98;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
_cachedentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedentryobject));
 //BA.debugLineNum = 99;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> desc";
if ((_cachedentry.GetDefault((Object)("updated"),(Object)(""))).equals(_descriptor.GetDefault((Object)("updated"),(Object)(""))) == false) { 
if (true) return "outdated";};
 //BA.debugLineNum = 100;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistM";
if (__c.File.Exists(_getofflineplaylistsdir(),_playlistmetadatafilename(_playlistid))==__c.False) { 
if (true) return "missing";};
 //BA.debugLineNum = 101;BA.debugLine="Return \"skip\"";
if (true) return "skip";
 };
 //BA.debugLineNum = 103;BA.debugLine="Return \"missing\"";
if (true) return "missing";
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _savecachedplaylistindex(anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub SaveCachedPlaylistIndex(cachedPlaylistI";
 //BA.debugLineNum = 80;BA.debugLine="storage.Put(\"cached_playlist_index\", cachedPlayli";
_storage._put /*String*/ ("cached_playlist_index",(Object)(_cachedplaylistindex.getObject()));
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _saveofflinedata(anywheresoftware.b4a.objects.collections.Map _sourcedata,String _playercode,String _deviceid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _normalizeddata = null;
long _offlinedataupdatedat = 0L;
anywheresoftware.b4a.objects.collections.List _playlistids = null;
anywheresoftware.b4a.objects.collections.List _playlistdescriptors = null;
anywheresoftware.b4a.objects.collections.Map _playlistcachestatus = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _generator = null;
 //BA.debugLineNum = 47;BA.debugLine="Public Sub SaveOfflineData(sourceData As Map, play";
 //BA.debugLineNum = 48;BA.debugLine="Dim normalizedData As Map = NormalizeOfflineData(";
_normalizeddata = new anywheresoftware.b4a.objects.collections.Map();
_normalizeddata = _normalizeofflinedata(_sourcedata,_playercode,_deviceid);
 //BA.debugLineNum = 49;BA.debugLine="Dim offlineDataUpdatedAt As Long = DateTime.Now";
_offlinedataupdatedat = __c.DateTime.getNow();
 //BA.debugLineNum = 50;BA.debugLine="storage.Put(\"player_data_updated_at\", offlineData";
_storage._put /*String*/ ("player_data_updated_at",(Object)(_offlinedataupdatedat));
 //BA.debugLineNum = 51;BA.debugLine="storage.Put(\"player_data_source_updated\", normali";
_storage._put /*String*/ ("player_data_source_updated",_normalizeddata.GetDefault((Object)("updated"),(Object)("")));
 //BA.debugLineNum = 52;BA.debugLine="Dim playlistIds As List = GetOfflinePlaylistIds(n";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
_playlistids = _getofflineplaylistids(_normalizeddata);
 //BA.debugLineNum = 53;BA.debugLine="Dim playlistDescriptors As List = BuildOfflinePla";
_playlistdescriptors = new anywheresoftware.b4a.objects.collections.List();
_playlistdescriptors = _buildofflineplaylistdescriptors(_normalizeddata);
 //BA.debugLineNum = 54;BA.debugLine="Dim playlistCacheStatus As Map = CompareOfflinePl";
_playlistcachestatus = new anywheresoftware.b4a.objects.collections.Map();
_playlistcachestatus = _compareofflineplaylistswithcache(_playlistdescriptors);
 //BA.debugLineNum = 55;BA.debugLine="storage.Put(\"playlist_ids\", playlistIds)";
_storage._put /*String*/ ("playlist_ids",(Object)(_playlistids.getObject()));
 //BA.debugLineNum = 56;BA.debugLine="storage.Put(\"playlist_descriptors\", playlistDescr";
_storage._put /*String*/ ("playlist_descriptors",(Object)(_playlistdescriptors.getObject()));
 //BA.debugLineNum = 57;BA.debugLine="storage.Put(\"playlist_download_ids\", playlistCach";
_storage._put /*String*/ ("playlist_download_ids",_playlistcachestatus.GetDefault((Object)("DownloadIds"),(Object)(_createinitializedlist().getObject())));
 //BA.debugLineNum = 58;BA.debugLine="storage.Put(\"playlist_missing_count\", playlistCac";
_storage._put /*String*/ ("playlist_missing_count",_playlistcachestatus.GetDefault((Object)("MissingCount"),(Object)(0)));
 //BA.debugLineNum = 59;BA.debugLine="storage.Put(\"playlist_outdated_count\", playlistCa";
_storage._put /*String*/ ("playlist_outdated_count",_playlistcachestatus.GetDefault((Object)("OutdatedCount"),(Object)(0)));
 //BA.debugLineNum = 60;BA.debugLine="storage.Put(\"playlist_actual_count\", playlistCach";
_storage._put /*String*/ ("playlist_actual_count",_playlistcachestatus.GetDefault((Object)("ActualCount"),(Object)(0)));
 //BA.debugLineNum = 61;BA.debugLine="storage.Put(\"ad_count\", GetOfflineAdsCount(normal";
_storage._put /*String*/ ("ad_count",(Object)(_getofflineadscount(_normalizeddata)));
 //BA.debugLineNum = 62;BA.debugLine="storage.Put(\"schedule_count\", GetOfflineSchedules";
_storage._put /*String*/ ("schedule_count",(Object)(_getofflineschedulescount(_normalizeddata)));
 //BA.debugLineNum = 63;BA.debugLine="CleanupObsoletePlaylistMetadata(playlistDescripto";
_cleanupobsoleteplaylistmetadata(_playlistdescriptors);
 //BA.debugLineNum = 64;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 65;BA.debugLine="generator.Initialize(normalizedData)";
_generator.Initialize(_normalizeddata);
 //BA.debugLineNum = 66;BA.debugLine="File.WriteString(storageDir, playerDataFileName,";
__c.File.WriteString(_storagedir,_playerdatafilename,_generator.ToString());
 //BA.debugLineNum = 67;BA.debugLine="WriteOfflinePlaylistRequirementsFile(playlistDesc";
_writeofflineplaylistrequirementsfile(_playlistdescriptors,_playercode);
 //BA.debugLineNum = 68;BA.debugLine="Return normalizedData";
if (true) return _normalizeddata;
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public String  _saveplaylistmetadata(anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _playlistdata,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) throws Exception{
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _normalizedplaylistdata = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _generator = null;
anywheresoftware.b4a.objects.collections.Map _cachedentry = null;
 //BA.debugLineNum = 107;BA.debugLine="Public Sub SavePlaylistMetadata(descriptor As Map,";
 //BA.debugLineNum = 108;BA.debugLine="EnsureDirectory(GetOfflinePlaylistsDir)";
_ensuredirectory(_getofflineplaylistsdir());
 //BA.debugLineNum = 109;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 110;BA.debugLine="Dim normalizedPlaylistData As Map = NormalizeOffl";
_normalizedplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
_normalizedplaylistdata = _normalizeofflineplaylistdata(_descriptor,_playlistdata);
 //BA.debugLineNum = 111;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 112;BA.debugLine="generator.Initialize(normalizedPlaylistData)";
_generator.Initialize(_normalizedplaylistdata);
 //BA.debugLineNum = 113;BA.debugLine="File.WriteString(GetOfflinePlaylistsDir, Playlist";
__c.File.WriteString(_getofflineplaylistsdir(),_playlistmetadatafilename(_playlistid),_generator.ToString());
 //BA.debugLineNum = 114;BA.debugLine="Dim cachedEntry As Map";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 115;BA.debugLine="cachedEntry.Initialize";
_cachedentry.Initialize();
 //BA.debugLineNum = 116;BA.debugLine="cachedEntry.Put(\"id\", playlistId)";
_cachedentry.Put((Object)("id"),(Object)(_playlistid));
 //BA.debugLineNum = 117;BA.debugLine="cachedEntry.Put(\"updated\", descriptor.GetDefault(";
_cachedentry.Put((Object)("updated"),_descriptor.GetDefault((Object)("updated"),(Object)("")));
 //BA.debugLineNum = 118;BA.debugLine="cachedEntry.Put(\"saved_at\", DateTime.Now)";
_cachedentry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 119;BA.debugLine="cachedEntry.Put(\"title\", descriptor.GetDefault(\"t";
_cachedentry.Put((Object)("title"),_descriptor.GetDefault((Object)("title"),(Object)("")));
 //BA.debugLineNum = 120;BA.debugLine="cachedEntry.Put(\"track_count\", GetPlaylistTrackCo";
_cachedentry.Put((Object)("track_count"),(Object)(_getplaylisttrackcount(_normalizedplaylistdata)));
 //BA.debugLineNum = 121;BA.debugLine="cachedPlaylistIndex.Put(playlistId, cachedEntry)";
_cachedplaylistindex.Put((Object)(_playlistid),(Object)(_cachedentry.getObject()));
 //BA.debugLineNum = 122;BA.debugLine="InvalidatePlaylistPlaybackOrder(playlistId)";
_invalidateplaylistplaybackorder(_playlistid);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public String  _trace(String _message) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Private Sub Trace(message As String)";
 //BA.debugLineNum = 397;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,_targetmodule,_tracesubname)) { 
 //BA.debugLineNum = 398;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,_targetmodule,_tracesubname,(Object)(_message));
 };
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return "";
}
public String  _writeofflineplaylistrequirementsfile(anywheresoftware.b4a.objects.collections.List _descriptors,String _playercode) throws Exception{
anywheresoftware.b4a.objects.collections.Map _payload = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _generator = null;
 //BA.debugLineNum = 299;BA.debugLine="Private Sub WriteOfflinePlaylistRequirementsFile(d";
 //BA.debugLineNum = 300;BA.debugLine="Dim payload As Map";
_payload = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 301;BA.debugLine="payload.Initialize";
_payload.Initialize();
 //BA.debugLineNum = 302;BA.debugLine="payload.Put(\"saved_at\", DateTime.Now)";
_payload.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 303;BA.debugLine="payload.Put(\"player_code\", playerCode)";
_payload.Put((Object)("player_code"),(Object)(_playercode));
 //BA.debugLineNum = 304;BA.debugLine="payload.Put(\"descriptors\", descriptors)";
_payload.Put((Object)("descriptors"),(Object)(_descriptors.getObject()));
 //BA.debugLineNum = 305;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 306;BA.debugLine="generator.Initialize(payload)";
_generator.Initialize(_payload);
 //BA.debugLineNum = 307;BA.debugLine="File.WriteString(storageDir, playlistRequirements";
__c.File.WriteString(_storagedir,_playlistrequirementsfilename,_generator.ToString());
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
